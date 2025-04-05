package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class detailsperson_subs_0 {


public static void  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "detailsperson","b4xpage_appear", __ref); return;}
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
public ResumableSub_B4XPage_Appear(b4a.example.ef.detailsperson parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.detailsperson parent;
RemoteObject _idperson = RemoteObject.createImmutable("");
RemoteObject _parts = null;
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _nombreempresa = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda = RemoteObject.createImmutable("");
RemoteObject _nombreempresa_limitado = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda_limitado = RemoteObject.createImmutable("");
RemoteObject _row = null;
RemoteObject _codigo = RemoteObject.createImmutable("");
RemoteObject _fecha = RemoteObject.createImmutable("");
RemoteObject _destino = RemoteObject.createImmutable("");
RemoteObject _concepto = RemoteObject.createImmutable("");
RemoteObject _hacienda = RemoteObject.createImmutable("");
RemoteObject _estado = RemoteObject.createImmutable("");
RemoteObject _horas = RemoteObject.createImmutable("");
RemoteObject _cantidad = RemoteObject.createImmutable("");
RemoteObject _valor = RemoteObject.createImmutable("");
RemoteObject _area = RemoteObject.createImmutable("");
RemoteObject _nit = RemoteObject.createImmutable("");
RemoteObject _codigolote = RemoteObject.createImmutable("");
RemoteObject _parts2 = null;
RemoteObject _cmdnombre = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j2 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resnombre = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rownombre = null;
RemoteObject _cmdhacienda = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j3 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reshacienda = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowhacienda = null;
RemoteObject group22;
int index22;
int groupLen22;
RemoteObject group42;
int index42;
int groupLen42;
RemoteObject group54;
int index54;
int groupLen54;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,31);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 32;BA.debugLine="CLV_Persons.Clear";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 33;BA.debugLine="Label3.Text=namePerson";
Debug.ShouldStop(1);
__ref.getField(false,"_label3" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(__ref.getField(true,"_nameperson" /*RemoteObject*/ )));
 BA.debugLineNum = 35;BA.debugLine="Dim idPerson As String";
Debug.ShouldStop(4);
_idperson = RemoteObject.createImmutable("");Debug.locals.put("idPerson", _idperson);
 BA.debugLineNum = 37;BA.debugLine="namePerson=namePerson.Replace(\" \",\"\")";
Debug.ShouldStop(16);
__ref.setField ("_nameperson" /*RemoteObject*/ ,__ref.getField(true,"_nameperson" /*RemoteObject*/ ).runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 38;BA.debugLine="Dim parts() As String = Regex.Split(\"#\", namePers";
Debug.ShouldStop(32);
_parts = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("#")),(Object)(__ref.getField(true,"_nameperson" /*RemoteObject*/ )));Debug.locals.put("parts", _parts);Debug.locals.put("parts", _parts);
 BA.debugLineNum = 39;BA.debugLine="idPerson=parts(1)";
Debug.ShouldStop(64);
_idperson = _parts.getArrayElement(true,BA.numberCast(int.class, 1));Debug.locals.put("idPerson", _idperson);
 BA.debugLineNum = 43;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(1024);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 44;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(2048);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_deta";
Debug.ShouldStop(4096);
_cmd = __ref.runClassMethod (b4a.example.ef.detailsperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_detailsPerson")),(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_idperson),(_idperson)})));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 46;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "detailsperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 37;
return;
case 37:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 48;BA.debugLine="If j.Success Then";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//if
this.state = 36;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 35;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 49;BA.debugLine="sf.Initialize";
Debug.ShouldStop(65536);
__ref.getField(false,"_sf" /*RemoteObject*/ ).runVoidMethod ("_vvv1",__ref.getField(false, "ba"));
 BA.debugLineNum = 50;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(131072);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 51;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(262144);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "detailsperson", "b4xpage_appear"), (_req));
this.state = 38;
return;
case 38:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 53;BA.debugLine="If res.Rows.Size > 0 Then";
Debug.ShouldStop(1048576);
if (true) break;

case 4:
//if
this.state = 33;
if (RemoteObject.solveBoolean(">",_res.getField(false,"Rows" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 32;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 54;BA.debugLine="Dim counter As Int";
Debug.ShouldStop(2097152);
_counter = RemoteObject.createImmutable(0);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 55;BA.debugLine="counter = 0";
Debug.ShouldStop(4194304);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 56;BA.debugLine="Dim nombreEMPRESA As String";
Debug.ShouldStop(8388608);
_nombreempresa = RemoteObject.createImmutable("");Debug.locals.put("nombreEMPRESA", _nombreempresa);
 BA.debugLineNum = 57;BA.debugLine="Dim nombreHacienda As String";
Debug.ShouldStop(16777216);
_nombrehacienda = RemoteObject.createImmutable("");Debug.locals.put("nombreHacienda", _nombrehacienda);
 BA.debugLineNum = 58;BA.debugLine="Dim nombreEMPRESA_Limitado As String";
Debug.ShouldStop(33554432);
_nombreempresa_limitado = RemoteObject.createImmutable("");Debug.locals.put("nombreEMPRESA_Limitado", _nombreempresa_limitado);
 BA.debugLineNum = 59;BA.debugLine="Dim nombreHacienda_Limitado As String";
Debug.ShouldStop(67108864);
_nombrehacienda_limitado = RemoteObject.createImmutable("");Debug.locals.put("nombreHacienda_Limitado", _nombrehacienda_limitado);
 BA.debugLineNum = 61;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(268435456);
if (true) break;

case 7:
//for
this.state = 30;
group22 = _res.getField(false,"Rows" /*RemoteObject*/ );
index22 = 0;
groupLen22 = group22.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 39;
if (true) break;

case 39:
//C
this.state = 30;
if (index22 < groupLen22) {
this.state = 9;
_row = (group22.runMethod(false,"Get",index22));Debug.locals.put("row", _row);}
if (true) break;

case 40:
//C
this.state = 39;
index22++;
Debug.locals.put("row", _row);
if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 62;BA.debugLine="Dim codigo As String = sf.Trim(row(0))";
Debug.ShouldStop(536870912);
_codigo = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 0)))));Debug.locals.put("codigo", _codigo);Debug.locals.put("codigo", _codigo);
 BA.debugLineNum = 63;BA.debugLine="Dim fecha As String = sf.Trim(row(1))";
Debug.ShouldStop(1073741824);
_fecha = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)))));Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 64;BA.debugLine="Dim destino As String = sf.Trim(row(2))";
Debug.ShouldStop(-2147483648);
_destino = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 2)))));Debug.locals.put("destino", _destino);Debug.locals.put("destino", _destino);
 BA.debugLineNum = 65;BA.debugLine="Dim concepto As String = sf.Trim(row(3))";
Debug.ShouldStop(1);
_concepto = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 3)))));Debug.locals.put("concepto", _concepto);Debug.locals.put("concepto", _concepto);
 BA.debugLineNum = 66;BA.debugLine="Dim hacienda As String = sf.Trim(row(4)) ' Cdg";
Debug.ShouldStop(2);
_hacienda = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 4)))));Debug.locals.put("hacienda", _hacienda);Debug.locals.put("hacienda", _hacienda);
 BA.debugLineNum = 67;BA.debugLine="Dim estado As String = sf.Trim(row(5))";
Debug.ShouldStop(4);
_estado = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 5)))));Debug.locals.put("estado", _estado);Debug.locals.put("estado", _estado);
 BA.debugLineNum = 68;BA.debugLine="Dim horas As String = sf.Trim(row(6))";
Debug.ShouldStop(8);
_horas = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 6)))));Debug.locals.put("horas", _horas);Debug.locals.put("horas", _horas);
 BA.debugLineNum = 69;BA.debugLine="Dim cantidad As String = sf.Trim(row(7))";
Debug.ShouldStop(16);
_cantidad = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 7)))));Debug.locals.put("cantidad", _cantidad);Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 70;BA.debugLine="Dim valor As String = sf.Trim(row(8))";
Debug.ShouldStop(32);
_valor = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 8)))));Debug.locals.put("valor", _valor);Debug.locals.put("valor", _valor);
 BA.debugLineNum = 71;BA.debugLine="Dim area As String = sf.Trim(row(9))";
Debug.ShouldStop(64);
_area = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 9)))));Debug.locals.put("area", _area);Debug.locals.put("area", _area);
 BA.debugLineNum = 72;BA.debugLine="Dim Nit As String = sf.Trim(row(10)) ' NIT del";
Debug.ShouldStop(128);
_nit = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 10)))));Debug.locals.put("Nit", _nit);Debug.locals.put("Nit", _nit);
 BA.debugLineNum = 73;BA.debugLine="Dim codigoLote As String = sf.Trim(row(11))";
Debug.ShouldStop(256);
_codigolote = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 11)))));Debug.locals.put("codigoLote", _codigolote);Debug.locals.put("codigoLote", _codigolote);
 BA.debugLineNum = 76;BA.debugLine="Dim parts2() As String";
Debug.ShouldStop(2048);
_parts2 = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("parts2", _parts2);
 BA.debugLineNum = 77;BA.debugLine="parts2 = Regex.Split(\" \", fecha)";
Debug.ShouldStop(4096);
_parts2 = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_fecha));Debug.locals.put("parts2", _parts2);
 BA.debugLineNum = 80;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"se";
Debug.ShouldStop(32768);
_cmdnombre = __ref.runClassMethod (b4a.example.ef.detailsperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit_details")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nit)})));Debug.locals.put("cmdNombre", _cmdnombre);Debug.locals.put("cmdNombre", _cmdnombre);
 BA.debugLineNum = 81;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "detailsperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdnombre),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 41;
return;
case 41:
//C
this.state = 10;
_j2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j2", _j2);
;
 BA.debugLineNum = 83;BA.debugLine="If j2.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 10:
//if
this.state = 19;
if (_j2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 12;
}else {
this.state = 18;
}if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 84;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
Debug.ShouldStop(524288);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j2),(Object)(RemoteObject.createImmutable("req_nombre")));
 BA.debugLineNum = 85;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","req_nombre_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "detailsperson", "b4xpage_appear"), (_req));
this.state = 42;
return;
case 42:
//C
this.state = 13;
_resnombre = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resNombre", _resnombre);
;
 BA.debugLineNum = 87;BA.debugLine="For Each rowNombre() As Object In resNombre.R";
Debug.ShouldStop(4194304);
if (true) break;

case 13:
//for
this.state = 16;
group42 = _resnombre.getField(false,"Rows" /*RemoteObject*/ );
index42 = 0;
groupLen42 = group42.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowNombre", _rownombre);
this.state = 43;
if (true) break;

case 43:
//C
this.state = 16;
if (index42 < groupLen42) {
this.state = 15;
_rownombre = (group42.runMethod(false,"Get",index42));Debug.locals.put("rowNombre", _rownombre);}
if (true) break;

case 44:
//C
this.state = 43;
index42++;
Debug.locals.put("rowNombre", _rownombre);
if (true) break;

case 15:
//C
this.state = 44;
 BA.debugLineNum = 88;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El p";
Debug.ShouldStop(8388608);
_nombreempresa = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_rownombre.getArrayElement(false,BA.numberCast(int.class, 0)))));Debug.locals.put("nombreEMPRESA", _nombreempresa);
 BA.debugLineNum = 89;BA.debugLine="nombreEMPRESA_Limitado = LimitarPalabras(nom";
Debug.ShouldStop(16777216);
_nombreempresa_limitado = __ref.runClassMethod (b4a.example.ef.detailsperson.class, "_limitarpalabras" /*RemoteObject*/ ,(Object)(_nombreempresa),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("nombreEMPRESA_Limitado", _nombreempresa_limitado);
 if (true) break;
if (true) break;

case 16:
//C
this.state = 19;
Debug.locals.put("rowNombre", _rownombre);
;
 if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 92;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente:";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","39175101",RemoteObject.concat(RemoteObject.createImmutable("ERROR al obtener el nombre del cliente: "),_j2.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 96;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"";
Debug.ShouldStop(-2147483648);
_cmdhacienda = __ref.runClassMethod (b4a.example.ef.detailsperson.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_hacienda_details")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_hacienda)})));Debug.locals.put("cmdHacienda", _cmdhacienda);Debug.locals.put("cmdHacienda", _cmdhacienda);
 BA.debugLineNum = 97;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Nul";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "detailsperson", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdhacienda),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 45;
return;
case 45:
//C
this.state = 20;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 99;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(4);
if (true) break;

case 20:
//if
this.state = 29;
if (_j3.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 22;
}else {
this.state = 28;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 100;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
Debug.ShouldStop(8);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_hacienda")));
 BA.debugLineNum = 101;BA.debugLine="Wait For (Req) req_hacienda_Result(resHaciend";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("WaitFor","req_hacienda_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "detailsperson", "b4xpage_appear"), (_req));
this.state = 46;
return;
case 46:
//C
this.state = 23;
_reshacienda = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resHacienda", _reshacienda);
;
 BA.debugLineNum = 103;BA.debugLine="For Each rowHacienda() As Object In resHacien";
Debug.ShouldStop(64);
if (true) break;

case 23:
//for
this.state = 26;
group54 = _reshacienda.getField(false,"Rows" /*RemoteObject*/ );
index54 = 0;
groupLen54 = group54.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowHacienda", _rowhacienda);
this.state = 47;
if (true) break;

case 47:
//C
this.state = 26;
if (index54 < groupLen54) {
this.state = 25;
_rowhacienda = (group54.runMethod(false,"Get",index54));Debug.locals.put("rowHacienda", _rowhacienda);}
if (true) break;

case 48:
//C
this.state = 47;
index54++;
Debug.locals.put("rowHacienda", _rowhacienda);
if (true) break;

case 25:
//C
this.state = 48;
 BA.debugLineNum = 104;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' E";
Debug.ShouldStop(128);
_nombrehacienda = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_rowhacienda.getArrayElement(false,BA.numberCast(int.class, 0)))));Debug.locals.put("nombreHacienda", _nombrehacienda);
 BA.debugLineNum = 105;BA.debugLine="nombreHacienda_Limitado = LimitarPalabras(no";
Debug.ShouldStop(256);
_nombrehacienda_limitado = __ref.runClassMethod (b4a.example.ef.detailsperson.class, "_limitarpalabras" /*RemoteObject*/ ,(Object)(_nombrehacienda),(Object)(BA.numberCast(int.class, 3)));Debug.locals.put("nombreHacienda_Limitado", _nombrehacienda_limitado);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 29;
Debug.locals.put("rowHacienda", _rowhacienda);
;
 if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 108;BA.debugLine="Log(\"ERROR al obtener el nombre de la haciend";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("LogImpl","39175117",RemoteObject.concat(RemoteObject.createImmutable("ERROR al obtener el nombre de la hacienda: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 29:
//C
this.state = 40;
;
 BA.debugLineNum = 112;BA.debugLine="CLV_Persons.Add(CreateItem(counter, parts2(0),";
Debug.ShouldStop(32768);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.detailsperson.class, "_createitem" /*RemoteObject*/ ,(Object)(_counter),(Object)(_parts2.getArrayElement(true,BA.numberCast(int.class, 0))),(Object)(_nombreempresa_limitado),(Object)(RemoteObject.concat(_hacienda,RemoteObject.createImmutable(" - "),_nombrehacienda_limitado)),(Object)(_codigolote)).getObject()),(Object)((_counter)));
 BA.debugLineNum = 113;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(65536);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 33;
Debug.locals.put("row", _row);
;
 if (true) break;

case 32:
//C
this.state = 33;
 BA.debugLineNum = 116;BA.debugLine="CLV_Persons.AddTextItem(\"NO HAY DATOS\", \"no_dat";
Debug.ShouldStop(524288);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_addtextitem",(Object)(RemoteObject.createImmutable(("NO HAY DATOS"))),(Object)((RemoteObject.createImmutable("no_data"))));
 if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 119;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","39175128",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 36:
//C
this.state = -1;
;
 BA.debugLineNum = 124;BA.debugLine="End Sub";
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _req_nombre_result(RemoteObject __ref,RemoteObject _resnombre) throws Exception{
}
public static void  _req_hacienda_result(RemoteObject __ref,RemoteObject _reshacienda) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "detailsperson","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(33554432);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
Debug.ShouldStop(67108864);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"White")),(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"DetaiaPerson\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("DetaiaPerson")),__ref.getField(false, "ba"));
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
public static RemoteObject  _button1check_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button1Check_Click (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("button1check_click")) { return __ref.runUserSub(false, "detailsperson","button1check_click", __ref);}
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
 BA.debugLineNum = 191;BA.debugLine="Private Sub Button1Check_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Try";
Debug.ShouldStop(-2147483648);
try { BA.debugLineNum = 194;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(2);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), detailsperson.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 195;BA.debugLine="Dim index As Int = btn.Tag";
Debug.ShouldStop(4);
_index = BA.numberCast(int.class, _btn.runMethod(false,"getTag"));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 197;BA.debugLine="B4XPages.ShowPage(\"FormPerson\")";
Debug.ShouldStop(16);
detailsperson._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("FormPerson")));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e6) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e6.toString()); BA.debugLineNum = 200;BA.debugLine="Log(LastException)";
Debug.ShouldStop(128);
detailsperson.__c.runVoidMethod ("LogImpl","39371657",BA.ObjectToString(detailsperson.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 };
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
public static void  _button2del_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Button2Del_Click (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("button2del_click")) { __ref.runUserSub(false, "detailsperson","button2del_click", __ref); return;}
ResumableSub_Button2Del_Click rsub = new ResumableSub_Button2Del_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Button2Del_Click extends BA.ResumableSub {
public ResumableSub_Button2Del_Click(b4a.example.ef.detailsperson parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.detailsperson parent;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Button2Del_Click (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,162);
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
 BA.debugLineNum = 163;BA.debugLine="Try";
Debug.ShouldStop(4);
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
 BA.debugLineNum = 165;BA.debugLine="Dim btn As Button = Sender";
Debug.ShouldStop(16);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_btn = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ButtonWrapper"), parent.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 166;BA.debugLine="Dim index As Int = btn.Tag";
Debug.ShouldStop(32);
_index = BA.numberCast(int.class, _btn.runMethod(false,"getTag"));Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 167;BA.debugLine="Log(index)";
Debug.ShouldStop(64);
parent.__c.runVoidMethod ("LogImpl","39306117",BA.NumberToString(_index),0);
 BA.debugLineNum = 169;BA.debugLine="If index >= 0 And index < CLV_Persons.Size Then";
Debug.ShouldStop(256);
if (true) break;

case 4:
//if
this.state = 13;
if (RemoteObject.solveBoolean("g",_index,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("<",_index,BA.numberCast(double.class, __ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runMethod(true,"_getsize")))) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 171;BA.debugLine="Msgbox2Async(\"¿Está seguro de que desea elimina";
Debug.ShouldStop(1024);
parent.__c.runVoidMethod ("Msgbox2Async",(Object)(BA.ObjectToCharSequence("¿Está seguro de que desea eliminar este elemento?")),(Object)(BA.ObjectToCharSequence("Confirmación")),(Object)(BA.ObjectToString("Sí")),(Object)(BA.ObjectToString("Cancelar")),(Object)(BA.ObjectToString("No")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper"), parent.__c.getField(false,"Null")),__ref.getField(false, "ba"),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 172;BA.debugLine="Wait For Msgbox_Result(Result As Int)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","msgbox_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "detailsperson", "button2del_click"), null);
this.state = 17;
return;
case 17:
//C
this.state = 7;
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("Result", _result);
;
 BA.debugLineNum = 175;BA.debugLine="If Result = DialogResponse.POSITIVE Then";
Debug.ShouldStop(16384);
if (true) break;

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, parent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 176;BA.debugLine="CLV_Persons.RemoveAt(index)";
Debug.ShouldStop(32768);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_removeat",(Object)(_index));
 BA.debugLineNum = 177;BA.debugLine="CLV_Persons.Refresh";
Debug.ShouldStop(65536);
__ref.getField(false,"_clv_persons" /*RemoteObject*/ ).runVoidMethod ("_refresh");
 if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
 BA.debugLineNum = 181;BA.debugLine="Log(\"Error: el índice está fuera de los límites";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("LogImpl","39306131",RemoteObject.createImmutable("Error: el índice está fuera de los límites de la lista."),0);
 if (true) break;

case 13:
//C
this.state = 16;
;
 Debug.CheckDeviceExceptions();
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
 BA.debugLineNum = 186;BA.debugLine="Log(LastException)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","39306136",BA.ObjectToString(parent.__c.runMethod(false,"LastException",__ref.getField(false, "ba"))),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
public static void  _msgbox_result(RemoteObject __ref,RemoteObject _result) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
detailsperson._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",detailsperson._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
detailsperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",detailsperson._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
detailsperson._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",detailsperson._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Dim xui As XUI";
detailsperson._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",detailsperson._xui);
 //BA.debugLineNum = 6;BA.debugLine="Public namePerson As String=\"\"";
detailsperson._nameperson = BA.ObjectToString("");__ref.setField("_nameperson",detailsperson._nameperson);
 //BA.debugLineNum = 7;BA.debugLine="Public idPersona As String =\"\"";
detailsperson._idpersona = BA.ObjectToString("");__ref.setField("_idpersona",detailsperson._idpersona);
 //BA.debugLineNum = 8;BA.debugLine="Private CLV_Persons As CustomListView";
detailsperson._clv_persons = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clv_persons",detailsperson._clv_persons);
 //BA.debugLineNum = 9;BA.debugLine="Private Label20Desc As Label";
detailsperson._label20desc = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label20desc",detailsperson._label20desc);
 //BA.debugLineNum = 10;BA.debugLine="Private Button1Check As Button";
detailsperson._button1check = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1check",detailsperson._button1check);
 //BA.debugLineNum = 11;BA.debugLine="Private Button2Del As Button";
detailsperson._button2del = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button2del",detailsperson._button2del);
 //BA.debugLineNum = 12;BA.debugLine="Private Label3 As Label";
detailsperson._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3",detailsperson._label3);
 //BA.debugLineNum = 13;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
detailsperson._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",detailsperson._rdclink);
 //BA.debugLineNum = 14;BA.debugLine="Dim sf As StringFunctions";
detailsperson._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf",detailsperson._sf);
 //BA.debugLineNum = 15;BA.debugLine="Dim sf2 As StringFunctions";
detailsperson._sf2 = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf2",detailsperson._sf2);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "detailsperson","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 210;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(262144);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 212;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(524288);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 213;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(1048576);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 214;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 215;BA.debugLine="Return cmd";
Debug.ShouldStop(4194304);
if (true) return _cmd;
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject __ref,RemoteObject _position,RemoteObject _fecha,RemoteObject _nit,RemoteObject _hacienda,RemoteObject _lote) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "detailsperson","createitem", __ref, _position, _fecha, _nit, _hacienda, _lote);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("position", _position);
Debug.locals.put("Fecha", _fecha);
Debug.locals.put("Nit", _nit);
Debug.locals.put("Hacienda", _hacienda);
Debug.locals.put("Lote", _lote);
 BA.debugLineNum = 128;BA.debugLine="Private Sub CreateItem(position As Int, Fecha As S";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 130;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(2);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 131;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 130dip)";
Debug.ShouldStop(4);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(detailsperson.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(detailsperson.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))));
 BA.debugLineNum = 134;BA.debugLine="panel.LoadLayout(\"Cardp\")";
Debug.ShouldStop(32);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Cardp")),__ref.getField(false, "ba"));
 BA.debugLineNum = 137;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(256);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 138;BA.debugLine="cs.Initialize";
Debug.ShouldStop(512);
_cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 141;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha: \").Pop";
Debug.ShouldStop(4096);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Fecha: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_fecha,detailsperson.__c.getField(true,"CRLF"))))).runVoidMethod ("Pop");
 BA.debugLineNum = 143;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").Pop.C";
Debug.ShouldStop(16384);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Nit: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_nit,detailsperson.__c.getField(true,"CRLF"))))).runVoidMethod ("Pop");
 BA.debugLineNum = 145;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
Debug.ShouldStop(65536);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Hacienda: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_hacienda,detailsperson.__c.getField(true,"CRLF"))))).runVoidMethod ("Pop");
 BA.debugLineNum = 148;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Lote: \").Pop.";
Debug.ShouldStop(524288);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Lote: ")))).runMethod(false,"Pop").runMethod(false,"Color",(Object)(detailsperson.__c.getField(false,"Colors").getField(true,"Gray"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_lote,detailsperson.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 151;BA.debugLine="Label20Desc.Text = cs";
Debug.ShouldStop(4194304);
__ref.getField(false,"_label20desc" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 154;BA.debugLine="Button1Check.Tag = position";
Debug.ShouldStop(33554432);
__ref.getField(false,"_button1check" /*RemoteObject*/ ).runMethod(false,"setTag",(_position));
 BA.debugLineNum = 155;BA.debugLine="Button2Del.Tag = position";
Debug.ShouldStop(67108864);
__ref.getField(false,"_button2del" /*RemoteObject*/ ).runMethod(false,"setTag",(_position));
 BA.debugLineNum = 158;BA.debugLine="Return panel";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Initialize (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "detailsperson","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("Label1_Click (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("label1_click")) { return __ref.runUserSub(false, "detailsperson","label1_click", __ref);}
 BA.debugLineNum = 206;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16384);
detailsperson._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("label2_click")) { return __ref.runUserSub(false, "detailsperson","label2_click", __ref);}
 BA.debugLineNum = 219;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 220;BA.debugLine="B4XPages.ShowPage(\"FormPerson\")";
