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
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Private Sub AddMonth(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=32178180;
 //BA.debugLineNum = 32178180;BA.debugLine="Dim BlockHeight As Float = (Parent.Height-g_WeekN";
_blockheight = (float) ((_parent.getHeight()-__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ )/(double)6);
RDebugUtils.currentLine=32178181;
 //BA.debugLineNum = 32178181;BA.debugLine="Dim BlockWidth As Float = IIf(m_ShowWeekNumbers,(";
_blockwidth = (float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))));
RDebugUtils.currentLine=32178183;
 //BA.debugLineNum = 32178183;BA.debugLine="If m_ShowWeekNumbers Then AddWeekName(Parent,-1,g";
if (__ref._m_showweeknumbers /*boolean*/ ) { 
__ref._addweekname /*String*/ (null,_parent,(int) (-1),__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Text /*String*/ );};
RDebugUtils.currentLine=32178184;
 //BA.debugLineNum = 32178184;BA.debugLine="AddWeekName(Parent,0,g_WeekNameShort.Monday)";
__ref._addweekname /*String*/ (null,_parent,(int) (0),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ );
RDebugUtils.currentLine=32178185;
 //BA.debugLineNum = 32178185;BA.debugLine="AddWeekName(Parent,1,g_WeekNameShort.Tuesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (1),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ );
RDebugUtils.currentLine=32178186;
 //BA.debugLineNum = 32178186;BA.debugLine="AddWeekName(Parent,2,g_WeekNameShort.Wednesday)";
__ref._addweekname /*String*/ (null,_parent,(int) (2),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ );
RDebugUtils.currentLine=32178187;
 //BA.debugLineNum = 32178187;BA.debugLine="AddWeekName(Parent,3,g_WeekNameShort.Thursday)";
__ref._addweekname /*String*/ (null,_parent,(int) (3),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ );
RDebugUtils.currentLine=32178188;
 //BA.debugLineNum = 32178188;BA.debugLine="AddWeekName(Parent,4,g_WeekNameShort.Friday)";
__ref._addweekname /*String*/ (null,_parent,(int) (4),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ );
RDebugUtils.currentLine=32178189;
 //BA.debugLineNum = 32178189;BA.debugLine="AddWeekName(Parent,5,g_WeekNameShort.Saturday)";
__ref._addweekname /*String*/ (null,_parent,(int) (5),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ );
RDebugUtils.currentLine=32178190;
 //BA.debugLineNum = 32178190;BA.debugLine="AddWeekName(Parent,6,g_WeekNameShort.Sunday)";
__ref._addweekname /*String*/ (null,_parent,(int) (6),__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ );
RDebugUtils.currentLine=32178192;
 //BA.debugLineNum = 32178192;BA.debugLine="Dim FirstDay As Long = GetFirstDayOfWeek2(Current";
_firstday = __ref._getfirstdayofweek2 /*long*/ (null,_currentdate,__ref._m_firstdayofweek /*int*/ );
RDebugUtils.currentLine=32178194;
 //BA.debugLineNum = 32178194;BA.debugLine="Dim CurrenMonth As Int = DateTime.GetMonth(Curren";
_currenmonth = __c.DateTime.GetMonth(_currentdate);
RDebugUtils.currentLine=32178196;
 //BA.debugLineNum = 32178196;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=32178199;
 //BA.debugLineNum = 32178199;BA.debugLine="For i = 1 To 43 -1";
{
final int step15 = 1;
final int limit15 = (int) (43-1);
_i = (int) (1) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=32178201;
 //BA.debugLineNum = 32178201;BA.debugLine="Dim CurrentDay As Long = FirstDay + DateTime.Tic";
_currentday = (long) (_firstday+__c.DateTime.TicksPerDay*(_i-1)+__c.DateTime.TicksPerHour);
RDebugUtils.currentLine=32178203;
 //BA.debugLineNum = 32178203;BA.debugLine="Dim Rest As Int = (i-1)/7";
_rest = (int) ((_i-1)/(double)7);
RDebugUtils.currentLine=32178204;
 //BA.debugLineNum = 32178204;BA.debugLine="Dim test As Int = (i-1) Mod 7";
_test = (int) ((_i-1)%7);
RDebugUtils.currentLine=32178206;
 //BA.debugLineNum = 32178206;BA.debugLine="Dim xpnl_Date As B4XView = xui.CreatePanel(\"xpnl";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_MonthDate");
RDebugUtils.currentLine=32178207;
 //BA.debugLineNum = 32178207;BA.debugLine="xpnl_Date.Tag = CurrentDay";
_xpnl_date.setTag((Object)(_currentday));
RDebugUtils.currentLine=32178208;
 //BA.debugLineNum = 32178208;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent'm_BodyCo";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=32178209;
 //BA.debugLineNum = 32178209;BA.debugLine="Parent.AddView(xpnl_Date,IIf(m_ShowWeekNumbers,g";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_test)),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=32178210;
 //BA.debugLineNum = 32178210;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=32178211;
 //BA.debugLineNum = 32178211;BA.debugLine="xlbl_Date.Tag = \"xlbl_Date\"";
_xlbl_date.setTag((Object)("xlbl_Date"));
RDebugUtils.currentLine=32178212;
 //BA.debugLineNum = 32178212;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=32178213;
 //BA.debugLineNum = 32178213;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32178214;
 //BA.debugLineNum = 32178214;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32178215;
 //BA.debugLineNum = 32178215;BA.debugLine="xlbl_Date.Text = DateTime.GetDayOfMonth(CurrentD";
_xlbl_date.setText(BA.ObjectToCharSequence(__c.DateTime.GetDayOfMonth(_currentday)));
RDebugUtils.currentLine=32178218;
 //BA.debugLineNum = 32178218;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=32178220;
 //BA.debugLineNum = 32178220;BA.debugLine="If DateTime.GetMonth(CurrentDay) <> CurrenMonth";
if (__c.DateTime.GetMonth(_currentday)!=_currenmonth) { 
RDebugUtils.currentLine=32178221;
 //BA.debugLineNum = 32178221;BA.debugLine="If m_InactiveDaysVisible = False Then";
if (__ref._m_inactivedaysvisible /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=32178222;
 //BA.debugLineNum = 32178222;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 }else {
RDebugUtils.currentLine=32178224;
 //BA.debugLineNum = 32178224;BA.debugLine="Dim Color() As Int = GetARGB(g_BodyProperties.";
_color = __ref._getargb /*int[]*/ (null,__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32178225;
 //BA.debugLineNum = 32178225;BA.debugLine="xlbl_Date.TextColor = xui.Color_ARGB(100,Color";
_xlbl_date.setTextColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (100),_color[(int) (1)],_color[(int) (2)],_color[(int) (3)]));
 };
 };
RDebugUtils.currentLine=32178229;
 //BA.debugLineNum = 32178229;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=32178230;
 //BA.debugLineNum = 32178230;BA.debugLine="xlbl_Date.Visible = False";
_xlbl_date.setVisible(__c.False);
 };
RDebugUtils.currentLine=32178235;
 //BA.debugLineNum = 32178235;BA.debugLine="CreateSelectDates(xpnl_Date,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_date,_clr);
RDebugUtils.currentLine=32178237;
 //BA.debugLineNum = 32178237;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,CurrentDay)";
if (_dateutils._issameday(ba,__c.DateTime.getNow(),_currentday)==__c.True && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=32178238;
 //BA.debugLineNum = 32178238;BA.debugLine="Dim xpnl_CurrentDay As B4XView = xui.CreatePane";
_xpnl_currentday = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_currentday = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32178239;
 //BA.debugLineNum = 32178239;BA.debugLine="xpnl_CurrentDay.SetColorAndBorder(m_CurrentDate";
_xpnl_currentday.SetColorAndBorder(__ref._m_currentdatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=32178240;
 //BA.debugLineNum = 32178240;BA.debugLine="xpnl_Date.AddView(xpnl_CurrentDay,BlockWidth/2";
_xpnl_date.AddView((android.view.View)(_xpnl_currentday.getObject()),(int) (_blockwidth/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_blockheight/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 };
RDebugUtils.currentLine=32178244;
 //BA.debugLineNum = 32178244;BA.debugLine="If m_ShowWeekNumbers = True Then";
if (__ref._m_showweeknumbers /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=32178245;
 //BA.debugLineNum = 32178245;BA.debugLine="Dim xpnl_WeekNumber As B4XView = xui.CreatePane";
_xpnl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_weeknumber = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32178246;
 //BA.debugLineNum = 32178246;BA.debugLine="Dim xlbl_WeekNumber As B4XView = CreateLabel(\"\"";
_xlbl_weeknumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weeknumber = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=32178247;
 //BA.debugLineNum = 32178247;BA.debugLine="Parent.AddView(xpnl_WeekNumber,0,g_WeekNameProp";
_parent.AddView((android.view.View)(_xpnl_weeknumber.getObject()),(int) (0),(int) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*_rest)),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=32178248;
 //BA.debugLineNum = 32178248;BA.debugLine="xpnl_WeekNumber.AddView(xlbl_WeekNumber,0,0,g_W";
_xpnl_weeknumber.AddView((android.view.View)(_xlbl_weeknumber.getObject()),(int) (0),(int) (0),(int) (__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ ),(int) (_blockheight));
RDebugUtils.currentLine=32178250;
 //BA.debugLineNum = 32178250;BA.debugLine="xpnl_WeekNumber.Color = g_WeekNumberProperties.";
_xpnl_weeknumber.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=32178252;
 //BA.debugLineNum = 32178252;BA.debugLine="xlbl_WeekNumber.SetTextAlignment(\"CENTER\",\"CENT";
_xlbl_weeknumber.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32178253;
 //BA.debugLineNum = 32178253;BA.debugLine="xlbl_WeekNumber.TextColor = g_WeekNumberPropert";
_xlbl_weeknumber.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32178254;
 //BA.debugLineNum = 32178254;BA.debugLine="xlbl_WeekNumber.Font = g_WeekNumberProperties.x";
_xlbl_weeknumber.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=32178255;
 //BA.debugLineNum = 32178255;BA.debugLine="xlbl_WeekNumber.Text = GetWeekNumberStartingFro";
_xlbl_weeknumber.setText(BA.ObjectToCharSequence(__ref._getweeknumberstartingfrommonday /*int*/ (null,_currentday)));
 };
RDebugUtils.currentLine=32178258;
 //BA.debugLineNum = 32178258;BA.debugLine="CustomDrawDay(CurrentDay,xpnl_Date)";
__ref._customdrawday /*String*/ (null,_currentday,_xpnl_date);
 }
};
RDebugUtils.currentLine=32178262;
 //BA.debugLineNum = 32178262;BA.debugLine="If m_ShowGridLines Then";
if (__ref._m_showgridlines /*boolean*/ ) { 
RDebugUtils.currentLine=32178263;
 //BA.debugLineNum = 32178263;BA.debugLine="Dim xpnl_CanvasBackground As B4XView = xui.Creat";
_xpnl_canvasbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_canvasbackground = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32178264;
 //BA.debugLineNum = 32178264;BA.debugLine="Parent.AddView(xpnl_CanvasBackground,0,0,Parent.";
_parent.AddView((android.view.View)(_xpnl_canvasbackground.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
RDebugUtils.currentLine=32178265;
 //BA.debugLineNum = 32178265;BA.debugLine="xpnl_CanvasBackground.Color = xui.Color_Transpar";
_xpnl_canvasbackground.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=32178273;
 //BA.debugLineNum = 32178273;BA.debugLine="Dim xcv As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=32178274;
 //BA.debugLineNum = 32178274;BA.debugLine="xcv.Initialize(xpnl_CanvasBackground)";
_xcv.Initialize(_xpnl_canvasbackground);
RDebugUtils.currentLine=32178275;
 //BA.debugLineNum = 32178275;BA.debugLine="xcv.ClearRect(xcv.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
RDebugUtils.currentLine=32178277;
 //BA.debugLineNum = 32178277;BA.debugLine="For i = 0 To 6 -1 'Add Divider Vertical";
{
final int step67 = 1;
final int limit67 = (int) (6-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=32178278;
 //BA.debugLineNum = 32178278;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumber";
_xcv.DrawLine((float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (0),(float) ((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*(_i+1))),(float) (_parent.getHeight()),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=32178280;
 //BA.debugLineNum = 32178280;BA.debugLine="If i < 5 Then xcv.DrawLine(0,g_WeekNameProperti";
if (_i<5) { 
_xcv.DrawLine((float) (0),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),(float) (_parent.getWidth()),(float) (__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ +(_blockheight*(_i+1))),__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));};
 }
};
RDebugUtils.currentLine=32178283;
 //BA.debugLineNum = 32178283;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumberP";
_xcv.DrawLine((float)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0))))),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,(float) (_parent.getWidth()),__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ,__ref._m_gridlinecolor /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=32178285;
 //BA.debugLineNum = 32178285;BA.debugLine="xcv.Invalidate";
_xcv.Invalidate();
 };
RDebugUtils.currentLine=32178288;
 //BA.debugLineNum = 32178288;BA.debugLine="End Sub";
return "";
}
public int[]  _getargb(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getargb", true))
	 {return ((int[]) Debug.delegate(ba, "getargb", new Object[] {_color}));}
int[] _res = null;
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="Dim res(4) As Int";
_res = new int[(int) (4)];
;
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=37093379;
 //BA.debugLineNum = 37093379;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=37093380;
 //BA.debugLineNum = 37093380;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=37093381;
 //BA.debugLineNum = 37093381;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=37093382;
 //BA.debugLineNum = 37093382;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Private Sub AddWeekName(xpnl_Background As B4XView";
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="Dim BlockHeight As Float = g_WeekNameProperties.H";
_blockheight = __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Height /*float*/ ;
RDebugUtils.currentLine=31784963;
 //BA.debugLineNum = 31784963;BA.debugLine="Dim BlockWidth As Float = Floor(IIf(m_ShowWeekNum";
_blockwidth = (float) (__c.Floor((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)((__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )/(double)7)) : (((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)7)))))))));
RDebugUtils.currentLine=31784965;
 //BA.debugLineNum = 31784965;BA.debugLine="Dim xlbl_WeekName As B4XView = CreateLabel(\"\")";
_xlbl_weekname = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_weekname = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=31784967;
 //BA.debugLineNum = 31784967;BA.debugLine="xlbl_WeekName.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_weekname.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=31784968;
 //BA.debugLineNum = 31784968;BA.debugLine="xlbl_WeekName.Text = Text";
_xlbl_weekname.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=31784969;
 //BA.debugLineNum = 31784969;BA.debugLine="If i = -1 Then";
if (_i==-1) { 
RDebugUtils.currentLine=31784970;
 //BA.debugLineNum = 31784970;BA.debugLine="xlbl_WeekName.Color = g_WeekNumberProperties.Col";
_xlbl_weekname.setColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=31784971;
 //BA.debugLineNum = 31784971;BA.debugLine="xlbl_WeekName.Font = g_WeekNumberProperties.xFon";
_xlbl_weekname.setFont(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=31784972;
 //BA.debugLineNum = 31784972;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNumberProperties";
_xlbl_weekname.setTextColor(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/ );
 }else {
RDebugUtils.currentLine=31784974;
 //BA.debugLineNum = 31784974;BA.debugLine="xlbl_WeekName.Color = g_WeekNameProperties.Color";
_xlbl_weekname.setColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/ );
RDebugUtils.currentLine=31784975;
 //BA.debugLineNum = 31784975;BA.debugLine="xlbl_WeekName.Font = g_WeekNameProperties.xFont";
_xlbl_weekname.setFont(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=31784976;
 //BA.debugLineNum = 31784976;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNameProperties.T";
_xlbl_weekname.setTextColor(__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=31784979;
 //BA.debugLineNum = 31784979;BA.debugLine="xpnl_Background.AddView(xlbl_WeekName,IIf(i = -1,";
_xpnl_background.AddView((android.view.View)(_xlbl_weekname.getObject()),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(0)) : ((Object)((double)(BA.ObjectToNumber(((__ref._m_showweeknumbers /*boolean*/ ) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(0)))))+(_blockwidth*_i)))))),(int) (0),(int)(BA.ObjectToNumber(((_i==-1) ? ((Object)(__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Width /*float*/ )) : ((Object)(_blockwidth))))),(int) (_blockheight));
RDebugUtils.currentLine=31784980;
 //BA.debugLineNum = 31784980;BA.debugLine="End Sub";
return "";
}
public long  _getfirstdayofweek2(b4a.example.ef.as_datepicker __ref,long _ticks,int _firstdayofweek) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getfirstdayofweek2", true))
	 {return ((Long) Debug.delegate(ba, "getfirstdayofweek2", new Object[] {_ticks,_firstdayofweek}));}
b4a.example.dateutils._period _p = null;
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Public Sub GetFirstDayOfWeek2(Ticks As Long,FirstD";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="p.Days = -((DateTime.GetDayOfWeek(Ticks)+FirstDay";
_p.Days = (int) (-((__c.DateTime.GetDayOfWeek(_ticks)+_firstdayofweek)%7));
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="Return DateUtils.AddPeriod(Ticks, p)";
if (true) return _dateutils._addperiod(ba,_ticks,_p);
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createlabel", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=37158916;
 //BA.debugLineNum = 37158916;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Private Sub CreateSelectDates(xpnl_Date As B4XView";
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="For Each View As B4XView In xpnl_Date.GetAllViews";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group2 = _xpnl_date.GetAllViewsRecursive();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group2.Get(index2)));
RDebugUtils.currentLine=32505860;
 //BA.debugLineNum = 32505860;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=32505862;
 //BA.debugLineNum = 32505862;BA.debugLine="Dim CurrentDay As Long = xpnl_Date.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_date.getTag());
RDebugUtils.currentLine=32505864;
 //BA.debugLineNum = 32505864;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=32505865;
 //BA.debugLineNum = 32505865;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=32505866;
 //BA.debugLineNum = 32505866;BA.debugLine="CreateSelectedDate(xpnl_Date,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.True);
 }else 
{RDebugUtils.currentLine=32505867;
 //BA.debugLineNum = 32505867;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Selecte";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ) && _xlbl_date.getVisible()) { 
RDebugUtils.currentLine=32505868;
 //BA.debugLineNum = 32505868;BA.debugLine="CreateSelectedDate(xpnl_Date,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_date,__c.False);
 }}
;
RDebugUtils.currentLine=32505871;
 //BA.debugLineNum = 32505871;BA.debugLine="For Each v As B4XView In xpnl_Date.GetAllViewsRe";
_v = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group12 = _xpnl_date.GetAllViewsRecursive();
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group12.Get(index12)));
RDebugUtils.currentLine=32505872;
 //BA.debugLineNum = 32505872;BA.debugLine="If \"RangeItem\" = v.Tag Then";
if (("RangeItem").equals(BA.ObjectToString(_v.getTag()))) { 
RDebugUtils.currentLine=32505873;
 //BA.debugLineNum = 32505873;BA.debugLine="v.RemoveViewFromParent";
_v.RemoveViewFromParent();
RDebugUtils.currentLine=32505874;
 //BA.debugLineNum = 32505874;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=32505878;
 //BA.debugLineNum = 32505878;BA.debugLine="If m_SelectedDate > 0 And m_SelectedDate2 > 0 An";
if (__ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0 && ((_currentday>=__ref._m_selecteddate /*long*/  && _currentday<=__ref._m_selecteddate2 /*long*/ ) || (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )))) { 
RDebugUtils.currentLine=32505879;
 //BA.debugLineNum = 32505879;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32505880;
 //BA.debugLineNum = 32505880;BA.debugLine="xpnl_selected.Tag = \"RangeItem\"";
_xpnl_selected.setTag((Object)("RangeItem"));
RDebugUtils.currentLine=32505881;
 //BA.debugLineNum = 32505881;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDat";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ )) { 
RDebugUtils.currentLine=32505882;
 //BA.debugLineNum = 32505882;BA.debugLine="xpnl_Date.AddView(xpnl_selected,xpnl_Date.Widt";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_date.getWidth()/(double)2),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else 
{RDebugUtils.currentLine=32505883;
 //BA.debugLineNum = 32505883;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Select";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ )) { 
RDebugUtils.currentLine=32505884;
 //BA.debugLineNum = 32505884;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_date.getWidth()/(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }else {
RDebugUtils.currentLine=32505886;
 //BA.debugLineNum = 32505886;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
_xpnl_date.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (_xpnl_date.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),_xpnl_date.getWidth(),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
 }}
;
RDebugUtils.currentLine=32505889;
 //BA.debugLineNum = 32505889;BA.debugLine="xpnl_selected.Color = xui.Color_ARGB(80,clr(1),";
_xpnl_selected.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),_clr[(int) (1)],_clr[(int) (2)],_clr[(int) (3)]));
RDebugUtils.currentLine=32505890;
 //BA.debugLineNum = 32505890;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
 };
 }else {
RDebugUtils.currentLine=32505894;
 //BA.debugLineNum = 32505894;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) && _xlbl_date.getVisible()==__c.True) { 
RDebugUtils.currentLine=32505895;
 //BA.debugLineNum = 32505895;BA.debugLine="MonthDateClick(xpnl_Date,False)";
__ref._monthdateclick /*String*/ (null,_xpnl_date,__c.False);
 };
 };
RDebugUtils.currentLine=32505900;
 //BA.debugLineNum = 32505900;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate)";
if (_dateutils._issameday(ba,_currentday,__ref._m_selecteddate /*long*/ ) || ((__ref._m_selectmode /*String*/ ).equals(__ref._getselectmode_range /*String*/ (null)) && _dateutils._issameday(ba,_currentday,__ref._m_selecteddate2 /*long*/ ))) { 
RDebugUtils.currentLine=32505901;
 //BA.debugLineNum = 32505901;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedT";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
 }else {
RDebugUtils.currentLine=32505903;
 //BA.debugLineNum = 32505903;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
 };
RDebugUtils.currentLine=32505907;
 //BA.debugLineNum = 32505907;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Private Sub GetWeekNumberStartingFromMonday (ticks";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Dim WeekDayOfFirstDayOfYear As Int = DateTime.Get";
_weekdayoffirstdayofyear = (int) (__c.DateTime.GetDayOfWeek(_dateutils._setdate(ba,__c.DateTime.GetYear(_ticks),(int) (1),(int) (1)))-1);
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="Dim FirstMondayInYear As Int = (7 + WeekDayOfFirs";
_firstmondayinyear = (int) ((7+_weekdayoffirstdayofyear-1)%7);
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="Dim result As Int";
_result = 0;
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="If WeekDayOfFirstDayOfYear <> 1 Then result = res";
if (_weekdayoffirstdayofyear!=1) { 
_result = (int) (_result-1);};
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="result = result + Floor((DateTime.GetDayOfYear(ti";
_result = (int) (_result+__c.Floor((__c.DateTime.GetDayOfYear(_ticks)-1+_firstmondayinyear)/(double)7)+1);
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=37355527;
 //BA.debugLineNum = 37355527;BA.debugLine="End Sub";
return 0;
}
public String  _customdrawday(b4a.example.ef.as_datepicker __ref,long _date,anywheresoftware.b4a.objects.B4XViewWrapper _backgroundpanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawday", true))
	 {return ((String) Debug.delegate(ba, "customdrawday", new Object[] {_date,_backgroundpanel}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawday _m_customdrawday = null;
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Private Sub CustomDrawDay(Date As Long,BackgroundP";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(int) (2))) { 
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="Dim m_CustomDrawDay As ASDatePicker_CustomDrawDa";
_m_customdrawday = new b4a.example.ef.as_datepicker._asdatepicker_customdrawday();
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="m_CustomDrawDay.Initialize";
_m_customdrawday.Initialize();
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="m_CustomDrawDay.BackgroundPanel = BackgroundPane";
_m_customdrawday.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _backgroundpanel;
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="For Each View As B4XView In BackgroundPanel.GetA";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = _backgroundpanel.GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group5.Get(index5)));
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="If \"xlbl_Date\" = View.Tag Then";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="m_CustomDrawDay.xlbl_Date = View";
_m_customdrawday.xlbl_Date /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _view;
 };
 }
};
RDebugUtils.currentLine=36175887;
 //BA.debugLineNum = 36175887;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawDay";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawDay",(Object)(_date),(Object)(_m_customdrawday));
 };
RDebugUtils.currentLine=36175889;
 //BA.debugLineNum = 36175889;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Private Sub AddYear(Parent As B4XView,CurrentDate";
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="Dim BlockHeight As Float = xpnl_ViewPager.Height/";
_blockheight = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()/(double)4);
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="Dim BlockWidth As Float = xpnl_ViewPager.Width/3";
_blockwidth = (float) (__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()/(double)3);
RDebugUtils.currentLine=32243717;
 //BA.debugLineNum = 32243717;BA.debugLine="Parent.Color = m_BodyColor";
_parent.setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=32243719;
 //BA.debugLineNum = 32243719;BA.debugLine="For i = 1 To 13 -1";
{
final int step4 = 1;
final int limit4 = (int) (13-1);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=32243723;
 //BA.debugLineNum = 32243723;BA.debugLine="Dim Rest As Int = (i-1)/3";
_rest = (int) ((_i-1)/(double)3);
RDebugUtils.currentLine=32243724;
 //BA.debugLineNum = 32243724;BA.debugLine="Dim test As Int = (i-1) Mod 3";
_test = (int) ((_i-1)%3);
RDebugUtils.currentLine=32243726;
 //BA.debugLineNum = 32243726;BA.debugLine="Dim Text As String = \"\"";
_text = "";
RDebugUtils.currentLine=32243727;
 //BA.debugLineNum = 32243727;BA.debugLine="Dim xpnl_Date As B4XView";
_xpnl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=32243728;
 //BA.debugLineNum = 32243728;BA.debugLine="Dim SelectThisPanel As Boolean = False";
_selectthispanel = __c.False;
RDebugUtils.currentLine=32243729;
 //BA.debugLineNum = 32243729;BA.debugLine="If m_CurrentView = getCurrentView_YearView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=32243730;
 //BA.debugLineNum = 32243730;BA.debugLine="Text = GetMonthNameByIndex(i)";
_text = __ref._getmonthnamebyindex /*String*/ (null,_i);
RDebugUtils.currentLine=32243731;
 //BA.debugLineNum = 32243731;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_YearMonth\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_YearMonth");
RDebugUtils.currentLine=32243732;
 //BA.debugLineNum = 32243732;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,__c.DateTime.GetYear(_currentdate),_i,(int) (1))));
RDebugUtils.currentLine=32243733;
 //BA.debugLineNum = 32243733;BA.debugLine="If DateTime.GetMonth(xpnl_Date.Tag) = DateTime.";
if (__c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetMonth(__c.DateTime.getNow()) && __c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=32243735;
 //BA.debugLineNum = 32243735;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__ref._m_mindate /*long*/ ) && __c.DateTime.GetMonth(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=32243736;
 //BA.debugLineNum = 32243736;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=32243739;
 //BA.debugLineNum = 32243739;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=32243740;
 //BA.debugLineNum = 32243740;BA.debugLine="Text = DateTime.GetYear(CurrentDate)+(i-1)";
_text = BA.NumberToString(__c.DateTime.GetYear(_currentdate)+(_i-1));
RDebugUtils.currentLine=32243741;
 //BA.debugLineNum = 32243741;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_DecadeYear\")";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_DecadeYear");
RDebugUtils.currentLine=32243742;
 //BA.debugLineNum = 32243742;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*1),(int) (1),(int) (1))));
RDebugUtils.currentLine=32243743;
 //BA.debugLineNum = 32243743;BA.debugLine="If DateTime.GetYear(xpnl_Date.Tag) = DateTime.G";
if (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))==__c.DateTime.GetYear(__c.DateTime.getNow())) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=32243745;
 //BA.debugLineNum = 32243745;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And ((DateT";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && ((__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) || (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )))) { 
RDebugUtils.currentLine=32243746;
 //BA.debugLineNum = 32243746;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=32243749;
 //BA.debugLineNum = 32243749;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVi";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=32243750;
 //BA.debugLineNum = 32243750;BA.debugLine="Text = (DateTime.GetYear(CurrentDate)+(i-1)*10)";
_text = BA.NumberToString((__c.DateTime.GetYear(_currentdate)+(_i-1)*10))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9));
RDebugUtils.currentLine=32243751;
 //BA.debugLineNum = 32243751;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_CenturyDecade";
_xpnl_date = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"xpnl_CenturyDecade");
RDebugUtils.currentLine=32243752;
 //BA.debugLineNum = 32243752;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
_xpnl_date.setTag((Object)(_dateutils._setdate(ba,(int) (__c.DateTime.GetYear(_currentdate)+(_i-1)*10),(int) (1),(int) (1))));
RDebugUtils.currentLine=32243753;
 //BA.debugLineNum = 32243753;BA.debugLine="If DateTime.GetYear(DateTime.Now) >= (DateTime.";
if (__c.DateTime.GetYear(__c.DateTime.getNow())>=(__c.DateTime.GetYear(_currentdate)+(_i-1)*10) && __c.DateTime.GetYear(__c.DateTime.getNow())<=((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)) { 
_selectthispanel = __c.True;};
RDebugUtils.currentLine=32243760;
 //BA.debugLineNum = 32243760;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
if ((__ref._m_maxdate /*long*/ >0 || __ref._m_mindate /*long*/ >0) && (__c.DateTime.GetYear(BA.ObjectToLongNumber(_xpnl_date.getTag()))>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ) || ((__c.DateTime.GetYear(_currentdate)+(_i-1)*10)+9)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ ))) { 
RDebugUtils.currentLine=32243761;
 //BA.debugLineNum = 32243761;BA.debugLine="xpnl_Date.Visible = False";
_xpnl_date.setVisible(__c.False);
 };
 }}}
;
RDebugUtils.currentLine=32243766;
 //BA.debugLineNum = 32243766;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent";
_xpnl_date.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=32243767;
 //BA.debugLineNum = 32243767;BA.debugLine="Parent.AddView(xpnl_Date,BlockWidth*test,BlockHe";
_parent.AddView((android.view.View)(_xpnl_date.getObject()),(int) (_blockwidth*_test),(int) (_blockheight*_rest),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=32243768;
 //BA.debugLineNum = 32243768;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=32243770;
 //BA.debugLineNum = 32243770;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
_xlbl_date.setFont(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=32243771;
 //BA.debugLineNum = 32243771;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32243772;
 //BA.debugLineNum = 32243772;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_date.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=32243774;
 //BA.debugLineNum = 32243774;BA.debugLine="xlbl_Date.Text = Text";
_xlbl_date.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=32243776;
 //BA.debugLineNum = 32243776;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
_xpnl_date.AddView((android.view.View)(_xlbl_date.getObject()),(int) (0),(int) (0),(int) (_blockwidth),(int) (_blockheight));
RDebugUtils.currentLine=32243778;
 //BA.debugLineNum = 32243778;BA.debugLine="If SelectThisPanel Then";
if (_selectthispanel) { 
RDebugUtils.currentLine=32243779;
 //BA.debugLineNum = 32243779;BA.debugLine="Dim xpnl_Current As B4XView = xui.CreatePanel(\"";
_xpnl_current = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_current = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32243780;
 //BA.debugLineNum = 32243780;BA.debugLine="Dim StrokeWidth As Float = 2dip";
_strokewidth = (float) (__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=32243781;
 //BA.debugLineNum = 32243781;BA.debugLine="xpnl_Date.AddView(xpnl_Current,StrokeWidth,Stro";
_xpnl_date.AddView((android.view.View)(_xpnl_current.getObject()),(int) (_strokewidth),(int) (_strokewidth),(int) (_blockwidth-_strokewidth*2),(int) (_blockheight-_strokewidth*2));
RDebugUtils.currentLine=32243783;
 //BA.debugLineNum = 32243783;BA.debugLine="xpnl_Current.SetColorAndBorder(xui.Color_Transp";
_xpnl_current.SetColorAndBorder(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent,(int) (_strokewidth),__ref._m_currentdatecolor /*int*/ ,__c.DipToCurrent((int) (5)));
 };
 }
};
RDebugUtils.currentLine=32243787;
 //BA.debugLineNum = 32243787;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_yearview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_yearview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_yearview", null));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Public Sub getCurrentView_YearView As String";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Return \"YearView\"";
if (true) return "YearView";
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="End Sub";
return "";
}
public String  _getmonthnamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getmonthnamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Private Sub GetMonthNameByIndex(index As Int) As S";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="If index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="Return g_MonthNameShort.January";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .January /*String*/ ;
 }else 
{RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="else If index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="Return g_MonthNameShort.February";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .February /*String*/ ;
 }else 
{RDebugUtils.currentLine=37289989;
 //BA.debugLineNum = 37289989;BA.debugLine="else If index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=37289990;
 //BA.debugLineNum = 37289990;BA.debugLine="Return g_MonthNameShort.March";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .March /*String*/ ;
 }else 
{RDebugUtils.currentLine=37289991;
 //BA.debugLineNum = 37289991;BA.debugLine="else If index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=37289992;
 //BA.debugLineNum = 37289992;BA.debugLine="Return g_MonthNameShort.April";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .April /*String*/ ;
 }else 
{RDebugUtils.currentLine=37289993;
 //BA.debugLineNum = 37289993;BA.debugLine="else If index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=37289994;
 //BA.debugLineNum = 37289994;BA.debugLine="Return g_MonthNameShort.May";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .May /*String*/ ;
 }else 
{RDebugUtils.currentLine=37289995;
 //BA.debugLineNum = 37289995;BA.debugLine="else If index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=37289996;
 //BA.debugLineNum = 37289996;BA.debugLine="Return g_MonthNameShort.June";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .June /*String*/ ;
 }else 
{RDebugUtils.currentLine=37289997;
 //BA.debugLineNum = 37289997;BA.debugLine="else If index = 7 Then";
if (_index==7) { 
RDebugUtils.currentLine=37289998;
 //BA.debugLineNum = 37289998;BA.debugLine="Return g_MonthNameShort.July";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .July /*String*/ ;
 }else 
{RDebugUtils.currentLine=37289999;
 //BA.debugLineNum = 37289999;BA.debugLine="else If index = 8 Then";
if (_index==8) { 
RDebugUtils.currentLine=37290000;
 //BA.debugLineNum = 37290000;BA.debugLine="Return g_MonthNameShort.August";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .August /*String*/ ;
 }else 
{RDebugUtils.currentLine=37290001;
 //BA.debugLineNum = 37290001;BA.debugLine="else If index = 9 Then";
if (_index==9) { 
RDebugUtils.currentLine=37290002;
 //BA.debugLineNum = 37290002;BA.debugLine="Return g_MonthNameShort.September";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .September /*String*/ ;
 }else 
{RDebugUtils.currentLine=37290003;
 //BA.debugLineNum = 37290003;BA.debugLine="else If index = 10 Then";
if (_index==10) { 
RDebugUtils.currentLine=37290004;
 //BA.debugLineNum = 37290004;BA.debugLine="Return g_MonthNameShort.October";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .October /*String*/ ;
 }else 
{RDebugUtils.currentLine=37290005;
 //BA.debugLineNum = 37290005;BA.debugLine="else If index = 11 Then";
if (_index==11) { 
RDebugUtils.currentLine=37290006;
 //BA.debugLineNum = 37290006;BA.debugLine="Return g_MonthNameShort.November";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .November /*String*/ ;
 }else {
RDebugUtils.currentLine=37290008;
 //BA.debugLineNum = 37290008;BA.debugLine="Return g_MonthNameShort.December";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ .December /*String*/ ;
 }}}}}}}}}}}
;
RDebugUtils.currentLine=37290010;
 //BA.debugLineNum = 37290010;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_decadeview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_decadeview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_decadeview", null));}
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Public Sub getCurrentView_DecadeView As String";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Return \"DecadeView\"";
if (true) return "DecadeView";
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="End Sub";
return "";
}
public String  _getcurrentview_centuryview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview_centuryview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview_centuryview", null));}
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Public Sub getCurrentView_CenturyView As String";
RDebugUtils.currentLine=35717121;
 //BA.debugLineNum = 35717121;BA.debugLine="Return \"CenturyView\"";
if (true) return "CenturyView";
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="xiv_RefreshImage.SetLayoutAnimated(0,0,0,Width,He";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="xpnl_Header.SetLayoutAnimated(0,0,0,Width,g_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=31653891;
 //BA.debugLineNum = 31653891;BA.debugLine="xpnl_ViewPager.SetLayoutAnimated(0,0,g_HeaderProp";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),(int) (_width),(int) (_height-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=31653892;
 //BA.debugLineNum = 31653892;BA.debugLine="xASVP_Main.Base_Resize(Width,xpnl_ViewPager.Heigh";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._base_resize /*void*/ (null,_width,__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31653895;
 //BA.debugLineNum = 31653895;BA.debugLine="xpnl_Header.GetView(0).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0)).SetLayoutAnimated((int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31653896;
 //BA.debugLineNum = 31653896;BA.debugLine="xpnl_Header.GetView(1).SetLayoutAnimated(0,0,0,xp";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31653897;
 //BA.debugLineNum = 31653897;BA.debugLine="xpnl_Header.GetView(2).SetLayoutAnimated(0,xpnl_H";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2)).SetLayoutAnimated((int) (0),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31653899;
 //BA.debugLineNum = 31653899;BA.debugLine="xASVP_Main.ResetLazyLoadingPanels";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingpanels /*String*/ (null);
RDebugUtils.currentLine=31653900;
 //BA.debugLineNum = 31653900;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "base_resize"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=31653901;
 //BA.debugLineNum = 31653901;BA.debugLine="xASVP_Main.ResetLazyloadingIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._resetlazyloadingindex /*String*/ (null);
RDebugUtils.currentLine=31653902;
 //BA.debugLineNum = 31653902;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=31653903;
 //BA.debugLineNum = 31653903;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,True)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.True);
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="m_CurrentView = NewView";
__ref._m_currentview /*String*/  = _newview;
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=32309252;
 //BA.debugLineNum = 32309252;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "changeview"),(int) (250));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=32309253;
 //BA.debugLineNum = 32309253;BA.debugLine="Select Case NewView";
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
RDebugUtils.currentLine=32309255;
 //BA.debugLineNum = 32309255;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 5:
//C
this.state = 10;
RDebugUtils.currentLine=32309257;
 //BA.debugLineNum = 32309257;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=32309259;
 //BA.debugLineNum = 32309259;BA.debugLine="CreateDecadeView";
__ref._createdecadeview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=32309261;
 //BA.debugLineNum = 32309261;BA.debugLine="CreateCenturyView";
__ref._createcenturyview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=32309263;
 //BA.debugLineNum = 32309263;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
RDebugUtils.currentLine=32309264;
 //BA.debugLineNum = 32309264;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub getCurrentView_MonthView As String";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="Return \"MonthView\"";
if (true) return "MonthView";
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=31916035;
 //BA.debugLineNum = 31916035;BA.debugLine="Dim YearGap As Int = 1";
_yeargap = (int) (1);
RDebugUtils.currentLine=31916036;
 //BA.debugLineNum = 31916036;BA.debugLine="Dim StartDate As Long = DateUtils.SetDate(DateTim";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=31916037;
 //BA.debugLineNum = 31916037;BA.debugLine="Dim Enddate As Long = DateUtils.SetDate(DateTime.";
_enddate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),parent.__c.DateTime.GetMonth(__ref._m_startdate /*long*/ ),(int) (1));
RDebugUtils.currentLine=31916039;
 //BA.debugLineNum = 31916039;BA.debugLine="If m_MinDate > 0 Then StartDate = m_MinDate";
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
RDebugUtils.currentLine=31916040;
 //BA.debugLineNum = 31916040;BA.debugLine="Dim NumberOfMonths As Int = IIf(m_MaxDate=0, Mont";
_numberofmonths = (int)(BA.ObjectToNumber(((__ref._m_maxdate /*long*/ ==0) ? ((Object)(__ref._monthbetween /*int*/ (null,_startdate,_enddate))) : ((Object)(0)))));
RDebugUtils.currentLine=31916042;
 //BA.debugLineNum = 31916042;BA.debugLine="If m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=31916043;
 //BA.debugLineNum = 31916043;BA.debugLine="Dim MonthsBetween As Int = MonthBetween(StartDat";
_monthsbetween = __ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ );
RDebugUtils.currentLine=31916044;
 //BA.debugLineNum = 31916044;BA.debugLine="Dim tmp As Period";
_tmp = new b4a.example.dateutils._period();
RDebugUtils.currentLine=31916045;
 //BA.debugLineNum = 31916045;BA.debugLine="tmp.Initialize";
_tmp.Initialize();
RDebugUtils.currentLine=31916046;
 //BA.debugLineNum = 31916046;BA.debugLine="tmp.Months = MonthsBetween";
_tmp.Months = _monthsbetween;
RDebugUtils.currentLine=31916047;
 //BA.debugLineNum = 31916047;BA.debugLine="If DateUtils.AddPeriod(StartDate,tmp) < m_MaxDat";
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
RDebugUtils.currentLine=31916048;
 //BA.debugLineNum = 31916048;BA.debugLine="NumberOfMonths = Max(MonthsBetween,1)";
_numberofmonths = (int) (parent.__c.Max(_monthsbetween,1));
 if (true) break;
;
RDebugUtils.currentLine=31916051;
 //BA.debugLineNum = 31916051;BA.debugLine="For i = 0 To NumberOfMonths -1";

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
RDebugUtils.currentLine=31916053;
 //BA.debugLineNum = 31916053;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31916054;
 //BA.debugLineNum = 31916054;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=31916055;
 //BA.debugLineNum = 31916055;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31916057;
 //BA.debugLineNum = 31916057;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=31916058;
 //BA.debugLineNum = 31916058;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=31916059;
 //BA.debugLineNum = 31916059;BA.debugLine="p2.Months = i";
_p2.Months = _i;
RDebugUtils.currentLine=31916061;
 //BA.debugLineNum = 31916061;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=31916062;
 //BA.debugLineNum = 31916062;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate(";
_firstdayofmonth = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(_currenttime),parent.__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=31916064;
 //BA.debugLineNum = 31916064;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfMon";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
RDebugUtils.currentLine=31916066;
 //BA.debugLineNum = 31916066;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=31916072;
 //BA.debugLineNum = 31916072;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (250));
this.state = 28;
return;
case 28:
//C
this.state = -1;
;
RDebugUtils.currentLine=31916077;
 //BA.debugLineNum = 31916077;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=31916078;
 //BA.debugLineNum = 31916078;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=31916080;
 //BA.debugLineNum = 31916080;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createmonthview"),(int) (0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
RDebugUtils.currentLine=31916081;
 //BA.debugLineNum = 31916081;BA.debugLine="m_isReady = True";
__ref._m_isready /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=31916164;
 //BA.debugLineNum = 31916164;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="Dim YearGap As Int = 10";
_yeargap = (int) (10);
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=31981573;
 //BA.debugLineNum = 31981573;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=31981574;
 //BA.debugLineNum = 31981574;BA.debugLine="StartDate =	DateUtils.SetDate(DateTime.GetYear(m";
_startdate = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-_yeargap),(int) (1),(int) (1));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31981576;
 //BA.debugLineNum = 31981576;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=31981579;
 //BA.debugLineNum = 31981579;BA.debugLine="Dim FirstDateOfFuture As Long = DateUtils.SetDate";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
RDebugUtils.currentLine=31981581;
 //BA.debugLineNum = 31981581;BA.debugLine="Dim NumberOfYears As Int";
_numberofyears = 0;
RDebugUtils.currentLine=31981583;
 //BA.debugLineNum = 31981583;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=31981584;
 //BA.debugLineNum = 31981584;BA.debugLine="NumberOfYears = MonthBetween(StartDate,FirstDate";
_numberofyears = (int) (__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=31981586;
 //BA.debugLineNum = 31981586;BA.debugLine="Dim YearsBetween As Int = Ceil(MonthBetween(Star";
_yearsbetween = (int) (parent.__c.Ceil(__ref._monthbetween /*int*/ (null,_startdate,__ref._m_maxdate /*long*/ )/(double)12));
RDebugUtils.currentLine=31981587;
 //BA.debugLineNum = 31981587;BA.debugLine="NumberOfYears = Max(YearsBetween,1)";
_numberofyears = (int) (parent.__c.Max(_yearsbetween,1));
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=31981590;
 //BA.debugLineNum = 31981590;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=31981596;
 //BA.debugLineNum = 31981596;BA.debugLine="For i = 0 To NumberOfYears -1";
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
RDebugUtils.currentLine=31981598;
 //BA.debugLineNum = 31981598;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31981599;
 //BA.debugLineNum = 31981599;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=31981600;
 //BA.debugLineNum = 31981600;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31981602;
 //BA.debugLineNum = 31981602;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=31981603;
 //BA.debugLineNum = 31981603;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=31981604;
 //BA.debugLineNum = 31981604;BA.debugLine="p2.Years = i";
_p2.Years = _i;
RDebugUtils.currentLine=31981606;
 //BA.debugLineNum = 31981606;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=31981609;
 //BA.debugLineNum = 31981609;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=31981611;
 //BA.debugLineNum = 31981611;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
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
RDebugUtils.currentLine=31981617;
 //BA.debugLineNum = 31981617;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createyearview"),(int) (0));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
RDebugUtils.currentLine=31981627;
 //BA.debugLineNum = 31981627;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=31981628;
 //BA.debugLineNum = 31981628;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=31981630;
 //BA.debugLineNum = 31981630;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32047110;
 //BA.debugLineNum = 32047110;BA.debugLine="Dim CurrentDecade As Long = DateUtils.SetDate(Dat";
_currentdecade = parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(parent._dateutils._setdate(ba,parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ ),(int) (1),(int) (1))),(int) (1),(int) (1));
RDebugUtils.currentLine=32047112;
 //BA.debugLineNum = 32047112;BA.debugLine="Dim YearGap As Int = 50";
_yeargap = (int) (50);
RDebugUtils.currentLine=32047114;
 //BA.debugLineNum = 32047114;BA.debugLine="Dim StartDate As Long";
_startdate = 0L;
RDebugUtils.currentLine=32047115;
 //BA.debugLineNum = 32047115;BA.debugLine="If m_MinDate = 0 Then";
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
RDebugUtils.currentLine=32047116;
 //BA.debugLineNum = 32047116;BA.debugLine="StartDate =	DateUtils.SetDate(1400,12,31)";
_startdate = parent._dateutils._setdate(ba,(int) (1400),(int) (12),(int) (31));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=32047118;
 //BA.debugLineNum = 32047118;BA.debugLine="StartDate =	m_MinDate";
_startdate = __ref._m_mindate /*long*/ ;
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=32047121;
 //BA.debugLineNum = 32047121;BA.debugLine="Dim FirstDateOfFuture As Long";
_firstdateoffuture = 0L;
RDebugUtils.currentLine=32047122;
 //BA.debugLineNum = 32047122;BA.debugLine="If m_MaxDate = 0 Then";
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
RDebugUtils.currentLine=32047123;
 //BA.debugLineNum = 32047123;BA.debugLine="FirstDateOfFuture = DateUtils.SetDate(DateTime.G";
_firstdateoffuture = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )+_yeargap),(int) (12),(int) (31));
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=32047125;
 //BA.debugLineNum = 32047125;BA.debugLine="FirstDateOfFuture = m_MaxDate";
_firstdateoffuture = __ref._m_maxdate /*long*/ ;
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=32047129;
 //BA.debugLineNum = 32047129;BA.debugLine="Dim NumberOfDecades As Int = Ceil(Max((MonthBetwe";
_numberofdecades = (int) (parent.__c.Ceil(parent.__c.Max((__ref._monthbetween /*int*/ (null,_startdate,_firstdateoffuture)/(double)12)/(double)10,1)));
RDebugUtils.currentLine=32047131;
 //BA.debugLineNum = 32047131;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=32047137;
 //BA.debugLineNum = 32047137;BA.debugLine="For i = 0 To NumberOfDecades -1";
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
RDebugUtils.currentLine=32047139;
 //BA.debugLineNum = 32047139;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32047140;
 //BA.debugLineNum = 32047140;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=32047141;
 //BA.debugLineNum = 32047141;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32047143;
 //BA.debugLineNum = 32047143;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=32047144;
 //BA.debugLineNum = 32047144;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=32047145;
 //BA.debugLineNum = 32047145;BA.debugLine="p2.Years = i*10";
_p2.Years = (int) (_i*10);
RDebugUtils.currentLine=32047147;
 //BA.debugLineNum = 32047147;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
_currenttime = parent._dateutils._addperiod(ba,_startdate,_p2);
RDebugUtils.currentLine=32047150;
 //BA.debugLineNum = 32047150;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=32047152;
 //BA.debugLineNum = 32047152;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=32047154;
 //BA.debugLineNum = 32047154;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
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
RDebugUtils.currentLine=32047158;
 //BA.debugLineNum = 32047158;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createdecadeview"),(int) (0));
this.state = 31;
return;
case 31:
//C
this.state = -1;
;
RDebugUtils.currentLine=32047159;
 //BA.debugLineNum = 32047159;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=32047160;
 //BA.debugLineNum = 32047160;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=32047162;
 //BA.debugLineNum = 32047162;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="Dim CurrentCenturyStart As Long = DateUtils.SetDa";
_currentcenturystart = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )-parent.__c.Round(((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100)-((int) ((parent.__c.DateTime.GetYear(__ref._m_startdate /*long*/ )/(double)100))))*100)),(int) (1),(int) (1));
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="Dim p As Period";
_p = new b4a.example.dateutils._period();
RDebugUtils.currentLine=32112647;
 //BA.debugLineNum = 32112647;BA.debugLine="p.Initialize";
_p.Initialize();
RDebugUtils.currentLine=32112649;
 //BA.debugLineNum = 32112649;BA.debugLine="Dim FirstDateOfPast As Long = DateUtils.SetDate(1";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (1),(int) (1),(int) (1));
RDebugUtils.currentLine=32112651;
 //BA.debugLineNum = 32112651;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then";
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
RDebugUtils.currentLine=32112652;
 //BA.debugLineNum = 32112652;BA.debugLine="If m_MinDate > 0 Then";
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
RDebugUtils.currentLine=32112653;
 //BA.debugLineNum = 32112653;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
_firstdateofpast = parent._dateutils._setdate(ba,(int) (parent.__c.DateTime.GetYear(__ref._m_mindate /*long*/ )-40),(int) (1),(int) (1));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=32112655;
 //BA.debugLineNum = 32112655;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
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
RDebugUtils.currentLine=32112672;
 //BA.debugLineNum = 32112672;BA.debugLine="Dim StartIndex As Int = 0";
_startindex = (int) (0);
RDebugUtils.currentLine=32112678;
 //BA.debugLineNum = 32112678;BA.debugLine="Dim NumberOfCentries As Int = 80";
_numberofcentries = (int) (80);
RDebugUtils.currentLine=32112679;
 //BA.debugLineNum = 32112679;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then NumberOfCe";
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
RDebugUtils.currentLine=32112681;
 //BA.debugLineNum = 32112681;BA.debugLine="For i = 0 To NumberOfCentries -1";
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
RDebugUtils.currentLine=32112683;
 //BA.debugLineNum = 32112683;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=32112684;
 //BA.debugLineNum = 32112684;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=32112685;
 //BA.debugLineNum = 32112685;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=32112687;
 //BA.debugLineNum = 32112687;BA.debugLine="p.Years = i*10*12";
_p.Years = (int) (_i*10*12);
RDebugUtils.currentLine=32112688;
 //BA.debugLineNum = 32112688;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(Fi";
_currenttime = parent._dateutils._addperiod(ba,_firstdateofpast,_p);
RDebugUtils.currentLine=32112689;
 //BA.debugLineNum = 32112689;BA.debugLine="If i > 0 Then";
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
RDebugUtils.currentLine=32112690;
 //BA.debugLineNum = 32112690;BA.debugLine="CurrentTime = DateUtils.SetDate((DateTime.GetYe";
_currenttime = parent._dateutils._setdate(ba,(int) ((parent.__c.DateTime.GetYear(_currenttime)-parent.__c.Round(((parent.__c.DateTime.GetYear(_currenttime)/(double)100)-((int) ((parent.__c.DateTime.GetYear(_currenttime)/(double)100))))*100))+1),(int) (1),(int) (1));
RDebugUtils.currentLine=32112691;
 //BA.debugLineNum = 32112691;BA.debugLine="If DateTime.GetMonth(CurrentTime) = 1 Then";
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
RDebugUtils.currentLine=32112692;
 //BA.debugLineNum = 32112692;BA.debugLine="CurrentTime = DateUtils.SetDate(DateTime.GetYe";
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
RDebugUtils.currentLine=32112697;
 //BA.debugLineNum = 32112697;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
RDebugUtils.currentLine=32112699;
 //BA.debugLineNum = 32112699;BA.debugLine="If DateTime.GetYear(CurrentCenturyStart) = DateT";
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
RDebugUtils.currentLine=32112705;
 //BA.debugLineNum = 32112705;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "createcenturyview"),(int) (0));
this.state = 37;
return;
case 37:
//C
this.state = -1;
;
RDebugUtils.currentLine=32112706;
 //BA.debugLineNum = 32112706;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex2(null,_startindex);
RDebugUtils.currentLine=32112707;
 //BA.debugLineNum = 32112707;BA.debugLine="xASVP_Main.Commit";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._commit /*String*/ (null);
RDebugUtils.currentLine=32112709;
 //BA.debugLineNum = 32112709;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="Type ASDatePicker_MonthNameShort(January As Strin";
;
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="Type ASDatePicker_WeekNameShort(Monday As String,";
;
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="Type ASDatePicker_HeaderProperties(Height As Floa";
;
RDebugUtils.currentLine=31129606;
 //BA.debugLineNum = 31129606;BA.debugLine="Type ASDatePicker_BodyProperties(xFont As B4XFont";
;
RDebugUtils.currentLine=31129607;
 //BA.debugLineNum = 31129607;BA.debugLine="Type ASDatePicker_CustomDrawDay(BackgroundPanel A";
;
RDebugUtils.currentLine=31129608;
 //BA.debugLineNum = 31129608;BA.debugLine="Type ASDatePicker_CustomDrawHeader(BackgroundPane";
;
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="Type ASDatePicker_WeekNumberProperties(Width As F";
;
RDebugUtils.currentLine=31129610;
 //BA.debugLineNum = 31129610;BA.debugLine="Type ASDatePicker_WeekNameProperties(Color As Int";
;
RDebugUtils.currentLine=31129612;
 //BA.debugLineNum = 31129612;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=31129613;
 //BA.debugLineNum = 31129613;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=31129614;
 //BA.debugLineNum = 31129614;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31129615;
 //BA.debugLineNum = 31129615;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=31129616;
 //BA.debugLineNum = 31129616;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=31129618;
 //BA.debugLineNum = 31129618;BA.debugLine="Private m_isReady As Boolean = False";
_m_isready = __c.False;
RDebugUtils.currentLine=31129620;
 //BA.debugLineNum = 31129620;BA.debugLine="Private g_HeaderProperties As ASDatePicker_Header";
_g_headerproperties = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=31129621;
 //BA.debugLineNum = 31129621;BA.debugLine="Private g_BodyProperties As ASDatePicker_BodyProp";
_g_bodyproperties = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=31129623;
 //BA.debugLineNum = 31129623;BA.debugLine="Private g_MonthNameShort As ASDatePicker_MonthNam";
_g_monthnameshort = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=31129624;
 //BA.debugLineNum = 31129624;BA.debugLine="Private g_WeekNameShort As ASDatePicker_WeekNameS";
_g_weeknameshort = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=31129625;
 //BA.debugLineNum = 31129625;BA.debugLine="Private g_WeekNumberProperties As ASDatePicker_We";
_g_weeknumberproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=31129626;
 //BA.debugLineNum = 31129626;BA.debugLine="Private g_WeekNameProperties As ASDatePicker_Week";
_g_weeknameproperties = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=31129628;
 //BA.debugLineNum = 31129628;BA.debugLine="Private xASVP_Main As ASViewPager";
_xasvp_main = new b4a.example.ef.asviewpager();
RDebugUtils.currentLine=31129630;
 //BA.debugLineNum = 31129630;BA.debugLine="Private xpnl_LoadingPanel As B4XView";
_xpnl_loadingpanel = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31129631;
 //BA.debugLineNum = 31129631;BA.debugLine="Private xpnl_Header As B4XView";
_xpnl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31129632;
 //BA.debugLineNum = 31129632;BA.debugLine="Private xpnl_ViewPager As B4XView";
_xpnl_viewpager = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31129633;
 //BA.debugLineNum = 31129633;BA.debugLine="Private xpnl_SelectedDate As B4XView";
_xpnl_selecteddate = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31129634;
 //BA.debugLineNum = 31129634;BA.debugLine="Private xpnl_SelectedDate2 As B4XView";
_xpnl_selecteddate2 = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31129639;
 //BA.debugLineNum = 31129639;BA.debugLine="Private m_HeaderColor As Int";
_m_headercolor = 0;
RDebugUtils.currentLine=31129640;
 //BA.debugLineNum = 31129640;BA.debugLine="Private m_BodyColor As Int";
_m_bodycolor = 0;
RDebugUtils.currentLine=31129641;
 //BA.debugLineNum = 31129641;BA.debugLine="Private m_CurrentDateColor As Int";
_m_currentdatecolor = 0;
RDebugUtils.currentLine=31129642;
 //BA.debugLineNum = 31129642;BA.debugLine="Private m_SelectedDateColor As Int";
_m_selecteddatecolor = 0;
RDebugUtils.currentLine=31129643;
 //BA.debugLineNum = 31129643;BA.debugLine="Private m_MouseHoverFeedback As Boolean 'Ignore";
_m_mousehoverfeedback = false;
RDebugUtils.currentLine=31129644;
 //BA.debugLineNum = 31129644;BA.debugLine="Private m_SelectedDate As Long";
_m_selecteddate = 0L;
RDebugUtils.currentLine=31129645;
 //BA.debugLineNum = 31129645;BA.debugLine="Private m_SelectedDate2 As Long";
_m_selecteddate2 = 0L;
RDebugUtils.currentLine=31129646;
 //BA.debugLineNum = 31129646;BA.debugLine="Private m_ShowWeekNumbers As Boolean";
_m_showweeknumbers = false;
RDebugUtils.currentLine=31129647;
 //BA.debugLineNum = 31129647;BA.debugLine="Private m_FirstDayOfWeek As Int = 5 'Monday";
_m_firstdayofweek = (int) (5);
RDebugUtils.currentLine=31129648;
 //BA.debugLineNum = 31129648;BA.debugLine="Private m_ShowGridLines As Boolean";
_m_showgridlines = false;
RDebugUtils.currentLine=31129649;
 //BA.debugLineNum = 31129649;BA.debugLine="Private m_GridLineColor As Int";
_m_gridlinecolor = 0;
RDebugUtils.currentLine=31129650;
 //BA.debugLineNum = 31129650;BA.debugLine="Private m_ThemeChangeTransition As String";
_m_themechangetransition = "";
RDebugUtils.currentLine=31129652;
 //BA.debugLineNum = 31129652;BA.debugLine="Private m_CurrentView As String";
_m_currentview = "";
RDebugUtils.currentLine=31129653;
 //BA.debugLineNum = 31129653;BA.debugLine="Private m_StartDate As Long";
_m_startdate = 0L;
RDebugUtils.currentLine=31129654;
 //BA.debugLineNum = 31129654;BA.debugLine="Private m_InactiveDaysVisible As Boolean";
_m_inactivedaysvisible = false;
RDebugUtils.currentLine=31129655;
 //BA.debugLineNum = 31129655;BA.debugLine="Private m_MinDate,m_MaxDate As Long";
_m_mindate = 0L;
_m_maxdate = 0L;
RDebugUtils.currentLine=31129656;
 //BA.debugLineNum = 31129656;BA.debugLine="Private m_SelectMode As String";
_m_selectmode = "";
RDebugUtils.currentLine=31129658;
 //BA.debugLineNum = 31129658;BA.debugLine="Private xiv_RefreshImage As B4XView";
_xiv_refreshimage = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=31129660;
 //BA.debugLineNum = 31129660;BA.debugLine="Type AS_DatePicker_Theme(SelectedTextColor As Int";
;
RDebugUtils.currentLine=31129662;
 //BA.debugLineNum = 31129662;BA.debugLine="End Sub";
return "";
}
public String  _clearselections(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "clearselections", true))
	 {return ((String) Debug.delegate(ba, "clearselections", null));}
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Public Sub ClearSelections";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _createasdatepicker_bodyproperties(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,int _selectedtextcolor,float _currentandselecteddayheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_bodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "createasdatepicker_bodyproperties", new Object[] {_xfont,_textcolor,_selectedtextcolor,_currentandselecteddayheight}));}
b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _t1 = null;
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Public Sub CreateASDatePicker_BodyProperties (xFon";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="Dim t1 As ASDatePicker_BodyProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_bodyproperties();
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
_t1.SelectedTextColor /*int*/  = _selectedtextcolor;
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="t1.CurrentAndSelectedDayHeight = CurrentAndSelect";
_t1.CurrentAndSelectedDayHeight /*float*/  = _currentandselecteddayheight;
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _createasdatepicker_headerproperties(b4a.example.ef.as_datepicker __ref,float _height,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _buttoniconsize,boolean _arrowsvisible) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_headerproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "createasdatepicker_headerproperties", new Object[] {_height,_xfont,_textcolor,_buttoniconsize,_arrowsvisible}));}
b4a.example.ef.as_datepicker._asdatepicker_headerproperties _t1 = null;
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Public Sub CreateASDatePicker_HeaderProperties (He";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Dim t1 As ASDatePicker_HeaderProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_headerproperties();
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="t1.ButtonIconSize = ButtonIconSize";
_t1.ButtonIconSize /*float*/  = _buttoniconsize;
RDebugUtils.currentLine=37814279;
 //BA.debugLineNum = 37814279;BA.debugLine="t1.ArrowsVisible = ArrowsVisible";
_t1.ArrowsVisible /*boolean*/  = _arrowsvisible;
RDebugUtils.currentLine=37814280;
 //BA.debugLineNum = 37814280;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=37814281;
 //BA.debugLineNum = 37814281;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _createasdatepicker_monthnameshort(b4a.example.ef.as_datepicker __ref,String _january,String _february,String _march,String _april,String _may,String _june,String _july,String _august,String _september,String _october,String _november,String _december) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_monthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "createasdatepicker_monthnameshort", new Object[] {_january,_february,_march,_april,_may,_june,_july,_august,_september,_october,_november,_december}));}
b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _t1 = null;
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Public Sub CreateASDatePicker_MonthNameShort (Janu";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Dim t1 As ASDatePicker_MonthNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_monthnameshort();
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="t1.January = January";
_t1.January /*String*/  = _january;
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="t1.February = February";
_t1.February /*String*/  = _february;
RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="t1.March = March";
_t1.March /*String*/  = _march;
RDebugUtils.currentLine=37617670;
 //BA.debugLineNum = 37617670;BA.debugLine="t1.April = April";
_t1.April /*String*/  = _april;
RDebugUtils.currentLine=37617671;
 //BA.debugLineNum = 37617671;BA.debugLine="t1.May = May";
_t1.May /*String*/  = _may;
RDebugUtils.currentLine=37617672;
 //BA.debugLineNum = 37617672;BA.debugLine="t1.June = June";
_t1.June /*String*/  = _june;
RDebugUtils.currentLine=37617673;
 //BA.debugLineNum = 37617673;BA.debugLine="t1.July = July";
_t1.July /*String*/  = _july;
RDebugUtils.currentLine=37617674;
 //BA.debugLineNum = 37617674;BA.debugLine="t1.August = August";
_t1.August /*String*/  = _august;
RDebugUtils.currentLine=37617675;
 //BA.debugLineNum = 37617675;BA.debugLine="t1.September = September";
_t1.September /*String*/  = _september;
RDebugUtils.currentLine=37617676;
 //BA.debugLineNum = 37617676;BA.debugLine="t1.October = October";
_t1.October /*String*/  = _october;
RDebugUtils.currentLine=37617677;
 //BA.debugLineNum = 37617677;BA.debugLine="t1.November = November";
_t1.November /*String*/  = _november;
RDebugUtils.currentLine=37617678;
 //BA.debugLineNum = 37617678;BA.debugLine="t1.December = December";
_t1.December /*String*/  = _december;
RDebugUtils.currentLine=37617679;
 //BA.debugLineNum = 37617679;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=37617680;
 //BA.debugLineNum = 37617680;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _createasdatepicker_weeknameproperties(b4a.example.ef.as_datepicker __ref,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,float _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "createasdatepicker_weeknameproperties", new Object[] {_color,_xfont,_textcolor,_height}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties _t1 = null;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Public Sub CreateASDatePicker_WeekNameProperties (";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Dim t1 As ASDatePicker_WeekNameProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties();
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _createasdatepicker_weeknameshort(b4a.example.ef.as_datepicker __ref,String _monday,String _tuesday,String _wednesday,String _thursday,String _friday,String _saturday,String _sunday) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "createasdatepicker_weeknameshort", new Object[] {_monday,_tuesday,_wednesday,_thursday,_friday,_saturday,_sunday}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _t1 = null;
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Public Sub CreateASDatePicker_WeekNameShort (Monda";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="Dim t1 As ASDatePicker_WeekNameShort";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknameshort();
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="t1.Monday = Monday";
_t1.Monday /*String*/  = _monday;
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="t1.Tuesday = Tuesday";
_t1.Tuesday /*String*/  = _tuesday;
RDebugUtils.currentLine=37683205;
 //BA.debugLineNum = 37683205;BA.debugLine="t1.Wednesday = Wednesday";
_t1.Wednesday /*String*/  = _wednesday;
RDebugUtils.currentLine=37683206;
 //BA.debugLineNum = 37683206;BA.debugLine="t1.Thursday = Thursday";
_t1.Thursday /*String*/  = _thursday;
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="t1.Friday = Friday";
_t1.Friday /*String*/  = _friday;
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="t1.Saturday = Saturday";
_t1.Saturday /*String*/  = _saturday;
RDebugUtils.currentLine=37683209;
 //BA.debugLineNum = 37683209;BA.debugLine="t1.Sunday = Sunday";
_t1.Sunday /*String*/  = _sunday;
RDebugUtils.currentLine=37683210;
 //BA.debugLineNum = 37683210;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=37683211;
 //BA.debugLineNum = 37683211;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _createasdatepicker_weeknumberproperties(b4a.example.ef.as_datepicker __ref,float _width,int _color,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createasdatepicker_weeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "createasdatepicker_weeknumberproperties", new Object[] {_width,_color,_xfont,_textcolor,_text}));}
b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _t1 = null;
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Public Sub CreateASDatePicker_WeekNumberProperties";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="Dim t1 As ASDatePicker_WeekNumberProperties";
_t1 = new b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties();
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="t1.Initialize";
_t1.Initialize();
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
RDebugUtils.currentLine=37748741;
 //BA.debugLineNum = 37748741;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
RDebugUtils.currentLine=37748743;
 //BA.debugLineNum = 37748743;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
RDebugUtils.currentLine=37748744;
 //BA.debugLineNum = 37748744;BA.debugLine="Return t1";
if (true) return _t1;
RDebugUtils.currentLine=37748745;
 //BA.debugLineNum = 37748745;BA.debugLine="End Sub";
return null;
}
public int  _monthbetween(b4a.example.ef.as_datepicker __ref,long _date1,long _date2) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "monthbetween", true))
	 {return ((Integer) Debug.delegate(ba, "monthbetween", new Object[] {_date1,_date2}));}
long _y = 0L;
long _m = 0L;
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub MonthBetween(Date1 As Long, Date2 As L";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="Dim y As Long = DateTime.GetYear(Date2) - DateTim";
_y = (long) (__c.DateTime.GetYear(_date2)-__c.DateTime.GetYear(_date1));
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="Dim m As Long = y * 12";
_m = (long) (_y*12);
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="m = m - DateTime.GetMonth(Date1)";
_m = (long) (_m-__c.DateTime.GetMonth(_date1));
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="m = m + DateTime.GetMonth(Date2)";
_m = (long) (_m+__c.DateTime.GetMonth(_date2));
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="Return m";
if (true) return (int) (_m);
RDebugUtils.currentLine=37486598;
 //BA.debugLineNum = 37486598;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Private Sub CreateHeader";
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="Dim xlbl_Header As B4XView = CreateLabel(\"xlbl_He";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_Header");
RDebugUtils.currentLine=31719429;
 //BA.debugLineNum = 31719429;BA.debugLine="xpnl_Header.AddView(xlbl_Header,xpnl_Header.Heigh";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_header.getObject()),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),(int) (0),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()*2),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31719431;
 //BA.debugLineNum = 31719431;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = CreateLabel(\"xlbl";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowLeft");
RDebugUtils.currentLine=31719432;
 //BA.debugLineNum = 31719432;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowLeft,0,0,xpnl_Heade";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowleft.getObject()),(int) (0),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31719434;
 //BA.debugLineNum = 31719434;BA.debugLine="Dim xlbl_ArrowRight As B4XView = CreateLabel(\"xlb";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._createlabel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"xlbl_HeaderArrowRight");
RDebugUtils.currentLine=31719435;
 //BA.debugLineNum = 31719435;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowRight,xpnl_Header.W";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_xlbl_arrowright.getObject()),(int) (__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()),(int) (0),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight(),__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31719437;
 //BA.debugLineNum = 31719437;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=31719438;
 //BA.debugLineNum = 31719438;BA.debugLine="xlbl_ArrowLeft.Text = Chr(0xE314)";
_xlbl_arrowleft.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe314))));
RDebugUtils.currentLine=31719439;
 //BA.debugLineNum = 31719439;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=31719440;
 //BA.debugLineNum = 31719440;BA.debugLine="xlbl_ArrowLeft.SetTextAlignment(\"CENTER\",\"CENTER\"";
_xlbl_arrowleft.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=31719441;
 //BA.debugLineNum = 31719441;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=31719443;
 //BA.debugLineNum = 31719443;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=31719444;
 //BA.debugLineNum = 31719444;BA.debugLine="xlbl_ArrowRight.Text = Chr(0xE315)";
_xlbl_arrowright.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe315))));
RDebugUtils.currentLine=31719445;
 //BA.debugLineNum = 31719445;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=31719446;
 //BA.debugLineNum = 31719446;BA.debugLine="xlbl_ArrowRight.SetTextAlignment(\"CENTER\",\"CENTER";
_xlbl_arrowright.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=31719447;
 //BA.debugLineNum = 31719447;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=31719449;
 //BA.debugLineNum = 31719449;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=31719450;
 //BA.debugLineNum = 31719450;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(m_Start";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,__ref._m_startdate /*long*/ )+" "+BA.NumberToString(__c.DateTime.GetYear(__ref._m_startdate /*long*/ ))));
RDebugUtils.currentLine=31719451;
 //BA.debugLineNum = 31719451;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=31719452;
 //BA.debugLineNum = 31719452;BA.debugLine="xlbl_Header.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_header.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=31719454;
 //BA.debugLineNum = 31719454;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(b4a.example.ef.as_datepicker __ref,String _eventname) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createimageview", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createimageview", new Object[] {_eventname}));}
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="iv.Initialize(EventName)";
_iv.Initialize(ba,_eventname);
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="End Sub";
return null;
}
public String  _createselecteddate(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_monthdate,boolean _firstdatepanel) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "createselecteddate", true))
	 {return ((String) Debug.delegate(ba, "createselecteddate", new Object[] {_xpnl_monthdate,_firstdatepanel}));}
anywheresoftware.b4a.objects.B4XViewWrapper _view = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_selected = null;
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub CreateSelectedDate(xpnl_MonthDate As B";
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="If FirstDatePanel Then";
if (_firstdatepanel) { 
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedDa";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate.P";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group3.Get(index3)));
RDebugUtils.currentLine=37027845;
 //BA.debugLineNum = 37027845;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=37027847;
 //BA.debugLineNum = 37027847;BA.debugLine="xpnl_SelectedDate.RemoveViewFromParent";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=37027849;
 //BA.debugLineNum = 37027849;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37027850;
 //BA.debugLineNum = 37027850;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=37027851;
 //BA.debugLineNum = 37027851;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=37027852;
 //BA.debugLineNum = 37027852;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=37027853;
 //BA.debugLineNum = 37027853;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
RDebugUtils.currentLine=37027854;
 //BA.debugLineNum = 37027854;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
 }else {
RDebugUtils.currentLine=37027856;
 //BA.debugLineNum = 37027856;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=37027857;
 //BA.debugLineNum = 37027857;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate2.";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().GetAllViewsRecursive();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group16.Get(index16)));
RDebugUtils.currentLine=37027858;
 //BA.debugLineNum = 37027858;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_view.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/ );};
 }
};
RDebugUtils.currentLine=37027860;
 //BA.debugLineNum = 37027860;BA.debugLine="xpnl_SelectedDate2.RemoveViewFromParent";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
RDebugUtils.currentLine=37027862;
 //BA.debugLineNum = 37027862;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=37027863;
 //BA.debugLineNum = 37027863;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
_xpnl_monthdate.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (_xpnl_monthdate.getWidth()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (_xpnl_monthdate.getHeight()/(double)2-__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ ));
RDebugUtils.currentLine=37027864;
 //BA.debugLineNum = 37027864;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),(int) (__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .CurrentAndSelectedDayHeight /*float*/ /(double)2));
RDebugUtils.currentLine=37027865;
 //BA.debugLineNum = 37027865;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=37027866;
 //BA.debugLineNum = 37027866;BA.debugLine="xpnl_SelectedDate2 = xpnl_selected";
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
RDebugUtils.currentLine=37027869;
 //BA.debugLineNum = 37027869;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Private Sub MonthDateClick(xpnl_MonthDate As B4XVi";
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="Dim CurrentDay As Long = xpnl_MonthDate.Tag";
_currentday = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime.";
if ((__ref._m_maxdate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_maxdate /*long*/ ))) || (__ref._m_mindate /*long*/ >0 && _dateutils._setdate(ba,__c.DateTime.GetYear(_currentday),__c.DateTime.GetMonth(_currentday),__c.DateTime.GetDayOfMonth(_currentday))<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),__c.DateTime.GetDayOfMonth(__ref._m_mindate /*long*/ )))) { 
if (true) return "";};
RDebugUtils.currentLine=36962309;
 //BA.debugLineNum = 36962309;BA.debugLine="Dim xlbl_Date As B4XView";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36962310;
 //BA.debugLineNum = 36962310;BA.debugLine="For Each View As B4XView In xpnl_MonthDate.GetAll";
_view = new anywheresoftware.b4a.objects.B4XViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group4 = _xpnl_monthdate.GetAllViewsRecursive();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_view = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(group4.Get(index4)));
RDebugUtils.currentLine=36962311;
 //BA.debugLineNum = 36962311;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
if (("xlbl_Date").equals(BA.ObjectToString(_view.getTag()))) { 
_xlbl_date = _view;};
 }
};
RDebugUtils.currentLine=36962314;
 //BA.debugLineNum = 36962314;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36962316;
 //BA.debugLineNum = 36962316;BA.debugLine="If m_SelectMode = \"Range\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=36962317;
 //BA.debugLineNum = 36962317;BA.debugLine="If m_SelectedDate = 0 Or xpnl_MonthDate.Tag <= m";
if (__ref._m_selecteddate /*long*/ ==0 || (double)(BA.ObjectToNumber(_xpnl_monthdate.getTag()))<=__ref._m_selecteddate /*long*/ ) { 
RDebugUtils.currentLine=36962318;
 //BA.debugLineNum = 36962318;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate,xpnl_Mont";
if (_dateutils._issameday(ba,__ref._m_selecteddate /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=36962319;
 //BA.debugLineNum = 36962319;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
__ref._m_selecteddate /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=36962320;
 //BA.debugLineNum = 36962320;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
RDebugUtils.currentLine=36962321;
 //BA.debugLineNum = 36962321;BA.debugLine="If m_SelectedDate > m_SelectedDate2 Then";
if (__ref._m_selecteddate /*long*/ >__ref._m_selecteddate2 /*long*/ ) { 
RDebugUtils.currentLine=36962322;
 //BA.debugLineNum = 36962322;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Select";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=36962323;
 //BA.debugLineNum = 36962323;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=36962326;
 //BA.debugLineNum = 36962326;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_Selected";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=36962327;
 //BA.debugLineNum = 36962327;BA.debugLine="m_SelectedDate = 0";
__ref._m_selecteddate /*long*/  = (long) (0);
 };
 }else {
RDebugUtils.currentLine=36962330;
 //BA.debugLineNum = 36962330;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate2,xpnl_Mon";
if (_dateutils._issameday(ba,__ref._m_selecteddate2 /*long*/ ,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()))==__c.False) { 
RDebugUtils.currentLine=36962331;
 //BA.debugLineNum = 36962331;BA.debugLine="m_SelectedDate2 = xpnl_MonthDate.Tag";
__ref._m_selecteddate2 /*long*/  = BA.ObjectToLongNumber(_xpnl_monthdate.getTag());
RDebugUtils.currentLine=36962332;
 //BA.debugLineNum = 36962332;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,False)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.False);
 }else {
RDebugUtils.currentLine=36962334;
 //BA.debugLineNum = 36962334;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Selecte";
if (__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate2 /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=36962335;
 //BA.debugLineNum = 36962335;BA.debugLine="m_SelectedDate2 = 0";
__ref._m_selecteddate2 /*long*/  = (long) (0);
 };
 };
RDebugUtils.currentLine=36962338;
 //BA.debugLineNum = 36962338;BA.debugLine="RefreshSelectedDate";
__ref._refreshselecteddate /*String*/ (null);
 }else {
RDebugUtils.currentLine=36962340;
 //BA.debugLineNum = 36962340;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
__ref._createselecteddate /*String*/ (null,_xpnl_monthdate,__c.True);
 };
RDebugUtils.currentLine=36962343;
 //BA.debugLineNum = 36962343;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedTe";
_xlbl_date.setTextColor(__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/ );
RDebugUtils.currentLine=36962345;
 //BA.debugLineNum = 36962345;BA.debugLine="If WithEvent = True Then";
if (_withevent==__c.True) { 
RDebugUtils.currentLine=36962346;
 //BA.debugLineNum = 36962346;BA.debugLine="If m_SelectMode = \"Range\" And m_SelectedDate > 0";
if ((__ref._m_selectmode /*String*/ ).equals("Range") && __ref._m_selecteddate /*long*/ >0 && __ref._m_selecteddate2 /*long*/ >0) { 
RDebugUtils.currentLine=36962347;
 //BA.debugLineNum = 36962347;BA.debugLine="SelectedDateRangeChanged";
__ref._selecteddaterangechanged /*String*/ (null);
 }else {
RDebugUtils.currentLine=36962349;
 //BA.debugLineNum = 36962349;BA.debugLine="SelectedDateChanged(xpnl_MonthDate.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_monthdate.getTag()));
 };
 };
RDebugUtils.currentLine=36962352;
 //BA.debugLineNum = 36962352;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_range(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_range", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_range", null));}
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Public Sub getSelectMode_Range As String";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="Return \"Range\"";
if (true) return "Range";
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="End Sub";
return "";
}
public String  _customdrawheader(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "customdrawheader", true))
	 {return ((String) Debug.delegate(ba, "customdrawheader", new Object[] {_date}));}
b4a.example.ef.as_datepicker._asdatepicker_customdrawheader _m_customdrawheader = null;
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Private Sub CustomDrawHeader(date As Long)";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(int) (2))) { 
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="Dim m_CustomDrawHeader As ASDatePicker_CustomDra";
_m_customdrawheader = new b4a.example.ef.as_datepicker._asdatepicker_customdrawheader();
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="m_CustomDrawHeader.Initialize";
_m_customdrawheader.Initialize();
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="m_CustomDrawHeader.BackgroundPanel = xpnl_Header";
_m_customdrawheader.BackgroundPanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=35979270;
 //BA.debugLineNum = 35979270;BA.debugLine="m_CustomDrawHeader.xlbl_Text = xpnl_Header.GetVi";
_m_customdrawheader.xlbl_Text /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=35979271;
 //BA.debugLineNum = 35979271;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowLeft = xpnl_Header.";
_m_customdrawheader.xlbl_ArrowLeft /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=35979272;
 //BA.debugLineNum = 35979272;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowRight = xpnl_Header";
_m_customdrawheader.xlbl_ArrowRight /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=35979274;
 //BA.debugLineNum = 35979274;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawHea";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_CustomDrawHeader",(Object)(_date),(Object)(_m_customdrawheader));
 };
RDebugUtils.currentLine=35979276;
 //BA.debugLineNum = 35979276;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.as_datepicker __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="Tag = mBase.Tag";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=31457284;
 //BA.debugLineNum = 31457284;BA.debugLine="IniProps(Props)";
__ref._iniprops /*String*/ (null,_props);
RDebugUtils.currentLine=31457285;
 //BA.debugLineNum = 31457285;BA.debugLine="m_StartDate = DateTime.Now";
__ref._m_startdate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=31457288;
 //BA.debugLineNum = 31457288;BA.debugLine="xpnl_LoadingPanel = xui.CreatePanel(\"\")";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31457289;
 //BA.debugLineNum = 31457289;BA.debugLine="xpnl_LoadingPanel.Visible = True";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=31457290;
 //BA.debugLineNum = 31457290;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=31457291;
 //BA.debugLineNum = 31457291;BA.debugLine="mBase.AddView(xpnl_LoadingPanel,0,0,mBase.Width,m";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31457293;
 //BA.debugLineNum = 31457293;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31457294;
 //BA.debugLineNum = 31457294;BA.debugLine="mBase.AddView(xpnl_Header,0,0,mBase.Width,g_Heade";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=31457296;
 //BA.debugLineNum = 31457296;BA.debugLine="xpnl_ViewPager = xui.CreatePanel(\"\")";
__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31457297;
 //BA.debugLineNum = 31457297;BA.debugLine="mBase.AddView(xpnl_ViewPager,0,g_HeaderProperties";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()-__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .Height /*float*/ ));
RDebugUtils.currentLine=31457299;
 //BA.debugLineNum = 31457299;BA.debugLine="ini_viewpager";
__ref._ini_viewpager /*String*/ (null);
RDebugUtils.currentLine=31457300;
 //BA.debugLineNum = 31457300;BA.debugLine="CreateHeader";
__ref._createheader /*String*/ (null);
RDebugUtils.currentLine=31457301;
 //BA.debugLineNum = 31457301;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=31457302;
 //BA.debugLineNum = 31457302;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=31457303;
 //BA.debugLineNum = 31457303;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 }else 
{RDebugUtils.currentLine=31457304;
 //BA.debugLineNum = 31457304;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=31457305;
 //BA.debugLineNum = 31457305;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=31457306;
 //BA.debugLineNum = 31457306;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 }}
;
RDebugUtils.currentLine=31457309;
 //BA.debugLineNum = 31457309;BA.debugLine="xiv_RefreshImage = CreateImageView(\"\")";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._createimageview /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,"");
RDebugUtils.currentLine=31457310;
 //BA.debugLineNum = 31457310;BA.debugLine="xiv_RefreshImage.Visible = False";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=31457311;
 //BA.debugLineNum = 31457311;BA.debugLine="mBase.AddView(xiv_RefreshImage,0,0,mBase.Width,mB";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31457314;
 //BA.debugLineNum = 31457314;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
__ref._base_resize /*void*/ (null,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31457317;
 //BA.debugLineNum = 31457317;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),__c.False);
RDebugUtils.currentLine=31457319;
 //BA.debugLineNum = 31457319;BA.debugLine="End Sub";
return "";
}
public String  _iniprops(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "iniprops", true))
	 {return ((String) Debug.delegate(ba, "iniprops", new Object[] {_props}));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Private Sub IniProps(Props As Map)";
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="m_HeaderColor = xui.PaintOrColorToColor(Props.Get";
__ref._m_headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="m_BodyColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._m_bodycolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("BodyColor")));
RDebugUtils.currentLine=31522822;
 //BA.debugLineNum = 31522822;BA.debugLine="m_CurrentDateColor = xui.PaintOrColorToColor(Prop";
__ref._m_currentdatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("CurrentDateColor")));
RDebugUtils.currentLine=31522823;
 //BA.debugLineNum = 31522823;BA.debugLine="m_SelectedDateColor = xui.PaintOrColorToColor(Pro";
__ref._m_selecteddatecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectedDateColor")));
RDebugUtils.currentLine=31522824;
 //BA.debugLineNum = 31522824;BA.debugLine="m_InactiveDaysVisible = Props.GetDefault(\"Inactiv";
__ref._m_inactivedaysvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("InactiveDaysVisible"),(Object)(__c.False)));
RDebugUtils.currentLine=31522825;
 //BA.debugLineNum = 31522825;BA.debugLine="m_MouseHoverFeedback = Props.GetDefault(\"MouseHov";
__ref._m_mousehoverfeedback /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MouseHoverFeedback"),(Object)(__c.True)));
RDebugUtils.currentLine=31522826;
 //BA.debugLineNum = 31522826;BA.debugLine="m_SelectMode = Props.GetDefault(\"SelectMode\",\"Dat";
__ref._m_selectmode /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("SelectMode"),(Object)("Date")));
RDebugUtils.currentLine=31522827;
 //BA.debugLineNum = 31522827;BA.debugLine="m_ShowWeekNumbers = Props.GetDefault(\"ShowWeekNum";
__ref._m_showweeknumbers /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowWeekNumbers"),(Object)(__c.False)));
RDebugUtils.currentLine=31522828;
 //BA.debugLineNum = 31522828;BA.debugLine="m_ShowGridLines = Props.GetDefault(\"ShowGridLines";
__ref._m_showgridlines /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("ShowGridLines"),(Object)(__c.False)));
RDebugUtils.currentLine=31522829;
 //BA.debugLineNum = 31522829;BA.debugLine="m_GridLineColor = xui.PaintOrColorToColor(Props.G";
__ref._m_gridlinecolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("GridLineColor"),(Object)(((int)0x50ffffff))));
RDebugUtils.currentLine=31522830;
 //BA.debugLineNum = 31522830;BA.debugLine="m_ThemeChangeTransition = Props.GetDefault(\"Theme";
__ref._m_themechangetransition /*String*/  = BA.ObjectToString(_props.GetDefault((Object)("ThemeChangeTransition"),(Object)("Fade")));
RDebugUtils.currentLine=31522832;
 //BA.debugLineNum = 31522832;BA.debugLine="If \"Friday\" = Props.Get(\"FirstDayOfWeek\") Then";
if (("Friday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=31522833;
 //BA.debugLineNum = 31522833;BA.debugLine="m_FirstDayOfWeek = 1";
__ref._m_firstdayofweek /*int*/  = (int) (1);
 }else 
{RDebugUtils.currentLine=31522834;
 //BA.debugLineNum = 31522834;BA.debugLine="else If \"Thursday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Thursday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=31522835;
 //BA.debugLineNum = 31522835;BA.debugLine="m_FirstDayOfWeek = 2";
__ref._m_firstdayofweek /*int*/  = (int) (2);
 }else 
{RDebugUtils.currentLine=31522836;
 //BA.debugLineNum = 31522836;BA.debugLine="else If \"Wednesday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Wednesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=31522837;
 //BA.debugLineNum = 31522837;BA.debugLine="m_FirstDayOfWeek = 3";
__ref._m_firstdayofweek /*int*/  = (int) (3);
 }else 
{RDebugUtils.currentLine=31522838;
 //BA.debugLineNum = 31522838;BA.debugLine="else If \"Tuesday\" = Props.Get(\"FirstDayOfWeek\") T";
if (("Tuesday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=31522839;
 //BA.debugLineNum = 31522839;BA.debugLine="m_FirstDayOfWeek = 4";
__ref._m_firstdayofweek /*int*/  = (int) (4);
 }else 
{RDebugUtils.currentLine=31522840;
 //BA.debugLineNum = 31522840;BA.debugLine="else If \"Monday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Monday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=31522841;
 //BA.debugLineNum = 31522841;BA.debugLine="m_FirstDayOfWeek = 5";
__ref._m_firstdayofweek /*int*/  = (int) (5);
 }else 
{RDebugUtils.currentLine=31522842;
 //BA.debugLineNum = 31522842;BA.debugLine="else If \"Sunday\" = Props.Get(\"FirstDayOfWeek\") Th";
if (("Sunday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=31522843;
 //BA.debugLineNum = 31522843;BA.debugLine="m_FirstDayOfWeek = 6";
__ref._m_firstdayofweek /*int*/  = (int) (6);
 }else 
{RDebugUtils.currentLine=31522844;
 //BA.debugLineNum = 31522844;BA.debugLine="else If \"Saturday\" = Props.Get(\"FirstDayOfWeek\")";
if (("Saturday").equals(BA.ObjectToString(_props.Get((Object)("FirstDayOfWeek"))))) { 
RDebugUtils.currentLine=31522845;
 //BA.debugLineNum = 31522845;BA.debugLine="m_FirstDayOfWeek = 7";
__ref._m_firstdayofweek /*int*/  = (int) (7);
 }}}}}}}
