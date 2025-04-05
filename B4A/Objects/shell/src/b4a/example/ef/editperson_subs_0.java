package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class editperson_subs_0 {


public static RemoteObject  _as_datepicker1_selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("AS_DatePicker1_SelectedDateChanged (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("as_datepicker1_selecteddatechanged")) { return __ref.runUserSub(false, "editperson","as_datepicker1_selecteddatechanged", __ref, _date);}
RemoteObject _formatteddate = RemoteObject.createImmutable("");
RemoteObject _dateparts = null;
Debug.locals.put("Date", _date);
 BA.debugLineNum = 140;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
Debug.ShouldStop(2048);
 BA.debugLineNum = 142;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
Debug.ShouldStop(8192);
editperson.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("dd-MM-yyyy"));
 BA.debugLineNum = 143;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
Debug.ShouldStop(16384);
_formatteddate = editperson.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(_date));Debug.locals.put("formattedDate", _formatteddate);Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 146;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
Debug.ShouldStop(131072);
_formatteddate = _formatteddate.runMethod(true,"replace",(Object)(BA.ObjectToString("/")),(Object)(RemoteObject.createImmutable("-")));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 149;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
Debug.ShouldStop(1048576);
_dateparts = editperson.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("-")),(Object)(_formatteddate));Debug.locals.put("dateParts", _dateparts);Debug.locals.put("dateParts", _dateparts);
 BA.debugLineNum = 152;BA.debugLine="If dateParts.Length = 3 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_dateparts.getField(true,"length"),BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 154;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
Debug.ShouldStop(33554432);
_formatteddate = RemoteObject.concat(_dateparts.getArrayElement(true,BA.numberCast(int.class, 2)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 1)),RemoteObject.createImmutable("-"),_dateparts.getArrayElement(true,BA.numberCast(int.class, 0)));Debug.locals.put("formattedDate", _formatteddate);
 };
 BA.debugLineNum = 158;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
Debug.ShouldStop(536870912);
_formatteddate = RemoteObject.concat(_formatteddate,RemoteObject.createImmutable(" 00:00:00"));Debug.locals.put("formattedDate", _formatteddate);
 BA.debugLineNum = 161;BA.debugLine="Label12Fecha.Text = formattedDate";
Debug.ShouldStop(1);
__ref.getField(false,"_label12fecha" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_formatteddate));
 BA.debugLineNum = 164;BA.debugLine="Panel12.Visible = False";
Debug.ShouldStop(8);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",editperson.__c.getField(true,"False"));
 BA.debugLineNum = 167;BA.debugLine="Fecha = formattedDate";
Debug.ShouldStop(64);
__ref.setField ("_fecha" /*RemoteObject*/ ,_formatteddate);
 BA.debugLineNum = 170;BA.debugLine="Log(\"Fecha: \" & Fecha)";
Debug.ShouldStop(512);
editperson.__c.runVoidMethod ("LogImpl","33473438",RemoteObject.concat(RemoteObject.createImmutable("Fecha: "),__ref.getField(true,"_fecha" /*RemoteObject*/ )),0);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("B4XPage_Created (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "editperson","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 25;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 26;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 28;BA.debugLine="Root = Root1";
Debug.ShouldStop(134217728);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 29;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 30;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
Debug.ShouldStop(536870912);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(editperson.__c.getField(false,"Colors").getField(true,"White")),(Object)(editperson.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"EditPersons\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("EditPersons")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextbackgroundcolor",BA.numberCast(int.class, ((int)0xff25253d)));
 BA.debugLineNum = 33;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
Debug.ShouldStop(1);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).setField ("_defaulttextcolor",editperson.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 34;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"EditPersons1";
Debug.ShouldStop(2);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.editperson.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("EditPersons1"))));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _buttonbuscar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonBuscar_Click (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("buttonbuscar_click")) { __ref.runUserSub(false, "editperson","buttonbuscar_click", __ref); return;}
ResumableSub_ButtonBuscar_Click rsub = new ResumableSub_ButtonBuscar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ButtonBuscar_Click extends BA.ResumableSub {
public ResumableSub_ButtonBuscar_Click(b4a.example.ef.editperson parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.editperson parent;
RemoteObject _partesfecha = null;
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _codigoemple = RemoteObject.createImmutable("");
RemoteObject _nombreemple = RemoteObject.createImmutable("");
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _labor = RemoteObject.createImmutable("");
RemoteObject _codmotivo = RemoteObject.createImmutable("");
RemoteObject _fechamotivos = RemoteObject.createImmutable("");
RemoteObject _cmd2 = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j2 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resno = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowno = null;
RemoteObject group20;
int index20;
int groupLen20;
RemoteObject group45;
int index45;
int groupLen45;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ButtonBuscar_Click (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,61);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 62;BA.debugLine="If Label12Fecha.Text = \"\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 1:
//if
this.state = 28;
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_label12fecha" /*RemoteObject*/ ).runMethod(true,"getText"),BA.ObjectToString(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 28;
 BA.debugLineNum = 63;BA.debugLine="MsgboxAsync(\"Selecciona una fecha antes de busca";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("MsgboxAsync",(Object)(BA.ObjectToCharSequence("Selecciona una fecha antes de buscar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 65;BA.debugLine="CustomListView1Geral.Clear";
Debug.ShouldStop(1);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 66;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"EditPersons";
Debug.ShouldStop(2);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.editperson.class, "_createitem" /*RemoteObject*/ ).getObject()),(Object)((RemoteObject.createImmutable("EditPersons1"))));
 BA.debugLineNum = 67;BA.debugLine="Label12Fecha.Text = Fecha";
Debug.ShouldStop(4);
__ref.getField(false,"_label12fecha" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_fecha" /*RemoteObject*/ )));
 BA.debugLineNum = 69;BA.debugLine="Dim partesFecha() As String";
Debug.ShouldStop(16);
_partesfecha = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("partesFecha", _partesfecha);
 BA.debugLineNum = 70;BA.debugLine="partesFecha = Regex.Split(\" \", Fecha)";
Debug.ShouldStop(32);
_partesfecha = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(__ref.getField(true,"_fecha" /*RemoteObject*/ )));Debug.locals.put("partesFecha", _partesfecha);
 BA.debugLineNum = 71;BA.debugLine="Fecha = partesFecha(0)";
Debug.ShouldStop(64);
__ref.setField ("_fecha" /*RemoteObject*/ ,_partesfecha.getArrayElement(true,BA.numberCast(int.class, 0)));
 BA.debugLineNum = 72;BA.debugLine="Log(Fecha)";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","33407883",__ref.getField(true,"_fecha" /*RemoteObject*/ ),0);
 BA.debugLineNum = 74;BA.debugLine="Dim counter As Int";
Debug.ShouldStop(512);
_counter = RemoteObject.createImmutable(0);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 75;BA.debugLine="counter = 0";
Debug.ShouldStop(1024);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 77;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(4096);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 78;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
Debug.ShouldStop(8192);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 79;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lab";
Debug.ShouldStop(16384);
_cmd = __ref.runClassMethod (b4a.example.ef.editperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labores_Echas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_fecha" /*RemoteObject*/ ))})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 81;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editperson", "buttonbuscar_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 29;
return;
case 29:
//C
this.state = 6;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 83;BA.debugLine="If j.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 6:
//if
this.state = 19;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 8;
}else {
this.state = 18;
}if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 84;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(524288);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 85;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editperson", "buttonbuscar_click"), (_req));
this.state = 30;
return;
case 30:
//C
this.state = 9;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 87;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(4194304);
if (true) break;

case 9:
//for
this.state = 16;
group20 = _res.getField(false,"Rows" /*RemoteObject*/ );
index20 = 0;
groupLen20 = group20.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 31;
if (true) break;

case 31:
//C
this.state = 16;
if (index20 < groupLen20) {
this.state = 11;
_row = (group20.runMethod(false,"Get",index20));Debug.locals.put("row", _row);}
if (true) break;

case 32:
//C
this.state = 31;
index20++;
Debug.locals.put("row", _row);
if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 89;BA.debugLine="Dim CodigoEmple As String = row(0)";
Debug.ShouldStop(16777216);
_codigoemple = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("CodigoEmple", _codigoemple);Debug.locals.put("CodigoEmple", _codigoemple);
 BA.debugLineNum = 92;BA.debugLine="Dim NombreEmple As String = row(1)&\" \"&row(2)&";
Debug.ShouldStop(134217728);
_nombreemple = RemoteObject.concat(_row.getArrayElement(false,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(" "),_row.getArrayElement(false,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(" "),_row.getArrayElement(false,BA.numberCast(int.class, 3)));Debug.locals.put("NombreEmple", _nombreemple);Debug.locals.put("NombreEmple", _nombreemple);
 BA.debugLineNum = 95;BA.debugLine="Dim Nit As String = row(4)";
Debug.ShouldStop(1073741824);
_nit = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 4)));Debug.locals.put("Nit", _nit);Debug.locals.put("Nit", _nit);
 BA.debugLineNum = 98;BA.debugLine="Dim Labor As String = row(5)";
Debug.ShouldStop(2);
_labor = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 5)));Debug.locals.put("Labor", _labor);Debug.locals.put("Labor", _labor);
 BA.debugLineNum = 99;BA.debugLine="If Labor = \"null\" Then";
Debug.ShouldStop(4);
if (true) break;

case 12:
//if
this.state = 15;
if (RemoteObject.solveBoolean("=",_labor,BA.ObjectToString("null"))) { 
this.state = 14;
}if (true) break;

case 14:
//C
this.state = 15;
 BA.debugLineNum = 100;BA.debugLine="Labor = \"\"";
Debug.ShouldStop(8);
_labor = BA.ObjectToString("");Debug.locals.put("Labor", _labor);
 if (true) break;

case 15:
//C
this.state = 32;
;
 BA.debugLineNum = 104;BA.debugLine="Dim CodMotivo As String = row(6)";
Debug.ShouldStop(128);
_codmotivo = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 6)));Debug.locals.put("CodMotivo", _codmotivo);Debug.locals.put("CodMotivo", _codmotivo);
 BA.debugLineNum = 107;BA.debugLine="Dim FechaMotivos As String = row(7)";
Debug.ShouldStop(1024);
_fechamotivos = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 7)));Debug.locals.put("FechaMotivos", _fechamotivos);Debug.locals.put("FechaMotivos", _fechamotivos);
 BA.debugLineNum = 110;BA.debugLine="Dim partesFecha() As String";
Debug.ShouldStop(8192);
_partesfecha = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("partesFecha", _partesfecha);
 BA.debugLineNum = 111;BA.debugLine="partesFecha = Regex.Split(\" \", FechaMotivos)";
Debug.ShouldStop(16384);
_partesfecha = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_fechamotivos));Debug.locals.put("partesFecha", _partesfecha);
 BA.debugLineNum = 112;BA.debugLine="FechaMotivos = partesFecha(0)";
Debug.ShouldStop(32768);
_fechamotivos = _partesfecha.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("FechaMotivos", _fechamotivos);
 BA.debugLineNum = 114;BA.debugLine="CustomListView1Geral.Add(CreateItemLabores(cou";
Debug.ShouldStop(131072);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.editperson.class, "_createitemlabores" /*RemoteObject*/ ,(Object)(_counter),(Object)(_codigoemple),(Object)(_nombreemple),(Object)(_nit),(Object)(_labor),(Object)(_codmotivo),(Object)(_fechamotivos)).getObject()),(Object)((_counter)));
 BA.debugLineNum = 115;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(262144);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 19;
Debug.locals.put("row", _row);
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 118;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(2097152);
parent.__c.runVoidMethod ("LogImpl","33407929",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 120;BA.debugLine="j.Release";
Debug.ShouldStop(8388608);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="Dim cmd2 As DBCommand = CreateCommand(\"select_la";
Debug.ShouldStop(33554432);
_cmd2 = __ref.runClassMethod (b4a.example.ef.editperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_labores_NoEchas")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_fecha" /*RemoteObject*/ ))})));Debug.locals.put("cmd2", _cmd2);Debug.locals.put("cmd2", _cmd2);
 BA.debugLineNum = 123;BA.debugLine="Wait For (Req.ExecuteQuery(cmd2, 0, Null)) JobDo";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editperson", "buttonbuscar_click"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd2),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 33;
return;
case 33:
//C
this.state = 20;
_j2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j2", _j2);
;
 BA.debugLineNum = 124;BA.debugLine="If j2.Success Then";
Debug.ShouldStop(134217728);
if (true) break;

case 20:
//if
this.state = 27;
if (_j2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 125;BA.debugLine="Req.HandleJobAsync(j2, \"req_no\")";
Debug.ShouldStop(268435456);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j2),(Object)(RemoteObject.createImmutable("req_no")));
 BA.debugLineNum = 126;BA.debugLine="Wait For (Req) req_no_Result(resNo As DBResult)";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("WaitFor","req_no_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "editperson", "buttonbuscar_click"), (_req));
this.state = 34;
return;
case 34:
//C
this.state = 23;
_resno = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resNo", _resno);
;
 BA.debugLineNum = 127;BA.debugLine="For Each rowNo() As Object In resNo.Rows";
Debug.ShouldStop(1073741824);
if (true) break;

case 23:
//for
this.state = 26;
group45 = _resno.getField(false,"Rows" /*RemoteObject*/ );
index45 = 0;
groupLen45 = group45.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowNo", _rowno);
this.state = 35;
if (true) break;

case 35:
//C
this.state = 26;
if (index45 < groupLen45) {
this.state = 25;
_rowno = (group45.runMethod(false,"Get",index45));Debug.locals.put("rowNo", _rowno);}
if (true) break;

case 36:
//C
this.state = 35;
index45++;
Debug.locals.put("rowNo", _rowno);
if (true) break;

case 25:
//C
this.state = 36;
 BA.debugLineNum = 129;BA.debugLine="Dim CodigoEmple As String = row(0)";
Debug.ShouldStop(1);
_codigoemple = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("CodigoEmple", _codigoemple);Debug.locals.put("CodigoEmple", _codigoemple);
 BA.debugLineNum = 131;BA.debugLine="Dim NombreEmple As String = row(1)&\" \"&row(2)&";
Debug.ShouldStop(4);
_nombreemple = RemoteObject.concat(_row.getArrayElement(false,BA.numberCast(int.class, 1)),RemoteObject.createImmutable(" "),_row.getArrayElement(false,BA.numberCast(int.class, 2)),RemoteObject.createImmutable(" "),_row.getArrayElement(false,BA.numberCast(int.class, 3)));Debug.locals.put("NombreEmple", _nombreemple);Debug.locals.put("NombreEmple", _nombreemple);
 BA.debugLineNum = 132;BA.debugLine="CustomListView1Geral.Add(CreateItemLabores(cou";
Debug.ShouldStop(8);
__ref.getField(false,"_customlistview1geral" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.editperson.class, "_createitemlabores" /*RemoteObject*/ ,(Object)(_counter),(Object)(_codigoemple),(Object)(_nombreemple),(Object)(BA.ObjectToString("N/A")),(Object)(BA.ObjectToString("N/A")),(Object)(BA.ObjectToString("N/A")),(Object)(RemoteObject.createImmutable("N/A"))).getObject()),(Object)((_counter)));
 BA.debugLineNum = 133;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(16);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
Debug.locals.put("rowNo", _rowno);
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 if (true) break;

