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
	Private Label13Time As Label
	Private Label14Time As Label
	Private Panel3 As Panel
	Private Panel12 As Panel
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Dim fechaInicio As String
	Dim fechaFin As String
	Dim fechafmrto As String
	Dim horaSistema As String

	Private loteCBX As String
	Private elementoLabor As String
	Private elementoGasto As String
	Private areaLabor As Int
	Private areaLote As Int
	Dim consecutivo As Int
	Private tipoLabor As String
	
	Dim haciendaCBX As String
	Dim nitEmpresaCBX As String
	
	Private Panel2geral As Panel
	Private SD_xComboBoxTipoRiego As SD_xComboBox
	
	Private Panel3geral As Panel
	Private SD_xComboBoxCodigoVariedad As SD_xComboBox
	Private SD_xComboBoxTipoLabranza As SD_xComboBox
	
	Private cantidadInsumos As Int
	
	Private SD_xComboBoxInsumo As SD_xComboBox
	Private EditTextCantidadInsumo As EditText
	Private ButtonAddInsumo As Button
	Private ButtonDeleteInsumo As Button
	Private Panel0geral As Panel
	
	Private IDINSUMO As String
	Private NAMEINSUMO As String
	Private CANTINSUMO As String
	
	Private LabelCantidadInsumos As Label
	Private B4XTable1 As B4XTable
	Private data As List
	
	Private PanelInsumoSelect As Panel
	Private PanelTittleInsumo As Panel
	Private LabelInsumoSelect As Label
	
	Dim idEliminarTabla As Int
	
	Dim tipoRiego As String
	Dim procedenciaRiego As String
	Dim caudalRiego As String
	Dim cantidadRiego As String
	
	Dim codigoSiembra As String
	Dim distanciaSiembra As Int
	Dim bandereoSiembra As Int
	Dim toneladaSemillaSiembra As Int
	Dim procedenciaSiembra As String
	Dim tipoLabranzaSiembra As String
	Dim numeroPaquetesSiembra As Int
	Dim numeroMacolloSiembra As Int
	
	Dim DeviceName As String
	Dim user As String

	Dim fechaActual As String
	Dim consecutivoSiembra As Int
	
	
	Private Dialog As B4XDialog
	Private Base As B4XView
	Private SwiftButtonNit As SwiftButton
	Private SearchTemplateNit As B4XSearchTemplate
	Private SwiftButtonHacienda As SwiftButton
	Private SearchTemplateHacienda As B4XSearchTemplate
	Private SwiftButtonLote As SwiftButton
	Private SearchTemplateLote As B4XSearchTemplate
	Private SwiftButtonLabor As SwiftButton
	Private SearchTemplateLabor As B4XSearchTemplate
	Private SwiftButtonElemento As SwiftButton
	Private SearchTemplateElemento As B4XSearchTemplate
	Private SwiftButtonTypeForm As SwiftButton
	Private SearchTemplateTypeForm As B4XSearchTemplate
	Private SwiftButtonInsumo As SwiftButton
	Private SearchTemplateInsumo As B4XSearchTemplate
	Private SwiftButtonRiego As SwiftButton
	Private SearchTemplateRiego As B4XSearchTemplate
	Private SwiftButtonTipoLabranza As SwiftButton
	Private SearchTemplateTipoLabranza As B4XSearchTemplate
	Private SwiftButtonVariedad As SwiftButton
	Private SearchTemplateVariedad As B4XSearchTemplate
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
	
	
	
	
	'****************CONSULTAR NIT************'
	'******Inicializo el Search Template
	SearchTemplateNit.Initialize
	'******Creo una Lista para los Nit
	Dim ItemsNit As List
	ItemsNit.Initialize
	ItemsNit.Add("Seleccionar:")
	

	Dim cmd As DBCommand = CreateCommand("select_nit", Null)
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		For Each row() As Object In res.Rows
			Dim razonSocial As String = row(0)
			Dim nit As String = row(1)
			ItemsNit.Add(nit&":"&razonSocial )
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	SearchTemplateNit.SetItems(ItemsNit)
	j.Release
	'*************FIN CONSULTAR NIT***************'
	
	SearchTemplateHacienda.Initialize
	
	SearchTemplateLote.Initialize
	
	
	
	'****************CONSULTAR LABOR**************'
	SearchTemplateLabor.Initialize
	'*********Creo una Lista para las labores
	Dim ItemsLabor As List
	ItemsLabor.Initialize
	ItemsLabor.Add("Seleccionar:")
	

	Dim cmdLaborMaquina As DBCommand = CreateCommand("select_labor_maq", Null)
	Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Null)) JobDone(j3 As HttpJob)
	If j3.Success Then
		Req.HandleJobAsync(j3, "req_labormaquina")
		Wait For (Req) req_labormaquina_Result(resLaborMaquina As DBResult)
		For Each rowLaborMaquina() As Object In resLaborMaquina.Rows
			Dim codigoLaborMaquina As String = rowLaborMaquina(0) ' Cdgo_Dstno
			Dim descripcionLaborMaquina As String = rowLaborMaquina(1) ' Dscrpcion_Dstno
			ItemsLabor.Add(codigoLaborMaquina&":"&descripcionLaborMaquina)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j3.ErrorMessage)
	End If
	SearchTemplateLabor.SetItems(ItemsLabor)
	j3.Release
	'***********FIN CONSULTAR LABOR*******************'
	
	'***********CONSULTAR ELEMENTO********************'
	SearchTemplateElemento.Initialize
	'*********Creo una Lista para los elementos
	Dim ItemsElemento As List
	ItemsElemento.Initialize
	ItemsElemento.Add("Seleccionar:")
	
	
	
	Dim cmdElementoGasto As DBCommand = CreateCommand("select_elementoGasto", Null)
	Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, Null)) JobDone(j4 As HttpJob)
	If j4.Success Then
		Req.HandleJobAsync(j4, "req_elementoGasto")
		Wait For (Req) req_elementoGasto_Result(resElementoGasto As DBResult)
		For Each rowElementoGasto() As Object In resElementoGasto.Rows
			Dim codigoElementoGasto As String = rowElementoGasto(0) ' Cdgo_Dstno
			Dim descripcionElementoGasto As String = rowElementoGasto(1) ' Dscrpcion_Dstno

			ItemsElemento.Add(codigoElementoGasto&":"&descripcionElementoGasto)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j4.ErrorMessage)
	End If
	SearchTemplateElemento.SetItems(ItemsElemento)
	j4.Release
	'************FIN CONSULTAR ELEMENTO******************'
	
	

	'AGREGAR AL SELECT TIPO DE FORMULARIO'
	SearchTemplateTypeForm.Initialize
	
	Dim ItemsTypeForm As List
	ItemsTypeForm.Initialize
	ItemsTypeForm.Add("0"&":"&"Insumo")
	ItemsTypeForm.Add("1"&":"&"Siembra")
	ItemsTypeForm.Add("2"&":"&"Riego")
	SearchTemplateTypeForm.SetItems(ItemsTypeForm)
	
	
	
	data.Initialize
	
	
	Dim cmdUltimoRegistro As DBCommand = CreateCommand("select_maxIdLabor", Null)
	Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0, Null)) JobDone(j5 As HttpJob)

	If j5.Success Then
		Req.HandleJobAsync(j5, "req_ultimoRegistro")
		Wait For (Req) req_ultimoRegistro_Result(resUltimoRegistro As DBResult)
    
		For Each rowRegistro() As Object In resUltimoRegistro.Rows
			Dim ultimoRegistro As Int = rowRegistro(0) ' Numero_Registro_Labor
			Log("Último Registro obtenido: " & ultimoRegistro)
			' Aquí puedes asignar el valor a una variable o realizar otra acción
		Next
	Else
		Log("Error en la consulta select_maxIdLabor: " & j5.ErrorMessage)
	End If

   consecutivo = ultimoRegistro + 1
   
	Log(consecutivo)
   
	Dim cmdUltimoRegistro As DBCommand = CreateCommand("select_maxIdSiembra", Null)
	Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0, Null)) JobDone(j5 As HttpJob)

	If j5.Success Then
		Req.HandleJobAsync(j5, "req_ultimoRegistro")
		Wait For (Req) req_ultimoRegistro_Result(resUltimoRegistro As DBResult)
    
		For Each rowRegistro() As Object In resUltimoRegistro.Rows
			Dim ultimoRegistroSiembra As Int = rowRegistro(0) ' Numero_Registro_Labor
			Log("Último Registro Siembra  obtenido: " & ultimoRegistroSiembra)
			' Aquí puedes asignar el valor a una variable o realizar otra acción
		Next
	Else
		Log("Error en la consulta select_maxIdLabor: " & j5.ErrorMessage)
	End If

	consecutivoSiembra = ultimoRegistroSiembra + 1
   
	Log(consecutivoSiembra)
	
	SearchTemplateInsumo.Initialize
	
	SearchTemplateRiego.Initialize
	
	SearchTemplateTipoLabranza.Initialize
	
	SearchTemplateVariedad.Initialize
