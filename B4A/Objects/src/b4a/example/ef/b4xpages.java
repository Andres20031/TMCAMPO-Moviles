package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpages {
private static b4xpages mostCurrent = new b4xpages();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public static Object _mpm = null;
public static b4a.example.ef.b4xpagesdelegator _delegate = null;
public static Object _globalcontext = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static String  _addpageandcreate(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpageandcreate", true))
	 {return ((String) Debug.delegate(null, "addpageandcreate", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager(_ba)._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="End Sub";
return "";
}
public static String  _addpage(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpage", true))
	 {return ((String) Debug.delegate(null, "addpage", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager(_ba)._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpage", true))
	 {return ((String) Debug.delegate(null, "showpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager(_ba)._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="End Sub";
return "";
}
public static b4a.example.ef.b4xpagesmanager  _getmanager(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getmanager", true))
	 {return ((b4a.example.ef.b4xpagesmanager) Debug.delegate(null, "getmanager", new Object[] {_ba}));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="Return mPM";
if (true) return (b4a.example.ef.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="End Sub";
return null;
}
public static Object  _getpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpage", true))
	 {return ((Object) Debug.delegate(null, "getpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager(_ba)._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="End Sub";
return null;
}
public static String  _closepage(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "closepage", true))
	 {return ((String) Debug.delegate(null, "closepage", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager(_ba)._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="End Sub";
return "";
}
public static String  _showpageandremovepreviouspages(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(null, "showpageandremovepreviouspages", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager(_ba)._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return "";
}
public static b4a.example.ef.b4xpagesmanager._b4amenuitem  _addmenuitem(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addmenuitem", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4amenuitem) Debug.delegate(null, "addmenuitem", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub AddMenuItem(B4XPage As Object, Title As";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="Return GetManager.AddMenuItem(B4XPage, Title)";
if (true) return _getmanager(_ba)._addmenuitem /*b4a.example.ef.b4xpagesmanager._b4amenuitem*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.ActivityWrapper  _getnativeparent(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getnativeparent", true))
	 {return ((anywheresoftware.b4a.objects.ActivityWrapper) Debug.delegate(null, "getnativeparent", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=32964616;
 //BA.debugLineNum = 32964616;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ ;
RDebugUtils.currentLine=32964617;
 //BA.debugLineNum = 32964617;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpageid", true))
	 {return ((String) Debug.delegate(null, "getpageid", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(anywheresoftware.b4a.BA _ba,Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(null, "internalsetpagesmanager", new Object[] {_ba,_pm}));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(null, "isinitialized", new Object[] {_ba}));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4a.example.ef.b4xpagesmanager;
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="End Sub";
return false;
}
public static b4a.example.ef.b4xmainpage  _mainpage(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "mainpage", true))
	 {return ((b4a.example.ef.b4xmainpage) Debug.delegate(null, "mainpage", new Object[] {_ba}));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager(_ba)._mainpage /*b4a.example.ef.b4xmainpage*/ ;
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="End Sub";
return null;
}
public static String  _settitle(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "settitle", true))
	 {return ((String) Debug.delegate(null, "settitle", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager(_ba)._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="End Sub";
return "";
}
}