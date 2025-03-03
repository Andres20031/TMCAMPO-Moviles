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
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=41025546;
 //BA.debugLineNum = 41025546;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="End Sub";
return null;
}
public String  _postbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Try";
try {RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=41222147;
 //BA.debugLineNum = 41222147;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=41222149;
 //BA.debugLineNum = 41222149;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("941222149",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=41222152;
 //BA.debugLineNum = 41222152;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=41222153;
 //BA.debugLineNum = 41222153;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4a.example.ef.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="End Sub";
return null;
}
public String  _addscheme(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=40960003;
 //BA.debugLineNum = 40960003;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=40960004;
 //BA.debugLineNum = 40960004;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=40960005;
 //BA.debugLineNum = 40960005;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=40960011;
 //BA.debugLineNum = 40960011;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=40960013;
 //BA.debugLineNum = 40960013;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=40960014;
 //BA.debugLineNum = 40960014;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=40960023;
 //BA.debugLineNum = 40960023;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=40960024;
 //BA.debugLineNum = 40960024;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=40960028;
 //BA.debugLineNum = 40960028;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=40960029;
 //BA.debugLineNum = 40960029;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=40960030;
 //BA.debugLineNum = 40960030;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="Try";
try {RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=42008581;
 //BA.debugLineNum = 42008581;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("942008581",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=42008582;
 //BA.debugLineNum = 42008582;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=42008584;
 //BA.debugLineNum = 42008584;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=42008585;
 //BA.debugLineNum = 42008585;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="Try";
try {RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=42074115;
 //BA.debugLineNum = 42074115;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=42074117;
 //BA.debugLineNum = 42074117;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("942074117",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=42074118;
 //BA.debugLineNum = 42074118;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=42074120;
 //BA.debugLineNum = 42074120;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=42074121;
 //BA.debugLineNum = 42074121;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=41943047;
 //BA.debugLineNum = 41943047;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=41943048;
 //BA.debugLineNum = 41943048;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=41943049;
 //BA.debugLineNum = 41943049;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=41943051;
 //BA.debugLineNum = 41943051;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=41943052;
 //BA.debugLineNum = 41943052;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="Try";
try {RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("941811973",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=41811974;
 //BA.debugLineNum = 41811974;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=41811976;
 //BA.debugLineNum = 41811976;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=41811977;
 //BA.debugLineNum = 41811977;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="Try";
try {RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=41877509;
 //BA.debugLineNum = 41877509;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("941877509",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=41877512;
 //BA.debugLineNum = 41877512;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=41877513;
 //BA.debugLineNum = 41877513;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.example.ef.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.example.ef.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height);
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="End Sub";
return null;
}
public String  _getstring(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(b4a.example.ef.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=42270724;
 //BA.debugLineNum = 42270724;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=42270725;
 //BA.debugLineNum = 42270725;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=42270726;
 //BA.debugLineNum = 42270726;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=42270727;
 //BA.debugLineNum = 42270727;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=42270728;
 //BA.debugLineNum = 42270728;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=42270730;
 //BA.debugLineNum = 42270730;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="Try";
try {RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=41549829;
 //BA.debugLineNum = 41549829;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("941549829",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=41549832;
 //BA.debugLineNum = 41549832;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=41549833;
 //BA.debugLineNum = 41549833;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=41680900;
 //BA.debugLineNum = 41680900;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=41680902;
 //BA.debugLineNum = 41680902;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=41680903;
 //BA.debugLineNum = 41680903;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=41484297;
 //BA.debugLineNum = 41484297;BA.debugLine="Try";
try {RDebugUtils.currentLine=41484298;
 //BA.debugLineNum = 41484298;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=41484300;
 //BA.debugLineNum = 41484300;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("941484300",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=41484301;
 //BA.debugLineNum = 41484301;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=41484305;
 //BA.debugLineNum = 41484305;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=41484306;
 //BA.debugLineNum = 41484306;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=41746438;
 //BA.debugLineNum = 41746438;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=41746439;
 //BA.debugLineNum = 41746439;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=41746440;
 //BA.debugLineNum = 41746440;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("941746440","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=41746441;
 //BA.debugLineNum = 41746441;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=41746443;
 //BA.debugLineNum = 41746443;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=41746444;
 //BA.debugLineNum = 41746444;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=41746445;
 //BA.debugLineNum = 41746445;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=41746446;
 //BA.debugLineNum = 41746446;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=41746449;
 //BA.debugLineNum = 41746449;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=41746450;
 //BA.debugLineNum = 41746450;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=41746451;
 //BA.debugLineNum = 41746451;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=41746452;
 //BA.debugLineNum = 41746452;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=41746454;
 //BA.debugLineNum = 41746454;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=41746455;
 //BA.debugLineNum = 41746455;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=41746458;
 //BA.debugLineNum = 41746458;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=41615363;
 //BA.debugLineNum = 41615363;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=41615364;
 //BA.debugLineNum = 41615364;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=41615365;
 //BA.debugLineNum = 41615365;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=41615366;
 //BA.debugLineNum = 41615366;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=41615367;
 //BA.debugLineNum = 41615367;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=41615368;
 //BA.debugLineNum = 41615368;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=41615369;
 //BA.debugLineNum = 41615369;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=41615370;
 //BA.debugLineNum = 41615370;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=41615371;
 //BA.debugLineNum = 41615371;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=41615376;
 //BA.debugLineNum = 41615376;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=41615377;
 //BA.debugLineNum = 41615377;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=41615380;
 //BA.debugLineNum = 41615380;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=41615381;
 //BA.debugLineNum = 41615381;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.example.ef.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=41615382;
 //BA.debugLineNum = 41615382;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=41615383;
 //BA.debugLineNum = 41615383;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=41615389;
 //BA.debugLineNum = 41615389;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=41615390;
 //BA.debugLineNum = 41615390;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=41615391;
 //BA.debugLineNum = 41615391;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=41615392;
 //BA.debugLineNum = 41615392;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=41615395;
 //BA.debugLineNum = 41615395;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=41615396;
 //BA.debugLineNum = 41615396;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=41615399;
 //BA.debugLineNum = 41615399;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=41615400;
 //BA.debugLineNum = 41615400;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=41615401;
 //BA.debugLineNum = 41615401;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=41615402;
 //BA.debugLineNum = 41615402;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=41615403;
 //BA.debugLineNum = 41615403;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=41615404;
 //BA.debugLineNum = 41615404;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Try";
try {RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=41353221;
 //BA.debugLineNum = 41353221;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("941353221",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=41353225;
 //BA.debugLineNum = 41353225;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="End Sub";
return "";
}
}