package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_actionbarhomeclick() throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return b4a.example.ef.main.remoteMe.runUserSub(false, "main","activity_actionbarhomeclick");}
 BA.debugLineNum = 63;BA.debugLine="Sub Activity_ActionBarHomeClick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="ActionBarHomeClicked = True";
Debug.ShouldStop(-2147483648);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 65;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
Debug.ShouldStop(1);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.ef.b4xpagesdelegator.class, "_activity_actionbarhomeclick" /*RemoteObject*/ );
 BA.debugLineNum = 66;BA.debugLine="ActionBarHomeClicked = False";
Debug.ShouldStop(2);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.ef.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pm = RemoteObject.declareNull("b4a.example.ef.b4xpagesmanager");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 54;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Dim pm As B4XPagesManager";
Debug.ShouldStop(4194304);
_pm = RemoteObject.createNew ("b4a.example.ef.b4xpagesmanager");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 56;BA.debugLine="pm.Initialize(Activity)";
Debug.ShouldStop(8388608);
_pm.runClassMethod (b4a.example.ef.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,69);
if (RapidSub.canDelegate("activity_keypress")) { return b4a.example.ef.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 69;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(16);
 BA.debugLineNum = 70;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
Debug.ShouldStop(32);
if (true) return main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.ef.b4xpagesdelegator.class, "_activity_keypress" /*RemoteObject*/ ,(Object)(_keycode));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,77);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.ef.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 77;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 78;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(8192);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.ef.b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,81);
if (RapidSub.canDelegate("activity_permissionresult")) { return b4a.example.ef.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 81;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
Debug.ShouldStop(131072);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.ef.b4xpagesdelegator.class, "_activity_permissionresult" /*RemoteObject*/ ,(Object)(_permission),(Object)(_result));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,73);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.ef.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 74;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(512);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.ef.b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_menu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Create_Menu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,85);
if (RapidSub.canDelegate("create_menu")) { return b4a.example.ef.main.remoteMe.runUserSub(false, "main","create_menu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 85;BA.debugLine="Sub Create_Menu (Menu As Object)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
Debug.ShouldStop(2097152);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (b4a.example.ef.b4xpagesdelegator.class, "_create_menu" /*RemoteObject*/ ,(Object)(_menu));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
b4xpages_subs_0._process_globals();
httputils2service_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.ef.main");
b4xmainpage.myClass = BA.getDeviceClass ("b4a.example.ef.b4xmainpage");
starter.myClass = BA.getDeviceClass ("b4a.example.ef.starter");
menu.myClass = BA.getDeviceClass ("b4a.example.ef.menu");
listperson.myClass = BA.getDeviceClass ("b4a.example.ef.listperson");
editperson.myClass = BA.getDeviceClass ("b4a.example.ef.editperson");
formlabores.myClass = BA.getDeviceClass ("b4a.example.ef.formlabores");
b4xprogressbar.myClass = BA.getDeviceClass ("b4a.example.ef.b4xprogressbar");
dbrequestmanager.myClass = BA.getDeviceClass ("b4a.example.ef.dbrequestmanager");
detailsperson.myClass = BA.getDeviceClass ("b4a.example.ef.detailsperson");
form.myClass = BA.getDeviceClass ("b4a.example.ef.form");
formmaquinaria.myClass = BA.getDeviceClass ("b4a.example.ef.formmaquinaria");
formperson.myClass = BA.getDeviceClass ("b4a.example.ef.formperson");
formprecipitacion.myClass = BA.getDeviceClass ("b4a.example.ef.formprecipitacion");
formprogramacampo.myClass = BA.getDeviceClass ("b4a.example.ef.formprogramacampo");
formprogramacampoaplazar.myClass = BA.getDeviceClass ("b4a.example.ef.formprogramacampoaplazar");
formprogramacampocancelar.myClass = BA.getDeviceClass ("b4a.example.ef.formprogramacampocancelar");
gifviewer.myClass = BA.getDeviceClass ("b4a.example.ef.gifviewer");
listdados.myClass = BA.getDeviceClass ("b4a.example.ef.listdados");
listlabores.myClass = BA.getDeviceClass ("b4a.example.ef.listlabores");
table.myClass = BA.getDeviceClass ("b4a.example.ef.table");
util.myClass = BA.getDeviceClass ("b4a.example.ef.util");
as_datepicker.myClass = BA.getDeviceClass ("b4a.example.ef.as_datepicker");
asviewpager.myClass = BA.getDeviceClass ("b4a.example.ef.asviewpager");
b4xbitset.myClass = BA.getDeviceClass ("b4a.example.ef.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("b4a.example.ef.b4xbytesbuilder");
b4xcache.myClass = BA.getDeviceClass ("b4a.example.ef.b4xcache");
b4xcollections.myClass = BA.getDeviceClass ("b4a.example.ef.b4xcollections");
b4xcomparatorsort.myClass = BA.getDeviceClass ("b4a.example.ef.b4xcomparatorsort");
b4xorderedmap.myClass = BA.getDeviceClass ("b4a.example.ef.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("b4a.example.ef.b4xset");
b4xpages.myClass = BA.getDeviceClass ("b4a.example.ef.b4xpages");
b4xpagesdelegator.myClass = BA.getDeviceClass ("b4a.example.ef.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("b4a.example.ef.b4xpagesmanager");
b4xtable.myClass = BA.getDeviceClass ("b4a.example.ef.b4xtable");
b4xformatter.myClass = BA.getDeviceClass ("b4a.example.ef.b4xformatter");
httputils2service.myClass = BA.getDeviceClass ("b4a.example.ef.httputils2service");
httpjob.myClass = BA.getDeviceClass ("b4a.example.ef.httpjob");
sd_xcombobox.myClass = BA.getDeviceClass ("b4a.example.ef.sd_xcombobox");
animatedcounter.myClass = BA.getDeviceClass ("b4a.example.ef.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("b4a.example.ef.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("b4a.example.ef.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("b4a.example.ef.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("b4a.example.ef.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("b4a.example.ef.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("b4a.example.ef.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("b4a.example.ef.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("b4a.example.ef.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("b4a.example.ef.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("b4a.example.ef.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("b4a.example.ef.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("b4a.example.ef.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("b4a.example.ef.madewithlove");
roundslider.myClass = BA.getDeviceClass ("b4a.example.ef.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("b4a.example.ef.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("b4a.example.ef.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("b4a.example.ef.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 20;BA.debugLine="Public ActionBarHomeClicked As Boolean";
main._actionbarhomeclicked = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 22;BA.debugLine="Type DBResult (Tag As Object, Columns As Map, Row";
;
 //BA.debugLineNum = 23;BA.debugLine="Type DBCommand (Name As String, Parameters() As O";
;
 //BA.debugLineNum = 24;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
main._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");
 //BA.debugLineNum = 27;BA.debugLine="Public pUser As String = \"sa\" ' Tu usuario de bas";
main._puser = BA.ObjectToString("sa");
 //BA.debugLineNum = 28;BA.debugLine="Public pPassword As String = \"AVE.0331\" ' Tu cont";
main._ppassword = BA.ObjectToString("AVE.0331");
 //BA.debugLineNum = 29;BA.debugLine="Public pDBName As String = \"BDCencerro\" ' Nombre";
main._pdbname = BA.ObjectToString("BDCencerro");
 //BA.debugLineNum = 31;BA.debugLine="Public pEmpresa = \"Tool Manager\" As String";
main._pempresa = BA.ObjectToString("Tool Manager");
 //BA.debugLineNum = 35;BA.debugLine="Public pDBName = \"BDCencerro\"  As String";
main._pdbname = BA.ObjectToString("BDCencerro");
 //BA.debugLineNum = 36;BA.debugLine="Public pDBNameSeguridad = \"BDSeguridadTMApp\"  As";
main._pdbnameseguridad = BA.ObjectToString("BDSeguridadTMApp");
 //BA.debugLineNum = 38;BA.debugLine="Public pUser As String";
main._puser = RemoteObject.createImmutable("");
 //BA.debugLineNum = 39;BA.debugLine="Public pNit As String";
main._pnit = RemoteObject.createImmutable("");
 //BA.debugLineNum = 40;BA.debugLine="Public puserActivo As String";
main._puseractivo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 41;BA.debugLine="Public pUserOpcionLabores As String";
main._puseropcionlabores = RemoteObject.createImmutable("");
 //BA.debugLineNum = 42;BA.debugLine="Public pUserOpcionAgenda As String";
main._puseropcionagenda = RemoteObject.createImmutable("");
 //BA.debugLineNum = 43;BA.debugLine="Public pUserOpcionMaquinaria As String";
main._puseropcionmaquinaria = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Public pUserOpcionPluviometros As String";
main._puseropcionpluviometros = RemoteObject.createImmutable("");
 //BA.debugLineNum = 45;BA.debugLine="Public pUserOpcionMonotoreo As String";
main._puseropcionmonotoreo = RemoteObject.createImmutable("");
 //BA.debugLineNum = 46;BA.debugLine="Public GifsCache As Map";
main._gifscache = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 47;BA.debugLine="Public consecutivoLaboresGlobal As String";
main._consecutivolaboresglobal = RemoteObject.createImmutable("");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}