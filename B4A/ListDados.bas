B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private utilClass As util
	Dim xui As XUI
	Private CLV_Persons As CustomListView
'	Private Label20Name As Label
'	Private AnotherProgressBar1Dias_reportados As B4XProgressBar
'	Private AnotherProgressBar2Horas_Extras As B4XProgressBar
	Private Label3 As Label
	Private Label1Details As Label
'	Private LabelName As Label
	Private Label1Details2 As Label
	Private Button1agendar As Button
	Private Button1Check As Button
	Private Button2Del As Button
	Private Label4Final As Label
	Private Label3Inicial As Label
	Dim cd As CustomLayoutDialog
	Dim Datepicker As Intellvold_DatePicker
	Dim Mycalendar As Intellvold_Calendar
	Private EditText1Area As EditText
	Private EditText1TextArea As EditText
	Private Label20Desc As Label
	Private Label2 As Label
	Private Label1IdMaquina As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	utilClass.Initialize
	utilClass.SetStatusBarColor(Colors.White,Colors.White)
	Root.LoadLayout("ListPerson")
	Label3.Text="List dados"
'	listDadso
End Sub

Sub B4XPage_Appear	
	listDadosMaquina
End Sub


Sub listDadso
	CLV_Persons.Clear
	Dim Cursor As Cursor
	Cursor = Starter.SQL1.ExecQuery("SELECT * FROM dados")
	For i = 0 To Cursor.RowCount - 1
		Cursor.Position = i
		Log(Cursor.GetString("Consecutivo"))
'		Hacienda TEXT, Lote TEXT, labor TEXT)")
		CLV_Persons.Add(CreateItem(Cursor.GetString("Consecutivo"),Cursor.GetString("Fecha_programa"),Cursor.GetString("NIT"),Cursor.GetString("Hacienda"),Cursor.GetString("Lote"),Cursor.GetString("labor")),i)
	Next
	If i=0 Then
		Dim p As Panel
		p.Initialize("")
		p.LoadLayout("errorLayout")
		p.SetLayout(0,0,100%x,100%y)
		CLV_Persons.AsView.AddView(p,0,0,100%x,100%y)
	End If
End Sub


Sub listDadosMaquina
	CLV_Persons.Clear
	Label2.Text=Chr(0xE145)
	Label3.Text="Labores de Campo"
	Dim Cursor As Cursor
	Cursor = Starter.SQL1.ExecQuery("SELECT * FROM maquina")
	For i = 0 To Cursor.RowCount - 1
	Cursor.Position = i
	Log("=====Maquinas #"&i&"=====")
	Log(Cursor.GetString("id"))	
''		Dim id As String=Cursor.GetString("id")
		Dim Hacienda As String=Cursor.GetString("hacienda")
		Dim Lote As String=Cursor.GetString("Lote")
		Dim labor As String=Cursor.GetString("labor")
		CLV_Persons.Add(CreateItemMaquinas(Hacienda,Lote,labor),Cursor.GetString("id"))
	Next
	Log(i)
	If i=0 Then
		Dim p As Panel
		p.Initialize("")
		p.SetLayout(0,0,CLV_Persons.AsView.Width,CLV_Persons.AsView.Height)
		p.LoadLayout("errorLayout")		
		CLV_Persons.Add(p,0)			
	End If
End Sub


' Este subprocedimiento crea un nuevo panel y carga un diseño previamente definido llamado "Cardp"
Private Sub CreateItemMaquinas (Hacienda As String, Lote As String, labor As String)As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 70dip)
	panel.LoadLayout("cardMaquina")
	Dim legend As String=Label1IdMaquina.Text
	legend=	legend.Replace("{Hacienda}",Hacienda)
	legend=	legend.Replace("{Lote}",Lote)
	legend=	legend.Replace("{labor}",labor)
	Label1IdMaquina.Text=legend
	Return panel
End Sub



Private Sub CreateItem(Consecutivo,Fecha_programa,NIT, Hacienda, Lote As String, labor As String) As Panel
	'Se crea una nueva vista de panel con un ID vacío.
	Dim Panel As B4XView = xui.CreatePanel("")
	'Se establece la posición y el tamaño del panel animándolo.
	Panel.SetLayoutAnimated(1, 0, 0, 100%x, 140dip)
	'Se carga el diseño "CartDep" en el panel.
	Panel.LoadLayout("cardDados")
'	LabelName.Text=NIT
'	Dim cs As CSBuilder
'	cs.Initialize.Color(Colors.Red).Bold.Append("Hello ").Pop.Underline.Append("World!!!").PopAll
'	Label1Details.Text = cs
	
	' Crea un nuevo objeto CSBuilder para formatear el texto
	Dim cs As CSBuilder
	cs.Initialize
    
	' Agrega el texto "Fecha: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Consecutivo: ").Pop.Color(Colors.Gray).Append(Consecutivo & CRLF).Pop
    
	' Agrega el texto "Hacienda: " en negrita y negro, seguido de la hacienda en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Fecha programa: ").Pop.Color(Colors.Gray).Append(Fecha_programa & CRLF).Pop
    
	' Agrega el texto "Lote: " en negrita y negro, seguido del lote en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("NIT: ").Pop.Color(Colors.Gray).Append(NIT & CRLF).PopAll
	
    
	' Asigna el texto formateado al control de etiqueta "Label20Desc"
	Label1Details.Text = cs
'	Label1Details.Width=-2
	Dim cs As CSBuilder
	cs.Initialize
    
	' Agrega el texto "Fecha: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Hacienda: ").Pop.Color(Colors.Gray).Append(Hacienda & CRLF).Pop
    
	' Agrega el texto "Hacienda: " en negrita y negro, seguido de la hacienda en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Lote: ").Pop.Color(Colors.Gray).Append(Lote & CRLF).Pop
    
	cs.Bold.Color(Colors.Black).Append("Labor: ").Pop.Color(Colors.Gray).Append(labor & CRLF).PopAll

	
	Label1Details2.Text = cs
	
	Button1agendar.Tag=Consecutivo
	Button1Check.Tag=Consecutivo
	Button2Del.Tag=Consecutivo
	Return Panel
End Sub

'Private Sub CLV_Persons_ItemClick (Index As Int, Value As Object)
'	'Muestra la página "ListPerson" y elimina todas las páginas anteriores de la pila de navegación.
'	B4XPages.ShowPage("DetailsPerson")
'	B4XPages.GetPage("DetailsPerson").As(DetailsPerson).namePerson=Value
'End Sub

Private Sub Label1_Click
	B4XPages.ClosePage(Me)
End Sub

Private Sub Button2Del_Click
	Button2Del=	Sender
	Log(Button2Del.Tag)
	Dim id As Int=Button2Del.Tag
	Button1agendar=	Sender
	Dim sf As Object = cd.ShowAsync("", "", "", "", Null, True)
	cd.SetSize(100%x,35%y)
	Wait For (sf) Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("DialogDelete")
	
	Label20Desc.Text=Label20Desc.Text.Replace("{id}",id)
	EditText1TextArea.Color=Colors.Transparent
	DialogPanel.Color=Colors.Transparent
	Wait For (sf) Dialog_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Log("DADOS:")
		Log(EditText1TextArea.Text)
		Log("=======================")
		Starter.SQL1.ExecNonQuery2("DELETE from dados where Consecutivo=?", Array As Object(id))
		Sleep(300)
		listDadso
		ToastMessageShow(Button2Del.Tag&" DELETED",False)
	End If


	'
