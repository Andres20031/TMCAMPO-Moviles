B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Private MiConsecutivo As String
	Private Label8 As Label
	Dim Observacion As String
	Private Button1 As Button
	Dim fecha As String
	Dim area As String
	
	Private sf As StringFunctions
	Private Label11 As Label
	Private Panel20 As Panel
	
	
	Dim Fecha_Programa_LaborAntes As String

	Dim Area_Programa_LaborAntes As String
	Dim ObservacionAntes As String
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

Public Sub SetConsecutivo(Valor As String)
	MiConsecutivo = Valor
	If Label8.IsInitialized Then
		Label8.Text = MiConsecutivo
	End If
End Sub


'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("FormLaboresCampoA")
	
	
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Label1_Click
	B4XPages.ClosePage(Me)
End Sub




Private Sub Label11_Click
	Panel20.Visible = True
End Sub




Private Sub AS_DatePicker1_SelectedDateChanged(Date As Long)
	' Obtener la fecha seleccionada
	Dim formattedDate As String = DateTime.Date(Date)
    
	' Reemplazar cualquier '/' por '-' en caso de que la fecha sea en formato con '/'
	formattedDate = formattedDate.Replace("/", "-")
    
	' Agregar la parte de la hora
	formattedDate = formattedDate & " 00:00:00"
    
	' Mostrar la fecha formateada en el Label
	Label11.Text = formattedDate
    
	' Hacer invisible el Panel
	Panel20.Visible = False
    
	' Obtener la fecha y guardarla en la variable fecha
	fecha = formattedDate
    
	' Log para verificar el valor de la fecha
	Log(fecha)
End Sub


Private Sub EditText1_TextChanged (Old As String, New As String)
	area = New
	
	Log("EL area nueva es: "& area)
End Sub

Private Sub EditText3_TextChanged (Old As String, New As String)
	Observacion = New
	
	Log("la observacion es " & Observacion)
End Sub


Private Sub Button1_Click
	Log("El consecutivo: "&Label8.Text)
	' Inicializo la base de datos en un hilo de fondo
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	
'	Dim cmdSelect As DBCommand = CreateCommand("select_programalabores_consecutivo", Array(Label8.Text))
'	' Realiza la consulta de manera asíncrona
'	Wait For (Req.ExecuteQuery(cmdSelect, 0, Null)) JobDone(j2 As HttpJob)
'
'	' Manejo de la respuesta
'	If j2.Success Then
'		sf.Initialize
'		Req.HandleJobAsync(j2, "req")
'
'		Wait For (Req) req_Result(res As DBResult)
'
'		' Iteramos sobre los resultados
'		For Each row() As Object In res.Rows
'			
'			' Extraer el Fecha_Programa_Labor (String o Date)
'			Fecha_Programa_LaborAntes = row(4)
'
'			' Extraer el Area_Programa_Labor (money -> Double)
'			Area_Programa_LaborAntes  = row(6)
'			
'			'Extraer el Observacion
'			ObservacionAntes = row(7)
'			' Log para verificar los valores
'
'			Log("Fecha_Programa_LaborAntes: " & Fecha_Programa_LaborAntes)
'			Log("Area_Programa_LaborAntes: " & Area_Programa_LaborAntes)
'			Log("ObservacionAntes: "& ObservacionAntes)
'		Next
'	Else
'		Log("ERROR: " & j2.ErrorMessage)
'	End If
'	j2.Release
	
	Log("Fecha_Programa_LaborAntes: " & Fecha_Programa_LaborAntes)
	Log("Area_Programa_LaborAntes: " & Area_Programa_LaborAntes)
	Log("ObservacionAntes: "& ObservacionAntes)
	Log("FECHA: "&fecha)
	Log("AREA: "&area)
	Log("OBSERVACION: "&Observacion)
	
	sf.Initialize
	If (sf.Trim(fecha) = "" Or sf.Trim(area) = "" ) Then
		MsgboxAsync("Tienes algun campo vacio","Error")
	Else
		If (sf.Trim(Observacion) = "") Then
			Observacion = "N/A"
		End If
		If (sf.Trim(ObservacionAntes) = "") Then
			ObservacionAntes = "N/A"
		End If
		'**************** INSERTAR ***********************
		' Crear el comando con los parámetros
		Dim cmd As DBCommand = CreateCommand("programa_labores_aplazar", Array( Fecha_Programa_LaborAntes,Area_Programa_LaborAntes,ObservacionAntes,fecha,area,Observacion,"Aplazada",Label8.Text))
		' Ejecutar el comando
		Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
		Wait For(j) JobDone(j As HttpJob)
		' Manejar la respuesta
		Try
			If j.Success Then
				MsgboxAsync("Se ha aplazado correctamente.", "Éxito")
			Else
				Log("Error al ejecutar la consulta: " & j.ErrorMessage) ' Agregar más detalles si hay error en la solicitud
			End If
		Catch
			Log("Error al agregar datos: " & LastException.Message) ' Log del error con más detalles
		End Try
		'**************** FIN INSERTAR ***********************
	End If
	
End Sub

Private Sub Panel20_Click
	
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub
