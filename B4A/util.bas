B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
End Sub

Sub SetStatusBarColor(clr As Int, clr1 As Int)
	clr1=0xB4008000
	Try
		Dim p As Phone
		If p.SdkVersion >= 21 Then
			Dim jo As JavaObject
			jo.InitializeContext
			Dim window As JavaObject = jo.RunMethodJO("getWindow", Null)
			window.RunMethod("addFlags", Array (0x80000000))
			window.RunMethod("clearFlags", Array (0x04000000))
			window.RunMethod("setStatusBarColor", Array(clr))
			window.RunMethod("setNavigationBarColor", Array(clr1))
		End If
	Catch
		Log(LastException)
	End Try
	
End Sub