;
RDebugUtils.currentLine=31522848;
 //BA.debugLineNum = 31522848;BA.debugLine="g_WeekNumberProperties = CreateASDatePicker_WeekN";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = __ref._createasdatepicker_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ (null,(float) (__c.DipToCurrent((int) (20))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,"");
RDebugUtils.currentLine=31522849;
 //BA.debugLineNum = 31522849;BA.debugLine="g_HeaderProperties = CreateASDatePicker_HeaderPro";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = __ref._createasdatepicker_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ (null,(float) (__c.DipToCurrent((int) (40))),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (15),__c.True);
RDebugUtils.currentLine=31522850;
 //BA.debugLineNum = 31522850;BA.debugLine="g_BodyProperties = CreateASDatePicker_BodyPropert";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = __ref._createasdatepicker_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (12)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (30))));
RDebugUtils.currentLine=31522851;
 //BA.debugLineNum = 31522851;BA.debugLine="g_WeekNameProperties = CreateASDatePicker_WeekNam";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = __ref._createasdatepicker_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (10)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White,(float) (__c.DipToCurrent((int) (20))));
RDebugUtils.currentLine=31522853;
 //BA.debugLineNum = 31522853;BA.debugLine="g_MonthNameShort = CreateASDatePicker_MonthNameSh";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = __ref._createasdatepicker_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ (null,"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec");
RDebugUtils.currentLine=31522854;
 //BA.debugLineNum = 31522854;BA.debugLine="g_WeekNameShort = CreateASDatePicker_WeekNameShor";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = __ref._createasdatepicker_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ (null,"Mon","Tue","Wed","Thu","Fri","Sat","Sun");
RDebugUtils.currentLine=31522856;
 //BA.debugLineNum = 31522856;BA.debugLine="End Sub";
return "";
}
public String  _ini_viewpager(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "ini_viewpager", true))
	 {return ((String) Debug.delegate(ba, "ini_viewpager", null));}
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Private Sub ini_viewpager";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="tmpmap.Put(\"Orientation\",\"Horizontal\")";
_tmpmap.Put((Object)("Orientation"),(Object)("Horizontal"));
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="tmpmap.Put(\"Carousel\",False)";
_tmpmap.Put((Object)("Carousel"),(Object)(__c.False));
RDebugUtils.currentLine=31588360;
 //BA.debugLineNum = 31588360;BA.debugLine="tmpmap.Put(\"LazyLoading\",True)";
_tmpmap.Put((Object)("LazyLoading"),(Object)(__c.True));
RDebugUtils.currentLine=31588361;
 //BA.debugLineNum = 31588361;BA.debugLine="tmpmap.Put(\"LazyLoadingExtraSize\",3)";
_tmpmap.Put((Object)("LazyLoadingExtraSize"),(Object)(3));
RDebugUtils.currentLine=31588362;
 //BA.debugLineNum = 31588362;BA.debugLine="xASVP_Main.Initialize(Me,\"xASVP_Main\")";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._initialize /*String*/ (null,ba,this,"xASVP_Main");
RDebugUtils.currentLine=31588363;
 //BA.debugLineNum = 31588363;BA.debugLine="xASVP_Main.DesignerCreateView(xpnl_ViewPager,tmpl";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._designercreateview /*String*/ (null,(Object)(__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),_tmplbl,_tmpmap);
RDebugUtils.currentLine=31588364;
 //BA.debugLineNum = 31588364;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=31588365;
 //BA.debugLineNum = 31588365;BA.debugLine="End Sub";
return "";
}
public int  _getbodycolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodycolor", true))
	 {return ((Integer) Debug.delegate(ba, "getbodycolor", null));}
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Public Sub getBodyColor As Int";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="Return m_BodyColor";
if (true) return __ref._m_bodycolor /*int*/ ;
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="End Sub";
return 0;
}
public b4a.example.ef.as_datepicker._asdatepicker_bodyproperties  _getbodyproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getbodyproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_bodyproperties) Debug.delegate(ba, "getbodyproperties", null));}
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Public Sub getBodyProperties As ASDatePicker_BodyP";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="Return g_BodyProperties";
if (true) return __ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ ;
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentdatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentdatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentdatecolor", null));}
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Public Sub getCurrentDateColor As Int";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="Return m_CurrentDateColor";
if (true) return __ref._m_currentdatecolor /*int*/ ;
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="End Sub";
return 0;
}
public String  _getcurrentview(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getcurrentview", true))
	 {return ((String) Debug.delegate(ba, "getcurrentview", null));}
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub getCurrentView As String";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Return m_CurrentView";
if (true) return __ref._m_currentview /*String*/ ;
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="End Sub";
return "";
}
public int  _getgridlinecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getgridlinecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getgridlinecolor", null));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Public Sub getGridLineColor As Int";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="Return m_GridLineColor";
if (true) return __ref._m_gridlinecolor /*int*/ ;
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="End Sub";
return 0;
}
public int  _getheadercolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheadercolor", true))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="Return m_HeaderColor";
if (true) return __ref._m_headercolor /*int*/ ;
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getheaderpanel(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Public Sub getHeaderPanel As B4XView";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="Return xpnl_Header";
if (true) return __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_headerproperties  _getheaderproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getheaderproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_headerproperties) Debug.delegate(ba, "getheaderproperties", null));}
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Public Sub getHeaderProperties As ASDatePicker_Hea";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="Return g_HeaderProperties";
if (true) return __ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ ;
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="End Sub";
return null;
}
public long  _getmaxdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmaxdate", true))
	 {return ((Long) Debug.delegate(ba, "getmaxdate", null));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Public Sub getMaxDate As Long";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="Return m_MaxDate";
if (true) return __ref._m_maxdate /*long*/ ;
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="End Sub";
return 0L;
}
public long  _getmindate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmindate", true))
	 {return ((Long) Debug.delegate(ba, "getmindate", null));}
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub getMinDate As Long";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Return m_MinDate";
if (true) return __ref._m_mindate /*long*/ ;
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="End Sub";
return 0L;
}
public b4a.example.ef.as_datepicker._asdatepicker_monthnameshort  _getmonthnameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getmonthnameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_monthnameshort) Debug.delegate(ba, "getmonthnameshort", null));}
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub getMonthNameShort As ASDatePicker_Month";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="Return g_MonthNameShort";
if (true) return __ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/ ;
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="End Sub";
return null;
}
public long  _getselecteddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddate", true))
	 {return ((Long) Debug.delegate(ba, "getselecteddate", null));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Public Sub getSelectedDate As Long";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="End Sub";
return 0L;
}
public int  _getselecteddatecolor(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselecteddatecolor", true))
	 {return ((Integer) Debug.delegate(ba, "getselecteddatecolor", null));}
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Public Sub getSelectedDateColor As Int";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="Return m_SelectedDateColor";
if (true) return __ref._m_selecteddatecolor /*int*/ ;
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="End Sub";
return 0;
}
public long  _getselectedenddate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedenddate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedenddate", null));}
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Public Sub getSelectedEndDate As Long";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="Return m_SelectedDate2";
if (true) return __ref._m_selecteddate2 /*long*/ ;
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="End Sub";
return 0L;
}
public long  _getselectedstartdate(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectedstartdate", true))
	 {return ((Long) Debug.delegate(ba, "getselectedstartdate", null));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Public Sub getSelectedStartDate As Long";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="Return m_SelectedDate";
if (true) return __ref._m_selecteddate /*long*/ ;
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="End Sub";
return 0L;
}
public String  _getselectmode(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode", true))
	 {return ((String) Debug.delegate(ba, "getselectmode", null));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub getSelectMode As String";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Return m_SelectMode";
if (true) return __ref._m_selectmode /*String*/ ;
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_day(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_day", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_day", null));}
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub getSelectMode_Day As String";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Return \"Date\"";
if (true) return "Date";
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="End Sub";
return "";
}
public String  _getselectmode_month(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getselectmode_month", true))
	 {return ((String) Debug.delegate(ba, "getselectmode_month", null));}
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Public Sub getSelectMode_Month As String";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Return \"Month\"";
if (true) return "Month";
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowgridlines(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowgridlines", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowgridlines", null));}
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Public Sub getShowGridLines As Boolean";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="Return m_ShowGridLines";
if (true) return __ref._m_showgridlines /*boolean*/ ;
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowweeknumbers(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getshowweeknumbers", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowweeknumbers", null));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Public Sub getShowWeekNumbers As Boolean";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="Return m_ShowWeekNumbers";
if (true) return __ref._m_showweeknumbers /*boolean*/ ;
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="End Sub";
return false;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_dark(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_dark", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_dark", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Public Sub getTheme_Dark As AS_DatePicker_Theme";
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=31260676;
 //BA.debugLineNum = 31260676;BA.debugLine="Theme.BodyColor = 0xFF202125";
_theme.BodyColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=31260677;
 //BA.debugLineNum = 31260677;BA.debugLine="Theme.HeaderColor = 0xFF202125";
_theme.HeaderColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=31260678;
 //BA.debugLineNum = 31260678;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=31260679;
 //BA.debugLineNum = 31260679;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=31260680;
 //BA.debugLineNum = 31260680;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,255,255,2";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (255),(int) (255),(int) (255));
RDebugUtils.currentLine=31260681;
 //BA.debugLineNum = 31260681;BA.debugLine="Theme.BodyTextColor = xui.Color_White";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31260682;
 //BA.debugLineNum = 31260682;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31260683;
 //BA.debugLineNum = 31260683;BA.debugLine="Theme.HeaderTextColor = xui.Color_White";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31260684;
 //BA.debugLineNum = 31260684;BA.debugLine="Theme.WeekNameColor =  0xFF202125'xui.Color_ARGB(";
_theme.WeekNameColor /*int*/  = ((int)0xff202125);
RDebugUtils.currentLine=31260685;
 //BA.debugLineNum = 31260685;BA.debugLine="Theme.WeekNameTextColor = xui.Color_White";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31260686;
 //BA.debugLineNum = 31260686;BA.debugLine="Theme.WeekNumberColor = xui.Color_ARGB(255,32, 33";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37));
RDebugUtils.currentLine=31260687;
 //BA.debugLineNum = 31260687;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_White";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31260689;
 //BA.debugLineNum = 31260689;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=31260691;
 //BA.debugLineNum = 31260691;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._as_datepicker_theme  _gettheme_light(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "gettheme_light", true))
	 {return ((b4a.example.ef.as_datepicker._as_datepicker_theme) Debug.delegate(ba, "gettheme_light", null));}
b4a.example.ef.as_datepicker._as_datepicker_theme _theme = null;
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Public Sub getTheme_Light As AS_DatePicker_Theme";
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
_theme = new b4a.example.ef.as_datepicker._as_datepicker_theme();
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="Theme.Initialize";
_theme.Initialize();
RDebugUtils.currentLine=31326212;
 //BA.debugLineNum = 31326212;BA.debugLine="Theme.BodyColor = xui.Color_White";
_theme.BodyColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31326213;
 //BA.debugLineNum = 31326213;BA.debugLine="Theme.HeaderColor = xui.Color_White";
_theme.HeaderColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31326214;
 //BA.debugLineNum = 31326214;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
_theme.CurrentDateColor /*int*/  = ((int)0x502d8879);
RDebugUtils.currentLine=31326215;
 //BA.debugLineNum = 31326215;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
_theme.SelectedDateColor /*int*/  = ((int)0xff2d8879);
RDebugUtils.currentLine=31326216;
 //BA.debugLineNum = 31326216;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,0,0,0)";
_theme.GridLineColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_ARGB((int) (80),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=31326217;
 //BA.debugLineNum = 31326217;BA.debugLine="Theme.BodyTextColor = xui.Color_Black";
_theme.BodyTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=31326218;
 //BA.debugLineNum = 31326218;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
_theme.SelectedTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31326219;
 //BA.debugLineNum = 31326219;BA.debugLine="Theme.HeaderTextColor = xui.Color_Black";
_theme.HeaderTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=31326220;
 //BA.debugLineNum = 31326220;BA.debugLine="Theme.WeekNameColor = xui.Color_White'xui.Color_A";
_theme.WeekNameColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31326221;
 //BA.debugLineNum = 31326221;BA.debugLine="Theme.WeekNameTextColor = xui.Color_Black";
_theme.WeekNameTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=31326222;
 //BA.debugLineNum = 31326222;BA.debugLine="Theme.WeekNumberColor = xui.Color_White";
_theme.WeekNumberColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=31326223;
 //BA.debugLineNum = 31326223;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_Black";
_theme.WeekNumberTextColor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=31326225;
 //BA.debugLineNum = 31326225;BA.debugLine="Return Theme";
if (true) return _theme;
RDebugUtils.currentLine=31326227;
 //BA.debugLineNum = 31326227;BA.debugLine="End Sub";
return null;
}
public String  _getweeknamebyindex(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknamebyindex", true))
	 {return ((String) Debug.delegate(ba, "getweeknamebyindex", new Object[] {_index}));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Public Sub GetWeekNameByIndex(Index As Int) As Str";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="If Index = 1 Then";
if (_index==1) { 
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="Return g_WeekNameShort.Sunday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Sunday /*String*/ ;
 }else 
{RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="else If Index = 2 Then";
if (_index==2) { 
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="Return g_WeekNameShort.Monday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Monday /*String*/ ;
 }else 
{RDebugUtils.currentLine=37224453;
 //BA.debugLineNum = 37224453;BA.debugLine="else If Index = 3 Then";
if (_index==3) { 
RDebugUtils.currentLine=37224454;
 //BA.debugLineNum = 37224454;BA.debugLine="Return g_WeekNameShort.Tuesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Tuesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=37224455;
 //BA.debugLineNum = 37224455;BA.debugLine="else If Index = 4 Then";
if (_index==4) { 
RDebugUtils.currentLine=37224456;
 //BA.debugLineNum = 37224456;BA.debugLine="Return g_WeekNameShort.Wednesday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Wednesday /*String*/ ;
 }else 
{RDebugUtils.currentLine=37224457;
 //BA.debugLineNum = 37224457;BA.debugLine="else If Index = 5 Then";
if (_index==5) { 
RDebugUtils.currentLine=37224458;
 //BA.debugLineNum = 37224458;BA.debugLine="Return g_WeekNameShort.Thursday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Thursday /*String*/ ;
 }else 
{RDebugUtils.currentLine=37224459;
 //BA.debugLineNum = 37224459;BA.debugLine="else If Index = 6 Then";
if (_index==6) { 
RDebugUtils.currentLine=37224460;
 //BA.debugLineNum = 37224460;BA.debugLine="Return g_WeekNameShort.Friday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Friday /*String*/ ;
 }else {
RDebugUtils.currentLine=37224462;
 //BA.debugLineNum = 37224462;BA.debugLine="Return g_WeekNameShort.Saturday";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ .Saturday /*String*/ ;
 }}}}}}
;
RDebugUtils.currentLine=37224464;
 //BA.debugLineNum = 37224464;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties  _getweeknameproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties) Debug.delegate(ba, "getweeknameproperties", null));}
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Public Sub getWeekNameProperties As ASDatePicker_W";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="Return g_WeekNameProperties";
if (true) return __ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ ;
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknameshort  _getweeknameshort(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknameshort", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknameshort) Debug.delegate(ba, "getweeknameshort", null));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub getWeekNameShort As ASDatePicker_WeekNa";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Return g_WeekNameShort";
if (true) return __ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/ ;
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties  _getweeknumberproperties(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "getweeknumberproperties", true))
	 {return ((b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties) Debug.delegate(ba, "getweeknumberproperties", null));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub getWeekNumberProperties As ASDatePicker";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="Return g_WeekNumberProperties";
if (true) return __ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ ;
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub RefreshSelectedDate";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
_clr = __ref._getargb /*int[]*/ (null,__ref._m_selecteddatecolor /*int*/ );
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=32440324;
 //BA.debugLineNum = 32440324;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=32440325;
 //BA.debugLineNum = 32440325;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="Dim counter As Int = xASVP_Main.GetPanel(i).Nu";
_counter = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews();
RDebugUtils.currentLine=32440328;
 //BA.debugLineNum = 32440328;BA.debugLine="For z = 0 To counter -1";
{
final int step6 = 1;
final int limit6 = (int) (_counter-1);
_z = (int) (0) ;
for (;_z <= limit6 ;_z = _z + step6 ) {
RDebugUtils.currentLine=32440329;
 //BA.debugLineNum = 32440329;BA.debugLine="Dim xpnl_Day As B4XView = xASVP_Main.GetPanel";
_xpnl_day = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_day = __ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).GetView(_z);
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="If xpnl_Day.tag Is Long And xpnl_Day.NumberOf";
if (_xpnl_day.getTag() instanceof Long && _xpnl_day.getNumberOfViews()>0) { 
RDebugUtils.currentLine=32440331;
 //BA.debugLineNum = 32440331;BA.debugLine="CreateSelectDates(xpnl_Day,clr)";
__ref._createselectdates /*String*/ (null,_xpnl_day,_clr);
 };
 }
};
 };
 };
 }
};
RDebugUtils.currentLine=32440338;
 //BA.debugLineNum = 32440338;BA.debugLine="End Sub";
