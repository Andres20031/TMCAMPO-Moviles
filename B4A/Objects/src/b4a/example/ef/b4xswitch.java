package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xswitch");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xswitch.class).invoke(this, new Object[] {null});
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
public b4a.example.bcpath._bcbrush _oncolor = null;
public b4a.example.bcpath._bcbrush _offcolor = null;
public b4a.example.bitmapcreator _bc = null;
public int _width = 0;
public int _height = 0;
public b4a.example.bcpath._bcbrush _thumbcolor = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
public boolean _mvalue = false;
public b4a.example.bcpath._bcbrush _transparent = null;
public int _loopindex = 0;
public Object _tag = null;
public float _scale = 0f;
public boolean _menabled = false;
public boolean _mhaptic = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.ef.b4xswitch __ref,double _width1,double _height1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width1,_height1}));}
RDebugUtils.currentLine=82903040;
 //BA.debugLineNum = 82903040;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
RDebugUtils.currentLine=82903042;
 //BA.debugLineNum = 82903042;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
RDebugUtils.currentLine=82247680;
 //BA.debugLineNum = 82247680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=82247681;
 //BA.debugLineNum = 82247681;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=82247682;
 //BA.debugLineNum = 82247682;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=82247683;
 //BA.debugLineNum = 82247683;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=82247684;
 //BA.debugLineNum = 82247684;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=82247685;
 //BA.debugLineNum = 82247685;BA.debugLine="Private OnColor, OffColor As BCBrush";
_oncolor = new b4a.example.bcpath._bcbrush();
_offcolor = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=82247686;
 //BA.debugLineNum = 82247686;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=82247687;
 //BA.debugLineNum = 82247687;BA.debugLine="Private Width As Int = 55dip";
_width = __c.DipToCurrent((int) (55));
RDebugUtils.currentLine=82247688;
 //BA.debugLineNum = 82247688;BA.debugLine="Private Height As Int = 31dip";
_height = __c.DipToCurrent((int) (31));
RDebugUtils.currentLine=82247689;
 //BA.debugLineNum = 82247689;BA.debugLine="Private ThumbColor As BCBrush";
_thumbcolor = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=82247690;
 //BA.debugLineNum = 82247690;BA.debugLine="Private iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=82247691;
 //BA.debugLineNum = 82247691;BA.debugLine="Private mValue As Boolean";
_mvalue = false;
RDebugUtils.currentLine=82247692;
 //BA.debugLineNum = 82247692;BA.debugLine="Private transparent As BCBrush";
_transparent = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=82247693;
 //BA.debugLineNum = 82247693;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=82247694;
 //BA.debugLineNum = 82247694;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=82247695;
 //BA.debugLineNum = 82247695;BA.debugLine="Private Scale As Float";
_scale = 0f;
RDebugUtils.currentLine=82247696;
 //BA.debugLineNum = 82247696;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=82247697;
 //BA.debugLineNum = 82247697;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=82247698;
 //BA.debugLineNum = 82247698;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4xswitch __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
RDebugUtils.currentLine=82378752;
 //BA.debugLineNum = 82378752;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=82378753;
 //BA.debugLineNum = 82378753;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=82378754;
 //BA.debugLineNum = 82378754;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=82378754;
 //BA.debugLineNum = 82378754;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=82378755;
 //BA.debugLineNum = 82378755;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop(),__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=82378756;
 //BA.debugLineNum = 82378756;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=82378757;
 //BA.debugLineNum = 82378757;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"pnl\")";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_pnl = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=82378758;
 //BA.debugLineNum = 82378758;BA.debugLine="pnl.Color = xui.Color_Transparent";
_pnl.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=82378759;
 //BA.debugLineNum = 82378759;BA.debugLine="iv.Initialize(\"\")";
__ref._iv /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=82378760;
 //BA.debugLineNum = 82378760;BA.debugLine="mBase.AddView(iv, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=82378761;
 //BA.debugLineNum = 82378761;BA.debugLine="mBase.AddView(pnl, 0, 0, Width, Height)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=82378763;
 //BA.debugLineNum = 82378763;BA.debugLine="bc.Initialize(Width, Height)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,__ref._width /*int*/ ,__ref._height /*int*/ );
RDebugUtils.currentLine=82378764;
 //BA.debugLineNum = 82378764;BA.debugLine="Scale = xui.Scale";
__ref._scale /*float*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=82378769;
 //BA.debugLineNum = 82378769;BA.debugLine="OnColor = bc.CreateBrushFromColor(xui.PaintOrColo";
__ref._oncolor /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OnColor"))));
RDebugUtils.currentLine=82378770;
 //BA.debugLineNum = 82378770;BA.debugLine="OffColor = bc.CreateBrushFromColor(xui.PaintOrCol";
__ref._offcolor /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OffColor"))));
RDebugUtils.currentLine=82378771;
 //BA.debugLineNum = 82378771;BA.debugLine="ThumbColor = bc.CreateBrushFromColor(xui.PaintOrC";
__ref._thumbcolor /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("ThumbColor"))));
RDebugUtils.currentLine=82378772;
 //BA.debugLineNum = 82378772;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=82378773;
 //BA.debugLineNum = 82378773;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
__ref._transparent /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=82378774;
 //BA.debugLineNum = 82378774;BA.debugLine="mEnabled = mBase.Enabled";
__ref._menabled /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=82378775;
 //BA.debugLineNum = 82378775;BA.debugLine="mBase.Enabled = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=82378776;
 //BA.debugLineNum = 82378776;BA.debugLine="SetValueImpl(Props.Get(\"Value\"), True)";
__ref._setvalueimpl /*void*/ (null,BA.ObjectToBoolean(_props.Get((Object)("Value"))),__c.True);
RDebugUtils.currentLine=82378777;
 //BA.debugLineNum = 82378777;BA.debugLine="End Sub";
return "";
}
public void  _setvalueimpl(b4a.example.ef.b4xswitch __ref,boolean _b,boolean _immediate) throws Exception{
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "setvalueimpl", true))
	 {Debug.delegate(ba, "setvalueimpl", new Object[] {_b,_immediate}); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,__ref,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4a.example.ef.b4xswitch parent,b4a.example.ef.b4xswitch __ref,boolean _b,boolean _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
this.__ref = parent;
}
b4a.example.ef.b4xswitch __ref;
b4a.example.ef.b4xswitch parent;
boolean _b;
boolean _immediate;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xswitch";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=82509825;
 //BA.debugLineNum = 82509825;BA.debugLine="mValue = b";
__ref._mvalue /*boolean*/  = _b;
RDebugUtils.currentLine=82509826;
 //BA.debugLineNum = 82509826;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=82509827;
 //BA.debugLineNum = 82509827;BA.debugLine="If Immediate Then";
if (true) break;

case 1:
//if
this.state = 41;
if (_immediate) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=82509828;
 //BA.debugLineNum = 82509828;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 4:
//if
this.state = 11;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 6;
;}
else {
this.state = 8;
;}if (true) break;

case 6:
//C
this.state = 11;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 8:
//C
this.state = 11;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 11:
//C
this.state = 41;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=82509830;
 //BA.debugLineNum = 82509830;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=82509831;
 //BA.debugLineNum = 82509831;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=82509832;
 //BA.debugLineNum = 82509832;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
RDebugUtils.currentLine=82509833;
 //BA.debugLineNum = 82509833;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 14:
//do while
this.state = 29;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=82509834;
 //BA.debugLineNum = 82509834;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
RDebugUtils.currentLine=82509835;
 //BA.debugLineNum = 82509835;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 17:
//if
this.state = 22;
if (__ref._mvalue /*boolean*/ ==parent.__c.False) { 
this.state = 19;
;}if (true) break;

case 19:
//C
this.state = 22;
_state1 = (float) (1-_state1);
if (true) break;

case 22:
//C
this.state = 23;
;
RDebugUtils.currentLine=82509836;
 //BA.debugLineNum = 82509836;BA.debugLine="Draw(state1)";
__ref._draw /*String*/ (null,_state1);
RDebugUtils.currentLine=82509837;
 //BA.debugLineNum = 82509837;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xswitch", "setvalueimpl"),(int) (16));
this.state = 47;
return;
case 47:
//C
this.state = 23;
;
RDebugUtils.currentLine=82509838;
 //BA.debugLineNum = 82509838;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 23:
//if
this.state = 28;
if (_myindex!=__ref._loopindex /*int*/ ) { 
this.state = 25;
;}if (true) break;

case 25:
//C
this.state = 28;
this.state = 29;
if (true) break;
if (true) break;

case 28:
//C
this.state = 14;
;
 if (true) break;
;
RDebugUtils.currentLine=82509840;
 //BA.debugLineNum = 82509840;BA.debugLine="If MyIndex = LoopIndex Then";

