package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formmaquinaria_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,292);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formmaquinaria","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 292;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(8);
 BA.debugLineNum = 294;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(32);
_formatteddate = formmaquinaria.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 297;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(256);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 300;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(2048);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 303;BA.debugLine="Label13Time.Text = formattedDate";
Debug.ShouldStop(16384);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 306;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(131072);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formmaquinaria.__c.getField(true,"False"));
 BA.debugLineNum = 309;BA.debugLine="fecha = formattedDate";
Debug.ShouldStop(1048576);
__ref.setField ("_fecha" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "formmaquinaria","b4xpage_appear", __ref); return;}
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
public ResumableSub_B4XPage_Appear(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmdmaquina = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j2 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resmaquina = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowmaquina = null;
RemoteObject _codigomaquina = RemoteObject.createImmutable("");
RemoteObject _descripcionmaquina = RemoteObject.createImmutable("");
RemoteObject _cmdlabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j3 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reslabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowlabormaquina = null;
RemoteObject _codigolabormaquina = RemoteObject.createImmutable("");
RemoteObject _descripcionlabormaquina = RemoteObject.createImmutable("");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _razonsocial = RemoteObject.createImmutable("");
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _cmdimple = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j4 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resimple = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowimple = null;
RemoteObject _codigoimple = RemoteObject.createImmutable("");
RemoteObject _descripcionimple = RemoteObject.createImmutable("");
RemoteObject _cmdoper = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j5 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resoper = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowoper = null;
RemoteObject _codigooper = RemoteObject.createImmutable("");
RemoteObject _apellido1 = RemoteObject.createImmutable("");
RemoteObject _apellido2 = RemoteObject.createImmutable("");
RemoteObject _nombre = RemoteObject.createImmutable("");
RemoteObject _cmdobser = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j6 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resobser = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowobser = null;
RemoteObject _codigoobser = RemoteObject.createImmutable("");
RemoteObject _desobser = RemoteObject.createImmutable("");
RemoteObject group14;
int index14;
int groupLen14;
RemoteObject group28;
int index28;
int groupLen28;
RemoteObject group42;
int index42;
int groupLen42;
RemoteObject group55;
int index55;
int groupLen55;
RemoteObject group70;
int index70;
int groupLen70;
RemoteObject group86;
int index86;
int groupLen86;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,77);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 78;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 79;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
Debug.ShouldStop(16384);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 80;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 81;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(65536);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 82;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(131072);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 83;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
Debug.ShouldStop(262144);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form1"))));
 BA.debugLineNum = 85;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1048576);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 86;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 89;BA.debugLine="Dim cmdMaquina As DBCommand = CreateCommand(\"sele";
Debug.ShouldStop(16777216);
_cmdmaquina = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maquina")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdMaquina", _cmdmaquina);Debug.locals.put("cmdMaquina", _cmdmaquina);
 BA.debugLineNum = 90;BA.debugLine="Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null))";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdmaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_j2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j2", _j2);
;
 BA.debugLineNum = 91;BA.debugLine="If j2.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 10;
if (_j2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 92;BA.debugLine="Req.HandleJobAsync(j2, \"req_maquina\")";
Debug.ShouldStop(134217728);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j2),(Object)(RemoteObject.createImmutable("req_maquina")));
 BA.debugLineNum = 93;BA.debugLine="Wait For (Req) req_maquina_Result(resMaquina As";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","req_maquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 62;
return;
case 62:
//C
this.state = 4;
_resmaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resMaquina", _resmaquina);
;
 BA.debugLineNum = 94;BA.debugLine="For Each rowMaquina() As Object In resMaquina.Ro";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//for
this.state = 7;
group14 = _resmaquina.getField(false,"Rows" /*RemoteObject*/ );
index14 = 0;
groupLen14 = group14.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowMaquina", _rowmaquina);
this.state = 63;
if (true) break;

case 63:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_rowmaquina = (group14.runMethod(false,"Get",index14));Debug.locals.put("rowMaquina", _rowmaquina);}
if (true) break;

case 64:
//C
this.state = 63;
index14++;
Debug.locals.put("rowMaquina", _rowmaquina);
if (true) break;

case 6:
//C
this.state = 64;
 BA.debugLineNum = 95;BA.debugLine="Dim codigoMaquina As String = rowMaquina(0) ' C";
