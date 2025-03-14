B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private Label8 As Label

	Private Panel7 As Panel
	Private Label9 As Label
	Private MiConsecutivo As String
	Dim fechaInicio As String
	Dim fechaFin As String
	Dim area As String
	Dim Observacion As String
	Private Panel8 As Panel
	Private Label11 As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

Public Sub SetConsecutivo(Valor As String)
	MiConsecutivo = Valor
	If Label8.IsInitialized Then
		Label8.Text = MiConsecutivo
	End If
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("FormLaboresCampo") ' Carga el diseño primero
    
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub Button1_Click
	
End Sub

Private Sub Label1_Click
	B4XPages.ClosePage(Me)
End Sub

Private Sub AS_DatePicker1_SelectedDateChanged(Date As Long)
	' Obtener la fecha seleccionada
	Dim formattedDate As String = DateTime.Date(Date)
    
	' Reemplazar cualquier '/' por '-' en caso de que la fecha sea en formato con '/'
	formattedDate = formattedDate.Replace("/", "-")
    
	' Agregar la parte de la hora
	formattedDate = formattedDate & " 00:00:00"
    
	' Mostrar la fecha formateada en el Label
	Label9.Text = formattedDate
    
	' Hacer invisible el Panel
	Panel7.Visible = False
    
	' Obtener la fecha y guardarla en la variable fecha
	fechaInicio = formattedDate
    
	' Log para verificar el valor de la fecha
	Log(fechaInicio)
End Sub

Private Sub Label9_Click
	Panel7.Visible=True
End Sub

Private Sub AS_DatePicker2_SelectedDateChanged(Date As Long)
	' Obtener la fecha seleccionada
	Dim formattedDate As String = DateTime.Date(Date)
    
	' Reemplazar cualquier '/' por '-' en caso de que la fecha sea en formato con '/'
	formattedDate = formattedDate.Replace("/", "-")
    
	' Agregar la parte de la hora
	formattedDate = formattedDate & " 00:00:00"
    
	' Mostrar la fecha formateada en el Label
	Label11.Text = formattedDate
    
	' Hacer invisible el Panel
	Panel8.Visible = False
    
	' Obtener la fecha y guardarla en la variable fecha
	fechaFin = formattedDate
    
	' Log para verificar el valor de la fecha
	Log(fechaFin)
End Sub

Private Sub Label11_Click
	Panel8.Visible = True
End Sub

Private Sub EditTextArea_TextChanged (Old As String, New As String)
	area = New
	Log("El area es:" & area)
End Sub

Private Sub EditTextObservacion_TextChanged (Old As String, New As String)
	Observacion = New
	
	Log("La observacion es: " & Observacion)
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub
