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
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub Start";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="mBase.Visible = True";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="WorkIndex = WorkIndex + 1";
__ref._workindex /*int*/  = (int) (__ref._workindex /*int*/ +1);
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="ShowImpl(WorkIndex)";
__ref._showimpl /*void*/ (null,__ref._workindex /*int*/ );
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="End Sub";
return "";
}
public String  _stop(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "stop", false))
	 {return ((String) Debug.delegate(ba, "stop", null));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub Stop";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="WorkIndex = WorkIndex + 1";
__ref._workindex /*int*/  = (int) (__ref._workindex /*int*/ +1);
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub SetGif (Dir As String, FileName As Stri";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="If Dir = File.DirAssets Then";
if ((_dir).equals(__c.File.getDirAssets())) { 
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="File.Copy(File.DirAssets, FileName, File.DirInte";
__c.File.Copy(__c.File.getDirAssets(),_filename,__c.File.getDirInternal(),_filename);
RDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="Dir = File.DirInternal";
_dir = __c.File.getDirInternal();
 };
RDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="Dim path As String = File.Combine(Dir, FileName)";
_path = __c.File.Combine(_dir,_filename);
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="If Main.GifsCache.IsInitialized = False Then Main";
if (_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()==__c.False) { 
_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();};
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="If Main.GifsCache.ContainsKey(path) Then";
if (_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_path))) { 
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="bitmaps = Main.GifsCache.Get(path)";
__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/  = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_path))));
 }else {
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="Dim gd As GifDecoder";
_gd = new anywheresoftware.b4a.agraham.gifdecoder.GifDecoder();
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="gd.Load(Dir, FileName)";
_gd.Load(_dir,_filename);
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="bitmaps.Initialize";
__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=17891341;
 //BA.debugLineNum = 17891341;BA.debugLine="For i = 0 To gd.FrameCount - 1";
{
final int step13 = 1;
final int limit13 = (int) (_gd.getFrameCount()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="Dim bd As BitmapAndDelay";
_bd = new b4a.example.ef.gifviewer._bitmapanddelay();
RDebugUtils.currentLine=17891343;
 //BA.debugLineNum = 17891343;BA.debugLine="bd.Initialize";
_bd.Initialize();
RDebugUtils.currentLine=17891344;
 //BA.debugLineNum = 17891344;BA.debugLine="bd.bmp = gd.Frame(i)";
_bd.bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_gd.Frame(_i)));
RDebugUtils.currentLine=17891345;
 //BA.debugLineNum = 17891345;BA.debugLine="bd.Delay = gd.Delay(i)";
_bd.Delay /*int*/  = _gd.Delay(_i);
RDebugUtils.currentLine=17891346;
 //BA.debugLineNum = 17891346;BA.debugLine="bitmaps.Add(bd)";
__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_bd));
 }
};
RDebugUtils.currentLine=17891348;
 //BA.debugLineNum = 17891348;BA.debugLine="Main.GifsCache.Put(path, bitmaps)";
_main._gifscache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_path),(Object)(__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 };
RDebugUtils.currentLine=17891351;
 //BA.debugLineNum = 17891351;BA.debugLine="Dim FirstFrame As BitmapAndDelay = bitmaps.Get(0)";
_firstframe = (b4a.example.ef.gifviewer._bitmapanddelay)(__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=17891352;
 //BA.debugLineNum = 17891352;BA.debugLine="Dim FirstBmp As Bitmap = FirstFrame.bmp";
_firstbmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_firstbmp = _firstframe.bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ ;
RDebugUtils.currentLine=17891353;
 //BA.debugLineNum = 17891353;BA.debugLine="If FirstBmp.Width < mBase.Width Or FirstBmp.Heigh";
if (_firstbmp.getWidth()<__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth() || _firstbmp.getHeight()<__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=17891354;
 //BA.debugLineNum = 17891354;BA.debugLine="BDGravity = Gravity.CENTER";
__ref._bdgravity /*int*/  = __c.Gravity.CENTER;
 }else {
RDebugUtils.currentLine=17891356;
 //BA.debugLineNum = 17891356;BA.debugLine="BDGravity = Gravity.FILL";
__ref._bdgravity /*int*/  = __c.Gravity.FILL;
 };
RDebugUtils.currentLine=17891359;
 //BA.debugLineNum = 17891359;BA.debugLine="End Sub";
return "";
}
public String  _callfromresume(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "callfromresume", false))
	 {return ((String) Debug.delegate(ba, "callfromresume", null));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub CallFromResume";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="If mBase.Visible Then Start";
if (__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible()) { 
__ref._start /*String*/ (null);};
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Private mBase As Panel";
_mbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="Private Const DefaultColorConstant As Int = -9848";
_defaultcolorconstant = (int) (-984833);
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Private WorkIndex As Int";
_workindex = 0;
RDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="Private BDGravity As Int";
_bdgravity = 0;
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="Private bitmaps As List";
_bitmaps = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="Type BitmapAndDelay (bmp As Bitmap, Delay As Int)";
;
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.gifviewer __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="mBase.Visible = False";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _getbase(b4a.example.ef.gifviewer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "getbase", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub GetBase As Panel";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.gifviewer __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="gifviewer";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Dim FrameIndex As Int = 0";
_frameindex = (int) (0);
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Do While MyWorkIndex = WorkIndex";
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
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="FrameIndex = (FrameIndex + 1) Mod bitmaps.Size";
_frameindex = (int) ((_frameindex+1)%__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="Dim bdrawable As BitmapDrawable";
_bdrawable = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="Dim bd As BitmapAndDelay = bitmaps.Get(FrameInde";
_bd = (b4a.example.ef.gifviewer._bitmapanddelay)(__ref._bitmaps /*anywheresoftware.b4a.objects.collections.List*/ .Get(_frameindex));
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="bdrawable.Initialize(bd.bmp)";
_bdrawable.Initialize((android.graphics.Bitmap)(_bd.bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="bdrawable.Gravity = BDGravity";
_bdrawable.setGravity(__ref._bdgravity /*int*/ );
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="mBase.Background = bdrawable";
__ref._mbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_bdrawable.getObject()));
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="Sleep(bd.Delay)";
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
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}