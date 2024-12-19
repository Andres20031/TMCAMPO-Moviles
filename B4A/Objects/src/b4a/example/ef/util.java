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
public String  _initialize(b4a.example.ef.util __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="util";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub SetStatusBarColor(clr As Int, clr1 As Int)";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="clr1=0xB4008000";
_clr1 = ((int)0xb4008000);
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Try";
try {RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="If p.SdkVersion >= 21 Then";
if (_p.getSdkVersion()>=21) { 
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="jo.InitializeContext";
_jo.InitializeContext(ba);
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getW";
_window = new anywheresoftware.b4j.object.JavaObject();
_window = _jo.RunMethodJO("getWindow",(Object[])(__c.Null));
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000)";
_window.RunMethod("addFlags",new Object[]{(Object)(((int)0x80000000))});
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x0400000";
_window.RunMethod("clearFlags",new Object[]{(Object)(((int)0x04000000))});
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr";
_window.RunMethod("setStatusBarColor",new Object[]{(Object)(_clr)});
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array";
_window.RunMethod("setNavigationBarColor",new Object[]{(Object)(_clr1)});
 };
 } 
       catch (Exception e14) {
			ba.setLastException(e14);RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="Log(LastException)";
__c.LogImpl("35439502",BA.ObjectToString(__c.LastException(getActivityBA())),0);
 };
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.util __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="util";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
}