End Sub



Private Sub CreateItem As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)
    
	' Carga el diseño previamente definido llamado "addMaquinariaUI" en el panel creado
	panel.LoadLayout("addLaboresUI")
	
	panel.Height=Panel1geral.Height
	
	Return panel
End Sub


Private Sub CreateItemRiego As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)
    
	' Carga el diseño previamente definido llamado "FormRiego" en el panel creado
	panel.LoadLayout("FormRiego")
	
	panel.Height=Panel2geral.Height
	
	Return panel
End Sub

Private Sub CreateItemSiembra As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)
    
	' Carga el diseño previamente definido llamado "FormSiembra" en el panel creado
	panel.LoadLayout("FormSiembra")
	
	panel.Height=Panel3geral.Height
	
	Return panel
End Sub

Private Sub CreateItemInsumo As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)
    
	' Carga el diseño previamente definido llamado "FormSiembra" en el panel creado
	panel.LoadLayout("FormInsumo")
	
	panel.Height=Panel0geral.Height
	
	Return panel
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Label13Time_Click
	Panel12.Visible = True
End Sub

Private Sub Label14Time_Click
	Panel3.Visible = True
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
	Label13Time.Text = formattedDate

	' Hacer invisible el Panel
	Panel12.Visible = False

	' Guardar la fecha en la variable pública
	fechaInicio = formattedDate

	' Mostrar el valor de la fecha en un log
	Log("Fecha inicio: " & fechaInicio)
End Sub

Private Sub AS_DatePicker2_SelectedDateChanged(Date As Long)
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
	Label14Time.Text = formattedDate

	' Hacer invisible el Panel
	Panel3.Visible = False

	' Guardar la fecha en la variable pública
	fechaFin = formattedDate

	' Mostrar el valor de la fecha en un log
	Log("Fecha fin: " & fechaFin)
End Sub


Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub

Private Sub SD_xComboBoxNit_ItemClick (Position As Int, Value As Object)
	nitEmpresaCBX=Value
	
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
			
		Next
    
	Else
		' Si hay un error, muestra el mensaje
		Log("Error: " & j.ErrorMessage)
	End If
	' Libera el trabajo HTTP
	j.Release
	' FIN DE LA CONSULTA DE LOS NITS
	
	Log("Nit seleccionado" &  nitEmpresaCBX)
End Sub

Private Sub SD_xComboBoxHacienda_ItemClick (Position As Int, Value As Object)
	haciendaCBX=Value
	
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
			
		Next
    
	Else
		' Si hay un error, muestra el mensaje
		Log("Error: " & j.ErrorMessage)
	End If

	' Libera el trabajo HTTP
	j.Release
	' FIN DE LA CONSULTA DE LOS NITS
	
	Log("Hacienda" & haciendaCBX)
End Sub

Private Sub SD_xComboBoxLote_ItemClick (Position As Int, Value As Object)
	
	loteCBX = Value
	Log("Lotecbx" & loteCBX)
End Sub

Private Sub SD_xComboBoxLabor_ItemClick (Position As Int, Value As Object)
	
	elementoLabor = Value
	
	Log("Elemento labor" & elementoLabor)
End Sub

Private Sub SD_xComboBoxElemento_ItemClick (Position As Int, Value As Object)
	
	' Asumimos que Value es un String
	elementoGasto = Value

	' Verificar si hay contenido y obtener hasta las primeras 2 letras
	If elementoGasto.Length > 0 Then
		elementoGasto = elementoGasto.SubString2(0, Min(2, elementoGasto.Length))
	Else
		elementoGasto = "" ' Si está vacío, asignar cadena vacía
	End If

	' Log del resultado
	Log("Las dos primeras letras (o menos si no hay suficientes): " & elementoGasto)

End Sub

Private Sub EditTextAreaLabor_TextChanged (Old As String, New As String)
	
	areaLabor = New
	
	Log("Area Labor " & areaLabor)
End Sub


Private Sub EditTextAreaLote_TextChanged (Old As String, New As String)
	
	areaLote = New
	
	Log("Area lote " & areaLote )
End Sub

Private Sub SD_xComboBoxTypeForm_ItemClick (Position As Int, Value As Object)
	
    tipoLabor = Value
	' Aseguramos que Value sea un número antes de compararlo
	If IsNumber(Value) Then
		Select Case Value
			Case 0
				RemoveForm2IfExists
				RemoveForm3IfExists 
				CustomListView1Geral.Add(CreateItemInsumo,"form0")
				LlenarComboBoxInsumo
				Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.AddColumn("#", B4XTable1.COLUMN_TYPE_NUMBERS)
				INSUMOCOLUM.Width = 50dip
				B4XTable1.AddColumn("ID", B4XTable1.COLUMN_TYPE_TEXT)
				B4XTable1.AddColumn("NOMBRE", B4XTable1.COLUMN_TYPE_TEXT)
				B4XTable1.AddColumn("CANTIDAD", B4XTable1.COLUMN_TYPE_TEXT)
				
				cantidadInsumos = 0
				LabelCantidadInsumos.Text = cantidadInsumos
				CANTINSUMO = ""
			Case 1
				RemoveForm0IfExists
				RemoveForm2IfExists ' Eliminar "form2" si existe
				CustomListView1Geral.Add(CreateItemSiembra,"form3")
				LlenarComboBoxSiembra
			Case 2
				RemoveForm0IfExists
				RemoveForm3IfExists
				CustomListView1Geral.Add(CreateItemRiego, "form2")
				LlenarComboBoxRiego
				
			Case Else
				Log("Valor no reconocido: " & Value)
		End Select
	Else
		Log("Error: Value no es un número válido.")
	End If
	
	Log("Tipo labor " & tipoLabor)
End Sub

Private Sub EditTextProcedencia_TextChanged (Old As String, New As String)
	
	procedenciaRiego = New
	
	Log("procedencia" & procedenciaRiego)
End Sub

Private Sub EditTextCaudalAplicado_TextChanged (Old As String, New As String)
    caudalRiego = New
	
	Log("caudal" & caudalRiego)
End Sub

Private Sub EditTextCantidadAgua_TextChanged (Old As String, New As String)
   cantidadRiego = New
   
   Log("cantidad" & cantidadRiego)

End Sub

Private Sub SD_xComboBoxTipoRiego_ItemClick (Position As Int, Value As Object)
	tipoRiego = Value
	
	Log("tipo riego" & tipoRiego)
	
End Sub


Private Sub RemoveForm0IfExists
	' Iterar sobre los elementos para encontrar "form0" y eliminarlo
	For i = 0 To CustomListView1Geral.Size - 1
		If CustomListView1Geral.GetValue(i) = "form0" Then
			CustomListView1Geral.RemoveAt(i)
			Exit ' Salir después de eliminar el elemento
		End If
	Next
End Sub


Private Sub RemoveForm2IfExists
	' Iterar sobre los elementos para encontrar "form2" y eliminarlo
	For i = 0 To CustomListView1Geral.Size - 1
		If CustomListView1Geral.GetValue(i) = "form2" Then
			CustomListView1Geral.RemoveAt(i)
			Exit ' Salir después de eliminar el elemento
		End If
	Next
End Sub

Private Sub RemoveForm3IfExists
	' Iterar sobre los elementos para encontrar "form3" y eliminarlo
	For i = 0 To CustomListView1Geral.Size - 1
		If CustomListView1Geral.GetValue(i) = "form3" Then
			CustomListView1Geral.RemoveAt(i)
			Exit ' Salir después de eliminar el elemento
		End If
	Next
