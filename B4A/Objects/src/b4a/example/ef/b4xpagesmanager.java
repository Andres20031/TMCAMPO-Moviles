package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpagesmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xpagesmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xpagesmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xpageparent{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.ActivityWrapper NativeType;
public anywheresoftware.b4a.objects.collections.List MenuItems;
public void Initialize() {
IsInitialized = true;
NativeType = new anywheresoftware.b4a.objects.ActivityWrapper();
MenuItems = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4amenuitem{
public boolean IsInitialized;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper Bitmap;
public String Tag;
public boolean AddToBar;
public anywheresoftware.b4j.object.JavaObject NativeMenuItem;
public void Initialize() {
IsInitialized = true;
Title = new Object();
Bitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Tag = "";
AddToBar = false;
NativeMenuItem = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xpageinfo{
public boolean IsInitialized;
public Object B4XPage;
public String Id;
public boolean Created;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper Root;
public boolean IsFirst;
public b4a.example.ef.b4xpagesmanager._b4xpageparent Parent;
public void Initialize() {
IsInitialized = true;
B4XPage = new Object();
Id = "";
Created = false;
Title = new Object();
Root = new anywheresoftware.b4a.objects.B4XViewWrapper();
IsFirst = false;
Parent = new b4a.example.ef.b4xpagesmanager._b4xpageparent();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.ef.b4xorderedmap _idtob4xpage = null;
public b4a.example.ef.b4xorderedmap _rootb4xtopage = null;
public anywheresoftware.b4j.object.JavaObject _context = null;
public b4a.example.ef.b4xset _mstackofpageids = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ActivityWrapper _mmainform = null;
public boolean _showupindicator = false;
public anywheresoftware.b4j.object.JavaObject _actionbar = null;
public boolean _isforeground = false;
public int _transitionanimationduration = 0;
public b4a.example.ef.b4xmainpage _mainpage = null;
public String _stackstring = "";
public boolean _logevents = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.ef.b4xpagesmanager __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _module = null;
boolean _nonmainpagewasadded = false;
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Public Sub Initialize (Activity As Activity)";
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="IdToB4XPage.Initialize";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="RootB4XToPage.Initialize";
__ref._rootb4xtopage /*b4a.example.ef.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33751046;
 //BA.debugLineNum = 33751046;BA.debugLine="mStackOfPageIds.Initialize";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33751050;
 //BA.debugLineNum = 33751050;BA.debugLine="Context.InitializeContext";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .InitializeContext(ba);
RDebugUtils.currentLine=33751051;
 //BA.debugLineNum = 33751051;BA.debugLine="mMainForm = Activity";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activity;
RDebugUtils.currentLine=33751052;
 //BA.debugLineNum = 33751052;BA.debugLine="CheckMainActivityOrientations";
__ref._checkmainactivityorientations /*String*/ (null);
RDebugUtils.currentLine=33751053;
 //BA.debugLineNum = 33751053;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=33751054;
 //BA.debugLineNum = 33751054;BA.debugLine="Dim module As JavaObject";
_module = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33751055;
 //BA.debugLineNum = 33751055;BA.debugLine="module.InitializeStatic(jo.RunMethodJO(\"getActivi";
_module.InitializeStatic(BA.ObjectToString(_jo.RunMethodJO("getActivityBA",(Object[])(__c.Null)).GetField("className"))).SetField("dontPause",(Object)(__c.True));
RDebugUtils.currentLine=33751059;
 //BA.debugLineNum = 33751059;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (ba,this);
RDebugUtils.currentLine=33751060;
 //BA.debugLineNum = 33751060;BA.debugLine="MainPage.Initialize";
__ref._mainpage /*b4a.example.ef.b4xmainpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33751061;
 //BA.debugLineNum = 33751061;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=33751062;
 //BA.debugLineNum = 33751062;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)("~~~~~temp~~~~"),(Object)(__ref._createb4xpageinfo /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,(Object)(__ref._mainpage /*b4a.example.ef.b4xmainpage*/ ),"",__c.False,(Object)(""))));
RDebugUtils.currentLine=33751063;
 //BA.debugLineNum = 33751063;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=33751064;
 //BA.debugLineNum = 33751064;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)("~~~~~temp~~~~"));
RDebugUtils.currentLine=33751065;
 //BA.debugLineNum = 33751065;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
__ref._addpageandcreate /*String*/ (null,"MainPage",(Object)(__ref._mainpage /*b4a.example.ef.b4xmainpage*/ ));
RDebugUtils.currentLine=33751066;
 //BA.debugLineNum = 33751066;BA.debugLine="If LogEvents = False Then";
if (__ref._logevents /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=33751067;
 //BA.debugLineNum = 33751067;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("933751067","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
RDebugUtils.currentLine=33751069;
 //BA.debugLineNum = 33751069;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
RDebugUtils.currentLine=33751070;
 //BA.debugLineNum = 33751070;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=33751071;
 //BA.debugLineNum = 33751071;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=33751074;
 //BA.debugLineNum = 33751074;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4amenuitem  _addmenuitem(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addmenuitem", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4amenuitem) Debug.delegate(ba, "addmenuitem", new Object[] {_b4xpage,_title}));}
b4a.example.ef.b4xpagesmanager._b4amenuitem _mi = null;
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Public Sub AddMenuItem (B4XPage As Object, Title A";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Dim mi As B4AMenuItem";
_mi = new b4a.example.ef.b4xpagesmanager._b4amenuitem();
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="mi.Initialize";
_mi.Initialize();
RDebugUtils.currentLine=35127299;
 //BA.debugLineNum = 35127299;BA.debugLine="mi.Title = Title";
_mi.Title /*Object*/  = _title;
RDebugUtils.currentLine=35127300;
 //BA.debugLineNum = 35127300;BA.debugLine="mi.Tag = Title";
_mi.Tag /*String*/  = BA.ObjectToString(_title);
RDebugUtils.currentLine=35127301;
 //BA.debugLineNum = 35127301;BA.debugLine="FindPIFromB4XPage(B4XPage).Parent.MenuItems.Add(m";
__ref._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mi));
RDebugUtils.currentLine=35127302;
 //BA.debugLineNum = 35127302;BA.debugLine="Return mi";
if (true) return _mi;
RDebugUtils.currentLine=35127303;
 //BA.debugLineNum = 35127303;BA.debugLine="End Sub";
return null;
}
public String  _addpage(b4a.example.ef.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
String _idtolower = "";
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase();
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_idtolower))) { 
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("933947651",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33947654;
 //BA.debugLineNum = 33947654;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_idtolower),(Object)(__ref._createb4xpageinfo /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage,_idtolower,__c.False,(Object)(_id))));
RDebugUtils.currentLine=33947655;
 //BA.debugLineNum = 33947655;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)==1) { 
__ref._showpage /*String*/ (null,_idtolower);};
RDebugUtils.currentLine=33947656;
 //BA.debugLineNum = 33947656;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(b4a.example.ef.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="AddPage (Id, B4XPage)";
__ref._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
__ref._createpageifneeded /*String*/ (null,__ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id));
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="End Sub";
return "";
}
public String  _closepage(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._contains /*boolean*/ (null,(Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && (__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi) == false) { 
RDebugUtils.currentLine=34209796;
 //BA.debugLineNum = 34209796;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("934209796","Only top page can be closed",0);
RDebugUtils.currentLine=34209797;
 //BA.debugLineNum = 34209797;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=34209798;
 //BA.debugLineNum = 34209798;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=34209799;
 //BA.debugLineNum = 34209799;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("934209799","First page cannot be closed",0);
RDebugUtils.currentLine=34209800;
 //BA.debugLineNum = 34209800;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=34209802;
 //BA.debugLineNum = 34209802;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi);
RDebugUtils.currentLine=34209803;
 //BA.debugLineNum = 34209803;BA.debugLine="ClosePageImpl(pi)";
__ref._closepageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=34209804;
 //BA.debugLineNum = 34209804;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=34209805;
 //BA.debugLineNum = 34209805;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
 };
RDebugUtils.currentLine=34209807;
 //BA.debugLineNum = 34209807;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==1) { 
if (true) return "";};
RDebugUtils.currentLine=34209808;
 //BA.debugLineNum = 34209808;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=34209809;
 //BA.debugLineNum = 34209809;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=34209810;
 //BA.debugLineNum = 34209810;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._showpageimpl /*String*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null));};
RDebugUtils.currentLine=34209811;
 //BA.debugLineNum = 34209811;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
 };
RDebugUtils.currentLine=34209813;
 //BA.debugLineNum = 34209813;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(b4a.example.ef.b4xpagesmanager __ref,Object _page) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "findpifromb4xpage", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "findpifromb4xpage", new Object[] {_page}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
RDebugUtils.currentLine=34406403;
 //BA.debugLineNum = 34406403;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
RDebugUtils.currentLine=34406406;
 //BA.debugLineNum = 34406406;BA.debugLine="Return Null";
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__c.Null);
RDebugUtils.currentLine=34406407;
 //BA.debugLineNum = 34406407;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id).B4XPage /*Object*/ ;
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=34668548;
 //BA.debugLineNum = 34668548;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.ef.b4xpagesmanager._b4xpageinfo _top = null;
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null))) { 
if (true) return "";};
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=34078726;
 //BA.debugLineNum = 34078726;BA.debugLine="Dim Top As B4XPageInfo = GetTopPage";
_top = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=34078727;
 //BA.debugLineNum = 34078727;BA.debugLine="If Top <> Null Then";
if (_top!= null) { 
RDebugUtils.currentLine=34078728;
 //BA.debugLineNum = 34078728;BA.debugLine="Top.Root.RemoveViewFromParent";
_top.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=34078738;
 //BA.debugLineNum = 34078738;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=34078739;
 //BA.debugLineNum = 34078739;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=34078740;
 //BA.debugLineNum = 34078740;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=34078741;
 //BA.debugLineNum = 34078741;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=34078742;
 //BA.debugLineNum = 34078742;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="If GetTopPage = Null Then";
if (__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null)== null) { 
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="ShowPage(Id)";
__ref._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=34144261;
 //BA.debugLineNum = 34144261;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=34144262;
 //BA.debugLineNum = 34144262;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=34144267;
 //BA.debugLineNum = 34144267;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=34144268;
 //BA.debugLineNum = 34144268;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=34144270;
 //BA.debugLineNum = 34144270;BA.debugLine="PageToRemove.Root.RemoveViewFromParent";
_pagetoremove.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=34144277;
 //BA.debugLineNum = 34144277;BA.debugLine="mStackOfPageIds.Clear";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=34144278;
 //BA.debugLineNum = 34144278;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=34144279;
 //BA.debugLineNum = 34144279;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=34144280;
 //BA.debugLineNum = 34144280;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=34144282;
 //BA.debugLineNum = 34144282;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=34144283;
 //BA.debugLineNum = 34144283;BA.debugLine="End Sub";
return "";
}
public String  _activity_actionbarhomeclick(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_actionbarhomeclick", true))
	 {return ((String) Debug.delegate(ba, "activity_actionbarhomeclick", null));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="If pi <> Null Then";
if (_pi!= null) { 
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="If CloseRequestExists (pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=33882118;
 //BA.debugLineNum = 33882118;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
 };
RDebugUtils.currentLine=33882121;
 //BA.debugLineNum = 33882121;BA.debugLine="End Sub";
return "";
}
public boolean  _activity_keypress(b4a.example.ef.b4xpagesmanager __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_keypress", true))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="If CloseRequestExists(pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=35061764;
 //BA.debugLineNum = 35061764;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=35061766;
 //BA.debugLineNum = 35061766;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
RDebugUtils.currentLine=35061768;
 //BA.debugLineNum = 35061768;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=35061770;
 //BA.debugLineNum = 35061770;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=35061771;
 //BA.debugLineNum = 35061771;BA.debugLine="End Sub";
return false;
}
public String  _activity_pause(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
__ref._raiseeventwithresult /*Object*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=35454982;
 //BA.debugLineNum = 35454982;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=35454984;
 //BA.debugLineNum = 35454984;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=35454986;
 //BA.debugLineNum = 35454986;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=35454988;
 //BA.debugLineNum = 35454988;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=35454990;
 //BA.debugLineNum = 35454990;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("935454990","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=35454992;
 //BA.debugLineNum = 35454992;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _gettoppage(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "gettoppage", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "gettoppage", null));}
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__c.Null);};
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)-1))));
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="End Sub";
return null;
}
public String  _activity_resume(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
boolean _shouldraise = false;
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref._isforeground /*boolean*/ ==__c.False;
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
RDebugUtils.currentLine=35782662;
 //BA.debugLineNum = 35782662;BA.debugLine="End Sub";
return "";
}
public String  _createmenu(b4a.example.ef.b4xpagesmanager __ref,Object _menu) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createmenu", true))
	 {return ((String) Debug.delegate(ba, "createmenu", new Object[] {_menu}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
b4a.example.ef.b4xpagesmanager._b4amenuitem _mi = null;
anywheresoftware.b4j.object.JavaObject _nativemenuitem = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4j.object.JavaObject _listener = null;
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub CreateMenu (Menu As Object)";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="Dim jo As JavaObject = Menu";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_menu));
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="For Each mi As B4AMenuItem In pi.Parent.MenuItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mi = (b4a.example.ef.b4xpagesmanager._b4amenuitem)(group4.Get(index4));
RDebugUtils.currentLine=35258373;
 //BA.debugLineNum = 35258373;BA.debugLine="Dim NativeMenuItem As JavaObject = jo.RunMethod(";
_nativemenuitem = new anywheresoftware.b4j.object.JavaObject();
_nativemenuitem = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("add",new Object[]{_mi.Title /*Object*/ })));
RDebugUtils.currentLine=35258374;
 //BA.debugLineNum = 35258374;BA.debugLine="If mi.Bitmap.IsInitialized Then";
if (_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=35258375;
 //BA.debugLineNum = 35258375;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=35258376;
 //BA.debugLineNum = 35258376;BA.debugLine="bd.Initialize(mi.Bitmap)";
_bd.Initialize((android.graphics.Bitmap)(_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=35258377;
 //BA.debugLineNum = 35258377;BA.debugLine="NativeMenuItem.RunMethod(\"setIcon\", Array(bd))";
_nativemenuitem.RunMethod("setIcon",new Object[]{(Object)(_bd.getObject())});
 };
RDebugUtils.currentLine=35258379;
 //BA.debugLineNum = 35258379;BA.debugLine="If mi.AddToBar Then";
if (_mi.AddToBar /*boolean*/ ) { 
RDebugUtils.currentLine=35258380;
 //BA.debugLineNum = 35258380;BA.debugLine="NativeMenuItem.RunMethod(\"setShowAsAction\", Arr";
_nativemenuitem.RunMethod("setShowAsAction",new Object[]{(Object)(1)});
 };
RDebugUtils.currentLine=35258382;
 //BA.debugLineNum = 35258382;BA.debugLine="Dim listener As JavaObject";
_listener = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=35258383;
 //BA.debugLineNum = 35258383;BA.debugLine="listener.InitializeNewInstance(Application.Packa";
_listener.InitializeNewInstance(__c.Application.getPackageName()+".b4xpagesmanager$PagesMenuListener",new Object[]{_pi.B4XPage /*Object*/ ,(Object)(_mi.Tag /*String*/ )});
RDebugUtils.currentLine=35258384;
 //BA.debugLineNum = 35258384;BA.debugLine="NativeMenuItem.RunMethod(\"setOnMenuItemClickList";
_nativemenuitem.RunMethod("setOnMenuItemClickListener",new Object[]{(Object)(_listener.getObject())});
 }
};
RDebugUtils.currentLine=35258386;
 //BA.debugLineNum = 35258386;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4a.example.ef.b4xpagesmanager __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
__ref._raiseevent /*String*/ (null,__ref._getpageinfofromroot /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=35586052;
 //BA.debugLineNum = 35586052;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closerequestexists", true))
	 {return ((Boolean) Debug.delegate(ba, "closerequestexists", new Object[] {_pi}));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="End Sub";
return false;
}
public void  _handlecloserequest(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "handlecloserequest", true))
	 {Debug.delegate(ba, "handlecloserequest", new Object[] {_pi}); return;}
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(this,__ref,_pi);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(b4a.example.ef.b4xpagesmanager parent,b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) {
this.parent = parent;
this.__ref = __ref;
this._pi = _pi;
this.__ref = parent;
}
b4a.example.ef.b4xpagesmanager __ref;
b4a.example.ef.b4xpagesmanager parent;
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _shouldclose = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xpagesmanager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_CloseRequest");
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubDebug(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (Boolean) result[1];
;
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="If ShouldClose Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _raiseeventwithresult(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseeventwithresult", true))
	 {return ((Object) Debug.delegate(ba, "raiseeventwithresult", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=35520524;
 //BA.debugLineNum = 35520524;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=35520526;
 //BA.debugLineNum = 35520526;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("935520526","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=35520528;
 //BA.debugLineNum = 35520528;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=35520529;
 //BA.debugLineNum = 35520529;BA.debugLine="End Sub";
return null;
}
public String  _backgroundstatechanged(b4a.example.ef.b4xpagesmanager __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "backgroundstatechanged", true))
	 {return ((String) Debug.delegate(ba, "backgroundstatechanged", new Object[] {_newstate}));}
String _ev = "";
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref._isforeground /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="IsForeground = NewState";
__ref._isforeground /*boolean*/  = _newstate;
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="Dim ev As String";
_ev = "";
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref._isforeground /*boolean*/ ) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
RDebugUtils.currentLine=35848198;
 //BA.debugLineNum = 35848198;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
RDebugUtils.currentLine=35848199;
 //BA.debugLineNum = 35848199;BA.debugLine="LogEvent(pi, ev)";
__ref._logevent /*String*/ (null,_pi,_ev);
RDebugUtils.currentLine=35848200;
 //BA.debugLineNum = 35848200;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=35848201;
 //BA.debugLineNum = 35848201;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
RDebugUtils.currentLine=35848203;
 //BA.debugLineNum = 35848203;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
RDebugUtils.currentLine=35848207;
 //BA.debugLineNum = 35848207;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageinfo", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "createb4xpageinfo", new Object[] {_b4xpage,_id,_created,_title}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _t1 = null;
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new b4a.example.ef.b4xpagesmanager._b4xpageinfo();
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
RDebugUtils.currentLine=34996229;
 //BA.debugLineNum = 34996229;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
RDebugUtils.currentLine=34996230;
 //BA.debugLineNum = 34996230;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=34996232;
 //BA.debugLineNum = 34996232;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageifneeded", true))
	 {return ((String) Debug.delegate(ba, "createpageifneeded", new Object[] {_pi}));}
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)==1;
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="CreatePageImpl (pi)";
__ref._createpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=34603012;
 //BA.debugLineNum = 34603012;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
RDebugUtils.currentLine=34603013;
 //BA.debugLineNum = 34603013;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
__ref._rootb4xtopage /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
RDebugUtils.currentLine=34603014;
 //BA.debugLineNum = 34603014;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_Created");
RDebugUtils.currentLine=34603015;
 //BA.debugLineNum = 34603015;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubDebug2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=34603017;
 //BA.debugLineNum = 34603017;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _getpagefromid(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpagefromid", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpagefromid", new Object[] {_id}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_id.toLowerCase())));
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
RDebugUtils.currentLine=34865155;
 //BA.debugLineNum = 34865155;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("934865155","Error: page id not found: "+_id,0);
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("934865156","Ids: "+BA.ObjectToString(__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)),0);
 };
RDebugUtils.currentLine=34865158;
 //BA.debugLineNum = 34865158;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=34865159;
 //BA.debugLineNum = 34865159;BA.debugLine="End Sub";
return null;
}
public String  _logevent(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "logevent", true))
	 {return ((String) Debug.delegate(ba, "logevent", new Object[] {_pi,_ev}));}
String _msg = "";
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="If LogEvents Then";
if (__ref._logevents /*boolean*/ ) { 
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(__ref._stackstring /*String*/ ))+"");
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="Log(msg)";
__c.LogImpl("935979267",_msg,0);
 };
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="End Sub";
return "";
}
public String  _checkmainactivityorientations(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "checkmainactivityorientations", true))
	 {return ((String) Debug.delegate(ba, "checkmainactivityorientations", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _jme = null;
boolean _isappcompat = false;
anywheresoftware.b4j.object.JavaObject _pi = null;
Object[] _activities = null;
anywheresoftware.b4j.object.JavaObject _act = null;
String _name = "";
int _screenorientation = 0;
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Private Sub CheckMainActivityOrientations";
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="ActionBar = jo.RunMethod(\"getActionBar\", Null)";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getActionBar",(Object[])(__c.Null))));
RDebugUtils.currentLine=33816582;
 //BA.debugLineNum = 33816582;BA.debugLine="If ActionBar.IsInitialized = False Then";
if (__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=33816583;
 //BA.debugLineNum = 33816583;BA.debugLine="Dim jme As JavaObject = Me";
_jme = new anywheresoftware.b4j.object.JavaObject();
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=33816584;
 //BA.debugLineNum = 33816584;BA.debugLine="Dim IsAppCompat As Boolean = jme.RunMethod(\"chec";
_isappcompat = BA.ObjectToBoolean(_jme.RunMethod("checkIfAppCompat",new Object[]{(Object)(_jo.getObject())}));
RDebugUtils.currentLine=33816585;
 //BA.debugLineNum = 33816585;BA.debugLine="If IsAppCompat Then";
if (_isappcompat) { 
RDebugUtils.currentLine=33816586;
 //BA.debugLineNum = 33816586;BA.debugLine="ActionBar = jo.RunMethod(\"getSupportActionBar\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getSupportActionBar",(Object[])(__c.Null))));
 };
 };
RDebugUtils.currentLine=33816590;
 //BA.debugLineNum = 33816590;BA.debugLine="Dim pi As JavaObject = jo.RunMethodJO(\"getPackage";
_pi = new anywheresoftware.b4j.object.JavaObject();
_pi = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethodJO("getPackageManager",(Object[])(__c.Null)).RunMethod("getPackageInfo",new Object[]{(Object)(__c.Application.getPackageName()),(Object)(1)})));
RDebugUtils.currentLine=33816591;
 //BA.debugLineNum = 33816591;BA.debugLine="Dim activities() As Object = pi.GetField(\"activit";
_activities = (Object[])(_pi.GetField("activities"));
RDebugUtils.currentLine=33816592;
 //BA.debugLineNum = 33816592;BA.debugLine="For Each Act As JavaObject In activities";
_act = new anywheresoftware.b4j.object.JavaObject();
{
final Object[] group13 = _activities;
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_act = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group13[index13]));
RDebugUtils.currentLine=33816593;
 //BA.debugLineNum = 33816593;BA.debugLine="Dim name As String = Act.GetField(\"name\")";
_name = BA.ObjectToString(_act.GetField("name"));
RDebugUtils.currentLine=33816594;
 //BA.debugLineNum = 33816594;BA.debugLine="If name.EndsWith(\".main\") Then";
if (_name.endsWith(".main")) { 
RDebugUtils.currentLine=33816595;
 //BA.debugLineNum = 33816595;BA.debugLine="Dim screenOrientation As Int = Act.GetField(\"sc";
_screenorientation = (int)(BA.ObjectToNumber(_act.GetField("screenOrientation")));
RDebugUtils.currentLine=33816596;
 //BA.debugLineNum = 33816596;BA.debugLine="If screenOrientation = -1 Then";
if (_screenorientation==-1) { 
RDebugUtils.currentLine=33816597;
 //BA.debugLineNum = 33816597;BA.debugLine="LogColor(\"#SupportedOrientations attribute mus";
__c.LogImpl("933816597","#SupportedOrientations attribute must be set to landscape or portrait.",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
 };
 };
 }
};
RDebugUtils.currentLine=33816601;
 //BA.debugLineNum = 33816601;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="Private Context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33685509;
 //BA.debugLineNum = 33685509;BA.debugLine="Type B4XPageParent (NativeType As Activity, MenuI";
;
RDebugUtils.currentLine=33685510;
 //BA.debugLineNum = 33685510;BA.debugLine="Type B4AMenuItem (Title As Object, Bitmap As B4XB";
