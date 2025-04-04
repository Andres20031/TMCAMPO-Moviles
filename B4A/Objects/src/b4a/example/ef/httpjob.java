package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class httpjob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.httpjob");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.httpjob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _multipartfiledata{
public boolean IsInitialized;
public String Dir;
public String FileName;
public String KeyName;
public String ContentType;
public void Initialize() {
IsInitialized = true;
Dir = "";
FileName = "";
KeyName = "";
ContentType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _jobname = "";
public boolean _success = false;
public String _username = "";
public String _password = "";
public String _errormessage = "";
public Object _target = null;
public String _taskid = "";
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest _req = null;
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse _response = null;
public Object _tag = null;
public String _invalidurl = "";
public String _defaultscheme = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _release(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "release", true))
	 {return ((String) Debug.delegate(ba, "release", null));}
RDebugUtils.currentLine=62062592;
 //BA.debugLineNum = 62062592;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=62062594;
 //BA.debugLineNum = 62062594;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=62062596;
 //BA.debugLineNum = 62062596;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=60948480;
 //BA.debugLineNum = 60948480;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=60948481;
 //BA.debugLineNum = 60948481;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=60948482;
 //BA.debugLineNum = 60948482;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=60948490;
 //BA.debugLineNum = 60948490;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=62586880;
 //BA.debugLineNum = 62586880;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=62586881;
 //BA.debugLineNum = 62586881;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=62586882;
 //BA.debugLineNum = 62586882;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=62586883;
 //BA.debugLineNum = 62586883;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=62586884;
 //BA.debugLineNum = 62586884;BA.debugLine="End Sub";
return null;
}
public String  _postbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=61145088;
 //BA.debugLineNum = 61145088;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=61145089;
 //BA.debugLineNum = 61145089;BA.debugLine="Try";
try {RDebugUtils.currentLine=61145090;
 //BA.debugLineNum = 61145090;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61145091;
 //BA.debugLineNum = 61145091;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61145093;
 //BA.debugLineNum = 61145093;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961145093",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61145094;
 //BA.debugLineNum = 61145094;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=61145096;
 //BA.debugLineNum = 61145096;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61145097;
 //BA.debugLineNum = 61145097;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4a.example.ef.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=62324736;
 //BA.debugLineNum = 62324736;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=62324737;
 //BA.debugLineNum = 62324737;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=62324738;
 //BA.debugLineNum = 62324738;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=62324739;
 //BA.debugLineNum = 62324739;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=62259200;
 //BA.debugLineNum = 62259200;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=62259201;
 //BA.debugLineNum = 62259201;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=62259202;
 //BA.debugLineNum = 62259202;BA.debugLine="End Sub";
return null;
}
public String  _addscheme(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=61014016;
 //BA.debugLineNum = 61014016;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=61014017;
 //BA.debugLineNum = 61014017;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=61014018;
 //BA.debugLineNum = 61014018;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=61014019;
 //BA.debugLineNum = 61014019;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=60882944;
 //BA.debugLineNum = 60882944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=60882945;
 //BA.debugLineNum = 60882945;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=60882946;
 //BA.debugLineNum = 60882946;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=60882947;
 //BA.debugLineNum = 60882947;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=60882948;
 //BA.debugLineNum = 60882948;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=60882949;
 //BA.debugLineNum = 60882949;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=60882955;
 //BA.debugLineNum = 60882955;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=60882957;
 //BA.debugLineNum = 60882957;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=60882958;
 //BA.debugLineNum = 60882958;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=60882967;
 //BA.debugLineNum = 60882967;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=60882968;
 //BA.debugLineNum = 60882968;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=60882972;
 //BA.debugLineNum = 60882972;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=60882973;
 //BA.debugLineNum = 60882973;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=60882974;
 //BA.debugLineNum = 60882974;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=61931520;
 //BA.debugLineNum = 61931520;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=61931521;
 //BA.debugLineNum = 61931521;BA.debugLine="Try";
try {RDebugUtils.currentLine=61931522;
 //BA.debugLineNum = 61931522;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61931523;
 //BA.debugLineNum = 61931523;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61931525;
 //BA.debugLineNum = 61931525;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961931525",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61931526;
 //BA.debugLineNum = 61931526;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=61931528;
 //BA.debugLineNum = 61931528;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61931529;
 //BA.debugLineNum = 61931529;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=61997056;
 //BA.debugLineNum = 61997056;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=61997057;
 //BA.debugLineNum = 61997057;BA.debugLine="Try";
try {RDebugUtils.currentLine=61997058;
 //BA.debugLineNum = 61997058;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61997059;
 //BA.debugLineNum = 61997059;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61997061;
 //BA.debugLineNum = 61997061;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961997061",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61997062;
 //BA.debugLineNum = 61997062;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=61997064;
 //BA.debugLineNum = 61997064;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61997065;
 //BA.debugLineNum = 61997065;BA.debugLine="End Sub";
return "";
}
public String  _escapelink(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "escapelink", true))
	 {return ((String) Debug.delegate(ba, "escapelink", new Object[] {_link,_parameters}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
int _i = 0;
RDebugUtils.currentLine=61865984;
 //BA.debugLineNum = 61865984;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=61865985;
 //BA.debugLineNum = 61865985;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=61865986;
 //BA.debugLineNum = 61865986;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=61865987;
 //BA.debugLineNum = 61865987;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=61865988;
 //BA.debugLineNum = 61865988;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=61865989;
 //BA.debugLineNum = 61865989;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=61865990;
 //BA.debugLineNum = 61865990;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=61865991;
 //BA.debugLineNum = 61865991;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=61865992;
 //BA.debugLineNum = 61865992;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=61865993;
 //BA.debugLineNum = 61865993;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=61865995;
 //BA.debugLineNum = 61865995;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=61865996;
 //BA.debugLineNum = 61865996;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=61734912;
 //BA.debugLineNum = 61734912;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=61734913;
 //BA.debugLineNum = 61734913;BA.debugLine="Try";
try {RDebugUtils.currentLine=61734914;
 //BA.debugLineNum = 61734914;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61734915;
 //BA.debugLineNum = 61734915;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61734917;
 //BA.debugLineNum = 61734917;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961734917",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61734918;
 //BA.debugLineNum = 61734918;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=61734920;
 //BA.debugLineNum = 61734920;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61734921;
 //BA.debugLineNum = 61734921;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=61800448;
 //BA.debugLineNum = 61800448;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=61800449;
 //BA.debugLineNum = 61800449;BA.debugLine="Try";
try {RDebugUtils.currentLine=61800450;
 //BA.debugLineNum = 61800450;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61800451;
 //BA.debugLineNum = 61800451;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61800453;
 //BA.debugLineNum = 61800453;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961800453",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61800454;
 //BA.debugLineNum = 61800454;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=61800456;
 //BA.debugLineNum = 61800456;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61800457;
 //BA.debugLineNum = 61800457;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=62390272;
 //BA.debugLineNum = 62390272;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=62390273;
 //BA.debugLineNum = 62390273;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=62390274;
 //BA.debugLineNum = 62390274;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=62390275;
 //BA.debugLineNum = 62390275;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=62390276;
 //BA.debugLineNum = 62390276;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.example.ef.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=62521344;
 //BA.debugLineNum = 62521344;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=62521345;
 //BA.debugLineNum = 62521345;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=62521346;
 //BA.debugLineNum = 62521346;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.example.ef.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=62455808;
 //BA.debugLineNum = 62455808;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=62455809;
 //BA.debugLineNum = 62455809;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height);
RDebugUtils.currentLine=62455810;
 //BA.debugLineNum = 62455810;BA.debugLine="End Sub";
return null;
}
public String  _getstring(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=62128128;
 //BA.debugLineNum = 62128128;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=62128129;
 //BA.debugLineNum = 62128129;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=62128130;
 //BA.debugLineNum = 62128130;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(b4a.example.ef.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=62193664;
 //BA.debugLineNum = 62193664;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=62193668;
 //BA.debugLineNum = 62193668;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=62193669;
 //BA.debugLineNum = 62193669;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=62193670;
 //BA.debugLineNum = 62193670;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=62193671;
 //BA.debugLineNum = 62193671;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=62193672;
 //BA.debugLineNum = 62193672;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=62193674;
 //BA.debugLineNum = 62193674;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=61472768;
 //BA.debugLineNum = 61472768;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=61472769;
 //BA.debugLineNum = 61472769;BA.debugLine="Try";
try {RDebugUtils.currentLine=61472770;
 //BA.debugLineNum = 61472770;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61472771;
 //BA.debugLineNum = 61472771;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61472773;
 //BA.debugLineNum = 61472773;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961472773",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61472774;
 //BA.debugLineNum = 61472774;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=61472776;
 //BA.debugLineNum = 61472776;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61472777;
 //BA.debugLineNum = 61472777;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=61603840;
 //BA.debugLineNum = 61603840;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=61603841;
 //BA.debugLineNum = 61603841;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=61603842;
 //BA.debugLineNum = 61603842;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=61603844;
 //BA.debugLineNum = 61603844;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=61603846;
 //BA.debugLineNum = 61603846;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=61603847;
 //BA.debugLineNum = 61603847;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=61407232;
 //BA.debugLineNum = 61407232;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=61407233;
 //BA.debugLineNum = 61407233;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61407241;
 //BA.debugLineNum = 61407241;BA.debugLine="Try";
try {RDebugUtils.currentLine=61407242;
 //BA.debugLineNum = 61407242;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61407244;
 //BA.debugLineNum = 61407244;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961407244",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61407245;
 //BA.debugLineNum = 61407245;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=61407249;
 //BA.debugLineNum = 61407249;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61407250;
 //BA.debugLineNum = 61407250;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=61341696;
 //BA.debugLineNum = 61341696;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=61341697;
 //BA.debugLineNum = 61341697;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=61341698;
 //BA.debugLineNum = 61341698;BA.debugLine="End Sub";
return "";
}
public String  _postfile(b4a.example.ef.httpjob __ref,String _link,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postfile", true))
	 {return ((String) Debug.delegate(ba, "postfile", new Object[] {_link,_dir,_filename}));}
int _length = 0;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=61669376;
 //BA.debugLineNum = 61669376;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=61669377;
 //BA.debugLineNum = 61669377;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61669382;
 //BA.debugLineNum = 61669382;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=61669383;
 //BA.debugLineNum = 61669383;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=61669384;
 //BA.debugLineNum = 61669384;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("961669384","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=61669385;
 //BA.debugLineNum = 61669385;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=61669387;
 //BA.debugLineNum = 61669387;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=61669388;
 //BA.debugLineNum = 61669388;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=61669389;
 //BA.debugLineNum = 61669389;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=61669390;
 //BA.debugLineNum = 61669390;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=61669393;
 //BA.debugLineNum = 61669393;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=61669394;
 //BA.debugLineNum = 61669394;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=61669395;
 //BA.debugLineNum = 61669395;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=61669396;
 //BA.debugLineNum = 61669396;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=61669398;
 //BA.debugLineNum = 61669398;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=61669399;
 //BA.debugLineNum = 61669399;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=61669402;
 //BA.debugLineNum = 61669402;BA.debugLine="End Sub";
return "";
}
public String  _postmultipart(b4a.example.ef.httpjob __ref,String _link,anywheresoftware.b4a.objects.collections.Map _namevalues,anywheresoftware.b4a.objects.collections.List _files) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postmultipart", true))
	 {return ((String) Debug.delegate(ba, "postmultipart", new Object[] {_link,_namevalues,_files}));}
String _boundary = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream = null;
byte[] _b = null;
String _eol = "";
boolean _empty = false;
String _key = "";
String _value = "";
String _s = "";
b4a.example.ef.httpjob._multipartfiledata _fd = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=61538304;
 //BA.debugLineNum = 61538304;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=61538305;
 //BA.debugLineNum = 61538305;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=61538306;
 //BA.debugLineNum = 61538306;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=61538307;
 //BA.debugLineNum = 61538307;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=61538308;
 //BA.debugLineNum = 61538308;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=61538309;
 //BA.debugLineNum = 61538309;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=61538310;
 //BA.debugLineNum = 61538310;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=61538311;
 //BA.debugLineNum = 61538311;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=61538312;
 //BA.debugLineNum = 61538312;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=61538313;
 //BA.debugLineNum = 61538313;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=61538314;
 //BA.debugLineNum = 61538314;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=61538315;
 //BA.debugLineNum = 61538315;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=61538320;
 //BA.debugLineNum = 61538320;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=61538321;
 //BA.debugLineNum = 61538321;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=61538324;
 //BA.debugLineNum = 61538324;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=61538325;
 //BA.debugLineNum = 61538325;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.example.ef.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=61538326;
 //BA.debugLineNum = 61538326;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=61538327;
 //BA.debugLineNum = 61538327;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=61538333;
 //BA.debugLineNum = 61538333;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=61538334;
 //BA.debugLineNum = 61538334;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=61538335;
 //BA.debugLineNum = 61538335;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=61538336;
 //BA.debugLineNum = 61538336;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=61538339;
 //BA.debugLineNum = 61538339;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=61538340;
 //BA.debugLineNum = 61538340;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=61538343;
 //BA.debugLineNum = 61538343;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=61538344;
 //BA.debugLineNum = 61538344;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=61538345;
 //BA.debugLineNum = 61538345;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=61538346;
 //BA.debugLineNum = 61538346;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=61538347;
 //BA.debugLineNum = 61538347;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=61538348;
 //BA.debugLineNum = 61538348;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=61079552;
 //BA.debugLineNum = 61079552;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=61079553;
 //BA.debugLineNum = 61079553;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=61079554;
 //BA.debugLineNum = 61079554;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=61276160;
 //BA.debugLineNum = 61276160;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=61276161;
 //BA.debugLineNum = 61276161;BA.debugLine="Try";
try {RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=61276163;
 //BA.debugLineNum = 61276163;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=61276165;
 //BA.debugLineNum = 61276165;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("961276165",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=61276166;
 //BA.debugLineNum = 61276166;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=61276168;
 //BA.debugLineNum = 61276168;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=61276169;
 //BA.debugLineNum = 61276169;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=61210624;
 //BA.debugLineNum = 61210624;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=61210625;
 //BA.debugLineNum = 61210625;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=61210626;
 //BA.debugLineNum = 61210626;BA.debugLine="End Sub";
return "";
}
}