package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asviewpager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.asviewpager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.asviewpager.class).invoke(this, new Object[] {null});
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
public b4a.example3.customlistview _xclv_main = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_loading = null;
public int _m_currentindex = 0;
public float _g_x = 0f;
public float _g_y = 0f;
public float _g_dv = 0f;
public float _g_ad = 0f;
public long _g_ms = 0L;
public boolean _isfirstmove = false;
public boolean _m_ignore = false;
public boolean _g_ignorepagechangedevent = false;
public boolean _g_ignorepagechangeevent = false;
public String _m_orientation = "";
public boolean _m_carousel = false;
public boolean _m_lazyloading = false;
public int _m_lazyloadingextrasize = 0;
public int _m_loadingpanelcolor = 0;
public boolean _m_backgesturegap = false;
public boolean _m_allownext = false;
public boolean _m_allowback = false;
public int _m_maxoffset = 0;
public boolean _ismoving = false;
public boolean _g_isscrollenabled = false;
public boolean _m_ignorelazyloading = false;
public Object _tag = null;
public boolean _islazyloadingready = false;
public boolean _ishidding = false;
public int _oldindex = 0;
public int _m_loadingpanelhideduration = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public void  _base_resize(b4a.example.ef.asviewpager __ref,double _width,double _height) throws Exception{
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {Debug.delegate(ba, "base_resize", new Object[] {_width,_height}); return;}
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(this,__ref,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4a.example.ef.asviewpager parent,b4a.example.ef.asviewpager __ref,double _width,double _height) {
this.parent = parent;
this.__ref = __ref;
this._width = _width;
this._height = _height;
this.__ref = parent;
}
b4a.example.ef.asviewpager __ref;
b4a.example.ef.asviewpager parent;
double _width;
double _height;
int _i = 0;
int step9;
int limit9;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asviewpager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44040234;
 //BA.debugLineNum = 44040234;BA.debugLine="xpnl_Loading.BringToFront";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=44040235;
 //BA.debugLineNum = 44040235;BA.debugLine="xpnl_Loading.SetLayoutAnimated(0,0,0,Width + 1000";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width+parent.__c.DipToCurrent((int) (1000))),(int) (_height+parent.__c.DipToCurrent((int) (1000))));
RDebugUtils.currentLine=44040236;
 //BA.debugLineNum = 44040236;BA.debugLine="xpnl_Loading.SetVisibleAnimated(0,True)";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=44040238;
 //BA.debugLineNum = 44040238;BA.debugLine="mBase.Width = Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width));
RDebugUtils.currentLine=44040239;
 //BA.debugLineNum = 44040239;BA.debugLine="mBase.Height = Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=44040240;
 //BA.debugLineNum = 44040240;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "base_resize"),(int) (0));
this.state = 16;
return;
case 16:
//C
this.state = 1;
;
RDebugUtils.currentLine=44040241;
 //BA.debugLineNum = 44040241;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getTop(),(int) (_width),(int) (_height));
RDebugUtils.currentLine=44040242;
 //BA.debugLineNum = 44040242;BA.debugLine="xclv_main.Base_Resize(Width,Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=44040245;
 //BA.debugLineNum = 44040245;BA.debugLine="For i = 0 To xclv_main.Size -1";
if (true) break;

case 1:
//for
this.state = 10;
step9 = 1;
limit9 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 10;
if ((step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9)) this.state = 3;
if (true) break;

case 18:
//C
this.state = 17;
_i = ((int)(0 + _i + step9)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=44040246;
 //BA.debugLineNum = 44040246;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if (true) break;

case 4:
//if
this.state = 9;
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=44040247;
 //BA.debugLineNum = 44040247;BA.debugLine="xclv_main.ResizeItem(i,mBase.Width)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._resizeitem(_i,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=44040249;
 //BA.debugLineNum = 44040249;BA.debugLine="xclv_main.ResizeItem(i,mBase.Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._resizeitem(_i,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 9:
//C
this.state = 18;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=44040255;
 //BA.debugLineNum = 44040255;BA.debugLine="If xclv_main.Size > 0 Then xclv_main.JumpToItem(m";

case 10:
//if
this.state = 15;
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()>0) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem(__ref._m_currentindex /*int*/ );
if (true) break;

case 15:
//C
this.state = -1;
;
RDebugUtils.currentLine=44040256;
 //BA.debugLineNum = 44040256;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "base_resize"),(int) (250));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=44040257;
 //BA.debugLineNum = 44040257;BA.debugLine="LoadingPanelHandling";
__ref._loadingpanelhandling /*void*/ (null);
RDebugUtils.currentLine=44040263;
 //BA.debugLineNum = 44040263;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _resetlazyloadingpanels(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "resetlazyloadingpanels", true))
	 {return ((String) Debug.delegate(ba, "resetlazyloadingpanels", null));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Public Sub ResetLazyLoadingPanels";
RDebugUtils.currentLine=46333962;
 //BA.debugLineNum = 46333962;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=46333963;
 //BA.debugLineNum = 46333963;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=46333965;
 //BA.debugLineNum = 46333965;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=46333966;
 //BA.debugLineNum = 46333966;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 }
};
RDebugUtils.currentLine=46333970;
 //BA.debugLineNum = 46333970;BA.debugLine="End Sub";
return "";
}
public String  _resetlazyloadingindex(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "resetlazyloadingindex", true))
	 {return ((String) Debug.delegate(ba, "resetlazyloadingindex", null));}
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Public Sub ResetLazyloadingIndex";
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="End Sub";
return "";
}
public String  _commit(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "commit", true))
	 {return ((String) Debug.delegate(ba, "commit", null));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Public Sub Commit";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="isLazyLoadingReady = True";
__ref._islazyloadingready /*boolean*/  = __c.True;
RDebugUtils.currentLine=44826629;
 //BA.debugLineNum = 44826629;BA.debugLine="xclv_main.Refresh";
__ref._xclv_main /*b4a.example3.customlistview*/ ._refresh();
RDebugUtils.currentLine=44826632;
 //BA.debugLineNum = 44826632;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="xclv_main.Clear";
__ref._xclv_main /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="m_CurrentIndex = 0";
__ref._m_currentindex /*int*/  = (int) (0);
RDebugUtils.currentLine=46268423;
 //BA.debugLineNum = 46268423;BA.debugLine="End Sub";
return "";
}
public String  _addpage(b4a.example.ef.asviewpager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_layoutpanel,_value}));}
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Public Sub AddPage(LayoutPanel As B4XView,Value As";
RDebugUtils.currentLine=44367877;
 //BA.debugLineNum = 44367877;BA.debugLine="xclv_main.Add(LayoutPanel,Value)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._add(_layoutpanel,_value);
RDebugUtils.currentLine=44367879;
 //BA.debugLineNum = 44367879;BA.debugLine="End Sub";
return "";
}
public void  _setcurrentindex2(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setcurrentindex2", true))
	 {Debug.delegate(ba, "setcurrentindex2", new Object[] {_index}); return;}
ResumableSub_setCurrentIndex2 rsub = new ResumableSub_setCurrentIndex2(this,__ref,_index);
rsub.resume(ba, null);
}
public static class ResumableSub_setCurrentIndex2 extends BA.ResumableSub {
public ResumableSub_setCurrentIndex2(b4a.example.ef.asviewpager parent,b4a.example.ef.asviewpager __ref,int _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this.__ref = parent;
}
b4a.example.ef.asviewpager __ref;
b4a.example.ef.asviewpager parent;
int _index;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asviewpager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=45940740;
 //BA.debugLineNum = 45940740;BA.debugLine="m_Ignore = True";
__ref._m_ignore /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=45940741;
 //BA.debugLineNum = 45940741;BA.debugLine="PageChangedEvent(index,False)";
__ref._pagechangedevent /*void*/ (null,_index,parent.__c.False);
RDebugUtils.currentLine=45940742;
 //BA.debugLineNum = 45940742;BA.debugLine="xclv_main.JumpToItem(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem(_index);
RDebugUtils.currentLine=45940743;
 //BA.debugLineNum = 45940743;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "setcurrentindex2"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=45940744;
 //BA.debugLineNum = 45940744;BA.debugLine="m_Ignore = False";
__ref._m_ignore /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=45940746;
 //BA.debugLineNum = 45940746;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(b4a.example.ef.asviewpager __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.asviewpager __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=43909123;
 //BA.debugLineNum = 43909123;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=43909125;
 //BA.debugLineNum = 43909125;BA.debugLine="xpnl_Loading = xui.CreatePanel(\"\")";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=43909126;
 //BA.debugLineNum = 43909126;BA.debugLine="mBase.AddView(xpnl_Loading,0,0,mBase.Width,mBase.";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=43909127;
 //BA.debugLineNum = 43909127;BA.debugLine="xpnl_Loading.Color = xui.Color_Black";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=43909128;
 //BA.debugLineNum = 43909128;BA.debugLine="xpnl_Loading.BringToFront";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=43909130;
 //BA.debugLineNum = 43909130;BA.debugLine="m_Orientation = Props.GetDefault(\"Orientation\",\"H";
__ref._m_orientation /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("Orientation"),(Object)("Horizontal")));
RDebugUtils.currentLine=43909131;
 //BA.debugLineNum = 43909131;BA.debugLine="m_Carousel = Props.GetDefault(\"Carousel\",False)";
__ref._m_carousel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Carousel"),(Object)(__c.False)));
RDebugUtils.currentLine=43909132;
 //BA.debugLineNum = 43909132;BA.debugLine="m_LazyLoading = Props.GetDefault(\"LazyLoading\",Fa";
__ref._m_lazyloading /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.False)));
RDebugUtils.currentLine=43909133;
 //BA.debugLineNum = 43909133;BA.debugLine="m_LazyLoadingExtraSize = Props.GetDefault(\"LazyLo";
__ref._m_lazyloadingextrasize /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("LazyLoadingExtraSize"),(Object)(5))));
RDebugUtils.currentLine=43909134;
 //BA.debugLineNum = 43909134;BA.debugLine="m_LoadingPanelColor = xui.PaintOrColorToColor(Pro";
__ref._m_loadingpanelcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("LoadingPanelColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black)));
RDebugUtils.currentLine=43909135;
 //BA.debugLineNum = 43909135;BA.debugLine="xpnl_Loading.Color = m_LoadingPanelColor";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_loadingpanelcolor /*int*/ );
RDebugUtils.currentLine=43909136;
 //BA.debugLineNum = 43909136;BA.debugLine="m_BackGestureGap = Props.GetDefault(\"BackGestureG";
__ref._m_backgesturegap /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("BackGestureGap"),(Object)(__c.False)));
RDebugUtils.currentLine=43909139;
 //BA.debugLineNum = 43909139;BA.debugLine="If xclv_main.IsInitialized = False Then";
if (__ref._xclv_main /*b4a.example3.customlistview*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=43909140;
 //BA.debugLineNum = 43909140;BA.debugLine="ini_xclv";
__ref._ini_xclv /*String*/ (null);
 };
RDebugUtils.currentLine=43909149;
 //BA.debugLineNum = 43909149;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=43909167;
 //BA.debugLineNum = 43909167;BA.debugLine="End Sub";
return "";
}
public String  _setloadingpanelcolor(b4a.example.ef.asviewpager __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setloadingpanelcolor", true))
	 {return ((String) Debug.delegate(ba, "setloadingpanelcolor", new Object[] {_color}));}
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="Public Sub setLoadingPanelColor(Color As Int)";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="m_LoadingPanelColor = Color";
__ref._m_loadingpanelcolor /*int*/  = _color;
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="xpnl_Loading.Color = Color";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_color);
RDebugUtils.currentLine=45023235;
 //BA.debugLineNum = 45023235;BA.debugLine="End Sub";
return "";
}
public int  _getsize(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=46006272;
 //BA.debugLineNum = 46006272;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=46006276;
 //BA.debugLineNum = 46006276;BA.debugLine="Return xclv_main.Size";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getsize();
RDebugUtils.currentLine=46006278;
 //BA.debugLineNum = 46006278;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=46202884;
 //BA.debugLineNum = 46202884;BA.debugLine="Return xclv_main.GetPanel(Index)";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=46202886;
 //BA.debugLineNum = 46202886;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=46137348;
 //BA.debugLineNum = 46137348;BA.debugLine="Return xclv_main.GetValue(Index)";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_index);
RDebugUtils.currentLine=46137350;
 //BA.debugLineNum = 46137350;BA.debugLine="End Sub";
return null;
}
public void  _setcurrentindex(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setcurrentindex", true))
	 {Debug.delegate(ba, "setcurrentindex", new Object[] {_index}); return;}
ResumableSub_setCurrentIndex rsub = new ResumableSub_setCurrentIndex(this,__ref,_index);
rsub.resume(ba, null);
}
public static class ResumableSub_setCurrentIndex extends BA.ResumableSub {
public ResumableSub_setCurrentIndex(b4a.example.ef.asviewpager parent,b4a.example.ef.asviewpager __ref,int _index) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this.__ref = parent;
}
b4a.example.ef.asviewpager __ref;
b4a.example.ef.asviewpager parent;
int _index;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asviewpager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=45875204;
 //BA.debugLineNum = 45875204;BA.debugLine="PageChangedEvent(index,True)";
__ref._pagechangedevent /*void*/ (null,_index,parent.__c.True);
RDebugUtils.currentLine=45875205;
 //BA.debugLineNum = 45875205;BA.debugLine="m_Ignore = True";
__ref._m_ignore /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=45875206;
 //BA.debugLineNum = 45875206;BA.debugLine="xclv_main.ScrollToItem(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(_index);
RDebugUtils.currentLine=45875207;
 //BA.debugLineNum = 45875207;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "setcurrentindex"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=45875208;
 //BA.debugLineNum = 45875208;BA.debugLine="m_Ignore = False";
__ref._m_ignore /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=45875210;
 //BA.debugLineNum = 45875210;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getbase", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Public Sub getBase As B4XView";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="End Sub";
return null;
}
public String  _addpageat(b4a.example.ef.asviewpager __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "addpageat", true))
	 {return ((String) Debug.delegate(ba, "addpageat", new Object[] {_index,_layoutpanel,_value}));}
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Public Sub AddPageAt(index As Int,LayoutPanel As B";
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="If index <= m_CurrentIndex Then";
if (_index<=__ref._m_currentindex /*int*/ ) { 
RDebugUtils.currentLine=44433411;
 //BA.debugLineNum = 44433411;BA.debugLine="m_CurrentIndex = m_CurrentIndex +1";
__ref._m_currentindex /*int*/  = (int) (__ref._m_currentindex /*int*/ +1);
 };
RDebugUtils.currentLine=44433417;
 //BA.debugLineNum = 44433417;BA.debugLine="xclv_main.InsertAt(index,LayoutPanel,Value)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._insertat(_index,_layoutpanel,_value);
RDebugUtils.currentLine=44433427;
 //BA.debugLineNum = 44433427;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=44433432;
 //BA.debugLineNum = 44433432;BA.debugLine="End Sub";
return "";
}
public String  _previouspage(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "previouspage", true))
	 {return ((String) Debug.delegate(ba, "previouspage", null));}
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Public Sub PreviousPage";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="If m_AllowBack = False Then Return";
if (__ref._m_allowback /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=44564485;
 //BA.debugLineNum = 44564485;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((__ref._m_currentindex /*int*/ -1)>-1) { 
RDebugUtils.currentLine=44564486;
 //BA.debugLineNum = 44564486;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex -1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._m_currentindex /*int*/ -1));
RDebugUtils.currentLine=44564488;
 //BA.debugLineNum = 44564488;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,True)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ -1),__c.True);
 }else 
{RDebugUtils.currentLine=44564489;
 //BA.debugLineNum = 44564489;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=44564490;
 //BA.debugLineNum = 44564490;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=44564493;
 //BA.debugLineNum = 44564493;BA.debugLine="End Sub";
return "";
}
public String  _nextpage(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "nextpage", true))
	 {return ((String) Debug.delegate(ba, "nextpage", null));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Public Sub NextPage";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="If m_AllowNext = False Then Return";
if (__ref._m_allownext /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=44695557;
 //BA.debugLineNum = 44695557;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((__ref._m_currentindex /*int*/ +1)<__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()) { 
RDebugUtils.currentLine=44695558;
 //BA.debugLineNum = 44695558;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex +1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._m_currentindex /*int*/ +1));
RDebugUtils.currentLine=44695559;
 //BA.debugLineNum = 44695559;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,True)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ +1),__c.True);
 }else 
{RDebugUtils.currentLine=44695560;
 //BA.debugLineNum = 44695560;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=44695561;
 //BA.debugLineNum = 44695561;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=44695564;
 //BA.debugLineNum = 44695564;BA.debugLine="End Sub";
return "";
}
public String  _allowback(b4a.example.ef.asviewpager __ref,boolean _allow) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "allowback", true))
	 {return ((String) Debug.delegate(ba, "allowback", new Object[] {_allow}));}
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Public Sub AllowBack(Allow As Boolean)";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="m_AllowBack = Allow";
__ref._m_allowback /*boolean*/  = _allow;
RDebugUtils.currentLine=44957703;
 //BA.debugLineNum = 44957703;BA.debugLine="End Sub";
return "";
}
public String  _allownext(b4a.example.ef.asviewpager __ref,boolean _allow) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "allownext", true))
	 {return ((String) Debug.delegate(ba, "allownext", new Object[] {_allow}));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Public Sub AllowNext(Allow As Boolean)";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="m_AllowNext = Allow";
__ref._m_allownext /*boolean*/  = _allow;
RDebugUtils.currentLine=44892167;
 //BA.debugLineNum = 44892167;BA.debugLine="End Sub";
return "";
}
public void  _loadingpanelhandling(b4a.example.ef.asviewpager __ref) throws Exception{
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "loadingpanelhandling", true))
	 {Debug.delegate(ba, "loadingpanelhandling", null); return;}
ResumableSub_LoadingPanelHandling rsub = new ResumableSub_LoadingPanelHandling(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadingPanelHandling extends BA.ResumableSub {
public ResumableSub_LoadingPanelHandling(b4a.example.ef.asviewpager parent,b4a.example.ef.asviewpager __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.asviewpager __ref;
b4a.example.ef.asviewpager parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asviewpager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="If isHidding = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._ishidding /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="isHidding = True";
__ref._ishidding /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=44105732;
 //BA.debugLineNum = 44105732;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._m_loadingpanelhideduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=44105733;
 //BA.debugLineNum = 44105733;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "loadingpanelhandling"),(int) (__ref._m_loadingpanelhideduration /*int*/ +50));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="isHidding = False";
__ref._ishidding /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=44105736;
 //BA.debugLineNum = 44105736;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "loadingpanelhandling"),(int) (0));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=44105737;
 //BA.debugLineNum = 44105737;BA.debugLine="CheckLoadingPanelVisiblity";
__ref._checkloadingpanelvisiblity /*void*/ (null);
RDebugUtils.currentLine=44105738;
 //BA.debugLineNum = 44105738;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _checkcarousel(b4a.example.ef.asviewpager __ref) throws Exception{
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "checkcarousel", true))
	 {Debug.delegate(ba, "checkcarousel", null); return;}
ResumableSub_CheckCarousel rsub = new ResumableSub_CheckCarousel(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CheckCarousel extends BA.ResumableSub {
public ResumableSub_CheckCarousel(b4a.example.ef.asviewpager parent,b4a.example.ef.asviewpager __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.asviewpager __ref;
b4a.example.ef.asviewpager parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asviewpager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="If m_Carousel = True Then";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._m_carousel /*boolean*/ ==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkcarousel"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="If m_CurrentIndex = xclv_main.Size -1 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._m_currentindex /*int*/ ==__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=46530565;
 //BA.debugLineNum = 46530565;BA.debugLine="Else If m_CurrentIndex = 0 Then";
if (__ref._m_currentindex /*int*/ ==0) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=46530564;
 //BA.debugLineNum = 46530564;BA.debugLine="setCurrentIndex2(0)";
__ref._setcurrentindex2 /*void*/ (null,(int) (0));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=46530566;
 //BA.debugLineNum = 46530566;BA.debugLine="setCurrentIndex2(xclv_main.Size -1)";
__ref._setcurrentindex2 /*void*/ (null,(int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=46530569;
 //BA.debugLineNum = 46530569;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _checkloadingpanelvisiblity(b4a.example.ef.asviewpager __ref) throws Exception{
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "checkloadingpanelvisiblity", true))
	 {Debug.delegate(ba, "checkloadingpanelvisiblity", null); return;}
ResumableSub_CheckLoadingPanelVisiblity rsub = new ResumableSub_CheckLoadingPanelVisiblity(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CheckLoadingPanelVisiblity extends BA.ResumableSub {
public ResumableSub_CheckLoadingPanelVisiblity(b4a.example.ef.asviewpager parent,b4a.example.ef.asviewpager __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.asviewpager __ref;
b4a.example.ef.asviewpager parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asviewpager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkloadingpanelvisiblity"),(int) (250));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=44171267;
 //BA.debugLineNum = 44171267;BA.debugLine="If xpnl_Loading.Visible = True And isHidding = Fa";
if (true) break;

case 1:
//if
this.state = 4;
if (__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getVisible()==parent.__c.True && __ref._ishidding /*boolean*/ ==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=44171268;
 //BA.debugLineNum = 44171268;BA.debugLine="isHidding = True";
__ref._ishidding /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=44171269;
 //BA.debugLineNum = 44171269;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._m_loadingpanelhideduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=44171270;
 //BA.debugLineNum = 44171270;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkloadingpanelvisiblity"),(int) (__ref._m_loadingpanelhideduration /*int*/ +50));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=44171271;
 //BA.debugLineNum = 44171271;BA.debugLine="isHidding = False";
__ref._ishidding /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=44171274;
 //BA.debugLineNum = 44171274;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=43778058;
 //BA.debugLineNum = 43778058;BA.debugLine="Private xclv_main As CustomListView";
_xclv_main = new b4a.example3.customlistview();
RDebugUtils.currentLine=43778062;
 //BA.debugLineNum = 43778062;BA.debugLine="Private xpnl_Loading As B4XView";
_xpnl_loading = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=43778065;
 //BA.debugLineNum = 43778065;BA.debugLine="Private m_CurrentIndex As Int = 0'ignore";
_m_currentindex = (int) (0);
RDebugUtils.currentLine=43778068;
 //BA.debugLineNum = 43778068;BA.debugLine="Private g_x,g_y,g_dv,g_ad As Float";
_g_x = 0f;
_g_y = 0f;
_g_dv = 0f;
_g_ad = 0f;
RDebugUtils.currentLine=43778069;
 //BA.debugLineNum = 43778069;BA.debugLine="Private g_ms As Long";
_g_ms = 0L;
RDebugUtils.currentLine=43778070;
 //BA.debugLineNum = 43778070;BA.debugLine="Private  isfirstmove As Boolean = False";
_isfirstmove = __c.False;
RDebugUtils.currentLine=43778078;
 //BA.debugLineNum = 43778078;BA.debugLine="Private m_Ignore As Boolean = False'Ignore";
_m_ignore = __c.False;
RDebugUtils.currentLine=43778079;
 //BA.debugLineNum = 43778079;BA.debugLine="Private g_ignorepagechangedevent As Boolean = Fal";
_g_ignorepagechangedevent = __c.False;
RDebugUtils.currentLine=43778080;
 //BA.debugLineNum = 43778080;BA.debugLine="Private g_ignorepagechangeevent As Boolean = Fals";
_g_ignorepagechangeevent = __c.False;
RDebugUtils.currentLine=43778081;
 //BA.debugLineNum = 43778081;BA.debugLine="Private m_Orientation As String";
_m_orientation = "";
RDebugUtils.currentLine=43778082;
 //BA.debugLineNum = 43778082;BA.debugLine="Private m_Carousel As Boolean";
_m_carousel = false;
RDebugUtils.currentLine=43778083;
 //BA.debugLineNum = 43778083;BA.debugLine="Private m_LazyLoading As Boolean";
_m_lazyloading = false;
RDebugUtils.currentLine=43778084;
 //BA.debugLineNum = 43778084;BA.debugLine="Private m_LazyLoadingExtraSize As Int";
_m_lazyloadingextrasize = 0;
RDebugUtils.currentLine=43778085;
 //BA.debugLineNum = 43778085;BA.debugLine="Private m_LoadingPanelColor As Int";
_m_loadingpanelcolor = 0;
RDebugUtils.currentLine=43778086;
 //BA.debugLineNum = 43778086;BA.debugLine="Private m_BackGestureGap As Boolean 'Ignore";
_m_backgesturegap = false;
RDebugUtils.currentLine=43778087;
 //BA.debugLineNum = 43778087;BA.debugLine="Private m_AllowNext As Boolean = True";
_m_allownext = __c.True;
RDebugUtils.currentLine=43778088;
 //BA.debugLineNum = 43778088;BA.debugLine="Private m_AllowBack As Boolean = True";
_m_allowback = __c.True;
RDebugUtils.currentLine=43778089;
 //BA.debugLineNum = 43778089;BA.debugLine="Private m_MaxOffset As Int = 0'Ignore";
_m_maxoffset = (int) (0);
RDebugUtils.currentLine=43778091;
 //BA.debugLineNum = 43778091;BA.debugLine="Private ismoving As Boolean = False'Ignore";
_ismoving = __c.False;
RDebugUtils.currentLine=43778092;
 //BA.debugLineNum = 43778092;BA.debugLine="Private g_isScrollEnabled As Boolean = True";
_g_isscrollenabled = __c.True;
RDebugUtils.currentLine=43778093;
 //BA.debugLineNum = 43778093;BA.debugLine="Private m_IgnoreLazyLoading As Boolean = False'Ig";
_m_ignorelazyloading = __c.False;
RDebugUtils.currentLine=43778095;
 //BA.debugLineNum = 43778095;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=43778096;
 //BA.debugLineNum = 43778096;BA.debugLine="Private isLazyLoadingReady As Boolean = False";
_islazyloadingready = __c.False;
RDebugUtils.currentLine=43778097;
 //BA.debugLineNum = 43778097;BA.debugLine="Private isHidding As Boolean = False";
_ishidding = __c.False;
RDebugUtils.currentLine=43778099;
 //BA.debugLineNum = 43778099;BA.debugLine="Private OldIndex As Int = 0";
_oldindex = (int) (0);
RDebugUtils.currentLine=43778100;
 //BA.debugLineNum = 43778100;BA.debugLine="Private m_LoadingPanelHideDuration As Int = 500";
_m_loadingpanelhideduration = (int) (500);
RDebugUtils.currentLine=43778101;
 //BA.debugLineNum = 43778101;BA.debugLine="End Sub";
return "";
}
public String  _ini_xclv(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "ini_xclv", true))
	 {return ((String) Debug.delegate(ba, "ini_xclv", null));}
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
anywheresoftware.b4a.agraham.reflection.Reflection _objpages = null;
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Private Sub ini_xclv";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=43974660;
 //BA.debugLineNum = 43974660;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=43974661;
 //BA.debugLineNum = 43974661;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=43974662;
 //BA.debugLineNum = 43974662;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("DividerColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=43974663;
 //BA.debugLineNum = 43974663;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
_tmpmap.Put((Object)("DividerHeight"),(Object)(0));
RDebugUtils.currentLine=43974664;
 //BA.debugLineNum = 43974664;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("PressedColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=43974665;
 //BA.debugLineNum = 43974665;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
_tmpmap.Put((Object)("InsertAnimationDuration"),(Object)(0));
RDebugUtils.currentLine=43974666;
 //BA.debugLineNum = 43974666;BA.debugLine="tmpmap.Put(\"ListOrientation\",m_Orientation)";
_tmpmap.Put((Object)("ListOrientation"),(Object)(__ref._m_orientation /*String*/ ));
RDebugUtils.currentLine=43974667;
 //BA.debugLineNum = 43974667;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
_tmpmap.Put((Object)("ShowScrollBar"),(Object)(__c.False));
RDebugUtils.currentLine=43974668;
 //BA.debugLineNum = 43974668;BA.debugLine="xclv_main.Initialize(Me,\"xclv_main\")";
__ref._xclv_main /*b4a.example3.customlistview*/ ._initialize(ba,this,"xclv_main");
RDebugUtils.currentLine=43974669;
 //BA.debugLineNum = 43974669;BA.debugLine="xclv_main.DesignerCreateView(mBase,tmplbl,tmpmap)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._designercreateview((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=43974671;
 //BA.debugLineNum = 43974671;BA.debugLine="Private objPages As Reflector";
_objpages = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=43974672;
 //BA.debugLineNum = 43974672;BA.debugLine="objPages.Target = xclv_main.sv";
_objpages.Target = (Object)(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getObject());
RDebugUtils.currentLine=43974673;
 //BA.debugLineNum = 43974673;BA.debugLine="objPages.SetOnTouchListener(\"xpnl_PageArea2_Touch";
_objpages.SetOnTouchListener(ba,"xpnl_PageArea2_Touch");
RDebugUtils.currentLine=43974674;
 //BA.debugLineNum = 43974674;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getTop(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=43974675;
 //BA.debugLineNum = 43974675;BA.debugLine="xclv_main.Base_Resize(mBase.Width,mBase.Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._base_resize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=43974699;
 //BA.debugLineNum = 43974699;BA.debugLine="End Sub";
return "";
}
public String  _ff(b4a.example.ef.asviewpager __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "ff", true))
	 {return ((String) Debug.delegate(ba, "ff", new Object[] {_x,_y}));}
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Private Sub ff(x As Float,y As Float)";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="isfirstmove = True";
__ref._isfirstmove /*boolean*/  = __c.True;
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="g_ms=DateTime.Now";
__ref._g_ms /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="g_x=X";
__ref._g_x /*float*/  = _x;
RDebugUtils.currentLine=46399492;
 //BA.debugLineNum = 46399492;BA.debugLine="g_y=Y";
__ref._g_y /*float*/  = _y;
RDebugUtils.currentLine=46399493;
 //BA.debugLineNum = 46399493;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=46399494;
 //BA.debugLineNum = 46399494;BA.debugLine="g_dv = (mBase.Width)/2";
__ref._g_dv /*float*/  = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())/(double)2);
 }else {
RDebugUtils.currentLine=46399496;
 //BA.debugLineNum = 46399496;BA.debugLine="g_dv = (mBase.Height)/2";
__ref._g_dv /*float*/  = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())/(double)2);
 };
