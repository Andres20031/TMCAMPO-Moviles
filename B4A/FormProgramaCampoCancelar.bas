B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private MiConsecutivo As String
	Private Label8 As Label
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Dim observacion As String
	Private sf As StringFunctions
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
	Root.LoadLayout("FormLaboresCampoCancelar")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Label1_Click
   B4XPages.ClosePage(Me)
End Sub



Private Sub EditText3_TextChanged (Old As String, New As String)
	
	observacion = New
	
	Log(observacion)
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub

Private Sub Button1_Click
	
	Dim consecutivoInt As Int = MiConsecutivo
	Dim horaSistema As String = DateTime.Time(DateTime.Now)
	Dim fecha As Long = DateTime.Now
	DateTime.DateFormat = "yyyy-MM-dd HH:mm:ss"
	Dim fechaActual As String = DateTime.Date(fecha)
	

	Log("Fecha actual: " & fechaActual)  ' Muestra la fecha en el log
	Log("Hora actual: " & horaSistema)  ' Muestra la hora en el log
	Log("Observacion: " & observacion)
	Log("Cancelada")
	Log("ID" & consecutivoInt)
	
	sf.Initialize
	If (sf.Trim(observacion) = "" ) Then
		MsgboxAsync("Tienes algun campo vacio","Error")
	Else
		If (sf.Trim(observacion) = "") Then
			observacion = "N/A"
		End If
		
		Dim Req As DBRequestManager
		Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)

		' Crear el comando con los parámetros
		Dim cmd As DBCommand = CreateCommand("programa_labores_Cancelar", Array(fechaActual, horaSistema,observacion,"Cancelada",Label8.Text))

		' Ejecutar el comando
		Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
		Wait For(j) JobDone(j As HttpJob)

		' Manejar la respuesta
		Try
			If j.Success Then
				MsgboxAsync("Se ha cancelado correctamente.", "Éxito")
			Else
				Log("Error al ejecutar la consulta: " & j.ErrorMessage) ' Agregar más detalles si hay error en la solicitud
			End If
		Catch
			Log("Error al agregar datos: " & LastException.Message) ' Log del error con más detalles
		End Try
	End If
		
	
	
End Sub