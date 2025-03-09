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
RDebugUtils.currentLine=59834368;
 //BA.debugLineNum = 59834368;BA.debugLine="Public Sub Release";
RDebugUtils.currentLine=59834370;
 //BA.debugLineNum = 59834370;BA.debugLine="File.Delete(HttpUtils2Service.TempFolder, taskId)";
__c.File.Delete(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=59834372;
 //BA.debugLineNum = 59834372;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.BA _ba,String _name,Object _targetmodule) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_name,_targetmodule}));}
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="JobName = Name";
__ref._jobname /*String*/  = _name;
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="target = TargetModule";
__ref._target /*Object*/  = _targetmodule;
RDebugUtils.currentLine=58720266;
 //BA.debugLineNum = 58720266;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.streams.File.InputStreamWrapper  _getinputstream(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getinputstream", true))
	 {return ((anywheresoftware.b4a.objects.streams.File.InputStreamWrapper) Debug.delegate(ba, "getinputstream", null));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
RDebugUtils.currentLine=60358656;
 //BA.debugLineNum = 60358656;BA.debugLine="Public Sub GetInputStream As InputStream";
RDebugUtils.currentLine=60358657;
 //BA.debugLineNum = 60358657;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=60358658;
 //BA.debugLineNum = 60358658;BA.debugLine="In = File.OpenInput(HttpUtils2Service.TempFolder,";
_in = __c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=60358659;
 //BA.debugLineNum = 60358659;BA.debugLine="Return In";
if (true) return _in;
RDebugUtils.currentLine=60358660;
 //BA.debugLineNum = 60358660;BA.debugLine="End Sub";
return null;
}
public String  _postbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "postbytes", true))
	 {return ((String) Debug.delegate(ba, "postbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="Try";
try {RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=58916867;
 //BA.debugLineNum = 58916867;BA.debugLine="req.InitializePost2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=58916869;
 //BA.debugLineNum = 58916869;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("958916869",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=58916870;
 //BA.debugLineNum = 58916870;BA.debugLine="req.InitializePost2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=58916872;
 //BA.debugLineNum = 58916872;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=58916873;
 //BA.debugLineNum = 58916873;BA.debugLine="End Sub";
return "";
}
public String  _complete(b4a.example.ef.httpjob __ref,int _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "complete", true))
	 {return ((String) Debug.delegate(ba, "complete", new Object[] {_id}));}
RDebugUtils.currentLine=60096512;
 //BA.debugLineNum = 60096512;BA.debugLine="Public Sub Complete (id As Int)";
RDebugUtils.currentLine=60096513;
 //BA.debugLineNum = 60096513;BA.debugLine="taskId = id";
__ref._taskid /*String*/  = BA.NumberToString(_id);
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="CallSubDelayed2(target, \"JobDone\", Me)";
__c.CallSubDelayed2(ba,__ref._target /*Object*/ ,"JobDone",this);
RDebugUtils.currentLine=60096515;
 //BA.debugLineNum = 60096515;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest  _getrequest(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getrequest", true))
	 {return ((anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest) Debug.delegate(ba, "getrequest", null));}
RDebugUtils.currentLine=60030976;
 //BA.debugLineNum = 60030976;BA.debugLine="Public Sub GetRequest As OkHttpRequest";
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="Return req";
if (true) return __ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ;
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="End Sub";
return null;
}
public String  _addscheme(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "addscheme", true))
	 {return ((String) Debug.delegate(ba, "addscheme", new Object[] {_link}));}
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Private Sub AddScheme (Link As String) As String";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="If DefaultScheme = \"\" Or Link.Contains(\":\") Then";
if ((__ref._defaultscheme /*String*/ ).equals("") || _link.contains(":")) { 
if (true) return _link;};
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="Return DefaultScheme & \"://\" & Link";
if (true) return __ref._defaultscheme /*String*/ +"://"+_link;
RDebugUtils.currentLine=58785795;
 //BA.debugLineNum = 58785795;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="Public JobName As String";
_jobname = "";
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="Public Success As Boolean";
_success = false;
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="Public Username, Password As String";
_username = "";
_password = "";
RDebugUtils.currentLine=58654724;
 //BA.debugLineNum = 58654724;BA.debugLine="Public ErrorMessage As String";
_errormessage = "";
RDebugUtils.currentLine=58654725;
 //BA.debugLineNum = 58654725;BA.debugLine="Private target As Object";
_target = new Object();
RDebugUtils.currentLine=58654731;
 //BA.debugLineNum = 58654731;BA.debugLine="Private taskId As String";
_taskid = "";
RDebugUtils.currentLine=58654733;
 //BA.debugLineNum = 58654733;BA.debugLine="Private req As OkHttpRequest";
_req = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest();
RDebugUtils.currentLine=58654734;
 //BA.debugLineNum = 58654734;BA.debugLine="Public Response As OkHttpResponse";
_response = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpResponse();
RDebugUtils.currentLine=58654743;
 //BA.debugLineNum = 58654743;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=58654744;
 //BA.debugLineNum = 58654744;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
RDebugUtils.currentLine=58654748;
 //BA.debugLineNum = 58654748;BA.debugLine="Private Const InvalidURL As String = \"https://inv";
_invalidurl = "https://invalid-url/";
RDebugUtils.currentLine=58654749;
 //BA.debugLineNum = 58654749;BA.debugLine="Public DefaultScheme As String = \"https\"";
_defaultscheme = "https";
RDebugUtils.currentLine=58654750;
 //BA.debugLineNum = 58654750;BA.debugLine="End Sub";
return "";
}
public String  _delete(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((String) Debug.delegate(ba, "delete", new Object[] {_link}));}
RDebugUtils.currentLine=59703296;
 //BA.debugLineNum = 59703296;BA.debugLine="Public Sub Delete(Link As String)";
RDebugUtils.currentLine=59703297;
 //BA.debugLineNum = 59703297;BA.debugLine="Try";
