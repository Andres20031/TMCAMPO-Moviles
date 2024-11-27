B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Dim nitUpdate As String=""
	Dim haciendaUpdate As String
	
	Dim idMaquina As Int
	Dim tipo As String=""
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Dim Datepicker As Intellvold_DatePicker
	Dim Mycalendar As Intellvold_Calendar
	Dim Timepicker As Intellvold_TimePicker

	Dim Datepicker2 As Intellvold_DatePicker
	Dim Mycalendar2 As Intellvold_Calendar

	Private utilClass As util
	Private ScrollView1 As ScrollView
	Dim xui As XUI
	Private Panel3 As Panel
	Private xui As XUI
	Private Panel1 As Panel
	Private Label10 As Label
	Private SpinnerNit As Spinner
	Private EditText2area As EditText
	Private EditText1cmb As EditText
	Private Label13Time As Label
	Private EditText2HoraFim As EditText
	Private EditText1HoraInicio As EditText
	
	Private nit As String
	Private hacienda As String
	Private lote As String

'	Private SpinnerEleGasto As Spinner
'	Private SpinnerInsumo1 As Spinner
'	Private SpinnerInsumo2 As Spinner
'	Private SpinnerInsumo3 As Spinner
'	Private SpinnerInsumo4 As Spinner
	
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	
	Private CustomListView1Geral As CustomListView
	Private Panel1geral As Panel
	Private Label14Add As Label
	Private Button1AddIsumo As Button
	Private Label1RemoveInsumo As Label
	Private Label1Empty As Label
	Private Label2InsumoName As Label
	'Private EditText1NameInsumo As EditText
	Private EditText2QntInsumo As EditText
	Private Spinner1NameInsumo As Spinner
	
	Private intContadorInsumos As Int
	
	Private SD_xComboBoxNit As SD_xComboBox
	Private SD_xComboBoxHda As SD_xComboBox
	Private SD_xComboBoxLote As SD_xComboBox
	Private SD_xComboBoxLabor As SD_xComboBox
	Private SD_xComboBoxEleGasto As SD_xComboBox
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	
'	utilClass.Initialize
'	utilClass.SetStatusBarColor(Colors.White,0xB4008000)
'	Root.LoadLayout("form")
'	If tipo<>"new" Then
'		GetRecordNits("1")
'		GetRecordHaciendas(1)
'		GetRecordLabores(1)
'		GetRecordElegasto(1)
'	End If
'	CustomListView1Geral.DefaultTextBackgroundColor=0xFF25253D
'	CustomListView1Geral.DefaultTextColor=Colors.White
'	CustomListView1Geral.Add(CreateItem,"form1")
End Sub


Sub B4XPage_Appear
	Try	
		nitUpdate=""
		haciendaUpdate=""
		utilClass.Initialize
		utilClass.SetStatusBarColor(Colors.White,0xB4008000)
		Root.LoadLayout("form")
		CustomListView1Geral.DefaultTextBackgroundColor=0xFF25253D
		CustomListView1Geral.DefaultTextColor=Colors.White
		CustomListView1Geral.Add(CreateItem,"form1")		
		Sleep(20)
		If tipo="update" Then		
			Dim Cursor As Cursor
			Cursor = Starter.SQL1.ExecQuery("SELECT * FROM maquina where id="&idMaquina)
			For i = 0 To Cursor.RowCount - 1
				Cursor.Position = i
'				Log("=====Maquinas #"&i&"=====")
'				Log(Cursor.GetString("id"))
'				Log(Cursor.GetString("Nit"))
'				Log(Cursor.GetString("arealabor"))
'				Log(Cursor.GetString("fechaFim"))
'				Log(Cursor.GetString("fechaInicio"))
				Label10.text=Cursor.GetString("fechaInicio")
				Label13Time.text=Cursor.GetString("fechaFim")
				Label13Time.text=Cursor.GetString("fechaFim")
				EditText1HoraInicio.text=Cursor.GetString("arealabor")
				nitUpdate=Cursor.GetString("Nit")
				haciendaUpdate=Cursor.GetString("hacienda")
