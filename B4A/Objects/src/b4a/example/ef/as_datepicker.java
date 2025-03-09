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
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Private Sub AddMonth(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="Dim BlockHeight As Float = (Parent.Height-g_WeekN";
_blockheight = (float) ((_parent.getHeight()-__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ )/(double)6);
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="Dim BlockWidth As Float = IIf(m_ShowWeekNumbers,(";
_blockwidth = (float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))));
RDebugUtils.currentLine=35717127;
 //BA.debugLineNum = 35717127;BA.debugLine="If m_ShowWeekNumbers Then AddWeekName(Parent,-1,g";
if (__ref._m_showweeknumbers /*boolean*/ ) { 
__ref._addweekname /*String*/ (null,_parent,(int) (-1),__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Text /*String*/ );};
RDebugUtils.currentLine=35717128;
 //BA.debugLineNum = 35717128;BA.debugLine="AddWeekName(Parent,0,g_WeekNameShort.Monday)";
__ref._addweekname /*String*/ (null,_parent,(int) (0),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ );
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="AddWeekName(Parent,1,g_WeekNameShort.Tuesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (1),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ );
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="AddWeekName(Parent,2,g_WeekNameShort.Wednesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (2),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ );
RDebugUtils.currentLine=35717131;
 //BA.debugLineNum = 35717131;BA.debugLine="AddWeekName(Parent,3,g_WeekNameShort.Thursday)";
__ref._addweekname /*String*/ (null,_parent,(int) (3),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ );
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="AddWeekName(Parent,4,g_WeekNameShort.Friday)";
__ref._addweekname /*String*/ (null,_parent,(int) (4),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ );
RDebugUtils.currentLine=35717133;
 //BA.debugLineNum = 35717133;BA.debugLine="AddWeekName(Parent,5,g_WeekNameShort.Saturday)";
__ref._addweekname /*String*/ (null,_parent,(int) (5),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ );
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="AddWeekName(Parent,6,g_WeekNameShort.Sunday)";
__ref._addweekname /*String*/ (null,_parent,(int) (6),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ );
RDebugUtils.currentLine=35717136;
 //BA.debugLineNum = 35717136;BA.debugLine="Dim FirstDay As Long = GetFirstDayOfWeek2(Current";
_firstday = __ref._getfirstdayofweek2 /*long*/ (null,_currentdate,__ref._m_firstdayofweek /*int*/ );
RDebugUtils.currentLine=35717138;
 //BA.debugLineNum = 35717138;BA.debugLine="Dim CurrenMonth As Int = DateTime.GetMonth(Curren";
_currenmonth = __c.DateTime.GetMonth(_currentdate);
RDebugUtils.currentLine=35717140;
 //BA.debugLineNum = 35717140;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=35717143;
 //BA.debugLineNum = 35717143;BA.debugLine="For i = 1 To 43 -1";
{
final int step15 = 1;
final int limit15 = (int) (43-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=35717145;
 //BA.debugLineNum = 35717145;BA.debugLine="Dim CurrentDay As Long = FirstDay + DateTime.Tic";
_currentday = (long) (_firstday+__c.DateTime.TicksPerDay*(_i-1)+__c.DateTime.TicksPerHour);
RDebugUtils.currentLine=35717147;
 //BA.debugLineNum = 35717147;BA.debugLine="Dim Rest As Int = (i-1)/7";
_rest = (int) ((_i-1)/(double)7);
RDebugUtils.currentLine=35717148;
 //BA.debugLineNum = 35717148;BA.debugLine="Dim test As Int = (i-1) Mod 7";
_test = (int) ((_i-1)%7);
RDebugUtils.currentLine=35717150;
 //BA.debugLineNum = 35717150;BA.debugLine="Dim xpnl_Date As B4XView = xui.CreatePanel(\"xpnl";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_MonthDate");
RDebugUtils.currentLine=35717151;
 //BA.debugLineNum = 35717151;BA.debugLine="xpnl_Date.Tag = CurrentDay";
_xpnl_date.setTag((Object)(_currentday));
RDebugUtils.currentLine=35717152;
 //BA.debugLineNum = 35717152;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent'm_BodyCo";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35717153;
 //BA.debugLineNum = 35717153;BA.debugLine="Parent.AddView(xpnl_Date,IIf(m_ShowWeekNumbers,g";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_test)),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=35717154;
 //BA.debugLineNum = 35717154;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=35717155;
 //BA.debugLineNum = 35717155;BA.debugLine="xlbl_Date.Tag = \"xlbl_Date\"";
_xlbl_date.setTag((Object)("xlbl_Date"));
RDebugUtils.currentLine=35717156;
 //BA.debugLineNum = 35717156;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=35717157;
 //BA.debugLineNum = 35717157;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=35717158;
 //BA.debugLineNum = 35717158;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=35717159;
 //BA.debugLineNum = 35717159;BA.debugLine="xlbl_Date.Text = DateTime.GetDayOfMonth(CurrentD";
_xlbl_date.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(_currentday)));
RDebugUtils.currentLine=35717162;
 //BA.debugLineNum = 35717162;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=35717164;
 //BA.debugLineNum = 35717164;BA.debugLine="If DateTime.GetMonth(CurrentDay) <> CurrenMonth";
if (__c.DateTime.GetMonth(_currentday)!=_currenmonth) { 
RDebugUtils.currentLine=35717165;
 //BA.debugLineNum = 35717165;BA.debugLine="If m_InactiveDaysVisible = False Then";
if (__ref._m_inactivedaysvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=35717166;
 //BA.debugLineNum = 35717166;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 }else {
RDebugUtils.currentLine=35717168;
 //BA.debugLineNum = 35717168;BA.debugLine="Dim Color() As Int = GetARGB(g_BodyProperties.";
_color = __ref._getargb /*int[]*/ (null,__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=35717169;
 //BA.debugLineNum = 35717169;BA.debugLine="xlbl_Date.TextColor = xui.Color_ARGB(100,Color";
_xlbl_date.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (100),_color[(int) (1)],_color[(int) (2)],_color[(int) (3)]));
 };
 };
RDebugUtils.currentLine=35717173;
 //BA.debugLineNum = 35717173;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=35717174;
 //BA.debugLineNum = 35717174;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 };
RDebugUtils.currentLine=35717179;
 //BA.debugLineNum = 35717179;BA.debugLine="CreateSelectDates(xpnl_Date,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_date,_clr);
RDebugUtils.currentLine=35717181;
 //BA.debugLineNum = 35717181;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,CurrentDay)";
if (_dateutils._issameday(ba,__c.DateTime.getNow(),_currentday)==__c.True && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=35717182;
 //BA.debugLineNum = 35717182;BA.debugLine="Dim xpnl_CurrentDay As B4XView = xui.CreatePane";
_xpnl_currentday = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_currentday = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35717183;
 //BA.debugLineNum = 35717183;BA.debugLine="xpnl_CurrentDay.SetColorAndBorder(m_CurrentDate";
_xpnl_currentday.SetColorAndBorder(__ref._m_currentdatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=35717184;
 //BA.debugLineNum = 35717184;BA.debugLine="xpnl_Date.AddView(xpnl_CurrentDay,BlockWidth/2";
_xpnl_date.AddView((android.view.View)(_xpnl_currentday.getObject()),(int) (_blockwidth/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_blockheight/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 };
RDebugUtils.currentLine=35717188;
 //BA.debugLineNum = 35717188;BA.debugLine="If m_ShowWeekNumbers = True Then";
if (__ref._m_showweeknumbers /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=35717189;
 //BA.debugLineNum = 35717189;BA.debugLine="Dim xpnl_WeekNumber As B4XView = xui.CreatePane";
_xpnl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_weeknumber = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35717190;
 //BA.debugLineNum = 35717190;BA.debugLine="Dim xlbl_WeekNumber As B4XView = CreateLabel(\"\"";
_xlbl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weeknumber = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=35717191;
 //BA.debugLineNum = 35717191;BA.debugLine="Parent.AddView(xpnl_WeekNumber,0,g_WeekNameProp";
_parent.AddView((android.view.View)(_xpnl_weeknumber.getObject()),(int) (0),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=35717192;
 //BA.debugLineNum = 35717192;BA.debugLine="xpnl_WeekNumber.AddView(xlbl_WeekNumber,0,0,g_W";
_xpnl_weeknumber.AddView((android.view.View)(_xlbl_weeknumber.getObject()),(int) (0),(int) (0),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=35717194;
 //BA.debugLineNum = 35717194;BA.debugLine="xpnl_WeekNumber.Color = g_WeekNumberProperties.";
_xpnl_weeknumber.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=35717196;
 //BA.debugLineNum = 35717196;BA.debugLine="xlbl_WeekNumber.SetTextAlignment(\"CENTER\",\"CENT";
_xlbl_weeknumber.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=35717197;
 //BA.debugLineNum = 35717197;BA.debugLine="xlbl_WeekNumber.TextColor = g_WeekNumberPropert";
_xlbl_weeknumber.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=35717198;
 //BA.debugLineNum = 35717198;BA.debugLine="xlbl_WeekNumber.Font = g_WeekNumberProperties.x";
_xlbl_weeknumber.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=35717199;
 //BA.debugLineNum = 35717199;BA.debugLine="xlbl_WeekNumber.Text = GetWeekNumberStartingFro";
_xlbl_weeknumber.setText(BA.ObjectToCharSequence(__ref._getweeknumberstartingfrommonday /*int*/ (null,_currentday)));
 };
RDebugUtils.currentLine=35717202;
 //BA.debugLineNum = 35717202;BA.debugLine="CustomDrawDay(CurrentDay,xpnl_Date)";
__ref._customdrawday /*String*/ (null,_currentday,_xpnl_date);
 }
};
RDebugUtils.currentLine=35717206;
 //BA.debugLineNum = 35717206;BA.debugLine="If m_ShowGridLines Then";
if (__ref._m_showgridlines /*boolean*/ ) { 
RDebugUtils.currentLine=35717207;
 //BA.debugLineNum = 35717207;BA.debugLine="Dim xpnl_CanvasBackground As B4XView = xui.Creat";
_xpnl_canvasbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_canvasbackground = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35717208;
 //BA.debugLineNum = 35717208;BA.debugLine="Parent.AddView(xpnl_CanvasBackground,0,0,Parent.";
_parent.AddView((android.view.View)(_xpnl_canvasbackground.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=35717209;
 //BA.debugLineNum = 35717209;BA.debugLine="xpnl_CanvasBackground.Color = xui.Color_Transpar";
_xpnl_canvasbackground.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35717217;
 //BA.debugLineNum = 35717217;BA.debugLine="Dim xcv As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=35717218;
 //BA.debugLineNum = 35717218;BA.debugLine="xcv.Initialize(xpnl_CanvasBackground)";
_xcv.Initialize(_xpnl_canvasbackground);
RDebugUtils.currentLine=35717219;
 //BA.debugLineNum = 35717219;BA.debugLine="xcv.ClearRect(xcv.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
RDebugUtils.currentLine=35717221;
 //BA.debugLineNum = 35717221;BA.debugLine="For i = 0 To 6 -1 'Add Divider Vertical";
{
final int step67 = 1;
final int limit67 = (int) (6-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=35717222;
 //BA.debugLineNum = 35717222;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumber";
_xcv.DrawLine((float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (0),(float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (_parent.getHeight()),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=35717224;
 //BA.debugLineNum = 35717224;BA.debugLine="If i < 5 Then xcv.DrawLine(0,g_WeekNameProperti";
if (_i<5) { 
_xcv.DrawLine((float) (0),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),(float) (_parent.getWidth()),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));};
 }
};
RDebugUtils.currentLine=35717227;
 //BA.debugLineNum = 35717227;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumberP";
_xcv.DrawLine((float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0))))),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,(float) (_parent.getWidth()),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=35717229;
 //BA.debugLineNum = 35717229;BA.debugLine="xcv.Invalidate";
_xcv.Invalidate();
 };
RDebugUtils.currentLine=35717232;
 //BA.debugLineNum = 35717232;BA.debugLine="End Sub";
return "";
}
public int[]  _getargb(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=40632323;
 //BA.debugLineNum = 40632323;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=40632324;
 //BA.debugLineNum = 40632324;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=40632325;
 //BA.debugLineNum = 40632325;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=40632326;
 //BA.debugLineNum = 40632326;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=40632327;
 //BA.debugLineNum = 40632327;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Private Sub AddWeekName(xpnl_Background As B4XView";
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="Dim BlockHeight As Float = g_WeekNameProperties.H";
_blockheight = __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ;
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="Dim BlockWidth As Float = Floor(IIf(m_ShowWeekNum";
_blockwidth = (float) (__c.Floor((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : (((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))))))));
RDebugUtils.currentLine=35323909;
 //BA.debugLineNum = 35323909;BA.debugLine="Dim xlbl_WeekName As B4XView = CreateLabel(\"\")";
_xlbl_weekname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weekname = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=35323911;
 //BA.debugLineNum = 35323911;BA.debugLine="xlbl_WeekName.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_weekname.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=35323912;
 //BA.debugLineNum = 35323912;BA.debugLine="xlbl_WeekName.Text = Text";
_xlbl_weekname.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=35323913;
 //BA.debugLineNum = 35323913;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=35323914;
 //BA.debugLineNum = 35323914;BA.debugLine="xlbl_WeekName.Color = g_WeekNumberProperties.Col";
_xlbl_weekname.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=35323915;
 //BA.debugLineNum = 35323915;BA.debugLine="xlbl_WeekName.Font = g_WeekNumberProperties.xFon";
_xlbl_weekname.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=35323916;
 //BA.debugLineNum = 35323916;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNumberProperties";
_xlbl_weekname.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
 }else {
RDebugUtils.currentLine=35323918;
 //BA.debugLineNum = 35323918;BA.debugLine="xlbl_WeekName.Color = g_WeekNameProperties.Color";
_xlbl_weekname.setColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=35323919;
 //BA.debugLineNum = 35323919;BA.debugLine="xlbl_WeekName.Font = g_WeekNameProperties.xFont";
_xlbl_weekname.setFont(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=35323920;
 //BA.debugLineNum = 35323920;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNameProperties.T";
_xlbl_weekname.setTextColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=35323923;
 //BA.debugLineNum = 35323923;BA.debugLine="xpnl_Background.AddView(xlbl_WeekName,IIf(i = -1,";
_xpnl_background.AddView((android.view.View)(_xlbl_weekname.getObject()),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(0)) : ((Object)((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_i)))))),(int) (0),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(_blockwidth))))),(int) (_blockheight));
RDebugUtils.currentLine=35323924;
 //BA.debugLineNum = 35323924;BA.debugLine="End Sub";
return "";
}
public long  _getfirstdayofweek2(b4a.example.ef.as_datepicker __ref,long _ticks,int _firstdayofweek) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getfirstdayofweek2", true))
	 {return ((Long) Debug.delegate(ba, "getfirstdayofweek2", new Object[] {_ticks,_firstdayofweek}));}
b4a.example.dateutils._period _p = null;
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Public Sub GetFirstDayOfWeek2(Ticks As Long,FirstD";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="p.Days = -((DateTime.GetDayOfWeek(Ticks)+FirstDay";
_p.Days = (int) (-((__c.DateTime.GetDayOfWeek(_ticks)+_firstdayofweek)%7));
RDebugUtils.currentLine=40960003;
 //BA.debugLineNum = 40960003;BA.debugLine="Return DateUtils.AddPeriod(Ticks, p)";
if (true) return _dateutils._addperiod(ba,_ticks,_p);
RDebugUtils.currentLine=40960004;
 //BA.debugLineNum = 40960004;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=40697860;
 //BA.debugLineNum = 40697860;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Private Sub CreateSelectDates(xpnl_Date As B4XView";
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="For Each View As B4XView In xpnl_Date.GetAllViews";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _xpnl_date.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="Dim CurrentDay As Long = xpnl_Date.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_date.getTag());
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=36044809;
 //BA.debugLineNum = 36044809;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="CreateSelectedDate(xpnl_Date,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.True);
 }else 
{RDebugUtils.currentLine=36044811;
 //BA.debugLineNum = 36044811;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Selecte";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=36044812;
 //BA.debugLineNum = 36044812;BA.debugLine="CreateSelectedDate(xpnl_Date,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.False);
 }}
;
RDebugUtils.currentLine=36044815;
 //BA.debugLineNum = 36044815;BA.debugLine="For Each v As B4XView In xpnl_Date.GetAllViewsRe";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = _xpnl_date.GetAllViewsRecursive();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group12.Get(index12)));
RDebugUtils.currentLine=36044816;
 //BA.debugLineNum = 36044816;BA.debugLine="If \"RangeItem\" = v.Tag Then";
if (("RangeItem").equals(BA.ObjectToString(_v.getTag()))) { 
RDebugUtils.currentLine=36044817;
 //BA.debugLineNum = 36044817;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=36044818;
 //BA.debugLineNum = 36044818;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=36044822;
 //BA.debugLineNum = 36044822;BA.debugLine="If m_SelectedDate > 0 And m_SelectedDate2 > 0 An";
if (__ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0 && ((_currentday>=__ref._m_selecteddate /*long*/  && _currentday<=__ref._m_selecteddate2 /*long*/ ) || (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )))) { 
RDebugUtils.currentLine=36044823;
 //BA.debugLineNum = 36044823;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=36044824;
 //BA.debugLineNum = 36044824;BA.debugLine="xpnl_selected.Tag = \"RangeItem\"";
_xpnl_selected.setTag((Object)("RangeItem"));
RDebugUtils.currentLine=36044825;
 //BA.debugLineNum = 36044825;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDat";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ )) { 
RDebugUtils.currentLine=36044826;
 //BA.debugLineNum = 36044826;BA.debugLine="xpnl_Date.AddView(xpnl_selected,xpnl_Date.Widt";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_date.getWidth()/(double)2),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else 
{RDebugUtils.currentLine=36044827;
 //BA.debugLineNum = 36044827;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Select";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )) { 
RDebugUtils.currentLine=36044828;
 //BA.debugLineNum = 36044828;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else {
RDebugUtils.currentLine=36044830;
 //BA.debugLineNum = 36044830;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),_xpnl_date.getWidth(),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }}
;
RDebugUtils.currentLine=36044833;
 //BA.debugLineNum = 36044833;BA.debugLine="xpnl_selected.Color = xui.Color_ARGB(80,clr(1),";
_xpnl_selected.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),_clr[(int) (1)],_clr[(int) (2)],_clr[(int) (3)]));
RDebugUtils.currentLine=36044834;
 //BA.debugLineNum = 36044834;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 };
 }else {
RDebugUtils.currentLine=36044838;
 //BA.debugLineNum = 36044838;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=36044839;
 //BA.debugLineNum = 36044839;BA.debugLine="MonthDateClick(xpnl_Date,False)";
__ref._monthdateclick /*String*/ (null,_xpnl_date,__c.False);
 };
 };
RDebugUtils.currentLine=36044844;
 //BA.debugLineNum = 36044844;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate)";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || ((__ref._m_selectmode /*String*/ ).equals(__ref._getselectmode_range /*String*/ (null)) && _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ))) { 
RDebugUtils.currentLine=36044845;
 //BA.debugLineNum = 36044845;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedT";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
 }else {
RDebugUtils.currentLine=36044847;
 //BA.debugLineNum = 36044847;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=36044851;
 //BA.debugLineNum = 36044851;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Private Sub GetWeekNumberStartingFromMonday (ticks";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Dim WeekDayOfFirstDayOfYear As Int = DateTime.Get";
_weekdayoffirstdayofyear = (int) (__c.DateTime.GetDayOfWeek(_dateutils._setdate(ba,__c.DateTime.GetYear(_ticks),(int) (1),(int) (1)))-1);
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="Dim FirstMondayInYear As Int = (7 + WeekDayOfFirs";
_firstmondayinyear = (int) ((7+_weekdayoffirstdayofyear-1)%7);
RDebugUtils.currentLine=40894467;
 //BA.debugLineNum = 40894467;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=40894468;
 //BA.debugLineNum = 40894468;BA.debugLine="If WeekDayOfFirstDayOfYear <> 1 Then result = res";
if (_weekdayoffirstdayofyear!=1) { 
_result = (int) (_result-1);};
RDebugUtils.currentLine=40894469;
 //BA.debugLineNum = 40894469;BA.debugLine="result = result + Floor((DateTime.GetDayOfYear(ti";
_result = (int) (_result+__c.Floor((__c.DateTime.GetDayOfYear(_ticks)-1+_firstmondayinyear)/(double)7)+1);
RDebugUtils.currentLine=40894470;
 //BA.debugLineNum = 40894470;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=40894471;
 //BA.debugLineNum = 40894471;BA.debugLine="End Sub";
return 0;
}
public String  _customdrawday(b4a.example.ef.as_datepicker __ref,long _date,anywheresoftware.b4a.objects.B4XViewWrapper _backgroundpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawday", true))
	 {return ((String) Debug.delegate(ba, "customdrawday", new Object[] {_date,_backgroundpanel}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawday _m_customdrawday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub CustomDrawDay(Date As Long,BackgroundP";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(int) (2))) { 
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="Dim m_CustomDrawDay As ASDatePicker_CustomDrawDa";
_m_customdrawday = new b4a.example.ef.as_datepicker._asdatepicker_customdrawday();
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="m_CustomDrawDay.Initialize";
_m_customdrawday.Initialize();
RDebugUtils.currentLine=39714821;
 //BA.debugLineNum = 39714821;BA.debugLine="m_CustomDrawDay.BackgroundPanel = BackgroundPane";
_m_customdrawday.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _backgroundpanel;
RDebugUtils.currentLine=39714823;
 //BA.debugLineNum = 39714823;BA.debugLine="For Each View As B4XView In BackgroundPanel.GetA";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _backgroundpanel.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=39714825;
 //BA.debugLineNum = 39714825;BA.debugLine="If \"xlbl_Date\" = View.Tag Then";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
RDebugUtils.currentLine=39714826;
 //BA.debugLineNum = 39714826;BA.debugLine="m_CustomDrawDay.xlbl_Date = View";
_m_customdrawday.xlbl_Date /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
 };
 }
};
RDebugUtils.currentLine=39714831;
 //BA.debugLineNum = 39714831;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawDay";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(Object)(_date),(Object)(_m_customdrawday));
 };
RDebugUtils.currentLine=39714833;
 //BA.debugLineNum = 39714833;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Private Sub AddYear(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="Dim BlockHeight As Float = xpnl_ViewPager.Height/";
_blockheight = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="Dim BlockWidth As Float = xpnl_ViewPager.Width/3";
_blockwidth = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3);
RDebugUtils.currentLine=35782661;
 //BA.debugLineNum = 35782661;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=35782663;
 //BA.debugLineNum = 35782663;BA.debugLine="For i = 1 To 13 -1";
{
final int step4 = 1;
final int limit4 = (int) (13-1);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=35782667;
 //BA.debugLineNum = 35782667;BA.debugLine="Dim Rest As Int = (i-1)/3";
_rest = (int) ((_i-1)/(double)3);
RDebugUtils.currentLine=35782668;
 //BA.debugLineNum = 35782668;BA.debugLine="Dim test As Int = (i-1) Mod 3";
_test = (int) ((_i-1)%3);
RDebugUtils.currentLine=35782670;
 //BA.debugLineNum = 35782670;BA.debugLine="Dim Text As String = \"\"";
_text = "";
RDebugUtils.currentLine=35782671;
 //BA.debugLineNum = 35782671;BA.debugLine="Dim xpnl_Date As B4XView";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35782672;
 //BA.debugLineNum = 35782672;BA.debugLine="Dim SelectThisPanel As Boolean = False";
_selectthispanel = __c.False;
RDebugUtils.currentLine=35782673;
 //BA.debugLineNum = 35782673;BA.debugLine="If m_CurrentView = getCurrentView_YearView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=35782674;
 //BA.debugLineNum = 35782674;BA.debugLine="Text = GetMonthNameByIndex(i)";
_text = __ref._getmonthnamebyindex /*String*/ (null,_i);
RDebugUtils.currentLine=35782675;
 //BA.debugLineNum = 35782675;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_YearMonth\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_YearMonth");
RDebugUtils.currentLine=35782676;
 //BA.debugLineNum = 35782676;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,__c.DateTime.GetYear(_currentdate),_i,(int) (1))));
RDebugUtils.currentLine=35782677;
 //BA.debugLineNum = 35782677;BA.debugLine="If DateTime.GetMonth(xpnl_Date.Tag) = DateTime.";
if (__c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetMonth(__c.DateTime.getNow()) && __c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=35782679;
 //BA.debugLineNum = 35782679;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_mindate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=35782680;
 //BA.debugLineNum = 35782680;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=35782683;
 //BA.debugLineNum = 35782683;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=35782684;
 //BA.debugLineNum = 35782684;BA.debugLine="Text = DateTime.GetYear(CurrentDate)+(i-1)";
_text = BA.NumberToString(__c.DateTime.GetYear(_currentdate)+(_i-1));
RDebugUtils.currentLine=35782685;
 //BA.debugLineNum = 35782685;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_DecadeYear\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_DecadeYear");
RDebugUtils.currentLine=35782686;
 //BA.debugLineNum = 35782686;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*1),(int) (1),(int) (1))));
RDebugUtils.currentLine=35782687;
 //BA.debugLineNum = 35782687;BA.debugLine="If DateTime.GetYear(xpnl_Date.Tag) = DateTime.G";
if (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=35782689;
 //BA.debugLineNum = 35782689;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And ((DateT";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && ((__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=35782690;
 //BA.debugLineNum = 35782690;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=35782693;
 //BA.debugLineNum = 35782693;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVi";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=35782694;
 //BA.debugLineNum = 35782694;BA.debugLine="Text = (DateTime.GetYear(CurrentDate)+(i-1)*10)";
_text = BA.NumberToString((__c.DateTime.GetYear(_currentdate)+(_i-1)*10))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9));
RDebugUtils.currentLine=35782695;
 //BA.debugLineNum = 35782695;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_CenturyDecade";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_CenturyDecade");
RDebugUtils.currentLine=35782696;
 //BA.debugLineNum = 35782696;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*10),(int) (1),(int) (1))));
RDebugUtils.currentLine=35782697;
 //BA.debugLineNum = 35782697;BA.debugLine="If DateTime.GetYear(DateTime.Now) >= (DateTime.";
if (__c.DateTime.GetYear(__c.DateTime.getNow())>=(__c.DateTime.GetYear(_currentdate)+(_i-1)*10) && __c.DateTime.GetYear(__c.DateTime.getNow())<=((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=35782704;
 //BA.debugLineNum = 35782704;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) || ((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=35782705;
 //BA.debugLineNum = 35782705;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }}}
;
RDebugUtils.currentLine=35782710;
 //BA.debugLineNum = 35782710;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35782711;
 //BA.debugLineNum = 35782711;BA.debugLine="Parent.AddView(xpnl_Date,BlockWidth*test,BlockHe";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) (_blockwidth*_test),(int) (_blockheight*_rest),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=35782712;
 //BA.debugLineNum = 35782712;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=35782714;
 //BA.debugLineNum = 35782714;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=35782715;
 //BA.debugLineNum = 35782715;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=35782716;
 //BA.debugLineNum = 35782716;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=35782718;
 //BA.debugLineNum = 35782718;BA.debugLine="xlbl_Date.Text = Text";
_xlbl_date.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=35782720;
 //BA.debugLineNum = 35782720;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=35782722;
 //BA.debugLineNum = 35782722;BA.debugLine="If SelectThisPanel Then";
if (_selectthispanel) { 
RDebugUtils.currentLine=35782723;
 //BA.debugLineNum = 35782723;BA.debugLine="Dim xpnl_Current As B4XView = xui.CreatePanel(\"";
_xpnl_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_current = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35782724;
 //BA.debugLineNum = 35782724;BA.debugLine="Dim StrokeWidth As Float = 2dip";
_strokewidth = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=35782725;
 //BA.debugLineNum = 35782725;BA.debugLine="xpnl_Date.AddView(xpnl_Current,StrokeWidth,Stro";
_xpnl_date.AddView((android.view.View)(_xpnl_current.getObject()),(int) (_strokewidth),(int) (_strokewidth),(int) (_blockwidth-_strokewidth*2),(int) (_blockheight-_strokewidth*2));
RDebugUtils.currentLine=35782727;
 //BA.debugLineNum = 35782727;BA.debugLine="xpnl_Current.SetColorAndBorder(xui.Color_Transp";
_xpnl_current.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (_strokewidth),__ref._m_currentdatecolor /*int*/ ,__c.DipToCurrent((int) (5)));
 };
 }
};
RDebugUtils.currentLine=35782731;
 //BA.debugLineNum = 35782731;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_yearview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_yearview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_yearview", null));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub getCurrentView_YearView As String";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Return \"YearView\"";
if (true) return "YearView";
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="End Sub";
return "";
}
public String  _getmonthnamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getmonthnamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Private Sub GetMonthNameByIndex(index As Int) As S";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="If index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="Return g_MonthNameShort.January";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .January /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828931;
 //BA.debugLineNum = 40828931;BA.debugLine="else If index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=40828932;
 //BA.debugLineNum = 40828932;BA.debugLine="Return g_MonthNameShort.February";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .February /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828933;
 //BA.debugLineNum = 40828933;BA.debugLine="else If index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=40828934;
 //BA.debugLineNum = 40828934;BA.debugLine="Return g_MonthNameShort.March";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .March /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828935;
 //BA.debugLineNum = 40828935;BA.debugLine="else If index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=40828936;
 //BA.debugLineNum = 40828936;BA.debugLine="Return g_MonthNameShort.April";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .April /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828937;
 //BA.debugLineNum = 40828937;BA.debugLine="else If index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=40828938;
 //BA.debugLineNum = 40828938;BA.debugLine="Return g_MonthNameShort.May";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .May /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828939;
 //BA.debugLineNum = 40828939;BA.debugLine="else If index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=40828940;
 //BA.debugLineNum = 40828940;BA.debugLine="Return g_MonthNameShort.June";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .June /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828941;
 //BA.debugLineNum = 40828941;BA.debugLine="else If index = 7 Then";
if (_index==7) { 
RDebugUtils.currentLine=40828942;
 //BA.debugLineNum = 40828942;BA.debugLine="Return g_MonthNameShort.July";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .July /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828943;
 //BA.debugLineNum = 40828943;BA.debugLine="else If index = 8 Then";
if (_index==8) { 
RDebugUtils.currentLine=40828944;
 //BA.debugLineNum = 40828944;BA.debugLine="Return g_MonthNameShort.August";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .August /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828945;
 //BA.debugLineNum = 40828945;BA.debugLine="else If index = 9 Then";
if (_index==9) { 
RDebugUtils.currentLine=40828946;
 //BA.debugLineNum = 40828946;BA.debugLine="Return g_MonthNameShort.September";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .September /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828947;
 //BA.debugLineNum = 40828947;BA.debugLine="else If index = 10 Then";
if (_index==10) { 
RDebugUtils.currentLine=40828948;
 //BA.debugLineNum = 40828948;BA.debugLine="Return g_MonthNameShort.October";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .October /*String*/ ;
 }else 
{RDebugUtils.currentLine=40828949;
 //BA.debugLineNum = 40828949;BA.debugLine="else If index = 11 Then";
if (_index==11) { 
RDebugUtils.currentLine=40828950;
 //BA.debugLineNum = 40828950;BA.debugLine="Return g_MonthNameShort.November";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .November /*String*/ ;
 }else {
RDebugUtils.currentLine=40828952;
 //BA.debugLineNum = 40828952;BA.debugLine="Return g_MonthNameShort.December";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .December /*String*/ ;
 }}}}}}}}}}}
;
RDebugUtils.currentLine=40828954;
 //BA.debugLineNum = 40828954;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_decadeview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_decadeview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_decadeview", null));}
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Public Sub getCurrentView_DecadeView As String";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Return \"DecadeView\"";
if (true) return "DecadeView";
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_centuryview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_centuryview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_centuryview", null));}
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Public Sub getCurrentView_CenturyView As String";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Return \"CenturyView\"";
if (true) return "CenturyView";
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="xiv_RefreshImage.SetLayoutAnimated(0,0,0,Width,He";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="xpnl_Header.SetLayoutAnimated(0,0,0,Width,g_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="xpnl_ViewPager.SetLayoutAnimated(0,0,g_HeaderProp";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),(int) (_width),(int) (_height-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="xASVP_Main.Base_Resize(Width,xpnl_ViewPager.Heigh";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._base_resize /*void*/ (null,_width,__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35192839;
 //BA.debugLineNum = 35192839;BA.debugLine="xpnl_Header.GetView(0).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35192840;
 //BA.debugLineNum = 35192840;BA.debugLine="xpnl_Header.GetView(1).SetLayoutAnimated(0,0,0,xp";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35192841;
 //BA.debugLineNum = 35192841;BA.debugLine="xpnl_Header.GetView(2).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2)).SetLayoutAnimated((int) (0),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35192843;
 //BA.debugLineNum = 35192843;BA.debugLine="xASVP_Main.ResetLazyLoadingPanels";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingpanels /*String*/ (null);
RDebugUtils.currentLine=35192844;
 //BA.debugLineNum = 35192844;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "base_resize"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=35192845;
 //BA.debugLineNum = 35192845;BA.debugLine="xASVP_Main.ResetLazyloadingIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingindex /*String*/ (null);
RDebugUtils.currentLine=35192846;
 //BA.debugLineNum = 35192846;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=35192847;
 //BA.debugLineNum = 35192847;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,True)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.True);
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="m_CurrentView = NewView";
__ref._m_currentview /*String*/  = _newview;
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "changeview"),(int) (250));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="Select Case NewView";
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
RDebugUtils.currentLine=35848199;
 //BA.debugLineNum = 35848199;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=35848201;
 //BA.debugLineNum = 35848201;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=35848203;
 //BA.debugLineNum = 35848203;BA.debugLine="CreateDecadeView";
__ref._createdecadeview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=35848205;
 //BA.debugLineNum = 35848205;BA.debugLine="CreateCenturyView";
__ref._createcenturyview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=35848207;
 //BA.debugLineNum = 35848207;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
RDebugUtils.currentLine=35848208;
 //BA.debugLineNum = 35848208;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Public Sub getCurrentView_MonthView As String";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Return \"MonthView\"";
if (true) return "MonthView";
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="Dim YearGap As Int = 1";
_yeargap = (int) (1);
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="Dim StartDate As Long = DateUtils.SetDate(DateTim";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="Dim Enddate As Long = DateUtils.SetDate(DateTime.";
_enddate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=35454983;
 //BA.debugLineNum = 35454983;BA.debugLine="If m_MinDate > 0 Then StartDate = m_MinDate";
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
RDebugUtils.currentLine=35454984;
 //BA.debugLineNum = 35454984;BA.debugLine="Dim NumberOfMonths As Int = IIf(m_MaxDate=0, Mont";
_numberofmonths = (int)(BA.ObjectToNumber(((__ref._m_maxdate /*long*/ ==0) ? ((Object)(__ref._monthbetween /*int*/ (null,_startdate,_enddate))) : ((Object)(0)))));
RDebugUtils.currentLine=35454986;
 //BA.debugLineNum = 35454986;BA.debugLine="If m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=35454987;
 //BA.debugLineNum = 35454987;BA.debugLine="Dim MonthsBetween As Int = MonthBetween(StartDat";
_monthsbetween = __ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ );
RDebugUtils.currentLine=35454988;
 //BA.debugLineNum = 35454988;BA.debugLine="Dim tmp As Period";
_tmp = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35454989;
 //BA.debugLineNum = 35454989;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
RDebugUtils.currentLine=35454990;
 //BA.debugLineNum = 35454990;BA.debugLine="tmp.Months = MonthsBetween";
_tmp.Months = _monthsbetween;
RDebugUtils.currentLine=35454991;
 //BA.debugLineNum = 35454991;BA.debugLine="If DateUtils.AddPeriod(StartDate,tmp) < m_MaxDat";
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
RDebugUtils.currentLine=35454992;
 //BA.debugLineNum = 35454992;BA.debugLine="NumberOfMonths = Max(MonthsBetween,1)";
_numberofmonths = (int) (parent.__c.Max(_monthsbetween,1));
 if (true) break;
;
RDebugUtils.currentLine=35454995;
 //BA.debugLineNum = 35454995;BA.debugLine="For i = 0 To NumberOfMonths -1";

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
RDebugUtils.currentLine=35454997;
 //BA.debugLineNum = 35454997;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35454998;
 //BA.debugLineNum = 35454998;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35454999;
 //BA.debugLineNum = 35454999;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35455001;
 //BA.debugLineNum = 35455001;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35455002;
 //BA.debugLineNum = 35455002;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=35455003;
 //BA.debugLineNum = 35455003;BA.debugLine="p2.Months = i";
_p2.Months = _i;
RDebugUtils.currentLine=35455005;
 //BA.debugLineNum = 35455005;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=35455006;
 //BA.debugLineNum = 35455006;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate(";
_firstdayofmonth = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(_currenttime),parent.__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=35455008;
 //BA.debugLineNum = 35455008;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfMon";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
RDebugUtils.currentLine=35455010;
 //BA.debugLineNum = 35455010;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=35455016;
 //BA.debugLineNum = 35455016;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=35455021;
 //BA.debugLineNum = 35455021;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=35455022;
 //BA.debugLineNum = 35455022;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=35455024;
 //BA.debugLineNum = 35455024;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=35455025;
 //BA.debugLineNum = 35455025;BA.debugLine="m_isReady = True";
__ref._m_isready /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=35455108;
 //BA.debugLineNum = 35455108;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Dim YearGap As Int = 10";
_yeargap = (int) (10);
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="StartDate =	DateUtils.SetDate(DateTime.GetYear(m";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),(int) (1),(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=35520523;
 //BA.debugLineNum = 35520523;BA.debugLine="Dim FirstDateOfFuture As Long = DateUtils.SetDate";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
RDebugUtils.currentLine=35520525;
 //BA.debugLineNum = 35520525;BA.debugLine="Dim NumberOfYears As Int";
_numberofyears = 0;
RDebugUtils.currentLine=35520527;
 //BA.debugLineNum = 35520527;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=35520528;
 //BA.debugLineNum = 35520528;BA.debugLine="NumberOfYears = MonthBetween(StartDate,FirstDate";
_numberofyears = (int) (__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=35520530;
 //BA.debugLineNum = 35520530;BA.debugLine="Dim YearsBetween As Int = Ceil(MonthBetween(Star";
_yearsbetween = (int) (parent.__c.Ceil(__ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ )/(double)12));
RDebugUtils.currentLine=35520531;
 //BA.debugLineNum = 35520531;BA.debugLine="NumberOfYears = Max(YearsBetween,1)";
_numberofyears = (int) (parent.__c.Max(_yearsbetween,1));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=35520534;
 //BA.debugLineNum = 35520534;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=35520540;
 //BA.debugLineNum = 35520540;BA.debugLine="For i = 0 To NumberOfYears -1";
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
RDebugUtils.currentLine=35520542;
 //BA.debugLineNum = 35520542;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35520543;
 //BA.debugLineNum = 35520543;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35520544;
 //BA.debugLineNum = 35520544;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35520546;
 //BA.debugLineNum = 35520546;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35520547;
 //BA.debugLineNum = 35520547;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=35520548;
 //BA.debugLineNum = 35520548;BA.debugLine="p2.Years = i";
_p2.Years = _i;
RDebugUtils.currentLine=35520550;
 //BA.debugLineNum = 35520550;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=35520553;
 //BA.debugLineNum = 35520553;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=35520555;
 //BA.debugLineNum = 35520555;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=35520561;
 //BA.debugLineNum = 35520561;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createyearview"),(int) (0));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=35520571;
 //BA.debugLineNum = 35520571;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=35520572;
 //BA.debugLineNum = 35520572;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=35520574;
 //BA.debugLineNum = 35520574;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="Dim CurrentDecade As Long = DateUtils.SetDate(Dat";
_currentdecade = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ ),(int) (1),(int) (1))),(int) (1),(int) (1));
RDebugUtils.currentLine=35586056;
 //BA.debugLineNum = 35586056;BA.debugLine="Dim YearGap As Int = 50";
_yeargap = (int) (50);
RDebugUtils.currentLine=35586058;
 //BA.debugLineNum = 35586058;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=35586059;
 //BA.debugLineNum = 35586059;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=35586060;
 //BA.debugLineNum = 35586060;BA.debugLine="StartDate =	DateUtils.SetDate(1400,12,31)";
_startdate = parent._dateutils._setdate(ba,(int) (1400),(int) (12),(int) (31));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=35586062;
 //BA.debugLineNum = 35586062;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=35586065;
 //BA.debugLineNum = 35586065;BA.debugLine="Dim FirstDateOfFuture As Long";
_firstdateoffuture = 0L;
RDebugUtils.currentLine=35586066;
 //BA.debugLineNum = 35586066;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=35586067;
 //BA.debugLineNum = 35586067;BA.debugLine="FirstDateOfFuture = DateUtils.SetDate(DateTime.G";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=35586069;
 //BA.debugLineNum = 35586069;BA.debugLine="FirstDateOfFuture = m_MaxDate";
_firstdateoffuture = __ref._m_maxdate /*long*/ ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=35586073;
 //BA.debugLineNum = 35586073;BA.debugLine="Dim NumberOfDecades As Int = Ceil(Max((MonthBetwe";
_numberofdecades = (int) (parent.__c.Ceil(parent.__c.Max((__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12)/(double)10,1)));
RDebugUtils.currentLine=35586075;
 //BA.debugLineNum = 35586075;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=35586081;
 //BA.debugLineNum = 35586081;BA.debugLine="For i = 0 To NumberOfDecades -1";
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
RDebugUtils.currentLine=35586083;
 //BA.debugLineNum = 35586083;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35586084;
 //BA.debugLineNum = 35586084;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35586085;
 //BA.debugLineNum = 35586085;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35586087;
 //BA.debugLineNum = 35586087;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35586088;
 //BA.debugLineNum = 35586088;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=35586089;
 //BA.debugLineNum = 35586089;BA.debugLine="p2.Years = i*10";
_p2.Years = (int) (_i*10);
RDebugUtils.currentLine=35586091;
 //BA.debugLineNum = 35586091;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=35586094;
 //BA.debugLineNum = 35586094;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=35586096;
 //BA.debugLineNum = 35586096;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=35586098;
 //BA.debugLineNum = 35586098;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=35586102;
 //BA.debugLineNum = 35586102;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createdecadeview"),(int) (0));
this.state = 31;
return;
case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=35586103;
 //BA.debugLineNum = 35586103;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=35586104;
 //BA.debugLineNum = 35586104;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=35586106;
 //BA.debugLineNum = 35586106;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="Dim CurrentCenturyStart As Long = DateUtils.SetDa";
_currentcenturystart = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-parent.__c.Round(((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100)-((int) ((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100))))*100)),(int) (1),(int) (1));
RDebugUtils.currentLine=35651590;
 //BA.debugLineNum = 35651590;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="Dim FirstDateOfPast As Long = DateUtils.SetDate(1";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (1),(int) (1),(int) (1));
RDebugUtils.currentLine=35651595;
 //BA.debugLineNum = 35651595;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=35651596;
 //BA.debugLineNum = 35651596;BA.debugLine="If m_MinDate > 0 Then";
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
RDebugUtils.currentLine=35651597;
 //BA.debugLineNum = 35651597;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_mindate /*long*/ )-40),(int) (1),(int) (1));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=35651599;
 //BA.debugLineNum = 35651599;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
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
RDebugUtils.currentLine=35651616;
 //BA.debugLineNum = 35651616;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=35651622;
 //BA.debugLineNum = 35651622;BA.debugLine="Dim NumberOfCentries As Int = 80";
_numberofcentries = (int) (80);
RDebugUtils.currentLine=35651623;
 //BA.debugLineNum = 35651623;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then NumberOfCe";
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
RDebugUtils.currentLine=35651625;
 //BA.debugLineNum = 35651625;BA.debugLine="For i = 0 To NumberOfCentries -1";
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
RDebugUtils.currentLine=35651627;
 //BA.debugLineNum = 35651627;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35651628;
 //BA.debugLineNum = 35651628;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35651629;
 //BA.debugLineNum = 35651629;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35651631;
 //BA.debugLineNum = 35651631;BA.debugLine="p.Years = i*10*12";
_p.Years = (int) (_i*10*12);
RDebugUtils.currentLine=35651632;
 //BA.debugLineNum = 35651632;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(Fi";
_currenttime = parent._dateutils._addperiod(ba,_firstdateofpast,_p);
RDebugUtils.currentLine=35651633;
 //BA.debugLineNum = 35651633;BA.debugLine="If i > 0 Then";
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
RDebugUtils.currentLine=35651634;
 //BA.debugLineNum = 35651634;BA.debugLine="CurrentTime = DateUtils.SetDate((DateTime.GetYe";
_currenttime = parent._dateutils._setdate(ba,(int) ((parent.__c.DateTime.GetYear(_currenttime)-parent.__c.Round(((parent.__c.DateTime.GetYear(_currenttime)/(double)100)-((int) ((parent.__c.DateTime.GetYear(_currenttime)/(double)100))))*100))+1),(int) (1),(int) (1));
RDebugUtils.currentLine=35651635;
 //BA.debugLineNum = 35651635;BA.debugLine="If DateTime.GetMonth(CurrentTime) = 1 Then";
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
RDebugUtils.currentLine=35651636;
 //BA.debugLineNum = 35651636;BA.debugLine="CurrentTime = DateUtils.SetDate(DateTime.GetYe";
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
RDebugUtils.currentLine=35651641;
 //BA.debugLineNum = 35651641;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=35651643;
 //BA.debugLineNum = 35651643;BA.debugLine="If DateTime.GetYear(CurrentCenturyStart) = DateT";
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
RDebugUtils.currentLine=35651649;
 //BA.debugLineNum = 35651649;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createcenturyview"),(int) (0));
this.state = 37;
return;
case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=35651650;
 //BA.debugLineNum = 35651650;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=35651651;
 //BA.debugLineNum = 35651651;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=35651653;
 //BA.debugLineNum = 35651653;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="Type ASDatePicker_MonthNameShort(January As Strin";
;
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="Type ASDatePicker_WeekNameShort(Monday As String,";
;
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="Type ASDatePicker_HeaderProperties(Height As Floa";
;
RDebugUtils.currentLine=34668550;
 //BA.debugLineNum = 34668550;BA.debugLine="Type ASDatePicker_BodyProperties(xFont As B4XFont";
;
RDebugUtils.currentLine=34668551;
 //BA.debugLineNum = 34668551;BA.debugLine="Type ASDatePicker_CustomDrawDay(BackgroundPanel A";
;
RDebugUtils.currentLine=34668552;
 //BA.debugLineNum = 34668552;BA.debugLine="Type ASDatePicker_CustomDrawHeader(BackgroundPane";
;
RDebugUtils.currentLine=34668553;
 //BA.debugLineNum = 34668553;BA.debugLine="Type ASDatePicker_WeekNumberProperties(Width As F";
;
RDebugUtils.currentLine=34668554;
 //BA.debugLineNum = 34668554;BA.debugLine="Type ASDatePicker_WeekNameProperties(Color As Int";
;
RDebugUtils.currentLine=34668556;
 //BA.debugLineNum = 34668556;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=34668557;
 //BA.debugLineNum = 34668557;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=34668558;
 //BA.debugLineNum = 34668558;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34668559;
 //BA.debugLineNum = 34668559;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=34668560;
 //BA.debugLineNum = 34668560;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=34668562;
 //BA.debugLineNum = 34668562;BA.debugLine="Private m_isReady As Boolean = False";
_m_isready = __c.False;
RDebugUtils.currentLine=34668564;
 //BA.debugLineNum = 34668564;BA.debugLine="Private g_HeaderProperties As ASDatePicker_Header";
_g_headerproperties = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=34668565;
 //BA.debugLineNum = 34668565;BA.debugLine="Private g_BodyProperties As ASDatePicker_BodyProp";
_g_bodyproperties = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=34668567;
 //BA.debugLineNum = 34668567;BA.debugLine="Private g_MonthNameShort As ASDatePicker_MonthNam";
_g_monthnameshort = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=34668568;
 //BA.debugLineNum = 34668568;BA.debugLine="Private g_WeekNameShort As ASDatePicker_WeekNameS";
_g_weeknameshort = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=34668569;
 //BA.debugLineNum = 34668569;BA.debugLine="Private g_WeekNumberProperties As ASDatePicker_We";
_g_weeknumberproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=34668570;
 //BA.debugLineNum = 34668570;BA.debugLine="Private g_WeekNameProperties As ASDatePicker_Week";
_g_weeknameproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=34668572;
 //BA.debugLineNum = 34668572;BA.debugLine="Private xASVP_Main As ASViewPager";
_xasvp_main = new b4a.example.ef.asviewpager();
RDebugUtils.currentLine=34668574;
 //BA.debugLineNum = 34668574;BA.debugLine="Private xpnl_LoadingPanel As B4XView";
_xpnl_loadingpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34668575;
 //BA.debugLineNum = 34668575;BA.debugLine="Private xpnl_Header As B4XView";
_xpnl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34668576;
 //BA.debugLineNum = 34668576;BA.debugLine="Private xpnl_ViewPager As B4XView";
_xpnl_viewpager = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34668577;
 //BA.debugLineNum = 34668577;BA.debugLine="Private xpnl_SelectedDate As B4XView";
_xpnl_selecteddate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34668578;
 //BA.debugLineNum = 34668578;BA.debugLine="Private xpnl_SelectedDate2 As B4XView";
_xpnl_selecteddate2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34668583;
 //BA.debugLineNum = 34668583;BA.debugLine="Private m_HeaderColor As Int";
_m_headercolor = 0;
RDebugUtils.currentLine=34668584;
 //BA.debugLineNum = 34668584;BA.debugLine="Private m_BodyColor As Int";
_m_bodycolor = 0;
RDebugUtils.currentLine=34668585;
 //BA.debugLineNum = 34668585;BA.debugLine="Private m_CurrentDateColor As Int";
_m_currentdatecolor = 0;
RDebugUtils.currentLine=34668586;
 //BA.debugLineNum = 34668586;BA.debugLine="Private m_SelectedDateColor As Int";
_m_selecteddatecolor = 0;
RDebugUtils.currentLine=34668587;
 //BA.debugLineNum = 34668587;BA.debugLine="Private m_MouseHoverFeedback As Boolean 'Ignore";
_m_mousehoverfeedback = false;
RDebugUtils.currentLine=34668588;
 //BA.debugLineNum = 34668588;BA.debugLine="Private m_SelectedDate As Long";
_m_selecteddate = 0L;
RDebugUtils.currentLine=34668589;
 //BA.debugLineNum = 34668589;BA.debugLine="Private m_SelectedDate2 As Long";
_m_selecteddate2 = 0L;
RDebugUtils.currentLine=34668590;
 //BA.debugLineNum = 34668590;BA.debugLine="Private m_ShowWeekNumbers As Boolean";
_m_showweeknumbers = false;
RDebugUtils.currentLine=34668591;
 //BA.debugLineNum = 34668591;BA.debugLine="Private m_FirstDayOfWeek As Int = 5 'Monday";
_m_firstdayofweek = (int) (5);
RDebugUtils.currentLine=34668592;
 //BA.debugLineNum = 34668592;BA.debugLine="Private m_ShowGridLines As Boolean";
_m_showgridlines = false;
RDebugUtils.currentLine=34668593;
 //BA.debugLineNum = 34668593;BA.debugLine="Private m_GridLineColor As Int";
_m_gridlinecolor = 0;
RDebugUtils.currentLine=34668594;
 //BA.debugLineNum = 34668594;BA.debugLine="Private m_ThemeChangeTransition As String";
_m_themechangetransition = "";
RDebugUtils.currentLine=34668596;
 //BA.debugLineNum = 34668596;BA.debugLine="Private m_CurrentView As String";
_m_currentview = "";
RDebugUtils.currentLine=34668597;
 //BA.debugLineNum = 34668597;BA.debugLine="Private m_StartDate As Long";
_m_startdate = 0L;
RDebugUtils.currentLine=34668598;
 //BA.debugLineNum = 34668598;BA.debugLine="Private m_InactiveDaysVisible As Boolean";
_m_inactivedaysvisible = false;
RDebugUtils.currentLine=34668599;
 //BA.debugLineNum = 34668599;BA.debugLine="Private m_MinDate,m_MaxDate As Long";
_m_mindate = 0L;
_m_maxdate = 0L;
RDebugUtils.currentLine=34668600;
 //BA.debugLineNum = 34668600;BA.debugLine="Private m_SelectMode As String";
_m_selectmode = "";
RDebugUtils.currentLine=34668602;
 //BA.debugLineNum = 34668602;BA.debugLine="Private xiv_RefreshImage As B4XView";
_xiv_refreshimage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=34668604;
 //BA.debugLineNum = 34668604;BA.debugLine="Type AS_DatePicker_Theme(SelectedTextColor As Int";
;
RDebugUtils.currentLine=34668606;
 //BA.debugLineNum = 34668606;BA.debugLine="End Sub";
return "";
}
public String  _clearselections(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "clearselections", true))
	 {return ((String) Debug.delegate(ba, "clearselections", null));}
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Public Sub ClearSelections";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _createasdatepicker_bodyproperties(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,int _selectedtextcolor,float _currentandselecteddayheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_bodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "createasdatepicker_bodyproperties", new Object[] {_xfont,_textcolor,_selectedtextcolor,_currentandselecteddayheight}));}
b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _t1 = null;
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub CreateASDatePicker_BodyProperties (xFon";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Dim t1 As ASDatePicker_BodyProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=41484293;
 //BA.debugLineNum = 41484293;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
_t1.SelectedTextColor /*int*/  = _selectedtextcolor;
RDebugUtils.currentLine=41484294;
 //BA.debugLineNum = 41484294;BA.debugLine="t1.CurrentAndSelectedDayHeight = CurrentAndSelect";
_t1.CurrentAndSelectedDayHeight /*float*/  = _currentandselecteddayheight;
RDebugUtils.currentLine=41484295;
 //BA.debugLineNum = 41484295;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=41484296;
 //BA.debugLineNum = 41484296;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _createasdatepicker_headerproperties(b4a.example.ef.as_datepicker __ref,float _height,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _buttoniconsize,boolean _arrowsvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_headerproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "createasdatepicker_headerproperties", new Object[] {_height,_xfont,_textcolor,_buttoniconsize,_arrowsvisible}));}
b4a.example.ef.as_datepicker._asdatepicker_headerproperties _t1 = null;
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Public Sub CreateASDatePicker_HeaderProperties (He";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Dim t1 As ASDatePicker_HeaderProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=41353220;
 //BA.debugLineNum = 41353220;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=41353221;
 //BA.debugLineNum = 41353221;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=41353222;
 //BA.debugLineNum = 41353222;BA.debugLine="t1.ButtonIconSize = ButtonIconSize";
_t1.ButtonIconSize /*float*/  = _buttoniconsize;
RDebugUtils.currentLine=41353223;
 //BA.debugLineNum = 41353223;BA.debugLine="t1.ArrowsVisible = ArrowsVisible";
_t1.ArrowsVisible /*boolean*/  = _arrowsvisible;
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=41353225;
 //BA.debugLineNum = 41353225;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _createasdatepicker_monthnameshort(b4a.example.ef.as_datepicker __ref,String _january,String _february,String _march,String _april,String _may,String _june,String _july,String _august,String _september,String _october,String _november,String _december) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_monthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "createasdatepicker_monthnameshort", new Object[] {_january,_february,_march,_april,_may,_june,_july,_august,_september,_october,_november,_december}));}
b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _t1 = null;
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Public Sub CreateASDatePicker_MonthNameShort (Janu";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="Dim t1 As ASDatePicker_MonthNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="t1.January = January";
_t1.January /*String*/  = _january;
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="t1.February = February";
_t1.February /*String*/  = _february;
RDebugUtils.currentLine=41156613;
 //BA.debugLineNum = 41156613;BA.debugLine="t1.March = March";
_t1.March /*String*/  = _march;
RDebugUtils.currentLine=41156614;
 //BA.debugLineNum = 41156614;BA.debugLine="t1.April = April";
_t1.April /*String*/  = _april;
RDebugUtils.currentLine=41156615;
 //BA.debugLineNum = 41156615;BA.debugLine="t1.May = May";
_t1.May /*String*/  = _may;
RDebugUtils.currentLine=41156616;
 //BA.debugLineNum = 41156616;BA.debugLine="t1.June = June";
_t1.June /*String*/  = _june;
RDebugUtils.currentLine=41156617;
 //BA.debugLineNum = 41156617;BA.debugLine="t1.July = July";
_t1.July /*String*/  = _july;
RDebugUtils.currentLine=41156618;
 //BA.debugLineNum = 41156618;BA.debugLine="t1.August = August";
_t1.August /*String*/  = _august;
RDebugUtils.currentLine=41156619;
 //BA.debugLineNum = 41156619;BA.debugLine="t1.September = September";
_t1.September /*String*/  = _september;
RDebugUtils.currentLine=41156620;
 //BA.debugLineNum = 41156620;BA.debugLine="t1.October = October";
_t1.October /*String*/  = _october;
RDebugUtils.currentLine=41156621;
 //BA.debugLineNum = 41156621;BA.debugLine="t1.November = November";
_t1.November /*String*/  = _november;
RDebugUtils.currentLine=41156622;
 //BA.debugLineNum = 41156622;BA.debugLine="t1.December = December";
_t1.December /*String*/  = _december;
RDebugUtils.currentLine=41156623;
 //BA.debugLineNum = 41156623;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=41156624;
 //BA.debugLineNum = 41156624;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _createasdatepicker_weeknameproperties(b4a.example.ef.as_datepicker __ref,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "createasdatepicker_weeknameproperties", new Object[] {_color,_xfont,_textcolor,_height}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _t1 = null;
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Public Sub CreateASDatePicker_WeekNameProperties (";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Dim t1 As ASDatePicker_WeekNameProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=41418755;
 //BA.debugLineNum = 41418755;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=41418757;
 //BA.debugLineNum = 41418757;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=41418759;
 //BA.debugLineNum = 41418759;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=41418760;
 //BA.debugLineNum = 41418760;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _createasdatepicker_weeknameshort(b4a.example.ef.as_datepicker __ref,String _monday,String _tuesday,String _wednesday,String _thursday,String _friday,String _saturday,String _sunday) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "createasdatepicker_weeknameshort", new Object[] {_monday,_tuesday,_wednesday,_thursday,_friday,_saturday,_sunday}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _t1 = null;
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Public Sub CreateASDatePicker_WeekNameShort (Monda";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Dim t1 As ASDatePicker_WeekNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=41222147;
 //BA.debugLineNum = 41222147;BA.debugLine="t1.Monday = Monday";
_t1.Monday /*String*/  = _monday;
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="t1.Tuesday = Tuesday";
_t1.Tuesday /*String*/  = _tuesday;
RDebugUtils.currentLine=41222149;
 //BA.debugLineNum = 41222149;BA.debugLine="t1.Wednesday = Wednesday";
_t1.Wednesday /*String*/  = _wednesday;
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="t1.Thursday = Thursday";
_t1.Thursday /*String*/  = _thursday;
RDebugUtils.currentLine=41222151;
 //BA.debugLineNum = 41222151;BA.debugLine="t1.Friday = Friday";
_t1.Friday /*String*/  = _friday;
RDebugUtils.currentLine=41222152;
 //BA.debugLineNum = 41222152;BA.debugLine="t1.Saturday = Saturday";
_t1.Saturday /*String*/  = _saturday;
RDebugUtils.currentLine=41222153;
 //BA.debugLineNum = 41222153;BA.debugLine="t1.Sunday = Sunday";
_t1.Sunday /*String*/  = _sunday;
RDebugUtils.currentLine=41222154;
 //BA.debugLineNum = 41222154;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=41222155;
 //BA.debugLineNum = 41222155;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _createasdatepicker_weeknumberproperties(b4a.example.ef.as_datepicker __ref,float _width,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "createasdatepicker_weeknumberproperties", new Object[] {_width,_color,_xfont,_textcolor,_text}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _t1 = null;
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Public Sub CreateASDatePicker_WeekNumberProperties";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="Dim t1 As ASDatePicker_WeekNumberProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=41287683;
 //BA.debugLineNum = 41287683;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=41287685;
 //BA.debugLineNum = 41287685;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=41287686;
 //BA.debugLineNum = 41287686;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=41287687;
 //BA.debugLineNum = 41287687;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
RDebugUtils.currentLine=41287688;
 //BA.debugLineNum = 41287688;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=41287689;
 //BA.debugLineNum = 41287689;BA.debugLine="End Sub";
return null;
}
public int  _monthbetween(b4a.example.ef.as_datepicker __ref,long _date1,long _date2) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "monthbetween", true))
	 {return ((Integer) Debug.delegate(ba, "monthbetween", new Object[] {_date1,_date2}));}
long _y = 0L;
long _m = 0L;
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Private Sub MonthBetween(Date1 As Long, Date2 As L";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Dim y As Long = DateTime.GetYear(Date2) - DateTim";
_y = (long) (__c.DateTime.GetYear(_date2)-__c.DateTime.GetYear(_date1));
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="Dim m As Long = y * 12";
_m = (long) (_y*12);
RDebugUtils.currentLine=41025539;
 //BA.debugLineNum = 41025539;BA.debugLine="m = m - DateTime.GetMonth(Date1)";
_m = (long) (_m-__c.DateTime.GetMonth(_date1));
RDebugUtils.currentLine=41025540;
 //BA.debugLineNum = 41025540;BA.debugLine="m = m + DateTime.GetMonth(Date2)";
_m = (long) (_m+__c.DateTime.GetMonth(_date2));
RDebugUtils.currentLine=41025541;
 //BA.debugLineNum = 41025541;BA.debugLine="Return m";
if (true) return (int) (_m);
RDebugUtils.currentLine=41025542;
 //BA.debugLineNum = 41025542;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Private Sub CreateHeader";
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="Dim xlbl_Header As B4XView = CreateLabel(\"xlbl_He";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_Header");
RDebugUtils.currentLine=35258373;
 //BA.debugLineNum = 35258373;BA.debugLine="xpnl_Header.AddView(xlbl_Header,xpnl_Header.Heigh";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_header.getObject()),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35258375;
 //BA.debugLineNum = 35258375;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = CreateLabel(\"xlbl";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowLeft");
RDebugUtils.currentLine=35258376;
 //BA.debugLineNum = 35258376;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowLeft,0,0,xpnl_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowleft.getObject()),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35258378;
 //BA.debugLineNum = 35258378;BA.debugLine="Dim xlbl_ArrowRight As B4XView = CreateLabel(\"xlb";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowRight");
RDebugUtils.currentLine=35258379;
 //BA.debugLineNum = 35258379;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowRight,xpnl_Header.W";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowright.getObject()),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35258381;
 //BA.debugLineNum = 35258381;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=35258382;
 //BA.debugLineNum = 35258382;BA.debugLine="xlbl_ArrowLeft.Text = Chr(0xE314)";
_xlbl_arrowleft.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe314))));
RDebugUtils.currentLine=35258383;
 //BA.debugLineNum = 35258383;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=35258384;
 //BA.debugLineNum = 35258384;BA.debugLine="xlbl_ArrowLeft.SetTextAlignment(\"CENTER\",\"CENTER\"";