try {RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="req.InitializeDelete(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=59703301;
 //BA.debugLineNum = 59703301;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("959703301",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=59703302;
 //BA.debugLineNum = 59703302;BA.debugLine="req.InitializeDelete(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=59703304;
 //BA.debugLineNum = 59703304;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=59703305;
 //BA.debugLineNum = 59703305;BA.debugLine="End Sub";
return "";
}
public String  _delete2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "delete2", true))
	 {return ((String) Debug.delegate(ba, "delete2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=59768832;
 //BA.debugLineNum = 59768832;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="Try";
try {RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59768835;
 //BA.debugLineNum = 59768835;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=59768837;
 //BA.debugLineNum = 59768837;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("959768837",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=59768838;
 //BA.debugLineNum = 59768838;BA.debugLine="req.InitializeDelete(escapeLink(InvalidURL, Para";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeDelete(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=59768840;
 //BA.debugLineNum = 59768840;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=59768841;
 //BA.debugLineNum = 59768841;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=59637763;
 //BA.debugLineNum = 59637763;BA.debugLine="sb.Append(Link)";
_sb.Append(_link);
RDebugUtils.currentLine=59637764;
 //BA.debugLineNum = 59637764;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.length>0) { 
_sb.Append("?");};
RDebugUtils.currentLine=59637765;
 //BA.debugLineNum = 59637765;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=59637766;
 //BA.debugLineNum = 59637766;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
final int step6 = 2;
final int limit6 = (int) (_parameters.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=59637767;
 //BA.debugLineNum = 59637767;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
_sb.Append("&");};
RDebugUtils.currentLine=59637768;
 //BA.debugLineNum = 59637768;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
_sb.Append(_su.EncodeUrl(_parameters[_i],"UTF8")).Append("=");
RDebugUtils.currentLine=59637769;
 //BA.debugLineNum = 59637769;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
_sb.Append(_su.EncodeUrl(_parameters[(int) (_i+1)],"UTF8"));
 }
};
RDebugUtils.currentLine=59637771;
 //BA.debugLineNum = 59637771;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=59637772;
 //BA.debugLineNum = 59637772;BA.debugLine="End Sub";
return "";
}
public String  _download(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download", true))
	 {return ((String) Debug.delegate(ba, "download", new Object[] {_link}));}
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Public Sub Download(Link As String)";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="Try";
try {RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59506691;
 //BA.debugLineNum = 59506691;BA.debugLine="req.InitializeGet(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=59506693;
 //BA.debugLineNum = 59506693;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("959506693",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=59506694;
 //BA.debugLineNum = 59506694;BA.debugLine="req.InitializeGet(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=59506696;
 //BA.debugLineNum = 59506696;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=59506697;
 //BA.debugLineNum = 59506697;BA.debugLine="End Sub";
return "";
}
public String  _download2(b4a.example.ef.httpjob __ref,String _link,String[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "download2", true))
	 {return ((String) Debug.delegate(ba, "download2", new Object[] {_link,_parameters}));}
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
RDebugUtils.currentLine=59572225;
 //BA.debugLineNum = 59572225;BA.debugLine="Try";
try {RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59572227;
 //BA.debugLineNum = 59572227;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,_link,_parameters));
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=59572229;
 //BA.debugLineNum = 59572229;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("959572229",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=59572230;
 //BA.debugLineNum = 59572230;BA.debugLine="req.InitializeGet(escapeLink(InvalidURL, Paramet";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeGet(__ref._escapelink /*String*/ (null,__ref._invalidurl /*String*/ ,_parameters));
 };
RDebugUtils.currentLine=59572232;
 //BA.debugLineNum = 59572232;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=59572233;
 //BA.debugLineNum = 59572233;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmap(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
RDebugUtils.currentLine=60162048;
 //BA.debugLineNum = 60162048;BA.debugLine="Public Sub GetBitmap As Bitmap";
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="Dim b As Bitmap";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="b = LoadBitmap(HttpUtils2Service.TempFolder, task";
_b = __c.LoadBitmap(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ );
RDebugUtils.currentLine=60162051;
 //BA.debugLineNum = 60162051;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=60162052;
 //BA.debugLineNum = 60162052;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapresize(b4a.example.ef.httpjob __ref,int _width,int _height,boolean _keepaspectratio) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapresize", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapresize", new Object[] {_width,_height,_keepaspectratio}));}
RDebugUtils.currentLine=60293120;
 //BA.debugLineNum = 60293120;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
RDebugUtils.currentLine=60293121;
 //BA.debugLineNum = 60293121;BA.debugLine="Return LoadBitmapResize(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapResize(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height,_keepaspectratio);
RDebugUtils.currentLine=60293122;
 //BA.debugLineNum = 60293122;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _getbitmapsample(b4a.example.ef.httpjob __ref,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getbitmapsample", true))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "getbitmapsample", new Object[] {_width,_height}));}
RDebugUtils.currentLine=60227584;
 //BA.debugLineNum = 60227584;BA.debugLine="Public Sub GetBitmapSample(Width As Int, Height As";
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="Return LoadBitmapSample(HttpUtils2Service.TempFol";
if (true) return __c.LoadBitmapSample(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ,_width,_height);
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="End Sub";
return null;
}
public String  _getstring(b4a.example.ef.httpjob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", null));}
RDebugUtils.currentLine=59899904;
 //BA.debugLineNum = 59899904;BA.debugLine="Public Sub GetString As String";
RDebugUtils.currentLine=59899905;
 //BA.debugLineNum = 59899905;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return __ref._getstring2 /*String*/ (null,"UTF8");
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(b4a.example.ef.httpjob __ref,String _encoding) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_encoding}));}
anywheresoftware.b4a.objects.streams.File.TextReaderWrapper _tr = null;
String _res = "";
RDebugUtils.currentLine=59965440;
 //BA.debugLineNum = 59965440;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
RDebugUtils.currentLine=59965444;
 //BA.debugLineNum = 59965444;BA.debugLine="Dim tr As TextReader";
_tr = new anywheresoftware.b4a.objects.streams.File.TextReaderWrapper();
RDebugUtils.currentLine=59965445;
 //BA.debugLineNum = 59965445;BA.debugLine="tr.Initialize2(File.OpenInput(HttpUtils2Service.T";