'				SpinnerNit.Add(nit)
				Log("NIT: "&nitUpdate)				
			Next
		Else
			Log("NIT: "&nit)
		End If
	
		Dim estado As String
		'Dim pDBName As String 
		
		estado = "N"
		GetRecordNits(Main.pDBName,estado)
		GetRecordHaciendas(Main.pDBName,estado)
		GetRecordLabores(Main.pDBName)
		GetRecordElegasto(Main.pDBName)
	intContadorInsumos=0
	listInsumos
	Catch
		Log(LastException)
	End Try
	
End Sub




Sub listInsumos
	removeAllExcelpFist

''	Log("TOTAL DE ITENS: "&CustomListView1Geral.Size)
	Dim NumberOfMatches As Int
	NumberOfMatches = Starter.SQL1.ExecQuerySingleResult("SELECT count(*) FROM insumo where idmaquina ="&idMaquina)
	CustomListView1Geral.DesignerLabel.Height=8dip
	CustomListView1Geral.AddTextItem("Insumos("&NumberOfMatches&")","title")
	Dim Cursor As Cursor
	Cursor = Starter.SQL1.ExecQuery("SELECT * FROM insumo where idmaquina ="&idMaquina)
	For i = 0 To Cursor.RowCount - 1
		Cursor.Position = i
	Dim	id As Int=Cursor.GetString("id")
		Log(Cursor.GetString("id"))
		Log(Cursor.GetString("name"))
		Log(Cursor.GetString("qnt"))		
		CustomListView1Geral.Add(CreateItemInsumos(i+1,id,Cursor.GetString("name"),Cursor.GetString("qnt")),"insumo")
	Next	
'		Log("TOU AQUI")
		' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
		Dim panel As B4XView = xui.CreatePanel("")
		panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)   
		' Carga el diseño previamente definido llamado "Cardp" en el panel creado
	panel.LoadLayout("emptyInsumos")
	panel.Height=Panel1geral.Height
	If i=0 Then
		Label1Empty.Visible=True
	Else
		Label1Empty.Visible=False
		Button1AddIsumo.Top=Label1Empty.top
		panel.Height=Button1AddIsumo.Height
	End If
		
	
		
	CustomListView1Geral.Add(panel,0)
	CustomListView1Geral.ScrollToItem(CustomListView1Geral.Size-1)
	
 
	
End Sub


Sub removeAllExcelpFist
	For iw= CustomListView1Geral.Size-1 To  1 Step -1
		
		If CustomListView1Geral.GetValue(iw)<>"form1" Then
			Try
'				Log(CustomListView1Geral.GetValue(iw))
				LogColor("REMOVE: "&iw,Colors.Red)
				CustomListView1Geral.RemoveAt(iw)
			
			Catch
				Log(LastException)
			End Try
'			
		End If
	Next
End Sub
' Este subprocedimiento crea un nuevo panel y carga un diseño previamente definido llamado "Cardp"
Private Sub CreateItemInsumos(i As Int,id As Int, name As String, qnt As String) As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 450dip)   
	' Carga el diseño previamente definido llamado "Cardp" en el panel creado
	panel.LoadLayout("Cardisumo")	
		
'	EditText1NameInsumo.Color=Colors.Transparent
	EditText2QntInsumo.Color=Colors.Transparent
	Label2InsumoName.Text="Insumo #"&i 
	Label1RemoveInsumo.Tag=id
	Spinner1NameInsumo.Tag=id
	EditText2QntInsumo.Tag=id
	EditText2QntInsumo.text=qnt
	Spinner1NameInsumo.Prompt=name
	panel.Height=Panel1geral.Height
	
	FillSpinner(name)
	
		
'	For iw= Spinner1NameInsumo.Size-1 To  1 Step -1		
'	If Spinner1NameInsumo.GetItem(iw)=name Then
'		Log(name) 
'			Spinner1NameInsumo.Add(name)
'		Else
'			
'	End If
'	Next
'	
'	For i=0 To 10
'		Spinner1NameInsumo.Add("ITEM #"&i)
'	Next
	Return panel
End Sub

'Original Abbduk
Sub FillSpinner(name As String)
	Try
		Spinner1NameInsumo.Clear
'		Spinner1NameInsumo.Add(" ")
		Dim Cursor As Cursor
'		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM namesinsumo"&name)
		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM namesinsumo where name='"&name&"'")