RDebugUtils.currentLine=46399498;
 //BA.debugLineNum = 46399498;BA.debugLine="g_ad = 0";
__ref._g_ad /*float*/  = (float) (0);
RDebugUtils.currentLine=46399499;
 //BA.debugLineNum = 46399499;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentindex(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getcurrentindex", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentindex", null));}
RDebugUtils.currentLine=45809664;
 //BA.debugLineNum = 45809664;BA.debugLine="Public Sub getCurrentIndex As Int";
RDebugUtils.currentLine=45809668;
 //BA.debugLineNum = 45809668;BA.debugLine="Return m_CurrentIndex";
if (true) return __ref._m_currentindex /*int*/ ;
RDebugUtils.currentLine=45809670;
 //BA.debugLineNum = 45809670;BA.debugLine="End Sub";
return 0;
}
public b4a.example3.customlistview  _getcustomlistview(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getcustomlistview", true))
	 {return ((b4a.example3.customlistview) Debug.delegate(ba, "getcustomlistview", null));}
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Public Sub getCustomListView As CustomListView";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Return xclv_main";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ;
RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="End Sub";
return null;
}
public boolean  _getisscrollenabled(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getisscrollenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getisscrollenabled", null));}
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Public Sub getisScrollEnabled As Boolean";
RDebugUtils.currentLine=45481985;
 //BA.debugLineNum = 45481985;BA.debugLine="Return g_isScrollEnabled";
if (true) return __ref._g_isscrollenabled /*boolean*/ ;
RDebugUtils.currentLine=45481986;
 //BA.debugLineNum = 45481986;BA.debugLine="End Sub";
return false;
}
public boolean  _getlazyloading(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getlazyloading", true))
	 {return ((Boolean) Debug.delegate(ba, "getlazyloading", null));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Public Sub getLazyLoading As Boolean";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="Return m_LazyLoading";
if (true) return __ref._m_lazyloading /*boolean*/ ;
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="End Sub";
return false;
}
public int  _getlazyloadingextrasize(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getlazyloadingextrasize", true))
	 {return ((Integer) Debug.delegate(ba, "getlazyloadingextrasize", null));}
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Public Sub getLazyLoadingExtraSize As Int";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="Return m_LazyLoadingExtraSize";
if (true) return __ref._m_lazyloadingextrasize /*int*/ ;
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="End Sub";
return 0;
}
public int  _getloadingpanelcolor(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getloadingpanelcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getloadingpanelcolor", null));}
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Public Sub getLoadingPanelColor As Int";
RDebugUtils.currentLine=45088769;
 //BA.debugLineNum = 45088769;BA.debugLine="Return m_LoadingPanelColor";
if (true) return __ref._m_loadingpanelcolor /*int*/ ;
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="End Sub";
return 0;
}
public boolean  _handletouch(b4a.example.ef.asviewpager __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "handletouch", true))
	 {return ((Boolean) Debug.delegate(ba, "handletouch", new Object[] {_action,_x,_y}));}
int _i = 0;
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Private Sub HandleTouch(Action As Int,x As Float,y";
RDebugUtils.currentLine=46465030;
 //BA.debugLineNum = 46465030;BA.debugLine="Select Action";
switch (_action) {
case 2: {
RDebugUtils.currentLine=46465032;
 //BA.debugLineNum = 46465032;BA.debugLine="TouchBeginEvent";
__ref._touchbeginevent /*String*/ (null);
RDebugUtils.currentLine=46465033;
 //BA.debugLineNum = 46465033;BA.debugLine="ismoving = True";
__ref._ismoving /*boolean*/  = __c.True;
RDebugUtils.currentLine=46465034;
 //BA.debugLineNum = 46465034;BA.debugLine="If isfirstmove = False Then";
if (__ref._isfirstmove /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=46465036;
 //BA.debugLineNum = 46465036;BA.debugLine="ff(X,y)";
__ref._ff /*String*/ (null,_x,_y);
 }else {
 };
 break; }
case 1: {
RDebugUtils.currentLine=46465043;
 //BA.debugLineNum = 46465043;BA.debugLine="TouchEndEvent";
__ref._touchendevent /*String*/ (null);
RDebugUtils.currentLine=46465044;
 //BA.debugLineNum = 46465044;BA.debugLine="ismoving = False";
__ref._ismoving /*boolean*/  = __c.False;
RDebugUtils.currentLine=46465045;
 //BA.debugLineNum = 46465045;BA.debugLine="isfirstmove = False";
__ref._isfirstmove /*boolean*/  = __c.False;
RDebugUtils.currentLine=46465047;
 //BA.debugLineNum = 46465047;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=46465048;
 //BA.debugLineNum = 46465048;BA.debugLine="If ((DateTime.Now-g_ms)<300) And (Abs(X - g_x)";
if (((__c.DateTime.getNow()-__ref._g_ms /*long*/ )<300) && (__c.Abs(_x-__ref._g_x /*float*/ )>(__c.DipToCurrent((int) (1))))) { 
RDebugUtils.currentLine=46465050;
 //BA.debugLineNum = 46465050;BA.debugLine="g_dv =1dip";
__ref._g_dv /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=46465052;
 //BA.debugLineNum = 46465052;BA.debugLine="If X < g_x Then g_ad = 1";
if (_x<__ref._g_x /*float*/ ) { 
__ref._g_ad /*float*/  = (float) (1);};
 };
 }else {
RDebugUtils.currentLine=46465056;
 //BA.debugLineNum = 46465056;BA.debugLine="If ((DateTime.Now-g_ms)<300)  And (Abs(y - g_y";
if (((__c.DateTime.getNow()-__ref._g_ms /*long*/ )<300) && (__c.Abs(_y-__ref._g_y /*float*/ )>(__c.DipToCurrent((int) (1))))) { 
RDebugUtils.currentLine=46465057;
 //BA.debugLineNum = 46465057;BA.debugLine="g_dv =1dip";
__ref._g_dv /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=46465059;
 //BA.debugLineNum = 46465059;BA.debugLine="If y < g_y Then g_ad = 1";
if (_y<__ref._g_y /*float*/ ) { 
__ref._g_ad /*float*/  = (float) (1);};
 };
 };
RDebugUtils.currentLine=46465064;
 //BA.debugLineNum = 46465064;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step24 = 1;
final int limit24 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=46465065;
 //BA.debugLineNum = 46465065;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=46465066;
 //BA.debugLineNum = 46465066;BA.debugLine="If (((i+1)*mBase.Width) - xclv_main.sv.Scroll";
if ((((_i+1)*__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX())>(__ref._g_dv /*float*/ )) { 
RDebugUtils.currentLine=46465068;
 //BA.debugLineNum = 46465068;BA.debugLine="If (i+g_ad) > (xclv_main.Size -1) Or xclv_ma";
if ((_i+__ref._g_ad /*float*/ )>(__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1) || __ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX()<=0) { 
RDebugUtils.currentLine=46465069;
 //BA.debugLineNum = 46465069;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
RDebugUtils.currentLine=46465070;
 //BA.debugLineNum = 46465070;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=46465073;
 //BA.debugLineNum = 46465073;BA.debugLine="If isNumberOneCloserToZero(g_x - x,g_y - y)";
if (__ref._isnumberoneclosertozero /*boolean*/ (null,(int) (__ref._g_x /*float*/ -_x),(int) (__ref._g_y /*float*/ -_y))==__c.False) { 
RDebugUtils.currentLine=46465074;
 //BA.debugLineNum = 46465074;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=46465075;
 //BA.debugLineNum = 46465075;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=46465077;
 //BA.debugLineNum = 46465077;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (_i+__ref._g_ad /*float*/ ));
RDebugUtils.currentLine=46465078;
 //BA.debugLineNum = 46465078;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
if (__ref._m_currentindex /*int*/ !=(_i+__ref._g_ad /*float*/ )) { 
__ref._pagechangedevent /*void*/ (null,(int) (_i+__ref._g_ad /*float*/ ),__c.True);};
RDebugUtils.currentLine=46465082;
 //BA.debugLineNum = 46465082;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }else {
RDebugUtils.currentLine=46465086;
 //BA.debugLineNum = 46465086;BA.debugLine="If (((i+1)*mBase.Height) - xclv_main.sv.Scrol";
if ((((_i+1)*__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())-__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY())>(__ref._g_dv /*float*/ )) { 
RDebugUtils.currentLine=46465088;
 //BA.debugLineNum = 46465088;BA.debugLine="If (i+g_ad) > xclv_main.Size-1 Or  xclv_main";
if ((_i+__ref._g_ad /*float*/ )>__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1 || __ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()<=0) { 
RDebugUtils.currentLine=46465089;
 //BA.debugLineNum = 46465089;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
RDebugUtils.currentLine=46465090;
 //BA.debugLineNum = 46465090;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=46465093;
 //BA.debugLineNum = 46465093;BA.debugLine="If isNumberOneCloserToZero(g_y - y,g_x - x)";
if (__ref._isnumberoneclosertozero /*boolean*/ (null,(int) (__ref._g_y /*float*/ -_y),(int) (__ref._g_x /*float*/ -_x))==__c.False) { 
RDebugUtils.currentLine=46465094;
 //BA.debugLineNum = 46465094;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=46465095;
 //BA.debugLineNum = 46465095;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=46465097;
 //BA.debugLineNum = 46465097;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (_i+__ref._g_ad /*float*/ ));
RDebugUtils.currentLine=46465098;
 //BA.debugLineNum = 46465098;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
if (__ref._m_currentindex /*int*/ !=(_i+__ref._g_ad /*float*/ )) { 
__ref._pagechangedevent /*void*/ (null,(int) (_i+__ref._g_ad /*float*/ ),__c.True);};
RDebugUtils.currentLine=46465102;
 //BA.debugLineNum = 46465102;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 }
};
 break; }
}
;
RDebugUtils.currentLine=46465107;
 //BA.debugLineNum = 46465107;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=46465108;
 //BA.debugLineNum = 46465108;BA.debugLine="End Sub";
return false;
}
public String  _touchbeginevent(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "touchbeginevent", true))
	 {return ((String) Debug.delegate(ba, "touchbeginevent", null));}
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Private Sub TouchBeginEvent";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="If ismoving = False Then";
if (__ref._ismoving /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchB";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchBegin",(int) (0))) { 
RDebugUtils.currentLine=47120387;
 //BA.debugLineNum = 47120387;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchBegin\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchBegin");
 };
 };
RDebugUtils.currentLine=47120390;
 //BA.debugLineNum = 47120390;BA.debugLine="End Sub";
return "";
}
public String  _touchendevent(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "touchendevent", true))
	 {return ((String) Debug.delegate(ba, "touchendevent", null));}
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Private Sub TouchEndEvent";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchE";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchEnd",(int) (0))) { 
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchEnd\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchEnd");
 };
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="End Sub";
return "";
}
public boolean  _isnumberoneclosertozero(b4a.example.ef.asviewpager __ref,int _numberone,int _numbertwo) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "isnumberoneclosertozero", true))
	 {return ((Boolean) Debug.delegate(ba, "isnumberoneclosertozero", new Object[] {_numberone,_numbertwo}));}
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Private Sub isNumberOneCloserToZero (numberOne As";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="Return (Abs(numberOne) >= Abs(numberTwo))";
if (true) return (__c.Abs(_numberone)>=__c.Abs(_numbertwo));
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="End Sub";
return false;
}
public void  _pagechangedevent(b4a.example.ef.asviewpager __ref,int _index,boolean _delayed) throws Exception{
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "pagechangedevent", true))
	 {Debug.delegate(ba, "pagechangedevent", new Object[] {_index,_delayed}); return;}
ResumableSub_PageChangedEvent rsub = new ResumableSub_PageChangedEvent(this,__ref,_index,_delayed);
rsub.resume(ba, null);
}
public static class ResumableSub_PageChangedEvent extends BA.ResumableSub {
public ResumableSub_PageChangedEvent(b4a.example.ef.asviewpager parent,b4a.example.ef.asviewpager __ref,int _index,boolean _delayed) {
this.parent = parent;
this.__ref = __ref;
this._index = _index;
this._delayed = _delayed;
this.__ref = parent;
}
b4a.example.ef.asviewpager __ref;
b4a.example.ef.asviewpager parent;
int _index;
boolean _delayed;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="asviewpager";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="If m_CurrentIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._m_currentindex /*int*/ ==_index) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="m_CurrentIndex = index";
__ref._m_currentindex /*int*/  = _index;
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="If g_ignorepagechangeevent = False And xui.SubExi";
if (true) break;

case 7:
//if
this.state = 10;
if (__ref._g_ignorepagechangeevent /*boolean*/ ==parent.__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChange",(int) (1))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChange\",i";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChange",(Object)(_index));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=47054855;
 //BA.debugLineNum = 47054855;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
__ref._m_maxoffset /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._getrawlistitem(_index).Offset;
RDebugUtils.currentLine=47054857;
 //BA.debugLineNum = 47054857;BA.debugLine="If delayed = True Then Sleep(300)";
if (true) break;

case 11:
//if
this.state = 16;
if (_delayed==parent.__c.True) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "pagechangedevent"),(int) (300));
this.state = 24;
return;
case 24:
//C
this.state = 16;
;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=47054859;
 //BA.debugLineNum = 47054859;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
__ref._m_maxoffset /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._getrawlistitem(_index).Offset;
RDebugUtils.currentLine=47054861;
 //BA.debugLineNum = 47054861;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";
if (true) break;

case 17:
//if
this.state = 20;
if (__ref._g_ignorepagechangedevent /*boolean*/ ==parent.__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(int) (1))) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=47054862;
 //BA.debugLineNum = 47054862;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(Object)(_index));
 if (true) break;
;
RDebugUtils.currentLine=47054864;
 //BA.debugLineNum = 47054864;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";

