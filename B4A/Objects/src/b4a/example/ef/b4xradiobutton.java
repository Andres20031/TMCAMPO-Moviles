package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xradiobutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xradiobutton");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xradiobutton.class).invoke(this, new Object[] {null});
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
public int _oncolor = 0;
public int _offcolor = 0;
public b4a.example.bitmapcreator _bc = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public boolean _mvalue = false;
public b4a.example.bcpath._bcbrush _transparent = null;
public int _loopindex = 0;
public Object _tag = null;
public b4a.example.bcpath._bcbrush _onbrush = null;
public b4a.example.bcpath._bcbrush _offbrush = null;
public boolean _menabled = false;
public boolean _mhaptic = false;
public int _size = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _mlabel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnl = null;
public float _scale = 0f;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.ef.b4xradiobutton __ref,double _width1,double _height1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width1,_height1}));}
int _newsize = 0;
int _gap = 0;
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="Dim NewSize As Int = Max(5dip, Height1)";
_newsize = (int) (__c.Max(__c.DipToCurrent((int) (5)),_height1));
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="If NewSize = Size Then Return";
if (_newsize==__ref._size /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=59637763;
 //BA.debugLineNum = 59637763;BA.debugLine="Size = NewSize";
__ref._size /*int*/  = _newsize;
RDebugUtils.currentLine=59637764;
 //BA.debugLineNum = 59637764;BA.debugLine="Dim gap As Int = 3dip";
_gap = __c.DipToCurrent((int) (3));
RDebugUtils.currentLine=59637766;
 //BA.debugLineNum = 59637766;BA.debugLine="bc.Initialize(NewSize - 2 * gap, NewSize - 2 * ga";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (_newsize-2*_gap),(int) (_newsize-2*_gap));
RDebugUtils.currentLine=59637767;
 //BA.debugLineNum = 59637767;BA.debugLine="Scale = xui.Scale";
__ref._scale /*float*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getScale();
RDebugUtils.currentLine=59637772;
 //BA.debugLineNum = 59637772;BA.debugLine="iv.SetLayoutAnimated(0, gap, gap, Size - 2 * gap,";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_gap,_gap,(int) (__ref._size /*int*/ -2*_gap),(int) (__ref._size /*int*/ -2*_gap));
RDebugUtils.currentLine=59637773;
 //BA.debugLineNum = 59637773;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width1, Height1)";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width1),(int) (_height1));
RDebugUtils.currentLine=59637774;
 //BA.debugLineNum = 59637774;BA.debugLine="mLabel.SetLayoutAnimated(0, Size + gap, 0, Width1";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__ref._size /*int*/ +_gap),(int) (0),(int) (_width1-__ref._size /*int*/ -_gap),(int) (_height1));
RDebugUtils.currentLine=59637775;
 //BA.debugLineNum = 59637775;BA.debugLine="OnBrush = bc.CreateBrushFromColor(OnColor)";
__ref._onbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._oncolor /*int*/ );
RDebugUtils.currentLine=59637776;
 //BA.debugLineNum = 59637776;BA.debugLine="OffBrush = bc.CreateBrushFromColor(OffColor)";
__ref._offbrush /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._offcolor /*int*/ );
RDebugUtils.currentLine=59637777;
 //BA.debugLineNum = 59637777;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
__ref._transparent /*b4a.example.bcpath._bcbrush*/  = __ref._bc /*b4a.example.bitmapcreator*/ ._createbrushfromcolor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=59637778;
 //BA.debugLineNum = 59637778;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=59637779;
 //BA.debugLineNum = 59637779;BA.debugLine="End Sub";
return "";
}
public void  _setvalueimpl(b4a.example.ef.b4xradiobutton __ref,boolean _b,boolean _immediate) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setvalueimpl", true))
	 {Debug.delegate(ba, "setvalueimpl", new Object[] {_b,_immediate}); return;}
ResumableSub_SetValueImpl rsub = new ResumableSub_SetValueImpl(this,__ref,_b,_immediate);
rsub.resume(ba, null);
}
public static class ResumableSub_SetValueImpl extends BA.ResumableSub {
public ResumableSub_SetValueImpl(b4a.example.ef.b4xradiobutton parent,b4a.example.ef.b4xradiobutton __ref,boolean _b,boolean _immediate) {
this.parent = parent;
this.__ref = __ref;
this._b = _b;
this._immediate = _immediate;
this.__ref = parent;
}
b4a.example.ef.b4xradiobutton __ref;
b4a.example.ef.b4xradiobutton parent;
boolean _b;
boolean _immediate;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
b4a.example.ef.b4xradiobutton _rb = null;
int _myindex = 0;
long _start = 0L;
int _duration = 0;
float _state1 = 0f;
int step3;
int limit3;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xradiobutton";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="mValue = b";
__ref._mvalue /*boolean*/  = _b;
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="If b = True Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_b==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=59768835;
 //BA.debugLineNum = 59768835;BA.debugLine="For i = 0 To mBase.Parent.NumberOfViews - 1";
if (true) break;

case 4:
//for
this.state = 11;
step3 = 1;
limit3 = (int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().getNumberOfViews()-1);
_i = (int) (0) ;
this.state = 59;
if (true) break;

case 59:
//C
this.state = 11;
if ((step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3)) this.state = 6;
if (true) break;

case 60:
//C
this.state = 59;
_i = ((int)(0 + _i + step3)) ;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=59768836;
 //BA.debugLineNum = 59768836;BA.debugLine="Dim v As B4XView = mBase.Parent.GetView(i)";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
_v = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetView(_i);
RDebugUtils.currentLine=59768837;
 //BA.debugLineNum = 59768837;BA.debugLine="If v <> mBase And v.Tag Is B4XRadioButton Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_v).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false && _v.getTag() instanceof b4a.example.ef.b4xradiobutton) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=59768838;
 //BA.debugLineNum = 59768838;BA.debugLine="Dim rb As B4XRadioButton = v.Tag";
_rb = (b4a.example.ef.b4xradiobutton)(_v.getTag());
RDebugUtils.currentLine=59768839;
 //BA.debugLineNum = 59768839;BA.debugLine="rb.Checked = False";
_rb._setchecked /*boolean*/ (null,parent.__c.False);
 if (true) break;

case 10:
//C
this.state = 60;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 12;
;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=59768843;
 //BA.debugLineNum = 59768843;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref._loopindex /*int*/  = (int) (__ref._loopindex /*int*/ +1);
RDebugUtils.currentLine=59768844;
 //BA.debugLineNum = 59768844;BA.debugLine="If Immediate Then";
if (true) break;

case 13:
//if
this.state = 53;
if (_immediate) { 
this.state = 15;
}else {
this.state = 25;
}if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=59768845;
 //BA.debugLineNum = 59768845;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 16:
//if
this.state = 23;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 18;
;}
else {
this.state = 20;
;}if (true) break;

case 18:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 20:
//C
this.state = 23;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 23:
//C
this.state = 53;
;
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=59768847;
 //BA.debugLineNum = 59768847;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref._loopindex /*int*/ ;
RDebugUtils.currentLine=59768848;
 //BA.debugLineNum = 59768848;BA.debugLine="Dim start As Long = DateTime.Now";
_start = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=59768849;
 //BA.debugLineNum = 59768849;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
RDebugUtils.currentLine=59768850;
 //BA.debugLineNum = 59768850;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 26:
//do while
this.state = 41;
while (parent.__c.DateTime.getNow()<_start+_duration) {
this.state = 28;
if (true) break;
}
if (true) break;

case 28:
//C
this.state = 29;
RDebugUtils.currentLine=59768851;
 //BA.debugLineNum = 59768851;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) ((parent.__c.DateTime.getNow()-_start)/(double)_duration);
RDebugUtils.currentLine=59768852;
 //BA.debugLineNum = 59768852;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 29:
//if
this.state = 34;
if (__ref._mvalue /*boolean*/ ==parent.__c.False) { 
this.state = 31;
;}if (true) break;

case 31:
//C
this.state = 34;
_state1 = (float) (1-_state1);
if (true) break;

case 34:
//C
this.state = 35;
;
RDebugUtils.currentLine=59768853;
 //BA.debugLineNum = 59768853;BA.debugLine="Draw(state1)";
__ref._draw /*String*/ (null,_state1);
RDebugUtils.currentLine=59768854;
 //BA.debugLineNum = 59768854;BA.debugLine="Sleep(16)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xradiobutton", "setvalueimpl"),(int) (16));
this.state = 61;
return;
case 61:
//C
this.state = 35;
;
RDebugUtils.currentLine=59768855;
 //BA.debugLineNum = 59768855;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 35:
//if
this.state = 40;
if (_myindex!=__ref._loopindex /*int*/ ) { 
this.state = 37;
;}if (true) break;

case 37:
//C
this.state = 40;
this.state = 41;
if (true) break;
if (true) break;

case 40:
//C
this.state = 26;
;
 if (true) break;
;
RDebugUtils.currentLine=59768857;
 //BA.debugLineNum = 59768857;BA.debugLine="If MyIndex = LoopIndex Then";

case 41:
//if
this.state = 52;
if (_myindex==__ref._loopindex /*int*/ ) { 
this.state = 43;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=59768858;
 //BA.debugLineNum = 59768858;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 44:
//if
this.state = 51;
if (__ref._mvalue /*boolean*/ ) { 
this.state = 46;
;}
else {
this.state = 48;
;}if (true) break;

case 46:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (1));
if (true) break;

case 48:
//C
this.state = 51;
__ref._draw /*String*/ (null,(float) (0));
if (true) break;

case 51:
//C
this.state = 52;
;
 if (true) break;

case 52:
//C
this.state = 53;
;
 if (true) break;
;
RDebugUtils.currentLine=59768861;
 //BA.debugLineNum = 59768861;BA.debugLine="If mEnabled Then";

case 53:
//if
this.state = 58;
if (__ref._menabled /*boolean*/ ) { 
this.state = 55;
}else {
this.state = 57;
}if (true) break;

case 55:
//C
this.state = 58;
RDebugUtils.currentLine=59768862;
 //BA.debugLineNum = 59768862;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 1)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (1));
 if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=59768864;
 //BA.debugLineNum = 59768864;BA.debugLine="XUIViewsUtils.SetAlpha(mBase, 0.4)";
parent._xuiviewsutils._setalpha /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(float) (0.4));
 if (true) break;

case 58:
//C
this.state = -1;
;
RDebugUtils.currentLine=59768867;
 //BA.debugLineNum = 59768867;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=59441155;
 //BA.debugLineNum = 59441155;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=59441156;
 //BA.debugLineNum = 59441156;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=59441157;
 //BA.debugLineNum = 59441157;BA.debugLine="Public OnColor, OffColor As Int";
_oncolor = 0;
_offcolor = 0;
RDebugUtils.currentLine=59441158;
 //BA.debugLineNum = 59441158;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=59441159;
 //BA.debugLineNum = 59441159;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=59441160;
 //BA.debugLineNum = 59441160;BA.debugLine="Private mValue As Boolean";
_mvalue = false;
RDebugUtils.currentLine=59441161;
 //BA.debugLineNum = 59441161;BA.debugLine="Private transparent As BCBrush";
_transparent = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=59441162;
 //BA.debugLineNum = 59441162;BA.debugLine="Private LoopIndex As Int";
_loopindex = 0;
RDebugUtils.currentLine=59441163;
 //BA.debugLineNum = 59441163;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=59441164;
 //BA.debugLineNum = 59441164;BA.debugLine="Private OnBrush, OffBrush As BCBrush";
_onbrush = new b4a.example.bcpath._bcbrush();
_offbrush = new b4a.example.bcpath._bcbrush();
RDebugUtils.currentLine=59441165;
 //BA.debugLineNum = 59441165;BA.debugLine="Private mEnabled As Boolean = True";
_menabled = __c.True;
RDebugUtils.currentLine=59441166;
 //BA.debugLineNum = 59441166;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=59441167;
 //BA.debugLineNum = 59441167;BA.debugLine="Private Size As Int";
_size = 0;
RDebugUtils.currentLine=59441168;
 //BA.debugLineNum = 59441168;BA.debugLine="Public mLabel As B4XView";
_mlabel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=59441169;
 //BA.debugLineNum = 59441169;BA.debugLine="Private pnl As B4XView";
_pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=59441170;
 //BA.debugLineNum = 59441170;BA.debugLine="Private Scale As Float 'ignore";
_scale = 0f;
RDebugUtils.currentLine=59441171;
 //BA.debugLineNum = 59441171;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4xradiobutton __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=59572225;
 //BA.debugLineNum = 59572225;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=59572227;
 //BA.debugLineNum = 59572227;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=59572228;
 //BA.debugLineNum = 59572228;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"pnl");
