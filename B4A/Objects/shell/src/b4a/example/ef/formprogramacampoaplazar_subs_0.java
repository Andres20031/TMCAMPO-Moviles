package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formprogramacampoaplazar_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formprogramacampoaplazar","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 62;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 64;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(-2147483648);
_formatteddate = formprogramacampoaplazar.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 67;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(4);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 70;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(32);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 73;BA.debugLine="Label11.Text = formattedDate";
Debug.ShouldStop(256);
__ref.getField(false,"_label11" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 76;BA.debugLine="Panel20.Visible = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_panel20" /*RemoteObject*/ ).runMethod(true,"setVisible",formprogramacampoaplazar.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="fecha = formattedDate";
Debug.ShouldStop(16384);
__ref.setField ("_fecha" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 82;BA.debugLine="Log(fecha)";
Debug.ShouldStop(131072);
formprogramacampoaplazar.__c.runVoidMethod ("LogImpl","320250644",__ref.getField(true,"_fecha" /*RemoteObject*/ ),0);
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
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formprogramacampoaplazar","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 37;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Root = Root1";
Debug.ShouldStop(32);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 40;BA.debugLine="Root.LoadLayout(\"FormLaboresCampoA\")";
Debug.ShouldStop(128);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormLaboresCampoA")),__ref.getField(false, "ba"));
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
public static void  _button1_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("button1_click")) { __ref.runUserSub(false, "formprogramacampoaplazar","button1_click", __ref); return;}
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
public ResumableSub_Button1_Click(b4a.example.ef.formprogramacampoaplazar parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formprogramacampoaplazar parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,99);
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
 BA.debugLineNum = 100;BA.debugLine="Log(\"El consecutivo: \"&Label8.Text)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","320447233",RemoteObject.concat(RemoteObject.createImmutable("El consecutivo: "),__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"getText")),0);
 BA.debugLineNum = 102;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(32);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 103;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(64);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 138;BA.debugLine="Log(\"Fecha_Programa_LaborAntes: \" & Fecha_Program";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","320447271",RemoteObject.concat(RemoteObject.createImmutable("Fecha_Programa_LaborAntes: "),__ref.getField(true,"_fecha_programa_laborantes" /*RemoteObject*/ )),0);
 BA.debugLineNum = 139;BA.debugLine="Log(\"Area_Programa_LaborAntes: \" & Area_Programa_";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","320447272",RemoteObject.concat(RemoteObject.createImmutable("Area_Programa_LaborAntes: "),__ref.getField(true,"_area_programa_laborantes" /*RemoteObject*/ )),0);
 BA.debugLineNum = 140;BA.debugLine="Log(\"ObservacionAntes: \"& ObservacionAntes)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","320447273",RemoteObject.concat(RemoteObject.createImmutable("ObservacionAntes: "),__ref.getField(true,"_observacionantes" /*RemoteObject*/ )),0);
 BA.debugLineNum = 141;BA.debugLine="Log(\"FECHA: \"&fecha)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","320447274",RemoteObject.concat(RemoteObject.createImmutable("FECHA: "),__ref.getField(true,"_fecha" /*RemoteObject*/ )),0);
 BA.debugLineNum = 142;BA.debugLine="Log(\"AREA: \"&area)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","320447275",RemoteObject.concat(RemoteObject.createImmutable("AREA: "),__ref.getField(true,"_area" /*RemoteObject*/ )),0);
 BA.debugLineNum = 143;BA.debugLine="Log(\"OBSERVACION: \"&Observacion)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","320447276",RemoteObject.concat(RemoteObject.createImmutable("OBSERVACION: "),__ref.getField(true,"_observacion" /*RemoteObject*/ )),0);
 BA.debugLineNum = 145;BA.debugLine="sf.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_sf" /*RemoteObject*/ ).runVoidMethod ("_vvv1",__ref.getField(false, "ba"));
 BA.debugLineNum = 146;BA.debugLine="If (sf.Trim(fecha) = \"\" Or sf.Trim(area) = \"\" ) T";
Debug.ShouldStop(131072);
if (true) break;

