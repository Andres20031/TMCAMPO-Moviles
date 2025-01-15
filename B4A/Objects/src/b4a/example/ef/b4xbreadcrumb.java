package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xbreadcrumb extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xbreadcrumb");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xbreadcrumb.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _mitems = null;
public anywheresoftware.b4a.objects.collections.List _rightpositions = null;
public int _textcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
public int _offset = 0;
public b4a.example.bitmapcreator _bc = null;
public int _crumbcolor = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _touchpanel = null;
public int _presseditem = 0;
public Object _tag = null;
public boolean _mhaptic = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.ef.b4xbreadcrumb __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=62783488;
 //BA.debugLineNum = 62783488;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
RDebugUtils.currentLine=62783489;
 //BA.debugLineNum = 62783489;BA.debugLine="cvs.Resize(Width, Height)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_width),(float) (_height));
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=62783491;
 //BA.debugLineNum = 62783491;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=62783492;
 //BA.debugLineNum = 62783492;BA.debugLine="End Sub";
return "";
}
public String  _draw(b4a.example.ef.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "draw", true))
	 {return ((String) Debug.delegate(ba, "draw", null));}
b4a.example.bitmapcreator._argbcolor _bcolor = null;
int _strokecolor = 0;
int[] _clrs = null;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Private Sub Draw";
RDebugUtils.currentLine=62849025;
 //BA.debugLineNum = 62849025;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=62849027;
 //BA.debugLineNum = 62849027;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=62849028;
 //BA.debugLineNum = 62849028;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor.r = (int) (__c.Min(255,_bcolor.r*2));
RDebugUtils.currentLine=62849029;
 //BA.debugLineNum = 62849029;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor.g = (int) (__c.Min(255,_bcolor.g*2));
RDebugUtils.currentLine=62849030;
 //BA.debugLineNum = 62849030;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor.b = (int) (__c.Min(255,_bcolor.b*2));
RDebugUtils.currentLine=62849031;
 //BA.debugLineNum = 62849031;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = __ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor);
RDebugUtils.currentLine=62849033;
 //BA.debugLineNum = 62849033;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
__ref._bc /*b4a.example.bitmapcreator*/ ._colortoargb(__ref._crumbcolor /*int*/ ,_bcolor);
RDebugUtils.currentLine=62849034;
 //BA.debugLineNum = 62849034;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor.r = (int) (_bcolor.r*0.8);
RDebugUtils.currentLine=62849035;
 //BA.debugLineNum = 62849035;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor.g = (int) (_bcolor.g*0.8);
RDebugUtils.currentLine=62849036;
 //BA.debugLineNum = 62849036;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor.b = (int) (_bcolor.b*0.8);
RDebugUtils.currentLine=62849037;
 //BA.debugLineNum = 62849037;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = new int[]{__ref._crumbcolor /*int*/ ,__ref._bc /*b4a.example.bitmapcreator*/ ._argbtocolor(_bcolor)};
RDebugUtils.currentLine=62849039;
 //BA.debugLineNum = 62849039;BA.debugLine="RightPositions.Clear";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=62849040;
 //BA.debugLineNum = 62849040;BA.debugLine="If mItems.Size = 0 Then Return";
if (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=62849041;
 //BA.debugLineNum = 62849041;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
RDebugUtils.currentLine=62849042;
 //BA.debugLineNum = 62849042;BA.debugLine="For i = 0 To mItems.Size - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=62849043;
 //BA.debugLineNum = 62849043;BA.debugLine="Dim sc As Int";
_sc = 0;
RDebugUtils.currentLine=62849044;
 //BA.debugLineNum = 62849044;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (__ref._presseditem /*int*/ ==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
RDebugUtils.currentLine=62849045;
 //BA.debugLineNum = 62849045;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = __ref._drawitem /*int*/ (null,_left,BA.ObjectToString(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),_i==0,_i==__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,_clrs[(int) (_i%_clrs.length)],_sc);
RDebugUtils.currentLine=62849046;
 //BA.debugLineNum = 62849046;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+__ref._offset /*int*/ +__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=62849047;
 //BA.debugLineNum = 62849047;BA.debugLine="RightPositions.Add(Left)";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_left));
 }
};
RDebugUtils.currentLine=62849049;
 //BA.debugLineNum = 62849049;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=62849050;
 //BA.debugLineNum = 62849050;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
