package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class listperson_subs_0 {


public static void  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "listperson","b4xpage_appear", __ref); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.listperson parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.listperson parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _personid = RemoteObject.createImmutable("");
RemoteObject _personlastname = RemoteObject.createImmutable("");
RemoteObject _personlastname2 = RemoteObject.createImmutable("");
RemoteObject _personname = RemoteObject.createImmutable("");
RemoteObject _displaytext = RemoteObject.createImmutable("");
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,35);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 36;BA.debugLine="CLV_Persons.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 38;BA.debugLine="GifViewerLoading.Start";
Debug.ShouldStop(32);
__ref.getField(false,"_gifviewerloading" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.gifviewer.class, "_start" /*RemoteObject*/ );
 BA.debugLineNum = 41;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(256);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 42;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(512);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_list";
Debug.ShouldStop(1024);
_cmd = __ref.runClassMethod (b4a.example.ef.listperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_listPerson")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 46;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 49;BA.debugLine="If j.Success Then";
Debug.ShouldStop(65536);
if (true) break;

case 1:
//if
this.state = 10;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 50;BA.debugLine="sf.Initialize";
Debug.ShouldStop(131072);
__ref.getField(false,"_sf" /*RemoteObject*/ ).runVoidMethod ("_vvv1",__ref.getField(false, "ba"));
 BA.debugLineNum = 51;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(262144);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 53;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listperson", "b4xpage_appear"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 56;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.getField(false,"Rows" /*RemoteObject*/ );
index11 = 0;
groupLen11 = group11.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (group11.runMethod(false,"Get",index11));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 57;BA.debugLine="Dim personID As String = sf.Trim(row(0))";
Debug.ShouldStop(16777216);
_personid = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)))));Debug.locals.put("personID", _personid);Debug.locals.put("personID", _personid);
 BA.debugLineNum = 58;BA.debugLine="Dim personLastName As String = sf.Trim(row(1))";
Debug.ShouldStop(33554432);
_personlastname = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)))));Debug.locals.put("personLastName", _personlastname);Debug.locals.put("personLastName", _personlastname);
 BA.debugLineNum = 59;BA.debugLine="Dim personLastName2 As String = sf.Trim(row(2))";
Debug.ShouldStop(67108864);
_personlastname2 = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 2)))));Debug.locals.put("personLastName2", _personlastname2);Debug.locals.put("personLastName2", _personlastname2);
 BA.debugLineNum = 60;BA.debugLine="Dim personName As String = sf.Trim(row(3))";
Debug.ShouldStop(134217728);
_personname = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 3)))));Debug.locals.put("personName", _personname);Debug.locals.put("personName", _personname);
 BA.debugLineNum = 62;BA.debugLine="Dim displayText As String = personLastName & \"";
Debug.ShouldStop(536870912);
_displaytext = RemoteObject.concat(_personlastname,RemoteObject.createImmutable(" "),_personname,RemoteObject.createImmutable(" #"),_personid);Debug.locals.put("displayText", _displaytext);Debug.locals.put("displayText", _displaytext);
 BA.debugLineNum = 63;BA.debugLine="CLV_Persons.Add(CreateItem(displayText, Rnd(0,";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.listperson.class, "_createitem" /*RemoteObject*/ ,(Object)(_displaytext),(Object)(parent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 100)))),(Object)(parent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 100))))).getObject()),(Object)((_displaytext)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 BA.debugLineNum = 66;BA.debugLine="GifViewerLoading.Stop";
Debug.ShouldStop(2);
__ref.getField(false,"_gifviewerloading" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.gifviewer.class, "_stop" /*RemoteObject*/ );
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 68;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","32621473",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "listperson","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 27;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(67108864);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
Debug.ShouldStop(134217728);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(listperson.__c.getField(false,"Colors").getField(true,"White")),(Object)(listperson.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 30;BA.debugLine="Root.LoadLayout(\"ListPerson\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListPerson")),__ref.getField(false, "ba"));
 BA.debugLineNum = 31;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_gifviewerloading" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.gifviewer.class, "_setgif" /*RemoteObject*/ ,(Object)(listperson.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("carga.gif")));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
listperson._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",listperson._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
listperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",listperson._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
listperson._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",listperson._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Dim xui As XUI";
listperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",listperson._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private CLV_Persons As CustomListView";
listperson._clv_persons = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clv_persons",listperson._clv_persons);
 //BA.debugLineNum = 7;BA.debugLine="Private Label20Name As Label";
listperson._label20name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label20name",listperson._label20name);
 //BA.debugLineNum = 8;BA.debugLine="Private AnotherProgressBar1Dias_reportados As B4X";
listperson._anotherprogressbar1dias_reportados = RemoteObject.createNew ("b4a.example.ef.b4xprogressbar");__ref.setField("_anotherprogressbar1dias_reportados",listperson._anotherprogressbar1dias_reportados);
 //BA.debugLineNum = 9;BA.debugLine="Private AnotherProgressBar2Horas_Extras As B4XPro";
listperson._anotherprogressbar2horas_extras = RemoteObject.createNew ("b4a.example.ef.b4xprogressbar");__ref.setField("_anotherprogressbar2horas_extras",listperson._anotherprogressbar2horas_extras);
 //BA.debugLineNum = 10;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
listperson._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",listperson._rdclink);
 //BA.debugLineNum = 11;BA.debugLine="Dim sf As StringFunctions";
listperson._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf",listperson._sf);
 //BA.debugLineNum = 14;BA.debugLine="Private GifViewerLoading As GifViewer";
listperson._gifviewerloading = RemoteObject.createNew ("b4a.example.ef.gifviewer");__ref.setField("_gifviewerloading",listperson._gifviewerloading);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clv_persons_itemclick(RemoteObject __ref,RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CLV_Persons_ItemClick (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("clv_persons_itemclick")) { return __ref.runUserSub(false, "listperson","clv_persons_itemclick", __ref, _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 111;BA.debugLine="Private Sub CLV_Persons_ItemClick (Index As Int, V";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="B4XPages.ShowPage(\"DetailsPerson\")";
Debug.ShouldStop(65536);
listperson._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DetailsPerson")));
 BA.debugLineNum = 114;BA.debugLine="B4XPages.GetPage(\"DetailsPerson\").As(DetailsPerso";
Debug.ShouldStop(131072);
((listperson._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DetailsPerson"))))).setField ("_nameperson" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "listperson","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 121;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 122;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(33554432);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 123;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(67108864);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 124;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(134217728);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 125;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 126;BA.debugLine="Return cmd";
Debug.ShouldStop(536870912);
if (true) return _cmd;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject __ref,RemoteObject _nombreelemento,RemoteObject _diasreportados,RemoteObject _horasextras) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "listperson","createitem", __ref, _nombreelemento, _diasreportados, _horasextras);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _etiquetahorasextras = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _etiquetadiasreportados = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("NombreElemento", _nombreelemento);
Debug.locals.put("DiasReportados", _diasreportados);
Debug.locals.put("HorasExtras", _horasextras);
 BA.debugLineNum = 74;BA.debugLine="Private Sub CreateItem(NombreElemento As String, D";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="Dim Panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2048);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Panel", _panel);Debug.locals.put("Panel", _panel);
 BA.debugLineNum = 78;BA.debugLine="Panel.SetLayoutAnimated(1, 0, 0, 100%x, 119dip)";
Debug.ShouldStop(8192);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listperson.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(listperson.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 119)))));
 BA.debugLineNum = 80;BA.debugLine="Panel.LoadLayout(\"CartDep\")";
Debug.ShouldStop(32768);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("CartDep")),__ref.getField(false, "ba"));
 BA.debugLineNum = 82;BA.debugLine="AnotherProgressBar1Dias_reportados.Progress = Dia";
Debug.ShouldStop(131072);
__ref.getField(false,"_anotherprogressbar1dias_reportados" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xprogressbar.class, "_setprogress" /*RemoteObject*/ ,BA.numberCast(float.class, _diasreportados));
 BA.debugLineNum = 84;BA.debugLine="AnotherProgressBar2Horas_Extras.Progress = HorasE";
Debug.ShouldStop(524288);
__ref.getField(false,"_anotherprogressbar2horas_extras" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xprogressbar.class, "_setprogress" /*RemoteObject*/ ,BA.numberCast(float.class, _horasextras));
 BA.debugLineNum = 86;BA.debugLine="Dim EtiquetaHorasExtras As Label";
Debug.ShouldStop(2097152);
_etiquetahorasextras = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("EtiquetaHorasExtras", _etiquetahorasextras);
 BA.debugLineNum = 87;BA.debugLine="EtiquetaHorasExtras.Initialize(\"\")";
