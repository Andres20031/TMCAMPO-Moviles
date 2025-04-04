package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formprogramacampo_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formprogramacampo","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 87;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 89;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(16777216);
_formatteddate = formprogramacampo.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 92;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(134217728);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 95;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(1073741824);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 98;BA.debugLine="Label9.Text = formattedDate";
Debug.ShouldStop(2);
__ref.getField(false,"_label9" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 101;BA.debugLine="Panel7.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_panel7" /*RemoteObject*/ ).runMethod(true,"setVisible",formprogramacampo.__c.getField(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="fechaInicio = formattedDate";
Debug.ShouldStop(128);
__ref.setField ("_fechainicio" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 107;BA.debugLine="Log(fechaInicio)";
Debug.ShouldStop(1024);
formprogramacampo.__c.runVoidMethod ("LogImpl","43473428",__ref.getField(true,"_fechainicio" /*RemoteObject*/ ),0);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _as_datepicker2_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker2_SelectedDateChanged (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("as_datepicker2_selecteddatechanged")) { return __ref.runUserSub(false, "formprogramacampo","as_datepicker2_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 114;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
Debug.ShouldStop(131072);
 BA.debugLineNum = 116;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(524288);
_formatteddate = formprogramacampo.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 119;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(4194304);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 122;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(33554432);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 125;BA.debugLine="Label11.Text = formattedDate";
Debug.ShouldStop(268435456);
__ref.getField(false,"_label11" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 128;BA.debugLine="Panel8.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_panel8" /*RemoteObject*/ ).runMethod(true,"setVisible",formprogramacampo.__c.getField(true,"False"));
 BA.debugLineNum = 131;BA.debugLine="fechaFin = formattedDate";
Debug.ShouldStop(4);
__ref.setField ("_fechafin" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 134;BA.debugLine="Log(fechaFin)";
Debug.ShouldStop(32);
formprogramacampo.__c.runVoidMethod ("LogImpl","43604500",__ref.getField(true,"_fechafin" /*RemoteObject*/ ),0);
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formprogramacampo","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="Root = Root1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 33;BA.debugLine="Root.LoadLayout(\"FormLaboresCampo\") ' Carga el di";
Debug.ShouldStop(1);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormLaboresCampo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("button1_click")) { __ref.runUserSub(false, "formprogramacampo","button1_click", __ref); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampo parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formprogramacampo parent;
RemoteObject _horasistema = RemoteObject.createImmutable("");
RemoteObject _fecha = RemoteObject.createImmutable(0L);
RemoteObject _fechaactual = RemoteObject.createImmutable("");
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,39);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 40;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(128);
_horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("horaSistema", _horasistema);Debug.locals.put("horaSistema", _horasistema);
 BA.debugLineNum = 41;BA.debugLine="Dim fecha As Long = DateTime.Now";
Debug.ShouldStop(256);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 42;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(512);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 43;BA.debugLine="Dim fechaActual As String = DateTime.Date(fecha)";
Debug.ShouldStop(1024);
_fechaactual = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha));Debug.locals.put("fechaActual", _fechaactual);Debug.locals.put("fechaActual", _fechaactual);
 BA.debugLineNum = 45;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(4096);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 46;BA.debugLine="Log (\"FECHA DE INICIO: \"&fechaInicio)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","43342343",RemoteObject.concat(RemoteObject.createImmutable("FECHA DE INICIO: "),__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 47;BA.debugLine="Log (\"FECHA DE FIN: \"&fechaFin)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","43342344",RemoteObject.concat(RemoteObject.createImmutable("FECHA DE FIN: "),__ref.getField(true,"_fechafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 48;BA.debugLine="Log (\"AREA: \"&area)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","43342345",RemoteObject.concat(RemoteObject.createImmutable("AREA: "),__ref.getField(true,"_area" /*RemoteObject*/ )),0);
 BA.debugLineNum = 49;BA.debugLine="Log (\"OBSERVACION: \"&Observacion)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","43342346",RemoteObject.concat(RemoteObject.createImmutable("OBSERVACION: "),__ref.getField(true,"_observacion" /*RemoteObject*/ )),0);
 BA.debugLineNum = 50;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","43342347",RemoteObject.concat(RemoteObject.createImmutable("fechaActual: "),_fechaactual),0);
 BA.debugLineNum = 51;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","43342348",RemoteObject.concat(RemoteObject.createImmutable("horaSistema: "),_horasistema),0);
 BA.debugLineNum = 53;BA.debugLine="sf.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sf" /*RemoteObject*/ ).runVoidMethod ("_vvv1",__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="If (sf.Trim(fechaInicio) = \"\" Or sf.Trim(fechaFin";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 22;
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_fechainicio" /*RemoteObject*/ ))),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_fechafin" /*RemoteObject*/ ))),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_area" /*RemoteObject*/ ))),RemoteObject.createImmutable("")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 22;
 BA.debugLineNum = 55;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Tienes algun campo vacio")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 57;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
Debug.ShouldStop(16777216);
if (true) break;

case 6:
//if
this.state = 9;
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_observacion" /*RemoteObject*/ ))),RemoteObject.createImmutable("")))) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 58;BA.debugLine="Observacion = \"N/A\"";
Debug.ShouldStop(33554432);
__ref.setField ("_observacion" /*RemoteObject*/ ,BA.ObjectToString("N/A"));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 61;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(268435456);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 62;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
Debug.ShouldStop(1);
_cmd = __ref.runClassMethod (b4a.example.ef.formprogramacampo.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("programa_labores_Update")),(Object)(RemoteObject.createNewArray("Object",new int[] {8},new Object[] {(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_fechafin" /*RemoteObject*/ )),(__ref.getField(true,"_area" /*RemoteObject*/ )),(__ref.getField(true,"_observacion" /*RemoteObject*/ )),(_fechaactual),(_horasistema),RemoteObject.createImmutable(("Terminada")),(__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"getText"))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 67;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(4);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 68;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formprogramacampo", "button1_click"), (_j));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 70;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 10:
//try
this.state = 21;
this.catchState = 20;
this.state = 12;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 20;
 BA.debugLineNum = 71;BA.debugLine="If j.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 13:
//if
this.state = 18;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
 BA.debugLineNum = 72;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 74;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","43342371",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 18:
//C
this.state = 21;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 20:
//C
this.state = 21;
this.catchState = 0;
 BA.debugLineNum = 77;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","43342374",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
;
 if (true) break;

case 22:
//C
this.state = -1;
;
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e0.toString());}
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
formprogramacampo._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formprogramacampo._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
formprogramacampo._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formprogramacampo._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private Label8 As Label";
formprogramacampo._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label8",formprogramacampo._label8);
 //BA.debugLineNum = 5;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formprogramacampo._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formprogramacampo._rdclink);
 //BA.debugLineNum = 6;BA.debugLine="Private Panel7 As Panel";
formprogramacampo._panel7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel7",formprogramacampo._panel7);
 //BA.debugLineNum = 7;BA.debugLine="Private Label9 As Label";
formprogramacampo._label9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label9",formprogramacampo._label9);
 //BA.debugLineNum = 8;BA.debugLine="Private MiConsecutivo As String";
formprogramacampo._miconsecutivo = RemoteObject.createImmutable("");__ref.setField("_miconsecutivo",formprogramacampo._miconsecutivo);
 //BA.debugLineNum = 9;BA.debugLine="Dim fechaInicio As String";
formprogramacampo._fechainicio = RemoteObject.createImmutable("");__ref.setField("_fechainicio",formprogramacampo._fechainicio);
 //BA.debugLineNum = 10;BA.debugLine="Dim fechaFin As String";
formprogramacampo._fechafin = RemoteObject.createImmutable("");__ref.setField("_fechafin",formprogramacampo._fechafin);
 //BA.debugLineNum = 11;BA.debugLine="Dim area As String";
formprogramacampo._area = RemoteObject.createImmutable("");__ref.setField("_area",formprogramacampo._area);
 //BA.debugLineNum = 12;BA.debugLine="Dim Observacion As String";
formprogramacampo._observacion = RemoteObject.createImmutable("");__ref.setField("_observacion",formprogramacampo._observacion);
 //BA.debugLineNum = 13;BA.debugLine="Private Panel8 As Panel";
formprogramacampo._panel8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel8",formprogramacampo._panel8);
 //BA.debugLineNum = 14;BA.debugLine="Private Label11 As Label";
formprogramacampo._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label11",formprogramacampo._label11);
 //BA.debugLineNum = 15;BA.debugLine="Private sf As StringFunctions";
formprogramacampo._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf",formprogramacampo._sf);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formprogramacampo","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 152;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(16777216);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 154;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(33554432);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 155;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(67108864);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 156;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 157;BA.debugLine="Return cmd";
Debug.ShouldStop(268435456);
if (true) return _cmd;
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextarea_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextArea_TextChanged (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("edittextarea_textchanged")) { return __ref.runUserSub(false, "formprogramacampo","edittextarea_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 141;BA.debugLine="Private Sub EditTextArea_TextChanged (Old As Strin";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="area = New";
Debug.ShouldStop(8192);
__ref.setField ("_area" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 143;BA.debugLine="Log(\"El area es:\" & area)";
Debug.ShouldStop(16384);
formprogramacampo.__c.runVoidMethod ("LogImpl","43735554",RemoteObject.concat(RemoteObject.createImmutable("El area es:"),__ref.getField(true,"_area" /*RemoteObject*/ )),0);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextobservacion_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextObservacion_TextChanged (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("edittextobservacion_textchanged")) { return __ref.runUserSub(false, "formprogramacampo","edittextobservacion_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 146;BA.debugLine="Private Sub EditTextObservacion_TextChanged (Old A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="Observacion = New";
Debug.ShouldStop(262144);
__ref.setField ("_observacion" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 149;BA.debugLine="Log(\"La observacion es: \" & Observacion)";
Debug.ShouldStop(1048576);
formprogramacampo.__c.runVoidMethod ("LogImpl","43801091",RemoteObject.concat(RemoteObject.createImmutable("La observacion es: "),__ref.getField(true,"_observacion" /*RemoteObject*/ )),0);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formprogramacampo","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Label1_Click (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "formprogramacampo","label1_click", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(524288);
formprogramacampo._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label11_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label11_Click (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("label11_click")) { return __ref.runUserSub(false, "formprogramacampo","label11_click", __ref);}
 BA.debugLineNum = 137;BA.debugLine="Private Sub Label11_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 138;BA.debugLine="Panel8.Visible = True";
Debug.ShouldStop(512);
__ref.getField(false,"_panel8" /*RemoteObject*/ ).runMethod(true,"setVisible",formprogramacampo.__c.getField(true,"True"));
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label9_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label9_Click (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("label9_click")) { return __ref.runUserSub(false, "formprogramacampo","label9_click", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Private Sub Label9_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 111;BA.debugLine="Panel7.Visible=True";
Debug.ShouldStop(16384);
__ref.getField(false,"_panel7" /*RemoteObject*/ ).runMethod(true,"setVisible",formprogramacampo.__c.getField(true,"True"));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setconsecutivo(RemoteObject __ref,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("SetConsecutivo (formprogramacampo) ","formprogramacampo",5,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setconsecutivo")) { return __ref.runUserSub(false, "formprogramacampo","setconsecutivo", __ref, _valor);}
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 23;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="MiConsecutivo = Valor";
Debug.ShouldStop(8388608);
__ref.setField ("_miconsecutivo" /*RemoteObject*/ ,_valor);
 BA.debugLineNum = 25;BA.debugLine="If Label8.IsInitialized Then";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 26;BA.debugLine="Label8.Text = MiConsecutivo";
Debug.ShouldStop(33554432);
__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_miconsecutivo" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}