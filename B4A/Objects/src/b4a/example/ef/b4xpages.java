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
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="GetManager.AddPageAndCreate(Id, B4XPage)";
_getmanager(_ba)._addpageandcreate /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="End Sub";
return "";
}
public static String  _addpage(anywheresoftware.b4a.BA _ba,String _id,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addpage", true))
	 {return ((String) Debug.delegate(null, "addpage", new Object[] {_ba,_id,_b4xpage}));}
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=50200577;
 //BA.debugLineNum = 50200577;BA.debugLine="GetManager.AddPage(Id, B4XPage)";
_getmanager(_ba)._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=50200578;
 //BA.debugLineNum = 50200578;BA.debugLine="End Sub";
return "";
}
public static String  _showpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpage", true))
	 {return ((String) Debug.delegate(null, "showpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="GetManager.ShowPage(Id)";
_getmanager(_ba)._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="End Sub";
return "";
}
public static b4a.example.ef.b4xpagesmanager  _getmanager(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getmanager", true))
	 {return ((b4a.example.ef.b4xpagesmanager) Debug.delegate(null, "getmanager", new Object[] {_ba}));}
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Public Sub GetManager As B4XPagesManager";
RDebugUtils.currentLine=49938433;
 //BA.debugLineNum = 49938433;BA.debugLine="Return mPM";
if (true) return (b4a.example.ef.b4xpagesmanager)(_mpm);
RDebugUtils.currentLine=49938434;
 //BA.debugLineNum = 49938434;BA.debugLine="End Sub";
return null;
}
public static String  _closepage(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "closepage", true))
	 {return ((String) Debug.delegate(null, "closepage", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="GetManager.ClosePage (B4XPage)";
_getmanager(_ba)._closepage /*String*/ (null,_b4xpage);
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="End Sub";
return "";
}
public static Object  _getpage(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpage", true))
	 {return ((Object) Debug.delegate(null, "getpage", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=50069505;
 //BA.debugLineNum = 50069505;BA.debugLine="Return GetManager.GetPage(Id)";
if (true) return _getmanager(_ba)._getpage /*Object*/ (null,_id);
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="End Sub";
return null;
}
public static String  _showpageandremovepreviouspages(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(null, "showpageandremovepreviouspages", new Object[] {_ba,_id}));}
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="GetManager.ShowPageAndRemovePreviousPages (Id)";
_getmanager(_ba)._showpageandremovepreviouspages /*String*/ (null,_id);
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="End Sub";
return "";
}
public static b4a.example.ef.b4xpagesmanager._b4amenuitem  _addmenuitem(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "addmenuitem", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4amenuitem) Debug.delegate(null, "addmenuitem", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Public Sub AddMenuItem(B4XPage As Object, Title As";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="Return GetManager.AddMenuItem(B4XPage, Title)";
if (true) return _getmanager(_ba)._addmenuitem /*b4a.example.ef.b4xpagesmanager._b4amenuitem*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.ActivityWrapper  _getnativeparent(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getnativeparent", true))
	 {return ((anywheresoftware.b4a.objects.ActivityWrapper) Debug.delegate(null, "getnativeparent", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="Public Sub GetNativeParent (B4XPage As Object) As";
RDebugUtils.currentLine=50659336;
 //BA.debugLineNum = 50659336;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Pare";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ ;
RDebugUtils.currentLine=50659337;
 //BA.debugLineNum = 50659337;BA.debugLine="End Sub";
return null;
}
public static String  _getpageid(anywheresoftware.b4a.BA _ba,Object _b4xpage) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "getpageid", true))
	 {return ((String) Debug.delegate(null, "getpageid", new Object[] {_ba,_b4xpage}));}
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Public Sub GetPageId (B4XPage As Object) As String";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="Return GetManager.FindPIFromB4XPage(B4XPage).Id";
if (true) return _getmanager(_ba)._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Id /*String*/ ;
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="End Sub";
return "";
}
public static String  _internalsetpagesmanager(anywheresoftware.b4a.BA _ba,Object _pm) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "internalsetpagesmanager", true))
	 {return ((String) Debug.delegate(null, "internalsetpagesmanager", new Object[] {_ba,_pm}));}
RDebugUtils.currentLine=50003968;
 //BA.debugLineNum = 50003968;BA.debugLine="Public Sub InternalSetPagesManager(PM As Object)";
RDebugUtils.currentLine=50003969;
 //BA.debugLineNum = 50003969;BA.debugLine="Delegate.Initialize";
_delegate._initialize /*String*/ (null,(_ba.processBA == null ? _ba : _ba.processBA));
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="mPM = PM";
_mpm = _pm;
RDebugUtils.currentLine=50003971;
 //BA.debugLineNum = 50003971;BA.debugLine="End Sub";
return "";
}
public static boolean  _isinitialized(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "isinitialized", true))
	 {return ((Boolean) Debug.delegate(null, "isinitialized", new Object[] {_ba}));}
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Public Sub IsInitialized As Boolean";
RDebugUtils.currentLine=49872897;
 //BA.debugLineNum = 49872897;BA.debugLine="Return mPM Is B4XPagesManager";
if (true) return _mpm instanceof b4a.example.ef.b4xpagesmanager;
RDebugUtils.currentLine=49872898;
 //BA.debugLineNum = 49872898;BA.debugLine="End Sub";
return false;
}
public static b4a.example.ef.b4xmainpage  _mainpage(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "mainpage", true))
	 {return ((b4a.example.ef.b4xmainpage) Debug.delegate(null, "mainpage", new Object[] {_ba}));}
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Public Sub MainPage As B4XMainPage";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="Return GetManager.MainPage";
if (true) return _getmanager(_ba)._mainpage /*b4a.example.ef.b4xmainpage*/ ;
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="End Sub";
return null;
}
public static String  _settitle(anywheresoftware.b4a.BA _ba,Object _b4xpage,Object _title) throws Exception{
RDebugUtils.currentModule="b4xpages";
if (Debug.shouldDelegate(null, "settitle", true))
	 {return ((String) Debug.delegate(null, "settitle", new Object[] {_ba,_b4xpage,_title}));}
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="GetManager.SetTitle(B4XPage, Title)";
_getmanager(_ba)._settitle /*String*/ (null,_b4xpage,_title);
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="End Sub";
return "";
}
}