package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class table extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.table");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public String  _addrow(b4a.example.ef.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addrow", false))
	 {return ((String) Debug.delegate(ba, "addrow", new Object[] {_values}));}
int _lastrow = 0;
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub AddRow(Values() As String)";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("722151170","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=22151171;
 //BA.debugLineNum = 22151171;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22151173;
 //BA.debugLineNum = 22151173;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=22151174;
 //BA.debugLineNum = 22151174;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=22151176;
 //BA.debugLineNum = 22151176;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=22151177;
 //BA.debugLineNum = 22151177;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=22151178;
 //BA.debugLineNum = 22151178;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=22151179;
 //BA.debugLineNum = 22151179;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=22151187;
 //BA.debugLineNum = 22151187;BA.debugLine="End Sub";
return "";
}
public void  _showrow(b4a.example.ef.table __ref,int _row) throws Exception{
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "showrow", false))
	 {Debug.delegate(ba, "showrow", new Object[] {_row}); return;}
ResumableSub_ShowRow rsub = new ResumableSub_ShowRow(this,__ref,_row);
rsub.resume(ba, null);
}
public static class ResumableSub_ShowRow extends BA.ResumableSub {
public ResumableSub_ShowRow(b4a.example.ef.table parent,b4a.example.ef.table __ref,int _row) {
this.parent = parent;
this.__ref = __ref;
this._row = _row;
this.__ref = parent;
}
b4a.example.ef.table __ref;
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
RDebugUtils.currentModule="table";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=22282243;
 //BA.debugLineNum = 22282243;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
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
RDebugUtils.currentLine=22282246;
 //BA.debugLineNum = 22282246;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=22282247;
 //BA.debugLineNum = 22282247;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=22282248;
 //BA.debugLineNum = 22282248;BA.debugLine="lbls = GetLabels(Row)";
_lbls = __ref._getlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null,_row);
RDebugUtils.currentLine=22282249;
 //BA.debugLineNum = 22282249;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=22282250;
 //BA.debugLineNum = 22282250;BA.debugLine="visibleRows.Put(Row, lbls)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_row),(Object)(_lbls));
RDebugUtils.currentLine=22282251;
 //BA.debugLineNum = 22282251;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=22282252;
 //BA.debugLineNum = 22282252;BA.debugLine="Private txtColor As Int";
_txtcolor = 0;
RDebugUtils.currentLine=22282253;
 //BA.debugLineNum = 22282253;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
if (true) break;

case 7:
//if
this.state = 22;
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=22282256;
 //BA.debugLineNum = 22282256;BA.debugLine="Else If lstRowColorIndexes.Get(Row) > 1 Then";
if ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))>1) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=22282260;
 //BA.debugLineNum = 22282260;BA.debugLine="Else If cUseColumnColors = True Then";
if (__ref._cusecolumncolors /*boolean*/ ==parent.__c.True) { 
this.state = 13;
}else {
this.state = 15;
}}}
if (true) break;

case 9:
//C
this.state = 22;
RDebugUtils.currentLine=22282254;
 //BA.debugLineNum = 22282254;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = __ref._selecteddrawable /*Object[]*/ ;
RDebugUtils.currentLine=22282255;
 //BA.debugLineNum = 22282255;BA.debugLine="txtColor = cSelectedRowTextColor";
_txtcolor = __ref._cselectedrowtextcolor /*int*/ ;
 if (true) break;

case 11:
//C
this.state = 22;
RDebugUtils.currentLine=22282257;
 //BA.debugLineNum = 22282257;BA.debugLine="rowColor = lstRowDrawables.Get(lstRowColorIndexe";
_rowcolor = (Object[])(__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)));
RDebugUtils.currentLine=22282259;
 //BA.debugLineNum = 22282259;BA.debugLine="txtColor = GetContrastColor(lstRowColors.Get(lst";
_txtcolor = __ref._getcontrastcolor /*int*/ (null,(int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)))));
 if (true) break;

case 13:
//C
this.state = 22;
RDebugUtils.currentLine=22282261;
 //BA.debugLineNum = 22282261;BA.debugLine="rowColor = ColumnDrawables";
_rowcolor = __ref._columndrawables /*Object[]*/ ;
RDebugUtils.currentLine=22282262;
 //BA.debugLineNum = 22282262;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=22282264;
 //BA.debugLineNum = 22282264;BA.debugLine="If Row Mod 2 = 0 Then";
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
RDebugUtils.currentLine=22282265;
 //BA.debugLineNum = 22282265;BA.debugLine="rowColor = Drawable1";
_rowcolor = __ref._drawable1 /*Object[]*/ ;
RDebugUtils.currentLine=22282266;
 //BA.debugLineNum = 22282266;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=22282268;
 //BA.debugLineNum = 22282268;BA.debugLine="rowColor = Drawable2";
_rowcolor = __ref._drawable2 /*Object[]*/ ;
RDebugUtils.currentLine=22282269;
 //BA.debugLineNum = 22282269;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
;
RDebugUtils.currentLine=22282272;
 //BA.debugLineNum = 22282272;BA.debugLine="If mNumberOfFixedColumns = 0 Then";

case 22:
//if
this.state = 100;
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
this.state = 24;
}else {
this.state = 51;
}if (true) break;

case 24:
//C
this.state = 25;
RDebugUtils.currentLine=22282273;
 //BA.debugLineNum = 22282273;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=22282274;
 //BA.debugLineNum = 22282274;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
if (true) break;

case 28:
//if
this.state = 48;
if ((__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth()>1)) { 
this.state = 30;
}if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=22282275;
 //BA.debugLineNum = 22282275;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(I).L";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=22282276;
 //BA.debugLineNum = 22282276;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=22282277;
 //BA.debugLineNum = 22282277;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=22282278;
 //BA.debugLineNum = 22282278;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
if (true) break;

case 31:
//if
this.state = 42;
if (_i==__ref._selectedcol /*int*/  && (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 33;
}else {
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 42;
RDebugUtils.currentLine=22282279;
 //BA.debugLineNum = 22282279;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=22282280;
 //BA.debugLineNum = 22282280;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=22282282;
 //BA.debugLineNum = 22282282;BA.debugLine="If MultiTextColors = False Then";
if (true) break;

case 36:
//if
this.state = 41;
if (__ref._multitextcolors /*boolean*/ ==parent.__c.False) { 
this.state = 38;
}else {
this.state = 40;
}if (true) break;

case 38:
//C
this.state = 41;
RDebugUtils.currentLine=22282283;
 //BA.debugLineNum = 22282283;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=22282285;
 //BA.debugLineNum = 22282285;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=22282287;
 //BA.debugLineNum = 22282287;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=22282289;
 //BA.debugLineNum = 22282289;BA.debugLine="If MultiAlignments = False Then";

case 42:
//if
this.state = 47;
if (__ref._multialignments /*boolean*/ ==parent.__c.False) { 
this.state = 44;
}else {
this.state = 46;
}if (true) break;

case 44:
//C
this.state = 47;
RDebugUtils.currentLine=22282290;
 //BA.debugLineNum = 22282290;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=22282292;
 //BA.debugLineNum = 22282292;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
_lbls[_i].setGravity(__ref._calignments /*int[]*/ [_i]);
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
RDebugUtils.currentLine=22282297;
 //BA.debugLineNum = 22282297;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=22282298;
 //BA.debugLineNum = 22282298;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (true) break;

case 55:
//if
this.state = 98;
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
this.state = 57;
}else {
this.state = 76;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=22282299;
 //BA.debugLineNum = 22282299;BA.debugLine="SVF.Panel.AddView(lbls(i), HeaderFirst.GetView";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=22282300;
 //BA.debugLineNum = 22282300;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=22282301;
 //BA.debugLineNum = 22282301;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=22282302;
 //BA.debugLineNum = 22282302;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
if (true) break;

case 58:
//if
this.state = 69;
if (_i==__ref._selectedcol /*int*/  && (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 69;
RDebugUtils.currentLine=22282303;
 //BA.debugLineNum = 22282303;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=22282304;
 //BA.debugLineNum = 22282304;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=22282306;
 //BA.debugLineNum = 22282306;BA.debugLine="If MultiTextColors = False Then";
if (true) break;

case 63:
//if
this.state = 68;
if (__ref._multitextcolors /*boolean*/ ==parent.__c.False) { 
this.state = 65;
}else {
this.state = 67;
}if (true) break;

case 65:
//C
this.state = 68;
RDebugUtils.currentLine=22282307;
 //BA.debugLineNum = 22282307;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=22282309;
 //BA.debugLineNum = 22282309;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=22282311;
 //BA.debugLineNum = 22282311;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=22282313;
 //BA.debugLineNum = 22282313;BA.debugLine="If MultiAlignments = False Then";

case 69:
//if
this.state = 74;
if (__ref._multialignments /*boolean*/ ==parent.__c.False) { 
this.state = 71;
}else {
this.state = 73;
}if (true) break;

case 71:
//C
this.state = 74;
RDebugUtils.currentLine=22282314;
 //BA.debugLineNum = 22282314;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=22282316;
 //BA.debugLineNum = 22282316;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
_lbls[_i].setGravity(__ref._calignments /*int[]*/ [_i]);
 if (true) break;

case 74:
//C
this.state = 98;
;
 if (true) break;

case 76:
//C
this.state = 77;
RDebugUtils.currentLine=22282319;
 //BA.debugLineNum = 22282319;BA.debugLine="Private i_1 As Int";
_i_1 = 0;
RDebugUtils.currentLine=22282320;
 //BA.debugLineNum = 22282320;BA.debugLine="i_1 = i - mNumberOfFixedColumns";
_i_1 = (int) (_i-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=22282321;
 //BA.debugLineNum = 22282321;BA.debugLine="If (Header.GetView(i_1).Width > 1 ) Then";
if (true) break;

case 77:
//if
this.state = 97;
if ((__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getWidth()>1)) { 
this.state = 79;
}if (true) break;

case 79:
//C
this.state = 80;
RDebugUtils.currentLine=22282322;
 //BA.debugLineNum = 22282322;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(i_1";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=22282323;
 //BA.debugLineNum = 22282323;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=22282324;
 //BA.debugLineNum = 22282324;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=22282325;
 //BA.debugLineNum = 22282325;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(";
if (true) break;

case 80:
//if
this.state = 91;
if (_i==__ref._selectedcol /*int*/  && (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 82;
}else {
this.state = 84;
}if (true) break;

case 82:
//C
this.state = 91;
RDebugUtils.currentLine=22282326;
 //BA.debugLineNum = 22282326;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=22282327;
 //BA.debugLineNum = 22282327;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=22282329;
 //BA.debugLineNum = 22282329;BA.debugLine="If MultiTextColors = False Then";
if (true) break;

case 85:
//if
this.state = 90;
if (__ref._multitextcolors /*boolean*/ ==parent.__c.False) { 
this.state = 87;
}else {
this.state = 89;
}if (true) break;

case 87:
//C
this.state = 90;
RDebugUtils.currentLine=22282330;
 //BA.debugLineNum = 22282330;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=22282332;
 //BA.debugLineNum = 22282332;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 90:
//C
this.state = 91;
;
RDebugUtils.currentLine=22282334;
 //BA.debugLineNum = 22282334;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=22282336;
 //BA.debugLineNum = 22282336;BA.debugLine="If MultiAlignments = False Then";

case 91:
//if
this.state = 96;
if (__ref._multialignments /*boolean*/ ==parent.__c.False) { 
this.state = 93;
}else {
this.state = 95;
}if (true) break;

case 93:
//C
this.state = 96;
RDebugUtils.currentLine=22282337;
 //BA.debugLineNum = 22282337;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=22282339;
 //BA.debugLineNum = 22282339;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
_lbls[_i].setGravity(__ref._calignments /*int[]*/ [_i]);
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
RDebugUtils.currentLine=22282347;
 //BA.debugLineNum = 22282347;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=22282348;
 //BA.debugLineNum = 22282348;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=22282349;
 //BA.debugLineNum = 22282349;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=22282350;
 //BA.debugLineNum = 22282350;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if (true) break;

case 101:
//if
this.state = 106;
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==parent.__c.True)) { 
this.state = 103;
;}if (true) break;

case 103:
//C
this.state = 106;
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");
if (true) break;

case 106:
//C
this.state = 107;
;
RDebugUtils.currentLine=22282352;
 //BA.debugLineNum = 22282352;BA.debugLine="If SubExists(cCallBack, cEventName & \"_ShowRow\")";
if (true) break;

case 107:
//if
this.state = 110;
if (parent.__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_ShowRow")) { 
this.state = 109;
}if (true) break;

case 109:
//C
this.state = 110;
RDebugUtils.currentLine=22282353;
 //BA.debugLineNum = 22282353;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "showrow"),(int) (0));
this.state = 115;
return;
case 115:
//C
this.state = 110;
;
RDebugUtils.currentLine=22282354;
 //BA.debugLineNum = 22282354;BA.debugLine="CallSub3(cCallBack, cEventName & \"_ShowRow\", Row";
parent.__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_ShowRow",(Object)(_row),(Object)(_lbls));
 if (true) break;

case 110:
//C
this.state = -1;
;
RDebugUtils.currentLine=22282356;
 //BA.debugLineNum = 22282356;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _addrowautomaticwidth(b4a.example.ef.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addrowautomaticwidth", false))
	 {return ((String) Debug.delegate(ba, "addrowautomaticwidth", new Object[] {_values}));}
int _i = 0;
int _lastrow = 0;
boolean _changed = false;
int _width = 0;
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=22216708;
 //BA.debugLineNum = 22216708;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("722216708","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=22216709;
 //BA.debugLineNum = 22216709;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22216711;
 //BA.debugLineNum = 22216711;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=22216712;
 //BA.debugLineNum = 22216712;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=22216714;
 //BA.debugLineNum = 22216714;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=22216715;
 //BA.debugLineNum = 22216715;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=22216717;
 //BA.debugLineNum = 22216717;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=22216718;
 //BA.debugLineNum = 22216718;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=22216719;
 //BA.debugLineNum = 22216719;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=22216720;
 //BA.debugLineNum = 22216720;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=22216721;
 //BA.debugLineNum = 22216721;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22216722;
 //BA.debugLineNum = 22216722;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=22216724;
 //BA.debugLineNum = 22216724;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=22216726;
 //BA.debugLineNum = 22216726;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=22216727;
 //BA.debugLineNum = 22216727;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=22216728;
 //BA.debugLineNum = 22216728;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=22216729;
 //BA.debugLineNum = 22216729;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=22216732;
 //BA.debugLineNum = 22216732;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=22216733;
 //BA.debugLineNum = 22216733;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22216734;
 //BA.debugLineNum = 22216734;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=22216736;
 //BA.debugLineNum = 22216736;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=22216738;
 //BA.debugLineNum = 22216738;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=22216739;
 //BA.debugLineNum = 22216739;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=22216740;
 //BA.debugLineNum = 22216740;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=22216741;
 //BA.debugLineNum = 22216741;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=22216742;
 //BA.debugLineNum = 22216742;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=22216743;
 //BA.debugLineNum = 22216743;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=22216747;
 //BA.debugLineNum = 22216747;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=22216748;
 //BA.debugLineNum = 22216748;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=22216751;
 //BA.debugLineNum = 22216751;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=22216752;
 //BA.debugLineNum = 22216752;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=22216759;
 //BA.debugLineNum = 22216759;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnswidths(b4a.example.ef.table __ref,int[] _widths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumnswidths", false))
	 {return ((String) Debug.delegate(ba, "setcolumnswidths", new Object[] {_widths}));}
int _col = 0;
int _row = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
int _w = 0;
int _left = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _wt = 0;
int _col_x = 0;
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
_savedwidths = new int[_widths.length];
;
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
_columnwidths = new int[_widths.length];
;
RDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
_headerwidths = new int[_widths.length];
;
RDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=21757962;
 //BA.debugLineNum = 21757962;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=21757963;
 //BA.debugLineNum = 21757963;BA.debugLine="HeaderWidths(col) = Widths(col)";
__ref._headerwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=21757964;
 //BA.debugLineNum = 21757964;BA.debugLine="DataWidths(col) = Widths(col)";
__ref._datawidths /*int[]*/ [_col] = _widths[_col];
 }
};
 }else {
RDebugUtils.currentLine=21757967;
 //BA.debugLineNum = 21757967;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step13 = 1;
final int limit13 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=21757968;
 //BA.debugLineNum = 21757968;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=21757969;
 //BA.debugLineNum = 21757969;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
 }
};
 };
RDebugUtils.currentLine=21757973;
 //BA.debugLineNum = 21757973;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=21757974;
 //BA.debugLineNum = 21757974;BA.debugLine="Private w As Int";
_w = 0;
RDebugUtils.currentLine=21757975;
 //BA.debugLineNum = 21757975;BA.debugLine="Private Left As Int";
_left = 0;
RDebugUtils.currentLine=21757976;
 //BA.debugLineNum = 21757976;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=21757977;
 //BA.debugLineNum = 21757977;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=21757978;
 //BA.debugLineNum = 21757978;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit23 ;_col = _col + step23 ) {
RDebugUtils.currentLine=21757979;
 //BA.debugLineNum = 21757979;BA.debugLine="v = Header.GetView(col)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=21757980;
 //BA.debugLineNum = 21757980;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=21757981;
 //BA.debugLineNum = 21757981;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=21757982;
 //BA.debugLineNum = 21757982;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=21757983;
 //BA.debugLineNum = 21757983;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=21757984;
 //BA.debugLineNum = 21757984;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=21757987;
 //BA.debugLineNum = 21757987;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
RDebugUtils.currentLine=21757988;
 //BA.debugLineNum = 21757988;BA.debugLine="HeaderFirst.Width = 0";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=21757989;
 //BA.debugLineNum = 21757989;BA.debugLine="SVF.Width = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=21757990;
 //BA.debugLineNum = 21757990;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
RDebugUtils.currentLine=21757991;
 //BA.debugLineNum = 21757991;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=21757992;
 //BA.debugLineNum = 21757992;BA.debugLine="SV2.Left = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=21757993;
 //BA.debugLineNum = 21757993;BA.debugLine="SV2.Width = Min(Header.Width, cWidth)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=21757994;
 //BA.debugLineNum = 21757994;BA.debugLine="Header.Left = 0";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=21757995;
 //BA.debugLineNum = 21757995;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=21757996;
 //BA.debugLineNum = 21757996;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=21757997;
 //BA.debugLineNum = 21757997;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step42 = 1;
final int limit42 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit42 ;_row = _row + step42 ) {
RDebugUtils.currentLine=21757998;
 //BA.debugLineNum = 21757998;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=21757999;
 //BA.debugLineNum = 21757999;BA.debugLine="For col = 0 To lbls.Length - 1";
{
final int step44 = 1;
final int limit44 = (int) (_lbls.length-1);
_col = (int) (0) ;
for (;_col <= limit44 ;_col = _col + step44 ) {
RDebugUtils.currentLine=21758000;
 //BA.debugLineNum = 21758000;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left,";
_lbls[_col].SetLayout(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft(),_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=21758003;
 //BA.debugLineNum = 21758003;BA.debugLine="pnlTable.Width = Min(Header.Width, cWidth)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=21758004;
 //BA.debugLineNum = 21758004;BA.debugLine="lblStatusLine.Width = Header.Width";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=21758005;
 //BA.debugLineNum = 21758005;BA.debugLine="internalPanel.Width = Header.Width";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=21758007;
 //BA.debugLineNum = 21758007;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=21758008;
 //BA.debugLineNum = 21758008;BA.debugLine="Private w, wt As Int";
_w = 0;
_wt = 0;
RDebugUtils.currentLine=21758009;
 //BA.debugLineNum = 21758009;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=21758010;
 //BA.debugLineNum = 21758010;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit55 ;_col = _col + step55 ) {
RDebugUtils.currentLine=21758011;
 //BA.debugLineNum = 21758011;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=21758012;
 //BA.debugLineNum = 21758012;BA.debugLine="v = HeaderFirst.GetView(col)";
_v = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=21758014;
 //BA.debugLineNum = 21758014;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)	'???";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=21758015;
 //BA.debugLineNum = 21758015;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=21758016;
 //BA.debugLineNum = 21758016;BA.debugLine="wt = wt + w";
_wt = (int) (_wt+_w);
RDebugUtils.currentLine=21758017;
 //BA.debugLineNum = 21758017;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=21758018;
 //BA.debugLineNum = 21758018;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=21758019;
 //BA.debugLineNum = 21758019;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=21758022;
 //BA.debugLineNum = 21758022;BA.debugLine="mFirstColumnsWidth = Left";
__ref._mfirstcolumnswidth /*int*/  = _left;
RDebugUtils.currentLine=21758023;
 //BA.debugLineNum = 21758023;BA.debugLine="HeaderFirst.Width = Left";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=21758024;
 //BA.debugLineNum = 21758024;BA.debugLine="SVF.Width = HeaderFirst.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=21758025;
 //BA.debugLineNum = 21758025;BA.debugLine="SV2.Left = HeaderFirst.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=21758026;
 //BA.debugLineNum = 21758026;BA.debugLine="Private Left, col_x As Int";
_left = 0;
_col_x = 0;
RDebugUtils.currentLine=21758027;
 //BA.debugLineNum = 21758027;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=21758028;
 //BA.debugLineNum = 21758028;BA.debugLine="For col = mNumberOfFixedColumns To Widths.Length";
{
final int step72 = 1;
final int limit72 = (int) (_widths.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit72 ;_col = _col + step72 ) {
RDebugUtils.currentLine=21758029;
 //BA.debugLineNum = 21758029;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=21758030;
 //BA.debugLineNum = 21758030;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=21758031;
 //BA.debugLineNum = 21758031;BA.debugLine="v = Header.GetView(col_x)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x);
RDebugUtils.currentLine=21758032;
 //BA.debugLineNum = 21758032;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=21758033;
 //BA.debugLineNum = 21758033;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=21758034;
 //BA.debugLineNum = 21758034;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=21758035;
 //BA.debugLineNum = 21758035;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=21758036;
 //BA.debugLineNum = 21758036;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=21758039;
 //BA.debugLineNum = 21758039;BA.debugLine="Header.Width = Left";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=21758040;
 //BA.debugLineNum = 21758040;BA.debugLine="Header.Left = -SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=21758041;
 //BA.debugLineNum = 21758041;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=21758042;
 //BA.debugLineNum = 21758042;BA.debugLine="Header.Left = mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._mfirstcolumnswidth /*int*/ );
RDebugUtils.currentLine=21758043;
 //BA.debugLineNum = 21758043;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=21758044;
 //BA.debugLineNum = 21758044;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=21758045;
 //BA.debugLineNum = 21758045;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step89 = 1;
final int limit89 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit89 ;_row = _row + step89 ) {
RDebugUtils.currentLine=21758046;
 //BA.debugLineNum = 21758046;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=21758047;
 //BA.debugLineNum = 21758047;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=21758048;
 //BA.debugLineNum = 21758048;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step92 = 1;
final int limit92 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit92 ;_col = _col + step92 ) {
RDebugUtils.currentLine=21758049;
 //BA.debugLineNum = 21758049;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Width";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),_widths[_col],(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=21758050;
 //BA.debugLineNum = 21758050;BA.debugLine="Left = HeaderFirst.GetView(col).Left + HeaderF";
_left = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft()+__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth()+__ref._clinewidth /*int*/ );
 }
};
RDebugUtils.currentLine=21758052;
 //BA.debugLineNum = 21758052;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=21758053;
 //BA.debugLineNum = 21758053;BA.debugLine="For col = mNumberOfFixedColumns To lbls.Length";
{
final int step97 = 1;
final int limit97 = (int) (_lbls.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit97 ;_col = _col + step97 ) {
RDebugUtils.currentLine=21758054;
 //BA.debugLineNum = 21758054;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=21758055;
 //BA.debugLineNum = 21758055;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Heade";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=21758056;
 //BA.debugLineNum = 21758056;BA.debugLine="Left = Left + Header.GetView(col_x).Width + cL";
_left = (int) (_left+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth()+__ref._clinewidth /*int*/ );
 }
};
 }
};
RDebugUtils.currentLine=21758059;
 //BA.debugLineNum = 21758059;BA.debugLine="SV2.Width = Min(Header.Width, cWidth - HeaderFir";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ -__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth())));
RDebugUtils.currentLine=21758060;
 //BA.debugLineNum = 21758060;BA.debugLine="pnlTable.Width = Min(HeaderFirst.Width + Header.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=21758061;
 //BA.debugLineNum = 21758061;BA.debugLine="lblStatusLine.Width = HeaderFirst.Width + Header";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=21758062;
 //BA.debugLineNum = 21758062;BA.debugLine="internalPanel.Width = HeaderFirst.Width + Header";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=21758064;
 //BA.debugLineNum = 21758064;BA.debugLine="pnlFastScroll.Left = pnlTable.Width - pnlFastScro";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=21758065;
 //BA.debugLineNum = 21758065;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=21758066;
 //BA.debugLineNum = 21758066;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=21758069;
 //BA.debugLineNum = 21758069;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=21758070;
 //BA.debugLineNum = 21758070;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_left,_top,_width,_height}));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=21364742;
 //BA.debugLineNum = 21364742;BA.debugLine="pnlTable.Initialize(\"\")";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21364743;
 //BA.debugLineNum = 21364743;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="Act.AddView(pnlTable, cLeft, cTop , cWidth, cHeig";
_act.AddView((android.view.View)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._cleft /*int*/ ,__ref._ctop /*int*/ ,__ref._cwidth /*int*/ ,__ref._cheight /*int*/ );
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="End Sub";
return "";
}
public String  _inittable(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "inittable", false))
	 {return ((String) Debug.delegate(ba, "inittable", null));}
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw = null;
int _i = 0;
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub InitTable";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="lstRowColors.Initialize				'list of the different";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="lstRowColorIndexes.Initialize	'list of the color";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="lstRowDrawables.Initialize		'list of the drawable";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="pnlTable.Tag = \"Table\"";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)("Table"));
RDebugUtils.currentLine=21430281;
 //BA.debugLineNum = 21430281;BA.debugLine="TableObject = Me";
__ref._tableobject /*b4a.example.ef.table*/  = (b4a.example.ef.table)(this);
RDebugUtils.currentLine=21430283;
 //BA.debugLineNum = 21430283;BA.debugLine="SV2.Initialize(0, 0, \"SV2\")";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .Initialize(ba,(int) (0),(int) (0),"SV2");
RDebugUtils.currentLine=21430284;
 //BA.debugLineNum = 21430284;BA.debugLine="SVF.Initialize2(0, \"SVF\")";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .Initialize2(ba,(int) (0),"SVF");
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=21430286;
 //BA.debugLineNum = 21430286;BA.debugLine="jo = SVF";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()));
RDebugUtils.currentLine=21430287;
 //BA.debugLineNum = 21430287;BA.debugLine="jo.RunMethod(\"setVerticalScrollBarEnabled\", Array";
_jo.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=21430288;
 //BA.debugLineNum = 21430288;BA.debugLine="internalPanel.Initialize(\"IP\")";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"IP");
RDebugUtils.currentLine=21430289;
 //BA.debugLineNum = 21430289;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=21430291;
 //BA.debugLineNum = 21430291;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=21430292;
 //BA.debugLineNum = 21430292;BA.debugLine="SV2.FadingEdges(False)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .FadingEdges(__c.False);
RDebugUtils.currentLine=21430293;
 //BA.debugLineNum = 21430293;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=21430294;
 //BA.debugLineNum = 21430294;BA.debugLine="IsVisible = True";
__ref._isvisible /*boolean*/  = __c.True;
RDebugUtils.currentLine=21430295;
 //BA.debugLineNum = 21430295;BA.debugLine="HeaderFirst.Initialize(\"\")";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21430296;
 //BA.debugLineNum = 21430296;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=21430297;
 //BA.debugLineNum = 21430297;BA.debugLine="HeaderBase.Initialize(\"\")";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21430298;
 //BA.debugLineNum = 21430298;BA.debugLine="HeaderBase.Color = Colors.Transparent";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21430299;
 //BA.debugLineNum = 21430299;BA.debugLine="Header.Initialize(\"\")";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21430300;
 //BA.debugLineNum = 21430300;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=21430302;
 //BA.debugLineNum = 21430302;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=21430303;
 //BA.debugLineNum = 21430303;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
 }else {
RDebugUtils.currentLine=21430305;
 //BA.debugLineNum = 21430305;BA.debugLine="mFirstColumnsWidth = 100dip";
__ref._mfirstcolumnswidth /*int*/  = __c.DipToCurrent((int) (100));
 };
RDebugUtils.currentLine=21430307;
 //BA.debugLineNum = 21430307;BA.debugLine="pnlTable.AddView(Header, mFirstColumnsWidth, 0 ,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,(int) (0),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=21430308;
 //BA.debugLineNum = 21430308;BA.debugLine="pnlTable.AddView(HeaderFirst, 0, 0, mFirstColumns";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mfirstcolumnswidth /*int*/ ,__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=21430311;
 //BA.debugLineNum = 21430311;BA.debugLine="lblStatusLine.Initialize(\"\")";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21430312;
 //BA.debugLineNum = 21430312;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21430313;
 //BA.debugLineNum = 21430313;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21430314;
 //BA.debugLineNum = 21430314;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=21430315;
 //BA.debugLineNum = 21430315;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=21430316;
 //BA.debugLineNum = 21430316;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=21430317;
 //BA.debugLineNum = 21430317;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),__ref._cwidth /*int*/ ,__ref._cstatuslineheight /*int*/ );
 }else {
RDebugUtils.currentLine=21430319;
 //BA.debugLineNum = 21430319;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=21430320;
 //BA.debugLineNum = 21430320;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=21430321;
 //BA.debugLineNum = 21430321;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=21430323;
 //BA.debugLineNum = 21430323;BA.debugLine="SetPadding(lblStatusLine, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=21430324;
 //BA.debugLineNum = 21430324;BA.debugLine="pnlTable.AddView(internalPanel, 0, 0, cWidth, 0)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._cwidth /*int*/ ,(int) (0));
RDebugUtils.currentLine=21430326;
 //BA.debugLineNum = 21430326;BA.debugLine="pnlFastScroll.Initialize(\"pnlFastScroll\")";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnlFastScroll");
RDebugUtils.currentLine=21430327;
 //BA.debugLineNum = 21430327;BA.debugLine="pnlFastScroll.Color = FScBackgroundColor";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._fscbackgroundcolor /*int*/ );
RDebugUtils.currentLine=21430328;
 //BA.debugLineNum = 21430328;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=21430329;
 //BA.debugLineNum = 21430329;BA.debugLine="pnlTable.AddView(pnlFastScroll,  cWidth - FScCurs";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop(),__ref._fsccursorwidth /*int*/ ,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=21430330;
 //BA.debugLineNum = 21430330;BA.debugLine="pnlFastScrollCursor.Initialize(\"\")";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21430331;
 //BA.debugLineNum = 21430331;BA.debugLine="pnlFastScrollCursor.Color = Colors.White";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=21430332;
 //BA.debugLineNum = 21430332;BA.debugLine="pnlFastScroll.AddView(pnlFastScrollCursor,  0, 0,";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=21430333;
 //BA.debugLineNum = 21430333;BA.debugLine="lblFastScroll.Initialize(\"\")";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21430334;
 //BA.debugLineNum = 21430334;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=21430335;
 //BA.debugLineNum = 21430335;BA.debugLine="cdw.Initialize2(Colors.White, 3dip, 1dip, Colors.";
_cdw.Initialize2(__c.Colors.White,__c.DipToCurrent((int) (3)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
RDebugUtils.currentLine=21430336;
 //BA.debugLineNum = 21430336;BA.debugLine="lblFastScroll.Background = cdw";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
RDebugUtils.currentLine=21430337;
 //BA.debugLineNum = 21430337;BA.debugLine="lblFastScroll.TextColor = Colors.Black";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=21430338;
 //BA.debugLineNum = 21430338;BA.debugLine="lblFastScroll.Gravity = Bit.Or(Gravity.LEFT, Grav";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Bit.Or(__c.Gravity.LEFT,__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=21430339;
 //BA.debugLineNum = 21430339;BA.debugLine="lblFastScroll.Padding = Array As Int(5dip, 0, 0,";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setPadding(new int[]{__c.DipToCurrent((int) (5)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=21430340;
 //BA.debugLineNum = 21430340;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=21430341;
 //BA.debugLineNum = 21430341;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21430342;
 //BA.debugLineNum = 21430342;BA.debugLine="pnlTable.AddView(lblFastScroll,  cWidth - mFastS";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._fsclabeltopdelta /*int*/ ,__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 }else {
RDebugUtils.currentLine=21430344;
 //BA.debugLineNum = 21430344;BA.debugLine="pnlTable.AddView(lblFastScroll,  0, (SV2.Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._mfastscrolllabelheight /*int*/ )/(double)2),__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 };
RDebugUtils.currentLine=21430346;
 //BA.debugLineNum = 21430346;BA.debugLine="FScTimer.Initialize(\"FastScrollTimer\", 1500)";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FastScrollTimer",(long) (1500));
RDebugUtils.currentLine=21430348;
 //BA.debugLineNum = 21430348;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=21430350;
 //BA.debugLineNum = 21430350;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=21430352;
 //BA.debugLineNum = 21430352;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21430353;
 //BA.debugLineNum = 21430353;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21430354;
 //BA.debugLineNum = 21430354;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21430355;
 //BA.debugLineNum = 21430355;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21430356;
 //BA.debugLineNum = 21430356;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=21430357;
 //BA.debugLineNum = 21430357;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step74 = 1;
final int limit74 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
RDebugUtils.currentLine=21430358;
 //BA.debugLineNum = 21430358;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=21430359;
 //BA.debugLineNum = 21430359;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=21430360;
 //BA.debugLineNum = 21430360;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=21430361;
 //BA.debugLineNum = 21430361;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=21430362;
 //BA.debugLineNum = 21430362;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
 }
};
RDebugUtils.currentLine=21430364;
 //BA.debugLineNum = 21430364;BA.debugLine="SVF.Panel.Width = SVF.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setWidth(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=21430365;
 //BA.debugLineNum = 21430365;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=21430366;
 //BA.debugLineNum = 21430366;BA.debugLine="SV2.Panel.Width = SV2.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth());
RDebugUtils.currentLine=21430367;
 //BA.debugLineNum = 21430367;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=21430369;
 //BA.debugLineNum = 21430369;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=21430371;
 //BA.debugLineNum = 21430371;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=21430373;
 //BA.debugLineNum = 21430373;BA.debugLine="pnlSortingView.Initialize(\"\")";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21430374;
 //BA.debugLineNum = 21430374;BA.debugLine="If mCustomSortingBitmaps = False Then";
if (__ref._mcustomsortingbitmaps /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21430375;
 //BA.debugLineNum = 21430375;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
 };
RDebugUtils.currentLine=21430379;
 //BA.debugLineNum = 21430379;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=21430380;
 //BA.debugLineNum = 21430380;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize2((android.graphics.Bitmap)(__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=21430388;
 //BA.debugLineNum = 21430388;BA.debugLine="End Sub";
return "";
}
public String  _addtoview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoview", false))
	 {return ((String) Debug.delegate(ba, "addtoview", new Object[] {_v,_left,_top,_width,_height}));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
__ref._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="End Sub";
return "";
}
public String  _calcfastscroll(b4a.example.ef.table __ref,int _pos) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "calcfastscroll", false))
	 {return ((String) Debug.delegate(ba, "calcfastscroll", new Object[] {_pos}));}
int _i = 0;
int _top = 0;
String[] _str = null;
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Private Sub CalcFastScroll(Pos As Int)";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="Private i, Top As Int";
_i = 0;
_top = 0;
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="Top = Pos * FScScale";
_top = (int) (_pos*__ref._fscscale /*double*/ );
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=26345476;
 //BA.debugLineNum = 26345476;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26345477;
 //BA.debugLineNum = 26345477;BA.debugLine="lblFastScroll.Top = Top + FscLabelTopDelta";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (_top+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=26345479;
 //BA.debugLineNum = 26345479;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=26345480;
 //BA.debugLineNum = 26345480;BA.debugLine="i = (Pos + SV2.Height / 2) / cRowHeight";
