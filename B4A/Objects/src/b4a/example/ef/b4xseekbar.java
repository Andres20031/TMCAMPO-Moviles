package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xseekbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xseekbar");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xseekbar.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _color1 = 0;
public int _color2 = 0;
public int _thumbcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _mvalue = 0;
public int _minvalue = 0;
public int _maxvalue = 0;
public int _interval = 0;
public boolean _vertical = false;
public int _size1 = 0;
public int _size2 = 0;
public int _radius1 = 0;
public int _radius2 = 0;
public boolean _pressed = false;
public int _size = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.ef.b4xseekbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=76677120;
 //BA.debugLineNum = 76677120;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=76677121;
 //BA.debugLineNum = 76677121;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=76677122;
 //BA.debugLineNum = 76677122;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=76677123;
 //BA.debugLineNum = 76677123;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=76677124;
 //BA.debugLineNum = 76677124;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref._size /*int*/  = (int) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-2*__ref._radius2 /*int*/ );
RDebugUtils.currentLine=76677125;
 //BA.debugLineNum = 76677125;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=76677126;
 //BA.debugLineNum = 76677126;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.ef.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
int _s1 = 0;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=76742656;
 //BA.debugLineNum = 76742656;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=76742658;
 //BA.debugLineNum = 76742658;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=76742659;
 //BA.debugLineNum = 76742659;BA.debugLine="If size > 0 Then";
if (__ref._size /*int*/ >0) { 
RDebugUtils.currentLine=76742660;
 //BA.debugLineNum = 76742660;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=76742661;
 //BA.debugLineNum = 76742661;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=76742662;
 //BA.debugLineNum = 76742662;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=76742663;
 //BA.debugLineNum = 76742663;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._radius2 /*int*/ ),(float) (_y),(float) (_s1),(float) (_y),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=76742664;
 //BA.debugLineNum = 76742664;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_s1),(float) (_y),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ ),(float) (_y),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=76742665;
 //BA.debugLineNum = 76742665;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=76742666;
 //BA.debugLineNum = 76742666;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=76742667;
 //BA.debugLineNum = 76742667;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 }else {
RDebugUtils.currentLine=76742670;
 //BA.debugLineNum = 76742670;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._maxvalue /*int*/ -__ref._mvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=76742671;
 //BA.debugLineNum = 76742671;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=76742672;
 //BA.debugLineNum = 76742672;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (__ref._radius2 /*int*/ ),(float) (_x),(float) (_s1),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=76742673;
 //BA.debugLineNum = 76742673;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ ),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=76742674;
 //BA.debugLineNum = 76742674;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=76742675;
 //BA.debugLineNum = 76742675;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=76742676;
 //BA.debugLineNum = 76742676;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 };
 };
RDebugUtils.currentLine=76742680;
 //BA.debugLineNum = 76742680;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=76742681;
 //BA.debugLineNum = 76742681;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
RDebugUtils.currentLine=76480512;
 //BA.debugLineNum = 76480512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=76480513;
 //BA.debugLineNum = 76480513;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=76480514;
 //BA.debugLineNum = 76480514;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=76480515;
 //BA.debugLineNum = 76480515;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=76480516;
 //BA.debugLineNum = 76480516;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=76480517;
 //BA.debugLineNum = 76480517;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
_color1 = 0;
_color2 = 0;
_thumbcolor = 0;
RDebugUtils.currentLine=76480518;
 //BA.debugLineNum = 76480518;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=76480519;
 //BA.debugLineNum = 76480519;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=76480520;
 //BA.debugLineNum = 76480520;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=76480521;
 //BA.debugLineNum = 76480521;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=76480522;
 //BA.debugLineNum = 76480522;BA.debugLine="Public MinValue, MaxValue As Int";
_minvalue = 0;
_maxvalue = 0;
RDebugUtils.currentLine=76480523;
 //BA.debugLineNum = 76480523;BA.debugLine="Public Interval As Int = 1";
_interval = (int) (1);
RDebugUtils.currentLine=76480524;
 //BA.debugLineNum = 76480524;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=76480525;
 //BA.debugLineNum = 76480525;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
_size1 = __c.DipToCurrent((int) (4));
_size2 = __c.DipToCurrent((int) (2));
_radius1 = __c.DipToCurrent((int) (6));
_radius2 = __c.DipToCurrent((int) (12));
RDebugUtils.currentLine=76480526;
 //BA.debugLineNum = 76480526;BA.debugLine="Private Pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=76480527;
 //BA.debugLineNum = 76480527;BA.debugLine="Private size As Int";
_size = 0;
RDebugUtils.currentLine=76480528;
 //BA.debugLineNum = 76480528;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4xseekbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=76611584;
 //BA.debugLineNum = 76611584;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=76611585;
 //BA.debugLineNum = 76611585;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=76611586;
 //BA.debugLineNum = 76611586;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=76611586;
 //BA.debugLineNum = 76611586;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=76611587;
 //BA.debugLineNum = 76611587;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color1")));
RDebugUtils.currentLine=76611588;
 //BA.debugLineNum = 76611588;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color2")));
RDebugUtils.currentLine=76611589;
 //BA.debugLineNum = 76611589;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
__ref._thumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
RDebugUtils.currentLine=76611590;
 //BA.debugLineNum = 76611590;BA.debugLine="Interval = Max(1, Props.GetDefault(\"Interval\", 1)";
__ref._interval /*int*/  = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_props.GetDefault((Object)("Interval"),(Object)(1))))));
RDebugUtils.currentLine=76611591;
 //BA.debugLineNum = 76611591;BA.debugLine="MinValue = Props.Get(\"Min\")";
__ref._minvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=76611592;
 //BA.debugLineNum = 76611592;BA.debugLine="MaxValue = Props.Get(\"Max\")";
__ref._maxvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=76611593;
 //BA.debugLineNum = 76611593;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,(double)(BA.ObjectToNumber(_props.Get((Object)("Value")))))));
RDebugUtils.currentLine=76611594;
 //BA.debugLineNum = 76611594;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=76611595;
 //BA.debugLineNum = 76611595;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
RDebugUtils.currentLine=76611596;
 //BA.debugLineNum = 76611596;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=76611597;
 //BA.debugLineNum = 76611597;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
__ref._radius2 /*int*/  = __c.DipToCurrent((int) (20));};
RDebugUtils.currentLine=76611598;
 //BA.debugLineNum = 76611598;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=76611599;
 //BA.debugLineNum = 76611599;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.example.ef.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=77070336;
 //BA.debugLineNum = 77070336;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=77070337;
 //BA.debugLineNum = 77070337;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=77070338;
 //BA.debugLineNum = 77070338;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xseekbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=76546048;
 //BA.debugLineNum = 76546048;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=76546049;
 //BA.debugLineNum = 76546049;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=76546051;
 //BA.debugLineNum = 76546051;BA.debugLine="End Sub";
return "";
}
public String  _raisetouchstateevent(b4a.example.ef.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "raisetouchstateevent", true))
	 {return ((String) Debug.delegate(ba, "raisetouchstateevent", null));}
RDebugUtils.currentLine=76873728;
 //BA.debugLineNum = 76873728;BA.debugLine="Private Sub RaiseTouchStateEvent";
RDebugUtils.currentLine=76873729;
 //BA.debugLineNum = 76873729;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(int) (1))) { 
RDebugUtils.currentLine=76873730;
 //BA.debugLineNum = 76873730;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(Object)(__ref._pressed /*boolean*/ ));
 };
RDebugUtils.currentLine=76873732;
 //BA.debugLineNum = 76873732;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.b4xseekbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=77004800;
 //BA.debugLineNum = 77004800;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=77004801;
 //BA.debugLineNum = 77004801;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=77004802;
 //BA.debugLineNum = 77004802;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=77004803;
 //BA.debugLineNum = 77004803;BA.debugLine="End Sub";
return "";
}
public String  _setvaluebasedontouch(b4a.example.ef.b4xseekbar __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "setvaluebasedontouch", true))
	 {return ((String) Debug.delegate(ba, "setvaluebasedontouch", new Object[] {_x,_y}));}
int _v = 0;
int _newvalue = 0;
RDebugUtils.currentLine=76939264;
 //BA.debugLineNum = 76939264;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="Dim v As Int";
_v = 0;
RDebugUtils.currentLine=76939266;
 //BA.debugLineNum = 76939266;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=76939267;
 //BA.debugLineNum = 76939267;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ -_y)/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 }else {
RDebugUtils.currentLine=76939269;
 //BA.debugLineNum = 76939269;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-__ref._radius2 /*int*/ )/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 };
RDebugUtils.currentLine=76939271;
 //BA.debugLineNum = 76939271;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)__ref._interval /*int*/ )*__ref._interval /*int*/ );
RDebugUtils.currentLine=76939272;
 //BA.debugLineNum = 76939272;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=76939273;
 //BA.debugLineNum = 76939273;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=76939274;
 //BA.debugLineNum = 76939274;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=76939275;
 //BA.debugLineNum = 76939275;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=76939276;
 //BA.debugLineNum = 76939276;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=76939279;
 //BA.debugLineNum = 76939279;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4a.example.ef.b4xseekbar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "touchpanel_touch", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=76808192;
 //BA.debugLineNum = 76808192;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=76808193;
 //BA.debugLineNum = 76808193;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=76808194;
 //BA.debugLineNum = 76808194;BA.debugLine="Pressed = True";
__ref._pressed /*boolean*/  = __c.True;
RDebugUtils.currentLine=76808195;
 //BA.debugLineNum = 76808195;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
RDebugUtils.currentLine=76808196;
 //BA.debugLineNum = 76808196;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=76808197;
 //BA.debugLineNum = 76808197;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=76808198;
 //BA.debugLineNum = 76808198;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=76808199;
 //BA.debugLineNum = 76808199;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=76808200;
 //BA.debugLineNum = 76808200;BA.debugLine="Pressed = False";
__ref._pressed /*boolean*/  = __c.False;
RDebugUtils.currentLine=76808201;
 //BA.debugLineNum = 76808201;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }}}
;
RDebugUtils.currentLine=76808203;
 //BA.debugLineNum = 76808203;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=76808204;
 //BA.debugLineNum = 76808204;BA.debugLine="End Sub";
return "";
}
}