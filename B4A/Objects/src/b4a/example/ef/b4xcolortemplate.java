package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcolortemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xcolortemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xcolortemplate.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _colorpickerpart{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XCanvas cvs;
public anywheresoftware.b4a.objects.B4XViewWrapper pnl;
public anywheresoftware.b4a.objects.B4XViewWrapper iv;
public anywheresoftware.b4a.objects.B4XCanvas checkersCanvas;
public boolean DrawCheckers;
public void Initialize() {
IsInitialized = true;
cvs = new anywheresoftware.b4a.objects.B4XCanvas();
pnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
checkersCanvas = new anywheresoftware.b4a.objects.B4XCanvas();
DrawCheckers = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _selectedalpha = 0;
public b4a.example.bitmapcreator _bccolors = null;
public float _selectedh = 0f;
public float _selecteds = 0f;
public float _selectedv = 0f;
public float _devicescale = 0f;
public float _colorscale = 0f;
public b4a.example.bitmapcreator _tempbc = null;
public int _dont_change = 0;
public b4a.example.ef.b4xcolortemplate._colorpickerpart _huebar = null;
public b4a.example.ef.b4xcolortemplate._colorpickerpart _colorpicker = null;
public b4a.example.ef.b4xcolortemplate._colorpickerpart _alphabar = null;
public int _borderscolor = 0;
public b4a.example.ef.b4xdialog _xdialog = null;
public Object[] _initialcolor = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _alpha_touch(b4a.example.ef.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "alpha_touch", true))
	 {return ((String) Debug.delegate(ba, "alpha_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="AlphaBarSelectedChange(x)";
__ref._alphabarselectedchange /*String*/ (null,_x);
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="End Sub";
return "";
}
public String  _alphabarselectedchange(b4a.example.ef.b4xcolortemplate __ref,float _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "alphabarselectedchange", true))
	 {return ((String) Debug.delegate(ba, "alphabarselectedchange", new Object[] {_x}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=48496640;
 //BA.debugLineNum = 48496640;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
RDebugUtils.currentLine=48496641;
 //BA.debugLineNum = 48496641;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
__ref._selectedalpha /*int*/  = (int) (255*__c.Max(0,__c.Min(1,_x/(double)__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=48496642;
 //BA.debugLineNum = 48496642;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
_x = (float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=48496643;
 //BA.debugLineNum = 48496643;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=48496644;
 //BA.debugLineNum = 48496644;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=48496645;
 //BA.debugLineNum = 48496645;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
_r.Initialize((float) (_x-__c.DipToCurrent((int) (3))),(float) (__c.DipToCurrent((int) (1))),(float) (_x+__c.DipToCurrent((int) (3))),(float) (__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=48496646;
 //BA.debugLineNum = 48496646;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,__c.True,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=48496647;
 //BA.debugLineNum = 48496647;BA.debugLine="AlphaBar.cvs.Invalidate";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=48496648;
 //BA.debugLineNum = 48496648;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=48496649;
 //BA.debugLineNum = 48496649;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=48562176;
 //BA.debugLineNum = 48562176;BA.debugLine="Private Sub Update";
RDebugUtils.currentLine=48562177;
 //BA.debugLineNum = 48562177;BA.debugLine="DrawColors";
__ref._drawcolors /*String*/ (null);
RDebugUtils.currentLine=48562178;
 //BA.debugLineNum = 48562178;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
__ref._handleselectedcolorchanged /*String*/ (null,__ref._dont_change /*int*/ ,__ref._dont_change /*int*/ );
RDebugUtils.currentLine=48562179;
 //BA.debugLineNum = 48562179;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.b4xcolortemplate __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
int _r = 0;
int _w = 0;
b4a.example.ef.b4xcolortemplate._colorpickerpart _cpp = null;
int _i = 0;
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=48103426;
 //BA.debugLineNum = 48103426;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
__ref._colorscale /*float*/  = (float) (__c.Max(1,__c.Max(_width,_height)/(double)100/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (30)),(int) (_height-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=48103428;
 //BA.debugLineNum = 48103428;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
_r = (int) (__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=48103429;
 //BA.debugLineNum = 48103429;BA.debugLine="Dim w As Int = Width - r - 1dip";
_w = (int) (_width-_r-__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=48103430;
 //BA.debugLineNum = 48103430;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=48103431;
 //BA.debugLineNum = 48103431;BA.debugLine="r = r - 1";
_r = (int) (_r-1);
RDebugUtils.currentLine=48103432;
 //BA.debugLineNum = 48103432;BA.debugLine="w = w + 1";
_w = (int) (_w+1);
 };
RDebugUtils.currentLine=48103434;
 //BA.debugLineNum = 48103434;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,(int) (_height-__c.DipToCurrent((int) (31))),_w,__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=48103435;
 //BA.debugLineNum = 48103435;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,__c.DipToCurrent((int) (1)),_w,(int) (_height-__c.DipToCurrent((int) (3))-__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=48103436;
 //BA.debugLineNum = 48103436;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
__ref._bccolors /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._colorscale /*float*/ ),(int) (__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._colorscale /*float*/ ));
RDebugUtils.currentLine=48103437;
 //BA.debugLineNum = 48103437;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
{
final Object[] group12 = new Object[]{(Object)(__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ )};
final int groupLen12 = group12.length
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (b4a.example.ef.b4xcolortemplate._colorpickerpart)(group12[index12]);
RDebugUtils.currentLine=48103438;
 //BA.debugLineNum = 48103438;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=48103439;
 //BA.debugLineNum = 48103439;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
RDebugUtils.currentLine=48103441;
 //BA.debugLineNum = 48103441;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=48103442;
 //BA.debugLineNum = 48103442;BA.debugLine="If cpp.DrawCheckers Then";
if (_cpp.DrawCheckers /*boolean*/ ) { 
RDebugUtils.currentLine=48103443;
 //BA.debugLineNum = 48103443;BA.debugLine="DrawCheckers(cpp)";
__ref._drawcheckers /*String*/ (null,_cpp);
 };
 }
};
RDebugUtils.currentLine=48103446;
 //BA.debugLineNum = 48103446;BA.debugLine="DrawHueBar";
__ref._drawhuebar /*String*/ (null);
RDebugUtils.currentLine=48103447;
 //BA.debugLineNum = 48103447;BA.debugLine="DrawAlphaBar";
__ref._drawalphabar /*String*/ (null);
RDebugUtils.currentLine=48103448;
 //BA.debugLineNum = 48103448;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=48103449;
 //BA.debugLineNum = 48103449;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=48103450;
 //BA.debugLineNum = 48103450;BA.debugLine="End Sub";
return "";
}
public String  _drawcheckers(b4a.example.ef.b4xcolortemplate __ref,b4a.example.ef.b4xcolortemplate._colorpickerpart _cpp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawcheckers", true))
	 {return ((String) Debug.delegate(ba, "drawcheckers", new Object[] {_cpp}));}
int _size = 0;
int[] _clrs = null;
int _clr = 0;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _x = 0;
int _xx = 0;
int _y = 0;
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=48168962;
 //BA.debugLineNum = 48168962;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=48168963;
 //BA.debugLineNum = 48168963;BA.debugLine="Dim size As Int = 10dip";
_size = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=48168964;
 //BA.debugLineNum = 48168964;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
_clrs = new int[]{((int)0xffc0c0c0),((int)0xff757575)};
RDebugUtils.currentLine=48168965;
 //BA.debugLineNum = 48168965;BA.debugLine="Dim clr As Int = 0";
_clr = (int) (0);
RDebugUtils.currentLine=48168966;
 //BA.debugLineNum = 48168966;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=48168967;
 //BA.debugLineNum = 48168967;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
{
final int step7 = _size;
final int limit7 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()-__c.DipToCurrent((int) (1)));
_x = (int) (0) ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
RDebugUtils.currentLine=48168968;
 //BA.debugLineNum = 48168968;BA.debugLine="Dim xx As Int = x / size";
_xx = (int) (_x/(double)_size);
RDebugUtils.currentLine=48168969;
 //BA.debugLineNum = 48168969;BA.debugLine="clr = xx Mod 2";
_clr = (int) (_xx%2);
RDebugUtils.currentLine=48168970;
 //BA.debugLineNum = 48168970;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
{
final int step10 = _size;
final int limit10 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1)));
_y = (int) (0) ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
RDebugUtils.currentLine=48168971;
 //BA.debugLineNum = 48168971;BA.debugLine="clr = (clr + 1) Mod 2";
_clr = (int) ((_clr+1)%2);
RDebugUtils.currentLine=48168972;
 //BA.debugLineNum = 48168972;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
_r.Initialize((float) (_x),(float) (_y),(float) (_x+_size),(float) (_y+_size));
RDebugUtils.currentLine=48168973;
 //BA.debugLineNum = 48168973;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_clrs[_clr],__c.True,(float) (0));
 }
};
 }
};
RDebugUtils.currentLine=48168976;
 //BA.debugLineNum = 48168976;BA.debugLine="cpp.checkersCanvas.Invalidate";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=48168977;
 //BA.debugLineNum = 48168977;BA.debugLine="End Sub";
return "";
}
public String  _drawhuebar(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawhuebar", true))
	 {return ((String) Debug.delegate(ba, "drawhuebar", null));}
b4a.example.bitmapcreator _bchue = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Private Sub DrawHueBar";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="Dim bcHue As BitmapCreator";
_bchue = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=48234498;
 //BA.debugLineNum = 48234498;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
_bchue._initialize(ba,(int) (__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
{
final int step3 = 1;
final int limit3 = (int) (_bchue._mheight-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=48234500;
 //BA.debugLineNum = 48234500;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
{
final int step4 = 1;
final int limit4 = (int) (_bchue._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=48234501;
 //BA.debugLineNum = 48234501;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
_bchue._sethsv(_x,_y,(int) (255),(int) (360/(double)_bchue._mheight*_y),(float) (1),(float) (1));
 }
};
 }
};
RDebugUtils.currentLine=48234504;
 //BA.debugLineNum = 48234504;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bchue._getbitmap().getObject()));
RDebugUtils.currentLine=48234505;
 //BA.debugLineNum = 48234505;BA.debugLine="End Sub";
return "";
}
public String  _drawalphabar(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawalphabar", true))
	 {return ((String) Debug.delegate(ba, "drawalphabar", null));}
b4a.example.bitmapcreator _bc = null;
b4a.example.bitmapcreator._argbcolor _argb = null;
int _y = 0;
int _x = 0;
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Private Sub DrawAlphaBar";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=48300034;
 //BA.debugLineNum = 48300034;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
_bc._initialize(ba,(int) (__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=48300035;
 //BA.debugLineNum = 48300035;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=48300036;
 //BA.debugLineNum = 48300036;BA.debugLine="argb.r = 0xcc";
_argb.r = ((int)0xcc);
RDebugUtils.currentLine=48300037;
 //BA.debugLineNum = 48300037;BA.debugLine="argb.g = 0xcc";
_argb.g = ((int)0xcc);
RDebugUtils.currentLine=48300038;
 //BA.debugLineNum = 48300038;BA.debugLine="argb.b = 0xcc";
_argb.b = ((int)0xcc);
RDebugUtils.currentLine=48300040;
 //BA.debugLineNum = 48300040;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
RDebugUtils.currentLine=48300041;
 //BA.debugLineNum = 48300041;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=48300042;
 //BA.debugLineNum = 48300042;BA.debugLine="argb.a = x / bc.mWidth * 255";
_argb.a = (int) (_x/(double)_bc._mwidth*255);
RDebugUtils.currentLine=48300043;
 //BA.debugLineNum = 48300043;BA.debugLine="bc.SetARGB(x, y, argb)";
_bc._setargb(_x,_y,_argb);
 }
};
 }
};
RDebugUtils.currentLine=48300046;
 //BA.debugLineNum = 48300046;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bc._getbitmap().getObject()));
RDebugUtils.currentLine=48300047;
 //BA.debugLineNum = 48300047;BA.debugLine="End Sub";
return "";
}
public String  _huebarselectedchanged(b4a.example.ef.b4xcolortemplate __ref,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebarselectedchanged", true))
	 {return ((String) Debug.delegate(ba, "huebarselectedchanged", new Object[] {_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=48431104;
 //BA.debugLineNum = 48431104;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
RDebugUtils.currentLine=48431105;
 //BA.debugLineNum = 48431105;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
__ref._selectedh /*float*/  = (float) (__c.Max(0,__c.Min(360,360*_y/(double)__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=48431106;
 //BA.debugLineNum = 48431106;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
_y = (float) (__ref._selectedh /*float*/ *__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)360);
RDebugUtils.currentLine=48431107;
 //BA.debugLineNum = 48431107;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=48431108;
 //BA.debugLineNum = 48431108;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=48431109;
 //BA.debugLineNum = 48431109;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
_r.Initialize((float) (0),(float) (_y-__c.DipToCurrent((int) (3))),__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),(float) (_y+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=48431110;
 //BA.debugLineNum = 48431110;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=48431111;
 //BA.debugLineNum = 48431111;BA.debugLine="HueBar.cvs.Invalidate";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=48431112;
 //BA.debugLineNum = 48431112;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=48431113;
 //BA.debugLineNum = 48431113;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=47906818;
 //BA.debugLineNum = 47906818;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=47906819;
 //BA.debugLineNum = 47906819;BA.debugLine="Private SelectedAlpha As Int = 255";
_selectedalpha = (int) (255);
RDebugUtils.currentLine=47906820;
 //BA.debugLineNum = 47906820;BA.debugLine="Private bcColors As BitmapCreator";
_bccolors = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=47906821;
 //BA.debugLineNum = 47906821;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
_selectedh = (float) (60);
_selecteds = (float) (0.5);
_selectedv = (float) (0.5);
RDebugUtils.currentLine=47906822;
 //BA.debugLineNum = 47906822;BA.debugLine="Private DeviceScale, ColorScale As Float";
_devicescale = 0f;
_colorscale = 0f;
RDebugUtils.currentLine=47906823;
 //BA.debugLineNum = 47906823;BA.debugLine="Private tempBC As BitmapCreator";
_tempbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=47906824;
 //BA.debugLineNum = 47906824;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
_dont_change = (int) (-999999999);
RDebugUtils.currentLine=47906825;
 //BA.debugLineNum = 47906825;BA.debugLine="Type ColorPickerPart (cvs As B4XCanvas, pnl As B4";
;
RDebugUtils.currentLine=47906826;
 //BA.debugLineNum = 47906826;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
_huebar = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
_colorpicker = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
_alphabar = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=47906827;
 //BA.debugLineNum = 47906827;BA.debugLine="Private BordersColor As Int";
_borderscolor = 0;
RDebugUtils.currentLine=47906828;
 //BA.debugLineNum = 47906828;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=47906829;
 //BA.debugLineNum = 47906829;BA.debugLine="Private InitialColor() As Object";
_initialcolor = new Object[(int) (0)];
{
int d0 = _initialcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_initialcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=47906830;
 //BA.debugLineNum = 47906830;BA.debugLine="End Sub";
return "";
}
public String  _colors_touch(b4a.example.ef.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "colors_touch", true))
	 {return ((String) Debug.delegate(ba, "colors_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="HandleSelectedColorChanged(X, Y)";
__ref._handleselectedcolorchanged /*String*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="End Sub";
return "";
}
public String  _handleselectedcolorchanged(b4a.example.ef.b4xcolortemplate __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "handleselectedcolorchanged", true))
	 {return ((String) Debug.delegate(ba, "handleselectedcolorchanged", new Object[] {_x,_y}));}
RDebugUtils.currentLine=48627712;
 //BA.debugLineNum = 48627712;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
RDebugUtils.currentLine=48627713;
 //BA.debugLineNum = 48627713;BA.debugLine="If x <> DONT_CHANGE Then";
if (_x!=__ref._dont_change /*int*/ ) { 
RDebugUtils.currentLine=48627714;
 //BA.debugLineNum = 48627714;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
__ref._selecteds /*float*/  = (float) (__c.Max(0,__c.Min(1,_x/(double)__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=48627715;
 //BA.debugLineNum = 48627715;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
__ref._selectedv /*float*/  = (float) (__c.Max(0,__c.Min(1,(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_y)/(double)__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 };
RDebugUtils.currentLine=48627717;
 //BA.debugLineNum = 48627717;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=48627718;
 //BA.debugLineNum = 48627718;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._selecteds /*float*/ *__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._selectedv /*float*/ *__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(float) (__c.DipToCurrent((int) (10))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=48627720;
 //BA.debugLineNum = 48627720;BA.debugLine="ColorPicker.cvs.Invalidate";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=48627721;
 //BA.debugLineNum = 48627721;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=48627722;
 //BA.debugLineNum = 48627722;BA.debugLine="End Sub";
return "";
}
public Object[]  _colortohsv(b4a.example.ef.b4xcolortemplate __ref,int _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "colortohsv", true))
	 {return ((Object[]) Debug.delegate(ba, "colortohsv", new Object[] {_clr}));}
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
float _h = 0f;
float _s = 0f;
float _v = 0f;
int _cmax = 0;
int _cmin = 0;
float _rc = 0f;
float _gc = 0f;
float _bc = 0f;
RDebugUtils.currentLine=48955392;
 //BA.debugLineNum = 48955392;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
RDebugUtils.currentLine=48955393;
 //BA.debugLineNum = 48955393;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_a = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (24)));
RDebugUtils.currentLine=48955394;
 //BA.debugLineNum = 48955394;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_r = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (16)));
RDebugUtils.currentLine=48955395;
 //BA.debugLineNum = 48955395;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_g = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (8)));
RDebugUtils.currentLine=48955396;
 //BA.debugLineNum = 48955396;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_b = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (0)));
RDebugUtils.currentLine=48955397;
 //BA.debugLineNum = 48955397;BA.debugLine="Dim h, s, v As Float";
_h = 0f;
_s = 0f;
_v = 0f;
RDebugUtils.currentLine=48955398;
 //BA.debugLineNum = 48955398;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
_cmax = (int) (__c.Max(__c.Max(_r,_g),_b));
RDebugUtils.currentLine=48955399;
 //BA.debugLineNum = 48955399;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
_cmin = (int) (__c.Min(__c.Min(_r,_g),_b));
RDebugUtils.currentLine=48955400;
 //BA.debugLineNum = 48955400;BA.debugLine="v = cmax / 255";
_v = (float) (_cmax/(double)255);
RDebugUtils.currentLine=48955401;
 //BA.debugLineNum = 48955401;BA.debugLine="If cmax <> 0 Then";
if (_cmax!=0) { 
RDebugUtils.currentLine=48955402;
 //BA.debugLineNum = 48955402;BA.debugLine="s = (cmax - cmin) / cmax";
_s = (float) ((_cmax-_cmin)/(double)_cmax);
 };
RDebugUtils.currentLine=48955404;
 //BA.debugLineNum = 48955404;BA.debugLine="If s = 0 Then";
if (_s==0) { 
RDebugUtils.currentLine=48955405;
 //BA.debugLineNum = 48955405;BA.debugLine="h = 0";
_h = (float) (0);
 }else {
RDebugUtils.currentLine=48955407;
 //BA.debugLineNum = 48955407;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
_rc = (float) ((_cmax-_r)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=48955408;
 //BA.debugLineNum = 48955408;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
_gc = (float) ((_cmax-_g)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=48955409;
 //BA.debugLineNum = 48955409;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
_bc = (float) ((_cmax-_b)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=48955410;
 //BA.debugLineNum = 48955410;BA.debugLine="If r = cmax Then";
if (_r==_cmax) { 
RDebugUtils.currentLine=48955411;
 //BA.debugLineNum = 48955411;BA.debugLine="h = bc - gc";
_h = (float) (_bc-_gc);
 }else 
{RDebugUtils.currentLine=48955412;
 //BA.debugLineNum = 48955412;BA.debugLine="Else If g = cmax Then";
if (_g==_cmax) { 
RDebugUtils.currentLine=48955413;
 //BA.debugLineNum = 48955413;BA.debugLine="h = 2 + rc - bc";
_h = (float) (2+_rc-_bc);
 }else {
RDebugUtils.currentLine=48955415;
 //BA.debugLineNum = 48955415;BA.debugLine="h = 4 + gc - rc";
_h = (float) (4+_gc-_rc);
 }}
;
RDebugUtils.currentLine=48955417;
 //BA.debugLineNum = 48955417;BA.debugLine="h = h / 6";
_h = (float) (_h/(double)6);
RDebugUtils.currentLine=48955418;
 //BA.debugLineNum = 48955418;BA.debugLine="If h < 0 Then h = h + 1";
if (_h<0) { 
_h = (float) (_h+1);};
 };
RDebugUtils.currentLine=48955420;
 //BA.debugLineNum = 48955420;BA.debugLine="Return Array (h * 360, s, v, a)";
if (true) return new Object[]{(Object)(_h*360),(Object)(_s),(Object)(_v),(Object)(_a)};
RDebugUtils.currentLine=48955421;
 //BA.debugLineNum = 48955421;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.b4xcolortemplate._colorpickerpart  _createpanelforbitmapcreator(b4a.example.ef.b4xcolortemplate __ref,String _eventname,boolean _withcheckers) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "createpanelforbitmapcreator", true))
	 {return ((b4a.example.ef.b4xcolortemplate._colorpickerpart) Debug.delegate(ba, "createpanelforbitmapcreator", new Object[] {_eventname,_withcheckers}));}
b4a.example.ef.b4xcolortemplate._colorpickerpart _cpp = null;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _overlay = null;
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="Dim cpp As ColorPickerPart";
_cpp = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=48037890;
 //BA.debugLineNum = 48037890;BA.debugLine="cpp.Initialize";
_cpp.Initialize();
RDebugUtils.currentLine=48037891;
 //BA.debugLineNum = 48037891;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=48037892;
 //BA.debugLineNum = 48037892;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=48037893;
 //BA.debugLineNum = 48037893;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=48037894;
 //BA.debugLineNum = 48037894;BA.debugLine="If WithCheckers Then";
if (_withcheckers) { 
RDebugUtils.currentLine=48037895;
 //BA.debugLineNum = 48037895;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=48037896;
 //BA.debugLineNum = 48037896;BA.debugLine="cpp.DrawCheckers = True";
_cpp.DrawCheckers /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=48037898;
 //BA.debugLineNum = 48037898;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=48037899;
 //BA.debugLineNum = 48037899;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=48037900;
 //BA.debugLineNum = 48037900;BA.debugLine="cpp.iv = iv";
_cpp.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=48037901;
 //BA.debugLineNum = 48037901;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
_overlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_overlay = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_eventname);
RDebugUtils.currentLine=48037902;
 //BA.debugLineNum = 48037902;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=48037903;
 //BA.debugLineNum = 48037903;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_overlay.getObject()),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=48037904;
 //BA.debugLineNum = 48037904;BA.debugLine="cpp.cvs.Initialize(overlay)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_overlay);
RDebugUtils.currentLine=48037905;
 //BA.debugLineNum = 48037905;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=48037906;
 //BA.debugLineNum = 48037906;BA.debugLine="Return cpp";
if (true) return _cpp;
RDebugUtils.currentLine=48037907;
 //BA.debugLineNum = 48037907;BA.debugLine="End Sub";
return null;
}
public String  _dialogclosed(b4a.example.ef.b4xcolortemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=49152001;
 //BA.debugLineNum = 49152001;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="setSelectedHSVColor(InitialColor)";
__ref._setselectedhsvcolor /*String*/ (null,__ref._initialcolor /*Object[]*/ );
 };
RDebugUtils.currentLine=49152004;
 //BA.debugLineNum = 49152004;BA.debugLine="End Sub";
return "";
}
public String  _setselectedhsvcolor(b4a.example.ef.b4xcolortemplate __ref,Object[] _hsv) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedhsvcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedhsvcolor", new Object[] {_hsv}));}
RDebugUtils.currentLine=48889856;
 //BA.debugLineNum = 48889856;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
RDebugUtils.currentLine=48889857;
 //BA.debugLineNum = 48889857;BA.debugLine="selectedH = HSV(0)";
__ref._selectedh /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (0)]));
RDebugUtils.currentLine=48889858;
 //BA.debugLineNum = 48889858;BA.debugLine="selectedS = HSV(1)";
__ref._selecteds /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (1)]));
RDebugUtils.currentLine=48889859;
 //BA.debugLineNum = 48889859;BA.debugLine="selectedV = HSV(2)";
__ref._selectedv /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (2)]));
RDebugUtils.currentLine=48889860;
 //BA.debugLineNum = 48889860;BA.debugLine="SelectedAlpha = HSV(3)";
__ref._selectedalpha /*int*/  = (int)(BA.ObjectToNumber(_hsv[(int) (3)]));
RDebugUtils.currentLine=48889861;
 //BA.debugLineNum = 48889861;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=48889862;
 //BA.debugLineNum = 48889862;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=48889863;
 //BA.debugLineNum = 48889863;BA.debugLine="End Sub";
return "";
}
public String  _drawcolors(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawcolors", true))
	 {return ((String) Debug.delegate(ba, "drawcolors", null));}
int _x = 0;
int _y = 0;
RDebugUtils.currentLine=48365568;
 //BA.debugLineNum = 48365568;BA.debugLine="Private Sub DrawColors";
RDebugUtils.currentLine=48365569;
 //BA.debugLineNum = 48365569;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._bccolors /*b4a.example.bitmapcreator*/ ._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit1 ;_x = _x + step1 ) {
RDebugUtils.currentLine=48365570;
 //BA.debugLineNum = 48365570;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight-1);
_y = (int) (0) ;
for (;_y <= limit2 ;_y = _y + step2 ) {
RDebugUtils.currentLine=48365571;
 //BA.debugLineNum = 48365571;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
__ref._bccolors /*b4a.example.bitmapcreator*/ ._sethsv(_x,_y,__ref._selectedalpha /*int*/ ,(int) (__ref._selectedh /*float*/ ),(float) (_x/(double)__ref._bccolors /*b4a.example.bitmapcreator*/ ._mwidth),(float) ((__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight-_y)/(double)__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight));
 }
};
 }
};
RDebugUtils.currentLine=48365575;
 //BA.debugLineNum = 48365575;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._bccolors /*b4a.example.bitmapcreator*/ ._getbitmap().Resize(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.False).getObject()));
RDebugUtils.currentLine=48365576;
 //BA.debugLineNum = 48365576;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.b4xcolortemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=49020928;
 //BA.debugLineNum = 49020928;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=49020929;
 //BA.debugLineNum = 49020929;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=49020930;
 //BA.debugLineNum = 49020930;BA.debugLine="End Sub";
return null;
}
public int  _getselectedcolor(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedcolor", null));}
Object[] _hsv = null;
RDebugUtils.currentLine=48693248;
 //BA.debugLineNum = 48693248;BA.debugLine="Public Sub getSelectedColor As Int";
RDebugUtils.currentLine=48693249;
 //BA.debugLineNum = 48693249;BA.debugLine="Dim hsv() As Object = getSelectedHSVColor";
_hsv = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=48693250;
 //BA.debugLineNum = 48693250;BA.debugLine="tempBC.SetHSV(0, 0, SelectedAlpha, hsv(0), hsv(1)";
__ref._tempbc /*b4a.example.bitmapcreator*/ ._sethsv((int) (0),(int) (0),__ref._selectedalpha /*int*/ ,(int)(BA.ObjectToNumber(_hsv[(int) (0)])),(float)(BA.ObjectToNumber(_hsv[(int) (1)])),(float)(BA.ObjectToNumber(_hsv[(int) (2)])));
RDebugUtils.currentLine=48693251;
 //BA.debugLineNum = 48693251;BA.debugLine="Return tempBC.GetColor(0, 0)";
if (true) return __ref._tempbc /*b4a.example.bitmapcreator*/ ._getcolor((int) (0),(int) (0));
RDebugUtils.currentLine=48693252;
 //BA.debugLineNum = 48693252;BA.debugLine="End Sub";
return 0;
}
public Object[]  _getselectedhsvcolor(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedhsvcolor", true))
	 {return ((Object[]) Debug.delegate(ba, "getselectedhsvcolor", null));}
RDebugUtils.currentLine=48824320;
 //BA.debugLineNum = 48824320;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
RDebugUtils.currentLine=48824321;
 //BA.debugLineNum = 48824321;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
if (true) return new Object[]{(Object)(__ref._selectedh /*float*/ ),(Object)(__ref._selecteds /*float*/ ),(Object)(__ref._selectedv /*float*/ ),(Object)(__ref._selectedalpha /*int*/ )};
RDebugUtils.currentLine=48824322;
 //BA.debugLineNum = 48824322;BA.debugLine="End Sub";
return null;
}
public String  _updatebarcolor(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "updatebarcolor", true))
	 {return ((String) Debug.delegate(ba, "updatebarcolor", null));}
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Private Sub UpdateBarColor";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="If xDialog.IsInitialized And xDialog.TitleBar.IsI";
if (__ref._xdialog /*b4a.example.ef.b4xdialog*/ .IsInitialized /*boolean*/ () && __ref._xdialog /*b4a.example.ef.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="xDialog.TitleBar.Color = getSelectedColor";
__ref._xdialog /*b4a.example.ef.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._getselectedcolor /*int*/ (null));
 };
RDebugUtils.currentLine=49217540;
 //BA.debugLineNum = 49217540;BA.debugLine="End Sub";
return "";
}
public String  _huebar_touch(b4a.example.ef.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebar_touch", true))
	 {return ((String) Debug.delegate(ba, "huebar_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="HueBarSelectedChanged(Y)";
__ref._huebarselectedchanged /*String*/ (null,_y);
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xcolortemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="tempBC.Initialize(1, 1)";
__ref._tempbc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=47972354;
 //BA.debugLineNum = 47972354;BA.debugLine="DeviceScale = 100dip / 100";
__ref._devicescale /*float*/  = (float) (__c.DipToCurrent((int) (100))/(double)100);
RDebugUtils.currentLine=47972355;
 //BA.debugLineNum = 47972355;BA.debugLine="mBase = xui.CreatePanel(\"\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=47972356;
 //BA.debugLineNum = 47972356;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=47972357;
 //BA.debugLineNum = 47972357;BA.debugLine="BordersColor = xui.Color_Black";
__ref._borderscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=47972358;
 //BA.debugLineNum = 47972358;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 1dip, Borde";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=47972359;
 //BA.debugLineNum = 47972359;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ (null,"hueBar",__c.False);
RDebugUtils.currentLine=47972360;
 //BA.debugLineNum = 47972360;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ (null,"colors",__c.True);
RDebugUtils.currentLine=47972361;
 //BA.debugLineNum = 47972361;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ (null,"alpha",__c.True);
RDebugUtils.currentLine=47972362;
 //BA.debugLineNum = 47972362;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=47972363;
 //BA.debugLineNum = 47972363;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcolor(b4a.example.ef.b4xcolortemplate __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedcolor", new Object[] {_i}));}
RDebugUtils.currentLine=48758784;
 //BA.debugLineNum = 48758784;BA.debugLine="Public Sub setSelectedColor(i As Int)";
RDebugUtils.currentLine=48758785;
 //BA.debugLineNum = 48758785;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
__ref._setselectedhsvcolor /*String*/ (null,__ref._colortohsv /*Object[]*/ (null,_i));
RDebugUtils.currentLine=48758786;
 //BA.debugLineNum = 48758786;BA.debugLine="End Sub";
return "";
}
public void  _show(b4a.example.ef.b4xcolortemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.ef.b4xcolortemplate parent,b4a.example.ef.b4xcolortemplate __ref,b4a.example.ef.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.ef.b4xcolortemplate __ref;
b4a.example.ef.b4xcolortemplate parent;
b4a.example.ef.b4xdialog _dialog;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xcolortemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=49086465;
 //BA.debugLineNum = 49086465;BA.debugLine="InitialColor = getSelectedHSVColor";
__ref._initialcolor /*Object[]*/  = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.ef.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=49086467;
 //BA.debugLineNum = 49086467;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcolortemplate", "show"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=49086469;
 //BA.debugLineNum = 49086469;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}