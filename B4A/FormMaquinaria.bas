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
	Private CustomListView1Geral As CustomListView
	Private Panel1geral As Panel
	Private Label1Back As Label
	Private Label2Save As Label
	
	Private SD_xComboBoxMaquina As SD_xComboBox
	Private SD_xComboBoxLabor As SD_xComboBox
	Private SD_xComboBoxNit As SD_xComboBox
	Private SD_xComboBoxHacienda As SD_xComboBox
	Private SD_xComboBoxLote As SD_xComboBox
	Private SD_xComboBoxImplemento As SD_xComboBox
	Private SD_xComboBoxImplemento2 As SD_xComboBox
	Private SD_xComboBoxOperario As SD_xComboBox
	Private SD_xComboBoxObservaciones As SD_xComboBox
	
	
	Dim haciendaCBX As String
	
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	

	Private Panel2Time As Panel
	Private Label13Time As Label

	Private Panel12 As Panel
	
	'variables para el sql 
	Dim fecha As String
	Dim maquina As String
	Dim labor As String	
	Dim nitEmpresaCBX As String
	Dim haciendaCBX As String
	Dim Lote As String
	Dim implemento As String
	Dim implemento2 As String
	Dim operario As String
	Dim observaciones As String
	Dim horafin As String 
	Dim horainicio As String
	Dim combustible As String
	Dim area As String
	Dim horaActual As String
	Dim user As String
	Dim DeviceName As String
	Dim Ascdo_Maq_Mvto_Maq As String
	Private EditText1HoraInicio As EditText
	Private EditText2HoraFim As EditText
	Private EditText1 As EditText
	Private EditText2 As EditText
	Dim fechaHoy As String
	
	Private Dialog As B4XDialog
	Private Base As B4XView
	Private SwiftButtonMaquina As SwiftButton
	Private SearchTemplateMaquina As B4XSearchTemplate
	
	Private SwiftButtonLabor As SwiftButton
	Private SearchTemplateLabor As B4XSearchTemplate
	
	Private SwiftButtonNit As SwiftButton
	Private SearchTemplateNit As B4XSearchTemplate
	
	Private SwiftButtonHacienda As SwiftButton
	Private SearchTemplateHacienda As B4XSearchTemplate
	
	Private SwiftButtonLote As SwiftButton
	Private SearchTemplateLote As B4XSearchTemplate
	
	Private SwiftButtonImplemento As SwiftButton
	Private SearchTemplateImplemento As B4XSearchTemplate
	
	Private SwiftButtonImplemento2 As SwiftButton
	Private SearchTemplateImplemento2 As B4XSearchTemplate
	
	Private SwiftButtonOperario As SwiftButton
	Private SearchTemplateOperario As B4XSearchTemplate
	
	Private SwiftButtonObservaciones As SwiftButton
	Private SearchTemplateObservaciones As B4XSearchTemplate
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Base = Root
	Dialog.Initialize (Base)
	Dialog.Title = "Buscador"
End Sub

Sub GetDeviceName As String
	Dim p As Phone
	Dim Manufacturer As String = p.Manufacturer
	Dim Model As String = p.Model
	Return Manufacturer & " " & Model
End Sub

Private Sub B4XPage_Appear
	utilClass.Initialize
	utilClass.SetStatusBarColor(Colors.White,0xB4008000)
	Root.LoadLayout("form")
	CustomListView1Geral.DefaultTextBackgroundColor=0xFF25253D
	CustomListView1Geral.DefaultTextColor=Colors.White
	CustomListView1Geral.Add(CreateItem,"form1")
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	
	'****************CONSULTAR MAQUINA************'
	SearchTemplateMaquina.Initialize
	
	Dim itemsMaquina As List
	itemsMaquina.Initialize
	itemsMaquina.Add("Seleccionar:")
	
	Dim cmdMaquina As DBCommand = CreateCommand("select_maquina", Null)
	Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null)) JobDone(j2 As HttpJob)
	If j2.Success Then
		Req.HandleJobAsync(j2, "req_maquina")
		Wait For (Req) req_maquina_Result(resMaquina As DBResult)
		For Each rowMaquina() As Object In resMaquina.Rows
			Dim codigoMaquina As String = rowMaquina(0) ' Cdgo_Dstno
			Dim descripcionMaquina As String = rowMaquina(1) ' Dscrpcion_Dstno
			SD_xComboBoxMaquina.Add(descripcionMaquina, codigoMaquina)
			itemsMaquina.Add(codigoMaquina&":"&descripcionMaquina)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j2.ErrorMessage)
	End If
	SearchTemplateMaquina.SetItems(itemsMaquina)
	j2.Release
	
	
	'***************FIN CONSULTAR  MAQUINA*****************'
	
	'***************CONSULTAR LABOR***************'
	SearchTemplateLabor.Initialize
	
	Dim itemsLaborMaquina As List
	itemsLaborMaquina.Initialize
	itemsLaborMaquina.Add("Seleccionar:")
	
	Dim cmdLaborMaquina As DBCommand = CreateCommand("select_labor_maq", Null)
	Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Null)) JobDone(j3 As HttpJob)
	If j3.Success Then
		Req.HandleJobAsync(j3, "req_labormaquina")
		Wait For (Req) req_labormaquina_Result(resLaborMaquina As DBResult)
		For Each rowLaborMaquina() As Object In resLaborMaquina.Rows
			Dim codigoLaborMaquina As String = rowLaborMaquina(0) ' Cdgo_Dstno
			Dim descripcionLaborMaquina As String = rowLaborMaquina(1) ' Dscrpcion_Dstno
			SD_xComboBoxLabor.Add(descripcionLaborMaquina, codigoLaborMaquina)
			itemsLaborMaquina.Add(codigoLaborMaquina&":"&descripcionLaborMaquina)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j3.ErrorMessage)
	End If
	SearchTemplateLabor.SetItems(itemsLaborMaquina)
	j3.Release
	'**************FIN CONSULTAR LABOR****************************'
	
	'*************CONSULTAR NIT******************'
	SearchTemplateNit.Initialize
	
	Dim itemsNit As List
	itemsNit.Initialize
	itemsNit.Add("Seleccionar:")
	
	Dim cmd As DBCommand = CreateCommand("select_nit", Null)
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		For Each row() As Object In res.Rows
			Dim razonSocial As String = row(0)
			Dim nit As String = row(1)
			SD_xComboBoxNit.Add(razonSocial & " - " & nit, nit)
			itemsNit.Add(nit&":"&razonSocial)
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	SearchTemplateNit.SetItems(itemsNit)
	j.Release
	'****************FIN CONSULTAR NIT**************'
	
	'*****************CONSULTAR IMPLEMENTOS***************'
	SearchTemplateImplemento.Initialize
	SearchTemplateImplemento2.Initialize
	
	Dim itemsImplemento As List
	itemsImplemento.Initialize
	itemsImplemento.Add("Seleccionar:")
	
	Dim cmdImple As DBCommand = CreateCommand("select_implemento", Null)
	Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) JobDone(j4 As HttpJob)
	If j4.Success Then
		Req.HandleJobAsync(j4, "req_imple")
		Wait For (Req) req_imple_Result(resImple As DBResult)
		For Each rowImple() As Object In resImple.Rows
			Dim codigoImple As String = rowImple(0) ' Cdgo_Dstno
			Dim descripcionImple As String = rowImple(1) ' Dscrpcion_Dstno
			SD_xComboBoxImplemento.Add(descripcionImple, codigoImple)
			SD_xComboBoxImplemento2.Add(descripcionImple, codigoImple)
			itemsImplemento.Add(codigoImple&":"&descripcionImple)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j4.ErrorMessage)
	End If
	SearchTemplateImplemento.SetItems(itemsImplemento)
	SearchTemplateImplemento2.SetItems(itemsImplemento)
	j4.Release
	'****************FIN CONSULTAR IMPLEMENTOS******************'
	
	'***************CONSULTAR OPERARIO***********************'
	SearchTemplateOperario.Initialize
	
	Dim itemsOperario As List
	itemsOperario.Initialize
	itemsOperario.Add("Seleccionar:")
	
	Dim cmdOper As DBCommand = CreateCommand("select_operario", Null)
	Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) JobDone(j5 As HttpJob)
	If j5.Success Then
		Req.HandleJobAsync(j5, "req_oper")
		Wait For (Req) req_oper_Result(resOper As DBResult)
		For Each rowOper() As Object In resOper.Rows
			Dim codigoOper As String = rowOper(0) 
			Dim apellido1 As String = rowOper(1)
			Dim apellido2 As String = rowOper(2)
			Dim nombre As String = rowOper(3)
			SD_xComboBoxOperario.Add(apellido1&" "&apellido2&" "&nombre ,codigoOper)
			itemsOperario.Add(codigoOper&":"&apellido1&" "&apellido2&" "&nombre)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j5.ErrorMessage)
	End If
	SearchTemplateOperario.SetItems(itemsOperario)
	j5.Release
	'***************FIN CONSULTAR OPERARIO********************'
	
	'***************CONSULTAR OBSERVACIONES*******************'
	SearchTemplateObservaciones.Initialize
	
	Dim itemsObservaciones As List
	itemsObservaciones.Initialize
	itemsObservaciones.Add("Seleccionar:")
	Dim cmdObser As DBCommand = CreateCommand("select_observaciones", Null)
	Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) JobDone(j6 As HttpJob)
	If j6.Success Then
		Req.HandleJobAsync(j6, "req_obser")
		Wait For (Req) req_obser_Result(resObser As DBResult)
		For Each rowObser() As Object In resObser.Rows
			Dim codigoObser As String = rowObser(0)
			Dim desObser As String = rowObser(1)
			SD_xComboBoxObservaciones.Add(desObser ,codigoObser)
			itemsObservaciones.Add(codigoObser&":"&desObser)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j6.ErrorMessage)
	End If
	SearchTemplateObservaciones.SetItems(itemsObservaciones)
	j6.Release
	'**************FIN CONSULTAR OBSERVACIONES****************'
	
	SearchTemplateHacienda.Initialize
	
	SearchTemplateLote.Initialize
	
	
