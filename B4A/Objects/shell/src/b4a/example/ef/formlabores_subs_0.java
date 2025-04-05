package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formlabores_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
RemoteObject _dateparts = null;
Debug.locals.put("Date", _date);
 BA.debugLineNum = 354;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(2);
 BA.debugLineNum = 356;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(8);
formlabores.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 357;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(16);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 360;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(128);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 363;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
Debug.ShouldStop(1024);
_dateparts = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_formatteddate));Debug.locals.put("dateParts", _dateparts);Debug.locals.put("dateParts", _dateparts);
 BA.debugLineNum = 366;BA.debugLine="If dateParts.Length = 3 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_dateparts.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 368;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
Debug.ShouldStop(32768);
_formatteddate = RemoteObject.concat(_dateparts.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("formattedDate", _formatteddate);
 };
 BA.debugLineNum = 372;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(524288);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 375;BA.debugLine="Label13Time.Text = formattedDate";
Debug.ShouldStop(4194304);
__ref.getField(false,"_label13time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 378;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 381;BA.debugLine="fechaInicio = formattedDate";
Debug.ShouldStop(268435456);
__ref.setField ("_fechainicio" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 384;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
Debug.ShouldStop(-2147483648);
formlabores.__c.runVoidMethod ("LogImpl","34259870",RemoteObject.concat(RemoteObject.createImmutable("Fecha inicio: "),__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("AS_DatePicker2_SelectedDateChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("as_datepicker2_selecteddatechanged")) { return __ref.runUserSub(false, "formlabores","as_datepicker2_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
RemoteObject _dateparts = null;
Debug.locals.put("Date", _date);
 BA.debugLineNum = 387;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
Debug.ShouldStop(4);
 BA.debugLineNum = 389;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(16);
formlabores.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 390;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(32);
_formatteddate = formlabores.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 393;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(256);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 396;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
Debug.ShouldStop(2048);
_dateparts = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_formatteddate));Debug.locals.put("dateParts", _dateparts);Debug.locals.put("dateParts", _dateparts);
 BA.debugLineNum = 399;BA.debugLine="If dateParts.Length = 3 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_dateparts.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 401;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
Debug.ShouldStop(65536);
_formatteddate = RemoteObject.concat(_dateparts.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("formattedDate", _formatteddate);
 };
 BA.debugLineNum = 405;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(1048576);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 408;BA.debugLine="Label14Time.Text = formattedDate";
Debug.ShouldStop(8388608);
__ref.getField(false,"_label14time" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 411;BA.debugLine="Panel3.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 414;BA.debugLine="fechaFin = formattedDate";
Debug.ShouldStop(536870912);
__ref.setField ("_fechafin" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 417;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
Debug.ShouldStop(1);
formlabores.__c.runVoidMethod ("LogImpl","34325406",RemoteObject.concat(RemoteObject.createImmutable("Fecha fin: "),__ref.getField(true,"_fechafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,125);
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
RemoteObject _itemsnit = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _razonsocial = RemoteObject.createImmutable("");
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _itemslabor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdlabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j3 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reslabormaquina = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowlabormaquina = null;
RemoteObject _codigolabormaquina = RemoteObject.createImmutable("");
RemoteObject _descripcionlabormaquina = RemoteObject.createImmutable("");
RemoteObject _itemselemento = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdelementogasto = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j4 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reselementogasto = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowelementogasto = null;
RemoteObject _codigoelementogasto = RemoteObject.createImmutable("");
RemoteObject _descripcionelementogasto = RemoteObject.createImmutable("");
RemoteObject _itemstypeform = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cmdultimoregistro = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j5 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resultimoregistro = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowregistro = null;
RemoteObject _ultimoregistro = RemoteObject.createImmutable(0);
RemoteObject _ultimoregistrosiembra = RemoteObject.createImmutable(0);
RemoteObject group18;
int index18;
int groupLen18;
RemoteObject group39;
int index39;
int groupLen39;
RemoteObject group58;
int index58;
int groupLen58;
RemoteObject group81;
int index81;
int groupLen81;
RemoteObject group95;
int index95;
int groupLen95;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,125);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 126;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 127;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(parent.__c.getField(false,"Colors").getField(true,"White")),(Object)(BA.numberCast(int.class, ((int)0xb4008000))));
 BA.debugLineNum = 128;BA.debugLine="Root.LoadLayout(\"form\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("form")),__ref.getField(false, "ba"));
 BA.debugLineNum = 129;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(1);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 130;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(2);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",parent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 131;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
Debug.ShouldStop(4);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form1"))));
 BA.debugLineNum = 133;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 134;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 141;BA.debugLine="SearchTemplateNit.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 143;BA.debugLine="Dim ItemsNit As List";
Debug.ShouldStop(16384);
_itemsnit = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsNit", _itemsnit);
 BA.debugLineNum = 144;BA.debugLine="ItemsNit.Initialize";
Debug.ShouldStop(32768);
_itemsnit.runVoidMethod ("Initialize");
 BA.debugLineNum = 145;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
Debug.ShouldStop(65536);
_itemsnit.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 148;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(524288);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 149;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 150;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2097152);
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
 BA.debugLineNum = 151;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(4194304);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 152;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 153;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//for
this.state = 7;
group18 = _res.getField(false,"Rows" /*RemoteObject*/ );
index18 = 0;
groupLen18 = group18.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 53;
if (true) break;

case 53:
//C
this.state = 7;
if (index18 < groupLen18) {
this.state = 6;
_row = (group18.runMethod(false,"Get",index18));Debug.locals.put("row", _row);}
if (true) break;

case 54:
//C
this.state = 53;
index18++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 54;
 BA.debugLineNum = 154;BA.debugLine="Dim razonSocial As String = row(0)";
Debug.ShouldStop(33554432);
_razonsocial = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("razonSocial", _razonsocial);Debug.locals.put("razonSocial", _razonsocial);
 BA.debugLineNum = 155;BA.debugLine="Dim nit As String = row(1)";
Debug.ShouldStop(67108864);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("nit", _nit);Debug.locals.put("nit", _nit);
 BA.debugLineNum = 156;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
Debug.ShouldStop(134217728);
_itemsnit.runVoidMethod ("Add",(Object)((RemoteObject.concat(_nit,RemoteObject.createImmutable(":"),_razonsocial))));
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
 BA.debugLineNum = 159;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","33801122",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 161;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
Debug.ShouldStop(1);
__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsnit));
 BA.debugLineNum = 162;BA.debugLine="j.Release";
Debug.ShouldStop(2);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 165;BA.debugLine="SearchTemplateHacienda.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 167;BA.debugLine="SearchTemplateLote.Initialize";
Debug.ShouldStop(64);
__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 172;BA.debugLine="SearchTemplateLabor.Initialize";
Debug.ShouldStop(2048);
__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 174;BA.debugLine="Dim ItemsLabor As List";
Debug.ShouldStop(8192);
_itemslabor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsLabor", _itemslabor);
 BA.debugLineNum = 175;BA.debugLine="ItemsLabor.Initialize";
Debug.ShouldStop(16384);
_itemslabor.runVoidMethod ("Initialize");
 BA.debugLineNum = 176;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
Debug.ShouldStop(32768);
_itemslabor.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 179;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
Debug.ShouldStop(262144);
_cmdlabormaquina = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labor_maq")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);Debug.locals.put("cmdLaborMaquina", _cmdlabormaquina);
 BA.debugLineNum = 180;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabormaquina),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 181;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(1048576);
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
 BA.debugLineNum = 182;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_labormaquina")));
 BA.debugLineNum = 183;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","req_labormaquina_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLaborMaquina", _reslabormaquina);
;
 BA.debugLineNum = 184;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
Debug.ShouldStop(8388608);
if (true) break;

case 14:
//for
this.state = 17;
group39 = _reslabormaquina.getField(false,"Rows" /*RemoteObject*/ );
index39 = 0;
groupLen39 = group39.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
this.state = 57;
if (true) break;

case 57:
//C
this.state = 17;
if (index39 < groupLen39) {
this.state = 16;
_rowlabormaquina = (group39.runMethod(false,"Get",index39));Debug.locals.put("rowLaborMaquina", _rowlabormaquina);}
if (true) break;

case 58:
//C
this.state = 57;
index39++;
Debug.locals.put("rowLaborMaquina", _rowlabormaquina);
if (true) break;

case 16:
//C
this.state = 58;
 BA.debugLineNum = 185;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
Debug.ShouldStop(16777216);
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);Debug.locals.put("codigoLaborMaquina", _codigolabormaquina);
 BA.debugLineNum = 186;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
Debug.ShouldStop(33554432);
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);Debug.locals.put("descripcionLaborMaquina", _descripcionlabormaquina);
 BA.debugLineNum = 187;BA.debugLine="ItemsLabor.Add(codigoLaborMaquina&\":\"&descripci";
Debug.ShouldStop(67108864);
_itemslabor.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codigolabormaquina,RemoteObject.createImmutable(":"),_descripcionlabormaquina))));
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
 BA.debugLineNum = 190;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","33801153",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 192;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemslabor));
 BA.debugLineNum = 193;BA.debugLine="j3.Release";
Debug.ShouldStop(1);
_j3.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 197;BA.debugLine="SearchTemplateElemento.Initialize";
Debug.ShouldStop(16);
__ref.getField(false,"_searchtemplateelemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 199;BA.debugLine="Dim ItemsElemento As List";
Debug.ShouldStop(64);
_itemselemento = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsElemento", _itemselemento);
 BA.debugLineNum = 200;BA.debugLine="ItemsElemento.Initialize";
Debug.ShouldStop(128);
_itemselemento.runVoidMethod ("Initialize");
 BA.debugLineNum = 201;BA.debugLine="ItemsElemento.Add(\"Seleccionar:\")";
Debug.ShouldStop(256);
_itemselemento.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 205;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
Debug.ShouldStop(4096);
_cmdelementogasto = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_elementoGasto")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdElementoGasto", _cmdelementogasto);Debug.locals.put("cmdElementoGasto", _cmdelementogasto);
 BA.debugLineNum = 206;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdelementogasto),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 207;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(16384);
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
 BA.debugLineNum = 208;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_elementoGasto")));
 BA.debugLineNum = 209;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","req_elementogasto_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resElementoGasto", _reselementogasto);
;
 BA.debugLineNum = 210;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
Debug.ShouldStop(131072);
if (true) break;

case 24:
//for
this.state = 27;
group58 = _reselementogasto.getField(false,"Rows" /*RemoteObject*/ );
index58 = 0;
groupLen58 = group58.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowElementoGasto", _rowelementogasto);
this.state = 61;
if (true) break;

case 61:
//C
this.state = 27;
if (index58 < groupLen58) {
this.state = 26;
_rowelementogasto = (group58.runMethod(false,"Get",index58));Debug.locals.put("rowElementoGasto", _rowelementogasto);}
if (true) break;

case 62:
//C
this.state = 61;
index58++;
Debug.locals.put("rowElementoGasto", _rowelementogasto);
if (true) break;

case 26:
//C
this.state = 62;
 BA.debugLineNum = 211;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
Debug.ShouldStop(262144);
_codigoelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoElementoGasto", _codigoelementogasto);Debug.locals.put("codigoElementoGasto", _codigoelementogasto);
 BA.debugLineNum = 212;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
Debug.ShouldStop(524288);
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);Debug.locals.put("descripcionElementoGasto", _descripcionelementogasto);
 BA.debugLineNum = 214;BA.debugLine="ItemsElemento.Add(codigoElementoGasto&\":\"&descr";
Debug.ShouldStop(2097152);
_itemselemento.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codigoelementogasto,RemoteObject.createImmutable(":"),_descripcionelementogasto))));
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
 BA.debugLineNum = 217;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","33801180",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Maquina: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 219;BA.debugLine="SearchTemplateElemento.SetItems(ItemsElemento)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_searchtemplateelemento" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemselemento));
 BA.debugLineNum = 220;BA.debugLine="j4.Release";
Debug.ShouldStop(134217728);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 226;BA.debugLine="SearchTemplateTypeForm.Initialize";
Debug.ShouldStop(2);
__ref.getField(false,"_searchtemplatetypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 228;BA.debugLine="Dim ItemsTypeForm As List";
Debug.ShouldStop(8);
_itemstypeform = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsTypeForm", _itemstypeform);
 BA.debugLineNum = 229;BA.debugLine="ItemsTypeForm.Initialize";
Debug.ShouldStop(16);
_itemstypeform.runVoidMethod ("Initialize");
 BA.debugLineNum = 230;BA.debugLine="ItemsTypeForm.Add(\"0\"&\":\"&\"Insumo\")";
Debug.ShouldStop(32);
_itemstypeform.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("0"),RemoteObject.createImmutable(":"),RemoteObject.createImmutable("Insumo")))));
 BA.debugLineNum = 231;BA.debugLine="ItemsTypeForm.Add(\"1\"&\":\"&\"Siembra\")";
Debug.ShouldStop(64);
_itemstypeform.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("1"),RemoteObject.createImmutable(":"),RemoteObject.createImmutable("Siembra")))));
 BA.debugLineNum = 232;BA.debugLine="ItemsTypeForm.Add(\"2\"&\":\"&\"Riego\")";
Debug.ShouldStop(128);
_itemstypeform.runVoidMethod ("Add",(Object)((RemoteObject.concat(RemoteObject.createImmutable("2"),RemoteObject.createImmutable(":"),RemoteObject.createImmutable("Riego")))));
 BA.debugLineNum = 233;BA.debugLine="SearchTemplateTypeForm.SetItems(ItemsTypeForm)";
Debug.ShouldStop(256);
__ref.getField(false,"_searchtemplatetypeform" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemstypeform));
 BA.debugLineNum = 237;BA.debugLine="data.Initialize";
Debug.ShouldStop(4096);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 240;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
Debug.ShouldStop(32768);
_cmdultimoregistro = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maxIdLabor")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);
 BA.debugLineNum = 241;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdultimoregistro),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 243;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(262144);
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
 BA.debugLineNum = 244;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
Debug.ShouldStop(524288);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_ultimoRegistro")));
 BA.debugLineNum = 245;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","req_ultimoregistro_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resUltimoRegistro", _resultimoregistro);
;
 BA.debugLineNum = 247;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
Debug.ShouldStop(4194304);
if (true) break;

case 34:
//for
this.state = 37;
group81 = _resultimoregistro.getField(false,"Rows" /*RemoteObject*/ );
index81 = 0;
groupLen81 = group81.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowRegistro", _rowregistro);
this.state = 65;
if (true) break;

case 65:
//C
this.state = 37;
if (index81 < groupLen81) {
this.state = 36;
_rowregistro = (group81.runMethod(false,"Get",index81));Debug.locals.put("rowRegistro", _rowregistro);}
if (true) break;

case 66:
//C
this.state = 65;
index81++;
Debug.locals.put("rowRegistro", _rowregistro);
if (true) break;

case 36:
//C
this.state = 66;
 BA.debugLineNum = 248;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
Debug.ShouldStop(8388608);
_ultimoregistro = BA.numberCast(int.class, _rowregistro.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("ultimoRegistro", _ultimoregistro);Debug.locals.put("ultimoRegistro", _ultimoregistro);
 BA.debugLineNum = 249;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","33801212",RemoteObject.concat(RemoteObject.createImmutable("Último Registro obtenido: "),_ultimoregistro),0);
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
 BA.debugLineNum = 253;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","33801216",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta select_maxIdLabor: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 40:
//C
this.state = 41;
;
 BA.debugLineNum = 256;BA.debugLine="consecutivo = ultimoRegistro + 1";
Debug.ShouldStop(-2147483648);
__ref.setField ("_consecutivo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ultimoregistro,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 258;BA.debugLine="Log(consecutivo)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","33801221",BA.NumberToString(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),0);
 BA.debugLineNum = 260;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
Debug.ShouldStop(8);
_cmdultimoregistro = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maxIdSiembra")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);
 BA.debugLineNum = 261;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdultimoregistro),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 263;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 264;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
Debug.ShouldStop(128);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_ultimoRegistro")));
 BA.debugLineNum = 265;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","req_ultimoregistro_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "b4xpage_appear"), (_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resUltimoRegistro", _resultimoregistro);
;
 BA.debugLineNum = 267;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
Debug.ShouldStop(1024);
if (true) break;

case 44:
//for
this.state = 47;
group95 = _resultimoregistro.getField(false,"Rows" /*RemoteObject*/ );
index95 = 0;
groupLen95 = group95.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowRegistro", _rowregistro);
this.state = 69;
if (true) break;

case 69:
//C
this.state = 47;
if (index95 < groupLen95) {
this.state = 46;
_rowregistro = (group95.runMethod(false,"Get",index95));Debug.locals.put("rowRegistro", _rowregistro);}
if (true) break;

case 70:
//C
this.state = 69;
index95++;
Debug.locals.put("rowRegistro", _rowregistro);
if (true) break;

case 46:
//C
this.state = 70;
 BA.debugLineNum = 268;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
Debug.ShouldStop(2048);
_ultimoregistrosiembra = BA.numberCast(int.class, _rowregistro.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);
 BA.debugLineNum = 269;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","33801232",RemoteObject.concat(RemoteObject.createImmutable("Último Registro Siembra  obtenido: "),_ultimoregistrosiembra),0);
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
 BA.debugLineNum = 273;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","33801236",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta select_maxIdLabor: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 50:
//C
this.state = -1;
;
 BA.debugLineNum = 276;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
Debug.ShouldStop(524288);
__ref.setField ("_consecutivosiembra" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ultimoregistrosiembra,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 278;BA.debugLine="Log(consecutivoSiembra)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","33801241",BA.NumberToString(__ref.getField(true,"_consecutivosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 280;BA.debugLine="SearchTemplateInsumo.Initialize";
Debug.ShouldStop(8388608);
__ref.getField(false,"_searchtemplateinsumo" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 282;BA.debugLine="SearchTemplateRiego.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_searchtemplateriego" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 284;BA.debugLine="SearchTemplateTipoLabranza.Initialize";
Debug.ShouldStop(134217728);
__ref.getField(false,"_searchtemplatetipolabranza" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 286;BA.debugLine="SearchTemplateVariedad.Initialize";
Debug.ShouldStop(536870912);
__ref.getField(false,"_searchtemplatevariedad" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("B4XPage_Created (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formlabores","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 109;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="Root = Root1";
Debug.ShouldStop(8192);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 113;BA.debugLine="Base = Root";
Debug.ShouldStop(65536);
__ref.setField ("_base" /*RemoteObject*/ ,__ref.getField(false,"_root" /*RemoteObject*/ ));
 BA.debugLineNum = 114;BA.debugLine="Dialog.Initialize (Base)";
Debug.ShouldStop(131072);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_base" /*RemoteObject*/ )));
 BA.debugLineNum = 115;BA.debugLine="Dialog.Title = \"Buscador\"";
Debug.ShouldStop(262144);
__ref.getField(false,"_dialog" /*RemoteObject*/ ).setField ("_title" /*RemoteObject*/ ,RemoteObject.createImmutable(("Buscador")));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("B4XTable1_CellClicked (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,848);
if (RapidSub.canDelegate("b4xtable1_cellclicked")) { return __ref.runUserSub(false, "formlabores","b4xtable1_cellclicked", __ref, _columnid, _rowid);}
RemoteObject _rowdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _nombreinsu = RemoteObject.createImmutable("");
RemoteObject _cantidadinsu = RemoteObject.createImmutable(0);
Debug.locals.put("ColumnId", _columnid);
Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 848;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
Debug.ShouldStop(32768);
 BA.debugLineNum = 849;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
Debug.ShouldStop(65536);
formlabores.__c.runVoidMethod ("LogImpl","36422529",RemoteObject.concat(RemoteObject.createImmutable("COLUM ID"),_columnid),0);
 BA.debugLineNum = 850;BA.debugLine="Log(\"ROW ID\"&RowId)";
Debug.ShouldStop(131072);
formlabores.__c.runVoidMethod ("LogImpl","36422530",RemoteObject.concat(RemoteObject.createImmutable("ROW ID"),_rowid),0);
 BA.debugLineNum = 851;BA.debugLine="PanelTittleInsumo.Visible = True";
Debug.ShouldStop(262144);
__ref.getField(false,"_paneltittleinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 852;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
Debug.ShouldStop(524288);
_rowdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rowdata = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 853;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
Debug.ShouldStop(1048576);
_id = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))));Debug.locals.put("ID", _id);Debug.locals.put("ID", _id);
 BA.debugLineNum = 854;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
Debug.ShouldStop(2097152);
_nombreinsu = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOMBRE")))));Debug.locals.put("nombreInsu", _nombreinsu);Debug.locals.put("nombreInsu", _nombreinsu);
 BA.debugLineNum = 855;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
Debug.ShouldStop(4194304);
_cantidadinsu = BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CANTIDAD")))));Debug.locals.put("cantidadInsu", _cantidadinsu);Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 856;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
Debug.ShouldStop(8388608);
__ref.getField(false,"_labelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("- "),_nombreinsu,RemoteObject.createImmutable(" / "),RemoteObject.createImmutable("Cantidad: "),_cantidadinsu)));
 BA.debugLineNum = 857;BA.debugLine="PanelInsumoSelect.Visible = True";
Debug.ShouldStop(16777216);
__ref.getField(false,"_panelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 858;BA.debugLine="ButtonDeleteInsumo.Visible = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 860;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
Debug.ShouldStop(134217728);
__ref.setField ("_ideliminartabla" /*RemoteObject*/ ,BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("#"))))));
 BA.debugLineNum = 861;BA.debugLine="Log(idEliminarTabla)";
Debug.ShouldStop(268435456);
formlabores.__c.runVoidMethod ("LogImpl","36422541",BA.NumberToString(__ref.getField(true,"_ideliminartabla" /*RemoteObject*/ )),0);
 BA.debugLineNum = 862;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("ButtonAddInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,821);
if (RapidSub.canDelegate("buttonaddinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttonaddinsumo_click", __ref);}
RemoteObject _numberinsumo = RemoteObject.createImmutable(0);
 BA.debugLineNum = 821;BA.debugLine="Private Sub ButtonAddInsumo_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 822;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_nameinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_idinsumo" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",__ref.getField(true,"_cantinsumo" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 823;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
Debug.ShouldStop(4194304);
formlabores.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 }else {
 BA.debugLineNum = 825;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
Debug.ShouldStop(16777216);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 826;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
Debug.ShouldStop(33554432);
_numberinsumo = __ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ );Debug.locals.put("numberInsumo", _numberinsumo);Debug.locals.put("numberInsumo", _numberinsumo);
 BA.debugLineNum = 827;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
Debug.ShouldStop(67108864);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_numberinsumo),(__ref.getField(true,"_idinsumo" /*RemoteObject*/ )),(__ref.getField(true,"_nameinsumo" /*RemoteObject*/ )),(__ref.getField(true,"_cantinsumo" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 828;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )));
 BA.debugLineNum = 829;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(268435456);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 830;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
Debug.ShouldStop(536870912);
__ref.getField(false,"_edittextcantidadinsumo" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 832;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ButtonDeleteInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,835);
if (RapidSub.canDelegate("buttondeleteinsumo_click")) { return __ref.runUserSub(false, "formlabores","buttondeleteinsumo_click", __ref);}
 BA.debugLineNum = 835;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 837;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
Debug.ShouldStop(16);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeinsumofromdata" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_ideliminartabla" /*RemoteObject*/ )));
 BA.debugLineNum = 839;BA.debugLine="ButtonDeleteInsumo.Visible = False";
Debug.ShouldStop(64);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 840;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
Debug.ShouldStop(128);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 841;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(256);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 842;BA.debugLine="PanelTittleInsumo.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_paneltittleinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 843;BA.debugLine="PanelInsumoSelect.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_panelinsumoselect" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 844;BA.debugLine="ButtonDeleteInsumo.Visible = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_buttondeleteinsumo" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"False"));
 BA.debugLineNum = 845;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ButtonInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,886);
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
		Debug.PushSubsStack("ButtonInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,886);
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
 BA.debugLineNum = 890;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//for
this.state = 34;
step1 = 1;
limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 34;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step1)) ;
Debug.locals.put("i", _i);
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 892;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
Debug.ShouldStop(134217728);
_rowid = BA.numberCast(long.class, __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(false,"_visiblerowids" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("RowId", _rowid);Debug.locals.put("RowId", _rowid);
 BA.debugLineNum = 895;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
Debug.ShouldStop(1073741824);
_rowdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rowdata = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_getrow" /*RemoteObject*/ ,(Object)(_rowid));Debug.locals.put("rowData", _rowdata);Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 898;BA.debugLine="Dim ID As String";
Debug.ShouldStop(2);
_id = RemoteObject.createImmutable("");Debug.locals.put("ID", _id);
 BA.debugLineNum = 899;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
Debug.ShouldStop(4);
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
 BA.debugLineNum = 900;BA.debugLine="ID = rowData.Get(\"ID\")";
Debug.ShouldStop(8);
_id = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ID")))));Debug.locals.put("ID", _id);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 902;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
Debug.ShouldStop(32);
_id = BA.ObjectToString("No ID");Debug.locals.put("ID", _id);
 if (true) break;

case 9:
//C
this.state = 10;
;
 BA.debugLineNum = 906;BA.debugLine="Dim nombreInsu As String";
Debug.ShouldStop(512);
_nombreinsu = RemoteObject.createImmutable("");Debug.locals.put("nombreInsu", _nombreinsu);
 BA.debugLineNum = 907;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
Debug.ShouldStop(1024);
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
 BA.debugLineNum = 908;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
Debug.ShouldStop(2048);
_nombreinsu = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("NOMBRE")))));Debug.locals.put("nombreInsu", _nombreinsu);
 if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 910;BA.debugLine="nombreInsu = \"Desconocido\"";
Debug.ShouldStop(8192);
_nombreinsu = BA.ObjectToString("Desconocido");Debug.locals.put("nombreInsu", _nombreinsu);
 if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 914;BA.debugLine="Dim cantidadInsu As Int";
Debug.ShouldStop(131072);
_cantidadinsu = RemoteObject.createImmutable(0);Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 915;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
Debug.ShouldStop(262144);
if (true) break;

case 16:
//if
this.state = 33;
if (RemoteObject.solveBoolean(".",_rowdata.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("CANTIDAD"))))) && RemoteObject.solveBoolean("N",_rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CANTIDAD")))))) { 
this.state = 18;
}else {
this.state = 32;
}if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 916;BA.debugLine="Try";
Debug.ShouldStop(524288);
if (true) break;

case 19:
//try
this.state = 30;
this.catchState = 29;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 29;
 BA.debugLineNum = 917;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
Debug.ShouldStop(1048576);
_cantidadinsu = BA.numberCast(int.class, _rowdata.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CANTIDAD")))));Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 919;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","36619169",RemoteObject.concat(RemoteObject.createImmutable("Fila "),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(":")),0);
 BA.debugLineNum = 920;BA.debugLine="Log(\" - ID: \" & ID)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","36619170",RemoteObject.concat(RemoteObject.createImmutable(" - ID: "),_id),0);
 BA.debugLineNum = 921;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","36619171",RemoteObject.concat(RemoteObject.createImmutable(" - NOMBRE: "),_nombreinsu),0);
 BA.debugLineNum = 922;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","36619172",RemoteObject.concat(RemoteObject.createImmutable(" - CANTIDAD: "),_cantidadinsu),0);
 BA.debugLineNum = 925;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(268435456);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 926;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 929;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
Debug.ShouldStop(1);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_laborInsumo")),(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),(_id),(_cantidadinsu)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 931;BA.debugLine="Log(\"Comando SQL: insert_laborInsumo\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","36619181",RemoteObject.createImmutable("Comando SQL: insert_laborInsumo"),0);
 BA.debugLineNum = 932;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutiv";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","36619182",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 1 - consecutivo: "),__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),0);
 BA.debugLineNum = 933;BA.debugLine="Log(\"Parámetro 2 - ID: \" & ID)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","36619183",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 2 - ID: "),_id),0);
 BA.debugLineNum = 934;BA.debugLine="Log(\"Parámetro 3 - cantidadInsu: \" & cantidadI";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","36619184",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 3 - cantidadInsu: "),_cantidadinsu),0);
 BA.debugLineNum = 936;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
Debug.ShouldStop(128);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 937;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttoninsumo_click"), (_j));
this.state = 49;
return;
case 49:
//C
this.state = 22;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 940;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 22:
//if
this.state = 27;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 BA.debugLineNum = 942;BA.debugLine="Log(\"Inserción insumo exitosa para ID: \" & ID";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","36619192",RemoteObject.concat(RemoteObject.createImmutable("Inserción insumo exitosa para ID: "),_id),0);
 BA.debugLineNum = 943;BA.debugLine="ToastMessageShow(\"Inserción exitosa para Insu";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Inserción exitosa para Insumo : "),_id))),(Object)(parent.__c.getField(true,"True")));
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 946;BA.debugLine="Log(\"Error en la inserción insumo para ID: \"";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","36619196",RemoteObject.concat(RemoteObject.createImmutable("Error en la inserción insumo para ID: "),_id,RemoteObject.createImmutable(". Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 BA.debugLineNum = 947;BA.debugLine="ToastMessageShow(\"Error en la inserción para";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error en la inserción para ID: "),_id))),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 27:
//C
this.state = 30;
;
 BA.debugLineNum = 951;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 954;BA.debugLine="consecutivo = consecutivo + 1";
