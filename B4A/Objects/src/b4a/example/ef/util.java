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
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Sub SetStatusBarColor(clr As Int, clr1 As Int)";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="clr1=0xB4008000";
_clr1 = ((int)0xb4008000);
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="Try";
try {RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="If p.SdkVersion >= 21 Then";
if (_p.getSdkVersion()>=21) { 
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=36831238;
 //BA.debugLineNum = 36831238;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getW";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000)";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
RDebugUtils.currentLine=36831241;
 //BA.debugLineNum = 36831241;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x0400000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
RDebugUtils.currentLine=36831242;
 //BA.debugLineNum = 36831242;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
RDebugUtils.currentLine=36831243;
 //BA.debugLineNum = 36831243;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array";
_window.RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr1)});
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=36831246;
 //BA.debugLineNum = 36831246;BA.debugLine="Log(LastException)";
__c.LogImpl("436831246",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=36831249;
 //BA.debugLineNum = 36831249;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.util __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="util";
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="End Sub";
return "";
}
}