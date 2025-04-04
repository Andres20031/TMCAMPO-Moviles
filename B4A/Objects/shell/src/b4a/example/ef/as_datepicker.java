
package b4a.example.ef;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class as_datepicker {
    public static RemoteObject myClass;
	public as_datepicker() {
	}
    public static PCBA staticBA = new PCBA(null, as_datepicker.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _m_isready = RemoteObject.createImmutable(false);
public static RemoteObject _g_headerproperties = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_headerproperties");
public static RemoteObject _g_bodyproperties = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_bodyproperties");
public static RemoteObject _g_monthnameshort = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_monthnameshort");
public static RemoteObject _g_weeknameshort = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_weeknameshort");
public static RemoteObject _g_weeknumberproperties = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties");
public static RemoteObject _g_weeknameproperties = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties");
public static RemoteObject _xasvp_main = RemoteObject.declareNull("b4a.example.ef.asviewpager");
public static RemoteObject _xpnl_loadingpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_header = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_viewpager = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_selecteddate = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_selecteddate2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _m_headercolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_bodycolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_currentdatecolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_selecteddatecolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_mousehoverfeedback = RemoteObject.createImmutable(false);
public static RemoteObject _m_selecteddate = RemoteObject.createImmutable(0L);
public static RemoteObject _m_selecteddate2 = RemoteObject.createImmutable(0L);
public static RemoteObject _m_showweeknumbers = RemoteObject.createImmutable(false);
public static RemoteObject _m_firstdayofweek = RemoteObject.createImmutable(0);
public static RemoteObject _m_showgridlines = RemoteObject.createImmutable(false);
public static RemoteObject _m_gridlinecolor = RemoteObject.createImmutable(0);
public static RemoteObject _m_themechangetransition = RemoteObject.createImmutable("");
public static RemoteObject _m_currentview = RemoteObject.createImmutable("");
public static RemoteObject _m_startdate = RemoteObject.createImmutable(0L);
public static RemoteObject _m_inactivedaysvisible = RemoteObject.createImmutable(false);
public static RemoteObject _m_mindate = RemoteObject.createImmutable(0L);
public static RemoteObject _m_maxdate = RemoteObject.createImmutable(0L);
public static RemoteObject _m_selectmode = RemoteObject.createImmutable("");
public static RemoteObject _xiv_refreshimage = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static b4a.example.ef.main _main = null;
public static b4a.example.ef.starter _starter = null;
public static b4a.example.ef.b4xcollections _b4xcollections = null;
public static b4a.example.ef.b4xpages _b4xpages = null;
public static b4a.example.ef.httputils2service _httputils2service = null;
public static b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"g_BodyProperties",_ref.getField(false, "_g_bodyproperties"),"g_HeaderProperties",_ref.getField(false, "_g_headerproperties"),"g_MonthNameShort",_ref.getField(false, "_g_monthnameshort"),"g_WeekNameProperties",_ref.getField(false, "_g_weeknameproperties"),"g_WeekNameShort",_ref.getField(false, "_g_weeknameshort"),"g_WeekNumberProperties",_ref.getField(false, "_g_weeknumberproperties"),"m_BodyColor",_ref.getField(false, "_m_bodycolor"),"m_CurrentDateColor",_ref.getField(false, "_m_currentdatecolor"),"m_CurrentView",_ref.getField(false, "_m_currentview"),"m_FirstDayOfWeek",_ref.getField(false, "_m_firstdayofweek"),"m_GridLineColor",_ref.getField(false, "_m_gridlinecolor"),"m_HeaderColor",_ref.getField(false, "_m_headercolor"),"m_InactiveDaysVisible",_ref.getField(false, "_m_inactivedaysvisible"),"m_isReady",_ref.getField(false, "_m_isready"),"m_MaxDate",_ref.getField(false, "_m_maxdate"),"m_MinDate",_ref.getField(false, "_m_mindate"),"m_MouseHoverFeedback",_ref.getField(false, "_m_mousehoverfeedback"),"m_SelectedDate",_ref.getField(false, "_m_selecteddate"),"m_SelectedDate2",_ref.getField(false, "_m_selecteddate2"),"m_SelectedDateColor",_ref.getField(false, "_m_selecteddatecolor"),"m_SelectMode",_ref.getField(false, "_m_selectmode"),"m_ShowGridLines",_ref.getField(false, "_m_showgridlines"),"m_ShowWeekNumbers",_ref.getField(false, "_m_showweeknumbers"),"m_StartDate",_ref.getField(false, "_m_startdate"),"m_ThemeChangeTransition",_ref.getField(false, "_m_themechangetransition"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"xASVP_Main",_ref.getField(false, "_xasvp_main"),"xiv_RefreshImage",_ref.getField(false, "_xiv_refreshimage"),"xpnl_Header",_ref.getField(false, "_xpnl_header"),"xpnl_LoadingPanel",_ref.getField(false, "_xpnl_loadingpanel"),"xpnl_SelectedDate",_ref.getField(false, "_xpnl_selecteddate"),"xpnl_SelectedDate2",_ref.getField(false, "_xpnl_selecteddate2"),"xpnl_ViewPager",_ref.getField(false, "_xpnl_viewpager"),"xui",_ref.getField(false, "_xui")};
}
}