Debug.ShouldStop(33554432);
__ref.setField ("_consecutivo" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_consecutivo" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 Debug.CheckDeviceExceptions();
if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 BA.debugLineNum = 957;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
Debug.ShouldStop(268435456);
_cantidadinsu = BA.numberCast(int.class, 0);Debug.locals.put("cantidadInsu", _cantidadinsu);
 BA.debugLineNum = 958;BA.debugLine="Log(\"Error al procesar insumo la cantidad para";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","36619208",RemoteObject.concat(RemoteObject.createImmutable("Error al procesar insumo la cantidad para ID: "),_id),0);
 BA.debugLineNum = 959;BA.debugLine="ToastMessageShow(\"Error al procesar la cantida";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Error al procesar la cantidad para ID: "),_id))),(Object)(parent.__c.getField(true,"False")));
 if (true) break;
if (true) break;

case 30:
//C
this.state = 33;
this.catchState = 0;
;
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 962;BA.debugLine="cantidadInsu = 0";
Debug.ShouldStop(2);
_cantidadinsu = BA.numberCast(int.class, 0);Debug.locals.put("cantidadInsu", _cantidadinsu);
 if (true) break;

case 33:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 34:
//C
this.state = 35;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 966;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(32);
parent._horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));__ref.setField("_horasistema",parent._horasistema);
 BA.debugLineNum = 967;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(64);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 968;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(128);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formlabores.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 969;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
