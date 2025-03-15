B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@

Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
'	Type DBResult (Tag As Object, Columns As Map, Rows As List)
'	Type DBCommand (Name As String, Parameters() As Object)

	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	
	Dim Datepicker As Intellvold_DatePicker
	Dim Mycalendar As Intellvold_Calendar
	Private utilClass As util
	Private ScrollView1 As ScrollView
	Dim xui As XUI
	Private SelectedDate As Long
	Private DateDialog As DateDialog
	Private Panel3 As Panel
	Private xui As XUI
	Private Panel1 As Panel
	Private Label10 As Label
	Private Spinner1 As Spinner
	Private Spinner2 As Spinner
	Private Spinner3 As Spinner
	Private Spinner4 As Spinner
'	Private EditText2area As EditText
'	Private EditText1cmb As EditText
'	Private Label13Time As Label
'	Private EditText2HoraFim As EditText
'	Private EditText1HoraInicio As EditText
	Private Label3 As Label
	Private Label13Hfim As Label
	Private Label12Hinicio As Label
	Private EditText1percentage As EditText
	Private EditText2horas As EditText
	Private EditText3cantidat As EditText
	Private EditText4obsv As EditText
	Private Label3Name As Label
	
	Private SD_xComboBoxNitPerson As SD_xComboBox
	Private SD_xComboBoxHacienda As SD_xComboBox
	
	Dim FechaInicio As String
	Dim FechaFin As String
	Dim nitEmpresaCBX As String
	Dim haciendaCBX As String
	Dim LoteCBX As String
	Dim LaborCBX As String
	Dim ConceptoCBX As String
	Dim TurnoCBX As String
	Dim HorasText As String
	Dim PorcentageText As String
	Dim CantidadText As String
	Dim ObsvText As String
	Private SD_xComboBoxLote As SD_xComboBox
	Private SD_xComboBoxLabor As SD_xComboBox
	Private SD_xComboBoxConcepto As SD_xComboBox
	Private SD_xComboBoxTurno As SD_xComboBox
	Private AS_DatePicker1 As AS_DatePicker
	Private Panel12 As Panel
	Private AS_DatePicker2 As AS_DatePicker
	Private Panel13 As Panel
	Public idPerson As String
	Dim ConceptoDataMap As Map
	

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
	Private SwiftButtonConcepto As SwiftButton
	Private SearchTemplateConcepto As B4XSearchTemplate
	Private SwiftButtonTurno As SwiftButton
	Private SearchTemplateTurno As B4XSearchTemplate
	
	
	
End Sub


Sub Globals
	Private Panel10Horainicio As Panel ' Tu input o panel para seleccionar la fecha
	Private LabelFecha As Label ' Un label para mostrar la fecha seleccionada
   
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)

	Root = Root1
	'load the layout to Root
	utilClass.Initialize
	
	utilClass.SetStatusBarColor(Colors.White,Colors.White)
	Root.LoadLayout("FomrPerson")
	ScrollView1.Panel.Height=1100dip
	ScrollView1.Panel.LoadLayout("ScrollUIPerson")

	EditText3cantidat.Color=Colors.Transparent'.
	EditText1percentage.Color=Colors.Transparent'.
	EditText4obsv.Color=Colors.Transparent'.
	EditText2horas.Color=Colors.Transparent'.
	
	'Alimentar los Spinner
	For Each v As View In Root.GetAllViewsRecursive
		If v Is Spinner Then
			Dim newsp As Spinner=v
			For i=1 To 16
				newsp.AddAll(Array As String(v.Tag&" "&i))
			Next
		End If
	Next
	
	'FIN LA BD ANTES DE CARGAR DE LOS NITS
	'
'	Spinner1.Add("AGROPECUARIA PICHUCHO S.A.S.")
'	'GetRecordClientes(1)
	''	GetRecordHaciendas(1)
	''	GetRecordLabores(1)
	'
	'
'	'GetRecord(1)
'	'InsertRecord("Carlos", 25123)
'	'DeleteRecord("Carlos")
	'
'	
	Base = Root
	Dialog.Initialize (Base)
	Dialog.Title = "Buscador"
End Sub

Sub B4XPage_Appear

    'Inicializo el Search Template 
	SearchTemplateNit.Initialize
	'Creo una Lista para los Nit
	Dim ItemsNit As List
	ItemsNit.Initialize
	
	
	SearchTemplateHacienda.Initialize
	
	SearchTemplateLote.Initialize
	
	SearchTemplateLabor.Initialize
	'Creo una Lista para las labores
	Dim ItemsLabor As List
	ItemsLabor.Initialize
	
	SearchTemplateConcepto.Initialize
	Dim ItemsConcepto As List
	ItemsConcepto.Initialize
	
	SearchTemplateTurno.Initialize
	Dim ItemsTurno As List
	ItemsTurno.Initialize
	
	
	
	' Obtener el nombre de la persona desde la página "DetailsPerson"
	Label3Name.Text = B4XPages.GetPage("DetailsPerson").As(DetailsPerson).namePerson

	' CONSULTAR LA BD PARA OBTENER LOS NITS
	SD_xComboBoxNitPerson.Add("----Select----", "1")
	ItemsNit.Add("Seleccionar:")

	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	Dim cmd As DBCommand = CreateCommand("select_nit", Null)

	' Ejecuta la consulta para los NITs
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)

	' Verificar si la consulta fue exitosa para NITs
	If j.Success Then
		' Maneja el resultado de la consulta
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)

		' Llenar el ComboBox con NITs y razones sociales
		For Each row() As Object In res.Rows
			Dim razonSocial As String = row(0)
			Dim nit As String = row(1)
			' Agregar la información al ComboBox
			SD_xComboBoxNitPerson.Add(razonSocial & " - " & nit, nit)
			ItemsNit.Add(nit&":"&razonSocial )
		Next

	Else
		' Si hay un error, muestra el mensaje
		Log("Error en la consulta de NITs: " & j.ErrorMessage)
	End If
	SearchTemplateNit.SetItems(ItemsNit)
	' Libera el trabajo HTTP de NITs
	j.Release


	' CONSULTAR LA BD PARA OBTENER LOS DESTINOS (Llenar SD_xComboBoxLabor)
	SD_xComboBoxLabor.Add("----Select----", "1")
	ItemsLabor.Add("Seleccionar:")
	Dim cmdLabor As DBCommand = CreateCommand("select_labor", Null)
	Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) JobDone(j2 As HttpJob)
	If j2.Success Then
		Req.HandleJobAsync(j2, "req_labor")
		Wait For (Req) req_labor_Result(resLabor As DBResult)
		For Each rowLabor() As Object In resLabor.Rows
			Dim codigoDestino As String = rowLabor(0) ' Cdgo_Dstno
			Dim descripcionDestino As String = rowLabor(1) ' Dscrpcion_Dstno
			SD_xComboBoxLabor.Add(descripcionDestino, codigoDestino)
			ItemsLabor.Add(codigoDestino&":"&descripcionDestino)
		Next
	Else
		Log("Error en la consulta de destinos: " & j2.ErrorMessage)
	End If
	SearchTemplateLabor.SetItems(ItemsLabor)
	j2.Release
	
	
	
	' Inicializar el ComboBox de Conceptos
	SD_xComboBoxConcepto.Add("----Select----", "1")
	ItemsConcepto.Add("Seleccionar:")

	' Crear el comando para consultar los conceptos
	Dim cmdConcepto As DBCommand = CreateCommand("select_concepto", Null)

	
	ConceptoDataMap.Initialize
	' Ejecuta la consulta para los conceptos
	Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null)) JobDone(j3 As HttpJob)

	' Verificar si la consulta fue exitosa
	If j3.Success Then
		' Manejar el resultado de la consulta
		Req.HandleJobAsync(j3, "req_concept")
		Wait For (Req) req_concept_Result(resConc As DBResult)
    
		' Iterar sobre las filas y agregar los datos al ComboBox
		For Each rowConcep() As Object In resConc.Rows
			Dim Cod_Concept As String = rowConcep(0) ' Código del concepto
			Dim Des_Concept As String = rowConcep(1) ' Descripción del concepto
			Dim dstjo_Cncpto As String = rowConcep(2)
			
			' Agregar la información al ComboBox
			SD_xComboBoxConcepto.Add(Des_Concept, Cod_Concept)
			ItemsConcepto.Add(Cod_Concept&":"&Des_Concept)
			' Guardar dstjo_Cncpto en el Map usando Cod_Concept como clave
			ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)
		Next
	Else
		' Si hay un error, mostrar el mensaje
		Log("Error en la consulta de conceptos: " & j3.ErrorMessage)
	End If
	SearchTemplateConcepto.SetItems(ItemsConcepto)

	' Liberar el trabajo HTTP
	j3.Release
	
	
	SD_xComboBoxTurno.Add("----Select----", "1")
	ItemsTurno.Add("Seleccionar:")
	' Crear el comando para consultar los turnos
	Dim cmdTurno As DBCommand = CreateCommand("select_turnos", Null)

	' Ejecuta la consulta para los conceptos
	Wait For (Req.ExecuteQuery(cmdTurno, 0, Null)) JobDone(j4 As HttpJob)

	' Verificar si la consulta fue exitosa
	If j4.Success Then
		' Manejar el resultado de la consulta
		Req.HandleJobAsync(j4, "req_turno")
		Wait For (Req) req_turno_Result(resTurno As DBResult)
    
		' Iterar sobre las filas y agregar los datos al ComboBox
		For Each rowTurno() As Object In resTurno.Rows
			Dim Turno As String = rowConcep(0) ' Código del concepto
			Dim Des_Turno As String = rowConcep(1) ' Descripción del concepto
			' Agregar la información al ComboBox
			SD_xComboBoxTurno.Add(Turno , Des_Turno)
			ItemsTurno.Add(Des_Turno&":"&Turno)
		Next
	Else
		' Si hay un error, mostrar el mensaje
		Log("Error en la consulta de conceptos: " & j4.ErrorMessage)
	End If
	SearchTemplateTurno.SetItems(ItemsTurno)
	' Liberar el trabajo HTTP
	j4.Release
	
End Sub


Private Sub Label12Hinicio_Click
	Panel12.Visible= True
End Sub

Sub AS_DatePicker1_SelectedDateChanged(Date As Long)
	' Establecer formato de fecha correcto
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim formattedDate As String = DateTime.Date(Date)
    
	' Mostrar la fecha en el Label
	Label12Hinicio.Text = formattedDate
    
	' Asignar la fecha formateada a la variable
	FechaInicio = formattedDate
    
	' Ocultar el Panel después de seleccionar la fecha
	Panel12.Visible = False
    
	' Log para depuración
	Log("Fecha seleccionada: " & FechaInicio)
End Sub



Sub AS_DatePicker1_DateChanged(Year As Int, Month As Int, Day As Int)
	' Formateamos la fecha como un string y la asignamos al Label
	Label12Hinicio.Text = Day & "/" & Month & "/" & Year
End Sub


Private Sub Label13Hfim_Click
	Panel13.Visible= True
End Sub

Sub AS_DatePicker2_SelectedDateChanged(Date As Long)
	' Convierte la fecha seleccionada a un formato legible
	Dim formattedDate As String = DateTime.Date(Date)
	
	' Muestra la fecha en el Label (ya debería estar inicializado en el diseño o globalmente)
	Label13Hfim.Text = formattedDate
    
	FechaFin = formattedDate
	
	Log("Fecha de fin" & FechaFin )
	' Oculta el Panel después de seleccionar la fecha
	Panel13.Visible = False
    
	' Opcional: log para depuración
	Log("Fecha seleccionada: " & formattedDate)
