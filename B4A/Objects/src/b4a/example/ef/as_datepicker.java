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
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub AddMonth(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="Dim BlockHeight As Float = (Parent.Height-g_WeekN";
_blockheight = (float) ((_parent.getHeight()-__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ )/(double)6);
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="Dim BlockWidth As Float = IIf(m_ShowWeekNumbers,(";
_blockwidth = (float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))));
RDebugUtils.currentLine=18022407;
 //BA.debugLineNum = 18022407;BA.debugLine="If m_ShowWeekNumbers Then AddWeekName(Parent,-1,g";
if (__ref._m_showweeknumbers /*boolean*/ ) { 
__ref._addweekname /*String*/ (null,_parent,(int) (-1),__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Text /*String*/ );};
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="AddWeekName(Parent,0,g_WeekNameShort.Monday)";
__ref._addweekname /*String*/ (null,_parent,(int) (0),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ );
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="AddWeekName(Parent,1,g_WeekNameShort.Tuesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (1),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ );
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="AddWeekName(Parent,2,g_WeekNameShort.Wednesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (2),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ );
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="AddWeekName(Parent,3,g_WeekNameShort.Thursday)";
__ref._addweekname /*String*/ (null,_parent,(int) (3),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ );
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="AddWeekName(Parent,4,g_WeekNameShort.Friday)";
__ref._addweekname /*String*/ (null,_parent,(int) (4),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ );
RDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="AddWeekName(Parent,5,g_WeekNameShort.Saturday)";
__ref._addweekname /*String*/ (null,_parent,(int) (5),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ );
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="AddWeekName(Parent,6,g_WeekNameShort.Sunday)";
__ref._addweekname /*String*/ (null,_parent,(int) (6),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ );
RDebugUtils.currentLine=18022416;
 //BA.debugLineNum = 18022416;BA.debugLine="Dim FirstDay As Long = GetFirstDayOfWeek2(Current";
_firstday = __ref._getfirstdayofweek2 /*long*/ (null,_currentdate,__ref._m_firstdayofweek /*int*/ );
RDebugUtils.currentLine=18022418;
 //BA.debugLineNum = 18022418;BA.debugLine="Dim CurrenMonth As Int = DateTime.GetMonth(Curren";
_currenmonth = __c.DateTime.GetMonth(_currentdate);
RDebugUtils.currentLine=18022420;
 //BA.debugLineNum = 18022420;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=18022423;
 //BA.debugLineNum = 18022423;BA.debugLine="For i = 1 To 43 -1";
{
final int step15 = 1;
final int limit15 = (int) (43-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=18022425;
 //BA.debugLineNum = 18022425;BA.debugLine="Dim CurrentDay As Long = FirstDay + DateTime.Tic";
_currentday = (long) (_firstday+__c.DateTime.TicksPerDay*(_i-1)+__c.DateTime.TicksPerHour);
RDebugUtils.currentLine=18022427;
 //BA.debugLineNum = 18022427;BA.debugLine="Dim Rest As Int = (i-1)/7";
_rest = (int) ((_i-1)/(double)7);
RDebugUtils.currentLine=18022428;
 //BA.debugLineNum = 18022428;BA.debugLine="Dim test As Int = (i-1) Mod 7";
_test = (int) ((_i-1)%7);
RDebugUtils.currentLine=18022430;
 //BA.debugLineNum = 18022430;BA.debugLine="Dim xpnl_Date As B4XView = xui.CreatePanel(\"xpnl";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_MonthDate");
RDebugUtils.currentLine=18022431;
 //BA.debugLineNum = 18022431;BA.debugLine="xpnl_Date.Tag = CurrentDay";
_xpnl_date.setTag((Object)(_currentday));
RDebugUtils.currentLine=18022432;
 //BA.debugLineNum = 18022432;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent'm_BodyCo";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=18022433;
 //BA.debugLineNum = 18022433;BA.debugLine="Parent.AddView(xpnl_Date,IIf(m_ShowWeekNumbers,g";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_test)),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=18022434;
 //BA.debugLineNum = 18022434;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=18022435;
 //BA.debugLineNum = 18022435;BA.debugLine="xlbl_Date.Tag = \"xlbl_Date\"";
_xlbl_date.setTag((Object)("xlbl_Date"));
RDebugUtils.currentLine=18022436;
 //BA.debugLineNum = 18022436;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=18022437;
 //BA.debugLineNum = 18022437;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=18022438;
 //BA.debugLineNum = 18022438;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=18022439;
 //BA.debugLineNum = 18022439;BA.debugLine="xlbl_Date.Text = DateTime.GetDayOfMonth(CurrentD";
_xlbl_date.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(_currentday)));
RDebugUtils.currentLine=18022442;
 //BA.debugLineNum = 18022442;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=18022444;
 //BA.debugLineNum = 18022444;BA.debugLine="If DateTime.GetMonth(CurrentDay) <> CurrenMonth";
if (__c.DateTime.GetMonth(_currentday)!=_currenmonth) { 
RDebugUtils.currentLine=18022445;
 //BA.debugLineNum = 18022445;BA.debugLine="If m_InactiveDaysVisible = False Then";
if (__ref._m_inactivedaysvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=18022446;
 //BA.debugLineNum = 18022446;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 }else {
RDebugUtils.currentLine=18022448;
 //BA.debugLineNum = 18022448;BA.debugLine="Dim Color() As Int = GetARGB(g_BodyProperties.";
_color = __ref._getargb /*int[]*/ (null,__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=18022449;
 //BA.debugLineNum = 18022449;BA.debugLine="xlbl_Date.TextColor = xui.Color_ARGB(100,Color";
_xlbl_date.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (100),_color[(int) (1)],_color[(int) (2)],_color[(int) (3)]));
 };
 };
RDebugUtils.currentLine=18022453;
 //BA.debugLineNum = 18022453;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=18022454;
 //BA.debugLineNum = 18022454;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 };
RDebugUtils.currentLine=18022459;
 //BA.debugLineNum = 18022459;BA.debugLine="CreateSelectDates(xpnl_Date,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_date,_clr);
RDebugUtils.currentLine=18022461;
 //BA.debugLineNum = 18022461;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,CurrentDay)";
if (_dateutils._issameday(ba,__c.DateTime.getNow(),_currentday)==__c.True && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=18022462;
 //BA.debugLineNum = 18022462;BA.debugLine="Dim xpnl_CurrentDay As B4XView = xui.CreatePane";
_xpnl_currentday = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_currentday = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18022463;
 //BA.debugLineNum = 18022463;BA.debugLine="xpnl_CurrentDay.SetColorAndBorder(m_CurrentDate";
_xpnl_currentday.SetColorAndBorder(__ref._m_currentdatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=18022464;
 //BA.debugLineNum = 18022464;BA.debugLine="xpnl_Date.AddView(xpnl_CurrentDay,BlockWidth/2";
_xpnl_date.AddView((android.view.View)(_xpnl_currentday.getObject()),(int) (_blockwidth/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_blockheight/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 };
RDebugUtils.currentLine=18022468;
 //BA.debugLineNum = 18022468;BA.debugLine="If m_ShowWeekNumbers = True Then";
if (__ref._m_showweeknumbers /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18022469;
 //BA.debugLineNum = 18022469;BA.debugLine="Dim xpnl_WeekNumber As B4XView = xui.CreatePane";
_xpnl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_weeknumber = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18022470;
 //BA.debugLineNum = 18022470;BA.debugLine="Dim xlbl_WeekNumber As B4XView = CreateLabel(\"\"";
_xlbl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weeknumber = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=18022471;
 //BA.debugLineNum = 18022471;BA.debugLine="Parent.AddView(xpnl_WeekNumber,0,g_WeekNameProp";
_parent.AddView((android.view.View)(_xpnl_weeknumber.getObject()),(int) (0),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=18022472;
 //BA.debugLineNum = 18022472;BA.debugLine="xpnl_WeekNumber.AddView(xlbl_WeekNumber,0,0,g_W";
_xpnl_weeknumber.AddView((android.view.View)(_xlbl_weeknumber.getObject()),(int) (0),(int) (0),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=18022474;
 //BA.debugLineNum = 18022474;BA.debugLine="xpnl_WeekNumber.Color = g_WeekNumberProperties.";
_xpnl_weeknumber.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=18022476;
 //BA.debugLineNum = 18022476;BA.debugLine="xlbl_WeekNumber.SetTextAlignment(\"CENTER\",\"CENT";
_xlbl_weeknumber.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=18022477;
 //BA.debugLineNum = 18022477;BA.debugLine="xlbl_WeekNumber.TextColor = g_WeekNumberPropert";
_xlbl_weeknumber.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=18022478;
 //BA.debugLineNum = 18022478;BA.debugLine="xlbl_WeekNumber.Font = g_WeekNumberProperties.x";
_xlbl_weeknumber.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=18022479;
 //BA.debugLineNum = 18022479;BA.debugLine="xlbl_WeekNumber.Text = GetWeekNumberStartingFro";
_xlbl_weeknumber.setText(BA.ObjectToCharSequence(__ref._getweeknumberstartingfrommonday /*int*/ (null,_currentday)));
 };
RDebugUtils.currentLine=18022482;
 //BA.debugLineNum = 18022482;BA.debugLine="CustomDrawDay(CurrentDay,xpnl_Date)";
__ref._customdrawday /*String*/ (null,_currentday,_xpnl_date);
 }
};
RDebugUtils.currentLine=18022486;
 //BA.debugLineNum = 18022486;BA.debugLine="If m_ShowGridLines Then";
if (__ref._m_showgridlines /*boolean*/ ) { 
RDebugUtils.currentLine=18022487;
 //BA.debugLineNum = 18022487;BA.debugLine="Dim xpnl_CanvasBackground As B4XView = xui.Creat";
_xpnl_canvasbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_canvasbackground = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18022488;
 //BA.debugLineNum = 18022488;BA.debugLine="Parent.AddView(xpnl_CanvasBackground,0,0,Parent.";
_parent.AddView((android.view.View)(_xpnl_canvasbackground.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=18022489;
 //BA.debugLineNum = 18022489;BA.debugLine="xpnl_CanvasBackground.Color = xui.Color_Transpar";
_xpnl_canvasbackground.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=18022497;
 //BA.debugLineNum = 18022497;BA.debugLine="Dim xcv As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=18022498;
 //BA.debugLineNum = 18022498;BA.debugLine="xcv.Initialize(xpnl_CanvasBackground)";
_xcv.Initialize(_xpnl_canvasbackground);
RDebugUtils.currentLine=18022499;
 //BA.debugLineNum = 18022499;BA.debugLine="xcv.ClearRect(xcv.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
RDebugUtils.currentLine=18022501;
 //BA.debugLineNum = 18022501;BA.debugLine="For i = 0 To 6 -1 'Add Divider Vertical";
{
final int step67 = 1;
final int limit67 = (int) (6-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=18022502;
 //BA.debugLineNum = 18022502;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumber";
_xcv.DrawLine((float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (0),(float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (_parent.getHeight()),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=18022504;
 //BA.debugLineNum = 18022504;BA.debugLine="If i < 5 Then xcv.DrawLine(0,g_WeekNameProperti";
if (_i<5) { 
_xcv.DrawLine((float) (0),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),(float) (_parent.getWidth()),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));};
 }
};
RDebugUtils.currentLine=18022507;
 //BA.debugLineNum = 18022507;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumberP";
_xcv.DrawLine((float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0))))),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,(float) (_parent.getWidth()),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=18022509;
 //BA.debugLineNum = 18022509;BA.debugLine="xcv.Invalidate";
_xcv.Invalidate();
 };
RDebugUtils.currentLine=18022512;
 //BA.debugLineNum = 18022512;BA.debugLine="End Sub";
return "";
}
public int[]  _getargb(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub AddWeekName(xpnl_Background As B4XView";
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="Dim BlockHeight As Float = g_WeekNameProperties.H";
_blockheight = __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ;
RDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="Dim BlockWidth As Float = Floor(IIf(m_ShowWeekNum";
_blockwidth = (float) (__c.Floor((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : (((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))))))));
RDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="Dim xlbl_WeekName As B4XView = CreateLabel(\"\")";
_xlbl_weekname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weekname = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="xlbl_WeekName.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_weekname.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=17629192;
 //BA.debugLineNum = 17629192;BA.debugLine="xlbl_WeekName.Text = Text";
_xlbl_weekname.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=17629193;
 //BA.debugLineNum = 17629193;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=17629194;
 //BA.debugLineNum = 17629194;BA.debugLine="xlbl_WeekName.Color = g_WeekNumberProperties.Col";
_xlbl_weekname.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="xlbl_WeekName.Font = g_WeekNumberProperties.xFon";
_xlbl_weekname.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=17629196;
 //BA.debugLineNum = 17629196;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNumberProperties";
_xlbl_weekname.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
 }else {
RDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="xlbl_WeekName.Color = g_WeekNameProperties.Color";
_xlbl_weekname.setColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=17629199;
 //BA.debugLineNum = 17629199;BA.debugLine="xlbl_WeekName.Font = g_WeekNameProperties.xFont";
_xlbl_weekname.setFont(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=17629200;
 //BA.debugLineNum = 17629200;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNameProperties.T";
_xlbl_weekname.setTextColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=17629203;
 //BA.debugLineNum = 17629203;BA.debugLine="xpnl_Background.AddView(xlbl_WeekName,IIf(i = -1,";
_xpnl_background.AddView((android.view.View)(_xlbl_weekname.getObject()),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(0)) : ((Object)((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_i)))))),(int) (0),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(_blockwidth))))),(int) (_blockheight));
RDebugUtils.currentLine=17629204;
 //BA.debugLineNum = 17629204;BA.debugLine="End Sub";