case 29:
//if
this.state = 40;
if (_myindex==__ref._loopindex /*int*/ ) { 
this.state = 31;
}if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=82509841;
 //BA.debugLineNum = 82509841;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 32:
//if
this.state = 39;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 34;
;}
else {
this.state = 36;
;}if (true) break;

case 34:
//C
this.state = 39;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 36:
//C
this.state = 39;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 39:
//C
this.state = 40;
;
 if (true) break;

case 40:
//C
this.state = 41;
;
 if (true) break;
;
RDebugUtils.currentLine=82509844;
 //BA.debugLineNum = 82509844;BA.debugLine="If mEnabled Then";

case 41:
//if
this.state = 46;
if (__ref._menabled /*boolean*/ ) { 
this.state = 43;
}else {
this.state = 45;
}if (true) break;

case 43:
//C
this.state = 46;
RDebugUtils.currentLine=82509845;
 //BA.debugLineNum = 82509845;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (1));
 if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=82509847;
 //BA.debugLineNum = 82509847;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.6)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (0.6));
 if (true) break;

case 46:
//C
this.state = -1;
;
RDebugUtils.currentLine=82509849;
 //BA.debugLineNum = 82509849;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _draw(b4a.example.ef.b4xswitch __ref,float _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_state}));}
float _r = 0f;
float _cx = 0f;
int _cy = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _smallrect = null;
float _w = 0f;
float _h = 0f;
RDebugUtils.currentLine=82837504;
 //BA.debugLineNum = 82837504;BA.debugLine="Private Sub Draw (State As Float)";
RDebugUtils.currentLine=82837505;
 //BA.debugLineNum = 82837505;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparent /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=82837506;
 //BA.debugLineNum = 82837506;BA.debugLine="Dim r As Float = Round(bc.mHeight / 2)";
_r = (float) (__c.Round(__ref._bc /*b4a.example.bitmapcreator*/ ._mheight/(double)2));
RDebugUtils.currentLine=82837507;
 //BA.debugLineNum = 82837507;BA.debugLine="Dim cx As Float = r - 1 * Scale + (bc.mWidth - 2";
_cx = (float) (_r-1*__ref._scale /*float*/ +(__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth-2*_r)*_state);
RDebugUtils.currentLine=82837508;
 //BA.debugLineNum = 82837508;BA.debugLine="If State = 0 Then";
if (_state==0) { 
RDebugUtils.currentLine=82837509;
 //BA.debugLineNum = 82837509;BA.debugLine="cx = r";
_cx = _r;
 }else 
{RDebugUtils.currentLine=82837510;
 //BA.debugLineNum = 82837510;BA.debugLine="Else If State = 1 Then";
if (_state==1) { 
RDebugUtils.currentLine=82837511;
 //BA.debugLineNum = 82837511;BA.debugLine="cx = Round(bc.mWidth - 1 * Scale - r)";
_cx = (float) (__c.Round(__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth-1*__ref._scale /*float*/ -_r));
 }}
;
RDebugUtils.currentLine=82837513;
 //BA.debugLineNum = 82837513;BA.debugLine="Dim cy As Int = bc.mHeight / 2";
_cy = (int) (__ref._bc /*b4a.example.bitmapcreator*/ ._mheight/(double)2);
RDebugUtils.currentLine=82837514;
 //BA.debugLineNum = 82837514;BA.debugLine="Dim smallrect As B4XRect";
_smallrect = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=82837515;
 //BA.debugLineNum = 82837515;BA.debugLine="Dim w As Float = State * bc.mWidth";
_w = (float) (_state*__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth);
RDebugUtils.currentLine=82837516;
 //BA.debugLineNum = 82837516;BA.debugLine="Dim h As Float = State * bc.mHeight";
_h = (float) (_state*__ref._bc /*b4a.example.bitmapcreator*/ ._mheight);
RDebugUtils.currentLine=82837517;
 //BA.debugLineNum = 82837517;BA.debugLine="If State < 1 Then bc.DrawRectRounded2(bc.TargetRe";
if (_state<1) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._offcolor /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (2*__ref._scale /*float*/ ),(int) (_r));};
RDebugUtils.currentLine=82837518;
 //BA.debugLineNum = 82837518;BA.debugLine="smallrect.Initialize(bc.mWidth / 2 - w / 2, cy -";