Debug.ShouldStop(134217728);
detailsperson._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("FormPerson")));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _limitarpalabras(RemoteObject __ref,RemoteObject _texto,RemoteObject _maxpalabras) throws Exception{
try {
		Debug.PushSubsStack("LimitarPalabras (detailsperson) ","detailsperson",9,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("limitarpalabras")) { return __ref.runUserSub(false, "detailsperson","limitarpalabras", __ref, _texto, _maxpalabras);}
RemoteObject _palabras = null;
RemoteObject _resultado = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
int _i = 0;
Debug.locals.put("texto", _texto);
Debug.locals.put("maxPalabras", _maxpalabras);
 BA.debugLineNum = 224;BA.debugLine="Sub LimitarPalabras(texto As String, maxPalabras A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="Dim palabras() As String";
Debug.ShouldStop(1);
_palabras = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("palabras", _palabras);
 BA.debugLineNum = 226;BA.debugLine="palabras = Regex.Split(\"\\s+\", texto) ' Dividimos";
Debug.ShouldStop(2);
_palabras = detailsperson.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString("\\s+")),(Object)(_texto));Debug.locals.put("palabras", _palabras);
 BA.debugLineNum = 228;BA.debugLine="Dim resultado As StringBuilder";
Debug.ShouldStop(8);
_resultado = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("resultado", _resultado);
 BA.debugLineNum = 229;BA.debugLine="resultado.Initialize";