End Sub

Sub AS_DatePicker2_DateChanged(Year As Int, Month As Int, Day As Int)
	' Formateamos la fecha como un string y la asignamos al Label
	Label12Hinicio.Text = Day & "/" & Month & "/" & Year
End Sub

' Evento que se dispara cuando se cambia la selección en el ComboBox


Sub Date_OnDateSet (year As Int ,monthOfYear As Int , dayOfMonth As Int)
	Label10.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
	Label10.TextColor=Colors.Black
End Sub

Sub can_OnCancelDate ()
	ToastMessageShow("cancel" ,False)
End Sub

Private Sub Panel9_Click
	Datepicker.Initialize("Date",2022 ,DateTime.GetMonth(DateTime.Now) ,DateTime.GetDayOfMonth(DateTime.Now))
	Mycalendar.Initialize("dd.mm.yyyy",Mycalendar.PRC,"2.02.1990") 'start date
	Datepicker.SetThemeDark
	Datepicker.SetMinDate(Mycalendar)
	Mycalendar.Initialize("dd.mm.yyyy",Mycalendar.PRC,"2.02.2030") 'end date
	Datepicker.SetMaxDate(Mycalendar)
	Datepicker.CancelColor = Colors.White
	Datepicker.OkColor = Colors.White
	Datepicker.Title = "Selecione"
	Datepicker.CancelText = "Cancelar"
	Datepicker.OkText = "Ok"
	Datepicker.SetOnCancel("Cancel")
	Datepicker.show2("iki")
End Sub

Private Sub Label10_Click
	Panel9_Click
End Sub

Private Sub Panel11horaFim_Click
	
End Sub

Private Sub Panel10Horainicio_Click
	
End Sub


Sub Hinicio_OnDateSet(year As Int ,monthOfYear As Int , dayOfMonth As Int)
	Label12Hinicio.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
	Label12Hinicio.TextColor=Colors.Black
End Sub



Private Sub Label1Back_Click
'	StartActivity(Main)
'	Activity.Finish
	B4XPages.ClosePage(Me)
End Sub

Private Sub Label2Save_Click
	MsgboxAsync("Saved.", "")
End Sub

Private Sub Panel2Time_Click
	
End Sub

'Sub time_OnTimeSet (hourOfDay As Int ,minute As Int , second As Int)
'	Label13Time.Text=hourOfDay&":"&minute
'	Label13Time.TextColor=Colors.Black
'End Sub

Sub CreateRequest (Db As String) As DBRequestManager
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Db)
	Return Req
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub


Sub GetRecordHaciendas (UseDb As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_haciendas", Null)
	
	Dim cadena As String
	Dim separador As String
	Dim longitud As Int
	
	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		
		For Each row() As Object In res.Rows
			cadena = ""
			separador=" - "
			For Each record As Object In row
				cadena=cadena & record & separador
			Next
			longitud = cadena.Length
			cadena=cadena.SubString2(0, longitud - 3)
			Spinner2.Add(cadena)
			cadena=""
		Next
		
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub


Sub GetRecordClientes (UseDb As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_clientes", Null)
	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		req.PrintTable(res)
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub


Sub InsertRecord (Nombre As String, Salario As Int)
'	Dim cmd As DBCommand = CreateCommand("insert_employees", Array(Nombre, Salario))
'	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
'	Wait For(j) JobDone(j As HttpJob)
'	If j.Success Then
'		Log("Inserted successfully!")
'	End If
'	j.Release
End Sub

Sub DeleteRecord (Nombre As String)
'	Dim cmd As DBCommand = CreateCommand("delete_employees", Array(Nombre))
'	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
'	Wait For(j) JobDone(j As HttpJob)
'	If j.Success Then
'		Log("Deleted successfully!")
'	End If
'	j.Release
End Sub

Sub Spinner2_ItemClick (Position As Int, Value As Object)
	Dim nit As String
	Dim hacienda As String
	
	Spinner3.Clear
	
	Log(Position & " - " & Value)
	nit= "890307964"
	hacienda = Value
	hacienda = hacienda.SubString2(0, 3)
	
	GetRecordLotes ("BDPichucho",nit, hacienda)
End Sub

Sub GetRecordLotes (UseDb As String, nit As String, hda As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_lotes", Array(nit,hda))
	
	Dim cadena As String

	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		
		For Each row() As Object In res.Rows
			cadena = ""
			For Each record As Object In row
				cadena=record
				Spinner3.Add(cadena)
			Next
			'SpinLote.Add(cadena)
			'cadena=""
		Next
		
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub

Sub GetRecordLabores (UseDb As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_labores", Null)
	
	Dim cadena As String
	Dim separador As String
	Dim longitud As Int
	
	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		
		For Each row() As Object In res.Rows
			cadena = ""
			separador=" - "
			For Each record As Object In row
				cadena=cadena & record & separador
			Next
			longitud = cadena.Length
			cadena=cadena.SubString2(0, longitud - 3)
			Spinner4.Add(cadena)
			cadena=""
		Next
		
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub


Private Sub Spinner1_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub Spinner3_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub Spinner4_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub Spinner7_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub Spinner8_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub Spinner10_ItemClick (Position As Int, Value As Object)
	
End Sub






'Sub Hinicio_OnDateSet(year As Int ,monthOfYear As Int , dayOfMonth As Int)
'	Label12Hinicio.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
'	Label12Hinicio.TextColor=Colors.Black
'End Sub
'
'
'
'Sub Hfim_OnDateSet(year As Int ,monthOfYear As Int , dayOfMonth As Int)
'	Label13Hfim.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
'	Label13Hfim.TextColor=Colors.Black
'End Sub


'Sub Date_OnDateSet (year As Int ,monthOfYear As Int , dayOfMonth As Int)
'	Label10.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
'	Label10.TextColor=Colors.Black
'End Sub



Private Sub SD_xComboBoxNitPerson_ItemClick (Position As Int, Value As Object)
	nitEmpresaCBX=Value
	SD_xComboBoxHacienda.Clear
	If Value = "" Then
		nitEmpresaCBX = Null
	Else
		nitEmpresaCBX = Value
	End If
    
	' Mostrar el valor para depuración
	Log("Valor seleccionado: " & nitEmpresaCBX)
	
	Log("Posicion: "&Position&" VALUE: "&Value)
	SD_xComboBoxHacienda.Add("----Select----", "1")

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

	Log(nitEmpresaCBX)
	' Libera el trabajo HTTP
	j.Release
	' FIN DE LA CONSULTA DE LOS NITS
End Sub

Private Sub SD_xComboBoxHacienda_ItemClick (Position As Int, Value As Object)
	If Value = "" Then
		haciendaCBX = Null
	Else
		haciendaCBX = Value
	End If
	Log(haciendaCBX)
	SD_xComboBoxLote.Clear
	SD_xComboBoxLote.Add("----Select----", "1")

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

Private Sub SD_xComboBoxLote_ItemClick (Position As Int, Value As Object)
	LoteCBX = Value
	
	If Value = "" Then
		LoteCBX = Null
	Else
		LoteCBX = Value
	End If
	
	Log(LoteCBX)
End Sub

Private Sub SD_xComboBoxLabor_ItemClick (Position As Int, Value As Object)
	LaborCBX = Value
	If Value = "" Then
		LaborCBX = Null
	Else
		LaborCBX = Value
	
	End If
	Log(LaborCBX)
End Sub

Private Sub SD_xComboBoxConcepto_ItemClick (Position As Int, Value As Object)
	ConceptoCBX = Value
    If Value = "" Then
	ConceptoCBX = Null
	Else
	ConceptoCBX = Value
	End If
	' Buscar dstjo_Cncpto correspondiente al valor seleccionado en el Map
	Dim dstjo_Cncpto As String = ConceptoDataMap.Get(Value)

	' Mostrar el valor en el Log
	Log("Valor seleccionado: " & ConceptoCBX)
	Log("Dato dstjo_Cncpto: " & dstjo_Cncpto)
    
	' Hacer una decisión para habilitar el input basado en dstjo_Cncpto
	If dstjo_Cncpto = "N" Then ' Ajusta la condición según tu lógica
		' Habilitar el campo de entrada
		EditText3cantidat.Enabled = False
	Else
		' Deshabilitar el campo de entrada
		EditText3cantidat.Enabled = True
	End If
End Sub

Private Sub EditText2horas_TextChanged (Old As String, New As String)
	HorasText = New
	
	
	Log(HorasText)
End Sub

Private Sub EditText1percentage_TextChanged (Old As String, New As String)
	    PorcentageText= New
		Log(PorcentageText)
End Sub

Private Sub EditText3cantidat_TextChanged (Old As String, New As String)
	CantidadText = New
	
	Log(CantidadText)
End Sub

Private Sub EditText4obsv_TextChanged (Old As String, New As String)
	ObsvText =New
	
	Log(ObsvText)
End Sub

Private Sub Button1_Click
	Dim id As String


	' Obtener el nombre de la persona desde la página "DetailsPerson"
	id = B4XPages.GetPage("DetailsPerson").As(DetailsPerson).namePerson

	' Usar Regex para extraer la parte después del #
	Dim matcher As Matcher = Regex.Matcher("\#(.+)", id)

	If matcher.Find() Then
		id = matcher.Group(1) ' Obtiene la parte después de #
		Log("ID: " & id) ' Aquí puedes usar id según tus necesidades
	Else
		Log("No se encontró el carácter # en la cadena.")
	End If

	' Crear el comando para buscar la persona en la base de datos
	Dim cmd As DBCommand = CreateCommand("select_searchPerson", Array(id))
    
	' Aquí puedes agregar el código para ejecutar el comando y verificar la respuesta
	' Por ejemplo:
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
    
	' Ejecutar la consulta
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
    
	If j.Success Then
		
		' Aquí puedes manejar los resultados obtenidos
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)
        
		If res.Rows.Size > 0 Then
			' Procesar los datos recuperados
			Dim Req As DBRequestManager
			Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
			Dim cmd As DBCommand = CreateCommand("insert_Mvto_Trab_Propios", Array(id, FechaInicio, LaborCBX, 0, ConceptoCBX, nitEmpresaCBX, haciendaCBX, LoteCBX, HorasText, CantidadText, ObsvText, Null, PorcentageText))
			Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
			Wait For(j) JobDone(j As HttpJob)
			
			If j.Success Then
				MsgboxAsync("Inserción exitosa", "Éxito")
			Else
				Log("ID: " & id)
				Log("FechaInicio: " & FechaInicio)
				Log("LaborCBX: " & LaborCBX)
				Log("Valor fijo: 0")
				Log("ConceptoCBX: " & ConceptoCBX)
				Log("nitEmpresaCBX: " & nitEmpresaCBX)
				Log("haciendaCBX: " & haciendaCBX)
				Log("LoteCBX: " & LoteCBX)
				Log("HorasText: " & HorasText)
				Log("CantidadText: " & CantidadText)
				Log("ObsvText: " & ObsvText)
				Log("TurnoCBX: " & TurnoCBX)
				Log("PorcentageText: " & PorcentageText)
				Log("Error en el job: " & j.ErrorMessage)
				MsgboxAsync("Error al insertar: " & j.ErrorMessage, "Error")
			End If
			j.Release
    
		Else
			Dim Req As DBRequestManager
			Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
			Dim cmd As DBCommand = CreateCommand("insert_Mvto_Trab_Tmprles", Array(id, FechaInicio, LaborCBX, 0, ConceptoCBX, nitEmpresaCBX, haciendaCBX, LoteCBX, HorasText, CantidadText, ObsvText, Null, PorcentageText))
			Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)
			Wait For(j) JobDone(j As HttpJob)
			' Ejecutar la consulta
			If j.Success Then
				MsgboxAsync("Inserción exitosa", "Éxito")
			Else
				Log("ID: " & id)
				Log("FechaInicio: " & FechaInicio)
				Log("LaborCBX: " & LaborCBX)
				Log("Valor fijo: 0")
				Log("ConceptoCBX: " & ConceptoCBX)
				Log("nitEmpresaCBX: " & nitEmpresaCBX)
				Log("haciendaCBX: " & haciendaCBX)
				Log("LoteCBX: " & LoteCBX)
				Log("HorasText: " & HorasText)
				Log("CantidadText: " & CantidadText)
				Log("ObsvText: " & ObsvText)
				Log("TurnoCBX: " & TurnoCBX)
				Log("PorcentageText: " & PorcentageText)
				Log("Error en el job: " & j.ErrorMessage)
				MsgboxAsync("Error al insertar: " & j.ErrorMessage, "Error")
			End If
			j.Release
		End If

	Else
		Log("Error al ejecutar la consulta: " & j.ErrorMessage)
	End If
End Sub


Private Sub SD_xComboBoxTurno_ItemClick (Position As Int, Value As Object)
	
	If Value = Null Or Value = "" Then
		TurnoCBX = Null ' Si el valor está vacío, asignar Null
	Else
		TurnoCBX = Value ' Si no está vacío, asignar el valor
	End If
End Sub


Private Sub SwiftButton1Prueba_Click
	
	
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
				SD_xComboBoxHacienda.Add(NombreHacienda, Codg_Hacienda)
				
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
				SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacienda)
				ItemsLote.Add(Codg_Hacienda)
			Next
    
		Else
			' Si hay un error, muestra el mensaje
			Log("Error: " & j.ErrorMessage)
		End If
		SearchTemplateLote.SetItems(ItemsLote)
		SwiftButtonLote.Enabled = True
		' Libera el trabajo HTTP
		j.Release
		'***************** FIN CONSULTA LOTE ************************
	End If
End Sub

Private Sub SwiftButtonLote_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateLote, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonLote.xLBL.Text = SearchTemplateLote.SelectedItem
		Dim LOTECOMPLETO As String = SearchTemplateLote.SelectedItem
		Dim Partes() As String = Regex.Split(":", LOTECOMPLETO)
		LoteCBX = Partes(0) ' Obtiene el valor antes del ":" (ej: "LoteA")
	End If
End Sub

Private Sub SwiftButtonLabor_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateLabor, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonLabor.xLBL.Text = SearchTemplateLabor.SelectedItem
		Dim LABORCOMPLETO As String = SearchTemplateLabor.SelectedItem
		Dim Partes() As String = Regex.Split(":", LABORCOMPLETO)
	LaborCBX = Partes(0)
	
	End If
End Sub

Private Sub SwiftButtonConcepto_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateConcepto, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonConcepto.xLBL.Text = SearchTemplateConcepto.SelectedItem
		Dim CONCEPTOCOMPLETO As String = SearchTemplateConcepto.SelectedItem
		Dim Partes() As String = Regex.Split(":", CONCEPTOCOMPLETO)
		ConceptoCBX = Partes(0)
	End If
End Sub

Private Sub SwiftButtonTurno_Click
	Wait For (Dialog.ShowTemplate(SearchTemplateTurno, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		SwiftButtonTurno.xLBL.Text = SearchTemplateTurno.SelectedItem
	End If
End Sub