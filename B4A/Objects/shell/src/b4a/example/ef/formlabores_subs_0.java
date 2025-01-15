package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formlabores_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
RemoteObject _dateparts = null;
Debug.locals.put("Date", _date);
 BA.debugLineNum = 279;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 281;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(16777216);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 284;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(134217728);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 287;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
Debug.ShouldStop(1073741824);
_dateparts = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_formatteddate));Debug.locals.put("dateParts", _dateparts);Debug.locals.put("dateParts", _dateparts);
 BA.debugLineNum = 290;BA.debugLine="If dateParts.Length = 3 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_dateparts.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 292;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
Debug.ShouldStop(8);
_formatteddate = RemoteObject.concat(_dateparts.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("formattedDate", _formatteddate);
 };
 BA.debugLineNum = 296;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(128);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 299;BA.debugLine="Label13Time.Text = formattedDate";
Debug.ShouldStop(1024);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 302;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 305;BA.debugLine="fechaInicio = formattedDate";
Debug.ShouldStop(65536);
__ref.setField ("_fechainicio" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 308;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
Debug.ShouldStop(524288);
formlabores.__c.runVoidMethod ("LogImpl","15963805",RemoteObject.concat(RemoteObject.createImmutable("Fecha inicio: "),__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("AS_DatePicker2_SelectedDateChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("as_datepicker2_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker2_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
RemoteObject _dateparts = null;
Debug.locals.put("Date", _date);
 BA.debugLineNum = 312;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 314;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(33554432);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 317;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(268435456);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 320;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
Debug.ShouldStop(-2147483648);
_dateparts = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_formatteddate));Debug.locals.put("dateParts", _dateparts);Debug.locals.put("dateParts", _dateparts);
 BA.debugLineNum = 323;BA.debugLine="If dateParts.Length = 3 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_dateparts.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 325;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
Debug.ShouldStop(16);
_formatteddate = RemoteObject.concat(_dateparts.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("formattedDate", _formatteddate);
 };
 BA.debugLineNum = 329;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(256);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 332;BA.debugLine="Label14Time.Text = formattedDate";
Debug.ShouldStop(2048);
__ref.getField(false,"_label14time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 335;BA.debugLine="Panel3.Visible = False";
Debug.ShouldStop(16384);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 338;BA.debugLine="fechaFin = formattedDate";
Debug.ShouldStop(131072);
__ref.setField ("_fechafin" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 341;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
Debug.ShouldStop(1048576);
formlabores.__c.runVoidMethod ("LogImpl","16029341",RemoteObject.concat(RemoteObject.createImmutable("Fecha fin: "),__ref.getField(true,"_fechafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,103);
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
RemoteObject _cmdultimoregistro = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j5 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resultimoregistro = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowregistro = null;
RemoteObject _ultimoregistro = RemoteObject.createImmutable(0);
RemoteObject _ultimoregistrosiembra = RemoteObject.createImmutable(0);
RemoteObject group14;
int index14;
int groupLen14;
RemoteObject group27;
int index27;
int groupLen27;
RemoteObject group41;
int index41;
int groupLen41;
RemoteObject group59;
int index59;
int groupLen59;
RemoteObject group73;
int index73;
int groupLen73;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,103);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 104;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(128);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 105;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
Debug.ShouldStop(256);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 106;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(512);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 107;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(1024);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 108;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(2048);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 109;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form1"))));
 BA.debugLineNum = 111;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16384);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 112;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 115;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(262144);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 116;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 117;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 118;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 119;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 120;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(8388608);
if (true) break;

case 4:
//for
this.state = 7;
group14 = _res.getField(false,"Rows" /*RemoteObject*/ );
index14 = 0;
groupLen14 = group14.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 53;
if (true) break;

case 53:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_row = (group14.runMethod(false,"Get",index14));Debug.locals.put("row", _row);}
if (true) break;

case 54:
//C
this.state = 53;
index14++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 54;
 BA.debugLineNum = 121;BA.debugLine="Dim razonSocial As String = row(0)";
Debug.ShouldStop(16777216);
_razonsocial = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("razonSocial", _razonsocial);Debug.locals.put("razonSocial", _razonsocial);
 BA.debugLineNum = 122;BA.debugLine="Dim nit As String = row(1)";
Debug.ShouldStop(33554432);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("nit", _nit);Debug.locals.put("nit", _nit);
 BA.debugLineNum = 123;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 126;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","15505047",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 131;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
Debug.ShouldStop(4);
_cmdlabormaquina = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labor_maq")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);
 BA.debugLineNum = 132;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabormaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 133;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(16);
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
 BA.debugLineNum = 134;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_labormaquina")));
 BA.debugLineNum = 135;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","req_labormaquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLaborMaquina", _reslabormaquina);
;
 BA.debugLineNum = 136;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
Debug.ShouldStop(128);
if (true) break;

case 14:
//for
this.state = 17;
group27 = _reslabormaquina.getField(false,"Rows" /*RemoteObject*/ );
index27 = 0;
groupLen27 = group27.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
this.state = 57;
if (true) break;

case 57:
//C
this.state = 17;
if (index27 < groupLen27) {
this.state = 16;
_rowlabormaquina = (group27.runMethod(false,"Get",index27));Debug.locals.put("rowLaborMaquina", _rowlabormaquina);}
if (true) break;

case 58:
//C
this.state = 57;
index27++;
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
if (true) break;

case 16:
//C
this.state = 58;
 BA.debugLineNum = 137;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
Debug.ShouldStop(256);
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);
 BA.debugLineNum = 138;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
Debug.ShouldStop(512);
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);
 BA.debugLineNum = 139;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
Debug.ShouldStop(1024);
__ref.getField(false,"_sd_xcomboboxlabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_descripcionlabormaquina),(Object)((_codigolabormaquina)));
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
 BA.debugLineNum = 142;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","15505063",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 144;BA.debugLine="j3.Release";
Debug.ShouldStop(32768);
_j3.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 148;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
Debug.ShouldStop(524288);
_cmdelementogasto = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_elementoGasto")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdElementoGasto", _cmdelementogasto);Debug.locals.put("cmdElementoGasto", _cmdelementogasto);
 BA.debugLineNum = 149;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdelementogasto),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 150;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 151;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
Debug.ShouldStop(4194304);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_elementoGasto")));
 BA.debugLineNum = 152;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","req_elementogasto_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resElementoGasto", _reselementogasto);
;
 BA.debugLineNum = 153;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
Debug.ShouldStop(16777216);
if (true) break;

case 24:
//for
this.state = 27;
group41 = _reselementogasto.getField(false,"Rows" /*RemoteObject*/ );
index41 = 0;
groupLen41 = group41.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowElementoGasto", _rowelementogasto);
this.state = 61;
if (true) break;

case 61:
//C
this.state = 27;
if (index41 < groupLen41) {
this.state = 26;
_rowelementogasto = (group41.runMethod(false,"Get",index41));Debug.locals.put("rowElementoGasto", _rowelementogasto);}
if (true) break;

case 62:
//C
this.state = 61;
index41++;
Debug.locals.put("rowElementoGasto", _rowelementogasto);
if (true) break;

case 26:
//C
this.state = 62;
 BA.debugLineNum = 154;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
Debug.ShouldStop(33554432);
_codigoelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoElementoGasto", _codigoelementogasto);Debug.locals.put("codigoElementoGasto", _codigoelementogasto);
 BA.debugLineNum = 155;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
Debug.ShouldStop(67108864);
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);
 BA.debugLineNum = 156;BA.debugLine="SD_xComboBoxElemento.Add(descripcionElementoGas";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sd_xcomboboxelemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_descripcionelementogasto),(Object)((_codigoelementogasto)));
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
 BA.debugLineNum = 159;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","15505080",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 161;BA.debugLine="j4.Release";
Debug.ShouldStop(1);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 166;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Insumo\",0)";
Debug.ShouldStop(32);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Insumo")),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 167;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Siembra\",1)";
Debug.ShouldStop(64);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Siembra")),(Object)(RemoteObject.createImmutable((1))));
 BA.debugLineNum = 168;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Riego\",2)";
Debug.ShouldStop(128);
__ref.getField(false,"_sd_xcomboboxtypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Riego")),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 170;BA.debugLine="data.Initialize";
Debug.ShouldStop(512);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 173;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
Debug.ShouldStop(4096);
_cmdultimoregistro = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maxIdLabor")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);
 BA.debugLineNum = 174;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdultimoregistro),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 176;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 31:
//if
this.state = 40;
if (_j5.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 33;
}else {
this.state = 39;
}if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 177;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
Debug.ShouldStop(65536);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_ultimoRegistro")));
 BA.debugLineNum = 178;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","req_ultimoregistro_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resUltimoRegistro", _resultimoregistro);
;
 BA.debugLineNum = 180;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
Debug.ShouldStop(524288);
if (true) break;

case 34:
//for
this.state = 37;
group59 = _resultimoregistro.getField(false,"Rows" /*RemoteObject*/ );
index59 = 0;
groupLen59 = group59.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowRegistro", _rowregistro);
this.state = 65;
if (true) break;

case 65:
//C
this.state = 37;
if (index59 < groupLen59) {
this.state = 36;
_rowregistro = (group59.runMethod(false,"Get",index59));Debug.locals.put("rowRegistro", _rowregistro);}
if (true) break;

case 66:
//C
this.state = 65;
index59++;
Debug.locals.put("rowRegistro", _rowregistro);
if (true) break;

case 36:
//C
this.state = 66;
 BA.debugLineNum = 181;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
Debug.ShouldStop(1048576);
_ultimoregistro = BA.numberCast(int.class, _rowregistro.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("ultimoRegistro", _ultimoregistro);Debug.locals.put("ultimoRegistro", _ultimoregistro);
 BA.debugLineNum = 182;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","15505103",RemoteObject.concat(RemoteObject.createImmutable("Último Registro obtenido: "),_ultimoregistro),0);
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
Debug.locals.put("rowRegistro", _rowregistro);
;
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 186;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","15505107",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta select_maxIdLabor: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 189;BA.debugLine="consecutivo = ultimoRegistro + 1";
Debug.ShouldStop(268435456);
__ref.setField ("_consecutivo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ultimoregistro,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 191;BA.debugLine="Log(consecutivo)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","15505112",BA.NumberToString(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),0);
 BA.debugLineNum = 193;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
Debug.ShouldStop(1);
_cmdultimoregistro = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maxIdSiembra")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);
 BA.debugLineNum = 194;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdultimoregistro),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 196;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 197;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
Debug.ShouldStop(16);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_ultimoRegistro")));
 BA.debugLineNum = 198;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","req_ultimoregistro_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resUltimoRegistro", _resultimoregistro);
;
 BA.debugLineNum = 200;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
Debug.ShouldStop(128);
if (true) break;

case 44:
//for
this.state = 47;
group73 = _resultimoregistro.getField(false,"Rows" /*RemoteObject*/ );
index73 = 0;
groupLen73 = group73.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowRegistro", _rowregistro);
this.state = 69;
if (true) break;

case 69:
//C
this.state = 47;
if (index73 < groupLen73) {
this.state = 46;
_rowregistro = (group73.runMethod(false,"Get",index73));Debug.locals.put("rowRegistro", _rowregistro);}
if (true) break;

case 70:
//C
this.state = 69;
index73++;
Debug.locals.put("rowRegistro", _rowregistro);
if (true) break;

case 46:
//C
this.state = 70;
 BA.debugLineNum = 201;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
Debug.ShouldStop(256);
_ultimoregistrosiembra = BA.numberCast(int.class, _rowregistro.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);
 BA.debugLineNum = 202;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","15505123",RemoteObject.concat(RemoteObject.createImmutable("Último Registro Siembra  obtenido: "),_ultimoregistrosiembra),0);
 if (true) break;
if (true) break;

case 47:
//C
this.state = 50;
Debug.locals.put("rowRegistro", _rowregistro);
;
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 206;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","15505127",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta select_maxIdLabor: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 50:
//C
this.state = -1;
;
 BA.debugLineNum = 209;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
Debug.ShouldStop(65536);
__ref.setField ("_consecutivosiembra" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ultimoregistrosiembra,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 211;BA.debugLine="Log(consecutivoSiembra)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","15505132",BA.NumberToString(__ref.getField(true,"_consecutivosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
public static void  _req_ultimoregistro_result(RemoteObject __ref,RemoteObject _resultimoregistro) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formlabores","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 90;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("B4XTable1_CellClicked (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,738);
if (RapidSub.canDelegate("b4xtable1_cellclicked")) { return __ref.runUserSub(false, "formlabores","b4xtable1_cellclicked", __ref, _columnid, _rowid);}
RemoteObject _rowdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _nombreinsu = RemoteObject.createImmutable("");
RemoteObject _cantidadinsu = RemoteObject.createImmutable(0);
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 738;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
Debug.ShouldStop(2);
 BA.debugLineNum = 739;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
Debug.ShouldStop(4);
formlabores.__c.runVoidMethod ("LogImpl","18126465",RemoteObject.concat(RemoteObject.createImmutable("COLUM ID"),_columnid),0);
 BA.debugLineNum = 740;BA.debugLine="Log(\"ROW ID\"&RowId)";
Debug.ShouldStop(8);
formlabores.__c.runVoidMethod ("LogImpl","18126466",RemoteObject.concat(RemoteObject.createImmutable("ROW ID"),_rowid),0);
 BA.debugLineNum = 741;BA.debugLine="PanelTittleInsumo.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_paneltittleinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 742;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
Debug.ShouldStop(32);
_rowdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rowdata = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 743;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
Debug.ShouldStop(64);
_id = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 744;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
Debug.ShouldStop(128);
_nombreinsu = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOMBRE")))));Debug.locals.put("nombreInsu", _nombreinsu);Debug.locals.put("nombreInsu", _nombreinsu);
 BA.debugLineNum = 745;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
Debug.ShouldStop(256);
_cantidadinsu = BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CANTIDAD")))));Debug.locals.put("cantidadInsu", _cantidadinsu);Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 746;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
Debug.ShouldStop(512);
__ref.getField(false,"_labelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("- "),_nombreinsu,RemoteObject.createImmutable(" / "),RemoteObject.createImmutable("Cantidad: "),_cantidadinsu)));
 BA.debugLineNum = 747;BA.debugLine="PanelInsumoSelect.Visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_panelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 748;BA.debugLine="ButtonDeleteInsumo.Visible = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 750;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
Debug.ShouldStop(8192);
__ref.setField ("_ideliminartabla" /*RemoteObject*/ ,BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("#"))))));
 BA.debugLineNum = 751;BA.debugLine="Log(idEliminarTabla)";
Debug.ShouldStop(16384);
formlabores.__c.runVoidMethod ("LogImpl","18126477",BA.NumberToString(__ref.getField(true,"_ideliminartabla" /*RemoteObject*/ )),0);
 BA.debugLineNum = 752;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("ButtonAddInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,711);
if (RapidSub.canDelegate("buttonaddinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttonaddinsumo_click", __ref);}
RemoteObject _numberinsumo = RemoteObject.createImmutable(0);
 BA.debugLineNum = 711;BA.debugLine="Private Sub ButtonAddInsumo_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 712;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_nameinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_idinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_cantinsumo" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 713;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
Debug.ShouldStop(256);
formlabores.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 715;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
Debug.ShouldStop(1024);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 716;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
Debug.ShouldStop(2048);
_numberinsumo = __ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ );Debug.locals.put("numberInsumo", _numberinsumo);Debug.locals.put("numberInsumo", _numberinsumo);
 BA.debugLineNum = 717;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
Debug.ShouldStop(4096);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_numberinsumo),(__ref.getField(true,"_idinsumo" /*RemoteObject*/ )),(__ref.getField(true,"_nameinsumo" /*RemoteObject*/ )),(__ref.getField(true,"_cantinsumo" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 718;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(8192);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )));
 BA.debugLineNum = 719;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(16384);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 720;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
Debug.ShouldStop(32768);
__ref.getField(false,"_edittextcantidadinsumo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 722;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("ButtonDeleteInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,725);
if (RapidSub.canDelegate("buttondeleteinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttondeleteinsumo_click", __ref);}
 BA.debugLineNum = 725;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 727;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
Debug.ShouldStop(4194304);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeinsumofromdata" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_ideliminartabla" /*RemoteObject*/ )));
 BA.debugLineNum = 729;BA.debugLine="ButtonDeleteInsumo.Visible = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 730;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