End Sub


Private Sub SD_xComboBoxCodigoVariedad_ItemClick (Position As Int, Value As Object)
	codigoSiembra = Value
	
	Log("codigo " & codigoSiembra)
End Sub

Private Sub EditTextDistanciaSiembra_TextChanged (Old As String, New As String)
	distanciaSiembra = New
	
	Log("Distancia de siembra " & distanciaSiembra)
End Sub

Private Sub EditTextBandereo_TextChanged (Old As String, New As String)
	
	bandereoSiembra = New 
	
	Log("bandereo " & bandereoSiembra)
End Sub

Private Sub EditTextToneladaSemilla_TextChanged (Old As String, New As String)
	
	toneladaSemillaSiembra = New
	
	Log("tonelada Semilla "& toneladaSemillaSiembra)
End Sub

Private Sub EditTextProcedenciaDestino_TextChanged (Old As String, New As String)
	procedenciaSiembra = New
	
	Log("procedencia "& procedenciaSiembra)
End Sub

Private Sub SD_xComboBoxTipoLabranza_ItemClick (Position As Int, Value As Object)
	
	tipoLabranzaSiembra = Value
	
	Log("tipo labranza "&tipoLabranzaSiembra)
End Sub

Private Sub EditTextNumeroPaquetes_TextChanged (Old As String, New As String)
	
	numeroPaquetesSiembra = New
	
	Log("numero de paquetes " & numeroPaquetesSiembra)
End Sub

Private Sub EditTextNumeroMacollos_TextChanged (Old As String, New As String)
	numeroMacolloSiembra = New
	
	Log("numero de macollos " & numeroMacolloSiembra )
End Sub



Private Sub LlenarComboBoxRiego
	
	Dim ItemsRiego As List
	ItemsRiego.Initialize
	ItemsRiego.Add("Seleccionar:")
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	'CONSULTAR TIPO RIEGO'
	Dim cmd As DBCommand = CreateCommand("select_tipoRiego", Null)
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		For Each row() As Object In res.Rows
			Dim Cdgo_Tipo_Riego As String = row(0)
			Dim Dscrpcion_Tipo_Riego As String = row(1)
			SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego, Cdgo_Tipo_Riego)
			ItemsRiego.Add(Cdgo_Tipo_Riego&":"&Dscrpcion_Tipo_Riego)
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	SearchTemplateRiego.SetItems(ItemsRiego)
	j.Release
	'FIN CONSULTAR TIPO RIEGO'
End Sub

Private Sub LlenarComboBoxSiembra
	
	Dim ItemsLabranza As List
	ItemsLabranza.Initialize
	ItemsLabranza.Add("Seleccionar:")
	
	Dim ItemsVariedad As List
	ItemsVariedad.Initialize
	ItemsVariedad.Add("Seleccionar:")
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	
	'CONSULTAR CODIGO VARIEDAD'
	Dim cmd As DBCommand = CreateCommand("select_codVariedad", Null)
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		For Each row() As Object In res.Rows
			Dim Cdgo_Variedad As String = row(0)
			SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, Cdgo_Variedad)
			ItemsVariedad.Add(Cdgo_Variedad)
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	SearchTemplateVariedad.SetItems(ItemsVariedad)
	j.Release
	'FIN CONSULTAR CODIGO VARIEDAD'
	
	'CONSULTAR TIPO LABRANZA'
	Dim cmdTipoLabranza As DBCommand = CreateCommand("select_tipoLabranza", Null)
	Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Null)) JobDone(j4 As HttpJob)
	If j4.Success Then
		Req.HandleJobAsync(j4, "req_TipoLabranza")
		Wait For (Req) req_TipoLabranza_Result(resTipoLabranza As DBResult)
		For Each rowTipoLabranza() As Object In resTipoLabranza.Rows
			Dim Cdgo_Tipo_Labranza As String = rowTipoLabranza(0) ' Cdgo_Dstno
			Dim Dscrpcion_Tipo_Labranza As String = rowTipoLabranza(1) ' Dscrpcion_Dstno
			SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Labranza, Cdgo_Tipo_Labranza)
			ItemsLabranza.Add(Cdgo_Variedad&":"&Dscrpcion_Tipo_Labranza)
		Next
	Else
		Log("Error en la consulta de Tipo_Labranza: " & j4.ErrorMessage)
	End If
	SearchTemplateTipoLabranza.SetItems(ItemsLabranza)
	j4.Release
	'FIN CONSULTAR TIPO LABRANZA'
End Sub

Private Sub LlenarComboBoxInsumo

	Dim ItemsInsumo As List
	ItemsInsumo.Initialize
	ItemsInsumo.Add("Seleccionar:")
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	'CONSULTAR TIPO RIEGO'
	Dim cmd As DBCommand = CreateCommand("select_insumosSort", Null)
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		For Each row() As Object In res.Rows
			Dim Cdgo_Producto As String = row(0)
			Dim Dscrpcion_Producto As String = row(1)
			SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscrpcion_Producto &" - "&Cdgo_Producto )
			ItemsInsumo.Add(Cdgo_Producto&":"&Dscrpcion_Producto )
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	SearchTemplateInsumo.SetItems(ItemsInsumo)
	j.Release
	'FIN CONSULTAR TIPO RIEGO'
End Sub

Private Sub SD_xComboBoxInsumo_ItemClick (Position As Int, Value As Object)
	Dim partes() As String = Regex.Split(" - ", Value)
	NAMEINSUMO = partes(0)
	IDINSUMO = partes(1)
