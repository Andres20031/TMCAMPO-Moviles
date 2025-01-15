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
RDebugUtils.currentLine=39452714;
 //BA.debugLineNum = 39452714;BA.debugLine="xpnl_Loading.BringToFront";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=39452715;
 //BA.debugLineNum = 39452715;BA.debugLine="xpnl_Loading.SetLayoutAnimated(0,0,0,Width + 1000";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width+parent.__c.DipToCurrent((int) (1000))),(int) (_height+parent.__c.DipToCurrent((int) (1000))));
RDebugUtils.currentLine=39452716;
 //BA.debugLineNum = 39452716;BA.debugLine="xpnl_Loading.SetVisibleAnimated(0,True)";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=39452718;
 //BA.debugLineNum = 39452718;BA.debugLine="mBase.Width = Width";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth((int) (_width));
RDebugUtils.currentLine=39452719;
 //BA.debugLineNum = 39452719;BA.debugLine="mBase.Height = Height";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight((int) (_height));
RDebugUtils.currentLine=39452720;
 //BA.debugLineNum = 39452720;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "base_resize"),(int) (0));
this.state = 16;
return;
case 16:
//C
this.state = 1;
;
RDebugUtils.currentLine=39452721;
 //BA.debugLineNum = 39452721;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getTop(),(int) (_width),(int) (_height));
RDebugUtils.currentLine=39452722;
 //BA.debugLineNum = 39452722;BA.debugLine="xclv_main.Base_Resize(Width,Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._base_resize(_width,_height);
RDebugUtils.currentLine=39452725;
 //BA.debugLineNum = 39452725;BA.debugLine="For i = 0 To xclv_main.Size -1";
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
RDebugUtils.currentLine=39452726;
 //BA.debugLineNum = 39452726;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
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
RDebugUtils.currentLine=39452727;
 //BA.debugLineNum = 39452727;BA.debugLine="xclv_main.ResizeItem(i,mBase.Width)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._resizeitem(_i,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth());
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=39452729;
 //BA.debugLineNum = 39452729;BA.debugLine="xclv_main.ResizeItem(i,mBase.Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._resizeitem(_i,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
 if (true) break;

case 9:
//C
this.state = 18;
;
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=39452735;
 //BA.debugLineNum = 39452735;BA.debugLine="If xclv_main.Size > 0 Then xclv_main.JumpToItem(m";

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
RDebugUtils.currentLine=39452736;
 //BA.debugLineNum = 39452736;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "base_resize"),(int) (250));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=39452737;
 //BA.debugLineNum = 39452737;BA.debugLine="LoadingPanelHandling";
__ref._loadingpanelhandling /*void*/ (null);
RDebugUtils.currentLine=39452743;
 //BA.debugLineNum = 39452743;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Public Sub ResetLazyLoadingPanels";
RDebugUtils.currentLine=41746442;
 //BA.debugLineNum = 41746442;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=41746443;
 //BA.debugLineNum = 41746443;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=41746445;
 //BA.debugLineNum = 41746445;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=41746446;
 //BA.debugLineNum = 41746446;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 }
};
RDebugUtils.currentLine=41746450;
 //BA.debugLineNum = 41746450;BA.debugLine="End Sub";
return "";
}
public String  _resetlazyloadingindex(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "resetlazyloadingindex", true))
	 {return ((String) Debug.delegate(ba, "resetlazyloadingindex", null));}
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Public Sub ResetLazyloadingIndex";
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="End Sub";
return "";
}
public String  _commit(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "commit", true))
	 {return ((String) Debug.delegate(ba, "commit", null));}
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Public Sub Commit";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="isLazyLoadingReady = True";
__ref._islazyloadingready /*boolean*/  = __c.True;
RDebugUtils.currentLine=40239109;
 //BA.debugLineNum = 40239109;BA.debugLine="xclv_main.Refresh";
__ref._xclv_main /*b4a.example3.customlistview*/ ._refresh();
RDebugUtils.currentLine=40239112;
 //BA.debugLineNum = 40239112;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="xclv_main.Clear";
__ref._xclv_main /*b4a.example3.customlistview*/ ._clear();
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="m_CurrentIndex = 0";
__ref._m_currentindex /*int*/  = (int) (0);
RDebugUtils.currentLine=41680903;
 //BA.debugLineNum = 41680903;BA.debugLine="End Sub";
return "";
}
public String  _addpage(b4a.example.ef.asviewpager __ref,anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "addpage", true))
	 {return ((String) Debug.delegate(ba, "addpage", new Object[] {_layoutpanel,_value}));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Public Sub AddPage(LayoutPanel As B4XView,Value As";
RDebugUtils.currentLine=39780357;
 //BA.debugLineNum = 39780357;BA.debugLine="xclv_main.Add(LayoutPanel,Value)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._add(_layoutpanel,_value);
RDebugUtils.currentLine=39780359;
 //BA.debugLineNum = 39780359;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41353220;
 //BA.debugLineNum = 41353220;BA.debugLine="m_Ignore = True";
__ref._m_ignore /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=41353221;
 //BA.debugLineNum = 41353221;BA.debugLine="PageChangedEvent(index,False)";
__ref._pagechangedevent /*void*/ (null,_index,parent.__c.False);
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="xclv_main.JumpToItem(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem(_index);
RDebugUtils.currentLine=41353223;
 //BA.debugLineNum = 41353223;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "setcurrentindex2"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="m_Ignore = False";
__ref._m_ignore /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=41353226;
 //BA.debugLineNum = 41353226;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.asviewpager __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=39321605;
 //BA.debugLineNum = 39321605;BA.debugLine="xpnl_Loading = xui.CreatePanel(\"\")";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=39321606;
 //BA.debugLineNum = 39321606;BA.debugLine="mBase.AddView(xpnl_Loading,0,0,mBase.Width,mBase.";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=39321607;
 //BA.debugLineNum = 39321607;BA.debugLine="xpnl_Loading.Color = xui.Color_Black";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black);
RDebugUtils.currentLine=39321608;
 //BA.debugLineNum = 39321608;BA.debugLine="xpnl_Loading.BringToFront";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .BringToFront();
RDebugUtils.currentLine=39321610;
 //BA.debugLineNum = 39321610;BA.debugLine="m_Orientation = Props.GetDefault(\"Orientation\",\"H";
__ref._m_orientation /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("Orientation"),(Object)("Horizontal")));
RDebugUtils.currentLine=39321611;
 //BA.debugLineNum = 39321611;BA.debugLine="m_Carousel = Props.GetDefault(\"Carousel\",False)";
__ref._m_carousel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("Carousel"),(Object)(__c.False)));
RDebugUtils.currentLine=39321612;
 //BA.debugLineNum = 39321612;BA.debugLine="m_LazyLoading = Props.GetDefault(\"LazyLoading\",Fa";
__ref._m_lazyloading /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.False)));
RDebugUtils.currentLine=39321613;
 //BA.debugLineNum = 39321613;BA.debugLine="m_LazyLoadingExtraSize = Props.GetDefault(\"LazyLo";
__ref._m_lazyloadingextrasize /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("LazyLoadingExtraSize"),(Object)(5))));
RDebugUtils.currentLine=39321614;
 //BA.debugLineNum = 39321614;BA.debugLine="m_LoadingPanelColor = xui.PaintOrColorToColor(Pro";
__ref._m_loadingpanelcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("LoadingPanelColor"),(Object)(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black)));
RDebugUtils.currentLine=39321615;
 //BA.debugLineNum = 39321615;BA.debugLine="xpnl_Loading.Color = m_LoadingPanelColor";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_loadingpanelcolor /*int*/ );
RDebugUtils.currentLine=39321616;
 //BA.debugLineNum = 39321616;BA.debugLine="m_BackGestureGap = Props.GetDefault(\"BackGestureG";
__ref._m_backgesturegap /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("BackGestureGap"),(Object)(__c.False)));
RDebugUtils.currentLine=39321619;
 //BA.debugLineNum = 39321619;BA.debugLine="If xclv_main.IsInitialized = False Then";
if (__ref._xclv_main /*b4a.example3.customlistview*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=39321620;
 //BA.debugLineNum = 39321620;BA.debugLine="ini_xclv";
__ref._ini_xclv /*String*/ (null);
 };
RDebugUtils.currentLine=39321629;
 //BA.debugLineNum = 39321629;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=39321647;
 //BA.debugLineNum = 39321647;BA.debugLine="End Sub";
return "";
}
public String  _setloadingpanelcolor(b4a.example.ef.asviewpager __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setloadingpanelcolor", true))
	 {return ((String) Debug.delegate(ba, "setloadingpanelcolor", new Object[] {_color}));}
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Public Sub setLoadingPanelColor(Color As Int)";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="m_LoadingPanelColor = Color";
__ref._m_loadingpanelcolor /*int*/  = _color;
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="xpnl_Loading.Color = Color";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(_color);
RDebugUtils.currentLine=40435715;
 //BA.debugLineNum = 40435715;BA.debugLine="End Sub";
return "";
}
public int  _getsize(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="Return xclv_main.Size";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getsize();
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_index}));}
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
RDebugUtils.currentLine=41615364;
 //BA.debugLineNum = 41615364;BA.debugLine="Return xclv_main.GetPanel(Index)";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_index);
RDebugUtils.currentLine=41615366;
 //BA.debugLineNum = 41615366;BA.debugLine="End Sub";
return null;
}
public Object  _getvalue(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getvalue", true))
	 {return ((Object) Debug.delegate(ba, "getvalue", new Object[] {_index}));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
RDebugUtils.currentLine=41549828;
 //BA.debugLineNum = 41549828;BA.debugLine="Return xclv_main.GetValue(Index)";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_index);
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="PageChangedEvent(index,True)";
__ref._pagechangedevent /*void*/ (null,_index,parent.__c.True);
RDebugUtils.currentLine=41287685;
 //BA.debugLineNum = 41287685;BA.debugLine="m_Ignore = True";
__ref._m_ignore /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=41287686;
 //BA.debugLineNum = 41287686;BA.debugLine="xclv_main.ScrollToItem(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(_index);
RDebugUtils.currentLine=41287687;
 //BA.debugLineNum = 41287687;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "setcurrentindex"),(int) (250));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=41287688;
 //BA.debugLineNum = 41287688;BA.debugLine="m_Ignore = False";
__ref._m_ignore /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=41287690;
 //BA.debugLineNum = 41287690;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Public Sub getBase As B4XView";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Return mBase";
if (true) return __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="End Sub";
return null;
}
public String  _addpageat(b4a.example.ef.asviewpager __ref,int _index,anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "addpageat", true))
	 {return ((String) Debug.delegate(ba, "addpageat", new Object[] {_index,_layoutpanel,_value}));}
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Public Sub AddPageAt(index As Int,LayoutPanel As B";
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="If index <= m_CurrentIndex Then";
if (_index<=__ref._m_currentindex /*int*/ ) { 
RDebugUtils.currentLine=39845891;
 //BA.debugLineNum = 39845891;BA.debugLine="m_CurrentIndex = m_CurrentIndex +1";
__ref._m_currentindex /*int*/  = (int) (__ref._m_currentindex /*int*/ +1);
 };
RDebugUtils.currentLine=39845897;
 //BA.debugLineNum = 39845897;BA.debugLine="xclv_main.InsertAt(index,LayoutPanel,Value)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._insertat(_index,_layoutpanel,_value);
RDebugUtils.currentLine=39845907;
 //BA.debugLineNum = 39845907;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=39845912;
 //BA.debugLineNum = 39845912;BA.debugLine="End Sub";
return "";
}
public String  _previouspage(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "previouspage", true))
	 {return ((String) Debug.delegate(ba, "previouspage", null));}
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Public Sub PreviousPage";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="If m_AllowBack = False Then Return";
if (__ref._m_allowback /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=39976965;
 //BA.debugLineNum = 39976965;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((__ref._m_currentindex /*int*/ -1)>-1) { 
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex -1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._m_currentindex /*int*/ -1));
RDebugUtils.currentLine=39976968;
 //BA.debugLineNum = 39976968;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,True)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ -1),__c.True);
 }else 
{RDebugUtils.currentLine=39976969;
 //BA.debugLineNum = 39976969;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=39976970;
 //BA.debugLineNum = 39976970;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=39976973;
 //BA.debugLineNum = 39976973;BA.debugLine="End Sub";
return "";
}
public String  _nextpage(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "nextpage", true))
	 {return ((String) Debug.delegate(ba, "nextpage", null));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Public Sub NextPage";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="If m_AllowNext = False Then Return";
if (__ref._m_allownext /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=40108037;
 //BA.debugLineNum = 40108037;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((__ref._m_currentindex /*int*/ +1)<__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()) { 
RDebugUtils.currentLine=40108038;
 //BA.debugLineNum = 40108038;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex +1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._m_currentindex /*int*/ +1));
RDebugUtils.currentLine=40108039;
 //BA.debugLineNum = 40108039;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,True)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ +1),__c.True);
 }else 
{RDebugUtils.currentLine=40108040;
 //BA.debugLineNum = 40108040;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=40108041;
 //BA.debugLineNum = 40108041;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=40108044;
 //BA.debugLineNum = 40108044;BA.debugLine="End Sub";
return "";
}
public String  _allowback(b4a.example.ef.asviewpager __ref,boolean _allow) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "allowback", true))
	 {return ((String) Debug.delegate(ba, "allowback", new Object[] {_allow}));}
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Public Sub AllowBack(Allow As Boolean)";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="m_AllowBack = Allow";
__ref._m_allowback /*boolean*/  = _allow;
RDebugUtils.currentLine=40370183;
 //BA.debugLineNum = 40370183;BA.debugLine="End Sub";
return "";
}
public String  _allownext(b4a.example.ef.asviewpager __ref,boolean _allow) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "allownext", true))
	 {return ((String) Debug.delegate(ba, "allownext", new Object[] {_allow}));}
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Public Sub AllowNext(Allow As Boolean)";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="m_AllowNext = Allow";
__ref._m_allownext /*boolean*/  = _allow;
RDebugUtils.currentLine=40304647;
 //BA.debugLineNum = 40304647;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="If isHidding = False Then";
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
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="isHidding = True";
__ref._ishidding /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=39518212;
 //BA.debugLineNum = 39518212;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._m_loadingpanelhideduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=39518213;
 //BA.debugLineNum = 39518213;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "loadingpanelhandling"),(int) (__ref._m_loadingpanelhideduration /*int*/ +50));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
RDebugUtils.currentLine=39518214;
 //BA.debugLineNum = 39518214;BA.debugLine="isHidding = False";
__ref._ishidding /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=39518216;
 //BA.debugLineNum = 39518216;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "loadingpanelhandling"),(int) (0));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=39518217;
 //BA.debugLineNum = 39518217;BA.debugLine="CheckLoadingPanelVisiblity";
__ref._checkloadingpanelvisiblity /*void*/ (null);
RDebugUtils.currentLine=39518218;
 //BA.debugLineNum = 39518218;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="If m_Carousel = True Then";
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
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkcarousel"),(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="If m_CurrentIndex = xclv_main.Size -1 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._m_currentindex /*int*/ ==__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1) { 
this.state = 6;
}else 
{RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="Else If m_CurrentIndex = 0 Then";
if (__ref._m_currentindex /*int*/ ==0) { 
this.state = 8;
}}
if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="setCurrentIndex2(0)";
__ref._setcurrentindex2 /*void*/ (null,(int) (0));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="setCurrentIndex2(xclv_main.Size -1)";
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
RDebugUtils.currentLine=41943049;
 //BA.debugLineNum = 41943049;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkloadingpanelvisiblity"),(int) (250));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
RDebugUtils.currentLine=39583747;
 //BA.debugLineNum = 39583747;BA.debugLine="If xpnl_Loading.Visible = True And isHidding = Fa";
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
RDebugUtils.currentLine=39583748;
 //BA.debugLineNum = 39583748;BA.debugLine="isHidding = True";
__ref._ishidding /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=39583749;
 //BA.debugLineNum = 39583749;BA.debugLine="xpnl_Loading.SetVisibleAnimated(m_LoadingPanelHi";
__ref._xpnl_loading /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated(__ref._m_loadingpanelhideduration /*int*/ ,parent.__c.False);
RDebugUtils.currentLine=39583750;
 //BA.debugLineNum = 39583750;BA.debugLine="Sleep(m_LoadingPanelHideDuration + 50)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "asviewpager", "checkloadingpanelvisiblity"),(int) (__ref._m_loadingpanelhideduration /*int*/ +50));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
RDebugUtils.currentLine=39583751;
 //BA.debugLineNum = 39583751;BA.debugLine="isHidding = False";
__ref._ishidding /*boolean*/  = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=39583754;
 //BA.debugLineNum = 39583754;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=39190538;
 //BA.debugLineNum = 39190538;BA.debugLine="Private xclv_main As CustomListView";
_xclv_main = new b4a.example3.customlistview();
RDebugUtils.currentLine=39190542;
 //BA.debugLineNum = 39190542;BA.debugLine="Private xpnl_Loading As B4XView";
_xpnl_loading = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39190545;
 //BA.debugLineNum = 39190545;BA.debugLine="Private m_CurrentIndex As Int = 0'ignore";
_m_currentindex = (int) (0);
RDebugUtils.currentLine=39190548;
 //BA.debugLineNum = 39190548;BA.debugLine="Private g_x,g_y,g_dv,g_ad As Float";
_g_x = 0f;
_g_y = 0f;
_g_dv = 0f;
_g_ad = 0f;
RDebugUtils.currentLine=39190549;
 //BA.debugLineNum = 39190549;BA.debugLine="Private g_ms As Long";
_g_ms = 0L;
RDebugUtils.currentLine=39190550;
 //BA.debugLineNum = 39190550;BA.debugLine="Private  isfirstmove As Boolean = False";
_isfirstmove = __c.False;
RDebugUtils.currentLine=39190558;
 //BA.debugLineNum = 39190558;BA.debugLine="Private m_Ignore As Boolean = False'Ignore";
_m_ignore = __c.False;
RDebugUtils.currentLine=39190559;
 //BA.debugLineNum = 39190559;BA.debugLine="Private g_ignorepagechangedevent As Boolean = Fal";
_g_ignorepagechangedevent = __c.False;
RDebugUtils.currentLine=39190560;
 //BA.debugLineNum = 39190560;BA.debugLine="Private g_ignorepagechangeevent As Boolean = Fals";
_g_ignorepagechangeevent = __c.False;
RDebugUtils.currentLine=39190561;
 //BA.debugLineNum = 39190561;BA.debugLine="Private m_Orientation As String";
_m_orientation = "";
RDebugUtils.currentLine=39190562;
 //BA.debugLineNum = 39190562;BA.debugLine="Private m_Carousel As Boolean";
_m_carousel = false;
RDebugUtils.currentLine=39190563;
 //BA.debugLineNum = 39190563;BA.debugLine="Private m_LazyLoading As Boolean";
_m_lazyloading = false;
RDebugUtils.currentLine=39190564;
 //BA.debugLineNum = 39190564;BA.debugLine="Private m_LazyLoadingExtraSize As Int";
_m_lazyloadingextrasize = 0;
RDebugUtils.currentLine=39190565;
 //BA.debugLineNum = 39190565;BA.debugLine="Private m_LoadingPanelColor As Int";
_m_loadingpanelcolor = 0;
RDebugUtils.currentLine=39190566;
 //BA.debugLineNum = 39190566;BA.debugLine="Private m_BackGestureGap As Boolean 'Ignore";
_m_backgesturegap = false;
RDebugUtils.currentLine=39190567;
 //BA.debugLineNum = 39190567;BA.debugLine="Private m_AllowNext As Boolean = True";
_m_allownext = __c.True;
RDebugUtils.currentLine=39190568;
 //BA.debugLineNum = 39190568;BA.debugLine="Private m_AllowBack As Boolean = True";
_m_allowback = __c.True;
RDebugUtils.currentLine=39190569;
 //BA.debugLineNum = 39190569;BA.debugLine="Private m_MaxOffset As Int = 0'Ignore";
_m_maxoffset = (int) (0);
RDebugUtils.currentLine=39190571;
 //BA.debugLineNum = 39190571;BA.debugLine="Private ismoving As Boolean = False'Ignore";
_ismoving = __c.False;
RDebugUtils.currentLine=39190572;
 //BA.debugLineNum = 39190572;BA.debugLine="Private g_isScrollEnabled As Boolean = True";
_g_isscrollenabled = __c.True;
RDebugUtils.currentLine=39190573;
 //BA.debugLineNum = 39190573;BA.debugLine="Private m_IgnoreLazyLoading As Boolean = False'Ig";
_m_ignorelazyloading = __c.False;
RDebugUtils.currentLine=39190575;
 //BA.debugLineNum = 39190575;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=39190576;
 //BA.debugLineNum = 39190576;BA.debugLine="Private isLazyLoadingReady As Boolean = False";
_islazyloadingready = __c.False;
RDebugUtils.currentLine=39190577;
 //BA.debugLineNum = 39190577;BA.debugLine="Private isHidding As Boolean = False";
_ishidding = __c.False;
RDebugUtils.currentLine=39190579;
 //BA.debugLineNum = 39190579;BA.debugLine="Private OldIndex As Int = 0";
_oldindex = (int) (0);
RDebugUtils.currentLine=39190580;
 //BA.debugLineNum = 39190580;BA.debugLine="Private m_LoadingPanelHideDuration As Int = 500";
_m_loadingpanelhideduration = (int) (500);
RDebugUtils.currentLine=39190581;
 //BA.debugLineNum = 39190581;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub ini_xclv";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=39387140;
 //BA.debugLineNum = 39387140;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39387141;
 //BA.debugLineNum = 39387141;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=39387142;
 //BA.debugLineNum = 39387142;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("DividerColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=39387143;
 //BA.debugLineNum = 39387143;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
_tmpmap.Put((Object)("DividerHeight"),(Object)(0));
RDebugUtils.currentLine=39387144;
 //BA.debugLineNum = 39387144;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("PressedColor"),(Object)(((int)0x00ffffff)));
RDebugUtils.currentLine=39387145;
 //BA.debugLineNum = 39387145;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
_tmpmap.Put((Object)("InsertAnimationDuration"),(Object)(0));
RDebugUtils.currentLine=39387146;
 //BA.debugLineNum = 39387146;BA.debugLine="tmpmap.Put(\"ListOrientation\",m_Orientation)";
_tmpmap.Put((Object)("ListOrientation"),(Object)(__ref._m_orientation /*String*/ ));
RDebugUtils.currentLine=39387147;
 //BA.debugLineNum = 39387147;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
_tmpmap.Put((Object)("ShowScrollBar"),(Object)(__c.False));
RDebugUtils.currentLine=39387148;
 //BA.debugLineNum = 39387148;BA.debugLine="xclv_main.Initialize(Me,\"xclv_main\")";
__ref._xclv_main /*b4a.example3.customlistview*/ ._initialize(ba,this,"xclv_main");
RDebugUtils.currentLine=39387149;
 //BA.debugLineNum = 39387149;BA.debugLine="xclv_main.DesignerCreateView(mBase,tmplbl,tmpmap)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._designercreateview((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=39387151;
 //BA.debugLineNum = 39387151;BA.debugLine="Private objPages As Reflector";
_objpages = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=39387152;
 //BA.debugLineNum = 39387152;BA.debugLine="objPages.Target = xclv_main.sv";
_objpages.Target = (Object)(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getObject());
RDebugUtils.currentLine=39387153;
 //BA.debugLineNum = 39387153;BA.debugLine="objPages.SetOnTouchListener(\"xpnl_PageArea2_Touch";
_objpages.SetOnTouchListener(ba,"xpnl_PageArea2_Touch");
RDebugUtils.currentLine=39387154;
 //BA.debugLineNum = 39387154;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().SetLayoutAnimated((int) (0),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getLeft(),__ref._xclv_main /*b4a.example3.customlistview*/ ._asview().getTop(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=39387155;
 //BA.debugLineNum = 39387155;BA.debugLine="xclv_main.Base_Resize(mBase.Width,mBase.Height)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._base_resize(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=39387179;
 //BA.debugLineNum = 39387179;BA.debugLine="End Sub";
return "";
}
public String  _ff(b4a.example.ef.asviewpager __ref,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "ff", true))
	 {return ((String) Debug.delegate(ba, "ff", new Object[] {_x,_y}));}
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Private Sub ff(x As Float,y As Float)";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="isfirstmove = True";
__ref._isfirstmove /*boolean*/  = __c.True;
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="g_ms=DateTime.Now";
__ref._g_ms /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="g_x=X";
__ref._g_x /*float*/  = _x;
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="g_y=Y";
__ref._g_y /*float*/  = _y;
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=41811974;
 //BA.debugLineNum = 41811974;BA.debugLine="g_dv = (mBase.Width)/2";
__ref._g_dv /*float*/  = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())/(double)2);
 }else {
RDebugUtils.currentLine=41811976;
 //BA.debugLineNum = 41811976;BA.debugLine="g_dv = (mBase.Height)/2";
__ref._g_dv /*float*/  = (float) ((__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())/(double)2);
 };
RDebugUtils.currentLine=41811978;
 //BA.debugLineNum = 41811978;BA.debugLine="g_ad = 0";
__ref._g_ad /*float*/  = (float) (0);
RDebugUtils.currentLine=41811979;
 //BA.debugLineNum = 41811979;BA.debugLine="End Sub";
return "";
}
public int  _getcurrentindex(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getcurrentindex", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentindex", null));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Public Sub getCurrentIndex As Int";
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="Return m_CurrentIndex";
if (true) return __ref._m_currentindex /*int*/ ;
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="End Sub";
return 0;
}
public b4a.example3.customlistview  _getcustomlistview(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getcustomlistview", true))
	 {return ((b4a.example3.customlistview) Debug.delegate(ba, "getcustomlistview", null));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub getCustomListView As CustomListView";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Return xclv_main";
if (true) return __ref._xclv_main /*b4a.example3.customlistview*/ ;
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="End Sub";
return null;
}
public boolean  _getisscrollenabled(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getisscrollenabled", true))
	 {return ((Boolean) Debug.delegate(ba, "getisscrollenabled", null));}
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Public Sub getisScrollEnabled As Boolean";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Return g_isScrollEnabled";
if (true) return __ref._g_isscrollenabled /*boolean*/ ;
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="End Sub";
return false;
}
public boolean  _getlazyloading(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getlazyloading", true))
	 {return ((Boolean) Debug.delegate(ba, "getlazyloading", null));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Public Sub getLazyLoading As Boolean";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="Return m_LazyLoading";
if (true) return __ref._m_lazyloading /*boolean*/ ;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="End Sub";
return false;
}
public int  _getlazyloadingextrasize(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getlazyloadingextrasize", true))
	 {return ((Integer) Debug.delegate(ba, "getlazyloadingextrasize", null));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Public Sub getLazyLoadingExtraSize As Int";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="Return m_LazyLoadingExtraSize";
if (true) return __ref._m_lazyloadingextrasize /*int*/ ;
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="End Sub";
return 0;
}
public int  _getloadingpanelcolor(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "getloadingpanelcolor", true))
	 {return ((Integer) Debug.delegate(ba, "getloadingpanelcolor", null));}
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Public Sub getLoadingPanelColor As Int";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="Return m_LoadingPanelColor";
if (true) return __ref._m_loadingpanelcolor /*int*/ ;
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="End Sub";
return 0;
}
public boolean  _handletouch(b4a.example.ef.asviewpager __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "handletouch", true))
	 {return ((Boolean) Debug.delegate(ba, "handletouch", new Object[] {_action,_x,_y}));}
int _i = 0;
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Private Sub HandleTouch(Action As Int,x As Float,y";
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="Select Action";
switch (_action) {
case 2: {
RDebugUtils.currentLine=41877512;
 //BA.debugLineNum = 41877512;BA.debugLine="TouchBeginEvent";
__ref._touchbeginevent /*String*/ (null);
RDebugUtils.currentLine=41877513;
 //BA.debugLineNum = 41877513;BA.debugLine="ismoving = True";
__ref._ismoving /*boolean*/  = __c.True;
RDebugUtils.currentLine=41877514;
 //BA.debugLineNum = 41877514;BA.debugLine="If isfirstmove = False Then";
if (__ref._isfirstmove /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=41877516;
 //BA.debugLineNum = 41877516;BA.debugLine="ff(X,y)";
__ref._ff /*String*/ (null,_x,_y);
 }else {
 };
 break; }
case 1: {
RDebugUtils.currentLine=41877523;
 //BA.debugLineNum = 41877523;BA.debugLine="TouchEndEvent";
__ref._touchendevent /*String*/ (null);
RDebugUtils.currentLine=41877524;
 //BA.debugLineNum = 41877524;BA.debugLine="ismoving = False";
__ref._ismoving /*boolean*/  = __c.False;
RDebugUtils.currentLine=41877525;
 //BA.debugLineNum = 41877525;BA.debugLine="isfirstmove = False";
__ref._isfirstmove /*boolean*/  = __c.False;
RDebugUtils.currentLine=41877527;
 //BA.debugLineNum = 41877527;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=41877528;
 //BA.debugLineNum = 41877528;BA.debugLine="If ((DateTime.Now-g_ms)<300) And (Abs(X - g_x)";
if (((__c.DateTime.getNow()-__ref._g_ms /*long*/ )<300) && (__c.Abs(_x-__ref._g_x /*float*/ )>(__c.DipToCurrent((int) (1))))) { 
RDebugUtils.currentLine=41877530;
 //BA.debugLineNum = 41877530;BA.debugLine="g_dv =1dip";
__ref._g_dv /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=41877532;
 //BA.debugLineNum = 41877532;BA.debugLine="If X < g_x Then g_ad = 1";
if (_x<__ref._g_x /*float*/ ) { 
__ref._g_ad /*float*/  = (float) (1);};
 };
 }else {
RDebugUtils.currentLine=41877536;
 //BA.debugLineNum = 41877536;BA.debugLine="If ((DateTime.Now-g_ms)<300)  And (Abs(y - g_y";
if (((__c.DateTime.getNow()-__ref._g_ms /*long*/ )<300) && (__c.Abs(_y-__ref._g_y /*float*/ )>(__c.DipToCurrent((int) (1))))) { 
RDebugUtils.currentLine=41877537;
 //BA.debugLineNum = 41877537;BA.debugLine="g_dv =1dip";
__ref._g_dv /*float*/  = (float) (__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=41877539;
 //BA.debugLineNum = 41877539;BA.debugLine="If y < g_y Then g_ad = 1";
if (_y<__ref._g_y /*float*/ ) { 
__ref._g_ad /*float*/  = (float) (1);};
 };
 };
RDebugUtils.currentLine=41877544;
 //BA.debugLineNum = 41877544;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step24 = 1;
final int limit24 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=41877545;
 //BA.debugLineNum = 41877545;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=41877546;
 //BA.debugLineNum = 41877546;BA.debugLine="If (((i+1)*mBase.Width) - xclv_main.sv.Scroll";
if ((((_i+1)*__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())-__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX())>(__ref._g_dv /*float*/ )) { 
RDebugUtils.currentLine=41877548;
 //BA.debugLineNum = 41877548;BA.debugLine="If (i+g_ad) > (xclv_main.Size -1) Or xclv_ma";
if ((_i+__ref._g_ad /*float*/ )>(__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1) || __ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX()<=0) { 
RDebugUtils.currentLine=41877549;
 //BA.debugLineNum = 41877549;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
RDebugUtils.currentLine=41877550;
 //BA.debugLineNum = 41877550;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=41877553;
 //BA.debugLineNum = 41877553;BA.debugLine="If isNumberOneCloserToZero(g_x - x,g_y - y)";
if (__ref._isnumberoneclosertozero /*boolean*/ (null,(int) (__ref._g_x /*float*/ -_x),(int) (__ref._g_y /*float*/ -_y))==__c.False) { 
RDebugUtils.currentLine=41877554;
 //BA.debugLineNum = 41877554;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=41877555;
 //BA.debugLineNum = 41877555;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=41877557;
 //BA.debugLineNum = 41877557;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (_i+__ref._g_ad /*float*/ ));
RDebugUtils.currentLine=41877558;
 //BA.debugLineNum = 41877558;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
if (__ref._m_currentindex /*int*/ !=(_i+__ref._g_ad /*float*/ )) { 
__ref._pagechangedevent /*void*/ (null,(int) (_i+__ref._g_ad /*float*/ ),__c.True);};
RDebugUtils.currentLine=41877562;
 //BA.debugLineNum = 41877562;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }else {
RDebugUtils.currentLine=41877566;
 //BA.debugLineNum = 41877566;BA.debugLine="If (((i+1)*mBase.Height) - xclv_main.sv.Scrol";
if ((((_i+1)*__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())-__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY())>(__ref._g_dv /*float*/ )) { 
RDebugUtils.currentLine=41877568;
 //BA.debugLineNum = 41877568;BA.debugLine="If (i+g_ad) > xclv_main.Size-1 Or  xclv_main";
if ((_i+__ref._g_ad /*float*/ )>__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1 || __ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY()<=0) { 
RDebugUtils.currentLine=41877569;
 //BA.debugLineNum = 41877569;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
RDebugUtils.currentLine=41877570;
 //BA.debugLineNum = 41877570;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=41877573;
 //BA.debugLineNum = 41877573;BA.debugLine="If isNumberOneCloserToZero(g_y - y,g_x - x)";
if (__ref._isnumberoneclosertozero /*boolean*/ (null,(int) (__ref._g_y /*float*/ -_y),(int) (__ref._g_x /*float*/ -_x))==__c.False) { 
RDebugUtils.currentLine=41877574;
 //BA.debugLineNum = 41877574;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem(__ref._m_currentindex /*int*/ );
RDebugUtils.currentLine=41877575;
 //BA.debugLineNum = 41877575;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=41877577;
 //BA.debugLineNum = 41877577;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._scrolltoitem((int) (_i+__ref._g_ad /*float*/ ));
RDebugUtils.currentLine=41877578;
 //BA.debugLineNum = 41877578;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChang";
if (__ref._m_currentindex /*int*/ !=(_i+__ref._g_ad /*float*/ )) { 
__ref._pagechangedevent /*void*/ (null,(int) (_i+__ref._g_ad /*float*/ ),__c.True);};
RDebugUtils.currentLine=41877582;
 //BA.debugLineNum = 41877582;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 }
};
 break; }
}
;
RDebugUtils.currentLine=41877587;
 //BA.debugLineNum = 41877587;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=41877588;
 //BA.debugLineNum = 41877588;BA.debugLine="End Sub";
return false;
}
public String  _touchbeginevent(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "touchbeginevent", true))
	 {return ((String) Debug.delegate(ba, "touchbeginevent", null));}
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Private Sub TouchBeginEvent";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="If ismoving = False Then";
if (__ref._ismoving /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchB";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchBegin",(int) (0))) { 
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchBegin\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchBegin");
 };
 };
RDebugUtils.currentLine=42532870;
 //BA.debugLineNum = 42532870;BA.debugLine="End Sub";
return "";
}
public String  _touchendevent(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "touchendevent", true))
	 {return ((String) Debug.delegate(ba, "touchendevent", null));}
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Private Sub TouchEndEvent";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchE";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchEnd",(int) (0))) { 
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchEnd\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_TouchEnd");
 };
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="End Sub";
return "";
}
public boolean  _isnumberoneclosertozero(b4a.example.ef.asviewpager __ref,int _numberone,int _numbertwo) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "isnumberoneclosertozero", true))
	 {return ((Boolean) Debug.delegate(ba, "isnumberoneclosertozero", new Object[] {_numberone,_numbertwo}));}
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Private Sub isNumberOneCloserToZero (numberOne As";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="Return (Abs(numberOne) >= Abs(numberTwo))";
if (true) return (__c.Abs(_numberone)>=__c.Abs(_numbertwo));
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="If m_CurrentIndex = index Then Return";
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
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="m_CurrentIndex = index";
__ref._m_currentindex /*int*/  = _index;
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="If g_ignorepagechangeevent = False And xui.SubExi";
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
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChange\",i";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChange",(Object)(_index));
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=42467335;
 //BA.debugLineNum = 42467335;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
__ref._m_maxoffset /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._getrawlistitem(_index).Offset;
RDebugUtils.currentLine=42467337;
 //BA.debugLineNum = 42467337;BA.debugLine="If delayed = True Then Sleep(300)";
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
RDebugUtils.currentLine=42467339;
 //BA.debugLineNum = 42467339;BA.debugLine="m_MaxOffset = xclv_main.GetRawListItem(index).Off";
__ref._m_maxoffset /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._getrawlistitem(_index).Offset;
RDebugUtils.currentLine=42467341;
 //BA.debugLineNum = 42467341;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";
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
RDebugUtils.currentLine=42467342;
 //BA.debugLineNum = 42467342;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(Object)(_index));
 if (true) break;
;
RDebugUtils.currentLine=42467344;
 //BA.debugLineNum = 42467344;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";

case 20:
//if
this.state = 23;
if (__ref._g_ignorepagechangedevent /*boolean*/ ==parent.__c.False && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged2",(int) (2))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
RDebugUtils.currentLine=42467345;
 //BA.debugLineNum = 42467345;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageChanged2\"";
parent.__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged2",(Object)(_index),(Object)(__ref._oldindex /*int*/ ));
 if (true) break;

case 23:
//C
this.state = -1;
;
RDebugUtils.currentLine=42467347;
 //BA.debugLineNum = 42467347;BA.debugLine="OldIndex = index";
__ref._oldindex /*int*/  = _index;
RDebugUtils.currentLine=42467348;
 //BA.debugLineNum = 42467348;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Private Sub LazyLoadingAddContent(Parent As B4XVie";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="If isLazyLoadingReady = True And xui.SubExists(mC";
if (__ref._islazyloadingready /*boolean*/ ==__c.True && __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LazyLoadingAddContent",(int) (2))) { 
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="CallSub3(mCallBack, mEventName & \"_LazyLoadingAd";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_LazyLoadingAddContent",(Object)(_parent),_value);
 };
RDebugUtils.currentLine=42401796;
 //BA.debugLineNum = 42401796;BA.debugLine="End Sub";
return "";
}
public String  _nextpage2(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "nextpage2", true))
	 {return ((String) Debug.delegate(ba, "nextpage2", null));}
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Public Sub NextPage2";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="If m_AllowNext = False Then Return";
if (__ref._m_allownext /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=40173573;
 //BA.debugLineNum = 40173573;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((__ref._m_currentindex /*int*/ +1)<__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()) { 
RDebugUtils.currentLine=40173575;
 //BA.debugLineNum = 40173575;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex +1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem((int) (__ref._m_currentindex /*int*/ +1));
RDebugUtils.currentLine=40173576;
 //BA.debugLineNum = 40173576;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,False)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ +1),__c.False);
 }else 
{RDebugUtils.currentLine=40173577;
 //BA.debugLineNum = 40173577;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=40173578;
 //BA.debugLineNum = 40173578;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=40173581;
 //BA.debugLineNum = 40173581;BA.debugLine="End Sub";
return "";
}
public String  _previouspage2(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "previouspage2", true))
	 {return ((String) Debug.delegate(ba, "previouspage2", null));}
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Public Sub PreviousPage2";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="If m_AllowBack = False Then Return";
if (__ref._m_allowback /*boolean*/ ==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=40042501;
 //BA.debugLineNum = 40042501;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((__ref._m_currentindex /*int*/ -1)>-1) { 
RDebugUtils.currentLine=40042502;
 //BA.debugLineNum = 40042502;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex -1)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._jumptoitem((int) (__ref._m_currentindex /*int*/ -1));
RDebugUtils.currentLine=40042503;
 //BA.debugLineNum = 40042503;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,False)";
__ref._pagechangedevent /*void*/ (null,(int) (__ref._m_currentindex /*int*/ -1),__c.False);
 }else 
{RDebugUtils.currentLine=40042504;
 //BA.debugLineNum = 40042504;BA.debugLine="Else If m_Carousel = True Then";
if (__ref._m_carousel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=40042505;
 //BA.debugLineNum = 40042505;BA.debugLine="CheckCarousel";
__ref._checkcarousel /*void*/ (null);
 }}
;
RDebugUtils.currentLine=40042508;
 //BA.debugLineNum = 40042508;BA.debugLine="End Sub";
return "";
}
public String  _removepage(b4a.example.ef.asviewpager __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "removepage", true))
	 {return ((String) Debug.delegate(ba, "removepage", new Object[] {_index}));}
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Public Sub RemovePage(index As Int)";
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="xclv_main.RemoveAt(index)";
__ref._xclv_main /*b4a.example3.customlistview*/ ._removeat(_index);
RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((__ref._m_orientation /*String*/ ).equals("Horizontal")) { 
RDebugUtils.currentLine=39911428;
 //BA.debugLineNum = 39911428;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
__ref._m_currentindex /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetX());
 }else {
RDebugUtils.currentLine=39911430;
 //BA.debugLineNum = 39911430;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
__ref._m_currentindex /*int*/  = __ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.getScrollViewOffsetY());
 };
RDebugUtils.currentLine=39911435;
 //BA.debugLineNum = 39911435;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value(b4a.example.ef.asviewpager __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "scroll2value", true))
	 {return ((String) Debug.delegate(ba, "scroll2value", new Object[] {_value}));}
int _i = 0;
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Public Sub Scroll2Value(Value As String)";
RDebugUtils.currentLine=41091081;
 //BA.debugLineNum = 41091081;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=41091082;
 //BA.debugLineNum = 41091082;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i)))) { 
