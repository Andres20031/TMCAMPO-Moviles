package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xprogressbar_subs_0 {


public static void  _animatevalueto(RemoteObject __ref,RemoteObject _newvalue) throws Exception{
try {
		Debug.PushSubsStack("AnimateValueTo (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("animatevalueto")) { __ref.runUserSub(false, "b4xprogressbar","animatevalueto", __ref, _newvalue); return;}
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(null,__ref,_newvalue);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(b4a.example.ef.b4xprogressbar parent,RemoteObject __ref,RemoteObject _newvalue) {
this.parent = parent;
this.__ref = __ref;
this._newvalue = _newvalue;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.b4xprogressbar parent;
RemoteObject _newvalue;
RemoteObject _n = RemoteObject.createImmutable(0L);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _start = RemoteObject.createImmutable(0f);
RemoteObject _tempvalue = RemoteObject.createImmutable(0f);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("AnimateValueTo (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,50);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("NewValue", _newvalue);
 BA.debugLineNum = 51;BA.debugLine="Dim n As Long = DateTime.Now";
Debug.ShouldStop(262144);
_n = parent.__c.getField(false,"DateTime").runMethod(true,"getNow");Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 52;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
Debug.ShouldStop(524288);
_duration = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.__c.runMethod(true,"Abs",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_currentvalue" /*RemoteObject*/ ),_newvalue}, "-",1, 0))),RemoteObject.createImmutable(100),__ref.getField(true,"_durationfromzeroto100" /*RemoteObject*/ ),RemoteObject.createImmutable(1000)}, "/*+",1, 0));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 53;BA.debugLine="Dim start As Float = currentValue";
Debug.ShouldStop(1048576);
_start = __ref.getField(true,"_currentvalue" /*RemoteObject*/ );Debug.locals.put("start", _start);Debug.locals.put("start", _start);
 BA.debugLineNum = 54;BA.debugLine="currentValue = NewValue";
Debug.ShouldStop(2097152);
__ref.setField ("_currentvalue" /*RemoteObject*/ ,_newvalue);
 BA.debugLineNum = 55;BA.debugLine="Dim tempValue As Float";
Debug.ShouldStop(4194304);
_tempvalue = RemoteObject.createImmutable(0f);Debug.locals.put("tempValue", _tempvalue);
 BA.debugLineNum = 56;BA.debugLine="Do While DateTime.Now < n + duration";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//do while
this.state = 10;
while (RemoteObject.solveBoolean("<",parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),RemoteObject.solve(new RemoteObject[] {_n,_duration}, "+",1, 2))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 57;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
Debug.ShouldStop(16777216);
_tempvalue = __ref.runClassMethod (b4a.example.ef.b4xprogressbar.class, "_valuefromtimeeaseinout" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"getNow"),_n}, "-",1, 2))),(Object)(_start),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_newvalue,_start}, "-",1, 0))),(Object)(_duration));Debug.locals.put("tempValue", _tempvalue);
 BA.debugLineNum = 58;BA.debugLine="DrawValue(tempValue)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (b4a.example.ef.b4xprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(_tempvalue));
 BA.debugLineNum = 59;BA.debugLine="Sleep(10)";
Debug.ShouldStop(67108864);
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xprogressbar", "animatevalueto"),BA.numberCast(int.class, 10));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 BA.debugLineNum = 60;BA.debugLine="If NewValue <> currentValue Then Return 'will ha";
Debug.ShouldStop(134217728);
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("!",_newvalue,BA.numberCast(double.class, __ref.getField(true,"_currentvalue" /*RemoteObject*/ )))) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
if (true) return ;
if (true) break;

case 9:
//C
this.state = 1;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 62;BA.debugLine="DrawValue(currentValue)";
Debug.ShouldStop(536870912);
__ref.runClassMethod (b4a.example.ef.b4xprogressbar.class, "_drawvalue" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_currentvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xprogressbar","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 37;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="cvs.Resize(Width, Height)";
Debug.ShouldStop(32);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Resize",(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 39;BA.debugLine="AnimateValueTo(currentValue)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4a.example.ef.b4xprogressbar.class, "_animatevalueto" /*void*/ ,(Object)(__ref.getField(true,"_currentvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private mEventName As String 'ignore";
b4xprogressbar._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4xprogressbar._meventname);
 //BA.debugLineNum = 8;BA.debugLine="Private mCallBack As Object 'ignore";
b4xprogressbar._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",b4xprogressbar._mcallback);
 //BA.debugLineNum = 9;BA.debugLine="Public mBase As B4XView 'ignore";
b4xprogressbar._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",b4xprogressbar._mbase);
 //BA.debugLineNum = 10;BA.debugLine="Private lbl As B4XView 'ignore";
b4xprogressbar._lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_lbl",b4xprogressbar._lbl);
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI 'ignore";
b4xprogressbar._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xprogressbar._xui);
 //BA.debugLineNum = 12;BA.debugLine="Private bcolor, pcolor As Int";
b4xprogressbar._bcolor = RemoteObject.createImmutable(0);__ref.setField("_bcolor",b4xprogressbar._bcolor);
b4xprogressbar._pcolor = RemoteObject.createImmutable(0);__ref.setField("_pcolor",b4xprogressbar._pcolor);
 //BA.debugLineNum = 13;BA.debugLine="Private thickness As Float";
b4xprogressbar._thickness = RemoteObject.createImmutable(0f);__ref.setField("_thickness",b4xprogressbar._thickness);
 //BA.debugLineNum = 14;BA.debugLine="Private cvs As B4XCanvas";
b4xprogressbar._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");__ref.setField("_cvs",b4xprogressbar._cvs);
 //BA.debugLineNum = 15;BA.debugLine="Private vertical As Boolean";
b4xprogressbar._vertical = RemoteObject.createImmutable(false);__ref.setField("_vertical",b4xprogressbar._vertical);
 //BA.debugLineNum = 16;BA.debugLine="Private currentValue As Float";
b4xprogressbar._currentvalue = RemoteObject.createImmutable(0f);__ref.setField("_currentvalue",b4xprogressbar._currentvalue);
 //BA.debugLineNum = 17;BA.debugLine="Private DurationFromZeroTo100 As Int = 500";
b4xprogressbar._durationfromzeroto100 = BA.numberCast(int.class, 500);__ref.setField("_durationfromzeroto100",b4xprogressbar._durationfromzeroto100);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl1,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xprogressbar","designercreateview", __ref, _base, _lbl1, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("lbl1", _lbl1);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 29;BA.debugLine="bcolor = xui.PaintOrColorToColor(Props.Get(\"Backg";
Debug.ShouldStop(268435456);
__ref.setField ("_bcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BackgroundColor")))))));
 BA.debugLineNum = 30;BA.debugLine="pcolor = xui.PaintOrColorToColor(Props.Get(\"Progr";
Debug.ShouldStop(536870912);
__ref.setField ("_pcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ProgressColor")))))));
 BA.debugLineNum = 31;BA.debugLine="thickness = DipToCurrent(Props.Get(\"Thickness\"))";
