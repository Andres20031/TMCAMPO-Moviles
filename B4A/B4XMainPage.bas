B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
'#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private utilClass As util
	Private EditText2Pass As EditText
	Private EditText1Mail As EditText
	
	'CREATE PAGES
	Private menu_C As Menu
	Private ListPerson_C As ListPerson
	Private DetailsPerson_C As DetailsPerson
	Private FormPerson_C As FormPerson
	Private Form_C As Form
	Private listDados_C As ListDados
	Private FormMaquinaria_C As FormMaquinaria
	Private FormPrecipitacion_C As FormPrecipitacion
	Private FormLabores_C As FormLabores
	Private ListLabores_C As ListLabores
	Private FormProgramaCampo_C As FormProgramaCampo
	Private FormProgramaCampoCancelar_C As FormProgramaCampoCancelar
    Private FormProgramaCampoAplazar_C As FormProgramaCampoAplazar
	Private EditPerson_C As EditPerson

	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Dim parametrosUsuario As String=""
	
	Dim sf As StringFunctions
	sf.Initialize

	Private Panel1Precipitacion2 As B4XView
	Private pnlPrograma_de_labores As B4XView
	Private pnlPrecipitacion As B4XView
	Private pnlCosecha As B4XView
	Private pnlTaller As B4XView
	Private pnlPersonal As B4XView
	Private PnlMaquinaria As B4XView
	Private utilClass As util

	
End Sub

Public Sub Initialize
	B4XPages.GetManager.LogEvents = True
	B4XPages.GetManager.TransitionAnimationDuration = 0

End Sub

Private Sub B4XPage_Created(Root1 As B4XView)


	' Asigna el objeto B4XView a la variable Root
	Root = Root1
	' Carga el diseño "login" en la página
	Root.LoadLayout("login")

	' Inicializa la clase utilClass
	utilClass.Initialize

	' Configura el color de la barra de estado
	utilClass.SetStatusBarColor(0xB4008000,0xB4008000)

	' Configura el color de fondo de los campos de texto
	EditText1Mail.Color = Colors.Transparent
	EditText2Pass.Color = Colors.Transparent

	' Inicializa el objeto
	menu_C.Initialize
	ListPerson_C.Initialize
	DetailsPerson_C.Initialize
	FormPerson_C.Initialize
	Form_C.Initialize
	listDados_C.Initialize 
	FormMaquinaria_C.Initialize
	FormPrecipitacion_C.Initialize
	FormLabores_C.Initialize
	ListLabores_C.Initialize
	FormProgramaCampo_C.Initialize
	FormProgramaCampoCancelar_C.Initialize
	FormProgramaCampoAplazar_C.Initialize
	EditPerson_C.Initialize

	' Agrega una nueva página llamada "menu" y la crea
	B4XPages.AddPageAndCreate("menu", menu_C)
	' Agrega una nueva página llamada "ListPerson" y la crea
	B4XPages.AddPageAndCreate("ListPerson", ListPerson_C)
	' Agrega una nueva página llamada "DetailsPerson" y la crea
	B4XPages.AddPageAndCreate("DetailsPerson", DetailsPerson_C)
	' Agrega una nueva página llamada "FormPerson" y la crea	
	B4XPages.AddPageAndCreate("FormPerson", FormPerson_C)
	' Agrega una nueva página llamada "Form" y la crea
	B4XPages.AddPage("Form", Form_C)
	' Agrega una nueva página llamada "listDados" y la crea
	B4XPages.AddPageAndCreate("listDados", listDados_C)
	' Agregra una nueva página llamada "listMaquinaria" y la crea
	B4XPages.AddPageAndCreate("FormMaquinaria", FormMaquinaria_C)
	' Agregra una nueva página llamada "FormPrecipitacion" y la crea
	B4XPages.AddPageAndCreate("FormPrecipitacion", FormPrecipitacion_C)
	' Agregra una nueva página llamada "FormPrecipitacion" y la crea
	B4XPages.AddPageAndCreate("FormLabores", FormLabores_C)
	' Agregra una nueva página llamada "ListLabores" y la crea
	B4XPages.AddPageAndCreate("ListLabores", ListLabores_C)
	' Agregra una nueva página llamada "FormProgramaCampo" y la crea
	B4XPages.AddPageAndCreate("FormProgramaCampo", FormProgramaCampo_C)
	' Agregra una nueva página llamada "FormProgramaCampoCancelar" y la crea
	B4XPages.AddPageAndCreate("FormProgramaCampoCancelar", FormProgramaCampoCancelar_C)
	' Agregra una nueva página llamada "FormProgramaCampoCancelar" y la crea
	B4XPages.AddPageAndCreate("FormProgramaCampoAplazar", FormProgramaCampoAplazar_C)
	' Agregra una nueva página llamada "FormProgramaCampoCancelar" y la crea
	B4XPages.AddPageAndCreate("EditPerson", EditPerson_C)
	