RDebugUtils.currentLine=59572229;
 //BA.debugLineNum = 59572229;BA.debugLine="pnl.Color = xui.Color_Transparent";
__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=59572230;
 //BA.debugLineNum = 59572230;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=59572231;
 //BA.debugLineNum = 59572231;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=59572232;
 //BA.debugLineNum = 59572232;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=59572233;
 //BA.debugLineNum = 59572233;BA.debugLine="mBase.AddView(iv, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=59572234;
 //BA.debugLineNum = 59572234;BA.debugLine="mLabel = Lbl";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=59572235;
 //BA.debugLineNum = 59572235;BA.debugLine="mLabel.SetTextAlignment(\"CENTER\", \"LEFT\")";
__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetTextAlignment("CENTER","LEFT");
RDebugUtils.currentLine=59572236;
 //BA.debugLineNum = 59572236;BA.debugLine="mBase.AddView(mLabel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=59572237;
 //BA.debugLineNum = 59572237;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=59572239;
 //BA.debugLineNum = 59572239;BA.debugLine="OnColor = xui.PaintOrColorToColor(Props.Get(\"OnCo";
__ref._oncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OnColor")));
RDebugUtils.currentLine=59572240;
 //BA.debugLineNum = 59572240;BA.debugLine="OffColor = xui.PaintOrColorToColor(Props.Get(\"Off";
__ref._offcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OffColor")));
RDebugUtils.currentLine=59572241;
 //BA.debugLineNum = 59572241;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=59572243;
 //BA.debugLineNum = 59572243;BA.debugLine="mEnabled = mBase.Enabled";
__ref._menabled /*boolean*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getEnabled();
RDebugUtils.currentLine=59572244;
 //BA.debugLineNum = 59572244;BA.debugLine="mBase.Enabled = True";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=59572245;
 //BA.debugLineNum = 59572245;BA.debugLine="mValue = Props.Get(\"Value\")";
__ref._mvalue /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Value")));
RDebugUtils.currentLine=59572246;
 //BA.debugLineNum = 59572246;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=59572247;
 //BA.debugLineNum = 59572247;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.example.ef.b4xradiobutton __ref,float _state) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", new Object[] {_state}));}
float _r = 0f;
RDebugUtils.currentLine=60096512;
 //BA.debugLineNum = 60096512;BA.debugLine="Private Sub Draw (State As Float)";
RDebugUtils.currentLine=60096513;
 //BA.debugLineNum = 60096513;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
__ref._bc /*b4a.example.bitmapcreator*/ ._drawrect2(__ref._bc /*b4a.example.bitmapcreator*/ ._targetrect,__ref._transparent /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="Dim r As Float = Floor(bc.mHeight / 2)";
_r = (float) (__c.Floor(__ref._bc /*b4a.example.bitmapcreator*/ ._mheight/(double)2));
RDebugUtils.currentLine=60096515;
 //BA.debugLineNum = 60096515;BA.debugLine="If State < 1 Then bc.DrawCircle2(r, r, r, OffBrus";
if (_state<1) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2(_r,_r,_r,__ref._offbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=60096516;
 //BA.debugLineNum = 60096516;BA.debugLine="If State > 0 Then bc.DrawCircle2(r, r, r * State,";
if (_state>0) { 
__ref._bc /*b4a.example.bitmapcreator*/ ._drawcircle2(_r,_r,(float) (_r*_state),__ref._onbrush /*b4a.example.bcpath._bcbrush*/ ,__c.True,(int) (0));};
RDebugUtils.currentLine=60096517;
 //BA.debugLineNum = 60096517;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
__ref._bc /*b4a.example.bitmapcreator*/ ._setbitmaptoimageview(__ref._bc /*b4a.example.bitmapcreator*/ ._getbitmap(),__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=60096518;
 //BA.debugLineNum = 60096518;BA.debugLine="End Sub";
return "";
}
public boolean  _getchecked(b4a.example.ef.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getchecked", true))
	 {return ((Boolean) Debug.delegate(ba, "getchecked", null));}
RDebugUtils.currentLine=59899904;
 //BA.debugLineNum = 59899904;BA.debugLine="Public Sub getChecked As Boolean";
RDebugUtils.currentLine=59899905;
 //BA.debugLineNum = 59899905;BA.debugLine="Return mValue";
if (true) return __ref._mvalue /*boolean*/ ;
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="End Sub";
return false;
}
public boolean  _getenabled(b4a.example.ef.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "getenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getenabled", null));}
RDebugUtils.currentLine=60030976;
 //BA.debugLineNum = 60030976;BA.debugLine="Public Sub getEnabled As Boolean";
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="Return mEnabled";
if (true) return __ref._menabled /*boolean*/ ;
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="End Sub";
return false;
}
public Object  _gettext(b4a.example.ef.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "gettext", true))
	 {return ((Object) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=60227584;
 //BA.debugLineNum = 60227584;BA.debugLine="Public Sub getText As Object";
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="Return mLabel.Text";
if (true) return (Object)(__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText());
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.b4xradiobutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=59506691;
 //BA.debugLineNum = 59506691;BA.debugLine="End Sub";
return "";
}
public String  _pnl_click(b4a.example.ef.b4xradiobutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "pnl_click", true))
	 {return ((String) Debug.delegate(ba, "pnl_click", null));}
RDebugUtils.currentLine=59703296;
 //BA.debugLineNum = 59703296;BA.debugLine="Private Sub pnl_Click";
RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="If mValue Then Return";
if (__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="If mEnabled Then";
if (__ref._menabled /*boolean*/ ) { 
RDebugUtils.currentLine=59703300;
 //BA.debugLineNum = 59703300;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFeedb";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=59703301;
 //BA.debugLineNum = 59703301;BA.debugLine="SetValueImpl(Not(mValue), False)";
__ref._setvalueimpl /*void*/ (null,__c.Not(__ref._mvalue /*boolean*/ ),__c.False);
RDebugUtils.currentLine=59703302;
 //BA.debugLineNum = 59703302;BA.debugLine="If mValue And xui.SubExists(mCallBack, mEventNam";
if (__ref._mvalue /*boolean*/  && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked",(int) (0))) { 
RDebugUtils.currentLine=59703303;
 //BA.debugLineNum = 59703303;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Checke";
__c.CallSubDelayed(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_Checked");
 };
 };
RDebugUtils.currentLine=59703306;
 //BA.debugLineNum = 59703306;BA.debugLine="End Sub";
return "";
}
public String  _setchecked(b4a.example.ef.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setchecked", true))
	 {return ((String) Debug.delegate(ba, "setchecked", new Object[] {_b}));}
RDebugUtils.currentLine=59834368;
 //BA.debugLineNum = 59834368;BA.debugLine="Public Sub setChecked(b As Boolean)";
RDebugUtils.currentLine=59834369;
 //BA.debugLineNum = 59834369;BA.debugLine="If b = mValue Then Return";
if (_b==__ref._mvalue /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=59834370;
 //BA.debugLineNum = 59834370;BA.debugLine="SetValueImpl(b, False)";
__ref._setvalueimpl /*void*/ (null,_b,__c.False);
RDebugUtils.currentLine=59834371;
 //BA.debugLineNum = 59834371;BA.debugLine="End Sub";
return "";
}
public String  _setenabled(b4a.example.ef.b4xradiobutton __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "setenabled", true))
	 {return ((String) Debug.delegate(ba, "setenabled", new Object[] {_b}));}
RDebugUtils.currentLine=59965440;
 //BA.debugLineNum = 59965440;BA.debugLine="Public Sub setEnabled (b As Boolean)";
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="mEnabled = b";
__ref._menabled /*boolean*/  = _b;
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="SetValueImpl(mValue, True)";
__ref._setvalueimpl /*void*/ (null,__ref._mvalue /*boolean*/ ,__c.True);
RDebugUtils.currentLine=59965443;
 //BA.debugLineNum = 59965443;BA.debugLine="End Sub";
return "";
}
public String  _settext(b4a.example.ef.b4xradiobutton __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xradiobutton";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=60162048;
 //BA.debugLineNum = 60162048;BA.debugLine="Public Sub setText (t As Object)";
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="XUIViewsUtils.SetTextOrCSBuilderToLabel(mLabel, t";
_xuiviewsutils._settextorcsbuildertolabel /*String*/ (ba,__ref._mlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_t);
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="End Sub";
return "";
}
}