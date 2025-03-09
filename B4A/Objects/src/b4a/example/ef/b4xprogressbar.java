package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xprogressbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xprogressbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xprogressbar.class).invoke(this, new Object[] {null});
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
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _bcolor = 0;
public int _pcolor = 0;
public float _thickness = 0f;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public boolean _vertical = false;
public float _currentvalue = 0f;
public int _durationfromzeroto100 = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _setprogress(b4a.example.ef.b4xprogressbar __ref,float _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "setprogress", false))
	 {return ((String) Debug.delegate(ba, "setprogress", new Object[] {_v}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub setProgress(v As Float)";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="AnimateValueTo(v)";
__ref._animatevalueto /*void*/ (null,_v);
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return "";
}
public void  _animatevalueto(b4a.example.ef.b4xprogressbar __ref,float _newvalue) throws Exception{
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "animatevalueto", false))
	 {Debug.delegate(ba, "animatevalueto", new Object[] {_newvalue}); return;}
ResumableSub_AnimateValueTo rsub = new ResumableSub_AnimateValueTo(this,__ref,_newvalue);
rsub.resume(ba, null);
}
public static class ResumableSub_AnimateValueTo extends BA.ResumableSub {
public ResumableSub_AnimateValueTo(b4a.example.ef.b4xprogressbar parent,b4a.example.ef.b4xprogressbar __ref,float _newvalue) {
this.parent = parent;
this.__ref = __ref;
this._newvalue = _newvalue;
this.__ref = parent;
}
b4a.example.ef.b4xprogressbar __ref;
b4a.example.ef.b4xprogressbar parent;
float _newvalue;
long _n = 0L;
int _duration = 0;
float _start = 0f;
float _tempvalue = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xprogressbar";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim n As Long = DateTime.Now";
_n = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim duration As Int = Abs(currentValue - NewValue";
_duration = (int) (parent.__c.Abs(__ref._currentvalue /*float*/ -_newvalue)/(double)100*__ref._durationfromzeroto100 /*int*/ +1000);
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="Dim start As Float = currentValue";
_start = __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="currentValue = NewValue";
__ref._currentvalue /*float*/  = _newvalue;
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Dim tempValue As Float";
_tempvalue = 0f;
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Do While DateTime.Now < n + duration";
if (true) break;

case 1:
//do while
this.state = 10;
while (parent.__c.DateTime.getNow()<_n+_duration) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="tempValue = ValueFromTimeEaseInOut(DateTime.Now";
_tempvalue = __ref._valuefromtimeeaseinout /*float*/ (null,(float) (parent.__c.DateTime.getNow()-_n),_start,(float) (_newvalue-_start),_duration);
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="DrawValue(tempValue)";
__ref._drawvalue /*String*/ (null,_tempvalue);
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="Sleep(10)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xprogressbar", "animatevalueto"),(int) (10));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="If NewValue <> currentValue Then Return 'will ha";
if (true) break;

case 4:
//if
this.state = 9;
if (_newvalue!=__ref._currentvalue /*float*/ ) { 
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
RDebugUtils.currentLine=5570572;
 //BA.debugLineNum = 5570572;BA.debugLine="DrawValue(currentValue)";
__ref._drawvalue /*String*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=5570573;
 //BA.debugLineNum = 5570573;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public float  _valuefromtimeeaseinout(b4a.example.ef.b4xprogressbar __ref,float _time,float _start,float _changeinvalue,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "valuefromtimeeaseinout", false))
	 {return ((Float) Debug.delegate(ba, "valuefromtimeeaseinout", new Object[] {_time,_start,_changeinvalue,_duration}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub ValueFromTimeEaseInOut(Time As Float,";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Time = Time / (Duration / 2)";
_time = (float) (_time/(double)(_duration/(double)2));
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="If Time < 1 Then";
if (_time<1) { 
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Return ChangeInValue / 2 * Time * Time * Time *";
if (true) return (float) (_changeinvalue/(double)2*_time*_time*_time*_time+_start);
 }else {
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="Time = Time - 2";
_time = (float) (_time-2);
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Return -ChangeInValue / 2 * (Time * Time * Time";
if (true) return (float) (-_changeinvalue/(double)2*(_time*_time*_time*_time-2)+_start);
 };
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="End Sub";
return 0f;
}
public String  _drawvalue(b4a.example.ef.b4xprogressbar __ref,float _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "drawvalue", false))
	 {return ((String) Debug.delegate(ba, "drawvalue", new Object[] {_value}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub DrawValue(Value As Float)";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),(float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom(),__ref._bcolor /*int*/ ,__ref._thickness /*float*/ );
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="cvs.DrawLine(cvs.TargetRect.CenterX, 0, cvs.Targ";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),(float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterX(),(float) (_value/(double)100*__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()),__ref._pcolor /*int*/ ,__ref._thickness /*float*/ );
 }else {
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, cvs.Targ";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),__ref._bcolor /*int*/ ,__ref._thickness /*float*/ );
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="cvs.DrawLine(0, cvs.TargetRect.CenterY, Value /";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (0),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),(float) (_value/(double)100*__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()),__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY(),__ref._pcolor /*int*/ ,__ref._thickness /*float*/ );
 };
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.b4xprogressbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "base_resize", false))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="AnimateValueTo(currentValue)";
__ref._animatevalueto /*void*/ (null,__ref._currentvalue /*float*/ );
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Private lbl As B4XView 'ignore";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Private bcolor, pcolor As Int";
_bcolor = 0;
_pcolor = 0;
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="Private thickness As Float";
_thickness = 0f;
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="Private vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="Private currentValue As Float";
_currentvalue = 0f;
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="Private DurationFromZeroTo100 As Int = 500";
_durationfromzeroto100 = (int) (500);
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4xprogressbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl1,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl1,_props}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="bcolor = xui.PaintOrColorToColor(Props.Get(\"Backg";
__ref._bcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="pcolor = xui.PaintOrColorToColor(Props.Get(\"Progr";
__ref._pcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ProgressColor")));
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="thickness = DipToCurrent(Props.Get(\"Thickness\"))";
__ref._thickness /*float*/  = (float) (__c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("Thickness"))))));
RDebugUtils.currentLine=5308422;
 //BA.debugLineNum = 5308422;BA.debugLine="vertical = Props.Get(\"Orientation\") = \"Vertical\"";
__ref._vertical /*boolean*/  = (_props.Get((Object)("Orientation"))).equals((Object)("Vertical"));
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=5308425;
 //BA.debugLineNum = 5308425;BA.debugLine="End Sub";
return "";
}
public float  _getprogress(b4a.example.ef.b4xprogressbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "getprogress", false))
	 {return ((Float) Debug.delegate(ba, "getprogress", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub getProgress As Float";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Return currentValue";
if (true) return __ref._currentvalue /*float*/ ;
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return 0f;
}
public String  _initialize(b4a.example.ef.b4xprogressbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xprogressbar";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="End Sub";
return "";
}
}