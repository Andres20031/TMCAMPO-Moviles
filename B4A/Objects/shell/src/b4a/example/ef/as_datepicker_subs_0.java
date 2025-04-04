package b4a.example.ef;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class as_datepicker_subs_0 {


public static RemoteObject  _addmonth(RemoteObject __ref,RemoteObject _parent,RemoteObject _currentdate) throws Exception{
try {
		Debug.PushSubsStack("AddMonth (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,876);
if (RapidSub.canDelegate("addmonth")) { return __ref.runUserSub(false, "as_datepicker","addmonth", __ref, _parent, _currentdate);}
RemoteObject _clr = null;
RemoteObject _blockheight = RemoteObject.createImmutable(0f);
RemoteObject _blockwidth = RemoteObject.createImmutable(0f);
RemoteObject _firstday = RemoteObject.createImmutable(0L);
RemoteObject _currenmonth = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _currentday = RemoteObject.createImmutable(0L);
RemoteObject _rest = RemoteObject.createImmutable(0);
RemoteObject _test = RemoteObject.createImmutable(0);
RemoteObject _xpnl_date = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_date = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _color = null;
RemoteObject _xpnl_currentday = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_weeknumber = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_weeknumber = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_canvasbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xcv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XCanvas");
Debug.locals.put("Parent", _parent);
Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 876;BA.debugLine="Private Sub AddMonth(Parent As B4XView,CurrentDate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 878;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
Debug.JustUpdateDeviceLine();
_clr = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getargb" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_m_selecteddatecolor" /*RemoteObject*/ )));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 880;BA.debugLine="Dim BlockHeight As Float = (Parent.Height-g_WeekN";
Debug.JustUpdateDeviceLine();
_blockheight = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_parent.runMethod(true,"getHeight"),__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(6)}, "/",0, 0));Debug.locals.put("BlockHeight", _blockheight);Debug.locals.put("BlockHeight", _blockheight);
 BA.debugLineNum = 881;BA.debugLine="Dim BlockWidth As Float = IIf(m_ShowWeekNumbers,(";
Debug.JustUpdateDeviceLine();
_blockwidth = BA.numberCast(float.class, ((__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(7)}, "/",0, 0))) : ((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0)))));Debug.locals.put("BlockWidth", _blockwidth);Debug.locals.put("BlockWidth", _blockwidth);
 BA.debugLineNum = 883;BA.debugLine="If m_ShowWeekNumbers Then AddWeekName(Parent,-1,g";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, -(double) (0 + 1))),(Object)(__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Text" /*RemoteObject*/ )));};
 BA.debugLineNum = 884;BA.debugLine="AddWeekName(Parent,0,g_WeekNameShort.Monday)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Monday" /*RemoteObject*/ )));
 BA.debugLineNum = 885;BA.debugLine="AddWeekName(Parent,1,g_WeekNameShort.Tuesday)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Tuesday" /*RemoteObject*/ )));
 BA.debugLineNum = 886;BA.debugLine="AddWeekName(Parent,2,g_WeekNameShort.Wednesday)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Wednesday" /*RemoteObject*/ )));
 BA.debugLineNum = 887;BA.debugLine="AddWeekName(Parent,3,g_WeekNameShort.Thursday)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, 3)),(Object)(__ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Thursday" /*RemoteObject*/ )));
 BA.debugLineNum = 888;BA.debugLine="AddWeekName(Parent,4,g_WeekNameShort.Friday)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, 4)),(Object)(__ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Friday" /*RemoteObject*/ )));
 BA.debugLineNum = 889;BA.debugLine="AddWeekName(Parent,5,g_WeekNameShort.Saturday)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, 5)),(Object)(__ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Saturday" /*RemoteObject*/ )));
 BA.debugLineNum = 890;BA.debugLine="AddWeekName(Parent,6,g_WeekNameShort.Sunday)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addweekname" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(int.class, 6)),(Object)(__ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Sunday" /*RemoteObject*/ )));
 BA.debugLineNum = 892;BA.debugLine="Dim FirstDay As Long = GetFirstDayOfWeek2(Current";
Debug.JustUpdateDeviceLine();
_firstday = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getfirstdayofweek2" /*RemoteObject*/ ,(Object)(_currentdate),(Object)(__ref.getField(true,"_m_firstdayofweek" /*RemoteObject*/ )));Debug.locals.put("FirstDay", _firstday);Debug.locals.put("FirstDay", _firstday);
 BA.debugLineNum = 894;BA.debugLine="Dim CurrenMonth As Int = DateTime.GetMonth(Curren";
Debug.JustUpdateDeviceLine();
_currenmonth = as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currentdate));Debug.locals.put("CurrenMonth", _currenmonth);Debug.locals.put("CurrenMonth", _currenmonth);
 BA.debugLineNum = 896;BA.debugLine="Parent.Color = m_BodyColor";
Debug.JustUpdateDeviceLine();
_parent.runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 899;BA.debugLine="For i = 1 To 43 -1";
Debug.JustUpdateDeviceLine();
{
final int step15 = 1;
final int limit15 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(43),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15) ;_i = ((int)(0 + _i + step15))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 901;BA.debugLine="Dim CurrentDay As Long = FirstDay + DateTime.Tic";
Debug.JustUpdateDeviceLine();
_currentday = RemoteObject.solve(new RemoteObject[] {_firstday,as_datepicker.__c.getField(false,"DateTime").getField(true,"TicksPerDay"),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),as_datepicker.__c.getField(false,"DateTime").getField(true,"TicksPerHour")}, "+*+",2, 2);Debug.locals.put("CurrentDay", _currentday);Debug.locals.put("CurrentDay", _currentday);
 BA.debugLineNum = 903;BA.debugLine="Dim Rest As Int = (i-1)/7";
Debug.JustUpdateDeviceLine();
_rest = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(7)}, "/",0, 0));Debug.locals.put("Rest", _rest);Debug.locals.put("Rest", _rest);
 BA.debugLineNum = 904;BA.debugLine="Dim test As Int = (i-1) Mod 7";
Debug.JustUpdateDeviceLine();
_test = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(7)}, "%",0, 1);Debug.locals.put("test", _test);Debug.locals.put("test", _test);
 BA.debugLineNum = 906;BA.debugLine="Dim xpnl_Date As B4XView = xui.CreatePanel(\"xpnl";
Debug.JustUpdateDeviceLine();
_xpnl_date = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_date = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_MonthDate")));Debug.locals.put("xpnl_Date", _xpnl_date);Debug.locals.put("xpnl_Date", _xpnl_date);
 BA.debugLineNum = 907;BA.debugLine="xpnl_Date.Tag = CurrentDay";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(false,"setTag",(_currentday));
 BA.debugLineNum = 908;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent'm_BodyCo";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 909;BA.debugLine="Parent.AddView(xpnl_Date,IIf(m_ShowWeekNumbers,g";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_xpnl_date.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, ((__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((0))))),(RemoteObject.solve(new RemoteObject[] {_blockwidth,_test}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_blockheight,_rest}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(int.class, _blockwidth)),(Object)(BA.numberCast(int.class, _blockheight)));
 BA.debugLineNum = 910;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
Debug.JustUpdateDeviceLine();
_xlbl_date = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_date = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_Date", _xlbl_date);Debug.locals.put("xlbl_Date", _xlbl_date);
 BA.debugLineNum = 911;BA.debugLine="xlbl_Date.Tag = \"xlbl_Date\"";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(false,"setTag",RemoteObject.createImmutable(("xlbl_Date")));
 BA.debugLineNum = 912;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(false,"setFont",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 913;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setTextColor",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 914;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_date.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 915;BA.debugLine="xlbl_Date.Text = DateTime.GetDayOfMonth(CurrentD";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setText",BA.ObjectToCharSequence(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_currentday))));
 BA.debugLineNum = 918;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
Debug.JustUpdateDeviceLine();
_xpnl_date.runVoidMethod ("AddView",(Object)((_xlbl_date.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _blockwidth)),(Object)(BA.numberCast(int.class, _blockheight)));
 BA.debugLineNum = 920;BA.debugLine="If DateTime.GetMonth(CurrentDay) <> CurrenMonth";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currentday)),BA.numberCast(double.class, _currenmonth))) { 
 BA.debugLineNum = 921;BA.debugLine="If m_InactiveDaysVisible = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_inactivedaysvisible" /*RemoteObject*/ ),as_datepicker.__c.getField(true,"False"))) { 
 BA.debugLineNum = 922;BA.debugLine="xlbl_Date.Visible = False";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setVisible",as_datepicker.__c.getField(true,"False"));
 }else {
 BA.debugLineNum = 924;BA.debugLine="Dim Color() As Int = GetARGB(g_BodyProperties.";
Debug.JustUpdateDeviceLine();
_color = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getargb" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ )));Debug.locals.put("Color", _color);Debug.locals.put("Color", _color);
 BA.debugLineNum = 925;BA.debugLine="xlbl_Date.TextColor = xui.Color_ARGB(100,Color";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setTextColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 100)),(Object)(_color.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_color.getArrayElement(true,BA.numberCast(int.class, 2))),(Object)(_color.getArrayElement(true,BA.numberCast(int.class, 3)))));
 };
 };
 BA.debugLineNum = 929;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_currentday)))),as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ))))))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("<",as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_currentday)))),as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))))))))) { 
 BA.debugLineNum = 930;BA.debugLine="xlbl_Date.Visible = False";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setVisible",as_datepicker.__c.getField(true,"False"));
 };
 BA.debugLineNum = 935;BA.debugLine="CreateSelectDates(xpnl_Date,clr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createselectdates" /*RemoteObject*/ ,(Object)(_xpnl_date),(Object)(_clr));
 BA.debugLineNum = 937;BA.debugLine="If DateUtils.IsSameDay(DateTime.Now,CurrentDay)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(_currentday)),as_datepicker.__c.getField(true,"True")) && RemoteObject.solveBoolean("=",_xlbl_date.runMethod(true,"getVisible"),as_datepicker.__c.getField(true,"True"))) { 
 BA.debugLineNum = 938;BA.debugLine="Dim xpnl_CurrentDay As B4XView = xui.CreatePane";
Debug.JustUpdateDeviceLine();
_xpnl_currentday = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_currentday = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_CurrentDay", _xpnl_currentday);Debug.locals.put("xpnl_CurrentDay", _xpnl_currentday);
 BA.debugLineNum = 939;BA.debugLine="xpnl_CurrentDay.SetColorAndBorder(m_CurrentDate";
Debug.JustUpdateDeviceLine();
_xpnl_currentday.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_m_currentdatecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 940;BA.debugLine="xpnl_Date.AddView(xpnl_CurrentDay,BlockWidth/2";
Debug.JustUpdateDeviceLine();
_xpnl_date.runVoidMethod ("AddView",(Object)((_xpnl_currentday.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_blockwidth,RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_blockheight,RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 944;BA.debugLine="If m_ShowWeekNumbers = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ),as_datepicker.__c.getField(true,"True"))) { 
 BA.debugLineNum = 945;BA.debugLine="Dim xpnl_WeekNumber As B4XView = xui.CreatePane";
Debug.JustUpdateDeviceLine();
_xpnl_weeknumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_weeknumber = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_WeekNumber", _xpnl_weeknumber);Debug.locals.put("xpnl_WeekNumber", _xpnl_weeknumber);
 BA.debugLineNum = 946;BA.debugLine="Dim xlbl_WeekNumber As B4XView = CreateLabel(\"\"";
Debug.JustUpdateDeviceLine();
_xlbl_weeknumber = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_weeknumber = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_WeekNumber", _xlbl_weeknumber);Debug.locals.put("xlbl_WeekNumber", _xlbl_weeknumber);
 BA.debugLineNum = 947;BA.debugLine="Parent.AddView(xpnl_WeekNumber,0,g_WeekNameProp";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_xpnl_weeknumber.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_blockheight,_rest}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _blockheight)));
 BA.debugLineNum = 948;BA.debugLine="xpnl_WeekNumber.AddView(xlbl_WeekNumber,0,0,g_W";
Debug.JustUpdateDeviceLine();
_xpnl_weeknumber.runVoidMethod ("AddView",(Object)((_xlbl_weeknumber.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _blockheight)));
 BA.debugLineNum = 950;BA.debugLine="xpnl_WeekNumber.Color = g_WeekNumberProperties.";
Debug.JustUpdateDeviceLine();
_xpnl_weeknumber.runMethod(true,"setColor",__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Color" /*RemoteObject*/ ));
 BA.debugLineNum = 952;BA.debugLine="xlbl_WeekNumber.SetTextAlignment(\"CENTER\",\"CENT";
Debug.JustUpdateDeviceLine();
_xlbl_weeknumber.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 953;BA.debugLine="xlbl_WeekNumber.TextColor = g_WeekNumberPropert";
Debug.JustUpdateDeviceLine();
_xlbl_weeknumber.runMethod(true,"setTextColor",__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 954;BA.debugLine="xlbl_WeekNumber.Font = g_WeekNumberProperties.x";
Debug.JustUpdateDeviceLine();
_xlbl_weeknumber.runMethod(false,"setFont",__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 955;BA.debugLine="xlbl_WeekNumber.Text = GetWeekNumberStartingFro";
Debug.JustUpdateDeviceLine();
_xlbl_weeknumber.runMethod(true,"setText",BA.ObjectToCharSequence(__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getweeknumberstartingfrommonday" /*RemoteObject*/ ,(Object)(_currentday))));
 };
 BA.debugLineNum = 958;BA.debugLine="CustomDrawDay(CurrentDay,xpnl_Date)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_customdrawday" /*RemoteObject*/ ,(Object)(_currentday),(Object)(_xpnl_date));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 962;BA.debugLine="If m_ShowGridLines Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_m_showgridlines" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 963;BA.debugLine="Dim xpnl_CanvasBackground As B4XView = xui.Creat";
Debug.JustUpdateDeviceLine();
_xpnl_canvasbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_canvasbackground = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_CanvasBackground", _xpnl_canvasbackground);Debug.locals.put("xpnl_CanvasBackground", _xpnl_canvasbackground);
 BA.debugLineNum = 964;BA.debugLine="Parent.AddView(xpnl_CanvasBackground,0,0,Parent.";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_xpnl_canvasbackground.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_parent.runMethod(true,"getWidth")),(Object)(_parent.runMethod(true,"getHeight")));
 BA.debugLineNum = 965;BA.debugLine="xpnl_CanvasBackground.Color = xui.Color_Transpar";
Debug.JustUpdateDeviceLine();
_xpnl_canvasbackground.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 973;BA.debugLine="Dim xcv As B4XCanvas";
Debug.JustUpdateDeviceLine();
_xcv = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XCanvas");Debug.locals.put("xcv", _xcv);
 BA.debugLineNum = 974;BA.debugLine="xcv.Initialize(xpnl_CanvasBackground)";
Debug.JustUpdateDeviceLine();
_xcv.runVoidMethod ("Initialize",(Object)(_xpnl_canvasbackground));
 BA.debugLineNum = 975;BA.debugLine="xcv.ClearRect(xcv.TargetRect)";
Debug.JustUpdateDeviceLine();
_xcv.runVoidMethod ("ClearRect",(Object)(_xcv.runMethod(false,"getTargetRect")));
 BA.debugLineNum = 977;BA.debugLine="For i = 0 To 6 -1 'Add Divider Vertical";
Debug.JustUpdateDeviceLine();
{
final int step67 = 1;
final int limit67 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(6),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 978;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumber";
Debug.JustUpdateDeviceLine();
_xcv.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, ((__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((0))))),(RemoteObject.solve(new RemoteObject[] {_blockwidth,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, ((__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((0))))),(RemoteObject.solve(new RemoteObject[] {_blockwidth,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(float.class, _parent.runMethod(true,"getHeight"))),(Object)(__ref.getField(true,"_m_gridlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 980;BA.debugLine="If i < 5 Then xcv.DrawLine(0,g_WeekNameProperti";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 5))) { 
_xcv.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_blockheight,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0))}, "+",1, 0))),(Object)(BA.numberCast(float.class, _parent.runMethod(true,"getWidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ),(RemoteObject.solve(new RemoteObject[] {_blockheight,(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))}, "*",0, 0))}, "+",1, 0))),(Object)(__ref.getField(true,"_m_gridlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));};
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 983;BA.debugLine="xcv.DrawLine(IIf(m_ShowWeekNumbers,g_WeekNumberP";
Debug.JustUpdateDeviceLine();
_xcv.runVoidMethod ("DrawLine",(Object)(BA.numberCast(float.class, ((__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((0)))))),(Object)(__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _parent.runMethod(true,"getWidth"))),(Object)(__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_m_gridlinecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1))))));
 BA.debugLineNum = 985;BA.debugLine="xcv.Invalidate";
Debug.JustUpdateDeviceLine();
_xcv.runVoidMethod ("Invalidate");
 };
 BA.debugLineNum = 988;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addweekname(RemoteObject __ref,RemoteObject _xpnl_background,RemoteObject _i,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddWeekName (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,428);
if (RapidSub.canDelegate("addweekname")) { return __ref.runUserSub(false, "as_datepicker","addweekname", __ref, _xpnl_background, _i, _text);}
RemoteObject _blockheight = RemoteObject.createImmutable(0f);
RemoteObject _blockwidth = RemoteObject.createImmutable(0f);
RemoteObject _xlbl_weekname = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("xpnl_Background", _xpnl_background);
Debug.locals.put("i", _i);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 428;BA.debugLine="Private Sub AddWeekName(xpnl_Background As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 430;BA.debugLine="Dim BlockHeight As Float = g_WeekNameProperties.H";
Debug.JustUpdateDeviceLine();
_blockheight = __ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ );Debug.locals.put("BlockHeight", _blockheight);Debug.locals.put("BlockHeight", _blockheight);
 BA.debugLineNum = 431;BA.debugLine="Dim BlockWidth As Float = Floor(IIf(m_ShowWeekNum";
Debug.JustUpdateDeviceLine();
_blockwidth = BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"Floor",(Object)(BA.numberCast(double.class, ((__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ )}, "-",1, 0)),RemoteObject.createImmutable(7)}, "/",0, 0))) : (((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, -(double) (0 + 1)))) ? ((__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))) : ((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0))))))))));Debug.locals.put("BlockWidth", _blockwidth);Debug.locals.put("BlockWidth", _blockwidth);
 BA.debugLineNum = 433;BA.debugLine="Dim xlbl_WeekName As B4XView = CreateLabel(\"\")";
Debug.JustUpdateDeviceLine();
_xlbl_weekname = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_weekname = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_WeekName", _xlbl_weekname);Debug.locals.put("xlbl_WeekName", _xlbl_weekname);
 BA.debugLineNum = 435;BA.debugLine="xlbl_WeekName.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 436;BA.debugLine="xlbl_WeekName.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 437;BA.debugLine="If i = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 438;BA.debugLine="xlbl_WeekName.Color = g_WeekNumberProperties.Col";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runMethod(true,"setColor",__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Color" /*RemoteObject*/ ));
 BA.debugLineNum = 439;BA.debugLine="xlbl_WeekName.Font = g_WeekNumberProperties.xFon";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runMethod(false,"setFont",__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 440;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNumberProperties";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runMethod(true,"setTextColor",__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 442;BA.debugLine="xlbl_WeekName.Color = g_WeekNameProperties.Color";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runMethod(true,"setColor",__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"Color" /*RemoteObject*/ ));
 BA.debugLineNum = 443;BA.debugLine="xlbl_WeekName.Font = g_WeekNameProperties.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runMethod(false,"setFont",__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 444;BA.debugLine="xlbl_WeekName.TextColor = g_WeekNameProperties.T";
Debug.JustUpdateDeviceLine();
_xlbl_weekname.runMethod(true,"setTextColor",__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 447;BA.debugLine="xpnl_Background.AddView(xlbl_WeekName,IIf(i = -1,";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("AddView",(Object)((_xlbl_weekname.getObject())),(Object)(BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, -(double) (0 + 1)))) ? (RemoteObject.createImmutable((0))) : ((RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, ((__ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ ).<Boolean>get().booleanValue()) ? ((__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))) : (RemoteObject.createImmutable((0))))),(RemoteObject.solve(new RemoteObject[] {_blockwidth,_i}, "*",0, 0))}, "+",1, 0)))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",_i,BA.numberCast(double.class, -(double) (0 + 1)))) ? ((__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).getField(true,"Width" /*RemoteObject*/ ))) : ((_blockwidth))))),(Object)(BA.numberCast(int.class, _blockheight)));
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addyear(RemoteObject __ref,RemoteObject _parent,RemoteObject _currentdate) throws Exception{
try {
		Debug.PushSubsStack("AddYear (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,990);
if (RapidSub.canDelegate("addyear")) { return __ref.runUserSub(false, "as_datepicker","addyear", __ref, _parent, _currentdate);}
RemoteObject _blockheight = RemoteObject.createImmutable(0f);
RemoteObject _blockwidth = RemoteObject.createImmutable(0f);
int _i = 0;
RemoteObject _rest = RemoteObject.createImmutable(0);
RemoteObject _test = RemoteObject.createImmutable(0);
RemoteObject _text = RemoteObject.createImmutable("");
RemoteObject _xpnl_date = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _selectthispanel = RemoteObject.createImmutable(false);
RemoteObject _xlbl_date = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_current = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _strokewidth = RemoteObject.createImmutable(0f);
Debug.locals.put("Parent", _parent);
Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 990;BA.debugLine="Private Sub AddYear(Parent As B4XView,CurrentDate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 992;BA.debugLine="Dim BlockHeight As Float = xpnl_ViewPager.Height/";
Debug.JustUpdateDeviceLine();
_blockheight = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(4)}, "/",0, 0));Debug.locals.put("BlockHeight", _blockheight);Debug.locals.put("BlockHeight", _blockheight);
 BA.debugLineNum = 993;BA.debugLine="Dim BlockWidth As Float = xpnl_ViewPager.Width/3";
Debug.JustUpdateDeviceLine();
_blockwidth = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth"),RemoteObject.createImmutable(3)}, "/",0, 0));Debug.locals.put("BlockWidth", _blockwidth);Debug.locals.put("BlockWidth", _blockwidth);
 BA.debugLineNum = 995;BA.debugLine="Parent.Color = m_BodyColor";
Debug.JustUpdateDeviceLine();
_parent.runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 997;BA.debugLine="For i = 1 To 13 -1";
Debug.JustUpdateDeviceLine();
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(13),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 1 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1001;BA.debugLine="Dim Rest As Int = (i-1)/3";
Debug.JustUpdateDeviceLine();
_rest = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(3)}, "/",0, 0));Debug.locals.put("Rest", _rest);Debug.locals.put("Rest", _rest);
 BA.debugLineNum = 1002;BA.debugLine="Dim test As Int = (i-1) Mod 3";
Debug.JustUpdateDeviceLine();
_test = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(3)}, "%",0, 1);Debug.locals.put("test", _test);Debug.locals.put("test", _test);
 BA.debugLineNum = 1004;BA.debugLine="Dim Text As String = \"\"";
Debug.JustUpdateDeviceLine();
_text = BA.ObjectToString("");Debug.locals.put("Text", _text);Debug.locals.put("Text", _text);
 BA.debugLineNum = 1005;BA.debugLine="Dim xpnl_Date As B4XView";
Debug.JustUpdateDeviceLine();
_xpnl_date = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xpnl_Date", _xpnl_date);
 BA.debugLineNum = 1006;BA.debugLine="Dim SelectThisPanel As Boolean = False";
Debug.JustUpdateDeviceLine();
_selectthispanel = as_datepicker.__c.getField(true,"False");Debug.locals.put("SelectThisPanel", _selectthispanel);Debug.locals.put("SelectThisPanel", _selectthispanel);
 BA.debugLineNum = 1007;BA.debugLine="If m_CurrentView = getCurrentView_YearView Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1008;BA.debugLine="Text = GetMonthNameByIndex(i)";
Debug.JustUpdateDeviceLine();
_text = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getmonthnamebyindex" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)));Debug.locals.put("Text", _text);
 BA.debugLineNum = 1009;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_YearMonth\")";
Debug.JustUpdateDeviceLine();
_xpnl_date = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_YearMonth")));Debug.locals.put("xpnl_Date", _xpnl_date);
 BA.debugLineNum = 1010;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(false,"setTag",(as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate))),(Object)(BA.numberCast(int.class, _i)),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 1011;BA.debugLine="If DateTime.GetMonth(xpnl_Date.Tag) = DateTime.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"))))) && RemoteObject.solveBoolean("=",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")))))) { 
_selectthispanel = as_datepicker.__c.getField(true,"True");Debug.locals.put("SelectThisPanel", _selectthispanel);};
 BA.debugLineNum = 1013;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ))))) && RemoteObject.solveBoolean(">",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ ))))) && RemoteObject.solveBoolean("<",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ ))))))))) { 
 BA.debugLineNum = 1014;BA.debugLine="xpnl_Date.Visible = False";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(true,"setVisible",as_datepicker.__c.getField(true,"False"));
 };
 }else 
{ BA.debugLineNum = 1017;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeVie";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1018;BA.debugLine="Text = DateTime.GetYear(CurrentDate)+(i-1)";
Debug.JustUpdateDeviceLine();
_text = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1))}, "+",1, 1));Debug.locals.put("Text", _text);
 BA.debugLineNum = 1019;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_DecadeYear\")";
