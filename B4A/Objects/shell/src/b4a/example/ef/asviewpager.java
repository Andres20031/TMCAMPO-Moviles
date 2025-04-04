
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class asviewpager {
    public static RemoteObject myClass;
	public asviewpager() {
	}
    public static PCBA staticBA = new PCBA(null, asviewpager.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _xclv_main = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _xpnl_loading = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _m_currentindex = RemoteObject.createImmutable(0);
public static RemoteObject _g_x = RemoteObject.createImmutable(0f);
public static RemoteObject _g_y = RemoteObject.createImmutable(0f);
public static RemoteObject _g_dv = RemoteObject.createImmutable(0f);
public static RemoteObject _g_ad = RemoteObject.createImmutable(0f);
public static RemoteObject _g_ms = RemoteObject.createImmutable(0L);
public static RemoteObject _isfirstmove = RemoteObject.createImmutable(false);
public static RemoteObject _m_ignore = RemoteObject.createImmutable(false);
public static RemoteObject _g_ignorepagechangedevent = RemoteObject.createImmutable(false);
public static RemoteObject _g_ignorepagechangeevent = RemoteObject.createImmutable(false);
public static RemoteObject _m_orientation = RemoteObject.createImmutable("");
public static RemoteObject _m_carousel = RemoteObject.createImmutable(false);
public static RemoteObject _m_lazyloading = RemoteObject.createImmutable(false);
public static RemoteObject _m_lazyloadingextrasize = RemoteObject.createImmutable(0);
public static RemoteObject _m_loadingpanelcolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_backgesturegap = RemoteObject.createImmutable(false);
public static RemoteObject _m_allownext = RemoteObject.createImmutable(false);
public static RemoteObject _m_allowback = RemoteObject.createImmutable(false);
public static RemoteObject _m_maxoffset = RemoteObject.createImmutable(0);
public static RemoteObject _ismoving = RemoteObject.createImmutable(false);
public static RemoteObject _g_isscrollenabled = RemoteObject.createImmutable(false);
public static RemoteObject _m_ignorelazyloading = RemoteObject.createImmutable(false);
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _islazyloadingready = RemoteObject.createImmutable(false);
public static RemoteObject _ishidding = RemoteObject.createImmutable(false);
public static RemoteObject _oldindex = RemoteObject.createImmutable(0);
public static RemoteObject _m_loadingpanelhideduration = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"g_ad",_ref.getField(false, "_g_ad"),"g_dv",_ref.getField(false, "_g_dv"),"g_ignorepagechangedevent",_ref.getField(false, "_g_ignorepagechangedevent"),"g_ignorepagechangeevent",_ref.getField(false, "_g_ignorepagechangeevent"),"g_isScrollEnabled",_ref.getField(false, "_g_isscrollenabled"),"g_ms",_ref.getField(false, "_g_ms"),"g_x",_ref.getField(false, "_g_x"),"g_y",_ref.getField(false, "_g_y"),"isfirstmove",_ref.getField(false, "_isfirstmove"),"isHidding",_ref.getField(false, "_ishidding"),"isLazyLoadingReady",_ref.getField(false, "_islazyloadingready"),"ismoving",_ref.getField(false, "_ismoving"),"m_AllowBack",_ref.getField(false, "_m_allowback"),"m_AllowNext",_ref.getField(false, "_m_allownext"),"m_BackGestureGap",_ref.getField(false, "_m_backgesturegap"),"m_Carousel",_ref.getField(false, "_m_carousel"),"m_CurrentIndex",_ref.getField(false, "_m_currentindex"),"m_Ignore",_ref.getField(false, "_m_ignore"),"m_IgnoreLazyLoading",_ref.getField(false, "_m_ignorelazyloading"),"m_LazyLoading",_ref.getField(false, "_m_lazyloading"),"m_LazyLoadingExtraSize",_ref.getField(false, "_m_lazyloadingextrasize"),"m_LoadingPanelColor",_ref.getField(false, "_m_loadingpanelcolor"),"m_LoadingPanelHideDuration",_ref.getField(false, "_m_loadingpanelhideduration"),"m_MaxOffset",_ref.getField(false, "_m_maxoffset"),"m_Orientation",_ref.getField(false, "_m_orientation"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"OldIndex",_ref.getField(false, "_oldindex"),"Tag",_ref.getField(false, "_tag"),"xclv_main",_ref.getField(false, "_xclv_main"),"xpnl_Loading",_ref.getField(false, "_xpnl_loading"),"xui",_ref.getField(false, "_xui")};
}
}