RDebugUtils.currentLine=41091083;
 //BA.debugLineNum = 41091083;BA.debugLine="setCurrentIndex(i)";
__ref._setcurrentindex /*void*/ (null,_i);
RDebugUtils.currentLine=41091084;
 //BA.debugLineNum = 41091084;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=41091088;
 //BA.debugLineNum = 41091088;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value2(b4a.example.ef.asviewpager __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "scroll2value2", true))
	 {return ((String) Debug.delegate(ba, "scroll2value2", new Object[] {_value}));}
int _i = 0;
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Public Sub Scroll2Value2(Value As String)";
RDebugUtils.currentLine=41156617;
 //BA.debugLineNum = 41156617;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=41156618;
 //BA.debugLineNum = 41156618;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i)))) { 
RDebugUtils.currentLine=41156619;
 //BA.debugLineNum = 41156619;BA.debugLine="setCurrentIndex2(i)";
__ref._setcurrentindex2 /*void*/ (null,_i);
RDebugUtils.currentLine=41156620;
 //BA.debugLineNum = 41156620;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=41156624;
 //BA.debugLineNum = 41156624;BA.debugLine="End Sub";
return "";
}
public String  _setignorelazyloading(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorelazyloading", true))
	 {return ((String) Debug.delegate(ba, "setignorelazyloading", new Object[] {_ignore}));}
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Public Sub setIgnoreLazyLoading(Ignore As Boolean)";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="m_IgnoreLazyLoading = Ignore";
__ref._m_ignorelazyloading /*boolean*/  = _ignore;
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangedevent(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorepagechangedevent", true))
	 {return ((String) Debug.delegate(ba, "setignorepagechangedevent", new Object[] {_ignore}));}
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Public Sub setIgnorePageChangedEvent(ignore As Boo";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="g_ignorepagechangedevent = ignore";
__ref._g_ignorepagechangedevent /*boolean*/  = _ignore;
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangeevent(b4a.example.ef.asviewpager __ref,boolean _ignore) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setignorepagechangeevent", true))
	 {return ((String) Debug.delegate(ba, "setignorepagechangeevent", new Object[] {_ignore}));}
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Public Sub setIgnorePageChangeEvent(ignore As Bool";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="g_ignorepagechangeevent = ignore";
__ref._g_ignorepagechangeevent /*boolean*/  = _ignore;
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="End Sub";
return "";
}
public String  _setlazyloading(b4a.example.ef.asviewpager __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setlazyloading", true))
	 {return ((String) Debug.delegate(ba, "setlazyloading", new Object[] {_enabled}));}
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Public Sub setLazyLoading(Enabled As Boolean)";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="m_LazyLoading = Enabled";
__ref._m_lazyloading /*boolean*/  = _enabled;
RDebugUtils.currentLine=40566789;
 //BA.debugLineNum = 40566789;BA.debugLine="End Sub";
return "";
}
public String  _setlazyloadingextrasize(b4a.example.ef.asviewpager __ref,int _extrasize) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setlazyloadingextrasize", true))
	 {return ((String) Debug.delegate(ba, "setlazyloadingextrasize", new Object[] {_extrasize}));}
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Public Sub setLazyLoadingExtraSize(ExtraSize As In";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="m_LazyLoadingExtraSize = ExtraSize";
__ref._m_lazyloadingextrasize /*int*/  = _extrasize;
RDebugUtils.currentLine=40697861;
 //BA.debugLineNum = 40697861;BA.debugLine="End Sub";
return "";
}
public String  _setloadingpanelhideduration(b4a.example.ef.asviewpager __ref,int _duration) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setloadingpanelhideduration", true))
	 {return ((String) Debug.delegate(ba, "setloadingpanelhideduration", new Object[] {_duration}));}
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Public Sub setLoadingPanelHideDuration(Duration As";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="m_LoadingPanelHideDuration = Duration";
__ref._m_loadingpanelhideduration /*int*/  = _duration;
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="End Sub";
return "";
}
public String  _setscroll(b4a.example.ef.asviewpager __ref,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "setscroll", true))
	 {return ((String) Debug.delegate(ba, "setscroll", new Object[] {_enabled}));}
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Public Sub setScroll(enabled As Boolean)";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="g_isScrollEnabled = enabled";
__ref._g_isscrollenabled /*boolean*/  = _enabled;
RDebugUtils.currentLine=40828934;
 //BA.debugLineNum = 40828934;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_itemclick(b4a.example.ef.asviewpager __ref,int _index,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_itemclick", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_itemclick", new Object[] {_index,_value}));}
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Private Sub xclv_main_ItemClick (Index As Int, Val";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCl";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageClick",(int) (2))) { 
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageClick\",In";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageClick",(Object)(_index),_value);
 };
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_reachend(b4a.example.ef.asviewpager __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_reachend", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_reachend", null));}
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Private Sub xclv_main_ReachEnd";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_ReachE";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachEnd",(int) (0))) { 
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachEnd\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ReachEnd");
 };
RDebugUtils.currentLine=42336260;
 //BA.debugLineNum = 42336260;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_scrollchanged(b4a.example.ef.asviewpager __ref,int _offset) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_scrollchanged", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_scrollchanged", new Object[] {_offset}));}
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Private Sub xclv_main_ScrollChanged (Offset As Int";
RDebugUtils.currentLine=42270740;
 //BA.debugLineNum = 42270740;BA.debugLine="If xclv_main.FindIndexFromOffset(Offset) <> m_Cur";
if (__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset)!=__ref._m_currentindex /*int*/  && _offset==(double)(BA.ObjectToNumber((((__ref._m_orientation /*String*/ ).equals("Vertical")) ? ((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())) : ((Object)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth())))))*__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset) && __ref._m_ignore /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=42270741;
 //BA.debugLineNum = 42270741;BA.debugLine="PageChangedEvent(xclv_main.FindIndexFromOffset(O";
