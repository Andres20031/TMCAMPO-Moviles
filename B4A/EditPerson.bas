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