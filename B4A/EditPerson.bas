B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private utilClass As util
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Private CLV_Editar As CustomListView
	Dim Fecha As String
	Private Label12Fecha As Label
	Private ButtonBuscar As Button
	Private Panel12 As Panel
	Private AS_DatePicker1 As AS_DatePicker
	Private PanelEdit As Panel
	Private CustomListView1Geral As CustomListView
	Private LabelLabores As Label
	Private ButtonGrabar As Button
	Private ButtonCancelar As Button
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root = Root1
	utilClass.Initialize
	utilClass.SetStatusBarColor(Colors.White,Colors.White)
	Root.LoadLayout("EditPersons")
	CustomListView1Geral.DefaultTextBackgroundColor=0xFF25253D
	CustomListView1Geral.DefaultTextColor=Colors.White
	CustomListView1Geral.Add(CreateItem,"EditPersons1")
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
Private Sub CreateItem As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)
    
	' Carga el diseño previamente definido llamado "addMaquinariaUI" en el panel creado
	panel.LoadLayout("CardInputEditPerson")
	
	panel.Height=PanelEdit.Height
	
	Return panel
End Sub

Private Sub LabelAtras_Click
	B4XPages.ClosePage(Me)
End Sub


Private Sub Label12Fecha_Click
	Panel12.Visible = True
End Sub

Private Sub ButtonBuscar_Click
	If Label12Fecha.Text = "" Then
		MsgboxAsync("Selecciona una fecha antes de buscar","Error")
	Else
		CustomListView1Geral.Clear
		CustomListView1Geral.Add(CreateItem,"EditPersons1")
		Label12Fecha.Text = Fecha
		
		Dim partesFecha() As String
		partesFecha = Regex.Split(" ", Fecha)
		Fecha = partesFecha(0)
		Log(Fecha)
		
		Dim counter As Int
		counter = 0
		' Inicializo la base de datos en un hilo de fondo
		Dim Req As DBRequestManager
		Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
		Dim cmd As DBCommand = CreateCommand("select_labores_Echas", Array As Object(Fecha))
		' Realiza la consulta de manera asíncrona
		Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
		' Manejo de la respuesta
		If j.Success Then
			Req.HandleJobAsync(j, "req")
			Wait For (Req) req_Result(res As DBResult)
			' Iteramos sobre los resultados
			For Each row() As Object In res.Rows
				' Extraer el CodigoEmple (Int)
				Dim CodigoEmple As String = row(0)

				' Extraer el NombreEmple (String)
				Dim NombreEmple As String = row(1)&" "&row(2)&" "&row(3)

				' Extraer el Nit (String)
				Dim Nit As String = row(4)

				' Extraer el Labor (String)
				Dim Labor As String = row(5)
				If Labor = "null" Then
					Labor = ""
				End If

				' Extraer el CodMotivo (String o Date)
				Dim CodMotivo As String = row(6)

				' Extraer el FechaMotivos (String)
				Dim FechaMotivos As String = row(7)


				Dim partesFecha() As String
				partesFecha = Regex.Split(" ", FechaMotivos)
				FechaMotivos = partesFecha(0)
				
				CustomListView1Geral.Add(CreateItemLabores(counter,CodigoEmple,NombreEmple,Nit,Labor,CodMotivo,FechaMotivos),counter)
				counter = counter + 1
			Next
		Else
			Log("ERROR: " & j.ErrorMessage)
		End If
		j.Release
		
		Dim cmd2 As DBCommand = CreateCommand("select_labores_NoEchas", Array As Object(Fecha))
		Wait For (Req.ExecuteQuery(cmd2, 0, Null)) JobDone(j2 As HttpJob)
		If j2.Success Then
			Req.HandleJobAsync(j2, "req_no")
			Wait For (Req) req_no_Result(resNo As DBResult)
			For Each rowNo() As Object In resNo.Rows
				' Extraer el CodigoEmple (Int)
				Dim CodigoEmple As String = row(0)
				' Extraer el NombreEmple (String)
				Dim NombreEmple As String = row(1)&" "&row(2)&" "&row(3)
				CustomListView1Geral.Add(CreateItemLabores(counter,CodigoEmple,NombreEmple,"N/A","N/A","N/A","N/A"),counter)
				counter = counter + 1
			Next
		End If
		
	End If
End Sub

Private Sub AS_DatePicker1_SelectedDateChanged(Date As Long)
	' Obtener la fecha seleccionada en el formato predeterminado
	DateTime.DateFormat = "dd-MM-yyyy"
	Dim formattedDate As String = DateTime.Date(Date)

	' Reemplazar cualquier '/' por '-' en caso de que la fecha esté en formato con '/'
	formattedDate = formattedDate.Replace("/", "-")

	' Usar Split para dividir la fecha
	Dim dateParts() As String = Regex.Split("-", formattedDate)

	' Verificar que la fecha esté en el formato dd-MM-yyyy
	If dateParts.Length = 3 Then
		' Reformatear la fecha como yyyy-MM-dd
		formattedDate = dateParts(2) & "-" & dateParts(1) & "-" & dateParts(0)
	End If

	' Agregar la parte de la hora
	formattedDate = formattedDate & " 00:00:00"

	' Mostrar la fecha formateada en el Label
	Label12Fecha.Text = formattedDate

	' Hacer invisible el Panel
	Panel12.Visible = False

	' Guardar la fecha en la variable pública
	Fecha = formattedDate

	' Mostrar el valor de la fecha en un log
	Log("Fecha: " & Fecha)
End Sub

Private Sub CreateItemLabores (Consecutivo As Int,CodigoEmple As String, NombreEmple As String, Nit As String, Labor As String, CodMotivo As String, FechaMotivos As String) As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 240dip)
	' Carga el diseño previamente definido llamado "Cardp" en el panel creado
	panel.LoadLayout("CardLaboresNoRe")
	Dim cs As CSBuilder
	cs.Initialize
	
	' Agrega el texto "Consecutivo: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Codigo Empleado: ").PopAll
	cs.Color(Colors.Black).Underline.Append(CodigoEmple & CRLF).PopAll
	' Agrega el texto "Consecutivo: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Nombre Empleado: ").PopAll
	cs.Color(Colors.Black).Underline.Append(NombreEmple & CRLF).PopAll
	' Agrega el texto "Consecutivo: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("NIT: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Nit & CRLF).PopAll
	' Agrega el texto "Consecutivo: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Labor: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Labor & CRLF).PopAll
	' Agrega el texto "Consecutivo: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Codigo Motivos: ").PopAll
	cs.Color(Colors.Black).Underline.Append(CodMotivo & CRLF).PopAll
	' Agrega el texto "Consecutivo: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Fecha: ").PopAll
	cs.Color(Colors.Black).Underline.Append(FechaMotivos & CRLF).PopAll
	
	LabelLabores.Text = cs
	ButtonGrabar.Tag = Consecutivo
	ButtonCancelar.Tag = Consecutivo
	
	Return panel
End Sub

Private Sub ButtonGrabar_Click
	
End Sub

Private Sub ButtonCancelar_Click
	
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub