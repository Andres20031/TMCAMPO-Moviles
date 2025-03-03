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
RDebugUtils.currentLine=61341696;
 //BA.debugLineNum = 61341696;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=61341697;
 //BA.debugLineNum = 61341697;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=61341698;
 //BA.debugLineNum = 61341698;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=61341699;
 //BA.debugLineNum = 61341699;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref._vertical /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()>__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth();
RDebugUtils.currentLine=61341700;
 //BA.debugLineNum = 61341700;BA.debugLine="size = Max(mBase.Height, mBase.Width) - 2 * Radiu";
__ref._size /*int*/  = (int) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-2*__ref._radius2 /*int*/ );
RDebugUtils.currentLine=61341701;
 //BA.debugLineNum = 61341701;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=61341702;
 //BA.debugLineNum = 61341702;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=61407232;
 //BA.debugLineNum = 61407232;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=61407234;
 //BA.debugLineNum = 61407234;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=61407235;
 //BA.debugLineNum = 61407235;BA.debugLine="If size > 0 Then";
if (__ref._size /*int*/ >0) { 
RDebugUtils.currentLine=61407236;
 //BA.debugLineNum = 61407236;BA.debugLine="If Vertical = False Then";
if (__ref._vertical /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=61407237;
 //BA.debugLineNum = 61407237;BA.debugLine="Dim s1 As Int = Radius2 + (mValue - MinValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._mvalue /*int*/ -__ref._minvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=61407238;
 //BA.debugLineNum = 61407238;BA.debugLine="Dim y As Int = mBase.Height / 2";
_y = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2);
RDebugUtils.currentLine=61407239;
 //BA.debugLineNum = 61407239;BA.debugLine="cvs.DrawLine(Radius2, y, s1, y, Color1, Size1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (__ref._radius2 /*int*/ ),(float) (_y),(float) (_s1),(float) (_y),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=61407240;
 //BA.debugLineNum = 61407240;BA.debugLine="cvs.DrawLine(s1, y, mBase.Width - Radius2, y, C";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_s1),(float) (_y),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._radius2 /*int*/ ),(float) (_y),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=61407241;
 //BA.debugLineNum = 61407241;BA.debugLine="cvs.DrawCircle(s1, y, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=61407242;
 //BA.debugLineNum = 61407242;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=61407243;
 //BA.debugLineNum = 61407243;BA.debugLine="cvs.DrawCircle(s1, y, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_s1),(float) (_y),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 }else {
RDebugUtils.currentLine=61407246;
 //BA.debugLineNum = 61407246;BA.debugLine="Dim s1 As Int = Radius2 + (MaxValue - mValue) /";
_s1 = (int) (__ref._radius2 /*int*/ +(__ref._maxvalue /*int*/ -__ref._mvalue /*int*/ )/(double)(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )*__ref._size /*int*/ );
RDebugUtils.currentLine=61407247;
 //BA.debugLineNum = 61407247;BA.debugLine="Dim x As Int = mBase.Width / 2";
_x = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2);
RDebugUtils.currentLine=61407248;
 //BA.debugLineNum = 61407248;BA.debugLine="cvs.DrawLine(x, Radius2, x, s1, Color2, Size2)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (__ref._radius2 /*int*/ ),(float) (_x),(float) (_s1),__ref._color2 /*int*/ ,(float) (__ref._size2 /*int*/ ));
RDebugUtils.currentLine=61407249;
 //BA.debugLineNum = 61407249;BA.debugLine="cvs.DrawLine(x, s1, x, mBase.Height - Radius2,";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawLine((float) (_x),(float) (_s1),(float) (_x),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ ),__ref._color1 /*int*/ ,(float) (__ref._size1 /*int*/ ));
RDebugUtils.currentLine=61407250;
 //BA.debugLineNum = 61407250;BA.debugLine="cvs.DrawCircle(x, s1, Radius1, Color1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius1 /*int*/ ),__ref._color1 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=61407251;
 //BA.debugLineNum = 61407251;BA.debugLine="If Pressed Then";
if (__ref._pressed /*boolean*/ ) { 
RDebugUtils.currentLine=61407252;
 //BA.debugLineNum = 61407252;BA.debugLine="cvs.DrawCircle(x, s1, Radius2, ThumbColor, Tru";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (_x),(float) (_s1),(float) (__ref._radius2 /*int*/ ),__ref._thumbcolor /*int*/ ,__c.True,(float) (0));
 };
 };
 };
RDebugUtils.currentLine=61407256;
 //BA.debugLineNum = 61407256;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=61407257;
 //BA.debugLineNum = 61407257;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
RDebugUtils.currentLine=61145088;
 //BA.debugLineNum = 61145088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=61145089;
 //BA.debugLineNum = 61145089;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=61145090;
 //BA.debugLineNum = 61145090;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=61145091;
 //BA.debugLineNum = 61145091;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61145092;
 //BA.debugLineNum = 61145092;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=61145093;
 //BA.debugLineNum = 61145093;BA.debugLine="Public Color1, Color2, ThumbColor As Int";
_color1 = 0;
_color2 = 0;
_thumbcolor = 0;
RDebugUtils.currentLine=61145094;
 //BA.debugLineNum = 61145094;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=61145095;
 //BA.debugLineNum = 61145095;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=61145096;
 //BA.debugLineNum = 61145096;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=61145097;
 //BA.debugLineNum = 61145097;BA.debugLine="Private mValue As Int";
_mvalue = 0;
RDebugUtils.currentLine=61145098;
 //BA.debugLineNum = 61145098;BA.debugLine="Public MinValue, MaxValue As Int";
_minvalue = 0;
_maxvalue = 0;
RDebugUtils.currentLine=61145099;
 //BA.debugLineNum = 61145099;BA.debugLine="Public Interval As Int = 1";
_interval = (int) (1);
RDebugUtils.currentLine=61145100;
 //BA.debugLineNum = 61145100;BA.debugLine="Private Vertical As Boolean";
_vertical = false;
RDebugUtils.currentLine=61145101;
 //BA.debugLineNum = 61145101;BA.debugLine="Public Size1 = 4dip, Size2 = 2dip, Radius1 = 6dip";
_size1 = __c.DipToCurrent((int) (4));
_size2 = __c.DipToCurrent((int) (2));
_radius1 = __c.DipToCurrent((int) (6));
_radius2 = __c.DipToCurrent((int) (12));
RDebugUtils.currentLine=61145102;
 //BA.debugLineNum = 61145102;BA.debugLine="Private Pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=61145103;
 //BA.debugLineNum = 61145103;BA.debugLine="Private size As Int";
_size = 0;
RDebugUtils.currentLine=61145104;
 //BA.debugLineNum = 61145104;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4xseekbar __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=61276160;
 //BA.debugLineNum = 61276160;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=61276161;
 //BA.debugLineNum = 61276161;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=61276163;
 //BA.debugLineNum = 61276163;BA.debugLine="Color1 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color1")));
RDebugUtils.currentLine=61276164;
 //BA.debugLineNum = 61276164;BA.debugLine="Color2 = xui.PaintOrColorToColor(Props.Get(\"Color";
__ref._color2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("Color2")));
RDebugUtils.currentLine=61276165;
 //BA.debugLineNum = 61276165;BA.debugLine="ThumbColor = xui.PaintOrColorToColor(Props.Get(\"T";
__ref._thumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor")));
RDebugUtils.currentLine=61276166;
 //BA.debugLineNum = 61276166;BA.debugLine="Interval = Max(1, Props.GetDefault(\"Interval\", 1)";
__ref._interval /*int*/  = (int) (__c.Max(1,(double)(BA.ObjectToNumber(_props.GetDefault((Object)("Interval"),(Object)(1))))));
RDebugUtils.currentLine=61276167;
 //BA.debugLineNum = 61276167;BA.debugLine="MinValue = Props.Get(\"Min\")";
