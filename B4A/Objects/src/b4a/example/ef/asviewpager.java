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
RDebugUtils.currentLine=24117290;
 //BA.debugLineNum = 24117290;BA.debugLine="xpnl_Loading.BringToFront";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=24117291;
 //BA.debugLineNum = 24117291;BA.debugLine="xpnl_Loading.SetLayoutAnimated(0,0,0,Width + 1000";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width+parent.__c.DipToCurrent((int) (1000))),(int) (_height+parent.__c.DipToCurrent((int) (1000))));
RDebugUtils.currentLine=24117292;
 //BA.debugLineNum = 24117292;BA.debugLine="xpnl_Loading.SetVisibleAnimated(0,True)";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=24117294;
 //BA.debugLineNum = 24117294;BA.debugLine="mBase.Width = Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width));
RDebugUtils.currentLine=24117295;
 //BA.debugLineNum = 24117295;BA.debugLine="mBase.Height = Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=24117296;
 //BA.debugLineNum = 24117296;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "base_resize"),(int) (0));
this.state = 16;
return;
case 16:
//C
this.state = 1;
;
RDebugUtils.currentLine=24117297;
 //BA.debugLineNum = 24117297;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getTop(),(int) (_width),(int) (_height));
RDebugUtils.currentLine=24117298;
 //BA.debugLineNum = 24117298;BA.debugLine="xclv_main.Base_Resize(Width,Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=24117301;
 //BA.debugLineNum = 24117301;BA.debugLine="For i = 0 To xclv_main.Size -1";
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
RDebugUtils.currentLine=24117302;
 //BA.debugLineNum = 24117302;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
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
RDebugUtils.currentLine=24117303;
 //BA.debugLineNum = 24117303;BA.debugLine="xclv_main.ResizeItem(i,mBase.Width)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._resizeitem(_i,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=24117305;
 //BA.debugLineNum = 24117305;BA.debugLine="xclv_main.ResizeItem(i,mBase.Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._resizeitem(_i,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 9:
//C
this.state = 18;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=24117311;
 //BA.debugLineNum = 24117311;BA.debugLine="If xclv_main.Size > 0 Then xclv_main.JumpToItem(m";

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
RDebugUtils.currentLine=24117312;
 //BA.debugLineNum = 24117312;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "base_resize"),(int) (250));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=24117313;
 //BA.debugLineNum = 24117313;BA.debugLine="LoadingPanelHandling";
__ref._loadingpanelhandling /*void*/ (null);
RDebugUtils.currentLine=24117319;
 //BA.debugLineNum = 24117319;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Public Sub ResetLazyLoadingPanels";
RDebugUtils.currentLine=26411018;
 //BA.debugLineNum = 26411018;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=26411019;
 //BA.debugLineNum = 26411019;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=26411021;
 //BA.debugLineNum = 26411021;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=26411022;
 //BA.debugLineNum = 26411022;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 }
};
RDebugUtils.currentLine=26411026;
 //BA.debugLineNum = 26411026;BA.debugLine="End Sub";
return "";
}
public String  _resetlazyloadingindex(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "resetlazyloadingindex", true))
	 {return ((String) Debug.delegate(ba, "resetlazyloadingindex", null));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub ResetLazyloadingIndex";
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
return "";
}
public String  _commit(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "commit", true))
	 {return ((String) Debug.delegate(ba, "commit", null));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Public Sub Commit";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="isLazyLoadingReady = True";
__ref._islazyloadingready /*boolean*/  = __c.True;
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="xclv_main.Refresh";
__ref._xclv_main /*b4a.example3.customlistview*/ ._refresh();
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="xclv_main.Clear";
__ref._xclv_main /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="m_CurrentIndex = 0";
__ref._m_currentindex /*int*/  = (int) (0);
RDebugUtils.currentLine=26345479;
 //BA.debugLineNum = 26345479;BA.debugLine="End Sub";
return "";
}
public String  _addpage(b4a.example.ef.asviewpager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_layoutpanel,_value}));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub AddPage(LayoutPanel As B4XView,Value As";
RDebugUtils.currentLine=24444933;
 //BA.debugLineNum = 24444933;BA.debugLine="xclv_main.Add(LayoutPanel,Value)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._add(_layoutpanel,_value);
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="m_Ignore = True";
__ref._m_ignore /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="PageChangedEvent(index,False)";
__ref._pagechangedevent /*void*/ (null,_index,parent.__c.False);
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="xclv_main.JumpToItem(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem(_index);
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "setcurrentindex2"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=26017800;
 //BA.debugLineNum = 26017800;BA.debugLine="m_Ignore = False";
__ref._m_ignore /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.asviewpager __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="xpnl_Loading = xui.CreatePanel(\"\")";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="mBase.AddView(xpnl_Loading,0,0,mBase.Width,mBase.";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="xpnl_Loading.Color = xui.Color_Black";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="xpnl_Loading.BringToFront";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="m_Orientation = Props.GetDefault(\"Orientation\",\"H";
__ref._m_orientation /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("Orientation"),(Object)("Horizontal")));
RDebugUtils.currentLine=23986187;
 //BA.debugLineNum = 23986187;BA.debugLine="m_Carousel = Props.GetDefault(\"Carousel\",False)";
__ref._m_carousel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Carousel"),(Object)(__c.False)));
RDebugUtils.currentLine=23986188;
 //BA.debugLineNum = 23986188;BA.debugLine="m_LazyLoading = Props.GetDefault(\"LazyLoading\",Fa";
__ref._m_lazyloading /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.False)));
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="m_LazyLoadingExtraSize = Props.GetDefault(\"LazyLo";
__ref._m_lazyloadingextrasize /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("LazyLoadingExtraSize"),(Object)(5))));
RDebugUtils.currentLine=23986190;
 //BA.debugLineNum = 23986190;BA.debugLine="m_LoadingPanelColor = xui.PaintOrColorToColor(Pro";