End Sub

Private Sub SD_xComboBoxNit_ItemClick (Position As Int, Value As Object)
	nitEmpresaCBX=Value
	SD_xComboBoxHacienda.Clear
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	Dim cmd As DBCommand = CreateCommand("select_haciendas", Array(Value))

	' Ejecuta la consulta
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)

	' Verificar si la consulta fue exitosa
	If j.Success Then
		' Maneja el resultado de la consulta
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)

    
		' Llenar el ComboBox con NITs y razones sociales
		For Each row() As Object In res.Rows
			Dim Codg_Hacienda As String = row(0)
			Dim NombreHacienda As String = row(1)
        
			' Agregar la información al ComboBox (ajusta según el formato requerido)
			SD_xComboBoxHacienda.Add(NombreHacienda, Codg_Hacienda)
		Next
    
	Else
		' Si hay un error, muestra el mensaje
		Log("Error: " & j.ErrorMessage)
	End If
	' Libera el trabajo HTTP
	j.Release
	' FIN DE LA CONSULTA DE LOS NITS
End Sub

Private Sub SD_xComboBoxHacienda_ItemClick (Position As Int, Value As Object)
	haciendaCBX=Value

	SD_xComboBoxLote.Clear
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	Dim cmd As DBCommand = CreateCommand("select_lotes", Array(nitEmpresaCBX,haciendaCBX))

	' Ejecuta la consulta
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)

	' Verificar si la consulta fue exitosa
	If j.Success Then
		' Maneja el resultado de la consulta
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)

    
		' Llenar el ComboBox con NITs y razones sociales
		For Each row() As Object In res.Rows
			Dim Codg_Hacienda As String = row(0)
        
			' Agregar la información al ComboBox (ajusta según el formato requerido)
			SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacienda)
		Next
    
	Else
		' Si hay un error, muestra el mensaje
		Log("Error: " & j.ErrorMessage)
	End If

	' Libera el trabajo HTTP
	j.Release
	' FIN DE LA CONSULTA DE LOS NITS
End Sub

Private Sub CreateItem As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)
    
	' Carga el diseño previamente definido llamado "addMaquinariaUI" en el panel creado
	panel.LoadLayout("addMaquinariaUI")
	
	panel.Height=Panel1geral.Height
	
	Return panel
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.





Private Sub Label13Time_Click
	Panel12.Visible = True
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

End Sub




Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub


Private Sub SD_xComboBoxMaquina_ItemClick (Position As Int, Value As Object)
	maquina =Value
	
	
End Sub

Private Sub SD_xComboBoxLabor_ItemClick (Position As Int, Value As Object)
	labor = Value
End Sub

Private Sub SD_xComboBoxLote_ItemClick (Position As Int, Value As Object)
	Lote = Value
	Log(Lote)
End Sub

Private Sub SD_xComboBoxImplemento_ItemClick (Position As Int, Value As Object)
	implemento = Value
	

End Sub

Private Sub SD_xComboBoxImplemento2_ItemClick (Position As Int, Value As Object)
	implemento2 = Value

End Sub

Private Sub SD_xComboBoxOperario_ItemClick (Position As Int, Value As Object)
	operario =Value

End Sub

Private Sub SD_xComboBoxObservaciones_ItemClick (Position As Int, Value As Object)
	observaciones = Value
	

End Sub

Private Sub Button1_Click
'	
    Ascdo_Maq_Mvto_Maq = "CP"

	horainicio = EditText1HoraInicio.Text
	horafin = EditText2HoraFim.Text
	combustible = EditText1.Text
	area = EditText2.Text
	user = Main.pUser

	fechaHoy = DateTime.Date(DateTime.Now) ' Esto te da la fecha en formato "yyyy-MM-dd"
	fechaHoy = fechaHoy.Replace("/", "-") ' Reemplazar cualquier "/" por "-"
    fechaHoy = fechaHoy & " 00:00:00" ' Agregar la hora al final
	
	horaActual = DateTime.Time(DateTime.Now)
	DeviceName = GetDeviceName
	
	Log("Ascdo_Maq_Mvto_Maq: " & Ascdo_Maq_Mvto_Maq)
	Log("maquina: " & maquina)
	Log("fecha: " & fecha)
	Log("labor: " & labor)
	Log("nitEmpresaCBX: " & nitEmpresaCBX)
	Log("haciendaCBX: " & haciendaCBX)
	Log("Lote: " & Lote)
	Log("implemento: " & implemento)
	Log("horainicio: " & horainicio)
	Log("horafin: " & horafin)
	Log("combustible: " & combustible)
	Log("observaciones: " & observaciones)
	Log("operario: " & operario)
	Log("implemento2: " & implemento2)
	Log("area: " & area)
	Log("fechaHoy: " & fechaHoy)
	Log("horaActual: " & horaActual)
	Log("user: " & user)
	Log("DeviceName: " & DeviceName)

	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)

	' Crear el comando con los parámetros
	Dim cmd As DBCommand = CreateCommand("insert_Mvto_Maq", Array(Ascdo_Maq_Mvto_Maq, maquina, fecha, labor, nitEmpresaCBX, haciendaCBX, Lote, implemento, horainicio, horafin, combustible, observaciones, operario, implemento2, area, fechaHoy, horaActual, user , DeviceName))

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

Private Sub Label1Back_Click
	B4XPages.ClosePage(Me)
End Sub

