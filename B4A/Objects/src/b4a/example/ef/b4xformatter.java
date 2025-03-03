package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xformatter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xformatter");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xformatter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _b4xformatdata{
public boolean IsInitialized;
public String Prefix;
public String Postfix;
public int MinimumIntegers;
public int MinimumFractions;
public int MaximumFractions;
public String GroupingCharacter;
public String DecimalPoint;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont FormatFont;
public double RangeStart;
public double RangeEnd;
public boolean RemoveMinusSign;
public String IntegerPaddingChar;
public String FractionPaddingChar;
public void Initialize() {
IsInitialized = true;
Prefix = "";
Postfix = "";
MinimumIntegers = 0;
MinimumFractions = 0;
MaximumFractions = 0;
GroupingCharacter = "";
DecimalPoint = "";
TextColor = 0;
FormatFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RangeStart = 0;
RangeEnd = 0;
RemoveMinusSign = false;
IntegerPaddingChar = "";
FractionPaddingChar = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _formats = null;
public int _max_value = 0;
public int _min_value = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _formatlabel(b4a.example.ef.b4xformatter __ref,double _number,anywheresoftware.b4a.objects.B4XViewWrapper _label) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "formatlabel", true))
	 {return ((String) Debug.delegate(ba, "formatlabel", new Object[] {_number,_label}));}
b4a.example.ef.b4xformatter._b4xformatdata _data = null;
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Public Sub FormatLabel (Number As Double, Label As";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="Label.Text = Format(Number)";
_label.setText(BA.ObjectToCharSequence(__ref._format /*String*/ (null,_number)));
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="Dim data As B4XFormatData = GetFormatData(Number)";
_data = __ref._getformatdata /*b4a.example.ef.b4xformatter._b4xformatdata*/ (null,_number);
RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="If data.TextColor <> 0 Then Label.TextColor = dat";
if (_data.TextColor /*int*/ !=0) { 
_label.setTextColor(_data.TextColor /*int*/ );};
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="If data.FormatFont.IsInitialized Then Label.Font";
if (_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getIsInitialized()) { 
_label.setFont(_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );};
RDebugUtils.currentLine=40239109;
 //BA.debugLineNum = 40239109;BA.debugLine="End Sub";
return "";
}
public String  _format(b4a.example.ef.b4xformatter __ref,double _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "format", true))
	 {return ((String) Debug.delegate(ba, "format", new Object[] {_number}));}
b4a.example.ef.b4xformatter._b4xformatdata _data = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _numberstartindex = 0;
double _factor = 0;
int _whole = 0;
double _frac = 0;
int _g = 0;
int _fracstartindex = 0;
int _lastzerocount = 0;
int _multipler = 0;
int _w = 0;
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Public Sub Format (Number As Double) As String";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="If Number < MIN_VALUE Or Number > MAX_VALUE Then";
if (_number<__ref._min_value /*int*/  || _number>__ref._max_value /*int*/ ) { 
if (true) return "OVERFLOW";};
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="Dim data As B4XFormatData = GetFormatData (Number";
_data = __ref._getformatdata /*b4a.example.ef.b4xformatter._b4xformatdata*/ (null,_number);
RDebugUtils.currentLine=40173571;
 //BA.debugLineNum = 40173571;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=40173572;
 //BA.debugLineNum = 40173572;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=40173573;
 //BA.debugLineNum = 40173573;BA.debugLine="sb.Append(data.Prefix)";
_sb.Append(_data.Prefix /*String*/ );
RDebugUtils.currentLine=40173574;
 //BA.debugLineNum = 40173574;BA.debugLine="Dim NumberStartIndex As Int = sb.Length";
_numberstartindex = _sb.getLength();
RDebugUtils.currentLine=40173575;
 //BA.debugLineNum = 40173575;BA.debugLine="Dim factor As Double = Power(10, -data.MaximumFra";
_factor = __c.Power(10,-_data.MaximumFractions /*int*/ -1)*5;
RDebugUtils.currentLine=40173576;
 //BA.debugLineNum = 40173576;BA.debugLine="If Number < -factor And data.RemoveMinusSign = Fa";
if (_number<-_factor && _data.RemoveMinusSign /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=40173577;
 //BA.debugLineNum = 40173577;BA.debugLine="sb.Append(\"-\")";
_sb.Append("-");
RDebugUtils.currentLine=40173578;
 //BA.debugLineNum = 40173578;BA.debugLine="NumberStartIndex = NumberStartIndex + 1";
_numberstartindex = (int) (_numberstartindex+1);
 };
RDebugUtils.currentLine=40173580;
 //BA.debugLineNum = 40173580;BA.debugLine="Number = Abs(Number) + factor";
_number = __c.Abs(_number)+_factor;
RDebugUtils.currentLine=40173581;
 //BA.debugLineNum = 40173581;BA.debugLine="Dim whole As Int = Number";
_whole = (int) (_number);
RDebugUtils.currentLine=40173582;
 //BA.debugLineNum = 40173582;BA.debugLine="Dim frac As Double = Number - whole";
_frac = _number-_whole;
RDebugUtils.currentLine=40173583;
 //BA.debugLineNum = 40173583;BA.debugLine="Dim g As Int";
_g = 0;
RDebugUtils.currentLine=40173584;
 //BA.debugLineNum = 40173584;BA.debugLine="Do While whole > 0";
while (_whole>0) {
RDebugUtils.currentLine=40173585;
 //BA.debugLineNum = 40173585;BA.debugLine="If g > 0 And g Mod 3 = 0 And data.GroupingCharac";
if (_g>0 && _g%3==0 && _data.GroupingCharacter /*String*/ .length()>0) { 
RDebugUtils.currentLine=40173586;
 //BA.debugLineNum = 40173586;BA.debugLine="sb.Insert(NumberStartIndex, data.GroupingCharac";
_sb.Insert(_numberstartindex,_data.GroupingCharacter /*String*/ );
 };
RDebugUtils.currentLine=40173588;
 //BA.debugLineNum = 40173588;BA.debugLine="g = g + 1";
_g = (int) (_g+1);
RDebugUtils.currentLine=40173589;
 //BA.debugLineNum = 40173589;BA.debugLine="sb.Insert(NumberStartIndex, whole Mod 10)";
_sb.Insert(_numberstartindex,BA.NumberToString(_whole%10));
RDebugUtils.currentLine=40173590;
 //BA.debugLineNum = 40173590;BA.debugLine="whole = whole / 10";
_whole = (int) (_whole/(double)10);
 }
;
RDebugUtils.currentLine=40173592;
 //BA.debugLineNum = 40173592;BA.debugLine="Do While sb.Length - NumberStartIndex < data.Mini";
while (_sb.getLength()-_numberstartindex<_data.MinimumIntegers /*int*/ ) {
RDebugUtils.currentLine=40173593;
 //BA.debugLineNum = 40173593;BA.debugLine="sb.Insert(NumberStartIndex, data.IntegerPaddingC";
_sb.Insert(_numberstartindex,_data.IntegerPaddingChar /*String*/ );
 }
;
RDebugUtils.currentLine=40173595;
 //BA.debugLineNum = 40173595;BA.debugLine="If data.MaximumFractions > 0 And (data.MinimumFra";