'		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM namesinsumo")
		For i = 0 To Cursor.RowCount - 1
			Cursor.Position = i
			Log(Cursor.GetString("name"))
			Spinner1NameInsumo.Add(Cursor.GetString("name"))
		Next
		
		If name="NO NAME" Then
			Spinner1NameInsumo.Add("")
		End If
		Dim Cursor As Cursor
'		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM namesinsumo"&name)
'		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM namesinsumo where id="&name)
		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM namesinsumo")
		For i = 0 To Cursor.RowCount - 1
			Cursor.Position = i
'			Log(Cursor.GetString("name"))
			Spinner1NameInsumo.Add(Cursor.GetString("name"))
		Next
	Catch
		Log(LastException)
	End Try
	Sleep(20)
End Sub


''Sub FillSpinner(name As String)
''	Try
''		'Spinner1NameInsumo.Clear
''
''		Dim req As DBRequestManager = CreateRequest
''		Dim cmd As DBCommand = CreateCommand("select_insumos", Null)
''
''		Dim cadena As String
''		Dim separador As String
''		Dim longitud As Int
''
''		Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
''		If j.Success Then
''			req.HandleJobAsync(j, "req")
''			Wait For (req) req_Result(res As DBResult)
''			'work with result
''			'req.PrintTable(res)
''		
''			For Each row() As Object In res.Rows
''				cadena = ""
''				separador=" - "
''				For Each record As Object In row
''					cadena=cadena & record '& separador
''				Next
''				'longitud = cadena.Length
''				'cadena=cadena.SubString2(0, longitud - 3)
''				Spinner1NameInsumo.Add(cadena)
''				cadena=""
''			Next
''		
''		Else
''			Log("ERROR: " & j.ErrorMessage)
''		End If
''		j.Release
''	Catch
''		Log(LastException)
''	End Try
''	Sleep(20)
''End Sub



' Este subprocedimiento crea un nuevo panel y carga un diseño previamente definido llamado "Cardp"
Private Sub CreateItem As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)
    
	' Carga el diseño previamente definido llamado "Cardp" en el panel creado
	panel.LoadLayout("scroolUI")
	
	panel.Height=Panel1geral.Height
	
'    
'	' Crea un nuevo objeto CSBuilder para formatear el texto
'	Dim cs As CSBuilder
'	cs.Initialize
'    
'	' Agrega el texto "Fecha: " en negrita y negro, seguido de la fecha en gris y sin negrita
'	cs.Bold.Color(Colors.Black).Append("Fecha: ").Pop.Color(Colors.Gray).Append(Fecha & CRLF).Pop
'    
'	' Agrega el texto "Hacienda: " en negrita y negro, seguido de la hacienda en gris y sin negrita
'	cs.Bold.Color(Colors.Black).Append("Hacienda: ").Pop.Color(Colors.Gray).Append(hacienda & CRLF).Pop
'    
'	' Agrega el texto "Lote: " en negrita y negro, seguido del lote en gris y sin negrita
'	cs.Bold.Color(Colors.Black).Append("Lote: ").Pop.Color(Colors.Gray).Append(lote & CRLF).PopAll
'    
'	' Asigna el texto formateado al control de etiqueta "Label20Desc"
'	Label20Desc.Text = cs
'    
'	' Establece la propiedad "Tag" de los botones "Button1Check" y "Button2Del" a la posición proporcionada como argumento
'	Button1Check.Tag = position
'	Button2Del.Tag = position
'    
	' Devuelve el panel creado con los datos proporcionados
	Return panel
End Sub



Sub Date_OnDateSet (year As Int ,monthOfYear As Int , dayOfMonth As Int)
	Label10.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
	Label10.TextColor=Colors.Black
End Sub

Sub can_OnCancelDate ()
	ToastMessageShow("cancel" ,False)
End Sub

Private Sub Panel9_Click
	Datepicker.Initialize("Date",2023 ,DateTime.GetMonth(DateTime.Now) ,DateTime.GetDayOfMonth(DateTime.Now))
	Mycalendar.Initialize("dd.mm.yyyy",Mycalendar.PRC,"2.02.2023") 'start date
	Datepicker.SetThemeDark
	Datepicker.SetMinDate(Mycalendar)
	Mycalendar.Initialize("dd.mm.yyyy",Mycalendar.PRC,"2.12.2025") 'end date
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
	configTime("TimeFim")
End Sub

Private Sub Panel10Horainicio_Click
	configTime("TimeInicio")
