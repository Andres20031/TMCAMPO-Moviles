package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formlabores_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 204;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(2048);
 BA.debugLineNum = 206;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(8192);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 209;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(65536);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 212;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(524288);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 215;BA.debugLine="Label13Time.Text = formattedDate";
Debug.ShouldStop(4194304);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 218;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 221;BA.debugLine="fechaInicio = formattedDate";
Debug.ShouldStop(268435456);
__ref.setField ("_fechainicio" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("AS_DatePicker2_SelectedDateChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("as_datepicker2_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker2_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 226;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
Debug.ShouldStop(2);
 BA.debugLineNum = 228;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(8);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 231;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(64);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 234;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(512);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 237;BA.debugLine="Label14Time.Text = formattedDate";
Debug.ShouldStop(4096);
__ref.getField(false,"_label14time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 240;BA.debugLine="Panel3.Visible = False";
Debug.ShouldStop(32768);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 243;BA.debugLine="fechaFin = formattedDate";
Debug.ShouldStop(262144);
__ref.setField ("_fechafin" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "formlabores","b4xpage_appear", __ref); return;}
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
public ResumableSub_B4XPage_Appear(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _razonsocial = RemoteObject.createImmutable("");
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _cmdlabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j3 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reslabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowlabormaquina = null;
RemoteObject _codigolabormaquina = RemoteObject.createImmutable("");
RemoteObject _descripcionlabormaquina = RemoteObject.createImmutable("");
RemoteObject _cmdelementogasto = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j4 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reselementogasto = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowelementogasto = null;
RemoteObject _codigoelementogasto = RemoteObject.createImmutable("");
RemoteObject _descripcionelementogasto = RemoteObject.createImmutable("");
RemoteObject group14;
int index14;
int groupLen14;
RemoteObject group27;
int index27;
int groupLen27;
RemoteObject group41;
int index41;
int groupLen41;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,68);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 69;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 70;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
Debug.ShouldStop(32);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 71;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(64);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 72;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(128);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 73;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(256);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 74;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
Debug.ShouldStop(512);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form1"))));
 BA.debugLineNum = 76;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(2048);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 77;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(4096);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(32768);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 81;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 31;
return;
case 31:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 82;BA.debugLine="If j.Success Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 83;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(262144);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 84;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 32;
return;
case 32:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 85;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//for
this.state = 7;
group14 = _res.getField(false,"Rows" /*RemoteObject*/ );
index14 = 0;
groupLen14 = group14.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 33;
if (true) break;

case 33:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_row = (group14.runMethod(false,"Get",index14));Debug.locals.put("row", _row);}
if (true) break;

case 34:
//C
this.state = 33;
index14++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 34;
 BA.debugLineNum = 86;BA.debugLine="Dim razonSocial As String = row(0)";
Debug.ShouldStop(2097152);
_razonsocial = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("razonSocial", _razonsocial);Debug.locals.put("razonSocial", _razonsocial);
 BA.debugLineNum = 87;BA.debugLine="Dim nit As String = row(1)";
Debug.ShouldStop(4194304);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("nit", _nit);Debug.locals.put("nit", _nit);
 BA.debugLineNum = 88;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sd_xcomboboxnit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_razonsocial,RemoteObject.createImmutable(" - "),_nit)),(Object)((_nit)));
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
 BA.debugLineNum = 91;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","510616855",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 96;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
Debug.ShouldStop(-2147483648);
_cmdlabormaquina = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labor_maq")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);
 BA.debugLineNum = 97;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabormaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 35;
return;
case 35:
//C
this.state = 11;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 98;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 99;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
Debug.ShouldStop(4);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_labormaquina")));
 BA.debugLineNum = 100;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","req_labormaquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 36;
return;
case 36:
//C
this.state = 14;
_reslabormaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLaborMaquina", _reslabormaquina);
;
 BA.debugLineNum = 101;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
Debug.ShouldStop(16);
if (true) break;

case 14:
//for
this.state = 17;
group27 = _reslabormaquina.getField(false,"Rows" /*RemoteObject*/ );
index27 = 0;
groupLen27 = group27.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 17;
if (index27 < groupLen27) {
this.state = 16;
_rowlabormaquina = (group27.runMethod(false,"Get",index27));Debug.locals.put("rowLaborMaquina", _rowlabormaquina);}
if (true) break;

case 38:
//C
this.state = 37;
index27++;
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
if (true) break;

case 16:
//C
this.state = 38;
 BA.debugLineNum = 102;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
Debug.ShouldStop(32);
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);
 BA.debugLineNum = 103;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
Debug.ShouldStop(64);
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);
 BA.debugLineNum = 104;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina &";
Debug.ShouldStop(128);
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
 BA.debugLineNum = 107;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","510616871",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 109;BA.debugLine="j3.Release";