return "";
}
public String  _selecteddaterangechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddaterangechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddaterangechanged", null));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Private Sub SelectedDateRangeChanged";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(int) (2))) { 
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SelectedDateR";
__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateRangeChanged",(Object)(__ref._m_selecteddate /*long*/ ),(Object)(__ref._m_selecteddate2 /*long*/ ));
 };
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="End Sub";
return "";
}
public String  _selecteddatechanged(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "selecteddatechanged", true))
	 {return ((String) Debug.delegate(ba, "selecteddatechanged", new Object[] {_date}));}
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Private Sub SelectedDateChanged(date As Long)";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(int) (1))) { 
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedDateC";
__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_SelectedDateChanged",(Object)(_date));
 };
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="End Sub";
return "";
}
public String  _pagechanged(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "pagechanged", true))
	 {return ((String) Debug.delegate(ba, "pagechanged", null));}
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Private Sub PageChanged";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged",(int) (0))) { 
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="CallSub(mCallBack, mEventName & \"_PageChanged\")";
__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_PageChanged");
 };
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="Do While m_isReady = False";
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
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="Sleep(0)";
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
RDebugUtils.currentLine=32636933;
 //BA.debugLineNum = 32636933;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 12;
return;
case 12:
//C
this.state = 5;
;
RDebugUtils.currentLine=32636934;
 //BA.debugLineNum = 32636934;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=32636935;
 //BA.debugLineNum = 32636935;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "rebuild"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
RDebugUtils.currentLine=32636936;
 //BA.debugLineNum = 32636936;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
if (true) break;

case 5:
//if
this.state = 10;
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
this.state = 7;
}else 
{RDebugUtils.currentLine=32636939;
 //BA.debugLineNum = 32636939;BA.debugLine="else if m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
this.state = 9;
}}
if (true) break;

case 7:
//C
this.state = 10;
RDebugUtils.currentLine=32636937;
 //BA.debugLineNum = 32636937;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_monthview /*String*/ (null);
RDebugUtils.currentLine=32636938;
 //BA.debugLineNum = 32636938;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=32636940;
 //BA.debugLineNum = 32636940;BA.debugLine="m_CurrentView = getCurrentView_YearView";
__ref._m_currentview /*String*/  = __ref._getcurrentview_yearview /*String*/ (null);
RDebugUtils.currentLine=32636941;
 //BA.debugLineNum = 32636941;BA.debugLine="CreateYearView";
__ref._createyearview /*void*/ (null);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=32636943;
 //BA.debugLineNum = 32636943;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
if (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).getNumberOfViews()>0) { 
RDebugUtils.currentLine=32374787;
 //BA.debugLineNum = 32374787;BA.debugLine="xASVP_Main.GetPanel(i).RemoveAllViews";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i).RemoveAllViews();
RDebugUtils.currentLine=32374788;
 //BA.debugLineNum = 32374788;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=32374789;
 //BA.debugLineNum = 32374789;BA.debugLine="AddMonth(xASVP_Main.GetPanel(i),xASVP_Main.Get";
__ref._addmonth /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }else 
{RDebugUtils.currentLine=32374790;
 //BA.debugLineNum = 32374790;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=32374791;
 //BA.debugLineNum = 32374791;BA.debugLine="AddYear(xASVP_Main.GetPanel(i),xASVP_Main.GetV";
__ref._addyear /*String*/ (null,__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_i),BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i)));
 }}
;
 };
 }
};
RDebugUtils.currentLine=32374795;
 //BA.debugLineNum = 32374795;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub RefreshHeader";
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=32571396;
 //BA.debugLineNum = 32571396;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = xpnl_Header.GetVi";
_xlbl_arrowleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowleft = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (1));
RDebugUtils.currentLine=32571398;
 //BA.debugLineNum = 32571398;BA.debugLine="Dim xlbl_ArrowRight As B4XView = xpnl_Header.GetV";
_xlbl_arrowright = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_arrowright = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (2));
RDebugUtils.currentLine=32571400;
 //BA.debugLineNum = 32571400;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
_xlbl_arrowleft.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=32571401;
 //BA.debugLineNum = 32571401;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
_xlbl_arrowleft.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32571402;
 //BA.debugLineNum = 32571402;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
_xlbl_arrowleft.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=32571404;
 //BA.debugLineNum = 32571404;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
_xlbl_arrowright.setFont(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateMaterialIcons(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ButtonIconSize /*float*/ ));
RDebugUtils.currentLine=32571405;
 //BA.debugLineNum = 32571405;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
_xlbl_arrowright.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32571406;
 //BA.debugLineNum = 32571406;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
_xlbl_arrowright.setVisible(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .ArrowsVisible /*boolean*/ );
RDebugUtils.currentLine=32571408;
 //BA.debugLineNum = 32571408;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
_xlbl_header.setFont(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
RDebugUtils.currentLine=32571409;
 //BA.debugLineNum = 32571409;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
_xlbl_header.setTextColor(__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/ );
RDebugUtils.currentLine=32571411;
 //BA.debugLineNum = 32571411;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Public Sub Scroll2Date(Date As Long)";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Dim ScrollIndex As Int = -1";
_scrollindex = (int) (-1);
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=34275331;
 //BA.debugLineNum = 34275331;BA.debugLine="Dim StartDate As Long = xASVP_Main.GetValue(i)";
_startdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_i));
RDebugUtils.currentLine=34275333;
 //BA.debugLineNum = 34275333;BA.debugLine="If DateTime.GetYear(StartDate) = DateTime.GetYea";
if (__c.DateTime.GetYear(_startdate)==__c.DateTime.GetYear(_date) && __c.DateTime.GetMonth(_startdate)==__c.DateTime.GetMonth(_date)) { 
RDebugUtils.currentLine=34275334;
 //BA.debugLineNum = 34275334;BA.debugLine="ScrollIndex = i";
_scrollindex = _i;
 };
 }
};
RDebugUtils.currentLine=34275338;
 //BA.debugLineNum = 34275338;BA.debugLine="If ScrollIndex <> -1 Then";
if (_scrollindex!=-1) { 
RDebugUtils.currentLine=34275339;
 //BA.debugLineNum = 34275339;BA.debugLine="xASVP_Main.CurrentIndex = ScrollIndex";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setcurrentindex /*int*/ (null,_scrollindex);
 }else {
RDebugUtils.currentLine=34275341;
 //BA.debugLineNum = 34275341;BA.debugLine="m_StartDate = Date";
__ref._m_startdate /*long*/  = _date;
RDebugUtils.currentLine=34275342;
 //BA.debugLineNum = 34275342;BA.debugLine="xASVP_Main.Clear";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=34275343;
 //BA.debugLineNum = 34275343;BA.debugLine="CreateMonthView";
__ref._createmonthview /*void*/ (null);
 };
RDebugUtils.currentLine=34275345;
 //BA.debugLineNum = 34275345;BA.debugLine="End Sub";
return "";
}
public String  _setbodycolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodycolor", true))
	 {return ((String) Debug.delegate(ba, "setbodycolor", new Object[] {_color}));}
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Public Sub setBodyColor(Color As Int)";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="m_BodyColor = Color";
__ref._m_bodycolor /*int*/  = _color;
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=33882116;
 //BA.debugLineNum = 33882116;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=33882117;
 //BA.debugLineNum = 33882117;BA.debugLine="End Sub";
return "";
}
public String  _setbodyproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_bodyproperties _bodyproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setbodyproperties", true))
	 {return ((String) Debug.delegate(ba, "setbodyproperties", new Object[] {_bodyproperties}));}
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Public Sub setBodyProperties(BodyProperties As ASD";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="g_BodyProperties = BodyProperties";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/  = _bodyproperties;
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentdatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setcurrentdatecolor", true))
	 {return ((String) Debug.delegate(ba, "setcurrentdatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Public Sub setCurrentDateColor(Color As Int)";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="m_CurrentDateColor = Color";
__ref._m_currentdatecolor /*int*/  = _color;
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="End Sub";
return "";
}
public String  _setfirstdayofweek(b4a.example.ef.as_datepicker __ref,int _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setfirstdayofweek", true))
	 {return ((String) Debug.delegate(ba, "setfirstdayofweek", new Object[] {_number}));}
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Public Sub setFirstDayOfWeek(number As Int)";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="m_FirstDayOfWeek = number";
__ref._m_firstdayofweek /*int*/  = _number;
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="End Sub";
return "";
}
public String  _setgridlinecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setgridlinecolor", true))
	 {return ((String) Debug.delegate(ba, "setgridlinecolor", new Object[] {_color}));}
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Public Sub setGridLineColor(Color As Int)";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="m_GridLineColor = Color";
__ref._m_gridlinecolor /*int*/  = _color;
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheadercolor", true))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="m_HeaderColor = Color";
__ref._m_headercolor /*int*/  = _color;
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
__ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_headercolor /*int*/ );
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="End Sub";
return "";
}
public String  _setheaderproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_headerproperties _headerproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setheaderproperties", true))
	 {return ((String) Debug.delegate(ba, "setheaderproperties", new Object[] {_headerproperties}));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Public Sub setHeaderProperties(HeaderProperties As";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="g_HeaderProperties = HeaderProperties";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/  = _headerproperties;
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="End Sub";
return "";
}
public String  _setmaxdate(b4a.example.ef.as_datepicker __ref,long _maxdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmaxdate", true))
	 {return ((String) Debug.delegate(ba, "setmaxdate", new Object[] {_maxdate}));}
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Public Sub setMaxDate(MaxDate As Long)";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="m_MaxDate = MaxDate";
__ref._m_maxdate /*long*/  = _maxdate;
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="End Sub";
return "";
}
public String  _setmindate(b4a.example.ef.as_datepicker __ref,long _mindate) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmindate", true))
	 {return ((String) Debug.delegate(ba, "setmindate", new Object[] {_mindate}));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub setMinDate(MinDate As Long)";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="m_MinDate = MinDate";
__ref._m_mindate /*long*/  = _mindate;
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="End Sub";
return "";
}
public String  _setmonthnameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_monthnameshort _monthnameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setmonthnameshort", true))
	 {return ((String) Debug.delegate(ba, "setmonthnameshort", new Object[] {_monthnameshort}));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Public Sub setMonthNameShort(MonthNameShort As ASD";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="g_MonthNameShort = MonthNameShort";
__ref._g_monthnameshort /*b4a.example.ef.as_datepicker._asdatepicker_monthnameshort*/  = _monthnameshort;
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddate", true))
	 {return ((String) Debug.delegate(ba, "setselecteddate", new Object[] {_date}));}
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Public Sub setSelectedDate(Date As Long)";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="End Sub";
return "";
}
public String  _setselecteddatecolor(b4a.example.ef.as_datepicker __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselecteddatecolor", true))
	 {return ((String) Debug.delegate(ba, "setselecteddatecolor", new Object[] {_color}));}
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Public Sub setSelectedDateColor(Color As Int)";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="m_SelectedDateColor = Color";
__ref._m_selecteddatecolor /*int*/  = _color;
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="End Sub";
return "";
}
public String  _setselectedenddate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedenddate", true))
	 {return ((String) Debug.delegate(ba, "setselectedenddate", new Object[] {_date}));}
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Public Sub setSelectedEndDate(Date As Long)";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="m_SelectedDate2 = Date";
__ref._m_selecteddate2 /*long*/  = _date;
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="End Sub";
return "";
}
public String  _setselectedstartdate(b4a.example.ef.as_datepicker __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectedstartdate", true))
	 {return ((String) Debug.delegate(ba, "setselectedstartdate", new Object[] {_date}));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Public Sub setSelectedStartDate(Date As Long)";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="m_SelectedDate = Date";
__ref._m_selecteddate /*long*/  = _date;
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="End Sub";
return "";
}
public String  _setselectmode(b4a.example.ef.as_datepicker __ref,String _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setselectmode", true))
	 {return ((String) Debug.delegate(ba, "setselectmode", new Object[] {_mode}));}
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub setSelectMode(Mode As String)";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="m_SelectMode = Mode";
__ref._m_selectmode /*String*/  = _mode;
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="End Sub";
return "";
}
public String  _setshowgridlines(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowgridlines", true))
	 {return ((String) Debug.delegate(ba, "setshowgridlines", new Object[] {_show}));}
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Public Sub setShowGridLines(Show As Boolean)";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="m_ShowGridLines = Show";
__ref._m_showgridlines /*boolean*/  = _show;
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="End Sub";
return "";
}
public String  _setshowweeknumbers(b4a.example.ef.as_datepicker __ref,boolean _show) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setshowweeknumbers", true))
	 {return ((String) Debug.delegate(ba, "setshowweeknumbers", new Object[] {_show}));}
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Public Sub setShowWeekNumbers(Show As Boolean)";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="m_ShowWeekNumbers = Show";
__ref._m_showweeknumbers /*boolean*/  = _show;
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="xiv_RefreshImage.SetBitmap(mBase.Snapshot)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetBitmap((android.graphics.Bitmap)(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .Snapshot().getObject()));
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,True)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.True);
RDebugUtils.currentLine=31195141;
 //BA.debugLineNum = 31195141;BA.debugLine="m_BodyColor = Theme.BodyColor";
__ref._m_bodycolor /*int*/  = _theme.BodyColor /*int*/ ;
RDebugUtils.currentLine=31195142;
 //BA.debugLineNum = 31195142;BA.debugLine="m_HeaderColor = Theme.HeaderColor";
__ref._m_headercolor /*int*/  = _theme.HeaderColor /*int*/ ;
RDebugUtils.currentLine=31195143;
 //BA.debugLineNum = 31195143;BA.debugLine="m_CurrentDateColor = Theme.CurrentDateColor";
__ref._m_currentdatecolor /*int*/  = _theme.CurrentDateColor /*int*/ ;
RDebugUtils.currentLine=31195144;
 //BA.debugLineNum = 31195144;BA.debugLine="m_SelectedDateColor = Theme.SelectedDateColor";
__ref._m_selecteddatecolor /*int*/  = _theme.SelectedDateColor /*int*/ ;
RDebugUtils.currentLine=31195145;
 //BA.debugLineNum = 31195145;BA.debugLine="m_GridLineColor = Theme.GridLineColor";
__ref._m_gridlinecolor /*int*/  = _theme.GridLineColor /*int*/ ;
RDebugUtils.currentLine=31195146;
 //BA.debugLineNum = 31195146;BA.debugLine="g_BodyProperties.TextColor = Theme.BodyTextColor";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .TextColor /*int*/  = _theme.BodyTextColor /*int*/ ;
RDebugUtils.currentLine=31195147;
 //BA.debugLineNum = 31195147;BA.debugLine="g_HeaderProperties.TextColor = Theme.HeaderTextCo";
__ref._g_headerproperties /*b4a.example.ef.as_datepicker._asdatepicker_headerproperties*/ .TextColor /*int*/  = _theme.HeaderTextColor /*int*/ ;
RDebugUtils.currentLine=31195148;
 //BA.debugLineNum = 31195148;BA.debugLine="g_WeekNameProperties.Color = Theme.WeekNameColor";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .Color /*int*/  = _theme.WeekNameColor /*int*/ ;
RDebugUtils.currentLine=31195149;
 //BA.debugLineNum = 31195149;BA.debugLine="g_WeekNameProperties.TextColor = Theme.WeekNameTe";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/ .TextColor /*int*/  = _theme.WeekNameTextColor /*int*/ ;
RDebugUtils.currentLine=31195150;
 //BA.debugLineNum = 31195150;BA.debugLine="g_WeekNumberProperties.Color = Theme.WeekNumberCo";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .Color /*int*/  = _theme.WeekNumberColor /*int*/ ;
RDebugUtils.currentLine=31195151;
 //BA.debugLineNum = 31195151;BA.debugLine="g_WeekNumberProperties.TextColor = Theme.WeekNumb";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/ .TextColor /*int*/  = _theme.WeekNumberTextColor /*int*/ ;
RDebugUtils.currentLine=31195152;
 //BA.debugLineNum = 31195152;BA.debugLine="g_BodyProperties.SelectedTextColor = Theme.Select";
__ref._g_bodyproperties /*b4a.example.ef.as_datepicker._asdatepicker_bodyproperties*/ .SelectedTextColor /*int*/  = _theme.SelectedTextColor /*int*/ ;
RDebugUtils.currentLine=31195154;
 //BA.debugLineNum = 31195154;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
RDebugUtils.currentLine=31195156;
 //BA.debugLineNum = 31195156;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
__ref._xpnl_loadingpanel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=31195157;
 //BA.debugLineNum = 31195157;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._setloadingpanelcolor /*int*/ (null,__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=31195158;
 //BA.debugLineNum = 31195158;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).setColor(__ref._m_bodycolor /*int*/ );
RDebugUtils.currentLine=31195160;
 //BA.debugLineNum = 31195160;BA.debugLine="RefreshHeader";
__ref._refreshheader /*String*/ (null);
RDebugUtils.currentLine=31195161;
 //BA.debugLineNum = 31195161;BA.debugLine="Refresh";
__ref._refresh /*String*/ (null);
RDebugUtils.currentLine=31195163;
 //BA.debugLineNum = 31195163;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "as_datepicker", "settheme"),(int) (250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
RDebugUtils.currentLine=31195165;
 //BA.debugLineNum = 31195165;BA.debugLine="Select m_ThemeChangeTransition";
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
RDebugUtils.currentLine=31195167;
 //BA.debugLineNum = 31195167;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (0),parent.__c.False);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=31195169;
 //BA.debugLineNum = 31195169;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(250,False)";
__ref._xiv_refreshimage /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetVisibleAnimated((int) (250),parent.__c.False);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=31195172;
 //BA.debugLineNum = 31195172;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Public Sub setWeekNameProperties(WeekNamePropertie";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="g_WeekNameProperties = WeekNameProperties";
__ref._g_weeknameproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties*/  = _weeknameproperties;
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="End Sub";
return "";
}
public String  _setweeknameshort(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknameshort _weeknameshort) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknameshort", true))
	 {return ((String) Debug.delegate(ba, "setweeknameshort", new Object[] {_weeknameshort}));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Public Sub setWeekNameShort(WeekNameShort As ASDat";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="g_WeekNameShort = WeekNameShort";
__ref._g_weeknameshort /*b4a.example.ef.as_datepicker._asdatepicker_weeknameshort*/  = _weeknameshort;
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return "";
}
public String  _setweeknumberproperties(b4a.example.ef.as_datepicker __ref,b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties _weeknumberproperties) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "setweeknumberproperties", true))
	 {return ((String) Debug.delegate(ba, "setweeknumberproperties", new Object[] {_weeknumberproperties}));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub setWeekNumberProperties(WeekNumberPrope";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="g_WeekNumberProperties = WeekNumberProperties";
__ref._g_weeknumberproperties /*b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties*/  = _weeknumberproperties;
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_lazyloadingaddcontent(b4a.example.ef.as_datepicker __ref,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_lazyloadingaddcontent", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_lazyloadingaddcontent", new Object[] {_parent,_value}));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Private Sub xASVP_Main_LazyLoadingAddContent(Paren";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="AddMonth(Parent,Value)";
__ref._addmonth /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }else 
{RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView O";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null)) || (__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="AddYear(Parent,Value)";
__ref._addyear /*String*/ (null,_parent,BA.ObjectToLongNumber(_value));
 }}