_tr.Initialize2((java.io.InputStream)(__c.File.OpenInput(_httputils2service._tempfolder /*String*/ ,__ref._taskid /*String*/ ).getObject()),_encoding);
RDebugUtils.currentLine=59965446;
 //BA.debugLineNum = 59965446;BA.debugLine="Dim res As String = tr.ReadAll";
_res = _tr.ReadAll();
RDebugUtils.currentLine=59965447;
 //BA.debugLineNum = 59965447;BA.debugLine="tr.Close";
_tr.Close();
RDebugUtils.currentLine=59965448;
 //BA.debugLineNum = 59965448;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=59965450;
 //BA.debugLineNum = 59965450;BA.debugLine="End Sub";
return "";
}
public String  _head(b4a.example.ef.httpjob __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "head", true))
	 {return ((String) Debug.delegate(ba, "head", new Object[] {_link}));}
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Public Sub Head(Link As String)";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="Try";
try {RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59244547;
 //BA.debugLineNum = 59244547;BA.debugLine="req.InitializeHead(Link)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(_link);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=59244549;
 //BA.debugLineNum = 59244549;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("959244549",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=59244550;
 //BA.debugLineNum = 59244550;BA.debugLine="req.InitializeHead(InvalidURL)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializeHead(__ref._invalidurl /*String*/ );
 };
RDebugUtils.currentLine=59244552;
 //BA.debugLineNum = 59244552;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=59244553;
 //BA.debugLineNum = 59244553;BA.debugLine="End Sub";
return "";
}
public boolean  _multipartstartsection(b4a.example.ef.httpjob __ref,anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _stream,boolean _empty) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "multipartstartsection", true))
	 {return ((Boolean) Debug.delegate(ba, "multipartstartsection", new Object[] {_stream,_empty}));}
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="If empty = False Then";
if (_empty==__c.False) { 
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
_stream.WriteBytes(new byte[]{(byte) (13),(byte) (10)},(int) (0),(int) (2));
 }else {
RDebugUtils.currentLine=59375620;
 //BA.debugLineNum = 59375620;BA.debugLine="empty = False";
_empty = __c.False;
 };
RDebugUtils.currentLine=59375622;
 //BA.debugLineNum = 59375622;BA.debugLine="Return empty";
if (true) return _empty;
RDebugUtils.currentLine=59375623;
 //BA.debugLineNum = 59375623;BA.debugLine="End Sub";
return false;
}
public String  _patchbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchbytes", true))
	 {return ((String) Debug.delegate(ba, "patchbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59179017;
 //BA.debugLineNum = 59179017;BA.debugLine="Try";
try {RDebugUtils.currentLine=59179018;
 //BA.debugLineNum = 59179018;BA.debugLine="req.InitializePatch2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=59179020;
 //BA.debugLineNum = 59179020;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("959179020",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=59179021;
 //BA.debugLineNum = 59179021;BA.debugLine="req.InitializePatch2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePatch2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=59179025;
 //BA.debugLineNum = 59179025;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=59179026;
 //BA.debugLineNum = 59179026;BA.debugLine="End Sub";
return "";
}
public String  _patchstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "patchstring", true))
	 {return ((String) Debug.delegate(ba, "patchstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._patchbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59441158;
 //BA.debugLineNum = 59441158;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=59441159;
 //BA.debugLineNum = 59441159;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=59441160;
 //BA.debugLineNum = 59441160;BA.debugLine="Log(\"Cannot send files from the assets folder.\")";
__c.LogImpl("959441160","Cannot send files from the assets folder.",0);
RDebugUtils.currentLine=59441161;
 //BA.debugLineNum = 59441161;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=59441163;
 //BA.debugLineNum = 59441163;BA.debugLine="length = File.Size(Dir, FileName)";
_length = (int) (__c.File.Size(_dir,_filename));
RDebugUtils.currentLine=59441164;
 //BA.debugLineNum = 59441164;BA.debugLine="Dim In As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=59441165;
 //BA.debugLineNum = 59441165;BA.debugLine="In = File.OpenInput(Dir, FileName)";
_in = __c.File.OpenInput(_dir,_filename);
RDebugUtils.currentLine=59441166;
 //BA.debugLineNum = 59441166;BA.debugLine="If length < 1000000 Then '1mb";
if (_length<1000000) { 
RDebugUtils.currentLine=59441169;
 //BA.debugLineNum = 59441169;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=59441170;
 //BA.debugLineNum = 59441170;BA.debugLine="out.InitializeToBytesArray(length)";
_out.InitializeToBytesArray(_length);
RDebugUtils.currentLine=59441171;
 //BA.debugLineNum = 59441171;BA.debugLine="File.Copy2(In, out)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_out.getObject()));
RDebugUtils.currentLine=59441172;
 //BA.debugLineNum = 59441172;BA.debugLine="PostBytes(Link, out.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_out.ToBytesArray());
 }else {
RDebugUtils.currentLine=59441174;
 //BA.debugLineNum = 59441174;BA.debugLine="req.InitializePost(Link, In, length)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePost(_link,(java.io.InputStream)(_in.getObject()),_length);
RDebugUtils.currentLine=59441175;
 //BA.debugLineNum = 59441175;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\",";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
 };
RDebugUtils.currentLine=59441178;
 //BA.debugLineNum = 59441178;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = "---------------------------1461124740692";
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="Dim stream As OutputStream";
_stream = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=59310083;
 //BA.debugLineNum = 59310083;BA.debugLine="stream.InitializeToBytesArray(0)";
_stream.InitializeToBytesArray((int) (0));
RDebugUtils.currentLine=59310084;
 //BA.debugLineNum = 59310084;BA.debugLine="Dim b() As Byte";
_b = new byte[(int) (0)];
;
RDebugUtils.currentLine=59310085;
 //BA.debugLineNum = 59310085;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = BA.ObjectToString(__c.Chr((int) (13)))+BA.ObjectToString(__c.Chr((int) (10)));
RDebugUtils.currentLine=59310086;
 //BA.debugLineNum = 59310086;BA.debugLine="Dim empty As Boolean = True";
_empty = __c.True;
RDebugUtils.currentLine=59310087;
 //BA.debugLineNum = 59310087;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= null && _namevalues.IsInitialized()) { 
RDebugUtils.currentLine=59310088;
 //BA.debugLineNum = 59310088;BA.debugLine="For Each key As String In NameValues.Keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _namevalues.Keys();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=59310089;
 //BA.debugLineNum = 59310089;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = BA.ObjectToString(_namevalues.Get((Object)(_key)));
RDebugUtils.currentLine=59310090;
 //BA.debugLineNum = 59310090;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=59310091;
 //BA.debugLineNum = 59310091;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_key))+"\"\n"+"\n"+""+__c.SmartStringFormatter("",(Object)(_value))+"");
RDebugUtils.currentLine=59310096;
 //BA.debugLineNum = 59310096;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=59310097;
 //BA.debugLineNum = 59310097;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
 }
};
 };
RDebugUtils.currentLine=59310100;
 //BA.debugLineNum = 59310100;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= null && _files.IsInitialized()) { 
RDebugUtils.currentLine=59310101;
 //BA.debugLineNum = 59310101;BA.debugLine="For Each fd As MultipartFileData In Files";
{
final anywheresoftware.b4a.BA.IterableList group17 = _files;
final int groupLen17 = group17.getSize()
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (b4a.example.ef.httpjob._multipartfiledata)(group17.Get(index17));
RDebugUtils.currentLine=59310102;
 //BA.debugLineNum = 59310102;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=59310103;
 //BA.debugLineNum = 59310103;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"\n"+"Content-Disposition: form-data; name=\""+__c.SmartStringFormatter("",(Object)(_fd.KeyName /*String*/ ))+"\"; filename=\""+__c.SmartStringFormatter("",(Object)(_fd.FileName /*String*/ ))+"\"\n"+"Content-Type: "+__c.SmartStringFormatter("",(Object)(_fd.ContentType /*String*/ ))+"\n"+"\n"+"");
RDebugUtils.currentLine=59310109;
 //BA.debugLineNum = 59310109;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=59310110;
 //BA.debugLineNum = 59310110;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=59310111;
 //BA.debugLineNum = 59310111;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
_in = __c.File.OpenInput(_fd.Dir /*String*/ ,_fd.FileName /*String*/ );
RDebugUtils.currentLine=59310112;
 //BA.debugLineNum = 59310112;BA.debugLine="File.Copy2(in, stream)";
__c.File.Copy2((java.io.InputStream)(_in.getObject()),(java.io.OutputStream)(_stream.getObject()));
 }
};
 };
RDebugUtils.currentLine=59310115;
 //BA.debugLineNum = 59310115;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = __ref._multipartstartsection /*boolean*/ (null,_stream,_empty);
RDebugUtils.currentLine=59310116;
 //BA.debugLineNum = 59310116;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ("--"+__c.SmartStringFormatter("",(Object)(_boundary))+"--\n"+"");
RDebugUtils.currentLine=59310119;
 //BA.debugLineNum = 59310119;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = _s.replace(__c.CRLF,_eol).getBytes("UTF8");
RDebugUtils.currentLine=59310120;
 //BA.debugLineNum = 59310120;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
_stream.WriteBytes(_b,(int) (0),_b.length);
RDebugUtils.currentLine=59310121;
 //BA.debugLineNum = 59310121;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
__ref._postbytes /*String*/ (null,_link,_stream.ToBytesArray());
RDebugUtils.currentLine=59310122;
 //BA.debugLineNum = 59310122;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentType("multipart/form-data; boundary="+_boundary);
RDebugUtils.currentLine=59310123;
 //BA.debugLineNum = 59310123;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .SetContentEncoding("UTF8");
RDebugUtils.currentLine=59310124;
 //BA.debugLineNum = 59310124;BA.debugLine="End Sub";
return "";
}
public String  _poststring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "poststring", true))
	 {return ((String) Debug.delegate(ba, "poststring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._postbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="End Sub";
return "";
}
public String  _putbytes(b4a.example.ef.httpjob __ref,String _link,byte[] _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putbytes", true))
	 {return ((String) Debug.delegate(ba, "putbytes", new Object[] {_link,_data}));}
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="Try";
try {RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="Link = AddScheme(Link)";
_link = __ref._addscheme /*String*/ (null,_link);
RDebugUtils.currentLine=59047939;
 //BA.debugLineNum = 59047939;BA.debugLine="req.InitializePut2(Link, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(_link,_data);
 } 
       catch (Exception e5) {
			ba.setLastException(e5);RDebugUtils.currentLine=59047941;
 //BA.debugLineNum = 59047941;BA.debugLine="Log($\"Invalid link: ${Link}\"$)";
__c.LogImpl("959047941",("Invalid link: "+__c.SmartStringFormatter("",(Object)(_link))+""),0);
RDebugUtils.currentLine=59047942;
 //BA.debugLineNum = 59047942;BA.debugLine="req.InitializePut2(InvalidURL, Data)";
__ref._req /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ .InitializePut2(__ref._invalidurl /*String*/ ,_data);
 };
RDebugUtils.currentLine=59047944;
 //BA.debugLineNum = 59047944;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
__c.CallSubDelayed2(ba,(Object)(_httputils2service.getObject()),"SubmitJob",this);
RDebugUtils.currentLine=59047945;
 //BA.debugLineNum = 59047945;BA.debugLine="End Sub";
return "";
}
public String  _putstring(b4a.example.ef.httpjob __ref,String _link,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="httpjob";
if (Debug.shouldDelegate(ba, "putstring", true))
	 {return ((String) Debug.delegate(ba, "putstring", new Object[] {_link,_text}));}
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
__ref._putbytes /*String*/ (null,_link,_text.getBytes("UTF8"));
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="End Sub";
return "";
}
}