Debug.ShouldStop(1073741824);
_codigomaquina = BA.ObjectToString(_rowmaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoMaquina", _codigomaquina);Debug.locals.put("codigoMaquina", _codigomaquina);
 BA.debugLineNum = 96;BA.debugLine="Dim descripcionMaquina As String = rowMaquina(1";
Debug.ShouldStop(-2147483648);
_descripcionmaquina = BA.ObjectToString(_rowmaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionMaquina", _descripcionmaquina);Debug.locals.put("descripcionMaquina", _descripcionmaquina);
 BA.debugLineNum = 97;BA.debugLine="SD_xComboBoxMaquina.Add(descripcionMaquina & \"";
Debug.ShouldStop(1);
__ref.getField(false,"_sd_xcomboboxmaquina" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_descripcionmaquina,RemoteObject.createImmutable(" - "),_codigomaquina)),(Object)((_codigomaquina)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("rowMaquina", _rowmaquina);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 100;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","39437207",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j2.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 102;BA.debugLine="j2.Release";
Debug.ShouldStop(32);
_j2.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
Debug.ShouldStop(512);
_cmdlabormaquina = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labor_maq")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);
 BA.debugLineNum = 107;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabormaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 65;
return;
case 65:
//C
this.state = 11;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 108;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 11:
//if
this.state = 20;
if (_j3.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 109;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
Debug.ShouldStop(4096);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_labormaquina")));
 BA.debugLineNum = 110;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","req_labormaquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 66;
return;
case 66:
//C
this.state = 14;
_reslabormaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLaborMaquina", _reslabormaquina);
;
 BA.debugLineNum = 111;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
Debug.ShouldStop(16384);
if (true) break;

case 14:
//for
this.state = 17;
group28 = _reslabormaquina.getField(false,"Rows" /*RemoteObject*/ );
index28 = 0;
groupLen28 = group28.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
this.state = 67;
if (true) break;

case 67:
//C
this.state = 17;
if (index28 < groupLen28) {
this.state = 16;
_rowlabormaquina = (group28.runMethod(false,"Get",index28));Debug.locals.put("rowLaborMaquina", _rowlabormaquina);}
if (true) break;

case 68:
//C
this.state = 67;
index28++;
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
if (true) break;

case 16:
//C
this.state = 68;
 BA.debugLineNum = 112;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
Debug.ShouldStop(32768);
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);
 BA.debugLineNum = 113;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
Debug.ShouldStop(65536);
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);
 BA.debugLineNum = 114;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina &";
Debug.ShouldStop(131072);
__ref.getField(false,"_sd_xcomboboxlabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_descripcionlabormaquina,RemoteObject.createImmutable(" - "),_codigolabormaquina)),(Object)((_codigolabormaquina)));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 117;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","39437224",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 119;BA.debugLine="j3.Release";
Debug.ShouldStop(4194304);
_j3.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(67108864);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 124;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 69;
return;
case 69:
//C
this.state = 21;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 125;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
if (true) break;

case 21:
//if
this.state = 30;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 126;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 127;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 70;
return;
case 70:
//C
this.state = 24;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 128;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(-2147483648);
if (true) break;

case 24:
//for
this.state = 27;
group42 = _res.getField(false,"Rows" /*RemoteObject*/ );
index42 = 0;
groupLen42 = group42.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 71;
if (true) break;

case 71:
//C
this.state = 27;
if (index42 < groupLen42) {
this.state = 26;
_row = (group42.runMethod(false,"Get",index42));Debug.locals.put("row", _row);}
if (true) break;

case 72:
//C
this.state = 71;
index42++;
Debug.locals.put("row", _row);
if (true) break;

case 26:
//C
this.state = 72;
 BA.debugLineNum = 129;BA.debugLine="Dim razonSocial As String = row(0)";
Debug.ShouldStop(1);
_razonsocial = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("razonSocial", _razonsocial);Debug.locals.put("razonSocial", _razonsocial);
 BA.debugLineNum = 130;BA.debugLine="Dim nit As String = row(1)";
Debug.ShouldStop(2);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("nit", _nit);Debug.locals.put("nit", _nit);
 BA.debugLineNum = 131;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
Debug.ShouldStop(4);
__ref.getField(false,"_sd_xcomboboxnit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_razonsocial,RemoteObject.createImmutable(" - "),_nit)),(Object)((_nit)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
Debug.locals.put("row", _row);
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 134;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","39437241",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 139;BA.debugLine="Dim cmdImple As DBCommand = CreateCommand(\"select";
Debug.ShouldStop(1024);
_cmdimple = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_implemento")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdImple", _cmdimple);Debug.locals.put("cmdImple", _cmdimple);
 BA.debugLineNum = 140;BA.debugLine="Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) Jo";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdimple),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 73;
return;
case 73:
//C
this.state = 31;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 141;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 31:
//if
this.state = 40;
if (_j4.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 33;
}else {
this.state = 39;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 142;BA.debugLine="Req.HandleJobAsync(j4, \"req_imple\")";
Debug.ShouldStop(8192);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_imple")));
 BA.debugLineNum = 143;BA.debugLine="Wait For (Req) req_imple_Result(resImple As DBRe";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","req_imple_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 74;
return;
case 74:
//C
this.state = 34;
_resimple = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resImple", _resimple);
;
 BA.debugLineNum = 144;BA.debugLine="For Each rowImple() As Object In resImple.Rows";
Debug.ShouldStop(32768);
if (true) break;

case 34:
//for
this.state = 37;
group55 = _resimple.getField(false,"Rows" /*RemoteObject*/ );
index55 = 0;
groupLen55 = group55.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowImple", _rowimple);
this.state = 75;
if (true) break;

case 75:
//C
this.state = 37;
if (index55 < groupLen55) {
this.state = 36;
_rowimple = (group55.runMethod(false,"Get",index55));Debug.locals.put("rowImple", _rowimple);}
if (true) break;

case 76:
//C
this.state = 75;
index55++;
Debug.locals.put("rowImple", _rowimple);
if (true) break;

case 36:
//C
this.state = 76;
 BA.debugLineNum = 145;BA.debugLine="Dim codigoImple As String = rowImple(0) ' Cdgo_";
Debug.ShouldStop(65536);
_codigoimple = BA.ObjectToString(_rowimple.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoImple", _codigoimple);Debug.locals.put("codigoImple", _codigoimple);
 BA.debugLineNum = 146;BA.debugLine="Dim descripcionImple As String = rowImple(1) '";
Debug.ShouldStop(131072);
_descripcionimple = BA.ObjectToString(_rowimple.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionImple", _descripcionimple);Debug.locals.put("descripcionImple", _descripcionimple);
 BA.debugLineNum = 147;BA.debugLine="SD_xComboBoxImplemento.Add(descripcionImple & \"";
Debug.ShouldStop(262144);
__ref.getField(false,"_sd_xcomboboximplemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_descripcionimple,RemoteObject.createImmutable(" - "),_codigoimple)),(Object)((_codigoimple)));
 BA.debugLineNum = 148;BA.debugLine="SD_xComboBoxImplemento2.Add(descripcionImple &";
Debug.ShouldStop(524288);
__ref.getField(false,"_sd_xcomboboximplemento2" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_descripcionimple,RemoteObject.createImmutable(" - "),_codigoimple)),(Object)((_codigoimple)));
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
Debug.locals.put("rowImple", _rowimple);
;
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 151;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","39437258",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 153;BA.debugLine="j4.Release";
Debug.ShouldStop(16777216);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 157;BA.debugLine="Dim cmdOper As DBCommand = CreateCommand(\"select_";
Debug.ShouldStop(268435456);
_cmdoper = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_operario")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdOper", _cmdoper);Debug.locals.put("cmdOper", _cmdoper);
 BA.debugLineNum = 158;BA.debugLine="Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) Job";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdoper),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 77;
return;
case 77:
//C
this.state = 41;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 159;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 41:
//if
this.state = 50;
if (_j5.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 43;
}else {
this.state = 49;
}if (true) break;

case 43:
//C
this.state = 44;
 BA.debugLineNum = 160;BA.debugLine="Req.HandleJobAsync(j5, \"req_oper\")";
Debug.ShouldStop(-2147483648);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_oper")));
 BA.debugLineNum = 161;BA.debugLine="Wait For (Req) req_oper_Result(resOper As DBResu";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","req_oper_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 78;
return;
case 78:
//C
this.state = 44;
_resoper = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resOper", _resoper);
;
 BA.debugLineNum = 162;BA.debugLine="For Each rowOper() As Object In resOper.Rows";
Debug.ShouldStop(2);
if (true) break;

case 44:
//for
this.state = 47;
group70 = _resoper.getField(false,"Rows" /*RemoteObject*/ );
index70 = 0;
groupLen70 = group70.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowOper", _rowoper);
this.state = 79;
if (true) break;

case 79:
//C
this.state = 47;
if (index70 < groupLen70) {
this.state = 46;
_rowoper = (group70.runMethod(false,"Get",index70));Debug.locals.put("rowOper", _rowoper);}
if (true) break;

case 80:
//C
this.state = 79;
index70++;
Debug.locals.put("rowOper", _rowoper);
if (true) break;

case 46:
//C
this.state = 80;
 BA.debugLineNum = 163;BA.debugLine="Dim codigoOper As String = rowOper(0)";
Debug.ShouldStop(4);
_codigooper = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoOper", _codigooper);Debug.locals.put("codigoOper", _codigooper);
 BA.debugLineNum = 164;BA.debugLine="Dim apellido1 As String = rowOper(1)";
Debug.ShouldStop(8);
_apellido1 = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("apellido1", _apellido1);Debug.locals.put("apellido1", _apellido1);
 BA.debugLineNum = 165;BA.debugLine="Dim apellido2 As String = rowOper(2)";
Debug.ShouldStop(16);
_apellido2 = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("apellido2", _apellido2);Debug.locals.put("apellido2", _apellido2);
 BA.debugLineNum = 166;BA.debugLine="Dim nombre As String = rowOper(3)";
Debug.ShouldStop(32);
_nombre = BA.ObjectToString(_rowoper.getArrayElement(false,BA.numberCast(int.class, 3)));Debug.locals.put("nombre", _nombre);Debug.locals.put("nombre", _nombre);
 BA.debugLineNum = 167;BA.debugLine="SD_xComboBoxOperario.Add(apellido1&\" \"&apellido";
Debug.ShouldStop(64);
__ref.getField(false,"_sd_xcomboboxoperario" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_apellido1,RemoteObject.createImmutable(" "),_apellido2,RemoteObject.createImmutable(" "),_nombre)),(Object)((_codigooper)));
 if (true) break;
if (true) break;

case 47:
//C
this.state = 50;
Debug.locals.put("rowOper", _rowoper);
;
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 170;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j5.Err";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","39437277",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 172;BA.debugLine="j5.Release";
Debug.ShouldStop(2048);
_j5.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 176;BA.debugLine="Dim cmdObser As DBCommand = CreateCommand(\"select";
Debug.ShouldStop(32768);
_cmdobser = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_observaciones")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdObser", _cmdobser);Debug.locals.put("cmdObser", _cmdobser);
 BA.debugLineNum = 177;BA.debugLine="Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) Jo";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdobser),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 81;
return;
case 81:
//C
this.state = 51;
_j6 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j6", _j6);
;
 BA.debugLineNum = 178;BA.debugLine="If j6.Success Then";
Debug.ShouldStop(131072);
if (true) break;

case 51:
//if
this.state = 60;
if (_j6.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 53;
}else {
this.state = 59;
}if (true) break;

case 53:
//C
this.state = 54;
 BA.debugLineNum = 179;BA.debugLine="Req.HandleJobAsync(j6, \"req_obser\")";
Debug.ShouldStop(262144);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j6),(Object)(RemoteObject.createImmutable("req_obser")));
 BA.debugLineNum = 180;BA.debugLine="Wait For (Req) req_obser_Result(resObser As DBRe";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","req_obser_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "b4xpage_appear"), (_req));
