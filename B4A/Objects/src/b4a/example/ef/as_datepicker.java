package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class as_datepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.as_datepicker");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.as_datepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public boolean _m_isready = false;
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties _g_headerproperties = null;
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _g_bodyproperties = null;
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _g_monthnameshort = null;
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _g_weeknameshort = null;
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _g_weeknumberproperties = null;
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _g_weeknameproperties = null;
public b4a.example.ef.asviewpager _xasvp_main = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_loadingpanel = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_header = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_viewpager = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selecteddate = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selecteddate2 = null;
public int _m_headercolor = 0;
public int _m_bodycolor = 0;
public int _m_currentdatecolor = 0;
public int _m_selecteddatecolor = 0;
public boolean _m_mousehoverfeedback = false;
public long _m_selecteddate = 0L;
public long _m_selecteddate2 = 0L;
public boolean _m_showweeknumbers = false;
public int _m_firstdayofweek = 0;
public boolean _m_showgridlines = false;
public int _m_gridlinecolor = 0;
public String _m_themechangetransition = "";
public String _m_currentview = "";
public long _m_startdate = 0L;
public boolean _m_inactivedaysvisible = false;
public long _m_mindate = 0L;
public long _m_maxdate = 0L;
public String _m_selectmode = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _xiv_refreshimage = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static class _asdatepicker_monthnameshort{
public boolean IsInitialized;
public String January;
public String February;
public String March;
public String April;
public String May;
public String June;
public String July;
public String August;
public String September;
public String October;
public String November;
public String December;
public void Initialize() {
IsInitialized = true;
January = "";
February = "";
March = "";
April = "";
May = "";
June = "";
July = "";
August = "";
September = "";
October = "";
November = "";
December = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _asdatepicker_weeknameshort{
public boolean IsInitialized;
public String Monday;
public String Tuesday;
public String Wednesday;
public String Thursday;
public String Friday;
public String Saturday;
public String Sunday;
public void Initialize() {
IsInitialized = true;
Monday = "";
Tuesday = "";
Wednesday = "";
Thursday = "";
Friday = "";
Saturday = "";
Sunday = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _asdatepicker_headerproperties{
public boolean IsInitialized;
public float Height;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public int TextColor;
public float ButtonIconSize;
public boolean ArrowsVisible;
public void Initialize() {
IsInitialized = true;
Height = 0f;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
ButtonIconSize = 0f;
ArrowsVisible = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _asdatepicker_bodyproperties{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public int TextColor;
public int SelectedTextColor;
public float CurrentAndSelectedDayHeight;
public void Initialize() {
IsInitialized = true;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
SelectedTextColor = 0;
CurrentAndSelectedDayHeight = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _asdatepicker_customdrawday{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper BackgroundPanel;
public anywheresoftware.b4a.objects.B4XViewWrapper xlbl_Date;
public void Initialize() {
IsInitialized = true;
BackgroundPanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
xlbl_Date = new anywheresoftware.b4a.objects.B4XViewWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _asdatepicker_customdrawheader{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper BackgroundPanel;
public anywheresoftware.b4a.objects.B4XViewWrapper xlbl_Text;
public anywheresoftware.b4a.objects.B4XViewWrapper xlbl_ArrowLeft;
public anywheresoftware.b4a.objects.B4XViewWrapper xlbl_ArrowRight;
public void Initialize() {
IsInitialized = true;
BackgroundPanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
xlbl_Text = new anywheresoftware.b4a.objects.B4XViewWrapper();
xlbl_ArrowLeft = new anywheresoftware.b4a.objects.B4XViewWrapper();
xlbl_ArrowRight = new anywheresoftware.b4a.objects.B4XViewWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _asdatepicker_weeknumberproperties{
public boolean IsInitialized;
public float Width;
public int Color;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public int TextColor;
public String Text;
public void Initialize() {
IsInitialized = true;
Width = 0f;
Color = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Text = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _asdatepicker_weeknameproperties{
public boolean IsInitialized;
public int Color;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public int TextColor;
public float Height;
public void Initialize() {
IsInitialized = true;
Color = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Height = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _as_datepicker_theme{
public boolean IsInitialized;
public int SelectedTextColor;
public int WeekNumberTextColor;
public int WeekNumberColor;
public int WeekNameColor;
public int WeekNameTextColor;
public int HeaderTextColor;
public int BodyTextColor;
public int GridLineColor;
public int SelectedDateColor;
public int CurrentDateColor;
public int HeaderColor;
public int BodyColor;
public void Initialize() {
IsInitialized = true;
SelectedTextColor = 0;
WeekNumberTextColor = 0;
WeekNumberColor = 0;
WeekNameColor = 0;
WeekNameTextColor = 0;
HeaderTextColor = 0;
BodyTextColor = 0;
GridLineColor = 0;
SelectedDateColor = 0;
CurrentDateColor = 0;
HeaderColor = 0;
BodyColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addmonth(anywheresoftware.b4a.objects.B4XViewWrapper _parent,long _currentdate) throws Exception{
int[] _clr = null;
float _blockheight = 0f;
float _blockwidth = 0f;
long _firstday = 0L;
int _currenmonth = 0;
int _i = 0;
long _currentday = 0L;
int _rest = 0;
int _test = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
int[] _color = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_currentday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_weeknumber = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_weeknumber = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_canvasbackground = null;
anywheresoftware.b4a.objects.B4XCanvas _xcv = null;
 //BA.debugLineNum = 873;BA.debugLine="Private Sub AddMonth(Parent As B4XView,CurrentDate";
 //BA.debugLineNum = 875;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = _getargb(_m_selecteddatecolor);
 //BA.debugLineNum = 877;BA.debugLine="Dim BlockHeight As Float = (Parent.Height-g_WeekN";
_blockheight = (float) ((_parent.getHeight()-_g_weeknameproperties.Height /*float*/ )/(double)6);
 //BA.debugLineNum = 878;BA.debugLine="Dim BlockWidth As Float = IIf(m_ShowWeekNumbers,(";
_blockwidth = (float)(BA.ObjectToNumber(((_m_showweeknumbers) ? ((Object)((_xpnl_viewpager.getWidth()-_g_weeknumberproperties.Width /*float*/ )/(double)7)) : ((Object)(_xpnl_viewpager.getWidth()/(double)7)))));
 //BA.debugLineNum = 880;BA.debugLine="If m_ShowWeekNumbers Then AddWeekName(Parent,-1,g";
if (_m_showweeknumbers) { 
_addweekname(_parent,(int) (-1),_g_weeknumberproperties.Text /*String*/ );};
 //BA.debugLineNum = 881;BA.debugLine="AddWeekName(Parent,0,g_WeekNameShort.Monday)";
_addweekname(_parent,(int) (0),_g_weeknameshort.Monday /*String*/ );
 //BA.debugLineNum = 882;BA.debugLine="AddWeekName(Parent,1,g_WeekNameShort.Tuesday)";
_addweekname(_parent,(int) (1),_g_weeknameshort.Tuesday /*String*/ );
 //BA.debugLineNum = 883;BA.debugLine="AddWeekName(Parent,2,g_WeekNameShort.Wednesday)";
_addweekname(_parent,(int) (2),_g_weeknameshort.Wednesday /*String*/ );
 //BA.debugLineNum = 884;BA.debugLine="AddWeekName(Parent,3,g_WeekNameShort.Thursday)";
_addweekname(_parent,(int) (3),_g_weeknameshort.Thursday /*String*/ );
 //BA.debugLineNum = 885;BA.debugLine="AddWeekName(Parent,4,g_WeekNameShort.Friday)";
_addweekname(_parent,(int) (4),_g_weeknameshort.Friday /*String*/ );
 //BA.debugLineNum = 886;BA.debugLine="AddWeekName(Parent,5,g_WeekNameShort.Saturday)";
_addweekname(_parent,(int) (5),_g_weeknameshort.Saturday /*String*/ );
 //BA.debugLineNum = 887;BA.debugLine="AddWeekName(Parent,6,g_WeekNameShort.Sunday)";
_addweekname(_parent,(int) (6),_g_weeknameshort.Sunday /*String*/ );
 //BA.debugLineNum = 889;BA.debugLine="Dim FirstDay As Long = GetFirstDayOfWeek2(Current";
_firstday = _getfirstdayofweek2(_currentdate,_m_firstdayofweek);
 //BA.debugLineNum = 891;BA.debugLine="Dim CurrenMonth As Int = DateTime.GetMonth(Curren";
_currenmonth = __c.DateTime.GetMonth(_currentdate);
 //BA.debugLineNum = 893;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(_m_bodycolor);
 //BA.debugLineNum = 896;BA.debugLine="For i = 1 To 43 -1";
{
final int step15 = 1;
final int limit15 = (int) (43-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 898;BA.debugLine="Dim CurrentDay As Long = FirstDay + DateTime.Tic";
_currentday = (long) (_firstday+__c.DateTime.TicksPerDay*(_i-1)+__c.DateTime.TicksPerHour);
 //BA.debugLineNum = 900;BA.debugLine="Dim Rest As Int = (i-1)/7";
_rest = (int) ((_i-1)/(double)7);
 //BA.debugLineNum = 901;BA.debugLine="Dim test As Int = (i-1) Mod 7";
_test = (int) ((_i-1)%7);
 //BA.debugLineNum = 903;BA.debugLine="Dim xpnl_Date As B4XView = xui.CreatePanel(\"xpnl";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_date = _xui.CreatePanel(ba,"xpnl_MonthDate");
 //BA.debugLineNum = 904;BA.debugLine="xpnl_Date.Tag = CurrentDay";
_xpnl_date.setTag((Object)(_currentday));
 //BA.debugLineNum = 905;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent'm_BodyCo";
_xpnl_date.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 906;BA.debugLine="Parent.AddView(xpnl_Date,IIf(m_ShowWeekNumbers,g";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) ((double)(BA.ObjectToNumber(((_m_showweeknumbers) ? ((Object)(_g_weeknumberproperties.Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_test)),(int) (_g_weeknameproperties.Height /*float*/ +(_blockheight*_rest)),(int) (_blockwidth),(int) (_blockheight));
 //BA.debugLineNum = 907;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _createlabel("");
 //BA.debugLineNum = 908;BA.debugLine="xlbl_Date.Tag = \"xlbl_Date\"";
_xlbl_date.setTag((Object)("xlbl_Date"));
 //BA.debugLineNum = 909;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(_g_bodyproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 910;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(_g_bodyproperties.TextColor /*int*/ );
 //BA.debugLineNum = 911;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 912;BA.debugLine="xlbl_Date.Text = DateTime.GetDayOfMonth(CurrentD";
_xlbl_date.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(_currentday)));
 //BA.debugLineNum = 915;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
 //BA.debugLineNum = 917;BA.debugLine="If DateTime.GetMonth(CurrentDay) <> CurrenMonth";
if (__c.DateTime.GetMonth(_currentday)!=_currenmonth) { 
 //BA.debugLineNum = 918;BA.debugLine="If m_InactiveDaysVisible = False Then";
if (_m_inactivedaysvisible==__c.False) { 
 //BA.debugLineNum = 919;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 }else {
 //BA.debugLineNum = 921;BA.debugLine="Dim Color() As Int = GetARGB(g_BodyProperties.";
_color = _getargb(_g_bodyproperties.TextColor /*int*/ );
 //BA.debugLineNum = 922;BA.debugLine="xlbl_Date.TextColor = xui.Color_ARGB(100,Color";
_xlbl_date.setTextColor(_xui.Color_ARGB((int) (100),_color[(int) (1)],_color[(int) (2)],_color[(int) (3)]));
 };
 };
 //BA.debugLineNum = 926;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime";
if ((_m_maxdate>0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(_m_maxdate),__c.DateTime.GetMonth(_m_maxdate),__c.DateTime.GetDayOfMonth(_m_maxdate))) || (_m_mindate>0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(_m_mindate),__c.DateTime.GetMonth(_m_mindate),__c.DateTime.GetDayOfMonth(_m_mindate)))) { 
 //BA.debugLineNum = 927;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 };
 //BA.debugLineNum = 932;BA.debugLine="CreateSelectDates(xpnl_Date,clr)";
_createselectdates(_xpnl_date,_clr);
 //BA.debugLineNum = 934;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,CurrentDay)";
if (_dateutils._issameday(ba,__c.DateTime.getNow(),_currentday)==__c.True && _xlbl_date.getVisible()==__c.True) { 
 //BA.debugLineNum = 935;BA.debugLine="Dim xpnl_CurrentDay As B4XView = xui.CreatePane";
_xpnl_currentday = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_currentday = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 936;BA.debugLine="xpnl_CurrentDay.SetColorAndBorder(m_CurrentDate";
_xpnl_currentday.SetColorAndBorder(_m_currentdatecolor,(int) (0),(int) (0),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2));
 //BA.debugLineNum = 937;BA.debugLine="xpnl_Date.AddView(xpnl_CurrentDay,BlockWidth/2";
_xpnl_date.AddView((android.view.View)(_xpnl_currentday.getObject()),(int) (_blockwidth/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_blockheight/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ));
 };
 //BA.debugLineNum = 941;BA.debugLine="If m_ShowWeekNumbers = True Then";
if (_m_showweeknumbers==__c.True) { 
 //BA.debugLineNum = 942;BA.debugLine="Dim xpnl_WeekNumber As B4XView = xui.CreatePane";
_xpnl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_weeknumber = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 943;BA.debugLine="Dim xlbl_WeekNumber As B4XView = CreateLabel(\"\"";
_xlbl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weeknumber = _createlabel("");
 //BA.debugLineNum = 944;BA.debugLine="Parent.AddView(xpnl_WeekNumber,0,g_WeekNameProp";
_parent.AddView((android.view.View)(_xpnl_weeknumber.getObject()),(int) (0),(int) (_g_weeknameproperties.Height /*float*/ +(_blockheight*_rest)),(int) (_g_weeknumberproperties.Width /*float*/ ),(int) (_blockheight));
 //BA.debugLineNum = 945;BA.debugLine="xpnl_WeekNumber.AddView(xlbl_WeekNumber,0,0,g_W";
_xpnl_weeknumber.AddView((android.view.View)(_xlbl_weeknumber.getObject()),(int) (0),(int) (0),(int) (_g_weeknumberproperties.Width /*float*/ ),(int) (_blockheight));
 //BA.debugLineNum = 947;BA.debugLine="xpnl_WeekNumber.Color = g_WeekNumberProperties.";
_xpnl_weeknumber.setColor(_g_weeknumberproperties.Color /*int*/ );
 //BA.debugLineNum = 949;BA.debugLine="xlbl_WeekNumber.SetTextAlignment(\"CENTER\",\"CENT";
_xlbl_weeknumber.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 950;BA.debugLine="xlbl_WeekNumber.TextColor = g_WeekNumberPropert";
_xlbl_weeknumber.setTextColor(_g_weeknumberproperties.TextColor /*int*/ );
 //BA.debugLineNum = 951;BA.debugLine="xlbl_WeekNumber.Font = g_WeekNumberProperties.x";
_xlbl_weeknumber.setFont(_g_weeknumberproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 952;BA.debugLine="xlbl_WeekNumber.Text = GetWeekNumberStartingFro";
_xlbl_weeknumber.setText(BA.ObjectToCharSequence(_getweeknumberstartingfrommonday(_currentday)));
 };
 //BA.debugLineNum = 955;BA.debugLine="CustomDrawDay(CurrentDay,xpnl_Date)";
_customdrawday(_currentday,_xpnl_date);
 }
};
 //BA.debugLineNum = 959;BA.debugLine="If m_ShowGridLines Then";
if (_m_showgridlines) { 
 //BA.debugLineNum = 960;BA.debugLine="Dim xpnl_CanvasBackground As B4XView = xui.Creat";
_xpnl_canvasbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_canvasbackground = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 961;BA.debugLine="Parent.AddView(xpnl_CanvasBackground,0,0,Parent.";
_parent.AddView((android.view.View)(_xpnl_canvasbackground.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 962;BA.debugLine="xpnl_CanvasBackground.Color = xui.Color_Transpar";
_xpnl_canvasbackground.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 970;BA.debugLine="Dim xcv As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 971;BA.debugLine="xcv.Initialize(xpnl_CanvasBackground)";
_xcv.Initialize(_xpnl_canvasbackground);
 //BA.debugLineNum = 972;BA.debugLine="xcv.ClearRect(xcv.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
 //BA.debugLineNum = 974;BA.debugLine="For i = 0 To 6 -1 'Add Divider Vertical";
{
final int step67 = 1;
final int limit67 = (int) (6-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
 //BA.debugLineNum = 975;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumber";
_xcv.DrawLine((float) ((double)(BA.ObjectToNumber(((_m_showweeknumbers) ? ((Object)(_g_weeknumberproperties.Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (0),(float) ((double)(BA.ObjectToNumber(((_m_showweeknumbers) ? ((Object)(_g_weeknumberproperties.Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (_parent.getHeight()),_m_gridlinecolor,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 977;BA.debugLine="If i < 5 Then xcv.DrawLine(0,g_WeekNameProperti";
if (_i<5) { 
_xcv.DrawLine((float) (0),(float) (_g_weeknameproperties.Height /*float*/ +(_blockheight*(_i+1))),(float) (_parent.getWidth()),(float) (_g_weeknameproperties.Height /*float*/ +(_blockheight*(_i+1))),_m_gridlinecolor,(float) (__c.DipToCurrent((int) (1))));};
 }
};
 //BA.debugLineNum = 980;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumberP";
_xcv.DrawLine((float)(BA.ObjectToNumber(((_m_showweeknumbers) ? ((Object)(_g_weeknumberproperties.Width /*float*/ )) : ((Object)(0))))),_g_weeknameproperties.Height /*float*/ ,(float) (_parent.getWidth()),_g_weeknameproperties.Height /*float*/ ,_m_gridlinecolor,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 982;BA.debugLine="xcv.Invalidate";
_xcv.Invalidate();
 };
 //BA.debugLineNum = 985;BA.debugLine="End Sub";
return "";
}
public String  _addweekname(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background,int _i,String _text) throws Exception{
float _blockheight = 0f;
float _blockwidth = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_weekname = null;
 //BA.debugLineNum = 425;BA.debugLine="Private Sub AddWeekName(xpnl_Background As B4XView";
 //BA.debugLineNum = 427;BA.debugLine="Dim BlockHeight As Float = g_WeekNameProperties.H";
_blockheight = _g_weeknameproperties.Height /*float*/ ;
 //BA.debugLineNum = 428;BA.debugLine="Dim BlockWidth As Float = Floor(IIf(m_ShowWeekNum";
_blockwidth = (float) (__c.Floor((double)(BA.ObjectToNumber(((_m_showweeknumbers) ? ((Object)((_xpnl_viewpager.getWidth()-_g_weeknumberproperties.Width /*float*/ )/(double)7)) : (((_i==-1) ? ((Object)(_g_weeknumberproperties.Width /*float*/ )) : ((Object)(_xpnl_viewpager.getWidth()/(double)7)))))))));
 //BA.debugLineNum = 430;BA.debugLine="Dim xlbl_WeekName As B4XView = CreateLabel(\"\")";
_xlbl_weekname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weekname = _createlabel("");
 //BA.debugLineNum = 432;BA.debugLine="xlbl_WeekName.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_weekname.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 433;BA.debugLine="xlbl_WeekName.Text = Text";
_xlbl_weekname.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 434;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
 //BA.debugLineNum = 435;BA.debugLine="xlbl_WeekName.Color = g_WeekNumberProperties.Col";
_xlbl_weekname.setColor(_g_weeknumberproperties.Color /*int*/ );
 //BA.debugLineNum = 436;BA.debugLine="xlbl_WeekName.Font = g_WeekNumberProperties.xFon";
_xlbl_weekname.setFont(_g_weeknumberproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 437;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNumberProperties";
_xlbl_weekname.setTextColor(_g_weeknumberproperties.TextColor /*int*/ );
 }else {
 //BA.debugLineNum = 439;BA.debugLine="xlbl_WeekName.Color = g_WeekNameProperties.Color";
_xlbl_weekname.setColor(_g_weeknameproperties.Color /*int*/ );
 //BA.debugLineNum = 440;BA.debugLine="xlbl_WeekName.Font = g_WeekNameProperties.xFont";
_xlbl_weekname.setFont(_g_weeknameproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 441;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNameProperties.T";
_xlbl_weekname.setTextColor(_g_weeknameproperties.TextColor /*int*/ );
 };
 //BA.debugLineNum = 444;BA.debugLine="xpnl_Background.AddView(xlbl_WeekName,IIf(i = -1,";
_xpnl_background.AddView((android.view.View)(_xlbl_weekname.getObject()),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(0)) : ((Object)((double)(BA.ObjectToNumber(((_m_showweeknumbers) ? ((Object)(_g_weeknumberproperties.Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_i)))))),(int) (0),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(_g_weeknumberproperties.Width /*float*/ )) : ((Object)(_blockwidth))))),(int) (_blockheight));
 //BA.debugLineNum = 445;BA.debugLine="End Sub";
return "";
}
public String  _addyear(anywheresoftware.b4a.objects.B4XViewWrapper _parent,long _currentdate) throws Exception{
float _blockheight = 0f;
float _blockwidth = 0f;
int _i = 0;
int _rest = 0;
int _test = 0;
String _text = "";
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_date = null;
boolean _selectthispanel = false;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_current = null;
float _strokewidth = 0f;
 //BA.debugLineNum = 987;BA.debugLine="Private Sub AddYear(Parent As B4XView,CurrentDate";
 //BA.debugLineNum = 989;BA.debugLine="Dim BlockHeight As Float = xpnl_ViewPager.Height/";
_blockheight = (float) (_xpnl_viewpager.getHeight()/(double)4);
 //BA.debugLineNum = 990;BA.debugLine="Dim BlockWidth As Float = xpnl_ViewPager.Width/3";
_blockwidth = (float) (_xpnl_viewpager.getWidth()/(double)3);
 //BA.debugLineNum = 992;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(_m_bodycolor);
 //BA.debugLineNum = 994;BA.debugLine="For i = 1 To 13 -1";
{
final int step4 = 1;
final int limit4 = (int) (13-1);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 998;BA.debugLine="Dim Rest As Int = (i-1)/3";
_rest = (int) ((_i-1)/(double)3);
 //BA.debugLineNum = 999;BA.debugLine="Dim test As Int = (i-1) Mod 3";
_test = (int) ((_i-1)%3);
 //BA.debugLineNum = 1001;BA.debugLine="Dim Text As String = \"\"";
_text = "";
 //BA.debugLineNum = 1002;BA.debugLine="Dim xpnl_Date As B4XView";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1003;BA.debugLine="Dim SelectThisPanel As Boolean = False";
_selectthispanel = __c.False;
 //BA.debugLineNum = 1004;BA.debugLine="If m_CurrentView = getCurrentView_YearView Then";
if ((_m_currentview).equals(_getcurrentview_yearview())) { 
 //BA.debugLineNum = 1005;BA.debugLine="Text = GetMonthNameByIndex(i)";
_text = _getmonthnamebyindex(_i);
 //BA.debugLineNum = 1006;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_YearMonth\")";
_xpnl_date = _xui.CreatePanel(ba,"xpnl_YearMonth");
 //BA.debugLineNum = 1007;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,__c.DateTime.GetYear(_currentdate),_i,(int) (1))));
 //BA.debugLineNum = 1008;BA.debugLine="If DateTime.GetMonth(xpnl_Date.Tag) = DateTime.";
if (__c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetMonth(__c.DateTime.getNow()) && __c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
 //BA.debugLineNum = 1010;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((_m_maxdate>0 || _m_mindate>0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(_m_maxdate) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetMonth(_m_maxdate)) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(_m_mindate) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetMonth(_m_mindate))) { 
 //BA.debugLineNum = 1011;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else if((_m_currentview).equals(_getcurrentview_decadeview())) { 
 //BA.debugLineNum = 1015;BA.debugLine="Text = DateTime.GetYear(CurrentDate)+(i-1)";
_text = BA.NumberToString(__c.DateTime.GetYear(_currentdate)+(_i-1));
 //BA.debugLineNum = 1016;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_DecadeYear\")";
_xpnl_date = _xui.CreatePanel(ba,"xpnl_DecadeYear");
 //BA.debugLineNum = 1017;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*1),(int) (1),(int) (1))));
 //BA.debugLineNum = 1018;BA.debugLine="If DateTime.GetYear(xpnl_Date.Tag) = DateTime.G";
if (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
 //BA.debugLineNum = 1020;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And ((DateT";
if ((_m_maxdate>0 || _m_mindate>0) && ((__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(_m_maxdate)) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetYear(_m_mindate)))) { 
 //BA.debugLineNum = 1021;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else if((_m_currentview).equals(_getcurrentview_centuryview())) { 
 //BA.debugLineNum = 1025;BA.debugLine="Text = (DateTime.GetYear(CurrentDate)+(i-1)*10)";
_text = BA.NumberToString((__c.DateTime.GetYear(_currentdate)+(_i-1)*10))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9));
 //BA.debugLineNum = 1026;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_CenturyDecade";
_xpnl_date = _xui.CreatePanel(ba,"xpnl_CenturyDecade");
 //BA.debugLineNum = 1027;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*10),(int) (1),(int) (1))));
 //BA.debugLineNum = 1028;BA.debugLine="If DateTime.GetYear(DateTime.Now) >= (DateTime.";
if (__c.DateTime.GetYear(__c.DateTime.getNow())>=(__c.DateTime.GetYear(_currentdate)+(_i-1)*10) && __c.DateTime.GetYear(__c.DateTime.getNow())<=((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)) { 
_selectthispanel = __c.True;};
 //BA.debugLineNum = 1035;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((_m_maxdate>0 || _m_mindate>0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(_m_maxdate) || ((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)<__c.DateTime.GetYear(_m_mindate))) { 
 //BA.debugLineNum = 1036;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 };
 //BA.debugLineNum = 1041;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent";
_xpnl_date.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 1042;BA.debugLine="Parent.AddView(xpnl_Date,BlockWidth*test,BlockHe";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) (_blockwidth*_test),(int) (_blockheight*_rest),(int) (_blockwidth),(int) (_blockheight));
 //BA.debugLineNum = 1043;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _createlabel("");
 //BA.debugLineNum = 1045;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(_g_bodyproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 1046;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(_g_bodyproperties.TextColor /*int*/ );
 //BA.debugLineNum = 1047;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 1049;BA.debugLine="xlbl_Date.Text = Text";
_xlbl_date.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 1051;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
 //BA.debugLineNum = 1053;BA.debugLine="If SelectThisPanel Then";
if (_selectthispanel) { 
 //BA.debugLineNum = 1054;BA.debugLine="Dim xpnl_Current As B4XView = xui.CreatePanel(\"";
_xpnl_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_current = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 1055;BA.debugLine="Dim StrokeWidth As Float = 2dip";
_strokewidth = (float) (__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1056;BA.debugLine="xpnl_Date.AddView(xpnl_Current,StrokeWidth,Stro";
_xpnl_date.AddView((android.view.View)(_xpnl_current.getObject()),(int) (_strokewidth),(int) (_strokewidth),(int) (_blockwidth-_strokewidth*2),(int) (_blockheight-_strokewidth*2));
 //BA.debugLineNum = 1058;BA.debugLine="xpnl_Current.SetColorAndBorder(xui.Color_Transp";
_xpnl_current.SetColorAndBorder(_xui.Color_Transparent,(int) (_strokewidth),_m_currentdatecolor,__c.DipToCurrent((int) (5)));
 };
 }
};
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return "";
}
public void  _base_resize(double _width,double _height) throws Exception{
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(this,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4a.example.ef.as_datepicker parent,double _width,double _height) {
this.parent = parent;
this._width = _width;
this._height = _height;
}
b4a.example.ef.as_datepicker parent;
double _width;
double _height;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 377;BA.debugLine="xiv_RefreshImage.SetLayoutAnimated(0,0,0,Width,He";
parent._xiv_refreshimage.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 378;BA.debugLine="xpnl_Header.SetLayoutAnimated(0,0,0,Width,g_Heade";
parent._xpnl_header.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_headerproperties.Height /*float*/ ));
 //BA.debugLineNum = 379;BA.debugLine="xpnl_ViewPager.SetLayoutAnimated(0,0,g_HeaderProp";
parent._xpnl_viewpager.SetLayoutAnimated((int) (0),(int) (0),(int) (parent._g_headerproperties.Height /*float*/ ),(int) (_width),(int) (_height-parent._g_headerproperties.Height /*float*/ ));
 //BA.debugLineNum = 380;BA.debugLine="xASVP_Main.Base_Resize(Width,xpnl_ViewPager.Heigh";
parent._xasvp_main._base_resize /*void*/ (_width,parent._xpnl_viewpager.getHeight());
 //BA.debugLineNum = 383;BA.debugLine="xpnl_Header.GetView(0).SetLayoutAnimated(0,xpnl_H";
parent._xpnl_header.GetView((int) (0)).SetLayoutAnimated((int) (0),parent._xpnl_header.getHeight(),(int) (0),(int) (parent._mbase.getWidth()-parent._xpnl_header.getHeight()*2),parent._xpnl_header.getHeight());
 //BA.debugLineNum = 384;BA.debugLine="xpnl_Header.GetView(1).SetLayoutAnimated(0,0,0,xp";
parent._xpnl_header.GetView((int) (1)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._xpnl_header.getHeight(),parent._xpnl_header.getHeight());
 //BA.debugLineNum = 385;BA.debugLine="xpnl_Header.GetView(2).SetLayoutAnimated(0,xpnl_H";
parent._xpnl_header.GetView((int) (2)).SetLayoutAnimated((int) (0),(int) (parent._xpnl_header.getWidth()-parent._xpnl_header.getHeight()),(int) (0),parent._xpnl_header.getHeight(),parent._xpnl_header.getHeight());
 //BA.debugLineNum = 387;BA.debugLine="xASVP_Main.ResetLazyLoadingPanels";
parent._xasvp_main._resetlazyloadingpanels /*String*/ ();
 //BA.debugLineNum = 388;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 389;BA.debugLine="xASVP_Main.ResetLazyloadingIndex";
parent._xasvp_main._resetlazyloadingindex /*String*/ ();
 //BA.debugLineNum = 390;BA.debugLine="xASVP_Main.Commit";
parent._xasvp_main._commit /*String*/ ();
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _changeview(String _newview) throws Exception{
ResumableSub_ChangeView rsub = new ResumableSub_ChangeView(this,_newview);
rsub.resume(ba, null);
}
public static class ResumableSub_ChangeView extends BA.ResumableSub {
public ResumableSub_ChangeView(b4a.example.ef.as_datepicker parent,String _newview) {
this.parent = parent;
this._newview = _newview;
}
b4a.example.ef.as_datepicker parent;
String _newview;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1065;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,True)";
parent._xpnl_loadingpanel.SetVisibleAnimated((int) (250),parent.__c.True);
 //BA.debugLineNum = 1066;BA.debugLine="m_CurrentView = NewView";
parent._m_currentview = _newview;
 //BA.debugLineNum = 1067;BA.debugLine="xASVP_Main.Clear";
parent._xasvp_main._clear /*String*/ ();
 //BA.debugLineNum = 1068;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 //BA.debugLineNum = 1069;BA.debugLine="Select Case NewView";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_newview,parent._getcurrentview_monthview(),parent._getcurrentview_yearview(),parent._getcurrentview_decadeview(),parent._getcurrentview_centuryview())) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
case 2: {
this.state = 7;
if (true) break;
}
case 3: {
this.state = 9;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 10;
 //BA.debugLineNum = 1071;BA.debugLine="CreateMonthView";
parent._createmonthview();
 if (true) break;

case 5:
//C
this.state = 10;
 //BA.debugLineNum = 1073;BA.debugLine="CreateYearView";
parent._createyearview();
 if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 1075;BA.debugLine="CreateDecadeView";
parent._createdecadeview();
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1077;BA.debugLine="CreateCenturyView";
parent._createcenturyview();
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1079;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
parent._xpnl_loadingpanel.SetVisibleAnimated((int) (250),parent.__c.False);
 //BA.debugLineNum = 1080;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 130;BA.debugLine="Type ASDatePicker_MonthNameShort(January As Strin";
;
 //BA.debugLineNum = 131;BA.debugLine="Type ASDatePicker_WeekNameShort(Monday As String,";
;
 //BA.debugLineNum = 133;BA.debugLine="Type ASDatePicker_HeaderProperties(Height As Floa";
;
 //BA.debugLineNum = 134;BA.debugLine="Type ASDatePicker_BodyProperties(xFont As B4XFont";
;
 //BA.debugLineNum = 135;BA.debugLine="Type ASDatePicker_CustomDrawDay(BackgroundPanel A";
;
 //BA.debugLineNum = 136;BA.debugLine="Type ASDatePicker_CustomDrawHeader(BackgroundPane";
;
 //BA.debugLineNum = 137;BA.debugLine="Type ASDatePicker_WeekNumberProperties(Width As F";
;
 //BA.debugLineNum = 138;BA.debugLine="Type ASDatePicker_WeekNameProperties(Color As Int";
;
 //BA.debugLineNum = 140;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 141;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 142;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 143;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 144;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 146;BA.debugLine="Private m_isReady As Boolean = False";
_m_isready = __c.False;
 //BA.debugLineNum = 148;BA.debugLine="Private g_HeaderProperties As ASDatePicker_Header";
_g_headerproperties = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
 //BA.debugLineNum = 149;BA.debugLine="Private g_BodyProperties As ASDatePicker_BodyProp";
_g_bodyproperties = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
 //BA.debugLineNum = 151;BA.debugLine="Private g_MonthNameShort As ASDatePicker_MonthNam";
_g_monthnameshort = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
 //BA.debugLineNum = 152;BA.debugLine="Private g_WeekNameShort As ASDatePicker_WeekNameS";
_g_weeknameshort = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
 //BA.debugLineNum = 153;BA.debugLine="Private g_WeekNumberProperties As ASDatePicker_We";
_g_weeknumberproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
 //BA.debugLineNum = 154;BA.debugLine="Private g_WeekNameProperties As ASDatePicker_Week";
_g_weeknameproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
 //BA.debugLineNum = 156;BA.debugLine="Private xASVP_Main As ASViewPager";
_xasvp_main = new b4a.example.ef.asviewpager();
 //BA.debugLineNum = 158;BA.debugLine="Private xpnl_LoadingPanel As B4XView";
_xpnl_loadingpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 159;BA.debugLine="Private xpnl_Header As B4XView";
_xpnl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 160;BA.debugLine="Private xpnl_ViewPager As B4XView";
_xpnl_viewpager = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 161;BA.debugLine="Private xpnl_SelectedDate As B4XView";
_xpnl_selecteddate = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 162;BA.debugLine="Private xpnl_SelectedDate2 As B4XView";
_xpnl_selecteddate2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 167;BA.debugLine="Private m_HeaderColor As Int";
_m_headercolor = 0;
 //BA.debugLineNum = 168;BA.debugLine="Private m_BodyColor As Int";
_m_bodycolor = 0;
 //BA.debugLineNum = 169;BA.debugLine="Private m_CurrentDateColor As Int";
_m_currentdatecolor = 0;
 //BA.debugLineNum = 170;BA.debugLine="Private m_SelectedDateColor As Int";
_m_selecteddatecolor = 0;
 //BA.debugLineNum = 171;BA.debugLine="Private m_MouseHoverFeedback As Boolean 'Ignore";
_m_mousehoverfeedback = false;
 //BA.debugLineNum = 172;BA.debugLine="Private m_SelectedDate As Long";
_m_selecteddate = 0L;
 //BA.debugLineNum = 173;BA.debugLine="Private m_SelectedDate2 As Long";
_m_selecteddate2 = 0L;
 //BA.debugLineNum = 174;BA.debugLine="Private m_ShowWeekNumbers As Boolean";
_m_showweeknumbers = false;
 //BA.debugLineNum = 175;BA.debugLine="Private m_FirstDayOfWeek As Int = 5 'Monday";
_m_firstdayofweek = (int) (5);
 //BA.debugLineNum = 176;BA.debugLine="Private m_ShowGridLines As Boolean";
_m_showgridlines = false;
 //BA.debugLineNum = 177;BA.debugLine="Private m_GridLineColor As Int";
_m_gridlinecolor = 0;
 //BA.debugLineNum = 178;BA.debugLine="Private m_ThemeChangeTransition As String";
_m_themechangetransition = "";
 //BA.debugLineNum = 180;BA.debugLine="Private m_CurrentView As String";
_m_currentview = "";
 //BA.debugLineNum = 181;BA.debugLine="Private m_StartDate As Long";
_m_startdate = 0L;
 //BA.debugLineNum = 182;BA.debugLine="Private m_InactiveDaysVisible As Boolean";
_m_inactivedaysvisible = false;
 //BA.debugLineNum = 183;BA.debugLine="Private m_MinDate,m_MaxDate As Long";
_m_mindate = 0L;
_m_maxdate = 0L;
 //BA.debugLineNum = 184;BA.debugLine="Private m_SelectMode As String";
_m_selectmode = "";
 //BA.debugLineNum = 186;BA.debugLine="Private xiv_RefreshImage As B4XView";
_xiv_refreshimage = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 188;BA.debugLine="Type AS_DatePicker_Theme(SelectedTextColor As Int";
;
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _createasdatepicker_bodyproperties(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,int _selectedtextcolor,float _currentandselecteddayheight) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _t1 = null;
 //BA.debugLineNum = 1940;BA.debugLine="Public Sub CreateASDatePicker_BodyProperties (xFon";
 //BA.debugLineNum = 1941;BA.debugLine="Dim t1 As ASDatePicker_BodyProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
 //BA.debugLineNum = 1942;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 1943;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 1944;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 1945;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
_t1.SelectedTextColor /*int*/  = _selectedtextcolor;
 //BA.debugLineNum = 1946;BA.debugLine="t1.CurrentAndSelectedDayHeight = CurrentAndSelect";
_t1.CurrentAndSelectedDayHeight /*float*/  = _currentandselecteddayheight;
 //BA.debugLineNum = 1947;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 1948;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _createasdatepicker_headerproperties(float _height,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _buttoniconsize,boolean _arrowsvisible) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_headerproperties _t1 = null;
 //BA.debugLineNum = 1919;BA.debugLine="Public Sub CreateASDatePicker_HeaderProperties (He";
 //BA.debugLineNum = 1920;BA.debugLine="Dim t1 As ASDatePicker_HeaderProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
 //BA.debugLineNum = 1921;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 1922;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 1923;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 1924;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 1925;BA.debugLine="t1.ButtonIconSize = ButtonIconSize";
_t1.ButtonIconSize /*float*/  = _buttoniconsize;
 //BA.debugLineNum = 1926;BA.debugLine="t1.ArrowsVisible = ArrowsVisible";
_t1.ArrowsVisible /*boolean*/  = _arrowsvisible;
 //BA.debugLineNum = 1927;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 1928;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _createasdatepicker_monthnameshort(String _january,String _february,String _march,String _april,String _may,String _june,String _july,String _august,String _september,String _october,String _november,String _december) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _t1 = null;
 //BA.debugLineNum = 1877;BA.debugLine="Public Sub CreateASDatePicker_MonthNameShort (Janu";
 //BA.debugLineNum = 1878;BA.debugLine="Dim t1 As ASDatePicker_MonthNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
 //BA.debugLineNum = 1879;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 1880;BA.debugLine="t1.January = January";
_t1.January /*String*/  = _january;
 //BA.debugLineNum = 1881;BA.debugLine="t1.February = February";
_t1.February /*String*/  = _february;
 //BA.debugLineNum = 1882;BA.debugLine="t1.March = March";
_t1.March /*String*/  = _march;
 //BA.debugLineNum = 1883;BA.debugLine="t1.April = April";
_t1.April /*String*/  = _april;
 //BA.debugLineNum = 1884;BA.debugLine="t1.May = May";
_t1.May /*String*/  = _may;
 //BA.debugLineNum = 1885;BA.debugLine="t1.June = June";
_t1.June /*String*/  = _june;
 //BA.debugLineNum = 1886;BA.debugLine="t1.July = July";
_t1.July /*String*/  = _july;
 //BA.debugLineNum = 1887;BA.debugLine="t1.August = August";
_t1.August /*String*/  = _august;
 //BA.debugLineNum = 1888;BA.debugLine="t1.September = September";
_t1.September /*String*/  = _september;
 //BA.debugLineNum = 1889;BA.debugLine="t1.October = October";
_t1.October /*String*/  = _october;
 //BA.debugLineNum = 1890;BA.debugLine="t1.November = November";
_t1.November /*String*/  = _november;
 //BA.debugLineNum = 1891;BA.debugLine="t1.December = December";
_t1.December /*String*/  = _december;
 //BA.debugLineNum = 1892;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 1893;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _createasdatepicker_weeknameproperties(int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _height) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _t1 = null;
 //BA.debugLineNum = 1930;BA.debugLine="Public Sub CreateASDatePicker_WeekNameProperties (";
 //BA.debugLineNum = 1931;BA.debugLine="Dim t1 As ASDatePicker_WeekNameProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
 //BA.debugLineNum = 1932;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 1933;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
 //BA.debugLineNum = 1934;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 1935;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 1936;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 1937;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 1938;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _createasdatepicker_weeknameshort(String _monday,String _tuesday,String _wednesday,String _thursday,String _friday,String _saturday,String _sunday) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _t1 = null;
 //BA.debugLineNum = 1895;BA.debugLine="Public Sub CreateASDatePicker_WeekNameShort (Monda";
 //BA.debugLineNum = 1896;BA.debugLine="Dim t1 As ASDatePicker_WeekNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
 //BA.debugLineNum = 1897;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 1898;BA.debugLine="t1.Monday = Monday";
_t1.Monday /*String*/  = _monday;
 //BA.debugLineNum = 1899;BA.debugLine="t1.Tuesday = Tuesday";
_t1.Tuesday /*String*/  = _tuesday;
 //BA.debugLineNum = 1900;BA.debugLine="t1.Wednesday = Wednesday";
_t1.Wednesday /*String*/  = _wednesday;
 //BA.debugLineNum = 1901;BA.debugLine="t1.Thursday = Thursday";
_t1.Thursday /*String*/  = _thursday;
 //BA.debugLineNum = 1902;BA.debugLine="t1.Friday = Friday";
_t1.Friday /*String*/  = _friday;
 //BA.debugLineNum = 1903;BA.debugLine="t1.Saturday = Saturday";
_t1.Saturday /*String*/  = _saturday;
 //BA.debugLineNum = 1904;BA.debugLine="t1.Sunday = Sunday";
_t1.Sunday /*String*/  = _sunday;
 //BA.debugLineNum = 1905;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 1906;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _createasdatepicker_weeknumberproperties(float _width,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,String _text) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _t1 = null;
 //BA.debugLineNum = 1908;BA.debugLine="Public Sub CreateASDatePicker_WeekNumberProperties";
 //BA.debugLineNum = 1909;BA.debugLine="Dim t1 As ASDatePicker_WeekNumberProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
 //BA.debugLineNum = 1910;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 1911;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
 //BA.debugLineNum = 1912;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
 //BA.debugLineNum = 1913;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 1914;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 1915;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
 //BA.debugLineNum = 1916;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 1917;BA.debugLine="End Sub";
return null;
}
public void  _createcenturyview() throws Exception{
ResumableSub_CreateCenturyView rsub = new ResumableSub_CreateCenturyView(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateCenturyView extends BA.ResumableSub {
public ResumableSub_CreateCenturyView(b4a.example.ef.as_datepicker parent) {
this.parent = parent;
}
b4a.example.ef.as_datepicker parent;
long _currentcenturystart = 0L;
b4a.example.dateutils._period _p = null;
long _firstdateofpast = 0L;
int _startindex = 0;
int _numberofcentries = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
long _currenttime = 0L;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 805;BA.debugLine="Dim CurrentCenturyStart As Long = DateUtils.SetDa";
_currentcenturystart = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_startdate)-parent.__c.Round(((parent.__c.DateTime.GetYear(parent._m_startdate)/(double)100)-((int) ((parent.__c.DateTime.GetYear(parent._m_startdate)/(double)100))))*100)),(int) (1),(int) (1));
 //BA.debugLineNum = 808;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
 //BA.debugLineNum = 809;BA.debugLine="p.Initialize";
_p.Initialize();
 //BA.debugLineNum = 811;BA.debugLine="Dim FirstDateOfPast As Long = DateUtils.SetDate(1";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (1),(int) (1),(int) (1));
 //BA.debugLineNum = 813;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._m_mindate>0 || parent._m_maxdate>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 814;BA.debugLine="If m_MinDate > 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._m_mindate>0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 815;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_mindate)-40),(int) (1),(int) (1));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 817;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_maxdate)-40),(int) (1),(int) (1));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 834;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
 //BA.debugLineNum = 840;BA.debugLine="Dim NumberOfCentries As Int = 80";
_numberofcentries = (int) (80);
 //BA.debugLineNum = 841;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then NumberOfCe";
if (true) break;

case 11:
//if
this.state = 16;
if (parent._m_mindate>0 || parent._m_maxdate>0) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
_numberofcentries = (int) (1);
if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 843;BA.debugLine="For i = 0 To NumberOfCentries -1";
if (true) break;

case 17:
//for
this.state = 34;
step15 = 1;
limit15 = (int) (_numberofcentries-1);
_i = (int) (0) ;
this.state = 35;
if (true) break;

case 35:
//C
this.state = 34;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 19;
if (true) break;

case 36:
//C
this.state = 35;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 845;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 846;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 847;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._xpnl_viewpager.getWidth(),parent._xpnl_viewpager.getHeight());
 //BA.debugLineNum = 849;BA.debugLine="p.Years = i*10*12";
_p.Years = (int) (_i*10*12);
 //BA.debugLineNum = 850;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(Fi";
_currenttime = parent._dateutils._addperiod(ba,_firstdateofpast,_p);
 //BA.debugLineNum = 851;BA.debugLine="If i > 0 Then";
if (true) break;

case 20:
//if
this.state = 27;
if (_i>0) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 852;BA.debugLine="CurrentTime = DateUtils.SetDate((DateTime.GetYe";
_currenttime = parent._dateutils._setdate(ba,(int) ((parent.__c.DateTime.GetYear(_currenttime)-parent.__c.Round(((parent.__c.DateTime.GetYear(_currenttime)/(double)100)-((int) ((parent.__c.DateTime.GetYear(_currenttime)/(double)100))))*100))+1),(int) (1),(int) (1));
 //BA.debugLineNum = 853;BA.debugLine="If DateTime.GetMonth(CurrentTime) = 1 Then";
if (true) break;

case 23:
//if
this.state = 26;
if (parent.__c.DateTime.GetMonth(_currenttime)==1) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 //BA.debugLineNum = 854;BA.debugLine="CurrentTime = DateUtils.SetDate(DateTime.GetYe";
_currenttime = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(_currenttime)-parent.__c.Round(((parent.__c.DateTime.GetYear(_currenttime)/(double)100)-((int) ((parent.__c.DateTime.GetYear(_currenttime)/(double)100))))*100)),(int) (1),(int) (1));
 if (true) break;

case 26:
//C
this.state = 27;
;
 if (true) break;

case 27:
//C
this.state = 28;
;
 //BA.debugLineNum = 859;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
parent._xasvp_main._addpage /*String*/ (_xpnl_background,(Object)(_currenttime));
 //BA.debugLineNum = 861;BA.debugLine="If DateTime.GetYear(CurrentCenturyStart) = DateT";
if (true) break;

case 28:
//if
this.state = 33;
if (parent.__c.DateTime.GetYear(_currentcenturystart)==parent.__c.DateTime.GetYear(_currenttime)) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
_startindex = _i;
if (true) break;

case 33:
//C
this.state = 36;
;
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
;
 //BA.debugLineNum = 867;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 37;
return;
case 37:
//C
this.state = -1;
;
 //BA.debugLineNum = 868;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
parent._xasvp_main._setcurrentindex2(_startindex);
 //BA.debugLineNum = 869;BA.debugLine="xASVP_Main.Commit";
parent._xasvp_main._commit /*String*/ ();
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _createdecadeview() throws Exception{
ResumableSub_CreateDecadeView rsub = new ResumableSub_CreateDecadeView(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateDecadeView extends BA.ResumableSub {
public ResumableSub_CreateDecadeView(b4a.example.ef.as_datepicker parent) {
this.parent = parent;
}
b4a.example.ef.as_datepicker parent;
long _currentdecade = 0L;
int _yeargap = 0;
long _startdate = 0L;
long _firstdateoffuture = 0L;
int _numberofdecades = 0;
int _startindex = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
b4a.example.dateutils._period _p2 = null;
long _currenttime = 0L;
int step17;
int limit17;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 748;BA.debugLine="Dim CurrentDecade As Long = DateUtils.SetDate(Dat";
_currentdecade = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(parent._m_startdate),(int) (1),(int) (1))),(int) (1),(int) (1));
 //BA.debugLineNum = 750;BA.debugLine="Dim YearGap As Int = 50";
_yeargap = (int) (50);
 //BA.debugLineNum = 752;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
 //BA.debugLineNum = 753;BA.debugLine="If m_MinDate = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._m_mindate==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 754;BA.debugLine="StartDate =	DateUtils.SetDate(1400,12,31)";
_startdate = parent._dateutils._setdate(ba,(int) (1400),(int) (12),(int) (31));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 756;BA.debugLine="StartDate =	m_MinDate";
_startdate = parent._m_mindate;
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 759;BA.debugLine="Dim FirstDateOfFuture As Long";
_firstdateoffuture = 0L;
 //BA.debugLineNum = 760;BA.debugLine="If m_MaxDate = 0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._m_maxdate==0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 761;BA.debugLine="FirstDateOfFuture = DateUtils.SetDate(DateTime.G";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_startdate)+_yeargap),(int) (12),(int) (31));
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 763;BA.debugLine="FirstDateOfFuture = m_MaxDate";
_firstdateoffuture = parent._m_maxdate;
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 767;BA.debugLine="Dim NumberOfDecades As Int = Ceil(Max((MonthBetwe";
_numberofdecades = (int) (parent.__c.Ceil(parent.__c.Max((parent._monthbetween(_startdate,_firstdateoffuture)/(double)12)/(double)10,1)));
 //BA.debugLineNum = 769;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
 //BA.debugLineNum = 775;BA.debugLine="For i = 0 To NumberOfDecades -1";
if (true) break;

case 13:
//for
this.state = 28;
step17 = 1;
limit17 = (int) (_numberofdecades-1);
_i = (int) (0) ;
this.state = 29;
if (true) break;

case 29:
//C
this.state = 28;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 15;
if (true) break;

case 30:
//C
this.state = 29;
_i = ((int)(0 + _i + step17)) ;
if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 777;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 778;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 779;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._xpnl_viewpager.getWidth(),parent._xpnl_viewpager.getHeight());
 //BA.debugLineNum = 781;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
 //BA.debugLineNum = 782;BA.debugLine="p2.Initialize";
_p2.Initialize();
 //BA.debugLineNum = 783;BA.debugLine="p2.Years = i*10";
_p2.Years = (int) (_i*10);
 //BA.debugLineNum = 785;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
 //BA.debugLineNum = 788;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
parent._xasvp_main._addpage /*String*/ (_xpnl_background,(Object)(_currenttime));
 //BA.debugLineNum = 790;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
if (true) break;

case 16:
//if
this.state = 21;
if (parent.__c.DateTime.GetYear(_currentdecade)>=parent.__c.DateTime.GetYear(_currenttime) && parent.__c.DateTime.GetYear(_currentdecade)<=(parent.__c.DateTime.GetYear(_currenttime)+11)) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
_startindex = _i;
if (true) break;

case 21:
//C
this.state = 22;
;
 //BA.debugLineNum = 792;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
if (true) break;

case 22:
//if
this.state = 27;
if (parent.__c.DateTime.GetYear(_currentdecade)>=parent.__c.DateTime.GetYear(_currenttime)) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
_startindex = _i;
if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 796;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 31;
return;
case 31:
//C
this.state = -1;
;
 //BA.debugLineNum = 797;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
parent._xasvp_main._setcurrentindex2(_startindex);
 //BA.debugLineNum = 798;BA.debugLine="xASVP_Main.Commit";
parent._xasvp_main._commit /*String*/ ();
 //BA.debugLineNum = 800;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _createheader() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowleft = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowright = null;
 //BA.debugLineNum = 393;BA.debugLine="Private Sub CreateHeader";
 //BA.debugLineNum = 395;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
_xpnl_header.setColor(_m_headercolor);
 //BA.debugLineNum = 397;BA.debugLine="Dim xlbl_Header As B4XView = CreateLabel(\"xlbl_He";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = _createlabel("xlbl_Header");
 //BA.debugLineNum = 398;BA.debugLine="xpnl_Header.AddView(xlbl_Header,xpnl_Header.Heigh";
_xpnl_header.AddView((android.view.View)(_xlbl_header.getObject()),_xpnl_header.getHeight(),(int) (0),(int) (_mbase.getWidth()-_xpnl_header.getHeight()*2),_xpnl_header.getHeight());
 //BA.debugLineNum = 400;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = CreateLabel(\"xlbl";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = _createlabel("xlbl_HeaderArrowLeft");
 //BA.debugLineNum = 401;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowLeft,0,0,xpnl_Heade";
_xpnl_header.AddView((android.view.View)(_xlbl_arrowleft.getObject()),(int) (0),(int) (0),_xpnl_header.getHeight(),_xpnl_header.getHeight());
 //BA.debugLineNum = 403;BA.debugLine="Dim xlbl_ArrowRight As B4XView = CreateLabel(\"xlb";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = _createlabel("xlbl_HeaderArrowRight");
 //BA.debugLineNum = 404;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowRight,xpnl_Header.W";
_xpnl_header.AddView((android.view.View)(_xlbl_arrowright.getObject()),(int) (_xpnl_header.getWidth()-_xpnl_header.getHeight()),(int) (0),_xpnl_header.getHeight(),_xpnl_header.getHeight());
 //BA.debugLineNum = 406;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(_xui.CreateMaterialIcons(_g_headerproperties.ButtonIconSize /*float*/ ));
 //BA.debugLineNum = 407;BA.debugLine="xlbl_ArrowLeft.Text = Chr(0xE314)";
_xlbl_arrowleft.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe314))));
 //BA.debugLineNum = 408;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(_g_headerproperties.TextColor /*int*/ );
 //BA.debugLineNum = 409;BA.debugLine="xlbl_ArrowLeft.SetTextAlignment(\"CENTER\",\"CENTER\"";
_xlbl_arrowleft.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 410;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(_g_headerproperties.ArrowsVisible /*boolean*/ );
 //BA.debugLineNum = 412;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(_xui.CreateMaterialIcons(_g_headerproperties.ButtonIconSize /*float*/ ));
 //BA.debugLineNum = 413;BA.debugLine="xlbl_ArrowRight.Text = Chr(0xE315)";
_xlbl_arrowright.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe315))));
 //BA.debugLineNum = 414;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(_g_headerproperties.TextColor /*int*/ );
 //BA.debugLineNum = 415;BA.debugLine="xlbl_ArrowRight.SetTextAlignment(\"CENTER\",\"CENTER";
_xlbl_arrowright.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 416;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(_g_headerproperties.ArrowsVisible /*boolean*/ );
 //BA.debugLineNum = 418;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(_g_headerproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 419;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(m_Start";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,_m_startdate)+" "+BA.NumberToString(__c.DateTime.GetYear(_m_startdate))));
 //BA.debugLineNum = 420;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(_g_headerproperties.TextColor /*int*/ );
 //BA.debugLineNum = 421;BA.debugLine="xlbl_Header.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_header.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(String _eventname) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 1866;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
 //BA.debugLineNum = 1867;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 1868;BA.debugLine="iv.Initialize(EventName)";
_iv.Initialize(ba,_eventname);
 //BA.debugLineNum = 1869;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 1870;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(String _eventname) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 1777;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
 //BA.debugLineNum = 1778;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1779;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
 //BA.debugLineNum = 1780;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 1781;BA.debugLine="End Sub";
return null;
}
public void  _createmonthview() throws Exception{
ResumableSub_CreateMonthView rsub = new ResumableSub_CreateMonthView(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateMonthView extends BA.ResumableSub {
public ResumableSub_CreateMonthView(b4a.example.ef.as_datepicker parent) {
this.parent = parent;
}
b4a.example.ef.as_datepicker parent;
int _startindex = 0;
int _yeargap = 0;
long _startdate = 0L;
long _enddate = 0L;
int _numberofmonths = 0;
int _monthsbetween = 0;
b4a.example.dateutils._period _tmp = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
b4a.example.dateutils._period _p2 = null;
long _currenttime = 0L;
long _firstdayofmonth = 0L;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 546;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
 //BA.debugLineNum = 547;BA.debugLine="Dim YearGap As Int = 1";
_yeargap = (int) (1);
 //BA.debugLineNum = 548;BA.debugLine="Dim StartDate As Long = DateUtils.SetDate(DateTim";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_startdate)-_yeargap),parent.__c.DateTime.GetMonth(parent._m_startdate),(int) (1));
 //BA.debugLineNum = 549;BA.debugLine="Dim Enddate As Long = DateUtils.SetDate(DateTime.";
_enddate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_startdate)+_yeargap),parent.__c.DateTime.GetMonth(parent._m_startdate),(int) (1));
 //BA.debugLineNum = 551;BA.debugLine="If m_MinDate > 0 Then StartDate = m_MinDate";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._m_mindate>0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_startdate = parent._m_mindate;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 552;BA.debugLine="Dim NumberOfMonths As Int = IIf(m_MaxDate=0, Mont";
_numberofmonths = (int)(BA.ObjectToNumber(((parent._m_maxdate==0) ? ((Object)(parent._monthbetween(_startdate,_enddate))) : ((Object)(0)))));
 //BA.debugLineNum = 554;BA.debugLine="If m_MaxDate > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (parent._m_maxdate>0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 555;BA.debugLine="Dim MonthsBetween As Int = MonthBetween(StartDat";
_monthsbetween = parent._monthbetween(_startdate,parent._m_maxdate);
 //BA.debugLineNum = 556;BA.debugLine="Dim tmp As Period";
_tmp = new b4a.example.dateutils._period();
 //BA.debugLineNum = 557;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
 //BA.debugLineNum = 558;BA.debugLine="tmp.Months = MonthsBetween";
_tmp.Months = _monthsbetween;
 //BA.debugLineNum = 559;BA.debugLine="If DateUtils.AddPeriod(StartDate,tmp) < m_MaxDat";
if (true) break;

case 10:
//if
this.state = 15;
if (parent._dateutils._addperiod(ba,_startdate,_tmp)<parent._m_maxdate) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
_monthsbetween = (int) (_monthsbetween+1);
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 560;BA.debugLine="NumberOfMonths = Max(MonthsBetween,1)";
_numberofmonths = (int) (parent.__c.Max(_monthsbetween,1));
 if (true) break;
;
 //BA.debugLineNum = 563;BA.debugLine="For i = 0 To NumberOfMonths -1";

case 16:
//for
this.state = 25;
step15 = 1;
limit15 = (int) (_numberofmonths-1);
_i = (int) (0) ;
this.state = 26;
if (true) break;

case 26:
//C
this.state = 25;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 18;
if (true) break;

case 27:
//C
this.state = 26;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 565;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 566;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 567;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._xpnl_viewpager.getWidth(),parent._xpnl_viewpager.getHeight());
 //BA.debugLineNum = 569;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
 //BA.debugLineNum = 570;BA.debugLine="p2.Initialize";
_p2.Initialize();
 //BA.debugLineNum = 571;BA.debugLine="p2.Months = i";
_p2.Months = _i;
 //BA.debugLineNum = 573;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
 //BA.debugLineNum = 574;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate(";
_firstdayofmonth = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(_currenttime),parent.__c.DateTime.GetMonth(_currenttime),(int) (1));
 //BA.debugLineNum = 576;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfMon";
parent._xasvp_main._addpage /*String*/ (_xpnl_background,(Object)(_firstdayofmonth));
 //BA.debugLineNum = 578;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
if (true) break;

case 19:
//if
this.state = 24;
if (parent.__c.DateTime.GetYear(parent._m_startdate)==parent.__c.DateTime.GetYear(_currenttime) && parent.__c.DateTime.GetMonth(parent._m_startdate)==parent.__c.DateTime.GetMonth(_currenttime)) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_startindex = _i;
if (true) break;

case 24:
//C
this.state = 27;
;
 if (true) break;
if (true) break;

case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 584;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = -1;
;
 //BA.debugLineNum = 589;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
parent._xasvp_main._setcurrentindex2(_startindex);
 //BA.debugLineNum = 590;BA.debugLine="xASVP_Main.Commit";
parent._xasvp_main._commit /*String*/ ();
 //BA.debugLineNum = 592;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
 //BA.debugLineNum = 593;BA.debugLine="m_isReady = True";
parent._m_isready = parent.__c.True;
 //BA.debugLineNum = 676;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _createselectdates(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_date,int[] _clr) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
long _currentday = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
 //BA.debugLineNum = 1123;BA.debugLine="Private Sub CreateSelectDates(xpnl_Date As B4XView";
 //BA.debugLineNum = 1125;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1126;BA.debugLine="For Each View As B4XView In xpnl_Date.GetAllViews";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _xpnl_date.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
 //BA.debugLineNum = 1127;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
 //BA.debugLineNum = 1129;BA.debugLine="Dim CurrentDay As Long = xpnl_Date.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_date.getTag());
 //BA.debugLineNum = 1131;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((_m_selectmode).equals("Range")) { 
 //BA.debugLineNum = 1132;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,_m_selecteddate) && _xlbl_date.getVisible()) { 
 //BA.debugLineNum = 1133;BA.debugLine="CreateSelectedDate(xpnl_Date,True)";
_createselecteddate(_xpnl_date,__c.True);
 }else if(_dateutils._issameday(ba,_currentday,_m_selecteddate2) && _xlbl_date.getVisible()) { 
 //BA.debugLineNum = 1135;BA.debugLine="CreateSelectedDate(xpnl_Date,False)";
_createselecteddate(_xpnl_date,__c.False);
 };
 //BA.debugLineNum = 1138;BA.debugLine="For Each v As B4XView In xpnl_Date.GetAllViewsRe";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = _xpnl_date.GetAllViewsRecursive();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group12.Get(index12)));
 //BA.debugLineNum = 1139;BA.debugLine="If \"RangeItem\" = v.Tag Then";
if (("RangeItem").equals(BA.ObjectToString(_v.getTag()))) { 
 //BA.debugLineNum = 1140;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
 //BA.debugLineNum = 1141;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 1145;BA.debugLine="If m_SelectedDate > 0 And m_SelectedDate2 > 0 An";
if (_m_selecteddate>0 && _m_selecteddate2>0 && ((_currentday>=_m_selecteddate && _currentday<=_m_selecteddate2) || (_dateutils._issameday(ba,_currentday,_m_selecteddate) || _dateutils._issameday(ba,_currentday,_m_selecteddate2)))) { 
 //BA.debugLineNum = 1146;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 1147;BA.debugLine="xpnl_selected.Tag = \"RangeItem\"";
_xpnl_selected.setTag((Object)("RangeItem"));
 //BA.debugLineNum = 1148;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDat";
if (_dateutils._issameday(ba,_currentday,_m_selecteddate)) { 
 //BA.debugLineNum = 1149;BA.debugLine="xpnl_Date.AddView(xpnl_selected,xpnl_Date.Widt";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_date.getWidth()/(double)2),(int) (_xpnl_date.getHeight()/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ));
 }else if(_dateutils._issameday(ba,_currentday,_m_selecteddate2)) { 
 //BA.debugLineNum = 1151;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ));
 }else {
 //BA.debugLineNum = 1153;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),_xpnl_date.getWidth(),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ));
 };
 //BA.debugLineNum = 1156;BA.debugLine="xpnl_selected.Color = xui.Color_ARGB(80,clr(1),";
_xpnl_selected.setColor(_xui.Color_ARGB((int) (80),_clr[(int) (1)],_clr[(int) (2)],_clr[(int) (3)]));
 //BA.debugLineNum = 1157;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 };
 }else {
 //BA.debugLineNum = 1161;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,_m_selecteddate) && _xlbl_date.getVisible()==__c.True) { 
 //BA.debugLineNum = 1162;BA.debugLine="MonthDateClick(xpnl_Date,False)";
_monthdateclick(_xpnl_date,__c.False);
 };
 };
 //BA.debugLineNum = 1167;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate)";
if (_dateutils._issameday(ba,_currentday,_m_selecteddate) || ((_m_selectmode).equals(_getselectmode_range()) && _dateutils._issameday(ba,_currentday,_m_selecteddate2))) { 
 //BA.debugLineNum = 1168;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedT";
_xlbl_date.setTextColor(_g_bodyproperties.SelectedTextColor /*int*/ );
 }else {
 //BA.debugLineNum = 1170;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(_g_bodyproperties.TextColor /*int*/ );
 };
 //BA.debugLineNum = 1174;BA.debugLine="End Sub";
return "";
}
public String  _createselecteddate(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _firstdatepanel) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
 //BA.debugLineNum = 1733;BA.debugLine="Private Sub CreateSelectedDate(xpnl_MonthDate As B";
 //BA.debugLineNum = 1735;BA.debugLine="If FirstDatePanel Then";
if (_firstdatepanel) { 
 //BA.debugLineNum = 1736;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedDa";
if (_xpnl_selecteddate!= null && _xpnl_selecteddate.IsInitialized() && _xpnl_selecteddate.getParent().IsInitialized()) { 
 //BA.debugLineNum = 1737;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate.P";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = _xpnl_selecteddate.getParent().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
 //BA.debugLineNum = 1738;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(_g_bodyproperties.TextColor /*int*/ );};
 }
};
 //BA.debugLineNum = 1740;BA.debugLine="xpnl_SelectedDate.RemoveViewFromParent";
_xpnl_selecteddate.RemoveViewFromParent();
 };
 //BA.debugLineNum = 1742;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 1743;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ));
 //BA.debugLineNum = 1744;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(_m_selecteddatecolor,(int) (0),(int) (0),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2));
 //BA.debugLineNum = 1745;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 //BA.debugLineNum = 1746;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
_xpnl_selecteddate = _xpnl_selected;
 //BA.debugLineNum = 1747;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
_m_selecteddate = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 }else {
 //BA.debugLineNum = 1749;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_SelectedD";
if (_xpnl_selecteddate2!= null && _xpnl_selecteddate2.IsInitialized() && _xpnl_selecteddate2.getParent().IsInitialized()) { 
 //BA.debugLineNum = 1750;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate2.";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group16 = _xpnl_selecteddate2.getParent().GetAllViewsRecursive();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group16.Get(index16)));
 //BA.debugLineNum = 1751;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(_g_bodyproperties.TextColor /*int*/ );};
 }
};
 //BA.debugLineNum = 1753;BA.debugLine="xpnl_SelectedDate2.RemoveViewFromParent";
_xpnl_selecteddate2.RemoveViewFromParent();
 };
 //BA.debugLineNum = 1755;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 1756;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ ));
 //BA.debugLineNum = 1757;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(_m_selecteddatecolor,(int) (0),(int) (0),(int) (_g_bodyproperties.CurrentAndSelectedDayHeight /*float*/ /(double)2));
 //BA.debugLineNum = 1758;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 //BA.debugLineNum = 1759;BA.debugLine="xpnl_SelectedDate2 = xpnl_selected";
_xpnl_selecteddate2 = _xpnl_selected;
 };
 //BA.debugLineNum = 1762;BA.debugLine="End Sub";
return "";
}
public void  _createyearview() throws Exception{
ResumableSub_CreateYearView rsub = new ResumableSub_CreateYearView(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateYearView extends BA.ResumableSub {
public ResumableSub_CreateYearView(b4a.example.ef.as_datepicker parent) {
this.parent = parent;
}
b4a.example.ef.as_datepicker parent;
int _yeargap = 0;
long _startdate = 0L;
long _firstdateoffuture = 0L;
int _numberofyears = 0;
int _yearsbetween = 0;
int _startindex = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
b4a.example.dateutils._period _p2 = null;
long _currenttime = 0L;
int step17;
int limit17;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 680;BA.debugLine="Dim YearGap As Int = 10";
_yeargap = (int) (10);
 //BA.debugLineNum = 682;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
 //BA.debugLineNum = 683;BA.debugLine="If m_MinDate = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._m_mindate==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 684;BA.debugLine="StartDate =	DateUtils.SetDate(DateTime.GetYear(m";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_startdate)-_yeargap),(int) (1),(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 686;BA.debugLine="StartDate =	m_MinDate";
_startdate = parent._m_mindate;
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 689;BA.debugLine="Dim FirstDateOfFuture As Long = DateUtils.SetDate";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(parent._m_startdate)+_yeargap),(int) (12),(int) (31));
 //BA.debugLineNum = 691;BA.debugLine="Dim NumberOfYears As Int";
_numberofyears = 0;
 //BA.debugLineNum = 693;BA.debugLine="If m_MaxDate = 0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._m_maxdate==0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 694;BA.debugLine="NumberOfYears = MonthBetween(StartDate,FirstDate";
_numberofyears = (int) (parent._monthbetween(_startdate,_firstdateoffuture)/(double)12);
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 696;BA.debugLine="Dim YearsBetween As Int = Ceil(MonthBetween(Star";
_yearsbetween = (int) (parent.__c.Ceil(parent._monthbetween(_startdate,parent._m_maxdate)/(double)12));
 //BA.debugLineNum = 697;BA.debugLine="NumberOfYears = Max(YearsBetween,1)";
_numberofyears = (int) (parent.__c.Max(_yearsbetween,1));
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 700;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
 //BA.debugLineNum = 706;BA.debugLine="For i = 0 To NumberOfYears -1";
if (true) break;

case 13:
//for
this.state = 22;
step17 = 1;
limit17 = (int) (_numberofyears-1);
_i = (int) (0) ;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 22;
if ((step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17)) this.state = 15;
if (true) break;

case 24:
//C
this.state = 23;
_i = ((int)(0 + _i + step17)) ;
if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 708;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 709;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 710;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._xpnl_viewpager.getWidth(),parent._xpnl_viewpager.getHeight());
 //BA.debugLineNum = 712;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
 //BA.debugLineNum = 713;BA.debugLine="p2.Initialize";
_p2.Initialize();
 //BA.debugLineNum = 714;BA.debugLine="p2.Years = i";
_p2.Years = _i;
 //BA.debugLineNum = 716;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
 //BA.debugLineNum = 719;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
parent._xasvp_main._addpage /*String*/ (_xpnl_background,(Object)(_currenttime));
 //BA.debugLineNum = 721;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
if (true) break;

case 16:
//if
this.state = 21;
if (parent.__c.DateTime.GetYear(parent._m_startdate)==parent.__c.DateTime.GetYear(_currenttime)) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
_startindex = _i;
if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 22:
//C
this.state = -1;
;
 //BA.debugLineNum = 727;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
 //BA.debugLineNum = 737;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
parent._xasvp_main._setcurrentindex2(_startindex);
 //BA.debugLineNum = 738;BA.debugLine="xASVP_Main.Commit";
parent._xasvp_main._commit /*String*/ ();
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _customdrawday(long _date,anywheresoftware.b4a.objects.B4XViewWrapper _backgroundpanel) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_customdrawday _m_customdrawday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
 //BA.debugLineNum = 1500;BA.debugLine="Private Sub CustomDrawDay(Date As Long,BackgroundP";
 //BA.debugLineNum = 1501;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (_xui.SubExists(ba,_mcallback,_meventname+"_CustomDrawDay",(int) (2))) { 
 //BA.debugLineNum = 1503;BA.debugLine="Dim m_CustomDrawDay As ASDatePicker_CustomDrawDa";
_m_customdrawday = new b4a.example.ef.as_datepicker._asdatepicker_customdrawday();
 //BA.debugLineNum = 1504;BA.debugLine="m_CustomDrawDay.Initialize";
_m_customdrawday.Initialize();
 //BA.debugLineNum = 1505;BA.debugLine="m_CustomDrawDay.BackgroundPanel = BackgroundPane";
_m_customdrawday.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _backgroundpanel;
 //BA.debugLineNum = 1507;BA.debugLine="For Each View As B4XView In BackgroundPanel.GetA";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _backgroundpanel.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
 //BA.debugLineNum = 1509;BA.debugLine="If \"xlbl_Date\" = View.Tag Then";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
 //BA.debugLineNum = 1510;BA.debugLine="m_CustomDrawDay.xlbl_Date = View";
_m_customdrawday.xlbl_Date /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
 };
 }
};
 //BA.debugLineNum = 1515;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawDay";
__c.CallSubNew3(ba,_mcallback,_meventname+"_CustomDrawDay",(Object)(_date),(Object)(_m_customdrawday));
 };
 //BA.debugLineNum = 1517;BA.debugLine="End Sub";
return "";
}
public String  _customdrawheader(long _date) throws Exception{
b4a.example.ef.as_datepicker._asdatepicker_customdrawheader _m_customdrawheader = null;
 //BA.debugLineNum = 1474;BA.debugLine="Private Sub CustomDrawHeader(date As Long)";
 //BA.debugLineNum = 1475;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (_xui.SubExists(ba,_mcallback,_meventname+"_CustomDrawHeader",(int) (2))) { 
 //BA.debugLineNum = 1477;BA.debugLine="Dim m_CustomDrawHeader As ASDatePicker_CustomDra";
_m_customdrawheader = new b4a.example.ef.as_datepicker._asdatepicker_customdrawheader();
 //BA.debugLineNum = 1478;BA.debugLine="m_CustomDrawHeader.Initialize";
_m_customdrawheader.Initialize();
 //BA.debugLineNum = 1479;BA.debugLine="m_CustomDrawHeader.BackgroundPanel = xpnl_Header";
_m_customdrawheader.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_header;
 //BA.debugLineNum = 1480;BA.debugLine="m_CustomDrawHeader.xlbl_Text = xpnl_Header.GetVi";
_m_customdrawheader.xlbl_Text /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_header.GetView((int) (0));
 //BA.debugLineNum = 1481;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowLeft = xpnl_Header.";
_m_customdrawheader.xlbl_ArrowLeft /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_header.GetView((int) (1));
 //BA.debugLineNum = 1482;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowRight = xpnl_Header";
_m_customdrawheader.xlbl_ArrowRight /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_header.GetView((int) (2));
 //BA.debugLineNum = 1484;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawHea";
__c.CallSubNew3(ba,_mcallback,_meventname+"_CustomDrawHeader",(Object)(_date),(Object)(_m_customdrawheader));
 };
 //BA.debugLineNum = 1486;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 279;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 280;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 281;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 282;BA.debugLine="IniProps(Props)";
_iniprops(_props);
 //BA.debugLineNum = 283;BA.debugLine="m_StartDate = DateTime.Now";
_m_startdate = __c.DateTime.getNow();
 //BA.debugLineNum = 286;BA.debugLine="xpnl_LoadingPanel = xui.CreatePanel(\"\")";
_xpnl_loadingpanel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 287;BA.debugLine="xpnl_LoadingPanel.Visible = True";
_xpnl_loadingpanel.setVisible(__c.True);
 //BA.debugLineNum = 288;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
_xpnl_loadingpanel.setColor(_m_bodycolor);
 //BA.debugLineNum = 289;BA.debugLine="mBase.AddView(xpnl_LoadingPanel,0,0,mBase.Width,m";
_mbase.AddView((android.view.View)(_xpnl_loadingpanel.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 291;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
_xpnl_header = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 292;BA.debugLine="mBase.AddView(xpnl_Header,0,0,mBase.Width,g_Heade";
_mbase.AddView((android.view.View)(_xpnl_header.getObject()),(int) (0),(int) (0),_mbase.getWidth(),(int) (_g_headerproperties.Height /*float*/ ));
 //BA.debugLineNum = 294;BA.debugLine="xpnl_ViewPager = xui.CreatePanel(\"\")";
_xpnl_viewpager = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 295;BA.debugLine="mBase.AddView(xpnl_ViewPager,0,g_HeaderProperties";
_mbase.AddView((android.view.View)(_xpnl_viewpager.getObject()),(int) (0),(int) (_g_headerproperties.Height /*float*/ ),_mbase.getWidth(),(int) (_mbase.getHeight()-_g_headerproperties.Height /*float*/ ));
 //BA.debugLineNum = 297;BA.debugLine="ini_viewpager";
_ini_viewpager();
 //BA.debugLineNum = 298;BA.debugLine="CreateHeader";
_createheader();
 //BA.debugLineNum = 299;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if ((_m_selectmode).equals("Date") || (_m_selectmode).equals("Range")) { 
 //BA.debugLineNum = 300;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
_m_currentview = _getcurrentview_monthview();
 //BA.debugLineNum = 301;BA.debugLine="CreateMonthView";
_createmonthview();
 }else if((_m_selectmode).equals("Month")) { 
 //BA.debugLineNum = 303;BA.debugLine="m_CurrentView = getCurrentView_YearView";
_m_currentview = _getcurrentview_yearview();
 //BA.debugLineNum = 304;BA.debugLine="CreateYearView";
_createyearview();
 };
 //BA.debugLineNum = 307;BA.debugLine="xiv_RefreshImage = CreateImageView(\"\")";
_xiv_refreshimage = _createimageview("");
 //BA.debugLineNum = 308;BA.debugLine="xiv_RefreshImage.Visible = False";
_xiv_refreshimage.setVisible(__c.False);
 //BA.debugLineNum = 309;BA.debugLine="mBase.AddView(xiv_RefreshImage,0,0,mBase.Width,mB";
_mbase.AddView((android.view.View)(_xiv_refreshimage.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 312;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 315;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
_xpnl_loadingpanel.SetVisibleAnimated((int) (250),__c.False);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return "";
}
public int[]  _getargb(int _color) throws Exception{
int[] _res = null;
 //BA.debugLineNum = 1768;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()";
 //BA.debugLineNum = 1769;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
 //BA.debugLineNum = 1770;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
 //BA.debugLineNum = 1771;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
 //BA.debugLineNum = 1772;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
 //BA.debugLineNum = 1773;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
 //BA.debugLineNum = 1774;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 1775;BA.debugLine="End Sub";
return null;
}
public int  _getbodycolor() throws Exception{
 //BA.debugLineNum = 1311;BA.debugLine="Public Sub getBodyColor As Int";
 //BA.debugLineNum = 1312;BA.debugLine="Return m_BodyColor";
if (true) return _m_bodycolor;
 //BA.debugLineNum = 1313;BA.debugLine="End Sub";
return 0;
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _getbodyproperties() throws Exception{
 //BA.debugLineNum = 1395;BA.debugLine="Public Sub getBodyProperties As ASDatePicker_BodyP";
 //BA.debugLineNum = 1396;BA.debugLine="Return g_BodyProperties";
if (true) return _g_bodyproperties;
 //BA.debugLineNum = 1397;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentdatecolor() throws Exception{
 //BA.debugLineNum = 1322;BA.debugLine="Public Sub getCurrentDateColor As Int";
 //BA.debugLineNum = 1323;BA.debugLine="Return m_CurrentDateColor";
if (true) return _m_currentdatecolor;
 //BA.debugLineNum = 1324;BA.debugLine="End Sub";
return 0;
}
public String  _getcurrentview() throws Exception{
 //BA.debugLineNum = 1434;BA.debugLine="Public Sub getCurrentView As String";
 //BA.debugLineNum = 1435;BA.debugLine="Return m_CurrentView";
if (true) return _m_currentview;
 //BA.debugLineNum = 1436;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_centuryview() throws Exception{
 //BA.debugLineNum = 1454;BA.debugLine="Public Sub getCurrentView_CenturyView As String";
 //BA.debugLineNum = 1455;BA.debugLine="Return \"CenturyView\"";
if (true) return "CenturyView";
 //BA.debugLineNum = 1456;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_decadeview() throws Exception{
 //BA.debugLineNum = 1450;BA.debugLine="Public Sub getCurrentView_DecadeView As String";
 //BA.debugLineNum = 1451;BA.debugLine="Return \"DecadeView\"";
if (true) return "DecadeView";
 //BA.debugLineNum = 1452;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_monthview() throws Exception{
 //BA.debugLineNum = 1442;BA.debugLine="Public Sub getCurrentView_MonthView As String";
 //BA.debugLineNum = 1443;BA.debugLine="Return \"MonthView\"";
if (true) return "MonthView";
 //BA.debugLineNum = 1444;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_yearview() throws Exception{
 //BA.debugLineNum = 1446;BA.debugLine="Public Sub getCurrentView_YearView As String";
 //BA.debugLineNum = 1447;BA.debugLine="Return \"YearView\"";
if (true) return "YearView";
 //BA.debugLineNum = 1448;BA.debugLine="End Sub";
return "";
}
public long  _getfirstdayofweek2(long _ticks,int _firstdayofweek) throws Exception{
b4a.example.dateutils._period _p = null;
 //BA.debugLineNum = 1847;BA.debugLine="Public Sub GetFirstDayOfWeek2(Ticks As Long,FirstD";
 //BA.debugLineNum = 1848;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
 //BA.debugLineNum = 1849;BA.debugLine="p.Days = -((DateTime.GetDayOfWeek(Ticks)+FirstDay";
_p.Days = (int) (-((__c.DateTime.GetDayOfWeek(_ticks)+_firstdayofweek)%7));
 //BA.debugLineNum = 1850;BA.debugLine="Return DateUtils.AddPeriod(Ticks, p)";
if (true) return _dateutils._addperiod(ba,_ticks,_p);
 //BA.debugLineNum = 1851;BA.debugLine="End Sub";
return 0L;
}
public int  _getgridlinecolor() throws Exception{
 //BA.debugLineNum = 1295;BA.debugLine="Public Sub getGridLineColor As Int";
 //BA.debugLineNum = 1296;BA.debugLine="Return m_GridLineColor";
if (true) return _m_gridlinecolor;
 //BA.debugLineNum = 1297;BA.debugLine="End Sub";
return 0;
}
public int  _getheadercolor() throws Exception{
 //BA.debugLineNum = 1286;BA.debugLine="Public Sub getHeaderColor As Int";
 //BA.debugLineNum = 1287;BA.debugLine="Return m_HeaderColor";
if (true) return _m_headercolor;
 //BA.debugLineNum = 1288;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getheaderpanel() throws Exception{
 //BA.debugLineNum = 1282;BA.debugLine="Public Sub getHeaderPanel As B4XView";
 //BA.debugLineNum = 1283;BA.debugLine="Return xpnl_Header";
if (true) return _xpnl_header;
 //BA.debugLineNum = 1284;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _getheaderproperties() throws Exception{
 //BA.debugLineNum = 1403;BA.debugLine="Public Sub getHeaderProperties As ASDatePicker_Hea";
 //BA.debugLineNum = 1404;BA.debugLine="Return g_HeaderProperties";
if (true) return _g_headerproperties;
 //BA.debugLineNum = 1405;BA.debugLine="End Sub";
return null;
}
public long  _getmaxdate() throws Exception{
 //BA.debugLineNum = 1415;BA.debugLine="Public Sub getMaxDate As Long";
 //BA.debugLineNum = 1416;BA.debugLine="Return m_MaxDate";
if (true) return _m_maxdate;
 //BA.debugLineNum = 1417;BA.debugLine="End Sub";
return 0L;
}
public long  _getmindate() throws Exception{
 //BA.debugLineNum = 1422;BA.debugLine="Public Sub getMinDate As Long";
 //BA.debugLineNum = 1423;BA.debugLine="Return m_MinDate";
if (true) return _m_mindate;
 //BA.debugLineNum = 1424;BA.debugLine="End Sub";
return 0L;
}
public String  _getmonthnamebyindex(int _index) throws Exception{
 //BA.debugLineNum = 1802;BA.debugLine="Private Sub GetMonthNameByIndex(index As Int) As S";
 //BA.debugLineNum = 1803;BA.debugLine="If index = 1 Then";
if (_index==1) { 
 //BA.debugLineNum = 1804;BA.debugLine="Return g_MonthNameShort.January";
if (true) return _g_monthnameshort.January /*String*/ ;
 }else if(_index==2) { 
 //BA.debugLineNum = 1806;BA.debugLine="Return g_MonthNameShort.February";
if (true) return _g_monthnameshort.February /*String*/ ;
 }else if(_index==3) { 
 //BA.debugLineNum = 1808;BA.debugLine="Return g_MonthNameShort.March";
if (true) return _g_monthnameshort.March /*String*/ ;
 }else if(_index==4) { 
 //BA.debugLineNum = 1810;BA.debugLine="Return g_MonthNameShort.April";
if (true) return _g_monthnameshort.April /*String*/ ;
 }else if(_index==5) { 
 //BA.debugLineNum = 1812;BA.debugLine="Return g_MonthNameShort.May";
if (true) return _g_monthnameshort.May /*String*/ ;
 }else if(_index==6) { 
 //BA.debugLineNum = 1814;BA.debugLine="Return g_MonthNameShort.June";
if (true) return _g_monthnameshort.June /*String*/ ;
 }else if(_index==7) { 
 //BA.debugLineNum = 1816;BA.debugLine="Return g_MonthNameShort.July";
if (true) return _g_monthnameshort.July /*String*/ ;
 }else if(_index==8) { 
 //BA.debugLineNum = 1818;BA.debugLine="Return g_MonthNameShort.August";
if (true) return _g_monthnameshort.August /*String*/ ;
 }else if(_index==9) { 
 //BA.debugLineNum = 1820;BA.debugLine="Return g_MonthNameShort.September";
if (true) return _g_monthnameshort.September /*String*/ ;
 }else if(_index==10) { 
 //BA.debugLineNum = 1822;BA.debugLine="Return g_MonthNameShort.October";
if (true) return _g_monthnameshort.October /*String*/ ;
 }else if(_index==11) { 
 //BA.debugLineNum = 1824;BA.debugLine="Return g_MonthNameShort.November";
if (true) return _g_monthnameshort.November /*String*/ ;
 }else {
 //BA.debugLineNum = 1826;BA.debugLine="Return g_MonthNameShort.December";
if (true) return _g_monthnameshort.December /*String*/ ;
 };
 //BA.debugLineNum = 1828;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _getmonthnameshort() throws Exception{
 //BA.debugLineNum = 1229;BA.debugLine="Public Sub getMonthNameShort As ASDatePicker_Month";
 //BA.debugLineNum = 1230;BA.debugLine="Return g_MonthNameShort";
if (true) return _g_monthnameshort;
 //BA.debugLineNum = 1231;BA.debugLine="End Sub";
return null;
}
public long  _getselecteddate() throws Exception{
 //BA.debugLineNum = 1374;BA.debugLine="Public Sub getSelectedDate As Long";
 //BA.debugLineNum = 1375;BA.debugLine="Return m_SelectedDate";
if (true) return _m_selecteddate;
 //BA.debugLineNum = 1376;BA.debugLine="End Sub";
return 0L;
}
public int  _getselecteddatecolor() throws Exception{
 //BA.debugLineNum = 1330;BA.debugLine="Public Sub getSelectedDateColor As Int";
 //BA.debugLineNum = 1331;BA.debugLine="Return m_SelectedDateColor";
if (true) return _m_selecteddatecolor;
 //BA.debugLineNum = 1332;BA.debugLine="End Sub";
return 0;
}
public long  _getselectedenddate() throws Exception{
 //BA.debugLineNum = 1387;BA.debugLine="Public Sub getSelectedEndDate As Long";
 //BA.debugLineNum = 1388;BA.debugLine="Return m_SelectedDate2";
if (true) return _m_selecteddate2;
 //BA.debugLineNum = 1389;BA.debugLine="End Sub";
return 0L;
}
public long  _getselectedstartdate() throws Exception{
 //BA.debugLineNum = 1378;BA.debugLine="Public Sub getSelectedStartDate As Long";
 //BA.debugLineNum = 1379;BA.debugLine="Return m_SelectedDate";
if (true) return _m_selecteddate;
 //BA.debugLineNum = 1380;BA.debugLine="End Sub";
return 0L;
}
public String  _getselectmode() throws Exception{
 //BA.debugLineNum = 1426;BA.debugLine="Public Sub getSelectMode As String";
 //BA.debugLineNum = 1427;BA.debugLine="Return m_SelectMode";
if (true) return _m_selectmode;
 //BA.debugLineNum = 1428;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_day() throws Exception{
 //BA.debugLineNum = 1458;BA.debugLine="Public Sub getSelectMode_Day As String";
 //BA.debugLineNum = 1459;BA.debugLine="Return \"Date\"";
if (true) return "Date";
 //BA.debugLineNum = 1460;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_month() throws Exception{
 //BA.debugLineNum = 1462;BA.debugLine="Public Sub getSelectMode_Month As String";
 //BA.debugLineNum = 1463;BA.debugLine="Return \"Month\"";
if (true) return "Month";
 //BA.debugLineNum = 1464;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_range() throws Exception{
 //BA.debugLineNum = 1466;BA.debugLine="Public Sub getSelectMode_Range As String";
 //BA.debugLineNum = 1467;BA.debugLine="Return \"Range\"";
if (true) return "Range";
 //BA.debugLineNum = 1468;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowgridlines() throws Exception{
 //BA.debugLineNum = 1303;BA.debugLine="Public Sub getShowGridLines As Boolean";
 //BA.debugLineNum = 1304;BA.debugLine="Return m_ShowGridLines";
if (true) return _m_showgridlines;
 //BA.debugLineNum = 1305;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowweeknumbers() throws Exception{
 //BA.debugLineNum = 1265;BA.debugLine="Public Sub getShowWeekNumbers As Boolean";
 //BA.debugLineNum = 1266;BA.debugLine="Return m_ShowWeekNumbers";
if (true) return _m_showweeknumbers;
 //BA.debugLineNum = 1267;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_dark() throws Exception{
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
 //BA.debugLineNum = 230;BA.debugLine="Public Sub getTheme_Dark As AS_DatePicker_Theme";
 //BA.debugLineNum = 232;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
 //BA.debugLineNum = 233;BA.debugLine="Theme.Initialize";
_theme.Initialize();
 //BA.debugLineNum = 234;BA.debugLine="Theme.BodyColor = 0xFF202125";
_theme.BodyColor /*int*/  = ((int)0xff202125);
 //BA.debugLineNum = 235;BA.debugLine="Theme.HeaderColor = 0xFF202125";
_theme.HeaderColor /*int*/  = ((int)0xff202125);
 //BA.debugLineNum = 236;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
 //BA.debugLineNum = 237;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
 //BA.debugLineNum = 238;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,255,255,2";
_theme.GridLineColor /*int*/  = _xui.Color_ARGB((int) (80),(int) (255),(int) (255),(int) (255));
 //BA.debugLineNum = 239;BA.debugLine="Theme.BodyTextColor = xui.Color_White";
_theme.BodyTextColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 240;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 241;BA.debugLine="Theme.HeaderTextColor = xui.Color_White";
_theme.HeaderTextColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 242;BA.debugLine="Theme.WeekNameColor =  0xFF202125'xui.Color_ARGB(";
_theme.WeekNameColor /*int*/  = ((int)0xff202125);
 //BA.debugLineNum = 243;BA.debugLine="Theme.WeekNameTextColor = xui.Color_White";
_theme.WeekNameTextColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 244;BA.debugLine="Theme.WeekNumberColor = xui.Color_ARGB(255,32, 33";
_theme.WeekNumberColor /*int*/  = _xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
 //BA.debugLineNum = 245;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_White";
_theme.WeekNumberTextColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 247;BA.debugLine="Return Theme";
if (true) return _theme;
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_light() throws Exception{
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
 //BA.debugLineNum = 251;BA.debugLine="Public Sub getTheme_Light As AS_DatePicker_Theme";
 //BA.debugLineNum = 253;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
 //BA.debugLineNum = 254;BA.debugLine="Theme.Initialize";
_theme.Initialize();
 //BA.debugLineNum = 255;BA.debugLine="Theme.BodyColor = xui.Color_White";
_theme.BodyColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 256;BA.debugLine="Theme.HeaderColor = xui.Color_White";
_theme.HeaderColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 257;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
 //BA.debugLineNum = 258;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
 //BA.debugLineNum = 259;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,0,0,0)";
_theme.GridLineColor /*int*/  = _xui.Color_ARGB((int) (80),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 260;BA.debugLine="Theme.BodyTextColor = xui.Color_Black";
_theme.BodyTextColor /*int*/  = _xui.Color_Black;
 //BA.debugLineNum = 261;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 262;BA.debugLine="Theme.HeaderTextColor = xui.Color_Black";
_theme.HeaderTextColor /*int*/  = _xui.Color_Black;
 //BA.debugLineNum = 263;BA.debugLine="Theme.WeekNameColor = xui.Color_White'xui.Color_A";
_theme.WeekNameColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 264;BA.debugLine="Theme.WeekNameTextColor = xui.Color_Black";
_theme.WeekNameTextColor /*int*/  = _xui.Color_Black;
 //BA.debugLineNum = 265;BA.debugLine="Theme.WeekNumberColor = xui.Color_White";
_theme.WeekNumberColor /*int*/  = _xui.Color_White;
 //BA.debugLineNum = 266;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_Black";
_theme.WeekNumberTextColor /*int*/  = _xui.Color_Black;
 //BA.debugLineNum = 268;BA.debugLine="Return Theme";
if (true) return _theme;
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public String  _getweeknamebyindex(int _index) throws Exception{
 //BA.debugLineNum = 1784;BA.debugLine="Public Sub GetWeekNameByIndex(Index As Int) As Str";
 //BA.debugLineNum = 1785;BA.debugLine="If Index = 1 Then";
if (_index==1) { 
 //BA.debugLineNum = 1786;BA.debugLine="Return g_WeekNameShort.Sunday";
if (true) return _g_weeknameshort.Sunday /*String*/ ;
 }else if(_index==2) { 
 //BA.debugLineNum = 1788;BA.debugLine="Return g_WeekNameShort.Monday";
if (true) return _g_weeknameshort.Monday /*String*/ ;
 }else if(_index==3) { 
 //BA.debugLineNum = 1790;BA.debugLine="Return g_WeekNameShort.Tuesday";
if (true) return _g_weeknameshort.Tuesday /*String*/ ;
 }else if(_index==4) { 
 //BA.debugLineNum = 1792;BA.debugLine="Return g_WeekNameShort.Wednesday";
if (true) return _g_weeknameshort.Wednesday /*String*/ ;
 }else if(_index==5) { 
 //BA.debugLineNum = 1794;BA.debugLine="Return g_WeekNameShort.Thursday";
if (true) return _g_weeknameshort.Thursday /*String*/ ;
 }else if(_index==6) { 
 //BA.debugLineNum = 1796;BA.debugLine="Return g_WeekNameShort.Friday";
if (true) return _g_weeknameshort.Friday /*String*/ ;
 }else {
 //BA.debugLineNum = 1798;BA.debugLine="Return g_WeekNameShort.Saturday";
if (true) return _g_weeknameshort.Saturday /*String*/ ;
 };
 //BA.debugLineNum = 1800;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _getweeknameproperties() throws Exception{
 //BA.debugLineNum = 1256;BA.debugLine="Public Sub getWeekNameProperties As ASDatePicker_W";
 //BA.debugLineNum = 1257;BA.debugLine="Return g_WeekNameProperties";
if (true) return _g_weeknameproperties;
 //BA.debugLineNum = 1258;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _getweeknameshort() throws Exception{
 //BA.debugLineNum = 1223;BA.debugLine="Public Sub getWeekNameShort As ASDatePicker_WeekNa";
 //BA.debugLineNum = 1224;BA.debugLine="Return g_WeekNameShort";
if (true) return _g_weeknameshort;
 //BA.debugLineNum = 1225;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _getweeknumberproperties() throws Exception{
 //BA.debugLineNum = 1243;BA.debugLine="Public Sub getWeekNumberProperties As ASDatePicker";
 //BA.debugLineNum = 1244;BA.debugLine="Return g_WeekNumberProperties";
if (true) return _g_weeknumberproperties;
 //BA.debugLineNum = 1245;BA.debugLine="End Sub";
return null;
}
public int  _getweeknumberstartingfrommonday(long _ticks) throws Exception{
int _weekdayoffirstdayofyear = 0;
int _firstmondayinyear = 0;
int _result = 0;
 //BA.debugLineNum = 1830;BA.debugLine="Private Sub GetWeekNumberStartingFromMonday (ticks";
 //BA.debugLineNum = 1831;BA.debugLine="Dim WeekDayOfFirstDayOfYear As Int = DateTime.Get";
_weekdayoffirstdayofyear = (int) (__c.DateTime.GetDayOfWeek(_dateutils._setdate(ba,__c.DateTime.GetYear(_ticks),(int) (1),(int) (1)))-1);
 //BA.debugLineNum = 1832;BA.debugLine="Dim FirstMondayInYear As Int = (7 + WeekDayOfFirs";
_firstmondayinyear = (int) ((7+_weekdayoffirstdayofyear-1)%7);
 //BA.debugLineNum = 1833;BA.debugLine="Dim result As Int";
_result = 0;
 //BA.debugLineNum = 1834;BA.debugLine="If WeekDayOfFirstDayOfYear <> 1 Then result = res";
if (_weekdayoffirstdayofyear!=1) { 
_result = (int) (_result-1);};
 //BA.debugLineNum = 1835;BA.debugLine="result = result + Floor((DateTime.GetDayOfYear(ti";
_result = (int) (_result+__c.Floor((__c.DateTime.GetDayOfYear(_ticks)-1+_firstmondayinyear)/(double)7)+1);
 //BA.debugLineNum = 1836;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 1837;BA.debugLine="End Sub";
return 0;
}
public String  _ini_viewpager() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
 //BA.debugLineNum = 361;BA.debugLine="Private Sub ini_viewpager";
 //BA.debugLineNum = 362;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 363;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
 //BA.debugLineNum = 365;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 366;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
 //BA.debugLineNum = 367;BA.debugLine="tmpmap.Put(\"Orientation\",\"Horizontal\")";
_tmpmap.Put((Object)("Orientation"),(Object)("Horizontal"));
 //BA.debugLineNum = 368;BA.debugLine="tmpmap.Put(\"Carousel\",False)";
_tmpmap.Put((Object)("Carousel"),(Object)(__c.False));
 //BA.debugLineNum = 369;BA.debugLine="tmpmap.Put(\"LazyLoading\",True)";
_tmpmap.Put((Object)("LazyLoading"),(Object)(__c.True));
 //BA.debugLineNum = 370;BA.debugLine="tmpmap.Put(\"LazyLoadingExtraSize\",3)";
_tmpmap.Put((Object)("LazyLoadingExtraSize"),(Object)(3));
 //BA.debugLineNum = 371;BA.debugLine="xASVP_Main.Initialize(Me,\"xASVP_Main\")";
_xasvp_main._initialize /*String*/ (ba,this,"xASVP_Main");
 //BA.debugLineNum = 372;BA.debugLine="xASVP_Main.DesignerCreateView(xpnl_ViewPager,tmpl";
_xasvp_main._designercreateview /*String*/ ((Object)(_xpnl_viewpager.getObject()),_tmplbl,_tmpmap);
 //BA.debugLineNum = 373;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
_xasvp_main._setloadingpanelcolor /*int*/ (_m_bodycolor);
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public String  _iniprops(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Private Sub IniProps(Props As Map)";
 //BA.debugLineNum = 321;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
_m_currentview = _getcurrentview_monthview();
 //BA.debugLineNum = 323;BA.debugLine="m_HeaderColor = xui.PaintOrColorToColor(Props.Get";
_m_headercolor = _xui.PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
 //BA.debugLineNum = 324;BA.debugLine="m_BodyColor = xui.PaintOrColorToColor(Props.Get(\"";
_m_bodycolor = _xui.PaintOrColorToColor(_props.Get((Object)("BodyColor")));
 //BA.debugLineNum = 325;BA.debugLine="m_CurrentDateColor = xui.PaintOrColorToColor(Prop";
_m_currentdatecolor = _xui.PaintOrColorToColor(_props.Get((Object)("CurrentDateColor")));
 //BA.debugLineNum = 326;BA.debugLine="m_SelectedDateColor = xui.PaintOrColorToColor(Pro";
_m_selecteddatecolor = _xui.PaintOrColorToColor(_props.Get((Object)("SelectedDateColor")));
 //BA.debugLineNum = 327;BA.debugLine="m_InactiveDaysVisible = Props.GetDefault(\"Inactiv";
_m_inactivedaysvisible = BA.ObjectToBoolean(_props.GetDefault((Object)("InactiveDaysVisible"),(Object)(__c.False)));
 //BA.debugLineNum = 328;BA.debugLine="m_MouseHoverFeedback = Props.GetDefault(\"MouseHov";
_m_mousehoverfeedback = BA.ObjectToBoolean(_props.GetDefault((Object)("MouseHoverFeedback"),(Object)(__c.True)));
 //BA.debugLineNum = 329;BA.debugLine="m_SelectMode = Props.GetDefault(\"SelectMode\",\"Dat";
_m_selectmode = BA.ObjectToString(_props.GetDefault((Object)("SelectMode"),(Object)("Date")));
 //BA.debugLineNum = 330;BA.debugLine="m_ShowWeekNumbers = Props.GetDefault(\"ShowWeekNum";
_m_showweeknumbers = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowWeekNumbers"),(Object)(__c.False)));
 //BA.debugLineNum = 331;BA.debugLine="m_ShowGridLines = Props.GetDefault(\"ShowGridLines";
_m_showgridlines = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowGridLines"),(Object)(__c.False)));
 //BA.debugLineNum = 332;BA.debugLine="m_GridLineColor = xui.PaintOrColorToColor(Props.G";
_m_gridlinecolor = _xui.PaintOrColorToColor(_props.GetDefault((Object)("GridLineColor"),(Object)(((int)0x50ffffff))));
 //BA.debugLineNum = 333;BA.debugLine="m_ThemeChangeTransition = Props.GetDefault(\"Theme";
_m_themechangetransition = BA.ObjectToString(_props.GetDefault((Object)("ThemeChangeTransition"),(Object)("Fade")));
 //BA.debugLineNum = 335;BA.debugLine="If \"Friday\" = Props.Get(\"FirstDayOfWeek\") Then";
if (("Friday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
 //BA.debugLineNum = 336;BA.debugLine="m_FirstDayOfWeek = 1";
_m_firstdayofweek = (int) (1);
 }else if(("Thursday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
 //BA.debugLineNum = 338;BA.debugLine="m_FirstDayOfWeek = 2";
_m_firstdayofweek = (int) (2);
 }else if(("Wednesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
 //BA.debugLineNum = 340;BA.debugLine="m_FirstDayOfWeek = 3";
_m_firstdayofweek = (int) (3);
 }else if(("Tuesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
 //BA.debugLineNum = 342;BA.debugLine="m_FirstDayOfWeek = 4";
_m_firstdayofweek = (int) (4);
 }else if(("Monday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
 //BA.debugLineNum = 344;BA.debugLine="m_FirstDayOfWeek = 5";
_m_firstdayofweek = (int) (5);
 }else if(("Sunday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
 //BA.debugLineNum = 346;BA.debugLine="m_FirstDayOfWeek = 6";
_m_firstdayofweek = (int) (6);
 }else if(("Saturday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
 //BA.debugLineNum = 348;BA.debugLine="m_FirstDayOfWeek = 7";
_m_firstdayofweek = (int) (7);
 };
 //BA.debugLineNum = 351;BA.debugLine="g_WeekNumberProperties = CreateASDatePicker_WeekN";
_g_weeknumberproperties = _createasdatepicker_weeknumberproperties((float) (__c.DipToCurrent((int) (20))),_xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),_xui.CreateDefaultFont((float) (10)),_xui.Color_White,"");
 //BA.debugLineNum = 352;BA.debugLine="g_HeaderProperties = CreateASDatePicker_HeaderPro";
_g_headerproperties = _createasdatepicker_headerproperties((float) (__c.DipToCurrent((int) (40))),_xui.CreateDefaultBoldFont((float) (12)),_xui.Color_White,(float) (15),__c.True);
 //BA.debugLineNum = 353;BA.debugLine="g_BodyProperties = CreateASDatePicker_BodyPropert";
_g_bodyproperties = _createasdatepicker_bodyproperties(_xui.CreateDefaultBoldFont((float) (12)),_xui.Color_White,_xui.Color_White,(float) (__c.DipToCurrent((int) (30))));
 //BA.debugLineNum = 354;BA.debugLine="g_WeekNameProperties = CreateASDatePicker_WeekNam";
_g_weeknameproperties = _createasdatepicker_weeknameproperties(_xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),_xui.CreateDefaultFont((float) (10)),_xui.Color_White,(float) (__c.DipToCurrent((int) (20))));
 //BA.debugLineNum = 356;BA.debugLine="g_MonthNameShort = CreateASDatePicker_MonthNameSh";
_g_monthnameshort = _createasdatepicker_monthnameshort("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec");
 //BA.debugLineNum = 357;BA.debugLine="g_WeekNameShort = CreateASDatePicker_WeekNameShor";
_g_weeknameshort = _createasdatepicker_weeknameshort("Mon","Tue","Wed","Thu","Fri","Sat","Sun");
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 272;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 273;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 274;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public int  _monthbetween(long _date1,long _date2) throws Exception{
long _y = 0L;
long _m = 0L;
 //BA.debugLineNum = 1858;BA.debugLine="Private Sub MonthBetween(Date1 As Long, Date2 As L";
 //BA.debugLineNum = 1859;BA.debugLine="Dim y As Long = DateTime.GetYear(Date2) - DateTim";
_y = (long) (__c.DateTime.GetYear(_date2)-__c.DateTime.GetYear(_date1));
 //BA.debugLineNum = 1860;BA.debugLine="Dim m As Long = y * 12";
_m = (long) (_y*12);
 //BA.debugLineNum = 1861;BA.debugLine="m = m - DateTime.GetMonth(Date1)";
_m = (long) (_m-__c.DateTime.GetMonth(_date1));
 //BA.debugLineNum = 1862;BA.debugLine="m = m + DateTime.GetMonth(Date2)";
_m = (long) (_m+__c.DateTime.GetMonth(_date2));
 //BA.debugLineNum = 1863;BA.debugLine="Return m";
if (true) return (int) (_m);
 //BA.debugLineNum = 1864;BA.debugLine="End Sub";
return 0;
}
public String  _monthdateclick(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _withevent) throws Exception{
long _currentday = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
 //BA.debugLineNum = 1683;BA.debugLine="Private Sub MonthDateClick(xpnl_MonthDate As B4XVi";
 //BA.debugLineNum = 1685;BA.debugLine="Dim CurrentDay As Long = xpnl_MonthDate.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 //BA.debugLineNum = 1686;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime.";
if ((_m_maxdate>0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(_m_maxdate),__c.DateTime.GetMonth(_m_maxdate),__c.DateTime.GetDayOfMonth(_m_maxdate))) || (_m_mindate>0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(_m_mindate),__c.DateTime.GetMonth(_m_mindate),__c.DateTime.GetDayOfMonth(_m_mindate)))) { 
if (true) return "";};
 //BA.debugLineNum = 1688;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1689;BA.debugLine="For Each View As B4XView In xpnl_MonthDate.GetAll";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _xpnl_monthdate.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
 //BA.debugLineNum = 1690;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
 //BA.debugLineNum = 1693;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1695;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((_m_selectmode).equals("Range")) { 
 //BA.debugLineNum = 1696;BA.debugLine="If m_SelectedDate = 0 Or xpnl_MonthDate.Tag <= m";
if (_m_selecteddate==0 || (double)(BA.ObjectToNumber(_xpnl_monthdate.getTag()))<=_m_selecteddate) { 
 //BA.debugLineNum = 1697;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate,xpnl_Mont";
if (_dateutils._issameday(ba,_m_selecteddate,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
 //BA.debugLineNum = 1698;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
_m_selecteddate = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 //BA.debugLineNum = 1699;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
_createselecteddate(_xpnl_monthdate,__c.True);
 //BA.debugLineNum = 1700;BA.debugLine="If m_SelectedDate > m_SelectedDate2 Then";
if (_m_selecteddate>_m_selecteddate2) { 
 //BA.debugLineNum = 1701;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Select";
if (_xpnl_selecteddate2!= null && _xpnl_selecteddate2.IsInitialized()==__c.True) { 
_xpnl_selecteddate2.RemoveViewFromParent();};
 //BA.debugLineNum = 1702;BA.debugLine="m_SelectedDate2 = 0";
_m_selecteddate2 = (long) (0);
 };
 }else {
 //BA.debugLineNum = 1705;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_Selected";
if (_xpnl_selecteddate!= null && _xpnl_selecteddate.IsInitialized()==__c.True) { 
_xpnl_selecteddate.RemoveViewFromParent();};
 //BA.debugLineNum = 1706;BA.debugLine="m_SelectedDate = 0";
_m_selecteddate = (long) (0);
 };
 }else {
 //BA.debugLineNum = 1709;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate2,xpnl_Mon";
if (_dateutils._issameday(ba,_m_selecteddate2,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
 //BA.debugLineNum = 1710;BA.debugLine="m_SelectedDate2 = xpnl_MonthDate.Tag";
_m_selecteddate2 = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 //BA.debugLineNum = 1711;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,False)";
_createselecteddate(_xpnl_monthdate,__c.False);
 }else {
 //BA.debugLineNum = 1713;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Selecte";
if (_xpnl_selecteddate2!= null && _xpnl_selecteddate2.IsInitialized()==__c.True) { 
_xpnl_selecteddate2.RemoveViewFromParent();};
 //BA.debugLineNum = 1714;BA.debugLine="m_SelectedDate2 = 0";
_m_selecteddate2 = (long) (0);
 };
 };
 //BA.debugLineNum = 1717;BA.debugLine="RefreshSelectedDate";
_refreshselecteddate();
 }else {
 //BA.debugLineNum = 1719;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
_createselecteddate(_xpnl_monthdate,__c.True);
 };
 //BA.debugLineNum = 1722;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedTe";
_xlbl_date.setTextColor(_g_bodyproperties.SelectedTextColor /*int*/ );
 //BA.debugLineNum = 1724;BA.debugLine="If WithEvent = True Then";
if (_withevent==__c.True) { 
 //BA.debugLineNum = 1725;BA.debugLine="If m_SelectMode = \"Range\" And m_SelectedDate > 0";
if ((_m_selectmode).equals("Range") && _m_selecteddate>0 && _m_selecteddate2>0) { 
 //BA.debugLineNum = 1726;BA.debugLine="SelectedDateRangeChanged";
_selecteddaterangechanged();
 }else {
 //BA.debugLineNum = 1728;BA.debugLine="SelectedDateChanged(xpnl_MonthDate.Tag)";
_selecteddatechanged(BA.ObjectToLongNumber(_xpnl_monthdate.getTag()));
 };
 };
 //BA.debugLineNum = 1731;BA.debugLine="End Sub";
return "";
}
public String  _pagechanged() throws Exception{
 //BA.debugLineNum = 1519;BA.debugLine="Private Sub PageChanged";
 //BA.debugLineNum = 1520;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (_xui.SubExists(ba,_mcallback,_meventname+"_PageChanged",(int) (0))) { 
 //BA.debugLineNum = 1521;BA.debugLine="CallSub(mCallBack, mEventName & \"_PageChanged\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_PageChanged");
 };
 //BA.debugLineNum = 1523;BA.debugLine="End Sub";
return "";
}
public void  _rebuild() throws Exception{
ResumableSub_Rebuild rsub = new ResumableSub_Rebuild(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Rebuild extends BA.ResumableSub {
public ResumableSub_Rebuild(b4a.example.ef.as_datepicker parent) {
this.parent = parent;
}
b4a.example.ef.as_datepicker parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1201;BA.debugLine="Do While m_isReady = False";
if (true) break;

case 1:
//do while
this.state = 4;
while (parent._m_isready==parent.__c.False) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 //BA.debugLineNum = 1202;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 1204;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 5;
;
 //BA.debugLineNum = 1205;BA.debugLine="xASVP_Main.Clear";
parent._xasvp_main._clear /*String*/ ();
 //BA.debugLineNum = 1206;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
 //BA.debugLineNum = 1207;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if (true) break;

case 5:
//if
this.state = 10;
if ((parent._m_selectmode).equals("Date") || (parent._m_selectmode).equals("Range")) { 
this.state = 7;
}else if((parent._m_selectmode).equals("Month")) { 
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 1208;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
parent._m_currentview = parent._getcurrentview_monthview();
 //BA.debugLineNum = 1209;BA.debugLine="CreateMonthView";
parent._createmonthview();
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1211;BA.debugLine="m_CurrentView = getCurrentView_YearView";
parent._m_currentview = parent._getcurrentview_yearview();
 //BA.debugLineNum = 1212;BA.debugLine="CreateYearView";
parent._createyearview();
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1214;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refresh() throws Exception{
int _i = 0;
 //BA.debugLineNum = 1090;BA.debugLine="Public Sub Refresh";
 //BA.debugLineNum = 1091;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (_xasvp_main._getsize /*int*/ ()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 1092;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (_xasvp_main._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (_i).getNumberOfViews()>0) { 
 //BA.debugLineNum = 1093;BA.debugLine="xASVP_Main.GetPanel(i).RemoveAllViews";
_xasvp_main._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (_i).RemoveAllViews();
 //BA.debugLineNum = 1094;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((_m_currentview).equals(_getcurrentview_monthview())) { 
 //BA.debugLineNum = 1095;BA.debugLine="AddMonth(xASVP_Main.GetPanel(i),xASVP_Main.Get";
_addmonth(_xasvp_main._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (_i),BA.ObjectToLongNumber(_xasvp_main._getvalue /*Object*/ (_i)));
 }else if((_m_currentview).equals(_getcurrentview_yearview()) || (_m_currentview).equals(_getcurrentview_decadeview()) || (_m_currentview).equals(_getcurrentview_centuryview())) { 
 //BA.debugLineNum = 1097;BA.debugLine="AddYear(xASVP_Main.GetPanel(i),xASVP_Main.GetV";
_addyear(_xasvp_main._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (_i),BA.ObjectToLongNumber(_xasvp_main._getvalue /*Object*/ (_i)));
 };
 };
 }
};
 //BA.debugLineNum = 1101;BA.debugLine="End Sub";
return "";
}
public String  _refreshheader() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowleft = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowright = null;
 //BA.debugLineNum = 1177;BA.debugLine="Public Sub RefreshHeader";
 //BA.debugLineNum = 1179;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
_xpnl_header.setColor(_m_headercolor);
 //BA.debugLineNum = 1181;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = _xpnl_header.GetView((int) (0));
 //BA.debugLineNum = 1182;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = xpnl_Header.GetVi";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = _xpnl_header.GetView((int) (1));
 //BA.debugLineNum = 1183;BA.debugLine="Dim xlbl_ArrowRight As B4XView = xpnl_Header.GetV";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = _xpnl_header.GetView((int) (2));
 //BA.debugLineNum = 1185;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(_xui.CreateMaterialIcons(_g_headerproperties.ButtonIconSize /*float*/ ));
 //BA.debugLineNum = 1186;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(_g_headerproperties.TextColor /*int*/ );
 //BA.debugLineNum = 1187;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(_g_headerproperties.ArrowsVisible /*boolean*/ );
 //BA.debugLineNum = 1189;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(_xui.CreateMaterialIcons(_g_headerproperties.ButtonIconSize /*float*/ ));
 //BA.debugLineNum = 1190;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(_g_headerproperties.TextColor /*int*/ );
 //BA.debugLineNum = 1191;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(_g_headerproperties.ArrowsVisible /*boolean*/ );
 //BA.debugLineNum = 1193;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(_g_headerproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 1194;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(_g_headerproperties.TextColor /*int*/ );
 //BA.debugLineNum = 1196;BA.debugLine="End Sub";
return "";
}
public String  _refreshselecteddate() throws Exception{
int[] _clr = null;
int _i = 0;
int _counter = 0;
int _z = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_day = null;
 //BA.debugLineNum = 1103;BA.debugLine="Public Sub RefreshSelectedDate";
 //BA.debugLineNum = 1104;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = _getargb(_m_selecteddatecolor);
 //BA.debugLineNum = 1106;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (_xasvp_main._getsize /*int*/ ()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1107;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (_xasvp_main._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (_i).getNumberOfViews()>0) { 
 //BA.debugLineNum = 1108;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((_m_currentview).equals(_getcurrentview_monthview())) { 
 //BA.debugLineNum = 1110;BA.debugLine="Dim counter As Int = xASVP_Main.GetPanel(i).Nu";
_counter = _xasvp_main._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (_i).getNumberOfViews();
 //BA.debugLineNum = 1111;BA.debugLine="For z = 0 To counter -1";
{
final int step6 = 1;
final int limit6 = (int) (_counter-1);
_z = (int) (0) ;
for (;_z <= limit6 ;_z = _z + step6 ) {
 //BA.debugLineNum = 1112;BA.debugLine="Dim xpnl_Day As B4XView = xASVP_Main.GetPanel";
_xpnl_day = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_day = _xasvp_main._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (_i).GetView(_z);
 //BA.debugLineNum = 1113;BA.debugLine="If xpnl_Day.tag Is Long And xpnl_Day.NumberOf";
if (_xpnl_day.getTag() instanceof Long && _xpnl_day.getNumberOfViews()>0) { 
 //BA.debugLineNum = 1114;BA.debugLine="CreateSelectDates(xpnl_Day,clr)";
_createselectdates(_xpnl_day,_clr);
 };
 }
};
 };
 };
 }
};
 //BA.debugLineNum = 1121;BA.debugLine="End Sub";
return "";
}
public String  _scroll2date(long _date) throws Exception{
int _scrollindex = 0;
int _i = 0;
long _startdate = 0L;
 //BA.debugLineNum = 1351;BA.debugLine="Public Sub Scroll2Date(Date As Long)";
 //BA.debugLineNum = 1352;BA.debugLine="Dim ScrollIndex As Int = -1";
_scrollindex = (int) (-1);
 //BA.debugLineNum = 1353;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (_xasvp_main._getsize /*int*/ ()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1354;BA.debugLine="Dim StartDate As Long = xASVP_Main.GetValue(i)";
_startdate = BA.ObjectToLongNumber(_xasvp_main._getvalue /*Object*/ (_i));
 //BA.debugLineNum = 1356;BA.debugLine="If DateTime.GetYear(StartDate) = DateTime.GetYea";
if (__c.DateTime.GetYear(_startdate)==__c.DateTime.GetYear(_date) && __c.DateTime.GetMonth(_startdate)==__c.DateTime.GetMonth(_date)) { 
 //BA.debugLineNum = 1357;BA.debugLine="ScrollIndex = i";
_scrollindex = _i;
 };
 }
};
 //BA.debugLineNum = 1361;BA.debugLine="If ScrollIndex <> -1 Then";
if (_scrollindex!=-1) { 
 //BA.debugLineNum = 1362;BA.debugLine="xASVP_Main.CurrentIndex = ScrollIndex";
_xasvp_main._setcurrentindex /*int*/ (_scrollindex);
 }else {
 //BA.debugLineNum = 1364;BA.debugLine="m_StartDate = Date";
_m_startdate = _date;
 //BA.debugLineNum = 1365;BA.debugLine="xASVP_Main.Clear";
_xasvp_main._clear /*String*/ ();
 //BA.debugLineNum = 1366;BA.debugLine="CreateMonthView";
_createmonthview();
 };
 //BA.debugLineNum = 1368;BA.debugLine="End Sub";
return "";
}
public String  _selecteddatechanged(long _date) throws Exception{
 //BA.debugLineNum = 1488;BA.debugLine="Private Sub SelectedDateChanged(date As Long)";
 //BA.debugLineNum = 1489;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (_xui.SubExists(ba,_mcallback,_meventname+"_SelectedDateChanged",(int) (1))) { 
 //BA.debugLineNum = 1490;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedDateC";
__c.CallSubNew2(ba,_mcallback,_meventname+"_SelectedDateChanged",(Object)(_date));
 };
 //BA.debugLineNum = 1492;BA.debugLine="End Sub";
return "";
}
public String  _selecteddaterangechanged() throws Exception{
 //BA.debugLineNum = 1494;BA.debugLine="Private Sub SelectedDateRangeChanged";
 //BA.debugLineNum = 1495;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (_xui.SubExists(ba,_mcallback,_meventname+"_SelectedDateRangeChanged",(int) (2))) { 
 //BA.debugLineNum = 1496;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SelectedDateR";
__c.CallSubNew3(ba,_mcallback,_meventname+"_SelectedDateRangeChanged",(Object)(_m_selecteddate),(Object)(_m_selecteddate2));
 };
 //BA.debugLineNum = 1498;BA.debugLine="End Sub";
return "";
}
public String  _setbodycolor(int _color) throws Exception{
 //BA.debugLineNum = 1315;BA.debugLine="Public Sub setBodyColor(Color As Int)";
 //BA.debugLineNum = 1316;BA.debugLine="m_BodyColor = Color";
_m_bodycolor = _color;
 //BA.debugLineNum = 1317;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
_xpnl_loadingpanel.setColor(_m_bodycolor);
 //BA.debugLineNum = 1318;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
_xasvp_main._setloadingpanelcolor /*int*/ (_m_bodycolor);
 //BA.debugLineNum = 1319;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
_xasvp_main._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().setColor(_m_bodycolor);
 //BA.debugLineNum = 1320;BA.debugLine="End Sub";
return "";
}
public String  _setbodyproperties(b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _bodyproperties) throws Exception{
 //BA.debugLineNum = 1399;BA.debugLine="Public Sub setBodyProperties(BodyProperties As ASD";
 //BA.debugLineNum = 1400;BA.debugLine="g_BodyProperties = BodyProperties";
_g_bodyproperties = _bodyproperties;
 //BA.debugLineNum = 1401;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentdatecolor(int _color) throws Exception{
 //BA.debugLineNum = 1326;BA.debugLine="Public Sub setCurrentDateColor(Color As Int)";
 //BA.debugLineNum = 1327;BA.debugLine="m_CurrentDateColor = Color";
_m_currentdatecolor = _color;
 //BA.debugLineNum = 1328;BA.debugLine="End Sub";
return "";
}
public String  _setfirstdayofweek(int _number) throws Exception{
 //BA.debugLineNum = 1346;BA.debugLine="Public Sub setFirstDayOfWeek(number As Int)";
 //BA.debugLineNum = 1347;BA.debugLine="m_FirstDayOfWeek = number";
_m_firstdayofweek = _number;
 //BA.debugLineNum = 1348;BA.debugLine="End Sub";
return "";
}
public String  _setgridlinecolor(int _color) throws Exception{
 //BA.debugLineNum = 1299;BA.debugLine="Public Sub setGridLineColor(Color As Int)";
 //BA.debugLineNum = 1300;BA.debugLine="m_GridLineColor = Color";
_m_gridlinecolor = _color;
 //BA.debugLineNum = 1301;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(int _color) throws Exception{
 //BA.debugLineNum = 1290;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
 //BA.debugLineNum = 1291;BA.debugLine="m_HeaderColor = Color";
_m_headercolor = _color;
 //BA.debugLineNum = 1292;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
_xpnl_header.setColor(_m_headercolor);
 //BA.debugLineNum = 1293;BA.debugLine="End Sub";
return "";
}
public String  _setheaderproperties(b4a.example.ef.as_datepicker._asdatepicker_headerproperties _headerproperties) throws Exception{
 //BA.debugLineNum = 1407;BA.debugLine="Public Sub setHeaderProperties(HeaderProperties As";
 //BA.debugLineNum = 1408;BA.debugLine="g_HeaderProperties = HeaderProperties";
_g_headerproperties = _headerproperties;
 //BA.debugLineNum = 1409;BA.debugLine="End Sub";
return "";
}
public String  _setmaxdate(long _maxdate) throws Exception{
 //BA.debugLineNum = 1412;BA.debugLine="Public Sub setMaxDate(MaxDate As Long)";
 //BA.debugLineNum = 1413;BA.debugLine="m_MaxDate = MaxDate";
_m_maxdate = _maxdate;
 //BA.debugLineNum = 1414;BA.debugLine="End Sub";
return "";
}
public String  _setmindate(long _mindate) throws Exception{
 //BA.debugLineNum = 1419;BA.debugLine="Public Sub setMinDate(MinDate As Long)";
 //BA.debugLineNum = 1420;BA.debugLine="m_MinDate = MinDate";
_m_mindate = _mindate;
 //BA.debugLineNum = 1421;BA.debugLine="End Sub";
return "";
}
public String  _setmonthnameshort(b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _monthnameshort) throws Exception{
 //BA.debugLineNum = 1233;BA.debugLine="Public Sub setMonthNameShort(MonthNameShort As ASD";
 //BA.debugLineNum = 1234;BA.debugLine="g_MonthNameShort = MonthNameShort";
_g_monthnameshort = _monthnameshort;
 //BA.debugLineNum = 1235;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddate(long _date) throws Exception{
 //BA.debugLineNum = 1370;BA.debugLine="Public Sub setSelectedDate(Date As Long)";
 //BA.debugLineNum = 1371;BA.debugLine="m_SelectedDate = Date";
_m_selecteddate = _date;
 //BA.debugLineNum = 1372;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddatecolor(int _color) throws Exception{
 //BA.debugLineNum = 1334;BA.debugLine="Public Sub setSelectedDateColor(Color As Int)";
 //BA.debugLineNum = 1335;BA.debugLine="m_SelectedDateColor = Color";
_m_selecteddatecolor = _color;
 //BA.debugLineNum = 1336;BA.debugLine="End Sub";
return "";
}
public String  _setselectedenddate(long _date) throws Exception{
 //BA.debugLineNum = 1391;BA.debugLine="Public Sub setSelectedEndDate(Date As Long)";
 //BA.debugLineNum = 1392;BA.debugLine="m_SelectedDate2 = Date";
_m_selecteddate2 = _date;
 //BA.debugLineNum = 1393;BA.debugLine="End Sub";
return "";
}
public String  _setselectedstartdate(long _date) throws Exception{
 //BA.debugLineNum = 1382;BA.debugLine="Public Sub setSelectedStartDate(Date As Long)";
 //BA.debugLineNum = 1383;BA.debugLine="m_SelectedDate = Date";
_m_selecteddate = _date;
 //BA.debugLineNum = 1384;BA.debugLine="End Sub";
return "";
}
public String  _setselectmode(String _mode) throws Exception{
 //BA.debugLineNum = 1430;BA.debugLine="Public Sub setSelectMode(Mode As String)";
 //BA.debugLineNum = 1431;BA.debugLine="m_SelectMode = Mode";
_m_selectmode = _mode;
 //BA.debugLineNum = 1432;BA.debugLine="End Sub";
return "";
}
public String  _setshowgridlines(boolean _show) throws Exception{
 //BA.debugLineNum = 1307;BA.debugLine="Public Sub setShowGridLines(Show As Boolean)";
 //BA.debugLineNum = 1308;BA.debugLine="m_ShowGridLines = Show";
_m_showgridlines = _show;
 //BA.debugLineNum = 1309;BA.debugLine="End Sub";
return "";
}
public String  _setshowweeknumbers(boolean _show) throws Exception{
 //BA.debugLineNum = 1269;BA.debugLine="Public Sub setShowWeekNumbers(Show As Boolean)";
 //BA.debugLineNum = 1270;BA.debugLine="m_ShowWeekNumbers = Show";
_m_showweeknumbers = _show;
 //BA.debugLineNum = 1271;BA.debugLine="End Sub";
return "";
}
public void  _settheme(b4a.example.ef.as_datepicker._as_datepicker_theme _theme) throws Exception{
ResumableSub_setTheme rsub = new ResumableSub_setTheme(this,_theme);
rsub.resume(ba, null);
}
public static class ResumableSub_setTheme extends BA.ResumableSub {
public ResumableSub_setTheme(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker._as_datepicker_theme _theme) {
this.parent = parent;
this._theme = _theme;
}
b4a.example.ef.as_datepicker parent;
b4a.example.ef.as_datepicker._as_datepicker_theme _theme;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 194;BA.debugLine="xiv_RefreshImage.SetBitmap(mBase.Snapshot)";
parent._xiv_refreshimage.SetBitmap((android.graphics.Bitmap)(parent._mbase.Snapshot().getObject()));
 //BA.debugLineNum = 195;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,True)";
parent._xiv_refreshimage.SetVisibleAnimated((int) (0),parent.__c.True);
 //BA.debugLineNum = 197;BA.debugLine="m_BodyColor = Theme.BodyColor";
parent._m_bodycolor = _theme.BodyColor /*int*/ ;
 //BA.debugLineNum = 198;BA.debugLine="m_HeaderColor = Theme.HeaderColor";
parent._m_headercolor = _theme.HeaderColor /*int*/ ;
 //BA.debugLineNum = 199;BA.debugLine="m_CurrentDateColor = Theme.CurrentDateColor";
parent._m_currentdatecolor = _theme.CurrentDateColor /*int*/ ;
 //BA.debugLineNum = 200;BA.debugLine="m_SelectedDateColor = Theme.SelectedDateColor";
parent._m_selecteddatecolor = _theme.SelectedDateColor /*int*/ ;
 //BA.debugLineNum = 201;BA.debugLine="m_GridLineColor = Theme.GridLineColor";
parent._m_gridlinecolor = _theme.GridLineColor /*int*/ ;
 //BA.debugLineNum = 202;BA.debugLine="g_BodyProperties.TextColor = Theme.BodyTextColor";
parent._g_bodyproperties.TextColor /*int*/  = _theme.BodyTextColor /*int*/ ;
 //BA.debugLineNum = 203;BA.debugLine="g_HeaderProperties.TextColor = Theme.HeaderTextCo";
parent._g_headerproperties.TextColor /*int*/  = _theme.HeaderTextColor /*int*/ ;
 //BA.debugLineNum = 204;BA.debugLine="g_WeekNameProperties.Color = Theme.WeekNameColor";
parent._g_weeknameproperties.Color /*int*/  = _theme.WeekNameColor /*int*/ ;
 //BA.debugLineNum = 205;BA.debugLine="g_WeekNameProperties.TextColor = Theme.WeekNameTe";
parent._g_weeknameproperties.TextColor /*int*/  = _theme.WeekNameTextColor /*int*/ ;
 //BA.debugLineNum = 206;BA.debugLine="g_WeekNumberProperties.Color = Theme.WeekNumberCo";
parent._g_weeknumberproperties.Color /*int*/  = _theme.WeekNumberColor /*int*/ ;
 //BA.debugLineNum = 207;BA.debugLine="g_WeekNumberProperties.TextColor = Theme.WeekNumb";
parent._g_weeknumberproperties.TextColor /*int*/  = _theme.WeekNumberTextColor /*int*/ ;
 //BA.debugLineNum = 208;BA.debugLine="g_BodyProperties.SelectedTextColor = Theme.Select";
parent._g_bodyproperties.SelectedTextColor /*int*/  = _theme.SelectedTextColor /*int*/ ;
 //BA.debugLineNum = 210;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 //BA.debugLineNum = 212;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
parent._xpnl_loadingpanel.setColor(parent._m_bodycolor);
 //BA.debugLineNum = 213;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
parent._xasvp_main._setloadingpanelcolor /*int*/ (parent._m_bodycolor);
 //BA.debugLineNum = 214;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
parent._xasvp_main._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().setColor(parent._m_bodycolor);
 //BA.debugLineNum = 216;BA.debugLine="RefreshHeader";
parent._refreshheader();
 //BA.debugLineNum = 217;BA.debugLine="Refresh";
parent._refresh();
 //BA.debugLineNum = 219;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 //BA.debugLineNum = 221;BA.debugLine="Select m_ThemeChangeTransition";
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(parent._m_themechangetransition,"None","Fade")) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 5;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 223;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,False)";
parent._xiv_refreshimage.SetVisibleAnimated((int) (0),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 225;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(250,False)";
parent._xiv_refreshimage.SetVisibleAnimated((int) (250),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setweeknameproperties(b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _weeknameproperties) throws Exception{
 //BA.debugLineNum = 1259;BA.debugLine="Public Sub setWeekNameProperties(WeekNamePropertie";
 //BA.debugLineNum = 1260;BA.debugLine="g_WeekNameProperties = WeekNameProperties";
_g_weeknameproperties = _weeknameproperties;
 //BA.debugLineNum = 1261;BA.debugLine="End Sub";
return "";
}
public String  _setweeknameshort(b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _weeknameshort) throws Exception{
 //BA.debugLineNum = 1219;BA.debugLine="Public Sub setWeekNameShort(WeekNameShort As ASDat";
 //BA.debugLineNum = 1220;BA.debugLine="g_WeekNameShort = WeekNameShort";
_g_weeknameshort = _weeknameshort;
 //BA.debugLineNum = 1221;BA.debugLine="End Sub";
return "";
}
public String  _setweeknumberproperties(b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _weeknumberproperties) throws Exception{
 //BA.debugLineNum = 1246;BA.debugLine="Public Sub setWeekNumberProperties(WeekNumberPrope";
 //BA.debugLineNum = 1247;BA.debugLine="g_WeekNumberProperties = WeekNumberProperties";
_g_weeknumberproperties = _weeknumberproperties;
 //BA.debugLineNum = 1248;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_lazyloadingaddcontent(anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
 //BA.debugLineNum = 1533;BA.debugLine="Private Sub xASVP_Main_LazyLoadingAddContent(Paren";
 //BA.debugLineNum = 1534;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((_m_currentview).equals(_getcurrentview_monthview())) { 
 //BA.debugLineNum = 1535;BA.debugLine="AddMonth(Parent,Value)";
_addmonth(_parent,BA.ObjectToLongNumber(_value));
 }else if((_m_currentview).equals(_getcurrentview_yearview()) || (_m_currentview).equals(_getcurrentview_decadeview()) || (_m_currentview).equals(_getcurrentview_centuryview())) { 
 //BA.debugLineNum = 1537;BA.debugLine="AddYear(Parent,Value)";
_addyear(_parent,BA.ObjectToLongNumber(_value));
 };
 //BA.debugLineNum = 1539;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechange(int _index) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
long _currentdate = 0L;
 //BA.debugLineNum = 1541;BA.debugLine="Private Sub xASVP_Main_PageChange(Index As Int)";
 //BA.debugLineNum = 1542;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = _xpnl_header.GetView((int) (0));
 //BA.debugLineNum = 1543;BA.debugLine="Dim CurrentDate As Long = xASVP_Main.GetValue(Ind";
_currentdate = BA.ObjectToLongNumber(_xasvp_main._getvalue /*Object*/ (_index));
 //BA.debugLineNum = 1544;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((_m_currentview).equals(_getcurrentview_monthview())) { 
 //BA.debugLineNum = 1545;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(Current";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,_currentdate)+" "+BA.NumberToString(__c.DateTime.GetYear(_currentdate))));
 }else if((_m_currentview).equals(_getcurrentview_yearview())) { 
 //BA.debugLineNum = 1547;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(_currentdate)));
 }else if((_m_currentview).equals(_getcurrentview_decadeview())) { 
 //BA.debugLineNum = 1549;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString((__c.DateTime.GetYear(_currentdate)+11))));
 }else if((_m_currentview).equals(_getcurrentview_centuryview())) { 
 //BA.debugLineNum = 1551;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+10*12)-1))));
 };
 //BA.debugLineNum = 1553;BA.debugLine="CustomDrawHeader(CurrentDate)";
_customdrawheader(_currentdate);
 //BA.debugLineNum = 1554;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged(int _index) throws Exception{
 //BA.debugLineNum = 1529;BA.debugLine="Private Sub xASVP_Main_PageChanged(Index As Int)";
 //BA.debugLineNum = 1530;BA.debugLine="PageChanged";
_pagechanged();
 //BA.debugLineNum = 1531;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged2(int _newindex,int _oldindex) throws Exception{
boolean _forward = false;
boolean _doit = false;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
b4a.example.dateutils._period _p2 = null;
long _currenttime = 0L;
long _firstdayofmonth = 0L;
 //BA.debugLineNum = 447;BA.debugLine="Private Sub xASVP_Main_PageChanged2(NewIndex As In";
 //BA.debugLineNum = 449;BA.debugLine="If m_MinDate > 0 And m_MaxDate > 0 Then Return";
if (_m_mindate>0 && _m_maxdate>0) { 
if (true) return "";};
 //BA.debugLineNum = 451;BA.debugLine="Dim Forward As Boolean = False";
_forward = __c.False;
 //BA.debugLineNum = 452;BA.debugLine="Dim DoIt As Boolean = False";
_doit = __c.False;
 //BA.debugLineNum = 454;BA.debugLine="If NewIndex <= OldIndex Then";
if (_newindex<=_oldindex) { 
 //BA.debugLineNum = 455;BA.debugLine="If NewIndex <= 2 Then";
if (_newindex<=2) { 
 //BA.debugLineNum = 456;BA.debugLine="DoIt = True";
_doit = __c.True;
 //BA.debugLineNum = 457;BA.debugLine="Forward = False";
_forward = __c.False;
 };
 }else {
 //BA.debugLineNum = 460;BA.debugLine="If NewIndex = xASVP_Main.Size -2 Then";
if (_newindex==_xasvp_main._getsize /*int*/ ()-2) { 
 //BA.debugLineNum = 461;BA.debugLine="DoIt = True";
_doit = __c.True;
 //BA.debugLineNum = 462;BA.debugLine="Forward = True";
_forward = __c.True;
 };
 };
 //BA.debugLineNum = 466;BA.debugLine="If DoIt Then";
if (_doit) { 
 //BA.debugLineNum = 468;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((_m_currentview).equals(_getcurrentview_monthview())) { 
 //BA.debugLineNum = 469;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 470;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 471;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_xpnl_viewpager.getWidth(),_xpnl_viewpager.getHeight());
 //BA.debugLineNum = 473;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
 //BA.debugLineNum = 474;BA.debugLine="p2.Initialize";
_p2.Initialize();
 //BA.debugLineNum = 475;BA.debugLine="p2.Months = IIf(Forward,1,-1)";
_p2.Months = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
 //BA.debugLineNum = 477;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(_xasvp_main._getvalue /*Object*/ ((int)(BA.ObjectToNumber(((_forward) ? ((Object)(_xasvp_main._getsize /*int*/ ()-1)) : ((Object)(0))))))),_p2);
 //BA.debugLineNum = 478;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate";
_firstdayofmonth = _dateutils._setdate(ba,__c.DateTime.GetYear(_currenttime),__c.DateTime.GetMonth(_currenttime),(int) (1));
 //BA.debugLineNum = 480;BA.debugLine="If Forward Then";
if (_forward) { 
 //BA.debugLineNum = 481;BA.debugLine="If m_MaxDate > 0 And FirstDayOfMonth > DateUti";
if (_m_maxdate>0 && _firstdayofmonth>_dateutils._setdate(ba,__c.DateTime.GetYear(_m_maxdate),__c.DateTime.GetMonth(_m_maxdate),(int) (1))) { 
 //BA.debugLineNum = 482;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 484;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfM";
_xasvp_main._addpage /*String*/ (_xpnl_background,(Object)(_firstdayofmonth));
 }else {
 //BA.debugLineNum = 486;BA.debugLine="If m_MinDate > 0 And FirstDayOfMonth < DateUti";
if (_m_mindate>0 && _firstdayofmonth<_dateutils._setdate(ba,__c.DateTime.GetYear(_m_mindate),__c.DateTime.GetMonth(_m_mindate),(int) (1))) { 
 //BA.debugLineNum = 487;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 489;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,FirstDa";
_xasvp_main._addpageat /*String*/ ((int) (0),_xpnl_background,(Object)(_firstdayofmonth));
 };
 }else if((_m_currentview).equals(_getcurrentview_yearview())) { 
 //BA.debugLineNum = 494;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 495;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 496;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_xpnl_viewpager.getWidth(),_xpnl_viewpager.getHeight());
 //BA.debugLineNum = 498;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
 //BA.debugLineNum = 499;BA.debugLine="p2.Initialize";
_p2.Initialize();
 //BA.debugLineNum = 500;BA.debugLine="p2.Years = IIf(Forward,1,-1)";
_p2.Years = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
 //BA.debugLineNum = 502;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(_xasvp_main._getvalue /*Object*/ ((int)(BA.ObjectToNumber(((_forward) ? ((Object)(_xasvp_main._getsize /*int*/ ()-1)) : ((Object)(0))))))),_p2);
 //BA.debugLineNum = 505;BA.debugLine="If Forward Then";
if (_forward) { 
 //BA.debugLineNum = 506;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (_m_maxdate>0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(_m_maxdate)) { 
 //BA.debugLineNum = 507;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 509;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
_xasvp_main._addpage /*String*/ (_xpnl_background,(Object)(_currenttime));
 }else {
 //BA.debugLineNum = 511;BA.debugLine="If m_MinDate > 0 And DateTime.GetYear(CurrentT";
if (_m_mindate>0 && __c.DateTime.GetYear(_currenttime)<__c.DateTime.GetYear(_m_mindate)) { 
 //BA.debugLineNum = 512;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 514;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,Current";
_xasvp_main._addpageat /*String*/ ((int) (0),_xpnl_background,(Object)(_currenttime));
 };
 }else if((_m_currentview).equals(_getcurrentview_decadeview())) { 
 //BA.debugLineNum = 519;BA.debugLine="If Forward Then";
if (_forward) { 
 //BA.debugLineNum = 521;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePan";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 522;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 523;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_V";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_xpnl_viewpager.getWidth(),_xpnl_viewpager.getHeight());
 //BA.debugLineNum = 525;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
 //BA.debugLineNum = 526;BA.debugLine="p2.Initialize";
_p2.Initialize();
 //BA.debugLineNum = 527;BA.debugLine="p2.Years = 10";
_p2.Years = (int) (10);
 //BA.debugLineNum = 529;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(_xasvp_main._getvalue /*Object*/ ((int) (_xasvp_main._getsize /*int*/ ()-1))),_p2);
 //BA.debugLineNum = 532;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (_m_maxdate>0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(_m_maxdate)) { 
 //BA.debugLineNum = 533;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 535;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
_xasvp_main._addpage /*String*/ (_xpnl_background,(Object)(_currenttime));
 };
 };
 };
 //BA.debugLineNum = 542;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_header_click() throws Exception{
 //BA.debugLineNum = 1579;BA.debugLine="Private Sub xlbl_Header_Click";
 //BA.debugLineNum = 1581;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((_m_currentview).equals(_getcurrentview_monthview())) { 
 //BA.debugLineNum = 1582;BA.debugLine="ChangeView(getCurrentView_YearView)";
_changeview(_getcurrentview_yearview());
 }else if((_m_currentview).equals(_getcurrentview_yearview())) { 
 //BA.debugLineNum = 1584;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
_changeview(_getcurrentview_decadeview());
 }else if((_m_currentview).equals(_getcurrentview_decadeview())) { 
 //BA.debugLineNum = 1586;BA.debugLine="ChangeView(getCurrentView_CenturyView)";
_changeview(_getcurrentview_centuryview());
 };
 //BA.debugLineNum = 1588;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowleft_click() throws Exception{
 //BA.debugLineNum = 1567;BA.debugLine="Private Sub xlbl_HeaderArrowLeft_Click";
 //BA.debugLineNum = 1568;BA.debugLine="xASVP_Main.PreviousPage";
_xasvp_main._previouspage /*String*/ ();
 //BA.debugLineNum = 1569;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowright_click() throws Exception{
 //BA.debugLineNum = 1570;BA.debugLine="Private Sub xlbl_HeaderArrowRight_Click";
 //BA.debugLineNum = 1571;BA.debugLine="xASVP_Main.NextPage";
_xasvp_main._nextpage /*String*/ ();
 //BA.debugLineNum = 1572;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_centurydecade_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_centurydecade = null;
 //BA.debugLineNum = 1639;BA.debugLine="Private Sub xpnl_CenturyDecade_Click";
 //BA.debugLineNum = 1641;BA.debugLine="Dim xpnl_CenturyDecade As B4XView = Sender";
_xpnl_centurydecade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_centurydecade = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 1642;BA.debugLine="m_StartDate = xpnl_CenturyDecade.Tag";
_m_startdate = BA.ObjectToLongNumber(_xpnl_centurydecade.getTag());
 //BA.debugLineNum = 1643;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
_changeview(_getcurrentview_decadeview());
 //BA.debugLineNum = 1644;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_decadeyear_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_decadeyear = null;
 //BA.debugLineNum = 1594;BA.debugLine="Private Sub xpnl_DecadeYear_Click";
 //BA.debugLineNum = 1596;BA.debugLine="Dim xpnl_DecadeYear As B4XView = Sender";
_xpnl_decadeyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_decadeyear = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 1597;BA.debugLine="m_StartDate = xpnl_DecadeYear.Tag";
_m_startdate = BA.ObjectToLongNumber(_xpnl_decadeyear.getTag());
 //BA.debugLineNum = 1598;BA.debugLine="ChangeView(getCurrentView_YearView)";
_changeview(_getcurrentview_yearview());
 //BA.debugLineNum = 1599;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_monthdate_click() throws Exception{
 //BA.debugLineNum = 1678;BA.debugLine="Private Sub xpnl_MonthDate_Click";
 //BA.debugLineNum = 1680;BA.debugLine="MonthDateClick(Sender,True)";
_monthdateclick((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
 //BA.debugLineNum = 1681;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_yearmonth_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_yearmonth = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
 //BA.debugLineNum = 1605;BA.debugLine="Private Sub xpnl_YearMonth_Click";
 //BA.debugLineNum = 1607;BA.debugLine="Dim xpnl_YearMonth As B4XView = Sender";
_xpnl_yearmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_yearmonth = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 1608;BA.debugLine="m_StartDate = xpnl_YearMonth.Tag";
_m_startdate = BA.ObjectToLongNumber(_xpnl_yearmonth.getTag());
 //BA.debugLineNum = 1609;BA.debugLine="If m_SelectMode = \"Date\"  Or m_SelectMode = \"Rang";
if ((_m_selectmode).equals("Date") || (_m_selectmode).equals("Range")) { 
 //BA.debugLineNum = 1610;BA.debugLine="ChangeView(getCurrentView_MonthView)";
_changeview(_getcurrentview_monthview());
 }else if((_m_selectmode).equals("Month")) { 
 //BA.debugLineNum = 1612;BA.debugLine="SelectedDateChanged(xpnl_YearMonth.Tag)";
_selecteddatechanged(BA.ObjectToLongNumber(_xpnl_yearmonth.getTag()));
 //BA.debugLineNum = 1614;BA.debugLine="If m_MouseHoverFeedback = True Then";
if (_m_mousehoverfeedback==__c.True) { 
 //BA.debugLineNum = 1615;BA.debugLine="Dim xlbl_Date As B4XView = xpnl_YearMonth.GetVi";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _xpnl_yearmonth.GetView((int) (0));
 //BA.debugLineNum = 1616;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 1620;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 1621;BA.debugLine="xpnl_YearMonth.AddView(xpnl_selected,0,0,xpnl_Y";
_xpnl_yearmonth.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (0),_xpnl_yearmonth.getWidth(),_xpnl_yearmonth.getHeight());
 //BA.debugLineNum = 1623;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateC";
_xpnl_selected.SetColorAndBorder(_m_selecteddatecolor,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
 //BA.debugLineNum = 1624;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 //BA.debugLineNum = 1625;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedD";
if (_xpnl_selecteddate!= null && _xpnl_selecteddate.IsInitialized()==__c.True) { 
_xpnl_selecteddate.RemoveViewFromParent();};
 //BA.debugLineNum = 1626;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
_xpnl_selecteddate = _xpnl_selected;
 };
 };
 //BA.debugLineNum = 1633;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