_xlbl_arrowleft.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=35258385;
 //BA.debugLineNum = 35258385;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=35258387;
 //BA.debugLineNum = 35258387;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=35258388;
 //BA.debugLineNum = 35258388;BA.debugLine="xlbl_ArrowRight.Text = Chr(0xE315)";
_xlbl_arrowright.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe315))));
RDebugUtils.currentLine=35258389;
 //BA.debugLineNum = 35258389;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=35258390;
 //BA.debugLineNum = 35258390;BA.debugLine="xlbl_ArrowRight.SetTextAlignment(\"CENTER\",\"CENTER";
_xlbl_arrowright.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=35258391;
 //BA.debugLineNum = 35258391;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=35258393;
 //BA.debugLineNum = 35258393;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=35258394;
 //BA.debugLineNum = 35258394;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(m_Start";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,__ref._m_startdate /*long*/ )+" "+BA.NumberToString(__c.DateTime.GetYear(__ref._m_startdate /*long*/ ))));
RDebugUtils.currentLine=35258395;
 //BA.debugLineNum = 35258395;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=35258396;
 //BA.debugLineNum = 35258396;BA.debugLine="xlbl_Header.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_header.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=35258398;
 //BA.debugLineNum = 35258398;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="iv.Initialize(EventName)";
_iv.Initialize(ba,_eventname);
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=41091076;
 //BA.debugLineNum = 41091076;BA.debugLine="End Sub";
return null;
}
public String  _createselecteddate(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _firstdatepanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createselecteddate", true))
	 {return ((String) Debug.delegate(ba, "createselecteddate", new Object[] {_xpnl_monthdate,_firstdatepanel}));}
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Private Sub CreateSelectedDate(xpnl_MonthDate As B";
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="If FirstDatePanel Then";
if (_firstdatepanel) { 
RDebugUtils.currentLine=40566787;
 //BA.debugLineNum = 40566787;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedDa";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=40566788;
 //BA.debugLineNum = 40566788;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate.P";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=40566789;
 //BA.debugLineNum = 40566789;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=40566791;
 //BA.debugLineNum = 40566791;BA.debugLine="xpnl_SelectedDate.RemoveViewFromParent";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=40566793;
 //BA.debugLineNum = 40566793;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=40566794;
 //BA.debugLineNum = 40566794;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=40566795;
 //BA.debugLineNum = 40566795;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=40566796;
 //BA.debugLineNum = 40566796;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=40566797;
 //BA.debugLineNum = 40566797;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
RDebugUtils.currentLine=40566798;
 //BA.debugLineNum = 40566798;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 }else {
RDebugUtils.currentLine=40566800;
 //BA.debugLineNum = 40566800;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=40566801;
 //BA.debugLineNum = 40566801;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate2.";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group16.Get(index16)));
RDebugUtils.currentLine=40566802;
 //BA.debugLineNum = 40566802;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=40566804;
 //BA.debugLineNum = 40566804;BA.debugLine="xpnl_SelectedDate2.RemoveViewFromParent";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=40566806;
 //BA.debugLineNum = 40566806;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=40566807;
 //BA.debugLineNum = 40566807;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=40566808;
 //BA.debugLineNum = 40566808;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=40566809;
 //BA.debugLineNum = 40566809;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=40566810;
 //BA.debugLineNum = 40566810;BA.debugLine="xpnl_SelectedDate2 = xpnl_selected";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
RDebugUtils.currentLine=40566813;
 //BA.debugLineNum = 40566813;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Private Sub MonthDateClick(xpnl_MonthDate As B4XVi";
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="Dim CurrentDay As Long = xpnl_MonthDate.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime.";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
if (true) return "";};
RDebugUtils.currentLine=40501253;
 //BA.debugLineNum = 40501253;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40501254;
 //BA.debugLineNum = 40501254;BA.debugLine="For Each View As B4XView In xpnl_MonthDate.GetAll";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _xpnl_monthdate.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=40501255;
 //BA.debugLineNum = 40501255;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=40501258;
 //BA.debugLineNum = 40501258;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=40501260;
 //BA.debugLineNum = 40501260;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=40501261;
 //BA.debugLineNum = 40501261;BA.debugLine="If m_SelectedDate = 0 Or xpnl_MonthDate.Tag <= m";
if (__ref._m_selecteddate /*long*/ ==0 || (double)(BA.ObjectToNumber(_xpnl_monthdate.getTag()))<=__ref._m_selecteddate /*long*/ ) { 
RDebugUtils.currentLine=40501262;
 //BA.debugLineNum = 40501262;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate,xpnl_Mont";
if (_dateutils._issameday(ba,__ref._m_selecteddate /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=40501263;
 //BA.debugLineNum = 40501263;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=40501264;
 //BA.debugLineNum = 40501264;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
RDebugUtils.currentLine=40501265;
 //BA.debugLineNum = 40501265;BA.debugLine="If m_SelectedDate > m_SelectedDate2 Then";
if (__ref._m_selecteddate /*long*/ >__ref._m_selecteddate2 /*long*/ ) { 
RDebugUtils.currentLine=40501266;
 //BA.debugLineNum = 40501266;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Select";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=40501267;
 //BA.debugLineNum = 40501267;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=40501270;
 //BA.debugLineNum = 40501270;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_Selected";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=40501271;
 //BA.debugLineNum = 40501271;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=40501274;
 //BA.debugLineNum = 40501274;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate2,xpnl_Mon";
if (_dateutils._issameday(ba,__ref._m_selecteddate2 /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=40501275;
 //BA.debugLineNum = 40501275;BA.debugLine="m_SelectedDate2 = xpnl_MonthDate.Tag";
__ref._m_selecteddate2 /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=40501276;
 //BA.debugLineNum = 40501276;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.False);
 }else {
RDebugUtils.currentLine=40501278;
 //BA.debugLineNum = 40501278;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Selecte";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=40501279;
 //BA.debugLineNum = 40501279;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 };
RDebugUtils.currentLine=40501282;
 //BA.debugLineNum = 40501282;BA.debugLine="RefreshSelectedDate";
__ref._refreshselecteddate /*String*/ (null);
 }else {
RDebugUtils.currentLine=40501284;
 //BA.debugLineNum = 40501284;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
 };
RDebugUtils.currentLine=40501287;
 //BA.debugLineNum = 40501287;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedTe";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
RDebugUtils.currentLine=40501289;
 //BA.debugLineNum = 40501289;BA.debugLine="If WithEvent = True Then";
if (_withevent==__c.True) { 
RDebugUtils.currentLine=40501290;
 //BA.debugLineNum = 40501290;BA.debugLine="If m_SelectMode = \"Range\" And m_SelectedDate > 0";
if ((__ref._m_selectmode /*String*/ ).equals("Range") && __ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0) { 
RDebugUtils.currentLine=40501291;
 //BA.debugLineNum = 40501291;BA.debugLine="SelectedDateRangeChanged";
__ref._selecteddaterangechanged /*String*/ (null);
 }else {
RDebugUtils.currentLine=40501293;
 //BA.debugLineNum = 40501293;BA.debugLine="SelectedDateChanged(xpnl_MonthDate.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()));
 };
 };
RDebugUtils.currentLine=40501296;
 //BA.debugLineNum = 40501296;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_range(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_range", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_range", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Public Sub getSelectMode_Range As String";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Return \"Range\"";
if (true) return "Range";
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="End Sub";
return "";
}
public String  _customdrawheader(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawheader", true))
	 {return ((String) Debug.delegate(ba, "customdrawheader", new Object[] {_date}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawheader _m_customdrawheader = null;
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Private Sub CustomDrawHeader(date As Long)";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(int) (2))) { 
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="Dim m_CustomDrawHeader As ASDatePicker_CustomDra";
_m_customdrawheader = new b4a.example.ef.as_datepicker._asdatepicker_customdrawheader();
RDebugUtils.currentLine=39518212;
 //BA.debugLineNum = 39518212;BA.debugLine="m_CustomDrawHeader.Initialize";
_m_customdrawheader.Initialize();
RDebugUtils.currentLine=39518213;
 //BA.debugLineNum = 39518213;BA.debugLine="m_CustomDrawHeader.BackgroundPanel = xpnl_Header";
_m_customdrawheader.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=39518214;
 //BA.debugLineNum = 39518214;BA.debugLine="m_CustomDrawHeader.xlbl_Text = xpnl_Header.GetVi";
_m_customdrawheader.xlbl_Text /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=39518215;
 //BA.debugLineNum = 39518215;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowLeft = xpnl_Header.";
_m_customdrawheader.xlbl_ArrowLeft /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=39518216;
 //BA.debugLineNum = 39518216;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowRight = xpnl_Header";
_m_customdrawheader.xlbl_ArrowRight /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=39518218;
 //BA.debugLineNum = 39518218;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawHea";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(Object)(_date),(Object)(_m_customdrawheader));
 };
RDebugUtils.currentLine=39518220;
 //BA.debugLineNum = 39518220;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.as_datepicker __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="IniProps(Props)";
__ref._iniprops /*String*/ (null,_props);
RDebugUtils.currentLine=34996229;
 //BA.debugLineNum = 34996229;BA.debugLine="m_StartDate = DateTime.Now";
__ref._m_startdate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=34996232;
 //BA.debugLineNum = 34996232;BA.debugLine="xpnl_LoadingPanel = xui.CreatePanel(\"\")";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=34996233;
 //BA.debugLineNum = 34996233;BA.debugLine="xpnl_LoadingPanel.Visible = True";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=34996234;
 //BA.debugLineNum = 34996234;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=34996235;
 //BA.debugLineNum = 34996235;BA.debugLine="mBase.AddView(xpnl_LoadingPanel,0,0,mBase.Width,m";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=34996237;
 //BA.debugLineNum = 34996237;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=34996238;
 //BA.debugLineNum = 34996238;BA.debugLine="mBase.AddView(xpnl_Header,0,0,mBase.Width,g_Heade";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=34996240;
 //BA.debugLineNum = 34996240;BA.debugLine="xpnl_ViewPager = xui.CreatePanel(\"\")";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=34996241;
 //BA.debugLineNum = 34996241;BA.debugLine="mBase.AddView(xpnl_ViewPager,0,g_HeaderProperties";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=34996243;
 //BA.debugLineNum = 34996243;BA.debugLine="ini_viewpager";
__ref._ini_viewpager /*String*/ (null);
RDebugUtils.currentLine=34996244;
 //BA.debugLineNum = 34996244;BA.debugLine="CreateHeader";
__ref._createheader /*String*/ (null);
RDebugUtils.currentLine=34996245;
 //BA.debugLineNum = 34996245;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=34996246;
 //BA.debugLineNum = 34996246;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=34996247;
 //BA.debugLineNum = 34996247;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 }else 
{RDebugUtils.currentLine=34996248;
 //BA.debugLineNum = 34996248;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=34996249;
 //BA.debugLineNum = 34996249;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=34996250;
 //BA.debugLineNum = 34996250;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 }}
;
RDebugUtils.currentLine=34996253;
 //BA.debugLineNum = 34996253;BA.debugLine="xiv_RefreshImage = CreateImageView(\"\")";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=34996254;
 //BA.debugLineNum = 34996254;BA.debugLine="xiv_RefreshImage.Visible = False";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=34996255;
 //BA.debugLineNum = 34996255;BA.debugLine="mBase.AddView(xiv_RefreshImage,0,0,mBase.Width,mB";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=34996258;
 //BA.debugLineNum = 34996258;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=34996261;
 //BA.debugLineNum = 34996261;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),__c.False);
RDebugUtils.currentLine=34996263;
 //BA.debugLineNum = 34996263;BA.debugLine="End Sub";
return "";
}
public String  _iniprops(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "iniprops", true))
	 {return ((String) Debug.delegate(ba, "iniprops", new Object[] {_props}));}
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Private Sub IniProps(Props As Map)";
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=35061764;
 //BA.debugLineNum = 35061764;BA.debugLine="m_HeaderColor = xui.PaintOrColorToColor(Props.Get";
__ref._m_headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=35061765;
 //BA.debugLineNum = 35061765;BA.debugLine="m_BodyColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._m_bodycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BodyColor")));
RDebugUtils.currentLine=35061766;
 //BA.debugLineNum = 35061766;BA.debugLine="m_CurrentDateColor = xui.PaintOrColorToColor(Prop";
__ref._m_currentdatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CurrentDateColor")));
RDebugUtils.currentLine=35061767;
 //BA.debugLineNum = 35061767;BA.debugLine="m_SelectedDateColor = xui.PaintOrColorToColor(Pro";
__ref._m_selecteddatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectedDateColor")));
RDebugUtils.currentLine=35061768;
 //BA.debugLineNum = 35061768;BA.debugLine="m_InactiveDaysVisible = Props.GetDefault(\"Inactiv";
__ref._m_inactivedaysvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("InactiveDaysVisible"),(Object)(__c.False)));
RDebugUtils.currentLine=35061769;
 //BA.debugLineNum = 35061769;BA.debugLine="m_MouseHoverFeedback = Props.GetDefault(\"MouseHov";
__ref._m_mousehoverfeedback /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MouseHoverFeedback"),(Object)(__c.True)));
RDebugUtils.currentLine=35061770;
 //BA.debugLineNum = 35061770;BA.debugLine="m_SelectMode = Props.GetDefault(\"SelectMode\",\"Dat";
__ref._m_selectmode /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("SelectMode"),(Object)("Date")));
RDebugUtils.currentLine=35061771;
 //BA.debugLineNum = 35061771;BA.debugLine="m_ShowWeekNumbers = Props.GetDefault(\"ShowWeekNum";
__ref._m_showweeknumbers /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowWeekNumbers"),(Object)(__c.False)));
RDebugUtils.currentLine=35061772;
 //BA.debugLineNum = 35061772;BA.debugLine="m_ShowGridLines = Props.GetDefault(\"ShowGridLines";
__ref._m_showgridlines /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowGridLines"),(Object)(__c.False)));
RDebugUtils.currentLine=35061773;
 //BA.debugLineNum = 35061773;BA.debugLine="m_GridLineColor = xui.PaintOrColorToColor(Props.G";
__ref._m_gridlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("GridLineColor"),(Object)(((int)0x50ffffff))));
RDebugUtils.currentLine=35061774;
 //BA.debugLineNum = 35061774;BA.debugLine="m_ThemeChangeTransition = Props.GetDefault(\"Theme";
__ref._m_themechangetransition /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ThemeChangeTransition"),(Object)("Fade")));
RDebugUtils.currentLine=35061776;
 //BA.debugLineNum = 35061776;BA.debugLine="If \"Friday\" = Props.Get(\"FirstDayOfWeek\") Then";
if (("Friday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=35061777;
 //BA.debugLineNum = 35061777;BA.debugLine="m_FirstDayOfWeek = 1";
__ref._m_firstdayofweek /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=35061778;
 //BA.debugLineNum = 35061778;BA.debugLine="else If \"Thursday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Thursday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=35061779;
 //BA.debugLineNum = 35061779;BA.debugLine="m_FirstDayOfWeek = 2";
__ref._m_firstdayofweek /*int*/  = (int) (2);
 }else 
{RDebugUtils.currentLine=35061780;
 //BA.debugLineNum = 35061780;BA.debugLine="else If \"Wednesday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Wednesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=35061781;
 //BA.debugLineNum = 35061781;BA.debugLine="m_FirstDayOfWeek = 3";
__ref._m_firstdayofweek /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=35061782;
 //BA.debugLineNum = 35061782;BA.debugLine="else If \"Tuesday\" = Props.Get(\"FirstDayOfWeek\") T";
if (("Tuesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=35061783;
 //BA.debugLineNum = 35061783;BA.debugLine="m_FirstDayOfWeek = 4";
__ref._m_firstdayofweek /*int*/  = (int) (4);
 }else 
{RDebugUtils.currentLine=35061784;
 //BA.debugLineNum = 35061784;BA.debugLine="else If \"Monday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Monday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=35061785;
 //BA.debugLineNum = 35061785;BA.debugLine="m_FirstDayOfWeek = 5";
__ref._m_firstdayofweek /*int*/  = (int) (5);
 }else 
{RDebugUtils.currentLine=35061786;
 //BA.debugLineNum = 35061786;BA.debugLine="else If \"Sunday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Sunday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=35061787;
 //BA.debugLineNum = 35061787;BA.debugLine="m_FirstDayOfWeek = 6";
__ref._m_firstdayofweek /*int*/  = (int) (6);
 }else 
{RDebugUtils.currentLine=35061788;
 //BA.debugLineNum = 35061788;BA.debugLine="else If \"Saturday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Saturday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=35061789;
 //BA.debugLineNum = 35061789;BA.debugLine="m_FirstDayOfWeek = 7";
__ref._m_firstdayofweek /*int*/  = (int) (7);
 }}}}}}}
;
RDebugUtils.currentLine=35061792;
 //BA.debugLineNum = 35061792;BA.debugLine="g_WeekNumberProperties = CreateASDatePicker_WeekN";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = __ref._createasdatepicker_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ (null,(float) (__c.DipToCurrent((int) (20))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,"");
RDebugUtils.currentLine=35061793;
 //BA.debugLineNum = 35061793;BA.debugLine="g_HeaderProperties = CreateASDatePicker_HeaderPro";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = __ref._createasdatepicker_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ (null,(float) (__c.DipToCurrent((int) (40))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (15),__c.True);
RDebugUtils.currentLine=35061794;
 //BA.debugLineNum = 35061794;BA.debugLine="g_BodyProperties = CreateASDatePicker_BodyPropert";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = __ref._createasdatepicker_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=35061795;
 //BA.debugLineNum = 35061795;BA.debugLine="g_WeekNameProperties = CreateASDatePicker_WeekNam";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = __ref._createasdatepicker_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=35061797;
 //BA.debugLineNum = 35061797;BA.debugLine="g_MonthNameShort = CreateASDatePicker_MonthNameSh";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = __ref._createasdatepicker_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ (null,"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec");
RDebugUtils.currentLine=35061798;
 //BA.debugLineNum = 35061798;BA.debugLine="g_WeekNameShort = CreateASDatePicker_WeekNameShor";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = __ref._createasdatepicker_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ (null,"Mon","Tue","Wed","Thu","Fri","Sat","Sun");
RDebugUtils.currentLine=35061800;
 //BA.debugLineNum = 35061800;BA.debugLine="End Sub";
return "";
}
public String  _ini_viewpager(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "ini_viewpager", true))
	 {return ((String) Debug.delegate(ba, "ini_viewpager", null));}
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Private Sub ini_viewpager";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=35127300;
 //BA.debugLineNum = 35127300;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=35127301;
 //BA.debugLineNum = 35127301;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=35127302;
 //BA.debugLineNum = 35127302;BA.debugLine="tmpmap.Put(\"Orientation\",\"Horizontal\")";
_tmpmap.Put((Object)("Orientation"),(Object)("Horizontal"));
RDebugUtils.currentLine=35127303;
 //BA.debugLineNum = 35127303;BA.debugLine="tmpmap.Put(\"Carousel\",False)";
_tmpmap.Put((Object)("Carousel"),(Object)(__c.False));
RDebugUtils.currentLine=35127304;
 //BA.debugLineNum = 35127304;BA.debugLine="tmpmap.Put(\"LazyLoading\",True)";
_tmpmap.Put((Object)("LazyLoading"),(Object)(__c.True));
RDebugUtils.currentLine=35127305;
 //BA.debugLineNum = 35127305;BA.debugLine="tmpmap.Put(\"LazyLoadingExtraSize\",3)";
_tmpmap.Put((Object)("LazyLoadingExtraSize"),(Object)(3));
RDebugUtils.currentLine=35127306;
 //BA.debugLineNum = 35127306;BA.debugLine="xASVP_Main.Initialize(Me,\"xASVP_Main\")";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._initialize /*String*/ (null,ba,this,"xASVP_Main");
RDebugUtils.currentLine=35127307;
 //BA.debugLineNum = 35127307;BA.debugLine="xASVP_Main.DesignerCreateView(xpnl_ViewPager,tmpl";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._designercreateview /*String*/ (null,(Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=35127308;
 //BA.debugLineNum = 35127308;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=35127309;
 //BA.debugLineNum = 35127309;BA.debugLine="End Sub";
return "";
}
public int  _getbodycolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodycolor", true))
	 {return ((Integer) Debug.delegate(ba, "getbodycolor", null));}
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Public Sub getBodyColor As Int";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Return m_BodyColor";
if (true) return __ref._m_bodycolor /*int*/ ;
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="End Sub";
return 0;
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _getbodyproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "getbodyproperties", null));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Public Sub getBodyProperties As ASDatePicker_BodyP";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Return g_BodyProperties";
if (true) return __ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ ;
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentdatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentdatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentdatecolor", null));}
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Public Sub getCurrentDateColor As Int";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="Return m_CurrentDateColor";
if (true) return __ref._m_currentdatecolor /*int*/ ;
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="End Sub";
return 0;
}
public String  _getcurrentview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview", null));}
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub getCurrentView As String";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Return m_CurrentView";
if (true) return __ref._m_currentview /*String*/ ;
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="End Sub";
return "";
}
public int  _getgridlinecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getgridlinecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getgridlinecolor", null));}
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Public Sub getGridLineColor As Int";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="Return m_GridLineColor";
if (true) return __ref._m_gridlinecolor /*int*/ ;
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="End Sub";
return 0;
}
public int  _getheadercolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheadercolor", true))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="Return m_HeaderColor";
if (true) return __ref._m_headercolor /*int*/ ;
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getheaderpanel(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Public Sub getHeaderPanel As B4XView";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="Return xpnl_Header";
if (true) return __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _getheaderproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "getheaderproperties", null));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Public Sub getHeaderProperties As ASDatePicker_Hea";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Return g_HeaderProperties";
if (true) return __ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ ;
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="End Sub";
return null;
}
public long  _getmaxdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmaxdate", true))
	 {return ((Long) Debug.delegate(ba, "getmaxdate", null));}
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Public Sub getMaxDate As Long";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Return m_MaxDate";
if (true) return __ref._m_maxdate /*long*/ ;
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="End Sub";
return 0L;
}
public long  _getmindate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmindate", true))
	 {return ((Long) Debug.delegate(ba, "getmindate", null));}
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Public Sub getMinDate As Long";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Return m_MinDate";
if (true) return __ref._m_mindate /*long*/ ;
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="End Sub";
return 0L;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _getmonthnameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "getmonthnameshort", null));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Public Sub getMonthNameShort As ASDatePicker_Month";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="Return g_MonthNameShort";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ ;
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="End Sub";
return null;
}
public long  _getselecteddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddate", true))
	 {return ((Long) Debug.delegate(ba, "getselecteddate", null));}
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Public Sub getSelectedDate As Long";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="End Sub";
return 0L;
}
public int  _getselecteddatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselecteddatecolor", null));}
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Public Sub getSelectedDateColor As Int";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Return m_SelectedDateColor";
if (true) return __ref._m_selecteddatecolor /*int*/ ;
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="End Sub";
return 0;
}
public long  _getselectedenddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedenddate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedenddate", null));}
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Public Sub getSelectedEndDate As Long";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="Return m_SelectedDate2";
if (true) return __ref._m_selecteddate2 /*long*/ ;
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="End Sub";
return 0L;
}
public long  _getselectedstartdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedstartdate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedstartdate", null));}
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Public Sub getSelectedStartDate As Long";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="End Sub";
return 0L;
}
public String  _getselectmode(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode", true))
	 {return ((String) Debug.delegate(ba, "getselectmode", null));}
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Public Sub getSelectMode As String";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Return m_SelectMode";
if (true) return __ref._m_selectmode /*String*/ ;
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_day(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_day", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_day", null));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Public Sub getSelectMode_Day As String";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Return \"Date\"";
if (true) return "Date";
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_month(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_month", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_month", null));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Public Sub getSelectMode_Month As String";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Return \"Month\"";
if (true) return "Month";
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowgridlines(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowgridlines", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowgridlines", null));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Public Sub getShowGridLines As Boolean";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="Return m_ShowGridLines";
if (true) return __ref._m_showgridlines /*boolean*/ ;
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowweeknumbers(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowweeknumbers", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowweeknumbers", null));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Public Sub getShowWeekNumbers As Boolean";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Return m_ShowWeekNumbers";
if (true) return __ref._m_showweeknumbers /*boolean*/ ;
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_dark(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_dark", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_dark", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Public Sub getTheme_Dark As AS_DatePicker_Theme";
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=34799619;
 //BA.debugLineNum = 34799619;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=34799620;
 //BA.debugLineNum = 34799620;BA.debugLine="Theme.BodyColor = 0xFF202125";
_theme.BodyColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=34799621;
 //BA.debugLineNum = 34799621;BA.debugLine="Theme.HeaderColor = 0xFF202125";
_theme.HeaderColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=34799622;
 //BA.debugLineNum = 34799622;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=34799623;
 //BA.debugLineNum = 34799623;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=34799624;
 //BA.debugLineNum = 34799624;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,255,255,2";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=34799625;
 //BA.debugLineNum = 34799625;BA.debugLine="Theme.BodyTextColor = xui.Color_White";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34799626;
 //BA.debugLineNum = 34799626;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34799627;
 //BA.debugLineNum = 34799627;BA.debugLine="Theme.HeaderTextColor = xui.Color_White";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34799628;
 //BA.debugLineNum = 34799628;BA.debugLine="Theme.WeekNameColor =  0xFF202125'xui.Color_ARGB(";
_theme.WeekNameColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=34799629;
 //BA.debugLineNum = 34799629;BA.debugLine="Theme.WeekNameTextColor = xui.Color_White";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34799630;
 //BA.debugLineNum = 34799630;BA.debugLine="Theme.WeekNumberColor = xui.Color_ARGB(255,32, 33";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
RDebugUtils.currentLine=34799631;
 //BA.debugLineNum = 34799631;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_White";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34799633;
 //BA.debugLineNum = 34799633;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=34799635;
 //BA.debugLineNum = 34799635;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_light(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_light", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_light", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Public Sub getTheme_Light As AS_DatePicker_Theme";
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=34865155;
 //BA.debugLineNum = 34865155;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="Theme.BodyColor = xui.Color_White";
_theme.BodyColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34865157;
 //BA.debugLineNum = 34865157;BA.debugLine="Theme.HeaderColor = xui.Color_White";
_theme.HeaderColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34865158;
 //BA.debugLineNum = 34865158;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=34865159;
 //BA.debugLineNum = 34865159;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=34865160;
 //BA.debugLineNum = 34865160;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,0,0,0)";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=34865161;
 //BA.debugLineNum = 34865161;BA.debugLine="Theme.BodyTextColor = xui.Color_Black";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=34865162;
 //BA.debugLineNum = 34865162;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34865163;
 //BA.debugLineNum = 34865163;BA.debugLine="Theme.HeaderTextColor = xui.Color_Black";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=34865164;
 //BA.debugLineNum = 34865164;BA.debugLine="Theme.WeekNameColor = xui.Color_White'xui.Color_A";
_theme.WeekNameColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34865165;
 //BA.debugLineNum = 34865165;BA.debugLine="Theme.WeekNameTextColor = xui.Color_Black";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=34865166;
 //BA.debugLineNum = 34865166;BA.debugLine="Theme.WeekNumberColor = xui.Color_White";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=34865167;
 //BA.debugLineNum = 34865167;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_Black";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=34865169;
 //BA.debugLineNum = 34865169;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=34865171;
 //BA.debugLineNum = 34865171;BA.debugLine="End Sub";
return null;
}
public String  _getweeknamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getweeknamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Public Sub GetWeekNameByIndex(Index As Int) As Str";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="If Index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="Return g_WeekNameShort.Sunday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ ;
 }else 
{RDebugUtils.currentLine=40763395;
 //BA.debugLineNum = 40763395;BA.debugLine="else If Index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=40763396;
 //BA.debugLineNum = 40763396;BA.debugLine="Return g_WeekNameShort.Monday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ ;
 }else 
{RDebugUtils.currentLine=40763397;
 //BA.debugLineNum = 40763397;BA.debugLine="else If Index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=40763398;
 //BA.debugLineNum = 40763398;BA.debugLine="Return g_WeekNameShort.Tuesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=40763399;
 //BA.debugLineNum = 40763399;BA.debugLine="else If Index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=40763400;
 //BA.debugLineNum = 40763400;BA.debugLine="Return g_WeekNameShort.Wednesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=40763401;
 //BA.debugLineNum = 40763401;BA.debugLine="else If Index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=40763402;
 //BA.debugLineNum = 40763402;BA.debugLine="Return g_WeekNameShort.Thursday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ ;
 }else 
{RDebugUtils.currentLine=40763403;
 //BA.debugLineNum = 40763403;BA.debugLine="else If Index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=40763404;
 //BA.debugLineNum = 40763404;BA.debugLine="Return g_WeekNameShort.Friday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ ;
 }else {
RDebugUtils.currentLine=40763406;
 //BA.debugLineNum = 40763406;BA.debugLine="Return g_WeekNameShort.Saturday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ ;
 }}}}}}
;
RDebugUtils.currentLine=40763408;
 //BA.debugLineNum = 40763408;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _getweeknameproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "getweeknameproperties", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Public Sub getWeekNameProperties As ASDatePicker_W";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="Return g_WeekNameProperties";
if (true) return __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ ;
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _getweeknameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "getweeknameshort", null));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub getWeekNameShort As ASDatePicker_WeekNa";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="Return g_WeekNameShort";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ ;
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _getweeknumberproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "getweeknumberproperties", null));}
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Public Sub getWeekNumberProperties As ASDatePicker";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Return g_WeekNumberProperties";
if (true) return __ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ ;
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=34930691;
 //BA.debugLineNum = 34930691;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Public Sub RefreshSelectedDate";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=35979271;
 //BA.debugLineNum = 35979271;BA.debugLine="Dim counter As Int = xASVP_Main.GetPanel(i).Nu";
_counter = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews();
RDebugUtils.currentLine=35979272;
 //BA.debugLineNum = 35979272;BA.debugLine="For z = 0 To counter -1";
{
final int step6 = 1;
final int limit6 = (int) (_counter-1);
_z = (int) (0) ;
for (;_z <= limit6 ;_z = _z + step6 ) {
RDebugUtils.currentLine=35979273;
 //BA.debugLineNum = 35979273;BA.debugLine="Dim xpnl_Day As B4XView = xASVP_Main.GetPanel";
_xpnl_day = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_day = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).GetView(_z);
RDebugUtils.currentLine=35979274;
 //BA.debugLineNum = 35979274;BA.debugLine="If xpnl_Day.tag Is Long And xpnl_Day.NumberOf";
if (_xpnl_day.getTag() instanceof Long && _xpnl_day.getNumberOfViews()>0) { 
RDebugUtils.currentLine=35979275;
 //BA.debugLineNum = 35979275;BA.debugLine="CreateSelectDates(xpnl_Day,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_day,_clr);
 };
 }
};
 };
 };
 }
};
RDebugUtils.currentLine=35979282;
 //BA.debugLineNum = 35979282;BA.debugLine="End Sub";
return "";
}
public String  _selecteddaterangechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddaterangechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddaterangechanged", null));}
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Private Sub SelectedDateRangeChanged";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(int) (2))) { 
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SelectedDateR";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(Object)(__ref._m_selecteddate /*long*/ ),(Object)(__ref._m_selecteddate2 /*long*/ ));
 };
RDebugUtils.currentLine=39649284;
 //BA.debugLineNum = 39649284;BA.debugLine="End Sub";
return "";
}
public String  _selecteddatechanged(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddatechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddatechanged", new Object[] {_date}));}
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Private Sub SelectedDateChanged(date As Long)";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(int) (1))) { 
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedDateC";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(Object)(_date));
 };
RDebugUtils.currentLine=39583748;
 //BA.debugLineNum = 39583748;BA.debugLine="End Sub";
return "";
}
public String  _pagechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "pagechanged", true))
	 {return ((String) Debug.delegate(ba, "pagechanged", null));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub PageChanged";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(int) (0))) { 
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="CallSub(mCallBack, mEventName & \"_PageChanged\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged");
 };
RDebugUtils.currentLine=39780356;
 //BA.debugLineNum = 39780356;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="Do While m_isReady = False";
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
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="Sleep(0)";
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
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 5;
;
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=36175883;
 //BA.debugLineNum = 36175883;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
this.state = 9;
}}
if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=36175884;
 //BA.debugLineNum = 36175884;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=36175885;
 //BA.debugLineNum = 36175885;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=36175887;
 //BA.debugLineNum = 36175887;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="xASVP_Main.GetPanel(i).RemoveAllViews";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).RemoveAllViews();
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="AddMonth(xASVP_Main.GetPanel(i),xASVP_Main.Get";
__ref._addmonth /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }else 
{RDebugUtils.currentLine=35913734;
 //BA.debugLineNum = 35913734;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=35913735;
 //BA.debugLineNum = 35913735;BA.debugLine="AddYear(xASVP_Main.GetPanel(i),xASVP_Main.GetV";
__ref._addyear /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }}
;
 };
 }
};
RDebugUtils.currentLine=35913739;
 //BA.debugLineNum = 35913739;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Public Sub RefreshHeader";
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = xpnl_Header.GetVi";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="Dim xlbl_ArrowRight As B4XView = xpnl_Header.GetV";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=36110344;
 //BA.debugLineNum = 36110344;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=36110345;
 //BA.debugLineNum = 36110345;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=36110346;
 //BA.debugLineNum = 36110346;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=36110348;
 //BA.debugLineNum = 36110348;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=36110349;
 //BA.debugLineNum = 36110349;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=36110350;
 //BA.debugLineNum = 36110350;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=36110352;
 //BA.debugLineNum = 36110352;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=36110353;
 //BA.debugLineNum = 36110353;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=36110355;
 //BA.debugLineNum = 36110355;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Public Sub Scroll2Date(Date As Long)";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Dim ScrollIndex As Int = -1";
_scrollindex = (int) (-1);
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="Dim StartDate As Long = xASVP_Main.GetValue(i)";
_startdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i));
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="If DateTime.GetYear(StartDate) = DateTime.GetYea";
if (__c.DateTime.GetYear(_startdate)==__c.DateTime.GetYear(_date) && __c.DateTime.GetMonth(_startdate)==__c.DateTime.GetMonth(_date)) { 
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="ScrollIndex = i";
_scrollindex = _i;
 };
 }
};
RDebugUtils.currentLine=37814282;
 //BA.debugLineNum = 37814282;BA.debugLine="If ScrollIndex <> -1 Then";
if (_scrollindex!=-1) { 
RDebugUtils.currentLine=37814283;
 //BA.debugLineNum = 37814283;BA.debugLine="xASVP_Main.CurrentIndex = ScrollIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex /*int*/ (null,_scrollindex);
 }else {
RDebugUtils.currentLine=37814285;
 //BA.debugLineNum = 37814285;BA.debugLine="m_StartDate = Date";
__ref._m_startdate /*long*/  = _date;
RDebugUtils.currentLine=37814286;
 //BA.debugLineNum = 37814286;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=37814287;
 //BA.debugLineNum = 37814287;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 };
RDebugUtils.currentLine=37814289;
 //BA.debugLineNum = 37814289;BA.debugLine="End Sub";
return "";
}
public String  _setbodycolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodycolor", true))
	 {return ((String) Debug.delegate(ba, "setbodycolor", new Object[] {_color}));}
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Public Sub setBodyColor(Color As Int)";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="m_BodyColor = Color";
__ref._m_bodycolor /*int*/  = _color;
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=37421061;
 //BA.debugLineNum = 37421061;BA.debugLine="End Sub";
