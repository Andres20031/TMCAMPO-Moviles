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
RDebugUtils.currentLine=64094208;
 //BA.debugLineNum = 64094208;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
RDebugUtils.currentLine=64094209;
 //BA.debugLineNum = 64094209;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=64094210;
 //BA.debugLineNum = 64094210;BA.debugLine="AlphaBarSelectedChange(x)";
__ref._alphabarselectedchange /*String*/ (null,_x);
RDebugUtils.currentLine=64094211;
 //BA.debugLineNum = 64094211;BA.debugLine="End Sub";
return "";
}
public String  _alphabarselectedchange(b4a.example.ef.b4xcolortemplate __ref,float _x) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "alphabarselectedchange", true))
	 {return ((String) Debug.delegate(ba, "alphabarselectedchange", new Object[] {_x}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=63176704;
 //BA.debugLineNum = 63176704;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
__ref._selectedalpha /*int*/  = (int) (255*__c.Max(0,__c.Min(1,_x/(double)__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=63176706;
 //BA.debugLineNum = 63176706;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
_x = (float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=63176707;
 //BA.debugLineNum = 63176707;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=63176708;
 //BA.debugLineNum = 63176708;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=63176709;
 //BA.debugLineNum = 63176709;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
_r.Initialize((float) (_x-__c.DipToCurrent((int) (3))),(float) (__c.DipToCurrent((int) (1))),(float) (_x+__c.DipToCurrent((int) (3))),(float) (__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=63176710;
 //BA.debugLineNum = 63176710;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black,__c.True,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=63176711;
 //BA.debugLineNum = 63176711;BA.debugLine="AlphaBar.cvs.Invalidate";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=63176712;
 //BA.debugLineNum = 63176712;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=63176713;
 //BA.debugLineNum = 63176713;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
RDebugUtils.currentLine=63242240;
 //BA.debugLineNum = 63242240;BA.debugLine="Private Sub Update";
RDebugUtils.currentLine=63242241;
 //BA.debugLineNum = 63242241;BA.debugLine="DrawColors";
__ref._drawcolors /*String*/ (null);
RDebugUtils.currentLine=63242242;
 //BA.debugLineNum = 63242242;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
__ref._handleselectedcolorchanged /*String*/ (null,__ref._dont_change /*int*/ ,__ref._dont_change /*int*/ );
RDebugUtils.currentLine=63242243;
 //BA.debugLineNum = 63242243;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=62783488;
 //BA.debugLineNum = 62783488;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
__ref._colorscale /*float*/  = (float) (__c.Max(1,__c.Max(_width,_height)/(double)100/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=62783491;
 //BA.debugLineNum = 62783491;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (30)),(int) (_height-__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=62783492;
 //BA.debugLineNum = 62783492;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
_r = (int) (__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()+__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getLeft()+__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=62783493;
 //BA.debugLineNum = 62783493;BA.debugLine="Dim w As Int = Width - r - 1dip";
_w = (int) (_width-_r-__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=62783494;
 //BA.debugLineNum = 62783494;BA.debugLine="If xui.IsB4i Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4i()) { 
RDebugUtils.currentLine=62783495;
 //BA.debugLineNum = 62783495;BA.debugLine="r = r - 1";
_r = (int) (_r-1);
RDebugUtils.currentLine=62783496;
 //BA.debugLineNum = 62783496;BA.debugLine="w = w + 1";
_w = (int) (_w+1);
 };
RDebugUtils.currentLine=62783498;
 //BA.debugLineNum = 62783498;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,(int) (_height-__c.DipToCurrent((int) (31))),_w,__c.DipToCurrent((int) (30)));
RDebugUtils.currentLine=62783499;
 //BA.debugLineNum = 62783499;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),_r,__c.DipToCurrent((int) (1)),_w,(int) (_height-__c.DipToCurrent((int) (3))-__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=62783500;
 //BA.debugLineNum = 62783500;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
__ref._bccolors /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._colorscale /*float*/ ),(int) (__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._colorscale /*float*/ ));
RDebugUtils.currentLine=62783501;
 //BA.debugLineNum = 62783501;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
{
final Object[] group12 = new Object[]{(Object)(__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ ),(Object)(__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ )};
final int groupLen12 = group12.length
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (b4a.example.ef.b4xcolortemplate._colorpickerpart)(group12[index12]);
RDebugUtils.currentLine=62783502;
 //BA.debugLineNum = 62783502;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
{
final int step13 = 1;
final int limit13 = (int) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=62783503;
 //BA.debugLineNum = 62783503;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 }
};
RDebugUtils.currentLine=62783505;
 //BA.debugLineNum = 62783505;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=62783506;
 //BA.debugLineNum = 62783506;BA.debugLine="If cpp.DrawCheckers Then";
if (_cpp.DrawCheckers /*boolean*/ ) { 
RDebugUtils.currentLine=62783507;
 //BA.debugLineNum = 62783507;BA.debugLine="DrawCheckers(cpp)";
__ref._drawcheckers /*String*/ (null,_cpp);
 };
 }
};
RDebugUtils.currentLine=62783510;
 //BA.debugLineNum = 62783510;BA.debugLine="DrawHueBar";
__ref._drawhuebar /*String*/ (null);
RDebugUtils.currentLine=62783511;
 //BA.debugLineNum = 62783511;BA.debugLine="DrawAlphaBar";
__ref._drawalphabar /*String*/ (null);
RDebugUtils.currentLine=62783512;
 //BA.debugLineNum = 62783512;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=62783513;
 //BA.debugLineNum = 62783513;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=62783514;
 //BA.debugLineNum = 62783514;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
RDebugUtils.currentLine=62849025;
 //BA.debugLineNum = 62849025;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Resize((float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=62849027;
 //BA.debugLineNum = 62849027;BA.debugLine="Dim size As Int = 10dip";
_size = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=62849028;
 //BA.debugLineNum = 62849028;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
_clrs = new int[]{((int)0xffc0c0c0),((int)0xff757575)};
RDebugUtils.currentLine=62849029;
 //BA.debugLineNum = 62849029;BA.debugLine="Dim clr As Int = 0";
_clr = (int) (0);
RDebugUtils.currentLine=62849030;
 //BA.debugLineNum = 62849030;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=62849031;
 //BA.debugLineNum = 62849031;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
{
final int step7 = _size;
final int limit7 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight()-__c.DipToCurrent((int) (1)));
_x = (int) (0) ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
RDebugUtils.currentLine=62849032;
 //BA.debugLineNum = 62849032;BA.debugLine="Dim xx As Int = x / size";
_xx = (int) (_x/(double)_size);
RDebugUtils.currentLine=62849033;
 //BA.debugLineNum = 62849033;BA.debugLine="clr = xx Mod 2";
_clr = (int) (_xx%2);
RDebugUtils.currentLine=62849034;
 //BA.debugLineNum = 62849034;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
{
final int step10 = _size;
final int limit10 = (int) (_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getBottom()-__c.DipToCurrent((int) (1)));
_y = (int) (0) ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
RDebugUtils.currentLine=62849035;
 //BA.debugLineNum = 62849035;BA.debugLine="clr = (clr + 1) Mod 2";
_clr = (int) ((_clr+1)%2);
RDebugUtils.currentLine=62849036;
 //BA.debugLineNum = 62849036;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
_r.Initialize((float) (_x),(float) (_y),(float) (_x+_size),(float) (_y+_size));
RDebugUtils.currentLine=62849037;
 //BA.debugLineNum = 62849037;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,_clrs[_clr],__c.True,(float) (0));
 }
};
 }
};
RDebugUtils.currentLine=62849040;
 //BA.debugLineNum = 62849040;BA.debugLine="cpp.checkersCanvas.Invalidate";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=62849041;
 //BA.debugLineNum = 62849041;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Private Sub DrawHueBar";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="Dim bcHue As BitmapCreator";
_bchue = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
_bchue._initialize(ba,(int) (__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=62914563;
 //BA.debugLineNum = 62914563;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
{
final int step3 = 1;
final int limit3 = (int) (_bchue._mheight-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
RDebugUtils.currentLine=62914564;
 //BA.debugLineNum = 62914564;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
{
final int step4 = 1;
final int limit4 = (int) (_bchue._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
RDebugUtils.currentLine=62914565;
 //BA.debugLineNum = 62914565;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
_bchue._sethsv(_x,_y,(int) (255),(int) (360/(double)_bchue._mheight*_y),(float) (1),(float) (1));
 }
};
 }
};
RDebugUtils.currentLine=62914568;
 //BA.debugLineNum = 62914568;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bchue._getbitmap().getObject()));
RDebugUtils.currentLine=62914569;
 //BA.debugLineNum = 62914569;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=62980096;
 //BA.debugLineNum = 62980096;BA.debugLine="Private Sub DrawAlphaBar";
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="Dim bc As BitmapCreator";
_bc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=62980098;
 //BA.debugLineNum = 62980098;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
_bc._initialize(ba,(int) (__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._devicescale /*float*/ ),(int) (__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._devicescale /*float*/ ));
RDebugUtils.currentLine=62980099;
 //BA.debugLineNum = 62980099;BA.debugLine="Dim argb As ARGBColor";
_argb = new b4a.example.bitmapcreator._argbcolor();
RDebugUtils.currentLine=62980100;
 //BA.debugLineNum = 62980100;BA.debugLine="argb.r = 0xcc";
_argb.r = ((int)0xcc);
RDebugUtils.currentLine=62980101;
 //BA.debugLineNum = 62980101;BA.debugLine="argb.g = 0xcc";
_argb.g = ((int)0xcc);
RDebugUtils.currentLine=62980102;
 //BA.debugLineNum = 62980102;BA.debugLine="argb.b = 0xcc";
_argb.b = ((int)0xcc);
RDebugUtils.currentLine=62980104;
 //BA.debugLineNum = 62980104;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
final int step7 = 1;
final int limit7 = (int) (_bc._mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
RDebugUtils.currentLine=62980105;
 //BA.debugLineNum = 62980105;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
final int step8 = 1;
final int limit8 = (int) (_bc._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=62980106;
 //BA.debugLineNum = 62980106;BA.debugLine="argb.a = x / bc.mWidth * 255";
_argb.a = (int) (_x/(double)_bc._mwidth*255);
RDebugUtils.currentLine=62980107;
 //BA.debugLineNum = 62980107;BA.debugLine="bc.SetARGB(x, y, argb)";
_bc._setargb(_x,_y,_argb);
 }
};
 }
};
RDebugUtils.currentLine=62980110;
 //BA.debugLineNum = 62980110;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(_bc._getbitmap().getObject()));
RDebugUtils.currentLine=62980111;
 //BA.debugLineNum = 62980111;BA.debugLine="End Sub";
return "";
}
public String  _huebarselectedchanged(b4a.example.ef.b4xcolortemplate __ref,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebarselectedchanged", true))
	 {return ((String) Debug.delegate(ba, "huebarselectedchanged", new Object[] {_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
__ref._selectedh /*float*/  = (float) (__c.Max(0,__c.Min(360,360*_y/(double)__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=63111170;
 //BA.debugLineNum = 63111170;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
_y = (float) (__ref._selectedh /*float*/ *__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)360);
RDebugUtils.currentLine=63111171;
 //BA.debugLineNum = 63111171;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=63111172;
 //BA.debugLineNum = 63111172;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=63111173;
 //BA.debugLineNum = 63111173;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
_r.Initialize((float) (0),(float) (_y-__c.DipToCurrent((int) (3))),__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getRight(),(float) (_y+__c.DipToCurrent((int) (3))));
RDebugUtils.currentLine=63111174;
 //BA.debugLineNum = 63111174;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawRect(_r,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=63111175;
 //BA.debugLineNum = 63111175;BA.debugLine="HueBar.cvs.Invalidate";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=63111176;
 //BA.debugLineNum = 63111176;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=63111177;
 //BA.debugLineNum = 63111177;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
RDebugUtils.currentLine=62586880;
 //BA.debugLineNum = 62586880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=62586881;
 //BA.debugLineNum = 62586881;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=62586882;
 //BA.debugLineNum = 62586882;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=62586883;
 //BA.debugLineNum = 62586883;BA.debugLine="Private SelectedAlpha As Int = 255";
_selectedalpha = (int) (255);
RDebugUtils.currentLine=62586884;
 //BA.debugLineNum = 62586884;BA.debugLine="Private bcColors As BitmapCreator";
_bccolors = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=62586885;
 //BA.debugLineNum = 62586885;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
_selectedh = (float) (60);
_selecteds = (float) (0.5);
_selectedv = (float) (0.5);
RDebugUtils.currentLine=62586886;
 //BA.debugLineNum = 62586886;BA.debugLine="Private DeviceScale, ColorScale As Float";
_devicescale = 0f;
_colorscale = 0f;
RDebugUtils.currentLine=62586887;
 //BA.debugLineNum = 62586887;BA.debugLine="Private tempBC As BitmapCreator";
_tempbc = new b4a.example.bitmapcreator();
RDebugUtils.currentLine=62586888;
 //BA.debugLineNum = 62586888;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
_dont_change = (int) (-999999999);
RDebugUtils.currentLine=62586889;
 //BA.debugLineNum = 62586889;BA.debugLine="Type ColorPickerPart (cvs As B4XCanvas, pnl As B4";
;
RDebugUtils.currentLine=62586890;
 //BA.debugLineNum = 62586890;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
_huebar = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
_colorpicker = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
_alphabar = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=62586891;
 //BA.debugLineNum = 62586891;BA.debugLine="Private BordersColor As Int";
_borderscolor = 0;
RDebugUtils.currentLine=62586892;
 //BA.debugLineNum = 62586892;BA.debugLine="Private xDialog As B4XDialog";
_xdialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=62586893;
 //BA.debugLineNum = 62586893;BA.debugLine="Private InitialColor() As Object";
_initialcolor = new Object[(int) (0)];
{
int d0 = _initialcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_initialcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=62586894;
 //BA.debugLineNum = 62586894;BA.debugLine="End Sub";
return "";
}
public String  _colors_touch(b4a.example.ef.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "colors_touch", true))
	 {return ((String) Debug.delegate(ba, "colors_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=63963136;
 //BA.debugLineNum = 63963136;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=63963137;
 //BA.debugLineNum = 63963137;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=63963138;
 //BA.debugLineNum = 63963138;BA.debugLine="HandleSelectedColorChanged(X, Y)";
__ref._handleselectedcolorchanged /*String*/ (null,(int) (_x),(int) (_y));
RDebugUtils.currentLine=63963139;
 //BA.debugLineNum = 63963139;BA.debugLine="End Sub";
return "";
}
public String  _handleselectedcolorchanged(b4a.example.ef.b4xcolortemplate __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "handleselectedcolorchanged", true))
	 {return ((String) Debug.delegate(ba, "handleselectedcolorchanged", new Object[] {_x,_y}));}
RDebugUtils.currentLine=63307776;
 //BA.debugLineNum = 63307776;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
RDebugUtils.currentLine=63307777;
 //BA.debugLineNum = 63307777;BA.debugLine="If x <> DONT_CHANGE Then";
if (_x!=__ref._dont_change /*int*/ ) { 
RDebugUtils.currentLine=63307778;
 //BA.debugLineNum = 63307778;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
__ref._selecteds /*float*/  = (float) (__c.Max(0,__c.Min(1,_x/(double)__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())));
RDebugUtils.currentLine=63307779;
 //BA.debugLineNum = 63307779;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
__ref._selectedv /*float*/  = (float) (__c.Max(0,__c.Min(1,(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-_y)/(double)__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
 };
RDebugUtils.currentLine=63307781;
 //BA.debugLineNum = 63307781;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=63307782;
 //BA.debugLineNum = 63307782;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawCircle((float) (__ref._selecteds /*float*/ *__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()),(float) (__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._selectedv /*float*/ *__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(float) (__c.DipToCurrent((int) (10))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__c.False,(float) (__c.DipToCurrent((int) (2))));
RDebugUtils.currentLine=63307784;
 //BA.debugLineNum = 63307784;BA.debugLine="ColorPicker.cvs.Invalidate";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=63307785;
 //BA.debugLineNum = 63307785;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=63307786;
 //BA.debugLineNum = 63307786;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=63635456;
 //BA.debugLineNum = 63635456;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
RDebugUtils.currentLine=63635457;
 //BA.debugLineNum = 63635457;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_a = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (24)));
RDebugUtils.currentLine=63635458;
 //BA.debugLineNum = 63635458;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_r = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (16)));
RDebugUtils.currentLine=63635459;
 //BA.debugLineNum = 63635459;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_g = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (8)));
RDebugUtils.currentLine=63635460;
 //BA.debugLineNum = 63635460;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_b = __c.Bit.And(((int)0xff),__c.Bit.UnsignedShiftRight(_clr,(int) (0)));
RDebugUtils.currentLine=63635461;
 //BA.debugLineNum = 63635461;BA.debugLine="Dim h, s, v As Float";
_h = 0f;
_s = 0f;
_v = 0f;
RDebugUtils.currentLine=63635462;
 //BA.debugLineNum = 63635462;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
_cmax = (int) (__c.Max(__c.Max(_r,_g),_b));
RDebugUtils.currentLine=63635463;
 //BA.debugLineNum = 63635463;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
_cmin = (int) (__c.Min(__c.Min(_r,_g),_b));
RDebugUtils.currentLine=63635464;
 //BA.debugLineNum = 63635464;BA.debugLine="v = cmax / 255";
_v = (float) (_cmax/(double)255);
RDebugUtils.currentLine=63635465;
 //BA.debugLineNum = 63635465;BA.debugLine="If cmax <> 0 Then";
if (_cmax!=0) { 
RDebugUtils.currentLine=63635466;
 //BA.debugLineNum = 63635466;BA.debugLine="s = (cmax - cmin) / cmax";
_s = (float) ((_cmax-_cmin)/(double)_cmax);
 };
RDebugUtils.currentLine=63635468;
 //BA.debugLineNum = 63635468;BA.debugLine="If s = 0 Then";
if (_s==0) { 
RDebugUtils.currentLine=63635469;
 //BA.debugLineNum = 63635469;BA.debugLine="h = 0";
_h = (float) (0);
 }else {
RDebugUtils.currentLine=63635471;
 //BA.debugLineNum = 63635471;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
_rc = (float) ((_cmax-_r)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=63635472;
 //BA.debugLineNum = 63635472;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
_gc = (float) ((_cmax-_g)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=63635473;
 //BA.debugLineNum = 63635473;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
_bc = (float) ((_cmax-_b)/(double)(_cmax-_cmin));
RDebugUtils.currentLine=63635474;
 //BA.debugLineNum = 63635474;BA.debugLine="If r = cmax Then";
if (_r==_cmax) { 
RDebugUtils.currentLine=63635475;
 //BA.debugLineNum = 63635475;BA.debugLine="h = bc - gc";
_h = (float) (_bc-_gc);
 }else 
{RDebugUtils.currentLine=63635476;
 //BA.debugLineNum = 63635476;BA.debugLine="Else If g = cmax Then";
if (_g==_cmax) { 
RDebugUtils.currentLine=63635477;
 //BA.debugLineNum = 63635477;BA.debugLine="h = 2 + rc - bc";
_h = (float) (2+_rc-_bc);
 }else {
RDebugUtils.currentLine=63635479;
 //BA.debugLineNum = 63635479;BA.debugLine="h = 4 + gc - rc";
_h = (float) (4+_gc-_rc);
 }}
;
RDebugUtils.currentLine=63635481;
 //BA.debugLineNum = 63635481;BA.debugLine="h = h / 6";
_h = (float) (_h/(double)6);
RDebugUtils.currentLine=63635482;
 //BA.debugLineNum = 63635482;BA.debugLine="If h < 0 Then h = h + 1";
if (_h<0) { 
_h = (float) (_h+1);};
 };
RDebugUtils.currentLine=63635484;
 //BA.debugLineNum = 63635484;BA.debugLine="Return Array (h * 360, s, v, a)";
if (true) return new Object[]{(Object)(_h*360),(Object)(_s),(Object)(_v),(Object)(_a)};
RDebugUtils.currentLine=63635485;
 //BA.debugLineNum = 63635485;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=62717952;
 //BA.debugLineNum = 62717952;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
RDebugUtils.currentLine=62717953;
 //BA.debugLineNum = 62717953;BA.debugLine="Dim cpp As ColorPickerPart";
_cpp = new b4a.example.ef.b4xcolortemplate._colorpickerpart();
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="cpp.Initialize";
_cpp.Initialize();
RDebugUtils.currentLine=62717955;
 //BA.debugLineNum = 62717955;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=62717956;
 //BA.debugLineNum = 62717956;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=62717957;
 //BA.debugLineNum = 62717957;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=62717958;
 //BA.debugLineNum = 62717958;BA.debugLine="If WithCheckers Then";
if (_withcheckers) { 
RDebugUtils.currentLine=62717959;
 //BA.debugLineNum = 62717959;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
_cpp.checkersCanvas /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=62717960;
 //BA.debugLineNum = 62717960;BA.debugLine="cpp.DrawCheckers = True";
_cpp.DrawCheckers /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=62717962;
 //BA.debugLineNum = 62717962;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=62717963;
 //BA.debugLineNum = 62717963;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
RDebugUtils.currentLine=62717964;
 //BA.debugLineNum = 62717964;BA.debugLine="cpp.iv = iv";
_cpp.iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=62717965;
 //BA.debugLineNum = 62717965;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
_overlay = new anywheresoftware.b4a.objects.B4XViewWrapper();
_overlay = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,_eventname);
RDebugUtils.currentLine=62717966;
 //BA.debugLineNum = 62717966;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_iv.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=62717967;
 //BA.debugLineNum = 62717967;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_overlay.getObject()),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)),__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=62717968;
 //BA.debugLineNum = 62717968;BA.debugLine="cpp.cvs.Initialize(overlay)";
_cpp.cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(_overlay);
RDebugUtils.currentLine=62717969;
 //BA.debugLineNum = 62717969;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_cpp.pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=62717970;
 //BA.debugLineNum = 62717970;BA.debugLine="Return cpp";
if (true) return _cpp;
RDebugUtils.currentLine=62717971;
 //BA.debugLineNum = 62717971;BA.debugLine="End Sub";
return null;
}
public String  _dialogclosed(b4a.example.ef.b4xcolortemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=63832064;
 //BA.debugLineNum = 63832064;BA.debugLine="Private Sub DialogClosed(Result As Int)";
RDebugUtils.currentLine=63832065;
 //BA.debugLineNum = 63832065;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=63832066;
 //BA.debugLineNum = 63832066;BA.debugLine="setSelectedHSVColor(InitialColor)";
__ref._setselectedhsvcolor /*String*/ (null,__ref._initialcolor /*Object[]*/ );
 };
RDebugUtils.currentLine=63832068;
 //BA.debugLineNum = 63832068;BA.debugLine="End Sub";
return "";
}
public String  _setselectedhsvcolor(b4a.example.ef.b4xcolortemplate __ref,Object[] _hsv) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedhsvcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedhsvcolor", new Object[] {_hsv}));}
RDebugUtils.currentLine=63569920;
 //BA.debugLineNum = 63569920;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
RDebugUtils.currentLine=63569921;
 //BA.debugLineNum = 63569921;BA.debugLine="selectedH = HSV(0)";
__ref._selectedh /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (0)]));
RDebugUtils.currentLine=63569922;
 //BA.debugLineNum = 63569922;BA.debugLine="selectedS = HSV(1)";
__ref._selecteds /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (1)]));
RDebugUtils.currentLine=63569923;
 //BA.debugLineNum = 63569923;BA.debugLine="selectedV = HSV(2)";
__ref._selectedv /*float*/  = (float)(BA.ObjectToNumber(_hsv[(int) (2)]));
RDebugUtils.currentLine=63569924;
 //BA.debugLineNum = 63569924;BA.debugLine="SelectedAlpha = HSV(3)";
__ref._selectedalpha /*int*/  = (int)(BA.ObjectToNumber(_hsv[(int) (3)]));
RDebugUtils.currentLine=63569925;
 //BA.debugLineNum = 63569925;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
__ref._huebarselectedchanged /*String*/ (null,(float) (__ref._selectedh /*float*/ /(double)360*__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()));
RDebugUtils.currentLine=63569926;
 //BA.debugLineNum = 63569926;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
__ref._alphabarselectedchange /*String*/ (null,(float) (__ref._selectedalpha /*int*/ /(double)255*__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .pnl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=63569927;
 //BA.debugLineNum = 63569927;BA.debugLine="End Sub";
return "";
}
public String  _drawcolors(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "drawcolors", true))
	 {return ((String) Debug.delegate(ba, "drawcolors", null));}
int _x = 0;
int _y = 0;
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Private Sub DrawColors";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._bccolors /*b4a.example.bitmapcreator*/ ._mwidth-1);
_x = (int) (0) ;
for (;_x <= limit1 ;_x = _x + step1 ) {
RDebugUtils.currentLine=63045634;
 //BA.debugLineNum = 63045634;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight-1);
_y = (int) (0) ;
for (;_y <= limit2 ;_y = _y + step2 ) {
RDebugUtils.currentLine=63045635;
 //BA.debugLineNum = 63045635;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
__ref._bccolors /*b4a.example.bitmapcreator*/ ._sethsv(_x,_y,__ref._selectedalpha /*int*/ ,(int) (__ref._selectedh /*float*/ ),(float) (_x/(double)__ref._bccolors /*b4a.example.bitmapcreator*/ ._mwidth),(float) ((__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight-_y)/(double)__ref._bccolors /*b4a.example.bitmapcreator*/ ._mheight));
 }
};
 }
};
RDebugUtils.currentLine=63045639;
 //BA.debugLineNum = 63045639;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._bccolors /*b4a.example.bitmapcreator*/ ._getbitmap().Resize(__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ .iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__c.False).getObject()));
RDebugUtils.currentLine=63045640;
 //BA.debugLineNum = 63045640;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.b4xcolortemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=63700992;
 //BA.debugLineNum = 63700992;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=63700993;
 //BA.debugLineNum = 63700993;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=63700994;
 //BA.debugLineNum = 63700994;BA.debugLine="End Sub";
return null;
}
public int  _getselectedcolor(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselectedcolor", null));}
Object[] _hsv = null;
RDebugUtils.currentLine=63373312;
 //BA.debugLineNum = 63373312;BA.debugLine="Public Sub getSelectedColor As Int";
RDebugUtils.currentLine=63373313;
 //BA.debugLineNum = 63373313;BA.debugLine="Dim hsv() As Object = getSelectedHSVColor";
_hsv = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=63373314;
 //BA.debugLineNum = 63373314;BA.debugLine="tempBC.SetHSV(0, 0, SelectedAlpha, hsv(0), hsv(1)";
__ref._tempbc /*b4a.example.bitmapcreator*/ ._sethsv((int) (0),(int) (0),__ref._selectedalpha /*int*/ ,(int)(BA.ObjectToNumber(_hsv[(int) (0)])),(float)(BA.ObjectToNumber(_hsv[(int) (1)])),(float)(BA.ObjectToNumber(_hsv[(int) (2)])));
RDebugUtils.currentLine=63373315;
 //BA.debugLineNum = 63373315;BA.debugLine="Return tempBC.GetColor(0, 0)";
if (true) return __ref._tempbc /*b4a.example.bitmapcreator*/ ._getcolor((int) (0),(int) (0));
RDebugUtils.currentLine=63373316;
 //BA.debugLineNum = 63373316;BA.debugLine="End Sub";
return 0;
}
public Object[]  _getselectedhsvcolor(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "getselectedhsvcolor", true))
	 {return ((Object[]) Debug.delegate(ba, "getselectedhsvcolor", null));}
RDebugUtils.currentLine=63504384;
 //BA.debugLineNum = 63504384;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
RDebugUtils.currentLine=63504385;
 //BA.debugLineNum = 63504385;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
if (true) return new Object[]{(Object)(__ref._selectedh /*float*/ ),(Object)(__ref._selecteds /*float*/ ),(Object)(__ref._selectedv /*float*/ ),(Object)(__ref._selectedalpha /*int*/ )};
RDebugUtils.currentLine=63504386;
 //BA.debugLineNum = 63504386;BA.debugLine="End Sub";
return null;
}
public String  _updatebarcolor(b4a.example.ef.b4xcolortemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "updatebarcolor", true))
	 {return ((String) Debug.delegate(ba, "updatebarcolor", null));}
RDebugUtils.currentLine=63897600;
 //BA.debugLineNum = 63897600;BA.debugLine="Private Sub UpdateBarColor";
RDebugUtils.currentLine=63897601;
 //BA.debugLineNum = 63897601;BA.debugLine="If xDialog.IsInitialized And xDialog.TitleBar.IsI";
if (__ref._xdialog /*b4a.example.ef.b4xdialog*/ .IsInitialized /*boolean*/ () && __ref._xdialog /*b4a.example.ef.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=63897602;
 //BA.debugLineNum = 63897602;BA.debugLine="xDialog.TitleBar.Color = getSelectedColor";
__ref._xdialog /*b4a.example.ef.b4xdialog*/ ._titlebar /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._getselectedcolor /*int*/ (null));
 };
RDebugUtils.currentLine=63897604;
 //BA.debugLineNum = 63897604;BA.debugLine="End Sub";
return "";
}
public String  _huebar_touch(b4a.example.ef.b4xcolortemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "huebar_touch", true))
	 {return ((String) Debug.delegate(ba, "huebar_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=64028672;
 //BA.debugLineNum = 64028672;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
RDebugUtils.currentLine=64028673;
 //BA.debugLineNum = 64028673;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .TOUCH_ACTION_MOVE_NOTOUCH) { 
if (true) return "";};
RDebugUtils.currentLine=64028674;
 //BA.debugLineNum = 64028674;BA.debugLine="HueBarSelectedChanged(Y)";
__ref._huebarselectedchanged /*String*/ (null,_y);
RDebugUtils.currentLine=64028675;
 //BA.debugLineNum = 64028675;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xcolortemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=62652416;
 //BA.debugLineNum = 62652416;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=62652417;
 //BA.debugLineNum = 62652417;BA.debugLine="tempBC.Initialize(1, 1)";
__ref._tempbc /*b4a.example.bitmapcreator*/ ._initialize(ba,(int) (1),(int) (1));
RDebugUtils.currentLine=62652418;
 //BA.debugLineNum = 62652418;BA.debugLine="DeviceScale = 100dip / 100";
__ref._devicescale /*float*/  = (float) (__c.DipToCurrent((int) (100))/(double)100);
RDebugUtils.currentLine=62652419;
 //BA.debugLineNum = 62652419;BA.debugLine="mBase = xui.CreatePanel(\"\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=62652420;
 //BA.debugLineNum = 62652420;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (250)));
RDebugUtils.currentLine=62652421;
 //BA.debugLineNum = 62652421;BA.debugLine="BordersColor = xui.Color_Black";
__ref._borderscolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=62652422;
 //BA.debugLineNum = 62652422;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 1dip, Borde";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (1)),__ref._borderscolor /*int*/ ,__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=62652423;
 //BA.debugLineNum = 62652423;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
__ref._huebar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ (null,"hueBar",__c.False);
RDebugUtils.currentLine=62652424;
 //BA.debugLineNum = 62652424;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
__ref._colorpicker /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ (null,"colors",__c.True);
RDebugUtils.currentLine=62652425;
 //BA.debugLineNum = 62652425;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
__ref._alphabar /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/  = __ref._createpanelforbitmapcreator /*b4a.example.ef.b4xcolortemplate._colorpickerpart*/ (null,"alpha",__c.True);
RDebugUtils.currentLine=62652426;
 //BA.debugLineNum = 62652426;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
__ref._base_resize /*String*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=62652427;
 //BA.debugLineNum = 62652427;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcolor(b4a.example.ef.b4xcolortemplate __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcolortemplate";
if (Debug.shouldDelegate(ba, "setselectedcolor", true))
	 {return ((String) Debug.delegate(ba, "setselectedcolor", new Object[] {_i}));}
RDebugUtils.currentLine=63438848;
 //BA.debugLineNum = 63438848;BA.debugLine="Public Sub setSelectedColor(i As Int)";
RDebugUtils.currentLine=63438849;
 //BA.debugLineNum = 63438849;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
__ref._setselectedhsvcolor /*String*/ (null,__ref._colortohsv /*Object[]*/ (null,_i));
RDebugUtils.currentLine=63438850;
 //BA.debugLineNum = 63438850;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=63766529;
 //BA.debugLineNum = 63766529;BA.debugLine="InitialColor = getSelectedHSVColor";
__ref._initialcolor /*Object[]*/  = __ref._getselectedhsvcolor /*Object[]*/ (null);
RDebugUtils.currentLine=63766530;
 //BA.debugLineNum = 63766530;BA.debugLine="xDialog = Dialog";
__ref._xdialog /*b4a.example.ef.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=63766531;
 //BA.debugLineNum = 63766531;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xcolortemplate", "show"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=63766532;
 //BA.debugLineNum = 63766532;BA.debugLine="UpdateBarColor";
__ref._updatebarcolor /*String*/ (null);
RDebugUtils.currentLine=63766533;
 //BA.debugLineNum = 63766533;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}