__ref._minvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Min"))));
RDebugUtils.currentLine=61276168;
 //BA.debugLineNum = 61276168;BA.debugLine="MaxValue = Props.Get(\"Max\")";
__ref._maxvalue /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Max"))));
RDebugUtils.currentLine=61276169;
 //BA.debugLineNum = 61276169;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, Props.Get(\"V";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,(double)(BA.ObjectToNumber(_props.Get((Object)("Value")))))));
RDebugUtils.currentLine=61276170;
 //BA.debugLineNum = 61276170;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=61276171;
 //BA.debugLineNum = 61276171;BA.debugLine="TouchPanel = xui.CreatePanel(\"TouchPanel\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"TouchPanel");
RDebugUtils.currentLine=61276172;
 //BA.debugLineNum = 61276172;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=61276173;
 //BA.debugLineNum = 61276173;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then Radius2 = 20dip";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() || __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
__ref._radius2 /*int*/  = __c.DipToCurrent((int) (20));};
RDebugUtils.currentLine=61276174;
 //BA.debugLineNum = 61276174;BA.debugLine="If xui.IsB4A Then Base_Resize(mBase.Width, mBase.";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());};
RDebugUtils.currentLine=61276175;
 //BA.debugLineNum = 61276175;BA.debugLine="End Sub";
return "";
}
public int  _getvalue(b4a.example.ef.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Integer) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=61734912;
 //BA.debugLineNum = 61734912;BA.debugLine="Public Sub getValue As Int";
RDebugUtils.currentLine=61734913;
 //BA.debugLineNum = 61734913;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*int*/ ;
RDebugUtils.currentLine=61734914;
 //BA.debugLineNum = 61734914;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(b4a.example.ef.b4xseekbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=61210624;
 //BA.debugLineNum = 61210624;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=61210625;
 //BA.debugLineNum = 61210625;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=61210626;
 //BA.debugLineNum = 61210626;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=61210627;
 //BA.debugLineNum = 61210627;BA.debugLine="End Sub";
return "";
}
public String  _raisetouchstateevent(b4a.example.ef.b4xseekbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "raisetouchstateevent", true))
	 {return ((String) Debug.delegate(ba, "raisetouchstateevent", null));}
RDebugUtils.currentLine=61538304;
 //BA.debugLineNum = 61538304;BA.debugLine="Private Sub RaiseTouchStateEvent";
RDebugUtils.currentLine=61538305;
 //BA.debugLineNum = 61538305;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchS";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(int) (1))) { 
RDebugUtils.currentLine=61538306;
 //BA.debugLineNum = 61538306;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_TouchS";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchStateChanged",(Object)(__ref._pressed /*boolean*/ ));
 };
RDebugUtils.currentLine=61538308;
 //BA.debugLineNum = 61538308;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.b4xseekbar __ref,int _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=61669376;
 //BA.debugLineNum = 61669376;BA.debugLine="Public Sub setValue(v As Int)";
RDebugUtils.currentLine=61669377;
 //BA.debugLineNum = 61669377;BA.debugLine="mValue = Max(MinValue, Min(MaxValue, v))";
__ref._mvalue /*int*/  = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=61669378;
 //BA.debugLineNum = 61669378;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=61669379;
 //BA.debugLineNum = 61669379;BA.debugLine="End Sub";
return "";
}
public String  _setvaluebasedontouch(b4a.example.ef.b4xseekbar __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "setvaluebasedontouch", true))
	 {return ((String) Debug.delegate(ba, "setvaluebasedontouch", new Object[] {_x,_y}));}
int _v = 0;
int _newvalue = 0;
RDebugUtils.currentLine=61603840;
 //BA.debugLineNum = 61603840;BA.debugLine="Private Sub SetValueBasedOnTouch(x As Int, y As In";
RDebugUtils.currentLine=61603841;
 //BA.debugLineNum = 61603841;BA.debugLine="Dim v As Int";
_v = 0;
RDebugUtils.currentLine=61603842;
 //BA.debugLineNum = 61603842;BA.debugLine="If Vertical Then";
