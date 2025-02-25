package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class gifviewer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.gifviewer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.gifviewer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _bitmapanddelay{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper bmp;
public int Delay;
public void Initialize() {
IsInitialized = true;
bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
Delay = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbase = null;
public int _defaultcolorconstant = 0;
public int _workindex = 0;
public int _bdgravity = 0;
public anywheresoftware.b4a.objects.collections.List _bitmaps = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _start(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "start", false))
	 {return ((String) Debug.delegate(ba, "start", null));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="mBase.Visible = True";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="WorkIndex = WorkIndex + 1";
__ref._workindex /*int*/  = (int) (__ref._workindex /*int*/ +1);
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="ShowImpl(WorkIndex)";
__ref._showimpl /*void*/ (null,__ref._workindex /*int*/ );
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="End Sub";
return "";
}
public String  _stop(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", null));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub Stop";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="WorkIndex = WorkIndex + 1";
__ref._workindex /*int*/  = (int) (__ref._workindex /*int*/ +1);
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="End Sub";
return "";
}
public String  _setgif(b4a.example.ef.gifviewer __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "setgif", false))
	 {return ((String) Debug.delegate(ba, "setgif", new Object[] {_dir,_filename}));}
String _path = "";
anywheresoftware.b4a.agraham.gifdecoder.GifDecoder _gd = null;
int _i = 0;
b4a.example.ef.gifviewer._bitmapanddelay _bd = null;
b4a.example.ef.gifviewer._bitmapanddelay _firstframe = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _firstbmp = null;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub SetGif (Dir As String, FileName As Stri";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="File.Copy(File.DirAssets, FileName, File.DirInte";
__c.File.Copy(__c.File.getDirAssets(),_filename,__c.File.getDirInternal(),_filename);
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Dir = File.DirInternal";
_dir = __c.File.getDirInternal();
 };
RDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="Dim path As String = File.Combine(Dir, FileName)";
_path = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="If Main.GifsCache.IsInitialized = False Then Main";
if (_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="If Main.GifsCache.ContainsKey(path) Then";
if (_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_path))) { 
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="bitmaps = Main.GifsCache.Get(path)";
__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_path))));
 }else {
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="Dim gd As GifDecoder";
_gd = new anywheresoftware.b4a.agraham.gifdecoder.GifDecoder();
RDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="gd.Load(Dir, FileName)";
_gd.Load(_dir,_filename);
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="bitmaps.Initialize";
__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=16580621;
 //BA.debugLineNum = 16580621;BA.debugLine="For i = 0 To gd.FrameCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_gd.getFrameCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=16580622;
 //BA.debugLineNum = 16580622;BA.debugLine="Dim bd As BitmapAndDelay";
_bd = new b4a.example.ef.gifviewer._bitmapanddelay();
RDebugUtils.currentLine=16580623;
 //BA.debugLineNum = 16580623;BA.debugLine="bd.Initialize";
_bd.Initialize();
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="bd.bmp = gd.Frame(i)";
_bd.bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_gd.Frame(_i)));
RDebugUtils.currentLine=16580625;
 //BA.debugLineNum = 16580625;BA.debugLine="bd.Delay = gd.Delay(i)";
_bd.Delay /*int*/  = _gd.Delay(_i);
RDebugUtils.currentLine=16580626;
 //BA.debugLineNum = 16580626;BA.debugLine="bitmaps.Add(bd)";
__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_bd));
 }
};
RDebugUtils.currentLine=16580628;
 //BA.debugLineNum = 16580628;BA.debugLine="Main.GifsCache.Put(path, bitmaps)";
_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_path),(Object)(__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 };
RDebugUtils.currentLine=16580631;
 //BA.debugLineNum = 16580631;BA.debugLine="Dim FirstFrame As BitmapAndDelay = bitmaps.Get(0)";
_firstframe = (b4a.example.ef.gifviewer._bitmapanddelay)(__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=16580632;
 //BA.debugLineNum = 16580632;BA.debugLine="Dim FirstBmp As Bitmap = FirstFrame.bmp";
_firstbmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_firstbmp = _firstframe.bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ;
RDebugUtils.currentLine=16580633;
 //BA.debugLineNum = 16580633;BA.debugLine="If FirstBmp.Width < mBase.Width Or FirstBmp.Heigh";
if (_firstbmp.getWidth()<__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth() || _firstbmp.getHeight()<__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=16580634;
 //BA.debugLineNum = 16580634;BA.debugLine="BDGravity = Gravity.CENTER";
__ref._bdgravity /*int*/  = __c.Gravity.CENTER;
 }else {
RDebugUtils.currentLine=16580636;
 //BA.debugLineNum = 16580636;BA.debugLine="BDGravity = Gravity.FILL";
__ref._bdgravity /*int*/  = __c.Gravity.FILL;
 };
RDebugUtils.currentLine=16580639;
 //BA.debugLineNum = 16580639;BA.debugLine="End Sub";
return "";
}
public String  _callfromresume(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "callfromresume", false))
	 {return ((String) Debug.delegate(ba, "callfromresume", null));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub CallFromResume";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="If mBase.Visible Then Start";
if (__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()) { 
__ref._start /*String*/ (null);};
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="Private WorkIndex As Int";
_workindex = 0;
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Private BDGravity As Int";
_bdgravity = 0;
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Private bitmaps As List";
_bitmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="Type BitmapAndDelay (bmp As Bitmap, Delay As Int)";
;
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.gifviewer __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.gifviewer __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="End Sub";
return "";
}
public void  _showimpl(b4a.example.ef.gifviewer __ref,int _myworkindex) throws Exception{
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "showimpl", false))
	 {Debug.delegate(ba, "showimpl", new Object[] {_myworkindex}); return;}
ResumableSub_ShowImpl rsub = new ResumableSub_ShowImpl(this,__ref,_myworkindex);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowImpl extends BA.ResumableSub {
public ResumableSub_ShowImpl(b4a.example.ef.gifviewer parent,b4a.example.ef.gifviewer __ref,int _myworkindex) {
this.parent = parent;
this.__ref = __ref;
this._myworkindex = _myworkindex;
this.__ref = parent;
}
b4a.example.ef.gifviewer __ref;
b4a.example.ef.gifviewer parent;
int _myworkindex;
int _frameindex = 0;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bdrawable = null;
b4a.example.ef.gifviewer._bitmapanddelay _bd = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="gifviewer";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim FrameIndex As Int = 0";
_frameindex = (int) (0);
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Do While MyWorkIndex = WorkIndex";
if (true) break;

case 1:
//do while
this.state = 4;
while (_myworkindex==__ref._workindex /*int*/ ) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="FrameIndex = (FrameIndex + 1) Mod bitmaps.Size";
_frameindex = (int) ((_frameindex+1)%__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="Dim bdrawable As BitmapDrawable";
_bdrawable = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="Dim bd As BitmapAndDelay = bitmaps.Get(FrameInde";
_bd = (b4a.example.ef.gifviewer._bitmapanddelay)(__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Get(_frameindex));
RDebugUtils.currentLine=16842758;
 //BA.debugLineNum = 16842758;BA.debugLine="bdrawable.Initialize(bd.bmp)";
_bdrawable.Initialize((android.graphics.Bitmap)(_bd.bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="bdrawable.Gravity = BDGravity";
_bdrawable.setGravity(__ref._bdgravity /*int*/ );
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="mBase.Background = bdrawable";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_bdrawable.getObject()));
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="Sleep(bd.Delay)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "gifviewer", "showimpl"),_bd.Delay /*int*/ );
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}