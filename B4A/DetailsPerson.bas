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
	Public namePerson As String=""
	Public idPersona As String =""
	Private CLV_Persons As CustomListView
	Private Label20Desc As Label
	Private Button1Check As Button
	Private Button2Del As Button
	Private Label3 As Label
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Dim sf As StringFunctions
	Dim sf2 As StringFunctions
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
	Root.LoadLayout("DetaiaPerson")
End Sub

Sub B4XPage_Appear
	CLV_Persons.Clear
	Label3.Text=namePerson
	'OBTENER EL ID DE ESA PERSONA
	Dim idPerson As String
	
	namePerson=namePerson.Replace(" ","")
	Dim parts() As String = Regex.Split("#", namePerson)
	idPerson=parts(1)
	
	
	' INICIALIZO LA BD
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	Dim cmd As DBCommand = CreateCommand("select_detailsPerson", Array As Object(idPerson, idPerson))
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)

	If j.Success Then
		sf.Initialize
		Req.HandleJobAsync(j, "req")
		Wait For (Req) req_Result(res As DBResult)

		If res.Rows.Size > 0 Then
			Dim counter As Int
			counter = 0
			Dim nombreEMPRESA As String
			Dim nombreHacienda As String
			Dim nombreEMPRESA_Limitado As String
			Dim nombreHacienda_Limitado As String
			
			For Each row() As Object In res.Rows
				Dim codigo As String = sf.Trim(row(0))
				Dim fecha As String = sf.Trim(row(1))
				Dim destino As String = sf.Trim(row(2))
				Dim concepto As String = sf.Trim(row(3))
				Dim hacienda As String = sf.Trim(row(4)) ' Cdgo_Hda para la nueva consulta
				Dim estado As String = sf.Trim(row(5))
				Dim horas As String = sf.Trim(row(6))
				Dim cantidad As String = sf.Trim(row(7))
				Dim valor As String = sf.Trim(row(8))
				Dim area As String = sf.Trim(row(9))
				Dim Nit As String = sf.Trim(row(10)) ' NIT del cliente
				Dim codigoLote As String = sf.Trim(row(11))

				' QUITARLE 00:00:00 A LA FECHA
				Dim parts2() As String
				parts2 = Regex.Split(" ", fecha)

				' HACEMOS LA CONSULTA PARA OBTENER EL NOMBRE DEL CLIENTE USANDO EL NIT
				Dim cmdNombre As DBCommand = CreateCommand("select_nit_details", Array As Object(Nit))
				Wait For (Req.ExecuteQuery(cmdNombre, 0, Null)) JobDone(j2 As HttpJob)

				If j2.Success Then
					Req.HandleJobAsync(j2, "req_nombre")
					Wait For (Req) req_nombre_Result(resNombre As DBResult)
					' Iteramos sobre las filas para obtener el nombre
					For Each rowNombre() As Object In resNombre.Rows
						nombreEMPRESA = sf.Trim(rowNombre(0)) ' El primer valor es el nombre del cliente (Razon_Social_Cliente)
						nombreEMPRESA_Limitado = LimitarPalabras(nombreEMPRESA, 3)
					Next
				Else
					Log("ERROR al obtener el nombre del cliente: " & j2.ErrorMessage)
				End If

				' HACEMOS LA CONSULTA PARA OBTENER EL NOMBRE DE LA HACIENDA USANDO EL Cdgo_Hda
				Dim cmdHacienda As DBCommand = CreateCommand("select_hacienda_details", Array As Object(hacienda))
				Wait For (Req.ExecuteQuery(cmdHacienda, 0, Null)) JobDone(j3 As HttpJob)

				If j3.Success Then
					Req.HandleJobAsync(j3, "req_hacienda")
					Wait For (Req) req_hacienda_Result(resHacienda As DBResult)
					' Iteramos sobre las filas para obtener el nombre de la hacienda
					For Each rowHacienda() As Object In resHacienda.Rows
						nombreHacienda = sf.Trim(rowHacienda(0)) ' El primer valor es el nombre de la hacienda (Nmbre_Hda)
						nombreHacienda_Limitado = LimitarPalabras(nombreHacienda,3)
					Next
				Else
					Log("ERROR al obtener el nombre de la hacienda: " & j3.ErrorMessage)
				End If

				' AÑADIMOS LOS DATOS AL CLV_Persons
				CLV_Persons.Add(CreateItem(counter, parts2(0), nombreEMPRESA_Limitado, hacienda & " - " & nombreHacienda_Limitado, codigoLote), counter)
				counter = counter + 1
			Next
		Else
			CLV_Persons.AddTextItem("NO HAY DATOS", "no_data")
		End If
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If


	
End Sub


