package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class formperson_subs_0 {


public static RemoteObject  _as_datepicker1_datechanged(RemoteObject __ref,RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_DateChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("as_datepicker1_datechanged")) { return __ref.runUserSub(false, "formperson","as_datepicker1_datechanged", __ref, _year, _month, _day);}
Debug.locals.put("Year", _year);
Debug.locals.put("Month", _month);
Debug.locals.put("Day", _day);
 BA.debugLineNum = 268;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
Debug.ShouldStop(2048);
 BA.debugLineNum = 270;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
Debug.ShouldStop(8192);
__ref.getField(false,"_label12hinicio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_day,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_year)));
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "formperson","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 253;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 255;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(1073741824);
_formatteddate = formperson.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 258;BA.debugLine="Label12Hinicio.Text = formattedDate";
Debug.ShouldStop(2);
__ref.getField(false,"_label12hinicio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 260;BA.debugLine="FechaInicio = formattedDate";
Debug.ShouldStop(8);
__ref.setField ("_fechainicio" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 262;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(32);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formperson.__c.getField(true,"False"));
 BA.debugLineNum = 265;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
Debug.ShouldStop(256);
formperson.__c.runVoidMethod ("LogImpl","327000844",RemoteObject.concat(RemoteObject.createImmutable("Fecha seleccionada: "),__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),0);
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _as_datepicker2_datechanged(RemoteObject __ref,RemoteObject _year,RemoteObject _month,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker2_DateChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,295);
if (RapidSub.canDelegate("as_datepicker2_datechanged")) { return __ref.runUserSub(false, "formperson","as_datepicker2_datechanged", __ref, _year, _month, _day);}
Debug.locals.put("Year", _year);
Debug.locals.put("Month", _month);
Debug.locals.put("Day", _day);
 BA.debugLineNum = 295;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
Debug.ShouldStop(64);
 BA.debugLineNum = 297;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
Debug.ShouldStop(256);
__ref.getField(false,"_label12hinicio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_day,RemoteObject.createImmutable("/"),_month,RemoteObject.createImmutable("/"),_year)));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("AS_DatePicker2_SelectedDateChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("as_datepicker2_selecteddatechanged")) { return __ref.runUserSub(false, "formperson","as_datepicker2_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
Debug.locals.put("Date", _date);
 BA.debugLineNum = 278;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 280;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(8388608);
_formatteddate = formperson.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 283;BA.debugLine="Label13Hfim.Text = formattedDate";
Debug.ShouldStop(67108864);
__ref.getField(false,"_label13hfim" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 285;BA.debugLine="FechaFin = formattedDate";
Debug.ShouldStop(268435456);
__ref.setField ("_fechafin" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 287;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
Debug.ShouldStop(1073741824);
formperson.__c.runVoidMethod ("LogImpl","327197449",RemoteObject.concat(RemoteObject.createImmutable("Fecha de fin"),__ref.getField(true,"_fechafin" /*RemoteObject*/ )),0);
 BA.debugLineNum = 289;BA.debugLine="Panel13.Visible = False";
Debug.ShouldStop(1);
__ref.getField(false,"_panel13" /*RemoteObject*/ ).runMethod(true,"setVisible",formperson.__c.getField(true,"False"));
 BA.debugLineNum = 292;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
Debug.ShouldStop(8);
formperson.__c.runVoidMethod ("LogImpl","327197454",RemoteObject.concat(RemoteObject.createImmutable("Fecha seleccionada: "),_formatteddate),0);
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("B4XPage_Appear (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "formperson","b4xpage_appear", __ref); return;}
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
public ResumableSub_B4XPage_Appear(b4a.example.ef.formperson parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _razonsocial = RemoteObject.createImmutable("");
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _cmdlabor = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j2 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reslabor = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowlabor = null;
RemoteObject _codigodestino = RemoteObject.createImmutable("");
RemoteObject _descripciondestino = RemoteObject.createImmutable("");
RemoteObject _cmdconcepto = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j3 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resconc = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowconcep = null;
RemoteObject _cod_concept = RemoteObject.createImmutable("");
RemoteObject _des_concept = RemoteObject.createImmutable("");
RemoteObject _dstjo_cncpto = RemoteObject.createImmutable("");
RemoteObject _j4 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _turno = RemoteObject.createImmutable("");
RemoteObject _des_turno = RemoteObject.createImmutable("");
RemoteObject group10;
int index10;
int groupLen10;
RemoteObject group25;
int index25;
int groupLen25;
RemoteObject group41;
int index41;
int groupLen41;
RemoteObject group58;
int index58;
int groupLen58;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,120);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 122;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
Debug.ShouldStop(33554432);
__ref.getField(false,"_label3name" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(((parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DetailsPerson"))))).getField(true,"_nameperson" /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sd_xcomboboxnitperson" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 127;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1073741824);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 128;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(-2147483648);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 129;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
Debug.ShouldStop(1);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 132;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 135;BA.debugLine="If j.Success Then";
Debug.ShouldStop(64);
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
 BA.debugLineNum = 137;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(256);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 138;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 141;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.getField(false,"Rows" /*RemoteObject*/ );
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 43;
if (true) break;

case 43:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 44:
//C
this.state = 43;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 44;
 BA.debugLineNum = 142;BA.debugLine="Dim razonSocial As String = row(0)";
Debug.ShouldStop(8192);
_razonsocial = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("razonSocial", _razonsocial);Debug.locals.put("razonSocial", _razonsocial);
 BA.debugLineNum = 143;BA.debugLine="Dim nit As String = row(1)";
Debug.ShouldStop(16384);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("nit", _nit);Debug.locals.put("nit", _nit);
 BA.debugLineNum = 145;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
Debug.ShouldStop(65536);
__ref.getField(false,"_sd_xcomboboxnitperson" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_razonsocial,RemoteObject.createImmutable(" - "),_nit)),(Object)((_nit)));
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
 BA.debugLineNum = 150;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","326869790",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de NITs: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 157;BA.debugLine="j.Release";
Debug.ShouldStop(268435456);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 160;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_sd_xcomboboxlabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 162;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
Debug.ShouldStop(2);
_cmdlabor = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labor")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdLabor", _cmdlabor);Debug.locals.put("cmdLabor", _cmdlabor);
 BA.debugLineNum = 163;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabor),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j2", _j2);
;
 BA.debugLineNum = 164;BA.debugLine="If j2.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 11:
//if
this.state = 20;
if (_j2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 165;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
Debug.ShouldStop(16);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j2),(Object)(RemoteObject.createImmutable("req_labor")));
 BA.debugLineNum = 166;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","req_labor_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLabor", _reslabor);
;
 BA.debugLineNum = 167;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
Debug.ShouldStop(64);
if (true) break;

case 14:
//for
this.state = 17;
group25 = _reslabor.getField(false,"Rows" /*RemoteObject*/ );
index25 = 0;
groupLen25 = group25.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowLabor", _rowlabor);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 17;
if (index25 < groupLen25) {
this.state = 16;
_rowlabor = (group25.runMethod(false,"Get",index25));Debug.locals.put("rowLabor", _rowlabor);}
if (true) break;

case 48:
//C
this.state = 47;
index25++;
Debug.locals.put("rowLabor", _rowlabor);
if (true) break;

case 16:
//C
this.state = 48;
 BA.debugLineNum = 168;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
Debug.ShouldStop(128);
_codigodestino = BA.ObjectToString(_rowlabor.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("codigoDestino", _codigodestino);Debug.locals.put("codigoDestino", _codigodestino);
 BA.debugLineNum = 169;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
Debug.ShouldStop(256);
_descripciondestino = BA.ObjectToString(_rowlabor.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("descripcionDestino", _descripciondestino);Debug.locals.put("descripcionDestino", _descripciondestino);
 BA.debugLineNum = 170;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino & \" -";
Debug.ShouldStop(512);
__ref.getField(false,"_sd_xcomboboxlabor" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_descripciondestino,RemoteObject.createImmutable(" - "),_codigodestino)),(Object)((_codigodestino)));
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
Debug.locals.put("rowLabor", _rowlabor);
;
 if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 173;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","326869813",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de destinos: "),_j2.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 BA.debugLineNum = 175;BA.debugLine="j2.Release";
Debug.ShouldStop(16384);
_j2.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
Debug.ShouldStop(524288);
__ref.getField(false,"_sd_xcomboboxconcepto" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 183;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
Debug.ShouldStop(4194304);
_cmdconcepto = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_concepto")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdConcepto", _cmdconcepto);Debug.locals.put("cmdConcepto", _cmdconcepto);
 BA.debugLineNum = 186;BA.debugLine="ConceptoDataMap.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_conceptodatamap" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 188;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdconcepto),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 191;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 21:
//if
this.state = 30;
if (_j3.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 193;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
Debug.ShouldStop(1);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_concept")));
 BA.debugLineNum = 194;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","req_concept_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resConc", _resconc);
;
 BA.debugLineNum = 197;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
Debug.ShouldStop(16);
if (true) break;

case 24:
//for
this.state = 27;
group41 = _resconc.getField(false,"Rows" /*RemoteObject*/ );
index41 = 0;
groupLen41 = group41.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowConcep", _rowconcep);
this.state = 51;
if (true) break;

case 51:
//C
this.state = 27;
if (index41 < groupLen41) {
this.state = 26;
_rowconcep = (group41.runMethod(false,"Get",index41));Debug.locals.put("rowConcep", _rowconcep);}
if (true) break;

case 52:
//C
this.state = 51;
index41++;
Debug.locals.put("rowConcep", _rowconcep);
if (true) break;

case 26:
//C
this.state = 52;
 BA.debugLineNum = 198;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
Debug.ShouldStop(32);
_cod_concept = BA.ObjectToString(_rowconcep.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Cod_Concept", _cod_concept);Debug.locals.put("Cod_Concept", _cod_concept);
 BA.debugLineNum = 199;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
Debug.ShouldStop(64);
_des_concept = BA.ObjectToString(_rowconcep.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Des_Concept", _des_concept);Debug.locals.put("Des_Concept", _des_concept);
 BA.debugLineNum = 200;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
Debug.ShouldStop(128);
_dstjo_cncpto = BA.ObjectToString(_rowconcep.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("dstjo_Cncpto", _dstjo_cncpto);Debug.locals.put("dstjo_Cncpto", _dstjo_cncpto);
 BA.debugLineNum = 203;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept & \" - \" &";
Debug.ShouldStop(1024);
__ref.getField(false,"_sd_xcomboboxconcepto" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_des_concept,RemoteObject.createImmutable(" - "),_cod_concept)),(Object)((_cod_concept)));
 BA.debugLineNum = 206;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
Debug.ShouldStop(8192);
__ref.getField(false,"_conceptodatamap" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_cod_concept)),(Object)((_dstjo_cncpto)));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
Debug.locals.put("rowConcep", _rowconcep);
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 210;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("LogImpl","326869850",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de conceptos: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 BA.debugLineNum = 214;BA.debugLine="j3.Release";
Debug.ShouldStop(2097152);
_j3.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 217;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_sd_xcomboboxturno" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 220;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
Debug.ShouldStop(134217728);
_cmdconcepto = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_turnos")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmdConcepto", _cmdconcepto);Debug.locals.put("cmdConcepto", _cmdconcepto);
 BA.debugLineNum = 223;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdconcepto),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 226;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(2);
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
 BA.debugLineNum = 228;BA.debugLine="Req.HandleJobAsync(j4, \"req_concept\")";
Debug.ShouldStop(8);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_concept")));
 BA.debugLineNum = 229;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","req_concept_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "b4xpage_appear"), (_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resconc = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resConc", _resconc);
;
 BA.debugLineNum = 232;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
Debug.ShouldStop(128);
if (true) break;

case 34:
//for
this.state = 37;
group58 = _resconc.getField(false,"Rows" /*RemoteObject*/ );
index58 = 0;
groupLen58 = group58.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowConcep", _rowconcep);
this.state = 55;
if (true) break;

case 55:
//C
this.state = 37;
if (index58 < groupLen58) {
this.state = 36;
_rowconcep = (group58.runMethod(false,"Get",index58));Debug.locals.put("rowConcep", _rowconcep);}
if (true) break;

case 56:
//C
this.state = 55;
index58++;
Debug.locals.put("rowConcep", _rowconcep);
if (true) break;

case 36:
//C
this.state = 56;
 BA.debugLineNum = 233;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
Debug.ShouldStop(256);
_turno = BA.ObjectToString(_rowconcep.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Turno", _turno);Debug.locals.put("Turno", _turno);
 BA.debugLineNum = 234;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
Debug.ShouldStop(512);
_des_turno = BA.ObjectToString(_rowconcep.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Des_Turno", _des_turno);Debug.locals.put("Des_Turno", _des_turno);
 BA.debugLineNum = 236;BA.debugLine="SD_xComboBoxTurno.Add(Turno & \" - \" , Des_Turno";
Debug.ShouldStop(2048);
__ref.getField(false,"_sd_xcomboboxturno" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_turno,RemoteObject.createImmutable(" - "))),(Object)((_des_turno)));
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
Debug.locals.put("rowConcep", _rowconcep);
;
 if (true) break;

case 39:
//C
this.state = 40;
 BA.debugLineNum = 240;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","326869880",RemoteObject.concat(RemoteObject.createImmutable("Error en la consulta de conceptos: "),_j4.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 40:
//C
this.state = -1;
;
 BA.debugLineNum = 244;BA.debugLine="j4.Release";
Debug.ShouldStop(524288);
_j4.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 246;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _req_labor_result(RemoteObject __ref,RemoteObject _reslabor) throws Exception{
}
public static void  _req_concept_result(RemoteObject __ref,RemoteObject _resconc) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "formperson","b4xpage_created", __ref, _root1);}
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _newsp = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
int _i = 0;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 79;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="Root = Root1";
Debug.ShouldStop(65536);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 83;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(262144);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 85;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
Debug.ShouldStop(1048576);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(formperson.__c.getField(false,"Colors").getField(true,"White")),(Object)(formperson.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 86;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("FomrPerson")),__ref.getField(false, "ba"));
 BA.debugLineNum = 87;BA.debugLine="ScrollView1.Panel.Height=1100dip";
Debug.ShouldStop(4194304);
__ref.getField(false,"_scrollview1" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethod(true,"setHeight",formperson.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1100))));
 BA.debugLineNum = 88;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_scrollview1" /*RemoteObject*/ ).runMethod(false,"getPanel").runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("ScrollUIPerson")),__ref.getField(false, "ba"));
 BA.debugLineNum = 90;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
Debug.ShouldStop(33554432);
__ref.getField(false,"_edittext3cantidat" /*RemoteObject*/ ).runVoidMethod ("setColor",formperson.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 91;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
Debug.ShouldStop(67108864);
__ref.getField(false,"_edittext1percentage" /*RemoteObject*/ ).runVoidMethod ("setColor",formperson.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 92;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
Debug.ShouldStop(134217728);
__ref.getField(false,"_edittext4obsv" /*RemoteObject*/ ).runVoidMethod ("setColor",formperson.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 93;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
Debug.ShouldStop(268435456);
__ref.getField(false,"_edittext2horas" /*RemoteObject*/ ).runVoidMethod ("setColor",formperson.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 96;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
Debug.ShouldStop(-2147483648);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group11 = __ref.getField(false,"_root" /*RemoteObject*/ ).runMethod(false,"GetAllViewsRecursive");
final int groupLen11 = group11.runMethod(true,"getSize").<Integer>get()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), group11.runMethod(false,"Get",index11));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 97;BA.debugLine="If v Is Spinner Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("i",_v.getObjectOrNull(), RemoteObject.createImmutable("anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner"))) { 
 BA.debugLineNum = 98;BA.debugLine="Dim newsp As Spinner=v";
Debug.ShouldStop(2);
_newsp = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
_newsp = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.SpinnerWrapper"), _v.getObject());Debug.locals.put("newsp", _newsp);Debug.locals.put("newsp", _newsp);
 BA.debugLineNum = 99;BA.debugLine="For i=1 To 16";
Debug.ShouldStop(4);
{
final int step14 = 1;
final int limit14 = 16;
_i = 1 ;
for (;(step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14) ;_i = ((int)(0 + _i + step14))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 100;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
Debug.ShouldStop(8);
_newsp.runVoidMethod ("AddAll",(Object)(formperson.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.concat(_v.runMethod(false,"getTag"),RemoteObject.createImmutable(" "),RemoteObject.createImmutable(_i))})))));
 }
}Debug.locals.put("i", _i);
;
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("Button1_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,739);
if (RapidSub.canDelegate("button1_click")) { __ref.runUserSub(false, "formperson","button1_click", __ref); return;}
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
public ResumableSub_Button1_Click(b4a.example.ef.formperson parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _matcher = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button1_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,739);
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
 BA.debugLineNum = 740;BA.debugLine="Dim id As String";
Debug.ShouldStop(8);
_id = RemoteObject.createImmutable("");Debug.locals.put("id", _id);
 BA.debugLineNum = 743;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
Debug.ShouldStop(64);
_id = ((parent._b4xpages.runMethod(false,"_getpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("DetailsPerson"))))).getField(true,"_nameperson" /*RemoteObject*/ );Debug.locals.put("id", _id);
 BA.debugLineNum = 746;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
Debug.ShouldStop(512);
_matcher = RemoteObject.createNew ("anywheresoftware.b4a.keywords.Regex.MatcherWrapper");
_matcher = parent.__c.getField(false,"Regex").runMethod(false,"Matcher",(Object)(BA.ObjectToString("\\#(.+)")),(Object)(_id));Debug.locals.put("matcher", _matcher);Debug.locals.put("matcher", _matcher);
 BA.debugLineNum = 748;BA.debugLine="If matcher.Find() Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 6;
if (_matcher.runMethod(true,"Find").<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 749;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
Debug.ShouldStop(4096);
_id = _matcher.runMethod(true,"Group",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("id", _id);
 BA.debugLineNum = 750;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","329556747",RemoteObject.concat(RemoteObject.createImmutable("ID: "),_id),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 752;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","329556749",RemoteObject.createImmutable("No se encontró el carácter # en la cadena."),0);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 756;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
Debug.ShouldStop(524288);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_searchPerson")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_id)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 760;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(8388608);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 761;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(16777216);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 764;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "button1_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 766;BA.debugLine="If j.Success Then";
Debug.ShouldStop(536870912);
if (true) break;

case 7:
//if
this.state = 30;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 29;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 769;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(1);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 770;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "button1_click"), (_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 772;BA.debugLine="If res.Rows.Size > 0 Then";
Debug.ShouldStop(8);
if (true) break;

case 10:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 774;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(32);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 775;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
Debug.ShouldStop(64);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 776;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
Debug.ShouldStop(128);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_Mvto_Trab_Propios")),(Object)(RemoteObject.createNewArray("Object",new int[] {13},new Object[] {(_id),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_laborcbx" /*RemoteObject*/ )),RemoteObject.createImmutable((0)),(__ref.getField(true,"_conceptocbx" /*RemoteObject*/ )),(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),(__ref.getField(true,"_horastext" /*RemoteObject*/ )),(__ref.getField(true,"_cantidadtext" /*RemoteObject*/ )),(__ref.getField(true,"_obsvtext" /*RemoteObject*/ )),(__ref.getField(true,"_turnocbx" /*RemoteObject*/ )),(__ref.getField(true,"_porcentagetext" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 777;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
Debug.ShouldStop(256);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 778;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "button1_click"), (_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 780;BA.debugLine="Try";
Debug.ShouldStop(2048);
if (true) break;

case 13:
//try
this.state = 18;
this.catchState = 17;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 17;
 BA.debugLineNum = 781;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 782;BA.debugLine="Log(\"Se han recuperado datos: propios \" & res.";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","329556779",RemoteObject.concat(RemoteObject.createImmutable("Se han recuperado datos: propios "),_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize")),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 BA.debugLineNum = 785;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","329556782",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 789;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1048576);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 790;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 791;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
Debug.ShouldStop(4194304);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("insert_Mvto_Trab_Tmprles")),(Object)(RemoteObject.createNewArray("Object",new int[] {13},new Object[] {(_id),(__ref.getField(true,"_fechainicio" /*RemoteObject*/ )),(__ref.getField(true,"_laborcbx" /*RemoteObject*/ )),RemoteObject.createImmutable((0)),(__ref.getField(true,"_conceptocbx" /*RemoteObject*/ )),(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ )),(__ref.getField(true,"_lotecbx" /*RemoteObject*/ )),(__ref.getField(true,"_horastext" /*RemoteObject*/ )),(__ref.getField(true,"_cantidadtext" /*RemoteObject*/ )),(__ref.getField(true,"_obsvtext" /*RemoteObject*/ )),(__ref.getField(true,"_turnocbx" /*RemoteObject*/ )),(__ref.getField(true,"_porcentagetext" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 792;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
Debug.ShouldStop(8388608);
_j = _req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executecommand" /*RemoteObject*/ ,(Object)(_cmd),(Object)(parent.__c.getField(false,"Null")));Debug.locals.put("j", _j);Debug.locals.put("j", _j);
 BA.debugLineNum = 793;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "button1_click"), (_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 795;BA.debugLine="Try";
Debug.ShouldStop(67108864);
if (true) break;

case 21:
//try
this.state = 26;
this.catchState = 25;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 26;
this.catchState = 25;
 BA.debugLineNum = 796;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Se ha insertado correctamente.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Éxito"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 797;BA.debugLine="Log(\"No se encontraron datos para el ID: \" & i";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","329556794",RemoteObject.concat(RemoteObject.createImmutable("No se encontraron datos para el ID: "),_id),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
 BA.debugLineNum = 800;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","329556797",RemoteObject.concat(RemoteObject.createImmutable("Error al agregar datos: "),parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 805;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","329556802",RemoteObject.concat(RemoteObject.createImmutable("Error al ejecutar la consulta: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 807;BA.debugLine="End Sub";
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
public static RemoteObject  _can_oncanceldate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("can_OnCancelDate (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("can_oncanceldate")) { return __ref.runUserSub(false, "formperson","can_oncanceldate", __ref);}
 BA.debugLineNum = 308;BA.debugLine="Sub can_OnCancelDate ()";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
Debug.ShouldStop(1048576);
formperson.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("cancel")),(Object)(formperson.__c.getField(true,"False")));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
formperson._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",formperson._root);
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
formperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formperson._xui);
 //BA.debugLineNum = 8;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
formperson._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",formperson._rdclink);
 //BA.debugLineNum = 10;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
formperson._datepicker = RemoteObject.createNew ("lib.intellvold.datepicker.DatePicker");__ref.setField("_datepicker",formperson._datepicker);
 //BA.debugLineNum = 11;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
formperson._mycalendar = RemoteObject.createNew ("lib.intellvold.datepicker.clander");__ref.setField("_mycalendar",formperson._mycalendar);
 //BA.debugLineNum = 12;BA.debugLine="Private utilClass As util";
formperson._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",formperson._utilclass);
 //BA.debugLineNum = 13;BA.debugLine="Private ScrollView1 As ScrollView";
formperson._scrollview1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");__ref.setField("_scrollview1",formperson._scrollview1);
 //BA.debugLineNum = 14;BA.debugLine="Dim xui As XUI";
formperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formperson._xui);
 //BA.debugLineNum = 15;BA.debugLine="Private SelectedDate As Long";
formperson._selecteddate = RemoteObject.createImmutable(0L);__ref.setField("_selecteddate",formperson._selecteddate);
 //BA.debugLineNum = 16;BA.debugLine="Private DateDialog As DateDialog";
formperson._datedialog = RemoteObject.createNew ("anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog");__ref.setField("_datedialog",formperson._datedialog);
 //BA.debugLineNum = 17;BA.debugLine="Private Panel3 As Panel";
formperson._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel3",formperson._panel3);
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
formperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",formperson._xui);
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
formperson._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel1",formperson._panel1);
 //BA.debugLineNum = 20;BA.debugLine="Private Label10 As Label";
formperson._label10 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label10",formperson._label10);
 //BA.debugLineNum = 21;BA.debugLine="Private Spinner1 As Spinner";
formperson._spinner1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spinner1",formperson._spinner1);
 //BA.debugLineNum = 22;BA.debugLine="Private Spinner2 As Spinner";
formperson._spinner2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spinner2",formperson._spinner2);
 //BA.debugLineNum = 23;BA.debugLine="Private Spinner3 As Spinner";
formperson._spinner3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spinner3",formperson._spinner3);
 //BA.debugLineNum = 24;BA.debugLine="Private Spinner4 As Spinner";
formperson._spinner4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_spinner4",formperson._spinner4);
 //BA.debugLineNum = 30;BA.debugLine="Private Label3 As Label";
formperson._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3",formperson._label3);
 //BA.debugLineNum = 31;BA.debugLine="Private Label13Hfim As Label";
formperson._label13hfim = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label13hfim",formperson._label13hfim);
 //BA.debugLineNum = 32;BA.debugLine="Private Label12Hinicio As Label";
formperson._label12hinicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label12hinicio",formperson._label12hinicio);
 //BA.debugLineNum = 33;BA.debugLine="Private EditText1percentage As EditText";
formperson._edittext1percentage = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext1percentage",formperson._edittext1percentage);
 //BA.debugLineNum = 34;BA.debugLine="Private EditText2horas As EditText";
formperson._edittext2horas = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext2horas",formperson._edittext2horas);
 //BA.debugLineNum = 35;BA.debugLine="Private EditText3cantidat As EditText";
formperson._edittext3cantidat = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext3cantidat",formperson._edittext3cantidat);
 //BA.debugLineNum = 36;BA.debugLine="Private EditText4obsv As EditText";
formperson._edittext4obsv = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_edittext4obsv",formperson._edittext4obsv);
 //BA.debugLineNum = 37;BA.debugLine="Private Label3Name As Label";
formperson._label3name = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3name",formperson._label3name);
 //BA.debugLineNum = 39;BA.debugLine="Private SD_xComboBoxNitPerson As SD_xComboBox";
formperson._sd_xcomboboxnitperson = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxnitperson",formperson._sd_xcomboboxnitperson);
 //BA.debugLineNum = 40;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
formperson._sd_xcomboboxhacienda = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxhacienda",formperson._sd_xcomboboxhacienda);
 //BA.debugLineNum = 42;BA.debugLine="Dim FechaInicio As String";
formperson._fechainicio = RemoteObject.createImmutable("");__ref.setField("_fechainicio",formperson._fechainicio);
 //BA.debugLineNum = 43;BA.debugLine="Dim FechaFin As String";
formperson._fechafin = RemoteObject.createImmutable("");__ref.setField("_fechafin",formperson._fechafin);
 //BA.debugLineNum = 44;BA.debugLine="Dim nitEmpresaCBX As String";
formperson._nitempresacbx = RemoteObject.createImmutable("");__ref.setField("_nitempresacbx",formperson._nitempresacbx);
 //BA.debugLineNum = 45;BA.debugLine="Dim haciendaCBX As String";
formperson._haciendacbx = RemoteObject.createImmutable("");__ref.setField("_haciendacbx",formperson._haciendacbx);
 //BA.debugLineNum = 46;BA.debugLine="Dim LoteCBX As String";
formperson._lotecbx = RemoteObject.createImmutable("");__ref.setField("_lotecbx",formperson._lotecbx);
 //BA.debugLineNum = 47;BA.debugLine="Dim LaborCBX As String";
formperson._laborcbx = RemoteObject.createImmutable("");__ref.setField("_laborcbx",formperson._laborcbx);
 //BA.debugLineNum = 48;BA.debugLine="Dim ConceptoCBX As String";
formperson._conceptocbx = RemoteObject.createImmutable("");__ref.setField("_conceptocbx",formperson._conceptocbx);
 //BA.debugLineNum = 49;BA.debugLine="Dim TurnoCBX As String";
formperson._turnocbx = RemoteObject.createImmutable("");__ref.setField("_turnocbx",formperson._turnocbx);
 //BA.debugLineNum = 50;BA.debugLine="Dim HorasText As String";
formperson._horastext = RemoteObject.createImmutable("");__ref.setField("_horastext",formperson._horastext);
 //BA.debugLineNum = 51;BA.debugLine="Dim PorcentageText As String";
formperson._porcentagetext = RemoteObject.createImmutable("");__ref.setField("_porcentagetext",formperson._porcentagetext);
 //BA.debugLineNum = 52;BA.debugLine="Dim CantidadText As String";
formperson._cantidadtext = RemoteObject.createImmutable("");__ref.setField("_cantidadtext",formperson._cantidadtext);
 //BA.debugLineNum = 53;BA.debugLine="Dim ObsvText As String";
formperson._obsvtext = RemoteObject.createImmutable("");__ref.setField("_obsvtext",formperson._obsvtext);
 //BA.debugLineNum = 54;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
formperson._sd_xcomboboxlote = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlote",formperson._sd_xcomboboxlote);
 //BA.debugLineNum = 55;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
formperson._sd_xcomboboxlabor = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxlabor",formperson._sd_xcomboboxlabor);
 //BA.debugLineNum = 56;BA.debugLine="Private SD_xComboBoxConcepto As SD_xComboBox";
formperson._sd_xcomboboxconcepto = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxconcepto",formperson._sd_xcomboboxconcepto);
 //BA.debugLineNum = 57;BA.debugLine="Private SD_xComboBoxTurno As SD_xComboBox";
formperson._sd_xcomboboxturno = RemoteObject.createNew ("b4a.example.ef.sd_xcombobox");__ref.setField("_sd_xcomboboxturno",formperson._sd_xcomboboxturno);
 //BA.debugLineNum = 58;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
formperson._as_datepicker1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker");__ref.setField("_as_datepicker1",formperson._as_datepicker1);
 //BA.debugLineNum = 59;BA.debugLine="Private Panel12 As Panel";
formperson._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",formperson._panel12);
 //BA.debugLineNum = 60;BA.debugLine="Private AS_DatePicker2 As AS_DatePicker";
formperson._as_datepicker2 = RemoteObject.createNew ("b4a.example.ef.as_datepicker");__ref.setField("_as_datepicker2",formperson._as_datepicker2);
 //BA.debugLineNum = 61;BA.debugLine="Private Panel13 As Panel";
formperson._panel13 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel13",formperson._panel13);
 //BA.debugLineNum = 62;BA.debugLine="Public idPerson As String";
formperson._idperson = RemoteObject.createImmutable("");__ref.setField("_idperson",formperson._idperson);
 //BA.debugLineNum = 63;BA.debugLine="Dim ConceptoDataMap As Map";
formperson._conceptodatamap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_conceptodatamap",formperson._conceptodatamap);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,373);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "formperson","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 373;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(2097152);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 375;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(4194304);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 376;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(8388608);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 377;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 378;BA.debugLine="Return cmd";
Debug.ShouldStop(33554432);
if (true) return _cmd;
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject __ref,RemoteObject _db) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("createrequest")) { return __ref.runUserSub(false, "formperson","createrequest", __ref, _db);}
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
Debug.locals.put("Db", _db);
 BA.debugLineNum = 367;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
Debug.ShouldStop(16384);
 BA.debugLineNum = 368;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(32768);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 369;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
Debug.ShouldStop(65536);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),_db)));
 BA.debugLineNum = 370;BA.debugLine="Return Req";
Debug.ShouldStop(131072);
if (true) return _req;
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _date_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("Date_OnDateSet (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("date_ondateset")) { return __ref.runUserSub(false, "formperson","date_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 303;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
Debug.ShouldStop(16384);
 BA.debugLineNum = 304;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
Debug.ShouldStop(32768);
__ref.getField(false,"_label10" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),(formperson.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _monthofyear)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("/"),formperson.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dayofmonth)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 305;BA.debugLine="Label10.TextColor=Colors.Black";
Debug.ShouldStop(65536);
__ref.getField(false,"_label10" /*RemoteObject*/ ).runMethod(true,"setTextColor",formperson.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleterecord(RemoteObject __ref,RemoteObject _nombre) throws Exception{
try {
		Debug.PushSubsStack("DeleteRecord (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("deleterecord")) { return __ref.runUserSub(false, "formperson","deleterecord", __ref, _nombre);}
Debug.locals.put("Nombre", _nombre);
 BA.debugLineNum = 442;BA.debugLine="Sub DeleteRecord (Nombre As String)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext1percentage_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText1percentage_TextChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,723);
if (RapidSub.canDelegate("edittext1percentage_textchanged")) { return __ref.runUserSub(false, "formperson","edittext1percentage_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 723;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 724;BA.debugLine="Log(PorcentageText)";
Debug.ShouldStop(524288);
formperson.__c.runVoidMethod ("LogImpl","329360129",__ref.getField(true,"_porcentagetext" /*RemoteObject*/ ),0);
 BA.debugLineNum = 725;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext2horas_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText2horas_TextChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,716);
if (RapidSub.canDelegate("edittext2horas_textchanged")) { return __ref.runUserSub(false, "formperson","edittext2horas_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 716;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
Debug.ShouldStop(2048);
 BA.debugLineNum = 717;BA.debugLine="HorasText = New";
Debug.ShouldStop(4096);
__ref.setField ("_horastext" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 720;BA.debugLine="Log(HorasText)";
Debug.ShouldStop(32768);
formperson.__c.runVoidMethod ("LogImpl","329294596",__ref.getField(true,"_horastext" /*RemoteObject*/ ),0);
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext3cantidat_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText3cantidat_TextChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,727);
if (RapidSub.canDelegate("edittext3cantidat_textchanged")) { return __ref.runUserSub(false, "formperson","edittext3cantidat_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 727;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 728;BA.debugLine="CantidadText = New";
Debug.ShouldStop(8388608);
__ref.setField ("_cantidadtext" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 730;BA.debugLine="Log(CantidadText)";
Debug.ShouldStop(33554432);
formperson.__c.runVoidMethod ("LogImpl","329425667",__ref.getField(true,"_cantidadtext" /*RemoteObject*/ ),0);
 BA.debugLineNum = 731;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _edittext4obsv_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("EditText4obsv_TextChanged (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,733);
if (RapidSub.canDelegate("edittext4obsv_textchanged")) { return __ref.runUserSub(false, "formperson","edittext4obsv_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 733;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 734;BA.debugLine="ObsvText =New";
Debug.ShouldStop(536870912);
__ref.setField ("_obsvtext" /*RemoteObject*/ ,_new);
 BA.debugLineNum = 736;BA.debugLine="Log(ObsvText)";
Debug.ShouldStop(-2147483648);
formperson.__c.runVoidMethod ("LogImpl","329491203",__ref.getField(true,"_obsvtext" /*RemoteObject*/ ),0);
 BA.debugLineNum = 737;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _getrecordclientes(RemoteObject __ref,RemoteObject _usedb) throws Exception{
try {
		Debug.PushSubsStack("GetRecordClientes (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,416);
if (RapidSub.canDelegate("getrecordclientes")) { __ref.runUserSub(false, "formperson","getrecordclientes", __ref, _usedb); return;}
ResumableSub_GetRecordClientes rsub = new ResumableSub_GetRecordClientes(null,__ref,_usedb);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordClientes extends BA.ResumableSub {
public ResumableSub_GetRecordClientes(b4a.example.ef.formperson parent,RemoteObject __ref,RemoteObject _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _usedb;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordClientes (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,416);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
 BA.debugLineNum = 417;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(1);
_req = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 418;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
Debug.ShouldStop(2);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_clientes")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 419;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(4);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordclientes"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 420;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8);
if (true) break;

case 1:
//if
this.state = 6;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 421;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(16);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 422;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordclientes"), (_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 424;BA.debugLine="req.PrintTable(res)";
Debug.ShouldStop(128);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_printtable" /*RemoteObject*/ ,(Object)(_res));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 426;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","328180490",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 428;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static void  _getrecordhaciendas(RemoteObject __ref,RemoteObject _usedb) throws Exception{
try {
		Debug.PushSubsStack("GetRecordHaciendas (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("getrecordhaciendas")) { __ref.runUserSub(false, "formperson","getrecordhaciendas", __ref, _usedb); return;}
ResumableSub_GetRecordHaciendas rsub = new ResumableSub_GetRecordHaciendas(null,__ref,_usedb);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordHaciendas extends BA.ResumableSub {
public ResumableSub_GetRecordHaciendas(b4a.example.ef.formperson parent,RemoteObject __ref,RemoteObject _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _usedb;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _separador = RemoteObject.createImmutable("");
RemoteObject _longitud = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group10;
int index10;
int groupLen10;
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordHaciendas (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,382);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
 BA.debugLineNum = 383;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(1073741824);
_req = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 384;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(-2147483648);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 386;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(2);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 387;BA.debugLine="Dim separador As String";
Debug.ShouldStop(4);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 388;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(8);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 390;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordhaciendas"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 391;BA.debugLine="If j.Success Then";
Debug.ShouldStop(64);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 392;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(128);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 393;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordhaciendas"), (_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 397;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//for
this.state = 11;
group10 = _res.getField(false,"Rows" /*RemoteObject*/ );
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 18:
//C
this.state = 17;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 398;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(8192);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 399;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(16384);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 400;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(32768);
if (true) break;

case 7:
//for
this.state = 10;
group13 = _row;
index13 = 0;
groupLen13 = group13.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index13 < groupLen13) {
this.state = 9;
_record = group13.getArrayElement(false,RemoteObject.createImmutable(index13));Debug.locals.put("record", _record);}
if (true) break;

case 20:
//C
this.state = 19;
index13++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 401;BA.debugLine="cadena=cadena & record & separador";
Debug.ShouldStop(65536);
_cadena = RemoteObject.concat(_cadena,_record,_separador);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 403;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(262144);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 404;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(524288);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 405;BA.debugLine="Spinner2.Add(cadena)";
Debug.ShouldStop(1048576);
__ref.getField(false,"_spinner2" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_cadena));
 BA.debugLineNum = 406;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(2097152);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 410;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","328114972",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 412;BA.debugLine="j.Release";
Debug.ShouldStop(134217728);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
public static void  _getrecordlabores(RemoteObject __ref,RemoteObject _usedb) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLabores (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("getrecordlabores")) { __ref.runUserSub(false, "formperson","getrecordlabores", __ref, _usedb); return;}
ResumableSub_GetRecordLabores rsub = new ResumableSub_GetRecordLabores(null,__ref,_usedb);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordLabores extends BA.ResumableSub {
public ResumableSub_GetRecordLabores(b4a.example.ef.formperson parent,RemoteObject __ref,RemoteObject _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _usedb;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _separador = RemoteObject.createImmutable("");
RemoteObject _longitud = RemoteObject.createImmutable(0);
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group10;
int index10;
int groupLen10;
RemoteObject group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLabores (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,495);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
 BA.debugLineNum = 496;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(32768);
_req = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 497;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
Debug.ShouldStop(65536);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labores")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 499;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(262144);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 500;BA.debugLine="Dim separador As String";
Debug.ShouldStop(524288);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 501;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(1048576);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 503;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordlabores"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 504;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 505;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(16777216);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 506;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordlabores"), (_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 510;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(536870912);
if (true) break;

case 4:
//for
this.state = 11;
group10 = _res.getField(false,"Rows" /*RemoteObject*/ );
index10 = 0;
groupLen10 = group10.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index10 < groupLen10) {
this.state = 6;
_row = (group10.runMethod(false,"Get",index10));Debug.locals.put("row", _row);}
if (true) break;

case 18:
//C
this.state = 17;
index10++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 511;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(1073741824);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 512;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(-2147483648);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 513;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(1);
if (true) break;

case 7:
//for
this.state = 10;
group13 = _row;
index13 = 0;
groupLen13 = group13.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index13 < groupLen13) {
this.state = 9;
_record = group13.getArrayElement(false,RemoteObject.createImmutable(index13));Debug.locals.put("record", _record);}
if (true) break;

case 20:
//C
this.state = 19;
index13++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 514;BA.debugLine="cadena=cadena & record & separador";
Debug.ShouldStop(2);
_cadena = RemoteObject.concat(_cadena,_record,_separador);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 516;BA.debugLine="longitud = cadena.Length";
Debug.ShouldStop(8);
_longitud = _cadena.runMethod(true,"length");Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 517;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
Debug.ShouldStop(16);
_cadena = _cadena.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_longitud,RemoteObject.createImmutable(3)}, "-",1, 1)));Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 518;BA.debugLine="Spinner4.Add(cadena)";
Debug.ShouldStop(32);
__ref.getField(false,"_spinner4" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_cadena));
 BA.debugLineNum = 519;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(64);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 523;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("LogImpl","328508188",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 525;BA.debugLine="j.Release";
Debug.ShouldStop(4096);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 526;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
public static void  _getrecordlotes(RemoteObject __ref,RemoteObject _usedb,RemoteObject _nit,RemoteObject _hda) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLotes (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("getrecordlotes")) { __ref.runUserSub(false, "formperson","getrecordlotes", __ref, _usedb, _nit, _hda); return;}
ResumableSub_GetRecordLotes rsub = new ResumableSub_GetRecordLotes(null,__ref,_usedb,_nit,_hda);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_GetRecordLotes extends BA.ResumableSub {
public ResumableSub_GetRecordLotes(b4a.example.ef.formperson parent,RemoteObject __ref,RemoteObject _usedb,RemoteObject _nit,RemoteObject _hda) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nit = _nit;
this._hda = _hda;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _usedb;
RemoteObject _nit;
RemoteObject _hda;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _cadena = RemoteObject.createImmutable("");
RemoteObject _id = RemoteObject.createImmutable("");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _record = RemoteObject.declareNull("Object");
RemoteObject group8;
int index8;
int groupLen8;
RemoteObject group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("GetRecordLotes (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,466);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("UseDb", _usedb);
Debug.locals.put("nit", _nit);
Debug.locals.put("hda", _hda);
 BA.debugLineNum = 467;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
Debug.ShouldStop(262144);
_req = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createrequest" /*RemoteObject*/ ,(Object)(_usedb));Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 468;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(524288);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_nit),(_hda)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 470;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(2097152);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 472;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordlotes"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 473;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 14;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 474;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(33554432);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 475;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "getrecordlotes"), (_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 479;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(1073741824);
if (true) break;

case 4:
//for
this.state = 11;
group8 = _res.getField(false,"Rows" /*RemoteObject*/ );
index8 = 0;
groupLen8 = group8.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index8 < groupLen8) {
this.state = 6;
_row = (group8.runMethod(false,"Get",index8));Debug.locals.put("row", _row);}
if (true) break;

case 18:
//C
this.state = 17;
index8++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 480;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(-2147483648);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 481;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(1);
if (true) break;

case 7:
//for
this.state = 10;
group10 = _row;
index10 = 0;
groupLen10 = group10.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_record = group10.getArrayElement(false,RemoteObject.createImmutable(index10));Debug.locals.put("record", _record);}
if (true) break;

case 20:
//C
this.state = 19;
index10++;
Debug.locals.put("record", _record);
if (true) break;

case 9:
//C
this.state = 20;
 BA.debugLineNum = 482;BA.debugLine="cadena=record";
Debug.ShouldStop(2);
_cadena = BA.ObjectToString(_record);Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 483;BA.debugLine="Spinner3.Add(cadena)";
Debug.ShouldStop(4);
__ref.getField(false,"_spinner3" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_cadena));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
Debug.locals.put("record", _record);
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
Debug.locals.put("row", _row);
;
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 490;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","328442648",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 492;BA.debugLine="j.Release";
Debug.ShouldStop(2048);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
public static RemoteObject  _globals(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Globals (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("globals")) { return __ref.runUserSub(false, "formperson","globals", __ref);}
RemoteObject _panel10horainicio = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _labelfecha = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
 BA.debugLineNum = 67;BA.debugLine="Sub Globals";
Debug.ShouldStop(4);
 BA.debugLineNum = 68;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
Debug.ShouldStop(8);
_panel10horainicio = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("Panel10Horainicio", _panel10horainicio);
 BA.debugLineNum = 69;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
Debug.ShouldStop(16);
_labelfecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("LabelFecha", _labelfecha);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hinicio_ondateset(RemoteObject __ref,RemoteObject _year,RemoteObject _monthofyear,RemoteObject _dayofmonth) throws Exception{
try {
		Debug.PushSubsStack("Hinicio_OnDateSet (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("hinicio_ondateset")) { return __ref.runUserSub(false, "formperson","hinicio_ondateset", __ref, _year, _monthofyear, _dayofmonth);}
Debug.locals.put("year", _year);
Debug.locals.put("monthOfYear", _monthofyear);
Debug.locals.put("dayOfMonth", _dayofmonth);
 BA.debugLineNum = 341;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 342;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
Debug.ShouldStop(2097152);
__ref.getField(false,"_label12hinicio" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_year,RemoteObject.createImmutable("/"),(formperson.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _monthofyear)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)))),RemoteObject.createImmutable("/"),formperson.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _dayofmonth)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0))))));
 BA.debugLineNum = 343;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
Debug.ShouldStop(4194304);
__ref.getField(false,"_label12hinicio" /*RemoteObject*/ ).runMethod(true,"setTextColor",formperson.__c.getField(false,"Colors").getField(true,"Black"));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "formperson","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 74;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Return Me";
Debug.ShouldStop(1024);
if (true) return __ref;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertrecord(RemoteObject __ref,RemoteObject _nombre,RemoteObject _salario) throws Exception{
try {
		Debug.PushSubsStack("InsertRecord (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,432);
if (RapidSub.canDelegate("insertrecord")) { return __ref.runUserSub(false, "formperson","insertrecord", __ref, _nombre, _salario);}
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("Salario", _salario);
 BA.debugLineNum = 432;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
Debug.ShouldStop(32768);
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
public static RemoteObject  _label10_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label10_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("label10_click")) { return __ref.runUserSub(false, "formperson","label10_click", __ref);}
 BA.debugLineNum = 328;BA.debugLine="Private Sub Label10_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 329;BA.debugLine="Panel9_Click";
Debug.ShouldStop(256);
__ref.runClassMethod (b4a.example.ef.formperson.class, "_panel9_click" /*RemoteObject*/ );
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label12hinicio_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label12Hinicio_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("label12hinicio_click")) { return __ref.runUserSub(false, "formperson","label12hinicio_click", __ref);}
 BA.debugLineNum = 249;BA.debugLine="Private Sub Label12Hinicio_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="Panel12.Visible= True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",formperson.__c.getField(true,"True"));
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label13hfim_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label13Hfim_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("label13hfim_click")) { return __ref.runUserSub(false, "formperson","label13hfim_click", __ref);}
 BA.debugLineNum = 274;BA.debugLine="Private Sub Label13Hfim_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="Panel13.Visible= True";
Debug.ShouldStop(262144);
__ref.getField(false,"_panel13" /*RemoteObject*/ ).runMethod(true,"setVisible",formperson.__c.getField(true,"True"));
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Label1Back_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("label1back_click")) { return __ref.runUserSub(false, "formperson","label1back_click", __ref);}
 BA.debugLineNum = 348;BA.debugLine="Private Sub Label1Back_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 351;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(1073741824);
formperson._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
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
public static RemoteObject  _label2save_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2Save_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("label2save_click")) { return __ref.runUserSub(false, "formperson","label2save_click", __ref);}
 BA.debugLineNum = 354;BA.debugLine="Private Sub Label2Save_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 355;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
Debug.ShouldStop(4);
formperson.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Saved.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),__ref.getField(false, "ba"));
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
public static RemoteObject  _panel10horainicio_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel10Horainicio_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("panel10horainicio_click")) { return __ref.runUserSub(false, "formperson","panel10horainicio_click", __ref);}
 BA.debugLineNum = 336;BA.debugLine="Private Sub Panel10Horainicio_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel11horafim_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel11horaFim_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,332);
if (RapidSub.canDelegate("panel11horafim_click")) { return __ref.runUserSub(false, "formperson","panel11horafim_click", __ref);}
 BA.debugLineNum = 332;BA.debugLine="Private Sub Panel11horaFim_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel2time_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel2Time_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("panel2time_click")) { return __ref.runUserSub(false, "formperson","panel2time_click", __ref);}
 BA.debugLineNum = 358;BA.debugLine="Private Sub Panel2Time_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel9_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel9_Click (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("panel9_click")) { return __ref.runUserSub(false, "formperson","panel9_click", __ref);}
 BA.debugLineNum = 312;BA.debugLine="Private Sub Panel9_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 313;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
Debug.ShouldStop(16777216);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Date")),(Object)(BA.numberCast(int.class, 2022)),(Object)(formperson.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(formperson.__c.getField(false,"DateTime").runMethod(true,"getNow")))),(Object)(formperson.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(formperson.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 314;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.02.1990")));
 BA.debugLineNum = 315;BA.debugLine="Datepicker.SetThemeDark";
Debug.ShouldStop(67108864);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetThemeDark");
 BA.debugLineNum = 316;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMinDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 317;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("dd.mm.yyyy")),(Object)(__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getField(false,"PRC")),(Object)(RemoteObject.createImmutable("2.02.2030")));
 BA.debugLineNum = 318;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetMaxDate",(Object)((__ref.getField(false,"_mycalendar" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 319;BA.debugLine="Datepicker.CancelColor = Colors.White";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelColor",formperson.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 320;BA.debugLine="Datepicker.OkColor = Colors.White";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkColor",formperson.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 321;BA.debugLine="Datepicker.Title = \"Selecione\"";
Debug.ShouldStop(1);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setTitle",BA.ObjectToString("Selecione"));
 BA.debugLineNum = 322;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
Debug.ShouldStop(2);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setCancelText",BA.ObjectToString("Cancelar"));
 BA.debugLineNum = 323;BA.debugLine="Datepicker.OkText = \"Ok\"";
Debug.ShouldStop(4);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("setOkText",BA.ObjectToString("Ok"));
 BA.debugLineNum = 324;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
Debug.ShouldStop(8);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("SetOnCancel",(Object)(RemoteObject.createImmutable("Cancel")));
 BA.debugLineNum = 325;BA.debugLine="Datepicker.show2(\"iki\")";
Debug.ShouldStop(16);
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runVoidMethod ("show2",(Object)(RemoteObject.createImmutable("iki")));
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sd_xcomboboxconcepto_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxConcepto_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,692);
if (RapidSub.canDelegate("sd_xcomboboxconcepto_itemclick")) { return __ref.runUserSub(false, "formperson","sd_xcomboboxconcepto_itemclick", __ref, _position, _value);}
RemoteObject _dstjo_cncpto = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 692;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
Debug.ShouldStop(524288);
 BA.debugLineNum = 693;BA.debugLine="ConceptoCBX = Value";
Debug.ShouldStop(1048576);
__ref.setField ("_conceptocbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 694;BA.debugLine="If Value = \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 695;BA.debugLine="ConceptoCBX = Null";
Debug.ShouldStop(4194304);
__ref.setField ("_conceptocbx" /*RemoteObject*/ ,BA.ObjectToString(formperson.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 697;BA.debugLine="ConceptoCBX = Value";
Debug.ShouldStop(16777216);
__ref.setField ("_conceptocbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 };
 BA.debugLineNum = 700;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
Debug.ShouldStop(134217728);
_dstjo_cncpto = BA.ObjectToString(__ref.getField(false,"_conceptodatamap" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(_value)));Debug.locals.put("dstjo_Cncpto", _dstjo_cncpto);Debug.locals.put("dstjo_Cncpto", _dstjo_cncpto);
 BA.debugLineNum = 703;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
Debug.ShouldStop(1073741824);
formperson.__c.runVoidMethod ("LogImpl","329229067",RemoteObject.concat(RemoteObject.createImmutable("Valor seleccionado: "),__ref.getField(true,"_conceptocbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 704;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
Debug.ShouldStop(-2147483648);
formperson.__c.runVoidMethod ("LogImpl","329229068",RemoteObject.concat(RemoteObject.createImmutable("Dato dstjo_Cncpto: "),_dstjo_cncpto),0);
 BA.debugLineNum = 707;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_dstjo_cncpto,BA.ObjectToString("N"))) { 
 BA.debugLineNum = 709;BA.debugLine="EditText3cantidat.Enabled = False";
Debug.ShouldStop(16);
__ref.getField(false,"_edittext3cantidat" /*RemoteObject*/ ).runMethod(true,"setEnabled",formperson.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 712;BA.debugLine="EditText3cantidat.Enabled = True";
Debug.ShouldStop(128);
__ref.getField(false,"_edittext3cantidat" /*RemoteObject*/ ).runMethod(true,"setEnabled",formperson.__c.getField(true,"True"));
 };
 BA.debugLineNum = 714;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,627);
if (RapidSub.canDelegate("sd_xcomboboxhacienda_itemclick")) { __ref.runUserSub(false, "formperson","sd_xcomboboxhacienda_itemclick", __ref, _position, _value); return;}
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
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formperson parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxHacienda_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,627);
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
 BA.debugLineNum = 628;BA.debugLine="If Value = \"\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 629;BA.debugLine="haciendaCBX = Null";
Debug.ShouldStop(1048576);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(parent.__c.getField(false,"Null")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 631;BA.debugLine="haciendaCBX = Value";
Debug.ShouldStop(4194304);
__ref.setField ("_haciendacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 633;BA.debugLine="Log(haciendaCBX)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","329032454",__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 634;BA.debugLine="SD_xComboBoxLote.Clear";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 635;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 637;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(268435456);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 638;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(536870912);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 639;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
Debug.ShouldStop(1073741824);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_lotes")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),(__ref.getField(true,"_haciendacbx" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 642;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(2);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 645;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16);
if (true) break;

case 7:
//if
this.state = 16;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 647;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(64);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 648;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 652;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(2048);
if (true) break;

case 10:
//for
this.state = 13;
group16 = _res.getField(false,"Rows" /*RemoteObject*/ );
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index16 < groupLen16) {
this.state = 12;
_row = (group16.runMethod(false,"Get",index16));Debug.locals.put("row", _row);}
if (true) break;

case 20:
//C
this.state = 19;
index16++;
Debug.locals.put("row", _row);
if (true) break;

case 12:
//C
this.state = 20;
 BA.debugLineNum = 653;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(4096);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 656;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
Debug.ShouldStop(32768);
__ref.getField(false,"_sd_xcomboboxlote" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("Codigo: "),_codg_hacienda)),(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
Debug.locals.put("row", _row);
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 661;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","329032482",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 665;BA.debugLine="j.Release";
Debug.ShouldStop(16777216);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 667;BA.debugLine="End Sub";
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
public static RemoteObject  _sd_xcomboboxlabor_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxLabor_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,681);
if (RapidSub.canDelegate("sd_xcomboboxlabor_itemclick")) { return __ref.runUserSub(false, "formperson","sd_xcomboboxlabor_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 681;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
Debug.ShouldStop(256);
 BA.debugLineNum = 682;BA.debugLine="LaborCBX = Value";
Debug.ShouldStop(512);
__ref.setField ("_laborcbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 683;BA.debugLine="If Value = \"\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 684;BA.debugLine="LaborCBX = Null";
Debug.ShouldStop(2048);
__ref.setField ("_laborcbx" /*RemoteObject*/ ,BA.ObjectToString(formperson.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 686;BA.debugLine="LaborCBX = Value";
Debug.ShouldStop(8192);
__ref.setField ("_laborcbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 };
 BA.debugLineNum = 689;BA.debugLine="Log(LaborCBX)";
Debug.ShouldStop(65536);
formperson.__c.runVoidMethod ("LogImpl","329163528",__ref.getField(true,"_laborcbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 690;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("SD_xComboBoxLote_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("sd_xcomboboxlote_itemclick")) { return __ref.runUserSub(false, "formperson","sd_xcomboboxlote_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 669;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 670;BA.debugLine="LoteCBX = Value";
Debug.ShouldStop(536870912);
__ref.setField ("_lotecbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 672;BA.debugLine="If Value = \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 673;BA.debugLine="LoteCBX = Null";
Debug.ShouldStop(1);
__ref.setField ("_lotecbx" /*RemoteObject*/ ,BA.ObjectToString(formperson.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 675;BA.debugLine="LoteCBX = Value";
Debug.ShouldStop(4);
__ref.setField ("_lotecbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 };
 BA.debugLineNum = 678;BA.debugLine="Log(LoteCBX)";
Debug.ShouldStop(32);
formperson.__c.runVoidMethod ("LogImpl","329097993",__ref.getField(true,"_lotecbx" /*RemoteObject*/ ),0);
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
public static void  _sd_xcomboboxnitperson_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNitPerson_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,578);
if (RapidSub.canDelegate("sd_xcomboboxnitperson_itemclick")) { __ref.runUserSub(false, "formperson","sd_xcomboboxnitperson_itemclick", __ref, _position, _value); return;}
ResumableSub_SD_xComboBoxNitPerson_ItemClick rsub = new ResumableSub_SD_xComboBoxNitPerson_ItemClick(null,__ref,_position,_value);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SD_xComboBoxNitPerson_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNitPerson_ItemClick(b4a.example.ef.formperson parent,RemoteObject __ref,RemoteObject _position,RemoteObject _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.formperson parent;
RemoteObject _position;
RemoteObject _value;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codg_hacienda = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda = RemoteObject.createImmutable("");
RemoteObject group17;
int index17;
int groupLen17;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxNitPerson_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,578);
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
 BA.debugLineNum = 579;BA.debugLine="nitEmpresaCBX=Value";
Debug.ShouldStop(4);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 BA.debugLineNum = 581;BA.debugLine="If Value = \"\" Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 582;BA.debugLine="nitEmpresaCBX = Null";
Debug.ShouldStop(32);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(parent.__c.getField(false,"Null")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 584;BA.debugLine="nitEmpresaCBX = Value";
Debug.ShouldStop(128);
__ref.setField ("_nitempresacbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 588;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","328966922",RemoteObject.concat(RemoteObject.createImmutable("Valor seleccionado: "),__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ )),0);
 BA.debugLineNum = 590;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","328966924",RemoteObject.concat(RemoteObject.createImmutable("Posicion: "),_position,RemoteObject.createImmutable(" VALUE: "),_value),0);
 BA.debugLineNum = 591;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_sd_xcomboboxhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(BA.ObjectToString("----Select----")),(Object)((RemoteObject.createImmutable("1"))));
 BA.debugLineNum = 593;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(65536);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 594;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(131072);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 595;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
Debug.ShouldStop(262144);
_cmd = __ref.runClassMethod (b4a.example.ef.formperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_haciendas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("N"))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 598;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 601;BA.debugLine="If j.Success Then";
Debug.ShouldStop(16777216);
if (true) break;

case 7:
//if
this.state = 16;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 603;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(67108864);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 604;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 608;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(-2147483648);
if (true) break;

case 10:
//for
this.state = 13;
group17 = _res.getField(false,"Rows" /*RemoteObject*/ );
index17 = 0;
groupLen17 = group17.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index17 < groupLen17) {
this.state = 12;
_row = (group17.runMethod(false,"Get",index17));Debug.locals.put("row", _row);}
if (true) break;

case 20:
//C
this.state = 19;
index17++;
Debug.locals.put("row", _row);
if (true) break;

case 12:
//C
this.state = 20;
 BA.debugLineNum = 609;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
Debug.ShouldStop(1);
_codg_hacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Codg_Hacienda", _codg_hacienda);Debug.locals.put("Codg_Hacienda", _codg_hacienda);
 BA.debugLineNum = 610;BA.debugLine="Dim NombreHacienda As String = row(1)";
Debug.ShouldStop(2);
_nombrehacienda = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("NombreHacienda", _nombrehacienda);Debug.locals.put("NombreHacienda", _nombrehacienda);
 BA.debugLineNum = 613;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
Debug.ShouldStop(16);
__ref.getField(false,"_sd_xcomboboxhacienda" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.sd_xcombobox.class, "_add" /*RemoteObject*/ ,(Object)(RemoteObject.concat(_nombrehacienda,RemoteObject.createImmutable(" - "),_codg_hacienda)),(Object)((_codg_hacienda)));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
Debug.locals.put("row", _row);
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 618;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("LogImpl","328966952",RemoteObject.concat(RemoteObject.createImmutable("Error: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 621;BA.debugLine="Log(nitEmpresaCBX)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("LogImpl","328966955",__ref.getField(true,"_nitempresacbx" /*RemoteObject*/ ),0);
 BA.debugLineNum = 623;BA.debugLine="j.Release";
Debug.ShouldStop(16384);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 625;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
public static RemoteObject  _sd_xcomboboxturno_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SD_xComboBoxTurno_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,810);
if (RapidSub.canDelegate("sd_xcomboboxturno_itemclick")) { return __ref.runUserSub(false, "formperson","sd_xcomboboxturno_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 810;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
Debug.ShouldStop(512);
 BA.debugLineNum = 812;BA.debugLine="If Value = Null Or Value = \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("n",_value) || RemoteObject.solveBoolean("=",_value,RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 813;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
Debug.ShouldStop(4096);
__ref.setField ("_turnocbx" /*RemoteObject*/ ,BA.ObjectToString(formperson.__c.getField(false,"Null")));
 }else {
 BA.debugLineNum = 815;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
Debug.ShouldStop(16384);
__ref.setField ("_turnocbx" /*RemoteObject*/ ,BA.ObjectToString(_value));
 };
 BA.debugLineNum = 817;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner1_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner1_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("spinner1_itemclick")) { return __ref.runUserSub(false, "formperson","spinner1_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 529;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
Debug.ShouldStop(65536);
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
public static RemoteObject  _spinner10_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner10_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,549);
if (RapidSub.canDelegate("spinner10_itemclick")) { return __ref.runUserSub(false, "formperson","spinner10_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 549;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
Debug.ShouldStop(16);
 BA.debugLineNum = 551;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner2_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner2_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("spinner2_itemclick")) { return __ref.runUserSub(false, "formperson","spinner2_itemclick", __ref, _position, _value);}
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _hacienda = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 452;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
Debug.ShouldStop(8);
 BA.debugLineNum = 453;BA.debugLine="Dim nit As String";
Debug.ShouldStop(16);
_nit = RemoteObject.createImmutable("");Debug.locals.put("nit", _nit);
 BA.debugLineNum = 454;BA.debugLine="Dim hacienda As String";
Debug.ShouldStop(32);
_hacienda = RemoteObject.createImmutable("");Debug.locals.put("hacienda", _hacienda);
 BA.debugLineNum = 456;BA.debugLine="Spinner3.Clear";
Debug.ShouldStop(128);
__ref.getField(false,"_spinner3" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 458;BA.debugLine="Log(Position & \" - \" & Value)";
Debug.ShouldStop(512);
formperson.__c.runVoidMethod ("LogImpl","328377094",RemoteObject.concat(_position,RemoteObject.createImmutable(" - "),_value),0);
 BA.debugLineNum = 459;BA.debugLine="nit= \"890307964\"";
Debug.ShouldStop(1024);
_nit = BA.ObjectToString("890307964");Debug.locals.put("nit", _nit);
 BA.debugLineNum = 460;BA.debugLine="hacienda = Value";
Debug.ShouldStop(2048);
_hacienda = BA.ObjectToString(_value);Debug.locals.put("hacienda", _hacienda);
 BA.debugLineNum = 461;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
Debug.ShouldStop(4096);
_hacienda = _hacienda.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("hacienda", _hacienda);
 BA.debugLineNum = 463;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.formperson.class, "_getrecordlotes" /*void*/ ,(Object)(BA.ObjectToString("BDPichucho")),(Object)(_nit),(Object)(_hacienda));
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner3_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner3_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("spinner3_itemclick")) { return __ref.runUserSub(false, "formperson","spinner3_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 533;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _spinner4_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner4_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,537);
if (RapidSub.canDelegate("spinner4_itemclick")) { return __ref.runUserSub(false, "formperson","spinner4_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 537;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 539;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _spinner7_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner7_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("spinner7_itemclick")) { return __ref.runUserSub(false, "formperson","spinner7_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 541;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
Debug.ShouldStop(268435456);
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
public static RemoteObject  _spinner8_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Spinner8_ItemClick (formperson) ","formperson",14,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("spinner8_itemclick")) { return __ref.runUserSub(false, "formperson","spinner8_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 545;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
Debug.ShouldStop(1);
 BA.debugLineNum = 547;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}