RDebugUtils.currentLine=62586880;
 //BA.debugLineNum = 62586880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=62586881;
 //BA.debugLineNum = 62586881;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=62586882;
 //BA.debugLineNum = 62586882;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=62586883;
 //BA.debugLineNum = 62586883;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62586884;
 //BA.debugLineNum = 62586884;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=62586885;
 //BA.debugLineNum = 62586885;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=62586886;
 //BA.debugLineNum = 62586886;BA.debugLine="Private mItems As List";
_mitems = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62586887;
 //BA.debugLineNum = 62586887;BA.debugLine="Private RightPositions As List";
_rightpositions = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62586888;
 //BA.debugLineNum = 62586888;BA.debugLine="Public TextColor As Int";
_textcolor = 0;
RDebugUtils.currentLine=62586889;
 //BA.debugLineNum = 62586889;BA.debugLine="Public fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=62586890;
 //BA.debugLineNum = 62586890;BA.debugLine="Private offset As Int = 10dip";
_offset = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=62586891;
 //BA.debugLineNum = 62586891;BA.debugLine="Private bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=62586892;
 //BA.debugLineNum = 62586892;BA.debugLine="Public CrumbColor As Int";
_crumbcolor = 0;
RDebugUtils.currentLine=62586893;
 //BA.debugLineNum = 62586893;BA.debugLine="Private TouchPanel As B4XView";
_touchpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62586894;
 //BA.debugLineNum = 62586894;BA.debugLine="Private PressedItem As Int = -1";
_presseditem = (int) (-1);
RDebugUtils.currentLine=62586895;
 //BA.debugLineNum = 62586895;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=62586896;
 //BA.debugLineNum = 62586896;BA.debugLine="Public mHaptic As Boolean";
_mhaptic = false;
RDebugUtils.currentLine=62586897;
 //BA.debugLineNum = 62586897;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4xbreadcrumb __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
String _items = "";
String _s = "";
RDebugUtils.currentLine=62717952;
 //BA.debugLineNum = 62717952;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=62717953;
 //BA.debugLineNum = 62717953;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=62717955;
 //BA.debugLineNum = 62717955;BA.debugLine="cvs.Initialize(mBase)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=62717956;
 //BA.debugLineNum = 62717956;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=62717957;
 //BA.debugLineNum = 62717957;BA.debugLine="fnt = xlbl.Font";
__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xlbl.getFont();
RDebugUtils.currentLine=62717958;
 //BA.debugLineNum = 62717958;BA.debugLine="TextColor = xlbl.TextColor";
__ref._textcolor /*int*/  = _xlbl.getTextColor();
RDebugUtils.currentLine=62717959;
 //BA.debugLineNum = 62717959;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
__ref._crumbcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CrumbColor")));
RDebugUtils.currentLine=62717960;
 //BA.debugLineNum = 62717960;BA.debugLine="mHaptic = Props.GetDefault(\"HapticFeedback\", Fals";
__ref._mhaptic /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("HapticFeedback"),(Object)(__c.False)));
RDebugUtils.currentLine=62717961;
 //BA.debugLineNum = 62717961;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"Touch");
RDebugUtils.currentLine=62717962;
 //BA.debugLineNum = 62717962;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=62717963;
 //BA.debugLineNum = 62717963;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = BA.ObjectToString(_props.Get((Object)("Items")));
RDebugUtils.currentLine=62717964;
 //BA.debugLineNum = 62717964;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
final String[] group13 = __c.Regex.Split("\\|",_items);
final int groupLen13 = group13.length
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_s = group13[index13];
RDebugUtils.currentLine=62717965;
 //BA.debugLineNum = 62717965;BA.debugLine="mItems.Add(s)";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=62717967;
 //BA.debugLineNum = 62717967;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=62717968;
 //BA.debugLineNum = 62717968;BA.debugLine="End Sub";
return "";
}
public int  _drawitem(b4a.example.ef.b4xbreadcrumb __ref,int _left,String _text,boolean _first,boolean _last,int _clr,int _strokecolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "drawitem", true))
	 {return ((Integer) Debug.delegate(ba, "drawitem", new Object[] {_left,_text,_first,_last,_clr,_strokecolor}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = __ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .MeasureText(_text,__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) (_r.getWidth()+__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=62914563;
 //BA.debugLineNum = 62914563;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight());
RDebugUtils.currentLine=62914564;
 //BA.debugLineNum = 62914564;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
RDebugUtils.currentLine=62914565;
 //BA.debugLineNum = 62914565;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
RDebugUtils.currentLine=62914566;
 //BA.debugLineNum = 62914566;BA.debugLine="p.Initialize(Left, 0)";
_p.Initialize((float) (_left),(float) (0));
RDebugUtils.currentLine=62914567;
 //BA.debugLineNum = 62914567;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
_p.LineTo((float) (_left+_itemwidth),(float) (0));
RDebugUtils.currentLine=62914568;
 //BA.debugLineNum = 62914568;BA.debugLine="If Last = False Then";
if (_last==__c.False) { 
RDebugUtils.currentLine=62914569;
 //BA.debugLineNum = 62914569;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
_p.LineTo((float) (_left+_itemwidth+__ref._offset /*int*/ ),(float) (_itemheight/(double)2));
 };
RDebugUtils.currentLine=62914571;
 //BA.debugLineNum = 62914571;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
_p.LineTo((float) (_left+_itemwidth),(float) (_itemheight));
RDebugUtils.currentLine=62914572;
 //BA.debugLineNum = 62914572;BA.debugLine="If First = False Then";
if (_first==__c.False) { 
RDebugUtils.currentLine=62914573;
 //BA.debugLineNum = 62914573;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (_itemheight));
RDebugUtils.currentLine=62914574;
 //BA.debugLineNum = 62914574;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
_p.LineTo((float) (_left),(float) (_itemheight/(double)2));
RDebugUtils.currentLine=62914575;
 //BA.debugLineNum = 62914575;BA.debugLine="p.LineTo(Left - offset, 0)";
_p.LineTo((float) (_left-__ref._offset /*int*/ ),(float) (0));
 }else {
RDebugUtils.currentLine=62914577;
 //BA.debugLineNum = 62914577;BA.debugLine="p.LineTo(Left, ItemHeight)";
_p.LineTo((float) (_left),(float) (_itemheight));
 };
RDebugUtils.currentLine=62914579;
 //BA.debugLineNum = 62914579;BA.debugLine="p.LineTo(Left, 0)";
_p.LineTo((float) (_left),(float) (0));
RDebugUtils.currentLine=62914580;
 //BA.debugLineNum = 62914580;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_clr,__c.True,(float) (0));
RDebugUtils.currentLine=62914581;
 //BA.debugLineNum = 62914581;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
RDebugUtils.currentLine=62914582;
 //BA.debugLineNum = 62914582;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawPath(_p,_strokecolor,__c.False,(float) (__c.DipToCurrent((int) (3))));
 };
RDebugUtils.currentLine=62914585;
 //BA.debugLineNum = 62914585;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_text,(float) (_left+_itemwidth/(double)2),(float) (_baseline),__ref._fnt /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,__ref._textcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
RDebugUtils.currentLine=62914586;
 //BA.debugLineNum = 62914586;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
RDebugUtils.currentLine=62914587;
 //BA.debugLineNum = 62914587;BA.debugLine="End Sub";
return 0;
}
public int  _finditem(b4a.example.ef.b4xbreadcrumb __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "finditem", true))
	 {return ((Integer) Debug.delegate(ba, "finditem", new Object[] {_x,_y}));}
int _r = 0;
int _i = 0;
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=63045634;
 //BA.debugLineNum = 63045634;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=63045635;
 //BA.debugLineNum = 63045635;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1))));
RDebugUtils.currentLine=63045636;
 //BA.debugLineNum = 63045636;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
RDebugUtils.currentLine=63045637;
 //BA.debugLineNum = 63045637;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
final int step5 = -1;
final int limit5 = (int) (0);
_i = (int) (__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=63045638;
 //BA.debugLineNum = 63045638;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = (int)(BA.ObjectToNumber(__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=63045639;
 //BA.debugLineNum = 63045639;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
RDebugUtils.currentLine=63045641;
 //BA.debugLineNum = 63045641;BA.debugLine="Return 0";
if (true) return (int) (0);
RDebugUtils.currentLine=63045642;
 //BA.debugLineNum = 63045642;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getitems(b4a.example.ef.b4xbreadcrumb __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "getitems", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getitems", null));}
RDebugUtils.currentLine=63176704;
 //BA.debugLineNum = 63176704;BA.debugLine="Public Sub getItems As List";
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="Return mItems";
if (true) return __ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=63176706;
 //BA.debugLineNum = 63176706;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.b4xbreadcrumb __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=62652416;
 //BA.debugLineNum = 62652416;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=62652417;
 //BA.debugLineNum = 62652417;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=62652418;
 //BA.debugLineNum = 62652418;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=62652419;
 //BA.debugLineNum = 62652419;BA.debugLine="mItems.Initialize";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=62652420;
 //BA.debugLineNum = 62652420;BA.debugLine="RightPositions.Initialize";
__ref._rightpositions /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=62652421;
 //BA.debugLineNum = 62652421;BA.debugLine="bc.Initialize(1, 1)";
__ref._bc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=62652422;
 //BA.debugLineNum = 62652422;BA.debugLine="End Sub";
return "";
}
public String  _setitems(b4a.example.ef.b4xbreadcrumb __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "setitems", true))
	 {return ((String) Debug.delegate(ba, "setitems", new Object[] {_i}));}
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Public Sub setItems (i As List)";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="mItems = i";
__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/  = _i;
RDebugUtils.currentLine=63111170;
 //BA.debugLineNum = 63111170;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