;
RDebugUtils.currentLine=33685516;
 //BA.debugLineNum = 33685516;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
RDebugUtils.currentLine=33685520;
 //BA.debugLineNum = 33685520;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new b4a.example.ef.b4xset();
RDebugUtils.currentLine=33685521;
 //BA.debugLineNum = 33685521;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=33685525;
 //BA.debugLineNum = 33685525;BA.debugLine="Private mMainForm As Activity";
_mmainform = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=33685526;
 //BA.debugLineNum = 33685526;BA.debugLine="Public ShowUpIndicator As Boolean = True";
_showupindicator = __c.True;
RDebugUtils.currentLine=33685527;
 //BA.debugLineNum = 33685527;BA.debugLine="Public ActionBar As JavaObject";
_actionbar = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33685531;
 //BA.debugLineNum = 33685531;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
RDebugUtils.currentLine=33685532;
 //BA.debugLineNum = 33685532;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
RDebugUtils.currentLine=33685533;
 //BA.debugLineNum = 33685533;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new b4a.example.ef.b4xmainpage();
RDebugUtils.currentLine=33685534;
 //BA.debugLineNum = 33685534;BA.debugLine="Private StackString As String";
_stackstring = "";
RDebugUtils.currentLine=33685535;
 //BA.debugLineNum = 33685535;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
