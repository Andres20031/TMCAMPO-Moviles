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
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
RDebugUtils.currentLine=40894468;
 //BA.debugLineNum = 40894468;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.ef.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=40894469;
 //BA.debugLineNum = 40894469;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=40894470;
 //BA.debugLineNum = 40894470;BA.debugLine="Log(\"HttpUtils2Service: job completed multiple t";
anywheresoftware.b4a.keywords.Common.LogImpl("540894470","HttpUtils2Service: job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=40894471;
 //BA.debugLineNum = 40894471;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=40894473;
 //BA.debugLineNum = 40894473;BA.debugLine="TaskIdToJob.Remove(TaskId)";
_taskidtojob.Remove((Object)(_taskid));
RDebugUtils.currentLine=40894474;
 //BA.debugLineNum = 40894474;BA.debugLine="job.success = success";
_job._success /*boolean*/  = _success;
RDebugUtils.currentLine=40894475;
 //BA.debugLineNum = 40894475;BA.debugLine="job.errorMessage = errorMessage";
_job._errormessage /*String*/  = _errormessage;
RDebugUtils.currentLine=40894477;
 //BA.debugLineNum = 40894477;BA.debugLine="job.Complete(TaskId)";
_job._complete /*String*/ (null,_taskid);
RDebugUtils.currentLine=40894481;
 //BA.debugLineNum = 40894481;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responseerror(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,String _reason,int _statuscode,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responseerror", false))
	 {return ((String) Debug.delegate(processBA, "hc_responseerror", new Object[] {_response,_reason,_statuscode,_taskid}));}
b4a.example.ef.httpjob _job = null;
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Sub hc_ResponseError (Response As OkHttpResponse,";
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="Log($\"ResponseError. Reason: ${Reason}, Response:";
anywheresoftware.b4a.keywords.Common.LogImpl("540828930",("ResponseError. Reason: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_reason))+", Response: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_response.getErrorResponse()))+""),0);
RDebugUtils.currentLine=40828932;
 //BA.debugLineNum = 40828932;BA.debugLine="Response.Release";
_response.Release();
RDebugUtils.currentLine=40828933;
 //BA.debugLineNum = 40828933;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.ef.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=40828934;
 //BA.debugLineNum = 40828934;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=40828935;
 //BA.debugLineNum = 40828935;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseError): job c";
anywheresoftware.b4a.keywords.Common.LogImpl("540828935","HttpUtils2Service (hc_ResponseError): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=40828936;
 //BA.debugLineNum = 40828936;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=40828938;
 //BA.debugLineNum = 40828938;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=40828939;
 //BA.debugLineNum = 40828939;BA.debugLine="If Response.ErrorResponse <> \"\" Then";
if ((_response.getErrorResponse()).equals("") == false) { 
RDebugUtils.currentLine=40828940;
 //BA.debugLineNum = 40828940;BA.debugLine="CompleteJob(TaskId, False, Response.ErrorRespons";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_response.getErrorResponse());
 }else {
RDebugUtils.currentLine=40828942;
 //BA.debugLineNum = 40828942;BA.debugLine="CompleteJob(TaskId, False, Reason)";
_completejob(_taskid,anywheresoftware.b4a.keywords.Common.False,_reason);
 };
RDebugUtils.currentLine=40828944;
 //BA.debugLineNum = 40828944;BA.debugLine="End Sub";
return "";
}
public static String  _hc_responsesuccess(anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "hc_responsesuccess", false))
	 {return ((String) Debug.delegate(processBA, "hc_responsesuccess", new Object[] {_response,_taskid}));}
b4a.example.ef.httpjob _job = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Sub hc_ResponseSuccess (Response As OkHttpResponse";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4a.example.ef.httpjob)(_taskidtojob.Get((Object)(_taskid)));
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="If job = Null Then";
if (_job== null) { 
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="Log(\"HttpUtils2Service (hc_ResponseSuccess): job";
anywheresoftware.b4a.keywords.Common.LogImpl("540697859","HttpUtils2Service (hc_ResponseSuccess): job completed multiple times - "+BA.NumberToString(_taskid),0);
RDebugUtils.currentLine=40697860;
 //BA.debugLineNum = 40697860;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=40697862;
 //BA.debugLineNum = 40697862;BA.debugLine="job.Response = Response";
_job._response /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse*/  = _response;
RDebugUtils.currentLine=40697863;
 //BA.debugLineNum = 40697863;BA.debugLine="Dim out As OutputStream = File.OpenOutput(TempFol";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_tempfolder,BA.NumberToString(_taskid),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=40697867;
 //BA.debugLineNum = 40697867;BA.debugLine="Response.GetAsynchronously(\"response\", out , _";
_response.GetAsynchronously(processBA,"response",(java.io.OutputStream)(_out.getObject()),anywheresoftware.b4a.keywords.Common.True,_taskid);
RDebugUtils.currentLine=40697869;
 //BA.debugLineNum = 40697869;BA.debugLine="End Sub";
return "";
}
public static String  _receiver_receive(boolean _firsttime,anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "receiver_receive", false))
	 {return ((String) Debug.delegate(processBA, "receiver_receive", new Object[] {_firsttime,_startingintent}));}
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Private Sub Receiver_Receive (FirstTime As Boolean";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="Service_Create";
_service_create();
 };
RDebugUtils.currentLine=40435716;
 //BA.debugLineNum = 40435716;BA.debugLine="End Sub";
return "";
}
public static String  _service_create() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_create", false))
	 {return ((String) Debug.delegate(processBA, "service_create", null));}
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Sub Service_Create";
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="TempFolder = File.DirInternalCache";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternalCache();
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="Try";
try {RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="File.WriteString(TempFolder, \"~test.test\", \"test";
anywheresoftware.b4a.keywords.Common.File.WriteString(_tempfolder,"~test.test","test");
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="File.Delete(TempFolder, \"~test.test\")";
anywheresoftware.b4a.keywords.Common.File.Delete(_tempfolder,"~test.test");
 } 
       catch (Exception e6) {
			processBA.setLastException(e6);RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="Log(LastException)";
anywheresoftware.b4a.keywords.Common.LogImpl("540370183",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.LastException(processBA)),0);
RDebugUtils.currentLine=40370184;
 //BA.debugLineNum = 40370184;BA.debugLine="Log(\"Switching to File.DirInternal\")";
anywheresoftware.b4a.keywords.Common.LogImpl("540370184","Switching to File.DirInternal",0);
RDebugUtils.currentLine=40370185;
 //BA.debugLineNum = 40370185;BA.debugLine="TempFolder = File.DirInternal";
_tempfolder = anywheresoftware.b4a.keywords.Common.File.getDirInternal();
 };
RDebugUtils.currentLine=40370190;
 //BA.debugLineNum = 40370190;BA.debugLine="If hc.IsInitialized = False Then";
if (_hc.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=40370195;
 //BA.debugLineNum = 40370195;BA.debugLine="hc.Initialize(\"hc\")";
_hc.Initialize("hc");
 };
RDebugUtils.currentLine=40370203;
 //BA.debugLineNum = 40370203;BA.debugLine="TaskIdToJob.Initialize";
_taskidtojob.Initialize();
RDebugUtils.currentLine=40370205;
 //BA.debugLineNum = 40370205;BA.debugLine="End Sub";
return "";
}
public static String  _response_streamfinish(boolean _success,int _taskid) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "response_streamfinish", false))
	 {return ((String) Debug.delegate(processBA, "response_streamfinish", new Object[] {_success,_taskid}));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Private Sub Response_StreamFinish (Success As Bool";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="If Success Then";
if (_success) { 
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="CompleteJob(TaskId, Success, \"\")";
_completejob(_taskid,_success,"");
 }else {
RDebugUtils.currentLine=40763396;
 //BA.debugLineNum = 40763396;BA.debugLine="CompleteJob(TaskId, Success, LastException.Messa";
_completejob(_taskid,_success,anywheresoftware.b4a.keywords.Common.LastException(processBA).getMessage());
 };
RDebugUtils.currentLine=40763398;
 //BA.debugLineNum = 40763398;BA.debugLine="End Sub";
return "";
}
public static String  _service_destroy() throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_destroy", false))
	 {return ((String) Debug.delegate(processBA, "service_destroy", null));}
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Sub Service_Destroy";
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="End Sub";
return "";
}
public static String  _service_start(anywheresoftware.b4a.objects.IntentWrapper _startingintent) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "service_start", false))
	 {return ((String) Debug.delegate(processBA, "service_start", new Object[] {_startingintent}));}
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Sub Service_Start (StartingIntent As Intent)";
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="End Sub";
return "";
}
public static String  _submitjob(b4a.example.ef.httpjob _job) throws Exception{
RDebugUtils.currentModule="httputils2service";
if (Debug.shouldDelegate(processBA, "submitjob", false))
	 {return ((String) Debug.delegate(processBA, "submitjob", new Object[] {_job}));}
int _taskid = 0;
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="If TaskIdToJob.IsInitialized = False Then Service";
if (_taskidtojob.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_service_create();};
RDebugUtils.currentLine=40632325;
 //BA.debugLineNum = 40632325;BA.debugLine="taskCounter = taskCounter + 1";
_taskcounter = (int) (_taskcounter+1);
RDebugUtils.currentLine=40632326;
 //BA.debugLineNum = 40632326;BA.debugLine="Dim TaskId As Int = taskCounter";
_taskid = _taskcounter;
RDebugUtils.currentLine=40632328;
 //BA.debugLineNum = 40632328;BA.debugLine="TaskIdToJob.Put(TaskId, job)";
_taskidtojob.Put((Object)(_taskid),(Object)(_job));
RDebugUtils.currentLine=40632329;
 //BA.debugLineNum = 40632329;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ((_job._username /*String*/ ).equals("") == false && (_job._password /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=40632330;
 //BA.debugLineNum = 40632330;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, TaskId, jo";
_hc.ExecuteCredentials(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid,_job._username /*String*/ ,_job._password /*String*/ );
 }else {
RDebugUtils.currentLine=40632332;
 //BA.debugLineNum = 40632332;BA.debugLine="hc.Execute(job.GetRequest, TaskId)";
_hc.Execute(processBA,_job._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null),_taskid);
 };
RDebugUtils.currentLine=40632334;
 //BA.debugLineNum = 40632334;BA.debugLine="End Sub";
return "";
}
}