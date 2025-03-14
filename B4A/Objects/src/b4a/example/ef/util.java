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
RDebugUtils.currentLine=86179840;
 //BA.debugLineNum = 86179840;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=86179842;
 //BA.debugLineNum = 86179842;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=86245376;
 //BA.debugLineNum = 86245376;BA.debugLine="Sub SetStatusBarColor(clr As Int, clr1 As Int)";
RDebugUtils.currentLine=86245377;
 //BA.debugLineNum = 86245377;BA.debugLine="clr1=0xB4008000";
_clr1 = ((int)0xb4008000);
RDebugUtils.currentLine=86245378;
 //BA.debugLineNum = 86245378;BA.debugLine="Try";
try {RDebugUtils.currentLine=86245379;
 //BA.debugLineNum = 86245379;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=86245380;
 //BA.debugLineNum = 86245380;BA.debugLine="If p.SdkVersion >= 21 Then";
if (_p.getSdkVersion()>=21) { 
RDebugUtils.currentLine=86245381;
 //BA.debugLineNum = 86245381;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=86245382;
 //BA.debugLineNum = 86245382;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=86245383;
 //BA.debugLineNum = 86245383;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getW";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
RDebugUtils.currentLine=86245384;
 //BA.debugLineNum = 86245384;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000)";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
RDebugUtils.currentLine=86245385;
 //BA.debugLineNum = 86245385;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x0400000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
RDebugUtils.currentLine=86245386;
 //BA.debugLineNum = 86245386;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
RDebugUtils.currentLine=86245387;
 //BA.debugLineNum = 86245387;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array";
_window.RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr1)});
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=86245390;
 //BA.debugLineNum = 86245390;BA.debugLine="Log(LastException)";
__c.LogImpl("086245390",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=86245393;
 //BA.debugLineNum = 86245393;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.util __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="util";
RDebugUtils.currentLine=86114304;
 //BA.debugLineNum = 86114304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=86114306;
 //BA.debugLineNum = 86114306;BA.debugLine="End Sub";
return "";
}
}