__ref._pagechangedevent /*void*/ (null,__ref._xclv_main /*b4a.example3.customlistview*/ ._findindexfromoffset(_offset),__c.False);
 };
RDebugUtils.currentLine=42270744;
 //BA.debugLineNum = 42270744;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Scroll";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ScrollChanged",(int) (1))) { 
RDebugUtils.currentLine=42270745;
 //BA.debugLineNum = 42270745;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ScrollChanged";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_ScrollChanged",(Object)(_offset));
 };
RDebugUtils.currentLine=42270747;
 //BA.debugLineNum = 42270747;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_visiblerangechanged(b4a.example.ef.asviewpager __ref,int _firstindex,int _lastindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xclv_main_visiblerangechanged", true))
	 {return ((String) Debug.delegate(ba, "xclv_main_visiblerangechanged", new Object[] {_firstindex,_lastindex}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
RDebugUtils.currentLine=42074123;
 //BA.debugLineNum = 42074123;BA.debugLine="If m_LazyLoading = False Or m_IgnoreLazyLoading =";
if (__ref._m_lazyloading /*boolean*/ ==__c.False || __ref._m_ignorelazyloading /*boolean*/ ==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=42074137;
 //BA.debugLineNum = 42074137;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xclv_main /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=42074138;
 //BA.debugLineNum = 42074138;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xclv_main /*b4a.example3.customlistview*/ ._getpanel(_i);
RDebugUtils.currentLine=42074139;
 //BA.debugLineNum = 42074139;BA.debugLine="If i > FirstIndex - m_LazyLoadingExtraSize And i";
if (_i>_firstindex-__ref._m_lazyloadingextrasize /*int*/  && _i<_lastindex+__ref._m_lazyloadingextrasize /*int*/ ) { 
RDebugUtils.currentLine=42074141;
 //BA.debugLineNum = 42074141;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
RDebugUtils.currentLine=42074142;
 //BA.debugLineNum = 42074142;BA.debugLine="LazyLoadingAddContent(p,xclv_main.GetValue(i))";
__ref._lazyloadingaddcontent /*String*/ (null,_p,__ref._xclv_main /*b4a.example3.customlistview*/ ._getvalue(_i));
 };
 }else {
RDebugUtils.currentLine=42074146;
 //BA.debugLineNum = 42074146;BA.debugLine="If i > m_CurrentIndex - m_LazyLoadingExtraSize";
if (_i>__ref._m_currentindex /*int*/ -__ref._m_lazyloadingextrasize /*int*/  && _i<__ref._m_currentindex /*int*/ +__ref._m_lazyloadingextrasize /*int*/ ) { 
 }else {
RDebugUtils.currentLine=42074150;
 //BA.debugLineNum = 42074150;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
RDebugUtils.currentLine=42074151;
 //BA.debugLineNum = 42074151;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 };
 };
 }
};
RDebugUtils.currentLine=42074158;
 //BA.debugLineNum = 42074158;BA.debugLine="End Sub";
return "";
}
public boolean  _xpnl_pagearea2_touch(b4a.example.ef.asviewpager __ref,Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="asviewpager";
if (Debug.shouldDelegate(ba, "xpnl_pagearea2_touch", true))
	 {return ((Boolean) Debug.delegate(ba, "xpnl_pagearea2_touch", new Object[] {_viewtag,_action,_x,_y,_motionevent}));}
boolean _skipcheck = false;
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Private Sub xpnl_PageArea2_Touch(ViewTag As Object";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="If g_isScrollEnabled = False Or (m_AllowBack = Fa";
if (__ref._g_isscrollenabled /*boolean*/ ==__c.False || (__ref._m_allowback /*boolean*/ ==__c.False && __ref._m_allownext /*boolean*/ ==__c.False)) { 
if (true) return __c.True;};
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="If m_AllowNext = False Or m_AllowBack = False The";
if (__ref._m_allownext /*boolean*/ ==__c.False || __ref._m_allowback /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=42008582;
 //BA.debugLineNum = 42008582;BA.debugLine="Dim SkipCheck As Boolean = False";
_skipcheck = __c.False;
RDebugUtils.currentLine=42008583;
 //BA.debugLineNum = 42008583;BA.debugLine="If Action = 1 Then";
if (_action==1) { 
RDebugUtils.currentLine=42008584;
 //BA.debugLineNum = 42008584;BA.debugLine="isfirstmove = False";
__ref._isfirstmove /*boolean*/  = __c.False;
RDebugUtils.currentLine=42008585;
 //BA.debugLineNum = 42008585;BA.debugLine="SkipCheck = True";
_skipcheck = __c.True;
 };
RDebugUtils.currentLine=42008588;
 //BA.debugLineNum = 42008588;BA.debugLine="If isfirstmove = False And SkipCheck = False The";
if (__ref._isfirstmove /*boolean*/ ==__c.False && _skipcheck==__c.False) { 
RDebugUtils.currentLine=42008590;
 //BA.debugLineNum = 42008590;BA.debugLine="ff(X,y)";
__ref._ff /*String*/ (null,_x,_y);
RDebugUtils.currentLine=42008592;
 //BA.debugLineNum = 42008592;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=42008595;
 //BA.debugLineNum = 42008595;BA.debugLine="If m_AllowNext = False And x < g_x Then";
if (__ref._m_allownext /*boolean*/ ==__c.False && _x<__ref._g_x /*float*/ ) { 
RDebugUtils.currentLine=42008596;
 //BA.debugLineNum = 42008596;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetX(__ref._m_maxoffset /*int*/ );
RDebugUtils.currentLine=42008598;
 //BA.debugLineNum = 42008598;BA.debugLine="Return True";
if (true) return __c.True;
 }else 
{RDebugUtils.currentLine=42008599;
 //BA.debugLineNum = 42008599;BA.debugLine="else If m_AllowBack = False And x > g_x Then";
if (__ref._m_allowback /*boolean*/ ==__c.False && _x>__ref._g_x /*float*/ ) { 
RDebugUtils.currentLine=42008600;
 //BA.debugLineNum = 42008600;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = m_MaxOffset";
__ref._xclv_main /*b4a.example3.customlistview*/ ._sv.setScrollViewOffsetX(__ref._m_maxoffset /*int*/ );
RDebugUtils.currentLine=42008602;
 //BA.debugLineNum = 42008602;BA.debugLine="Return True";
if (true) return __c.True;
 }}
;
 };
RDebugUtils.currentLine=42008610;
 //BA.debugLineNum = 42008610;BA.debugLine="Return HandleTouch(Action,x,y)";
if (true) return __ref._handletouch /*boolean*/ (null,_action,_x,_y);
RDebugUtils.currentLine=42008611;
 //BA.debugLineNum = 42008611;BA.debugLine="End Sub";
return false;
}
}