Debug.ShouldStop(4096);
_j3.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 113;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
Debug.ShouldStop(65536);
_cmdelementogasto = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_elementoGasto")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdElementoGasto", _cmdelementogasto);Debug.locals.put("cmdElementoGasto", _cmdelementogasto);
 BA.debugLineNum = 114;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdelementogasto),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 39;
return;
case 39:
//C
this.state = 21;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 115;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 21:
//if
this.state = 30;
if (_j4.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 116;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
Debug.ShouldStop(524288);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_elementoGasto")));
 BA.debugLineNum = 117;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","req_elementogasto_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 40;
return;
case 40:
//C
this.state = 24;
_reselementogasto = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resElementoGasto", _reselementogasto);
;
 BA.debugLineNum = 118;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
Debug.ShouldStop(2097152);
if (true) break;

case 24:
//for
this.state = 27;
group41 = _reselementogasto.getField(false,"Rows" /*RemoteObject*/ );
index41 = 0;
groupLen41 = group41.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowElementoGasto", _rowelementogasto);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 27;
if (index41 < groupLen41) {
this.state = 26;
_rowelementogasto = (group41.runMethod(false,"Get",index41));Debug.locals.put("rowElementoGasto", _rowelementogasto);}
if (true) break;

case 42:
//C
this.state = 41;
index41++;
Debug.locals.put("rowElementoGasto", _rowelementogasto);
if (true) break;

case 26:
//C
this.state = 42;
 BA.debugLineNum = 119;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
Debug.ShouldStop(4194304);
_codigoelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoElementoGasto", _codigoelementogasto);Debug.locals.put("codigoElementoGasto", _codigoelementogasto);
 BA.debugLineNum = 120;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
Debug.ShouldStop(8388608);
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);
 BA.debugLineNum = 121;BA.debugLine="SD_xComboBoxElemento.Add(descripcionElementoGas";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sd_xcomboboxelemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_descripcionelementogasto,RemoteObject.createImmutable(" - "),_codigoelementogasto)),(Object)((_codigoelementogasto)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
Debug.locals.put("rowElementoGasto", _rowelementogasto);
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 124;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","510616888",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 126;BA.debugLine="j4.Release";
Debug.ShouldStop(536870912);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 131;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Insumo\",0)";
Debug.ShouldStop(4);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Insumo")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 132;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Siembra\",1)";
Debug.ShouldStop(8);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Siembra")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 133;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Riego\",2)";
Debug.ShouldStop(16);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Riego")),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 135;BA.debugLine="data.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
public static void  _req_labormaquina_result(RemoteObject __ref,RemoteObject _reslabormaquina) throws Exception{
}
public static void  _req_elementogasto_result(RemoteObject __ref,RemoteObject _reselementogasto) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formlabores","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 62;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Root = Root1";
Debug.ShouldStop(1073741824);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xtable1_cellclicked(RemoteObject __ref,RemoteObject _columnid,RemoteObject _rowid) throws Exception{
try {
		Debug.PushSubsStack("B4XTable1_CellClicked (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,574);
if (RapidSub.canDelegate("b4xtable1_cellclicked")) { return __ref.runUserSub(false, "formlabores","b4xtable1_cellclicked", __ref, _columnid, _rowid);}
RemoteObject _rowdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _nombreinsu = RemoteObject.createImmutable("");
RemoteObject _cantidadinsu = RemoteObject.createImmutable(0);
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 574;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 575;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
Debug.ShouldStop(1073741824);
formlabores.__c.runVoidMethod ("LogImpl","581199105",RemoteObject.concat(RemoteObject.createImmutable("COLUM ID"),_columnid),0);
 BA.debugLineNum = 576;BA.debugLine="Log(\"ROW ID\"&RowId)";
Debug.ShouldStop(-2147483648);
formlabores.__c.runVoidMethod ("LogImpl","581199106",RemoteObject.concat(RemoteObject.createImmutable("ROW ID"),_rowid),0);
 BA.debugLineNum = 577;BA.debugLine="PanelTittleInsumo.Visible = True";
Debug.ShouldStop(1);
__ref.getField(false,"_paneltittleinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 578;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
Debug.ShouldStop(2);
_rowdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rowdata = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 579;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
Debug.ShouldStop(4);
_nombreinsu = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOMBRE")))));Debug.locals.put("nombreInsu", _nombreinsu);Debug.locals.put("nombreInsu", _nombreinsu);
 BA.debugLineNum = 580;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
Debug.ShouldStop(8);
_cantidadinsu = BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CANTIDAD")))));Debug.locals.put("cantidadInsu", _cantidadinsu);Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 581;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
Debug.ShouldStop(16);
__ref.getField(false,"_labelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("- "),_nombreinsu,RemoteObject.createImmutable(" / "),RemoteObject.createImmutable("Cantidad: "),_cantidadinsu)));
 BA.debugLineNum = 582;BA.debugLine="PanelInsumoSelect.Visible = True";
Debug.ShouldStop(32);
__ref.getField(false,"_panelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 583;BA.debugLine="ButtonDeleteInsumo.Visible = True";
Debug.ShouldStop(64);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 585;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
Debug.ShouldStop(256);
__ref.setField ("_ideliminartabla" /*RemoteObject*/ ,BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("#"))))));
 BA.debugLineNum = 586;BA.debugLine="Log(idEliminarTabla)";
Debug.ShouldStop(512);
formlabores.__c.runVoidMethod ("LogImpl","581199116",BA.NumberToString(__ref.getField(true,"_ideliminartabla" /*RemoteObject*/ )),0);
 BA.debugLineNum = 587;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonaddinsumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonAddInsumo_Click (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,547);
if (RapidSub.canDelegate("buttonaddinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttonaddinsumo_click", __ref);}
RemoteObject _numberinsumo = RemoteObject.createImmutable(0);
 BA.debugLineNum = 547;BA.debugLine="Private Sub ButtonAddInsumo_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 548;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_nameinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_idinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_cantinsumo" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 549;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
Debug.ShouldStop(16);
formlabores.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 551;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
Debug.ShouldStop(64);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 552;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
Debug.ShouldStop(128);
_numberinsumo = __ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ );Debug.locals.put("numberInsumo", _numberinsumo);Debug.locals.put("numberInsumo", _numberinsumo);
 BA.debugLineNum = 553;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
Debug.ShouldStop(256);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_numberinsumo),(__ref.getField(true,"_idinsumo" /*RemoteObject*/ )),(__ref.getField(true,"_nameinsumo" /*RemoteObject*/ )),(__ref.getField(true,"_cantinsumo" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 554;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(512);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )));
 BA.debugLineNum = 555;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(1024);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 556;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_edittextcantidadinsumo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 558;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttondeleteinsumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonDeleteInsumo_Click (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("buttondeleteinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttondeleteinsumo_click", __ref);}
 BA.debugLineNum = 561;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 563;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeinsumofromdata" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_ideliminartabla" /*RemoteObject*/ )));
 BA.debugLineNum = 565;BA.debugLine="ButtonDeleteInsumo.Visible = False";