'B4XPages.remove
End Sub

Sub B4XPage_Appear 
	'	B4XPages.ShowPage("Form")
End Sub

Private Sub Button1LOGIN_Click
	'Buscar usuario
	Dim usuario As String
	Dim contraseña As String


	usuario = EditText1Mail.text
	contraseña = EditText2Pass.text
	
	'valodat que los campos no esten vacios '
	If usuario = "" Or contraseña = "" Then
		MsgboxAsync("Usuario o contraseña invalido", "TM App")
		
	Else
		GetRecordUser(Main.pDBNameSeguridad,usuario)
		
		If Main.pNit = "890307964" Or Main.pNit = Null Then
			Panel1Precipitacion2.Enabled = False
			pnlPrograma_de_labores.Enabled = False
			pnlPrecipitacion.Enabled = False
			pnlCosecha.Enabled = False
			pnlTaller.Enabled = False
			PnlMaquinaria.Enabled = True
		End If

		'B4XPages.Delegate.Create_Menu("Menu")
		'B4XPages.ShowPage("Form")
		'B4XPages.ShowPage("ListDados")
	End If
	
End Sub

Sub GetRecordUser (UseDbUser As String, usuario As String)
	
	Dim req As DBRequestManager = CreateRequest(UseDbUser)
	Dim cmd As DBCommand = CreateCommand("select_usuarioApp", Array(usuario))
	
	Dim cadena As String
	Dim separador As String
	Dim longitud As Int
	
	Dim parts() As String
	
	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
		Msgbox("¿Está seguro que desea iniciar sesión?", "Confirmación") ' Título: "Confirmación"
'		Log("NIT: "&j.GetString)
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		If res.Rows.Size > 0 Then
			' Si se encontró el usuario y la contraseña coincide
			Main.pUser = sf.Trim(usuario)
			' Asigna valores necesarios aquí
			B4XPages.ShowPage("menu")
		Else
			' Usuario o contraseña incorrectos
			MsgboxAsync("Usuario o contraseña inválidos", "TM App")
		End If
		For Each row() As Object In res.Rows
			cadena = ""
			separador=" - "
			For Each record As Object In row
'				Log(record)
				cadena=cadena & record & separador
			Next
			parts = Regex.Split("-", cadena)
			Main.pUser = sf.Trim(usuario)
			Main.puserActivo = sf.Trim(parts(0))
			Main.pDBName  = sf.Trim(parts(1))
			Main.pNit = sf.Trim(parts(2))

			Main.pUserOpcionLabores = sf.Trim(parts(3))
			Main.pUserOpcionAgenda = sf.Trim(parts(4))
			Main.pUserOpcionMaquinaria = sf.Trim(parts(5))
			Main.pUserOpcionPluviometros = sf.Trim(parts(6))
			Main.pUserOpcionMonotoreo = sf.Trim(parts(7))

			longitud = cadena.Length
			cadena=cadena.SubString2(0, longitud - 3)
			If parametrosUsuario = cadena Then
				Log("Usuario: "&parametrosUsuario)
			Else
				cadena=""
			End If
		Next
	Else
		
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub

Sub CreateRequest (Db As String) As DBRequestManager
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" &  Main.pDBNameSeguridad)
	Return Req
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub




