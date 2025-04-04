package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class util_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (util) ","util",20,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "util","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(32);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatusbarcolor(RemoteObject __ref,RemoteObject _clr,RemoteObject _clr1) throws Exception{
try {
		Debug.PushSubsStack("SetStatusBarColor (util) ","util",20,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("setstatusbarcolor")) { return __ref.runUserSub(false, "util","setstatusbarcolor", __ref, _clr, _clr1);}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _window = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("clr", _clr);
Debug.locals.put("clr1", _clr1);
 BA.debugLineNum = 10;BA.debugLine="Sub SetStatusBarColor(clr As Int, clr1 As Int)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="clr1=0xB4008000";
Debug.ShouldStop(1024);
_clr1 = BA.numberCast(int.class, ((int)0xb4008000));Debug.locals.put("clr1", _clr1);
 BA.debugLineNum = 12;BA.debugLine="Try";
Debug.ShouldStop(2048);
try { BA.debugLineNum = 13;BA.debugLine="Dim p As Phone";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");Debug.locals.put("p", _p);
 BA.debugLineNum = 14;BA.debugLine="If p.SdkVersion >= 21 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("g",_p.runMethod(true,"getSdkVersion"),BA.numberCast(double.class, 21))) { 
 BA.debugLineNum = 15;BA.debugLine="Dim jo As JavaObject";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");Debug.locals.put("jo", _jo);
 BA.debugLineNum = 16;BA.debugLine="jo.InitializeContext";
Debug.ShouldStop(32768);
_jo.runVoidMethod ("InitializeContext",__ref.getField(false, "ba"));
 BA.debugLineNum = 17;BA.debugLine="Dim window As JavaObject = jo.RunMethodJO(\"getW";
Debug.ShouldStop(65536);
_window = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_window = _jo.runMethod(false,"RunMethodJO",(Object)(BA.ObjectToString("getWindow")),(Object)((util.__c.getField(false,"Null"))));Debug.locals.put("window", _window);Debug.locals.put("window", _window);
 BA.debugLineNum = 18;BA.debugLine="window.RunMethod(\"addFlags\", Array (0x80000000)";
Debug.ShouldStop(131072);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x80000000)))})));
 BA.debugLineNum = 19;BA.debugLine="window.RunMethod(\"clearFlags\", Array (0x0400000";
Debug.ShouldStop(262144);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("clearFlags")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {RemoteObject.createImmutable((((int)0x04000000)))})));
 BA.debugLineNum = 20;BA.debugLine="window.RunMethod(\"setStatusBarColor\", Array(clr";
Debug.ShouldStop(524288);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setStatusBarColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr)})));
 BA.debugLineNum = 21;BA.debugLine="window.RunMethod(\"setNavigationBarColor\", Array";
Debug.ShouldStop(1048576);
_window.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setNavigationBarColor")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_clr1)})));
 };
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e14) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e14.toString()); BA.debugLineNum = 24;BA.debugLine="Log(LastException)";
Debug.ShouldStop(8388608);
util.__c.runVoidMethod ("LogImpl","436831246",BA.ObjectToString(util.__c.runMethod(false,"LastException",__ref.runMethod(false,"getActivityBA"))),0);
 };
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}