_i = (int) ((_pos+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)2)/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=26345481;
 //BA.debugLineNum = 26345481;BA.debugLine="Private str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=26345482;
 //BA.debugLineNum = 26345482;BA.debugLine="str = Data.Get(i)";
_str = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=26345483;
 //BA.debugLineNum = 26345483;BA.debugLine="lblFastScroll.Text = str(mFastScrollColumnIndex)";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_str[__ref._mfastscrollcolumnindex /*int*/ ].substring((int) (0),(int) (__c.Min(_str[__ref._mfastscrollcolumnindex /*int*/ ].length(),__ref._mfastscrolllabelmaxchars /*int*/ )))));
 };
RDebugUtils.currentLine=26345486;
 //BA.debugLineNum = 26345486;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_click", false))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=22806532;
 //BA.debugLineNum = 22806532;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=22806535;
 //BA.debugLineNum = 22806535;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=22806536;
 //BA.debugLineNum = 22806536;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellClick\"";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick")) { 
RDebugUtils.currentLine=22806537;
 //BA.debugLineNum = 22806537;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellClick\", r";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=22806539;
 //BA.debugLineNum = 22806539;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(b4a.example.ef.table __ref,b4a.example.ef.table._rowcol _rc) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "selectrow", false))
	 {return ((String) Debug.delegate(ba, "selectrow", new Object[] {_rc}));}
int _previndex = 0;
int _prev = 0;
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
_prev = 0;
RDebugUtils.currentLine=23003142;
 //BA.debugLineNum = 23003142;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=23003143;
 //BA.debugLineNum = 23003143;BA.debugLine="If (prevIndex <> -1 And mMultiSelect = False) The";
if ((_previndex!=-1 && __ref._mmultiselect /*boolean*/ ==__c.False)) { 
RDebugUtils.currentLine=23003145;
 //BA.debugLineNum = 23003145;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=23003146;
 //BA.debugLineNum = 23003146;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=23003147;
 //BA.debugLineNum = 23003147;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=23003148;
 //BA.debugLineNum = 23003148;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=23003150;
 //BA.debugLineNum = 23003150;BA.debugLine="If mZeroSelection = False Then";
if (__ref._mzeroselection /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23003151;
 //BA.debugLineNum = 23003151;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=23003155;
 //BA.debugLineNum = 23003155;BA.debugLine="If (prevIndex = -1) Then";
if ((_previndex==-1)) { 
RDebugUtils.currentLine=23003156;
 //BA.debugLineNum = 23003156;BA.debugLine="If (mMultiSelect) Then";
if ((__ref._mmultiselect /*boolean*/ )) { 
RDebugUtils.currentLine=23003157;
 //BA.debugLineNum = 23003157;BA.debugLine="SelectedRows.Add(rc.Row) 'Select the new row";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=23003158;
 //BA.debugLineNum = 23003158;BA.debugLine="prev = -1";
_prev = (int) (-1);
 }else {
RDebugUtils.currentLine=23003162;
 //BA.debugLineNum = 23003162;BA.debugLine="If (SelectedRows.Size <> 0) Then";
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()!=0)) { 
RDebugUtils.currentLine=23003163;
 //BA.debugLineNum = 23003163;BA.debugLine="prev = SelectedRows.Get(0) ' there should be o";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=23003164;
 //BA.debugLineNum = 23003164;BA.debugLine="SelectedRows.set(0, rc.Row) ' change it to the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (0),(Object)(_rc.Row /*int*/ ));
 }else {
RDebugUtils.currentLine=23003166;
 //BA.debugLineNum = 23003166;BA.debugLine="prev = -1";
_prev = (int) (-1);
RDebugUtils.currentLine=23003167;
 //BA.debugLineNum = 23003167;BA.debugLine="SelectedRows.Add(rc.Row)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
 };
 };
 }else {
RDebugUtils.currentLine=23003172;
 //BA.debugLineNum = 23003172;BA.debugLine="prev = SelectedRows.Get(prevIndex) ' should be R";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_previndex)));
RDebugUtils.currentLine=23003173;
 //BA.debugLineNum = 23003173;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=23003176;
 //BA.debugLineNum = 23003176;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
RDebugUtils.currentLine=23003177;
 //BA.debugLineNum = 23003177;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=23003178;
 //BA.debugLineNum = 23003178;BA.debugLine="HideRow(prev)";
__ref._hiderow /*String*/ (null,_prev);
RDebugUtils.currentLine=23003179;
 //BA.debugLineNum = 23003179;BA.debugLine="ShowRow(prev)";
__ref._showrow /*void*/ (null,_prev);
 };
 };
RDebugUtils.currentLine=23003183;
 //BA.debugLineNum = 23003183;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=23003184;
 //BA.debugLineNum = 23003184;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=23003185;
 //BA.debugLineNum = 23003185;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=23003186;
 //BA.debugLineNum = 23003186;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=23003188;
 //BA.debugLineNum = 23003188;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_longclick", false))
	 {return ((String) Debug.delegate(ba, "cell_longclick", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellLongCl";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick")) { 
RDebugUtils.currentLine=22675464;
 //BA.debugLineNum = 22675464;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellLongClick";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=22675466;
 //BA.debugLineNum = 22675466;BA.debugLine="End Sub";
return "";
}
public boolean  _check1ddoubleallsame(b4a.example.ef.table __ref,double[] _arrdouble,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1ddoubleallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1ddoubleallsame", new Object[] {_arrdouble,_istart,_iend}));}
int _i = 0;
double _dval = 0;
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Sub Check1DDoubleAllSame(arrDouble() As Double, iS";
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="Dim dVal As Double";
_dval = 0;
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="If arrDouble.Length = 1 Then";
if (_arrdouble.length==1) { 
RDebugUtils.currentLine=33619974;
 //BA.debugLineNum = 33619974;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=33619977;
 //BA.debugLineNum = 33619977;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33619978;
 //BA.debugLineNum = 33619978;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=33619981;
 //BA.debugLineNum = 33619981;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33619982;
 //BA.debugLineNum = 33619982;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=33619985;
 //BA.debugLineNum = 33619985;BA.debugLine="dVal = arrDouble(0)";
_dval = _arrdouble[(int) (0)];
RDebugUtils.currentLine=33619987;
 //BA.debugLineNum = 33619987;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=33619988;
 //BA.debugLineNum = 33619988;BA.debugLine="If arrDouble(i) <> dVal Then";
if (_arrdouble[_i]!=_dval) { 
RDebugUtils.currentLine=33619989;
 //BA.debugLineNum = 33619989;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=33619993;
 //BA.debugLineNum = 33619993;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=33619995;
 //BA.debugLineNum = 33619995;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dlongallsame(b4a.example.ef.table __ref,long[] _arrlong,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dlongallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dlongallsame", new Object[] {_arrlong,_istart,_iend}));}
int _i = 0;
long _lval = 0L;
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Sub Check1DLongAllSame(arrLong() As Long, iStart A";
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=33488899;
 //BA.debugLineNum = 33488899;BA.debugLine="Dim lVal As Long";
_lval = 0L;
RDebugUtils.currentLine=33488901;
 //BA.debugLineNum = 33488901;BA.debugLine="If arrLong.Length = 1 Then";
if (_arrlong.length==1) { 
RDebugUtils.currentLine=33488902;
 //BA.debugLineNum = 33488902;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=33488905;
 //BA.debugLineNum = 33488905;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33488906;
 //BA.debugLineNum = 33488906;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=33488909;
 //BA.debugLineNum = 33488909;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33488910;
 //BA.debugLineNum = 33488910;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=33488913;
 //BA.debugLineNum = 33488913;BA.debugLine="lVal = arrLong(0)";
_lval = _arrlong[(int) (0)];
RDebugUtils.currentLine=33488915;
 //BA.debugLineNum = 33488915;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=33488916;
 //BA.debugLineNum = 33488916;BA.debugLine="If arrLong(i) <> lVal Then";
if (_arrlong[_i]!=_lval) { 
RDebugUtils.currentLine=33488917;
 //BA.debugLineNum = 33488917;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=33488921;
 //BA.debugLineNum = 33488921;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=33488923;
 //BA.debugLineNum = 33488923;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dstringallsame(b4a.example.ef.table __ref,String[] _arrstring,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dstringallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dstringallsame", new Object[] {_arrstring,_bcaseinsensitive,_istart,_iend}));}
int _i = 0;
String _str = "";
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Sub Check1DStringAllSame(arrstring() As String, bC";
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=33882115;
 //BA.debugLineNum = 33882115;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=33882117;
 //BA.debugLineNum = 33882117;BA.debugLine="If arrstring.Length = 1 Then";
if (_arrstring.length==1) { 
RDebugUtils.currentLine=33882118;
 //BA.debugLineNum = 33882118;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=33882121;
 //BA.debugLineNum = 33882121;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33882122;
 //BA.debugLineNum = 33882122;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=33882125;
 //BA.debugLineNum = 33882125;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33882126;
 //BA.debugLineNum = 33882126;BA.debugLine="iEnd = arrstring.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=33882129;
 //BA.debugLineNum = 33882129;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=33882130;
 //BA.debugLineNum = 33882130;BA.debugLine="str = arrstring(0).ToLowerCase";
_str = _arrstring[(int) (0)].toLowerCase();
RDebugUtils.currentLine=33882131;
 //BA.debugLineNum = 33882131;BA.debugLine="For i = iStart To iEnd";
{
final int step14 = 1;
final int limit14 = _iend;
_i = _istart ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=33882132;
 //BA.debugLineNum = 33882132;BA.debugLine="If arrstring(i).ToLowerCase.CompareTo(str) <> 0";
if (_arrstring[_i].toLowerCase().compareTo(_str)!=0) { 
RDebugUtils.currentLine=33882133;
 //BA.debugLineNum = 33882133;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 }else {
RDebugUtils.currentLine=33882137;
 //BA.debugLineNum = 33882137;BA.debugLine="str = arrstring(0)";
_str = _arrstring[(int) (0)];
RDebugUtils.currentLine=33882138;
 //BA.debugLineNum = 33882138;BA.debugLine="For i = iStart To iEnd";
{
final int step21 = 1;
final int limit21 = _iend;
_i = _istart ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=33882139;
 //BA.debugLineNum = 33882139;BA.debugLine="If arrstring(i).CompareTo(str) <> 0 Then";
if (_arrstring[_i].compareTo(_str)!=0) { 
RDebugUtils.currentLine=33882140;
 //BA.debugLineNum = 33882140;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 };
RDebugUtils.currentLine=33882145;
 //BA.debugLineNum = 33882145;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=33882147;
 //BA.debugLineNum = 33882147;BA.debugLine="End Sub";
return false;
}
public String[]  _checkcolumndatatypes(b4a.example.ef.table __ref,anywheresoftware.b4a.sql.SQL.CursorWrapper _mycurs) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "checkcolumndatatypes", false))
	 {return ((String[]) Debug.delegate(ba, "checkcolumndatatypes", new Object[] {_mycurs}));}
int _nbcols = 0;
int _nbrows = 0;
String[] _columntypes = null;
String _str = "";
int _col = 0;
int _row = 0;
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Private Sub CheckColumnDataTypes(MyCurs As Cursor)";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Private NbCols, NbRows As Int";
_nbcols = 0;
_nbrows = 0;
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="NbCols = MyCurs.ColumnCount";
_nbcols = _mycurs.getColumnCount();
RDebugUtils.currentLine=29032451;
 //BA.debugLineNum = 29032451;BA.debugLine="NbRows = MyCurs.RowCount";
_nbrows = _mycurs.getRowCount();
RDebugUtils.currentLine=29032453;
 //BA.debugLineNum = 29032453;BA.debugLine="Private ColumnTypes(NbCols), str As String";
_columntypes = new String[_nbcols];
java.util.Arrays.fill(_columntypes,"");
_str = "";
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=29032456;
 //BA.debugLineNum = 29032456;BA.debugLine="For col = 0 To NbCols - 1";
{
final int step6 = 1;
final int limit6 = (int) (_nbcols-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=29032457;
 //BA.debugLineNum = 29032457;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=29032458;
 //BA.debugLineNum = 29032458;BA.debugLine="For row = 0 To NbRows - 1";
{
final int step8 = 1;
final int limit8 = (int) (_nbrows-1);
_row = (int) (0) ;
for (;_row <= limit8 ;_row = _row + step8 ) {
RDebugUtils.currentLine=29032459;
 //BA.debugLineNum = 29032459;BA.debugLine="MyCurs.Position = row";
_mycurs.setPosition(_row);
RDebugUtils.currentLine=29032460;
 //BA.debugLineNum = 29032460;BA.debugLine="str = MyCurs.GetString2(col)";
_str = _mycurs.GetString2(_col);
RDebugUtils.currentLine=29032461;
 //BA.debugLineNum = 29032461;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=29032462;
 //BA.debugLineNum = 29032462;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=29032464;
 //BA.debugLineNum = 29032464;BA.debugLine="If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=29032465;
 //BA.debugLineNum = 29032465;BA.debugLine="If str.Contains(\".\") Then";
if (_str.contains(".")) { 
RDebugUtils.currentLine=29032466;
 //BA.debugLineNum = 29032466;BA.debugLine="ColumnTypes(col) = \"R\"";
_columntypes[_col] = "R";
 }else {
RDebugUtils.currentLine=29032468;
 //BA.debugLineNum = 29032468;BA.debugLine="ColumnTypes(col) = \"I\"";
_columntypes[_col] = "I";
 };
 }else {
RDebugUtils.currentLine=29032471;
 //BA.debugLineNum = 29032471;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=29032472;
 //BA.debugLineNum = 29032472;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=29032477;
 //BA.debugLineNum = 29032477;BA.debugLine="Return ColumnTypes";
if (true) return _columntypes;
RDebugUtils.currentLine=29032478;
 //BA.debugLineNum = 29032478;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="Private SV2 As ScrollView2D";
_sv2 = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="Private SVF As ScrollView";
_svf = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="Private pnlTable As Panel";
_pnltable = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="Private Header, HeaderBase As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
_headerbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102599;
 //BA.debugLineNum = 21102599;BA.debugLine="Private HeaderFirst As Panel";
_headerfirst = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102600;
 //BA.debugLineNum = 21102600;BA.debugLine="Private lblStatusLine As Label";
_lblstatusline = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21102602;
 //BA.debugLineNum = 21102602;BA.debugLine="Private pnlFastScroll As Panel";
_pnlfastscroll = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102603;
 //BA.debugLineNum = 21102603;BA.debugLine="Private pnlFastScrollCursor As Panel";
_pnlfastscrollcursor = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102604;
 //BA.debugLineNum = 21102604;BA.debugLine="Private FScCursorWidth = 25dip As Int";
_fsccursorwidth = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=21102605;
 //BA.debugLineNum = 21102605;BA.debugLine="Private FScCursorHeight = 60dip As Int";
_fsccursorheight = __c.DipToCurrent((int) (60));
RDebugUtils.currentLine=21102606;
 //BA.debugLineNum = 21102606;BA.debugLine="Private FscLabelTopDelta As Int";
_fsclabeltopdelta = 0;
RDebugUtils.currentLine=21102607;
 //BA.debugLineNum = 21102607;BA.debugLine="Private FScBackgroundColor = Colors.ARGB(48, 128,";
_fscbackgroundcolor = __c.Colors.ARGB((int) (48),(int) (128),(int) (128),(int) (128));
RDebugUtils.currentLine=21102608;
 //BA.debugLineNum = 21102608;BA.debugLine="Private FScCursorCol1 = Colors.Blue As Int";
_fsccursorcol1 = __c.Colors.Blue;
RDebugUtils.currentLine=21102609;
 //BA.debugLineNum = 21102609;BA.debugLine="Private FScCursorCol2 = Colors.Yellow As Int";
_fsccursorcol2 = __c.Colors.Yellow;
RDebugUtils.currentLine=21102610;
 //BA.debugLineNum = 21102610;BA.debugLine="Private lblFastScroll As Label";
_lblfastscroll = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21102611;
 //BA.debugLineNum = 21102611;BA.debugLine="Private FSY0, FSdY, FastScrollHeight As Int";
_fsy0 = 0;
_fsdy = 0;
_fastscrollheight = 0;
RDebugUtils.currentLine=21102612;
 //BA.debugLineNum = 21102612;BA.debugLine="Private FScScale As Double";
_fscscale = 0;
RDebugUtils.currentLine=21102613;
 //BA.debugLineNum = 21102613;BA.debugLine="Private FScTimer As Timer";
_fsctimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=21102614;
 //BA.debugLineNum = 21102614;BA.debugLine="Private mFastScroll = False As Boolean";
_mfastscroll = __c.False;
RDebugUtils.currentLine=21102615;
 //BA.debugLineNum = 21102615;BA.debugLine="Private FastScrollActive As Boolean";
_fastscrollactive = false;
RDebugUtils.currentLine=21102616;
 //BA.debugLineNum = 21102616;BA.debugLine="Private mFastScrollColumnIndex = 0 As Int";
_mfastscrollcolumnindex = (int) (0);
RDebugUtils.currentLine=21102617;
 //BA.debugLineNum = 21102617;BA.debugLine="Private mFastScrollMinItems = 50 As Int";
_mfastscrollminitems = (int) (50);
RDebugUtils.currentLine=21102618;
 //BA.debugLineNum = 21102618;BA.debugLine="Private mFastScrollShowLabel = True As Boolean";
_mfastscrollshowlabel = __c.True;
RDebugUtils.currentLine=21102619;
 //BA.debugLineNum = 21102619;BA.debugLine="Private mFastScrollFixedLabel = False As Boolean";
_mfastscrollfixedlabel = __c.False;
RDebugUtils.currentLine=21102620;
 //BA.debugLineNum = 21102620;BA.debugLine="Private mFastScrollLabelMaxChars = 10 As Int";
_mfastscrolllabelmaxchars = (int) (10);
RDebugUtils.currentLine=21102621;
 //BA.debugLineNum = 21102621;BA.debugLine="Private mFastScrollLabelWidth = 150dip As Int";
_mfastscrolllabelwidth = __c.DipToCurrent((int) (150));
RDebugUtils.currentLine=21102622;
 //BA.debugLineNum = 21102622;BA.debugLine="Private mFastScrollLabelHeight = 30dip As Int";
_mfastscrolllabelheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=21102624;
 //BA.debugLineNum = 21102624;BA.debugLine="Private cCallBack As Object";
_ccallback = new Object();
RDebugUtils.currentLine=21102625;
 //BA.debugLineNum = 21102625;BA.debugLine="Private cEventName As String";
_ceventname = "";
RDebugUtils.currentLine=21102626;
 //BA.debugLineNum = 21102626;BA.debugLine="Private cLeft, cTop , cWidth, cHeight As Int";
_cleft = 0;
_ctop = 0;
_cwidth = 0;
_cheight = 0;
RDebugUtils.currentLine=21102627;
 //BA.debugLineNum = 21102627;BA.debugLine="Public HeaderNames As List";
_headernames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102628;
 //BA.debugLineNum = 21102628;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
_selectedrows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102629;
 //BA.debugLineNum = 21102629;BA.debugLine="Private SelectedCol As Int";
_selectedcol = 0;
RDebugUtils.currentLine=21102630;
 //BA.debugLineNum = 21102630;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102631;
 //BA.debugLineNum = 21102631;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102632;
 //BA.debugLineNum = 21102632;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
RDebugUtils.currentLine=21102633;
 //BA.debugLineNum = 21102633;BA.debugLine="Private IsVisible As Boolean";
_isvisible = false;
RDebugUtils.currentLine=21102634;
 //BA.debugLineNum = 21102634;BA.debugLine="Public visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21102635;
 //BA.debugLineNum = 21102635;BA.debugLine="Private mNumberOfColumns, ColumnWidths(), cColumn";
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
RDebugUtils.currentLine=21102636;
 //BA.debugLineNum = 21102636;BA.debugLine="Private cColumnDataType() As String";
_ccolumndatatype = new String[(int) (0)];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=21102637;
 //BA.debugLineNum = 21102637;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
_crowheight = 0;
_cheadercolor = 0;
_ctablecolor = 0;
_ctextcolor = 0;
_cheaderheight = 0;
_cheadertextcolor = 0;
_cstatuslineheight = 0;
RDebugUtils.currentLine=21102638;
 //BA.debugLineNum = 21102638;BA.debugLine="Private cAutomaticWidths = False As Boolean";
_cautomaticwidths = __c.False;
RDebugUtils.currentLine=21102639;
 //BA.debugLineNum = 21102639;BA.debugLine="Private cTextSize As Float";
_ctextsize = 0f;
RDebugUtils.currentLine=21102640;
 //BA.debugLineNum = 21102640;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
RDebugUtils.currentLine=21102641;
 //BA.debugLineNum = 21102641;BA.debugLine="Private cAlignment As Int";
_calignment = 0;
RDebugUtils.currentLine=21102642;
 //BA.debugLineNum = 21102642;BA.debugLine="Private cAlignments() As Int";
_calignments = new int[(int) (0)];
;
RDebugUtils.currentLine=21102643;
 //BA.debugLineNum = 21102643;BA.debugLine="Private cAlignments0() As Int";
_calignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=21102644;
 //BA.debugLineNum = 21102644;BA.debugLine="Private MultiAlignments = False As Boolean";
_multialignments = __c.False;
RDebugUtils.currentLine=21102645;
 //BA.debugLineNum = 21102645;BA.debugLine="Private MultiTypeFace = False As Boolean";
_multitypeface = __c.False;
RDebugUtils.currentLine=21102646;
 //BA.debugLineNum = 21102646;BA.debugLine="Private MultiTextColors = False As Boolean";
_multitextcolors = __c.False;
RDebugUtils.currentLine=21102647;
 //BA.debugLineNum = 21102647;BA.debugLine="Private cHeaderAlignment = Gravity.CENTER As Int";
_cheaderalignment = __c.Gravity.CENTER;
RDebugUtils.currentLine=21102648;
 //BA.debugLineNum = 21102648;BA.debugLine="Private cHeaderAlignments() As Int";
_cheaderalignments = new int[(int) (0)];
;
RDebugUtils.currentLine=21102649;
 //BA.debugLineNum = 21102649;BA.debugLine="Private cHeaderAlignments0() As Int";
_cheaderalignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=21102650;
 //BA.debugLineNum = 21102650;BA.debugLine="Private HeaderMultiAlignments = False As Boolean";
_headermultialignments = __c.False;
RDebugUtils.currentLine=21102651;
 //BA.debugLineNum = 21102651;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
_ctypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_ctypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=21102652;
 //BA.debugLineNum = 21102652;BA.debugLine="Private cTypeFaces() As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=21102653;
 //BA.debugLineNum = 21102653;BA.debugLine="Private cTypeFaces0() As Typeface";
_ctypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=21102654;
 //BA.debugLineNum = 21102654;BA.debugLine="Private HeaderMultiTypeFace = False As Boolean";
_headermultitypeface = __c.False;
RDebugUtils.currentLine=21102655;
 //BA.debugLineNum = 21102655;BA.debugLine="Private cHeaderTypeFace = Typeface.DEFAULT As Typ";
_cheadertypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_cheadertypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=21102656;
 //BA.debugLineNum = 21102656;BA.debugLine="Private cHeaderTypeFaces() As Typeface";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=21102657;
 //BA.debugLineNum = 21102657;BA.debugLine="Private cHeaderTypeFaces0() As Typeface";
_cheadertypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=21102658;
 //BA.debugLineNum = 21102658;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
_clinewidth = (int) (__c.Max(1,__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21102659;
 //BA.debugLineNum = 21102659;BA.debugLine="Private ExtraWidth = 12dip + cLineWidth	As Int";
_extrawidth = (int) (__c.DipToCurrent((int) (12))+__ref._clinewidth /*int*/ );
RDebugUtils.currentLine=21102660;
 //BA.debugLineNum = 21102660;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
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
RDebugUtils.currentLine=21102661;
 //BA.debugLineNum = 21102661;BA.debugLine="Private SelectedCellDrawable As Object";
_selectedcelldrawable = new Object();
RDebugUtils.currentLine=21102662;
 //BA.debugLineNum = 21102662;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
_crowcolor1 = 0;
_crowcolor2 = 0;
_cselectedrowcolor = 0;
_cselectedcellcolor = 0;
_cselectedrowtextcolor = 0;
_cselectedcelltextcolor = 0;
RDebugUtils.currentLine=21102663;
 //BA.debugLineNum = 21102663;BA.debugLine="Private cSortColumn = True As Boolean";
_csortcolumn = __c.True;
RDebugUtils.currentLine=21102664;
 //BA.debugLineNum = 21102664;BA.debugLine="Private cUseColumnColors = False As Boolean";
_cusecolumncolors = __c.False;
RDebugUtils.currentLine=21102665;
 //BA.debugLineNum = 21102665;BA.debugLine="Private cSortRemoveAccents = False As Boolean";
_csortremoveaccents = __c.False;
RDebugUtils.currentLine=21102666;
 //BA.debugLineNum = 21102666;BA.debugLine="Private mFirstColumnsWidth = 0 As Int";
_mfirstcolumnswidth = (int) (0);
RDebugUtils.currentLine=21102667;
 //BA.debugLineNum = 21102667;BA.debugLine="Private mFirstColumnFixed = False As Boolean";
_mfirstcolumnfixed = __c.False;
RDebugUtils.currentLine=21102668;
 //BA.debugLineNum = 21102668;BA.debugLine="Private mNumberOfFixedColumns As Int";
_mnumberoffixedcolumns = 0;
RDebugUtils.currentLine=21102669;
 //BA.debugLineNum = 21102669;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=21102670;
 //BA.debugLineNum = 21102670;BA.debugLine="Private cvs As Canvas		' used to measure string w";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=21102671;
 //BA.debugLineNum = 21102671;BA.debugLine="Private lstRowColorIndexes As List";
_lstrowcolorindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102672;
 //BA.debugLineNum = 21102672;BA.debugLine="Private lstRowColors As List";
_lstrowcolors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102673;
 //BA.debugLineNum = 21102673;BA.debugLine="Private lstRowDrawables As List";
_lstrowdrawables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102675;
 //BA.debugLineNum = 21102675;BA.debugLine="cHeaderColor = Colors.Gray";
__ref._cheadercolor /*int*/  = __c.Colors.Gray;
RDebugUtils.currentLine=21102676;
 //BA.debugLineNum = 21102676;BA.debugLine="cTableColor = Colors.LightGray";
__ref._ctablecolor /*int*/  = __c.Colors.LightGray;
RDebugUtils.currentLine=21102677;
 //BA.debugLineNum = 21102677;BA.debugLine="cTextColor = Colors.Black";
__ref._ctextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=21102678;
 //BA.debugLineNum = 21102678;BA.debugLine="cHeaderTextColor = Colors.White";
__ref._cheadertextcolor /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=21102679;
 //BA.debugLineNum = 21102679;BA.debugLine="cTextSize = 14";
__ref._ctextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=21102680;
 //BA.debugLineNum = 21102680;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
RDebugUtils.currentLine=21102681;
 //BA.debugLineNum = 21102681;BA.debugLine="cRowColor1 = Colors.White";
__ref._crowcolor1 /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=21102682;
 //BA.debugLineNum = 21102682;BA.debugLine="cRowColor2 = 0xFF98F5FF";
__ref._crowcolor2 /*int*/  = ((int)0xff98f5ff);
RDebugUtils.currentLine=21102683;
 //BA.debugLineNum = 21102683;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
__ref._cselectedrowcolor /*int*/  = ((int)0xff007fff);
RDebugUtils.currentLine=21102684;
 //BA.debugLineNum = 21102684;BA.debugLine="cSelectedRowTextColor = Colors.Black";
__ref._cselectedrowtextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=21102685;
 //BA.debugLineNum = 21102685;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
__ref._cselectedcellcolor /*int*/  = ((int)0xfffc8eac);
RDebugUtils.currentLine=21102686;
 //BA.debugLineNum = 21102686;BA.debugLine="cSelectedCellTextColor = Colors.Black";
__ref._cselectedcelltextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=21102687;
 //BA.debugLineNum = 21102687;BA.debugLine="cRowHeight = 40dip";
__ref._crowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=21102688;
 //BA.debugLineNum = 21102688;BA.debugLine="cHeaderHeight = cRowHeight";
__ref._cheaderheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=21102689;
 //BA.debugLineNum = 21102689;BA.debugLine="cStatusLineHeight = cRowHeight";
__ref._cstatuslineheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=21102691;
 //BA.debugLineNum = 21102691;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
_csingleline = __c.True;
RDebugUtils.currentLine=21102693;
 //BA.debugLineNum = 21102693;BA.debugLine="Private mMultiSelect As Boolean = False";
_mmultiselect = __c.False;
RDebugUtils.currentLine=21102694;
 //BA.debugLineNum = 21102694;BA.debugLine="Private cAllowSelection = True As Boolean";
_callowselection = __c.True;
RDebugUtils.currentLine=21102695;
 //BA.debugLineNum = 21102695;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
_savedwidths = new int[(int) (0)];
;
RDebugUtils.currentLine=21102696;
 //BA.debugLineNum = 21102696;BA.debugLine="Private cShowStatusLine As Boolean =True";
_cshowstatusline = __c.True;
RDebugUtils.currentLine=21102698;
 //BA.debugLineNum = 21102698;BA.debugLine="Private internalPanel As Panel";
_internalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102700;
 //BA.debugLineNum = 21102700;BA.debugLine="Public sortingDir As Int = 0 ' -1,0,1 as acc, uns";
_sortingdir = (int) (0);
RDebugUtils.currentLine=21102701;
 //BA.debugLineNum = 21102701;BA.debugLine="Public sortedCol As Int = -1' hold the sorted col";
_sortedcol = (int) (-1);
RDebugUtils.currentLine=21102702;
 //BA.debugLineNum = 21102702;BA.debugLine="Private pnlSortingView As Panel";
_pnlsortingview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102704;
 //BA.debugLineNum = 21102704;BA.debugLine="Private debug_counter As Long";
_debug_counter = 0L;
RDebugUtils.currentLine=21102705;
 //BA.debugLineNum = 21102705;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
_enablestatuslineautofill = __c.True;
RDebugUtils.currentLine=21102707;
 //BA.debugLineNum = 21102707;BA.debugLine="Private pnlAsc As Panel										'added in versio";
_pnlasc = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=21102708;
 //BA.debugLineNum = 21102708;BA.debugLine="Private bmpAsc, bmpDes, bmpEqual As Bitmap					'a";
_bmpasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=21102709;
 //BA.debugLineNum = 21102709;BA.debugLine="Private cvsAsc, cvsDes, cvsEqual As Canvas					'a";
_cvsasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=21102710;
 //BA.debugLineNum = 21102710;BA.debugLine="Private cSortBitmapWidth As Int						'added in ve";
_csortbitmapwidth = 0;
RDebugUtils.currentLine=21102711;
 //BA.debugLineNum = 21102711;BA.debugLine="Private cSortBitmapHeight As Int					'added in ve";
_csortbitmapheight = 0;
RDebugUtils.currentLine=21102712;
 //BA.debugLineNum = 21102712;BA.debugLine="Private cSortBitmapColor As Int						'added in ve";
_csortbitmapcolor = 0;
RDebugUtils.currentLine=21102713;
 //BA.debugLineNum = 21102713;BA.debugLine="Private mCustomSortingBitmaps As Boolean	'added i";
_mcustomsortingbitmaps = false;
RDebugUtils.currentLine=21102714;
 //BA.debugLineNum = 21102714;BA.debugLine="Private mZeroSelection = False As Boolean";
_mzeroselection = __c.False;
RDebugUtils.currentLine=21102715;
 //BA.debugLineNum = 21102715;BA.debugLine="Private SV2Scrolls, SVFScrolls As Boolean";
_sv2scrolls = false;
_svfscrolls = false;
RDebugUtils.currentLine=21102716;
 //BA.debugLineNum = 21102716;BA.debugLine="Private SV2PosX As Int";
_sv2posx = 0;
RDebugUtils.currentLine=21102717;
 //BA.debugLineNum = 21102717;BA.debugLine="Public TableObject As Table";
_tableobject = new b4a.example.ef.table();
RDebugUtils.currentLine=21102722;
 //BA.debugLineNum = 21102722;BA.debugLine="Private arrColLong() As Long";
_arrcollong = new long[(int) (0)];
;
RDebugUtils.currentLine=21102723;
 //BA.debugLineNum = 21102723;BA.debugLine="Private arrColDouble() As Double";
_arrcoldouble = new double[(int) (0)];
;
RDebugUtils.currentLine=21102724;
 //BA.debugLineNum = 21102724;BA.debugLine="Private arrColString() As String";
_arrcolstring = new String[(int) (0)];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=21102725;
 //BA.debugLineNum = 21102725;BA.debugLine="Private arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=21102726;
 //BA.debugLineNum = 21102726;BA.debugLine="Private iPreviousSortColumn As Int = -1 'ignore w";
_iprevioussortcolumn = (int) (-1);
RDebugUtils.currentLine=21102727;
 //BA.debugLineNum = 21102727;BA.debugLine="Private bPreviousSortAscending As Boolean 'ignore";
_bprevioussortascending = false;
RDebugUtils.currentLine=21102728;
 //BA.debugLineNum = 21102728;BA.debugLine="Private mapSortingIndexes As Map";
_mapsortingindexes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=21102729;
 //BA.debugLineNum = 21102729;BA.debugLine="Private arrDataSorted() As Boolean 'added";
_arrdatasorted = new boolean[(int) (0)];
;
RDebugUtils.currentLine=21102730;
 //BA.debugLineNum = 21102730;BA.debugLine="Private bDataTempDone As Boolean 'added";
_bdatatempdone = false;
RDebugUtils.currentLine=21102731;
 //BA.debugLineNum = 21102731;BA.debugLine="Private DataTemp As List 'added";
_datatemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21102732;
 //BA.debugLineNum = 21102732;BA.debugLine="Private mMultiColumnSort As Boolean = False";
_mmulticolumnsort = __c.False;
RDebugUtils.currentLine=21102733;
 //BA.debugLineNum = 21102733;BA.debugLine="Private mSortCaseInsensitive As Boolean = False";
_msortcaseinsensitive = __c.False;
RDebugUtils.currentLine=21102735;
 //BA.debugLineNum = 21102735;BA.debugLine="End Sub";
return "";
}
public String  _clearall(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearall", false))
	 {return ((String) Debug.delegate(ba, "clearall", null));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub ClearAll";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="End Sub";
return "";
}
public String  _innerclearall(b4a.example.ef.table __ref,int _vnumberofcolumns,boolean _cleardata) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "innerclearall", false))
	 {return ((String) Debug.delegate(ba, "innerclearall", new Object[] {_vnumberofcolumns,_cleardata}));}
int _i = 0;
Object[] _cds = null;
int _color = 0;
int _col = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdi = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd1 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd2 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd3 = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd4 = null;
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int,";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="SV2.Panel.RemoveAllViews";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="SVF.Panel.RemoveAllViews";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="mNumberOfColumns = vNumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _vnumberofcolumns;
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="Dim Drawable1(mNumberOfColumns) As Object";
_drawable1 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="Dim Drawable2(mNumberOfColumns) As Object";
_drawable2 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="Dim SelectedDrawable(mNumberOfColumns) As Object";
_selecteddrawable = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
RDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21889033;
 //BA.debugLineNum = 21889033;BA.debugLine="Dim cHeaderAlignments(mNumberOfColumns) As Int";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21889034;
 //BA.debugLineNum = 21889034;BA.debugLine="Dim cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=21889035;
 //BA.debugLineNum = 21889035;BA.debugLine="Dim cHeaderTypeFaces(mNumberOfColumns) As Typefac";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=21889037;
 //BA.debugLineNum = 21889037;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21889038;
 //BA.debugLineNum = 21889038;BA.debugLine="If lstRowColors.Size > 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=21889039;
 //BA.debugLineNum = 21889039;BA.debugLine="For i = 0 To lstRowColors.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=21889040;
 //BA.debugLineNum = 21889040;BA.debugLine="Private cds(mNumberOfColumns) As Object";
_cds = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cds.length;
for (int i0 = 0;i0 < d0;i0++) {
_cds[i0] = new Object();
}
}
;
RDebugUtils.currentLine=21889041;
 //BA.debugLineNum = 21889041;BA.debugLine="Private color = lstRowColors.Get(i) As Int";
_color = (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=21889042;
 //BA.debugLineNum = 21889042;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=21889043;
 //BA.debugLineNum = 21889043;BA.debugLine="Private cdi As ColorDrawable";
_cdi = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=21889044;
 //BA.debugLineNum = 21889044;BA.debugLine="cdi.Initialize(color, 0)";
_cdi.Initialize(_color,(int) (0));
RDebugUtils.currentLine=21889045;
 //BA.debugLineNum = 21889045;BA.debugLine="cds(col) = cdi";
_cds[_col] = (Object)(_cdi.getObject());
 }
};
RDebugUtils.currentLine=21889047;
 //BA.debugLineNum = 21889047;BA.debugLine="lstRowDrawables.Add(cds)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cds));
 }
};
 };
RDebugUtils.currentLine=21889050;
 //BA.debugLineNum = 21889050;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=21889051;
 //BA.debugLineNum = 21889051;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=21889052;
 //BA.debugLineNum = 21889052;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
_cd1.Initialize(__ref._crowcolor1 /*int*/ ,(int) (0));
RDebugUtils.currentLine=21889053;
 //BA.debugLineNum = 21889053;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
_cd2.Initialize(__ref._crowcolor2 /*int*/ ,(int) (0));
RDebugUtils.currentLine=21889054;
 //BA.debugLineNum = 21889054;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=21889055;
 //BA.debugLineNum = 21889055;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=21889056;
 //BA.debugLineNum = 21889056;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=21889057;
 //BA.debugLineNum = 21889057;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=21889058;
 //BA.debugLineNum = 21889058;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889059;
 //BA.debugLineNum = 21889059;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=21889061;
 //BA.debugLineNum = 21889061;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=21889063;
 //BA.debugLineNum = 21889063;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889064;
 //BA.debugLineNum = 21889064;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=21889066;
 //BA.debugLineNum = 21889066;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=21889069;
 //BA.debugLineNum = 21889069;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889070;
 //BA.debugLineNum = 21889070;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=21889072;
 //BA.debugLineNum = 21889072;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=21889074;
 //BA.debugLineNum = 21889074;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889075;
 //BA.debugLineNum = 21889075;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=21889077;
 //BA.debugLineNum = 21889077;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 }else {
RDebugUtils.currentLine=21889081;
 //BA.debugLineNum = 21889081;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
RDebugUtils.currentLine=21889082;
 //BA.debugLineNum = 21889082;BA.debugLine="Private cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=21889083;
 //BA.debugLineNum = 21889083;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
_cd1.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=21889084;
 //BA.debugLineNum = 21889084;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
_cd2.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=21889085;
 //BA.debugLineNum = 21889085;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=21889086;
 //BA.debugLineNum = 21889086;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=21889087;
 //BA.debugLineNum = 21889087;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=21889088;
 //BA.debugLineNum = 21889088;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=21889089;
 //BA.debugLineNum = 21889089;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889090;
 //BA.debugLineNum = 21889090;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=21889092;
 //BA.debugLineNum = 21889092;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=21889094;
 //BA.debugLineNum = 21889094;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889095;
 //BA.debugLineNum = 21889095;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=21889097;
 //BA.debugLineNum = 21889097;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=21889100;
 //BA.debugLineNum = 21889100;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889101;
 //BA.debugLineNum = 21889101;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=21889103;
 //BA.debugLineNum = 21889103;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=21889105;
 //BA.debugLineNum = 21889105;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21889106;
 //BA.debugLineNum = 21889106;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=21889108;
 //BA.debugLineNum = 21889108;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 };
RDebugUtils.currentLine=21889113;
 //BA.debugLineNum = 21889113;BA.debugLine="Dim cd4 As ColorDrawable";
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=21889114;
 //BA.debugLineNum = 21889114;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
_cd4.Initialize(__ref._cselectedcellcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=21889115;
 //BA.debugLineNum = 21889115;BA.debugLine="SelectedCellDrawable = cd4";
__ref._selectedcelldrawable /*Object*/  = (Object)(_cd4.getObject());
RDebugUtils.currentLine=21889117;
 //BA.debugLineNum = 21889117;BA.debugLine="SV2.Panel.Height = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=21889118;
 //BA.debugLineNum = 21889118;BA.debugLine="SVF.Panel.Height = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=21889121;
 //BA.debugLineNum = 21889121;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=21889122;
 //BA.debugLineNum = 21889122;BA.debugLine="minVisibleRow = -1";
__ref._minvisiblerow /*int*/  = (int) (-1);
RDebugUtils.currentLine=21889123;
 //BA.debugLineNum = 21889123;BA.debugLine="maxVisibleRow = 0";
__ref._maxvisiblerow /*int*/  = (int) (0);
RDebugUtils.currentLine=21889124;
 //BA.debugLineNum = 21889124;BA.debugLine="If ClearData = True Then";
if (_cleardata==__c.True) { 
RDebugUtils.currentLine=21889125;
 //BA.debugLineNum = 21889125;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=21889127;
 //BA.debugLineNum = 21889127;BA.debugLine="LabelsCache.Initialize";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21889128;
 //BA.debugLineNum = 21889128;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=21889129;
 //BA.debugLineNum = 21889129;BA.debugLine="SV2.VerticalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=21889130;
 //BA.debugLineNum = 21889130;BA.debugLine="SVF.ScrollPosition = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setScrollPosition((int) (0));
RDebugUtils.currentLine=21889131;
 //BA.debugLineNum = 21889131;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step100 = 1;
final int limit100 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit100 ;_i = _i + step100 ) {
RDebugUtils.currentLine=21889132;
 //BA.debugLineNum = 21889132;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null)));
 }
};
RDebugUtils.currentLine=21889134;
 //BA.debugLineNum = 21889134;BA.debugLine="If IsVisible Then";
if (__ref._isvisible /*boolean*/ ) { 
RDebugUtils.currentLine=21889135;
 //BA.debugLineNum = 21889135;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=21889136;
 //BA.debugLineNum = 21889136;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=21889138;
 //BA.debugLineNum = 21889138;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=21889140;
 //BA.debugLineNum = 21889140;BA.debugLine="End Sub";
return "";
}
public String  _updateiplocation(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updateiplocation", false))
	 {return ((String) Debug.delegate(ba, "updateiplocation", null));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Private Sub updateIPLocation";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="If (SV2.Height > Data.Size * cRowHeight) Then";
if ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )) { 
RDebugUtils.currentLine=24707075;
 //BA.debugLineNum = 24707075;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cHe";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ +__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="internalPanel.Height = SV2.Height - (Data.Size *";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=24707078;
 //BA.debugLineNum = 24707078;BA.debugLine="internalPanel.Height = 0";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (0));
 };
RDebugUtils.currentLine=24707080;
 //BA.debugLineNum = 24707080;BA.debugLine="End Sub";
return "";
}
public String  _clearselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearselection", false))
	 {return ((String) Debug.delegate(ba, "clearselection", null));}
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Public Sub clearSelection";
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="End Sub";
return "";
}
public String  _refreshtable(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "refreshtable", false))
	 {return ((String) Debug.delegate(ba, "refreshtable", null));}
int _i = 0;
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub RefreshTable";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step2 = 1;
final int limit2 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
RDebugUtils.currentLine=23920644;
 //BA.debugLineNum = 23920644;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=23920646;
 //BA.debugLineNum = 23920646;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _createnewlabels(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "createnewlabels", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper[]) Debug.delegate(ba, "createnewlabels", null));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Private Sub CreateNewLabels As Label()";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Dim lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=22544387;
 //BA.debugLineNum = 22544387;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="rc.Col = i";
_rc.Col /*int*/  = _i;
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="lbl.Initialize(\"Cell\")";
_lbl.Initialize(ba,"Cell");
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=22544394;
 //BA.debugLineNum = 22544394;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22544395;
 //BA.debugLineNum = 22544395;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=22544397;
 //BA.debugLineNum = 22544397;BA.debugLine="lbl.TextColor = cTextColors(i)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 };
RDebugUtils.currentLine=22544400;
 //BA.debugLineNum = 22544400;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22544401;
 //BA.debugLineNum = 22544401;BA.debugLine="lbl.Typeface = cTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=22544403;
 //BA.debugLineNum = 22544403;BA.debugLine="lbl.Typeface = cTypeFaces(i)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()));
 };
RDebugUtils.currentLine=22544406;
 //BA.debugLineNum = 22544406;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=22544408;
 //BA.debugLineNum = 22544408;BA.debugLine="lbl.SingleLine = cSingleLine";
_lbl.setSingleLine(__ref._csingleline /*boolean*/ );
RDebugUtils.currentLine=22544409;
 //BA.debugLineNum = 22544409;BA.debugLine="lbl.Tag = rc";
_lbl.setTag((Object)(_rc));
RDebugUtils.currentLine=22544410;
 //BA.debugLineNum = 22544410;BA.debugLine="lbls(i) = lbl";
_lbls[_i] = _lbl;
 }
};
RDebugUtils.currentLine=22544412;
 //BA.debugLineNum = 22544412;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=22544413;
 //BA.debugLineNum = 22544413;BA.debugLine="End Sub";
return null;
}
public String  _setpadding(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setpadding", false))
	 {return ((String) Debug.delegate(ba, "setpadding", new Object[] {_v,_left,_top,_right,_bottom}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="v.Padding = Array As Int (Left, Top, Right, Botto";
_v.setPadding(new int[]{_left,_top,_right,_bottom});
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="pnlTable = Base";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="cLeft = Base.Left";
__ref._cleft /*int*/  = _base.getLeft();
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="cTop = Base.Top";
__ref._ctop /*int*/  = _base.getTop();
RDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="cWidth = Base.Width";
__ref._cwidth /*int*/  = _base.getWidth();
RDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="cHeight = Base.Height";
__ref._cheight /*int*/  = _base.getHeight();
RDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21233674;
 //BA.debugLineNum = 21233674;BA.debugLine="Select Props.Get(\"TextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("TextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=21233676;
 //BA.debugLineNum = 21233676;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=21233678;
 //BA.debugLineNum = 21233678;BA.debugLine="cAlignment = Gravity.CENTER";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=21233680;
 //BA.debugLineNum = 21233680;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=21233684;
 //BA.debugLineNum = 21233684;BA.debugLine="Select Props.Get(\"HeaderTextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("HeaderTextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=21233686;
 //BA.debugLineNum = 21233686;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=21233688;
 //BA.debugLineNum = 21233688;BA.debugLine="cHeaderAlignment = Gravity.CENTER";
__ref._cheaderalignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=21233690;
 //BA.debugLineNum = 21233690;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=21233693;
 //BA.debugLineNum = 21233693;BA.debugLine="cLineWidth = DipToCurrent(Props.Get(\"LineWidth\"))";
__ref._clinewidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("LineWidth")))));
RDebugUtils.currentLine=21233695;
 //BA.debugLineNum = 21233695;BA.debugLine="mNumberOfColumns = Props.Get(\"NumberOfColumns\")";
__ref._mnumberofcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfColumns"))));
RDebugUtils.currentLine=21233696;
 //BA.debugLineNum = 21233696;BA.debugLine="mNumberOfFixedColumns = Props.Get(\"NumberOfFixedC";
__ref._mnumberoffixedcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfFixedColumns"))));
RDebugUtils.currentLine=21233697;
 //BA.debugLineNum = 21233697;BA.debugLine="mFirstColumnFixed = Props.Get(\"FirstColumnFixed\")";
__ref._mfirstcolumnfixed /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("FirstColumnFixed")));
RDebugUtils.currentLine=21233698;
 //BA.debugLineNum = 21233698;BA.debugLine="If mFirstColumnFixed = True And mNumberOfFixedCol";
if (__ref._mfirstcolumnfixed /*boolean*/ ==__c.True && __ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=21233699;
 //BA.debugLineNum = 21233699;BA.debugLine="mNumberOfFixedColumns = 1";
__ref._mnumberoffixedcolumns /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=21233701;
 //BA.debugLineNum = 21233701;BA.debugLine="mMultiSelect = Props.Get(\"MultiSelect\")";
__ref._mmultiselect /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("MultiSelect")));
RDebugUtils.currentLine=21233702;
 //BA.debugLineNum = 21233702;BA.debugLine="cSingleLine = Props.GetDefault(\"SingleLine\", True";