End Sub

Private Sub EditTextCantidadInsumo_TextChanged (Old As String, New As String)
	ButtonAddInsumo.Enabled = True
	CANTINSUMO = New
End Sub

Private Sub ButtonAddInsumo_Click
	If NAMEINSUMO == "" And IDINSUMO == "" And CANTINSUMO == "" Then
		MsgboxAsync("Selecciona un Insumo y la cantidad antes de agregarlo","Error")
		Else
		cantidadInsumos = cantidadInsumos + 1
		Dim numberInsumo As Int = cantidadInsumos
		data.Add(Array As Object(numberInsumo,IDINSUMO,NAMEINSUMO,CANTINSUMO))
		B4XTable1.SetData(data)
		LabelCantidadInsumos.Text = cantidadInsumos
		EditTextCantidadInsumo.Text = ""
	End If
End Sub


Private Sub ButtonDeleteInsumo_Click
	
	RemoveInsumoFromData(idEliminarTabla)
	
	ButtonDeleteInsumo.Visible = False
	cantidadInsumos = cantidadInsumos - 1
	LabelCantidadInsumos.Text = cantidadInsumos
	PanelTittleInsumo.Visible = False
	PanelInsumoSelect.Visible = False
	ButtonDeleteInsumo.Visible = False
End Sub


Private Sub B4XTable1_CellClicked (ColumnId As String, RowId As Long)
	Log("COLUM ID"&ColumnId)
	Log("ROW ID"&RowId)
	PanelTittleInsumo.Visible = True
	Dim rowData As Map = B4XTable1.GetRow(RowId)
	Dim ID As String  = rowData.Get("ID")
	Dim nombreInsu As String = rowData.Get("NOMBRE")
	Dim cantidadInsu As Int = rowData.Get("CANTIDAD")
	LabelInsumoSelect.Text = "- "&nombreInsu&" / "&"Cantidad: "&cantidadInsu
	PanelInsumoSelect.Visible = True
	ButtonDeleteInsumo.Visible = True
	' Borrar la fila seleccionada
	idEliminarTabla = rowData.Get("#")
	Log(idEliminarTabla)
End Sub

' Función para eliminar un insumo específico de la lista
Sub RemoveInsumoFromData(insumoID As Int)
	
	For i = data.Size - 1 To 0 Step -1
		' Obtener el array actual
		Dim arrayElement() As Object = data.Get(i)
    
		' Verificar si el primer elemento coincide con el número que deseas eliminar
		If arrayElement(0) = insumoID Then
			' Eliminar el array correspondiente
			data.RemoveAt(i)
			B4XTable1.SetData(data)
		End If
	Next

End Sub

Private Sub Label1Back_Click
	B4XPages.ClosePage(Me)
End Sub


Private Sub ButtonInsumo_Click
		
	
	' Iterar sobre las filas visibles en la tabla
	For i = 0 To B4XTable1.VisibleRowIds.Size - 1
		' Obtener el ID de la fila actual
		Dim RowId As Long = B4XTable1.VisibleRowIds.Get(i)
    
		' Obtener los datos de la fila actual como un mapa
		Dim rowData As Map = B4XTable1.GetRow(RowId)
        
		' Verificar si el mapa contiene la clave "ID"
		Dim ID As String
		If rowData.ContainsKey("ID") And rowData.Get("ID") <> Null Then
			ID = rowData.Get("ID")
		Else
			ID = "No ID" ' Valor predeterminado si no se encuentra
		End If

		' Verificar si el mapa contiene la clave "NOMBRE"
		Dim nombreInsu As String
		If rowData.ContainsKey("NOMBRE") And rowData.Get("NOMBRE") <> Null Then
			nombreInsu = rowData.Get("NOMBRE")
		Else
			nombreInsu = "Desconocido"
		End If

		' Verificar si el mapa contiene la clave "CANTIDAD"
		Dim cantidadInsu As Int
		If rowData.ContainsKey("CANTIDAD") And rowData.Get("CANTIDAD") <> Null Then
			Try
				cantidadInsu = rowData.Get("CANTIDAD")
				' Registrar los valores en el log
				Log("Fila " & (i + 1) & ":")
				Log(" - ID: " & ID)
				Log(" - NOMBRE: " & nombreInsu)
				Log(" - CANTIDAD: " & cantidadInsu)
            
				' Inicializar el gestor de solicitudes de la base de datos
				Dim Req As DBRequestManager
				Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)

				' Crear el comando con los parámetros
				Dim cmd As DBCommand = CreateCommand("insert_laborInsumo", Array(consecutivo, ID, cantidadInsu))

				Log("Comando SQL: insert_laborInsumo")
				Log("Parámetro 1 - consecutivo: " & consecutivo)
				Log("Parámetro 2 - ID: " & ID)
				Log("Parámetro 3 - cantidadInsu: " & cantidadInsu)
				' Ejecutar el comando
				Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
				Wait For (j) JobDone(j As HttpJob)
            
				' Verificar si la inserción fue exitosa
				If j.Success Then
					' Mostrar mensaje de éxito
					Log("Inserción insumo exitosa para ID: " & ID)
					ToastMessageShow("Inserción exitosa para Insumo : " & ID, True)
				Else
					' Mostrar mensaje de error
					Log("Error en la inserción insumo para ID: " & ID & ". Error: " & j.ErrorMessage)
					ToastMessageShow("Error en la inserción para ID: " & ID, False)
				End If
            
				' Liberar el trabajo
				j.Release
            
				' Incrementar el consecutivo
				consecutivo = consecutivo + 1

			Catch
				cantidadInsu = 0 ' Valor predeterminado si no es un número válido
				Log("Error al procesar insumo la cantidad para ID: " & ID)
				ToastMessageShow("Error al procesar la cantidad para ID: " & ID, False)
			End Try
		Else
			cantidadInsu = 0
		End If
	Next
	
	Dim horaSistema As String = DateTime.Time(DateTime.Now)
	user = Main.pUser
	DeviceName = GetDeviceName
	Dim fecha As Long = DateTime.Now ' Obtiene el tiempo actual
	DateTime.DateFormat = "yyyy-MM-dd HH:mm:ss" ' Configura el formato de la fecha con hora, minutos y segundos
	fechaActual = DateTime.Date(fecha) ' Almacena la fecha y hora formateada en la variable global

	fechafmrto = DateTime.Date(fecha)
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	
	' Crear el comando con los parámetros
	Dim cmd As DBCommand = CreateCommand("insert_labor", Array(nitEmpresaCBX, haciendaCBX, loteCBX, "0000-", "CA", tipoLabor, fechaInicio, fechaFin, elementoGasto, areaLabor, consecutivo, Null, areaLote, Null, fechaActual, horaSistema, user, DeviceName))


	' Log de las variables
	Log("nitEmpresaCBX: " & nitEmpresaCBX)
	Log("haciendaCBX: " & haciendaCBX)
	Log("loteCBX: " & loteCBX)
	Log("fechafmrto: " & fechafmrto)
	Log("tipoLabor: " & tipoLabor)
	Log("fechaInicio: " & fechaInicio)
	Log("fechaFin: " & fechaFin)
	Log("elementoGasto: " & elementoGasto)
	Log("areaLabor: " & areaLabor)
	Log("consecutivo: " & consecutivo)
	Log("areaLote: " & areaLote)
	Log("fechaActual: " & fechaActual)
	Log("horaSistema: " & horaSistema)
	Log("user: " & user)
	Log("DeviceName: " & DeviceName)
	' Ejecutar el comando
	Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
	Wait For(j) JobDone(j As HttpJob)

	' Manejar la respuesta
	Try
		If j.Success Then
			
			MsgboxAsync("Se ha insertado correctamente la labor.", "Éxito")
		Else
			' En caso de error, registrar los parámetros enviados
			Log("Error al ejecutar la consulta labor: " & j.ErrorMessage)

		End If
	Catch
		Log("Error al agregar datos: " & LastException.Message) ' Log del error con más detalles
		
	End Try
	
	