RDebugUtils.currentLine=63111171;
 //BA.debugLineNum = 63111171;BA.debugLine="End Sub";
return "";
}
public String  _touch_touch(b4a.example.ef.b4xbreadcrumb __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xbreadcrumb";
if (Debug.shouldDelegate(ba, "touch_touch", true))
	 {return ((String) Debug.delegate(ba, "touch_touch", new Object[] {_action,_x,_y}));}
int _prev = 0;
int _index = 0;
anywheresoftware.b4a.objects.collections.List _items = null;
int _i = 0;
RDebugUtils.currentLine=62980096;
 //BA.debugLineNum = 62980096;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="Select Action";
switch (BA.switchObjectToInt(_action,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_DOWN,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE,__ref._touchpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_UP)) {
case 0: 
case 1: {
RDebugUtils.currentLine=62980099;
 //BA.debugLineNum = 62980099;BA.debugLine="Dim prev As Int = PressedItem";
_prev = __ref._presseditem /*int*/ ;
RDebugUtils.currentLine=62980100;
 //BA.debugLineNum = 62980100;BA.debugLine="PressedItem = FindItem(X, Y)";
__ref._presseditem /*int*/  = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=62980101;
 //BA.debugLineNum = 62980101;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=__ref._presseditem /*int*/ ) { 
__ref._draw /*String*/ (null);};
 break; }
case 2: {
RDebugUtils.currentLine=62980103;
 //BA.debugLineNum = 62980103;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = __ref._finditem /*int*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=62980104;
 //BA.debugLineNum = 62980104;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==__ref._presseditem /*int*/  && _index>-1) { 
RDebugUtils.currentLine=62980105;
 //BA.debugLineNum = 62980105;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=62980106;
 //BA.debugLineNum = 62980106;BA.debugLine="Items.Initialize";
_items.Initialize();
RDebugUtils.currentLine=62980107;
 //BA.debugLineNum = 62980107;BA.debugLine="For i = 0 To index";
{
final int step11 = 1;
final int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=62980108;
 //BA.debugLineNum = 62980108;BA.debugLine="Items.Add(mItems.Get(i))";
_items.Add(__ref._mitems /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=62980110;
 //BA.debugLineNum = 62980110;BA.debugLine="If mHaptic Then XUIViewsUtils.PerformHapticFee";
if (__ref._mhaptic /*boolean*/ ) { 
_xuiviewsutils._performhapticfeedback /*String*/ (ba,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );};
RDebugUtils.currentLine=62980111;
 //BA.debugLineNum = 62980111;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CrumbClick",(Object)(_items));
 };
RDebugUtils.currentLine=62980113;
 //BA.debugLineNum = 62980113;BA.debugLine="PressedItem = -1";
__ref._presseditem /*int*/  = (int) (-1);
RDebugUtils.currentLine=62980114;
 //BA.debugLineNum = 62980114;BA.debugLine="Draw";
__ref._draw /*String*/ (null);
 break; }
}
;
RDebugUtils.currentLine=62980116;
 //BA.debugLineNum = 62980116;BA.debugLine="End Sub";
return "";
}
}