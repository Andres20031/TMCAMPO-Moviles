package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class as_datepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.as_datepicker");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public String  _addmonth(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,long _currentdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "addmonth", true))
	 {return ((String) Debug.delegate(ba, "addmonth", new Object[] {_parent,_currentdate}));}
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
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Private Sub AddMonth(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="Dim BlockHeight As Float = (Parent.Height-g_WeekN";
_blockheight = (float) ((_parent.getHeight()-__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ )/(double)6);
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="Dim BlockWidth As Float = IIf(m_ShowWeekNumbers,(";
_blockwidth = (float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))));
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="If m_ShowWeekNumbers Then AddWeekName(Parent,-1,g";
if (__ref._m_showweeknumbers /*boolean*/ ) { 
__ref._addweekname /*String*/ (null,_parent,(int) (-1),__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Text /*String*/ );};
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="AddWeekName(Parent,0,g_WeekNameShort.Monday)";
__ref._addweekname /*String*/ (null,_parent,(int) (0),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ );
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="AddWeekName(Parent,1,g_WeekNameShort.Tuesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (1),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ );
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="AddWeekName(Parent,2,g_WeekNameShort.Wednesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (2),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ );
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="AddWeekName(Parent,3,g_WeekNameShort.Thursday)";
__ref._addweekname /*String*/ (null,_parent,(int) (3),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ );
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="AddWeekName(Parent,4,g_WeekNameShort.Friday)";
__ref._addweekname /*String*/ (null,_parent,(int) (4),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ );
RDebugUtils.currentLine=37945357;
 //BA.debugLineNum = 37945357;BA.debugLine="AddWeekName(Parent,5,g_WeekNameShort.Saturday)";
__ref._addweekname /*String*/ (null,_parent,(int) (5),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ );
RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="AddWeekName(Parent,6,g_WeekNameShort.Sunday)";
__ref._addweekname /*String*/ (null,_parent,(int) (6),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ );
RDebugUtils.currentLine=37945360;
 //BA.debugLineNum = 37945360;BA.debugLine="Dim FirstDay As Long = GetFirstDayOfWeek2(Current";
_firstday = __ref._getfirstdayofweek2 /*long*/ (null,_currentdate,__ref._m_firstdayofweek /*int*/ );
RDebugUtils.currentLine=37945362;
 //BA.debugLineNum = 37945362;BA.debugLine="Dim CurrenMonth As Int = DateTime.GetMonth(Curren";
_currenmonth = __c.DateTime.GetMonth(_currentdate);
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=37945367;
 //BA.debugLineNum = 37945367;BA.debugLine="For i = 1 To 43 -1";
{
final int step15 = 1;
final int limit15 = (int) (43-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=37945369;
 //BA.debugLineNum = 37945369;BA.debugLine="Dim CurrentDay As Long = FirstDay + DateTime.Tic";
_currentday = (long) (_firstday+__c.DateTime.TicksPerDay*(_i-1)+__c.DateTime.TicksPerHour);
RDebugUtils.currentLine=37945371;
 //BA.debugLineNum = 37945371;BA.debugLine="Dim Rest As Int = (i-1)/7";
_rest = (int) ((_i-1)/(double)7);
RDebugUtils.currentLine=37945372;
 //BA.debugLineNum = 37945372;BA.debugLine="Dim test As Int = (i-1) Mod 7";
_test = (int) ((_i-1)%7);
RDebugUtils.currentLine=37945374;
 //BA.debugLineNum = 37945374;BA.debugLine="Dim xpnl_Date As B4XView = xui.CreatePanel(\"xpnl";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_MonthDate");
RDebugUtils.currentLine=37945375;
 //BA.debugLineNum = 37945375;BA.debugLine="xpnl_Date.Tag = CurrentDay";
_xpnl_date.setTag((Object)(_currentday));
RDebugUtils.currentLine=37945376;
 //BA.debugLineNum = 37945376;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent'm_BodyCo";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37945377;
 //BA.debugLineNum = 37945377;BA.debugLine="Parent.AddView(xpnl_Date,IIf(m_ShowWeekNumbers,g";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_test)),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=37945378;
 //BA.debugLineNum = 37945378;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=37945379;
 //BA.debugLineNum = 37945379;BA.debugLine="xlbl_Date.Tag = \"xlbl_Date\"";
_xlbl_date.setTag((Object)("xlbl_Date"));
RDebugUtils.currentLine=37945380;
 //BA.debugLineNum = 37945380;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=37945381;
 //BA.debugLineNum = 37945381;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=37945382;
 //BA.debugLineNum = 37945382;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=37945383;
 //BA.debugLineNum = 37945383;BA.debugLine="xlbl_Date.Text = DateTime.GetDayOfMonth(CurrentD";
_xlbl_date.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(_currentday)));
RDebugUtils.currentLine=37945386;
 //BA.debugLineNum = 37945386;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=37945388;
 //BA.debugLineNum = 37945388;BA.debugLine="If DateTime.GetMonth(CurrentDay) <> CurrenMonth";
if (__c.DateTime.GetMonth(_currentday)!=_currenmonth) { 
RDebugUtils.currentLine=37945389;
 //BA.debugLineNum = 37945389;BA.debugLine="If m_InactiveDaysVisible = False Then";
if (__ref._m_inactivedaysvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=37945390;
 //BA.debugLineNum = 37945390;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 }else {
RDebugUtils.currentLine=37945392;
 //BA.debugLineNum = 37945392;BA.debugLine="Dim Color() As Int = GetARGB(g_BodyProperties.";
_color = __ref._getargb /*int[]*/ (null,__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=37945393;
 //BA.debugLineNum = 37945393;BA.debugLine="xlbl_Date.TextColor = xui.Color_ARGB(100,Color";
_xlbl_date.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (100),_color[(int) (1)],_color[(int) (2)],_color[(int) (3)]));
 };
 };
RDebugUtils.currentLine=37945397;
 //BA.debugLineNum = 37945397;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=37945398;
 //BA.debugLineNum = 37945398;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 };
RDebugUtils.currentLine=37945403;
 //BA.debugLineNum = 37945403;BA.debugLine="CreateSelectDates(xpnl_Date,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_date,_clr);
RDebugUtils.currentLine=37945405;
 //BA.debugLineNum = 37945405;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,CurrentDay)";
if (_dateutils._issameday(ba,__c.DateTime.getNow(),_currentday)==__c.True && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=37945406;
 //BA.debugLineNum = 37945406;BA.debugLine="Dim xpnl_CurrentDay As B4XView = xui.CreatePane";
_xpnl_currentday = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_currentday = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37945407;
 //BA.debugLineNum = 37945407;BA.debugLine="xpnl_CurrentDay.SetColorAndBorder(m_CurrentDate";
_xpnl_currentday.SetColorAndBorder(__ref._m_currentdatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=37945408;
 //BA.debugLineNum = 37945408;BA.debugLine="xpnl_Date.AddView(xpnl_CurrentDay,BlockWidth/2";
_xpnl_date.AddView((android.view.View)(_xpnl_currentday.getObject()),(int) (_blockwidth/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_blockheight/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 };
RDebugUtils.currentLine=37945412;
 //BA.debugLineNum = 37945412;BA.debugLine="If m_ShowWeekNumbers = True Then";
if (__ref._m_showweeknumbers /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=37945413;
 //BA.debugLineNum = 37945413;BA.debugLine="Dim xpnl_WeekNumber As B4XView = xui.CreatePane";
_xpnl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_weeknumber = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37945414;
 //BA.debugLineNum = 37945414;BA.debugLine="Dim xlbl_WeekNumber As B4XView = CreateLabel(\"\"";
_xlbl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weeknumber = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=37945415;
 //BA.debugLineNum = 37945415;BA.debugLine="Parent.AddView(xpnl_WeekNumber,0,g_WeekNameProp";
_parent.AddView((android.view.View)(_xpnl_weeknumber.getObject()),(int) (0),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=37945416;
 //BA.debugLineNum = 37945416;BA.debugLine="xpnl_WeekNumber.AddView(xlbl_WeekNumber,0,0,g_W";
_xpnl_weeknumber.AddView((android.view.View)(_xlbl_weeknumber.getObject()),(int) (0),(int) (0),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=37945418;
 //BA.debugLineNum = 37945418;BA.debugLine="xpnl_WeekNumber.Color = g_WeekNumberProperties.";
_xpnl_weeknumber.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=37945420;
 //BA.debugLineNum = 37945420;BA.debugLine="xlbl_WeekNumber.SetTextAlignment(\"CENTER\",\"CENT";
_xlbl_weeknumber.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=37945421;
 //BA.debugLineNum = 37945421;BA.debugLine="xlbl_WeekNumber.TextColor = g_WeekNumberPropert";
_xlbl_weeknumber.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=37945422;
 //BA.debugLineNum = 37945422;BA.debugLine="xlbl_WeekNumber.Font = g_WeekNumberProperties.x";
_xlbl_weeknumber.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=37945423;
 //BA.debugLineNum = 37945423;BA.debugLine="xlbl_WeekNumber.Text = GetWeekNumberStartingFro";
_xlbl_weeknumber.setText(BA.ObjectToCharSequence(__ref._getweeknumberstartingfrommonday /*int*/ (null,_currentday)));
 };
RDebugUtils.currentLine=37945426;
 //BA.debugLineNum = 37945426;BA.debugLine="CustomDrawDay(CurrentDay,xpnl_Date)";
__ref._customdrawday /*String*/ (null,_currentday,_xpnl_date);
 }
};
RDebugUtils.currentLine=37945430;
 //BA.debugLineNum = 37945430;BA.debugLine="If m_ShowGridLines Then";
if (__ref._m_showgridlines /*boolean*/ ) { 
RDebugUtils.currentLine=37945431;
 //BA.debugLineNum = 37945431;BA.debugLine="Dim xpnl_CanvasBackground As B4XView = xui.Creat";
_xpnl_canvasbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_canvasbackground = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37945432;
 //BA.debugLineNum = 37945432;BA.debugLine="Parent.AddView(xpnl_CanvasBackground,0,0,Parent.";
_parent.AddView((android.view.View)(_xpnl_canvasbackground.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=37945433;
 //BA.debugLineNum = 37945433;BA.debugLine="xpnl_CanvasBackground.Color = xui.Color_Transpar";
_xpnl_canvasbackground.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37945441;
 //BA.debugLineNum = 37945441;BA.debugLine="Dim xcv As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=37945442;
 //BA.debugLineNum = 37945442;BA.debugLine="xcv.Initialize(xpnl_CanvasBackground)";
_xcv.Initialize(_xpnl_canvasbackground);
RDebugUtils.currentLine=37945443;
 //BA.debugLineNum = 37945443;BA.debugLine="xcv.ClearRect(xcv.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
RDebugUtils.currentLine=37945445;
 //BA.debugLineNum = 37945445;BA.debugLine="For i = 0 To 6 -1 'Add Divider Vertical";
{
final int step67 = 1;
final int limit67 = (int) (6-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=37945446;
 //BA.debugLineNum = 37945446;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumber";
_xcv.DrawLine((float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (0),(float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (_parent.getHeight()),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=37945448;
 //BA.debugLineNum = 37945448;BA.debugLine="If i < 5 Then xcv.DrawLine(0,g_WeekNameProperti";
if (_i<5) { 
_xcv.DrawLine((float) (0),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),(float) (_parent.getWidth()),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));};
 }
};
RDebugUtils.currentLine=37945451;
 //BA.debugLineNum = 37945451;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumberP";
_xcv.DrawLine((float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0))))),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,(float) (_parent.getWidth()),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=37945453;
 //BA.debugLineNum = 37945453;BA.debugLine="xcv.Invalidate";
_xcv.Invalidate();
 };
RDebugUtils.currentLine=37945456;
 //BA.debugLineNum = 37945456;BA.debugLine="End Sub";
return "";
}
public int[]  _getargb(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=42860547;
 //BA.debugLineNum = 42860547;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=42860548;
 //BA.debugLineNum = 42860548;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=42860549;
 //BA.debugLineNum = 42860549;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=42860550;
 //BA.debugLineNum = 42860550;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=42860551;
 //BA.debugLineNum = 42860551;BA.debugLine="End Sub";
return null;
}
public String  _addweekname(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background,int _i,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "addweekname", true))
	 {return ((String) Debug.delegate(ba, "addweekname", new Object[] {_xpnl_background,_i,_text}));}
float _blockheight = 0f;
float _blockwidth = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_weekname = null;
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub AddWeekName(xpnl_Background As B4XView";
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="Dim BlockHeight As Float = g_WeekNameProperties.H";
_blockheight = __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ;
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="Dim BlockWidth As Float = Floor(IIf(m_ShowWeekNum";
_blockwidth = (float) (__c.Floor((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : (((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))))))));
RDebugUtils.currentLine=37552133;
 //BA.debugLineNum = 37552133;BA.debugLine="Dim xlbl_WeekName As B4XView = CreateLabel(\"\")";
_xlbl_weekname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weekname = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=37552135;
 //BA.debugLineNum = 37552135;BA.debugLine="xlbl_WeekName.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_weekname.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=37552136;
 //BA.debugLineNum = 37552136;BA.debugLine="xlbl_WeekName.Text = Text";
_xlbl_weekname.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=37552137;
 //BA.debugLineNum = 37552137;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=37552138;
 //BA.debugLineNum = 37552138;BA.debugLine="xlbl_WeekName.Color = g_WeekNumberProperties.Col";
_xlbl_weekname.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=37552139;
 //BA.debugLineNum = 37552139;BA.debugLine="xlbl_WeekName.Font = g_WeekNumberProperties.xFon";
_xlbl_weekname.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=37552140;
 //BA.debugLineNum = 37552140;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNumberProperties";
_xlbl_weekname.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
 }else {
RDebugUtils.currentLine=37552142;
 //BA.debugLineNum = 37552142;BA.debugLine="xlbl_WeekName.Color = g_WeekNameProperties.Color";
_xlbl_weekname.setColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=37552143;
 //BA.debugLineNum = 37552143;BA.debugLine="xlbl_WeekName.Font = g_WeekNameProperties.xFont";
_xlbl_weekname.setFont(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=37552144;
 //BA.debugLineNum = 37552144;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNameProperties.T";
_xlbl_weekname.setTextColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=37552147;
 //BA.debugLineNum = 37552147;BA.debugLine="xpnl_Background.AddView(xlbl_WeekName,IIf(i = -1,";
_xpnl_background.AddView((android.view.View)(_xlbl_weekname.getObject()),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(0)) : ((Object)((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_i)))))),(int) (0),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(_blockwidth))))),(int) (_blockheight));
RDebugUtils.currentLine=37552148;
 //BA.debugLineNum = 37552148;BA.debugLine="End Sub";
return "";
}
public long  _getfirstdayofweek2(b4a.example.ef.as_datepicker __ref,long _ticks,int _firstdayofweek) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getfirstdayofweek2", true))
	 {return ((Long) Debug.delegate(ba, "getfirstdayofweek2", new Object[] {_ticks,_firstdayofweek}));}
b4a.example.dateutils._period _p = null;
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Public Sub GetFirstDayOfWeek2(Ticks As Long,FirstD";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="p.Days = -((DateTime.GetDayOfWeek(Ticks)+FirstDay";
_p.Days = (int) (-((__c.DateTime.GetDayOfWeek(_ticks)+_firstdayofweek)%7));
RDebugUtils.currentLine=43188227;
 //BA.debugLineNum = 43188227;BA.debugLine="Return DateUtils.AddPeriod(Ticks, p)";
if (true) return _dateutils._addperiod(ba,_ticks,_p);
RDebugUtils.currentLine=43188228;
 //BA.debugLineNum = 43188228;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=42926082;
 //BA.debugLineNum = 42926082;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=42926083;
 //BA.debugLineNum = 42926083;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=42926084;
 //BA.debugLineNum = 42926084;BA.debugLine="End Sub";
return null;
}
public String  _createselectdates(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_date,int[] _clr) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createselectdates", true))
	 {return ((String) Debug.delegate(ba, "createselectdates", new Object[] {_xpnl_date,_clr}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
long _currentday = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _v = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub CreateSelectDates(xpnl_Date As B4XView";
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="For Each View As B4XView In xpnl_Date.GetAllViews";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _xpnl_date.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=38273030;
 //BA.debugLineNum = 38273030;BA.debugLine="Dim CurrentDay As Long = xpnl_Date.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_date.getTag());
RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=38273033;
 //BA.debugLineNum = 38273033;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=38273034;
 //BA.debugLineNum = 38273034;BA.debugLine="CreateSelectedDate(xpnl_Date,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.True);
 }else 
{RDebugUtils.currentLine=38273035;
 //BA.debugLineNum = 38273035;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Selecte";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=38273036;
 //BA.debugLineNum = 38273036;BA.debugLine="CreateSelectedDate(xpnl_Date,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.False);
 }}
;
RDebugUtils.currentLine=38273039;
 //BA.debugLineNum = 38273039;BA.debugLine="For Each v As B4XView In xpnl_Date.GetAllViewsRe";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = _xpnl_date.GetAllViewsRecursive();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group12.Get(index12)));
RDebugUtils.currentLine=38273040;
 //BA.debugLineNum = 38273040;BA.debugLine="If \"RangeItem\" = v.Tag Then";
if (("RangeItem").equals(BA.ObjectToString(_v.getTag()))) { 
RDebugUtils.currentLine=38273041;
 //BA.debugLineNum = 38273041;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=38273042;
 //BA.debugLineNum = 38273042;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=38273046;
 //BA.debugLineNum = 38273046;BA.debugLine="If m_SelectedDate > 0 And m_SelectedDate2 > 0 An";
if (__ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0 && ((_currentday>=__ref._m_selecteddate /*long*/  && _currentday<=__ref._m_selecteddate2 /*long*/ ) || (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )))) { 
RDebugUtils.currentLine=38273047;
 //BA.debugLineNum = 38273047;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=38273048;
 //BA.debugLineNum = 38273048;BA.debugLine="xpnl_selected.Tag = \"RangeItem\"";
_xpnl_selected.setTag((Object)("RangeItem"));
RDebugUtils.currentLine=38273049;
 //BA.debugLineNum = 38273049;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDat";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ )) { 
RDebugUtils.currentLine=38273050;
 //BA.debugLineNum = 38273050;BA.debugLine="xpnl_Date.AddView(xpnl_selected,xpnl_Date.Widt";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_date.getWidth()/(double)2),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else 
{RDebugUtils.currentLine=38273051;
 //BA.debugLineNum = 38273051;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Select";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )) { 
RDebugUtils.currentLine=38273052;
 //BA.debugLineNum = 38273052;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else {
RDebugUtils.currentLine=38273054;
 //BA.debugLineNum = 38273054;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),_xpnl_date.getWidth(),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }}
;
RDebugUtils.currentLine=38273057;
 //BA.debugLineNum = 38273057;BA.debugLine="xpnl_selected.Color = xui.Color_ARGB(80,clr(1),";
_xpnl_selected.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),_clr[(int) (1)],_clr[(int) (2)],_clr[(int) (3)]));
RDebugUtils.currentLine=38273058;
 //BA.debugLineNum = 38273058;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 };
 }else {
RDebugUtils.currentLine=38273062;
 //BA.debugLineNum = 38273062;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=38273063;
 //BA.debugLineNum = 38273063;BA.debugLine="MonthDateClick(xpnl_Date,False)";
__ref._monthdateclick /*String*/ (null,_xpnl_date,__c.False);
 };
 };
RDebugUtils.currentLine=38273068;
 //BA.debugLineNum = 38273068;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate)";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || ((__ref._m_selectmode /*String*/ ).equals(__ref._getselectmode_range /*String*/ (null)) && _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ))) { 
RDebugUtils.currentLine=38273069;
 //BA.debugLineNum = 38273069;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedT";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
 }else {
RDebugUtils.currentLine=38273071;
 //BA.debugLineNum = 38273071;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=38273075;
 //BA.debugLineNum = 38273075;BA.debugLine="End Sub";
return "";
}
public int  _getweeknumberstartingfrommonday(b4a.example.ef.as_datepicker __ref,long _ticks) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknumberstartingfrommonday", true))
	 {return ((Integer) Debug.delegate(ba, "getweeknumberstartingfrommonday", new Object[] {_ticks}));}
int _weekdayoffirstdayofyear = 0;
int _firstmondayinyear = 0;
int _result = 0;
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Private Sub GetWeekNumberStartingFromMonday (ticks";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="Dim WeekDayOfFirstDayOfYear As Int = DateTime.Get";
_weekdayoffirstdayofyear = (int) (__c.DateTime.GetDayOfWeek(_dateutils._setdate(ba,__c.DateTime.GetYear(_ticks),(int) (1),(int) (1)))-1);
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="Dim FirstMondayInYear As Int = (7 + WeekDayOfFirs";
_firstmondayinyear = (int) ((7+_weekdayoffirstdayofyear-1)%7);
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=43122692;
 //BA.debugLineNum = 43122692;BA.debugLine="If WeekDayOfFirstDayOfYear <> 1 Then result = res";
if (_weekdayoffirstdayofyear!=1) { 
_result = (int) (_result-1);};
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="result = result + Floor((DateTime.GetDayOfYear(ti";
_result = (int) (_result+__c.Floor((__c.DateTime.GetDayOfYear(_ticks)-1+_firstmondayinyear)/(double)7)+1);
RDebugUtils.currentLine=43122694;
 //BA.debugLineNum = 43122694;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=43122695;
 //BA.debugLineNum = 43122695;BA.debugLine="End Sub";
return 0;
}
public String  _customdrawday(b4a.example.ef.as_datepicker __ref,long _date,anywheresoftware.b4a.objects.B4XViewWrapper _backgroundpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawday", true))
	 {return ((String) Debug.delegate(ba, "customdrawday", new Object[] {_date,_backgroundpanel}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawday _m_customdrawday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub CustomDrawDay(Date As Long,BackgroundP";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(int) (2))) { 
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="Dim m_CustomDrawDay As ASDatePicker_CustomDrawDa";
_m_customdrawday = new b4a.example.ef.as_datepicker._asdatepicker_customdrawday();
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="m_CustomDrawDay.Initialize";
_m_customdrawday.Initialize();
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="m_CustomDrawDay.BackgroundPanel = BackgroundPane";
_m_customdrawday.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _backgroundpanel;
RDebugUtils.currentLine=41943047;
 //BA.debugLineNum = 41943047;BA.debugLine="For Each View As B4XView In BackgroundPanel.GetA";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _backgroundpanel.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=41943049;
 //BA.debugLineNum = 41943049;BA.debugLine="If \"xlbl_Date\" = View.Tag Then";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
RDebugUtils.currentLine=41943050;
 //BA.debugLineNum = 41943050;BA.debugLine="m_CustomDrawDay.xlbl_Date = View";
_m_customdrawday.xlbl_Date /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
 };
 }
};
RDebugUtils.currentLine=41943055;
 //BA.debugLineNum = 41943055;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawDay";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(Object)(_date),(Object)(_m_customdrawday));
 };
RDebugUtils.currentLine=41943057;
 //BA.debugLineNum = 41943057;BA.debugLine="End Sub";
return "";
}
public String  _addyear(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,long _currentdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "addyear", true))
	 {return ((String) Debug.delegate(ba, "addyear", new Object[] {_parent,_currentdate}));}
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
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Private Sub AddYear(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Dim BlockHeight As Float = xpnl_ViewPager.Height/";
_blockheight = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="Dim BlockWidth As Float = xpnl_ViewPager.Width/3";
_blockwidth = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3);
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="For i = 1 To 13 -1";
{
final int step4 = 1;
final int limit4 = (int) (13-1);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=38010891;
 //BA.debugLineNum = 38010891;BA.debugLine="Dim Rest As Int = (i-1)/3";
_rest = (int) ((_i-1)/(double)3);
RDebugUtils.currentLine=38010892;
 //BA.debugLineNum = 38010892;BA.debugLine="Dim test As Int = (i-1) Mod 3";
_test = (int) ((_i-1)%3);
RDebugUtils.currentLine=38010894;
 //BA.debugLineNum = 38010894;BA.debugLine="Dim Text As String = \"\"";
_text = "";
RDebugUtils.currentLine=38010895;
 //BA.debugLineNum = 38010895;BA.debugLine="Dim xpnl_Date As B4XView";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38010896;
 //BA.debugLineNum = 38010896;BA.debugLine="Dim SelectThisPanel As Boolean = False";
_selectthispanel = __c.False;
RDebugUtils.currentLine=38010897;
 //BA.debugLineNum = 38010897;BA.debugLine="If m_CurrentView = getCurrentView_YearView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=38010898;
 //BA.debugLineNum = 38010898;BA.debugLine="Text = GetMonthNameByIndex(i)";
_text = __ref._getmonthnamebyindex /*String*/ (null,_i);
RDebugUtils.currentLine=38010899;
 //BA.debugLineNum = 38010899;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_YearMonth\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_YearMonth");
RDebugUtils.currentLine=38010900;
 //BA.debugLineNum = 38010900;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,__c.DateTime.GetYear(_currentdate),_i,(int) (1))));
RDebugUtils.currentLine=38010901;
 //BA.debugLineNum = 38010901;BA.debugLine="If DateTime.GetMonth(xpnl_Date.Tag) = DateTime.";
if (__c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetMonth(__c.DateTime.getNow()) && __c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=38010903;
 //BA.debugLineNum = 38010903;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_mindate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=38010904;
 //BA.debugLineNum = 38010904;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=38010907;
 //BA.debugLineNum = 38010907;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=38010908;
 //BA.debugLineNum = 38010908;BA.debugLine="Text = DateTime.GetYear(CurrentDate)+(i-1)";
_text = BA.NumberToString(__c.DateTime.GetYear(_currentdate)+(_i-1));
RDebugUtils.currentLine=38010909;
 //BA.debugLineNum = 38010909;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_DecadeYear\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_DecadeYear");
RDebugUtils.currentLine=38010910;
 //BA.debugLineNum = 38010910;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*1),(int) (1),(int) (1))));
RDebugUtils.currentLine=38010911;
 //BA.debugLineNum = 38010911;BA.debugLine="If DateTime.GetYear(xpnl_Date.Tag) = DateTime.G";
if (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=38010913;
 //BA.debugLineNum = 38010913;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And ((DateT";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && ((__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=38010914;
 //BA.debugLineNum = 38010914;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=38010917;
 //BA.debugLineNum = 38010917;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVi";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=38010918;
 //BA.debugLineNum = 38010918;BA.debugLine="Text = (DateTime.GetYear(CurrentDate)+(i-1)*10)";
_text = BA.NumberToString((__c.DateTime.GetYear(_currentdate)+(_i-1)*10))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9));
RDebugUtils.currentLine=38010919;
 //BA.debugLineNum = 38010919;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_CenturyDecade";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_CenturyDecade");
RDebugUtils.currentLine=38010920;
 //BA.debugLineNum = 38010920;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*10),(int) (1),(int) (1))));
RDebugUtils.currentLine=38010921;
 //BA.debugLineNum = 38010921;BA.debugLine="If DateTime.GetYear(DateTime.Now) >= (DateTime.";
if (__c.DateTime.GetYear(__c.DateTime.getNow())>=(__c.DateTime.GetYear(_currentdate)+(_i-1)*10) && __c.DateTime.GetYear(__c.DateTime.getNow())<=((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=38010928;
 //BA.debugLineNum = 38010928;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) || ((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=38010929;
 //BA.debugLineNum = 38010929;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }}}
;
RDebugUtils.currentLine=38010934;
 //BA.debugLineNum = 38010934;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=38010935;
 //BA.debugLineNum = 38010935;BA.debugLine="Parent.AddView(xpnl_Date,BlockWidth*test,BlockHe";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) (_blockwidth*_test),(int) (_blockheight*_rest),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=38010936;
 //BA.debugLineNum = 38010936;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=38010938;
 //BA.debugLineNum = 38010938;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=38010939;
 //BA.debugLineNum = 38010939;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=38010940;
 //BA.debugLineNum = 38010940;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=38010942;
 //BA.debugLineNum = 38010942;BA.debugLine="xlbl_Date.Text = Text";
_xlbl_date.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=38010944;
 //BA.debugLineNum = 38010944;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=38010946;
 //BA.debugLineNum = 38010946;BA.debugLine="If SelectThisPanel Then";
if (_selectthispanel) { 
RDebugUtils.currentLine=38010947;
 //BA.debugLineNum = 38010947;BA.debugLine="Dim xpnl_Current As B4XView = xui.CreatePanel(\"";
_xpnl_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_current = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=38010948;
 //BA.debugLineNum = 38010948;BA.debugLine="Dim StrokeWidth As Float = 2dip";
_strokewidth = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=38010949;
 //BA.debugLineNum = 38010949;BA.debugLine="xpnl_Date.AddView(xpnl_Current,StrokeWidth,Stro";
_xpnl_date.AddView((android.view.View)(_xpnl_current.getObject()),(int) (_strokewidth),(int) (_strokewidth),(int) (_blockwidth-_strokewidth*2),(int) (_blockheight-_strokewidth*2));
RDebugUtils.currentLine=38010951;
 //BA.debugLineNum = 38010951;BA.debugLine="xpnl_Current.SetColorAndBorder(xui.Color_Transp";
_xpnl_current.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (_strokewidth),__ref._m_currentdatecolor /*int*/ ,__c.DipToCurrent((int) (5)));
 };
 }
};
RDebugUtils.currentLine=38010955;
 //BA.debugLineNum = 38010955;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_yearview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_yearview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_yearview", null));}
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Public Sub getCurrentView_YearView As String";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Return \"YearView\"";
if (true) return "YearView";
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="End Sub";
return "";
}
public String  _getmonthnamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getmonthnamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Private Sub GetMonthNameByIndex(index As Int) As S";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="If index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="Return g_MonthNameShort.January";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .January /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057155;
 //BA.debugLineNum = 43057155;BA.debugLine="else If index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=43057156;
 //BA.debugLineNum = 43057156;BA.debugLine="Return g_MonthNameShort.February";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .February /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057157;
 //BA.debugLineNum = 43057157;BA.debugLine="else If index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=43057158;
 //BA.debugLineNum = 43057158;BA.debugLine="Return g_MonthNameShort.March";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .March /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057159;
 //BA.debugLineNum = 43057159;BA.debugLine="else If index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=43057160;
 //BA.debugLineNum = 43057160;BA.debugLine="Return g_MonthNameShort.April";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .April /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057161;
 //BA.debugLineNum = 43057161;BA.debugLine="else If index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=43057162;
 //BA.debugLineNum = 43057162;BA.debugLine="Return g_MonthNameShort.May";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .May /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057163;
 //BA.debugLineNum = 43057163;BA.debugLine="else If index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=43057164;
 //BA.debugLineNum = 43057164;BA.debugLine="Return g_MonthNameShort.June";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .June /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057165;
 //BA.debugLineNum = 43057165;BA.debugLine="else If index = 7 Then";
if (_index==7) { 
RDebugUtils.currentLine=43057166;
 //BA.debugLineNum = 43057166;BA.debugLine="Return g_MonthNameShort.July";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .July /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057167;
 //BA.debugLineNum = 43057167;BA.debugLine="else If index = 8 Then";
if (_index==8) { 
RDebugUtils.currentLine=43057168;
 //BA.debugLineNum = 43057168;BA.debugLine="Return g_MonthNameShort.August";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .August /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057169;
 //BA.debugLineNum = 43057169;BA.debugLine="else If index = 9 Then";
if (_index==9) { 
RDebugUtils.currentLine=43057170;
 //BA.debugLineNum = 43057170;BA.debugLine="Return g_MonthNameShort.September";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .September /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057171;
 //BA.debugLineNum = 43057171;BA.debugLine="else If index = 10 Then";
if (_index==10) { 
RDebugUtils.currentLine=43057172;
 //BA.debugLineNum = 43057172;BA.debugLine="Return g_MonthNameShort.October";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .October /*String*/ ;
 }else 
{RDebugUtils.currentLine=43057173;
 //BA.debugLineNum = 43057173;BA.debugLine="else If index = 11 Then";
if (_index==11) { 
RDebugUtils.currentLine=43057174;
 //BA.debugLineNum = 43057174;BA.debugLine="Return g_MonthNameShort.November";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .November /*String*/ ;
 }else {
RDebugUtils.currentLine=43057176;
 //BA.debugLineNum = 43057176;BA.debugLine="Return g_MonthNameShort.December";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .December /*String*/ ;
 }}}}}}}}}}}
;
RDebugUtils.currentLine=43057178;
 //BA.debugLineNum = 43057178;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_decadeview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_decadeview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_decadeview", null));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Public Sub getCurrentView_DecadeView As String";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Return \"DecadeView\"";
if (true) return "DecadeView";
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_centuryview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_centuryview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_centuryview", null));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub getCurrentView_CenturyView As String";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Return \"CenturyView\"";
if (true) return "CenturyView";
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="End Sub";
return "";
}
public void  _base_resize(b4a.example.ef.as_datepicker __ref,double _width,double _height) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {Debug.delegate(ba, "base_resize", new Object[] {_width,_height}); return;}
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(this,__ref,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref,double _width,double _height) {
this.parent = parent;
this.__ref = __ref;
this._width = _width;
this._height = _height;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
b4a.example.ef.as_datepicker parent;
double _width;
double _height;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="xiv_RefreshImage.SetLayoutAnimated(0,0,0,Width,He";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="xpnl_Header.SetLayoutAnimated(0,0,0,Width,g_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="xpnl_ViewPager.SetLayoutAnimated(0,0,g_HeaderProp";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),(int) (_width),(int) (_height-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="xASVP_Main.Base_Resize(Width,xpnl_ViewPager.Heigh";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._base_resize /*void*/ (null,_width,__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37421063;
 //BA.debugLineNum = 37421063;BA.debugLine="xpnl_Header.GetView(0).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37421064;
 //BA.debugLineNum = 37421064;BA.debugLine="xpnl_Header.GetView(1).SetLayoutAnimated(0,0,0,xp";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37421065;
 //BA.debugLineNum = 37421065;BA.debugLine="xpnl_Header.GetView(2).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2)).SetLayoutAnimated((int) (0),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37421067;
 //BA.debugLineNum = 37421067;BA.debugLine="xASVP_Main.ResetLazyLoadingPanels";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingpanels /*String*/ (null);
RDebugUtils.currentLine=37421068;
 //BA.debugLineNum = 37421068;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "base_resize"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=37421069;
 //BA.debugLineNum = 37421069;BA.debugLine="xASVP_Main.ResetLazyloadingIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingindex /*String*/ (null);
RDebugUtils.currentLine=37421070;
 //BA.debugLineNum = 37421070;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=37421071;
 //BA.debugLineNum = 37421071;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _changeview(b4a.example.ef.as_datepicker __ref,String _newview) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "changeview", true))
	 {Debug.delegate(ba, "changeview", new Object[] {_newview}); return;}
ResumableSub_ChangeView rsub = new ResumableSub_ChangeView(this,__ref,_newview);
rsub.resume(ba, null);
}
public static class ResumableSub_ChangeView extends BA.ResumableSub {
public ResumableSub_ChangeView(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref,String _newview) {
this.parent = parent;
this.__ref = __ref;
this._newview = _newview;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
b4a.example.ef.as_datepicker parent;
String _newview;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,True)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.True);
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="m_CurrentView = NewView";
__ref._m_currentview /*String*/  = _newview;
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "changeview"),(int) (250));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="Select Case NewView";
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_newview,__ref._getcurrentview_monthview /*String*/ (null),__ref._getcurrentview_yearview /*String*/ (null),__ref._getcurrentview_decadeview /*String*/ (null),__ref._getcurrentview_centuryview /*String*/ (null))) {
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
RDebugUtils.currentLine=38076423;
 //BA.debugLineNum = 38076423;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=38076425;
 //BA.debugLineNum = 38076425;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=38076427;
 //BA.debugLineNum = 38076427;BA.debugLine="CreateDecadeView";
__ref._createdecadeview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=38076429;
 //BA.debugLineNum = 38076429;BA.debugLine="CreateCenturyView";
__ref._createcenturyview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=38076431;
 //BA.debugLineNum = 38076431;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
RDebugUtils.currentLine=38076432;
 //BA.debugLineNum = 38076432;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _getcurrentview_monthview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_monthview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_monthview", null));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Public Sub getCurrentView_MonthView As String";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="Return \"MonthView\"";
if (true) return "MonthView";
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="End Sub";
return "";
}
public void  _createmonthview(b4a.example.ef.as_datepicker __ref) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createmonthview", true))
	 {Debug.delegate(ba, "createmonthview", null); return;}