if (__ref._vertical /*boolean*/ ) { 
RDebugUtils.currentLine=61603843;
 //BA.debugLineNum = 61603843;BA.debugLine="v = (mBase.Height - Radius2 - y) / size * (MaxVa";
_v = (int) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._radius2 /*int*/ -_y)/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 }else {
RDebugUtils.currentLine=61603845;
 //BA.debugLineNum = 61603845;BA.debugLine="v = (x - Radius2) / size * (MaxValue - MinValue)";
_v = (int) ((_x-__ref._radius2 /*int*/ )/(double)__ref._size /*int*/ *(__ref._maxvalue /*int*/ -__ref._minvalue /*int*/ )+__ref._minvalue /*int*/ );
 };
RDebugUtils.currentLine=61603847;
 //BA.debugLineNum = 61603847;BA.debugLine="v = Round (v / Interval) * Interval";
_v = (int) (__c.Round(_v/(double)__ref._interval /*int*/ )*__ref._interval /*int*/ );
RDebugUtils.currentLine=61603848;
 //BA.debugLineNum = 61603848;BA.debugLine="Dim NewValue As Int = Max(MinValue, Min(MaxValue,";
_newvalue = (int) (__c.Max(__ref._minvalue /*int*/ ,__c.Min(__ref._maxvalue /*int*/ ,_v)));
RDebugUtils.currentLine=61603849;
 //BA.debugLineNum = 61603849;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref._mvalue /*int*/ ) { 
RDebugUtils.currentLine=61603850;
 //BA.debugLineNum = 61603850;BA.debugLine="mValue = NewValue";
__ref._mvalue /*int*/  = _newvalue;
RDebugUtils.currentLine=61603851;
 //BA.debugLineNum = 61603851;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=61603852;
 //BA.debugLineNum = 61603852;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*int*/ ));
 };
 };
RDebugUtils.currentLine=61603855;
 //BA.debugLineNum = 61603855;BA.debugLine="End Sub";
return "";
}
public String  _touchpanel_touch(b4a.example.ef.b4xseekbar __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xseekbar";
if (Debug.shouldDelegate(ba, "touchpanel_touch", true))
	 {return ((String) Debug.delegate(ba, "touchpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=61472768;
 //BA.debugLineNum = 61472768;BA.debugLine="Private Sub TouchPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=61472769;
 //BA.debugLineNum = 61472769;BA.debugLine="If Action = TouchPanel.TOUCH_ACTION_DOWN Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN) { 
RDebugUtils.currentLine=61472770;
 //BA.debugLineNum = 61472770;BA.debugLine="Pressed = True";
__ref._pressed /*boolean*/  = __c.True;
RDebugUtils.currentLine=61472771;
 //BA.debugLineNum = 61472771;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
RDebugUtils.currentLine=61472772;
 //BA.debugLineNum = 61472772;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=61472773;
 //BA.debugLineNum = 61472773;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_MOVE The";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE) { 
RDebugUtils.currentLine=61472774;
 //BA.debugLineNum = 61472774;BA.debugLine="SetValueBasedOnTouch(X, Y)";
__ref._setvaluebasedontouch /*String*/ (null,(int) (_x),(int) (_y));
 }else 
{RDebugUtils.currentLine=61472775;
 //BA.debugLineNum = 61472775;BA.debugLine="Else If Action = TouchPanel.TOUCH_ACTION_UP Then";
if (_action==__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP) { 
RDebugUtils.currentLine=61472776;
 //BA.debugLineNum = 61472776;BA.debugLine="Pressed = False";
__ref._pressed /*boolean*/  = __c.False;
RDebugUtils.currentLine=61472777;
 //BA.debugLineNum = 61472777;BA.debugLine="RaiseTouchStateEvent";
__ref._raisetouchstateevent /*String*/ (null);
 }}}
;
RDebugUtils.currentLine=61472779;
 //BA.debugLineNum = 61472779;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=61472780;
 //BA.debugLineNum = 61472780;BA.debugLine="End Sub";
return "";
}
}