Debug.ShouldStop(4194304);
_etiquetahorasextras.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 88;BA.debugLine="EtiquetaHorasExtras.Text = HorasExtras & \"%\"";
Debug.ShouldStop(8388608);
_etiquetahorasextras.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_horasextras,RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 89;BA.debugLine="EtiquetaHorasExtras.TextSize = 12";
Debug.ShouldStop(16777216);
_etiquetahorasextras.runMethod(true,"setTextSize",BA.numberCast(float.class, 12));
 BA.debugLineNum = 90;BA.debugLine="EtiquetaHorasExtras.TextColor = Colors.White";
Debug.ShouldStop(33554432);
_etiquetahorasextras.runMethod(true,"setTextColor",listperson.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 91;BA.debugLine="EtiquetaHorasExtras.Gravity = Gravity.LEFT";
Debug.ShouldStop(67108864);
_etiquetahorasextras.runMethod(true,"setGravity",listperson.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 92;BA.debugLine="EtiquetaHorasExtras.Gravity = Gravity.BOTTOM";
Debug.ShouldStop(134217728);
_etiquetahorasextras.runMethod(true,"setGravity",listperson.__c.getField(false,"Gravity").getField(true,"BOTTOM"));
 BA.debugLineNum = 94;BA.debugLine="AnotherProgressBar2Horas_Extras.mBase.AddView(Eti";
Debug.ShouldStop(536870912);
__ref.getField(false,"_anotherprogressbar2horas_extras" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_etiquetahorasextras.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listperson.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(__ref.getField(false,"_anotherprogressbar2horas_extras" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 96;BA.debugLine="Dim EtiquetaDiasReportados As Label";
Debug.ShouldStop(-2147483648);
_etiquetadiasreportados = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("EtiquetaDiasReportados", _etiquetadiasreportados);
 BA.debugLineNum = 97;BA.debugLine="EtiquetaDiasReportados.Initialize(\"\")";
Debug.ShouldStop(1);
_etiquetadiasreportados.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 98;BA.debugLine="EtiquetaDiasReportados.Text = DiasReportados & \"%";
Debug.ShouldStop(2);
_etiquetadiasreportados.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_diasreportados,RemoteObject.createImmutable("%"))));
 BA.debugLineNum = 99;BA.debugLine="EtiquetaDiasReportados.TextSize = 13";
Debug.ShouldStop(4);
_etiquetadiasreportados.runMethod(true,"setTextSize",BA.numberCast(float.class, 13));
 BA.debugLineNum = 100;BA.debugLine="EtiquetaDiasReportados.TextColor = Colors.White";
Debug.ShouldStop(8);
_etiquetadiasreportados.runMethod(true,"setTextColor",listperson.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 101;BA.debugLine="EtiquetaDiasReportados.Gravity = Gravity.LEFT";
Debug.ShouldStop(16);
_etiquetadiasreportados.runMethod(true,"setGravity",listperson.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 102;BA.debugLine="EtiquetaDiasReportados.Gravity = Gravity.BOTTOM";
Debug.ShouldStop(32);
_etiquetadiasreportados.runMethod(true,"setGravity",listperson.__c.getField(false,"Gravity").getField(true,"BOTTOM"));
 BA.debugLineNum = 104;BA.debugLine="AnotherProgressBar1Dias_reportados.mBase.AddView(";
Debug.ShouldStop(128);
__ref.getField(false,"_anotherprogressbar1dias_reportados" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_etiquetadiasreportados.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listperson.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(__ref.getField(false,"_anotherprogressbar1dias_reportados" /*RemoteObject*/ ).getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 106;BA.debugLine="Label20Name.Text = NombreElemento";
Debug.ShouldStop(512);
__ref.getField(false,"_label20name" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_nombreelemento));
 BA.debugLineNum = 108;BA.debugLine="Return Panel";
Debug.ShouldStop(2048);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "listperson","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(131072);
 BA.debugLineNum = 20;BA.debugLine="Return Me";
Debug.ShouldStop(524288);
if (true) return __ref;
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "listperson","label1_click", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 118;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(2097152);
listperson._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (listperson) ","listperson",4,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "listperson","label2_click", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="B4XPages.ShowPage(\"EditPerson\")";
Debug.ShouldStop(4);
listperson._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("EditPerson")));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}