Debug.ShouldStop(1048576);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 566;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
Debug.ShouldStop(2097152);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 567;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(4194304);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 568;BA.debugLine="PanelTittleInsumo.Visible = False";
Debug.ShouldStop(8388608);
__ref.getField(false,"_paneltittleinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 569;BA.debugLine="PanelInsumoSelect.Visible = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_panelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 570;BA.debugLine="ButtonDeleteInsumo.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 571;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
formlabores._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formlabores._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
formlabores._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formlabores._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
formlabores._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",formlabores._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Private CustomListView1Geral As CustomListView";
formlabores._customlistview1geral = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1geral",formlabores._customlistview1geral);
 //BA.debugLineNum = 6;BA.debugLine="Private Panel1geral As Panel";
formlabores._panel1geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1geral",formlabores._panel1geral);
 //BA.debugLineNum = 7;BA.debugLine="Private Label13Time As Label";
formlabores._label13time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label13time",formlabores._label13time);
 //BA.debugLineNum = 8;BA.debugLine="Private Label14Time As Label";
formlabores._label14time = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label14time",formlabores._label14time);
 //BA.debugLineNum = 9;BA.debugLine="Private Panel3 As Panel";
formlabores._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3",formlabores._panel3);
 //BA.debugLineNum = 10;BA.debugLine="Private Panel12 As Panel";
formlabores._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",formlabores._panel12);
 //BA.debugLineNum = 11;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formlabores._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formlabores._rdclink);
 //BA.debugLineNum = 12;BA.debugLine="Dim fechaInicio As String";
formlabores._fechainicio = RemoteObject.createImmutable("");__ref.setField("_fechainicio",formlabores._fechainicio);
 //BA.debugLineNum = 13;BA.debugLine="Dim fechaFin As String";
formlabores._fechafin = RemoteObject.createImmutable("");__ref.setField("_fechafin",formlabores._fechafin);
 //BA.debugLineNum = 16;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
formlabores._sd_xcomboboxnit = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxnit",formlabores._sd_xcomboboxnit);
 //BA.debugLineNum = 17;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
formlabores._sd_xcomboboxhacienda = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxhacienda",formlabores._sd_xcomboboxhacienda);
 //BA.debugLineNum = 18;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
formlabores._sd_xcomboboxlote = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlote",formlabores._sd_xcomboboxlote);
 //BA.debugLineNum = 19;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
formlabores._sd_xcomboboxlabor = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlabor",formlabores._sd_xcomboboxlabor);
 //BA.debugLineNum = 20;BA.debugLine="Private SD_xComboBoxElemento As SD_xComboBox";
formlabores._sd_xcomboboxelemento = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxelemento",formlabores._sd_xcomboboxelemento);
 //BA.debugLineNum = 21;BA.debugLine="Private SD_xComboBoxTypeForm As SD_xComboBox";
formlabores._sd_xcomboboxtypeform = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtypeform",formlabores._sd_xcomboboxtypeform);
 //BA.debugLineNum = 22;BA.debugLine="Dim haciendaCBX As String";
formlabores._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formlabores._haciendacbx);
 //BA.debugLineNum = 23;BA.debugLine="Dim nitEmpresaCBX As String";