case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _req_no_result(RemoteObject __ref,RemoteObject _resno) throws Exception{
}
public static RemoteObject  _buttoncancelar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonCancelar_Click (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("buttoncancelar_click")) { return __ref.runUserSub(false, "editperson","buttoncancelar_click", __ref);}
 BA.debugLineNum = 212;BA.debugLine="Private Sub ButtonCancelar_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttongrabar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonGrabar_Click (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("buttongrabar_click")) { return __ref.runUserSub(false, "editperson","buttongrabar_click", __ref);}
 BA.debugLineNum = 208;BA.debugLine="Private Sub ButtonGrabar_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
editperson._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",editperson._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
editperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",editperson._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
editperson._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",editperson._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
editperson._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",editperson._rdclink);
 //BA.debugLineNum = 6;BA.debugLine="Private CLV_Editar As CustomListView";
editperson._clv_editar = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clv_editar",editperson._clv_editar);
 //BA.debugLineNum = 7;BA.debugLine="Dim Fecha As String";
editperson._fecha = RemoteObject.createImmutable("");__ref.setField("_fecha",editperson._fecha);
 //BA.debugLineNum = 8;BA.debugLine="Private Label12Fecha As Label";
editperson._label12fecha = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label12fecha",editperson._label12fecha);
 //BA.debugLineNum = 9;BA.debugLine="Private ButtonBuscar As Button";
editperson._buttonbuscar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonbuscar",editperson._buttonbuscar);
 //BA.debugLineNum = 10;BA.debugLine="Private Panel12 As Panel";
editperson._panel12 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panel12",editperson._panel12);
 //BA.debugLineNum = 11;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
editperson._as_datepicker1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker");__ref.setField("_as_datepicker1",editperson._as_datepicker1);
 //BA.debugLineNum = 12;BA.debugLine="Private PanelEdit As Panel";
editperson._paneledit = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_paneledit",editperson._paneledit);
 //BA.debugLineNum = 13;BA.debugLine="Private CustomListView1Geral As CustomListView";
editperson._customlistview1geral = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_customlistview1geral",editperson._customlistview1geral);
 //BA.debugLineNum = 14;BA.debugLine="Private LabelLabores As Label";
editperson._labellabores = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labellabores",editperson._labellabores);
 //BA.debugLineNum = 15;BA.debugLine="Private ButtonGrabar As Button";
editperson._buttongrabar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttongrabar",editperson._buttongrabar);
 //BA.debugLineNum = 16;BA.debugLine="Private ButtonCancelar As Button";
editperson._buttoncancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttoncancelar",editperson._buttoncancelar);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "editperson","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 216;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(16777216);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 218;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(33554432);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 219;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(67108864);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 220;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 221;BA.debugLine="Return cmd";
Debug.ShouldStop(268435456);
if (true) return _cmd;
 BA.debugLineNum = 222;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CreateItem (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "editperson","createitem", __ref);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 39;BA.debugLine="Private Sub CreateItem As Panel";
Debug.ShouldStop(64);
 BA.debugLineNum = 41;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(256);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 42;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
Debug.ShouldStop(512);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(editperson.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(editperson.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 500)))));
 BA.debugLineNum = 45;BA.debugLine="panel.LoadLayout(\"CardInputEditPerson\")";
Debug.ShouldStop(4096);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("CardInputEditPerson")),__ref.getField(false, "ba"));
 BA.debugLineNum = 47;BA.debugLine="panel.Height=PanelEdit.Height";
Debug.ShouldStop(16384);
_panel.runMethod(true,"setHeight",__ref.getField(false,"_paneledit" /*RemoteObject*/ ).runMethod(true,"getHeight"));
 BA.debugLineNum = 49;BA.debugLine="Return panel";