return "";
}
public long  _getfirstdayofweek2(b4a.example.ef.as_datepicker __ref,long _ticks,int _firstdayofweek) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getfirstdayofweek2", true))
	 {return ((Long) Debug.delegate(ba, "getfirstdayofweek2", new Object[] {_ticks,_firstdayofweek}));}
b4a.example.dateutils._period _p = null;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub GetFirstDayOfWeek2(Ticks As Long,FirstD";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="p.Days = -((DateTime.GetDayOfWeek(Ticks)+FirstDay";
_p.Days = (int) (-((__c.DateTime.GetDayOfWeek(_ticks)+_firstdayofweek)%7));
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Return DateUtils.AddPeriod(Ticks, p)";
if (true) return _dateutils._addperiod(ba,_ticks,_p);
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub CreateSelectDates(xpnl_Date As B4XView";
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="For Each View As B4XView In xpnl_Date.GetAllViews";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _xpnl_date.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="Dim CurrentDay As Long = xpnl_Date.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_date.getTag());
RDebugUtils.currentLine=18350088;
 //BA.debugLineNum = 18350088;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=18350090;
 //BA.debugLineNum = 18350090;BA.debugLine="CreateSelectedDate(xpnl_Date,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.True);
 }else 
{RDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Selecte";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=18350092;
 //BA.debugLineNum = 18350092;BA.debugLine="CreateSelectedDate(xpnl_Date,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.False);
 }}
;
RDebugUtils.currentLine=18350095;
 //BA.debugLineNum = 18350095;BA.debugLine="For Each v As B4XView In xpnl_Date.GetAllViewsRe";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = _xpnl_date.GetAllViewsRecursive();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group12.Get(index12)));
RDebugUtils.currentLine=18350096;
 //BA.debugLineNum = 18350096;BA.debugLine="If \"RangeItem\" = v.Tag Then";
if (("RangeItem").equals(BA.ObjectToString(_v.getTag()))) { 
RDebugUtils.currentLine=18350097;
 //BA.debugLineNum = 18350097;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=18350098;
 //BA.debugLineNum = 18350098;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=18350102;
 //BA.debugLineNum = 18350102;BA.debugLine="If m_SelectedDate > 0 And m_SelectedDate2 > 0 An";
if (__ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0 && ((_currentday>=__ref._m_selecteddate /*long*/  && _currentday<=__ref._m_selecteddate2 /*long*/ ) || (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )))) { 
RDebugUtils.currentLine=18350103;
 //BA.debugLineNum = 18350103;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18350104;
 //BA.debugLineNum = 18350104;BA.debugLine="xpnl_selected.Tag = \"RangeItem\"";
_xpnl_selected.setTag((Object)("RangeItem"));
RDebugUtils.currentLine=18350105;
 //BA.debugLineNum = 18350105;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDat";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ )) { 
RDebugUtils.currentLine=18350106;
 //BA.debugLineNum = 18350106;BA.debugLine="xpnl_Date.AddView(xpnl_selected,xpnl_Date.Widt";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_date.getWidth()/(double)2),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else 
{RDebugUtils.currentLine=18350107;
 //BA.debugLineNum = 18350107;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Select";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )) { 
RDebugUtils.currentLine=18350108;
 //BA.debugLineNum = 18350108;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else {
RDebugUtils.currentLine=18350110;
 //BA.debugLineNum = 18350110;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),_xpnl_date.getWidth(),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }}
;
RDebugUtils.currentLine=18350113;
 //BA.debugLineNum = 18350113;BA.debugLine="xpnl_selected.Color = xui.Color_ARGB(80,clr(1),";
_xpnl_selected.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),_clr[(int) (1)],_clr[(int) (2)],_clr[(int) (3)]));
RDebugUtils.currentLine=18350114;
 //BA.debugLineNum = 18350114;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 };
 }else {
RDebugUtils.currentLine=18350118;
 //BA.debugLineNum = 18350118;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=18350119;
 //BA.debugLineNum = 18350119;BA.debugLine="MonthDateClick(xpnl_Date,False)";
__ref._monthdateclick /*String*/ (null,_xpnl_date,__c.False);
 };
 };
RDebugUtils.currentLine=18350124;
 //BA.debugLineNum = 18350124;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate)";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || ((__ref._m_selectmode /*String*/ ).equals(__ref._getselectmode_range /*String*/ (null)) && _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ))) { 
RDebugUtils.currentLine=18350125;
 //BA.debugLineNum = 18350125;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedT";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
 }else {
RDebugUtils.currentLine=18350127;
 //BA.debugLineNum = 18350127;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=18350131;
 //BA.debugLineNum = 18350131;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Private Sub GetWeekNumberStartingFromMonday (ticks";
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="Dim WeekDayOfFirstDayOfYear As Int = DateTime.Get";
_weekdayoffirstdayofyear = (int) (__c.DateTime.GetDayOfWeek(_dateutils._setdate(ba,__c.DateTime.GetYear(_ticks),(int) (1),(int) (1)))-1);
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Dim FirstMondayInYear As Int = (7 + WeekDayOfFirs";
_firstmondayinyear = (int) ((7+_weekdayoffirstdayofyear-1)%7);
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="If WeekDayOfFirstDayOfYear <> 1 Then result = res";
if (_weekdayoffirstdayofyear!=1) { 
_result = (int) (_result-1);};
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="result = result + Floor((DateTime.GetDayOfYear(ti";
_result = (int) (_result+__c.Floor((__c.DateTime.GetDayOfYear(_ticks)-1+_firstmondayinyear)/(double)7)+1);
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="End Sub";
return 0;
}
public String  _customdrawday(b4a.example.ef.as_datepicker __ref,long _date,anywheresoftware.b4a.objects.B4XViewWrapper _backgroundpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawday", true))
	 {return ((String) Debug.delegate(ba, "customdrawday", new Object[] {_date,_backgroundpanel}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawday _m_customdrawday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub CustomDrawDay(Date As Long,BackgroundP";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(int) (2))) { 
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="Dim m_CustomDrawDay As ASDatePicker_CustomDrawDa";
_m_customdrawday = new b4a.example.ef.as_datepicker._asdatepicker_customdrawday();
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="m_CustomDrawDay.Initialize";
_m_customdrawday.Initialize();
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="m_CustomDrawDay.BackgroundPanel = BackgroundPane";
_m_customdrawday.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _backgroundpanel;
RDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="For Each View As B4XView In BackgroundPanel.GetA";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _backgroundpanel.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="If \"xlbl_Date\" = View.Tag Then";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="m_CustomDrawDay.xlbl_Date = View";
_m_customdrawday.xlbl_Date /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
 };
 }
};
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawDay";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(Object)(_date),(Object)(_m_customdrawday));
 };
RDebugUtils.currentLine=22020113;
 //BA.debugLineNum = 22020113;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub AddYear(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim BlockHeight As Float = xpnl_ViewPager.Height/";
_blockheight = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Dim BlockWidth As Float = xpnl_ViewPager.Width/3";
_blockwidth = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3);
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="For i = 1 To 13 -1";
{
final int step4 = 1;
final int limit4 = (int) (13-1);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="Dim Rest As Int = (i-1)/3";
_rest = (int) ((_i-1)/(double)3);
RDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="Dim test As Int = (i-1) Mod 3";
_test = (int) ((_i-1)%3);
RDebugUtils.currentLine=18087950;
 //BA.debugLineNum = 18087950;BA.debugLine="Dim Text As String = \"\"";
_text = "";
RDebugUtils.currentLine=18087951;
 //BA.debugLineNum = 18087951;BA.debugLine="Dim xpnl_Date As B4XView";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=18087952;
 //BA.debugLineNum = 18087952;BA.debugLine="Dim SelectThisPanel As Boolean = False";
_selectthispanel = __c.False;
RDebugUtils.currentLine=18087953;
 //BA.debugLineNum = 18087953;BA.debugLine="If m_CurrentView = getCurrentView_YearView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=18087954;
 //BA.debugLineNum = 18087954;BA.debugLine="Text = GetMonthNameByIndex(i)";
_text = __ref._getmonthnamebyindex /*String*/ (null,_i);
RDebugUtils.currentLine=18087955;
 //BA.debugLineNum = 18087955;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_YearMonth\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_YearMonth");
RDebugUtils.currentLine=18087956;
 //BA.debugLineNum = 18087956;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,__c.DateTime.GetYear(_currentdate),_i,(int) (1))));
RDebugUtils.currentLine=18087957;
 //BA.debugLineNum = 18087957;BA.debugLine="If DateTime.GetMonth(xpnl_Date.Tag) = DateTime.";
if (__c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetMonth(__c.DateTime.getNow()) && __c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=18087959;
 //BA.debugLineNum = 18087959;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_mindate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=18087960;
 //BA.debugLineNum = 18087960;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=18087963;
 //BA.debugLineNum = 18087963;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=18087964;
 //BA.debugLineNum = 18087964;BA.debugLine="Text = DateTime.GetYear(CurrentDate)+(i-1)";
_text = BA.NumberToString(__c.DateTime.GetYear(_currentdate)+(_i-1));
RDebugUtils.currentLine=18087965;
 //BA.debugLineNum = 18087965;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_DecadeYear\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_DecadeYear");
RDebugUtils.currentLine=18087966;
 //BA.debugLineNum = 18087966;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*1),(int) (1),(int) (1))));
RDebugUtils.currentLine=18087967;
 //BA.debugLineNum = 18087967;BA.debugLine="If DateTime.GetYear(xpnl_Date.Tag) = DateTime.G";
if (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=18087969;
 //BA.debugLineNum = 18087969;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And ((DateT";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && ((__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=18087970;
 //BA.debugLineNum = 18087970;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=18087973;
 //BA.debugLineNum = 18087973;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVi";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=18087974;
 //BA.debugLineNum = 18087974;BA.debugLine="Text = (DateTime.GetYear(CurrentDate)+(i-1)*10)";
_text = BA.NumberToString((__c.DateTime.GetYear(_currentdate)+(_i-1)*10))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9));
RDebugUtils.currentLine=18087975;
 //BA.debugLineNum = 18087975;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_CenturyDecade";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_CenturyDecade");
RDebugUtils.currentLine=18087976;
 //BA.debugLineNum = 18087976;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*10),(int) (1),(int) (1))));
RDebugUtils.currentLine=18087977;
 //BA.debugLineNum = 18087977;BA.debugLine="If DateTime.GetYear(DateTime.Now) >= (DateTime.";
if (__c.DateTime.GetYear(__c.DateTime.getNow())>=(__c.DateTime.GetYear(_currentdate)+(_i-1)*10) && __c.DateTime.GetYear(__c.DateTime.getNow())<=((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=18087984;
 //BA.debugLineNum = 18087984;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) || ((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=18087985;
 //BA.debugLineNum = 18087985;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }}}
;
RDebugUtils.currentLine=18087990;
 //BA.debugLineNum = 18087990;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=18087991;
 //BA.debugLineNum = 18087991;BA.debugLine="Parent.AddView(xpnl_Date,BlockWidth*test,BlockHe";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) (_blockwidth*_test),(int) (_blockheight*_rest),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=18087992;
 //BA.debugLineNum = 18087992;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=18087994;
 //BA.debugLineNum = 18087994;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=18087995;
 //BA.debugLineNum = 18087995;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=18087996;
 //BA.debugLineNum = 18087996;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=18087998;
 //BA.debugLineNum = 18087998;BA.debugLine="xlbl_Date.Text = Text";
_xlbl_date.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=18088000;
 //BA.debugLineNum = 18088000;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=18088002;
 //BA.debugLineNum = 18088002;BA.debugLine="If SelectThisPanel Then";
if (_selectthispanel) { 
RDebugUtils.currentLine=18088003;
 //BA.debugLineNum = 18088003;BA.debugLine="Dim xpnl_Current As B4XView = xui.CreatePanel(\"";
_xpnl_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_current = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=18088004;
 //BA.debugLineNum = 18088004;BA.debugLine="Dim StrokeWidth As Float = 2dip";
_strokewidth = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=18088005;
 //BA.debugLineNum = 18088005;BA.debugLine="xpnl_Date.AddView(xpnl_Current,StrokeWidth,Stro";
_xpnl_date.AddView((android.view.View)(_xpnl_current.getObject()),(int) (_strokewidth),(int) (_strokewidth),(int) (_blockwidth-_strokewidth*2),(int) (_blockheight-_strokewidth*2));
RDebugUtils.currentLine=18088007;
 //BA.debugLineNum = 18088007;BA.debugLine="xpnl_Current.SetColorAndBorder(xui.Color_Transp";
_xpnl_current.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (_strokewidth),__ref._m_currentdatecolor /*int*/ ,__c.DipToCurrent((int) (5)));
 };
 }
};
RDebugUtils.currentLine=18088011;
 //BA.debugLineNum = 18088011;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_yearview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_yearview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_yearview", null));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Public Sub getCurrentView_YearView As String";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Return \"YearView\"";
if (true) return "YearView";
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="End Sub";
return "";
}
public String  _getmonthnamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getmonthnamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Private Sub GetMonthNameByIndex(index As Int) As S";
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="If index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Return g_MonthNameShort.January";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .January /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="else If index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="Return g_MonthNameShort.February";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .February /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134213;
 //BA.debugLineNum = 23134213;BA.debugLine="else If index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=23134214;
 //BA.debugLineNum = 23134214;BA.debugLine="Return g_MonthNameShort.March";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .March /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="else If index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=23134216;
 //BA.debugLineNum = 23134216;BA.debugLine="Return g_MonthNameShort.April";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .April /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134217;
 //BA.debugLineNum = 23134217;BA.debugLine="else If index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="Return g_MonthNameShort.May";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .May /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134219;
 //BA.debugLineNum = 23134219;BA.debugLine="else If index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=23134220;
 //BA.debugLineNum = 23134220;BA.debugLine="Return g_MonthNameShort.June";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .June /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134221;
 //BA.debugLineNum = 23134221;BA.debugLine="else If index = 7 Then";
if (_index==7) { 
RDebugUtils.currentLine=23134222;
 //BA.debugLineNum = 23134222;BA.debugLine="Return g_MonthNameShort.July";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .July /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134223;
 //BA.debugLineNum = 23134223;BA.debugLine="else If index = 8 Then";
if (_index==8) { 
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="Return g_MonthNameShort.August";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .August /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134225;
 //BA.debugLineNum = 23134225;BA.debugLine="else If index = 9 Then";
if (_index==9) { 
RDebugUtils.currentLine=23134226;
 //BA.debugLineNum = 23134226;BA.debugLine="Return g_MonthNameShort.September";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .September /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134227;
 //BA.debugLineNum = 23134227;BA.debugLine="else If index = 10 Then";
if (_index==10) { 
RDebugUtils.currentLine=23134228;
 //BA.debugLineNum = 23134228;BA.debugLine="Return g_MonthNameShort.October";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .October /*String*/ ;
 }else 
{RDebugUtils.currentLine=23134229;
 //BA.debugLineNum = 23134229;BA.debugLine="else If index = 11 Then";
if (_index==11) { 
RDebugUtils.currentLine=23134230;
 //BA.debugLineNum = 23134230;BA.debugLine="Return g_MonthNameShort.November";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .November /*String*/ ;
 }else {
RDebugUtils.currentLine=23134232;
 //BA.debugLineNum = 23134232;BA.debugLine="Return g_MonthNameShort.December";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .December /*String*/ ;
 }}}}}}}}}}}
;
RDebugUtils.currentLine=23134234;
 //BA.debugLineNum = 23134234;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_decadeview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_decadeview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_decadeview", null));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Public Sub getCurrentView_DecadeView As String";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Return \"DecadeView\"";
if (true) return "DecadeView";
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_centuryview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_centuryview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_centuryview", null));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub getCurrentView_CenturyView As String";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Return \"CenturyView\"";
if (true) return "CenturyView";
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="xiv_RefreshImage.SetLayoutAnimated(0,0,0,Width,He";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="xpnl_Header.SetLayoutAnimated(0,0,0,Width,g_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=17498115;
 //BA.debugLineNum = 17498115;BA.debugLine="xpnl_ViewPager.SetLayoutAnimated(0,0,g_HeaderProp";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),(int) (_width),(int) (_height-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=17498116;
 //BA.debugLineNum = 17498116;BA.debugLine="xASVP_Main.Base_Resize(Width,xpnl_ViewPager.Heigh";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._base_resize /*void*/ (null,_width,__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17498119;
 //BA.debugLineNum = 17498119;BA.debugLine="xpnl_Header.GetView(0).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17498120;
 //BA.debugLineNum = 17498120;BA.debugLine="xpnl_Header.GetView(1).SetLayoutAnimated(0,0,0,xp";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17498121;
 //BA.debugLineNum = 17498121;BA.debugLine="xpnl_Header.GetView(2).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2)).SetLayoutAnimated((int) (0),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17498123;
 //BA.debugLineNum = 17498123;BA.debugLine="xASVP_Main.ResetLazyLoadingPanels";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingpanels /*String*/ (null);
RDebugUtils.currentLine=17498124;
 //BA.debugLineNum = 17498124;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "base_resize"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=17498125;
 //BA.debugLineNum = 17498125;BA.debugLine="xASVP_Main.ResetLazyloadingIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingindex /*String*/ (null);
RDebugUtils.currentLine=17498126;
 //BA.debugLineNum = 17498126;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=17498127;
 //BA.debugLineNum = 17498127;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,True)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.True);
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="m_CurrentView = NewView";
__ref._m_currentview /*String*/  = _newview;
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "changeview"),(int) (250));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="Select Case NewView";
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
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="CreateDecadeView";
__ref._createdecadeview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=18153485;
 //BA.debugLineNum = 18153485;BA.debugLine="CreateCenturyView";
__ref._createcenturyview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=18153487;
 //BA.debugLineNum = 18153487;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
RDebugUtils.currentLine=18153488;
 //BA.debugLineNum = 18153488;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub getCurrentView_MonthView As String";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Return \"MonthView\"";
if (true) return "MonthView";
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=17760259;
 //BA.debugLineNum = 17760259;BA.debugLine="Dim YearGap As Int = 1";
_yeargap = (int) (1);
RDebugUtils.currentLine=17760260;
 //BA.debugLineNum = 17760260;BA.debugLine="Dim StartDate As Long = DateUtils.SetDate(DateTim";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=17760261;
 //BA.debugLineNum = 17760261;BA.debugLine="Dim Enddate As Long = DateUtils.SetDate(DateTime.";
_enddate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=17760263;
 //BA.debugLineNum = 17760263;BA.debugLine="If m_MinDate > 0 Then StartDate = m_MinDate";
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
RDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="Dim NumberOfMonths As Int = IIf(m_MaxDate=0, Mont";
_numberofmonths = (int)(BA.ObjectToNumber(((__ref._m_maxdate /*long*/ ==0) ? ((Object)(__ref._monthbetween /*int*/ (null,_startdate,_enddate))) : ((Object)(0)))));
RDebugUtils.currentLine=17760266;
 //BA.debugLineNum = 17760266;BA.debugLine="If m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=17760267;
 //BA.debugLineNum = 17760267;BA.debugLine="Dim MonthsBetween As Int = MonthBetween(StartDat";
_monthsbetween = __ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ );
RDebugUtils.currentLine=17760268;
 //BA.debugLineNum = 17760268;BA.debugLine="Dim tmp As Period";
_tmp = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17760269;
 //BA.debugLineNum = 17760269;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
RDebugUtils.currentLine=17760270;
 //BA.debugLineNum = 17760270;BA.debugLine="tmp.Months = MonthsBetween";
_tmp.Months = _monthsbetween;
RDebugUtils.currentLine=17760271;
 //BA.debugLineNum = 17760271;BA.debugLine="If DateUtils.AddPeriod(StartDate,tmp) < m_MaxDat";
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
RDebugUtils.currentLine=17760272;
 //BA.debugLineNum = 17760272;BA.debugLine="NumberOfMonths = Max(MonthsBetween,1)";
_numberofmonths = (int) (parent.__c.Max(_monthsbetween,1));
 if (true) break;
;
RDebugUtils.currentLine=17760275;
 //BA.debugLineNum = 17760275;BA.debugLine="For i = 0 To NumberOfMonths -1";

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
RDebugUtils.currentLine=17760277;
 //BA.debugLineNum = 17760277;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17760278;
 //BA.debugLineNum = 17760278;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17760279;
 //BA.debugLineNum = 17760279;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17760281;
 //BA.debugLineNum = 17760281;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17760282;
 //BA.debugLineNum = 17760282;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=17760283;
 //BA.debugLineNum = 17760283;BA.debugLine="p2.Months = i";
_p2.Months = _i;
RDebugUtils.currentLine=17760285;
 //BA.debugLineNum = 17760285;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=17760286;
 //BA.debugLineNum = 17760286;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate(";
_firstdayofmonth = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(_currenttime),parent.__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=17760288;
 //BA.debugLineNum = 17760288;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfMon";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
RDebugUtils.currentLine=17760290;
 //BA.debugLineNum = 17760290;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=17760296;
 //BA.debugLineNum = 17760296;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=17760301;
 //BA.debugLineNum = 17760301;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=17760302;
 //BA.debugLineNum = 17760302;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=17760304;
 //BA.debugLineNum = 17760304;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=17760305;
 //BA.debugLineNum = 17760305;BA.debugLine="m_isReady = True";
__ref._m_isready /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=17760388;
 //BA.debugLineNum = 17760388;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Dim YearGap As Int = 10";
_yeargap = (int) (10);
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="StartDate =	DateUtils.SetDate(DateTime.GetYear(m";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),(int) (1),(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=17825803;
 //BA.debugLineNum = 17825803;BA.debugLine="Dim FirstDateOfFuture As Long = DateUtils.SetDate";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
RDebugUtils.currentLine=17825805;
 //BA.debugLineNum = 17825805;BA.debugLine="Dim NumberOfYears As Int";
_numberofyears = 0;
RDebugUtils.currentLine=17825807;
 //BA.debugLineNum = 17825807;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=17825808;
 //BA.debugLineNum = 17825808;BA.debugLine="NumberOfYears = MonthBetween(StartDate,FirstDate";
_numberofyears = (int) (__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=17825810;
 //BA.debugLineNum = 17825810;BA.debugLine="Dim YearsBetween As Int = Ceil(MonthBetween(Star";
_yearsbetween = (int) (parent.__c.Ceil(__ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ )/(double)12));
RDebugUtils.currentLine=17825811;
 //BA.debugLineNum = 17825811;BA.debugLine="NumberOfYears = Max(YearsBetween,1)";
_numberofyears = (int) (parent.__c.Max(_yearsbetween,1));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=17825814;
 //BA.debugLineNum = 17825814;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=17825820;
 //BA.debugLineNum = 17825820;BA.debugLine="For i = 0 To NumberOfYears -1";
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
RDebugUtils.currentLine=17825822;
 //BA.debugLineNum = 17825822;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17825823;
 //BA.debugLineNum = 17825823;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17825824;
 //BA.debugLineNum = 17825824;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17825826;
 //BA.debugLineNum = 17825826;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17825827;
 //BA.debugLineNum = 17825827;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=17825828;
 //BA.debugLineNum = 17825828;BA.debugLine="p2.Years = i";
_p2.Years = _i;
RDebugUtils.currentLine=17825830;
 //BA.debugLineNum = 17825830;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=17825833;
 //BA.debugLineNum = 17825833;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=17825835;
 //BA.debugLineNum = 17825835;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=17825841;
 //BA.debugLineNum = 17825841;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createyearview"),(int) (0));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=17825851;
 //BA.debugLineNum = 17825851;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=17825852;
 //BA.debugLineNum = 17825852;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=17825854;
 //BA.debugLineNum = 17825854;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Dim CurrentDecade As Long = DateUtils.SetDate(Dat";
_currentdecade = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ ),(int) (1),(int) (1))),(int) (1),(int) (1));
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="Dim YearGap As Int = 50";
_yeargap = (int) (50);
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="StartDate =	DateUtils.SetDate(1400,12,31)";
_startdate = parent._dateutils._setdate(ba,(int) (1400),(int) (12),(int) (31));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17891342;
 //BA.debugLineNum = 17891342;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=17891345;
 //BA.debugLineNum = 17891345;BA.debugLine="Dim FirstDateOfFuture As Long";
_firstdateoffuture = 0L;
RDebugUtils.currentLine=17891346;
 //BA.debugLineNum = 17891346;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=17891347;
 //BA.debugLineNum = 17891347;BA.debugLine="FirstDateOfFuture = DateUtils.SetDate(DateTime.G";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=17891349;
 //BA.debugLineNum = 17891349;BA.debugLine="FirstDateOfFuture = m_MaxDate";
_firstdateoffuture = __ref._m_maxdate /*long*/ ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=17891353;
 //BA.debugLineNum = 17891353;BA.debugLine="Dim NumberOfDecades As Int = Ceil(Max((MonthBetwe";
_numberofdecades = (int) (parent.__c.Ceil(parent.__c.Max((__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12)/(double)10,1)));
RDebugUtils.currentLine=17891355;
 //BA.debugLineNum = 17891355;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=17891361;
 //BA.debugLineNum = 17891361;BA.debugLine="For i = 0 To NumberOfDecades -1";
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
RDebugUtils.currentLine=17891363;
 //BA.debugLineNum = 17891363;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17891364;
 //BA.debugLineNum = 17891364;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17891365;
 //BA.debugLineNum = 17891365;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17891367;
 //BA.debugLineNum = 17891367;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17891368;
 //BA.debugLineNum = 17891368;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=17891369;
 //BA.debugLineNum = 17891369;BA.debugLine="p2.Years = i*10";
_p2.Years = (int) (_i*10);
RDebugUtils.currentLine=17891371;
 //BA.debugLineNum = 17891371;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=17891374;
 //BA.debugLineNum = 17891374;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=17891376;
 //BA.debugLineNum = 17891376;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=17891378;
 //BA.debugLineNum = 17891378;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=17891382;
 //BA.debugLineNum = 17891382;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createdecadeview"),(int) (0));
this.state = 31;
return;
case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=17891383;
 //BA.debugLineNum = 17891383;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=17891384;
 //BA.debugLineNum = 17891384;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=17891386;
 //BA.debugLineNum = 17891386;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Dim CurrentCenturyStart As Long = DateUtils.SetDa";