formlabores._nitempresacbx = RemoteObject.createImmutable("");__ref.setField("_nitempresacbx",formlabores._nitempresacbx);
 //BA.debugLineNum = 25;BA.debugLine="Private Panel2geral As Panel";
formlabores._panel2geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2geral",formlabores._panel2geral);
 //BA.debugLineNum = 26;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
formlabores._sd_xcomboboxtiporiego = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtiporiego",formlabores._sd_xcomboboxtiporiego);
 //BA.debugLineNum = 28;BA.debugLine="Private Panel3geral As Panel";
formlabores._panel3geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3geral",formlabores._panel3geral);
 //BA.debugLineNum = 29;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
formlabores._sd_xcomboboxcodigovariedad = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxcodigovariedad",formlabores._sd_xcomboboxcodigovariedad);
 //BA.debugLineNum = 30;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
formlabores._sd_xcomboboxtipolabranza = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtipolabranza",formlabores._sd_xcomboboxtipolabranza);
 //BA.debugLineNum = 32;BA.debugLine="Private cantidadInsumos As Int";
formlabores._cantidadinsumos = RemoteObject.createImmutable(0);__ref.setField("_cantidadinsumos",formlabores._cantidadinsumos);
 //BA.debugLineNum = 34;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
formlabores._sd_xcomboboxinsumo = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxinsumo",formlabores._sd_xcomboboxinsumo);
 //BA.debugLineNum = 35;BA.debugLine="Private EditTextCantidadInsumo As EditText";
formlabores._edittextcantidadinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittextcantidadinsumo",formlabores._edittextcantidadinsumo);
 //BA.debugLineNum = 36;BA.debugLine="Private ButtonAddInsumo As Button";
formlabores._buttonaddinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonaddinsumo",formlabores._buttonaddinsumo);
 //BA.debugLineNum = 37;BA.debugLine="Private ButtonDeleteInsumo As Button";
formlabores._buttondeleteinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttondeleteinsumo",formlabores._buttondeleteinsumo);
 //BA.debugLineNum = 38;BA.debugLine="Private Panel0geral As Panel";
formlabores._panel0geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel0geral",formlabores._panel0geral);
 //BA.debugLineNum = 40;BA.debugLine="Private IDINSUMO As String";
formlabores._idinsumo = RemoteObject.createImmutable("");__ref.setField("_idinsumo",formlabores._idinsumo);
 //BA.debugLineNum = 41;BA.debugLine="Private NAMEINSUMO As String";
formlabores._nameinsumo = RemoteObject.createImmutable("");__ref.setField("_nameinsumo",formlabores._nameinsumo);
 //BA.debugLineNum = 42;BA.debugLine="Private CANTINSUMO As String";
formlabores._cantinsumo = RemoteObject.createImmutable("");__ref.setField("_cantinsumo",formlabores._cantinsumo);
 //BA.debugLineNum = 44;BA.debugLine="Private LabelCantidadInsumos As Label";
formlabores._labelcantidadinsumos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelcantidadinsumos",formlabores._labelcantidadinsumos);
 //BA.debugLineNum = 45;BA.debugLine="Private B4XTable1 As B4XTable";
formlabores._b4xtable1 = RemoteObject.createNew ("b4a.example.ef.b4xtable");__ref.setField("_b4xtable1",formlabores._b4xtable1);
 //BA.debugLineNum = 46;BA.debugLine="Private data As List";
formlabores._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_data",formlabores._data);
 //BA.debugLineNum = 48;BA.debugLine="Private PanelInsumoSelect As Panel";
formlabores._panelinsumoselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panelinsumoselect",formlabores._panelinsumoselect);
 //BA.debugLineNum = 49;BA.debugLine="Private PanelTittleInsumo As Panel";
formlabores._paneltittleinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_paneltittleinsumo",formlabores._paneltittleinsumo);
 //BA.debugLineNum = 50;BA.debugLine="Private LabelInsumoSelect As Label";
formlabores._labelinsumoselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelinsumoselect",formlabores._labelinsumoselect);
 //BA.debugLineNum = 52;BA.debugLine="Dim idEliminarTabla As Int";