End Sub


Sub configTime(tag As String)
'	Timepicker.Initialize(tag ,21 ,45 ,True)
'	Timepicker.CancelColor = Colors.White
'	Timepicker.CancelText = "Cancel"
'	Timepicker.OkColor = Colors.White
'	Timepicker.OkText = "OK"
'	Timepicker.SetOnCancel("Time")
'	Timepicker.SetThemeDark
'	Timepicker.show("bir")
'	Timepicker.Title = "Select time"

	Datepicker.Initialize(tag,2022 ,DateTime.GetMonth(DateTime.Now) ,DateTime.GetDayOfMonth(DateTime.Now))
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


Private Sub Label1Back_Click
	B4XPages.ClosePage(Me)
End Sub
Sub getValuesINTheEdittexts	
	Dim sb As StringBuilder
	sb.Initialize	
	Try
		Dim Cursor As Cursor
		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM insumo where idmaquina ="&idMaquina)
	For i = 0 To Cursor.RowCount - 1
		Cursor.Position = i
		Log("=====ITEM #"&i&"=====")
		Log(Cursor.GetString("idmaquina"))
		Log(Cursor.GetString("name")&"--"&Cursor.GetString("qnt"))
		sb.Append(Cursor.GetString("name")&"--"&Cursor.GetString("qnt")).Append(CRLF)'.Append("Second line")
	Next
'		MsgboxAsync(sb.ToString, "SELECT * FROM insumo where idmaquina =1")
	Log(sb.ToString)
'		Log(sb.ToString)
		Dim Cursor As Cursor
		Cursor = Starter.SQL1.ExecQuery("SELECT * FROM maquina")
		For i = 0 To Cursor.RowCount - 1
			Cursor.Position = i
			Log("=====Maquinas #"&i&"=====")
			Log(Cursor.GetString("id"))'&"--"&Cursor.GetString("qnt"))
'			sb.Append(Cursor.GetString("name")&"--"&Cursor.GetString("qnt")).Append(CRLF)'.Append("Second line")
		Next
		B4XPages.ShowPageAndRemovePreviousPages("ListDados")
		B4XPages.ClosePage(Me)
		B4XPage_Created(Root)	
	Catch
		Log(LastException)
	End Try
	Sleep(20)
End Sub
	
	

Sub validation(edt As EditText) 
	If edt.Text="" Then
'		Return False
		edt.HintColor=Colors.Red
		Sleep(350)
		edt.HintColor=Colors.Gray'.
	Else
'		Return True
	End If		
End Sub

Private Sub Label2Save_Click
'	MsgboxAsync("Grabado.", "")
	Try
		Dim salario As String 
		salario="10"
		InsertRecord(Main.pDBName ,"99",salario)
		'InsertRecord("99","Prueba")
		
		Log(Label10.text&"----"&Label13Time.text)
		Log("HACIENDA: "&haciendaUpdate)
		If tipo="new" Then
			'Starter.SQL1.ExecNonQuery2("DELETE maquina )", Array As Object(idMaquina,Label10.text,Label13Time.text,SpinnerNit.SelectedItem,EditText1HoraInicio.text,SD_xComboBoxHda.SelectedItem,SD_xComboBoxLote.SelectedItem,SD_xComboBoxLabor.SelectedItem))

			'Starter.SQL1.ExecNonQuery2("INSERT INTO maquina VALUES (?, ?, ?,?,?,?,?,?)", Array As Object(idMaquina,Label10.text,Label13Time.text,SpinnerNit.SelectedItem,EditText1HoraInicio.text,SD_xComboBoxHda.SelectedItem,SD_xComboBoxLote.SelectedItem,SD_xComboBoxLabor.SelectedItem))
			'Sleep(90)
			'getValuesINTheEdittexts
		Else
			Log("update")
		End If
	
	Catch
		Log(LastException)
	End Try
		
End Sub


Sub InsertRecord (UseDb As String, Nombre As String, Salario As Int)
    Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("insert_tipoReparacion", Array(Nombre, Salario))
    'Dim j As HttpJob = req.ExecuteBatch(Array(cmd), Null)
    Dim j As HttpJob = req.ExecuteCommand(cmd, Null)
    Wait For(j) JobDone(j As HttpJob)
    If j.Success Then
        Log("Inserted successfully!")
    End If
    j.Release
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