Debug.ShouldStop(33554432);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 731;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(67108864);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 732;BA.debugLine="PanelTittleInsumo.Visible = False";
Debug.ShouldStop(134217728);
__ref.getField(false,"_paneltittleinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 733;BA.debugLine="PanelInsumoSelect.Visible = False";
Debug.ShouldStop(268435456);
__ref.getField(false,"_panelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 734;BA.debugLine="ButtonDeleteInsumo.Visible = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 735;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttoninsumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,776);
if (RapidSub.canDelegate("buttoninsumo_click")) { __ref.runUserSub(false, "formlabores","buttoninsumo_click", __ref); return;}
ResumableSub_ButtonInsumo_Click rsub = new ResumableSub_ButtonInsumo_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonInsumo_Click extends BA.ResumableSub {
public ResumableSub_ButtonInsumo_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
int _i = 0;
RemoteObject _rowid = RemoteObject.createImmutable(0L);
RemoteObject _rowdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _nombreinsu = RemoteObject.createImmutable("");
RemoteObject _cantidadinsu = RemoteObject.createImmutable(0);
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _fecha = RemoteObject.createImmutable(0L);
int step1;
int limit1;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,776);
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
 BA.debugLineNum = 780;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//for
this.state = 28;
step1 = 1;
limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 41;
if (true) break;

case 41:
//C
this.state = 28;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 42:
//C
this.state = 41;
_i = ((int)(0 + _i + step1)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 782;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
Debug.ShouldStop(8192);
_rowid = BA.numberCast(long.class, __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("RowId", _rowid);Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 785;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
Debug.ShouldStop(65536);
_rowdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rowdata = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 788;BA.debugLine="Dim ID As String";
Debug.ShouldStop(524288);
_id = RemoteObject.createImmutable("");Debug.locals.put("ID", _id);
 BA.debugLineNum = 789;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(".",_rowdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("ID"))))) && RemoteObject.solveBoolean("N",_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 790;BA.debugLine="ID = rowData.Get(\"ID\")";
Debug.ShouldStop(2097152);
_id = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))));Debug.locals.put("ID", _id);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 792;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
Debug.ShouldStop(8388608);
_id = BA.ObjectToString("No ID");Debug.locals.put("ID", _id);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 796;BA.debugLine="Dim nombreInsu As String";
Debug.ShouldStop(134217728);
_nombreinsu = RemoteObject.createImmutable("");Debug.locals.put("nombreInsu", _nombreinsu);
 BA.debugLineNum = 797;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
Debug.ShouldStop(268435456);
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean(".",_rowdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("NOMBRE"))))) && RemoteObject.solveBoolean("N",_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOMBRE")))))) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 BA.debugLineNum = 798;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
Debug.ShouldStop(536870912);
_nombreinsu = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOMBRE")))));Debug.locals.put("nombreInsu", _nombreinsu);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 800;BA.debugLine="nombreInsu = \"Desconocido\"";
Debug.ShouldStop(-2147483648);
_nombreinsu = BA.ObjectToString("Desconocido");Debug.locals.put("nombreInsu", _nombreinsu);
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 804;BA.debugLine="Dim cantidadInsu As Int";
Debug.ShouldStop(8);
_cantidadinsu = RemoteObject.createImmutable(0);Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 805;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
Debug.ShouldStop(16);
if (true) break;

case 16:
//if
this.state = 27;
if (RemoteObject.solveBoolean(".",_rowdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("CANTIDAD"))))) && RemoteObject.solveBoolean("N",_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CANTIDAD")))))) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 806;BA.debugLine="Try";
Debug.ShouldStop(32);
if (true) break;

case 19:
//try
this.state = 24;
this.catchState = 23;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 24;
this.catchState = 23;
 BA.debugLineNum = 807;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
Debug.ShouldStop(64);
_cantidadinsu = BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CANTIDAD")))));Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 809;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","18323105",RemoteObject.concat(RemoteObject.createImmutable("Fila "),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(":")),0);
 BA.debugLineNum = 810;BA.debugLine="Log(\" - ID: \" & ID)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","18323106",RemoteObject.concat(RemoteObject.createImmutable(" - ID: "),_id),0);
 BA.debugLineNum = 811;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","18323107",RemoteObject.concat(RemoteObject.createImmutable(" - NOMBRE: "),_nombreinsu),0);
 BA.debugLineNum = 812;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","18323108",RemoteObject.concat(RemoteObject.createImmutable(" - CANTIDAD: "),_cantidadinsu),0);
 BA.debugLineNum = 815;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16384);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 816;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 819;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
Debug.ShouldStop(262144);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_laborInsumo")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),(_id),(_cantidadinsu)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 822;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
Debug.ShouldStop(2097152);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 823;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttoninsumo_click"), (_j));
this.state = 43;
return;
case 43:
//C
this.state = 24;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 825;BA.debugLine="consecutivo  = consecutivo + 1";
Debug.ShouldStop(16777216);
__ref.setField ("_consecutivo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_consecutivo" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 Debug.CheckDeviceExceptions();
if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 BA.debugLineNum = 828;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
Debug.ShouldStop(134217728);
_cantidadinsu = BA.numberCast(int.class, 0);Debug.locals.put("cantidadInsu", _cantidadinsu);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 831;BA.debugLine="cantidadInsu = 0";
Debug.ShouldStop(1073741824);
_cantidadinsu = BA.numberCast(int.class, 0);Debug.locals.put("cantidadInsu", _cantidadinsu);
 if (true) break;

case 27:
//C
this.state = 42;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 836;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(8);
parent._horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));__ref.setField("_horasistema",parent._horasistema);
 BA.debugLineNum = 837;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(16);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 838;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(32);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formlabores.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 839;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
Debug.ShouldStop(64);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 840;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
Debug.ShouldStop(128);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 841;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
Debug.ShouldStop(256);
__ref.setField ("_fechaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 843;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
Debug.ShouldStop(1024);
__ref.setField ("_fechafmrto" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 845;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(4096);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 846;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(8192);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 849;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(65536);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_labor")),(Object)(RemoteObject.createNewArray("Object",new int[] {18},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),(__ref.getField(true,"_fechafmrto" /*RemoteObject*/ )),RemoteObject.createImmutable(("CA")),(__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_fechafin" /*RemoteObject*/ )),(__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),(__ref.getField(true,"_arealabor" /*RemoteObject*/ )),(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_arealote" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),(__ref.getField(true,"_horasistema" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 852;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(524288);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 853;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttoninsumo_click"), (_j));
this.state = 44;
return;
case 44:
//C
this.state = 29;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 856;BA.debugLine="Try";
Debug.ShouldStop(8388608);
if (true) break;

case 29:
//try
this.state = 40;
this.catchState = 39;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 39;
 BA.debugLineNum = 857;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 32:
//if
this.state = 37;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
 BA.debugLineNum = 859;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 36:
//C
this.state = 37;
 BA.debugLineNum = 862;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","18323158",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 37:
//C
this.state = 40;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 0;
 BA.debugLineNum = 866;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","18323162",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 871;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
public static void  _buttonriego_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonRiego_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,875);
if (RapidSub.canDelegate("buttonriego_click")) { __ref.runUserSub(false, "formlabores","buttonriego_click", __ref); return;}
ResumableSub_ButtonRiego_Click rsub = new ResumableSub_ButtonRiego_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonRiego_Click extends BA.ResumableSub {
public ResumableSub_ButtonRiego_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _fecha = RemoteObject.createImmutable(0L);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonRiego_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,875);
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
 BA.debugLineNum = 879;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16384);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 880;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 883;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(262144);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_laborRiego")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),(__ref.getField(true,"_tiporiego" /*RemoteObject*/ )),(__ref.getField(true,"_procedenciariego" /*RemoteObject*/ )),(__ref.getField(true,"_caudalriego" /*RemoteObject*/ )),(__ref.getField(true,"_cantidadriego" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 886;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(2097152);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 887;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonriego_click"), (_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 890;BA.debugLine="Try";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 891;BA.debugLine="If j.Success Then";
Debug.ShouldStop(67108864);
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
 BA.debugLineNum = 892;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 894;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","18388627",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 897;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","18388630",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 BA.debugLineNum = 901;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(16);
parent._horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));__ref.setField("_horasistema",parent._horasistema);
 BA.debugLineNum = 902;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(32);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 903;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(64);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formlabores.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 904;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
