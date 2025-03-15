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
	Dim xui As XUI
	Private GifViewerLoading As GifViewer
	Private CLV_Labores As CustomListView
	Private const rdcLink As String = "http://84.46.255.129:17178/rdc"
	Private LabelLabores As Label
	Private ButtonGrabar As Button
	Private ButtonCancelar As Button
	Private ButtonAplazar As Button
	Private sf As StringFunctions
	Private ConsecutivoSeleccionado As String
    Private ConsecutivoSeleccionadoCancelar As String
	Private Conse As String

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
	
	Root.LoadLayout("ListLaboresCampo")
	GifViewerLoading.SetGif(File.DirAssets,"carga.gif")
	
	
End Sub

Sub B4XPage_Appear
	CLV_Labores.Clear
	GifViewerLoading.Start
	Dim nombreEMPRESA As String
	Dim nombreHacienda As String
	Dim nombreLabor As String
	
	' Inicializo la base de datos en un hilo de fondo
	Dim Req As DBRequestManager
	Req.Initialize(Me, rdcLink & "?DBName=" & Main.pDBName)
	Dim cmd As DBCommand = CreateCommand("select_programalabores", Null)

	' Realiza la consulta de manera asíncrona
	Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone(j As HttpJob)
	Dim counter As Int
	counter = 0

	' Manejo de la respuesta
	If j.Success Then
		sf.Initialize
		Req.HandleJobAsync(j, "req")

		Wait For (Req) req_Result(res As DBResult)

		' Iteramos sobre los resultados
		For Each row() As Object In res.Rows
			' Extraer el Consecutivo (Int)
			Dim Consecutivo As Int = row(0)

			' Extraer el Nit_Programa_Labor (String)
			Dim Nit_Programa_Labor As String = row(1)

			' Extraer el Hacienda_Programa_Labor (String)
			Dim Hacienda_Programa_Labor As String = row(2)

			' Extraer el Suerte_Programa_Labor (String)
			Dim Suerte_Programa_Labor As String = row(3)

			' Extraer el Fecha_Programa_Labor (String o Date)
			Dim Fecha_Programa_Labor As String = row(4)

			' Extraer el Destino_Programa_Labor (String)
			Dim Destino_Programa_Labor As String = row(5)

			' Extraer el Area_Programa_Labor (money -> Double)
			Dim Area_Programa_Labor As String = row(6)
			
			'Extraer el Observacion 
			Dim Observacion As String = row(7)

			
			Dim partesFecha() As String
			partesFecha = Regex.Split(" ", Fecha_Programa_Labor)
			Fecha_Programa_Labor = partesFecha(0)
			' Log para verificar los valores
'			Log("Contador: " & counter)
'			Log("Consecutivo: " & Consecutivo)
'			Log("Nit_Programa_Labor: " & Nit_Programa_Labor)
'			Log("Hacienda_Programa_Labor: " & Hacienda_Programa_Labor)
'			Log("Suerte_Programa_Labor: " & Suerte_Programa_Labor)
'			Log("Fecha_Programa_Labor: " & Fecha_Programa_Labor)
'			Log("Destino_Programa_Labor: " & Destino_Programa_Labor)
'			Log("Area_Programa_Labor: " & Area_Programa_Labor)
'			Log("Observacion: "& Observacion)
			
			
			'******************* CONSULTAR NOMBRE DEL NIT ***********************
			Dim cmdNombre As DBCommand = CreateCommand("select_nit_details", Array As Object(Nit_Programa_Labor))
			Wait For (Req.ExecuteQuery(cmdNombre, 0, Null)) JobDone(j2 As HttpJob)

			If j2.Success Then
				Req.HandleJobAsync(j2, "req_nombre")
				Wait For (Req) req_nombre_Result(resNombre As DBResult)
				' Iteramos sobre las filas para obtener el nombre
				For Each rowNombre() As Object In resNombre.Rows
					nombreEMPRESA = sf.Trim(rowNombre(0)) ' El primer valor es el nombre del cliente (Razon_Social_Cliente)
				Next
			Else
				Log("ERROR al obtener el nombre del cliente: " & j2.ErrorMessage)
			End If
			'******************* FIN CONSULTAR NOMBRE DEL NIT *********************
			'****************** CONSULTAR HACIENDA ************************
			Dim cmdHacienda As DBCommand = CreateCommand("select_hacienda_details", Array As Object(Hacienda_Programa_Labor))
			Wait For (Req.ExecuteQuery(cmdHacienda, 0, Null)) JobDone(j3 As HttpJob)

			If j3.Success Then
				Req.HandleJobAsync(j3, "req_hacienda")
				Wait For (Req) req_hacienda_Result(resHacienda As DBResult)
				' Iteramos sobre las filas para obtener el nombre de la hacienda
				For Each rowHacienda() As Object In resHacienda.Rows
					nombreHacienda = sf.Trim(rowHacienda(0)) ' El primer valor es el nombre de la hacienda (Nmbre_Hda)
				Next
			Else
				Log("ERROR al obtener el nombre de la hacienda: " & j3.ErrorMessage)
			End If
			'****************** FIN CONSULTAR HACIENDA ************************
			'****************** CONSULTAR LABOR ************************
			Dim cmdLabor As DBCommand = CreateCommand("select_programa_labores_destino", Array As Object(Destino_Programa_Labor))
			Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) JobDone(j4 As HttpJob)

			If j4.Success Then
				Req.HandleJobAsync(j4, "req_labor")
				Wait For (Req) req_labor_Result(resLabor As DBResult)
				' Iteramos sobre las filas para obtener el nombre de la hacienda
				For Each rowLabor() As Object In resLabor.Rows
					nombreLabor = sf.Trim(rowLabor(0)) ' El primer valor es el nombre de la hacienda (Nmbre_Hda)
				Next
			Else
				Log("ERROR al obtener el nombre de la hacienda: " & j3.ErrorMessage)
			End If
			'****************** FIN CONSULTAR LABOR ************************
			'***************** CALCULO DE FECHA *************************
			Try
				' Convertir la cadena de fecha a un objeto DateTime (en ticks)
				DateTime.DateFormat = "yyyy-MM-dd"
				Dim fecha As Long = DateTime.DateParse(Fecha_Programa_Labor)
				Dim fechaUNIX As Long = DateUtils.TicksToUnixTime(fecha) 
'				Log("LA FECHA EN LONG: "&fechaUNIX)
				
				' Obtener la fecha actual (en ticks)
				Dim fechaActual As Long = DateTime.Now
				Dim fechaUNIXACTUAL As Long = DateUtils.TicksToUnixTime(fechaActual)
'				Log("LA FECHA ACTUAL: "&fechaUNIXACTUAL)
				
				' Calcular la diferencia en segundos
				Dim diferenciaSegundos As Long = fechaUNIXACTUAL - fechaUNIX
				
				' Convertir la diferencia de segundos a días
				Dim diferenciaDias As Int = diferenciaSegundos / 86400 ' 86400 segundos = 1 día
				
				' Mostrar el resultado
'				Log("Días de diferencia: " & diferenciaDias)
				
			Catch
				Log("Error: Formato de fecha inválido o no se pudo parsear la fecha.")
			End Try
			'***************** FIN CALCULO DE FECHA *************************
			CLV_Labores.Add(CreateItem(counter,Consecutivo,nombreEMPRESA,nombreHacienda,Suerte_Programa_Labor,Area_Programa_Labor,nombreLabor,Fecha_Programa_Labor,diferenciaDias,Observacion),Consecutivo)
			counter = counter + 1
		Next

		GifViewerLoading.Stop
	Else
		Log("ERROR: " & j.ErrorMessage)
	End If
	j.Release
	
End Sub

Private Sub CreateItem(Position As String,Consecutivo As String, Nit As String, Hacienda As String, Suerte As String, Area As String, Labor As String, FechaPro As String, Retraso As String,Observacion As String) As Panel
	' Crea un nuevo panel con el objeto B4XView del kit de herramientas XUI
	Dim panel As B4XView = xui.CreatePanel("")
	panel.SetLayoutAnimated(1, 0, 0, 100%X, 420dip)
	
	' Carga el diseño previamente definido llamado "Cardp" en el panel creado
	panel.LoadLayout("CardLabores")
	
	Dim cs As CSBuilder
	cs.Initialize
	
	' Agrega el texto "Consecutivo: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Consecutivo: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Consecutivo & CRLF).PopAll
	' Agrega el texto "Nit: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Nit: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Nit & CRLF).PopAll
	' Agrega el texto "Hacienda: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Hacienda: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Hacienda & CRLF).PopAll
	' Agrega el texto "Suerte: y Area: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Suerte: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Suerte).PopAll
	cs.Append("  ")
	cs.Bold.Color(Colors.Black).Append("Área: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Area & CRLF).PopAll
	' Agrega el texto "Labor: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Labor: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Labor & CRLF).PopAll
	' Agrega el texto "Fecha programa: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Fecha programa: ").PopAll
	cs.Color(Colors.Black).Underline.Append(FechaPro & CRLF).PopAll
	' Agrega el texto "Días atraso: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Días atraso: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Retraso & CRLF).PopAll
	' Agrega el texto "Observación: " en negrita y negro, seguido de la fecha en gris y sin negrita
	cs.Bold.Color(Colors.Black).Append("Observación: ").PopAll
	cs.Color(Colors.Black).Underline.Append(Observacion & CRLF).PopAll
	
	LabelLabores.Text = cs
	
	ButtonGrabar.Tag = Consecutivo
	ButtonCancelar.Tag = Consecutivo
	ButtonAplazar.Tag = Consecutivo

	Return panel
	
End Sub

Sub CreateCommand(Name As String, Parameters() As Object) As DBCommand
	Dim cmd As DBCommand
	cmd.Initialize
	cmd.Name = Name
	If Parameters <> Null Then cmd.Parameters = Parameters
	Return cmd
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub ButtonGrabar_Click
	Dim btn As Button = Sender ' Obtiene el botón que disparó el evento
	Dim consecutivo As Int = btn.Tag ' Extrae el Tag (Consecutivo)
    
	
	Dim programaCampo As FormProgramaCampo = B4XPages.GetPage("FormProgramaCampo")
	
	' Enviamos el valor a la otra página
	programaCampo.SetConsecutivo(consecutivo)
	' Pasa el valor a la página de destino
	B4XPages.ShowPage("FormProgramaCampo")
	
End Sub

Private Sub ButtonCancelar_Click
	
	Dim btn As Button = Sender ' Obtiene el botón que disparó el evento
	Dim consecutivo As Int = btn.Tag ' Extrae el Tag (Consecutivo)
	
	Dim programaCampoCancelar As FormProgramaCampoCancelar = B4XPages.GetPage("FormProgramaCampoCancelar")
	
	
	programaCampoCancelar.SetConsecutivo(consecutivo)
	
	B4XPages.ShowPage("FormProgramaCampoCancelar")
End Sub

Private Sub ButtonAplazar_Click
	
	Dim btn As Button = Sender ' Obtiene el botón que disparó el evento
	Dim consecutivo As Int = btn.Tag ' Extrae el Tag (Consecutivo)
	
	Dim programaCampoA As FormProgramaCampoAplazar = B4XPages.GetPage("FormProgramaCampoAplazar")
	
	
	programaCampoA.SetConsecutivo(consecutivo)
	
	B4XPages.ShowPage("FormProgramaCampoAplazar")
End Sub



Private Sub Label1_Click
	B4XPages.ClosePage(Me)
End Sub