Private Sub SwiftButtonMaquina_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateMaquina, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonMaquina.xLBL.Text = SearchTemplateMaquina.SelectedItem
        
		' Verificar si el texto contiene ":"
		If SearchTemplateMaquina.SelectedItem.Contains(":") Then
			Dim Partes() As String = Regex.Split(":", SearchTemplateMaquina.SelectedItem)
			maquina = Partes(0) ' Asignar solo la primera parte
            
			Log("Máquina seleccionada: " & maquina)
		Else
			Log("El texto no contiene ':' por lo que no se pudo dividir.")
			maquina = SearchTemplateMaquina.SelectedItem ' Asignar el valor completo en caso de fallo
		End If
	End If
End Sub


Private Sub SwiftButtonLabor_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateLabor, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonLabor.xLBL.Text = SearchTemplateLabor.SelectedItem
        
		' Verificar si el texto contiene ":"
		If SearchTemplateLabor.SelectedItem.Contains(":") Then
			Dim Partes() As String = Regex.Split(":", SearchTemplateLabor.SelectedItem)
			labor = Partes(0) ' Asignar solo la primera parte
            
			' Registrar en el log para verificar los valores obtenidos
			Log("Texto completo: " & SearchTemplateLabor.SelectedItem)
			Log("Labor seleccionada: " & labor)
		Else
			Log("El texto no contiene ':' por lo que no se pudo dividir.")
			labor = SearchTemplateLabor.SelectedItem ' Asignar el valor completo en caso de fallo
		End If
	End If
	Log(labor)
End Sub