Debug.ShouldStop(128);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 905;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
Debug.ShouldStop(256);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 906;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
Debug.ShouldStop(512);
__ref.setField ("_fechaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 908;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
Debug.ShouldStop(2048);
__ref.setField ("_fechafmrto" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 910;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(8192);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 911;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(16384);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 914;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(131072);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_labor")),(Object)(RemoteObject.createNewArray("Object",new int[] {18},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),(__ref.getField(true,"_fechafmrto" /*RemoteObject*/ )),RemoteObject.createImmutable(("CA")),(__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_fechafin" /*RemoteObject*/ )),(__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),(__ref.getField(true,"_arealabor" /*RemoteObject*/ )),(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_arealote" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),(__ref.getField(true,"_horasistema" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 917;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(1048576);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 918;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonriego_click"), (_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 921;BA.debugLine="Try";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 922;BA.debugLine="If j.Success Then";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 924;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 927;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","18388660",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 931;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","18388664",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 934;BA.debugLine="End Sub";
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
public static void  _buttonsimbra_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonSimbra_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,936);
if (RapidSub.canDelegate("buttonsimbra_click")) { __ref.runUserSub(false, "formlabores","buttonsimbra_click", __ref); return;}
ResumableSub_ButtonSimbra_Click rsub = new ResumableSub_ButtonSimbra_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonSimbra_Click extends BA.ResumableSub {
public ResumableSub_ButtonSimbra_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmdultimoregistro = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j5 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resultimoregistro = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowregistro = null;
RemoteObject _ultimoregistrosiembra = RemoteObject.createImmutable(0);
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _fecha = RemoteObject.createImmutable(0L);
RemoteObject group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonSimbra_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,936);
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
 BA.debugLineNum = 938;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(512);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 939;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(1024);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 941;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
Debug.ShouldStop(4096);
_cmdultimoregistro = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maxIdSiembra")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);
 BA.debugLineNum = 942;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdultimoregistro),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 944;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 10;
if (_j5.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 945;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
Debug.ShouldStop(65536);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_ultimoRegistro")));
 BA.debugLineNum = 946;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","req_ultimoregistro_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resUltimoRegistro", _resultimoregistro);
;
 BA.debugLineNum = 948;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
Debug.ShouldStop(524288);
if (true) break;

case 4:
//for
this.state = 7;
group8 = _resultimoregistro.getField(false,"Rows" /*RemoteObject*/ );
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowRegistro", _rowregistro);
this.state = 37;
if (true) break;

case 37:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_rowregistro = (group8.runMethod(false,"Get",index8));Debug.locals.put("rowRegistro", _rowregistro);}
if (true) break;

case 38:
//C
this.state = 37;
index8++;
Debug.locals.put("rowRegistro", _rowregistro);
if (true) break;

case 6:
//C
this.state = 38;
 BA.debugLineNum = 949;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
Debug.ShouldStop(1048576);
_ultimoregistrosiembra = BA.numberCast(int.class, _rowregistro.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);
 BA.debugLineNum = 950;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","18454158",RemoteObject.concat(RemoteObject.createImmutable("Último Registro Siembra  obtenido: "),_ultimoregistrosiembra),0);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