return "";
}
public String  _setbodyproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _bodyproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodyproperties", true))
	 {return ((String) Debug.delegate(ba, "setbodyproperties", new Object[] {_bodyproperties}));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Public Sub setBodyProperties(BodyProperties As ASD";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="g_BodyProperties = BodyProperties";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = _bodyproperties;
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentdatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setcurrentdatecolor", true))
	 {return ((String) Debug.delegate(ba, "setcurrentdatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Public Sub setCurrentDateColor(Color As Int)";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="m_CurrentDateColor = Color";
__ref._m_currentdatecolor /*int*/  = _color;
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="End Sub";
return "";
}
public String  _setfirstdayofweek(b4a.example.ef.as_datepicker __ref,int _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setfirstdayofweek", true))
	 {return ((String) Debug.delegate(ba, "setfirstdayofweek", new Object[] {_number}));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Public Sub setFirstDayOfWeek(number As Int)";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="m_FirstDayOfWeek = number";
__ref._m_firstdayofweek /*int*/  = _number;
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="End Sub";
return "";
}
public String  _setgridlinecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setgridlinecolor", true))
	 {return ((String) Debug.delegate(ba, "setgridlinecolor", new Object[] {_color}));}
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Public Sub setGridLineColor(Color As Int)";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="m_GridLineColor = Color";
__ref._m_gridlinecolor /*int*/  = _color;
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheadercolor", true))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="m_HeaderColor = Color";
__ref._m_headercolor /*int*/  = _color;
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="End Sub";
return "";
}
public String  _setheaderproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_headerproperties _headerproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheaderproperties", true))
	 {return ((String) Debug.delegate(ba, "setheaderproperties", new Object[] {_headerproperties}));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Public Sub setHeaderProperties(HeaderProperties As";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="g_HeaderProperties = HeaderProperties";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = _headerproperties;
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="End Sub";
return "";
}
public String  _setmaxdate(b4a.example.ef.as_datepicker __ref,long _maxdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmaxdate", true))
	 {return ((String) Debug.delegate(ba, "setmaxdate", new Object[] {_maxdate}));}
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Public Sub setMaxDate(MaxDate As Long)";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="m_MaxDate = MaxDate";
__ref._m_maxdate /*long*/  = _maxdate;
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="End Sub";
return "";
}
public String  _setmindate(b4a.example.ef.as_datepicker __ref,long _mindate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmindate", true))
	 {return ((String) Debug.delegate(ba, "setmindate", new Object[] {_mindate}));}
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Public Sub setMinDate(MinDate As Long)";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="m_MinDate = MinDate";
__ref._m_mindate /*long*/  = _mindate;
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="End Sub";
return "";
}
public String  _setmonthnameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _monthnameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmonthnameshort", true))
	 {return ((String) Debug.delegate(ba, "setmonthnameshort", new Object[] {_monthnameshort}));}
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Public Sub setMonthNameShort(MonthNameShort As ASD";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="g_MonthNameShort = MonthNameShort";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = _monthnameshort;
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddate", true))
	 {return ((String) Debug.delegate(ba, "setselecteddate", new Object[] {_date}));}
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Public Sub setSelectedDate(Date As Long)";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddatecolor", true))
	 {return ((String) Debug.delegate(ba, "setselecteddatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Public Sub setSelectedDateColor(Color As Int)";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="m_SelectedDateColor = Color";
__ref._m_selecteddatecolor /*int*/  = _color;
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="End Sub";
return "";
}
public String  _setselectedenddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedenddate", true))
	 {return ((String) Debug.delegate(ba, "setselectedenddate", new Object[] {_date}));}
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Public Sub setSelectedEndDate(Date As Long)";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="m_SelectedDate2 = Date";
__ref._m_selecteddate2 /*long*/  = _date;
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="End Sub";
return "";
}
public String  _setselectedstartdate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedstartdate", true))
	 {return ((String) Debug.delegate(ba, "setselectedstartdate", new Object[] {_date}));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Public Sub setSelectedStartDate(Date As Long)";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="End Sub";
return "";
}
public String  _setselectmode(b4a.example.ef.as_datepicker __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectmode", true))
	 {return ((String) Debug.delegate(ba, "setselectmode", new Object[] {_mode}));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Public Sub setSelectMode(Mode As String)";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="m_SelectMode = Mode";
__ref._m_selectmode /*String*/  = _mode;
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="End Sub";
return "";
}
public String  _setshowgridlines(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowgridlines", true))
	 {return ((String) Debug.delegate(ba, "setshowgridlines", new Object[] {_show}));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Public Sub setShowGridLines(Show As Boolean)";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="m_ShowGridLines = Show";
__ref._m_showgridlines /*boolean*/  = _show;
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="End Sub";
return "";
}
public String  _setshowweeknumbers(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowweeknumbers", true))
	 {return ((String) Debug.delegate(ba, "setshowweeknumbers", new Object[] {_show}));}
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Public Sub setShowWeekNumbers(Show As Boolean)";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="m_ShowWeekNumbers = Show";
__ref._m_showweeknumbers /*boolean*/  = _show;
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="xiv_RefreshImage.SetBitmap(mBase.Snapshot)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .Snapshot().getObject()));
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,True)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=34734085;
 //BA.debugLineNum = 34734085;BA.debugLine="m_BodyColor = Theme.BodyColor";
__ref._m_bodycolor /*int*/  = _theme.BodyColor /*int*/ ;
RDebugUtils.currentLine=34734086;
 //BA.debugLineNum = 34734086;BA.debugLine="m_HeaderColor = Theme.HeaderColor";
__ref._m_headercolor /*int*/  = _theme.HeaderColor /*int*/ ;
RDebugUtils.currentLine=34734087;
 //BA.debugLineNum = 34734087;BA.debugLine="m_CurrentDateColor = Theme.CurrentDateColor";
__ref._m_currentdatecolor /*int*/  = _theme.CurrentDateColor /*int*/ ;
RDebugUtils.currentLine=34734088;
 //BA.debugLineNum = 34734088;BA.debugLine="m_SelectedDateColor = Theme.SelectedDateColor";
__ref._m_selecteddatecolor /*int*/  = _theme.SelectedDateColor /*int*/ ;
RDebugUtils.currentLine=34734089;
 //BA.debugLineNum = 34734089;BA.debugLine="m_GridLineColor = Theme.GridLineColor";
__ref._m_gridlinecolor /*int*/  = _theme.GridLineColor /*int*/ ;
RDebugUtils.currentLine=34734090;
 //BA.debugLineNum = 34734090;BA.debugLine="g_BodyProperties.TextColor = Theme.BodyTextColor";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/  = _theme.BodyTextColor /*int*/ ;
RDebugUtils.currentLine=34734091;
 //BA.debugLineNum = 34734091;BA.debugLine="g_HeaderProperties.TextColor = Theme.HeaderTextCo";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/  = _theme.HeaderTextColor /*int*/ ;
RDebugUtils.currentLine=34734092;
 //BA.debugLineNum = 34734092;BA.debugLine="g_WeekNameProperties.Color = Theme.WeekNameColor";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/  = _theme.WeekNameColor /*int*/ ;
RDebugUtils.currentLine=34734093;
 //BA.debugLineNum = 34734093;BA.debugLine="g_WeekNameProperties.TextColor = Theme.WeekNameTe";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/  = _theme.WeekNameTextColor /*int*/ ;
RDebugUtils.currentLine=34734094;
 //BA.debugLineNum = 34734094;BA.debugLine="g_WeekNumberProperties.Color = Theme.WeekNumberCo";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/  = _theme.WeekNumberColor /*int*/ ;
RDebugUtils.currentLine=34734095;
 //BA.debugLineNum = 34734095;BA.debugLine="g_WeekNumberProperties.TextColor = Theme.WeekNumb";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/  = _theme.WeekNumberTextColor /*int*/ ;
RDebugUtils.currentLine=34734096;
 //BA.debugLineNum = 34734096;BA.debugLine="g_BodyProperties.SelectedTextColor = Theme.Select";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/  = _theme.SelectedTextColor /*int*/ ;
RDebugUtils.currentLine=34734098;
 //BA.debugLineNum = 34734098;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=34734100;
 //BA.debugLineNum = 34734100;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=34734101;
 //BA.debugLineNum = 34734101;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=34734102;
 //BA.debugLineNum = 34734102;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=34734104;
 //BA.debugLineNum = 34734104;BA.debugLine="RefreshHeader";
__ref._refreshheader /*String*/ (null);
RDebugUtils.currentLine=34734105;
 //BA.debugLineNum = 34734105;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=34734107;
 //BA.debugLineNum = 34734107;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=34734109;
 //BA.debugLineNum = 34734109;BA.debugLine="Select m_ThemeChangeTransition";
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
RDebugUtils.currentLine=34734111;
 //BA.debugLineNum = 34734111;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=34734113;
 //BA.debugLineNum = 34734113;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(250,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=34734116;
 //BA.debugLineNum = 34734116;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Public Sub setWeekNameProperties(WeekNamePropertie";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="g_WeekNameProperties = WeekNameProperties";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = _weeknameproperties;
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="End Sub";
return "";
}
public String  _setweeknameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _weeknameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknameshort", true))
	 {return ((String) Debug.delegate(ba, "setweeknameshort", new Object[] {_weeknameshort}));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub setWeekNameShort(WeekNameShort As ASDat";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="g_WeekNameShort = WeekNameShort";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = _weeknameshort;
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="End Sub";
return "";
}
public String  _setweeknumberproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _weeknumberproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknumberproperties", true))
	 {return ((String) Debug.delegate(ba, "setweeknumberproperties", new Object[] {_weeknumberproperties}));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub setWeekNumberProperties(WeekNumberPrope";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="g_WeekNumberProperties = WeekNumberProperties";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = _weeknumberproperties;
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_lazyloadingaddcontent(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_lazyloadingaddcontent", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_lazyloadingaddcontent", new Object[] {_parent,_value}));}
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Private Sub xASVP_Main_LazyLoadingAddContent(Paren";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="AddMonth(Parent,Value)";
__ref._addmonth /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }else 
{RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView O";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=39911428;
 //BA.debugLineNum = 39911428;BA.debugLine="AddYear(Parent,Value)";
__ref._addyear /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }}
;
RDebugUtils.currentLine=39911430;
 //BA.debugLineNum = 39911430;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechange(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechange", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechange", new Object[] {_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
long _currentdate = 0L;
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Private Sub xASVP_Main_PageChange(Index As Int)";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="Dim CurrentDate As Long = xASVP_Main.GetValue(Ind";
_currentdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=39976963;
 //BA.debugLineNum = 39976963;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=39976964;
 //BA.debugLineNum = 39976964;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(Current";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,_currentdate)+" "+BA.NumberToString(__c.DateTime.GetYear(_currentdate))));
 }else 
{RDebugUtils.currentLine=39976965;
 //BA.debugLineNum = 39976965;BA.debugLine="else if m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(_currentdate)));
 }else 
{RDebugUtils.currentLine=39976967;
 //BA.debugLineNum = 39976967;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=39976968;
 //BA.debugLineNum = 39976968;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString((__c.DateTime.GetYear(_currentdate)+11))));
 }else 
{RDebugUtils.currentLine=39976969;
 //BA.debugLineNum = 39976969;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=39976970;
 //BA.debugLineNum = 39976970;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+10*12)-1))));
 }}}}
;
RDebugUtils.currentLine=39976972;
 //BA.debugLineNum = 39976972;BA.debugLine="CustomDrawHeader(CurrentDate)";
__ref._customdrawheader /*String*/ (null,_currentdate);
RDebugUtils.currentLine=39976973;
 //BA.debugLineNum = 39976973;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechanged", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechanged", new Object[] {_index}));}
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Private Sub xASVP_Main_PageChanged(Index As Int)";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="PageChanged";
__ref._pagechanged /*String*/ (null);
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Private Sub xASVP_Main_PageChanged2(NewIndex As In";
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="If m_MinDate > 0 And m_MaxDate > 0 Then Return";
if (__ref._m_mindate /*long*/ >0 && __ref._m_maxdate /*long*/ >0) { 
if (true) return "";};
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="Dim Forward As Boolean = False";
_forward = __c.False;
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="Dim DoIt As Boolean = False";
_doit = __c.False;
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="If NewIndex <= OldIndex Then";
if (_newindex<=_oldindex) { 
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="If NewIndex <= 2 Then";
if (_newindex<=2) { 
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=35389450;
 //BA.debugLineNum = 35389450;BA.debugLine="Forward = False";
_forward = __c.False;
 };
 }else {
RDebugUtils.currentLine=35389453;
 //BA.debugLineNum = 35389453;BA.debugLine="If NewIndex = xASVP_Main.Size -2 Then";
if (_newindex==__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-2) { 
RDebugUtils.currentLine=35389454;
 //BA.debugLineNum = 35389454;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=35389455;
 //BA.debugLineNum = 35389455;BA.debugLine="Forward = True";
_forward = __c.True;
 };
 };
RDebugUtils.currentLine=35389459;
 //BA.debugLineNum = 35389459;BA.debugLine="If DoIt Then";
if (_doit) { 
RDebugUtils.currentLine=35389461;
 //BA.debugLineNum = 35389461;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=35389462;
 //BA.debugLineNum = 35389462;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35389463;
 //BA.debugLineNum = 35389463;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35389464;
 //BA.debugLineNum = 35389464;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35389466;
 //BA.debugLineNum = 35389466;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35389467;
 //BA.debugLineNum = 35389467;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=35389468;
 //BA.debugLineNum = 35389468;BA.debugLine="p2.Months = IIf(Forward,1,-1)";
_p2.Months = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=35389470;
 //BA.debugLineNum = 35389470;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=35389471;
 //BA.debugLineNum = 35389471;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate";
_firstdayofmonth = _dateutils._setdate(ba,__c.DateTime.GetYear(_currenttime),__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=35389473;
 //BA.debugLineNum = 35389473;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=35389474;
 //BA.debugLineNum = 35389474;BA.debugLine="If m_MaxDate > 0 And FirstDayOfMonth > DateUti";
if (__ref._m_maxdate /*long*/ >0 && _firstdayofmonth>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=35389475;
 //BA.debugLineNum = 35389475;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=35389477;
 //BA.debugLineNum = 35389477;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfM";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
 }else {
RDebugUtils.currentLine=35389479;
 //BA.debugLineNum = 35389479;BA.debugLine="If m_MinDate > 0 And FirstDayOfMonth < DateUti";
if (__ref._m_mindate /*long*/ >0 && _firstdayofmonth<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=35389480;
 //BA.debugLineNum = 35389480;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=35389482;
 //BA.debugLineNum = 35389482;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,FirstDa";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_firstdayofmonth));
 };
 }else 
{RDebugUtils.currentLine=35389485;
 //BA.debugLineNum = 35389485;BA.debugLine="else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=35389487;
 //BA.debugLineNum = 35389487;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35389488;
 //BA.debugLineNum = 35389488;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35389489;
 //BA.debugLineNum = 35389489;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35389491;
 //BA.debugLineNum = 35389491;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35389492;
 //BA.debugLineNum = 35389492;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=35389493;
 //BA.debugLineNum = 35389493;BA.debugLine="p2.Years = IIf(Forward,1,-1)";
_p2.Years = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=35389495;
 //BA.debugLineNum = 35389495;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=35389498;
 //BA.debugLineNum = 35389498;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=35389499;
 //BA.debugLineNum = 35389499;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=35389500;
 //BA.debugLineNum = 35389500;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=35389502;
 //BA.debugLineNum = 35389502;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 }else {
RDebugUtils.currentLine=35389504;
 //BA.debugLineNum = 35389504;BA.debugLine="If m_MinDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_mindate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )) { 
RDebugUtils.currentLine=35389505;
 //BA.debugLineNum = 35389505;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=35389507;
 //BA.debugLineNum = 35389507;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,Current";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_currenttime));
 };
 }else 
{RDebugUtils.currentLine=35389510;
 //BA.debugLineNum = 35389510;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=35389512;
 //BA.debugLineNum = 35389512;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=35389514;
 //BA.debugLineNum = 35389514;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePan";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=35389515;
 //BA.debugLineNum = 35389515;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=35389516;
 //BA.debugLineNum = 35389516;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_V";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=35389518;
 //BA.debugLineNum = 35389518;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=35389519;
 //BA.debugLineNum = 35389519;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=35389520;
 //BA.debugLineNum = 35389520;BA.debugLine="p2.Years = 10";
_p2.Years = (int) (10);
RDebugUtils.currentLine=35389522;
 //BA.debugLineNum = 35389522;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1))),_p2);
RDebugUtils.currentLine=35389525;
 //BA.debugLineNum = 35389525;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=35389526;
 //BA.debugLineNum = 35389526;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=35389528;
 //BA.debugLineNum = 35389528;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 };
 }}}
;
 };
RDebugUtils.currentLine=35389535;
 //BA.debugLineNum = 35389535;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_header_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_header_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_header_click", null));}
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Private Sub xlbl_Header_Click";
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=40173571;
 //BA.debugLineNum = 40173571;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=40173572;
 //BA.debugLineNum = 40173572;BA.debugLine="else If m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=40173573;
 //BA.debugLineNum = 40173573;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=40173574;
 //BA.debugLineNum = 40173574;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=40173575;
 //BA.debugLineNum = 40173575;BA.debugLine="ChangeView(getCurrentView_CenturyView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_centuryview /*String*/ (null));
 }}}
;
RDebugUtils.currentLine=40173577;
 //BA.debugLineNum = 40173577;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowleft_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowleft_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowleft_click", null));}
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Private Sub xlbl_HeaderArrowLeft_Click";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="xASVP_Main.PreviousPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._previouspage /*String*/ (null);
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowright_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowright_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowright_click", null));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Private Sub xlbl_HeaderArrowRight_Click";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="xASVP_Main.NextPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._nextpage /*String*/ (null);
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_centurydecade_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_centurydecade_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_centurydecade_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_centurydecade = null;
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Private Sub xpnl_CenturyDecade_Click";
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="Dim xpnl_CenturyDecade As B4XView = Sender";
_xpnl_centurydecade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_centurydecade = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="m_StartDate = xpnl_CenturyDecade.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_centurydecade.getTag());
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
RDebugUtils.currentLine=40370181;
 //BA.debugLineNum = 40370181;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_decadeyear_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_decadeyear_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_decadeyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_decadeyear = null;
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Private Sub xpnl_DecadeYear_Click";
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="Dim xpnl_DecadeYear As B4XView = Sender";
_xpnl_decadeyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_decadeyear = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="m_StartDate = xpnl_DecadeYear.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_decadeyear.getTag());
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
RDebugUtils.currentLine=40239109;
 //BA.debugLineNum = 40239109;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_monthdate_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_monthdate_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_monthdate_click", null));}
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Private Sub xpnl_MonthDate_Click";
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="MonthDateClick(Sender,True)";
__ref._monthdateclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
RDebugUtils.currentLine=40435715;
 //BA.debugLineNum = 40435715;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Private Sub xpnl_YearMonth_Click";
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="Dim xpnl_YearMonth As B4XView = Sender";
_xpnl_yearmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_yearmonth = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=40304643;
 //BA.debugLineNum = 40304643;BA.debugLine="m_StartDate = xpnl_YearMonth.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_yearmonth.getTag());
RDebugUtils.currentLine=40304644;
 //BA.debugLineNum = 40304644;BA.debugLine="If m_SelectMode = \"Date\"  Or m_SelectMode = \"Rang";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=40304645;
 //BA.debugLineNum = 40304645;BA.debugLine="ChangeView(getCurrentView_MonthView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_monthview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=40304646;
 //BA.debugLineNum = 40304646;BA.debugLine="Else If m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=40304647;
 //BA.debugLineNum = 40304647;BA.debugLine="SelectedDateChanged(xpnl_YearMonth.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_yearmonth.getTag()));
RDebugUtils.currentLine=40304649;
 //BA.debugLineNum = 40304649;BA.debugLine="If m_MouseHoverFeedback = True Then";
if (__ref._m_mousehoverfeedback /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=40304650;
 //BA.debugLineNum = 40304650;BA.debugLine="Dim xlbl_Date As B4XView = xpnl_YearMonth.GetVi";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _xpnl_yearmonth.GetView((int) (0));
RDebugUtils.currentLine=40304651;
 //BA.debugLineNum = 40304651;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=40304655;
 //BA.debugLineNum = 40304655;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=40304656;
 //BA.debugLineNum = 40304656;BA.debugLine="xpnl_YearMonth.AddView(xpnl_selected,0,0,xpnl_Y";
_xpnl_yearmonth.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (0),_xpnl_yearmonth.getWidth(),_xpnl_yearmonth.getHeight());
RDebugUtils.currentLine=40304658;
 //BA.debugLineNum = 40304658;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateC";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=40304659;
 //BA.debugLineNum = 40304659;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=40304660;
 //BA.debugLineNum = 40304660;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=40304661;
 //BA.debugLineNum = 40304661;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
 }}
;
RDebugUtils.currentLine=40304668;
 //BA.debugLineNum = 40304668;BA.debugLine="End Sub";
return "";
}
}