Private Sub Panel2Time_Click
	configTime("Label13Time")
End Sub

'Private Sub Panel2Time_Click
'	Datepicker2.Initialize("Date",2023 ,DateTime.GetMonth(DateTime.Now) ,DateTime.GetDayOfMonth(DateTime.Now))
'	Mycalendar2.Initialize("dd.mm.yyyy",Mycalendar2.PRC,"2.02.2023") 'start date
'	Datepicker2.SetThemeDark
'	Datepicker2.SetMinDate(Mycalendar)
'	Mycalendar2.Initialize("dd.mm.yyyy",Mycalendar2.PRC,"2.12.2023") 'end date
'	Datepicker2.SetMaxDate(Mycalendar2)
'	Datepicker2.CancelColor = Colors.White
'	Datepicker2.OkColor = Colors.White
'	Datepicker2.Title = "Selecione"
'	Datepicker2.CancelText = "Cancelar"
'	Datepicker2.OkText = "Ok"
'	Datepicker2.SetOnCancel("Cancel")
'	Datepicker2.show2("iki")
'End Sub

Private Sub Label13Time_Click
	configTime("Label13Time")
End Sub

Sub Label13Time_OnDateSet(year As Int ,monthOfYear As Int , dayOfMonth As Int)
	Label13Time.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
	Label13Time.TextColor=Colors.Black
End Sub

'Sub Date_OnDateSet (year As Int ,monthOfYear As Int , dayOfMonth As Int)
'	Label13Time.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
'	Label13Time.TextColor=Colors.Black
'End Sub


'Sub time_OnTimeSet (hourOfDay As Int ,minute As Int , second As Int)
'	Label13Time.Text=hourOfDay&":"&minute
'	Label13Time.TextColor=Colors.Black
'End Sub

'Sub CreateRequest As DBRequestManager
'	Dim req As DBRequestManager
'	Dim bd As String
'	bd =Main.pDBName
'	'req.Initialize(Me, rdcLink, bd)
'	
'	req.Initialize(Me, rdcLink & "?DBName=" & Db)
'	
'	Return req
'End Sub

Sub CreateRequest (Db As String) As DBRequestManager
    Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" &  Main.pDBName)
    Return Req
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub

'Sub GetRecordNits (UseDb As String, estado As String)
'	Dim req As DBRequestManager = CreateRequest(UseDb)
'	Dim cmd As DBCommand = CreateCommand("select_nit", Array(estado))
'	
'	Dim cadena As String
'	Dim separador As String
'	Dim longitud As Int
'	
'	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
'	If j.Success Then
''		Log("NIT: "&j.GetString)
'		req.HandleJobAsync(j, "req")
'		Wait For (req) req_Result(res As DBResult)
'		'work with result
'		'req.PrintTable(res)
'		SpinnerNit.Add("----Select----")
'	
'		For Each row() As Object In res.Rows
'			cadena = ""
'			separador=" - "
'			For Each record As Object In row
''				Log(record)
'				cadena=cadena & record & separador
'			Next
'			longitud = cadena.Length
'			cadena=cadena.SubString2(0, longitud - 3)
'			If nitUpdate=cadena Then
'				Log("NIT: "&nitUpdate)
'				
'				SpinnerNit.Clear
'				SpinnerNit.Add(nitUpdate)
'				Else
'				SpinnerNit.Add(cadena)
'				cadena=""
'			End If
'		
'		Next
'		
'	Else
'		Log("ERROR: " & j.ErrorMessage)
'	End If
'	j.Release
'End Sub