case 1:
//if
this.state = 25;
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_fecha" /*RemoteObject*/ ))),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_area" /*RemoteObject*/ ))),RemoteObject.createImmutable("")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 25;
 BA.debugLineNum = 147;BA.debugLine="MsgboxAsync(\"Tienes algun campo vacio\",\"Error\")";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Tienes algun campo vacio")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 149;BA.debugLine="If (sf.Trim(Observacion) = \"\") Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 150;BA.debugLine="Observacion = \"N/A\"";
Debug.ShouldStop(2097152);
__ref.setField ("_observacion" /*RemoteObject*/ ,BA.ObjectToString("N/A"));
 if (true) break;
;
 BA.debugLineNum = 152;BA.debugLine="If (sf.Trim(ObservacionAntes) = \"\") Then";
Debug.ShouldStop(8388608);

case 9:
//if
this.state = 12;
if ((RemoteObject.solveBoolean("=",__ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(__ref.getField(true,"_observacionantes" /*RemoteObject*/ ))),RemoteObject.createImmutable("")))) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 153;BA.debugLine="ObservacionAntes = \"N/A\"";
Debug.ShouldStop(16777216);
__ref.setField ("_observacionantes" /*RemoteObject*/ ,BA.ObjectToString("N/A"));
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 157;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"programa_l";
Debug.ShouldStop(268435456);
_cmd = __ref.runClassMethod (b4a.example.ef.formprogramacampoaplazar.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("programa_labores_aplazar")),(Object)(RemoteObject.createNewArray("Object",new int[] {8},new Object[] {(__ref.getField(true,"_fecha_programa_laborantes" /*RemoteObject*/ )),(__ref.getField(true,"_area_programa_laborantes" /*RemoteObject*/ )),(__ref.getField(true,"_observacionantes" /*RemoteObject*/ )),(__ref.getField(true,"_fecha" /*RemoteObject*/ )),(__ref.getField(true,"_area" /*RemoteObject*/ )),(__ref.getField(true,"_observacion" /*RemoteObject*/ )),RemoteObject.createImmutable(("Aplazada")),(__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"getText"))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 159;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(1073741824);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 160;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formprogramacampoaplazar", "button1_click"), (_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 162;BA.debugLine="Try";
Debug.ShouldStop(2);
if (true) break;

case 13:
//try
this.state = 24;
this.catchState = 23;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 23;
 BA.debugLineNum = 163;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4);
if (true) break;

case 16:
//if
this.state = 21;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 BA.debugLineNum = 164;BA.debugLine="MsgboxAsync(\"Se ha aplazado correctamente.\", \"";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha aplazado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 166;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Erro";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","320447299",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 21:
//C
this.state = 24;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 169;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","320447302",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 0;
;
 if (true) break;

case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
formprogramacampoaplazar._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formprogramacampoaplazar._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
formprogramacampoaplazar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formprogramacampoaplazar._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formprogramacampoaplazar._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formprogramacampoaplazar._rdclink);
 //BA.debugLineNum = 5;BA.debugLine="Private MiConsecutivo As String";
formprogramacampoaplazar._miconsecutivo = RemoteObject.createImmutable("");__ref.setField("_miconsecutivo",formprogramacampoaplazar._miconsecutivo);
 //BA.debugLineNum = 6;BA.debugLine="Private Label8 As Label";
formprogramacampoaplazar._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label8",formprogramacampoaplazar._label8);
 //BA.debugLineNum = 7;BA.debugLine="Dim Observacion As String";
formprogramacampoaplazar._observacion = RemoteObject.createImmutable("");__ref.setField("_observacion",formprogramacampoaplazar._observacion);
 //BA.debugLineNum = 8;BA.debugLine="Private Button1 As Button";
formprogramacampoaplazar._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",formprogramacampoaplazar._button1);
 //BA.debugLineNum = 9;BA.debugLine="Dim fecha As String";
formprogramacampoaplazar._fecha = RemoteObject.createImmutable("");__ref.setField("_fecha",formprogramacampoaplazar._fecha);
 //BA.debugLineNum = 10;BA.debugLine="Dim area As String";
formprogramacampoaplazar._area = RemoteObject.createImmutable("");__ref.setField("_area",formprogramacampoaplazar._area);
 //BA.debugLineNum = 12;BA.debugLine="Private sf As StringFunctions";
formprogramacampoaplazar._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf",formprogramacampoaplazar._sf);
 //BA.debugLineNum = 13;BA.debugLine="Private Label11 As Label";
formprogramacampoaplazar._label11 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label11",formprogramacampoaplazar._label11);
 //BA.debugLineNum = 14;BA.debugLine="Private Panel20 As Panel";
formprogramacampoaplazar._panel20 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel20",formprogramacampoaplazar._panel20);
 //BA.debugLineNum = 17;BA.debugLine="Dim Fecha_Programa_LaborAntes As String";
formprogramacampoaplazar._fecha_programa_laborantes = RemoteObject.createImmutable("");__ref.setField("_fecha_programa_laborantes",formprogramacampoaplazar._fecha_programa_laborantes);
 //BA.debugLineNum = 19;BA.debugLine="Dim Area_Programa_LaborAntes As String";
formprogramacampoaplazar._area_programa_laborantes = RemoteObject.createImmutable("");__ref.setField("_area_programa_laborantes",formprogramacampoaplazar._area_programa_laborantes);
 //BA.debugLineNum = 20;BA.debugLine="Dim ObservacionAntes As String";
formprogramacampoaplazar._observacionantes = RemoteObject.createImmutable("");__ref.setField("_observacionantes",formprogramacampoaplazar._observacionantes);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formprogramacampoaplazar","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 180;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 181;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(1048576);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 182;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(2097152);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 183;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(4194304);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 184;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 185;BA.debugLine="Return cmd";
Debug.ShouldStop(16777216);
if (true) return _cmd;
 BA.debugLineNum = 186;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext1_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText1_TextChanged (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("edittext1_textchanged")) { return __ref.runUserSub(false, "formprogramacampoaplazar","edittext1_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 86;BA.debugLine="Private Sub EditText1_TextChanged (Old As String,";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="area = New";
Debug.ShouldStop(4194304);
__ref.setField ("_area" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 89;BA.debugLine="Log(\"EL area nueva es: \"& area)";
Debug.ShouldStop(16777216);
formprogramacampoaplazar.__c.runVoidMethod ("LogImpl","320316163",RemoteObject.concat(RemoteObject.createImmutable("EL area nueva es: "),__ref.getField(true,"_area" /*RemoteObject*/ )),0);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext3_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText3_TextChanged (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("edittext3_textchanged")) { return __ref.runUserSub(false, "formprogramacampoaplazar","edittext3_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 92;BA.debugLine="Private Sub EditText3_TextChanged (Old As String,";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 93;BA.debugLine="Observacion = New";
Debug.ShouldStop(268435456);
__ref.setField ("_observacion" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 95;BA.debugLine="Log(\"la observacion es \" & Observacion)";
Debug.ShouldStop(1073741824);
formprogramacampoaplazar.__c.runVoidMethod ("LogImpl","320381699",RemoteObject.concat(RemoteObject.createImmutable("la observacion es "),__ref.getField(true,"_observacion" /*RemoteObject*/ )),0);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Initialize (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formprogramacampoaplazar","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Return Me";
Debug.ShouldStop(16777216);
if (true) return __ref;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("Label1_Click (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "formprogramacampoaplazar","label1_click", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(65536);
formprogramacampoaplazar._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("Label11_Click (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("label11_click")) { return __ref.runUserSub(false, "formprogramacampoaplazar","label11_click", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub Label11_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Panel20.Visible = True";
Debug.ShouldStop(8388608);
__ref.getField(false,"_panel20" /*RemoteObject*/ ).runMethod(true,"setVisible",formprogramacampoaplazar.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel20_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel20_Click (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("panel20_click")) { return __ref.runUserSub(false, "formprogramacampoaplazar","panel20_click", __ref);}
 BA.debugLineNum = 176;BA.debugLine="Private Sub Panel20_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("SetConsecutivo (formprogramacampoaplazar) ","formprogramacampoaplazar",15,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setconsecutivo")) { return __ref.runUserSub(false, "formprogramacampoaplazar","setconsecutivo", __ref, _valor);}
Debug.locals.put("Valor", _valor);
 BA.debugLineNum = 28;BA.debugLine="Public Sub SetConsecutivo(Valor As String)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="MiConsecutivo = Valor";
Debug.ShouldStop(268435456);
__ref.setField ("_miconsecutivo" /*RemoteObject*/ ,_valor);
 BA.debugLineNum = 30;BA.debugLine="If Label8.IsInitialized Then";
Debug.ShouldStop(536870912);
if (__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 31;BA.debugLine="Label8.Text = MiConsecutivo";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_label8" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_miconsecutivo" /*RemoteObject*/ )));
 };
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
}