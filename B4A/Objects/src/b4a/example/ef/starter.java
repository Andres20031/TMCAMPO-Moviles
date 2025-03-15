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
            ServiceHelper.StarterHelper.startServiceFromReceiver (context, in, true, BA.class);
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
		    processBA = new BA(this, null, null, "b4a.example.ef", "b4a.example.ef.starter");
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
	}public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.sql.SQL _sql1 = null;
public static String _rdclink = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static boolean  _application_error(anywheresoftware.b4a.objects.B4AException _error,String _stacktrace) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
 //BA.debugLineNum = 152;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return false;
}
public static b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 167;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 168;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 169;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 170;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 171;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 172;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public static b4a.example.ef.dbrequestmanager  _createrequest(String _db) throws Exception{
b4a.example.ef.dbrequestmanager _req = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
 //BA.debugLineNum = 162;BA.debugLine="Dim req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 163;BA.debugLine="req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (processBA,starter.getObject(),_rdclink+"?DBName="+_db);
 //BA.debugLineNum = 164;BA.debugLine="Return req";
if (true) return _req;
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return null;
}
public static void  _insertnamesinsumos(String _usedb) throws Exception{
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 73;BA.debugLine="File.Delete(File.DirInternal, \"1.txt\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"1.txt");
 //BA.debugLineNum = 74;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM namesinsumo\")";
parent._sql1.ExecNonQuery("DELETE FROM namesinsumo");
 //BA.debugLineNum = 76;BA.debugLine="If File.Exists(File.DirInternal, \"1.txt\") Then";
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
 //BA.debugLineNum = 77;BA.debugLine="Log(\"JA EXISTEM ITENS\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6983045","JA EXISTEM ITENS",0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 80;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseD";
_req = _createrequest(_usedb);
 //BA.debugLineNum = 81;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_ins";
_cmd = _createcommand("select_insumos",(Object[])(anywheresoftware.b4a.keywords.Common.Null));
 //BA.debugLineNum = 83;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 84;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 85;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 87;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 6;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 88;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 89;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 90;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
anywheresoftware.b4a.keywords.Common.WaitFor("req_result", processBA, this, (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 9;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 94;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 95;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 96;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 97;BA.debugLine="For Each record As Object In row";
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
 //BA.debugLineNum = 98;BA.debugLine="cadena=cadena & record '& separador";
_cadena = _cadena+BA.ObjectToString(_record);
 if (true) break;
if (true) break;

case 15:
//C
this.state = 24;
;
 //BA.debugLineNum = 102;BA.debugLine="SQL1.ExecNonQuery2(\"INSERT INTO namesinsumo VA";
parent._sql1.ExecNonQuery2("INSERT INTO namesinsumo VALUES (?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{anywheresoftware.b4a.keywords.Common.Null,(Object)(_cadena)}));
 //BA.debugLineNum = 103;BA.debugLine="File.WriteString(File.DirInternal, \"1.txt\", \"\"";
anywheresoftware.b4a.keywords.Common.File.WriteString(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"1.txt","");
 //BA.debugLineNum = 104;BA.debugLine="cadena=\"\"";
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
 //BA.debugLineNum = 108;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
anywheresoftware.b4a.keywords.Common.LogImpl("6983076","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 19:
//C
this.state = 20;
;
 //BA.debugLineNum = 110;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public static void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim SQL1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 11;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 18;BA.debugLine="Try";
try { //BA.debugLineNum = 19;BA.debugLine="SQL1.Initialize(File.DirInternal, \"data_base8088";
_sql1.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirInternal(),"data_base8088.db",anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 20;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS in";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS insumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, qnt TEXT, idmaquina INTEGER)");
 //BA.debugLineNum = 21;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS na";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS namesinsumo (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT)");
 //BA.debugLineNum = 23;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS ma";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS maquina (id INTEGER PRIMARY KEY, fechaInicio TEXT, fechaFim Text, Nit Text, arealabor INTEGER,hacienda TEXT,Lote TEXT, labor TEXT)");
 //BA.debugLineNum = 24;BA.debugLine="SQL1.ExecNonQuery(\"CREATE TABLE IF NOT EXISTS da";
_sql1.ExecNonQuery("CREATE TABLE IF NOT EXISTS dados (id INTEGER PRIMARY KEY AUTOINCREMENT, Consecutivo TEXT,Fecha_programa TEXT,NIT TEXT, Hacienda TEXT, Lote TEXT, labor TEXT)");
 //BA.debugLineNum = 26;BA.debugLine="SQL1.ExecNonQuery(\"DELETE FROM maquina\")";
_sql1.ExecNonQuery("DELETE FROM maquina");
 //BA.debugLineNum = 28;BA.debugLine="insertNamesInsumos(Main.pDBName)";
_insertnamesinsumos(mostCurrent._main._pdbname /*String*/ );
 } 
       catch (Exception e10) {
			processBA.setLastException(e10); //BA.debugLineNum = 30;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("6917519",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Service_Destroy";
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
 //BA.debugLineNum = 143;BA.debugLine="Service.StopAutomaticForeground 'Starter service";
mostCurrent._service.StopAutomaticForeground();
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public static String  _service_taskremoved() throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub Service_TaskRemoved";
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return "";
}
public static String  _updateinsumo(String _name,String _qnt,int _id,String _idmaquina) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="public Sub updateInsumo( name As String, qnt As St";
 //BA.debugLineNum = 129;BA.debugLine="Try";
try { //BA.debugLineNum = 130;BA.debugLine="If name<>\"\" Then";
if ((_name).equals("") == false) { 
 //BA.debugLineNum = 131;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set name=?, i";
_sql1.ExecNonQuery2("UPDATE insumo set name=?, idMaquina=? where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_name),(Object)(_idmaquina),(Object)(_id)}));
 };
 //BA.debugLineNum = 134;BA.debugLine="If qnt<>\"\" Then";
if ((_qnt).equals("") == false) { 
 //BA.debugLineNum = 135;BA.debugLine="SQL1.ExecNonQuery2(\"UPDATE insumo set  qnt= ?,";
_sql1.ExecNonQuery2("UPDATE insumo set  qnt= ?, idMaquina=? where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_qnt),(Object)(_idmaquina),(Object)(_id)}));
 };
 } 
       catch (Exception e9) {
			processBA.setLastException(e9); //BA.debugLineNum = 138;BA.debugLine="Log(\"Erro 0005: \"&LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("61048587","Erro 0005: "+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
}
