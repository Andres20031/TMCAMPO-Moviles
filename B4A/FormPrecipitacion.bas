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
	Private Label3 As Label
	Private CustomListView1Geral As CustomListView
	Private Panel1geral As Panel
	Private Label13Time As Label
	Private SD_xComboBoxPluviometro As SD_xComboBox
	Private EditTextHoraFin As EditText
	Private Panel12 As Panel
	Private AS_DatePicker1 As AS_DatePicker
	Dim fecha As String
	
	Dim selectedCdgo_Plvmtro As String
	Dim selectedNombre_Plvmtro As String
	Dim selectedNit_Plvmtro As String
	Dim selectedHda_Pvlmtro As String
	Dim textoCapturado As String 
	Dim pluviometroMap As Map
	
	Private Dialog As B4XDialog
	Private Base As B4XView
	
	Private SwiftButtonPluvimetro As SwiftButton
	Private SearchTemplatePluvimetro As B4XSearchTemplate
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	'load the layout to Root
	Base = Root
	Dialog.Initialize (Base)
	Dialog.Title = "Buscador"
End Sub

Private Sub B4XPage_Appear
	utilClass.Initialize
	pluviometroMap.Initialize
	utilClass.SetStatusBarColor(Colors.White,0xB4008000)
	Root.LoadLayout("form")
	CustomListView1Geral.DefaultTextBackgroundColor=0xFF25253D
	CustomListView1Geral.DefaultTextColor=Colors.White
	CustomListView1Geral.Add(CreateItem,"formPreci")
	
	
	
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	
	
	
	SearchTemplatePluvimetro.Initialize
	
	Dim itemsPuvlimetro As List
	itemsPuvlimetro.Initialize
	itemsPuvlimetro.Add("Seleccionar:")
	'****************CONSULTAR MAQUINA******************'
	
	Dim cmdPluviometro As DBCommand = CreateCommand("select_maquina_pluviometros", Null)
	Wait For (Req.ExecuteQuery(cmdPluviometro, 0, Null)) JobDone(j2 As HttpJob)
	If j2.Success Then
		Req.HandleJobAsync(j2, "req_pluviometro")
		Wait For (Req) req_pluviometro_Result(resPluviometro As DBResult)
		For Each rowPluviometro() As Object In resPluviometro.Rows
			Dim cdgo_Plvmtro As String = rowPluviometro(0)
			Dim Nombre_Plvmtro As String = rowPluviometro(1)
			Dim Nit_Plvmtro As String = rowPluviometro(2)
			Dim Hda_Pvlmtro As String = rowPluviometro(3)
    
			' Agrega una entrada al Map con el código como clave y un Map de los datos como valor
			Dim detailsMap As Map
			detailsMap.Initialize
			detailsMap.Put("Nombre", Nombre_Plvmtro)
			detailsMap.Put("Nit", Nit_Plvmtro)
			detailsMap.Put("Hda", Hda_Pvlmtro)
    
			pluviometroMap.Put(cdgo_Plvmtro, detailsMap)
    
			' Agrega al ComboBox
			SD_xComboBoxPluviometro.Add(Nombre_Plvmtro, cdgo_Plvmtro)
			itemsPuvlimetro.Add(cdgo_Plvmtro&":"&Nombre_Plvmtro)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j2.ErrorMessage)
	End If
	SearchTemplatePluvimetro.SetItems(itemsPuvlimetro)
	j2.Release
	
End Sub


Private Sub CreateItem As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 92%Y)
	' Carga el diseño previamente definido llamado "" en el panel creado
	panel.LoadLayout("addPrecipitacionUI")
	panel.Height=Panel1geral.Height
	
	Return panel
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.
Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub


Private Sub Label1Back_Click
	B4XPages.ClosePage(Me)
End Sub

Private Sub Label2Save_Click
	
End Sub

Private Sub Label13Time_Click
	Panel12.Visible = True
End Sub

Private Sub SD_xComboBoxPluviometro_ItemClick (Position As Int, Value As Object)
	Log("VALOR COMBOBOX: " & Value)
    
	If pluviometroMap.ContainsKey(Value) Then
		Dim detailsMap As Map = pluviometroMap.Get(Value)
        
		selectedCdgo_Plvmtro = Value
		selectedNombre_Plvmtro = detailsMap.Get("Nombre")
		selectedNit_Plvmtro = detailsMap.Get("Nit")
		selectedHda_Pvlmtro = detailsMap.Get("Hda")
        
		' Verifica en el log los valores seleccionados
		Log("Código: " & selectedCdgo_Plvmtro)
		Log("Nombre: " & selectedNombre_Plvmtro)
		Log("NIT: " & selectedNit_Plvmtro)
		Log("Hacienda: " & selectedHda_Pvlmtro)
	Else
		Log("Error: No se encontraron detalles para el código seleccionado.")
	End If
End Sub


Private Sub AS_DatePicker1_SelectedDateChanged(Date As Long)
	' Obtener la fecha seleccionada
	Dim formattedDate As String = DateTime.Date(Date)
    
	' Reemplazar cualquier '/' por '-' en caso de que la fecha sea en formato con '/'
	formattedDate = formattedDate.Replace("/", "-")
    
	' Agregar la parte de la hora
	formattedDate = formattedDate & " 00:00:00"
    
	' Mostrar la fecha formateada en el Label
	Label13Time.Text = formattedDate
    
	' Hacer invisible el Panel
	Panel12.Visible = False
    
	' Obtener la fecha y guardarla en la variable fecha
	fecha = formattedDate
    
	' Log para verificar el valor de la fecha
	Log(fecha)
End Sub

Private Sub EditTextHoraFin_TextChanged (Old As String, New As String)
	Log("Texto anterior: " & Old)
	Log("Texto nuevo: " & New)
    
	' Puedes guardar el texto nuevo en una variable
	
    
	' Realizar acciones con el texto capturado
	 textoCapturado = New
	Log("El texto es mayor de 5 caracteres: " & textoCapturado)
	
End Sub

Private Sub Button1_Click
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)

	' Crear el comando con los parámetros
	Dim cmd As DBCommand = CreateCommand("insert.pluviometro", Array(selectedCdgo_Plvmtro,fecha,textoCapturado,selectedNit_Plvmtro,selectedHda_Pvlmtro))

	' Ejecutar el comando
	Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
	Wait For(j) JobDone(j As HttpJob)

	' Manejar la respuesta
	Try
		If j.Success Then
			MsgboxAsync("Se ha insertado correctamente.", "Éxito")
		Else
			Log("Error al ejecutar la consulta: " & j.ErrorMessage) ' Agregar más detalles si hay error en la solicitud
		End If
	Catch
		Log("Error al agregar datos: " & LastException.Message) ' Log del error con más detalles
	End Try
End Sub

Private Sub SwiftButtonPluvimetro_Click
	Wait For (Dialog.ShowTemplate(SearchTemplatePluvimetro, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonPluvimetro.xLBL.Text = SearchTemplatePluvimetro.SelectedItem
		Dim Partes() As String = Regex.Split(":", SearchTemplatePluvimetro.SelectedItem)
		selectedCdgo_Plvmtro = Partes(0) ' Código del Pluviómetro

		' Buscar los datos en el Map
		If pluviometroMap.ContainsKey(selectedCdgo_Plvmtro) Then
			Dim details As Map = pluviometroMap.Get(selectedCdgo_Plvmtro)
			selectedNombre_Plvmtro = details.Get("Nombre")
			selectedNit_Plvmtro = details.Get("Nit")
			selectedHda_Pvlmtro = details.Get("Hda")
            
			' Log para verificar los valores obtenidos
			Log("Código: " & selectedCdgo_Plvmtro)
			Log("Nombre: " & selectedNombre_Plvmtro)
			Log("NIT: " & selectedNit_Plvmtro)
			Log("Hacienda: " & selectedHda_Pvlmtro)
		Else
			Log("No se encontraron detalles para el código seleccionado.")
		End If
	End If
End Sub

