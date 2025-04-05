package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formprogramacampocancelar_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formprogramacampocancelar","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoCancelar\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormLaboresCampoCancelar")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Button1_Click (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("button1_click")) { __ref.runUserSub(false, "formprogramacampocancelar","button1_click", __ref); return;}
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
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampocancelar parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formprogramacampocancelar parent;
RemoteObject _consecutivoint = RemoteObject.createImmutable(0);
RemoteObject _horasistema = RemoteObject.createImmutable("");
RemoteObject _fecha = RemoteObject.createImmutable(0L);
RemoteObject _fechaactual = RemoteObject.createImmutable("");
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,54);
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
 BA.debugLineNum = 56;BA.debugLine="Dim consecutivoInt As Int = MiConsecutivo";
Debug.ShouldStop(8388608);
_consecutivoint = BA.numberCast(int.class, __ref.getField(true,"_miconsecutivo" /*RemoteObject*/ ));Debug.locals.put("consecutivoInt", _consecutivoint);Debug.locals.put("consecutivoInt", _consecutivoint);
 BA.debugLineNum = 57;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(16777216);
_horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));Debug.locals.put("horaSistema", _horasistema);Debug.locals.put("horaSistema", _horasistema);
 BA.debugLineNum = 58;BA.debugLine="Dim fecha As Long = DateTime.Now";
Debug.ShouldStop(33554432);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 59;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\"";
Debug.ShouldStop(67108864);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 60;BA.debugLine="Dim fechaActual As String = DateTime.Date(fecha)";
Debug.ShouldStop(134217728);
_fechaactual = parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha));Debug.locals.put("fechaActual", _fechaactual);Debug.locals.put("fechaActual", _fechaactual);
 BA.debugLineNum = 63;BA.debugLine="Log(\"Fecha actual: \" & fechaActual)  ' Muestra la";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","321102601",RemoteObject.concat(RemoteObject.createImmutable("Fecha actual: "),_fechaactual),0);
 BA.debugLineNum = 64;BA.debugLine="Log(\"Hora actual: \" & horaSistema)  ' Muestra la";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","321102602",RemoteObject.concat(RemoteObject.createImmutable("Hora actual: "),_horasistema),0);
 BA.debugLineNum = 65;BA.debugLine="Log(\"Observacion: \" & observacion)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","321102603",RemoteObject.concat(RemoteObject.createImmutable("Observacion: "),__ref.getField(true,"_observacion" /*RemoteObject*/ )),0);
 BA.debugLineNum = 66;BA.debugLine="Log(\"Cancelada\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","321102604",RemoteObject.createImmutable("Cancelada"),0);
 BA.debugLineNum = 67;BA.debugLine="Log(\"ID\" & consecutivoInt)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","321102605",RemoteObject.concat(RemoteObject.createImmutable("ID"),_consecutivoint),0);
 BA.debugLineNum = 69;BA.debugLine="sf.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_sf" /*RemoteObject*/ ).runVoidMethod ("_vvv1",__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="If (sf.Trim(observacion) = \"\" ) Then";
Debug.ShouldStop(32);
if (true) break;

case 1:
//if
this.state = 22;
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_observacion" /*RemoteObject*/ ))),RemoteObject.createImmutable("")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 22;
 BA.debugLineNum = 71;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Tienes algun campo vacio")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 73;BA.debugLine="If (sf.Trim(observacion) = \"\") Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 74;BA.debugLine="observacion = \"N/A\"";
Debug.ShouldStop(512);
__ref.setField ("_observacion" /*RemoteObject*/ ,BA.ObjectToString("N/A"));
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 77;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(4096);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 78;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
Debug.ShouldStop(8192);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 81;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
Debug.ShouldStop(65536);
_cmd = __ref.runClassMethod (b4a.example.ef.formprogramacampocancelar.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("programa_labores_Cancelar")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(_fechaactual),(_horasistema),(__ref.getField(true,"_observacion" /*RemoteObject*/ )),RemoteObject.createImmutable(("Cancelada")),(__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"getText"))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 84;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(524288);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 85;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formprogramacampocancelar", "button1_click"), (_j));
this.state = 23;
return;
case 23:
//C
this.state = 10;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 88;BA.debugLine="Try";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 89;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 90;BA.debugLine="MsgboxAsync(\"Se ha cancelado correctamente.\",";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha cancelado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 92;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","321102630",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 95;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","321102633",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
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
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
formprogramacampocancelar._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formprogramacampocancelar._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
formprogramacampocancelar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formprogramacampocancelar._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private MiConsecutivo As String";
formprogramacampocancelar._miconsecutivo = RemoteObject.createImmutable("");__ref.setField("_miconsecutivo",formprogramacampocancelar._miconsecutivo);
 //BA.debugLineNum = 5;BA.debugLine="Private Label8 As Label";
formprogramacampocancelar._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label8",formprogramacampocancelar._label8);
 //BA.debugLineNum = 6;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formprogramacampocancelar._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formprogramacampocancelar._rdclink);
 //BA.debugLineNum = 7;BA.debugLine="Dim observacion As String";
formprogramacampocancelar._observacion = RemoteObject.createImmutable("");__ref.setField("_observacion",formprogramacampocancelar._observacion);
 //BA.debugLineNum = 8;BA.debugLine="Private sf As StringFunctions";
formprogramacampocancelar._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf",formprogramacampocancelar._sf);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formprogramacampocancelar","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 46;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(16384);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 48;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(32768);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(65536);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 50;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 51;BA.debugLine="Return cmd";
Debug.ShouldStop(262144);
if (true) return _cmd;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext3_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText3_TextChanged (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("edittext3_textchanged")) { return __ref.runUserSub(false, "formprogramacampocancelar","edittext3_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 39;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="observacion = New";
Debug.ShouldStop(256);
__ref.setField ("_observacion" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 43;BA.debugLine="Log(observacion)";
Debug.ShouldStop(1024);
formprogramacampocancelar.__c.runVoidMethod ("LogImpl","320971524",__ref.getField(true,"_observacion" /*RemoteObject*/ ),0);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Initialize (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formprogramacampocancelar","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(2048);
 BA.debugLineNum = 13;BA.debugLine="Return Me";
Debug.ShouldStop(4096);
if (true) return __ref;
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Label1_Click (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "formprogramacampocancelar","label1_click", __ref);}
 BA.debugLineNum = 33;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 34;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(2);
formprogramacampocancelar._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
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
public static RemoteObject  _setconsecutivo(RemoteObject __ref,RemoteObject _valor) throws Exception{
try {
		Debug.PushSubsStack("SetConsecutivo (formprogramacampocancelar) ","formprogramacampocancelar",16,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("setconsecutivo")) { return __ref.runUserSub(false, "formprogramacampocancelar","setconsecutivo", __ref, _valor);}
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 16;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="MiConsecutivo = Valor";
Debug.ShouldStop(65536);
__ref.setField ("_miconsecutivo" /*RemoteObject*/ ,_valor);
 BA.debugLineNum = 18;BA.debugLine="If Label8.IsInitialized Then";
Debug.ShouldStop(131072);
if (__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 19;BA.debugLine="Label8.Text = MiConsecutivo";
Debug.ShouldStop(262144);
__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_miconsecutivo" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 21;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}