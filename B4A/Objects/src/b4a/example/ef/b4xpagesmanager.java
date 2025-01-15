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
RDebugUtils.currentLine=49086464;
 //BA.debugLineNum = 49086464;BA.debugLine="Public Sub Initialize (Activity As Activity)";
RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="IdToB4XPage.Initialize";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=49086469;
 //BA.debugLineNum = 49086469;BA.debugLine="RootB4XToPage.Initialize";
__ref._rootb4xtopage /*b4a.example.ef.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=49086470;
 //BA.debugLineNum = 49086470;BA.debugLine="mStackOfPageIds.Initialize";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=49086474;
 //BA.debugLineNum = 49086474;BA.debugLine="Context.InitializeContext";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .InitializeContext(ba);
RDebugUtils.currentLine=49086475;
 //BA.debugLineNum = 49086475;BA.debugLine="mMainForm = Activity";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/  = _activity;
RDebugUtils.currentLine=49086476;
 //BA.debugLineNum = 49086476;BA.debugLine="CheckMainActivityOrientations";
__ref._checkmainactivityorientations /*String*/ (null);
RDebugUtils.currentLine=49086477;
 //BA.debugLineNum = 49086477;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=49086478;
 //BA.debugLineNum = 49086478;BA.debugLine="Dim module As JavaObject";
_module = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=49086479;
 //BA.debugLineNum = 49086479;BA.debugLine="module.InitializeStatic(jo.RunMethodJO(\"getActivi";
_module.InitializeStatic(BA.ObjectToString(_jo.RunMethodJO("getActivityBA",(Object[])(__c.Null)).GetField("className"))).SetField("dontPause",(Object)(__c.True));
RDebugUtils.currentLine=49086483;
 //BA.debugLineNum = 49086483;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (ba,this);
RDebugUtils.currentLine=49086484;
 //BA.debugLineNum = 49086484;BA.debugLine="MainPage.Initialize";
__ref._mainpage /*b4a.example.ef.b4xmainpage*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=49086485;
 //BA.debugLineNum = 49086485;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)>0;
RDebugUtils.currentLine=49086486;
 //BA.debugLineNum = 49086486;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)("~~~~~temp~~~~"),(Object)(__ref._createb4xpageinfo /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,(Object)(__ref._mainpage /*b4a.example.ef.b4xmainpage*/ ),"",__c.False,(Object)(""))));
RDebugUtils.currentLine=49086487;
 //BA.debugLineNum = 49086487;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=49086488;
 //BA.debugLineNum = 49086488;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._remove /*String*/ (null,(Object)("~~~~~temp~~~~"));
RDebugUtils.currentLine=49086489;
 //BA.debugLineNum = 49086489;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
__ref._addpageandcreate /*String*/ (null,"MainPage",(Object)(__ref._mainpage /*b4a.example.ef.b4xmainpage*/ ));
RDebugUtils.currentLine=49086490;
 //BA.debugLineNum = 49086490;BA.debugLine="If LogEvents = False Then";
if (__ref._logevents /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=49086491;
 //BA.debugLineNum = 49086491;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("949086491","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
RDebugUtils.currentLine=49086493;
 //BA.debugLineNum = 49086493;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
RDebugUtils.currentLine=49086494;
 //BA.debugLineNum = 49086494;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=49086495;
 //BA.debugLineNum = 49086495;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=49086498;
 //BA.debugLineNum = 49086498;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4amenuitem  _addmenuitem(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addmenuitem", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4amenuitem) Debug.delegate(ba, "addmenuitem", new Object[] {_b4xpage,_title}));}
b4a.example.ef.b4xpagesmanager._b4amenuitem _mi = null;
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Public Sub AddMenuItem (B4XPage As Object, Title A";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="Dim mi As B4AMenuItem";
_mi = new b4a.example.ef.b4xpagesmanager._b4amenuitem();
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="mi.Initialize";
_mi.Initialize();
RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="mi.Title = Title";
_mi.Title /*Object*/  = _title;
RDebugUtils.currentLine=50462724;
 //BA.debugLineNum = 50462724;BA.debugLine="mi.Tag = Title";
_mi.Tag /*String*/  = BA.ObjectToString(_title);
RDebugUtils.currentLine=50462725;
 //BA.debugLineNum = 50462725;BA.debugLine="FindPIFromB4XPage(B4XPage).Parent.MenuItems.Add(m";
__ref._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage).Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_mi));
RDebugUtils.currentLine=50462726;
 //BA.debugLineNum = 50462726;BA.debugLine="Return mi";
if (true) return _mi;
RDebugUtils.currentLine=50462727;
 //BA.debugLineNum = 50462727;BA.debugLine="End Sub";
return null;
}
public String  _addpage(b4a.example.ef.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_id,_b4xpage}));}
String _idtolower = "";
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase();
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._containskey /*boolean*/ (null,(Object)(_idtolower))) { 
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("949283075",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
RDebugUtils.currentLine=49283076;
 //BA.debugLineNum = 49283076;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=49283078;
 //BA.debugLineNum = 49283078;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_idtolower),(Object)(__ref._createb4xpageinfo /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage,_idtolower,__c.False,(Object)(_id))));
RDebugUtils.currentLine=49283079;
 //BA.debugLineNum = 49283079;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)==1) { 
__ref._showpage /*String*/ (null,_idtolower);};
RDebugUtils.currentLine=49283080;
 //BA.debugLineNum = 49283080;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(b4a.example.ef.b4xpagesmanager __ref,String _id,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "addpageandcreate", true))
	 {return ((String) Debug.delegate(ba, "addpageandcreate", new Object[] {_id,_b4xpage}));}
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="AddPage (Id, B4XPage)";
__ref._addpage /*String*/ (null,_id,_b4xpage);
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
__ref._createpageifneeded /*String*/ (null,__ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id));
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="End Sub";
return "";
}
public String  _closepage(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepage", true))
	 {return ((String) Debug.delegate(ba, "closepage", new Object[] {_b4xpage}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
RDebugUtils.currentLine=49545216;
 //BA.debugLineNum = 49545216;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._contains /*boolean*/ (null,(Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=49545219;
 //BA.debugLineNum = 49545219;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && (__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi) == false) { 
RDebugUtils.currentLine=49545220;
 //BA.debugLineNum = 49545220;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("949545220","Only top page can be closed",0);
RDebugUtils.currentLine=49545221;
 //BA.debugLineNum = 49545221;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=49545222;
 //BA.debugLineNum = 49545222;BA.debugLine="Else If xui.IsB4i And mStackOfPageIds.Size = 1 Th";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i() && __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=49545223;
 //BA.debugLineNum = 49545223;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("949545223","First page cannot be closed",0);
RDebugUtils.currentLine=49545224;
 //BA.debugLineNum = 49545224;BA.debugLine="Return";
if (true) return "";
 }}
;
RDebugUtils.currentLine=49545226;
 //BA.debugLineNum = 49545226;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null)).equals(_pi);
RDebugUtils.currentLine=49545227;
 //BA.debugLineNum = 49545227;BA.debugLine="ClosePageImpl(pi)";
__ref._closepageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=49545228;
 //BA.debugLineNum = 49545228;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=49545229;
 //BA.debugLineNum = 49545229;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
 };
RDebugUtils.currentLine=49545231;
 //BA.debugLineNum = 49545231;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==1) { 
if (true) return "";};
RDebugUtils.currentLine=49545232;
 //BA.debugLineNum = 49545232;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=49545233;
 //BA.debugLineNum = 49545233;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
RDebugUtils.currentLine=49545234;
 //BA.debugLineNum = 49545234;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._showpageimpl /*String*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null));};
RDebugUtils.currentLine=49545235;
 //BA.debugLineNum = 49545235;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
 };
RDebugUtils.currentLine=49545237;
 //BA.debugLineNum = 49545237;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(b4a.example.ef.b4xpagesmanager __ref,Object _page) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "findpifromb4xpage", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "findpifromb4xpage", new Object[] {_page}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=49741824;
 //BA.debugLineNum = 49741824;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
RDebugUtils.currentLine=49741825;
 //BA.debugLineNum = 49741825;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
RDebugUtils.currentLine=49741826;
 //BA.debugLineNum = 49741826;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
RDebugUtils.currentLine=49741827;
 //BA.debugLineNum = 49741827;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
RDebugUtils.currentLine=49741830;
 //BA.debugLineNum = 49741830;BA.debugLine="Return Null";
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__c.Null);
RDebugUtils.currentLine=49741831;
 //BA.debugLineNum = 49741831;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpage", true))
	 {return ((Object) Debug.delegate(ba, "getpage", new Object[] {_id}));}
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Public Sub GetPage (Id As String) As Object";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id).B4XPage /*Object*/ ;
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="End Sub";
return null;
}
public String  _settitle(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_b4xpage,_title}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=50003968;
 //BA.debugLineNum = 50003968;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
RDebugUtils.currentLine=50003969;
 //BA.debugLineNum = 50003969;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = __ref._findpifromb4xpage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_b4xpage);
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
RDebugUtils.currentLine=50003971;
 //BA.debugLineNum = 50003971;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_title));
RDebugUtils.currentLine=50003972;
 //BA.debugLineNum = 50003972;BA.debugLine="End Sub";
return "";
}
public String  _showpage(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpage", true))
	 {return ((String) Debug.delegate(ba, "showpage", new Object[] {_id}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.ef.b4xpagesmanager._b4xpageinfo _top = null;
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Public Sub ShowPage (Id As String)";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null))) { 
if (true) return "";};
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=49414148;
 //BA.debugLineNum = 49414148;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=49414150;
 //BA.debugLineNum = 49414150;BA.debugLine="Dim Top As B4XPageInfo = GetTopPage";
_top = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=49414151;
 //BA.debugLineNum = 49414151;BA.debugLine="If Top <> Null Then";
if (_top!= null) { 
RDebugUtils.currentLine=49414152;
 //BA.debugLineNum = 49414152;BA.debugLine="Top.Root.RemoveViewFromParent";
_top.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=49414162;
 //BA.debugLineNum = 49414162;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._remove /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=49414163;
 //BA.debugLineNum = 49414163;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=49414164;
 //BA.debugLineNum = 49414164;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=49414165;
 //BA.debugLineNum = 49414165;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=49414166;
 //BA.debugLineNum = 49414166;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageandremovepreviouspages", true))
	 {return ((String) Debug.delegate(ba, "showpageandremovepreviouspages", new Object[] {_id}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="If GetTopPage = Null Then";
if (__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null)== null) { 
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="ShowPage(Id)";
__ref._showpage /*String*/ (null,_id);
RDebugUtils.currentLine=49479683;
 //BA.debugLineNum = 49479683;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=49479685;
 //BA.debugLineNum = 49479685;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=49479686;
 //BA.debugLineNum = 49479686;BA.debugLine="CreatePageIfNeeded(pi)";
__ref._createpageifneeded /*String*/ (null,_pi);
RDebugUtils.currentLine=49479687;
 //BA.debugLineNum = 49479687;BA.debugLine="TopPageDisappear";
__ref._toppagedisappear /*String*/ (null);
RDebugUtils.currentLine=49479691;
 //BA.debugLineNum = 49479691;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=49479692;
 //BA.debugLineNum = 49479692;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = __ref._getpagefromid /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,_id);
RDebugUtils.currentLine=49479694;
 //BA.debugLineNum = 49479694;BA.debugLine="PageToRemove.Root.RemoveViewFromParent";
_pagetoremove.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 }
};
RDebugUtils.currentLine=49479701;
 //BA.debugLineNum = 49479701;BA.debugLine="mStackOfPageIds.Clear";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=49479702;
 //BA.debugLineNum = 49479702;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._add /*String*/ (null,(Object)(_pi.Id /*String*/ ));
RDebugUtils.currentLine=49479703;
 //BA.debugLineNum = 49479703;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=49479704;
 //BA.debugLineNum = 49479704;BA.debugLine="ShowPageImpl(pi)";
__ref._showpageimpl /*String*/ (null,_pi);
 };
RDebugUtils.currentLine=49479706;
 //BA.debugLineNum = 49479706;BA.debugLine="TopPageAppear";
__ref._toppageappear /*String*/ (null);
RDebugUtils.currentLine=49479707;
 //BA.debugLineNum = 49479707;BA.debugLine="End Sub";
return "";
}
public String  _activity_actionbarhomeclick(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_actionbarhomeclick", true))
	 {return ((String) Debug.delegate(ba, "activity_actionbarhomeclick", null));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="If pi <> Null Then";
if (_pi!= null) { 
RDebugUtils.currentLine=49217539;
 //BA.debugLineNum = 49217539;BA.debugLine="If CloseRequestExists (pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=49217540;
 //BA.debugLineNum = 49217540;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=49217542;
 //BA.debugLineNum = 49217542;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
 };
RDebugUtils.currentLine=49217545;
 //BA.debugLineNum = 49217545;BA.debugLine="End Sub";
return "";
}
public boolean  _activity_keypress(b4a.example.ef.b4xpagesmanager __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_keypress", true))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==__c.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="If CloseRequestExists(pi) Then";
if (__ref._closerequestexists /*boolean*/ (null,_pi)) { 
RDebugUtils.currentLine=50397188;
 //BA.debugLineNum = 50397188;BA.debugLine="HandleCloseRequest(pi)";
__ref._handlecloserequest /*void*/ (null,_pi);
 }else {
RDebugUtils.currentLine=50397190;
 //BA.debugLineNum = 50397190;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 };
RDebugUtils.currentLine=50397192;
 //BA.debugLineNum = 50397192;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=50397194;
 //BA.debugLineNum = 50397194;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=50397195;
 //BA.debugLineNum = 50397195;BA.debugLine="End Sub";
return false;
}
public String  _activity_pause(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=51249152;
 //BA.debugLineNum = 51249152;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
__ref._raiseeventwithresult /*Object*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Disappear",(Object[])(__c.Null));
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="BackgroundStateChanged(False)";
__ref._backgroundstatechanged /*String*/ (null,__c.False);
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "raiseevent", true))
	 {return ((String) Debug.delegate(ba, "raiseevent", new Object[] {_targetpage,_subname,_params}));}
int _length = 0;
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=50790403;
 //BA.debugLineNum = 50790403;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=50790404;
 //BA.debugLineNum = 50790404;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=50790405;
 //BA.debugLineNum = 50790405;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=50790406;
 //BA.debugLineNum = 50790406;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=50790408;
 //BA.debugLineNum = 50790408;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=50790410;
 //BA.debugLineNum = 50790410;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=50790412;
 //BA.debugLineNum = 50790412;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=50790414;
 //BA.debugLineNum = 50790414;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("950790414","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=50790416;
 //BA.debugLineNum = 50790416;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _gettoppage(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "gettoppage", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "gettoppage", null));}
RDebugUtils.currentLine=50987008;
 //BA.debugLineNum = 50987008;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==0) { 
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__c.Null);};
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null).Get((int) (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)-1))));
RDebugUtils.currentLine=50987011;
 //BA.debugLineNum = 50987011;BA.debugLine="End Sub";
return null;
}
public String  _activity_resume(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
boolean _shouldraise = false;
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=51118081;
 //BA.debugLineNum = 51118081;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = __ref._isforeground /*boolean*/ ==__c.False;
RDebugUtils.currentLine=51118082;
 //BA.debugLineNum = 51118082;BA.debugLine="BackgroundStateChanged(True)";
__ref._backgroundstatechanged /*String*/ (null,__c.True);
RDebugUtils.currentLine=51118083;
 //BA.debugLineNum = 51118083;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
RDebugUtils.currentLine=51118084;
 //BA.debugLineNum = 51118084;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,__ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_Appear",(Object[])(__c.Null));
 };
RDebugUtils.currentLine=51118086;
 //BA.debugLineNum = 51118086;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Public Sub CreateMenu (Menu As Object)";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=50593795;
 //BA.debugLineNum = 50593795;BA.debugLine="Dim jo As JavaObject = Menu";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_menu));
RDebugUtils.currentLine=50593796;
 //BA.debugLineNum = 50593796;BA.debugLine="For Each mi As B4AMenuItem In pi.Parent.MenuItems";
{
final anywheresoftware.b4a.BA.IterableList group4 = _pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_mi = (b4a.example.ef.b4xpagesmanager._b4amenuitem)(group4.Get(index4));
RDebugUtils.currentLine=50593797;
 //BA.debugLineNum = 50593797;BA.debugLine="Dim NativeMenuItem As JavaObject = jo.RunMethod(";
_nativemenuitem = new anywheresoftware.b4j.object.JavaObject();
_nativemenuitem = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("add",new Object[]{_mi.Title /*Object*/ })));
RDebugUtils.currentLine=50593798;
 //BA.debugLineNum = 50593798;BA.debugLine="If mi.Bitmap.IsInitialized Then";
if (_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=50593799;
 //BA.debugLineNum = 50593799;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=50593800;
 //BA.debugLineNum = 50593800;BA.debugLine="bd.Initialize(mi.Bitmap)";
_bd.Initialize((android.graphics.Bitmap)(_mi.Bitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=50593801;
 //BA.debugLineNum = 50593801;BA.debugLine="NativeMenuItem.RunMethod(\"setIcon\", Array(bd))";
_nativemenuitem.RunMethod("setIcon",new Object[]{(Object)(_bd.getObject())});
 };
RDebugUtils.currentLine=50593803;
 //BA.debugLineNum = 50593803;BA.debugLine="If mi.AddToBar Then";
if (_mi.AddToBar /*boolean*/ ) { 
RDebugUtils.currentLine=50593804;
 //BA.debugLineNum = 50593804;BA.debugLine="NativeMenuItem.RunMethod(\"setShowAsAction\", Arr";
_nativemenuitem.RunMethod("setShowAsAction",new Object[]{(Object)(1)});
 };
RDebugUtils.currentLine=50593806;
 //BA.debugLineNum = 50593806;BA.debugLine="Dim listener As JavaObject";
_listener = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=50593807;
 //BA.debugLineNum = 50593807;BA.debugLine="listener.InitializeNewInstance(Application.Packa";
_listener.InitializeNewInstance(__c.Application.getPackageName()+".b4xpagesmanager$PagesMenuListener",new Object[]{_pi.B4XPage /*Object*/ ,(Object)(_mi.Tag /*String*/ )});
RDebugUtils.currentLine=50593808;
 //BA.debugLineNum = 50593808;BA.debugLine="NativeMenuItem.RunMethod(\"setOnMenuItemClickList";
_nativemenuitem.RunMethod("setOnMenuItemClickListener",new Object[]{(Object)(_listener.getObject())});
 }
};
RDebugUtils.currentLine=50593810;
 //BA.debugLineNum = 50593810;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4a.example.ef.b4xpagesmanager __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
int _w = 0;
int _h = 0;
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
RDebugUtils.currentLine=50921475;
 //BA.debugLineNum = 50921475;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
__ref._raiseevent /*String*/ (null,__ref._getpageinfofromroot /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
RDebugUtils.currentLine=50921476;
 //BA.debugLineNum = 50921476;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closerequestexists", true))
	 {return ((Boolean) Debug.delegate(ba, "closerequestexists", new Object[] {_pi}));}
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
RDebugUtils.currentLine=50659330;
 //BA.debugLineNum = 50659330;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_CloseRequest");
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubDebug(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
RDebugUtils.currentLine=50724867;
 //BA.debugLineNum = 50724867;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xpagesmanager", "handlecloserequest"), _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (Boolean) result[1];
;
RDebugUtils.currentLine=50724868;
 //BA.debugLineNum = 50724868;BA.debugLine="If ShouldClose Then";
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
RDebugUtils.currentLine=50724869;
 //BA.debugLineNum = 50724869;BA.debugLine="ClosePage(pi.B4XPage)";
__ref._closepage /*String*/ (null,_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=50724871;
 //BA.debugLineNum = 50724871;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="Dim length As Int";
_length = 0;
RDebugUtils.currentLine=50855939;
 //BA.debugLineNum = 50855939;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
RDebugUtils.currentLine=50855940;
 //BA.debugLineNum = 50855940;BA.debugLine="LogEvent(TargetPage, SubName)";
__ref._logevent /*String*/ (null,_targetpage,_subname);
RDebugUtils.currentLine=50855941;
 //BA.debugLineNum = 50855941;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
RDebugUtils.currentLine=50855942;
 //BA.debugLineNum = 50855942;BA.debugLine="Select length";
switch (_length) {
case 0: {
RDebugUtils.currentLine=50855944;
 //BA.debugLineNum = 50855944;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
RDebugUtils.currentLine=50855946;
 //BA.debugLineNum = 50855946;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
RDebugUtils.currentLine=50855948;
 //BA.debugLineNum = 50855948;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
RDebugUtils.currentLine=50855950;
 //BA.debugLineNum = 50855950;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("950855950","Too many parameters",0);
 break; }
}
;
RDebugUtils.currentLine=50855952;
 //BA.debugLineNum = 50855952;BA.debugLine="Return Null";
if (true) return __c.Null;
RDebugUtils.currentLine=50855953;
 //BA.debugLineNum = 50855953;BA.debugLine="End Sub";
return null;
}
public String  _backgroundstatechanged(b4a.example.ef.b4xpagesmanager __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "backgroundstatechanged", true))
	 {return ((String) Debug.delegate(ba, "backgroundstatechanged", new Object[] {_newstate}));}
String _ev = "";
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
RDebugUtils.currentLine=51183617;
 //BA.debugLineNum = 51183617;BA.debugLine="If IsForeground = NewState Then Return";
if (__ref._isforeground /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=51183618;
 //BA.debugLineNum = 51183618;BA.debugLine="IsForeground = NewState";
__ref._isforeground /*boolean*/  = _newstate;
RDebugUtils.currentLine=51183619;
 //BA.debugLineNum = 51183619;BA.debugLine="Dim ev As String";
_ev = "";
RDebugUtils.currentLine=51183620;
 //BA.debugLineNum = 51183620;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (__ref._isforeground /*boolean*/ ) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
RDebugUtils.currentLine=51183621;
 //BA.debugLineNum = 51183621;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
RDebugUtils.currentLine=51183622;
 //BA.debugLineNum = 51183622;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
RDebugUtils.currentLine=51183623;
 //BA.debugLineNum = 51183623;BA.debugLine="LogEvent(pi, ev)";
__ref._logevent /*String*/ (null,_pi,_ev);
RDebugUtils.currentLine=51183624;
 //BA.debugLineNum = 51183624;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=51183625;
 //BA.debugLineNum = 51183625;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
RDebugUtils.currentLine=51183627;
 //BA.debugLineNum = 51183627;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
RDebugUtils.currentLine=51183631;
 //BA.debugLineNum = 51183631;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(b4a.example.ef.b4xpagesmanager __ref,Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageinfo", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "createb4xpageinfo", new Object[] {_b4xpage,_id,_created,_title}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _t1 = null;
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new b4a.example.ef.b4xpagesmanager._b4xpageinfo();
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
RDebugUtils.currentLine=50331652;
 //BA.debugLineNum = 50331652;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
RDebugUtils.currentLine=50331653;
 //BA.debugLineNum = 50331653;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
RDebugUtils.currentLine=50331654;
 //BA.debugLineNum = 50331654;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
RDebugUtils.currentLine=50331655;
 //BA.debugLineNum = 50331655;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=50331656;
 //BA.debugLineNum = 50331656;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageifneeded", true))
	 {return ((String) Debug.delegate(ba, "createpageifneeded", new Object[] {_pi}));}
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
RDebugUtils.currentLine=49938433;
 //BA.debugLineNum = 49938433;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=49938434;
 //BA.debugLineNum = 49938434;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = __ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getsize /*int*/ (null)==1;
RDebugUtils.currentLine=49938435;
 //BA.debugLineNum = 49938435;BA.debugLine="CreatePageImpl (pi)";
__ref._createpageimpl /*String*/ (null,_pi);
RDebugUtils.currentLine=49938436;
 //BA.debugLineNum = 49938436;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
RDebugUtils.currentLine=49938437;
 //BA.debugLineNum = 49938437;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
__ref._rootb4xtopage /*b4a.example.ef.b4xorderedmap*/ ._put /*String*/ (null,(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
RDebugUtils.currentLine=49938438;
 //BA.debugLineNum = 49938438;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
__ref._logevent /*String*/ (null,_pi,"B4XPage_Created");
RDebugUtils.currentLine=49938439;
 //BA.debugLineNum = 49938439;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubDebug2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
RDebugUtils.currentLine=49938441;
 //BA.debugLineNum = 49938441;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _getpagefromid(b4a.example.ef.b4xpagesmanager __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpagefromid", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpagefromid", new Object[] {_id}));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
RDebugUtils.currentLine=50200577;
 //BA.debugLineNum = 50200577;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_id.toLowerCase())));
RDebugUtils.currentLine=50200578;
 //BA.debugLineNum = 50200578;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
RDebugUtils.currentLine=50200579;
 //BA.debugLineNum = 50200579;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("950200579","Error: page id not found: "+_id,0);
RDebugUtils.currentLine=50200580;
 //BA.debugLineNum = 50200580;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("950200580","Ids: "+BA.ObjectToString(__ref._idtob4xpage /*b4a.example.ef.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null)),0);
 };
RDebugUtils.currentLine=50200582;
 //BA.debugLineNum = 50200582;BA.debugLine="Return pi";
if (true) return _pi;
RDebugUtils.currentLine=50200583;
 //BA.debugLineNum = 50200583;BA.debugLine="End Sub";
return null;
}
public String  _logevent(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "logevent", true))
	 {return ((String) Debug.delegate(ba, "logevent", new Object[] {_pi,_ev}));}
String _msg = "";
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
RDebugUtils.currentLine=51314689;
 //BA.debugLineNum = 51314689;BA.debugLine="If LogEvents Then";
if (__ref._logevents /*boolean*/ ) { 
RDebugUtils.currentLine=51314690;
 //BA.debugLineNum = 51314690;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(__ref._stackstring /*String*/ ))+"");
RDebugUtils.currentLine=51314691;
 //BA.debugLineNum = 51314691;BA.debugLine="Log(msg)";
__c.LogImpl("951314691",_msg,0);
 };
RDebugUtils.currentLine=51314693;
 //BA.debugLineNum = 51314693;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Private Sub CheckMainActivityOrientations";
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=49152003;
 //BA.debugLineNum = 49152003;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=49152005;
 //BA.debugLineNum = 49152005;BA.debugLine="ActionBar = jo.RunMethod(\"getActionBar\", Null)";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getActionBar",(Object[])(__c.Null))));
RDebugUtils.currentLine=49152006;
 //BA.debugLineNum = 49152006;BA.debugLine="If ActionBar.IsInitialized = False Then";
if (__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=49152007;
 //BA.debugLineNum = 49152007;BA.debugLine="Dim jme As JavaObject = Me";
_jme = new anywheresoftware.b4j.object.JavaObject();
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=49152008;
 //BA.debugLineNum = 49152008;BA.debugLine="Dim IsAppCompat As Boolean = jme.RunMethod(\"chec";
_isappcompat = BA.ObjectToBoolean(_jme.RunMethod("checkIfAppCompat",new Object[]{(Object)(_jo.getObject())}));
RDebugUtils.currentLine=49152009;
 //BA.debugLineNum = 49152009;BA.debugLine="If IsAppCompat Then";
if (_isappcompat) { 
RDebugUtils.currentLine=49152010;
 //BA.debugLineNum = 49152010;BA.debugLine="ActionBar = jo.RunMethod(\"getSupportActionBar\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getSupportActionBar",(Object[])(__c.Null))));
 };
 };
RDebugUtils.currentLine=49152014;
 //BA.debugLineNum = 49152014;BA.debugLine="Dim pi As JavaObject = jo.RunMethodJO(\"getPackage";
_pi = new anywheresoftware.b4j.object.JavaObject();
_pi = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethodJO("getPackageManager",(Object[])(__c.Null)).RunMethod("getPackageInfo",new Object[]{(Object)(__c.Application.getPackageName()),(Object)(1)})));
RDebugUtils.currentLine=49152015;
 //BA.debugLineNum = 49152015;BA.debugLine="Dim activities() As Object = pi.GetField(\"activit";
_activities = (Object[])(_pi.GetField("activities"));
RDebugUtils.currentLine=49152016;
 //BA.debugLineNum = 49152016;BA.debugLine="For Each Act As JavaObject In activities";
_act = new anywheresoftware.b4j.object.JavaObject();
{
final Object[] group13 = _activities;
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_act = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group13[index13]));
RDebugUtils.currentLine=49152017;
 //BA.debugLineNum = 49152017;BA.debugLine="Dim name As String = Act.GetField(\"name\")";
_name = BA.ObjectToString(_act.GetField("name"));
RDebugUtils.currentLine=49152018;
 //BA.debugLineNum = 49152018;BA.debugLine="If name.EndsWith(\".main\") Then";
if (_name.endsWith(".main")) { 
RDebugUtils.currentLine=49152019;
 //BA.debugLineNum = 49152019;BA.debugLine="Dim screenOrientation As Int = Act.GetField(\"sc";
_screenorientation = (int)(BA.ObjectToNumber(_act.GetField("screenOrientation")));
RDebugUtils.currentLine=49152020;
 //BA.debugLineNum = 49152020;BA.debugLine="If screenOrientation = -1 Then";
if (_screenorientation==-1) { 
RDebugUtils.currentLine=49152021;
 //BA.debugLineNum = 49152021;BA.debugLine="LogColor(\"#SupportedOrientations attribute mus";
__c.LogImpl("949152021","#SupportedOrientations attribute must be set to landscape or portrait.",__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Red);
 };
 };
 }
};
RDebugUtils.currentLine=49152025;
 //BA.debugLineNum = 49152025;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=49020932;
 //BA.debugLineNum = 49020932;BA.debugLine="Private Context As JavaObject";
_context = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=49020933;
 //BA.debugLineNum = 49020933;BA.debugLine="Type B4XPageParent (NativeType As Activity, MenuI";
;
RDebugUtils.currentLine=49020934;
 //BA.debugLineNum = 49020934;BA.debugLine="Type B4AMenuItem (Title As Object, Bitmap As B4XB";
;
RDebugUtils.currentLine=49020940;
 //BA.debugLineNum = 49020940;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
RDebugUtils.currentLine=49020944;
 //BA.debugLineNum = 49020944;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new b4a.example.ef.b4xset();
RDebugUtils.currentLine=49020945;
 //BA.debugLineNum = 49020945;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=49020949;
 //BA.debugLineNum = 49020949;BA.debugLine="Private mMainForm As Activity";
_mmainform = new anywheresoftware.b4a.objects.ActivityWrapper();
RDebugUtils.currentLine=49020950;
 //BA.debugLineNum = 49020950;BA.debugLine="Public ShowUpIndicator As Boolean = True";
_showupindicator = __c.True;
RDebugUtils.currentLine=49020951;
 //BA.debugLineNum = 49020951;BA.debugLine="Public ActionBar As JavaObject";
_actionbar = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=49020955;
 //BA.debugLineNum = 49020955;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
RDebugUtils.currentLine=49020956;
 //BA.debugLineNum = 49020956;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
RDebugUtils.currentLine=49020957;
 //BA.debugLineNum = 49020957;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new b4a.example.ef.b4xmainpage();
RDebugUtils.currentLine=49020958;
 //BA.debugLineNum = 49020958;BA.debugLine="Private StackString As String";
