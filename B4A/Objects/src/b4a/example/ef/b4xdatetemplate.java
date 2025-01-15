package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xdatetemplate extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xdatetemplate");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xdatetemplate.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public int _month = 0;
public int _year = 0;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _tempselectedday = 0;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanebg = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _dayspanefg = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
public anywheresoftware.b4a.objects.B4XCanvas _cvsbackground = null;
public long _selecteddate = 0L;
public long _previousselecteddate = 0L;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public int _highlightedcolor = 0;
public int _selectedcolor = 0;
public int _daysinmonthcolor = 0;
public int _daysinweekcolor = 0;
public anywheresoftware.b4a.objects.B4XCanvas _cvsdays = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _daystitlespane = null;
public int _firstday = 0;
public int _minyear = 0;
public int _maxyear = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnmonthright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearleft = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnyearright = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblmonth = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblyear = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnldialog = null;
public anywheresoftware.b4a.objects.collections.List _monthsnames = null;
public b4a.example.ef.b4xdialog _mdialog = null;
public boolean _closeonselection = false;
public anywheresoftware.b4a.objects.collections.List _daysofweeknames = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _btnmonth_click(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnmonth_click", true))
	 {return ((String) Debug.delegate(ba, "btnmonth_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
int _m = 0;
RDebugUtils.currentLine=66387968;
 //BA.debugLineNum = 66387968;BA.debugLine="Private Sub btnMonth_Click";
RDebugUtils.currentLine=66387969;
 //BA.debugLineNum = 66387969;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=66387970;
 //BA.debugLineNum = 66387970;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+__ref._month /*int*/ -1+(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=66387971;
 //BA.debugLineNum = 66387971;BA.debugLine="month = (m Mod 12) + 1";
__ref._month /*int*/  = (int) ((_m%12)+1);
RDebugUtils.currentLine=66387972;
 //BA.debugLineNum = 66387972;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=66387973;
 //BA.debugLineNum = 66387973;BA.debugLine="End Sub";
return "";
}
public String  _drawdays(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawdays", true))
	 {return ((String) Debug.delegate(ba, "drawdays", null));}
long _firstdayofmonth = 0L;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=65798144;
 //BA.debugLineNum = 65798144;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=65798145;
 //BA.debugLineNum = 65798145;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=65798146;
 //BA.debugLineNum = 65798146;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=65798147;
 //BA.debugLineNum = 65798147;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=65798148;
 //BA.debugLineNum = 65798148;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=65798149;
 //BA.debugLineNum = 65798149;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=65798150;
 //BA.debugLineNum = 65798150;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=65798151;
 //BA.debugLineNum = 65798151;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref._dayofweekoffset /*int*/  = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-__ref._firstday /*int*/ )%7);
RDebugUtils.currentLine=65798152;
 //BA.debugLineNum = 65798152;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=65798153;
 //BA.debugLineNum = 65798153;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=65798155;
 //BA.debugLineNum = 65798155;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=65798158;
 //BA.debugLineNum = 65798158;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=65798159;
 //BA.debugLineNum = 65798159;BA.debugLine="For day = 1 To daysInMonth";
{
final int step13 = 1;
final int limit13 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit13 ;_day = _day + step13 ) {
RDebugUtils.currentLine=65798160;
 //BA.debugLineNum = 65798160;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=65798161;
 //BA.debugLineNum = 65798161;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),_daysfont,__ref._daysinmonthcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=65798164;
 //BA.debugLineNum = 65798164;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=65798165;
 //BA.debugLineNum = 65798165;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=65798166;
 //BA.debugLineNum = 65798166;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnyear_click", true))
	 {return ((String) Debug.delegate(ba, "btnyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=66322432;
 //BA.debugLineNum = 66322432;BA.debugLine="Private Sub btnYear_Click";
RDebugUtils.currentLine=66322433;
 //BA.debugLineNum = 66322433;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=66322434;
 //BA.debugLineNum = 66322434;BA.debugLine="year = year + btn.Tag";
__ref._year /*int*/  = (int) (__ref._year /*int*/ +(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=66322435;
 //BA.debugLineNum = 66322435;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=66322436;
 //BA.debugLineNum = 66322436;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
RDebugUtils.currentLine=65667072;
 //BA.debugLineNum = 65667072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=65667073;
 //BA.debugLineNum = 65667073;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=65667074;
 //BA.debugLineNum = 65667074;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=65667075;
 //BA.debugLineNum = 65667075;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=65667076;
 //BA.debugLineNum = 65667076;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=65667077;
 //BA.debugLineNum = 65667077;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=65667078;
 //BA.debugLineNum = 65667078;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=65667079;
 //BA.debugLineNum = 65667079;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=65667080;
 //BA.debugLineNum = 65667080;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667081;
 //BA.debugLineNum = 65667081;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667082;
 //BA.debugLineNum = 65667082;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=65667083;
 //BA.debugLineNum = 65667083;BA.debugLine="Private cvsBackground As B4XCanvas";
_cvsbackground = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=65667084;
 //BA.debugLineNum = 65667084;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=65667085;
 //BA.debugLineNum = 65667085;BA.debugLine="Private PreviousSelectedDate As Long";
_previousselecteddate = 0L;
RDebugUtils.currentLine=65667086;
 //BA.debugLineNum = 65667086;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=65667087;
 //BA.debugLineNum = 65667087;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_highlightedcolor = ((int)0xff001bbd);
RDebugUtils.currentLine=65667088;
 //BA.debugLineNum = 65667088;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_selectedcolor = ((int)0xff0ba29b);
RDebugUtils.currentLine=65667089;
 //BA.debugLineNum = 65667089;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_daysinmonthcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=65667090;
 //BA.debugLineNum = 65667090;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_daysinweekcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=65667091;
 //BA.debugLineNum = 65667091;BA.debugLine="Private cvsDays As B4XCanvas";
_cvsdays = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=65667092;
 //BA.debugLineNum = 65667092;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667093;
 //BA.debugLineNum = 65667093;BA.debugLine="Public FirstDay As Int = 0";
_firstday = (int) (0);
RDebugUtils.currentLine=65667094;
 //BA.debugLineNum = 65667094;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_minyear = (int) (1970);
_maxyear = (int) (2030);
RDebugUtils.currentLine=65667095;
 //BA.debugLineNum = 65667095;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667096;
 //BA.debugLineNum = 65667096;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667097;
 //BA.debugLineNum = 65667097;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667098;
 //BA.debugLineNum = 65667098;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667099;
 //BA.debugLineNum = 65667099;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667100;
 //BA.debugLineNum = 65667100;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667101;
 //BA.debugLineNum = 65667101;BA.debugLine="Private pnlDialog As B4XView";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=65667102;
 //BA.debugLineNum = 65667102;BA.debugLine="Public MonthsNames As List";
_monthsnames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=65667103;
 //BA.debugLineNum = 65667103;BA.debugLine="Private mDialog As B4XDialog";
_mdialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=65667104;
 //BA.debugLineNum = 65667104;BA.debugLine="Public CloseOnSelection As Boolean = True";
_closeonselection = __c.True;
RDebugUtils.currentLine=65667105;
 //BA.debugLineNum = 65667105;BA.debugLine="Public DaysOfWeekNames As List";
_daysofweeknames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=65667106;
 //BA.debugLineNum = 65667106;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(b4a.example.ef.b4xdatetemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dayspanefg_touch", true))
	 {return ((String) Debug.delegate(ba, "dayspanefg_touch", new Object[] {_action,_x,_y}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=66453504;
 //BA.debugLineNum = 66453504;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
RDebugUtils.currentLine=66453505;
 //BA.debugLineNum = 66453505;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=66453506;
 //BA.debugLineNum = 66453506;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
__ref._handlemouse /*String*/ (null,_x,_y,_action!=_p.TOUCH_ACTION_UP);
RDebugUtils.currentLine=66453507;
 //BA.debugLineNum = 66453507;BA.debugLine="End Sub";
return "";
}
public String  _handlemouse(b4a.example.ef.b4xdatetemplate __ref,double _x,double _y,boolean _move) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "handlemouse", true))
	 {return ((String) Debug.delegate(ba, "handlemouse", new Object[] {_x,_y,_move}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=66191360;
 //BA.debugLineNum = 66191360;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
RDebugUtils.currentLine=66191361;
 //BA.debugLineNum = 66191361;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=66191362;
 //BA.debugLineNum = 66191362;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=66191363;
 //BA.debugLineNum = 66191363;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=66191364;
 //BA.debugLineNum = 66191364;BA.debugLine="If move Then";
if (_move) { 
RDebugUtils.currentLine=66191365;
 //BA.debugLineNum = 66191365;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=66191366;
 //BA.debugLineNum = 66191366;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=66191367;
 //BA.debugLineNum = 66191367;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=66191368;
 //BA.debugLineNum = 66191368;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=66191369;
 //BA.debugLineNum = 66191369;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._highlightedcolor /*int*/ ,_boxx,_boxy);
 };
 }else {
RDebugUtils.currentLine=66191372;
 //BA.debugLineNum = 66191372;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=66191373;
 //BA.debugLineNum = 66191373;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=66191374;
 //BA.debugLineNum = 66191374;BA.debugLine="SelectDay(newSelectedDay)";
__ref._selectday /*String*/ (null,_newselectedday);
RDebugUtils.currentLine=66191375;
 //BA.debugLineNum = 66191375;BA.debugLine="If CloseOnSelection Then";
if (__ref._closeonselection /*boolean*/ ) { 
RDebugUtils.currentLine=66191376;
 //BA.debugLineNum = 66191376;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 }else {
RDebugUtils.currentLine=66191378;
 //BA.debugLineNum = 66191378;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
 };
 };
 };
RDebugUtils.currentLine=66191383;
 //BA.debugLineNum = 66191383;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=66191384;
 //BA.debugLineNum = 66191384;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4a.example.ef.b4xdatetemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=66650112;
 //BA.debugLineNum = 66650112;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=66650113;
 //BA.debugLineNum = 66650113;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=66650114;
 //BA.debugLineNum = 66650114;BA.debugLine="setDate(PreviousSelectedDate)";
__ref._setdate /*String*/ (null,__ref._previousselecteddate /*long*/ );
 };
RDebugUtils.currentLine=66650116;
 //BA.debugLineNum = 66650116;BA.debugLine="End Sub";
return "";
}
public String  _setdate(b4a.example.ef.b4xdatetemplate __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setdate", true))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date}));}
RDebugUtils.currentLine=66060288;
 //BA.debugLineNum = 66060288;BA.debugLine="Public Sub setDate(date As Long)";
RDebugUtils.currentLine=66060290;
 //BA.debugLineNum = 66060290;BA.debugLine="If lblYear.IsInitialized = False Then";
if (__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=66060291;
 //BA.debugLineNum = 66060291;BA.debugLine="selectedDate = date";
__ref._selecteddate /*long*/  = _date;
RDebugUtils.currentLine=66060292;
 //BA.debugLineNum = 66060292;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
RDebugUtils.currentLine=66060294;
 //BA.debugLineNum = 66060294;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=66060295;
 //BA.debugLineNum = 66060295;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=66060296;
 //BA.debugLineNum = 66060296;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date));
RDebugUtils.currentLine=66060297;
 //BA.debugLineNum = 66060297;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=66060298;
 //BA.debugLineNum = 66060298;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=66060299;
 //BA.debugLineNum = 66060299;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(b4a.example.ef.b4xdatetemplate __ref,anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawbox", true))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=65929216;
 //BA.debugLineNum = 65929216;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
RDebugUtils.currentLine=65929217;
 //BA.debugLineNum = 65929217;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=65929218;
 //BA.debugLineNum = 65929218;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ ),(float) (_x*__ref._boxw /*float*/ +__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ +__ref._boxh /*float*/ ));
RDebugUtils.currentLine=65929219;
 //BA.debugLineNum = 65929219;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=65929220;
 //BA.debugLineNum = 65929220;BA.debugLine="End Sub";
return "";
}
public String  _setyearsbuttonstate(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setyearsbuttonstate", true))
	 {return ((String) Debug.delegate(ba, "setyearsbuttonstate", null));}
RDebugUtils.currentLine=65863680;
 //BA.debugLineNum = 65863680;BA.debugLine="Private Sub SetYearsButtonState";
RDebugUtils.currentLine=65863681;
 //BA.debugLineNum = 65863681;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
__ref._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ >__ref._minyear /*int*/ );
RDebugUtils.currentLine=65863682;
 //BA.debugLineNum = 65863682;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
__ref._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ <__ref._maxyear /*int*/ );
RDebugUtils.currentLine=65863683;
 //BA.debugLineNum = 65863683;BA.debugLine="End Sub";
return "";
}
public long  _getdate(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getdate", true))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=65994752;
 //BA.debugLineNum = 65994752;BA.debugLine="Public Sub getDate As Long";
RDebugUtils.currentLine=65994753;
 //BA.debugLineNum = 65994753;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=65994754;
 //BA.debugLineNum = 65994754;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.b4xdatetemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=66519040;
 //BA.debugLineNum = 66519040;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=66519041;
 //BA.debugLineNum = 66519041;BA.debugLine="Return pnlDialog";
if (true) return __ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=66519042;
 //BA.debugLineNum = 66519042;BA.debugLine="End Sub";
return null;
}
public String  _selectday(b4a.example.ef.b4xdatetemplate __ref,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "selectday", true))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day}));}
RDebugUtils.currentLine=66125824;
 //BA.debugLineNum = 66125824;BA.debugLine="Private Sub SelectDay(day As Int)";
RDebugUtils.currentLine=66125825;
 //BA.debugLineNum = 66125825;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=66125826;
 //BA.debugLineNum = 66125826;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=66125827;
 //BA.debugLineNum = 66125827;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=66125828;
 //BA.debugLineNum = 66125828;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=66125829;
 //BA.debugLineNum = 66125829;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=66256896;
 //BA.debugLineNum = 66256896;BA.debugLine="Private Sub Hide";
RDebugUtils.currentLine=66256897;
 //BA.debugLineNum = 66256897;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
__ref._mdialog /*b4a.example.ef.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=66256898;
 //BA.debugLineNum = 66256898;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xdatetemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=65732608;
 //BA.debugLineNum = 65732608;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=65732609;
 //BA.debugLineNum = 65732609;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=65732610;
 //BA.debugLineNum = 65732610;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=65732611;
 //BA.debugLineNum = 65732611;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("DateTemplate",ba);
RDebugUtils.currentLine=65732612;
 //BA.debugLineNum = 65732612;BA.debugLine="pnlDialog.Tag = Me";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=65732613;
 //BA.debugLineNum = 65732613;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=65732614;
 //BA.debugLineNum = 65732614;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=65732615;
 //BA.debugLineNum = 65732615;BA.debugLine="MonthsNames = DateUtils.GetMonthsNames";
__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/  = _dateutils._getmonthsnames(ba);
RDebugUtils.currentLine=65732616;
 //BA.debugLineNum = 65732616;BA.debugLine="selectedDate = DateTime.Now";
__ref._selecteddate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=65732617;
 //BA.debugLineNum = 65732617;BA.debugLine="setDate(selectedDate)";
__ref._setdate /*String*/ (null,__ref._selecteddate /*long*/ );
RDebugUtils.currentLine=65732618;
 //BA.debugLineNum = 65732618;BA.debugLine="cvs.Initialize(DaysPaneFg)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=65732619;
 //BA.debugLineNum = 65732619;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanebg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=65732620;
 //BA.debugLineNum = 65732620;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)7);
RDebugUtils.currentLine=65732621;
 //BA.debugLineNum = 65732621;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)6);
RDebugUtils.currentLine=65732622;
 //BA.debugLineNum = 65732622;BA.debugLine="vCorrection = 5dip";
__ref._vcorrection /*float*/  = (float) (__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=65732623;
 //BA.debugLineNum = 65732623;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._daystitlespane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=65732629;
 //BA.debugLineNum = 65732629;BA.debugLine="DaysOfWeekNames.Initialize";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=65732630;
 //BA.debugLineNum = 65732630;BA.debugLine="DaysOfWeekNames.AddAll(DateUtils.GetDaysNames)";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_dateutils._getdaysnames(ba));
RDebugUtils.currentLine=65732631;
 //BA.debugLineNum = 65732631;BA.debugLine="End Sub";
return "";
}
public void  _show(b4a.example.ef.b4xdatetemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "show", true))
	 {Debug.delegate(ba, "show", new Object[] {_dialog}); return;}
ResumableSub_Show rsub = new ResumableSub_Show(this,__ref,_dialog);
rsub.resume(ba, null);
}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4a.example.ef.b4xdatetemplate parent,b4a.example.ef.b4xdatetemplate __ref,b4a.example.ef.b4xdialog _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
this.__ref = parent;
}
b4a.example.ef.b4xdatetemplate __ref;
b4a.example.ef.b4xdatetemplate parent;
b4a.example.ef.b4xdialog _dialog;
anywheresoftware.b4a.objects.collections.List _days = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _daysfont = null;
int _i = 0;
String _d = "";
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xdatetemplate";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=66584577;
 //BA.debugLineNum = 66584577;BA.debugLine="Dim days As List = DaysOfWeekNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = __ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=66584578;
 //BA.debugLineNum = 66584578;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=66584579;
 //BA.debugLineNum = 66584579;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=66584580;
 //BA.debugLineNum = 66584580;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
