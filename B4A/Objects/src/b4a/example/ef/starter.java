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
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "application_error", false))
	 {return ((Boolean) Debug.delegate(processBA, "application_error", new Object[] {_error,_stacktrace}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="End Sub";
return false;
}
public static b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(processBA, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="End Sub";
return null;
}
public static b4a.example.ef.dbrequestmanager  _createrequest(String _db) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(processBA, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (null,processBA,starter.getObject(),_rdclink+"?DBName="+_db);
RDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="Return req";
if (true) return _req;
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="File.Delete(File.DirInternal, \"1.txt\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"1.txt");
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM namesinsumo\")";
parent._sql1.ExecNonQuery("DELETE FROM namesinsumo");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="If File.Exists(File.DirInternal, \"1.txt\") Then";
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
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Log(\"JA EXISTEM ITENS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("5983045","JA EXISTEM ITENS",0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseD";
_req = _createrequest(_usedb);
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_ins";
_cmd = _createcommand("select_insumos",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "insertnamesinsumos"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 6;
_j = (b4a.example.ef.httpjob) result[0];
;
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "starter", "insertnamesinsumos"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 9;
_res = (b4a.example.ef.main._dbresult) result[0];
;
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="cadena=cadena & record '& separador";
_cadena = _cadena+BA.ObjectToString(_record);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 24;
;
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="SQL1.ExecNonQuery2(\"INSERT INTO namesinsumo VA";
parent._sql1.ExecNonQuery2("INSERT INTO namesinsumo VALUES (?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{anywheresoftware.b4a.keywords.Common.Null,(Object)(_cadena)}));
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="File.WriteString(File.DirInternal, \"1.txt\", \"\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"1.txt","");
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("5983076","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 19:
//C
this.state = 20;
;
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=983092;
 //BA.debugLineNum = 983092;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Try";
try {RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="SQL1.Initialize(File.DirInternal, \"data_base8088";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_base8088.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS in";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS insumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, qnt TEXT, idmaquina INTEGER)");
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS na";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS namesinsumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)");
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS ma";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS maquina (id INTEGER PRIMARY KEY, fechaInicio TEXT, fechaFim Text, Nit Text, arealabor INTEGER,hacienda TEXT,Lote TEXT, labor TEXT)");
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS da";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS dados (id INTEGER PRIMARY KEY AUTOINCREMENT, Consecutivo TEXT,Fecha_programa TEXT,NIT TEXT, Hacienda TEXT, Lote TEXT, labor TEXT)");
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM maquina\")";
_sql1.ExecNonQuery("DELETE FROM maquina");
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="insertNamesInsumos(Main.pDBName)";
_insertnamesinsumos(mostCurrent._main._pdbname /*String*/ );
 } 
       catch (Exception e10) {
			processBA.setLastException(e10);RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("5917519",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "service_taskremoved", false))
	 {return ((String) Debug.delegate(processBA, "service_taskremoved", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub Service_TaskRemoved";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return "";
}
public static String  _updateinsumo(String _name,String _qnt,int _id,String _idmaquina) throws Exception{
RDebugUtils.currentModule="starter";
if (Debug.shouldDelegate(processBA, "updateinsumo", false))
	 {return ((String) Debug.delegate(processBA, "updateinsumo", new Object[] {_name,_qnt,_id,_idmaquina}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="public Sub updateInsumo( name As String, qnt As St";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Try";
try {RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If name<>\"\" Then";
if ((_name).equals("") == false) { 
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set name=?, i";
_sql1.ExecNonQuery2("UPDATE insumo set name=?, idMaquina=? where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_name),(Object)(_idmaquina),(Object)(_id)}));
 };
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="If qnt<>\"\" Then";
if ((_qnt).equals("") == false) { 
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set  qnt= ?,";
_sql1.ExecNonQuery2("UPDATE insumo set  qnt= ?, idMaquina=? where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_qnt),(Object)(_idmaquina),(Object)(_id)}));
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9);RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Log(\"Erro 0005: \"&LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("51048587","Erro 0005: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="End Sub";
return "";
}
}