Debug.ShouldStop(1073741824);
__ref.setField ("_thickness" /*RemoteObject*/ ,BA.numberCast(float.class, b4xprogressbar.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Thickness")))))))));
 BA.debugLineNum = 32;BA.debugLine="vertical = Props.Get(\"Orientation\") = \"Vertical\"";
Debug.ShouldStop(-2147483648);
__ref.setField ("_vertical" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Orientation")))),RemoteObject.createImmutable(("Vertical")))));
 BA.debugLineNum = 33;BA.debugLine="cvs.Initialize(mBase)";
Debug.ShouldStop(1);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(2);
__ref.runClassMethod (b4a.example.ef.b4xprogressbar.class, "_base_resize" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawvalue(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("DrawValue (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("drawvalue")) { return __ref.runUserSub(false, "b4xprogressbar","drawvalue", __ref, _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 76;BA.debugLine="Private Sub DrawValue(Value As Float)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 77;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
Debug.ShouldStop(4096);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("ClearRect",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect")));
 BA.debugLineNum = 78;BA.debugLine="If vertical Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_vertical" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
Debug.ShouldStop(16384);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getBottom")),(Object)(__ref.getField(true,"_bcolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_thickness" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
Debug.ShouldStop(32768);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterX")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100),__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getBottom")}, "/*",0, 0))),(Object)(__ref.getField(true,"_pcolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_thickness" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 82;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, cvs.Targ";
Debug.ShouldStop(131072);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getRight")),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(__ref.getField(true,"_bcolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_thickness" /*RemoteObject*/ )));
 BA.debugLineNum = 83;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, Value /";
Debug.ShouldStop(262144);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_value,RemoteObject.createImmutable(100),__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getRight")}, "/*",0, 0))),(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getTargetRect").runMethod(true,"getCenterY")),(Object)(__ref.getField(true,"_pcolor" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_thickness" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 85;BA.debugLine="cvs.Invalidate";
Debug.ShouldStop(1048576);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getprogress(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getProgress (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("getprogress")) { return __ref.runUserSub(false, "b4xprogressbar","getprogress", __ref);}
 BA.debugLineNum = 42;BA.debugLine="Public Sub getProgress As Float";
Debug.ShouldStop(512);
 BA.debugLineNum = 43;BA.debugLine="Return currentValue";
Debug.ShouldStop(1024);
if (true) return __ref.getField(true,"_currentvalue" /*RemoteObject*/ );
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xprogressbar","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1048576);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2097152);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprogress(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("setProgress (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setprogress")) { return __ref.runUserSub(false, "b4xprogressbar","setprogress", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 46;BA.debugLine="Public Sub setProgress(v As Float)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="AnimateValueTo(v)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4a.example.ef.b4xprogressbar.class, "_animatevalueto" /*void*/ ,(Object)(_v));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _valuefromtimeeaseinout(RemoteObject __ref,RemoteObject _time,RemoteObject _start,RemoteObject _changeinvalue,RemoteObject _duration) throws Exception{
try {
		Debug.PushSubsStack("ValueFromTimeEaseInOut (b4xprogressbar) ","b4xprogressbar",9,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("valuefromtimeeaseinout")) { return __ref.runUserSub(false, "b4xprogressbar","valuefromtimeeaseinout", __ref, _time, _start, _changeinvalue, _duration);}
Debug.locals.put("Time", _time);
Debug.locals.put("Start", _start);
Debug.locals.put("ChangeInValue", _changeinvalue);
Debug.locals.put("Duration", _duration);
 BA.debugLineNum = 66;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Time = Time / (Duration / 2)";
Debug.ShouldStop(4);
_time = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_time,(RemoteObject.solve(new RemoteObject[] {_duration,RemoteObject.createImmutable(2)}, "/",0, 0))}, "/",0, 0));Debug.locals.put("Time", _time);
 BA.debugLineNum = 68;BA.debugLine="If Time < 1 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("<",_time,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 69;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
Debug.ShouldStop(16);
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_changeinvalue,RemoteObject.createImmutable(2),_time,_time,_time,_time,_start}, "/****+",1, 0));
 }else {
 BA.debugLineNum = 71;BA.debugLine="Time = Time - 2";
Debug.ShouldStop(64);
_time = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_time,RemoteObject.createImmutable(2)}, "-",1, 0));Debug.locals.put("Time", _time);
 BA.debugLineNum = 72;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
Debug.ShouldStop(128);
if (true) return BA.numberCast(float.class, -(double) (0 + _changeinvalue.<Float>get().floatValue())/(double)(double) (0 + 2)*(RemoteObject.solve(new RemoteObject[] {_time,_time,_time,_time,RemoteObject.createImmutable(2)}, "***-",1, 0)).<Double>get().doubleValue()+(double) (0 + _start.<Float>get().floatValue()));
 };
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}