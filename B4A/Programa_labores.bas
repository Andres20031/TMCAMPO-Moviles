B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=13
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("programa_labores")
	'load the layout to Root
	
	


End Sub

Sub B4XPage_Appear
	
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	
	
	Dim cmd As DBCommand = CreateCommand("select_programaLabores", Null)
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	
	If j.Success Then
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)

		If res.Rows.Size > 0 Then
			' ✅ Mostrar los datos en el Log
			For Each fila() As Object In res.Rows
				Log("Fila recibida: " & fila)
			Next
		Else
			' ⚠ No hay datos en la consulta
			Log("⚠ No se encontraron datos en 'select_programaLabores'.")
		End If
	Else
		' ❌ Error en la consulta
		Log("❌ ERROR EN CONSULTA: " & j.ErrorMessage)
	End If

	j.Release
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event  	 name is B4XPage.