_currentcenturystart = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-parent.__c.Round(((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100)-((int) ((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100))))*100)),(int) (1),(int) (1));
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="Dim FirstDateOfPast As Long = DateUtils.SetDate(1";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (1),(int) (1),(int) (1));
RDebugUtils.currentLine=17956875;
 //BA.debugLineNum = 17956875;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=17956876;
 //BA.debugLineNum = 17956876;BA.debugLine="If m_MinDate > 0 Then";
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
RDebugUtils.currentLine=17956877;
 //BA.debugLineNum = 17956877;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_mindate /*long*/ )-40),(int) (1),(int) (1));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=17956879;
 //BA.debugLineNum = 17956879;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
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
RDebugUtils.currentLine=17956896;
 //BA.debugLineNum = 17956896;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=17956902;
 //BA.debugLineNum = 17956902;BA.debugLine="Dim NumberOfCentries As Int = 80";
_numberofcentries = (int) (80);
RDebugUtils.currentLine=17956903;
 //BA.debugLineNum = 17956903;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then NumberOfCe";
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
RDebugUtils.currentLine=17956905;
 //BA.debugLineNum = 17956905;BA.debugLine="For i = 0 To NumberOfCentries -1";
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
RDebugUtils.currentLine=17956907;
 //BA.debugLineNum = 17956907;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17956908;
 //BA.debugLineNum = 17956908;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17956909;
 //BA.debugLineNum = 17956909;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17956911;
 //BA.debugLineNum = 17956911;BA.debugLine="p.Years = i*10*12";
_p.Years = (int) (_i*10*12);
RDebugUtils.currentLine=17956912;
 //BA.debugLineNum = 17956912;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(Fi";
_currenttime = parent._dateutils._addperiod(ba,_firstdateofpast,_p);
RDebugUtils.currentLine=17956913;
 //BA.debugLineNum = 17956913;BA.debugLine="If i > 0 Then";
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
RDebugUtils.currentLine=17956914;
 //BA.debugLineNum = 17956914;BA.debugLine="CurrentTime = DateUtils.SetDate((DateTime.GetYe";
_currenttime = parent._dateutils._setdate(ba,(int) ((parent.__c.DateTime.GetYear(_currenttime)-parent.__c.Round(((parent.__c.DateTime.GetYear(_currenttime)/(double)100)-((int) ((parent.__c.DateTime.GetYear(_currenttime)/(double)100))))*100))+1),(int) (1),(int) (1));
RDebugUtils.currentLine=17956915;
 //BA.debugLineNum = 17956915;BA.debugLine="If DateTime.GetMonth(CurrentTime) = 1 Then";
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
RDebugUtils.currentLine=17956916;
 //BA.debugLineNum = 17956916;BA.debugLine="CurrentTime = DateUtils.SetDate(DateTime.GetYe";
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
RDebugUtils.currentLine=17956921;
 //BA.debugLineNum = 17956921;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=17956923;
 //BA.debugLineNum = 17956923;BA.debugLine="If DateTime.GetYear(CurrentCenturyStart) = DateT";
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
RDebugUtils.currentLine=17956929;
 //BA.debugLineNum = 17956929;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createcenturyview"),(int) (0));
this.state = 37;
return;
case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=17956930;
 //BA.debugLineNum = 17956930;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=17956931;
 //BA.debugLineNum = 17956931;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=17956933;
 //BA.debugLineNum = 17956933;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="Type ASDatePicker_MonthNameShort(January As Strin";
;
RDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Type ASDatePicker_WeekNameShort(Monday As String,";
;
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="Type ASDatePicker_HeaderProperties(Height As Floa";
;
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="Type ASDatePicker_BodyProperties(xFont As B4XFont";
;
RDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="Type ASDatePicker_CustomDrawDay(BackgroundPanel A";
;
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="Type ASDatePicker_CustomDrawHeader(BackgroundPane";
;
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="Type ASDatePicker_WeekNumberProperties(Width As F";
;
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="Type ASDatePicker_WeekNameProperties(Color As Int";
;
RDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=16973840;
 //BA.debugLineNum = 16973840;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=16973842;
 //BA.debugLineNum = 16973842;BA.debugLine="Private m_isReady As Boolean = False";
_m_isready = __c.False;
RDebugUtils.currentLine=16973844;
 //BA.debugLineNum = 16973844;BA.debugLine="Private g_HeaderProperties As ASDatePicker_Header";
_g_headerproperties = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=16973845;
 //BA.debugLineNum = 16973845;BA.debugLine="Private g_BodyProperties As ASDatePicker_BodyProp";
_g_bodyproperties = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="Private g_MonthNameShort As ASDatePicker_MonthNam";
_g_monthnameshort = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="Private g_WeekNameShort As ASDatePicker_WeekNameS";
_g_weeknameshort = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=16973849;
 //BA.debugLineNum = 16973849;BA.debugLine="Private g_WeekNumberProperties As ASDatePicker_We";
_g_weeknumberproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=16973850;
 //BA.debugLineNum = 16973850;BA.debugLine="Private g_WeekNameProperties As ASDatePicker_Week";
_g_weeknameproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=16973852;
 //BA.debugLineNum = 16973852;BA.debugLine="Private xASVP_Main As ASViewPager";
_xasvp_main = new b4a.example.ef.asviewpager();
RDebugUtils.currentLine=16973854;
 //BA.debugLineNum = 16973854;BA.debugLine="Private xpnl_LoadingPanel As B4XView";
_xpnl_loadingpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973855;
 //BA.debugLineNum = 16973855;BA.debugLine="Private xpnl_Header As B4XView";
_xpnl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973856;
 //BA.debugLineNum = 16973856;BA.debugLine="Private xpnl_ViewPager As B4XView";
_xpnl_viewpager = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973857;
 //BA.debugLineNum = 16973857;BA.debugLine="Private xpnl_SelectedDate As B4XView";
_xpnl_selecteddate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973858;
 //BA.debugLineNum = 16973858;BA.debugLine="Private xpnl_SelectedDate2 As B4XView";
_xpnl_selecteddate2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973863;
 //BA.debugLineNum = 16973863;BA.debugLine="Private m_HeaderColor As Int";
_m_headercolor = 0;
RDebugUtils.currentLine=16973864;
 //BA.debugLineNum = 16973864;BA.debugLine="Private m_BodyColor As Int";
_m_bodycolor = 0;
RDebugUtils.currentLine=16973865;
 //BA.debugLineNum = 16973865;BA.debugLine="Private m_CurrentDateColor As Int";
_m_currentdatecolor = 0;
RDebugUtils.currentLine=16973866;
 //BA.debugLineNum = 16973866;BA.debugLine="Private m_SelectedDateColor As Int";
_m_selecteddatecolor = 0;
RDebugUtils.currentLine=16973867;
 //BA.debugLineNum = 16973867;BA.debugLine="Private m_MouseHoverFeedback As Boolean 'Ignore";
_m_mousehoverfeedback = false;
RDebugUtils.currentLine=16973868;
 //BA.debugLineNum = 16973868;BA.debugLine="Private m_SelectedDate As Long";
_m_selecteddate = 0L;
RDebugUtils.currentLine=16973869;
 //BA.debugLineNum = 16973869;BA.debugLine="Private m_SelectedDate2 As Long";
_m_selecteddate2 = 0L;
RDebugUtils.currentLine=16973870;
 //BA.debugLineNum = 16973870;BA.debugLine="Private m_ShowWeekNumbers As Boolean";
_m_showweeknumbers = false;
RDebugUtils.currentLine=16973871;
 //BA.debugLineNum = 16973871;BA.debugLine="Private m_FirstDayOfWeek As Int = 5 'Monday";
_m_firstdayofweek = (int) (5);
RDebugUtils.currentLine=16973872;
 //BA.debugLineNum = 16973872;BA.debugLine="Private m_ShowGridLines As Boolean";
_m_showgridlines = false;
RDebugUtils.currentLine=16973873;
 //BA.debugLineNum = 16973873;BA.debugLine="Private m_GridLineColor As Int";
_m_gridlinecolor = 0;
RDebugUtils.currentLine=16973874;
 //BA.debugLineNum = 16973874;BA.debugLine="Private m_ThemeChangeTransition As String";
_m_themechangetransition = "";
RDebugUtils.currentLine=16973876;
 //BA.debugLineNum = 16973876;BA.debugLine="Private m_CurrentView As String";
_m_currentview = "";
RDebugUtils.currentLine=16973877;
 //BA.debugLineNum = 16973877;BA.debugLine="Private m_StartDate As Long";
_m_startdate = 0L;
RDebugUtils.currentLine=16973878;
 //BA.debugLineNum = 16973878;BA.debugLine="Private m_InactiveDaysVisible As Boolean";
_m_inactivedaysvisible = false;
RDebugUtils.currentLine=16973879;
 //BA.debugLineNum = 16973879;BA.debugLine="Private m_MinDate,m_MaxDate As Long";
_m_mindate = 0L;
_m_maxdate = 0L;
RDebugUtils.currentLine=16973880;
 //BA.debugLineNum = 16973880;BA.debugLine="Private m_SelectMode As String";
_m_selectmode = "";
RDebugUtils.currentLine=16973882;
 //BA.debugLineNum = 16973882;BA.debugLine="Private xiv_RefreshImage As B4XView";
_xiv_refreshimage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=16973884;
 //BA.debugLineNum = 16973884;BA.debugLine="Type AS_DatePicker_Theme(SelectedTextColor As Int";
;
RDebugUtils.currentLine=16973886;
 //BA.debugLineNum = 16973886;BA.debugLine="End Sub";
return "";
}
public String  _clearselections(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "clearselections", true))
	 {return ((String) Debug.delegate(ba, "clearselections", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub ClearSelections";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _createasdatepicker_bodyproperties(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,int _selectedtextcolor,float _currentandselecteddayheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_bodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "createasdatepicker_bodyproperties", new Object[] {_xfont,_textcolor,_selectedtextcolor,_currentandselecteddayheight}));}
b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _t1 = null;
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Public Sub CreateASDatePicker_BodyProperties (xFon";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="Dim t1 As ASDatePicker_BodyProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
_t1.SelectedTextColor /*int*/  = _selectedtextcolor;
RDebugUtils.currentLine=23789574;
 //BA.debugLineNum = 23789574;BA.debugLine="t1.CurrentAndSelectedDayHeight = CurrentAndSelect";
_t1.CurrentAndSelectedDayHeight /*float*/  = _currentandselecteddayheight;
RDebugUtils.currentLine=23789575;
 //BA.debugLineNum = 23789575;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=23789576;
 //BA.debugLineNum = 23789576;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _createasdatepicker_headerproperties(b4a.example.ef.as_datepicker __ref,float _height,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _buttoniconsize,boolean _arrowsvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_headerproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "createasdatepicker_headerproperties", new Object[] {_height,_xfont,_textcolor,_buttoniconsize,_arrowsvisible}));}
b4a.example.ef.as_datepicker._asdatepicker_headerproperties _t1 = null;
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub CreateASDatePicker_HeaderProperties (He";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Dim t1 As ASDatePicker_HeaderProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="t1.ButtonIconSize = ButtonIconSize";
_t1.ButtonIconSize /*float*/  = _buttoniconsize;
RDebugUtils.currentLine=23658503;
 //BA.debugLineNum = 23658503;BA.debugLine="t1.ArrowsVisible = ArrowsVisible";
_t1.ArrowsVisible /*boolean*/  = _arrowsvisible;
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _createasdatepicker_monthnameshort(b4a.example.ef.as_datepicker __ref,String _january,String _february,String _march,String _april,String _may,String _june,String _july,String _august,String _september,String _october,String _november,String _december) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_monthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "createasdatepicker_monthnameshort", new Object[] {_january,_february,_march,_april,_may,_june,_july,_august,_september,_october,_november,_december}));}
b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _t1 = null;
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub CreateASDatePicker_MonthNameShort (Janu";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Dim t1 As ASDatePicker_MonthNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="t1.January = January";
_t1.January /*String*/  = _january;
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="t1.February = February";
_t1.February /*String*/  = _february;
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="t1.March = March";
_t1.March /*String*/  = _march;
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="t1.April = April";
_t1.April /*String*/  = _april;
RDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="t1.May = May";
_t1.May /*String*/  = _may;
RDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="t1.June = June";
_t1.June /*String*/  = _june;
RDebugUtils.currentLine=23461897;
 //BA.debugLineNum = 23461897;BA.debugLine="t1.July = July";
_t1.July /*String*/  = _july;
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="t1.August = August";
_t1.August /*String*/  = _august;
RDebugUtils.currentLine=23461899;
 //BA.debugLineNum = 23461899;BA.debugLine="t1.September = September";
_t1.September /*String*/  = _september;
RDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="t1.October = October";
_t1.October /*String*/  = _october;
RDebugUtils.currentLine=23461901;
 //BA.debugLineNum = 23461901;BA.debugLine="t1.November = November";
_t1.November /*String*/  = _november;
RDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="t1.December = December";
_t1.December /*String*/  = _december;
RDebugUtils.currentLine=23461903;
 //BA.debugLineNum = 23461903;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=23461904;
 //BA.debugLineNum = 23461904;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _createasdatepicker_weeknameproperties(b4a.example.ef.as_datepicker __ref,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "createasdatepicker_weeknameproperties", new Object[] {_color,_xfont,_textcolor,_height}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _t1 = null;
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub CreateASDatePicker_WeekNameProperties (";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Dim t1 As ASDatePicker_WeekNameProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=23724038;
 //BA.debugLineNum = 23724038;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=23724039;
 //BA.debugLineNum = 23724039;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=23724040;
 //BA.debugLineNum = 23724040;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _createasdatepicker_weeknameshort(b4a.example.ef.as_datepicker __ref,String _monday,String _tuesday,String _wednesday,String _thursday,String _friday,String _saturday,String _sunday) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "createasdatepicker_weeknameshort", new Object[] {_monday,_tuesday,_wednesday,_thursday,_friday,_saturday,_sunday}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _t1 = null;
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub CreateASDatePicker_WeekNameShort (Monda";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Dim t1 As ASDatePicker_WeekNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="t1.Monday = Monday";
_t1.Monday /*String*/  = _monday;
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="t1.Tuesday = Tuesday";
_t1.Tuesday /*String*/  = _tuesday;
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="t1.Wednesday = Wednesday";
_t1.Wednesday /*String*/  = _wednesday;
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="t1.Thursday = Thursday";
_t1.Thursday /*String*/  = _thursday;
RDebugUtils.currentLine=23527431;
 //BA.debugLineNum = 23527431;BA.debugLine="t1.Friday = Friday";
_t1.Friday /*String*/  = _friday;
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="t1.Saturday = Saturday";
_t1.Saturday /*String*/  = _saturday;
RDebugUtils.currentLine=23527433;
 //BA.debugLineNum = 23527433;BA.debugLine="t1.Sunday = Sunday";
_t1.Sunday /*String*/  = _sunday;
RDebugUtils.currentLine=23527434;
 //BA.debugLineNum = 23527434;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=23527435;
 //BA.debugLineNum = 23527435;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _createasdatepicker_weeknumberproperties(b4a.example.ef.as_datepicker __ref,float _width,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "createasdatepicker_weeknumberproperties", new Object[] {_width,_color,_xfont,_textcolor,_text}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _t1 = null;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub CreateASDatePicker_WeekNumberProperties";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Dim t1 As ASDatePicker_WeekNumberProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
RDebugUtils.currentLine=23592968;
 //BA.debugLineNum = 23592968;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=23592969;
 //BA.debugLineNum = 23592969;BA.debugLine="End Sub";
return null;
}
public int  _monthbetween(b4a.example.ef.as_datepicker __ref,long _date1,long _date2) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "monthbetween", true))
	 {return ((Integer) Debug.delegate(ba, "monthbetween", new Object[] {_date1,_date2}));}
long _y = 0L;
long _m = 0L;
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Private Sub MonthBetween(Date1 As Long, Date2 As L";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="Dim y As Long = DateTime.GetYear(Date2) - DateTim";
_y = (long) (__c.DateTime.GetYear(_date2)-__c.DateTime.GetYear(_date1));
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim m As Long = y * 12";
_m = (long) (_y*12);
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="m = m - DateTime.GetMonth(Date1)";
_m = (long) (_m-__c.DateTime.GetMonth(_date1));
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="m = m + DateTime.GetMonth(Date2)";
_m = (long) (_m+__c.DateTime.GetMonth(_date2));
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="Return m";
if (true) return (int) (_m);
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Private Sub CreateHeader";
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="Dim xlbl_Header As B4XView = CreateLabel(\"xlbl_He";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_Header");
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="xpnl_Header.AddView(xlbl_Header,xpnl_Header.Heigh";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_header.getObject()),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = CreateLabel(\"xlbl";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowLeft");
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowLeft,0,0,xpnl_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowleft.getObject()),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="Dim xlbl_ArrowRight As B4XView = CreateLabel(\"xlb";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowRight");
RDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowRight,xpnl_Header.W";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowright.getObject()),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="xlbl_ArrowLeft.Text = Chr(0xE314)";
_xlbl_arrowleft.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe314))));
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="xlbl_ArrowLeft.SetTextAlignment(\"CENTER\",\"CENTER\"";
_xlbl_arrowleft.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=17563667;
 //BA.debugLineNum = 17563667;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=17563668;
 //BA.debugLineNum = 17563668;BA.debugLine="xlbl_ArrowRight.Text = Chr(0xE315)";
_xlbl_arrowright.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe315))));
RDebugUtils.currentLine=17563669;
 //BA.debugLineNum = 17563669;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=17563670;
 //BA.debugLineNum = 17563670;BA.debugLine="xlbl_ArrowRight.SetTextAlignment(\"CENTER\",\"CENTER";
_xlbl_arrowright.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=17563673;
 //BA.debugLineNum = 17563673;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=17563674;
 //BA.debugLineNum = 17563674;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(m_Start";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,__ref._m_startdate /*long*/ )+" "+BA.NumberToString(__c.DateTime.GetYear(__ref._m_startdate /*long*/ ))));
RDebugUtils.currentLine=17563675;
 //BA.debugLineNum = 17563675;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="xlbl_Header.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_header.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=17563678;
 //BA.debugLineNum = 17563678;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="iv.Initialize(EventName)";
_iv.Initialize(ba,_eventname);
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="End Sub";
return null;
}
public String  _createselecteddate(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _firstdatepanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createselecteddate", true))
	 {return ((String) Debug.delegate(ba, "createselecteddate", new Object[] {_xpnl_monthdate,_firstdatepanel}));}
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Private Sub CreateSelectedDate(xpnl_MonthDate As B";
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="If FirstDatePanel Then";
if (_firstdatepanel) { 
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedDa";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate.P";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=22872069;
 //BA.debugLineNum = 22872069;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=22872071;
 //BA.debugLineNum = 22872071;BA.debugLine="xpnl_SelectedDate.RemoveViewFromParent";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=22872073;
 //BA.debugLineNum = 22872073;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=22872074;
 //BA.debugLineNum = 22872074;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=22872075;
 //BA.debugLineNum = 22872075;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=22872076;
 //BA.debugLineNum = 22872076;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
RDebugUtils.currentLine=22872078;
 //BA.debugLineNum = 22872078;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 }else {
RDebugUtils.currentLine=22872080;
 //BA.debugLineNum = 22872080;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=22872081;
 //BA.debugLineNum = 22872081;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate2.";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group16.Get(index16)));
RDebugUtils.currentLine=22872082;
 //BA.debugLineNum = 22872082;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=22872084;
 //BA.debugLineNum = 22872084;BA.debugLine="xpnl_SelectedDate2.RemoveViewFromParent";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=22872086;
 //BA.debugLineNum = 22872086;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=22872087;
 //BA.debugLineNum = 22872087;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=22872088;
 //BA.debugLineNum = 22872088;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=22872089;
 //BA.debugLineNum = 22872089;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=22872090;
 //BA.debugLineNum = 22872090;BA.debugLine="xpnl_SelectedDate2 = xpnl_selected";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
RDebugUtils.currentLine=22872093;
 //BA.debugLineNum = 22872093;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Private Sub MonthDateClick(xpnl_MonthDate As B4XVi";
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="Dim CurrentDay As Long = xpnl_MonthDate.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime.";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
if (true) return "";};
RDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=22806534;
 //BA.debugLineNum = 22806534;BA.debugLine="For Each View As B4XView In xpnl_MonthDate.GetAll";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _xpnl_monthdate.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=22806535;
 //BA.debugLineNum = 22806535;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=22806538;
 //BA.debugLineNum = 22806538;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22806540;
 //BA.debugLineNum = 22806540;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=22806541;
 //BA.debugLineNum = 22806541;BA.debugLine="If m_SelectedDate = 0 Or xpnl_MonthDate.Tag <= m";
if (__ref._m_selecteddate /*long*/ ==0 || (double)(BA.ObjectToNumber(_xpnl_monthdate.getTag()))<=__ref._m_selecteddate /*long*/ ) { 
RDebugUtils.currentLine=22806542;
 //BA.debugLineNum = 22806542;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate,xpnl_Mont";
if (_dateutils._issameday(ba,__ref._m_selecteddate /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=22806543;
 //BA.debugLineNum = 22806543;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=22806544;
 //BA.debugLineNum = 22806544;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
RDebugUtils.currentLine=22806545;
 //BA.debugLineNum = 22806545;BA.debugLine="If m_SelectedDate > m_SelectedDate2 Then";
if (__ref._m_selecteddate /*long*/ >__ref._m_selecteddate2 /*long*/ ) { 
RDebugUtils.currentLine=22806546;
 //BA.debugLineNum = 22806546;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Select";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=22806547;
 //BA.debugLineNum = 22806547;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=22806550;
 //BA.debugLineNum = 22806550;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_Selected";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=22806551;
 //BA.debugLineNum = 22806551;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=22806554;
 //BA.debugLineNum = 22806554;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate2,xpnl_Mon";
if (_dateutils._issameday(ba,__ref._m_selecteddate2 /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=22806555;
 //BA.debugLineNum = 22806555;BA.debugLine="m_SelectedDate2 = xpnl_MonthDate.Tag";
__ref._m_selecteddate2 /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=22806556;
 //BA.debugLineNum = 22806556;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.False);
 }else {
RDebugUtils.currentLine=22806558;
 //BA.debugLineNum = 22806558;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Selecte";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=22806559;
 //BA.debugLineNum = 22806559;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 };
RDebugUtils.currentLine=22806562;
 //BA.debugLineNum = 22806562;BA.debugLine="RefreshSelectedDate";
__ref._refreshselecteddate /*String*/ (null);
 }else {
RDebugUtils.currentLine=22806564;
 //BA.debugLineNum = 22806564;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
 };
RDebugUtils.currentLine=22806567;
 //BA.debugLineNum = 22806567;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedTe";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
RDebugUtils.currentLine=22806569;
 //BA.debugLineNum = 22806569;BA.debugLine="If WithEvent = True Then";
if (_withevent==__c.True) { 
RDebugUtils.currentLine=22806570;
 //BA.debugLineNum = 22806570;BA.debugLine="If m_SelectMode = \"Range\" And m_SelectedDate > 0";
if ((__ref._m_selectmode /*String*/ ).equals("Range") && __ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0) { 
RDebugUtils.currentLine=22806571;
 //BA.debugLineNum = 22806571;BA.debugLine="SelectedDateRangeChanged";
__ref._selecteddaterangechanged /*String*/ (null);
 }else {
RDebugUtils.currentLine=22806573;
 //BA.debugLineNum = 22806573;BA.debugLine="SelectedDateChanged(xpnl_MonthDate.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()));
 };
 };
RDebugUtils.currentLine=22806576;
 //BA.debugLineNum = 22806576;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_range(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_range", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_range", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub getSelectMode_Range As String";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Return \"Range\"";
if (true) return "Range";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="End Sub";
return "";
}
public String  _customdrawheader(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawheader", true))
	 {return ((String) Debug.delegate(ba, "customdrawheader", new Object[] {_date}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawheader _m_customdrawheader = null;
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Private Sub CustomDrawHeader(date As Long)";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(int) (2))) { 
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="Dim m_CustomDrawHeader As ASDatePicker_CustomDra";
_m_customdrawheader = new b4a.example.ef.as_datepicker._asdatepicker_customdrawheader();
RDebugUtils.currentLine=21823492;
 //BA.debugLineNum = 21823492;BA.debugLine="m_CustomDrawHeader.Initialize";
_m_customdrawheader.Initialize();
RDebugUtils.currentLine=21823493;
 //BA.debugLineNum = 21823493;BA.debugLine="m_CustomDrawHeader.BackgroundPanel = xpnl_Header";
_m_customdrawheader.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="m_CustomDrawHeader.xlbl_Text = xpnl_Header.GetVi";
_m_customdrawheader.xlbl_Text /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowLeft = xpnl_Header.";
_m_customdrawheader.xlbl_ArrowLeft /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=21823496;
 //BA.debugLineNum = 21823496;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowRight = xpnl_Header";
_m_customdrawheader.xlbl_ArrowRight /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=21823498;
 //BA.debugLineNum = 21823498;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawHea";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(Object)(_date),(Object)(_m_customdrawheader));
 };
RDebugUtils.currentLine=21823500;
 //BA.debugLineNum = 21823500;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.as_datepicker __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="IniProps(Props)";
__ref._iniprops /*String*/ (null,_props);
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="m_StartDate = DateTime.Now";
__ref._m_startdate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="xpnl_LoadingPanel = xui.CreatePanel(\"\")";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="xpnl_LoadingPanel.Visible = True";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="mBase.AddView(xpnl_LoadingPanel,0,0,mBase.Width,m";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="mBase.AddView(xpnl_Header,0,0,mBase.Width,g_Heade";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=17301520;
 //BA.debugLineNum = 17301520;BA.debugLine="xpnl_ViewPager = xui.CreatePanel(\"\")";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17301521;
 //BA.debugLineNum = 17301521;BA.debugLine="mBase.AddView(xpnl_ViewPager,0,g_HeaderProperties";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=17301523;
 //BA.debugLineNum = 17301523;BA.debugLine="ini_viewpager";
__ref._ini_viewpager /*String*/ (null);
RDebugUtils.currentLine=17301524;
 //BA.debugLineNum = 17301524;BA.debugLine="CreateHeader";
__ref._createheader /*String*/ (null);
RDebugUtils.currentLine=17301525;
 //BA.debugLineNum = 17301525;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=17301526;
 //BA.debugLineNum = 17301526;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=17301527;
 //BA.debugLineNum = 17301527;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 }else 
{RDebugUtils.currentLine=17301528;
 //BA.debugLineNum = 17301528;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=17301529;
 //BA.debugLineNum = 17301529;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=17301530;
 //BA.debugLineNum = 17301530;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 }}
;
RDebugUtils.currentLine=17301533;
 //BA.debugLineNum = 17301533;BA.debugLine="xiv_RefreshImage = CreateImageView(\"\")";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=17301534;
 //BA.debugLineNum = 17301534;BA.debugLine="xiv_RefreshImage.Visible = False";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=17301535;
 //BA.debugLineNum = 17301535;BA.debugLine="mBase.AddView(xiv_RefreshImage,0,0,mBase.Width,mB";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17301538;
 //BA.debugLineNum = 17301538;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17301541;
 //BA.debugLineNum = 17301541;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),__c.False);
RDebugUtils.currentLine=17301543;
 //BA.debugLineNum = 17301543;BA.debugLine="End Sub";
return "";
}
public String  _iniprops(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "iniprops", true))
	 {return ((String) Debug.delegate(ba, "iniprops", new Object[] {_props}));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Private Sub IniProps(Props As Map)";
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="m_HeaderColor = xui.PaintOrColorToColor(Props.Get";
__ref._m_headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="m_BodyColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._m_bodycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BodyColor")));
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="m_CurrentDateColor = xui.PaintOrColorToColor(Prop";
__ref._m_currentdatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CurrentDateColor")));
RDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="m_SelectedDateColor = xui.PaintOrColorToColor(Pro";
__ref._m_selecteddatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectedDateColor")));
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="m_InactiveDaysVisible = Props.GetDefault(\"Inactiv";
__ref._m_inactivedaysvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("InactiveDaysVisible"),(Object)(__c.False)));
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="m_MouseHoverFeedback = Props.GetDefault(\"MouseHov";
__ref._m_mousehoverfeedback /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MouseHoverFeedback"),(Object)(__c.True)));
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="m_SelectMode = Props.GetDefault(\"SelectMode\",\"Dat";
__ref._m_selectmode /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("SelectMode"),(Object)("Date")));
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="m_ShowWeekNumbers = Props.GetDefault(\"ShowWeekNum";
__ref._m_showweeknumbers /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowWeekNumbers"),(Object)(__c.False)));
RDebugUtils.currentLine=17367052;
 //BA.debugLineNum = 17367052;BA.debugLine="m_ShowGridLines = Props.GetDefault(\"ShowGridLines";
__ref._m_showgridlines /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowGridLines"),(Object)(__c.False)));
RDebugUtils.currentLine=17367053;
 //BA.debugLineNum = 17367053;BA.debugLine="m_GridLineColor = xui.PaintOrColorToColor(Props.G";
__ref._m_gridlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("GridLineColor"),(Object)(((int)0x50ffffff))));
RDebugUtils.currentLine=17367054;
 //BA.debugLineNum = 17367054;BA.debugLine="m_ThemeChangeTransition = Props.GetDefault(\"Theme";
__ref._m_themechangetransition /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ThemeChangeTransition"),(Object)("Fade")));
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="If \"Friday\" = Props.Get(\"FirstDayOfWeek\") Then";
if (("Friday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=17367057;
 //BA.debugLineNum = 17367057;BA.debugLine="m_FirstDayOfWeek = 1";
__ref._m_firstdayofweek /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=17367058;
 //BA.debugLineNum = 17367058;BA.debugLine="else If \"Thursday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Thursday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=17367059;
 //BA.debugLineNum = 17367059;BA.debugLine="m_FirstDayOfWeek = 2";
__ref._m_firstdayofweek /*int*/  = (int) (2);
 }else 
{RDebugUtils.currentLine=17367060;
 //BA.debugLineNum = 17367060;BA.debugLine="else If \"Wednesday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Wednesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=17367061;
 //BA.debugLineNum = 17367061;BA.debugLine="m_FirstDayOfWeek = 3";
__ref._m_firstdayofweek /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=17367062;
 //BA.debugLineNum = 17367062;BA.debugLine="else If \"Tuesday\" = Props.Get(\"FirstDayOfWeek\") T";
if (("Tuesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=17367063;
 //BA.debugLineNum = 17367063;BA.debugLine="m_FirstDayOfWeek = 4";
__ref._m_firstdayofweek /*int*/  = (int) (4);
 }else 
{RDebugUtils.currentLine=17367064;
 //BA.debugLineNum = 17367064;BA.debugLine="else If \"Monday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Monday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=17367065;
 //BA.debugLineNum = 17367065;BA.debugLine="m_FirstDayOfWeek = 5";
__ref._m_firstdayofweek /*int*/  = (int) (5);
 }else 
{RDebugUtils.currentLine=17367066;
 //BA.debugLineNum = 17367066;BA.debugLine="else If \"Sunday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Sunday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=17367067;
 //BA.debugLineNum = 17367067;BA.debugLine="m_FirstDayOfWeek = 6";
__ref._m_firstdayofweek /*int*/  = (int) (6);
 }else 
{RDebugUtils.currentLine=17367068;
 //BA.debugLineNum = 17367068;BA.debugLine="else If \"Saturday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Saturday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=17367069;
 //BA.debugLineNum = 17367069;BA.debugLine="m_FirstDayOfWeek = 7";
__ref._m_firstdayofweek /*int*/  = (int) (7);
 }}}}}}}
;
RDebugUtils.currentLine=17367072;
 //BA.debugLineNum = 17367072;BA.debugLine="g_WeekNumberProperties = CreateASDatePicker_WeekN";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = __ref._createasdatepicker_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ (null,(float) (__c.DipToCurrent((int) (20))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,"");
RDebugUtils.currentLine=17367073;
 //BA.debugLineNum = 17367073;BA.debugLine="g_HeaderProperties = CreateASDatePicker_HeaderPro";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = __ref._createasdatepicker_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ (null,(float) (__c.DipToCurrent((int) (40))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (15),__c.True);
RDebugUtils.currentLine=17367074;
 //BA.debugLineNum = 17367074;BA.debugLine="g_BodyProperties = CreateASDatePicker_BodyPropert";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = __ref._createasdatepicker_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=17367075;
 //BA.debugLineNum = 17367075;BA.debugLine="g_WeekNameProperties = CreateASDatePicker_WeekNam";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = __ref._createasdatepicker_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=17367077;
 //BA.debugLineNum = 17367077;BA.debugLine="g_MonthNameShort = CreateASDatePicker_MonthNameSh";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = __ref._createasdatepicker_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ (null,"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec");
RDebugUtils.currentLine=17367078;
 //BA.debugLineNum = 17367078;BA.debugLine="g_WeekNameShort = CreateASDatePicker_WeekNameShor";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = __ref._createasdatepicker_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ (null,"Mon","Tue","Wed","Thu","Fri","Sat","Sun");
RDebugUtils.currentLine=17367080;
 //BA.debugLineNum = 17367080;BA.debugLine="End Sub";
return "";
}
public String  _ini_viewpager(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "ini_viewpager", true))
	 {return ((String) Debug.delegate(ba, "ini_viewpager", null));}
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub ini_viewpager";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="tmpmap.Put(\"Orientation\",\"Horizontal\")";
_tmpmap.Put((Object)("Orientation"),(Object)("Horizontal"));
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="tmpmap.Put(\"Carousel\",False)";
_tmpmap.Put((Object)("Carousel"),(Object)(__c.False));
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="tmpmap.Put(\"LazyLoading\",True)";
_tmpmap.Put((Object)("LazyLoading"),(Object)(__c.True));
RDebugUtils.currentLine=17432585;
 //BA.debugLineNum = 17432585;BA.debugLine="tmpmap.Put(\"LazyLoadingExtraSize\",3)";
_tmpmap.Put((Object)("LazyLoadingExtraSize"),(Object)(3));
RDebugUtils.currentLine=17432586;
 //BA.debugLineNum = 17432586;BA.debugLine="xASVP_Main.Initialize(Me,\"xASVP_Main\")";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._initialize /*String*/ (null,ba,this,"xASVP_Main");
RDebugUtils.currentLine=17432587;
 //BA.debugLineNum = 17432587;BA.debugLine="xASVP_Main.DesignerCreateView(xpnl_ViewPager,tmpl";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._designercreateview /*String*/ (null,(Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=17432588;
 //BA.debugLineNum = 17432588;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=17432589;
 //BA.debugLineNum = 17432589;BA.debugLine="End Sub";
return "";
}
public int  _getbodycolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodycolor", true))
	 {return ((Integer) Debug.delegate(ba, "getbodycolor", null));}
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub getBodyColor As Int";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Return m_BodyColor";
if (true) return __ref._m_bodycolor /*int*/ ;
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="End Sub";
return 0;
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _getbodyproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "getbodyproperties", null));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub getBodyProperties As ASDatePicker_BodyP";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="Return g_BodyProperties";
if (true) return __ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ ;
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentdatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentdatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentdatecolor", null));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Public Sub getCurrentDateColor As Int";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Return m_CurrentDateColor";
if (true) return __ref._m_currentdatecolor /*int*/ ;
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="End Sub";
return 0;
}
public String  _getcurrentview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview", null));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub getCurrentView As String";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="Return m_CurrentView";
if (true) return __ref._m_currentview /*String*/ ;
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="End Sub";
return "";
}
public int  _getgridlinecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getgridlinecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getgridlinecolor", null));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub getGridLineColor As Int";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Return m_GridLineColor";
if (true) return __ref._m_gridlinecolor /*int*/ ;
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="End Sub";
return 0;
}
public int  _getheadercolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheadercolor", true))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Return m_HeaderColor";
if (true) return __ref._m_headercolor /*int*/ ;
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getheaderpanel(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Public Sub getHeaderPanel As B4XView";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Return xpnl_Header";
if (true) return __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _getheaderproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "getheaderproperties", null));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub getHeaderProperties As ASDatePicker_Hea";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Return g_HeaderProperties";
if (true) return __ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ ;
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="End Sub";
return null;
}
public long  _getmaxdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmaxdate", true))
	 {return ((Long) Debug.delegate(ba, "getmaxdate", null));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub getMaxDate As Long";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Return m_MaxDate";
if (true) return __ref._m_maxdate /*long*/ ;
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="End Sub";
return 0L;
}
public long  _getmindate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmindate", true))
	 {return ((Long) Debug.delegate(ba, "getmindate", null));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub getMinDate As Long";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Return m_MinDate";
if (true) return __ref._m_mindate /*long*/ ;
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return 0L;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _getmonthnameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "getmonthnameshort", null));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub getMonthNameShort As ASDatePicker_Month";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Return g_MonthNameShort";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ ;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
return null;
}
public long  _getselecteddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddate", true))
	 {return ((Long) Debug.delegate(ba, "getselecteddate", null));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub getSelectedDate As Long";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="End Sub";
return 0L;
}
public int  _getselecteddatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselecteddatecolor", null));}
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Public Sub getSelectedDateColor As Int";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Return m_SelectedDateColor";
if (true) return __ref._m_selecteddatecolor /*int*/ ;
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="End Sub";
return 0;
}
public long  _getselectedenddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedenddate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedenddate", null));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub getSelectedEndDate As Long";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="Return m_SelectedDate2";
if (true) return __ref._m_selecteddate2 /*long*/ ;
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="End Sub";
return 0L;
}
public long  _getselectedstartdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedstartdate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedstartdate", null));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub getSelectedStartDate As Long";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="End Sub";
return 0L;
}
public String  _getselectmode(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode", true))
	 {return ((String) Debug.delegate(ba, "getselectmode", null));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub getSelectMode As String";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="Return m_SelectMode";
if (true) return __ref._m_selectmode /*String*/ ;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_day(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_day", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_day", null));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub getSelectMode_Day As String";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Return \"Date\"";
if (true) return "Date";
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_month(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_month", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_month", null));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub getSelectMode_Month As String";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Return \"Month\"";
if (true) return "Month";
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowgridlines(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowgridlines", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowgridlines", null));}
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub getShowGridLines As Boolean";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Return m_ShowGridLines";
if (true) return __ref._m_showgridlines /*boolean*/ ;
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowweeknumbers(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowweeknumbers", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowweeknumbers", null));}
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Public Sub getShowWeekNumbers As Boolean";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Return m_ShowWeekNumbers";
if (true) return __ref._m_showweeknumbers /*boolean*/ ;
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_dark(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_dark", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_dark", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub getTheme_Dark As AS_DatePicker_Theme";
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=17104900;
 //BA.debugLineNum = 17104900;BA.debugLine="Theme.BodyColor = 0xFF202125";
_theme.BodyColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=17104901;
 //BA.debugLineNum = 17104901;BA.debugLine="Theme.HeaderColor = 0xFF202125";
_theme.HeaderColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=17104902;
 //BA.debugLineNum = 17104902;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=17104903;
 //BA.debugLineNum = 17104903;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=17104904;
 //BA.debugLineNum = 17104904;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,255,255,2";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=17104905;
 //BA.debugLineNum = 17104905;BA.debugLine="Theme.BodyTextColor = xui.Color_White";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17104906;
 //BA.debugLineNum = 17104906;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17104907;
 //BA.debugLineNum = 17104907;BA.debugLine="Theme.HeaderTextColor = xui.Color_White";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17104908;
 //BA.debugLineNum = 17104908;BA.debugLine="Theme.WeekNameColor =  0xFF202125'xui.Color_ARGB(";
_theme.WeekNameColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=17104909;
 //BA.debugLineNum = 17104909;BA.debugLine="Theme.WeekNameTextColor = xui.Color_White";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17104910;
 //BA.debugLineNum = 17104910;BA.debugLine="Theme.WeekNumberColor = xui.Color_ARGB(255,32, 33";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
RDebugUtils.currentLine=17104911;
 //BA.debugLineNum = 17104911;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_White";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17104913;
 //BA.debugLineNum = 17104913;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=17104915;
 //BA.debugLineNum = 17104915;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_light(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_light", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_light", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Public Sub getTheme_Light As AS_DatePicker_Theme";
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="Theme.BodyColor = xui.Color_White";
_theme.BodyColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="Theme.HeaderColor = xui.Color_White";
_theme.HeaderColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,0,0,0)";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=17170441;
 //BA.debugLineNum = 17170441;BA.debugLine="Theme.BodyTextColor = xui.Color_Black";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=17170442;
 //BA.debugLineNum = 17170442;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17170443;
 //BA.debugLineNum = 17170443;BA.debugLine="Theme.HeaderTextColor = xui.Color_Black";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="Theme.WeekNameColor = xui.Color_White'xui.Color_A";
