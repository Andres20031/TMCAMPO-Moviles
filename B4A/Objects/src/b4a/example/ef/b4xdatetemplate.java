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
RDebugUtils.currentLine=51052544;
 //BA.debugLineNum = 51052544;BA.debugLine="Private Sub btnMonth_Click";
RDebugUtils.currentLine=51052545;
 //BA.debugLineNum = 51052545;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=51052546;
 //BA.debugLineNum = 51052546;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+__ref._month /*int*/ -1+(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=51052547;
 //BA.debugLineNum = 51052547;BA.debugLine="month = (m Mod 12) + 1";
__ref._month /*int*/  = (int) ((_m%12)+1);
RDebugUtils.currentLine=51052548;
 //BA.debugLineNum = 51052548;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=51052549;
 //BA.debugLineNum = 51052549;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=50462724;
 //BA.debugLineNum = 50462724;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=50462725;
 //BA.debugLineNum = 50462725;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=50462726;
 //BA.debugLineNum = 50462726;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=50462727;
 //BA.debugLineNum = 50462727;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref._dayofweekoffset /*int*/  = (int) ((7+__c.DateTime.GetDayOfWeek(_firstdayofmonth)-__ref._firstday /*int*/ )%7);
RDebugUtils.currentLine=50462728;
 //BA.debugLineNum = 50462728;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=50462729;
 //BA.debugLineNum = 50462729;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=50462731;
 //BA.debugLineNum = 50462731;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=50462734;
 //BA.debugLineNum = 50462734;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=50462735;
 //BA.debugLineNum = 50462735;BA.debugLine="For day = 1 To daysInMonth";
{
final int step13 = 1;
final int limit13 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit13 ;_day = _day + step13 ) {
RDebugUtils.currentLine=50462736;
 //BA.debugLineNum = 50462736;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=50462737;
 //BA.debugLineNum = 50462737;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),_daysfont,__ref._daysinmonthcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=50462740;
 //BA.debugLineNum = 50462740;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=50462741;
 //BA.debugLineNum = 50462741;BA.debugLine="cvs.Invalidate";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=50462742;
 //BA.debugLineNum = 50462742;BA.debugLine="End Sub";
return "";
}
public String  _btnyear_click(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "btnyear_click", true))
	 {return ((String) Debug.delegate(ba, "btnyear_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _btn = null;
RDebugUtils.currentLine=50987008;
 //BA.debugLineNum = 50987008;BA.debugLine="Private Sub btnYear_Click";
RDebugUtils.currentLine=50987009;
 //BA.debugLineNum = 50987009;BA.debugLine="Dim btn As B4XView = Sender";
_btn = new anywheresoftware.b4a.objects.B4XViewWrapper();
_btn = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=50987010;
 //BA.debugLineNum = 50987010;BA.debugLine="year = year + btn.Tag";
__ref._year /*int*/  = (int) (__ref._year /*int*/ +(double)(BA.ObjectToNumber(_btn.getTag())));
RDebugUtils.currentLine=50987011;
 //BA.debugLineNum = 50987011;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=50987012;
 //BA.debugLineNum = 50987012;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=50331652;
 //BA.debugLineNum = 50331652;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=50331653;
 //BA.debugLineNum = 50331653;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=50331654;
 //BA.debugLineNum = 50331654;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=50331655;
 //BA.debugLineNum = 50331655;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=50331656;
 //BA.debugLineNum = 50331656;BA.debugLine="Private DaysPaneBg As B4XView";
_dayspanebg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331657;
 //BA.debugLineNum = 50331657;BA.debugLine="Private DaysPaneFg As B4XView";
_dayspanefg = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331658;
 //BA.debugLineNum = 50331658;BA.debugLine="Private cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=50331659;
 //BA.debugLineNum = 50331659;BA.debugLine="Private cvsBackground As B4XCanvas";
_cvsbackground = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=50331660;
 //BA.debugLineNum = 50331660;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=50331661;
 //BA.debugLineNum = 50331661;BA.debugLine="Private PreviousSelectedDate As Long";
_previousselecteddate = 0L;
RDebugUtils.currentLine=50331662;
 //BA.debugLineNum = 50331662;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=50331663;
 //BA.debugLineNum = 50331663;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
_highlightedcolor = ((int)0xff001bbd);
RDebugUtils.currentLine=50331664;
 //BA.debugLineNum = 50331664;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
_selectedcolor = ((int)0xff0ba29b);
RDebugUtils.currentLine=50331665;
 //BA.debugLineNum = 50331665;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
_daysinmonthcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_White;
RDebugUtils.currentLine=50331666;
 //BA.debugLineNum = 50331666;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
_daysinweekcolor = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Gray;
RDebugUtils.currentLine=50331667;
 //BA.debugLineNum = 50331667;BA.debugLine="Private cvsDays As B4XCanvas";
_cvsdays = new anywheresoftware.b4a.objects.B4XCanvas();
RDebugUtils.currentLine=50331668;
 //BA.debugLineNum = 50331668;BA.debugLine="Private DaysTitlesPane As B4XView";
_daystitlespane = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331669;
 //BA.debugLineNum = 50331669;BA.debugLine="Public FirstDay As Int = 0";
_firstday = (int) (0);
RDebugUtils.currentLine=50331670;
 //BA.debugLineNum = 50331670;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
_minyear = (int) (1970);
_maxyear = (int) (2030);
RDebugUtils.currentLine=50331671;
 //BA.debugLineNum = 50331671;BA.debugLine="Public btnMonthLeft As B4XView";
_btnmonthleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331672;
 //BA.debugLineNum = 50331672;BA.debugLine="Public btnMonthRight As B4XView";
_btnmonthright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331673;
 //BA.debugLineNum = 50331673;BA.debugLine="Public btnYearLeft As B4XView";
_btnyearleft = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331674;
 //BA.debugLineNum = 50331674;BA.debugLine="Public btnYearRight As B4XView";
_btnyearright = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331675;
 //BA.debugLineNum = 50331675;BA.debugLine="Public lblMonth As B4XView";
_lblmonth = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331676;
 //BA.debugLineNum = 50331676;BA.debugLine="Public lblYear As B4XView";
_lblyear = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331677;
 //BA.debugLineNum = 50331677;BA.debugLine="Private pnlDialog As B4XView";
_pnldialog = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=50331678;
 //BA.debugLineNum = 50331678;BA.debugLine="Public MonthsNames As List";
_monthsnames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50331679;
 //BA.debugLineNum = 50331679;BA.debugLine="Private mDialog As B4XDialog";
_mdialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=50331680;
 //BA.debugLineNum = 50331680;BA.debugLine="Public CloseOnSelection As Boolean = True";
_closeonselection = __c.True;
RDebugUtils.currentLine=50331681;
 //BA.debugLineNum = 50331681;BA.debugLine="Public DaysOfWeekNames As List";
_daysofweeknames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50331682;
 //BA.debugLineNum = 50331682;BA.debugLine="End Sub";
return "";
}
public String  _dayspanefg_touch(b4a.example.ef.b4xdatetemplate __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dayspanefg_touch", true))
	 {return ((String) Debug.delegate(ba, "dayspanefg_touch", new Object[] {_action,_x,_y}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=51118080;
 //BA.debugLineNum = 51118080;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
RDebugUtils.currentLine=51118081;
 //BA.debugLineNum = 51118081;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=51118082;
 //BA.debugLineNum = 51118082;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
__ref._handlemouse /*String*/ (null,_x,_y,_action!=_p.TOUCH_ACTION_UP);
RDebugUtils.currentLine=51118083;
 //BA.debugLineNum = 51118083;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=50855939;
 //BA.debugLineNum = 50855939;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=50855940;
 //BA.debugLineNum = 50855940;BA.debugLine="If move Then";
if (_move) { 
RDebugUtils.currentLine=50855941;
 //BA.debugLineNum = 50855941;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=50855942;
 //BA.debugLineNum = 50855942;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=50855943;
 //BA.debugLineNum = 50855943;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=50855944;
 //BA.debugLineNum = 50855944;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=50855945;
 //BA.debugLineNum = 50855945;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ ,__ref._highlightedcolor /*int*/ ,_boxx,_boxy);
 };
 }else {
RDebugUtils.currentLine=50855948;
 //BA.debugLineNum = 50855948;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=50855949;
 //BA.debugLineNum = 50855949;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=50855950;
 //BA.debugLineNum = 50855950;BA.debugLine="SelectDay(newSelectedDay)";
__ref._selectday /*String*/ (null,_newselectedday);
RDebugUtils.currentLine=50855951;
 //BA.debugLineNum = 50855951;BA.debugLine="If CloseOnSelection Then";
if (__ref._closeonselection /*boolean*/ ) { 
RDebugUtils.currentLine=50855952;
 //BA.debugLineNum = 50855952;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 }else {
RDebugUtils.currentLine=50855954;
 //BA.debugLineNum = 50855954;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
 };
 };
 };
RDebugUtils.currentLine=50855959;
 //BA.debugLineNum = 50855959;BA.debugLine="cvsBackground.Invalidate";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=50855960;
 //BA.debugLineNum = 50855960;BA.debugLine="End Sub";
return "";
}
public String  _dialogclosed(b4a.example.ef.b4xdatetemplate __ref,int _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "dialogclosed", true))
	 {return ((String) Debug.delegate(ba, "dialogclosed", new Object[] {_result}));}
RDebugUtils.currentLine=51314688;
 //BA.debugLineNum = 51314688;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
RDebugUtils.currentLine=51314689;
 //BA.debugLineNum = 51314689;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
RDebugUtils.currentLine=51314690;
 //BA.debugLineNum = 51314690;BA.debugLine="setDate(PreviousSelectedDate)";
__ref._setdate /*String*/ (null,__ref._previousselecteddate /*long*/ );
 };
RDebugUtils.currentLine=51314692;
 //BA.debugLineNum = 51314692;BA.debugLine="End Sub";
return "";
}
public String  _setdate(b4a.example.ef.b4xdatetemplate __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setdate", true))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date}));}
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Public Sub setDate(date As Long)";
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="If lblYear.IsInitialized = False Then";
if (__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
RDebugUtils.currentLine=50724867;
 //BA.debugLineNum = 50724867;BA.debugLine="selectedDate = date";
__ref._selecteddate /*long*/  = _date;
RDebugUtils.currentLine=50724868;
 //BA.debugLineNum = 50724868;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return "";
 };
RDebugUtils.currentLine=50724870;
 //BA.debugLineNum = 50724870;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=50724871;
 //BA.debugLineNum = 50724871;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=50724872;
 //BA.debugLineNum = 50724872;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date));
RDebugUtils.currentLine=50724873;
 //BA.debugLineNum = 50724873;BA.debugLine="lblYear.Text = year";
__ref._lblyear /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._year /*int*/ ));
RDebugUtils.currentLine=50724874;
 //BA.debugLineNum = 50724874;BA.debugLine="lblMonth.Text = MonthsNames.Get(month - 1)";
__ref._lblmonth /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._month /*int*/ -1))));
RDebugUtils.currentLine=50724875;
 //BA.debugLineNum = 50724875;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(b4a.example.ef.b4xdatetemplate __ref,anywheresoftware.b4a.objects.B4XCanvas _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "drawbox", true))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="Dim r As B4XRect";
_r = new anywheresoftware.b4a.objects.B4XCanvas.B4XRect();
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
_r.Initialize((float) (_x*__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ ),(float) (_x*__ref._boxw /*float*/ +__ref._boxw /*float*/ ),(float) (_y*__ref._boxh /*float*/ +__ref._boxh /*float*/ ));
RDebugUtils.currentLine=50593795;
 //BA.debugLineNum = 50593795;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
_c.DrawRect(_r,_clr,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=50593796;
 //BA.debugLineNum = 50593796;BA.debugLine="End Sub";
return "";
}
public String  _setyearsbuttonstate(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "setyearsbuttonstate", true))
	 {return ((String) Debug.delegate(ba, "setyearsbuttonstate", null));}
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Private Sub SetYearsButtonState";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
__ref._btnyearleft /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ >__ref._minyear /*int*/ );
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
__ref._btnyearright /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setEnabled(__ref._year /*int*/ <__ref._maxyear /*int*/ );
RDebugUtils.currentLine=50528259;
 //BA.debugLineNum = 50528259;BA.debugLine="End Sub";
return "";
}
public long  _getdate(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getdate", true))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="Public Sub getDate As Long";
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=50659330;
 //BA.debugLineNum = 50659330;BA.debugLine="End Sub";
return 0L;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(b4a.example.ef.b4xdatetemplate __ref,b4a.example.ef.b4xdialog _dialog) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "getpanel", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getpanel", new Object[] {_dialog}));}
RDebugUtils.currentLine=51183616;
 //BA.debugLineNum = 51183616;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
RDebugUtils.currentLine=51183617;
 //BA.debugLineNum = 51183617;BA.debugLine="Return pnlDialog";
if (true) return __ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=51183618;
 //BA.debugLineNum = 51183618;BA.debugLine="End Sub";
return null;
}
public String  _selectday(b4a.example.ef.b4xdatetemplate __ref,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "selectday", true))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day}));}
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Private Sub SelectDay(day As Int)";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=50790403;
 //BA.debugLineNum = 50790403;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=50790404;
 //BA.debugLineNum = 50790404;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=50790405;
 //BA.debugLineNum = 50790405;BA.debugLine="End Sub";
return "";
}
public String  _hide(b4a.example.ef.b4xdatetemplate __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Private Sub Hide";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
__ref._mdialog /*b4a.example.ef.b4xdialog*/ ._close /*boolean*/ (null,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive);
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xdatetemplate __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xdatetemplate";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (300)));
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("DateTemplate",ba);
RDebugUtils.currentLine=50397188;
 //BA.debugLineNum = 50397188;BA.debugLine="pnlDialog.Tag = Me";
__ref._pnldialog /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(this);
RDebugUtils.currentLine=50397189;
 //BA.debugLineNum = 50397189;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=50397190;
 //BA.debugLineNum = 50397190;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=50397191;
 //BA.debugLineNum = 50397191;BA.debugLine="MonthsNames = DateUtils.GetMonthsNames";
__ref._monthsnames /*anywheresoftware.b4a.objects.collections.List*/  = _dateutils._getmonthsnames(ba);
RDebugUtils.currentLine=50397192;
 //BA.debugLineNum = 50397192;BA.debugLine="selectedDate = DateTime.Now";
__ref._selecteddate /*long*/  = __c.DateTime.getNow();
RDebugUtils.currentLine=50397193;
 //BA.debugLineNum = 50397193;BA.debugLine="setDate(selectedDate)";
__ref._setdate /*String*/ (null,__ref._selecteddate /*long*/ );
RDebugUtils.currentLine=50397194;
 //BA.debugLineNum = 50397194;BA.debugLine="cvs.Initialize(DaysPaneFg)";
__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanefg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=50397195;
 //BA.debugLineNum = 50397195;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._dayspanebg /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=50397196;
 //BA.debugLineNum = 50397196;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getWidth()/(double)7);
RDebugUtils.currentLine=50397197;
 //BA.debugLineNum = 50397197;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect().getHeight()/(double)6);
RDebugUtils.currentLine=50397198;
 //BA.debugLineNum = 50397198;BA.debugLine="vCorrection = 5dip";
__ref._vcorrection /*float*/  = (float) (__c.DipToCurrent((int) (5)));
RDebugUtils.currentLine=50397199;
 //BA.debugLineNum = 50397199;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Initialize(__ref._daystitlespane /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=50397205;
 //BA.debugLineNum = 50397205;BA.debugLine="DaysOfWeekNames.Initialize";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=50397206;
 //BA.debugLineNum = 50397206;BA.debugLine="DaysOfWeekNames.AddAll(DateUtils.GetDaysNames)";
__ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_dateutils._getdaysnames(ba));
RDebugUtils.currentLine=50397207;
 //BA.debugLineNum = 50397207;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=51249153;
 //BA.debugLineNum = 51249153;BA.debugLine="Dim days As List = DaysOfWeekNames";
_days = new anywheresoftware.b4a.objects.collections.List();
_days = __ref._daysofweeknames /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=51249154;
 //BA.debugLineNum = 51249154;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (14));
RDebugUtils.currentLine=51249155;
 //BA.debugLineNum = 51249155;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .ClearRect(__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .getTargetRect());
RDebugUtils.currentLine=51249156;
 //BA.debugLineNum = 51249156;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
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
RDebugUtils.currentLine=51249157;
 //BA.debugLineNum = 51249157;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = BA.ObjectToString(_days.Get((int) (_i%7)));
RDebugUtils.currentLine=51249158;
 //BA.debugLineNum = 51249158;BA.debugLine="If d.Length > 2 Then d = d.SubString2(0, 2)";
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
RDebugUtils.currentLine=51249159;
 //BA.debugLineNum = 51249159;BA.debugLine="cvsDays.DrawText(d, (i - FirstDay + 0.5) * boxW,";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .DrawText(ba,_d,(float) ((_i-__ref._firstday /*int*/ +0.5)*__ref._boxw /*float*/ ),(float) (parent.__c.DipToCurrent((int) (20))),_daysfont,__ref._daysinweekcolor /*int*/ ,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=51249161;
 //BA.debugLineNum = 51249161;BA.debugLine="cvsDays.Invalidate";
__ref._cvsdays /*anywheresoftware.b4a.objects.B4XCanvas*/ .Invalidate();
RDebugUtils.currentLine=51249162;
 //BA.debugLineNum = 51249162;BA.debugLine="mDialog = Dialog";
__ref._mdialog /*b4a.example.ef.b4xdialog*/  = _dialog;
RDebugUtils.currentLine=51249163;
 //BA.debugLineNum = 51249163;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=51249164;
 //BA.debugLineNum = 51249164;BA.debugLine="PreviousSelectedDate = selectedDate";
__ref._previousselecteddate /*long*/  = __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=51249165;
 //BA.debugLineNum = 51249165;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xdatetemplate", "show"),(int) (0));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=51249166;
 //BA.debugLineNum = 51249166;BA.debugLine="SetYearsButtonState";
__ref._setyearsbuttonstate /*String*/ (null);
RDebugUtils.currentLine=51249167;
 //BA.debugLineNum = 51249167;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}