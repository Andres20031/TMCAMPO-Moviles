B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private Panel1Precipitacion2 As B4XView
	Private pnlPrograma_de_labores As B4XView
	Private pnlPrecipitacion As B4XView
	Private pnlCosecha As B4XView
	Private pnlTaller As B4XView
	Private pnlPersonal As B4XView
	Private PnlMaquinaria As B4XView
	Private utilClass As util
	
	';

End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	If Main.pNit = "890307964" Then
	End If

	Return Me
End Sub

Private Sub B4XPage_Created (Root1 As B4XView)
	'Se establece la variable "Raiz" como la raíz de la vista.
	Root = Root1
	'Se inicializa la clase de utilidad.
	utilClass.Initialize
	'Se establece el color de la barra de estado en blanco con un nivel de opacidad.
	utilClass.SetStatusBarColor(Colors.White, 0xB4008000)
	'Se carga el diseño de la vista "menu".
	Root.LoadLayout("menu")
	'
	Panel1Precipitacion2.Enabled = True
	pnlPrograma_de_labores.Enabled = True
	pnlPrecipitacion.Enabled = True
	pnlCosecha.Enabled = True
	pnlTaller.Enabled = True
	PnlMaquinaria.Enabled = True

	If Main.pNit = "890307964" Then
		Panel1Precipitacion2.Enabled = False
		pnlPrograma_de_labores.Enabled = False
		pnlPrecipitacion.Enabled = False
		pnlCosecha.Enabled = False
		pnlTaller.Enabled = False
		Panel1Precipitacion2.Visible = False
		pnlPrograma_de_labores.Visible = False
		pnlPrecipitacion.Visible = False
		pnlCosecha.Visible = False
		pnlTaller.Visible = False


		PnlMaquinaria.Enabled = True
	End If

End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub PnlMaquinaria_Click
	'B4XPages.ShowPage("Form")
	B4XPages.ShowPage("FormLabores")	
End Sub

Private Sub pnlPersonal_Click
	'Muestra la página "ListPerson" y elimina todas las páginas anteriores de la pila de navegación.
	B4XPages.ShowPage("ListPerson")
	 
End Sub



Private Sub pnlTaller_Click
	B4XPages.ShowPage("FormMaquinaria")
End Sub

Private Sub pnlCosecha_Click
	
End Sub

Private Sub pnlPrecipitacion_Click
	B4XPages.ShowPage("FormPrecipitacion")
End Sub

Private Sub pnlPrograma_de_labores_Click
	B4XPages.ShowPage("listDados")

End Sub



Private Sub Panel3_Click
	B4XPages.ShowPage("ListLabores")
End Sub