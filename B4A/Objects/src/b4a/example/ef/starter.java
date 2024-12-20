package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ServiceHelper;
import anywheresoftware.b4a.debug.*;

public class starter extends android.app.Service{
	public static class starter_BR extends android.content.BroadcastReceiver {

		@Override
		public void onReceive(android.content.Context context, android.content.Intent intent) {
            BA.LogInfo("** Receiver (starter) OnReceive **");
			android.content.Intent in = new android.content.Intent(context, starter.class);
			if (intent != null)
				in.putExtra("b4a_internal_intent", intent);
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, anywheresoftware.b4a.ShellBA.class);
		}

	}
    static starter mostCurrent;
	public static BA processBA;
    private ServiceHelper _service;
    public static Class<?> getObject() {
		return starter.class;
	}
	@Override
	public void onCreate() {
        super.onCreate();
        mostCurrent = this;
        if (processBA == null) {
		    processBA = new anywheresoftware.b4a.ShellBA(this, null, null, "b4a.example.ef", "b4a.example.ef.starter");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
            ServiceHelper.init();
        }
        _service = new ServiceHelper(this);
        processBA.service = this;
        
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.ef.starter", processBA, _service, anywheresoftware.b4a.keywords.Common.Density);
		}
        if (!true && ServiceHelper.StarterHelper.startFromServiceCreate(processBA, false) == false) {
				
		}
		else {
            processBA.setActivityPaused(false);
            BA.LogInfo("*** Service (starter) Create ***");
            processBA.raiseEvent(null, "service_create");
        }
        processBA.runHook("oncreate", this, null);
        if (true) {
			if (ServiceHelper.StarterHelper.runWaitForLayouts() == false) {
                BA.LogInfo("stopping spontaneous created service");
                stopSelf();
            }
		}
    }
		@Override
	public void onStart(android.content.Intent intent, int startId) {
		onStartCommand(intent, 0, 0);
    }
    @Override
    public int onStartCommand(final android.content.Intent intent, int flags, int startId) {
    	if (ServiceHelper.StarterHelper.onStartCommand(processBA, new Runnable() {
            public void run() {
                handleStart(intent);
            }}))
			;
		else {
			ServiceHelper.StarterHelper.addWaitForLayout (new Runnable() {
				public void run() {
                    processBA.setActivityPaused(false);
                    BA.LogInfo("** Service (starter) Create **");
                    processBA.raiseEvent(null, "service_create");
					handleStart(intent);
                    ServiceHelper.StarterHelper.removeWaitForLayout();
				}
			});
		}
        processBA.runHook("onstartcommand", this, new Object[] {intent, flags, startId});
		return android.app.Service.START_NOT_STICKY;
    }
    public void onTaskRemoved(android.content.Intent rootIntent) {
        super.onTaskRemoved(rootIntent);
        if (true)
            processBA.raiseEvent(null, "service_taskremoved");
            
    }
    private void handleStart(android.content.Intent intent) {
    	BA.LogInfo("** Service (starter) Start **");
    	java.lang.reflect.Method startEvent = processBA.htSubs.get("service_start");
    	if (startEvent != null) {
    		if (startEvent.getParameterTypes().length > 0) {
    			anywheresoftware.b4a.objects.IntentWrapper iw = ServiceHelper.StarterHelper.handleStartIntent(intent, _service, processBA);
    			processBA.raiseEvent(null, "service_start", iw);
    		}
    		else {
    			processBA.raiseEvent(null, "service_start");
    		}
    	}
    }

	public void onTimeout(int startId) {
        BA.LogInfo("** Service (starter) Timeout **");
        anywheresoftware.b4a.objects.collections.Map params = new anywheresoftware.b4a.objects.collections.Map();
        params.Initialize();
        params.Put("StartId", startId);
        processBA.raiseEvent(null, "service_timeout", params);
            
    }
	@Override
	public void onDestroy() {
        super.onDestroy();
        if (true) {
            BA.LogInfo("** Service (starter) Destroy (ignored)**");
        }
        else {
            BA.LogInfo("** Service (starter) Destroy **");
		    processBA.raiseEvent(null, "service_destroy");
            processBA.service = null;
		    mostCurrent = null;
		    processBA.setActivityPaused(true);
            processBA.runHook("ondestroy", this, null);
        }
	}

@Override
	public android.os.IBinder onBind(android.content.Intent intent) {
		return null;
	}
public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static String _rdclink = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static String  _updateinsumo(String _name,String _qnt,int _id,String _idmaquina) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "updateinsumo", false))
	 {return ((String) Debug.delegate(processBA, "updateinsumo", new Object[] {_name,_qnt,_id,_idmaquina}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="public Sub updateInsumo( name As String, qnt As St";
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Try";
try {RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="If name<>\"\" Then";
if ((_name).equals("") == false) { 
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set name=?, i";
_sql1.ExecNonQuery2("UPDATE insumo set name=?, idMaquina=? where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_name),(Object)(_idmaquina),(Object)(_id)}));
 };
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="If qnt<>\"\" Then";
if ((_qnt).equals("") == false) { 
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set  qnt= ?,";
_sql1.ExecNonQuery2("UPDATE insumo set  qnt= ?, idMaquina=? where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_qnt),(Object)(_idmaquina),(Object)(_id)}));
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="Log(\"Erro 0005: \"&LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("56357003","Erro 0005: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="End Sub";
return "";
}
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return false;
}
public static b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(processBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="End Sub";
return null;
}
public static b4a.example.ef.dbrequestmanager  _createrequest(String _db) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(processBA, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (null,processBA,starter.getObject(),_rdclink+"?DBName="+_db);
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="End Sub";
return null;
}
public static void  _insertnamesinsumos(String _usedb) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "insertnamesinsumos", false))
	 {Debug.delegate(processBA, "insertnamesinsumos", new Object[] {_usedb}); return;}
ResumableSub_insertNamesInsumos rsub = new ResumableSub_insertNamesInsumos(null,_usedb);
rsub.resume(processBA, null);
}
public static class ResumableSub_insertNamesInsumos extends BA.ResumableSub {
public ResumableSub_insertNamesInsumos(b4a.example.ef.starter parent,String _usedb) {
this.parent = parent;
this._usedb = _usedb;
}
b4a.example.ef.starter parent;
String _usedb;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _separador = "";
int _longitud = 0;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
Object[] group18;
int index18;
int groupLen18;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="starter";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="File.Delete(File.DirInternal, \"1.txt\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"1.txt");
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM namesinsumo\")";
parent._sql1.ExecNonQuery("DELETE FROM namesinsumo");
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="If File.Exists(File.DirInternal, \"1.txt\") Then";
if (true) break;

case 1:
//if
this.state = 20;
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"1.txt")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 20;
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="Log(\"JA EXISTEM ITENS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("56291461","JA EXISTEM ITENS",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseD";
_req = _createrequest(_usedb);
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_ins";
_cmd = _createcommand("select_insumos",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=6291467;
 //BA.debugLineNum = 6291467;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=6291468;
 //BA.debugLineNum = 6291468;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=6291471;
 //BA.debugLineNum = 6291471;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "insertnamesinsumos"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 6;
_j = (b4a.example.ef.httpjob) result[0];
;
RDebugUtils.currentLine=6291472;
 //BA.debugLineNum = 6291472;BA.debugLine="If j.Success Then";
if (true) break;

case 6:
//if
this.state = 19;
if (_j._success /*boolean*/ ) { 
this.state = 8;
}else {
this.state = 18;
}if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "insertnamesinsumos"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 9;
_res = (b4a.example.ef.main._dbresult) result[0];
;
RDebugUtils.currentLine=6291478;
 //BA.debugLineNum = 6291478;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 9:
//for
this.state = 16;
group15 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 16;
if (index15 < groupLen15) {
this.state = 11;
_row = (Object[])(group15.Get(index15));}
if (true) break;

case 24:
//C
this.state = 23;
index15++;
if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=6291479;
 //BA.debugLineNum = 6291479;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=6291480;
 //BA.debugLineNum = 6291480;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=6291481;
 //BA.debugLineNum = 6291481;BA.debugLine="For Each record As Object In row";
if (true) break;

case 12:
//for
this.state = 15;
group18 = _row;
index18 = 0;
groupLen18 = group18.length;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 15;
if (index18 < groupLen18) {
this.state = 14;
_record = group18[index18];}
if (true) break;

case 26:
//C
this.state = 25;
index18++;
if (true) break;

case 14:
//C
this.state = 26;
RDebugUtils.currentLine=6291482;
 //BA.debugLineNum = 6291482;BA.debugLine="cadena=cadena & record '& separador";
_cadena = _cadena+BA.ObjectToString(_record);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 24;
;
RDebugUtils.currentLine=6291486;
 //BA.debugLineNum = 6291486;BA.debugLine="SQL1.ExecNonQuery2(\"INSERT INTO namesinsumo VA";
parent._sql1.ExecNonQuery2("INSERT INTO namesinsumo VALUES (?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{anywheresoftware.b4a.keywords.Common.Null,(Object)(_cadena)}));
RDebugUtils.currentLine=6291487;
 //BA.debugLineNum = 6291487;BA.debugLine="File.WriteString(File.DirInternal, \"1.txt\", \"\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"1.txt","");
RDebugUtils.currentLine=6291488;
 //BA.debugLineNum = 6291488;BA.debugLine="cadena=\"\"";
_cadena = "";
 if (true) break;
if (true) break;

case 16:
//C
this.state = 19;
;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=6291492;
 //BA.debugLineNum = 6291492;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("56291492","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=6291494;
 //BA.debugLineNum = 6291494;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=6291508;
 //BA.debugLineNum = 6291508;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Try";
try {RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="SQL1.Initialize(File.DirInternal, \"data_base8088";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_base8088.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS in";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS insumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, qnt TEXT, idmaquina INTEGER)");
RDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS na";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS namesinsumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)");
RDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS ma";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS maquina (id INTEGER PRIMARY KEY, fechaInicio TEXT, fechaFim Text, Nit Text, arealabor INTEGER,hacienda TEXT,Lote TEXT, labor TEXT)");
RDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS da";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS dados (id INTEGER PRIMARY KEY AUTOINCREMENT, Consecutivo TEXT,Fecha_programa TEXT,NIT TEXT, Hacienda TEXT, Lote TEXT, labor TEXT)");
RDebugUtils.currentLine=6225931;
 //BA.debugLineNum = 6225931;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM maquina\")";
_sql1.ExecNonQuery("DELETE FROM maquina");
RDebugUtils.currentLine=6225933;
 //BA.debugLineNum = 6225933;BA.debugLine="insertNamesInsumos(Main.pDBName)";
_insertnamesinsumos(mostCurrent._main._pdbname /*String*/ );
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=6225935;
 //BA.debugLineNum = 6225935;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("56225935",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=6225937;
 //BA.debugLineNum = 6225937;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
}