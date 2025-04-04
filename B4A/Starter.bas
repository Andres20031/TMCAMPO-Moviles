B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Service
Version=9.85
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.FormLabores
	'These variables can be accessed from all modules.
	Dim SQL1 As SQL

	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"

End Sub

Sub Service_Create
	'This is the program entry point.
	'This is a good place to load resources that are not specific to a single activity.
	Try
		SQL1.Initialize(File.DirInternal, "data_base8088.db", True)
		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS insumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, qnt TEXT, idmaquina INTEGER)")
		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS namesinsumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)")
'		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS nameSelectedsinsumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT,idmaquina INTEGER)")
		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS maquina (id INTEGER PRIMARY KEY, fechaInicio TEXT, fechaFim Text, Nit Text, arealabor INTEGER,hacienda TEXT,Lote TEXT, labor TEXT)")
		SQL1.ExecNonQuery("CREATE TABLE IF NOT EXISTS dados (id INTEGER PRIMARY KEY AUTOINCREMENT, Consecutivo TEXT,Fecha_programa TEXT,NIT TEXT, Hacienda TEXT, Lote TEXT, labor TEXT)")

		SQL1.ExecNonQuery("DELETE FROM maquina")

		insertNamesInsumos(Main.pDBName)
	Catch
		Log(LastException)
	End Try
End Sub


'Original Abdul
'Sub insertNamesInsumos
'	If File.Exists(File.DirInternal, "1.txt") Then
'		Log("JA EXISTEM ITENS")
'	Else
'		For i=0 To 10
'			Dim name As String="ITEM "&i
'			
''			SQL1.ExecNonQuery2("INSERT INTO insumo VALUES (?, ?, ?)", Array As Object(Null,"",""))
'			
'			SQL1.ExecNonQuery2("INSERT INTO namesinsumo VALUES (?,?)", Array As Object(Null,name))
'			File.WriteString(File.DirInternal, "1.txt", "")
'		Next
'	End If
'		
'End Sub

'
'Sub	insertDados(Consecutivo,Fecha_programa,NIT, Hacienda, Lote As String, labor As String)
'
''	If File.Exists(File.DirInternal, "dados.txt") Then
''		Log("JA EXISTEM ITENS")
''	Else
'	''		For i=0 To 10
'	''			Dim name As String="ITEM "&i
'	SQL1.ExecNonQuery2("INSERT INTO dados VALUES (?,?,?,?,?,?,?)", Array As Object(Null,Consecutivo,Fecha_programa,NIT, Hacienda, Lote , labor ))
''			
'	''		 (id INTEGER PRIMARY KEY AUTOINCREMENT, Consecutivo TEXT,Fecha_programa TEXT,NIT TEXT, Hacienda TEXT, Lote TEXT, labor TEXT)")
''			
''			File.WriteString(File.DirInternal, "dados.txt", "")
'	''		Next
''	End If
'		
''End Sub
'Private Sub CreateItem(Consecutivo,Fecha_programa,NIT, Hacienda, Lote As String, labor As String) As Panel


Sub insertNamesInsumos(UseDb As String)
	File.Delete(File.DirInternal, "1.txt")
	SQL1.ExecNonQuery("DELETE FROM namesinsumo")

	If File.Exists(File.DirInternal, "1.txt") Then
		Log("JA EXISTEM ITENS")
	Else

		Dim req As DBRequestManager = CreateRequest(UseDb)
		Dim cmd As DBCommand = CreateCommand("select_insumos", Null)
	
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
					cadena=cadena & record '& separador
				Next
'				longitud = cadena.Length
'				cadena=cadena.SubString2(0, longitud - 3)
				SQL1.ExecNonQuery2("INSERT INTO namesinsumo VALUES (?,?)", Array As Object(Null,cadena))
				File.WriteString(File.DirInternal, "1.txt", "")
				cadena=""
			Next
		
		Else
			Log("ERROR: " & j.ErrorMessage)
		End If
		j.Release


'		'Labores
'		For i=0 To 22
'			Dim Consecutivo As Int=(i+1)*Rnd(0,10)
'			Dim Fecha_programa As String=DateTime.Date(DateTime.Now)
'			Log(Consecutivo)
'			insertDados(Consecutivo,Fecha_programa,"Grupo Pichucho", "La gloria", "Lote #"&i, "Abonamiento")
'		Next

			
	End If
		
End Sub


public Sub updateInsumo( name As String, qnt As String, id As Int, idMaquina)
	
	Try
		If name<>"" Then
			SQL1.ExecNonQuery2("UPDATE insumo set name=?, idMaquina=? where id=?", Array As Object(name,idMaquina,id))
		End If
		
		If qnt<>"" Then
			SQL1.ExecNonQuery2("UPDATE insumo set  qnt= ?, idMaquina=? where id=?", Array As Object(qnt,idMaquina,id))
		End If
	Catch
		Log("Erro 0005: "&LastException)
	End Try
	
End Sub
Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Starter service can start in the foreground state in some edge cases.
End Sub

Sub Service_TaskRemoved
	'This event will be raised when the user removes the app from the recent apps list.
End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub

'
'Sub CreateRequest As DBRequestManager
Sub CreateRequest (Db As String) As DBRequestManager	
	Dim req As DBRequestManager
	req.Initialize(Me, rdcLink & "?DBName=" & Db)
	Return req
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub
