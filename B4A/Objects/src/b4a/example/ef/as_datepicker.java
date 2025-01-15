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
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Private Sub AddMonth(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=33357828;
 //BA.debugLineNum = 33357828;BA.debugLine="Dim BlockHeight As Float = (Parent.Height-g_WeekN";
_blockheight = (float) ((_parent.getHeight()-__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ )/(double)6);
RDebugUtils.currentLine=33357829;
 //BA.debugLineNum = 33357829;BA.debugLine="Dim BlockWidth As Float = IIf(m_ShowWeekNumbers,(";
_blockwidth = (float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))));
RDebugUtils.currentLine=33357831;
 //BA.debugLineNum = 33357831;BA.debugLine="If m_ShowWeekNumbers Then AddWeekName(Parent,-1,g";
if (__ref._m_showweeknumbers /*boolean*/ ) { 
__ref._addweekname /*String*/ (null,_parent,(int) (-1),__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Text /*String*/ );};
RDebugUtils.currentLine=33357832;
 //BA.debugLineNum = 33357832;BA.debugLine="AddWeekName(Parent,0,g_WeekNameShort.Monday)";
__ref._addweekname /*String*/ (null,_parent,(int) (0),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ );
RDebugUtils.currentLine=33357833;
 //BA.debugLineNum = 33357833;BA.debugLine="AddWeekName(Parent,1,g_WeekNameShort.Tuesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (1),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ );
RDebugUtils.currentLine=33357834;
 //BA.debugLineNum = 33357834;BA.debugLine="AddWeekName(Parent,2,g_WeekNameShort.Wednesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (2),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ );
RDebugUtils.currentLine=33357835;
 //BA.debugLineNum = 33357835;BA.debugLine="AddWeekName(Parent,3,g_WeekNameShort.Thursday)";
__ref._addweekname /*String*/ (null,_parent,(int) (3),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ );
RDebugUtils.currentLine=33357836;
 //BA.debugLineNum = 33357836;BA.debugLine="AddWeekName(Parent,4,g_WeekNameShort.Friday)";
__ref._addweekname /*String*/ (null,_parent,(int) (4),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ );
RDebugUtils.currentLine=33357837;
 //BA.debugLineNum = 33357837;BA.debugLine="AddWeekName(Parent,5,g_WeekNameShort.Saturday)";
__ref._addweekname /*String*/ (null,_parent,(int) (5),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ );
RDebugUtils.currentLine=33357838;
 //BA.debugLineNum = 33357838;BA.debugLine="AddWeekName(Parent,6,g_WeekNameShort.Sunday)";
__ref._addweekname /*String*/ (null,_parent,(int) (6),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ );
RDebugUtils.currentLine=33357840;
 //BA.debugLineNum = 33357840;BA.debugLine="Dim FirstDay As Long = GetFirstDayOfWeek2(Current";
_firstday = __ref._getfirstdayofweek2 /*long*/ (null,_currentdate,__ref._m_firstdayofweek /*int*/ );
RDebugUtils.currentLine=33357842;
 //BA.debugLineNum = 33357842;BA.debugLine="Dim CurrenMonth As Int = DateTime.GetMonth(Curren";
_currenmonth = __c.DateTime.GetMonth(_currentdate);
RDebugUtils.currentLine=33357844;
 //BA.debugLineNum = 33357844;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=33357847;
 //BA.debugLineNum = 33357847;BA.debugLine="For i = 1 To 43 -1";
{
final int step15 = 1;
final int limit15 = (int) (43-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=33357849;
 //BA.debugLineNum = 33357849;BA.debugLine="Dim CurrentDay As Long = FirstDay + DateTime.Tic";
_currentday = (long) (_firstday+__c.DateTime.TicksPerDay*(_i-1)+__c.DateTime.TicksPerHour);
RDebugUtils.currentLine=33357851;
 //BA.debugLineNum = 33357851;BA.debugLine="Dim Rest As Int = (i-1)/7";
_rest = (int) ((_i-1)/(double)7);
RDebugUtils.currentLine=33357852;
 //BA.debugLineNum = 33357852;BA.debugLine="Dim test As Int = (i-1) Mod 7";
_test = (int) ((_i-1)%7);
RDebugUtils.currentLine=33357854;
 //BA.debugLineNum = 33357854;BA.debugLine="Dim xpnl_Date As B4XView = xui.CreatePanel(\"xpnl";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_MonthDate");
RDebugUtils.currentLine=33357855;
 //BA.debugLineNum = 33357855;BA.debugLine="xpnl_Date.Tag = CurrentDay";
_xpnl_date.setTag((Object)(_currentday));
RDebugUtils.currentLine=33357856;
 //BA.debugLineNum = 33357856;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent'm_BodyCo";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33357857;
 //BA.debugLineNum = 33357857;BA.debugLine="Parent.AddView(xpnl_Date,IIf(m_ShowWeekNumbers,g";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_test)),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=33357858;
 //BA.debugLineNum = 33357858;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=33357859;
 //BA.debugLineNum = 33357859;BA.debugLine="xlbl_Date.Tag = \"xlbl_Date\"";
_xlbl_date.setTag((Object)("xlbl_Date"));
RDebugUtils.currentLine=33357860;
 //BA.debugLineNum = 33357860;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=33357861;
 //BA.debugLineNum = 33357861;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=33357862;
 //BA.debugLineNum = 33357862;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=33357863;
 //BA.debugLineNum = 33357863;BA.debugLine="xlbl_Date.Text = DateTime.GetDayOfMonth(CurrentD";
_xlbl_date.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(_currentday)));
RDebugUtils.currentLine=33357866;
 //BA.debugLineNum = 33357866;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=33357868;
 //BA.debugLineNum = 33357868;BA.debugLine="If DateTime.GetMonth(CurrentDay) <> CurrenMonth";
if (__c.DateTime.GetMonth(_currentday)!=_currenmonth) { 
RDebugUtils.currentLine=33357869;
 //BA.debugLineNum = 33357869;BA.debugLine="If m_InactiveDaysVisible = False Then";
if (__ref._m_inactivedaysvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=33357870;
 //BA.debugLineNum = 33357870;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 }else {
RDebugUtils.currentLine=33357872;
 //BA.debugLineNum = 33357872;BA.debugLine="Dim Color() As Int = GetARGB(g_BodyProperties.";
_color = __ref._getargb /*int[]*/ (null,__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=33357873;
 //BA.debugLineNum = 33357873;BA.debugLine="xlbl_Date.TextColor = xui.Color_ARGB(100,Color";
_xlbl_date.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (100),_color[(int) (1)],_color[(int) (2)],_color[(int) (3)]));
 };
 };
RDebugUtils.currentLine=33357877;
 //BA.debugLineNum = 33357877;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=33357878;
 //BA.debugLineNum = 33357878;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 };
RDebugUtils.currentLine=33357883;
 //BA.debugLineNum = 33357883;BA.debugLine="CreateSelectDates(xpnl_Date,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_date,_clr);
RDebugUtils.currentLine=33357885;
 //BA.debugLineNum = 33357885;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,CurrentDay)";
if (_dateutils._issameday(ba,__c.DateTime.getNow(),_currentday)==__c.True && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=33357886;
 //BA.debugLineNum = 33357886;BA.debugLine="Dim xpnl_CurrentDay As B4XView = xui.CreatePane";
_xpnl_currentday = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_currentday = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33357887;
 //BA.debugLineNum = 33357887;BA.debugLine="xpnl_CurrentDay.SetColorAndBorder(m_CurrentDate";
_xpnl_currentday.SetColorAndBorder(__ref._m_currentdatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=33357888;
 //BA.debugLineNum = 33357888;BA.debugLine="xpnl_Date.AddView(xpnl_CurrentDay,BlockWidth/2";
_xpnl_date.AddView((android.view.View)(_xpnl_currentday.getObject()),(int) (_blockwidth/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_blockheight/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 };
RDebugUtils.currentLine=33357892;
 //BA.debugLineNum = 33357892;BA.debugLine="If m_ShowWeekNumbers = True Then";
if (__ref._m_showweeknumbers /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=33357893;
 //BA.debugLineNum = 33357893;BA.debugLine="Dim xpnl_WeekNumber As B4XView = xui.CreatePane";
_xpnl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_weeknumber = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33357894;
 //BA.debugLineNum = 33357894;BA.debugLine="Dim xlbl_WeekNumber As B4XView = CreateLabel(\"\"";
_xlbl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weeknumber = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=33357895;
 //BA.debugLineNum = 33357895;BA.debugLine="Parent.AddView(xpnl_WeekNumber,0,g_WeekNameProp";
_parent.AddView((android.view.View)(_xpnl_weeknumber.getObject()),(int) (0),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=33357896;
 //BA.debugLineNum = 33357896;BA.debugLine="xpnl_WeekNumber.AddView(xlbl_WeekNumber,0,0,g_W";
_xpnl_weeknumber.AddView((android.view.View)(_xlbl_weeknumber.getObject()),(int) (0),(int) (0),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=33357898;
 //BA.debugLineNum = 33357898;BA.debugLine="xpnl_WeekNumber.Color = g_WeekNumberProperties.";
_xpnl_weeknumber.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=33357900;
 //BA.debugLineNum = 33357900;BA.debugLine="xlbl_WeekNumber.SetTextAlignment(\"CENTER\",\"CENT";
_xlbl_weeknumber.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=33357901;
 //BA.debugLineNum = 33357901;BA.debugLine="xlbl_WeekNumber.TextColor = g_WeekNumberPropert";
_xlbl_weeknumber.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=33357902;
 //BA.debugLineNum = 33357902;BA.debugLine="xlbl_WeekNumber.Font = g_WeekNumberProperties.x";
_xlbl_weeknumber.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=33357903;
 //BA.debugLineNum = 33357903;BA.debugLine="xlbl_WeekNumber.Text = GetWeekNumberStartingFro";
_xlbl_weeknumber.setText(BA.ObjectToCharSequence(__ref._getweeknumberstartingfrommonday /*int*/ (null,_currentday)));
 };
RDebugUtils.currentLine=33357906;
 //BA.debugLineNum = 33357906;BA.debugLine="CustomDrawDay(CurrentDay,xpnl_Date)";
__ref._customdrawday /*String*/ (null,_currentday,_xpnl_date);
 }
};
RDebugUtils.currentLine=33357910;
 //BA.debugLineNum = 33357910;BA.debugLine="If m_ShowGridLines Then";
if (__ref._m_showgridlines /*boolean*/ ) { 
RDebugUtils.currentLine=33357911;
 //BA.debugLineNum = 33357911;BA.debugLine="Dim xpnl_CanvasBackground As B4XView = xui.Creat";
_xpnl_canvasbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_canvasbackground = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33357912;
 //BA.debugLineNum = 33357912;BA.debugLine="Parent.AddView(xpnl_CanvasBackground,0,0,Parent.";
_parent.AddView((android.view.View)(_xpnl_canvasbackground.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=33357913;
 //BA.debugLineNum = 33357913;BA.debugLine="xpnl_CanvasBackground.Color = xui.Color_Transpar";
_xpnl_canvasbackground.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33357921;
 //BA.debugLineNum = 33357921;BA.debugLine="Dim xcv As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=33357922;
 //BA.debugLineNum = 33357922;BA.debugLine="xcv.Initialize(xpnl_CanvasBackground)";
_xcv.Initialize(_xpnl_canvasbackground);
RDebugUtils.currentLine=33357923;
 //BA.debugLineNum = 33357923;BA.debugLine="xcv.ClearRect(xcv.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
RDebugUtils.currentLine=33357925;
 //BA.debugLineNum = 33357925;BA.debugLine="For i = 0 To 6 -1 'Add Divider Vertical";
{
final int step67 = 1;
final int limit67 = (int) (6-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=33357926;
 //BA.debugLineNum = 33357926;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumber";
_xcv.DrawLine((float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (0),(float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (_parent.getHeight()),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=33357928;
 //BA.debugLineNum = 33357928;BA.debugLine="If i < 5 Then xcv.DrawLine(0,g_WeekNameProperti";
if (_i<5) { 
_xcv.DrawLine((float) (0),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),(float) (_parent.getWidth()),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));};
 }
};
RDebugUtils.currentLine=33357931;
 //BA.debugLineNum = 33357931;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumberP";
_xcv.DrawLine((float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0))))),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,(float) (_parent.getWidth()),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=33357933;
 //BA.debugLineNum = 33357933;BA.debugLine="xcv.Invalidate";
_xcv.Invalidate();
 };
RDebugUtils.currentLine=33357936;
 //BA.debugLineNum = 33357936;BA.debugLine="End Sub";
return "";
}
public int[]  _getargb(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=38273029;
 //BA.debugLineNum = 38273029;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=38273030;
 //BA.debugLineNum = 38273030;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=38273031;
 //BA.debugLineNum = 38273031;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Private Sub AddWeekName(xpnl_Background As B4XView";
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="Dim BlockHeight As Float = g_WeekNameProperties.H";
_blockheight = __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ;
RDebugUtils.currentLine=32964611;
 //BA.debugLineNum = 32964611;BA.debugLine="Dim BlockWidth As Float = Floor(IIf(m_ShowWeekNum";
_blockwidth = (float) (__c.Floor((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : (((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))))))));
RDebugUtils.currentLine=32964613;
 //BA.debugLineNum = 32964613;BA.debugLine="Dim xlbl_WeekName As B4XView = CreateLabel(\"\")";
_xlbl_weekname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weekname = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=32964615;
 //BA.debugLineNum = 32964615;BA.debugLine="xlbl_WeekName.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_weekname.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32964616;
 //BA.debugLineNum = 32964616;BA.debugLine="xlbl_WeekName.Text = Text";
_xlbl_weekname.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=32964617;
 //BA.debugLineNum = 32964617;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=32964618;
 //BA.debugLineNum = 32964618;BA.debugLine="xlbl_WeekName.Color = g_WeekNumberProperties.Col";
_xlbl_weekname.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=32964619;
 //BA.debugLineNum = 32964619;BA.debugLine="xlbl_WeekName.Font = g_WeekNumberProperties.xFon";
_xlbl_weekname.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=32964620;
 //BA.debugLineNum = 32964620;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNumberProperties";
_xlbl_weekname.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
 }else {
RDebugUtils.currentLine=32964622;
 //BA.debugLineNum = 32964622;BA.debugLine="xlbl_WeekName.Color = g_WeekNameProperties.Color";
_xlbl_weekname.setColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=32964623;
 //BA.debugLineNum = 32964623;BA.debugLine="xlbl_WeekName.Font = g_WeekNameProperties.xFont";
_xlbl_weekname.setFont(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=32964624;
 //BA.debugLineNum = 32964624;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNameProperties.T";
_xlbl_weekname.setTextColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=32964627;
 //BA.debugLineNum = 32964627;BA.debugLine="xpnl_Background.AddView(xlbl_WeekName,IIf(i = -1,";
_xpnl_background.AddView((android.view.View)(_xlbl_weekname.getObject()),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(0)) : ((Object)((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_i)))))),(int) (0),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(_blockwidth))))),(int) (_blockheight));
RDebugUtils.currentLine=32964628;
 //BA.debugLineNum = 32964628;BA.debugLine="End Sub";
return "";
}
public long  _getfirstdayofweek2(b4a.example.ef.as_datepicker __ref,long _ticks,int _firstdayofweek) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getfirstdayofweek2", true))
	 {return ((Long) Debug.delegate(ba, "getfirstdayofweek2", new Object[] {_ticks,_firstdayofweek}));}
b4a.example.dateutils._period _p = null;
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Public Sub GetFirstDayOfWeek2(Ticks As Long,FirstD";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="p.Days = -((DateTime.GetDayOfWeek(Ticks)+FirstDay";
_p.Days = (int) (-((__c.DateTime.GetDayOfWeek(_ticks)+_firstdayofweek)%7));
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="Return DateUtils.AddPeriod(Ticks, p)";
if (true) return _dateutils._addperiod(ba,_ticks,_p);
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=38338564;
 //BA.debugLineNum = 38338564;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Private Sub CreateSelectDates(xpnl_Date As B4XView";
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="For Each View As B4XView In xpnl_Date.GetAllViews";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _xpnl_date.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=33685510;
 //BA.debugLineNum = 33685510;BA.debugLine="Dim CurrentDay As Long = xpnl_Date.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_date.getTag());
RDebugUtils.currentLine=33685512;
 //BA.debugLineNum = 33685512;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=33685513;
 //BA.debugLineNum = 33685513;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=33685514;
 //BA.debugLineNum = 33685514;BA.debugLine="CreateSelectedDate(xpnl_Date,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.True);
 }else 
{RDebugUtils.currentLine=33685515;
 //BA.debugLineNum = 33685515;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Selecte";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=33685516;
 //BA.debugLineNum = 33685516;BA.debugLine="CreateSelectedDate(xpnl_Date,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.False);
 }}
;
RDebugUtils.currentLine=33685519;
 //BA.debugLineNum = 33685519;BA.debugLine="For Each v As B4XView In xpnl_Date.GetAllViewsRe";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = _xpnl_date.GetAllViewsRecursive();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group12.Get(index12)));
RDebugUtils.currentLine=33685520;
 //BA.debugLineNum = 33685520;BA.debugLine="If \"RangeItem\" = v.Tag Then";
if (("RangeItem").equals(BA.ObjectToString(_v.getTag()))) { 
RDebugUtils.currentLine=33685521;
 //BA.debugLineNum = 33685521;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=33685522;
 //BA.debugLineNum = 33685522;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=33685526;
 //BA.debugLineNum = 33685526;BA.debugLine="If m_SelectedDate > 0 And m_SelectedDate2 > 0 An";
if (__ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0 && ((_currentday>=__ref._m_selecteddate /*long*/  && _currentday<=__ref._m_selecteddate2 /*long*/ ) || (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )))) { 
RDebugUtils.currentLine=33685527;
 //BA.debugLineNum = 33685527;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33685528;
 //BA.debugLineNum = 33685528;BA.debugLine="xpnl_selected.Tag = \"RangeItem\"";
_xpnl_selected.setTag((Object)("RangeItem"));
RDebugUtils.currentLine=33685529;
 //BA.debugLineNum = 33685529;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDat";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ )) { 
RDebugUtils.currentLine=33685530;
 //BA.debugLineNum = 33685530;BA.debugLine="xpnl_Date.AddView(xpnl_selected,xpnl_Date.Widt";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_date.getWidth()/(double)2),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else 
{RDebugUtils.currentLine=33685531;
 //BA.debugLineNum = 33685531;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Select";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )) { 
RDebugUtils.currentLine=33685532;
 //BA.debugLineNum = 33685532;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else {
RDebugUtils.currentLine=33685534;
 //BA.debugLineNum = 33685534;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),_xpnl_date.getWidth(),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }}
;
RDebugUtils.currentLine=33685537;
 //BA.debugLineNum = 33685537;BA.debugLine="xpnl_selected.Color = xui.Color_ARGB(80,clr(1),";
_xpnl_selected.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),_clr[(int) (1)],_clr[(int) (2)],_clr[(int) (3)]));
RDebugUtils.currentLine=33685538;
 //BA.debugLineNum = 33685538;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 };
 }else {
RDebugUtils.currentLine=33685542;
 //BA.debugLineNum = 33685542;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=33685543;
 //BA.debugLineNum = 33685543;BA.debugLine="MonthDateClick(xpnl_Date,False)";
__ref._monthdateclick /*String*/ (null,_xpnl_date,__c.False);
 };
 };
RDebugUtils.currentLine=33685548;
 //BA.debugLineNum = 33685548;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate)";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || ((__ref._m_selectmode /*String*/ ).equals(__ref._getselectmode_range /*String*/ (null)) && _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ))) { 
RDebugUtils.currentLine=33685549;
 //BA.debugLineNum = 33685549;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedT";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
 }else {
RDebugUtils.currentLine=33685551;
 //BA.debugLineNum = 33685551;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=33685555;
 //BA.debugLineNum = 33685555;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub GetWeekNumberStartingFromMonday (ticks";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Dim WeekDayOfFirstDayOfYear As Int = DateTime.Get";
_weekdayoffirstdayofyear = (int) (__c.DateTime.GetDayOfWeek(_dateutils._setdate(ba,__c.DateTime.GetYear(_ticks),(int) (1),(int) (1)))-1);
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="Dim FirstMondayInYear As Int = (7 + WeekDayOfFirs";
_firstmondayinyear = (int) ((7+_weekdayoffirstdayofyear-1)%7);
RDebugUtils.currentLine=38535171;
 //BA.debugLineNum = 38535171;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=38535172;
 //BA.debugLineNum = 38535172;BA.debugLine="If WeekDayOfFirstDayOfYear <> 1 Then result = res";
if (_weekdayoffirstdayofyear!=1) { 
_result = (int) (_result-1);};
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="result = result + Floor((DateTime.GetDayOfYear(ti";
_result = (int) (_result+__c.Floor((__c.DateTime.GetDayOfYear(_ticks)-1+_firstmondayinyear)/(double)7)+1);
RDebugUtils.currentLine=38535174;
 //BA.debugLineNum = 38535174;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="End Sub";
return 0;
}
public String  _customdrawday(b4a.example.ef.as_datepicker __ref,long _date,anywheresoftware.b4a.objects.B4XViewWrapper _backgroundpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawday", true))
	 {return ((String) Debug.delegate(ba, "customdrawday", new Object[] {_date,_backgroundpanel}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawday _m_customdrawday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Private Sub CustomDrawDay(Date As Long,BackgroundP";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(int) (2))) { 
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="Dim m_CustomDrawDay As ASDatePicker_CustomDrawDa";
_m_customdrawday = new b4a.example.ef.as_datepicker._asdatepicker_customdrawday();
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="m_CustomDrawDay.Initialize";
_m_customdrawday.Initialize();
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="m_CustomDrawDay.BackgroundPanel = BackgroundPane";
_m_customdrawday.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _backgroundpanel;
RDebugUtils.currentLine=37355527;
 //BA.debugLineNum = 37355527;BA.debugLine="For Each View As B4XView In BackgroundPanel.GetA";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _backgroundpanel.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="If \"xlbl_Date\" = View.Tag Then";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
RDebugUtils.currentLine=37355530;
 //BA.debugLineNum = 37355530;BA.debugLine="m_CustomDrawDay.xlbl_Date = View";
_m_customdrawday.xlbl_Date /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
 };
 }
};
RDebugUtils.currentLine=37355535;
 //BA.debugLineNum = 37355535;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawDay";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(Object)(_date),(Object)(_m_customdrawday));
 };
RDebugUtils.currentLine=37355537;
 //BA.debugLineNum = 37355537;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Private Sub AddYear(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="Dim BlockHeight As Float = xpnl_ViewPager.Height/";
_blockheight = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="Dim BlockWidth As Float = xpnl_ViewPager.Width/3";
_blockwidth = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3);
RDebugUtils.currentLine=33423365;
 //BA.debugLineNum = 33423365;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=33423367;
 //BA.debugLineNum = 33423367;BA.debugLine="For i = 1 To 13 -1";
{
final int step4 = 1;
final int limit4 = (int) (13-1);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=33423371;
 //BA.debugLineNum = 33423371;BA.debugLine="Dim Rest As Int = (i-1)/3";
_rest = (int) ((_i-1)/(double)3);
RDebugUtils.currentLine=33423372;
 //BA.debugLineNum = 33423372;BA.debugLine="Dim test As Int = (i-1) Mod 3";
_test = (int) ((_i-1)%3);
RDebugUtils.currentLine=33423374;
 //BA.debugLineNum = 33423374;BA.debugLine="Dim Text As String = \"\"";
_text = "";
RDebugUtils.currentLine=33423375;
 //BA.debugLineNum = 33423375;BA.debugLine="Dim xpnl_Date As B4XView";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33423376;
 //BA.debugLineNum = 33423376;BA.debugLine="Dim SelectThisPanel As Boolean = False";
_selectthispanel = __c.False;
RDebugUtils.currentLine=33423377;
 //BA.debugLineNum = 33423377;BA.debugLine="If m_CurrentView = getCurrentView_YearView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=33423378;
 //BA.debugLineNum = 33423378;BA.debugLine="Text = GetMonthNameByIndex(i)";
_text = __ref._getmonthnamebyindex /*String*/ (null,_i);
RDebugUtils.currentLine=33423379;
 //BA.debugLineNum = 33423379;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_YearMonth\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_YearMonth");
RDebugUtils.currentLine=33423380;
 //BA.debugLineNum = 33423380;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,__c.DateTime.GetYear(_currentdate),_i,(int) (1))));
RDebugUtils.currentLine=33423381;
 //BA.debugLineNum = 33423381;BA.debugLine="If DateTime.GetMonth(xpnl_Date.Tag) = DateTime.";
if (__c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetMonth(__c.DateTime.getNow()) && __c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=33423383;
 //BA.debugLineNum = 33423383;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_mindate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=33423384;
 //BA.debugLineNum = 33423384;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=33423387;
 //BA.debugLineNum = 33423387;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=33423388;
 //BA.debugLineNum = 33423388;BA.debugLine="Text = DateTime.GetYear(CurrentDate)+(i-1)";
_text = BA.NumberToString(__c.DateTime.GetYear(_currentdate)+(_i-1));
RDebugUtils.currentLine=33423389;
 //BA.debugLineNum = 33423389;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_DecadeYear\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_DecadeYear");
RDebugUtils.currentLine=33423390;
 //BA.debugLineNum = 33423390;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*1),(int) (1),(int) (1))));
RDebugUtils.currentLine=33423391;
 //BA.debugLineNum = 33423391;BA.debugLine="If DateTime.GetYear(xpnl_Date.Tag) = DateTime.G";
if (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=33423393;
 //BA.debugLineNum = 33423393;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And ((DateT";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && ((__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=33423394;
 //BA.debugLineNum = 33423394;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=33423397;
 //BA.debugLineNum = 33423397;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVi";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=33423398;
 //BA.debugLineNum = 33423398;BA.debugLine="Text = (DateTime.GetYear(CurrentDate)+(i-1)*10)";
_text = BA.NumberToString((__c.DateTime.GetYear(_currentdate)+(_i-1)*10))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9));
RDebugUtils.currentLine=33423399;
 //BA.debugLineNum = 33423399;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_CenturyDecade";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_CenturyDecade");
RDebugUtils.currentLine=33423400;
 //BA.debugLineNum = 33423400;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*10),(int) (1),(int) (1))));
RDebugUtils.currentLine=33423401;
 //BA.debugLineNum = 33423401;BA.debugLine="If DateTime.GetYear(DateTime.Now) >= (DateTime.";
if (__c.DateTime.GetYear(__c.DateTime.getNow())>=(__c.DateTime.GetYear(_currentdate)+(_i-1)*10) && __c.DateTime.GetYear(__c.DateTime.getNow())<=((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=33423408;
 //BA.debugLineNum = 33423408;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) || ((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=33423409;
 //BA.debugLineNum = 33423409;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }}}
;
RDebugUtils.currentLine=33423414;
 //BA.debugLineNum = 33423414;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33423415;
 //BA.debugLineNum = 33423415;BA.debugLine="Parent.AddView(xpnl_Date,BlockWidth*test,BlockHe";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) (_blockwidth*_test),(int) (_blockheight*_rest),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=33423416;
 //BA.debugLineNum = 33423416;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=33423418;
 //BA.debugLineNum = 33423418;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=33423419;
 //BA.debugLineNum = 33423419;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=33423420;
 //BA.debugLineNum = 33423420;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=33423422;
 //BA.debugLineNum = 33423422;BA.debugLine="xlbl_Date.Text = Text";
_xlbl_date.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=33423424;
 //BA.debugLineNum = 33423424;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=33423426;
 //BA.debugLineNum = 33423426;BA.debugLine="If SelectThisPanel Then";
if (_selectthispanel) { 
RDebugUtils.currentLine=33423427;
 //BA.debugLineNum = 33423427;BA.debugLine="Dim xpnl_Current As B4XView = xui.CreatePanel(\"";
_xpnl_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_current = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33423428;
 //BA.debugLineNum = 33423428;BA.debugLine="Dim StrokeWidth As Float = 2dip";
_strokewidth = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=33423429;
 //BA.debugLineNum = 33423429;BA.debugLine="xpnl_Date.AddView(xpnl_Current,StrokeWidth,Stro";
_xpnl_date.AddView((android.view.View)(_xpnl_current.getObject()),(int) (_strokewidth),(int) (_strokewidth),(int) (_blockwidth-_strokewidth*2),(int) (_blockheight-_strokewidth*2));
RDebugUtils.currentLine=33423431;
 //BA.debugLineNum = 33423431;BA.debugLine="xpnl_Current.SetColorAndBorder(xui.Color_Transp";
_xpnl_current.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (_strokewidth),__ref._m_currentdatecolor /*int*/ ,__c.DipToCurrent((int) (5)));
 };
 }
};
RDebugUtils.currentLine=33423435;
 //BA.debugLineNum = 33423435;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_yearview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_yearview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_yearview", null));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Public Sub getCurrentView_YearView As String";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Return \"YearView\"";
if (true) return "YearView";
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="End Sub";
return "";
}
public String  _getmonthnamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getmonthnamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Private Sub GetMonthNameByIndex(index As Int) As S";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="If index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="Return g_MonthNameShort.January";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .January /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="else If index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=38469636;
 //BA.debugLineNum = 38469636;BA.debugLine="Return g_MonthNameShort.February";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .February /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469637;
 //BA.debugLineNum = 38469637;BA.debugLine="else If index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=38469638;
 //BA.debugLineNum = 38469638;BA.debugLine="Return g_MonthNameShort.March";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .March /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469639;
 //BA.debugLineNum = 38469639;BA.debugLine="else If index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=38469640;
 //BA.debugLineNum = 38469640;BA.debugLine="Return g_MonthNameShort.April";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .April /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469641;
 //BA.debugLineNum = 38469641;BA.debugLine="else If index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=38469642;
 //BA.debugLineNum = 38469642;BA.debugLine="Return g_MonthNameShort.May";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .May /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469643;
 //BA.debugLineNum = 38469643;BA.debugLine="else If index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=38469644;
 //BA.debugLineNum = 38469644;BA.debugLine="Return g_MonthNameShort.June";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .June /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469645;
 //BA.debugLineNum = 38469645;BA.debugLine="else If index = 7 Then";
if (_index==7) { 
RDebugUtils.currentLine=38469646;
 //BA.debugLineNum = 38469646;BA.debugLine="Return g_MonthNameShort.July";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .July /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469647;
 //BA.debugLineNum = 38469647;BA.debugLine="else If index = 8 Then";
if (_index==8) { 
RDebugUtils.currentLine=38469648;
 //BA.debugLineNum = 38469648;BA.debugLine="Return g_MonthNameShort.August";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .August /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469649;
 //BA.debugLineNum = 38469649;BA.debugLine="else If index = 9 Then";
if (_index==9) { 
RDebugUtils.currentLine=38469650;
 //BA.debugLineNum = 38469650;BA.debugLine="Return g_MonthNameShort.September";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .September /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469651;
 //BA.debugLineNum = 38469651;BA.debugLine="else If index = 10 Then";
if (_index==10) { 
RDebugUtils.currentLine=38469652;
 //BA.debugLineNum = 38469652;BA.debugLine="Return g_MonthNameShort.October";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .October /*String*/ ;
 }else 
{RDebugUtils.currentLine=38469653;
 //BA.debugLineNum = 38469653;BA.debugLine="else If index = 11 Then";
if (_index==11) { 
RDebugUtils.currentLine=38469654;
 //BA.debugLineNum = 38469654;BA.debugLine="Return g_MonthNameShort.November";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .November /*String*/ ;
 }else {
RDebugUtils.currentLine=38469656;
 //BA.debugLineNum = 38469656;BA.debugLine="Return g_MonthNameShort.December";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .December /*String*/ ;
 }}}}}}}}}}}
;
RDebugUtils.currentLine=38469658;
 //BA.debugLineNum = 38469658;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_decadeview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_decadeview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_decadeview", null));}
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Public Sub getCurrentView_DecadeView As String";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="Return \"DecadeView\"";
if (true) return "DecadeView";
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_centuryview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_centuryview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_centuryview", null));}
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Public Sub getCurrentView_CenturyView As String";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="Return \"CenturyView\"";
if (true) return "CenturyView";
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="xiv_RefreshImage.SetLayoutAnimated(0,0,0,Width,He";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="xpnl_Header.SetLayoutAnimated(0,0,0,Width,g_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="xpnl_ViewPager.SetLayoutAnimated(0,0,g_HeaderProp";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),(int) (_width),(int) (_height-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="xASVP_Main.Base_Resize(Width,xpnl_ViewPager.Heigh";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._base_resize /*void*/ (null,_width,__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32833543;
 //BA.debugLineNum = 32833543;BA.debugLine="xpnl_Header.GetView(0).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32833544;
 //BA.debugLineNum = 32833544;BA.debugLine="xpnl_Header.GetView(1).SetLayoutAnimated(0,0,0,xp";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32833545;
 //BA.debugLineNum = 32833545;BA.debugLine="xpnl_Header.GetView(2).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2)).SetLayoutAnimated((int) (0),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32833547;
 //BA.debugLineNum = 32833547;BA.debugLine="xASVP_Main.ResetLazyLoadingPanels";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingpanels /*String*/ (null);
RDebugUtils.currentLine=32833548;
 //BA.debugLineNum = 32833548;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "base_resize"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=32833549;
 //BA.debugLineNum = 32833549;BA.debugLine="xASVP_Main.ResetLazyloadingIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingindex /*String*/ (null);
RDebugUtils.currentLine=32833550;
 //BA.debugLineNum = 32833550;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=32833551;
 //BA.debugLineNum = 32833551;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,True)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.True);
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="m_CurrentView = NewView";
__ref._m_currentview /*String*/  = _newview;
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=33488900;
 //BA.debugLineNum = 33488900;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "changeview"),(int) (250));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=33488901;
 //BA.debugLineNum = 33488901;BA.debugLine="Select Case NewView";
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
RDebugUtils.currentLine=33488903;
 //BA.debugLineNum = 33488903;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=33488905;
 //BA.debugLineNum = 33488905;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=33488907;
 //BA.debugLineNum = 33488907;BA.debugLine="CreateDecadeView";
__ref._createdecadeview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=33488909;
 //BA.debugLineNum = 33488909;BA.debugLine="CreateCenturyView";
__ref._createcenturyview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=33488911;
 //BA.debugLineNum = 33488911;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
RDebugUtils.currentLine=33488912;
 //BA.debugLineNum = 33488912;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Public Sub getCurrentView_MonthView As String";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="Return \"MonthView\"";
if (true) return "MonthView";
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="Dim YearGap As Int = 1";
_yeargap = (int) (1);
RDebugUtils.currentLine=33095684;
 //BA.debugLineNum = 33095684;BA.debugLine="Dim StartDate As Long = DateUtils.SetDate(DateTim";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=33095685;
 //BA.debugLineNum = 33095685;BA.debugLine="Dim Enddate As Long = DateUtils.SetDate(DateTime.";
_enddate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=33095687;
 //BA.debugLineNum = 33095687;BA.debugLine="If m_MinDate > 0 Then StartDate = m_MinDate";
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
RDebugUtils.currentLine=33095688;
 //BA.debugLineNum = 33095688;BA.debugLine="Dim NumberOfMonths As Int = IIf(m_MaxDate=0, Mont";
_numberofmonths = (int)(BA.ObjectToNumber(((__ref._m_maxdate /*long*/ ==0) ? ((Object)(__ref._monthbetween /*int*/ (null,_startdate,_enddate))) : ((Object)(0)))));
RDebugUtils.currentLine=33095690;
 //BA.debugLineNum = 33095690;BA.debugLine="If m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=33095691;
 //BA.debugLineNum = 33095691;BA.debugLine="Dim MonthsBetween As Int = MonthBetween(StartDat";
_monthsbetween = __ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ );
RDebugUtils.currentLine=33095692;
 //BA.debugLineNum = 33095692;BA.debugLine="Dim tmp As Period";
_tmp = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33095693;
 //BA.debugLineNum = 33095693;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
RDebugUtils.currentLine=33095694;
 //BA.debugLineNum = 33095694;BA.debugLine="tmp.Months = MonthsBetween";
_tmp.Months = _monthsbetween;
RDebugUtils.currentLine=33095695;
 //BA.debugLineNum = 33095695;BA.debugLine="If DateUtils.AddPeriod(StartDate,tmp) < m_MaxDat";
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
RDebugUtils.currentLine=33095696;
 //BA.debugLineNum = 33095696;BA.debugLine="NumberOfMonths = Max(MonthsBetween,1)";
_numberofmonths = (int) (parent.__c.Max(_monthsbetween,1));
 if (true) break;
;
RDebugUtils.currentLine=33095699;
 //BA.debugLineNum = 33095699;BA.debugLine="For i = 0 To NumberOfMonths -1";

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
RDebugUtils.currentLine=33095701;
 //BA.debugLineNum = 33095701;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33095702;
 //BA.debugLineNum = 33095702;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33095703;
 //BA.debugLineNum = 33095703;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=33095705;
 //BA.debugLineNum = 33095705;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33095706;
 //BA.debugLineNum = 33095706;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=33095707;
 //BA.debugLineNum = 33095707;BA.debugLine="p2.Months = i";
_p2.Months = _i;
RDebugUtils.currentLine=33095709;
 //BA.debugLineNum = 33095709;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=33095710;
 //BA.debugLineNum = 33095710;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate(";
_firstdayofmonth = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(_currenttime),parent.__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=33095712;
 //BA.debugLineNum = 33095712;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfMon";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
RDebugUtils.currentLine=33095714;
 //BA.debugLineNum = 33095714;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=33095720;
 //BA.debugLineNum = 33095720;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=33095725;
 //BA.debugLineNum = 33095725;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=33095726;
 //BA.debugLineNum = 33095726;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=33095728;
 //BA.debugLineNum = 33095728;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=33095729;
 //BA.debugLineNum = 33095729;BA.debugLine="m_isReady = True";
__ref._m_isready /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=33095812;
 //BA.debugLineNum = 33095812;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="Dim YearGap As Int = 10";
_yeargap = (int) (10);
RDebugUtils.currentLine=33161220;
 //BA.debugLineNum = 33161220;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=33161221;
 //BA.debugLineNum = 33161221;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=33161222;
 //BA.debugLineNum = 33161222;BA.debugLine="StartDate =	DateUtils.SetDate(DateTime.GetYear(m";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),(int) (1),(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=33161224;
 //BA.debugLineNum = 33161224;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=33161227;
 //BA.debugLineNum = 33161227;BA.debugLine="Dim FirstDateOfFuture As Long = DateUtils.SetDate";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
RDebugUtils.currentLine=33161229;
 //BA.debugLineNum = 33161229;BA.debugLine="Dim NumberOfYears As Int";
_numberofyears = 0;
RDebugUtils.currentLine=33161231;
 //BA.debugLineNum = 33161231;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=33161232;
 //BA.debugLineNum = 33161232;BA.debugLine="NumberOfYears = MonthBetween(StartDate,FirstDate";
_numberofyears = (int) (__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=33161234;
 //BA.debugLineNum = 33161234;BA.debugLine="Dim YearsBetween As Int = Ceil(MonthBetween(Star";
_yearsbetween = (int) (parent.__c.Ceil(__ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ )/(double)12));
RDebugUtils.currentLine=33161235;
 //BA.debugLineNum = 33161235;BA.debugLine="NumberOfYears = Max(YearsBetween,1)";
_numberofyears = (int) (parent.__c.Max(_yearsbetween,1));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=33161238;
 //BA.debugLineNum = 33161238;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=33161244;
 //BA.debugLineNum = 33161244;BA.debugLine="For i = 0 To NumberOfYears -1";
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
RDebugUtils.currentLine=33161246;
 //BA.debugLineNum = 33161246;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33161247;
 //BA.debugLineNum = 33161247;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33161248;
 //BA.debugLineNum = 33161248;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=33161250;
 //BA.debugLineNum = 33161250;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33161251;
 //BA.debugLineNum = 33161251;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=33161252;
 //BA.debugLineNum = 33161252;BA.debugLine="p2.Years = i";
_p2.Years = _i;
RDebugUtils.currentLine=33161254;
 //BA.debugLineNum = 33161254;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=33161257;
 //BA.debugLineNum = 33161257;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=33161259;
 //BA.debugLineNum = 33161259;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=33161265;
 //BA.debugLineNum = 33161265;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createyearview"),(int) (0));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=33161275;
 //BA.debugLineNum = 33161275;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=33161276;
 //BA.debugLineNum = 33161276;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=33161278;
 //BA.debugLineNum = 33161278;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33226758;
 //BA.debugLineNum = 33226758;BA.debugLine="Dim CurrentDecade As Long = DateUtils.SetDate(Dat";
_currentdecade = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ ),(int) (1),(int) (1))),(int) (1),(int) (1));
RDebugUtils.currentLine=33226760;
 //BA.debugLineNum = 33226760;BA.debugLine="Dim YearGap As Int = 50";
_yeargap = (int) (50);
RDebugUtils.currentLine=33226762;
 //BA.debugLineNum = 33226762;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=33226763;
 //BA.debugLineNum = 33226763;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=33226764;
 //BA.debugLineNum = 33226764;BA.debugLine="StartDate =	DateUtils.SetDate(1400,12,31)";
_startdate = parent._dateutils._setdate(ba,(int) (1400),(int) (12),(int) (31));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=33226766;
 //BA.debugLineNum = 33226766;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=33226769;
 //BA.debugLineNum = 33226769;BA.debugLine="Dim FirstDateOfFuture As Long";
_firstdateoffuture = 0L;
RDebugUtils.currentLine=33226770;
 //BA.debugLineNum = 33226770;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=33226771;
 //BA.debugLineNum = 33226771;BA.debugLine="FirstDateOfFuture = DateUtils.SetDate(DateTime.G";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=33226773;
 //BA.debugLineNum = 33226773;BA.debugLine="FirstDateOfFuture = m_MaxDate";
_firstdateoffuture = __ref._m_maxdate /*long*/ ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=33226777;
 //BA.debugLineNum = 33226777;BA.debugLine="Dim NumberOfDecades As Int = Ceil(Max((MonthBetwe";
_numberofdecades = (int) (parent.__c.Ceil(parent.__c.Max((__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12)/(double)10,1)));
RDebugUtils.currentLine=33226779;
 //BA.debugLineNum = 33226779;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=33226785;
 //BA.debugLineNum = 33226785;BA.debugLine="For i = 0 To NumberOfDecades -1";
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
RDebugUtils.currentLine=33226787;
 //BA.debugLineNum = 33226787;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33226788;
 //BA.debugLineNum = 33226788;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33226789;
 //BA.debugLineNum = 33226789;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=33226791;
 //BA.debugLineNum = 33226791;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33226792;
 //BA.debugLineNum = 33226792;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=33226793;
 //BA.debugLineNum = 33226793;BA.debugLine="p2.Years = i*10";
_p2.Years = (int) (_i*10);
RDebugUtils.currentLine=33226795;
 //BA.debugLineNum = 33226795;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=33226798;
 //BA.debugLineNum = 33226798;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=33226800;
 //BA.debugLineNum = 33226800;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=33226802;
 //BA.debugLineNum = 33226802;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=33226806;
 //BA.debugLineNum = 33226806;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createdecadeview"),(int) (0));
this.state = 31;
return;
case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=33226807;
 //BA.debugLineNum = 33226807;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=33226808;
 //BA.debugLineNum = 33226808;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=33226810;
 //BA.debugLineNum = 33226810;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="Dim CurrentCenturyStart As Long = DateUtils.SetDa";
_currentcenturystart = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-parent.__c.Round(((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100)-((int) ((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100))))*100)),(int) (1),(int) (1));
RDebugUtils.currentLine=33292294;
 //BA.debugLineNum = 33292294;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33292295;
 //BA.debugLineNum = 33292295;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=33292297;
 //BA.debugLineNum = 33292297;BA.debugLine="Dim FirstDateOfPast As Long = DateUtils.SetDate(1";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (1),(int) (1),(int) (1));
RDebugUtils.currentLine=33292299;
 //BA.debugLineNum = 33292299;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=33292300;
 //BA.debugLineNum = 33292300;BA.debugLine="If m_MinDate > 0 Then";
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
RDebugUtils.currentLine=33292301;
 //BA.debugLineNum = 33292301;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_mindate /*long*/ )-40),(int) (1),(int) (1));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=33292303;
 //BA.debugLineNum = 33292303;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
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
RDebugUtils.currentLine=33292320;
 //BA.debugLineNum = 33292320;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=33292326;
 //BA.debugLineNum = 33292326;BA.debugLine="Dim NumberOfCentries As Int = 80";
_numberofcentries = (int) (80);
RDebugUtils.currentLine=33292327;
 //BA.debugLineNum = 33292327;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then NumberOfCe";
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
RDebugUtils.currentLine=33292329;
 //BA.debugLineNum = 33292329;BA.debugLine="For i = 0 To NumberOfCentries -1";
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
RDebugUtils.currentLine=33292331;
 //BA.debugLineNum = 33292331;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33292332;
 //BA.debugLineNum = 33292332;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33292333;
 //BA.debugLineNum = 33292333;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=33292335;
 //BA.debugLineNum = 33292335;BA.debugLine="p.Years = i*10*12";
_p.Years = (int) (_i*10*12);
RDebugUtils.currentLine=33292336;
 //BA.debugLineNum = 33292336;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(Fi";
_currenttime = parent._dateutils._addperiod(ba,_firstdateofpast,_p);
RDebugUtils.currentLine=33292337;
 //BA.debugLineNum = 33292337;BA.debugLine="If i > 0 Then";
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
RDebugUtils.currentLine=33292338;
 //BA.debugLineNum = 33292338;BA.debugLine="CurrentTime = DateUtils.SetDate((DateTime.GetYe";
_currenttime = parent._dateutils._setdate(ba,(int) ((parent.__c.DateTime.GetYear(_currenttime)-parent.__c.Round(((parent.__c.DateTime.GetYear(_currenttime)/(double)100)-((int) ((parent.__c.DateTime.GetYear(_currenttime)/(double)100))))*100))+1),(int) (1),(int) (1));
RDebugUtils.currentLine=33292339;
 //BA.debugLineNum = 33292339;BA.debugLine="If DateTime.GetMonth(CurrentTime) = 1 Then";
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
RDebugUtils.currentLine=33292340;
 //BA.debugLineNum = 33292340;BA.debugLine="CurrentTime = DateUtils.SetDate(DateTime.GetYe";
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
RDebugUtils.currentLine=33292345;
 //BA.debugLineNum = 33292345;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=33292347;
 //BA.debugLineNum = 33292347;BA.debugLine="If DateTime.GetYear(CurrentCenturyStart) = DateT";
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
RDebugUtils.currentLine=33292353;
 //BA.debugLineNum = 33292353;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createcenturyview"),(int) (0));
this.state = 37;
return;
case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=33292354;
 //BA.debugLineNum = 33292354;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=33292355;
 //BA.debugLineNum = 33292355;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=33292357;
 //BA.debugLineNum = 33292357;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="Type ASDatePicker_MonthNameShort(January As Strin";
;
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="Type ASDatePicker_WeekNameShort(Monday As String,";
;
RDebugUtils.currentLine=32309253;
 //BA.debugLineNum = 32309253;BA.debugLine="Type ASDatePicker_HeaderProperties(Height As Floa";
;
RDebugUtils.currentLine=32309254;
 //BA.debugLineNum = 32309254;BA.debugLine="Type ASDatePicker_BodyProperties(xFont As B4XFont";
;
RDebugUtils.currentLine=32309255;
 //BA.debugLineNum = 32309255;BA.debugLine="Type ASDatePicker_CustomDrawDay(BackgroundPanel A";
;
RDebugUtils.currentLine=32309256;
 //BA.debugLineNum = 32309256;BA.debugLine="Type ASDatePicker_CustomDrawHeader(BackgroundPane";
;
RDebugUtils.currentLine=32309257;
 //BA.debugLineNum = 32309257;BA.debugLine="Type ASDatePicker_WeekNumberProperties(Width As F";
;
RDebugUtils.currentLine=32309258;
 //BA.debugLineNum = 32309258;BA.debugLine="Type ASDatePicker_WeekNameProperties(Color As Int";
;
RDebugUtils.currentLine=32309260;
 //BA.debugLineNum = 32309260;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=32309261;
 //BA.debugLineNum = 32309261;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=32309262;
 //BA.debugLineNum = 32309262;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32309263;
 //BA.debugLineNum = 32309263;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=32309264;
 //BA.debugLineNum = 32309264;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=32309266;
 //BA.debugLineNum = 32309266;BA.debugLine="Private m_isReady As Boolean = False";
_m_isready = __c.False;
RDebugUtils.currentLine=32309268;
 //BA.debugLineNum = 32309268;BA.debugLine="Private g_HeaderProperties As ASDatePicker_Header";
_g_headerproperties = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=32309269;
 //BA.debugLineNum = 32309269;BA.debugLine="Private g_BodyProperties As ASDatePicker_BodyProp";
_g_bodyproperties = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=32309271;
 //BA.debugLineNum = 32309271;BA.debugLine="Private g_MonthNameShort As ASDatePicker_MonthNam";
_g_monthnameshort = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=32309272;
 //BA.debugLineNum = 32309272;BA.debugLine="Private g_WeekNameShort As ASDatePicker_WeekNameS";
_g_weeknameshort = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=32309273;
 //BA.debugLineNum = 32309273;BA.debugLine="Private g_WeekNumberProperties As ASDatePicker_We";
_g_weeknumberproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=32309274;
 //BA.debugLineNum = 32309274;BA.debugLine="Private g_WeekNameProperties As ASDatePicker_Week";
_g_weeknameproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=32309276;
 //BA.debugLineNum = 32309276;BA.debugLine="Private xASVP_Main As ASViewPager";
_xasvp_main = new b4a.example.ef.asviewpager();
RDebugUtils.currentLine=32309278;
 //BA.debugLineNum = 32309278;BA.debugLine="Private xpnl_LoadingPanel As B4XView";
_xpnl_loadingpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32309279;
 //BA.debugLineNum = 32309279;BA.debugLine="Private xpnl_Header As B4XView";
_xpnl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32309280;
 //BA.debugLineNum = 32309280;BA.debugLine="Private xpnl_ViewPager As B4XView";
_xpnl_viewpager = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32309281;
 //BA.debugLineNum = 32309281;BA.debugLine="Private xpnl_SelectedDate As B4XView";
_xpnl_selecteddate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32309282;
 //BA.debugLineNum = 32309282;BA.debugLine="Private xpnl_SelectedDate2 As B4XView";
_xpnl_selecteddate2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32309287;
 //BA.debugLineNum = 32309287;BA.debugLine="Private m_HeaderColor As Int";
_m_headercolor = 0;
RDebugUtils.currentLine=32309288;
 //BA.debugLineNum = 32309288;BA.debugLine="Private m_BodyColor As Int";
_m_bodycolor = 0;
RDebugUtils.currentLine=32309289;
 //BA.debugLineNum = 32309289;BA.debugLine="Private m_CurrentDateColor As Int";
_m_currentdatecolor = 0;
RDebugUtils.currentLine=32309290;
 //BA.debugLineNum = 32309290;BA.debugLine="Private m_SelectedDateColor As Int";
_m_selecteddatecolor = 0;
RDebugUtils.currentLine=32309291;
 //BA.debugLineNum = 32309291;BA.debugLine="Private m_MouseHoverFeedback As Boolean 'Ignore";
_m_mousehoverfeedback = false;
RDebugUtils.currentLine=32309292;
 //BA.debugLineNum = 32309292;BA.debugLine="Private m_SelectedDate As Long";
_m_selecteddate = 0L;
RDebugUtils.currentLine=32309293;
 //BA.debugLineNum = 32309293;BA.debugLine="Private m_SelectedDate2 As Long";
_m_selecteddate2 = 0L;
RDebugUtils.currentLine=32309294;
 //BA.debugLineNum = 32309294;BA.debugLine="Private m_ShowWeekNumbers As Boolean";
_m_showweeknumbers = false;
RDebugUtils.currentLine=32309295;
 //BA.debugLineNum = 32309295;BA.debugLine="Private m_FirstDayOfWeek As Int = 5 'Monday";
_m_firstdayofweek = (int) (5);
RDebugUtils.currentLine=32309296;
 //BA.debugLineNum = 32309296;BA.debugLine="Private m_ShowGridLines As Boolean";
_m_showgridlines = false;
RDebugUtils.currentLine=32309297;
 //BA.debugLineNum = 32309297;BA.debugLine="Private m_GridLineColor As Int";
_m_gridlinecolor = 0;
RDebugUtils.currentLine=32309298;
 //BA.debugLineNum = 32309298;BA.debugLine="Private m_ThemeChangeTransition As String";
_m_themechangetransition = "";
RDebugUtils.currentLine=32309300;
 //BA.debugLineNum = 32309300;BA.debugLine="Private m_CurrentView As String";
_m_currentview = "";
RDebugUtils.currentLine=32309301;
 //BA.debugLineNum = 32309301;BA.debugLine="Private m_StartDate As Long";
_m_startdate = 0L;
RDebugUtils.currentLine=32309302;
 //BA.debugLineNum = 32309302;BA.debugLine="Private m_InactiveDaysVisible As Boolean";
_m_inactivedaysvisible = false;
RDebugUtils.currentLine=32309303;
 //BA.debugLineNum = 32309303;BA.debugLine="Private m_MinDate,m_MaxDate As Long";
_m_mindate = 0L;
_m_maxdate = 0L;
RDebugUtils.currentLine=32309304;
 //BA.debugLineNum = 32309304;BA.debugLine="Private m_SelectMode As String";
_m_selectmode = "";
RDebugUtils.currentLine=32309306;
 //BA.debugLineNum = 32309306;BA.debugLine="Private xiv_RefreshImage As B4XView";
_xiv_refreshimage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32309308;
 //BA.debugLineNum = 32309308;BA.debugLine="Type AS_DatePicker_Theme(SelectedTextColor As Int";
;
RDebugUtils.currentLine=32309310;
 //BA.debugLineNum = 32309310;BA.debugLine="End Sub";
return "";
}
public String  _clearselections(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "clearselections", true))
	 {return ((String) Debug.delegate(ba, "clearselections", null));}
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Public Sub ClearSelections";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _createasdatepicker_bodyproperties(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,int _selectedtextcolor,float _currentandselecteddayheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_bodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "createasdatepicker_bodyproperties", new Object[] {_xfont,_textcolor,_selectedtextcolor,_currentandselecteddayheight}));}
b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _t1 = null;
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub CreateASDatePicker_BodyProperties (xFon";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Dim t1 As ASDatePicker_BodyProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=39124995;
 //BA.debugLineNum = 39124995;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=39124996;
 //BA.debugLineNum = 39124996;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=39124997;
 //BA.debugLineNum = 39124997;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
_t1.SelectedTextColor /*int*/  = _selectedtextcolor;
RDebugUtils.currentLine=39124998;
 //BA.debugLineNum = 39124998;BA.debugLine="t1.CurrentAndSelectedDayHeight = CurrentAndSelect";
_t1.CurrentAndSelectedDayHeight /*float*/  = _currentandselecteddayheight;
RDebugUtils.currentLine=39124999;
 //BA.debugLineNum = 39124999;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=39125000;
 //BA.debugLineNum = 39125000;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _createasdatepicker_headerproperties(b4a.example.ef.as_datepicker __ref,float _height,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _buttoniconsize,boolean _arrowsvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_headerproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "createasdatepicker_headerproperties", new Object[] {_height,_xfont,_textcolor,_buttoniconsize,_arrowsvisible}));}
b4a.example.ef.as_datepicker._asdatepicker_headerproperties _t1 = null;
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub CreateASDatePicker_HeaderProperties (He";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Dim t1 As ASDatePicker_HeaderProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=38993925;
 //BA.debugLineNum = 38993925;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=38993926;
 //BA.debugLineNum = 38993926;BA.debugLine="t1.ButtonIconSize = ButtonIconSize";
_t1.ButtonIconSize /*float*/  = _buttoniconsize;
RDebugUtils.currentLine=38993927;
 //BA.debugLineNum = 38993927;BA.debugLine="t1.ArrowsVisible = ArrowsVisible";
_t1.ArrowsVisible /*boolean*/  = _arrowsvisible;
RDebugUtils.currentLine=38993928;
 //BA.debugLineNum = 38993928;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=38993929;
 //BA.debugLineNum = 38993929;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _createasdatepicker_monthnameshort(b4a.example.ef.as_datepicker __ref,String _january,String _february,String _march,String _april,String _may,String _june,String _july,String _august,String _september,String _october,String _november,String _december) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_monthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "createasdatepicker_monthnameshort", new Object[] {_january,_february,_march,_april,_may,_june,_july,_august,_september,_october,_november,_december}));}
b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _t1 = null;
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Public Sub CreateASDatePicker_MonthNameShort (Janu";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Dim t1 As ASDatePicker_MonthNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="t1.January = January";
_t1.January /*String*/  = _january;
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="t1.February = February";
_t1.February /*String*/  = _february;
RDebugUtils.currentLine=38797317;
 //BA.debugLineNum = 38797317;BA.debugLine="t1.March = March";
_t1.March /*String*/  = _march;
RDebugUtils.currentLine=38797318;
 //BA.debugLineNum = 38797318;BA.debugLine="t1.April = April";
_t1.April /*String*/  = _april;
RDebugUtils.currentLine=38797319;
 //BA.debugLineNum = 38797319;BA.debugLine="t1.May = May";
_t1.May /*String*/  = _may;
RDebugUtils.currentLine=38797320;
 //BA.debugLineNum = 38797320;BA.debugLine="t1.June = June";
_t1.June /*String*/  = _june;
RDebugUtils.currentLine=38797321;
 //BA.debugLineNum = 38797321;BA.debugLine="t1.July = July";
_t1.July /*String*/  = _july;
RDebugUtils.currentLine=38797322;
 //BA.debugLineNum = 38797322;BA.debugLine="t1.August = August";
_t1.August /*String*/  = _august;
RDebugUtils.currentLine=38797323;
 //BA.debugLineNum = 38797323;BA.debugLine="t1.September = September";
_t1.September /*String*/  = _september;
RDebugUtils.currentLine=38797324;
 //BA.debugLineNum = 38797324;BA.debugLine="t1.October = October";
_t1.October /*String*/  = _october;
RDebugUtils.currentLine=38797325;
 //BA.debugLineNum = 38797325;BA.debugLine="t1.November = November";
_t1.November /*String*/  = _november;
RDebugUtils.currentLine=38797326;
 //BA.debugLineNum = 38797326;BA.debugLine="t1.December = December";
_t1.December /*String*/  = _december;
RDebugUtils.currentLine=38797327;
 //BA.debugLineNum = 38797327;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=38797328;
 //BA.debugLineNum = 38797328;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _createasdatepicker_weeknameproperties(b4a.example.ef.as_datepicker __ref,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "createasdatepicker_weeknameproperties", new Object[] {_color,_xfont,_textcolor,_height}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _t1 = null;
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Public Sub CreateASDatePicker_WeekNameProperties (";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Dim t1 As ASDatePicker_WeekNameProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=39059461;
 //BA.debugLineNum = 39059461;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=39059462;
 //BA.debugLineNum = 39059462;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=39059463;
 //BA.debugLineNum = 39059463;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=39059464;
 //BA.debugLineNum = 39059464;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _createasdatepicker_weeknameshort(b4a.example.ef.as_datepicker __ref,String _monday,String _tuesday,String _wednesday,String _thursday,String _friday,String _saturday,String _sunday) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "createasdatepicker_weeknameshort", new Object[] {_monday,_tuesday,_wednesday,_thursday,_friday,_saturday,_sunday}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _t1 = null;
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Public Sub CreateASDatePicker_WeekNameShort (Monda";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Dim t1 As ASDatePicker_WeekNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="t1.Monday = Monday";
_t1.Monday /*String*/  = _monday;
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="t1.Tuesday = Tuesday";
_t1.Tuesday /*String*/  = _tuesday;
RDebugUtils.currentLine=38862853;
 //BA.debugLineNum = 38862853;BA.debugLine="t1.Wednesday = Wednesday";
_t1.Wednesday /*String*/  = _wednesday;
RDebugUtils.currentLine=38862854;
 //BA.debugLineNum = 38862854;BA.debugLine="t1.Thursday = Thursday";
_t1.Thursday /*String*/  = _thursday;
RDebugUtils.currentLine=38862855;
 //BA.debugLineNum = 38862855;BA.debugLine="t1.Friday = Friday";
_t1.Friday /*String*/  = _friday;
RDebugUtils.currentLine=38862856;
 //BA.debugLineNum = 38862856;BA.debugLine="t1.Saturday = Saturday";
_t1.Saturday /*String*/  = _saturday;
RDebugUtils.currentLine=38862857;
 //BA.debugLineNum = 38862857;BA.debugLine="t1.Sunday = Sunday";
_t1.Sunday /*String*/  = _sunday;
RDebugUtils.currentLine=38862858;
 //BA.debugLineNum = 38862858;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=38862859;
 //BA.debugLineNum = 38862859;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _createasdatepicker_weeknumberproperties(b4a.example.ef.as_datepicker __ref,float _width,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "createasdatepicker_weeknumberproperties", new Object[] {_width,_color,_xfont,_textcolor,_text}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _t1 = null;
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Public Sub CreateASDatePicker_WeekNumberProperties";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Dim t1 As ASDatePicker_WeekNumberProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=38928387;
 //BA.debugLineNum = 38928387;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=38928389;
 //BA.debugLineNum = 38928389;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=38928390;
 //BA.debugLineNum = 38928390;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=38928391;
 //BA.debugLineNum = 38928391;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
RDebugUtils.currentLine=38928392;
 //BA.debugLineNum = 38928392;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=38928393;
 //BA.debugLineNum = 38928393;BA.debugLine="End Sub";
return null;
}
public int  _monthbetween(b4a.example.ef.as_datepicker __ref,long _date1,long _date2) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "monthbetween", true))
	 {return ((Integer) Debug.delegate(ba, "monthbetween", new Object[] {_date1,_date2}));}
long _y = 0L;
long _m = 0L;
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Private Sub MonthBetween(Date1 As Long, Date2 As L";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Dim y As Long = DateTime.GetYear(Date2) - DateTim";
_y = (long) (__c.DateTime.GetYear(_date2)-__c.DateTime.GetYear(_date1));
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="Dim m As Long = y * 12";
_m = (long) (_y*12);
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="m = m - DateTime.GetMonth(Date1)";
_m = (long) (_m-__c.DateTime.GetMonth(_date1));
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="m = m + DateTime.GetMonth(Date2)";
_m = (long) (_m+__c.DateTime.GetMonth(_date2));
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="Return m";
if (true) return (int) (_m);
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Private Sub CreateHeader";
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=32899076;
 //BA.debugLineNum = 32899076;BA.debugLine="Dim xlbl_Header As B4XView = CreateLabel(\"xlbl_He";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_Header");
RDebugUtils.currentLine=32899077;
 //BA.debugLineNum = 32899077;BA.debugLine="xpnl_Header.AddView(xlbl_Header,xpnl_Header.Heigh";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_header.getObject()),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32899079;
 //BA.debugLineNum = 32899079;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = CreateLabel(\"xlbl";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowLeft");
RDebugUtils.currentLine=32899080;
 //BA.debugLineNum = 32899080;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowLeft,0,0,xpnl_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowleft.getObject()),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32899082;
 //BA.debugLineNum = 32899082;BA.debugLine="Dim xlbl_ArrowRight As B4XView = CreateLabel(\"xlb";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowRight");
RDebugUtils.currentLine=32899083;
 //BA.debugLineNum = 32899083;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowRight,xpnl_Header.W";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowright.getObject()),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32899085;
 //BA.debugLineNum = 32899085;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=32899086;
 //BA.debugLineNum = 32899086;BA.debugLine="xlbl_ArrowLeft.Text = Chr(0xE314)";
_xlbl_arrowleft.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe314))));
RDebugUtils.currentLine=32899087;
 //BA.debugLineNum = 32899087;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32899088;
 //BA.debugLineNum = 32899088;BA.debugLine="xlbl_ArrowLeft.SetTextAlignment(\"CENTER\",\"CENTER\"";
_xlbl_arrowleft.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32899089;
 //BA.debugLineNum = 32899089;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=32899091;
 //BA.debugLineNum = 32899091;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=32899092;
 //BA.debugLineNum = 32899092;BA.debugLine="xlbl_ArrowRight.Text = Chr(0xE315)";
_xlbl_arrowright.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe315))));
RDebugUtils.currentLine=32899093;
 //BA.debugLineNum = 32899093;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32899094;
 //BA.debugLineNum = 32899094;BA.debugLine="xlbl_ArrowRight.SetTextAlignment(\"CENTER\",\"CENTER";
_xlbl_arrowright.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32899095;
 //BA.debugLineNum = 32899095;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=32899097;
 //BA.debugLineNum = 32899097;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=32899098;
 //BA.debugLineNum = 32899098;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(m_Start";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,__ref._m_startdate /*long*/ )+" "+BA.NumberToString(__c.DateTime.GetYear(__ref._m_startdate /*long*/ ))));
RDebugUtils.currentLine=32899099;
 //BA.debugLineNum = 32899099;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32899100;
 //BA.debugLineNum = 32899100;BA.debugLine="xlbl_Header.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_header.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32899102;
 //BA.debugLineNum = 32899102;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="iv.Initialize(EventName)";
_iv.Initialize(ba,_eventname);
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="End Sub";
return null;
}
public String  _createselecteddate(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _firstdatepanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createselecteddate", true))
	 {return ((String) Debug.delegate(ba, "createselecteddate", new Object[] {_xpnl_monthdate,_firstdatepanel}));}
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Private Sub CreateSelectedDate(xpnl_MonthDate As B";
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="If FirstDatePanel Then";
if (_firstdatepanel) { 
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedDa";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate.P";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=38207495;
 //BA.debugLineNum = 38207495;BA.debugLine="xpnl_SelectedDate.RemoveViewFromParent";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=38207498;
 //BA.debugLineNum = 38207498;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=38207499;
 //BA.debugLineNum = 38207499;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=38207500;
 //BA.debugLineNum = 38207500;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=38207501;
 //BA.debugLineNum = 38207501;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
RDebugUtils.currentLine=38207502;
 //BA.debugLineNum = 38207502;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 }else {
RDebugUtils.currentLine=38207504;
 //BA.debugLineNum = 38207504;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=38207505;
 //BA.debugLineNum = 38207505;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate2.";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group16.Get(index16)));
RDebugUtils.currentLine=38207506;
 //BA.debugLineNum = 38207506;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=38207508;
 //BA.debugLineNum = 38207508;BA.debugLine="xpnl_SelectedDate2.RemoveViewFromParent";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=38207510;
 //BA.debugLineNum = 38207510;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=38207511;
 //BA.debugLineNum = 38207511;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=38207512;
 //BA.debugLineNum = 38207512;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=38207513;
 //BA.debugLineNum = 38207513;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=38207514;
 //BA.debugLineNum = 38207514;BA.debugLine="xpnl_SelectedDate2 = xpnl_selected";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
RDebugUtils.currentLine=38207517;
 //BA.debugLineNum = 38207517;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Private Sub MonthDateClick(xpnl_MonthDate As B4XVi";
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="Dim CurrentDay As Long = xpnl_MonthDate.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime.";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
if (true) return "";};
RDebugUtils.currentLine=38141957;
 //BA.debugLineNum = 38141957;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="For Each View As B4XView In xpnl_MonthDate.GetAll";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _xpnl_monthdate.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=38141959;
 //BA.debugLineNum = 38141959;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=38141962;
 //BA.debugLineNum = 38141962;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=38141964;
 //BA.debugLineNum = 38141964;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=38141965;
 //BA.debugLineNum = 38141965;BA.debugLine="If m_SelectedDate = 0 Or xpnl_MonthDate.Tag <= m";
if (__ref._m_selecteddate /*long*/ ==0 || (double)(BA.ObjectToNumber(_xpnl_monthdate.getTag()))<=__ref._m_selecteddate /*long*/ ) { 
RDebugUtils.currentLine=38141966;
 //BA.debugLineNum = 38141966;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate,xpnl_Mont";
if (_dateutils._issameday(ba,__ref._m_selecteddate /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=38141967;
 //BA.debugLineNum = 38141967;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=38141968;
 //BA.debugLineNum = 38141968;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
RDebugUtils.currentLine=38141969;
 //BA.debugLineNum = 38141969;BA.debugLine="If m_SelectedDate > m_SelectedDate2 Then";
if (__ref._m_selecteddate /*long*/ >__ref._m_selecteddate2 /*long*/ ) { 
RDebugUtils.currentLine=38141970;
 //BA.debugLineNum = 38141970;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Select";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=38141971;
 //BA.debugLineNum = 38141971;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=38141974;
 //BA.debugLineNum = 38141974;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_Selected";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=38141975;
 //BA.debugLineNum = 38141975;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=38141978;
 //BA.debugLineNum = 38141978;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate2,xpnl_Mon";
if (_dateutils._issameday(ba,__ref._m_selecteddate2 /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=38141979;
 //BA.debugLineNum = 38141979;BA.debugLine="m_SelectedDate2 = xpnl_MonthDate.Tag";
__ref._m_selecteddate2 /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=38141980;
 //BA.debugLineNum = 38141980;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.False);
 }else {
RDebugUtils.currentLine=38141982;
 //BA.debugLineNum = 38141982;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Selecte";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=38141983;
 //BA.debugLineNum = 38141983;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 };
RDebugUtils.currentLine=38141986;
 //BA.debugLineNum = 38141986;BA.debugLine="RefreshSelectedDate";
__ref._refreshselecteddate /*String*/ (null);
 }else {
RDebugUtils.currentLine=38141988;
 //BA.debugLineNum = 38141988;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
 };
RDebugUtils.currentLine=38141991;
 //BA.debugLineNum = 38141991;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedTe";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
RDebugUtils.currentLine=38141993;
 //BA.debugLineNum = 38141993;BA.debugLine="If WithEvent = True Then";
if (_withevent==__c.True) { 
RDebugUtils.currentLine=38141994;
 //BA.debugLineNum = 38141994;BA.debugLine="If m_SelectMode = \"Range\" And m_SelectedDate > 0";
if ((__ref._m_selectmode /*String*/ ).equals("Range") && __ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0) { 
RDebugUtils.currentLine=38141995;
 //BA.debugLineNum = 38141995;BA.debugLine="SelectedDateRangeChanged";
__ref._selecteddaterangechanged /*String*/ (null);
 }else {
RDebugUtils.currentLine=38141997;
 //BA.debugLineNum = 38141997;BA.debugLine="SelectedDateChanged(xpnl_MonthDate.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()));
 };
 };
RDebugUtils.currentLine=38142000;
 //BA.debugLineNum = 38142000;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_range(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_range", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_range", null));}
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Public Sub getSelectMode_Range As String";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="Return \"Range\"";
if (true) return "Range";
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="End Sub";
return "";
}
public String  _customdrawheader(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawheader", true))
	 {return ((String) Debug.delegate(ba, "customdrawheader", new Object[] {_date}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawheader _m_customdrawheader = null;
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Private Sub CustomDrawHeader(date As Long)";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(int) (2))) { 
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="Dim m_CustomDrawHeader As ASDatePicker_CustomDra";
_m_customdrawheader = new b4a.example.ef.as_datepicker._asdatepicker_customdrawheader();
RDebugUtils.currentLine=37158916;
 //BA.debugLineNum = 37158916;BA.debugLine="m_CustomDrawHeader.Initialize";
_m_customdrawheader.Initialize();
RDebugUtils.currentLine=37158917;
 //BA.debugLineNum = 37158917;BA.debugLine="m_CustomDrawHeader.BackgroundPanel = xpnl_Header";
_m_customdrawheader.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=37158918;
 //BA.debugLineNum = 37158918;BA.debugLine="m_CustomDrawHeader.xlbl_Text = xpnl_Header.GetVi";
_m_customdrawheader.xlbl_Text /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=37158919;
 //BA.debugLineNum = 37158919;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowLeft = xpnl_Header.";
_m_customdrawheader.xlbl_ArrowLeft /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=37158920;
 //BA.debugLineNum = 37158920;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowRight = xpnl_Header";
_m_customdrawheader.xlbl_ArrowRight /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=37158922;
 //BA.debugLineNum = 37158922;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawHea";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(Object)(_date),(Object)(_m_customdrawheader));
 };
RDebugUtils.currentLine=37158924;
 //BA.debugLineNum = 37158924;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.as_datepicker __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="IniProps(Props)";
__ref._iniprops /*String*/ (null,_props);
RDebugUtils.currentLine=32636933;
 //BA.debugLineNum = 32636933;BA.debugLine="m_StartDate = DateTime.Now";
__ref._m_startdate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=32636936;
 //BA.debugLineNum = 32636936;BA.debugLine="xpnl_LoadingPanel = xui.CreatePanel(\"\")";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32636937;
 //BA.debugLineNum = 32636937;BA.debugLine="xpnl_LoadingPanel.Visible = True";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=32636938;
 //BA.debugLineNum = 32636938;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=32636939;
 //BA.debugLineNum = 32636939;BA.debugLine="mBase.AddView(xpnl_LoadingPanel,0,0,mBase.Width,m";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32636941;
 //BA.debugLineNum = 32636941;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32636942;
 //BA.debugLineNum = 32636942;BA.debugLine="mBase.AddView(xpnl_Header,0,0,mBase.Width,g_Heade";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=32636944;
 //BA.debugLineNum = 32636944;BA.debugLine="xpnl_ViewPager = xui.CreatePanel(\"\")";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32636945;
 //BA.debugLineNum = 32636945;BA.debugLine="mBase.AddView(xpnl_ViewPager,0,g_HeaderProperties";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=32636947;
 //BA.debugLineNum = 32636947;BA.debugLine="ini_viewpager";
__ref._ini_viewpager /*String*/ (null);
RDebugUtils.currentLine=32636948;
 //BA.debugLineNum = 32636948;BA.debugLine="CreateHeader";
__ref._createheader /*String*/ (null);
RDebugUtils.currentLine=32636949;
 //BA.debugLineNum = 32636949;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=32636950;
 //BA.debugLineNum = 32636950;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=32636951;
 //BA.debugLineNum = 32636951;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 }else 
{RDebugUtils.currentLine=32636952;
 //BA.debugLineNum = 32636952;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=32636953;
 //BA.debugLineNum = 32636953;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=32636954;
 //BA.debugLineNum = 32636954;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 }}
;
RDebugUtils.currentLine=32636957;
 //BA.debugLineNum = 32636957;BA.debugLine="xiv_RefreshImage = CreateImageView(\"\")";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=32636958;
 //BA.debugLineNum = 32636958;BA.debugLine="xiv_RefreshImage.Visible = False";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=32636959;
 //BA.debugLineNum = 32636959;BA.debugLine="mBase.AddView(xiv_RefreshImage,0,0,mBase.Width,mB";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32636962;
 //BA.debugLineNum = 32636962;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32636965;
 //BA.debugLineNum = 32636965;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),__c.False);
RDebugUtils.currentLine=32636967;
 //BA.debugLineNum = 32636967;BA.debugLine="End Sub";
return "";
}
public String  _iniprops(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "iniprops", true))
	 {return ((String) Debug.delegate(ba, "iniprops", new Object[] {_props}));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Private Sub IniProps(Props As Map)";
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=32702468;
 //BA.debugLineNum = 32702468;BA.debugLine="m_HeaderColor = xui.PaintOrColorToColor(Props.Get";
__ref._m_headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=32702469;
 //BA.debugLineNum = 32702469;BA.debugLine="m_BodyColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._m_bodycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BodyColor")));
RDebugUtils.currentLine=32702470;
 //BA.debugLineNum = 32702470;BA.debugLine="m_CurrentDateColor = xui.PaintOrColorToColor(Prop";
__ref._m_currentdatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CurrentDateColor")));
RDebugUtils.currentLine=32702471;
 //BA.debugLineNum = 32702471;BA.debugLine="m_SelectedDateColor = xui.PaintOrColorToColor(Pro";
__ref._m_selecteddatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectedDateColor")));
RDebugUtils.currentLine=32702472;
 //BA.debugLineNum = 32702472;BA.debugLine="m_InactiveDaysVisible = Props.GetDefault(\"Inactiv";
__ref._m_inactivedaysvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("InactiveDaysVisible"),(Object)(__c.False)));
RDebugUtils.currentLine=32702473;
 //BA.debugLineNum = 32702473;BA.debugLine="m_MouseHoverFeedback = Props.GetDefault(\"MouseHov";
__ref._m_mousehoverfeedback /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MouseHoverFeedback"),(Object)(__c.True)));
RDebugUtils.currentLine=32702474;
 //BA.debugLineNum = 32702474;BA.debugLine="m_SelectMode = Props.GetDefault(\"SelectMode\",\"Dat";
__ref._m_selectmode /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("SelectMode"),(Object)("Date")));
RDebugUtils.currentLine=32702475;
 //BA.debugLineNum = 32702475;BA.debugLine="m_ShowWeekNumbers = Props.GetDefault(\"ShowWeekNum";
__ref._m_showweeknumbers /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowWeekNumbers"),(Object)(__c.False)));
RDebugUtils.currentLine=32702476;
 //BA.debugLineNum = 32702476;BA.debugLine="m_ShowGridLines = Props.GetDefault(\"ShowGridLines";
__ref._m_showgridlines /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowGridLines"),(Object)(__c.False)));
RDebugUtils.currentLine=32702477;
 //BA.debugLineNum = 32702477;BA.debugLine="m_GridLineColor = xui.PaintOrColorToColor(Props.G";
__ref._m_gridlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("GridLineColor"),(Object)(((int)0x50ffffff))));
RDebugUtils.currentLine=32702478;
 //BA.debugLineNum = 32702478;BA.debugLine="m_ThemeChangeTransition = Props.GetDefault(\"Theme";
__ref._m_themechangetransition /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ThemeChangeTransition"),(Object)("Fade")));
RDebugUtils.currentLine=32702480;
 //BA.debugLineNum = 32702480;BA.debugLine="If \"Friday\" = Props.Get(\"FirstDayOfWeek\") Then";
if (("Friday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=32702481;
 //BA.debugLineNum = 32702481;BA.debugLine="m_FirstDayOfWeek = 1";
__ref._m_firstdayofweek /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=32702482;
 //BA.debugLineNum = 32702482;BA.debugLine="else If \"Thursday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Thursday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=32702483;
 //BA.debugLineNum = 32702483;BA.debugLine="m_FirstDayOfWeek = 2";
__ref._m_firstdayofweek /*int*/  = (int) (2);
 }else 
{RDebugUtils.currentLine=32702484;
 //BA.debugLineNum = 32702484;BA.debugLine="else If \"Wednesday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Wednesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=32702485;
 //BA.debugLineNum = 32702485;BA.debugLine="m_FirstDayOfWeek = 3";
__ref._m_firstdayofweek /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=32702486;
 //BA.debugLineNum = 32702486;BA.debugLine="else If \"Tuesday\" = Props.Get(\"FirstDayOfWeek\") T";
if (("Tuesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=32702487;
 //BA.debugLineNum = 32702487;BA.debugLine="m_FirstDayOfWeek = 4";
__ref._m_firstdayofweek /*int*/  = (int) (4);
 }else 
{RDebugUtils.currentLine=32702488;
 //BA.debugLineNum = 32702488;BA.debugLine="else If \"Monday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Monday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=32702489;
 //BA.debugLineNum = 32702489;BA.debugLine="m_FirstDayOfWeek = 5";
__ref._m_firstdayofweek /*int*/  = (int) (5);
 }else 
{RDebugUtils.currentLine=32702490;
 //BA.debugLineNum = 32702490;BA.debugLine="else If \"Sunday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Sunday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=32702491;
 //BA.debugLineNum = 32702491;BA.debugLine="m_FirstDayOfWeek = 6";
__ref._m_firstdayofweek /*int*/  = (int) (6);
 }else 
{RDebugUtils.currentLine=32702492;
 //BA.debugLineNum = 32702492;BA.debugLine="else If \"Saturday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Saturday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=32702493;
 //BA.debugLineNum = 32702493;BA.debugLine="m_FirstDayOfWeek = 7";
__ref._m_firstdayofweek /*int*/  = (int) (7);
 }}}}}}}
;
RDebugUtils.currentLine=32702496;
 //BA.debugLineNum = 32702496;BA.debugLine="g_WeekNumberProperties = CreateASDatePicker_WeekN";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = __ref._createasdatepicker_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ (null,(float) (__c.DipToCurrent((int) (20))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,"");
RDebugUtils.currentLine=32702497;
 //BA.debugLineNum = 32702497;BA.debugLine="g_HeaderProperties = CreateASDatePicker_HeaderPro";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = __ref._createasdatepicker_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ (null,(float) (__c.DipToCurrent((int) (40))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (15),__c.True);
RDebugUtils.currentLine=32702498;
 //BA.debugLineNum = 32702498;BA.debugLine="g_BodyProperties = CreateASDatePicker_BodyPropert";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = __ref._createasdatepicker_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=32702499;
 //BA.debugLineNum = 32702499;BA.debugLine="g_WeekNameProperties = CreateASDatePicker_WeekNam";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = __ref._createasdatepicker_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=32702501;
 //BA.debugLineNum = 32702501;BA.debugLine="g_MonthNameShort = CreateASDatePicker_MonthNameSh";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = __ref._createasdatepicker_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ (null,"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec");
RDebugUtils.currentLine=32702502;
 //BA.debugLineNum = 32702502;BA.debugLine="g_WeekNameShort = CreateASDatePicker_WeekNameShor";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = __ref._createasdatepicker_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ (null,"Mon","Tue","Wed","Thu","Fri","Sat","Sun");
RDebugUtils.currentLine=32702504;
 //BA.debugLineNum = 32702504;BA.debugLine="End Sub";
return "";
}
public String  _ini_viewpager(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "ini_viewpager", true))
	 {return ((String) Debug.delegate(ba, "ini_viewpager", null));}
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Private Sub ini_viewpager";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=32768005;
 //BA.debugLineNum = 32768005;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=32768006;
 //BA.debugLineNum = 32768006;BA.debugLine="tmpmap.Put(\"Orientation\",\"Horizontal\")";
_tmpmap.Put((Object)("Orientation"),(Object)("Horizontal"));
RDebugUtils.currentLine=32768007;
 //BA.debugLineNum = 32768007;BA.debugLine="tmpmap.Put(\"Carousel\",False)";
_tmpmap.Put((Object)("Carousel"),(Object)(__c.False));
RDebugUtils.currentLine=32768008;
 //BA.debugLineNum = 32768008;BA.debugLine="tmpmap.Put(\"LazyLoading\",True)";
_tmpmap.Put((Object)("LazyLoading"),(Object)(__c.True));
RDebugUtils.currentLine=32768009;
 //BA.debugLineNum = 32768009;BA.debugLine="tmpmap.Put(\"LazyLoadingExtraSize\",3)";
_tmpmap.Put((Object)("LazyLoadingExtraSize"),(Object)(3));
RDebugUtils.currentLine=32768010;
 //BA.debugLineNum = 32768010;BA.debugLine="xASVP_Main.Initialize(Me,\"xASVP_Main\")";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._initialize /*String*/ (null,ba,this,"xASVP_Main");
RDebugUtils.currentLine=32768011;
 //BA.debugLineNum = 32768011;BA.debugLine="xASVP_Main.DesignerCreateView(xpnl_ViewPager,tmpl";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._designercreateview /*String*/ (null,(Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=32768012;
 //BA.debugLineNum = 32768012;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=32768013;
 //BA.debugLineNum = 32768013;BA.debugLine="End Sub";
return "";
}
public int  _getbodycolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodycolor", true))
	 {return ((Integer) Debug.delegate(ba, "getbodycolor", null));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Public Sub getBodyColor As Int";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="Return m_BodyColor";
if (true) return __ref._m_bodycolor /*int*/ ;
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="End Sub";
return 0;
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _getbodyproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "getbodyproperties", null));}
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Public Sub getBodyProperties As ASDatePicker_BodyP";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="Return g_BodyProperties";
if (true) return __ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ ;
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentdatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentdatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentdatecolor", null));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Public Sub getCurrentDateColor As Int";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Return m_CurrentDateColor";
if (true) return __ref._m_currentdatecolor /*int*/ ;
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="End Sub";
return 0;
}
public String  _getcurrentview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Public Sub getCurrentView As String";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="Return m_CurrentView";
if (true) return __ref._m_currentview /*String*/ ;
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="End Sub";
return "";
}
public int  _getgridlinecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getgridlinecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getgridlinecolor", null));}
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Public Sub getGridLineColor As Int";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="Return m_GridLineColor";
if (true) return __ref._m_gridlinecolor /*int*/ ;
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="End Sub";
return 0;
}
public int  _getheadercolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheadercolor", true))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="Return m_HeaderColor";
if (true) return __ref._m_headercolor /*int*/ ;
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getheaderpanel(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Public Sub getHeaderPanel As B4XView";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="Return xpnl_Header";
if (true) return __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _getheaderproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "getheaderproperties", null));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Public Sub getHeaderProperties As ASDatePicker_Hea";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Return g_HeaderProperties";
if (true) return __ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ ;
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="End Sub";
return null;
}
public long  _getmaxdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmaxdate", true))
	 {return ((Long) Debug.delegate(ba, "getmaxdate", null));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Public Sub getMaxDate As Long";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="Return m_MaxDate";
if (true) return __ref._m_maxdate /*long*/ ;
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
return 0L;
}
public long  _getmindate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmindate", true))
	 {return ((Long) Debug.delegate(ba, "getmindate", null));}
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Public Sub getMinDate As Long";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="Return m_MinDate";
if (true) return __ref._m_mindate /*long*/ ;
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="End Sub";
return 0L;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _getmonthnameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "getmonthnameshort", null));}
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Public Sub getMonthNameShort As ASDatePicker_Month";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="Return g_MonthNameShort";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ ;
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="End Sub";
return null;
}
public long  _getselecteddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddate", true))
	 {return ((Long) Debug.delegate(ba, "getselecteddate", null));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Public Sub getSelectedDate As Long";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="End Sub";
return 0L;
}
public int  _getselecteddatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselecteddatecolor", null));}
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub getSelectedDateColor As Int";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Return m_SelectedDateColor";
if (true) return __ref._m_selecteddatecolor /*int*/ ;
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="End Sub";
return 0;
}
public long  _getselectedenddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedenddate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedenddate", null));}
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub getSelectedEndDate As Long";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Return m_SelectedDate2";
if (true) return __ref._m_selecteddate2 /*long*/ ;
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="End Sub";
return 0L;
}
public long  _getselectedstartdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedstartdate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedstartdate", null));}
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Public Sub getSelectedStartDate As Long";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="End Sub";
return 0L;
}
public String  _getselectmode(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode", true))
	 {return ((String) Debug.delegate(ba, "getselectmode", null));}
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Public Sub getSelectMode As String";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Return m_SelectMode";
if (true) return __ref._m_selectmode /*String*/ ;
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_day(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_day", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_day", null));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Public Sub getSelectMode_Day As String";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="Return \"Date\"";
if (true) return "Date";
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_month(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_month", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_month", null));}
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Public Sub getSelectMode_Month As String";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="Return \"Month\"";
if (true) return "Month";
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowgridlines(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowgridlines", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowgridlines", null));}
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Public Sub getShowGridLines As Boolean";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="Return m_ShowGridLines";
if (true) return __ref._m_showgridlines /*boolean*/ ;
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowweeknumbers(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowweeknumbers", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowweeknumbers", null));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Public Sub getShowWeekNumbers As Boolean";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Return m_ShowWeekNumbers";
if (true) return __ref._m_showweeknumbers /*boolean*/ ;
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_dark(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_dark", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_dark", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub getTheme_Dark As AS_DatePicker_Theme";
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="Theme.BodyColor = 0xFF202125";
_theme.BodyColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=32440325;
 //BA.debugLineNum = 32440325;BA.debugLine="Theme.HeaderColor = 0xFF202125";
_theme.HeaderColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=32440326;
 //BA.debugLineNum = 32440326;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=32440328;
 //BA.debugLineNum = 32440328;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,255,255,2";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=32440329;
 //BA.debugLineNum = 32440329;BA.debugLine="Theme.BodyTextColor = xui.Color_White";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32440331;
 //BA.debugLineNum = 32440331;BA.debugLine="Theme.HeaderTextColor = xui.Color_White";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32440332;
 //BA.debugLineNum = 32440332;BA.debugLine="Theme.WeekNameColor =  0xFF202125'xui.Color_ARGB(";
_theme.WeekNameColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=32440333;
 //BA.debugLineNum = 32440333;BA.debugLine="Theme.WeekNameTextColor = xui.Color_White";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32440334;
 //BA.debugLineNum = 32440334;BA.debugLine="Theme.WeekNumberColor = xui.Color_ARGB(255,32, 33";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
RDebugUtils.currentLine=32440335;
 //BA.debugLineNum = 32440335;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_White";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32440337;
 //BA.debugLineNum = 32440337;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=32440339;
 //BA.debugLineNum = 32440339;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_light(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_light", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_light", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub getTheme_Light As AS_DatePicker_Theme";
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="Theme.BodyColor = xui.Color_White";
_theme.BodyColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32505861;
 //BA.debugLineNum = 32505861;BA.debugLine="Theme.HeaderColor = xui.Color_White";
_theme.HeaderColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32505862;
 //BA.debugLineNum = 32505862;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=32505863;
 //BA.debugLineNum = 32505863;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=32505864;
 //BA.debugLineNum = 32505864;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,0,0,0)";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=32505865;
 //BA.debugLineNum = 32505865;BA.debugLine="Theme.BodyTextColor = xui.Color_Black";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=32505866;
 //BA.debugLineNum = 32505866;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32505867;
 //BA.debugLineNum = 32505867;BA.debugLine="Theme.HeaderTextColor = xui.Color_Black";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=32505868;
 //BA.debugLineNum = 32505868;BA.debugLine="Theme.WeekNameColor = xui.Color_White'xui.Color_A";
_theme.WeekNameColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32505869;
 //BA.debugLineNum = 32505869;BA.debugLine="Theme.WeekNameTextColor = xui.Color_Black";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=32505870;
 //BA.debugLineNum = 32505870;BA.debugLine="Theme.WeekNumberColor = xui.Color_White";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=32505871;
 //BA.debugLineNum = 32505871;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_Black";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=32505873;
 //BA.debugLineNum = 32505873;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=32505875;
 //BA.debugLineNum = 32505875;BA.debugLine="End Sub";
return null;
}
public String  _getweeknamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getweeknamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Public Sub GetWeekNameByIndex(Index As Int) As Str";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="If Index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="Return g_WeekNameShort.Sunday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ ;
 }else 
{RDebugUtils.currentLine=38404099;
 //BA.debugLineNum = 38404099;BA.debugLine="else If Index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="Return g_WeekNameShort.Monday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ ;
 }else 
{RDebugUtils.currentLine=38404101;
 //BA.debugLineNum = 38404101;BA.debugLine="else If Index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="Return g_WeekNameShort.Tuesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=38404103;
 //BA.debugLineNum = 38404103;BA.debugLine="else If Index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=38404104;
 //BA.debugLineNum = 38404104;BA.debugLine="Return g_WeekNameShort.Wednesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=38404105;
 //BA.debugLineNum = 38404105;BA.debugLine="else If Index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=38404106;
 //BA.debugLineNum = 38404106;BA.debugLine="Return g_WeekNameShort.Thursday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ ;
 }else 
{RDebugUtils.currentLine=38404107;
 //BA.debugLineNum = 38404107;BA.debugLine="else If Index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=38404108;
 //BA.debugLineNum = 38404108;BA.debugLine="Return g_WeekNameShort.Friday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ ;
 }else {
RDebugUtils.currentLine=38404110;
 //BA.debugLineNum = 38404110;BA.debugLine="Return g_WeekNameShort.Saturday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ ;
 }}}}}}
;
RDebugUtils.currentLine=38404112;
 //BA.debugLineNum = 38404112;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _getweeknameproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "getweeknameproperties", null));}
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Public Sub getWeekNameProperties As ASDatePicker_W";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Return g_WeekNameProperties";
if (true) return __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ ;
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _getweeknameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "getweeknameshort", null));}
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Public Sub getWeekNameShort As ASDatePicker_WeekNa";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="Return g_WeekNameShort";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ ;
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _getweeknumberproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "getweeknumberproperties", null));}
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Public Sub getWeekNumberProperties As ASDatePicker";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="Return g_WeekNumberProperties";
if (true) return __ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ ;
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Public Sub RefreshSelectedDate";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=33619975;
 //BA.debugLineNum = 33619975;BA.debugLine="Dim counter As Int = xASVP_Main.GetPanel(i).Nu";
_counter = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews();
RDebugUtils.currentLine=33619976;
 //BA.debugLineNum = 33619976;BA.debugLine="For z = 0 To counter -1";
{
final int step6 = 1;
final int limit6 = (int) (_counter-1);
_z = (int) (0) ;
for (;_z <= limit6 ;_z = _z + step6 ) {
RDebugUtils.currentLine=33619977;
 //BA.debugLineNum = 33619977;BA.debugLine="Dim xpnl_Day As B4XView = xASVP_Main.GetPanel";
_xpnl_day = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_day = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).GetView(_z);
RDebugUtils.currentLine=33619978;
 //BA.debugLineNum = 33619978;BA.debugLine="If xpnl_Day.tag Is Long And xpnl_Day.NumberOf";
if (_xpnl_day.getTag() instanceof Long && _xpnl_day.getNumberOfViews()>0) { 
RDebugUtils.currentLine=33619979;
 //BA.debugLineNum = 33619979;BA.debugLine="CreateSelectDates(xpnl_Day,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_day,_clr);
 };
 }
};
 };
 };
 }
};
RDebugUtils.currentLine=33619986;
 //BA.debugLineNum = 33619986;BA.debugLine="End Sub";
return "";
}
public String  _selecteddaterangechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddaterangechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddaterangechanged", null));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Private Sub SelectedDateRangeChanged";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(int) (2))) { 
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SelectedDateR";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(Object)(__ref._m_selecteddate /*long*/ ),(Object)(__ref._m_selecteddate2 /*long*/ ));
 };
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="End Sub";
return "";
}
public String  _selecteddatechanged(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddatechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddatechanged", new Object[] {_date}));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Private Sub SelectedDateChanged(date As Long)";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(int) (1))) { 
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedDateC";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(Object)(_date));
 };
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="End Sub";
return "";
}
public String  _pagechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "pagechanged", true))
	 {return ((String) Debug.delegate(ba, "pagechanged", null));}
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Private Sub PageChanged";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(int) (0))) { 
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="CallSub(mCallBack, mEventName & \"_PageChanged\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged");
 };
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="Do While m_isReady = False";
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
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="Sleep(0)";
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
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 5;
;
RDebugUtils.currentLine=33816582;
 //BA.debugLineNum = 33816582;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=33816583;
 //BA.debugLineNum = 33816583;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
RDebugUtils.currentLine=33816584;
 //BA.debugLineNum = 33816584;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=33816587;
 //BA.debugLineNum = 33816587;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
this.state = 9;
}}
if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=33816585;
 //BA.debugLineNum = 33816585;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=33816586;
 //BA.debugLineNum = 33816586;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=33816588;
 //BA.debugLineNum = 33816588;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=33816589;
 //BA.debugLineNum = 33816589;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=33816591;
 //BA.debugLineNum = 33816591;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="xASVP_Main.GetPanel(i).RemoveAllViews";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).RemoveAllViews();
RDebugUtils.currentLine=33554436;
 //BA.debugLineNum = 33554436;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=33554437;
 //BA.debugLineNum = 33554437;BA.debugLine="AddMonth(xASVP_Main.GetPanel(i),xASVP_Main.Get";
__ref._addmonth /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }else 
{RDebugUtils.currentLine=33554438;
 //BA.debugLineNum = 33554438;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=33554439;
 //BA.debugLineNum = 33554439;BA.debugLine="AddYear(xASVP_Main.GetPanel(i),xASVP_Main.GetV";
__ref._addyear /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }}
;
 };
 }
};
RDebugUtils.currentLine=33554443;
 //BA.debugLineNum = 33554443;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Public Sub RefreshHeader";
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = xpnl_Header.GetVi";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=33751046;
 //BA.debugLineNum = 33751046;BA.debugLine="Dim xlbl_ArrowRight As B4XView = xpnl_Header.GetV";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=33751048;
 //BA.debugLineNum = 33751048;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=33751049;
 //BA.debugLineNum = 33751049;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=33751050;
 //BA.debugLineNum = 33751050;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=33751052;
 //BA.debugLineNum = 33751052;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=33751053;
 //BA.debugLineNum = 33751053;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=33751054;
 //BA.debugLineNum = 33751054;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=33751056;
 //BA.debugLineNum = 33751056;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=33751057;
 //BA.debugLineNum = 33751057;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=33751059;
 //BA.debugLineNum = 33751059;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub Scroll2Date(Date As Long)";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Dim ScrollIndex As Int = -1";
_scrollindex = (int) (-1);
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="Dim StartDate As Long = xASVP_Main.GetValue(i)";
_startdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i));
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="If DateTime.GetYear(StartDate) = DateTime.GetYea";
if (__c.DateTime.GetYear(_startdate)==__c.DateTime.GetYear(_date) && __c.DateTime.GetMonth(_startdate)==__c.DateTime.GetMonth(_date)) { 
RDebugUtils.currentLine=35454982;
 //BA.debugLineNum = 35454982;BA.debugLine="ScrollIndex = i";
_scrollindex = _i;
 };
 }
};
RDebugUtils.currentLine=35454986;
 //BA.debugLineNum = 35454986;BA.debugLine="If ScrollIndex <> -1 Then";
if (_scrollindex!=-1) { 
RDebugUtils.currentLine=35454987;
 //BA.debugLineNum = 35454987;BA.debugLine="xASVP_Main.CurrentIndex = ScrollIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex /*int*/ (null,_scrollindex);
 }else {
RDebugUtils.currentLine=35454989;
 //BA.debugLineNum = 35454989;BA.debugLine="m_StartDate = Date";
__ref._m_startdate /*long*/  = _date;
RDebugUtils.currentLine=35454990;
 //BA.debugLineNum = 35454990;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=35454991;
 //BA.debugLineNum = 35454991;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 };
RDebugUtils.currentLine=35454993;
 //BA.debugLineNum = 35454993;BA.debugLine="End Sub";
return "";
}
public String  _setbodycolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodycolor", true))
	 {return ((String) Debug.delegate(ba, "setbodycolor", new Object[] {_color}));}
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Public Sub setBodyColor(Color As Int)";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="m_BodyColor = Color";
__ref._m_bodycolor /*int*/  = _color;
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=35061764;
 //BA.debugLineNum = 35061764;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=35061765;
 //BA.debugLineNum = 35061765;BA.debugLine="End Sub";
return "";
}
public String  _setbodyproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _bodyproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodyproperties", true))
	 {return ((String) Debug.delegate(ba, "setbodyproperties", new Object[] {_bodyproperties}));}
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Public Sub setBodyProperties(BodyProperties As ASD";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="g_BodyProperties = BodyProperties";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = _bodyproperties;
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentdatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setcurrentdatecolor", true))
	 {return ((String) Debug.delegate(ba, "setcurrentdatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub setCurrentDateColor(Color As Int)";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="m_CurrentDateColor = Color";
__ref._m_currentdatecolor /*int*/  = _color;
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="End Sub";
return "";
}
public String  _setfirstdayofweek(b4a.example.ef.as_datepicker __ref,int _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setfirstdayofweek", true))
	 {return ((String) Debug.delegate(ba, "setfirstdayofweek", new Object[] {_number}));}
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub setFirstDayOfWeek(number As Int)";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="m_FirstDayOfWeek = number";
__ref._m_firstdayofweek /*int*/  = _number;
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="End Sub";
return "";
}
public String  _setgridlinecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setgridlinecolor", true))
	 {return ((String) Debug.delegate(ba, "setgridlinecolor", new Object[] {_color}));}
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Public Sub setGridLineColor(Color As Int)";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="m_GridLineColor = Color";
__ref._m_gridlinecolor /*int*/  = _color;
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheadercolor", true))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="m_HeaderColor = Color";
__ref._m_headercolor /*int*/  = _color;
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="End Sub";
return "";
}
public String  _setheaderproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_headerproperties _headerproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheaderproperties", true))
	 {return ((String) Debug.delegate(ba, "setheaderproperties", new Object[] {_headerproperties}));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Public Sub setHeaderProperties(HeaderProperties As";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="g_HeaderProperties = HeaderProperties";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = _headerproperties;
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="End Sub";
return "";
}
public String  _setmaxdate(b4a.example.ef.as_datepicker __ref,long _maxdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmaxdate", true))
	 {return ((String) Debug.delegate(ba, "setmaxdate", new Object[] {_maxdate}));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Public Sub setMaxDate(MaxDate As Long)";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="m_MaxDate = MaxDate";
__ref._m_maxdate /*long*/  = _maxdate;
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="End Sub";
return "";
}
public String  _setmindate(b4a.example.ef.as_datepicker __ref,long _mindate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmindate", true))
	 {return ((String) Debug.delegate(ba, "setmindate", new Object[] {_mindate}));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Public Sub setMinDate(MinDate As Long)";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="m_MinDate = MinDate";
__ref._m_mindate /*long*/  = _mindate;
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="End Sub";
return "";
}
public String  _setmonthnameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _monthnameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmonthnameshort", true))
	 {return ((String) Debug.delegate(ba, "setmonthnameshort", new Object[] {_monthnameshort}));}
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Public Sub setMonthNameShort(MonthNameShort As ASD";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="g_MonthNameShort = MonthNameShort";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = _monthnameshort;
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddate", true))
	 {return ((String) Debug.delegate(ba, "setselecteddate", new Object[] {_date}));}
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub setSelectedDate(Date As Long)";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddatecolor", true))
	 {return ((String) Debug.delegate(ba, "setselecteddatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub setSelectedDateColor(Color As Int)";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="m_SelectedDateColor = Color";
__ref._m_selecteddatecolor /*int*/  = _color;
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="End Sub";
return "";
}
public String  _setselectedenddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedenddate", true))
	 {return ((String) Debug.delegate(ba, "setselectedenddate", new Object[] {_date}));}
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Public Sub setSelectedEndDate(Date As Long)";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="m_SelectedDate2 = Date";
__ref._m_selecteddate2 /*long*/  = _date;
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="End Sub";
return "";
}
public String  _setselectedstartdate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedstartdate", true))
	 {return ((String) Debug.delegate(ba, "setselectedstartdate", new Object[] {_date}));}
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Public Sub setSelectedStartDate(Date As Long)";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="End Sub";
return "";
}
public String  _setselectmode(b4a.example.ef.as_datepicker __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectmode", true))
	 {return ((String) Debug.delegate(ba, "setselectmode", new Object[] {_mode}));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub setSelectMode(Mode As String)";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="m_SelectMode = Mode";
__ref._m_selectmode /*String*/  = _mode;
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="End Sub";
return "";
}
public String  _setshowgridlines(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowgridlines", true))
	 {return ((String) Debug.delegate(ba, "setshowgridlines", new Object[] {_show}));}
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Public Sub setShowGridLines(Show As Boolean)";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="m_ShowGridLines = Show";
__ref._m_showgridlines /*boolean*/  = _show;
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="End Sub";
return "";
}
public String  _setshowweeknumbers(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowweeknumbers", true))
	 {return ((String) Debug.delegate(ba, "setshowweeknumbers", new Object[] {_show}));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Public Sub setShowWeekNumbers(Show As Boolean)";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="m_ShowWeekNumbers = Show";
__ref._m_showweeknumbers /*boolean*/  = _show;
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="xiv_RefreshImage.SetBitmap(mBase.Snapshot)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .Snapshot().getObject()));
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,True)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=32374789;
 //BA.debugLineNum = 32374789;BA.debugLine="m_BodyColor = Theme.BodyColor";
__ref._m_bodycolor /*int*/  = _theme.BodyColor /*int*/ ;
RDebugUtils.currentLine=32374790;
 //BA.debugLineNum = 32374790;BA.debugLine="m_HeaderColor = Theme.HeaderColor";
__ref._m_headercolor /*int*/  = _theme.HeaderColor /*int*/ ;
RDebugUtils.currentLine=32374791;
 //BA.debugLineNum = 32374791;BA.debugLine="m_CurrentDateColor = Theme.CurrentDateColor";
__ref._m_currentdatecolor /*int*/  = _theme.CurrentDateColor /*int*/ ;
RDebugUtils.currentLine=32374792;
 //BA.debugLineNum = 32374792;BA.debugLine="m_SelectedDateColor = Theme.SelectedDateColor";
__ref._m_selecteddatecolor /*int*/  = _theme.SelectedDateColor /*int*/ ;
RDebugUtils.currentLine=32374793;
 //BA.debugLineNum = 32374793;BA.debugLine="m_GridLineColor = Theme.GridLineColor";
__ref._m_gridlinecolor /*int*/  = _theme.GridLineColor /*int*/ ;
RDebugUtils.currentLine=32374794;
 //BA.debugLineNum = 32374794;BA.debugLine="g_BodyProperties.TextColor = Theme.BodyTextColor";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/  = _theme.BodyTextColor /*int*/ ;
RDebugUtils.currentLine=32374795;
 //BA.debugLineNum = 32374795;BA.debugLine="g_HeaderProperties.TextColor = Theme.HeaderTextCo";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/  = _theme.HeaderTextColor /*int*/ ;
RDebugUtils.currentLine=32374796;
 //BA.debugLineNum = 32374796;BA.debugLine="g_WeekNameProperties.Color = Theme.WeekNameColor";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/  = _theme.WeekNameColor /*int*/ ;
RDebugUtils.currentLine=32374797;
 //BA.debugLineNum = 32374797;BA.debugLine="g_WeekNameProperties.TextColor = Theme.WeekNameTe";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/  = _theme.WeekNameTextColor /*int*/ ;
RDebugUtils.currentLine=32374798;
 //BA.debugLineNum = 32374798;BA.debugLine="g_WeekNumberProperties.Color = Theme.WeekNumberCo";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/  = _theme.WeekNumberColor /*int*/ ;
RDebugUtils.currentLine=32374799;
 //BA.debugLineNum = 32374799;BA.debugLine="g_WeekNumberProperties.TextColor = Theme.WeekNumb";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/  = _theme.WeekNumberTextColor /*int*/ ;
RDebugUtils.currentLine=32374800;
 //BA.debugLineNum = 32374800;BA.debugLine="g_BodyProperties.SelectedTextColor = Theme.Select";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/  = _theme.SelectedTextColor /*int*/ ;
RDebugUtils.currentLine=32374802;
 //BA.debugLineNum = 32374802;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=32374804;
 //BA.debugLineNum = 32374804;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=32374805;
 //BA.debugLineNum = 32374805;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=32374806;
 //BA.debugLineNum = 32374806;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=32374808;
 //BA.debugLineNum = 32374808;BA.debugLine="RefreshHeader";
__ref._refreshheader /*String*/ (null);
RDebugUtils.currentLine=32374809;
 //BA.debugLineNum = 32374809;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=32374811;
 //BA.debugLineNum = 32374811;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=32374813;
 //BA.debugLineNum = 32374813;BA.debugLine="Select m_ThemeChangeTransition";
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
RDebugUtils.currentLine=32374815;
 //BA.debugLineNum = 32374815;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=32374817;
 //BA.debugLineNum = 32374817;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(250,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=32374820;
 //BA.debugLineNum = 32374820;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Public Sub setWeekNameProperties(WeekNamePropertie";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="g_WeekNameProperties = WeekNameProperties";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = _weeknameproperties;
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="End Sub";
return "";
}
public String  _setweeknameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _weeknameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknameshort", true))
	 {return ((String) Debug.delegate(ba, "setweeknameshort", new Object[] {_weeknameshort}));}
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Public Sub setWeekNameShort(WeekNameShort As ASDat";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="g_WeekNameShort = WeekNameShort";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = _weeknameshort;
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="End Sub";
return "";
}
public String  _setweeknumberproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _weeknumberproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknumberproperties", true))
	 {return ((String) Debug.delegate(ba, "setweeknumberproperties", new Object[] {_weeknumberproperties}));}
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Public Sub setWeekNumberProperties(WeekNumberPrope";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="g_WeekNumberProperties = WeekNumberProperties";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = _weeknumberproperties;
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_lazyloadingaddcontent(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_lazyloadingaddcontent", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_lazyloadingaddcontent", new Object[] {_parent,_value}));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub xASVP_Main_LazyLoadingAddContent(Paren";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="AddMonth(Parent,Value)";
__ref._addmonth /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }else 
{RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView O";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="AddYear(Parent,Value)";
__ref._addyear /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }}
;
RDebugUtils.currentLine=37552134;
 //BA.debugLineNum = 37552134;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechange(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechange", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechange", new Object[] {_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
long _currentdate = 0L;
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Private Sub xASVP_Main_PageChange(Index As Int)";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="Dim CurrentDate As Long = xASVP_Main.GetValue(Ind";
_currentdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(Current";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,_currentdate)+" "+BA.NumberToString(__c.DateTime.GetYear(_currentdate))));
 }else 
{RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="else if m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=37617670;
 //BA.debugLineNum = 37617670;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(_currentdate)));
 }else 
{RDebugUtils.currentLine=37617671;
 //BA.debugLineNum = 37617671;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=37617672;
 //BA.debugLineNum = 37617672;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString((__c.DateTime.GetYear(_currentdate)+11))));
 }else 
{RDebugUtils.currentLine=37617673;
 //BA.debugLineNum = 37617673;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=37617674;
 //BA.debugLineNum = 37617674;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+10*12)-1))));
 }}}}
;
RDebugUtils.currentLine=37617676;
 //BA.debugLineNum = 37617676;BA.debugLine="CustomDrawHeader(CurrentDate)";
__ref._customdrawheader /*String*/ (null,_currentdate);
RDebugUtils.currentLine=37617677;
 //BA.debugLineNum = 37617677;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechanged", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechanged", new Object[] {_index}));}
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub xASVP_Main_PageChanged(Index As Int)";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="PageChanged";
__ref._pagechanged /*String*/ (null);
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Private Sub xASVP_Main_PageChanged2(NewIndex As In";
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="If m_MinDate > 0 And m_MaxDate > 0 Then Return";
if (__ref._m_mindate /*long*/ >0 && __ref._m_maxdate /*long*/ >0) { 
if (true) return "";};
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="Dim Forward As Boolean = False";
_forward = __c.False;
RDebugUtils.currentLine=33030149;
 //BA.debugLineNum = 33030149;BA.debugLine="Dim DoIt As Boolean = False";
_doit = __c.False;
RDebugUtils.currentLine=33030151;
 //BA.debugLineNum = 33030151;BA.debugLine="If NewIndex <= OldIndex Then";
if (_newindex<=_oldindex) { 
RDebugUtils.currentLine=33030152;
 //BA.debugLineNum = 33030152;BA.debugLine="If NewIndex <= 2 Then";
if (_newindex<=2) { 
RDebugUtils.currentLine=33030153;
 //BA.debugLineNum = 33030153;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=33030154;
 //BA.debugLineNum = 33030154;BA.debugLine="Forward = False";
_forward = __c.False;
 };
 }else {
RDebugUtils.currentLine=33030157;
 //BA.debugLineNum = 33030157;BA.debugLine="If NewIndex = xASVP_Main.Size -2 Then";
if (_newindex==__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-2) { 
RDebugUtils.currentLine=33030158;
 //BA.debugLineNum = 33030158;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=33030159;
 //BA.debugLineNum = 33030159;BA.debugLine="Forward = True";
_forward = __c.True;
 };
 };
RDebugUtils.currentLine=33030163;
 //BA.debugLineNum = 33030163;BA.debugLine="If DoIt Then";
if (_doit) { 
RDebugUtils.currentLine=33030165;
 //BA.debugLineNum = 33030165;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=33030166;
 //BA.debugLineNum = 33030166;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33030167;
 //BA.debugLineNum = 33030167;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33030168;
 //BA.debugLineNum = 33030168;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=33030170;
 //BA.debugLineNum = 33030170;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33030171;
 //BA.debugLineNum = 33030171;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=33030172;
 //BA.debugLineNum = 33030172;BA.debugLine="p2.Months = IIf(Forward,1,-1)";
_p2.Months = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=33030174;
 //BA.debugLineNum = 33030174;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=33030175;
 //BA.debugLineNum = 33030175;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate";
_firstdayofmonth = _dateutils._setdate(ba,__c.DateTime.GetYear(_currenttime),__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=33030177;
 //BA.debugLineNum = 33030177;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=33030178;
 //BA.debugLineNum = 33030178;BA.debugLine="If m_MaxDate > 0 And FirstDayOfMonth > DateUti";
if (__ref._m_maxdate /*long*/ >0 && _firstdayofmonth>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=33030179;
 //BA.debugLineNum = 33030179;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33030181;
 //BA.debugLineNum = 33030181;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfM";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
 }else {
RDebugUtils.currentLine=33030183;
 //BA.debugLineNum = 33030183;BA.debugLine="If m_MinDate > 0 And FirstDayOfMonth < DateUti";
if (__ref._m_mindate /*long*/ >0 && _firstdayofmonth<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=33030184;
 //BA.debugLineNum = 33030184;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33030186;
 //BA.debugLineNum = 33030186;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,FirstDa";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_firstdayofmonth));
 };
 }else 
{RDebugUtils.currentLine=33030189;
 //BA.debugLineNum = 33030189;BA.debugLine="else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=33030191;
 //BA.debugLineNum = 33030191;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33030192;
 //BA.debugLineNum = 33030192;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33030193;
 //BA.debugLineNum = 33030193;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=33030195;
 //BA.debugLineNum = 33030195;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33030196;
 //BA.debugLineNum = 33030196;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=33030197;
 //BA.debugLineNum = 33030197;BA.debugLine="p2.Years = IIf(Forward,1,-1)";
_p2.Years = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=33030199;
 //BA.debugLineNum = 33030199;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=33030202;
 //BA.debugLineNum = 33030202;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=33030203;
 //BA.debugLineNum = 33030203;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=33030204;
 //BA.debugLineNum = 33030204;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33030206;
 //BA.debugLineNum = 33030206;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 }else {
RDebugUtils.currentLine=33030208;
 //BA.debugLineNum = 33030208;BA.debugLine="If m_MinDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_mindate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )) { 
RDebugUtils.currentLine=33030209;
 //BA.debugLineNum = 33030209;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33030211;
 //BA.debugLineNum = 33030211;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,Current";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_currenttime));
 };
 }else 
{RDebugUtils.currentLine=33030214;
 //BA.debugLineNum = 33030214;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=33030216;
 //BA.debugLineNum = 33030216;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=33030218;
 //BA.debugLineNum = 33030218;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePan";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=33030219;
 //BA.debugLineNum = 33030219;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=33030220;
 //BA.debugLineNum = 33030220;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_V";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=33030222;
 //BA.debugLineNum = 33030222;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=33030223;
 //BA.debugLineNum = 33030223;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=33030224;
 //BA.debugLineNum = 33030224;BA.debugLine="p2.Years = 10";
_p2.Years = (int) (10);
RDebugUtils.currentLine=33030226;
 //BA.debugLineNum = 33030226;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1))),_p2);
RDebugUtils.currentLine=33030229;
 //BA.debugLineNum = 33030229;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=33030230;
 //BA.debugLineNum = 33030230;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33030232;
 //BA.debugLineNum = 33030232;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 };
 }}}
;
 };
RDebugUtils.currentLine=33030239;
 //BA.debugLineNum = 33030239;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_header_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_header_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_header_click", null));}
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Private Sub xlbl_Header_Click";
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="else If m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=37814279;
 //BA.debugLineNum = 37814279;BA.debugLine="ChangeView(getCurrentView_CenturyView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_centuryview /*String*/ (null));
 }}}
;
RDebugUtils.currentLine=37814281;
 //BA.debugLineNum = 37814281;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowleft_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowleft_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowleft_click", null));}
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Private Sub xlbl_HeaderArrowLeft_Click";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="xASVP_Main.PreviousPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._previouspage /*String*/ (null);
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowright_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowright_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowright_click", null));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Private Sub xlbl_HeaderArrowRight_Click";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="xASVP_Main.NextPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._nextpage /*String*/ (null);
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_centurydecade_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_centurydecade_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_centurydecade_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_centurydecade = null;
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Private Sub xpnl_CenturyDecade_Click";
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Dim xpnl_CenturyDecade As B4XView = Sender";
_xpnl_centurydecade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_centurydecade = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="m_StartDate = xpnl_CenturyDecade.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_centurydecade.getTag());
RDebugUtils.currentLine=38010884;
 //BA.debugLineNum = 38010884;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_decadeyear_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_decadeyear_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_decadeyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_decadeyear = null;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Private Sub xpnl_DecadeYear_Click";
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="Dim xpnl_DecadeYear As B4XView = Sender";
_xpnl_decadeyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_decadeyear = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="m_StartDate = xpnl_DecadeYear.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_decadeyear.getTag());
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_monthdate_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_monthdate_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_monthdate_click", null));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Private Sub xpnl_MonthDate_Click";
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="MonthDateClick(Sender,True)";
__ref._monthdateclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Private Sub xpnl_YearMonth_Click";
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Dim xpnl_YearMonth As B4XView = Sender";
_xpnl_yearmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_yearmonth = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="m_StartDate = xpnl_YearMonth.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_yearmonth.getTag());
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="If m_SelectMode = \"Date\"  Or m_SelectMode = \"Rang";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="ChangeView(getCurrentView_MonthView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_monthview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="Else If m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="SelectedDateChanged(xpnl_YearMonth.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_yearmonth.getTag()));
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="If m_MouseHoverFeedback = True Then";
if (__ref._m_mousehoverfeedback /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="Dim xlbl_Date As B4XView = xpnl_YearMonth.GetVi";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _xpnl_yearmonth.GetView((int) (0));
RDebugUtils.currentLine=37945355;
 //BA.debugLineNum = 37945355;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=37945359;
 //BA.debugLineNum = 37945359;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37945360;
 //BA.debugLineNum = 37945360;BA.debugLine="xpnl_YearMonth.AddView(xpnl_selected,0,0,xpnl_Y";
_xpnl_yearmonth.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (0),_xpnl_yearmonth.getWidth(),_xpnl_yearmonth.getHeight());
RDebugUtils.currentLine=37945362;
 //BA.debugLineNum = 37945362;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateC";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=37945363;
 //BA.debugLineNum = 37945363;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=37945365;
 //BA.debugLineNum = 37945365;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
 }}
;
RDebugUtils.currentLine=37945372;
 //BA.debugLineNum = 37945372;BA.debugLine="End Sub";
return "";
}
}