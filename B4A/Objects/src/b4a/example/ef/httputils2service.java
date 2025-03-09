package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.objects.ReceiverHelper;
import anywheresoftware.b4a.debug.*;

public class httputils2service extends android.content.BroadcastReceiver{
		
    static httputils2service mostCurrent;
	public static BA processBA;
    private ReceiverHelper _receiver;
    private static boolean firstTime = true;
    public static Class<?> getObject() {
		return httputils2service.class;
	}
	@Override
	public void onReceive(android.content.Context context, android.content.Intent intent) {
        mostCurrent = this;
       
        if (processBA == null) {
           
		    processBA = new anywheresoftware.b4a.ShellBA(context, null, null, anywheresoftware.b4a.BA.SharedProcessBA.ModuleType.RECEIVER, "b4a.example.ef.httputils2service");
            if (BA.isShellModeRuntimeCheck(processBA)) {
                processBA.raiseEvent2(null, true, "SHELL", false);
		    }
            try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            processBA.loadHtSubs(this.getClass());
        }
         _receiver = new ReceiverHelper(this);
        if (BA.isShellModeRuntimeCheck(processBA)) {
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.ef.httputils2service", processBA, _receiver, anywheresoftware.b4a.keywords.Common.Density);
		}
        processBA.setActivityPaused(false);
        BA.LogInfo("*** Receiver (httputils2service) Receive " + (firstTime ? "(first time)" : "") + " ***");
        anywheresoftware.b4a.objects.IntentWrapper iw = new anywheresoftware.b4a.objects.IntentWrapper();
        iw.setObject(intent);
        processBA.raiseEvent(null, "receiver_receive", firstTime, iw);
        firstTime = false;
    }
	

public anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
public static anywheresoftware.b4a.objects.collections.Map _taskidtojob = null;
public static String _tempfolder = "";
public static int _taskcounter = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static String  _completejob(int _taskid,boolean _success,String _errormessage) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "completejob", false))
	 {return ((String) Debug.delegate(processBA, "completejob", new Object[] {_taskid,_success,_errormessage}));}
b4a.example.ef.httpjob _job = null;
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.ef.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=58589190;
 //BA.debugLineNum = 58589190;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.LogImpl("758589190","HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=58589191;
 //BA.debugLineNum = 58589191;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=58589193;
 //BA.debugLineNum = 58589193;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=58589194;
 //BA.debugLineNum = 58589194;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
RDebugUtils.currentLine=58589195;
 //BA.debugLineNum = 58589195;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
RDebugUtils.currentLine=58589197;
 //BA.debugLineNum = 58589197;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (null,_taskid);
RDebugUtils.currentLine=58589201;
 //BA.debugLineNum = 58589201;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responseerror", false))
	 {return ((String) Debug.delegate(processBA, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4a.example.ef.httpjob _job = null;
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("758523650",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=58523652;
 //BA.debugLineNum = 58523652;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=58523653;
 //BA.debugLineNum = 58523653;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.ef.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=58523654;
 //BA.debugLineNum = 58523654;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=58523655;
 //BA.debugLineNum = 58523655;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
anywheresoftware.b4a.keywords.Common.LogImpl("758523655","HttpUtils2Service (hc_ResponseError): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=58523656;
 //BA.debugLineNum = 58523656;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=58523658;
 //BA.debugLineNum = 58523658;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=58523659;
 //BA.debugLineNum = 58523659;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=58523660;
 //BA.debugLineNum = 58523660;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=58523662;
 //BA.debugLineNum = 58523662;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=58523664;
 //BA.debugLineNum = 58523664;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responsesuccess", false))
	 {return ((String) Debug.delegate(processBA, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4a.example.ef.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.ef.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=58392579;
 //BA.debugLineNum = 58392579;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
anywheresoftware.b4a.keywords.Common.LogImpl("758392579","HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=58392580;
 //BA.debugLineNum = 58392580;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=58392582;
 //BA.debugLineNum = 58392582;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=58392583;
 //BA.debugLineNum = 58392583;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=58392587;
 //BA.debugLineNum = 58392587;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(processBA,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=58392589;
 //BA.debugLineNum = 58392589;BA.debugLine="End Sub";
return "";
}
public static String  _receiver_receive(boolean _firsttime,anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "receiver_receive", false))
	 {return ((String) Debug.delegate(processBA, "receiver_receive", new Object[] {_firsttime,_startingintent}));}
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="Service_Create";
_service_create();
 };
RDebugUtils.currentLine=58130436;
 //BA.debugLineNum = 58130436;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="TempFolder = File.DirInternalCache";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternalCache();
RDebugUtils.currentLine=58064899;
 //BA.debugLineNum = 58064899;BA.debugLine="Try";
try {RDebugUtils.currentLine=58064900;
 //BA.debugLineNum = 58064900;BA.debugLine="File.WriteString(TempFolder, \"~test.test\", \"test";
anywheresoftware.b4a.keywords.Common.File.WriteString(_tempfolder,"~test.test","test");
RDebugUtils.currentLine=58064901;
 //BA.debugLineNum = 58064901;BA.debugLine="File.Delete(TempFolder, \"~test.test\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_tempfolder,"~test.test");
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=58064903;
 //BA.debugLineNum = 58064903;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("758064903",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=58064904;
 //BA.debugLineNum = 58064904;BA.debugLine="Log(\"Switching to File.DirInternal\")";
anywheresoftware.b4a.keywords.Common.LogImpl("758064904","Switching to File.DirInternal",0);
RDebugUtils.currentLine=58064905;
 //BA.debugLineNum = 58064905;BA.debugLine="TempFolder = File.DirInternal";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
RDebugUtils.currentLine=58064910;
 //BA.debugLineNum = 58064910;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=58064915;
 //BA.debugLineNum = 58064915;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
RDebugUtils.currentLine=58064923;
 //BA.debugLineNum = 58064923;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=58064925;
 //BA.debugLineNum = 58064925;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "response_streamfinish", false))
	 {return ((String) Debug.delegate(processBA, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=58458116;
 //BA.debugLineNum = 58458116;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
RDebugUtils.currentLine=58458118;
 //BA.debugLineNum = 58458118;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4a.example.ef.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "submitjob", false))
	 {return ((String) Debug.delegate(processBA, "submitjob", new Object[] {_job}));}
int _taskid = 0;
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=58327045;
 //BA.debugLineNum = 58327045;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=58327046;
 //BA.debugLineNum = 58327046;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
RDebugUtils.currentLine=58327048;
 //BA.debugLineNum = 58327048;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
RDebugUtils.currentLine=58327049;
 //BA.debugLineNum = 58327049;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=58327050;
 //BA.debugLineNum = 58327050;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
RDebugUtils.currentLine=58327052;
 //BA.debugLineNum = 58327052;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid);
 };
RDebugUtils.currentLine=58327054;
 //BA.debugLineNum = 58327054;BA.debugLine="End Sub";
return "";
}
}