RDebugUtils.currentLine=33685536;
 //BA.debugLineNum = 33685536;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepageimpl", true))
	 {return ((String) Debug.delegate(ba, "closepageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="If mStackOfPageIds.Size = 1 Then";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=34471939;
 //BA.debugLineNum = 34471939;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=34471940;
 //BA.debugLineNum = 34471940;BA.debugLine="i.Initialize(i.ACTION_MAIN, \"\")";
_i.Initialize(_i.ACTION_MAIN,"");
RDebugUtils.currentLine=34471941;
 //BA.debugLineNum = 34471941;BA.debugLine="i.AddCategory(\"android.intent.category.HOME\")";
_i.AddCategory("android.intent.category.HOME");
RDebugUtils.currentLine=34471942;
 //BA.debugLineNum = 34471942;BA.debugLine="i.Flags = 0x10000000";
_i.setFlags(((int)0x10000000));
RDebugUtils.currentLine=34471943;
 //BA.debugLineNum = 34471943;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 }else {
RDebugUtils.currentLine=34471945;
 //BA.debugLineNum = 34471945;BA.debugLine="pi.Root.RemoveViewFromParent";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=34471952;
 //BA.debugLineNum = 34471952;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppagedisappear", true))
	 {return ((String) Debug.delegate(ba, "toppagedisappear", null));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Private Sub TopPageDisappear";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="If xui.IsB4J Then Return";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
if (true) return "";};
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=34275331;
 //BA.debugLineNum = 34275331;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=34275332;
 //BA.debugLineNum = 34275332;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=34275333;
 //BA.debugLineNum = 34275333;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=34275334;
 //BA.debugLineNum = 34275334;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=34275337;
 //BA.debugLineNum = 34275337;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageimpl", true))
	 {return ((String) Debug.delegate(ba, "showpageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=34537478;
 //BA.debugLineNum = 34537478;BA.debugLine="If pi.Root.Parent.IsInitialized Then pi.Root.Remo";
if (_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=34537479;
 //BA.debugLineNum = 34537479;BA.debugLine="Dim pnl As Panel = pi.Root";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=34537480;
 //BA.debugLineNum = 34537480;BA.debugLine="If TransitionAnimationDuration > 0 Then";
if (__ref._transitionanimationduration /*int*/ >0) { 
RDebugUtils.currentLine=34537481;
 //BA.debugLineNum = 34537481;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 20dip, 20dip)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=34537482;
 //BA.debugLineNum = 34537482;BA.debugLine="pnl.SetLayoutAnimated(TransitionAnimationDuratio";
_pnl.SetLayoutAnimated(__ref._transitionanimationduration /*int*/ ,(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
RDebugUtils.currentLine=34537484;
 //BA.debugLineNum = 34537484;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 100%x, 100%y)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=34537489;
 //BA.debugLineNum = 34537489;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppageappear", true))
	 {return ((String) Debug.delegate(ba, "toppageappear", null));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Private Sub TopPageAppear";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=34340867;
 //BA.debugLineNum = 34340867;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=34340868;
 //BA.debugLineNum = 34340868;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=34340869;
 //BA.debugLineNum = 34340869;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=34340870;
 //BA.debugLineNum = 34340870;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=34340874;
 //BA.debugLineNum = 34340874;BA.debugLine="If ShowUpIndicator And ActionBar.IsInitialized Th";
if (__ref._showupindicator /*boolean*/  && __ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=34340875;
 //BA.debugLineNum = 34340875;BA.debugLine="ActionBar.RunMethod(\"setDisplayHomeAsUpEnabled\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)>1)});
 };
RDebugUtils.currentLine=34340877;
 //BA.debugLineNum = 34340877;BA.debugLine="UpdateMenuItems";
__ref._updatemenuitems /*String*/ (null);
RDebugUtils.currentLine=34340879;
 //BA.debugLineNum = 34340879;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=34340880;
 //BA.debugLineNum = 34340880;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageparent  _createb4xpageparent(b4a.example.ef.b4xpagesmanager __ref,Object _nativetype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageparent", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageparent) Debug.delegate(ba, "createb4xpageparent", new Object[] {_nativetype}));}
b4a.example.ef.b4xpagesmanager._b4xpageparent _t1 = null;
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Obj";
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new b4a.example.ef.b4xpagesmanager._b4xpageparent();
RDebugUtils.currentLine=35717127;
 //BA.debugLineNum = 35717127;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=35717128;
 //BA.debugLineNum = 35717128;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/  = (anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_nativetype));
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="End Sub";
return null;
}
public String  _createpageimpl(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageimpl", true))
	 {return ((String) Debug.delegate(ba, "createpageimpl", new Object[] {_pi}));}
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=34734092;
 //BA.debugLineNum = 34734092;BA.debugLine="pi.Root = xui.CreatePanel(\"root\")";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"root");
RDebugUtils.currentLine=34734093;
 //BA.debugLineNum = 34734093;BA.debugLine="pi.root.SetLayoutAnimated(0, 0, 0, 100%x, 100%y)";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=34734094;
 //BA.debugLineNum = 34734094;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ (null,(Object)(__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .getObject()));
RDebugUtils.currentLine=34734095;
 //BA.debugLineNum = 34734095;BA.debugLine="pi.Parent.MenuItems.Initialize";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=34734103;
 //BA.debugLineNum = 34734103;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(b4a.example.ef.b4xpagesmanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpageinfofromroot", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpageinfofromroot", new Object[] {_root}));}
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__ref._rootb4xtopage /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_root.getObject())));
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="End Sub";
return null;
}
public String  _updatemenuitems(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatemenuitems", true))
	 {return ((String) Debug.delegate(ba, "updatemenuitems", null));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Private Sub UpdateMenuItems";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Context.RunMethod(\"invalidateOptionsMenu\", Null)";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("invalidateOptionsMenu",(Object[])(__c.Null));
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="End Sub";
return "";
}
public String  _updatestackstring(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatestackstring", true))
	 {return ((String) Debug.delegate(ba, "updatestackstring", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Public Sub UpdateStackString";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
RDebugUtils.currentLine=36044811;
 //BA.debugLineNum = 36044811;BA.debugLine="StackString = sb.ToString";
__ref._stackstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=36044812;
 //BA.debugLineNum = 36044812;BA.debugLine="End Sub";
return "";
}
public boolean checkIfAppCompat(android.app.Activity act) {
	return act.getClass().getSuperclass().getName().equals("androidx.appcompat.app.AppCompatActivity");
}
public static class PagesMenuListener implements android.view.MenuItem.OnMenuItemClickListener {
	private B4AClass target;
	private String tag;
	public PagesMenuListener(B4AClass target, String tag) {
		this.target = target;
		this.tag = tag;
	}
 	public boolean onMenuItemClick(android.view.MenuItem item) {
		target.getBA().raiseEventFromUI(null, "b4xpage_menuclick", tag);
		return true;
	}
}
}