package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class listlabores_subs_0 {


public static void  _b4xpage_appear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("b4xpage_appear")) { __ref.runUserSub(false, "listlabores","b4xpage_appear", __ref); return;}
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
public ResumableSub_B4XPage_Appear(b4a.example.ef.listlabores parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.listlabores parent;
RemoteObject _nombreempresa = RemoteObject.createImmutable("");
RemoteObject _nombrehacienda = RemoteObject.createImmutable("");
RemoteObject _nombrelabor = RemoteObject.createImmutable("");
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _counter = RemoteObject.createImmutable(0);
RemoteObject _res = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _row = null;
RemoteObject _consecutivo = RemoteObject.createImmutable(0);
RemoteObject _nit_programa_labor = RemoteObject.createImmutable("");
RemoteObject _hacienda_programa_labor = RemoteObject.createImmutable("");
RemoteObject _suerte_programa_labor = RemoteObject.createImmutable("");
RemoteObject _fecha_programa_labor = RemoteObject.createImmutable("");
RemoteObject _destino_programa_labor = RemoteObject.createImmutable("");
RemoteObject _area_programa_labor = RemoteObject.createImmutable("");
RemoteObject _observacion = RemoteObject.createImmutable("");
RemoteObject _partesfecha = null;
RemoteObject _cmdnombre = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j2 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _resnombre = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rownombre = null;
RemoteObject _cmdhacienda = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j3 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reshacienda = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowhacienda = null;
RemoteObject _cmdlabor = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
RemoteObject _j4 = RemoteObject.declareNull("b4a.example.ef.httpjob");
RemoteObject _reslabor = RemoteObject.declareNull("b4a.example.ef.main._dbresult");
RemoteObject _rowlabor = null;
RemoteObject _fecha = RemoteObject.createImmutable(0L);
RemoteObject _fechaunix = RemoteObject.createImmutable(0L);
RemoteObject _fechaactual = RemoteObject.createImmutable(0L);
RemoteObject _fechaunixactual = RemoteObject.createImmutable(0L);
RemoteObject _diferenciasegundos = RemoteObject.createImmutable(0L);
RemoteObject _diferenciadias = RemoteObject.createImmutable(0);
RemoteObject group16;
int index16;
int groupLen16;
RemoteObject group42;
int index42;
int groupLen42;
RemoteObject group53;
int index53;
int groupLen53;
RemoteObject group64;
int index64;
int groupLen64;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Appear (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,34);
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
 BA.debugLineNum = 35;BA.debugLine="CLV_Labores.Clear";
Debug.ShouldStop(4);
__ref.getField(false,"_clv_labores" /*RemoteObject*/ ).runVoidMethod ("_clear");
 BA.debugLineNum = 36;BA.debugLine="GifViewerLoading.Start";
Debug.ShouldStop(8);
__ref.getField(false,"_gifviewerloading" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.gifviewer.class, "_start" /*RemoteObject*/ );
 BA.debugLineNum = 37;BA.debugLine="Dim nombreEMPRESA As String";
Debug.ShouldStop(16);
_nombreempresa = RemoteObject.createImmutable("");Debug.locals.put("nombreEMPRESA", _nombreempresa);
 BA.debugLineNum = 38;BA.debugLine="Dim nombreHacienda As String";
Debug.ShouldStop(32);
_nombrehacienda = RemoteObject.createImmutable("");Debug.locals.put("nombreHacienda", _nombrehacienda);
 BA.debugLineNum = 39;BA.debugLine="Dim nombreLabor As String";
Debug.ShouldStop(64);
_nombrelabor = RemoteObject.createImmutable("");Debug.locals.put("nombreLabor", _nombrelabor);
 BA.debugLineNum = 42;BA.debugLine="Dim Req As DBRequestManager";
Debug.ShouldStop(512);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("Req", _req);
 BA.debugLineNum = 43;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
Debug.ShouldStop(1024);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.concat(__ref.getField(true,"_rdclink" /*RemoteObject*/ ),RemoteObject.createImmutable("?DBName="),parent._main._pdbname /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_prog";
Debug.ShouldStop(2048);
_cmd = __ref.runClassMethod (b4a.example.ef.listlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_programalabores")),(Object)((parent.__c.getField(false,"Null"))));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 47;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
Debug.ShouldStop(16384);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 46;
return;
case 46:
//C
this.state = 1;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 48;BA.debugLine="Dim counter As Int";
Debug.ShouldStop(32768);
_counter = RemoteObject.createImmutable(0);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 49;BA.debugLine="counter = 0";
Debug.ShouldStop(65536);
_counter = BA.numberCast(int.class, 0);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 52;BA.debugLine="If j.Success Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 45;
if (_j.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 44;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 53;BA.debugLine="sf.Initialize";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sf" /*RemoteObject*/ ).runVoidMethod ("_vvv1",__ref.getField(false, "ba"));
 BA.debugLineNum = 54;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(2097152);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 56;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","req_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req));
this.state = 47;
return;
case 47:
//C
this.state = 4;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 59;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(67108864);
if (true) break;

case 4:
//for
this.state = 42;
group16 = _res.getField(false,"Rows" /*RemoteObject*/ );
index16 = 0;
groupLen16 = group16.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 48;
if (true) break;

case 48:
//C
this.state = 42;
if (index16 < groupLen16) {
this.state = 6;
_row = (group16.runMethod(false,"Get",index16));Debug.locals.put("row", _row);}
if (true) break;

case 49:
//C
this.state = 48;
index16++;
Debug.locals.put("row", _row);
if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 61;BA.debugLine="Dim Consecutivo As Int = row(0)";
Debug.ShouldStop(268435456);
_consecutivo = BA.numberCast(int.class, _row.getArrayElement(false,BA.numberCast(int.class, 0)));Debug.locals.put("Consecutivo", _consecutivo);Debug.locals.put("Consecutivo", _consecutivo);
 BA.debugLineNum = 64;BA.debugLine="Dim Nit_Programa_Labor As String = row(1)";
Debug.ShouldStop(-2147483648);
_nit_programa_labor = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 1)));Debug.locals.put("Nit_Programa_Labor", _nit_programa_labor);Debug.locals.put("Nit_Programa_Labor", _nit_programa_labor);
 BA.debugLineNum = 67;BA.debugLine="Dim Hacienda_Programa_Labor As String = row(2)";