_theme.WeekNameColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17170445;
 //BA.debugLineNum = 17170445;BA.debugLine="Theme.WeekNameTextColor = xui.Color_Black";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="Theme.WeekNumberColor = xui.Color_White";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=17170447;
 //BA.debugLineNum = 17170447;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_Black";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=17170449;
 //BA.debugLineNum = 17170449;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=17170451;
 //BA.debugLineNum = 17170451;BA.debugLine="End Sub";
return null;
}
public String  _getweeknamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getweeknamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Public Sub GetWeekNameByIndex(Index As Int) As Str";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="If Index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Return g_WeekNameShort.Sunday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ ;
 }else 
{RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="else If Index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="Return g_WeekNameShort.Monday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ ;
 }else 
{RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="else If Index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="Return g_WeekNameShort.Tuesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="else If Index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="Return g_WeekNameShort.Wednesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="else If Index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="Return g_WeekNameShort.Thursday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ ;
 }else 
{RDebugUtils.currentLine=23068683;
 //BA.debugLineNum = 23068683;BA.debugLine="else If Index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=23068684;
 //BA.debugLineNum = 23068684;BA.debugLine="Return g_WeekNameShort.Friday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ ;
 }else {
RDebugUtils.currentLine=23068686;
 //BA.debugLineNum = 23068686;BA.debugLine="Return g_WeekNameShort.Saturday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ ;
 }}}}}}
;
RDebugUtils.currentLine=23068688;
 //BA.debugLineNum = 23068688;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _getweeknameproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "getweeknameproperties", null));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub getWeekNameProperties As ASDatePicker_W";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Return g_WeekNameProperties";
if (true) return __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ ;
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _getweeknameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "getweeknameshort", null));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub getWeekNameShort As ASDatePicker_WeekNa";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Return g_WeekNameShort";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ ;
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _getweeknumberproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "getweeknumberproperties", null));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub getWeekNumberProperties As ASDatePicker";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Return g_WeekNumberProperties";
if (true) return __ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ ;
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=17235971;
 //BA.debugLineNum = 17235971;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub RefreshSelectedDate";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=18284551;
 //BA.debugLineNum = 18284551;BA.debugLine="Dim counter As Int = xASVP_Main.GetPanel(i).Nu";
_counter = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews();
RDebugUtils.currentLine=18284552;
 //BA.debugLineNum = 18284552;BA.debugLine="For z = 0 To counter -1";
{
final int step6 = 1;
final int limit6 = (int) (_counter-1);
_z = (int) (0) ;
for (;_z <= limit6 ;_z = _z + step6 ) {
RDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="Dim xpnl_Day As B4XView = xASVP_Main.GetPanel";
_xpnl_day = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_day = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).GetView(_z);
RDebugUtils.currentLine=18284554;
 //BA.debugLineNum = 18284554;BA.debugLine="If xpnl_Day.tag Is Long And xpnl_Day.NumberOf";
if (_xpnl_day.getTag() instanceof Long && _xpnl_day.getNumberOfViews()>0) { 
RDebugUtils.currentLine=18284555;
 //BA.debugLineNum = 18284555;BA.debugLine="CreateSelectDates(xpnl_Day,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_day,_clr);
 };
 }
};
 };
 };
 }
};
RDebugUtils.currentLine=18284562;
 //BA.debugLineNum = 18284562;BA.debugLine="End Sub";
return "";
}
public String  _selecteddaterangechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddaterangechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddaterangechanged", null));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub SelectedDateRangeChanged";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(int) (2))) { 
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SelectedDateR";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(Object)(__ref._m_selecteddate /*long*/ ),(Object)(__ref._m_selecteddate2 /*long*/ ));
 };
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="End Sub";
return "";
}
public String  _selecteddatechanged(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddatechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddatechanged", new Object[] {_date}));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub SelectedDateChanged(date As Long)";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(int) (1))) { 
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedDateC";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(Object)(_date));
 };
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="End Sub";
return "";
}
public String  _pagechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "pagechanged", true))
	 {return ((String) Debug.delegate(ba, "pagechanged", null));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub PageChanged";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(int) (0))) { 
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="CallSub(mCallBack, mEventName & \"_PageChanged\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged");
 };
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Do While m_isReady = False";
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
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="Sleep(0)";
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
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 5;
;
RDebugUtils.currentLine=18481158;
 //BA.debugLineNum = 18481158;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=18481163;
 //BA.debugLineNum = 18481163;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
this.state = 9;
}}
if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=18481161;
 //BA.debugLineNum = 18481161;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=18481162;
 //BA.debugLineNum = 18481162;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=18481164;
 //BA.debugLineNum = 18481164;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=18481165;
 //BA.debugLineNum = 18481165;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=18481167;
 //BA.debugLineNum = 18481167;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="xASVP_Main.GetPanel(i).RemoveAllViews";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).RemoveAllViews();
RDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="AddMonth(xASVP_Main.GetPanel(i),xASVP_Main.Get";
__ref._addmonth /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }else 
{RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="AddYear(xASVP_Main.GetPanel(i),xASVP_Main.GetV";
__ref._addyear /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }}
;
 };
 }
};
RDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub RefreshHeader";
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=18415621;
 //BA.debugLineNum = 18415621;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = xpnl_Header.GetVi";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=18415622;
 //BA.debugLineNum = 18415622;BA.debugLine="Dim xlbl_ArrowRight As B4XView = xpnl_Header.GetV";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=18415624;
 //BA.debugLineNum = 18415624;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=18415625;
 //BA.debugLineNum = 18415625;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=18415626;
 //BA.debugLineNum = 18415626;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=18415628;
 //BA.debugLineNum = 18415628;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=18415629;
 //BA.debugLineNum = 18415629;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=18415630;
 //BA.debugLineNum = 18415630;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=18415632;
 //BA.debugLineNum = 18415632;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=18415633;
 //BA.debugLineNum = 18415633;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=18415635;
 //BA.debugLineNum = 18415635;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub Scroll2Date(Date As Long)";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim ScrollIndex As Int = -1";
_scrollindex = (int) (-1);
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Dim StartDate As Long = xASVP_Main.GetValue(i)";
_startdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i));
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="If DateTime.GetYear(StartDate) = DateTime.GetYea";
if (__c.DateTime.GetYear(_startdate)==__c.DateTime.GetYear(_date) && __c.DateTime.GetMonth(_startdate)==__c.DateTime.GetMonth(_date)) { 
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="ScrollIndex = i";
_scrollindex = _i;
 };
 }
};
RDebugUtils.currentLine=20119562;
 //BA.debugLineNum = 20119562;BA.debugLine="If ScrollIndex <> -1 Then";