Debug.ShouldStop(16);
_resultado.runVoidMethod ("Initialize");
 BA.debugLineNum = 232;BA.debugLine="For i = 0 To Min(palabras.Length - 1, maxPalabras";
Debug.ShouldStop(128);
{
final int step5 = 1;
final int limit5 = (int) (0 + detailsperson.__c.runMethod(true,"Min",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_palabras.getField(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_maxpalabras,RemoteObject.createImmutable(1)}, "-",1, 1)))).<Double>get().doubleValue());
_i = 0 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 233;BA.debugLine="resultado.Append(palabras(i)).Append(\" \")";
Debug.ShouldStop(256);
_resultado.runMethod(false,"Append",(Object)(_palabras.getArrayElement(true,BA.numberCast(int.class, _i)))).runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 237;BA.debugLine="If palabras.Length > maxPalabras Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(">",_palabras.getField(true,"length"),BA.numberCast(double.class, _maxpalabras))) { 
 BA.debugLineNum = 238;BA.debugLine="resultado.Append(\"...\")";
Debug.ShouldStop(8192);
_resultado.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("...")));
 };
 BA.debugLineNum = 241;BA.debugLine="Return resultado.ToString.Trim";
Debug.ShouldStop(65536);
if (true) return _resultado.runMethod(true,"ToString").runMethod(true,"trim");
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}