__ref._m_loadingpanelcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("LoadingPanelColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black)));
RDebugUtils.currentLine=23986191;
 //BA.debugLineNum = 23986191;BA.debugLine="xpnl_Loading.Color = m_LoadingPanelColor";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_loadingpanelcolor /*int*/ );
RDebugUtils.currentLine=23986192;
 //BA.debugLineNum = 23986192;BA.debugLine="m_BackGestureGap = Props.GetDefault(\"BackGestureG";
__ref._m_backgesturegap /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("BackGestureGap"),(Object)(__c.False)));
RDebugUtils.currentLine=23986195;
 //BA.debugLineNum = 23986195;BA.debugLine="If xclv_main.IsInitialized = False Then";
if (__ref._xclv_main /*b4a.example3.customlistview*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=23986196;
 //BA.debugLineNum = 23986196;BA.debugLine="ini_xclv";
__ref._ini_xclv /*String*/ (null);
 };
RDebugUtils.currentLine=23986205;
 //BA.debugLineNum = 23986205;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=23986223;
 //BA.debugLineNum = 23986223;BA.debugLine="End Sub";
return "";
}
public String  _setloadingpanelcolor(b4a.example.ef.asviewpager __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setloadingpanelcolor", true))
	 {return ((String) Debug.delegate(ba, "setloadingpanelcolor", new Object[] {_color}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Public Sub setLoadingPanelColor(Color As Int)";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="m_LoadingPanelColor = Color";
__ref._m_loadingpanelcolor /*int*/  = _color;
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="xpnl_Loading.Color = Color";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_color);
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="End Sub";
return "";
}
public int  _getsize(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="Return xclv_main.Size";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getsize();
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="Return xclv_main.GetPanel(Index)";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="Return xclv_main.GetValue(Index)";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_index);
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="PageChangedEvent(index,True)";
__ref._pagechangedevent /*void*/ (null,_index,parent.__c.True);
RDebugUtils.currentLine=25952261;
 //BA.debugLineNum = 25952261;BA.debugLine="m_Ignore = True";
__ref._m_ignore /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=25952262;
 //BA.debugLineNum = 25952262;BA.debugLine="xclv_main.ScrollToItem(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(_index);
RDebugUtils.currentLine=25952263;
 //BA.debugLineNum = 25952263;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "setcurrentindex"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=25952264;
 //BA.debugLineNum = 25952264;BA.debugLine="m_Ignore = False";
__ref._m_ignore /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=25952266;
 //BA.debugLineNum = 25952266;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub getBase As B4XView";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return null;
}
public String  _addpageat(b4a.example.ef.asviewpager __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "addpageat", true))
	 {return ((String) Debug.delegate(ba, "addpageat", new Object[] {_index,_layoutpanel,_value}));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Public Sub AddPageAt(index As Int,LayoutPanel As B";
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="If index <= m_CurrentIndex Then";
if (_index<=__ref._m_currentindex /*int*/ ) { 
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="m_CurrentIndex = m_CurrentIndex +1";
__ref._m_currentindex /*int*/  = (int) (__ref._m_currentindex /*int*/ +1);
 };
RDebugUtils.currentLine=24510473;
 //BA.debugLineNum = 24510473;BA.debugLine="xclv_main.InsertAt(index,LayoutPanel,Value)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._insertat(_index,_layoutpanel,_value);
RDebugUtils.currentLine=24510483;
 //BA.debugLineNum = 24510483;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=24510488;
 //BA.debugLineNum = 24510488;BA.debugLine="End Sub";
return "";
}
public String  _previouspage(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "previouspage", true))
	 {return ((String) Debug.delegate(ba, "previouspage", null));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Public Sub PreviousPage";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="If m_AllowBack = False Then Return";
if (__ref._m_allowback /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((__ref._m_currentindex /*int*/ -1)>-1) { 
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex -1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._m_currentindex /*int*/ -1));
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,True)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ -1),__c.True);
 }else 
{RDebugUtils.currentLine=24641545;
 //BA.debugLineNum = 24641545;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=24641546;
 //BA.debugLineNum = 24641546;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=24641549;
 //BA.debugLineNum = 24641549;BA.debugLine="End Sub";
return "";
}
public String  _nextpage(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "nextpage", true))
	 {return ((String) Debug.delegate(ba, "nextpage", null));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Public Sub NextPage";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="If m_AllowNext = False Then Return";
if (__ref._m_allownext /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((__ref._m_currentindex /*int*/ +1)<__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()) { 
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex +1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._m_currentindex /*int*/ +1));
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,True)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ +1),__c.True);
 }else 
{RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=24772620;
 //BA.debugLineNum = 24772620;BA.debugLine="End Sub";
return "";
}
public String  _allowback(b4a.example.ef.asviewpager __ref,boolean _allow) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "allowback", true))
	 {return ((String) Debug.delegate(ba, "allowback", new Object[] {_allow}));}
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Public Sub AllowBack(Allow As Boolean)";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="m_AllowBack = Allow";
__ref._m_allowback /*boolean*/  = _allow;
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="End Sub";
return "";
}
public String  _allownext(b4a.example.ef.asviewpager __ref,boolean _allow) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "allownext", true))
	 {return ((String) Debug.delegate(ba, "allownext", new Object[] {_allow}));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Public Sub AllowNext(Allow As Boolean)";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="m_AllowNext = Allow";
__ref._m_allownext /*boolean*/  = _allow;
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="If isHidding = False Then";
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
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="isHidding = True";
__ref._ishidding /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._m_loadingpanelhideduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "loadingpanelhandling"),(int) (__ref._m_loadingpanelhideduration /*int*/ +50));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="isHidding = False";
__ref._ishidding /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=24182792;
 //BA.debugLineNum = 24182792;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "loadingpanelhandling"),(int) (0));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=24182793;
 //BA.debugLineNum = 24182793;BA.debugLine="CheckLoadingPanelVisiblity";
__ref._checkloadingpanelvisiblity /*void*/ (null);
RDebugUtils.currentLine=24182794;
 //BA.debugLineNum = 24182794;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="If m_Carousel = True Then";
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
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkcarousel"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="If m_CurrentIndex = xclv_main.Size -1 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._m_currentindex /*int*/ ==__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="Else If m_CurrentIndex = 0 Then";
if (__ref._m_currentindex /*int*/ ==0) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="setCurrentIndex2(0)";
__ref._setcurrentindex2 /*void*/ (null,(int) (0));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="setCurrentIndex2(xclv_main.Size -1)";
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
RDebugUtils.currentLine=26607625;
 //BA.debugLineNum = 26607625;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkloadingpanelvisiblity"),(int) (250));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="If xpnl_Loading.Visible = True And isHidding = Fa";
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
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="isHidding = True";
__ref._ishidding /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._m_loadingpanelhideduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=24248326;
 //BA.debugLineNum = 24248326;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkloadingpanelvisiblity"),(int) (__ref._m_loadingpanelhideduration /*int*/ +50));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="isHidding = False";
__ref._ishidding /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=24248330;
 //BA.debugLineNum = 24248330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=23855114;
 //BA.debugLineNum = 23855114;BA.debugLine="Private xclv_main As CustomListView";
_xclv_main = new b4a.example3.customlistview();
RDebugUtils.currentLine=23855118;
 //BA.debugLineNum = 23855118;BA.debugLine="Private xpnl_Loading As B4XView";
_xpnl_loading = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23855121;
 //BA.debugLineNum = 23855121;BA.debugLine="Private m_CurrentIndex As Int = 0'ignore";
_m_currentindex = (int) (0);
RDebugUtils.currentLine=23855124;
 //BA.debugLineNum = 23855124;BA.debugLine="Private g_x,g_y,g_dv,g_ad As Float";
_g_x = 0f;
_g_y = 0f;
_g_dv = 0f;
_g_ad = 0f;
RDebugUtils.currentLine=23855125;
 //BA.debugLineNum = 23855125;BA.debugLine="Private g_ms As Long";
_g_ms = 0L;
RDebugUtils.currentLine=23855126;
 //BA.debugLineNum = 23855126;BA.debugLine="Private  isfirstmove As Boolean = False";
_isfirstmove = __c.False;
RDebugUtils.currentLine=23855134;
 //BA.debugLineNum = 23855134;BA.debugLine="Private m_Ignore As Boolean = False'Ignore";
_m_ignore = __c.False;
RDebugUtils.currentLine=23855135;
 //BA.debugLineNum = 23855135;BA.debugLine="Private g_ignorepagechangedevent As Boolean = Fal";
_g_ignorepagechangedevent = __c.False;
RDebugUtils.currentLine=23855136;
 //BA.debugLineNum = 23855136;BA.debugLine="Private g_ignorepagechangeevent As Boolean = Fals";
_g_ignorepagechangeevent = __c.False;
RDebugUtils.currentLine=23855137;
 //BA.debugLineNum = 23855137;BA.debugLine="Private m_Orientation As String";
_m_orientation = "";
RDebugUtils.currentLine=23855138;
 //BA.debugLineNum = 23855138;BA.debugLine="Private m_Carousel As Boolean";
_m_carousel = false;
RDebugUtils.currentLine=23855139;
 //BA.debugLineNum = 23855139;BA.debugLine="Private m_LazyLoading As Boolean";
_m_lazyloading = false;
RDebugUtils.currentLine=23855140;
 //BA.debugLineNum = 23855140;BA.debugLine="Private m_LazyLoadingExtraSize As Int";
_m_lazyloadingextrasize = 0;
RDebugUtils.currentLine=23855141;
 //BA.debugLineNum = 23855141;BA.debugLine="Private m_LoadingPanelColor As Int";
_m_loadingpanelcolor = 0;
RDebugUtils.currentLine=23855142;
 //BA.debugLineNum = 23855142;BA.debugLine="Private m_BackGestureGap As Boolean 'Ignore";
_m_backgesturegap = false;
RDebugUtils.currentLine=23855143;
 //BA.debugLineNum = 23855143;BA.debugLine="Private m_AllowNext As Boolean = True";
_m_allownext = __c.True;
RDebugUtils.currentLine=23855144;
 //BA.debugLineNum = 23855144;BA.debugLine="Private m_AllowBack As Boolean = True";
_m_allowback = __c.True;
RDebugUtils.currentLine=23855145;
 //BA.debugLineNum = 23855145;BA.debugLine="Private m_MaxOffset As Int = 0'Ignore";
_m_maxoffset = (int) (0);
RDebugUtils.currentLine=23855147;
 //BA.debugLineNum = 23855147;BA.debugLine="Private ismoving As Boolean = False'Ignore";
_ismoving = __c.False;
RDebugUtils.currentLine=23855148;
 //BA.debugLineNum = 23855148;BA.debugLine="Private g_isScrollEnabled As Boolean = True";
_g_isscrollenabled = __c.True;
RDebugUtils.currentLine=23855149;
 //BA.debugLineNum = 23855149;BA.debugLine="Private m_IgnoreLazyLoading As Boolean = False'Ig";
_m_ignorelazyloading = __c.False;
RDebugUtils.currentLine=23855151;
 //BA.debugLineNum = 23855151;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=23855152;
 //BA.debugLineNum = 23855152;BA.debugLine="Private isLazyLoadingReady As Boolean = False";
_islazyloadingready = __c.False;
RDebugUtils.currentLine=23855153;
 //BA.debugLineNum = 23855153;BA.debugLine="Private isHidding As Boolean = False";
_ishidding = __c.False;
RDebugUtils.currentLine=23855155;
 //BA.debugLineNum = 23855155;BA.debugLine="Private OldIndex As Int = 0";
_oldindex = (int) (0);
RDebugUtils.currentLine=23855156;
 //BA.debugLineNum = 23855156;BA.debugLine="Private m_LoadingPanelHideDuration As Int = 500";
_m_loadingpanelhideduration = (int) (500);
RDebugUtils.currentLine=23855157;
 //BA.debugLineNum = 23855157;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Private Sub ini_xclv";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=24051718;
 //BA.debugLineNum = 24051718;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("DividerColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=24051719;
 //BA.debugLineNum = 24051719;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
_tmpmap.Put((Object)("DividerHeight"),(Object)(0));
RDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("PressedColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=24051721;
 //BA.debugLineNum = 24051721;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
_tmpmap.Put((Object)("InsertAnimationDuration"),(Object)(0));
RDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="tmpmap.Put(\"ListOrientation\",m_Orientation)";
_tmpmap.Put((Object)("ListOrientation"),(Object)(__ref._m_orientation /*String*/ ));
RDebugUtils.currentLine=24051723;
 //BA.debugLineNum = 24051723;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
_tmpmap.Put((Object)("ShowScrollBar"),(Object)(__c.False));
RDebugUtils.currentLine=24051724;
 //BA.debugLineNum = 24051724;BA.debugLine="xclv_main.Initialize(Me,\"xclv_main\")";
__ref._xclv_main /*b4a.example3.customlistview*/ ._initialize(ba,this,"xclv_main");
RDebugUtils.currentLine=24051725;
 //BA.debugLineNum = 24051725;BA.debugLine="xclv_main.DesignerCreateView(mBase,tmplbl,tmpmap)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._designercreateview((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=24051727;
 //BA.debugLineNum = 24051727;BA.debugLine="Private objPages As Reflector";
_objpages = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=24051728;
 //BA.debugLineNum = 24051728;BA.debugLine="objPages.Target = xclv_main.sv";
_objpages.Target = (Object)(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getObject());
RDebugUtils.currentLine=24051729;
 //BA.debugLineNum = 24051729;BA.debugLine="objPages.SetOnTouchListener(\"xpnl_PageArea2_Touch";
_objpages.SetOnTouchListener(ba,"xpnl_PageArea2_Touch");
RDebugUtils.currentLine=24051730;
 //BA.debugLineNum = 24051730;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getTop(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=24051731;
 //BA.debugLineNum = 24051731;BA.debugLine="xclv_main.Base_Resize(mBase.Width,mBase.Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._base_resize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=24051755;
 //BA.debugLineNum = 24051755;BA.debugLine="End Sub";
return "";
}
public String  _ff(b4a.example.ef.asviewpager __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "ff", true))
	 {return ((String) Debug.delegate(ba, "ff", new Object[] {_x,_y}));}
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Private Sub ff(x As Float,y As Float)";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="isfirstmove = True";
__ref._isfirstmove /*boolean*/  = __c.True;
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="g_ms=DateTime.Now";
__ref._g_ms /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="g_x=X";
__ref._g_x /*float*/  = _x;
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="g_y=Y";
__ref._g_y /*float*/  = _y;
RDebugUtils.currentLine=26476549;
 //BA.debugLineNum = 26476549;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=26476550;
 //BA.debugLineNum = 26476550;BA.debugLine="g_dv = (mBase.Width)/2";
__ref._g_dv /*float*/  = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())/(double)2);
 }else {
RDebugUtils.currentLine=26476552;
 //BA.debugLineNum = 26476552;BA.debugLine="g_dv = (mBase.Height)/2";
__ref._g_dv /*float*/  = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())/(double)2);
 };
RDebugUtils.currentLine=26476554;
 //BA.debugLineNum = 26476554;BA.debugLine="g_ad = 0";
__ref._g_ad /*float*/  = (float) (0);
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentindex(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getcurrentindex", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentindex", null));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub getCurrentIndex As Int";
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="Return m_CurrentIndex";
if (true) return __ref._m_currentindex /*int*/ ;
RDebugUtils.currentLine=25886726;
 //BA.debugLineNum = 25886726;BA.debugLine="End Sub";
return 0;
}
public b4a.example3.customlistview  _getcustomlistview(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getcustomlistview", true))
	 {return ((b4a.example3.customlistview) Debug.delegate(ba, "getcustomlistview", null));}
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub getCustomListView As CustomListView";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Return xclv_main";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ;
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="End Sub";
return null;
}
public boolean  _getisscrollenabled(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getisscrollenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getisscrollenabled", null));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub getisScrollEnabled As Boolean";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="Return g_isScrollEnabled";
if (true) return __ref._g_isscrollenabled /*boolean*/ ;
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="End Sub";
return false;
}
public boolean  _getlazyloading(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getlazyloading", true))
	 {return ((Boolean) Debug.delegate(ba, "getlazyloading", null));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Public Sub getLazyLoading As Boolean";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="Return m_LazyLoading";
if (true) return __ref._m_lazyloading /*boolean*/ ;
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="End Sub";
return false;
}
public int  _getlazyloadingextrasize(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getlazyloadingextrasize", true))
	 {return ((Integer) Debug.delegate(ba, "getlazyloadingextrasize", null));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Public Sub getLazyLoadingExtraSize As Int";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="Return m_LazyLoadingExtraSize";
if (true) return __ref._m_lazyloadingextrasize /*int*/ ;
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="End Sub";
return 0;
}
public int  _getloadingpanelcolor(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getloadingpanelcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getloadingpanelcolor", null));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Public Sub getLoadingPanelColor As Int";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="Return m_LoadingPanelColor";
if (true) return __ref._m_loadingpanelcolor /*int*/ ;
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="End Sub";
return 0;
}
public boolean  _handletouch(b4a.example.ef.asviewpager __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "handletouch", true))
	 {return ((Boolean) Debug.delegate(ba, "handletouch", new Object[] {_action,_x,_y}));}
int _i = 0;
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Private Sub HandleTouch(Action As Int,x As Float,y";
RDebugUtils.currentLine=26542086;
 //BA.debugLineNum = 26542086;BA.debugLine="Select Action";
switch (_action) {
case 2: {
RDebugUtils.currentLine=26542088;
 //BA.debugLineNum = 26542088;BA.debugLine="TouchBeginEvent";
__ref._touchbeginevent /*String*/ (null);
RDebugUtils.currentLine=26542089;
 //BA.debugLineNum = 26542089;BA.debugLine="ismoving = True";
__ref._ismoving /*boolean*/  = __c.True;
RDebugUtils.currentLine=26542090;
 //BA.debugLineNum = 26542090;BA.debugLine="If isfirstmove = False Then";
if (__ref._isfirstmove /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26542092;
 //BA.debugLineNum = 26542092;BA.debugLine="ff(X,y)";
__ref._ff /*String*/ (null,_x,_y);
 }else {
 };
 break; }
case 1: {
RDebugUtils.currentLine=26542099;
 //BA.debugLineNum = 26542099;BA.debugLine="TouchEndEvent";
__ref._touchendevent /*String*/ (null);
RDebugUtils.currentLine=26542100;
 //BA.debugLineNum = 26542100;BA.debugLine="ismoving = False";
__ref._ismoving /*boolean*/  = __c.False;
RDebugUtils.currentLine=26542101;
 //BA.debugLineNum = 26542101;BA.debugLine="isfirstmove = False";
__ref._isfirstmove /*boolean*/  = __c.False;
RDebugUtils.currentLine=26542103;
 //BA.debugLineNum = 26542103;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=26542104;
 //BA.debugLineNum = 26542104;BA.debugLine="If ((DateTime.Now-g_ms)<300) And (Abs(X - g_x)";
if (((__c.DateTime.getNow()-__ref._g_ms /*long*/ )<300) && (__c.Abs(_x-__ref._g_x /*float*/ )>(__c.DipToCurrent((int) (1))))) { 
RDebugUtils.currentLine=26542106;
 //BA.debugLineNum = 26542106;BA.debugLine="g_dv =1dip";
__ref._g_dv /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=26542108;
 //BA.debugLineNum = 26542108;BA.debugLine="If X < g_x Then g_ad = 1";
if (_x<__ref._g_x /*float*/ ) { 
__ref._g_ad /*float*/  = (float) (1);};
 };
 }else {
RDebugUtils.currentLine=26542112;
 //BA.debugLineNum = 26542112;BA.debugLine="If ((DateTime.Now-g_ms)<300)  And (Abs(y - g_y";
if (((__c.DateTime.getNow()-__ref._g_ms /*long*/ )<300) && (__c.Abs(_y-__ref._g_y /*float*/ )>(__c.DipToCurrent((int) (1))))) { 
RDebugUtils.currentLine=26542113;
 //BA.debugLineNum = 26542113;BA.debugLine="g_dv =1dip";
__ref._g_dv /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=26542115;
 //BA.debugLineNum = 26542115;BA.debugLine="If y < g_y Then g_ad = 1";
if (_y<__ref._g_y /*float*/ ) { 
__ref._g_ad /*float*/  = (float) (1);};
 };
 };
RDebugUtils.currentLine=26542120;
 //BA.debugLineNum = 26542120;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step24 = 1;
final int limit24 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=26542121;
 //BA.debugLineNum = 26542121;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=26542122;
 //BA.debugLineNum = 26542122;BA.debugLine="If (((i+1)*mBase.Width) - xclv_main.sv.Scroll";
if ((((_i+1)*__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX())>(__ref._g_dv /*float*/ )) { 
RDebugUtils.currentLine=26542124;
 //BA.debugLineNum = 26542124;BA.debugLine="If (i+g_ad) > (xclv_main.Size -1) Or xclv_ma";
if ((_i+__ref._g_ad /*float*/ )>(__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1) || __ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX()<=0) { 
RDebugUtils.currentLine=26542125;
 //BA.debugLineNum = 26542125;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
RDebugUtils.currentLine=26542126;
 //BA.debugLineNum = 26542126;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=26542129;
 //BA.debugLineNum = 26542129;BA.debugLine="If isNumberOneCloserToZero(g_x - x,g_y - y)";
if (__ref._isnumberoneclosertozero /*boolean*/ (null,(int) (__ref._g_x /*float*/ -_x),(int) (__ref._g_y /*float*/ -_y))==__c.False) { 
RDebugUtils.currentLine=26542130;
 //BA.debugLineNum = 26542130;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=26542131;
 //BA.debugLineNum = 26542131;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=26542133;
 //BA.debugLineNum = 26542133;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (_i+__ref._g_ad /*float*/ ));
RDebugUtils.currentLine=26542134;
 //BA.debugLineNum = 26542134;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
if (__ref._m_currentindex /*int*/ !=(_i+__ref._g_ad /*float*/ )) { 
__ref._pagechangedevent /*void*/ (null,(int) (_i+__ref._g_ad /*float*/ ),__c.True);};
RDebugUtils.currentLine=26542138;
 //BA.debugLineNum = 26542138;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }else {
RDebugUtils.currentLine=26542142;
 //BA.debugLineNum = 26542142;BA.debugLine="If (((i+1)*mBase.Height) - xclv_main.sv.Scrol";
if ((((_i+1)*__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())-__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY())>(__ref._g_dv /*float*/ )) { 
RDebugUtils.currentLine=26542144;
 //BA.debugLineNum = 26542144;BA.debugLine="If (i+g_ad) > xclv_main.Size-1 Or  xclv_main";
if ((_i+__ref._g_ad /*float*/ )>__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1 || __ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()<=0) { 
RDebugUtils.currentLine=26542145;
 //BA.debugLineNum = 26542145;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
RDebugUtils.currentLine=26542146;
 //BA.debugLineNum = 26542146;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=26542149;
 //BA.debugLineNum = 26542149;BA.debugLine="If isNumberOneCloserToZero(g_y - y,g_x - x)";
if (__ref._isnumberoneclosertozero /*boolean*/ (null,(int) (__ref._g_y /*float*/ -_y),(int) (__ref._g_x /*float*/ -_x))==__c.False) { 
RDebugUtils.currentLine=26542150;
 //BA.debugLineNum = 26542150;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=26542151;
 //BA.debugLineNum = 26542151;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=26542153;
 //BA.debugLineNum = 26542153;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (_i+__ref._g_ad /*float*/ ));
RDebugUtils.currentLine=26542154;
 //BA.debugLineNum = 26542154;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
if (__ref._m_currentindex /*int*/ !=(_i+__ref._g_ad /*float*/ )) { 
__ref._pagechangedevent /*void*/ (null,(int) (_i+__ref._g_ad /*float*/ ),__c.True);};
RDebugUtils.currentLine=26542158;
 //BA.debugLineNum = 26542158;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 }
};
 break; }
}
;
RDebugUtils.currentLine=26542163;
 //BA.debugLineNum = 26542163;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=26542164;
 //BA.debugLineNum = 26542164;BA.debugLine="End Sub";
return false;
}
public String  _touchbeginevent(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "touchbeginevent", true))
	 {return ((String) Debug.delegate(ba, "touchbeginevent", null));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Private Sub TouchBeginEvent";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="If ismoving = False Then";
if (__ref._ismoving /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchB";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchBegin",(int) (0))) { 
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchBegin\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchBegin");
 };
 };
RDebugUtils.currentLine=27197446;
 //BA.debugLineNum = 27197446;BA.debugLine="End Sub";
return "";
}
public String  _touchendevent(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "touchendevent", true))
	 {return ((String) Debug.delegate(ba, "touchendevent", null));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Private Sub TouchEndEvent";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchE";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchEnd",(int) (0))) { 
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchEnd\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchEnd");
 };
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="End Sub";
return "";
}
public boolean  _isnumberoneclosertozero(b4a.example.ef.asviewpager __ref,int _numberone,int _numbertwo) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "isnumberoneclosertozero", true))
	 {return ((Boolean) Debug.delegate(ba, "isnumberoneclosertozero", new Object[] {_numberone,_numbertwo}));}
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Private Sub isNumberOneCloserToZero (numberOne As";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="Return (Abs(numberOne) >= Abs(numberTwo))";
if (true) return (__c.Abs(_numberone)>=__c.Abs(_numbertwo));
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="If m_CurrentIndex = index Then Return";
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
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="m_CurrentIndex = index";
__ref._m_currentindex /*int*/  = _index;
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="If g_ignorepagechangeevent = False And xui.SubExi";
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
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChange\",i";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChange",(Object)(_index));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=27131911;
 //BA.debugLineNum = 27131911;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
__ref._m_maxoffset /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._getrawlistitem(_index).Offset;
RDebugUtils.currentLine=27131913;
 //BA.debugLineNum = 27131913;BA.debugLine="If delayed = True Then Sleep(300)";
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
RDebugUtils.currentLine=27131915;
 //BA.debugLineNum = 27131915;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
__ref._m_maxoffset /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._getrawlistitem(_index).Offset;
RDebugUtils.currentLine=27131917;
 //BA.debugLineNum = 27131917;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";
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
RDebugUtils.currentLine=27131918;
 //BA.debugLineNum = 27131918;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(Object)(_index));
 if (true) break;
;
RDebugUtils.currentLine=27131920;
 //BA.debugLineNum = 27131920;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";

case 20:
//if
this.state = 23;
if (__ref._g_ignorepagechangedevent /*boolean*/ ==parent.__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged2",(int) (2))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=27131921;
 //BA.debugLineNum = 27131921;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageChanged2\"";
parent.__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged2",(Object)(_index),(Object)(__ref._oldindex /*int*/ ));
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=27131923;
 //BA.debugLineNum = 27131923;BA.debugLine="OldIndex = index";
__ref._oldindex /*int*/  = _index;
RDebugUtils.currentLine=27131924;
 //BA.debugLineNum = 27131924;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Private Sub LazyLoadingAddContent(Parent As B4XVie";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="If isLazyLoadingReady = True And xui.SubExists(mC";
if (__ref._islazyloadingready /*boolean*/ ==__c.True && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LazyLoadingAddContent",(int) (2))) { 
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="CallSub3(mCallBack, mEventName & \"_LazyLoadingAd";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LazyLoadingAddContent",(Object)(_parent),_value);
 };
RDebugUtils.currentLine=27066372;
 //BA.debugLineNum = 27066372;BA.debugLine="End Sub";
return "";
}
public String  _nextpage2(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "nextpage2", true))
	 {return ((String) Debug.delegate(ba, "nextpage2", null));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Public Sub NextPage2";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="If m_AllowNext = False Then Return";
if (__ref._m_allownext /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24838149;
 //BA.debugLineNum = 24838149;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((__ref._m_currentindex /*int*/ +1)<__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()) { 
RDebugUtils.currentLine=24838151;
 //BA.debugLineNum = 24838151;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex +1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem((int) (__ref._m_currentindex /*int*/ +1));
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,False)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ +1),__c.False);
 }else 
{RDebugUtils.currentLine=24838153;
 //BA.debugLineNum = 24838153;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=24838154;
 //BA.debugLineNum = 24838154;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=24838157;
 //BA.debugLineNum = 24838157;BA.debugLine="End Sub";
return "";
}
public String  _previouspage2(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "previouspage2", true))
	 {return ((String) Debug.delegate(ba, "previouspage2", null));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Public Sub PreviousPage2";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="If m_AllowBack = False Then Return";
if (__ref._m_allowback /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((__ref._m_currentindex /*int*/ -1)>-1) { 
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex -1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem((int) (__ref._m_currentindex /*int*/ -1));
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,False)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ -1),__c.False);
 }else 
{RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=24707081;
 //BA.debugLineNum = 24707081;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=24707084;
 //BA.debugLineNum = 24707084;BA.debugLine="End Sub";
return "";
}
public String  _removepage(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "removepage", true))
	 {return ((String) Debug.delegate(ba, "removepage", new Object[] {_index}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Public Sub RemovePage(index As Int)";
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="xclv_main.RemoveAt(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=24576004;
 //BA.debugLineNum = 24576004;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
__ref._m_currentindex /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=24576006;
 //BA.debugLineNum = 24576006;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
__ref._m_currentindex /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY());
 };
RDebugUtils.currentLine=24576011;
 //BA.debugLineNum = 24576011;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value(b4a.example.ef.asviewpager __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "scroll2value", true))
	 {return ((String) Debug.delegate(ba, "scroll2value", new Object[] {_value}));}
int _i = 0;
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub Scroll2Value(Value As String)";
RDebugUtils.currentLine=25755657;
 //BA.debugLineNum = 25755657;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=25755658;
 //BA.debugLineNum = 25755658;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i)))) { 
RDebugUtils.currentLine=25755659;
 //BA.debugLineNum = 25755659;BA.debugLine="setCurrentIndex(i)";
__ref._setcurrentindex /*void*/ (null,_i);
RDebugUtils.currentLine=25755660;
 //BA.debugLineNum = 25755660;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=25755664;
 //BA.debugLineNum = 25755664;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value2(b4a.example.ef.asviewpager __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "scroll2value2", true))
	 {return ((String) Debug.delegate(ba, "scroll2value2", new Object[] {_value}));}
int _i = 0;
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub Scroll2Value2(Value As String)";
RDebugUtils.currentLine=25821193;
 //BA.debugLineNum = 25821193;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=25821194;
 //BA.debugLineNum = 25821194;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i)))) { 
RDebugUtils.currentLine=25821195;
 //BA.debugLineNum = 25821195;BA.debugLine="setCurrentIndex2(i)";
__ref._setcurrentindex2 /*void*/ (null,_i);
RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=25821200;
 //BA.debugLineNum = 25821200;BA.debugLine="End Sub";
return "";
}
public String  _setignorelazyloading(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorelazyloading", true))
	 {return ((String) Debug.delegate(ba, "setignorelazyloading", new Object[] {_ignore}));}
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Public Sub setIgnoreLazyLoading(Ignore As Boolean)";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="m_IgnoreLazyLoading = Ignore";
__ref._m_ignorelazyloading /*boolean*/  = _ignore;
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangedevent(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorepagechangedevent", true))
	 {return ((String) Debug.delegate(ba, "setignorepagechangedevent", new Object[] {_ignore}));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub setIgnorePageChangedEvent(ignore As Boo";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="g_ignorepagechangedevent = ignore";
__ref._g_ignorepagechangedevent /*boolean*/  = _ignore;
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangeevent(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorepagechangeevent", true))
	 {return ((String) Debug.delegate(ba, "setignorepagechangeevent", new Object[] {_ignore}));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub setIgnorePageChangeEvent(ignore As Bool";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="g_ignorepagechangeevent = ignore";
__ref._g_ignorepagechangeevent /*boolean*/  = _ignore;
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
return "";
}
public String  _setlazyloading(b4a.example.ef.asviewpager __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setlazyloading", true))
	 {return ((String) Debug.delegate(ba, "setlazyloading", new Object[] {_enabled}));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub setLazyLoading(Enabled As Boolean)";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="m_LazyLoading = Enabled";
__ref._m_lazyloading /*boolean*/  = _enabled;
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="End Sub";
return "";
}
public String  _setlazyloadingextrasize(b4a.example.ef.asviewpager __ref,int _extrasize) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setlazyloadingextrasize", true))
	 {return ((String) Debug.delegate(ba, "setlazyloadingextrasize", new Object[] {_extrasize}));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub setLazyLoadingExtraSize(ExtraSize As In";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="m_LazyLoadingExtraSize = ExtraSize";
__ref._m_lazyloadingextrasize /*int*/  = _extrasize;
RDebugUtils.currentLine=25362437;
 //BA.debugLineNum = 25362437;BA.debugLine="End Sub";
return "";
}
public String  _setloadingpanelhideduration(b4a.example.ef.asviewpager __ref,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setloadingpanelhideduration", true))
	 {return ((String) Debug.delegate(ba, "setloadingpanelhideduration", new Object[] {_duration}));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Public Sub setLoadingPanelHideDuration(Duration As";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="m_LoadingPanelHideDuration = Duration";
__ref._m_loadingpanelhideduration /*int*/  = _duration;
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="End Sub";
return "";
}
public String  _setscroll(b4a.example.ef.asviewpager __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setscroll", true))
	 {return ((String) Debug.delegate(ba, "setscroll", new Object[] {_enabled}));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Public Sub setScroll(enabled As Boolean)";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="g_isScrollEnabled = enabled";
__ref._g_isscrollenabled /*boolean*/  = _enabled;
RDebugUtils.currentLine=25493510;
 //BA.debugLineNum = 25493510;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_itemclick(b4a.example.ef.asviewpager __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_itemclick", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Private Sub xclv_main_ItemClick (Index As Int, Val";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageClick",(int) (2))) { 
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageClick\",In";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageClick",(Object)(_index),_value);
 };
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_reachend(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_reachend", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_reachend", null));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Private Sub xclv_main_ReachEnd";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_ReachE";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachEnd\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachEnd");
 };
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_scrollchanged(b4a.example.ef.asviewpager __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_scrollchanged", new Object[] {_offset}));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Private Sub xclv_main_ScrollChanged (Offset As Int";
RDebugUtils.currentLine=26935316;
 //BA.debugLineNum = 26935316;BA.debugLine="If xclv_main.FindIndexFromOffset(Offset) <> m_Cur";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset)!=__ref._m_currentindex /*int*/  && _offset==(double)(BA.ObjectToNumber((((__ref._m_orientation /*String*/ ).equals("Vertical")) ? ((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())) : ((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())))))*__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset) && __ref._m_ignore /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26935317;
 //BA.debugLineNum = 26935317;BA.debugLine="PageChangedEvent(xclv_main.FindIndexFromOffset(O";
__ref._pagechangedevent /*void*/ (null,__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset),__c.False);
 };
RDebugUtils.currentLine=26935320;
 //BA.debugLineNum = 26935320;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Scroll";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ScrollChanged",(int) (1))) { 
RDebugUtils.currentLine=26935321;
 //BA.debugLineNum = 26935321;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ScrollChanged";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ScrollChanged",(Object)(_offset));
 };
RDebugUtils.currentLine=26935323;
 //BA.debugLineNum = 26935323;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_visiblerangechanged(b4a.example.ef.asviewpager __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_visiblerangechanged", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
RDebugUtils.currentLine=26738699;
 //BA.debugLineNum = 26738699;BA.debugLine="If m_LazyLoading = False Or m_IgnoreLazyLoading =";
if (__ref._m_lazyloading /*boolean*/ ==__c.False || __ref._m_ignorelazyloading /*boolean*/ ==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=26738713;
 //BA.debugLineNum = 26738713;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=26738714;
 //BA.debugLineNum = 26738714;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=26738715;
 //BA.debugLineNum = 26738715;BA.debugLine="If i > FirstIndex - m_LazyLoadingExtraSize And i";
if (_i>_firstindex-__ref._m_lazyloadingextrasize /*int*/  && _i<_lastindex+__ref._m_lazyloadingextrasize /*int*/ ) { 
RDebugUtils.currentLine=26738717;
 //BA.debugLineNum = 26738717;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
RDebugUtils.currentLine=26738718;
 //BA.debugLineNum = 26738718;BA.debugLine="LazyLoadingAddContent(p,xclv_main.GetValue(i))";
__ref._lazyloadingaddcontent /*String*/ (null,_p,__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i));
 };
 }else {
RDebugUtils.currentLine=26738722;
 //BA.debugLineNum = 26738722;BA.debugLine="If i > m_CurrentIndex - m_LazyLoadingExtraSize";
if (_i>__ref._m_currentindex /*int*/ -__ref._m_lazyloadingextrasize /*int*/  && _i<__ref._m_currentindex /*int*/ +__ref._m_lazyloadingextrasize /*int*/ ) { 
 }else {
RDebugUtils.currentLine=26738726;
 //BA.debugLineNum = 26738726;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=26738727;
 //BA.debugLineNum = 26738727;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 };
 };
 }
};
RDebugUtils.currentLine=26738734;
 //BA.debugLineNum = 26738734;BA.debugLine="End Sub";
return "";
}
public boolean  _xpnl_pagearea2_touch(b4a.example.ef.asviewpager __ref,Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xpnl_pagearea2_touch", true))
	 {return ((Boolean) Debug.delegate(ba, "xpnl_pagearea2_touch", new Object[] {_viewtag,_action,_x,_y,_motionevent}));}
boolean _skipcheck = false;
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Private Sub xpnl_PageArea2_Touch(ViewTag As Object";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="If g_isScrollEnabled = False Or (m_AllowBack = Fa";
if (__ref._g_isscrollenabled /*boolean*/ ==__c.False || (__ref._m_allowback /*boolean*/ ==__c.False && __ref._m_allownext /*boolean*/ ==__c.False)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="If m_AllowNext = False Or m_AllowBack = False The";
if (__ref._m_allownext /*boolean*/ ==__c.False || __ref._m_allowback /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26673158;
 //BA.debugLineNum = 26673158;BA.debugLine="Dim SkipCheck As Boolean = False";
_skipcheck = __c.False;
RDebugUtils.currentLine=26673159;
 //BA.debugLineNum = 26673159;BA.debugLine="If Action = 1 Then";
if (_action==1) { 
RDebugUtils.currentLine=26673160;
 //BA.debugLineNum = 26673160;BA.debugLine="isfirstmove = False";
__ref._isfirstmove /*boolean*/  = __c.False;
RDebugUtils.currentLine=26673161;
 //BA.debugLineNum = 26673161;BA.debugLine="SkipCheck = True";
_skipcheck = __c.True;
 };
RDebugUtils.currentLine=26673164;
 //BA.debugLineNum = 26673164;BA.debugLine="If isfirstmove = False And SkipCheck = False The";
if (__ref._isfirstmove /*boolean*/ ==__c.False && _skipcheck==__c.False) { 
RDebugUtils.currentLine=26673166;
 //BA.debugLineNum = 26673166;BA.debugLine="ff(X,y)";
__ref._ff /*String*/ (null,_x,_y);
RDebugUtils.currentLine=26673168;
 //BA.debugLineNum = 26673168;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=26673171;
 //BA.debugLineNum = 26673171;BA.debugLine="If m_AllowNext = False And x < g_x Then";
if (__ref._m_allownext /*boolean*/ ==__c.False && _x<__ref._g_x /*float*/ ) { 
RDebugUtils.currentLine=26673172;
 //BA.debugLineNum = 26673172;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetX(__ref._m_maxoffset /*int*/ );
RDebugUtils.currentLine=26673174;
 //BA.debugLineNum = 26673174;BA.debugLine="Return True";
if (true) return __c.True;
 }else 
{RDebugUtils.currentLine=26673175;
 //BA.debugLineNum = 26673175;BA.debugLine="else If m_AllowBack = False And x > g_x Then";
if (__ref._m_allowback /*boolean*/ ==__c.False && _x>__ref._g_x /*float*/ ) { 
RDebugUtils.currentLine=26673176;
 //BA.debugLineNum = 26673176;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetX(__ref._m_maxoffset /*int*/ );
RDebugUtils.currentLine=26673178;
 //BA.debugLineNum = 26673178;BA.debugLine="Return True";
if (true) return __c.True;
 }}
;
 };
RDebugUtils.currentLine=26673186;
 //BA.debugLineNum = 26673186;BA.debugLine="Return HandleTouch(Action,x,y)";
if (true) return __ref._handletouch /*boolean*/ (null,_action,_x,_y);
RDebugUtils.currentLine=26673187;
 //BA.debugLineNum = 26673187;BA.debugLine="End Sub";
return false;
}
}