Debug.ShouldStop(4);
_hacienda_programa_labor = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 2)));Debug.locals.put("Hacienda_Programa_Labor", _hacienda_programa_labor);Debug.locals.put("Hacienda_Programa_Labor", _hacienda_programa_labor);
 BA.debugLineNum = 70;BA.debugLine="Dim Suerte_Programa_Labor As String = row(3)";
Debug.ShouldStop(32);
_suerte_programa_labor = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 3)));Debug.locals.put("Suerte_Programa_Labor", _suerte_programa_labor);Debug.locals.put("Suerte_Programa_Labor", _suerte_programa_labor);
 BA.debugLineNum = 73;BA.debugLine="Dim Fecha_Programa_Labor As String = row(4)";
Debug.ShouldStop(256);
_fecha_programa_labor = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 4)));Debug.locals.put("Fecha_Programa_Labor", _fecha_programa_labor);Debug.locals.put("Fecha_Programa_Labor", _fecha_programa_labor);
 BA.debugLineNum = 76;BA.debugLine="Dim Destino_Programa_Labor As String = row(5)";
Debug.ShouldStop(2048);
_destino_programa_labor = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 5)));Debug.locals.put("Destino_Programa_Labor", _destino_programa_labor);Debug.locals.put("Destino_Programa_Labor", _destino_programa_labor);
 BA.debugLineNum = 79;BA.debugLine="Dim Area_Programa_Labor As String = row(6)";
Debug.ShouldStop(16384);
_area_programa_labor = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 6)));Debug.locals.put("Area_Programa_Labor", _area_programa_labor);Debug.locals.put("Area_Programa_Labor", _area_programa_labor);
 BA.debugLineNum = 82;BA.debugLine="Dim Observacion As String = row(7)";
Debug.ShouldStop(131072);
_observacion = BA.ObjectToString(_row.getArrayElement(false,BA.numberCast(int.class, 7)));Debug.locals.put("Observacion", _observacion);Debug.locals.put("Observacion", _observacion);
 BA.debugLineNum = 85;BA.debugLine="Dim partesFecha() As String";
Debug.ShouldStop(1048576);
_partesfecha = RemoteObject.createNewArray ("String", new int[] {0}, new Object[]{});Debug.locals.put("partesFecha", _partesfecha);
 BA.debugLineNum = 86;BA.debugLine="partesFecha = Regex.Split(\" \", Fecha_Programa_L";
Debug.ShouldStop(2097152);
_partesfecha = parent.__c.getField(false,"Regex").runMethod(false,"Split",(Object)(BA.ObjectToString(" ")),(Object)(_fecha_programa_labor));Debug.locals.put("partesFecha", _partesfecha);
 BA.debugLineNum = 87;BA.debugLine="Fecha_Programa_Labor = partesFecha(0)";
Debug.ShouldStop(4194304);
_fecha_programa_labor = _partesfecha.getArrayElement(true,BA.numberCast(int.class, 0));Debug.locals.put("Fecha_Programa_Labor", _fecha_programa_labor);
 BA.debugLineNum = 89;BA.debugLine="Log(\"Contador: \" & counter)";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("LogImpl","74784183",RemoteObject.concat(RemoteObject.createImmutable("Contador: "),_counter),0);
 BA.debugLineNum = 90;BA.debugLine="Log(\"Consecutivo: \" & Consecutivo)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("LogImpl","74784184",RemoteObject.concat(RemoteObject.createImmutable("Consecutivo: "),_consecutivo),0);
 BA.debugLineNum = 91;BA.debugLine="Log(\"Nit_Programa_Labor: \" & Nit_Programa_Labor";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("LogImpl","74784185",RemoteObject.concat(RemoteObject.createImmutable("Nit_Programa_Labor: "),_nit_programa_labor),0);
 BA.debugLineNum = 92;BA.debugLine="Log(\"Hacienda_Programa_Labor: \" & Hacienda_Prog";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","74784186",RemoteObject.concat(RemoteObject.createImmutable("Hacienda_Programa_Labor: "),_hacienda_programa_labor),0);
 BA.debugLineNum = 93;BA.debugLine="Log(\"Suerte_Programa_Labor: \" & Suerte_Programa";
Debug.ShouldStop(268435456);
parent.__c.runVoidMethod ("LogImpl","74784187",RemoteObject.concat(RemoteObject.createImmutable("Suerte_Programa_Labor: "),_suerte_programa_labor),0);
 BA.debugLineNum = 94;BA.debugLine="Log(\"Fecha_Programa_Labor: \" & Fecha_Programa_L";
Debug.ShouldStop(536870912);
parent.__c.runVoidMethod ("LogImpl","74784188",RemoteObject.concat(RemoteObject.createImmutable("Fecha_Programa_Labor: "),_fecha_programa_labor),0);
 BA.debugLineNum = 95;BA.debugLine="Log(\"Destino_Programa_Labor: \" & Destino_Progra";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","74784189",RemoteObject.concat(RemoteObject.createImmutable("Destino_Programa_Labor: "),_destino_programa_labor),0);
 BA.debugLineNum = 96;BA.debugLine="Log(\"Area_Programa_Labor: \" & Area_Programa_Lab";
Debug.ShouldStop(-2147483648);
parent.__c.runVoidMethod ("LogImpl","74784190",RemoteObject.concat(RemoteObject.createImmutable("Area_Programa_Labor: "),_area_programa_labor),0);
 BA.debugLineNum = 97;BA.debugLine="Log(\"Observacion: \"& Observacion)";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("LogImpl","74784191",RemoteObject.concat(RemoteObject.createImmutable("Observacion: "),_observacion),0);
 BA.debugLineNum = 101;BA.debugLine="Dim cmdNombre As DBCommand = CreateCommand(\"sel";
Debug.ShouldStop(16);
_cmdnombre = __ref.runClassMethod (b4a.example.ef.listlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_nit_details")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_nit_programa_labor)})));Debug.locals.put("cmdNombre", _cmdnombre);Debug.locals.put("cmdNombre", _cmdnombre);
 BA.debugLineNum = 102;BA.debugLine="Wait For (Req.ExecuteQuery(cmdNombre, 0, Null))";
Debug.ShouldStop(32);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdnombre),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 50;
return;
case 50:
//C
this.state = 7;
_j2 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j2", _j2);
;
 BA.debugLineNum = 104;BA.debugLine="If j2.Success Then";
Debug.ShouldStop(128);
if (true) break;

case 7:
//if
this.state = 16;
if (_j2.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 105;BA.debugLine="Req.HandleJobAsync(j2, \"req_nombre\")";
Debug.ShouldStop(256);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j2),(Object)(RemoteObject.createImmutable("req_nombre")));
 BA.debugLineNum = 106;BA.debugLine="Wait For (Req) req_nombre_Result(resNombre As";
Debug.ShouldStop(512);
parent.__c.runVoidMethod ("WaitFor","req_nombre_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req));
this.state = 51;
return;
case 51:
//C
this.state = 10;
_resnombre = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resNombre", _resnombre);
;
 BA.debugLineNum = 108;BA.debugLine="For Each rowNombre() As Object In resNombre.Ro";
Debug.ShouldStop(2048);
if (true) break;

case 10:
//for
this.state = 13;
group42 = _resnombre.getField(false,"Rows" /*RemoteObject*/ );
index42 = 0;
groupLen42 = group42.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowNombre", _rownombre);
this.state = 52;
if (true) break;

case 52:
//C
this.state = 13;
if (index42 < groupLen42) {
this.state = 12;
_rownombre = (group42.runMethod(false,"Get",index42));Debug.locals.put("rowNombre", _rownombre);}
if (true) break;

case 53:
//C
this.state = 52;
index42++;
Debug.locals.put("rowNombre", _rownombre);
if (true) break;

case 12:
//C
this.state = 53;
 BA.debugLineNum = 109;BA.debugLine="nombreEMPRESA = sf.Trim(rowNombre(0)) ' El pr";
Debug.ShouldStop(4096);
_nombreempresa = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_rownombre.getArrayElement(false,BA.numberCast(int.class, 0)))));Debug.locals.put("nombreEMPRESA", _nombreempresa);
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
Debug.locals.put("rowNombre", _rownombre);
;
 if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 112;BA.debugLine="Log(\"ERROR al obtener el nombre del cliente: \"";
Debug.ShouldStop(32768);
parent.__c.runVoidMethod ("LogImpl","74784206",RemoteObject.concat(RemoteObject.createImmutable("ERROR al obtener el nombre del cliente: "),_j2.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 116;BA.debugLine="Dim cmdHacienda As DBCommand = CreateCommand(\"s";
Debug.ShouldStop(524288);
_cmdhacienda = __ref.runClassMethod (b4a.example.ef.listlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_hacienda_details")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_hacienda_programa_labor)})));Debug.locals.put("cmdHacienda", _cmdhacienda);Debug.locals.put("cmdHacienda", _cmdhacienda);
 BA.debugLineNum = 117;BA.debugLine="Wait For (Req.ExecuteQuery(cmdHacienda, 0, Null";
Debug.ShouldStop(1048576);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdhacienda),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 54;
return;
case 54:
//C
this.state = 17;
_j3 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j3", _j3);
;
 BA.debugLineNum = 119;BA.debugLine="If j3.Success Then";
Debug.ShouldStop(4194304);
if (true) break;

case 17:
//if
this.state = 26;
if (_j3.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 19;
}else {
this.state = 25;
}if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 120;BA.debugLine="Req.HandleJobAsync(j3, \"req_hacienda\")";
Debug.ShouldStop(8388608);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j3),(Object)(RemoteObject.createImmutable("req_hacienda")));
 BA.debugLineNum = 121;BA.debugLine="Wait For (Req) req_hacienda_Result(resHacienda";
Debug.ShouldStop(16777216);
parent.__c.runVoidMethod ("WaitFor","req_hacienda_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req));
this.state = 55;
return;
case 55:
//C
this.state = 20;
_reshacienda = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resHacienda", _reshacienda);
;
 BA.debugLineNum = 123;BA.debugLine="For Each rowHacienda() As Object In resHaciend";
Debug.ShouldStop(67108864);
if (true) break;

case 20:
//for
this.state = 23;
group53 = _reshacienda.getField(false,"Rows" /*RemoteObject*/ );
index53 = 0;
groupLen53 = group53.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowHacienda", _rowhacienda);
this.state = 56;
if (true) break;

case 56:
//C
this.state = 23;
if (index53 < groupLen53) {
this.state = 22;
_rowhacienda = (group53.runMethod(false,"Get",index53));Debug.locals.put("rowHacienda", _rowhacienda);}
if (true) break;

case 57:
//C
this.state = 56;
index53++;
Debug.locals.put("rowHacienda", _rowhacienda);
if (true) break;

case 22:
//C
this.state = 57;
 BA.debugLineNum = 124;BA.debugLine="nombreHacienda = sf.Trim(rowHacienda(0)) ' El";
Debug.ShouldStop(134217728);
_nombrehacienda = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_rowhacienda.getArrayElement(false,BA.numberCast(int.class, 0)))));Debug.locals.put("nombreHacienda", _nombrehacienda);
 if (true) break;
if (true) break;

case 23:
//C
this.state = 26;
Debug.locals.put("rowHacienda", _rowhacienda);
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 127;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("LogImpl","74784221",RemoteObject.concat(RemoteObject.createImmutable("ERROR al obtener el nombre de la hacienda: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 26:
//C
this.state = 27;
;
 BA.debugLineNum = 131;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"sele";
Debug.ShouldStop(4);
_cmdlabor = __ref.runClassMethod (b4a.example.ef.listlabores.class, "_createcommand" /*RemoteObject*/ ,(Object)(BA.ObjectToString("select_programa_labores_destino")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_destino_programa_labor)})));Debug.locals.put("cmdLabor", _cmdlabor);Debug.locals.put("cmdLabor", _cmdlabor);
 BA.debugLineNum = 132;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null))";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmdlabor),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(false,"Null")))));
this.state = 58;
return;
case 58:
//C
this.state = 27;
_j4 = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("j4", _j4);
;
 BA.debugLineNum = 134;BA.debugLine="If j4.Success Then";
Debug.ShouldStop(32);
if (true) break;

case 27:
//if
this.state = 36;
if (_j4.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 29;
}else {
this.state = 35;
}if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 135;BA.debugLine="Req.HandleJobAsync(j4, \"req_labor\")";
Debug.ShouldStop(64);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j4),(Object)(RemoteObject.createImmutable("req_labor")));
 BA.debugLineNum = 136;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DB";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("WaitFor","req_labor_result", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "listlabores", "b4xpage_appear"), (_req));
this.state = 59;
return;
case 59:
//C
this.state = 30;
_reslabor = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resLabor", _reslabor);
;
 BA.debugLineNum = 138;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
Debug.ShouldStop(512);
if (true) break;

case 30:
//for
this.state = 33;
group64 = _reslabor.getField(false,"Rows" /*RemoteObject*/ );
index64 = 0;
groupLen64 = group64.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("rowLabor", _rowlabor);
this.state = 60;
if (true) break;

case 60:
//C
this.state = 33;
if (index64 < groupLen64) {
this.state = 32;
_rowlabor = (group64.runMethod(false,"Get",index64));Debug.locals.put("rowLabor", _rowlabor);}
if (true) break;

case 61:
//C
this.state = 60;
index64++;
Debug.locals.put("rowLabor", _rowlabor);
if (true) break;

case 32:
//C
this.state = 61;
 BA.debugLineNum = 139;BA.debugLine="nombreLabor = sf.Trim(rowLabor(0)) ' El prime";
Debug.ShouldStop(1024);
_nombrelabor = __ref.getField(false,"_sf" /*RemoteObject*/ ).runMethod(true,"_vvvvv7",(Object)(BA.ObjectToString(_rowlabor.getArrayElement(false,BA.numberCast(int.class, 0)))));Debug.locals.put("nombreLabor", _nombrelabor);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 36;
Debug.locals.put("rowLabor", _rowlabor);
;
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 142;BA.debugLine="Log(\"ERROR al obtener el nombre de la hacienda";
Debug.ShouldStop(8192);
parent.__c.runVoidMethod ("LogImpl","74784236",RemoteObject.concat(RemoteObject.createImmutable("ERROR al obtener el nombre de la hacienda: "),_j3.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;
;
 BA.debugLineNum = 146;BA.debugLine="Try";
Debug.ShouldStop(131072);

case 36:
//try
this.state = 41;
this.catchState = 40;
this.state = 38;
if (true) break;

case 38:
//C
this.state = 41;
this.catchState = 40;
 BA.debugLineNum = 148;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(524288);
parent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 149;BA.debugLine="Dim fecha As Long = DateTime.DateParse(Fecha_P";
Debug.ShouldStop(1048576);
_fecha = parent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(_fecha_programa_labor));Debug.locals.put("fecha", _fecha);Debug.locals.put("fecha", _fecha);
 BA.debugLineNum = 150;BA.debugLine="Dim fechaUNIX As Long = DateUtils.TicksToUnixT";
Debug.ShouldStop(2097152);
_fechaunix = parent._dateutils.runMethod(true,"_tickstounixtime",__ref.getField(false, "ba"),(Object)(_fecha));Debug.locals.put("fechaUNIX", _fechaunix);Debug.locals.put("fechaUNIX", _fechaunix);
 BA.debugLineNum = 151;BA.debugLine="Log(\"LA FECHA EN LONG: \"&fechaUNIX)";
Debug.ShouldStop(4194304);
parent.__c.runVoidMethod ("LogImpl","74784245",RemoteObject.concat(RemoteObject.createImmutable("LA FECHA EN LONG: "),_fechaunix),0);
 BA.debugLineNum = 154;BA.debugLine="Dim fechaActual As Long = DateTime.Now";
Debug.ShouldStop(33554432);
_fechaactual = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("fechaActual", _fechaactual);Debug.locals.put("fechaActual", _fechaactual);
 BA.debugLineNum = 155;BA.debugLine="Dim fechaUNIXACTUAL As Long = DateUtils.TicksT";
Debug.ShouldStop(67108864);
_fechaunixactual = parent._dateutils.runMethod(true,"_tickstounixtime",__ref.getField(false, "ba"),(Object)(_fechaactual));Debug.locals.put("fechaUNIXACTUAL", _fechaunixactual);Debug.locals.put("fechaUNIXACTUAL", _fechaunixactual);
 BA.debugLineNum = 156;BA.debugLine="Log(\"LA FECHA ACTUAL: \"&fechaUNIXACTUAL)";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethod ("LogImpl","74784250",RemoteObject.concat(RemoteObject.createImmutable("LA FECHA ACTUAL: "),_fechaunixactual),0);
 BA.debugLineNum = 159;BA.debugLine="Dim diferenciaSegundos As Long = fechaUNIXACTU";
Debug.ShouldStop(1073741824);
_diferenciasegundos = RemoteObject.solve(new RemoteObject[] {_fechaunixactual,_fechaunix}, "-",1, 2);Debug.locals.put("diferenciaSegundos", _diferenciasegundos);Debug.locals.put("diferenciaSegundos", _diferenciasegundos);
 BA.debugLineNum = 162;BA.debugLine="Dim diferenciaDias As Int = diferenciaSegundos";
Debug.ShouldStop(2);
_diferenciadias = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_diferenciasegundos,RemoteObject.createImmutable(86400)}, "/",0, 0));Debug.locals.put("diferenciaDias", _diferenciadias);Debug.locals.put("diferenciaDias", _diferenciadias);
 BA.debugLineNum = 165;BA.debugLine="Log(\"Días de diferencia: \" & diferenciaDias)";
Debug.ShouldStop(16);
parent.__c.runVoidMethod ("LogImpl","74784259",RemoteObject.concat(RemoteObject.createImmutable("Días de diferencia: "),_diferenciadias),0);
 Debug.CheckDeviceExceptions();
if (true) break;

case 40:
//C
this.state = 41;
this.catchState = 0;
 BA.debugLineNum = 168;BA.debugLine="Log(\"Error: Formato de fecha inválido o no se";
Debug.ShouldStop(128);
parent.__c.runVoidMethod ("LogImpl","74784262",RemoteObject.createImmutable("Error: Formato de fecha inválido o no se pudo parsear la fecha."),0);
 if (true) break;
if (true) break;

case 41:
//C
this.state = 49;
this.catchState = 0;
;
 BA.debugLineNum = 171;BA.debugLine="CLV_Labores.Add(CreateItem(counter,Consecutivo,";
Debug.ShouldStop(1024);
__ref.getField(false,"_clv_labores" /*RemoteObject*/ ).runVoidMethod ("_add",RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), __ref.runClassMethod (b4a.example.ef.listlabores.class, "_createitem" /*RemoteObject*/ ,(Object)(BA.NumberToString(_counter)),(Object)(BA.NumberToString(_consecutivo)),(Object)(_nombreempresa),(Object)(_nombrehacienda),(Object)(_suerte_programa_labor),(Object)(_area_programa_labor),(Object)(_nombrelabor),(Object)(_fecha_programa_labor),(Object)(BA.NumberToString(_diferenciadias)),(Object)(_observacion)).getObject()),(Object)((_consecutivo)));
 BA.debugLineNum = 172;BA.debugLine="counter = counter + 1";
Debug.ShouldStop(2048);
_counter = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("counter", _counter);
 if (true) break;
if (true) break;

case 42:
//C
this.state = 45;
Debug.locals.put("row", _row);
;
 BA.debugLineNum = 175;BA.debugLine="GifViewerLoading.Stop";
Debug.ShouldStop(16384);
__ref.getField(false,"_gifviewerloading" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.gifviewer.class, "_stop" /*RemoteObject*/ );
 if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 177;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(65536);
parent.__c.runVoidMethod ("LogImpl","74784271",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 45:
//C
this.state = -1;
;
 BA.debugLineNum = 179;BA.debugLine="j.Release";
Debug.ShouldStop(262144);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static void  _req_result(RemoteObject __ref,RemoteObject _res) throws Exception{
}
public static void  _req_nombre_result(RemoteObject __ref,RemoteObject _resnombre) throws Exception{
}
public static void  _req_hacienda_result(RemoteObject __ref,RemoteObject _reshacienda) throws Exception{
}
public static void  _req_labor_result(RemoteObject __ref,RemoteObject _reslabor) throws Exception{
}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "listlabores","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 24;BA.debugLine="Root = Root1";
Debug.ShouldStop(8388608);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 25;BA.debugLine="utilClass.Initialize";
Debug.ShouldStop(16777216);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 26;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
Debug.ShouldStop(33554432);
__ref.getField(false,"_utilclass" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.util.class, "_setstatusbarcolor" /*RemoteObject*/ ,(Object)(listlabores.__c.getField(false,"Colors").getField(true,"White")),(Object)(listlabores.__c.getField(false,"Colors").getField(true,"White")));
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"ListLaboresCampo\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("ListLaboresCampo")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="GifViewerLoading.SetGif(File.DirAssets,\"carga.gif";
Debug.ShouldStop(268435456);
__ref.getField(false,"_gifviewerloading" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.gifviewer.class, "_setgif" /*RemoteObject*/ ,(Object)(listlabores.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("carga.gif")));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttonaplazar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonAplazar_Click (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("buttonaplazar_click")) { return __ref.runUserSub(false, "listlabores","buttonaplazar_click", __ref);}
 BA.debugLineNum = 250;BA.debugLine="Private Sub ButtonAplazar_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttoncancelar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ButtonCancelar_Click (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("buttoncancelar_click")) { return __ref.runUserSub(false, "listlabores","buttoncancelar_click", __ref);}
 BA.debugLineNum = 246;BA.debugLine="Private Sub ButtonCancelar_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("ButtonGrabar_Click (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("buttongrabar_click")) { return __ref.runUserSub(false, "listlabores","buttongrabar_click", __ref);}
 BA.debugLineNum = 242;BA.debugLine="Private Sub ButtonGrabar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
listlabores._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",listlabores._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
listlabores._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",listlabores._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
listlabores._utilclass = RemoteObject.createNew ("b4a.example.ef.util");__ref.setField("_utilclass",listlabores._utilclass);
 //BA.debugLineNum = 5;BA.debugLine="Dim xui As XUI";
listlabores._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",listlabores._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private GifViewerLoading As GifViewer";
listlabores._gifviewerloading = RemoteObject.createNew ("b4a.example.ef.gifviewer");__ref.setField("_gifviewerloading",listlabores._gifviewerloading);
 //BA.debugLineNum = 7;BA.debugLine="Private CLV_Labores As CustomListView";
listlabores._clv_labores = RemoteObject.createNew ("b4a.example3.customlistview");__ref.setField("_clv_labores",listlabores._clv_labores);
 //BA.debugLineNum = 8;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
listlabores._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");__ref.setField("_rdclink",listlabores._rdclink);
 //BA.debugLineNum = 9;BA.debugLine="Private LabelLabores As Label";
listlabores._labellabores = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_labellabores",listlabores._labellabores);
 //BA.debugLineNum = 10;BA.debugLine="Private ButtonGrabar As Button";
listlabores._buttongrabar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttongrabar",listlabores._buttongrabar);
 //BA.debugLineNum = 11;BA.debugLine="Private ButtonCancelar As Button";
listlabores._buttoncancelar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttoncancelar",listlabores._buttoncancelar);
 //BA.debugLineNum = 12;BA.debugLine="Private ButtonAplazar As Button";
listlabores._buttonaplazar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_buttonaplazar",listlabores._buttonaplazar);
 //BA.debugLineNum = 13;BA.debugLine="Private sf As StringFunctions";
listlabores._sf = RemoteObject.createNew ("ADR.stringdemo.stringfunctions");__ref.setField("_sf",listlabores._sf);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcommand(RemoteObject __ref,RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("createcommand")) { return __ref.runUserSub(false, "listlabores","createcommand", __ref, _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 232;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(128);
 BA.debugLineNum = 233;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(256);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 234;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(512);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 235;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(1024);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 236;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 237;BA.debugLine="Return cmd";
Debug.ShouldStop(4096);
if (true) return _cmd;
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createitem(RemoteObject __ref,RemoteObject _position,RemoteObject _consecutivo,RemoteObject _nit,RemoteObject _hacienda,RemoteObject _suerte,RemoteObject _area,RemoteObject _labor,RemoteObject _fechapro,RemoteObject _retraso,RemoteObject _observacion) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "listlabores","createitem", __ref, _position, _consecutivo, _nit, _hacienda, _suerte, _area, _labor, _fechapro, _retraso, _observacion);}
RemoteObject _panel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _cs = RemoteObject.declareNull("anywheresoftware.b4a.objects.CSBuilder");
Debug.locals.put("Position", _position);
Debug.locals.put("Consecutivo", _consecutivo);
Debug.locals.put("Nit", _nit);
Debug.locals.put("Hacienda", _hacienda);
Debug.locals.put("Suerte", _suerte);
Debug.locals.put("Area", _area);
Debug.locals.put("Labor", _labor);
Debug.locals.put("FechaPro", _fechapro);
Debug.locals.put("Retraso", _retraso);
Debug.locals.put("Observacion", _observacion);
 BA.debugLineNum = 183;BA.debugLine="Private Sub CreateItem(Position As String,Consecut";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 185;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
Debug.ShouldStop(16777216);
_panel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_panel = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("panel", _panel);Debug.locals.put("panel", _panel);
 BA.debugLineNum = 186;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 420dip)";
Debug.ShouldStop(33554432);
_panel.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(listlabores.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(listlabores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 420)))));
 BA.debugLineNum = 189;BA.debugLine="panel.LoadLayout(\"CardLabores\")";
Debug.ShouldStop(268435456);
_panel.runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("CardLabores")),__ref.getField(false, "ba"));
 BA.debugLineNum = 191;BA.debugLine="Dim cs As CSBuilder";
Debug.ShouldStop(1073741824);
_cs = RemoteObject.createNew ("anywheresoftware.b4a.objects.CSBuilder");Debug.locals.put("cs", _cs);
 BA.debugLineNum = 192;BA.debugLine="cs.Initialize";
Debug.ShouldStop(-2147483648);
_cs.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Consecutivo:";
Debug.ShouldStop(4);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Consecutivo: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 196;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Consecuti";
Debug.ShouldStop(8);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_consecutivo,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 198;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Nit: \").PopAl";
Debug.ShouldStop(32);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Nit: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 199;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Nit & CRL";
Debug.ShouldStop(64);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_nit,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 201;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Hacienda: \").";
Debug.ShouldStop(256);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Hacienda: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 202;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Hacienda";
Debug.ShouldStop(512);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_hacienda,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 204;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Suerte: \").Po";
Debug.ShouldStop(2048);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Suerte: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 205;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Suerte).P";
Debug.ShouldStop(4096);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(_suerte))).runVoidMethod ("PopAll");
 BA.debugLineNum = 206;BA.debugLine="cs.Append(\"  \")";
Debug.ShouldStop(8192);
_cs.runVoidMethod ("Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("  "))));
 BA.debugLineNum = 207;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Área: \").PopA";
Debug.ShouldStop(16384);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Área: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 208;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Area & CR";
Debug.ShouldStop(32768);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_area,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 210;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Labor: \").Pop";
Debug.ShouldStop(131072);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Labor: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 211;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Labor & C";
Debug.ShouldStop(262144);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_labor,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 213;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Fecha program";
Debug.ShouldStop(1048576);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Fecha programa: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 214;BA.debugLine="cs.Color(Colors.Black).Underline.Append(FechaPro";
Debug.ShouldStop(2097152);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_fechapro,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 216;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Días atraso:";
Debug.ShouldStop(8388608);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Días atraso: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 217;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Retraso &";
Debug.ShouldStop(16777216);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_retraso,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 219;BA.debugLine="cs.Bold.Color(Colors.Black).Append(\"Observación:";
Debug.ShouldStop(67108864);
_cs.runMethod(false,"Bold").runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Observación: ")))).runVoidMethod ("PopAll");
 BA.debugLineNum = 220;BA.debugLine="cs.Color(Colors.Black).Underline.Append(Observaci";
Debug.ShouldStop(134217728);
_cs.runMethod(false,"Color",(Object)(listlabores.__c.getField(false,"Colors").getField(true,"Black"))).runMethod(false,"Underline").runMethod(false,"Append",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_observacion,listlabores.__c.getField(true,"CRLF"))))).runVoidMethod ("PopAll");
 BA.debugLineNum = 222;BA.debugLine="LabelLabores.Text = cs";
Debug.ShouldStop(536870912);
__ref.getField(false,"_labellabores" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_cs.getObject()));
 BA.debugLineNum = 224;BA.debugLine="ButtonGrabar.Tag = Consecutivo";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_buttongrabar" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 225;BA.debugLine="ButtonCancelar.Tag = Consecutivo";
Debug.ShouldStop(1);
__ref.getField(false,"_buttoncancelar" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 226;BA.debugLine="ButtonAplazar.Tag = Consecutivo";
Debug.ShouldStop(2);
__ref.getField(false,"_buttonaplazar" /*RemoteObject*/ ).runMethod(false,"setTag",(_consecutivo));
 BA.debugLineNum = 228;BA.debugLine="Return panel";
Debug.ShouldStop(8);
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _panel.getObject());
 BA.debugLineNum = 230;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Initialize (listlabores) ","listlabores",7,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "listlabores","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Return Me";
Debug.ShouldStop(131072);
if (true) return __ref;
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}