Debug.JustUpdateDeviceLine();
_xpnl_date = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_DecadeYear")));Debug.locals.put("xpnl_Date", _xpnl_date);
 BA.debugLineNum = 1020;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(false,"setTag",(as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(1)}, "+*",1, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 1021;BA.debugLine="If DateTime.GetYear(xpnl_Date.Tag) = DateTime.G";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")))))) { 
_selectthispanel = as_datepicker.__c.getField(true,"True");Debug.locals.put("SelectThisPanel", _selectthispanel);};
 BA.debugLineNum = 1023;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And ((DateT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("<",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))))))))))) { 
 BA.debugLineNum = 1024;BA.debugLine="xpnl_Date.Visible = False";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(true,"setVisible",as_datepicker.__c.getField(true,"False"));
 };
 }else 
{ BA.debugLineNum = 1027;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_centuryview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1028;BA.debugLine="Text = (DateTime.GetYear(CurrentDate)+(i-1)*10)";
Debug.JustUpdateDeviceLine();
_text = RemoteObject.concat((RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(10)}, "+*",1, 1)),RemoteObject.createImmutable(" - "),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(10)}, "+*",1, 1)),RemoteObject.createImmutable(9)}, "+",1, 1)));Debug.locals.put("Text", _text);
 BA.debugLineNum = 1029;BA.debugLine="xpnl_Date = xui.CreatePanel(\"xpnl_CenturyDecade";
Debug.JustUpdateDeviceLine();
_xpnl_date = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("xpnl_CenturyDecade")));Debug.locals.put("xpnl_Date", _xpnl_date);
 BA.debugLineNum = 1030;BA.debugLine="xpnl_Date.Tag = DateUtils.SetDate(DateTime.GetY";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(false,"setTag",(as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(10)}, "+*",1, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 1031;BA.debugLine="If DateTime.GetYear(DateTime.Now) >= (DateTime.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"))),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(10)}, "+*",1, 1)))) && RemoteObject.solveBoolean("k",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"))),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(10)}, "+*",1, 1)),RemoteObject.createImmutable(9)}, "+",1, 1))))) { 
_selectthispanel = as_datepicker.__c.getField(true,"True");Debug.locals.put("SelectThisPanel", _selectthispanel);};
 BA.debugLineNum = 1038;BA.debugLine="If (m_MaxDate > 0 Or m_MinDate > 0) And (DateTi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))))) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag")))),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ))))) || RemoteObject.solveBoolean("<",(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)),RemoteObject.createImmutable(10)}, "+*",1, 1)),RemoteObject.createImmutable(9)}, "+",1, 1)),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ ))))))))) { 
 BA.debugLineNum = 1039;BA.debugLine="xpnl_Date.Visible = False";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(true,"setVisible",as_datepicker.__c.getField(true,"False"));
 };
 }}}
;
 BA.debugLineNum = 1044;BA.debugLine="xpnl_Date.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_date.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 1045;BA.debugLine="Parent.AddView(xpnl_Date,BlockWidth*test,BlockHe";
Debug.JustUpdateDeviceLine();
_parent.runVoidMethod ("AddView",(Object)((_xpnl_date.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_blockwidth,_test}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_blockheight,_rest}, "*",0, 0))),(Object)(BA.numberCast(int.class, _blockwidth)),(Object)(BA.numberCast(int.class, _blockheight)));
 BA.debugLineNum = 1046;BA.debugLine="Dim xlbl_Date As B4XView = CreateLabel(\"\")";
Debug.JustUpdateDeviceLine();
_xlbl_date = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_date = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xlbl_Date", _xlbl_date);Debug.locals.put("xlbl_Date", _xlbl_date);
 BA.debugLineNum = 1048;BA.debugLine="xlbl_Date.Font = g_BodyProperties.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(false,"setFont",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 1049;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setTextColor",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 1050;BA.debugLine="xlbl_Date.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_date.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 1052;BA.debugLine="xlbl_Date.Text = Text";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setText",BA.ObjectToCharSequence(_text));
 BA.debugLineNum = 1054;BA.debugLine="xpnl_Date.AddView(xlbl_Date,0,0,BlockWidth,Block";
Debug.JustUpdateDeviceLine();
_xpnl_date.runVoidMethod ("AddView",(Object)((_xlbl_date.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _blockwidth)),(Object)(BA.numberCast(int.class, _blockheight)));
 BA.debugLineNum = 1056;BA.debugLine="If SelectThisPanel Then";
Debug.JustUpdateDeviceLine();
if (_selectthispanel.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1057;BA.debugLine="Dim xpnl_Current As B4XView = xui.CreatePanel(\"";
Debug.JustUpdateDeviceLine();
_xpnl_current = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_current = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Current", _xpnl_current);Debug.locals.put("xpnl_Current", _xpnl_current);
 BA.debugLineNum = 1058;BA.debugLine="Dim StrokeWidth As Float = 2dip";
Debug.JustUpdateDeviceLine();
_strokewidth = BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("StrokeWidth", _strokewidth);Debug.locals.put("StrokeWidth", _strokewidth);
 BA.debugLineNum = 1059;BA.debugLine="xpnl_Date.AddView(xpnl_Current,StrokeWidth,Stro";
Debug.JustUpdateDeviceLine();
_xpnl_date.runVoidMethod ("AddView",(Object)((_xpnl_current.getObject())),(Object)(BA.numberCast(int.class, _strokewidth)),(Object)(BA.numberCast(int.class, _strokewidth)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_blockwidth,_strokewidth,RemoteObject.createImmutable(2)}, "-*",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_blockheight,_strokewidth,RemoteObject.createImmutable(2)}, "-*",1, 0))));
 BA.debugLineNum = 1061;BA.debugLine="xpnl_Current.SetColorAndBorder(xui.Color_Transp";
Debug.JustUpdateDeviceLine();
_xpnl_current.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent")),(Object)(BA.numberCast(int.class, _strokewidth)),(Object)(__ref.getField(true,"_m_currentdatecolor" /*RemoteObject*/ )),(Object)(as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1065;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("base_resize")) { __ref.runUserSub(false, "as_datepicker","base_resize", __ref, _width, _height); return;}
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(null,__ref,_width,_height);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(b4a.example.ef.as_datepicker parent,RemoteObject __ref,RemoteObject _width,RemoteObject _height) {
this.parent = parent;
this.__ref = __ref;
this._width = _width;
this._height = _height;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;
RemoteObject _width;
RemoteObject _height;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,379);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 380;BA.debugLine="xiv_RefreshImage.SetLayoutAnimated(0,0,0,Width,He";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xiv_refreshimage" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, _height)));
 BA.debugLineNum = 381;BA.debugLine="xpnl_Header.SetLayoutAnimated(0,0,0,Width,g_Heade";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ))));
 BA.debugLineNum = 382;BA.debugLine="xpnl_ViewPager.SetLayoutAnimated(0,0,g_HeaderProp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _width)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ )}, "-",1, 0))));
 BA.debugLineNum = 383;BA.debugLine="xASVP_Main.Base_Resize(Width,xpnl_ViewPager.Heigh";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_base_resize" /*void*/ ,(Object)(_width),(Object)(BA.numberCast(double.class, __ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 386;BA.debugLine="xpnl_Header.GetView(0).SetLayoutAnimated(0,xpnl_H";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-*",1, 1)),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 387;BA.debugLine="xpnl_Header.GetView(1).SetLayoutAnimated(0,0,0,xp";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 388;BA.debugLine="xpnl_Header.GetView(2).SetLayoutAnimated(0,xpnl_H";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))).runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 390;BA.debugLine="xASVP_Main.ResetLazyLoadingPanels";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_resetlazyloadingpanels" /*RemoteObject*/ );
 BA.debugLineNum = 391;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "base_resize"),BA.numberCast(int.class, 0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 392;BA.debugLine="xASVP_Main.ResetLazyloadingIndex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_resetlazyloadingindex" /*RemoteObject*/ );
 BA.debugLineNum = 393;BA.debugLine="xASVP_Main.Commit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_commit" /*RemoteObject*/ );
 BA.debugLineNum = 394;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _changeview(RemoteObject __ref,RemoteObject _newview) throws Exception{
try {
		Debug.PushSubsStack("ChangeView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1067);
if (RapidSub.canDelegate("changeview")) { __ref.runUserSub(false, "as_datepicker","changeview", __ref, _newview); return;}
ResumableSub_ChangeView rsub = new ResumableSub_ChangeView(null,__ref,_newview);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ChangeView extends BA.ResumableSub {
public ResumableSub_ChangeView(b4a.example.ef.as_datepicker parent,RemoteObject __ref,RemoteObject _newview) {
this.parent = parent;
this.__ref = __ref;
this._newview = _newview;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;
RemoteObject _newview;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ChangeView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1067);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("NewView", _newview);
 BA.debugLineNum = 1068;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 1069;BA.debugLine="m_CurrentView = NewView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentview" /*RemoteObject*/ ,_newview);
 BA.debugLineNum = 1070;BA.debugLine="xASVP_Main.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 1071;BA.debugLine="Sleep(250)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "changeview"),BA.numberCast(int.class, 250));
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 BA.debugLineNum = 1072;BA.debugLine="Select Case NewView";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//select
this.state = 10;
switch (BA.switchObjectToInt(_newview,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_centuryview" /*RemoteObject*/ ))) {
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
 BA.debugLineNum = 1074;BA.debugLine="CreateMonthView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createmonthview" /*void*/ );
 if (true) break;

case 5:
//C
this.state = 10;
 BA.debugLineNum = 1076;BA.debugLine="CreateYearView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createyearview" /*void*/ );
 if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 1078;BA.debugLine="CreateDecadeView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createdecadeview" /*void*/ );
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1080;BA.debugLine="CreateCenturyView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createcenturyview" /*void*/ );
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1082;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(parent.__c.getField(true,"False")));
 BA.debugLineNum = 1083;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 133;BA.debugLine="Type ASDatePicker_MonthNameShort(January As Strin";
;
 //BA.debugLineNum = 134;BA.debugLine="Type ASDatePicker_WeekNameShort(Monday As String,";
;
 //BA.debugLineNum = 136;BA.debugLine="Type ASDatePicker_HeaderProperties(Height As Floa";
;
 //BA.debugLineNum = 137;BA.debugLine="Type ASDatePicker_BodyProperties(xFont As B4XFont";
;
 //BA.debugLineNum = 138;BA.debugLine="Type ASDatePicker_CustomDrawDay(BackgroundPanel A";
;
 //BA.debugLineNum = 139;BA.debugLine="Type ASDatePicker_CustomDrawHeader(BackgroundPane";
;
 //BA.debugLineNum = 140;BA.debugLine="Type ASDatePicker_WeekNumberProperties(Width As F";
;
 //BA.debugLineNum = 141;BA.debugLine="Type ASDatePicker_WeekNameProperties(Color As Int";
;
 //BA.debugLineNum = 143;BA.debugLine="Private mEventName As String 'ignore";
as_datepicker._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",as_datepicker._meventname);
 //BA.debugLineNum = 144;BA.debugLine="Private mCallBack As Object 'ignore";
as_datepicker._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",as_datepicker._mcallback);
 //BA.debugLineNum = 145;BA.debugLine="Public mBase As B4XView";
as_datepicker._mbase = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_mbase",as_datepicker._mbase);
 //BA.debugLineNum = 146;BA.debugLine="Private xui As XUI 'ignore";
as_datepicker._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",as_datepicker._xui);
 //BA.debugLineNum = 147;BA.debugLine="Public Tag As Object";
as_datepicker._tag = RemoteObject.createNew ("Object");__ref.setField("_tag",as_datepicker._tag);
 //BA.debugLineNum = 149;BA.debugLine="Private m_isReady As Boolean = False";
as_datepicker._m_isready = as_datepicker.__c.getField(true,"False");__ref.setField("_m_isready",as_datepicker._m_isready);
 //BA.debugLineNum = 151;BA.debugLine="Private g_HeaderProperties As ASDatePicker_Header";
as_datepicker._g_headerproperties = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_headerproperties");__ref.setField("_g_headerproperties",as_datepicker._g_headerproperties);
 //BA.debugLineNum = 152;BA.debugLine="Private g_BodyProperties As ASDatePicker_BodyProp";
as_datepicker._g_bodyproperties = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_bodyproperties");__ref.setField("_g_bodyproperties",as_datepicker._g_bodyproperties);
 //BA.debugLineNum = 154;BA.debugLine="Private g_MonthNameShort As ASDatePicker_MonthNam";
as_datepicker._g_monthnameshort = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_monthnameshort");__ref.setField("_g_monthnameshort",as_datepicker._g_monthnameshort);
 //BA.debugLineNum = 155;BA.debugLine="Private g_WeekNameShort As ASDatePicker_WeekNameS";
as_datepicker._g_weeknameshort = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_weeknameshort");__ref.setField("_g_weeknameshort",as_datepicker._g_weeknameshort);
 //BA.debugLineNum = 156;BA.debugLine="Private g_WeekNumberProperties As ASDatePicker_We";
as_datepicker._g_weeknumberproperties = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties");__ref.setField("_g_weeknumberproperties",as_datepicker._g_weeknumberproperties);
 //BA.debugLineNum = 157;BA.debugLine="Private g_WeekNameProperties As ASDatePicker_Week";
as_datepicker._g_weeknameproperties = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties");__ref.setField("_g_weeknameproperties",as_datepicker._g_weeknameproperties);
 //BA.debugLineNum = 159;BA.debugLine="Private xASVP_Main As ASViewPager";
as_datepicker._xasvp_main = RemoteObject.createNew ("b4a.example.ef.asviewpager");__ref.setField("_xasvp_main",as_datepicker._xasvp_main);
 //BA.debugLineNum = 161;BA.debugLine="Private xpnl_LoadingPanel As B4XView";
as_datepicker._xpnl_loadingpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_loadingpanel",as_datepicker._xpnl_loadingpanel);
 //BA.debugLineNum = 162;BA.debugLine="Private xpnl_Header As B4XView";
as_datepicker._xpnl_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_header",as_datepicker._xpnl_header);
 //BA.debugLineNum = 163;BA.debugLine="Private xpnl_ViewPager As B4XView";
as_datepicker._xpnl_viewpager = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_viewpager",as_datepicker._xpnl_viewpager);
 //BA.debugLineNum = 164;BA.debugLine="Private xpnl_SelectedDate As B4XView";
as_datepicker._xpnl_selecteddate = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_selecteddate",as_datepicker._xpnl_selecteddate);
 //BA.debugLineNum = 165;BA.debugLine="Private xpnl_SelectedDate2 As B4XView";
as_datepicker._xpnl_selecteddate2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xpnl_selecteddate2",as_datepicker._xpnl_selecteddate2);
 //BA.debugLineNum = 170;BA.debugLine="Private m_HeaderColor As Int";
as_datepicker._m_headercolor = RemoteObject.createImmutable(0);__ref.setField("_m_headercolor",as_datepicker._m_headercolor);
 //BA.debugLineNum = 171;BA.debugLine="Private m_BodyColor As Int";
as_datepicker._m_bodycolor = RemoteObject.createImmutable(0);__ref.setField("_m_bodycolor",as_datepicker._m_bodycolor);
 //BA.debugLineNum = 172;BA.debugLine="Private m_CurrentDateColor As Int";
as_datepicker._m_currentdatecolor = RemoteObject.createImmutable(0);__ref.setField("_m_currentdatecolor",as_datepicker._m_currentdatecolor);
 //BA.debugLineNum = 173;BA.debugLine="Private m_SelectedDateColor As Int";
as_datepicker._m_selecteddatecolor = RemoteObject.createImmutable(0);__ref.setField("_m_selecteddatecolor",as_datepicker._m_selecteddatecolor);
 //BA.debugLineNum = 174;BA.debugLine="Private m_MouseHoverFeedback As Boolean 'Ignore";
as_datepicker._m_mousehoverfeedback = RemoteObject.createImmutable(false);__ref.setField("_m_mousehoverfeedback",as_datepicker._m_mousehoverfeedback);
 //BA.debugLineNum = 175;BA.debugLine="Private m_SelectedDate As Long";
as_datepicker._m_selecteddate = RemoteObject.createImmutable(0L);__ref.setField("_m_selecteddate",as_datepicker._m_selecteddate);
 //BA.debugLineNum = 176;BA.debugLine="Private m_SelectedDate2 As Long";
as_datepicker._m_selecteddate2 = RemoteObject.createImmutable(0L);__ref.setField("_m_selecteddate2",as_datepicker._m_selecteddate2);
 //BA.debugLineNum = 177;BA.debugLine="Private m_ShowWeekNumbers As Boolean";
as_datepicker._m_showweeknumbers = RemoteObject.createImmutable(false);__ref.setField("_m_showweeknumbers",as_datepicker._m_showweeknumbers);
 //BA.debugLineNum = 178;BA.debugLine="Private m_FirstDayOfWeek As Int = 5 'Monday";
as_datepicker._m_firstdayofweek = BA.numberCast(int.class, 5);__ref.setField("_m_firstdayofweek",as_datepicker._m_firstdayofweek);
 //BA.debugLineNum = 179;BA.debugLine="Private m_ShowGridLines As Boolean";
as_datepicker._m_showgridlines = RemoteObject.createImmutable(false);__ref.setField("_m_showgridlines",as_datepicker._m_showgridlines);
 //BA.debugLineNum = 180;BA.debugLine="Private m_GridLineColor As Int";
as_datepicker._m_gridlinecolor = RemoteObject.createImmutable(0);__ref.setField("_m_gridlinecolor",as_datepicker._m_gridlinecolor);
 //BA.debugLineNum = 181;BA.debugLine="Private m_ThemeChangeTransition As String";
as_datepicker._m_themechangetransition = RemoteObject.createImmutable("");__ref.setField("_m_themechangetransition",as_datepicker._m_themechangetransition);
 //BA.debugLineNum = 183;BA.debugLine="Private m_CurrentView As String";
as_datepicker._m_currentview = RemoteObject.createImmutable("");__ref.setField("_m_currentview",as_datepicker._m_currentview);
 //BA.debugLineNum = 184;BA.debugLine="Private m_StartDate As Long";
as_datepicker._m_startdate = RemoteObject.createImmutable(0L);__ref.setField("_m_startdate",as_datepicker._m_startdate);
 //BA.debugLineNum = 185;BA.debugLine="Private m_InactiveDaysVisible As Boolean";
as_datepicker._m_inactivedaysvisible = RemoteObject.createImmutable(false);__ref.setField("_m_inactivedaysvisible",as_datepicker._m_inactivedaysvisible);
 //BA.debugLineNum = 186;BA.debugLine="Private m_MinDate,m_MaxDate As Long";
as_datepicker._m_mindate = RemoteObject.createImmutable(0L);__ref.setField("_m_mindate",as_datepicker._m_mindate);
as_datepicker._m_maxdate = RemoteObject.createImmutable(0L);__ref.setField("_m_maxdate",as_datepicker._m_maxdate);
 //BA.debugLineNum = 187;BA.debugLine="Private m_SelectMode As String";
as_datepicker._m_selectmode = RemoteObject.createImmutable("");__ref.setField("_m_selectmode",as_datepicker._m_selectmode);
 //BA.debugLineNum = 189;BA.debugLine="Private xiv_RefreshImage As B4XView";
as_datepicker._xiv_refreshimage = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_xiv_refreshimage",as_datepicker._xiv_refreshimage);
 //BA.debugLineNum = 191;BA.debugLine="Type AS_DatePicker_Theme(SelectedTextColor As Int";
;
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clearselections(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ClearSelections (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1405);
if (RapidSub.canDelegate("clearselections")) { return __ref.runUserSub(false, "as_datepicker","clearselections", __ref);}
 BA.debugLineNum = 1405;BA.debugLine="Public Sub ClearSelections";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1406;BA.debugLine="m_SelectedDate = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 1407;BA.debugLine="m_SelectedDate2 = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate2" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 1408;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasdatepicker_bodyproperties(RemoteObject __ref,RemoteObject _xfont,RemoteObject _textcolor,RemoteObject _selectedtextcolor,RemoteObject _currentandselecteddayheight) throws Exception{
try {
		Debug.PushSubsStack("CreateASDatePicker_BodyProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1956);
if (RapidSub.canDelegate("createasdatepicker_bodyproperties")) { return __ref.runUserSub(false, "as_datepicker","createasdatepicker_bodyproperties", __ref, _xfont, _textcolor, _selectedtextcolor, _currentandselecteddayheight);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_bodyproperties");
Debug.locals.put("xFont", _xfont);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("SelectedTextColor", _selectedtextcolor);
Debug.locals.put("CurrentAndSelectedDayHeight", _currentandselecteddayheight);
 BA.debugLineNum = 1956;BA.debugLine="Public Sub CreateASDatePicker_BodyProperties (xFon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1957;BA.debugLine="Dim t1 As ASDatePicker_BodyProperties";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_bodyproperties");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1958;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1959;BA.debugLine="t1.xFont = xFont";
Debug.JustUpdateDeviceLine();
_t1.setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 1960;BA.debugLine="t1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 1961;BA.debugLine="t1.SelectedTextColor = SelectedTextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("SelectedTextColor" /*RemoteObject*/ ,_selectedtextcolor);
 BA.debugLineNum = 1962;BA.debugLine="t1.CurrentAndSelectedDayHeight = CurrentAndSelect";
Debug.JustUpdateDeviceLine();
_t1.setField ("CurrentAndSelectedDayHeight" /*RemoteObject*/ ,_currentandselecteddayheight);
 BA.debugLineNum = 1963;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1964;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasdatepicker_headerproperties(RemoteObject __ref,RemoteObject _height,RemoteObject _xfont,RemoteObject _textcolor,RemoteObject _buttoniconsize,RemoteObject _arrowsvisible) throws Exception{
try {
		Debug.PushSubsStack("CreateASDatePicker_HeaderProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1935);
if (RapidSub.canDelegate("createasdatepicker_headerproperties")) { return __ref.runUserSub(false, "as_datepicker","createasdatepicker_headerproperties", __ref, _height, _xfont, _textcolor, _buttoniconsize, _arrowsvisible);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_headerproperties");
Debug.locals.put("Height", _height);
Debug.locals.put("xFont", _xfont);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("ButtonIconSize", _buttoniconsize);
Debug.locals.put("ArrowsVisible", _arrowsvisible);
 BA.debugLineNum = 1935;BA.debugLine="Public Sub CreateASDatePicker_HeaderProperties (He";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1936;BA.debugLine="Dim t1 As ASDatePicker_HeaderProperties";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_headerproperties");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1937;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1938;BA.debugLine="t1.Height = Height";
Debug.JustUpdateDeviceLine();
_t1.setField ("Height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 1939;BA.debugLine="t1.xFont = xFont";
Debug.JustUpdateDeviceLine();
_t1.setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 1940;BA.debugLine="t1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 1941;BA.debugLine="t1.ButtonIconSize = ButtonIconSize";
Debug.JustUpdateDeviceLine();
_t1.setField ("ButtonIconSize" /*RemoteObject*/ ,_buttoniconsize);
 BA.debugLineNum = 1942;BA.debugLine="t1.ArrowsVisible = ArrowsVisible";
Debug.JustUpdateDeviceLine();
_t1.setField ("ArrowsVisible" /*RemoteObject*/ ,_arrowsvisible);
 BA.debugLineNum = 1943;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1944;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasdatepicker_monthnameshort(RemoteObject __ref,RemoteObject _january,RemoteObject _february,RemoteObject _march,RemoteObject _april,RemoteObject _may,RemoteObject _june,RemoteObject _july,RemoteObject _august,RemoteObject _september,RemoteObject _october,RemoteObject _november,RemoteObject _december) throws Exception{
try {
		Debug.PushSubsStack("CreateASDatePicker_MonthNameShort (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1893);
if (RapidSub.canDelegate("createasdatepicker_monthnameshort")) { return __ref.runUserSub(false, "as_datepicker","createasdatepicker_monthnameshort", __ref, _january, _february, _march, _april, _may, _june, _july, _august, _september, _october, _november, _december);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_monthnameshort");
Debug.locals.put("January", _january);
Debug.locals.put("February", _february);
Debug.locals.put("March", _march);
Debug.locals.put("April", _april);
Debug.locals.put("May", _may);
Debug.locals.put("June", _june);
Debug.locals.put("July", _july);
Debug.locals.put("August", _august);
Debug.locals.put("September", _september);
Debug.locals.put("October", _october);
Debug.locals.put("November", _november);
Debug.locals.put("December", _december);
 BA.debugLineNum = 1893;BA.debugLine="Public Sub CreateASDatePicker_MonthNameShort (Janu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1894;BA.debugLine="Dim t1 As ASDatePicker_MonthNameShort";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_monthnameshort");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1895;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1896;BA.debugLine="t1.January = January";
Debug.JustUpdateDeviceLine();
_t1.setField ("January" /*RemoteObject*/ ,_january);
 BA.debugLineNum = 1897;BA.debugLine="t1.February = February";
Debug.JustUpdateDeviceLine();
_t1.setField ("February" /*RemoteObject*/ ,_february);
 BA.debugLineNum = 1898;BA.debugLine="t1.March = March";
Debug.JustUpdateDeviceLine();
_t1.setField ("March" /*RemoteObject*/ ,_march);
 BA.debugLineNum = 1899;BA.debugLine="t1.April = April";
Debug.JustUpdateDeviceLine();
_t1.setField ("April" /*RemoteObject*/ ,_april);
 BA.debugLineNum = 1900;BA.debugLine="t1.May = May";
Debug.JustUpdateDeviceLine();
_t1.setField ("May" /*RemoteObject*/ ,_may);
 BA.debugLineNum = 1901;BA.debugLine="t1.June = June";
Debug.JustUpdateDeviceLine();
_t1.setField ("June" /*RemoteObject*/ ,_june);
 BA.debugLineNum = 1902;BA.debugLine="t1.July = July";
Debug.JustUpdateDeviceLine();
_t1.setField ("July" /*RemoteObject*/ ,_july);
 BA.debugLineNum = 1903;BA.debugLine="t1.August = August";
Debug.JustUpdateDeviceLine();
_t1.setField ("August" /*RemoteObject*/ ,_august);
 BA.debugLineNum = 1904;BA.debugLine="t1.September = September";
Debug.JustUpdateDeviceLine();
_t1.setField ("September" /*RemoteObject*/ ,_september);
 BA.debugLineNum = 1905;BA.debugLine="t1.October = October";
Debug.JustUpdateDeviceLine();
_t1.setField ("October" /*RemoteObject*/ ,_october);
 BA.debugLineNum = 1906;BA.debugLine="t1.November = November";
Debug.JustUpdateDeviceLine();
_t1.setField ("November" /*RemoteObject*/ ,_november);
 BA.debugLineNum = 1907;BA.debugLine="t1.December = December";
Debug.JustUpdateDeviceLine();
_t1.setField ("December" /*RemoteObject*/ ,_december);
 BA.debugLineNum = 1908;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1909;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasdatepicker_weeknameproperties(RemoteObject __ref,RemoteObject _color,RemoteObject _xfont,RemoteObject _textcolor,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateASDatePicker_WeekNameProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1946);
if (RapidSub.canDelegate("createasdatepicker_weeknameproperties")) { return __ref.runUserSub(false, "as_datepicker","createasdatepicker_weeknameproperties", __ref, _color, _xfont, _textcolor, _height);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties");
Debug.locals.put("Color", _color);
Debug.locals.put("xFont", _xfont);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 1946;BA.debugLine="Public Sub CreateASDatePicker_WeekNameProperties (";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1947;BA.debugLine="Dim t1 As ASDatePicker_WeekNameProperties";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_weeknameproperties");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1948;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1949;BA.debugLine="t1.Color = Color";
Debug.JustUpdateDeviceLine();
_t1.setField ("Color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1950;BA.debugLine="t1.xFont = xFont";
Debug.JustUpdateDeviceLine();
_t1.setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 1951;BA.debugLine="t1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 1952;BA.debugLine="t1.Height = Height";
Debug.JustUpdateDeviceLine();
_t1.setField ("Height" /*RemoteObject*/ ,_height);
 BA.debugLineNum = 1953;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1954;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasdatepicker_weeknameshort(RemoteObject __ref,RemoteObject _monday,RemoteObject _tuesday,RemoteObject _wednesday,RemoteObject _thursday,RemoteObject _friday,RemoteObject _saturday,RemoteObject _sunday) throws Exception{
try {
		Debug.PushSubsStack("CreateASDatePicker_WeekNameShort (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1911);
if (RapidSub.canDelegate("createasdatepicker_weeknameshort")) { return __ref.runUserSub(false, "as_datepicker","createasdatepicker_weeknameshort", __ref, _monday, _tuesday, _wednesday, _thursday, _friday, _saturday, _sunday);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_weeknameshort");
Debug.locals.put("Monday", _monday);
Debug.locals.put("Tuesday", _tuesday);
Debug.locals.put("Wednesday", _wednesday);
Debug.locals.put("Thursday", _thursday);
Debug.locals.put("Friday", _friday);
Debug.locals.put("Saturday", _saturday);
Debug.locals.put("Sunday", _sunday);
 BA.debugLineNum = 1911;BA.debugLine="Public Sub CreateASDatePicker_WeekNameShort (Monda";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1912;BA.debugLine="Dim t1 As ASDatePicker_WeekNameShort";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_weeknameshort");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1913;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1914;BA.debugLine="t1.Monday = Monday";
Debug.JustUpdateDeviceLine();
_t1.setField ("Monday" /*RemoteObject*/ ,_monday);
 BA.debugLineNum = 1915;BA.debugLine="t1.Tuesday = Tuesday";
Debug.JustUpdateDeviceLine();
_t1.setField ("Tuesday" /*RemoteObject*/ ,_tuesday);
 BA.debugLineNum = 1916;BA.debugLine="t1.Wednesday = Wednesday";
Debug.JustUpdateDeviceLine();
_t1.setField ("Wednesday" /*RemoteObject*/ ,_wednesday);
 BA.debugLineNum = 1917;BA.debugLine="t1.Thursday = Thursday";
Debug.JustUpdateDeviceLine();
_t1.setField ("Thursday" /*RemoteObject*/ ,_thursday);
 BA.debugLineNum = 1918;BA.debugLine="t1.Friday = Friday";
Debug.JustUpdateDeviceLine();
_t1.setField ("Friday" /*RemoteObject*/ ,_friday);
 BA.debugLineNum = 1919;BA.debugLine="t1.Saturday = Saturday";
Debug.JustUpdateDeviceLine();
_t1.setField ("Saturday" /*RemoteObject*/ ,_saturday);
 BA.debugLineNum = 1920;BA.debugLine="t1.Sunday = Sunday";
Debug.JustUpdateDeviceLine();
_t1.setField ("Sunday" /*RemoteObject*/ ,_sunday);
 BA.debugLineNum = 1921;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1922;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createasdatepicker_weeknumberproperties(RemoteObject __ref,RemoteObject _width,RemoteObject _color,RemoteObject _xfont,RemoteObject _textcolor,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("CreateASDatePicker_WeekNumberProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1924);
if (RapidSub.canDelegate("createasdatepicker_weeknumberproperties")) { return __ref.runUserSub(false, "as_datepicker","createasdatepicker_weeknumberproperties", __ref, _width, _color, _xfont, _textcolor, _text);}
RemoteObject _t1 = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties");
Debug.locals.put("Width", _width);
Debug.locals.put("Color", _color);
Debug.locals.put("xFont", _xfont);
Debug.locals.put("TextColor", _textcolor);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 1924;BA.debugLine="Public Sub CreateASDatePicker_WeekNumberProperties";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1925;BA.debugLine="Dim t1 As ASDatePicker_WeekNumberProperties";
Debug.JustUpdateDeviceLine();
_t1 = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_weeknumberproperties");Debug.locals.put("t1", _t1);
 BA.debugLineNum = 1926;BA.debugLine="t1.Initialize";
Debug.JustUpdateDeviceLine();
_t1.runVoidMethod ("Initialize");
 BA.debugLineNum = 1927;BA.debugLine="t1.Width = Width";
Debug.JustUpdateDeviceLine();
_t1.setField ("Width" /*RemoteObject*/ ,_width);
 BA.debugLineNum = 1928;BA.debugLine="t1.Color = Color";
Debug.JustUpdateDeviceLine();
_t1.setField ("Color" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1929;BA.debugLine="t1.xFont = xFont";
Debug.JustUpdateDeviceLine();
_t1.setField ("xFont" /*RemoteObject*/ ,_xfont);
 BA.debugLineNum = 1930;BA.debugLine="t1.TextColor = TextColor";
Debug.JustUpdateDeviceLine();
_t1.setField ("TextColor" /*RemoteObject*/ ,_textcolor);
 BA.debugLineNum = 1931;BA.debugLine="t1.Text = Text";
Debug.JustUpdateDeviceLine();
_t1.setField ("Text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 1932;BA.debugLine="Return t1";
Debug.JustUpdateDeviceLine();
if (true) return _t1;
 BA.debugLineNum = 1933;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createcenturyview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateCenturyView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,805);
if (RapidSub.canDelegate("createcenturyview")) { __ref.runUserSub(false, "as_datepicker","createcenturyview", __ref); return;}
ResumableSub_CreateCenturyView rsub = new ResumableSub_CreateCenturyView(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateCenturyView extends BA.ResumableSub {
public ResumableSub_CreateCenturyView(b4a.example.ef.as_datepicker parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;
RemoteObject _currentcenturystart = RemoteObject.createImmutable(0L);
RemoteObject _p = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _firstdateofpast = RemoteObject.createImmutable(0L);
RemoteObject _startindex = RemoteObject.createImmutable(0);
RemoteObject _numberofcentries = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _xpnl_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _currenttime = RemoteObject.createImmutable(0L);
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateCenturyView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,805);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 808;BA.debugLine="Dim CurrentCenturyStart As Long = DateUtils.SetDa";
Debug.JustUpdateDeviceLine();
_currentcenturystart = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),RemoteObject.createImmutable(100)}, "/",0, 0)),(BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),RemoteObject.createImmutable(100)}, "/",0, 0))))}, "-",1, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)))}, "-",1, 2))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("CurrentCenturyStart", _currentcenturystart);Debug.locals.put("CurrentCenturyStart", _currentcenturystart);
 BA.debugLineNum = 811;BA.debugLine="Dim p As Period";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p", _p);
 BA.debugLineNum = 812;BA.debugLine="p.Initialize";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("Initialize");
 BA.debugLineNum = 814;BA.debugLine="Dim FirstDateOfPast As Long = DateUtils.SetDate(1";
Debug.JustUpdateDeviceLine();
_firstdateofpast = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FirstDateOfPast", _firstdateofpast);Debug.locals.put("FirstDateOfPast", _firstdateofpast);
 BA.debugLineNum = 816;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 10;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 817;BA.debugLine="If m_MinDate > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 818;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
Debug.JustUpdateDeviceLine();
_firstdateofpast = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ ))),RemoteObject.createImmutable(40)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FirstDateOfPast", _firstdateofpast);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 820;BA.debugLine="FirstDateOfPast = DateUtils.SetDate(DateTime.Ge";
Debug.JustUpdateDeviceLine();
_firstdateofpast = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ))),RemoteObject.createImmutable(40)}, "-",1, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FirstDateOfPast", _firstdateofpast);
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
 BA.debugLineNum = 837;BA.debugLine="Dim StartIndex As Int = 0";
Debug.JustUpdateDeviceLine();
_startindex = BA.numberCast(int.class, 0);Debug.locals.put("StartIndex", _startindex);Debug.locals.put("StartIndex", _startindex);
 BA.debugLineNum = 843;BA.debugLine="Dim NumberOfCentries As Int = 80";
Debug.JustUpdateDeviceLine();
_numberofcentries = BA.numberCast(int.class, 80);Debug.locals.put("NumberOfCentries", _numberofcentries);Debug.locals.put("NumberOfCentries", _numberofcentries);
 BA.debugLineNum = 844;BA.debugLine="If m_MinDate > 0 Or m_MaxDate > 0 Then NumberOfCe";
Debug.JustUpdateDeviceLine();
if (true) break;

case 11:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
_numberofcentries = BA.numberCast(int.class, 1);Debug.locals.put("NumberOfCentries", _numberofcentries);
if (true) break;

case 16:
//C
this.state = 17;
;
 BA.debugLineNum = 846;BA.debugLine="For i = 0 To NumberOfCentries -1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 17:
//for
this.state = 34;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_numberofcentries,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 19:
//C
this.state = 20;
 BA.debugLineNum = 848;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
Debug.JustUpdateDeviceLine();
_xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Background", _xpnl_background);Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 849;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_background.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 850;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 852;BA.debugLine="p.Years = i*10*12";
Debug.JustUpdateDeviceLine();
_p.setField ("Years",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(10),RemoteObject.createImmutable(12)}, "**",0, 1));
 BA.debugLineNum = 853;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(Fi";
Debug.JustUpdateDeviceLine();
_currenttime = parent._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(_firstdateofpast),(Object)(_p));Debug.locals.put("CurrentTime", _currenttime);Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 854;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 20:
//if
this.state = 27;
if (RemoteObject.solveBoolean(">",RemoteObject.createImmutable(_i),BA.numberCast(double.class, 0))) { 
this.state = 22;
}if (true) break;

case 22:
//C
this.state = 23;
 BA.debugLineNum = 855;BA.debugLine="CurrentTime = DateUtils.SetDate((DateTime.GetYe";
Debug.JustUpdateDeviceLine();
_currenttime = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),RemoteObject.createImmutable(100)}, "/",0, 0)),(BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),RemoteObject.createImmutable(100)}, "/",0, 0))))}, "-",1, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)))}, "-",1, 2)),RemoteObject.createImmutable(1)}, "+",1, 2))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 856;BA.debugLine="If DateTime.GetMonth(CurrentTime) = 1 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 23:
//if
this.state = 26;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currenttime)),BA.numberCast(double.class, 1))) { 
this.state = 25;
}if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 857;BA.debugLine="CurrentTime = DateUtils.SetDate(DateTime.GetYe";
Debug.JustUpdateDeviceLine();
_currenttime = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),parent.__c.runMethod(true,"Round",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),RemoteObject.createImmutable(100)}, "/",0, 0)),(BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),RemoteObject.createImmutable(100)}, "/",0, 0))))}, "-",1, 0)),RemoteObject.createImmutable(100)}, "*",0, 0)))}, "-",1, 2))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("CurrentTime", _currenttime);
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
 BA.debugLineNum = 862;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpage" /*RemoteObject*/ ,(Object)(_xpnl_background),(Object)((_currenttime)));
 BA.debugLineNum = 864;BA.debugLine="If DateTime.GetYear(CurrentCenturyStart) = DateT";
Debug.JustUpdateDeviceLine();
if (true) break;

case 28:
//if
this.state = 33;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentcenturystart)),BA.numberCast(double.class, parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime))))) { 
this.state = 30;
;}if (true) break;

case 30:
//C
this.state = 33;
_startindex = BA.numberCast(int.class, _i);Debug.locals.put("StartIndex", _startindex);
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 870;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "createcenturyview"),BA.numberCast(int.class, 0));
this.state = 37;
return;
case 37:
//C
this.state = -1;
;
 BA.debugLineNum = 871;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex2",_startindex);
 BA.debugLineNum = 872;BA.debugLine="xASVP_Main.Commit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_commit" /*RemoteObject*/ );
 BA.debugLineNum = 874;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _createdecadeview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateDecadeView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,745);
if (RapidSub.canDelegate("createdecadeview")) { __ref.runUserSub(false, "as_datepicker","createdecadeview", __ref); return;}
ResumableSub_CreateDecadeView rsub = new ResumableSub_CreateDecadeView(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateDecadeView extends BA.ResumableSub {
public ResumableSub_CreateDecadeView(b4a.example.ef.as_datepicker parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;
RemoteObject _currentdecade = RemoteObject.createImmutable(0L);
RemoteObject _yeargap = RemoteObject.createImmutable(0);
RemoteObject _startdate = RemoteObject.createImmutable(0L);
RemoteObject _firstdateoffuture = RemoteObject.createImmutable(0L);
RemoteObject _numberofdecades = RemoteObject.createImmutable(0);
RemoteObject _startindex = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _xpnl_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p2 = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _currenttime = RemoteObject.createImmutable(0L);
int step17;
int limit17;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateDecadeView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,745);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 751;BA.debugLine="Dim CurrentDecade As Long = DateUtils.SetDate(Dat";
Debug.JustUpdateDeviceLine();
_currentdecade = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)))))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("CurrentDecade", _currentdecade);Debug.locals.put("CurrentDecade", _currentdecade);
 BA.debugLineNum = 753;BA.debugLine="Dim YearGap As Int = 50";
Debug.JustUpdateDeviceLine();
_yeargap = BA.numberCast(int.class, 50);Debug.locals.put("YearGap", _yeargap);Debug.locals.put("YearGap", _yeargap);
 BA.debugLineNum = 755;BA.debugLine="Dim StartDate As Long";
Debug.JustUpdateDeviceLine();
_startdate = RemoteObject.createImmutable(0L);Debug.locals.put("StartDate", _startdate);
 BA.debugLineNum = 756;BA.debugLine="If m_MinDate = 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 757;BA.debugLine="StartDate =	DateUtils.SetDate(1400,12,31)";
Debug.JustUpdateDeviceLine();
_startdate = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(BA.numberCast(int.class, 1400)),(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 31)));Debug.locals.put("StartDate", _startdate);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 759;BA.debugLine="StartDate =	m_MinDate";
Debug.JustUpdateDeviceLine();
_startdate = __ref.getField(true,"_m_mindate" /*RemoteObject*/ );Debug.locals.put("StartDate", _startdate);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 762;BA.debugLine="Dim FirstDateOfFuture As Long";
Debug.JustUpdateDeviceLine();
_firstdateoffuture = RemoteObject.createImmutable(0L);Debug.locals.put("FirstDateOfFuture", _firstdateoffuture);
 BA.debugLineNum = 763;BA.debugLine="If m_MaxDate = 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 764;BA.debugLine="FirstDateOfFuture = DateUtils.SetDate(DateTime.G";
Debug.JustUpdateDeviceLine();
_firstdateoffuture = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),_yeargap}, "+",1, 1)),(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 31)));Debug.locals.put("FirstDateOfFuture", _firstdateoffuture);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 766;BA.debugLine="FirstDateOfFuture = m_MaxDate";
Debug.JustUpdateDeviceLine();
_firstdateoffuture = __ref.getField(true,"_m_maxdate" /*RemoteObject*/ );Debug.locals.put("FirstDateOfFuture", _firstdateoffuture);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 770;BA.debugLine="Dim NumberOfDecades As Int = Ceil(Max((MonthBetwe";
Debug.JustUpdateDeviceLine();
_numberofdecades = BA.numberCast(int.class, parent.__c.runMethod(true,"Ceil",(Object)(parent.__c.runMethod(true,"Max",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_monthbetween" /*RemoteObject*/ ,(Object)(_startdate),(Object)(_firstdateoffuture)),RemoteObject.createImmutable(12)}, "/",0, 0)),RemoteObject.createImmutable(10)}, "/",0, 0)),(Object)(BA.numberCast(double.class, 1))))));Debug.locals.put("NumberOfDecades", _numberofdecades);Debug.locals.put("NumberOfDecades", _numberofdecades);
 BA.debugLineNum = 772;BA.debugLine="Dim StartIndex As Int = 0";
Debug.JustUpdateDeviceLine();
_startindex = BA.numberCast(int.class, 0);Debug.locals.put("StartIndex", _startindex);Debug.locals.put("StartIndex", _startindex);
 BA.debugLineNum = 778;BA.debugLine="For i = 0 To NumberOfDecades -1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//for
this.state = 28;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_numberofdecades,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 780;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
Debug.JustUpdateDeviceLine();
_xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Background", _xpnl_background);Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 781;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_background.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 782;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 784;BA.debugLine="Dim p2 As Period";
Debug.JustUpdateDeviceLine();
_p2 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 785;BA.debugLine="p2.Initialize";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethod ("Initialize");
 BA.debugLineNum = 786;BA.debugLine="p2.Years = i*10";
Debug.JustUpdateDeviceLine();
_p2.setField ("Years",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(10)}, "*",0, 1));
 BA.debugLineNum = 788;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
Debug.JustUpdateDeviceLine();
_currenttime = parent._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(_startdate),(Object)(_p2));Debug.locals.put("CurrentTime", _currenttime);Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 791;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpage" /*RemoteObject*/ ,(Object)(_xpnl_background),(Object)((_currenttime)));
 BA.debugLineNum = 793;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("g",parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdecade)),BA.numberCast(double.class, parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)))) && RemoteObject.solveBoolean("k",parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdecade)),BA.numberCast(double.class, (RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),RemoteObject.createImmutable(11)}, "+",1, 1))))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
_startindex = BA.numberCast(int.class, _i);Debug.locals.put("StartIndex", _startindex);
if (true) break;

case 21:
//C
this.state = 22;
;
 BA.debugLineNum = 795;BA.debugLine="If DateTime.GetYear(CurrentDecade) >= DateTime.G";
Debug.JustUpdateDeviceLine();
if (true) break;

case 22:
//if
this.state = 27;
if (RemoteObject.solveBoolean("g",parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdecade)),BA.numberCast(double.class, parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime))))) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
_startindex = BA.numberCast(int.class, _i);Debug.locals.put("StartIndex", _startindex);
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 799;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "createdecadeview"),BA.numberCast(int.class, 0));
this.state = 31;
return;
case 31:
//C
this.state = -1;
;
 BA.debugLineNum = 800;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex2",_startindex);
 BA.debugLineNum = 801;BA.debugLine="xASVP_Main.Commit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_commit" /*RemoteObject*/ );
 BA.debugLineNum = 803;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _createheader(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateHeader (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,396);
if (RapidSub.canDelegate("createheader")) { return __ref.runUserSub(false, "as_datepicker","createheader", __ref);}
RemoteObject _xlbl_header = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_arrowleft = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_arrowright = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 396;BA.debugLine="Private Sub CreateHeader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 398;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_headercolor" /*RemoteObject*/ ));
 BA.debugLineNum = 400;BA.debugLine="Dim xlbl_Header As B4XView = CreateLabel(\"xlbl_He";
Debug.JustUpdateDeviceLine();
_xlbl_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_header = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("xlbl_Header")));Debug.locals.put("xlbl_Header", _xlbl_header);Debug.locals.put("xlbl_Header", _xlbl_header);
 BA.debugLineNum = 401;BA.debugLine="xpnl_Header.AddView(xlbl_Header,xpnl_Header.Heigh";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xlbl_header.getObject())),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "-*",1, 1)),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 403;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = CreateLabel(\"xlbl";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_arrowleft = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("xlbl_HeaderArrowLeft")));Debug.locals.put("xlbl_ArrowLeft", _xlbl_arrowleft);Debug.locals.put("xlbl_ArrowLeft", _xlbl_arrowleft);
 BA.debugLineNum = 404;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowLeft,0,0,xpnl_Heade";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xlbl_arrowleft.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 406;BA.debugLine="Dim xlbl_ArrowRight As B4XView = CreateLabel(\"xlb";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_arrowright = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createlabel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("xlbl_HeaderArrowRight")));Debug.locals.put("xlbl_ArrowRight", _xlbl_arrowright);Debug.locals.put("xlbl_ArrowRight", _xlbl_arrowright);
 BA.debugLineNum = 407;BA.debugLine="xpnl_Header.AddView(xlbl_ArrowRight,xpnl_Header.W";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((_xlbl_arrowright.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getWidth"),__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")}, "-",1, 1)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")),(Object)(__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 409;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ButtonIconSize" /*RemoteObject*/ ))));
 BA.debugLineNum = 410;BA.debugLine="xlbl_ArrowLeft.Text = Chr(0xE314)";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runMethod(true,"setText",BA.ObjectToCharSequence(as_datepicker.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe314))))));
 BA.debugLineNum = 411;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runMethod(true,"setTextColor",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 412;BA.debugLine="xlbl_ArrowLeft.SetTextAlignment(\"CENTER\",\"CENTER\"";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 413;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runMethod(true,"setVisible",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ArrowsVisible" /*RemoteObject*/ ));
 BA.debugLineNum = 415;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ButtonIconSize" /*RemoteObject*/ ))));
 BA.debugLineNum = 416;BA.debugLine="xlbl_ArrowRight.Text = Chr(0xE315)";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runMethod(true,"setText",BA.ObjectToCharSequence(as_datepicker.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, ((int)0xe315))))));
 BA.debugLineNum = 417;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runMethod(true,"setTextColor",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 418;BA.debugLine="xlbl_ArrowRight.SetTextAlignment(\"CENTER\",\"CENTER";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 419;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runMethod(true,"setVisible",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ArrowsVisible" /*RemoteObject*/ ));
 BA.debugLineNum = 421;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(false,"setFont",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 422;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(m_Start";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(as_datepicker._dateutils.runMethod(true,"_getmonthname",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),RemoteObject.createImmutable(" "),as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))))));
 BA.debugLineNum = 423;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(true,"setTextColor",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 424;BA.debugLine="xlbl_Header.SetTextAlignment(\"CENTER\",\"CENTER\")";
Debug.JustUpdateDeviceLine();
_xlbl_header.runVoidMethod ("SetTextAlignment",(Object)(BA.ObjectToString("CENTER")),(Object)(RemoteObject.createImmutable("CENTER")));
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimageview(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateImageView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1882);
if (RapidSub.canDelegate("createimageview")) { return __ref.runUserSub(false, "as_datepicker","createimageview", __ref, _eventname);}
RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 1882;BA.debugLine="Private Sub CreateImageView(EventName As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1883;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 1884;BA.debugLine="iv.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 1885;BA.debugLine="Return iv";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _iv.getObject());
 BA.debugLineNum = 1886;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1793);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "as_datepicker","createlabel", __ref, _eventname);}
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 1793;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1794;BA.debugLine="Dim lbl As Label";
Debug.JustUpdateDeviceLine();
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1795;BA.debugLine="lbl.Initialize(EventName)";
Debug.JustUpdateDeviceLine();
_lbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(_eventname));
 BA.debugLineNum = 1796;BA.debugLine="Return lbl";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), _lbl.getObject());
 BA.debugLineNum = 1797;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createmonthview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateMonthView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,547);
if (RapidSub.canDelegate("createmonthview")) { __ref.runUserSub(false, "as_datepicker","createmonthview", __ref); return;}
ResumableSub_CreateMonthView rsub = new ResumableSub_CreateMonthView(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateMonthView extends BA.ResumableSub {
public ResumableSub_CreateMonthView(b4a.example.ef.as_datepicker parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;
RemoteObject _startindex = RemoteObject.createImmutable(0);
RemoteObject _yeargap = RemoteObject.createImmutable(0);
RemoteObject _startdate = RemoteObject.createImmutable(0L);
RemoteObject _enddate = RemoteObject.createImmutable(0L);
RemoteObject _numberofmonths = RemoteObject.createImmutable(0);
RemoteObject _monthsbetween = RemoteObject.createImmutable(0);
RemoteObject _tmp = RemoteObject.declareNull("b4a.example.dateutils._period");
int _i = 0;
RemoteObject _xpnl_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p2 = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _currenttime = RemoteObject.createImmutable(0L);
RemoteObject _firstdayofmonth = RemoteObject.createImmutable(0L);
int step15;
int limit15;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateMonthView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,547);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 549;BA.debugLine="Dim StartIndex As Int = 0";
Debug.JustUpdateDeviceLine();
_startindex = BA.numberCast(int.class, 0);Debug.locals.put("StartIndex", _startindex);Debug.locals.put("StartIndex", _startindex);
 BA.debugLineNum = 550;BA.debugLine="Dim YearGap As Int = 1";
Debug.JustUpdateDeviceLine();
_yeargap = BA.numberCast(int.class, 1);Debug.locals.put("YearGap", _yeargap);Debug.locals.put("YearGap", _yeargap);
 BA.debugLineNum = 551;BA.debugLine="Dim StartDate As Long = DateUtils.SetDate(DateTim";
Debug.JustUpdateDeviceLine();
_startdate = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),_yeargap}, "-",1, 1)),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("StartDate", _startdate);Debug.locals.put("StartDate", _startdate);
 BA.debugLineNum = 552;BA.debugLine="Dim Enddate As Long = DateUtils.SetDate(DateTime.";
Debug.JustUpdateDeviceLine();
_enddate = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),_yeargap}, "+",1, 1)),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("Enddate", _enddate);Debug.locals.put("Enddate", _enddate);
 BA.debugLineNum = 554;BA.debugLine="If m_MinDate > 0 Then StartDate = m_MinDate";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
_startdate = __ref.getField(true,"_m_mindate" /*RemoteObject*/ );Debug.locals.put("StartDate", _startdate);
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 555;BA.debugLine="Dim NumberOfMonths As Int = IIf(m_MaxDate=0, Mont";
Debug.JustUpdateDeviceLine();
_numberofmonths = BA.numberCast(int.class, ((RemoteObject.solveBoolean("=",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) ? ((__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_monthbetween" /*RemoteObject*/ ,(Object)(_startdate),(Object)(_enddate)))) : (RemoteObject.createImmutable((0)))));Debug.locals.put("NumberOfMonths", _numberofmonths);Debug.locals.put("NumberOfMonths", _numberofmonths);
 BA.debugLineNum = 557;BA.debugLine="If m_MaxDate > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 558;BA.debugLine="Dim MonthsBetween As Int = MonthBetween(StartDat";
Debug.JustUpdateDeviceLine();
_monthsbetween = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_monthbetween" /*RemoteObject*/ ,(Object)(_startdate),(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )));Debug.locals.put("MonthsBetween", _monthsbetween);Debug.locals.put("MonthsBetween", _monthsbetween);
 BA.debugLineNum = 559;BA.debugLine="Dim tmp As Period";
Debug.JustUpdateDeviceLine();
_tmp = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 560;BA.debugLine="tmp.Initialize";
Debug.JustUpdateDeviceLine();
_tmp.runVoidMethod ("Initialize");
 BA.debugLineNum = 561;BA.debugLine="tmp.Months = MonthsBetween";
Debug.JustUpdateDeviceLine();
_tmp.setField ("Months",_monthsbetween);
 BA.debugLineNum = 562;BA.debugLine="If DateUtils.AddPeriod(StartDate,tmp) < m_MaxDat";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("<",parent._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(_startdate),(Object)(_tmp)),__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
_monthsbetween = RemoteObject.solve(new RemoteObject[] {_monthsbetween,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("MonthsBetween", _monthsbetween);
if (true) break;

case 15:
//C
this.state = 16;
;
 BA.debugLineNum = 563;BA.debugLine="NumberOfMonths = Max(MonthsBetween,1)";
Debug.JustUpdateDeviceLine();
_numberofmonths = BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _monthsbetween)),(Object)(BA.numberCast(double.class, 1))));Debug.locals.put("NumberOfMonths", _numberofmonths);
 if (true) break;
;
 BA.debugLineNum = 566;BA.debugLine="For i = 0 To NumberOfMonths -1";
Debug.JustUpdateDeviceLine();

case 16:
//for
this.state = 25;
step15 = 1;
limit15 = RemoteObject.solve(new RemoteObject[] {_numberofmonths,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 18:
//C
this.state = 19;
 BA.debugLineNum = 568;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
Debug.JustUpdateDeviceLine();
_xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Background", _xpnl_background);Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 569;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_background.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 570;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 572;BA.debugLine="Dim p2 As Period";
Debug.JustUpdateDeviceLine();
_p2 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 573;BA.debugLine="p2.Initialize";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethod ("Initialize");
 BA.debugLineNum = 574;BA.debugLine="p2.Months = i";
Debug.JustUpdateDeviceLine();
_p2.setField ("Months",BA.numberCast(int.class, _i));
 BA.debugLineNum = 576;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
Debug.JustUpdateDeviceLine();
_currenttime = parent._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(_startdate),(Object)(_p2));Debug.locals.put("CurrentTime", _currenttime);Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 577;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate(";
Debug.JustUpdateDeviceLine();
_firstdayofmonth = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime))),(Object)(parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currenttime))),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FirstDayOfMonth", _firstdayofmonth);Debug.locals.put("FirstDayOfMonth", _firstdayofmonth);
 BA.debugLineNum = 579;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfMon";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpage" /*RemoteObject*/ ,(Object)(_xpnl_background),(Object)((_firstdayofmonth)));
 BA.debugLineNum = 581;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
Debug.JustUpdateDeviceLine();
if (true) break;

case 19:
//if
this.state = 24;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),BA.numberCast(double.class, parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)))) && RemoteObject.solveBoolean("=",parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),BA.numberCast(double.class, parent.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currenttime))))) { 
this.state = 21;
;}if (true) break;

case 21:
//C
this.state = 24;
_startindex = BA.numberCast(int.class, _i);Debug.locals.put("StartIndex", _startindex);
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 587;BA.debugLine="Sleep(250)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "createmonthview"),BA.numberCast(int.class, 250));
this.state = 28;
return;
case 28:
//C
this.state = -1;
;
 BA.debugLineNum = 592;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex2",_startindex);
 BA.debugLineNum = 593;BA.debugLine="xASVP_Main.Commit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_commit" /*RemoteObject*/ );
 BA.debugLineNum = 595;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "createmonthview"),BA.numberCast(int.class, 0));
this.state = 29;
return;
case 29:
//C
this.state = -1;
;
 BA.debugLineNum = 596;BA.debugLine="m_isReady = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_isready" /*RemoteObject*/ ,parent.__c.getField(true,"True"));
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _createselectdates(RemoteObject __ref,RemoteObject _xpnl_date,RemoteObject _clr) throws Exception{
try {
		Debug.PushSubsStack("CreateSelectDates (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1126);
if (RapidSub.canDelegate("createselectdates")) { return __ref.runUserSub(false, "as_datepicker","createselectdates", __ref, _xpnl_date, _clr);}
RemoteObject _xlbl_date = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _view = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _currentday = RemoteObject.createImmutable(0L);
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_selected = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("xpnl_Date", _xpnl_date);
Debug.locals.put("clr", _clr);
 BA.debugLineNum = 1126;BA.debugLine="Private Sub CreateSelectDates(xpnl_Date As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1128;BA.debugLine="Dim xlbl_Date As B4XView";
Debug.JustUpdateDeviceLine();
_xlbl_date = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xlbl_Date", _xlbl_date);
 BA.debugLineNum = 1129;BA.debugLine="For Each View As B4XView In xpnl_Date.GetAllViews";
Debug.JustUpdateDeviceLine();
_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group2 = _xpnl_date.runMethod(false,"GetAllViewsRecursive");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_view = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group2.runMethod(false,"Get",index2));Debug.locals.put("View", _view);
Debug.locals.put("View", _view);
 BA.debugLineNum = 1130;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("xlbl_Date"),BA.ObjectToString(_view.runMethod(false,"getTag")))) { 
_xlbl_date = _view;Debug.locals.put("xlbl_Date", _xlbl_date);};
 }
}Debug.locals.put("View", _view);
;
 BA.debugLineNum = 1132;BA.debugLine="Dim CurrentDay As Long = xpnl_Date.Tag";
Debug.JustUpdateDeviceLine();
_currentday = BA.numberCast(long.class, _xpnl_date.runMethod(false,"getTag"));Debug.locals.put("CurrentDay", _currentday);Debug.locals.put("CurrentDay", _currentday);
 BA.debugLineNum = 1134;BA.debugLine="If m_SelectMode = \"Range\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Range"))) { 
 BA.debugLineNum = 1135;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ )))) && RemoteObject.solveBoolean(".",_xlbl_date.runMethod(true,"getVisible"))) { 
 BA.debugLineNum = 1136;BA.debugLine="CreateSelectedDate(xpnl_Date,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createselecteddate" /*RemoteObject*/ ,(Object)(_xpnl_date),(Object)(as_datepicker.__c.getField(true,"True")));
 }else 
{ BA.debugLineNum = 1137;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Selecte";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ )))) && RemoteObject.solveBoolean(".",_xlbl_date.runMethod(true,"getVisible"))) { 
 BA.debugLineNum = 1138;BA.debugLine="CreateSelectedDate(xpnl_Date,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createselecteddate" /*RemoteObject*/ ,(Object)(_xpnl_date),(Object)(as_datepicker.__c.getField(true,"False")));
 }}
;
 BA.debugLineNum = 1141;BA.debugLine="For Each v As B4XView In xpnl_Date.GetAllViewsRe";
Debug.JustUpdateDeviceLine();
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group12 = _xpnl_date.runMethod(false,"GetAllViewsRecursive");
final int groupLen12 = group12.runMethod(true,"getSize").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_v = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group12.runMethod(false,"Get",index12));Debug.locals.put("v", _v);
Debug.locals.put("v", _v);
 BA.debugLineNum = 1142;BA.debugLine="If \"RangeItem\" = v.Tag Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("RangeItem"),BA.ObjectToString(_v.runMethod(false,"getTag")))) { 
 BA.debugLineNum = 1143;BA.debugLine="v.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
_v.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 1144;BA.debugLine="Exit";
Debug.JustUpdateDeviceLine();
if (true) break;
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 1148;BA.debugLine="If m_SelectedDate > 0 And m_SelectedDate2 > 0 An";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("g",_currentday,__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ )) && RemoteObject.solveBoolean("k",_currentday,__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ ))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ )))) || RemoteObject.solveBoolean(".",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ ))))))))))) { 
 BA.debugLineNum = 1149;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
Debug.JustUpdateDeviceLine();
_xpnl_selected = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_selected = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_selected", _xpnl_selected);Debug.locals.put("xpnl_selected", _xpnl_selected);
 BA.debugLineNum = 1150;BA.debugLine="xpnl_selected.Tag = \"RangeItem\"";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runMethod(false,"setTag",RemoteObject.createImmutable(("RangeItem")));
 BA.debugLineNum = 1151;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDat";
Debug.JustUpdateDeviceLine();
if (as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1152;BA.debugLine="xpnl_Date.AddView(xpnl_selected,xpnl_Date.Widt";
Debug.JustUpdateDeviceLine();
_xpnl_date.runVoidMethod ("AddView",(Object)((_xpnl_selected.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_date.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_date.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_date.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))));
 }else 
{ BA.debugLineNum = 1153;BA.debugLine="Else If DateUtils.IsSameDay(CurrentDay,m_Select";
Debug.JustUpdateDeviceLine();
if (as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ ))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1154;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
Debug.JustUpdateDeviceLine();
_xpnl_date.runVoidMethod ("AddView",(Object)((_xpnl_selected.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_date.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_date.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))));
 }else {
 BA.debugLineNum = 1156;BA.debugLine="xpnl_Date.AddView(xpnl_selected,0,xpnl_Date.He";
Debug.JustUpdateDeviceLine();
_xpnl_date.runVoidMethod ("AddView",(Object)((_xpnl_selected.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_date.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(_xpnl_date.runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))));
 }}
;
 BA.debugLineNum = 1159;BA.debugLine="xpnl_selected.Color = xui.Color_ARGB(80,clr(1),";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(_clr.getArrayElement(true,BA.numberCast(int.class, 1))),(Object)(_clr.getArrayElement(true,BA.numberCast(int.class, 2))),(Object)(_clr.getArrayElement(true,BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 1160;BA.debugLine="xpnl_selected.SendToBack";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runVoidMethod ("SendToBack");
 };
 }else {
 BA.debugLineNum = 1164;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ )))) && RemoteObject.solveBoolean("=",_xlbl_date.runMethod(true,"getVisible"),as_datepicker.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1165;BA.debugLine="MonthDateClick(xpnl_Date,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_monthdateclick" /*RemoteObject*/ ,(Object)(_xpnl_date),(Object)(as_datepicker.__c.getField(true,"False")));
 };
 };
 BA.debugLineNum = 1170;BA.debugLine="If DateUtils.IsSameDay(CurrentDay,m_SelectedDate)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ )))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getselectmode_range" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(_currentday),(Object)(__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ )))))))) { 
 BA.debugLineNum = 1171;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedT";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setTextColor",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"SelectedTextColor" /*RemoteObject*/ ));
 }else {
 BA.debugLineNum = 1173;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.TextColor";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setTextColor",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 1177;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createselecteddate(RemoteObject __ref,RemoteObject _xpnl_monthdate,RemoteObject _firstdatepanel) throws Exception{
try {
		Debug.PushSubsStack("CreateSelectedDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1749);
if (RapidSub.canDelegate("createselecteddate")) { return __ref.runUserSub(false, "as_datepicker","createselecteddate", __ref, _xpnl_monthdate, _firstdatepanel);}
RemoteObject _view = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_selected = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("xpnl_MonthDate", _xpnl_monthdate);
Debug.locals.put("FirstDatePanel", _firstdatepanel);
 BA.debugLineNum = 1749;BA.debugLine="Private Sub CreateSelectedDate(xpnl_MonthDate As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1751;BA.debugLine="If FirstDatePanel Then";
Debug.JustUpdateDeviceLine();
if (_firstdatepanel.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1752;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedDa";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 1753;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate.P";
Debug.JustUpdateDeviceLine();
_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group3 = __ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(false,"GetAllViewsRecursive");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_view = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group3.runMethod(false,"Get",index3));Debug.locals.put("View", _view);
Debug.locals.put("View", _view);
 BA.debugLineNum = 1754;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("xlbl_Date"),BA.ObjectToString(_view.runMethod(false,"getTag")))) { 
_view.runMethod(true,"setTextColor",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));};
 }
}Debug.locals.put("View", _view);
;
 BA.debugLineNum = 1756;BA.debugLine="xpnl_SelectedDate.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 1758;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
Debug.JustUpdateDeviceLine();
_xpnl_selected = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_selected = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_selected", _xpnl_selected);Debug.locals.put("xpnl_selected", _xpnl_selected);
 BA.debugLineNum = 1759;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
Debug.JustUpdateDeviceLine();
_xpnl_monthdate.runVoidMethod ("AddView",(Object)((_xpnl_selected.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_monthdate.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_monthdate.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))));
 BA.debugLineNum = 1760;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_m_selecteddatecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 1761;BA.debugLine="xpnl_selected.SendToBack";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runVoidMethod ("SendToBack");
 BA.debugLineNum = 1762;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_selecteddate" /*RemoteObject*/ ,_xpnl_selected);
 BA.debugLineNum = 1763;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate" /*RemoteObject*/ ,BA.numberCast(long.class, _xpnl_monthdate.runMethod(false,"getTag")));
 }else {
 BA.debugLineNum = 1765;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_SelectedD";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean(".",__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(true,"IsInitialized"))) { 
 BA.debugLineNum = 1766;BA.debugLine="For Each View As B4XView In xpnl_SelectedDate2.";
Debug.JustUpdateDeviceLine();
_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group16 = __ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runMethod(false,"getParent").runMethod(false,"GetAllViewsRecursive");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_view = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group16.runMethod(false,"Get",index16));Debug.locals.put("View", _view);
Debug.locals.put("View", _view);
 BA.debugLineNum = 1767;BA.debugLine="If \"xlbl_Date\" = View.Tag Then View.TextColor";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("xlbl_Date"),BA.ObjectToString(_view.runMethod(false,"getTag")))) { 
_view.runMethod(true,"setTextColor",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));};
 }
}Debug.locals.put("View", _view);
;
 BA.debugLineNum = 1769;BA.debugLine="xpnl_SelectedDate2.RemoveViewFromParent";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 1771;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(\"";
Debug.JustUpdateDeviceLine();
_xpnl_selected = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_selected = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_selected", _xpnl_selected);Debug.locals.put("xpnl_selected", _xpnl_selected);
 BA.debugLineNum = 1772;BA.debugLine="xpnl_MonthDate.AddView(xpnl_selected,xpnl_MonthD";
Debug.JustUpdateDeviceLine();
_xpnl_monthdate.runVoidMethod ("AddView",(Object)((_xpnl_selected.getObject())),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_monthdate.runMethod(true,"getWidth"),RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_xpnl_monthdate.runMethod(true,"getHeight"),RemoteObject.createImmutable(2),__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/-/",1, 0))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ))));
 BA.debugLineNum = 1773;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateCo";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_m_selecteddatecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"CurrentAndSelectedDayHeight" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 1774;BA.debugLine="xpnl_selected.SendToBack";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runVoidMethod ("SendToBack");
 BA.debugLineNum = 1775;BA.debugLine="xpnl_SelectedDate2 = xpnl_selected";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_selecteddate2" /*RemoteObject*/ ,_xpnl_selected);
 };
 BA.debugLineNum = 1778;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _createyearview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateYearView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,681);
if (RapidSub.canDelegate("createyearview")) { __ref.runUserSub(false, "as_datepicker","createyearview", __ref); return;}
ResumableSub_CreateYearView rsub = new ResumableSub_CreateYearView(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_CreateYearView extends BA.ResumableSub {
public ResumableSub_CreateYearView(b4a.example.ef.as_datepicker parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;
RemoteObject _yeargap = RemoteObject.createImmutable(0);
RemoteObject _startdate = RemoteObject.createImmutable(0L);
RemoteObject _firstdateoffuture = RemoteObject.createImmutable(0L);
RemoteObject _numberofyears = RemoteObject.createImmutable(0);
RemoteObject _yearsbetween = RemoteObject.createImmutable(0);
RemoteObject _startindex = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _xpnl_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p2 = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _currenttime = RemoteObject.createImmutable(0L);
int step17;
int limit17;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("CreateYearView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,681);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 683;BA.debugLine="Dim YearGap As Int = 10";
Debug.JustUpdateDeviceLine();
_yeargap = BA.numberCast(int.class, 10);Debug.locals.put("YearGap", _yeargap);Debug.locals.put("YearGap", _yeargap);
 BA.debugLineNum = 685;BA.debugLine="Dim StartDate As Long";
Debug.JustUpdateDeviceLine();
_startdate = RemoteObject.createImmutable(0L);Debug.locals.put("StartDate", _startdate);
 BA.debugLineNum = 686;BA.debugLine="If m_MinDate = 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 687;BA.debugLine="StartDate =	DateUtils.SetDate(DateTime.GetYear(m";
Debug.JustUpdateDeviceLine();
_startdate = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),_yeargap}, "-",1, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("StartDate", _startdate);
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 689;BA.debugLine="StartDate =	m_MinDate";
Debug.JustUpdateDeviceLine();
_startdate = __ref.getField(true,"_m_mindate" /*RemoteObject*/ );Debug.locals.put("StartDate", _startdate);
 if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 692;BA.debugLine="Dim FirstDateOfFuture As Long = DateUtils.SetDate";
Debug.JustUpdateDeviceLine();
_firstdateoffuture = parent._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(RemoteObject.solve(new RemoteObject[] {parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),_yeargap}, "+",1, 1)),(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 31)));Debug.locals.put("FirstDateOfFuture", _firstdateoffuture);Debug.locals.put("FirstDateOfFuture", _firstdateoffuture);
 BA.debugLineNum = 694;BA.debugLine="Dim NumberOfYears As Int";
Debug.JustUpdateDeviceLine();
_numberofyears = RemoteObject.createImmutable(0);Debug.locals.put("NumberOfYears", _numberofyears);
 BA.debugLineNum = 696;BA.debugLine="If m_MaxDate = 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 12;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 697;BA.debugLine="NumberOfYears = MonthBetween(StartDate,FirstDate";
Debug.JustUpdateDeviceLine();
_numberofyears = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_monthbetween" /*RemoteObject*/ ,(Object)(_startdate),(Object)(_firstdateoffuture)),RemoteObject.createImmutable(12)}, "/",0, 0));Debug.locals.put("NumberOfYears", _numberofyears);
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 699;BA.debugLine="Dim YearsBetween As Int = Ceil(MonthBetween(Star";
Debug.JustUpdateDeviceLine();
_yearsbetween = BA.numberCast(int.class, parent.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_monthbetween" /*RemoteObject*/ ,(Object)(_startdate),(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ))),RemoteObject.createImmutable(12)}, "/",0, 0))));Debug.locals.put("YearsBetween", _yearsbetween);Debug.locals.put("YearsBetween", _yearsbetween);
 BA.debugLineNum = 700;BA.debugLine="NumberOfYears = Max(YearsBetween,1)";
Debug.JustUpdateDeviceLine();
_numberofyears = BA.numberCast(int.class, parent.__c.runMethod(true,"Max",(Object)(BA.numberCast(double.class, _yearsbetween)),(Object)(BA.numberCast(double.class, 1))));Debug.locals.put("NumberOfYears", _numberofyears);
 if (true) break;

case 12:
//C
this.state = 13;
;
 BA.debugLineNum = 703;BA.debugLine="Dim StartIndex As Int = 0";
Debug.JustUpdateDeviceLine();
_startindex = BA.numberCast(int.class, 0);Debug.locals.put("StartIndex", _startindex);Debug.locals.put("StartIndex", _startindex);
 BA.debugLineNum = 709;BA.debugLine="For i = 0 To NumberOfYears -1";
Debug.JustUpdateDeviceLine();
if (true) break;

case 13:
//for
this.state = 22;
step17 = 1;
limit17 = RemoteObject.solve(new RemoteObject[] {_numberofyears,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
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
Debug.locals.put("i", _i);
if (true) break;

case 15:
//C
this.state = 16;
 BA.debugLineNum = 711;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePanel";
Debug.JustUpdateDeviceLine();
_xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Background", _xpnl_background);Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 712;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_background.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 713;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vie";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 715;BA.debugLine="Dim p2 As Period";
Debug.JustUpdateDeviceLine();
_p2 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 716;BA.debugLine="p2.Initialize";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethod ("Initialize");
 BA.debugLineNum = 717;BA.debugLine="p2.Years = i";
Debug.JustUpdateDeviceLine();
_p2.setField ("Years",BA.numberCast(int.class, _i));
 BA.debugLineNum = 719;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(St";
Debug.JustUpdateDeviceLine();
_currenttime = parent._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(_startdate),(Object)(_p2));Debug.locals.put("CurrentTime", _currenttime);Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 722;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpage" /*RemoteObject*/ ,(Object)(_xpnl_background),(Object)((_currenttime)));
 BA.debugLineNum = 724;BA.debugLine="If DateTime.GetYear(m_StartDate) = DateTime.GetY";
Debug.JustUpdateDeviceLine();
if (true) break;

case 16:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_startdate" /*RemoteObject*/ ))),BA.numberCast(double.class, parent.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime))))) { 
this.state = 18;
;}if (true) break;

case 18:
//C
this.state = 21;
_startindex = BA.numberCast(int.class, _i);Debug.locals.put("StartIndex", _startindex);
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
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 730;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "createyearview"),BA.numberCast(int.class, 0));
this.state = 25;
return;
case 25:
//C
this.state = -1;
;
 BA.debugLineNum = 740;BA.debugLine="xASVP_Main.CurrentIndex2 = StartIndex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex2",_startindex);
 BA.debugLineNum = 741;BA.debugLine="xASVP_Main.Commit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_commit" /*RemoteObject*/ );
 BA.debugLineNum = 743;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _customdrawday(RemoteObject __ref,RemoteObject _date,RemoteObject _backgroundpanel) throws Exception{
try {
		Debug.PushSubsStack("CustomDrawDay (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1516);
if (RapidSub.canDelegate("customdrawday")) { return __ref.runUserSub(false, "as_datepicker","customdrawday", __ref, _date, _backgroundpanel);}
RemoteObject _m_customdrawday = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_customdrawday");
RemoteObject _view = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("Date", _date);
Debug.locals.put("BackgroundPanel", _backgroundpanel);
 BA.debugLineNum = 1516;BA.debugLine="Private Sub CustomDrawDay(Date As Long,BackgroundP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1517;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CustomDrawDay"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1519;BA.debugLine="Dim m_CustomDrawDay As ASDatePicker_CustomDrawDa";
Debug.JustUpdateDeviceLine();
_m_customdrawday = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_customdrawday");Debug.locals.put("m_CustomDrawDay", _m_customdrawday);
 BA.debugLineNum = 1520;BA.debugLine="m_CustomDrawDay.Initialize";
Debug.JustUpdateDeviceLine();
_m_customdrawday.runVoidMethod ("Initialize");
 BA.debugLineNum = 1521;BA.debugLine="m_CustomDrawDay.BackgroundPanel = BackgroundPane";
Debug.JustUpdateDeviceLine();
_m_customdrawday.setField ("BackgroundPanel" /*RemoteObject*/ ,_backgroundpanel);
 BA.debugLineNum = 1523;BA.debugLine="For Each View As B4XView In BackgroundPanel.GetA";
Debug.JustUpdateDeviceLine();
_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group5 = _backgroundpanel.runMethod(false,"GetAllViewsRecursive");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_view = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group5.runMethod(false,"Get",index5));Debug.locals.put("View", _view);
Debug.locals.put("View", _view);
 BA.debugLineNum = 1525;BA.debugLine="If \"xlbl_Date\" = View.Tag Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("xlbl_Date"),BA.ObjectToString(_view.runMethod(false,"getTag")))) { 
 BA.debugLineNum = 1526;BA.debugLine="m_CustomDrawDay.xlbl_Date = View";
Debug.JustUpdateDeviceLine();
_m_customdrawday.setField ("xlbl_Date" /*RemoteObject*/ ,_view);
 };
 }
}Debug.locals.put("View", _view);
;
 BA.debugLineNum = 1531;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawDay";
Debug.JustUpdateDeviceLine();
as_datepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CustomDrawDay"))),(Object)((_date)),(Object)((_m_customdrawday)));
 };
 BA.debugLineNum = 1533;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customdrawheader(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("CustomDrawHeader (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1490);
if (RapidSub.canDelegate("customdrawheader")) { return __ref.runUserSub(false, "as_datepicker","customdrawheader", __ref, _date);}
RemoteObject _m_customdrawheader = RemoteObject.declareNull("b4a.example.ef.as_datepicker._asdatepicker_customdrawheader");
Debug.locals.put("date", _date);
 BA.debugLineNum = 1490;BA.debugLine="Private Sub CustomDrawHeader(date As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1491;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CustomDrawHeader"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1493;BA.debugLine="Dim m_CustomDrawHeader As ASDatePicker_CustomDra";
Debug.JustUpdateDeviceLine();
_m_customdrawheader = RemoteObject.createNew ("b4a.example.ef.as_datepicker._asdatepicker_customdrawheader");Debug.locals.put("m_CustomDrawHeader", _m_customdrawheader);
 BA.debugLineNum = 1494;BA.debugLine="m_CustomDrawHeader.Initialize";
Debug.JustUpdateDeviceLine();
_m_customdrawheader.runVoidMethod ("Initialize");
 BA.debugLineNum = 1495;BA.debugLine="m_CustomDrawHeader.BackgroundPanel = xpnl_Header";
Debug.JustUpdateDeviceLine();
_m_customdrawheader.setField ("BackgroundPanel" /*RemoteObject*/ ,__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ));
 BA.debugLineNum = 1496;BA.debugLine="m_CustomDrawHeader.xlbl_Text = xpnl_Header.GetVi";
Debug.JustUpdateDeviceLine();
_m_customdrawheader.setField ("xlbl_Text" /*RemoteObject*/ ,__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 1497;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowLeft = xpnl_Header.";
Debug.JustUpdateDeviceLine();
_m_customdrawheader.setField ("xlbl_ArrowLeft" /*RemoteObject*/ ,__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 1498;BA.debugLine="m_CustomDrawHeader.xlbl_ArrowRight = xpnl_Header";
Debug.JustUpdateDeviceLine();
_m_customdrawheader.setField ("xlbl_ArrowRight" /*RemoteObject*/ ,__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 1500;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawHea";
Debug.JustUpdateDeviceLine();
as_datepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_CustomDrawHeader"))),(Object)((_date)),(Object)((_m_customdrawheader)));
 };
 BA.debugLineNum = 1502;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "as_datepicker","designercreateview", __ref, _base, _lbl, _props);}
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 281;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 282;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 283;BA.debugLine="Tag = mBase.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"getTag"));
 BA.debugLineNum = 284;BA.debugLine="mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag",__ref);
 BA.debugLineNum = 285;BA.debugLine="IniProps(Props)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_iniprops" /*RemoteObject*/ ,(Object)(_props));
 BA.debugLineNum = 286;BA.debugLine="m_StartDate = DateTime.Now";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_startdate" /*RemoteObject*/ ,as_datepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"));
 BA.debugLineNum = 289;BA.debugLine="xpnl_LoadingPanel = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_loadingpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 290;BA.debugLine="xpnl_LoadingPanel.Visible = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).runMethod(true,"setVisible",as_datepicker.__c.getField(true,"True"));
 BA.debugLineNum = 291;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 292;BA.debugLine="mBase.AddView(xpnl_LoadingPanel,0,0,mBase.Width,m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 294;BA.debugLine="xpnl_Header = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_header" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 295;BA.debugLine="mBase.AddView(xpnl_Header,0,0,mBase.Width,g_Heade";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ))));
 BA.debugLineNum = 297;BA.debugLine="xpnl_ViewPager = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_viewpager" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 298;BA.debugLine="mBase.AddView(xpnl_ViewPager,0,g_HeaderProperties";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, __ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ ))),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"),__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"Height" /*RemoteObject*/ )}, "-",1, 0))));
 BA.debugLineNum = 300;BA.debugLine="ini_viewpager";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_ini_viewpager" /*RemoteObject*/ );
 BA.debugLineNum = 301;BA.debugLine="CreateHeader";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createheader" /*RemoteObject*/ );
 BA.debugLineNum = 302;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Date")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Range"))) { 
 BA.debugLineNum = 303;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentview" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ));
 BA.debugLineNum = 304;BA.debugLine="CreateMonthView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createmonthview" /*void*/ );
 }else 
{ BA.debugLineNum = 305;BA.debugLine="else if m_SelectMode = \"Month\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Month"))) { 
 BA.debugLineNum = 306;BA.debugLine="m_CurrentView = getCurrentView_YearView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentview" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ ));
 BA.debugLineNum = 307;BA.debugLine="CreateYearView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createyearview" /*void*/ );
 }}
;
 BA.debugLineNum = 310;BA.debugLine="xiv_RefreshImage = CreateImageView(\"\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xiv_refreshimage" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createimageview" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 311;BA.debugLine="xiv_RefreshImage.Visible = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xiv_refreshimage" /*RemoteObject*/ ).runMethod(true,"setVisible",as_datepicker.__c.getField(true,"False"));
 BA.debugLineNum = 312;BA.debugLine="mBase.AddView(xiv_RefreshImage,0,0,mBase.Width,mB";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_xiv_refreshimage" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 315;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_base_resize" /*void*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getWidth"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"getHeight"))));
 BA.debugLineNum = 318;BA.debugLine="xpnl_LoadingPanel.SetVisibleAnimated(250,False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(as_datepicker.__c.getField(true,"False")));
 BA.debugLineNum = 320;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getargb(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("GetARGB (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1784);
if (RapidSub.canDelegate("getargb")) { return __ref.runUserSub(false, "as_datepicker","getargb", __ref, _color);}
RemoteObject _res = null;
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1784;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1785;BA.debugLine="Dim res(4) As Int";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNewArray ("int", new int[] {4}, new Object[]{});Debug.locals.put("res", _res);
 BA.debugLineNum = 1786;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (as_datepicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(as_datepicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff000000))))),(Object)(BA.numberCast(int.class, 24))),BA.numberCast(int.class, 0));
 BA.debugLineNum = 1787;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (as_datepicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(as_datepicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff0000))))),(Object)(BA.numberCast(int.class, 16))),BA.numberCast(int.class, 1));
 BA.debugLineNum = 1788;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (as_datepicker.__c.getField(false,"Bit").runMethod(true,"UnsignedShiftRight",(Object)(as_datepicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff00))))),(Object)(BA.numberCast(int.class, 8))),BA.numberCast(int.class, 2));
 BA.debugLineNum = 1789;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
Debug.JustUpdateDeviceLine();
_res.setArrayElement (as_datepicker.__c.getField(false,"Bit").runMethod(true,"And",(Object)(_color),(Object)(BA.numberCast(int.class, ((int)0xff)))),BA.numberCast(int.class, 3));
 BA.debugLineNum = 1790;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 1791;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodycolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBodyColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1314);
if (RapidSub.canDelegate("getbodycolor")) { return __ref.runUserSub(false, "as_datepicker","getbodycolor", __ref);}
 BA.debugLineNum = 1314;BA.debugLine="Public Sub getBodyColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1315;BA.debugLine="Return m_BodyColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_bodycolor" /*RemoteObject*/ );
 BA.debugLineNum = 1316;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbodyproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getBodyProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1411);
if (RapidSub.canDelegate("getbodyproperties")) { return __ref.runUserSub(false, "as_datepicker","getbodyproperties", __ref);}
 BA.debugLineNum = 1411;BA.debugLine="Public Sub getBodyProperties As ASDatePicker_BodyP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1412;BA.debugLine="Return g_BodyProperties";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ );
 BA.debugLineNum = 1413;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentdatecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentDateColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1325);
if (RapidSub.canDelegate("getcurrentdatecolor")) { return __ref.runUserSub(false, "as_datepicker","getcurrentdatecolor", __ref);}
 BA.debugLineNum = 1325;BA.debugLine="Public Sub getCurrentDateColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1326;BA.debugLine="Return m_CurrentDateColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_currentdatecolor" /*RemoteObject*/ );
 BA.debugLineNum = 1327;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1450);
if (RapidSub.canDelegate("getcurrentview")) { return __ref.runUserSub(false, "as_datepicker","getcurrentview", __ref);}
 BA.debugLineNum = 1450;BA.debugLine="Public Sub getCurrentView As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1451;BA.debugLine="Return m_CurrentView";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_currentview" /*RemoteObject*/ );
 BA.debugLineNum = 1452;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentview_centuryview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentView_CenturyView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1470);
if (RapidSub.canDelegate("getcurrentview_centuryview")) { return __ref.runUserSub(false, "as_datepicker","getcurrentview_centuryview", __ref);}
 BA.debugLineNum = 1470;BA.debugLine="Public Sub getCurrentView_CenturyView As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1471;BA.debugLine="Return \"CenturyView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("CenturyView");
 BA.debugLineNum = 1472;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentview_decadeview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentView_DecadeView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1466);
if (RapidSub.canDelegate("getcurrentview_decadeview")) { return __ref.runUserSub(false, "as_datepicker","getcurrentview_decadeview", __ref);}
 BA.debugLineNum = 1466;BA.debugLine="Public Sub getCurrentView_DecadeView As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1467;BA.debugLine="Return \"DecadeView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("DecadeView");
 BA.debugLineNum = 1468;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentview_monthview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentView_MonthView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1458);
if (RapidSub.canDelegate("getcurrentview_monthview")) { return __ref.runUserSub(false, "as_datepicker","getcurrentview_monthview", __ref);}
 BA.debugLineNum = 1458;BA.debugLine="Public Sub getCurrentView_MonthView As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1459;BA.debugLine="Return \"MonthView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("MonthView");
 BA.debugLineNum = 1460;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcurrentview_yearview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCurrentView_YearView (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1462);
if (RapidSub.canDelegate("getcurrentview_yearview")) { return __ref.runUserSub(false, "as_datepicker","getcurrentview_yearview", __ref);}
 BA.debugLineNum = 1462;BA.debugLine="Public Sub getCurrentView_YearView As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1463;BA.debugLine="Return \"YearView\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("YearView");
 BA.debugLineNum = 1464;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstdayofweek2(RemoteObject __ref,RemoteObject _ticks,RemoteObject _firstdayofweek) throws Exception{
try {
		Debug.PushSubsStack("GetFirstDayOfWeek2 (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1863);
if (RapidSub.canDelegate("getfirstdayofweek2")) { return __ref.runUserSub(false, "as_datepicker","getfirstdayofweek2", __ref, _ticks, _firstdayofweek);}
RemoteObject _p = RemoteObject.declareNull("b4a.example.dateutils._period");
Debug.locals.put("Ticks", _ticks);
Debug.locals.put("FirstDayOfWeek", _firstdayofweek);
 BA.debugLineNum = 1863;BA.debugLine="Public Sub GetFirstDayOfWeek2(Ticks As Long,FirstD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1864;BA.debugLine="Dim p As Period";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p", _p);
 BA.debugLineNum = 1865;BA.debugLine="p.Days = -((DateTime.GetDayOfWeek(Ticks)+FirstDay";
Debug.JustUpdateDeviceLine();
_p.setField ("Days",BA.numberCast(int.class, -(double) (0 + (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_ticks)),_firstdayofweek}, "+",1, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)).<Integer>get().intValue())));
 BA.debugLineNum = 1866;BA.debugLine="Return DateUtils.AddPeriod(Ticks, p)";
Debug.JustUpdateDeviceLine();
if (true) return as_datepicker._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(_ticks),(Object)(_p));
 BA.debugLineNum = 1867;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgridlinecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getGridLineColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1298);
if (RapidSub.canDelegate("getgridlinecolor")) { return __ref.runUserSub(false, "as_datepicker","getgridlinecolor", __ref);}
 BA.debugLineNum = 1298;BA.debugLine="Public Sub getGridLineColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1299;BA.debugLine="Return m_GridLineColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_gridlinecolor" /*RemoteObject*/ );
 BA.debugLineNum = 1300;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheadercolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1289);
if (RapidSub.canDelegate("getheadercolor")) { return __ref.runUserSub(false, "as_datepicker","getheadercolor", __ref);}
 BA.debugLineNum = 1289;BA.debugLine="Public Sub getHeaderColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1290;BA.debugLine="Return m_HeaderColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_headercolor" /*RemoteObject*/ );
 BA.debugLineNum = 1291;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderPanel (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1285);
if (RapidSub.canDelegate("getheaderpanel")) { return __ref.runUserSub(false, "as_datepicker","getheaderpanel", __ref);}
 BA.debugLineNum = 1285;BA.debugLine="Public Sub getHeaderPanel As B4XView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1286;BA.debugLine="Return xpnl_Header";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_xpnl_header" /*RemoteObject*/ );
 BA.debugLineNum = 1287;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getheaderproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getHeaderProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1419);
if (RapidSub.canDelegate("getheaderproperties")) { return __ref.runUserSub(false, "as_datepicker","getheaderproperties", __ref);}
 BA.debugLineNum = 1419;BA.debugLine="Public Sub getHeaderProperties As ASDatePicker_Hea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1420;BA.debugLine="Return g_HeaderProperties";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_headerproperties" /*RemoteObject*/ );
 BA.debugLineNum = 1421;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaxdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMaxDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1431);
if (RapidSub.canDelegate("getmaxdate")) { return __ref.runUserSub(false, "as_datepicker","getmaxdate", __ref);}
 BA.debugLineNum = 1431;BA.debugLine="Public Sub getMaxDate As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1432;BA.debugLine="Return m_MaxDate";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_maxdate" /*RemoteObject*/ );
 BA.debugLineNum = 1433;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmindate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMinDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1438);
if (RapidSub.canDelegate("getmindate")) { return __ref.runUserSub(false, "as_datepicker","getmindate", __ref);}
 BA.debugLineNum = 1438;BA.debugLine="Public Sub getMinDate As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1439;BA.debugLine="Return m_MinDate";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_mindate" /*RemoteObject*/ );
 BA.debugLineNum = 1440;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmonthnamebyindex(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetMonthNameByIndex (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1818);
if (RapidSub.canDelegate("getmonthnamebyindex")) { return __ref.runUserSub(false, "as_datepicker","getmonthnamebyindex", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 1818;BA.debugLine="Private Sub GetMonthNameByIndex(index As Int) As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1819;BA.debugLine="If index = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1820;BA.debugLine="Return g_MonthNameShort.January";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"January" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1821;BA.debugLine="else If index = 2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1822;BA.debugLine="Return g_MonthNameShort.February";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"February" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1823;BA.debugLine="else If index = 3 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1824;BA.debugLine="Return g_MonthNameShort.March";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"March" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1825;BA.debugLine="else If index = 4 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 1826;BA.debugLine="Return g_MonthNameShort.April";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"April" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1827;BA.debugLine="else If index = 5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 1828;BA.debugLine="Return g_MonthNameShort.May";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"May" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1829;BA.debugLine="else If index = 6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 1830;BA.debugLine="Return g_MonthNameShort.June";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"June" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1831;BA.debugLine="else If index = 7 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 7))) { 
 BA.debugLineNum = 1832;BA.debugLine="Return g_MonthNameShort.July";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"July" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1833;BA.debugLine="else If index = 8 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 8))) { 
 BA.debugLineNum = 1834;BA.debugLine="Return g_MonthNameShort.August";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"August" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1835;BA.debugLine="else If index = 9 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 1836;BA.debugLine="Return g_MonthNameShort.September";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"September" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1837;BA.debugLine="else If index = 10 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 10))) { 
 BA.debugLineNum = 1838;BA.debugLine="Return g_MonthNameShort.October";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"October" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1839;BA.debugLine="else If index = 11 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 11))) { 
 BA.debugLineNum = 1840;BA.debugLine="Return g_MonthNameShort.November";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"November" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1842;BA.debugLine="Return g_MonthNameShort.December";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ ).getField(true,"December" /*RemoteObject*/ );
 }}}}}}}}}}}
;
 BA.debugLineNum = 1844;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmonthnameshort(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getMonthNameShort (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1232);
if (RapidSub.canDelegate("getmonthnameshort")) { return __ref.runUserSub(false, "as_datepicker","getmonthnameshort", __ref);}
 BA.debugLineNum = 1232;BA.debugLine="Public Sub getMonthNameShort As ASDatePicker_Month";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1233;BA.debugLine="Return g_MonthNameShort";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_monthnameshort" /*RemoteObject*/ );
 BA.debugLineNum = 1234;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselecteddate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1379);
if (RapidSub.canDelegate("getselecteddate")) { return __ref.runUserSub(false, "as_datepicker","getselecteddate", __ref);}
 BA.debugLineNum = 1379;BA.debugLine="Public Sub getSelectedDate As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1380;BA.debugLine="Return m_SelectedDate";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_selecteddate" /*RemoteObject*/ );
 BA.debugLineNum = 1381;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselecteddatecolor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedDateColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1333);
if (RapidSub.canDelegate("getselecteddatecolor")) { return __ref.runUserSub(false, "as_datepicker","getselecteddatecolor", __ref);}
 BA.debugLineNum = 1333;BA.debugLine="Public Sub getSelectedDateColor As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1334;BA.debugLine="Return m_SelectedDateColor";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_selecteddatecolor" /*RemoteObject*/ );
 BA.debugLineNum = 1335;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedenddate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedEndDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1395);
if (RapidSub.canDelegate("getselectedenddate")) { return __ref.runUserSub(false, "as_datepicker","getselectedenddate", __ref);}
 BA.debugLineNum = 1395;BA.debugLine="Public Sub getSelectedEndDate As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1396;BA.debugLine="Return m_SelectedDate2";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ );
 BA.debugLineNum = 1397;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedstartdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedStartDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1385);
if (RapidSub.canDelegate("getselectedstartdate")) { return __ref.runUserSub(false, "as_datepicker","getselectedstartdate", __ref);}
 BA.debugLineNum = 1385;BA.debugLine="Public Sub getSelectedStartDate As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1386;BA.debugLine="Return m_SelectedDate";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_selecteddate" /*RemoteObject*/ );
 BA.debugLineNum = 1387;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectmode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectMode (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1442);
if (RapidSub.canDelegate("getselectmode")) { return __ref.runUserSub(false, "as_datepicker","getselectmode", __ref);}
 BA.debugLineNum = 1442;BA.debugLine="Public Sub getSelectMode As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1443;BA.debugLine="Return m_SelectMode";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_selectmode" /*RemoteObject*/ );
 BA.debugLineNum = 1444;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectmode_day(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectMode_Day (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1474);
if (RapidSub.canDelegate("getselectmode_day")) { return __ref.runUserSub(false, "as_datepicker","getselectmode_day", __ref);}
 BA.debugLineNum = 1474;BA.debugLine="Public Sub getSelectMode_Day As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1475;BA.debugLine="Return \"Date\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Date");
 BA.debugLineNum = 1476;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectmode_month(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectMode_Month (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1478);
if (RapidSub.canDelegate("getselectmode_month")) { return __ref.runUserSub(false, "as_datepicker","getselectmode_month", __ref);}
 BA.debugLineNum = 1478;BA.debugLine="Public Sub getSelectMode_Month As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1479;BA.debugLine="Return \"Month\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Month");
 BA.debugLineNum = 1480;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectmode_range(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectMode_Range (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1482);
if (RapidSub.canDelegate("getselectmode_range")) { return __ref.runUserSub(false, "as_datepicker","getselectmode_range", __ref);}
 BA.debugLineNum = 1482;BA.debugLine="Public Sub getSelectMode_Range As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1483;BA.debugLine="Return \"Range\"";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString("Range");
 BA.debugLineNum = 1484;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowgridlines(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowGridLines (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1306);
if (RapidSub.canDelegate("getshowgridlines")) { return __ref.runUserSub(false, "as_datepicker","getshowgridlines", __ref);}
 BA.debugLineNum = 1306;BA.debugLine="Public Sub getShowGridLines As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1307;BA.debugLine="Return m_ShowGridLines";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_showgridlines" /*RemoteObject*/ );
 BA.debugLineNum = 1308;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshowweeknumbers(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getShowWeekNumbers (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1268);
if (RapidSub.canDelegate("getshowweeknumbers")) { return __ref.runUserSub(false, "as_datepicker","getshowweeknumbers", __ref);}
 BA.debugLineNum = 1268;BA.debugLine="Public Sub getShowWeekNumbers As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1269;BA.debugLine="Return m_ShowWeekNumbers";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_m_showweeknumbers" /*RemoteObject*/ );
 BA.debugLineNum = 1270;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettheme_dark(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTheme_Dark (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("gettheme_dark")) { return __ref.runUserSub(false, "as_datepicker","gettheme_dark", __ref);}
RemoteObject _theme = RemoteObject.declareNull("b4a.example.ef.as_datepicker._as_datepicker_theme");
 BA.debugLineNum = 233;BA.debugLine="Public Sub getTheme_Dark As AS_DatePicker_Theme";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
Debug.JustUpdateDeviceLine();
_theme = RemoteObject.createNew ("b4a.example.ef.as_datepicker._as_datepicker_theme");Debug.locals.put("Theme", _theme);
 BA.debugLineNum = 236;BA.debugLine="Theme.Initialize";
Debug.JustUpdateDeviceLine();
_theme.runVoidMethod ("Initialize");
 BA.debugLineNum = 237;BA.debugLine="Theme.BodyColor = 0xFF202125";
Debug.JustUpdateDeviceLine();
_theme.setField ("BodyColor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff202125)));
 BA.debugLineNum = 238;BA.debugLine="Theme.HeaderColor = 0xFF202125";
Debug.JustUpdateDeviceLine();
_theme.setField ("HeaderColor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff202125)));
 BA.debugLineNum = 239;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
Debug.JustUpdateDeviceLine();
_theme.setField ("CurrentDateColor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x502d8879)));
 BA.debugLineNum = 240;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
Debug.JustUpdateDeviceLine();
_theme.setField ("SelectedDateColor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff2d8879)));
 BA.debugLineNum = 241;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,255,255,2";
Debug.JustUpdateDeviceLine();
_theme.setField ("GridLineColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 242;BA.debugLine="Theme.BodyTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("BodyTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 243;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("SelectedTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 244;BA.debugLine="Theme.HeaderTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("HeaderTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 245;BA.debugLine="Theme.WeekNameColor =  0xFF202125'xui.Color_ARGB(";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNameColor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff202125)));
 BA.debugLineNum = 246;BA.debugLine="Theme.WeekNameTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNameTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 247;BA.debugLine="Theme.WeekNumberColor = xui.Color_ARGB(255,32, 33";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNumberColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37))));
 BA.debugLineNum = 248;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNumberTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 250;BA.debugLine="Return Theme";
Debug.JustUpdateDeviceLine();
if (true) return _theme;
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettheme_light(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getTheme_Light (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,254);
if (RapidSub.canDelegate("gettheme_light")) { return __ref.runUserSub(false, "as_datepicker","gettheme_light", __ref);}
RemoteObject _theme = RemoteObject.declareNull("b4a.example.ef.as_datepicker._as_datepicker_theme");
 BA.debugLineNum = 254;BA.debugLine="Public Sub getTheme_Light As AS_DatePicker_Theme";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 256;BA.debugLine="Dim Theme As AS_DatePicker_Theme";
Debug.JustUpdateDeviceLine();
_theme = RemoteObject.createNew ("b4a.example.ef.as_datepicker._as_datepicker_theme");Debug.locals.put("Theme", _theme);
 BA.debugLineNum = 257;BA.debugLine="Theme.Initialize";
Debug.JustUpdateDeviceLine();
_theme.runVoidMethod ("Initialize");
 BA.debugLineNum = 258;BA.debugLine="Theme.BodyColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("BodyColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 259;BA.debugLine="Theme.HeaderColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("HeaderColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 260;BA.debugLine="Theme.CurrentDateColor = 0x502D8879";
Debug.JustUpdateDeviceLine();
_theme.setField ("CurrentDateColor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0x502d8879)));
 BA.debugLineNum = 261;BA.debugLine="Theme.SelectedDateColor = 0xFF2D8879";
Debug.JustUpdateDeviceLine();
_theme.setField ("SelectedDateColor" /*RemoteObject*/ ,BA.numberCast(int.class, ((int)0xff2d8879)));
 BA.debugLineNum = 262;BA.debugLine="Theme.GridLineColor = xui.Color_ARGB(80,0,0,0)";
Debug.JustUpdateDeviceLine();
_theme.setField ("GridLineColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 80)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 263;BA.debugLine="Theme.BodyTextColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
_theme.setField ("BodyTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 264;BA.debugLine="Theme.SelectedTextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("SelectedTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 265;BA.debugLine="Theme.HeaderTextColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
_theme.setField ("HeaderTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 266;BA.debugLine="Theme.WeekNameColor = xui.Color_White'xui.Color_A";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNameColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 267;BA.debugLine="Theme.WeekNameTextColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNameTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 268;BA.debugLine="Theme.WeekNumberColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNumberColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White"));
 BA.debugLineNum = 269;BA.debugLine="Theme.WeekNumberTextColor = xui.Color_Black";
Debug.JustUpdateDeviceLine();
_theme.setField ("WeekNumberTextColor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Black"));
 BA.debugLineNum = 271;BA.debugLine="Return Theme";
Debug.JustUpdateDeviceLine();
if (true) return _theme;
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getweeknamebyindex(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetWeekNameByIndex (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1800);
if (RapidSub.canDelegate("getweeknamebyindex")) { return __ref.runUserSub(false, "as_datepicker","getweeknamebyindex", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 1800;BA.debugLine="Public Sub GetWeekNameByIndex(Index As Int) As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1801;BA.debugLine="If Index = 1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 1802;BA.debugLine="Return g_WeekNameShort.Sunday";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Sunday" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1803;BA.debugLine="else If Index = 2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 1804;BA.debugLine="Return g_WeekNameShort.Monday";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Monday" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1805;BA.debugLine="else If Index = 3 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 1806;BA.debugLine="Return g_WeekNameShort.Tuesday";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Tuesday" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1807;BA.debugLine="else If Index = 4 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 1808;BA.debugLine="Return g_WeekNameShort.Wednesday";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Wednesday" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1809;BA.debugLine="else If Index = 5 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 1810;BA.debugLine="Return g_WeekNameShort.Thursday";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Thursday" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1811;BA.debugLine="else If Index = 6 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 1812;BA.debugLine="Return g_WeekNameShort.Friday";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Friday" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1814;BA.debugLine="Return g_WeekNameShort.Saturday";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ ).getField(true,"Saturday" /*RemoteObject*/ );
 }}}}}}
;
 BA.debugLineNum = 1816;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getweeknameproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWeekNameProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1259);
if (RapidSub.canDelegate("getweeknameproperties")) { return __ref.runUserSub(false, "as_datepicker","getweeknameproperties", __ref);}
 BA.debugLineNum = 1259;BA.debugLine="Public Sub getWeekNameProperties As ASDatePicker_W";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1260;BA.debugLine="Return g_WeekNameProperties";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ );
 BA.debugLineNum = 1261;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getweeknameshort(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWeekNameShort (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1226);
if (RapidSub.canDelegate("getweeknameshort")) { return __ref.runUserSub(false, "as_datepicker","getweeknameshort", __ref);}
 BA.debugLineNum = 1226;BA.debugLine="Public Sub getWeekNameShort As ASDatePicker_WeekNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1227;BA.debugLine="Return g_WeekNameShort";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknameshort" /*RemoteObject*/ );
 BA.debugLineNum = 1228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getweeknumberproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getWeekNumberProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1246);
if (RapidSub.canDelegate("getweeknumberproperties")) { return __ref.runUserSub(false, "as_datepicker","getweeknumberproperties", __ref);}
 BA.debugLineNum = 1246;BA.debugLine="Public Sub getWeekNumberProperties As ASDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1247;BA.debugLine="Return g_WeekNumberProperties";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ );
 BA.debugLineNum = 1248;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getweeknumberstartingfrommonday(RemoteObject __ref,RemoteObject _ticks) throws Exception{
try {
		Debug.PushSubsStack("GetWeekNumberStartingFromMonday (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1846);
if (RapidSub.canDelegate("getweeknumberstartingfrommonday")) { return __ref.runUserSub(false, "as_datepicker","getweeknumberstartingfrommonday", __ref, _ticks);}
RemoteObject _weekdayoffirstdayofyear = RemoteObject.createImmutable(0);
RemoteObject _firstmondayinyear = RemoteObject.createImmutable(0);
RemoteObject _result = RemoteObject.createImmutable(0);
Debug.locals.put("ticks", _ticks);
 BA.debugLineNum = 1846;BA.debugLine="Private Sub GetWeekNumberStartingFromMonday (ticks";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1847;BA.debugLine="Dim WeekDayOfFirstDayOfYear As Int = DateTime.Get";
Debug.JustUpdateDeviceLine();
_weekdayoffirstdayofyear = RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_ticks))),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1))))),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("WeekDayOfFirstDayOfYear", _weekdayoffirstdayofyear);Debug.locals.put("WeekDayOfFirstDayOfYear", _weekdayoffirstdayofyear);
 BA.debugLineNum = 1848;BA.debugLine="Dim FirstMondayInYear As Int = (7 + WeekDayOfFirs";
Debug.JustUpdateDeviceLine();
_firstmondayinyear = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(7),_weekdayoffirstdayofyear,RemoteObject.createImmutable(1)}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1);Debug.locals.put("FirstMondayInYear", _firstmondayinyear);Debug.locals.put("FirstMondayInYear", _firstmondayinyear);
 BA.debugLineNum = 1849;BA.debugLine="Dim result As Int";
Debug.JustUpdateDeviceLine();
_result = RemoteObject.createImmutable(0);Debug.locals.put("result", _result);
 BA.debugLineNum = 1850;BA.debugLine="If WeekDayOfFirstDayOfYear <> 1 Then result = res";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_weekdayoffirstdayofyear,BA.numberCast(double.class, 1))) { 
_result = RemoteObject.solve(new RemoteObject[] {_result,RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("result", _result);};
 BA.debugLineNum = 1851;BA.debugLine="result = result + Floor((DateTime.GetDayOfYear(ti";
Debug.JustUpdateDeviceLine();
_result = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_result,as_datepicker.__c.runMethod(true,"Floor",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfYear",(Object)(_ticks)),RemoteObject.createImmutable(1),_firstmondayinyear}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0))),RemoteObject.createImmutable(1)}, "++",2, 0));Debug.locals.put("result", _result);
 BA.debugLineNum = 1852;BA.debugLine="Return result";
Debug.JustUpdateDeviceLine();
if (true) return _result;
 BA.debugLineNum = 1853;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ini_viewpager(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ini_viewpager (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("ini_viewpager")) { return __ref.runUserSub(false, "as_datepicker","ini_viewpager", __ref);}
RemoteObject _tmplbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _tmpmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 364;BA.debugLine="Private Sub ini_viewpager";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 365;BA.debugLine="Dim tmplbl As Label";
Debug.JustUpdateDeviceLine();
_tmplbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("tmplbl", _tmplbl);
 BA.debugLineNum = 366;BA.debugLine="tmplbl.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_tmplbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 368;BA.debugLine="Dim tmpmap As Map";
Debug.JustUpdateDeviceLine();
_tmpmap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("tmpmap", _tmpmap);
 BA.debugLineNum = 369;BA.debugLine="tmpmap.Initialize";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Initialize");
 BA.debugLineNum = 370;BA.debugLine="tmpmap.Put(\"Orientation\",\"Horizontal\")";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Orientation"))),(Object)((RemoteObject.createImmutable("Horizontal"))));
 BA.debugLineNum = 371;BA.debugLine="tmpmap.Put(\"Carousel\",False)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Carousel"))),(Object)((as_datepicker.__c.getField(true,"False"))));
 BA.debugLineNum = 372;BA.debugLine="tmpmap.Put(\"LazyLoading\",True)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("LazyLoading"))),(Object)((as_datepicker.__c.getField(true,"True"))));
 BA.debugLineNum = 373;BA.debugLine="tmpmap.Put(\"LazyLoadingExtraSize\",3)";
Debug.JustUpdateDeviceLine();
_tmpmap.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("LazyLoadingExtraSize"))),(Object)(RemoteObject.createImmutable((3))));
 BA.debugLineNum = 374;BA.debugLine="xASVP_Main.Initialize(Me,\"xASVP_Main\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(RemoteObject.createImmutable("xASVP_Main")));
 BA.debugLineNum = 375;BA.debugLine="xASVP_Main.DesignerCreateView(xpnl_ViewPager,tmpl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_designercreateview" /*RemoteObject*/ ,(Object)((__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).getObject())),(Object)(_tmplbl),(Object)(_tmpmap));
 BA.debugLineNum = 376;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setloadingpanelcolor" /*RemoteObject*/ ,__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iniprops(RemoteObject __ref,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("IniProps (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("iniprops")) { return __ref.runUserSub(false, "as_datepicker","iniprops", __ref, _props);}
Debug.locals.put("Props", _props);
 BA.debugLineNum = 322;BA.debugLine="Private Sub IniProps(Props As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 324;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentview" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ));
 BA.debugLineNum = 326;BA.debugLine="m_HeaderColor = xui.PaintOrColorToColor(Props.Get";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_headercolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("HeaderColor")))))));
 BA.debugLineNum = 327;BA.debugLine="m_BodyColor = xui.PaintOrColorToColor(Props.Get(\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_bodycolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("BodyColor")))))));
 BA.debugLineNum = 328;BA.debugLine="m_CurrentDateColor = xui.PaintOrColorToColor(Prop";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentdatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("CurrentDateColor")))))));
 BA.debugLineNum = 329;BA.debugLine="m_SelectedDateColor = xui.PaintOrColorToColor(Pro";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddatecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("SelectedDateColor")))))));
 BA.debugLineNum = 330;BA.debugLine="m_InactiveDaysVisible = Props.GetDefault(\"Inactiv";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_inactivedaysvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("InactiveDaysVisible"))),(Object)((as_datepicker.__c.getField(true,"False"))))));
 BA.debugLineNum = 331;BA.debugLine="m_MouseHoverFeedback = Props.GetDefault(\"MouseHov";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_mousehoverfeedback" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("MouseHoverFeedback"))),(Object)((as_datepicker.__c.getField(true,"True"))))));
 BA.debugLineNum = 332;BA.debugLine="m_SelectMode = Props.GetDefault(\"SelectMode\",\"Dat";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selectmode" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("SelectMode"))),(Object)((RemoteObject.createImmutable("Date"))))));
 BA.debugLineNum = 333;BA.debugLine="m_ShowWeekNumbers = Props.GetDefault(\"ShowWeekNum";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_showweeknumbers" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ShowWeekNumbers"))),(Object)((as_datepicker.__c.getField(true,"False"))))));
 BA.debugLineNum = 334;BA.debugLine="m_ShowGridLines = Props.GetDefault(\"ShowGridLines";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_showgridlines" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ShowGridLines"))),(Object)((as_datepicker.__c.getField(true,"False"))))));
 BA.debugLineNum = 335;BA.debugLine="m_GridLineColor = xui.PaintOrColorToColor(Props.G";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_gridlinecolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor",(Object)(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("GridLineColor"))),(Object)(RemoteObject.createImmutable((((int)0x50ffffff))))))));
 BA.debugLineNum = 336;BA.debugLine="m_ThemeChangeTransition = Props.GetDefault(\"Theme";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_themechangetransition" /*RemoteObject*/ ,BA.ObjectToString(_props.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("ThemeChangeTransition"))),(Object)((RemoteObject.createImmutable("Fade"))))));
 BA.debugLineNum = 338;BA.debugLine="If \"Friday\" = Props.Get(\"FirstDayOfWeek\") Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("Friday"),BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDayOfWeek"))))))) { 
 BA.debugLineNum = 339;BA.debugLine="m_FirstDayOfWeek = 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 }else 
{ BA.debugLineNum = 340;BA.debugLine="else If \"Thursday\" = Props.Get(\"FirstDayOfWeek\")";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("Thursday"),BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDayOfWeek"))))))) { 
 BA.debugLineNum = 341;BA.debugLine="m_FirstDayOfWeek = 2";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,BA.numberCast(int.class, 2));
 }else 
{ BA.debugLineNum = 342;BA.debugLine="else If \"Wednesday\" = Props.Get(\"FirstDayOfWeek\")";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("Wednesday"),BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDayOfWeek"))))))) { 
 BA.debugLineNum = 343;BA.debugLine="m_FirstDayOfWeek = 3";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,BA.numberCast(int.class, 3));
 }else 
{ BA.debugLineNum = 344;BA.debugLine="else If \"Tuesday\" = Props.Get(\"FirstDayOfWeek\") T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("Tuesday"),BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDayOfWeek"))))))) { 
 BA.debugLineNum = 345;BA.debugLine="m_FirstDayOfWeek = 4";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,BA.numberCast(int.class, 4));
 }else 
{ BA.debugLineNum = 346;BA.debugLine="else If \"Monday\" = Props.Get(\"FirstDayOfWeek\") Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("Monday"),BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDayOfWeek"))))))) { 
 BA.debugLineNum = 347;BA.debugLine="m_FirstDayOfWeek = 5";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,BA.numberCast(int.class, 5));
 }else 
{ BA.debugLineNum = 348;BA.debugLine="else If \"Sunday\" = Props.Get(\"FirstDayOfWeek\") Th";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("Sunday"),BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDayOfWeek"))))))) { 
 BA.debugLineNum = 349;BA.debugLine="m_FirstDayOfWeek = 6";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,BA.numberCast(int.class, 6));
 }else 
{ BA.debugLineNum = 350;BA.debugLine="else If \"Saturday\" = Props.Get(\"FirstDayOfWeek\")";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("Saturday"),BA.ObjectToString(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("FirstDayOfWeek"))))))) { 
 BA.debugLineNum = 351;BA.debugLine="m_FirstDayOfWeek = 7";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,BA.numberCast(int.class, 7));
 }}}}}}}
;
 BA.debugLineNum = 354;BA.debugLine="g_WeekNumberProperties = CreateASDatePicker_WeekN";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_weeknumberproperties" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createasdatepicker_weeknumberproperties" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 10)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 355;BA.debugLine="g_HeaderProperties = CreateASDatePicker_HeaderPro";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_headerproperties" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createasdatepicker_headerproperties" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40))))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 12)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(BA.numberCast(float.class, 15)),(Object)(as_datepicker.__c.getField(true,"True"))));
 BA.debugLineNum = 356;BA.debugLine="g_BodyProperties = CreateASDatePicker_BodyPropert";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_bodyproperties" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createasdatepicker_bodyproperties" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultBoldFont",(Object)(BA.numberCast(float.class, 12)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30)))))));
 BA.debugLineNum = 357;BA.debugLine="g_WeekNameProperties = CreateASDatePicker_WeekNam";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_weeknameproperties" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createasdatepicker_weeknameproperties" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 32)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 37)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 10)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_White")),(Object)(BA.numberCast(float.class, as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))))));
 BA.debugLineNum = 359;BA.debugLine="g_MonthNameShort = CreateASDatePicker_MonthNameSh";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_monthnameshort" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createasdatepicker_monthnameshort" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Jan")),(Object)(BA.ObjectToString("Feb")),(Object)(BA.ObjectToString("Mar")),(Object)(BA.ObjectToString("Apr")),(Object)(BA.ObjectToString("May")),(Object)(BA.ObjectToString("Jun")),(Object)(BA.ObjectToString("Jul")),(Object)(BA.ObjectToString("Aug")),(Object)(BA.ObjectToString("Sept")),(Object)(BA.ObjectToString("Oct")),(Object)(BA.ObjectToString("Nov")),(Object)(RemoteObject.createImmutable("Dec"))));
 BA.debugLineNum = 360;BA.debugLine="g_WeekNameShort = CreateASDatePicker_WeekNameShor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_weeknameshort" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createasdatepicker_weeknameshort" /*RemoteObject*/ ,(Object)(BA.ObjectToString("Mon")),(Object)(BA.ObjectToString("Tue")),(Object)(BA.ObjectToString("Wed")),(Object)(BA.ObjectToString("Thu")),(Object)(BA.ObjectToString("Fri")),(Object)(BA.ObjectToString("Sat")),(Object)(RemoteObject.createImmutable("Sun"))));
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "as_datepicker","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 275;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 276;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 277;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _monthbetween(RemoteObject __ref,RemoteObject _date1,RemoteObject _date2) throws Exception{
try {
		Debug.PushSubsStack("MonthBetween (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1874);
if (RapidSub.canDelegate("monthbetween")) { return __ref.runUserSub(false, "as_datepicker","monthbetween", __ref, _date1, _date2);}
RemoteObject _y = RemoteObject.createImmutable(0L);
RemoteObject _m = RemoteObject.createImmutable(0L);
Debug.locals.put("Date1", _date1);
Debug.locals.put("Date2", _date2);
 BA.debugLineNum = 1874;BA.debugLine="Private Sub MonthBetween(Date1 As Long, Date2 As L";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1875;BA.debugLine="Dim y As Long = DateTime.GetYear(Date2) - DateTim";
Debug.JustUpdateDeviceLine();
_y = BA.numberCast(long.class, RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date2)),as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date1))}, "-",1, 1));Debug.locals.put("y", _y);Debug.locals.put("y", _y);
 BA.debugLineNum = 1876;BA.debugLine="Dim m As Long = y * 12";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.solve(new RemoteObject[] {_y,RemoteObject.createImmutable(12)}, "*",0, 2);Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1877;BA.debugLine="m = m - DateTime.GetMonth(Date1)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.solve(new RemoteObject[] {_m,as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date1))}, "-",1, 2);Debug.locals.put("m", _m);
 BA.debugLineNum = 1878;BA.debugLine="m = m + DateTime.GetMonth(Date2)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.solve(new RemoteObject[] {_m,as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date2))}, "+",1, 2);Debug.locals.put("m", _m);
 BA.debugLineNum = 1879;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, _m);
 BA.debugLineNum = 1880;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _monthdateclick(RemoteObject __ref,RemoteObject _xpnl_monthdate,RemoteObject _withevent) throws Exception{
try {
		Debug.PushSubsStack("MonthDateClick (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1699);
if (RapidSub.canDelegate("monthdateclick")) { return __ref.runUserSub(false, "as_datepicker","monthdateclick", __ref, _xpnl_monthdate, _withevent);}
RemoteObject _currentday = RemoteObject.createImmutable(0L);
RemoteObject _xlbl_date = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _view = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
Debug.locals.put("xpnl_MonthDate", _xpnl_monthdate);
Debug.locals.put("WithEvent", _withevent);
 BA.debugLineNum = 1699;BA.debugLine="Private Sub MonthDateClick(xpnl_MonthDate As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1701;BA.debugLine="Dim CurrentDay As Long = xpnl_MonthDate.Tag";
Debug.JustUpdateDeviceLine();
_currentday = BA.numberCast(long.class, _xpnl_monthdate.runMethod(false,"getTag"));Debug.locals.put("CurrentDay", _currentday);Debug.locals.put("CurrentDay", _currentday);
 BA.debugLineNum = 1702;BA.debugLine="If (m_MaxDate > 0 And DateUtils.SetDate(DateTime.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_currentday)))),as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ))))))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("<",as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currentday))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_currentday)))),as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))))))))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1704;BA.debugLine="Dim xlbl_Date As B4XView";
Debug.JustUpdateDeviceLine();
_xlbl_date = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");Debug.locals.put("xlbl_Date", _xlbl_date);
 BA.debugLineNum = 1705;BA.debugLine="For Each View As B4XView In xpnl_MonthDate.GetAll";
Debug.JustUpdateDeviceLine();
_view = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
{
final RemoteObject group4 = _xpnl_monthdate.runMethod(false,"GetAllViewsRecursive");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_view = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), group4.runMethod(false,"Get",index4));Debug.locals.put("View", _view);
Debug.locals.put("View", _view);
 BA.debugLineNum = 1706;BA.debugLine="If \"xlbl_Date\" = View.Tag Then xlbl_Date = View";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable("xlbl_Date"),BA.ObjectToString(_view.runMethod(false,"getTag")))) { 
_xlbl_date = _view;Debug.locals.put("xlbl_Date", _xlbl_date);};
 }
}Debug.locals.put("View", _view);
;
 BA.debugLineNum = 1709;BA.debugLine="If xlbl_Date.Visible = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_xlbl_date.runMethod(true,"getVisible"),as_datepicker.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1711;BA.debugLine="If m_SelectMode = \"Range\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Range"))) { 
 BA.debugLineNum = 1712;BA.debugLine="If m_SelectedDate = 0 Or xpnl_MonthDate.Tag <= m";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) || RemoteObject.solveBoolean("k",BA.numberCast(double.class, _xpnl_monthdate.runMethod(false,"getTag")),BA.numberCast(double.class, __ref.getField(true,"_m_selecteddate" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 1713;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate,xpnl_Mont";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ )),(Object)(BA.numberCast(long.class, _xpnl_monthdate.runMethod(false,"getTag")))),as_datepicker.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1714;BA.debugLine="m_SelectedDate = xpnl_MonthDate.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate" /*RemoteObject*/ ,BA.numberCast(long.class, _xpnl_monthdate.runMethod(false,"getTag")));
 BA.debugLineNum = 1715;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createselecteddate" /*RemoteObject*/ ,(Object)(_xpnl_monthdate),(Object)(as_datepicker.__c.getField(true,"True")));
 BA.debugLineNum = 1716;BA.debugLine="If m_SelectedDate > m_SelectedDate2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ ),__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1717;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Select";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),as_datepicker.__c.getField(true,"True"))) { 
__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 1718;BA.debugLine="m_SelectedDate2 = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate2" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 };
 }else {
 BA.debugLineNum = 1721;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_Selected";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),as_datepicker.__c.getField(true,"True"))) { 
__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 1722;BA.debugLine="m_SelectedDate = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 };
 }else {
 BA.debugLineNum = 1725;BA.debugLine="If DateUtils.IsSameDay(m_SelectedDate2,xpnl_Mon";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",as_datepicker._dateutils.runMethod(true,"_issameday",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ )),(Object)(BA.numberCast(long.class, _xpnl_monthdate.runMethod(false,"getTag")))),as_datepicker.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1726;BA.debugLine="m_SelectedDate2 = xpnl_MonthDate.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate2" /*RemoteObject*/ ,BA.numberCast(long.class, _xpnl_monthdate.runMethod(false,"getTag")));
 BA.debugLineNum = 1727;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createselecteddate" /*RemoteObject*/ ,(Object)(_xpnl_monthdate),(Object)(as_datepicker.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 1729;BA.debugLine="If xpnl_SelectedDate2 <> Null And xpnl_Selecte";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),as_datepicker.__c.getField(true,"True"))) { 
__ref.getField(false,"_xpnl_selecteddate2" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 1730;BA.debugLine="m_SelectedDate2 = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate2" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 };
 };
 BA.debugLineNum = 1733;BA.debugLine="RefreshSelectedDate";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_refreshselecteddate" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1735;BA.debugLine="CreateSelectedDate(xpnl_MonthDate,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createselecteddate" /*RemoteObject*/ ,(Object)(_xpnl_monthdate),(Object)(as_datepicker.__c.getField(true,"True")));
 };
 BA.debugLineNum = 1738;BA.debugLine="xlbl_Date.TextColor = g_BodyProperties.SelectedTe";
Debug.JustUpdateDeviceLine();
_xlbl_date.runMethod(true,"setTextColor",__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).getField(true,"SelectedTextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 1740;BA.debugLine="If WithEvent = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_withevent,as_datepicker.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1741;BA.debugLine="If m_SelectMode = \"Range\" And m_SelectedDate > 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Range")) && RemoteObject.solveBoolean(">",__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
 BA.debugLineNum = 1742;BA.debugLine="SelectedDateRangeChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_selecteddaterangechanged" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1744;BA.debugLine="SelectedDateChanged(xpnl_MonthDate.Tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_selecteddatechanged" /*RemoteObject*/ ,(Object)(BA.numberCast(long.class, _xpnl_monthdate.runMethod(false,"getTag"))));
 };
 };
 BA.debugLineNum = 1747;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagechanged(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PageChanged (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1535);
if (RapidSub.canDelegate("pagechanged")) { return __ref.runUserSub(false, "as_datepicker","pagechanged", __ref);}
 BA.debugLineNum = 1535;BA.debugLine="Private Sub PageChanged";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1536;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCh";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged"))),(Object)(BA.numberCast(int.class, 0))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1537;BA.debugLine="CallSub(mCallBack, mEventName & \"_PageChanged\")";
Debug.JustUpdateDeviceLine();
as_datepicker.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_PageChanged"))));
 };
 BA.debugLineNum = 1539;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _rebuild(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Rebuild (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1202);
if (RapidSub.canDelegate("rebuild")) { __ref.runUserSub(false, "as_datepicker","rebuild", __ref); return;}
ResumableSub_Rebuild rsub = new ResumableSub_Rebuild(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Rebuild extends BA.ResumableSub {
public ResumableSub_Rebuild(b4a.example.ef.as_datepicker parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Rebuild (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1202);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 1204;BA.debugLine="Do While m_isReady = False";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//do while
this.state = 4;
while (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_isready" /*RemoteObject*/ ),parent.__c.getField(true,"False"))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 1;
 BA.debugLineNum = 1205;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "rebuild"),BA.numberCast(int.class, 0));
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
 BA.debugLineNum = 1207;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "rebuild"),BA.numberCast(int.class, 0));
this.state = 12;
return;
case 12:
//C
this.state = 5;
;
 BA.debugLineNum = 1208;BA.debugLine="xASVP_Main.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 1209;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "rebuild"),BA.numberCast(int.class, 0));
this.state = 13;
return;
case 13:
//C
this.state = 5;
;
 BA.debugLineNum = 1210;BA.debugLine="If m_SelectMode = \"Date\" Or m_SelectMode = \"Range";
Debug.JustUpdateDeviceLine();
if (true) break;

case 5:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Date")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Range"))) { 
this.state = 7;
}else 
{ BA.debugLineNum = 1213;BA.debugLine="else if m_SelectMode = \"Month\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Month"))) { 
this.state = 9;
}}
if (true) break;

case 7:
//C
this.state = 10;
 BA.debugLineNum = 1211;BA.debugLine="m_CurrentView = getCurrentView_MonthView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentview" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ));
 BA.debugLineNum = 1212;BA.debugLine="CreateMonthView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createmonthview" /*void*/ );
 if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 1214;BA.debugLine="m_CurrentView = getCurrentView_YearView";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentview" /*RemoteObject*/ ,__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ ));
 BA.debugLineNum = 1215;BA.debugLine="CreateYearView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createyearview" /*void*/ );
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 1217;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1093);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "as_datepicker","refresh", __ref);}
int _i = 0;
 BA.debugLineNum = 1093;BA.debugLine="Public Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1094;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
Debug.JustUpdateDeviceLine();
{
final int step1 = 1;
final int limit1 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1095;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getpanel" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1096;BA.debugLine="xASVP_Main.GetPanel(i).RemoveAllViews";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getpanel" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))).runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 1097;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1098;BA.debugLine="AddMonth(xASVP_Main.GetPanel(i),xASVP_Main.Get";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addmonth" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getpanel" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(long.class, __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))))));
 }else 
{ BA.debugLineNum = 1099;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ )) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ )) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_centuryview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1100;BA.debugLine="AddYear(xASVP_Main.GetPanel(i),xASVP_Main.GetV";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addyear" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getpanel" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i)))),(Object)(BA.numberCast(long.class, __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))))));
 }}
;
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshheader(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshHeader (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1180);
if (RapidSub.canDelegate("refreshheader")) { return __ref.runUserSub(false, "as_datepicker","refreshheader", __ref);}
RemoteObject _xlbl_header = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_arrowleft = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_arrowright = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1180;BA.debugLine="Public Sub RefreshHeader";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1182;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_headercolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1184;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
Debug.JustUpdateDeviceLine();
_xlbl_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_header = __ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_Header", _xlbl_header);Debug.locals.put("xlbl_Header", _xlbl_header);
 BA.debugLineNum = 1185;BA.debugLine="Dim xlbl_ArrowLeft As B4XView = xpnl_Header.GetVi";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_arrowleft = __ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("xlbl_ArrowLeft", _xlbl_arrowleft);Debug.locals.put("xlbl_ArrowLeft", _xlbl_arrowleft);
 BA.debugLineNum = 1186;BA.debugLine="Dim xlbl_ArrowRight As B4XView = xpnl_Header.GetV";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_arrowright = __ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 2)));Debug.locals.put("xlbl_ArrowRight", _xlbl_arrowright);Debug.locals.put("xlbl_ArrowRight", _xlbl_arrowright);
 BA.debugLineNum = 1188;BA.debugLine="xlbl_ArrowLeft.Font = xui.CreateMaterialIcons(g_H";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ButtonIconSize" /*RemoteObject*/ ))));
 BA.debugLineNum = 1189;BA.debugLine="xlbl_ArrowLeft.TextColor = g_HeaderProperties.Tex";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runMethod(true,"setTextColor",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 1190;BA.debugLine="xlbl_ArrowLeft.Visible = g_HeaderProperties.Arrow";
Debug.JustUpdateDeviceLine();
_xlbl_arrowleft.runMethod(true,"setVisible",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ArrowsVisible" /*RemoteObject*/ ));
 BA.debugLineNum = 1192;BA.debugLine="xlbl_ArrowRight.Font = xui.CreateMaterialIcons(g_";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runMethod(false,"setFont",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateMaterialIcons",(Object)(__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ButtonIconSize" /*RemoteObject*/ ))));
 BA.debugLineNum = 1193;BA.debugLine="xlbl_ArrowRight.TextColor = g_HeaderProperties.Te";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runMethod(true,"setTextColor",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 1194;BA.debugLine="xlbl_ArrowRight.Visible = g_HeaderProperties.Arro";
Debug.JustUpdateDeviceLine();
_xlbl_arrowright.runMethod(true,"setVisible",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"ArrowsVisible" /*RemoteObject*/ ));
 BA.debugLineNum = 1196;BA.debugLine="xlbl_Header.Font = g_HeaderProperties.xFont";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(false,"setFont",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(false,"xFont" /*RemoteObject*/ ));
 BA.debugLineNum = 1197;BA.debugLine="xlbl_Header.TextColor = g_HeaderProperties.TextCo";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(true,"setTextColor",__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).getField(true,"TextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 1199;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refreshselecteddate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RefreshSelectedDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1106);
if (RapidSub.canDelegate("refreshselecteddate")) { return __ref.runUserSub(false, "as_datepicker","refreshselecteddate", __ref);}
RemoteObject _clr = null;
int _i = 0;
RemoteObject _counter = RemoteObject.createImmutable(0);
int _z = 0;
RemoteObject _xpnl_day = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1106;BA.debugLine="Public Sub RefreshSelectedDate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1107;BA.debugLine="Dim clr() As Int = GetARGB(m_SelectedDateColor)";
Debug.JustUpdateDeviceLine();
_clr = __ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getargb" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_m_selecteddatecolor" /*RemoteObject*/ )));Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 1109;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1110;BA.debugLine="If xASVP_Main.GetPanel(i).NumberOfViews > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getpanel" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1111;BA.debugLine="If m_CurrentView = getCurrentView_MonthView The";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1113;BA.debugLine="Dim counter As Int = xASVP_Main.GetPanel(i).Nu";
Debug.JustUpdateDeviceLine();
_counter = __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getpanel" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))).runMethod(true,"getNumberOfViews");Debug.locals.put("counter", _counter);Debug.locals.put("counter", _counter);
 BA.debugLineNum = 1114;BA.debugLine="For z = 0 To counter -1";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_counter,RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_z = 0 ;
for (;(step6 > 0 && _z <= limit6) || (step6 < 0 && _z >= limit6) ;_z = ((int)(0 + _z + step6))  ) {
Debug.locals.put("z", _z);
 BA.debugLineNum = 1115;BA.debugLine="Dim xpnl_Day As B4XView = xASVP_Main.GetPanel";
Debug.JustUpdateDeviceLine();
_xpnl_day = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_day = __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getpanel" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _z)));Debug.locals.put("xpnl_Day", _xpnl_day);Debug.locals.put("xpnl_Day", _xpnl_day);
 BA.debugLineNum = 1116;BA.debugLine="If xpnl_Day.tag Is Long And xpnl_Day.NumberOf";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("i",_xpnl_day.runMethod(false,"getTag"), RemoteObject.createImmutable("Long")) && RemoteObject.solveBoolean(">",_xpnl_day.runMethod(true,"getNumberOfViews"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1117;BA.debugLine="CreateSelectDates(xpnl_Day,clr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createselectdates" /*RemoteObject*/ ,(Object)(_xpnl_day),(Object)(_clr));
 };
 }
}Debug.locals.put("z", _z);
;
 };
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scroll2date(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("Scroll2Date (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1354);
if (RapidSub.canDelegate("scroll2date")) { return __ref.runUserSub(false, "as_datepicker","scroll2date", __ref, _date);}
RemoteObject _scrollindex = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _startdate = RemoteObject.createImmutable(0L);
Debug.locals.put("Date", _date);
 BA.debugLineNum = 1354;BA.debugLine="Public Sub Scroll2Date(Date As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1355;BA.debugLine="Dim ScrollIndex As Int = -1";
Debug.JustUpdateDeviceLine();
_scrollindex = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("ScrollIndex", _scrollindex);Debug.locals.put("ScrollIndex", _scrollindex);
 BA.debugLineNum = 1356;BA.debugLine="For i = 0 To xASVP_Main.Size -1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1357;BA.debugLine="Dim StartDate As Long = xASVP_Main.GetValue(i)";
Debug.JustUpdateDeviceLine();
_startdate = BA.numberCast(long.class, __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("StartDate", _startdate);Debug.locals.put("StartDate", _startdate);
 BA.debugLineNum = 1359;BA.debugLine="If DateTime.GetYear(StartDate) = DateTime.GetYea";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_startdate)),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date)))) && RemoteObject.solveBoolean("=",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_startdate)),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date))))) { 
 BA.debugLineNum = 1360;BA.debugLine="ScrollIndex = i";
Debug.JustUpdateDeviceLine();
_scrollindex = BA.numberCast(int.class, _i);Debug.locals.put("ScrollIndex", _scrollindex);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1364;BA.debugLine="If ScrollIndex <> -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_scrollindex,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1365;BA.debugLine="xASVP_Main.CurrentIndex = ScrollIndex";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setcurrentindex" /*RemoteObject*/ ,_scrollindex);
 }else {
 BA.debugLineNum = 1367;BA.debugLine="m_StartDate = Date";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_startdate" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 1368;BA.debugLine="xASVP_Main.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 1369;BA.debugLine="CreateMonthView";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_createmonthview" /*void*/ );
 };
 BA.debugLineNum = 1371;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selecteddatechanged(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("SelectedDateChanged (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1504);
if (RapidSub.canDelegate("selecteddatechanged")) { return __ref.runUserSub(false, "as_datepicker","selecteddatechanged", __ref, _date);}
Debug.locals.put("date", _date);
 BA.debugLineNum = 1504;BA.debugLine="Private Sub SelectedDateChanged(date As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1505;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedDateChanged"))),(Object)(BA.numberCast(int.class, 1))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1506;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedDateC";
Debug.JustUpdateDeviceLine();
as_datepicker.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedDateChanged"))),(Object)((_date)));
 };
 BA.debugLineNum = 1508;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selecteddaterangechanged(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SelectedDateRangeChanged (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1510);
if (RapidSub.canDelegate("selecteddaterangechanged")) { return __ref.runUserSub(false, "as_datepicker","selecteddaterangechanged", __ref);}
 BA.debugLineNum = 1510;BA.debugLine="Private Sub SelectedDateRangeChanged";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1511;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Select";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedDateRangeChanged"))),(Object)(BA.numberCast(int.class, 2))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1512;BA.debugLine="CallSub3(mCallBack, mEventName & \"_SelectedDateR";
Debug.JustUpdateDeviceLine();
as_datepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedDateRangeChanged"))),(Object)((__ref.getField(true,"_m_selecteddate" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_m_selecteddate2" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 1514;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbodycolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setBodyColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1318);
if (RapidSub.canDelegate("setbodycolor")) { return __ref.runUserSub(false, "as_datepicker","setbodycolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1318;BA.debugLine="Public Sub setBodyColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1319;BA.debugLine="m_BodyColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_bodycolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1320;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1321;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setloadingpanelcolor" /*RemoteObject*/ ,__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1322;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1323;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbodyproperties(RemoteObject __ref,RemoteObject _bodyproperties) throws Exception{
try {
		Debug.PushSubsStack("setBodyProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1415);
if (RapidSub.canDelegate("setbodyproperties")) { return __ref.runUserSub(false, "as_datepicker","setbodyproperties", __ref, _bodyproperties);}
Debug.locals.put("BodyProperties", _bodyproperties);
 BA.debugLineNum = 1415;BA.debugLine="Public Sub setBodyProperties(BodyProperties As ASD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1416;BA.debugLine="g_BodyProperties = BodyProperties";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_bodyproperties" /*RemoteObject*/ ,_bodyproperties);
 BA.debugLineNum = 1417;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurrentdatecolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setCurrentDateColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1329);
if (RapidSub.canDelegate("setcurrentdatecolor")) { return __ref.runUserSub(false, "as_datepicker","setcurrentdatecolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1329;BA.debugLine="Public Sub setCurrentDateColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1330;BA.debugLine="m_CurrentDateColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentdatecolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfirstdayofweek(RemoteObject __ref,RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("setFirstDayOfWeek (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1349);
if (RapidSub.canDelegate("setfirstdayofweek")) { return __ref.runUserSub(false, "as_datepicker","setfirstdayofweek", __ref, _number);}
Debug.locals.put("number", _number);
 BA.debugLineNum = 1349;BA.debugLine="Public Sub setFirstDayOfWeek(number As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1350;BA.debugLine="m_FirstDayOfWeek = number";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_firstdayofweek" /*RemoteObject*/ ,_number);
 BA.debugLineNum = 1351;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgridlinecolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setGridLineColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1302);
if (RapidSub.canDelegate("setgridlinecolor")) { return __ref.runUserSub(false, "as_datepicker","setgridlinecolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1302;BA.debugLine="Public Sub setGridLineColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1303;BA.debugLine="m_GridLineColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_gridlinecolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadercolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setHeaderColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1293);
if (RapidSub.canDelegate("setheadercolor")) { return __ref.runUserSub(false, "as_datepicker","setheadercolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1293;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1294;BA.debugLine="m_HeaderColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_headercolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1295;BA.debugLine="xpnl_Header.Color = m_HeaderColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_headercolor" /*RemoteObject*/ ));
 BA.debugLineNum = 1296;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderproperties(RemoteObject __ref,RemoteObject _headerproperties) throws Exception{
try {
		Debug.PushSubsStack("setHeaderProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1423);
if (RapidSub.canDelegate("setheaderproperties")) { return __ref.runUserSub(false, "as_datepicker","setheaderproperties", __ref, _headerproperties);}
Debug.locals.put("HeaderProperties", _headerproperties);
 BA.debugLineNum = 1423;BA.debugLine="Public Sub setHeaderProperties(HeaderProperties As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1424;BA.debugLine="g_HeaderProperties = HeaderProperties";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_headerproperties" /*RemoteObject*/ ,_headerproperties);
 BA.debugLineNum = 1425;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaxdate(RemoteObject __ref,RemoteObject _maxdate) throws Exception{
try {
		Debug.PushSubsStack("setMaxDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1428);
if (RapidSub.canDelegate("setmaxdate")) { return __ref.runUserSub(false, "as_datepicker","setmaxdate", __ref, _maxdate);}
Debug.locals.put("MaxDate", _maxdate);
 BA.debugLineNum = 1428;BA.debugLine="Public Sub setMaxDate(MaxDate As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1429;BA.debugLine="m_MaxDate = MaxDate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_maxdate" /*RemoteObject*/ ,_maxdate);
 BA.debugLineNum = 1430;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmindate(RemoteObject __ref,RemoteObject _mindate) throws Exception{
try {
		Debug.PushSubsStack("setMinDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1435);
if (RapidSub.canDelegate("setmindate")) { return __ref.runUserSub(false, "as_datepicker","setmindate", __ref, _mindate);}
Debug.locals.put("MinDate", _mindate);
 BA.debugLineNum = 1435;BA.debugLine="Public Sub setMinDate(MinDate As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1436;BA.debugLine="m_MinDate = MinDate";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_mindate" /*RemoteObject*/ ,_mindate);
 BA.debugLineNum = 1437;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmonthnameshort(RemoteObject __ref,RemoteObject _monthnameshort) throws Exception{
try {
		Debug.PushSubsStack("setMonthNameShort (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1236);
if (RapidSub.canDelegate("setmonthnameshort")) { return __ref.runUserSub(false, "as_datepicker","setmonthnameshort", __ref, _monthnameshort);}
Debug.locals.put("MonthNameShort", _monthnameshort);
 BA.debugLineNum = 1236;BA.debugLine="Public Sub setMonthNameShort(MonthNameShort As ASD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1237;BA.debugLine="g_MonthNameShort = MonthNameShort";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_monthnameshort" /*RemoteObject*/ ,_monthnameshort);
 BA.debugLineNum = 1238;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselecteddate(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("setSelectedDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1375);
if (RapidSub.canDelegate("setselecteddate")) { return __ref.runUserSub(false, "as_datepicker","setselecteddate", __ref, _date);}
Debug.locals.put("Date", _date);
 BA.debugLineNum = 1375;BA.debugLine="Public Sub setSelectedDate(Date As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1376;BA.debugLine="m_SelectedDate = Date";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 1377;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselecteddatecolor(RemoteObject __ref,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("setSelectedDateColor (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1337);
if (RapidSub.canDelegate("setselecteddatecolor")) { return __ref.runUserSub(false, "as_datepicker","setselecteddatecolor", __ref, _color);}
Debug.locals.put("Color", _color);
 BA.debugLineNum = 1337;BA.debugLine="Public Sub setSelectedDateColor(Color As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1338;BA.debugLine="m_SelectedDateColor = Color";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddatecolor" /*RemoteObject*/ ,_color);
 BA.debugLineNum = 1339;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedenddate(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("setSelectedEndDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1399);
if (RapidSub.canDelegate("setselectedenddate")) { return __ref.runUserSub(false, "as_datepicker","setselectedenddate", __ref, _date);}
Debug.locals.put("Date", _date);
 BA.debugLineNum = 1399;BA.debugLine="Public Sub setSelectedEndDate(Date As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1400;BA.debugLine="m_SelectedDate2 = Date";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate2" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 1401;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedstartdate(RemoteObject __ref,RemoteObject _date) throws Exception{
try {
		Debug.PushSubsStack("setSelectedStartDate (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1389);
if (RapidSub.canDelegate("setselectedstartdate")) { return __ref.runUserSub(false, "as_datepicker","setselectedstartdate", __ref, _date);}
Debug.locals.put("Date", _date);
 BA.debugLineNum = 1389;BA.debugLine="Public Sub setSelectedStartDate(Date As Long)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1390;BA.debugLine="m_SelectedDate = Date";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddate" /*RemoteObject*/ ,_date);
 BA.debugLineNum = 1391;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectmode(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("setSelectMode (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1446);
if (RapidSub.canDelegate("setselectmode")) { return __ref.runUserSub(false, "as_datepicker","setselectmode", __ref, _mode);}
Debug.locals.put("Mode", _mode);
 BA.debugLineNum = 1446;BA.debugLine="Public Sub setSelectMode(Mode As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1447;BA.debugLine="m_SelectMode = Mode";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selectmode" /*RemoteObject*/ ,_mode);
 BA.debugLineNum = 1448;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowgridlines(RemoteObject __ref,RemoteObject _show) throws Exception{
try {
		Debug.PushSubsStack("setShowGridLines (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1310);
if (RapidSub.canDelegate("setshowgridlines")) { return __ref.runUserSub(false, "as_datepicker","setshowgridlines", __ref, _show);}
Debug.locals.put("Show", _show);
 BA.debugLineNum = 1310;BA.debugLine="Public Sub setShowGridLines(Show As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1311;BA.debugLine="m_ShowGridLines = Show";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_showgridlines" /*RemoteObject*/ ,_show);
 BA.debugLineNum = 1312;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowweeknumbers(RemoteObject __ref,RemoteObject _show) throws Exception{
try {
		Debug.PushSubsStack("setShowWeekNumbers (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1272);
if (RapidSub.canDelegate("setshowweeknumbers")) { return __ref.runUserSub(false, "as_datepicker","setshowweeknumbers", __ref, _show);}
Debug.locals.put("Show", _show);
 BA.debugLineNum = 1272;BA.debugLine="Public Sub setShowWeekNumbers(Show As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1273;BA.debugLine="m_ShowWeekNumbers = Show";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_showweeknumbers" /*RemoteObject*/ ,_show);
 BA.debugLineNum = 1274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _settheme(RemoteObject __ref,RemoteObject _theme) throws Exception{
try {
		Debug.PushSubsStack("setTheme (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("settheme")) { __ref.runUserSub(false, "as_datepicker","settheme", __ref, _theme); return;}
ResumableSub_setTheme rsub = new ResumableSub_setTheme(null,__ref,_theme);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_setTheme extends BA.ResumableSub {
public ResumableSub_setTheme(b4a.example.ef.as_datepicker parent,RemoteObject __ref,RemoteObject _theme) {
this.parent = parent;
this.__ref = __ref;
this._theme = _theme;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.ef.as_datepicker parent;
RemoteObject _theme;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("setTheme (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,195);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Theme", _theme);
 BA.debugLineNum = 197;BA.debugLine="xiv_RefreshImage.SetBitmap(mBase.Snapshot)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xiv_refreshimage" /*RemoteObject*/ ).runVoidMethod ("SetBitmap",(Object)((__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"Snapshot").getObject())));
 BA.debugLineNum = 198;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xiv_refreshimage" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"True")));
 BA.debugLineNum = 200;BA.debugLine="m_BodyColor = Theme.BodyColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_bodycolor" /*RemoteObject*/ ,_theme.getField(true,"BodyColor" /*RemoteObject*/ ));
 BA.debugLineNum = 201;BA.debugLine="m_HeaderColor = Theme.HeaderColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_headercolor" /*RemoteObject*/ ,_theme.getField(true,"HeaderColor" /*RemoteObject*/ ));
 BA.debugLineNum = 202;BA.debugLine="m_CurrentDateColor = Theme.CurrentDateColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_currentdatecolor" /*RemoteObject*/ ,_theme.getField(true,"CurrentDateColor" /*RemoteObject*/ ));
 BA.debugLineNum = 203;BA.debugLine="m_SelectedDateColor = Theme.SelectedDateColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_selecteddatecolor" /*RemoteObject*/ ,_theme.getField(true,"SelectedDateColor" /*RemoteObject*/ ));
 BA.debugLineNum = 204;BA.debugLine="m_GridLineColor = Theme.GridLineColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_gridlinecolor" /*RemoteObject*/ ,_theme.getField(true,"GridLineColor" /*RemoteObject*/ ));
 BA.debugLineNum = 205;BA.debugLine="g_BodyProperties.TextColor = Theme.BodyTextColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).setField ("TextColor" /*RemoteObject*/ ,_theme.getField(true,"BodyTextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 206;BA.debugLine="g_HeaderProperties.TextColor = Theme.HeaderTextCo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_headerproperties" /*RemoteObject*/ ).setField ("TextColor" /*RemoteObject*/ ,_theme.getField(true,"HeaderTextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 207;BA.debugLine="g_WeekNameProperties.Color = Theme.WeekNameColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).setField ("Color" /*RemoteObject*/ ,_theme.getField(true,"WeekNameColor" /*RemoteObject*/ ));
 BA.debugLineNum = 208;BA.debugLine="g_WeekNameProperties.TextColor = Theme.WeekNameTe";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_weeknameproperties" /*RemoteObject*/ ).setField ("TextColor" /*RemoteObject*/ ,_theme.getField(true,"WeekNameTextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 209;BA.debugLine="g_WeekNumberProperties.Color = Theme.WeekNumberCo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).setField ("Color" /*RemoteObject*/ ,_theme.getField(true,"WeekNumberColor" /*RemoteObject*/ ));
 BA.debugLineNum = 210;BA.debugLine="g_WeekNumberProperties.TextColor = Theme.WeekNumb";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_weeknumberproperties" /*RemoteObject*/ ).setField ("TextColor" /*RemoteObject*/ ,_theme.getField(true,"WeekNumberTextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 211;BA.debugLine="g_BodyProperties.SelectedTextColor = Theme.Select";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_g_bodyproperties" /*RemoteObject*/ ).setField ("SelectedTextColor" /*RemoteObject*/ ,_theme.getField(true,"SelectedTextColor" /*RemoteObject*/ ));
 BA.debugLineNum = 213;BA.debugLine="Sleep(0)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "settheme"),BA.numberCast(int.class, 0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 BA.debugLineNum = 215;BA.debugLine="xpnl_LoadingPanel.Color = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xpnl_loadingpanel" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 216;BA.debugLine="xASVP_Main.LoadingPanelColor = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_setloadingpanelcolor" /*RemoteObject*/ ,__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 217;BA.debugLine="xASVP_Main.Base.Color = m_BodyColor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"setColor",__ref.getField(true,"_m_bodycolor" /*RemoteObject*/ ));
 BA.debugLineNum = 219;BA.debugLine="RefreshHeader";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_refreshheader" /*RemoteObject*/ );
 BA.debugLineNum = 220;BA.debugLine="Refresh";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_refresh" /*RemoteObject*/ );
 BA.debugLineNum = 222;BA.debugLine="Sleep(250)";
Debug.JustUpdateDeviceLine();
parent.__c.runVoidMethod ("Sleep",__ref.getField(false, "ba"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "as_datepicker", "settheme"),BA.numberCast(int.class, 250));
this.state = 8;
return;
case 8:
//C
this.state = 1;
;
 BA.debugLineNum = 224;BA.debugLine="Select m_ThemeChangeTransition";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//select
this.state = 6;
switch (BA.switchObjectToInt(__ref.getField(true,"_m_themechangetransition" /*RemoteObject*/ ),BA.ObjectToString("None"),BA.ObjectToString("Fade"))) {
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
 BA.debugLineNum = 226;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(0,False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xiv_refreshimage" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 228;BA.debugLine="xiv_RefreshImage.SetVisibleAnimated(250,False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xiv_refreshimage" /*RemoteObject*/ ).runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(parent.__c.getField(true,"False")));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _setweeknameproperties(RemoteObject __ref,RemoteObject _weeknameproperties) throws Exception{
try {
		Debug.PushSubsStack("setWeekNameProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1262);
if (RapidSub.canDelegate("setweeknameproperties")) { return __ref.runUserSub(false, "as_datepicker","setweeknameproperties", __ref, _weeknameproperties);}
Debug.locals.put("WeekNameProperties", _weeknameproperties);
 BA.debugLineNum = 1262;BA.debugLine="Public Sub setWeekNameProperties(WeekNamePropertie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1263;BA.debugLine="g_WeekNameProperties = WeekNameProperties";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_weeknameproperties" /*RemoteObject*/ ,_weeknameproperties);
 BA.debugLineNum = 1264;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setweeknameshort(RemoteObject __ref,RemoteObject _weeknameshort) throws Exception{
try {
		Debug.PushSubsStack("setWeekNameShort (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1222);
if (RapidSub.canDelegate("setweeknameshort")) { return __ref.runUserSub(false, "as_datepicker","setweeknameshort", __ref, _weeknameshort);}
Debug.locals.put("WeekNameShort", _weeknameshort);
 BA.debugLineNum = 1222;BA.debugLine="Public Sub setWeekNameShort(WeekNameShort As ASDat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1223;BA.debugLine="g_WeekNameShort = WeekNameShort";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_weeknameshort" /*RemoteObject*/ ,_weeknameshort);
 BA.debugLineNum = 1224;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setweeknumberproperties(RemoteObject __ref,RemoteObject _weeknumberproperties) throws Exception{
try {
		Debug.PushSubsStack("setWeekNumberProperties (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1249);
if (RapidSub.canDelegate("setweeknumberproperties")) { return __ref.runUserSub(false, "as_datepicker","setweeknumberproperties", __ref, _weeknumberproperties);}
Debug.locals.put("WeekNumberProperties", _weeknumberproperties);
 BA.debugLineNum = 1249;BA.debugLine="Public Sub setWeekNumberProperties(WeekNumberPrope";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1250;BA.debugLine="g_WeekNumberProperties = WeekNumberProperties";
Debug.JustUpdateDeviceLine();
__ref.setField ("_g_weeknumberproperties" /*RemoteObject*/ ,_weeknumberproperties);
 BA.debugLineNum = 1251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xasvp_main_lazyloadingaddcontent(RemoteObject __ref,RemoteObject _parent,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("xASVP_Main_LazyLoadingAddContent (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1549);
if (RapidSub.canDelegate("xasvp_main_lazyloadingaddcontent")) { return __ref.runUserSub(false, "as_datepicker","xasvp_main_lazyloadingaddcontent", __ref, _parent, _value);}
Debug.locals.put("Parent", _parent);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1549;BA.debugLine="Private Sub xASVP_Main_LazyLoadingAddContent(Paren";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1550;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1551;BA.debugLine="AddMonth(Parent,Value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addmonth" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(long.class, _value)));
 }else 
{ BA.debugLineNum = 1552;BA.debugLine="Else If m_CurrentView = getCurrentView_YearView O";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ )) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ )) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_centuryview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1553;BA.debugLine="AddYear(Parent,Value)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_addyear" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.numberCast(long.class, _value)));
 }}
;
 BA.debugLineNum = 1555;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xasvp_main_pagechange(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("xASVP_Main_PageChange (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1557);
if (RapidSub.canDelegate("xasvp_main_pagechange")) { return __ref.runUserSub(false, "as_datepicker","xasvp_main_pagechange", __ref, _index);}
RemoteObject _xlbl_header = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _currentdate = RemoteObject.createImmutable(0L);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 1557;BA.debugLine="Private Sub xASVP_Main_PageChange(Index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1558;BA.debugLine="Dim xlbl_Header As B4XView = xpnl_Header.GetView(";
Debug.JustUpdateDeviceLine();
_xlbl_header = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_header = __ref.getField(false,"_xpnl_header" /*RemoteObject*/ ).runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_Header", _xlbl_header);Debug.locals.put("xlbl_Header", _xlbl_header);
 BA.debugLineNum = 1559;BA.debugLine="Dim CurrentDate As Long = xASVP_Main.GetValue(Ind";
Debug.JustUpdateDeviceLine();
_currentdate = BA.numberCast(long.class, __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getvalue" /*RemoteObject*/ ,(Object)(_index)));Debug.locals.put("CurrentDate", _currentdate);Debug.locals.put("CurrentDate", _currentdate);
 BA.debugLineNum = 1560;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1561;BA.debugLine="xlbl_Header.Text = DateUtils.GetMonthName(Current";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(as_datepicker._dateutils.runMethod(true,"_getmonthname",__ref.getField(false, "ba"),(Object)(_currentdate)),RemoteObject.createImmutable(" "),as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)))));
 }else 
{ BA.debugLineNum = 1562;BA.debugLine="else if m_CurrentView = getCurrentView_YearView T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1563;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(true,"setText",BA.ObjectToCharSequence(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate))));
 }else 
{ BA.debugLineNum = 1564;BA.debugLine="else if m_CurrentView = getCurrentView_DecadeView";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1565;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),RemoteObject.createImmutable(" - "),(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),RemoteObject.createImmutable(11)}, "+",1, 1)))));
 }else 
{ BA.debugLineNum = 1566;BA.debugLine="else if m_CurrentView = getCurrentView_CenturyVie";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_centuryview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1567;BA.debugLine="xlbl_Header.Text = DateTime.GetYear(CurrentDate)";
Debug.JustUpdateDeviceLine();
_xlbl_header.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),RemoteObject.createImmutable(" - "),(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currentdate)),RemoteObject.createImmutable(10),RemoteObject.createImmutable(12)}, "+*",1, 1)),RemoteObject.createImmutable(1)}, "-",1, 1)))));
 }}}}