ResumableSub_CreateMonthView rsub = new ResumableSub_CreateMonthView(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateMonthView extends BA.ResumableSub {
public ResumableSub_CreateMonthView(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
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
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="Dim YearGap As Int = 1";
_yeargap = (int) (1);
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="Dim StartDate As Long = DateUtils.SetDate(DateTim";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=37683205;
 //BA.debugLineNum = 37683205;BA.debugLine="Dim Enddate As Long = DateUtils.SetDate(DateTime.";
_enddate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="If m_MinDate > 0 Then StartDate = m_MinDate";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._m_mindate /*long*/ >0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_startdate = __ref._m_mindate /*long*/ ;
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="Dim NumberOfMonths As Int = IIf(m_MaxDate=0, Mont";
_numberofmonths = (int)(BA.ObjectToNumber(((__ref._m_maxdate /*long*/ ==0) ? ((Object)(__ref._monthbetween /*int*/ (null,_startdate,_enddate))) : ((Object)(0)))));
RDebugUtils.currentLine=37683210;
 //BA.debugLineNum = 37683210;BA.debugLine="If m_MaxDate > 0 Then";
if (true) break;

case 7:
//if
this.state = 16;
if (__ref._m_maxdate /*long*/ >0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=37683211;
 //BA.debugLineNum = 37683211;BA.debugLine="Dim MonthsBetween As Int = MonthBetween(StartDat";
_monthsbetween = __ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ );
RDebugUtils.currentLine=37683212;
 //BA.debugLineNum = 37683212;BA.debugLine="Dim tmp As Period";
_tmp = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37683213;
 //BA.debugLineNum = 37683213;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
RDebugUtils.currentLine=37683214;
 //BA.debugLineNum = 37683214;BA.debugLine="tmp.Months = MonthsBetween";
_tmp.Months = _monthsbetween;
RDebugUtils.currentLine=37683215;
 //BA.debugLineNum = 37683215;BA.debugLine="If DateUtils.AddPeriod(StartDate,tmp) < m_MaxDat";
if (true) break;

case 10:
//if
this.state = 15;
if (parent._dateutils._addperiod(ba,_startdate,_tmp)<__ref._m_maxdate /*long*/ ) { 
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
RDebugUtils.currentLine=37683216;
 //BA.debugLineNum = 37683216;BA.debugLine="NumberOfMonths = Max(MonthsBetween,1)";
_numberofmonths = (int) (parent.__c.Max(_monthsbetween,1));
 if (true) break;
;
RDebugUtils.currentLine=37683219;
 //BA.debugLineNum = 37683219;BA.debugLine="For i = 0 To NumberOfMonths -1";

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
RDebugUtils.currentLine=37683221;
 //BA.debugLineNum = 37683221;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37683222;
 //BA.debugLineNum = 37683222;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37683223;
 //BA.debugLineNum = 37683223;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37683225;
 //BA.debugLineNum = 37683225;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37683226;
 //BA.debugLineNum = 37683226;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=37683227;
 //BA.debugLineNum = 37683227;BA.debugLine="p2.Months = i";
_p2.Months = _i;
RDebugUtils.currentLine=37683229;
 //BA.debugLineNum = 37683229;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=37683230;
 //BA.debugLineNum = 37683230;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate(";
_firstdayofmonth = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(_currenttime),parent.__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=37683232;
 //BA.debugLineNum = 37683232;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfMon";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
RDebugUtils.currentLine=37683234;
 //BA.debugLineNum = 37683234;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
if (true) break;

case 19:
//if
this.state = 24;
if (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )==parent.__c.DateTime.GetYear(_currenttime) && parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ )==parent.__c.DateTime.GetMonth(_currenttime)) { 
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
RDebugUtils.currentLine=37683240;
 //BA.debugLineNum = 37683240;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=37683245;
 //BA.debugLineNum = 37683245;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=37683246;
 //BA.debugLineNum = 37683246;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=37683248;
 //BA.debugLineNum = 37683248;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=37683249;
 //BA.debugLineNum = 37683249;BA.debugLine="m_isReady = True";
__ref._m_isready /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=37683332;
 //BA.debugLineNum = 37683332;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _createyearview(b4a.example.ef.as_datepicker __ref) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createyearview", true))
	 {Debug.delegate(ba, "createyearview", null); return;}
ResumableSub_CreateYearView rsub = new ResumableSub_CreateYearView(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateYearView extends BA.ResumableSub {
public ResumableSub_CreateYearView(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
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
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="Dim YearGap As Int = 10";
_yeargap = (int) (10);
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=37748741;
 //BA.debugLineNum = 37748741;BA.debugLine="If m_MinDate = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._m_mindate /*long*/ ==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="StartDate =	DateUtils.SetDate(DateTime.GetYear(m";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),(int) (1),(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=37748744;
 //BA.debugLineNum = 37748744;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=37748747;
 //BA.debugLineNum = 37748747;BA.debugLine="Dim FirstDateOfFuture As Long = DateUtils.SetDate";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
RDebugUtils.currentLine=37748749;
 //BA.debugLineNum = 37748749;BA.debugLine="Dim NumberOfYears As Int";
_numberofyears = 0;
RDebugUtils.currentLine=37748751;
 //BA.debugLineNum = 37748751;BA.debugLine="If m_MaxDate = 0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._m_maxdate /*long*/ ==0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=37748752;
 //BA.debugLineNum = 37748752;BA.debugLine="NumberOfYears = MonthBetween(StartDate,FirstDate";
_numberofyears = (int) (__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=37748754;
 //BA.debugLineNum = 37748754;BA.debugLine="Dim YearsBetween As Int = Ceil(MonthBetween(Star";
_yearsbetween = (int) (parent.__c.Ceil(__ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ )/(double)12));
RDebugUtils.currentLine=37748755;
 //BA.debugLineNum = 37748755;BA.debugLine="NumberOfYears = Max(YearsBetween,1)";
_numberofyears = (int) (parent.__c.Max(_yearsbetween,1));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=37748758;
 //BA.debugLineNum = 37748758;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=37748764;
 //BA.debugLineNum = 37748764;BA.debugLine="For i = 0 To NumberOfYears -1";
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
RDebugUtils.currentLine=37748766;
 //BA.debugLineNum = 37748766;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37748767;
 //BA.debugLineNum = 37748767;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37748768;
 //BA.debugLineNum = 37748768;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37748770;
 //BA.debugLineNum = 37748770;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37748771;
 //BA.debugLineNum = 37748771;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=37748772;
 //BA.debugLineNum = 37748772;BA.debugLine="p2.Years = i";
_p2.Years = _i;
RDebugUtils.currentLine=37748774;
 //BA.debugLineNum = 37748774;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=37748777;
 //BA.debugLineNum = 37748777;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=37748779;
 //BA.debugLineNum = 37748779;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
if (true) break;

case 16:
//if
this.state = 21;
if (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )==parent.__c.DateTime.GetYear(_currenttime)) { 
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
RDebugUtils.currentLine=37748785;
 //BA.debugLineNum = 37748785;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createyearview"),(int) (0));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=37748795;
 //BA.debugLineNum = 37748795;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=37748796;
 //BA.debugLineNum = 37748796;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=37748798;
 //BA.debugLineNum = 37748798;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _createdecadeview(b4a.example.ef.as_datepicker __ref) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createdecadeview", true))
	 {Debug.delegate(ba, "createdecadeview", null); return;}
ResumableSub_CreateDecadeView rsub = new ResumableSub_CreateDecadeView(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateDecadeView extends BA.ResumableSub {
public ResumableSub_CreateDecadeView(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
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
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="Dim CurrentDecade As Long = DateUtils.SetDate(Dat";
_currentdecade = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ ),(int) (1),(int) (1))),(int) (1),(int) (1));
RDebugUtils.currentLine=37814280;
 //BA.debugLineNum = 37814280;BA.debugLine="Dim YearGap As Int = 50";
_yeargap = (int) (50);
RDebugUtils.currentLine=37814282;
 //BA.debugLineNum = 37814282;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=37814283;
 //BA.debugLineNum = 37814283;BA.debugLine="If m_MinDate = 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._m_mindate /*long*/ ==0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=37814284;
 //BA.debugLineNum = 37814284;BA.debugLine="StartDate =	DateUtils.SetDate(1400,12,31)";
_startdate = parent._dateutils._setdate(ba,(int) (1400),(int) (12),(int) (31));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=37814286;
 //BA.debugLineNum = 37814286;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=37814289;
 //BA.debugLineNum = 37814289;BA.debugLine="Dim FirstDateOfFuture As Long";
_firstdateoffuture = 0L;
RDebugUtils.currentLine=37814290;
 //BA.debugLineNum = 37814290;BA.debugLine="If m_MaxDate = 0 Then";
if (true) break;

case 7:
//if
this.state = 12;
if (__ref._m_maxdate /*long*/ ==0) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=37814291;
 //BA.debugLineNum = 37814291;BA.debugLine="FirstDateOfFuture = DateUtils.SetDate(DateTime.G";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=37814293;
 //BA.debugLineNum = 37814293;BA.debugLine="FirstDateOfFuture = m_MaxDate";
_firstdateoffuture = __ref._m_maxdate /*long*/ ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=37814297;
 //BA.debugLineNum = 37814297;BA.debugLine="Dim NumberOfDecades As Int = Ceil(Max((MonthBetwe";
_numberofdecades = (int) (parent.__c.Ceil(parent.__c.Max((__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12)/(double)10,1)));
RDebugUtils.currentLine=37814299;
 //BA.debugLineNum = 37814299;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=37814305;
 //BA.debugLineNum = 37814305;BA.debugLine="For i = 0 To NumberOfDecades -1";
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
RDebugUtils.currentLine=37814307;
 //BA.debugLineNum = 37814307;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37814308;
 //BA.debugLineNum = 37814308;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37814309;
 //BA.debugLineNum = 37814309;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37814311;
 //BA.debugLineNum = 37814311;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37814312;
 //BA.debugLineNum = 37814312;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=37814313;
 //BA.debugLineNum = 37814313;BA.debugLine="p2.Years = i*10";
_p2.Years = (int) (_i*10);
RDebugUtils.currentLine=37814315;
 //BA.debugLineNum = 37814315;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=37814318;
 //BA.debugLineNum = 37814318;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=37814320;
 //BA.debugLineNum = 37814320;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=37814322;
 //BA.debugLineNum = 37814322;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=37814326;
 //BA.debugLineNum = 37814326;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createdecadeview"),(int) (0));
this.state = 31;
return;
case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=37814327;
 //BA.debugLineNum = 37814327;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=37814328;
 //BA.debugLineNum = 37814328;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=37814330;
 //BA.debugLineNum = 37814330;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _createcenturyview(b4a.example.ef.as_datepicker __ref) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createcenturyview", true))
	 {Debug.delegate(ba, "createcenturyview", null); return;}
ResumableSub_CreateCenturyView rsub = new ResumableSub_CreateCenturyView(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateCenturyView extends BA.ResumableSub {
public ResumableSub_CreateCenturyView(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
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
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="Dim CurrentCenturyStart As Long = DateUtils.SetDa";
_currentcenturystart = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-parent.__c.Round(((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100)-((int) ((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100))))*100)),(int) (1),(int) (1));
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=37879817;
 //BA.debugLineNum = 37879817;BA.debugLine="Dim FirstDateOfPast As Long = DateUtils.SetDate(1";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (1),(int) (1),(int) (1));
RDebugUtils.currentLine=37879819;
 //BA.debugLineNum = 37879819;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then";
if (true) break;

case 1:
//if
this.state = 10;
if (__ref._m_mindate /*long*/ >0 || __ref._m_maxdate /*long*/ >0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=37879820;
 //BA.debugLineNum = 37879820;BA.debugLine="If m_MinDate > 0 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (__ref._m_mindate /*long*/ >0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=37879821;
 //BA.debugLineNum = 37879821;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_mindate /*long*/ )-40),(int) (1),(int) (1));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=37879823;
 //BA.debugLineNum = 37879823;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )-40),(int) (1),(int) (1));
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
RDebugUtils.currentLine=37879840;
 //BA.debugLineNum = 37879840;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=37879846;
 //BA.debugLineNum = 37879846;BA.debugLine="Dim NumberOfCentries As Int = 80";
_numberofcentries = (int) (80);
RDebugUtils.currentLine=37879847;
 //BA.debugLineNum = 37879847;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then NumberOfCe";
if (true) break;

case 11:
//if
this.state = 16;
if (__ref._m_mindate /*long*/ >0 || __ref._m_maxdate /*long*/ >0) { 
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
RDebugUtils.currentLine=37879849;
 //BA.debugLineNum = 37879849;BA.debugLine="For i = 0 To NumberOfCentries -1";
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
RDebugUtils.currentLine=37879851;
 //BA.debugLineNum = 37879851;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37879852;
 //BA.debugLineNum = 37879852;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37879853;
 //BA.debugLineNum = 37879853;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37879855;
 //BA.debugLineNum = 37879855;BA.debugLine="p.Years = i*10*12";
_p.Years = (int) (_i*10*12);
RDebugUtils.currentLine=37879856;
 //BA.debugLineNum = 37879856;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(Fi";
_currenttime = parent._dateutils._addperiod(ba,_firstdateofpast,_p);
RDebugUtils.currentLine=37879857;
 //BA.debugLineNum = 37879857;BA.debugLine="If i > 0 Then";
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
RDebugUtils.currentLine=37879858;
 //BA.debugLineNum = 37879858;BA.debugLine="CurrentTime = DateUtils.SetDate((DateTime.GetYe";
_currenttime = parent._dateutils._setdate(ba,(int) ((parent.__c.DateTime.GetYear(_currenttime)-parent.__c.Round(((parent.__c.DateTime.GetYear(_currenttime)/(double)100)-((int) ((parent.__c.DateTime.GetYear(_currenttime)/(double)100))))*100))+1),(int) (1),(int) (1));
RDebugUtils.currentLine=37879859;
 //BA.debugLineNum = 37879859;BA.debugLine="If DateTime.GetMonth(CurrentTime) = 1 Then";
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
RDebugUtils.currentLine=37879860;
 //BA.debugLineNum = 37879860;BA.debugLine="CurrentTime = DateUtils.SetDate(DateTime.GetYe";
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
RDebugUtils.currentLine=37879865;
 //BA.debugLineNum = 37879865;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=37879867;
 //BA.debugLineNum = 37879867;BA.debugLine="If DateTime.GetYear(CurrentCenturyStart) = DateT";
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
RDebugUtils.currentLine=37879873;
 //BA.debugLineNum = 37879873;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createcenturyview"),(int) (0));
this.state = 37;
return;
case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=37879874;
 //BA.debugLineNum = 37879874;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=37879875;
 //BA.debugLineNum = 37879875;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=37879877;
 //BA.debugLineNum = 37879877;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="Type ASDatePicker_MonthNameShort(January As Strin";
;
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="Type ASDatePicker_WeekNameShort(Monday As String,";
;
RDebugUtils.currentLine=36896773;
 //BA.debugLineNum = 36896773;BA.debugLine="Type ASDatePicker_HeaderProperties(Height As Floa";
;
RDebugUtils.currentLine=36896774;
 //BA.debugLineNum = 36896774;BA.debugLine="Type ASDatePicker_BodyProperties(xFont As B4XFont";
;
RDebugUtils.currentLine=36896775;
 //BA.debugLineNum = 36896775;BA.debugLine="Type ASDatePicker_CustomDrawDay(BackgroundPanel A";
;
RDebugUtils.currentLine=36896776;
 //BA.debugLineNum = 36896776;BA.debugLine="Type ASDatePicker_CustomDrawHeader(BackgroundPane";
;
RDebugUtils.currentLine=36896777;
 //BA.debugLineNum = 36896777;BA.debugLine="Type ASDatePicker_WeekNumberProperties(Width As F";
;
RDebugUtils.currentLine=36896778;
 //BA.debugLineNum = 36896778;BA.debugLine="Type ASDatePicker_WeekNameProperties(Color As Int";
;
RDebugUtils.currentLine=36896780;
 //BA.debugLineNum = 36896780;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=36896781;
 //BA.debugLineNum = 36896781;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=36896782;
 //BA.debugLineNum = 36896782;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896783;
 //BA.debugLineNum = 36896783;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=36896784;
 //BA.debugLineNum = 36896784;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=36896786;
 //BA.debugLineNum = 36896786;BA.debugLine="Private m_isReady As Boolean = False";
_m_isready = __c.False;
RDebugUtils.currentLine=36896788;
 //BA.debugLineNum = 36896788;BA.debugLine="Private g_HeaderProperties As ASDatePicker_Header";
_g_headerproperties = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=36896789;
 //BA.debugLineNum = 36896789;BA.debugLine="Private g_BodyProperties As ASDatePicker_BodyProp";
_g_bodyproperties = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=36896791;
 //BA.debugLineNum = 36896791;BA.debugLine="Private g_MonthNameShort As ASDatePicker_MonthNam";
_g_monthnameshort = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=36896792;
 //BA.debugLineNum = 36896792;BA.debugLine="Private g_WeekNameShort As ASDatePicker_WeekNameS";
_g_weeknameshort = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=36896793;
 //BA.debugLineNum = 36896793;BA.debugLine="Private g_WeekNumberProperties As ASDatePicker_We";
_g_weeknumberproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=36896794;
 //BA.debugLineNum = 36896794;BA.debugLine="Private g_WeekNameProperties As ASDatePicker_Week";
_g_weeknameproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=36896796;
 //BA.debugLineNum = 36896796;BA.debugLine="Private xASVP_Main As ASViewPager";
_xasvp_main = new b4a.example.ef.asviewpager();
RDebugUtils.currentLine=36896798;
 //BA.debugLineNum = 36896798;BA.debugLine="Private xpnl_LoadingPanel As B4XView";
_xpnl_loadingpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896799;
 //BA.debugLineNum = 36896799;BA.debugLine="Private xpnl_Header As B4XView";
_xpnl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896800;
 //BA.debugLineNum = 36896800;BA.debugLine="Private xpnl_ViewPager As B4XView";
_xpnl_viewpager = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896801;
 //BA.debugLineNum = 36896801;BA.debugLine="Private xpnl_SelectedDate As B4XView";
_xpnl_selecteddate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896802;
 //BA.debugLineNum = 36896802;BA.debugLine="Private xpnl_SelectedDate2 As B4XView";
_xpnl_selecteddate2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896807;
 //BA.debugLineNum = 36896807;BA.debugLine="Private m_HeaderColor As Int";
_m_headercolor = 0;
RDebugUtils.currentLine=36896808;
 //BA.debugLineNum = 36896808;BA.debugLine="Private m_BodyColor As Int";
_m_bodycolor = 0;
RDebugUtils.currentLine=36896809;
 //BA.debugLineNum = 36896809;BA.debugLine="Private m_CurrentDateColor As Int";
_m_currentdatecolor = 0;
RDebugUtils.currentLine=36896810;
 //BA.debugLineNum = 36896810;BA.debugLine="Private m_SelectedDateColor As Int";
_m_selecteddatecolor = 0;
RDebugUtils.currentLine=36896811;
 //BA.debugLineNum = 36896811;BA.debugLine="Private m_MouseHoverFeedback As Boolean 'Ignore";
_m_mousehoverfeedback = false;
RDebugUtils.currentLine=36896812;
 //BA.debugLineNum = 36896812;BA.debugLine="Private m_SelectedDate As Long";
_m_selecteddate = 0L;
RDebugUtils.currentLine=36896813;
 //BA.debugLineNum = 36896813;BA.debugLine="Private m_SelectedDate2 As Long";
_m_selecteddate2 = 0L;
RDebugUtils.currentLine=36896814;
 //BA.debugLineNum = 36896814;BA.debugLine="Private m_ShowWeekNumbers As Boolean";
_m_showweeknumbers = false;
RDebugUtils.currentLine=36896815;
 //BA.debugLineNum = 36896815;BA.debugLine="Private m_FirstDayOfWeek As Int = 5 'Monday";
_m_firstdayofweek = (int) (5);
RDebugUtils.currentLine=36896816;
 //BA.debugLineNum = 36896816;BA.debugLine="Private m_ShowGridLines As Boolean";
_m_showgridlines = false;
RDebugUtils.currentLine=36896817;
 //BA.debugLineNum = 36896817;BA.debugLine="Private m_GridLineColor As Int";
_m_gridlinecolor = 0;
RDebugUtils.currentLine=36896818;
 //BA.debugLineNum = 36896818;BA.debugLine="Private m_ThemeChangeTransition As String";
_m_themechangetransition = "";
RDebugUtils.currentLine=36896820;
 //BA.debugLineNum = 36896820;BA.debugLine="Private m_CurrentView As String";
_m_currentview = "";
RDebugUtils.currentLine=36896821;
 //BA.debugLineNum = 36896821;BA.debugLine="Private m_StartDate As Long";
_m_startdate = 0L;
RDebugUtils.currentLine=36896822;
 //BA.debugLineNum = 36896822;BA.debugLine="Private m_InactiveDaysVisible As Boolean";
_m_inactivedaysvisible = false;
RDebugUtils.currentLine=36896823;
 //BA.debugLineNum = 36896823;BA.debugLine="Private m_MinDate,m_MaxDate As Long";
_m_mindate = 0L;
_m_maxdate = 0L;
RDebugUtils.currentLine=36896824;
 //BA.debugLineNum = 36896824;BA.debugLine="Private m_SelectMode As String";
_m_selectmode = "";
RDebugUtils.currentLine=36896826;
 //BA.debugLineNum = 36896826;BA.debugLine="Private xiv_RefreshImage As B4XView";
_xiv_refreshimage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896828;
 //BA.debugLineNum = 36896828;BA.debugLine="Type AS_DatePicker_Theme(SelectedTextColor As Int";
;
RDebugUtils.currentLine=36896830;
 //BA.debugLineNum = 36896830;BA.debugLine="End Sub";
return "";
}
public String  _clearselections(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "clearselections", true))
	 {return ((String) Debug.delegate(ba, "clearselections", null));}
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Public Sub ClearSelections";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _createasdatepicker_bodyproperties(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,int _selectedtextcolor,float _currentandselecteddayheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_bodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "createasdatepicker_bodyproperties", new Object[] {_xfont,_textcolor,_selectedtextcolor,_currentandselecteddayheight}));}
b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _t1 = null;
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Public Sub CreateASDatePicker_BodyProperties (xFon";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Dim t1 As ASDatePicker_BodyProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=43712515;
 //BA.debugLineNum = 43712515;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=43712516;
 //BA.debugLineNum = 43712516;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=43712517;
 //BA.debugLineNum = 43712517;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
_t1.SelectedTextColor /*int*/  = _selectedtextcolor;
RDebugUtils.currentLine=43712518;
 //BA.debugLineNum = 43712518;BA.debugLine="t1.CurrentAndSelectedDayHeight = CurrentAndSelect";
_t1.CurrentAndSelectedDayHeight /*float*/  = _currentandselecteddayheight;
RDebugUtils.currentLine=43712519;
 //BA.debugLineNum = 43712519;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=43712520;
 //BA.debugLineNum = 43712520;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _createasdatepicker_headerproperties(b4a.example.ef.as_datepicker __ref,float _height,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _buttoniconsize,boolean _arrowsvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_headerproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "createasdatepicker_headerproperties", new Object[] {_height,_xfont,_textcolor,_buttoniconsize,_arrowsvisible}));}
b4a.example.ef.as_datepicker._asdatepicker_headerproperties _t1 = null;
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Public Sub CreateASDatePicker_HeaderProperties (He";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="Dim t1 As ASDatePicker_HeaderProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=43581444;
 //BA.debugLineNum = 43581444;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=43581445;
 //BA.debugLineNum = 43581445;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=43581446;
 //BA.debugLineNum = 43581446;BA.debugLine="t1.ButtonIconSize = ButtonIconSize";
_t1.ButtonIconSize /*float*/  = _buttoniconsize;
RDebugUtils.currentLine=43581447;
 //BA.debugLineNum = 43581447;BA.debugLine="t1.ArrowsVisible = ArrowsVisible";
_t1.ArrowsVisible /*boolean*/  = _arrowsvisible;
RDebugUtils.currentLine=43581448;
 //BA.debugLineNum = 43581448;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=43581449;
 //BA.debugLineNum = 43581449;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _createasdatepicker_monthnameshort(b4a.example.ef.as_datepicker __ref,String _january,String _february,String _march,String _april,String _may,String _june,String _july,String _august,String _september,String _october,String _november,String _december) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_monthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "createasdatepicker_monthnameshort", new Object[] {_january,_february,_march,_april,_may,_june,_july,_august,_september,_october,_november,_december}));}
b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _t1 = null;
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Public Sub CreateASDatePicker_MonthNameShort (Janu";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="Dim t1 As ASDatePicker_MonthNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="t1.January = January";
_t1.January /*String*/  = _january;
RDebugUtils.currentLine=43384836;
 //BA.debugLineNum = 43384836;BA.debugLine="t1.February = February";
_t1.February /*String*/  = _february;
RDebugUtils.currentLine=43384837;
 //BA.debugLineNum = 43384837;BA.debugLine="t1.March = March";
_t1.March /*String*/  = _march;
RDebugUtils.currentLine=43384838;
 //BA.debugLineNum = 43384838;BA.debugLine="t1.April = April";
_t1.April /*String*/  = _april;
RDebugUtils.currentLine=43384839;
 //BA.debugLineNum = 43384839;BA.debugLine="t1.May = May";
_t1.May /*String*/  = _may;
RDebugUtils.currentLine=43384840;
 //BA.debugLineNum = 43384840;BA.debugLine="t1.June = June";
_t1.June /*String*/  = _june;
RDebugUtils.currentLine=43384841;
 //BA.debugLineNum = 43384841;BA.debugLine="t1.July = July";
_t1.July /*String*/  = _july;
RDebugUtils.currentLine=43384842;
 //BA.debugLineNum = 43384842;BA.debugLine="t1.August = August";
_t1.August /*String*/  = _august;
RDebugUtils.currentLine=43384843;
 //BA.debugLineNum = 43384843;BA.debugLine="t1.September = September";
_t1.September /*String*/  = _september;
RDebugUtils.currentLine=43384844;
 //BA.debugLineNum = 43384844;BA.debugLine="t1.October = October";
_t1.October /*String*/  = _october;
RDebugUtils.currentLine=43384845;
 //BA.debugLineNum = 43384845;BA.debugLine="t1.November = November";
_t1.November /*String*/  = _november;
RDebugUtils.currentLine=43384846;
 //BA.debugLineNum = 43384846;BA.debugLine="t1.December = December";
_t1.December /*String*/  = _december;
RDebugUtils.currentLine=43384847;
 //BA.debugLineNum = 43384847;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=43384848;
 //BA.debugLineNum = 43384848;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _createasdatepicker_weeknameproperties(b4a.example.ef.as_datepicker __ref,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "createasdatepicker_weeknameproperties", new Object[] {_color,_xfont,_textcolor,_height}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _t1 = null;
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Public Sub CreateASDatePicker_WeekNameProperties (";
RDebugUtils.currentLine=43646977;
 //BA.debugLineNum = 43646977;BA.debugLine="Dim t1 As ASDatePicker_WeekNameProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=43646979;
 //BA.debugLineNum = 43646979;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=43646980;
 //BA.debugLineNum = 43646980;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=43646981;
 //BA.debugLineNum = 43646981;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=43646982;
 //BA.debugLineNum = 43646982;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=43646983;
 //BA.debugLineNum = 43646983;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=43646984;
 //BA.debugLineNum = 43646984;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _createasdatepicker_weeknameshort(b4a.example.ef.as_datepicker __ref,String _monday,String _tuesday,String _wednesday,String _thursday,String _friday,String _saturday,String _sunday) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "createasdatepicker_weeknameshort", new Object[] {_monday,_tuesday,_wednesday,_thursday,_friday,_saturday,_sunday}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _t1 = null;
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Public Sub CreateASDatePicker_WeekNameShort (Monda";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="Dim t1 As ASDatePicker_WeekNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=43450371;
 //BA.debugLineNum = 43450371;BA.debugLine="t1.Monday = Monday";
_t1.Monday /*String*/  = _monday;
RDebugUtils.currentLine=43450372;
 //BA.debugLineNum = 43450372;BA.debugLine="t1.Tuesday = Tuesday";
_t1.Tuesday /*String*/  = _tuesday;
RDebugUtils.currentLine=43450373;
 //BA.debugLineNum = 43450373;BA.debugLine="t1.Wednesday = Wednesday";
_t1.Wednesday /*String*/  = _wednesday;
RDebugUtils.currentLine=43450374;
 //BA.debugLineNum = 43450374;BA.debugLine="t1.Thursday = Thursday";
_t1.Thursday /*String*/  = _thursday;
RDebugUtils.currentLine=43450375;
 //BA.debugLineNum = 43450375;BA.debugLine="t1.Friday = Friday";
_t1.Friday /*String*/  = _friday;
RDebugUtils.currentLine=43450376;
 //BA.debugLineNum = 43450376;BA.debugLine="t1.Saturday = Saturday";
_t1.Saturday /*String*/  = _saturday;
RDebugUtils.currentLine=43450377;
 //BA.debugLineNum = 43450377;BA.debugLine="t1.Sunday = Sunday";
_t1.Sunday /*String*/  = _sunday;
RDebugUtils.currentLine=43450378;
 //BA.debugLineNum = 43450378;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=43450379;
 //BA.debugLineNum = 43450379;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _createasdatepicker_weeknumberproperties(b4a.example.ef.as_datepicker __ref,float _width,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "createasdatepicker_weeknumberproperties", new Object[] {_width,_color,_xfont,_textcolor,_text}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _t1 = null;
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Public Sub CreateASDatePicker_WeekNumberProperties";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="Dim t1 As ASDatePicker_WeekNumberProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=43515907;
 //BA.debugLineNum = 43515907;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
RDebugUtils.currentLine=43515908;
 //BA.debugLineNum = 43515908;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=43515909;
 //BA.debugLineNum = 43515909;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=43515910;
 //BA.debugLineNum = 43515910;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=43515911;
 //BA.debugLineNum = 43515911;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
RDebugUtils.currentLine=43515912;
 //BA.debugLineNum = 43515912;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=43515913;
 //BA.debugLineNum = 43515913;BA.debugLine="End Sub";
return null;
}
public int  _monthbetween(b4a.example.ef.as_datepicker __ref,long _date1,long _date2) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "monthbetween", true))
	 {return ((Integer) Debug.delegate(ba, "monthbetween", new Object[] {_date1,_date2}));}
long _y = 0L;
long _m = 0L;
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Private Sub MonthBetween(Date1 As Long, Date2 As L";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="Dim y As Long = DateTime.GetYear(Date2) - DateTim";
_y = (long) (__c.DateTime.GetYear(_date2)-__c.DateTime.GetYear(_date1));
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="Dim m As Long = y * 12";
_m = (long) (_y*12);
RDebugUtils.currentLine=43253763;
 //BA.debugLineNum = 43253763;BA.debugLine="m = m - DateTime.GetMonth(Date1)";
_m = (long) (_m-__c.DateTime.GetMonth(_date1));
RDebugUtils.currentLine=43253764;
 //BA.debugLineNum = 43253764;BA.debugLine="m = m + DateTime.GetMonth(Date2)";
_m = (long) (_m+__c.DateTime.GetMonth(_date2));
RDebugUtils.currentLine=43253765;
 //BA.debugLineNum = 43253765;BA.debugLine="Return m";
if (true) return (int) (_m);
RDebugUtils.currentLine=43253766;
 //BA.debugLineNum = 43253766;BA.debugLine="End Sub";
return 0;
}
public String  _createheader(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createheader", true))
	 {return ((String) Debug.delegate(ba, "createheader", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowleft = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowright = null;
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub CreateHeader";
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="Dim xlbl_Header As B4XView = CreateLabel(\"xlbl_He";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_Header");
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="xpnl_Header.AddView(xlbl_Header,xpnl_Header.Heigh";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_header.getObject()),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37486599;
 //BA.debugLineNum = 37486599;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = CreateLabel(\"xlbl";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowLeft");
RDebugUtils.currentLine=37486600;
 //BA.debugLineNum = 37486600;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowLeft,0,0,xpnl_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowleft.getObject()),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37486602;
 //BA.debugLineNum = 37486602;BA.debugLine="Dim xlbl_ArrowRight As B4XView = CreateLabel(\"xlb";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowRight");
RDebugUtils.currentLine=37486603;
 //BA.debugLineNum = 37486603;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowRight,xpnl_Header.W";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowright.getObject()),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37486605;
 //BA.debugLineNum = 37486605;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=37486606;
 //BA.debugLineNum = 37486606;BA.debugLine="xlbl_ArrowLeft.Text = Chr(0xE314)";
_xlbl_arrowleft.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe314))));
RDebugUtils.currentLine=37486607;
 //BA.debugLineNum = 37486607;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=37486608;
 //BA.debugLineNum = 37486608;BA.debugLine="xlbl_ArrowLeft.SetTextAlignment(\"CENTER\",\"CENTER\"";
_xlbl_arrowleft.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=37486609;
 //BA.debugLineNum = 37486609;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=37486611;
 //BA.debugLineNum = 37486611;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=37486612;
 //BA.debugLineNum = 37486612;BA.debugLine="xlbl_ArrowRight.Text = Chr(0xE315)";
_xlbl_arrowright.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe315))));
RDebugUtils.currentLine=37486613;
 //BA.debugLineNum = 37486613;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=37486614;
 //BA.debugLineNum = 37486614;BA.debugLine="xlbl_ArrowRight.SetTextAlignment(\"CENTER\",\"CENTER";
_xlbl_arrowright.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=37486615;
 //BA.debugLineNum = 37486615;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=37486617;
 //BA.debugLineNum = 37486617;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=37486618;
 //BA.debugLineNum = 37486618;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(m_Start";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,__ref._m_startdate /*long*/ )+" "+BA.NumberToString(__c.DateTime.GetYear(__ref._m_startdate /*long*/ ))));
RDebugUtils.currentLine=37486619;
 //BA.debugLineNum = 37486619;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=37486620;
 //BA.debugLineNum = 37486620;BA.debugLine="xlbl_Header.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_header.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=37486622;
 //BA.debugLineNum = 37486622;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="iv.Initialize(EventName)";
_iv.Initialize(ba,_eventname);
RDebugUtils.currentLine=43319299;
 //BA.debugLineNum = 43319299;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=43319300;
 //BA.debugLineNum = 43319300;BA.debugLine="End Sub";
return null;
}
public String  _createselecteddate(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _firstdatepanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createselecteddate", true))
	 {return ((String) Debug.delegate(ba, "createselecteddate", new Object[] {_xpnl_monthdate,_firstdatepanel}));}
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Private Sub CreateSelectedDate(xpnl_MonthDate As B";
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="If FirstDatePanel Then";
if (_firstdatepanel) { 
RDebugUtils.currentLine=42795011;
 //BA.debugLineNum = 42795011;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedDa";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=42795012;
 //BA.debugLineNum = 42795012;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate.P";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=42795013;
 //BA.debugLineNum = 42795013;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=42795015;
 //BA.debugLineNum = 42795015;BA.debugLine="xpnl_SelectedDate.RemoveViewFromParent";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=42795017;
 //BA.debugLineNum = 42795017;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=42795018;
 //BA.debugLineNum = 42795018;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=42795019;
 //BA.debugLineNum = 42795019;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=42795020;
 //BA.debugLineNum = 42795020;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=42795021;
 //BA.debugLineNum = 42795021;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
RDebugUtils.currentLine=42795022;
 //BA.debugLineNum = 42795022;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 }else {
RDebugUtils.currentLine=42795024;
 //BA.debugLineNum = 42795024;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=42795025;
 //BA.debugLineNum = 42795025;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate2.";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group16.Get(index16)));
RDebugUtils.currentLine=42795026;
 //BA.debugLineNum = 42795026;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=42795028;
 //BA.debugLineNum = 42795028;BA.debugLine="xpnl_SelectedDate2.RemoveViewFromParent";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=42795030;
 //BA.debugLineNum = 42795030;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=42795031;
 //BA.debugLineNum = 42795031;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=42795032;
 //BA.debugLineNum = 42795032;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=42795033;
 //BA.debugLineNum = 42795033;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=42795034;
 //BA.debugLineNum = 42795034;BA.debugLine="xpnl_SelectedDate2 = xpnl_selected";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
RDebugUtils.currentLine=42795037;
 //BA.debugLineNum = 42795037;BA.debugLine="End Sub";
return "";
}
public String  _monthdateclick(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _withevent) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "monthdateclick", true))
	 {return ((String) Debug.delegate(ba, "monthdateclick", new Object[] {_xpnl_monthdate,_withevent}));}
long _currentday = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Private Sub MonthDateClick(xpnl_MonthDate As B4XVi";
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="Dim CurrentDay As Long = xpnl_MonthDate.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=42729475;
 //BA.debugLineNum = 42729475;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime.";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
if (true) return "";};
RDebugUtils.currentLine=42729477;
 //BA.debugLineNum = 42729477;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=42729478;
 //BA.debugLineNum = 42729478;BA.debugLine="For Each View As B4XView In xpnl_MonthDate.GetAll";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _xpnl_monthdate.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=42729479;
 //BA.debugLineNum = 42729479;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=42729482;
 //BA.debugLineNum = 42729482;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42729484;
 //BA.debugLineNum = 42729484;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=42729485;
 //BA.debugLineNum = 42729485;BA.debugLine="If m_SelectedDate = 0 Or xpnl_MonthDate.Tag <= m";
if (__ref._m_selecteddate /*long*/ ==0 || (double)(BA.ObjectToNumber(_xpnl_monthdate.getTag()))<=__ref._m_selecteddate /*long*/ ) { 
RDebugUtils.currentLine=42729486;
 //BA.debugLineNum = 42729486;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate,xpnl_Mont";
if (_dateutils._issameday(ba,__ref._m_selecteddate /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=42729487;
 //BA.debugLineNum = 42729487;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=42729488;
 //BA.debugLineNum = 42729488;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
RDebugUtils.currentLine=42729489;
 //BA.debugLineNum = 42729489;BA.debugLine="If m_SelectedDate > m_SelectedDate2 Then";
if (__ref._m_selecteddate /*long*/ >__ref._m_selecteddate2 /*long*/ ) { 
RDebugUtils.currentLine=42729490;
 //BA.debugLineNum = 42729490;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Select";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=42729491;
 //BA.debugLineNum = 42729491;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=42729494;
 //BA.debugLineNum = 42729494;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_Selected";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=42729495;
 //BA.debugLineNum = 42729495;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=42729498;
 //BA.debugLineNum = 42729498;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate2,xpnl_Mon";
if (_dateutils._issameday(ba,__ref._m_selecteddate2 /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=42729499;
 //BA.debugLineNum = 42729499;BA.debugLine="m_SelectedDate2 = xpnl_MonthDate.Tag";
__ref._m_selecteddate2 /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=42729500;
 //BA.debugLineNum = 42729500;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.False);
 }else {
RDebugUtils.currentLine=42729502;
 //BA.debugLineNum = 42729502;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Selecte";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=42729503;
 //BA.debugLineNum = 42729503;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 };
RDebugUtils.currentLine=42729506;
 //BA.debugLineNum = 42729506;BA.debugLine="RefreshSelectedDate";
__ref._refreshselecteddate /*String*/ (null);
 }else {
RDebugUtils.currentLine=42729508;
 //BA.debugLineNum = 42729508;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
 };
RDebugUtils.currentLine=42729511;
 //BA.debugLineNum = 42729511;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedTe";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
RDebugUtils.currentLine=42729513;
 //BA.debugLineNum = 42729513;BA.debugLine="If WithEvent = True Then";
if (_withevent==__c.True) { 
RDebugUtils.currentLine=42729514;
 //BA.debugLineNum = 42729514;BA.debugLine="If m_SelectMode = \"Range\" And m_SelectedDate > 0";
if ((__ref._m_selectmode /*String*/ ).equals("Range") && __ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0) { 
RDebugUtils.currentLine=42729515;
 //BA.debugLineNum = 42729515;BA.debugLine="SelectedDateRangeChanged";
__ref._selecteddaterangechanged /*String*/ (null);
 }else {
RDebugUtils.currentLine=42729517;
 //BA.debugLineNum = 42729517;BA.debugLine="SelectedDateChanged(xpnl_MonthDate.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()));
 };
 };
RDebugUtils.currentLine=42729520;
 //BA.debugLineNum = 42729520;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_range(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_range", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_range", null));}
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Public Sub getSelectMode_Range As String";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="Return \"Range\"";
if (true) return "Range";
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="End Sub";
return "";
}
public String  _customdrawheader(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawheader", true))
	 {return ((String) Debug.delegate(ba, "customdrawheader", new Object[] {_date}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawheader _m_customdrawheader = null;
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Private Sub CustomDrawHeader(date As Long)";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(int) (2))) { 
RDebugUtils.currentLine=41746435;
 //BA.debugLineNum = 41746435;BA.debugLine="Dim m_CustomDrawHeader As ASDatePicker_CustomDra";
_m_customdrawheader = new b4a.example.ef.as_datepicker._asdatepicker_customdrawheader();
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="m_CustomDrawHeader.Initialize";
_m_customdrawheader.Initialize();
RDebugUtils.currentLine=41746437;
 //BA.debugLineNum = 41746437;BA.debugLine="m_CustomDrawHeader.BackgroundPanel = xpnl_Header";
_m_customdrawheader.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=41746438;
 //BA.debugLineNum = 41746438;BA.debugLine="m_CustomDrawHeader.xlbl_Text = xpnl_Header.GetVi";
_m_customdrawheader.xlbl_Text /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=41746439;
 //BA.debugLineNum = 41746439;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowLeft = xpnl_Header.";
_m_customdrawheader.xlbl_ArrowLeft /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=41746440;
 //BA.debugLineNum = 41746440;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowRight = xpnl_Header";
_m_customdrawheader.xlbl_ArrowRight /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=41746442;
 //BA.debugLineNum = 41746442;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawHea";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(Object)(_date),(Object)(_m_customdrawheader));
 };
RDebugUtils.currentLine=41746444;
 //BA.debugLineNum = 41746444;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.as_datepicker __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="IniProps(Props)";
__ref._iniprops /*String*/ (null,_props);
RDebugUtils.currentLine=37224453;
 //BA.debugLineNum = 37224453;BA.debugLine="m_StartDate = DateTime.Now";
__ref._m_startdate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=37224456;
 //BA.debugLineNum = 37224456;BA.debugLine="xpnl_LoadingPanel = xui.CreatePanel(\"\")";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37224457;
 //BA.debugLineNum = 37224457;BA.debugLine="xpnl_LoadingPanel.Visible = True";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=37224458;
 //BA.debugLineNum = 37224458;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=37224459;
 //BA.debugLineNum = 37224459;BA.debugLine="mBase.AddView(xpnl_LoadingPanel,0,0,mBase.Width,m";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37224461;
 //BA.debugLineNum = 37224461;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37224462;
 //BA.debugLineNum = 37224462;BA.debugLine="mBase.AddView(xpnl_Header,0,0,mBase.Width,g_Heade";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=37224464;
 //BA.debugLineNum = 37224464;BA.debugLine="xpnl_ViewPager = xui.CreatePanel(\"\")";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37224465;
 //BA.debugLineNum = 37224465;BA.debugLine="mBase.AddView(xpnl_ViewPager,0,g_HeaderProperties";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=37224467;
 //BA.debugLineNum = 37224467;BA.debugLine="ini_viewpager";
__ref._ini_viewpager /*String*/ (null);
RDebugUtils.currentLine=37224468;
 //BA.debugLineNum = 37224468;BA.debugLine="CreateHeader";
__ref._createheader /*String*/ (null);
RDebugUtils.currentLine=37224469;
 //BA.debugLineNum = 37224469;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=37224470;
 //BA.debugLineNum = 37224470;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=37224471;
 //BA.debugLineNum = 37224471;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 }else 
{RDebugUtils.currentLine=37224472;
 //BA.debugLineNum = 37224472;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=37224473;
 //BA.debugLineNum = 37224473;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=37224474;
 //BA.debugLineNum = 37224474;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 }}
;
RDebugUtils.currentLine=37224477;
 //BA.debugLineNum = 37224477;BA.debugLine="xiv_RefreshImage = CreateImageView(\"\")";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=37224478;
 //BA.debugLineNum = 37224478;BA.debugLine="xiv_RefreshImage.Visible = False";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=37224479;
 //BA.debugLineNum = 37224479;BA.debugLine="mBase.AddView(xiv_RefreshImage,0,0,mBase.Width,mB";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37224482;
 //BA.debugLineNum = 37224482;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37224485;
 //BA.debugLineNum = 37224485;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),__c.False);
RDebugUtils.currentLine=37224487;
 //BA.debugLineNum = 37224487;BA.debugLine="End Sub";
return "";
}
public String  _iniprops(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "iniprops", true))
	 {return ((String) Debug.delegate(ba, "iniprops", new Object[] {_props}));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Private Sub IniProps(Props As Map)";
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="m_HeaderColor = xui.PaintOrColorToColor(Props.Get";
__ref._m_headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=37289989;
 //BA.debugLineNum = 37289989;BA.debugLine="m_BodyColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._m_bodycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BodyColor")));
RDebugUtils.currentLine=37289990;
 //BA.debugLineNum = 37289990;BA.debugLine="m_CurrentDateColor = xui.PaintOrColorToColor(Prop";
__ref._m_currentdatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CurrentDateColor")));
RDebugUtils.currentLine=37289991;
 //BA.debugLineNum = 37289991;BA.debugLine="m_SelectedDateColor = xui.PaintOrColorToColor(Pro";
__ref._m_selecteddatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectedDateColor")));
RDebugUtils.currentLine=37289992;
 //BA.debugLineNum = 37289992;BA.debugLine="m_InactiveDaysVisible = Props.GetDefault(\"Inactiv";
__ref._m_inactivedaysvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("InactiveDaysVisible"),(Object)(__c.False)));
RDebugUtils.currentLine=37289993;
 //BA.debugLineNum = 37289993;BA.debugLine="m_MouseHoverFeedback = Props.GetDefault(\"MouseHov";
__ref._m_mousehoverfeedback /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MouseHoverFeedback"),(Object)(__c.True)));
RDebugUtils.currentLine=37289994;
 //BA.debugLineNum = 37289994;BA.debugLine="m_SelectMode = Props.GetDefault(\"SelectMode\",\"Dat";
__ref._m_selectmode /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("SelectMode"),(Object)("Date")));
RDebugUtils.currentLine=37289995;
 //BA.debugLineNum = 37289995;BA.debugLine="m_ShowWeekNumbers = Props.GetDefault(\"ShowWeekNum";
__ref._m_showweeknumbers /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowWeekNumbers"),(Object)(__c.False)));
RDebugUtils.currentLine=37289996;
 //BA.debugLineNum = 37289996;BA.debugLine="m_ShowGridLines = Props.GetDefault(\"ShowGridLines";
__ref._m_showgridlines /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowGridLines"),(Object)(__c.False)));
RDebugUtils.currentLine=37289997;
 //BA.debugLineNum = 37289997;BA.debugLine="m_GridLineColor = xui.PaintOrColorToColor(Props.G";
__ref._m_gridlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("GridLineColor"),(Object)(((int)0x50ffffff))));
RDebugUtils.currentLine=37289998;
 //BA.debugLineNum = 37289998;BA.debugLine="m_ThemeChangeTransition = Props.GetDefault(\"Theme";
__ref._m_themechangetransition /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ThemeChangeTransition"),(Object)("Fade")));
RDebugUtils.currentLine=37290000;
 //BA.debugLineNum = 37290000;BA.debugLine="If \"Friday\" = Props.Get(\"FirstDayOfWeek\") Then";
if (("Friday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=37290001;
 //BA.debugLineNum = 37290001;BA.debugLine="m_FirstDayOfWeek = 1";
__ref._m_firstdayofweek /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=37290002;
 //BA.debugLineNum = 37290002;BA.debugLine="else If \"Thursday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Thursday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=37290003;
 //BA.debugLineNum = 37290003;BA.debugLine="m_FirstDayOfWeek = 2";
__ref._m_firstdayofweek /*int*/  = (int) (2);
 }else 
{RDebugUtils.currentLine=37290004;
 //BA.debugLineNum = 37290004;BA.debugLine="else If \"Wednesday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Wednesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=37290005;
 //BA.debugLineNum = 37290005;BA.debugLine="m_FirstDayOfWeek = 3";
__ref._m_firstdayofweek /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=37290006;
 //BA.debugLineNum = 37290006;BA.debugLine="else If \"Tuesday\" = Props.Get(\"FirstDayOfWeek\") T";
if (("Tuesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=37290007;
 //BA.debugLineNum = 37290007;BA.debugLine="m_FirstDayOfWeek = 4";
__ref._m_firstdayofweek /*int*/  = (int) (4);
 }else 
{RDebugUtils.currentLine=37290008;
 //BA.debugLineNum = 37290008;BA.debugLine="else If \"Monday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Monday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=37290009;
 //BA.debugLineNum = 37290009;BA.debugLine="m_FirstDayOfWeek = 5";
__ref._m_firstdayofweek /*int*/  = (int) (5);
 }else 
{RDebugUtils.currentLine=37290010;
 //BA.debugLineNum = 37290010;BA.debugLine="else If \"Sunday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Sunday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=37290011;
 //BA.debugLineNum = 37290011;BA.debugLine="m_FirstDayOfWeek = 6";
__ref._m_firstdayofweek /*int*/  = (int) (6);
 }else 
{RDebugUtils.currentLine=37290012;
 //BA.debugLineNum = 37290012;BA.debugLine="else If \"Saturday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Saturday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=37290013;
 //BA.debugLineNum = 37290013;BA.debugLine="m_FirstDayOfWeek = 7";
__ref._m_firstdayofweek /*int*/  = (int) (7);
 }}}}}}}
;
RDebugUtils.currentLine=37290016;
 //BA.debugLineNum = 37290016;BA.debugLine="g_WeekNumberProperties = CreateASDatePicker_WeekN";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = __ref._createasdatepicker_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ (null,(float) (__c.DipToCurrent((int) (20))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,"");
RDebugUtils.currentLine=37290017;
 //BA.debugLineNum = 37290017;BA.debugLine="g_HeaderProperties = CreateASDatePicker_HeaderPro";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = __ref._createasdatepicker_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ (null,(float) (__c.DipToCurrent((int) (40))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (15),__c.True);
RDebugUtils.currentLine=37290018;
 //BA.debugLineNum = 37290018;BA.debugLine="g_BodyProperties = CreateASDatePicker_BodyPropert";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = __ref._createasdatepicker_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=37290019;
 //BA.debugLineNum = 37290019;BA.debugLine="g_WeekNameProperties = CreateASDatePicker_WeekNam";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = __ref._createasdatepicker_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=37290021;
 //BA.debugLineNum = 37290021;BA.debugLine="g_MonthNameShort = CreateASDatePicker_MonthNameSh";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = __ref._createasdatepicker_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ (null,"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec");
RDebugUtils.currentLine=37290022;
 //BA.debugLineNum = 37290022;BA.debugLine="g_WeekNameShort = CreateASDatePicker_WeekNameShor";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = __ref._createasdatepicker_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ (null,"Mon","Tue","Wed","Thu","Fri","Sat","Sun");