if (_data.MaximumFractions /*int*/ >0 && (_data.MinimumFractions /*int*/ >0 || _frac>0)) { 
RDebugUtils.currentLine=40173596;
 //BA.debugLineNum = 40173596;BA.debugLine="Dim FracStartIndex As Int = sb.Length";
_fracstartindex = _sb.getLength();
RDebugUtils.currentLine=40173597;
 //BA.debugLineNum = 40173597;BA.debugLine="Dim LastZeroCount As Int";
_lastzerocount = 0;
RDebugUtils.currentLine=40173598;
 //BA.debugLineNum = 40173598;BA.debugLine="Dim Multipler As Int = 10";
_multipler = (int) (10);
RDebugUtils.currentLine=40173599;
 //BA.debugLineNum = 40173599;BA.debugLine="Do While frac >= 2 * factor And sb.Length - Frac";
while (_frac>=2*_factor && _sb.getLength()-_fracstartindex<_data.MaximumFractions /*int*/ ) {
RDebugUtils.currentLine=40173600;
 //BA.debugLineNum = 40173600;BA.debugLine="Dim w As Int = (frac * Multipler)";
_w = (int) ((_frac*_multipler));
RDebugUtils.currentLine=40173601;
 //BA.debugLineNum = 40173601;BA.debugLine="w = w Mod 10";
_w = (int) (_w%10);
RDebugUtils.currentLine=40173602;
 //BA.debugLineNum = 40173602;BA.debugLine="If w = 0 Then LastZeroCount = LastZeroCount + 1";
if (_w==0) { 
_lastzerocount = (int) (_lastzerocount+1);}
else {
_lastzerocount = (int) (0);};
RDebugUtils.currentLine=40173603;
 //BA.debugLineNum = 40173603;BA.debugLine="sb.Append(w)";
_sb.Append(BA.NumberToString(_w));
RDebugUtils.currentLine=40173604;
 //BA.debugLineNum = 40173604;BA.debugLine="Multipler = Multipler * 10";
_multipler = (int) (_multipler*10);
 }
;
RDebugUtils.currentLine=40173606;
 //BA.debugLineNum = 40173606;BA.debugLine="If data.FractionPaddingChar <> \"0\" And LastZeroC";
if ((_data.FractionPaddingChar /*String*/ ).equals("0") == false && _lastzerocount>0) { 
RDebugUtils.currentLine=40173607;
 //BA.debugLineNum = 40173607;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_lastzerocount),_sb.getLength());
RDebugUtils.currentLine=40173608;
 //BA.debugLineNum = 40173608;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 };
RDebugUtils.currentLine=40173610;
 //BA.debugLineNum = 40173610;BA.debugLine="Do While sb.Length - FracStartIndex < data.Minim";
while (_sb.getLength()-_fracstartindex<_data.MinimumFractions /*int*/ ) {
RDebugUtils.currentLine=40173611;
 //BA.debugLineNum = 40173611;BA.debugLine="sb.Append(data.FractionPaddingChar)";
_sb.Append(_data.FractionPaddingChar /*String*/ );
RDebugUtils.currentLine=40173612;
 //BA.debugLineNum = 40173612;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 }
;
RDebugUtils.currentLine=40173614;
 //BA.debugLineNum = 40173614;BA.debugLine="LastZeroCount = Min(LastZeroCount, sb.Length - F";
_lastzerocount = (int) (__c.Min(_lastzerocount,_sb.getLength()-_fracstartindex-_data.MinimumFractions /*int*/ ));
RDebugUtils.currentLine=40173615;
 //BA.debugLineNum = 40173615;BA.debugLine="If LastZeroCount > 0 Then";
if (_lastzerocount>0) { 
RDebugUtils.currentLine=40173616;
 //BA.debugLineNum = 40173616;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
_sb.Remove((int) (_sb.getLength()-_lastzerocount),_sb.getLength());
 };
RDebugUtils.currentLine=40173618;
 //BA.debugLineNum = 40173618;BA.debugLine="If sb.Length > FracStartIndex Then sb.Insert(Fra";
if (_sb.getLength()>_fracstartindex) { 
_sb.Insert(_fracstartindex,_data.DecimalPoint /*String*/ );};
 };
RDebugUtils.currentLine=40173620;
 //BA.debugLineNum = 40173620;BA.debugLine="sb.Append(data.Postfix)";
_sb.Append(_data.Postfix /*String*/ );
RDebugUtils.currentLine=40173621;
 //BA.debugLineNum = 40173621;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=40173622;
 //BA.debugLineNum = 40173622;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xformatter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
b4a.example.ef.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="formats.Initialize";
__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="Dim d As B4XFormatData = CreateDefaultFormat";
_d = __ref._createdefaultformat /*b4a.example.ef.b4xformatter._b4xformatdata*/ (null);
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="AddFormatData(d, MIN_VALUE, MAX_VALUE, True)";
__ref._addformatdata /*String*/ (null,_d,__ref._min_value /*int*/ ,__ref._max_value /*int*/ ,__c.True);
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="End Sub";
return "";
}
public String  _addformatdata(b4a.example.ef.b4xformatter __ref,b4a.example.ef.b4xformatter._b4xformatdata _data,double _rangestart,double _rangeend,boolean _includeedges) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "addformatdata", true))
	 {return ((String) Debug.delegate(ba, "addformatdata", new Object[] {_data,_rangestart,_rangeend,_includeedges}));}
