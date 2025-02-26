package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class table extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.table");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.table.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.StringUtils _stringutils1 = null;
public flm.b4a.scrollview2d.ScrollView2DWrapper _sv2 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _svf = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnltable = null;
public anywheresoftware.b4a.objects.PanelWrapper _header = null;
public anywheresoftware.b4a.objects.PanelWrapper _headerbase = null;
public anywheresoftware.b4a.objects.PanelWrapper _headerfirst = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblstatusline = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlfastscroll = null;
public anywheresoftware.b4a.objects.PanelWrapper _pnlfastscrollcursor = null;
public int _fsccursorwidth = 0;
public int _fsccursorheight = 0;
public int _fsclabeltopdelta = 0;
public int _fscbackgroundcolor = 0;
public int _fsccursorcol1 = 0;
public int _fsccursorcol2 = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblfastscroll = null;
public int _fsy0 = 0;
public int _fsdy = 0;
public int _fastscrollheight = 0;
public double _fscscale = 0;
public anywheresoftware.b4a.objects.Timer _fsctimer = null;
public boolean _mfastscroll = false;
public boolean _fastscrollactive = false;
public int _mfastscrollcolumnindex = 0;
public int _mfastscrollminitems = 0;
public boolean _mfastscrollshowlabel = false;
public boolean _mfastscrollfixedlabel = false;
public int _mfastscrolllabelmaxchars = 0;
public int _mfastscrolllabelwidth = 0;
public int _mfastscrolllabelheight = 0;
public Object _ccallback = null;
public String _ceventname = "";
public int _cleft = 0;
public int _ctop = 0;
public int _cwidth = 0;
public int _cheight = 0;
public anywheresoftware.b4a.objects.collections.List _headernames = null;
public anywheresoftware.b4a.objects.collections.List _selectedrows = null;
public int _selectedcol = 0;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.collections.List _labelscache = null;
public int _minvisiblerow = 0;
public int _maxvisiblerow = 0;
public boolean _isvisible = false;
public anywheresoftware.b4a.objects.collections.Map _visiblerows = null;
public int _mnumberofcolumns = 0;
public int[] _columnwidths = null;
public int[] _ccolumncolors = null;
public int[] _ctextcolors = null;
public int[] _cheadercolors = null;
public int[] _cheadertextcolors = null;
public int[] _datawidths = null;
public int[] _headerwidths = null;
public String[] _ccolumndatatype = null;
public int _crowheight = 0;
public int _cheadercolor = 0;
public int _ctablecolor = 0;
public int _ctextcolor = 0;
public int _cheaderheight = 0;
public int _cheadertextcolor = 0;
public int _cstatuslineheight = 0;
public boolean _cautomaticwidths = false;
public float _ctextsize = 0f;
public int _calignment = 0;
public int[] _calignments = null;
public int[] _calignments0 = null;
public boolean _multialignments = false;
public boolean _multitypeface = false;
public boolean _multitextcolors = false;
public int _cheaderalignment = 0;
public int[] _cheaderalignments = null;
public int[] _cheaderalignments0 = null;
public boolean _headermultialignments = false;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _ctypeface = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _ctypefaces = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _ctypefaces0 = null;
public boolean _headermultitypeface = false;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _cheadertypeface = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _cheadertypefaces = null;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _cheadertypefaces0 = null;
public int _clinewidth = 0;
public int _extrawidth = 0;
public Object[] _selecteddrawable = null;
public Object[] _drawable1 = null;
public Object[] _drawable2 = null;
public Object[] _columndrawables = null;
public Object _selectedcelldrawable = null;
public int _crowcolor1 = 0;
public int _crowcolor2 = 0;
public int _cselectedrowcolor = 0;
public int _cselectedcellcolor = 0;
public int _cselectedrowtextcolor = 0;
public int _cselectedcelltextcolor = 0;
public boolean _csortcolumn = false;
public boolean _cusecolumncolors = false;
public boolean _csortremoveaccents = false;
public int _mfirstcolumnswidth = 0;
public boolean _mfirstcolumnfixed = false;
public int _mnumberoffixedcolumns = 0;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public anywheresoftware.b4a.objects.collections.List _lstrowcolorindexes = null;
public anywheresoftware.b4a.objects.collections.List _lstrowcolors = null;
public anywheresoftware.b4a.objects.collections.List _lstrowdrawables = null;
public boolean _csingleline = false;
public boolean _mmultiselect = false;
public boolean _callowselection = false;
public int[] _savedwidths = null;
public boolean _cshowstatusline = false;
public anywheresoftware.b4a.objects.PanelWrapper _internalpanel = null;
public int _sortingdir = 0;
public int _sortedcol = 0;
public anywheresoftware.b4a.objects.PanelWrapper _pnlsortingview = null;
public long _debug_counter = 0L;
public boolean _enablestatuslineautofill = false;
public anywheresoftware.b4a.objects.PanelWrapper _pnlasc = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpasc = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpdes = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpequal = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsasc = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsdes = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsequal = null;
public int _csortbitmapwidth = 0;
public int _csortbitmapheight = 0;
public int _csortbitmapcolor = 0;
public boolean _mcustomsortingbitmaps = false;
public boolean _mzeroselection = false;
public boolean _sv2scrolls = false;
public boolean _svfscrolls = false;
public int _sv2posx = 0;
public b4a.example.ef.table _tableobject = null;
public long[] _arrcollong = null;
public double[] _arrcoldouble = null;
public String[] _arrcolstring = null;
public int[] _arrsortindex = null;
public int _iprevioussortcolumn = 0;
public boolean _bprevioussortascending = false;
public anywheresoftware.b4a.objects.collections.Map _mapsortingindexes = null;
public boolean[] _arrdatasorted = null;
public boolean _bdatatempdone = false;
public anywheresoftware.b4a.objects.collections.List _datatemp = null;
public boolean _mmulticolumnsort = false;
public boolean _msortcaseinsensitive = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static class _rowcol{
public boolean IsInitialized;
public int Row;
public int Col;
public void Initialize() {
IsInitialized = true;
Row = 0;
Col = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addrow(String[] _values) throws Exception{
int _lastrow = 0;
 //BA.debugLineNum = 1221;BA.debugLine="Public Sub AddRow(Values() As String)";
 //BA.debugLineNum = 1222;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 1223;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("720250626","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(_mnumberofcolumns),0);
 //BA.debugLineNum = 1224;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1226;BA.debugLine="Data.Add(Values)";
_data.Add((Object)(_values));
 //BA.debugLineNum = 1227;BA.debugLine="lstRowColorIndexes.Add(0)";
_lstrowcolorindexes.Add((Object)(0));
 //BA.debugLineNum = 1229;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
 //BA.debugLineNum = 1230;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (_data.getSize()-1);
 //BA.debugLineNum = 1231;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(_sv2.getVerticalScrollPosition()+_sv2.getHeight())/(double)_crowheight+1) { 
 //BA.debugLineNum = 1232;BA.debugLine="ShowRow(lastRow)";
_showrow(_lastrow);
 };
 //BA.debugLineNum = 1240;BA.debugLine="End Sub";
return "";
}
public String  _addrowautomaticwidth(String[] _values) throws Exception{
int _i = 0;
int _lastrow = 0;
boolean _changed = false;
int _width = 0;
 //BA.debugLineNum = 1244;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
 //BA.debugLineNum = 1245;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1247;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 1248;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("720316164","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(_mnumberofcolumns),0);
 //BA.debugLineNum = 1249;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1251;BA.debugLine="Data.Add(Values)";
_data.Add((Object)(_values));
 //BA.debugLineNum = 1252;BA.debugLine="lstRowColorIndexes.Add(0)";
_lstrowcolorindexes.Add((Object)(0));
 //BA.debugLineNum = 1254;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
 //BA.debugLineNum = 1255;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (_data.getSize()-1);
 //BA.debugLineNum = 1257;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
 //BA.debugLineNum = 1258;BA.debugLine="Dim width As Int";
_width = 0;
 //BA.debugLineNum = 1259;BA.debugLine="If Data.Size = 1 Then";
if (_data.getSize()==1) { 
 //BA.debugLineNum = 1260;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 1261;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (_headermultitypeface==__c.False) { 
 //BA.debugLineNum = 1262;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_headernames.Get(_i)),(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 1264;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_headernames.Get(_i)),(android.graphics.Typeface)(_cheadertypefaces[_i].getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 1266;BA.debugLine="ColumnWidths(i) = width";
_columnwidths[_i] = _width;
 //BA.debugLineNum = 1267;BA.debugLine="SavedWidths(i) = width";
_savedwidths[_i] = _width;
 //BA.debugLineNum = 1268;BA.debugLine="HeaderWidths(i) = width";
_headerwidths[_i] = _width;
 //BA.debugLineNum = 1269;BA.debugLine="DataWidths(i) = width";
_datawidths[_i] = _width;
 }
};
 };
 //BA.debugLineNum = 1272;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 1273;BA.debugLine="If MultiTypeFace = False Then";
if (_multitypeface==__c.False) { 
 //BA.debugLineNum = 1274;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 1276;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypefaces[_i].getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 1278;BA.debugLine="If ColumnWidths(i) < width Then";
if (_columnwidths[_i]<_width) { 
 //BA.debugLineNum = 1279;BA.debugLine="ColumnWidths(i) = width";
_columnwidths[_i] = _width;
 //BA.debugLineNum = 1280;BA.debugLine="SavedWidths(i) = width";
_savedwidths[_i] = _width;
 //BA.debugLineNum = 1281;BA.debugLine="HeaderWidths(i) = width";
_headerwidths[_i] = _width;
 //BA.debugLineNum = 1282;BA.debugLine="DataWidths(i) = width";
_datawidths[_i] = _width;
 //BA.debugLineNum = 1283;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
 //BA.debugLineNum = 1287;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
 //BA.debugLineNum = 1288;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 };
 //BA.debugLineNum = 1291;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(_sv2.getVerticalScrollPosition()+_sv2.getHeight())/(double)_crowheight+1) { 
 //BA.debugLineNum = 1292;BA.debugLine="ShowRow(lastRow)";
_showrow(_lastrow);
 };
 //BA.debugLineNum = 1299;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 656;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
 //BA.debugLineNum = 657;BA.debugLine="cLeft = Left";
_cleft = _left;
 //BA.debugLineNum = 658;BA.debugLine="cTop = Top";
_ctop = _top;
 //BA.debugLineNum = 659;BA.debugLine="cWidth = Width";
_cwidth = _width;
 //BA.debugLineNum = 660;BA.debugLine="cHeight = Height";
_cheight = _height;
 //BA.debugLineNum = 662;BA.debugLine="pnlTable.Initialize(\"\")";
_pnltable.Initialize(ba,"");
 //BA.debugLineNum = 663;BA.debugLine="pnlTable.Color = Colors.Transparent";
_pnltable.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 664;BA.debugLine="Act.AddView(pnlTable, cLeft, cTop , cWidth, cHeig";
_act.AddView((android.view.View)(_pnltable.getObject()),_cleft,_ctop,_cwidth,_cheight);
 //BA.debugLineNum = 666;BA.debugLine="InitTable";
_inittable();
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
return "";
}
public String  _addtoview(anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
 //BA.debugLineNum = 647;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
 //BA.debugLineNum = 648;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
_addtoactivity((anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
 //BA.debugLineNum = 649;BA.debugLine="End Sub";
return "";
}
public String  _calcfastscroll(int _pos) throws Exception{
int _i = 0;
int _top = 0;
String[] _str = null;
 //BA.debugLineNum = 2597;BA.debugLine="Private Sub CalcFastScroll(Pos As Int)";
 //BA.debugLineNum = 2598;BA.debugLine="Private i, Top As Int";
_i = 0;
_top = 0;
 //BA.debugLineNum = 2599;BA.debugLine="Top = Pos * FScScale";
_top = (int) (_pos*_fscscale);
 //BA.debugLineNum = 2600;BA.debugLine="pnlFastScrollCursor.Top = Top";
_pnlfastscrollcursor.setTop(_top);
 //BA.debugLineNum = 2601;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (_mfastscrollfixedlabel==__c.False) { 
 //BA.debugLineNum = 2602;BA.debugLine="lblFastScroll.Top = Top + FscLabelTopDelta";
_lblfastscroll.setTop((int) (_top+_fsclabeltopdelta));
 };
 //BA.debugLineNum = 2604;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 2605;BA.debugLine="i = (Pos + SV2.Height / 2) / cRowHeight";
_i = (int) ((_pos+_sv2.getHeight()/(double)2)/(double)_crowheight);
 //BA.debugLineNum = 2606;BA.debugLine="Private str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
 //BA.debugLineNum = 2607;BA.debugLine="str = Data.Get(i)";
_str = (String[])(_data.Get(_i));
 //BA.debugLineNum = 2608;BA.debugLine="lblFastScroll.Text = str(mFastScrollColumnIndex)";
_lblfastscroll.setText(BA.ObjectToCharSequence(_str[_mfastscrollcolumnindex].substring((int) (0),(int) (__c.Min(_str[_mfastscrollcolumnindex].length(),_mfastscrolllabelmaxchars)))));
 };
 //BA.debugLineNum = 2611;BA.debugLine="End Sub";
return "";
}
public String  _cell_click() throws Exception{
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 1594;BA.debugLine="Private Sub Cell_Click";
 //BA.debugLineNum = 1595;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
 //BA.debugLineNum = 1596;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1597;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 1598;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
 //BA.debugLineNum = 1601;BA.debugLine="SelectRow(rc)";
_selectrow(_rc);
 //BA.debugLineNum = 1602;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellClick\"";
if (__c.SubExists(ba,_ccallback,_ceventname+"_CellClick")) { 
 //BA.debugLineNum = 1603;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellClick\", r";
__c.CallSubNew3(ba,_ccallback,_ceventname+"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
 //BA.debugLineNum = 1605;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick() throws Exception{
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
 //BA.debugLineNum = 1571;BA.debugLine="Private Sub Cell_LongClick";
 //BA.debugLineNum = 1573;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
 //BA.debugLineNum = 1574;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1575;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 1576;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
 //BA.debugLineNum = 1578;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellLongCl";
if (__c.SubExists(ba,_ccallback,_ceventname+"_CellLongClick")) { 
 //BA.debugLineNum = 1579;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellLongClick";
__c.CallSubNew3(ba,_ccallback,_ceventname+"_CellLongClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
 //BA.debugLineNum = 1581;BA.debugLine="End Sub";
return "";
}
public boolean  _check1ddoubleallsame(double[] _arrdouble,int _istart,int _iend) throws Exception{
int _i = 0;
double _dval = 0;
 //BA.debugLineNum = 4585;BA.debugLine="Sub Check1DDoubleAllSame(arrDouble() As Double, iS";
 //BA.debugLineNum = 4587;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4588;BA.debugLine="Dim dVal As Double";
_dval = 0;
 //BA.debugLineNum = 4590;BA.debugLine="If arrDouble.Length = 1 Then";
if (_arrdouble.length==1) { 
 //BA.debugLineNum = 4591;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 4594;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4595;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
 //BA.debugLineNum = 4598;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4599;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
 //BA.debugLineNum = 4602;BA.debugLine="dVal = arrDouble(0)";
_dval = _arrdouble[(int) (0)];
 //BA.debugLineNum = 4604;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 4605;BA.debugLine="If arrDouble(i) <> dVal Then";
if (_arrdouble[_i]!=_dval) { 
 //BA.debugLineNum = 4606;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 //BA.debugLineNum = 4610;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 4612;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dlongallsame(long[] _arrlong,int _istart,int _iend) throws Exception{
int _i = 0;
long _lval = 0L;
 //BA.debugLineNum = 4506;BA.debugLine="Sub Check1DLongAllSame(arrLong() As Long, iStart A";
 //BA.debugLineNum = 4508;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4509;BA.debugLine="Dim lVal As Long";
_lval = 0L;
 //BA.debugLineNum = 4511;BA.debugLine="If arrLong.Length = 1 Then";
if (_arrlong.length==1) { 
 //BA.debugLineNum = 4512;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 4515;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4516;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
 //BA.debugLineNum = 4519;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4520;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
 //BA.debugLineNum = 4523;BA.debugLine="lVal = arrLong(0)";
_lval = _arrlong[(int) (0)];
 //BA.debugLineNum = 4525;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 4526;BA.debugLine="If arrLong(i) <> lVal Then";
if (_arrlong[_i]!=_lval) { 
 //BA.debugLineNum = 4527;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 //BA.debugLineNum = 4531;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 4533;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dstringallsame(String[] _arrstring,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
int _i = 0;
String _str = "";
 //BA.debugLineNum = 4768;BA.debugLine="Sub Check1DStringAllSame(arrstring() As String, bC";
 //BA.debugLineNum = 4770;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4771;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 4773;BA.debugLine="If arrstring.Length = 1 Then";
if (_arrstring.length==1) { 
 //BA.debugLineNum = 4774;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 4777;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4778;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
 //BA.debugLineNum = 4781;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4782;BA.debugLine="iEnd = arrstring.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
 //BA.debugLineNum = 4785;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
 //BA.debugLineNum = 4786;BA.debugLine="str = arrstring(0).ToLowerCase";
_str = _arrstring[(int) (0)].toLowerCase();
 //BA.debugLineNum = 4787;BA.debugLine="For i = iStart To iEnd";
{
final int step14 = 1;
final int limit14 = _iend;
_i = _istart ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 4788;BA.debugLine="If arrstring(i).ToLowerCase.CompareTo(str) <> 0";
if (_arrstring[_i].toLowerCase().compareTo(_str)!=0) { 
 //BA.debugLineNum = 4789;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 }else {
 //BA.debugLineNum = 4793;BA.debugLine="str = arrstring(0)";
_str = _arrstring[(int) (0)];
 //BA.debugLineNum = 4794;BA.debugLine="For i = iStart To iEnd";
{
final int step21 = 1;
final int limit21 = _iend;
_i = _istart ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 4795;BA.debugLine="If arrstring(i).CompareTo(str) <> 0 Then";
if (_arrstring[_i].compareTo(_str)!=0) { 
 //BA.debugLineNum = 4796;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 };
 //BA.debugLineNum = 4801;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 4803;BA.debugLine="End Sub";
return false;
}
public String[]  _checkcolumndatatypes(anywheresoftware.b4a.sql.SQL.CursorWrapper _mycurs) throws Exception{
int _nbcols = 0;
int _nbrows = 0;
String[] _columntypes = null;
String _str = "";
int _col = 0;
int _row = 0;
 //BA.debugLineNum = 3456;BA.debugLine="Private Sub CheckColumnDataTypes(MyCurs As Cursor)";
 //BA.debugLineNum = 3457;BA.debugLine="Private NbCols, NbRows As Int";
_nbcols = 0;
_nbrows = 0;
 //BA.debugLineNum = 3458;BA.debugLine="NbCols = MyCurs.ColumnCount";
_nbcols = _mycurs.getColumnCount();
 //BA.debugLineNum = 3459;BA.debugLine="NbRows = MyCurs.RowCount";
_nbrows = _mycurs.getRowCount();
 //BA.debugLineNum = 3461;BA.debugLine="Private ColumnTypes(NbCols), str As String";
_columntypes = new String[_nbcols];
java.util.Arrays.fill(_columntypes,"");
_str = "";
 //BA.debugLineNum = 3462;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 3464;BA.debugLine="For col = 0 To NbCols - 1";
{
final int step6 = 1;
final int limit6 = (int) (_nbcols-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
 //BA.debugLineNum = 3465;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
 //BA.debugLineNum = 3466;BA.debugLine="For row = 0 To NbRows - 1";
{
final int step8 = 1;
final int limit8 = (int) (_nbrows-1);
_row = (int) (0) ;
for (;_row <= limit8 ;_row = _row + step8 ) {
 //BA.debugLineNum = 3467;BA.debugLine="MyCurs.Position = row";
_mycurs.setPosition(_row);
 //BA.debugLineNum = 3468;BA.debugLine="str = MyCurs.GetString2(col)";
_str = _mycurs.GetString2(_col);
 //BA.debugLineNum = 3469;BA.debugLine="If str = Null Then";
if (_str== null) { 
 //BA.debugLineNum = 3470;BA.debugLine="str = \"\"";
_str = "";
 };
 //BA.debugLineNum = 3472;BA.debugLine="If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
 //BA.debugLineNum = 3473;BA.debugLine="If str.Contains(\".\") Then";
if (_str.contains(".")) { 
 //BA.debugLineNum = 3474;BA.debugLine="ColumnTypes(col) = \"R\"";
_columntypes[_col] = "R";
 }else {
 //BA.debugLineNum = 3476;BA.debugLine="ColumnTypes(col) = \"I\"";
_columntypes[_col] = "I";
 };
 }else {
 //BA.debugLineNum = 3479;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
 //BA.debugLineNum = 3480;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 3485;BA.debugLine="Return ColumnTypes";
if (true) return _columntypes;
 //BA.debugLineNum = 3486;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 417;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
 //BA.debugLineNum = 418;BA.debugLine="Private SV2 As ScrollView2D";
_sv2 = new flm.b4a.scrollview2d.ScrollView2DWrapper();
 //BA.debugLineNum = 419;BA.debugLine="Private SVF As ScrollView";
_svf = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 420;BA.debugLine="Private pnlTable As Panel";
_pnltable = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 421;BA.debugLine="Private Header, HeaderBase As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
_headerbase = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 422;BA.debugLine="Private HeaderFirst As Panel";
_headerfirst = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 423;BA.debugLine="Private lblStatusLine As Label";
_lblstatusline = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 425;BA.debugLine="Private pnlFastScroll As Panel";
_pnlfastscroll = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 426;BA.debugLine="Private pnlFastScrollCursor As Panel";
_pnlfastscrollcursor = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 427;BA.debugLine="Private FScCursorWidth = 25dip As Int";
_fsccursorwidth = __c.DipToCurrent((int) (25));
 //BA.debugLineNum = 428;BA.debugLine="Private FScCursorHeight = 60dip As Int";
_fsccursorheight = __c.DipToCurrent((int) (60));
 //BA.debugLineNum = 429;BA.debugLine="Private FscLabelTopDelta As Int";
_fsclabeltopdelta = 0;
 //BA.debugLineNum = 430;BA.debugLine="Private FScBackgroundColor = Colors.ARGB(48, 128,";
_fscbackgroundcolor = __c.Colors.ARGB((int) (48),(int) (128),(int) (128),(int) (128));
 //BA.debugLineNum = 431;BA.debugLine="Private FScCursorCol1 = Colors.Blue As Int";
_fsccursorcol1 = __c.Colors.Blue;
 //BA.debugLineNum = 432;BA.debugLine="Private FScCursorCol2 = Colors.Yellow As Int";
_fsccursorcol2 = __c.Colors.Yellow;
 //BA.debugLineNum = 433;BA.debugLine="Private lblFastScroll As Label";
_lblfastscroll = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 434;BA.debugLine="Private FSY0, FSdY, FastScrollHeight As Int";
_fsy0 = 0;
_fsdy = 0;
_fastscrollheight = 0;
 //BA.debugLineNum = 435;BA.debugLine="Private FScScale As Double";
_fscscale = 0;
 //BA.debugLineNum = 436;BA.debugLine="Private FScTimer As Timer";
_fsctimer = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 437;BA.debugLine="Private mFastScroll = False As Boolean";
_mfastscroll = __c.False;
 //BA.debugLineNum = 438;BA.debugLine="Private FastScrollActive As Boolean";
_fastscrollactive = false;
 //BA.debugLineNum = 439;BA.debugLine="Private mFastScrollColumnIndex = 0 As Int";
_mfastscrollcolumnindex = (int) (0);
 //BA.debugLineNum = 440;BA.debugLine="Private mFastScrollMinItems = 50 As Int";
_mfastscrollminitems = (int) (50);
 //BA.debugLineNum = 441;BA.debugLine="Private mFastScrollShowLabel = True As Boolean";
_mfastscrollshowlabel = __c.True;
 //BA.debugLineNum = 442;BA.debugLine="Private mFastScrollFixedLabel = False As Boolean";
_mfastscrollfixedlabel = __c.False;
 //BA.debugLineNum = 443;BA.debugLine="Private mFastScrollLabelMaxChars = 10 As Int";
_mfastscrolllabelmaxchars = (int) (10);
 //BA.debugLineNum = 444;BA.debugLine="Private mFastScrollLabelWidth = 150dip As Int";
_mfastscrolllabelwidth = __c.DipToCurrent((int) (150));
 //BA.debugLineNum = 445;BA.debugLine="Private mFastScrollLabelHeight = 30dip As Int";
_mfastscrolllabelheight = __c.DipToCurrent((int) (30));
 //BA.debugLineNum = 447;BA.debugLine="Private cCallBack As Object";
_ccallback = new Object();
 //BA.debugLineNum = 448;BA.debugLine="Private cEventName As String";
_ceventname = "";
 //BA.debugLineNum = 449;BA.debugLine="Private cLeft, cTop , cWidth, cHeight As Int";
_cleft = 0;
_ctop = 0;
_cwidth = 0;
_cheight = 0;
 //BA.debugLineNum = 450;BA.debugLine="Public HeaderNames As List";
_headernames = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 451;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
_selectedrows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 452;BA.debugLine="Private SelectedCol As Int";
_selectedcol = 0;
 //BA.debugLineNum = 453;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 454;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 455;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
 //BA.debugLineNum = 456;BA.debugLine="Private IsVisible As Boolean";
_isvisible = false;
 //BA.debugLineNum = 457;BA.debugLine="Public visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 458;BA.debugLine="Private mNumberOfColumns, ColumnWidths(), cColumn";
_mnumberofcolumns = 0;
_columnwidths = new int[(int) (0)];
;
_ccolumncolors = new int[(int) (0)];
;
_ctextcolors = new int[(int) (0)];
;
_cheadercolors = new int[(int) (0)];
;
_cheadertextcolors = new int[(int) (0)];
;
_datawidths = new int[(int) (0)];
;
_headerwidths = new int[(int) (0)];
;
 //BA.debugLineNum = 459;BA.debugLine="Private cColumnDataType() As String";
_ccolumndatatype = new String[(int) (0)];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 460;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
_crowheight = 0;
_cheadercolor = 0;
_ctablecolor = 0;
_ctextcolor = 0;
_cheaderheight = 0;
_cheadertextcolor = 0;
_cstatuslineheight = 0;
 //BA.debugLineNum = 461;BA.debugLine="Private cAutomaticWidths = False As Boolean";
_cautomaticwidths = __c.False;
 //BA.debugLineNum = 462;BA.debugLine="Private cTextSize As Float";
_ctextsize = 0f;
 //BA.debugLineNum = 463;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
 //BA.debugLineNum = 464;BA.debugLine="Private cAlignment As Int";
_calignment = 0;
 //BA.debugLineNum = 465;BA.debugLine="Private cAlignments() As Int";
_calignments = new int[(int) (0)];
;
 //BA.debugLineNum = 466;BA.debugLine="Private cAlignments0() As Int";
_calignments0 = new int[(int) (0)];
;
 //BA.debugLineNum = 467;BA.debugLine="Private MultiAlignments = False As Boolean";
_multialignments = __c.False;
 //BA.debugLineNum = 468;BA.debugLine="Private MultiTypeFace = False As Boolean";
_multitypeface = __c.False;
 //BA.debugLineNum = 469;BA.debugLine="Private MultiTextColors = False As Boolean";
_multitextcolors = __c.False;
 //BA.debugLineNum = 470;BA.debugLine="Private cHeaderAlignment = Gravity.CENTER As Int";
_cheaderalignment = __c.Gravity.CENTER;
 //BA.debugLineNum = 471;BA.debugLine="Private cHeaderAlignments() As Int";
_cheaderalignments = new int[(int) (0)];
;
 //BA.debugLineNum = 472;BA.debugLine="Private cHeaderAlignments0() As Int";
_cheaderalignments0 = new int[(int) (0)];
;
 //BA.debugLineNum = 473;BA.debugLine="Private HeaderMultiAlignments = False As Boolean";
_headermultialignments = __c.False;
 //BA.debugLineNum = 474;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
_ctypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_ctypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 475;BA.debugLine="Private cTypeFaces() As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 476;BA.debugLine="Private cTypeFaces0() As Typeface";
_ctypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 477;BA.debugLine="Private HeaderMultiTypeFace = False As Boolean";
_headermultitypeface = __c.False;
 //BA.debugLineNum = 478;BA.debugLine="Private cHeaderTypeFace = Typeface.DEFAULT As Typ";
_cheadertypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_cheadertypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
 //BA.debugLineNum = 479;BA.debugLine="Private cHeaderTypeFaces() As Typeface";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 480;BA.debugLine="Private cHeaderTypeFaces0() As Typeface";
_cheadertypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 481;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
_clinewidth = (int) (__c.Max(1,__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 482;BA.debugLine="Private ExtraWidth = 12dip + cLineWidth	As Int";
_extrawidth = (int) (__c.DipToCurrent((int) (12))+_clinewidth);
 //BA.debugLineNum = 483;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
_selecteddrawable = new Object[(int) (0)];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
_drawable1 = new Object[(int) (0)];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
_drawable2 = new Object[(int) (0)];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
_columndrawables = new Object[(int) (0)];
{
int d0 = _columndrawables.length;
for (int i0 = 0;i0 < d0;i0++) {
_columndrawables[i0] = new Object();
}
}
;
 //BA.debugLineNum = 484;BA.debugLine="Private SelectedCellDrawable As Object";
_selectedcelldrawable = new Object();
 //BA.debugLineNum = 485;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
_crowcolor1 = 0;
_crowcolor2 = 0;
_cselectedrowcolor = 0;
_cselectedcellcolor = 0;
_cselectedrowtextcolor = 0;
_cselectedcelltextcolor = 0;
 //BA.debugLineNum = 486;BA.debugLine="Private cSortColumn = True As Boolean";
_csortcolumn = __c.True;
 //BA.debugLineNum = 487;BA.debugLine="Private cUseColumnColors = False As Boolean";
_cusecolumncolors = __c.False;
 //BA.debugLineNum = 488;BA.debugLine="Private cSortRemoveAccents = False As Boolean";
_csortremoveaccents = __c.False;
 //BA.debugLineNum = 489;BA.debugLine="Private mFirstColumnsWidth = 0 As Int";
_mfirstcolumnswidth = (int) (0);
 //BA.debugLineNum = 490;BA.debugLine="Private mFirstColumnFixed = False As Boolean";
_mfirstcolumnfixed = __c.False;
 //BA.debugLineNum = 491;BA.debugLine="Private mNumberOfFixedColumns As Int";
_mnumberoffixedcolumns = 0;
 //BA.debugLineNum = 492;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 493;BA.debugLine="Private cvs As Canvas		' used to measure string w";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 494;BA.debugLine="Private lstRowColorIndexes As List";
_lstrowcolorindexes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 495;BA.debugLine="Private lstRowColors As List";
_lstrowcolors = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 496;BA.debugLine="Private lstRowDrawables As List";
_lstrowdrawables = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 498;BA.debugLine="cHeaderColor = Colors.Gray";
_cheadercolor = __c.Colors.Gray;
 //BA.debugLineNum = 499;BA.debugLine="cTableColor = Colors.LightGray";
_ctablecolor = __c.Colors.LightGray;
 //BA.debugLineNum = 500;BA.debugLine="cTextColor = Colors.Black";
_ctextcolor = __c.Colors.Black;
 //BA.debugLineNum = 501;BA.debugLine="cHeaderTextColor = Colors.White";
_cheadertextcolor = __c.Colors.White;
 //BA.debugLineNum = 502;BA.debugLine="cTextSize = 14";
_ctextsize = (float) (14);
 //BA.debugLineNum = 503;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
_calignment = __c.Gravity.CENTER;
 //BA.debugLineNum = 504;BA.debugLine="cRowColor1 = Colors.White";
_crowcolor1 = __c.Colors.White;
 //BA.debugLineNum = 505;BA.debugLine="cRowColor2 = 0xFF98F5FF";
_crowcolor2 = ((int)0xff98f5ff);
 //BA.debugLineNum = 506;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
_cselectedrowcolor = ((int)0xff007fff);
 //BA.debugLineNum = 507;BA.debugLine="cSelectedRowTextColor = Colors.Black";
_cselectedrowtextcolor = __c.Colors.Black;
 //BA.debugLineNum = 508;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
_cselectedcellcolor = ((int)0xfffc8eac);
 //BA.debugLineNum = 509;BA.debugLine="cSelectedCellTextColor = Colors.Black";
_cselectedcelltextcolor = __c.Colors.Black;
 //BA.debugLineNum = 510;BA.debugLine="cRowHeight = 40dip";
_crowheight = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 511;BA.debugLine="cHeaderHeight = cRowHeight";
_cheaderheight = _crowheight;
 //BA.debugLineNum = 512;BA.debugLine="cStatusLineHeight = cRowHeight";
_cstatuslineheight = _crowheight;
 //BA.debugLineNum = 514;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
_csingleline = __c.True;
 //BA.debugLineNum = 516;BA.debugLine="Private mMultiSelect As Boolean = False";
_mmultiselect = __c.False;
 //BA.debugLineNum = 517;BA.debugLine="Private cAllowSelection = True As Boolean";
_callowselection = __c.True;
 //BA.debugLineNum = 518;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
_savedwidths = new int[(int) (0)];
;
 //BA.debugLineNum = 519;BA.debugLine="Private cShowStatusLine As Boolean =True";
_cshowstatusline = __c.True;
 //BA.debugLineNum = 521;BA.debugLine="Private internalPanel As Panel";
_internalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 523;BA.debugLine="Public sortingDir As Int = 0 ' -1,0,1 as acc, uns";
_sortingdir = (int) (0);
 //BA.debugLineNum = 524;BA.debugLine="Public sortedCol As Int = -1' hold the sorted col";
_sortedcol = (int) (-1);
 //BA.debugLineNum = 525;BA.debugLine="Private pnlSortingView As Panel";
_pnlsortingview = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 527;BA.debugLine="Private debug_counter As Long";
_debug_counter = 0L;
 //BA.debugLineNum = 528;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
_enablestatuslineautofill = __c.True;
 //BA.debugLineNum = 530;BA.debugLine="Private pnlAsc As Panel										'added in versio";
_pnlasc = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 531;BA.debugLine="Private bmpAsc, bmpDes, bmpEqual As Bitmap					'a";
_bmpasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 532;BA.debugLine="Private cvsAsc, cvsDes, cvsEqual As Canvas					'a";
_cvsasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 533;BA.debugLine="Private cSortBitmapWidth As Int						'added in ve";
_csortbitmapwidth = 0;
 //BA.debugLineNum = 534;BA.debugLine="Private cSortBitmapHeight As Int					'added in ve";
_csortbitmapheight = 0;
 //BA.debugLineNum = 535;BA.debugLine="Private cSortBitmapColor As Int						'added in ve";
_csortbitmapcolor = 0;
 //BA.debugLineNum = 536;BA.debugLine="Private mCustomSortingBitmaps As Boolean	'added i";
_mcustomsortingbitmaps = false;
 //BA.debugLineNum = 537;BA.debugLine="Private mZeroSelection = False As Boolean";
_mzeroselection = __c.False;
 //BA.debugLineNum = 538;BA.debugLine="Private SV2Scrolls, SVFScrolls As Boolean";
_sv2scrolls = false;
_svfscrolls = false;
 //BA.debugLineNum = 539;BA.debugLine="Private SV2PosX As Int";
_sv2posx = 0;
 //BA.debugLineNum = 540;BA.debugLine="Public TableObject As Table";
_tableobject = new b4a.example.ef.table();
 //BA.debugLineNum = 545;BA.debugLine="Private arrColLong() As Long";
_arrcollong = new long[(int) (0)];
;
 //BA.debugLineNum = 546;BA.debugLine="Private arrColDouble() As Double";
_arrcoldouble = new double[(int) (0)];
;
 //BA.debugLineNum = 547;BA.debugLine="Private arrColString() As String";
_arrcolstring = new String[(int) (0)];
java.util.Arrays.fill(_arrcolstring,"");
 //BA.debugLineNum = 548;BA.debugLine="Private arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
 //BA.debugLineNum = 549;BA.debugLine="Private iPreviousSortColumn As Int = -1 'ignore w";
_iprevioussortcolumn = (int) (-1);
 //BA.debugLineNum = 550;BA.debugLine="Private bPreviousSortAscending As Boolean 'ignore";
_bprevioussortascending = false;
 //BA.debugLineNum = 551;BA.debugLine="Private mapSortingIndexes As Map";
_mapsortingindexes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 552;BA.debugLine="Private arrDataSorted() As Boolean 'added";
_arrdatasorted = new boolean[(int) (0)];
;
 //BA.debugLineNum = 553;BA.debugLine="Private bDataTempDone As Boolean 'added";
_bdatatempdone = false;
 //BA.debugLineNum = 554;BA.debugLine="Private DataTemp As List 'added";
_datatemp = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 555;BA.debugLine="Private mMultiColumnSort As Boolean = False";
_mmulticolumnsort = __c.False;
 //BA.debugLineNum = 556;BA.debugLine="Private mSortCaseInsensitive As Boolean = False";
_msortcaseinsensitive = __c.False;
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return "";
}
public String  _clearall() throws Exception{
 //BA.debugLineNum = 907;BA.debugLine="Public Sub ClearAll";
 //BA.debugLineNum = 908;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 909;BA.debugLine="updateIPLocation";
_updateiplocation();
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return "";
}
public String  _clearselection() throws Exception{
 //BA.debugLineNum = 2094;BA.debugLine="Public Sub clearSelection";
 //BA.debugLineNum = 2096;BA.debugLine="SelectedRows.Clear";
_selectedrows.Clear();
 //BA.debugLineNum = 2097;BA.debugLine="RefreshTable";
_refreshtable();
 //BA.debugLineNum = 2098;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _createnewlabels() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 1457;BA.debugLine="Private Sub CreateNewLabels As Label()";
 //BA.debugLineNum = 1458;BA.debugLine="Dim lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[_mnumberofcolumns];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 1459;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 1460;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
 //BA.debugLineNum = 1461;BA.debugLine="rc.Col = i";
_rc.Col /*int*/  = _i;
 //BA.debugLineNum = 1462;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1463;BA.debugLine="lbl.Initialize(\"Cell\")";
_lbl.Initialize(ba,"Cell");
 //BA.debugLineNum = 1465;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 //BA.debugLineNum = 1467;BA.debugLine="If cUseColumnColors = False Then";
if (_cusecolumncolors==__c.False) { 
 //BA.debugLineNum = 1468;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(_ctextcolor);
 }else {
 //BA.debugLineNum = 1470;BA.debugLine="lbl.TextColor = cTextColors(i)";
_lbl.setTextColor(_ctextcolors[_i]);
 };
 //BA.debugLineNum = 1473;BA.debugLine="If MultiTypeFace = False Then";
if (_multitypeface==__c.False) { 
 //BA.debugLineNum = 1474;BA.debugLine="lbl.Typeface = cTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_ctypeface.getObject()));
 }else {
 //BA.debugLineNum = 1476;BA.debugLine="lbl.Typeface = cTypeFaces(i)";
_lbl.setTypeface((android.graphics.Typeface)(_ctypefaces[_i].getObject()));
 };
 //BA.debugLineNum = 1479;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
_setpadding((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1481;BA.debugLine="lbl.SingleLine = cSingleLine";
_lbl.setSingleLine(_csingleline);
 //BA.debugLineNum = 1482;BA.debugLine="lbl.Tag = rc";
_lbl.setTag((Object)(_rc));
 //BA.debugLineNum = 1483;BA.debugLine="lbls(i) = lbl";
_lbls[_i] = _lbl;
 }
};
 //BA.debugLineNum = 1485;BA.debugLine="Return lbls";
if (true) return _lbls;
 //BA.debugLineNum = 1486;BA.debugLine="End Sub";
return null;
}
public String  _designercreateview(anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 568;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
 //BA.debugLineNum = 569;BA.debugLine="pnlTable = Base";
_pnltable = _base;
 //BA.debugLineNum = 571;BA.debugLine="cLeft = Base.Left";
_cleft = _base.getLeft();
 //BA.debugLineNum = 572;BA.debugLine="cTop = Base.Top";
_ctop = _base.getTop();
 //BA.debugLineNum = 573;BA.debugLine="cWidth = Base.Width";
_cwidth = _base.getWidth();
 //BA.debugLineNum = 574;BA.debugLine="cHeight = Base.Height";
_cheight = _base.getHeight();
 //BA.debugLineNum = 575;BA.debugLine="pnlTable.Color = Colors.Transparent";
_pnltable.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 578;BA.debugLine="Select Props.Get(\"TextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("TextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
 //BA.debugLineNum = 580;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
_calignment = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
 //BA.debugLineNum = 582;BA.debugLine="cAlignment = Gravity.CENTER";
_calignment = __c.Gravity.CENTER;
 break; }
case 2: {
 //BA.debugLineNum = 584;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
_calignment = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
 //BA.debugLineNum = 588;BA.debugLine="Select Props.Get(\"HeaderTextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("HeaderTextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
 //BA.debugLineNum = 590;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
_cheaderalignment = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
 //BA.debugLineNum = 592;BA.debugLine="cHeaderAlignment = Gravity.CENTER";
_cheaderalignment = __c.Gravity.CENTER;
 break; }
case 2: {
 //BA.debugLineNum = 594;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
_cheaderalignment = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
 //BA.debugLineNum = 597;BA.debugLine="cLineWidth = DipToCurrent(Props.Get(\"LineWidth\"))";
_clinewidth = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("LineWidth")))));
 //BA.debugLineNum = 599;BA.debugLine="mNumberOfColumns = Props.Get(\"NumberOfColumns\")";
_mnumberofcolumns = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfColumns"))));
 //BA.debugLineNum = 600;BA.debugLine="mNumberOfFixedColumns = Props.Get(\"NumberOfFixedC";
_mnumberoffixedcolumns = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfFixedColumns"))));
 //BA.debugLineNum = 601;BA.debugLine="mFirstColumnFixed = Props.Get(\"FirstColumnFixed\")";
_mfirstcolumnfixed = BA.ObjectToBoolean(_props.Get((Object)("FirstColumnFixed")));
 //BA.debugLineNum = 602;BA.debugLine="If mFirstColumnFixed = True And mNumberOfFixedCol";
if (_mfirstcolumnfixed==__c.True && _mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 603;BA.debugLine="mNumberOfFixedColumns = 1";
_mnumberoffixedcolumns = (int) (1);
 };
 //BA.debugLineNum = 605;BA.debugLine="mMultiSelect = Props.Get(\"MultiSelect\")";
_mmultiselect = BA.ObjectToBoolean(_props.Get((Object)("MultiSelect")));
 //BA.debugLineNum = 606;BA.debugLine="cSingleLine = Props.GetDefault(\"SingleLine\", True";
_csingleline = BA.ObjectToBoolean(_props.GetDefault((Object)("SingleLine"),(Object)(__c.True)));
 //BA.debugLineNum = 607;BA.debugLine="mZeroSelection = Props.Get(\"ZeroSelection\")";
_mzeroselection = BA.ObjectToBoolean(_props.Get((Object)("ZeroSelection")));
 //BA.debugLineNum = 608;BA.debugLine="cHeaderColor = Props.Get(\"HeaderColor\")";
_cheadercolor = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderColor"))));
 //BA.debugLineNum = 609;BA.debugLine="cTableColor = Props.Get(\"TableColor\")";
_ctablecolor = (int)(BA.ObjectToNumber(_props.Get((Object)("TableColor"))));
 //BA.debugLineNum = 610;BA.debugLine="cHeaderTextColor = Props.Get(\"HeaderTextColor\")";
_cheadertextcolor = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderTextColor"))));
 //BA.debugLineNum = 611;BA.debugLine="cTextColor = Props.Get(\"CellTextColor\")";
_ctextcolor = (int)(BA.ObjectToNumber(_props.Get((Object)("CellTextColor"))));
 //BA.debugLineNum = 612;BA.debugLine="cRowColor1 = Props.Get(\"Row1Color\")";
_crowcolor1 = (int)(BA.ObjectToNumber(_props.Get((Object)("Row1Color"))));
 //BA.debugLineNum = 613;BA.debugLine="cRowColor2 = Props.Get(\"Row2Color\")";
_crowcolor2 = (int)(BA.ObjectToNumber(_props.Get((Object)("Row2Color"))));
 //BA.debugLineNum = 614;BA.debugLine="cSelectedRowColor = Props.Get(\"SelectedRowColor\")";
_cselectedrowcolor = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedRowColor"))));
 //BA.debugLineNum = 615;BA.debugLine="cSelectedCellColor = Props.Get(\"SelectedCellColor";
_cselectedcellcolor = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedCellColor"))));
 //BA.debugLineNum = 617;BA.debugLine="cTextSize = Props.Get(\"TextSize\")";
_ctextsize = (float)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));
 //BA.debugLineNum = 619;BA.debugLine="cRowHeight = DipToCurrent(Props.Get(\"RowHeight\"))";
_crowheight = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("RowHeight")))));
 //BA.debugLineNum = 620;BA.debugLine="cHeaderHeight = DipToCurrent(Props.Get(\"HeaderHei";
_cheaderheight = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("HeaderHeight")))));
 //BA.debugLineNum = 621;BA.debugLine="cShowStatusLine = Props.Get(\"ShowStatusLine\")";
_cshowstatusline = BA.ObjectToBoolean(_props.Get((Object)("ShowStatusLine")));
 //BA.debugLineNum = 622;BA.debugLine="cStatusLineHeight = DipToCurrent(Props.GetDefault";
_cstatuslineheight = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("HeaderHeight"),(Object)(40)))));
 //BA.debugLineNum = 623;BA.debugLine="cSortColumn = Props.Get(\"SortColumn\")";
_csortcolumn = BA.ObjectToBoolean(_props.Get((Object)("SortColumn")));
 //BA.debugLineNum = 624;BA.debugLine="cSortRemoveAccents = Props.Get(\"SortRemoveAccents";
_csortremoveaccents = BA.ObjectToBoolean(_props.Get((Object)("SortRemoveAccents")));
 //BA.debugLineNum = 625;BA.debugLine="cSortBitmapWidth = DipToCurrent(Props.Get(\"SortBi";
_csortbitmapwidth = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapWidth")))));
 //BA.debugLineNum = 626;BA.debugLine="cSortBitmapColor = Props.Get(\"SortBitmapColor\")";
_csortbitmapcolor = (int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapColor"))));
 //BA.debugLineNum = 628;BA.debugLine="mFastScroll = Props.GetDefault(\"FastScroll\", Fals";
_mfastscroll = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScroll"),(Object)(__c.False)));
 //BA.debugLineNum = 629;BA.debugLine="mFastScrollMinItems = Props.GetDefault(\"FastScrol";
_mfastscrollminitems = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollMinItems"),(Object)(50))));
 //BA.debugLineNum = 630;BA.debugLine="mFastScrollColumnIndex = Props.GetDefault(\"FastSc";
_mfastscrollcolumnindex = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollColumnIndex"),(Object)(0))));
 //BA.debugLineNum = 631;BA.debugLine="mFastScrollShowLabel = Props.GetDefault(\"FastScro";
_mfastscrollshowlabel = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollShowLabel"),(Object)(__c.True)));
 //BA.debugLineNum = 632;BA.debugLine="mFastScrollFixedLabel = Props.GetDefault(\"FastScr";
_mfastscrollfixedlabel = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollFixedLabel"),(Object)(__c.False)));
 //BA.debugLineNum = 633;BA.debugLine="mFastScrollLabelMaxChars = Props.GetDefault(\"Fast";
_mfastscrolllabelmaxchars = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelMaxChars"),(Object)(10))));
 //BA.debugLineNum = 634;BA.debugLine="mFastScrollLabelWidth = DipToCurrent(Props.GetDef";
_mfastscrolllabelwidth = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelWidth"),(Object)(__c.DipToCurrent((int) (150)))))));
 //BA.debugLineNum = 635;BA.debugLine="mFastScrollLabelHeight = DipToCurrent(Props.GetDe";
_mfastscrolllabelheight = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelHeight"),(Object)(__c.DipToCurrent((int) (30)))))));
 //BA.debugLineNum = 636;BA.debugLine="mSortCaseInsensitive = Props.GetDefault(\"SortCase";
_msortcaseinsensitive = BA.ObjectToBoolean(_props.GetDefault((Object)("SortCaseInsensitive"),(Object)(__c.False)));
 //BA.debugLineNum = 637;BA.debugLine="mMultiColumnSort = Props.GetDefault(\"MultiColumnS";
_mmulticolumnsort = BA.ObjectToBoolean(_props.GetDefault((Object)("MultiColumnSort"),(Object)(__c.False)));
 //BA.debugLineNum = 639;BA.debugLine="InitTable";
_inittable();
 //BA.debugLineNum = 640;BA.debugLine="End Sub";
return "";
}
public String  _drawfastscrollcursor() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _ptharrow = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsfsc = null;
int _x1 = 0;
int _x2 = 0;
int _x3 = 0;
int _y1 = 0;
int _y2 = 0;
int _dd = 0;
int _rr = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _rct = null;
 //BA.debugLineNum = 855;BA.debugLine="Private Sub DrawFastScrollCursor";
 //BA.debugLineNum = 856;BA.debugLine="Private pthArrow As Path";
_ptharrow = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
 //BA.debugLineNum = 857;BA.debugLine="Private cvsFSc As Canvas";
_cvsfsc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 858;BA.debugLine="Private x1, x2, x3, y1, y2, dd, rr As Int";
_x1 = 0;
_x2 = 0;
_x3 = 0;
_y1 = 0;
_y2 = 0;
_dd = 0;
_rr = 0;
 //BA.debugLineNum = 859;BA.debugLine="Private rct As Rect";
_rct = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
 //BA.debugLineNum = 861;BA.debugLine="rr = 7dip";
_rr = __c.DipToCurrent((int) (7));
 //BA.debugLineNum = 863;BA.debugLine="cvsFSc.Initialize(pnlFastScrollCursor)";
_cvsfsc.Initialize((android.view.View)(_pnlfastscrollcursor.getObject()));
 //BA.debugLineNum = 864;BA.debugLine="rct.Initialize(0, 0, FScCursorWidth, FScCursorHei";
_rct.Initialize((int) (0),(int) (0),_fsccursorwidth,_fsccursorheight);
 //BA.debugLineNum = 865;BA.debugLine="cvsFSc.DrawRect(rct, Colors.Transparent, True, 1d";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__c.Colors.Transparent,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 867;BA.debugLine="cvsFSc.DrawCircle(rr, rr, rr, FScCursorCol1, True";
_cvsfsc.DrawCircle((float) (_rr),(float) (_rr),(float) (_rr),_fsccursorcol1,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 868;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, rr, rr, FS";
_cvsfsc.DrawCircle((float) (_fsccursorwidth-_rr),(float) (_rr),(float) (_rr),_fsccursorcol1,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 869;BA.debugLine="cvsFSc.DrawCircle(rr, FScCursorHeight - rr, rr, F";
_cvsfsc.DrawCircle((float) (_rr),(float) (_fsccursorheight-_rr),(float) (_rr),_fsccursorcol1,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 870;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, FScCursorH";
_cvsfsc.DrawCircle((float) (_fsccursorwidth-_rr),(float) (_fsccursorheight-_rr),(float) (_rr),_fsccursorcol1,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 872;BA.debugLine="rct.Initialize(rr, 0, FScCursorWidth - rr, rr)";
_rct.Initialize(_rr,(int) (0),(int) (_fsccursorwidth-_rr),_rr);
 //BA.debugLineNum = 873;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),_fsccursorcol1,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 874;BA.debugLine="rct.Initialize(0, rr, FScCursorWidth, FScCursorHe";
_rct.Initialize((int) (0),_rr,_fsccursorwidth,(int) (_fsccursorheight-_rr));
 //BA.debugLineNum = 875;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),_fsccursorcol1,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 876;BA.debugLine="rct.Initialize(rr, FScCursorHeight - rr, FScCurso";
_rct.Initialize(_rr,(int) (_fsccursorheight-_rr),_fsccursorwidth,_fsccursorheight);
 //BA.debugLineNum = 877;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),_fsccursorcol1,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 879;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 - 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (_fsccursorheight/(double)2-__c.DipToCurrent((int) (5))),(float) (_fsccursorwidth-__c.DipToCurrent((int) (5))),(float) (_fsccursorheight/(double)2-__c.DipToCurrent((int) (5))),_fsccursorcol2,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 880;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2, FScCur";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (_fsccursorheight/(double)2),(float) (_fsccursorwidth-__c.DipToCurrent((int) (5))),(float) (_fsccursorheight/(double)2),_fsccursorcol2,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 881;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 + 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (_fsccursorheight/(double)2+__c.DipToCurrent((int) (5))),(float) (_fsccursorwidth-__c.DipToCurrent((int) (5))),(float) (_fsccursorheight/(double)2+__c.DipToCurrent((int) (5))),_fsccursorcol2,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 883;BA.debugLine="dd = 7dip";
_dd = __c.DipToCurrent((int) (7));
 //BA.debugLineNum = 884;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (_fsccursorwidth/(double)2);
 //BA.debugLineNum = 885;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
 //BA.debugLineNum = 886;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
 //BA.debugLineNum = 887;BA.debugLine="y2 = dd";
_y2 = _dd;
 //BA.debugLineNum = 888;BA.debugLine="y1 = y2 + dd";
_y1 = (int) (_y2+_dd);
 //BA.debugLineNum = 889;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
 //BA.debugLineNum = 890;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
 //BA.debugLineNum = 891;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
 //BA.debugLineNum = 892;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),_fsccursorcol2,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 894;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (_fsccursorwidth/(double)2);
 //BA.debugLineNum = 895;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
 //BA.debugLineNum = 896;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
 //BA.debugLineNum = 897;BA.debugLine="y2 = FScCursorHeight - dd";
_y2 = (int) (_fsccursorheight-_dd);
 //BA.debugLineNum = 898;BA.debugLine="y1 = y2 - dd";
_y1 = (int) (_y2-_dd);
 //BA.debugLineNum = 899;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
 //BA.debugLineNum = 900;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
 //BA.debugLineNum = 901;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
 //BA.debugLineNum = 902;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),_fsccursorcol2,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 903;BA.debugLine="pnlFastScrollCursor.Invalidate";
_pnlfastscrollcursor.Invalidate();
 //BA.debugLineNum = 904;BA.debugLine="End Sub";
return "";
}
public String  _fastscrolltimer_tick() throws Exception{
 //BA.debugLineNum = 2613;BA.debugLine="Private Sub FastScrollTimer_Tick";
 //BA.debugLineNum = 2614;BA.debugLine="FScTimer.Enabled = False";
_fsctimer.setEnabled(__c.False);
 //BA.debugLineNum = 2615;BA.debugLine="lblFastScroll.Visible = False";
_lblfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 2616;BA.debugLine="pnlFastScroll.Visible = False";
_pnlfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 2617;BA.debugLine="End Sub";
return "";
}
public boolean  _getallowselection() throws Exception{
 //BA.debugLineNum = 2163;BA.debugLine="Public Sub getAllowSelection As Boolean";
 //BA.debugLineNum = 2164;BA.debugLine="Return cAllowSelection";
if (true) return _callowselection;
 //BA.debugLineNum = 2165;BA.debugLine="End Sub";
return false;
}
public int  _getcellalignment() throws Exception{
 //BA.debugLineNum = 2653;BA.debugLine="Public Sub getCellAlignment As Int";
 //BA.debugLineNum = 2654;BA.debugLine="Return cAlignment";
if (true) return _calignment;
 //BA.debugLineNum = 2655;BA.debugLine="End Sub";
return 0;
}
public int[]  _getcolumncolors() throws Exception{
 //BA.debugLineNum = 3564;BA.debugLine="Public Sub GetColumnColors As Int()";
 //BA.debugLineNum = 3565;BA.debugLine="Return cColumnColors";
if (true) return _ccolumncolors;
 //BA.debugLineNum = 3566;BA.debugLine="End Sub";
return null;
}
public String  _getcolumndatatype(int _column) throws Exception{
 //BA.debugLineNum = 3940;BA.debugLine="Public Sub GetColumnDataType(Column As Int) As Str";
 //BA.debugLineNum = 3941;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>_mnumberofcolumns-1) { 
 //BA.debugLineNum = 3942;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
 //BA.debugLineNum = 3943;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 3946;BA.debugLine="Return cColumnDataType(Column)";
if (true) return _ccolumndatatype[_column];
 //BA.debugLineNum = 3947;BA.debugLine="End Sub";
return "";
}
public String[]  _getcolumndatatypes() throws Exception{
 //BA.debugLineNum = 3970;BA.debugLine="Public Sub GetColumnDataTypes As String()";
 //BA.debugLineNum = 3971;BA.debugLine="Return cColumnDataType";
if (true) return _ccolumndatatype;
 //BA.debugLineNum = 3972;BA.debugLine="End Sub";
return null;
}
public int[]  _getcolumnwidths() throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Public Sub GetColumnWidths As Int()";
 //BA.debugLineNum = 1035;BA.debugLine="Return SavedWidths";
if (true) return _savedwidths;
 //BA.debugLineNum = 1036;BA.debugLine="End Sub";
return null;
}
public int  _getcontrastcolor(int _color) throws Exception{
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
int _yiq = 0;
 //BA.debugLineNum = 4152;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
 //BA.debugLineNum = 4153;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
 //BA.debugLineNum = 4155;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
 //BA.debugLineNum = 4156;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
 //BA.debugLineNum = 4157;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
 //BA.debugLineNum = 4158;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
 //BA.debugLineNum = 4160;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
 //BA.debugLineNum = 4162;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
 //BA.debugLineNum = 4163;BA.debugLine="Return Colors.Black";
if (true) return __c.Colors.Black;
 }else {
 //BA.debugLineNum = 4165;BA.debugLine="Return Colors.White";
if (true) return __c.Colors.White;
 };
 //BA.debugLineNum = 4167;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscroll() throws Exception{
 //BA.debugLineNum = 4172;BA.debugLine="Public Sub getFastScroll As Boolean";
 //BA.debugLineNum = 4173;BA.debugLine="Return mFastScroll";
if (true) return _mfastscroll;
 //BA.debugLineNum = 4174;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrollcolumnindex() throws Exception{
 //BA.debugLineNum = 4196;BA.debugLine="Public Sub getFastScrollColumnIndex As Int";
 //BA.debugLineNum = 4197;BA.debugLine="Return mFastScrollColumnIndex";
if (true) return _mfastscrollcolumnindex;
 //BA.debugLineNum = 4198;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollfixedlabel() throws Exception{
 //BA.debugLineNum = 4220;BA.debugLine="Public Sub getFastScrollFixedLabel As Boolean";
 //BA.debugLineNum = 4221;BA.debugLine="Return mFastScrollFixedLabel";
if (true) return _mfastscrollfixedlabel;
 //BA.debugLineNum = 4222;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrolllabelheight() throws Exception{
 //BA.debugLineNum = 4261;BA.debugLine="Public Sub getFastScrollLabelHeight As Int";
 //BA.debugLineNum = 4262;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return _mfastscrolllabelwidth;
 //BA.debugLineNum = 4263;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelmaxchars() throws Exception{
 //BA.debugLineNum = 4237;BA.debugLine="Public Sub getFastScrollLabelMaxChars As Int";
 //BA.debugLineNum = 4238;BA.debugLine="Return mFastScrollLabelMaxChars";
if (true) return _mfastscrolllabelmaxchars;
 //BA.debugLineNum = 4239;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelwidth() throws Exception{
 //BA.debugLineNum = 4246;BA.debugLine="Public Sub getFastScrollLabelWidth As Int";
 //BA.debugLineNum = 4247;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return _mfastscrolllabelwidth;
 //BA.debugLineNum = 4248;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrollminitems() throws Exception{
 //BA.debugLineNum = 4185;BA.debugLine="Public Sub getFastScrollMinItems As Int";
 //BA.debugLineNum = 4186;BA.debugLine="Return mFastScrollMinItems";
if (true) return _mfastscrollminitems;
 //BA.debugLineNum = 4187;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollshowlabel() throws Exception{
 //BA.debugLineNum = 4208;BA.debugLine="Public Sub getFastScrollShowLabel As Boolean";
 //BA.debugLineNum = 4209;BA.debugLine="Return mFastScrollShowLabel";
if (true) return _mfastscrollshowlabel;
 //BA.debugLineNum = 4210;BA.debugLine="End Sub";
return false;
}
public boolean  _getfirstcolumnfixed() throws Exception{
 //BA.debugLineNum = 4147;BA.debugLine="Public Sub getFirstColumnFixed As Boolean";
 //BA.debugLineNum = 4148;BA.debugLine="Return mFirstColumnFixed";
if (true) return _mfirstcolumnfixed;
 //BA.debugLineNum = 4149;BA.debugLine="End Sub";
return false;
}
public int  _getheadercolor() throws Exception{
 //BA.debugLineNum = 2726;BA.debugLine="Public Sub getHeaderColor As Int";
 //BA.debugLineNum = 2727;BA.debugLine="Return cHeaderColor";
if (true) return _cheadercolor;
 //BA.debugLineNum = 2728;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadercolors() throws Exception{
 //BA.debugLineNum = 3638;BA.debugLine="Public Sub GetHeaderColors As Int()";
 //BA.debugLineNum = 3639;BA.debugLine="Return cHeaderColors";
if (true) return _cheadercolors;
 //BA.debugLineNum = 3640;BA.debugLine="End Sub";
return null;
}
public int  _getheaderheight() throws Exception{
 //BA.debugLineNum = 2695;BA.debugLine="Public Sub getHeaderHeight As Int";
 //BA.debugLineNum = 2696;BA.debugLine="Return cHeaderHeight";
if (true) return _cheaderheight;
 //BA.debugLineNum = 2697;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel() throws Exception{
 //BA.debugLineNum = 2177;BA.debugLine="Public Sub getHeaderPanel As Panel";
 //BA.debugLineNum = 2178;BA.debugLine="Return Header";
if (true) return _header;
 //BA.debugLineNum = 2179;BA.debugLine="End Sub";
return null;
}
public int  _getheadertextcolor() throws Exception{
 //BA.debugLineNum = 2757;BA.debugLine="Public Sub getHeaderTextColor As Int";
 //BA.debugLineNum = 2758;BA.debugLine="Return cHeaderTextColor";
if (true) return _cheadertextcolor;
 //BA.debugLineNum = 2759;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadertextcolors() throws Exception{
 //BA.debugLineNum = 3759;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
 //BA.debugLineNum = 3760;BA.debugLine="Return cHeaderTextColors";
if (true) return _cheadertextcolors;
 //BA.debugLineNum = 3761;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _getheadertypeface() throws Exception{
 //BA.debugLineNum = 3669;BA.debugLine="Public Sub getHeaderTypeFace As Typeface";
 //BA.debugLineNum = 3670;BA.debugLine="Return cHeaderTypeFace";
if (true) return _cheadertypeface;
 //BA.debugLineNum = 3671;BA.debugLine="End Sub";
return null;
}
public int  _getheight() throws Exception{
 //BA.debugLineNum = 2301;BA.debugLine="Public Sub getHeight As Int";
 //BA.debugLineNum = 2302;BA.debugLine="Return pnlTable.Height";
if (true) return _pnltable.getHeight();
 //BA.debugLineNum = 2303;BA.debugLine="End Sub";
return 0;
}
public int  _getinnertotalwidth() throws Exception{
 //BA.debugLineNum = 2270;BA.debugLine="Public Sub getInnerTotalWidth As Int";
 //BA.debugLineNum = 2271;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 2272;BA.debugLine="Return Header.Width";
if (true) return _header.getWidth();
 }else {
 //BA.debugLineNum = 2274;BA.debugLine="Return HeaderFirst.Width + Header.Width";
if (true) return (int) (_headerfirst.getWidth()+_header.getWidth());
 };
 //BA.debugLineNum = 2276;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _getlabels(int _row) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.ef.table._rowcol _rc = null;
 //BA.debugLineNum = 1440;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
 //BA.debugLineNum = 1441;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 1442;BA.debugLine="If LabelsCache.Size > 0 Then";
if (_labelscache.getSize()>0) { 
 //BA.debugLineNum = 1444;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_labelscache.Get((int) (_labelscache.getSize()-1)));
 //BA.debugLineNum = 1445;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
_labelscache.RemoveAt((int) (_labelscache.getSize()-1));
 }else {
 //BA.debugLineNum = 1447;BA.debugLine="lbls = CreateNewLabels";
_lbls = _createnewlabels();
 };
 //BA.debugLineNum = 1449;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 1450;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
 //BA.debugLineNum = 1451;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.example.ef.table._rowcol)(_lbls[_i].getTag());
 //BA.debugLineNum = 1452;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
 //BA.debugLineNum = 1454;BA.debugLine="Return lbls";
if (true) return _lbls;
 //BA.debugLineNum = 1455;BA.debugLine="End Sub";
return null;
}
public int  _getleft() throws Exception{
 //BA.debugLineNum = 2242;BA.debugLine="Public Sub getLeft As Int";
 //BA.debugLineNum = 2243;BA.debugLine="Return pnlTable.Left";
if (true) return _pnltable.getLeft();
 //BA.debugLineNum = 2244;BA.debugLine="End Sub";
return 0;
}
public int  _getlinewidth() throws Exception{
 //BA.debugLineNum = 2319;BA.debugLine="Public Sub getLineWidth As Int";
 //BA.debugLineNum = 2320;BA.debugLine="Return cLineWidth";
if (true) return _clinewidth;
 //BA.debugLineNum = 2321;BA.debugLine="End Sub";
return 0;
}
public boolean  _getmulticolumnsort() throws Exception{
 //BA.debugLineNum = 5026;BA.debugLine="Public Sub getMultiColumnSort As Boolean";
 //BA.debugLineNum = 5027;BA.debugLine="Return mMultiColumnSort";
if (true) return _mmulticolumnsort;
 //BA.debugLineNum = 5028;BA.debugLine="End Sub";
return false;
}
public boolean  _getmultiselect() throws Exception{
 //BA.debugLineNum = 2151;BA.debugLine="Public Sub getMultiSelect As Boolean";
 //BA.debugLineNum = 2152;BA.debugLine="Return mMultiSelect";
if (true) return _mmultiselect;
 //BA.debugLineNum = 2153;BA.debugLine="End Sub";
return false;
}
public int  _getnumberofcolumns() throws Exception{
 //BA.debugLineNum = 3975;BA.debugLine="Public Sub getNumberOfColumns As Int";
 //BA.debugLineNum = 3976;BA.debugLine="Return mNumberOfColumns";
if (true) return _mnumberofcolumns;
 //BA.debugLineNum = 3977;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberoffixedcolumns() throws Exception{
 //BA.debugLineNum = 4124;BA.debugLine="Public Sub getNumberOfFixedColumns As Int";
 //BA.debugLineNum = 4125;BA.debugLine="Return mNumberOfFixedColumns";
if (true) return _mnumberoffixedcolumns;
 //BA.debugLineNum = 4126;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberofrows() throws Exception{
 //BA.debugLineNum = 3996;BA.debugLine="Public Sub getNumberOfRows As Int";
 //BA.debugLineNum = 3997;BA.debugLine="Return Data.Size";
if (true) return _data.getSize();
 //BA.debugLineNum = 3998;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel() throws Exception{
 //BA.debugLineNum = 3840;BA.debugLine="Public Sub getPanel As Panel";
 //BA.debugLineNum = 3841;BA.debugLine="Return pnlTable";
if (true) return _pnltable;
 //BA.debugLineNum = 3842;BA.debugLine="End Sub";
return null;
}
public int  _getrowcolor1() throws Exception{
 //BA.debugLineNum = 2769;BA.debugLine="Public Sub getRowColor1 As Int";
 //BA.debugLineNum = 2770;BA.debugLine="Return cRowColor1";
if (true) return _crowcolor1;
 //BA.debugLineNum = 2771;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolor2() throws Exception{
 //BA.debugLineNum = 2781;BA.debugLine="Public Sub getRowColor2 As Int";
 //BA.debugLineNum = 2782;BA.debugLine="Return cRowColor2";
if (true) return _crowcolor2;
 //BA.debugLineNum = 2783;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolorn(int _row) throws Exception{
 //BA.debugLineNum = 2817;BA.debugLine="Public Sub GetRowColorN(Row As Int) As Int";
 //BA.debugLineNum = 2818;BA.debugLine="Return lstRowColors.Get(lstRowColorIndexes.Get(Ro";
if (true) return (int)(BA.ObjectToNumber(_lstrowcolors.Get((int) ((double)(BA.ObjectToNumber(_lstrowcolorindexes.Get(_row)))-2))));
 //BA.debugLineNum = 2819;BA.debugLine="End Sub";
return 0;
}
public int  _getrowheight() throws Exception{
 //BA.debugLineNum = 2993;BA.debugLine="Public Sub getRowHeight As Int";
 //BA.debugLineNum = 2994;BA.debugLine="Return cRowHeight";
if (true) return _crowheight;
 //BA.debugLineNum = 2995;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcellcolor() throws Exception{
 //BA.debugLineNum = 2863;BA.debugLine="Public Sub getSelectedCellColor As Int";
 //BA.debugLineNum = 2864;BA.debugLine="Return cSelectedCellColor";
if (true) return _cselectedcellcolor;
 //BA.debugLineNum = 2865;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcelltextcolor() throws Exception{
 //BA.debugLineNum = 2875;BA.debugLine="Public Sub getSelectedCellTextColor As Int";
 //BA.debugLineNum = 2876;BA.debugLine="Return cSelectedCellTextColor";
if (true) return _cselectedcelltextcolor;
 //BA.debugLineNum = 2877;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedrowcolor() throws Exception{
 //BA.debugLineNum = 2839;BA.debugLine="Public Sub getSelectedRowColor As Int";
 //BA.debugLineNum = 2840;BA.debugLine="Return cSelectedRowColor";
if (true) return _cselectedrowcolor;
 //BA.debugLineNum = 2841;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows() throws Exception{
anywheresoftware.b4a.objects.collections.List _sr = null;
 //BA.debugLineNum = 2182;BA.debugLine="Public Sub getSelectedRows As List";
 //BA.debugLineNum = 2183;BA.debugLine="Dim sr As List";
_sr = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2184;BA.debugLine="sr.Initialize";
_sr.Initialize();
 //BA.debugLineNum = 2185;BA.debugLine="sr.AddAll(SelectedRows)";
_sr.AddAll(_selectedrows);
 //BA.debugLineNum = 2186;BA.debugLine="Return sr";
if (true) return _sr;
 //BA.debugLineNum = 2187;BA.debugLine="End Sub";
return null;
}
public int  _getselectedrowtextcolor() throws Exception{
 //BA.debugLineNum = 2851;BA.debugLine="Public Sub getSelectedRowTextColor As Int";
 //BA.debugLineNum = 2852;BA.debugLine="Return cSelectedRowTextColor";
if (true) return _cselectedrowtextcolor;
 //BA.debugLineNum = 2853;BA.debugLine="End Sub";
return 0;
}
public boolean  _getshowstatusline() throws Exception{
 //BA.debugLineNum = 3835;BA.debugLine="Public Sub getShowStatusLine As Boolean";
 //BA.debugLineNum = 3836;BA.debugLine="Return cShowStatusLine";
if (true) return _cshowstatusline;
 //BA.debugLineNum = 3837;BA.debugLine="End Sub";
return false;
}
public boolean  _getsingleline() throws Exception{
 //BA.debugLineNum = 3783;BA.debugLine="Public Sub getSingleLine As Boolean";
 //BA.debugLineNum = 3784;BA.debugLine="Return cSingleLine";
if (true) return _csingleline;
 //BA.debugLineNum = 3785;BA.debugLine="End Sub";
return false;
}
public long  _getsize() throws Exception{
 //BA.debugLineNum = 2232;BA.debugLine="Public Sub getSize As Long";
 //BA.debugLineNum = 2233;BA.debugLine="Return Data.Size";
if (true) return (long) (_data.getSize());
 //BA.debugLineNum = 2234;BA.debugLine="End Sub";
return 0L;
}
public int  _getsortbitmapcolor() throws Exception{
 //BA.debugLineNum = 4044;BA.debugLine="Public Sub getSortBitmapColor As Int";
 //BA.debugLineNum = 4045;BA.debugLine="Return cSortBitmapColor";
if (true) return _csortbitmapcolor;
 //BA.debugLineNum = 4046;BA.debugLine="End Sub";
return 0;
}
public int  _getsortbitmapwidth() throws Exception{
 //BA.debugLineNum = 4034;BA.debugLine="Public Sub getSortBitmapWidth As Int";
 //BA.debugLineNum = 4035;BA.debugLine="Return cSortBitmapWidth";
if (true) return _csortbitmapwidth;
 //BA.debugLineNum = 4036;BA.debugLine="End Sub";
return 0;
}
public boolean  _getsortcaseinsensitive() throws Exception{
 //BA.debugLineNum = 5034;BA.debugLine="Public Sub getSortCaseInsensitive As Boolean";
 //BA.debugLineNum = 5035;BA.debugLine="Return mSortCaseInsensitive";
if (true) return _msortcaseinsensitive;
 //BA.debugLineNum = 5036;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortcolumn() throws Exception{
 //BA.debugLineNum = 3501;BA.debugLine="Public Sub getSortColumn As Boolean";
 //BA.debugLineNum = 3502;BA.debugLine="Return cSortColumn";
if (true) return _csortcolumn;
 //BA.debugLineNum = 3503;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortremoveaccents() throws Exception{
 //BA.debugLineNum = 4004;BA.debugLine="Public Sub getSortRemoveAccents As Boolean";
 //BA.debugLineNum = 4005;BA.debugLine="Return cSortRemoveAccents";
if (true) return _csortremoveaccents;
 //BA.debugLineNum = 4006;BA.debugLine="End Sub";
return false;
}
public int  _getstatuslineheight() throws Exception{
 //BA.debugLineNum = 3002;BA.debugLine="Public Sub getStatusLineHeight As Int";
 //BA.debugLineNum = 3003;BA.debugLine="Return cStatusLineHeight";
if (true) return _cstatuslineheight;
 //BA.debugLineNum = 3004;BA.debugLine="End Sub";
return 0;
}
public int  _gettablecolor() throws Exception{
 //BA.debugLineNum = 2892;BA.debugLine="Public Sub getTableColor As Int";
 //BA.debugLineNum = 2893;BA.debugLine="Return cTableColor";
if (true) return _ctablecolor;
 //BA.debugLineNum = 2894;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag() throws Exception{
 //BA.debugLineNum = 3918;BA.debugLine="Public Sub getTag As Object";
 //BA.debugLineNum = 3919;BA.debugLine="Return pnlTable.Tag";
if (true) return _pnltable.getTag();
 //BA.debugLineNum = 3920;BA.debugLine="End Sub";
return null;
}
public int  _gettextcolor() throws Exception{
 //BA.debugLineNum = 2926;BA.debugLine="Public Sub getTextColor As Int";
 //BA.debugLineNum = 2927;BA.debugLine="Return cTextColor";
if (true) return _ctextcolor;
 //BA.debugLineNum = 2928;BA.debugLine="End Sub";
return 0;
}
public int[]  _gettextcolors() throws Exception{
 //BA.debugLineNum = 3607;BA.debugLine="Public Sub GetTextColors As Int()";
 //BA.debugLineNum = 3608;BA.debugLine="Return cTextColors";
if (true) return _ctextcolors;
 //BA.debugLineNum = 3609;BA.debugLine="End Sub";
return null;
}
public float  _gettextsize() throws Exception{
 //BA.debugLineNum = 2981;BA.debugLine="Public Sub getTextSize As Float";
 //BA.debugLineNum = 2982;BA.debugLine="Return cTextSize";
if (true) return _ctextsize;
 //BA.debugLineNum = 2983;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop() throws Exception{
 //BA.debugLineNum = 2252;BA.debugLine="Public Sub getTop As Int";
 //BA.debugLineNum = 2253;BA.debugLine="Return pnlTable.Top";
if (true) return _pnltable.getTop();
 //BA.debugLineNum = 2254;BA.debugLine="End Sub";
return 0;
}
public int  _gettoprowindex() throws Exception{
 //BA.debugLineNum = 2325;BA.debugLine="Public Sub getTopRowIndex As Int";
 //BA.debugLineNum = 2326;BA.debugLine="Return SV2.VerticalScrollPosition / cRowHeight";
if (true) return (int) (_sv2.getVerticalScrollPosition()/(double)_crowheight);
 //BA.debugLineNum = 2327;BA.debugLine="End Sub";
return 0;
}
public boolean  _getusecolumncolors() throws Exception{
 //BA.debugLineNum = 3539;BA.debugLine="Public Sub getUseColumnColors As Boolean";
 //BA.debugLineNum = 3540;BA.debugLine="Return cUseColumnColors";
if (true) return _cusecolumncolors;
 //BA.debugLineNum = 3541;BA.debugLine="End Sub";
return false;
}
public String  _getvalue(int _col,int _row) throws Exception{
String[] _values = null;
 //BA.debugLineNum = 1608;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As Str";
 //BA.debugLineNum = 1609;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 1610;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(_data.Get(_row));
 //BA.debugLineNum = 1611;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
 //BA.debugLineNum = 1612;BA.debugLine="End Sub";
return "";
}
public String[]  _getvalues(int _row) throws Exception{
String[] _rowdata = null;
String[] _tmp = null;
int _i = 0;
 //BA.debugLineNum = 1978;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
 //BA.debugLineNum = 1979;BA.debugLine="Dim rowData() As String  = Data.Get(Row) ' will t";
_rowdata = (String[])(_data.Get(_row));
 //BA.debugLineNum = 1980;BA.debugLine="Dim tmp(mNumberOfColumns) As String";
_tmp = new String[_mnumberofcolumns];
java.util.Arrays.fill(_tmp,"");
 //BA.debugLineNum = 1981;BA.debugLine="For i=0 To mNumberOfColumns-1 ' copy the array";
{
final int step3 = 1;
final int limit3 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 1982;BA.debugLine="tmp(i) =  rowData(i)";
_tmp[_i] = _rowdata[_i];
 }
};
 //BA.debugLineNum = 1984;BA.debugLine="Return tmp";
if (true) return _tmp;
 //BA.debugLineNum = 1985;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible() throws Exception{
 //BA.debugLineNum = 2310;BA.debugLine="Public Sub getVisible As Boolean";
 //BA.debugLineNum = 2311;BA.debugLine="Return pnlTable.Visible";
if (true) return _pnltable.getVisible();
 //BA.debugLineNum = 2312;BA.debugLine="End Sub";
return false;
}
public int  _getwidth() throws Exception{
 //BA.debugLineNum = 2278;BA.debugLine="Public Sub getWidth As Int";
 //BA.debugLineNum = 2279;BA.debugLine="Return pnlTable.Width";
if (true) return _pnltable.getWidth();
 //BA.debugLineNum = 2280;BA.debugLine="End Sub";
return 0;
}
public String  _header_click() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
boolean _bsorted = false;
int _dir = 0;
 //BA.debugLineNum = 2330;BA.debugLine="Private Sub Header_Click";
 //BA.debugLineNum = 2332;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2333;BA.debugLine="Dim col As Int";
_col = 0;
 //BA.debugLineNum = 2334;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
 //BA.debugLineNum = 2338;BA.debugLine="If Data.Size < 2 Then Return";
if (_data.getSize()<2) { 
if (true) return "";};
 //BA.debugLineNum = 2340;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 2341;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
 //BA.debugLineNum = 2345;BA.debugLine="If cSortColumn Then 'this is set in the designer";
if (_csortcolumn) { 
 //BA.debugLineNum = 2346;BA.debugLine="Dim dir As Int = 0 ' unsorted";
_dir = (int) (0);
 //BA.debugLineNum = 2347;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
if ((_sortedcol==_col)) { 
 //BA.debugLineNum = 2348;BA.debugLine="Select sortingDir";
switch (BA.switchObjectToInt(_sortingdir,(int) (0),(int) (1),(int) (-1))) {
case 0: {
 //BA.debugLineNum = 2349;BA.debugLine="Case 0: dir = -1 ' going up";
_dir = (int) (-1);
 break; }
case 1: {
 //BA.debugLineNum = 2350;BA.debugLine="Case 1: dir = -1";
_dir = (int) (-1);
 break; }
case 2: {
 //BA.debugLineNum = 2351;BA.debugLine="Case -1: dir = 1";
_dir = (int) (1);
 break; }
}
;
 }else {
 //BA.debugLineNum = 2354;BA.debugLine="dir = -1 ' start with going up";
_dir = (int) (-1);
 };
 //BA.debugLineNum = 2357;BA.debugLine="bSorted = SortTable2(col, dir <= 0)";
_bsorted = _sorttable2(_col,_dir<=0);
 //BA.debugLineNum = 2359;BA.debugLine="If bSorted Then";
if (_bsorted) { 
 //BA.debugLineNum = 2360;BA.debugLine="showHeaderSorting(col, dir)";
_showheadersorting(_col,_dir);
 //BA.debugLineNum = 2361;BA.debugLine="sortedCol = col 'only change if a sort actually";
_sortedcol = _col;
 //BA.debugLineNum = 2362;BA.debugLine="sortingDir = dir 'only change if a sort actuall";
_sortingdir = _dir;
 }else {
 //BA.debugLineNum = 2364;BA.debugLine="showHeaderSorting(col, 2) 'no sort done so rect";
_showheadersorting(_col,(int) (2));
 };
 };
 //BA.debugLineNum = 2368;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,_ccallback,_ceventname+"_HeaderClick")) { 
 //BA.debugLineNum = 2369;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,_ccallback,_ceventname+"_HeaderClick",(Object)(_col));
 };
 //BA.debugLineNum = 2372;BA.debugLine="End Sub";
return "";
}
public String  _header_longclick() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
 //BA.debugLineNum = 1583;BA.debugLine="Private Sub Header_LongClick";
 //BA.debugLineNum = 1585;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1586;BA.debugLine="Dim col As Int";
_col = 0;
 //BA.debugLineNum = 1587;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
 //BA.debugLineNum = 1588;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
 //BA.debugLineNum = 1589;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderLong";
if (__c.SubExists(ba,_ccallback,_ceventname+"_HeaderLongClick")) { 
 //BA.debugLineNum = 1590;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderLongCli";
__c.CallSubNew2(ba,_ccallback,_ceventname+"_HeaderLongClick",(Object)(_col));
 };
 //BA.debugLineNum = 1592;BA.debugLine="End Sub";
return "";
}
public String  _hidecol(int _col) throws Exception{
int[] _tmpwidths = null;
int _i = 0;
 //BA.debugLineNum = 2190;BA.debugLine="Public Sub hideCol(col As Int)";
 //BA.debugLineNum = 2191;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[_savedwidths.length];
;
 //BA.debugLineNum = 2192;BA.debugLine="For i = 0 To SavedWidths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (_savedwidths.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 2193;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = _savedwidths[_i];
 }
};
 //BA.debugLineNum = 2196;BA.debugLine="tmpWidths(col) = 0	'???";
_tmpwidths[_col] = (int) (0);
 //BA.debugLineNum = 2197;BA.debugLine="SetColumnsWidths(tmpWidths)";
_setcolumnswidths(_tmpwidths);
 //BA.debugLineNum = 2198;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(int _row) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
 //BA.debugLineNum = 1425;BA.debugLine="Private Sub HideRow (Row As Int)";
 //BA.debugLineNum = 1427;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 1428;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.Get((Object)(_row)));
 //BA.debugLineNum = 1429;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
 //BA.debugLineNum = 1431;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1433;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 1434;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
 //BA.debugLineNum = 1436;BA.debugLine="visibleRows.Remove(Row)";
_visiblerows.Remove((Object)(_row));
 //BA.debugLineNum = 1437;BA.debugLine="LabelsCache.Add(lbls)";
_labelscache.Add((Object)(_lbls));
 //BA.debugLineNum = 1438;BA.debugLine="End Sub";
return "";
}
public String  _initfastscroll() throws Exception{
 //BA.debugLineNum = 2585;BA.debugLine="Private Sub InitFastScroll";
 //BA.debugLineNum = 2586;BA.debugLine="pnlFastScroll.Top = SV2.Top";
_pnlfastscroll.setTop(_sv2.getTop());
 //BA.debugLineNum = 2587;BA.debugLine="pnlFastScroll.Height = SV2.Height";
_pnlfastscroll.setHeight(_sv2.getHeight());
 //BA.debugLineNum = 2588;BA.debugLine="FastScrollHeight = pnlFastScroll.Height - pnlFast";
_fastscrollheight = (int) (_pnlfastscroll.getHeight()-_pnlfastscrollcursor.getHeight());
 //BA.debugLineNum = 2589;BA.debugLine="pnlFastScrollCursor.Top = SV2.VerticalScrollPosit";
_pnlfastscrollcursor.setTop((int) (_sv2.getVerticalScrollPosition()*_fscscale));
 //BA.debugLineNum = 2590;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight - m";
_fsclabeltopdelta = (int) (_sv2.getTop()+(_fsccursorheight-_mfastscrolllabelheight)/(double)2);
 //BA.debugLineNum = 2591;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (_mfastscrollfixedlabel==__c.False) { 
 //BA.debugLineNum = 2592;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
_lblfastscroll.setTop((int) (_pnlfastscrollcursor.getTop()+_fsclabeltopdelta));
 };
 //BA.debugLineNum = 2594;BA.debugLine="DrawFastScrollCursor";
_drawfastscrollcursor();
 //BA.debugLineNum = 2595;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 560;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
 //BA.debugLineNum = 561;BA.debugLine="cEventName = EventName";
_ceventname = _eventname;
 //BA.debugLineNum = 562;BA.debugLine="cCallBack = CallBack";
_ccallback = _callback;
 //BA.debugLineNum = 564;BA.debugLine="cSortBitmapWidth = 10dip";
_csortbitmapwidth = __c.DipToCurrent((int) (10));
 //BA.debugLineNum = 565;BA.debugLine="cSortBitmapColor = Colors.Yellow";
_csortbitmapcolor = __c.Colors.Yellow;
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
return "";
}
public String  _initializesortingbitmaps() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _pthasc = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _pthdes = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _pthequal = null;
 //BA.debugLineNum = 818;BA.debugLine="Private Sub InitializeSortingBitmaps";
 //BA.debugLineNum = 819;BA.debugLine="Private pthAsc, pthDes, pthEqual As Path";
_pthasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
 //BA.debugLineNum = 821;BA.debugLine="cSortBitmapHeight = cSortBitmapWidth / 2";
_csortbitmapheight = (int) (_csortbitmapwidth/(double)2);
 //BA.debugLineNum = 823;BA.debugLine="pnlAsc.Initialize(\"\")";
_pnlasc.Initialize(ba,"");
 //BA.debugLineNum = 824;BA.debugLine="pnlTable.AddView(pnlAsc, 0, 0, cSortBitmapWidth,";
_pnltable.AddView((android.view.View)(_pnlasc.getObject()),(int) (0),(int) (0),_csortbitmapwidth,_csortbitmapheight);
 //BA.debugLineNum = 825;BA.debugLine="cvsAsc.Initialize(pnlAsc)";
_cvsasc.Initialize((android.view.View)(_pnlasc.getObject()));
 //BA.debugLineNum = 826;BA.debugLine="pthAsc.Initialize(0, 0)";
_pthasc.Initialize((float) (0),(float) (0));
 //BA.debugLineNum = 827;BA.debugLine="pthAsc.LineTo(cSortBitmapWidth, 0)";
_pthasc.LineTo((float) (_csortbitmapwidth),(float) (0));
 //BA.debugLineNum = 828;BA.debugLine="pthAsc.LineTo(cSortBitmapHeight, cSortBitmapHeigh";
_pthasc.LineTo((float) (_csortbitmapheight),(float) (_csortbitmapheight));
 //BA.debugLineNum = 829;BA.debugLine="cvsAsc.DrawColor(Colors.Transparent)";
_cvsasc.DrawColor(__c.Colors.Transparent);
 //BA.debugLineNum = 830;BA.debugLine="cvsAsc.DrawPath(pthAsc, cSortBitmapColor, True, 1";
_cvsasc.DrawPath((android.graphics.Path)(_pthasc.getObject()),_csortbitmapcolor,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 831;BA.debugLine="bmpAsc = cvsAsc.Bitmap";
_bmpasc = _cvsasc.getBitmap();
 //BA.debugLineNum = 833;BA.debugLine="cvsDes.Initialize(pnlAsc)";
_cvsdes.Initialize((android.view.View)(_pnlasc.getObject()));
 //BA.debugLineNum = 834;BA.debugLine="pthDes.Initialize(0, cSortBitmapHeight)";
_pthdes.Initialize((float) (0),(float) (_csortbitmapheight));
 //BA.debugLineNum = 835;BA.debugLine="pthDes.LineTo(cSortBitmapHeight, 0)";
_pthdes.LineTo((float) (_csortbitmapheight),(float) (0));
 //BA.debugLineNum = 836;BA.debugLine="pthDes.LineTo(cSortBitmapWidth, cSortBitmapHeight";
_pthdes.LineTo((float) (_csortbitmapwidth),(float) (_csortbitmapheight));
 //BA.debugLineNum = 837;BA.debugLine="cvsDes.DrawColor(Colors.Transparent)";
_cvsdes.DrawColor(__c.Colors.Transparent);
 //BA.debugLineNum = 838;BA.debugLine="cvsDes.DrawPath(pthDes, cSortBitmapColor, True, 1";
_cvsdes.DrawPath((android.graphics.Path)(_pthdes.getObject()),_csortbitmapcolor,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 839;BA.debugLine="bmpDes = cvsDes.Bitmap";
_bmpdes = _cvsdes.getBitmap();
 //BA.debugLineNum = 842;BA.debugLine="cvsEqual.Initialize(pnlAsc)";
_cvsequal.Initialize((android.view.View)(_pnlasc.getObject()));
 //BA.debugLineNum = 843;BA.debugLine="pthEqual.Initialize(0, cSortBitmapHeight / 2)";
_pthequal.Initialize((float) (0),(float) (_csortbitmapheight/(double)2));
 //BA.debugLineNum = 844;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, cSortBitmap";
_pthequal.LineTo((float) (_csortbitmapwidth/(double)2),(float) (_csortbitmapheight));
 //BA.debugLineNum = 845;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth, cSortBitmapHeig";
_pthequal.LineTo((float) (_csortbitmapwidth),(float) (_csortbitmapheight/(double)2));
 //BA.debugLineNum = 846;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, 0)";
_pthequal.LineTo((float) (_csortbitmapwidth/(double)2),(float) (0));
 //BA.debugLineNum = 847;BA.debugLine="cvsEqual.DrawColor(Colors.Transparent)";
_cvsequal.DrawColor(__c.Colors.Transparent);
 //BA.debugLineNum = 848;BA.debugLine="cvsEqual.DrawPath(pthEqual, cSortBitmapColor, Tru";
_cvsequal.DrawPath((android.graphics.Path)(_pthequal.getObject()),_csortbitmapcolor,__c.True,(float) (__c.DipToCurrent((int) (1))));
 //BA.debugLineNum = 849;BA.debugLine="bmpEqual = cvsEqual.Bitmap";
_bmpequal = _cvsequal.getBitmap();
 //BA.debugLineNum = 851;BA.debugLine="pnlAsc.RemoveView";
_pnlasc.RemoveView();
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return "";
}
public String  _initializetable(int _numberofcolumns,int _cellalignement,boolean _showstatusline) throws Exception{
int _i = 0;
 //BA.debugLineNum = 792;BA.debugLine="Public Sub InitializeTable (NumberOfColumns As Int";
 //BA.debugLineNum = 794;BA.debugLine="setShowStatusLine(showStatusLine)";
_setshowstatusline(_showstatusline);
 //BA.debugLineNum = 796;BA.debugLine="SelectedRows.Initialize";
_selectedrows.Initialize();
 //BA.debugLineNum = 797;BA.debugLine="cAlignment = cellAlignement";
_calignment = _cellalignement;
 //BA.debugLineNum = 799;BA.debugLine="mNumberOfColumns = NumberOfColumns";
_mnumberofcolumns = _numberofcolumns;
 //BA.debugLineNum = 800;BA.debugLine="Data.Initialize	'needed";
_data.Initialize();
 //BA.debugLineNum = 802;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 803;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 804;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 805;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 806;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 807;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 808;BA.debugLine="ColumnWidths(i) = cWidth / mNumberOfColumns";
_columnwidths[_i] = (int) (_cwidth/(double)_mnumberofcolumns);
 //BA.debugLineNum = 809;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
_headerwidths[_i] = _columnwidths[_i];
 //BA.debugLineNum = 810;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
_datawidths[_i] = _columnwidths[_i];
 //BA.debugLineNum = 811;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
_savedwidths[_i] = _columnwidths[_i];
 }
};
 //BA.debugLineNum = 814;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return "";
}
public String  _inittable() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw = null;
int _i = 0;
 //BA.debugLineNum = 669;BA.debugLine="Private Sub InitTable";
 //BA.debugLineNum = 670;BA.debugLine="Data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 671;BA.debugLine="lstRowColors.Initialize				'list of the different";
_lstrowcolors.Initialize();
 //BA.debugLineNum = 672;BA.debugLine="lstRowColorIndexes.Initialize	'list of the color";
_lstrowcolorindexes.Initialize();
 //BA.debugLineNum = 673;BA.debugLine="lstRowDrawables.Initialize		'list of the drawable";
_lstrowdrawables.Initialize();
 //BA.debugLineNum = 675;BA.debugLine="visibleRows.Initialize";
_visiblerows.Initialize();
 //BA.debugLineNum = 677;BA.debugLine="pnlTable.Tag = \"Table\"";
_pnltable.setTag((Object)("Table"));
 //BA.debugLineNum = 678;BA.debugLine="TableObject = Me";
_tableobject = (b4a.example.ef.table)(this);
 //BA.debugLineNum = 680;BA.debugLine="SV2.Initialize(0, 0, \"SV2\")";
_sv2.Initialize(ba,(int) (0),(int) (0),"SV2");
 //BA.debugLineNum = 681;BA.debugLine="SVF.Initialize2(0, \"SVF\")";
_svf.Initialize2(ba,(int) (0),"SVF");
 //BA.debugLineNum = 682;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 683;BA.debugLine="jo = SVF";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_svf.getObject()));
 //BA.debugLineNum = 684;BA.debugLine="jo.RunMethod(\"setVerticalScrollBarEnabled\", Array";
_jo.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
 //BA.debugLineNum = 685;BA.debugLine="internalPanel.Initialize(\"IP\")";
_internalpanel.Initialize(ba,"IP");
 //BA.debugLineNum = 686;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 688;BA.debugLine="SV2.Panel.Color = cTableColor";
_sv2.getPanel().setColor(_ctablecolor);
 //BA.debugLineNum = 689;BA.debugLine="SV2.FadingEdges(False)";
_sv2.FadingEdges(__c.False);
 //BA.debugLineNum = 690;BA.debugLine="SVF.Panel.Color = cTableColor";
_svf.getPanel().setColor(_ctablecolor);
 //BA.debugLineNum = 691;BA.debugLine="IsVisible = True";
_isvisible = __c.True;
 //BA.debugLineNum = 692;BA.debugLine="HeaderFirst.Initialize(\"\")";
_headerfirst.Initialize(ba,"");
 //BA.debugLineNum = 693;BA.debugLine="HeaderFirst.Color = cTableColor";
_headerfirst.setColor(_ctablecolor);
 //BA.debugLineNum = 694;BA.debugLine="HeaderBase.Initialize(\"\")";
_headerbase.Initialize(ba,"");
 //BA.debugLineNum = 695;BA.debugLine="HeaderBase.Color = Colors.Transparent";
_headerbase.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 696;BA.debugLine="Header.Initialize(\"\")";
_header.Initialize(ba,"");
 //BA.debugLineNum = 697;BA.debugLine="Header.Color = cTableColor";
_header.setColor(_ctablecolor);
 //BA.debugLineNum = 699;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 700;BA.debugLine="mFirstColumnsWidth = 0";
_mfirstcolumnswidth = (int) (0);
 }else {
 //BA.debugLineNum = 702;BA.debugLine="mFirstColumnsWidth = 100dip";
_mfirstcolumnswidth = __c.DipToCurrent((int) (100));
 };
 //BA.debugLineNum = 704;BA.debugLine="pnlTable.AddView(Header, mFirstColumnsWidth, 0 ,";
_pnltable.AddView((android.view.View)(_header.getObject()),_mfirstcolumnswidth,(int) (0),(int) (_cwidth-_mfirstcolumnswidth),_cheaderheight);
 //BA.debugLineNum = 705;BA.debugLine="pnlTable.AddView(HeaderFirst, 0, 0, mFirstColumns";
_pnltable.AddView((android.view.View)(_headerfirst.getObject()),(int) (0),(int) (0),_mfirstcolumnswidth,_cheaderheight);
 //BA.debugLineNum = 708;BA.debugLine="lblStatusLine.Initialize(\"\")";
_lblstatusline.Initialize(ba,"");
 //BA.debugLineNum = 709;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
_lblstatusline.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 710;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
_internalpanel.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 711;BA.debugLine="If (cShowStatusLine = True) Then";
if ((_cshowstatusline==__c.True)) { 
 //BA.debugLineNum = 712;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
_pnltable.AddView((android.view.View)(_svf.getObject()),(int) (0),_header.getHeight(),_cwidth,(int) (_cheight-_header.getHeight()-_cstatuslineheight));
 //BA.debugLineNum = 713;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
_pnltable.AddView((android.view.View)(_sv2.getObject()),_mfirstcolumnswidth,_header.getHeight(),(int) (_cwidth-_mfirstcolumnswidth),(int) (_cheight-_header.getHeight()-_cstatuslineheight));
 //BA.debugLineNum = 714;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
_pnltable.AddView((android.view.View)(_lblstatusline.getObject()),(int) (0),(int) (_sv2.getTop()+_sv2.getHeight()),_cwidth,_cstatuslineheight);
 }else {
 //BA.debugLineNum = 716;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
_pnltable.AddView((android.view.View)(_sv2.getObject()),_mfirstcolumnswidth,_header.getHeight(),(int) (_cwidth-_mfirstcolumnswidth),(int) (_cheight-_header.getHeight()));
 //BA.debugLineNum = 717;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
_pnltable.AddView((android.view.View)(_svf.getObject()),(int) (0),_header.getHeight(),_cwidth,(int) (_cheight-_header.getHeight()));
 //BA.debugLineNum = 718;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
_pnltable.AddView((android.view.View)(_lblstatusline.getObject()),(int) (0),(int) (_sv2.getTop()+_sv2.getHeight()),(int) (0),(int) (0));
 };
 //BA.debugLineNum = 720;BA.debugLine="SetPadding(lblStatusLine, 4dip, 2dip, 4dip, 2dip)";
_setpadding((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lblstatusline.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 721;BA.debugLine="pnlTable.AddView(internalPanel, 0, 0, cWidth, 0)";
_pnltable.AddView((android.view.View)(_internalpanel.getObject()),(int) (0),(int) (0),_cwidth,(int) (0));
 //BA.debugLineNum = 723;BA.debugLine="pnlFastScroll.Initialize(\"pnlFastScroll\")";
_pnlfastscroll.Initialize(ba,"pnlFastScroll");
 //BA.debugLineNum = 724;BA.debugLine="pnlFastScroll.Color = FScBackgroundColor";
_pnlfastscroll.setColor(_fscbackgroundcolor);
 //BA.debugLineNum = 725;BA.debugLine="pnlFastScroll.Visible = False";
_pnlfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 726;BA.debugLine="pnlTable.AddView(pnlFastScroll,  cWidth - FScCurs";
_pnltable.AddView((android.view.View)(_pnlfastscroll.getObject()),(int) (_cwidth-_fsccursorwidth),_sv2.getTop(),_fsccursorwidth,_sv2.getHeight());
 //BA.debugLineNum = 727;BA.debugLine="pnlFastScrollCursor.Initialize(\"\")";
_pnlfastscrollcursor.Initialize(ba,"");
 //BA.debugLineNum = 728;BA.debugLine="pnlFastScrollCursor.Color = Colors.White";
_pnlfastscrollcursor.setColor(__c.Colors.White);
 //BA.debugLineNum = 729;BA.debugLine="pnlFastScroll.AddView(pnlFastScrollCursor,  0, 0,";
_pnlfastscroll.AddView((android.view.View)(_pnlfastscrollcursor.getObject()),(int) (0),(int) (0),_fsccursorwidth,_fsccursorheight);
 //BA.debugLineNum = 730;BA.debugLine="lblFastScroll.Initialize(\"\")";
_lblfastscroll.Initialize(ba,"");
 //BA.debugLineNum = 731;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 732;BA.debugLine="cdw.Initialize2(Colors.White, 3dip, 1dip, Colors.";
_cdw.Initialize2(__c.Colors.White,__c.DipToCurrent((int) (3)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
 //BA.debugLineNum = 733;BA.debugLine="lblFastScroll.Background = cdw";
_lblfastscroll.setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
 //BA.debugLineNum = 734;BA.debugLine="lblFastScroll.TextColor = Colors.Black";
_lblfastscroll.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 735;BA.debugLine="lblFastScroll.Gravity = Bit.Or(Gravity.LEFT, Grav";
_lblfastscroll.setGravity(__c.Bit.Or(__c.Gravity.LEFT,__c.Gravity.CENTER_VERTICAL));
 //BA.debugLineNum = 736;BA.debugLine="lblFastScroll.Padding = Array As Int(5dip, 0, 0,";
_lblfastscroll.setPadding(new int[]{__c.DipToCurrent((int) (5)),(int) (0),(int) (0),(int) (0)});
 //BA.debugLineNum = 737;BA.debugLine="lblFastScroll.Visible = False";
_lblfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 738;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (_mfastscrollfixedlabel==__c.False) { 
 //BA.debugLineNum = 739;BA.debugLine="pnlTable.AddView(lblFastScroll,  cWidth - mFastS";
_pnltable.AddView((android.view.View)(_lblfastscroll.getObject()),(int) (_cwidth-_mfastscrolllabelwidth-_fsccursorwidth),_fsclabeltopdelta,_mfastscrolllabelwidth,_mfastscrolllabelheight);
 }else {
 //BA.debugLineNum = 741;BA.debugLine="pnlTable.AddView(lblFastScroll,  0, (SV2.Height";
_pnltable.AddView((android.view.View)(_lblfastscroll.getObject()),(int) (0),(int) ((_sv2.getHeight()-_mfastscrolllabelheight)/(double)2),_mfastscrolllabelwidth,_mfastscrolllabelheight);
 };
 //BA.debugLineNum = 743;BA.debugLine="FScTimer.Initialize(\"FastScrollTimer\", 1500)";
_fsctimer.Initialize(ba,"FastScrollTimer",(long) (1500));
 //BA.debugLineNum = 745;BA.debugLine="updateIPLocation";
_updateiplocation();
 //BA.debugLineNum = 747;BA.debugLine="InitFastScroll";
_initfastscroll();
 //BA.debugLineNum = 749;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 750;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 751;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 752;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 753;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 754;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step74 = 1;
final int limit74 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
 //BA.debugLineNum = 755;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
_columnwidths[_i] = (int) (_sv2.getWidth()/(double)_mnumberofcolumns);
 //BA.debugLineNum = 756;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
_headerwidths[_i] = _columnwidths[_i];
 //BA.debugLineNum = 757;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
_datawidths[_i] = _columnwidths[_i];
 //BA.debugLineNum = 758;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
_savedwidths[_i] = _columnwidths[_i];
 //BA.debugLineNum = 759;BA.debugLine="cColumnDataType(i) = \"T\"";
_ccolumndatatype[_i] = "T";
 }
};
 //BA.debugLineNum = 761;BA.debugLine="SVF.Panel.Width = SVF.Width";
_svf.getPanel().setWidth(_svf.getWidth());
 //BA.debugLineNum = 762;BA.debugLine="SVF_ScrollChanged(0)";
_svf_scrollchanged((int) (0));
 //BA.debugLineNum = 763;BA.debugLine="SV2.Panel.Width = SV2.Width";
_sv2.getPanel().setWidth(_sv2.getWidth());
 //BA.debugLineNum = 764;BA.debugLine="SV2_ScrollChanged(0, 0)";
_sv2_scrollchanged((int) (0),(int) (0));
 //BA.debugLineNum = 766;BA.debugLine="InitFastScroll";
_initfastscroll();
 //BA.debugLineNum = 768;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 //BA.debugLineNum = 770;BA.debugLine="pnlSortingView.Initialize(\"\")";
_pnlsortingview.Initialize(ba,"");
 //BA.debugLineNum = 771;BA.debugLine="If mCustomSortingBitmaps = False Then";
if (_mcustomsortingbitmaps==__c.False) { 
 //BA.debugLineNum = 772;BA.debugLine="InitializeSortingBitmaps";
_initializesortingbitmaps();
 };
 //BA.debugLineNum = 776;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 777;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 785;BA.debugLine="End Sub";
return "";
}
public String  _innerclearall(int _vnumberofcolumns,boolean _cleardata) throws Exception{
int _i = 0;
Object[] _cds = null;
int _color = 0;
int _col = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdi = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd3 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd4 = null;
 //BA.debugLineNum = 1038;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int,";
 //BA.debugLineNum = 1039;BA.debugLine="SelectedRows.Initialize";
_selectedrows.Initialize();
 //BA.debugLineNum = 1040;BA.debugLine="SV2.Panel.RemoveAllViews";
_sv2.getPanel().RemoveAllViews();
 //BA.debugLineNum = 1041;BA.debugLine="SVF.Panel.RemoveAllViews";
_svf.getPanel().RemoveAllViews();
 //BA.debugLineNum = 1042;BA.debugLine="mNumberOfColumns = vNumberOfColumns";
_mnumberofcolumns = _vnumberofcolumns;
 //BA.debugLineNum = 1043;BA.debugLine="Dim Drawable1(mNumberOfColumns) As Object";
_drawable1 = new Object[_mnumberofcolumns];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
 //BA.debugLineNum = 1044;BA.debugLine="Dim Drawable2(mNumberOfColumns) As Object";
_drawable2 = new Object[_mnumberofcolumns];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
 //BA.debugLineNum = 1045;BA.debugLine="Dim SelectedDrawable(mNumberOfColumns) As Object";
_selecteddrawable = new Object[_mnumberofcolumns];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
 //BA.debugLineNum = 1046;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1047;BA.debugLine="Dim cHeaderAlignments(mNumberOfColumns) As Int";
_cheaderalignments = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1048;BA.debugLine="Dim cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[_mnumberofcolumns];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 1049;BA.debugLine="Dim cHeaderTypeFaces(mNumberOfColumns) As Typefac";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[_mnumberofcolumns];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 1051;BA.debugLine="If cUseColumnColors = False Then";
if (_cusecolumncolors==__c.False) { 
 //BA.debugLineNum = 1052;BA.debugLine="If lstRowColors.Size > 0 Then";
if (_lstrowcolors.getSize()>0) { 
 //BA.debugLineNum = 1053;BA.debugLine="For i = 0 To lstRowColors.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_lstrowcolors.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 1054;BA.debugLine="Private cds(mNumberOfColumns) As Object";
_cds = new Object[_mnumberofcolumns];
{
int d0 = _cds.length;
for (int i0 = 0;i0 < d0;i0++) {
_cds[i0] = new Object();
}
}
;
 //BA.debugLineNum = 1055;BA.debugLine="Private color = lstRowColors.Get(i) As Int";
_color = (int)(BA.ObjectToNumber(_lstrowcolors.Get(_i)));
 //BA.debugLineNum = 1056;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
 //BA.debugLineNum = 1057;BA.debugLine="Private cdi As ColorDrawable";
_cdi = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 1058;BA.debugLine="cdi.Initialize(color, 0)";
_cdi.Initialize(_color,(int) (0));
 //BA.debugLineNum = 1059;BA.debugLine="cds(col) = cdi";
_cds[_col] = (Object)(_cdi.getObject());
 }
};
 //BA.debugLineNum = 1061;BA.debugLine="lstRowDrawables.Add(cds)";
_lstrowdrawables.Add((Object)(_cds));
 }
};
 };
 //BA.debugLineNum = 1064;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 1065;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 1066;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
_cd1.Initialize(_crowcolor1,(int) (0));
 //BA.debugLineNum = 1067;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
_cd2.Initialize(_crowcolor2,(int) (0));
 //BA.debugLineNum = 1068;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(_cselectedrowcolor,(int) (0));
 //BA.debugLineNum = 1069;BA.debugLine="Drawable1(i) = cd1";
_drawable1[_i] = (Object)(_cd1.getObject());
 //BA.debugLineNum = 1070;BA.debugLine="Drawable2(i) = cd2";
_drawable2[_i] = (Object)(_cd2.getObject());
 //BA.debugLineNum = 1071;BA.debugLine="SelectedDrawable(i) = cd3";
_selecteddrawable[_i] = (Object)(_cd3.getObject());
 //BA.debugLineNum = 1072;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (_multialignments==__c.False || _calignments0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1073;BA.debugLine="cAlignments(i) = cAlignment";
_calignments[_i] = _calignment;
 }else {
 //BA.debugLineNum = 1075;BA.debugLine="cAlignments(i) = cAlignments0(i)";
_calignments[_i] = _calignments0[_i];
 };
 //BA.debugLineNum = 1077;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (_multitypeface==__c.False || _ctypefaces0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1078;BA.debugLine="cTypeFaces(i) = cTypeFace";
_ctypefaces[_i] = _ctypeface;
 }else {
 //BA.debugLineNum = 1080;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
_ctypefaces[_i] = _ctypefaces0[_i];
 };
 //BA.debugLineNum = 1083;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (_headermultialignments==__c.False || _cheaderalignments0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1084;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
_cheaderalignments[_i] = _cheaderalignment;
 }else {
 //BA.debugLineNum = 1086;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
_cheaderalignments[_i] = _cheaderalignments0[_i];
 };
 //BA.debugLineNum = 1088;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (_headermultitypeface==__c.False || _cheadertypefaces0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1089;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
_cheadertypefaces[_i] = _cheadertypeface;
 }else {
 //BA.debugLineNum = 1091;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
_cheadertypefaces[_i] = _cheadertypefaces0[_i];
 };
 }
};
 }else {
 //BA.debugLineNum = 1095;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
 //BA.debugLineNum = 1096;BA.debugLine="Private cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 1097;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
_cd1.Initialize(_ccolumncolors[_i],(int) (0));
 //BA.debugLineNum = 1098;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
_cd2.Initialize(_ccolumncolors[_i],(int) (0));
 //BA.debugLineNum = 1099;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(_cselectedrowcolor,(int) (0));
 //BA.debugLineNum = 1100;BA.debugLine="Drawable1(i) = cd1";
_drawable1[_i] = (Object)(_cd1.getObject());
 //BA.debugLineNum = 1101;BA.debugLine="Drawable2(i) = cd2";
_drawable2[_i] = (Object)(_cd2.getObject());
 //BA.debugLineNum = 1102;BA.debugLine="SelectedDrawable(i) = cd3";
_selecteddrawable[_i] = (Object)(_cd3.getObject());
 //BA.debugLineNum = 1103;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (_multialignments==__c.False || _calignments0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1104;BA.debugLine="cAlignments(i) = cAlignment";
_calignments[_i] = _calignment;
 }else {
 //BA.debugLineNum = 1106;BA.debugLine="cAlignments(i) = cAlignments0(i)";
_calignments[_i] = _calignments0[_i];
 };
 //BA.debugLineNum = 1108;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (_multitypeface==__c.False || _ctypefaces0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1109;BA.debugLine="cTypeFaces(i) = cTypeFace";
_ctypefaces[_i] = _ctypeface;
 }else {
 //BA.debugLineNum = 1111;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
_ctypefaces[_i] = _ctypefaces0[_i];
 };
 //BA.debugLineNum = 1114;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (_headermultialignments==__c.False || _cheaderalignments0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1115;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
_cheaderalignments[_i] = _cheaderalignment;
 }else {
 //BA.debugLineNum = 1117;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
_cheaderalignments[_i] = _cheaderalignments0[_i];
 };
 //BA.debugLineNum = 1119;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (_headermultitypeface==__c.False || _cheadertypefaces0.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 1120;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
_cheadertypefaces[_i] = _cheadertypeface;
 }else {
 //BA.debugLineNum = 1122;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
_cheadertypefaces[_i] = _cheadertypefaces0[_i];
 };
 }
};
 };
 //BA.debugLineNum = 1127;BA.debugLine="Dim cd4 As ColorDrawable";
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 1128;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
_cd4.Initialize(_cselectedcellcolor,(int) (0));
 //BA.debugLineNum = 1129;BA.debugLine="SelectedCellDrawable = cd4";
_selectedcelldrawable = (Object)(_cd4.getObject());
 //BA.debugLineNum = 1131;BA.debugLine="SV2.Panel.Height = 0";
_sv2.getPanel().setHeight((int) (0));
 //BA.debugLineNum = 1132;BA.debugLine="SVF.Panel.Height = 0";
_svf.getPanel().setHeight((int) (0));
 //BA.debugLineNum = 1135;BA.debugLine="SelectedCol = -1";
_selectedcol = (int) (-1);
 //BA.debugLineNum = 1136;BA.debugLine="minVisibleRow = -1";
_minvisiblerow = (int) (-1);
 //BA.debugLineNum = 1137;BA.debugLine="maxVisibleRow = 0";
_maxvisiblerow = (int) (0);
 //BA.debugLineNum = 1138;BA.debugLine="If ClearData = True Then";
if (_cleardata==__c.True) { 
 //BA.debugLineNum = 1139;BA.debugLine="Data.Initialize";
_data.Initialize();
 };
 //BA.debugLineNum = 1141;BA.debugLine="LabelsCache.Initialize";
_labelscache.Initialize();
 //BA.debugLineNum = 1142;BA.debugLine="visibleRows.Initialize";
_visiblerows.Initialize();
 //BA.debugLineNum = 1143;BA.debugLine="SV2.VerticalScrollPosition = 0";
_sv2.setVerticalScrollPosition((int) (0));
 //BA.debugLineNum = 1144;BA.debugLine="SVF.ScrollPosition = 0";
_svf.setScrollPosition((int) (0));
 //BA.debugLineNum = 1145;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step100 = 1;
final int limit100 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit100 ;_i = _i + step100 ) {
 //BA.debugLineNum = 1146;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
_labelscache.Add((Object)(_createnewlabels()));
 }
};
 //BA.debugLineNum = 1148;BA.debugLine="If IsVisible Then";
if (_isvisible) { 
 //BA.debugLineNum = 1149;BA.debugLine="SV2_ScrollChanged(0, 0)";
_sv2_scrollchanged((int) (0),(int) (0));
 //BA.debugLineNum = 1150;BA.debugLine="SVF_ScrollChanged(0)";
_svf_scrollchanged((int) (0));
 };
 //BA.debugLineNum = 1152;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 //BA.debugLineNum = 1154;BA.debugLine="End Sub";
return "";
}
public boolean  _insertrowat(int _row,String[] _values) throws Exception{
anywheresoftware.b4a.objects.collections.List _l = null;
int _i = 0;
int _keepsel = 0;
boolean _changed = false;
int _width = 0;
 //BA.debugLineNum = 1988;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As St";
 //BA.debugLineNum = 1989;BA.debugLine="If (Row < 0) Then Row = 0";
if ((_row<0)) { 
_row = (int) (0);};
 //BA.debugLineNum = 1990;BA.debugLine="If (Row > Data.Size) Then";
if ((_row>_data.getSize())) { 
 //BA.debugLineNum = 1991;BA.debugLine="If cAutomaticWidths = False Then";
if (_cautomaticwidths==__c.False) { 
 //BA.debugLineNum = 1992;BA.debugLine="AddRow(Values)";
_addrow(_values);
 }else {
 //BA.debugLineNum = 1994;BA.debugLine="AddRowAutomaticWidth(Values)";
_addrowautomaticwidth(_values);
 };
 //BA.debugLineNum = 1996;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 1998;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
_sv2_scrollchanged(_sv2.getHorizontalScrollPosition(),_sv2.getVerticalScrollPosition());
 //BA.debugLineNum = 2000;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2001;BA.debugLine="L.Initialize";
_l.Initialize();
 //BA.debugLineNum = 2002;BA.debugLine="L.Add(Values)";
_l.Add((Object)(_values));
 //BA.debugLineNum = 2004;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step14 = 1;
final int limit14 = (int) (_selectedrows.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 2005;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
 //BA.debugLineNum = 2006;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(_selectedrows.Get(_i)));
 //BA.debugLineNum = 2007;BA.debugLine="If (keepSel >= Row) Then";
if ((_keepsel>=_row)) { 
 //BA.debugLineNum = 2008;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
_selectedrows.Set(_i,(Object)(_keepsel+1));
 };
 }
};
 //BA.debugLineNum = 2012;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step21 = 1;
final int limit21 = _maxvisiblerow;
_i = _minvisiblerow ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 2013;BA.debugLine="HideRow(i)";
_hiderow(_i);
 }
};
 //BA.debugLineNum = 2015;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
_data.AddAllAt(_row,_l);
 //BA.debugLineNum = 2016;BA.debugLine="lstRowColorIndexes.InsertAt(Row, 0)";
_lstrowcolorindexes.InsertAt(_row,(Object)(0));
 //BA.debugLineNum = 2018;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
_sv2_scrollchanged(_sv2.getHorizontalScrollPosition(),_sv2.getVerticalScrollPosition());
 //BA.debugLineNum = 2020;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step27 = 1;
final int limit27 = _maxvisiblerow;
_i = _minvisiblerow ;
for (;_i <= limit27 ;_i = _i + step27 ) {
 //BA.debugLineNum = 2021;BA.debugLine="ShowRow(i)";
_showrow(_i);
 }
};
 //BA.debugLineNum = 2024;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
_sv2.getPanel().setHeight((int) (_data.getSize()*_crowheight));
 //BA.debugLineNum = 2025;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
_svf.getPanel().setHeight(_sv2.getPanel().getHeight());
 //BA.debugLineNum = 2026;BA.debugLine="updateIPLocation";
_updateiplocation();
 //BA.debugLineNum = 2027;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
_sv2_scrollchanged(_sv2.getHorizontalScrollPosition(),(int) (__c.Min(_sv2.getVerticalScrollPosition(),_sv2.getPanel().getHeight())));
 //BA.debugLineNum = 2028;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 //BA.debugLineNum = 2030;BA.debugLine="If cAutomaticWidths = True Then";
if (_cautomaticwidths==__c.True) { 
 //BA.debugLineNum = 2031;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
 //BA.debugLineNum = 2032;BA.debugLine="Dim width As Int";
_width = 0;
 //BA.debugLineNum = 2033;BA.debugLine="If Data.Size = 1 Then";
if (_data.getSize()==1) { 
 //BA.debugLineNum = 2034;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step39 = 1;
final int limit39 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
 //BA.debugLineNum = 2035;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (_headermultitypeface==__c.False) { 
 //BA.debugLineNum = 2036;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_headernames.Get(_i)),(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 2038;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_headernames.Get(_i)),(android.graphics.Typeface)(_cheadertypefaces[_i].getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 2040;BA.debugLine="ColumnWidths(i) = width";
_columnwidths[_i] = _width;
 //BA.debugLineNum = 2041;BA.debugLine="SavedWidths(i) = width";
_savedwidths[_i] = _width;
 //BA.debugLineNum = 2042;BA.debugLine="HeaderWidths(i) = width";
_headerwidths[_i] = _width;
 //BA.debugLineNum = 2043;BA.debugLine="DataWidths(i) = width";
_datawidths[_i] = _width;
 }
};
 };
 //BA.debugLineNum = 2046;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step51 = 1;
final int limit51 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
 //BA.debugLineNum = 2047;BA.debugLine="If MultiTypeFace = False Then";
if (_multitypeface==__c.False) { 
 //BA.debugLineNum = 2048;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 2050;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (_cvs.MeasureStringWidth(_values[_i],(android.graphics.Typeface)(_ctypefaces[_i].getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 2052;BA.debugLine="If ColumnWidths(i) < width Then";
if (_columnwidths[_i]<_width) { 
 //BA.debugLineNum = 2053;BA.debugLine="ColumnWidths(i) = width";
_columnwidths[_i] = _width;
 //BA.debugLineNum = 2054;BA.debugLine="SavedWidths(i) = width";
_savedwidths[_i] = _width;
 //BA.debugLineNum = 2055;BA.debugLine="HeaderWidths(i) = width";
_headerwidths[_i] = _width;
 //BA.debugLineNum = 2056;BA.debugLine="DataWidths(i) = width";
_datawidths[_i] = _width;
 //BA.debugLineNum = 2057;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
 //BA.debugLineNum = 2061;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
 //BA.debugLineNum = 2062;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 };
 };
 //BA.debugLineNum = 2066;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 2067;BA.debugLine="End Sub";
return false;
}
public String  _ip_click() throws Exception{
 //BA.debugLineNum = 2214;BA.debugLine="Private Sub IP_Click";
 //BA.debugLineNum = 2216;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,_ccallback,_ceventname+"_HeaderClick")) { 
 //BA.debugLineNum = 2217;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,_ccallback,_ceventname+"_HeaderClick",(Object)(-1));
 };
 //BA.debugLineNum = 2219;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(int _row) throws Exception{
 //BA.debugLineNum = 1420;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean		'";
 //BA.debugLineNum = 1421;BA.debugLine="Return Row < (SV2.VerticalScrollPosition + SV2.He";
if (true) return _row<(_sv2.getVerticalScrollPosition()+_sv2.getHeight())/(double)(_crowheight+1) && _row>_sv2.getVerticalScrollPosition()/(double)_crowheight;
 //BA.debugLineNum = 1423;BA.debugLine="End Sub";
return false;
}
public void  _jumptorow(int _row) throws Exception{
ResumableSub_JumpToRow rsub = new ResumableSub_JumpToRow(this,_row);
rsub.resume(ba, null);
}
public static class ResumableSub_JumpToRow extends BA.ResumableSub {
public ResumableSub_JumpToRow(b4a.example.ef.table parent,int _row) {
this.parent = parent;
this._row = _row;
}
b4a.example.ef.table parent;
int _row;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 1700;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 1701;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
parent._sv2.setVerticalScrollPosition((int) (_row*parent._crowheight));
 //BA.debugLineNum = 1702;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jumptorowandselect(int _col,int _row) throws Exception{
ResumableSub_JumpToRowAndSelect rsub = new ResumableSub_JumpToRowAndSelect(this,_col,_row);
rsub.resume(ba, null);
}
public static class ResumableSub_JumpToRowAndSelect extends BA.ResumableSub {
public ResumableSub_JumpToRowAndSelect(b4a.example.ef.table parent,int _col,int _row) {
this.parent = parent;
this._col = _col;
this._row = _row;
}
b4a.example.ef.table parent;
int _col;
int _row;
b4a.example.ef.table._rowcol _rc = null;
int _i = 0;
int _left = 0;
int step12;
int limit12;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1706;BA.debugLine="Log(\"You may get this warning:\")";
parent.__c.LogImpl("721299201","You may get this warning:",0);
 //BA.debugLineNum = 1707;BA.debugLine="Log(\"Unexpected event (missing RaiseSynchronousEv";
parent.__c.LogImpl("721299202","Unexpected event (missing RaiseSynchronousEvents): sv_scrollchanged",0);
 //BA.debugLineNum = 1708;BA.debugLine="Log(\"Ignore it, it is NOT harmful !\")";
parent.__c.LogImpl("721299203","Ignore it, it is NOT harmful !",0);
 //BA.debugLineNum = 1709;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
 //BA.debugLineNum = 1711;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 //BA.debugLineNum = 1712;BA.debugLine="rc.Col = Col";
_rc.Col /*int*/  = _col;
 //BA.debugLineNum = 1713;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 //BA.debugLineNum = 1714;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
parent._sv2.setVerticalScrollPosition((int) (_row*parent._crowheight));
 //BA.debugLineNum = 1716;BA.debugLine="SelectRow(rc)";
parent._selectrow(_rc);
 //BA.debugLineNum = 1718;BA.debugLine="Private i, Left As Int";
_i = 0;
_left = 0;
 //BA.debugLineNum = 1719;BA.debugLine="If Col > 0 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_col>0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1720;BA.debugLine="For i = 0 To Col - 1";
if (true) break;

case 4:
//for
this.state = 7;
step12 = 1;
limit12 = (int) (_col-1);
_i = (int) (0) ;
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step12)) ;
if (true) break;

case 6:
//C
this.state = 11;
 //BA.debugLineNum = 1721;BA.debugLine="Left = Left + ColumnWidths(i)";
_left = (int) (_left+parent._columnwidths[_i]);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 1724;BA.debugLine="Left = Left - SVF.Width";
_left = (int) (_left-parent._svf.getWidth());
 //BA.debugLineNum = 1725;BA.debugLine="SV2.HorizontalScrollPosition = Left";
parent._sv2.setHorizontalScrollPosition(_left);
 //BA.debugLineNum = 1726;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _loadsqlitedb(anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
String[] _r = null;
 //BA.debugLineNum = 3040;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
 //BA.debugLineNum = 3041;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3042;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
 //BA.debugLineNum = 3044;BA.debugLine="cAutomaticWidths = AutomaticWidths";
_cautomaticwidths = _automaticwidths;
 //BA.debugLineNum = 3045;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
_mnumberofcolumns = _curs.getColumnCount();
 //BA.debugLineNum = 3046;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 3048;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 3049;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3050;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3051;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3052;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 3053;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 3054;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 3055;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
 //BA.debugLineNum = 3056;BA.debugLine="cColumnDataType(col) = \"T\"";
_ccolumndatatype[_col] = "T";
 //BA.debugLineNum = 3057;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
 //BA.debugLineNum = 3058;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
 //BA.debugLineNum = 3059;BA.debugLine="ColumnWidths(col) = 130dip";
_columnwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3060;BA.debugLine="HeaderWidths(col) = 130dip";
_headerwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3061;BA.debugLine="DataWidths(col) = 130dip";
_datawidths[_col] = __c.DipToCurrent((int) (130));
 }else {
 //BA.debugLineNum = 3063;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 3064;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 3066;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 3068;BA.debugLine="DataWidths(col) = 0";
_datawidths[_col] = (int) (0);
 //BA.debugLineNum = 3069;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
 //BA.debugLineNum = 3070;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3071;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3072;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
 //BA.debugLineNum = 3073;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 3074;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,_ctypefaces[_col].DEFAULT,_ctextsize)+_extrawidth));
 }else {
 //BA.debugLineNum = 3076;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth));
 };
 };
 }
};
 //BA.debugLineNum = 3080;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 };
 }
};
 //BA.debugLineNum = 3084;BA.debugLine="SetHeader(Headers)";
_setheader(_headers);
 //BA.debugLineNum = 3085;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 3089;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
_setarrcolumnssorted(_mnumberofcolumns);
 //BA.debugLineNum = 3091;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
 //BA.debugLineNum = 3092;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[_mnumberofcolumns];
java.util.Arrays.fill(_r,"");
_str = "";
 //BA.debugLineNum = 3093;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
 //BA.debugLineNum = 3094;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3095;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3096;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
 //BA.debugLineNum = 3097;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
 //BA.debugLineNum = 3099;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
 //BA.debugLineNum = 3102;BA.debugLine="AddRow(R)";
_addrow(_r);
 }
};
 //BA.debugLineNum = 3105;BA.debugLine="Curs.Close";
_curs.Close();
 //BA.debugLineNum = 3108;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb2(anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths,String[] _columndatatypes) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
long _ii = 0L;
double _dd = 0;
String _str = "";
String[] _r = null;
 //BA.debugLineNum = 3120;BA.debugLine="Public Sub LoadSQLiteDB2(SQLite As SQL, Query As S";
 //BA.debugLineNum = 3121;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3122;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
 //BA.debugLineNum = 3124;BA.debugLine="cAutomaticWidths = AutomaticWidths";
_cautomaticwidths = _automaticwidths;
 //BA.debugLineNum = 3125;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
_mnumberofcolumns = _curs.getColumnCount();
 //BA.debugLineNum = 3126;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 3128;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 3129;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3130;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3131;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3132;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 3133;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 3134;BA.debugLine="Dim ii As Long";
_ii = 0L;
 //BA.debugLineNum = 3135;BA.debugLine="Dim dd As Double";
_dd = 0;
 //BA.debugLineNum = 3136;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 3137;BA.debugLine="cColumnDataType = ColumnDataTypes";
_ccolumndatatype = _columndatatypes;
 //BA.debugLineNum = 3138;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
 //BA.debugLineNum = 3139;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
 //BA.debugLineNum = 3140;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
 //BA.debugLineNum = 3141;BA.debugLine="ColumnWidths(col) = 130dip";
_columnwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3142;BA.debugLine="HeaderWidths(col) = 130dip";
_headerwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3143;BA.debugLine="DataWidths(col) = 130dip";
_datawidths[_col] = __c.DipToCurrent((int) (130));
 }else {
 //BA.debugLineNum = 3145;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (_headermultitypeface==__c.True) { 
 //BA.debugLineNum = 3146;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 3148;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 3150;BA.debugLine="DataWidths(col) = 0";
_datawidths[_col] = (int) (0);
 //BA.debugLineNum = 3151;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step29 = 1;
final int limit29 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit29 ;_row = _row + step29 ) {
 //BA.debugLineNum = 3152;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3153;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3154;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
 //BA.debugLineNum = 3155;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(_ccolumndatatype[_col],"I","R")) {
case 0: {
 //BA.debugLineNum = 3157;BA.debugLine="ii = Curs.GetInt2(col)";
_ii = (long) (_curs.GetInt2(_col));
 //BA.debugLineNum = 3158;BA.debugLine="str = ii";
_str = BA.NumberToString(_ii);
 break; }
case 1: {
 //BA.debugLineNum = 3160;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
 //BA.debugLineNum = 3161;BA.debugLine="str = dd";
_str = BA.NumberToString(_dd);
 break; }
}
;
 }else {
 //BA.debugLineNum = 3164;BA.debugLine="str = \"\"";
_str = "";
 };
 //BA.debugLineNum = 3166;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 3167;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypefaces[_col].getObject()),_ctextsize)+_extrawidth));
 }else {
 //BA.debugLineNum = 3169;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth));
 };
 }
};
 //BA.debugLineNum = 3172;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 };
 }
};
 //BA.debugLineNum = 3176;BA.debugLine="SetHeader(Headers)";
_setheader(_headers);
 //BA.debugLineNum = 3177;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 3181;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
_setarrcolumnssorted(_mnumberofcolumns);
 //BA.debugLineNum = 3183;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step56 = 1;
final int limit56 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit56 ;_row = _row + step56 ) {
 //BA.debugLineNum = 3184;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3185;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[_mnumberofcolumns];
java.util.Arrays.fill(_r,"");
_str = "";
 //BA.debugLineNum = 3186;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
 //BA.debugLineNum = 3187;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3188;BA.debugLine="If str = Null Then";
if (_str== null) { 
 //BA.debugLineNum = 3189;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 }else {
 //BA.debugLineNum = 3191;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(_ccolumndatatype[_col],"I","R","T")) {
case 0: {
 //BA.debugLineNum = 3193;BA.debugLine="ii = Curs.GetLong2(col)";
_ii = _curs.GetLong2(_col);
 //BA.debugLineNum = 3194;BA.debugLine="R(col) = ii";
_r[_col] = BA.NumberToString(_ii);
 break; }
case 1: {
 //BA.debugLineNum = 3196;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
 //BA.debugLineNum = 3197;BA.debugLine="R(col) = dd";
_r[_col] = BA.NumberToString(_dd);
 break; }
case 2: {
 //BA.debugLineNum = 3199;BA.debugLine="R(col) = Curs.GetString2(col)";
_r[_col] = _curs.GetString2(_col);
 break; }
default: {
 //BA.debugLineNum = 3201;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 3205;BA.debugLine="AddRow(R)";
_addrow(_r);
 }
};
 //BA.debugLineNum = 3208;BA.debugLine="Curs.Close";
_curs.Close();
 //BA.debugLineNum = 3209;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb3(anywheresoftware.b4a.sql.SQL _sqlite,String _query,String[] _values,boolean _automaticwidths) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
String[] _r = null;
 //BA.debugLineNum = 3220;BA.debugLine="Public Sub LoadSQLiteDB3(SQLite As SQL, Query As S";
 //BA.debugLineNum = 3221;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3222;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
 //BA.debugLineNum = 3224;BA.debugLine="cAutomaticWidths = AutomaticWidths";
_cautomaticwidths = _automaticwidths;
 //BA.debugLineNum = 3225;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
_mnumberofcolumns = _curs.getColumnCount();
 //BA.debugLineNum = 3226;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 3228;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 3229;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3230;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3231;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3232;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 3233;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 3234;BA.debugLine="Dim str As String";
_str = "";
 //BA.debugLineNum = 3235;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
 //BA.debugLineNum = 3236;BA.debugLine="cColumnDataType(col) = \"T\"";
_ccolumndatatype[_col] = "T";
 //BA.debugLineNum = 3237;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
 //BA.debugLineNum = 3238;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
 //BA.debugLineNum = 3239;BA.debugLine="ColumnWidths(col) = 130dip";
_columnwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3240;BA.debugLine="HeaderWidths(col) = 130dip";
_headerwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3241;BA.debugLine="DataWidths(col) = 130dip";
_datawidths[_col] = __c.DipToCurrent((int) (130));
 }else {
 //BA.debugLineNum = 3243;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (_headermultitypeface==__c.True) { 
 //BA.debugLineNum = 3244;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 3246;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 3248;BA.debugLine="DataWidths(col) = 0";
_datawidths[_col] = (int) (0);
 //BA.debugLineNum = 3249;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
 //BA.debugLineNum = 3250;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3251;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3252;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
 //BA.debugLineNum = 3253;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 3254;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypefaces[_col].getObject()),_ctextsize)+_extrawidth));
 }else {
 //BA.debugLineNum = 3256;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth));
 };
 };
 }
};
 //BA.debugLineNum = 3260;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 };
 }
};
 //BA.debugLineNum = 3264;BA.debugLine="SetHeader(Headers)";
_setheader(_headers);
 //BA.debugLineNum = 3265;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 3269;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
_setarrcolumnssorted(_mnumberofcolumns);
 //BA.debugLineNum = 3271;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
 //BA.debugLineNum = 3272;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[_mnumberofcolumns];
java.util.Arrays.fill(_r,"");
_str = "";
 //BA.debugLineNum = 3273;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
 //BA.debugLineNum = 3274;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3275;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3276;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
 //BA.debugLineNum = 3277;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
 //BA.debugLineNum = 3279;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
 //BA.debugLineNum = 3282;BA.debugLine="AddRow(R)";
_addrow(_r);
 }
};
 //BA.debugLineNum = 3285;BA.debugLine="Curs.Close";
_curs.Close();
 //BA.debugLineNum = 3286;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb4(anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
double _dval = 0;
String[] _r = null;
 //BA.debugLineNum = 3294;BA.debugLine="Public Sub LoadSQLiteDB4(SQLite As SQL, Query As S";
 //BA.debugLineNum = 3295;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3297;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
 //BA.debugLineNum = 3299;BA.debugLine="cAutomaticWidths = AutomaticWidths";
_cautomaticwidths = _automaticwidths;
 //BA.debugLineNum = 3300;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
_mnumberofcolumns = _curs.getColumnCount();
 //BA.debugLineNum = 3301;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 3303;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 3304;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3305;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3306;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3307;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 3308;BA.debugLine="Private str As String";
_str = "";
 //BA.debugLineNum = 3309;BA.debugLine="Private dVal As Double";
_dval = 0;
 //BA.debugLineNum = 3311;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
_ccolumndatatype = _checkcolumndatatypes(_curs);
 //BA.debugLineNum = 3313;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
 //BA.debugLineNum = 3314;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
 //BA.debugLineNum = 3315;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
 //BA.debugLineNum = 3316;BA.debugLine="ColumnWidths(col) = 130dip";
_columnwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3317;BA.debugLine="HeaderWidths(col) = 130dip";
_headerwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3318;BA.debugLine="DataWidths(col) = 130dip";
_datawidths[_col] = __c.DipToCurrent((int) (130));
 }else {
 //BA.debugLineNum = 3320;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (_headermultitypeface==__c.True) { 
 //BA.debugLineNum = 3321;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 3323;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 3325;BA.debugLine="DataWidths(col) = 0";
_datawidths[_col] = (int) (0);
 //BA.debugLineNum = 3326;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
 //BA.debugLineNum = 3327;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3328;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3329;BA.debugLine="If str = Null Then";
if (_str== null) { 
 //BA.debugLineNum = 3330;BA.debugLine="str = \"\"";
_str = "";
 }else if(__c.IsNumber(_str)) { 
 //BA.debugLineNum = 3332;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
 //BA.debugLineNum = 3333;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 };
 //BA.debugLineNum = 3335;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 3336;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypefaces[_col].getObject()),_ctextsize)+_extrawidth));
 }else {
 //BA.debugLineNum = 3338;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth));
 };
 }
};
 //BA.debugLineNum = 3341;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 };
 }
};
 //BA.debugLineNum = 3345;BA.debugLine="SetHeader(Headers)";
_setheader(_headers);
 //BA.debugLineNum = 3346;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 3350;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
_setarrcolumnssorted(_mnumberofcolumns);
 //BA.debugLineNum = 3352;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
 //BA.debugLineNum = 3353;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[_mnumberofcolumns];
java.util.Arrays.fill(_r,"");
_str = "";
 //BA.debugLineNum = 3354;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
 //BA.debugLineNum = 3355;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3356;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3357;BA.debugLine="If str = Null Then";
if (_str== null) { 
 //BA.debugLineNum = 3358;BA.debugLine="str = \"\"";
_str = "";
 }else if(__c.IsNumber(_str)) { 
 //BA.debugLineNum = 3360;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
 //BA.debugLineNum = 3361;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 };
 //BA.debugLineNum = 3363;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
 //BA.debugLineNum = 3365;BA.debugLine="AddRow(R)";
_addrow(_r);
 }
};
 //BA.debugLineNum = 3368;BA.debugLine="Curs.Close";
_curs.Close();
 //BA.debugLineNum = 3369;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb5(anywheresoftware.b4a.sql.SQL _sqlite,String _query,String[] _values,boolean _automaticwidths) throws Exception{
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
double _dval = 0;
String[] _r = null;
 //BA.debugLineNum = 3377;BA.debugLine="Public Sub LoadSQLiteDB5(SQLite As SQL, Query As S";
 //BA.debugLineNum = 3378;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
 //BA.debugLineNum = 3380;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
 //BA.debugLineNum = 3382;BA.debugLine="cAutomaticWidths = AutomaticWidths";
_cautomaticwidths = _automaticwidths;
 //BA.debugLineNum = 3383;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
_mnumberofcolumns = _curs.getColumnCount();
 //BA.debugLineNum = 3384;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 3386;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 3387;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3388;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3389;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3390;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 3391;BA.debugLine="Private str As String";
_str = "";
 //BA.debugLineNum = 3392;BA.debugLine="Private dVal As Double";
_dval = 0;
 //BA.debugLineNum = 3394;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
_ccolumndatatype = _checkcolumndatatypes(_curs);
 //BA.debugLineNum = 3396;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
 //BA.debugLineNum = 3397;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
 //BA.debugLineNum = 3398;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
 //BA.debugLineNum = 3399;BA.debugLine="ColumnWidths(col) = 130dip";
_columnwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3400;BA.debugLine="HeaderWidths(col) = 130dip";
_headerwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3401;BA.debugLine="DataWidths(col) = 130dip";
_datawidths[_col] = __c.DipToCurrent((int) (130));
 }else {
 //BA.debugLineNum = 3403;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (_headermultitypeface==__c.True) { 
 //BA.debugLineNum = 3404;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 3406;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 3408;BA.debugLine="DataWidths(col) = 0";
_datawidths[_col] = (int) (0);
 //BA.debugLineNum = 3409;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
 //BA.debugLineNum = 3410;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3411;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3412;BA.debugLine="If str = Null Then";
if (_str== null) { 
 //BA.debugLineNum = 3413;BA.debugLine="str = \"\"";
_str = "";
 }else if(__c.IsNumber(_str)) { 
 //BA.debugLineNum = 3415;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
 //BA.debugLineNum = 3416;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 };
 //BA.debugLineNum = 3418;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 3419;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypefaces[_col].getObject()),_ctextsize)+_extrawidth));
 }else {
 //BA.debugLineNum = 3421;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_str,(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth));
 };
 }
};
 //BA.debugLineNum = 3424;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 };
 }
};
 //BA.debugLineNum = 3428;BA.debugLine="SetHeader(Headers)";
_setheader(_headers);
 //BA.debugLineNum = 3429;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 3433;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
_setarrcolumnssorted(_mnumberofcolumns);
 //BA.debugLineNum = 3435;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
 //BA.debugLineNum = 3436;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[_mnumberofcolumns];
java.util.Arrays.fill(_r,"");
_str = "";
 //BA.debugLineNum = 3437;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
 //BA.debugLineNum = 3438;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
 //BA.debugLineNum = 3439;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
 //BA.debugLineNum = 3440;BA.debugLine="If str = Null Then";
if (_str== null) { 
 //BA.debugLineNum = 3441;BA.debugLine="str = \"\"";
_str = "";
 }else if(__c.IsNumber(_str)) { 
 //BA.debugLineNum = 3443;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
 //BA.debugLineNum = 3444;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 };
 //BA.debugLineNum = 3446;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
 //BA.debugLineNum = 3448;BA.debugLine="AddRow(R)";
_addrow(_r);
 }
};
 //BA.debugLineNum = 3451;BA.debugLine="Curs.Close";
_curs.Close();
 //BA.debugLineNum = 3452;BA.debugLine="End Sub";
return "";
}
public String  _loadtablefromcsv(String _dir,String _filename,boolean _headersexist) throws Exception{
anywheresoftware.b4a.objects.collections.List _list1 = null;
String[] _h = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
int _i = 0;
String[] _firstrow = null;
String[] _row = null;
 //BA.debugLineNum = 1730;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
 //BA.debugLineNum = 1732;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1733;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
 //BA.debugLineNum = 1735;BA.debugLine="cAutomaticWidths = False";
_cautomaticwidths = __c.False;
 //BA.debugLineNum = 1737;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
 //BA.debugLineNum = 1738;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1739;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
_list1 = _stringutils1.LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
 //BA.debugLineNum = 1740;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
 //BA.debugLineNum = 1741;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_headers.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 1742;BA.debugLine="h(i) = headers.Get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
 //BA.debugLineNum = 1745;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = _stringutils1.LoadCSV(_dir,_filename,BA.ObjectToChar(","));
 //BA.debugLineNum = 1746;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
 //BA.debugLineNum = 1747;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
 //BA.debugLineNum = 1748;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
 //BA.debugLineNum = 1749;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 1750;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
 //BA.debugLineNum = 1753;BA.debugLine="innerClearAll(h.Length, True)";
_innerclearall(_h.length,__c.True);
 //BA.debugLineNum = 1754;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1755;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1756;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1757;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 1758;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 1759;BA.debugLine="cColumnDataType(i) = \"T\"";
_ccolumndatatype[_i] = "T";
 //BA.debugLineNum = 1760;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
_columnwidths[_i] = (int) (_sv2.getWidth()/(double)_mnumberofcolumns);
 //BA.debugLineNum = 1761;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
_headerwidths[_i] = _columnwidths[_i];
 //BA.debugLineNum = 1762;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
_datawidths[_i] = _columnwidths[_i];
 }
};
 //BA.debugLineNum = 1765;BA.debugLine="SetHeader(h)";
_setheader(_h);
 //BA.debugLineNum = 1766;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 1770;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
_setarrcolumnssorted(_mnumberofcolumns);
 //BA.debugLineNum = 1772;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
 //BA.debugLineNum = 1773;BA.debugLine="Dim Row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
 //BA.debugLineNum = 1774;BA.debugLine="Row = List1.Get(i)";
_row = (String[])(_list1.Get(_i));
 //BA.debugLineNum = 1775;BA.debugLine="AddRow(Row)";
_addrow(_row);
 }
};
 //BA.debugLineNum = 1777;BA.debugLine="End Sub";
return "";
}
public String  _loadtablefromcsv2(String _dir,String _filename,boolean _headersexist,String _separatorchar,boolean _automaticwidths) throws Exception{
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
String[] _headers = null;
int _i = 0;
String[] _firstrow = null;
int _col = 0;
int _row = 0;
String[] _strrow = null;
 //BA.debugLineNum = 1784;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
 //BA.debugLineNum = 1786;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1788;BA.debugLine="cAutomaticWidths = AutomaticWidths";
_cautomaticwidths = _automaticwidths;
 //BA.debugLineNum = 1790;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
 //BA.debugLineNum = 1791;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1792;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
_list1 = _stringutils1.LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_lstheaders);
 //BA.debugLineNum = 1793;BA.debugLine="Dim Headers(lstHeaders.Size) As String";
_headers = new String[_lstheaders.getSize()];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 1794;BA.debugLine="For i = 0 To lstHeaders.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lstheaders.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 1795;BA.debugLine="Headers(i) = lstHeaders.Get(i)";
_headers[_i] = BA.ObjectToString(_lstheaders.Get(_i));
 }
};
 }else {
 //BA.debugLineNum = 1798;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
_list1 = _stringutils1.LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));
 //BA.debugLineNum = 1799;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
 //BA.debugLineNum = 1800;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
 //BA.debugLineNum = 1801;BA.debugLine="Dim Headers(firstRow.Length) As String";
_headers = new String[_firstrow.length];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 1802;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 1803;BA.debugLine="Headers(i) = \"Col\" & (i + 1)";
_headers[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
 //BA.debugLineNum = 1806;BA.debugLine="innerClearAll(Headers.Length, True)";
_innerclearall(_headers.length,__c.True);
 //BA.debugLineNum = 1807;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1808;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1809;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 1810;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 1812;BA.debugLine="Dim col, Row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 1813;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
 //BA.debugLineNum = 1814;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step26 = 1;
final int limit26 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit26 ;_col = _col + step26 ) {
 //BA.debugLineNum = 1815;BA.debugLine="cColumnDataType(col) = \"T\"";
_ccolumndatatype[_col] = "T";
 //BA.debugLineNum = 1816;BA.debugLine="ColumnWidths(col) = SV2.Width / mNumberOfColumn";
_columnwidths[_col] = (int) (_sv2.getWidth()/(double)_mnumberofcolumns);
 //BA.debugLineNum = 1817;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
_headerwidths[_col] = _columnwidths[_col];
 //BA.debugLineNum = 1818;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
_datawidths[_col] = _columnwidths[_col];
 }
};
 }else {
 //BA.debugLineNum = 1821;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
 //BA.debugLineNum = 1822;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[_mnumberofcolumns];
java.util.Arrays.fill(_strrow,"");
 //BA.debugLineNum = 1823;BA.debugLine="strRow = List1.Get(col)";
_strrow = (String[])(_list1.Get(_col));
 //BA.debugLineNum = 1824;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (_headermultitypeface==__c.False) { 
 //BA.debugLineNum = 1825;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step37 = 1;
final int limit37 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit37 ;_col = _col + step37 ) {
 //BA.debugLineNum = 1826;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 }
};
 }else {
 //BA.debugLineNum = 1829;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step41 = 1;
final int limit41 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit41 ;_col = _col + step41 ) {
 //BA.debugLineNum = 1830;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(_cheadertypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 }
};
 };
 };
 //BA.debugLineNum = 1834;BA.debugLine="For Row = 0 To List1.Size - 1";
{
final int step46 = 1;
final int limit46 = (int) (_list1.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit46 ;_row = _row + step46 ) {
 //BA.debugLineNum = 1835;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[_mnumberofcolumns];
java.util.Arrays.fill(_strrow,"");
 //BA.debugLineNum = 1836;BA.debugLine="strRow = List1.Get(Row)";
_strrow = (String[])(_list1.Get(_row));
 //BA.debugLineNum = 1837;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 1838;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
 //BA.debugLineNum = 1839;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(_ctypefaces[_col].getObject()),_ctextsize)+_extrawidth));
 }
};
 }else {
 //BA.debugLineNum = 1842;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step54 = 1;
final int limit54 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit54 ;_col = _col + step54 ) {
 //BA.debugLineNum = 1843;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
_datawidths[_col] = (int) (__c.Max(_datawidths[_col],_cvs.MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth));
 }
};
 };
 }
};
 //BA.debugLineNum = 1847;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
 //BA.debugLineNum = 1848;BA.debugLine="cColumnDataType(col) = \"T\"";
_ccolumndatatype[_col] = "T";
 //BA.debugLineNum = 1849;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 }
};
 };
 //BA.debugLineNum = 1853;BA.debugLine="SetHeader(Headers)";
_setheader(_headers);
 //BA.debugLineNum = 1854;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 1858;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
_setarrcolumnssorted(_mnumberofcolumns);
 //BA.debugLineNum = 1860;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step67 = 1;
final int limit67 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
 //BA.debugLineNum = 1861;BA.debugLine="Dim strRow() As String";
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");
 //BA.debugLineNum = 1862;BA.debugLine="strRow = List1.Get(i)";
_strrow = (String[])(_list1.Get(_i));
 //BA.debugLineNum = 1863;BA.debugLine="AddRow(strRow)";
_addrow(_strrow);
 }
};
 //BA.debugLineNum = 1866;BA.debugLine="End Sub";
return "";
}
public String  _pnlfastscroll_touch(int _action,float _x,float _y) throws Exception{
int _top = 0;
int _sv2top = 0;
 //BA.debugLineNum = 2560;BA.debugLine="Private Sub pnlFastScroll_Touch (Action As Int, X";
 //BA.debugLineNum = 2561;BA.debugLine="Select Action";
switch (_action) {
case 0: {
 //BA.debugLineNum = 2563;BA.debugLine="If Y >= pnlFastScrollCursor.Top And Y <= pnlFas";
if (_y>=_pnlfastscrollcursor.getTop() && _y<=_pnlfastscrollcursor.getTop()+_pnlfastscrollcursor.getHeight()) { 
 //BA.debugLineNum = 2564;BA.debugLine="FSY0 = pnlFastScrollCursor.Top";
_fsy0 = _pnlfastscrollcursor.getTop();
 //BA.debugLineNum = 2565;BA.debugLine="FSdY = Y - FSY0";
_fsdy = (int) (_y-_fsy0);
 //BA.debugLineNum = 2566;BA.debugLine="FastScrollActive = True";
_fastscrollactive = __c.True;
 };
 break; }
case 2: {
 //BA.debugLineNum = 2569;BA.debugLine="If FastScrollActive = True Then";
if (_fastscrollactive==__c.True) { 
 //BA.debugLineNum = 2570;BA.debugLine="Private Top, SV2Top As Int";
_top = 0;
_sv2top = 0;
 //BA.debugLineNum = 2571;BA.debugLine="Top = Max(Y - FSdY, 0)";
_top = (int) (__c.Max(_y-_fsdy,0));
 //BA.debugLineNum = 2572;BA.debugLine="Top = Min(Top, pnlFastScroll.Height - pnlFastS";
_top = (int) (__c.Min(_top,_pnlfastscroll.getHeight()-_pnlfastscrollcursor.getHeight()));
 //BA.debugLineNum = 2573;BA.debugLine="pnlFastScrollCursor.Top = Top";
_pnlfastscrollcursor.setTop(_top);
 //BA.debugLineNum = 2574;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (_mfastscrollfixedlabel==__c.False) { 
 //BA.debugLineNum = 2575;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top +";
_lblfastscroll.setTop((int) (_pnlfastscrollcursor.getTop()+_fsclabeltopdelta));
 };
 //BA.debugLineNum = 2577;BA.debugLine="SV2Top = Top / FScScale";
_sv2top = (int) (_top/(double)_fscscale);
 //BA.debugLineNum = 2578;BA.debugLine="SV2.VerticalScrollPosition = SV2Top";
_sv2.setVerticalScrollPosition(_sv2top);
 };
 break; }
case 1: {
 //BA.debugLineNum = 2581;BA.debugLine="FScTimer.Enabled = True";
_fsctimer.setEnabled(__c.True);
 break; }
}
;
 //BA.debugLineNum = 2583;BA.debugLine="End Sub";
return "";
}
public String  _refreshlabels() throws Exception{
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
 //BA.debugLineNum = 2110;BA.debugLine="Public Sub RefreshLabels";
 //BA.debugLineNum = 2111;BA.debugLine="Private i, j As Int";
_i = 0;
_j = 0;
 //BA.debugLineNum = 2113;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
_sv2_scrollchanged(_sv2.getHorizontalScrollPosition(),_sv2.getVerticalScrollPosition());
 //BA.debugLineNum = 2114;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step3 = 1;
final int limit3 = _maxvisiblerow;
_i = _minvisiblerow ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 2115;BA.debugLine="HideRow(i)";
_hiderow(_i);
 }
};
 //BA.debugLineNum = 2118;BA.debugLine="If cTypeFaces.Length < mNumberOfColumns Then";
if (_ctypefaces.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 2119;BA.debugLine="Private cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[_mnumberofcolumns];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
 //BA.debugLineNum = 2120;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (_mnumberofcolumns-1);
_j = (int) (0) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
 //BA.debugLineNum = 2121;BA.debugLine="cTypeFaces(j) = cTypeFace";
_ctypefaces[_j] = _ctypeface;
 }
};
 };
 //BA.debugLineNum = 2125;BA.debugLine="If cTextColors.Length < mNumberOfColumns Then";
if (_ctextcolors.length<_mnumberofcolumns) { 
 //BA.debugLineNum = 2126;BA.debugLine="Private cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 2127;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (_mnumberofcolumns-1);
_j = (int) (0) ;
for (;_j <= limit14 ;_j = _j + step14 ) {
 //BA.debugLineNum = 2128;BA.debugLine="cTextColors(j) = cTextColor";
_ctextcolors[_j] = _ctextcolor;
 }
};
 };
 //BA.debugLineNum = 2131;BA.debugLine="For i = 0 To LabelsCache.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (_labelscache.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 2132;BA.debugLine="Private lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 2133;BA.debugLine="lbls = LabelsCache.Get(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_labelscache.Get(_i));
 //BA.debugLineNum = 2134;BA.debugLine="For j = 0 To lbls.Length - 1";
{
final int step21 = 1;
final int limit21 = (int) (_lbls.length-1);
_j = (int) (0) ;
for (;_j <= limit21 ;_j = _j + step21 ) {
 //BA.debugLineNum = 2135;BA.debugLine="If MultiTypeFace = True Then";
if (_multitypeface==__c.True) { 
 //BA.debugLineNum = 2136;BA.debugLine="lbls(j).Typeface = cTypeFaces(j)";
_lbls[_j].setTypeface((android.graphics.Typeface)(_ctypefaces[_j].getObject()));
 //BA.debugLineNum = 2137;BA.debugLine="lbls(j).TextColor = cTextColors(j)";
_lbls[_j].setTextColor(_ctextcolors[_j]);
 }else {
 //BA.debugLineNum = 2139;BA.debugLine="lbls(j).Typeface = cTypeFace";
_lbls[_j].setTypeface((android.graphics.Typeface)(_ctypeface.getObject()));
 //BA.debugLineNum = 2140;BA.debugLine="lbls(j).TextColor = cTextColor";
_lbls[_j].setTextColor(_ctextcolor);
 };
 }
};
 }
};
 //BA.debugLineNum = 2145;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all";
{
final int step31 = 1;
final int limit31 = _maxvisiblerow;
_i = _minvisiblerow ;
for (;_i <= limit31 ;_i = _i + step31 ) {
 //BA.debugLineNum = 2146;BA.debugLine="ShowRow(i)";
_showrow(_i);
 }
};
 //BA.debugLineNum = 2148;BA.debugLine="End Sub";
return "";
}
public String  _refreshtable() throws Exception{
int _i = 0;
 //BA.debugLineNum = 2101;BA.debugLine="Public Sub RefreshTable";
 //BA.debugLineNum = 2102;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
_sv2_scrollchanged(_sv2.getHorizontalScrollPosition(),_sv2.getVerticalScrollPosition());
 //BA.debugLineNum = 2103;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step2 = 1;
final int limit2 = _maxvisiblerow;
_i = _minvisiblerow ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 2104;BA.debugLine="HideRow(i)";
_hiderow(_i);
 //BA.debugLineNum = 2105;BA.debugLine="ShowRow(i)";
_showrow(_i);
 }
};
 //BA.debugLineNum = 2107;BA.debugLine="End Sub";
return "";
}
public String  _removeaccents(String _s) throws Exception{
anywheresoftware.b4j.object.JavaObject _normalizer = null;
String _n = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
 //BA.debugLineNum = 4013;BA.debugLine="Private Sub RemoveAccents(s As String) As String";
 //BA.debugLineNum = 4014;BA.debugLine="Dim normalizer As JavaObject";
_normalizer = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 4015;BA.debugLine="normalizer.InitializeStatic(\"java.text.Normalizer";
_normalizer.InitializeStatic("java.text.Normalizer");
 //BA.debugLineNum = 4016;BA.debugLine="Dim n As String = normalizer.RunMethod(\"normalize";
_n = BA.ObjectToString(_normalizer.RunMethod("normalize",new Object[]{(Object)(_s),(Object)("NFD")}));
 //BA.debugLineNum = 4017;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 4018;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 4019;BA.debugLine="For i = 0 To n.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_n.length()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 4020;BA.debugLine="If Regex.IsMatch(\"\\p{InCombiningDiacriticalMarks";
if (__c.Regex.IsMatch("\\p{InCombiningDiacriticalMarks}",BA.ObjectToString(_n.charAt(_i)))==__c.False) { 
 //BA.debugLineNum = 4021;BA.debugLine="sb.Append(n.CharAt(i))";
_sb.Append(BA.ObjectToString(_n.charAt(_i)));
 };
 }
};
 //BA.debugLineNum = 4024;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 4025;BA.debugLine="End Sub";
return "";
}
public String  _removerow(int _row) throws Exception{
int _previndex = 0;
int _i = 0;
int _keepsel = 0;
 //BA.debugLineNum = 1922;BA.debugLine="Public Sub RemoveRow(Row As Int)";
 //BA.debugLineNum = 1923;BA.debugLine="If (Row <0 Or Row > Data.Size-1) Then Return ' ca";
if ((_row<0 || _row>_data.getSize()-1)) { 
if (true) return "";};
 //BA.debugLineNum = 1925;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
_sv2_scrollchanged(_sv2.getHorizontalScrollPosition(),_sv2.getVerticalScrollPosition());
 //BA.debugLineNum = 1929;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
 //BA.debugLineNum = 1930;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rm";
_previndex = _selectedrows.IndexOf((Object)(_row));
 //BA.debugLineNum = 1932;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step5 = 1;
final int limit5 = (int) (_selectedrows.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 1933;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
 //BA.debugLineNum = 1934;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(_selectedrows.Get(_i)));
 //BA.debugLineNum = 1935;BA.debugLine="If (keepSel > Row) Then";
if ((_keepsel>_row)) { 
 //BA.debugLineNum = 1936;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
_selectedrows.Set(_i,(Object)(_keepsel-1));
 };
 }
};
 //BA.debugLineNum = 1941;BA.debugLine="If (prevIndex <> -1) Then";
if ((_previndex!=-1)) { 
 //BA.debugLineNum = 1943;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
_selectedrows.RemoveAt(_previndex);
 };
 //BA.debugLineNum = 1946;BA.debugLine="Data.RemoveAt(Row)";
_data.RemoveAt(_row);
 //BA.debugLineNum = 1947;BA.debugLine="lstRowColorIndexes.RemoveAt(Row)";
_lstrowcolorindexes.RemoveAt(_row);
 //BA.debugLineNum = 1948;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step17 = 1;
final int limit17 = _maxvisiblerow;
_i = _minvisiblerow ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 1949;BA.debugLine="HideRow(i)";
_hiderow(_i);
 }
};
 //BA.debugLineNum = 1960;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 1961;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
_maxvisiblerow = (int) (__c.Min(_maxvisiblerow,_data.getSize()-1));
 //BA.debugLineNum = 1962;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
_minvisiblerow = (int) (__c.Min(_minvisiblerow,_data.getSize()-1));
 //BA.debugLineNum = 1963;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
{
final int step23 = 1;
final int limit23 = _maxvisiblerow;
_i = _minvisiblerow ;
for (;_i <= limit23 ;_i = _i + step23 ) {
 //BA.debugLineNum = 1965;BA.debugLine="ShowRow(i)";
_showrow(_i);
 }
};
 };
 //BA.debugLineNum = 1969;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
_sv2.getPanel().setHeight((int) (_data.getSize()*_crowheight));
 //BA.debugLineNum = 1970;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
_svf.getPanel().setHeight(_sv2.getPanel().getHeight());
 //BA.debugLineNum = 1971;BA.debugLine="updateIPLocation";
_updateiplocation();
 //BA.debugLineNum = 1973;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
_sv2_scrollchanged(_sv2.getHorizontalScrollPosition(),(int) (__c.Min(_sv2.getVerticalScrollPosition(),_sv2.getPanel().getHeight())));
 //BA.debugLineNum = 1974;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((_lblstatusline.IsInitialized() && _enablestatuslineautofill==__c.True)) { 
_setstatusline(BA.NumberToString(_data.getSize())+" rows");};
 //BA.debugLineNum = 1975;BA.debugLine="End Sub";
return "";
}
public String  _removerowcolorn(int _row) throws Exception{
 //BA.debugLineNum = 2822;BA.debugLine="Public Sub RemoveRowColorN(Row As Int)";
 //BA.debugLineNum = 2823;BA.debugLine="If Row > -1 And Row <lstRowColorIndexes.Size Then";
if (_row>-1 && _row<_lstrowcolorindexes.getSize()) { 
 //BA.debugLineNum = 2824;BA.debugLine="lstRowColorIndexes.Set(Row, 0)";
_lstrowcolorindexes.Set(_row,(Object)(0));
 //BA.debugLineNum = 2825;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2826;BA.debugLine="RefreshLabels";
_refreshlabels();
 };
 };
 //BA.debugLineNum = 2829;BA.debugLine="End Sub";
return "";
}
public String  _removeview() throws Exception{
 //BA.debugLineNum = 3488;BA.debugLine="Public Sub RemoveView";
 //BA.debugLineNum = 3489;BA.debugLine="pnlTable.RemoveView";
_pnltable.RemoveView();
 //BA.debugLineNum = 3490;BA.debugLine="End Sub";
return "";
}
public int[]  _reverseindexdouble(double[] _arrdouble,int[] _arrindex,boolean _bunique) throws Exception{
int _i = 0;
int _c = 0;
int _n = 0;
int _x = 0;
int _iub = 0;
boolean _bsame = false;
int[] _arrindex2 = null;
 //BA.debugLineNum = 4913;BA.debugLine="Sub ReverseIndexDouble(arrDouble() As Double, arrI";
 //BA.debugLineNum = 4915;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4916;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 4917;BA.debugLine="Dim n As Int";
_n = 0;
 //BA.debugLineNum = 4918;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 4919;BA.debugLine="Dim iUB As Int";
_iub = 0;
 //BA.debugLineNum = 4920;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
 //BA.debugLineNum = 4921;BA.debugLine="Dim arrIndex2(arrDouble.Length) As Int";
_arrindex2 = new int[_arrdouble.length];
;
 //BA.debugLineNum = 4923;BA.debugLine="iUB = arrDouble.Length - 1";
_iub = (int) (_arrdouble.length-1);
 //BA.debugLineNum = 4925;BA.debugLine="If bUnique Then";
if (_bunique) { 
 //BA.debugLineNum = 4927;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 4928;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
 //BA.debugLineNum = 4930;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
 //BA.debugLineNum = 4932;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 4933;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
 //BA.debugLineNum = 4934;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i+1)]];
 }else {
 //BA.debugLineNum = 4936;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i-1)]];
 };
 //BA.debugLineNum = 4938;BA.debugLine="If bSame Then";
if (_bsame) { 
 //BA.debugLineNum = 4939;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
 //BA.debugLineNum = 4940;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
 //BA.debugLineNum = 4941;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 4942;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
 //BA.debugLineNum = 4943;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
 //BA.debugLineNum = 4944;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
 //BA.debugLineNum = 4946;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
 //BA.debugLineNum = 4949;BA.debugLine="If c > 0 Then";
if (_c>0) { 
 //BA.debugLineNum = 4950;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 4951;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
 //BA.debugLineNum = 4952;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
 //BA.debugLineNum = 4953;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
 //BA.debugLineNum = 4955;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
 //BA.debugLineNum = 4957;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
 //BA.debugLineNum = 4963;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 //BA.debugLineNum = 4965;BA.debugLine="End Sub";
return null;
}
public int[]  _reverseindexlong(long[] _arrlong,int[] _arrindex,boolean _bunique) throws Exception{
int _i = 0;
int _c = 0;
int _n = 0;
int _x = 0;
int _iub = 0;
boolean _bsame = false;
int[] _arrindex2 = null;
 //BA.debugLineNum = 4859;BA.debugLine="Sub ReverseIndexLong(arrLong() As Long, arrIndex()";
 //BA.debugLineNum = 4861;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4862;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 4863;BA.debugLine="Dim n As Int";
_n = 0;
 //BA.debugLineNum = 4864;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 4865;BA.debugLine="Dim iUB As Int";
_iub = 0;
 //BA.debugLineNum = 4866;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
 //BA.debugLineNum = 4867;BA.debugLine="Dim arrIndex2(arrLong.Length) As Int";
_arrindex2 = new int[_arrlong.length];
;
 //BA.debugLineNum = 4869;BA.debugLine="iUB = arrLong.Length - 1";
_iub = (int) (_arrlong.length-1);
 //BA.debugLineNum = 4871;BA.debugLine="If bUnique Then";
if (_bunique) { 
 //BA.debugLineNum = 4873;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 4874;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
 //BA.debugLineNum = 4876;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
 //BA.debugLineNum = 4878;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 4879;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
 //BA.debugLineNum = 4880;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i+1)]];
 }else {
 //BA.debugLineNum = 4882;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i-1)]];
 };
 //BA.debugLineNum = 4884;BA.debugLine="If bSame Then";
if (_bsame) { 
 //BA.debugLineNum = 4885;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
 //BA.debugLineNum = 4886;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
 //BA.debugLineNum = 4887;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 4888;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
 //BA.debugLineNum = 4889;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
 //BA.debugLineNum = 4890;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
 //BA.debugLineNum = 4892;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
 //BA.debugLineNum = 4895;BA.debugLine="If c > 0 Then";
if (_c>0) { 
 //BA.debugLineNum = 4896;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 4897;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
 //BA.debugLineNum = 4898;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
 //BA.debugLineNum = 4899;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
 //BA.debugLineNum = 4901;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
 //BA.debugLineNum = 4903;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
 //BA.debugLineNum = 4909;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 //BA.debugLineNum = 4911;BA.debugLine="End Sub";
return null;
}
public int[]  _reverseindexstring(String[] _arrstring,int[] _arrindex,boolean _bunique) throws Exception{
int _i = 0;
int _c = 0;
int _n = 0;
int _x = 0;
int _iub = 0;
boolean _bsame = false;
int[] _arrindex2 = null;
 //BA.debugLineNum = 4967;BA.debugLine="Sub ReverseIndexString(arrString() As String, arrI";
 //BA.debugLineNum = 4969;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4970;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 4971;BA.debugLine="Dim n As Int";
_n = 0;
 //BA.debugLineNum = 4972;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 4973;BA.debugLine="Dim iUB As Int";
_iub = 0;
 //BA.debugLineNum = 4974;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
 //BA.debugLineNum = 4975;BA.debugLine="Dim arrIndex2(arrString.Length) As Int";
_arrindex2 = new int[_arrstring.length];
;
 //BA.debugLineNum = 4977;BA.debugLine="iUB = arrString.Length - 1";
_iub = (int) (_arrstring.length-1);
 //BA.debugLineNum = 4979;BA.debugLine="If bUnique Then";
if (_bunique) { 
 //BA.debugLineNum = 4981;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 4982;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
 //BA.debugLineNum = 4984;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
 //BA.debugLineNum = 4986;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 4987;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
 //BA.debugLineNum = 4988;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i+1)]]);
 }else {
 //BA.debugLineNum = 4990;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i-1)]]);
 };
 //BA.debugLineNum = 4992;BA.debugLine="If bSame Then";
if (_bsame) { 
 //BA.debugLineNum = 4993;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
 //BA.debugLineNum = 4994;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
 //BA.debugLineNum = 4995;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 4996;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
 //BA.debugLineNum = 4997;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
 //BA.debugLineNum = 4998;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
 //BA.debugLineNum = 5000;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
 //BA.debugLineNum = 5003;BA.debugLine="If c > 0 Then";
if (_c>0) { 
 //BA.debugLineNum = 5004;BA.debugLine="x = 0";
_x = (int) (0);
 //BA.debugLineNum = 5005;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
 //BA.debugLineNum = 5006;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
 //BA.debugLineNum = 5007;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
 //BA.debugLineNum = 5010;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
 //BA.debugLineNum = 5012;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
 //BA.debugLineNum = 5018;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 //BA.debugLineNum = 5020;BA.debugLine="End Sub";
return null;
}
public String  _savetabletocsv(String _dir,String _filename) throws Exception{
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
 //BA.debugLineNum = 1869;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
 //BA.debugLineNum = 1870;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 1871;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1873;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 1874;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 1875;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1876;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_header.GetView(_i).getObject()));
 //BA.debugLineNum = 1877;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
 //BA.debugLineNum = 1880;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step10 = 1;
final int limit10 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 1881;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1882;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<_mnumberoffixedcolumns) { 
 //BA.debugLineNum = 1883;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_headerfirst.GetView(_i).getObject()));
 }else {
 //BA.debugLineNum = 1885;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_header.GetView((int) (_i-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 1886;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
 //BA.debugLineNum = 1890;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, H";
_stringutils1.SaveCSV2(_dir,_filename,BA.ObjectToChar(","),_data,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
 //BA.debugLineNum = 1891;BA.debugLine="End Sub";
return "";
}
public String  _savetabletocsv2(String _dir,String _filename,String _separatorchar) throws Exception{
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
 //BA.debugLineNum = 1894;BA.debugLine="Public Sub SaveTableToCSV2(Dir As String, Filename";
 //BA.debugLineNum = 1895;BA.debugLine="Dim headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 1896;BA.debugLine="Private headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 1897;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1899;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 1900;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 1901;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1902;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_header.GetView(_i).getObject()));
 //BA.debugLineNum = 1903;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
 //BA.debugLineNum = 1906;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 1907;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 1908;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<_mnumberoffixedcolumns) { 
 //BA.debugLineNum = 1909;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_headerfirst.GetView(_i).getObject()));
 }else {
 //BA.debugLineNum = 1911;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_header.GetView((int) (_i-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 1912;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
 //BA.debugLineNum = 1916;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, SeparatorCha";
_stringutils1.SaveCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_data,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
 //BA.debugLineNum = 1917;BA.debugLine="End Sub";
return "";
}
public String  _scaletable(double _scalex,double _scaley,boolean _scalealldone) throws Exception{
int _i = 0;
 //BA.debugLineNum = 3851;BA.debugLine="Public Sub ScaleTable(ScaleX As Double, ScaleY As";
 //BA.debugLineNum = 3852;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 3853;BA.debugLine="ToastMessageShow(\"Table.ScaleTable must be calle";
__c.ToastMessageShow(BA.ObjectToCharSequence("Table.ScaleTable must be called before filling the Table"),__c.False);
 //BA.debugLineNum = 3854;BA.debugLine="Log(\"Table.ScaleTable must be called before fill";
__c.LogImpl("728704771","Table.ScaleTable must be called before filling the Table",0);
 //BA.debugLineNum = 3855;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3858;BA.debugLine="cTextSize = cTextSize * Min(ScaleX, ScaleY)";
_ctextsize = (float) (_ctextsize*__c.Min(_scalex,_scaley));
 //BA.debugLineNum = 3859;BA.debugLine="cLineWidth = cLineWidth * ScaleX";
_clinewidth = (int) (_clinewidth*_scalex);
 //BA.debugLineNum = 3860;BA.debugLine="ExtraWidth = ExtraWidth * ScaleX";
_extrawidth = (int) (_extrawidth*_scalex);
 //BA.debugLineNum = 3861;BA.debugLine="cRowHeight  = cRowHeight * ScaleY";
_crowheight = (int) (_crowheight*_scaley);
 //BA.debugLineNum = 3862;BA.debugLine="cHeaderHeight = cHeaderHeight * ScaleY";
_cheaderheight = (int) (_cheaderheight*_scaley);
 //BA.debugLineNum = 3863;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 3864;BA.debugLine="ColumnWidths(i) = ColumnWidths(i) * ScaleX";
_columnwidths[_i] = (int) (_columnwidths[_i]*_scalex);
 //BA.debugLineNum = 3865;BA.debugLine="DataWidths(i) = DataWidths(i) * ScaleX";
_datawidths[_i] = (int) (_datawidths[_i]*_scalex);
 //BA.debugLineNum = 3866;BA.debugLine="HeaderWidths(i) = HeaderWidths(i)	* ScaleX";
_headerwidths[_i] = (int) (_headerwidths[_i]*_scalex);
 //BA.debugLineNum = 3867;BA.debugLine="SavedWidths(i) = SavedWidths(i)	* ScaleX";
_savedwidths[_i] = (int) (_savedwidths[_i]*_scalex);
 }
};
 //BA.debugLineNum = 3870;BA.debugLine="If ScaleAllDone = False Then";
if (_scalealldone==__c.False) { 
 //BA.debugLineNum = 3871;BA.debugLine="cLeft = cLeft * ScaleX";
_cleft = (int) (_cleft*_scalex);
 //BA.debugLineNum = 3872;BA.debugLine="cTop = cTop * ScaleY";
_ctop = (int) (_ctop*_scaley);
 //BA.debugLineNum = 3873;BA.debugLine="cWidth = cWidth * ScaleX";
_cwidth = (int) (_cwidth*_scalex);
 //BA.debugLineNum = 3874;BA.debugLine="cHeight = cHeight * ScaleY";
_cheight = (int) (_cheight*_scaley);
 //BA.debugLineNum = 3876;BA.debugLine="cTextSize = cTextSize * ScaleY";
_ctextsize = (float) (_ctextsize*_scaley);
 //BA.debugLineNum = 3877;BA.debugLine="pnlTable.Left = cLeft";
_pnltable.setLeft(_cleft);
 //BA.debugLineNum = 3878;BA.debugLine="pnlTable.Top = cTop";
_pnltable.setTop(_ctop);
 //BA.debugLineNum = 3879;BA.debugLine="pnlTable.Width = cWidth";
_pnltable.setWidth(_cwidth);
 //BA.debugLineNum = 3880;BA.debugLine="pnlTable.Height = cHeight";
_pnltable.setHeight(_cheight);
 //BA.debugLineNum = 3881;BA.debugLine="Header.Height = cHeaderHeight";
_header.setHeight(_cheaderheight);
 //BA.debugLineNum = 3882;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
_headerfirst.setHeight(_cheaderheight);
 //BA.debugLineNum = 3883;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 3884;BA.debugLine="SV2.Width = cWidth";
_sv2.setWidth(_cwidth);
 }else {
 //BA.debugLineNum = 3886;BA.debugLine="SVF.Width = SVF.Width * ScaleX";
_svf.setWidth((int) (_svf.getWidth()*_scalex));
 //BA.debugLineNum = 3887;BA.debugLine="SV2.Width = SV2.Width * ScaleX";
_sv2.setWidth((int) (_sv2.getWidth()*_scalex));
 //BA.debugLineNum = 3888;BA.debugLine="SV2.Left = SVF.Width";
_sv2.setLeft(_svf.getWidth());
 };
 //BA.debugLineNum = 3890;BA.debugLine="SV2.Top = cHeaderHeight";
_sv2.setTop(_cheaderheight);
 //BA.debugLineNum = 3891;BA.debugLine="SVF.Top = cHeaderHeight";
_svf.setTop(_cheaderheight);
 //BA.debugLineNum = 3892;BA.debugLine="If (cShowStatusLine = True) Then";
if ((_cshowstatusline==__c.True)) { 
 //BA.debugLineNum = 3893;BA.debugLine="SV2.Height = cHeight - cStatusLineHeight - cHea";
_sv2.setHeight((int) (_cheight-_cstatuslineheight-_cheaderheight));
 //BA.debugLineNum = 3894;BA.debugLine="SVF.Height = cHeight - cStatusLineHeight - cHea";
_svf.setHeight((int) (_cheight-_cstatuslineheight-_cheaderheight));
 }else {
 //BA.debugLineNum = 3896;BA.debugLine="SV2.Height = cHeight - cHeaderHeight";
_sv2.setHeight((int) (_cheight-_cheaderheight));
 //BA.debugLineNum = 3897;BA.debugLine="SVF.Height = cHeight - cHeaderHeight";
_svf.setHeight((int) (_cheight-_cheaderheight));
 };
 //BA.debugLineNum = 3899;BA.debugLine="lblFastScroll.Width = lblFastScroll.Width * Scal";
_lblfastscroll.setWidth((int) (_lblfastscroll.getWidth()*_scalex));
 //BA.debugLineNum = 3900;BA.debugLine="lblFastScroll.Height = lblFastScroll.Height * Sc";
_lblfastscroll.setHeight((int) (_lblfastscroll.getHeight()*_scaley));
 //BA.debugLineNum = 3902;BA.debugLine="lblFastScroll.TextSize = lblFastScroll.TextSize";
_lblfastscroll.setTextSize((float) (_lblfastscroll.getTextSize()*_scaley));
 //BA.debugLineNum = 3903;BA.debugLine="lblFastScroll.Left = lblFastScroll.Left * ScaleX";
_lblfastscroll.setLeft((int) (_lblfastscroll.getLeft()*_scalex));
 //BA.debugLineNum = 3904;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
_lblfastscroll.setTop((int) ((_sv2.getHeight()-_lblfastscroll.getHeight())/(double)2+_header.getHeight()));
 //BA.debugLineNum = 3905;BA.debugLine="InitFastScroll";
_initfastscroll();
 //BA.debugLineNum = 3906;BA.debugLine="lblStatusLine.TextSize = cTextSize";
_lblstatusline.setTextSize(_ctextsize);
 //BA.debugLineNum = 3907;BA.debugLine="lblStatusLine.Height = cStatusLineHeight";
_lblstatusline.setHeight(_cstatuslineheight);
 //BA.debugLineNum = 3908;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
_lblstatusline.setTop((int) (_sv2.getTop()+_sv2.getHeight()));
 };
 //BA.debugLineNum = 3910;BA.debugLine="CreateNewLabels";
_createnewlabels();
 //BA.debugLineNum = 3911;BA.debugLine="End Sub";
return "";
}
public String  _scroll(int _posx,int _posy) throws Exception{
int _currentmin = 0;
int _currentmax = 0;
int _i = 0;
 //BA.debugLineNum = 1185;BA.debugLine="Private Sub Scroll(PosX As Int, PosY As Int)";
 //BA.debugLineNum = 1186;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
 //BA.debugLineNum = 1187;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)_crowheight-30));
 //BA.debugLineNum = 1188;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV2.Heigh";
_currentmax = (int) (__c.Min(_data.getSize()-1,(_posy+_sv2.getHeight())/(double)_crowheight+30));
 //BA.debugLineNum = 1189;BA.debugLine="If minVisibleRow > -1 Then";
if (_minvisiblerow>-1) { 
 //BA.debugLineNum = 1190;BA.debugLine="If minVisibleRow < currentMin Then";
if (_minvisiblerow<_currentmin) { 
 //BA.debugLineNum = 1192;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,_maxvisiblerow));
_i = _minvisiblerow ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 1193;BA.debugLine="HideRow(I)";
_hiderow(_i);
 }
};
 }else if(_minvisiblerow>_currentmin) { 
 //BA.debugLineNum = 1197;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(_minvisiblerow-1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
 //BA.debugLineNum = 1198;BA.debugLine="ShowRow(I)";
_showrow(_i);
 }
};
 };
 //BA.debugLineNum = 1201;BA.debugLine="If maxVisibleRow > currentMax Then";
if (_maxvisiblerow>_currentmax) { 
 //BA.debugLineNum = 1203;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,_minvisiblerow));
_i = _maxvisiblerow ;
for (;_i >= limit15 ;_i = _i + step15 ) {
 //BA.debugLineNum = 1204;BA.debugLine="HideRow(I)";
_hiderow(_i);
 }
};
 }else if(_maxvisiblerow<_currentmax) { 
 //BA.debugLineNum = 1208;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(_maxvisiblerow+1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
 //BA.debugLineNum = 1209;BA.debugLine="ShowRow(I)";
_showrow(_i);
 }
};
 };
 };
 //BA.debugLineNum = 1213;BA.debugLine="minVisibleRow = currentMin";
_minvisiblerow = _currentmin;
 //BA.debugLineNum = 1214;BA.debugLine="maxVisibleRow = currentMax";
_maxvisiblerow = _currentmax;
 //BA.debugLineNum = 1215;BA.debugLine="Header.Left = -PosX + mFirstColumnsWidth";
_header.setLeft((int) (-_posx+_mfirstcolumnswidth));
 //BA.debugLineNum = 1216;BA.debugLine="lblStatusLine.Left = - PosX";
_lblstatusline.setLeft((int) (-_posx));
 //BA.debugLineNum = 1217;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(b4a.example.ef.table._rowcol _rc) throws Exception{
int _previndex = 0;
int _prev = 0;
 //BA.debugLineNum = 1626;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
 //BA.debugLineNum = 1627;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(_callowselection)) { 
if (true) return "";};
 //BA.debugLineNum = 1629;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
 //BA.debugLineNum = 1630;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
_prev = 0;
 //BA.debugLineNum = 1632;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if";
_previndex = _selectedrows.IndexOf((Object)(_rc.Row /*int*/ ));
 //BA.debugLineNum = 1633;BA.debugLine="If (prevIndex <> -1 And mMultiSelect = False) The";
if ((_previndex!=-1 && _mmultiselect==__c.False)) { 
 //BA.debugLineNum = 1635;BA.debugLine="SelectedCol = rc.col";
_selectedcol = _rc.Col /*int*/ ;
 //BA.debugLineNum = 1636;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (_visiblerows.ContainsKey((Object)(_rc.Row /*int*/ ))) { 
 //BA.debugLineNum = 1637;BA.debugLine="HideRow(rc.Row)";
_hiderow(_rc.Row /*int*/ );
 //BA.debugLineNum = 1638;BA.debugLine="ShowRow(rc.Row)";
_showrow(_rc.Row /*int*/ );
 };
 //BA.debugLineNum = 1640;BA.debugLine="If mZeroSelection = False Then";
if (_mzeroselection==__c.False) { 
 //BA.debugLineNum = 1641;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 1645;BA.debugLine="If (prevIndex = -1) Then";
if ((_previndex==-1)) { 
 //BA.debugLineNum = 1646;BA.debugLine="If (mMultiSelect) Then";
if ((_mmultiselect)) { 
 //BA.debugLineNum = 1647;BA.debugLine="SelectedRows.Add(rc.Row) 'Select the new row";
_selectedrows.Add((Object)(_rc.Row /*int*/ ));
 //BA.debugLineNum = 1648;BA.debugLine="prev = -1";
_prev = (int) (-1);
 }else {
 //BA.debugLineNum = 1652;BA.debugLine="If (SelectedRows.Size <> 0) Then";
if ((_selectedrows.getSize()!=0)) { 
 //BA.debugLineNum = 1653;BA.debugLine="prev = SelectedRows.Get(0) ' there should be o";
_prev = (int)(BA.ObjectToNumber(_selectedrows.Get((int) (0))));
 //BA.debugLineNum = 1654;BA.debugLine="SelectedRows.set(0, rc.Row) ' change it to the";
_selectedrows.Set((int) (0),(Object)(_rc.Row /*int*/ ));
 }else {
 //BA.debugLineNum = 1656;BA.debugLine="prev = -1";
_prev = (int) (-1);
 //BA.debugLineNum = 1657;BA.debugLine="SelectedRows.Add(rc.Row)";
_selectedrows.Add((Object)(_rc.Row /*int*/ ));
 };
 };
 }else {
 //BA.debugLineNum = 1662;BA.debugLine="prev = SelectedRows.Get(prevIndex) ' should be R";
_prev = (int)(BA.ObjectToNumber(_selectedrows.Get(_previndex)));
 //BA.debugLineNum = 1663;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
_selectedrows.RemoveAt(_previndex);
 };
 //BA.debugLineNum = 1666;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
 //BA.debugLineNum = 1667;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (_visiblerows.ContainsKey((Object)(_rc.Row /*int*/ ))) { 
 //BA.debugLineNum = 1668;BA.debugLine="HideRow(prev)";
_hiderow(_prev);
 //BA.debugLineNum = 1669;BA.debugLine="ShowRow(prev)";
_showrow(_prev);
 };
 };
 //BA.debugLineNum = 1673;BA.debugLine="SelectedCol = rc.col";
_selectedcol = _rc.Col /*int*/ ;
 //BA.debugLineNum = 1674;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (_visiblerows.ContainsKey((Object)(_rc.Row /*int*/ ))) { 
 //BA.debugLineNum = 1675;BA.debugLine="HideRow(rc.Row)";
_hiderow(_rc.Row /*int*/ );
 //BA.debugLineNum = 1676;BA.debugLine="ShowRow(rc.Row)";
_showrow(_rc.Row /*int*/ );
 };
 //BA.debugLineNum = 1678;BA.debugLine="End Sub";
return "";
}
public String  _setallowselection(boolean _allowselection) throws Exception{
 //BA.debugLineNum = 2169;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
 //BA.debugLineNum = 2170;BA.debugLine="cAllowSelection = AllowSelection";
_callowselection = _allowselection;
 //BA.debugLineNum = 2171;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2172;BA.debugLine="clearSelection";
_clearselection();
 };
 //BA.debugLineNum = 2174;BA.debugLine="End Sub";
return "";
}
public String  _setarrcolumnssorted(int _icolumns) throws Exception{
 //BA.debugLineNum = 4442;BA.debugLine="Public Sub SetArrColumnsSorted(iColumns As Int)";
 //BA.debugLineNum = 4444;BA.debugLine="sortingDir = 0 ' -1, 0, 1 as asc, unsorted, desc";
_sortingdir = (int) (0);
 //BA.debugLineNum = 4445;BA.debugLine="sortedCol = -1";
_sortedcol = (int) (-1);
 //BA.debugLineNum = 4447;BA.debugLine="Dim arrDataSorted(iColumns) As Boolean";
_arrdatasorted = new boolean[_icolumns];
;
 //BA.debugLineNum = 4448;BA.debugLine="bDataTempDone = False";
_bdatatempdone = __c.False;
 //BA.debugLineNum = 4449;BA.debugLine="Dim arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
 //BA.debugLineNum = 4450;BA.debugLine="mapSortingIndexes.Initialize";
_mapsortingindexes.Initialize();
 //BA.debugLineNum = 4452;BA.debugLine="End Sub";
return "";
}
public String  _setautomaticwidths() throws Exception{
int _row = 0;
int _col = 0;
String[] _vals = null;
int _width = 0;
int[] _widths = null;
 //BA.debugLineNum = 3789;BA.debugLine="Public Sub SetAutomaticWidths";
 //BA.debugLineNum = 3790;BA.debugLine="Dim row, col As Int";
_row = 0;
_col = 0;
 //BA.debugLineNum = 3791;BA.debugLine="Dim Vals(mNumberOfColumns) As String";
_vals = new String[_mnumberofcolumns];
java.util.Arrays.fill(_vals,"");
 //BA.debugLineNum = 3792;BA.debugLine="Dim Width, Widths(mNumberOfColumns) As Int";
_width = 0;
_widths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3794;BA.debugLine="cAutomaticWidths = True";
_cautomaticwidths = __c.True;
 //BA.debugLineNum = 3796;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
 //BA.debugLineNum = 3797;BA.debugLine="If MultiTypeFace = False Then";
if (_multitypeface==__c.False) { 
 //BA.debugLineNum = 3798;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_headernames.Get(_col)),(android.graphics.Typeface)(_cheadertypeface.getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 3800;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (_cvs.MeasureStringWidth(BA.ObjectToString(_headernames.Get(_col)),(android.graphics.Typeface)(_cheadertypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 3803;BA.debugLine="For row = 0 To Data.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_data.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
 //BA.debugLineNum = 3804;BA.debugLine="Vals = Data.Get(row)";
_vals = (String[])(_data.Get(_row));
 //BA.debugLineNum = 3805;BA.debugLine="If MultiTypeFace = False Then";
if (_multitypeface==__c.False) { 
 //BA.debugLineNum = 3806;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (_cvs.MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(_ctypeface.getObject()),_ctextsize)+_extrawidth);
 }else {
 //BA.debugLineNum = 3808;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (_cvs.MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(_ctypefaces[_col].getObject()),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 3810;BA.debugLine="If Widths(col) < Width Then";
if (_widths[_col]<_width) { 
 //BA.debugLineNum = 3811;BA.debugLine="Widths(col) = Width";
_widths[_col] = _width;
 };
 }
};
 }
};
 //BA.debugLineNum = 3815;BA.debugLine="SetColumnsWidths(Widths)";
_setcolumnswidths(_widths);
 //BA.debugLineNum = 3816;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignment(int _alignment) throws Exception{
int _i = 0;
 //BA.debugLineNum = 2440;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
 //BA.debugLineNum = 2441;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2443;BA.debugLine="cAlignment = Alignment";
_calignment = _alignment;
 //BA.debugLineNum = 2444;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 2445;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 2446;BA.debugLine="cAlignments(i) = cAlignment";
_calignments[_i] = _calignment;
 }
};
 //BA.debugLineNum = 2448;BA.debugLine="MultiAlignments = False";
_multialignments = __c.False;
 //BA.debugLineNum = 2449;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 2450;BA.debugLine="RefreshTable";
_refreshtable();
 };
 //BA.debugLineNum = 2452;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignmentcoln(int _col,int _alignmentcoln) throws Exception{
int _i = 0;
 //BA.debugLineNum = 2457;BA.debugLine="Public Sub SetCellAlignmentColN(Col As Int, Alignm";
 //BA.debugLineNum = 2458;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 2460;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
 //BA.debugLineNum = 2461;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>_mnumberofcolumns-1) { 
 //BA.debugLineNum = 2462;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
 //BA.debugLineNum = 2463;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2466;BA.debugLine="If MultiAlignments = False Then";
if (_multialignments==__c.False) { 
 //BA.debugLineNum = 2467;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 2468;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 2469;BA.debugLine="cAlignments(i) = cAlignment";
_calignments[_i] = _calignment;
 }
};
 };
 //BA.debugLineNum = 2472;BA.debugLine="cAlignments(Col) = AlignmentColN";
_calignments[_col] = _alignmentcoln;
 //BA.debugLineNum = 2473;BA.debugLine="cAlignments0 = cAlignments";
_calignments0 = _calignments;
 //BA.debugLineNum = 2475;BA.debugLine="MultiAlignments = True";
_multialignments = __c.True;
 //BA.debugLineNum = 2476;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 2477;BA.debugLine="RefreshTable";
_refreshtable();
 };
 //BA.debugLineNum = 2479;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignments(int[] _alignments) throws Exception{
 //BA.debugLineNum = 2422;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
 //BA.debugLineNum = 2423;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 2424;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
 //BA.debugLineNum = 2425;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2428;BA.debugLine="cAlignments0 = Alignments";
_calignments0 = _alignments;
 //BA.debugLineNum = 2429;BA.debugLine="cAlignments = cAlignments0";
_calignments = _calignments0;
 //BA.debugLineNum = 2431;BA.debugLine="MultiAlignments = True";
_multialignments = __c.True;
 //BA.debugLineNum = 2432;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 2433;BA.debugLine="RefreshTable";
_refreshtable();
 };
 //BA.debugLineNum = 2435;BA.debugLine="End Sub";
return "";
}
public String  _setcolumncolors(int[] _columncolors) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
 //BA.debugLineNum = 3544;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
 //BA.debugLineNum = 3545;BA.debugLine="cColumnColors = ColumnColors";
_ccolumncolors = _columncolors;
 //BA.debugLineNum = 3547;BA.debugLine="Dim ColumnDrawables(cColumnColors.Length) As Obje";
_columndrawables = new Object[_ccolumncolors.length];
{
int d0 = _columndrawables.length;
for (int i0 = 0;i0 < d0;i0++) {
_columndrawables[i0] = new Object();
}
}
;
 //BA.debugLineNum = 3548;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step3 = 1;
final int limit3 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 3549;BA.debugLine="Private cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 3550;BA.debugLine="cd.Initialize(cColumnColors(i), 0)";
_cd.Initialize(_ccolumncolors[_i],(int) (0));
 //BA.debugLineNum = 3551;BA.debugLine="ColumnDrawables(i) = cd";
_columndrawables[_i] = (Object)(_cd.getObject());
 }
};
 //BA.debugLineNum = 3554;BA.debugLine="If ColumnColors.Length > 1 Then";
if (_columncolors.length>1) { 
 //BA.debugLineNum = 3555;BA.debugLine="cUseColumnColors = True";
_cusecolumncolors = __c.True;
 }else {
 //BA.debugLineNum = 3557;BA.debugLine="cUseColumnColors = False";
_cusecolumncolors = __c.False;
 };
 //BA.debugLineNum = 3559;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 3560;BA.debugLine="RefreshTable";
_refreshtable();
 };
 //BA.debugLineNum = 3562;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatype(int _column,String _datatype) throws Exception{
 //BA.debugLineNum = 3925;BA.debugLine="Public Sub SetColumnDataType(Column As Int, DataTy";
 //BA.debugLineNum = 3926;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>_mnumberofcolumns-1) { 
 //BA.debugLineNum = 3927;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
 //BA.debugLineNum = 3928;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3931;BA.debugLine="If DataType <> \"T\" And DataType <> \"R\" And DataTy";
if ((_datatype).equals("T") == false && (_datatype).equals("R") == false && (_datatype).equals("I") == false) { 
 //BA.debugLineNum = 3932;BA.debugLine="ToastMessageShow(\"Wrong data type only TEXT abd";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only TEXT abd NUMBER are allowed"),__c.False);
 }else {
 //BA.debugLineNum = 3934;BA.debugLine="cColumnDataType(Column) = DataType";
_ccolumndatatype[_column] = _datatype;
 };
 //BA.debugLineNum = 3936;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatypes(String[] _datatype) throws Exception{
int _col = 0;
 //BA.debugLineNum = 3952;BA.debugLine="Public Sub SetColumnDataTypes(DataType() As String";
 //BA.debugLineNum = 3953;BA.debugLine="If DataType.Length <> mNumberOfColumns Then";
if (_datatype.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 3954;BA.debugLine="ToastMessageShow(\"Wrong number of columns\", Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong number of columns"),__c.False);
 //BA.debugLineNum = 3955;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3958;BA.debugLine="For Col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
 //BA.debugLineNum = 3959;BA.debugLine="If DataType(Col) <> \"T\" And DataType(Col) <> \"R\"";
if ((_datatype[_col]).equals("T") == false && (_datatype[_col]).equals("R") == false && (_datatype[_col]).equals("I") == false) { 
 //BA.debugLineNum = 3960;BA.debugLine="ToastMessageShow(\"Wrong data type only T, R and";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only T, R and I are allowed"),__c.False);
 //BA.debugLineNum = 3961;BA.debugLine="Return";
if (true) return "";
 };
 }
};
 //BA.debugLineNum = 3965;BA.debugLine="cColumnDataType = DataType";
_ccolumndatatype = _datatype;
 //BA.debugLineNum = 3966;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnswidths(int[] _widths) throws Exception{
int _col = 0;
int _row = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _w = 0;
int _left = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _wt = 0;
int _col_x = 0;
 //BA.debugLineNum = 914;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
 //BA.debugLineNum = 916;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
 //BA.debugLineNum = 918;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
_savedwidths = new int[_widths.length];
;
 //BA.debugLineNum = 919;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
_columnwidths = new int[_widths.length];
;
 //BA.debugLineNum = 920;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
_headerwidths = new int[_widths.length];
;
 //BA.debugLineNum = 921;BA.debugLine="If cAutomaticWidths = False Then";
if (_cautomaticwidths==__c.False) { 
 //BA.debugLineNum = 922;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
 //BA.debugLineNum = 923;BA.debugLine="SavedWidths(col) = Widths(col)";
_savedwidths[_col] = _widths[_col];
 //BA.debugLineNum = 924;BA.debugLine="ColumnWidths(col) = Widths(col)";
_columnwidths[_col] = _widths[_col];
 //BA.debugLineNum = 925;BA.debugLine="HeaderWidths(col) = Widths(col)";
_headerwidths[_col] = _widths[_col];
 //BA.debugLineNum = 926;BA.debugLine="DataWidths(col) = Widths(col)";
_datawidths[_col] = _widths[_col];
 }
};
 }else {
 //BA.debugLineNum = 929;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step13 = 1;
final int limit13 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
 //BA.debugLineNum = 930;BA.debugLine="SavedWidths(col) = Widths(col)";
_savedwidths[_col] = _widths[_col];
 //BA.debugLineNum = 931;BA.debugLine="ColumnWidths(col) = Widths(col)";
_columnwidths[_col] = _widths[_col];
 }
};
 };
 //BA.debugLineNum = 935;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
 //BA.debugLineNum = 936;BA.debugLine="Private w As Int";
_w = 0;
 //BA.debugLineNum = 937;BA.debugLine="Private Left As Int";
_left = 0;
 //BA.debugLineNum = 938;BA.debugLine="Left = cLineWidth";
_left = _clinewidth;
 //BA.debugLineNum = 939;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 940;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit23 ;_col = _col + step23 ) {
 //BA.debugLineNum = 941;BA.debugLine="v = Header.GetView(col)";
_v = _header.GetView(_col);
 //BA.debugLineNum = 942;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-_clinewidth));
 //BA.debugLineNum = 943;BA.debugLine="v.Width = w";
_v.setWidth(_w);
 //BA.debugLineNum = 944;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
 //BA.debugLineNum = 945;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
 //BA.debugLineNum = 946;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+_clinewidth);
 };
 }
};
 //BA.debugLineNum = 949;BA.debugLine="mFirstColumnsWidth = 0";
_mfirstcolumnswidth = (int) (0);
 //BA.debugLineNum = 950;BA.debugLine="HeaderFirst.Width = 0";
_headerfirst.setWidth((int) (0));
 //BA.debugLineNum = 951;BA.debugLine="SVF.Width = 0";
_svf.setWidth((int) (0));
 //BA.debugLineNum = 952;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1)";
_header.setWidth((int) (_header.GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
 //BA.debugLineNum = 953;BA.debugLine="SV2.Panel.Width = Header.Width";
_sv2.getPanel().setWidth(_header.getWidth());
 //BA.debugLineNum = 954;BA.debugLine="SV2.Left = 0";
_sv2.setLeft((int) (0));
 //BA.debugLineNum = 955;BA.debugLine="SV2.Width = Min(Header.Width, cWidth)";
_sv2.setWidth((int) (__c.Min(_header.getWidth(),_cwidth)));
 //BA.debugLineNum = 956;BA.debugLine="Header.Left = 0";
_header.setLeft((int) (0));
 //BA.debugLineNum = 957;BA.debugLine="SV2.HorizontalScrollPosition = 0";
_sv2.setHorizontalScrollPosition((int) (0));
 //BA.debugLineNum = 958;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 959;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step42 = 1;
final int limit42 = (int) (_visiblerows.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit42 ;_row = _row + step42 ) {
 //BA.debugLineNum = 960;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.GetValueAt(_row));
 //BA.debugLineNum = 961;BA.debugLine="For col = 0 To lbls.Length - 1";
{
final int step44 = 1;
final int limit44 = (int) (_lbls.length-1);
_col = (int) (0) ;
for (;_col <= limit44 ;_col = _col + step44 ) {
 //BA.debugLineNum = 962;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left,";
_lbls[_col].SetLayout(_header.GetView(_col).getLeft(),_lbls[_col].getTop(),_header.GetView(_col).getWidth(),(int) (_crowheight-_clinewidth));
 }
};
 }
};
 //BA.debugLineNum = 965;BA.debugLine="pnlTable.Width = Min(Header.Width, cWidth)";
_pnltable.setWidth((int) (__c.Min(_header.getWidth(),_cwidth)));
 //BA.debugLineNum = 966;BA.debugLine="lblStatusLine.Width = Header.Width";
_lblstatusline.setWidth(_header.getWidth());
 //BA.debugLineNum = 967;BA.debugLine="internalPanel.Width = Header.Width";
_internalpanel.setWidth(_header.getWidth());
 }else {
 //BA.debugLineNum = 969;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
 //BA.debugLineNum = 970;BA.debugLine="Private w, wt As Int";
_w = 0;
_wt = 0;
 //BA.debugLineNum = 971;BA.debugLine="Left = cLineWidth";
_left = _clinewidth;
 //BA.debugLineNum = 972;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit55 ;_col = _col + step55 ) {
 //BA.debugLineNum = 973;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
 //BA.debugLineNum = 974;BA.debugLine="v = HeaderFirst.GetView(col)";
_v = _headerfirst.GetView(_col);
 //BA.debugLineNum = 976;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)	'???";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-_clinewidth));
 //BA.debugLineNum = 977;BA.debugLine="v.Width = w";
_v.setWidth(_w);
 //BA.debugLineNum = 978;BA.debugLine="wt = wt + w";
_wt = (int) (_wt+_w);
 //BA.debugLineNum = 979;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
 //BA.debugLineNum = 980;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
 //BA.debugLineNum = 981;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+_clinewidth);
 };
 }
};
 //BA.debugLineNum = 984;BA.debugLine="mFirstColumnsWidth = Left";
_mfirstcolumnswidth = _left;
 //BA.debugLineNum = 985;BA.debugLine="HeaderFirst.Width = Left";
_headerfirst.setWidth(_left);
 //BA.debugLineNum = 986;BA.debugLine="SVF.Width = HeaderFirst.Width";
_svf.setWidth(_headerfirst.getWidth());
 //BA.debugLineNum = 987;BA.debugLine="SV2.Left = HeaderFirst.Width";
_sv2.setLeft(_headerfirst.getWidth());
 //BA.debugLineNum = 988;BA.debugLine="Private Left, col_x As Int";
_left = 0;
_col_x = 0;
 //BA.debugLineNum = 989;BA.debugLine="Left = 0";
_left = (int) (0);
 //BA.debugLineNum = 990;BA.debugLine="For col = mNumberOfFixedColumns To Widths.Length";
{
final int step72 = 1;
final int limit72 = (int) (_widths.length-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit72 ;_col = _col + step72 ) {
 //BA.debugLineNum = 991;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
 //BA.debugLineNum = 992;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-_mnumberoffixedcolumns);
 //BA.debugLineNum = 993;BA.debugLine="v = Header.GetView(col_x)";
_v = _header.GetView(_col_x);
 //BA.debugLineNum = 994;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-_clinewidth));
 //BA.debugLineNum = 995;BA.debugLine="v.Width = w";
_v.setWidth(_w);
 //BA.debugLineNum = 996;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
 //BA.debugLineNum = 997;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
 //BA.debugLineNum = 998;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+_clinewidth);
 };
 }
};
 //BA.debugLineNum = 1001;BA.debugLine="Header.Width = Left";
_header.setWidth(_left);
 //BA.debugLineNum = 1002;BA.debugLine="Header.Left = -SV2.HorizontalScrollPosition + mF";
_header.setLeft((int) (-_sv2.getHorizontalScrollPosition()+_mfirstcolumnswidth));
 //BA.debugLineNum = 1003;BA.debugLine="SV2.Panel.Width = Header.Width";
_sv2.getPanel().setWidth(_header.getWidth());
 //BA.debugLineNum = 1004;BA.debugLine="Header.Left = mFirstColumnsWidth";
_header.setLeft(_mfirstcolumnswidth);
 //BA.debugLineNum = 1005;BA.debugLine="SV2.HorizontalScrollPosition = 0";
_sv2.setHorizontalScrollPosition((int) (0));
 //BA.debugLineNum = 1006;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 1007;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step89 = 1;
final int limit89 = (int) (_visiblerows.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit89 ;_row = _row + step89 ) {
 //BA.debugLineNum = 1008;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.GetValueAt(_row));
 //BA.debugLineNum = 1009;BA.debugLine="Left = 0";
_left = (int) (0);
 //BA.debugLineNum = 1010;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step92 = 1;
final int limit92 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit92 ;_col = _col + step92 ) {
 //BA.debugLineNum = 1011;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Width";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),_widths[_col],(int) (_crowheight-_clinewidth));
 //BA.debugLineNum = 1012;BA.debugLine="Left = HeaderFirst.GetView(col).Left + HeaderF";
_left = (int) (_headerfirst.GetView(_col).getLeft()+_headerfirst.GetView(_col).getWidth()+_clinewidth);
 }
};
 //BA.debugLineNum = 1014;BA.debugLine="Left = 0";
_left = (int) (0);
 //BA.debugLineNum = 1015;BA.debugLine="For col = mNumberOfFixedColumns To lbls.Length";
{
final int step97 = 1;
final int limit97 = (int) (_lbls.length-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit97 ;_col = _col + step97 ) {
 //BA.debugLineNum = 1016;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-_mnumberoffixedcolumns);
 //BA.debugLineNum = 1017;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Heade";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),_header.GetView(_col_x).getWidth(),(int) (_crowheight-_clinewidth));
 //BA.debugLineNum = 1018;BA.debugLine="Left = Left + Header.GetView(col_x).Width + cL";
_left = (int) (_left+_header.GetView(_col_x).getWidth()+_clinewidth);
 }
};
 }
};
 //BA.debugLineNum = 1021;BA.debugLine="SV2.Width = Min(Header.Width, cWidth - HeaderFir";
_sv2.setWidth((int) (__c.Min(_header.getWidth(),_cwidth-_headerfirst.getWidth())));
 //BA.debugLineNum = 1022;BA.debugLine="pnlTable.Width = Min(HeaderFirst.Width + Header.";
_pnltable.setWidth((int) (__c.Min(_headerfirst.getWidth()+_header.getWidth(),_cwidth)));
 //BA.debugLineNum = 1023;BA.debugLine="lblStatusLine.Width = HeaderFirst.Width + Header";
_lblstatusline.setWidth((int) (_headerfirst.getWidth()+_header.getWidth()));
 //BA.debugLineNum = 1024;BA.debugLine="internalPanel.Width = HeaderFirst.Width + Header";
_internalpanel.setWidth((int) (_headerfirst.getWidth()+_header.getWidth()));
 };
 //BA.debugLineNum = 1026;BA.debugLine="pnlFastScroll.Left = pnlTable.Width - pnlFastScro";
_pnlfastscroll.setLeft((int) (_pnltable.getWidth()-_pnlfastscroll.getWidth()));
 //BA.debugLineNum = 1027;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (_mfastscrollfixedlabel==__c.True) { 
 //BA.debugLineNum = 1028;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
_lblfastscroll.setTop((int) ((_sv2.getHeight()-_lblfastscroll.getHeight())/(double)2+_header.getHeight()));
 };
 //BA.debugLineNum = 1031;BA.debugLine="RefreshTable";
_refreshtable();
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
return "";
}
public String  _setfastscroll(boolean _fastscroll) throws Exception{
 //BA.debugLineNum = 4176;BA.debugLine="Public Sub setFastScroll (FastScroll As Boolean)";
 //BA.debugLineNum = 4177;BA.debugLine="mFastScroll = FastScroll";
_mfastscroll = _fastscroll;
 //BA.debugLineNum = 4178;BA.debugLine="pnlFastScroll.Visible = False";
_pnlfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 4179;BA.debugLine="lblFastScroll.Visible = False";
_lblfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 4180;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollcolumnindex(int _fastscrollcolumnindex) throws Exception{
 //BA.debugLineNum = 4200;BA.debugLine="Public Sub setFastScrollColumnIndex (FastScrollCol";
 //BA.debugLineNum = 4201;BA.debugLine="mFastScrollColumnIndex = Max(0, FastScrollColumnI";
_mfastscrollcolumnindex = (int) (__c.Max(0,_fastscrollcolumnindex));
 //BA.debugLineNum = 4202;BA.debugLine="mFastScrollColumnIndex = Min(mFastScrollColumnInd";
_mfastscrollcolumnindex = (int) (__c.Min(_mfastscrollcolumnindex,_mnumberofcolumns-1));
 //BA.debugLineNum = 4203;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollfixedlabel(boolean _fastscrollfixedlabel) throws Exception{
 //BA.debugLineNum = 4224;BA.debugLine="Public Sub setFastScrollFixedLabel (FastScrollFixe";
 //BA.debugLineNum = 4225;BA.debugLine="mFastScrollFixedLabel = FastScrollFixedLabel";
_mfastscrollfixedlabel = _fastscrollfixedlabel;
 //BA.debugLineNum = 4226;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (_mfastscrollfixedlabel==__c.False) { 
 //BA.debugLineNum = 4227;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
_lblfastscroll.setLeft((int) (_cwidth-_mfastscrolllabelwidth-_mfastscrolllabelwidth));
 //BA.debugLineNum = 4228;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
_lblfastscroll.setTop((int) (_pnlfastscrollcursor.getTop()+_fsclabeltopdelta));
 }else {
 //BA.debugLineNum = 4230;BA.debugLine="lblFastScroll.Left = 0";
_lblfastscroll.setLeft((int) (0));
 //BA.debugLineNum = 4231;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
_lblfastscroll.setTop((int) ((_sv2.getHeight()-_lblfastscroll.getHeight())/(double)2+_header.getHeight()));
 };
 //BA.debugLineNum = 4233;BA.debugLine="lblFastScroll.Visible = False";
_lblfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 4234;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelheight(int _height) throws Exception{
 //BA.debugLineNum = 4265;BA.debugLine="Public Sub setFastScrollLabelHeight(Height As Int)";
 //BA.debugLineNum = 4266;BA.debugLine="mFastScrollLabelHeight = Height";
_mfastscrolllabelheight = _height;
 //BA.debugLineNum = 4267;BA.debugLine="lblFastScroll.Height = mFastScrollLabelHeight";
_lblfastscroll.setHeight(_mfastscrolllabelheight);
 //BA.debugLineNum = 4268;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (_mfastscrollfixedlabel==__c.False) { 
 //BA.debugLineNum = 4269;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight -";
_fsclabeltopdelta = (int) (_sv2.getTop()+(_fsccursorheight-_mfastscrolllabelheight)/(double)2);
 //BA.debugLineNum = 4270;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
_lblfastscroll.setTop((int) (_pnlfastscrollcursor.getTop()+_fsclabeltopdelta));
 }else {
 //BA.debugLineNum = 4272;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
_lblfastscroll.setTop((int) ((_sv2.getHeight()-_lblfastscroll.getHeight())/(double)2+_header.getHeight()));
 };
 //BA.debugLineNum = 4274;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelmaxchars(int _fastscrolllabelmaxchars) throws Exception{
 //BA.debugLineNum = 4241;BA.debugLine="Public Sub setFastScrollLabelMaxChars(FastScrollLa";
 //BA.debugLineNum = 4242;BA.debugLine="mFastScrollLabelMaxChars = FastScrollLabelMaxChar";
_mfastscrolllabelmaxchars = _fastscrolllabelmaxchars;
 //BA.debugLineNum = 4243;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelwidth(int _width) throws Exception{
 //BA.debugLineNum = 4250;BA.debugLine="Public Sub setFastScrollLabelWidth(Width As Int)";
 //BA.debugLineNum = 4251;BA.debugLine="mFastScrollLabelWidth = Width";
_mfastscrolllabelwidth = _width;
 //BA.debugLineNum = 4252;BA.debugLine="lblFastScroll.Width = mFastScrollLabelWidth";
_lblfastscroll.setWidth(_mfastscrolllabelwidth);
 //BA.debugLineNum = 4253;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (_mfastscrollfixedlabel==__c.False) { 
 //BA.debugLineNum = 4254;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
_lblfastscroll.setLeft((int) (_cwidth-_mfastscrolllabelwidth-_mfastscrolllabelwidth));
 }else {
 //BA.debugLineNum = 4256;BA.debugLine="lblFastScroll.Left = 0";
_lblfastscroll.setLeft((int) (0));
 };
 //BA.debugLineNum = 4258;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollminitems(int _fastscrollminitems) throws Exception{
 //BA.debugLineNum = 4189;BA.debugLine="Public Sub setFastScrollMinItems (FastScrollMinIte";
 //BA.debugLineNum = 4190;BA.debugLine="mFastScrollMinItems = FastScrollMinItems";
_mfastscrollminitems = _fastscrollminitems;
 //BA.debugLineNum = 4191;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollshowlabel(boolean _fastscrollshowlabel) throws Exception{
 //BA.debugLineNum = 4212;BA.debugLine="Public Sub setFastScrollShowLabel (FastScrollShowL";
 //BA.debugLineNum = 4213;BA.debugLine="mFastScrollShowLabel = FastScrollShowLabel";
_mfastscrollshowlabel = _fastscrollshowlabel;
 //BA.debugLineNum = 4214;BA.debugLine="lblFastScroll.Visible = False";
_lblfastscroll.setVisible(__c.False);
 //BA.debugLineNum = 4215;BA.debugLine="End Sub";
return "";
}
public String  _setfirstcolumnfixed(boolean _firstcolumnfixed) throws Exception{
 //BA.debugLineNum = 4135;BA.debugLine="Public Sub setFirstColumnFixed(FirstColumnFixed As";
 //BA.debugLineNum = 4136;BA.debugLine="If FirstColumnFixed = True Then";
if (_firstcolumnfixed==__c.True) { 
 //BA.debugLineNum = 4137;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 4138;BA.debugLine="setNumberOfFixedColumns(1)";
_setnumberoffixedcolumns((int) (1));
 };
 }else {
 //BA.debugLineNum = 4141;BA.debugLine="If mNumberOfFixedColumns = 1 Then";
if (_mnumberoffixedcolumns==1) { 
 //BA.debugLineNum = 4142;BA.debugLine="setNumberOfFixedColumns(0)";
_setnumberoffixedcolumns((int) (0));
 };
 };
 //BA.debugLineNum = 4145;BA.debugLine="End Sub";
return "";
}
public String  _setheader(String[] _values) throws Exception{
int _col = 0;
int _left = 0;
int _change = 0;
int _w = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String[] _str = null;
int _j = 0;
 //BA.debugLineNum = 1490;BA.debugLine="Public Sub SetHeader(Values() As String)";
 //BA.debugLineNum = 1491;BA.debugLine="Dim col As Int";
_col = 0;
 //BA.debugLineNum = 1493;BA.debugLine="Header.RemoveAllViews";
_header.RemoveAllViews();
 //BA.debugLineNum = 1494;BA.debugLine="HeaderNames.Initialize2(Values)";
_headernames.Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
 //BA.debugLineNum = 1496;BA.debugLine="Dim Left = 0 As Int";
_left = (int) (0);
 //BA.debugLineNum = 1498;BA.debugLine="Dim Change = 0 As Int";
_change = (int) (0);
 //BA.debugLineNum = 1499;BA.debugLine="Dim w As Int";
_w = 0;
 //BA.debugLineNum = 1500;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
 //BA.debugLineNum = 1501;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 1502;BA.debugLine="lbl.Initialize(\"header\")";
_lbl.Initialize(ba,"header");
 //BA.debugLineNum = 1503;BA.debugLine="If HeaderMultiAlignments = False Then";
if (_headermultialignments==__c.False) { 
 //BA.debugLineNum = 1504;BA.debugLine="lbl.Gravity = cHeaderAlignment";
_lbl.setGravity(_cheaderalignment);
 }else {
 //BA.debugLineNum = 1506;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(_cheaderalignments[_col]);
 };
 //BA.debugLineNum = 1509;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (_headermultitypeface==__c.False) { 
 //BA.debugLineNum = 1510;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypeface.getObject()));
 }else {
 //BA.debugLineNum = 1512;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypefaces[_col].getObject()));
 };
 //BA.debugLineNum = 1515;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 //BA.debugLineNum = 1516;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
_setpadding((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 1518;BA.debugLine="If cUseColumnColors = False Or cHeaderTextColors";
if (_cusecolumncolors==__c.False || _cheadertextcolors.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 1519;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(_cheadercolor);
 //BA.debugLineNum = 1520;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(_cheadertextcolor);
 }else {
 //BA.debugLineNum = 1522;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(_cheadercolors[_col]);
 //BA.debugLineNum = 1523;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(_cheadertextcolors[_col]);
 };
 //BA.debugLineNum = 1526;BA.debugLine="lbl.Text = Values(col)";
_lbl.setText(BA.ObjectToCharSequence(_values[_col]));
 //BA.debugLineNum = 1527;BA.debugLine="lbl.Tag = col";
_lbl.setTag((Object)(_col));
 //BA.debugLineNum = 1529;BA.debugLine="w = Max(0, ColumnWidths(col) - cLineWidth)		' ne";
_w = (int) (__c.Max(0,_columnwidths[_col]-_clinewidth));
 //BA.debugLineNum = 1531;BA.debugLine="If mNumberOfFixedColumns > 0 And col < mNumberOf";
if (_mnumberoffixedcolumns>0 && _col<_mnumberoffixedcolumns) { 
 //BA.debugLineNum = 1532;BA.debugLine="HeaderFirst.AddView(lbl, Left, 0, w, cHeaderHei";
_headerfirst.AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,_cheaderheight);
 }else {
 //BA.debugLineNum = 1535;BA.debugLine="If col = mNumberOfFixedColumns Then";
if (_col==_mnumberoffixedcolumns) { 
 //BA.debugLineNum = 1536;BA.debugLine="Left = 0";
_left = (int) (0);
 };
 //BA.debugLineNum = 1538;BA.debugLine="Header.AddView(lbl, Left, 0, w, cHeaderHeight)";
_header.AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,_cheaderheight);
 };
 //BA.debugLineNum = 1542;BA.debugLine="If cAutomaticWidths = True Then";
if (_cautomaticwidths==__c.True) { 
 //BA.debugLineNum = 1543;BA.debugLine="If Values(col).Contains(CRLF) Then";
if (_values[_col].contains(__c.CRLF)) { 
 //BA.debugLineNum = 1544;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
 //BA.debugLineNum = 1545;BA.debugLine="Dim j As Int";
_j = 0;
 //BA.debugLineNum = 1546;BA.debugLine="str = Regex.Split(CRLF, Values(col))";
_str = __c.Regex.Split(__c.CRLF,_values[_col]);
 //BA.debugLineNum = 1547;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(str";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_str[(int) (0)],_lbl.getTypeface(),_ctextsize)+_extrawidth);
 //BA.debugLineNum = 1548;BA.debugLine="For j = 1 To str.Length - 1";
{
final int step46 = 1;
final int limit46 = (int) (_str.length-1);
_j = (int) (1) ;
for (;_j <= limit46 ;_j = _j + step46 ) {
 //BA.debugLineNum = 1549;BA.debugLine="HeaderWidths(col) = Max(HeaderWidths(col),cvs";
_headerwidths[_col] = (int) (__c.Max(_headerwidths[_col],_cvs.MeasureStringWidth(_str[_j],_lbl.getTypeface(),_ctextsize)+_extrawidth));
 }
};
 }else {
 //BA.debugLineNum = 1552;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Val";
_headerwidths[_col] = (int) (_cvs.MeasureStringWidth(_values[_col],_lbl.getTypeface(),_ctextsize)+_extrawidth);
 };
 //BA.debugLineNum = 1554;BA.debugLine="If HeaderWidths(col) > ColumnWidths(col) Then";
if (_headerwidths[_col]>_columnwidths[_col]) { 
 //BA.debugLineNum = 1555;BA.debugLine="Change = 1";
_change = (int) (1);
 //BA.debugLineNum = 1556;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Col";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_columnwidths[_col]));
 }else if(_columnwidths[_col]>_headerwidths[_col] && _columnwidths[_col]>_datawidths[_col]) { 
 //BA.debugLineNum = 1558;BA.debugLine="Change = 1";
_change = (int) (1);
 //BA.debugLineNum = 1559;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Dat";
_columnwidths[_col] = (int) (__c.Max(_headerwidths[_col],_datawidths[_col]));
 };
 };
 //BA.debugLineNum = 1562;BA.debugLine="Left = Left + ColumnWidths(col)";
_left = (int) (_left+_columnwidths[_col]);
 }
};
 //BA.debugLineNum = 1565;BA.debugLine="If Change = 1 Then";
if (_change==1) { 
 //BA.debugLineNum = 1566;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 };
 //BA.debugLineNum = 1568;BA.debugLine="Header.Left = - SV2.HorizontalScrollPosition + mF";
_header.setLeft((int) (-_sv2.getHorizontalScrollPosition()+_mfirstcolumnswidth));
 //BA.debugLineNum = 1569;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignment(int _alignment) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2622;BA.debugLine="Public Sub setHeaderAlignment(Alignment As Int)";
 //BA.debugLineNum = 2623;BA.debugLine="cHeaderAlignment = Alignment";
_cheaderalignment = _alignment;
 //BA.debugLineNum = 2625;BA.debugLine="If cHeaderAlignments.Length = 0 Then";
if (_cheaderalignments.length==0) { 
 //BA.debugLineNum = 2626;BA.debugLine="Private cHeaderAlignments(mNumberOfColumns) As I";
_cheaderalignments = new int[_mnumberofcolumns];
;
 };
 //BA.debugLineNum = 2629;BA.debugLine="Dim col As Int";
_col = 0;
 //BA.debugLineNum = 2630;BA.debugLine="HeaderMultiAlignments = False";
_headermultialignments = __c.False;
 //BA.debugLineNum = 2631;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 2632;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 2633;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit9 ;_col = _col + step9 ) {
 //BA.debugLineNum = 2634;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2635;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 2636;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }
};
 //BA.debugLineNum = 2638;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step14 = 1;
final int limit14 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit14 ;_col = _col + step14 ) {
 //BA.debugLineNum = 2639;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2640;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 2641;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }
};
 }else {
 //BA.debugLineNum = 2644;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step20 = 1;
final int limit20 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit20 ;_col = _col + step20 ) {
 //BA.debugLineNum = 2645;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2646;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 2647;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }
};
 };
 };
 //BA.debugLineNum = 2651;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignmentcoln(int _col,int _alignmentcoln) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2522;BA.debugLine="Public Sub SetHeaderAlignmentColN(Col As Int, Alig";
 //BA.debugLineNum = 2523;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 2525;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
 //BA.debugLineNum = 2526;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>_mnumberofcolumns-1) { 
 //BA.debugLineNum = 2527;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
 //BA.debugLineNum = 2528;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2531;BA.debugLine="If HeaderMultiAlignments = False Then";
if (_headermultialignments==__c.False) { 
 //BA.debugLineNum = 2532;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 2533;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 2534;BA.debugLine="cHeaderAlignments0(i) = cHeaderAlignment";
_cheaderalignments0[_i] = _cheaderalignment;
 }
};
 };
 //BA.debugLineNum = 2537;BA.debugLine="cHeaderAlignments0(Col) = AlignmentColN";
_cheaderalignments0[_col] = _alignmentcoln;
 //BA.debugLineNum = 2538;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
_cheaderalignments = _cheaderalignments0;
 //BA.debugLineNum = 2539;BA.debugLine="If Header.NumberOfViews > 0 Then";
if (_header.getNumberOfViews()>0) { 
 //BA.debugLineNum = 2540;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 2541;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2542;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 2543;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }else {
 //BA.debugLineNum = 2545;BA.debugLine="For i = 0 To mNumberOfFixedColumns - 1";
{
final int step21 = 1;
final int limit21 = (int) (_mnumberoffixedcolumns-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
 //BA.debugLineNum = 2546;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2547;BA.debugLine="If Col < mNumberOfFixedColumns Then";
if (_col<_mnumberoffixedcolumns) { 
 //BA.debugLineNum = 2548;BA.debugLine="lbl = HeaderFirst.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 2549;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }else {
 //BA.debugLineNum = 2551;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 2552;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col + mNumber";
_lbl.setGravity(_cheaderalignments[(int) (_col+_mnumberoffixedcolumns)]);
 };
 }
};
 };
 };
 //BA.debugLineNum = 2557;BA.debugLine="HeaderMultiAlignments = True";
_headermultialignments = __c.True;
 //BA.debugLineNum = 2558;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignments(int[] _alignments) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2485;BA.debugLine="Public Sub SetHeaderAlignments(Alignments() As Int";
 //BA.debugLineNum = 2486;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 2487;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
 //BA.debugLineNum = 2488;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 2491;BA.debugLine="Dim col As Int";
_col = 0;
 //BA.debugLineNum = 2492;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 2494;BA.debugLine="cHeaderAlignments0 = Alignments";
_cheaderalignments0 = _alignments;
 //BA.debugLineNum = 2495;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
_cheaderalignments = _cheaderalignments0;
 //BA.debugLineNum = 2496;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 2497;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 2498;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
 //BA.debugLineNum = 2499;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2500;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 2501;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }
};
 //BA.debugLineNum = 2503;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step16 = 1;
final int limit16 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit16 ;_col = _col + step16 ) {
 //BA.debugLineNum = 2504;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2505;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 2506;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }
};
 }else {
 //BA.debugLineNum = 2509;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step22 = 1;
final int limit22 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit22 ;_col = _col + step22 ) {
 //BA.debugLineNum = 2510;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2511;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 2512;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(_cheaderalignments[_col]);
 }
};
 };
 };
 //BA.debugLineNum = 2516;BA.debugLine="HeaderMultiAlignments = True";
_headermultialignments = __c.True;
 //BA.debugLineNum = 2517;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(int _color) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2700;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
 //BA.debugLineNum = 2701;BA.debugLine="Private col As Int";
_col = 0;
 //BA.debugLineNum = 2703;BA.debugLine="cHeaderColor = Color";
_cheadercolor = _color;
 //BA.debugLineNum = 2704;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 2705;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 2706;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
 //BA.debugLineNum = 2707;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2708;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 2709;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(_cheadercolor);
 }
};
 //BA.debugLineNum = 2711;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit10 ;_col = _col + step10 ) {
 //BA.debugLineNum = 2712;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2713;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 2714;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(_cheadercolor);
 }
};
 }else {
 //BA.debugLineNum = 2717;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
 //BA.debugLineNum = 2718;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2719;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 2720;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(_cheadercolor);
 }
};
 };
 };
 //BA.debugLineNum = 2724;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolors(int[] _headercolors) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 3612;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
 //BA.debugLineNum = 3613;BA.debugLine="Private col As Int";
_col = 0;
 //BA.debugLineNum = 3615;BA.debugLine="cHeaderColors = HeaderColors";
_cheadercolors = _headercolors;
 //BA.debugLineNum = 3616;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 3617;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 3618;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
 //BA.debugLineNum = 3619;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3620;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 3621;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(_cheadercolors[_col]);
 }
};
 //BA.debugLineNum = 3623;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit10 ;_col = _col + step10 ) {
 //BA.debugLineNum = 3624;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3625;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 3626;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(_cheadercolors[_col]);
 }
};
 }else {
 //BA.debugLineNum = 3629;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
 //BA.debugLineNum = 3630;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3631;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 3632;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(_cheadercolors[_col]);
 }
};
 };
 };
 //BA.debugLineNum = 3636;BA.debugLine="End Sub";
return "";
}
public String  _setheaderheight(int _height) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2658;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
 //BA.debugLineNum = 2659;BA.debugLine="cHeaderHeight = Height";
_cheaderheight = _height;
 //BA.debugLineNum = 2660;BA.debugLine="If Header.IsInitialized Then";
if (_header.IsInitialized()) { 
 //BA.debugLineNum = 2661;BA.debugLine="Header.Height = cHeaderHeight";
_header.setHeight(_cheaderheight);
 //BA.debugLineNum = 2662;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
_headerfirst.setHeight(_cheaderheight);
 //BA.debugLineNum = 2663;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 2664;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 2665;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
 //BA.debugLineNum = 2666;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2667;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 2668;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(_cheaderheight);
 }
};
 //BA.debugLineNum = 2670;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit12 ;_col = _col + step12 ) {
 //BA.debugLineNum = 2671;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2672;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 2673;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(_cheaderheight);
 }
};
 }else {
 //BA.debugLineNum = 2676;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
 //BA.debugLineNum = 2677;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2678;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 2679;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(_cheaderheight);
 }
};
 };
 };
 //BA.debugLineNum = 2683;BA.debugLine="SV2.Top = cHeaderHeight";
_sv2.setTop(_cheaderheight);
 //BA.debugLineNum = 2684;BA.debugLine="SVF.Top = cHeaderHeight";
_svf.setTop(_cheaderheight);
 //BA.debugLineNum = 2685;BA.debugLine="If cShowStatusLine = True Then";
if (_cshowstatusline==__c.True) { 
 //BA.debugLineNum = 2686;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight -";
_sv2.setHeight((int) (_pnltable.getHeight()-_cheaderheight-_cstatuslineheight));
 }else {
 //BA.debugLineNum = 2688;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight";
_sv2.setHeight((int) (_pnltable.getHeight()-_cheaderheight));
 };
 //BA.debugLineNum = 2690;BA.debugLine="SVF.Height = SV2.Height";
_svf.setHeight(_sv2.getHeight());
 //BA.debugLineNum = 2691;BA.debugLine="InitFastScroll";
_initfastscroll();
 };
 //BA.debugLineNum = 2693;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolor(int _color) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2731;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
 //BA.debugLineNum = 2732;BA.debugLine="Private col As Int";
_col = 0;
 //BA.debugLineNum = 2734;BA.debugLine="cHeaderTextColor = Color";
_cheadertextcolor = _color;
 //BA.debugLineNum = 2735;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 2736;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 2737;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
 //BA.debugLineNum = 2738;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2739;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 2740;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(_cheadertextcolor);
 }
};
 //BA.debugLineNum = 2742;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit10 ;_col = _col + step10 ) {
 //BA.debugLineNum = 2743;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2744;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 2745;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(_cheadertextcolor);
 }
};
 }else {
 //BA.debugLineNum = 2748;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
 //BA.debugLineNum = 2749;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2750;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 2751;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(_cheadertextcolor);
 }
};
 };
 };
 //BA.debugLineNum = 2755;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolors(int[] _headertextcolors) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 3643;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
 //BA.debugLineNum = 3644;BA.debugLine="Private col As Int";
_col = 0;
 //BA.debugLineNum = 3646;BA.debugLine="cHeaderTextColors = HeaderTextColors";
_cheadertextcolors = _headertextcolors;
 //BA.debugLineNum = 3647;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 3648;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 3649;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
 //BA.debugLineNum = 3650;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3651;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 3652;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(_cheadertextcolors[_col]);
 }
};
 //BA.debugLineNum = 3654;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit10 ;_col = _col + step10 ) {
 //BA.debugLineNum = 3655;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3656;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 3657;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(_cheadertextcolors[_col]);
 }
};
 }else {
 //BA.debugLineNum = 3660;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
 //BA.debugLineNum = 3661;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3662;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 3663;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(_cheadertextcolors[_col]);
 }
};
 };
 };
 //BA.debugLineNum = 3667;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypeface(anywheresoftware.b4a.keywords.constants.TypefaceWrapper _headertypeface) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 3674;BA.debugLine="Public Sub setHeaderTypeFace(HeaderTypeFace As Typ";
 //BA.debugLineNum = 3675;BA.debugLine="cHeaderTypeFace = HeaderTypeFace";
_cheadertypeface = _headertypeface;
 //BA.debugLineNum = 3676;BA.debugLine="HeaderMultiTypeFace = False";
_headermultitypeface = __c.False;
 //BA.debugLineNum = 3677;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 3678;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 3679;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
 //BA.debugLineNum = 3680;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3681;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 3682;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypeface.getObject()));
 }
};
 //BA.debugLineNum = 3684;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit10 ;_col = _col + step10 ) {
 //BA.debugLineNum = 3685;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3686;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 3687;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypeface.getObject()));
 }
};
 }else {
 //BA.debugLineNum = 3690;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
 //BA.debugLineNum = 3691;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3692;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 3693;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypeface.getObject()));
 }
};
 };
 };
 //BA.debugLineNum = 3697;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypefaces(anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _headertypefaces) throws Exception{
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 3700;BA.debugLine="Public Sub SetHeaderTypeFaces(HeaderTypeFaces() As";
 //BA.debugLineNum = 3701;BA.debugLine="Private col As Int";
_col = 0;
 //BA.debugLineNum = 3703;BA.debugLine="If HeaderTypeFaces.Length = 1 Then";
if (_headertypefaces.length==1) { 
 //BA.debugLineNum = 3704;BA.debugLine="cHeaderTypeFace = HeaderTypeFaces(0)";
_cheadertypeface = _headertypefaces[(int) (0)];
 //BA.debugLineNum = 3705;BA.debugLine="HeaderMultiTypeFace = False";
_headermultitypeface = __c.False;
 //BA.debugLineNum = 3706;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 3707;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 3708;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
 //BA.debugLineNum = 3709;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3710;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 3711;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypeface.getObject()));
 }
};
 //BA.debugLineNum = 3713;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit12 ;_col = _col + step12 ) {
 //BA.debugLineNum = 3714;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3715;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 3716;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypeface.getObject()));
 }
};
 }else {
 //BA.debugLineNum = 3719;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
 //BA.debugLineNum = 3720;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3721;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 3722;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypeface.getObject()));
 }
};
 };
 };
 }else {
 //BA.debugLineNum = 3727;BA.debugLine="If HeaderTypeFaces.Length <> mNumberOfColumns Th";
if (_headertypefaces.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 3728;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
 //BA.debugLineNum = 3729;BA.debugLine="Log(\"SetHeaderTypeFaces: Invalid number of colu";
__c.LogImpl("728180509","SetHeaderTypeFaces: Invalid number of columns",0);
 //BA.debugLineNum = 3730;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 3732;BA.debugLine="cHeaderTypeFaces0 = HeaderTypeFaces";
_cheadertypefaces0 = _headertypefaces;
 //BA.debugLineNum = 3733;BA.debugLine="cHeaderTypeFaces = cHeaderTypeFaces0";
_cheadertypefaces = _cheadertypefaces0;
 //BA.debugLineNum = 3734;BA.debugLine="HeaderMultiTypeFace = True";
_headermultitypeface = __c.True;
 //BA.debugLineNum = 3735;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numb";
if (_header.getNumberOfViews()>0 || _headerfirst.getNumberOfViews()>0) { 
 //BA.debugLineNum = 3736;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 3737;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step36 = 1;
final int limit36 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit36 ;_col = _col + step36 ) {
 //BA.debugLineNum = 3738;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3739;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 3740;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypefaces[_col].getObject()));
 }
};
 //BA.debugLineNum = 3742;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfC";
{
final int step41 = 1;
final int limit41 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit41 ;_col = _col + step41 ) {
 //BA.debugLineNum = 3743;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3744;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedCol";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 3745;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypefaces[_col].getObject()));
 }
};
 }else {
 //BA.debugLineNum = 3748;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step47 = 1;
final int limit47 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit47 ;_col = _col + step47 ) {
 //BA.debugLineNum = 3749;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3750;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 3751;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(_cheadertypefaces[_col].getObject()));
 }
};
 };
 };
 };
 };
 //BA.debugLineNum = 3757;BA.debugLine="End Sub";
return "";
}
public String  _setheight(int _height) throws Exception{
 //BA.debugLineNum = 2283;BA.debugLine="Public Sub setHeight(Height As Int)";
 //BA.debugLineNum = 2284;BA.debugLine="cHeight = Height";
_cheight = _height;
 //BA.debugLineNum = 2285;BA.debugLine="pnlTable.Height = Height";
_pnltable.setHeight(_height);
 //BA.debugLineNum = 2286;BA.debugLine="If (cShowStatusLine = True) Then";
if ((_cshowstatusline==__c.True)) { 
 //BA.debugLineNum = 2287;BA.debugLine="SVF.Height = Height - cStatusLineHeight - cHeade";
_svf.setHeight((int) (_height-_cstatuslineheight-_cheaderheight));
 //BA.debugLineNum = 2288;BA.debugLine="SV2.Height = Height - cStatusLineHeight - cHeade";
_sv2.setHeight((int) (_height-_cstatuslineheight-_cheaderheight));
 }else {
 //BA.debugLineNum = 2290;BA.debugLine="SVF.Height = Height - cHeaderHeight";
_svf.setHeight((int) (_height-_cheaderheight));
 //BA.debugLineNum = 2291;BA.debugLine="SV2.Height = Height - cHeaderHeight";
_sv2.setHeight((int) (_height-_cheaderheight));
 };
 //BA.debugLineNum = 2293;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
_lblstatusline.setTop((int) (_sv2.getTop()+_sv2.getHeight()));
 //BA.debugLineNum = 2294;BA.debugLine="SVF_ScrollChanged(0)";
_svf_scrollchanged((int) (0));
 //BA.debugLineNum = 2295;BA.debugLine="SV2_ScrollChanged(0, 0)";
_sv2_scrollchanged((int) (0),(int) (0));
 //BA.debugLineNum = 2296;BA.debugLine="InitFastScroll";
_initfastscroll();
 //BA.debugLineNum = 2298;BA.debugLine="updateIPLocation";
_updateiplocation();
 //BA.debugLineNum = 2299;BA.debugLine="End Sub";
return "";
}
public String  _setleft(int _left) throws Exception{
 //BA.debugLineNum = 2237;BA.debugLine="Public Sub setLeft(Left As Int)";
 //BA.debugLineNum = 2238;BA.debugLine="cLeft = Left";
_cleft = _left;
 //BA.debugLineNum = 2239;BA.debugLine="pnlTable.Left = Left";
_pnltable.setLeft(_left);
 //BA.debugLineNum = 2240;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(int _linewidth) throws Exception{
 //BA.debugLineNum = 2315;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
 //BA.debugLineNum = 2316;BA.debugLine="cLineWidth = LineWidth";
_clinewidth = _linewidth;
 //BA.debugLineNum = 2317;BA.debugLine="End Sub";
return "";
}
public String  _setmulticolumnsort(boolean _bdo) throws Exception{
 //BA.debugLineNum = 5022;BA.debugLine="Public Sub setMultiColumnSort(bDo As Boolean)";
 //BA.debugLineNum = 5023;BA.debugLine="mMultiColumnSort = bDo";
_mmulticolumnsort = _bdo;
 //BA.debugLineNum = 5024;BA.debugLine="End Sub";
return "";
}
public String  _setmultiselect(boolean _multiselect) throws Exception{
 //BA.debugLineNum = 2158;BA.debugLine="Public Sub setMultiSelect(MultiSelect As Boolean)";
 //BA.debugLineNum = 2159;BA.debugLine="clearSelection";
_clearselection();
 //BA.debugLineNum = 2160;BA.debugLine="mMultiSelect = MultiSelect";
_mmultiselect = _multiselect;
 //BA.debugLineNum = 2161;BA.debugLine="End Sub";
return "";
}
public String  _setnumberofcolumns(int _numberofcolumns) throws Exception{
int _col = 0;
 //BA.debugLineNum = 3979;BA.debugLine="Public Sub setNumberOfColumns (NumberOfColumns As";
 //BA.debugLineNum = 3980;BA.debugLine="mNumberOfColumns = NumberOfColumns";
_mnumberofcolumns = _numberofcolumns;
 //BA.debugLineNum = 3981;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
_innerclearall(_mnumberofcolumns,__c.True);
 //BA.debugLineNum = 3984;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3985;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3986;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3987;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[_mnumberofcolumns];
java.util.Arrays.fill(_ccolumndatatype,"");
 //BA.debugLineNum = 3988;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
 //BA.debugLineNum = 3989;BA.debugLine="ColumnWidths(col) = 130dip";
_columnwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3990;BA.debugLine="HeaderWidths(col) = 130dip";
_headerwidths[_col] = __c.DipToCurrent((int) (130));
 //BA.debugLineNum = 3991;BA.debugLine="DataWidths(col) = 130dip";
_datawidths[_col] = __c.DipToCurrent((int) (130));
 }
};
 //BA.debugLineNum = 3993;BA.debugLine="End Sub";
return "";
}
public String  _setnumberoffixedcolumns(int _numberoffixedcolumns) throws Exception{
int _col = 0;
String[] _headers = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
int _currentmax = 0;
int _row = 0;
 //BA.debugLineNum = 4071;BA.debugLine="Public Sub setNumberOfFixedColumns(NumberOfFixedCo";
 //BA.debugLineNum = 4072;BA.debugLine="NumberOfFixedColumns = Max(0, Min(3, NumberOfFixe";
_numberoffixedcolumns = (int) (__c.Max(0,__c.Min(3,_numberoffixedcolumns)));
 //BA.debugLineNum = 4073;BA.debugLine="If mNumberOfFixedColumns = NumberOfFixedColumns T";
if (_mnumberoffixedcolumns==_numberoffixedcolumns) { 
 //BA.debugLineNum = 4074;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 4077;BA.debugLine="If Header.NumberOfViews = 0 Then";
if (_header.getNumberOfViews()==0) { 
 //BA.debugLineNum = 4078;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns	'Ne";
_mnumberoffixedcolumns = _numberoffixedcolumns;
 }else {
 //BA.debugLineNum = 4080;BA.debugLine="Private col As Int";
_col = 0;
 //BA.debugLineNum = 4082;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[_mnumberofcolumns];
java.util.Arrays.fill(_headers,"");
 //BA.debugLineNum = 4083;BA.debugLine="If HeaderFirst.NumberOfViews = 0 Then";
if (_headerfirst.getNumberOfViews()==0) { 
 //BA.debugLineNum = 4084;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
 //BA.debugLineNum = 4085;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 4086;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_col).getObject()));
 //BA.debugLineNum = 4087;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 }else {
 //BA.debugLineNum = 4090;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (_mnumberoffixedcolumns-1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
 //BA.debugLineNum = 4091;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 4092;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_col).getObject()));
 //BA.debugLineNum = 4093;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 //BA.debugLineNum = 4095;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step22 = 1;
final int limit22 = (int) (_mnumberofcolumns-1);
_col = _mnumberoffixedcolumns ;
for (;_col <= limit22 ;_col = _col + step22 ) {
 //BA.debugLineNum = 4096;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 4097;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView((int) (_col-_mnumberoffixedcolumns)).getObject()));
 //BA.debugLineNum = 4098;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 };
 //BA.debugLineNum = 4102;BA.debugLine="HeaderFirst.RemoveAllViews";
_headerfirst.RemoveAllViews();
 //BA.debugLineNum = 4103;BA.debugLine="Header.RemoveAllViews";
_header.RemoveAllViews();
 //BA.debugLineNum = 4105;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns";
_mnumberoffixedcolumns = _numberoffixedcolumns;
 //BA.debugLineNum = 4107;BA.debugLine="innerClearAll(mNumberOfColumns, False)";
_innerclearall(_mnumberofcolumns,__c.False);
 //BA.debugLineNum = 4108;BA.debugLine="SetHeader(Headers)";
_setheader(_headers);
 //BA.debugLineNum = 4109;BA.debugLine="SetColumnsWidths(ColumnWidths)";
_setcolumnswidths(_columnwidths);
 //BA.debugLineNum = 4110;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
_sv2.getPanel().setHeight((int) (_data.getSize()*_crowheight));
 //BA.debugLineNum = 4111;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
_svf.getPanel().setHeight(_sv2.getPanel().getHeight());
 //BA.debugLineNum = 4114;BA.debugLine="Private currentMax As Int";
_currentmax = 0;
 //BA.debugLineNum = 4115;BA.debugLine="currentMax = Min(Data.Size - 1, SV2.Height / cRo";
_currentmax = (int) (__c.Min(_data.getSize()-1,_sv2.getHeight()/(double)_crowheight+30));
 //BA.debugLineNum = 4117;BA.debugLine="For row = 0 To currentMax";
{
final int step38 = 1;
final int limit38 = _currentmax;
_row = (int) (0) ;
for (;_row <= limit38 ;_row = _row + step38 ) {
 //BA.debugLineNum = 4118;BA.debugLine="ShowRow(row)";
_showrow(_row);
 }
};
 };
 //BA.debugLineNum = 4122;BA.debugLine="End Sub";
return "";
}
public String  _setpadding(anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
 //BA.debugLineNum = 3492;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
 //BA.debugLineNum = 3493;BA.debugLine="v.Padding = Array As Int (Left, Top, Right, Botto";
_v.setPadding(new int[]{_left,_top,_right,_bottom});
 //BA.debugLineNum = 3494;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor1(int _color) throws Exception{
 //BA.debugLineNum = 2762;BA.debugLine="Public Sub setRowColor1(Color As Int)";
 //BA.debugLineNum = 2763;BA.debugLine="cRowColor1 = Color";
_crowcolor1 = _color;
 //BA.debugLineNum = 2764;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2765;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
_innerclearall(_mnumberofcolumns,__c.True);
 };
 //BA.debugLineNum = 2767;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor2(int _color) throws Exception{
 //BA.debugLineNum = 2774;BA.debugLine="Public Sub setRowColor2(Color As Int)";
 //BA.debugLineNum = 2775;BA.debugLine="cRowColor2 = Color";
_crowcolor2 = _color;
 //BA.debugLineNum = 2776;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2777;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
_innerclearall(_mnumberofcolumns,__c.True);
 };
 //BA.debugLineNum = 2779;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolorn(int _row,int _color) throws Exception{
int _col = 0;
boolean _new = false;
Object[] _cdi = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw = null;
 //BA.debugLineNum = 2786;BA.debugLine="Public Sub SetRowColorN(Row As Int, Color As Int)";
 //BA.debugLineNum = 2787;BA.debugLine="Private col As Int";
_col = 0;
 //BA.debugLineNum = 2788;BA.debugLine="Private New = False As Boolean";
_new = __c.False;
 //BA.debugLineNum = 2789;BA.debugLine="If lstRowColors.IndexOf(Color) >= 0 Then";
if (_lstrowcolors.IndexOf((Object)(_color))>=0) { 
 //BA.debugLineNum = 2790;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.IndexOf";
_lstrowcolorindexes.Set(_row,(Object)(_lstrowcolors.IndexOf((Object)(_color))+2));
 }else {
 //BA.debugLineNum = 2792;BA.debugLine="lstRowColors.Add(Color)";
_lstrowcolors.Add((Object)(_color));
 //BA.debugLineNum = 2793;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.Size +";
_lstrowcolorindexes.Set(_row,(Object)(_lstrowcolors.getSize()+1));
 //BA.debugLineNum = 2794;BA.debugLine="New = True";
_new = __c.True;
 };
 //BA.debugLineNum = 2797;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 2798;BA.debugLine="Private cdi(mNumberOfColumns) As Object";
_cdi = new Object[_mnumberofcolumns];
{
int d0 = _cdi.length;
for (int i0 = 0;i0 < d0;i0++) {
_cdi[i0] = new Object();
}
}
;
 //BA.debugLineNum = 2799;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step12 = 1;
final int limit12 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit12 ;_col = _col + step12 ) {
 //BA.debugLineNum = 2800;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 2801;BA.debugLine="cdw.Initialize(Color, 0)";
_cdw.Initialize(_color,(int) (0));
 //BA.debugLineNum = 2802;BA.debugLine="cdi(col) = cdw";
_cdi[_col] = (Object)(_cdw.getObject());
 }
};
 //BA.debugLineNum = 2804;BA.debugLine="If New = False Then";
if (_new==__c.False) { 
 //BA.debugLineNum = 2805;BA.debugLine="lstRowDrawables.Set(lstRowColors.IndexOf(Color)";
_lstrowdrawables.Set(_lstrowcolors.IndexOf((Object)(_color)),(Object)(_cdi));
 }else {
 //BA.debugLineNum = 2807;BA.debugLine="lstRowDrawables.Add(cdi)";
_lstrowdrawables.Add((Object)(_cdi));
 };
 //BA.debugLineNum = 2812;BA.debugLine="RefreshLabels";
_refreshlabels();
 };
 //BA.debugLineNum = 2814;BA.debugLine="End Sub";
return "";
}
public String  _setrowheight(int _rowheight) throws Exception{
 //BA.debugLineNum = 2986;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
 //BA.debugLineNum = 2987;BA.debugLine="If cRowHeight = cHeaderHeight Then";
if (_crowheight==_cheaderheight) { 
 //BA.debugLineNum = 2988;BA.debugLine="setHeaderHeight(RowHeight)";
_setheaderheight(_rowheight);
 };
 //BA.debugLineNum = 2990;BA.debugLine="cRowHeight = RowHeight";
_crowheight = _rowheight;
 //BA.debugLineNum = 2991;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcellcolor(int _color) throws Exception{
 //BA.debugLineNum = 2856;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
 //BA.debugLineNum = 2857;BA.debugLine="cSelectedCellColor = Color";
_cselectedcellcolor = _color;
 //BA.debugLineNum = 2858;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2859;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
_innerclearall(_mnumberofcolumns,__c.True);
 };
 //BA.debugLineNum = 2861;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcelltextcolor(int _textcolor) throws Exception{
 //BA.debugLineNum = 2868;BA.debugLine="Public Sub setSelectedCellTextColor(TextColor As I";
 //BA.debugLineNum = 2869;BA.debugLine="cSelectedCellTextColor = TextColor";
_cselectedcelltextcolor = _textcolor;
 //BA.debugLineNum = 2870;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2871;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
_innerclearall(_mnumberofcolumns,__c.True);
 };
 //BA.debugLineNum = 2873;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowcolor(int _color) throws Exception{
 //BA.debugLineNum = 2832;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
 //BA.debugLineNum = 2833;BA.debugLine="cSelectedRowColor = Color";
_cselectedrowcolor = _color;
 //BA.debugLineNum = 2834;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2835;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
_innerclearall(_mnumberofcolumns,__c.True);
 };
 //BA.debugLineNum = 2837;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowtextcolor(int _textcolor) throws Exception{
 //BA.debugLineNum = 2844;BA.debugLine="Public Sub setSelectedRowTextColor(TextColor As In";
 //BA.debugLineNum = 2845;BA.debugLine="cSelectedRowTextColor = TextColor";
_cselectedrowtextcolor = _textcolor;
 //BA.debugLineNum = 2846;BA.debugLine="If pnlTable.IsInitialized Then";
if (_pnltable.IsInitialized()) { 
 //BA.debugLineNum = 2847;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
_innerclearall(_mnumberofcolumns,__c.True);
 };
 //BA.debugLineNum = 2849;BA.debugLine="End Sub";
return "";
}
public String  _setshowstatusline(boolean _showstatusline) throws Exception{
 //BA.debugLineNum = 3819;BA.debugLine="Public Sub setShowStatusLine(ShowStatusLine As Boo";
 //BA.debugLineNum = 3820;BA.debugLine="cShowStatusLine = ShowStatusLine";
_cshowstatusline = _showstatusline;
 //BA.debugLineNum = 3821;BA.debugLine="If cShowStatusLine = True Then";
if (_cshowstatusline==__c.True) { 
 //BA.debugLineNum = 3822;BA.debugLine="SV2.Height = cHeight - Header.Height - cStatusLi";
_sv2.setHeight((int) (_cheight-_header.getHeight()-_cstatuslineheight));
 //BA.debugLineNum = 3823;BA.debugLine="lblStatusLine.Visible = True";
_lblstatusline.setVisible(__c.True);
 }else {
 //BA.debugLineNum = 3825;BA.debugLine="SV2.Height = cHeight - Header.Height";
_sv2.setHeight((int) (_cheight-_header.getHeight()));
 //BA.debugLineNum = 3826;BA.debugLine="lblStatusLine.Visible = False";
_lblstatusline.setVisible(__c.False);
 };
 //BA.debugLineNum = 3828;BA.debugLine="SVF.Height = SV2.Height";
_svf.setHeight(_sv2.getHeight());
 //BA.debugLineNum = 3829;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (_mfastscrollfixedlabel==__c.True) { 
 //BA.debugLineNum = 3830;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
_lblfastscroll.setTop((int) ((_sv2.getHeight()-_lblfastscroll.getHeight())/(double)2+_header.getHeight()));
 };
 //BA.debugLineNum = 3832;BA.debugLine="InitFastScroll";
_initfastscroll();
 //BA.debugLineNum = 3833;BA.debugLine="End Sub";
return "";
}
public String  _setsingleline(boolean _singleline) throws Exception{
int _row = 0;
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 3764;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
 //BA.debugLineNum = 3766;BA.debugLine="Private row, col As Int";
_row = 0;
_col = 0;
 //BA.debugLineNum = 3767;BA.debugLine="cSingleLine = SingleLine";
_csingleline = _singleline;
 //BA.debugLineNum = 3769;BA.debugLine="If LabelsCache.Size > 0 Then";
if (_labelscache.getSize()>0) { 
 //BA.debugLineNum = 3770;BA.debugLine="For row = 0 To LabelsCache.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (_labelscache.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit4 ;_row = _row + step4 ) {
 //BA.debugLineNum = 3771;BA.debugLine="Private lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[_mnumberofcolumns];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 3772;BA.debugLine="lbls = LabelsCache.Get(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_labelscache.Get(_row));
 //BA.debugLineNum = 3773;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (_mnumberofcolumns-1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
 //BA.debugLineNum = 3774;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 3775;BA.debugLine="jo = lbls(col)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbls[_col].getObject()));
 //BA.debugLineNum = 3776;BA.debugLine="jo.RunMethod(\"setSingleLine\", Array(cSingleLin";
_jo.RunMethod("setSingleLine",new Object[]{(Object)(_csingleline)});
 }
};
 }
};
 };
 //BA.debugLineNum = 3781;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapcolor(int _color) throws Exception{
 //BA.debugLineNum = 4039;BA.debugLine="Public Sub setSortBitmapColor(Color As Int)";
 //BA.debugLineNum = 4040;BA.debugLine="cSortBitmapColor = Color";
_csortbitmapcolor = _color;
 //BA.debugLineNum = 4041;BA.debugLine="InitializeSortingBitmaps";
_initializesortingbitmaps();
 //BA.debugLineNum = 4042;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapwidth(int _width) throws Exception{
 //BA.debugLineNum = 4029;BA.debugLine="Public Sub setSortBitmapWidth(Width As Int)";
 //BA.debugLineNum = 4030;BA.debugLine="cSortBitmapWidth = Width";
_csortbitmapwidth = _width;
 //BA.debugLineNum = 4031;BA.debugLine="InitializeSortingBitmaps";
_initializesortingbitmaps();
 //BA.debugLineNum = 4032;BA.debugLine="End Sub";
return "";
}
public String  _setsortcaseinsensitive(boolean _bdo) throws Exception{
 //BA.debugLineNum = 5030;BA.debugLine="Public Sub setSortCaseInsensitive(bDo As Boolean)";
 //BA.debugLineNum = 5031;BA.debugLine="mSortCaseInsensitive = bDo";
_msortcaseinsensitive = _bdo;
 //BA.debugLineNum = 5032;BA.debugLine="End Sub";
return "";
}
public String  _setsortcolumn(boolean _sortcolumn) throws Exception{
 //BA.debugLineNum = 3497;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
 //BA.debugLineNum = 3498;BA.debugLine="cSortColumn = SortColumn";
_csortcolumn = _sortcolumn;
 //BA.debugLineNum = 3499;BA.debugLine="End Sub";
return "";
}
public String  _setsortingbitmaps(String _bitmapascfilename,String _bitmapdesfilename) throws Exception{
 //BA.debugLineNum = 4054;BA.debugLine="Public Sub SetSortingBitmaps(BitmapAscFilename As";
 //BA.debugLineNum = 4055;BA.debugLine="bmpAsc.Initialize(File.DirAssets, BitmapAscFilena";
_bmpasc.Initialize(__c.File.getDirAssets(),_bitmapascfilename);
 //BA.debugLineNum = 4056;BA.debugLine="bmpDes.Initialize(File.DirAssets, BitmapDesFilena";
_bmpdes.Initialize(__c.File.getDirAssets(),_bitmapdesfilename);
 //BA.debugLineNum = 4057;BA.debugLine="mCustomSortingBitmaps = True";
_mcustomsortingbitmaps = __c.True;
 //BA.debugLineNum = 4058;BA.debugLine="End Sub";
return "";
}
public String  _setsortremoveaccents(boolean _sortremoveaccents) throws Exception{
 //BA.debugLineNum = 4008;BA.debugLine="Public Sub setSortRemoveAccents(SortRemoveAccents";
 //BA.debugLineNum = 4009;BA.debugLine="cSortRemoveAccents = SortRemoveAccents";
_csortremoveaccents = _sortremoveaccents;
 //BA.debugLineNum = 4010;BA.debugLine="End Sub";
return "";
}
public String  _setstatusline(String _text) throws Exception{
 //BA.debugLineNum = 2210;BA.debugLine="Public Sub setStatusLine(Text As String)";
 //BA.debugLineNum = 2211;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
if ((_lblstatusline.IsInitialized())) { 
_lblstatusline.setText(BA.ObjectToCharSequence(_text));};
 //BA.debugLineNum = 2212;BA.debugLine="End Sub";
return "";
}
public String  _setstatuslineheight(int _statuslineheight) throws Exception{
 //BA.debugLineNum = 2998;BA.debugLine="Public Sub setStatusLineHeight(StatusLineHeight As";
 //BA.debugLineNum = 2999;BA.debugLine="cStatusLineHeight = StatusLineHeight";
_cstatuslineheight = _statuslineheight;
 //BA.debugLineNum = 3000;BA.debugLine="End Sub";
return "";
}
public String  _settablecolor(int _color) throws Exception{
 //BA.debugLineNum = 2880;BA.debugLine="Public Sub setTableColor(Color As Int)";
 //BA.debugLineNum = 2881;BA.debugLine="cTableColor = Color";
_ctablecolor = _color;
 //BA.debugLineNum = 2882;BA.debugLine="If SV2.IsInitialized = True Then";
if (_sv2.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 2883;BA.debugLine="SV2.Panel.Color = cTableColor";
_sv2.getPanel().setColor(_ctablecolor);
 //BA.debugLineNum = 2884;BA.debugLine="SVF.Panel.Color = cTableColor";
_svf.getPanel().setColor(_ctablecolor);
 //BA.debugLineNum = 2885;BA.debugLine="If Header.IsInitialized Then";
if (_header.IsInitialized()) { 
 //BA.debugLineNum = 2886;BA.debugLine="Header.Color = cTableColor";
_header.setColor(_ctablecolor);
 //BA.debugLineNum = 2887;BA.debugLine="HeaderFirst.Color = cTableColor";
_headerfirst.setColor(_ctablecolor);
 };
 };
 //BA.debugLineNum = 2890;BA.debugLine="End Sub";
return "";
}
public String  _settag(Object _tag) throws Exception{
 //BA.debugLineNum = 3914;BA.debugLine="Public Sub setTag(Tag As Object)";
 //BA.debugLineNum = 3915;BA.debugLine="pnlTable.Tag = Tag";
_pnltable.setTag(_tag);
 //BA.debugLineNum = 3916;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(int _color) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2897;BA.debugLine="Public Sub setTextColor(Color As Int)";
 //BA.debugLineNum = 2898;BA.debugLine="cTextColor = Color";
_ctextcolor = _color;
 //BA.debugLineNum = 2899;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 2900;BA.debugLine="If SV2.IsInitialized = True Then";
if (_sv2.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 2901;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2902;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (_sv2.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 2903;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2904;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_sv2.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 2905;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(_ctextcolor);
 }
};
 };
 }else {
 //BA.debugLineNum = 2909;BA.debugLine="If SV2.IsInitialized = True Then";
if (_sv2.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 2910;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2911;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step14 = 1;
final int limit14 = (int) (_svf.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 2912;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2913;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_svf.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 2914;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(_ctextcolor);
 }
};
 //BA.debugLineNum = 2916;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2917;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (_sv2.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 2918;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2919;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_sv2.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 2920;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(_ctextcolor);
 }
};
 };
 };
 //BA.debugLineNum = 2924;BA.debugLine="End Sub";
return "";
}
public String  _settextcolors(int[] _textcolors) throws Exception{
int _i = 0;
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 3569;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
 //BA.debugLineNum = 3570;BA.debugLine="cTextColors = TextColors";
_ctextcolors = _textcolors;
 //BA.debugLineNum = 3571;BA.debugLine="If cTextColors.Length = 1 Then";
if (_ctextcolors.length==1) { 
 //BA.debugLineNum = 3572;BA.debugLine="MultiTextColors = False";
_multitextcolors = __c.False;
 //BA.debugLineNum = 3573;BA.debugLine="setTextColor(cTextColors(0))";
_settextcolor(_ctextcolors[(int) (0)]);
 //BA.debugLineNum = 3574;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 3576;BA.debugLine="MultiTextColors = True";
_multitextcolors = __c.True;
 };
 //BA.debugLineNum = 3578;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 3579;BA.debugLine="If SV2.IsInitialized = True Then";
if (_sv2.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 3580;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
 //BA.debugLineNum = 3581;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (_sv2.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 3582;BA.debugLine="col = i Mod mNumberOfColumns";
_col = (int) (_i%_mnumberofcolumns);
 //BA.debugLineNum = 3583;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3584;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_sv2.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 3585;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(_ctextcolors[_col]);
 }
};
 };
 }else {
 //BA.debugLineNum = 3589;BA.debugLine="If SV2.IsInitialized = True Then";
if (_sv2.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 3590;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
 //BA.debugLineNum = 3591;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step22 = 1;
final int limit22 = (int) (_svf.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
 //BA.debugLineNum = 3592;BA.debugLine="col = i Mod mNumberOfFixedColumns";
_col = (int) (_i%_mnumberoffixedcolumns);
 //BA.debugLineNum = 3593;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3594;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_svf.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 3595;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(_ctextcolors[_col]);
 }
};
 //BA.debugLineNum = 3597;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step28 = 1;
final int limit28 = (int) (_sv2.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
 //BA.debugLineNum = 3598;BA.debugLine="col = i Mod (mNumberOfColumns - mNumberOfFixed";
_col = (int) (_i%(_mnumberofcolumns-_mnumberoffixedcolumns)+_mnumberoffixedcolumns);
 //BA.debugLineNum = 3599;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 3600;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_sv2.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 3601;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(_ctextcolors[_col]);
 }
};
 };
 };
 //BA.debugLineNum = 3605;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(float _size) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 2931;BA.debugLine="Public Sub setTextSize(Size As Float)";
 //BA.debugLineNum = 2932;BA.debugLine="cTextSize = Size";
_ctextsize = _size;
 //BA.debugLineNum = 2934;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 2936;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 2937;BA.debugLine="If Header.IsInitialized Then";
if (_header.IsInitialized()) { 
 //BA.debugLineNum = 2938;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (_header.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 2939;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2940;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_i).getObject()));
 //BA.debugLineNum = 2941;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 }
};
 };
 //BA.debugLineNum = 2945;BA.debugLine="If SV2.IsInitialized = True Then";
if (_sv2.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 2946;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (_sv2.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
 //BA.debugLineNum = 2947;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2948;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_sv2.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 2949;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 }
};
 };
 }else {
 //BA.debugLineNum = 2953;BA.debugLine="If Header.IsInitialized Then";
if (_header.IsInitialized()) { 
 //BA.debugLineNum = 2954;BA.debugLine="For i = 0 To HeaderFirst.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (_headerfirst.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
 //BA.debugLineNum = 2955;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2956;BA.debugLine="lbl = HeaderFirst.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_headerfirst.GetView(_i).getObject()));
 //BA.debugLineNum = 2957;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 }
};
 //BA.debugLineNum = 2959;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step25 = 1;
final int limit25 = (int) (_header.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 2960;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2961;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_header.GetView(_i).getObject()));
 //BA.debugLineNum = 2962;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 }
};
 };
 //BA.debugLineNum = 2966;BA.debugLine="If SV2.IsInitialized = True Then";
if (_sv2.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 2967;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step32 = 1;
final int limit32 = (int) (_svf.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
 //BA.debugLineNum = 2968;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2969;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_svf.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 2970;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 }
};
 //BA.debugLineNum = 2972;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step37 = 1;
final int limit37 = (int) (_sv2.getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
 //BA.debugLineNum = 2973;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 2974;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_sv2.getPanel().GetView(_i).getObject()));
 //BA.debugLineNum = 2975;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(_ctextsize);
 }
};
 };
 };
 //BA.debugLineNum = 2979;BA.debugLine="End Sub";
return "";
}
public String  _settop(int _top) throws Exception{
 //BA.debugLineNum = 2247;BA.debugLine="Public Sub setTop(Top As Int)";
 //BA.debugLineNum = 2248;BA.debugLine="cTop = Top";
_ctop = _top;
 //BA.debugLineNum = 2249;BA.debugLine="pnlTable.Top = Top";
_pnltable.setTop(_top);
 //BA.debugLineNum = 2250;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
 //BA.debugLineNum = 3013;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
 //BA.debugLineNum = 3014;BA.debugLine="If TypeFaces.Length = 1 Then";
if (_typefaces.length==1) { 
 //BA.debugLineNum = 3015;BA.debugLine="cTypeFace = TypeFaces(0)";
_ctypeface = _typefaces[(int) (0)];
 //BA.debugLineNum = 3016;BA.debugLine="MultiTypeFace = False";
_multitypeface = __c.False;
 }else {
 //BA.debugLineNum = 3018;BA.debugLine="If TypeFaces.Length <> mNumberOfColumns Then";
if (_typefaces.length!=_mnumberofcolumns) { 
 //BA.debugLineNum = 3019;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
 //BA.debugLineNum = 3020;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 3023;BA.debugLine="cTypeFaces0 = TypeFaces";
_ctypefaces0 = _typefaces;
 //BA.debugLineNum = 3024;BA.debugLine="cTypeFaces = cTypeFaces0";
_ctypefaces = _ctypefaces0;
 //BA.debugLineNum = 3025;BA.debugLine="MultiTypeFace = True";
_multitypeface = __c.True;
 };
 //BA.debugLineNum = 3028;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 3029;BA.debugLine="RefreshLabels";
_refreshlabels();
 };
 //BA.debugLineNum = 3031;BA.debugLine="End Sub";
return "";
}
public String  _setusecolumncolors(boolean _usecolumncolors) throws Exception{
int _i = 0;
 //BA.debugLineNum = 3506;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
 //BA.debugLineNum = 3507;BA.debugLine="cUseColumnColors = UseColumnColors";
_cusecolumncolors = _usecolumncolors;
 //BA.debugLineNum = 3508;BA.debugLine="If cColumnColors.Length = 0 Then";
if (_ccolumncolors.length==0) { 
 //BA.debugLineNum = 3509;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 3510;BA.debugLine="Dim cColumnColors(mNumberOfColumns) As Int";
_ccolumncolors = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3511;BA.debugLine="Dim cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3512;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 3513;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
 //BA.debugLineNum = 3514;BA.debugLine="cColumnColors(i) = cRowColor1";
_ccolumncolors[_i] = _crowcolor1;
 }else {
 //BA.debugLineNum = 3516;BA.debugLine="cColumnColors(i) = cRowColor2";
_ccolumncolors[_i] = _crowcolor2;
 };
 //BA.debugLineNum = 3518;BA.debugLine="cTextColors(i) = cTextColor";
_ctextcolors[_i] = _ctextcolor;
 }
};
 };
 //BA.debugLineNum = 3522;BA.debugLine="If cHeaderColors.Length = 0 Then";
if (_cheadercolors.length==0) { 
 //BA.debugLineNum = 3523;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 3524;BA.debugLine="Dim cHeaderColors(mNumberOfColumns) As Int";
_cheadercolors = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3525;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
 //BA.debugLineNum = 3526;BA.debugLine="cHeaderColors(i) = cHeaderColor";
_cheadercolors[_i] = _cheadercolor;
 }
};
 };
 //BA.debugLineNum = 3530;BA.debugLine="If cHeaderTextColors.Length = 0 Then";
if (_cheadertextcolors.length==0) { 
 //BA.debugLineNum = 3531;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 3532;BA.debugLine="Dim cHeaderTextColors(mNumberOfColumns) As Int";
_cheadertextcolors = new int[_mnumberofcolumns];
;
 //BA.debugLineNum = 3533;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (_mnumberofcolumns-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
 //BA.debugLineNum = 3534;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
_cheadertextcolors[_i] = _cheadertextcolor;
 }
};
 };
 //BA.debugLineNum = 3537;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(int _col,int _row,String _value) throws Exception{
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
 //BA.debugLineNum = 1615;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
 //BA.debugLineNum = 1616;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 1617;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(_data.Get(_row));
 //BA.debugLineNum = 1618;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
 //BA.debugLineNum = 1619;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (_visiblerows.ContainsKey((Object)(_row))) { 
 //BA.debugLineNum = 1620;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 1621;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(_visiblerows.Get((Object)(_row)));
 //BA.debugLineNum = 1622;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
 //BA.debugLineNum = 1624;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 2306;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
 //BA.debugLineNum = 2307;BA.debugLine="pnlTable.Visible = Visible";
_pnltable.setVisible(_visible);
 //BA.debugLineNum = 2308;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(int _width) throws Exception{
 //BA.debugLineNum = 2257;BA.debugLine="Public Sub setWidth(Width As Int)";
 //BA.debugLineNum = 2258;BA.debugLine="cWidth = Width";
_cwidth = _width;
 //BA.debugLineNum = 2259;BA.debugLine="pnlTable.Width = Width";
_pnltable.setWidth(_width);
 //BA.debugLineNum = 2260;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (_mnumberoffixedcolumns==0) { 
 //BA.debugLineNum = 2261;BA.debugLine="SV2.Width = Width";
_sv2.setWidth(_width);
 }else {
 //BA.debugLineNum = 2263;BA.debugLine="SV2.Width = Width - SVF.Width";
_sv2.setWidth((int) (_width-_svf.getWidth()));
 };
 //BA.debugLineNum = 2266;BA.debugLine="updateIPLocation";
_updateiplocation();
 //BA.debugLineNum = 2267;BA.debugLine="End Sub";
return "";
}
public String  _setzeroselection(boolean _zeroselection) throws Exception{
 //BA.debugLineNum = 4063;BA.debugLine="Public Sub setZeroSelection(ZeroSelection As Boole";
 //BA.debugLineNum = 4064;BA.debugLine="mZeroSelection = ZeroSelection";
_mzeroselection = _zeroselection;
 //BA.debugLineNum = 4065;BA.debugLine="End Sub";
return "";
}
public String  _showheadersorting(int _col,int _dir) throws Exception{
int _l = 0;
int _t = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _view = null;
anywheresoftware.b4a.objects.PanelWrapper _parentview = null;
 //BA.debugLineNum = 2375;BA.debugLine="Public Sub showHeaderSorting(col As Int, dir As In";
 //BA.debugLineNum = 2378;BA.debugLine="Dim L As Int ' calculate left";
_l = 0;
 //BA.debugLineNum = 2379;BA.debugLine="Dim t As Int ' calculate top";
_t = 0;
 //BA.debugLineNum = 2380;BA.debugLine="Dim View As View";
_view = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
 //BA.debugLineNum = 2381;BA.debugLine="Dim ParentView As Panel";
_parentview = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 2383;BA.debugLine="pnlSortingView.RemoveView";
_pnlsortingview.RemoveView();
 //BA.debugLineNum = 2385;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (_mnumberoffixedcolumns>0) { 
 //BA.debugLineNum = 2386;BA.debugLine="If col < mNumberOfFixedColumns Then";
if (_col<_mnumberoffixedcolumns) { 
 //BA.debugLineNum = 2387;BA.debugLine="View = HeaderFirst.GetView(col)";
_view = _headerfirst.GetView(_col);
 //BA.debugLineNum = 2388;BA.debugLine="ParentView = HeaderFirst";
_parentview = _headerfirst;
 }else {
 //BA.debugLineNum = 2390;BA.debugLine="View = Header.GetView(col - mNumberOfFixedColum";
_view = _header.GetView((int) (_col-_mnumberoffixedcolumns));
 //BA.debugLineNum = 2391;BA.debugLine="ParentView = Header";
_parentview = _header;
 };
 }else {
 //BA.debugLineNum = 2394;BA.debugLine="View = Header.GetView(col)";
_view = _header.GetView(_col);
 //BA.debugLineNum = 2395;BA.debugLine="ParentView = Header";
_parentview = _header;
 };
 //BA.debugLineNum = 2398;BA.debugLine="L = View.Left + View.Width - cSortBitmapWidth - 2";
_l = (int) (_view.getLeft()+_view.getWidth()-_csortbitmapwidth-__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 2400;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
if ((_dir==0)) { 
if (true) return "";};
 //BA.debugLineNum = 2402;BA.debugLine="Select Case dir";
switch (BA.switchObjectToInt(_dir,(int) (-1),(int) (1),(int) (2))) {
case 0: {
 //BA.debugLineNum = 2404;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpDes)";
_pnlsortingview.SetBackgroundImageNew((android.graphics.Bitmap)(_bmpdes.getObject()));
 //BA.debugLineNum = 2405;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-_csortbitmapheight-__c.DipToCurrent((int) (2)));
 break; }
case 1: {
 //BA.debugLineNum = 2407;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpAsc)";
_pnlsortingview.SetBackgroundImageNew((android.graphics.Bitmap)(_bmpasc.getObject()));
 //BA.debugLineNum = 2408;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-_csortbitmapheight-__c.DipToCurrent((int) (2)));
 break; }
case 2: {
 //BA.debugLineNum = 2410;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpEqual)";
_pnlsortingview.SetBackgroundImageNew((android.graphics.Bitmap)(_bmpequal.getObject()));
 //BA.debugLineNum = 2411;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-_csortbitmapheight-__c.DipToCurrent((int) (2)));
 break; }
}
;
 //BA.debugLineNum = 2414;BA.debugLine="ParentView.AddView(pnlSortingView, L, t, cSortBit";
_parentview.AddView((android.view.View)(_pnlsortingview.getObject()),_l,_t,_csortbitmapwidth,_csortbitmapheight);
 //BA.debugLineNum = 2416;BA.debugLine="End Sub";
return "";
}
public void  _showrow(int _row) throws Exception{
ResumableSub_ShowRow rsub = new ResumableSub_ShowRow(this,_row);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowRow extends BA.ResumableSub {
public ResumableSub_ShowRow(b4a.example.ef.table parent,int _row) {
this.parent = parent;
this._row = _row;
}
b4a.example.ef.table parent;
int _row;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
String[] _values = null;
Object[] _rowcolor = null;
int _txtcolor = 0;
int _i_1 = 0;
int step29;
int limit29;
int step53;
int limit53;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1303;BA.debugLine="Private i As Int";
_i = 0;
 //BA.debugLineNum = 1305;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._visiblerows.ContainsKey((Object)(_row))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1308;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
 //BA.debugLineNum = 1309;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
 //BA.debugLineNum = 1310;BA.debugLine="lbls = GetLabels(Row)";
_lbls = parent._getlabels(_row);
 //BA.debugLineNum = 1311;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(parent._data.Get(_row));
 //BA.debugLineNum = 1312;BA.debugLine="visibleRows.Put(Row, lbls)";
parent._visiblerows.Put((Object)(_row),(Object)(_lbls));
 //BA.debugLineNum = 1313;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
 //BA.debugLineNum = 1314;BA.debugLine="Private txtColor As Int";
_txtcolor = 0;
 //BA.debugLineNum = 1315;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
if (true) break;

case 7:
//if
this.state = 22;
if ((parent._selectedrows.IndexOf((Object)(_row))!=-1)) { 
this.state = 9;
}else if((double)(BA.ObjectToNumber(parent._lstrowcolorindexes.Get(_row)))>1) { 
this.state = 11;
}else if(parent._cusecolumncolors==parent.__c.True) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 22;
 //BA.debugLineNum = 1316;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = parent._selecteddrawable;
 //BA.debugLineNum = 1317;BA.debugLine="txtColor = cSelectedRowTextColor";
_txtcolor = parent._cselectedrowtextcolor;
 if (true) break;

case 11:
//C
this.state = 22;
 //BA.debugLineNum = 1319;BA.debugLine="rowColor = lstRowDrawables.Get(lstRowColorIndexe";
_rowcolor = (Object[])(parent._lstrowdrawables.Get((int) ((double)(BA.ObjectToNumber(parent._lstrowcolorindexes.Get(_row)))-2)));
 //BA.debugLineNum = 1321;BA.debugLine="txtColor = GetContrastColor(lstRowColors.Get(lst";
_txtcolor = parent._getcontrastcolor((int)(BA.ObjectToNumber(parent._lstrowcolors.Get((int) ((double)(BA.ObjectToNumber(parent._lstrowcolorindexes.Get(_row)))-2)))));
 if (true) break;

case 13:
//C
this.state = 22;
 //BA.debugLineNum = 1323;BA.debugLine="rowColor = ColumnDrawables";
_rowcolor = parent._columndrawables;
 //BA.debugLineNum = 1324;BA.debugLine="txtColor = cTextColor";
_txtcolor = parent._ctextcolor;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 1326;BA.debugLine="If Row Mod 2 = 0 Then";
if (true) break;

case 16:
//if
this.state = 21;
if (_row%2==0) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 1327;BA.debugLine="rowColor = Drawable1";
_rowcolor = parent._drawable1;
 //BA.debugLineNum = 1328;BA.debugLine="txtColor = cTextColor";
_txtcolor = parent._ctextcolor;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 1330;BA.debugLine="rowColor = Drawable2";
_rowcolor = parent._drawable2;
 //BA.debugLineNum = 1331;BA.debugLine="txtColor = cTextColor";
_txtcolor = parent._ctextcolor;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
;
 //BA.debugLineNum = 1334;BA.debugLine="If mNumberOfFixedColumns = 0 Then";

case 22:
//if
this.state = 100;
if (parent._mnumberoffixedcolumns==0) { 
this.state = 24;
}else {
this.state = 51;
}if (true) break;

case 24:
//C
this.state = 25;
 //BA.debugLineNum = 1335;BA.debugLine="For i = 0 To lbls.Length - 1";
if (true) break;

case 25:
//for
this.state = 49;
step29 = 1;
limit29 = (int) (_lbls.length-1);
_i = (int) (0) ;
this.state = 111;
if (true) break;

case 111:
//C
this.state = 49;
if ((step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29)) this.state = 27;
if (true) break;

case 112:
//C
this.state = 111;
_i = ((int)(0 + _i + step29)) ;
if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 1336;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
if (true) break;

case 28:
//if
this.state = 48;
if ((parent._header.GetView(_i).getWidth()>1)) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 1337;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(I).L";
parent._sv2.getPanel().AddView((android.view.View)(_lbls[_i].getObject()),parent._header.GetView(_i).getLeft(),(int) (_row*parent._crowheight),parent._header.GetView(_i).getWidth(),(int) (parent._crowheight-parent._clinewidth));
 //BA.debugLineNum = 1338;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
 //BA.debugLineNum = 1339;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 //BA.debugLineNum = 1340;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
if (true) break;

case 31:
//if
this.state = 42;
if (_i==parent._selectedcol && (parent._selectedrows.IndexOf((Object)(_row))!=-1)) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 42;
 //BA.debugLineNum = 1341;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(parent._cselectedcelltextcolor);
 //BA.debugLineNum = 1342;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(parent._selectedcelldrawable));
 if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 1344;BA.debugLine="If MultiTextColors = False Then";
if (true) break;

case 36:
//if
this.state = 41;
if (parent._multitextcolors==parent.__c.False) { 
this.state = 38;
}else {
this.state = 40;
}if (true) break;

case 38:
//C
this.state = 41;
 //BA.debugLineNum = 1345;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 40:
//C
this.state = 41;
 //BA.debugLineNum = 1347;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(parent._ctextcolors[_i]);
 if (true) break;

case 41:
//C
this.state = 42;
;
 //BA.debugLineNum = 1349;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
 //BA.debugLineNum = 1351;BA.debugLine="If MultiAlignments = False Then";

case 42:
//if
this.state = 47;
if (parent._multialignments==parent.__c.False) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 47;
 //BA.debugLineNum = 1352;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(parent._calignment);
 if (true) break;

case 46:
//C
this.state = 47;
 //BA.debugLineNum = 1354;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
_lbls[_i].setGravity(parent._calignments[_i]);
 if (true) break;

case 47:
//C
this.state = 48;
;
 if (true) break;

case 48:
//C
this.state = 112;
;
 if (true) break;
if (true) break;

case 49:
//C
this.state = 100;
;
 if (true) break;

case 51:
//C
this.state = 52;
 //BA.debugLineNum = 1359;BA.debugLine="For i = 0 To lbls.Length - 1";
if (true) break;

case 52:
//for
this.state = 99;
step53 = 1;
limit53 = (int) (_lbls.length-1);
_i = (int) (0) ;
this.state = 113;
if (true) break;

case 113:
//C
this.state = 99;
if ((step53 > 0 && _i <= limit53) || (step53 < 0 && _i >= limit53)) this.state = 54;
if (true) break;

case 114:
//C
this.state = 113;
_i = ((int)(0 + _i + step53)) ;
if (true) break;

case 54:
//C
this.state = 55;
 //BA.debugLineNum = 1360;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (true) break;

case 55:
//if
this.state = 98;
if (_i<parent._mnumberoffixedcolumns) { 
this.state = 57;
}else {
this.state = 76;
}if (true) break;

case 57:
//C
this.state = 58;
 //BA.debugLineNum = 1361;BA.debugLine="SVF.Panel.AddView(lbls(i), HeaderFirst.GetView";
parent._svf.getPanel().AddView((android.view.View)(_lbls[_i].getObject()),parent._headerfirst.GetView(_i).getLeft(),(int) (_row*parent._crowheight),parent._headerfirst.GetView(_i).getWidth(),(int) (parent._crowheight-parent._clinewidth));
 //BA.debugLineNum = 1362;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
 //BA.debugLineNum = 1363;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 //BA.debugLineNum = 1364;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
if (true) break;

case 58:
//if
this.state = 69;
if (_i==parent._selectedcol && (parent._selectedrows.IndexOf((Object)(_row))!=-1)) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 69;
 //BA.debugLineNum = 1365;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(parent._cselectedcelltextcolor);
 //BA.debugLineNum = 1366;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(parent._selectedcelldrawable));
 if (true) break;

case 62:
//C
this.state = 63;
 //BA.debugLineNum = 1368;BA.debugLine="If MultiTextColors = False Then";
if (true) break;

case 63:
//if
this.state = 68;
if (parent._multitextcolors==parent.__c.False) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
 //BA.debugLineNum = 1369;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 67:
//C
this.state = 68;
 //BA.debugLineNum = 1371;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(parent._ctextcolors[_i]);
 if (true) break;

case 68:
//C
this.state = 69;
;
 //BA.debugLineNum = 1373;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
 //BA.debugLineNum = 1375;BA.debugLine="If MultiAlignments = False Then";

case 69:
//if
this.state = 74;
if (parent._multialignments==parent.__c.False) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 74;
 //BA.debugLineNum = 1376;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(parent._calignment);
 if (true) break;

case 73:
//C
this.state = 74;
 //BA.debugLineNum = 1378;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
_lbls[_i].setGravity(parent._calignments[_i]);
 if (true) break;

case 74:
//C
this.state = 98;
;
 if (true) break;

case 76:
//C
this.state = 77;
 //BA.debugLineNum = 1381;BA.debugLine="Private i_1 As Int";
_i_1 = 0;
 //BA.debugLineNum = 1382;BA.debugLine="i_1 = i - mNumberOfFixedColumns";
_i_1 = (int) (_i-parent._mnumberoffixedcolumns);
 //BA.debugLineNum = 1383;BA.debugLine="If (Header.GetView(i_1).Width > 1 ) Then";
if (true) break;

case 77:
//if
this.state = 97;
if ((parent._header.GetView(_i_1).getWidth()>1)) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
 //BA.debugLineNum = 1384;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(i_1";
parent._sv2.getPanel().AddView((android.view.View)(_lbls[_i].getObject()),parent._header.GetView(_i_1).getLeft(),(int) (_row*parent._crowheight),parent._header.GetView(_i_1).getWidth(),(int) (parent._crowheight-parent._clinewidth));
 //BA.debugLineNum = 1385;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
 //BA.debugLineNum = 1386;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 //BA.debugLineNum = 1387;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(";
if (true) break;

case 80:
//if
this.state = 91;
if (_i==parent._selectedcol && (parent._selectedrows.IndexOf((Object)(_row))!=-1)) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 91;
 //BA.debugLineNum = 1388;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(parent._cselectedcelltextcolor);
 //BA.debugLineNum = 1389;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(parent._selectedcelldrawable));
 if (true) break;

case 84:
//C
this.state = 85;
 //BA.debugLineNum = 1391;BA.debugLine="If MultiTextColors = False Then";
if (true) break;

case 85:
//if
this.state = 90;
if (parent._multitextcolors==parent.__c.False) { 
this.state = 87;
}else {
this.state = 89;
}if (true) break;

case 87:
//C
this.state = 90;
 //BA.debugLineNum = 1392;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 89:
//C
this.state = 90;
 //BA.debugLineNum = 1394;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(parent._ctextcolors[_i]);
 if (true) break;

case 90:
//C
this.state = 91;
;
 //BA.debugLineNum = 1396;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
 //BA.debugLineNum = 1398;BA.debugLine="If MultiAlignments = False Then";

case 91:
//if
this.state = 96;
if (parent._multialignments==parent.__c.False) { 
this.state = 93;
}else {
this.state = 95;
}if (true) break;

case 93:
//C
this.state = 96;
 //BA.debugLineNum = 1399;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(parent._calignment);
 if (true) break;

case 95:
//C
this.state = 96;
 //BA.debugLineNum = 1401;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
_lbls[_i].setGravity(parent._calignments[_i]);
 if (true) break;

case 96:
//C
this.state = 97;
;
 if (true) break;

case 97:
//C
this.state = 98;
;
 if (true) break;

case 98:
//C
this.state = 114;
;
 if (true) break;
if (true) break;

case 99:
//C
this.state = 100;
;
 if (true) break;

case 100:
//C
this.state = 101;
;
 //BA.debugLineNum = 1409;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
parent._sv2.getPanel().setHeight((int) (parent._data.getSize()*parent._crowheight));
 //BA.debugLineNum = 1410;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
parent._svf.getPanel().setHeight(parent._sv2.getPanel().getHeight());
 //BA.debugLineNum = 1411;BA.debugLine="updateIPLocation";
parent._updateiplocation();
 //BA.debugLineNum = 1412;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if (true) break;

case 101:
//if
this.state = 106;
if ((parent._lblstatusline.IsInitialized() && parent._enablestatuslineautofill==parent.__c.True)) { 
this.state = 103;
;}if (true) break;

case 103:
//C
this.state = 106;
parent._setstatusline(BA.NumberToString(parent._data.getSize())+" rows");
if (true) break;

case 106:
//C
this.state = 107;
;
 //BA.debugLineNum = 1414;BA.debugLine="If SubExists(cCallBack, cEventName & \"_ShowRow\")";
if (true) break;

case 107:
//if
this.state = 110;
if (parent.__c.SubExists(ba,parent._ccallback,parent._ceventname+"_ShowRow")) { 
this.state = 109;
}if (true) break;

case 109:
//C
this.state = 110;
 //BA.debugLineNum = 1415;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 115;
return;
case 115:
//C
this.state = 110;
;
 //BA.debugLineNum = 1416;BA.debugLine="CallSub3(cCallBack, cEventName & \"_ShowRow\", Row";
parent.__c.CallSubNew3(ba,parent._ccallback,parent._ceventname+"_ShowRow",(Object)(_row),(Object)(_lbls));
 if (true) break;

case 110:
//C
this.state = -1;
;
 //BA.debugLineNum = 1418;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _snapshot() throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpsnapshot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnltable = null;
 //BA.debugLineNum = 4276;BA.debugLine="Public Sub SnapShot As Bitmap";
 //BA.debugLineNum = 4277;BA.debugLine="Private bmpSnapshot As Bitmap";
_bmpsnapshot = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 4278;BA.debugLine="Private xpnlTable As B4XView";
_xpnltable = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4280;BA.debugLine="xpnlTable = pnlTable";
_xpnltable = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pnltable.getObject()));
 //BA.debugLineNum = 4281;BA.debugLine="bmpSnapshot = xpnlTable.Snapshot";
_bmpsnapshot = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_xpnltable.Snapshot().getObject()));
 //BA.debugLineNum = 4283;BA.debugLine="Return bmpSnapshot";
if (true) return _bmpsnapshot;
 //BA.debugLineNum = 4284;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomdoubleidx(double[] _arrdouble,boolean _bascending,int _istart,int _iend) throws Exception{
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
int[] _arrindex = null;
Object _ovalue = null;
 //BA.debugLineNum = 4614;BA.debugLine="Sub SortOMDoubleIDX(arrDouble() As Double, bAscend";
 //BA.debugLineNum = 4616;BA.debugLine="Dim i As Long";
_i = 0L;
 //BA.debugLineNum = 4617;BA.debugLine="Dim c As Long";
_c = 0L;
 //BA.debugLineNum = 4618;BA.debugLine="Dim n As Long";
_n = 0L;
 //BA.debugLineNum = 4619;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
 //BA.debugLineNum = 4621;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (_check1ddoubleallsame(_arrdouble,_istart,_iend)) { 
 //BA.debugLineNum = 4622;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
 //BA.debugLineNum = 4623;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
 //BA.debugLineNum = 4624;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 //BA.debugLineNum = 4627;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (ba);
 //BA.debugLineNum = 4629;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4630;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
 //BA.debugLineNum = 4633;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4634;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
 //BA.debugLineNum = 4637;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
 //BA.debugLineNum = 4638;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4639;BA.debugLine="If B4XOM.ContainsKey(arrDouble(i)) Then";
if (_b4xom._containskey /*boolean*/ ((Object)(_arrdouble[(int) (_i)]))) { 
 //BA.debugLineNum = 4640;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ ((Object)(_arrdouble[(int) (_i)]))));
 }else {
 //BA.debugLineNum = 4642;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
 //BA.debugLineNum = 4644;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
 //BA.debugLineNum = 4645;BA.debugLine="B4XOM.Put(arrDouble(i), lstIndexes)";
_b4xom._put /*String*/ ((Object)(_arrdouble[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
 //BA.debugLineNum = 4648;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Sort(_bascending);
 //BA.debugLineNum = 4650;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
 //BA.debugLineNum = 4652;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
 //BA.debugLineNum = 4653;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
 //BA.debugLineNum = 4654;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
 //BA.debugLineNum = 4655;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
 //BA.debugLineNum = 4656;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
 //BA.debugLineNum = 4660;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
 //BA.debugLineNum = 4662;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomdoubleidx2(double[] _arrdouble,int[] _arrindex,boolean _bascending,int _istart,int _iend) throws Exception{
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
Object _ovalue = null;
 //BA.debugLineNum = 4664;BA.debugLine="Sub SortOMDoubleIDX2(arrDouble() As Double, arrInd";
 //BA.debugLineNum = 4666;BA.debugLine="Dim i As Long";
_i = 0L;
 //BA.debugLineNum = 4667;BA.debugLine="Dim c As Long";
_c = 0L;
 //BA.debugLineNum = 4668;BA.debugLine="Dim n As Long";
_n = 0L;
 //BA.debugLineNum = 4669;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
 //BA.debugLineNum = 4671;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (_check1ddoubleallsame(_arrdouble,_istart,_iend)) { 
 //BA.debugLineNum = 4672;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
 //BA.debugLineNum = 4673;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
 //BA.debugLineNum = 4674;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 //BA.debugLineNum = 4677;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (ba);
 //BA.debugLineNum = 4679;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4680;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
 //BA.debugLineNum = 4683;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4684;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
 //BA.debugLineNum = 4687;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
 //BA.debugLineNum = 4688;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4689;BA.debugLine="If B4XOM.ContainsKey(arrDouble(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ ((Object)(_arrdouble[_arrindex[(int) (_i)]]))) { 
 //BA.debugLineNum = 4690;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ ((Object)(_arrdouble[_arrindex[(int) (_i)]]))));
 }else {
 //BA.debugLineNum = 4692;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
 //BA.debugLineNum = 4694;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
 //BA.debugLineNum = 4695;BA.debugLine="B4XOM.Put(arrDouble(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ ((Object)(_arrdouble[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
 //BA.debugLineNum = 4698;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Sort(_bascending);
 //BA.debugLineNum = 4700;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
 //BA.debugLineNum = 4702;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
 //BA.debugLineNum = 4703;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
 //BA.debugLineNum = 4704;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
 //BA.debugLineNum = 4705;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
 //BA.debugLineNum = 4706;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
 //BA.debugLineNum = 4710;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 //BA.debugLineNum = 4712;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomlongidx(long[] _arrlong,boolean _bascending,int _istart,int _iend) throws Exception{
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
int[] _arrindex = null;
Object _ovalue = null;
 //BA.debugLineNum = 4456;BA.debugLine="Sub SortOMLongIDX(arrLong() As Long, bAscending As";
 //BA.debugLineNum = 4458;BA.debugLine="Dim i As Long";
_i = 0L;
 //BA.debugLineNum = 4459;BA.debugLine="Dim c As Long";
_c = 0L;
 //BA.debugLineNum = 4460;BA.debugLine="Dim n As Long";
_n = 0L;
 //BA.debugLineNum = 4461;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
 //BA.debugLineNum = 4463;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (_check1dlongallsame(_arrlong,_istart,_iend)) { 
 //BA.debugLineNum = 4464;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
 //BA.debugLineNum = 4465;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
 //BA.debugLineNum = 4466;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 //BA.debugLineNum = 4469;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (ba);
 //BA.debugLineNum = 4471;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4472;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
 //BA.debugLineNum = 4475;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4476;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
 //BA.debugLineNum = 4479;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
 //BA.debugLineNum = 4480;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4481;BA.debugLine="If B4XOM.ContainsKey(arrLong(i)) Then";
if (_b4xom._containskey /*boolean*/ ((Object)(_arrlong[(int) (_i)]))) { 
 //BA.debugLineNum = 4482;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ ((Object)(_arrlong[(int) (_i)]))));
 }else {
 //BA.debugLineNum = 4484;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
 //BA.debugLineNum = 4486;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
 //BA.debugLineNum = 4487;BA.debugLine="B4XOM.Put(arrLong(i), lstIndexes)";
_b4xom._put /*String*/ ((Object)(_arrlong[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
 //BA.debugLineNum = 4490;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Sort(_bascending);
 //BA.debugLineNum = 4492;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
 //BA.debugLineNum = 4494;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
 //BA.debugLineNum = 4495;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
 //BA.debugLineNum = 4496;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
 //BA.debugLineNum = 4497;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
 //BA.debugLineNum = 4498;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
 //BA.debugLineNum = 4502;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
 //BA.debugLineNum = 4504;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomlongidx2(long[] _arrlong,int[] _arrindex,boolean _bascending,int _istart,int _iend) throws Exception{
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
Object _ovalue = null;
 //BA.debugLineNum = 4535;BA.debugLine="Sub SortOMLongIDX2(arrLong() As Long, arrIndex() A";
 //BA.debugLineNum = 4537;BA.debugLine="Dim i As Long";
_i = 0L;
 //BA.debugLineNum = 4538;BA.debugLine="Dim c As Long";
_c = 0L;
 //BA.debugLineNum = 4539;BA.debugLine="Dim n As Long";
_n = 0L;
 //BA.debugLineNum = 4540;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
 //BA.debugLineNum = 4542;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (_check1dlongallsame(_arrlong,_istart,_iend)) { 
 //BA.debugLineNum = 4543;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
 //BA.debugLineNum = 4544;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
 //BA.debugLineNum = 4545;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 //BA.debugLineNum = 4548;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (ba);
 //BA.debugLineNum = 4550;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4551;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
 //BA.debugLineNum = 4554;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4555;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
 //BA.debugLineNum = 4558;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
 //BA.debugLineNum = 4559;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4560;BA.debugLine="If B4XOM.ContainsKey(arrLong(arrIndex(i))) Then";
if (_b4xom._containskey /*boolean*/ ((Object)(_arrlong[_arrindex[(int) (_i)]]))) { 
 //BA.debugLineNum = 4561;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ ((Object)(_arrlong[_arrindex[(int) (_i)]]))));
 }else {
 //BA.debugLineNum = 4563;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
 //BA.debugLineNum = 4565;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
 //BA.debugLineNum = 4566;BA.debugLine="B4XOM.Put(arrLong(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ ((Object)(_arrlong[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
 //BA.debugLineNum = 4569;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Sort(_bascending);
 //BA.debugLineNum = 4571;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
 //BA.debugLineNum = 4573;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
 //BA.debugLineNum = 4574;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
 //BA.debugLineNum = 4575;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
 //BA.debugLineNum = 4576;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
 //BA.debugLineNum = 4577;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
 //BA.debugLineNum = 4581;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 //BA.debugLineNum = 4583;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomstringidx(String[] _arrstring,boolean _bascending,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
int[] _arrindex = null;
Object _ovalue = null;
 //BA.debugLineNum = 4714;BA.debugLine="Sub SortOMStringIDX(arrString() As String, bAscend";
 //BA.debugLineNum = 4716;BA.debugLine="Dim i As Long";
_i = 0L;
 //BA.debugLineNum = 4717;BA.debugLine="Dim c As Long";
_c = 0L;
 //BA.debugLineNum = 4718;BA.debugLine="Dim n As Long";
_n = 0L;
 //BA.debugLineNum = 4719;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
 //BA.debugLineNum = 4721;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (_check1dstringallsame(_arrstring,_bcaseinsensitive,_istart,_iend)) { 
 //BA.debugLineNum = 4722;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
 //BA.debugLineNum = 4723;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
 //BA.debugLineNum = 4724;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 //BA.debugLineNum = 4727;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (ba);
 //BA.debugLineNum = 4729;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4730;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
 //BA.debugLineNum = 4733;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4734;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
 //BA.debugLineNum = 4737;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
 //BA.debugLineNum = 4738;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4739;BA.debugLine="If B4XOM.ContainsKey(arrString(i)) Then";
if (_b4xom._containskey /*boolean*/ ((Object)(_arrstring[(int) (_i)]))) { 
 //BA.debugLineNum = 4740;BA.debugLine="lstIndexes = B4XOM.Get(arrString(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ ((Object)(_arrstring[(int) (_i)]))));
 }else {
 //BA.debugLineNum = 4742;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
 //BA.debugLineNum = 4744;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
 //BA.debugLineNum = 4745;BA.debugLine="B4XOM.Put(arrString(i), lstIndexes)";
_b4xom._put /*String*/ ((Object)(_arrstring[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
 //BA.debugLineNum = 4748;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
 //BA.debugLineNum = 4749;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().SortCaseInsensitive(_bascending);
 }else {
 //BA.debugLineNum = 4751;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Sort(_bascending);
 };
 //BA.debugLineNum = 4754;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
 //BA.debugLineNum = 4756;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
 //BA.debugLineNum = 4757;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
 //BA.debugLineNum = 4758;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
 //BA.debugLineNum = 4759;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
 //BA.debugLineNum = 4760;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
 //BA.debugLineNum = 4764;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
 //BA.debugLineNum = 4766;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomstringidx2(String[] _arrstring,int[] _arrindex,boolean _bascending,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
Object _ovalue = null;
 //BA.debugLineNum = 4805;BA.debugLine="Sub SortOMStringIDX2(arrString() As String, arrInd";
 //BA.debugLineNum = 4807;BA.debugLine="Dim i As Long";
_i = 0L;
 //BA.debugLineNum = 4808;BA.debugLine="Dim c As Long";
_c = 0L;
 //BA.debugLineNum = 4809;BA.debugLine="Dim n As Long";
_n = 0L;
 //BA.debugLineNum = 4810;BA.debugLine="Dim B4XOM As B4XOrderedMap 'this needs the B4XCol";
_b4xom = new b4a.example.ef.b4xorderedmap();
 //BA.debugLineNum = 4812;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (_check1dstringallsame(_arrstring,_bcaseinsensitive,_istart,_iend)) { 
 //BA.debugLineNum = 4813;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
 //BA.debugLineNum = 4814;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
 //BA.debugLineNum = 4815;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 //BA.debugLineNum = 4818;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (ba);
 //BA.debugLineNum = 4820;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
 //BA.debugLineNum = 4821;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
 //BA.debugLineNum = 4824;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
 //BA.debugLineNum = 4825;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
 //BA.debugLineNum = 4828;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
 //BA.debugLineNum = 4829;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4830;BA.debugLine="If B4XOM.ContainsKey(arrString(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ ((Object)(_arrstring[_arrindex[(int) (_i)]]))) { 
 //BA.debugLineNum = 4831;BA.debugLine="lstIndexes = B4XOM.Get(arrString(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ ((Object)(_arrstring[_arrindex[(int) (_i)]]))));
 }else {
 //BA.debugLineNum = 4833;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
 //BA.debugLineNum = 4835;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
 //BA.debugLineNum = 4836;BA.debugLine="B4XOM.Put(arrString(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ ((Object)(_arrstring[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
 //BA.debugLineNum = 4839;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
 //BA.debugLineNum = 4840;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().SortCaseInsensitive(_bascending);
 }else {
 //BA.debugLineNum = 4842;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ().Sort(_bascending);
 };
 //BA.debugLineNum = 4845;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
 //BA.debugLineNum = 4847;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
 //BA.debugLineNum = 4848;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
 //BA.debugLineNum = 4849;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
 //BA.debugLineNum = 4850;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
 //BA.debugLineNum = 4851;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
 //BA.debugLineNum = 4855;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 //BA.debugLineNum = 4857;BA.debugLine="End Sub";
return null;
}
public boolean  _sorttable2(int _col,boolean _bascending) throws Exception{
int _i = 0;
int _iub = 0;
String[] _arrrow = null;
boolean _bdomulticolumnsort = false;
boolean _bvalidarrsortindex = false;
boolean _bsorted = false;
 //BA.debugLineNum = 4289;BA.debugLine="Public Sub SortTable2(Col As Int, bAscending As Bo";
 //BA.debugLineNum = 4291;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 4292;BA.debugLine="Dim iUB As Int";
_iub = 0;
 //BA.debugLineNum = 4293;BA.debugLine="Dim arrRow() As String";
_arrrow = new String[(int) (0)];
java.util.Arrays.fill(_arrrow,"");
 //BA.debugLineNum = 4294;BA.debugLine="Dim bDoMultiColumnSort As Boolean";
_bdomulticolumnsort = false;
 //BA.debugLineNum = 4295;BA.debugLine="Dim bValidArrSortIndex As Boolean";
_bvalidarrsortindex = false;
 //BA.debugLineNum = 4296;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
 //BA.debugLineNum = 4298;BA.debugLine="If Col <> iPreviousSortColumn Then";
if (_col!=_iprevioussortcolumn) { 
 //BA.debugLineNum = 4299;BA.debugLine="iPreviousSortColumn = Col";
_iprevioussortcolumn = _col;
 //BA.debugLineNum = 4300;BA.debugLine="arrDataSorted(Col) = False";
_arrdatasorted[_col] = __c.False;
 };
 //BA.debugLineNum = 4303;BA.debugLine="iUB = Data.Size - 1";
_iub = (int) (_data.getSize()-1);
 //BA.debugLineNum = 4310;BA.debugLine="If bDataTempDone = False Then";
if (_bdatatempdone==__c.False) { 
 //BA.debugLineNum = 4311;BA.debugLine="DataTemp.Initialize";
_datatemp.Initialize();
 //BA.debugLineNum = 4312;BA.debugLine="For i = 0 To iUB";
{
final int step14 = 1;
final int limit14 = _iub;
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 4313;BA.debugLine="DataTemp.Add(Data.Get(i))";
_datatemp.Add(_data.Get(_i));
 }
};
 //BA.debugLineNum = 4315;BA.debugLine="bDataTempDone = True";
_bdatatempdone = __c.True;
 };
 //BA.debugLineNum = 4321;BA.debugLine="If arrDataSorted(Col) = False Then";
if (_arrdatasorted[_col]==__c.False) { 
 //BA.debugLineNum = 4322;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("731391777","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+_ccolumndatatype[_col],0);
 //BA.debugLineNum = 4323;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(_ccolumndatatype[_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
 //BA.debugLineNum = 4325;BA.debugLine="Dim arrColLong(Data.Size) As Long";
_arrcollong = new long[_data.getSize()];
;
 //BA.debugLineNum = 4326;BA.debugLine="For i = 0 To iUB";
{
final int step24 = 1;
final int limit24 = _iub;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 4327;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(_datatemp.Get(_i));
 //BA.debugLineNum = 4328;BA.debugLine="Try";
try { //BA.debugLineNum = 4329;BA.debugLine="arrColLong(i) = arrRow(Col)";
_arrcollong[_i] = (long)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e29) {
			ba.setLastException(e29); };
 }
};
 break; }
case 2: {
 //BA.debugLineNum = 4335;BA.debugLine="Dim arrColDouble(Data.Size) As Double";
_arrcoldouble = new double[_data.getSize()];
;
 //BA.debugLineNum = 4336;BA.debugLine="For i = 0 To iUB";
{
final int step33 = 1;
final int limit33 = _iub;
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
 //BA.debugLineNum = 4337;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(_datatemp.Get(_i));
 //BA.debugLineNum = 4338;BA.debugLine="Try";
try { //BA.debugLineNum = 4339;BA.debugLine="arrColDouble(i) = arrRow(Col)";
_arrcoldouble[_i] = (double)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e38) {
			ba.setLastException(e38); };
 }
};
 break; }
case 3: {
 //BA.debugLineNum = 4345;BA.debugLine="Dim arrColString(Data.size) As String";
_arrcolstring = new String[_data.getSize()];
java.util.Arrays.fill(_arrcolstring,"");
 //BA.debugLineNum = 4346;BA.debugLine="For i = 0 To iUB";
{
final int step42 = 1;
final int limit42 = _iub;
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
 //BA.debugLineNum = 4347;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(_datatemp.Get(_i));
 //BA.debugLineNum = 4348;BA.debugLine="Try";
try { //BA.debugLineNum = 4349;BA.debugLine="arrColString(i) = arrRow(Col)";
_arrcolstring[_i] = _arrrow[_col];
 } 
       catch (Exception e47) {
			ba.setLastException(e47); };
 }
};
 break; }
case 4: 
case 5: {
 break; }
}
;
 };
 //BA.debugLineNum = 4361;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = _arrsortindex.length>0 && _arrsortindex[(int) (0)]>-1;
 //BA.debugLineNum = 4362;BA.debugLine="bDoMultiColumnSort = mMultiColumnSort And bValidA";
_bdomulticolumnsort = _mmulticolumnsort && _bvalidarrsortindex && _mnumberofcolumns>1;
 //BA.debugLineNum = 4367;BA.debugLine="If arrDataSorted(Col) = False Then";
if (_arrdatasorted[_col]==__c.False) { 
 //BA.debugLineNum = 4368;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("731391823","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+_ccolumndatatype[_col],0);
 //BA.debugLineNum = 4369;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(_ccolumndatatype[_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
 //BA.debugLineNum = 4372;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
 //BA.debugLineNum = 4373;BA.debugLine="arrSortIndex = SortOMLongIDX2(arrColLong, arr";
_arrsortindex = _sortomlongidx2(_arrcollong,_arrsortindex,__c.True,(int) (-1),(int) (-1));
 }else {
 //BA.debugLineNum = 4375;BA.debugLine="arrSortIndex = SortOMLongIDX(arrColLong, True";
_arrsortindex = _sortomlongidx(_arrcollong,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 2: {
 //BA.debugLineNum = 4379;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
 //BA.debugLineNum = 4380;BA.debugLine="arrSortIndex = SortOMDoubleIDX2(arrColDouble,";
_arrsortindex = _sortomdoubleidx2(_arrcoldouble,_arrsortindex,__c.True,(int) (-1),(int) (-1));
 }else {
 //BA.debugLineNum = 4382;BA.debugLine="arrSortIndex = SortOMDoubleIDX(arrColDouble,";
_arrsortindex = _sortomdoubleidx(_arrcoldouble,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 3: {
 //BA.debugLineNum = 4386;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
 //BA.debugLineNum = 4387;BA.debugLine="arrSortIndex = SortOMStringIDX2(arrColString,";
_arrsortindex = _sortomstringidx2(_arrcolstring,_arrsortindex,__c.True,_msortcaseinsensitive,(int) (-1),(int) (-1));
 }else {
 //BA.debugLineNum = 4389;BA.debugLine="arrSortIndex = SortOMStringIDX(arrColString,";
_arrsortindex = _sortomstringidx(_arrcolstring,__c.True,_msortcaseinsensitive,(int) (-1),(int) (-1));
 };
 break; }
case 4: 
case 5: {
 //BA.debugLineNum = 4393;BA.debugLine="Dim arrSortIndex(1) As Int";
_arrsortindex = new int[(int) (1)];
;
 //BA.debugLineNum = 4394;BA.debugLine="arrSortIndex(0) = -1";
_arrsortindex[(int) (0)] = (int) (-1);
 break; }
}
;
 //BA.debugLineNum = 4397;BA.debugLine="arrDataSorted(Col) = True";
_arrdatasorted[_col] = __c.True;
 //BA.debugLineNum = 4398;BA.debugLine="mapSortingIndexes.Put(Col, arrSortIndex)";
_mapsortingindexes.Put((Object)(_col),(Object)(_arrsortindex));
 }else {
 //BA.debugLineNum = 4400;BA.debugLine="arrSortIndex = mapSortingIndexes.Get(Col) 'retri";
_arrsortindex = (int[])(_mapsortingindexes.Get((Object)(_col)));
 };
 //BA.debugLineNum = 4403;BA.debugLine="SelectedRows.Clear";
_selectedrows.Clear();
 //BA.debugLineNum = 4411;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = _arrsortindex.length>0 && _arrsortindex[(int) (0)]>-1;
 //BA.debugLineNum = 4413;BA.debugLine="If bAscending = False And bValidArrSortIndex Then";
if (_bascending==__c.False && _bvalidarrsortindex) { 
 //BA.debugLineNum = 4414;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(_ccolumndatatype[_col],"I","L","R","T")) {
case 0: 
case 1: {
 //BA.debugLineNum = 4416;BA.debugLine="arrSortIndex = ReverseIndexLong(arrColLong, ar";
_arrsortindex = _reverseindexlong(_arrcollong,_arrsortindex,__c.False);
 break; }
case 2: {
 //BA.debugLineNum = 4418;BA.debugLine="arrSortIndex = ReverseIndexDouble(arrColDouble";
_arrsortindex = _reverseindexdouble(_arrcoldouble,_arrsortindex,__c.False);
 break; }
case 3: {
 //BA.debugLineNum = 4420;BA.debugLine="arrSortIndex = ReverseIndexString(arrColString";
_arrsortindex = _reverseindexstring(_arrcolstring,_arrsortindex,__c.False);
 break; }
}
;
 };
 //BA.debugLineNum = 4427;BA.debugLine="If arrSortIndex(0) > -1 Then 'so don't move rows";
if (_arrsortindex[(int) (0)]>-1) { 
 //BA.debugLineNum = 4428;BA.debugLine="For i = 0 To iUB";
{
final int step97 = 1;
final int limit97 = _iub;
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
 //BA.debugLineNum = 4429;BA.debugLine="Data.Set(i, DataTemp.Get(arrSortIndex(i)))";
_data.Set(_i,_datatemp.Get(_arrsortindex[_i]));
 }
};
 //BA.debugLineNum = 4431;BA.debugLine="RefreshTable";
_refreshtable();
 //BA.debugLineNum = 4432;BA.debugLine="bSorted = True";
_bsorted = __c.True;
 };
 //BA.debugLineNum = 4435;BA.debugLine="iPreviousSortColumn = Col";
_iprevioussortcolumn = _col;
 //BA.debugLineNum = 4436;BA.debugLine="bPreviousSortAscending = bAscending 'not used for";
_bprevioussortascending = _bascending;
 //BA.debugLineNum = 4438;BA.debugLine="Return bSorted";
if (true) return _bsorted;
 //BA.debugLineNum = 4440;BA.debugLine="End Sub";
return false;
}
public String  _sv2_scrollchanged(int _posx,int _posy) throws Exception{
 //BA.debugLineNum = 1165;BA.debugLine="Private Sub SV2_ScrollChanged(PosX As Int, PosY As";
 //BA.debugLineNum = 1166;BA.debugLine="SV2Scrolls = True";
_sv2scrolls = __c.True;
 //BA.debugLineNum = 1167;BA.debugLine="If SVFScrolls = False Then";
if (_svfscrolls==__c.False) { 
 //BA.debugLineNum = 1168;BA.debugLine="SVF.ScrollToNow(PosY)";
_svf.ScrollToNow(_posy);
 //BA.debugLineNum = 1169;BA.debugLine="Scroll(PosX, PosY)";
_scroll(_posx,_posy);
 //BA.debugLineNum = 1170;BA.debugLine="SV2PosX = PosX";
_sv2posx = _posx;
 };
 //BA.debugLineNum = 1173;BA.debugLine="SV2Scrolls = False";
_sv2scrolls = __c.False;
 //BA.debugLineNum = 1174;BA.debugLine="If mFastScroll = True And Data.Size >= mFastScrol";
if (_mfastscroll==__c.True && _data.getSize()>=_mfastscrollminitems && _data.getSize()*_crowheight>_sv2.getHeight()) { 
 //BA.debugLineNum = 1175;BA.debugLine="FScScale = FastScrollHeight / (SV2.Panel.Height";
_fscscale = _fastscrollheight/(double)(_sv2.getPanel().getHeight()-_sv2.getHeight());
 //BA.debugLineNum = 1176;BA.debugLine="pnlFastScroll.Visible = True";
_pnlfastscroll.setVisible(__c.True);
 //BA.debugLineNum = 1177;BA.debugLine="If mFastScrollShowLabel = True Then";
if (_mfastscrollshowlabel==__c.True) { 
 //BA.debugLineNum = 1178;BA.debugLine="lblFastScroll.Visible = True";
_lblfastscroll.setVisible(__c.True);
 };
 //BA.debugLineNum = 1180;BA.debugLine="CalcFastScroll(PosY)";
_calcfastscroll(_posy);
 //BA.debugLineNum = 1181;BA.debugLine="FScTimer.Enabled = True";
_fsctimer.setEnabled(__c.True);
 };
 //BA.debugLineNum = 1183;BA.debugLine="End Sub";
return "";
}
public String  _svf_scrollchanged(int _position) throws Exception{
 //BA.debugLineNum = 1156;BA.debugLine="Private Sub SVF_ScrollChanged(Position As Int)";
 //BA.debugLineNum = 1157;BA.debugLine="SVFScrolls = True";
_svfscrolls = __c.True;
 //BA.debugLineNum = 1158;BA.debugLine="If SV2Scrolls = False Then";
if (_sv2scrolls==__c.False) { 
 //BA.debugLineNum = 1159;BA.debugLine="Scroll(SV2PosX, Position)";
_scroll(_sv2posx,_position);
 //BA.debugLineNum = 1160;BA.debugLine="SV2.VerticalScrollPosition = Position";
_sv2.setVerticalScrollPosition(_position);
 };
 //BA.debugLineNum = 1162;BA.debugLine="SVFScrolls = False";
_svfscrolls = __c.False;
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return "";
}
public String  _unhidecol(int _col,int _newsize) throws Exception{
int[] _tmpwidths = null;
int _i = 0;
 //BA.debugLineNum = 2201;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
 //BA.debugLineNum = 2202;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[_savedwidths.length];
;
 //BA.debugLineNum = 2203;BA.debugLine="For i=0 To SavedWidths.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (_savedwidths.length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 2204;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = _savedwidths[_i];
 }
};
 //BA.debugLineNum = 2206;BA.debugLine="tmpWidths(col) = newSize";
_tmpwidths[_col] = _newsize;
 //BA.debugLineNum = 2207;BA.debugLine="SetColumnsWidths(tmpWidths)";
_setcolumnswidths(_tmpwidths);
 //BA.debugLineNum = 2208;BA.debugLine="End Sub";
return "";
}
public String  _unselectrow(int _row) throws Exception{
int _previndex = 0;
 //BA.debugLineNum = 1681;BA.debugLine="Public Sub UnselectRow(Row As Int)";
 //BA.debugLineNum = 1682;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(_callowselection)) { 
if (true) return "";};
 //BA.debugLineNum = 1684;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
 //BA.debugLineNum = 1686;BA.debugLine="prevIndex = SelectedRows.indexof(Row)	 ' -1 if se";
_previndex = _selectedrows.IndexOf((Object)(_row));
 //BA.debugLineNum = 1687;BA.debugLine="If prevIndex > -1 Then";
if (_previndex>-1) { 
 //BA.debugLineNum = 1689;BA.debugLine="SelectedCol = -1";
_selectedcol = (int) (-1);
 //BA.debugLineNum = 1690;BA.debugLine="SelectedRows.RemoveAt(prevIndex)";
_selectedrows.RemoveAt(_previndex);
 //BA.debugLineNum = 1691;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (_visiblerows.ContainsKey((Object)(_row))) { 
 //BA.debugLineNum = 1692;BA.debugLine="HideRow(Row)";
_hiderow(_row);
 //BA.debugLineNum = 1693;BA.debugLine="ShowRow(Row)";
_showrow(_row);
 };
 };
 //BA.debugLineNum = 1696;BA.debugLine="End Sub";
return "";
}
public boolean  _updatecell(int _col,int _row,String _value) throws Exception{
 //BA.debugLineNum = 2086;BA.debugLine="Public Sub UpdateCell(Col As Int, Row As Int, Valu";
 //BA.debugLineNum = 2087;BA.debugLine="If (Col < 0 Or Col > mNumberOfColumns - 1 Or Row";
if ((_col<0 || _col>_mnumberofcolumns-1 || _row<0 || _row>_data.getSize()-1)) { 
 //BA.debugLineNum = 2088;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2090;BA.debugLine="SetValue(Col, Row, Value)";
_setvalue(_col,_row,_value);
 //BA.debugLineNum = 2091;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 2092;BA.debugLine="End Sub";
return false;
}
public String  _updateiplocation() throws Exception{
 //BA.debugLineNum = 2222;BA.debugLine="Private Sub updateIPLocation";
 //BA.debugLineNum = 2223;BA.debugLine="If (SV2.Height > Data.Size * cRowHeight) Then";
if ((_sv2.getHeight()>_data.getSize()*_crowheight)) { 
 //BA.debugLineNum = 2225;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cHe";
_internalpanel.setTop((int) (_data.getSize()*_crowheight+_cheaderheight));
 //BA.debugLineNum = 2226;BA.debugLine="internalPanel.Height = SV2.Height - (Data.Size *";
_internalpanel.setHeight((int) (_sv2.getHeight()-(_data.getSize()*_crowheight)));
 }else {
 //BA.debugLineNum = 2228;BA.debugLine="internalPanel.Height = 0";
_internalpanel.setHeight((int) (0));
 };
 //BA.debugLineNum = 2230;BA.debugLine="End Sub";
return "";
}
public boolean  _updaterow(int _row,String[] _values) throws Exception{
int _i = 0;
 //BA.debugLineNum = 2072;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As Stri";
 //BA.debugLineNum = 2073;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 2074;BA.debugLine="If (Values.Length <> mNumberOfColumns Or Row <0 O";
if ((_values.length!=_mnumberofcolumns || _row<0 || _row>_data.getSize()-1)) { 
 //BA.debugLineNum = 2075;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 2077;BA.debugLine="For i=0 To Values.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_values.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 2078;BA.debugLine="SetValue(i,Row,Values(i))";
_setvalue(_i,_row,_values[_i]);
 }
};
 //BA.debugLineNum = 2080;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 2081;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel();
return BA.SubDelegator.SubNotFound;
}
}
