package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class starter_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (starter) ","starter",2,starter.processBA,starter.mostCurrent,151);
if (RapidSub.canDelegate("application_error")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","application_error", _error, _stacktrace);}
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 151;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 152;BA.debugLine="Return True";
Debug.ShouldStop(8388608);
if (true) return starter.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcommand(RemoteObject _name,RemoteObject _parameters) throws Exception{
try {
		Debug.PushSubsStack("CreateCommand (starter) ","starter",2,starter.processBA,starter.mostCurrent,167);
if (RapidSub.canDelegate("createcommand")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","createcommand", _name, _parameters);}
RemoteObject _cmd = RemoteObject.declareNull("b4a.example.ef.main._dbcommand");
Debug.locals.put("Name", _name);
Debug.locals.put("Parameters", _parameters);
 BA.debugLineNum = 167;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="Dim cmd As DBCommand";
Debug.ShouldStop(128);
_cmd = RemoteObject.createNew ("b4a.example.ef.main._dbcommand");Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 169;BA.debugLine="cmd.Initialize";
Debug.ShouldStop(256);
_cmd.runVoidMethod ("Initialize");
 BA.debugLineNum = 170;BA.debugLine="cmd.Name = Name";
Debug.ShouldStop(512);
_cmd.setField ("Name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 171;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("N",_parameters)) { 
_cmd.setField ("Parameters" /*RemoteObject*/ ,_parameters);};
 BA.debugLineNum = 172;BA.debugLine="Return cmd";
Debug.ShouldStop(2048);
if (true) return _cmd;
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrequest(RemoteObject _db) throws Exception{
try {
		Debug.PushSubsStack("CreateRequest (starter) ","starter",2,starter.processBA,starter.mostCurrent,161);
if (RapidSub.canDelegate("createrequest")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","createrequest", _db);}
RemoteObject _req = RemoteObject.declareNull("b4a.example.ef.dbrequestmanager");
Debug.locals.put("Db", _db);
 BA.debugLineNum = 161;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim req As DBRequestManager";
Debug.ShouldStop(2);
_req = RemoteObject.createNew ("b4a.example.ef.dbrequestmanager");Debug.locals.put("req", _req);
 BA.debugLineNum = 163;BA.debugLine="req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
Debug.ShouldStop(4);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_initialize" /*RemoteObject*/ ,starter.processBA,(Object)(starter.getObject()),(Object)(RemoteObject.concat(starter._rdclink,RemoteObject.createImmutable("?DBName="),_db)));
 BA.debugLineNum = 164;BA.debugLine="Return req";
Debug.ShouldStop(8);
if (true) return _req;
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _insertnamesinsumos(RemoteObject _usedb) throws Exception{
try {
		Debug.PushSubsStack("insertNamesInsumos (starter) ","starter",2,starter.processBA,starter.mostCurrent,72);
if (RapidSub.canDelegate("insertnamesinsumos")) { b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","insertnamesinsumos", _usedb); return;}
ResumableSub_insertNamesInsumos rsub = new ResumableSub_insertNamesInsumos(null,_usedb);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_insertNamesInsumos extends BA.ResumableSub {
public ResumableSub_insertNamesInsumos(b4a.example.ef.starter parent,RemoteObject _usedb) {
this.parent = parent;
this._usedb = _usedb;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4a.example.ef.starter parent;
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
RemoteObject group15;
int index15;
int groupLen15;
RemoteObject group18;
int index18;
int groupLen18;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("insertNamesInsumos (starter) ","starter",2,starter.processBA,starter.mostCurrent,72);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("UseDb", _usedb);
 BA.debugLineNum = 73;BA.debugLine="File.Delete(File.DirInternal, \"1.txt\")";
Debug.ShouldStop(256);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Delete",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("1.txt")));
 BA.debugLineNum = 74;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM namesinsumo\")";
Debug.ShouldStop(512);
parent._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE FROM namesinsumo")));
 BA.debugLineNum = 76;BA.debugLine="If File.Exists(File.DirInternal, \"1.txt\") Then";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//if
this.state = 20;
if (parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(RemoteObject.createImmutable("1.txt"))).<Boolean>get().booleanValue()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
 BA.debugLineNum = 77;BA.debugLine="Log(\"JA EXISTEM ITENS\")";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","41245189",RemoteObject.createImmutable("JA EXISTEM ITENS"),0);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 80;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseD";
Debug.ShouldStop(32768);
_req = _createrequest(_usedb);Debug.locals.put("req", _req);Debug.locals.put("req", _req);
 BA.debugLineNum = 81;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_ins";
Debug.ShouldStop(65536);
_cmd = _createcommand(BA.ObjectToString("select_insumos"),(parent.mostCurrent.__c.getField(false,"Null")));Debug.locals.put("cmd", _cmd);Debug.locals.put("cmd", _cmd);
 BA.debugLineNum = 83;BA.debugLine="Dim cadena As String";
Debug.ShouldStop(262144);
_cadena = RemoteObject.createImmutable("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 84;BA.debugLine="Dim separador As String";
Debug.ShouldStop(524288);
_separador = RemoteObject.createImmutable("");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 85;BA.debugLine="Dim longitud As Int";
Debug.ShouldStop(1048576);
_longitud = RemoteObject.createImmutable(0);Debug.locals.put("longitud", _longitud);
 BA.debugLineNum = 87;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","jobdone", starter.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "starter", "insertnamesinsumos"), (_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_executequery" /*RemoteObject*/ ,(Object)(_cmd),(Object)(BA.numberCast(int.class, 0)),(Object)((_id)))));
this.state = 21;
return;
case 21:
//C
this.state = 6;
_j = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("j", _j);
;
 BA.debugLineNum = 88;BA.debugLine="If j.Success Then";
Debug.ShouldStop(8388608);
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
 BA.debugLineNum = 89;BA.debugLine="req.HandleJobAsync(j, \"req\")";
Debug.ShouldStop(16777216);
_req.runClassMethod (b4a.example.ef.dbrequestmanager.class, "_handlejobasync" /*void*/ ,(Object)(_j),(Object)(RemoteObject.createImmutable("req")));
 BA.debugLineNum = 90;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","req_result", starter.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "starter", "insertnamesinsumos"), (_req));
this.state = 22;
return;
case 22:
//C
this.state = 9;
_res = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(0));Debug.locals.put("res", _res);
;
 BA.debugLineNum = 94;BA.debugLine="For Each row() As Object In res.Rows";
Debug.ShouldStop(536870912);
if (true) break;

case 9:
//for
this.state = 16;
group15 = _res.getField(false,"Rows" /*RemoteObject*/ );
index15 = 0;
groupLen15 = group15.runMethod(true,"getSize").<Integer>get();
Debug.locals.put("row", _row);
this.state = 23;
if (true) break;

case 23:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 11;
_row = (group15.runMethod(false,"Get",index15));Debug.locals.put("row", _row);}
if (true) break;

case 24:
//C
this.state = 23;
index15++;
Debug.locals.put("row", _row);
if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 95;BA.debugLine="cadena = \"\"";
Debug.ShouldStop(1073741824);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
 BA.debugLineNum = 96;BA.debugLine="separador=\" - \"";
Debug.ShouldStop(-2147483648);
_separador = BA.ObjectToString(" - ");Debug.locals.put("separador", _separador);
 BA.debugLineNum = 97;BA.debugLine="For Each record As Object In row";
Debug.ShouldStop(1);
if (true) break;

case 12:
//for
this.state = 15;
group18 = _row;
index18 = 0;
groupLen18 = group18.getField(true,"length").<Integer>get();
Debug.locals.put("record", _record);
this.state = 25;
if (true) break;

case 25:
//C
this.state = 15;
if (index18 < groupLen18) {
this.state = 14;
_record = group18.getArrayElement(false,RemoteObject.createImmutable(index18));Debug.locals.put("record", _record);}
if (true) break;

case 26:
//C
this.state = 25;
index18++;
Debug.locals.put("record", _record);
if (true) break;

case 14:
//C
this.state = 26;
 BA.debugLineNum = 98;BA.debugLine="cadena=cadena & record '& separador";
Debug.ShouldStop(2);
_cadena = RemoteObject.concat(_cadena,_record);Debug.locals.put("cadena", _cadena);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 24;
Debug.locals.put("record", _record);
;
 BA.debugLineNum = 102;BA.debugLine="SQL1.ExecNonQuery2(\"INSERT INTO namesinsumo VA";
Debug.ShouldStop(32);
parent._sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("INSERT INTO namesinsumo VALUES (?,?)")),(Object)(parent.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {parent.mostCurrent.__c.getField(false,"Null"),(_cadena)})))));
 BA.debugLineNum = 103;BA.debugLine="File.WriteString(File.DirInternal, \"1.txt\", \"\"";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("WriteString",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("1.txt")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 104;BA.debugLine="cadena=\"\"";
Debug.ShouldStop(128);
_cadena = BA.ObjectToString("");Debug.locals.put("cadena", _cadena);
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
 BA.debugLineNum = 108;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","41245220",RemoteObject.concat(RemoteObject.createImmutable("ERROR: "),_j.getField(true,"_errormessage" /*RemoteObject*/ )),0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 BA.debugLineNum = 110;BA.debugLine="j.Release";
Debug.ShouldStop(8192);
_j.runClassMethod (b4a.example.ef.httpjob.class, "_release" /*RemoteObject*/ );
 if (true) break;

case 20:
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
public static void  _jobdone(RemoteObject _j) throws Exception{
}
public static void  _req_result(RemoteObject _res) throws Exception{
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim SQL1 As SQL";
starter._sql1 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 11;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
starter._rdclink = BA.ObjectToString("http://84.46.255.129:17178/rdc");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (starter) ","starter",2,starter.processBA,starter.mostCurrent,15);
if (RapidSub.canDelegate("service_create")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","service_create");}
 BA.debugLineNum = 15;BA.debugLine="Sub Service_Create";
Debug.ShouldStop(16384);
 BA.debugLineNum = 18;BA.debugLine="Try";
Debug.ShouldStop(131072);
try { BA.debugLineNum = 19;BA.debugLine="SQL1.Initialize(File.DirInternal, \"data_base8088";
Debug.ShouldStop(262144);
starter._sql1.runVoidMethod ("Initialize",(Object)(starter.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirInternal")),(Object)(BA.ObjectToString("data_base8088.db")),(Object)(starter.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 20;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS in";
Debug.ShouldStop(524288);
starter._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS insumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, qnt TEXT, idmaquina INTEGER)")));
 BA.debugLineNum = 21;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS na";
Debug.ShouldStop(1048576);
starter._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS namesinsumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)")));
 BA.debugLineNum = 23;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS ma";
Debug.ShouldStop(4194304);
starter._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS maquina (id INTEGER PRIMARY KEY, fechaInicio TEXT, fechaFim Text, Nit Text, arealabor INTEGER,hacienda TEXT,Lote TEXT, labor TEXT)")));
 BA.debugLineNum = 24;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS da";
Debug.ShouldStop(8388608);
starter._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS dados (id INTEGER PRIMARY KEY AUTOINCREMENT, Consecutivo TEXT,Fecha_programa TEXT,NIT TEXT, Hacienda TEXT, Lote TEXT, labor TEXT)")));
 BA.debugLineNum = 26;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM maquina\")";
Debug.ShouldStop(33554432);
starter._sql1.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.createImmutable("DELETE FROM maquina")));
 BA.debugLineNum = 28;BA.debugLine="insertNamesInsumos(Main.pDBName)";
Debug.ShouldStop(134217728);
_insertnamesinsumos(starter.mostCurrent._main._pdbname /*RemoteObject*/ );
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e10) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e10.toString()); BA.debugLineNum = 30;BA.debugLine="Log(LastException)";
Debug.ShouldStop(536870912);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","41179663",BA.ObjectToString(starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 };
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
public static RemoteObject  _service_destroy() throws Exception{
try {
		Debug.PushSubsStack("Service_Destroy (starter) ","starter",2,starter.processBA,starter.mostCurrent,155);
if (RapidSub.canDelegate("service_destroy")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","service_destroy");}
 BA.debugLineNum = 155;BA.debugLine="Sub Service_Destroy";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_start(RemoteObject _startingintent) throws Exception{
try {
		Debug.PushSubsStack("Service_Start (starter) ","starter",2,starter.processBA,starter.mostCurrent,142);
if (RapidSub.canDelegate("service_start")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","service_start", _startingintent);}
Debug.locals.put("StartingIntent", _startingintent);
 BA.debugLineNum = 142;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
Debug.ShouldStop(16384);
starter.mostCurrent._service.runVoidMethod ("StopAutomaticForeground");
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _service_taskremoved() throws Exception{
try {
		Debug.PushSubsStack("Service_TaskRemoved (starter) ","starter",2,starter.processBA,starter.mostCurrent,146);
if (RapidSub.canDelegate("service_taskremoved")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","service_taskremoved");}
 BA.debugLineNum = 146;BA.debugLine="Sub Service_TaskRemoved";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateinsumo(RemoteObject _name,RemoteObject _qnt,RemoteObject _id,RemoteObject _idmaquina) throws Exception{
try {
		Debug.PushSubsStack("updateInsumo (starter) ","starter",2,starter.processBA,starter.mostCurrent,127);
if (RapidSub.canDelegate("updateinsumo")) { return b4a.example.ef.starter.remoteMe.runUserSub(false, "starter","updateinsumo", _name, _qnt, _id, _idmaquina);}
Debug.locals.put("name", _name);
Debug.locals.put("qnt", _qnt);
Debug.locals.put("id", _id);
Debug.locals.put("idMaquina", _idmaquina);
 BA.debugLineNum = 127;BA.debugLine="public Sub updateInsumo( name As String, qnt As St";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 129;BA.debugLine="Try";
Debug.ShouldStop(1);
try { BA.debugLineNum = 130;BA.debugLine="If name<>\"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_name,BA.ObjectToString(""))) { 
 BA.debugLineNum = 131;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set name=?, i";
Debug.ShouldStop(4);
starter._sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE insumo set name=?, idMaquina=? where id=?")),(Object)(starter.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_name),(_idmaquina),(_id)})))));
 };
 BA.debugLineNum = 134;BA.debugLine="If qnt<>\"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_qnt,BA.ObjectToString(""))) { 
 BA.debugLineNum = 135;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set  qnt= ?,";
Debug.ShouldStop(64);
starter._sql1.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE insumo set  qnt= ?, idMaquina=? where id=?")),(Object)(starter.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_qnt),(_idmaquina),(_id)})))));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e9) {
			BA.rdebugUtils.runVoidMethod("setLastException",starter.processBA, e9.toString()); BA.debugLineNum = 138;BA.debugLine="Log(\"Erro 0005: \"&LastException)";
Debug.ShouldStop(512);
starter.mostCurrent.__c.runVoidMethod ("LogImpl","41310731",RemoteObject.concat(RemoteObject.createImmutable("Erro 0005: "),starter.mostCurrent.__c.runMethod(false,"LastException",starter.processBA)),0);
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}