formlabores._ideliminartabla = RemoteObject.createImmutable(0);__ref.setField("_ideliminartabla",formlabores._ideliminartabla);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formlabores","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 248;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 249;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(16777216);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 250;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(33554432);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 251;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(67108864);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 252;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 253;BA.debugLine="Return cmd";
Debug.ShouldStop(268435456);
if (true) return _cmd;
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("CreateItem (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "formlabores","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 141;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16384);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 144;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(32768);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 147;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
Debug.ShouldStop(262144);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("addLaboresUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 149;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(1048576);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 151;BA.debugLine="Return panel";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createiteminsumo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateItemInsumo (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("createiteminsumo")) { return __ref.runUserSub(false, "formlabores","createiteminsumo", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 181;BA.debugLine="Private Sub CreateItemInsumo As Panel";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 183;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4194304);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 184;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(8388608);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 187;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
Debug.ShouldStop(67108864);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormInsumo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 189;BA.debugLine="panel.Height=Panel0geral.Height";
Debug.ShouldStop(268435456);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel0geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 191;BA.debugLine="Return panel";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitemriego(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateItemRiego (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("createitemriego")) { return __ref.runUserSub(false, "formlabores","createitemriego", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 155;BA.debugLine="Private Sub CreateItemRiego As Panel";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(268435456);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 158;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(536870912);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 161;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
Debug.ShouldStop(1);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormRiego")),__ref.getField(false, "ba"));
 BA.debugLineNum = 163;BA.debugLine="panel.Height=Panel2geral.Height";
Debug.ShouldStop(4);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel2geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 165;BA.debugLine="Return panel";
Debug.ShouldStop(16);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitemsiembra(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateItemSiembra (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("createitemsiembra")) { return __ref.runUserSub(false, "formlabores","createitemsiembra", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 168;BA.debugLine="Private Sub CreateItemSiembra As Panel";
Debug.ShouldStop(128);
 BA.debugLineNum = 170;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(512);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 171;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(1024);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 174;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
Debug.ShouldStop(8192);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormSiembra")),__ref.getField(false, "ba"));
 BA.debugLineNum = 176;BA.debugLine="panel.Height=Panel3geral.Height";
Debug.ShouldStop(32768);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel3geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 178;BA.debugLine="Return panel";
Debug.ShouldStop(131072);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextbandereo_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextBandereo_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,434);
if (RapidSub.canDelegate("edittextbandereo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextbandereo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 434;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
Debug.ShouldStop(131072);
 BA.debugLineNum = 436;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextcantidadagua_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextCantidadAgua_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("edittextcantidadagua_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadagua_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 385;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
Debug.ShouldStop(1);
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextcantidadinsumo_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextCantidadInsumo_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,542);
if (RapidSub.canDelegate("edittextcantidadinsumo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadinsumo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 542;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 543;BA.debugLine="ButtonAddInsumo.Enabled = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_buttonaddinsumo" /*RemoteObject*/ ).runMethod(true,"setEnabled",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 544;BA.debugLine="CANTINSUMO = New";
Debug.ShouldStop(-2147483648);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextcaudalaplicado_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextCaudalAplicado_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("edittextcaudalaplicado_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcaudalaplicado_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 381;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextdistanciasiembra_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDistanciaSiembra_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("edittextdistanciasiembra_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextdistanciasiembra_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 430;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
Debug.ShouldStop(8192);
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextnumeromacollos_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextNumeroMacollos_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("edittextnumeromacollos_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeromacollos_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 454;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
Debug.ShouldStop(32);
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextnumeropaquetes_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextNumeroPaquetes_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("edittextnumeropaquetes_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeropaquetes_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 450;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
Debug.ShouldStop(2);
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextprocedencia_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextProcedencia_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("edittextprocedencia_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedencia_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 377;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextprocedenciadestino_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextProcedenciaDestino_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("edittextprocedenciadestino_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedenciadestino_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 442;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittexttoneladasemilla_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextToneladaSemilla_TextChanged (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,438);
if (RapidSub.canDelegate("edittexttoneladasemilla_textchanged")) { return __ref.runUserSub(false, "formlabores","edittexttoneladasemilla_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 438;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("Initialize (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formlabores","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 56;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Return Me";
Debug.ShouldStop(16777216);
if (true) return __ref;
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Label13Time_Click (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "formlabores","label13time_click", __ref);}
 BA.debugLineNum = 196;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 197;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label14time_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label14Time_Click (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("label14time_click")) { return __ref.runUserSub(false, "formlabores","label14time_click", __ref);}
 BA.debugLineNum = 200;BA.debugLine="Private Sub Label14Time_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 201;BA.debugLine="Panel3.Visible = True";
Debug.ShouldStop(256);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label1back_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label1Back_Click (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "formlabores","label1back_click", __ref);}
 BA.debugLineNum = 608;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 609;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(1);
formlabores._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 610;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _llenarcomboboxinsumo(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("llenarcomboboxinsumo")) { __ref.runUserSub(false, "formlabores","llenarcomboboxinsumo", __ref); return;}
ResumableSub_LlenarComboBoxInsumo rsub = new ResumableSub_LlenarComboBoxInsumo(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LlenarComboBoxInsumo extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxInsumo(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _cdgo_producto = RemoteObject.createImmutable("");
RemoteObject _dscrpcion_producto = RemoteObject.createImmutable("");
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,516);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 517;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 518;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 520;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
Debug.ShouldStop(128);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_insumosSort")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 521;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 522;BA.debugLine="If j.Success Then";
Debug.ShouldStop(512);
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
 BA.debugLineNum = 523;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1024);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 524;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 525;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.getField(false,"Rows" /*RemoteObject*/ );
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 526;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
Debug.ShouldStop(8192);
_cdgo_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Producto", _cdgo_producto);Debug.locals.put("Cdgo_Producto", _cdgo_producto);
 BA.debugLineNum = 527;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
Debug.ShouldStop(16384);
_dscrpcion_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);
 BA.debugLineNum = 528;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto & \" -";
Debug.ShouldStop(32768);
__ref.getField(false,"_sd_xcomboboxinsumo" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_dscrpcion_producto,RemoteObject.createImmutable(" - "),_cdgo_producto)),(Object)((RemoteObject.concat(_dscrpcion_producto,RemoteObject.createImmutable(" - "),_cdgo_producto))));
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
 BA.debugLineNum = 531;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","512779535",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static void  _llenarcomboboxriego(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,458);
if (RapidSub.canDelegate("llenarcomboboxriego")) { __ref.runUserSub(false, "formlabores","llenarcomboboxriego", __ref); return;}
ResumableSub_LlenarComboBoxRiego rsub = new ResumableSub_LlenarComboBoxRiego(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LlenarComboBoxRiego extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxRiego(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _cdgo_tipo_riego = RemoteObject.createImmutable("");
RemoteObject _dscrpcion_tipo_riego = RemoteObject.createImmutable("");
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,458);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 459;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1024);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 460;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 462;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
Debug.ShouldStop(8192);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoRiego")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 463;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 464;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 465;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(65536);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 466;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 467;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(262144);
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.getField(false,"Rows" /*RemoteObject*/ );
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 14;
 BA.debugLineNum = 468;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
Debug.ShouldStop(524288);
_cdgo_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);
 BA.debugLineNum = 469;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
Debug.ShouldStop(1048576);
_dscrpcion_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);
 BA.debugLineNum = 470;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sd_xcomboboxtiporiego" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_dscrpcion_tipo_riego,RemoteObject.createImmutable(" - "),_cdgo_tipo_riego)),(Object)((_cdgo_tipo_riego)));
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
 BA.debugLineNum = 473;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","512648463",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 476;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _llenarcomboboxsiembra(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,478);
if (RapidSub.canDelegate("llenarcomboboxsiembra")) { __ref.runUserSub(false, "formlabores","llenarcomboboxsiembra", __ref); return;}
ResumableSub_LlenarComboBoxSiembra rsub = new ResumableSub_LlenarComboBoxSiembra(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_LlenarComboBoxSiembra extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxSiembra(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _cdgo_variedad = RemoteObject.createImmutable("");
RemoteObject _cmdtipolabranza = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j4 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _restipolabranza = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowtipolabranza = null;
RemoteObject _cdgo_tipo_labranza = RemoteObject.createImmutable("");
RemoteObject _dscrpcion_tipo_labranza = RemoteObject.createImmutable("");
RemoteObject group8;
int index8;
int groupLen8;
RemoteObject group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,478);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 479;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1073741824);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 480;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(-2147483648);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 483;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
Debug.ShouldStop(4);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_codVariedad")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 484;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 485;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 486;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 487;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 488;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(128);
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.getField(false,"Rows" /*RemoteObject*/ );
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 24:
//C
this.state = 23;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 24;
 BA.debugLineNum = 489;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
Debug.ShouldStop(256);
_cdgo_variedad = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);
 BA.debugLineNum = 490;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
Debug.ShouldStop(512);
__ref.getField(false,"_sd_xcomboboxcodigovariedad" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cdgo_variedad),(Object)((_cdgo_variedad)));
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
 BA.debugLineNum = 493;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","512713999",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 495;BA.debugLine="j.Release";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 499;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
Debug.ShouldStop(262144);
_cmdtipolabranza = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoLabranza")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);
 BA.debugLineNum = 500;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdtipolabranza),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 501;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(1048576);
if (true) break;

case 11:
//if
this.state = 20;
if (_j4.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 502;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_TipoLabranza")));
 BA.debugLineNum = 503;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","req_tipolabranza_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resTipoLabranza", _restipolabranza);
;
 BA.debugLineNum = 504;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
Debug.ShouldStop(8388608);
if (true) break;

case 14:
//for
this.state = 17;
group21 = _restipolabranza.getField(false,"Rows" /*RemoteObject*/ );
index21 = 0;
groupLen21 = group21.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowTipoLabranza", _rowtipolabranza);
this.state = 27;
if (true) break;

case 27:
//C
this.state = 17;
if (index21 < groupLen21) {
this.state = 16;
_rowtipolabranza = (group21.runMethod(false,"Get",index21));Debug.locals.put("rowTipoLabranza", _rowtipolabranza);}
if (true) break;

case 28:
//C
this.state = 27;
index21++;
Debug.locals.put("rowTipoLabranza", _rowtipolabranza);
if (true) break;

case 16:
//C
this.state = 28;
 BA.debugLineNum = 505;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
Debug.ShouldStop(16777216);
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);
 BA.debugLineNum = 506;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
Debug.ShouldStop(33554432);
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);
 BA.debugLineNum = 507;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sd_xcomboboxtipolabranza" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_dscrpcion_tipo_labranza,RemoteObject.createImmutable(" - "),_cdgo_tipo_labranza)),(Object)((_cdgo_tipo_labranza)));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("rowTipoLabranza", _rowtipolabranza);
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 510;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","512714016",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Tipo_Labranza: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 512;BA.debugLine="j4.Release";
Debug.ShouldStop(-2147483648);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
public static void  _req_tipolabranza_result(RemoteObject __ref,RemoteObject _restipolabranza) throws Exception{
}
public static RemoteObject  _removeform0ifexists(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveForm0IfExists (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,394);
if (RapidSub.canDelegate("removeform0ifexists")) { return __ref.runUserSub(false, "formlabores","removeform0ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 394;BA.debugLine="Private Sub RemoveForm0IfExists";
Debug.ShouldStop(512);
 BA.debugLineNum = 396;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(2048);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 397;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form0")))) { 
 BA.debugLineNum = 398;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(8192);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 399;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(16384);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeform2ifexists(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveForm2IfExists (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,405);
if (RapidSub.canDelegate("removeform2ifexists")) { return __ref.runUserSub(false, "formlabores","removeform2ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 405;BA.debugLine="Private Sub RemoveForm2IfExists";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 407;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(4194304);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 408;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form2")))) { 
 BA.debugLineNum = 409;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 410;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(33554432);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeform3ifexists(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveForm3IfExists (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,415);
if (RapidSub.canDelegate("removeform3ifexists")) { return __ref.runUserSub(false, "formlabores","removeform3ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 415;BA.debugLine="Private Sub RemoveForm3IfExists";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 417;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(1);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 418;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form3")))) { 
 BA.debugLineNum = 419;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(4);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 420;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(8);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeinsumofromdata(RemoteObject __ref,RemoteObject _insumoid) throws Exception{
try {
		Debug.PushSubsStack("RemoveInsumoFromData (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,590);
if (RapidSub.canDelegate("removeinsumofromdata")) { return __ref.runUserSub(false, "formlabores","removeinsumofromdata", __ref, _insumoid);}
int _i = 0;
RemoteObject _arrayelement = null;
Debug.locals.put("insumoID", _insumoid);
 BA.debugLineNum = 590;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 592;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
Debug.ShouldStop(32768);
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 594;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
Debug.ShouldStop(131072);
_arrayelement = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("arrayElement", _arrayelement);Debug.locals.put("arrayElement", _arrayelement);
 BA.debugLineNum = 597;BA.debugLine="If arrayElement(0) = insumoID Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_arrayelement.getArrayElement(false,BA.numberCast(int.class, 0)),(_insumoid))) { 
 BA.debugLineNum = 599;BA.debugLine="data.RemoveAt(i)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 600;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 604;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxcodigovariedad_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxCodigoVariedad_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,426);
if (RapidSub.canDelegate("sd_xcomboboxcodigovariedad_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxcodigovariedad_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 426;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
Debug.ShouldStop(512);
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxelemento_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxElemento_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("sd_xcomboboxelemento_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxelemento_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 335;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
Debug.ShouldStop(16384);
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("sd_xcomboboxhacienda_itemclick")) { __ref.runUserSub(false, "formlabores","sd_xcomboboxhacienda_itemclick", __ref, _position, _value); return;}
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
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formlabores parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
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
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,291);
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
 BA.debugLineNum = 292;BA.debugLine="haciendaCBX=Value";
Debug.ShouldStop(8);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 294;BA.debugLine="SD_xComboBoxLote.Clear";
Debug.ShouldStop(32);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 295;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(64);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 296;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(128);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 297;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(256);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 300;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 303;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 305;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(65536);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 306;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 310;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 311;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(4194304);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 314;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 319;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","511337756",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 323;BA.debugLine="j.Release";
Debug.ShouldStop(4);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static RemoteObject  _sd_xcomboboxinsumo_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxInsumo_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,536);
if (RapidSub.canDelegate("sd_xcomboboxinsumo_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxinsumo_itemclick", __ref, _position, _value);}
RemoteObject _partes = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 536;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 537;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
Debug.ShouldStop(16777216);
_partes = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" - ")),(Object)(BA.ObjectToString(_value)));Debug.locals.put("partes", _partes);Debug.locals.put("partes", _partes);
 BA.debugLineNum = 538;BA.debugLine="NAMEINSUMO = partes(0)";
Debug.ShouldStop(33554432);
__ref.setField ("_nameinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 539;BA.debugLine="IDINSUMO = partes(1)";
Debug.ShouldStop(67108864);
__ref.setField ("_idinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 331;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(1024);
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 327;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
Debug.ShouldStop(64);
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("sd_xcomboboxnit_itemclick")) { __ref.runUserSub(false, "formlabores","sd_xcomboboxnit_itemclick", __ref, _position, _value); return;}
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
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formlabores parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
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
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,256);
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
 BA.debugLineNum = 257;BA.debugLine="nitEmpresaCBX=Value";
Debug.ShouldStop(1);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 259;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(4);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 260;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(8);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 261;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(16);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("N"))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 264;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 267;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 269;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(4096);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 270;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 274;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 275;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(262144);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 276;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(524288);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 279;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 284;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","511272220",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 287;BA.debugLine="j.Release";
Debug.ShouldStop(1073741824);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
public static RemoteObject  _sd_xcomboboxtipolabranza_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxTipoLabranza_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("sd_xcomboboxtipolabranza_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtipolabranza_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 446;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxtiporiego_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxTipoRiego_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,389);
if (RapidSub.canDelegate("sd_xcomboboxtiporiego_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtiporiego_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 389;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
Debug.ShouldStop(16);
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxtypeform_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxTypeForm_ItemClick (formlabores) ","formlabores",11,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("sd_xcomboboxtypeform_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtypeform_itemclick", __ref, _position, _value);}
RemoteObject _insumocolum = RemoteObject.declareNull("b4a.example.ef.b4xtable._b4xtablecolumn");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 339;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
Debug.ShouldStop(262144);
 BA.debugLineNum = 342;BA.debugLine="If IsNumber(Value) Then";
Debug.ShouldStop(2097152);
if (formlabores.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_value))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 343;BA.debugLine="Select Case Value";
Debug.ShouldStop(4194304);
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable((0)),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((2)))) {
case 0: {
 BA.debugLineNum = 345;BA.debugLine="RemoveForm2IfExists";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 346;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 347;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
Debug.ShouldStop(67108864);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createiteminsumo" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form0"))));
 BA.debugLineNum = 348;BA.debugLine="LlenarComboBoxInsumo";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxinsumo" /*void*/ );
 BA.debugLineNum = 349;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
Debug.ShouldStop(268435456);
_insumocolum = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("#")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_numbers" /*RemoteObject*/ )));Debug.locals.put("INSUMOCOLUM", _insumocolum);Debug.locals.put("INSUMOCOLUM", _insumocolum);
 BA.debugLineNum = 350;BA.debugLine="INSUMOCOLUM.Width = 50dip";
Debug.ShouldStop(536870912);
_insumocolum.setField ("Width" /*RemoteObject*/ ,formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 351;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ID")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 352;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NOMBRE")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 353;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
Debug.ShouldStop(1);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("CANTIDAD")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 355;BA.debugLine="cantidadInsumos = 0";
Debug.ShouldStop(4);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 356;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(8);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 357;BA.debugLine="CANTINSUMO = \"\"";
Debug.ShouldStop(16);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,BA.ObjectToString(""));
 break; }
case 1: {
 BA.debugLineNum = 359;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 360;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 361;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
Debug.ShouldStop(256);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemsiembra" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form3"))));
 BA.debugLineNum = 362;BA.debugLine="LlenarComboBoxSiembra";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxsiembra" /*void*/ );
 break; }
case 2: {
 BA.debugLineNum = 364;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 365;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 366;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
Debug.ShouldStop(8192);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemriego" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form2"))));
 BA.debugLineNum = 367;BA.debugLine="LlenarComboBoxRiego";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxriego" /*void*/ );
 break; }
default: {
 BA.debugLineNum = 370;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
Debug.ShouldStop(131072);
formlabores.__c.runVoidMethod ("LogImpl","511599903",RemoteObject.concat(RemoteObject.createImmutable("Valor no reconocido: "),_value),0);
 break; }
}
;
 }else {
 BA.debugLineNum = 373;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
Debug.ShouldStop(1048576);
formlabores.__c.runVoidMethod ("LogImpl","511599906",RemoteObject.createImmutable("Error: Value no es un número válido."),0);
 };
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}