this.state = 82;
return;
case 82:
//C
this.state = 54;
_resobser = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resObser", _resobser);
;
 BA.debugLineNum = 181;BA.debugLine="For Each rowObser() As Object In resObser.Rows";
Debug.ShouldStop(1048576);
if (true) break;

case 54:
//for
this.state = 57;
group86 = _resobser.getField(false,"Rows" /*RemoteObject*/ );
index86 = 0;
groupLen86 = group86.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowObser", _rowobser);
this.state = 83;
if (true) break;

case 83:
//C
this.state = 57;
if (index86 < groupLen86) {
this.state = 56;
_rowobser = (group86.runMethod(false,"Get",index86));Debug.locals.put("rowObser", _rowobser);}
if (true) break;

case 84:
//C
this.state = 83;
index86++;
Debug.locals.put("rowObser", _rowobser);
if (true) break;

case 56:
//C
this.state = 84;
 BA.debugLineNum = 182;BA.debugLine="Dim codigoObser As String = rowObser(0)";
Debug.ShouldStop(2097152);
_codigoobser = BA.ObjectToString(_rowobser.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoObser", _codigoobser);Debug.locals.put("codigoObser", _codigoobser);
 BA.debugLineNum = 183;BA.debugLine="Dim desObser As String = rowObser(1)";
Debug.ShouldStop(4194304);
_desobser = BA.ObjectToString(_rowobser.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("desObser", _desobser);Debug.locals.put("desObser", _desobser);
 BA.debugLineNum = 184;BA.debugLine="SD_xComboBoxObservaciones.Add(desObser&\"-\"&codi";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sd_xcomboboxobservaciones" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_desobser,RemoteObject.createImmutable("-"),_codigoobser)),(Object)((_codigoobser)));
 if (true) break;
if (true) break;

case 57:
//C
this.state = 60;
Debug.locals.put("rowObser", _rowobser);
;
 if (true) break;

case 59:
//C
this.state = 60;
 BA.debugLineNum = 187;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j6.Err";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","39437294",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j6.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 60:
//C
this.state = -1;
;
 BA.debugLineNum = 189;BA.debugLine="j6.Release";
Debug.ShouldStop(268435456);
_j6.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j2) throws Exception{
}
public static void  _req_maquina_result(RemoteObject __ref,RemoteObject _resmaquina) throws Exception{
}
public static void  _req_labormaquina_result(RemoteObject __ref,RemoteObject _reslabormaquina) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _req_imple_result(RemoteObject __ref,RemoteObject _resimple) throws Exception{
}
public static void  _req_oper_result(RemoteObject __ref,RemoteObject _resoper) throws Exception{
}
public static void  _req_obser_result(RemoteObject __ref,RemoteObject _resobser) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formmaquinaria","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 64;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Root = Root1";
Debug.ShouldStop(1);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Button1_Click (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("button1_click")) { __ref.runUserSub(false, "formmaquinaria","button1_click", __ref); return;}
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
public ResumableSub_Button1_Click(b4a.example.ef.formmaquinaria parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,364);
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
 BA.debugLineNum = 366;BA.debugLine="Ascdo_Maq_Mvto_Maq = \"CP\"";
Debug.ShouldStop(8192);
__ref.setField ("_ascdo_maq_mvto_maq" /*RemoteObject*/ ,BA.ObjectToString("CP"));
 BA.debugLineNum = 368;BA.debugLine="horainicio = EditText1HoraInicio.Text";
Debug.ShouldStop(32768);
__ref.setField ("_horainicio" /*RemoteObject*/ ,__ref.getField(false,"_edittext1horainicio" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 369;BA.debugLine="horafin = EditText2HoraFim.Text";
Debug.ShouldStop(65536);
__ref.setField ("_horafin" /*RemoteObject*/ ,__ref.getField(false,"_edittext2horafim" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 370;BA.debugLine="combustible = EditText1.Text";
Debug.ShouldStop(131072);
__ref.setField ("_combustible" /*RemoteObject*/ ,__ref.getField(false,"_edittext1" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 371;BA.debugLine="area = EditText2.Text";
Debug.ShouldStop(262144);
__ref.setField ("_area" /*RemoteObject*/ ,__ref.getField(false,"_edittext2" /*RemoteObject*/ ).runMethod(true,"getText"));
 BA.debugLineNum = 372;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(524288);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 374;BA.debugLine="fechaHoy = DateTime.Date(DateTime.Now) ' Esto te";
Debug.ShouldStop(2097152);
__ref.setField ("_fechahoy" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 375;BA.debugLine="fechaHoy = fechaHoy.Replace(\"/\", \"-\") ' Reemplaza";
Debug.ShouldStop(4194304);
__ref.setField ("_fechahoy" /*RemoteObject*/ ,__ref.getField(true,"_fechahoy" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-"))));
 BA.debugLineNum = 376;BA.debugLine="fechaHoy = fechaHoy & \" 00:00:00\" ' Agregar la";
Debug.ShouldStop(8388608);
__ref.setField ("_fechahoy" /*RemoteObject*/ ,RemoteObject.concat(__ref.getField(true,"_fechahoy" /*RemoteObject*/ ),RemoteObject.createImmutable(" 00:00:00")));
 BA.debugLineNum = 378;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
Debug.ShouldStop(33554432);
__ref.setField ("_horaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 379;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(67108864);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 381;BA.debugLine="Log(\"Ascdo_Maq_Mvto_Maq: \" & Ascdo_Maq_Mvto_Maq)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","310354705",RemoteObject.concat(RemoteObject.createImmutable("Ascdo_Maq_Mvto_Maq: "),__ref.getField(true,"_ascdo_maq_mvto_maq" /*RemoteObject*/ )),0);
 BA.debugLineNum = 382;BA.debugLine="Log(\"maquina: \" & maquina)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","310354706",RemoteObject.concat(RemoteObject.createImmutable("maquina: "),__ref.getField(true,"_maquina" /*RemoteObject*/ )),0);
 BA.debugLineNum = 383;BA.debugLine="Log(\"fecha: \" & fecha)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","310354707",RemoteObject.concat(RemoteObject.createImmutable("fecha: "),__ref.getField(true,"_fecha" /*RemoteObject*/ )),0);
 BA.debugLineNum = 384;BA.debugLine="Log(\"labor: \" & labor)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","310354708",RemoteObject.concat(RemoteObject.createImmutable("labor: "),__ref.getField(true,"_labor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 385;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","310354709",RemoteObject.concat(RemoteObject.createImmutable("nitEmpresaCBX: "),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 386;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","310354710",RemoteObject.concat(RemoteObject.createImmutable("haciendaCBX: "),__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 387;BA.debugLine="Log(\"Lote: \" & Lote)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","310354711",RemoteObject.concat(RemoteObject.createImmutable("Lote: "),__ref.getField(true,"_lote" /*RemoteObject*/ )),0);
 BA.debugLineNum = 388;BA.debugLine="Log(\"implemento: \" & implemento)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","310354712",RemoteObject.concat(RemoteObject.createImmutable("implemento: "),__ref.getField(true,"_implemento" /*RemoteObject*/ )),0);
 BA.debugLineNum = 389;BA.debugLine="Log(\"horainicio: \" & horainicio)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","310354713",RemoteObject.concat(RemoteObject.createImmutable("horainicio: "),__ref.getField(true,"_horainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 390;BA.debugLine="Log(\"horafin: \" & horafin)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","310354714",RemoteObject.concat(RemoteObject.createImmutable("horafin: "),__ref.getField(true,"_horafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 391;BA.debugLine="Log(\"combustible: \" & combustible)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","310354715",RemoteObject.concat(RemoteObject.createImmutable("combustible: "),__ref.getField(true,"_combustible" /*RemoteObject*/ )),0);
 BA.debugLineNum = 392;BA.debugLine="Log(\"observaciones: \" & observaciones)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","310354716",RemoteObject.concat(RemoteObject.createImmutable("observaciones: "),__ref.getField(true,"_observaciones" /*RemoteObject*/ )),0);
 BA.debugLineNum = 393;BA.debugLine="Log(\"operario: \" & operario)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","310354717",RemoteObject.concat(RemoteObject.createImmutable("operario: "),__ref.getField(true,"_operario" /*RemoteObject*/ )),0);
 BA.debugLineNum = 394;BA.debugLine="Log(\"implemento2: \" & implemento2)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","310354718",RemoteObject.concat(RemoteObject.createImmutable("implemento2: "),__ref.getField(true,"_implemento2" /*RemoteObject*/ )),0);
 BA.debugLineNum = 395;BA.debugLine="Log(\"area: \" & area)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","310354719",RemoteObject.concat(RemoteObject.createImmutable("area: "),__ref.getField(true,"_area" /*RemoteObject*/ )),0);
 BA.debugLineNum = 396;BA.debugLine="Log(\"fechaHoy: \" & fechaHoy)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","310354720",RemoteObject.concat(RemoteObject.createImmutable("fechaHoy: "),__ref.getField(true,"_fechahoy" /*RemoteObject*/ )),0);
 BA.debugLineNum = 397;BA.debugLine="Log(\"horaActual: \" & horaActual)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","310354721",RemoteObject.concat(RemoteObject.createImmutable("horaActual: "),__ref.getField(true,"_horaactual" /*RemoteObject*/ )),0);
 BA.debugLineNum = 398;BA.debugLine="Log(\"user: \" & user)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","310354722",RemoteObject.concat(RemoteObject.createImmutable("user: "),__ref.getField(true,"_user" /*RemoteObject*/ )),0);
 BA.debugLineNum = 399;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","310354723",RemoteObject.concat(RemoteObject.createImmutable("DeviceName: "),__ref.getField(true,"_devicename" /*RemoteObject*/ )),0);
 BA.debugLineNum = 402;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(131072);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 403;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(262144);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 406;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mvto";
Debug.ShouldStop(2097152);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_Mvto_Maq")),(Object)(RemoteObject.createNewArray("Object",new int[] {19},new Object[] {(__ref.getField(true,"_ascdo_maq_mvto_maq" /*RemoteObject*/ )),(__ref.getField(true,"_maquina" /*RemoteObject*/ )),(__ref.getField(true,"_fecha" /*RemoteObject*/ )),(__ref.getField(true,"_labor" /*RemoteObject*/ )),(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lote" /*RemoteObject*/ )),(__ref.getField(true,"_implemento" /*RemoteObject*/ )),(__ref.getField(true,"_horainicio" /*RemoteObject*/ )),(__ref.getField(true,"_horafin" /*RemoteObject*/ )),(__ref.getField(true,"_combustible" /*RemoteObject*/ )),(__ref.getField(true,"_observaciones" /*RemoteObject*/ )),(__ref.getField(true,"_operario" /*RemoteObject*/ )),(__ref.getField(true,"_implemento2" /*RemoteObject*/ )),(__ref.getField(true,"_area" /*RemoteObject*/ )),(__ref.getField(true,"_fechahoy" /*RemoteObject*/ )),(__ref.getField(true,"_horaactual" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 409;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(16777216);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 410;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "button1_click"), (_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 413;BA.debugLine="Try";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 BA.debugLineNum = 414;BA.debugLine="If j.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 9;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 415;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 417;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","310354741",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 BA.debugLineNum = 420;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","310354744",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
formmaquinaria._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formmaquinaria._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
formmaquinaria._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formmaquinaria._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private utilClass As util";
formmaquinaria._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",formmaquinaria._utilclass);
 //BA.debugLineNum = 6;BA.debugLine="Private CustomListView1Geral As CustomListView";
formmaquinaria._customlistview1geral = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1geral",formmaquinaria._customlistview1geral);
 //BA.debugLineNum = 7;BA.debugLine="Private Panel1geral As Panel";
formmaquinaria._panel1geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1geral",formmaquinaria._panel1geral);
 //BA.debugLineNum = 8;BA.debugLine="Private Label1Back As Label";
formmaquinaria._label1back = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1back",formmaquinaria._label1back);
 //BA.debugLineNum = 9;BA.debugLine="Private Label2Save As Label";
formmaquinaria._label2save = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2save",formmaquinaria._label2save);
 //BA.debugLineNum = 11;BA.debugLine="Private SD_xComboBoxMaquina As SD_xComboBox";
formmaquinaria._sd_xcomboboxmaquina = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxmaquina",formmaquinaria._sd_xcomboboxmaquina);
 //BA.debugLineNum = 12;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
formmaquinaria._sd_xcomboboxlabor = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlabor",formmaquinaria._sd_xcomboboxlabor);
 //BA.debugLineNum = 13;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
formmaquinaria._sd_xcomboboxnit = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxnit",formmaquinaria._sd_xcomboboxnit);
 //BA.debugLineNum = 14;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
formmaquinaria._sd_xcomboboxhacienda = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxhacienda",formmaquinaria._sd_xcomboboxhacienda);
 //BA.debugLineNum = 15;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
formmaquinaria._sd_xcomboboxlote = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlote",formmaquinaria._sd_xcomboboxlote);
 //BA.debugLineNum = 16;BA.debugLine="Private SD_xComboBoxImplemento As SD_xComboBox";
formmaquinaria._sd_xcomboboximplemento = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboximplemento",formmaquinaria._sd_xcomboboximplemento);
 //BA.debugLineNum = 17;BA.debugLine="Private SD_xComboBoxImplemento2 As SD_xComboBox";
formmaquinaria._sd_xcomboboximplemento2 = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboximplemento2",formmaquinaria._sd_xcomboboximplemento2);
 //BA.debugLineNum = 18;BA.debugLine="Private SD_xComboBoxOperario As SD_xComboBox";
formmaquinaria._sd_xcomboboxoperario = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxoperario",formmaquinaria._sd_xcomboboxoperario);
 //BA.debugLineNum = 19;BA.debugLine="Private SD_xComboBoxObservaciones As SD_xComboBox";
formmaquinaria._sd_xcomboboxobservaciones = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxobservaciones",formmaquinaria._sd_xcomboboxobservaciones);
 //BA.debugLineNum = 22;BA.debugLine="Dim haciendaCBX As String";
formmaquinaria._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formmaquinaria._haciendacbx);
 //BA.debugLineNum = 24;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formmaquinaria._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formmaquinaria._rdclink);
 //BA.debugLineNum = 27;BA.debugLine="Private Panel2Time As Panel";
formmaquinaria._panel2time = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2time",formmaquinaria._panel2time);
 //BA.debugLineNum = 28;BA.debugLine="Private Label13Time As Label";
formmaquinaria._label13time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label13time",formmaquinaria._label13time);
 //BA.debugLineNum = 30;BA.debugLine="Private Panel12 As Panel";
formmaquinaria._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",formmaquinaria._panel12);
 //BA.debugLineNum = 33;BA.debugLine="Dim fecha As String";
formmaquinaria._fecha = RemoteObject.createImmutable("");__ref.setField("_fecha",formmaquinaria._fecha);
 //BA.debugLineNum = 34;BA.debugLine="Dim maquina As String";
formmaquinaria._maquina = RemoteObject.createImmutable("");__ref.setField("_maquina",formmaquinaria._maquina);
 //BA.debugLineNum = 35;BA.debugLine="Dim labor As String";
formmaquinaria._labor = RemoteObject.createImmutable("");__ref.setField("_labor",formmaquinaria._labor);
 //BA.debugLineNum = 36;BA.debugLine="Dim nitEmpresaCBX As String";
formmaquinaria._nitempresacbx = RemoteObject.createImmutable("");__ref.setField("_nitempresacbx",formmaquinaria._nitempresacbx);
 //BA.debugLineNum = 37;BA.debugLine="Dim haciendaCBX As String";
formmaquinaria._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formmaquinaria._haciendacbx);
 //BA.debugLineNum = 38;BA.debugLine="Dim Lote As String";
formmaquinaria._lote = RemoteObject.createImmutable("");__ref.setField("_lote",formmaquinaria._lote);
 //BA.debugLineNum = 39;BA.debugLine="Dim implemento As String";
formmaquinaria._implemento = RemoteObject.createImmutable("");__ref.setField("_implemento",formmaquinaria._implemento);
 //BA.debugLineNum = 40;BA.debugLine="Dim implemento2 As String";
formmaquinaria._implemento2 = RemoteObject.createImmutable("");__ref.setField("_implemento2",formmaquinaria._implemento2);
 //BA.debugLineNum = 41;BA.debugLine="Dim operario As String";
formmaquinaria._operario = RemoteObject.createImmutable("");__ref.setField("_operario",formmaquinaria._operario);
 //BA.debugLineNum = 42;BA.debugLine="Dim observaciones As String";
formmaquinaria._observaciones = RemoteObject.createImmutable("");__ref.setField("_observaciones",formmaquinaria._observaciones);
 //BA.debugLineNum = 43;BA.debugLine="Dim horafin As String";
formmaquinaria._horafin = RemoteObject.createImmutable("");__ref.setField("_horafin",formmaquinaria._horafin);
 //BA.debugLineNum = 44;BA.debugLine="Dim horainicio As String";
formmaquinaria._horainicio = RemoteObject.createImmutable("");__ref.setField("_horainicio",formmaquinaria._horainicio);
 //BA.debugLineNum = 45;BA.debugLine="Dim combustible As String";
formmaquinaria._combustible = RemoteObject.createImmutable("");__ref.setField("_combustible",formmaquinaria._combustible);
 //BA.debugLineNum = 46;BA.debugLine="Dim area As String";
formmaquinaria._area = RemoteObject.createImmutable("");__ref.setField("_area",formmaquinaria._area);
 //BA.debugLineNum = 47;BA.debugLine="Dim horaActual As String";
formmaquinaria._horaactual = RemoteObject.createImmutable("");__ref.setField("_horaactual",formmaquinaria._horaactual);
 //BA.debugLineNum = 48;BA.debugLine="Dim user As String";
formmaquinaria._user = RemoteObject.createImmutable("");__ref.setField("_user",formmaquinaria._user);
 //BA.debugLineNum = 49;BA.debugLine="Dim DeviceName As String";
formmaquinaria._devicename = RemoteObject.createImmutable("");__ref.setField("_devicename",formmaquinaria._devicename);
 //BA.debugLineNum = 50;BA.debugLine="Dim Ascdo_Maq_Mvto_Maq As String";
formmaquinaria._ascdo_maq_mvto_maq = RemoteObject.createImmutable("");__ref.setField("_ascdo_maq_mvto_maq",formmaquinaria._ascdo_maq_mvto_maq);
 //BA.debugLineNum = 51;BA.debugLine="Private EditText1HoraInicio As EditText";
formmaquinaria._edittext1horainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1horainicio",formmaquinaria._edittext1horainicio);
 //BA.debugLineNum = 52;BA.debugLine="Private EditText2HoraFim As EditText";
formmaquinaria._edittext2horafim = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2horafim",formmaquinaria._edittext2horafim);
 //BA.debugLineNum = 53;BA.debugLine="Private EditText1 As EditText";
formmaquinaria._edittext1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1",formmaquinaria._edittext1);
 //BA.debugLineNum = 54;BA.debugLine="Private EditText2 As EditText";
formmaquinaria._edittext2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2",formmaquinaria._edittext2);
 //BA.debugLineNum = 55;BA.debugLine="Dim fechaHoy As String";
formmaquinaria._fechahoy = RemoteObject.createImmutable("");__ref.setField("_fechahoy",formmaquinaria._fechahoy);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formmaquinaria","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 318;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(1073741824);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 320;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(-2147483648);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 321;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(1);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 322;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 323;BA.debugLine="Return cmd";
Debug.ShouldStop(4);
if (true) return _cmd;
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "formmaquinaria","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 268;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(2048);
 BA.debugLineNum = 270;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8192);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 271;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(16384);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formmaquinaria.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formmaquinaria.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 274;BA.debugLine="panel.LoadLayout(\"addMaquinariaUI\")";
Debug.ShouldStop(131072);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("addMaquinariaUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 276;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(524288);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 278;BA.debugLine="Return panel";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdevicename(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDeviceName (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getdevicename")) { return __ref.runUserSub(false, "formmaquinaria","getdevicename", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _manufacturer = RemoteObject.createImmutable("");
RemoteObject _model = RemoteObject.createImmutable("");
 BA.debugLineNum = 70;BA.debugLine="Sub GetDeviceName As String";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 72;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
Debug.ShouldStop(128);
_manufacturer = _p.runMethod(true,"getManufacturer");Debug.locals.put("Manufacturer", _manufacturer);Debug.locals.put("Manufacturer", _manufacturer);
 BA.debugLineNum = 73;BA.debugLine="Dim Model As String = p.Model";
Debug.ShouldStop(256);
_model = _p.runMethod(true,"getModel");Debug.locals.put("Model", _model);Debug.locals.put("Model", _model);
 BA.debugLineNum = 74;BA.debugLine="Return Manufacturer & \" \" & Model";
Debug.ShouldStop(512);
if (true) return RemoteObject.concat(_manufacturer,RemoteObject.createImmutable(" "),_model);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formmaquinaria","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 59;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Return Me";
Debug.ShouldStop(134217728);
if (true) return __ref;
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label13time_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label13Time_Click (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "formmaquinaria","label13time_click", __ref);}
 BA.debugLineNum = 286;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formmaquinaria.__c.getField(true,"True"));
 BA.debugLineNum = 288;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _sd_xcomboboxhacienda_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("sd_xcomboboxhacienda_itemclick")) { __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxhacienda_itemclick", __ref, _position, _value); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formmaquinaria parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,232);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 233;BA.debugLine="haciendaCBX=Value";
Debug.ShouldStop(256);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 235;BA.debugLine="SD_xComboBoxLote.Clear";
Debug.ShouldStop(1024);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 236;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(2048);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 237;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(4096);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 238;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(8192);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 241;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 244;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 246;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 247;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 251;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.getField(false,"Rows" /*RemoteObject*/ );
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 252;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(134217728);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 255;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Codigo: "),_codg_hacienda)),(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 260;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","39568284",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 264;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
public static RemoteObject  _sd_xcomboboximplemento_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxImplemento_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("sd_xcomboboximplemento_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboximplemento_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 342;BA.debugLine="Private Sub SD_xComboBoxImplemento_ItemClick (Posi";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 343;BA.debugLine="implemento = Value";
Debug.ShouldStop(4194304);
__ref.setField ("_implemento" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboximplemento2_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxImplemento2_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("sd_xcomboboximplemento2_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboximplemento2_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 348;BA.debugLine="Private Sub SD_xComboBoxImplemento2_ItemClick (Pos";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="implemento2 = Value";
Debug.ShouldStop(268435456);
__ref.setField ("_implemento2" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxlabor_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 333;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="labor = Value";
Debug.ShouldStop(8192);
__ref.setField ("_labor" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxlote_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,337);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 337;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
Debug.ShouldStop(65536);
 BA.debugLineNum = 338;BA.debugLine="Lote = Value";
Debug.ShouldStop(131072);
__ref.setField ("_lote" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 339;BA.debugLine="Log(Lote)";
Debug.ShouldStop(262144);
formmaquinaria.__c.runVoidMethod ("LogImpl","310027010",__ref.getField(true,"_lote" /*RemoteObject*/ ),0);
 BA.debugLineNum = 340;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxmaquina_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxMaquina_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("sd_xcomboboxmaquina_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxmaquina_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 327;BA.debugLine="Private Sub SD_xComboBoxMaquina_ItemClick (Positio";
Debug.ShouldStop(64);
 BA.debugLineNum = 328;BA.debugLine="maquina =Value";
Debug.ShouldStop(128);
__ref.setField ("_maquina" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _sd_xcomboboxnit_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("sd_xcomboboxnit_itemclick")) { __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxnit_itemclick", __ref, _position, _value); return;}
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formmaquinaria parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formmaquinaria parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda = RemoteObject.createImmutable("");
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,197);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 198;BA.debugLine="nitEmpresaCBX=Value";
Debug.ShouldStop(32);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 200;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(128);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 201;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(256);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 202;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(512);
_cmd = __ref.runClassMethod (b4a.example.ef.formmaquinaria.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("N"))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 205;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 208;BA.debugLine="If j.Success Then";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 210;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(131072);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 211;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 215;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4194304);
if (true) break;

case 4:
//for
this.state = 7;
group9 = _res.getField(false,"Rows" /*RemoteObject*/ );
index9 = 0;
groupLen9 = group9.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index9 < groupLen9) {
this.state = 6;
_row = (group9.runMethod(false,"Get",index9));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index9++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 216;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(8388608);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 217;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(16777216);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 220;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sd_xcomboboxhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_nombrehacienda,RemoteObject.createImmutable(" - "),_codg_hacienda)),(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("row", _row);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 225;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","39502748",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 228;BA.debugLine="j.Release";
Debug.ShouldStop(8);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
public static RemoteObject  _sd_xcomboboxobservaciones_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxObservaciones_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("sd_xcomboboxobservaciones_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxobservaciones_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 358;BA.debugLine="Private Sub SD_xComboBoxObservaciones_ItemClick (P";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="observaciones = Value";
Debug.ShouldStop(64);
__ref.setField ("_observaciones" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxoperario_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxOperario_ItemClick (formmaquinaria) ","formmaquinaria",10,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("sd_xcomboboxoperario_itemclick")) { return __ref.runUserSub(false, "formmaquinaria","sd_xcomboboxoperario_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 353;BA.debugLine="Private Sub SD_xComboBoxOperario_ItemClick (Positi";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="operario =Value";
Debug.ShouldStop(2);
__ref.setField ("_operario" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 356;BA.debugLine="End Sub";
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