Private Sub SwiftButtonNit_Click
	Dim ItemsHacienda As List
	ItemsHacienda.Initialize
	Wait For (Dialog.ShowTemplate(SearchTemplateNit, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonNit.xLBL.Text = SearchTemplateNit.SelectedItem
		Dim NITCOMPLETO As String = SearchTemplateNit.SelectedItem
		Dim Partes() As String = Regex.Split(":", NITCOMPLETO)
		nitEmpresaCBX = Partes(0)
		ItemsHacienda.Clear
		ItemsHacienda.Add("Seleccionar:")
		SwiftButtonHacienda.xLBL.Text = ""
		'************** INICIO CONSULTA HACIENDA **************
		Dim Req As DBRequestManager
		Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
		Dim cmd As DBCommand = CreateCommand("select_haciendas", Array(nitEmpresaCBX))

		' Ejecuta la consulta
		Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)

		' Verificar si la consulta fue exitosa
		If j.Success Then
			' Maneja el resultado de la consulta
			Req.HandleJobAsync(j, "req")
			Wait For (Req) req_Result(res As DBResult)

    
			' Llenar el ComboBox con NITs y razones sociales
			For Each row() As Object In res.Rows
				Dim Codg_Hacienda As String = row(0)
				Dim NombreHacienda As String = row(1)
        
				' Agregar la información al ComboBox (ajusta según el formato requerido)
				
				
				ItemsHacienda.Add(Codg_Hacienda&":"&NombreHacienda)
			Next
    
		Else
			' Si hay un error, muestra el mensaje
			Log("Error: " & j.ErrorMessage)
		End If
		SearchTemplateHacienda.SetItems(ItemsHacienda)
		SwiftButtonHacienda.Enabled = True
		Log(nitEmpresaCBX)
		' Libera el trabajo HTTP
		j.Release
		'*********** FIN CONSULTA HACIENDA **************'
	End If
End Sub

Private Sub SwiftButtonHacienda_Click
	Dim ItemsLote As List
	ItemsLote.Initialize
	
	Wait For (Dialog.ShowTemplate(SearchTemplateHacienda, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonHacienda.xLBL.Text = SearchTemplateHacienda.SelectedItem
		Dim HACIENDACOMPLETO As String = SearchTemplateHacienda.SelectedItem
		Dim Partes() As String = Regex.Split(":", HACIENDACOMPLETO)
		haciendaCBX = Partes(0)
		ItemsLote.Clear
		ItemsLote.Add("Seleccionar:")
		SwiftButtonLote.xLBL.Text = ""
		'***************** INICIO CONSULTA LOTE ************************
		Dim Req As DBRequestManager
		Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
		Dim cmd As DBCommand = CreateCommand("select_lotes", Array(nitEmpresaCBX,haciendaCBX))

		' Ejecuta la consulta
		Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)

		' Verificar si la consulta fue exitosa
		If j.Success Then
			' Maneja el resultado de la consulta
			Req.HandleJobAsync(j, "req")
			Wait For (Req) req_Result(res As DBResult)

    
			' Llenar el ComboBox con NITs y razones sociales
			For Each row() As Object In res.Rows
				Dim Codg_Hacienda As String = row(0)
        
				' Agregar la información al ComboBox (ajusta según el formato requerido)
				
				ItemsLote.Add(Codg_Hacienda)
			Next
    
		Else
			' Si hay un error, muestra el mensaje
			Log("Error: " & j.ErrorMessage)
		End If
		SearchTemplateLote.SetItems(ItemsLote)
		SwiftButtonLote.Enabled = True
		' Libera el trabajo HTTP
		Log(haciendaCBX)
		j.Release
		'***************** FIN CONSULTA LOTE ************************
	End If
End Sub

Private Sub SwiftButtonLote_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateLote, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonLote.xLBL.Text = SearchTemplateLote.SelectedItem
        
		Dim Partes() As String = Regex.Split(":", SearchTemplateLote.SelectedItem)
		Lote= Partes(0) ' Asignar solo la primera parte
	End If
	Log(Lote)
End Sub


Private Sub SwiftButtonImplemento_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateImplemento, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonImplemento.xLBL.Text = SearchTemplateImplemento.SelectedItem
        
		' Verificar si el texto contiene ":"
		If SearchTemplateImplemento.SelectedItem.Contains(":") Then
			Dim Partes() As String = Regex.Split(":", SearchTemplateImplemento.SelectedItem)
			implemento = Partes(0) ' Asignar solo la primera parte
            
	
			Log("Implemento seleccionado: " & implemento)
		Else
			Log("El texto no contiene ':' por lo que no se pudo dividir.")
			implemento = SearchTemplateImplemento.SelectedItem ' Asignar el valor completo en caso de fallo
		End If
	End If
End Sub


Private Sub SwiftButtonImplemento2_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateImplemento2, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonImplemento2.xLBL.Text = SearchTemplateImplemento2.SelectedItem
        
		' Verificar si el texto contiene ":"
		If SearchTemplateImplemento2.SelectedItem.Contains(":") Then
			Dim Partes() As String = Regex.Split(":", SearchTemplateImplemento2.SelectedItem)
			implemento2 = Partes(0) ' Asignar solo la primera parte

			Log("Implemento2 seleccionado: " & implemento2)
		Else
			Log("El texto no contiene ':' por lo que no se pudo dividir.")
			implemento2 = SearchTemplateImplemento2.SelectedItem ' Asignar el valor completo en caso de fallo
		End If
	End If
End Sub


Private Sub SwiftButtonOperario_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateOperario, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonOperario.xLBL.Text = SearchTemplateOperario.SelectedItem
        
		' Verificar si el texto contiene ":"
		If SearchTemplateOperario.SelectedItem.Contains(":") Then
			Dim Partes() As String = Regex.Split(":", SearchTemplateOperario.SelectedItem)
			operario = Partes(0) ' Asignar solo la primera parte
            
		
			Log("Operario seleccionado: " & operario)
		Else
			Log("El texto no contiene ':' por lo que no se pudo dividir.")
			operario = SearchTemplateOperario.SelectedItem ' Asignar el valor completo en caso de fallo
		End If
	End If
End Sub


Private Sub SwiftButtonObservaciones_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateObservaciones, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonObservaciones.xLBL.Text = SearchTemplateObservaciones.SelectedItem
        
		' Separar el texto por ":" y asignar la primera parte
		Dim Partes() As String = Regex.Split(":", SearchTemplateObservaciones.SelectedItem)
		Dim observaciones As String = Partes(0) ' Guardar solo la primera parte

		' Registrar en el log para depuración
		
		Log("Primera parte (observacionCBX): " & observaciones)
	Else
		Log("Operación cancelada por el usuario.")
	End If
End Sub