__ref._csingleline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SingleLine"),(Object)(__c.True)));
RDebugUtils.currentLine=21233703;
 //BA.debugLineNum = 21233703;BA.debugLine="mZeroSelection = Props.Get(\"ZeroSelection\")";
__ref._mzeroselection /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZeroSelection")));
RDebugUtils.currentLine=21233704;
 //BA.debugLineNum = 21233704;BA.debugLine="cHeaderColor = Props.Get(\"HeaderColor\")";
__ref._cheadercolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderColor"))));
RDebugUtils.currentLine=21233705;
 //BA.debugLineNum = 21233705;BA.debugLine="cTableColor = Props.Get(\"TableColor\")";
__ref._ctablecolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("TableColor"))));
RDebugUtils.currentLine=21233706;
 //BA.debugLineNum = 21233706;BA.debugLine="cHeaderTextColor = Props.Get(\"HeaderTextColor\")";
__ref._cheadertextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderTextColor"))));
RDebugUtils.currentLine=21233707;
 //BA.debugLineNum = 21233707;BA.debugLine="cTextColor = Props.Get(\"CellTextColor\")";
__ref._ctextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("CellTextColor"))));
RDebugUtils.currentLine=21233708;
 //BA.debugLineNum = 21233708;BA.debugLine="cRowColor1 = Props.Get(\"Row1Color\")";
__ref._crowcolor1 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row1Color"))));
RDebugUtils.currentLine=21233709;
 //BA.debugLineNum = 21233709;BA.debugLine="cRowColor2 = Props.Get(\"Row2Color\")";
__ref._crowcolor2 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row2Color"))));
RDebugUtils.currentLine=21233710;
 //BA.debugLineNum = 21233710;BA.debugLine="cSelectedRowColor = Props.Get(\"SelectedRowColor\")";
__ref._cselectedrowcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedRowColor"))));
RDebugUtils.currentLine=21233711;
 //BA.debugLineNum = 21233711;BA.debugLine="cSelectedCellColor = Props.Get(\"SelectedCellColor";
__ref._cselectedcellcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedCellColor"))));
RDebugUtils.currentLine=21233713;
 //BA.debugLineNum = 21233713;BA.debugLine="cTextSize = Props.Get(\"TextSize\")";
__ref._ctextsize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));
RDebugUtils.currentLine=21233715;
 //BA.debugLineNum = 21233715;BA.debugLine="cRowHeight = DipToCurrent(Props.Get(\"RowHeight\"))";
__ref._crowheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("RowHeight")))));
RDebugUtils.currentLine=21233716;
 //BA.debugLineNum = 21233716;BA.debugLine="cHeaderHeight = DipToCurrent(Props.Get(\"HeaderHei";
__ref._cheaderheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("HeaderHeight")))));
RDebugUtils.currentLine=21233717;
 //BA.debugLineNum = 21233717;BA.debugLine="cShowStatusLine = Props.Get(\"ShowStatusLine\")";
__ref._cshowstatusline /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowStatusLine")));
RDebugUtils.currentLine=21233718;
 //BA.debugLineNum = 21233718;BA.debugLine="cStatusLineHeight = DipToCurrent(Props.GetDefault";
__ref._cstatuslineheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("HeaderHeight"),(Object)(40)))));
RDebugUtils.currentLine=21233719;
 //BA.debugLineNum = 21233719;BA.debugLine="cSortColumn = Props.Get(\"SortColumn\")";
__ref._csortcolumn /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortColumn")));
RDebugUtils.currentLine=21233720;
 //BA.debugLineNum = 21233720;BA.debugLine="cSortRemoveAccents = Props.Get(\"SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortRemoveAccents")));
RDebugUtils.currentLine=21233721;
 //BA.debugLineNum = 21233721;BA.debugLine="cSortBitmapWidth = DipToCurrent(Props.Get(\"SortBi";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapWidth")))));
RDebugUtils.currentLine=21233722;
 //BA.debugLineNum = 21233722;BA.debugLine="cSortBitmapColor = Props.Get(\"SortBitmapColor\")";
__ref._csortbitmapcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapColor"))));
RDebugUtils.currentLine=21233724;
 //BA.debugLineNum = 21233724;BA.debugLine="mFastScroll = Props.GetDefault(\"FastScroll\", Fals";
__ref._mfastscroll /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScroll"),(Object)(__c.False)));
RDebugUtils.currentLine=21233725;
 //BA.debugLineNum = 21233725;BA.debugLine="mFastScrollMinItems = Props.GetDefault(\"FastScrol";
__ref._mfastscrollminitems /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollMinItems"),(Object)(50))));
RDebugUtils.currentLine=21233726;
 //BA.debugLineNum = 21233726;BA.debugLine="mFastScrollColumnIndex = Props.GetDefault(\"FastSc";
__ref._mfastscrollcolumnindex /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollColumnIndex"),(Object)(0))));
RDebugUtils.currentLine=21233727;
 //BA.debugLineNum = 21233727;BA.debugLine="mFastScrollShowLabel = Props.GetDefault(\"FastScro";
__ref._mfastscrollshowlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollShowLabel"),(Object)(__c.True)));
RDebugUtils.currentLine=21233728;
 //BA.debugLineNum = 21233728;BA.debugLine="mFastScrollFixedLabel = Props.GetDefault(\"FastScr";
__ref._mfastscrollfixedlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollFixedLabel"),(Object)(__c.False)));
RDebugUtils.currentLine=21233729;
 //BA.debugLineNum = 21233729;BA.debugLine="mFastScrollLabelMaxChars = Props.GetDefault(\"Fast";
__ref._mfastscrolllabelmaxchars /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelMaxChars"),(Object)(10))));
RDebugUtils.currentLine=21233730;
 //BA.debugLineNum = 21233730;BA.debugLine="mFastScrollLabelWidth = DipToCurrent(Props.GetDef";
__ref._mfastscrolllabelwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelWidth"),(Object)(__c.DipToCurrent((int) (150)))))));
RDebugUtils.currentLine=21233731;
 //BA.debugLineNum = 21233731;BA.debugLine="mFastScrollLabelHeight = DipToCurrent(Props.GetDe";
__ref._mfastscrolllabelheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelHeight"),(Object)(__c.DipToCurrent((int) (30)))))));
RDebugUtils.currentLine=21233732;
 //BA.debugLineNum = 21233732;BA.debugLine="mSortCaseInsensitive = Props.GetDefault(\"SortCase";
__ref._msortcaseinsensitive /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SortCaseInsensitive"),(Object)(__c.False)));
RDebugUtils.currentLine=21233733;
 //BA.debugLineNum = 21233733;BA.debugLine="mMultiColumnSort = Props.GetDefault(\"MultiColumnS";
__ref._mmulticolumnsort /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MultiColumnSort"),(Object)(__c.False)));
RDebugUtils.currentLine=21233735;
 //BA.debugLineNum = 21233735;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=21233736;
 //BA.debugLineNum = 21233736;BA.debugLine="End Sub";
return "";
}
public String  _drawfastscrollcursor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "drawfastscrollcursor", false))
	 {return ((String) Debug.delegate(ba, "drawfastscrollcursor", null));}
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
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Private Sub DrawFastScrollCursor";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Private pthArrow As Path";
_ptharrow = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="Private cvsFSc As Canvas";
_cvsfsc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="Private x1, x2, x3, y1, y2, dd, rr As Int";
_x1 = 0;
_x2 = 0;
_x3 = 0;
_y1 = 0;
_y2 = 0;
_dd = 0;
_rr = 0;
RDebugUtils.currentLine=21626884;
 //BA.debugLineNum = 21626884;BA.debugLine="Private rct As Rect";
_rct = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=21626886;
 //BA.debugLineNum = 21626886;BA.debugLine="rr = 7dip";
_rr = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=21626888;
 //BA.debugLineNum = 21626888;BA.debugLine="cvsFSc.Initialize(pnlFastScrollCursor)";
_cvsfsc.Initialize((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=21626889;
 //BA.debugLineNum = 21626889;BA.debugLine="rct.Initialize(0, 0, FScCursorWidth, FScCursorHei";
_rct.Initialize((int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=21626890;
 //BA.debugLineNum = 21626890;BA.debugLine="cvsFSc.DrawRect(rct, Colors.Transparent, True, 1d";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__c.Colors.Transparent,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626892;
 //BA.debugLineNum = 21626892;BA.debugLine="cvsFSc.DrawCircle(rr, rr, rr, FScCursorCol1, True";
_cvsfsc.DrawCircle((float) (_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626893;
 //BA.debugLineNum = 21626893;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, rr, rr, FS";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626894;
 //BA.debugLineNum = 21626894;BA.debugLine="cvsFSc.DrawCircle(rr, FScCursorHeight - rr, rr, F";
_cvsfsc.DrawCircle((float) (_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626895;
 //BA.debugLineNum = 21626895;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, FScCursorH";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626897;
 //BA.debugLineNum = 21626897;BA.debugLine="rct.Initialize(rr, 0, FScCursorWidth - rr, rr)";
_rct.Initialize(_rr,(int) (0),(int) (__ref._fsccursorwidth /*int*/ -_rr),_rr);
RDebugUtils.currentLine=21626898;
 //BA.debugLineNum = 21626898;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626899;
 //BA.debugLineNum = 21626899;BA.debugLine="rct.Initialize(0, rr, FScCursorWidth, FScCursorHe";
_rct.Initialize((int) (0),_rr,__ref._fsccursorwidth /*int*/ ,(int) (__ref._fsccursorheight /*int*/ -_rr));
RDebugUtils.currentLine=21626900;
 //BA.debugLineNum = 21626900;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626901;
 //BA.debugLineNum = 21626901;BA.debugLine="rct.Initialize(rr, FScCursorHeight - rr, FScCurso";
_rct.Initialize(_rr,(int) (__ref._fsccursorheight /*int*/ -_rr),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=21626902;
 //BA.debugLineNum = 21626902;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626904;
 //BA.debugLineNum = 21626904;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 - 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626905;
 //BA.debugLineNum = 21626905;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2, FScCur";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626906;
 //BA.debugLineNum = 21626906;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 + 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626908;
 //BA.debugLineNum = 21626908;BA.debugLine="dd = 7dip";
_dd = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=21626909;
 //BA.debugLineNum = 21626909;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=21626910;
 //BA.debugLineNum = 21626910;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=21626911;
 //BA.debugLineNum = 21626911;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=21626912;
 //BA.debugLineNum = 21626912;BA.debugLine="y2 = dd";
_y2 = _dd;
RDebugUtils.currentLine=21626913;
 //BA.debugLineNum = 21626913;BA.debugLine="y1 = y2 + dd";
_y1 = (int) (_y2+_dd);
RDebugUtils.currentLine=21626914;
 //BA.debugLineNum = 21626914;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=21626915;
 //BA.debugLineNum = 21626915;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=21626916;
 //BA.debugLineNum = 21626916;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=21626917;
 //BA.debugLineNum = 21626917;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626919;
 //BA.debugLineNum = 21626919;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=21626920;
 //BA.debugLineNum = 21626920;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=21626921;
 //BA.debugLineNum = 21626921;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=21626922;
 //BA.debugLineNum = 21626922;BA.debugLine="y2 = FScCursorHeight - dd";
_y2 = (int) (__ref._fsccursorheight /*int*/ -_dd);
RDebugUtils.currentLine=21626923;
 //BA.debugLineNum = 21626923;BA.debugLine="y1 = y2 - dd";
_y1 = (int) (_y2-_dd);
RDebugUtils.currentLine=21626924;
 //BA.debugLineNum = 21626924;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=21626925;
 //BA.debugLineNum = 21626925;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=21626926;
 //BA.debugLineNum = 21626926;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=21626927;
 //BA.debugLineNum = 21626927;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21626928;
 //BA.debugLineNum = 21626928;BA.debugLine="pnlFastScrollCursor.Invalidate";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=21626929;
 //BA.debugLineNum = 21626929;BA.debugLine="End Sub";
return "";
}
public String  _fastscrolltimer_tick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "fastscrolltimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fastscrolltimer_tick", null));}
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Private Sub FastScrollTimer_Tick";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="FScTimer.Enabled = False";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=26411011;
 //BA.debugLineNum = 26411011;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=26411012;
 //BA.debugLineNum = 26411012;BA.debugLine="End Sub";
return "";
}
public boolean  _getallowselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getallowselection", false))
	 {return ((Boolean) Debug.delegate(ba, "getallowselection", null));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub getAllowSelection As Boolean";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="Return cAllowSelection";
if (true) return __ref._callowselection /*boolean*/ ;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="End Sub";
return false;
}
public int  _getcellalignment(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcellalignment", false))
	 {return ((Integer) Debug.delegate(ba, "getcellalignment", null));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Public Sub getCellAlignment As Int";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="Return cAlignment";
if (true) return __ref._calignment /*int*/ ;
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="End Sub";
return 0;
}
public int[]  _getcolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumncolors", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumncolors", null));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub GetColumnColors As Int()";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Return cColumnColors";
if (true) return __ref._ccolumncolors /*int[]*/ ;
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="End Sub";
return null;
}
public String  _getcolumndatatype(b4a.example.ef.table __ref,int _column) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "getcolumndatatype", new Object[] {_column}));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Public Sub GetColumnDataType(Column As Int) As Str";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=30867462;
 //BA.debugLineNum = 30867462;BA.debugLine="Return cColumnDataType(Column)";
if (true) return __ref._ccolumndatatype /*String[]*/ [_column];
RDebugUtils.currentLine=30867463;
 //BA.debugLineNum = 30867463;BA.debugLine="End Sub";
return "";
}
public String[]  _getcolumndatatypes(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatypes", false))
	 {return ((String[]) Debug.delegate(ba, "getcolumndatatypes", null));}
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Public Sub GetColumnDataTypes As String()";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="Return cColumnDataType";
if (true) return __ref._ccolumndatatype /*String[]*/ ;
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="End Sub";
return null;
}
public int[]  _getcolumnwidths(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumnwidths", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumnwidths", null));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub GetColumnWidths As Int()";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Return SavedWidths";
if (true) return __ref._savedwidths /*int[]*/ ;
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="End Sub";
return null;
}
public int  _getcontrastcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcontrastcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getcontrastcolor", new Object[] {_color}));}
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
int _yiq = 0;
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=32112644;
 //BA.debugLineNum = 32112644;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=32112645;
 //BA.debugLineNum = 32112645;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=32112648;
 //BA.debugLineNum = 32112648;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
RDebugUtils.currentLine=32112650;
 //BA.debugLineNum = 32112650;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
RDebugUtils.currentLine=32112651;
 //BA.debugLineNum = 32112651;BA.debugLine="Return Colors.Black";
if (true) return __c.Colors.Black;
 }else {
RDebugUtils.currentLine=32112653;
 //BA.debugLineNum = 32112653;BA.debugLine="Return Colors.White";
if (true) return __c.Colors.White;
 };
RDebugUtils.currentLine=32112655;
 //BA.debugLineNum = 32112655;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscroll", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscroll", null));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Public Sub getFastScroll As Boolean";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="Return mFastScroll";
if (true) return __ref._mfastscroll /*boolean*/ ;
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrollcolumnindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollcolumnindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollcolumnindex", null));}
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub getFastScrollColumnIndex As Int";
RDebugUtils.currentLine=32440321;
 //BA.debugLineNum = 32440321;BA.debugLine="Return mFastScrollColumnIndex";
if (true) return __ref._mfastscrollcolumnindex /*int*/ ;
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollfixedlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollfixedlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollfixedlabel", null));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Public Sub getFastScrollFixedLabel As Boolean";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="Return mFastScrollFixedLabel";
if (true) return __ref._mfastscrollfixedlabel /*boolean*/ ;
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrolllabelheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelheight", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelheight", null));}
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Public Sub getFastScrollLabelHeight As Int";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelmaxchars(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelmaxchars", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelmaxchars", null));}
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub getFastScrollLabelMaxChars As Int";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="Return mFastScrollLabelMaxChars";
if (true) return __ref._mfastscrolllabelmaxchars /*int*/ ;
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelwidth", null));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub getFastScrollLabelWidth As Int";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrollminitems(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollminitems", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollminitems", null));}
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Public Sub getFastScrollMinItems As Int";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="Return mFastScrollMinItems";
if (true) return __ref._mfastscrollminitems /*int*/ ;
RDebugUtils.currentLine=32309250;
 //BA.debugLineNum = 32309250;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollshowlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollshowlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollshowlabel", null));}
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub getFastScrollShowLabel As Boolean";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="Return mFastScrollShowLabel";
if (true) return __ref._mfastscrollshowlabel /*boolean*/ ;
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="End Sub";
return false;
}
public boolean  _getfirstcolumnfixed(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfirstcolumnfixed", false))
	 {return ((Boolean) Debug.delegate(ba, "getfirstcolumnfixed", null));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Public Sub getFirstColumnFixed As Boolean";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Return mFirstColumnFixed";
if (true) return __ref._mfirstcolumnfixed /*boolean*/ ;
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="End Sub";
return false;
}
public int  _getheadercolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Return cHeaderColor";
if (true) return __ref._cheadercolor /*int*/ ;
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadercolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadercolors", null));}
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub GetHeaderColors As Int()";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Return cHeaderColors";
if (true) return __ref._cheadercolors /*int[]*/ ;
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="End Sub";
return null;
}
public int  _getheaderheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheaderheight", null));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub getHeaderHeight As Int";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Return cHeaderHeight";
if (true) return __ref._cheaderheight /*int*/ ;
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Public Sub getHeaderPanel As Panel";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Return Header";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="End Sub";
return null;
}
public int  _getheadertextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadertextcolor", null));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Public Sub getHeaderTextColor As Int";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="Return cHeaderTextColor";
if (true) return __ref._cheadertextcolor /*int*/ ;
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadertextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadertextcolors", null));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="Return cHeaderTextColors";
if (true) return __ref._cheadertextcolors /*int[]*/ ;
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _getheadertypeface(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertypeface", false))
	 {return ((anywheresoftware.b4a.keywords.constants.TypefaceWrapper) Debug.delegate(ba, "getheadertypeface", null));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Public Sub getHeaderTypeFace As Typeface";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Return cHeaderTypeFace";
if (true) return __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="End Sub";
return null;
}
public int  _getheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="Return pnlTable.Height";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="End Sub";
return 0;
}
public int  _getinnertotalwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getinnertotalwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getinnertotalwidth", null));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Public Sub getInnerTotalWidth As Int";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="Return Header.Width";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
 }else {
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="Return HeaderFirst.Width + Header.Width";
if (true) return (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.LabelWrapper[]  _getlabels(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getlabels", false))
	 {return ((anywheresoftware.b4a.objects.LabelWrapper[]) Debug.delegate(ba, "getlabels", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
b4a.example.ef.table._rowcol _rc = null;
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="lbls = CreateNewLabels";
_lbls = __ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
 };
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=22478859;
 //BA.debugLineNum = 22478859;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.example.ef.table._rowcol)(_lbls[_i].getTag());
RDebugUtils.currentLine=22478860;
 //BA.debugLineNum = 22478860;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
RDebugUtils.currentLine=22478862;
 //BA.debugLineNum = 22478862;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=22478863;
 //BA.debugLineNum = 22478863;BA.debugLine="End Sub";
return null;
}
public int  _getleft(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Return pnlTable.Left";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="End Sub";
return 0;
}
public int  _getlinewidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getlinewidth", false))
	 {return ((Integer) Debug.delegate(ba, "getlinewidth", null));}
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub getLineWidth As Int";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Return cLineWidth";
if (true) return __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="End Sub";
return 0;
}
public boolean  _getmulticolumnsort(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmulticolumnsort", false))
	 {return ((Boolean) Debug.delegate(ba, "getmulticolumnsort", null));}
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Public Sub getMultiColumnSort As Boolean";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Return mMultiColumnSort";
if (true) return __ref._mmulticolumnsort /*boolean*/ ;
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="End Sub";
return false;
}
public boolean  _getmultiselect(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmultiselect", false))
	 {return ((Boolean) Debug.delegate(ba, "getmultiselect", null));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Public Sub getMultiSelect As Boolean";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Return mMultiSelect";
if (true) return __ref._mmultiselect /*boolean*/ ;
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="End Sub";
return false;
}
public int  _getnumberofcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofcolumns", null));}
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Public Sub getNumberOfColumns As Int";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="Return mNumberOfColumns";
if (true) return __ref._mnumberofcolumns /*int*/ ;
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberoffixedcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberoffixedcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberoffixedcolumns", null));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Public Sub getNumberOfFixedColumns As Int";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Return mNumberOfFixedColumns";
if (true) return __ref._mnumberoffixedcolumns /*int*/ ;
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberofrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofrows", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofrows", null));}
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Public Sub getNumberOfRows As Int";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Return pnlTable";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="End Sub";
return null;
}
public int  _getrowcolor1(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor1", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor1", null));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Public Sub getRowColor1 As Int";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="Return cRowColor1";
if (true) return __ref._crowcolor1 /*int*/ ;
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolor2(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor2", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor2", null));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Public Sub getRowColor2 As Int";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="Return cRowColor2";
if (true) return __ref._crowcolor2 /*int*/ ;
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolorn", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Public Sub GetRowColorN(Row As Int) As Int";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="Return lstRowColors.Get(lstRowColorIndexes.Get(Ro";
if (true) return (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2))));
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="End Sub";
return 0;
}
public int  _getrowheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowheight", false))
	 {return ((Integer) Debug.delegate(ba, "getrowheight", null));}
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Public Sub getRowHeight As Int";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Return cRowHeight";
if (true) return __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcellcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcellcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcellcolor", null));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Public Sub getSelectedCellColor As Int";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="Return cSelectedCellColor";
if (true) return __ref._cselectedcellcolor /*int*/ ;
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcelltextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcelltextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcelltextcolor", null));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Public Sub getSelectedCellTextColor As Int";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="Return cSelectedCellTextColor";
if (true) return __ref._cselectedcelltextcolor /*int*/ ;
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedrowcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowcolor", null));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub getSelectedRowColor As Int";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Return cSelectedRowColor";
if (true) return __ref._cselectedrowcolor /*int*/ ;
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrows", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getselectedrows", null));}
anywheresoftware.b4a.objects.collections.List _sr = null;
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub getSelectedRows As List";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Dim sr As List";
_sr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="sr.Initialize";
_sr.Initialize();
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="sr.AddAll(SelectedRows)";
_sr.AddAll(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=24379396;
 //BA.debugLineNum = 24379396;BA.debugLine="Return sr";
if (true) return _sr;
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="End Sub";
return null;
}
public int  _getselectedrowtextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowtextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowtextcolor", null));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub getSelectedRowTextColor As Int";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Return cSelectedRowTextColor";
if (true) return __ref._cselectedrowtextcolor /*int*/ ;
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="End Sub";
return 0;
}
public boolean  _getshowstatusline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getshowstatusline", false))
	 {return ((Boolean) Debug.delegate(ba, "getshowstatusline", null));}
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Public Sub getShowStatusLine As Boolean";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="Return cShowStatusLine";
if (true) return __ref._cshowstatusline /*boolean*/ ;
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="End Sub";
return false;
}
public boolean  _getsingleline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsingleline", false))
	 {return ((Boolean) Debug.delegate(ba, "getsingleline", null));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Public Sub getSingleLine As Boolean";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="Return cSingleLine";
if (true) return __ref._csingleline /*boolean*/ ;
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="End Sub";
return false;
}
public long  _getsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Long) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Public Sub getSize As Long";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Return Data.Size";
if (true) return (long) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="End Sub";
return 0L;
}
public int  _getsortbitmapcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapcolor", null));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub getSortBitmapColor As Int";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="Return cSortBitmapColor";
if (true) return __ref._csortbitmapcolor /*int*/ ;
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="End Sub";
return 0;
}
public int  _getsortbitmapwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapwidth", null));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Public Sub getSortBitmapWidth As Int";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="Return cSortBitmapWidth";
if (true) return __ref._csortbitmapwidth /*int*/ ;
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="End Sub";
return 0;
}
public boolean  _getsortcaseinsensitive(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcaseinsensitive", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcaseinsensitive", null));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Public Sub getSortCaseInsensitive As Boolean";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Return mSortCaseInsensitive";
if (true) return __ref._msortcaseinsensitive /*boolean*/ ;
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortcolumn(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcolumn", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcolumn", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Public Sub getSortColumn As Boolean";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="Return cSortColumn";
if (true) return __ref._csortcolumn /*boolean*/ ;
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortremoveaccents(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortremoveaccents", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortremoveaccents", null));}
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Public Sub getSortRemoveAccents As Boolean";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Return cSortRemoveAccents";
if (true) return __ref._csortremoveaccents /*boolean*/ ;
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="End Sub";
return false;
}
public int  _getstatuslineheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getstatuslineheight", false))
	 {return ((Integer) Debug.delegate(ba, "getstatuslineheight", null));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Public Sub getStatusLineHeight As Int";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Return cStatusLineHeight";
if (true) return __ref._cstatuslineheight /*int*/ ;
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="End Sub";
return 0;
}
public int  _gettablecolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettablecolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettablecolor", null));}
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Public Sub getTableColor As Int";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="Return cTableColor";
if (true) return __ref._ctablecolor /*int*/ ;
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettag", false))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Public Sub getTag As Object";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="Return pnlTable.Tag";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="End Sub";
return null;
}
public int  _gettextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="Return cTextColor";
if (true) return __ref._ctextcolor /*int*/ ;
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="End Sub";
return 0;
}
public int[]  _gettextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "gettextcolors", null));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Public Sub GetTextColors As Int()";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Return cTextColors";
if (true) return __ref._ctextcolors /*int[]*/ ;
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="End Sub";
return null;
}
public float  _gettextsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextsize", false))
	 {return ((Float) Debug.delegate(ba, "gettextsize", null));}
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Public Sub getTextSize As Float";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="Return cTextSize";
if (true) return __ref._ctextsize /*float*/ ;
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Return pnlTable.Top";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="End Sub";
return 0;
}
public int  _gettoprowindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettoprowindex", false))
	 {return ((Integer) Debug.delegate(ba, "gettoprowindex", null));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub getTopRowIndex As Int";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Return SV2.VerticalScrollPosition / cRowHeight";
if (true) return (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
return 0;
}
public boolean  _getusecolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getusecolumncolors", false))
	 {return ((Boolean) Debug.delegate(ba, "getusecolumncolors", null));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Public Sub getUseColumnColors As Boolean";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Return cUseColumnColors";
if (true) return __ref._cusecolumncolors /*boolean*/ ;
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="End Sub";
return false;
}
public String  _getvalue(b4a.example.ef.table __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((String) Debug.delegate(ba, "getvalue", new Object[] {_col,_row}));}
String[] _values = null;
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As Str";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="End Sub";
return "";
}
public String[]  _getvalues(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvalues", false))
	 {return ((String[]) Debug.delegate(ba, "getvalues", new Object[] {_row}));}
String[] _rowdata = null;
String[] _tmp = null;
int _i = 0;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Dim rowData() As String  = Data.Get(Row) ' will t";
_rowdata = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="Dim tmp(mNumberOfColumns) As String";
_tmp = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_tmp,"");
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="For i=0 To mNumberOfColumns-1 ' copy the array";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="tmp(i) =  rowData(i)";
_tmp[_i] = _rowdata[_i];
 }
};
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="Return tmp";
if (true) return _tmp;
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="Return pnlTable.Visible";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="Return pnlTable.Width";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="End Sub";
return 0;
}
public String  _header_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "header_click", false))
	 {return ((String) Debug.delegate(ba, "header_click", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
boolean _bsorted = false;
int _dir = 0;
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Private Sub Header_Click";
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=25755656;
 //BA.debugLineNum = 25755656;BA.debugLine="If Data.Size < 2 Then Return";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=25755658;
 //BA.debugLineNum = 25755658;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=25755659;
 //BA.debugLineNum = 25755659;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=25755663;
 //BA.debugLineNum = 25755663;BA.debugLine="If cSortColumn Then 'this is set in the designer";
if (__ref._csortcolumn /*boolean*/ ) { 
RDebugUtils.currentLine=25755664;
 //BA.debugLineNum = 25755664;BA.debugLine="Dim dir As Int = 0 ' unsorted";
_dir = (int) (0);
RDebugUtils.currentLine=25755665;
 //BA.debugLineNum = 25755665;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
if ((__ref._sortedcol /*int*/ ==_col)) { 
RDebugUtils.currentLine=25755666;
 //BA.debugLineNum = 25755666;BA.debugLine="Select sortingDir";
switch (BA.switchObjectToInt(__ref._sortingdir /*int*/ ,(int) (0),(int) (1),(int) (-1))) {
case 0: {
RDebugUtils.currentLine=25755667;
 //BA.debugLineNum = 25755667;BA.debugLine="Case 0: dir = -1 ' going up";
_dir = (int) (-1);
 break; }
case 1: {
RDebugUtils.currentLine=25755668;
 //BA.debugLineNum = 25755668;BA.debugLine="Case 1: dir = -1";
_dir = (int) (-1);
 break; }
case 2: {
RDebugUtils.currentLine=25755669;
 //BA.debugLineNum = 25755669;BA.debugLine="Case -1: dir = 1";
_dir = (int) (1);
 break; }
}
;
 }else {
RDebugUtils.currentLine=25755672;
 //BA.debugLineNum = 25755672;BA.debugLine="dir = -1 ' start with going up";
_dir = (int) (-1);
 };
RDebugUtils.currentLine=25755675;
 //BA.debugLineNum = 25755675;BA.debugLine="bSorted = SortTable2(col, dir <= 0)";
_bsorted = __ref._sorttable2 /*boolean*/ (null,_col,_dir<=0);
RDebugUtils.currentLine=25755677;
 //BA.debugLineNum = 25755677;BA.debugLine="If bSorted Then";
if (_bsorted) { 
RDebugUtils.currentLine=25755678;
 //BA.debugLineNum = 25755678;BA.debugLine="showHeaderSorting(col, dir)";
__ref._showheadersorting /*String*/ (null,_col,_dir);
RDebugUtils.currentLine=25755679;
 //BA.debugLineNum = 25755679;BA.debugLine="sortedCol = col 'only change if a sort actually";
__ref._sortedcol /*int*/  = _col;
RDebugUtils.currentLine=25755680;
 //BA.debugLineNum = 25755680;BA.debugLine="sortingDir = dir 'only change if a sort actuall";
__ref._sortingdir /*int*/  = _dir;
 }else {
RDebugUtils.currentLine=25755682;
 //BA.debugLineNum = 25755682;BA.debugLine="showHeaderSorting(col, 2) 'no sort done so rect";
__ref._showheadersorting /*String*/ (null,_col,(int) (2));
 };
 };
RDebugUtils.currentLine=25755686;
 //BA.debugLineNum = 25755686;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=25755687;
 //BA.debugLineNum = 25755687;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(_col));
 };
RDebugUtils.currentLine=25755690;
 //BA.debugLineNum = 25755690;BA.debugLine="End Sub";
return "";
}
public boolean  _sorttable2(b4a.example.ef.table __ref,int _col,boolean _bascending) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sorttable2", false))
	 {return ((Boolean) Debug.delegate(ba, "sorttable2", new Object[] {_col,_bascending}));}
int _i = 0;
int _iub = 0;
String[] _arrrow = null;
boolean _bdomulticolumnsort = false;
boolean _bvalidarrsortindex = false;
boolean _bsorted = false;
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Public Sub SortTable2(Col As Int, bAscending As Bo";
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=33292291;
 //BA.debugLineNum = 33292291;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=33292292;
 //BA.debugLineNum = 33292292;BA.debugLine="Dim arrRow() As String";
_arrrow = new String[(int) (0)];
java.util.Arrays.fill(_arrrow,"");
RDebugUtils.currentLine=33292293;
 //BA.debugLineNum = 33292293;BA.debugLine="Dim bDoMultiColumnSort As Boolean";
_bdomulticolumnsort = false;
RDebugUtils.currentLine=33292294;
 //BA.debugLineNum = 33292294;BA.debugLine="Dim bValidArrSortIndex As Boolean";
_bvalidarrsortindex = false;
RDebugUtils.currentLine=33292295;
 //BA.debugLineNum = 33292295;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=33292297;
 //BA.debugLineNum = 33292297;BA.debugLine="If Col <> iPreviousSortColumn Then";
if (_col!=__ref._iprevioussortcolumn /*int*/ ) { 
RDebugUtils.currentLine=33292298;
 //BA.debugLineNum = 33292298;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=33292299;
 //BA.debugLineNum = 33292299;BA.debugLine="arrDataSorted(Col) = False";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.False;
 };
RDebugUtils.currentLine=33292302;
 //BA.debugLineNum = 33292302;BA.debugLine="iUB = Data.Size - 1";
_iub = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=33292309;
 //BA.debugLineNum = 33292309;BA.debugLine="If bDataTempDone = False Then";
if (__ref._bdatatempdone /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=33292310;
 //BA.debugLineNum = 33292310;BA.debugLine="DataTemp.Initialize";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=33292311;
 //BA.debugLineNum = 33292311;BA.debugLine="For i = 0 To iUB";
{
final int step14 = 1;
final int limit14 = _iub;
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=33292312;
 //BA.debugLineNum = 33292312;BA.debugLine="DataTemp.Add(Data.Get(i))";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Add(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=33292314;
 //BA.debugLineNum = 33292314;BA.debugLine="bDataTempDone = True";
__ref._bdatatempdone /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=33292320;
 //BA.debugLineNum = 33292320;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=33292321;
 //BA.debugLineNum = 33292321;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("733292321","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=33292322;
 //BA.debugLineNum = 33292322;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=33292324;
 //BA.debugLineNum = 33292324;BA.debugLine="Dim arrColLong(Data.Size) As Long";
_arrcollong = new long[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=33292325;
 //BA.debugLineNum = 33292325;BA.debugLine="For i = 0 To iUB";
{
final int step24 = 1;
final int limit24 = _iub;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=33292326;
 //BA.debugLineNum = 33292326;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=33292327;
 //BA.debugLineNum = 33292327;BA.debugLine="Try";
try {RDebugUtils.currentLine=33292328;
 //BA.debugLineNum = 33292328;BA.debugLine="arrColLong(i) = arrRow(Col)";
__ref._arrcollong /*long[]*/ [_i] = (long)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e29) {
			ba.setLastException(e29); };
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=33292334;
 //BA.debugLineNum = 33292334;BA.debugLine="Dim arrColDouble(Data.Size) As Double";
_arrcoldouble = new double[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=33292335;
 //BA.debugLineNum = 33292335;BA.debugLine="For i = 0 To iUB";
{
final int step33 = 1;
final int limit33 = _iub;
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=33292336;
 //BA.debugLineNum = 33292336;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=33292337;
 //BA.debugLineNum = 33292337;BA.debugLine="Try";
try {RDebugUtils.currentLine=33292338;
 //BA.debugLineNum = 33292338;BA.debugLine="arrColDouble(i) = arrRow(Col)";
__ref._arrcoldouble /*double[]*/ [_i] = (double)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e38) {
			ba.setLastException(e38); };
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=33292344;
 //BA.debugLineNum = 33292344;BA.debugLine="Dim arrColString(Data.size) As String";
_arrcolstring = new String[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=33292345;
 //BA.debugLineNum = 33292345;BA.debugLine="For i = 0 To iUB";
{
final int step42 = 1;
final int limit42 = _iub;
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=33292346;
 //BA.debugLineNum = 33292346;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=33292347;
 //BA.debugLineNum = 33292347;BA.debugLine="Try";
try {RDebugUtils.currentLine=33292348;
 //BA.debugLineNum = 33292348;BA.debugLine="arrColString(i) = arrRow(Col)";
__ref._arrcolstring /*String[]*/ [_i] = _arrrow[_col];
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
RDebugUtils.currentLine=33292360;
 //BA.debugLineNum = 33292360;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=33292361;
 //BA.debugLineNum = 33292361;BA.debugLine="bDoMultiColumnSort = mMultiColumnSort And bValidA";
_bdomulticolumnsort = __ref._mmulticolumnsort /*boolean*/  && _bvalidarrsortindex && __ref._mnumberofcolumns /*int*/ >1;
RDebugUtils.currentLine=33292366;
 //BA.debugLineNum = 33292366;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=33292367;
 //BA.debugLineNum = 33292367;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("733292367","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=33292368;
 //BA.debugLineNum = 33292368;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=33292371;
 //BA.debugLineNum = 33292371;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=33292372;
 //BA.debugLineNum = 33292372;BA.debugLine="arrSortIndex = SortOMLongIDX2(arrColLong, arr";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx2 /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=33292374;
 //BA.debugLineNum = 33292374;BA.debugLine="arrSortIndex = SortOMLongIDX(arrColLong, True";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 2: {
RDebugUtils.currentLine=33292378;
 //BA.debugLineNum = 33292378;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=33292379;
 //BA.debugLineNum = 33292379;BA.debugLine="arrSortIndex = SortOMDoubleIDX2(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx2 /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=33292381;
 //BA.debugLineNum = 33292381;BA.debugLine="arrSortIndex = SortOMDoubleIDX(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 3: {
RDebugUtils.currentLine=33292385;
 //BA.debugLineNum = 33292385;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=33292386;
 //BA.debugLineNum = 33292386;BA.debugLine="arrSortIndex = SortOMStringIDX2(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx2 /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=33292388;
 //BA.debugLineNum = 33292388;BA.debugLine="arrSortIndex = SortOMStringIDX(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 };
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=33292392;
 //BA.debugLineNum = 33292392;BA.debugLine="Dim arrSortIndex(1) As Int";
_arrsortindex = new int[(int) (1)];
;
RDebugUtils.currentLine=33292393;
 //BA.debugLineNum = 33292393;BA.debugLine="arrSortIndex(0) = -1";
__ref._arrsortindex /*int[]*/ [(int) (0)] = (int) (-1);
 break; }
}
;
RDebugUtils.currentLine=33292396;
 //BA.debugLineNum = 33292396;BA.debugLine="arrDataSorted(Col) = True";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.True;
RDebugUtils.currentLine=33292397;
 //BA.debugLineNum = 33292397;BA.debugLine="mapSortingIndexes.Put(Col, arrSortIndex)";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_col),(Object)(__ref._arrsortindex /*int[]*/ ));
 }else {
RDebugUtils.currentLine=33292399;
 //BA.debugLineNum = 33292399;BA.debugLine="arrSortIndex = mapSortingIndexes.Get(Col) 'retri";
__ref._arrsortindex /*int[]*/  = (int[])(__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_col)));
 };
RDebugUtils.currentLine=33292402;
 //BA.debugLineNum = 33292402;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=33292410;
 //BA.debugLineNum = 33292410;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=33292412;
 //BA.debugLineNum = 33292412;BA.debugLine="If bAscending = False And bValidArrSortIndex Then";
if (_bascending==__c.False && _bvalidarrsortindex) { 
RDebugUtils.currentLine=33292413;
 //BA.debugLineNum = 33292413;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T")) {
case 0: 
case 1: {
RDebugUtils.currentLine=33292415;
 //BA.debugLineNum = 33292415;BA.debugLine="arrSortIndex = ReverseIndexLong(arrColLong, ar";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexlong /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 2: {
RDebugUtils.currentLine=33292417;
 //BA.debugLineNum = 33292417;BA.debugLine="arrSortIndex = ReverseIndexDouble(arrColDouble";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexdouble /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=33292419;
 //BA.debugLineNum = 33292419;BA.debugLine="arrSortIndex = ReverseIndexString(arrColString";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexstring /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
}
;
 };
RDebugUtils.currentLine=33292426;
 //BA.debugLineNum = 33292426;BA.debugLine="If arrSortIndex(0) > -1 Then 'so don't move rows";
if (__ref._arrsortindex /*int[]*/ [(int) (0)]>-1) { 
RDebugUtils.currentLine=33292427;
 //BA.debugLineNum = 33292427;BA.debugLine="For i = 0 To iUB";
{
final int step97 = 1;
final int limit97 = _iub;
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
RDebugUtils.currentLine=33292428;
 //BA.debugLineNum = 33292428;BA.debugLine="Data.Set(i, DataTemp.Get(arrSortIndex(i)))";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._arrsortindex /*int[]*/ [_i]));
 }
};
RDebugUtils.currentLine=33292430;
 //BA.debugLineNum = 33292430;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=33292431;
 //BA.debugLineNum = 33292431;BA.debugLine="bSorted = True";
_bsorted = __c.True;
 };
RDebugUtils.currentLine=33292434;
 //BA.debugLineNum = 33292434;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=33292435;
 //BA.debugLineNum = 33292435;BA.debugLine="bPreviousSortAscending = bAscending 'not used for";
__ref._bprevioussortascending /*boolean*/  = _bascending;
RDebugUtils.currentLine=33292437;
 //BA.debugLineNum = 33292437;BA.debugLine="Return bSorted";
if (true) return _bsorted;
RDebugUtils.currentLine=33292439;
 //BA.debugLineNum = 33292439;BA.debugLine="End Sub";
return false;
}
public String  _showheadersorting(b4a.example.ef.table __ref,int _col,int _dir) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "showheadersorting", false))
	 {return ((String) Debug.delegate(ba, "showheadersorting", new Object[] {_col,_dir}));}
int _l = 0;
int _t = 0;
anywheresoftware.b4a.objects.ConcreteViewWrapper _view = null;
anywheresoftware.b4a.objects.PanelWrapper _parentview = null;
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub showHeaderSorting(col As Int, dir As In";
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="Dim L As Int ' calculate left";
_l = 0;
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="Dim t As Int ' calculate top";
_t = 0;
RDebugUtils.currentLine=25821189;
 //BA.debugLineNum = 25821189;BA.debugLine="Dim View As View";
_view = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=25821190;
 //BA.debugLineNum = 25821190;BA.debugLine="Dim ParentView As Panel";
_parentview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=25821192;
 //BA.debugLineNum = 25821192;BA.debugLine="pnlSortingView.RemoveView";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=25821194;
 //BA.debugLineNum = 25821194;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=25821195;
 //BA.debugLineNum = 25821195;BA.debugLine="If col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=25821196;
 //BA.debugLineNum = 25821196;BA.debugLine="View = HeaderFirst.GetView(col)";
_view = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=25821197;
 //BA.debugLineNum = 25821197;BA.debugLine="ParentView = HeaderFirst";
_parentview = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 }else {
RDebugUtils.currentLine=25821199;
 //BA.debugLineNum = 25821199;BA.debugLine="View = Header.GetView(col - mNumberOfFixedColum";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ ));
RDebugUtils.currentLine=25821200;
 //BA.debugLineNum = 25821200;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
 }else {
RDebugUtils.currentLine=25821203;
 //BA.debugLineNum = 25821203;BA.debugLine="View = Header.GetView(col)";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=25821204;
 //BA.debugLineNum = 25821204;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
RDebugUtils.currentLine=25821207;
 //BA.debugLineNum = 25821207;BA.debugLine="L = View.Left + View.Width - cSortBitmapWidth - 2";
_l = (int) (_view.getLeft()+_view.getWidth()-__ref._csortbitmapwidth /*int*/ -__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=25821209;
 //BA.debugLineNum = 25821209;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
if ((_dir==0)) { 
if (true) return "";};
RDebugUtils.currentLine=25821211;
 //BA.debugLineNum = 25821211;BA.debugLine="Select Case dir";
switch (BA.switchObjectToInt(_dir,(int) (-1),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=25821213;
 //BA.debugLineNum = 25821213;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpDes)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=25821214;
 //BA.debugLineNum = 25821214;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 1: {
RDebugUtils.currentLine=25821216;
 //BA.debugLineNum = 25821216;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpAsc)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=25821217;
 //BA.debugLineNum = 25821217;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 2: {
RDebugUtils.currentLine=25821219;
 //BA.debugLineNum = 25821219;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpEqual)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=25821220;
 //BA.debugLineNum = 25821220;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
}
;
RDebugUtils.currentLine=25821223;
 //BA.debugLineNum = 25821223;BA.debugLine="ParentView.AddView(pnlSortingView, L, t, cSortBit";
_parentview.AddView((android.view.View)(__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_l,_t,__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=25821225;
 //BA.debugLineNum = 25821225;BA.debugLine="End Sub";
return "";
}
public String  _header_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "header_longclick", false))
	 {return ((String) Debug.delegate(ba, "header_longclick", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Private Sub Header_LongClick";
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=22740997;
 //BA.debugLineNum = 22740997;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=22740998;
 //BA.debugLineNum = 22740998;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderLong";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick")) { 
RDebugUtils.currentLine=22740999;
 //BA.debugLineNum = 22740999;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderLongCli";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick",(Object)(_col));
 };
RDebugUtils.currentLine=22741001;
 //BA.debugLineNum = 22741001;BA.debugLine="End Sub";
return "";
}
public String  _hidecol(b4a.example.ef.table __ref,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hidecol", false))
	 {return ((String) Debug.delegate(ba, "hidecol", new Object[] {_col}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub hideCol(col As Int)";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="For i = 0 To SavedWidths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=24444934;
 //BA.debugLineNum = 24444934;BA.debugLine="tmpWidths(col) = 0	'???";
_tmpwidths[_col] = (int) (0);
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=24444936;
 //BA.debugLineNum = 24444936;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hiderow", false))
	 {return ((String) Debug.delegate(ba, "hiderow", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub HideRow (Row As Int)";
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=22413315;
 //BA.debugLineNum = 22413315;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=22413316;
 //BA.debugLineNum = 22413316;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
RDebugUtils.currentLine=22413318;
 //BA.debugLineNum = 22413318;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=22413320;
 //BA.debugLineNum = 22413320;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=22413321;
 //BA.debugLineNum = 22413321;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
RDebugUtils.currentLine=22413323;
 //BA.debugLineNum = 22413323;BA.debugLine="visibleRows.Remove(Row)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_row));
RDebugUtils.currentLine=22413324;
 //BA.debugLineNum = 22413324;BA.debugLine="LabelsCache.Add(lbls)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lbls));
RDebugUtils.currentLine=22413325;
 //BA.debugLineNum = 22413325;BA.debugLine="End Sub";
return "";
}
public String  _initfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initfastscroll", false))
	 {return ((String) Debug.delegate(ba, "initfastscroll", null));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Private Sub InitFastScroll";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="pnlFastScroll.Top = SV2.Top";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop());
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="pnlFastScroll.Height = SV2.Height";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="FastScrollHeight = pnlFastScroll.Height - pnlFast";
__ref._fastscrollheight /*int*/  = (int) (__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=26279940;
 //BA.debugLineNum = 26279940;BA.debugLine="pnlFastScrollCursor.Top = SV2.VerticalScrollPosit";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()*__ref._fscscale /*double*/ ));
RDebugUtils.currentLine=26279941;
 //BA.debugLineNum = 26279941;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight - m";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26279943;
 //BA.debugLineNum = 26279943;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=26279945;
 //BA.debugLineNum = 26279945;BA.debugLine="DrawFastScrollCursor";
__ref._drawfastscrollcursor /*String*/ (null);
RDebugUtils.currentLine=26279946;
 //BA.debugLineNum = 26279946;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.table __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="cEventName = EventName";
__ref._ceventname /*String*/  = _eventname;
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="cCallBack = CallBack";
__ref._ccallback /*Object*/  = _callback;
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="cSortBitmapWidth = 10dip";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="cSortBitmapColor = Colors.Yellow";
__ref._csortbitmapcolor /*int*/  = __c.Colors.Yellow;
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="End Sub";
return "";
}
public String  _initializesortingbitmaps(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initializesortingbitmaps", false))
	 {return ((String) Debug.delegate(ba, "initializesortingbitmaps", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _pthasc = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _pthdes = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper _pthequal = null;
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Private Sub InitializeSortingBitmaps";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Private pthAsc, pthDes, pthEqual As Path";
_pthasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="cSortBitmapHeight = cSortBitmapWidth / 2";
__ref._csortbitmapheight /*int*/  = (int) (__ref._csortbitmapwidth /*int*/ /(double)2);
RDebugUtils.currentLine=21561349;
 //BA.debugLineNum = 21561349;BA.debugLine="pnlAsc.Initialize(\"\")";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="pnlTable.AddView(pnlAsc, 0, 0, cSortBitmapWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="cvsAsc.Initialize(pnlAsc)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="pthAsc.Initialize(0, 0)";
_pthasc.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="pthAsc.LineTo(cSortBitmapWidth, 0)";
_pthasc.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (0));
RDebugUtils.currentLine=21561354;
 //BA.debugLineNum = 21561354;BA.debugLine="pthAsc.LineTo(cSortBitmapHeight, cSortBitmapHeigh";
_pthasc.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="cvsAsc.DrawColor(Colors.Transparent)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21561356;
 //BA.debugLineNum = 21561356;BA.debugLine="cvsAsc.DrawPath(pthAsc, cSortBitmapColor, True, 1";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthasc.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21561357;
 //BA.debugLineNum = 21561357;BA.debugLine="bmpAsc = cvsAsc.Bitmap";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=21561359;
 //BA.debugLineNum = 21561359;BA.debugLine="cvsDes.Initialize(pnlAsc)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=21561360;
 //BA.debugLineNum = 21561360;BA.debugLine="pthDes.Initialize(0, cSortBitmapHeight)";
_pthdes.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=21561361;
 //BA.debugLineNum = 21561361;BA.debugLine="pthDes.LineTo(cSortBitmapHeight, 0)";
_pthdes.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (0));
RDebugUtils.currentLine=21561362;
 //BA.debugLineNum = 21561362;BA.debugLine="pthDes.LineTo(cSortBitmapWidth, cSortBitmapHeight";
_pthdes.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=21561363;
 //BA.debugLineNum = 21561363;BA.debugLine="cvsDes.DrawColor(Colors.Transparent)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21561364;
 //BA.debugLineNum = 21561364;BA.debugLine="cvsDes.DrawPath(pthDes, cSortBitmapColor, True, 1";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthdes.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21561365;
 //BA.debugLineNum = 21561365;BA.debugLine="bmpDes = cvsDes.Bitmap";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=21561368;
 //BA.debugLineNum = 21561368;BA.debugLine="cvsEqual.Initialize(pnlAsc)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=21561369;
 //BA.debugLineNum = 21561369;BA.debugLine="pthEqual.Initialize(0, cSortBitmapHeight / 2)";
_pthequal.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=21561370;
 //BA.debugLineNum = 21561370;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, cSortBitmap";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=21561371;
 //BA.debugLineNum = 21561371;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth, cSortBitmapHeig";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=21561372;
 //BA.debugLineNum = 21561372;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, 0)";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (0));
RDebugUtils.currentLine=21561373;
 //BA.debugLineNum = 21561373;BA.debugLine="cvsEqual.DrawColor(Colors.Transparent)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=21561374;
 //BA.debugLineNum = 21561374;BA.debugLine="cvsEqual.DrawPath(pthEqual, cSortBitmapColor, Tru";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthequal.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=21561375;
 //BA.debugLineNum = 21561375;BA.debugLine="bmpEqual = cvsEqual.Bitmap";
__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=21561377;
 //BA.debugLineNum = 21561377;BA.debugLine="pnlAsc.RemoveView";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=21561378;
 //BA.debugLineNum = 21561378;BA.debugLine="End Sub";
return "";
}
public String  _initializetable(b4a.example.ef.table __ref,int _numberofcolumns,int _cellalignement,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initializetable", false))
	 {return ((String) Debug.delegate(ba, "initializetable", new Object[] {_numberofcolumns,_cellalignement,_showstatusline}));}
int _i = 0;
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Public Sub InitializeTable (NumberOfColumns As Int";
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="setShowStatusLine(showStatusLine)";
__ref._setshowstatusline /*String*/ (null,_showstatusline);
RDebugUtils.currentLine=21495812;
 //BA.debugLineNum = 21495812;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21495813;
 //BA.debugLineNum = 21495813;BA.debugLine="cAlignment = cellAlignement";
__ref._calignment /*int*/  = _cellalignement;
RDebugUtils.currentLine=21495815;
 //BA.debugLineNum = 21495815;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=21495816;
 //BA.debugLineNum = 21495816;BA.debugLine="Data.Initialize	'needed";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=21495818;
 //BA.debugLineNum = 21495818;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21495819;
 //BA.debugLineNum = 21495819;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21495820;
 //BA.debugLineNum = 21495820;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21495821;
 //BA.debugLineNum = 21495821;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21495822;
 //BA.debugLineNum = 21495822;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=21495823;
 //BA.debugLineNum = 21495823;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=21495824;
 //BA.debugLineNum = 21495824;BA.debugLine="ColumnWidths(i) = cWidth / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._cwidth /*int*/ /(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=21495825;
 //BA.debugLineNum = 21495825;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=21495826;
 //BA.debugLineNum = 21495826;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=21495827;
 //BA.debugLineNum = 21495827;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=21495830;
 //BA.debugLineNum = 21495830;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=21495831;
 //BA.debugLineNum = 21495831;BA.debugLine="End Sub";
return "";
}
public String  _setshowstatusline(b4a.example.ef.table __ref,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setshowstatusline", false))
	 {return ((String) Debug.delegate(ba, "setshowstatusline", new Object[] {_showstatusline}));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Public Sub setShowStatusLine(ShowStatusLine As Boo";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="cShowStatusLine = ShowStatusLine";
__ref._cshowstatusline /*boolean*/  = _showstatusline;
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=30408707;
 //BA.debugLineNum = 30408707;BA.debugLine="SV2.Height = cHeight - Header.Height - cStatusLi";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=30408708;
 //BA.debugLineNum = 30408708;BA.debugLine="lblStatusLine.Visible = True";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=30408710;
 //BA.debugLineNum = 30408710;BA.debugLine="SV2.Height = cHeight - Header.Height";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=30408711;
 //BA.debugLineNum = 30408711;BA.debugLine="lblStatusLine.Visible = False";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=30408713;
 //BA.debugLineNum = 30408713;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=30408714;
 //BA.debugLineNum = 30408714;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=30408715;
 //BA.debugLineNum = 30408715;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=30408717;
 //BA.debugLineNum = 30408717;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=30408718;
 //BA.debugLineNum = 30408718;BA.debugLine="End Sub";
return "";
}
public String  _svf_scrollchanged(b4a.example.ef.table __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "svf_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "svf_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub SVF_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="SVFScrolls = True";
__ref._svfscrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="If SV2Scrolls = False Then";
if (__ref._sv2scrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="Scroll(SV2PosX, Position)";
__ref._scroll /*String*/ (null,__ref._sv2posx /*int*/ ,_position);
RDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="SV2.VerticalScrollPosition = Position";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_position);
 };
RDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="SVFScrolls = False";
__ref._svfscrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=21954567;
 //BA.debugLineNum = 21954567;BA.debugLine="End Sub";
return "";
}
public String  _sv2_scrollchanged(b4a.example.ef.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sv2_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv2_scrollchanged", new Object[] {_posx,_posy}));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub SV2_ScrollChanged(PosX As Int, PosY As";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="SV2Scrolls = True";
__ref._sv2scrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="If SVFScrolls = False Then";
if (__ref._svfscrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="SVF.ScrollToNow(PosY)";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .ScrollToNow(_posy);
RDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="Scroll(PosX, PosY)";
__ref._scroll /*String*/ (null,_posx,_posy);
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="SV2PosX = PosX";
__ref._sv2posx /*int*/  = _posx;
 };
RDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="SV2Scrolls = False";
__ref._sv2scrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="If mFastScroll = True And Data.Size >= mFastScrol";
if (__ref._mfastscroll /*boolean*/ ==__c.True && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._mfastscrollminitems /*int*/  && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ >__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="FScScale = FastScrollHeight / (SV2.Panel.Height";
__ref._fscscale /*double*/  = __ref._fastscrollheight /*int*/ /(double)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight()-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="pnlFastScroll.Visible = True";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=22020108;
 //BA.debugLineNum = 22020108;BA.debugLine="If mFastScrollShowLabel = True Then";
if (__ref._mfastscrollshowlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=22020109;
 //BA.debugLineNum = 22020109;BA.debugLine="lblFastScroll.Visible = True";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=22020111;
 //BA.debugLineNum = 22020111;BA.debugLine="CalcFastScroll(PosY)";
__ref._calcfastscroll /*String*/ (null,_posy);
RDebugUtils.currentLine=22020112;
 //BA.debugLineNum = 22020112;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=22020114;
 //BA.debugLineNum = 22020114;BA.debugLine="End Sub";
return "";
}
public String  _setstatusline(b4a.example.ef.table __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatusline", false))
	 {return ((String) Debug.delegate(ba, "setstatusline", new Object[] {_text}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Public Sub setStatusLine(Text As String)";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized())) { 
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_text));};
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
return "";
}
public boolean  _insertrowat(b4a.example.ef.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "insertrowat", false))
	 {return ((Boolean) Debug.delegate(ba, "insertrowat", new Object[] {_row,_values}));}
anywheresoftware.b4a.objects.collections.List _l = null;
int _i = 0;
int _keepsel = 0;
boolean _changed = false;
int _width = 0;
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As St";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="If (Row < 0) Then Row = 0";
if ((_row<0)) { 
_row = (int) (0);};
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="If (Row > Data.Size) Then";
if ((_row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())) { 
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="AddRow(Values)";
__ref._addrow /*String*/ (null,_values);
 }else {
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="AddRowAutomaticWidth(Values)";
__ref._addrowautomaticwidth /*String*/ (null,_values);
 };
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=23658508;
 //BA.debugLineNum = 23658508;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23658509;
 //BA.debugLineNum = 23658509;BA.debugLine="L.Initialize";
_l.Initialize();
RDebugUtils.currentLine=23658510;
 //BA.debugLineNum = 23658510;BA.debugLine="L.Add(Values)";
_l.Add((Object)(_values));
RDebugUtils.currentLine=23658512;
 //BA.debugLineNum = 23658512;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step14 = 1;
final int limit14 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=23658513;
 //BA.debugLineNum = 23658513;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=23658514;
 //BA.debugLineNum = 23658514;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=23658515;
 //BA.debugLineNum = 23658515;BA.debugLine="If (keepSel >= Row) Then";
if ((_keepsel>=_row)) { 
RDebugUtils.currentLine=23658516;
 //BA.debugLineNum = 23658516;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel+1));
 };
 }
};
RDebugUtils.currentLine=23658520;
 //BA.debugLineNum = 23658520;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step21 = 1;
final int limit21 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=23658521;
 //BA.debugLineNum = 23658521;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=23658523;
 //BA.debugLineNum = 23658523;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_row,_l);
RDebugUtils.currentLine=23658524;
 //BA.debugLineNum = 23658524;BA.debugLine="lstRowColorIndexes.InsertAt(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_row,(Object)(0));
RDebugUtils.currentLine=23658526;
 //BA.debugLineNum = 23658526;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=23658528;
 //BA.debugLineNum = 23658528;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step27 = 1;
final int limit27 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=23658529;
 //BA.debugLineNum = 23658529;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=23658532;
 //BA.debugLineNum = 23658532;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=23658533;
 //BA.debugLineNum = 23658533;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=23658534;
 //BA.debugLineNum = 23658534;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=23658535;
 //BA.debugLineNum = 23658535;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=23658536;
 //BA.debugLineNum = 23658536;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=23658538;
 //BA.debugLineNum = 23658538;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=23658539;
 //BA.debugLineNum = 23658539;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=23658540;
 //BA.debugLineNum = 23658540;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=23658541;
 //BA.debugLineNum = 23658541;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=23658542;
 //BA.debugLineNum = 23658542;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=23658543;
 //BA.debugLineNum = 23658543;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23658544;
 //BA.debugLineNum = 23658544;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=23658546;
 //BA.debugLineNum = 23658546;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=23658548;
 //BA.debugLineNum = 23658548;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=23658549;
 //BA.debugLineNum = 23658549;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=23658550;
 //BA.debugLineNum = 23658550;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=23658551;
 //BA.debugLineNum = 23658551;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=23658554;
 //BA.debugLineNum = 23658554;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step51 = 1;
final int limit51 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
RDebugUtils.currentLine=23658555;
 //BA.debugLineNum = 23658555;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23658556;
 //BA.debugLineNum = 23658556;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=23658558;
 //BA.debugLineNum = 23658558;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=23658560;
 //BA.debugLineNum = 23658560;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=23658561;
 //BA.debugLineNum = 23658561;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=23658562;
 //BA.debugLineNum = 23658562;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=23658563;
 //BA.debugLineNum = 23658563;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=23658564;
 //BA.debugLineNum = 23658564;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=23658565;
 //BA.debugLineNum = 23658565;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=23658569;
 //BA.debugLineNum = 23658569;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=23658570;
 //BA.debugLineNum = 23658570;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
 };
RDebugUtils.currentLine=23658574;
 //BA.debugLineNum = 23658574;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=23658575;
 //BA.debugLineNum = 23658575;BA.debugLine="End Sub";
return false;
}
public String  _ip_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "ip_click", false))
	 {return ((String) Debug.delegate(ba, "ip_click", null));}
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Private Sub IP_Click";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(-1));
 };
RDebugUtils.currentLine=24641541;
 //BA.debugLineNum = 24641541;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "isrowvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isrowvisible", new Object[] {_row}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean		'";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="Return Row < (SV2.VerticalScrollPosition + SV2.He";
if (true) return _row<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)(__ref._crowheight /*int*/ +1) && _row>__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ ;
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="End Sub";
return false;
}
public void  _jumptorow(b4a.example.ef.table __ref,int _row) throws Exception{
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "jumptorow", false))
	 {Debug.delegate(ba, "jumptorow", new Object[] {_row}); return;}
ResumableSub_JumpToRow rsub = new ResumableSub_JumpToRow(this,__ref,_row);
rsub.resume(ba, null);
}
public static class ResumableSub_JumpToRow extends BA.ResumableSub {
public ResumableSub_JumpToRow(b4a.example.ef.table parent,b4a.example.ef.table __ref,int _row) {
this.parent = parent;
this.__ref = __ref;
this._row = _row;
this.__ref = parent;
}
b4a.example.ef.table __ref;
b4a.example.ef.table parent;
int _row;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="table";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
RDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorow"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jumptorowandselect(b4a.example.ef.table __ref,int _col,int _row) throws Exception{
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "jumptorowandselect", false))
	 {Debug.delegate(ba, "jumptorowandselect", new Object[] {_col,_row}); return;}
ResumableSub_JumpToRowAndSelect rsub = new ResumableSub_JumpToRowAndSelect(this,__ref,_col,_row);
rsub.resume(ba, null);
}
public static class ResumableSub_JumpToRowAndSelect extends BA.ResumableSub {
public ResumableSub_JumpToRowAndSelect(b4a.example.ef.table parent,b4a.example.ef.table __ref,int _col,int _row) {
this.parent = parent;
this.__ref = __ref;
this._col = _col;
this._row = _row;
this.__ref = parent;
}
b4a.example.ef.table __ref;
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
RDebugUtils.currentModule="table";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="Log(\"You may get this warning:\")";
parent.__c.LogImpl("723199745","You may get this warning:",0);
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Log(\"Unexpected event (missing RaiseSynchronousEv";
parent.__c.LogImpl("723199746","Unexpected event (missing RaiseSynchronousEvents): sv_scrollchanged",0);
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Log(\"Ignore it, it is NOT harmful !\")";
parent.__c.LogImpl("723199747","Ignore it, it is NOT harmful !",0);
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
RDebugUtils.currentLine=23199751;
 //BA.debugLineNum = 23199751;BA.debugLine="rc.Col = Col";
_rc.Col /*int*/  = _col;
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorowandselect"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=23199753;
 //BA.debugLineNum = 23199753;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=23199755;
 //BA.debugLineNum = 23199755;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=23199757;
 //BA.debugLineNum = 23199757;BA.debugLine="Private i, Left As Int";
_i = 0;
_left = 0;
RDebugUtils.currentLine=23199758;
 //BA.debugLineNum = 23199758;BA.debugLine="If Col > 0 Then";
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
RDebugUtils.currentLine=23199759;
 //BA.debugLineNum = 23199759;BA.debugLine="For i = 0 To Col - 1";
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
RDebugUtils.currentLine=23199760;
 //BA.debugLineNum = 23199760;BA.debugLine="Left = Left + ColumnWidths(i)";
_left = (int) (_left+__ref._columnwidths /*int[]*/ [_i]);
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
RDebugUtils.currentLine=23199763;
 //BA.debugLineNum = 23199763;BA.debugLine="Left = Left - SVF.Width";
_left = (int) (_left-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=23199764;
 //BA.debugLineNum = 23199764;BA.debugLine="SV2.HorizontalScrollPosition = Left";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition(_left);
RDebugUtils.currentLine=23199765;
 //BA.debugLineNum = 23199765;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _loadsqlitedb(b4a.example.ef.table __ref,anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadsqlitedb", false))
	 {return ((String) Debug.delegate(ba, "loadsqlitedb", new Object[] {_sqlite,_query,_automaticwidths}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
String[] _r = null;
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=28704773;
 //BA.debugLineNum = 28704773;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=28704774;
 //BA.debugLineNum = 28704774;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=28704776;
 //BA.debugLineNum = 28704776;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=28704777;
 //BA.debugLineNum = 28704777;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28704778;
 //BA.debugLineNum = 28704778;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28704779;
 //BA.debugLineNum = 28704779;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28704780;
 //BA.debugLineNum = 28704780;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=28704781;
 //BA.debugLineNum = 28704781;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=28704782;
 //BA.debugLineNum = 28704782;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=28704783;
 //BA.debugLineNum = 28704783;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=28704784;
 //BA.debugLineNum = 28704784;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=28704785;
 //BA.debugLineNum = 28704785;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=28704786;
 //BA.debugLineNum = 28704786;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=28704787;
 //BA.debugLineNum = 28704787;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28704788;
 //BA.debugLineNum = 28704788;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28704789;
 //BA.debugLineNum = 28704789;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=28704791;
 //BA.debugLineNum = 28704791;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28704792;
 //BA.debugLineNum = 28704792;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=28704794;
 //BA.debugLineNum = 28704794;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=28704796;
 //BA.debugLineNum = 28704796;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=28704797;
 //BA.debugLineNum = 28704797;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=28704798;
 //BA.debugLineNum = 28704798;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28704799;
 //BA.debugLineNum = 28704799;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28704800;
 //BA.debugLineNum = 28704800;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=28704801;
 //BA.debugLineNum = 28704801;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28704802;
 //BA.debugLineNum = 28704802;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].DEFAULT,__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=28704804;
 //BA.debugLineNum = 28704804;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=28704808;
 //BA.debugLineNum = 28704808;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=28704812;
 //BA.debugLineNum = 28704812;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=28704813;
 //BA.debugLineNum = 28704813;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=28704817;
 //BA.debugLineNum = 28704817;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=28704819;
 //BA.debugLineNum = 28704819;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=28704820;
 //BA.debugLineNum = 28704820;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=28704821;
 //BA.debugLineNum = 28704821;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=28704822;
 //BA.debugLineNum = 28704822;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28704823;
 //BA.debugLineNum = 28704823;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28704824;
 //BA.debugLineNum = 28704824;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=28704825;
 //BA.debugLineNum = 28704825;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=28704827;
 //BA.debugLineNum = 28704827;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=28704830;
 //BA.debugLineNum = 28704830;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=28704833;
 //BA.debugLineNum = 28704833;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=28704836;
 //BA.debugLineNum = 28704836;BA.debugLine="End Sub";
return "";
}
public String  _setheader(b4a.example.ef.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheader", false))
	 {return ((String) Debug.delegate(ba, "setheader", new Object[] {_values}));}
int _col = 0;
int _left = 0;
int _change = 0;
int _w = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
String[] _str = null;
int _j = 0;
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub SetHeader(Values() As String)";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="HeaderNames.Initialize2(Values)";
__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
RDebugUtils.currentLine=22609926;
 //BA.debugLineNum = 22609926;BA.debugLine="Dim Left = 0 As Int";
_left = (int) (0);
RDebugUtils.currentLine=22609928;
 //BA.debugLineNum = 22609928;BA.debugLine="Dim Change = 0 As Int";
_change = (int) (0);
RDebugUtils.currentLine=22609929;
 //BA.debugLineNum = 22609929;BA.debugLine="Dim w As Int";
_w = 0;
RDebugUtils.currentLine=22609930;
 //BA.debugLineNum = 22609930;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=22609931;
 //BA.debugLineNum = 22609931;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=22609932;
 //BA.debugLineNum = 22609932;BA.debugLine="lbl.Initialize(\"header\")";
_lbl.Initialize(ba,"header");
RDebugUtils.currentLine=22609933;
 //BA.debugLineNum = 22609933;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22609934;
 //BA.debugLineNum = 22609934;BA.debugLine="lbl.Gravity = cHeaderAlignment";
_lbl.setGravity(__ref._cheaderalignment /*int*/ );
 }else {
RDebugUtils.currentLine=22609936;
 //BA.debugLineNum = 22609936;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=22609939;
 //BA.debugLineNum = 22609939;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22609940;
 //BA.debugLineNum = 22609940;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=22609942;
 //BA.debugLineNum = 22609942;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 };
RDebugUtils.currentLine=22609945;
 //BA.debugLineNum = 22609945;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=22609946;
 //BA.debugLineNum = 22609946;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=22609948;
 //BA.debugLineNum = 22609948;BA.debugLine="If cUseColumnColors = False Or cHeaderTextColors";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False || __ref._cheadertextcolors /*int[]*/ .length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=22609949;
 //BA.debugLineNum = 22609949;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
RDebugUtils.currentLine=22609950;
 //BA.debugLineNum = 22609950;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=22609952;
 //BA.debugLineNum = 22609952;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
RDebugUtils.currentLine=22609953;
 //BA.debugLineNum = 22609953;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=22609956;
 //BA.debugLineNum = 22609956;BA.debugLine="lbl.Text = Values(col)";
_lbl.setText(BA.ObjectToCharSequence(_values[_col]));
RDebugUtils.currentLine=22609957;
 //BA.debugLineNum = 22609957;BA.debugLine="lbl.Tag = col";
_lbl.setTag((Object)(_col));
RDebugUtils.currentLine=22609959;
 //BA.debugLineNum = 22609959;BA.debugLine="w = Max(0, ColumnWidths(col) - cLineWidth)		' ne";
_w = (int) (__c.Max(0,__ref._columnwidths /*int[]*/ [_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=22609961;
 //BA.debugLineNum = 22609961;BA.debugLine="If mNumberOfFixedColumns > 0 And col < mNumberOf";
if (__ref._mnumberoffixedcolumns /*int*/ >0 && _col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=22609962;
 //BA.debugLineNum = 22609962;BA.debugLine="HeaderFirst.AddView(lbl, Left, 0, w, cHeaderHei";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 }else {
RDebugUtils.currentLine=22609965;
 //BA.debugLineNum = 22609965;BA.debugLine="If col = mNumberOfFixedColumns Then";
if (_col==__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=22609966;
 //BA.debugLineNum = 22609966;BA.debugLine="Left = 0";
_left = (int) (0);
 };
RDebugUtils.currentLine=22609968;
 //BA.debugLineNum = 22609968;BA.debugLine="Header.AddView(lbl, Left, 0, w, cHeaderHeight)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 };
RDebugUtils.currentLine=22609972;
 //BA.debugLineNum = 22609972;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=22609973;
 //BA.debugLineNum = 22609973;BA.debugLine="If Values(col).Contains(CRLF) Then";
if (_values[_col].contains(__c.CRLF)) { 
RDebugUtils.currentLine=22609974;
 //BA.debugLineNum = 22609974;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=22609975;
 //BA.debugLineNum = 22609975;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=22609976;
 //BA.debugLineNum = 22609976;BA.debugLine="str = Regex.Split(CRLF, Values(col))";
_str = __c.Regex.Split(__c.CRLF,_values[_col]);
RDebugUtils.currentLine=22609977;
 //BA.debugLineNum = 22609977;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(str";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[(int) (0)],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
RDebugUtils.currentLine=22609978;
 //BA.debugLineNum = 22609978;BA.debugLine="For j = 1 To str.Length - 1";
{
final int step46 = 1;
final int limit46 = (int) (_str.length-1);
_j = (int) (1) ;
for (;_j <= limit46 ;_j = _j + step46 ) {
RDebugUtils.currentLine=22609979;
 //BA.debugLineNum = 22609979;BA.debugLine="HeaderWidths(col) = Max(HeaderWidths(col),cvs";
__ref._headerwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[_j],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=22609982;
 //BA.debugLineNum = 22609982;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Val";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_col],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=22609984;
 //BA.debugLineNum = 22609984;BA.debugLine="If HeaderWidths(col) > ColumnWidths(col) Then";
if (__ref._headerwidths /*int[]*/ [_col]>__ref._columnwidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=22609985;
 //BA.debugLineNum = 22609985;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=22609986;
 //BA.debugLineNum = 22609986;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Col";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._columnwidths /*int[]*/ [_col]));
 }else 
{RDebugUtils.currentLine=22609987;
 //BA.debugLineNum = 22609987;BA.debugLine="Else If ColumnWidths(col) > HeaderWidths(col) A";
if (__ref._columnwidths /*int[]*/ [_col]>__ref._headerwidths /*int[]*/ [_col] && __ref._columnwidths /*int[]*/ [_col]>__ref._datawidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=22609988;
 //BA.debugLineNum = 22609988;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=22609989;
 //BA.debugLineNum = 22609989;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Dat";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }}
;
 };
RDebugUtils.currentLine=22609992;
 //BA.debugLineNum = 22609992;BA.debugLine="Left = Left + ColumnWidths(col)";
_left = (int) (_left+__ref._columnwidths /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=22609995;
 //BA.debugLineNum = 22609995;BA.debugLine="If Change = 1 Then";
if (_change==1) { 
RDebugUtils.currentLine=22609996;
 //BA.debugLineNum = 22609996;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=22609998;
 //BA.debugLineNum = 22609998;BA.debugLine="Header.Left = - SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=22609999;
 //BA.debugLineNum = 22609999;BA.debugLine="End Sub";
return "";
}
public String  _setarrcolumnssorted(b4a.example.ef.table __ref,int _icolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setarrcolumnssorted", false))
	 {return ((String) Debug.delegate(ba, "setarrcolumnssorted", new Object[] {_icolumns}));}
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Public Sub SetArrColumnsSorted(iColumns As Int)";
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="sortingDir = 0 ' -1, 0, 1 as asc, unsorted, desc";
__ref._sortingdir /*int*/  = (int) (0);
RDebugUtils.currentLine=33357827;
 //BA.debugLineNum = 33357827;BA.debugLine="sortedCol = -1";
__ref._sortedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=33357829;
 //BA.debugLineNum = 33357829;BA.debugLine="Dim arrDataSorted(iColumns) As Boolean";
_arrdatasorted = new boolean[_icolumns];
;
RDebugUtils.currentLine=33357830;
 //BA.debugLineNum = 33357830;BA.debugLine="bDataTempDone = False";
__ref._bdatatempdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=33357831;
 //BA.debugLineNum = 33357831;BA.debugLine="Dim arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=33357832;
 //BA.debugLineNum = 33357832;BA.debugLine="mapSortingIndexes.Initialize";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=33357834;
 //BA.debugLineNum = 33357834;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb2(b4a.example.ef.table __ref,anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths,String[] _columndatatypes) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadsqlitedb2", false))
	 {return ((String) Debug.delegate(ba, "loadsqlitedb2", new Object[] {_sqlite,_query,_automaticwidths,_columndatatypes}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
long _ii = 0L;
double _dd = 0;
String _str = "";
String[] _r = null;
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Public Sub LoadSQLiteDB2(SQLite As SQL, Query As S";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=28770310;
 //BA.debugLineNum = 28770310;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=28770312;
 //BA.debugLineNum = 28770312;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=28770313;
 //BA.debugLineNum = 28770313;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28770314;
 //BA.debugLineNum = 28770314;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28770315;
 //BA.debugLineNum = 28770315;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28770316;
 //BA.debugLineNum = 28770316;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=28770317;
 //BA.debugLineNum = 28770317;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=28770318;
 //BA.debugLineNum = 28770318;BA.debugLine="Dim ii As Long";
_ii = 0L;
RDebugUtils.currentLine=28770319;
 //BA.debugLineNum = 28770319;BA.debugLine="Dim dd As Double";
_dd = 0;
RDebugUtils.currentLine=28770320;
 //BA.debugLineNum = 28770320;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=28770321;
 //BA.debugLineNum = 28770321;BA.debugLine="cColumnDataType = ColumnDataTypes";
__ref._ccolumndatatype /*String[]*/  = _columndatatypes;
RDebugUtils.currentLine=28770322;
 //BA.debugLineNum = 28770322;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=28770323;
 //BA.debugLineNum = 28770323;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=28770324;
 //BA.debugLineNum = 28770324;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=28770325;
 //BA.debugLineNum = 28770325;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28770326;
 //BA.debugLineNum = 28770326;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28770327;
 //BA.debugLineNum = 28770327;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=28770329;
 //BA.debugLineNum = 28770329;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28770330;
 //BA.debugLineNum = 28770330;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=28770332;
 //BA.debugLineNum = 28770332;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=28770334;
 //BA.debugLineNum = 28770334;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=28770335;
 //BA.debugLineNum = 28770335;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step29 = 1;
final int limit29 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit29 ;_row = _row + step29 ) {
RDebugUtils.currentLine=28770336;
 //BA.debugLineNum = 28770336;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28770337;
 //BA.debugLineNum = 28770337;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28770338;
 //BA.debugLineNum = 28770338;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=28770339;
 //BA.debugLineNum = 28770339;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R")) {
case 0: {
RDebugUtils.currentLine=28770341;
 //BA.debugLineNum = 28770341;BA.debugLine="ii = Curs.GetInt2(col)";
_ii = (long) (_curs.GetInt2(_col));
RDebugUtils.currentLine=28770342;
 //BA.debugLineNum = 28770342;BA.debugLine="str = ii";
_str = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=28770344;
 //BA.debugLineNum = 28770344;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=28770345;
 //BA.debugLineNum = 28770345;BA.debugLine="str = dd";
_str = BA.NumberToString(_dd);
 break; }
}
;
 }else {
RDebugUtils.currentLine=28770348;
 //BA.debugLineNum = 28770348;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=28770350;
 //BA.debugLineNum = 28770350;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28770351;
 //BA.debugLineNum = 28770351;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=28770353;
 //BA.debugLineNum = 28770353;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=28770356;
 //BA.debugLineNum = 28770356;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=28770360;
 //BA.debugLineNum = 28770360;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=28770361;
 //BA.debugLineNum = 28770361;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=28770365;
 //BA.debugLineNum = 28770365;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=28770367;
 //BA.debugLineNum = 28770367;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step56 = 1;
final int limit56 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit56 ;_row = _row + step56 ) {
RDebugUtils.currentLine=28770368;
 //BA.debugLineNum = 28770368;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28770369;
 //BA.debugLineNum = 28770369;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=28770370;
 //BA.debugLineNum = 28770370;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=28770371;
 //BA.debugLineNum = 28770371;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28770372;
 //BA.debugLineNum = 28770372;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=28770373;
 //BA.debugLineNum = 28770373;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 }else {
RDebugUtils.currentLine=28770375;
 //BA.debugLineNum = 28770375;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R","T")) {
case 0: {
RDebugUtils.currentLine=28770377;
 //BA.debugLineNum = 28770377;BA.debugLine="ii = Curs.GetLong2(col)";
_ii = _curs.GetLong2(_col);
RDebugUtils.currentLine=28770378;
 //BA.debugLineNum = 28770378;BA.debugLine="R(col) = ii";
_r[_col] = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=28770380;
 //BA.debugLineNum = 28770380;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=28770381;
 //BA.debugLineNum = 28770381;BA.debugLine="R(col) = dd";
_r[_col] = BA.NumberToString(_dd);
 break; }
case 2: {
RDebugUtils.currentLine=28770383;
 //BA.debugLineNum = 28770383;BA.debugLine="R(col) = Curs.GetString2(col)";
_r[_col] = _curs.GetString2(_col);
 break; }
default: {
RDebugUtils.currentLine=28770385;
 //BA.debugLineNum = 28770385;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 break; }
}
;
 };
 }
};
RDebugUtils.currentLine=28770389;
 //BA.debugLineNum = 28770389;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=28770392;
 //BA.debugLineNum = 28770392;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=28770393;
 //BA.debugLineNum = 28770393;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb3(b4a.example.ef.table __ref,anywheresoftware.b4a.sql.SQL _sqlite,String _query,String[] _values,boolean _automaticwidths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadsqlitedb3", false))
	 {return ((String) Debug.delegate(ba, "loadsqlitedb3", new Object[] {_sqlite,_query,_values,_automaticwidths}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
String[] _r = null;
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Public Sub LoadSQLiteDB3(SQLite As SQL, Query As S";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=28835845;
 //BA.debugLineNum = 28835845;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=28835846;
 //BA.debugLineNum = 28835846;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=28835849;
 //BA.debugLineNum = 28835849;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28835850;
 //BA.debugLineNum = 28835850;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28835851;
 //BA.debugLineNum = 28835851;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28835852;
 //BA.debugLineNum = 28835852;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=28835853;
 //BA.debugLineNum = 28835853;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=28835854;
 //BA.debugLineNum = 28835854;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=28835855;
 //BA.debugLineNum = 28835855;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=28835856;
 //BA.debugLineNum = 28835856;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=28835857;
 //BA.debugLineNum = 28835857;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=28835858;
 //BA.debugLineNum = 28835858;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=28835859;
 //BA.debugLineNum = 28835859;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28835860;
 //BA.debugLineNum = 28835860;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28835861;
 //BA.debugLineNum = 28835861;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=28835863;
 //BA.debugLineNum = 28835863;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28835864;
 //BA.debugLineNum = 28835864;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=28835866;
 //BA.debugLineNum = 28835866;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=28835868;
 //BA.debugLineNum = 28835868;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=28835869;
 //BA.debugLineNum = 28835869;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=28835870;
 //BA.debugLineNum = 28835870;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28835871;
 //BA.debugLineNum = 28835871;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28835872;
 //BA.debugLineNum = 28835872;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=28835873;
 //BA.debugLineNum = 28835873;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28835874;
 //BA.debugLineNum = 28835874;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=28835876;
 //BA.debugLineNum = 28835876;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=28835880;
 //BA.debugLineNum = 28835880;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=28835884;
 //BA.debugLineNum = 28835884;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=28835885;
 //BA.debugLineNum = 28835885;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=28835889;
 //BA.debugLineNum = 28835889;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=28835891;
 //BA.debugLineNum = 28835891;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=28835892;
 //BA.debugLineNum = 28835892;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=28835893;
 //BA.debugLineNum = 28835893;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=28835894;
 //BA.debugLineNum = 28835894;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28835895;
 //BA.debugLineNum = 28835895;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28835896;
 //BA.debugLineNum = 28835896;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=28835897;
 //BA.debugLineNum = 28835897;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=28835899;
 //BA.debugLineNum = 28835899;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=28835902;
 //BA.debugLineNum = 28835902;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=28835905;
 //BA.debugLineNum = 28835905;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=28835906;
 //BA.debugLineNum = 28835906;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb4(b4a.example.ef.table __ref,anywheresoftware.b4a.sql.SQL _sqlite,String _query,boolean _automaticwidths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadsqlitedb4", false))
	 {return ((String) Debug.delegate(ba, "loadsqlitedb4", new Object[] {_sqlite,_query,_automaticwidths}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
double _dval = 0;
String[] _r = null;
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Public Sub LoadSQLiteDB4(SQLite As SQL, Query As S";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=28901379;
 //BA.debugLineNum = 28901379;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=28901381;
 //BA.debugLineNum = 28901381;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=28901382;
 //BA.debugLineNum = 28901382;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=28901383;
 //BA.debugLineNum = 28901383;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=28901385;
 //BA.debugLineNum = 28901385;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=28901386;
 //BA.debugLineNum = 28901386;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28901387;
 //BA.debugLineNum = 28901387;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28901388;
 //BA.debugLineNum = 28901388;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28901389;
 //BA.debugLineNum = 28901389;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=28901390;
 //BA.debugLineNum = 28901390;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=28901391;
 //BA.debugLineNum = 28901391;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=28901393;
 //BA.debugLineNum = 28901393;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=28901395;
 //BA.debugLineNum = 28901395;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=28901396;
 //BA.debugLineNum = 28901396;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=28901397;
 //BA.debugLineNum = 28901397;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=28901398;
 //BA.debugLineNum = 28901398;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28901399;
 //BA.debugLineNum = 28901399;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28901400;
 //BA.debugLineNum = 28901400;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=28901402;
 //BA.debugLineNum = 28901402;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28901403;
 //BA.debugLineNum = 28901403;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=28901405;
 //BA.debugLineNum = 28901405;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=28901407;
 //BA.debugLineNum = 28901407;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=28901408;
 //BA.debugLineNum = 28901408;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=28901409;
 //BA.debugLineNum = 28901409;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28901410;
 //BA.debugLineNum = 28901410;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28901411;
 //BA.debugLineNum = 28901411;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=28901412;
 //BA.debugLineNum = 28901412;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=28901413;
 //BA.debugLineNum = 28901413;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=28901414;
 //BA.debugLineNum = 28901414;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=28901415;
 //BA.debugLineNum = 28901415;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=28901417;
 //BA.debugLineNum = 28901417;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28901418;
 //BA.debugLineNum = 28901418;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=28901420;
 //BA.debugLineNum = 28901420;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=28901423;
 //BA.debugLineNum = 28901423;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=28901427;
 //BA.debugLineNum = 28901427;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=28901428;
 //BA.debugLineNum = 28901428;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=28901432;
 //BA.debugLineNum = 28901432;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=28901434;
 //BA.debugLineNum = 28901434;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=28901435;
 //BA.debugLineNum = 28901435;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=28901436;
 //BA.debugLineNum = 28901436;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=28901437;
 //BA.debugLineNum = 28901437;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28901438;
 //BA.debugLineNum = 28901438;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28901439;
 //BA.debugLineNum = 28901439;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=28901440;
 //BA.debugLineNum = 28901440;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=28901441;
 //BA.debugLineNum = 28901441;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=28901442;
 //BA.debugLineNum = 28901442;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=28901443;
 //BA.debugLineNum = 28901443;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=28901445;
 //BA.debugLineNum = 28901445;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=28901447;
 //BA.debugLineNum = 28901447;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=28901450;
 //BA.debugLineNum = 28901450;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=28901451;
 //BA.debugLineNum = 28901451;BA.debugLine="End Sub";
return "";
}
public String  _loadsqlitedb5(b4a.example.ef.table __ref,anywheresoftware.b4a.sql.SQL _sqlite,String _query,String[] _values,boolean _automaticwidths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadsqlitedb5", false))
	 {return ((String) Debug.delegate(ba, "loadsqlitedb5", new Object[] {_sqlite,_query,_values,_automaticwidths}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _curs = null;
String[] _headers = null;
int _col = 0;
int _row = 0;
String _str = "";
double _dval = 0;
String[] _r = null;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Public Sub LoadSQLiteDB5(SQLite As SQL, Query As S";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=28966919;
 //BA.debugLineNum = 28966919;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=28966921;
 //BA.debugLineNum = 28966921;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=28966922;
 //BA.debugLineNum = 28966922;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28966923;
 //BA.debugLineNum = 28966923;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28966924;
 //BA.debugLineNum = 28966924;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28966925;
 //BA.debugLineNum = 28966925;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=28966926;
 //BA.debugLineNum = 28966926;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=28966927;
 //BA.debugLineNum = 28966927;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=28966929;
 //BA.debugLineNum = 28966929;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=28966931;
 //BA.debugLineNum = 28966931;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=28966932;
 //BA.debugLineNum = 28966932;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=28966933;
 //BA.debugLineNum = 28966933;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=28966934;
 //BA.debugLineNum = 28966934;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28966935;
 //BA.debugLineNum = 28966935;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28966936;
 //BA.debugLineNum = 28966936;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=28966938;
 //BA.debugLineNum = 28966938;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28966939;
 //BA.debugLineNum = 28966939;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=28966941;
 //BA.debugLineNum = 28966941;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=28966943;
 //BA.debugLineNum = 28966943;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=28966944;
 //BA.debugLineNum = 28966944;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=28966945;
 //BA.debugLineNum = 28966945;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28966946;
 //BA.debugLineNum = 28966946;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28966947;
 //BA.debugLineNum = 28966947;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=28966948;
 //BA.debugLineNum = 28966948;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=28966949;
 //BA.debugLineNum = 28966949;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=28966950;
 //BA.debugLineNum = 28966950;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=28966951;
 //BA.debugLineNum = 28966951;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=28966953;
 //BA.debugLineNum = 28966953;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28966954;
 //BA.debugLineNum = 28966954;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=28966956;
 //BA.debugLineNum = 28966956;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=28966959;
 //BA.debugLineNum = 28966959;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=28966963;
 //BA.debugLineNum = 28966963;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=28966964;
 //BA.debugLineNum = 28966964;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=28966968;
 //BA.debugLineNum = 28966968;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=28966970;
 //BA.debugLineNum = 28966970;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=28966971;
 //BA.debugLineNum = 28966971;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=28966972;
 //BA.debugLineNum = 28966972;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=28966973;
 //BA.debugLineNum = 28966973;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=28966974;
 //BA.debugLineNum = 28966974;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=28966975;
 //BA.debugLineNum = 28966975;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=28966976;
 //BA.debugLineNum = 28966976;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=28966977;
 //BA.debugLineNum = 28966977;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=28966978;
 //BA.debugLineNum = 28966978;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=28966979;
 //BA.debugLineNum = 28966979;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=28966981;
 //BA.debugLineNum = 28966981;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=28966983;
 //BA.debugLineNum = 28966983;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=28966986;
 //BA.debugLineNum = 28966986;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=28966987;
 //BA.debugLineNum = 28966987;BA.debugLine="End Sub";
return "";
}
public String  _loadtablefromcsv(b4a.example.ef.table __ref,String _dir,String _filename,boolean _headersexist) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadtablefromcsv", false))
	 {return ((String) Debug.delegate(ba, "loadtablefromcsv", new Object[] {_dir,_filename,_headersexist}));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
String[] _h = null;
anywheresoftware.b4a.objects.collections.List _headers = null;
int _i = 0;
String[] _firstrow = null;
String[] _row = null;
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="cAutomaticWidths = False";
__ref._cautomaticwidths /*boolean*/  = __c.False;
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_headers.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=23265292;
 //BA.debugLineNum = 23265292;BA.debugLine="h(i) = headers.Get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(","));
RDebugUtils.currentLine=23265296;
 //BA.debugLineNum = 23265296;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=23265297;
 //BA.debugLineNum = 23265297;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=23265298;
 //BA.debugLineNum = 23265298;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=23265300;
 //BA.debugLineNum = 23265300;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=23265303;
 //BA.debugLineNum = 23265303;BA.debugLine="innerClearAll(h.Length, True)";
__ref._innerclearall /*String*/ (null,_h.length,__c.True);
RDebugUtils.currentLine=23265304;
 //BA.debugLineNum = 23265304;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23265305;
 //BA.debugLineNum = 23265305;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23265306;
 //BA.debugLineNum = 23265306;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23265307;
 //BA.debugLineNum = 23265307;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=23265308;
 //BA.debugLineNum = 23265308;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=23265309;
 //BA.debugLineNum = 23265309;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
RDebugUtils.currentLine=23265310;
 //BA.debugLineNum = 23265310;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=23265311;
 //BA.debugLineNum = 23265311;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=23265312;
 //BA.debugLineNum = 23265312;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=23265315;
 //BA.debugLineNum = 23265315;BA.debugLine="SetHeader(h)";
__ref._setheader /*String*/ (null,_h);
RDebugUtils.currentLine=23265316;
 //BA.debugLineNum = 23265316;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=23265320;
 //BA.debugLineNum = 23265320;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=23265322;
 //BA.debugLineNum = 23265322;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=23265323;
 //BA.debugLineNum = 23265323;BA.debugLine="Dim Row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
RDebugUtils.currentLine=23265324;
 //BA.debugLineNum = 23265324;BA.debugLine="Row = List1.Get(i)";
_row = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=23265325;
 //BA.debugLineNum = 23265325;BA.debugLine="AddRow(Row)";
__ref._addrow /*String*/ (null,_row);
 }
};
RDebugUtils.currentLine=23265327;
 //BA.debugLineNum = 23265327;BA.debugLine="End Sub";
return "";
}
public String  _loadtablefromcsv2(b4a.example.ef.table __ref,String _dir,String _filename,boolean _headersexist,String _separatorchar,boolean _automaticwidths) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "loadtablefromcsv2", false))
	 {return ((String) Debug.delegate(ba, "loadtablefromcsv2", new Object[] {_dir,_filename,_headersexist,_separatorchar,_automaticwidths}));}
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4a.objects.collections.List _lstheaders = null;
String[] _headers = null;
int _i = 0;
String[] _firstrow = null;
int _col = 0;
int _row = 0;
String[] _strrow = null;
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_lstheaders);
RDebugUtils.currentLine=23330825;
 //BA.debugLineNum = 23330825;BA.debugLine="Dim Headers(lstHeaders.Size) As String";
_headers = new String[_lstheaders.getSize()];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="For i = 0 To lstHeaders.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lstheaders.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=23330827;
 //BA.debugLineNum = 23330827;BA.debugLine="Headers(i) = lstHeaders.Get(i)";
_headers[_i] = BA.ObjectToString(_lstheaders.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));
RDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=23330832;
 //BA.debugLineNum = 23330832;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="Dim Headers(firstRow.Length) As String";
_headers = new String[_firstrow.length];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=23330834;
 //BA.debugLineNum = 23330834;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=23330835;
 //BA.debugLineNum = 23330835;BA.debugLine="Headers(i) = \"Col\" & (i + 1)";
_headers[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=23330838;
 //BA.debugLineNum = 23330838;BA.debugLine="innerClearAll(Headers.Length, True)";
__ref._innerclearall /*String*/ (null,_headers.length,__c.True);
RDebugUtils.currentLine=23330839;
 //BA.debugLineNum = 23330839;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23330840;
 //BA.debugLineNum = 23330840;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23330841;
 //BA.debugLineNum = 23330841;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23330842;
 //BA.debugLineNum = 23330842;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=23330844;
 //BA.debugLineNum = 23330844;BA.debugLine="Dim col, Row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=23330845;
 //BA.debugLineNum = 23330845;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=23330846;
 //BA.debugLineNum = 23330846;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step26 = 1;
final int limit26 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit26 ;_col = _col + step26 ) {
RDebugUtils.currentLine=23330847;
 //BA.debugLineNum = 23330847;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=23330848;
 //BA.debugLineNum = 23330848;BA.debugLine="ColumnWidths(col) = SV2.Width / mNumberOfColumn";
__ref._columnwidths /*int[]*/ [_col] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=23330849;
 //BA.debugLineNum = 23330849;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
__ref._headerwidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
RDebugUtils.currentLine=23330850;
 //BA.debugLineNum = 23330850;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
__ref._datawidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
 }
};
 }else {
RDebugUtils.currentLine=23330853;
 //BA.debugLineNum = 23330853;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=23330854;
 //BA.debugLineNum = 23330854;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=23330855;
 //BA.debugLineNum = 23330855;BA.debugLine="strRow = List1.Get(col)";
_strrow = (String[])(_list1.Get(_col));
RDebugUtils.currentLine=23330856;
 //BA.debugLineNum = 23330856;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23330857;
 //BA.debugLineNum = 23330857;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit37 ;_col = _col + step37 ) {
RDebugUtils.currentLine=23330858;
 //BA.debugLineNum = 23330858;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=23330861;
 //BA.debugLineNum = 23330861;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=23330862;
 //BA.debugLineNum = 23330862;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=23330866;
 //BA.debugLineNum = 23330866;BA.debugLine="For Row = 0 To List1.Size - 1";
{
final int step46 = 1;
final int limit46 = (int) (_list1.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit46 ;_row = _row + step46 ) {
RDebugUtils.currentLine=23330867;
 //BA.debugLineNum = 23330867;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=23330868;
 //BA.debugLineNum = 23330868;BA.debugLine="strRow = List1.Get(Row)";
_strrow = (String[])(_list1.Get(_row));
RDebugUtils.currentLine=23330869;
 //BA.debugLineNum = 23330869;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=23330870;
 //BA.debugLineNum = 23330870;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=23330871;
 //BA.debugLineNum = 23330871;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=23330874;
 //BA.debugLineNum = 23330874;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step54 = 1;
final int limit54 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit54 ;_col = _col + step54 ) {
RDebugUtils.currentLine=23330875;
 //BA.debugLineNum = 23330875;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 };
 }
};
RDebugUtils.currentLine=23330879;
 //BA.debugLineNum = 23330879;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=23330880;
 //BA.debugLineNum = 23330880;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=23330881;
 //BA.debugLineNum = 23330881;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }
};
 };
RDebugUtils.currentLine=23330885;
 //BA.debugLineNum = 23330885;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=23330886;
 //BA.debugLineNum = 23330886;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=23330890;
 //BA.debugLineNum = 23330890;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=23330892;
 //BA.debugLineNum = 23330892;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step67 = 1;
final int limit67 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=23330893;
 //BA.debugLineNum = 23330893;BA.debugLine="Dim strRow() As String";
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=23330894;
 //BA.debugLineNum = 23330894;BA.debugLine="strRow = List1.Get(i)";
_strrow = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=23330895;
 //BA.debugLineNum = 23330895;BA.debugLine="AddRow(strRow)";
__ref._addrow /*String*/ (null,_strrow);
 }
};
RDebugUtils.currentLine=23330898;
 //BA.debugLineNum = 23330898;BA.debugLine="End Sub";
return "";
}
public String  _pnlfastscroll_touch(b4a.example.ef.table __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "pnlfastscroll_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlfastscroll_touch", new Object[] {_action,_x,_y}));}
int _top = 0;
int _sv2top = 0;
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Private Sub pnlFastScroll_Touch (Action As Int, X";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Select Action";
switch (_action) {
case 0: {
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="If Y >= pnlFastScrollCursor.Top And Y <= pnlFas";
if (_y>=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop() && _y<=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="FSY0 = pnlFastScrollCursor.Top";
__ref._fsy0 /*int*/  = __ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="FSdY = Y - FSY0";
__ref._fsdy /*int*/  = (int) (_y-__ref._fsy0 /*int*/ );
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="FastScrollActive = True";
__ref._fastscrollactive /*boolean*/  = __c.True;
 };
 break; }
case 2: {
RDebugUtils.currentLine=26214409;
 //BA.debugLineNum = 26214409;BA.debugLine="If FastScrollActive = True Then";
if (__ref._fastscrollactive /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26214410;
 //BA.debugLineNum = 26214410;BA.debugLine="Private Top, SV2Top As Int";
_top = 0;
_sv2top = 0;
RDebugUtils.currentLine=26214411;
 //BA.debugLineNum = 26214411;BA.debugLine="Top = Max(Y - FSdY, 0)";
_top = (int) (__c.Max(_y-__ref._fsdy /*int*/ ,0));
RDebugUtils.currentLine=26214412;
 //BA.debugLineNum = 26214412;BA.debugLine="Top = Min(Top, pnlFastScroll.Height - pnlFastS";
_top = (int) (__c.Min(_top,__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=26214413;
 //BA.debugLineNum = 26214413;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=26214414;
 //BA.debugLineNum = 26214414;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26214415;
 //BA.debugLineNum = 26214415;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top +";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=26214417;
 //BA.debugLineNum = 26214417;BA.debugLine="SV2Top = Top / FScScale";
_sv2top = (int) (_top/(double)__ref._fscscale /*double*/ );
RDebugUtils.currentLine=26214418;
 //BA.debugLineNum = 26214418;BA.debugLine="SV2.VerticalScrollPosition = SV2Top";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_sv2top);
 };
 break; }
case 1: {
RDebugUtils.currentLine=26214421;
 //BA.debugLineNum = 26214421;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=26214423;
 //BA.debugLineNum = 26214423;BA.debugLine="End Sub";
return "";
}
public String  _refreshlabels(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "refreshlabels", false))
	 {return ((String) Debug.delegate(ba, "refreshlabels", null));}
int _i = 0;
int _j = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub RefreshLabels";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="Private i, j As Int";
_i = 0;
_j = 0;
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step3 = 1;
final int limit3 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="If cTypeFaces.Length < mNumberOfColumns Then";
if (__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="Private cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
RDebugUtils.currentLine=23986187;
 //BA.debugLineNum = 23986187;BA.debugLine="cTypeFaces(j) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }
};
 };
RDebugUtils.currentLine=23986191;
 //BA.debugLineNum = 23986191;BA.debugLine="If cTextColors.Length < mNumberOfColumns Then";
if (__ref._ctextcolors /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=23986192;
 //BA.debugLineNum = 23986192;BA.debugLine="Private cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23986193;
 //BA.debugLineNum = 23986193;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit14 ;_j = _j + step14 ) {
RDebugUtils.currentLine=23986194;
 //BA.debugLineNum = 23986194;BA.debugLine="cTextColors(j) = cTextColor";
__ref._ctextcolors /*int[]*/ [_j] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=23986197;
 //BA.debugLineNum = 23986197;BA.debugLine="For i = 0 To LabelsCache.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=23986198;
 //BA.debugLineNum = 23986198;BA.debugLine="Private lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=23986199;
 //BA.debugLineNum = 23986199;BA.debugLine="lbls = LabelsCache.Get(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=23986200;
 //BA.debugLineNum = 23986200;BA.debugLine="For j = 0 To lbls.Length - 1";
{
final int step21 = 1;
final int limit21 = (int) (_lbls.length-1);
_j = (int) (0) ;
for (;_j <= limit21 ;_j = _j + step21 ) {
RDebugUtils.currentLine=23986201;
 //BA.debugLineNum = 23986201;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=23986202;
 //BA.debugLineNum = 23986202;BA.debugLine="lbls(j).Typeface = cTypeFaces(j)";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j].getObject()));
RDebugUtils.currentLine=23986203;
 //BA.debugLineNum = 23986203;BA.debugLine="lbls(j).TextColor = cTextColors(j)";
_lbls[_j].setTextColor(__ref._ctextcolors /*int[]*/ [_j]);
 }else {
RDebugUtils.currentLine=23986205;
 //BA.debugLineNum = 23986205;BA.debugLine="lbls(j).Typeface = cTypeFace";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=23986206;
 //BA.debugLineNum = 23986206;BA.debugLine="lbls(j).TextColor = cTextColor";
_lbls[_j].setTextColor(__ref._ctextcolor /*int*/ );
 };
 }
};
 }
};
RDebugUtils.currentLine=23986211;
 //BA.debugLineNum = 23986211;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all";
{
final int step31 = 1;
final int limit31 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=23986212;
 //BA.debugLineNum = 23986212;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=23986214;
 //BA.debugLineNum = 23986214;BA.debugLine="End Sub";
return "";
}
public String  _removeaccents(b4a.example.ef.table __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removeaccents", false))
	 {return ((String) Debug.delegate(ba, "removeaccents", new Object[] {_s}));}
anywheresoftware.b4j.object.JavaObject _normalizer = null;
String _n = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Private Sub RemoveAccents(s As String) As String";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="Dim normalizer As JavaObject";
_normalizer = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="normalizer.InitializeStatic(\"java.text.Normalizer";
_normalizer.InitializeStatic("java.text.Normalizer");
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="Dim n As String = normalizer.RunMethod(\"normalize";
_n = BA.ObjectToString(_normalizer.RunMethod("normalize",new Object[]{(Object)(_s),(Object)("NFD")}));
RDebugUtils.currentLine=31391748;
 //BA.debugLineNum = 31391748;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=31391749;
 //BA.debugLineNum = 31391749;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=31391750;
 //BA.debugLineNum = 31391750;BA.debugLine="For i = 0 To n.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_n.length()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=31391751;
 //BA.debugLineNum = 31391751;BA.debugLine="If Regex.IsMatch(\"\\p{InCombiningDiacriticalMarks";
if (__c.Regex.IsMatch("\\p{InCombiningDiacriticalMarks}",BA.ObjectToString(_n.charAt(_i)))==__c.False) { 
RDebugUtils.currentLine=31391752;
 //BA.debugLineNum = 31391752;BA.debugLine="sb.Append(n.CharAt(i))";
_sb.Append(BA.ObjectToString(_n.charAt(_i)));
 };
 }
};
RDebugUtils.currentLine=31391755;
 //BA.debugLineNum = 31391755;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=31391756;
 //BA.debugLineNum = 31391756;BA.debugLine="End Sub";
return "";
}
public String  _removerow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removerow", false))
	 {return ((String) Debug.delegate(ba, "removerow", new Object[] {_row}));}
int _previndex = 0;
int _i = 0;
int _keepsel = 0;
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub RemoveRow(Row As Int)";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="If (Row <0 Or Row > Data.Size-1) Then Return ' ca";
if ((_row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
if (true) return "";};
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=23527431;
 //BA.debugLineNum = 23527431;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=23527432;
 //BA.debugLineNum = 23527432;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rm";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=23527434;
 //BA.debugLineNum = 23527434;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step5 = 1;
final int limit5 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=23527435;
 //BA.debugLineNum = 23527435;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=23527436;
 //BA.debugLineNum = 23527436;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=23527437;
 //BA.debugLineNum = 23527437;BA.debugLine="If (keepSel > Row) Then";
if ((_keepsel>_row)) { 
RDebugUtils.currentLine=23527438;
 //BA.debugLineNum = 23527438;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel-1));
 };
 }
};
RDebugUtils.currentLine=23527443;
 //BA.debugLineNum = 23527443;BA.debugLine="If (prevIndex <> -1) Then";
if ((_previndex!=-1)) { 
RDebugUtils.currentLine=23527445;
 //BA.debugLineNum = 23527445;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=23527448;
 //BA.debugLineNum = 23527448;BA.debugLine="Data.RemoveAt(Row)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=23527449;
 //BA.debugLineNum = 23527449;BA.debugLine="lstRowColorIndexes.RemoveAt(Row)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=23527450;
 //BA.debugLineNum = 23527450;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step17 = 1;
final int limit17 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=23527451;
 //BA.debugLineNum = 23527451;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=23527462;
 //BA.debugLineNum = 23527462;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=23527463;
 //BA.debugLineNum = 23527463;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
__ref._maxvisiblerow /*int*/  = (int) (__c.Min(__ref._maxvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=23527464;
 //BA.debugLineNum = 23527464;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
__ref._minvisiblerow /*int*/  = (int) (__c.Min(__ref._minvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=23527465;
 //BA.debugLineNum = 23527465;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
{
final int step23 = 1;
final int limit23 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=23527467;
 //BA.debugLineNum = 23527467;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
 };
RDebugUtils.currentLine=23527471;
 //BA.debugLineNum = 23527471;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=23527472;
 //BA.debugLineNum = 23527472;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=23527473;
 //BA.debugLineNum = 23527473;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=23527475;
 //BA.debugLineNum = 23527475;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=23527476;
 //BA.debugLineNum = 23527476;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=23527477;
 //BA.debugLineNum = 23527477;BA.debugLine="End Sub";
return "";
}
public String  _removerowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removerowcolorn", false))
	 {return ((String) Debug.delegate(ba, "removerowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Public Sub RemoveRowColorN(Row As Int)";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="If Row > -1 And Row <lstRowColorIndexes.Size Then";
if (_row>-1 && _row<__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="lstRowColorIndexes.Set(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(0));
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
 };
RDebugUtils.currentLine=27394055;
 //BA.debugLineNum = 27394055;BA.debugLine="End Sub";
return "";
}
public String  _removeview(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removeview", false))
	 {return ((String) Debug.delegate(ba, "removeview", null));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Public Sub RemoveView";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="pnlTable.RemoveView";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="End Sub";
return "";
}
public int[]  _reverseindexdouble(b4a.example.ef.table __ref,double[] _arrdouble,int[] _arrindex,boolean _bunique) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "reverseindexdouble", false))
	 {return ((int[]) Debug.delegate(ba, "reverseindexdouble", new Object[] {_arrdouble,_arrindex,_bunique}));}
int _i = 0;
int _c = 0;
int _n = 0;
int _x = 0;
int _iub = 0;
boolean _bsame = false;
int[] _arrindex2 = null;
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Sub ReverseIndexDouble(arrDouble() As Double, arrI";
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=34078724;
 //BA.debugLineNum = 34078724;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=34078725;
 //BA.debugLineNum = 34078725;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=34078726;
 //BA.debugLineNum = 34078726;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=34078727;
 //BA.debugLineNum = 34078727;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=34078728;
 //BA.debugLineNum = 34078728;BA.debugLine="Dim arrIndex2(arrDouble.Length) As Int";
_arrindex2 = new int[_arrdouble.length];
;
RDebugUtils.currentLine=34078730;
 //BA.debugLineNum = 34078730;BA.debugLine="iUB = arrDouble.Length - 1";
_iub = (int) (_arrdouble.length-1);
RDebugUtils.currentLine=34078732;
 //BA.debugLineNum = 34078732;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=34078734;
 //BA.debugLineNum = 34078734;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=34078735;
 //BA.debugLineNum = 34078735;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=34078737;
 //BA.debugLineNum = 34078737;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=34078739;
 //BA.debugLineNum = 34078739;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=34078740;
 //BA.debugLineNum = 34078740;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=34078741;
 //BA.debugLineNum = 34078741;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=34078743;
 //BA.debugLineNum = 34078743;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=34078745;
 //BA.debugLineNum = 34078745;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=34078746;
 //BA.debugLineNum = 34078746;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=34078747;
 //BA.debugLineNum = 34078747;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=34078748;
 //BA.debugLineNum = 34078748;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=34078749;
 //BA.debugLineNum = 34078749;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=34078750;
 //BA.debugLineNum = 34078750;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=34078751;
 //BA.debugLineNum = 34078751;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=34078753;
 //BA.debugLineNum = 34078753;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=34078756;
 //BA.debugLineNum = 34078756;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=34078757;
 //BA.debugLineNum = 34078757;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=34078758;
 //BA.debugLineNum = 34078758;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=34078759;
 //BA.debugLineNum = 34078759;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=34078760;
 //BA.debugLineNum = 34078760;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=34078762;
 //BA.debugLineNum = 34078762;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=34078764;
 //BA.debugLineNum = 34078764;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=34078770;
 //BA.debugLineNum = 34078770;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=34078772;
 //BA.debugLineNum = 34078772;BA.debugLine="End Sub";
return null;
}
public int[]  _reverseindexlong(b4a.example.ef.table __ref,long[] _arrlong,int[] _arrindex,boolean _bunique) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "reverseindexlong", false))
	 {return ((int[]) Debug.delegate(ba, "reverseindexlong", new Object[] {_arrlong,_arrindex,_bunique}));}
int _i = 0;
int _c = 0;
int _n = 0;
int _x = 0;
int _iub = 0;
boolean _bsame = false;
int[] _arrindex2 = null;
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Sub ReverseIndexLong(arrLong() As Long, arrIndex()";
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=34013187;
 //BA.debugLineNum = 34013187;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=34013188;
 //BA.debugLineNum = 34013188;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=34013189;
 //BA.debugLineNum = 34013189;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=34013190;
 //BA.debugLineNum = 34013190;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=34013191;
 //BA.debugLineNum = 34013191;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=34013192;
 //BA.debugLineNum = 34013192;BA.debugLine="Dim arrIndex2(arrLong.Length) As Int";
_arrindex2 = new int[_arrlong.length];
;
RDebugUtils.currentLine=34013194;
 //BA.debugLineNum = 34013194;BA.debugLine="iUB = arrLong.Length - 1";
_iub = (int) (_arrlong.length-1);
RDebugUtils.currentLine=34013196;
 //BA.debugLineNum = 34013196;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=34013198;
 //BA.debugLineNum = 34013198;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=34013199;
 //BA.debugLineNum = 34013199;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=34013201;
 //BA.debugLineNum = 34013201;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=34013203;
 //BA.debugLineNum = 34013203;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=34013204;
 //BA.debugLineNum = 34013204;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=34013205;
 //BA.debugLineNum = 34013205;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=34013207;
 //BA.debugLineNum = 34013207;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=34013209;
 //BA.debugLineNum = 34013209;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=34013210;
 //BA.debugLineNum = 34013210;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=34013211;
 //BA.debugLineNum = 34013211;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=34013212;
 //BA.debugLineNum = 34013212;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=34013213;
 //BA.debugLineNum = 34013213;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=34013214;
 //BA.debugLineNum = 34013214;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=34013215;
 //BA.debugLineNum = 34013215;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=34013217;
 //BA.debugLineNum = 34013217;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=34013220;
 //BA.debugLineNum = 34013220;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=34013221;
 //BA.debugLineNum = 34013221;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=34013222;
 //BA.debugLineNum = 34013222;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=34013223;
 //BA.debugLineNum = 34013223;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=34013224;
 //BA.debugLineNum = 34013224;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=34013226;
 //BA.debugLineNum = 34013226;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=34013228;
 //BA.debugLineNum = 34013228;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=34013234;
 //BA.debugLineNum = 34013234;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=34013236;
 //BA.debugLineNum = 34013236;BA.debugLine="End Sub";
return null;
}
public int[]  _reverseindexstring(b4a.example.ef.table __ref,String[] _arrstring,int[] _arrindex,boolean _bunique) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "reverseindexstring", false))
	 {return ((int[]) Debug.delegate(ba, "reverseindexstring", new Object[] {_arrstring,_arrindex,_bunique}));}
int _i = 0;
int _c = 0;
int _n = 0;
int _x = 0;
int _iub = 0;
boolean _bsame = false;
int[] _arrindex2 = null;
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Sub ReverseIndexString(arrString() As String, arrI";
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=34144259;
 //BA.debugLineNum = 34144259;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=34144260;
 //BA.debugLineNum = 34144260;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=34144261;
 //BA.debugLineNum = 34144261;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=34144262;
 //BA.debugLineNum = 34144262;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=34144263;
 //BA.debugLineNum = 34144263;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=34144264;
 //BA.debugLineNum = 34144264;BA.debugLine="Dim arrIndex2(arrString.Length) As Int";
_arrindex2 = new int[_arrstring.length];
;
RDebugUtils.currentLine=34144266;
 //BA.debugLineNum = 34144266;BA.debugLine="iUB = arrString.Length - 1";
_iub = (int) (_arrstring.length-1);
RDebugUtils.currentLine=34144268;
 //BA.debugLineNum = 34144268;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=34144270;
 //BA.debugLineNum = 34144270;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=34144271;
 //BA.debugLineNum = 34144271;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=34144273;
 //BA.debugLineNum = 34144273;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=34144275;
 //BA.debugLineNum = 34144275;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=34144276;
 //BA.debugLineNum = 34144276;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=34144277;
 //BA.debugLineNum = 34144277;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i+1)]]);
 }else {
RDebugUtils.currentLine=34144279;
 //BA.debugLineNum = 34144279;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i-1)]]);
 };
RDebugUtils.currentLine=34144281;
 //BA.debugLineNum = 34144281;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=34144282;
 //BA.debugLineNum = 34144282;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=34144283;
 //BA.debugLineNum = 34144283;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=34144284;
 //BA.debugLineNum = 34144284;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=34144285;
 //BA.debugLineNum = 34144285;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=34144286;
 //BA.debugLineNum = 34144286;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=34144287;
 //BA.debugLineNum = 34144287;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=34144289;
 //BA.debugLineNum = 34144289;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=34144292;
 //BA.debugLineNum = 34144292;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=34144293;
 //BA.debugLineNum = 34144293;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=34144294;
 //BA.debugLineNum = 34144294;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=34144295;
 //BA.debugLineNum = 34144295;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=34144296;
 //BA.debugLineNum = 34144296;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=34144299;
 //BA.debugLineNum = 34144299;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=34144301;
 //BA.debugLineNum = 34144301;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=34144307;
 //BA.debugLineNum = 34144307;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=34144309;
 //BA.debugLineNum = 34144309;BA.debugLine="End Sub";
return null;
}
public String  _savetabletocsv(b4a.example.ef.table __ref,String _dir,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "savetabletocsv", false))
	 {return ((String) Debug.delegate(ba, "savetabletocsv", new Object[] {_dir,_filename}));}
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23396359;
 //BA.debugLineNum = 23396359;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=23396360;
 //BA.debugLineNum = 23396360;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23396365;
 //BA.debugLineNum = 23396365;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=23396366;
 //BA.debugLineNum = 23396366;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=23396368;
 //BA.debugLineNum = 23396368;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=23396369;
 //BA.debugLineNum = 23396369;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=23396373;
 //BA.debugLineNum = 23396373;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, H";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(","),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=23396374;
 //BA.debugLineNum = 23396374;BA.debugLine="End Sub";
return "";
}
public String  _savetabletocsv2(b4a.example.ef.table __ref,String _dir,String _filename,String _separatorchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "savetabletocsv2", false))
	 {return ((String) Debug.delegate(ba, "savetabletocsv2", new Object[] {_dir,_filename,_separatorchar}));}
String[] _headers = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _l = null;
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub SaveTableToCSV2(Dir As String, Filename";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Dim headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="Private headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=23461897;
 //BA.debugLineNum = 23461897;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=23461901;
 //BA.debugLineNum = 23461901;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=23461903;
 //BA.debugLineNum = 23461903;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=23461905;
 //BA.debugLineNum = 23461905;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=23461906;
 //BA.debugLineNum = 23461906;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=23461910;
 //BA.debugLineNum = 23461910;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, SeparatorCha";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=23461911;
 //BA.debugLineNum = 23461911;BA.debugLine="End Sub";
return "";
}
public String  _scaletable(b4a.example.ef.table __ref,double _scalex,double _scaley,boolean _scalealldone) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "scaletable", false))
	 {return ((String) Debug.delegate(ba, "scaletable", new Object[] {_scalex,_scaley,_scalealldone}));}
int _i = 0;
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Public Sub ScaleTable(ScaleX As Double, ScaleY As";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="ToastMessageShow(\"Table.ScaleTable must be calle";
__c.ToastMessageShow(BA.ObjectToCharSequence("Table.ScaleTable must be called before filling the Table"),__c.False);
RDebugUtils.currentLine=30605315;
 //BA.debugLineNum = 30605315;BA.debugLine="Log(\"Table.ScaleTable must be called before fill";
__c.LogImpl("730605315","Table.ScaleTable must be called before filling the Table",0);
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="cTextSize = cTextSize * Min(ScaleX, ScaleY)";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *__c.Min(_scalex,_scaley));
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="cLineWidth = cLineWidth * ScaleX";
__ref._clinewidth /*int*/  = (int) (__ref._clinewidth /*int*/ *_scalex);
RDebugUtils.currentLine=30605321;
 //BA.debugLineNum = 30605321;BA.debugLine="ExtraWidth = ExtraWidth * ScaleX";
__ref._extrawidth /*int*/  = (int) (__ref._extrawidth /*int*/ *_scalex);
RDebugUtils.currentLine=30605322;
 //BA.debugLineNum = 30605322;BA.debugLine="cRowHeight  = cRowHeight * ScaleY";
__ref._crowheight /*int*/  = (int) (__ref._crowheight /*int*/ *_scaley);
RDebugUtils.currentLine=30605323;
 //BA.debugLineNum = 30605323;BA.debugLine="cHeaderHeight = cHeaderHeight * ScaleY";
__ref._cheaderheight /*int*/  = (int) (__ref._cheaderheight /*int*/ *_scaley);
RDebugUtils.currentLine=30605324;
 //BA.debugLineNum = 30605324;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=30605325;
 //BA.debugLineNum = 30605325;BA.debugLine="ColumnWidths(i) = ColumnWidths(i) * ScaleX";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._columnwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=30605326;
 //BA.debugLineNum = 30605326;BA.debugLine="DataWidths(i) = DataWidths(i) * ScaleX";
__ref._datawidths /*int[]*/ [_i] = (int) (__ref._datawidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=30605327;
 //BA.debugLineNum = 30605327;BA.debugLine="HeaderWidths(i) = HeaderWidths(i)	* ScaleX";
__ref._headerwidths /*int[]*/ [_i] = (int) (__ref._headerwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=30605328;
 //BA.debugLineNum = 30605328;BA.debugLine="SavedWidths(i) = SavedWidths(i)	* ScaleX";
__ref._savedwidths /*int[]*/ [_i] = (int) (__ref._savedwidths /*int[]*/ [_i]*_scalex);
 }
};
RDebugUtils.currentLine=30605331;
 //BA.debugLineNum = 30605331;BA.debugLine="If ScaleAllDone = False Then";
if (_scalealldone==__c.False) { 
RDebugUtils.currentLine=30605332;
 //BA.debugLineNum = 30605332;BA.debugLine="cLeft = cLeft * ScaleX";
__ref._cleft /*int*/  = (int) (__ref._cleft /*int*/ *_scalex);
RDebugUtils.currentLine=30605333;
 //BA.debugLineNum = 30605333;BA.debugLine="cTop = cTop * ScaleY";
__ref._ctop /*int*/  = (int) (__ref._ctop /*int*/ *_scaley);
RDebugUtils.currentLine=30605334;
 //BA.debugLineNum = 30605334;BA.debugLine="cWidth = cWidth * ScaleX";
__ref._cwidth /*int*/  = (int) (__ref._cwidth /*int*/ *_scalex);
RDebugUtils.currentLine=30605335;
 //BA.debugLineNum = 30605335;BA.debugLine="cHeight = cHeight * ScaleY";
__ref._cheight /*int*/  = (int) (__ref._cheight /*int*/ *_scaley);
RDebugUtils.currentLine=30605337;
 //BA.debugLineNum = 30605337;BA.debugLine="cTextSize = cTextSize * ScaleY";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *_scaley);
RDebugUtils.currentLine=30605338;
 //BA.debugLineNum = 30605338;BA.debugLine="pnlTable.Left = cLeft";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._cleft /*int*/ );
RDebugUtils.currentLine=30605339;
 //BA.debugLineNum = 30605339;BA.debugLine="pnlTable.Top = cTop";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._ctop /*int*/ );
RDebugUtils.currentLine=30605340;
 //BA.debugLineNum = 30605340;BA.debugLine="pnlTable.Width = cWidth";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._cwidth /*int*/ );
RDebugUtils.currentLine=30605341;
 //BA.debugLineNum = 30605341;BA.debugLine="pnlTable.Height = cHeight";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheight /*int*/ );
RDebugUtils.currentLine=30605342;
 //BA.debugLineNum = 30605342;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=30605343;
 //BA.debugLineNum = 30605343;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=30605344;
 //BA.debugLineNum = 30605344;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=30605345;
 //BA.debugLineNum = 30605345;BA.debugLine="SV2.Width = cWidth";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(__ref._cwidth /*int*/ );
 }else {
RDebugUtils.currentLine=30605347;
 //BA.debugLineNum = 30605347;BA.debugLine="SVF.Width = SVF.Width * ScaleX";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=30605348;
 //BA.debugLineNum = 30605348;BA.debugLine="SV2.Width = SV2.Width * ScaleX";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=30605349;
 //BA.debugLineNum = 30605349;BA.debugLine="SV2.Left = SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=30605351;
 //BA.debugLineNum = 30605351;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=30605352;
 //BA.debugLineNum = 30605352;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=30605353;
 //BA.debugLineNum = 30605353;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=30605354;
 //BA.debugLineNum = 30605354;BA.debugLine="SV2.Height = cHeight - cStatusLineHeight - cHea";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=30605355;
 //BA.debugLineNum = 30605355;BA.debugLine="SVF.Height = cHeight - cStatusLineHeight - cHea";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=30605357;
 //BA.debugLineNum = 30605357;BA.debugLine="SV2.Height = cHeight - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=30605358;
 //BA.debugLineNum = 30605358;BA.debugLine="SVF.Height = cHeight - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=30605360;
 //BA.debugLineNum = 30605360;BA.debugLine="lblFastScroll.Width = lblFastScroll.Width * Scal";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=30605361;
 //BA.debugLineNum = 30605361;BA.debugLine="lblFastScroll.Height = lblFastScroll.Height * Sc";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()*_scaley));
RDebugUtils.currentLine=30605363;
 //BA.debugLineNum = 30605363;BA.debugLine="lblFastScroll.TextSize = lblFastScroll.TextSize";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize()*_scaley));
RDebugUtils.currentLine=30605364;
 //BA.debugLineNum = 30605364;BA.debugLine="lblFastScroll.Left = lblFastScroll.Left * ScaleX";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getLeft()*_scalex));
RDebugUtils.currentLine=30605365;
 //BA.debugLineNum = 30605365;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=30605366;
 //BA.debugLineNum = 30605366;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=30605367;
 //BA.debugLineNum = 30605367;BA.debugLine="lblStatusLine.TextSize = cTextSize";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=30605368;
 //BA.debugLineNum = 30605368;BA.debugLine="lblStatusLine.Height = cStatusLineHeight";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._cstatuslineheight /*int*/ );
RDebugUtils.currentLine=30605369;
 //BA.debugLineNum = 30605369;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=30605371;
 //BA.debugLineNum = 30605371;BA.debugLine="CreateNewLabels";
__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
RDebugUtils.currentLine=30605372;
 //BA.debugLineNum = 30605372;BA.debugLine="End Sub";
return "";
}
public String  _scroll(b4a.example.ef.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "scroll", false))
	 {return ((String) Debug.delegate(ba, "scroll", new Object[] {_posx,_posy}));}
int _currentmin = 0;
int _currentmax = 0;
int _i = 0;
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub Scroll(PosX As Int, PosY As Int)";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)__ref._crowheight /*int*/ -30));
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV2.Heigh";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,(_posy+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="If minVisibleRow > -1 Then";
if (__ref._minvisiblerow /*int*/ >-1) { 
RDebugUtils.currentLine=22085637;
 //BA.debugLineNum = 22085637;BA.debugLine="If minVisibleRow < currentMin Then";
if (__ref._minvisiblerow /*int*/ <_currentmin) { 
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,__ref._maxvisiblerow /*int*/ ));
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=22085640;
 //BA.debugLineNum = 22085640;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=22085642;
 //BA.debugLineNum = 22085642;BA.debugLine="Else If minVisibleRow > currentMin Then";
if (__ref._minvisiblerow /*int*/ >_currentmin) { 
RDebugUtils.currentLine=22085644;
 //BA.debugLineNum = 22085644;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(__ref._minvisiblerow /*int*/ -1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=22085645;
 //BA.debugLineNum = 22085645;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
RDebugUtils.currentLine=22085648;
 //BA.debugLineNum = 22085648;BA.debugLine="If maxVisibleRow > currentMax Then";
if (__ref._maxvisiblerow /*int*/ >_currentmax) { 
RDebugUtils.currentLine=22085650;
 //BA.debugLineNum = 22085650;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,__ref._minvisiblerow /*int*/ ));
_i = __ref._maxvisiblerow /*int*/  ;
for (;_i >= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=22085651;
 //BA.debugLineNum = 22085651;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=22085653;
 //BA.debugLineNum = 22085653;BA.debugLine="Else If maxVisibleRow < currentMax Then";
if (__ref._maxvisiblerow /*int*/ <_currentmax) { 
RDebugUtils.currentLine=22085655;
 //BA.debugLineNum = 22085655;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(__ref._maxvisiblerow /*int*/ +1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=22085656;
 //BA.debugLineNum = 22085656;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
 };
RDebugUtils.currentLine=22085660;
 //BA.debugLineNum = 22085660;BA.debugLine="minVisibleRow = currentMin";
__ref._minvisiblerow /*int*/  = _currentmin;
RDebugUtils.currentLine=22085661;
 //BA.debugLineNum = 22085661;BA.debugLine="maxVisibleRow = currentMax";
__ref._maxvisiblerow /*int*/  = _currentmax;
RDebugUtils.currentLine=22085662;
 //BA.debugLineNum = 22085662;BA.debugLine="Header.Left = -PosX + mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-_posx+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=22085663;
 //BA.debugLineNum = 22085663;BA.debugLine="lblStatusLine.Left = - PosX";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (-_posx));
RDebugUtils.currentLine=22085664;
 //BA.debugLineNum = 22085664;BA.debugLine="End Sub";
return "";
}
public String  _setallowselection(b4a.example.ef.table __ref,boolean _allowselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setallowselection", false))
	 {return ((String) Debug.delegate(ba, "setallowselection", new Object[] {_allowselection}));}
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="cAllowSelection = AllowSelection";
__ref._callowselection /*boolean*/  = _allowselection;
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
 };
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="End Sub";
return "";
}
public String  _setautomaticwidths(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setautomaticwidths", false))
	 {return ((String) Debug.delegate(ba, "setautomaticwidths", null));}
int _row = 0;
int _col = 0;
String[] _vals = null;
int _width = 0;
int[] _widths = null;
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Public Sub SetAutomaticWidths";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="Dim row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="Dim Vals(mNumberOfColumns) As String";
_vals = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_vals,"");
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="Dim Width, Widths(mNumberOfColumns) As Int";
_width = 0;
_widths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="cAutomaticWidths = True";
__ref._cautomaticwidths /*boolean*/  = __c.True;
RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=30343176;
 //BA.debugLineNum = 30343176;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=30343177;
 //BA.debugLineNum = 30343177;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=30343179;
 //BA.debugLineNum = 30343179;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=30343182;
 //BA.debugLineNum = 30343182;BA.debugLine="For row = 0 To Data.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=30343183;
 //BA.debugLineNum = 30343183;BA.debugLine="Vals = Data.Get(row)";
_vals = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=30343184;
 //BA.debugLineNum = 30343184;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=30343185;
 //BA.debugLineNum = 30343185;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=30343187;
 //BA.debugLineNum = 30343187;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=30343189;
 //BA.debugLineNum = 30343189;BA.debugLine="If Widths(col) < Width Then";
if (_widths[_col]<_width) { 
RDebugUtils.currentLine=30343190;
 //BA.debugLineNum = 30343190;BA.debugLine="Widths(col) = Width";
_widths[_col] = _width;
 };
 }
};
 }
};
RDebugUtils.currentLine=30343194;
 //BA.debugLineNum = 30343194;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=30343195;
 //BA.debugLineNum = 30343195;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignment", false))
	 {return ((String) Debug.delegate(ba, "setcellalignment", new Object[] {_alignment}));}
int _i = 0;
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="cAlignment = Alignment";
__ref._calignment /*int*/  = _alignment;
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=25952261;
 //BA.debugLineNum = 25952261;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=25952262;
 //BA.debugLineNum = 25952262;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
RDebugUtils.currentLine=25952264;
 //BA.debugLineNum = 25952264;BA.debugLine="MultiAlignments = False";
__ref._multialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=25952265;
 //BA.debugLineNum = 25952265;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=25952266;
 //BA.debugLineNum = 25952266;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=25952268;
 //BA.debugLineNum = 25952268;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setcellalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Public Sub SetCellAlignmentColN(Col As Int, Alignm";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=26017801;
 //BA.debugLineNum = 26017801;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26017803;
 //BA.debugLineNum = 26017803;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=26017804;
 //BA.debugLineNum = 26017804;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=26017807;
 //BA.debugLineNum = 26017807;BA.debugLine="cAlignments(Col) = AlignmentColN";
__ref._calignments /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="cAlignments0 = cAlignments";
__ref._calignments0 /*int[]*/  = __ref._calignments /*int[]*/ ;
RDebugUtils.currentLine=26017810;
 //BA.debugLineNum = 26017810;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=26017811;
 //BA.debugLineNum = 26017811;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=26017812;
 //BA.debugLineNum = 26017812;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=26017814;
 //BA.debugLineNum = 26017814;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignments", false))
	 {return ((String) Debug.delegate(ba, "setcellalignments", new Object[] {_alignments}));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=25886726;
 //BA.debugLineNum = 25886726;BA.debugLine="cAlignments0 = Alignments";
__ref._calignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=25886727;
 //BA.debugLineNum = 25886727;BA.debugLine="cAlignments = cAlignments0";
__ref._calignments /*int[]*/  = __ref._calignments0 /*int[]*/ ;
RDebugUtils.currentLine=25886729;
 //BA.debugLineNum = 25886729;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=25886730;
 //BA.debugLineNum = 25886730;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=25886731;
 //BA.debugLineNum = 25886731;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=25886733;
 //BA.debugLineNum = 25886733;BA.debugLine="End Sub";
return "";
}
public String  _setcolumncolors(b4a.example.ef.table __ref,int[] _columncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setcolumncolors", new Object[] {_columncolors}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="cColumnColors = ColumnColors";
__ref._ccolumncolors /*int[]*/  = _columncolors;
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="Dim ColumnDrawables(cColumnColors.Length) As Obje";
_columndrawables = new Object[__ref._ccolumncolors /*int[]*/ .length];
{
int d0 = _columndrawables.length;
for (int i0 = 0;i0 < d0;i0++) {
_columndrawables[i0] = new Object();
}
}
;
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=29491205;
 //BA.debugLineNum = 29491205;BA.debugLine="Private cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=29491206;
 //BA.debugLineNum = 29491206;BA.debugLine="cd.Initialize(cColumnColors(i), 0)";
_cd.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=29491207;
 //BA.debugLineNum = 29491207;BA.debugLine="ColumnDrawables(i) = cd";
__ref._columndrawables /*Object[]*/ [_i] = (Object)(_cd.getObject());
 }
};
RDebugUtils.currentLine=29491210;
 //BA.debugLineNum = 29491210;BA.debugLine="If ColumnColors.Length > 1 Then";
if (_columncolors.length>1) { 
RDebugUtils.currentLine=29491211;
 //BA.debugLineNum = 29491211;BA.debugLine="cUseColumnColors = True";
__ref._cusecolumncolors /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=29491213;
 //BA.debugLineNum = 29491213;BA.debugLine="cUseColumnColors = False";
__ref._cusecolumncolors /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=29491215;
 //BA.debugLineNum = 29491215;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=29491216;
 //BA.debugLineNum = 29491216;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=29491218;
 //BA.debugLineNum = 29491218;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatype(b4a.example.ef.table __ref,int _column,String _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatype", new Object[] {_column,_datatype}));}
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Public Sub SetColumnDataType(Column As Int, DataTy";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30801926;
 //BA.debugLineNum = 30801926;BA.debugLine="If DataType <> \"T\" And DataType <> \"R\" And DataTy";
if ((_datatype).equals("T") == false && (_datatype).equals("R") == false && (_datatype).equals("I") == false) { 
RDebugUtils.currentLine=30801927;
 //BA.debugLineNum = 30801927;BA.debugLine="ToastMessageShow(\"Wrong data type only TEXT abd";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only TEXT abd NUMBER are allowed"),__c.False);
 }else {
RDebugUtils.currentLine=30801929;
 //BA.debugLineNum = 30801929;BA.debugLine="cColumnDataType(Column) = DataType";
__ref._ccolumndatatype /*String[]*/ [_column] = _datatype;
 };
RDebugUtils.currentLine=30801931;
 //BA.debugLineNum = 30801931;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatypes(b4a.example.ef.table __ref,String[] _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatypes", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatypes", new Object[] {_datatype}));}
int _col = 0;
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Public Sub SetColumnDataTypes(DataType() As String";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="If DataType.Length <> mNumberOfColumns Then";
if (_datatype.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="ToastMessageShow(\"Wrong number of columns\", Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong number of columns"),__c.False);
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30932998;
 //BA.debugLineNum = 30932998;BA.debugLine="For Col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=30932999;
 //BA.debugLineNum = 30932999;BA.debugLine="If DataType(Col) <> \"T\" And DataType(Col) <> \"R\"";
if ((_datatype[_col]).equals("T") == false && (_datatype[_col]).equals("R") == false && (_datatype[_col]).equals("I") == false) { 
RDebugUtils.currentLine=30933000;
 //BA.debugLineNum = 30933000;BA.debugLine="ToastMessageShow(\"Wrong data type only T, R and";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only T, R and I are allowed"),__c.False);
RDebugUtils.currentLine=30933001;
 //BA.debugLineNum = 30933001;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=30933005;
 //BA.debugLineNum = 30933005;BA.debugLine="cColumnDataType = DataType";
__ref._ccolumndatatype /*String[]*/  = _datatype;
RDebugUtils.currentLine=30933006;
 //BA.debugLineNum = 30933006;BA.debugLine="End Sub";
return "";
}
public String  _setfastscroll(b4a.example.ef.table __ref,boolean _fastscroll) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscroll", false))
	 {return ((String) Debug.delegate(ba, "setfastscroll", new Object[] {_fastscroll}));}
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Public Sub setFastScroll (FastScroll As Boolean)";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="mFastScroll = FastScroll";
__ref._mfastscroll /*boolean*/  = _fastscroll;
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=32243716;
 //BA.debugLineNum = 32243716;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollcolumnindex(b4a.example.ef.table __ref,int _fastscrollcolumnindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollcolumnindex", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollcolumnindex", new Object[] {_fastscrollcolumnindex}));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub setFastScrollColumnIndex (FastScrollCol";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="mFastScrollColumnIndex = Max(0, FastScrollColumnI";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Max(0,_fastscrollcolumnindex));
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="mFastScrollColumnIndex = Min(mFastScrollColumnInd";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Min(__ref._mfastscrollcolumnindex /*int*/ ,__ref._mnumberofcolumns /*int*/ -1));
RDebugUtils.currentLine=32505859;
 //BA.debugLineNum = 32505859;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollfixedlabel(b4a.example.ef.table __ref,boolean _fastscrollfixedlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollfixedlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollfixedlabel", new Object[] {_fastscrollfixedlabel}));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub setFastScrollFixedLabel (FastScrollFixe";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="mFastScrollFixedLabel = FastScrollFixedLabel";
__ref._mfastscrollfixedlabel /*boolean*/  = _fastscrollfixedlabel;
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=32768003;
 //BA.debugLineNum = 32768003;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
RDebugUtils.currentLine=32768004;
 //BA.debugLineNum = 32768004;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=32768006;
 //BA.debugLineNum = 32768006;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=32768007;
 //BA.debugLineNum = 32768007;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=32768009;
 //BA.debugLineNum = 32768009;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=32768010;
 //BA.debugLineNum = 32768010;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelheight", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelheight", new Object[] {_height}));}
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Public Sub setFastScrollLabelHeight(Height As Int)";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="mFastScrollLabelHeight = Height";
__ref._mfastscrolllabelheight /*int*/  = _height;
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="lblFastScroll.Height = mFastScrollLabelHeight";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._mfastscrolllabelheight /*int*/ );
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=33161220;
 //BA.debugLineNum = 33161220;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight -";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=33161221;
 //BA.debugLineNum = 33161221;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=33161223;
 //BA.debugLineNum = 33161223;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=33161225;
 //BA.debugLineNum = 33161225;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelmaxchars(b4a.example.ef.table __ref,int _fastscrolllabelmaxchars) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelmaxchars", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelmaxchars", new Object[] {_fastscrolllabelmaxchars}));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Public Sub setFastScrollLabelMaxChars(FastScrollLa";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="mFastScrollLabelMaxChars = FastScrollLabelMaxChar";
__ref._mfastscrolllabelmaxchars /*int*/  = _fastscrolllabelmaxchars;
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelwidth", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelwidth", new Object[] {_width}));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub setFastScrollLabelWidth(Width As Int)";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="mFastScrollLabelWidth = Width";
__ref._mfastscrolllabelwidth /*int*/  = _width;
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="lblFastScroll.Width = mFastScrollLabelWidth";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._mfastscrolllabelwidth /*int*/ );
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=33030148;
 //BA.debugLineNum = 33030148;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
 }else {
RDebugUtils.currentLine=33030150;
 //BA.debugLineNum = 33030150;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
 };
RDebugUtils.currentLine=33030152;
 //BA.debugLineNum = 33030152;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollminitems(b4a.example.ef.table __ref,int _fastscrollminitems) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollminitems", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollminitems", new Object[] {_fastscrollminitems}));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Public Sub setFastScrollMinItems (FastScrollMinIte";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="mFastScrollMinItems = FastScrollMinItems";
__ref._mfastscrollminitems /*int*/  = _fastscrollminitems;
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollshowlabel(b4a.example.ef.table __ref,boolean _fastscrollshowlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollshowlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollshowlabel", new Object[] {_fastscrollshowlabel}));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub setFastScrollShowLabel (FastScrollShowL";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="mFastScrollShowLabel = FastScrollShowLabel";
__ref._mfastscrollshowlabel /*boolean*/  = _fastscrollshowlabel;
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="End Sub";
return "";
}
public String  _setfirstcolumnfixed(b4a.example.ef.table __ref,boolean _firstcolumnfixed) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfirstcolumnfixed", false))
	 {return ((String) Debug.delegate(ba, "setfirstcolumnfixed", new Object[] {_firstcolumnfixed}));}
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Public Sub setFirstColumnFixed(FirstColumnFixed As";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="If FirstColumnFixed = True Then";
if (_firstcolumnfixed==__c.True) { 
RDebugUtils.currentLine=31981570;
 //BA.debugLineNum = 31981570;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="setNumberOfFixedColumns(1)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (1));
 };
 }else {
RDebugUtils.currentLine=31981574;
 //BA.debugLineNum = 31981574;BA.debugLine="If mNumberOfFixedColumns = 1 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==1) { 
RDebugUtils.currentLine=31981575;
 //BA.debugLineNum = 31981575;BA.debugLine="setNumberOfFixedColumns(0)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (0));
 };
 };