case 20:
//if
this.state = 23;
if (__ref._g_ignorepagechangedevent /*boolean*/ ==parent.__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged2",(int) (2))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=47054865;
 //BA.debugLineNum = 47054865;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageChanged2\"";
parent.__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged2",(Object)(_index),(Object)(__ref._oldindex /*int*/ ));
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=47054867;
 //BA.debugLineNum = 47054867;BA.debugLine="OldIndex = index";
__ref._oldindex /*int*/  = _index;
RDebugUtils.currentLine=47054868;
 //BA.debugLineNum = 47054868;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _lazyloadingaddcontent(b4a.example.ef.asviewpager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "lazyloadingaddcontent", true))
	 {return ((String) Debug.delegate(ba, "lazyloadingaddcontent", new Object[] {_parent,_value}));}
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Private Sub LazyLoadingAddContent(Parent As B4XVie";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="If isLazyLoadingReady = True And xui.SubExists(mC";
if (__ref._islazyloadingready /*boolean*/ ==__c.True && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LazyLoadingAddContent",(int) (2))) { 
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="CallSub3(mCallBack, mEventName & \"_LazyLoadingAd";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LazyLoadingAddContent",(Object)(_parent),_value);
 };
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="End Sub";
return "";
}
public String  _nextpage2(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "nextpage2", true))
	 {return ((String) Debug.delegate(ba, "nextpage2", null));}
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Public Sub NextPage2";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="If m_AllowNext = False Then Return";
if (__ref._m_allownext /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=44761093;
 //BA.debugLineNum = 44761093;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((__ref._m_currentindex /*int*/ +1)<__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()) { 
RDebugUtils.currentLine=44761095;
 //BA.debugLineNum = 44761095;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex +1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem((int) (__ref._m_currentindex /*int*/ +1));
RDebugUtils.currentLine=44761096;
 //BA.debugLineNum = 44761096;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,False)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ +1),__c.False);
 }else 
{RDebugUtils.currentLine=44761097;
 //BA.debugLineNum = 44761097;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=44761098;
 //BA.debugLineNum = 44761098;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=44761101;
 //BA.debugLineNum = 44761101;BA.debugLine="End Sub";
return "";
}
public String  _previouspage2(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "previouspage2", true))
	 {return ((String) Debug.delegate(ba, "previouspage2", null));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Public Sub PreviousPage2";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="If m_AllowBack = False Then Return";
if (__ref._m_allowback /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=44630021;
 //BA.debugLineNum = 44630021;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((__ref._m_currentindex /*int*/ -1)>-1) { 
RDebugUtils.currentLine=44630022;
 //BA.debugLineNum = 44630022;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex -1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem((int) (__ref._m_currentindex /*int*/ -1));
RDebugUtils.currentLine=44630023;
 //BA.debugLineNum = 44630023;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,False)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ -1),__c.False);
 }else 
{RDebugUtils.currentLine=44630024;
 //BA.debugLineNum = 44630024;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=44630025;
 //BA.debugLineNum = 44630025;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=44630028;
 //BA.debugLineNum = 44630028;BA.debugLine="End Sub";
return "";
}
public String  _removepage(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "removepage", true))
	 {return ((String) Debug.delegate(ba, "removepage", new Object[] {_index}));}
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Public Sub RemovePage(index As Int)";
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="xclv_main.RemoveAt(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=44498947;
 //BA.debugLineNum = 44498947;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=44498948;
 //BA.debugLineNum = 44498948;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
__ref._m_currentindex /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=44498950;
 //BA.debugLineNum = 44498950;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
__ref._m_currentindex /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY());
 };
RDebugUtils.currentLine=44498955;
 //BA.debugLineNum = 44498955;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value(b4a.example.ef.asviewpager __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "scroll2value", true))
	 {return ((String) Debug.delegate(ba, "scroll2value", new Object[] {_value}));}
int _i = 0;
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Public Sub Scroll2Value(Value As String)";
RDebugUtils.currentLine=45678601;
 //BA.debugLineNum = 45678601;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=45678602;
 //BA.debugLineNum = 45678602;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i)))) { 
RDebugUtils.currentLine=45678603;
 //BA.debugLineNum = 45678603;BA.debugLine="setCurrentIndex(i)";
__ref._setcurrentindex /*void*/ (null,_i);
RDebugUtils.currentLine=45678604;
 //BA.debugLineNum = 45678604;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=45678608;
 //BA.debugLineNum = 45678608;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value2(b4a.example.ef.asviewpager __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "scroll2value2", true))
	 {return ((String) Debug.delegate(ba, "scroll2value2", new Object[] {_value}));}
int _i = 0;
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Public Sub Scroll2Value2(Value As String)";
RDebugUtils.currentLine=45744137;
 //BA.debugLineNum = 45744137;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=45744138;
 //BA.debugLineNum = 45744138;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i)))) { 
RDebugUtils.currentLine=45744139;
 //BA.debugLineNum = 45744139;BA.debugLine="setCurrentIndex2(i)";
__ref._setcurrentindex2 /*void*/ (null,_i);
RDebugUtils.currentLine=45744140;
 //BA.debugLineNum = 45744140;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=45744144;
 //BA.debugLineNum = 45744144;BA.debugLine="End Sub";