' Este subprocedimiento crea un nuevo panel y carga un diseño previamente definido llamado "Cardp"
Private Sub CreateItem(position As Int, Fecha As String,Nit As String, Hacienda As String, Lote As String) As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 130dip)
    
	' Carga el diseño previamente definido llamado "Cardp" en el panel creado
	panel.LoadLayout("Cardp")
    
	' Crea un nuevo objeto CSBuilder para formatear el texto
	Dim cs As CSBuilder
	cs.Initialize
    
	' Agrega el texto "Fecha: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Fecha: ").Pop.Color(Colors.Gray).Append(Fecha & CRLF).Pop
	'Agrega el texto "Nit: "  en negrita y negro, seguido de el nombre de la empresa en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Nit: ").Pop.Color(Colors.Gray).Append(Nit & CRLF).Pop
	' Agrega el texto "Hacienda: " en negrita y negro, seguido de la hacienda en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Hacienda: ").Pop.Color(Colors.Gray).Append(Hacienda & CRLF).Pop
    
	' Agrega el texto "Lote: " en negrita y negro, seguido del lote en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Lote: ").Pop.Color(Colors.Gray).Append(Lote & CRLF).PopAll
    
	' Asigna el texto formateado al control de etiqueta "Label20Desc"
	Label20Desc.Text = cs
    
	' Establece la propiedad "Tag" de los botones "Button1Check" y "Button2Del" a la posición proporcionada como argumento
	Button1Check.Tag = position
	Button2Del.Tag = position
    
	' Devuelve el panel creado con los datos proporcionados
	Return panel
End Sub

' Este subprocedimiento se ejecuta cuando el botón "Button2Del" se hace clic
Private Sub Button2Del_Click
	Try
		' Obtiene el botón que se hizo clic y el índice del elemento en la lista a través de la propiedad "Tag"
		Dim btn As Button = Sender
		Dim index As Int = btn.Tag
		Log(index)
		' Verifica si el índice está dentro de los límites de la lista
		If index >= 0 And index < CLV_Persons.Size Then
			' Muestra un cuadro de diálogo para preguntar si el usuario quiere eliminar el elemento
			Msgbox2Async("¿Está seguro de que desea eliminar este elemento?", "Confirmación", "Sí", "Cancelar", "No", Null, False)
			Wait For Msgbox_Result(Result As Int)

			' Si el usuario hace clic en "Sí", elimina el elemento de la lista "CLV_Persons"
			If Result = DialogResponse.POSITIVE Then
				CLV_Persons.RemoveAt(index)
				CLV_Persons.Refresh
			End If
		Else
			' Si el índice está fuera de los límites de la lista, muestra un mensaje de error
			Log("Error: el índice está fuera de los límites de la lista.")
		End If

    
	Catch
		Log(LastException)
	End Try
End Sub

' Este subprocedimiento se ejecuta cuando el botón "Button1Check" se hace clic
Private Sub Button1Check_Click
	Try
		' Obtiene el botón que se hizo clic y el índice del elemento en la lista a través de la propiedad "Tag"
		Dim btn As Button = Sender
		Dim index As Int = btn.Tag        
'		' Inicia una nueva actividad llamada "FormPerson"
		B4XPages.ShowPage("FormPerson")
        
	Catch
		Log(LastException)
	End Try
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
	B4XPages.ShowPage("FormPerson")
End Sub

' Función para limitar palabras en un texto
Sub LimitarPalabras(texto As String, maxPalabras As Int) As String
	Dim palabras() As String
	palabras = Regex.Split("\s+", texto) ' Dividimos el texto por espacios
    
	Dim resultado As StringBuilder
	resultado.Initialize
    
	' Concatenar las palabras hasta el máximo permitido
	For i = 0 To Min(palabras.Length - 1, maxPalabras - 1)
		resultado.Append(palabras(i)).Append(" ")
	Next
    
	' Si el número de palabras excede el límite, agregamos "..."
	If palabras.Length > maxPalabras Then
		resultado.Append("...")
	End If
    
	Return resultado.ToString.Trim
End Sub