double _factor = 0;
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Public Sub AddFormatData (Data As B4XFormatData, R";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="Dim factor As Double = Power(10, -Data.MaximumFra";
_factor = __c.Power(10,-_data.MaximumFractions /*int*/ );
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="If IncludeEdges = False Then";
if (_includeedges==__c.False) { 
RDebugUtils.currentLine=39976963;
 //BA.debugLineNum = 39976963;BA.debugLine="RangeStart = RangeStart + factor";
_rangestart = _rangestart+_factor;
RDebugUtils.currentLine=39976964;
 //BA.debugLineNum = 39976964;BA.debugLine="RangeEnd = RangeEnd - factor";
_rangeend = _rangeend-_factor;
 };
RDebugUtils.currentLine=39976966;
 //BA.debugLineNum = 39976966;BA.debugLine="RangeStart = RangeStart - factor / 2";
_rangestart = _rangestart-_factor/(double)2;
RDebugUtils.currentLine=39976967;
 //BA.debugLineNum = 39976967;BA.debugLine="RangeEnd = RangeEnd + factor / 2";
_rangeend = _rangeend+_factor/(double)2;
RDebugUtils.currentLine=39976968;
 //BA.debugLineNum = 39976968;BA.debugLine="Data.RangeStart = RangeStart";
_data.RangeStart /*double*/  = _rangestart;
RDebugUtils.currentLine=39976969;
 //BA.debugLineNum = 39976969;BA.debugLine="Data.RangeEnd = RangeEnd";
_data.RangeEnd /*double*/  = _rangeend;
RDebugUtils.currentLine=39976970;
 //BA.debugLineNum = 39976970;BA.debugLine="formats.Add(Data)";
__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_data));
RDebugUtils.currentLine=39976971;
 //BA.debugLineNum = 39976971;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="Type B4XFormatData (Prefix As String, Postfix As";
;
RDebugUtils.currentLine=39649285;
 //BA.debugLineNum = 39649285;BA.debugLine="Private formats As List";
_formats = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39649286;
 //BA.debugLineNum = 39649286;BA.debugLine="Public Const MAX_VALUE = 0x7fffffff, MIN_VALUE =";
_max_value = ((int)0x7fffffff);
_min_value = ((int)0x80000000);
RDebugUtils.currentLine=39649288;
 //BA.debugLineNum = 39649288;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=39649290;
 //BA.debugLineNum = 39649290;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.b4xformatter._b4xformatdata  _copyformatdata(b4a.example.ef.b4xformatter __ref,b4a.example.ef.b4xformatter._b4xformatdata _data) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "copyformatdata", true))
	 {return ((b4a.example.ef.b4xformatter._b4xformatdata) Debug.delegate(ba, "copyformatdata", new Object[] {_data}));}
b4a.example.ef.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Public Sub CopyFormatData (Data As B4XFormatData)";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="Dim d As B4XFormatData";
_d = new b4a.example.ef.b4xformatter._b4xformatdata();
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="d.Initialize";
_d.Initialize();
RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="d.DecimalPoint = Data.DecimalPoint";
_d.DecimalPoint /*String*/  = _data.DecimalPoint /*String*/ ;
RDebugUtils.currentLine=39911428;
 //BA.debugLineNum = 39911428;BA.debugLine="If Data.FormatFont.IsInitialized Then";
if (_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getIsInitialized()) { 
RDebugUtils.currentLine=39911430;
 //BA.debugLineNum = 39911430;BA.debugLine="d.FormatFont = xui.CreateFont(Data.FormatFont.To";
_d.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateFont((android.graphics.Typeface)(_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .ToNativeFont().getObject()),_data.FormatFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ .getSize());
 };
RDebugUtils.currentLine=39911433;
 //BA.debugLineNum = 39911433;BA.debugLine="d.GroupingCharacter = Data.GroupingCharacter";
_d.GroupingCharacter /*String*/  = _data.GroupingCharacter /*String*/ ;
RDebugUtils.currentLine=39911434;
 //BA.debugLineNum = 39911434;BA.debugLine="d.MaximumFractions = Data.MaximumFractions";
_d.MaximumFractions /*int*/  = _data.MaximumFractions /*int*/ ;
RDebugUtils.currentLine=39911435;
 //BA.debugLineNum = 39911435;BA.debugLine="d.MinimumFractions = Data.MinimumFractions";
_d.MinimumFractions /*int*/  = _data.MinimumFractions /*int*/ ;
RDebugUtils.currentLine=39911436;
 //BA.debugLineNum = 39911436;BA.debugLine="d.MinimumIntegers = Data.MinimumIntegers";
_d.MinimumIntegers /*int*/  = _data.MinimumIntegers /*int*/ ;
RDebugUtils.currentLine=39911437;
 //BA.debugLineNum = 39911437;BA.debugLine="d.Postfix = Data.Postfix";
_d.Postfix /*String*/  = _data.Postfix /*String*/ ;
RDebugUtils.currentLine=39911438;
 //BA.debugLineNum = 39911438;BA.debugLine="d.Prefix = Data.Prefix";
_d.Prefix /*String*/  = _data.Prefix /*String*/ ;
RDebugUtils.currentLine=39911439;
 //BA.debugLineNum = 39911439;BA.debugLine="d.RangeEnd = Data.RangeEnd";
_d.RangeEnd /*double*/  = _data.RangeEnd /*double*/ ;
RDebugUtils.currentLine=39911440;
 //BA.debugLineNum = 39911440;BA.debugLine="d.RangeStart = Data.RangeStart";
_d.RangeStart /*double*/  = _data.RangeStart /*double*/ ;
RDebugUtils.currentLine=39911441;
 //BA.debugLineNum = 39911441;BA.debugLine="d.RemoveMinusSign = Data.RemoveMinusSign";
_d.RemoveMinusSign /*boolean*/  = _data.RemoveMinusSign /*boolean*/ ;
RDebugUtils.currentLine=39911442;
 //BA.debugLineNum = 39911442;BA.debugLine="d.TextColor = Data.TextColor";
_d.TextColor /*int*/  = _data.TextColor /*int*/ ;
RDebugUtils.currentLine=39911443;
 //BA.debugLineNum = 39911443;BA.debugLine="d.FractionPaddingChar = Data.FractionPaddingChar";
_d.FractionPaddingChar /*String*/  = _data.FractionPaddingChar /*String*/ ;
RDebugUtils.currentLine=39911444;
 //BA.debugLineNum = 39911444;BA.debugLine="d.IntegerPaddingChar = Data.IntegerPaddingChar";
_d.IntegerPaddingChar /*String*/  = _data.IntegerPaddingChar /*String*/ ;
RDebugUtils.currentLine=39911445;
 //BA.debugLineNum = 39911445;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=39911446;
 //BA.debugLineNum = 39911446;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.b4xformatter._b4xformatdata  _createdefaultformat(b4a.example.ef.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "createdefaultformat", true))
	 {return ((b4a.example.ef.b4xformatter._b4xformatdata) Debug.delegate(ba, "createdefaultformat", null));}