End Sub


Private Sub ButtonRiego_Click
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)

	' Crear el comando con los parámetros
	Dim cmd As DBCommand = CreateCommand("insert_laborRiego", Array(consecutivo,tipoRiego,procedenciaRiego,caudalRiego,cantidadRiego))

	' Mostrar los valores en el Log
	Log("Comando SQL: insert_laborRiego")
	Log("Parámetro 1 - consecutivo: " & consecutivo)
	Log("Parámetro 2 - tipoRiego: " & tipoRiego)
	Log("Parámetro 3 - procedenciaRiego: " & procedenciaRiego)
	Log("Parámetro 4 - caudalRiego: " & caudalRiego)
	Log("Parámetro 5 - cantidadRiego: " & cantidadRiego)
	' Ejecutar el comando
	Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
	Wait For(j) JobDone(j As HttpJob)

	' Manejar la respuesta
	Try
		If j.Success Then
			ToastMessageShow("Se ha insertado correctamente Insumo", False) ' Mensaje de éxito
		Else
			ToastMessageShow("Error al insertar Insumo", True) ' Mensaje de error
			Log("Error al ejecutar la consulta: " & j.ErrorMessage) ' Detalles del error
		End If
	Catch
		ToastMessageShow("Error inesperado al insertar Insumo", True) ' Mensaje de error inesperado
		Log("Error al agregar datos: " & LastException.Message) ' Log del error con más detalles
	End Try

	Dim horaSistema As String = DateTime.Time(DateTime.Now)
	user = Main.pUser
	DeviceName = GetDeviceName
	Dim fecha As Long = DateTime.Now ' Obtiene el tiempo actual
	DateTime.DateFormat = "yyyy-MM-dd HH:mm:ss" ' Configura el formato de la fecha con hora, minutos y segundos
	fechaActual = DateTime.Date(fecha) ' Almacena la fecha y hora formateada en la variable global

	fechafmrto = DateTime.Date(fecha)
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)

	' Crear el comando con los parámetros
	Dim cmd As DBCommand = CreateCommand("insert_labor", Array(nitEmpresaCBX, haciendaCBX, loteCBX, "0000-", "CA", tipoLabor, fechaInicio, fechaFin, elementoGasto, areaLabor, consecutivo, Null, areaLote, Null, fechaActual, horaSistema, user, DeviceName))


	' Log de las variables
	Log("nitEmpresaCBX: " & nitEmpresaCBX)
	Log("haciendaCBX: " & haciendaCBX)
	Log("loteCBX: " & loteCBX)
	Log("fechafmrto: " & fechafmrto)
	Log("tipoLabor: " & tipoLabor)
	Log("fechaInicio: " & fechaInicio)
	Log("fechaFin: " & fechaFin)
	Log("elementoGasto: " & elementoGasto)
	Log("areaLabor: " & areaLabor)
	Log("consecutivo: " & consecutivo)
	Log("areaLote: " & areaLote)
	Log("fechaActual: " & fechaActual)
	Log("horaSistema: " & horaSistema)
	Log("user: " & user)
	Log("DeviceName: " & DeviceName)
	' Ejecutar el comando
	Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
	Wait For(j) JobDone(j As HttpJob)

	' Manejar la respuesta
	Try
		If j.Success Then
			
			MsgboxAsync("Se ha insertado correctamente la labor.", "Éxito")
		Else
			' En caso de error, registrar los parámetros enviados
			Log("Error al ejecutar la consulta labor: " & j.ErrorMessage)

		End If
	Catch
		Log("Error al agregar datos: " & LastException.Message) ' Log del error con más detalles
		
	End Try
