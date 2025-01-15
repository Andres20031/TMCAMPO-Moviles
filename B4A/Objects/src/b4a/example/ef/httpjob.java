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
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=57475074;
 //BA.debugLineNum = 57475074;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=57475076;
 //BA.debugLineNum = 57475076;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=56360961;
 //BA.debugLineNum = 56360961;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=56360970;
 //BA.debugLineNum = 56360970;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="End Sub";
return null;
}
public String  _postbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=56557569;
 //BA.debugLineNum = 56557569;BA.debugLine="Try";
try {RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=56557571;
 //BA.debugLineNum = 56557571;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=56557573;
 //BA.debugLineNum = 56557573;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("956557573",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=56557574;
 //BA.debugLineNum = 56557574;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=56557576;
 //BA.debugLineNum = 56557576;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=56557577;
 //BA.debugLineNum = 56557577;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4a.example.ef.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=57737219;
 //BA.debugLineNum = 57737219;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=57671680;
 //BA.debugLineNum = 57671680;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=57671681;
 //BA.debugLineNum = 57671681;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=57671682;
 //BA.debugLineNum = 57671682;BA.debugLine="End Sub";
return null;
}
public String  _addscheme(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=56426499;
 //BA.debugLineNum = 56426499;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=56295424;
 //BA.debugLineNum = 56295424;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=56295428;
 //BA.debugLineNum = 56295428;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=56295429;
 //BA.debugLineNum = 56295429;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=56295435;
 //BA.debugLineNum = 56295435;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=56295437;
 //BA.debugLineNum = 56295437;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=56295438;
 //BA.debugLineNum = 56295438;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=56295447;
 //BA.debugLineNum = 56295447;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=56295448;
 //BA.debugLineNum = 56295448;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=56295452;
 //BA.debugLineNum = 56295452;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=56295453;
 //BA.debugLineNum = 56295453;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=56295454;
 //BA.debugLineNum = 56295454;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=57344000;
 //BA.debugLineNum = 57344000;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="Try";
try {RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=57344003;
 //BA.debugLineNum = 57344003;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=57344005;
 //BA.debugLineNum = 57344005;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("957344005",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=57344006;
 //BA.debugLineNum = 57344006;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=57344008;
 //BA.debugLineNum = 57344008;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=57344009;
 //BA.debugLineNum = 57344009;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=57409537;
 //BA.debugLineNum = 57409537;BA.debugLine="Try";
try {RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=57409539;
 //BA.debugLineNum = 57409539;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=57409541;
 //BA.debugLineNum = 57409541;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("957409541",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=57409542;
 //BA.debugLineNum = 57409542;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=57409544;
 //BA.debugLineNum = 57409544;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=57409545;
 //BA.debugLineNum = 57409545;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=57278464;
 //BA.debugLineNum = 57278464;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=57278465;
 //BA.debugLineNum = 57278465;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=57278466;
 //BA.debugLineNum = 57278466;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=57278467;
 //BA.debugLineNum = 57278467;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=57278468;
 //BA.debugLineNum = 57278468;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=57278469;
 //BA.debugLineNum = 57278469;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=57278470;
 //BA.debugLineNum = 57278470;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=57278471;
 //BA.debugLineNum = 57278471;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=57278472;
 //BA.debugLineNum = 57278472;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=57278473;
 //BA.debugLineNum = 57278473;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=57278475;
 //BA.debugLineNum = 57278475;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=57278476;
 //BA.debugLineNum = 57278476;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=57147393;
 //BA.debugLineNum = 57147393;BA.debugLine="Try";
try {RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=57147395;
 //BA.debugLineNum = 57147395;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=57147397;
 //BA.debugLineNum = 57147397;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("957147397",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=57147398;
 //BA.debugLineNum = 57147398;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=57147400;
 //BA.debugLineNum = 57147400;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=57147401;
 //BA.debugLineNum = 57147401;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="Try";
try {RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=57212931;
 //BA.debugLineNum = 57212931;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=57212933;
 //BA.debugLineNum = 57212933;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("957212933",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=57212934;
 //BA.debugLineNum = 57212934;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=57212936;
 //BA.debugLineNum = 57212936;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=57212937;
 //BA.debugLineNum = 57212937;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=57802755;
 //BA.debugLineNum = 57802755;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.example.ef.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=57933824;
 //BA.debugLineNum = 57933824;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.example.ef.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=57868288;
 //BA.debugLineNum = 57868288;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height);
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="End Sub";
return null;
}
public String  _getstring(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=57540608;
 //BA.debugLineNum = 57540608;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=57540609;
 //BA.debugLineNum = 57540609;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=57540610;
 //BA.debugLineNum = 57540610;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(b4a.example.ef.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=57606148;
 //BA.debugLineNum = 57606148;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=57606149;
 //BA.debugLineNum = 57606149;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=57606150;
 //BA.debugLineNum = 57606150;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=57606151;
 //BA.debugLineNum = 57606151;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=57606152;
 //BA.debugLineNum = 57606152;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=57606154;
 //BA.debugLineNum = 57606154;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=56885248;
 //BA.debugLineNum = 56885248;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="Try";
try {RDebugUtils.currentLine=56885250;
 //BA.debugLineNum = 56885250;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=56885251;
 //BA.debugLineNum = 56885251;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=56885253;
 //BA.debugLineNum = 56885253;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("956885253",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=56885254;
 //BA.debugLineNum = 56885254;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=56885256;
 //BA.debugLineNum = 56885256;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=56885257;
 //BA.debugLineNum = 56885257;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=57016321;
 //BA.debugLineNum = 57016321;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=57016324;
 //BA.debugLineNum = 57016324;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=57016326;
 //BA.debugLineNum = 57016326;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=57016327;
 //BA.debugLineNum = 57016327;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=56819721;
 //BA.debugLineNum = 56819721;BA.debugLine="Try";
try {RDebugUtils.currentLine=56819722;
 //BA.debugLineNum = 56819722;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=56819724;
 //BA.debugLineNum = 56819724;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("956819724",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=56819725;
 //BA.debugLineNum = 56819725;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=56819729;
 //BA.debugLineNum = 56819729;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=56819730;
 //BA.debugLineNum = 56819730;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=57081856;
 //BA.debugLineNum = 57081856;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=57081862;
 //BA.debugLineNum = 57081862;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=57081863;
 //BA.debugLineNum = 57081863;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=57081864;
 //BA.debugLineNum = 57081864;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("957081864","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=57081865;
 //BA.debugLineNum = 57081865;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=57081867;
 //BA.debugLineNum = 57081867;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=57081868;
 //BA.debugLineNum = 57081868;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=57081869;
 //BA.debugLineNum = 57081869;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=57081870;
 //BA.debugLineNum = 57081870;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=57081873;
 //BA.debugLineNum = 57081873;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=57081874;
 //BA.debugLineNum = 57081874;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=57081875;
 //BA.debugLineNum = 57081875;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=57081876;
 //BA.debugLineNum = 57081876;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=57081878;
 //BA.debugLineNum = 57081878;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=57081879;
 //BA.debugLineNum = 57081879;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=57081882;
 //BA.debugLineNum = 57081882;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=56950785;
 //BA.debugLineNum = 56950785;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=56950786;
 //BA.debugLineNum = 56950786;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=56950787;
 //BA.debugLineNum = 56950787;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=56950788;
 //BA.debugLineNum = 56950788;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=56950789;
 //BA.debugLineNum = 56950789;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=56950790;
 //BA.debugLineNum = 56950790;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=56950791;
 //BA.debugLineNum = 56950791;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=56950792;
 //BA.debugLineNum = 56950792;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=56950793;
 //BA.debugLineNum = 56950793;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=56950794;
 //BA.debugLineNum = 56950794;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=56950795;
 //BA.debugLineNum = 56950795;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=56950800;
 //BA.debugLineNum = 56950800;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=56950801;
 //BA.debugLineNum = 56950801;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=56950804;
 //BA.debugLineNum = 56950804;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=56950805;
 //BA.debugLineNum = 56950805;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.example.ef.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=56950806;
 //BA.debugLineNum = 56950806;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=56950807;
 //BA.debugLineNum = 56950807;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=56950813;
 //BA.debugLineNum = 56950813;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=56950814;
 //BA.debugLineNum = 56950814;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=56950815;
 //BA.debugLineNum = 56950815;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=56950816;
 //BA.debugLineNum = 56950816;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=56950819;
 //BA.debugLineNum = 56950819;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=56950820;
 //BA.debugLineNum = 56950820;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=56950823;
 //BA.debugLineNum = 56950823;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=56950824;
 //BA.debugLineNum = 56950824;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=56950825;
 //BA.debugLineNum = 56950825;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=56950826;
 //BA.debugLineNum = 56950826;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=56950827;
 //BA.debugLineNum = 56950827;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=56950828;
 //BA.debugLineNum = 56950828;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=56688641;
 //BA.debugLineNum = 56688641;BA.debugLine="Try";
try {RDebugUtils.currentLine=56688642;
 //BA.debugLineNum = 56688642;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=56688643;
 //BA.debugLineNum = 56688643;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=56688645;
 //BA.debugLineNum = 56688645;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("956688645",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=56688646;
 //BA.debugLineNum = 56688646;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=56688648;
 //BA.debugLineNum = 56688648;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=56688649;
 //BA.debugLineNum = 56688649;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=56623104;
 //BA.debugLineNum = 56623104;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="End Sub";
return "";
}
}