if (_scrollindex!=-1) { 
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="xASVP_Main.CurrentIndex = ScrollIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex /*int*/ (null,_scrollindex);
 }else {
RDebugUtils.currentLine=20119565;
 //BA.debugLineNum = 20119565;BA.debugLine="m_StartDate = Date";
__ref._m_startdate /*long*/  = _date;
RDebugUtils.currentLine=20119566;
 //BA.debugLineNum = 20119566;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=20119567;
 //BA.debugLineNum = 20119567;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 };
RDebugUtils.currentLine=20119569;
 //BA.debugLineNum = 20119569;BA.debugLine="End Sub";
return "";
}
public String  _setbodycolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodycolor", true))
	 {return ((String) Debug.delegate(ba, "setbodycolor", new Object[] {_color}));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub setBodyColor(Color As Int)";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="m_BodyColor = Color";
__ref._m_bodycolor /*int*/  = _color;
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="End Sub";
return "";
}
public String  _setbodyproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _bodyproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodyproperties", true))
	 {return ((String) Debug.delegate(ba, "setbodyproperties", new Object[] {_bodyproperties}));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub setBodyProperties(BodyProperties As ASD";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="g_BodyProperties = BodyProperties";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = _bodyproperties;
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentdatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setcurrentdatecolor", true))
	 {return ((String) Debug.delegate(ba, "setcurrentdatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Public Sub setCurrentDateColor(Color As Int)";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="m_CurrentDateColor = Color";
__ref._m_currentdatecolor /*int*/  = _color;
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="End Sub";
return "";
}
public String  _setfirstdayofweek(b4a.example.ef.as_datepicker __ref,int _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setfirstdayofweek", true))
	 {return ((String) Debug.delegate(ba, "setfirstdayofweek", new Object[] {_number}));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Public Sub setFirstDayOfWeek(number As Int)";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="m_FirstDayOfWeek = number";
__ref._m_firstdayofweek /*int*/  = _number;
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="End Sub";
return "";
}
public String  _setgridlinecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setgridlinecolor", true))
	 {return ((String) Debug.delegate(ba, "setgridlinecolor", new Object[] {_color}));}
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub setGridLineColor(Color As Int)";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="m_GridLineColor = Color";
__ref._m_gridlinecolor /*int*/  = _color;
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheadercolor", true))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="m_HeaderColor = Color";
__ref._m_headercolor /*int*/  = _color;
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="End Sub";
return "";
}
public String  _setheaderproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_headerproperties _headerproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheaderproperties", true))
	 {return ((String) Debug.delegate(ba, "setheaderproperties", new Object[] {_headerproperties}));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub setHeaderProperties(HeaderProperties As";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="g_HeaderProperties = HeaderProperties";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = _headerproperties;
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="End Sub";
return "";
}
public String  _setmaxdate(b4a.example.ef.as_datepicker __ref,long _maxdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmaxdate", true))
	 {return ((String) Debug.delegate(ba, "setmaxdate", new Object[] {_maxdate}));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub setMaxDate(MaxDate As Long)";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="m_MaxDate = MaxDate";
__ref._m_maxdate /*long*/  = _maxdate;
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="End Sub";
return "";
}
public String  _setmindate(b4a.example.ef.as_datepicker __ref,long _mindate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmindate", true))
	 {return ((String) Debug.delegate(ba, "setmindate", new Object[] {_mindate}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub setMinDate(MinDate As Long)";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="m_MinDate = MinDate";
__ref._m_mindate /*long*/  = _mindate;
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="End Sub";
return "";
}
public String  _setmonthnameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _monthnameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmonthnameshort", true))
	 {return ((String) Debug.delegate(ba, "setmonthnameshort", new Object[] {_monthnameshort}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub setMonthNameShort(MonthNameShort As ASD";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="g_MonthNameShort = MonthNameShort";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = _monthnameshort;
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddate", true))
	 {return ((String) Debug.delegate(ba, "setselecteddate", new Object[] {_date}));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub setSelectedDate(Date As Long)";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddatecolor", true))
	 {return ((String) Debug.delegate(ba, "setselecteddatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Public Sub setSelectedDateColor(Color As Int)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="m_SelectedDateColor = Color";
__ref._m_selecteddatecolor /*int*/  = _color;
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="End Sub";
return "";
}
public String  _setselectedenddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedenddate", true))
	 {return ((String) Debug.delegate(ba, "setselectedenddate", new Object[] {_date}));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub setSelectedEndDate(Date As Long)";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="m_SelectedDate2 = Date";
__ref._m_selecteddate2 /*long*/  = _date;
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="End Sub";
return "";
}
public String  _setselectedstartdate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedstartdate", true))
	 {return ((String) Debug.delegate(ba, "setselectedstartdate", new Object[] {_date}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub setSelectedStartDate(Date As Long)";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="End Sub";
return "";
}
public String  _setselectmode(b4a.example.ef.as_datepicker __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectmode", true))
	 {return ((String) Debug.delegate(ba, "setselectmode", new Object[] {_mode}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub setSelectMode(Mode As String)";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="m_SelectMode = Mode";
__ref._m_selectmode /*String*/  = _mode;
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="End Sub";
return "";
}
public String  _setshowgridlines(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowgridlines", true))
	 {return ((String) Debug.delegate(ba, "setshowgridlines", new Object[] {_show}));}
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub setShowGridLines(Show As Boolean)";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="m_ShowGridLines = Show";
__ref._m_showgridlines /*boolean*/  = _show;
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="End Sub";
return "";
}
public String  _setshowweeknumbers(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowweeknumbers", true))
	 {return ((String) Debug.delegate(ba, "setshowweeknumbers", new Object[] {_show}));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Public Sub setShowWeekNumbers(Show As Boolean)";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="m_ShowWeekNumbers = Show";
__ref._m_showweeknumbers /*boolean*/  = _show;
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="xiv_RefreshImage.SetBitmap(mBase.Snapshot)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .Snapshot().getObject()));
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,True)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="m_BodyColor = Theme.BodyColor";
__ref._m_bodycolor /*int*/  = _theme.BodyColor /*int*/ ;
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="m_HeaderColor = Theme.HeaderColor";
__ref._m_headercolor /*int*/  = _theme.HeaderColor /*int*/ ;
RDebugUtils.currentLine=17039367;
 //BA.debugLineNum = 17039367;BA.debugLine="m_CurrentDateColor = Theme.CurrentDateColor";
__ref._m_currentdatecolor /*int*/  = _theme.CurrentDateColor /*int*/ ;
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="m_SelectedDateColor = Theme.SelectedDateColor";
__ref._m_selecteddatecolor /*int*/  = _theme.SelectedDateColor /*int*/ ;
RDebugUtils.currentLine=17039369;
 //BA.debugLineNum = 17039369;BA.debugLine="m_GridLineColor = Theme.GridLineColor";
__ref._m_gridlinecolor /*int*/  = _theme.GridLineColor /*int*/ ;
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="g_BodyProperties.TextColor = Theme.BodyTextColor";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/  = _theme.BodyTextColor /*int*/ ;
RDebugUtils.currentLine=17039371;
 //BA.debugLineNum = 17039371;BA.debugLine="g_HeaderProperties.TextColor = Theme.HeaderTextCo";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/  = _theme.HeaderTextColor /*int*/ ;
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="g_WeekNameProperties.Color = Theme.WeekNameColor";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/  = _theme.WeekNameColor /*int*/ ;
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="g_WeekNameProperties.TextColor = Theme.WeekNameTe";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/  = _theme.WeekNameTextColor /*int*/ ;
RDebugUtils.currentLine=17039374;
 //BA.debugLineNum = 17039374;BA.debugLine="g_WeekNumberProperties.Color = Theme.WeekNumberCo";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/  = _theme.WeekNumberColor /*int*/ ;
RDebugUtils.currentLine=17039375;
 //BA.debugLineNum = 17039375;BA.debugLine="g_WeekNumberProperties.TextColor = Theme.WeekNumb";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/  = _theme.WeekNumberTextColor /*int*/ ;
RDebugUtils.currentLine=17039376;
 //BA.debugLineNum = 17039376;BA.debugLine="g_BodyProperties.SelectedTextColor = Theme.Select";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/  = _theme.SelectedTextColor /*int*/ ;
RDebugUtils.currentLine=17039378;
 //BA.debugLineNum = 17039378;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=17039380;
 //BA.debugLineNum = 17039380;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=17039381;
 //BA.debugLineNum = 17039381;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=17039382;
 //BA.debugLineNum = 17039382;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=17039384;
 //BA.debugLineNum = 17039384;BA.debugLine="RefreshHeader";
__ref._refreshheader /*String*/ (null);
RDebugUtils.currentLine=17039385;
 //BA.debugLineNum = 17039385;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=17039387;
 //BA.debugLineNum = 17039387;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=17039389;
 //BA.debugLineNum = 17039389;BA.debugLine="Select m_ThemeChangeTransition";
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
RDebugUtils.currentLine=17039391;
 //BA.debugLineNum = 17039391;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17039393;
 //BA.debugLineNum = 17039393;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(250,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=17039396;
 //BA.debugLineNum = 17039396;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub setWeekNameProperties(WeekNamePropertie";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="g_WeekNameProperties = WeekNameProperties";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = _weeknameproperties;
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return "";
}
public String  _setweeknameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _weeknameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknameshort", true))
	 {return ((String) Debug.delegate(ba, "setweeknameshort", new Object[] {_weeknameshort}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub setWeekNameShort(WeekNameShort As ASDat";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="g_WeekNameShort = WeekNameShort";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = _weeknameshort;
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="End Sub";
return "";
}
public String  _setweeknumberproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _weeknumberproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknumberproperties", true))
	 {return ((String) Debug.delegate(ba, "setweeknumberproperties", new Object[] {_weeknumberproperties}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub setWeekNumberProperties(WeekNumberPrope";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="g_WeekNumberProperties = WeekNumberProperties";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = _weeknumberproperties;
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_lazyloadingaddcontent(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_lazyloadingaddcontent", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_lazyloadingaddcontent", new Object[] {_parent,_value}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Private Sub xASVP_Main_LazyLoadingAddContent(Paren";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="AddMonth(Parent,Value)";
__ref._addmonth /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }else 
{RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView O";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="AddYear(Parent,Value)";
__ref._addyear /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }}
;
RDebugUtils.currentLine=22216710;
 //BA.debugLineNum = 22216710;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechange(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechange", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechange", new Object[] {_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
long _currentdate = 0L;
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Private Sub xASVP_Main_PageChange(Index As Int)";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="Dim CurrentDate As Long = xASVP_Main.GetValue(Ind";
_currentdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=22282244;
 //BA.debugLineNum = 22282244;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(Current";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,_currentdate)+" "+BA.NumberToString(__c.DateTime.GetYear(_currentdate))));
 }else 
{RDebugUtils.currentLine=22282245;
 //BA.debugLineNum = 22282245;BA.debugLine="else if m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(_currentdate)));
 }else 
{RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString((__c.DateTime.GetYear(_currentdate)+11))));
 }else 
{RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+10*12)-1))));
 }}}}
;
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="CustomDrawHeader(CurrentDate)";
__ref._customdrawheader /*String*/ (null,_currentdate);
RDebugUtils.currentLine=22282253;
 //BA.debugLineNum = 22282253;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechanged", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechanged", new Object[] {_index}));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Private Sub xASVP_Main_PageChanged(Index As Int)";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="PageChanged";
__ref._pagechanged /*String*/ (null);
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub xASVP_Main_PageChanged2(NewIndex As In";
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="If m_MinDate > 0 And m_MaxDate > 0 Then Return";
if (__ref._m_mindate /*long*/ >0 && __ref._m_maxdate /*long*/ >0) { 
if (true) return "";};
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="Dim Forward As Boolean = False";
_forward = __c.False;
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="Dim DoIt As Boolean = False";
_doit = __c.False;
RDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="If NewIndex <= OldIndex Then";
if (_newindex<=_oldindex) { 
RDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="If NewIndex <= 2 Then";
if (_newindex<=2) { 
RDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=17694730;
 //BA.debugLineNum = 17694730;BA.debugLine="Forward = False";
_forward = __c.False;
 };
 }else {
RDebugUtils.currentLine=17694733;
 //BA.debugLineNum = 17694733;BA.debugLine="If NewIndex = xASVP_Main.Size -2 Then";
if (_newindex==__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-2) { 
RDebugUtils.currentLine=17694734;
 //BA.debugLineNum = 17694734;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=17694735;
 //BA.debugLineNum = 17694735;BA.debugLine="Forward = True";
_forward = __c.True;
 };
 };
RDebugUtils.currentLine=17694739;
 //BA.debugLineNum = 17694739;BA.debugLine="If DoIt Then";
if (_doit) { 
RDebugUtils.currentLine=17694741;
 //BA.debugLineNum = 17694741;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=17694742;
 //BA.debugLineNum = 17694742;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17694743;
 //BA.debugLineNum = 17694743;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17694744;
 //BA.debugLineNum = 17694744;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17694746;
 //BA.debugLineNum = 17694746;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17694747;
 //BA.debugLineNum = 17694747;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=17694748;
 //BA.debugLineNum = 17694748;BA.debugLine="p2.Months = IIf(Forward,1,-1)";
_p2.Months = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=17694750;
 //BA.debugLineNum = 17694750;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=17694751;
 //BA.debugLineNum = 17694751;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate";
_firstdayofmonth = _dateutils._setdate(ba,__c.DateTime.GetYear(_currenttime),__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=17694753;
 //BA.debugLineNum = 17694753;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=17694754;
 //BA.debugLineNum = 17694754;BA.debugLine="If m_MaxDate > 0 And FirstDayOfMonth > DateUti";
if (__ref._m_maxdate /*long*/ >0 && _firstdayofmonth>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=17694755;
 //BA.debugLineNum = 17694755;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17694757;
 //BA.debugLineNum = 17694757;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfM";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
 }else {
RDebugUtils.currentLine=17694759;
 //BA.debugLineNum = 17694759;BA.debugLine="If m_MinDate > 0 And FirstDayOfMonth < DateUti";
if (__ref._m_mindate /*long*/ >0 && _firstdayofmonth<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=17694760;
 //BA.debugLineNum = 17694760;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17694762;
 //BA.debugLineNum = 17694762;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,FirstDa";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_firstdayofmonth));
 };
 }else 
{RDebugUtils.currentLine=17694765;
 //BA.debugLineNum = 17694765;BA.debugLine="else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=17694767;
 //BA.debugLineNum = 17694767;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17694768;
 //BA.debugLineNum = 17694768;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17694769;
 //BA.debugLineNum = 17694769;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17694771;
 //BA.debugLineNum = 17694771;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17694772;
 //BA.debugLineNum = 17694772;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=17694773;
 //BA.debugLineNum = 17694773;BA.debugLine="p2.Years = IIf(Forward,1,-1)";
_p2.Years = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=17694775;
 //BA.debugLineNum = 17694775;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=17694778;
 //BA.debugLineNum = 17694778;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=17694779;
 //BA.debugLineNum = 17694779;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=17694780;
 //BA.debugLineNum = 17694780;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17694782;
 //BA.debugLineNum = 17694782;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 }else {
RDebugUtils.currentLine=17694784;
 //BA.debugLineNum = 17694784;BA.debugLine="If m_MinDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_mindate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )) { 
RDebugUtils.currentLine=17694785;
 //BA.debugLineNum = 17694785;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17694787;
 //BA.debugLineNum = 17694787;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,Current";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_currenttime));
 };
 }else 
{RDebugUtils.currentLine=17694790;
 //BA.debugLineNum = 17694790;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=17694792;
 //BA.debugLineNum = 17694792;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=17694794;
 //BA.debugLineNum = 17694794;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePan";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=17694795;
 //BA.debugLineNum = 17694795;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=17694796;
 //BA.debugLineNum = 17694796;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_V";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=17694798;
 //BA.debugLineNum = 17694798;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=17694799;
 //BA.debugLineNum = 17694799;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=17694800;
 //BA.debugLineNum = 17694800;BA.debugLine="p2.Years = 10";
_p2.Years = (int) (10);
RDebugUtils.currentLine=17694802;
 //BA.debugLineNum = 17694802;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1))),_p2);
RDebugUtils.currentLine=17694805;
 //BA.debugLineNum = 17694805;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=17694806;
 //BA.debugLineNum = 17694806;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17694808;
 //BA.debugLineNum = 17694808;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 };
 }}}
;
 };
RDebugUtils.currentLine=17694815;
 //BA.debugLineNum = 17694815;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_header_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_header_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_header_click", null));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Private Sub xlbl_Header_Click";
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="else If m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="ChangeView(getCurrentView_CenturyView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_centuryview /*String*/ (null));
 }}}
;
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowleft_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowleft_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowleft_click", null));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub xlbl_HeaderArrowLeft_Click";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="xASVP_Main.PreviousPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._previouspage /*String*/ (null);
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowright_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowright_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowright_click", null));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub xlbl_HeaderArrowRight_Click";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="xASVP_Main.NextPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._nextpage /*String*/ (null);
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_centurydecade_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_centurydecade_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_centurydecade_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_centurydecade = null;
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Private Sub xpnl_CenturyDecade_Click";
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Dim xpnl_CenturyDecade As B4XView = Sender";
_xpnl_centurydecade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_centurydecade = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="m_StartDate = xpnl_CenturyDecade.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_centurydecade.getTag());
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_decadeyear_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_decadeyear_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_decadeyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_decadeyear = null;
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Private Sub xpnl_DecadeYear_Click";
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="Dim xpnl_DecadeYear As B4XView = Sender";
_xpnl_decadeyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_decadeyear = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="m_StartDate = xpnl_DecadeYear.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_decadeyear.getTag());
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_monthdate_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_monthdate_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_monthdate_click", null));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Private Sub xpnl_MonthDate_Click";
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="MonthDateClick(Sender,True)";
__ref._monthdateclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Private Sub xpnl_YearMonth_Click";
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="Dim xpnl_YearMonth As B4XView = Sender";
_xpnl_yearmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_yearmonth = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="m_StartDate = xpnl_YearMonth.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_yearmonth.getTag());
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="If m_SelectMode = \"Date\"  Or m_SelectMode = \"Rang";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=22609925;
 //BA.debugLineNum = 22609925;BA.debugLine="ChangeView(getCurrentView_MonthView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_monthview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=22609926;
 //BA.debugLineNum = 22609926;BA.debugLine="Else If m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=22609927;
 //BA.debugLineNum = 22609927;BA.debugLine="SelectedDateChanged(xpnl_YearMonth.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_yearmonth.getTag()));
RDebugUtils.currentLine=22609929;
 //BA.debugLineNum = 22609929;BA.debugLine="If m_MouseHoverFeedback = True Then";
if (__ref._m_mousehoverfeedback /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=22609930;
 //BA.debugLineNum = 22609930;BA.debugLine="Dim xlbl_Date As B4XView = xpnl_YearMonth.GetVi";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _xpnl_yearmonth.GetView((int) (0));
RDebugUtils.currentLine=22609931;
 //BA.debugLineNum = 22609931;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=22609935;
 //BA.debugLineNum = 22609935;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=22609936;
 //BA.debugLineNum = 22609936;BA.debugLine="xpnl_YearMonth.AddView(xpnl_selected,0,0,xpnl_Y";
_xpnl_yearmonth.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (0),_xpnl_yearmonth.getWidth(),_xpnl_yearmonth.getHeight());
RDebugUtils.currentLine=22609938;
 //BA.debugLineNum = 22609938;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateC";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=22609939;
 //BA.debugLineNum = 22609939;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=22609940;
 //BA.debugLineNum = 22609940;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=22609941;
 //BA.debugLineNum = 22609941;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
 }}
;
RDebugUtils.currentLine=22609948;
 //BA.debugLineNum = 22609948;BA.debugLine="End Sub";
return "";
}
}