return "";
}
public String  _setignorelazyloading(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorelazyloading", true))
	 {return ((String) Debug.delegate(ba, "setignorelazyloading", new Object[] {_ignore}));}
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Public Sub setIgnoreLazyLoading(Ignore As Boolean)";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="m_IgnoreLazyLoading = Ignore";
__ref._m_ignorelazyloading /*boolean*/  = _ignore;
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangedevent(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorepagechangedevent", true))
	 {return ((String) Debug.delegate(ba, "setignorepagechangedevent", new Object[] {_ignore}));}
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Public Sub setIgnorePageChangedEvent(ignore As Boo";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="g_ignorepagechangedevent = ignore";
__ref._g_ignorepagechangedevent /*boolean*/  = _ignore;
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangeevent(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorepagechangeevent", true))
	 {return ((String) Debug.delegate(ba, "setignorepagechangeevent", new Object[] {_ignore}));}
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Public Sub setIgnorePageChangeEvent(ignore As Bool";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="g_ignorepagechangeevent = ignore";
__ref._g_ignorepagechangeevent /*boolean*/  = _ignore;
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="End Sub";
return "";
}
public String  _setlazyloading(b4a.example.ef.asviewpager __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setlazyloading", true))
	 {return ((String) Debug.delegate(ba, "setlazyloading", new Object[] {_enabled}));}
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Public Sub setLazyLoading(Enabled As Boolean)";
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="m_LazyLoading = Enabled";
__ref._m_lazyloading /*boolean*/  = _enabled;
RDebugUtils.currentLine=45154309;
 //BA.debugLineNum = 45154309;BA.debugLine="End Sub";
return "";
}
public String  _setlazyloadingextrasize(b4a.example.ef.asviewpager __ref,int _extrasize) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setlazyloadingextrasize", true))
	 {return ((String) Debug.delegate(ba, "setlazyloadingextrasize", new Object[] {_extrasize}));}
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Public Sub setLazyLoadingExtraSize(ExtraSize As In";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="m_LazyLoadingExtraSize = ExtraSize";
__ref._m_lazyloadingextrasize /*int*/  = _extrasize;
RDebugUtils.currentLine=45285381;
 //BA.debugLineNum = 45285381;BA.debugLine="End Sub";
return "";
}
public String  _setloadingpanelhideduration(b4a.example.ef.asviewpager __ref,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setloadingpanelhideduration", true))
	 {return ((String) Debug.delegate(ba, "setloadingpanelhideduration", new Object[] {_duration}));}
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Public Sub setLoadingPanelHideDuration(Duration As";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="m_LoadingPanelHideDuration = Duration";
__ref._m_loadingpanelhideduration /*int*/  = _duration;
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="End Sub";
return "";
}
public String  _setscroll(b4a.example.ef.asviewpager __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setscroll", true))
	 {return ((String) Debug.delegate(ba, "setscroll", new Object[] {_enabled}));}
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Public Sub setScroll(enabled As Boolean)";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="g_isScrollEnabled = enabled";
__ref._g_isscrollenabled /*boolean*/  = _enabled;
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_itemclick(b4a.example.ef.asviewpager __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_itemclick", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Private Sub xclv_main_ItemClick (Index As Int, Val";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageClick",(int) (2))) { 
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageClick\",In";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageClick",(Object)(_index),_value);
 };
RDebugUtils.currentLine=47251460;
 //BA.debugLineNum = 47251460;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_reachend(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_reachend", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_reachend", null));}
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Private Sub xclv_main_ReachEnd";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_ReachE";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachEnd\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachEnd");
 };
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_scrollchanged(b4a.example.ef.asviewpager __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_scrollchanged", new Object[] {_offset}));}
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Private Sub xclv_main_ScrollChanged (Offset As Int";
RDebugUtils.currentLine=46858260;
 //BA.debugLineNum = 46858260;BA.debugLine="If xclv_main.FindIndexFromOffset(Offset) <> m_Cur";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset)!=__ref._m_currentindex /*int*/  && _offset==(double)(BA.ObjectToNumber((((__ref._m_orientation /*String*/ ).equals("Vertical")) ? ((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())) : ((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())))))*__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset) && __ref._m_ignore /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=46858261;
 //BA.debugLineNum = 46858261;BA.debugLine="PageChangedEvent(xclv_main.FindIndexFromOffset(O";
__ref._pagechangedevent /*void*/ (null,__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset),__c.False);
 };
RDebugUtils.currentLine=46858264;
 //BA.debugLineNum = 46858264;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Scroll";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ScrollChanged",(int) (1))) { 
RDebugUtils.currentLine=46858265;
 //BA.debugLineNum = 46858265;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ScrollChanged";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ScrollChanged",(Object)(_offset));
 };
RDebugUtils.currentLine=46858267;
 //BA.debugLineNum = 46858267;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_visiblerangechanged(b4a.example.ef.asviewpager __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_visiblerangechanged", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
RDebugUtils.currentLine=46661643;
 //BA.debugLineNum = 46661643;BA.debugLine="If m_LazyLoading = False Or m_IgnoreLazyLoading =";
if (__ref._m_lazyloading /*boolean*/ ==__c.False || __ref._m_ignorelazyloading /*boolean*/ ==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=46661657;
 //BA.debugLineNum = 46661657;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=46661658;
 //BA.debugLineNum = 46661658;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=46661659;
 //BA.debugLineNum = 46661659;BA.debugLine="If i > FirstIndex - m_LazyLoadingExtraSize And i";
if (_i>_firstindex-__ref._m_lazyloadingextrasize /*int*/  && _i<_lastindex+__ref._m_lazyloadingextrasize /*int*/ ) { 
RDebugUtils.currentLine=46661661;
 //BA.debugLineNum = 46661661;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
RDebugUtils.currentLine=46661662;
 //BA.debugLineNum = 46661662;BA.debugLine="LazyLoadingAddContent(p,xclv_main.GetValue(i))";
__ref._lazyloadingaddcontent /*String*/ (null,_p,__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i));
 };
 }else {
RDebugUtils.currentLine=46661666;
 //BA.debugLineNum = 46661666;BA.debugLine="If i > m_CurrentIndex - m_LazyLoadingExtraSize";
if (_i>__ref._m_currentindex /*int*/ -__ref._m_lazyloadingextrasize /*int*/  && _i<__ref._m_currentindex /*int*/ +__ref._m_lazyloadingextrasize /*int*/ ) { 
 }else {
RDebugUtils.currentLine=46661670;
 //BA.debugLineNum = 46661670;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=46661671;
 //BA.debugLineNum = 46661671;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 };
 };
 }
};
RDebugUtils.currentLine=46661678;
 //BA.debugLineNum = 46661678;BA.debugLine="End Sub";
return "";
}
public boolean  _xpnl_pagearea2_touch(b4a.example.ef.asviewpager __ref,Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xpnl_pagearea2_touch", true))
	 {return ((Boolean) Debug.delegate(ba, "xpnl_pagearea2_touch", new Object[] {_viewtag,_action,_x,_y,_motionevent}));}
boolean _skipcheck = false;
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Private Sub xpnl_PageArea2_Touch(ViewTag As Object";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="If g_isScrollEnabled = False Or (m_AllowBack = Fa";
if (__ref._g_isscrollenabled /*boolean*/ ==__c.False || (__ref._m_allowback /*boolean*/ ==__c.False && __ref._m_allownext /*boolean*/ ==__c.False)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="If m_AllowNext = False Or m_AllowBack = False The";
if (__ref._m_allownext /*boolean*/ ==__c.False || __ref._m_allowback /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=46596102;
 //BA.debugLineNum = 46596102;BA.debugLine="Dim SkipCheck As Boolean = False";
_skipcheck = __c.False;
RDebugUtils.currentLine=46596103;
 //BA.debugLineNum = 46596103;BA.debugLine="If Action = 1 Then";
if (_action==1) { 
RDebugUtils.currentLine=46596104;
 //BA.debugLineNum = 46596104;BA.debugLine="isfirstmove = False";
__ref._isfirstmove /*boolean*/  = __c.False;
RDebugUtils.currentLine=46596105;
 //BA.debugLineNum = 46596105;BA.debugLine="SkipCheck = True";
_skipcheck = __c.True;
 };
RDebugUtils.currentLine=46596108;
 //BA.debugLineNum = 46596108;BA.debugLine="If isfirstmove = False And SkipCheck = False The";
if (__ref._isfirstmove /*boolean*/ ==__c.False && _skipcheck==__c.False) { 
RDebugUtils.currentLine=46596110;
 //BA.debugLineNum = 46596110;BA.debugLine="ff(X,y)";
__ref._ff /*String*/ (null,_x,_y);
RDebugUtils.currentLine=46596112;
 //BA.debugLineNum = 46596112;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=46596115;
 //BA.debugLineNum = 46596115;BA.debugLine="If m_AllowNext = False And x < g_x Then";
if (__ref._m_allownext /*boolean*/ ==__c.False && _x<__ref._g_x /*float*/ ) { 
RDebugUtils.currentLine=46596116;
 //BA.debugLineNum = 46596116;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetX(__ref._m_maxoffset /*int*/ );
RDebugUtils.currentLine=46596118;
 //BA.debugLineNum = 46596118;BA.debugLine="Return True";
if (true) return __c.True;
 }else 
{RDebugUtils.currentLine=46596119;
 //BA.debugLineNum = 46596119;BA.debugLine="else If m_AllowBack = False And x > g_x Then";
if (__ref._m_allowback /*boolean*/ ==__c.False && _x>__ref._g_x /*float*/ ) { 
RDebugUtils.currentLine=46596120;
 //BA.debugLineNum = 46596120;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetX(__ref._m_maxoffset /*int*/ );
RDebugUtils.currentLine=46596122;
 //BA.debugLineNum = 46596122;BA.debugLine="Return True";
if (true) return __c.True;
 }}
;
 };
RDebugUtils.currentLine=46596130;
 //BA.debugLineNum = 46596130;BA.debugLine="Return HandleTouch(Action,x,y)";
if (true) return __ref._handletouch /*boolean*/ (null,_action,_x,_y);
RDebugUtils.currentLine=46596131;
 //BA.debugLineNum = 46596131;BA.debugLine="End Sub";
return false;
}
}