Debug.ShouldStop(256);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 970;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
Debug.ShouldStop(512);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 971;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
Debug.ShouldStop(1024);
__ref.setField ("_fechaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 973;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
Debug.ShouldStop(4096);
__ref.setField ("_fechafmrto" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 975;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16384);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 976;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32768);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 979;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(262144);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_labor")),(Object)(RemoteObject.createNewArray("Object",new int[] {18},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),RemoteObject.createImmutable(("0000-")),RemoteObject.createImmutable(("CA")),(__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_fechafin" /*RemoteObject*/ )),(__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),(__ref.getField(true,"_arealabor" /*RemoteObject*/ )),(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_arealote" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),(__ref.getField(true,"_horasistema" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 983;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","36619233",RemoteObject.concat(RemoteObject.createImmutable("nitEmpresaCBX: "),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 984;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","36619234",RemoteObject.concat(RemoteObject.createImmutable("haciendaCBX: "),__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 985;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","36619235",RemoteObject.concat(RemoteObject.createImmutable("loteCBX: "),__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 986;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","36619236",RemoteObject.concat(RemoteObject.createImmutable("fechafmrto: "),__ref.getField(true,"_fechafmrto" /*RemoteObject*/ )),0);
 BA.debugLineNum = 987;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","36619237",RemoteObject.concat(RemoteObject.createImmutable("tipoLabor: "),__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 988;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","36619238",RemoteObject.concat(RemoteObject.createImmutable("fechaInicio: "),__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 989;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","36619239",RemoteObject.concat(RemoteObject.createImmutable("fechaFin: "),__ref.getField(true,"_fechafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 990;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","36619240",RemoteObject.concat(RemoteObject.createImmutable("elementoGasto: "),__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),0);
 BA.debugLineNum = 991;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","36619241",RemoteObject.concat(RemoteObject.createImmutable("areaLabor: "),__ref.getField(true,"_arealabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 992;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","36619242",RemoteObject.concat(RemoteObject.createImmutable("consecutivo: "),__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),0);
 BA.debugLineNum = 993;BA.debugLine="Log(\"areaLote: \" & areaLote)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","36619243",RemoteObject.concat(RemoteObject.createImmutable("areaLote: "),__ref.getField(true,"_arealote" /*RemoteObject*/ )),0);
 BA.debugLineNum = 994;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","36619244",RemoteObject.concat(RemoteObject.createImmutable("fechaActual: "),__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),0);
 BA.debugLineNum = 995;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","36619245",RemoteObject.concat(RemoteObject.createImmutable("horaSistema: "),__ref.getField(true,"_horasistema" /*RemoteObject*/ )),0);
 BA.debugLineNum = 996;BA.debugLine="Log(\"user: \" & user)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","36619246",RemoteObject.concat(RemoteObject.createImmutable("user: "),__ref.getField(true,"_user" /*RemoteObject*/ )),0);
 BA.debugLineNum = 997;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","36619247",RemoteObject.concat(RemoteObject.createImmutable("DeviceName: "),__ref.getField(true,"_devicename" /*RemoteObject*/ )),0);
 BA.debugLineNum = 999;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(64);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 1000;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttoninsumo_click"), (_j));
this.state = 50;
return;
case 50:
//C
this.state = 35;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1003;BA.debugLine="Try";
Debug.ShouldStop(1024);
if (true) break;

case 35:
//try
this.state = 46;
this.catchState = 45;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 45;
 BA.debugLineNum = 1004;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2048);
if (true) break;

case 38:
//if
this.state = 43;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
 BA.debugLineNum = 1006;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente la labor.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 1009;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","36619259",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta labor: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 43:
//C
this.state = 46;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
 BA.debugLineNum = 1013;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","36619263",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 46:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1018;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("ButtonRiego_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1021);
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
		Debug.PushSubsStack("ButtonRiego_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1021);
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
 BA.debugLineNum = 1023;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1073741824);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 1024;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(-2147483648);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 1027;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(4);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_laborRiego")),(Object)(RemoteObject.createNewArray("Object",new int[] {5},new Object[] {(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),(__ref.getField(true,"_tiporiego" /*RemoteObject*/ )),(__ref.getField(true,"_procedenciariego" /*RemoteObject*/ )),(__ref.getField(true,"_caudalriego" /*RemoteObject*/ )),(__ref.getField(true,"_cantidadriego" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1030;BA.debugLine="Log(\"Comando SQL: insert_laborRiego\")";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","36684681",RemoteObject.createImmutable("Comando SQL: insert_laborRiego"),0);
 BA.debugLineNum = 1031;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutivo)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","36684682",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 1 - consecutivo: "),__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1032;BA.debugLine="Log(\"Parámetro 2 - tipoRiego: \" & tipoRiego)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","36684683",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 2 - tipoRiego: "),__ref.getField(true,"_tiporiego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1033;BA.debugLine="Log(\"Parámetro 3 - procedenciaRiego: \" & proceden";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","36684684",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 3 - procedenciaRiego: "),__ref.getField(true,"_procedenciariego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1034;BA.debugLine="Log(\"Parámetro 4 - caudalRiego: \" & caudalRiego)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","36684685",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 4 - caudalRiego: "),__ref.getField(true,"_caudalriego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1035;BA.debugLine="Log(\"Parámetro 5 - cantidadRiego: \" & cantidadRie";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","36684686",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 5 - cantidadRiego: "),__ref.getField(true,"_cantidadriego" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1037;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(4096);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 1038;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonriego_click"), (_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1041;BA.debugLine="Try";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 1042;BA.debugLine="If j.Success Then";
Debug.ShouldStop(131072);
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
 BA.debugLineNum = 1043;BA.debugLine="ToastMessageShow(\"Se ha insertado correctamente";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente Insumo")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1045;BA.debugLine="ToastMessageShow(\"Error al insertar Insumo\", Tr";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error al insertar Insumo")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1046;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","36684697",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 1049;BA.debugLine="ToastMessageShow(\"Error inesperado al insertar I";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error inesperado al insertar Insumo")),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1050;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","36684701",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 BA.debugLineNum = 1053;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(268435456);
parent._horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));__ref.setField("_horasistema",parent._horasistema);
 BA.debugLineNum = 1054;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(536870912);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 1055;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(1073741824);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formlabores.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 1056;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
Debug.ShouldStop(-2147483648);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 1057;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
Debug.ShouldStop(1);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 1058;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
Debug.ShouldStop(2);
__ref.setField ("_fechaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 1060;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
Debug.ShouldStop(8);
__ref.setField ("_fechafmrto" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 1062;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(32);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 1063;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(64);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 1066;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(512);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_labor")),(Object)(RemoteObject.createNewArray("Object",new int[] {18},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),RemoteObject.createImmutable(("0000-")),RemoteObject.createImmutable(("CA")),(__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_fechafin" /*RemoteObject*/ )),(__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),(__ref.getField(true,"_arealabor" /*RemoteObject*/ )),(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_arealote" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),(__ref.getField(true,"_horasistema" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1070;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","36684721",RemoteObject.concat(RemoteObject.createImmutable("nitEmpresaCBX: "),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1071;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","36684722",RemoteObject.concat(RemoteObject.createImmutable("haciendaCBX: "),__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1072;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","36684723",RemoteObject.concat(RemoteObject.createImmutable("loteCBX: "),__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1073;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","36684724",RemoteObject.concat(RemoteObject.createImmutable("fechafmrto: "),__ref.getField(true,"_fechafmrto" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1074;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","36684725",RemoteObject.concat(RemoteObject.createImmutable("tipoLabor: "),__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1075;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","36684726",RemoteObject.concat(RemoteObject.createImmutable("fechaInicio: "),__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1076;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","36684727",RemoteObject.concat(RemoteObject.createImmutable("fechaFin: "),__ref.getField(true,"_fechafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1077;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","36684728",RemoteObject.concat(RemoteObject.createImmutable("elementoGasto: "),__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1078;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","36684729",RemoteObject.concat(RemoteObject.createImmutable("areaLabor: "),__ref.getField(true,"_arealabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1079;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","36684730",RemoteObject.concat(RemoteObject.createImmutable("consecutivo: "),__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1080;BA.debugLine="Log(\"areaLote: \" & areaLote)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("LogImpl","36684731",RemoteObject.concat(RemoteObject.createImmutable("areaLote: "),__ref.getField(true,"_arealote" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1081;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","36684732",RemoteObject.concat(RemoteObject.createImmutable("fechaActual: "),__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1082;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","36684733",RemoteObject.concat(RemoteObject.createImmutable("horaSistema: "),__ref.getField(true,"_horasistema" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1083;BA.debugLine="Log(\"user: \" & user)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","36684734",RemoteObject.concat(RemoteObject.createImmutable("user: "),__ref.getField(true,"_user" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1084;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","36684735",RemoteObject.concat(RemoteObject.createImmutable("DeviceName: "),__ref.getField(true,"_devicename" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1086;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(536870912);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 1087;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonriego_click"), (_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1090;BA.debugLine="Try";
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
 BA.debugLineNum = 1091;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 1093;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente la labor.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 1096;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","36684747",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta labor: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 1100;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","36684751",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1103;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("ButtonSimbra_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1105);
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
		Debug.PushSubsStack("ButtonSimbra_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1105);
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
 BA.debugLineNum = 1107;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(262144);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 1108;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(524288);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 1110;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
Debug.ShouldStop(2097152);
_cmdultimoregistro = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_maxIdSiembra")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);Debug.locals.put("cmdUltimoRegistro", _cmdultimoregistro);
 BA.debugLineNum = 1111;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdultimoregistro),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j5", _j5);
;
 BA.debugLineNum = 1113;BA.debugLine="If j5.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 1114;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
Debug.ShouldStop(33554432);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j5),(Object)(RemoteObject.createImmutable("req_ultimoRegistro")));
 BA.debugLineNum = 1115;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","req_ultimoregistro_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resUltimoRegistro", _resultimoregistro);
;
 BA.debugLineNum = 1117;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 1118;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
Debug.ShouldStop(536870912);
_ultimoregistrosiembra = BA.numberCast(int.class, _rowregistro.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);Debug.locals.put("ultimoRegistroSiembra", _ultimoregistrosiembra);
 BA.debugLineNum = 1119;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","36750222",RemoteObject.concat(RemoteObject.createImmutable("Último Registro Siembra  obtenido: "),_ultimoregistrosiembra),0);
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
 BA.debugLineNum = 1123;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","36750226",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta select_maxIdLabor: "),_j5.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 1126;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
Debug.ShouldStop(32);
__ref.setField ("_consecutivosiembra" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_ultimoregistrosiembra,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 1128;BA.debugLine="Log(consecutivoSiembra)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","36750231",BA.NumberToString(__ref.getField(true,"_consecutivosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1131;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(1024);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_laborSiembra")),(Object)(RemoteObject.createNewArray("Object",new int[] {9},new Object[] {(__ref.getField(true,"_consecutivosiembra" /*RemoteObject*/ )),(__ref.getField(true,"_codigosiembra" /*RemoteObject*/ )),(__ref.getField(true,"_distanciasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_toneladasemillasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_numeropaquetessiembra" /*RemoteObject*/ )),(__ref.getField(true,"_procedenciasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ )),(__ref.getField(true,"_bandereosiembra" /*RemoteObject*/ )),(__ref.getField(true,"_numeromacollosiembra" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1134;BA.debugLine="Log(\"Comando SQL: insert_laborSiembra\")";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","36750237",RemoteObject.createImmutable("Comando SQL: insert_laborSiembra"),0);
 BA.debugLineNum = 1135;BA.debugLine="Log(\"Parámetro 1 - consecutivoSiembra: \" & consec";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","36750238",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 1 - consecutivoSiembra: "),__ref.getField(true,"_consecutivosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1136;BA.debugLine="Log(\"Parámetro 2 - codigoSiembra: \" & codigoSiemb";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","36750239",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 2 - codigoSiembra: "),__ref.getField(true,"_codigosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1137;BA.debugLine="Log(\"Parámetro 3 - distanciaSiembra: \" & distanci";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","36750240",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 3 - distanciaSiembra: "),__ref.getField(true,"_distanciasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1138;BA.debugLine="Log(\"Parámetro 4 - toneladaSemillaSiembra: \" & to";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","36750241",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 4 - toneladaSemillaSiembra: "),__ref.getField(true,"_toneladasemillasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1139;BA.debugLine="Log(\"Parámetro 5 - numeroPaquetesSiembra: \" & num";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("LogImpl","36750242",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 5 - numeroPaquetesSiembra: "),__ref.getField(true,"_numeropaquetessiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1140;BA.debugLine="Log(\"Parámetro 6 - procedenciaSiembra: \" & proced";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","36750243",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 6 - procedenciaSiembra: "),__ref.getField(true,"_procedenciasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1141;BA.debugLine="Log(\"Parámetro 7 - tipoLabranzaSiembra: \" & tipoL";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","36750244",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 7 - tipoLabranzaSiembra: "),__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1142;BA.debugLine="Log(\"Parámetro 8 - bandereoSiembra: \" & bandereoS";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","36750245",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 8 - bandereoSiembra: "),__ref.getField(true,"_bandereosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1143;BA.debugLine="Log(\"Parámetro 9 - numeroMacolloSiembra: \" & nume";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","36750246",RemoteObject.concat(RemoteObject.createImmutable("Parámetro 9 - numeroMacolloSiembra: "),__ref.getField(true,"_numeromacollosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1146;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(33554432);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 1147;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1150;BA.debugLine="Try";
Debug.ShouldStop(536870912);
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
 BA.debugLineNum = 1151;BA.debugLine="If j.Success Then";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 1152;BA.debugLine="Log(\"Datos insertados correctamente en insert_l";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","36750255",RemoteObject.createImmutable("Datos insertados correctamente en insert_laborInsumo"),0);
 BA.debugLineNum = 1153;BA.debugLine="ToastMessageShow(\"Datos de Insumo guardados con";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Datos de Insumo guardados con éxito")),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 1155;BA.debugLine="ToastMessageShow(\"Error al guardar los datos de";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error al guardar los datos de Insumo")),(Object)(parent.__c.getField(true,"True")));
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
 BA.debugLineNum = 1158;BA.debugLine="Log(\"Excepción capturada en insert_laborInsumo";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","36750261",RemoteObject.concat(RemoteObject.createImmutable("Excepción capturada en insert_laborInsumo: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 BA.debugLineNum = 1159;BA.debugLine="ToastMessageShow(\"Se produjo un error inesperado";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Se produjo un error inesperado")),(Object)(parent.__c.getField(true,"True")));
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
 BA.debugLineNum = 1163;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
Debug.ShouldStop(1024);
parent._horasistema = parent.__c.getField(false,"DateTime").runMethod(true,"Time",(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"getNow")));__ref.setField("_horasistema",parent._horasistema);
 BA.debugLineNum = 1164;BA.debugLine="user = Main.pUser";
Debug.ShouldStop(2048);
__ref.setField ("_user" /*RemoteObject*/ ,parent._main._puser /*RemoteObject*/ );
 BA.debugLineNum = 1165;BA.debugLine="DeviceName = GetDeviceName";
Debug.ShouldStop(4096);
__ref.setField ("_devicename" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.formlabores.class, "_getdevicename" /*RemoteObject*/ ));
 BA.debugLineNum = 1166;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
Debug.ShouldStop(8192);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 1167;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
Debug.ShouldStop(16384);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd HH:mm:ss"));
 BA.debugLineNum = 1168;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
Debug.ShouldStop(32768);
__ref.setField ("_fechaactual" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 1170;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
Debug.ShouldStop(131072);
__ref.setField ("_fechafmrto" /*RemoteObject*/ ,parent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_fecha)));
 BA.debugLineNum = 1172;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(524288);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 1173;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(1048576);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 1176;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
Debug.ShouldStop(8388608);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_labor")),(Object)(RemoteObject.createNewArray("Object",new int[] {18},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),RemoteObject.createImmutable(("0000-")),RemoteObject.createImmutable(("CA")),(__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_fechafin" /*RemoteObject*/ )),(__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),(__ref.getField(true,"_arealabor" /*RemoteObject*/ )),(__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_arealote" /*RemoteObject*/ )),parent.__c.getField(false,"Null"),(__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),(__ref.getField(true,"_horasistema" /*RemoteObject*/ )),(__ref.getField(true,"_user" /*RemoteObject*/ )),(__ref.getField(true,"_devicename" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1180;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","36750283",RemoteObject.concat(RemoteObject.createImmutable("nitEmpresaCBX: "),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1181;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","36750284",RemoteObject.concat(RemoteObject.createImmutable("haciendaCBX: "),__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1182;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","36750285",RemoteObject.concat(RemoteObject.createImmutable("loteCBX: "),__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1183;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","36750286",RemoteObject.concat(RemoteObject.createImmutable("fechafmrto: "),__ref.getField(true,"_fechafmrto" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1184;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","36750287",RemoteObject.concat(RemoteObject.createImmutable("tipoLabor: "),__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1185;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","36750288",RemoteObject.concat(RemoteObject.createImmutable("fechaInicio: "),__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1186;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("LogImpl","36750289",RemoteObject.concat(RemoteObject.createImmutable("fechaFin: "),__ref.getField(true,"_fechafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1187;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","36750290",RemoteObject.concat(RemoteObject.createImmutable("elementoGasto: "),__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1188;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("LogImpl","36750291",RemoteObject.concat(RemoteObject.createImmutable("areaLabor: "),__ref.getField(true,"_arealabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1189;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","36750292",RemoteObject.concat(RemoteObject.createImmutable("consecutivo: "),__ref.getField(true,"_consecutivo" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1190;BA.debugLine="Log(\"areaLote: \" & areaLote)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","36750293",RemoteObject.concat(RemoteObject.createImmutable("areaLote: "),__ref.getField(true,"_arealote" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1191;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","36750294",RemoteObject.concat(RemoteObject.createImmutable("fechaActual: "),__ref.getField(true,"_fechaactual" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1192;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","36750295",RemoteObject.concat(RemoteObject.createImmutable("horaSistema: "),__ref.getField(true,"_horasistema" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1193;BA.debugLine="Log(\"user: \" & user)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","36750296",RemoteObject.concat(RemoteObject.createImmutable("user: "),__ref.getField(true,"_user" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1194;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","36750297",RemoteObject.concat(RemoteObject.createImmutable("DeviceName: "),__ref.getField(true,"_devicename" /*RemoteObject*/ )),0);
 BA.debugLineNum = 1196;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
Debug.ShouldStop(2048);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 1197;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "buttonsimbra_click"), (_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1200;BA.debugLine="Try";
Debug.ShouldStop(32768);
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
 BA.debugLineNum = 1201;BA.debugLine="If j.Success Then";
Debug.ShouldStop(65536);
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
 BA.debugLineNum = 1203;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente la labor.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 if (true) break;

case 30:
//C
this.state = 31;
 BA.debugLineNum = 1206;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","36750309",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta labor: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
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
 BA.debugLineNum = 1210;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","36750313",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba")).runMethod(true,"getMessage")),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 1213;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
 //BA.debugLineNum = 25;BA.debugLine="Dim haciendaCBX As String";
formlabores._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formlabores._haciendacbx);
 //BA.debugLineNum = 26;BA.debugLine="Dim nitEmpresaCBX As String";
formlabores._nitempresacbx = RemoteObject.createImmutable("");__ref.setField("_nitempresacbx",formlabores._nitempresacbx);
 //BA.debugLineNum = 28;BA.debugLine="Private Panel2geral As Panel";
formlabores._panel2geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel2geral",formlabores._panel2geral);
 //BA.debugLineNum = 29;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
formlabores._sd_xcomboboxtiporiego = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtiporiego",formlabores._sd_xcomboboxtiporiego);
 //BA.debugLineNum = 31;BA.debugLine="Private Panel3geral As Panel";
formlabores._panel3geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3geral",formlabores._panel3geral);
 //BA.debugLineNum = 32;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
formlabores._sd_xcomboboxcodigovariedad = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxcodigovariedad",formlabores._sd_xcomboboxcodigovariedad);
 //BA.debugLineNum = 33;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
formlabores._sd_xcomboboxtipolabranza = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxtipolabranza",formlabores._sd_xcomboboxtipolabranza);
 //BA.debugLineNum = 35;BA.debugLine="Private cantidadInsumos As Int";
formlabores._cantidadinsumos = RemoteObject.createImmutable(0);__ref.setField("_cantidadinsumos",formlabores._cantidadinsumos);
 //BA.debugLineNum = 37;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
formlabores._sd_xcomboboxinsumo = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxinsumo",formlabores._sd_xcomboboxinsumo);
 //BA.debugLineNum = 38;BA.debugLine="Private EditTextCantidadInsumo As EditText";
formlabores._edittextcantidadinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittextcantidadinsumo",formlabores._edittextcantidadinsumo);
 //BA.debugLineNum = 39;BA.debugLine="Private ButtonAddInsumo As Button";
formlabores._buttonaddinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonaddinsumo",formlabores._buttonaddinsumo);
 //BA.debugLineNum = 40;BA.debugLine="Private ButtonDeleteInsumo As Button";
formlabores._buttondeleteinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttondeleteinsumo",formlabores._buttondeleteinsumo);
 //BA.debugLineNum = 41;BA.debugLine="Private Panel0geral As Panel";
formlabores._panel0geral = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel0geral",formlabores._panel0geral);
 //BA.debugLineNum = 43;BA.debugLine="Private IDINSUMO As String";
formlabores._idinsumo = RemoteObject.createImmutable("");__ref.setField("_idinsumo",formlabores._idinsumo);
 //BA.debugLineNum = 44;BA.debugLine="Private NAMEINSUMO As String";
formlabores._nameinsumo = RemoteObject.createImmutable("");__ref.setField("_nameinsumo",formlabores._nameinsumo);
 //BA.debugLineNum = 45;BA.debugLine="Private CANTINSUMO As String";
formlabores._cantinsumo = RemoteObject.createImmutable("");__ref.setField("_cantinsumo",formlabores._cantinsumo);
 //BA.debugLineNum = 47;BA.debugLine="Private LabelCantidadInsumos As Label";
formlabores._labelcantidadinsumos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelcantidadinsumos",formlabores._labelcantidadinsumos);
 //BA.debugLineNum = 48;BA.debugLine="Private B4XTable1 As B4XTable";
formlabores._b4xtable1 = RemoteObject.createNew ("b4a.example.ef.b4xtable");__ref.setField("_b4xtable1",formlabores._b4xtable1);
 //BA.debugLineNum = 49;BA.debugLine="Private data As List";
formlabores._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_data",formlabores._data);
 //BA.debugLineNum = 51;BA.debugLine="Private PanelInsumoSelect As Panel";
formlabores._panelinsumoselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panelinsumoselect",formlabores._panelinsumoselect);
 //BA.debugLineNum = 52;BA.debugLine="Private PanelTittleInsumo As Panel";
formlabores._paneltittleinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_paneltittleinsumo",formlabores._paneltittleinsumo);
 //BA.debugLineNum = 53;BA.debugLine="Private LabelInsumoSelect As Label";
formlabores._labelinsumoselect = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labelinsumoselect",formlabores._labelinsumoselect);
 //BA.debugLineNum = 55;BA.debugLine="Dim idEliminarTabla As Int";
formlabores._ideliminartabla = RemoteObject.createImmutable(0);__ref.setField("_ideliminartabla",formlabores._ideliminartabla);
 //BA.debugLineNum = 57;BA.debugLine="Dim tipoRiego As String";
formlabores._tiporiego = RemoteObject.createImmutable("");__ref.setField("_tiporiego",formlabores._tiporiego);
 //BA.debugLineNum = 58;BA.debugLine="Dim procedenciaRiego As String";
formlabores._procedenciariego = RemoteObject.createImmutable("");__ref.setField("_procedenciariego",formlabores._procedenciariego);
 //BA.debugLineNum = 59;BA.debugLine="Dim caudalRiego As String";
formlabores._caudalriego = RemoteObject.createImmutable("");__ref.setField("_caudalriego",formlabores._caudalriego);
 //BA.debugLineNum = 60;BA.debugLine="Dim cantidadRiego As String";
formlabores._cantidadriego = RemoteObject.createImmutable("");__ref.setField("_cantidadriego",formlabores._cantidadriego);
 //BA.debugLineNum = 62;BA.debugLine="Dim codigoSiembra As String";
formlabores._codigosiembra = RemoteObject.createImmutable("");__ref.setField("_codigosiembra",formlabores._codigosiembra);
 //BA.debugLineNum = 63;BA.debugLine="Dim distanciaSiembra As Int";
formlabores._distanciasiembra = RemoteObject.createImmutable(0);__ref.setField("_distanciasiembra",formlabores._distanciasiembra);
 //BA.debugLineNum = 64;BA.debugLine="Dim bandereoSiembra As Int";
formlabores._bandereosiembra = RemoteObject.createImmutable(0);__ref.setField("_bandereosiembra",formlabores._bandereosiembra);
 //BA.debugLineNum = 65;BA.debugLine="Dim toneladaSemillaSiembra As Int";
formlabores._toneladasemillasiembra = RemoteObject.createImmutable(0);__ref.setField("_toneladasemillasiembra",formlabores._toneladasemillasiembra);
 //BA.debugLineNum = 66;BA.debugLine="Dim procedenciaSiembra As String";
formlabores._procedenciasiembra = RemoteObject.createImmutable("");__ref.setField("_procedenciasiembra",formlabores._procedenciasiembra);
 //BA.debugLineNum = 67;BA.debugLine="Dim tipoLabranzaSiembra As String";
formlabores._tipolabranzasiembra = RemoteObject.createImmutable("");__ref.setField("_tipolabranzasiembra",formlabores._tipolabranzasiembra);
 //BA.debugLineNum = 68;BA.debugLine="Dim numeroPaquetesSiembra As Int";
formlabores._numeropaquetessiembra = RemoteObject.createImmutable(0);__ref.setField("_numeropaquetessiembra",formlabores._numeropaquetessiembra);
 //BA.debugLineNum = 69;BA.debugLine="Dim numeroMacolloSiembra As Int";
formlabores._numeromacollosiembra = RemoteObject.createImmutable(0);__ref.setField("_numeromacollosiembra",formlabores._numeromacollosiembra);
 //BA.debugLineNum = 71;BA.debugLine="Dim DeviceName As String";
formlabores._devicename = RemoteObject.createImmutable("");__ref.setField("_devicename",formlabores._devicename);
 //BA.debugLineNum = 72;BA.debugLine="Dim user As String";
formlabores._user = RemoteObject.createImmutable("");__ref.setField("_user",formlabores._user);
 //BA.debugLineNum = 74;BA.debugLine="Dim fechaActual As String";
formlabores._fechaactual = RemoteObject.createImmutable("");__ref.setField("_fechaactual",formlabores._fechaactual);
 //BA.debugLineNum = 75;BA.debugLine="Dim consecutivoSiembra As Int";
formlabores._consecutivosiembra = RemoteObject.createImmutable(0);__ref.setField("_consecutivosiembra",formlabores._consecutivosiembra);
 //BA.debugLineNum = 78;BA.debugLine="Private Dialog As B4XDialog";
formlabores._dialog = RemoteObject.createNew ("b4a.example.ef.b4xdialog");__ref.setField("_dialog",formlabores._dialog);
 //BA.debugLineNum = 79;BA.debugLine="Private Base As B4XView";
formlabores._base = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_base",formlabores._base);
 //BA.debugLineNum = 80;BA.debugLine="Private SwiftButtonNit As SwiftButton";
formlabores._swiftbuttonnit = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonnit",formlabores._swiftbuttonnit);
 //BA.debugLineNum = 81;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
formlabores._searchtemplatenit = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatenit",formlabores._searchtemplatenit);
 //BA.debugLineNum = 82;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
formlabores._swiftbuttonhacienda = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonhacienda",formlabores._swiftbuttonhacienda);
 //BA.debugLineNum = 83;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
formlabores._searchtemplatehacienda = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatehacienda",formlabores._searchtemplatehacienda);
 //BA.debugLineNum = 84;BA.debugLine="Private SwiftButtonLote As SwiftButton";
formlabores._swiftbuttonlote = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonlote",formlabores._swiftbuttonlote);
 //BA.debugLineNum = 85;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
formlabores._searchtemplatelote = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatelote",formlabores._searchtemplatelote);
 //BA.debugLineNum = 86;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
formlabores._swiftbuttonlabor = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonlabor",formlabores._swiftbuttonlabor);
 //BA.debugLineNum = 87;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
formlabores._searchtemplatelabor = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatelabor",formlabores._searchtemplatelabor);
 //BA.debugLineNum = 88;BA.debugLine="Private SwiftButtonElemento As SwiftButton";
formlabores._swiftbuttonelemento = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonelemento",formlabores._swiftbuttonelemento);
 //BA.debugLineNum = 89;BA.debugLine="Private SearchTemplateElemento As B4XSearchTempla";
formlabores._searchtemplateelemento = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplateelemento",formlabores._searchtemplateelemento);
 //BA.debugLineNum = 90;BA.debugLine="Private SwiftButtonTypeForm As SwiftButton";
formlabores._swiftbuttontypeform = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttontypeform",formlabores._swiftbuttontypeform);
 //BA.debugLineNum = 91;BA.debugLine="Private SearchTemplateTypeForm As B4XSearchTempla";
formlabores._searchtemplatetypeform = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatetypeform",formlabores._searchtemplatetypeform);
 //BA.debugLineNum = 92;BA.debugLine="Private SwiftButtonInsumo As SwiftButton";
formlabores._swiftbuttoninsumo = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttoninsumo",formlabores._swiftbuttoninsumo);
 //BA.debugLineNum = 93;BA.debugLine="Private SearchTemplateInsumo As B4XSearchTemplate";
formlabores._searchtemplateinsumo = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplateinsumo",formlabores._searchtemplateinsumo);
 //BA.debugLineNum = 94;BA.debugLine="Private SwiftButtonRiego As SwiftButton";
formlabores._swiftbuttonriego = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonriego",formlabores._swiftbuttonriego);
 //BA.debugLineNum = 95;BA.debugLine="Private SearchTemplateRiego As B4XSearchTemplate";
formlabores._searchtemplateriego = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplateriego",formlabores._searchtemplateriego);
 //BA.debugLineNum = 96;BA.debugLine="Private SwiftButtonTipoLabranza As SwiftButton";
formlabores._swiftbuttontipolabranza = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttontipolabranza",formlabores._swiftbuttontipolabranza);
 //BA.debugLineNum = 97;BA.debugLine="Private SearchTemplateTipoLabranza As B4XSearchTe";
formlabores._searchtemplatetipolabranza = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatetipolabranza",formlabores._searchtemplatetipolabranza);
 //BA.debugLineNum = 98;BA.debugLine="Private SwiftButtonVariedad As SwiftButton";
formlabores._swiftbuttonvariedad = RemoteObject.createNew ("b4a.example.ef.swiftbutton");__ref.setField("_swiftbuttonvariedad",formlabores._swiftbuttonvariedad);
 //BA.debugLineNum = 99;BA.debugLine="Private SearchTemplateVariedad As B4XSearchTempla";
formlabores._searchtemplatevariedad = RemoteObject.createNew ("b4a.example.ef.b4xsearchtemplate");__ref.setField("_searchtemplatevariedad",formlabores._searchtemplatevariedad);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,421);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formlabores","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 421;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(16);
 BA.debugLineNum = 422;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(32);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 423;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(64);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 424;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(128);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 425;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 426;BA.debugLine="Return cmd";
Debug.ShouldStop(512);
if (true) return _cmd;
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("CreateItem (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "formlabores","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 291;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(4);
 BA.debugLineNum = 293;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 294;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(32);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 297;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
Debug.ShouldStop(256);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("addLaboresUI")),__ref.getField(false, "ba"));
 BA.debugLineNum = 299;BA.debugLine="panel.Height=Panel1geral.Height";
Debug.ShouldStop(1024);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel1geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 301;BA.debugLine="Return panel";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 302;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("CreateItemInsumo (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("createiteminsumo")) { return __ref.runUserSub(false, "formlabores","createiteminsumo", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 331;BA.debugLine="Private Sub CreateItemInsumo As Panel";
Debug.ShouldStop(1024);
 BA.debugLineNum = 333;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(4096);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 334;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(8192);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 337;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
Debug.ShouldStop(65536);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormInsumo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 339;BA.debugLine="panel.Height=Panel0geral.Height";
Debug.ShouldStop(262144);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel0geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 341;BA.debugLine="Return panel";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("CreateItemRiego (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("createitemriego")) { return __ref.runUserSub(false, "formlabores","createitemriego", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 305;BA.debugLine="Private Sub CreateItemRiego As Panel";
Debug.ShouldStop(65536);
 BA.debugLineNum = 307;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(262144);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 308;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(524288);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 311;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
Debug.ShouldStop(4194304);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormRiego")),__ref.getField(false, "ba"));
 BA.debugLineNum = 313;BA.debugLine="panel.Height=Panel2geral.Height";
Debug.ShouldStop(16777216);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel2geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 315;BA.debugLine="Return panel";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("CreateItemSiembra (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("createitemsiembra")) { return __ref.runUserSub(false, "formlabores","createitemsiembra", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 318;BA.debugLine="Private Sub CreateItemSiembra As Panel";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 320;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(-2147483648);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 321;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(1);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(formlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 324;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
Debug.ShouldStop(8);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FormSiembra")),__ref.getField(false, "ba"));
 BA.debugLineNum = 326;BA.debugLine="panel.Height=Panel3geral.Height";
Debug.ShouldStop(32);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_panel3geral" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 328;BA.debugLine="Return panel";
Debug.ShouldStop(128);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("EditTextAreaLabor_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("edittextarealabor_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextarealabor_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 533;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 535;BA.debugLine="areaLabor = New";
Debug.ShouldStop(4194304);
__ref.setField ("_arealabor" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 537;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
Debug.ShouldStop(16777216);
formlabores.__c.runVoidMethod ("LogImpl","34784132",RemoteObject.concat(RemoteObject.createImmutable("Area Labor "),__ref.getField(true,"_arealabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("EditTextAreaLote_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("edittextarealote_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextarealote_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 541;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 543;BA.debugLine="areaLote = New";
Debug.ShouldStop(1073741824);
__ref.setField ("_arealote" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 545;BA.debugLine="Log(\"Area lote \" & areaLote )";
Debug.ShouldStop(1);
formlabores.__c.runVoidMethod ("LogImpl","34849668",RemoteObject.concat(RemoteObject.createImmutable("Area lote "),__ref.getField(true,"_arealote" /*RemoteObject*/ )),0);
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
public static RemoteObject  _edittextbandereo_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextBandereo_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,661);
if (RapidSub.canDelegate("edittextbandereo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextbandereo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 661;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 663;BA.debugLine="bandereoSiembra = New";
Debug.ShouldStop(4194304);
__ref.setField ("_bandereosiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 665;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
Debug.ShouldStop(16777216);
formlabores.__c.runVoidMethod ("LogImpl","35570564",RemoteObject.concat(RemoteObject.createImmutable("bandereo "),__ref.getField(true,"_bandereosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("EditTextCantidadAgua_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,602);
if (RapidSub.canDelegate("edittextcantidadagua_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadagua_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 602;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 603;BA.debugLine="cantidadRiego = New";
Debug.ShouldStop(67108864);
__ref.setField ("_cantidadriego" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 605;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
Debug.ShouldStop(268435456);
formlabores.__c.runVoidMethod ("LogImpl","35111811",RemoteObject.concat(RemoteObject.createImmutable("cantidad"),__ref.getField(true,"_cantidadriego" /*RemoteObject*/ )),0);
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
public static RemoteObject  _edittextcantidadinsumo_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextCantidadInsumo_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,816);
if (RapidSub.canDelegate("edittextcantidadinsumo_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcantidadinsumo_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 816;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
Debug.ShouldStop(32768);
 BA.debugLineNum = 817;BA.debugLine="ButtonAddInsumo.Enabled = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_buttonaddinsumo" /*RemoteObject*/ ).runMethod(true,"setEnabled",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 818;BA.debugLine="CANTINSUMO = New";
Debug.ShouldStop(131072);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 819;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("EditTextCaudalAplicado_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,596);
if (RapidSub.canDelegate("edittextcaudalaplicado_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextcaudalaplicado_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 596;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
Debug.ShouldStop(524288);
 BA.debugLineNum = 597;BA.debugLine="caudalRiego = New";
Debug.ShouldStop(1048576);
__ref.setField ("_caudalriego" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 599;BA.debugLine="Log(\"caudal\" & caudalRiego)";
Debug.ShouldStop(4194304);
formlabores.__c.runVoidMethod ("LogImpl","35046275",RemoteObject.concat(RemoteObject.createImmutable("caudal"),__ref.getField(true,"_caudalriego" /*RemoteObject*/ )),0);
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
public static RemoteObject  _edittextdistanciasiembra_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextDistanciaSiembra_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,655);
if (RapidSub.canDelegate("edittextdistanciasiembra_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextdistanciasiembra_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 655;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
Debug.ShouldStop(16384);
 BA.debugLineNum = 656;BA.debugLine="distanciaSiembra = New";
Debug.ShouldStop(32768);
__ref.setField ("_distanciasiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 658;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
Debug.ShouldStop(131072);
formlabores.__c.runVoidMethod ("LogImpl","35505027",RemoteObject.concat(RemoteObject.createImmutable("Distancia de siembra "),__ref.getField(true,"_distanciasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 659;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("EditTextNumeroMacollos_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,695);
if (RapidSub.canDelegate("edittextnumeromacollos_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeromacollos_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 695;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 696;BA.debugLine="numeroMacolloSiembra = New";
Debug.ShouldStop(8388608);
__ref.setField ("_numeromacollosiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 698;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
Debug.ShouldStop(33554432);
formlabores.__c.runVoidMethod ("LogImpl","35898243",RemoteObject.concat(RemoteObject.createImmutable("numero de macollos "),__ref.getField(true,"_numeromacollosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 699;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("EditTextNumeroPaquetes_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,688);
if (RapidSub.canDelegate("edittextnumeropaquetes_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextnumeropaquetes_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 688;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
Debug.ShouldStop(32768);
 BA.debugLineNum = 690;BA.debugLine="numeroPaquetesSiembra = New";
Debug.ShouldStop(131072);
__ref.setField ("_numeropaquetessiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 692;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
Debug.ShouldStop(524288);
formlabores.__c.runVoidMethod ("LogImpl","35832708",RemoteObject.concat(RemoteObject.createImmutable("numero de paquetes "),__ref.getField(true,"_numeropaquetessiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 693;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("EditTextProcedencia_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,589);
if (RapidSub.canDelegate("edittextprocedencia_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedencia_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 589;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 591;BA.debugLine="procedenciaRiego = New";
Debug.ShouldStop(16384);
__ref.setField ("_procedenciariego" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 593;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
Debug.ShouldStop(65536);
formlabores.__c.runVoidMethod ("LogImpl","34980740",RemoteObject.concat(RemoteObject.createImmutable("procedencia"),__ref.getField(true,"_procedenciariego" /*RemoteObject*/ )),0);
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
public static RemoteObject  _edittextprocedenciadestino_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditTextProcedenciaDestino_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,675);
if (RapidSub.canDelegate("edittextprocedenciadestino_textchanged")) { return __ref.runUserSub(false, "formlabores","edittextprocedenciadestino_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 675;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
Debug.ShouldStop(4);
 BA.debugLineNum = 676;BA.debugLine="procedenciaSiembra = New";
Debug.ShouldStop(8);
__ref.setField ("_procedenciasiembra" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 678;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
Debug.ShouldStop(32);
formlabores.__c.runVoidMethod ("LogImpl","35701635",RemoteObject.concat(RemoteObject.createImmutable("procedencia "),__ref.getField(true,"_procedenciasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("EditTextToneladaSemilla_TextChanged (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,668);
if (RapidSub.canDelegate("edittexttoneladasemilla_textchanged")) { return __ref.runUserSub(false, "formlabores","edittexttoneladasemilla_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 668;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 670;BA.debugLine="toneladaSemillaSiembra = New";
Debug.ShouldStop(536870912);
__ref.setField ("_toneladasemillasiembra" /*RemoteObject*/ ,BA.numberCast(int.class, _new));
 BA.debugLineNum = 672;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
Debug.ShouldStop(-2147483648);
formlabores.__c.runVoidMethod ("LogImpl","35636100",RemoteObject.concat(RemoteObject.createImmutable("tonelada Semilla "),__ref.getField(true,"_toneladasemillasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 673;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("GetDeviceName (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("getdevicename")) { return __ref.runUserSub(false, "formlabores","getdevicename", __ref);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _manufacturer = RemoteObject.createImmutable("");
RemoteObject _model = RemoteObject.createImmutable("");
 BA.debugLineNum = 118;BA.debugLine="Sub GetDeviceName As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(4194304);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 120;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
Debug.ShouldStop(8388608);
_manufacturer = _p.runMethod(true,"getManufacturer");Debug.locals.put("Manufacturer", _manufacturer);Debug.locals.put("Manufacturer", _manufacturer);
 BA.debugLineNum = 121;BA.debugLine="Dim Model As String = p.Model";
Debug.ShouldStop(16777216);
_model = _p.runMethod(true,"getModel");Debug.locals.put("Model", _model);Debug.locals.put("Model", _model);
 BA.debugLineNum = 122;BA.debugLine="Return Manufacturer & \" \" & Model";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.concat(_manufacturer,RemoteObject.createImmutable(" "),_model);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Initialize (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formlabores","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 103;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(64);
 BA.debugLineNum = 104;BA.debugLine="Return Me";
Debug.ShouldStop(128);
if (true) return __ref;
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Label13Time_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,346);
if (RapidSub.canDelegate("label13time_click")) { return __ref.runUserSub(false, "formlabores","label13time_click", __ref);}
 BA.debugLineNum = 346;BA.debugLine="Private Sub Label13Time_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 347;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(67108864);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Label14Time_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("label14time_click")) { return __ref.runUserSub(false, "formlabores","label14time_click", __ref);}
 BA.debugLineNum = 350;BA.debugLine="Private Sub Label14Time_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 351;BA.debugLine="Panel3.Visible = True";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_panel3" /*RemoteObject*/ ).runMethod(true,"setVisible",formlabores.__c.getField(true,"True"));
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("Label1Back_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,881);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "formlabores","label1back_click", __ref);}
 BA.debugLineNum = 881;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 882;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(131072);
formlabores._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 883;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,782);
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
RemoteObject _itemsinsumo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _cdgo_producto = RemoteObject.createImmutable("");
RemoteObject _dscrpcion_producto = RemoteObject.createImmutable("");
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxInsumo (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,782);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 784;BA.debugLine="Dim ItemsInsumo As List";
Debug.ShouldStop(32768);
_itemsinsumo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsInsumo", _itemsinsumo);
 BA.debugLineNum = 785;BA.debugLine="ItemsInsumo.Initialize";
Debug.ShouldStop(65536);
_itemsinsumo.runVoidMethod ("Initialize");
 BA.debugLineNum = 786;BA.debugLine="ItemsInsumo.Add(\"Seleccionar:\")";
Debug.ShouldStop(131072);
_itemsinsumo.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 788;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(524288);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 789;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(1048576);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 791;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
Debug.ShouldStop(4194304);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_insumosSort")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 792;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 793;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
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
 BA.debugLineNum = 794;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(33554432);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 795;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxinsumo"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 796;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(134217728);
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
 BA.debugLineNum = 797;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
Debug.ShouldStop(268435456);
_cdgo_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Producto", _cdgo_producto);Debug.locals.put("Cdgo_Producto", _cdgo_producto);
 BA.debugLineNum = 798;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
Debug.ShouldStop(536870912);
_dscrpcion_producto = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);Debug.locals.put("Dscrpcion_Producto", _dscrpcion_producto);
 BA.debugLineNum = 799;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_sd_xcomboboxinsumo" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_dscrpcion_producto),(Object)((RemoteObject.concat(_dscrpcion_producto,RemoteObject.createImmutable(" - "),_cdgo_producto))));
 BA.debugLineNum = 800;BA.debugLine="ItemsInsumo.Add(Cdgo_Producto&\":\"&Dscrpcion_Pro";
Debug.ShouldStop(-2147483648);
_itemsinsumo.runVoidMethod ("Add",(Object)((RemoteObject.concat(_cdgo_producto,RemoteObject.createImmutable(":"),_dscrpcion_producto))));
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
 BA.debugLineNum = 803;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","36094869",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 805;BA.debugLine="SearchTemplateInsumo.SetItems(ItemsInsumo)";
Debug.ShouldStop(16);
__ref.getField(false,"_searchtemplateinsumo" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsinsumo));
 BA.debugLineNum = 806;BA.debugLine="j.Release";
Debug.ShouldStop(32);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,703);
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
RemoteObject _itemsriego = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _cdgo_tipo_riego = RemoteObject.createImmutable("");
RemoteObject _dscrpcion_tipo_riego = RemoteObject.createImmutable("");
RemoteObject group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxRiego (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,703);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 705;BA.debugLine="Dim ItemsRiego As List";
Debug.ShouldStop(1);
_itemsriego = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsRiego", _itemsriego);
 BA.debugLineNum = 706;BA.debugLine="ItemsRiego.Initialize";
Debug.ShouldStop(2);
_itemsriego.runVoidMethod ("Initialize");
 BA.debugLineNum = 707;BA.debugLine="ItemsRiego.Add(\"Seleccionar:\")";
Debug.ShouldStop(4);
_itemsriego.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 709;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 710;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 712;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
Debug.ShouldStop(128);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoRiego")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 713;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 714;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 715;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1024);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 716;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxriego"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 717;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4096);
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
 BA.debugLineNum = 718;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
Debug.ShouldStop(8192);
_cdgo_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);Debug.locals.put("Cdgo_Tipo_Riego", _cdgo_tipo_riego);
 BA.debugLineNum = 719;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
Debug.ShouldStop(16384);
_dscrpcion_tipo_riego = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);Debug.locals.put("Dscrpcion_Tipo_Riego", _dscrpcion_tipo_riego);
 BA.debugLineNum = 720;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
Debug.ShouldStop(32768);
__ref.getField(false,"_sd_xcomboboxtiporiego" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_dscrpcion_tipo_riego),(Object)((_cdgo_tipo_riego)));
 BA.debugLineNum = 721;BA.debugLine="ItemsRiego.Add(Cdgo_Tipo_Riego&\":\"&Dscrpcion_Ti";
Debug.ShouldStop(65536);
_itemsriego.runVoidMethod ("Add",(Object)((RemoteObject.concat(_cdgo_tipo_riego,RemoteObject.createImmutable(":"),_dscrpcion_tipo_riego))));
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
 BA.debugLineNum = 724;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","35963797",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 726;BA.debugLine="SearchTemplateRiego.SetItems(ItemsRiego)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_searchtemplateriego" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsriego));
 BA.debugLineNum = 727;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 729;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,731);
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
RemoteObject _itemslabranza = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _itemsvariedad = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
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
RemoteObject group14;
int index14;
int groupLen14;
RemoteObject group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("LlenarComboBoxSiembra (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,731);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 733;BA.debugLine="Dim ItemsLabranza As List";
Debug.ShouldStop(268435456);
_itemslabranza = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsLabranza", _itemslabranza);
 BA.debugLineNum = 734;BA.debugLine="ItemsLabranza.Initialize";
Debug.ShouldStop(536870912);
_itemslabranza.runVoidMethod ("Initialize");
 BA.debugLineNum = 735;BA.debugLine="ItemsLabranza.Add(\"Seleccionar:\")";
Debug.ShouldStop(1073741824);
_itemslabranza.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 737;BA.debugLine="Dim ItemsVariedad As List";
Debug.ShouldStop(1);
_itemsvariedad = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsVariedad", _itemsvariedad);
 BA.debugLineNum = 738;BA.debugLine="ItemsVariedad.Initialize";
Debug.ShouldStop(2);
_itemsvariedad.runVoidMethod ("Initialize");
 BA.debugLineNum = 739;BA.debugLine="ItemsVariedad.Add(\"Seleccionar:\")";
Debug.ShouldStop(4);
_itemsvariedad.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 741;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(16);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 742;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(32);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 745;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
Debug.ShouldStop(256);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_codVariedad")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 746;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 747;BA.debugLine="If j.Success Then";
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
 BA.debugLineNum = 748;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 749;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 750;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(8192);
if (true) break;

case 4:
//for
this.state = 7;
group14 = _res.getField(false,"Rows" /*RemoteObject*/ );
index14 = 0;
groupLen14 = group14.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_row = (group14.runMethod(false,"Get",index14));Debug.locals.put("row", _row);}
if (true) break;

case 24:
//C
this.state = 23;
index14++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 24;
 BA.debugLineNum = 751;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
Debug.ShouldStop(16384);
_cdgo_variedad = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);Debug.locals.put("Cdgo_Variedad", _cdgo_variedad);
 BA.debugLineNum = 752;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
Debug.ShouldStop(32768);
__ref.getField(false,"_sd_xcomboboxcodigovariedad" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_cdgo_variedad),(Object)((_cdgo_variedad)));
 BA.debugLineNum = 753;BA.debugLine="ItemsVariedad.Add(Cdgo_Variedad)";
Debug.ShouldStop(65536);
_itemsvariedad.runVoidMethod ("Add",(Object)((_cdgo_variedad)));
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
 BA.debugLineNum = 756;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","36029337",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 758;BA.debugLine="SearchTemplateVariedad.SetItems(ItemsVariedad)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_searchtemplatevariedad" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemsvariedad));
 BA.debugLineNum = 759;BA.debugLine="j.Release";
Debug.ShouldStop(4194304);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 763;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
Debug.ShouldStop(67108864);
_cmdtipolabranza = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_tipoLabranza")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);Debug.locals.put("cmdTipoLabranza", _cmdtipolabranza);
 BA.debugLineNum = 764;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdtipolabranza),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 765;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(268435456);
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
 BA.debugLineNum = 766;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_TipoLabranza")));
 BA.debugLineNum = 767;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","req_tipolabranza_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "llenarcomboboxsiembra"), (_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resTipoLabranza", _restipolabranza);
;
 BA.debugLineNum = 768;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
Debug.ShouldStop(-2147483648);
if (true) break;

case 14:
//for
this.state = 17;
group29 = _restipolabranza.getField(false,"Rows" /*RemoteObject*/ );
index29 = 0;
groupLen29 = group29.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowTipoLabranza", _rowtipolabranza);
this.state = 27;
if (true) break;

case 27:
//C
this.state = 17;
if (index29 < groupLen29) {
this.state = 16;
_rowtipolabranza = (group29.runMethod(false,"Get",index29));Debug.locals.put("rowTipoLabranza", _rowtipolabranza);}
if (true) break;

case 28:
//C
this.state = 27;
index29++;
Debug.locals.put("rowTipoLabranza", _rowtipolabranza);
if (true) break;

case 16:
//C
this.state = 28;
 BA.debugLineNum = 769;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
Debug.ShouldStop(1);
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);Debug.locals.put("Cdgo_Tipo_Labranza", _cdgo_tipo_labranza);
 BA.debugLineNum = 770;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
Debug.ShouldStop(2);
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);Debug.locals.put("Dscrpcion_Tipo_Labranza", _dscrpcion_tipo_labranza);
 BA.debugLineNum = 771;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
Debug.ShouldStop(4);
__ref.getField(false,"_sd_xcomboboxtipolabranza" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(_dscrpcion_tipo_labranza),(Object)((_cdgo_tipo_labranza)));
 BA.debugLineNum = 772;BA.debugLine="ItemsLabranza.Add(Cdgo_Variedad&\":\"&Dscrpcion_T";
Debug.ShouldStop(8);
_itemslabranza.runVoidMethod ("Add",(Object)((RemoteObject.concat(_cdgo_variedad,RemoteObject.createImmutable(":"),_dscrpcion_tipo_labranza))));
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
 BA.debugLineNum = 775;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","36029356",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de Tipo_Labranza: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 BA.debugLineNum = 777;BA.debugLine="SearchTemplateTipoLabranza.SetItems(ItemsLabranza";
Debug.ShouldStop(256);
__ref.getField(false,"_searchtemplatetipolabranza" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemslabranza));
 BA.debugLineNum = 778;BA.debugLine="j4.Release";
Debug.ShouldStop(512);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 780;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("RemoveForm0IfExists (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,617);
if (RapidSub.canDelegate("removeform0ifexists")) { return __ref.runUserSub(false, "formlabores","removeform0ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 617;BA.debugLine="Private Sub RemoveForm0IfExists";
Debug.ShouldStop(256);
 BA.debugLineNum = 619;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(1024);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 620;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form0")))) { 
 BA.debugLineNum = 621;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(4096);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 622;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(8192);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 625;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("RemoveForm2IfExists (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,628);
if (RapidSub.canDelegate("removeform2ifexists")) { return __ref.runUserSub(false, "formlabores","removeform2ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 628;BA.debugLine="Private Sub RemoveForm2IfExists";
Debug.ShouldStop(524288);
 BA.debugLineNum = 630;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(2097152);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 631;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form2")))) { 
 BA.debugLineNum = 632;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 633;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(16777216);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 636;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("RemoveForm3IfExists (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("removeform3ifexists")) { return __ref.runUserSub(false, "formlabores","removeform3ifexists", __ref);}
int _i = 0;
 BA.debugLineNum = 638;BA.debugLine="Private Sub RemoveForm3IfExists";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 640;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(true,"_getsize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 641;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runMethod(false,"_getvalue",(Object)(BA.numberCast(int.class, _i))),RemoteObject.createImmutable(("form3")))) { 
 BA.debugLineNum = 642;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
Debug.ShouldStop(2);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 643;BA.debugLine="Exit ' Salir después de eliminar el elemento";
Debug.ShouldStop(4);
if (true) break;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("RemoveInsumoFromData (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,865);
if (RapidSub.canDelegate("removeinsumofromdata")) { return __ref.runUserSub(false, "formlabores","removeinsumofromdata", __ref, _insumoid);}
int _i = 0;
RemoteObject _arrayelement = null;
Debug.locals.put("insumoID", _insumoid);
 BA.debugLineNum = 865;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
Debug.ShouldStop(1);
 BA.debugLineNum = 867;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
Debug.ShouldStop(4);
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 869;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
Debug.ShouldStop(16);
_arrayelement = (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("arrayElement", _arrayelement);Debug.locals.put("arrayElement", _arrayelement);
 BA.debugLineNum = 872;BA.debugLine="If arrayElement(0) = insumoID Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_arrayelement.getArrayElement(false,BA.numberCast(int.class, 0)),(_insumoid))) { 
 BA.debugLineNum = 874;BA.debugLine="data.RemoveAt(i)";
Debug.ShouldStop(512);
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 875;BA.debugLine="B4XTable1.SetData(data)";
Debug.ShouldStop(1024);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_setdata" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_data" /*RemoteObject*/ )));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 879;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("SD_xComboBoxCodigoVariedad_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,649);
if (RapidSub.canDelegate("sd_xcomboboxcodigovariedad_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxcodigovariedad_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 649;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
Debug.ShouldStop(256);
 BA.debugLineNum = 650;BA.debugLine="codigoSiembra = Value";
Debug.ShouldStop(512);
__ref.setField ("_codigosiembra" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 652;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
Debug.ShouldStop(2048);
formlabores.__c.runVoidMethod ("LogImpl","35439491",RemoteObject.concat(RemoteObject.createImmutable("codigo "),__ref.getField(true,"_codigosiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("SD_xComboBoxElemento_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("sd_xcomboboxelemento_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxelemento_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 516;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
Debug.ShouldStop(8);
 BA.debugLineNum = 519;BA.debugLine="elementoGasto = Value";
Debug.ShouldStop(64);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 522;BA.debugLine="If elementoGasto.Length > 0 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_elementogasto" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 523;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, Min(";
Debug.ShouldStop(1024);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,__ref.getField(true,"_elementogasto" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, formlabores.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, 2)),(Object)(BA.numberCast(double.class, __ref.getField(true,"_elementogasto" /*RemoteObject*/ ).runMethod(true,"length"))))))));
 }else {
 BA.debugLineNum = 525;BA.debugLine="elementoGasto = \"\" ' Si está vacío, asignar cade";
Debug.ShouldStop(4096);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,BA.ObjectToString(""));
 };
 BA.debugLineNum = 529;BA.debugLine="Log(\"Las dos primeras letras (o menos si no hay s";
Debug.ShouldStop(65536);
formlabores.__c.runVoidMethod ("LogImpl","34718605",RemoteObject.concat(RemoteObject.createImmutable("Las dos primeras letras (o menos si no hay suficientes): "),__ref.getField(true,"_elementogasto" /*RemoteObject*/ )),0);
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,466);
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
RemoteObject group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,466);
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
 BA.debugLineNum = 467;BA.debugLine="haciendaCBX=Value";
Debug.ShouldStop(262144);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 469;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1048576);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 470;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 471;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(4194304);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 474;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 477;BA.debugLine="If j.Success Then";
Debug.ShouldStop(268435456);
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
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 484;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(8);
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
 BA.debugLineNum = 485;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(16);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
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
 BA.debugLineNum = 493;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","34522011",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 497;BA.debugLine="j.Release";
Debug.ShouldStop(65536);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 500;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
Debug.ShouldStop(524288);
parent.__c.runVoidMethod ("LogImpl","34522018",RemoteObject.concat(RemoteObject.createImmutable("Hacienda"),__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 501;BA.debugLine="End Sub";
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
public static RemoteObject  _sd_xcomboboxinsumo_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxInsumo_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,810);
if (RapidSub.canDelegate("sd_xcomboboxinsumo_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxinsumo_itemclick", __ref, _position, _value);}
RemoteObject _partes = null;
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 810;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
Debug.ShouldStop(512);
 BA.debugLineNum = 811;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
Debug.ShouldStop(1024);
_partes = formlabores.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" - ")),(Object)(BA.ObjectToString(_value)));Debug.locals.put("partes", _partes);Debug.locals.put("partes", _partes);
 BA.debugLineNum = 812;BA.debugLine="NAMEINSUMO = partes(0)";
Debug.ShouldStop(2048);
__ref.setField ("_nameinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 813;BA.debugLine="IDINSUMO = partes(1)";
Debug.ShouldStop(4096);
__ref.setField ("_idinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 814;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,509);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 509;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 511;BA.debugLine="elementoLabor = Value";
Debug.ShouldStop(1073741824);
__ref.setField ("_elementolabor" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 513;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
Debug.ShouldStop(1);
formlabores.__c.runVoidMethod ("LogImpl","34653060",RemoteObject.concat(RemoteObject.createImmutable("Elemento labor"),__ref.getField(true,"_elementolabor" /*RemoteObject*/ )),0);
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 503;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 505;BA.debugLine="loteCBX = Value";
Debug.ShouldStop(16777216);
__ref.setField ("_lotecbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 506;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
Debug.ShouldStop(33554432);
formlabores.__c.runVoidMethod ("LogImpl","34587523",RemoteObject.concat(RemoteObject.createImmutable("Lotecbx"),__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 507;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,429);
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
		Debug.PushSubsStack("SD_xComboBoxNit_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,429);
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
 BA.debugLineNum = 430;BA.debugLine="nitEmpresaCBX=Value";
Debug.ShouldStop(8192);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 432;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(32768);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 433;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(65536);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 434;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(131072);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 437;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 440;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 442;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(33554432);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 443;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 447;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1073741824);
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
 BA.debugLineNum = 448;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(-2147483648);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 449;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(1);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
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
 BA.debugLineNum = 457;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","34456476",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 460;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 463;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","34456482",RemoteObject.concat(RemoteObject.createImmutable("Nit seleccionado"),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("SD_xComboBoxTipoLabranza_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,681);
if (RapidSub.canDelegate("sd_xcomboboxtipolabranza_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtipolabranza_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 681;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
Debug.ShouldStop(256);
 BA.debugLineNum = 683;BA.debugLine="tipoLabranzaSiembra = Value";
Debug.ShouldStop(1024);
__ref.setField ("_tipolabranzasiembra" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 685;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
Debug.ShouldStop(4096);
formlabores.__c.runVoidMethod ("LogImpl","35767172",RemoteObject.concat(RemoteObject.createImmutable("tipo labranza "),__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ )),0);
 BA.debugLineNum = 686;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("SD_xComboBoxTipoRiego_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,609);
if (RapidSub.canDelegate("sd_xcomboboxtiporiego_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtiporiego_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 609;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
Debug.ShouldStop(1);
 BA.debugLineNum = 610;BA.debugLine="tipoRiego = Value";
Debug.ShouldStop(2);
__ref.setField ("_tiporiego" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 612;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
Debug.ShouldStop(8);
formlabores.__c.runVoidMethod ("LogImpl","35177347",RemoteObject.concat(RemoteObject.createImmutable("tipo riego"),__ref.getField(true,"_tiporiego" /*RemoteObject*/ )),0);
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
public static RemoteObject  _sd_xcomboboxtypeform_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxTypeForm_ItemClick (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,548);
if (RapidSub.canDelegate("sd_xcomboboxtypeform_itemclick")) { return __ref.runUserSub(false, "formlabores","sd_xcomboboxtypeform_itemclick", __ref, _position, _value);}
RemoteObject _insumocolum = RemoteObject.declareNull("b4a.example.ef.b4xtable._b4xtablecolumn");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 548;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
Debug.ShouldStop(8);
 BA.debugLineNum = 550;BA.debugLine="tipoLabor = Value";
Debug.ShouldStop(32);
__ref.setField ("_tipolabor" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 552;BA.debugLine="If IsNumber(Value) Then";
Debug.ShouldStop(128);
if (formlabores.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_value))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 553;BA.debugLine="Select Case Value";
Debug.ShouldStop(256);
switch (BA.switchObjectToInt(_value,RemoteObject.createImmutable((0)),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((2)))) {
case 0: {
 BA.debugLineNum = 555;BA.debugLine="RemoveForm2IfExists";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 556;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 557;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
Debug.ShouldStop(4096);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createiteminsumo" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form0"))));
 BA.debugLineNum = 558;BA.debugLine="LlenarComboBoxInsumo";
Debug.ShouldStop(8192);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxinsumo" /*void*/ );
 BA.debugLineNum = 559;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
Debug.ShouldStop(16384);
_insumocolum = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("#")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_numbers" /*RemoteObject*/ )));Debug.locals.put("INSUMOCOLUM", _insumocolum);Debug.locals.put("INSUMOCOLUM", _insumocolum);
 BA.debugLineNum = 560;BA.debugLine="INSUMOCOLUM.Width = 50dip";
Debug.ShouldStop(32768);
_insumocolum.setField ("Width" /*RemoteObject*/ ,formlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 561;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
Debug.ShouldStop(65536);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ID")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 562;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
Debug.ShouldStop(131072);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NOMBRE")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 563;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
Debug.ShouldStop(262144);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("CANTIDAD")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 565;BA.debugLine="cantidadInsumos = 0";
Debug.ShouldStop(1048576);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 566;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(2097152);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 567;BA.debugLine="CANTINSUMO = \"\"";
Debug.ShouldStop(4194304);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,BA.ObjectToString(""));
 break; }
case 1: {
 BA.debugLineNum = 569;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 570;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 571;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
Debug.ShouldStop(67108864);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemsiembra" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form3"))));
 BA.debugLineNum = 572;BA.debugLine="LlenarComboBoxSiembra";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxsiembra" /*void*/ );
 break; }
case 2: {
 BA.debugLineNum = 574;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 575;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 576;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemriego" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form2"))));
 BA.debugLineNum = 577;BA.debugLine="LlenarComboBoxRiego";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxriego" /*void*/ );
 break; }
default: {
 BA.debugLineNum = 580;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
Debug.ShouldStop(8);
formlabores.__c.runVoidMethod ("LogImpl","34915232",RemoteObject.concat(RemoteObject.createImmutable("Valor no reconocido: "),_value),0);
 break; }
}
;
 }else {
 BA.debugLineNum = 583;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
Debug.ShouldStop(64);
formlabores.__c.runVoidMethod ("LogImpl","34915235",RemoteObject.createImmutable("Error: Value no es un número válido."),0);
 };
 BA.debugLineNum = 586;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
Debug.ShouldStop(512);
formlabores.__c.runVoidMethod ("LogImpl","34915238",RemoteObject.concat(RemoteObject.createImmutable("Tipo labor "),__ref.getField(true,"_tipolabor" /*RemoteObject*/ )),0);
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
public static void  _swiftbuttonelemento_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonElemento_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1342);
if (RapidSub.canDelegate("swiftbuttonelemento_click")) { __ref.runUserSub(false, "formlabores","swiftbuttonelemento_click", __ref); return;}
ResumableSub_SwiftButtonElemento_Click rsub = new ResumableSub_SwiftButtonElemento_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonElemento_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonElemento_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonElemento_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1342);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1343;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateEleme";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonelemento_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplateelemento" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1345;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(1);
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1346;BA.debugLine="SwiftButtonElemento.xLBL.Text = SearchTemplateEl";
Debug.ShouldStop(2);
__ref.getField(false,"_swiftbuttonelemento" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplateelemento" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1347;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(4);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplateelemento" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1348;BA.debugLine="elementoGasto = Partes(0) ' Asignar solo la prim";
Debug.ShouldStop(8);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1351;BA.debugLine="If elementoGasto.Length >= 2 Then";
Debug.ShouldStop(64);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_elementogasto" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 1352;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, 2)";
Debug.ShouldStop(128);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,__ref.getField(true,"_elementogasto" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 1355;BA.debugLine="elementoGasto = elementoGasto";
Debug.ShouldStop(1024);
__ref.setField ("_elementogasto" /*RemoteObject*/ ,__ref.getField(true,"_elementogasto" /*RemoteObject*/ ));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1358;BA.debugLine="Log(elementoGasto)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","37077904",__ref.getField(true,"_elementogasto" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1359;BA.debugLine="End Sub";
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
public static void  _complete(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static void  _swiftbuttonhacienda_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonHacienda_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1268);
if (RapidSub.canDelegate("swiftbuttonhacienda_click")) { __ref.runUserSub(false, "formlabores","swiftbuttonhacienda_click", __ref); return;}
ResumableSub_SwiftButtonHacienda_Click rsub = new ResumableSub_SwiftButtonHacienda_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonHacienda_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _itemslote = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _haciendacompleto = RemoteObject.createImmutable("");
RemoteObject _partes = null;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonHacienda_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1268);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1269;BA.debugLine="Dim ItemsLote As List";
Debug.ShouldStop(1048576);
_itemslote = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsLote", _itemslote);
 BA.debugLineNum = 1270;BA.debugLine="ItemsLote.Initialize";
Debug.ShouldStop(2097152);
_itemslote.runVoidMethod ("Initialize");
 BA.debugLineNum = 1272;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonhacienda_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1273;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1274;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
Debug.ShouldStop(33554432);
__ref.getField(false,"_swiftbuttonhacienda" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1275;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
Debug.ShouldStop(67108864);
_haciendacompleto = __ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("HACIENDACOMPLETO", _haciendacompleto);Debug.locals.put("HACIENDACOMPLETO", _haciendacompleto);
 BA.debugLineNum = 1276;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
Debug.ShouldStop(134217728);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_haciendacompleto));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1277;BA.debugLine="haciendaCBX = Partes(0)";
Debug.ShouldStop(268435456);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1278;BA.debugLine="ItemsLote.Clear";
Debug.ShouldStop(536870912);
_itemslote.runVoidMethod ("Clear");
 BA.debugLineNum = 1279;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
Debug.ShouldStop(1073741824);
_itemslote.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 1280;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_swiftbuttonlote" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1282;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(2);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 1283;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
Debug.ShouldStop(4);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 1284;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
Debug.ShouldStop(8);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1287;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonhacienda_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1290;BA.debugLine="If j.Success Then";
Debug.ShouldStop(512);
if (true) break;

case 4:
//if
this.state = 13;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1292;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 1293;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonhacienda_click"), (_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1297;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(65536);
if (true) break;

case 7:
//for
this.state = 10;
group19 = _res.getField(false,"Rows" /*RemoteObject*/ );
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_row = (group19.runMethod(false,"Get",index19));Debug.locals.put("row", _row);}
if (true) break;

case 19:
//C
this.state = 18;
index19++;
Debug.locals.put("row", _row);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 1298;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(131072);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 1302;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
Debug.ShouldStop(2097152);
_itemslote.runVoidMethod ("Add",(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("row", _row);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1307;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","36881319",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 1309;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemslote));
 BA.debugLineNum = 1310;BA.debugLine="SwiftButtonLote.Enabled = True";
Debug.ShouldStop(536870912);
__ref.getField(false,"_swiftbuttonlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.swiftbutton.class, "_setenabled" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1311;BA.debugLine="Log(haciendaCBX)";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","36881323",__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1313;BA.debugLine="j.Release";
Debug.ShouldStop(1);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1316;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static void  _swiftbuttoninsumo_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1405);
if (RapidSub.canDelegate("swiftbuttoninsumo_click")) { __ref.runUserSub(false, "formlabores","swiftbuttoninsumo_click", __ref); return;}
ResumableSub_SwiftButtonInsumo_Click rsub = new ResumableSub_SwiftButtonInsumo_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonInsumo_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonInsumo_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _insumocompleto = RemoteObject.createImmutable("");
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonInsumo_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1405);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1406;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateInsum";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttoninsumo_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplateinsumo" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1407;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1408;BA.debugLine="SwiftButtonInsumo.xLBL.Text = SearchTemplateInsu";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_swiftbuttoninsumo" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplateinsumo" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1409;BA.debugLine="Dim INSUMOCOMPLETO As String = SearchTemplateIns";
Debug.ShouldStop(1);
_insumocompleto = __ref.getField(false,"_searchtemplateinsumo" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("INSUMOCOMPLETO", _insumocompleto);Debug.locals.put("INSUMOCOMPLETO", _insumocompleto);
 BA.debugLineNum = 1410;BA.debugLine="Dim partes() As String = Regex.Split(\":\", INSUMO";
Debug.ShouldStop(2);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_insumocompleto));Debug.locals.put("partes", _partes);Debug.locals.put("partes", _partes);
 BA.debugLineNum = 1411;BA.debugLine="NAMEINSUMO = partes(1)";
Debug.ShouldStop(4);
__ref.setField ("_nameinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 1)));
 BA.debugLineNum = 1412;BA.debugLine="IDINSUMO = partes(0)";
Debug.ShouldStop(8);
__ref.setField ("_idinsumo" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1414;BA.debugLine="Log(IDINSUMO)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("LogImpl","37208969",__ref.getField(true,"_idinsumo" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1415;BA.debugLine="End Sub";
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
public static void  _swiftbuttonlabor_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLabor_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1330);
if (RapidSub.canDelegate("swiftbuttonlabor_click")) { __ref.runUserSub(false, "formlabores","swiftbuttonlabor_click", __ref); return;}
ResumableSub_SwiftButtonLabor_Click rsub = new ResumableSub_SwiftButtonLabor_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonLabor_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLabor_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1330);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1331;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonlabor_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1333;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1334;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
Debug.ShouldStop(2097152);
__ref.getField(false,"_swiftbuttonlabor" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1335;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(4194304);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplatelabor" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1336;BA.debugLine="elementoLabor = Partes(0) ' Asignar solo la prim";
Debug.ShouldStop(8388608);
__ref.setField ("_elementolabor" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1338;BA.debugLine="Log(elementoLabor)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","37012360",__ref.getField(true,"_elementolabor" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1339;BA.debugLine="End Sub";
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
public static void  _swiftbuttonlote_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLote_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1318);
if (RapidSub.canDelegate("swiftbuttonlote_click")) { __ref.runUserSub(false, "formlabores","swiftbuttonlote_click", __ref); return;}
ResumableSub_SwiftButtonLote_Click rsub = new ResumableSub_SwiftButtonLote_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonLote_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonLote_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1318);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1319;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonlote_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1321;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(256);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1322;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
Debug.ShouldStop(512);
__ref.getField(false,"_swiftbuttonlote" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1323;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(1024);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplatelote" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1324;BA.debugLine="loteCBX = Partes(0) ' Asignar solo la primera pa";
Debug.ShouldStop(2048);
__ref.setField ("_lotecbx" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1327;BA.debugLine="Log(loteCBX)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","36946825",__ref.getField(true,"_lotecbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1328;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static void  _swiftbuttonnit_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonNit_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1217);
if (RapidSub.canDelegate("swiftbuttonnit_click")) { __ref.runUserSub(false, "formlabores","swiftbuttonnit_click", __ref); return;}
ResumableSub_SwiftButtonNit_Click rsub = new ResumableSub_SwiftButtonNit_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonNit_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _itemshacienda = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _nitcompleto = RemoteObject.createImmutable("");
RemoteObject _partes = null;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda = RemoteObject.createImmutable("");
RemoteObject group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonNit_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1217);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1218;BA.debugLine="Dim ItemsHacienda As List";
Debug.ShouldStop(2);
_itemshacienda = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ItemsHacienda", _itemshacienda);
 BA.debugLineNum = 1219;BA.debugLine="ItemsHacienda.Initialize";
Debug.ShouldStop(4);
_itemshacienda.runVoidMethod ("Initialize");
 BA.debugLineNum = 1220;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonnit_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1221;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1222;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
Debug.ShouldStop(32);
__ref.getField(false,"_swiftbuttonnit" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1223;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
Debug.ShouldStop(64);
_nitcompleto = __ref.getField(false,"_searchtemplatenit" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("NITCOMPLETO", _nitcompleto);Debug.locals.put("NITCOMPLETO", _nitcompleto);
 BA.debugLineNum = 1224;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
Debug.ShouldStop(128);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_nitcompleto));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1225;BA.debugLine="nitEmpresaCBX = Partes(0)";
Debug.ShouldStop(256);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1226;BA.debugLine="ItemsHacienda.Clear";
Debug.ShouldStop(512);
_itemshacienda.runVoidMethod ("Clear");
 BA.debugLineNum = 1227;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
Debug.ShouldStop(1024);
_itemshacienda.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Seleccionar:"))));
 BA.debugLineNum = 1228;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
Debug.ShouldStop(2048);
__ref.getField(false,"_swiftbuttonhacienda" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1230;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(8192);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 1231;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
Debug.ShouldStop(16384);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 1232;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
Debug.ShouldStop(32768);
_cmd = __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 1235;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonnit_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 1238;BA.debugLine="If j.Success Then";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//if
this.state = 13;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1240;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(8388608);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 1241;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonnit_click"), (_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 1245;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//for
this.state = 10;
group19 = _res.getField(false,"Rows" /*RemoteObject*/ );
index19 = 0;
groupLen19 = group19.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_row = (group19.runMethod(false,"Get",index19));Debug.locals.put("row", _row);}
if (true) break;

case 19:
//C
this.state = 18;
index19++;
Debug.locals.put("row", _row);
if (true) break;

case 9:
//C
this.state = 19;
 BA.debugLineNum = 1246;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(536870912);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 1247;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(1073741824);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 1252;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
Debug.ShouldStop(8);
_itemshacienda.runVoidMethod ("Add",(Object)((RemoteObject.concat(_codg_hacienda,RemoteObject.createImmutable(":"),_nombrehacienda))));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
Debug.locals.put("row", _row);
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1257;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("LogImpl","36815784",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 BA.debugLineNum = 1259;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
Debug.ShouldStop(1024);
__ref.getField(false,"_searchtemplatehacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xsearchtemplate.class, "_setitems" /*RemoteObject*/ ,(Object)(_itemshacienda));
 BA.debugLineNum = 1260;BA.debugLine="SwiftButtonHacienda.Enabled = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_swiftbuttonhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.swiftbutton.class, "_setenabled" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 1261;BA.debugLine="Log(nitEmpresaCBX)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","36815788",__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1263;BA.debugLine="j.Release";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1266;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _swiftbuttonriego_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonRiego_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1417);
if (RapidSub.canDelegate("swiftbuttonriego_click")) { __ref.runUserSub(false, "formlabores","swiftbuttonriego_click", __ref); return;}
ResumableSub_SwiftButtonRiego_Click rsub = new ResumableSub_SwiftButtonRiego_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonRiego_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonRiego_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonRiego_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1417);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1418;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateRiego";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonriego_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplateriego" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1420;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1421;BA.debugLine="SwiftButtonRiego.xLBL.Text = SearchTemplateRiego";
Debug.ShouldStop(4096);
__ref.getField(false,"_swiftbuttonriego" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplateriego" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1422;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(8192);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplateriego" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1423;BA.debugLine="tipoRiego = Partes(0) ' Asignar solo la primera";
Debug.ShouldStop(16384);
__ref.setField ("_tiporiego" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1425;BA.debugLine="Log(tipoRiego)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","37274504",__ref.getField(true,"_tiporiego" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1426;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
public static void  _swiftbuttontipolabranza_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonTipoLabranza_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1429);
if (RapidSub.canDelegate("swiftbuttontipolabranza_click")) { __ref.runUserSub(false, "formlabores","swiftbuttontipolabranza_click", __ref); return;}
ResumableSub_SwiftButtonTipoLabranza_Click rsub = new ResumableSub_SwiftButtonTipoLabranza_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonTipoLabranza_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTipoLabranza_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonTipoLabranza_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1429);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1430;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTipoL";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttontipolabranza_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatetipolabranza" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1432;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1433;BA.debugLine="SwiftButtonTipoLabranza.xLBL.Text = SearchTempla";
Debug.ShouldStop(16777216);
__ref.getField(false,"_swiftbuttontipolabranza" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatetipolabranza" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1434;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(33554432);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplatetipolabranza" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1437;BA.debugLine="tipoLabranzaSiembra = Partes(0)";
Debug.ShouldStop(268435456);
__ref.setField ("_tipolabranzasiembra" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1438;BA.debugLine="If tipoLabranzaSiembra.Length >= 2 Then";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("g",__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 2))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1439;BA.debugLine="tipoLabranzaSiembra = tipoLabranzaSiembra.SubSt";
Debug.ShouldStop(1073741824);
__ref.setField ("_tipolabranzasiembra" /*RemoteObject*/ ,__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ ).runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ ).runMethod(true,"length"),RemoteObject.createImmutable(2)}, "-",1, 1))));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 1443;BA.debugLine="Log(tipoLabranzaSiembra)";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("LogImpl","37340046",__ref.getField(true,"_tipolabranzasiembra" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1444;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static void  _swiftbuttontypeform_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonTypeForm_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1362);
if (RapidSub.canDelegate("swiftbuttontypeform_click")) { __ref.runUserSub(false, "formlabores","swiftbuttontypeform_click", __ref); return;}
ResumableSub_SwiftButtonTypeForm_Click rsub = new ResumableSub_SwiftButtonTypeForm_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonTypeForm_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTypeForm_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _typeformcompleto = RemoteObject.createImmutable("");
RemoteObject _partes = null;
RemoteObject _tipoform = RemoteObject.createImmutable("");
RemoteObject _insumocolum = RemoteObject.declareNull("b4a.example.ef.b4xtable._b4xtablecolumn");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonTypeForm_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1362);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1363;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTypeF";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttontypeform_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatetypeform" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1364;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1365;BA.debugLine="SwiftButtonTypeForm.xLBL.Text = SearchTemplateTy";
Debug.ShouldStop(1048576);
__ref.getField(false,"_swiftbuttontypeform" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatetypeform" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1366;BA.debugLine="Dim TYPEFORMCOMPLETO As String = SearchTemplateT";
Debug.ShouldStop(2097152);
_typeformcompleto = __ref.getField(false,"_searchtemplatetypeform" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ );Debug.locals.put("TYPEFORMCOMPLETO", _typeformcompleto);Debug.locals.put("TYPEFORMCOMPLETO", _typeformcompleto);
 BA.debugLineNum = 1367;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", TYPEFO";
Debug.ShouldStop(4194304);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(_typeformcompleto));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1368;BA.debugLine="tipoLabor = Partes(0)";
Debug.ShouldStop(8388608);
__ref.setField ("_tipolabor" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 1369;BA.debugLine="Log(tipoLabor)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","37143431",__ref.getField(true,"_tipolabor" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1370;BA.debugLine="Dim tipoForm As String = Partes(0)";
Debug.ShouldStop(33554432);
_tipoform = _partes.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("tipoForm", _tipoform);Debug.locals.put("tipoForm", _tipoform);
 BA.debugLineNum = 1372;BA.debugLine="Select Case tipoForm";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//select
this.state = 13;
switch (BA.switchObjectToInt(_tipoform,BA.ObjectToString("0"),BA.ObjectToString("1"),BA.ObjectToString("2"))) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
case 2: {
this.state = 10;
if (true) break;
}
default: {
this.state = 12;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 13;
 BA.debugLineNum = 1374;BA.debugLine="RemoveForm2IfExists";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 1375;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 1376;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"form";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createiteminsumo" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form0"))));
 BA.debugLineNum = 1377;BA.debugLine="LlenarComboBoxInsumo";
Debug.ShouldStop(1);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxinsumo" /*void*/ );
 BA.debugLineNum = 1378;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.A";
Debug.ShouldStop(2);
_insumocolum = __ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("#")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_numbers" /*RemoteObject*/ )));Debug.locals.put("INSUMOCOLUM", _insumocolum);Debug.locals.put("INSUMOCOLUM", _insumocolum);
 BA.debugLineNum = 1379;BA.debugLine="INSUMOCOLUM.Width = 50dip";
Debug.ShouldStop(4);
_insumocolum.setField ("Width" /*RemoteObject*/ ,parent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 1380;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYPE";
Debug.ShouldStop(8);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ID")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1381;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN_";
Debug.ShouldStop(16);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("NOMBRE")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1382;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLUM";
Debug.ShouldStop(32);
__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xtable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(BA.ObjectToString("CANTIDAD")),(Object)(__ref.getField(false,"_b4xtable1" /*RemoteObject*/ ).getField(true,"_column_type_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1384;BA.debugLine="cantidadInsumos = 0";
Debug.ShouldStop(128);
__ref.setField ("_cantidadinsumos" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 1385;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
Debug.ShouldStop(256);
__ref.getField(false,"_labelcantidadinsumos" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_cantidadinsumos" /*RemoteObject*/ )));
 BA.debugLineNum = 1386;BA.debugLine="CANTINSUMO = \"\"";
Debug.ShouldStop(512);
__ref.setField ("_cantinsumo" /*RemoteObject*/ ,BA.ObjectToString(""));
 if (true) break;

case 8:
//C
this.state = 13;
 BA.debugLineNum = 1388;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 1389;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exist";
Debug.ShouldStop(4096);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform2ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 1390;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"for";
Debug.ShouldStop(8192);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemsiembra" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form3"))));
 BA.debugLineNum = 1391;BA.debugLine="LlenarComboBoxSiembra";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxsiembra" /*void*/ );
 if (true) break;

case 10:
//C
this.state = 13;
 BA.debugLineNum = 1393;BA.debugLine="RemoveForm0IfExists";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform0ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 1394;BA.debugLine="RemoveForm3IfExists";
Debug.ShouldStop(131072);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_removeform3ifexists" /*RemoteObject*/ );
 BA.debugLineNum = 1395;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"form";
Debug.ShouldStop(262144);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.formlabores.class, "_createitemriego" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("form2"))));
 BA.debugLineNum = 1396;BA.debugLine="LlenarComboBoxRiego";
Debug.ShouldStop(524288);
__ref.runClassMethod (b4a.example.ef.formlabores.class, "_llenarcomboboxriego" /*void*/ );
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 1399;BA.debugLine="Log(\"Valor no reconocido: \" & tipoForm)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","37143461",RemoteObject.concat(RemoteObject.createImmutable("Valor no reconocido: "),_tipoform),0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 1403;BA.debugLine="End Sub";
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
public static void  _swiftbuttonvariedad_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonVariedad_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1447);
if (RapidSub.canDelegate("swiftbuttonvariedad_click")) { __ref.runUserSub(false, "formlabores","swiftbuttonvariedad_click", __ref); return;}
ResumableSub_SwiftButtonVariedad_Click rsub = new ResumableSub_SwiftButtonVariedad_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SwiftButtonVariedad_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonVariedad_Click(b4a.example.ef.formlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formlabores parent;
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _partes = null;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SwiftButtonVariedad_Click (formlabores) ","formlabores",6,__ref.getField(false, "ba"),__ref,1447);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1448;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateVarie";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formlabores", "swiftbuttonvariedad_click"), __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.b4xdialog.class, "_showtemplate" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_searchtemplatevariedad" /*RemoteObject*/ ))),(Object)(RemoteObject.createImmutable((""))),(Object)(RemoteObject.createImmutable((""))),(Object)((RemoteObject.createImmutable("CANCEL")))));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 1450;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"DialogResponse_Positive")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1451;BA.debugLine="SwiftButtonVariedad.xLBL.Text = SearchTemplateVa";
Debug.ShouldStop(1024);
__ref.getField(false,"_swiftbuttonvariedad" /*RemoteObject*/ ).getField(false,"_xlbl" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(false,"_searchtemplatevariedad" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));
 BA.debugLineNum = 1452;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
Debug.ShouldStop(2048);
_partes = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(":")),(Object)(__ref.getField(false,"_searchtemplatevariedad" /*RemoteObject*/ ).getField(true,"_selecteditem" /*RemoteObject*/ )));Debug.locals.put("Partes", _partes);Debug.locals.put("Partes", _partes);
 BA.debugLineNum = 1453;BA.debugLine="codigoSiembra = Partes(0)";
Debug.ShouldStop(4096);
__ref.setField ("_codigosiembra" /*RemoteObject*/ ,_partes.getArrayElement(true,BA.numberCast(int.class, 0)));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 1455;BA.debugLine="Log(codigoSiembra)";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("LogImpl","37405576",__ref.getField(true,"_codigosiembra" /*RemoteObject*/ ),0);
 BA.debugLineNum = 1456;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
}