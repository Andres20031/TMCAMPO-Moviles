package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class util extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.util");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.util.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(b4a.example.ef.util __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="util";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="End Sub";
return "";
}
public String  _setstatusbarcolor(b4a.example.ef.util __ref,int _clr,int _clr1) throws Exception{
__ref = this;
RDebugUtils.currentModule="util";
if (Debug.shouldDelegate(ba, "setstatusbarcolor", false))
	 {return ((String) Debug.delegate(ba, "setstatusbarcolor", new Object[] {_clr,_clr1}));}
anywheresoftware.b4a.phone.Phone _p = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _window = null;
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Sub SetStatusBarColor(clr As Int, clr1 As Int)";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="clr1=0xB4008000";
_clr1 = ((int)0xb4008000);
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="Try";
try {RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=34603012;
 //BA.debugLineNum = 34603012;BA.debugLine="If p.SdkVersion >= 21 Then";
if (_p.getSdkVersion()>=21) { 
RDebugUtils.currentLine=34603013;
 //BA.debugLineNum = 34603013;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=34603014;
 //BA.debugLineNum = 34603014;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=34603015;
 //BA.debugLineNum = 34603015;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getW";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
RDebugUtils.currentLine=34603016;
 //BA.debugLineNum = 34603016;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000)";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
RDebugUtils.currentLine=34603017;
 //BA.debugLineNum = 34603017;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x0400000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
RDebugUtils.currentLine=34603018;
 //BA.debugLineNum = 34603018;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
RDebugUtils.currentLine=34603019;
 //BA.debugLineNum = 34603019;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array";
_window.RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr1)});
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=34603022;
 //BA.debugLineNum = 34603022;BA.debugLine="Log(LastException)";
__c.LogImpl("734603022",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=34603025;
 //BA.debugLineNum = 34603025;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.util __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="util";
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="End Sub";
return "";
}
}