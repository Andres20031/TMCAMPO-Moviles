package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formlabores_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 195;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(4);
 BA.debugLineNum = 197;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(16);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 200;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(128);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 203;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(1024);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 206;BA.debugLine="Label13Time.Text = formattedDate";
Debug.ShouldStop(8192);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 209;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(65536);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 212;BA.debugLine="fechaInicio = formattedDate";
Debug.ShouldStop(524288);
__ref.setField ("_fechainicio" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("AS_DatePicker2_SelectedDateChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("as_datepicker2_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker2_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 217;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 219;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(67108864);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 222;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(536870912);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 225;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(1);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 228;BA.debugLine="Label14Time.Text = formattedDate";
Debug.ShouldStop(8);
__ref.getField(false,"_label14time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 231;BA.debugLine="Panel3.Visible = False";
Debug.ShouldStop(64);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 234;BA.debugLine="fechaFin = formattedDate";
Debug.ShouldStop(512);
__ref.setField ("_fechafin" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,60);
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
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,60);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 61;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 62;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
Debug.ShouldStop(536870912);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 63;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 64;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 65;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(1);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 66;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
Debug.ShouldStop(2);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form1"))));
 BA.debugLineNum = 68;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(8);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 69;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(16);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(128);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 73;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 31;
return;
case 31:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 74;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 75;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1024);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 76;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 32;
return;
case 32:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 77;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 78;BA.debugLine="Dim razonSocial As String = row(0)";
Debug.ShouldStop(8192);
_razonsocial = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("razonSocial", _razonsocial);Debug.locals.put("razonSocial", _razonsocial);
 BA.debugLineNum = 79;BA.debugLine="Dim nit As String = row(1)";
Debug.ShouldStop(16384);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("nit", _nit);Debug.locals.put("nit", _nit);
 BA.debugLineNum = 80;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 83;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","324576023",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 88;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
Debug.ShouldStop(8388608);
_cmdlabormaquina = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labor_maq")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);
 BA.debugLineNum = 89;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabormaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 35;
return;
case 35:
//C
this.state = 11;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 90;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 91;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
Debug.ShouldStop(67108864);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_labormaquina")));
 BA.debugLineNum = 92;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","req_labormaquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 36;
return;
case 36:
//C
this.state = 14;
_reslabormaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLaborMaquina", _reslabormaquina);
;
 BA.debugLineNum = 93;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 94;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
Debug.ShouldStop(536870912);
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);
 BA.debugLineNum = 95;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
Debug.ShouldStop(1073741824);
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);
 BA.debugLineNum = 96;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina &";
Debug.ShouldStop(-2147483648);
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
 BA.debugLineNum = 99;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","324576039",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 101;BA.debugLine="j3.Release";
Debug.ShouldStop(16);
_j3.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
Debug.ShouldStop(256);
_cmdelementogasto = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_elementoGasto")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdElementoGasto", _cmdelementogasto);Debug.locals.put("cmdElementoGasto", _cmdelementogasto);
 BA.debugLineNum = 106;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdelementogasto),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 39;
return;
case 39:
//C
this.state = 21;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 107;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 108;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_elementoGasto")));
 BA.debugLineNum = 109;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","req_elementogasto_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 40;
return;
case 40:
//C
this.state = 24;
_reselementogasto = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resElementoGasto", _reselementogasto);
;
 BA.debugLineNum = 110;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 111;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
Debug.ShouldStop(16384);
_codigoelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoElementoGasto", _codigoelementogasto);Debug.locals.put("codigoElementoGasto", _codigoelementogasto);
 BA.debugLineNum = 112;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
Debug.ShouldStop(32768);
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);
 BA.debugLineNum = 113;BA.debugLine="SD_xComboBoxElemento.Add(descripcionElementoGas";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 116;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","324576056",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 118;BA.debugLine="j4.Release";
Debug.ShouldStop(2097152);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Insumo\",0)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Insumo")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 124;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Siembra\",1)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Siembra")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 125;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Riego\",2)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Riego")),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("B4XPage_Created (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formlabores","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 54;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
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
public static RemoteObject  _buttonaddinsumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonAddInsumo_Click (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("buttonaddinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttonaddinsumo_click", __ref);}
 BA.debugLineNum = 545;BA.debugLine="Private Sub ButtonAddInsumo_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 546;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_nameinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_idinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_cantinsumo" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 547;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
Debug.ShouldStop(4);
formlabores.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 549;BA.debugLine="Table1.AddRow(Array As String(IDINSUMO,NAMEINSUM";
Debug.ShouldStop(16);
__ref.getField(false,"_table1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.table.class, "_addrow" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {__ref.getField(true,"_idinsumo" /*RemoteObject*/ ),__ref.getField(true,"_nameinsumo" /*RemoteObject*/ ),__ref.getField(true,"_cantinsumo" /*RemoteObject*/ )})));
 BA.debugLineNum = 550;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
Debug.ShouldStop(32);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 551;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(64);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 552;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_edittextcantidadinsumo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 554;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("ButtonDeleteInsumo_Click (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("buttondeleteinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttondeleteinsumo_click", __ref);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
 BA.debugLineNum = 561;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 562;BA.debugLine="Private lst As List";
Debug.ShouldStop(131072);
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 563;BA.debugLine="Private i, row As Int";
Debug.ShouldStop(262144);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
_row = RemoteObject.createImmutable(0);Debug.locals.put("row", _row);
 BA.debugLineNum = 564;BA.debugLine="lst = Table1.SelectedRows";
Debug.ShouldStop(524288);
_lst = __ref.getField(false,"_table1" /*RemoteObject*/ ).getField(false,"_selectedrows" /*RemoteObject*/ );Debug.locals.put("lst", _lst);
 BA.debugLineNum = 565;BA.debugLine="lst.Sort(True)";
Debug.ShouldStop(1048576);
_lst.runVoidMethod ("Sort",(Object)(formlabores.__c.getField(true,"True")));
 BA.debugLineNum = 566;BA.debugLine="For i = lst.Size - 1 To 0 Step -1";
Debug.ShouldStop(2097152);
{
final int step5 = -1;
final int limit5 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1) ;
for (;(step5 > 0 && _i.<Integer>get().intValue() <= limit5) || (step5 < 0 && _i.<Integer>get().intValue() >= limit5) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 567;BA.debugLine="row = lst.Get(i)";
Debug.ShouldStop(4194304);
_row = BA.numberCast(int.class, _lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("row", _row);
 BA.debugLineNum = 568;BA.debugLine="Table1.RemoveRow(row)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_table1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.table.class, "_removerow" /*RemoteObject*/ ,(Object)(_row));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 570;BA.debugLine="ButtonDeleteInsumo.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 571;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
Debug.ShouldStop(67108864);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 572;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(134217728);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 573;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
 //BA.debugLineNum = 37;BA.debugLine="Private Table1 As Table";
formlabores._table1 = RemoteObject.createNew ("b4a.example.ef.table");__ref.setField("_table1",formlabores._table1);
 //BA.debugLineNum = 38;BA.debugLine="Private ButtonDeleteInsumo As Button";
formlabores._buttondeleteinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttondeleteinsumo",formlabores._buttondeleteinsumo);
 //BA.debugLineNum = 39;BA.debugLine="Private Panel0geral As Panel";
formlabores._panel0geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel0geral",formlabores._panel0geral);
 //BA.debugLineNum = 41;BA.debugLine="Private IDINSUMO As String";
formlabores._idinsumo = RemoteObject.createImmutable("");__ref.setField("_idinsumo",formlabores._idinsumo);
 //BA.debugLineNum = 42;BA.debugLine="Private NAMEINSUMO As String";
formlabores._nameinsumo = RemoteObject.createImmutable("");__ref.setField("_nameinsumo",formlabores._nameinsumo);
 //BA.debugLineNum = 43;BA.debugLine="Private CANTINSUMO As String";
formlabores._cantinsumo = RemoteObject.createImmutable("");__ref.setField("_cantinsumo",formlabores._cantinsumo);
 //BA.debugLineNum = 45;BA.debugLine="Private LabelCantidadInsumos As Label";
formlabores._labelcantidadinsumos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelcantidadinsumos",formlabores._labelcantidadinsumos);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formlabores","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 239;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(32768);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 241;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(65536);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 242;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(131072);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 243;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 244;BA.debugLine="Return cmd";
Debug.ShouldStop(524288);
if (true) return _cmd;
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("CreateItem (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "formlabores","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 132;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(8);
 BA.debugLineNum = 134;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(32);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 135;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(64);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 138;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
Debug.ShouldStop(512);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("addLaboresUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 140;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(2048);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 142;BA.debugLine="Return panel";
Debug.ShouldStop(8192);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("CreateItemInsumo (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("createiteminsumo")) { return __ref.runUserSub(false, "formlabores","createiteminsumo", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 172;BA.debugLine="Private Sub CreateItemInsumo As Panel";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(8192);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 175;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(16384);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 178;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
Debug.ShouldStop(131072);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormInsumo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 180;BA.debugLine="panel.Height=Panel0geral.Height";
Debug.ShouldStop(524288);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel0geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 182;BA.debugLine="Return panel";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("CreateItemRiego (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("createitemriego")) { return __ref.runUserSub(false, "formlabores","createitemriego", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 146;BA.debugLine="Private Sub CreateItemRiego As Panel";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(524288);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 149;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(1048576);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 152;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
Debug.ShouldStop(8388608);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormRiego")),__ref.getField(false, "ba"));
 BA.debugLineNum = 154;BA.debugLine="panel.Height=Panel2geral.Height";
Debug.ShouldStop(33554432);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel2geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 156;BA.debugLine="Return panel";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("CreateItemSiembra (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("createitemsiembra")) { return __ref.runUserSub(false, "formlabores","createitemsiembra", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 159;BA.debugLine="Private Sub CreateItemSiembra As Panel";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 161;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 162;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(2);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 165;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
Debug.ShouldStop(16);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormSiembra")),__ref.getField(false, "ba"));
 BA.debugLineNum = 167;BA.debugLine="panel.Height=Panel3geral.Height";
Debug.ShouldStop(64);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel3geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 169;BA.debugLine="Return panel";
Debug.ShouldStop(256);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("EditTextBandereo_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,427);
if (RapidSub.canDelegate("edittextbandereo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextbandereo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 427;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
Debug.ShouldStop(1024);
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("EditTextCantidadAgua_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,378);
if (RapidSub.canDelegate("edittextcantidadagua_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadagua_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 378;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("EditTextCantidadInsumo_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,535);
if (RapidSub.canDelegate("edittextcantidadinsumo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadinsumo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 535;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 536;BA.debugLine="If New == \" \" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_new,BA.ObjectToString(" "))) { 
 BA.debugLineNum = 537;BA.debugLine="Log(\"EL NEW: \"&New)";
Debug.ShouldStop(16777216);
formlabores.__c.runVoidMethod ("LogImpl","355902210",RemoteObject.concat(RemoteObject.createImmutable("EL NEW: "),_new),0);
 BA.debugLineNum = 538;BA.debugLine="Log(\"EL OLD: \"&Old)";
Debug.ShouldStop(33554432);
formlabores.__c.runVoidMethod ("LogImpl","355902211",RemoteObject.concat(RemoteObject.createImmutable("EL OLD: "),_old),0);
 }else {
 BA.debugLineNum = 540;BA.debugLine="ButtonAddInsumo.Enabled = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_buttonaddinsumo" /*RemoteObject*/ ).runMethod(true,"setEnabled",formlabores.__c.getField(true,"True"));
 };
 BA.debugLineNum = 542;BA.debugLine="CANTINSUMO = New";
Debug.ShouldStop(536870912);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 543;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("EditTextCaudalAplicado_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("edittextcaudalaplicado_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcaudalaplicado_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 374;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("EditTextDistanciaSiembra_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("edittextdistanciasiembra_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextdistanciasiembra_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 423;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
Debug.ShouldStop(64);
 BA.debugLineNum = 425;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("EditTextNumeroMacollos_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,447);
if (RapidSub.canDelegate("edittextnumeromacollos_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeromacollos_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 447;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 449;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("EditTextNumeroPaquetes_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,443);
if (RapidSub.canDelegate("edittextnumeropaquetes_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeropaquetes_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 443;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("EditTextProcedencia_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("edittextprocedencia_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedencia_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 370;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
Debug.ShouldStop(131072);
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("EditTextProcedenciaDestino_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("edittextprocedenciadestino_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedenciadestino_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 435;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
Debug.ShouldStop(262144);
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("EditTextToneladaSemilla_TextChanged (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,431);
if (RapidSub.canDelegate("edittexttoneladasemilla_textchanged")) { return __ref.runUserSub(false, "formlabores","edittexttoneladasemilla_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 431;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
Debug.ShouldStop(16384);
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Initialize (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formlabores","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 49;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 50;BA.debugLine="Return Me";
Debug.ShouldStop(131072);
if (true) return __ref;
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Label13Time_Click (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "formlabores","label13time_click", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(134217728);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Label14Time_Click (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("label14time_click")) { return __ref.runUserSub(false, "formlabores","label14time_click", __ref);}
 BA.debugLineNum = 191;BA.debugLine="Private Sub Label14Time_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Panel3.Visible = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,509);
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
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,509);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 510;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(536870912);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 511;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(1073741824);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 513;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
Debug.ShouldStop(1);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_insumosSort")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 514;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 515;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 516;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(8);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 517;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 518;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 519;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
Debug.ShouldStop(64);
_cdgo_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Producto", _cdgo_producto);Debug.locals.put("Cdgo_Producto", _cdgo_producto);
 BA.debugLineNum = 520;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
Debug.ShouldStop(128);
_dscrpcion_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);
 BA.debugLineNum = 521;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto & \" -";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 524;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","356885263",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 527;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,451);
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
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,451);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 452;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(8);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 453;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(16);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 455;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
Debug.ShouldStop(64);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoRiego")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 456;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 457;BA.debugLine="If j.Success Then";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 458;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(512);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 459;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 460;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 461;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
Debug.ShouldStop(4096);
_cdgo_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);
 BA.debugLineNum = 462;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
Debug.ShouldStop(8192);
_dscrpcion_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);
 BA.debugLineNum = 463;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 466;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","326476559",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,471);
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
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,471);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 472;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(8388608);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 473;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(16777216);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 476;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
Debug.ShouldStop(134217728);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_codVariedad")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 477;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 478;BA.debugLine="If j.Success Then";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 479;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1073741824);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 480;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 481;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1);
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
 BA.debugLineNum = 482;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
Debug.ShouldStop(2);
_cdgo_variedad = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);
 BA.debugLineNum = 483;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 486;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","326542095",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 488;BA.debugLine="j.Release";
Debug.ShouldStop(128);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 492;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
Debug.ShouldStop(2048);
_cmdtipolabranza = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoLabranza")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);
 BA.debugLineNum = 493;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdtipolabranza),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 494;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 495;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
Debug.ShouldStop(16384);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_TipoLabranza")));
 BA.debugLineNum = 496;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","req_tipolabranza_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resTipoLabranza", _restipolabranza);
;
 BA.debugLineNum = 497;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 498;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
Debug.ShouldStop(131072);
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);
 BA.debugLineNum = 499;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
Debug.ShouldStop(262144);
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);
 BA.debugLineNum = 500;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 503;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","326542112",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Tipo_Labranza: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 505;BA.debugLine="j4.Release";
Debug.ShouldStop(16777216);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 507;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("RemoveForm0IfExists (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("removeform0ifexists")) { return __ref.runUserSub(false, "formlabores","removeform0ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 387;BA.debugLine="Private Sub RemoveForm0IfExists";
Debug.ShouldStop(4);
 BA.debugLineNum = 389;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(16);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 390;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form0")))) { 
 BA.debugLineNum = 391;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(64);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 392;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(128);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("RemoveForm2IfExists (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("removeform2ifexists")) { return __ref.runUserSub(false, "formlabores","removeform2ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 398;BA.debugLine="Private Sub RemoveForm2IfExists";
Debug.ShouldStop(8192);
 BA.debugLineNum = 400;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(32768);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 401;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form2")))) { 
 BA.debugLineNum = 402;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(131072);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 403;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(262144);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("RemoveForm3IfExists (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("removeform3ifexists")) { return __ref.runUserSub(false, "formlabores","removeform3ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 408;BA.debugLine="Private Sub RemoveForm3IfExists";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 410;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(33554432);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 411;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form3")))) { 
 BA.debugLineNum = 412;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 413;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("SD_xComboBoxCodigoVariedad_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("sd_xcomboboxcodigovariedad_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxcodigovariedad_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 419;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
Debug.ShouldStop(4);
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("SD_xComboBoxElemento_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("sd_xcomboboxelemento_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxelemento_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 326;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
Debug.ShouldStop(32);
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,282);
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
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,282);
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
 BA.debugLineNum = 283;BA.debugLine="haciendaCBX=Value";
Debug.ShouldStop(67108864);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 285;BA.debugLine="SD_xComboBoxLote.Clear";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 286;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(536870912);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 287;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(1073741824);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 288;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(-2147483648);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 291;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 294;BA.debugLine="If j.Success Then";
Debug.ShouldStop(32);
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
 BA.debugLineNum = 296;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(128);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 297;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 301;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 302;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(8192);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 305;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 310;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","325231388",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 314;BA.debugLine="j.Release";
Debug.ShouldStop(33554432);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="End Sub";
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
public static RemoteObject  _sd_xcomboboxinsumo_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxInsumo_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("sd_xcomboboxinsumo_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxinsumo_itemclick", __ref, _position, _value);}
RemoteObject _partes = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 529;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
Debug.ShouldStop(65536);
 BA.debugLineNum = 530;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
Debug.ShouldStop(131072);
_partes = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" - ")),(Object)(BA.ObjectToString(_value)));Debug.locals.put("partes", _partes);Debug.locals.put("partes", _partes);
 BA.debugLineNum = 531;BA.debugLine="NAMEINSUMO = partes(0)";
Debug.ShouldStop(262144);
__ref.setField ("_nameinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 532;BA.debugLine="IDINSUMO = partes(1)";
Debug.ShouldStop(524288);
__ref.setField ("_idinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 533;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 322;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(2);
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 318;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,247);
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
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,247);
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
 BA.debugLineNum = 248;BA.debugLine="nitEmpresaCBX=Value";
Debug.ShouldStop(8388608);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 250;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(33554432);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 251;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(67108864);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 252;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(134217728);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("N"))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 255;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 258;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 260;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(8);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 261;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 265;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(256);
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
 BA.debugLineNum = 266;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(512);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 267;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(1024);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 270;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 275;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","325165852",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 278;BA.debugLine="j.Release";
Debug.ShouldStop(2097152);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("SD_xComboBoxTipoLabranza_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("sd_xcomboboxtipolabranza_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtipolabranza_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 439;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 441;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("SD_xComboBoxTipoRiego_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("sd_xcomboboxtiporiego_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtiporiego_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 382;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("SD_xComboBoxTypeForm_ItemClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("sd_xcomboboxtypeform_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtypeform_itemclick", __ref, _position, _value);}
RemoteObject _tf = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 330;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
Debug.ShouldStop(512);
 BA.debugLineNum = 333;BA.debugLine="If IsNumber(Value) Then";
Debug.ShouldStop(4096);
if (formlabores.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_value))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 334;BA.debugLine="Select Case Value";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable((0)),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((2)))) {
case 0: {
 BA.debugLineNum = 336;BA.debugLine="RemoveForm2IfExists";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 337;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 338;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
Debug.ShouldStop(131072);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createiteminsumo" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form0"))));
 BA.debugLineNum = 339;BA.debugLine="LlenarComboBoxInsumo";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxinsumo" /*void*/ );
 BA.debugLineNum = 340;BA.debugLine="Table1.SetHeader(Array As String(\"ID\", \"NOMBRE";
Debug.ShouldStop(524288);
__ref.getField(false,"_table1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.table.class, "_setheader" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("ID"),BA.ObjectToString("NOMBRE"),RemoteObject.createImmutable("CANTIDAD")})));
 BA.debugLineNum = 341;BA.debugLine="Table1.SetColumnDataTypes(Array As String(\"T\",";
Debug.ShouldStop(1048576);
__ref.getField(false,"_table1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.table.class, "_setcolumndatatypes" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("T"),BA.ObjectToString("T"),RemoteObject.createImmutable("T")})));
 BA.debugLineNum = 343;BA.debugLine="Private tf() As Typeface";
Debug.ShouldStop(4194304);
_tf = RemoteObject.createNewArray ("anywheresoftware.b4a.keywords.constants.TypefaceWrapper", new int[] {0}, new Object[]{});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 344;BA.debugLine="tf = Array As Typeface(Typeface.DEFAULT_BOLD,";
Debug.ShouldStop(8388608);
_tf = RemoteObject.createNewArray("anywheresoftware.b4a.keywords.constants.TypefaceWrapper",new int[] {3},new Object[] {RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), formlabores.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), formlabores.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.constants.TypefaceWrapper"), formlabores.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD"))});Debug.locals.put("tf", _tf);
 BA.debugLineNum = 345;BA.debugLine="Table1.SetTextColors(Array As Int(Colors.White";
Debug.ShouldStop(16777216);
__ref.getField(false,"_table1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.table.class, "_settextcolors" /*RemoteObject*/ ,(Object)(RemoteObject.createNewArray("int",new int[] {3},new Object[] {formlabores.__c.getField(false,"Colors").getField(true,"White"),formlabores.__c.getField(false,"Colors").getField(true,"White"),formlabores.__c.getField(false,"Colors").getField(true,"White")})));
 BA.debugLineNum = 346;BA.debugLine="Table1.SetHeaderTypeFaces(tf)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_table1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.table.class, "_setheadertypefaces" /*RemoteObject*/ ,(Object)(_tf));
 BA.debugLineNum = 347;BA.debugLine="Table1.SelectedCellTextColor= Colors.White";
Debug.ShouldStop(67108864);
__ref.getField(false,"_table1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.table.class, "_setselectedcelltextcolor" /*RemoteObject*/ ,formlabores.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 348;BA.debugLine="cantidadInsumos = 0";
Debug.ShouldStop(134217728);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 349;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(268435456);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 350;BA.debugLine="CANTINSUMO = \"\"";
Debug.ShouldStop(536870912);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,BA.ObjectToString(""));
 break; }
case 1: {
 BA.debugLineNum = 352;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(-2147483648);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 353;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 354;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
Debug.ShouldStop(2);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemsiembra" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form3"))));
 BA.debugLineNum = 355;BA.debugLine="LlenarComboBoxSiembra";
Debug.ShouldStop(4);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxsiembra" /*void*/ );
 break; }
case 2: {
 BA.debugLineNum = 357;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 358;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(32);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 359;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
Debug.ShouldStop(64);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemriego" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form2"))));
 BA.debugLineNum = 360;BA.debugLine="LlenarComboBoxRiego";
Debug.ShouldStop(128);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxriego" /*void*/ );
 break; }
default: {
 BA.debugLineNum = 363;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
Debug.ShouldStop(1024);
formlabores.__c.runVoidMethod ("LogImpl","325493537",RemoteObject.concat(RemoteObject.createImmutable("Valor no reconocido: "),_value),0);
 break; }
}
;
 }else {
 BA.debugLineNum = 366;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
Debug.ShouldStop(8192);
formlabores.__c.runVoidMethod ("LogImpl","325493540",RemoteObject.createImmutable("Error: Value no es un número válido."),0);
 };
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _table1_cellclick(RemoteObject __ref,RemoteObject _col,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("Table1_CellClick (formlabores) ","formlabores",13,__ref.getField(false, "ba"),__ref,556);
if (RapidSub.canDelegate("table1_cellclick")) { return __ref.runUserSub(false, "formlabores","table1_cellclick", __ref, _col, _row);}
Debug.locals.put("col", _col);
Debug.locals.put("row", _row);
 BA.debugLineNum = 556;BA.debugLine="Private Sub Table1_CellClick(col As Int, row As In";
Debug.ShouldStop(2048);
 BA.debugLineNum = 557;BA.debugLine="ButtonDeleteInsumo.Visible=True";
Debug.ShouldStop(4096);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}