RDebugUtils.currentLine=31981578;
 //BA.debugLineNum = 31981578;BA.debugLine="End Sub";
return "";
}
public String  _setnumberoffixedcolumns(b4a.example.ef.table __ref,int _numberoffixedcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setnumberoffixedcolumns", false))
	 {return ((String) Debug.delegate(ba, "setnumberoffixedcolumns", new Object[] {_numberoffixedcolumns}));}
int _col = 0;
String[] _headers = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
int _currentmax = 0;
int _row = 0;
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Public Sub setNumberOfFixedColumns(NumberOfFixedCo";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="NumberOfFixedColumns = Max(0, Min(3, NumberOfFixe";
_numberoffixedcolumns = (int) (__c.Max(0,__c.Min(3,_numberoffixedcolumns)));
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="If mNumberOfFixedColumns = NumberOfFixedColumns T";
if (__ref._mnumberoffixedcolumns /*int*/ ==_numberoffixedcolumns) { 
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=31850502;
 //BA.debugLineNum = 31850502;BA.debugLine="If Header.NumberOfViews = 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=31850503;
 //BA.debugLineNum = 31850503;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns	'Ne";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
 }else {
RDebugUtils.currentLine=31850505;
 //BA.debugLineNum = 31850505;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=31850507;
 //BA.debugLineNum = 31850507;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=31850508;
 //BA.debugLineNum = 31850508;BA.debugLine="If HeaderFirst.NumberOfViews = 0 Then";
if (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=31850509;
 //BA.debugLineNum = 31850509;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=31850510;
 //BA.debugLineNum = 31850510;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31850511;
 //BA.debugLineNum = 31850511;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=31850512;
 //BA.debugLineNum = 31850512;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 }else {
RDebugUtils.currentLine=31850515;
 //BA.debugLineNum = 31850515;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=31850516;
 //BA.debugLineNum = 31850516;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31850517;
 //BA.debugLineNum = 31850517;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=31850518;
 //BA.debugLineNum = 31850518;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
RDebugUtils.currentLine=31850520;
 //BA.debugLineNum = 31850520;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=31850521;
 //BA.debugLineNum = 31850521;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31850522;
 //BA.debugLineNum = 31850522;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=31850523;
 //BA.debugLineNum = 31850523;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 };
RDebugUtils.currentLine=31850527;
 //BA.debugLineNum = 31850527;BA.debugLine="HeaderFirst.RemoveAllViews";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=31850528;
 //BA.debugLineNum = 31850528;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=31850530;
 //BA.debugLineNum = 31850530;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
RDebugUtils.currentLine=31850532;
 //BA.debugLineNum = 31850532;BA.debugLine="innerClearAll(mNumberOfColumns, False)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.False);
RDebugUtils.currentLine=31850533;
 //BA.debugLineNum = 31850533;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=31850534;
 //BA.debugLineNum = 31850534;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=31850535;
 //BA.debugLineNum = 31850535;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=31850536;
 //BA.debugLineNum = 31850536;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=31850539;
 //BA.debugLineNum = 31850539;BA.debugLine="Private currentMax As Int";
_currentmax = 0;
RDebugUtils.currentLine=31850540;
 //BA.debugLineNum = 31850540;BA.debugLine="currentMax = Min(Data.Size - 1, SV2.Height / cRo";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=31850542;
 //BA.debugLineNum = 31850542;BA.debugLine="For row = 0 To currentMax";
{
final int step38 = 1;
final int limit38 = _currentmax;
_row = (int) (0) ;
for (;_row <= limit38 ;_row = _row + step38 ) {
RDebugUtils.currentLine=31850543;
 //BA.debugLineNum = 31850543;BA.debugLine="ShowRow(row)";
__ref._showrow /*void*/ (null,_row);
 }
};
 };
RDebugUtils.currentLine=31850547;
 //BA.debugLineNum = 31850547;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignment", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignment", new Object[] {_alignment}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Public Sub setHeaderAlignment(Alignment As Int)";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="cHeaderAlignment = Alignment";
__ref._cheaderalignment /*int*/  = _alignment;
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="If cHeaderAlignments.Length = 0 Then";
if (__ref._cheaderalignments /*int[]*/ .length==0) { 
RDebugUtils.currentLine=26476548;
 //BA.debugLineNum = 26476548;BA.debugLine="Private cHeaderAlignments(mNumberOfColumns) As I";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
 };
RDebugUtils.currentLine=26476551;
 //BA.debugLineNum = 26476551;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=26476552;
 //BA.debugLineNum = 26476552;BA.debugLine="HeaderMultiAlignments = False";
__ref._headermultialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=26476553;
 //BA.debugLineNum = 26476553;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=26476554;
 //BA.debugLineNum = 26476554;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=26476555;
 //BA.debugLineNum = 26476555;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit9 ;_col = _col + step9 ) {
RDebugUtils.currentLine=26476556;
 //BA.debugLineNum = 26476556;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26476557;
 //BA.debugLineNum = 26476557;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26476558;
 //BA.debugLineNum = 26476558;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=26476560;
 //BA.debugLineNum = 26476560;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=26476561;
 //BA.debugLineNum = 26476561;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26476562;
 //BA.debugLineNum = 26476562;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=26476563;
 //BA.debugLineNum = 26476563;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=26476566;
 //BA.debugLineNum = 26476566;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit20 ;_col = _col + step20 ) {
RDebugUtils.currentLine=26476567;
 //BA.debugLineNum = 26476567;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26476568;
 //BA.debugLineNum = 26476568;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26476569;
 //BA.debugLineNum = 26476569;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=26476573;
 //BA.debugLineNum = 26476573;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub SetHeaderAlignmentColN(Col As Int, Alig";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=26148869;
 //BA.debugLineNum = 26148869;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=26148870;
 //BA.debugLineNum = 26148870;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=26148873;
 //BA.debugLineNum = 26148873;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=26148874;
 //BA.debugLineNum = 26148874;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26148875;
 //BA.debugLineNum = 26148875;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=26148876;
 //BA.debugLineNum = 26148876;BA.debugLine="cHeaderAlignments0(i) = cHeaderAlignment";
__ref._cheaderalignments0 /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=26148879;
 //BA.debugLineNum = 26148879;BA.debugLine="cHeaderAlignments0(Col) = AlignmentColN";
__ref._cheaderalignments0 /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=26148880;
 //BA.debugLineNum = 26148880;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=26148881;
 //BA.debugLineNum = 26148881;BA.debugLine="If Header.NumberOfViews > 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=26148882;
 //BA.debugLineNum = 26148882;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=26148883;
 //BA.debugLineNum = 26148883;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26148884;
 //BA.debugLineNum = 26148884;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26148885;
 //BA.debugLineNum = 26148885;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=26148887;
 //BA.debugLineNum = 26148887;BA.debugLine="For i = 0 To mNumberOfFixedColumns - 1";
{
final int step21 = 1;
final int limit21 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=26148888;
 //BA.debugLineNum = 26148888;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26148889;
 //BA.debugLineNum = 26148889;BA.debugLine="If Col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=26148890;
 //BA.debugLineNum = 26148890;BA.debugLine="lbl = HeaderFirst.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26148891;
 //BA.debugLineNum = 26148891;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=26148893;
 //BA.debugLineNum = 26148893;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26148894;
 //BA.debugLineNum = 26148894;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col + mNumber";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [(int) (_col+__ref._mnumberoffixedcolumns /*int*/ )]);
 };
 }
};
 };
 };
RDebugUtils.currentLine=26148899;
 //BA.debugLineNum = 26148899;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=26148900;
 //BA.debugLineNum = 26148900;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignments", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignments", new Object[] {_alignments}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Public Sub SetHeaderAlignments(Alignments() As Int";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=26083335;
 //BA.debugLineNum = 26083335;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26083337;
 //BA.debugLineNum = 26083337;BA.debugLine="cHeaderAlignments0 = Alignments";
__ref._cheaderalignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=26083338;
 //BA.debugLineNum = 26083338;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=26083339;
 //BA.debugLineNum = 26083339;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=26083340;
 //BA.debugLineNum = 26083340;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=26083341;
 //BA.debugLineNum = 26083341;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=26083342;
 //BA.debugLineNum = 26083342;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26083343;
 //BA.debugLineNum = 26083343;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26083344;
 //BA.debugLineNum = 26083344;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=26083346;
 //BA.debugLineNum = 26083346;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=26083347;
 //BA.debugLineNum = 26083347;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26083348;
 //BA.debugLineNum = 26083348;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=26083349;
 //BA.debugLineNum = 26083349;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=26083352;
 //BA.debugLineNum = 26083352;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=26083353;
 //BA.debugLineNum = 26083353;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26083354;
 //BA.debugLineNum = 26083354;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26083355;
 //BA.debugLineNum = 26083355;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=26083359;
 //BA.debugLineNum = 26083359;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=26083360;
 //BA.debugLineNum = 26083360;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolor", false))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="cHeaderColor = Color";
__ref._cheadercolor /*int*/  = _color;
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=26738693;
 //BA.debugLineNum = 26738693;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=26738694;
 //BA.debugLineNum = 26738694;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=26738695;
 //BA.debugLineNum = 26738695;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26738696;
 //BA.debugLineNum = 26738696;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26738697;
 //BA.debugLineNum = 26738697;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
RDebugUtils.currentLine=26738699;
 //BA.debugLineNum = 26738699;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=26738700;
 //BA.debugLineNum = 26738700;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26738701;
 //BA.debugLineNum = 26738701;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=26738702;
 //BA.debugLineNum = 26738702;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=26738705;
 //BA.debugLineNum = 26738705;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=26738706;
 //BA.debugLineNum = 26738706;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26738707;
 //BA.debugLineNum = 26738707;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26738708;
 //BA.debugLineNum = 26738708;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=26738712;
 //BA.debugLineNum = 26738712;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolors(b4a.example.ef.table __ref,int[] _headercolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolors", false))
	 {return ((String) Debug.delegate(ba, "setheadercolors", new Object[] {_headercolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=29753347;
 //BA.debugLineNum = 29753347;BA.debugLine="cHeaderColors = HeaderColors";
__ref._cheadercolors /*int[]*/  = _headercolors;
RDebugUtils.currentLine=29753348;
 //BA.debugLineNum = 29753348;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=29753349;
 //BA.debugLineNum = 29753349;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=29753350;
 //BA.debugLineNum = 29753350;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=29753351;
 //BA.debugLineNum = 29753351;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29753352;
 //BA.debugLineNum = 29753352;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29753353;
 //BA.debugLineNum = 29753353;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=29753355;
 //BA.debugLineNum = 29753355;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=29753356;
 //BA.debugLineNum = 29753356;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29753357;
 //BA.debugLineNum = 29753357;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=29753358;
 //BA.debugLineNum = 29753358;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=29753361;
 //BA.debugLineNum = 29753361;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=29753362;
 //BA.debugLineNum = 29753362;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29753363;
 //BA.debugLineNum = 29753363;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29753364;
 //BA.debugLineNum = 29753364;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=29753368;
 //BA.debugLineNum = 29753368;BA.debugLine="End Sub";
return "";
}
public String  _setheaderheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderheight", false))
	 {return ((String) Debug.delegate(ba, "setheaderheight", new Object[] {_height}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="cHeaderHeight = Height";
__ref._cheaderheight /*int*/  = _height;
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=26607623;
 //BA.debugLineNum = 26607623;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=26607624;
 //BA.debugLineNum = 26607624;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607625;
 //BA.debugLineNum = 26607625;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26607626;
 //BA.debugLineNum = 26607626;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
RDebugUtils.currentLine=26607628;
 //BA.debugLineNum = 26607628;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=26607629;
 //BA.debugLineNum = 26607629;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607630;
 //BA.debugLineNum = 26607630;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=26607631;
 //BA.debugLineNum = 26607631;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=26607634;
 //BA.debugLineNum = 26607634;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=26607635;
 //BA.debugLineNum = 26607635;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607636;
 //BA.debugLineNum = 26607636;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26607637;
 //BA.debugLineNum = 26607637;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=26607641;
 //BA.debugLineNum = 26607641;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=26607642;
 //BA.debugLineNum = 26607642;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=26607643;
 //BA.debugLineNum = 26607643;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26607644;
 //BA.debugLineNum = 26607644;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight -";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ -__ref._cstatuslineheight /*int*/ ));
 }else {
RDebugUtils.currentLine=26607646;
 //BA.debugLineNum = 26607646;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=26607648;
 //BA.debugLineNum = 26607648;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=26607649;
 //BA.debugLineNum = 26607649;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
 };
RDebugUtils.currentLine=26607651;
 //BA.debugLineNum = 26607651;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolor", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="cHeaderTextColor = Color";
__ref._cheadertextcolor /*int*/  = _color;
RDebugUtils.currentLine=26869764;
 //BA.debugLineNum = 26869764;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=26869765;
 //BA.debugLineNum = 26869765;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=26869766;
 //BA.debugLineNum = 26869766;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=26869767;
 //BA.debugLineNum = 26869767;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26869768;
 //BA.debugLineNum = 26869768;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26869769;
 //BA.debugLineNum = 26869769;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=26869771;
 //BA.debugLineNum = 26869771;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=26869772;
 //BA.debugLineNum = 26869772;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26869773;
 //BA.debugLineNum = 26869773;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=26869774;
 //BA.debugLineNum = 26869774;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=26869777;
 //BA.debugLineNum = 26869777;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=26869778;
 //BA.debugLineNum = 26869778;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26869779;
 //BA.debugLineNum = 26869779;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=26869780;
 //BA.debugLineNum = 26869780;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=26869784;
 //BA.debugLineNum = 26869784;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolors(b4a.example.ef.table __ref,int[] _headertextcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolors", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolors", new Object[] {_headertextcolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=29884419;
 //BA.debugLineNum = 29884419;BA.debugLine="cHeaderTextColors = HeaderTextColors";
__ref._cheadertextcolors /*int[]*/  = _headertextcolors;
RDebugUtils.currentLine=29884420;
 //BA.debugLineNum = 29884420;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=29884421;
 //BA.debugLineNum = 29884421;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=29884422;
 //BA.debugLineNum = 29884422;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=29884423;
 //BA.debugLineNum = 29884423;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29884424;
 //BA.debugLineNum = 29884424;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29884425;
 //BA.debugLineNum = 29884425;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=29884427;
 //BA.debugLineNum = 29884427;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=29884428;
 //BA.debugLineNum = 29884428;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29884429;
 //BA.debugLineNum = 29884429;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=29884430;
 //BA.debugLineNum = 29884430;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=29884433;
 //BA.debugLineNum = 29884433;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=29884434;
 //BA.debugLineNum = 29884434;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29884435;
 //BA.debugLineNum = 29884435;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29884436;
 //BA.debugLineNum = 29884436;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=29884440;
 //BA.debugLineNum = 29884440;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypeface(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _headertypeface) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypeface", false))
	 {return ((String) Debug.delegate(ba, "setheadertypeface", new Object[] {_headertypeface}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Public Sub setHeaderTypeFace(HeaderTypeFace As Typ";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="cHeaderTypeFace = HeaderTypeFace";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypeface;
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=30015491;
 //BA.debugLineNum = 30015491;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=30015492;
 //BA.debugLineNum = 30015492;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=30015493;
 //BA.debugLineNum = 30015493;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=30015494;
 //BA.debugLineNum = 30015494;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30015495;
 //BA.debugLineNum = 30015495;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=30015496;
 //BA.debugLineNum = 30015496;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=30015498;
 //BA.debugLineNum = 30015498;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=30015499;
 //BA.debugLineNum = 30015499;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30015500;
 //BA.debugLineNum = 30015500;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=30015501;
 //BA.debugLineNum = 30015501;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=30015504;
 //BA.debugLineNum = 30015504;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=30015505;
 //BA.debugLineNum = 30015505;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30015506;
 //BA.debugLineNum = 30015506;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=30015507;
 //BA.debugLineNum = 30015507;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
RDebugUtils.currentLine=30015511;
 //BA.debugLineNum = 30015511;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _headertypefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypefaces", false))
	 {return ((String) Debug.delegate(ba, "setheadertypefaces", new Object[] {_headertypefaces}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Public Sub SetHeaderTypeFaces(HeaderTypeFaces() As";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=30081027;
 //BA.debugLineNum = 30081027;BA.debugLine="If HeaderTypeFaces.Length = 1 Then";
if (_headertypefaces.length==1) { 
RDebugUtils.currentLine=30081028;
 //BA.debugLineNum = 30081028;BA.debugLine="cHeaderTypeFace = HeaderTypeFaces(0)";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypefaces[(int) (0)];
RDebugUtils.currentLine=30081029;
 //BA.debugLineNum = 30081029;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=30081030;
 //BA.debugLineNum = 30081030;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=30081031;
 //BA.debugLineNum = 30081031;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=30081032;
 //BA.debugLineNum = 30081032;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=30081033;
 //BA.debugLineNum = 30081033;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30081034;
 //BA.debugLineNum = 30081034;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=30081035;
 //BA.debugLineNum = 30081035;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=30081037;
 //BA.debugLineNum = 30081037;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=30081038;
 //BA.debugLineNum = 30081038;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30081039;
 //BA.debugLineNum = 30081039;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=30081040;
 //BA.debugLineNum = 30081040;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=30081043;
 //BA.debugLineNum = 30081043;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=30081044;
 //BA.debugLineNum = 30081044;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30081045;
 //BA.debugLineNum = 30081045;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=30081046;
 //BA.debugLineNum = 30081046;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
 }else {
RDebugUtils.currentLine=30081051;
 //BA.debugLineNum = 30081051;BA.debugLine="If HeaderTypeFaces.Length <> mNumberOfColumns Th";
if (_headertypefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=30081052;
 //BA.debugLineNum = 30081052;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=30081053;
 //BA.debugLineNum = 30081053;BA.debugLine="Log(\"SetHeaderTypeFaces: Invalid number of colu";
__c.LogImpl("730081053","SetHeaderTypeFaces: Invalid number of columns",0);
RDebugUtils.currentLine=30081054;
 //BA.debugLineNum = 30081054;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=30081056;
 //BA.debugLineNum = 30081056;BA.debugLine="cHeaderTypeFaces0 = HeaderTypeFaces";
__ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _headertypefaces;
RDebugUtils.currentLine=30081057;
 //BA.debugLineNum = 30081057;BA.debugLine="cHeaderTypeFaces = cHeaderTypeFaces0";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=30081058;
 //BA.debugLineNum = 30081058;BA.debugLine="HeaderMultiTypeFace = True";
__ref._headermultitypeface /*boolean*/  = __c.True;
RDebugUtils.currentLine=30081059;
 //BA.debugLineNum = 30081059;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numb";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=30081060;
 //BA.debugLineNum = 30081060;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=30081061;
 //BA.debugLineNum = 30081061;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step36 = 1;
final int limit36 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit36 ;_col = _col + step36 ) {
RDebugUtils.currentLine=30081062;
 //BA.debugLineNum = 30081062;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30081063;
 //BA.debugLineNum = 30081063;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=30081064;
 //BA.debugLineNum = 30081064;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
RDebugUtils.currentLine=30081066;
 //BA.debugLineNum = 30081066;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfC";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=30081067;
 //BA.debugLineNum = 30081067;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30081068;
 //BA.debugLineNum = 30081068;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedCol";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=30081069;
 //BA.debugLineNum = 30081069;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 }else {
RDebugUtils.currentLine=30081072;
 //BA.debugLineNum = 30081072;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step47 = 1;
final int limit47 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit47 ;_col = _col + step47 ) {
RDebugUtils.currentLine=30081073;
 //BA.debugLineNum = 30081073;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30081074;
 //BA.debugLineNum = 30081074;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=30081075;
 //BA.debugLineNum = 30081075;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 };
 };
 };
 };
RDebugUtils.currentLine=30081081;
 //BA.debugLineNum = 30081081;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheight", false))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_height}));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Public Sub setHeight(Height As Int)";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="pnlTable.Height = Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(_height);
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="SVF.Height = Height - cStatusLineHeight - cHeade";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="SV2.Height = Height - cStatusLineHeight - cHeade";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=25296903;
 //BA.debugLineNum = 25296903;BA.debugLine="SVF.Height = Height - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=25296904;
 //BA.debugLineNum = 25296904;BA.debugLine="SV2.Height = Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=25296906;
 //BA.debugLineNum = 25296906;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
RDebugUtils.currentLine=25296907;
 //BA.debugLineNum = 25296907;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=25296908;
 //BA.debugLineNum = 25296908;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=25296909;
 //BA.debugLineNum = 25296909;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=25296911;
 //BA.debugLineNum = 25296911;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=25296912;
 //BA.debugLineNum = 25296912;BA.debugLine="End Sub";
return "";
}
public String  _setleft(b4a.example.ef.table __ref,int _left) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setleft", false))
	 {return ((String) Debug.delegate(ba, "setleft", new Object[] {_left}));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Public Sub setLeft(Left As Int)";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="pnlTable.Left = Left";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_left);
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(b4a.example.ef.table __ref,int _linewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setlinewidth", false))
	 {return ((String) Debug.delegate(ba, "setlinewidth", new Object[] {_linewidth}));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="cLineWidth = LineWidth";
__ref._clinewidth /*int*/  = _linewidth;
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="End Sub";
return "";
}
public String  _setmulticolumnsort(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmulticolumnsort", false))
	 {return ((String) Debug.delegate(ba, "setmulticolumnsort", new Object[] {_bdo}));}
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Public Sub setMultiColumnSort(bDo As Boolean)";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="mMultiColumnSort = bDo";
__ref._mmulticolumnsort /*boolean*/  = _bdo;
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="End Sub";
return "";
}
public String  _setmultiselect(b4a.example.ef.table __ref,boolean _multiselect) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmultiselect", false))
	 {return ((String) Debug.delegate(ba, "setmultiselect", new Object[] {_multiselect}));}
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub setMultiSelect(MultiSelect As Boolean)";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="mMultiSelect = MultiSelect";
__ref._mmultiselect /*boolean*/  = _multiselect;
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="End Sub";
return "";
}
public String  _setnumberofcolumns(b4a.example.ef.table __ref,int _numberofcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setnumberofcolumns", false))
	 {return ((String) Debug.delegate(ba, "setnumberofcolumns", new Object[] {_numberofcolumns}));}
int _col = 0;
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Public Sub setNumberOfColumns (NumberOfColumns As";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31129606;
 //BA.debugLineNum = 31129606;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31129607;
 //BA.debugLineNum = 31129607;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31129608;
 //BA.debugLineNum = 31129608;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=31129610;
 //BA.debugLineNum = 31129610;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31129611;
 //BA.debugLineNum = 31129611;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31129612;
 //BA.debugLineNum = 31129612;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }
};
RDebugUtils.currentLine=31129614;
 //BA.debugLineNum = 31129614;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor1(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor1", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor1", new Object[] {_color}));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Public Sub setRowColor1(Color As Int)";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="cRowColor1 = Color";
__ref._crowcolor1 /*int*/  = _color;
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor2(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor2", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor2", new Object[] {_color}));}
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Public Sub setRowColor2(Color As Int)";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="cRowColor2 = Color";
__ref._crowcolor2 /*int*/  = _color;
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolorn(b4a.example.ef.table __ref,int _row,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolorn", false))
	 {return ((String) Debug.delegate(ba, "setrowcolorn", new Object[] {_row,_color}));}
int _col = 0;
boolean _new = false;
Object[] _cdi = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cdw = null;
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Public Sub SetRowColorN(Row As Int, Color As Int)";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="Private New = False As Boolean";
_new = __c.False;
RDebugUtils.currentLine=27262979;
 //BA.debugLineNum = 27262979;BA.debugLine="If lstRowColors.IndexOf(Color) >= 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))>=0) { 
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.IndexOf";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))+2));
 }else {
RDebugUtils.currentLine=27262982;
 //BA.debugLineNum = 27262982;BA.debugLine="lstRowColors.Add(Color)";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_color));
RDebugUtils.currentLine=27262983;
 //BA.debugLineNum = 27262983;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.Size +";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()+1));
RDebugUtils.currentLine=27262984;
 //BA.debugLineNum = 27262984;BA.debugLine="New = True";
_new = __c.True;
 };
RDebugUtils.currentLine=27262987;
 //BA.debugLineNum = 27262987;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=27262988;
 //BA.debugLineNum = 27262988;BA.debugLine="Private cdi(mNumberOfColumns) As Object";
_cdi = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cdi.length;
for (int i0 = 0;i0 < d0;i0++) {
_cdi[i0] = new Object();
}
}
;
RDebugUtils.currentLine=27262989;
 //BA.debugLineNum = 27262989;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=27262990;
 //BA.debugLineNum = 27262990;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=27262991;
 //BA.debugLineNum = 27262991;BA.debugLine="cdw.Initialize(Color, 0)";
_cdw.Initialize(_color,(int) (0));
RDebugUtils.currentLine=27262992;
 //BA.debugLineNum = 27262992;BA.debugLine="cdi(col) = cdw";
_cdi[_col] = (Object)(_cdw.getObject());
 }
};
RDebugUtils.currentLine=27262994;
 //BA.debugLineNum = 27262994;BA.debugLine="If New = False Then";
if (_new==__c.False) { 
RDebugUtils.currentLine=27262995;
 //BA.debugLineNum = 27262995;BA.debugLine="lstRowDrawables.Set(lstRowColors.IndexOf(Color)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Set(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color)),(Object)(_cdi));
 }else {
RDebugUtils.currentLine=27262997;
 //BA.debugLineNum = 27262997;BA.debugLine="lstRowDrawables.Add(cdi)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cdi));
 };
RDebugUtils.currentLine=27263002;
 //BA.debugLineNum = 27263002;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=27263004;
 //BA.debugLineNum = 27263004;BA.debugLine="End Sub";
return "";
}
public String  _setrowheight(b4a.example.ef.table __ref,int _rowheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowheight", false))
	 {return ((String) Debug.delegate(ba, "setrowheight", new Object[] {_rowheight}));}
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="If cRowHeight = cHeaderHeight Then";
if (__ref._crowheight /*int*/ ==__ref._cheaderheight /*int*/ ) { 
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="setHeaderHeight(RowHeight)";
__ref._setheaderheight /*String*/ (null,_rowheight);
 };
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="cRowHeight = RowHeight";
__ref._crowheight /*int*/  = _rowheight;
RDebugUtils.currentLine=28377093;
 //BA.debugLineNum = 28377093;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcellcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcellcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcellcolor", new Object[] {_color}));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="cSelectedCellColor = Color";
__ref._cselectedcellcolor /*int*/  = _color;
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=27721733;
 //BA.debugLineNum = 27721733;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcelltextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcelltextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcelltextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Public Sub setSelectedCellTextColor(TextColor As I";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="cSelectedCellTextColor = TextColor";
__ref._cselectedcelltextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27852803;
 //BA.debugLineNum = 27852803;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=27852805;
 //BA.debugLineNum = 27852805;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowcolor", new Object[] {_color}));}
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="cSelectedRowColor = Color";
__ref._cselectedrowcolor /*int*/  = _color;
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowtextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowtextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowtextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub setSelectedRowTextColor(TextColor As In";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="cSelectedRowTextColor = TextColor";
__ref._cselectedrowtextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=27590661;
 //BA.debugLineNum = 27590661;BA.debugLine="End Sub";
return "";
}
public String  _setsingleline(b4a.example.ef.table __ref,boolean _singleline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsingleline", false))
	 {return ((String) Debug.delegate(ba, "setsingleline", new Object[] {_singleline}));}
int _row = 0;
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="Private row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="cSingleLine = SingleLine";
__ref._csingleline /*boolean*/  = _singleline;
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="For row = 0 To LabelsCache.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit4 ;_row = _row + step4 ) {
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="Private lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=30212104;
 //BA.debugLineNum = 30212104;BA.debugLine="lbls = LabelsCache.Get(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=30212105;
 //BA.debugLineNum = 30212105;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=30212106;
 //BA.debugLineNum = 30212106;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=30212107;
 //BA.debugLineNum = 30212107;BA.debugLine="jo = lbls(col)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbls[_col].getObject()));
RDebugUtils.currentLine=30212108;
 //BA.debugLineNum = 30212108;BA.debugLine="jo.RunMethod(\"setSingleLine\", Array(cSingleLin";
_jo.RunMethod("setSingleLine",new Object[]{(Object)(__ref._csingleline /*boolean*/ )});
 }
};
 }
};
 };
RDebugUtils.currentLine=30212113;
 //BA.debugLineNum = 30212113;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapcolor", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapcolor", new Object[] {_color}));}
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Public Sub setSortBitmapColor(Color As Int)";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="cSortBitmapColor = Color";
__ref._csortbitmapcolor /*int*/  = _color;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapwidth", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapwidth", new Object[] {_width}));}
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Public Sub setSortBitmapWidth(Width As Int)";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="cSortBitmapWidth = Width";
__ref._csortbitmapwidth /*int*/  = _width;
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="End Sub";
return "";
}
public String  _setsortcaseinsensitive(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcaseinsensitive", false))
	 {return ((String) Debug.delegate(ba, "setsortcaseinsensitive", new Object[] {_bdo}));}
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Public Sub setSortCaseInsensitive(bDo As Boolean)";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="mSortCaseInsensitive = bDo";
__ref._msortcaseinsensitive /*boolean*/  = _bdo;
RDebugUtils.currentLine=34340866;
 //BA.debugLineNum = 34340866;BA.debugLine="End Sub";
return "";
}
public String  _setsortcolumn(b4a.example.ef.table __ref,boolean _sortcolumn) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcolumn", false))
	 {return ((String) Debug.delegate(ba, "setsortcolumn", new Object[] {_sortcolumn}));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="cSortColumn = SortColumn";
__ref._csortcolumn /*boolean*/  = _sortcolumn;
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="End Sub";
return "";
}
public String  _setsortingbitmaps(b4a.example.ef.table __ref,String _bitmapascfilename,String _bitmapdesfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortingbitmaps", false))
	 {return ((String) Debug.delegate(ba, "setsortingbitmaps", new Object[] {_bitmapascfilename,_bitmapdesfilename}));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub SetSortingBitmaps(BitmapAscFilename As";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="bmpAsc.Initialize(File.DirAssets, BitmapAscFilena";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapascfilename);
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="bmpDes.Initialize(File.DirAssets, BitmapDesFilena";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapdesfilename);
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="mCustomSortingBitmaps = True";
__ref._mcustomsortingbitmaps /*boolean*/  = __c.True;
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="End Sub";
return "";
}
public String  _setsortremoveaccents(b4a.example.ef.table __ref,boolean _sortremoveaccents) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortremoveaccents", false))
	 {return ((String) Debug.delegate(ba, "setsortremoveaccents", new Object[] {_sortremoveaccents}));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Public Sub setSortRemoveAccents(SortRemoveAccents";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="cSortRemoveAccents = SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = _sortremoveaccents;
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="End Sub";
return "";
}
public String  _setstatuslineheight(b4a.example.ef.table __ref,int _statuslineheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatuslineheight", false))
	 {return ((String) Debug.delegate(ba, "setstatuslineheight", new Object[] {_statuslineheight}));}
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Public Sub setStatusLineHeight(StatusLineHeight As";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="cStatusLineHeight = StatusLineHeight";
__ref._cstatuslineheight /*int*/  = _statuslineheight;
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="End Sub";
return "";
}
public String  _settablecolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settablecolor", false))
	 {return ((String) Debug.delegate(ba, "settablecolor", new Object[] {_color}));}
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Public Sub setTableColor(Color As Int)";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="cTableColor = Color";
__ref._ctablecolor /*int*/  = _color;
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=27983877;
 //BA.debugLineNum = 27983877;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=27983878;
 //BA.debugLineNum = 27983878;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=27983879;
 //BA.debugLineNum = 27983879;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
 };
 };
RDebugUtils.currentLine=27983882;
 //BA.debugLineNum = 27983882;BA.debugLine="End Sub";
return "";
}
public String  _settag(b4a.example.ef.table __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settag", false))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_tag}));}
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Public Sub setTag(Tag As Object)";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="pnlTable.Tag = Tag";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(_tag);
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_color}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Public Sub setTextColor(Color As Int)";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="cTextColor = Color";
__ref._ctextcolor /*int*/  = _color;
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=28114949;
 //BA.debugLineNum = 28114949;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=28114950;
 //BA.debugLineNum = 28114950;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28114951;
 //BA.debugLineNum = 28114951;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=28114952;
 //BA.debugLineNum = 28114952;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=28114956;
 //BA.debugLineNum = 28114956;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=28114957;
 //BA.debugLineNum = 28114957;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=28114958;
 //BA.debugLineNum = 28114958;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=28114959;
 //BA.debugLineNum = 28114959;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28114960;
 //BA.debugLineNum = 28114960;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=28114961;
 //BA.debugLineNum = 28114961;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=28114963;
 //BA.debugLineNum = 28114963;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=28114964;
 //BA.debugLineNum = 28114964;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=28114965;
 //BA.debugLineNum = 28114965;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28114966;
 //BA.debugLineNum = 28114966;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=28114967;
 //BA.debugLineNum = 28114967;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=28114971;
 //BA.debugLineNum = 28114971;BA.debugLine="End Sub";
return "";
}
public String  _settextcolors(b4a.example.ef.table __ref,int[] _textcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextcolors", false))
	 {return ((String) Debug.delegate(ba, "settextcolors", new Object[] {_textcolors}));}
int _i = 0;
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="cTextColors = TextColors";
__ref._ctextcolors /*int[]*/  = _textcolors;
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="If cTextColors.Length = 1 Then";
if (__ref._ctextcolors /*int[]*/ .length==1) { 
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="MultiTextColors = False";
__ref._multitextcolors /*boolean*/  = __c.False;
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="setTextColor(cTextColors(0))";
__ref._settextcolor /*String*/ (null,__ref._ctextcolors /*int[]*/ [(int) (0)]);
RDebugUtils.currentLine=29622277;
 //BA.debugLineNum = 29622277;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=29622279;
 //BA.debugLineNum = 29622279;BA.debugLine="MultiTextColors = True";
__ref._multitextcolors /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=29622281;
 //BA.debugLineNum = 29622281;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=29622282;
 //BA.debugLineNum = 29622282;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=29622283;
 //BA.debugLineNum = 29622283;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=29622284;
 //BA.debugLineNum = 29622284;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=29622285;
 //BA.debugLineNum = 29622285;BA.debugLine="col = i Mod mNumberOfColumns";
_col = (int) (_i%__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=29622286;
 //BA.debugLineNum = 29622286;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29622287;
 //BA.debugLineNum = 29622287;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=29622288;
 //BA.debugLineNum = 29622288;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 }else {
RDebugUtils.currentLine=29622292;
 //BA.debugLineNum = 29622292;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=29622293;
 //BA.debugLineNum = 29622293;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=29622294;
 //BA.debugLineNum = 29622294;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=29622295;
 //BA.debugLineNum = 29622295;BA.debugLine="col = i Mod mNumberOfFixedColumns";
_col = (int) (_i%__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=29622296;
 //BA.debugLineNum = 29622296;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29622297;
 //BA.debugLineNum = 29622297;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=29622298;
 //BA.debugLineNum = 29622298;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=29622300;
 //BA.debugLineNum = 29622300;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step28 = 1;
final int limit28 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=29622301;
 //BA.debugLineNum = 29622301;BA.debugLine="col = i Mod (mNumberOfColumns - mNumberOfFixed";
_col = (int) (_i%(__ref._mnumberofcolumns /*int*/ -__ref._mnumberoffixedcolumns /*int*/ )+__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=29622302;
 //BA.debugLineNum = 29622302;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29622303;
 //BA.debugLineNum = 29622303;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=29622304;
 //BA.debugLineNum = 29622304;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=29622308;
 //BA.debugLineNum = 29622308;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.ef.table __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_size}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Public Sub setTextSize(Size As Float)";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="cTextSize = Size";
__ref._ctextsize /*float*/  = _size;
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=28246021;
 //BA.debugLineNum = 28246021;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=28246023;
 //BA.debugLineNum = 28246023;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=28246024;
 //BA.debugLineNum = 28246024;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28246025;
 //BA.debugLineNum = 28246025;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=28246026;
 //BA.debugLineNum = 28246026;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=28246030;
 //BA.debugLineNum = 28246030;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=28246031;
 //BA.debugLineNum = 28246031;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=28246032;
 //BA.debugLineNum = 28246032;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28246033;
 //BA.debugLineNum = 28246033;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=28246034;
 //BA.debugLineNum = 28246034;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=28246038;
 //BA.debugLineNum = 28246038;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=28246039;
 //BA.debugLineNum = 28246039;BA.debugLine="For i = 0 To HeaderFirst.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=28246040;
 //BA.debugLineNum = 28246040;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28246041;
 //BA.debugLineNum = 28246041;BA.debugLine="lbl = HeaderFirst.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=28246042;
 //BA.debugLineNum = 28246042;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=28246044;
 //BA.debugLineNum = 28246044;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=28246045;
 //BA.debugLineNum = 28246045;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28246046;
 //BA.debugLineNum = 28246046;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=28246047;
 //BA.debugLineNum = 28246047;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=28246051;
 //BA.debugLineNum = 28246051;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=28246052;
 //BA.debugLineNum = 28246052;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step32 = 1;
final int limit32 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=28246053;
 //BA.debugLineNum = 28246053;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28246054;
 //BA.debugLineNum = 28246054;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=28246055;
 //BA.debugLineNum = 28246055;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=28246057;
 //BA.debugLineNum = 28246057;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=28246058;
 //BA.debugLineNum = 28246058;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28246059;
 //BA.debugLineNum = 28246059;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=28246060;
 //BA.debugLineNum = 28246060;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 };
RDebugUtils.currentLine=28246064;
 //BA.debugLineNum = 28246064;BA.debugLine="End Sub";
return "";
}
public String  _settop(b4a.example.ef.table __ref,int _top) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settop", false))
	 {return ((String) Debug.delegate(ba, "settop", new Object[] {_top}));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Public Sub setTop(Top As Int)";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="pnlTable.Top = Top";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settypefaces", false))
	 {return ((String) Debug.delegate(ba, "settypefaces", new Object[] {_typefaces}));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="If TypeFaces.Length = 1 Then";
if (_typefaces.length==1) { 
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="cTypeFace = TypeFaces(0)";
__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _typefaces[(int) (0)];
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="MultiTypeFace = False";
__ref._multitypeface /*boolean*/  = __c.False;
 }else {
RDebugUtils.currentLine=28639237;
 //BA.debugLineNum = 28639237;BA.debugLine="If TypeFaces.Length <> mNumberOfColumns Then";
if (_typefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=28639238;
 //BA.debugLineNum = 28639238;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=28639239;
 //BA.debugLineNum = 28639239;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=28639242;
 //BA.debugLineNum = 28639242;BA.debugLine="cTypeFaces0 = TypeFaces";
__ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _typefaces;
RDebugUtils.currentLine=28639243;
 //BA.debugLineNum = 28639243;BA.debugLine="cTypeFaces = cTypeFaces0";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=28639244;
 //BA.debugLineNum = 28639244;BA.debugLine="MultiTypeFace = True";
__ref._multitypeface /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=28639247;
 //BA.debugLineNum = 28639247;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=28639248;
 //BA.debugLineNum = 28639248;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=28639250;
 //BA.debugLineNum = 28639250;BA.debugLine="End Sub";
return "";
}
public String  _setusecolumncolors(b4a.example.ef.table __ref,boolean _usecolumncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setusecolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setusecolumncolors", new Object[] {_usecolumncolors}));}
int _i = 0;
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="cUseColumnColors = UseColumnColors";
__ref._cusecolumncolors /*boolean*/  = _usecolumncolors;
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="If cColumnColors.Length = 0 Then";
if (__ref._ccolumncolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=29360132;
 //BA.debugLineNum = 29360132;BA.debugLine="Dim cColumnColors(mNumberOfColumns) As Int";
_ccolumncolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=29360133;
 //BA.debugLineNum = 29360133;BA.debugLine="Dim cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=29360134;
 //BA.debugLineNum = 29360134;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=29360135;
 //BA.debugLineNum = 29360135;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=29360136;
 //BA.debugLineNum = 29360136;BA.debugLine="cColumnColors(i) = cRowColor1";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor1 /*int*/ ;
 }else {
RDebugUtils.currentLine=29360138;
 //BA.debugLineNum = 29360138;BA.debugLine="cColumnColors(i) = cRowColor2";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor2 /*int*/ ;
 };
RDebugUtils.currentLine=29360140;
 //BA.debugLineNum = 29360140;BA.debugLine="cTextColors(i) = cTextColor";
__ref._ctextcolors /*int[]*/ [_i] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=29360144;
 //BA.debugLineNum = 29360144;BA.debugLine="If cHeaderColors.Length = 0 Then";
if (__ref._cheadercolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=29360145;
 //BA.debugLineNum = 29360145;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=29360146;
 //BA.debugLineNum = 29360146;BA.debugLine="Dim cHeaderColors(mNumberOfColumns) As Int";
_cheadercolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=29360147;
 //BA.debugLineNum = 29360147;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=29360148;
 //BA.debugLineNum = 29360148;BA.debugLine="cHeaderColors(i) = cHeaderColor";
__ref._cheadercolors /*int[]*/ [_i] = __ref._cheadercolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=29360152;
 //BA.debugLineNum = 29360152;BA.debugLine="If cHeaderTextColors.Length = 0 Then";
if (__ref._cheadertextcolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=29360153;
 //BA.debugLineNum = 29360153;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=29360154;
 //BA.debugLineNum = 29360154;BA.debugLine="Dim cHeaderTextColors(mNumberOfColumns) As Int";
_cheadertextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=29360155;
 //BA.debugLineNum = 29360155;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=29360156;
 //BA.debugLineNum = 29360156;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
__ref._cheadertextcolors /*int[]*/ [_i] = __ref._cheadertextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=29360159;
 //BA.debugLineNum = 29360159;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_col,_row,_value}));}
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
RDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.ef.table __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_visible}));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="pnlTable.Visible = Visible";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(_visible);
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setwidth", false))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_width}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Public Sub setWidth(Width As Int)";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="pnlTable.Width = Width";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_width);
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="SV2.Width = Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(_width);
 }else {
RDebugUtils.currentLine=25100294;
 //BA.debugLineNum = 25100294;BA.debugLine="SV2.Width = Width - SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (_width-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=25100297;
 //BA.debugLineNum = 25100297;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=25100298;
 //BA.debugLineNum = 25100298;BA.debugLine="End Sub";
return "";
}
public String  _setzeroselection(b4a.example.ef.table __ref,boolean _zeroselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setzeroselection", false))
	 {return ((String) Debug.delegate(ba, "setzeroselection", new Object[] {_zeroselection}));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub setZeroSelection(ZeroSelection As Boole";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="mZeroSelection = ZeroSelection";
__ref._mzeroselection /*boolean*/  = _zeroselection;
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _snapshot(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "snapshot", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "snapshot", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpsnapshot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnltable = null;
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Public Sub SnapShot As Bitmap";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="Private bmpSnapshot As Bitmap";
_bmpsnapshot = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="Private xpnlTable As B4XView";
_xpnltable = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=33226756;
 //BA.debugLineNum = 33226756;BA.debugLine="xpnlTable = pnlTable";
_xpnltable = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=33226757;
 //BA.debugLineNum = 33226757;BA.debugLine="bmpSnapshot = xpnlTable.Snapshot";
_bmpsnapshot = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_xpnltable.Snapshot().getObject()));
RDebugUtils.currentLine=33226759;
 //BA.debugLineNum = 33226759;BA.debugLine="Return bmpSnapshot";
if (true) return _bmpsnapshot;
RDebugUtils.currentLine=33226760;
 //BA.debugLineNum = 33226760;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomdoubleidx(b4a.example.ef.table __ref,double[] _arrdouble,boolean _bascending,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sortomdoubleidx", false))
	 {return ((int[]) Debug.delegate(ba, "sortomdoubleidx", new Object[] {_arrdouble,_bascending,_istart,_iend}));}
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
int[] _arrindex = null;
Object _ovalue = null;
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Sub SortOMDoubleIDX(arrDouble() As Double, bAscend";
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=33685508;
 //BA.debugLineNum = 33685508;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=33685509;
 //BA.debugLineNum = 33685509;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33685511;
 //BA.debugLineNum = 33685511;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=33685512;
 //BA.debugLineNum = 33685512;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=33685513;
 //BA.debugLineNum = 33685513;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=33685514;
 //BA.debugLineNum = 33685514;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=33685517;
 //BA.debugLineNum = 33685517;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33685519;
 //BA.debugLineNum = 33685519;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33685520;
 //BA.debugLineNum = 33685520;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=33685523;
 //BA.debugLineNum = 33685523;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33685524;
 //BA.debugLineNum = 33685524;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=33685527;
 //BA.debugLineNum = 33685527;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=33685528;
 //BA.debugLineNum = 33685528;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33685529;
 //BA.debugLineNum = 33685529;BA.debugLine="If B4XOM.ContainsKey(arrDouble(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[(int) (_i)]))) { 
RDebugUtils.currentLine=33685530;
 //BA.debugLineNum = 33685530;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=33685532;
 //BA.debugLineNum = 33685532;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=33685534;
 //BA.debugLineNum = 33685534;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=33685535;
 //BA.debugLineNum = 33685535;BA.debugLine="B4XOM.Put(arrDouble(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=33685538;
 //BA.debugLineNum = 33685538;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=33685540;
 //BA.debugLineNum = 33685540;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=33685542;
 //BA.debugLineNum = 33685542;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=33685543;
 //BA.debugLineNum = 33685543;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=33685544;
 //BA.debugLineNum = 33685544;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=33685545;
 //BA.debugLineNum = 33685545;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=33685546;
 //BA.debugLineNum = 33685546;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=33685550;
 //BA.debugLineNum = 33685550;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=33685552;
 //BA.debugLineNum = 33685552;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomdoubleidx2(b4a.example.ef.table __ref,double[] _arrdouble,int[] _arrindex,boolean _bascending,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sortomdoubleidx2", false))
	 {return ((int[]) Debug.delegate(ba, "sortomdoubleidx2", new Object[] {_arrdouble,_arrindex,_bascending,_istart,_iend}));}
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
Object _ovalue = null;
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Sub SortOMDoubleIDX2(arrDouble() As Double, arrInd";
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=33751043;
 //BA.debugLineNum = 33751043;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=33751044;
 //BA.debugLineNum = 33751044;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=33751045;
 //BA.debugLineNum = 33751045;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33751047;
 //BA.debugLineNum = 33751047;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=33751048;
 //BA.debugLineNum = 33751048;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=33751049;
 //BA.debugLineNum = 33751049;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=33751050;
 //BA.debugLineNum = 33751050;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=33751053;
 //BA.debugLineNum = 33751053;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33751055;
 //BA.debugLineNum = 33751055;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33751056;
 //BA.debugLineNum = 33751056;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=33751059;
 //BA.debugLineNum = 33751059;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33751060;
 //BA.debugLineNum = 33751060;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=33751063;
 //BA.debugLineNum = 33751063;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=33751064;
 //BA.debugLineNum = 33751064;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33751065;
 //BA.debugLineNum = 33751065;BA.debugLine="If B4XOM.ContainsKey(arrDouble(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=33751066;
 //BA.debugLineNum = 33751066;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=33751068;
 //BA.debugLineNum = 33751068;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=33751070;
 //BA.debugLineNum = 33751070;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=33751071;
 //BA.debugLineNum = 33751071;BA.debugLine="B4XOM.Put(arrDouble(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=33751074;
 //BA.debugLineNum = 33751074;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=33751076;
 //BA.debugLineNum = 33751076;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=33751078;
 //BA.debugLineNum = 33751078;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=33751079;
 //BA.debugLineNum = 33751079;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=33751080;
 //BA.debugLineNum = 33751080;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=33751081;
 //BA.debugLineNum = 33751081;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=33751082;
 //BA.debugLineNum = 33751082;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=33751086;
 //BA.debugLineNum = 33751086;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=33751088;
 //BA.debugLineNum = 33751088;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomlongidx(b4a.example.ef.table __ref,long[] _arrlong,boolean _bascending,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sortomlongidx", false))
	 {return ((int[]) Debug.delegate(ba, "sortomlongidx", new Object[] {_arrlong,_bascending,_istart,_iend}));}
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
int[] _arrindex = null;
Object _ovalue = null;
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Sub SortOMLongIDX(arrLong() As Long, bAscending As";
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=33423363;
 //BA.debugLineNum = 33423363;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=33423364;
 //BA.debugLineNum = 33423364;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=33423365;
 //BA.debugLineNum = 33423365;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33423367;
 //BA.debugLineNum = 33423367;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=33423368;
 //BA.debugLineNum = 33423368;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=33423369;
 //BA.debugLineNum = 33423369;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=33423370;
 //BA.debugLineNum = 33423370;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=33423373;
 //BA.debugLineNum = 33423373;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33423375;
 //BA.debugLineNum = 33423375;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33423376;
 //BA.debugLineNum = 33423376;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=33423379;
 //BA.debugLineNum = 33423379;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33423380;
 //BA.debugLineNum = 33423380;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=33423383;
 //BA.debugLineNum = 33423383;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=33423384;
 //BA.debugLineNum = 33423384;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33423385;
 //BA.debugLineNum = 33423385;BA.debugLine="If B4XOM.ContainsKey(arrLong(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[(int) (_i)]))) { 
RDebugUtils.currentLine=33423386;
 //BA.debugLineNum = 33423386;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=33423388;
 //BA.debugLineNum = 33423388;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=33423390;
 //BA.debugLineNum = 33423390;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=33423391;
 //BA.debugLineNum = 33423391;BA.debugLine="B4XOM.Put(arrLong(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=33423394;
 //BA.debugLineNum = 33423394;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=33423396;
 //BA.debugLineNum = 33423396;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=33423398;
 //BA.debugLineNum = 33423398;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=33423399;
 //BA.debugLineNum = 33423399;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=33423400;
 //BA.debugLineNum = 33423400;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=33423401;
 //BA.debugLineNum = 33423401;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=33423402;
 //BA.debugLineNum = 33423402;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=33423406;
 //BA.debugLineNum = 33423406;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=33423408;
 //BA.debugLineNum = 33423408;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomlongidx2(b4a.example.ef.table __ref,long[] _arrlong,int[] _arrindex,boolean _bascending,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sortomlongidx2", false))
	 {return ((int[]) Debug.delegate(ba, "sortomlongidx2", new Object[] {_arrlong,_arrindex,_bascending,_istart,_iend}));}
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
Object _ovalue = null;
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Sub SortOMLongIDX2(arrLong() As Long, arrIndex() A";
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=33554435;
 //BA.debugLineNum = 33554435;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=33554436;
 //BA.debugLineNum = 33554436;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=33554437;
 //BA.debugLineNum = 33554437;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33554439;
 //BA.debugLineNum = 33554439;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=33554440;
 //BA.debugLineNum = 33554440;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=33554441;
 //BA.debugLineNum = 33554441;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=33554442;
 //BA.debugLineNum = 33554442;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=33554445;
 //BA.debugLineNum = 33554445;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33554447;
 //BA.debugLineNum = 33554447;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33554448;
 //BA.debugLineNum = 33554448;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=33554451;
 //BA.debugLineNum = 33554451;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33554452;
 //BA.debugLineNum = 33554452;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=33554455;
 //BA.debugLineNum = 33554455;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=33554456;
 //BA.debugLineNum = 33554456;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33554457;
 //BA.debugLineNum = 33554457;BA.debugLine="If B4XOM.ContainsKey(arrLong(arrIndex(i))) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=33554458;
 //BA.debugLineNum = 33554458;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=33554460;
 //BA.debugLineNum = 33554460;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=33554462;
 //BA.debugLineNum = 33554462;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=33554463;
 //BA.debugLineNum = 33554463;BA.debugLine="B4XOM.Put(arrLong(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=33554466;
 //BA.debugLineNum = 33554466;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=33554468;
 //BA.debugLineNum = 33554468;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=33554470;
 //BA.debugLineNum = 33554470;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=33554471;
 //BA.debugLineNum = 33554471;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=33554472;
 //BA.debugLineNum = 33554472;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=33554473;
 //BA.debugLineNum = 33554473;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=33554474;
 //BA.debugLineNum = 33554474;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=33554478;
 //BA.debugLineNum = 33554478;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=33554480;
 //BA.debugLineNum = 33554480;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomstringidx(b4a.example.ef.table __ref,String[] _arrstring,boolean _bascending,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sortomstringidx", false))
	 {return ((int[]) Debug.delegate(ba, "sortomstringidx", new Object[] {_arrstring,_bascending,_bcaseinsensitive,_istart,_iend}));}
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
int[] _arrindex = null;
Object _ovalue = null;
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Sub SortOMStringIDX(arrString() As String, bAscend";
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=33816580;
 //BA.debugLineNum = 33816580;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=33816581;
 //BA.debugLineNum = 33816581;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33816583;
 //BA.debugLineNum = 33816583;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=33816584;
 //BA.debugLineNum = 33816584;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=33816585;
 //BA.debugLineNum = 33816585;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=33816586;
 //BA.debugLineNum = 33816586;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=33816589;
 //BA.debugLineNum = 33816589;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33816591;
 //BA.debugLineNum = 33816591;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33816592;
 //BA.debugLineNum = 33816592;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=33816595;
 //BA.debugLineNum = 33816595;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33816596;
 //BA.debugLineNum = 33816596;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=33816599;
 //BA.debugLineNum = 33816599;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=33816600;
 //BA.debugLineNum = 33816600;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33816601;
 //BA.debugLineNum = 33816601;BA.debugLine="If B4XOM.ContainsKey(arrString(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[(int) (_i)]))) { 
RDebugUtils.currentLine=33816602;
 //BA.debugLineNum = 33816602;BA.debugLine="lstIndexes = B4XOM.Get(arrString(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=33816604;
 //BA.debugLineNum = 33816604;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=33816606;
 //BA.debugLineNum = 33816606;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=33816607;
 //BA.debugLineNum = 33816607;BA.debugLine="B4XOM.Put(arrString(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=33816610;
 //BA.debugLineNum = 33816610;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=33816611;
 //BA.debugLineNum = 33816611;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=33816613;
 //BA.debugLineNum = 33816613;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=33816616;
 //BA.debugLineNum = 33816616;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=33816618;
 //BA.debugLineNum = 33816618;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=33816619;
 //BA.debugLineNum = 33816619;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=33816620;
 //BA.debugLineNum = 33816620;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=33816621;
 //BA.debugLineNum = 33816621;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=33816622;
 //BA.debugLineNum = 33816622;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=33816626;
 //BA.debugLineNum = 33816626;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=33816628;
 //BA.debugLineNum = 33816628;BA.debugLine="End Sub";
return null;
}
public int[]  _sortomstringidx2(b4a.example.ef.table __ref,String[] _arrstring,int[] _arrindex,boolean _bascending,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sortomstringidx2", false))
	 {return ((int[]) Debug.delegate(ba, "sortomstringidx2", new Object[] {_arrstring,_arrindex,_bascending,_bcaseinsensitive,_istart,_iend}));}
long _i = 0L;
long _c = 0L;
long _n = 0L;
b4a.example.ef.b4xorderedmap _b4xom = null;
int[] _arrindex2 = null;
anywheresoftware.b4a.objects.collections.List _lstindexes = null;
Object _ovalue = null;
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Sub SortOMStringIDX2(arrString() As String, arrInd";
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=33947653;
 //BA.debugLineNum = 33947653;BA.debugLine="Dim B4XOM As B4XOrderedMap 'this needs the B4XCol";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=33947655;
 //BA.debugLineNum = 33947655;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=33947656;
 //BA.debugLineNum = 33947656;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=33947657;
 //BA.debugLineNum = 33947657;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=33947658;
 //BA.debugLineNum = 33947658;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=33947661;
 //BA.debugLineNum = 33947661;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=33947663;
 //BA.debugLineNum = 33947663;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=33947664;
 //BA.debugLineNum = 33947664;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=33947667;
 //BA.debugLineNum = 33947667;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=33947668;
 //BA.debugLineNum = 33947668;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=33947671;
 //BA.debugLineNum = 33947671;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=33947672;
 //BA.debugLineNum = 33947672;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=33947673;
 //BA.debugLineNum = 33947673;BA.debugLine="If B4XOM.ContainsKey(arrString(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=33947674;
 //BA.debugLineNum = 33947674;BA.debugLine="lstIndexes = B4XOM.Get(arrString(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=33947676;
 //BA.debugLineNum = 33947676;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=33947678;
 //BA.debugLineNum = 33947678;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=33947679;
 //BA.debugLineNum = 33947679;BA.debugLine="B4XOM.Put(arrString(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=33947682;
 //BA.debugLineNum = 33947682;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=33947683;
 //BA.debugLineNum = 33947683;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=33947685;
 //BA.debugLineNum = 33947685;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=33947688;
 //BA.debugLineNum = 33947688;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=33947690;
 //BA.debugLineNum = 33947690;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=33947691;
 //BA.debugLineNum = 33947691;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=33947692;
 //BA.debugLineNum = 33947692;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=33947693;
 //BA.debugLineNum = 33947693;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=33947694;
 //BA.debugLineNum = 33947694;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=33947698;
 //BA.debugLineNum = 33947698;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=33947700;
 //BA.debugLineNum = 33947700;BA.debugLine="End Sub";
return null;
}
public String  _unhidecol(b4a.example.ef.table __ref,int _col,int _newsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unhidecol", false))
	 {return ((String) Debug.delegate(ba, "unhidecol", new Object[] {_col,_newsize}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="For i=0 To SavedWidths.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="tmpWidths(col) = newSize";
_tmpwidths[_col] = _newsize;
RDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=24510471;
 //BA.debugLineNum = 24510471;BA.debugLine="End Sub";
return "";
}
public String  _unselectrow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unselectrow", false))
	 {return ((String) Debug.delegate(ba, "unselectrow", new Object[] {_row}));}
int _previndex = 0;
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Public Sub UnselectRow(Row As Int)";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="prevIndex = SelectedRows.indexof(Row)	 ' -1 if se";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=23068678;
 //BA.debugLineNum = 23068678;BA.debugLine="If prevIndex > -1 Then";
if (_previndex>-1) { 
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="SelectedRows.RemoveAt(prevIndex)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=23068683;
 //BA.debugLineNum = 23068683;BA.debugLine="HideRow(Row)";
__ref._hiderow /*String*/ (null,_row);
RDebugUtils.currentLine=23068684;
 //BA.debugLineNum = 23068684;BA.debugLine="ShowRow(Row)";
__ref._showrow /*void*/ (null,_row);
 };
 };
RDebugUtils.currentLine=23068687;
 //BA.debugLineNum = 23068687;BA.debugLine="End Sub";
return "";
}
public boolean  _updatecell(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updatecell", false))
	 {return ((Boolean) Debug.delegate(ba, "updatecell", new Object[] {_col,_row,_value}));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Public Sub UpdateCell(Col As Int, Row As Int, Valu";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="If (Col < 0 Or Col > mNumberOfColumns - 1 Or Row";
if ((_col<0 || _col>__ref._mnumberofcolumns /*int*/ -1 || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="SetValue(Col, Row, Value)";
__ref._setvalue /*String*/ (null,_col,_row,_value);
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=23789574;
 //BA.debugLineNum = 23789574;BA.debugLine="End Sub";
return false;
}
public boolean  _updaterow(b4a.example.ef.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updaterow", false))
	 {return ((Boolean) Debug.delegate(ba, "updaterow", new Object[] {_row,_values}));}
int _i = 0;
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As Stri";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="If (Values.Length <> mNumberOfColumns Or Row <0 O";
if ((_values.length!=__ref._mnumberofcolumns /*int*/  || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="For i=0 To Values.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_values.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=23724038;
 //BA.debugLineNum = 23724038;BA.debugLine="SetValue(i,Row,Values(i))";
__ref._setvalue /*String*/ (null,_i,_row,_values[_i]);
 }
};
RDebugUtils.currentLine=23724040;
 //BA.debugLineNum = 23724040;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=23724041;
 //BA.debugLineNum = 23724041;BA.debugLine="End Sub";
return false;
}
}