End Sub

Private Sub ButtonSimbra_Click
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	
	Dim cmdUltimoRegistro As DBCommand = CreateCommand("select_maxIdSiembra", Null)
	Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0, Null)) JobDone(j5 As HttpJob)

	If j5.Success Then
		Req.HandleJobAsync(j5, "req_ultimoRegistro")
		Wait For (Req) req_ultimoRegistro_Result(resUltimoRegistro As DBResult)
    
		For Each rowRegistro() As Object In resUltimoRegistro.Rows
			Dim ultimoRegistroSiembra As Int = rowRegistro(0) ' Numero_Registro_Labor
			Log("Último Registro Siembra  obtenido: " & ultimoRegistroSiembra)
			' Aquí puedes asignar el valor a una variable o realizar otra acción
		Next
	Else
		Log("Error en la consulta select_maxIdLabor: " & j5.ErrorMessage)
	End If

	consecutivoSiembra = ultimoRegistroSiembra + 1
   
	Log(consecutivoSiembra)
	
	' Crear el comando con los parámetros
	Dim cmd As DBCommand = CreateCommand("insert_laborSiembra", Array(consecutivoSiembra, codigoSiembra, distanciaSiembra, toneladaSemillaSiembra, numeroPaquetesSiembra, procedenciaSiembra, tipoLabranzaSiembra, bandereoSiembra, numeroMacolloSiembra))

	' Mostrar los valores en el Log
	Log("Comando SQL: insert_laborSiembra")
	Log("Parámetro 1 - consecutivoSiembra: " & consecutivoSiembra)
	Log("Parámetro 2 - codigoSiembra: " & codigoSiembra)
	Log("Parámetro 3 - distanciaSiembra: " & distanciaSiembra)
	Log("Parámetro 4 - toneladaSemillaSiembra: " & toneladaSemillaSiembra)
	Log("Parámetro 5 - numeroPaquetesSiembra: " & numeroPaquetesSiembra)
	Log("Parámetro 6 - procedenciaSiembra: " & procedenciaSiembra)
	Log("Parámetro 7 - tipoLabranzaSiembra: " & tipoLabranzaSiembra)
	Log("Parámetro 8 - bandereoSiembra: " & bandereoSiembra)
	Log("Parámetro 9 - numeroMacolloSiembra: " & numeroMacolloSiembra)

	' Ejecutar el comando
	Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
	Wait For(j) JobDone(j As HttpJob)

	' Manejar la respuesta
	Try
		If j.Success Then
			Log("Datos insertados correctamente en insert_laborInsumo")
			ToastMessageShow("Datos de Insumo guardados con éxito", False) ' Mensaje de éxito
		Else
			ToastMessageShow("Error al guardar los datos de Insumo", True) ' Mensaje de error
		End If
	Catch
    Log("Excepción capturada en insert_laborInsumo: " & LastException)
		ToastMessageShow("Se produjo un error inesperado", True) ' Mensaje de error general
		End Try

	
	Dim horaSistema As String = DateTime.Time(DateTime.Now)
	user = Main.pUser
	DeviceName = GetDeviceName
	Dim fecha As Long = DateTime.Now ' Obtiene el tiempo actual
	DateTime.DateFormat = "yyyy-MM-dd HH:mm:ss" ' Configura el formato de la fecha con hora, minutos y segundos
	fechaActual = DateTime.Date(fecha) ' Almacena la fecha y hora formateada en la variable global

	fechafmrto = DateTime.Date(fecha)
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)

	' Crear el comando con los parámetros
	Dim cmd As DBCommand = CreateCommand("insert_labor", Array(nitEmpresaCBX, haciendaCBX, loteCBX, "0000-", "CA", tipoLabor, fechaInicio, fechaFin, elementoGasto, areaLabor, consecutivo, Null, areaLote, Null, fechaActual, horaSistema, user, DeviceName))


	' Log de las variables
	Log("nitEmpresaCBX: " & nitEmpresaCBX)
	Log("haciendaCBX: " & haciendaCBX)
	Log("loteCBX: " & loteCBX)
	Log("fechafmrto: " & fechafmrto)
	Log("tipoLabor: " & tipoLabor)
	Log("fechaInicio: " & fechaInicio)
	Log("fechaFin: " & fechaFin)
	Log("elementoGasto: " & elementoGasto)
	Log("areaLabor: " & areaLabor)
	Log("consecutivo: " & consecutivo)
	Log("areaLote: " & areaLote)
	Log("fechaActual: " & fechaActual)
	Log("horaSistema: " & horaSistema)
	Log("user: " & user)
	Log("DeviceName: " & DeviceName)
	' Ejecutar el comando
	Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
	Wait For(j) JobDone(j As HttpJob)

	' Manejar la respuesta
	Try
		If j.Success Then
			
			MsgboxAsync("Se ha insertado correctamente la labor.", "Éxito")
		Else
			' En caso de error, registrar los parámetros enviados
			Log("Error al ejecutar la consulta labor: " & j.ErrorMessage)

		End If
	Catch
		Log("Error al agregar datos: " & LastException.Message) ' Log del error con más detalles
		
	End Try
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
		Log(haciendaCBX)
		' Libera el trabajo HTTP
		j.Release
		'***************** FIN CONSULTA LOTE ************************
	End If
