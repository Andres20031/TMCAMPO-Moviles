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
	Private Label20Name As Label
	Private AnotherProgressBar1Dias_reportados As B4XProgressBar
	Private AnotherProgressBar2Horas_Extras As B4XProgressBar
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Dim sf As StringFunctions
	
	
	Private GifViewerLoading As GifViewer
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
	GifViewerLoading.SetGif(File.DirAssets,"carga.gif")

End Sub

Sub B4XPage_Appear
	CLV_Persons.Clear

	GifViewerLoading.Start

	' Inicializo la base de datos en un hilo de fondo
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	Dim cmd As DBCommand = CreateCommand("select_listPerson", Null)
	
	' Realiza la consulta de manera asíncrona
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)

	' Manejo de la respuesta
	If j.Success Then
		sf.Initialize
		Req.HandleJobAsync(j, "req")

		Wait For (Req) req_Result(res As DBResult)

		' Iteramos sobre los resultados y agregamos cada persona a la CLV
		For Each row() As Object In res.Rows
			Dim personID As String = sf.Trim(row(0))
			Dim personLastName As String = sf.Trim(row(1))
			Dim personLastName2 As String = sf.Trim(row(2))
			Dim personName As String = sf.Trim(row(3))

			Dim displayText As String = personLastName & " " & personName & " #" & personID
			CLV_Persons.Add(CreateItem(displayText, Rnd(0, 100), Rnd(0, 100)), displayText)
		Next
        
		GifViewerLoading.Stop
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	
End Sub


Private Sub CreateItem(NombreElemento As String, DiasReportados As Int, HorasExtras As Int) As Panel
	'Se crea una nueva vista de panel con un ID vacío.
	Dim Panel As B4XView = xui.CreatePanel("")
	'Se establece la posición y el tamaño del panel animándolo.
	Panel.SetLayoutAnimated(1, 0, 0, 100%x, 119dip)
	'Se carga el diseño "CartDep" en el panel.
	Panel.LoadLayout("CartDep")
	'Se establece el progreso de la barra de progreso de días reportados.
	AnotherProgressBar1Dias_reportados.Progress = DiasReportados
	'Se establece el progreso de la barra de progreso de horas extras.
	AnotherProgressBar2Horas_Extras.Progress = HorasExtras
	'Se crea una nueva etiqueta para mostrar el porcentaje de horas extras.
	Dim EtiquetaHorasExtras As Label
	EtiquetaHorasExtras.Initialize("")
	EtiquetaHorasExtras.Text = HorasExtras & "%"
	EtiquetaHorasExtras.TextSize = 12
	EtiquetaHorasExtras.TextColor = Colors.White
	EtiquetaHorasExtras.Gravity = Gravity.LEFT
	EtiquetaHorasExtras.Gravity = Gravity.BOTTOM
	'Se agrega la etiqueta de porcentaje de horas extras a la vista base de la barra de progreso de horas extras.
	AnotherProgressBar2Horas_Extras.mBase.AddView(EtiquetaHorasExtras, 0, 0, 100%x, AnotherProgressBar2Horas_Extras.mBase.Height)
	'Se crea una nueva etiqueta para mostrar el porcentaje de días reportados.
	Dim EtiquetaDiasReportados As Label
	EtiquetaDiasReportados.Initialize("")
	EtiquetaDiasReportados.Text = DiasReportados & "%"
	EtiquetaDiasReportados.TextSize = 13
	EtiquetaDiasReportados.TextColor = Colors.White
	EtiquetaDiasReportados.Gravity = Gravity.LEFT
	EtiquetaDiasReportados.Gravity = Gravity.BOTTOM
	'Se agrega la etiqueta de porcentaje de días reportados a la vista base de la barra de progreso de días reportados.
	AnotherProgressBar1Dias_reportados.mBase.AddView(EtiquetaDiasReportados, 0, 0, 100%x, AnotherProgressBar1Dias_reportados.mBase.Height)
	'Se establece el nombre del elemento en la etiqueta correspondiente.
	Label20Name.Text = NombreElemento
	'Se devuelve el panel creado.
	Return Panel
End Sub

Private Sub CLV_Persons_ItemClick (Index As Int, Value As Object)
	'Muestra la página "ListPerson" y elimina todas las páginas anteriores de la pila de navegación.
	B4XPages.ShowPage("DetailsPerson")
	B4XPages.GetPage("DetailsPerson").As(DetailsPerson).namePerson=Value
End Sub

Private Sub Label1_Click
	B4XPages.ClosePage(Me)
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub


Private Sub Label2_Click
	B4XPages.ShowPage("EditPerson")
End Sub