;
RDebugUtils.currentLine=36372486;
 //BA.debugLineNum = 36372486;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechange(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechange", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechange", new Object[] {_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_header = null;
long _currentdate = 0L;
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Private Sub xASVP_Main_PageChange(Index As Int)";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
_xlbl_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_header = __ref._xpnl_header /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetView((int) (0));
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="Dim CurrentDate As Long = xASVP_Main.GetValue(Ind";
_currentdate = BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,_index));
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(Current";
_xlbl_header.setText(BA.ObjectToCharSequence(_dateutils._getmonthname(ba,_currentdate)+" "+BA.NumberToString(__c.DateTime.GetYear(_currentdate))));
 }else 
{RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="else if m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(__c.DateTime.GetYear(_currentdate)));
 }else 
{RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString((__c.DateTime.GetYear(_currentdate)+11))));
 }else 
{RDebugUtils.currentLine=36438025;
 //BA.debugLineNum = 36438025;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_centuryview /*String*/ (null))) { 
RDebugUtils.currentLine=36438026;
 //BA.debugLineNum = 36438026;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
_xlbl_header.setText(BA.ObjectToCharSequence(BA.NumberToString(__c.DateTime.GetYear(_currentdate))+" - "+BA.NumberToString(((__c.DateTime.GetYear(_currentdate)+10*12)-1))));
 }}}}
;
RDebugUtils.currentLine=36438028;
 //BA.debugLineNum = 36438028;BA.debugLine="CustomDrawHeader(CurrentDate)";
__ref._customdrawheader /*String*/ (null,_currentdate);
RDebugUtils.currentLine=36438029;
 //BA.debugLineNum = 36438029;BA.debugLine="End Sub";
return "";
}
public String  _xasvp_main_pagechanged(b4a.example.ef.as_datepicker __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xasvp_main_pagechanged", true))
	 {return ((String) Debug.delegate(ba, "xasvp_main_pagechanged", new Object[] {_index}));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Private Sub xASVP_Main_PageChanged(Index As Int)";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="PageChanged";
__ref._pagechanged /*String*/ (null);
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Private Sub xASVP_Main_PageChanged2(NewIndex As In";
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="If m_MinDate > 0 And m_MaxDate > 0 Then Return";
if (__ref._m_mindate /*long*/ >0 && __ref._m_maxdate /*long*/ >0) { 
if (true) return "";};
RDebugUtils.currentLine=31850500;
 //BA.debugLineNum = 31850500;BA.debugLine="Dim Forward As Boolean = False";
_forward = __c.False;
RDebugUtils.currentLine=31850501;
 //BA.debugLineNum = 31850501;BA.debugLine="Dim DoIt As Boolean = False";
_doit = __c.False;
RDebugUtils.currentLine=31850503;
 //BA.debugLineNum = 31850503;BA.debugLine="If NewIndex <= OldIndex Then";
if (_newindex<=_oldindex) { 
RDebugUtils.currentLine=31850504;
 //BA.debugLineNum = 31850504;BA.debugLine="If NewIndex <= 2 Then";
if (_newindex<=2) { 
RDebugUtils.currentLine=31850505;
 //BA.debugLineNum = 31850505;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=31850506;
 //BA.debugLineNum = 31850506;BA.debugLine="Forward = False";
_forward = __c.False;
 };
 }else {
RDebugUtils.currentLine=31850509;
 //BA.debugLineNum = 31850509;BA.debugLine="If NewIndex = xASVP_Main.Size -2 Then";
if (_newindex==__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-2) { 
RDebugUtils.currentLine=31850510;
 //BA.debugLineNum = 31850510;BA.debugLine="DoIt = True";
_doit = __c.True;
RDebugUtils.currentLine=31850511;
 //BA.debugLineNum = 31850511;BA.debugLine="Forward = True";
_forward = __c.True;
 };
 };
RDebugUtils.currentLine=31850515;
 //BA.debugLineNum = 31850515;BA.debugLine="If DoIt Then";
if (_doit) { 
RDebugUtils.currentLine=31850517;
 //BA.debugLineNum = 31850517;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=31850518;
 //BA.debugLineNum = 31850518;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31850519;
 //BA.debugLineNum = 31850519;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=31850520;
 //BA.debugLineNum = 31850520;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31850522;
 //BA.debugLineNum = 31850522;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=31850523;
 //BA.debugLineNum = 31850523;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=31850524;
 //BA.debugLineNum = 31850524;BA.debugLine="p2.Months = IIf(Forward,1,-1)";
_p2.Months = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=31850526;
 //BA.debugLineNum = 31850526;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=31850527;
 //BA.debugLineNum = 31850527;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate";
_firstdayofmonth = _dateutils._setdate(ba,__c.DateTime.GetYear(_currenttime),__c.DateTime.GetMonth(_currenttime),(int) (1));
RDebugUtils.currentLine=31850529;
 //BA.debugLineNum = 31850529;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=31850530;
 //BA.debugLineNum = 31850530;BA.debugLine="If m_MaxDate > 0 And FirstDayOfMonth > DateUti";
if (__ref._m_maxdate /*long*/ >0 && _firstdayofmonth>_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_maxdate /*long*/ ),__c.DateTime.GetMonth(__ref._m_maxdate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=31850531;
 //BA.debugLineNum = 31850531;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31850533;
 //BA.debugLineNum = 31850533;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfM";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_firstdayofmonth));
 }else {
RDebugUtils.currentLine=31850535;
 //BA.debugLineNum = 31850535;BA.debugLine="If m_MinDate > 0 And FirstDayOfMonth < DateUti";
if (__ref._m_mindate /*long*/ >0 && _firstdayofmonth<_dateutils._setdate(ba,__c.DateTime.GetYear(__ref._m_mindate /*long*/ ),__c.DateTime.GetMonth(__ref._m_mindate /*long*/ ),(int) (1))) { 
RDebugUtils.currentLine=31850536;
 //BA.debugLineNum = 31850536;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31850538;
 //BA.debugLineNum = 31850538;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,FirstDa";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_firstdayofmonth));
 };
 }else 
{RDebugUtils.currentLine=31850541;
 //BA.debugLineNum = 31850541;BA.debugLine="else If m_CurrentView = getCurrentView_YearView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=31850543;
 //BA.debugLineNum = 31850543;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31850544;
 //BA.debugLineNum = 31850544;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=31850545;
 //BA.debugLineNum = 31850545;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31850547;
 //BA.debugLineNum = 31850547;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=31850548;
 //BA.debugLineNum = 31850548;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=31850549;
 //BA.debugLineNum = 31850549;BA.debugLine="p2.Years = IIf(Forward,1,-1)";
_p2.Years = (int)(BA.ObjectToNumber(((_forward) ? ((Object)(1)) : ((Object)(-1)))));
RDebugUtils.currentLine=31850551;
 //BA.debugLineNum = 31850551;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int)(BA.ObjectToNumber(((_forward) ? ((Object)(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1)) : ((Object)(0))))))),_p2);
RDebugUtils.currentLine=31850554;
 //BA.debugLineNum = 31850554;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=31850555;
 //BA.debugLineNum = 31850555;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=31850556;
 //BA.debugLineNum = 31850556;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31850558;
 //BA.debugLineNum = 31850558;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 }else {
RDebugUtils.currentLine=31850560;
 //BA.debugLineNum = 31850560;BA.debugLine="If m_MinDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_mindate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)<__c.DateTime.GetYear(__ref._m_mindate /*long*/ )) { 
RDebugUtils.currentLine=31850561;
 //BA.debugLineNum = 31850561;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31850563;
 //BA.debugLineNum = 31850563;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,Current";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpageat /*String*/ (null,(int) (0),_xpnl_background,(Object)(_currenttime));
 };
 }else 
{RDebugUtils.currentLine=31850566;
 //BA.debugLineNum = 31850566;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeVie";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=31850568;
 //BA.debugLineNum = 31850568;BA.debugLine="If Forward Then";
if (_forward) { 
RDebugUtils.currentLine=31850570;
 //BA.debugLineNum = 31850570;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePan";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_background = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=31850571;
 //BA.debugLineNum = 31850571;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Transparent);
RDebugUtils.currentLine=31850572;
 //BA.debugLineNum = 31850572;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_V";
_xpnl_background.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),__ref._xpnl_viewpager /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight());
RDebugUtils.currentLine=31850574;
 //BA.debugLineNum = 31850574;BA.debugLine="Dim p2 As Period";
_p2 = new b4a.example.dateutils._period();
RDebugUtils.currentLine=31850575;
 //BA.debugLineNum = 31850575;BA.debugLine="p2.Initialize";
_p2.Initialize();
RDebugUtils.currentLine=31850576;
 //BA.debugLineNum = 31850576;BA.debugLine="p2.Years = 10";
_p2.Years = (int) (10);
RDebugUtils.currentLine=31850578;
 //BA.debugLineNum = 31850578;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(";
_currenttime = _dateutils._addperiod(ba,BA.ObjectToLongNumber(__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getvalue /*Object*/ (null,(int) (__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._getsize /*int*/ (null)-1))),_p2);
RDebugUtils.currentLine=31850581;
 //BA.debugLineNum = 31850581;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
if (__ref._m_maxdate /*long*/ >0 && __c.DateTime.GetYear(_currenttime)>__c.DateTime.GetYear(__ref._m_maxdate /*long*/ )) { 
RDebugUtils.currentLine=31850582;
 //BA.debugLineNum = 31850582;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31850584;
 //BA.debugLineNum = 31850584;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._addpage /*String*/ (null,_xpnl_background,(Object)(_currenttime));
 };
 }}}
;
 };
RDebugUtils.currentLine=31850591;
 //BA.debugLineNum = 31850591;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_header_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_header_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_header_click", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Private Sub xlbl_Header_Click";
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_monthview /*String*/ (null))) { 
RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="else If m_CurrentView = getCurrentView_YearView T";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_yearview /*String*/ (null))) { 
RDebugUtils.currentLine=36634629;
 //BA.debugLineNum = 36634629;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeView";
if ((__ref._m_currentview /*String*/ ).equals(__ref._getcurrentview_decadeview /*String*/ (null))) { 
RDebugUtils.currentLine=36634631;
 //BA.debugLineNum = 36634631;BA.debugLine="ChangeView(getCurrentView_CenturyView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_centuryview /*String*/ (null));
 }}}
;
RDebugUtils.currentLine=36634633;
 //BA.debugLineNum = 36634633;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowleft_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowleft_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowleft_click", null));}
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Private Sub xlbl_HeaderArrowLeft_Click";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="xASVP_Main.PreviousPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._previouspage /*String*/ (null);
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_headerarrowright_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xlbl_headerarrowright_click", true))
	 {return ((String) Debug.delegate(ba, "xlbl_headerarrowright_click", null));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Private Sub xlbl_HeaderArrowRight_Click";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="xASVP_Main.NextPage";
__ref._xasvp_main /*b4a.example.ef.asviewpager*/ ._nextpage /*String*/ (null);
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_centurydecade_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_centurydecade_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_centurydecade_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_centurydecade = null;
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Private Sub xpnl_CenturyDecade_Click";
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="Dim xpnl_CenturyDecade As B4XView = Sender";
_xpnl_centurydecade = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_centurydecade = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="m_StartDate = xpnl_CenturyDecade.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_centurydecade.getTag());
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_decadeview /*String*/ (null));
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_decadeyear_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_decadeyear_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_decadeyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_decadeyear = null;
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Private Sub xpnl_DecadeYear_Click";
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="Dim xpnl_DecadeYear As B4XView = Sender";
_xpnl_decadeyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_decadeyear = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=36700163;
 //BA.debugLineNum = 36700163;BA.debugLine="m_StartDate = xpnl_DecadeYear.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_decadeyear.getTag());
RDebugUtils.currentLine=36700164;
 //BA.debugLineNum = 36700164;BA.debugLine="ChangeView(getCurrentView_YearView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_yearview /*String*/ (null));
RDebugUtils.currentLine=36700165;
 //BA.debugLineNum = 36700165;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_monthdate_click(b4a.example.ef.as_datepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="as_datepicker";
if (Debug.shouldDelegate(ba, "xpnl_monthdate_click", true))
	 {return ((String) Debug.delegate(ba, "xpnl_monthdate_click", null));}
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Private Sub xpnl_MonthDate_Click";
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="MonthDateClick(Sender,True)";
__ref._monthdateclick /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Private Sub xpnl_YearMonth_Click";
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="Dim xpnl_YearMonth As B4XView = Sender";
_xpnl_yearmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_yearmonth = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=36765699;
 //BA.debugLineNum = 36765699;BA.debugLine="m_StartDate = xpnl_YearMonth.Tag";
__ref._m_startdate /*long*/  = BA.ObjectToLongNumber(_xpnl_yearmonth.getTag());
RDebugUtils.currentLine=36765700;
 //BA.debugLineNum = 36765700;BA.debugLine="If m_SelectMode = \"Date\"  Or m_SelectMode = \"Rang";
if ((__ref._m_selectmode /*String*/ ).equals("Date") || (__ref._m_selectmode /*String*/ ).equals("Range")) { 
RDebugUtils.currentLine=36765701;
 //BA.debugLineNum = 36765701;BA.debugLine="ChangeView(getCurrentView_MonthView)";
__ref._changeview /*void*/ (null,__ref._getcurrentview_monthview /*String*/ (null));
 }else 
{RDebugUtils.currentLine=36765702;
 //BA.debugLineNum = 36765702;BA.debugLine="Else If m_SelectMode = \"Month\" Then";
if ((__ref._m_selectmode /*String*/ ).equals("Month")) { 
RDebugUtils.currentLine=36765703;
 //BA.debugLineNum = 36765703;BA.debugLine="SelectedDateChanged(xpnl_YearMonth.Tag)";
__ref._selecteddatechanged /*String*/ (null,BA.ObjectToLongNumber(_xpnl_yearmonth.getTag()));
RDebugUtils.currentLine=36765705;
 //BA.debugLineNum = 36765705;BA.debugLine="If m_MouseHoverFeedback = True Then";
if (__ref._m_mousehoverfeedback /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=36765706;
 //BA.debugLineNum = 36765706;BA.debugLine="Dim xlbl_Date As B4XView = xpnl_YearMonth.GetVi";
_xlbl_date = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_date = _xpnl_yearmonth.GetView((int) (0));
RDebugUtils.currentLine=36765707;
 //BA.debugLineNum = 36765707;BA.debugLine="If xlbl_Date.Visible = False Then Return";
if (_xlbl_date.getVisible()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36765711;
 //BA.debugLineNum = 36765711;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
_xpnl_selected = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_selected = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=36765712;
 //BA.debugLineNum = 36765712;BA.debugLine="xpnl_YearMonth.AddView(xpnl_selected,0,0,xpnl_Y";
_xpnl_yearmonth.AddView((android.view.View)(_xpnl_selected.getObject()),(int) (0),(int) (0),_xpnl_yearmonth.getWidth(),_xpnl_yearmonth.getHeight());
RDebugUtils.currentLine=36765714;
 //BA.debugLineNum = 36765714;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateC";
_xpnl_selected.SetColorAndBorder(__ref._m_selecteddatecolor /*int*/ ,(int) (0),(int) (0),__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=36765715;
 //BA.debugLineNum = 36765715;BA.debugLine="xpnl_selected.SendToBack";
_xpnl_selected.SendToBack();
RDebugUtils.currentLine=36765716;
 //BA.debugLineNum = 36765716;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedD";
if (__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ != null && __ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.True) { 
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();};
RDebugUtils.currentLine=36765717;
 //BA.debugLineNum = 36765717;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
__ref._xpnl_selecteddate /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_selected;
 };
 }}
;
RDebugUtils.currentLine=36765724;
 //BA.debugLineNum = 36765724;BA.debugLine="End Sub";
return "";
}
}