RDebugUtils.currentLine=37290024;
 //BA.debugLineNum = 37290024;BA.debugLine="End Sub";
return "";
}
public String  _ini_viewpager(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "ini_viewpager", true))
	 {return ((String) Debug.delegate(ba, "ini_viewpager", null));}
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Private Sub ini_viewpager";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="tmpmap.Put(\"Orientation\",\"Horizontal\")";
_tmpmap.Put((Object)("Orientation"),(Object)("Horizontal"));
RDebugUtils.currentLine=37355527;
 //BA.debugLineNum = 37355527;BA.debugLine="tmpmap.Put(\"Carousel\",False)";
_tmpmap.Put((Object)("Carousel"),(Object)(__c.False));
RDebugUtils.currentLine=37355528;
 //BA.debugLineNum = 37355528;BA.debugLine="tmpmap.Put(\"LazyLoading\",True)";
_tmpmap.Put((Object)("LazyLoading"),(Object)(__c.True));
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="tmpmap.Put(\"LazyLoadingExtraSize\",3)";
_tmpmap.Put((Object)("LazyLoadingExtraSize"),(Object)(3));
RDebugUtils.currentLine=37355530;
 //BA.debugLineNum = 37355530;BA.debugLine="xASVP_Main.Initialize(Me,\"xASVP_Main\")";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._initialize /*String*/ (null,ba,this,"xASVP_Main");
RDebugUtils.currentLine=37355531;
 //BA.debugLineNum = 37355531;BA.debugLine="xASVP_Main.DesignerCreateView(xpnl_ViewPager,tmpl";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._designercreateview /*String*/ (null,(Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=37355532;
 //BA.debugLineNum = 37355532;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=37355533;
 //BA.debugLineNum = 37355533;BA.debugLine="End Sub";
return "";
}
public int  _getbodycolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodycolor", true))
	 {return ((Integer) Debug.delegate(ba, "getbodycolor", null));}
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Public Sub getBodyColor As Int";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="Return m_BodyColor";
if (true) return __ref._m_bodycolor /*int*/ ;
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="End Sub";
return 0;
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _getbodyproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "getbodyproperties", null));}
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Public Sub getBodyProperties As ASDatePicker_BodyP";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="Return g_BodyProperties";
if (true) return __ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ ;
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentdatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentdatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentdatecolor", null));}
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Public Sub getCurrentDateColor As Int";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Return m_CurrentDateColor";
if (true) return __ref._m_currentdatecolor /*int*/ ;
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="End Sub";
return 0;
}
public String  _getcurrentview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview", null));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Public Sub getCurrentView As String";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Return m_CurrentView";
if (true) return __ref._m_currentview /*String*/ ;
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="End Sub";
return "";
}
public int  _getgridlinecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getgridlinecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getgridlinecolor", null));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Public Sub getGridLineColor As Int";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Return m_GridLineColor";
if (true) return __ref._m_gridlinecolor /*int*/ ;
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="End Sub";
return 0;
}
public int  _getheadercolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheadercolor", true))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Return m_HeaderColor";
if (true) return __ref._m_headercolor /*int*/ ;
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getheaderpanel(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub getHeaderPanel As B4XView";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Return xpnl_Header";
if (true) return __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _getheaderproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "getheaderproperties", null));}
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Public Sub getHeaderProperties As ASDatePicker_Hea";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Return g_HeaderProperties";
if (true) return __ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ ;
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="End Sub";
return null;
}
public long  _getmaxdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmaxdate", true))
	 {return ((Long) Debug.delegate(ba, "getmaxdate", null));}
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Public Sub getMaxDate As Long";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Return m_MaxDate";
if (true) return __ref._m_maxdate /*long*/ ;
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="End Sub";
return 0L;
}
public long  _getmindate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmindate", true))
	 {return ((Long) Debug.delegate(ba, "getmindate", null));}
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Public Sub getMinDate As Long";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Return m_MinDate";
if (true) return __ref._m_mindate /*long*/ ;
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="End Sub";
return 0L;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _getmonthnameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "getmonthnameshort", null));}
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Public Sub getMonthNameShort As ASDatePicker_Month";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Return g_MonthNameShort";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ ;
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="End Sub";
return null;
}
public long  _getselecteddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddate", true))
	 {return ((Long) Debug.delegate(ba, "getselecteddate", null));}
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Public Sub getSelectedDate As Long";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="End Sub";
return 0L;
}
public int  _getselecteddatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselecteddatecolor", null));}
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Public Sub getSelectedDateColor As Int";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="Return m_SelectedDateColor";
if (true) return __ref._m_selecteddatecolor /*int*/ ;
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="End Sub";
return 0;
}
public long  _getselectedenddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedenddate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedenddate", null));}
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Public Sub getSelectedEndDate As Long";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="Return m_SelectedDate2";
if (true) return __ref._m_selecteddate2 /*long*/ ;
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="End Sub";
return 0L;
}
public long  _getselectedstartdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedstartdate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedstartdate", null));}
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Public Sub getSelectedStartDate As Long";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="End Sub";
return 0L;
}
public String  _getselectmode(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode", true))
	 {return ((String) Debug.delegate(ba, "getselectmode", null));}
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Public Sub getSelectMode As String";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="Return m_SelectMode";
if (true) return __ref._m_selectmode /*String*/ ;
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_day(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_day", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_day", null));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Public Sub getSelectMode_Day As String";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="Return \"Date\"";
if (true) return "Date";
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_month(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_month", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_month", null));}
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Public Sub getSelectMode_Month As String";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="Return \"Month\"";
if (true) return "Month";
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowgridlines(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowgridlines", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowgridlines", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Public Sub getShowGridLines As Boolean";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Return m_ShowGridLines";
if (true) return __ref._m_showgridlines /*boolean*/ ;
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowweeknumbers(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowweeknumbers", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowweeknumbers", null));}
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub getShowWeekNumbers As Boolean";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Return m_ShowWeekNumbers";
if (true) return __ref._m_showweeknumbers /*boolean*/ ;
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_dark(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_dark", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_dark", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Public Sub getTheme_Dark As AS_DatePicker_Theme";
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="Theme.BodyColor = 0xFF202125";
_theme.BodyColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=37027845;
 //BA.debugLineNum = 37027845;BA.debugLine="Theme.HeaderColor = 0xFF202125";
_theme.HeaderColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=37027846;
 //BA.debugLineNum = 37027846;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=37027847;
 //BA.debugLineNum = 37027847;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=37027848;
 //BA.debugLineNum = 37027848;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,255,255,2";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=37027849;
 //BA.debugLineNum = 37027849;BA.debugLine="Theme.BodyTextColor = xui.Color_White";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37027850;
 //BA.debugLineNum = 37027850;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37027851;
 //BA.debugLineNum = 37027851;BA.debugLine="Theme.HeaderTextColor = xui.Color_White";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37027852;
 //BA.debugLineNum = 37027852;BA.debugLine="Theme.WeekNameColor =  0xFF202125'xui.Color_ARGB(";
_theme.WeekNameColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=37027853;
 //BA.debugLineNum = 37027853;BA.debugLine="Theme.WeekNameTextColor = xui.Color_White";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37027854;
 //BA.debugLineNum = 37027854;BA.debugLine="Theme.WeekNumberColor = xui.Color_ARGB(255,32, 33";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
RDebugUtils.currentLine=37027855;
 //BA.debugLineNum = 37027855;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_White";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37027857;
 //BA.debugLineNum = 37027857;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=37027859;
 //BA.debugLineNum = 37027859;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_light(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_light", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_light", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Public Sub getTheme_Light As AS_DatePicker_Theme";
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=37093379;
 //BA.debugLineNum = 37093379;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=37093380;
 //BA.debugLineNum = 37093380;BA.debugLine="Theme.BodyColor = xui.Color_White";
_theme.BodyColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37093381;
 //BA.debugLineNum = 37093381;BA.debugLine="Theme.HeaderColor = xui.Color_White";
_theme.HeaderColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37093382;
 //BA.debugLineNum = 37093382;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=37093384;
 //BA.debugLineNum = 37093384;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,0,0,0)";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=37093385;
 //BA.debugLineNum = 37093385;BA.debugLine="Theme.BodyTextColor = xui.Color_Black";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=37093386;
 //BA.debugLineNum = 37093386;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37093387;
 //BA.debugLineNum = 37093387;BA.debugLine="Theme.HeaderTextColor = xui.Color_Black";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=37093388;
 //BA.debugLineNum = 37093388;BA.debugLine="Theme.WeekNameColor = xui.Color_White'xui.Color_A";
_theme.WeekNameColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37093389;
 //BA.debugLineNum = 37093389;BA.debugLine="Theme.WeekNameTextColor = xui.Color_Black";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=37093390;
 //BA.debugLineNum = 37093390;BA.debugLine="Theme.WeekNumberColor = xui.Color_White";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=37093391;
 //BA.debugLineNum = 37093391;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_Black";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=37093393;
 //BA.debugLineNum = 37093393;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=37093395;
 //BA.debugLineNum = 37093395;BA.debugLine="End Sub";
return null;
}
public String  _getweeknamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getweeknamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Public Sub GetWeekNameByIndex(Index As Int) As Str";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="If Index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="Return g_WeekNameShort.Sunday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ ;
 }else 
{RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="else If Index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="Return g_WeekNameShort.Monday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ ;
 }else 
{RDebugUtils.currentLine=42991621;
 //BA.debugLineNum = 42991621;BA.debugLine="else If Index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=42991622;
 //BA.debugLineNum = 42991622;BA.debugLine="Return g_WeekNameShort.Tuesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=42991623;
 //BA.debugLineNum = 42991623;BA.debugLine="else If Index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=42991624;
 //BA.debugLineNum = 42991624;BA.debugLine="Return g_WeekNameShort.Wednesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=42991625;
 //BA.debugLineNum = 42991625;BA.debugLine="else If Index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=42991626;
 //BA.debugLineNum = 42991626;BA.debugLine="Return g_WeekNameShort.Thursday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ ;
 }else 
{RDebugUtils.currentLine=42991627;
 //BA.debugLineNum = 42991627;BA.debugLine="else If Index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=42991628;
 //BA.debugLineNum = 42991628;BA.debugLine="Return g_WeekNameShort.Friday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ ;
 }else {
RDebugUtils.currentLine=42991630;
 //BA.debugLineNum = 42991630;BA.debugLine="Return g_WeekNameShort.Saturday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ ;
 }}}}}}
