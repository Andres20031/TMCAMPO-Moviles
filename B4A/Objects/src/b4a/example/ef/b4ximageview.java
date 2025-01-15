package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4ximageview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4ximageview");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4ximageview.class).invoke(this, new Object[] {null});
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
public Object _tag = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _iv = null;
public String _mresizemode = "";
public boolean _mround = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _mbitmap = null;
public int _mbackgroundcolor = 0;
public int _mcornersradius = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _base_resize(b4a.example.ef.b4ximageview __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="End Sub";
return "";
}
public String  _update(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((String) Debug.delegate(ba, "update", null));}
float _imageviewwidth = 0f;
float _imageviewheight = 0f;
float _bmpratio = 0f;
float _r = 0f;
RDebugUtils.currentLine=70516736;
 //BA.debugLineNum = 70516736;BA.debugLine="Public Sub Update";
RDebugUtils.currentLine=70516737;
 //BA.debugLineNum = 70516737;BA.debugLine="If mBitmap.IsInitialized = False Then Return";
if (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=70516738;
 //BA.debugLineNum = 70516738;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=70516739;
 //BA.debugLineNum = 70516739;BA.debugLine="Dim ImageViewWidth, ImageViewHeight As Float";
_imageviewwidth = 0f;
_imageviewheight = 0f;
RDebugUtils.currentLine=70516740;
 //BA.debugLineNum = 70516740;BA.debugLine="Dim bmpRatio As Float = mBitmap.Width / mBitmap.H";
_bmpratio = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
RDebugUtils.currentLine=70516741;
 //BA.debugLineNum = 70516741;BA.debugLine="Select mResizeMode";
switch (BA.switchObjectToInt(__ref._mresizemode /*String*/ ,"FILL","FIT","FILL_WIDTH","FILL_HEIGHT","FILL_NO_DISTORTIONS","NONE")) {
case 0: {
RDebugUtils.currentLine=70516743;
 //BA.debugLineNum = 70516743;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=70516744;
 //BA.debugLineNum = 70516744;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 break; }
case 1: {
RDebugUtils.currentLine=70516746;
 //BA.debugLineNum = 70516746;BA.debugLine="Dim r As Float = Min(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=70516747;
 //BA.debugLineNum = 70516747;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=70516748;
 //BA.debugLineNum = 70516748;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 2: {
RDebugUtils.currentLine=70516750;
 //BA.debugLineNum = 70516750;BA.debugLine="ImageViewWidth = mBase.Width";
_imageviewwidth = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
RDebugUtils.currentLine=70516751;
 //BA.debugLineNum = 70516751;BA.debugLine="ImageViewHeight = ImageViewWidth / bmpRatio";
_imageviewheight = (float) (_imageviewwidth/(double)_bmpratio);
 break; }
case 3: {
RDebugUtils.currentLine=70516753;
 //BA.debugLineNum = 70516753;BA.debugLine="ImageViewHeight = mBase.Height";
_imageviewheight = (float) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=70516754;
 //BA.debugLineNum = 70516754;BA.debugLine="ImageViewWidth = ImageViewHeight * bmpRatio";
_imageviewwidth = (float) (_imageviewheight*_bmpratio);
 break; }
case 4: {
RDebugUtils.currentLine=70516756;
 //BA.debugLineNum = 70516756;BA.debugLine="Dim r As Float = Max(mBase.Width / mBitmap.Widt";
_r = (float) (__c.Max(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()));
RDebugUtils.currentLine=70516757;
 //BA.debugLineNum = 70516757;BA.debugLine="ImageViewWidth = mBitmap.Width * r";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth()*_r);
RDebugUtils.currentLine=70516758;
 //BA.debugLineNum = 70516758;BA.debugLine="ImageViewHeight = mBitmap.Height * r";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight()*_r);
 break; }
case 5: {
RDebugUtils.currentLine=70516760;
 //BA.debugLineNum = 70516760;BA.debugLine="ImageViewWidth = mBitmap.Width";
_imageviewwidth = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getWidth());
RDebugUtils.currentLine=70516761;
 //BA.debugLineNum = 70516761;BA.debugLine="ImageViewHeight = mBitmap.Height";
_imageviewheight = (float) (__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .getHeight());
 break; }
default: {
RDebugUtils.currentLine=70516763;
 //BA.debugLineNum = 70516763;BA.debugLine="Log(\"Invalid resize mode: \"  & mResizeMode)";
__c.LogImpl("970516763","Invalid resize mode: "+__ref._mresizemode /*String*/ ,0);
 break; }
}
;
RDebugUtils.currentLine=70516765;
 //BA.debugLineNum = 70516765;BA.debugLine="iv.SetLayoutAnimated(0, Round(mBase.Width / 2 - I";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2-_imageviewwidth/(double)2)),(int) (__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2-_imageviewheight/(double)2)),(int) (__c.Round(_imageviewwidth)),(int) (__c.Round(_imageviewheight)));
RDebugUtils.currentLine=70516766;
 //BA.debugLineNum = 70516766;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=69861378;
 //BA.debugLineNum = 69861378;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=69861380;
 //BA.debugLineNum = 69861380;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=69861381;
 //BA.debugLineNum = 69861381;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=69861382;
 //BA.debugLineNum = 69861382;BA.debugLine="Private iv As B4XView";
_iv = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=69861383;
 //BA.debugLineNum = 69861383;BA.debugLine="Private mResizeMode As String";
_mresizemode = "";
RDebugUtils.currentLine=69861384;
 //BA.debugLineNum = 69861384;BA.debugLine="Private mRound As Boolean";
_mround = false;
RDebugUtils.currentLine=69861385;
 //BA.debugLineNum = 69861385;BA.debugLine="Private mBitmap As B4XBitmap";
_mbitmap = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
RDebugUtils.currentLine=69861386;
 //BA.debugLineNum = 69861386;BA.debugLine="Public mBackgroundColor As Int";
_mbackgroundcolor = 0;
RDebugUtils.currentLine=69861387;
 //BA.debugLineNum = 69861387;BA.debugLine="Private mCornersRadius As Int";
_mcornersradius = 0;
RDebugUtils.currentLine=69861388;
 //BA.debugLineNum = 69861388;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=70647808;
 //BA.debugLineNum = 70647808;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=70647809;
 //BA.debugLineNum = 70647809;BA.debugLine="mBitmap = Null";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=70647810;
 //BA.debugLineNum = 70647810;BA.debugLine="iv.SetBitmap(Null)";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__c.Null));
RDebugUtils.currentLine=70647811;
 //BA.debugLineNum = 70647811;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.b4ximageview __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iiv = null;
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=69992449;
 //BA.debugLineNum = 69992449;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=69992450;
 //BA.debugLineNum = 69992450;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=69992451;
 //BA.debugLineNum = 69992451;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=69992452;
 //BA.debugLineNum = 69992452;BA.debugLine="Dim iiv As ImageView";
_iiv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=69992453;
 //BA.debugLineNum = 69992453;BA.debugLine="iiv.Initialize(\"\")";
_iiv.Initialize(ba,"");
RDebugUtils.currentLine=69992454;
 //BA.debugLineNum = 69992454;BA.debugLine="iv = iiv";
__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iiv.getObject()));
RDebugUtils.currentLine=69992455;
 //BA.debugLineNum = 69992455;BA.debugLine="mRound =Props.Get(\"Round\")";
__ref._mround /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("Round")));
RDebugUtils.currentLine=69992456;
 //BA.debugLineNum = 69992456;BA.debugLine="mResizeMode = Props.Get(\"ResizeMode\")";
__ref._mresizemode /*String*/  = BA.ObjectToString(_props.Get((Object)("ResizeMode")));
RDebugUtils.currentLine=69992457;
 //BA.debugLineNum = 69992457;BA.debugLine="mBackgroundColor = xui.PaintOrColorToColor(Props.";
__ref._mbackgroundcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BackgroundColor")));
RDebugUtils.currentLine=69992458;
 //BA.debugLineNum = 69992458;BA.debugLine="mCornersRadius = DipToCurrent(Props.GetDefault(\"C";
__ref._mcornersradius /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("CornersRadius"),(Object)(0)))));
RDebugUtils.currentLine=69992459;
 //BA.debugLineNum = 69992459;BA.debugLine="mBase.AddView(iv, 0, 0, mBase.Width, mBase.Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=69992460;
 //BA.debugLineNum = 69992460;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=69992461;
 //BA.debugLineNum = 69992461;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _getbitmap(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getbitmap", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) Debug.delegate(ba, "getbitmap", null));}
RDebugUtils.currentLine=70778880;
 //BA.debugLineNum = 70778880;BA.debugLine="Public Sub getBitmap As B4XBitmap";
RDebugUtils.currentLine=70778881;
 //BA.debugLineNum = 70778881;BA.debugLine="Return mBitmap";
if (true) return __ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ;
RDebugUtils.currentLine=70778882;
 //BA.debugLineNum = 70778882;BA.debugLine="End Sub";
return null;
}
public int  _getcornersradius(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getcornersradius", true))
	 {return ((Integer) Debug.delegate(ba, "getcornersradius", null));}
RDebugUtils.currentLine=70254592;
 //BA.debugLineNum = 70254592;BA.debugLine="Public Sub getCornersRadius As Int";
RDebugUtils.currentLine=70254593;
 //BA.debugLineNum = 70254593;BA.debugLine="Return mCornersRadius";
if (true) return __ref._mcornersradius /*int*/ ;
RDebugUtils.currentLine=70254594;
 //BA.debugLineNum = 70254594;BA.debugLine="End Sub";
return 0;
}
public String  _getresizemode(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getresizemode", true))
	 {return ((String) Debug.delegate(ba, "getresizemode", null));}
RDebugUtils.currentLine=70385664;
 //BA.debugLineNum = 70385664;BA.debugLine="Public Sub getResizeMode As String";
RDebugUtils.currentLine=70385665;
 //BA.debugLineNum = 70385665;BA.debugLine="Return mResizeMode";
if (true) return __ref._mresizemode /*String*/ ;
RDebugUtils.currentLine=70385666;
 //BA.debugLineNum = 70385666;BA.debugLine="End Sub";
return "";
}
public boolean  _getroundedimage(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "getroundedimage", true))
	 {return ((Boolean) Debug.delegate(ba, "getroundedimage", null));}
RDebugUtils.currentLine=70123520;
 //BA.debugLineNum = 70123520;BA.debugLine="Public Sub getRoundedImage As Boolean";
RDebugUtils.currentLine=70123521;
 //BA.debugLineNum = 70123521;BA.debugLine="Return mRound";
if (true) return __ref._mround /*boolean*/ ;
RDebugUtils.currentLine=70123522;
 //BA.debugLineNum = 70123522;BA.debugLine="End Sub";
return false;
}
public String  _initialize(b4a.example.ef.b4ximageview __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=69926915;
 //BA.debugLineNum = 69926915;BA.debugLine="End Sub";
return "";
}
public String  _load(b4a.example.ef.b4ximageview __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "load", true))
	 {return ((String) Debug.delegate(ba, "load", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=70582272;
 //BA.debugLineNum = 70582272;BA.debugLine="Public Sub Load (Dir As String, FileName As String";
RDebugUtils.currentLine=70582274;
 //BA.debugLineNum = 70582274;BA.debugLine="setBitmap(LoadBitmapSample(Dir, FileName, mBase.W";
__ref._setbitmap /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(__c.LoadBitmapSample(_dir,_filename,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()).getObject())));
RDebugUtils.currentLine=70582278;
 //BA.debugLineNum = 70582278;BA.debugLine="End Sub";
return "";
}
public String  _setbitmap(b4a.example.ef.b4ximageview __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setbitmap", true))
	 {return ((String) Debug.delegate(ba, "setbitmap", new Object[] {_bmp}));}
RDebugUtils.currentLine=70713344;
 //BA.debugLineNum = 70713344;BA.debugLine="Public Sub setBitmap(Bmp As B4XBitmap)";
RDebugUtils.currentLine=70713345;
 //BA.debugLineNum = 70713345;BA.debugLine="mBitmap = Bmp";
__ref._mbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _bmp;
RDebugUtils.currentLine=70713346;
 //BA.debugLineNum = 70713346;BA.debugLine="XUIViewsUtils.SetBitmapAndFill(iv, Bmp)";
_xuiviewsutils._setbitmapandfill /*String*/ (ba,__ref._iv /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_bmp);
RDebugUtils.currentLine=70713347;
 //BA.debugLineNum = 70713347;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=70713348;
 //BA.debugLineNum = 70713348;BA.debugLine="End Sub";
return "";
}
public String  _setcornersradius(b4a.example.ef.b4ximageview __ref,int _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setcornersradius", true))
	 {return ((String) Debug.delegate(ba, "setcornersradius", new Object[] {_i}));}
RDebugUtils.currentLine=70320128;
 //BA.debugLineNum = 70320128;BA.debugLine="Public Sub setCornersRadius (i As Int)";
RDebugUtils.currentLine=70320129;
 //BA.debugLineNum = 70320129;BA.debugLine="mCornersRadius = i";
__ref._mcornersradius /*int*/  = _i;
RDebugUtils.currentLine=70320130;
 //BA.debugLineNum = 70320130;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=70320131;
 //BA.debugLineNum = 70320131;BA.debugLine="End Sub";
return "";
}
public String  _updateclip(b4a.example.ef.b4ximageview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "updateclip", true))
	 {return ((String) Debug.delegate(ba, "updateclip", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=70844416;
 //BA.debugLineNum = 70844416;BA.debugLine="Private Sub UpdateClip";
RDebugUtils.currentLine=70844417;
 //BA.debugLineNum = 70844417;BA.debugLine="If mRound Then";
if (__ref._mround /*boolean*/ ) { 
RDebugUtils.currentLine=70844418;
 //BA.debugLineNum = 70844418;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),(int) (__c.Min(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)2,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)2)));
 }else {
RDebugUtils.currentLine=70844420;
 //BA.debugLineNum = 70844420;BA.debugLine="mBase.SetColorAndBorder(mBackgroundColor, 0, 0,";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetColorAndBorder(__ref._mbackgroundcolor /*int*/ ,(int) (0),(int) (0),__ref._mcornersradius /*int*/ );
 };
RDebugUtils.currentLine=70844442;
 //BA.debugLineNum = 70844442;BA.debugLine="Dim jo As JavaObject = mBase";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()));
RDebugUtils.currentLine=70844443;
 //BA.debugLineNum = 70844443;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(mRound Or";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__ref._mround /*boolean*/  || __ref._mcornersradius /*int*/ >0)});
RDebugUtils.currentLine=70844445;
 //BA.debugLineNum = 70844445;BA.debugLine="End Sub";
return "";
}
public String  _setresizemode(b4a.example.ef.b4ximageview __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setresizemode", true))
	 {return ((String) Debug.delegate(ba, "setresizemode", new Object[] {_s}));}
RDebugUtils.currentLine=70451200;
 //BA.debugLineNum = 70451200;BA.debugLine="Public Sub setResizeMode(s As String)";
RDebugUtils.currentLine=70451201;
 //BA.debugLineNum = 70451201;BA.debugLine="If s = mResizeMode Then Return";
if ((_s).equals(__ref._mresizemode /*String*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=70451202;
 //BA.debugLineNum = 70451202;BA.debugLine="mResizeMode = s";
__ref._mresizemode /*String*/  = _s;
RDebugUtils.currentLine=70451203;
 //BA.debugLineNum = 70451203;BA.debugLine="Update";
__ref._update /*String*/ (null);
RDebugUtils.currentLine=70451204;
 //BA.debugLineNum = 70451204;BA.debugLine="End Sub";
return "";
}
public String  _setroundedimage(b4a.example.ef.b4ximageview __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4ximageview";
if (Debug.shouldDelegate(ba, "setroundedimage", true))
	 {return ((String) Debug.delegate(ba, "setroundedimage", new Object[] {_b}));}
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Public Sub setRoundedImage (b As Boolean)";
RDebugUtils.currentLine=70189057;
 //BA.debugLineNum = 70189057;BA.debugLine="If b = mRound Then Return";
if (_b==__ref._mround /*boolean*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="mRound = b";
__ref._mround /*boolean*/  = _b;
RDebugUtils.currentLine=70189059;
 //BA.debugLineNum = 70189059;BA.debugLine="UpdateClip";
__ref._updateclip /*String*/ (null);
RDebugUtils.currentLine=70189060;
 //BA.debugLineNum = 70189060;BA.debugLine="End Sub";
return "";
}
}