Sub GetRecordNits (UseDb As String, estado As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_nit", Null)
	
	Dim cadena As String
	Dim separador As String
	Dim longitud As Int
	
	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
'		Log("NIT: "&j.GetString)
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		SD_xComboBoxNit.Add("----Select----","1")
		Dim INTRegistros As Int
	
		INTRegistros=0
		For Each row() As Object In res.Rows
			cadena = ""
			separador=" - "
			For Each record As Object In row
'				Log(record)
				cadena=cadena & record & separador
			Next
			longitud = cadena.Length
			cadena=cadena.SubString2(0, longitud - 3)
			INTRegistros=INTRegistros+1
			If nitUpdate=cadena Then
				Log("NIT: "&nitUpdate)
				
				'SpinnerNit.Clear
				SD_xComboBoxNit.Add(nitUpdate,INTRegistros)
			Else
				SD_xComboBoxNit.Add(cadena,INTRegistros)
				cadena=""
			End If
		
		Next
		
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub


Sub GetRecordHaciendas (UseDb As String, estado As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_haciendas", Array(estado))
'	SD_xComboBoxHda.Add(cadena)
	Dim cadena As String
	Dim separador As String
	Dim longitud As Int
	
	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
'		SD_xComboBoxHda.Add("")
		SD_xComboBoxHda.Add("----Select----",1)
		SD_xComboBoxLote.Add("----Select----",1)
		For Each row() As Object In res.Rows
			cadena = ""
			separador=" - "
			For Each record As Object In row
				cadena=cadena & record & separador
'				Log(row)
'				Log(record)
			Next
			
			Log("cadena: "&cadena)
			Log("hacienda: "&haciendaUpdate)
			If cadena.Contains(haciendaUpdate) Then
				longitud = cadena.Length
				cadena=cadena.SubString2(0, longitud - 3)
				SD_xComboBoxHda.Add(cadena,1)
				Else
				longitud = cadena.Length
				cadena=cadena.SubString2(0, longitud - 3)
				SD_xComboBoxHda.Add(cadena,1)
			End If
'			SD_xComboBoxHda.Add(cadena)
			cadena=""
		Next
'		SD_xComboBoxHda.SelectedIndex=0
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub

Sub SD_xComboBoxHda_ItemClick (Position As Int, Value As Object)
	'Dim nit As String
	'Dim hacienda As String
	Log(Value)
	
	SD_xComboBoxLote.Clear
	
'	Log(Position & " - " & Value)
	nit = "800246222"
	haciendaUpdate = Value
	hacienda = SD_xComboBoxHda.GetItem(Position)
	hacienda = hacienda.SubString2(0, 3)
	Log(hacienda)
	GetRecordLotes (Main.pDBName,Main.pNit, hacienda)
End Sub

Sub GetRecordLotes (UseDb As String, nitLote As String, hda As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_lotes", Array(nitLote,hda))
	
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
				SD_xComboBoxLote.Add(cadena,1)
			Next
			'SpinLote.Add(cadena)
			'cadena=""
		Next
		
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub


Sub SD_xComboBoxLote_ItemClick (Position As Int, Value As Object)
	'Dim nit As String
	'Dim hacienda As String
	
	'SD_xComboBoxLote.Clear
	
	Log(Position & " - " & Value)
	'nit= "890307964"
	lote = Value
	'hacienda = hacienda.SubString2(0, 3)
	Log(hacienda)
	GetRecordLotesArea (Main.pDBName,nit, hacienda,lote)
End Sub

Sub GetRecordLotesArea (UseDb As String, nitlote As String, hda As String, loteArea As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_AreaSuertes", Array(nitlote,hda,loteArea))
	
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
				'SD_xComboBoxLote.Add(cadena)
				EditText2HoraFim.Text=cadena
				EditText2HoraFim.Enabled =False
				'EditText2HoraFim.TextColor=0x0000FF
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
		SD_xComboBoxLabor.Add("----Select----",1)
		
		For Each row() As Object In res.Rows
			cadena = ""
			separador=" - "
			For Each record As Object In row
				cadena=cadena & record & separador
			Next
			longitud = cadena.Length
			cadena=cadena.SubString2(0, longitud - 3)
			SD_xComboBoxLabor.Add(cadena,1)
			cadena=""
		Next
		
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub

Sub GetRecordElegasto (UseDb As String)
	Dim req As DBRequestManager = CreateRequest(UseDb)
	Dim cmd As DBCommand = CreateCommand("select_elegasto", Null)
	
	Dim cadena As String
	Dim separador As String
	Dim longitud As Int
	
	Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j As HttpJob)
	If j.Success Then
		req.HandleJobAsync(j, "req")
		Wait For (req) req_Result(res As DBResult)
		'work with result
		'req.PrintTable(res)
		SD_xComboBoxEleGasto.Add("----Select----",1)		
		For Each row() As Object In res.Rows
			cadena = ""
			separador=" - "
			For Each record As Object In row
				cadena=cadena & record & separador
			Next
			longitud = cadena.Length
			cadena=cadena.SubString2(0, longitud - 3)
			SD_xComboBoxEleGasto.Add(cadena,1)
			cadena=""
		Next
		
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
End Sub





Private Sub SpinnerNit_ItemClick (Position As Int, Value As Object)
	Log(Value)
End Sub


Private Sub SD_xComboBoxLabor_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub Spinner7_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub Spinner8_ItemClick (Position As Int, Value As Object)
	
End Sub

Private Sub SpinnerNit0_ItemClick (Position As Int, Value As Object)
	
End Sub


'Sub InsertRecord (Nombre As String, Salario As Int)
'	Dim cmd As DBCommand = CreateCommand("insert_employees", Array(Nombre, Salario))
'	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
'	Wait For(j) JobDone(j As HttpJob)
'	If j.Success Then
'		Log("Inserted successfully!")
'	End If
'	j.Release
'End Sub
'
'Sub DeleteRecord (Nombre As String)
'	Dim cmd As DBCommand = CreateCommand("delete_employees", Array(Nombre))
'	Dim j As HttpJob = CreateRequest.ExecuteBatch(Array(cmd), Null)
'	Wait For(j) JobDone(j As HttpJob)
'	If j.Success Then
'		Log("Deleted successfully!")
'	End If
'	j.Release
'End Sub

 

Private Sub Button1AddIsumo_Click	
	Try
	
		Button1AddIsumo=Sender
		Starter.SQL1.ExecNonQuery2("INSERT INTO insumo VALUES (?, ?, ?,?)", Array As Object(Null,"NO NAME","0",idMaquina))
		intContadorInsumos=	intContadorInsumos + 1
		listInsumos
	Catch
		Log(LastException)
	End Try
	
End Sub

Private Sub Label1RemoveInsumo_Click
	Label1RemoveInsumo=Sender
	Log(Label1RemoveInsumo.Tag)
	Dim id As Int=Label1RemoveInsumo.Tag
	Starter.SQL1.ExecNonQuery2("DELETE from insumo where id=?", Array As Object(id))	
	listInsumos
End Sub

'Private Sub EditText1NameInsumo_TextChanged (Old As String, New As String)
'	Try
'		EditText1NameInsumo=Sender
''		Log(EditText2QntInsumo.Tag)
'		Dim id As Int=EditText1NameInsumo.Tag
'		
'		Starter.updateInsumo(EditText1NameInsumo.Text,"",id)
'		selectSQl(id)
'		
'	Catch
'		Log(LastException)
'	End Try
'	
'End Sub

Private Sub EditText2QntInsumo_TextChanged (Old As String, New As String)
	Try	
	EditText2QntInsumo=Sender
'		Log(EditText2QntInsumo.Tag)
		Dim id As Int=EditText2QntInsumo.Tag
		Starter.updateInsumo("",EditText2QntInsumo.text,id,idMaquina)
		selectSQl(id)
		
	Catch
		Log(LastException)
	End Try
End Sub


Sub selectSQl(id As Int)
	Try
		Dim Cursor As Cursor
	Cursor = Starter.SQL1.ExecQuery("SELECT * FROM insumo where id="&id)
	For i = 0 To Cursor.RowCount - 1
		Cursor.Position = i
'		Dim	id As Int=Cursor.GetString("id")
''		Log(Cursor.GetString("id"))
'		Log(Cursor.GetString("name"))
'		Log(Cursor.GetString("qnt"))
'		CustomListView1Geral.Add(CreateItemInsumos(i+1,id),"insumo")
	Next
	Catch
		Log(LastException)
	End Try
	Sleep(20)
	
End Sub

Private Sub Spinner1NameInsumo_ItemClick (Position As Int, Value As Object)
	Spinner1NameInsumo=Sender
	Log(Spinner1NameInsumo.Tag)
	Log(Spinner1NameInsumo.SelectedItem)
	Dim id As Int=Spinner1NameInsumo.Tag		
	Starter.updateInsumo(Spinner1NameInsumo.SelectedItem,"",id,idMaquina)
	selectSQl(id)
End Sub

'Sub B4XPage_Disappear 'As ResumableSub
'	B4XPages.ShowPageAndRemovePreviousPages("ListDados")
''	B4XPages.ClosePage(Me)
''	B4XPage_Created(Root)
''	Return False
'End Sub