;
RDebugUtils.currentLine=42991632;
 //BA.debugLineNum = 42991632;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _getweeknameproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "getweeknameproperties", null));}
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Public Sub getWeekNameProperties As ASDatePicker_W";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Return g_WeekNameProperties";
if (true) return __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ ;
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _getweeknameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "getweeknameshort", null));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Public Sub getWeekNameShort As ASDatePicker_WeekNa";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Return g_WeekNameShort";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ ;
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _getweeknumberproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "getweeknumberproperties", null));}
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Public Sub getWeekNumberProperties As ASDatePicker";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Return g_WeekNumberProperties";
if (true) return __ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ ;
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="End Sub";
return "";
}
public String  _refreshselecteddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "refreshselecteddate", true))
	 {return ((String) Debug.delegate(ba, "refreshselecteddate", null));}
int[] _clr = null;
int _i = 0;
int _counter = 0;
int _z = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_day = null;
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Public Sub RefreshSelectedDate";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=38207495;
 //BA.debugLineNum = 38207495;BA.debugLine="Dim counter As Int = xASVP_Main.GetPanel(i).Nu";
_counter = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews();
RDebugUtils.currentLine=38207496;
 //BA.debugLineNum = 38207496;BA.debugLine="For z = 0 To counter -1";
{
final int step6 = 1;
final int limit6 = (int) (_counter-1);
_z = (int) (0) ;
for (;_z <= limit6 ;_z = _z + step6 ) {
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="Dim xpnl_Day As B4XView = xASVP_Main.GetPanel";
_xpnl_day = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_day = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).GetView(_z);
RDebugUtils.currentLine=38207498;
 //BA.debugLineNum = 38207498;BA.debugLine="If xpnl_Day.tag Is Long And xpnl_Day.NumberOf";
if (_xpnl_day.getTag() instanceof Long && _xpnl_day.getNumberOfViews()>0) { 
RDebugUtils.currentLine=38207499;
 //BA.debugLineNum = 38207499;BA.debugLine="CreateSelectDates(xpnl_Day,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_day,_clr);
 };
 }
};
 };
 };
 }
};
RDebugUtils.currentLine=38207506;
 //BA.debugLineNum = 38207506;BA.debugLine="End Sub";
return "";
}
public String  _selecteddaterangechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddaterangechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddaterangechanged", null));}
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Private Sub SelectedDateRangeChanged";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(int) (2))) { 
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SelectedDateR";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(Object)(__ref._m_selecteddate /*long*/ ),(Object)(__ref._m_selecteddate2 /*long*/ ));
 };
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="End Sub";
return "";
}
public String  _selecteddatechanged(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddatechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddatechanged", new Object[] {_date}));}
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Private Sub SelectedDateChanged(date As Long)";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(int) (1))) { 
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedDateC";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(Object)(_date));
 };
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="End Sub";
return "";
}
public String  _pagechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "pagechanged", true))
	 {return ((String) Debug.delegate(ba, "pagechanged", null));}
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Private Sub PageChanged";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(int) (0))) { 
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="CallSub(mCallBack, mEventName & \"_PageChanged\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged");
 };
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="End Sub";
return "";
}
public void  _rebuild(b4a.example.ef.as_datepicker __ref) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "rebuild", true))
	 {Debug.delegate(ba, "rebuild", null); return;}
ResumableSub_Rebuild rsub = new ResumableSub_Rebuild(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Rebuild extends BA.ResumableSub {
public ResumableSub_Rebuild(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
b4a.example.ef.as_datepicker parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="Do While m_isReady = False";
if (true) break;

case 1:
//do while
this.state = 4;
while (__ref._m_isready /*boolean*/ ==parent.__c.False) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
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
RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 5;
;
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=38404103;
 //BA.debugLineNum = 38404103;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
this.state = 9;
}}
if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=38404106;
 //BA.debugLineNum = 38404106;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=38404109;
 //BA.debugLineNum = 38404109;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=38404111;
 //BA.debugLineNum = 38404111;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _refresh(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
int _i = 0;
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="xASVP_Main.GetPanel(i).RemoveAllViews";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).RemoveAllViews();
RDebugUtils.currentLine=38141956;
 //BA.debugLineNum = 38141956;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=38141957;
 //BA.debugLineNum = 38141957;BA.debugLine="AddMonth(xASVP_Main.GetPanel(i),xASVP_Main.Get";
__ref._addmonth /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }else 
{RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=38141959;
 //BA.debugLineNum = 38141959;BA.debugLine="AddYear(xASVP_Main.GetPanel(i),xASVP_Main.GetV";
__ref._addyear /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }}
;
 };
 }
};
RDebugUtils.currentLine=38141963;
 //BA.debugLineNum = 38141963;BA.debugLine="End Sub";
return "";
}
public String  _refreshheader(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "refreshheader", true))
	 {return ((String) Debug.delegate(ba, "refreshheader", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowleft = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_arrowright = null;
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Public Sub RefreshHeader";
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = xpnl_Header.GetVi";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="Dim xlbl_ArrowRight As B4XView = xpnl_Header.GetV";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=38338568;
 //BA.debugLineNum = 38338568;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=38338569;
 //BA.debugLineNum = 38338569;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=38338572;
 //BA.debugLineNum = 38338572;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=38338573;
 //BA.debugLineNum = 38338573;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=38338574;
 //BA.debugLineNum = 38338574;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=38338576;
 //BA.debugLineNum = 38338576;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=38338577;
 //BA.debugLineNum = 38338577;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=38338579;
 //BA.debugLineNum = 38338579;BA.debugLine="End Sub";
return "";
}
public String  _scroll2date(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "scroll2date", true))
	 {return ((String) Debug.delegate(ba, "scroll2date", new Object[] {_date}));}
int _scrollindex = 0;
int _i = 0;
long _startdate = 0L;
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Public Sub Scroll2Date(Date As Long)";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="Dim ScrollIndex As Int = -1";
_scrollindex = (int) (-1);
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=40042499;
 //BA.debugLineNum = 40042499;BA.debugLine="Dim StartDate As Long = xASVP_Main.GetValue(i)";
_startdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i));
RDebugUtils.currentLine=40042501;
 //BA.debugLineNum = 40042501;BA.debugLine="If DateTime.GetYear(StartDate) = DateTime.GetYea";
if (__c.DateTime.GetYear(_startdate)==__c.DateTime.GetYear(_date) && __c.DateTime.GetMonth(_startdate)==__c.DateTime.GetMonth(_date)) { 
RDebugUtils.currentLine=40042502;
 //BA.debugLineNum = 40042502;BA.debugLine="ScrollIndex = i";
_scrollindex = _i;
 };
 }
};
RDebugUtils.currentLine=40042506;
 //BA.debugLineNum = 40042506;BA.debugLine="If ScrollIndex <> -1 Then";
if (_scrollindex!=-1) { 
RDebugUtils.currentLine=40042507;
 //BA.debugLineNum = 40042507;BA.debugLine="xASVP_Main.CurrentIndex = ScrollIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex /*int*/ (null,_scrollindex);
 }else {
RDebugUtils.currentLine=40042509;
 //BA.debugLineNum = 40042509;BA.debugLine="m_StartDate = Date";
__ref._m_startdate /*long*/  = _date;
RDebugUtils.currentLine=40042510;
 //BA.debugLineNum = 40042510;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=40042511;
 //BA.debugLineNum = 40042511;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 };
RDebugUtils.currentLine=40042513;
 //BA.debugLineNum = 40042513;BA.debugLine="End Sub";
return "";
}
public String  _setbodycolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodycolor", true))
	 {return ((String) Debug.delegate(ba, "setbodycolor", new Object[] {_color}));}
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Public Sub setBodyColor(Color As Int)";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="m_BodyColor = Color";
__ref._m_bodycolor /*int*/  = _color;
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=39649284;
 //BA.debugLineNum = 39649284;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=39649285;
 //BA.debugLineNum = 39649285;BA.debugLine="End Sub";
return "";
}
public String  _setbodyproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _bodyproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodyproperties", true))
	 {return ((String) Debug.delegate(ba, "setbodyproperties", new Object[] {_bodyproperties}));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Public Sub setBodyProperties(BodyProperties As ASD";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="g_BodyProperties = BodyProperties";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = _bodyproperties;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentdatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setcurrentdatecolor", true))
	 {return ((String) Debug.delegate(ba, "setcurrentdatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Public Sub setCurrentDateColor(Color As Int)";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="m_CurrentDateColor = Color";
__ref._m_currentdatecolor /*int*/  = _color;
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="End Sub";
return "";
}
public String  _setfirstdayofweek(b4a.example.ef.as_datepicker __ref,int _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setfirstdayofweek", true))
	 {return ((String) Debug.delegate(ba, "setfirstdayofweek", new Object[] {_number}));}
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Public Sub setFirstDayOfWeek(number As Int)";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="m_FirstDayOfWeek = number";
__ref._m_firstdayofweek /*int*/  = _number;
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="End Sub";
return "";
}
public String  _setgridlinecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setgridlinecolor", true))
	 {return ((String) Debug.delegate(ba, "setgridlinecolor", new Object[] {_color}));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Public Sub setGridLineColor(Color As Int)";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="m_GridLineColor = Color";
__ref._m_gridlinecolor /*int*/  = _color;
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheadercolor", true))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="m_HeaderColor = Color";
__ref._m_headercolor /*int*/  = _color;
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="End Sub";
return "";
}
public String  _setheaderproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_headerproperties _headerproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheaderproperties", true))
	 {return ((String) Debug.delegate(ba, "setheaderproperties", new Object[] {_headerproperties}));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Public Sub setHeaderProperties(HeaderProperties As";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="g_HeaderProperties = HeaderProperties";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = _headerproperties;
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="End Sub";
return "";
}
public String  _setmaxdate(b4a.example.ef.as_datepicker __ref,long _maxdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmaxdate", true))
	 {return ((String) Debug.delegate(ba, "setmaxdate", new Object[] {_maxdate}));}
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Public Sub setMaxDate(MaxDate As Long)";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="m_MaxDate = MaxDate";
__ref._m_maxdate /*long*/  = _maxdate;
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="End Sub";
return "";
}
public String  _setmindate(b4a.example.ef.as_datepicker __ref,long _mindate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmindate", true))
	 {return ((String) Debug.delegate(ba, "setmindate", new Object[] {_mindate}));}
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Public Sub setMinDate(MinDate As Long)";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="m_MinDate = MinDate";
__ref._m_mindate /*long*/  = _mindate;
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="End Sub";
return "";
}
public String  _setmonthnameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _monthnameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmonthnameshort", true))
	 {return ((String) Debug.delegate(ba, "setmonthnameshort", new Object[] {_monthnameshort}));}
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Public Sub setMonthNameShort(MonthNameShort As ASD";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="g_MonthNameShort = MonthNameShort";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = _monthnameshort;
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddate", true))
	 {return ((String) Debug.delegate(ba, "setselecteddate", new Object[] {_date}));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Public Sub setSelectedDate(Date As Long)";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddatecolor", true))
	 {return ((String) Debug.delegate(ba, "setselecteddatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Public Sub setSelectedDateColor(Color As Int)";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="m_SelectedDateColor = Color";
__ref._m_selecteddatecolor /*int*/  = _color;
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="End Sub";
return "";
}
public String  _setselectedenddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedenddate", true))
	 {return ((String) Debug.delegate(ba, "setselectedenddate", new Object[] {_date}));}
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Public Sub setSelectedEndDate(Date As Long)";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="m_SelectedDate2 = Date";
__ref._m_selecteddate2 /*long*/  = _date;
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="End Sub";
return "";
}
public String  _setselectedstartdate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedstartdate", true))
	 {return ((String) Debug.delegate(ba, "setselectedstartdate", new Object[] {_date}));}
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Public Sub setSelectedStartDate(Date As Long)";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="End Sub";
return "";
}
public String  _setselectmode(b4a.example.ef.as_datepicker __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectmode", true))
	 {return ((String) Debug.delegate(ba, "setselectmode", new Object[] {_mode}));}
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Public Sub setSelectMode(Mode As String)";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="m_SelectMode = Mode";
__ref._m_selectmode /*String*/  = _mode;
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="End Sub";
return "";
}
public String  _setshowgridlines(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowgridlines", true))
	 {return ((String) Debug.delegate(ba, "setshowgridlines", new Object[] {_show}));}
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Public Sub setShowGridLines(Show As Boolean)";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="m_ShowGridLines = Show";
__ref._m_showgridlines /*boolean*/  = _show;
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="End Sub";
return "";
}
public String  _setshowweeknumbers(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowweeknumbers", true))
	 {return ((String) Debug.delegate(ba, "setshowweeknumbers", new Object[] {_show}));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Public Sub setShowWeekNumbers(Show As Boolean)";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="m_ShowWeekNumbers = Show";
__ref._m_showweeknumbers /*boolean*/  = _show;
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="End Sub";
return "";
}
public void  _settheme(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._as_datepicker_theme _theme) throws Exception{
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "settheme", true))
	 {Debug.delegate(ba, "settheme", new Object[] {_theme}); return;}
ResumableSub_setTheme rsub = new ResumableSub_setTheme(this,__ref,_theme);
rsub.resume(ba, null);
}
public static class ResumableSub_setTheme extends BA.ResumableSub {
public ResumableSub_setTheme(b4a.example.ef.as_datepicker parent,b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._as_datepicker_theme _theme) {
this.parent = parent;
this.__ref = __ref;
this._theme = _theme;
this.__ref = parent;
}
b4a.example.ef.as_datepicker __ref;
b4a.example.ef.as_datepicker parent;
b4a.example.ef.as_datepicker._as_datepicker_theme _theme;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="as_datepicker";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="xiv_RefreshImage.SetBitmap(mBase.Snapshot)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .Snapshot().getObject()));
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,True)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=36962309;
 //BA.debugLineNum = 36962309;BA.debugLine="m_BodyColor = Theme.BodyColor";
__ref._m_bodycolor /*int*/  = _theme.BodyColor /*int*/ ;
RDebugUtils.currentLine=36962310;
 //BA.debugLineNum = 36962310;BA.debugLine="m_HeaderColor = Theme.HeaderColor";
__ref._m_headercolor /*int*/  = _theme.HeaderColor /*int*/ ;
RDebugUtils.currentLine=36962311;
 //BA.debugLineNum = 36962311;BA.debugLine="m_CurrentDateColor = Theme.CurrentDateColor";
__ref._m_currentdatecolor /*int*/  = _theme.CurrentDateColor /*int*/ ;
RDebugUtils.currentLine=36962312;
 //BA.debugLineNum = 36962312;BA.debugLine="m_SelectedDateColor = Theme.SelectedDateColor";
__ref._m_selecteddatecolor /*int*/  = _theme.SelectedDateColor /*int*/ ;
RDebugUtils.currentLine=36962313;
 //BA.debugLineNum = 36962313;BA.debugLine="m_GridLineColor = Theme.GridLineColor";
__ref._m_gridlinecolor /*int*/  = _theme.GridLineColor /*int*/ ;
RDebugUtils.currentLine=36962314;
 //BA.debugLineNum = 36962314;BA.debugLine="g_BodyProperties.TextColor = Theme.BodyTextColor";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/  = _theme.BodyTextColor /*int*/ ;
RDebugUtils.currentLine=36962315;
 //BA.debugLineNum = 36962315;BA.debugLine="g_HeaderProperties.TextColor = Theme.HeaderTextCo";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/  = _theme.HeaderTextColor /*int*/ ;
RDebugUtils.currentLine=36962316;
 //BA.debugLineNum = 36962316;BA.debugLine="g_WeekNameProperties.Color = Theme.WeekNameColor";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/  = _theme.WeekNameColor /*int*/ ;
RDebugUtils.currentLine=36962317;
 //BA.debugLineNum = 36962317;BA.debugLine="g_WeekNameProperties.TextColor = Theme.WeekNameTe";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/  = _theme.WeekNameTextColor /*int*/ ;
RDebugUtils.currentLine=36962318;
 //BA.debugLineNum = 36962318;BA.debugLine="g_WeekNumberProperties.Color = Theme.WeekNumberCo";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/  = _theme.WeekNumberColor /*int*/ ;
RDebugUtils.currentLine=36962319;
 //BA.debugLineNum = 36962319;BA.debugLine="g_WeekNumberProperties.TextColor = Theme.WeekNumb";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/  = _theme.WeekNumberTextColor /*int*/ ;
RDebugUtils.currentLine=36962320;
 //BA.debugLineNum = 36962320;BA.debugLine="g_BodyProperties.SelectedTextColor = Theme.Select";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/  = _theme.SelectedTextColor /*int*/ ;
RDebugUtils.currentLine=36962322;
 //BA.debugLineNum = 36962322;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=36962324;
 //BA.debugLineNum = 36962324;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=36962325;
 //BA.debugLineNum = 36962325;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=36962326;
 //BA.debugLineNum = 36962326;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=36962328;
 //BA.debugLineNum = 36962328;BA.debugLine="RefreshHeader";
__ref._refreshheader /*String*/ (null);
RDebugUtils.currentLine=36962329;
 //BA.debugLineNum = 36962329;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=36962331;
 //BA.debugLineNum = 36962331;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=36962333;
 //BA.debugLineNum = 36962333;BA.debugLine="Select m_ThemeChangeTransition";
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(__ref._m_themechangetransition /*String*/ ,"None","Fade")) {
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
RDebugUtils.currentLine=36962335;
 //BA.debugLineNum = 36962335;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=36962337;
 //BA.debugLineNum = 36962337;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(250,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=36962340;
 //BA.debugLineNum = 36962340;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setweeknameproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _weeknameproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknameproperties", true))
	 {return ((String) Debug.delegate(ba, "setweeknameproperties", new Object[] {_weeknameproperties}));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Public Sub setWeekNameProperties(WeekNamePropertie";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="g_WeekNameProperties = WeekNameProperties";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = _weeknameproperties;
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="End Sub";
return "";
}
public String  _setweeknameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _weeknameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknameshort", true))
	 {return ((String) Debug.delegate(ba, "setweeknameshort", new Object[] {_weeknameshort}));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Public Sub setWeekNameShort(WeekNameShort As ASDat";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="g_WeekNameShort = WeekNameShort";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = _weeknameshort;
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="End Sub";
return "";
}
public String  _setweeknumberproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _weeknumberproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknumberproperties", true))
	 {return ((String) Debug.delegate(ba, "setweeknumberproperties", new Object[] {_weeknumberproperties}));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Public Sub setWeekNumberProperties(WeekNumberPrope";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="g_WeekNumberProperties = WeekNumberProperties";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = _weeknumberproperties;
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_lazyloadingaddcontent(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_lazyloadingaddcontent", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_lazyloadingaddcontent", new Object[] {_parent,_value}));}
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Private Sub xASVP_Main_LazyLoadingAddContent(Paren";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="AddMonth(Parent,Value)";
__ref._addmonth /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }else 
{RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView O";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="AddYear(Parent,Value)";
__ref._addyear /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }}
;
RDebugUtils.currentLine=42139654;
 //BA.debugLineNum = 42139654;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechange(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechange", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechange", new Object[] {_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
long _currentdate = 0L;
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Private Sub xASVP_Main_PageChange(Index As Int)";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="Dim CurrentDate As Long = xASVP_Main.GetValue(Ind";
_currentdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=42205187;
 //BA.debugLineNum = 42205187;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=42205188;
 //BA.debugLineNum = 42205188;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(Current";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,_currentdate)+" "+BA.NumberToString(__c.DateTime.GetYear(_currentdate))));
 }else 
{RDebugUtils.currentLine=42205189;
 //BA.debugLineNum = 42205189;BA.debugLine="else if m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=42205190;
 //BA.debugLineNum = 42205190;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(_currentdate)));
 }else 
{RDebugUtils.currentLine=42205191;
 //BA.debugLineNum = 42205191;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=42205192;
 //BA.debugLineNum = 42205192;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString((__c.DateTime.GetYear(_currentdate)+11))));
 }else 
{RDebugUtils.currentLine=42205193;
 //BA.debugLineNum = 42205193;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=42205194;
 //BA.debugLineNum = 42205194;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+10*12)-1))));
 }}}}