if (true) break;

case 1:
//for
this.state = 10;
step4 = 1;
limit4 = (int) (__ref._firstday /*int*/ +7-1);
_i = __ref._firstday /*int*/  ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 10;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 3;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=66584581;
 //BA.debugLineNum = 66584581;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
RDebugUtils.currentLine=66584582;
 //BA.debugLineNum = 66584582;BA.debugLine="If d.Length > 2 Then d = d.SubString2(0, 2)";
if (true) break;

case 4:
//if
this.state = 9;
if (_d.length()>2) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_d = _d.substring((int) (0),(int) (2));
if (true) break;

case 9:
//C
this.state = 12;
;
RDebugUtils.currentLine=66584583;
 //BA.debugLineNum = 66584583;BA.debugLine="cvsDays.DrawText(d, (i - FirstDay + 0.5) * boxW,";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_d,(float) ((_i-__ref._firstday /*int*/ +0.5)*__ref._boxw /*float*/ ),(float) (parent.__c.DipToCurrent((int) (20))),_daysfont,__ref._daysinweekcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=66584585;
 //BA.debugLineNum = 66584585;BA.debugLine="cvsDays.Invalidate";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=66584586;
 //BA.debugLineNum = 66584586;BA.debugLine="mDialog = Dialog";
__ref._mdialog /*b4a.example.ef.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=66584587;
 //BA.debugLineNum = 66584587;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=66584588;
 //BA.debugLineNum = 66584588;BA.debugLine="PreviousSelectedDate = selectedDate";
__ref._previousselecteddate /*long*/  = __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=66584589;
 //BA.debugLineNum = 66584589;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdatetemplate", "show"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=66584590;
 //BA.debugLineNum = 66584590;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=66584591;
 //BA.debugLineNum = 66584591;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}