End Sub

Private Sub SwiftButtonLote_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateLote, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonLote.xLBL.Text = SearchTemplateLote.SelectedItem
		Dim Partes() As String = Regex.Split(":", SearchTemplateLote.SelectedItem)
		loteCBX = Partes(0) ' Asignar solo la primera parte
	End If
	
	Log(loteCBX)
End Sub

Private Sub SwiftButtonLabor_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateLabor, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonLabor.xLBL.Text = SearchTemplateLabor.SelectedItem
		Dim Partes() As String = Regex.Split(":", SearchTemplateLabor.SelectedItem)
		elementoLabor = Partes(0) ' Asignar solo la primera parte
	End If
	Log(elementoLabor)
End Sub


Private Sub SwiftButtonElemento_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateElemento, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonElemento.xLBL.Text = SearchTemplateElemento.SelectedItem
		Dim Partes() As String = Regex.Split(":", SearchTemplateElemento.SelectedItem)
		elementoGasto = Partes(0) ' Asignar solo la primera parte
        
		' Obtener solo las dos primeras letras de elementoGasto
		If elementoGasto.Length >= 2 Then
			elementoGasto = elementoGasto.SubString2(0, 2)
		Else
			' Si la cadena tiene menos de 2 caracteres, asignar la cadena completa
			elementoGasto = elementoGasto
		End If
	End If
	Log(elementoGasto)
End Sub


Private Sub SwiftButtonTypeForm_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateTypeForm, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonTypeForm.xLBL.Text = SearchTemplateTypeForm.SelectedItem
		Dim TYPEFORMCOMPLETO As String = SearchTemplateTypeForm.SelectedItem
		Dim Partes() As String = Regex.Split(":", TYPEFORMCOMPLETO)
		tipoLabor = Partes(0)
		Log(tipoLabor)
	Dim tipoForm As String = Partes(0)
	
	Select Case tipoForm
		Case "0"
			RemoveForm2IfExists
			RemoveForm3IfExists
			CustomListView1Geral.Add(CreateItemInsumo,"form0")
			LlenarComboBoxInsumo
			Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.AddColumn("#", B4XTable1.COLUMN_TYPE_NUMBERS)
			INSUMOCOLUM.Width = 50dip
			B4XTable1.AddColumn("ID", B4XTable1.COLUMN_TYPE_TEXT)
			B4XTable1.AddColumn("NOMBRE", B4XTable1.COLUMN_TYPE_TEXT)
			B4XTable1.AddColumn("CANTIDAD", B4XTable1.COLUMN_TYPE_TEXT)
				
			cantidadInsumos = 0
			LabelCantidadInsumos.Text = cantidadInsumos
			CANTINSUMO = ""
		Case "1"
			RemoveForm0IfExists
			RemoveForm2IfExists ' Eliminar "form2" si existe
			CustomListView1Geral.Add(CreateItemSiembra,"form3")
			LlenarComboBoxSiembra
		Case "2"
			RemoveForm0IfExists
			RemoveForm3IfExists
			CustomListView1Geral.Add(CreateItemRiego, "form2")
			LlenarComboBoxRiego
				
		Case Else
			Log("Valor no reconocido: " & tipoForm)
		End Select
		
	End If
End Sub

Private Sub SwiftButtonInsumo_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateInsumo, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonInsumo.xLBL.Text = SearchTemplateInsumo.SelectedItem
		Dim INSUMOCOMPLETO As String = SearchTemplateInsumo.SelectedItem
		Dim partes() As String = Regex.Split(":", INSUMOCOMPLETO)
		NAMEINSUMO = partes(1)
		IDINSUMO = partes(0)
	End If
	Log(IDINSUMO)
End Sub

Private Sub SwiftButtonRiego_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateRiego, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonRiego.xLBL.Text = SearchTemplateRiego.SelectedItem
		Dim Partes() As String = Regex.Split(":", SearchTemplateRiego.SelectedItem)
		tipoRiego = Partes(0) ' Asignar solo la primera parte
	End If
	Log(tipoRiego)
End Sub


Private Sub SwiftButtonTipoLabranza_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateTipoLabranza, "", "", "CANCEL")) Complete (Result As Int)

	If Result = xui.DialogResponse_Positive Then
		SwiftButtonTipoLabranza.xLBL.Text = SearchTemplateTipoLabranza.SelectedItem
		Dim Partes() As String = Regex.Split(":", SearchTemplateTipoLabranza.SelectedItem)
        
		' Obtener solo los últimos 2 caracteres
		tipoLabranzaSiembra = Partes(0)
		If tipoLabranzaSiembra.Length >= 2 Then
			tipoLabranzaSiembra = tipoLabranzaSiembra.SubString(tipoLabranzaSiembra.Length - 2)
		End If
	End If

	Log(tipoLabranzaSiembra)
End Sub


Private Sub SwiftButtonVariedad_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateVariedad, "", "", "CANCEL")) Complete (Result As Int)
    
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonVariedad.xLBL.Text = SearchTemplateVariedad.SelectedItem
		Dim Partes() As String = Regex.Split(":", SearchTemplateVariedad.SelectedItem)
		codigoSiembra = Partes(0)
	End If
	Log(codigoSiembra)
End Sub