;
RDebugUtils.currentLine=42205196;
 //BA.debugLineNum = 42205196;BA.debugLine="CustomDrawHeader(CurrentDate)";
__ref._customdrawheader /*String*/ (null,_currentdate);
RDebugUtils.currentLine=42205197;
 //BA.debugLineNum = 42205197;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechanged", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechanged", new Object[] {_index}));}
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Private Sub xASVP_Main_PageChanged(Index As Int)";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="PageChanged";
__ref._pagechanged /*String*/ (null);
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged2(b4a.example.ef.as_datepicker __ref,int _newindex,int _oldindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechanged2", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechanged2", new Object[] {_newindex,_oldindex}));}
boolean _forward = false;
boolean _doit = false;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
b4a.example.dateutils._period _p2 = null;
long _currenttime = 0L;
long _firstdayofmonth = 0L;
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Private Sub xASVP_Main_PageChanged2(NewIndex As In";
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="If m_MinDate > 0 And m_MaxDate > 0 Then Return";
if (__ref._m_mindate /*long*/ >0 && __ref._m_maxdate /*long*/ >0) { 
if (true) return "";};
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="Dim Forward As Boolean = False";
_forward = __c.False;
RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="Dim DoIt As Boolean = False";
_doit = __c.False;
RDebugUtils.currentLine=37617671;
 //BA.debugLineNum = 37617671;BA.debugLine="If NewIndex <= OldIndex Then";
if (_newindex<=_oldindex) { 
RDebugUtils.currentLine=37617672;
 //BA.debugLineNum = 37617672;BA.debugLine="If NewIndex <= 2 Then";
if (_newindex<=2) { 
RDebugUtils.currentLine=37617673;
 //BA.debugLineNum = 37617673;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=37617674;
 //BA.debugLineNum = 37617674;BA.debugLine="Forward = False";
_forward = __c.False;
 };
 }else {
RDebugUtils.currentLine=37617677;
 //BA.debugLineNum = 37617677;BA.debugLine="If NewIndex = xASVP_Main.Size -2 Then";
if (_newindex==__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-2) { 
RDebugUtils.currentLine=37617678;
 //BA.debugLineNum = 37617678;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=37617679;
 //BA.debugLineNum = 37617679;BA.debugLine="Forward = True";
_forward = __c.True;
 };
 };
RDebugUtils.currentLine=37617683;
 //BA.debugLineNum = 37617683;BA.debugLine="If DoIt Then";
if (_doit) { 
RDebugUtils.currentLine=37617685;
 //BA.debugLineNum = 37617685;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=37617686;
 //BA.debugLineNum = 37617686;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37617687;
 //BA.debugLineNum = 37617687;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37617688;
 //BA.debugLineNum = 37617688;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37617690;
 //BA.debugLineNum = 37617690;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37617691;
 //BA.debugLineNum = 37617691;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=37617692;
 //BA.debugLineNum = 37617692;BA.debugLine="p2.Months = IIf(Forward,1,-1)";
_p2.Months = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=37617694;
 //BA.debugLineNum = 37617694;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=37617695;
 //BA.debugLineNum = 37617695;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate";
_firstdayofmonth = _dateutils._setdate(ba,__c.DateTime.GetYear(_currenttime),__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=37617697;
 //BA.debugLineNum = 37617697;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=37617698;
 //BA.debugLineNum = 37617698;BA.debugLine="If m_MaxDate > 0 And FirstDayOfMonth > DateUti";
if (__ref._m_maxdate /*long*/ >0 && _firstdayofmonth>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=37617699;
 //BA.debugLineNum = 37617699;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37617701;
 //BA.debugLineNum = 37617701;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfM";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
 }else {
RDebugUtils.currentLine=37617703;
 //BA.debugLineNum = 37617703;BA.debugLine="If m_MinDate > 0 And FirstDayOfMonth < DateUti";
if (__ref._m_mindate /*long*/ >0 && _firstdayofmonth<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=37617704;
 //BA.debugLineNum = 37617704;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37617706;
 //BA.debugLineNum = 37617706;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,FirstDa";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_firstdayofmonth));
 };
 }else 
{RDebugUtils.currentLine=37617709;
 //BA.debugLineNum = 37617709;BA.debugLine="else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=37617711;
 //BA.debugLineNum = 37617711;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37617712;
 //BA.debugLineNum = 37617712;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37617713;
 //BA.debugLineNum = 37617713;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37617715;
 //BA.debugLineNum = 37617715;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37617716;
 //BA.debugLineNum = 37617716;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=37617717;
 //BA.debugLineNum = 37617717;BA.debugLine="p2.Years = IIf(Forward,1,-1)";
_p2.Years = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=37617719;
 //BA.debugLineNum = 37617719;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=37617722;
 //BA.debugLineNum = 37617722;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=37617723;
 //BA.debugLineNum = 37617723;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=37617724;
 //BA.debugLineNum = 37617724;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37617726;
 //BA.debugLineNum = 37617726;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 }else {
RDebugUtils.currentLine=37617728;
 //BA.debugLineNum = 37617728;BA.debugLine="If m_MinDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_mindate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )) { 
RDebugUtils.currentLine=37617729;
 //BA.debugLineNum = 37617729;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37617731;
 //BA.debugLineNum = 37617731;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,Current";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_currenttime));
 };
 }else 
{RDebugUtils.currentLine=37617734;
 //BA.debugLineNum = 37617734;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=37617736;
 //BA.debugLineNum = 37617736;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=37617738;
 //BA.debugLineNum = 37617738;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePan";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37617739;
 //BA.debugLineNum = 37617739;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=37617740;
 //BA.debugLineNum = 37617740;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_V";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=37617742;
 //BA.debugLineNum = 37617742;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37617743;
 //BA.debugLineNum = 37617743;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=37617744;
 //BA.debugLineNum = 37617744;BA.debugLine="p2.Years = 10";
_p2.Years = (int) (10);
RDebugUtils.currentLine=37617746;
 //BA.debugLineNum = 37617746;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1))),_p2);
RDebugUtils.currentLine=37617749;
 //BA.debugLineNum = 37617749;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=37617750;
 //BA.debugLineNum = 37617750;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37617752;
 //BA.debugLineNum = 37617752;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 };
 }}}
;
 };
RDebugUtils.currentLine=37617759;
 //BA.debugLineNum = 37617759;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_header_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_header_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_header_click", null));}
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Private Sub xlbl_Header_Click";
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=42401795;
 //BA.debugLineNum = 42401795;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=42401796;
 //BA.debugLineNum = 42401796;BA.debugLine="else If m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=42401797;
 //BA.debugLineNum = 42401797;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=42401798;
 //BA.debugLineNum = 42401798;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=42401799;
 //BA.debugLineNum = 42401799;BA.debugLine="ChangeView(getCurrentView_CenturyView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_centuryview /*String*/ (null));
 }}}
;
RDebugUtils.currentLine=42401801;
 //BA.debugLineNum = 42401801;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowleft_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowleft_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowleft_click", null));}
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Private Sub xlbl_HeaderArrowLeft_Click";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="xASVP_Main.PreviousPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._previouspage /*String*/ (null);
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowright_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowright_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowright_click", null));}
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Private Sub xlbl_HeaderArrowRight_Click";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="xASVP_Main.NextPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._nextpage /*String*/ (null);
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_centurydecade_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_centurydecade_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_centurydecade_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_centurydecade = null;
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Private Sub xpnl_CenturyDecade_Click";
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="Dim xpnl_CenturyDecade As B4XView = Sender";
_xpnl_centurydecade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_centurydecade = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=42598403;
 //BA.debugLineNum = 42598403;BA.debugLine="m_StartDate = xpnl_CenturyDecade.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_centurydecade.getTag());
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
RDebugUtils.currentLine=42598405;
 //BA.debugLineNum = 42598405;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_decadeyear_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_decadeyear_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_decadeyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_decadeyear = null;
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Private Sub xpnl_DecadeYear_Click";
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="Dim xpnl_DecadeYear As B4XView = Sender";
_xpnl_decadeyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_decadeyear = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="m_StartDate = xpnl_DecadeYear.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_decadeyear.getTag());
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
RDebugUtils.currentLine=42467333;
 //BA.debugLineNum = 42467333;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_monthdate_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_monthdate_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_monthdate_click", null));}
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Private Sub xpnl_MonthDate_Click";
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="MonthDateClick(Sender,True)";
__ref._monthdateclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_yearmonth_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_yearmonth_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_yearmonth_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_yearmonth = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_date = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Private Sub xpnl_YearMonth_Click";
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="Dim xpnl_YearMonth As B4XView = Sender";
_xpnl_yearmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_yearmonth = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="m_StartDate = xpnl_YearMonth.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_yearmonth.getTag());
RDebugUtils.currentLine=42532868;
 //BA.debugLineNum = 42532868;BA.debugLine="If m_SelectMode = \"Date\"  Or m_SelectMode = \"Rang";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=42532869;
 //BA.debugLineNum = 42532869;BA.debugLine="ChangeView(getCurrentView_MonthView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_monthview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=42532870;
 //BA.debugLineNum = 42532870;BA.debugLine="Else If m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=42532871;
 //BA.debugLineNum = 42532871;BA.debugLine="SelectedDateChanged(xpnl_YearMonth.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_yearmonth.getTag()));
RDebugUtils.currentLine=42532873;
 //BA.debugLineNum = 42532873;BA.debugLine="If m_MouseHoverFeedback = True Then";
if (__ref._m_mousehoverfeedback /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=42532874;
 //BA.debugLineNum = 42532874;BA.debugLine="Dim xlbl_Date As B4XView = xpnl_YearMonth.GetVi";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _xpnl_yearmonth.GetView((int) (0));
RDebugUtils.currentLine=42532875;
 //BA.debugLineNum = 42532875;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=42532879;
 //BA.debugLineNum = 42532879;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=42532880;
 //BA.debugLineNum = 42532880;BA.debugLine="xpnl_YearMonth.AddView(xpnl_selected,0,0,xpnl_Y";
_xpnl_yearmonth.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (0),_xpnl_yearmonth.getWidth(),_xpnl_yearmonth.getHeight());
RDebugUtils.currentLine=42532882;
 //BA.debugLineNum = 42532882;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateC";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=42532883;
 //BA.debugLineNum = 42532883;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=42532884;
 //BA.debugLineNum = 42532884;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=42532885;
 //BA.debugLineNum = 42532885;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
 }}
;
RDebugUtils.currentLine=42532892;
 //BA.debugLineNum = 42532892;BA.debugLine="End Sub";
return "";
}
}