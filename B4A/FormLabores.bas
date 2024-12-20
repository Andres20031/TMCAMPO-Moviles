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
	

	Private SD_xComboBoxNit As SD_xComboBox
	Private SD_xComboBoxHacienda As SD_xComboBox
	Private SD_xComboBoxLote As SD_xComboBox
	Private SD_xComboBoxLabor As SD_xComboBox
	Private SD_xComboBoxElemento As SD_xComboBox
	Private SD_xComboBoxTypeForm As SD_xComboBox
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
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
	
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	
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
	
	'CONSULTAR NIT'
	Dim cmd As DBCommand = CreateCommand("select_nit", Null)
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	If j.Success Then
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
		For Each row() As Object In res.Rows
			Dim razonSocial As String = row(0)
			Dim nit As String = row(1)
			SD_xComboBoxNit.Add(razonSocial & " - " & nit, nit)
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	'FIN CONSULTAR NIT'
	
	'CONSULTAR LABOR'
	Dim cmdLaborMaquina As DBCommand = CreateCommand("select_labor_maq", Null)
	Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Null)) JobDone(j3 As HttpJob)
	If j3.Success Then
		Req.HandleJobAsync(j3, "req_labormaquina")
		Wait For (Req) req_labormaquina_Result(resLaborMaquina As DBResult)
		For Each rowLaborMaquina() As Object In resLaborMaquina.Rows
			Dim codigoLaborMaquina As String = rowLaborMaquina(0) ' Cdgo_Dstno
			Dim descripcionLaborMaquina As String = rowLaborMaquina(1) ' Dscrpcion_Dstno
			SD_xComboBoxLabor.Add(descripcionLaborMaquina & " - " & codigoLaborMaquina, codigoLaborMaquina)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j3.ErrorMessage)
	End If
	j3.Release
	'FIN CONSULTAR LABOR'
	
	'CONSULTAR ELEMENTO'
	Dim cmdElementoGasto As DBCommand = CreateCommand("select_elementoGasto", Null)
	Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, Null)) JobDone(j4 As HttpJob)
	If j4.Success Then
		Req.HandleJobAsync(j4, "req_elementoGasto")
		Wait For (Req) req_elementoGasto_Result(resElementoGasto As DBResult)
		For Each rowElementoGasto() As Object In resElementoGasto.Rows
			Dim codigoElementoGasto As String = rowElementoGasto(0) ' Cdgo_Dstno
			Dim descripcionElementoGasto As String = rowElementoGasto(1) ' Dscrpcion_Dstno
			SD_xComboBoxElemento.Add(descripcionElementoGasto & " - " & codigoElementoGasto, codigoElementoGasto)
		Next
	Else
		Log("Error en la consulta de Maquina: " & j4.ErrorMessage)
	End If
	j4.Release
	'FIN CONSULTAR ELEMENTO'
	
	
	'AGREGAR AL SELECT TIPO DE FORMULARIO'
	SD_xComboBoxTypeForm.Add("Insumo",0)
	SD_xComboBoxTypeForm.Add("Siembra",1)
	SD_xComboBoxTypeForm.Add("Riego",2)
	
	data.Initialize
	
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
	fechaInicio = formattedDate
    
	' Log para verificar el valor de la fecha
End Sub

Private Sub AS_DatePicker2_SelectedDateChanged(Date As Long)
	' Obtener la fecha seleccionada
	Dim formattedDate As String = DateTime.Date(Date)
    
	' Reemplazar cualquier '/' por '-' en caso de que la fecha sea en formato con '/'
	formattedDate = formattedDate.Replace("/", "-")
    
	' Agregar la parte de la hora
	formattedDate = formattedDate & " 00:00:00"
    
	' Mostrar la fecha formateada en el Label
	Label14Time.Text = formattedDate
    
	' Hacer invisible el Panel
	Panel3.Visible = False
    
	' Obtener la fecha y guardarla en la variable fecha
	fechaFin = formattedDate
    
	' Log para verificar el valor de la fecha
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
	Dim cmd As DBCommand = CreateCommand("select_haciendas", Array("N"))

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
			SD_xComboBoxHacienda.Add(NombreHacienda & " - " & Codg_Hacienda, Codg_Hacienda)
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
			SD_xComboBoxLote.Add("Codigo: "&Codg_Hacienda, Codg_Hacienda)
		Next
    
	Else
		' Si hay un error, muestra el mensaje
		Log("Error: " & j.ErrorMessage)
	End If

	' Libera el trabajo HTTP
	j.Release
	' FIN DE LA CONSULTA DE LOS NITS
End Sub

Private Sub SD_xComboBoxLote_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub SD_xComboBoxLabor_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub SD_xComboBoxElemento_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub SD_xComboBoxTypeForm_ItemClick (Position As Int, Value As Object)
	
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
End Sub

Private Sub EditTextProcedencia_TextChanged (Old As String, New As String)
	
End Sub

Private Sub EditTextCaudalAplicado_TextChanged (Old As String, New As String)
	
End Sub

Private Sub EditTextCantidadAgua_TextChanged (Old As String, New As String)
	
End Sub

Private Sub SD_xComboBoxTipoRiego_ItemClick (Position As Int, Value As Object)
	
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
	
End Sub

Private Sub EditTextDistanciaSiembra_TextChanged (Old As String, New As String)
	
End Sub

Private Sub EditTextBandereo_TextChanged (Old As String, New As String)
	
End Sub

Private Sub EditTextToneladaSemilla_TextChanged (Old As String, New As String)
	
End Sub

Private Sub EditTextProcedenciaDestino_TextChanged (Old As String, New As String)
	
End Sub

Private Sub SD_xComboBoxTipoLabranza_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub EditTextNumeroPaquetes_TextChanged (Old As String, New As String)
	
End Sub

Private Sub EditTextNumeroMacollos_TextChanged (Old As String, New As String)
	
End Sub

Private Sub LlenarComboBoxRiego
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
			SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego & " - " & Cdgo_Tipo_Riego, Cdgo_Tipo_Riego)
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	'FIN CONSULTAR TIPO RIEGO'
End Sub

Private Sub LlenarComboBoxSiembra
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
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
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
			SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Labranza & " - " & Cdgo_Tipo_Labranza, Cdgo_Tipo_Labranza)
		Next
	Else
		Log("Error en la consulta de Tipo_Labranza: " & j4.ErrorMessage)
	End If
	j4.Release
	'FIN CONSULTAR TIPO LABRANZA'
End Sub

Private Sub LlenarComboBoxInsumo
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
			SD_xComboBoxInsumo.Add(Dscrpcion_Producto & " - " & Cdgo_Producto, Dscrpcion_Producto &" - "&Cdgo_Producto )
		Next
	Else
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
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