;
 BA.debugLineNum = 1569;BA.debugLine="CustomDrawHeader(CurrentDate)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_customdrawheader" /*RemoteObject*/ ,(Object)(_currentdate));
 BA.debugLineNum = 1570;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xasvp_main_pagechanged(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("xASVP_Main_PageChanged (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1545);
if (RapidSub.canDelegate("xasvp_main_pagechanged")) { return __ref.runUserSub(false, "as_datepicker","xasvp_main_pagechanged", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 1545;BA.debugLine="Private Sub xASVP_Main_PageChanged(Index As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1546;BA.debugLine="PageChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_pagechanged" /*RemoteObject*/ );
 BA.debugLineNum = 1547;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xasvp_main_pagechanged2(RemoteObject __ref,RemoteObject _newindex,RemoteObject _oldindex) throws Exception{
try {
		Debug.PushSubsStack("xASVP_Main_PageChanged2 (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,450);
if (RapidSub.canDelegate("xasvp_main_pagechanged2")) { return __ref.runUserSub(false, "as_datepicker","xasvp_main_pagechanged2", __ref, _newindex, _oldindex);}
RemoteObject _forward = RemoteObject.createImmutable(false);
RemoteObject _doit = RemoteObject.createImmutable(false);
RemoteObject _xpnl_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _p2 = RemoteObject.declareNull("b4a.example.dateutils._period");
RemoteObject _currenttime = RemoteObject.createImmutable(0L);
RemoteObject _firstdayofmonth = RemoteObject.createImmutable(0L);
Debug.locals.put("NewIndex", _newindex);
Debug.locals.put("OldIndex", _oldindex);
 BA.debugLineNum = 450;BA.debugLine="Private Sub xASVP_Main_PageChanged2(NewIndex As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 452;BA.debugLine="If m_MinDate > 0 And m_MaxDate > 0 Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 454;BA.debugLine="Dim Forward As Boolean = False";
Debug.JustUpdateDeviceLine();
_forward = as_datepicker.__c.getField(true,"False");Debug.locals.put("Forward", _forward);Debug.locals.put("Forward", _forward);
 BA.debugLineNum = 455;BA.debugLine="Dim DoIt As Boolean = False";
Debug.JustUpdateDeviceLine();
_doit = as_datepicker.__c.getField(true,"False");Debug.locals.put("DoIt", _doit);Debug.locals.put("DoIt", _doit);
 BA.debugLineNum = 457;BA.debugLine="If NewIndex <= OldIndex Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_newindex,BA.numberCast(double.class, _oldindex))) { 
 BA.debugLineNum = 458;BA.debugLine="If NewIndex <= 2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("k",_newindex,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 459;BA.debugLine="DoIt = True";
Debug.JustUpdateDeviceLine();
_doit = as_datepicker.__c.getField(true,"True");Debug.locals.put("DoIt", _doit);
 BA.debugLineNum = 460;BA.debugLine="Forward = False";
Debug.JustUpdateDeviceLine();
_forward = as_datepicker.__c.getField(true,"False");Debug.locals.put("Forward", _forward);
 };
 }else {
 BA.debugLineNum = 463;BA.debugLine="If NewIndex = xASVP_Main.Size -2 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_newindex,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "-",1, 1)))) { 
 BA.debugLineNum = 464;BA.debugLine="DoIt = True";
Debug.JustUpdateDeviceLine();
_doit = as_datepicker.__c.getField(true,"True");Debug.locals.put("DoIt", _doit);
 BA.debugLineNum = 465;BA.debugLine="Forward = True";
Debug.JustUpdateDeviceLine();
_forward = as_datepicker.__c.getField(true,"True");Debug.locals.put("Forward", _forward);
 };
 };
 BA.debugLineNum = 469;BA.debugLine="If DoIt Then";
Debug.JustUpdateDeviceLine();
if (_doit.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 471;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 472;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
Debug.JustUpdateDeviceLine();
_xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Background", _xpnl_background);Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 473;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_background.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 474;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 476;BA.debugLine="Dim p2 As Period";
Debug.JustUpdateDeviceLine();
_p2 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 477;BA.debugLine="p2.Initialize";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethod ("Initialize");
 BA.debugLineNum = 478;BA.debugLine="p2.Months = IIf(Forward,1,-1)";
Debug.JustUpdateDeviceLine();
_p2.setField ("Months",BA.numberCast(int.class, ((_forward.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((-(double) (0 + 1)))))));
 BA.debugLineNum = 480;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
Debug.JustUpdateDeviceLine();
_currenttime = as_datepicker._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((_forward.<Boolean>get().booleanValue()) ? ((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))) : (RemoteObject.createImmutable((0))))))))),(Object)(_p2));Debug.locals.put("CurrentTime", _currenttime);Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 481;BA.debugLine="Dim FirstDayOfMonth As Long = DateUtils.SetDate";
Debug.JustUpdateDeviceLine();
_firstdayofmonth = as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_currenttime))),(Object)(BA.numberCast(int.class, 1)));Debug.locals.put("FirstDayOfMonth", _firstdayofmonth);Debug.locals.put("FirstDayOfMonth", _firstdayofmonth);
 BA.debugLineNum = 483;BA.debugLine="If Forward Then";
Debug.JustUpdateDeviceLine();
if (_forward.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 484;BA.debugLine="If m_MaxDate > 0 And FirstDayOfMonth > DateUti";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",_firstdayofmonth,as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 485;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 487;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,FirstDayOfM";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpage" /*RemoteObject*/ ,(Object)(_xpnl_background),(Object)((_firstdayofmonth)));
 }else {
 BA.debugLineNum = 489;BA.debugLine="If m_MinDate > 0 And FirstDayOfMonth < DateUti";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("<",_firstdayofmonth,as_datepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))),(Object)(as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))),(Object)(BA.numberCast(int.class, 1))))) { 
 BA.debugLineNum = 490;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 492;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,FirstDa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpageat" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(_xpnl_background),(Object)((_firstdayofmonth)));
 };
 }else 
{ BA.debugLineNum = 495;BA.debugLine="else If m_CurrentView = getCurrentView_YearView";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 497;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePane";
Debug.JustUpdateDeviceLine();
_xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Background", _xpnl_background);Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 498;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_background.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 499;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_Vi";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 501;BA.debugLine="Dim p2 As Period";
Debug.JustUpdateDeviceLine();
_p2 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 502;BA.debugLine="p2.Initialize";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethod ("Initialize");
 BA.debugLineNum = 503;BA.debugLine="p2.Years = IIf(Forward,1,-1)";
Debug.JustUpdateDeviceLine();
_p2.setField ("Years",BA.numberCast(int.class, ((_forward.<Boolean>get().booleanValue()) ? (RemoteObject.createImmutable((1))) : (RemoteObject.createImmutable((-(double) (0 + 1)))))));
 BA.debugLineNum = 505;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(x";
Debug.JustUpdateDeviceLine();
_currenttime = as_datepicker._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, ((_forward.<Boolean>get().booleanValue()) ? ((RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))) : (RemoteObject.createImmutable((0))))))))),(Object)(_p2));Debug.locals.put("CurrentTime", _currenttime);Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 508;BA.debugLine="If Forward Then";
Debug.JustUpdateDeviceLine();
if (_forward.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 509;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 510;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 512;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpage" /*RemoteObject*/ ,(Object)(_xpnl_background),(Object)((_currenttime)));
 }else {
 BA.debugLineNum = 514;BA.debugLine="If m_MinDate > 0 And DateTime.GetYear(CurrentT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_mindate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean("<",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_mindate" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 515;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 517;BA.debugLine="xASVP_Main.AddPageAt(0,xpnl_Background,Current";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpageat" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(_xpnl_background),(Object)((_currenttime)));
 };
 }else 
{ BA.debugLineNum = 520;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeVie";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 522;BA.debugLine="If Forward Then";
Debug.JustUpdateDeviceLine();
if (_forward.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 524;BA.debugLine="Dim xpnl_Background As B4XView = xui.CreatePan";
Debug.JustUpdateDeviceLine();
_xpnl_background = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_background = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_Background", _xpnl_background);Debug.locals.put("xpnl_Background", _xpnl_background);
 BA.debugLineNum = 525;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
Debug.JustUpdateDeviceLine();
_xpnl_background.runMethod(true,"setColor",__ref.getField(false,"_xui" /*RemoteObject*/ ).getField(true,"Color_Transparent"));
 BA.debugLineNum = 526;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,0,0,xpnl_V";
Debug.JustUpdateDeviceLine();
_xpnl_background.runVoidMethod ("SetLayoutAnimated",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_xpnl_viewpager" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 528;BA.debugLine="Dim p2 As Period";
Debug.JustUpdateDeviceLine();
_p2 = RemoteObject.createNew ("b4a.example.dateutils._period");Debug.locals.put("p2", _p2);
 BA.debugLineNum = 529;BA.debugLine="p2.Initialize";
Debug.JustUpdateDeviceLine();
_p2.runVoidMethod ("Initialize");
 BA.debugLineNum = 530;BA.debugLine="p2.Years = 10";
Debug.JustUpdateDeviceLine();
_p2.setField ("Years",BA.numberCast(int.class, 10));
 BA.debugLineNum = 532;BA.debugLine="Dim CurrentTime As Long = DateUtils.AddPeriod(";
Debug.JustUpdateDeviceLine();
_currenttime = as_datepicker._dateutils.runMethod(true,"_addperiod",__ref.getField(false, "ba"),(Object)(BA.numberCast(long.class, __ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getvalue" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_getsize" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1))))),(Object)(_p2));Debug.locals.put("CurrentTime", _currenttime);Debug.locals.put("CurrentTime", _currenttime);
 BA.debugLineNum = 535;BA.debugLine="If m_MaxDate > 0 And DateTime.GetYear(CurrentT";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_m_maxdate" /*RemoteObject*/ ),BA.numberCast(long.class, 0)) && RemoteObject.solveBoolean(">",as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_currenttime)),BA.numberCast(double.class, as_datepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(__ref.getField(true,"_m_maxdate" /*RemoteObject*/ )))))) { 
 BA.debugLineNum = 536;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 538;BA.debugLine="xASVP_Main.AddPage(xpnl_Background,CurrentTime";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_addpage" /*RemoteObject*/ ,(Object)(_xpnl_background),(Object)((_currenttime)));
 };
 }}}
;
 };
 BA.debugLineNum = 545;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlbl_header_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_Header_Click (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1595);
if (RapidSub.canDelegate("xlbl_header_click")) { return __ref.runUserSub(false, "as_datepicker","xlbl_header_click", __ref);}
 BA.debugLineNum = 1595;BA.debugLine="Private Sub xlbl_Header_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1597;BA.debugLine="If m_CurrentView = getCurrentView_MonthView Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1598;BA.debugLine="ChangeView(getCurrentView_YearView)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_changeview" /*void*/ ,(Object)(__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ )));
 }else 
{ BA.debugLineNum = 1599;BA.debugLine="else If m_CurrentView = getCurrentView_YearView T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1600;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_changeview" /*void*/ ,(Object)(__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ )));
 }else 
{ BA.debugLineNum = 1601;BA.debugLine="else If m_CurrentView = getCurrentView_DecadeView";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_currentview" /*RemoteObject*/ ),__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ ))) { 
 BA.debugLineNum = 1602;BA.debugLine="ChangeView(getCurrentView_CenturyView)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_changeview" /*void*/ ,(Object)(__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_centuryview" /*RemoteObject*/ )));
 }}}
;
 BA.debugLineNum = 1604;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlbl_headerarrowleft_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_HeaderArrowLeft_Click (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1583);
if (RapidSub.canDelegate("xlbl_headerarrowleft_click")) { return __ref.runUserSub(false, "as_datepicker","xlbl_headerarrowleft_click", __ref);}
 BA.debugLineNum = 1583;BA.debugLine="Private Sub xlbl_HeaderArrowLeft_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1584;BA.debugLine="xASVP_Main.PreviousPage";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_previouspage" /*RemoteObject*/ );
 BA.debugLineNum = 1585;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xlbl_headerarrowright_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xlbl_HeaderArrowRight_Click (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1586);
if (RapidSub.canDelegate("xlbl_headerarrowright_click")) { return __ref.runUserSub(false, "as_datepicker","xlbl_headerarrowright_click", __ref);}
 BA.debugLineNum = 1586;BA.debugLine="Private Sub xlbl_HeaderArrowRight_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1587;BA.debugLine="xASVP_Main.NextPage";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xasvp_main" /*RemoteObject*/ ).runClassMethod (b4a.example.ef.asviewpager.class, "_nextpage" /*RemoteObject*/ );
 BA.debugLineNum = 1588;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_centurydecade_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_CenturyDecade_Click (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1655);
if (RapidSub.canDelegate("xpnl_centurydecade_click")) { return __ref.runUserSub(false, "as_datepicker","xpnl_centurydecade_click", __ref);}
RemoteObject _xpnl_centurydecade = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1655;BA.debugLine="Private Sub xpnl_CenturyDecade_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1657;BA.debugLine="Dim xpnl_CenturyDecade As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_xpnl_centurydecade = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_centurydecade = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), as_datepicker.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xpnl_CenturyDecade", _xpnl_centurydecade);Debug.locals.put("xpnl_CenturyDecade", _xpnl_centurydecade);
 BA.debugLineNum = 1658;BA.debugLine="m_StartDate = xpnl_CenturyDecade.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_startdate" /*RemoteObject*/ ,BA.numberCast(long.class, _xpnl_centurydecade.runMethod(false,"getTag")));
 BA.debugLineNum = 1659;BA.debugLine="ChangeView(getCurrentView_DecadeView)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_changeview" /*void*/ ,(Object)(__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_decadeview" /*RemoteObject*/ )));
 BA.debugLineNum = 1660;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_decadeyear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_DecadeYear_Click (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1610);
if (RapidSub.canDelegate("xpnl_decadeyear_click")) { return __ref.runUserSub(false, "as_datepicker","xpnl_decadeyear_click", __ref);}
RemoteObject _xpnl_decadeyear = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1610;BA.debugLine="Private Sub xpnl_DecadeYear_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1612;BA.debugLine="Dim xpnl_DecadeYear As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_xpnl_decadeyear = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_decadeyear = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), as_datepicker.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xpnl_DecadeYear", _xpnl_decadeyear);Debug.locals.put("xpnl_DecadeYear", _xpnl_decadeyear);
 BA.debugLineNum = 1613;BA.debugLine="m_StartDate = xpnl_DecadeYear.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_startdate" /*RemoteObject*/ ,BA.numberCast(long.class, _xpnl_decadeyear.runMethod(false,"getTag")));
 BA.debugLineNum = 1614;BA.debugLine="ChangeView(getCurrentView_YearView)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_changeview" /*void*/ ,(Object)(__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_yearview" /*RemoteObject*/ )));
 BA.debugLineNum = 1615;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_monthdate_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_MonthDate_Click (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1694);
if (RapidSub.canDelegate("xpnl_monthdate_click")) { return __ref.runUserSub(false, "as_datepicker","xpnl_monthdate_click", __ref);}
 BA.debugLineNum = 1694;BA.debugLine="Private Sub xpnl_MonthDate_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1696;BA.debugLine="MonthDateClick(Sender,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_monthdateclick" /*RemoteObject*/ ,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), as_datepicker.__c.runMethod(false,"Sender",__ref.getField(false, "ba"))),(Object)(as_datepicker.__c.getField(true,"True")));
 BA.debugLineNum = 1697;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _xpnl_yearmonth_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("xpnl_YearMonth_Click (as_datepicker) ","as_datepicker",22,__ref.getField(false, "ba"),__ref,1621);
if (RapidSub.canDelegate("xpnl_yearmonth_click")) { return __ref.runUserSub(false, "as_datepicker","xpnl_yearmonth_click", __ref);}
RemoteObject _xpnl_yearmonth = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xlbl_date = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
RemoteObject _xpnl_selected = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
 BA.debugLineNum = 1621;BA.debugLine="Private Sub xpnl_YearMonth_Click";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1623;BA.debugLine="Dim xpnl_YearMonth As B4XView = Sender";
Debug.JustUpdateDeviceLine();
_xpnl_yearmonth = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_yearmonth = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), as_datepicker.__c.runMethod(false,"Sender",__ref.getField(false, "ba")));Debug.locals.put("xpnl_YearMonth", _xpnl_yearmonth);Debug.locals.put("xpnl_YearMonth", _xpnl_yearmonth);
 BA.debugLineNum = 1624;BA.debugLine="m_StartDate = xpnl_YearMonth.Tag";
Debug.JustUpdateDeviceLine();
__ref.setField ("_m_startdate" /*RemoteObject*/ ,BA.numberCast(long.class, _xpnl_yearmonth.runMethod(false,"getTag")));
 BA.debugLineNum = 1625;BA.debugLine="If m_SelectMode = \"Date\"  Or m_SelectMode = \"Rang";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Date")) || RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Range"))) { 
 BA.debugLineNum = 1626;BA.debugLine="ChangeView(getCurrentView_MonthView)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_changeview" /*void*/ ,(Object)(__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_getcurrentview_monthview" /*RemoteObject*/ )));
 }else 
{ BA.debugLineNum = 1627;BA.debugLine="Else If m_SelectMode = \"Month\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_selectmode" /*RemoteObject*/ ),BA.ObjectToString("Month"))) { 
 BA.debugLineNum = 1628;BA.debugLine="SelectedDateChanged(xpnl_YearMonth.Tag)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4a.example.ef.as_datepicker.class, "_selecteddatechanged" /*RemoteObject*/ ,(Object)(BA.numberCast(long.class, _xpnl_yearmonth.runMethod(false,"getTag"))));
 BA.debugLineNum = 1630;BA.debugLine="If m_MouseHoverFeedback = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_m_mousehoverfeedback" /*RemoteObject*/ ),as_datepicker.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1631;BA.debugLine="Dim xlbl_Date As B4XView = xpnl_YearMonth.GetVi";
Debug.JustUpdateDeviceLine();
_xlbl_date = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xlbl_date = _xpnl_yearmonth.runMethod(false,"GetView",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("xlbl_Date", _xlbl_date);Debug.locals.put("xlbl_Date", _xlbl_date);
 BA.debugLineNum = 1632;BA.debugLine="If xlbl_Date.Visible = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_xlbl_date.runMethod(true,"getVisible"),as_datepicker.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 1636;BA.debugLine="Dim xpnl_selected As B4XView = xui.CreatePanel(";
Debug.JustUpdateDeviceLine();
_xpnl_selected = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
_xpnl_selected = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("xpnl_selected", _xpnl_selected);Debug.locals.put("xpnl_selected", _xpnl_selected);
 BA.debugLineNum = 1637;BA.debugLine="xpnl_YearMonth.AddView(xpnl_selected,0,0,xpnl_Y";
Debug.JustUpdateDeviceLine();
_xpnl_yearmonth.runVoidMethod ("AddView",(Object)((_xpnl_selected.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_xpnl_yearmonth.runMethod(true,"getWidth")),(Object)(_xpnl_yearmonth.runMethod(true,"getHeight")));
 BA.debugLineNum = 1639;BA.debugLine="xpnl_selected.SetColorAndBorder(m_SelectedDateC";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runVoidMethod ("SetColorAndBorder",(Object)(__ref.getField(true,"_m_selecteddatecolor" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(as_datepicker.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 1640;BA.debugLine="xpnl_selected.SendToBack";
Debug.JustUpdateDeviceLine();
_xpnl_selected.runVoidMethod ("SendToBack");
 BA.debugLineNum = 1641;BA.debugLine="If xpnl_SelectedDate <> Null And xpnl_SelectedD";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ )) && RemoteObject.solveBoolean("=",__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runMethod(true,"IsInitialized"),as_datepicker.__c.getField(true,"True"))) { 
__ref.getField(false,"_xpnl_selecteddate" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");};
 BA.debugLineNum = 1642;BA.debugLine="xpnl_SelectedDate = xpnl_selected";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xpnl_selecteddate" /*RemoteObject*/ ,_xpnl_selected);
 };
 }}
;
 BA.debugLineNum = 1649;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}