b4a.example.ef.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub CreateDefaultFormat As B4XFormatData";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="Dim d As B4XFormatData";
_d = new b4a.example.ef.b4xformatter._b4xformatdata();
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="d.Initialize";
_d.Initialize();
RDebugUtils.currentLine=39780355;
 //BA.debugLineNum = 39780355;BA.debugLine="d.GroupingCharacter = \",\"";
_d.GroupingCharacter /*String*/  = ",";
RDebugUtils.currentLine=39780356;
 //BA.debugLineNum = 39780356;BA.debugLine="d.DecimalPoint = \".\"";
_d.DecimalPoint /*String*/  = ".";
RDebugUtils.currentLine=39780357;
 //BA.debugLineNum = 39780357;BA.debugLine="d.MaximumFractions = 3";
_d.MaximumFractions /*int*/  = (int) (3);
RDebugUtils.currentLine=39780358;
 //BA.debugLineNum = 39780358;BA.debugLine="d.MinimumIntegers = 1";
_d.MinimumIntegers /*int*/  = (int) (1);
RDebugUtils.currentLine=39780359;
 //BA.debugLineNum = 39780359;BA.debugLine="d.IntegerPaddingChar = \"0\"";
_d.IntegerPaddingChar /*String*/  = "0";
RDebugUtils.currentLine=39780360;
 //BA.debugLineNum = 39780360;BA.debugLine="d.FractionPaddingChar = \"0\"";
_d.FractionPaddingChar /*String*/  = "0";
RDebugUtils.currentLine=39780361;
 //BA.debugLineNum = 39780361;BA.debugLine="Return d";
if (true) return _d;
RDebugUtils.currentLine=39780362;
 //BA.debugLineNum = 39780362;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.b4xformatter._b4xformatdata  _getformatdata(b4a.example.ef.b4xformatter __ref,double _number) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "getformatdata", true))
	 {return ((b4a.example.ef.b4xformatter._b4xformatdata) Debug.delegate(ba, "getformatdata", new Object[] {_number}));}
int _i = 0;
b4a.example.ef.b4xformatter._b4xformatdata _d = null;
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Public Sub GetFormatData (Number As Double) As B4X";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="For i = formats.Size - 1 To 1 Step - 1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_i = (int) (__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="Dim d As B4XFormatData = formats.Get(i)";
_d = (b4a.example.ef.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=40108035;
 //BA.debugLineNum = 40108035;BA.debugLine="If Number <= d.RangeEnd And Number >= d.RangeSta";
if (_number<=_d.RangeEnd /*double*/  && _number>=_d.RangeStart /*double*/ ) { 
if (true) return _d;};
 }
};
RDebugUtils.currentLine=40108037;
 //BA.debugLineNum = 40108037;BA.debugLine="Return formats.Get(0)";
if (true) return (b4a.example.ef.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=40108038;
 //BA.debugLineNum = 40108038;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.b4xformatter._b4xformatdata  _getdefaultformat(b4a.example.ef.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "getdefaultformat", true))
	 {return ((b4a.example.ef.b4xformatter._b4xformatdata) Debug.delegate(ba, "getdefaultformat", null));}
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Public Sub GetDefaultFormat As B4XFormatData";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="Return formats.Get(0)";
if (true) return (b4a.example.ef.b4xformatter._b4xformatdata)(__ref._formats /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.b4xformatter._b4xformatdata  _newformatdata(b4a.example.ef.b4xformatter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xformatter";
if (Debug.shouldDelegate(ba, "newformatdata", true))
	 {return ((b4a.example.ef.b4xformatter._b4xformatdata) Debug.delegate(ba, "newformatdata", null));}
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Public Sub NewFormatData As B4XFormatData";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="Return CopyFormatData(GetDefaultFormat)";
if (true) return __ref._copyformatdata /*b4a.example.ef.b4xformatter._b4xformatdata*/ (null,__ref._getdefaultformat /*b4a.example.ef.b4xformatter._b4xformatdata*/ (null));
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="End Sub";
return null;
}
}