'	Msgbox2Async("Question about delete?", "Title", "Yes", "Cancel", "No", Null, False)
'	Wait For Msgbox_Result (Result As Int)
'	If Result = DialogResponse.POSITIVE Then
'		Dim id As Int=Button2Del.Tag
'		Starter.SQL1.ExecNonQuery2("DELETE from dados where Consecutivo=?", Array As Object(id))
'	 	Sleep(300)
'		listDadso
'		
'		ToastMessageShow(Button2Del.Tag&" DELETED",False)
'	End If
	
End Sub

Private Sub Button1Check_Click
	Button1Check=	Sender
	Log(Button1Check.Tag)
	Dim	id As Int=Button1Check.Tag
	
	Dim sf As Object = cd.ShowAsync("", "", "", "", Null, False)
	cd.SetSize(100%x,30%y)
	Wait For (sf) Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("DialogDone")
	Label20Desc.Text=Label20Desc.Text.Replace("{id}",id)
	
	DialogPanel.Color=Colors.Transparent
	Wait For (sf) Dialog_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Log("DADOS:")
		
		Log(Label3Inicial.Text)
		Log(Label4Final.Text)
'		Log(EditText1Area.Text)
		Log("=======================")
	End If
	
End Sub

Private Sub Button1agendar_Click
	Button1agendar=	Sender
	Log(Button1agendar.Tag)
	
	Dim	id As Int=Button1agendar.Tag
	
	Dim sf As Object = cd.ShowAsync("", "", "", "", Null, False)
	cd.SetSize(100%x,40%y)
	Wait For (sf) Dialog_Ready (DialogPanel As Panel)
	DialogPanel.LoadLayout("dialogAgenda")
	Label20Desc.Text=Label20Desc.Text.Replace("{id}",id)
	EditText1Area.Color=Colors.Transparent
	DialogPanel.Color=Colors.Transparent
	Wait For (sf) Dialog_Result (Result As Int)
	If Result = DialogResponse.POSITIVE Then
		Log("DADOS:")
		
		Log(Label3Inicial.Text)
		Log(Label4Final.Text)
		Log(EditText1Area.Text)
		Log("=======================")
		
	End If
End Sub

Private Sub Label3Inicial_Click
	configTime("TimeInicio")

End Sub

Private Sub Label4Final_Click
	configTime("TimeFim")
	
End Sub


Sub configTime(tag As String)

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



Sub TimeInicio_OnDateSet(year As Int ,monthOfYear As Int , dayOfMonth As Int)
	Label3Inicial.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
	Label3Inicial.TextColor=Colors.Black
 
End Sub

Sub TimeFim_OnDateSet(year As Int ,monthOfYear As Int , dayOfMonth As Int)
	Label4Final.Text=year&"/"&(NumberFormat(monthOfYear,2 ,0))&"/"&NumberFormat(dayOfMonth ,2 ,0)
	Label4Final.TextColor=Colors.Black
End Sub

Private Sub Button1Canvel_Click
	cd.CloseDialog(DialogResponse.NEGATIVE)
End Sub

Private Sub Button1agendarPOPuo_Click
	cd.CloseDialog(DialogResponse.POSITIVE)
	
End Sub

Private Sub CLV_Persons_ItemClick (Index As Int, Value As Object)
	Log(Value)
	B4XPages.ClosePage(B4XPages.GetPage("form"))
	Sleep(90)
	B4XPages.GetPage("form").As(Form).tipo="update"
	B4XPages.GetPage("form").As(Form).idMaquina=Value
	B4XPages.ShowPage("Form")
End Sub

Private Sub Label2_Click
	Button1AddIsumo_Click
End Sub

Private Sub Button1AddIsumo_Click
	B4XPages.ClosePage(B4XPages.GetPage("form"))
	Sleep(90)
	B4XPages.GetPage("form").As(Form).tipo="new"
	B4XPages.GetPage("form").As(Form).idMaquina=Rnd(0001,9999)
	B4XPages.ShowPage("Form")
End Sub

Private Sub Label1Back_Click
	B4XPages.ClosePage(Me)
End Sub