Debug.locals.put("rowRegistro", _rowregistro);
;
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 954;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","18454162",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta select_maxIdLabor: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 957;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
Debug.ShouldStop(268435456);
__ref.setField ("_consecutivosiembra" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ultimoregistrosiembra,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 959;BA.debugLine="Log(consecutivoSiembra)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","18454167",BA.NumberToString(__ref.getField(true,"_consecutivosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 964;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(8);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_laborSiembra")),(Object)(RemoteObject.createNewArray("Object",new int[] {9},new Object[] {(__ref.getField(true,"_consecutivosiembra" /*RemoteObject*/ )),(__ref.getField(true,"_codigosiembra" /*RemoteObject*/ )),(__ref.getField(true,"_distanciasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_toneladasemillasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_numeropaquetessiembra" /*RemoteObject*/ )),(__ref.getField(true,"_procedenciasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_bandereosiembra" /*RemoteObject*/ )),(__ref.getField(true,"_numeromacollosiembra" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 967;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(64);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 968;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 971;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 11:
//try
this.state = 22;
this.catchState = 21;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 21;
 BA.debugLineNum = 972;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 14:
//if
this.state = 19;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 976;BA.debugLine="Log(\"Error al agregar datos: \" & LastException)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","18454184",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 977;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","18454185",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 978;BA.debugLine="Log(\"Valores enviados: consecutivo=\" & consecut";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","18454186",RemoteObject.concat(RemoteObject.createImmutable("Valores enviados: consecutivo="),__ref.getField(true,"_consecutivo" /*RemoteObject*/ ),RemoteObject.createImmutable(", codigoSiembra="),__ref.getField(true,"_codigosiembra" /*RemoteObject*/ ),RemoteObject.createImmutable(", distanciaSiembra="),__ref.getField(true,"_distanciasiembra" /*RemoteObject*/ ),RemoteObject.createImmutable(", toneladaSemillaSiembra="),__ref.getField(true,"_toneladasemillasiembra" /*RemoteObject*/ ),RemoteObject.createImmutable(", numeroPaquetesSiembra="),__ref.getField(true,"_numeropaquetessiembra" /*RemoteObject*/ ),RemoteObject.createImmutable(", procedenciaSiembra="),__ref.getField(true,"_procedenciasiembra" /*RemoteObject*/ ),RemoteObject.createImmutable(", tipoLabranzaSiembra="),__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ ),RemoteObject.createImmutable(", bandereoSiembra="),__ref.getField(true,"_bandereosiembra" /*RemoteObject*/ ),RemoteObject.createImmutable(", numeroMacolloSiembra="),__ref.getField(true,"_numeromacollosiembra" /*RemoteObject*/ )),0);
 if (true) break;

case 19:
//C
this.state = 22;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
 BA.debugLineNum = 986;BA.debugLine="Log(\"Excepción capturada: \" & LastException)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","18454194",RemoteObject.concat(RemoteObject.createImmutable("Excepción capturada: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
 BA.debugLineNum = 991;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(1073741824);
parent._horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));__ref.setField("_horasistema",parent._horasistema);
 BA.debugLineNum = 992;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(-2147483648);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 993;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(1);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formlabores.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 994;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
Debug.ShouldStop(2);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 995;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
Debug.ShouldStop(4);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 996;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
Debug.ShouldStop(8);
__ref.setField ("_fechaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 998;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
Debug.ShouldStop(32);
__ref.setField ("_fechafmrto" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 1000;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(128);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 1001;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(256);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 1004;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(2048);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_labor")),(Object)(RemoteObject.createNewArray("Object",new int[] {18},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),(__ref.getField(true,"_fechafmrto" /*RemoteObject*/ )),RemoteObject.createImmutable(("CA")),(__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_fechafin" /*RemoteObject*/ )),(__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),(__ref.getField(true,"_arealabor" /*RemoteObject*/ )),(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_arealote" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),(__ref.getField(true,"_horasistema" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1007;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(16384);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 1008;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1011;BA.debugLine="Try";
Debug.ShouldStop(262144);
if (true) break;

case 23:
//try
this.state = 34;
this.catchState = 33;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 33;
 BA.debugLineNum = 1012;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 26:
//if
this.state = 31;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
 BA.debugLineNum = 1014;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1017;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","18454225",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 31:
//C
this.state = 34;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
 BA.debugLineNum = 1021;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","18454229",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1025;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
 //BA.debugLineNum = 14;BA.debugLine="Dim fechafmrto As String";
formlabores._fechafmrto = RemoteObject.createImmutable("");__ref.setField("_fechafmrto",formlabores._fechafmrto);
 //BA.debugLineNum = 15;BA.debugLine="Dim horaSistema As String";
formlabores._horasistema = RemoteObject.createImmutable("");__ref.setField("_horasistema",formlabores._horasistema);
 //BA.debugLineNum = 17;BA.debugLine="Private loteCBX As String";
formlabores._lotecbx = RemoteObject.createImmutable("");__ref.setField("_lotecbx",formlabores._lotecbx);
 //BA.debugLineNum = 18;BA.debugLine="Private elementoLabor As String";
formlabores._elementolabor = RemoteObject.createImmutable("");__ref.setField("_elementolabor",formlabores._elementolabor);
 //BA.debugLineNum = 19;BA.debugLine="Private elementoGasto As String";
formlabores._elementogasto = RemoteObject.createImmutable("");__ref.setField("_elementogasto",formlabores._elementogasto);
 //BA.debugLineNum = 20;BA.debugLine="Private areaLabor As Int";
formlabores._arealabor = RemoteObject.createImmutable(0);__ref.setField("_arealabor",formlabores._arealabor);
 //BA.debugLineNum = 21;BA.debugLine="Private areaLote As Int";
formlabores._arealote = RemoteObject.createImmutable(0);__ref.setField("_arealote",formlabores._arealote);
 //BA.debugLineNum = 22;BA.debugLine="Dim consecutivo As Int";
formlabores._consecutivo = RemoteObject.createImmutable(0);__ref.setField("_consecutivo",formlabores._consecutivo);
 //BA.debugLineNum = 23;BA.debugLine="Private tipoLabor As String";
formlabores._tipolabor = RemoteObject.createImmutable("");__ref.setField("_tipolabor",formlabores._tipolabor);
 //BA.debugLineNum = 24;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
formlabores._sd_xcomboboxnit = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxnit",formlabores._sd_xcomboboxnit);
 //BA.debugLineNum = 25;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
formlabores._sd_xcomboboxhacienda = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxhacienda",formlabores._sd_xcomboboxhacienda);
 //BA.debugLineNum = 26;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
formlabores._sd_xcomboboxlote = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlote",formlabores._sd_xcomboboxlote);
 //BA.debugLineNum = 27;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
formlabores._sd_xcomboboxlabor = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlabor",formlabores._sd_xcomboboxlabor);
 //BA.debugLineNum = 28;BA.debugLine="Private SD_xComboBoxElemento As SD_xComboBox";
formlabores._sd_xcomboboxelemento = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxelemento",formlabores._sd_xcomboboxelemento);
 //BA.debugLineNum = 29;BA.debugLine="Private SD_xComboBoxTypeForm As SD_xComboBox";
formlabores._sd_xcomboboxtypeform = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtypeform",formlabores._sd_xcomboboxtypeform);
 //BA.debugLineNum = 30;BA.debugLine="Dim haciendaCBX As String";
formlabores._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formlabores._haciendacbx);
 //BA.debugLineNum = 31;BA.debugLine="Dim nitEmpresaCBX As String";
formlabores._nitempresacbx = RemoteObject.createImmutable("");__ref.setField("_nitempresacbx",formlabores._nitempresacbx);
 //BA.debugLineNum = 33;BA.debugLine="Private Panel2geral As Panel";
formlabores._panel2geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2geral",formlabores._panel2geral);
 //BA.debugLineNum = 34;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
formlabores._sd_xcomboboxtiporiego = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtiporiego",formlabores._sd_xcomboboxtiporiego);
 //BA.debugLineNum = 36;BA.debugLine="Private Panel3geral As Panel";
formlabores._panel3geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3geral",formlabores._panel3geral);
 //BA.debugLineNum = 37;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
formlabores._sd_xcomboboxcodigovariedad = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxcodigovariedad",formlabores._sd_xcomboboxcodigovariedad);
 //BA.debugLineNum = 38;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
formlabores._sd_xcomboboxtipolabranza = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtipolabranza",formlabores._sd_xcomboboxtipolabranza);
 //BA.debugLineNum = 40;BA.debugLine="Private cantidadInsumos As Int";
formlabores._cantidadinsumos = RemoteObject.createImmutable(0);__ref.setField("_cantidadinsumos",formlabores._cantidadinsumos);
 //BA.debugLineNum = 42;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
formlabores._sd_xcomboboxinsumo = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxinsumo",formlabores._sd_xcomboboxinsumo);
 //BA.debugLineNum = 43;BA.debugLine="Private EditTextCantidadInsumo As EditText";
formlabores._edittextcantidadinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittextcantidadinsumo",formlabores._edittextcantidadinsumo);
 //BA.debugLineNum = 44;BA.debugLine="Private ButtonAddInsumo As Button";
formlabores._buttonaddinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonaddinsumo",formlabores._buttonaddinsumo);
 //BA.debugLineNum = 45;BA.debugLine="Private ButtonDeleteInsumo As Button";
formlabores._buttondeleteinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttondeleteinsumo",formlabores._buttondeleteinsumo);
 //BA.debugLineNum = 46;BA.debugLine="Private Panel0geral As Panel";
formlabores._panel0geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel0geral",formlabores._panel0geral);
 //BA.debugLineNum = 48;BA.debugLine="Private IDINSUMO As String";
formlabores._idinsumo = RemoteObject.createImmutable("");__ref.setField("_idinsumo",formlabores._idinsumo);
 //BA.debugLineNum = 49;BA.debugLine="Private NAMEINSUMO As String";
formlabores._nameinsumo = RemoteObject.createImmutable("");__ref.setField("_nameinsumo",formlabores._nameinsumo);
 //BA.debugLineNum = 50;BA.debugLine="Private CANTINSUMO As String";
formlabores._cantinsumo = RemoteObject.createImmutable("");__ref.setField("_cantinsumo",formlabores._cantinsumo);
 //BA.debugLineNum = 52;BA.debugLine="Private LabelCantidadInsumos As Label";
formlabores._labelcantidadinsumos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelcantidadinsumos",formlabores._labelcantidadinsumos);
 //BA.debugLineNum = 53;BA.debugLine="Private B4XTable1 As B4XTable";
formlabores._b4xtable1 = RemoteObject.createNew ("b4a.example.ef.b4xtable");__ref.setField("_b4xtable1",formlabores._b4xtable1);
 //BA.debugLineNum = 54;BA.debugLine="Private data As List";
formlabores._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_data",formlabores._data);
 //BA.debugLineNum = 56;BA.debugLine="Private PanelInsumoSelect As Panel";
formlabores._panelinsumoselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panelinsumoselect",formlabores._panelinsumoselect);
 //BA.debugLineNum = 57;BA.debugLine="Private PanelTittleInsumo As Panel";
formlabores._paneltittleinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_paneltittleinsumo",formlabores._paneltittleinsumo);
 //BA.debugLineNum = 58;BA.debugLine="Private LabelInsumoSelect As Label";
formlabores._labelinsumoselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelinsumoselect",formlabores._labelinsumoselect);
 //BA.debugLineNum = 60;BA.debugLine="Dim idEliminarTabla As Int";
formlabores._ideliminartabla = RemoteObject.createImmutable(0);__ref.setField("_ideliminartabla",formlabores._ideliminartabla);
 //BA.debugLineNum = 62;BA.debugLine="Dim tipoRiego As String";
formlabores._tiporiego = RemoteObject.createImmutable("");__ref.setField("_tiporiego",formlabores._tiporiego);
 //BA.debugLineNum = 63;BA.debugLine="Dim procedenciaRiego As String";
formlabores._procedenciariego = RemoteObject.createImmutable("");__ref.setField("_procedenciariego",formlabores._procedenciariego);
 //BA.debugLineNum = 64;BA.debugLine="Dim caudalRiego As String";
formlabores._caudalriego = RemoteObject.createImmutable("");__ref.setField("_caudalriego",formlabores._caudalriego);
 //BA.debugLineNum = 65;BA.debugLine="Dim cantidadRiego As String";
formlabores._cantidadriego = RemoteObject.createImmutable("");__ref.setField("_cantidadriego",formlabores._cantidadriego);
 //BA.debugLineNum = 67;BA.debugLine="Dim codigoSiembra As String";
formlabores._codigosiembra = RemoteObject.createImmutable("");__ref.setField("_codigosiembra",formlabores._codigosiembra);
 //BA.debugLineNum = 68;BA.debugLine="Dim distanciaSiembra As Int";
formlabores._distanciasiembra = RemoteObject.createImmutable(0);__ref.setField("_distanciasiembra",formlabores._distanciasiembra);
 //BA.debugLineNum = 69;BA.debugLine="Dim bandereoSiembra As Int";
formlabores._bandereosiembra = RemoteObject.createImmutable(0);__ref.setField("_bandereosiembra",formlabores._bandereosiembra);
 //BA.debugLineNum = 70;BA.debugLine="Dim toneladaSemillaSiembra As Int";
formlabores._toneladasemillasiembra = RemoteObject.createImmutable(0);__ref.setField("_toneladasemillasiembra",formlabores._toneladasemillasiembra);
 //BA.debugLineNum = 71;BA.debugLine="Dim procedenciaSiembra As String";
formlabores._procedenciasiembra = RemoteObject.createImmutable("");__ref.setField("_procedenciasiembra",formlabores._procedenciasiembra);
 //BA.debugLineNum = 72;BA.debugLine="Dim tipoLabranzaSiembra As String";
formlabores._tipolabranzasiembra = RemoteObject.createImmutable("");__ref.setField("_tipolabranzasiembra",formlabores._tipolabranzasiembra);
 //BA.debugLineNum = 73;BA.debugLine="Dim numeroPaquetesSiembra As Int";
formlabores._numeropaquetessiembra = RemoteObject.createImmutable(0);__ref.setField("_numeropaquetessiembra",formlabores._numeropaquetessiembra);
 //BA.debugLineNum = 74;BA.debugLine="Dim numeroMacolloSiembra As Int";
formlabores._numeromacollosiembra = RemoteObject.createImmutable(0);__ref.setField("_numeromacollosiembra",formlabores._numeromacollosiembra);
 //BA.debugLineNum = 76;BA.debugLine="Dim DeviceName As String";
formlabores._devicename = RemoteObject.createImmutable("");__ref.setField("_devicename",formlabores._devicename);
 //BA.debugLineNum = 77;BA.debugLine="Dim user As String";
formlabores._user = RemoteObject.createImmutable("");__ref.setField("_user",formlabores._user);
 //BA.debugLineNum = 79;BA.debugLine="Dim fechaActual As String";
formlabores._fechaactual = RemoteObject.createImmutable("");__ref.setField("_fechaactual",formlabores._fechaactual);
 //BA.debugLineNum = 80;BA.debugLine="Dim consecutivoSiembra As Int";
formlabores._consecutivosiembra = RemoteObject.createImmutable(0);__ref.setField("_consecutivosiembra",formlabores._consecutivosiembra);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formlabores","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 346;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(67108864);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 348;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(134217728);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 349;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(268435456);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 350;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 351;BA.debugLine="Return cmd";
Debug.ShouldStop(1073741824);
if (true) return _cmd;
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("CreateItem (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "formlabores","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 216;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 218;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(33554432);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 219;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(67108864);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 222;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
Debug.ShouldStop(536870912);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("addLaboresUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 224;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(-2147483648);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 226;BA.debugLine="Return panel";
Debug.ShouldStop(2);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("CreateItemInsumo (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("createiteminsumo")) { return __ref.runUserSub(false, "formlabores","createiteminsumo", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 256;BA.debugLine="Private Sub CreateItemInsumo As Panel";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 258;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 259;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(4);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 262;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
Debug.ShouldStop(32);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormInsumo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 264;BA.debugLine="panel.Height=Panel0geral.Height";
Debug.ShouldStop(128);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel0geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 266;BA.debugLine="Return panel";
Debug.ShouldStop(512);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("CreateItemRiego (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("createitemriego")) { return __ref.runUserSub(false, "formlabores","createitemriego", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 230;BA.debugLine="Private Sub CreateItemRiego As Panel";
Debug.ShouldStop(32);
 BA.debugLineNum = 232;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(128);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 233;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(256);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 236;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
Debug.ShouldStop(2048);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormRiego")),__ref.getField(false, "ba"));
 BA.debugLineNum = 238;BA.debugLine="panel.Height=Panel2geral.Height";
Debug.ShouldStop(8192);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel2geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 240;BA.debugLine="Return panel";
Debug.ShouldStop(32768);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("CreateItemSiembra (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("createitemsiembra")) { return __ref.runUserSub(false, "formlabores","createitemsiembra", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 243;BA.debugLine="Private Sub CreateItemSiembra As Panel";
Debug.ShouldStop(262144);
 BA.debugLineNum = 245;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(1048576);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 246;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(2097152);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 249;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
Debug.ShouldStop(16777216);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormSiembra")),__ref.getField(false, "ba"));
 BA.debugLineNum = 251;BA.debugLine="panel.Height=Panel3geral.Height";
Debug.ShouldStop(67108864);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel3geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 253;BA.debugLine="Return panel";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
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
public static RemoteObject  _edittextarealabor_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAreaLabor_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("edittextarealabor_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextarealabor_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 454;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
Debug.ShouldStop(32);
 BA.debugLineNum = 456;BA.debugLine="areaLabor = New";
Debug.ShouldStop(128);
__ref.setField ("_arealabor" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 458;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
Debug.ShouldStop(512);
formlabores.__c.runVoidMethod ("LogImpl","16488068",RemoteObject.concat(RemoteObject.createImmutable("Area Labor "),__ref.getField(true,"_arealabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextarealote_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextAreaLote_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,462);
if (RapidSub.canDelegate("edittextarealote_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextarealote_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 462;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
Debug.ShouldStop(8192);
 BA.debugLineNum = 464;BA.debugLine="areaLote = New";
Debug.ShouldStop(32768);
__ref.setField ("_arealote" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 466;BA.debugLine="Log(\"Area lote \" & areaLote )";
Debug.ShouldStop(131072);
formlabores.__c.runVoidMethod ("LogImpl","16553604",RemoteObject.concat(RemoteObject.createImmutable("Area lote "),__ref.getField(true,"_arealote" /*RemoteObject*/ )),0);
 BA.debugLineNum = 467;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittextbandereo_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextBandereo_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,582);
if (RapidSub.canDelegate("edittextbandereo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextbandereo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 582;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
Debug.ShouldStop(32);
 BA.debugLineNum = 584;BA.debugLine="bandereoSiembra = New";
Debug.ShouldStop(128);
__ref.setField ("_bandereosiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 586;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
Debug.ShouldStop(512);
formlabores.__c.runVoidMethod ("LogImpl","17274500",RemoteObject.concat(RemoteObject.createImmutable("bandereo "),__ref.getField(true,"_bandereosiembra" /*RemoteObject*/ )),0);
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
public static RemoteObject  _edittextcantidadagua_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextCantidadAgua_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,523);
if (RapidSub.canDelegate("edittextcantidadagua_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadagua_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 523;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
Debug.ShouldStop(1024);
 BA.debugLineNum = 524;BA.debugLine="cantidadRiego = New";
Debug.ShouldStop(2048);
__ref.setField ("_cantidadriego" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 526;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
Debug.ShouldStop(8192);
formlabores.__c.runVoidMethod ("LogImpl","16815747",RemoteObject.concat(RemoteObject.createImmutable("cantidad"),__ref.getField(true,"_cantidadriego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 528;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("EditTextCantidadInsumo_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,706);
if (RapidSub.canDelegate("edittextcantidadinsumo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadinsumo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 706;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
Debug.ShouldStop(2);
 BA.debugLineNum = 707;BA.debugLine="ButtonAddInsumo.Enabled = True";
Debug.ShouldStop(4);
__ref.getField(false,"_buttonaddinsumo" /*RemoteObject*/ ).runMethod(true,"setEnabled",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 708;BA.debugLine="CANTINSUMO = New";
Debug.ShouldStop(8);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 709;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("EditTextCaudalAplicado_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,517);
if (RapidSub.canDelegate("edittextcaudalaplicado_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcaudalaplicado_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 517;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
Debug.ShouldStop(16);
 BA.debugLineNum = 518;BA.debugLine="caudalRiego = New";
Debug.ShouldStop(32);
__ref.setField ("_caudalriego" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 520;BA.debugLine="Log(\"caudal\" & caudalRiego)";
Debug.ShouldStop(128);
formlabores.__c.runVoidMethod ("LogImpl","16750211",RemoteObject.concat(RemoteObject.createImmutable("caudal"),__ref.getField(true,"_caudalriego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 521;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("EditTextDistanciaSiembra_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,576);
if (RapidSub.canDelegate("edittextdistanciasiembra_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextdistanciasiembra_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 576;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 577;BA.debugLine="distanciaSiembra = New";
Debug.ShouldStop(1);
__ref.setField ("_distanciasiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 579;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
Debug.ShouldStop(4);
formlabores.__c.runVoidMethod ("LogImpl","17208963",RemoteObject.concat(RemoteObject.createImmutable("Distancia de siembra "),__ref.getField(true,"_distanciasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("EditTextNumeroMacollos_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,616);
if (RapidSub.canDelegate("edittextnumeromacollos_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeromacollos_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 616;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
Debug.ShouldStop(128);
 BA.debugLineNum = 617;BA.debugLine="numeroMacolloSiembra = New";
Debug.ShouldStop(256);
__ref.setField ("_numeromacollosiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 619;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
Debug.ShouldStop(1024);
formlabores.__c.runVoidMethod ("LogImpl","17602179",RemoteObject.concat(RemoteObject.createImmutable("numero de macollos "),__ref.getField(true,"_numeromacollosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("EditTextNumeroPaquetes_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,609);
if (RapidSub.canDelegate("edittextnumeropaquetes_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeropaquetes_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 609;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
Debug.ShouldStop(1);
 BA.debugLineNum = 611;BA.debugLine="numeroPaquetesSiembra = New";
Debug.ShouldStop(4);
__ref.setField ("_numeropaquetessiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 613;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
Debug.ShouldStop(16);
formlabores.__c.runVoidMethod ("LogImpl","17536644",RemoteObject.concat(RemoteObject.createImmutable("numero de paquetes "),__ref.getField(true,"_numeropaquetessiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 614;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("EditTextProcedencia_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,510);
if (RapidSub.canDelegate("edittextprocedencia_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedencia_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 510;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 512;BA.debugLine="procedenciaRiego = New";
Debug.ShouldStop(-2147483648);
__ref.setField ("_procedenciariego" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 514;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
Debug.ShouldStop(2);
formlabores.__c.runVoidMethod ("LogImpl","16684676",RemoteObject.concat(RemoteObject.createImmutable("procedencia"),__ref.getField(true,"_procedenciariego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 515;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("EditTextProcedenciaDestino_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,596);
if (RapidSub.canDelegate("edittextprocedenciadestino_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedenciadestino_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 596;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
Debug.ShouldStop(524288);
 BA.debugLineNum = 597;BA.debugLine="procedenciaSiembra = New";
Debug.ShouldStop(1048576);
__ref.setField ("_procedenciasiembra" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 599;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
Debug.ShouldStop(4194304);
formlabores.__c.runVoidMethod ("LogImpl","17405571",RemoteObject.concat(RemoteObject.createImmutable("procedencia "),__ref.getField(true,"_procedenciasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 600;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("EditTextToneladaSemilla_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,589);
if (RapidSub.canDelegate("edittexttoneladasemilla_textchanged")) { return __ref.runUserSub(false, "formlabores","edittexttoneladasemilla_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 589;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
Debug.ShouldStop(4096);
 BA.debugLineNum = 591;BA.debugLine="toneladaSemillaSiembra = New";
Debug.ShouldStop(16384);
__ref.setField ("_toneladasemillasiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 593;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
Debug.ShouldStop(65536);
formlabores.__c.runVoidMethod ("LogImpl","17340036",RemoteObject.concat(RemoteObject.createImmutable("tonelada Semilla "),__ref.getField(true,"_toneladasemillasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 594;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdevicename(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDeviceName (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("getdevicename")) { return __ref.runUserSub(false, "formlabores","getdevicename", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _manufacturer = RemoteObject.createImmutable("");
RemoteObject _model = RemoteObject.createImmutable("");
 BA.debugLineNum = 96;BA.debugLine="Sub GetDeviceName As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(1);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 98;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
Debug.ShouldStop(2);
_manufacturer = _p.runMethod(true,"getManufacturer");Debug.locals.put("Manufacturer", _manufacturer);Debug.locals.put("Manufacturer", _manufacturer);
 BA.debugLineNum = 99;BA.debugLine="Dim Model As String = p.Model";
Debug.ShouldStop(4);
_model = _p.runMethod(true,"getModel");Debug.locals.put("Model", _model);Debug.locals.put("Model", _model);
 BA.debugLineNum = 100;BA.debugLine="Return Manufacturer & \" \" & Model";
Debug.ShouldStop(8);
if (true) return RemoteObject.concat(_manufacturer,RemoteObject.createImmutable(" "),_model);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Initialize (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formlabores","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 84;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="Return Me";
Debug.ShouldStop(1048576);
if (true) return __ref;
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Label13Time_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "formlabores","label13time_click", __ref);}
 BA.debugLineNum = 271;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(32768);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Label14Time_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("label14time_click")) { return __ref.runUserSub(false, "formlabores","label14time_click", __ref);}
 BA.debugLineNum = 275;BA.debugLine="Private Sub Label14Time_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 276;BA.debugLine="Panel3.Visible = True";
Debug.ShouldStop(524288);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Label1Back_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,771);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "formlabores","label1back_click", __ref);}
 BA.debugLineNum = 771;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 772;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(8);
formlabores._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 773;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,680);
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
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,680);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 681;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(256);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 682;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(512);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 684;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
Debug.ShouldStop(2048);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_insumosSort")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 685;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 686;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 687;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(16384);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 688;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 689;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 690;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
Debug.ShouldStop(131072);
_cdgo_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Producto", _cdgo_producto);Debug.locals.put("Cdgo_Producto", _cdgo_producto);
 BA.debugLineNum = 691;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
Debug.ShouldStop(262144);
_dscrpcion_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);
 BA.debugLineNum = 692;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
Debug.ShouldStop(524288);
__ref.getField(false,"_sd_xcomboboxinsumo" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_dscrpcion_producto),(Object)((RemoteObject.concat(_dscrpcion_producto,RemoteObject.createImmutable(" - "),_cdgo_producto))));
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
 BA.debugLineNum = 695;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","17798799",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 698;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,622);
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
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,622);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 623;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16384);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 624;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 626;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
Debug.ShouldStop(131072);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoRiego")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 627;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 628;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 629;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1048576);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 630;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 631;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4194304);
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
 BA.debugLineNum = 632;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
Debug.ShouldStop(8388608);
_cdgo_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);
 BA.debugLineNum = 633;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
Debug.ShouldStop(16777216);
_dscrpcion_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);
 BA.debugLineNum = 634;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sd_xcomboboxtiporiego" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_dscrpcion_tipo_riego),(Object)((_cdgo_tipo_riego)));
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
 BA.debugLineNum = 637;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","17667727",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 640;BA.debugLine="End Sub";
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
public static void  _llenarcomboboxsiembra(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,642);
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
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,642);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 643;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(4);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 644;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(8);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 647;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
Debug.ShouldStop(64);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_codVariedad")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 648;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 649;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 650;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(512);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 651;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 652;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(2048);
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
 BA.debugLineNum = 653;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
Debug.ShouldStop(4096);
_cdgo_variedad = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);
 BA.debugLineNum = 654;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 657;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","17733263",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 659;BA.debugLine="j.Release";
Debug.ShouldStop(262144);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 663;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
Debug.ShouldStop(4194304);
_cmdtipolabranza = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoLabranza")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);
 BA.debugLineNum = 664;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdtipolabranza),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 665;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 666;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
Debug.ShouldStop(33554432);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_TipoLabranza")));
 BA.debugLineNum = 667;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","req_tipolabranza_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resTipoLabranza", _restipolabranza);
;
 BA.debugLineNum = 668;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 669;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
Debug.ShouldStop(268435456);
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);
 BA.debugLineNum = 670;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
Debug.ShouldStop(536870912);
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);
 BA.debugLineNum = 671;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sd_xcomboboxtipolabranza" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_dscrpcion_tipo_labranza),(Object)((_cdgo_tipo_labranza)));
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
 BA.debugLineNum = 674;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","17733280",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Tipo_Labranza: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 676;BA.debugLine="j4.Release";
Debug.ShouldStop(8);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 678;BA.debugLine="End Sub";
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
public static void  _req_tipolabranza_result(RemoteObject __ref,RemoteObject _restipolabranza) throws Exception{
}
public static RemoteObject  _removeform0ifexists(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RemoveForm0IfExists (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,538);
if (RapidSub.canDelegate("removeform0ifexists")) { return __ref.runUserSub(false, "formlabores","removeform0ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 538;BA.debugLine="Private Sub RemoveForm0IfExists";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 540;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(134217728);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 541;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form0")))) { 
 BA.debugLineNum = 542;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 543;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(1073741824);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 546;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("RemoveForm2IfExists (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("removeform2ifexists")) { return __ref.runUserSub(false, "formlabores","removeform2ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 549;BA.debugLine="Private Sub RemoveForm2IfExists";
Debug.ShouldStop(16);
 BA.debugLineNum = 551;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(64);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 552;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form2")))) { 
 BA.debugLineNum = 553;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(256);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 554;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(512);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 557;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("RemoveForm3IfExists (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,559);
if (RapidSub.canDelegate("removeform3ifexists")) { return __ref.runUserSub(false, "formlabores","removeform3ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 559;BA.debugLine="Private Sub RemoveForm3IfExists";
Debug.ShouldStop(16384);
 BA.debugLineNum = 561;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(65536);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 562;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form3")))) { 
 BA.debugLineNum = 563;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(262144);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 564;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(524288);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 567;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("RemoveInsumoFromData (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,755);
if (RapidSub.canDelegate("removeinsumofromdata")) { return __ref.runUserSub(false, "formlabores","removeinsumofromdata", __ref, _insumoid);}
int _i = 0;
RemoteObject _arrayelement = null;
Debug.locals.put("insumoID", _insumoid);
 BA.debugLineNum = 755;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 757;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
Debug.ShouldStop(1048576);
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 759;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
Debug.ShouldStop(4194304);
_arrayelement = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("arrayElement", _arrayelement);Debug.locals.put("arrayElement", _arrayelement);
 BA.debugLineNum = 762;BA.debugLine="If arrayElement(0) = insumoID Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_arrayelement.getArrayElement(false,BA.numberCast(int.class, 0)),(_insumoid))) { 
 BA.debugLineNum = 764;BA.debugLine="data.RemoveAt(i)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 765;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 769;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("SD_xComboBoxCodigoVariedad_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,570);
if (RapidSub.canDelegate("sd_xcomboboxcodigovariedad_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxcodigovariedad_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 570;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 571;BA.debugLine="codigoSiembra = Value";
Debug.ShouldStop(67108864);
__ref.setField ("_codigosiembra" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 573;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
Debug.ShouldStop(268435456);
formlabores.__c.runVoidMethod ("LogImpl","17143427",RemoteObject.concat(RemoteObject.createImmutable("codigo "),__ref.getField(true,"_codigosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("SD_xComboBoxElemento_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("sd_xcomboboxelemento_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxelemento_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 442;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 445;BA.debugLine="elementoGasto = Value";
Debug.ShouldStop(268435456);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 448;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, 3)";
Debug.ShouldStop(-2147483648);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,__ref.getField(true,"_elementogasto" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3))));
 BA.debugLineNum = 451;BA.debugLine="Log(\"Las dos primeras letras del Elemento Gasto s";
Debug.ShouldStop(4);
formlabores.__c.runVoidMethod ("LogImpl","16422537",RemoteObject.concat(RemoteObject.createImmutable("Las dos primeras letras del Elemento Gasto son: "),__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),0);
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
public static void  _sd_xcomboboxhacienda_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,391);
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
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,391);
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
 BA.debugLineNum = 392;BA.debugLine="haciendaCBX=Value";
Debug.ShouldStop(128);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 394;BA.debugLine="SD_xComboBoxLote.Clear";
Debug.ShouldStop(512);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 395;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1024);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 396;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 397;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(4096);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 400;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 403;BA.debugLine="If j.Success Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 405;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1048576);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 406;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 410;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(33554432);
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
 BA.debugLineNum = 411;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(67108864);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 414;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_codg_hacienda),(Object)((_codg_hacienda)));
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
 BA.debugLineNum = 419;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","16225948",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 423;BA.debugLine="j.Release";
Debug.ShouldStop(64);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 426;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","16225955",RemoteObject.concat(RemoteObject.createImmutable("Hacienda"),__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("SD_xComboBoxInsumo_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,700);
if (RapidSub.canDelegate("sd_xcomboboxinsumo_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxinsumo_itemclick", __ref, _position, _value);}
RemoteObject _partes = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 700;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 701;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
Debug.ShouldStop(268435456);
_partes = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" - ")),(Object)(BA.ObjectToString(_value)));Debug.locals.put("partes", _partes);Debug.locals.put("partes", _partes);
 BA.debugLineNum = 702;BA.debugLine="NAMEINSUMO = partes(0)";
Debug.ShouldStop(536870912);
__ref.setField ("_nameinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 703;BA.debugLine="IDINSUMO = partes(1)";
Debug.ShouldStop(1073741824);
__ref.setField ("_idinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 704;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 435;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(262144);
 BA.debugLineNum = 437;BA.debugLine="elementoLabor = Value";
Debug.ShouldStop(1048576);
__ref.setField ("_elementolabor" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 439;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
Debug.ShouldStop(4194304);
formlabores.__c.runVoidMethod ("LogImpl","16356996",RemoteObject.concat(RemoteObject.createImmutable("Elemento labor"),__ref.getField(true,"_elementolabor" /*RemoteObject*/ )),0);
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
public static RemoteObject  _sd_xcomboboxlote_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 429;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 431;BA.debugLine="loteCBX = Value";
Debug.ShouldStop(16384);
__ref.setField ("_lotecbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 432;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
Debug.ShouldStop(32768);
formlabores.__c.runVoidMethod ("LogImpl","16291459",RemoteObject.concat(RemoteObject.createImmutable("Lotecbx"),__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),0);
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
public static void  _sd_xcomboboxnit_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,354);
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
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,354);
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
 BA.debugLineNum = 355;BA.debugLine="nitEmpresaCBX=Value";
Debug.ShouldStop(4);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 356;BA.debugLine="SD_xComboBoxHacienda.Clear";
Debug.ShouldStop(8);
__ref.getField(false,"_sd_xcomboboxhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 357;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 358;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 359;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(64);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 362;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 365;BA.debugLine="If j.Success Then";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 367;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(16384);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 368;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 372;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(524288);
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
 BA.debugLineNum = 373;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(1048576);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 374;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(2097152);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 377;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sd_xcomboboxhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_nombrehacienda),(Object)((_codg_hacienda)));
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
 BA.debugLineNum = 382;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","16160412",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 385;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 388;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","16160418",RemoteObject.concat(RemoteObject.createImmutable("Nit seleccionado"),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 389;BA.debugLine="End Sub";
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
public static RemoteObject  _sd_xcomboboxtipolabranza_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxTipoLabranza_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,602);
if (RapidSub.canDelegate("sd_xcomboboxtipolabranza_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtipolabranza_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 602;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 604;BA.debugLine="tipoLabranzaSiembra = Value";
Debug.ShouldStop(134217728);
__ref.setField ("_tipolabranzasiembra" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 606;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
Debug.ShouldStop(536870912);
formlabores.__c.runVoidMethod ("LogImpl","17471108",RemoteObject.concat(RemoteObject.createImmutable("tipo labranza "),__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 607;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("SD_xComboBoxTipoRiego_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,530);
if (RapidSub.canDelegate("sd_xcomboboxtiporiego_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtiporiego_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 530;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
Debug.ShouldStop(131072);
 BA.debugLineNum = 531;BA.debugLine="tipoRiego = Value";
Debug.ShouldStop(262144);
__ref.setField ("_tiporiego" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 533;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
Debug.ShouldStop(1048576);
formlabores.__c.runVoidMethod ("LogImpl","16881283",RemoteObject.concat(RemoteObject.createImmutable("tipo riego"),__ref.getField(true,"_tiporiego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("SD_xComboBoxTypeForm_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,469);
if (RapidSub.canDelegate("sd_xcomboboxtypeform_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtypeform_itemclick", __ref, _position, _value);}
RemoteObject _insumocolum = RemoteObject.declareNull("b4a.example.ef.b4xtable._b4xtablecolumn");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 469;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 471;BA.debugLine="tipoLabor = Value";
Debug.ShouldStop(4194304);
__ref.setField ("_tipolabor" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 473;BA.debugLine="If IsNumber(Value) Then";
Debug.ShouldStop(16777216);
if (formlabores.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_value))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 474;BA.debugLine="Select Case Value";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable((0)),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((2)))) {
case 0: {
 BA.debugLineNum = 476;BA.debugLine="RemoveForm2IfExists";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 477;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 478;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
Debug.ShouldStop(536870912);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createiteminsumo" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form0"))));
 BA.debugLineNum = 479;BA.debugLine="LlenarComboBoxInsumo";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxinsumo" /*void*/ );
 BA.debugLineNum = 480;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
Debug.ShouldStop(-2147483648);
_insumocolum = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("#")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_numbers" /*RemoteObject*/ )));Debug.locals.put("INSUMOCOLUM", _insumocolum);Debug.locals.put("INSUMOCOLUM", _insumocolum);
 BA.debugLineNum = 481;BA.debugLine="INSUMOCOLUM.Width = 50dip";
Debug.ShouldStop(1);
_insumocolum.setField ("Width" /*RemoteObject*/ ,formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 482;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
Debug.ShouldStop(2);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ID")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 483;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
Debug.ShouldStop(4);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NOMBRE")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 484;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
Debug.ShouldStop(8);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("CANTIDAD")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 486;BA.debugLine="cantidadInsumos = 0";
Debug.ShouldStop(32);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 487;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(64);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 488;BA.debugLine="CANTINSUMO = \"\"";
Debug.ShouldStop(128);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,BA.ObjectToString(""));
 break; }
case 1: {
 BA.debugLineNum = 490;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(512);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 491;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 492;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
Debug.ShouldStop(2048);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemsiembra" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form3"))));
 BA.debugLineNum = 493;BA.debugLine="LlenarComboBoxSiembra";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxsiembra" /*void*/ );
 break; }
case 2: {
 BA.debugLineNum = 495;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 496;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(32768);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 497;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
Debug.ShouldStop(65536);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemriego" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form2"))));
 BA.debugLineNum = 498;BA.debugLine="LlenarComboBoxRiego";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxriego" /*void*/ );
 break; }
default: {
 BA.debugLineNum = 501;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
Debug.ShouldStop(1048576);
formlabores.__c.runVoidMethod ("LogImpl","16619168",RemoteObject.concat(RemoteObject.createImmutable("Valor no reconocido: "),_value),0);
 break; }
}
;
 }else {
 BA.debugLineNum = 504;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
Debug.ShouldStop(8388608);
formlabores.__c.runVoidMethod ("LogImpl","16619171",RemoteObject.createImmutable("Error: Value no es un número válido."),0);
 };
 BA.debugLineNum = 507;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
Debug.ShouldStop(67108864);
formlabores.__c.runVoidMethod ("LogImpl","16619174",RemoteObject.concat(RemoteObject.createImmutable("Tipo labor "),__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 508;BA.debugLine="End Sub";
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