package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class swiftbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.swiftbutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.swiftbutton.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
public int _clr1 = 0;
public int _clr2 = 0;
public int _disabledcolor = 0;
public boolean _pressed = false;
public Object _tag = null;
public boolean _mdisabled = false;
public int _cornersradius = 0;
public int _sideheight = 0;
public boolean _mhaptic = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _setenabled(b4a.example.ef.swiftbutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=83165184;
 //BA.debugLineNum = 83165184;BA.debugLine="Public Sub setEnabled(b As Boolean)";
RDebugUtils.currentLine=83165185;
 //BA.debugLineNum = 83165185;BA.debugLine="mDisabled = Not(b)";
__ref._mdisabled /*boolean*/  = __c.Not(_b);
RDebugUtils.currentLine=83165186;
 //BA.debugLineNum = 83165186;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=83165187;
 //BA.debugLineNum = 83165187;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=83165188;
 //BA.debugLineNum = 83165188;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.swiftbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
RDebugUtils.currentLine=83034112;
 //BA.debugLineNum = 83034112;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=83034113;
 //BA.debugLineNum = 83034113;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=83034114;
 //BA.debugLineNum = 83034114;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=83034115;
 //BA.debugLineNum = 83034115;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
_v.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 }
};
RDebugUtils.currentLine=83034117;
 //BA.debugLineNum = 83034117;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=83034118;
 //BA.debugLineNum = 83034118;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.example.ef.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int _c = 0;
RDebugUtils.currentLine=83492864;
 //BA.debugLineNum = 83492864;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=83492865;
 //BA.debugLineNum = 83492865;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=83492866;
 //BA.debugLineNum = 83492866;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=83492867;
 //BA.debugLineNum = 83492867;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=83492868;
 //BA.debugLineNum = 83492868;BA.debugLine="r.Initialize(0, SideHeight, mBase.Width, mBase.He";
_r.Initialize((float) (0),(float) (__ref._sideheight /*int*/ ),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=83492869;
 //BA.debugLineNum = 83492869;BA.debugLine="If pressed = False Then";
if (__ref._pressed /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=83492870;
 //BA.debugLineNum = 83492870;BA.debugLine="xLBL.Top = 0";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=83492871;
 //BA.debugLineNum = 83492871;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=83492872;
 //BA.debugLineNum = 83492872;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr2 /*int*/ ,__c.True,(float) (0));
RDebugUtils.currentLine=83492873;
 //BA.debugLineNum = 83492873;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - S";
_r.Initialize((float) (0),(float) (0),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._sideheight /*int*/ ));
RDebugUtils.currentLine=83492874;
 //BA.debugLineNum = 83492874;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=83492875;
 //BA.debugLineNum = 83492875;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,__ref._clr1 /*int*/ ,__c.True,(float) (0));
 }else {
RDebugUtils.currentLine=83492877;
 //BA.debugLineNum = 83492877;BA.debugLine="xLBL.Top = SideHeight";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop(__ref._sideheight /*int*/ );
RDebugUtils.currentLine=83492878;
 //BA.debugLineNum = 83492878;BA.debugLine="p.InitializeRoundedRect(r, CornersRadius)";
_p.InitializeRoundedRect(_r,(float) (__ref._cornersradius /*int*/ ));
RDebugUtils.currentLine=83492879;
 //BA.debugLineNum = 83492879;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=83492880;
 //BA.debugLineNum = 83492880;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (__ref._mdisabled /*boolean*/ ) { 
_c = __ref._disabledcolor /*int*/ ;}
else {
_c = __ref._clr1 /*int*/ ;};
RDebugUtils.currentLine=83492881;
 //BA.debugLineNum = 83492881;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_c,__c.True,(float) (0));
 };
RDebugUtils.currentLine=83492884;
 //BA.debugLineNum = 83492884;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=83492885;
 //BA.debugLineNum = 83492885;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
RDebugUtils.currentLine=82837504;
 //BA.debugLineNum = 82837504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=82837505;
 //BA.debugLineNum = 82837505;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=82837506;
 //BA.debugLineNum = 82837506;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=82837507;
 //BA.debugLineNum = 82837507;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=82837508;
 //BA.debugLineNum = 82837508;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=82837509;
 //BA.debugLineNum = 82837509;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=82837510;
 //BA.debugLineNum = 82837510;BA.debugLine="Public xLBL As B4XView";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=82837511;
 //BA.debugLineNum = 82837511;BA.debugLine="Public clr1, clr2, disabledColor As Int";
_clr1 = 0;
_clr2 = 0;
_disabledcolor = 0;
RDebugUtils.currentLine=82837512;
 //BA.debugLineNum = 82837512;BA.debugLine="Private pressed As Boolean";
_pressed = false;
RDebugUtils.currentLine=82837513;
 //BA.debugLineNum = 82837513;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=82837514;
 //BA.debugLineNum = 82837514;BA.debugLine="Private mDisabled As Boolean";
_mdisabled = false;
RDebugUtils.currentLine=82837515;
 //BA.debugLineNum = 82837515;BA.debugLine="Public CornersRadius, SideHeight As Int";
_cornersradius = 0;
_sideheight = 0;
RDebugUtils.currentLine=82837516;
 //BA.debugLineNum = 82837516;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=82837517;
 //BA.debugLineNum = 82837517;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.swiftbutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=82968576;
 //BA.debugLineNum = 82968576;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=82968577;
 //BA.debugLineNum = 82968577;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=82968578;
 //BA.debugLineNum = 82968578;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=82968578;
 //BA.debugLineNum = 82968578;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=82968579;
 //BA.debugLineNum = 82968579;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"p");
RDebugUtils.currentLine=82968580;
 //BA.debugLineNum = 82968580;BA.debugLine="p.Color = xui.Color_Transparent";
_p.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=82968581;
 //BA.debugLineNum = 82968581;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
__ref._clr1 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("PrimaryColor")));
RDebugUtils.currentLine=82968582;
 //BA.debugLineNum = 82968582;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
__ref._clr2 /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SecondaryColor")));
RDebugUtils.currentLine=82968583;
 //BA.debugLineNum = 82968583;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
__ref._disabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("DisabledColor"),(Object)(((int)0xff999999))));
RDebugUtils.currentLine=82968584;
 //BA.debugLineNum = 82968584;BA.debugLine="CornersRadius = DipToCurrent(Props.GetDefault(\"Co";
__ref._cornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(15)))));
RDebugUtils.currentLine=82968585;
 //BA.debugLineNum = 82968585;BA.debugLine="SideHeight = DipToCurrent(Props.GetDefault(\"SideH";
__ref._sideheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("SideHeight"),(Object)(5)))));
RDebugUtils.currentLine=82968586;
 //BA.debugLineNum = 82968586;BA.debugLine="mDisabled = Not(Props.GetDefault(\"ButtonEnabled\",";
__ref._mdisabled /*boolean*/  = __c.Not(BA.ObjectToBoolean(_props.GetDefault((Object)("ButtonEnabled"),(Object)(__c.True))));
RDebugUtils.currentLine=82968587;
 //BA.debugLineNum = 82968587;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=82968588;
 //BA.debugLineNum = 82968588;BA.debugLine="pressed = mDisabled";
__ref._pressed /*boolean*/  = __ref._mdisabled /*boolean*/ ;
RDebugUtils.currentLine=82968589;
 //BA.debugLineNum = 82968589;BA.debugLine="xLBL = Lbl";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=82968590;
 //BA.debugLineNum = 82968590;BA.debugLine="xLBL.Visible = True";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=82968591;
 //BA.debugLineNum = 82968591;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=82968592;
 //BA.debugLineNum = 82968592;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=82968593;
 //BA.debugLineNum = 82968593;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
__ref._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=82968594;
 //BA.debugLineNum = 82968594;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=82968595;
 //BA.debugLineNum = 82968595;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=82968596;
 //BA.debugLineNum = 82968596;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4a.example.ef.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=83099648;
 //BA.debugLineNum = 83099648;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=83099649;
 //BA.debugLineNum = 83099649;BA.debugLine="Return Not(mDisabled)";
if (true) return __c.Not(__ref._mdisabled /*boolean*/ );
RDebugUtils.currentLine=83099650;
 //BA.debugLineNum = 83099650;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.ef.swiftbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=82903040;
 //BA.debugLineNum = 82903040;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=82903041;
 //BA.debugLineNum = 82903041;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=82903042;
 //BA.debugLineNum = 82903042;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=82903043;
 //BA.debugLineNum = 82903043;BA.debugLine="End Sub";
return "";
}
public String  _p_touch(b4a.example.ef.swiftbutton __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "p_touch", true))
	 {return ((String) Debug.delegate(ba, "p_touch", new Object[] {_action,_x,_y}));}
boolean _inside = false;
RDebugUtils.currentLine=83230720;
 //BA.debugLineNum = 83230720;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
RDebugUtils.currentLine=83230721;
 //BA.debugLineNum = 83230721;BA.debugLine="If mDisabled Then Return";