_smallrect.Initialize((float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth/(double)2-_w/(double)2),(float) (_cy-_h/(double)2),(float) (__ref._bc /*b4a.example.bitmapcreator*/ ._mwidth/(double)2+_w/(double)2),(float) (_cy+_h/(double)2));
RDebugUtils.currentLine=82837519;
 //BA.debugLineNum = 82837519;BA.debugLine="If State > 0 Then bc.DrawRectRounded2(smallrect,";
if (_state>0) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrectrounded2(_smallrect,__ref._oncolor /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (2*__ref._scale /*float*/ ),(int) (_smallrect.getHeight()/(double)2));};
RDebugUtils.currentLine=82837520;
 //BA.debugLineNum = 82837520;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=82837521;
 //BA.debugLineNum = 82837521;BA.debugLine="bc.DrawCircle2(cx, cy, r - 2 * Scale, ThumbColor";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2(_cx,(float) (_cy),(float) (_r-2*__ref._scale /*float*/ ),__ref._thumbcolor /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
 };
RDebugUtils.currentLine=82837523;
 //BA.debugLineNum = 82837523;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._iv /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject())));
RDebugUtils.currentLine=82837524;
 //BA.debugLineNum = 82837524;BA.debugLine="End Sub";
return "";
}
public boolean  _getenabled(b4a.example.ef.b4xswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=82771968;
 //BA.debugLineNum = 82771968;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=82771969;
 //BA.debugLineNum = 82771969;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=82771970;
 //BA.debugLineNum = 82771970;BA.debugLine="End Sub";
return false;
}
public boolean  _getvalue(b4a.example.ef.b4xswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Boolean) Debug.delegate(ba, "getvalue", null));}
RDebugUtils.currentLine=82640896;
 //BA.debugLineNum = 82640896;BA.debugLine="Public Sub getValue As Boolean";
RDebugUtils.currentLine=82640897;
 //BA.debugLineNum = 82640897;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*boolean*/ ;
RDebugUtils.currentLine=82640898;
 //BA.debugLineNum = 82640898;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.ef.b4xswitch __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=82313216;
 //BA.debugLineNum = 82313216;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=82313217;
 //BA.debugLineNum = 82313217;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=82313218;
 //BA.debugLineNum = 82313218;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=82313219;
 //BA.debugLineNum = 82313219;BA.debugLine="End Sub";
return "";
}
public String  _pnl_click(b4a.example.ef.b4xswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "pnl_click", true))
	 {return ((String) Debug.delegate(ba, "pnl_click", null));}
RDebugUtils.currentLine=82444288;
 //BA.debugLineNum = 82444288;BA.debugLine="Private Sub pnl_Click";
RDebugUtils.currentLine=82444290;
 //BA.debugLineNum = 82444290;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=82444291;
 //BA.debugLineNum = 82444291;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=82444292;
 //BA.debugLineNum = 82444292;BA.debugLine="SetValueImpl(Not(mValue), False)";
__ref._setvalueimpl /*void*/ (null,__c.Not(__ref._mvalue /*boolean*/ ),__c.False);
RDebugUtils.currentLine=82444293;
 //BA.debugLineNum = 82444293;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Value";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(int) (1))) { 
RDebugUtils.currentLine=82444294;
 //BA.debugLineNum = 82444294;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_Value";
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ValueChanged",(Object)(__ref._mvalue /*boolean*/ ));
 };
 };
RDebugUtils.currentLine=82444297;
 //BA.debugLineNum = 82444297;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.example.ef.b4xswitch __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=82706432;
 //BA.debugLineNum = 82706432;BA.debugLine="Public Sub setEnabled (b As Boolean)";
RDebugUtils.currentLine=82706433;
 //BA.debugLineNum = 82706433;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=82706434;
 //BA.debugLineNum = 82706434;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=82706435;
 //BA.debugLineNum = 82706435;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.b4xswitch __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xswitch";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_b}));}
RDebugUtils.currentLine=82575360;
 //BA.debugLineNum = 82575360;BA.debugLine="Public Sub setValue(b As Boolean)";
RDebugUtils.currentLine=82575361;
 //BA.debugLineNum = 82575361;BA.debugLine="If b = mValue Then Return";
if (_b==__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=82575362;
 //BA.debugLineNum = 82575362;BA.debugLine="SetValueImpl(b, False)";
__ref._setvalueimpl /*void*/ (null,_b,__c.False);
RDebugUtils.currentLine=82575363;
 //BA.debugLineNum = 82575363;BA.debugLine="End Sub";
return "";
}
}