Debug.ShouldStop(65536);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitemlabores(RemoteObject __ref,RemoteObject _consecutivo,RemoteObject _codigoemple,RemoteObject _nombreemple,RemoteObject _nit,RemoteObject _labor,RemoteObject _codmotivo,RemoteObject _fechamotivos) throws Exception{
try {
		Debug.PushSubsStack("CreateItemLabores (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("createitemlabores")) { return __ref.runUserSub(false, "editperson","createitemlabores", __ref, _consecutivo, _codigoemple, _nombreemple, _nit, _labor, _codmotivo, _fechamotivos);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("Consecutivo", _consecutivo);
Debug.locals.put("CodigoEmple", _codigoemple);
Debug.locals.put("NombreEmple", _nombreemple);
Debug.locals.put("Nit", _nit);
Debug.locals.put("Labor", _labor);
Debug.locals.put("CodMotivo", _codmotivo);
Debug.locals.put("FechaMotivos", _fechamotivos);
 BA.debugLineNum = 173;BA.debugLine="Private Sub CreateItemLabores (Consecutivo As Int,";
Debug.ShouldStop(4096);
 BA.debugLineNum = 175;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16384);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 176;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 240dip)";
Debug.ShouldStop(32768);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(editperson.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(editperson.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 240)))));
 BA.debugLineNum = 178;BA.debugLine="panel.LoadLayout(\"CardLaboresNoRe\")";
Debug.ShouldStop(131072);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("CardLaboresNoRe")),__ref.getField(false, "ba"));
 BA.debugLineNum = 179;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(262144);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 180;BA.debugLine="cs.Initialize";
Debug.ShouldStop(524288);
_cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 183;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Codigo Emplea";
Debug.ShouldStop(4194304);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Codigo Empleado: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 184;BA.debugLine="cs.Color(Colors.Black).Underline.Append(CodigoEmp";
Debug.ShouldStop(8388608);
_cs.runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_codigoemple,editperson.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 186;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nombre Emplea";
Debug.ShouldStop(33554432);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Nombre Empleado: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 187;BA.debugLine="cs.Color(Colors.Black).Underline.Append(NombreEmp";
Debug.ShouldStop(67108864);
_cs.runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_nombreemple,editperson.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 189;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"NIT: \").PopAl";
Debug.ShouldStop(268435456);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("NIT: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 190;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Nit & CRL";
Debug.ShouldStop(536870912);
_cs.runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_nit,editperson.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 192;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
Debug.ShouldStop(-2147483648);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Labor: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 193;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Labor & C";
Debug.ShouldStop(1);
_cs.runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_labor,editperson.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 195;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Codigo Motivo";
Debug.ShouldStop(4);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Codigo Motivos: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 196;BA.debugLine="cs.Color(Colors.Black).Underline.Append(CodMotivo";
Debug.ShouldStop(8);
_cs.runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_codmotivo,editperson.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 198;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha: \").Pop";
Debug.ShouldStop(32);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Fecha: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 199;BA.debugLine="cs.Color(Colors.Black).Underline.Append(FechaMoti";
Debug.ShouldStop(64);
_cs.runMethod(false,"Color",(Object)(editperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_fechamotivos,editperson.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 201;BA.debugLine="LabelLabores.Text = cs";
Debug.ShouldStop(256);
__ref.getField(false,"_labellabores" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 202;BA.debugLine="ButtonGrabar.Tag = Consecutivo";
Debug.ShouldStop(512);
__ref.getField(false,"_buttongrabar" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 203;BA.debugLine="ButtonCancelar.Tag = Consecutivo";
Debug.ShouldStop(1024);
__ref.getField(false,"_buttoncancelar" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 205;BA.debugLine="Return panel";
Debug.ShouldStop(4096);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Initialize (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "editperson","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Return Me";
Debug.ShouldStop(1048576);
if (true) return __ref;
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label12fecha_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label12Fecha_Click (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("label12fecha_click")) { return __ref.runUserSub(false, "editperson","label12fecha_click", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Private Sub Label12Fecha_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 58;BA.debugLine="Panel12.Visible = True";
Debug.ShouldStop(33554432);
__ref.getField(false,"_panel12" /*RemoteObject*/ ).runMethod(true,"setVisible",editperson.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _labelatras_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LabelAtras_Click (editperson) ","editperson",5,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("labelatras_click")) { return __ref.runUserSub(false, "editperson","labelatras_click", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Private Sub LabelAtras_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(1048576);
editperson._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}