if (__ref._mdisabled /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=83230722;
 //BA.debugLineNum = 83230722;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth() && _y>0 && _y<__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=83230723;
 //BA.debugLineNum = 83230723;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP,(int) (3))) {
case 0: {
RDebugUtils.currentLine=83230725;
 //BA.debugLineNum = 83230725;BA.debugLine="SetPressedState(True)";
__ref._setpressedstate /*String*/ (null,__c.True);
RDebugUtils.currentLine=83230726;
 //BA.debugLineNum = 83230726;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
case 1: {
RDebugUtils.currentLine=83230728;
 //BA.debugLineNum = 83230728;BA.debugLine="If pressed <> Inside Then";
if (__ref._pressed /*boolean*/ !=_inside) { 
RDebugUtils.currentLine=83230729;
 //BA.debugLineNum = 83230729;BA.debugLine="SetPressedState(Inside)";
__ref._setpressedstate /*String*/ (null,_inside);
RDebugUtils.currentLine=83230730;
 //BA.debugLineNum = 83230730;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 };
 break; }
case 2: 
case 3: {
RDebugUtils.currentLine=83230733;
 //BA.debugLineNum = 83230733;BA.debugLine="SetPressedState(False)";
__ref._setpressedstate /*String*/ (null,__c.False);
RDebugUtils.currentLine=83230734;
 //BA.debugLineNum = 83230734;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=83230735;
 //BA.debugLineNum = 83230735;BA.debugLine="If Inside Then";
if (_inside) { 
RDebugUtils.currentLine=83230736;
 //BA.debugLineNum = 83230736;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=83230737;
 //BA.debugLineNum = 83230737;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Click");
 };
 break; }
}
;
RDebugUtils.currentLine=83230740;
 //BA.debugLineNum = 83230740;BA.debugLine="End Sub";
return "";
}
public String  _setpressedstate(b4a.example.ef.swiftbutton __ref,boolean _newstate) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setpressedstate", true))
	 {return ((String) Debug.delegate(ba, "setpressedstate", new Object[] {_newstate}));}
RDebugUtils.currentLine=83296256;
 //BA.debugLineNum = 83296256;BA.debugLine="Private Sub SetPressedState(NewState As Boolean)";
RDebugUtils.currentLine=83296257;
 //BA.debugLineNum = 83296257;BA.debugLine="If pressed = NewState Then Return";
if (__ref._pressed /*boolean*/ ==_newstate) { 
if (true) return "";};
RDebugUtils.currentLine=83296258;
 //BA.debugLineNum = 83296258;BA.debugLine="If NewState And xui.SubExists(mCallBack, mEventNa";
if (_newstate && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown",(int) (0))) { 
RDebugUtils.currentLine=83296259;
 //BA.debugLineNum = 83296259;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonD";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonDown");
 };
RDebugUtils.currentLine=83296261;
 //BA.debugLineNum = 83296261;BA.debugLine="If NewState = False And xui.SubExists(mCallBack,";
if (_newstate==__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp",(int) (0))) { 
RDebugUtils.currentLine=83296262;
 //BA.debugLineNum = 83296262;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_ButtonU";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ButtonUp");
 };
RDebugUtils.currentLine=83296264;
 //BA.debugLineNum = 83296264;BA.debugLine="pressed= NewState";
__ref._pressed /*boolean*/  = _newstate;
RDebugUtils.currentLine=83296265;
 //BA.debugLineNum = 83296265;BA.debugLine="End Sub";
return "";
}
public String  _setcolors(b4a.example.ef.swiftbutton __ref,int _primary,int _secondary) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "setcolors", true))
	 {return ((String) Debug.delegate(ba, "setcolors", new Object[] {_primary,_secondary}));}
RDebugUtils.currentLine=83361792;
 //BA.debugLineNum = 83361792;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
RDebugUtils.currentLine=83361793;
 //BA.debugLineNum = 83361793;BA.debugLine="clr1 = Primary";
__ref._clr1 /*int*/  = _primary;
RDebugUtils.currentLine=83361794;
 //BA.debugLineNum = 83361794;BA.debugLine="clr2 = Secondary";
__ref._clr2 /*int*/  = _secondary;
RDebugUtils.currentLine=83361795;
 //BA.debugLineNum = 83361795;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=83361796;
 //BA.debugLineNum = 83361796;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.ef.swiftbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="swiftbutton";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=83427328;
 //BA.debugLineNum = 83427328;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=83427329;
 //BA.debugLineNum = 83427329;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=83427330;
 //BA.debugLineNum = 83427330;BA.debugLine="End Sub";
return "";
}
}