_stackstring = "";
RDebugUtils.currentLine=49020959;
 //BA.debugLineNum = 49020959;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
RDebugUtils.currentLine=49020960;
 //BA.debugLineNum = 49020960;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "closepageimpl", true))
	 {return ((String) Debug.delegate(ba, "closepageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.IntentWrapper _i = null;
RDebugUtils.currentLine=49807360;
 //BA.debugLineNum = 49807360;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
RDebugUtils.currentLine=49807362;
 //BA.debugLineNum = 49807362;BA.debugLine="If mStackOfPageIds.Size = 1 Then";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)==1) { 
RDebugUtils.currentLine=49807363;
 //BA.debugLineNum = 49807363;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
RDebugUtils.currentLine=49807364;
 //BA.debugLineNum = 49807364;BA.debugLine="i.Initialize(i.ACTION_MAIN, \"\")";
_i.Initialize(_i.ACTION_MAIN,"");
RDebugUtils.currentLine=49807365;
 //BA.debugLineNum = 49807365;BA.debugLine="i.AddCategory(\"android.intent.category.HOME\")";
_i.AddCategory("android.intent.category.HOME");
RDebugUtils.currentLine=49807366;
 //BA.debugLineNum = 49807366;BA.debugLine="i.Flags = 0x10000000";
_i.setFlags(((int)0x10000000));
RDebugUtils.currentLine=49807367;
 //BA.debugLineNum = 49807367;BA.debugLine="StartActivity(i)";
__c.StartActivity(ba,(Object)(_i.getObject()));
 }else {
RDebugUtils.currentLine=49807369;
 //BA.debugLineNum = 49807369;BA.debugLine="pi.Root.RemoveViewFromParent";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=49807376;
 //BA.debugLineNum = 49807376;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppagedisappear", true))
	 {return ((String) Debug.delegate(ba, "toppagedisappear", null));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=49610752;
 //BA.debugLineNum = 49610752;BA.debugLine="Private Sub TopPageDisappear";
RDebugUtils.currentLine=49610753;
 //BA.debugLineNum = 49610753;BA.debugLine="If xui.IsB4J Then Return";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
if (true) return "";};
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=49610755;
 //BA.debugLineNum = 49610755;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=49610756;
 //BA.debugLineNum = 49610756;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=49610757;
 //BA.debugLineNum = 49610757;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=49610758;
 //BA.debugLineNum = 49610758;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
__ref._raiseeventwithresult /*Object*/ (null,_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=49610761;
 //BA.debugLineNum = 49610761;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "showpageimpl", true))
	 {return ((String) Debug.delegate(ba, "showpageimpl", new Object[] {_pi}));}
anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=49872902;
 //BA.debugLineNum = 49872902;BA.debugLine="If pi.Root.Parent.IsInitialized Then pi.Root.Remo";
if (_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=49872903;
 //BA.debugLineNum = 49872903;BA.debugLine="Dim pnl As Panel = pi.Root";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
_pnl = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=49872904;
 //BA.debugLineNum = 49872904;BA.debugLine="If TransitionAnimationDuration > 0 Then";
if (__ref._transitionanimationduration /*int*/ >0) { 
RDebugUtils.currentLine=49872905;
 //BA.debugLineNum = 49872905;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 20dip, 20dip)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.DipToCurrent((int) (20)),__c.DipToCurrent((int) (20)));
RDebugUtils.currentLine=49872906;
 //BA.debugLineNum = 49872906;BA.debugLine="pnl.SetLayoutAnimated(TransitionAnimationDuratio";
_pnl.SetLayoutAnimated(__ref._transitionanimationduration /*int*/ ,(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 }else {
RDebugUtils.currentLine=49872908;
 //BA.debugLineNum = 49872908;BA.debugLine="mMainForm.AddView(pnl, 0, 0, 100%x, 100%y)";
__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
 };
RDebugUtils.currentLine=49872913;
 //BA.debugLineNum = 49872913;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "toppageappear", true))
	 {return ((String) Debug.delegate(ba, "toppageappear", null));}
b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi = null;
RDebugUtils.currentLine=49676288;
 //BA.debugLineNum = 49676288;BA.debugLine="Private Sub TopPageAppear";
RDebugUtils.currentLine=49676289;
 //BA.debugLineNum = 49676289;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = __ref._gettoppage /*b4a.example.ef.b4xpagesmanager._b4xpageinfo*/ (null);
RDebugUtils.currentLine=49676290;
 //BA.debugLineNum = 49676290;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
RDebugUtils.currentLine=49676291;
 //BA.debugLineNum = 49676291;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/ .setTitle(BA.ObjectToCharSequence(_pi.Title /*Object*/ ));
RDebugUtils.currentLine=49676292;
 //BA.debugLineNum = 49676292;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i())) { 
RDebugUtils.currentLine=49676293;
 //BA.debugLineNum = 49676293;BA.debugLine="If IsForeground Then";
if (__ref._isforeground /*boolean*/ ) { 
RDebugUtils.currentLine=49676294;
 //BA.debugLineNum = 49676294;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
__ref._raiseevent /*String*/ (null,_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
RDebugUtils.currentLine=49676298;
 //BA.debugLineNum = 49676298;BA.debugLine="If ShowUpIndicator And ActionBar.IsInitialized Th";
if (__ref._showupindicator /*boolean*/  && __ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .IsInitialized()) { 
RDebugUtils.currentLine=49676299;
 //BA.debugLineNum = 49676299;BA.debugLine="ActionBar.RunMethod(\"setDisplayHomeAsUpEnabled\",";
__ref._actionbar /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setDisplayHomeAsUpEnabled",new Object[]{(Object)(__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)>1)});
 };
RDebugUtils.currentLine=49676301;
 //BA.debugLineNum = 49676301;BA.debugLine="UpdateMenuItems";
__ref._updatemenuitems /*String*/ (null);
RDebugUtils.currentLine=49676303;
 //BA.debugLineNum = 49676303;BA.debugLine="UpdateStackString";
__ref._updatestackstring /*String*/ (null);
RDebugUtils.currentLine=49676304;
 //BA.debugLineNum = 49676304;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageparent  _createb4xpageparent(b4a.example.ef.b4xpagesmanager __ref,Object _nativetype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createb4xpageparent", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageparent) Debug.delegate(ba, "createb4xpageparent", new Object[] {_nativetype}));}
b4a.example.ef.b4xpagesmanager._b4xpageparent _t1 = null;
RDebugUtils.currentLine=51052544;
 //BA.debugLineNum = 51052544;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As Obj";
RDebugUtils.currentLine=51052550;
 //BA.debugLineNum = 51052550;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new b4a.example.ef.b4xpagesmanager._b4xpageparent();
RDebugUtils.currentLine=51052551;
 //BA.debugLineNum = 51052551;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=51052552;
 //BA.debugLineNum = 51052552;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4a.objects.ActivityWrapper*/  = (anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_nativetype));
RDebugUtils.currentLine=51052553;
 //BA.debugLineNum = 51052553;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=51052554;
 //BA.debugLineNum = 51052554;BA.debugLine="End Sub";
return null;
}
public String  _createpageimpl(b4a.example.ef.b4xpagesmanager __ref,b4a.example.ef.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "createpageimpl", true))
	 {return ((String) Debug.delegate(ba, "createpageimpl", new Object[] {_pi}));}
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
RDebugUtils.currentLine=50069516;
 //BA.debugLineNum = 50069516;BA.debugLine="pi.Root = xui.CreatePanel(\"root\")";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"root");
RDebugUtils.currentLine=50069517;
 //BA.debugLineNum = 50069517;BA.debugLine="pi.root.SetLayoutAnimated(0, 0, 0, 100%x, 100%y)";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=50069518;
 //BA.debugLineNum = 50069518;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/  = __ref._createb4xpageparent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ (null,(Object)(__ref._mmainform /*anywheresoftware.b4a.objects.ActivityWrapper*/ .getObject()));
RDebugUtils.currentLine=50069519;
 //BA.debugLineNum = 50069519;BA.debugLine="pi.Parent.MenuItems.Initialize";
_pi.Parent /*b4a.example.ef.b4xpagesmanager._b4xpageparent*/ .MenuItems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=50069527;
 //BA.debugLineNum = 50069527;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(b4a.example.ef.b4xpagesmanager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "getpageinfofromroot", true))
	 {return ((b4a.example.ef.b4xpagesmanager._b4xpageinfo) Debug.delegate(ba, "getpageinfofromroot", new Object[] {_root}));}
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (b4a.example.ef.b4xpagesmanager._b4xpageinfo)(__ref._rootb4xtopage /*b4a.example.ef.b4xorderedmap*/ ._get /*Object*/ (null,(Object)(_root.getObject())));
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="End Sub";
return null;
}
public String  _updatemenuitems(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatemenuitems", true))
	 {return ((String) Debug.delegate(ba, "updatemenuitems", null));}
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Private Sub UpdateMenuItems";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="Context.RunMethod(\"invalidateOptionsMenu\", Null)";
__ref._context /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("invalidateOptionsMenu",(Object[])(__c.Null));
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="End Sub";
return "";
}
public String  _updatestackstring(b4a.example.ef.b4xpagesmanager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesmanager";
if (Debug.shouldDelegate(ba, "updatestackstring", true))
	 {return ((String) Debug.delegate(ba, "updatestackstring", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
RDebugUtils.currentLine=51380224;
 //BA.debugLineNum = 51380224;BA.debugLine="Public Sub UpdateStackString";
RDebugUtils.currentLine=51380225;
 //BA.debugLineNum = 51380225;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=51380226;
 //BA.debugLineNum = 51380226;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=51380227;
 //BA.debugLineNum = 51380227;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
RDebugUtils.currentLine=51380228;
 //BA.debugLineNum = 51380228;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (__ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._getsize /*int*/ (null)>0) { 
RDebugUtils.currentLine=51380229;
 //BA.debugLineNum = 51380229;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._mstackofpageids /*b4a.example.ef.b4xset*/ ._aslist /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=51380230;
 //BA.debugLineNum = 51380230;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
RDebugUtils.currentLine=51380232;
 //BA.debugLineNum = 51380232;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
RDebugUtils.currentLine=51380234;
 //BA.debugLineNum = 51380234;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
RDebugUtils.currentLine=51380235;
 //BA.debugLineNum = 51380235;BA.debugLine="StackString = sb.ToString";
__ref._stackstring /*String*/  = _sb.ToString();
RDebugUtils.currentLine=51380236;
 //BA.debugLineNum = 51380236;BA.debugLine="End Sub";
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