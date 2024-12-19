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
public String  _addrow(b4a.example.ef.table __ref,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addrow", false))
	 {return ((String) Debug.delegate(ba, "addrow", new Object[] {_values}));}
int _lastrow = 0;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Public Sub AddRow(Values() As String)";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("311468802","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=11468819;
 //BA.debugLineNum = 11468819;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
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
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="lbls = GetLabels(Row)";
_lbls = __ref._getlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null,_row);
RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="visibleRows.Put(Row, lbls)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_row),(Object)(_lbls));
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="Private txtColor As Int";
_txtcolor = 0;
RDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
if (true) break;

case 7:
//if
this.state = 22;
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=11599888;
 //BA.debugLineNum = 11599888;BA.debugLine="Else If lstRowColorIndexes.Get(Row) > 1 Then";
if ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))>1) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=11599892;
 //BA.debugLineNum = 11599892;BA.debugLine="Else If cUseColumnColors = True Then";
if (__ref._cusecolumncolors /*boolean*/ ==parent.__c.True) { 
this.state = 13;
}else {
this.state = 15;
}}}
if (true) break;

case 9:
//C
this.state = 22;
RDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = __ref._selecteddrawable /*Object[]*/ ;
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="txtColor = cSelectedRowTextColor";
_txtcolor = __ref._cselectedrowtextcolor /*int*/ ;
 if (true) break;

case 11:
//C
this.state = 22;
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="rowColor = lstRowDrawables.Get(lstRowColorIndexe";
_rowcolor = (Object[])(__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)));
RDebugUtils.currentLine=11599891;
 //BA.debugLineNum = 11599891;BA.debugLine="txtColor = GetContrastColor(lstRowColors.Get(lst";
_txtcolor = __ref._getcontrastcolor /*int*/ (null,(int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)))));
 if (true) break;

case 13:
//C
this.state = 22;
RDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="rowColor = ColumnDrawables";
_rowcolor = __ref._columndrawables /*Object[]*/ ;
RDebugUtils.currentLine=11599894;
 //BA.debugLineNum = 11599894;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="If Row Mod 2 = 0 Then";
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
RDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="rowColor = Drawable1";
_rowcolor = __ref._drawable1 /*Object[]*/ ;
RDebugUtils.currentLine=11599898;
 //BA.debugLineNum = 11599898;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=11599900;
 //BA.debugLineNum = 11599900;BA.debugLine="rowColor = Drawable2";
_rowcolor = __ref._drawable2 /*Object[]*/ ;
RDebugUtils.currentLine=11599901;
 //BA.debugLineNum = 11599901;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
;
RDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="If mNumberOfFixedColumns = 0 Then";

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
RDebugUtils.currentLine=11599905;
 //BA.debugLineNum = 11599905;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=11599906;
 //BA.debugLineNum = 11599906;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
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
RDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(I).L";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11599908;
 //BA.debugLineNum = 11599908;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=11599909;
 //BA.debugLineNum = 11599909;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=11599910;
 //BA.debugLineNum = 11599910;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=11599911;
 //BA.debugLineNum = 11599911;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=11599912;
 //BA.debugLineNum = 11599912;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=11599914;
 //BA.debugLineNum = 11599914;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=11599915;
 //BA.debugLineNum = 11599915;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=11599917;
 //BA.debugLineNum = 11599917;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=11599919;
 //BA.debugLineNum = 11599919;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=11599921;
 //BA.debugLineNum = 11599921;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=11599922;
 //BA.debugLineNum = 11599922;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=11599924;
 //BA.debugLineNum = 11599924;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=11599929;
 //BA.debugLineNum = 11599929;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=11599930;
 //BA.debugLineNum = 11599930;BA.debugLine="If i < mNumberOfFixedColumns Then";
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
RDebugUtils.currentLine=11599931;
 //BA.debugLineNum = 11599931;BA.debugLine="SVF.Panel.AddView(lbls(i), HeaderFirst.GetView";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11599932;
 //BA.debugLineNum = 11599932;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=11599933;
 //BA.debugLineNum = 11599933;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=11599934;
 //BA.debugLineNum = 11599934;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=11599935;
 //BA.debugLineNum = 11599935;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=11599936;
 //BA.debugLineNum = 11599936;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=11599938;
 //BA.debugLineNum = 11599938;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=11599939;
 //BA.debugLineNum = 11599939;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=11599941;
 //BA.debugLineNum = 11599941;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=11599943;
 //BA.debugLineNum = 11599943;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=11599945;
 //BA.debugLineNum = 11599945;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=11599946;
 //BA.debugLineNum = 11599946;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=11599948;
 //BA.debugLineNum = 11599948;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=11599951;
 //BA.debugLineNum = 11599951;BA.debugLine="Private i_1 As Int";
_i_1 = 0;
RDebugUtils.currentLine=11599952;
 //BA.debugLineNum = 11599952;BA.debugLine="i_1 = i - mNumberOfFixedColumns";
_i_1 = (int) (_i-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=11599953;
 //BA.debugLineNum = 11599953;BA.debugLine="If (Header.GetView(i_1).Width > 1 ) Then";
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
RDebugUtils.currentLine=11599954;
 //BA.debugLineNum = 11599954;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(i_1";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11599955;
 //BA.debugLineNum = 11599955;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=11599956;
 //BA.debugLineNum = 11599956;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=11599957;
 //BA.debugLineNum = 11599957;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(";
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
RDebugUtils.currentLine=11599958;
 //BA.debugLineNum = 11599958;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=11599959;
 //BA.debugLineNum = 11599959;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=11599961;
 //BA.debugLineNum = 11599961;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=11599962;
 //BA.debugLineNum = 11599962;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=11599964;
 //BA.debugLineNum = 11599964;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 90:
//C
this.state = 91;
;
RDebugUtils.currentLine=11599966;
 //BA.debugLineNum = 11599966;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=11599968;
 //BA.debugLineNum = 11599968;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=11599969;
 //BA.debugLineNum = 11599969;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=11599971;
 //BA.debugLineNum = 11599971;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=11599979;
 //BA.debugLineNum = 11599979;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=11599980;
 //BA.debugLineNum = 11599980;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=11599981;
 //BA.debugLineNum = 11599981;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=11599982;
 //BA.debugLineNum = 11599982;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
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
RDebugUtils.currentLine=11599984;
 //BA.debugLineNum = 11599984;BA.debugLine="If SubExists(cCallBack, cEventName & \"_ShowRow\")";
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
RDebugUtils.currentLine=11599985;
 //BA.debugLineNum = 11599985;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "showrow"),(int) (0));
this.state = 115;
return;
case 115:
//C
this.state = 110;
;
RDebugUtils.currentLine=11599986;
 //BA.debugLineNum = 11599986;BA.debugLine="CallSub3(cCallBack, cEventName & \"_ShowRow\", Row";
parent.__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_ShowRow",(Object)(_row),(Object)(_lbls));
 if (true) break;

case 110:
//C
this.state = -1;
;
RDebugUtils.currentLine=11599988;
 //BA.debugLineNum = 11599988;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("311534340","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=11534349;
 //BA.debugLineNum = 11534349;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=11534350;
 //BA.debugLineNum = 11534350;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=11534352;
 //BA.debugLineNum = 11534352;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=11534353;
 //BA.debugLineNum = 11534353;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=11534356;
 //BA.debugLineNum = 11534356;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=11534358;
 //BA.debugLineNum = 11534358;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=11534359;
 //BA.debugLineNum = 11534359;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=11534360;
 //BA.debugLineNum = 11534360;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=11534361;
 //BA.debugLineNum = 11534361;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=11534364;
 //BA.debugLineNum = 11534364;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=11534365;
 //BA.debugLineNum = 11534365;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11534366;
 //BA.debugLineNum = 11534366;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=11534368;
 //BA.debugLineNum = 11534368;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=11534370;
 //BA.debugLineNum = 11534370;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=11534371;
 //BA.debugLineNum = 11534371;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=11534372;
 //BA.debugLineNum = 11534372;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=11534373;
 //BA.debugLineNum = 11534373;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=11534374;
 //BA.debugLineNum = 11534374;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=11534375;
 //BA.debugLineNum = 11534375;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=11534379;
 //BA.debugLineNum = 11534379;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=11534380;
 //BA.debugLineNum = 11534380;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=11534383;
 //BA.debugLineNum = 11534383;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=11534384;
 //BA.debugLineNum = 11534384;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=11534391;
 //BA.debugLineNum = 11534391;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
_savedwidths = new int[_widths.length];
;
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
_columnwidths = new int[_widths.length];
;
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
_headerwidths = new int[_widths.length];
;
RDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=11075594;
 //BA.debugLineNum = 11075594;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="HeaderWidths(col) = Widths(col)";
__ref._headerwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=11075596;
 //BA.debugLineNum = 11075596;BA.debugLine="DataWidths(col) = Widths(col)";
__ref._datawidths /*int[]*/ [_col] = _widths[_col];
 }
};
 }else {
RDebugUtils.currentLine=11075599;
 //BA.debugLineNum = 11075599;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step13 = 1;
final int limit13 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=11075600;
 //BA.debugLineNum = 11075600;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=11075601;
 //BA.debugLineNum = 11075601;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
 }
};
 };
RDebugUtils.currentLine=11075605;
 //BA.debugLineNum = 11075605;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=11075606;
 //BA.debugLineNum = 11075606;BA.debugLine="Private w As Int";
_w = 0;
RDebugUtils.currentLine=11075607;
 //BA.debugLineNum = 11075607;BA.debugLine="Private Left As Int";
_left = 0;
RDebugUtils.currentLine=11075608;
 //BA.debugLineNum = 11075608;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=11075609;
 //BA.debugLineNum = 11075609;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=11075610;
 //BA.debugLineNum = 11075610;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit23 ;_col = _col + step23 ) {
RDebugUtils.currentLine=11075611;
 //BA.debugLineNum = 11075611;BA.debugLine="v = Header.GetView(col)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=11075612;
 //BA.debugLineNum = 11075612;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11075613;
 //BA.debugLineNum = 11075613;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=11075614;
 //BA.debugLineNum = 11075614;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=11075615;
 //BA.debugLineNum = 11075615;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=11075616;
 //BA.debugLineNum = 11075616;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=11075619;
 //BA.debugLineNum = 11075619;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
RDebugUtils.currentLine=11075620;
 //BA.debugLineNum = 11075620;BA.debugLine="HeaderFirst.Width = 0";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=11075621;
 //BA.debugLineNum = 11075621;BA.debugLine="SVF.Width = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=11075622;
 //BA.debugLineNum = 11075622;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
RDebugUtils.currentLine=11075623;
 //BA.debugLineNum = 11075623;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=11075624;
 //BA.debugLineNum = 11075624;BA.debugLine="SV2.Left = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=11075625;
 //BA.debugLineNum = 11075625;BA.debugLine="SV2.Width = Min(Header.Width, cWidth)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=11075626;
 //BA.debugLineNum = 11075626;BA.debugLine="Header.Left = 0";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=11075627;
 //BA.debugLineNum = 11075627;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=11075628;
 //BA.debugLineNum = 11075628;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=11075629;
 //BA.debugLineNum = 11075629;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step42 = 1;
final int limit42 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit42 ;_row = _row + step42 ) {
RDebugUtils.currentLine=11075630;
 //BA.debugLineNum = 11075630;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=11075631;
 //BA.debugLineNum = 11075631;BA.debugLine="For col = 0 To lbls.Length - 1";
{
final int step44 = 1;
final int limit44 = (int) (_lbls.length-1);
_col = (int) (0) ;
for (;_col <= limit44 ;_col = _col + step44 ) {
RDebugUtils.currentLine=11075632;
 //BA.debugLineNum = 11075632;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left,";
_lbls[_col].SetLayout(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft(),_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=11075635;
 //BA.debugLineNum = 11075635;BA.debugLine="pnlTable.Width = Min(Header.Width, cWidth)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=11075636;
 //BA.debugLineNum = 11075636;BA.debugLine="lblStatusLine.Width = Header.Width";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=11075637;
 //BA.debugLineNum = 11075637;BA.debugLine="internalPanel.Width = Header.Width";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=11075639;
 //BA.debugLineNum = 11075639;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=11075640;
 //BA.debugLineNum = 11075640;BA.debugLine="Private w, wt As Int";
_w = 0;
_wt = 0;
RDebugUtils.currentLine=11075641;
 //BA.debugLineNum = 11075641;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=11075642;
 //BA.debugLineNum = 11075642;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit55 ;_col = _col + step55 ) {
RDebugUtils.currentLine=11075643;
 //BA.debugLineNum = 11075643;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=11075644;
 //BA.debugLineNum = 11075644;BA.debugLine="v = HeaderFirst.GetView(col)";
_v = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=11075646;
 //BA.debugLineNum = 11075646;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)	'???";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11075647;
 //BA.debugLineNum = 11075647;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=11075648;
 //BA.debugLineNum = 11075648;BA.debugLine="wt = wt + w";
_wt = (int) (_wt+_w);
RDebugUtils.currentLine=11075649;
 //BA.debugLineNum = 11075649;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=11075650;
 //BA.debugLineNum = 11075650;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=11075651;
 //BA.debugLineNum = 11075651;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=11075654;
 //BA.debugLineNum = 11075654;BA.debugLine="mFirstColumnsWidth = Left";
__ref._mfirstcolumnswidth /*int*/  = _left;
RDebugUtils.currentLine=11075655;
 //BA.debugLineNum = 11075655;BA.debugLine="HeaderFirst.Width = Left";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=11075656;
 //BA.debugLineNum = 11075656;BA.debugLine="SVF.Width = HeaderFirst.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=11075657;
 //BA.debugLineNum = 11075657;BA.debugLine="SV2.Left = HeaderFirst.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=11075658;
 //BA.debugLineNum = 11075658;BA.debugLine="Private Left, col_x As Int";
_left = 0;
_col_x = 0;
RDebugUtils.currentLine=11075659;
 //BA.debugLineNum = 11075659;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=11075660;
 //BA.debugLineNum = 11075660;BA.debugLine="For col = mNumberOfFixedColumns To Widths.Length";
{
final int step72 = 1;
final int limit72 = (int) (_widths.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit72 ;_col = _col + step72 ) {
RDebugUtils.currentLine=11075661;
 //BA.debugLineNum = 11075661;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=11075662;
 //BA.debugLineNum = 11075662;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=11075663;
 //BA.debugLineNum = 11075663;BA.debugLine="v = Header.GetView(col_x)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x);
RDebugUtils.currentLine=11075664;
 //BA.debugLineNum = 11075664;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11075665;
 //BA.debugLineNum = 11075665;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=11075666;
 //BA.debugLineNum = 11075666;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=11075667;
 //BA.debugLineNum = 11075667;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=11075668;
 //BA.debugLineNum = 11075668;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=11075671;
 //BA.debugLineNum = 11075671;BA.debugLine="Header.Width = Left";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=11075672;
 //BA.debugLineNum = 11075672;BA.debugLine="Header.Left = -SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=11075673;
 //BA.debugLineNum = 11075673;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=11075674;
 //BA.debugLineNum = 11075674;BA.debugLine="Header.Left = mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._mfirstcolumnswidth /*int*/ );
RDebugUtils.currentLine=11075675;
 //BA.debugLineNum = 11075675;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=11075676;
 //BA.debugLineNum = 11075676;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=11075677;
 //BA.debugLineNum = 11075677;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step89 = 1;
final int limit89 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit89 ;_row = _row + step89 ) {
RDebugUtils.currentLine=11075678;
 //BA.debugLineNum = 11075678;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=11075679;
 //BA.debugLineNum = 11075679;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=11075680;
 //BA.debugLineNum = 11075680;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step92 = 1;
final int limit92 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit92 ;_col = _col + step92 ) {
RDebugUtils.currentLine=11075681;
 //BA.debugLineNum = 11075681;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Width";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),_widths[_col],(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11075682;
 //BA.debugLineNum = 11075682;BA.debugLine="Left = HeaderFirst.GetView(col).Left + HeaderF";
_left = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft()+__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth()+__ref._clinewidth /*int*/ );
 }
};
RDebugUtils.currentLine=11075684;
 //BA.debugLineNum = 11075684;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=11075685;
 //BA.debugLineNum = 11075685;BA.debugLine="For col = mNumberOfFixedColumns To lbls.Length";
{
final int step97 = 1;
final int limit97 = (int) (_lbls.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit97 ;_col = _col + step97 ) {
RDebugUtils.currentLine=11075686;
 //BA.debugLineNum = 11075686;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=11075687;
 //BA.debugLineNum = 11075687;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Heade";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11075688;
 //BA.debugLineNum = 11075688;BA.debugLine="Left = Left + Header.GetView(col_x).Width + cL";
_left = (int) (_left+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth()+__ref._clinewidth /*int*/ );
 }
};
 }
};
RDebugUtils.currentLine=11075691;
 //BA.debugLineNum = 11075691;BA.debugLine="SV2.Width = Min(Header.Width, cWidth - HeaderFir";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ -__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth())));
RDebugUtils.currentLine=11075692;
 //BA.debugLineNum = 11075692;BA.debugLine="pnlTable.Width = Min(HeaderFirst.Width + Header.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=11075693;
 //BA.debugLineNum = 11075693;BA.debugLine="lblStatusLine.Width = HeaderFirst.Width + Header";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=11075694;
 //BA.debugLineNum = 11075694;BA.debugLine="internalPanel.Width = HeaderFirst.Width + Header";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=11075696;
 //BA.debugLineNum = 11075696;BA.debugLine="pnlFastScroll.Left = pnlTable.Width - pnlFastScro";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=11075697;
 //BA.debugLineNum = 11075697;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=11075698;
 //BA.debugLineNum = 11075698;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=11075701;
 //BA.debugLineNum = 11075701;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=11075702;
 //BA.debugLineNum = 11075702;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_left,_top,_width,_height}));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="pnlTable.Initialize(\"\")";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Act.AddView(pnlTable, cLeft, cTop , cWidth, cHeig";
_act.AddView((android.view.View)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._cleft /*int*/ ,__ref._ctop /*int*/ ,__ref._cwidth /*int*/ ,__ref._cheight /*int*/ );
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub InitTable";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="lstRowColors.Initialize				'list of the different";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="lstRowColorIndexes.Initialize	'list of the color";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="lstRowDrawables.Initialize		'list of the drawable";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="pnlTable.Tag = \"Table\"";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)("Table"));
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="TableObject = Me";
__ref._tableobject /*b4a.example.ef.table*/  = (b4a.example.ef.table)(this);
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="SV2.Initialize(0, 0, \"SV2\")";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .Initialize(ba,(int) (0),(int) (0),"SV2");
RDebugUtils.currentLine=10747916;
 //BA.debugLineNum = 10747916;BA.debugLine="SVF.Initialize2(0, \"SVF\")";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .Initialize2(ba,(int) (0),"SVF");
RDebugUtils.currentLine=10747917;
 //BA.debugLineNum = 10747917;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="jo = SVF";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()));
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="jo.RunMethod(\"setVerticalScrollBarEnabled\", Array";
_jo.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="internalPanel.Initialize(\"IP\")";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"IP");
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="SV2.FadingEdges(False)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .FadingEdges(__c.False);
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="IsVisible = True";
__ref._isvisible /*boolean*/  = __c.True;
RDebugUtils.currentLine=10747927;
 //BA.debugLineNum = 10747927;BA.debugLine="HeaderFirst.Initialize(\"\")";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10747928;
 //BA.debugLineNum = 10747928;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=10747929;
 //BA.debugLineNum = 10747929;BA.debugLine="HeaderBase.Initialize(\"\")";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10747930;
 //BA.debugLineNum = 10747930;BA.debugLine="HeaderBase.Color = Colors.Transparent";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10747931;
 //BA.debugLineNum = 10747931;BA.debugLine="Header.Initialize(\"\")";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10747932;
 //BA.debugLineNum = 10747932;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=10747934;
 //BA.debugLineNum = 10747934;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=10747935;
 //BA.debugLineNum = 10747935;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
 }else {
RDebugUtils.currentLine=10747937;
 //BA.debugLineNum = 10747937;BA.debugLine="mFirstColumnsWidth = 100dip";
__ref._mfirstcolumnswidth /*int*/  = __c.DipToCurrent((int) (100));
 };
RDebugUtils.currentLine=10747939;
 //BA.debugLineNum = 10747939;BA.debugLine="pnlTable.AddView(Header, mFirstColumnsWidth, 0 ,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,(int) (0),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=10747940;
 //BA.debugLineNum = 10747940;BA.debugLine="pnlTable.AddView(HeaderFirst, 0, 0, mFirstColumns";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mfirstcolumnswidth /*int*/ ,__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=10747943;
 //BA.debugLineNum = 10747943;BA.debugLine="lblStatusLine.Initialize(\"\")";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10747944;
 //BA.debugLineNum = 10747944;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10747945;
 //BA.debugLineNum = 10747945;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10747946;
 //BA.debugLineNum = 10747946;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=10747947;
 //BA.debugLineNum = 10747947;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=10747948;
 //BA.debugLineNum = 10747948;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=10747949;
 //BA.debugLineNum = 10747949;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),__ref._cwidth /*int*/ ,__ref._cstatuslineheight /*int*/ );
 }else {
RDebugUtils.currentLine=10747951;
 //BA.debugLineNum = 10747951;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=10747952;
 //BA.debugLineNum = 10747952;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=10747953;
 //BA.debugLineNum = 10747953;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=10747955;
 //BA.debugLineNum = 10747955;BA.debugLine="SetPadding(lblStatusLine, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=10747956;
 //BA.debugLineNum = 10747956;BA.debugLine="pnlTable.AddView(internalPanel, 0, 0, cWidth, 0)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._cwidth /*int*/ ,(int) (0));
RDebugUtils.currentLine=10747958;
 //BA.debugLineNum = 10747958;BA.debugLine="pnlFastScroll.Initialize(\"pnlFastScroll\")";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnlFastScroll");
RDebugUtils.currentLine=10747959;
 //BA.debugLineNum = 10747959;BA.debugLine="pnlFastScroll.Color = FScBackgroundColor";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._fscbackgroundcolor /*int*/ );
RDebugUtils.currentLine=10747960;
 //BA.debugLineNum = 10747960;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10747961;
 //BA.debugLineNum = 10747961;BA.debugLine="pnlTable.AddView(pnlFastScroll,  cWidth - FScCurs";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop(),__ref._fsccursorwidth /*int*/ ,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=10747962;
 //BA.debugLineNum = 10747962;BA.debugLine="pnlFastScrollCursor.Initialize(\"\")";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10747963;
 //BA.debugLineNum = 10747963;BA.debugLine="pnlFastScrollCursor.Color = Colors.White";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=10747964;
 //BA.debugLineNum = 10747964;BA.debugLine="pnlFastScroll.AddView(pnlFastScrollCursor,  0, 0,";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=10747965;
 //BA.debugLineNum = 10747965;BA.debugLine="lblFastScroll.Initialize(\"\")";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10747966;
 //BA.debugLineNum = 10747966;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=10747967;
 //BA.debugLineNum = 10747967;BA.debugLine="cdw.Initialize2(Colors.White, 3dip, 1dip, Colors.";
_cdw.Initialize2(__c.Colors.White,__c.DipToCurrent((int) (3)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
RDebugUtils.currentLine=10747968;
 //BA.debugLineNum = 10747968;BA.debugLine="lblFastScroll.Background = cdw";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
RDebugUtils.currentLine=10747969;
 //BA.debugLineNum = 10747969;BA.debugLine="lblFastScroll.TextColor = Colors.Black";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10747970;
 //BA.debugLineNum = 10747970;BA.debugLine="lblFastScroll.Gravity = Bit.Or(Gravity.LEFT, Grav";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Bit.Or(__c.Gravity.LEFT,__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=10747971;
 //BA.debugLineNum = 10747971;BA.debugLine="lblFastScroll.Padding = Array As Int(5dip, 0, 0,";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setPadding(new int[]{__c.DipToCurrent((int) (5)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=10747972;
 //BA.debugLineNum = 10747972;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=10747973;
 //BA.debugLineNum = 10747973;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=10747974;
 //BA.debugLineNum = 10747974;BA.debugLine="pnlTable.AddView(lblFastScroll,  cWidth - mFastS";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._fsclabeltopdelta /*int*/ ,__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 }else {
RDebugUtils.currentLine=10747976;
 //BA.debugLineNum = 10747976;BA.debugLine="pnlTable.AddView(lblFastScroll,  0, (SV2.Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._mfastscrolllabelheight /*int*/ )/(double)2),__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 };
RDebugUtils.currentLine=10747978;
 //BA.debugLineNum = 10747978;BA.debugLine="FScTimer.Initialize(\"FastScrollTimer\", 1500)";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FastScrollTimer",(long) (1500));
RDebugUtils.currentLine=10747980;
 //BA.debugLineNum = 10747980;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=10747982;
 //BA.debugLineNum = 10747982;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=10747984;
 //BA.debugLineNum = 10747984;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10747985;
 //BA.debugLineNum = 10747985;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10747986;
 //BA.debugLineNum = 10747986;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10747987;
 //BA.debugLineNum = 10747987;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10747988;
 //BA.debugLineNum = 10747988;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=10747989;
 //BA.debugLineNum = 10747989;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step74 = 1;
final int limit74 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
RDebugUtils.currentLine=10747990;
 //BA.debugLineNum = 10747990;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=10747991;
 //BA.debugLineNum = 10747991;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=10747992;
 //BA.debugLineNum = 10747992;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=10747993;
 //BA.debugLineNum = 10747993;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=10747994;
 //BA.debugLineNum = 10747994;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
 }
};
RDebugUtils.currentLine=10747996;
 //BA.debugLineNum = 10747996;BA.debugLine="SVF.Panel.Width = SVF.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setWidth(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=10747997;
 //BA.debugLineNum = 10747997;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=10747998;
 //BA.debugLineNum = 10747998;BA.debugLine="SV2.Panel.Width = SV2.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth());
RDebugUtils.currentLine=10747999;
 //BA.debugLineNum = 10747999;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=10748001;
 //BA.debugLineNum = 10748001;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=10748003;
 //BA.debugLineNum = 10748003;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=10748005;
 //BA.debugLineNum = 10748005;BA.debugLine="pnlSortingView.Initialize(\"\")";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10748006;
 //BA.debugLineNum = 10748006;BA.debugLine="If mCustomSortingBitmaps = False Then";
if (__ref._mcustomsortingbitmaps /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=10748007;
 //BA.debugLineNum = 10748007;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
 };
RDebugUtils.currentLine=10748011;
 //BA.debugLineNum = 10748011;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=10748012;
 //BA.debugLineNum = 10748012;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize2((android.graphics.Bitmap)(__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=10748020;
 //BA.debugLineNum = 10748020;BA.debugLine="End Sub";
return "";
}
public String  _addtoview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoview", false))
	 {return ((String) Debug.delegate(ba, "addtoview", new Object[] {_v,_left,_top,_width,_height}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
__ref._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub CalcFastScroll(Pos As Int)";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Private i, Top As Int";
_i = 0;
_top = 0;
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="Top = Pos * FScScale";
_top = (int) (_pos*__ref._fscscale /*double*/ );
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="lblFastScroll.Top = Top + FscLabelTopDelta";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (_top+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="i = (Pos + SV2.Height / 2) / cRowHeight";
_i = (int) ((_pos+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)2)/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="Private str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=15663114;
 //BA.debugLineNum = 15663114;BA.debugLine="str = Data.Get(i)";
_str = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=15663115;
 //BA.debugLineNum = 15663115;BA.debugLine="lblFastScroll.Text = str(mFastScrollColumnIndex)";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_str[__ref._mfastscrollcolumnindex /*int*/ ].substring((int) (0),(int) (__c.Min(_str[__ref._mfastscrollcolumnindex /*int*/ ].length(),__ref._mfastscrolllabelmaxchars /*int*/ )))));
 };
RDebugUtils.currentLine=15663118;
 //BA.debugLineNum = 15663118;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_click", false))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellClick\"";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick")) { 
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellClick\", r";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(b4a.example.ef.table __ref,b4a.example.ef.table._rowcol _rc) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "selectrow", false))
	 {return ((String) Debug.delegate(ba, "selectrow", new Object[] {_rc}));}
int _previndex = 0;
int _prev = 0;
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
_prev = 0;
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="If (prevIndex <> -1 And mMultiSelect = False) The";
if ((_previndex!=-1 && __ref._mmultiselect /*boolean*/ ==__c.False)) { 
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="If mZeroSelection = False Then";
if (__ref._mzeroselection /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=12320783;
 //BA.debugLineNum = 12320783;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=12320787;
 //BA.debugLineNum = 12320787;BA.debugLine="If (prevIndex = -1) Then";
if ((_previndex==-1)) { 
RDebugUtils.currentLine=12320788;
 //BA.debugLineNum = 12320788;BA.debugLine="If (mMultiSelect) Then";
if ((__ref._mmultiselect /*boolean*/ )) { 
RDebugUtils.currentLine=12320789;
 //BA.debugLineNum = 12320789;BA.debugLine="SelectedRows.Add(rc.Row) 'Select the new row";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=12320790;
 //BA.debugLineNum = 12320790;BA.debugLine="prev = -1";
_prev = (int) (-1);
 }else {
RDebugUtils.currentLine=12320794;
 //BA.debugLineNum = 12320794;BA.debugLine="If (SelectedRows.Size <> 0) Then";
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()!=0)) { 
RDebugUtils.currentLine=12320795;
 //BA.debugLineNum = 12320795;BA.debugLine="prev = SelectedRows.Get(0) ' there should be o";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=12320796;
 //BA.debugLineNum = 12320796;BA.debugLine="SelectedRows.set(0, rc.Row) ' change it to the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (0),(Object)(_rc.Row /*int*/ ));
 }else {
RDebugUtils.currentLine=12320798;
 //BA.debugLineNum = 12320798;BA.debugLine="prev = -1";
_prev = (int) (-1);
RDebugUtils.currentLine=12320799;
 //BA.debugLineNum = 12320799;BA.debugLine="SelectedRows.Add(rc.Row)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
 };
 };
 }else {
RDebugUtils.currentLine=12320804;
 //BA.debugLineNum = 12320804;BA.debugLine="prev = SelectedRows.Get(prevIndex) ' should be R";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_previndex)));
RDebugUtils.currentLine=12320805;
 //BA.debugLineNum = 12320805;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=12320808;
 //BA.debugLineNum = 12320808;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
RDebugUtils.currentLine=12320809;
 //BA.debugLineNum = 12320809;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=12320810;
 //BA.debugLineNum = 12320810;BA.debugLine="HideRow(prev)";
__ref._hiderow /*String*/ (null,_prev);
RDebugUtils.currentLine=12320811;
 //BA.debugLineNum = 12320811;BA.debugLine="ShowRow(prev)";
__ref._showrow /*void*/ (null,_prev);
 };
 };
RDebugUtils.currentLine=12320815;
 //BA.debugLineNum = 12320815;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=12320816;
 //BA.debugLineNum = 12320816;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=12320817;
 //BA.debugLineNum = 12320817;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=12320818;
 //BA.debugLineNum = 12320818;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=12320820;
 //BA.debugLineNum = 12320820;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_longclick", false))
	 {return ((String) Debug.delegate(ba, "cell_longclick", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellLongCl";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick")) { 
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellLongClick";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="End Sub";
return "";
}
public boolean  _check1ddoubleallsame(b4a.example.ef.table __ref,double[] _arrdouble,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1ddoubleallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1ddoubleallsame", new Object[] {_arrdouble,_istart,_iend}));}
int _i = 0;
double _dval = 0;
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Sub Check1DDoubleAllSame(arrDouble() As Double, iS";
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="Dim dVal As Double";
_dval = 0;
RDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="If arrDouble.Length = 1 Then";
if (_arrdouble.length==1) { 
RDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=22937610;
 //BA.debugLineNum = 22937610;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=22937613;
 //BA.debugLineNum = 22937613;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=22937614;
 //BA.debugLineNum = 22937614;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=22937617;
 //BA.debugLineNum = 22937617;BA.debugLine="dVal = arrDouble(0)";
_dval = _arrdouble[(int) (0)];
RDebugUtils.currentLine=22937619;
 //BA.debugLineNum = 22937619;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=22937620;
 //BA.debugLineNum = 22937620;BA.debugLine="If arrDouble(i) <> dVal Then";
if (_arrdouble[_i]!=_dval) { 
RDebugUtils.currentLine=22937621;
 //BA.debugLineNum = 22937621;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=22937625;
 //BA.debugLineNum = 22937625;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=22937627;
 //BA.debugLineNum = 22937627;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dlongallsame(b4a.example.ef.table __ref,long[] _arrlong,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dlongallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dlongallsame", new Object[] {_arrlong,_istart,_iend}));}
int _i = 0;
long _lval = 0L;
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Sub Check1DLongAllSame(arrLong() As Long, iStart A";
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=22806531;
 //BA.debugLineNum = 22806531;BA.debugLine="Dim lVal As Long";
_lval = 0L;
RDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="If arrLong.Length = 1 Then";
if (_arrlong.length==1) { 
RDebugUtils.currentLine=22806534;
 //BA.debugLineNum = 22806534;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=22806537;
 //BA.debugLineNum = 22806537;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=22806538;
 //BA.debugLineNum = 22806538;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=22806541;
 //BA.debugLineNum = 22806541;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=22806542;
 //BA.debugLineNum = 22806542;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=22806545;
 //BA.debugLineNum = 22806545;BA.debugLine="lVal = arrLong(0)";
_lval = _arrlong[(int) (0)];
RDebugUtils.currentLine=22806547;
 //BA.debugLineNum = 22806547;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=22806548;
 //BA.debugLineNum = 22806548;BA.debugLine="If arrLong(i) <> lVal Then";
if (_arrlong[_i]!=_lval) { 
RDebugUtils.currentLine=22806549;
 //BA.debugLineNum = 22806549;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=22806553;
 //BA.debugLineNum = 22806553;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=22806555;
 //BA.debugLineNum = 22806555;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dstringallsame(b4a.example.ef.table __ref,String[] _arrstring,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dstringallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dstringallsame", new Object[] {_arrstring,_bcaseinsensitive,_istart,_iend}));}
int _i = 0;
String _str = "";
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Sub Check1DStringAllSame(arrstring() As String, bC";
RDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="If arrstring.Length = 1 Then";
if (_arrstring.length==1) { 
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=23199753;
 //BA.debugLineNum = 23199753;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=23199757;
 //BA.debugLineNum = 23199757;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=23199758;
 //BA.debugLineNum = 23199758;BA.debugLine="iEnd = arrstring.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=23199761;
 //BA.debugLineNum = 23199761;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=23199762;
 //BA.debugLineNum = 23199762;BA.debugLine="str = arrstring(0).ToLowerCase";
_str = _arrstring[(int) (0)].toLowerCase();
RDebugUtils.currentLine=23199763;
 //BA.debugLineNum = 23199763;BA.debugLine="For i = iStart To iEnd";
{
final int step14 = 1;
final int limit14 = _iend;
_i = _istart ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=23199764;
 //BA.debugLineNum = 23199764;BA.debugLine="If arrstring(i).ToLowerCase.CompareTo(str) <> 0";
if (_arrstring[_i].toLowerCase().compareTo(_str)!=0) { 
RDebugUtils.currentLine=23199765;
 //BA.debugLineNum = 23199765;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 }else {
RDebugUtils.currentLine=23199769;
 //BA.debugLineNum = 23199769;BA.debugLine="str = arrstring(0)";
_str = _arrstring[(int) (0)];
RDebugUtils.currentLine=23199770;
 //BA.debugLineNum = 23199770;BA.debugLine="For i = iStart To iEnd";
{
final int step21 = 1;
final int limit21 = _iend;
_i = _istart ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=23199771;
 //BA.debugLineNum = 23199771;BA.debugLine="If arrstring(i).CompareTo(str) <> 0 Then";
if (_arrstring[_i].compareTo(_str)!=0) { 
RDebugUtils.currentLine=23199772;
 //BA.debugLineNum = 23199772;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 };
RDebugUtils.currentLine=23199777;
 //BA.debugLineNum = 23199777;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=23199779;
 //BA.debugLineNum = 23199779;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub CheckColumnDataTypes(MyCurs As Cursor)";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Private NbCols, NbRows As Int";
_nbcols = 0;
_nbrows = 0;
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="NbCols = MyCurs.ColumnCount";
_nbcols = _mycurs.getColumnCount();
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="NbRows = MyCurs.RowCount";
_nbrows = _mycurs.getRowCount();
RDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="Private ColumnTypes(NbCols), str As String";
_columntypes = new String[_nbcols];
java.util.Arrays.fill(_columntypes,"");
_str = "";
RDebugUtils.currentLine=18350086;
 //BA.debugLineNum = 18350086;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=18350088;
 //BA.debugLineNum = 18350088;BA.debugLine="For col = 0 To NbCols - 1";
{
final int step6 = 1;
final int limit6 = (int) (_nbcols-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=18350090;
 //BA.debugLineNum = 18350090;BA.debugLine="For row = 0 To NbRows - 1";
{
final int step8 = 1;
final int limit8 = (int) (_nbrows-1);
_row = (int) (0) ;
for (;_row <= limit8 ;_row = _row + step8 ) {
RDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="MyCurs.Position = row";
_mycurs.setPosition(_row);
RDebugUtils.currentLine=18350092;
 //BA.debugLineNum = 18350092;BA.debugLine="str = MyCurs.GetString2(col)";
_str = _mycurs.GetString2(_col);
RDebugUtils.currentLine=18350093;
 //BA.debugLineNum = 18350093;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=18350094;
 //BA.debugLineNum = 18350094;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=18350096;
 //BA.debugLineNum = 18350096;BA.debugLine="If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=18350097;
 //BA.debugLineNum = 18350097;BA.debugLine="If str.Contains(\".\") Then";
if (_str.contains(".")) { 
RDebugUtils.currentLine=18350098;
 //BA.debugLineNum = 18350098;BA.debugLine="ColumnTypes(col) = \"R\"";
_columntypes[_col] = "R";
 }else {
RDebugUtils.currentLine=18350100;
 //BA.debugLineNum = 18350100;BA.debugLine="ColumnTypes(col) = \"I\"";
_columntypes[_col] = "I";
 };
 }else {
RDebugUtils.currentLine=18350103;
 //BA.debugLineNum = 18350103;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=18350104;
 //BA.debugLineNum = 18350104;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=18350109;
 //BA.debugLineNum = 18350109;BA.debugLine="Return ColumnTypes";
if (true) return _columntypes;
RDebugUtils.currentLine=18350110;
 //BA.debugLineNum = 18350110;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Private SV2 As ScrollView2D";
_sv2 = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Private SVF As ScrollView";
_svf = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="Private pnlTable As Panel";
_pnltable = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="Private Header, HeaderBase As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
_headerbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="Private HeaderFirst As Panel";
_headerfirst = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="Private lblStatusLine As Label";
_lblstatusline = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="Private pnlFastScroll As Panel";
_pnlfastscroll = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="Private pnlFastScrollCursor As Panel";
_pnlfastscrollcursor = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="Private FScCursorWidth = 25dip As Int";
_fsccursorwidth = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="Private FScCursorHeight = 60dip As Int";
_fsccursorheight = __c.DipToCurrent((int) (60));
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="Private FscLabelTopDelta As Int";
_fsclabeltopdelta = 0;
RDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="Private FScBackgroundColor = Colors.ARGB(48, 128,";
_fscbackgroundcolor = __c.Colors.ARGB((int) (48),(int) (128),(int) (128),(int) (128));
RDebugUtils.currentLine=10420240;
 //BA.debugLineNum = 10420240;BA.debugLine="Private FScCursorCol1 = Colors.Blue As Int";
_fsccursorcol1 = __c.Colors.Blue;
RDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="Private FScCursorCol2 = Colors.Yellow As Int";
_fsccursorcol2 = __c.Colors.Yellow;
RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="Private lblFastScroll As Label";
_lblfastscroll = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=10420243;
 //BA.debugLineNum = 10420243;BA.debugLine="Private FSY0, FSdY, FastScrollHeight As Int";
_fsy0 = 0;
_fsdy = 0;
_fastscrollheight = 0;
RDebugUtils.currentLine=10420244;
 //BA.debugLineNum = 10420244;BA.debugLine="Private FScScale As Double";
_fscscale = 0;
RDebugUtils.currentLine=10420245;
 //BA.debugLineNum = 10420245;BA.debugLine="Private FScTimer As Timer";
_fsctimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=10420246;
 //BA.debugLineNum = 10420246;BA.debugLine="Private mFastScroll = False As Boolean";
_mfastscroll = __c.False;
RDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="Private FastScrollActive As Boolean";
_fastscrollactive = false;
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="Private mFastScrollColumnIndex = 0 As Int";
_mfastscrollcolumnindex = (int) (0);
RDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="Private mFastScrollMinItems = 50 As Int";
_mfastscrollminitems = (int) (50);
RDebugUtils.currentLine=10420250;
 //BA.debugLineNum = 10420250;BA.debugLine="Private mFastScrollShowLabel = True As Boolean";
_mfastscrollshowlabel = __c.True;
RDebugUtils.currentLine=10420251;
 //BA.debugLineNum = 10420251;BA.debugLine="Private mFastScrollFixedLabel = False As Boolean";
_mfastscrollfixedlabel = __c.False;
RDebugUtils.currentLine=10420252;
 //BA.debugLineNum = 10420252;BA.debugLine="Private mFastScrollLabelMaxChars = 10 As Int";
_mfastscrolllabelmaxchars = (int) (10);
RDebugUtils.currentLine=10420253;
 //BA.debugLineNum = 10420253;BA.debugLine="Private mFastScrollLabelWidth = 150dip As Int";
_mfastscrolllabelwidth = __c.DipToCurrent((int) (150));
RDebugUtils.currentLine=10420254;
 //BA.debugLineNum = 10420254;BA.debugLine="Private mFastScrollLabelHeight = 30dip As Int";
_mfastscrolllabelheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=10420256;
 //BA.debugLineNum = 10420256;BA.debugLine="Private cCallBack As Object";
_ccallback = new Object();
RDebugUtils.currentLine=10420257;
 //BA.debugLineNum = 10420257;BA.debugLine="Private cEventName As String";
_ceventname = "";
RDebugUtils.currentLine=10420258;
 //BA.debugLineNum = 10420258;BA.debugLine="Private cLeft, cTop , cWidth, cHeight As Int";
_cleft = 0;
_ctop = 0;
_cwidth = 0;
_cheight = 0;
RDebugUtils.currentLine=10420259;
 //BA.debugLineNum = 10420259;BA.debugLine="Public HeaderNames As List";
_headernames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420260;
 //BA.debugLineNum = 10420260;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
_selectedrows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420261;
 //BA.debugLineNum = 10420261;BA.debugLine="Private SelectedCol As Int";
_selectedcol = 0;
RDebugUtils.currentLine=10420262;
 //BA.debugLineNum = 10420262;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420263;
 //BA.debugLineNum = 10420263;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420264;
 //BA.debugLineNum = 10420264;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
RDebugUtils.currentLine=10420265;
 //BA.debugLineNum = 10420265;BA.debugLine="Private IsVisible As Boolean";
_isvisible = false;
RDebugUtils.currentLine=10420266;
 //BA.debugLineNum = 10420266;BA.debugLine="Public visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10420267;
 //BA.debugLineNum = 10420267;BA.debugLine="Private mNumberOfColumns, ColumnWidths(), cColumn";
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
RDebugUtils.currentLine=10420268;
 //BA.debugLineNum = 10420268;BA.debugLine="Private cColumnDataType() As String";
_ccolumndatatype = new String[(int) (0)];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=10420269;
 //BA.debugLineNum = 10420269;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
_crowheight = 0;
_cheadercolor = 0;
_ctablecolor = 0;
_ctextcolor = 0;
_cheaderheight = 0;
_cheadertextcolor = 0;
_cstatuslineheight = 0;
RDebugUtils.currentLine=10420270;
 //BA.debugLineNum = 10420270;BA.debugLine="Private cAutomaticWidths = False As Boolean";
_cautomaticwidths = __c.False;
RDebugUtils.currentLine=10420271;
 //BA.debugLineNum = 10420271;BA.debugLine="Private cTextSize As Float";
_ctextsize = 0f;
RDebugUtils.currentLine=10420272;
 //BA.debugLineNum = 10420272;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
RDebugUtils.currentLine=10420273;
 //BA.debugLineNum = 10420273;BA.debugLine="Private cAlignment As Int";
_calignment = 0;
RDebugUtils.currentLine=10420274;
 //BA.debugLineNum = 10420274;BA.debugLine="Private cAlignments() As Int";
_calignments = new int[(int) (0)];
;
RDebugUtils.currentLine=10420275;
 //BA.debugLineNum = 10420275;BA.debugLine="Private cAlignments0() As Int";
_calignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=10420276;
 //BA.debugLineNum = 10420276;BA.debugLine="Private MultiAlignments = False As Boolean";
_multialignments = __c.False;
RDebugUtils.currentLine=10420277;
 //BA.debugLineNum = 10420277;BA.debugLine="Private MultiTypeFace = False As Boolean";
_multitypeface = __c.False;
RDebugUtils.currentLine=10420278;
 //BA.debugLineNum = 10420278;BA.debugLine="Private MultiTextColors = False As Boolean";
_multitextcolors = __c.False;
RDebugUtils.currentLine=10420279;
 //BA.debugLineNum = 10420279;BA.debugLine="Private cHeaderAlignment = Gravity.CENTER As Int";
_cheaderalignment = __c.Gravity.CENTER;
RDebugUtils.currentLine=10420280;
 //BA.debugLineNum = 10420280;BA.debugLine="Private cHeaderAlignments() As Int";
_cheaderalignments = new int[(int) (0)];
;
RDebugUtils.currentLine=10420281;
 //BA.debugLineNum = 10420281;BA.debugLine="Private cHeaderAlignments0() As Int";
_cheaderalignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=10420282;
 //BA.debugLineNum = 10420282;BA.debugLine="Private HeaderMultiAlignments = False As Boolean";
_headermultialignments = __c.False;
RDebugUtils.currentLine=10420283;
 //BA.debugLineNum = 10420283;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
_ctypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_ctypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=10420284;
 //BA.debugLineNum = 10420284;BA.debugLine="Private cTypeFaces() As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=10420285;
 //BA.debugLineNum = 10420285;BA.debugLine="Private cTypeFaces0() As Typeface";
_ctypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=10420286;
 //BA.debugLineNum = 10420286;BA.debugLine="Private HeaderMultiTypeFace = False As Boolean";
_headermultitypeface = __c.False;
RDebugUtils.currentLine=10420287;
 //BA.debugLineNum = 10420287;BA.debugLine="Private cHeaderTypeFace = Typeface.DEFAULT As Typ";
_cheadertypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_cheadertypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=10420288;
 //BA.debugLineNum = 10420288;BA.debugLine="Private cHeaderTypeFaces() As Typeface";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=10420289;
 //BA.debugLineNum = 10420289;BA.debugLine="Private cHeaderTypeFaces0() As Typeface";
_cheadertypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=10420290;
 //BA.debugLineNum = 10420290;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
_clinewidth = (int) (__c.Max(1,__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10420291;
 //BA.debugLineNum = 10420291;BA.debugLine="Private ExtraWidth = 12dip + cLineWidth	As Int";
_extrawidth = (int) (__c.DipToCurrent((int) (12))+__ref._clinewidth /*int*/ );
RDebugUtils.currentLine=10420292;
 //BA.debugLineNum = 10420292;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
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
RDebugUtils.currentLine=10420293;
 //BA.debugLineNum = 10420293;BA.debugLine="Private SelectedCellDrawable As Object";
_selectedcelldrawable = new Object();
RDebugUtils.currentLine=10420294;
 //BA.debugLineNum = 10420294;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
_crowcolor1 = 0;
_crowcolor2 = 0;
_cselectedrowcolor = 0;
_cselectedcellcolor = 0;
_cselectedrowtextcolor = 0;
_cselectedcelltextcolor = 0;
RDebugUtils.currentLine=10420295;
 //BA.debugLineNum = 10420295;BA.debugLine="Private cSortColumn = True As Boolean";
_csortcolumn = __c.True;
RDebugUtils.currentLine=10420296;
 //BA.debugLineNum = 10420296;BA.debugLine="Private cUseColumnColors = False As Boolean";
_cusecolumncolors = __c.False;
RDebugUtils.currentLine=10420297;
 //BA.debugLineNum = 10420297;BA.debugLine="Private cSortRemoveAccents = False As Boolean";
_csortremoveaccents = __c.False;
RDebugUtils.currentLine=10420298;
 //BA.debugLineNum = 10420298;BA.debugLine="Private mFirstColumnsWidth = 0 As Int";
_mfirstcolumnswidth = (int) (0);
RDebugUtils.currentLine=10420299;
 //BA.debugLineNum = 10420299;BA.debugLine="Private mFirstColumnFixed = False As Boolean";
_mfirstcolumnfixed = __c.False;
RDebugUtils.currentLine=10420300;
 //BA.debugLineNum = 10420300;BA.debugLine="Private mNumberOfFixedColumns As Int";
_mnumberoffixedcolumns = 0;
RDebugUtils.currentLine=10420301;
 //BA.debugLineNum = 10420301;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10420302;
 //BA.debugLineNum = 10420302;BA.debugLine="Private cvs As Canvas		' used to measure string w";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=10420303;
 //BA.debugLineNum = 10420303;BA.debugLine="Private lstRowColorIndexes As List";
_lstrowcolorindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420304;
 //BA.debugLineNum = 10420304;BA.debugLine="Private lstRowColors As List";
_lstrowcolors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420305;
 //BA.debugLineNum = 10420305;BA.debugLine="Private lstRowDrawables As List";
_lstrowdrawables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420307;
 //BA.debugLineNum = 10420307;BA.debugLine="cHeaderColor = Colors.Gray";
__ref._cheadercolor /*int*/  = __c.Colors.Gray;
RDebugUtils.currentLine=10420308;
 //BA.debugLineNum = 10420308;BA.debugLine="cTableColor = Colors.LightGray";
__ref._ctablecolor /*int*/  = __c.Colors.LightGray;
RDebugUtils.currentLine=10420309;
 //BA.debugLineNum = 10420309;BA.debugLine="cTextColor = Colors.Black";
__ref._ctextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=10420310;
 //BA.debugLineNum = 10420310;BA.debugLine="cHeaderTextColor = Colors.White";
__ref._cheadertextcolor /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=10420311;
 //BA.debugLineNum = 10420311;BA.debugLine="cTextSize = 14";
__ref._ctextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=10420312;
 //BA.debugLineNum = 10420312;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
RDebugUtils.currentLine=10420313;
 //BA.debugLineNum = 10420313;BA.debugLine="cRowColor1 = Colors.White";
__ref._crowcolor1 /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=10420314;
 //BA.debugLineNum = 10420314;BA.debugLine="cRowColor2 = 0xFF98F5FF";
__ref._crowcolor2 /*int*/  = ((int)0xff98f5ff);
RDebugUtils.currentLine=10420315;
 //BA.debugLineNum = 10420315;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
__ref._cselectedrowcolor /*int*/  = ((int)0xff007fff);
RDebugUtils.currentLine=10420316;
 //BA.debugLineNum = 10420316;BA.debugLine="cSelectedRowTextColor = Colors.Black";
__ref._cselectedrowtextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=10420317;
 //BA.debugLineNum = 10420317;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
__ref._cselectedcellcolor /*int*/  = ((int)0xfffc8eac);
RDebugUtils.currentLine=10420318;
 //BA.debugLineNum = 10420318;BA.debugLine="cSelectedCellTextColor = Colors.Black";
__ref._cselectedcelltextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=10420319;
 //BA.debugLineNum = 10420319;BA.debugLine="cRowHeight = 40dip";
__ref._crowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=10420320;
 //BA.debugLineNum = 10420320;BA.debugLine="cHeaderHeight = cRowHeight";
__ref._cheaderheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=10420321;
 //BA.debugLineNum = 10420321;BA.debugLine="cStatusLineHeight = cRowHeight";
__ref._cstatuslineheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=10420323;
 //BA.debugLineNum = 10420323;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
_csingleline = __c.True;
RDebugUtils.currentLine=10420325;
 //BA.debugLineNum = 10420325;BA.debugLine="Private mMultiSelect As Boolean = False";
_mmultiselect = __c.False;
RDebugUtils.currentLine=10420326;
 //BA.debugLineNum = 10420326;BA.debugLine="Private cAllowSelection = True As Boolean";
_callowselection = __c.True;
RDebugUtils.currentLine=10420327;
 //BA.debugLineNum = 10420327;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
_savedwidths = new int[(int) (0)];
;
RDebugUtils.currentLine=10420328;
 //BA.debugLineNum = 10420328;BA.debugLine="Private cShowStatusLine As Boolean =True";
_cshowstatusline = __c.True;
RDebugUtils.currentLine=10420330;
 //BA.debugLineNum = 10420330;BA.debugLine="Private internalPanel As Panel";
_internalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420332;
 //BA.debugLineNum = 10420332;BA.debugLine="Public sortingDir As Int = 0 ' -1,0,1 as acc, uns";
_sortingdir = (int) (0);
RDebugUtils.currentLine=10420333;
 //BA.debugLineNum = 10420333;BA.debugLine="Public sortedCol As Int = -1' hold the sorted col";
_sortedcol = (int) (-1);
RDebugUtils.currentLine=10420334;
 //BA.debugLineNum = 10420334;BA.debugLine="Private pnlSortingView As Panel";
_pnlsortingview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420336;
 //BA.debugLineNum = 10420336;BA.debugLine="Private debug_counter As Long";
_debug_counter = 0L;
RDebugUtils.currentLine=10420337;
 //BA.debugLineNum = 10420337;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
_enablestatuslineautofill = __c.True;
RDebugUtils.currentLine=10420339;
 //BA.debugLineNum = 10420339;BA.debugLine="Private pnlAsc As Panel										'added in versio";
_pnlasc = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=10420340;
 //BA.debugLineNum = 10420340;BA.debugLine="Private bmpAsc, bmpDes, bmpEqual As Bitmap					'a";
_bmpasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=10420341;
 //BA.debugLineNum = 10420341;BA.debugLine="Private cvsAsc, cvsDes, cvsEqual As Canvas					'a";
_cvsasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=10420342;
 //BA.debugLineNum = 10420342;BA.debugLine="Private cSortBitmapWidth As Int						'added in ve";
_csortbitmapwidth = 0;
RDebugUtils.currentLine=10420343;
 //BA.debugLineNum = 10420343;BA.debugLine="Private cSortBitmapHeight As Int					'added in ve";
_csortbitmapheight = 0;
RDebugUtils.currentLine=10420344;
 //BA.debugLineNum = 10420344;BA.debugLine="Private cSortBitmapColor As Int						'added in ve";
_csortbitmapcolor = 0;
RDebugUtils.currentLine=10420345;
 //BA.debugLineNum = 10420345;BA.debugLine="Private mCustomSortingBitmaps As Boolean	'added i";
_mcustomsortingbitmaps = false;
RDebugUtils.currentLine=10420346;
 //BA.debugLineNum = 10420346;BA.debugLine="Private mZeroSelection = False As Boolean";
_mzeroselection = __c.False;
RDebugUtils.currentLine=10420347;
 //BA.debugLineNum = 10420347;BA.debugLine="Private SV2Scrolls, SVFScrolls As Boolean";
_sv2scrolls = false;
_svfscrolls = false;
RDebugUtils.currentLine=10420348;
 //BA.debugLineNum = 10420348;BA.debugLine="Private SV2PosX As Int";
_sv2posx = 0;
RDebugUtils.currentLine=10420349;
 //BA.debugLineNum = 10420349;BA.debugLine="Public TableObject As Table";
_tableobject = new b4a.example.ef.table();
RDebugUtils.currentLine=10420354;
 //BA.debugLineNum = 10420354;BA.debugLine="Private arrColLong() As Long";
_arrcollong = new long[(int) (0)];
;
RDebugUtils.currentLine=10420355;
 //BA.debugLineNum = 10420355;BA.debugLine="Private arrColDouble() As Double";
_arrcoldouble = new double[(int) (0)];
;
RDebugUtils.currentLine=10420356;
 //BA.debugLineNum = 10420356;BA.debugLine="Private arrColString() As String";
_arrcolstring = new String[(int) (0)];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=10420357;
 //BA.debugLineNum = 10420357;BA.debugLine="Private arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=10420358;
 //BA.debugLineNum = 10420358;BA.debugLine="Private iPreviousSortColumn As Int = -1 'ignore w";
_iprevioussortcolumn = (int) (-1);
RDebugUtils.currentLine=10420359;
 //BA.debugLineNum = 10420359;BA.debugLine="Private bPreviousSortAscending As Boolean 'ignore";
_bprevioussortascending = false;
RDebugUtils.currentLine=10420360;
 //BA.debugLineNum = 10420360;BA.debugLine="Private mapSortingIndexes As Map";
_mapsortingindexes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=10420361;
 //BA.debugLineNum = 10420361;BA.debugLine="Private arrDataSorted() As Boolean 'added";
_arrdatasorted = new boolean[(int) (0)];
;
RDebugUtils.currentLine=10420362;
 //BA.debugLineNum = 10420362;BA.debugLine="Private bDataTempDone As Boolean 'added";
_bdatatempdone = false;
RDebugUtils.currentLine=10420363;
 //BA.debugLineNum = 10420363;BA.debugLine="Private DataTemp As List 'added";
_datatemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10420364;
 //BA.debugLineNum = 10420364;BA.debugLine="Private mMultiColumnSort As Boolean = False";
_mmulticolumnsort = __c.False;
RDebugUtils.currentLine=10420365;
 //BA.debugLineNum = 10420365;BA.debugLine="Private mSortCaseInsensitive As Boolean = False";
_msortcaseinsensitive = __c.False;
RDebugUtils.currentLine=10420367;
 //BA.debugLineNum = 10420367;BA.debugLine="End Sub";
return "";
}
public String  _clearall(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearall", false))
	 {return ((String) Debug.delegate(ba, "clearall", null));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub ClearAll";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int,";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="SV2.Panel.RemoveAllViews";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="SVF.Panel.RemoveAllViews";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="mNumberOfColumns = vNumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _vnumberofcolumns;
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="Dim Drawable1(mNumberOfColumns) As Object";
_drawable1 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Dim Drawable2(mNumberOfColumns) As Object";
_drawable2 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="Dim SelectedDrawable(mNumberOfColumns) As Object";
_selecteddrawable = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Dim cHeaderAlignments(mNumberOfColumns) As Int";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="Dim cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="Dim cHeaderTypeFaces(mNumberOfColumns) As Typefac";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="If lstRowColors.Size > 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="For i = 0 To lstRowColors.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="Private cds(mNumberOfColumns) As Object";
_cds = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cds.length;
for (int i0 = 0;i0 < d0;i0++) {
_cds[i0] = new Object();
}
}
;
RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="Private color = lstRowColors.Get(i) As Int";
_color = (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=11206674;
 //BA.debugLineNum = 11206674;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=11206675;
 //BA.debugLineNum = 11206675;BA.debugLine="Private cdi As ColorDrawable";
_cdi = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11206676;
 //BA.debugLineNum = 11206676;BA.debugLine="cdi.Initialize(color, 0)";
_cdi.Initialize(_color,(int) (0));
RDebugUtils.currentLine=11206677;
 //BA.debugLineNum = 11206677;BA.debugLine="cds(col) = cdi";
_cds[_col] = (Object)(_cdi.getObject());
 }
};
RDebugUtils.currentLine=11206679;
 //BA.debugLineNum = 11206679;BA.debugLine="lstRowDrawables.Add(cds)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cds));
 }
};
 };
RDebugUtils.currentLine=11206682;
 //BA.debugLineNum = 11206682;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=11206683;
 //BA.debugLineNum = 11206683;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11206684;
 //BA.debugLineNum = 11206684;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
_cd1.Initialize(__ref._crowcolor1 /*int*/ ,(int) (0));
RDebugUtils.currentLine=11206685;
 //BA.debugLineNum = 11206685;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
_cd2.Initialize(__ref._crowcolor2 /*int*/ ,(int) (0));
RDebugUtils.currentLine=11206686;
 //BA.debugLineNum = 11206686;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=11206687;
 //BA.debugLineNum = 11206687;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=11206688;
 //BA.debugLineNum = 11206688;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=11206689;
 //BA.debugLineNum = 11206689;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=11206690;
 //BA.debugLineNum = 11206690;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206691;
 //BA.debugLineNum = 11206691;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=11206693;
 //BA.debugLineNum = 11206693;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=11206695;
 //BA.debugLineNum = 11206695;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206696;
 //BA.debugLineNum = 11206696;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=11206698;
 //BA.debugLineNum = 11206698;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=11206701;
 //BA.debugLineNum = 11206701;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206702;
 //BA.debugLineNum = 11206702;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=11206704;
 //BA.debugLineNum = 11206704;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=11206706;
 //BA.debugLineNum = 11206706;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206707;
 //BA.debugLineNum = 11206707;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=11206709;
 //BA.debugLineNum = 11206709;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 }else {
RDebugUtils.currentLine=11206713;
 //BA.debugLineNum = 11206713;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
RDebugUtils.currentLine=11206714;
 //BA.debugLineNum = 11206714;BA.debugLine="Private cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11206715;
 //BA.debugLineNum = 11206715;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
_cd1.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=11206716;
 //BA.debugLineNum = 11206716;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
_cd2.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=11206717;
 //BA.debugLineNum = 11206717;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=11206718;
 //BA.debugLineNum = 11206718;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=11206719;
 //BA.debugLineNum = 11206719;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=11206720;
 //BA.debugLineNum = 11206720;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=11206721;
 //BA.debugLineNum = 11206721;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206722;
 //BA.debugLineNum = 11206722;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=11206724;
 //BA.debugLineNum = 11206724;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=11206726;
 //BA.debugLineNum = 11206726;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206727;
 //BA.debugLineNum = 11206727;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=11206729;
 //BA.debugLineNum = 11206729;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=11206732;
 //BA.debugLineNum = 11206732;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206733;
 //BA.debugLineNum = 11206733;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=11206735;
 //BA.debugLineNum = 11206735;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=11206737;
 //BA.debugLineNum = 11206737;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11206738;
 //BA.debugLineNum = 11206738;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=11206740;
 //BA.debugLineNum = 11206740;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 };
RDebugUtils.currentLine=11206745;
 //BA.debugLineNum = 11206745;BA.debugLine="Dim cd4 As ColorDrawable";
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=11206746;
 //BA.debugLineNum = 11206746;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
_cd4.Initialize(__ref._cselectedcellcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=11206747;
 //BA.debugLineNum = 11206747;BA.debugLine="SelectedCellDrawable = cd4";
__ref._selectedcelldrawable /*Object*/  = (Object)(_cd4.getObject());
RDebugUtils.currentLine=11206749;
 //BA.debugLineNum = 11206749;BA.debugLine="SV2.Panel.Height = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=11206750;
 //BA.debugLineNum = 11206750;BA.debugLine="SVF.Panel.Height = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=11206753;
 //BA.debugLineNum = 11206753;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=11206754;
 //BA.debugLineNum = 11206754;BA.debugLine="minVisibleRow = -1";
__ref._minvisiblerow /*int*/  = (int) (-1);
RDebugUtils.currentLine=11206755;
 //BA.debugLineNum = 11206755;BA.debugLine="maxVisibleRow = 0";
__ref._maxvisiblerow /*int*/  = (int) (0);
RDebugUtils.currentLine=11206756;
 //BA.debugLineNum = 11206756;BA.debugLine="If ClearData = True Then";
if (_cleardata==__c.True) { 
RDebugUtils.currentLine=11206757;
 //BA.debugLineNum = 11206757;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=11206759;
 //BA.debugLineNum = 11206759;BA.debugLine="LabelsCache.Initialize";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=11206760;
 //BA.debugLineNum = 11206760;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=11206761;
 //BA.debugLineNum = 11206761;BA.debugLine="SV2.VerticalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=11206762;
 //BA.debugLineNum = 11206762;BA.debugLine="SVF.ScrollPosition = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setScrollPosition((int) (0));
RDebugUtils.currentLine=11206763;
 //BA.debugLineNum = 11206763;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step100 = 1;
final int limit100 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit100 ;_i = _i + step100 ) {
RDebugUtils.currentLine=11206764;
 //BA.debugLineNum = 11206764;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null)));
 }
};
RDebugUtils.currentLine=11206766;
 //BA.debugLineNum = 11206766;BA.debugLine="If IsVisible Then";
if (__ref._isvisible /*boolean*/ ) { 
RDebugUtils.currentLine=11206767;
 //BA.debugLineNum = 11206767;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=11206768;
 //BA.debugLineNum = 11206768;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=11206770;
 //BA.debugLineNum = 11206770;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=11206772;
 //BA.debugLineNum = 11206772;BA.debugLine="End Sub";
return "";
}
public String  _updateiplocation(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updateiplocation", false))
	 {return ((String) Debug.delegate(ba, "updateiplocation", null));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub updateIPLocation";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="If (SV2.Height > Data.Size * cRowHeight) Then";
if ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )) { 
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cHe";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ +__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="internalPanel.Height = SV2.Height - (Data.Size *";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="internalPanel.Height = 0";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (0));
 };
RDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="End Sub";
return "";
}
public String  _clearselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearselection", false))
	 {return ((String) Debug.delegate(ba, "clearselection", null));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub clearSelection";
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="End Sub";
return "";
}
public String  _refreshtable(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "refreshtable", false))
	 {return ((String) Debug.delegate(ba, "refreshtable", null));}
int _i = 0;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub RefreshTable";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step2 = 1;
final int limit2 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub CreateNewLabels As Label()";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="Dim lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="rc.Col = i";
_rc.Col /*int*/  = _i;
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="lbl.Initialize(\"Cell\")";
_lbl.Initialize(ba,"Cell");
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=11862026;
 //BA.debugLineNum = 11862026;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=11862029;
 //BA.debugLineNum = 11862029;BA.debugLine="lbl.TextColor = cTextColors(i)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 };
RDebugUtils.currentLine=11862032;
 //BA.debugLineNum = 11862032;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11862033;
 //BA.debugLineNum = 11862033;BA.debugLine="lbl.Typeface = cTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=11862035;
 //BA.debugLineNum = 11862035;BA.debugLine="lbl.Typeface = cTypeFaces(i)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()));
 };
RDebugUtils.currentLine=11862038;
 //BA.debugLineNum = 11862038;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=11862040;
 //BA.debugLineNum = 11862040;BA.debugLine="lbl.SingleLine = cSingleLine";
_lbl.setSingleLine(__ref._csingleline /*boolean*/ );
RDebugUtils.currentLine=11862041;
 //BA.debugLineNum = 11862041;BA.debugLine="lbl.Tag = rc";
_lbl.setTag((Object)(_rc));
RDebugUtils.currentLine=11862042;
 //BA.debugLineNum = 11862042;BA.debugLine="lbls(i) = lbl";
_lbls[_i] = _lbl;
 }
};
RDebugUtils.currentLine=11862044;
 //BA.debugLineNum = 11862044;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=11862045;
 //BA.debugLineNum = 11862045;BA.debugLine="End Sub";
return null;
}
public String  _setpadding(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setpadding", false))
	 {return ((String) Debug.delegate(ba, "setpadding", new Object[] {_v,_left,_top,_right,_bottom}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
RDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="v.Padding = Array As Int (Left, Top, Right, Botto";
_v.setPadding(new int[]{_left,_top,_right,_bottom});
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="pnlTable = Base";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="cLeft = Base.Left";
__ref._cleft /*int*/  = _base.getLeft();
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="cTop = Base.Top";
__ref._ctop /*int*/  = _base.getTop();
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="cWidth = Base.Width";
__ref._cwidth /*int*/  = _base.getWidth();
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="cHeight = Base.Height";
__ref._cheight /*int*/  = _base.getHeight();
RDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Select Props.Get(\"TextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("TextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="cAlignment = Gravity.CENTER";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=10551312;
 //BA.debugLineNum = 10551312;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=10551316;
 //BA.debugLineNum = 10551316;BA.debugLine="Select Props.Get(\"HeaderTextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("HeaderTextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=10551318;
 //BA.debugLineNum = 10551318;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=10551320;
 //BA.debugLineNum = 10551320;BA.debugLine="cHeaderAlignment = Gravity.CENTER";
__ref._cheaderalignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=10551322;
 //BA.debugLineNum = 10551322;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=10551325;
 //BA.debugLineNum = 10551325;BA.debugLine="cLineWidth = DipToCurrent(Props.Get(\"LineWidth\"))";
__ref._clinewidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("LineWidth")))));
RDebugUtils.currentLine=10551327;
 //BA.debugLineNum = 10551327;BA.debugLine="mNumberOfColumns = Props.Get(\"NumberOfColumns\")";
__ref._mnumberofcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfColumns"))));
RDebugUtils.currentLine=10551328;
 //BA.debugLineNum = 10551328;BA.debugLine="mNumberOfFixedColumns = Props.Get(\"NumberOfFixedC";
__ref._mnumberoffixedcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfFixedColumns"))));
RDebugUtils.currentLine=10551329;
 //BA.debugLineNum = 10551329;BA.debugLine="mFirstColumnFixed = Props.Get(\"FirstColumnFixed\")";
__ref._mfirstcolumnfixed /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("FirstColumnFixed")));
RDebugUtils.currentLine=10551330;
 //BA.debugLineNum = 10551330;BA.debugLine="If mFirstColumnFixed = True And mNumberOfFixedCol";
if (__ref._mfirstcolumnfixed /*boolean*/ ==__c.True && __ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=10551331;
 //BA.debugLineNum = 10551331;BA.debugLine="mNumberOfFixedColumns = 1";
__ref._mnumberoffixedcolumns /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=10551333;
 //BA.debugLineNum = 10551333;BA.debugLine="mMultiSelect = Props.Get(\"MultiSelect\")";
__ref._mmultiselect /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("MultiSelect")));
RDebugUtils.currentLine=10551334;
 //BA.debugLineNum = 10551334;BA.debugLine="cSingleLine = Props.GetDefault(\"SingleLine\", True";
__ref._csingleline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SingleLine"),(Object)(__c.True)));
RDebugUtils.currentLine=10551335;
 //BA.debugLineNum = 10551335;BA.debugLine="mZeroSelection = Props.Get(\"ZeroSelection\")";
__ref._mzeroselection /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZeroSelection")));
RDebugUtils.currentLine=10551336;
 //BA.debugLineNum = 10551336;BA.debugLine="cHeaderColor = Props.Get(\"HeaderColor\")";
__ref._cheadercolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderColor"))));
RDebugUtils.currentLine=10551337;
 //BA.debugLineNum = 10551337;BA.debugLine="cTableColor = Props.Get(\"TableColor\")";
__ref._ctablecolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("TableColor"))));
RDebugUtils.currentLine=10551338;
 //BA.debugLineNum = 10551338;BA.debugLine="cHeaderTextColor = Props.Get(\"HeaderTextColor\")";
__ref._cheadertextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderTextColor"))));
RDebugUtils.currentLine=10551339;
 //BA.debugLineNum = 10551339;BA.debugLine="cTextColor = Props.Get(\"CellTextColor\")";
__ref._ctextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("CellTextColor"))));
RDebugUtils.currentLine=10551340;
 //BA.debugLineNum = 10551340;BA.debugLine="cRowColor1 = Props.Get(\"Row1Color\")";
__ref._crowcolor1 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row1Color"))));
RDebugUtils.currentLine=10551341;
 //BA.debugLineNum = 10551341;BA.debugLine="cRowColor2 = Props.Get(\"Row2Color\")";
__ref._crowcolor2 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row2Color"))));
RDebugUtils.currentLine=10551342;
 //BA.debugLineNum = 10551342;BA.debugLine="cSelectedRowColor = Props.Get(\"SelectedRowColor\")";
__ref._cselectedrowcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedRowColor"))));
RDebugUtils.currentLine=10551343;
 //BA.debugLineNum = 10551343;BA.debugLine="cSelectedCellColor = Props.Get(\"SelectedCellColor";
__ref._cselectedcellcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedCellColor"))));
RDebugUtils.currentLine=10551345;
 //BA.debugLineNum = 10551345;BA.debugLine="cTextSize = Props.Get(\"TextSize\")";
__ref._ctextsize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));
RDebugUtils.currentLine=10551347;
 //BA.debugLineNum = 10551347;BA.debugLine="cRowHeight = DipToCurrent(Props.Get(\"RowHeight\"))";
__ref._crowheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("RowHeight")))));
RDebugUtils.currentLine=10551348;
 //BA.debugLineNum = 10551348;BA.debugLine="cHeaderHeight = DipToCurrent(Props.Get(\"HeaderHei";
__ref._cheaderheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("HeaderHeight")))));
RDebugUtils.currentLine=10551349;
 //BA.debugLineNum = 10551349;BA.debugLine="cShowStatusLine = Props.Get(\"ShowStatusLine\")";
__ref._cshowstatusline /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowStatusLine")));
RDebugUtils.currentLine=10551350;
 //BA.debugLineNum = 10551350;BA.debugLine="cStatusLineHeight = DipToCurrent(Props.GetDefault";
__ref._cstatuslineheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("HeaderHeight"),(Object)(40)))));
RDebugUtils.currentLine=10551351;
 //BA.debugLineNum = 10551351;BA.debugLine="cSortColumn = Props.Get(\"SortColumn\")";
__ref._csortcolumn /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortColumn")));
RDebugUtils.currentLine=10551352;
 //BA.debugLineNum = 10551352;BA.debugLine="cSortRemoveAccents = Props.Get(\"SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortRemoveAccents")));
RDebugUtils.currentLine=10551353;
 //BA.debugLineNum = 10551353;BA.debugLine="cSortBitmapWidth = DipToCurrent(Props.Get(\"SortBi";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapWidth")))));
RDebugUtils.currentLine=10551354;
 //BA.debugLineNum = 10551354;BA.debugLine="cSortBitmapColor = Props.Get(\"SortBitmapColor\")";
__ref._csortbitmapcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapColor"))));
RDebugUtils.currentLine=10551356;
 //BA.debugLineNum = 10551356;BA.debugLine="mFastScroll = Props.GetDefault(\"FastScroll\", Fals";
__ref._mfastscroll /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScroll"),(Object)(__c.False)));
RDebugUtils.currentLine=10551357;
 //BA.debugLineNum = 10551357;BA.debugLine="mFastScrollMinItems = Props.GetDefault(\"FastScrol";
__ref._mfastscrollminitems /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollMinItems"),(Object)(50))));
RDebugUtils.currentLine=10551358;
 //BA.debugLineNum = 10551358;BA.debugLine="mFastScrollColumnIndex = Props.GetDefault(\"FastSc";
__ref._mfastscrollcolumnindex /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollColumnIndex"),(Object)(0))));
RDebugUtils.currentLine=10551359;
 //BA.debugLineNum = 10551359;BA.debugLine="mFastScrollShowLabel = Props.GetDefault(\"FastScro";
__ref._mfastscrollshowlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollShowLabel"),(Object)(__c.True)));
RDebugUtils.currentLine=10551360;
 //BA.debugLineNum = 10551360;BA.debugLine="mFastScrollFixedLabel = Props.GetDefault(\"FastScr";
__ref._mfastscrollfixedlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollFixedLabel"),(Object)(__c.False)));
RDebugUtils.currentLine=10551361;
 //BA.debugLineNum = 10551361;BA.debugLine="mFastScrollLabelMaxChars = Props.GetDefault(\"Fast";
__ref._mfastscrolllabelmaxchars /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelMaxChars"),(Object)(10))));
RDebugUtils.currentLine=10551362;
 //BA.debugLineNum = 10551362;BA.debugLine="mFastScrollLabelWidth = DipToCurrent(Props.GetDef";
__ref._mfastscrolllabelwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelWidth"),(Object)(__c.DipToCurrent((int) (150)))))));
RDebugUtils.currentLine=10551363;
 //BA.debugLineNum = 10551363;BA.debugLine="mFastScrollLabelHeight = DipToCurrent(Props.GetDe";
__ref._mfastscrolllabelheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelHeight"),(Object)(__c.DipToCurrent((int) (30)))))));
RDebugUtils.currentLine=10551364;
 //BA.debugLineNum = 10551364;BA.debugLine="mSortCaseInsensitive = Props.GetDefault(\"SortCase";
__ref._msortcaseinsensitive /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SortCaseInsensitive"),(Object)(__c.False)));
RDebugUtils.currentLine=10551365;
 //BA.debugLineNum = 10551365;BA.debugLine="mMultiColumnSort = Props.GetDefault(\"MultiColumnS";
__ref._mmulticolumnsort /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MultiColumnSort"),(Object)(__c.False)));
RDebugUtils.currentLine=10551367;
 //BA.debugLineNum = 10551367;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=10551368;
 //BA.debugLineNum = 10551368;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub DrawFastScrollCursor";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Private pthArrow As Path";
_ptharrow = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="Private cvsFSc As Canvas";
_cvsfsc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="Private x1, x2, x3, y1, y2, dd, rr As Int";
_x1 = 0;
_x2 = 0;
_x3 = 0;
_y1 = 0;
_y2 = 0;
_dd = 0;
_rr = 0;
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Private rct As Rect";
_rct = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="rr = 7dip";
_rr = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="cvsFSc.Initialize(pnlFastScrollCursor)";
_cvsfsc.Initialize((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="rct.Initialize(0, 0, FScCursorWidth, FScCursorHei";
_rct.Initialize((int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="cvsFSc.DrawRect(rct, Colors.Transparent, True, 1d";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__c.Colors.Transparent,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944524;
 //BA.debugLineNum = 10944524;BA.debugLine="cvsFSc.DrawCircle(rr, rr, rr, FScCursorCol1, True";
_cvsfsc.DrawCircle((float) (_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944525;
 //BA.debugLineNum = 10944525;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, rr, rr, FS";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944526;
 //BA.debugLineNum = 10944526;BA.debugLine="cvsFSc.DrawCircle(rr, FScCursorHeight - rr, rr, F";
_cvsfsc.DrawCircle((float) (_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944527;
 //BA.debugLineNum = 10944527;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, FScCursorH";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944529;
 //BA.debugLineNum = 10944529;BA.debugLine="rct.Initialize(rr, 0, FScCursorWidth - rr, rr)";
_rct.Initialize(_rr,(int) (0),(int) (__ref._fsccursorwidth /*int*/ -_rr),_rr);
RDebugUtils.currentLine=10944530;
 //BA.debugLineNum = 10944530;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944531;
 //BA.debugLineNum = 10944531;BA.debugLine="rct.Initialize(0, rr, FScCursorWidth, FScCursorHe";
_rct.Initialize((int) (0),_rr,__ref._fsccursorwidth /*int*/ ,(int) (__ref._fsccursorheight /*int*/ -_rr));
RDebugUtils.currentLine=10944532;
 //BA.debugLineNum = 10944532;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944533;
 //BA.debugLineNum = 10944533;BA.debugLine="rct.Initialize(rr, FScCursorHeight - rr, FScCurso";
_rct.Initialize(_rr,(int) (__ref._fsccursorheight /*int*/ -_rr),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=10944534;
 //BA.debugLineNum = 10944534;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944536;
 //BA.debugLineNum = 10944536;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 - 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944537;
 //BA.debugLineNum = 10944537;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2, FScCur";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944538;
 //BA.debugLineNum = 10944538;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 + 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944540;
 //BA.debugLineNum = 10944540;BA.debugLine="dd = 7dip";
_dd = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=10944541;
 //BA.debugLineNum = 10944541;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=10944542;
 //BA.debugLineNum = 10944542;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=10944543;
 //BA.debugLineNum = 10944543;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=10944544;
 //BA.debugLineNum = 10944544;BA.debugLine="y2 = dd";
_y2 = _dd;
RDebugUtils.currentLine=10944545;
 //BA.debugLineNum = 10944545;BA.debugLine="y1 = y2 + dd";
_y1 = (int) (_y2+_dd);
RDebugUtils.currentLine=10944546;
 //BA.debugLineNum = 10944546;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=10944547;
 //BA.debugLineNum = 10944547;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=10944548;
 //BA.debugLineNum = 10944548;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=10944549;
 //BA.debugLineNum = 10944549;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944551;
 //BA.debugLineNum = 10944551;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=10944552;
 //BA.debugLineNum = 10944552;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=10944553;
 //BA.debugLineNum = 10944553;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=10944554;
 //BA.debugLineNum = 10944554;BA.debugLine="y2 = FScCursorHeight - dd";
_y2 = (int) (__ref._fsccursorheight /*int*/ -_dd);
RDebugUtils.currentLine=10944555;
 //BA.debugLineNum = 10944555;BA.debugLine="y1 = y2 - dd";
_y1 = (int) (_y2-_dd);
RDebugUtils.currentLine=10944556;
 //BA.debugLineNum = 10944556;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=10944557;
 //BA.debugLineNum = 10944557;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=10944558;
 //BA.debugLineNum = 10944558;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=10944559;
 //BA.debugLineNum = 10944559;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10944560;
 //BA.debugLineNum = 10944560;BA.debugLine="pnlFastScrollCursor.Invalidate";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=10944561;
 //BA.debugLineNum = 10944561;BA.debugLine="End Sub";
return "";
}
public String  _fastscrolltimer_tick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "fastscrolltimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fastscrolltimer_tick", null));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub FastScrollTimer_Tick";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="FScTimer.Enabled = False";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="End Sub";
return "";
}
public boolean  _getallowselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getallowselection", false))
	 {return ((Boolean) Debug.delegate(ba, "getallowselection", null));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub getAllowSelection As Boolean";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Return cAllowSelection";
if (true) return __ref._callowselection /*boolean*/ ;
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return false;
}
public int  _getcellalignment(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcellalignment", false))
	 {return ((Integer) Debug.delegate(ba, "getcellalignment", null));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub getCellAlignment As Int";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Return cAlignment";
if (true) return __ref._calignment /*int*/ ;
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return 0;
}
public int[]  _getcolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumncolors", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumncolors", null));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub GetColumnColors As Int()";
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Return cColumnColors";
if (true) return __ref._ccolumncolors /*int[]*/ ;
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="End Sub";
return null;
}
public String  _getcolumndatatype(b4a.example.ef.table __ref,int _column) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "getcolumndatatype", new Object[] {_column}));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub GetColumnDataType(Column As Int) As Str";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="Return cColumnDataType(Column)";
if (true) return __ref._ccolumndatatype /*String[]*/ [_column];
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="End Sub";
return "";
}
public String[]  _getcolumndatatypes(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatypes", false))
	 {return ((String[]) Debug.delegate(ba, "getcolumndatatypes", null));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub GetColumnDataTypes As String()";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Return cColumnDataType";
if (true) return __ref._ccolumndatatype /*String[]*/ ;
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="End Sub";
return null;
}
public int[]  _getcolumnwidths(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumnwidths", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumnwidths", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub GetColumnWidths As Int()";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Return SavedWidths";
if (true) return __ref._savedwidths /*int[]*/ ;
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
RDebugUtils.currentLine=21430275;
 //BA.debugLineNum = 21430275;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=21430276;
 //BA.debugLineNum = 21430276;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=21430277;
 //BA.debugLineNum = 21430277;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=21430278;
 //BA.debugLineNum = 21430278;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=21430280;
 //BA.debugLineNum = 21430280;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
RDebugUtils.currentLine=21430282;
 //BA.debugLineNum = 21430282;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
RDebugUtils.currentLine=21430283;
 //BA.debugLineNum = 21430283;BA.debugLine="Return Colors.Black";
if (true) return __c.Colors.Black;
 }else {
RDebugUtils.currentLine=21430285;
 //BA.debugLineNum = 21430285;BA.debugLine="Return Colors.White";
if (true) return __c.Colors.White;
 };
RDebugUtils.currentLine=21430287;
 //BA.debugLineNum = 21430287;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscroll", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscroll", null));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Public Sub getFastScroll As Boolean";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="Return mFastScroll";
if (true) return __ref._mfastscroll /*boolean*/ ;
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrollcolumnindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollcolumnindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollcolumnindex", null));}
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub getFastScrollColumnIndex As Int";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Return mFastScrollColumnIndex";
if (true) return __ref._mfastscrollcolumnindex /*int*/ ;
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollfixedlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollfixedlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollfixedlabel", null));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Public Sub getFastScrollFixedLabel As Boolean";
RDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="Return mFastScrollFixedLabel";
if (true) return __ref._mfastscrollfixedlabel /*boolean*/ ;
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrolllabelheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelheight", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelheight", null));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Public Sub getFastScrollLabelHeight As Int";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelmaxchars(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelmaxchars", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelmaxchars", null));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub getFastScrollLabelMaxChars As Int";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Return mFastScrollLabelMaxChars";
if (true) return __ref._mfastscrolllabelmaxchars /*int*/ ;
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelwidth", null));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub getFastScrollLabelWidth As Int";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrollminitems(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollminitems", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollminitems", null));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub getFastScrollMinItems As Int";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Return mFastScrollMinItems";
if (true) return __ref._mfastscrollminitems /*int*/ ;
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollshowlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollshowlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollshowlabel", null));}
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub getFastScrollShowLabel As Boolean";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Return mFastScrollShowLabel";
if (true) return __ref._mfastscrollshowlabel /*boolean*/ ;
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="End Sub";
return false;
}
public boolean  _getfirstcolumnfixed(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfirstcolumnfixed", false))
	 {return ((Boolean) Debug.delegate(ba, "getfirstcolumnfixed", null));}
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub getFirstColumnFixed As Boolean";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Return mFirstColumnFixed";
if (true) return __ref._mfirstcolumnfixed /*boolean*/ ;
RDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="End Sub";
return false;
}
public int  _getheadercolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Return cHeaderColor";
if (true) return __ref._cheadercolor /*int*/ ;
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadercolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadercolors", null));}
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Public Sub GetHeaderColors As Int()";
RDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="Return cHeaderColors";
if (true) return __ref._cheadercolors /*int[]*/ ;
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
return null;
}
public int  _getheaderheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheaderheight", null));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Public Sub getHeaderHeight As Int";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Return cHeaderHeight";
if (true) return __ref._cheaderheight /*int*/ ;
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub getHeaderPanel As Panel";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Return Header";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return null;
}
public int  _getheadertextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadertextcolor", null));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub getHeaderTextColor As Int";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Return cHeaderTextColor";
if (true) return __ref._cheadertextcolor /*int*/ ;
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadertextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadertextcolors", null));}
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Return cHeaderTextColors";
if (true) return __ref._cheadertextcolors /*int[]*/ ;
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _getheadertypeface(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertypeface", false))
	 {return ((anywheresoftware.b4a.keywords.constants.TypefaceWrapper) Debug.delegate(ba, "getheadertypeface", null));}
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub getHeaderTypeFace As Typeface";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Return cHeaderTypeFace";
if (true) return __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="End Sub";
return null;
}
public int  _getheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Return pnlTable.Height";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return 0;
}
public int  _getinnertotalwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getinnertotalwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getinnertotalwidth", null));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub getInnerTotalWidth As Int";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="Return Header.Width";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
 }else {
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="Return HeaderFirst.Width + Header.Width";
if (true) return (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=14483462;
 //BA.debugLineNum = 14483462;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="lbls = CreateNewLabels";
_lbls = __ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
 };
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=11796491;
 //BA.debugLineNum = 11796491;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.example.ef.table._rowcol)(_lbls[_i].getTag());
RDebugUtils.currentLine=11796492;
 //BA.debugLineNum = 11796492;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
RDebugUtils.currentLine=11796494;
 //BA.debugLineNum = 11796494;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=11796495;
 //BA.debugLineNum = 11796495;BA.debugLine="End Sub";
return null;
}
public int  _getleft(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Return pnlTable.Left";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return 0;
}
public int  _getlinewidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getlinewidth", false))
	 {return ((Integer) Debug.delegate(ba, "getlinewidth", null));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub getLineWidth As Int";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Return cLineWidth";
if (true) return __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return 0;
}
public boolean  _getmulticolumnsort(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmulticolumnsort", false))
	 {return ((Boolean) Debug.delegate(ba, "getmulticolumnsort", null));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub getMultiColumnSort As Boolean";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Return mMultiColumnSort";
if (true) return __ref._mmulticolumnsort /*boolean*/ ;
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="End Sub";
return false;
}
public boolean  _getmultiselect(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmultiselect", false))
	 {return ((Boolean) Debug.delegate(ba, "getmultiselect", null));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub getMultiSelect As Boolean";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Return mMultiSelect";
if (true) return __ref._mmultiselect /*boolean*/ ;
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return false;
}
public int  _getnumberofcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofcolumns", null));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub getNumberOfColumns As Int";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Return mNumberOfColumns";
if (true) return __ref._mnumberofcolumns /*int*/ ;
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberoffixedcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberoffixedcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberoffixedcolumns", null));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub getNumberOfFixedColumns As Int";
RDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Return mNumberOfFixedColumns";
if (true) return __ref._mnumberoffixedcolumns /*int*/ ;
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberofrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofrows", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofrows", null));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub getNumberOfRows As Int";
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Return pnlTable";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="End Sub";
return null;
}
public int  _getrowcolor1(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor1", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor1", null));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Public Sub getRowColor1 As Int";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Return cRowColor1";
if (true) return __ref._crowcolor1 /*int*/ ;
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolor2(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor2", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor2", null));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub getRowColor2 As Int";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Return cRowColor2";
if (true) return __ref._crowcolor2 /*int*/ ;
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolorn", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub GetRowColorN(Row As Int) As Int";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Return lstRowColors.Get(lstRowColorIndexes.Get(Ro";
if (true) return (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2))));
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="End Sub";
return 0;
}
public int  _getrowheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowheight", false))
	 {return ((Integer) Debug.delegate(ba, "getrowheight", null));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub getRowHeight As Int";
RDebugUtils.currentLine=17760257;
 //BA.debugLineNum = 17760257;BA.debugLine="Return cRowHeight";
if (true) return __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcellcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcellcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcellcolor", null));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub getSelectedCellColor As Int";
RDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Return cSelectedCellColor";
if (true) return __ref._cselectedcellcolor /*int*/ ;
RDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcelltextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcelltextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcelltextcolor", null));}
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Public Sub getSelectedCellTextColor As Int";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Return cSelectedCellTextColor";
if (true) return __ref._cselectedcelltextcolor /*int*/ ;
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedrowcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowcolor", null));}
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Public Sub getSelectedRowColor As Int";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Return cSelectedRowColor";
if (true) return __ref._cselectedrowcolor /*int*/ ;
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrows", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getselectedrows", null));}
anywheresoftware.b4a.objects.collections.List _sr = null;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub getSelectedRows As List";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Dim sr As List";
_sr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="sr.Initialize";
_sr.Initialize();
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="sr.AddAll(SelectedRows)";
_sr.AddAll(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Return sr";
if (true) return _sr;
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="End Sub";
return null;
}
public int  _getselectedrowtextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowtextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowtextcolor", null));}
RDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Public Sub getSelectedRowTextColor As Int";
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Return cSelectedRowTextColor";
if (true) return __ref._cselectedrowtextcolor /*int*/ ;
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="End Sub";
return 0;
}
public boolean  _getshowstatusline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getshowstatusline", false))
	 {return ((Boolean) Debug.delegate(ba, "getshowstatusline", null));}
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Public Sub getShowStatusLine As Boolean";
RDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="Return cShowStatusLine";
if (true) return __ref._cshowstatusline /*boolean*/ ;
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="End Sub";
return false;
}
public boolean  _getsingleline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsingleline", false))
	 {return ((Boolean) Debug.delegate(ba, "getsingleline", null));}
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub getSingleLine As Boolean";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Return cSingleLine";
if (true) return __ref._csingleline /*boolean*/ ;
RDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="End Sub";
return false;
}
public long  _getsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Long) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub getSize As Long";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Return Data.Size";
if (true) return (long) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="End Sub";
return 0L;
}
public int  _getsortbitmapcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapcolor", null));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub getSortBitmapColor As Int";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Return cSortBitmapColor";
if (true) return __ref._csortbitmapcolor /*int*/ ;
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="End Sub";
return 0;
}
public int  _getsortbitmapwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapwidth", null));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub getSortBitmapWidth As Int";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Return cSortBitmapWidth";
if (true) return __ref._csortbitmapwidth /*int*/ ;
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="End Sub";
return 0;
}
public boolean  _getsortcaseinsensitive(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcaseinsensitive", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcaseinsensitive", null));}
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub getSortCaseInsensitive As Boolean";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Return mSortCaseInsensitive";
if (true) return __ref._msortcaseinsensitive /*boolean*/ ;
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortcolumn(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcolumn", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcolumn", null));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub getSortColumn As Boolean";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Return cSortColumn";
if (true) return __ref._csortcolumn /*boolean*/ ;
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortremoveaccents(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortremoveaccents", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortremoveaccents", null));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub getSortRemoveAccents As Boolean";
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Return cSortRemoveAccents";
if (true) return __ref._csortremoveaccents /*boolean*/ ;
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="End Sub";
return false;
}
public int  _getstatuslineheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getstatuslineheight", false))
	 {return ((Integer) Debug.delegate(ba, "getstatuslineheight", null));}
RDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub getStatusLineHeight As Int";
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Return cStatusLineHeight";
if (true) return __ref._cstatuslineheight /*int*/ ;
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="End Sub";
return 0;
}
public int  _gettablecolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettablecolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettablecolor", null));}
RDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub getTableColor As Int";
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Return cTableColor";
if (true) return __ref._ctablecolor /*int*/ ;
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettag", false))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Public Sub getTag As Object";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Return pnlTable.Tag";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="End Sub";
return null;
}
public int  _gettextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Return cTextColor";
if (true) return __ref._ctextcolor /*int*/ ;
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return 0;
}
public int[]  _gettextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "gettextcolors", null));}
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub GetTextColors As Int()";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Return cTextColors";
if (true) return __ref._ctextcolors /*int[]*/ ;
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return null;
}
public float  _gettextsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextsize", false))
	 {return ((Float) Debug.delegate(ba, "gettextsize", null));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub getTextSize As Float";
RDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Return cTextSize";
if (true) return __ref._ctextsize /*float*/ ;
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Return pnlTable.Top";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="End Sub";
return 0;
}
public int  _gettoprowindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettoprowindex", false))
	 {return ((Integer) Debug.delegate(ba, "gettoprowindex", null));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Public Sub getTopRowIndex As Int";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Return SV2.VerticalScrollPosition / cRowHeight";
if (true) return (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="End Sub";
return 0;
}
public boolean  _getusecolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getusecolumncolors", false))
	 {return ((Boolean) Debug.delegate(ba, "getusecolumncolors", null));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub getUseColumnColors As Boolean";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Return cUseColumnColors";
if (true) return __ref._cusecolumncolors /*boolean*/ ;
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="End Sub";
return false;
}
public String  _getvalue(b4a.example.ef.table __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((String) Debug.delegate(ba, "getvalue", new Object[] {_col,_row}));}
String[] _values = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As Str";
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim rowData() As String  = Data.Get(Row) ' will t";
_rowdata = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Dim tmp(mNumberOfColumns) As String";
_tmp = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_tmp,"");
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="For i=0 To mNumberOfColumns-1 ' copy the array";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="tmp(i) =  rowData(i)";
_tmp[_i] = _rowdata[_i];
 }
};
RDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="Return tmp";
if (true) return _tmp;
RDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Return pnlTable.Visible";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Return pnlTable.Width";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub Header_Click";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="If Data.Size < 2 Then Return";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="If cSortColumn Then 'this is set in the designer";
if (__ref._csortcolumn /*boolean*/ ) { 
RDebugUtils.currentLine=15073296;
 //BA.debugLineNum = 15073296;BA.debugLine="Dim dir As Int = 0 ' unsorted";
_dir = (int) (0);
RDebugUtils.currentLine=15073297;
 //BA.debugLineNum = 15073297;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
if ((__ref._sortedcol /*int*/ ==_col)) { 
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="Select sortingDir";
switch (BA.switchObjectToInt(__ref._sortingdir /*int*/ ,(int) (0),(int) (1),(int) (-1))) {
case 0: {
RDebugUtils.currentLine=15073299;
 //BA.debugLineNum = 15073299;BA.debugLine="Case 0: dir = -1 ' going up";
_dir = (int) (-1);
 break; }
case 1: {
RDebugUtils.currentLine=15073300;
 //BA.debugLineNum = 15073300;BA.debugLine="Case 1: dir = -1";
_dir = (int) (-1);
 break; }
case 2: {
RDebugUtils.currentLine=15073301;
 //BA.debugLineNum = 15073301;BA.debugLine="Case -1: dir = 1";
_dir = (int) (1);
 break; }
}
;
 }else {
RDebugUtils.currentLine=15073304;
 //BA.debugLineNum = 15073304;BA.debugLine="dir = -1 ' start with going up";
_dir = (int) (-1);
 };
RDebugUtils.currentLine=15073307;
 //BA.debugLineNum = 15073307;BA.debugLine="bSorted = SortTable2(col, dir <= 0)";
_bsorted = __ref._sorttable2 /*boolean*/ (null,_col,_dir<=0);
RDebugUtils.currentLine=15073309;
 //BA.debugLineNum = 15073309;BA.debugLine="If bSorted Then";
if (_bsorted) { 
RDebugUtils.currentLine=15073310;
 //BA.debugLineNum = 15073310;BA.debugLine="showHeaderSorting(col, dir)";
__ref._showheadersorting /*String*/ (null,_col,_dir);
RDebugUtils.currentLine=15073311;
 //BA.debugLineNum = 15073311;BA.debugLine="sortedCol = col 'only change if a sort actually";
__ref._sortedcol /*int*/  = _col;
RDebugUtils.currentLine=15073312;
 //BA.debugLineNum = 15073312;BA.debugLine="sortingDir = dir 'only change if a sort actuall";
__ref._sortingdir /*int*/  = _dir;
 }else {
RDebugUtils.currentLine=15073314;
 //BA.debugLineNum = 15073314;BA.debugLine="showHeaderSorting(col, 2) 'no sort done so rect";
__ref._showheadersorting /*String*/ (null,_col,(int) (2));
 };
 };
RDebugUtils.currentLine=15073318;
 //BA.debugLineNum = 15073318;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=15073319;
 //BA.debugLineNum = 15073319;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(_col));
 };
RDebugUtils.currentLine=15073322;
 //BA.debugLineNum = 15073322;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub SortTable2(Col As Int, bAscending As Bo";
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="Dim arrRow() As String";
_arrrow = new String[(int) (0)];
java.util.Arrays.fill(_arrrow,"");
RDebugUtils.currentLine=22609925;
 //BA.debugLineNum = 22609925;BA.debugLine="Dim bDoMultiColumnSort As Boolean";
_bdomulticolumnsort = false;
RDebugUtils.currentLine=22609926;
 //BA.debugLineNum = 22609926;BA.debugLine="Dim bValidArrSortIndex As Boolean";
_bvalidarrsortindex = false;
RDebugUtils.currentLine=22609927;
 //BA.debugLineNum = 22609927;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=22609929;
 //BA.debugLineNum = 22609929;BA.debugLine="If Col <> iPreviousSortColumn Then";
if (_col!=__ref._iprevioussortcolumn /*int*/ ) { 
RDebugUtils.currentLine=22609930;
 //BA.debugLineNum = 22609930;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=22609931;
 //BA.debugLineNum = 22609931;BA.debugLine="arrDataSorted(Col) = False";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.False;
 };
RDebugUtils.currentLine=22609934;
 //BA.debugLineNum = 22609934;BA.debugLine="iUB = Data.Size - 1";
_iub = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=22609941;
 //BA.debugLineNum = 22609941;BA.debugLine="If bDataTempDone = False Then";
if (__ref._bdatatempdone /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22609942;
 //BA.debugLineNum = 22609942;BA.debugLine="DataTemp.Initialize";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=22609943;
 //BA.debugLineNum = 22609943;BA.debugLine="For i = 0 To iUB";
{
final int step14 = 1;
final int limit14 = _iub;
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=22609944;
 //BA.debugLineNum = 22609944;BA.debugLine="DataTemp.Add(Data.Get(i))";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Add(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=22609946;
 //BA.debugLineNum = 22609946;BA.debugLine="bDataTempDone = True";
__ref._bdatatempdone /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=22609952;
 //BA.debugLineNum = 22609952;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=22609953;
 //BA.debugLineNum = 22609953;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("322609953","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=22609954;
 //BA.debugLineNum = 22609954;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=22609956;
 //BA.debugLineNum = 22609956;BA.debugLine="Dim arrColLong(Data.Size) As Long";
_arrcollong = new long[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=22609957;
 //BA.debugLineNum = 22609957;BA.debugLine="For i = 0 To iUB";
{
final int step24 = 1;
final int limit24 = _iub;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=22609958;
 //BA.debugLineNum = 22609958;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=22609959;
 //BA.debugLineNum = 22609959;BA.debugLine="Try";
try {RDebugUtils.currentLine=22609960;
 //BA.debugLineNum = 22609960;BA.debugLine="arrColLong(i) = arrRow(Col)";
__ref._arrcollong /*long[]*/ [_i] = (long)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e29) {
			ba.setLastException(e29); };
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=22609966;
 //BA.debugLineNum = 22609966;BA.debugLine="Dim arrColDouble(Data.Size) As Double";
_arrcoldouble = new double[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=22609967;
 //BA.debugLineNum = 22609967;BA.debugLine="For i = 0 To iUB";
{
final int step33 = 1;
final int limit33 = _iub;
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=22609968;
 //BA.debugLineNum = 22609968;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=22609969;
 //BA.debugLineNum = 22609969;BA.debugLine="Try";
try {RDebugUtils.currentLine=22609970;
 //BA.debugLineNum = 22609970;BA.debugLine="arrColDouble(i) = arrRow(Col)";
__ref._arrcoldouble /*double[]*/ [_i] = (double)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e38) {
			ba.setLastException(e38); };
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=22609976;
 //BA.debugLineNum = 22609976;BA.debugLine="Dim arrColString(Data.size) As String";
_arrcolstring = new String[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=22609977;
 //BA.debugLineNum = 22609977;BA.debugLine="For i = 0 To iUB";
{
final int step42 = 1;
final int limit42 = _iub;
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=22609978;
 //BA.debugLineNum = 22609978;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=22609979;
 //BA.debugLineNum = 22609979;BA.debugLine="Try";
try {RDebugUtils.currentLine=22609980;
 //BA.debugLineNum = 22609980;BA.debugLine="arrColString(i) = arrRow(Col)";
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
RDebugUtils.currentLine=22609992;
 //BA.debugLineNum = 22609992;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=22609993;
 //BA.debugLineNum = 22609993;BA.debugLine="bDoMultiColumnSort = mMultiColumnSort And bValidA";
_bdomulticolumnsort = __ref._mmulticolumnsort /*boolean*/  && _bvalidarrsortindex && __ref._mnumberofcolumns /*int*/ >1;
RDebugUtils.currentLine=22609998;
 //BA.debugLineNum = 22609998;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=22609999;
 //BA.debugLineNum = 22609999;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("322609999","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=22610000;
 //BA.debugLineNum = 22610000;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=22610003;
 //BA.debugLineNum = 22610003;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=22610004;
 //BA.debugLineNum = 22610004;BA.debugLine="arrSortIndex = SortOMLongIDX2(arrColLong, arr";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx2 /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=22610006;
 //BA.debugLineNum = 22610006;BA.debugLine="arrSortIndex = SortOMLongIDX(arrColLong, True";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 2: {
RDebugUtils.currentLine=22610010;
 //BA.debugLineNum = 22610010;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=22610011;
 //BA.debugLineNum = 22610011;BA.debugLine="arrSortIndex = SortOMDoubleIDX2(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx2 /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=22610013;
 //BA.debugLineNum = 22610013;BA.debugLine="arrSortIndex = SortOMDoubleIDX(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 3: {
RDebugUtils.currentLine=22610017;
 //BA.debugLineNum = 22610017;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=22610018;
 //BA.debugLineNum = 22610018;BA.debugLine="arrSortIndex = SortOMStringIDX2(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx2 /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=22610020;
 //BA.debugLineNum = 22610020;BA.debugLine="arrSortIndex = SortOMStringIDX(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 };
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=22610024;
 //BA.debugLineNum = 22610024;BA.debugLine="Dim arrSortIndex(1) As Int";
_arrsortindex = new int[(int) (1)];
;
RDebugUtils.currentLine=22610025;
 //BA.debugLineNum = 22610025;BA.debugLine="arrSortIndex(0) = -1";
__ref._arrsortindex /*int[]*/ [(int) (0)] = (int) (-1);
 break; }
}
;
RDebugUtils.currentLine=22610028;
 //BA.debugLineNum = 22610028;BA.debugLine="arrDataSorted(Col) = True";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.True;
RDebugUtils.currentLine=22610029;
 //BA.debugLineNum = 22610029;BA.debugLine="mapSortingIndexes.Put(Col, arrSortIndex)";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_col),(Object)(__ref._arrsortindex /*int[]*/ ));
 }else {
RDebugUtils.currentLine=22610031;
 //BA.debugLineNum = 22610031;BA.debugLine="arrSortIndex = mapSortingIndexes.Get(Col) 'retri";
__ref._arrsortindex /*int[]*/  = (int[])(__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_col)));
 };
RDebugUtils.currentLine=22610034;
 //BA.debugLineNum = 22610034;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=22610042;
 //BA.debugLineNum = 22610042;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=22610044;
 //BA.debugLineNum = 22610044;BA.debugLine="If bAscending = False And bValidArrSortIndex Then";
if (_bascending==__c.False && _bvalidarrsortindex) { 
RDebugUtils.currentLine=22610045;
 //BA.debugLineNum = 22610045;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T")) {
case 0: 
case 1: {
RDebugUtils.currentLine=22610047;
 //BA.debugLineNum = 22610047;BA.debugLine="arrSortIndex = ReverseIndexLong(arrColLong, ar";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexlong /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 2: {
RDebugUtils.currentLine=22610049;
 //BA.debugLineNum = 22610049;BA.debugLine="arrSortIndex = ReverseIndexDouble(arrColDouble";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexdouble /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=22610051;
 //BA.debugLineNum = 22610051;BA.debugLine="arrSortIndex = ReverseIndexString(arrColString";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexstring /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
}
;
 };
RDebugUtils.currentLine=22610058;
 //BA.debugLineNum = 22610058;BA.debugLine="If arrSortIndex(0) > -1 Then 'so don't move rows";
if (__ref._arrsortindex /*int[]*/ [(int) (0)]>-1) { 
RDebugUtils.currentLine=22610059;
 //BA.debugLineNum = 22610059;BA.debugLine="For i = 0 To iUB";
{
final int step97 = 1;
final int limit97 = _iub;
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
RDebugUtils.currentLine=22610060;
 //BA.debugLineNum = 22610060;BA.debugLine="Data.Set(i, DataTemp.Get(arrSortIndex(i)))";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._arrsortindex /*int[]*/ [_i]));
 }
};
RDebugUtils.currentLine=22610062;
 //BA.debugLineNum = 22610062;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=22610063;
 //BA.debugLineNum = 22610063;BA.debugLine="bSorted = True";
_bsorted = __c.True;
 };
RDebugUtils.currentLine=22610066;
 //BA.debugLineNum = 22610066;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=22610067;
 //BA.debugLineNum = 22610067;BA.debugLine="bPreviousSortAscending = bAscending 'not used for";
__ref._bprevioussortascending /*boolean*/  = _bascending;
RDebugUtils.currentLine=22610069;
 //BA.debugLineNum = 22610069;BA.debugLine="Return bSorted";
if (true) return _bsorted;
RDebugUtils.currentLine=22610071;
 //BA.debugLineNum = 22610071;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub showHeaderSorting(col As Int, dir As In";
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="Dim L As Int ' calculate left";
_l = 0;
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Dim t As Int ' calculate top";
_t = 0;
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Dim View As View";
_view = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="Dim ParentView As Panel";
_parentview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="pnlSortingView.RemoveView";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=15138827;
 //BA.debugLineNum = 15138827;BA.debugLine="If col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="View = HeaderFirst.GetView(col)";
_view = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=15138829;
 //BA.debugLineNum = 15138829;BA.debugLine="ParentView = HeaderFirst";
_parentview = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 }else {
RDebugUtils.currentLine=15138831;
 //BA.debugLineNum = 15138831;BA.debugLine="View = Header.GetView(col - mNumberOfFixedColum";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ ));
RDebugUtils.currentLine=15138832;
 //BA.debugLineNum = 15138832;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
 }else {
RDebugUtils.currentLine=15138835;
 //BA.debugLineNum = 15138835;BA.debugLine="View = Header.GetView(col)";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=15138836;
 //BA.debugLineNum = 15138836;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
RDebugUtils.currentLine=15138839;
 //BA.debugLineNum = 15138839;BA.debugLine="L = View.Left + View.Width - cSortBitmapWidth - 2";
_l = (int) (_view.getLeft()+_view.getWidth()-__ref._csortbitmapwidth /*int*/ -__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=15138841;
 //BA.debugLineNum = 15138841;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
if ((_dir==0)) { 
if (true) return "";};
RDebugUtils.currentLine=15138843;
 //BA.debugLineNum = 15138843;BA.debugLine="Select Case dir";
switch (BA.switchObjectToInt(_dir,(int) (-1),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=15138845;
 //BA.debugLineNum = 15138845;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpDes)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=15138846;
 //BA.debugLineNum = 15138846;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 1: {
RDebugUtils.currentLine=15138848;
 //BA.debugLineNum = 15138848;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpAsc)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=15138849;
 //BA.debugLineNum = 15138849;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 2: {
RDebugUtils.currentLine=15138851;
 //BA.debugLineNum = 15138851;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpEqual)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=15138852;
 //BA.debugLineNum = 15138852;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
}
;
RDebugUtils.currentLine=15138855;
 //BA.debugLineNum = 15138855;BA.debugLine="ParentView.AddView(pnlSortingView, L, t, cSortBit";
_parentview.AddView((android.view.View)(__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_l,_t,__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=15138857;
 //BA.debugLineNum = 15138857;BA.debugLine="End Sub";
return "";
}
public String  _header_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "header_longclick", false))
	 {return ((String) Debug.delegate(ba, "header_longclick", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Private Sub Header_LongClick";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderLong";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick")) { 
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderLongCli";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick",(Object)(_col));
 };
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="End Sub";
return "";
}
public String  _hidecol(b4a.example.ef.table __ref,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hidecol", false))
	 {return ((String) Debug.delegate(ba, "hidecol", new Object[] {_col}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub hideCol(col As Int)";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="For i = 0 To SavedWidths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="tmpWidths(col) = 0	'???";
_tmpwidths[_col] = (int) (0);
RDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=13762568;
 //BA.debugLineNum = 13762568;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hiderow", false))
	 {return ((String) Debug.delegate(ba, "hiderow", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub HideRow (Row As Int)";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="visibleRows.Remove(Row)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_row));
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="LabelsCache.Add(lbls)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lbls));
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="End Sub";
return "";
}
public String  _initfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initfastscroll", false))
	 {return ((String) Debug.delegate(ba, "initfastscroll", null));}
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub InitFastScroll";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="pnlFastScroll.Top = SV2.Top";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop());
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="pnlFastScroll.Height = SV2.Height";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="FastScrollHeight = pnlFastScroll.Height - pnlFast";
__ref._fastscrollheight /*int*/  = (int) (__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="pnlFastScrollCursor.Top = SV2.VerticalScrollPosit";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()*__ref._fscscale /*double*/ ));
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight - m";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="DrawFastScrollCursor";
__ref._drawfastscrollcursor /*String*/ (null);
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.table __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="cEventName = EventName";
__ref._ceventname /*String*/  = _eventname;
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="cCallBack = CallBack";
__ref._ccallback /*Object*/  = _callback;
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="cSortBitmapWidth = 10dip";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="cSortBitmapColor = Colors.Yellow";
__ref._csortbitmapcolor /*int*/  = __c.Colors.Yellow;
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub InitializeSortingBitmaps";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="Private pthAsc, pthDes, pthEqual As Path";
_pthasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="cSortBitmapHeight = cSortBitmapWidth / 2";
__ref._csortbitmapheight /*int*/  = (int) (__ref._csortbitmapwidth /*int*/ /(double)2);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="pnlAsc.Initialize(\"\")";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=10878982;
 //BA.debugLineNum = 10878982;BA.debugLine="pnlTable.AddView(pnlAsc, 0, 0, cSortBitmapWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=10878983;
 //BA.debugLineNum = 10878983;BA.debugLine="cvsAsc.Initialize(pnlAsc)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="pthAsc.Initialize(0, 0)";
_pthasc.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=10878985;
 //BA.debugLineNum = 10878985;BA.debugLine="pthAsc.LineTo(cSortBitmapWidth, 0)";
_pthasc.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (0));
RDebugUtils.currentLine=10878986;
 //BA.debugLineNum = 10878986;BA.debugLine="pthAsc.LineTo(cSortBitmapHeight, cSortBitmapHeigh";
_pthasc.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=10878987;
 //BA.debugLineNum = 10878987;BA.debugLine="cvsAsc.DrawColor(Colors.Transparent)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10878988;
 //BA.debugLineNum = 10878988;BA.debugLine="cvsAsc.DrawPath(pthAsc, cSortBitmapColor, True, 1";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthasc.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10878989;
 //BA.debugLineNum = 10878989;BA.debugLine="bmpAsc = cvsAsc.Bitmap";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=10878991;
 //BA.debugLineNum = 10878991;BA.debugLine="cvsDes.Initialize(pnlAsc)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=10878992;
 //BA.debugLineNum = 10878992;BA.debugLine="pthDes.Initialize(0, cSortBitmapHeight)";
_pthdes.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=10878993;
 //BA.debugLineNum = 10878993;BA.debugLine="pthDes.LineTo(cSortBitmapHeight, 0)";
_pthdes.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (0));
RDebugUtils.currentLine=10878994;
 //BA.debugLineNum = 10878994;BA.debugLine="pthDes.LineTo(cSortBitmapWidth, cSortBitmapHeight";
_pthdes.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=10878995;
 //BA.debugLineNum = 10878995;BA.debugLine="cvsDes.DrawColor(Colors.Transparent)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10878996;
 //BA.debugLineNum = 10878996;BA.debugLine="cvsDes.DrawPath(pthDes, cSortBitmapColor, True, 1";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthdes.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10878997;
 //BA.debugLineNum = 10878997;BA.debugLine="bmpDes = cvsDes.Bitmap";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=10879000;
 //BA.debugLineNum = 10879000;BA.debugLine="cvsEqual.Initialize(pnlAsc)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=10879001;
 //BA.debugLineNum = 10879001;BA.debugLine="pthEqual.Initialize(0, cSortBitmapHeight / 2)";
_pthequal.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=10879002;
 //BA.debugLineNum = 10879002;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, cSortBitmap";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=10879003;
 //BA.debugLineNum = 10879003;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth, cSortBitmapHeig";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=10879004;
 //BA.debugLineNum = 10879004;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, 0)";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (0));
RDebugUtils.currentLine=10879005;
 //BA.debugLineNum = 10879005;BA.debugLine="cvsEqual.DrawColor(Colors.Transparent)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=10879006;
 //BA.debugLineNum = 10879006;BA.debugLine="cvsEqual.DrawPath(pthEqual, cSortBitmapColor, Tru";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthequal.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=10879007;
 //BA.debugLineNum = 10879007;BA.debugLine="bmpEqual = cvsEqual.Bitmap";
__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=10879009;
 //BA.debugLineNum = 10879009;BA.debugLine="pnlAsc.RemoveView";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=10879010;
 //BA.debugLineNum = 10879010;BA.debugLine="End Sub";
return "";
}
public String  _initializetable(b4a.example.ef.table __ref,int _numberofcolumns,int _cellalignement,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initializetable", false))
	 {return ((String) Debug.delegate(ba, "initializetable", new Object[] {_numberofcolumns,_cellalignement,_showstatusline}));}
int _i = 0;
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Public Sub InitializeTable (NumberOfColumns As Int";
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="setShowStatusLine(showStatusLine)";
__ref._setshowstatusline /*String*/ (null,_showstatusline);
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="cAlignment = cellAlignement";
__ref._calignment /*int*/  = _cellalignement;
RDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="Data.Initialize	'needed";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10813452;
 //BA.debugLineNum = 10813452;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=10813455;
 //BA.debugLineNum = 10813455;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="ColumnWidths(i) = cWidth / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._cwidth /*int*/ /(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=10813457;
 //BA.debugLineNum = 10813457;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=10813458;
 //BA.debugLineNum = 10813458;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=10813462;
 //BA.debugLineNum = 10813462;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=10813463;
 //BA.debugLineNum = 10813463;BA.debugLine="End Sub";
return "";
}
public String  _setshowstatusline(b4a.example.ef.table __ref,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setshowstatusline", false))
	 {return ((String) Debug.delegate(ba, "setshowstatusline", new Object[] {_showstatusline}));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub setShowStatusLine(ShowStatusLine As Boo";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="cShowStatusLine = ShowStatusLine";
__ref._cshowstatusline /*boolean*/  = _showstatusline;
RDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="SV2.Height = cHeight - Header.Height - cStatusLi";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="lblStatusLine.Visible = True";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=19726342;
 //BA.debugLineNum = 19726342;BA.debugLine="SV2.Height = cHeight - Header.Height";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="lblStatusLine.Visible = False";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=19726345;
 //BA.debugLineNum = 19726345;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=19726347;
 //BA.debugLineNum = 19726347;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=19726349;
 //BA.debugLineNum = 19726349;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=19726350;
 //BA.debugLineNum = 19726350;BA.debugLine="End Sub";
return "";
}
public String  _svf_scrollchanged(b4a.example.ef.table __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "svf_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "svf_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub SVF_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="SVFScrolls = True";
__ref._svfscrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="If SV2Scrolls = False Then";
if (__ref._sv2scrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Scroll(SV2PosX, Position)";
__ref._scroll /*String*/ (null,__ref._sv2posx /*int*/ ,_position);
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="SV2.VerticalScrollPosition = Position";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_position);
 };
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="SVFScrolls = False";
__ref._svfscrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="End Sub";
return "";
}
public String  _sv2_scrollchanged(b4a.example.ef.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sv2_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv2_scrollchanged", new Object[] {_posx,_posy}));}
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub SV2_ScrollChanged(PosX As Int, PosY As";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="SV2Scrolls = True";
__ref._sv2scrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="If SVFScrolls = False Then";
if (__ref._svfscrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="SVF.ScrollToNow(PosY)";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .ScrollToNow(_posy);
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Scroll(PosX, PosY)";
__ref._scroll /*String*/ (null,_posx,_posy);
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="SV2PosX = PosX";
__ref._sv2posx /*int*/  = _posx;
 };
RDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="SV2Scrolls = False";
__ref._sv2scrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=11337737;
 //BA.debugLineNum = 11337737;BA.debugLine="If mFastScroll = True And Data.Size >= mFastScrol";
if (__ref._mfastscroll /*boolean*/ ==__c.True && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._mfastscrollminitems /*int*/  && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ >__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="FScScale = FastScrollHeight / (SV2.Panel.Height";
__ref._fscscale /*double*/  = __ref._fastscrollheight /*int*/ /(double)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight()-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="pnlFastScroll.Visible = True";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=11337740;
 //BA.debugLineNum = 11337740;BA.debugLine="If mFastScrollShowLabel = True Then";
if (__ref._mfastscrollshowlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="lblFastScroll.Visible = True";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="CalcFastScroll(PosY)";
__ref._calcfastscroll /*String*/ (null,_posy);
RDebugUtils.currentLine=11337744;
 //BA.debugLineNum = 11337744;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=11337746;
 //BA.debugLineNum = 11337746;BA.debugLine="End Sub";
return "";
}
public String  _setstatusline(b4a.example.ef.table __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatusline", false))
	 {return ((String) Debug.delegate(ba, "setstatusline", new Object[] {_text}));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub setStatusLine(Text As String)";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized())) { 
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_text));};
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As St";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="If (Row < 0) Then Row = 0";
if ((_row<0)) { 
_row = (int) (0);};
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="If (Row > Data.Size) Then";
if ((_row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())) { 
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="AddRow(Values)";
__ref._addrow /*String*/ (null,_values);
 }else {
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="AddRowAutomaticWidth(Values)";
__ref._addrowautomaticwidth /*String*/ (null,_values);
 };
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="L.Initialize";
_l.Initialize();
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="L.Add(Values)";
_l.Add((Object)(_values));
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step14 = 1;
final int limit14 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=12976146;
 //BA.debugLineNum = 12976146;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="If (keepSel >= Row) Then";
if ((_keepsel>=_row)) { 
RDebugUtils.currentLine=12976148;
 //BA.debugLineNum = 12976148;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel+1));
 };
 }
};
RDebugUtils.currentLine=12976152;
 //BA.debugLineNum = 12976152;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step21 = 1;
final int limit21 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=12976155;
 //BA.debugLineNum = 12976155;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_row,_l);
RDebugUtils.currentLine=12976156;
 //BA.debugLineNum = 12976156;BA.debugLine="lstRowColorIndexes.InsertAt(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_row,(Object)(0));
RDebugUtils.currentLine=12976158;
 //BA.debugLineNum = 12976158;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=12976160;
 //BA.debugLineNum = 12976160;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step27 = 1;
final int limit27 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=12976161;
 //BA.debugLineNum = 12976161;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=12976164;
 //BA.debugLineNum = 12976164;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=12976165;
 //BA.debugLineNum = 12976165;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=12976166;
 //BA.debugLineNum = 12976166;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=12976167;
 //BA.debugLineNum = 12976167;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=12976168;
 //BA.debugLineNum = 12976168;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=12976170;
 //BA.debugLineNum = 12976170;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=12976171;
 //BA.debugLineNum = 12976171;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=12976172;
 //BA.debugLineNum = 12976172;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=12976173;
 //BA.debugLineNum = 12976173;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=12976174;
 //BA.debugLineNum = 12976174;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=12976175;
 //BA.debugLineNum = 12976175;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=12976176;
 //BA.debugLineNum = 12976176;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=12976178;
 //BA.debugLineNum = 12976178;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=12976180;
 //BA.debugLineNum = 12976180;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=12976181;
 //BA.debugLineNum = 12976181;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=12976182;
 //BA.debugLineNum = 12976182;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=12976183;
 //BA.debugLineNum = 12976183;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=12976186;
 //BA.debugLineNum = 12976186;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step51 = 1;
final int limit51 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
RDebugUtils.currentLine=12976187;
 //BA.debugLineNum = 12976187;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=12976188;
 //BA.debugLineNum = 12976188;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=12976190;
 //BA.debugLineNum = 12976190;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=12976192;
 //BA.debugLineNum = 12976192;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=12976193;
 //BA.debugLineNum = 12976193;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=12976194;
 //BA.debugLineNum = 12976194;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=12976195;
 //BA.debugLineNum = 12976195;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=12976196;
 //BA.debugLineNum = 12976196;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=12976197;
 //BA.debugLineNum = 12976197;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=12976201;
 //BA.debugLineNum = 12976201;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=12976202;
 //BA.debugLineNum = 12976202;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
 };
RDebugUtils.currentLine=12976206;
 //BA.debugLineNum = 12976206;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=12976207;
 //BA.debugLineNum = 12976207;BA.debugLine="End Sub";
return false;
}
public String  _ip_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "ip_click", false))
	 {return ((String) Debug.delegate(ba, "ip_click", null));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Private Sub IP_Click";
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(-1));
 };
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "isrowvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isrowvisible", new Object[] {_row}));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean		'";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Return Row < (SV2.VerticalScrollPosition + SV2.He";
if (true) return _row<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)(__ref._crowheight /*int*/ +1) && _row>__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ ;
RDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorow"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Log(\"You may get this warning:\")";
parent.__c.LogImpl("312517377","You may get this warning:",0);
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="Log(\"Unexpected event (missing RaiseSynchronousEv";
parent.__c.LogImpl("312517378","Unexpected event (missing RaiseSynchronousEvents): sv_scrollchanged",0);
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="Log(\"Ignore it, it is NOT harmful !\")";
parent.__c.LogImpl("312517379","Ignore it, it is NOT harmful !",0);
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="rc.Col = Col";
_rc.Col /*int*/  = _col;
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorowandselect"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=12517389;
 //BA.debugLineNum = 12517389;BA.debugLine="Private i, Left As Int";
_i = 0;
_left = 0;
RDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="If Col > 0 Then";
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
RDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="For i = 0 To Col - 1";
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
RDebugUtils.currentLine=12517392;
 //BA.debugLineNum = 12517392;BA.debugLine="Left = Left + ColumnWidths(i)";
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
RDebugUtils.currentLine=12517395;
 //BA.debugLineNum = 12517395;BA.debugLine="Left = Left - SVF.Width";
_left = (int) (_left-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=12517396;
 //BA.debugLineNum = 12517396;BA.debugLine="SV2.HorizontalScrollPosition = Left";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition(_left);
RDebugUtils.currentLine=12517397;
 //BA.debugLineNum = 12517397;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18022415;
 //BA.debugLineNum = 18022415;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=18022416;
 //BA.debugLineNum = 18022416;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=18022417;
 //BA.debugLineNum = 18022417;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=18022418;
 //BA.debugLineNum = 18022418;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=18022419;
 //BA.debugLineNum = 18022419;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18022420;
 //BA.debugLineNum = 18022420;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18022421;
 //BA.debugLineNum = 18022421;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=18022423;
 //BA.debugLineNum = 18022423;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18022424;
 //BA.debugLineNum = 18022424;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=18022426;
 //BA.debugLineNum = 18022426;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=18022428;
 //BA.debugLineNum = 18022428;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=18022429;
 //BA.debugLineNum = 18022429;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=18022430;
 //BA.debugLineNum = 18022430;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18022431;
 //BA.debugLineNum = 18022431;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18022432;
 //BA.debugLineNum = 18022432;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=18022433;
 //BA.debugLineNum = 18022433;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18022434;
 //BA.debugLineNum = 18022434;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].DEFAULT,__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=18022436;
 //BA.debugLineNum = 18022436;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=18022440;
 //BA.debugLineNum = 18022440;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=18022444;
 //BA.debugLineNum = 18022444;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=18022445;
 //BA.debugLineNum = 18022445;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=18022449;
 //BA.debugLineNum = 18022449;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18022451;
 //BA.debugLineNum = 18022451;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=18022452;
 //BA.debugLineNum = 18022452;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=18022453;
 //BA.debugLineNum = 18022453;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=18022454;
 //BA.debugLineNum = 18022454;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18022455;
 //BA.debugLineNum = 18022455;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18022456;
 //BA.debugLineNum = 18022456;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=18022457;
 //BA.debugLineNum = 18022457;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=18022459;
 //BA.debugLineNum = 18022459;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=18022462;
 //BA.debugLineNum = 18022462;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=18022465;
 //BA.debugLineNum = 18022465;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=18022468;
 //BA.debugLineNum = 18022468;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub SetHeader(Values() As String)";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="HeaderNames.Initialize2(Values)";
__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="Dim Left = 0 As Int";
_left = (int) (0);
RDebugUtils.currentLine=11927560;
 //BA.debugLineNum = 11927560;BA.debugLine="Dim Change = 0 As Int";
_change = (int) (0);
RDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="Dim w As Int";
_w = 0;
RDebugUtils.currentLine=11927562;
 //BA.debugLineNum = 11927562;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=11927563;
 //BA.debugLineNum = 11927563;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11927564;
 //BA.debugLineNum = 11927564;BA.debugLine="lbl.Initialize(\"header\")";
_lbl.Initialize(ba,"header");
RDebugUtils.currentLine=11927565;
 //BA.debugLineNum = 11927565;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11927566;
 //BA.debugLineNum = 11927566;BA.debugLine="lbl.Gravity = cHeaderAlignment";
_lbl.setGravity(__ref._cheaderalignment /*int*/ );
 }else {
RDebugUtils.currentLine=11927568;
 //BA.debugLineNum = 11927568;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=11927571;
 //BA.debugLineNum = 11927571;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=11927572;
 //BA.debugLineNum = 11927572;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=11927574;
 //BA.debugLineNum = 11927574;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 };
RDebugUtils.currentLine=11927577;
 //BA.debugLineNum = 11927577;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=11927578;
 //BA.debugLineNum = 11927578;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=11927580;
 //BA.debugLineNum = 11927580;BA.debugLine="If cUseColumnColors = False Or cHeaderTextColors";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False || __ref._cheadertextcolors /*int[]*/ .length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=11927581;
 //BA.debugLineNum = 11927581;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
RDebugUtils.currentLine=11927582;
 //BA.debugLineNum = 11927582;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=11927584;
 //BA.debugLineNum = 11927584;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
RDebugUtils.currentLine=11927585;
 //BA.debugLineNum = 11927585;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=11927588;
 //BA.debugLineNum = 11927588;BA.debugLine="lbl.Text = Values(col)";
_lbl.setText(BA.ObjectToCharSequence(_values[_col]));
RDebugUtils.currentLine=11927589;
 //BA.debugLineNum = 11927589;BA.debugLine="lbl.Tag = col";
_lbl.setTag((Object)(_col));
RDebugUtils.currentLine=11927591;
 //BA.debugLineNum = 11927591;BA.debugLine="w = Max(0, ColumnWidths(col) - cLineWidth)		' ne";
_w = (int) (__c.Max(0,__ref._columnwidths /*int[]*/ [_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=11927593;
 //BA.debugLineNum = 11927593;BA.debugLine="If mNumberOfFixedColumns > 0 And col < mNumberOf";
if (__ref._mnumberoffixedcolumns /*int*/ >0 && _col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=11927594;
 //BA.debugLineNum = 11927594;BA.debugLine="HeaderFirst.AddView(lbl, Left, 0, w, cHeaderHei";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 }else {
RDebugUtils.currentLine=11927597;
 //BA.debugLineNum = 11927597;BA.debugLine="If col = mNumberOfFixedColumns Then";
if (_col==__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=11927598;
 //BA.debugLineNum = 11927598;BA.debugLine="Left = 0";
_left = (int) (0);
 };
RDebugUtils.currentLine=11927600;
 //BA.debugLineNum = 11927600;BA.debugLine="Header.AddView(lbl, Left, 0, w, cHeaderHeight)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 };
RDebugUtils.currentLine=11927604;
 //BA.debugLineNum = 11927604;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=11927605;
 //BA.debugLineNum = 11927605;BA.debugLine="If Values(col).Contains(CRLF) Then";
if (_values[_col].contains(__c.CRLF)) { 
RDebugUtils.currentLine=11927606;
 //BA.debugLineNum = 11927606;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=11927607;
 //BA.debugLineNum = 11927607;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=11927608;
 //BA.debugLineNum = 11927608;BA.debugLine="str = Regex.Split(CRLF, Values(col))";
_str = __c.Regex.Split(__c.CRLF,_values[_col]);
RDebugUtils.currentLine=11927609;
 //BA.debugLineNum = 11927609;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(str";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[(int) (0)],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
RDebugUtils.currentLine=11927610;
 //BA.debugLineNum = 11927610;BA.debugLine="For j = 1 To str.Length - 1";
{
final int step46 = 1;
final int limit46 = (int) (_str.length-1);
_j = (int) (1) ;
for (;_j <= limit46 ;_j = _j + step46 ) {
RDebugUtils.currentLine=11927611;
 //BA.debugLineNum = 11927611;BA.debugLine="HeaderWidths(col) = Max(HeaderWidths(col),cvs";
__ref._headerwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[_j],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=11927614;
 //BA.debugLineNum = 11927614;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Val";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_col],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=11927616;
 //BA.debugLineNum = 11927616;BA.debugLine="If HeaderWidths(col) > ColumnWidths(col) Then";
if (__ref._headerwidths /*int[]*/ [_col]>__ref._columnwidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=11927617;
 //BA.debugLineNum = 11927617;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=11927618;
 //BA.debugLineNum = 11927618;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Col";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._columnwidths /*int[]*/ [_col]));
 }else 
{RDebugUtils.currentLine=11927619;
 //BA.debugLineNum = 11927619;BA.debugLine="Else If ColumnWidths(col) > HeaderWidths(col) A";
if (__ref._columnwidths /*int[]*/ [_col]>__ref._headerwidths /*int[]*/ [_col] && __ref._columnwidths /*int[]*/ [_col]>__ref._datawidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=11927620;
 //BA.debugLineNum = 11927620;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=11927621;
 //BA.debugLineNum = 11927621;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Dat";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }}
;
 };
RDebugUtils.currentLine=11927624;
 //BA.debugLineNum = 11927624;BA.debugLine="Left = Left + ColumnWidths(col)";
_left = (int) (_left+__ref._columnwidths /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=11927627;
 //BA.debugLineNum = 11927627;BA.debugLine="If Change = 1 Then";
if (_change==1) { 
RDebugUtils.currentLine=11927628;
 //BA.debugLineNum = 11927628;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=11927630;
 //BA.debugLineNum = 11927630;BA.debugLine="Header.Left = - SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=11927631;
 //BA.debugLineNum = 11927631;BA.debugLine="End Sub";
return "";
}
public String  _setarrcolumnssorted(b4a.example.ef.table __ref,int _icolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setarrcolumnssorted", false))
	 {return ((String) Debug.delegate(ba, "setarrcolumnssorted", new Object[] {_icolumns}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Public Sub SetArrColumnsSorted(iColumns As Int)";
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="sortingDir = 0 ' -1, 0, 1 as asc, unsorted, desc";
__ref._sortingdir /*int*/  = (int) (0);
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="sortedCol = -1";
__ref._sortedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="Dim arrDataSorted(iColumns) As Boolean";
_arrdatasorted = new boolean[_icolumns];
;
RDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="bDataTempDone = False";
__ref._bdatatempdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="Dim arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=22675464;
 //BA.debugLineNum = 22675464;BA.debugLine="mapSortingIndexes.Initialize";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=22675466;
 //BA.debugLineNum = 22675466;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub LoadSQLiteDB2(SQLite As SQL, Query As S";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=18087944;
 //BA.debugLineNum = 18087944;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=18087945;
 //BA.debugLineNum = 18087945;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18087946;
 //BA.debugLineNum = 18087946;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=18087949;
 //BA.debugLineNum = 18087949;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=18087950;
 //BA.debugLineNum = 18087950;BA.debugLine="Dim ii As Long";
_ii = 0L;
RDebugUtils.currentLine=18087951;
 //BA.debugLineNum = 18087951;BA.debugLine="Dim dd As Double";
_dd = 0;
RDebugUtils.currentLine=18087952;
 //BA.debugLineNum = 18087952;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18087953;
 //BA.debugLineNum = 18087953;BA.debugLine="cColumnDataType = ColumnDataTypes";
__ref._ccolumndatatype /*String[]*/  = _columndatatypes;
RDebugUtils.currentLine=18087954;
 //BA.debugLineNum = 18087954;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=18087955;
 //BA.debugLineNum = 18087955;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=18087956;
 //BA.debugLineNum = 18087956;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=18087957;
 //BA.debugLineNum = 18087957;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18087958;
 //BA.debugLineNum = 18087958;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18087959;
 //BA.debugLineNum = 18087959;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=18087961;
 //BA.debugLineNum = 18087961;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18087962;
 //BA.debugLineNum = 18087962;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=18087964;
 //BA.debugLineNum = 18087964;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=18087966;
 //BA.debugLineNum = 18087966;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=18087967;
 //BA.debugLineNum = 18087967;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step29 = 1;
final int limit29 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit29 ;_row = _row + step29 ) {
RDebugUtils.currentLine=18087968;
 //BA.debugLineNum = 18087968;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18087969;
 //BA.debugLineNum = 18087969;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18087970;
 //BA.debugLineNum = 18087970;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=18087971;
 //BA.debugLineNum = 18087971;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R")) {
case 0: {
RDebugUtils.currentLine=18087973;
 //BA.debugLineNum = 18087973;BA.debugLine="ii = Curs.GetInt2(col)";
_ii = (long) (_curs.GetInt2(_col));
RDebugUtils.currentLine=18087974;
 //BA.debugLineNum = 18087974;BA.debugLine="str = ii";
_str = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=18087976;
 //BA.debugLineNum = 18087976;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=18087977;
 //BA.debugLineNum = 18087977;BA.debugLine="str = dd";
_str = BA.NumberToString(_dd);
 break; }
}
;
 }else {
RDebugUtils.currentLine=18087980;
 //BA.debugLineNum = 18087980;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=18087982;
 //BA.debugLineNum = 18087982;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18087983;
 //BA.debugLineNum = 18087983;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=18087985;
 //BA.debugLineNum = 18087985;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=18087988;
 //BA.debugLineNum = 18087988;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=18087992;
 //BA.debugLineNum = 18087992;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=18087993;
 //BA.debugLineNum = 18087993;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=18087997;
 //BA.debugLineNum = 18087997;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18087999;
 //BA.debugLineNum = 18087999;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step56 = 1;
final int limit56 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit56 ;_row = _row + step56 ) {
RDebugUtils.currentLine=18088000;
 //BA.debugLineNum = 18088000;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18088001;
 //BA.debugLineNum = 18088001;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=18088002;
 //BA.debugLineNum = 18088002;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=18088003;
 //BA.debugLineNum = 18088003;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18088004;
 //BA.debugLineNum = 18088004;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=18088005;
 //BA.debugLineNum = 18088005;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 }else {
RDebugUtils.currentLine=18088007;
 //BA.debugLineNum = 18088007;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R","T")) {
case 0: {
RDebugUtils.currentLine=18088009;
 //BA.debugLineNum = 18088009;BA.debugLine="ii = Curs.GetLong2(col)";
_ii = _curs.GetLong2(_col);
RDebugUtils.currentLine=18088010;
 //BA.debugLineNum = 18088010;BA.debugLine="R(col) = ii";
_r[_col] = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=18088012;
 //BA.debugLineNum = 18088012;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=18088013;
 //BA.debugLineNum = 18088013;BA.debugLine="R(col) = dd";
_r[_col] = BA.NumberToString(_dd);
 break; }
case 2: {
RDebugUtils.currentLine=18088015;
 //BA.debugLineNum = 18088015;BA.debugLine="R(col) = Curs.GetString2(col)";
_r[_col] = _curs.GetString2(_col);
 break; }
default: {
RDebugUtils.currentLine=18088017;
 //BA.debugLineNum = 18088017;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 break; }
}
;
 };
 }
};
RDebugUtils.currentLine=18088021;
 //BA.debugLineNum = 18088021;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=18088024;
 //BA.debugLineNum = 18088024;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=18088025;
 //BA.debugLineNum = 18088025;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Public Sub LoadSQLiteDB3(SQLite As SQL, Query As S";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=18153478;
 //BA.debugLineNum = 18153478;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18153482;
 //BA.debugLineNum = 18153482;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18153483;
 //BA.debugLineNum = 18153483;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18153484;
 //BA.debugLineNum = 18153484;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=18153485;
 //BA.debugLineNum = 18153485;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=18153486;
 //BA.debugLineNum = 18153486;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=18153487;
 //BA.debugLineNum = 18153487;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=18153488;
 //BA.debugLineNum = 18153488;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=18153489;
 //BA.debugLineNum = 18153489;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=18153490;
 //BA.debugLineNum = 18153490;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=18153491;
 //BA.debugLineNum = 18153491;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18153492;
 //BA.debugLineNum = 18153492;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18153493;
 //BA.debugLineNum = 18153493;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=18153495;
 //BA.debugLineNum = 18153495;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18153496;
 //BA.debugLineNum = 18153496;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=18153498;
 //BA.debugLineNum = 18153498;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=18153500;
 //BA.debugLineNum = 18153500;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=18153501;
 //BA.debugLineNum = 18153501;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=18153502;
 //BA.debugLineNum = 18153502;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18153503;
 //BA.debugLineNum = 18153503;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18153504;
 //BA.debugLineNum = 18153504;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=18153505;
 //BA.debugLineNum = 18153505;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18153506;
 //BA.debugLineNum = 18153506;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=18153508;
 //BA.debugLineNum = 18153508;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=18153512;
 //BA.debugLineNum = 18153512;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=18153516;
 //BA.debugLineNum = 18153516;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=18153517;
 //BA.debugLineNum = 18153517;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=18153521;
 //BA.debugLineNum = 18153521;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18153523;
 //BA.debugLineNum = 18153523;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=18153524;
 //BA.debugLineNum = 18153524;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=18153525;
 //BA.debugLineNum = 18153525;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=18153526;
 //BA.debugLineNum = 18153526;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18153527;
 //BA.debugLineNum = 18153527;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18153528;
 //BA.debugLineNum = 18153528;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=18153529;
 //BA.debugLineNum = 18153529;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=18153531;
 //BA.debugLineNum = 18153531;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=18153534;
 //BA.debugLineNum = 18153534;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=18153537;
 //BA.debugLineNum = 18153537;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=18153538;
 //BA.debugLineNum = 18153538;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub LoadSQLiteDB4(SQLite As SQL, Query As S";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=18219017;
 //BA.debugLineNum = 18219017;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=18219018;
 //BA.debugLineNum = 18219018;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18219020;
 //BA.debugLineNum = 18219020;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18219021;
 //BA.debugLineNum = 18219021;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=18219022;
 //BA.debugLineNum = 18219022;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=18219023;
 //BA.debugLineNum = 18219023;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=18219025;
 //BA.debugLineNum = 18219025;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=18219027;
 //BA.debugLineNum = 18219027;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=18219028;
 //BA.debugLineNum = 18219028;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=18219029;
 //BA.debugLineNum = 18219029;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=18219030;
 //BA.debugLineNum = 18219030;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18219031;
 //BA.debugLineNum = 18219031;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18219032;
 //BA.debugLineNum = 18219032;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=18219034;
 //BA.debugLineNum = 18219034;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18219035;
 //BA.debugLineNum = 18219035;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=18219037;
 //BA.debugLineNum = 18219037;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=18219039;
 //BA.debugLineNum = 18219039;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=18219040;
 //BA.debugLineNum = 18219040;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=18219041;
 //BA.debugLineNum = 18219041;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18219042;
 //BA.debugLineNum = 18219042;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18219043;
 //BA.debugLineNum = 18219043;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=18219044;
 //BA.debugLineNum = 18219044;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=18219045;
 //BA.debugLineNum = 18219045;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=18219046;
 //BA.debugLineNum = 18219046;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=18219047;
 //BA.debugLineNum = 18219047;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=18219049;
 //BA.debugLineNum = 18219049;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18219050;
 //BA.debugLineNum = 18219050;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=18219052;
 //BA.debugLineNum = 18219052;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=18219055;
 //BA.debugLineNum = 18219055;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=18219059;
 //BA.debugLineNum = 18219059;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=18219060;
 //BA.debugLineNum = 18219060;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=18219064;
 //BA.debugLineNum = 18219064;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18219066;
 //BA.debugLineNum = 18219066;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=18219067;
 //BA.debugLineNum = 18219067;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=18219068;
 //BA.debugLineNum = 18219068;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=18219069;
 //BA.debugLineNum = 18219069;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18219070;
 //BA.debugLineNum = 18219070;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18219071;
 //BA.debugLineNum = 18219071;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=18219072;
 //BA.debugLineNum = 18219072;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=18219073;
 //BA.debugLineNum = 18219073;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=18219074;
 //BA.debugLineNum = 18219074;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=18219075;
 //BA.debugLineNum = 18219075;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=18219077;
 //BA.debugLineNum = 18219077;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=18219079;
 //BA.debugLineNum = 18219079;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=18219082;
 //BA.debugLineNum = 18219082;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=18219083;
 //BA.debugLineNum = 18219083;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub LoadSQLiteDB5(SQLite As SQL, Query As S";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=18284551;
 //BA.debugLineNum = 18284551;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=18284554;
 //BA.debugLineNum = 18284554;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18284555;
 //BA.debugLineNum = 18284555;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18284556;
 //BA.debugLineNum = 18284556;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18284557;
 //BA.debugLineNum = 18284557;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=18284558;
 //BA.debugLineNum = 18284558;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=18284559;
 //BA.debugLineNum = 18284559;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=18284561;
 //BA.debugLineNum = 18284561;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=18284563;
 //BA.debugLineNum = 18284563;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=18284564;
 //BA.debugLineNum = 18284564;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=18284565;
 //BA.debugLineNum = 18284565;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=18284566;
 //BA.debugLineNum = 18284566;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18284567;
 //BA.debugLineNum = 18284567;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=18284568;
 //BA.debugLineNum = 18284568;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=18284570;
 //BA.debugLineNum = 18284570;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18284571;
 //BA.debugLineNum = 18284571;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=18284573;
 //BA.debugLineNum = 18284573;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=18284575;
 //BA.debugLineNum = 18284575;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=18284576;
 //BA.debugLineNum = 18284576;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=18284577;
 //BA.debugLineNum = 18284577;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18284578;
 //BA.debugLineNum = 18284578;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18284579;
 //BA.debugLineNum = 18284579;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=18284580;
 //BA.debugLineNum = 18284580;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=18284581;
 //BA.debugLineNum = 18284581;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=18284582;
 //BA.debugLineNum = 18284582;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=18284583;
 //BA.debugLineNum = 18284583;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=18284585;
 //BA.debugLineNum = 18284585;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=18284586;
 //BA.debugLineNum = 18284586;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=18284588;
 //BA.debugLineNum = 18284588;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=18284591;
 //BA.debugLineNum = 18284591;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=18284595;
 //BA.debugLineNum = 18284595;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=18284596;
 //BA.debugLineNum = 18284596;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=18284600;
 //BA.debugLineNum = 18284600;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18284602;
 //BA.debugLineNum = 18284602;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=18284603;
 //BA.debugLineNum = 18284603;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=18284604;
 //BA.debugLineNum = 18284604;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=18284605;
 //BA.debugLineNum = 18284605;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=18284606;
 //BA.debugLineNum = 18284606;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=18284607;
 //BA.debugLineNum = 18284607;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=18284608;
 //BA.debugLineNum = 18284608;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=18284609;
 //BA.debugLineNum = 18284609;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=18284610;
 //BA.debugLineNum = 18284610;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=18284611;
 //BA.debugLineNum = 18284611;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=18284613;
 //BA.debugLineNum = 18284613;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=18284615;
 //BA.debugLineNum = 18284615;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=18284618;
 //BA.debugLineNum = 18284618;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=18284619;
 //BA.debugLineNum = 18284619;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="cAutomaticWidths = False";
__ref._cautomaticwidths /*boolean*/  = __c.False;
RDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
RDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=12582923;
 //BA.debugLineNum = 12582923;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_headers.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="h(i) = headers.Get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(","));
RDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=12582930;
 //BA.debugLineNum = 12582930;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=12582935;
 //BA.debugLineNum = 12582935;BA.debugLine="innerClearAll(h.Length, True)";
__ref._innerclearall /*String*/ (null,_h.length,__c.True);
RDebugUtils.currentLine=12582936;
 //BA.debugLineNum = 12582936;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=12582937;
 //BA.debugLineNum = 12582937;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=12582938;
 //BA.debugLineNum = 12582938;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=12582939;
 //BA.debugLineNum = 12582939;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=12582940;
 //BA.debugLineNum = 12582940;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=12582941;
 //BA.debugLineNum = 12582941;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
RDebugUtils.currentLine=12582942;
 //BA.debugLineNum = 12582942;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=12582943;
 //BA.debugLineNum = 12582943;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=12582944;
 //BA.debugLineNum = 12582944;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=12582947;
 //BA.debugLineNum = 12582947;BA.debugLine="SetHeader(h)";
__ref._setheader /*String*/ (null,_h);
RDebugUtils.currentLine=12582948;
 //BA.debugLineNum = 12582948;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=12582952;
 //BA.debugLineNum = 12582952;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=12582954;
 //BA.debugLineNum = 12582954;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=12582955;
 //BA.debugLineNum = 12582955;BA.debugLine="Dim Row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
RDebugUtils.currentLine=12582956;
 //BA.debugLineNum = 12582956;BA.debugLine="Row = List1.Get(i)";
_row = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=12582957;
 //BA.debugLineNum = 12582957;BA.debugLine="AddRow(Row)";
__ref._addrow /*String*/ (null,_row);
 }
};
RDebugUtils.currentLine=12582959;
 //BA.debugLineNum = 12582959;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=12648455;
 //BA.debugLineNum = 12648455;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_lstheaders);
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="Dim Headers(lstHeaders.Size) As String";
_headers = new String[_lstheaders.getSize()];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=12648458;
 //BA.debugLineNum = 12648458;BA.debugLine="For i = 0 To lstHeaders.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lstheaders.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=12648459;
 //BA.debugLineNum = 12648459;BA.debugLine="Headers(i) = lstHeaders.Get(i)";
_headers[_i] = BA.ObjectToString(_lstheaders.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=12648462;
 //BA.debugLineNum = 12648462;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));
RDebugUtils.currentLine=12648463;
 //BA.debugLineNum = 12648463;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=12648464;
 //BA.debugLineNum = 12648464;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=12648465;
 //BA.debugLineNum = 12648465;BA.debugLine="Dim Headers(firstRow.Length) As String";
_headers = new String[_firstrow.length];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=12648466;
 //BA.debugLineNum = 12648466;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=12648467;
 //BA.debugLineNum = 12648467;BA.debugLine="Headers(i) = \"Col\" & (i + 1)";
_headers[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=12648470;
 //BA.debugLineNum = 12648470;BA.debugLine="innerClearAll(Headers.Length, True)";
__ref._innerclearall /*String*/ (null,_headers.length,__c.True);
RDebugUtils.currentLine=12648471;
 //BA.debugLineNum = 12648471;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=12648472;
 //BA.debugLineNum = 12648472;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=12648473;
 //BA.debugLineNum = 12648473;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=12648474;
 //BA.debugLineNum = 12648474;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=12648476;
 //BA.debugLineNum = 12648476;BA.debugLine="Dim col, Row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=12648477;
 //BA.debugLineNum = 12648477;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=12648478;
 //BA.debugLineNum = 12648478;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step26 = 1;
final int limit26 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit26 ;_col = _col + step26 ) {
RDebugUtils.currentLine=12648479;
 //BA.debugLineNum = 12648479;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=12648480;
 //BA.debugLineNum = 12648480;BA.debugLine="ColumnWidths(col) = SV2.Width / mNumberOfColumn";
__ref._columnwidths /*int[]*/ [_col] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=12648481;
 //BA.debugLineNum = 12648481;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
__ref._headerwidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
RDebugUtils.currentLine=12648482;
 //BA.debugLineNum = 12648482;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
__ref._datawidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
 }
};
 }else {
RDebugUtils.currentLine=12648485;
 //BA.debugLineNum = 12648485;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=12648486;
 //BA.debugLineNum = 12648486;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=12648487;
 //BA.debugLineNum = 12648487;BA.debugLine="strRow = List1.Get(col)";
_strrow = (String[])(_list1.Get(_col));
RDebugUtils.currentLine=12648488;
 //BA.debugLineNum = 12648488;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=12648489;
 //BA.debugLineNum = 12648489;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit37 ;_col = _col + step37 ) {
RDebugUtils.currentLine=12648490;
 //BA.debugLineNum = 12648490;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=12648493;
 //BA.debugLineNum = 12648493;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=12648494;
 //BA.debugLineNum = 12648494;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=12648498;
 //BA.debugLineNum = 12648498;BA.debugLine="For Row = 0 To List1.Size - 1";
{
final int step46 = 1;
final int limit46 = (int) (_list1.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit46 ;_row = _row + step46 ) {
RDebugUtils.currentLine=12648499;
 //BA.debugLineNum = 12648499;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=12648500;
 //BA.debugLineNum = 12648500;BA.debugLine="strRow = List1.Get(Row)";
_strrow = (String[])(_list1.Get(_row));
RDebugUtils.currentLine=12648501;
 //BA.debugLineNum = 12648501;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=12648502;
 //BA.debugLineNum = 12648502;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=12648503;
 //BA.debugLineNum = 12648503;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=12648506;
 //BA.debugLineNum = 12648506;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step54 = 1;
final int limit54 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit54 ;_col = _col + step54 ) {
RDebugUtils.currentLine=12648507;
 //BA.debugLineNum = 12648507;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 };
 }
};
RDebugUtils.currentLine=12648511;
 //BA.debugLineNum = 12648511;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=12648512;
 //BA.debugLineNum = 12648512;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=12648513;
 //BA.debugLineNum = 12648513;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }
};
 };
RDebugUtils.currentLine=12648517;
 //BA.debugLineNum = 12648517;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=12648518;
 //BA.debugLineNum = 12648518;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=12648522;
 //BA.debugLineNum = 12648522;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=12648524;
 //BA.debugLineNum = 12648524;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step67 = 1;
final int limit67 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=12648525;
 //BA.debugLineNum = 12648525;BA.debugLine="Dim strRow() As String";
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=12648526;
 //BA.debugLineNum = 12648526;BA.debugLine="strRow = List1.Get(i)";
_strrow = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=12648527;
 //BA.debugLineNum = 12648527;BA.debugLine="AddRow(strRow)";
__ref._addrow /*String*/ (null,_strrow);
 }
};
RDebugUtils.currentLine=12648530;
 //BA.debugLineNum = 12648530;BA.debugLine="End Sub";
return "";
}
public String  _pnlfastscroll_touch(b4a.example.ef.table __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "pnlfastscroll_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlfastscroll_touch", new Object[] {_action,_x,_y}));}
int _top = 0;
int _sv2top = 0;
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Private Sub pnlFastScroll_Touch (Action As Int, X";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Select Action";
switch (_action) {
case 0: {
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="If Y >= pnlFastScrollCursor.Top And Y <= pnlFas";
if (_y>=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop() && _y<=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="FSY0 = pnlFastScrollCursor.Top";
__ref._fsy0 /*int*/  = __ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="FSdY = Y - FSY0";
__ref._fsdy /*int*/  = (int) (_y-__ref._fsy0 /*int*/ );
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="FastScrollActive = True";
__ref._fastscrollactive /*boolean*/  = __c.True;
 };
 break; }
case 2: {
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="If FastScrollActive = True Then";
if (__ref._fastscrollactive /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="Private Top, SV2Top As Int";
_top = 0;
_sv2top = 0;
RDebugUtils.currentLine=15532043;
 //BA.debugLineNum = 15532043;BA.debugLine="Top = Max(Y - FSdY, 0)";
_top = (int) (__c.Max(_y-__ref._fsdy /*int*/ ,0));
RDebugUtils.currentLine=15532044;
 //BA.debugLineNum = 15532044;BA.debugLine="Top = Min(Top, pnlFastScroll.Height - pnlFastS";
_top = (int) (__c.Min(_top,__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=15532047;
 //BA.debugLineNum = 15532047;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top +";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=15532049;
 //BA.debugLineNum = 15532049;BA.debugLine="SV2Top = Top / FScScale";
_sv2top = (int) (_top/(double)__ref._fscscale /*double*/ );
RDebugUtils.currentLine=15532050;
 //BA.debugLineNum = 15532050;BA.debugLine="SV2.VerticalScrollPosition = SV2Top";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_sv2top);
 };
 break; }
case 1: {
RDebugUtils.currentLine=15532053;
 //BA.debugLineNum = 15532053;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=15532055;
 //BA.debugLineNum = 15532055;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub RefreshLabels";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Private i, j As Int";
_i = 0;
_j = 0;
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step3 = 1;
final int limit3 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="If cTypeFaces.Length < mNumberOfColumns Then";
if (__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="Private cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
RDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="cTypeFaces(j) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }
};
 };
RDebugUtils.currentLine=13303823;
 //BA.debugLineNum = 13303823;BA.debugLine="If cTextColors.Length < mNumberOfColumns Then";
if (__ref._ctextcolors /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=13303824;
 //BA.debugLineNum = 13303824;BA.debugLine="Private cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=13303825;
 //BA.debugLineNum = 13303825;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit14 ;_j = _j + step14 ) {
RDebugUtils.currentLine=13303826;
 //BA.debugLineNum = 13303826;BA.debugLine="cTextColors(j) = cTextColor";
__ref._ctextcolors /*int[]*/ [_j] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=13303829;
 //BA.debugLineNum = 13303829;BA.debugLine="For i = 0 To LabelsCache.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=13303830;
 //BA.debugLineNum = 13303830;BA.debugLine="Private lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=13303831;
 //BA.debugLineNum = 13303831;BA.debugLine="lbls = LabelsCache.Get(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=13303832;
 //BA.debugLineNum = 13303832;BA.debugLine="For j = 0 To lbls.Length - 1";
{
final int step21 = 1;
final int limit21 = (int) (_lbls.length-1);
_j = (int) (0) ;
for (;_j <= limit21 ;_j = _j + step21 ) {
RDebugUtils.currentLine=13303833;
 //BA.debugLineNum = 13303833;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=13303834;
 //BA.debugLineNum = 13303834;BA.debugLine="lbls(j).Typeface = cTypeFaces(j)";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j].getObject()));
RDebugUtils.currentLine=13303835;
 //BA.debugLineNum = 13303835;BA.debugLine="lbls(j).TextColor = cTextColors(j)";
_lbls[_j].setTextColor(__ref._ctextcolors /*int[]*/ [_j]);
 }else {
RDebugUtils.currentLine=13303837;
 //BA.debugLineNum = 13303837;BA.debugLine="lbls(j).Typeface = cTypeFace";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=13303838;
 //BA.debugLineNum = 13303838;BA.debugLine="lbls(j).TextColor = cTextColor";
_lbls[_j].setTextColor(__ref._ctextcolor /*int*/ );
 };
 }
};
 }
};
RDebugUtils.currentLine=13303843;
 //BA.debugLineNum = 13303843;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all";
{
final int step31 = 1;
final int limit31 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=13303844;
 //BA.debugLineNum = 13303844;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=13303846;
 //BA.debugLineNum = 13303846;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Private Sub RemoveAccents(s As String) As String";
RDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Dim normalizer As JavaObject";
_normalizer = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="normalizer.InitializeStatic(\"java.text.Normalizer";
_normalizer.InitializeStatic("java.text.Normalizer");
RDebugUtils.currentLine=20709379;
 //BA.debugLineNum = 20709379;BA.debugLine="Dim n As String = normalizer.RunMethod(\"normalize";
_n = BA.ObjectToString(_normalizer.RunMethod("normalize",new Object[]{(Object)(_s),(Object)("NFD")}));
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=20709381;
 //BA.debugLineNum = 20709381;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="For i = 0 To n.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_n.length()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="If Regex.IsMatch(\"\\p{InCombiningDiacriticalMarks";
if (__c.Regex.IsMatch("\\p{InCombiningDiacriticalMarks}",BA.ObjectToString(_n.charAt(_i)))==__c.False) { 
RDebugUtils.currentLine=20709384;
 //BA.debugLineNum = 20709384;BA.debugLine="sb.Append(n.CharAt(i))";
_sb.Append(BA.ObjectToString(_n.charAt(_i)));
 };
 }
};
RDebugUtils.currentLine=20709387;
 //BA.debugLineNum = 20709387;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=20709388;
 //BA.debugLineNum = 20709388;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub RemoveRow(Row As Int)";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="If (Row <0 Or Row > Data.Size-1) Then Return ' ca";
if ((_row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
if (true) return "";};
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rm";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step5 = 1;
final int limit5 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=12845069;
 //BA.debugLineNum = 12845069;BA.debugLine="If (keepSel > Row) Then";
if ((_keepsel>_row)) { 
RDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel-1));
 };
 }
};
RDebugUtils.currentLine=12845075;
 //BA.debugLineNum = 12845075;BA.debugLine="If (prevIndex <> -1) Then";
if ((_previndex!=-1)) { 
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=12845080;
 //BA.debugLineNum = 12845080;BA.debugLine="Data.RemoveAt(Row)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=12845081;
 //BA.debugLineNum = 12845081;BA.debugLine="lstRowColorIndexes.RemoveAt(Row)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=12845082;
 //BA.debugLineNum = 12845082;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step17 = 1;
final int limit17 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=12845083;
 //BA.debugLineNum = 12845083;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=12845094;
 //BA.debugLineNum = 12845094;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=12845095;
 //BA.debugLineNum = 12845095;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
__ref._maxvisiblerow /*int*/  = (int) (__c.Min(__ref._maxvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=12845096;
 //BA.debugLineNum = 12845096;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
__ref._minvisiblerow /*int*/  = (int) (__c.Min(__ref._minvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=12845097;
 //BA.debugLineNum = 12845097;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
{
final int step23 = 1;
final int limit23 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=12845099;
 //BA.debugLineNum = 12845099;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
 };
RDebugUtils.currentLine=12845103;
 //BA.debugLineNum = 12845103;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=12845104;
 //BA.debugLineNum = 12845104;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=12845105;
 //BA.debugLineNum = 12845105;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=12845107;
 //BA.debugLineNum = 12845107;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=12845108;
 //BA.debugLineNum = 12845108;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=12845109;
 //BA.debugLineNum = 12845109;BA.debugLine="End Sub";
return "";
}
public String  _removerowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removerowcolorn", false))
	 {return ((String) Debug.delegate(ba, "removerowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub RemoveRowColorN(Row As Int)";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="If Row > -1 And Row <lstRowColorIndexes.Size Then";
if (_row>-1 && _row<__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="lstRowColorIndexes.Set(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(0));
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
 };
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="End Sub";
return "";
}
public String  _removeview(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removeview", false))
	 {return ((String) Debug.delegate(ba, "removeview", null));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub RemoveView";
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="pnlTable.RemoveView";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Sub ReverseIndexDouble(arrDouble() As Double, arrI";
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=23396359;
 //BA.debugLineNum = 23396359;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=23396360;
 //BA.debugLineNum = 23396360;BA.debugLine="Dim arrIndex2(arrDouble.Length) As Int";
_arrindex2 = new int[_arrdouble.length];
;
RDebugUtils.currentLine=23396362;
 //BA.debugLineNum = 23396362;BA.debugLine="iUB = arrDouble.Length - 1";
_iub = (int) (_arrdouble.length-1);
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=23396366;
 //BA.debugLineNum = 23396366;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=23396367;
 //BA.debugLineNum = 23396367;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=23396369;
 //BA.debugLineNum = 23396369;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=23396371;
 //BA.debugLineNum = 23396371;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=23396372;
 //BA.debugLineNum = 23396372;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=23396373;
 //BA.debugLineNum = 23396373;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=23396375;
 //BA.debugLineNum = 23396375;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=23396377;
 //BA.debugLineNum = 23396377;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=23396378;
 //BA.debugLineNum = 23396378;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=23396379;
 //BA.debugLineNum = 23396379;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=23396380;
 //BA.debugLineNum = 23396380;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=23396381;
 //BA.debugLineNum = 23396381;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=23396382;
 //BA.debugLineNum = 23396382;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=23396383;
 //BA.debugLineNum = 23396383;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=23396385;
 //BA.debugLineNum = 23396385;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=23396388;
 //BA.debugLineNum = 23396388;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=23396389;
 //BA.debugLineNum = 23396389;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=23396390;
 //BA.debugLineNum = 23396390;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=23396391;
 //BA.debugLineNum = 23396391;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=23396392;
 //BA.debugLineNum = 23396392;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=23396394;
 //BA.debugLineNum = 23396394;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=23396396;
 //BA.debugLineNum = 23396396;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=23396402;
 //BA.debugLineNum = 23396402;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=23396404;
 //BA.debugLineNum = 23396404;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub ReverseIndexLong(arrLong() As Long, arrIndex()";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="Dim arrIndex2(arrLong.Length) As Int";
_arrindex2 = new int[_arrlong.length];
;
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="iUB = arrLong.Length - 1";
_iub = (int) (_arrlong.length-1);
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=23330835;
 //BA.debugLineNum = 23330835;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=23330836;
 //BA.debugLineNum = 23330836;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=23330837;
 //BA.debugLineNum = 23330837;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=23330839;
 //BA.debugLineNum = 23330839;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=23330841;
 //BA.debugLineNum = 23330841;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=23330842;
 //BA.debugLineNum = 23330842;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=23330843;
 //BA.debugLineNum = 23330843;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=23330844;
 //BA.debugLineNum = 23330844;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=23330845;
 //BA.debugLineNum = 23330845;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=23330846;
 //BA.debugLineNum = 23330846;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=23330847;
 //BA.debugLineNum = 23330847;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=23330849;
 //BA.debugLineNum = 23330849;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=23330852;
 //BA.debugLineNum = 23330852;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=23330853;
 //BA.debugLineNum = 23330853;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=23330854;
 //BA.debugLineNum = 23330854;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=23330855;
 //BA.debugLineNum = 23330855;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=23330856;
 //BA.debugLineNum = 23330856;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=23330858;
 //BA.debugLineNum = 23330858;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=23330860;
 //BA.debugLineNum = 23330860;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=23330866;
 //BA.debugLineNum = 23330866;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=23330868;
 //BA.debugLineNum = 23330868;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub ReverseIndexString(arrString() As String, arrI";
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="Dim arrIndex2(arrString.Length) As Int";
_arrindex2 = new int[_arrstring.length];
;
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="iUB = arrString.Length - 1";
_iub = (int) (_arrstring.length-1);
RDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=23461903;
 //BA.debugLineNum = 23461903;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=23461905;
 //BA.debugLineNum = 23461905;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=23461907;
 //BA.debugLineNum = 23461907;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=23461908;
 //BA.debugLineNum = 23461908;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=23461909;
 //BA.debugLineNum = 23461909;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i+1)]]);
 }else {
RDebugUtils.currentLine=23461911;
 //BA.debugLineNum = 23461911;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i-1)]]);
 };
RDebugUtils.currentLine=23461913;
 //BA.debugLineNum = 23461913;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=23461914;
 //BA.debugLineNum = 23461914;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=23461915;
 //BA.debugLineNum = 23461915;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=23461916;
 //BA.debugLineNum = 23461916;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=23461917;
 //BA.debugLineNum = 23461917;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=23461918;
 //BA.debugLineNum = 23461918;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=23461919;
 //BA.debugLineNum = 23461919;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=23461921;
 //BA.debugLineNum = 23461921;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=23461924;
 //BA.debugLineNum = 23461924;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=23461925;
 //BA.debugLineNum = 23461925;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=23461926;
 //BA.debugLineNum = 23461926;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=23461927;
 //BA.debugLineNum = 23461927;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=23461928;
 //BA.debugLineNum = 23461928;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=23461931;
 //BA.debugLineNum = 23461931;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=23461933;
 //BA.debugLineNum = 23461933;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=23461939;
 //BA.debugLineNum = 23461939;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=23461941;
 //BA.debugLineNum = 23461941;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12713991;
 //BA.debugLineNum = 12713991;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=12713995;
 //BA.debugLineNum = 12713995;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=12714000;
 //BA.debugLineNum = 12714000;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=12714001;
 //BA.debugLineNum = 12714001;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=12714005;
 //BA.debugLineNum = 12714005;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, H";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(","),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=12714006;
 //BA.debugLineNum = 12714006;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub SaveTableToCSV2(Dir As String, Filename";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Dim headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Private headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=12779532;
 //BA.debugLineNum = 12779532;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=12779533;
 //BA.debugLineNum = 12779533;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12779534;
 //BA.debugLineNum = 12779534;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=12779535;
 //BA.debugLineNum = 12779535;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=12779537;
 //BA.debugLineNum = 12779537;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=12779538;
 //BA.debugLineNum = 12779538;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=12779542;
 //BA.debugLineNum = 12779542;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, SeparatorCha";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=12779543;
 //BA.debugLineNum = 12779543;BA.debugLine="End Sub";
return "";
}
public String  _scaletable(b4a.example.ef.table __ref,double _scalex,double _scaley,boolean _scalealldone) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "scaletable", false))
	 {return ((String) Debug.delegate(ba, "scaletable", new Object[] {_scalex,_scaley,_scalealldone}));}
int _i = 0;
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Public Sub ScaleTable(ScaleX As Double, ScaleY As";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="ToastMessageShow(\"Table.ScaleTable must be calle";
__c.ToastMessageShow(BA.ObjectToCharSequence("Table.ScaleTable must be called before filling the Table"),__c.False);
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="Log(\"Table.ScaleTable must be called before fill";
__c.LogImpl("319922947","Table.ScaleTable must be called before filling the Table",0);
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=19922951;
 //BA.debugLineNum = 19922951;BA.debugLine="cTextSize = cTextSize * Min(ScaleX, ScaleY)";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *__c.Min(_scalex,_scaley));
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="cLineWidth = cLineWidth * ScaleX";
__ref._clinewidth /*int*/  = (int) (__ref._clinewidth /*int*/ *_scalex);
RDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="ExtraWidth = ExtraWidth * ScaleX";
__ref._extrawidth /*int*/  = (int) (__ref._extrawidth /*int*/ *_scalex);
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="cRowHeight  = cRowHeight * ScaleY";
__ref._crowheight /*int*/  = (int) (__ref._crowheight /*int*/ *_scaley);
RDebugUtils.currentLine=19922955;
 //BA.debugLineNum = 19922955;BA.debugLine="cHeaderHeight = cHeaderHeight * ScaleY";
__ref._cheaderheight /*int*/  = (int) (__ref._cheaderheight /*int*/ *_scaley);
RDebugUtils.currentLine=19922956;
 //BA.debugLineNum = 19922956;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=19922957;
 //BA.debugLineNum = 19922957;BA.debugLine="ColumnWidths(i) = ColumnWidths(i) * ScaleX";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._columnwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=19922958;
 //BA.debugLineNum = 19922958;BA.debugLine="DataWidths(i) = DataWidths(i) * ScaleX";
__ref._datawidths /*int[]*/ [_i] = (int) (__ref._datawidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=19922959;
 //BA.debugLineNum = 19922959;BA.debugLine="HeaderWidths(i) = HeaderWidths(i)	* ScaleX";
__ref._headerwidths /*int[]*/ [_i] = (int) (__ref._headerwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=19922960;
 //BA.debugLineNum = 19922960;BA.debugLine="SavedWidths(i) = SavedWidths(i)	* ScaleX";
__ref._savedwidths /*int[]*/ [_i] = (int) (__ref._savedwidths /*int[]*/ [_i]*_scalex);
 }
};
RDebugUtils.currentLine=19922963;
 //BA.debugLineNum = 19922963;BA.debugLine="If ScaleAllDone = False Then";
if (_scalealldone==__c.False) { 
RDebugUtils.currentLine=19922964;
 //BA.debugLineNum = 19922964;BA.debugLine="cLeft = cLeft * ScaleX";
__ref._cleft /*int*/  = (int) (__ref._cleft /*int*/ *_scalex);
RDebugUtils.currentLine=19922965;
 //BA.debugLineNum = 19922965;BA.debugLine="cTop = cTop * ScaleY";
__ref._ctop /*int*/  = (int) (__ref._ctop /*int*/ *_scaley);
RDebugUtils.currentLine=19922966;
 //BA.debugLineNum = 19922966;BA.debugLine="cWidth = cWidth * ScaleX";
__ref._cwidth /*int*/  = (int) (__ref._cwidth /*int*/ *_scalex);
RDebugUtils.currentLine=19922967;
 //BA.debugLineNum = 19922967;BA.debugLine="cHeight = cHeight * ScaleY";
__ref._cheight /*int*/  = (int) (__ref._cheight /*int*/ *_scaley);
RDebugUtils.currentLine=19922969;
 //BA.debugLineNum = 19922969;BA.debugLine="cTextSize = cTextSize * ScaleY";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *_scaley);
RDebugUtils.currentLine=19922970;
 //BA.debugLineNum = 19922970;BA.debugLine="pnlTable.Left = cLeft";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._cleft /*int*/ );
RDebugUtils.currentLine=19922971;
 //BA.debugLineNum = 19922971;BA.debugLine="pnlTable.Top = cTop";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._ctop /*int*/ );
RDebugUtils.currentLine=19922972;
 //BA.debugLineNum = 19922972;BA.debugLine="pnlTable.Width = cWidth";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._cwidth /*int*/ );
RDebugUtils.currentLine=19922973;
 //BA.debugLineNum = 19922973;BA.debugLine="pnlTable.Height = cHeight";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheight /*int*/ );
RDebugUtils.currentLine=19922974;
 //BA.debugLineNum = 19922974;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=19922975;
 //BA.debugLineNum = 19922975;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=19922976;
 //BA.debugLineNum = 19922976;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=19922977;
 //BA.debugLineNum = 19922977;BA.debugLine="SV2.Width = cWidth";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(__ref._cwidth /*int*/ );
 }else {
RDebugUtils.currentLine=19922979;
 //BA.debugLineNum = 19922979;BA.debugLine="SVF.Width = SVF.Width * ScaleX";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=19922980;
 //BA.debugLineNum = 19922980;BA.debugLine="SV2.Width = SV2.Width * ScaleX";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=19922981;
 //BA.debugLineNum = 19922981;BA.debugLine="SV2.Left = SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=19922983;
 //BA.debugLineNum = 19922983;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=19922984;
 //BA.debugLineNum = 19922984;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=19922985;
 //BA.debugLineNum = 19922985;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=19922986;
 //BA.debugLineNum = 19922986;BA.debugLine="SV2.Height = cHeight - cStatusLineHeight - cHea";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=19922987;
 //BA.debugLineNum = 19922987;BA.debugLine="SVF.Height = cHeight - cStatusLineHeight - cHea";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=19922989;
 //BA.debugLineNum = 19922989;BA.debugLine="SV2.Height = cHeight - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=19922990;
 //BA.debugLineNum = 19922990;BA.debugLine="SVF.Height = cHeight - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=19922992;
 //BA.debugLineNum = 19922992;BA.debugLine="lblFastScroll.Width = lblFastScroll.Width * Scal";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=19922993;
 //BA.debugLineNum = 19922993;BA.debugLine="lblFastScroll.Height = lblFastScroll.Height * Sc";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()*_scaley));
RDebugUtils.currentLine=19922995;
 //BA.debugLineNum = 19922995;BA.debugLine="lblFastScroll.TextSize = lblFastScroll.TextSize";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize()*_scaley));
RDebugUtils.currentLine=19922996;
 //BA.debugLineNum = 19922996;BA.debugLine="lblFastScroll.Left = lblFastScroll.Left * ScaleX";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getLeft()*_scalex));
RDebugUtils.currentLine=19922997;
 //BA.debugLineNum = 19922997;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=19922998;
 //BA.debugLineNum = 19922998;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=19922999;
 //BA.debugLineNum = 19922999;BA.debugLine="lblStatusLine.TextSize = cTextSize";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=19923000;
 //BA.debugLineNum = 19923000;BA.debugLine="lblStatusLine.Height = cStatusLineHeight";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._cstatuslineheight /*int*/ );
RDebugUtils.currentLine=19923001;
 //BA.debugLineNum = 19923001;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=19923003;
 //BA.debugLineNum = 19923003;BA.debugLine="CreateNewLabels";
__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
RDebugUtils.currentLine=19923004;
 //BA.debugLineNum = 19923004;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub Scroll(PosX As Int, PosY As Int)";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)__ref._crowheight /*int*/ -30));
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV2.Heigh";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,(_posy+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="If minVisibleRow > -1 Then";
if (__ref._minvisiblerow /*int*/ >-1) { 
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="If minVisibleRow < currentMin Then";
if (__ref._minvisiblerow /*int*/ <_currentmin) { 
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,__ref._maxvisiblerow /*int*/ ));
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="Else If minVisibleRow > currentMin Then";
if (__ref._minvisiblerow /*int*/ >_currentmin) { 
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(__ref._minvisiblerow /*int*/ -1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
RDebugUtils.currentLine=11403280;
 //BA.debugLineNum = 11403280;BA.debugLine="If maxVisibleRow > currentMax Then";
if (__ref._maxvisiblerow /*int*/ >_currentmax) { 
RDebugUtils.currentLine=11403282;
 //BA.debugLineNum = 11403282;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,__ref._minvisiblerow /*int*/ ));
_i = __ref._maxvisiblerow /*int*/  ;
for (;_i >= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=11403283;
 //BA.debugLineNum = 11403283;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=11403285;
 //BA.debugLineNum = 11403285;BA.debugLine="Else If maxVisibleRow < currentMax Then";
if (__ref._maxvisiblerow /*int*/ <_currentmax) { 
RDebugUtils.currentLine=11403287;
 //BA.debugLineNum = 11403287;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(__ref._maxvisiblerow /*int*/ +1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=11403288;
 //BA.debugLineNum = 11403288;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
 };
RDebugUtils.currentLine=11403292;
 //BA.debugLineNum = 11403292;BA.debugLine="minVisibleRow = currentMin";
__ref._minvisiblerow /*int*/  = _currentmin;
RDebugUtils.currentLine=11403293;
 //BA.debugLineNum = 11403293;BA.debugLine="maxVisibleRow = currentMax";
__ref._maxvisiblerow /*int*/  = _currentmax;
RDebugUtils.currentLine=11403294;
 //BA.debugLineNum = 11403294;BA.debugLine="Header.Left = -PosX + mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-_posx+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=11403295;
 //BA.debugLineNum = 11403295;BA.debugLine="lblStatusLine.Left = - PosX";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (-_posx));
RDebugUtils.currentLine=11403296;
 //BA.debugLineNum = 11403296;BA.debugLine="End Sub";
return "";
}
public String  _setallowselection(b4a.example.ef.table __ref,boolean _allowselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setallowselection", false))
	 {return ((String) Debug.delegate(ba, "setallowselection", new Object[] {_allowselection}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="cAllowSelection = AllowSelection";
__ref._callowselection /*boolean*/  = _allowselection;
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
 };
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub SetAutomaticWidths";
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Dim row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="Dim Vals(mNumberOfColumns) As String";
_vals = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_vals,"");
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="Dim Width, Widths(mNumberOfColumns) As Int";
_width = 0;
_widths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="cAutomaticWidths = True";
__ref._cautomaticwidths /*boolean*/  = __c.True;
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="For row = 0 To Data.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=19660815;
 //BA.debugLineNum = 19660815;BA.debugLine="Vals = Data.Get(row)";
_vals = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=19660816;
 //BA.debugLineNum = 19660816;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19660817;
 //BA.debugLineNum = 19660817;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=19660819;
 //BA.debugLineNum = 19660819;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=19660821;
 //BA.debugLineNum = 19660821;BA.debugLine="If Widths(col) < Width Then";
if (_widths[_col]<_width) { 
RDebugUtils.currentLine=19660822;
 //BA.debugLineNum = 19660822;BA.debugLine="Widths(col) = Width";
_widths[_col] = _width;
 };
 }
};
 }
};
RDebugUtils.currentLine=19660826;
 //BA.debugLineNum = 19660826;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=19660827;
 //BA.debugLineNum = 19660827;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignment", false))
	 {return ((String) Debug.delegate(ba, "setcellalignment", new Object[] {_alignment}));}
int _i = 0;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="cAlignment = Alignment";
__ref._calignment /*int*/  = _alignment;
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="MultiAlignments = False";
__ref._multialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setcellalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub SetCellAlignmentColN(Col As Int, Alignm";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=15335434;
 //BA.debugLineNum = 15335434;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=15335436;
 //BA.debugLineNum = 15335436;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=15335439;
 //BA.debugLineNum = 15335439;BA.debugLine="cAlignments(Col) = AlignmentColN";
__ref._calignments /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=15335440;
 //BA.debugLineNum = 15335440;BA.debugLine="cAlignments0 = cAlignments";
__ref._calignments0 /*int[]*/  = __ref._calignments /*int[]*/ ;
RDebugUtils.currentLine=15335442;
 //BA.debugLineNum = 15335442;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=15335443;
 //BA.debugLineNum = 15335443;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=15335444;
 //BA.debugLineNum = 15335444;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=15335446;
 //BA.debugLineNum = 15335446;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignments", false))
	 {return ((String) Debug.delegate(ba, "setcellalignments", new Object[] {_alignments}));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="cAlignments0 = Alignments";
__ref._calignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="cAlignments = cAlignments0";
__ref._calignments /*int[]*/  = __ref._calignments0 /*int[]*/ ;
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="End Sub";
return "";
}
public String  _setcolumncolors(b4a.example.ef.table __ref,int[] _columncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setcolumncolors", new Object[] {_columncolors}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="cColumnColors = ColumnColors";
__ref._ccolumncolors /*int[]*/  = _columncolors;
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Dim ColumnDrawables(cColumnColors.Length) As Obje";
_columndrawables = new Object[__ref._ccolumncolors /*int[]*/ .length];
{
int d0 = _columndrawables.length;
for (int i0 = 0;i0 < d0;i0++) {
_columndrawables[i0] = new Object();
}
}
;
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="Private cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="cd.Initialize(cColumnColors(i), 0)";
_cd.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="ColumnDrawables(i) = cd";
__ref._columndrawables /*Object[]*/ [_i] = (Object)(_cd.getObject());
 }
};
RDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="If ColumnColors.Length > 1 Then";
if (_columncolors.length>1) { 
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="cUseColumnColors = True";
__ref._cusecolumncolors /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="cUseColumnColors = False";
__ref._cusecolumncolors /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=18808848;
 //BA.debugLineNum = 18808848;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=18808850;
 //BA.debugLineNum = 18808850;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatype(b4a.example.ef.table __ref,int _column,String _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatype", new Object[] {_column,_datatype}));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub SetColumnDataType(Column As Int, DataTy";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="If DataType <> \"T\" And DataType <> \"R\" And DataTy";
if ((_datatype).equals("T") == false && (_datatype).equals("R") == false && (_datatype).equals("I") == false) { 
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="ToastMessageShow(\"Wrong data type only TEXT abd";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only TEXT abd NUMBER are allowed"),__c.False);
 }else {
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="cColumnDataType(Column) = DataType";
__ref._ccolumndatatype /*String[]*/ [_column] = _datatype;
 };
RDebugUtils.currentLine=20119563;
 //BA.debugLineNum = 20119563;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatypes(b4a.example.ef.table __ref,String[] _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatypes", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatypes", new Object[] {_datatype}));}
int _col = 0;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub SetColumnDataTypes(DataType() As String";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="If DataType.Length <> mNumberOfColumns Then";
if (_datatype.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="ToastMessageShow(\"Wrong number of columns\", Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong number of columns"),__c.False);
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="For Col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="If DataType(Col) <> \"T\" And DataType(Col) <> \"R\"";
if ((_datatype[_col]).equals("T") == false && (_datatype[_col]).equals("R") == false && (_datatype[_col]).equals("I") == false) { 
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="ToastMessageShow(\"Wrong data type only T, R and";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only T, R and I are allowed"),__c.False);
RDebugUtils.currentLine=20250633;
 //BA.debugLineNum = 20250633;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=20250637;
 //BA.debugLineNum = 20250637;BA.debugLine="cColumnDataType = DataType";
__ref._ccolumndatatype /*String[]*/  = _datatype;
RDebugUtils.currentLine=20250638;
 //BA.debugLineNum = 20250638;BA.debugLine="End Sub";
return "";
}
public String  _setfastscroll(b4a.example.ef.table __ref,boolean _fastscroll) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscroll", false))
	 {return ((String) Debug.delegate(ba, "setfastscroll", new Object[] {_fastscroll}));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub setFastScroll (FastScroll As Boolean)";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="mFastScroll = FastScroll";
__ref._mfastscroll /*boolean*/  = _fastscroll;
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollcolumnindex(b4a.example.ef.table __ref,int _fastscrollcolumnindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollcolumnindex", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollcolumnindex", new Object[] {_fastscrollcolumnindex}));}
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub setFastScrollColumnIndex (FastScrollCol";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="mFastScrollColumnIndex = Max(0, FastScrollColumnI";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Max(0,_fastscrollcolumnindex));
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="mFastScrollColumnIndex = Min(mFastScrollColumnInd";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Min(__ref._mfastscrollcolumnindex /*int*/ ,__ref._mnumberofcolumns /*int*/ -1));
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollfixedlabel(b4a.example.ef.table __ref,boolean _fastscrollfixedlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollfixedlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollfixedlabel", new Object[] {_fastscrollfixedlabel}));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Public Sub setFastScrollFixedLabel (FastScrollFixe";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="mFastScrollFixedLabel = FastScrollFixedLabel";
__ref._mfastscrollfixedlabel /*boolean*/  = _fastscrollfixedlabel;
RDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=22085639;
 //BA.debugLineNum = 22085639;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=22085641;
 //BA.debugLineNum = 22085641;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=22085642;
 //BA.debugLineNum = 22085642;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelheight", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelheight", new Object[] {_height}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub setFastScrollLabelHeight(Height As Int)";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="mFastScrollLabelHeight = Height";
__ref._mfastscrolllabelheight /*int*/  = _height;
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="lblFastScroll.Height = mFastScrollLabelHeight";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._mfastscrolllabelheight /*int*/ );
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight -";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelmaxchars(b4a.example.ef.table __ref,int _fastscrolllabelmaxchars) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelmaxchars", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelmaxchars", new Object[] {_fastscrolllabelmaxchars}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub setFastScrollLabelMaxChars(FastScrollLa";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="mFastScrollLabelMaxChars = FastScrollLabelMaxChar";
__ref._mfastscrolllabelmaxchars /*int*/  = _fastscrolllabelmaxchars;
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelwidth", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelwidth", new Object[] {_width}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub setFastScrollLabelWidth(Width As Int)";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="mFastScrollLabelWidth = Width";
__ref._mfastscrolllabelwidth /*int*/  = _width;
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="lblFastScroll.Width = mFastScrollLabelWidth";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._mfastscrolllabelwidth /*int*/ );
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
 }else {
RDebugUtils.currentLine=22347782;
 //BA.debugLineNum = 22347782;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
 };
RDebugUtils.currentLine=22347784;
 //BA.debugLineNum = 22347784;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollminitems(b4a.example.ef.table __ref,int _fastscrollminitems) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollminitems", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollminitems", new Object[] {_fastscrollminitems}));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub setFastScrollMinItems (FastScrollMinIte";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="mFastScrollMinItems = FastScrollMinItems";
__ref._mfastscrollminitems /*int*/  = _fastscrollminitems;
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollshowlabel(b4a.example.ef.table __ref,boolean _fastscrollshowlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollshowlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollshowlabel", new Object[] {_fastscrollshowlabel}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub setFastScrollShowLabel (FastScrollShowL";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="mFastScrollShowLabel = FastScrollShowLabel";
__ref._mfastscrollshowlabel /*boolean*/  = _fastscrollshowlabel;
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="End Sub";
return "";
}
public String  _setfirstcolumnfixed(b4a.example.ef.table __ref,boolean _firstcolumnfixed) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfirstcolumnfixed", false))
	 {return ((String) Debug.delegate(ba, "setfirstcolumnfixed", new Object[] {_firstcolumnfixed}));}
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub setFirstColumnFixed(FirstColumnFixed As";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="If FirstColumnFixed = True Then";
if (_firstcolumnfixed==__c.True) { 
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="setNumberOfFixedColumns(1)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (1));
 };
 }else {
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="If mNumberOfFixedColumns = 1 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==1) { 
RDebugUtils.currentLine=21299207;
 //BA.debugLineNum = 21299207;BA.debugLine="setNumberOfFixedColumns(0)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (0));
 };
 };
RDebugUtils.currentLine=21299210;
 //BA.debugLineNum = 21299210;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub setNumberOfFixedColumns(NumberOfFixedCo";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="NumberOfFixedColumns = Max(0, Min(3, NumberOfFixe";
_numberoffixedcolumns = (int) (__c.Max(0,__c.Min(3,_numberoffixedcolumns)));
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="If mNumberOfFixedColumns = NumberOfFixedColumns T";
if (__ref._mnumberoffixedcolumns /*int*/ ==_numberoffixedcolumns) { 
RDebugUtils.currentLine=21168131;
 //BA.debugLineNum = 21168131;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="If Header.NumberOfViews = 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=21168135;
 //BA.debugLineNum = 21168135;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns	'Ne";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
 }else {
RDebugUtils.currentLine=21168137;
 //BA.debugLineNum = 21168137;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=21168139;
 //BA.debugLineNum = 21168139;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=21168140;
 //BA.debugLineNum = 21168140;BA.debugLine="If HeaderFirst.NumberOfViews = 0 Then";
if (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=21168141;
 //BA.debugLineNum = 21168141;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=21168142;
 //BA.debugLineNum = 21168142;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21168143;
 //BA.debugLineNum = 21168143;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=21168144;
 //BA.debugLineNum = 21168144;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 }else {
RDebugUtils.currentLine=21168147;
 //BA.debugLineNum = 21168147;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=21168148;
 //BA.debugLineNum = 21168148;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21168149;
 //BA.debugLineNum = 21168149;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=21168150;
 //BA.debugLineNum = 21168150;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
RDebugUtils.currentLine=21168152;
 //BA.debugLineNum = 21168152;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=21168153;
 //BA.debugLineNum = 21168153;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=21168154;
 //BA.debugLineNum = 21168154;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=21168155;
 //BA.debugLineNum = 21168155;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 };
RDebugUtils.currentLine=21168159;
 //BA.debugLineNum = 21168159;BA.debugLine="HeaderFirst.RemoveAllViews";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=21168160;
 //BA.debugLineNum = 21168160;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=21168162;
 //BA.debugLineNum = 21168162;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
RDebugUtils.currentLine=21168164;
 //BA.debugLineNum = 21168164;BA.debugLine="innerClearAll(mNumberOfColumns, False)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.False);
RDebugUtils.currentLine=21168165;
 //BA.debugLineNum = 21168165;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=21168166;
 //BA.debugLineNum = 21168166;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=21168167;
 //BA.debugLineNum = 21168167;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=21168168;
 //BA.debugLineNum = 21168168;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=21168171;
 //BA.debugLineNum = 21168171;BA.debugLine="Private currentMax As Int";
_currentmax = 0;
RDebugUtils.currentLine=21168172;
 //BA.debugLineNum = 21168172;BA.debugLine="currentMax = Min(Data.Size - 1, SV2.Height / cRo";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=21168174;
 //BA.debugLineNum = 21168174;BA.debugLine="For row = 0 To currentMax";
{
final int step38 = 1;
final int limit38 = _currentmax;
_row = (int) (0) ;
for (;_row <= limit38 ;_row = _row + step38 ) {
RDebugUtils.currentLine=21168175;
 //BA.debugLineNum = 21168175;BA.debugLine="ShowRow(row)";
__ref._showrow /*void*/ (null,_row);
 }
};
 };
RDebugUtils.currentLine=21168179;
 //BA.debugLineNum = 21168179;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignment", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignment", new Object[] {_alignment}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub setHeaderAlignment(Alignment As Int)";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="cHeaderAlignment = Alignment";
__ref._cheaderalignment /*int*/  = _alignment;
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="If cHeaderAlignments.Length = 0 Then";
if (__ref._cheaderalignments /*int[]*/ .length==0) { 
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="Private cHeaderAlignments(mNumberOfColumns) As I";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
 };
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="HeaderMultiAlignments = False";
__ref._headermultialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=15794185;
 //BA.debugLineNum = 15794185;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=15794186;
 //BA.debugLineNum = 15794186;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=15794187;
 //BA.debugLineNum = 15794187;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit9 ;_col = _col + step9 ) {
RDebugUtils.currentLine=15794188;
 //BA.debugLineNum = 15794188;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15794189;
 //BA.debugLineNum = 15794189;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15794190;
 //BA.debugLineNum = 15794190;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=15794192;
 //BA.debugLineNum = 15794192;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=15794193;
 //BA.debugLineNum = 15794193;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15794194;
 //BA.debugLineNum = 15794194;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=15794195;
 //BA.debugLineNum = 15794195;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=15794198;
 //BA.debugLineNum = 15794198;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit20 ;_col = _col + step20 ) {
RDebugUtils.currentLine=15794199;
 //BA.debugLineNum = 15794199;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15794200;
 //BA.debugLineNum = 15794200;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15794201;
 //BA.debugLineNum = 15794201;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=15794205;
 //BA.debugLineNum = 15794205;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub SetHeaderAlignmentColN(Col As Int, Alig";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=15466506;
 //BA.debugLineNum = 15466506;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="cHeaderAlignments0(i) = cHeaderAlignment";
__ref._cheaderalignments0 /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=15466511;
 //BA.debugLineNum = 15466511;BA.debugLine="cHeaderAlignments0(Col) = AlignmentColN";
__ref._cheaderalignments0 /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=15466512;
 //BA.debugLineNum = 15466512;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=15466513;
 //BA.debugLineNum = 15466513;BA.debugLine="If Header.NumberOfViews > 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=15466514;
 //BA.debugLineNum = 15466514;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=15466515;
 //BA.debugLineNum = 15466515;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15466516;
 //BA.debugLineNum = 15466516;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15466517;
 //BA.debugLineNum = 15466517;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=15466519;
 //BA.debugLineNum = 15466519;BA.debugLine="For i = 0 To mNumberOfFixedColumns - 1";
{
final int step21 = 1;
final int limit21 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=15466520;
 //BA.debugLineNum = 15466520;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15466521;
 //BA.debugLineNum = 15466521;BA.debugLine="If Col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=15466522;
 //BA.debugLineNum = 15466522;BA.debugLine="lbl = HeaderFirst.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15466523;
 //BA.debugLineNum = 15466523;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=15466525;
 //BA.debugLineNum = 15466525;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15466526;
 //BA.debugLineNum = 15466526;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col + mNumber";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [(int) (_col+__ref._mnumberoffixedcolumns /*int*/ )]);
 };
 }
};
 };
 };
RDebugUtils.currentLine=15466531;
 //BA.debugLineNum = 15466531;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=15466532;
 //BA.debugLineNum = 15466532;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignments", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignments", new Object[] {_alignments}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub SetHeaderAlignments(Alignments() As Int";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="cHeaderAlignments0 = Alignments";
__ref._cheaderalignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=15400970;
 //BA.debugLineNum = 15400970;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=15400973;
 //BA.debugLineNum = 15400973;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15400975;
 //BA.debugLineNum = 15400975;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15400976;
 //BA.debugLineNum = 15400976;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=15400978;
 //BA.debugLineNum = 15400978;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=15400979;
 //BA.debugLineNum = 15400979;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15400980;
 //BA.debugLineNum = 15400980;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=15400981;
 //BA.debugLineNum = 15400981;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=15400984;
 //BA.debugLineNum = 15400984;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=15400985;
 //BA.debugLineNum = 15400985;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15400986;
 //BA.debugLineNum = 15400986;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15400987;
 //BA.debugLineNum = 15400987;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=15400991;
 //BA.debugLineNum = 15400991;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=15400992;
 //BA.debugLineNum = 15400992;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolor", false))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="cHeaderColor = Color";
__ref._cheadercolor /*int*/  = _color;
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=16056329;
 //BA.debugLineNum = 16056329;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
RDebugUtils.currentLine=16056331;
 //BA.debugLineNum = 16056331;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=16056332;
 //BA.debugLineNum = 16056332;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16056333;
 //BA.debugLineNum = 16056333;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=16056334;
 //BA.debugLineNum = 16056334;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=16056337;
 //BA.debugLineNum = 16056337;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=16056338;
 //BA.debugLineNum = 16056338;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16056339;
 //BA.debugLineNum = 16056339;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=16056340;
 //BA.debugLineNum = 16056340;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=16056344;
 //BA.debugLineNum = 16056344;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolors(b4a.example.ef.table __ref,int[] _headercolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolors", false))
	 {return ((String) Debug.delegate(ba, "setheadercolors", new Object[] {_headercolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="cHeaderColors = HeaderColors";
__ref._cheadercolors /*int[]*/  = _headercolors;
RDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=19070982;
 //BA.debugLineNum = 19070982;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=19070983;
 //BA.debugLineNum = 19070983;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19070984;
 //BA.debugLineNum = 19070984;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19070985;
 //BA.debugLineNum = 19070985;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=19070987;
 //BA.debugLineNum = 19070987;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=19070988;
 //BA.debugLineNum = 19070988;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19070989;
 //BA.debugLineNum = 19070989;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=19070990;
 //BA.debugLineNum = 19070990;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=19070993;
 //BA.debugLineNum = 19070993;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=19070994;
 //BA.debugLineNum = 19070994;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19070995;
 //BA.debugLineNum = 19070995;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19070996;
 //BA.debugLineNum = 19070996;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=19071000;
 //BA.debugLineNum = 19071000;BA.debugLine="End Sub";
return "";
}
public String  _setheaderheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderheight", false))
	 {return ((String) Debug.delegate(ba, "setheaderheight", new Object[] {_height}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="cHeaderHeight = Height";
__ref._cheaderheight /*int*/  = _height;
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=15925254;
 //BA.debugLineNum = 15925254;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=15925255;
 //BA.debugLineNum = 15925255;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=15925256;
 //BA.debugLineNum = 15925256;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15925257;
 //BA.debugLineNum = 15925257;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15925258;
 //BA.debugLineNum = 15925258;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
RDebugUtils.currentLine=15925260;
 //BA.debugLineNum = 15925260;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=15925261;
 //BA.debugLineNum = 15925261;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15925262;
 //BA.debugLineNum = 15925262;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=15925263;
 //BA.debugLineNum = 15925263;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=15925266;
 //BA.debugLineNum = 15925266;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=15925267;
 //BA.debugLineNum = 15925267;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15925268;
 //BA.debugLineNum = 15925268;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=15925269;
 //BA.debugLineNum = 15925269;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=15925273;
 //BA.debugLineNum = 15925273;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=15925274;
 //BA.debugLineNum = 15925274;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=15925275;
 //BA.debugLineNum = 15925275;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=15925276;
 //BA.debugLineNum = 15925276;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight -";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ -__ref._cstatuslineheight /*int*/ ));
 }else {
RDebugUtils.currentLine=15925278;
 //BA.debugLineNum = 15925278;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=15925280;
 //BA.debugLineNum = 15925280;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=15925281;
 //BA.debugLineNum = 15925281;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
 };
RDebugUtils.currentLine=15925283;
 //BA.debugLineNum = 15925283;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolor", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="cHeaderTextColor = Color";
__ref._cheadertextcolor /*int*/  = _color;
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=16187403;
 //BA.debugLineNum = 16187403;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=16187404;
 //BA.debugLineNum = 16187404;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=16187406;
 //BA.debugLineNum = 16187406;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=16187409;
 //BA.debugLineNum = 16187409;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=16187410;
 //BA.debugLineNum = 16187410;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=16187411;
 //BA.debugLineNum = 16187411;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=16187412;
 //BA.debugLineNum = 16187412;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=16187416;
 //BA.debugLineNum = 16187416;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolors(b4a.example.ef.table __ref,int[] _headertextcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolors", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolors", new Object[] {_headertextcolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="cHeaderTextColors = HeaderTextColors";
__ref._cheadertextcolors /*int[]*/  = _headertextcolors;
RDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19202057;
 //BA.debugLineNum = 19202057;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=19202062;
 //BA.debugLineNum = 19202062;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=19202065;
 //BA.debugLineNum = 19202065;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=19202066;
 //BA.debugLineNum = 19202066;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19202067;
 //BA.debugLineNum = 19202067;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19202068;
 //BA.debugLineNum = 19202068;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=19202072;
 //BA.debugLineNum = 19202072;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypeface(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _headertypeface) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypeface", false))
	 {return ((String) Debug.delegate(ba, "setheadertypeface", new Object[] {_headertypeface}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub setHeaderTypeFace(HeaderTypeFace As Typ";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="cHeaderTypeFace = HeaderTypeFace";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypeface;
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=19333125;
 //BA.debugLineNum = 19333125;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19333132;
 //BA.debugLineNum = 19333132;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=19333133;
 //BA.debugLineNum = 19333133;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=19333136;
 //BA.debugLineNum = 19333136;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=19333137;
 //BA.debugLineNum = 19333137;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19333138;
 //BA.debugLineNum = 19333138;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19333139;
 //BA.debugLineNum = 19333139;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
RDebugUtils.currentLine=19333143;
 //BA.debugLineNum = 19333143;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _headertypefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypefaces", false))
	 {return ((String) Debug.delegate(ba, "setheadertypefaces", new Object[] {_headertypefaces}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub SetHeaderTypeFaces(HeaderTypeFaces() As";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="If HeaderTypeFaces.Length = 1 Then";
if (_headertypefaces.length==1) { 
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="cHeaderTypeFace = HeaderTypeFaces(0)";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypefaces[(int) (0)];
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=19398662;
 //BA.debugLineNum = 19398662;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=19398669;
 //BA.debugLineNum = 19398669;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=19398670;
 //BA.debugLineNum = 19398670;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=19398672;
 //BA.debugLineNum = 19398672;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=19398675;
 //BA.debugLineNum = 19398675;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=19398676;
 //BA.debugLineNum = 19398676;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19398677;
 //BA.debugLineNum = 19398677;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19398678;
 //BA.debugLineNum = 19398678;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
 }else {
RDebugUtils.currentLine=19398683;
 //BA.debugLineNum = 19398683;BA.debugLine="If HeaderTypeFaces.Length <> mNumberOfColumns Th";
if (_headertypefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19398684;
 //BA.debugLineNum = 19398684;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=19398685;
 //BA.debugLineNum = 19398685;BA.debugLine="Log(\"SetHeaderTypeFaces: Invalid number of colu";
__c.LogImpl("319398685","SetHeaderTypeFaces: Invalid number of columns",0);
RDebugUtils.currentLine=19398686;
 //BA.debugLineNum = 19398686;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=19398688;
 //BA.debugLineNum = 19398688;BA.debugLine="cHeaderTypeFaces0 = HeaderTypeFaces";
__ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _headertypefaces;
RDebugUtils.currentLine=19398689;
 //BA.debugLineNum = 19398689;BA.debugLine="cHeaderTypeFaces = cHeaderTypeFaces0";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=19398690;
 //BA.debugLineNum = 19398690;BA.debugLine="HeaderMultiTypeFace = True";
__ref._headermultitypeface /*boolean*/  = __c.True;
RDebugUtils.currentLine=19398691;
 //BA.debugLineNum = 19398691;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numb";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=19398692;
 //BA.debugLineNum = 19398692;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=19398693;
 //BA.debugLineNum = 19398693;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step36 = 1;
final int limit36 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit36 ;_col = _col + step36 ) {
RDebugUtils.currentLine=19398694;
 //BA.debugLineNum = 19398694;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19398695;
 //BA.debugLineNum = 19398695;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19398696;
 //BA.debugLineNum = 19398696;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
RDebugUtils.currentLine=19398698;
 //BA.debugLineNum = 19398698;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfC";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=19398699;
 //BA.debugLineNum = 19398699;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19398700;
 //BA.debugLineNum = 19398700;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedCol";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=19398701;
 //BA.debugLineNum = 19398701;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 }else {
RDebugUtils.currentLine=19398704;
 //BA.debugLineNum = 19398704;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step47 = 1;
final int limit47 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit47 ;_col = _col + step47 ) {
RDebugUtils.currentLine=19398705;
 //BA.debugLineNum = 19398705;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19398706;
 //BA.debugLineNum = 19398706;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=19398707;
 //BA.debugLineNum = 19398707;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 };
 };
 };
 };
RDebugUtils.currentLine=19398713;
 //BA.debugLineNum = 19398713;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheight", false))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_height}));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub setHeight(Height As Int)";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="pnlTable.Height = Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(_height);
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="SVF.Height = Height - cStatusLineHeight - cHeade";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="SV2.Height = Height - cStatusLineHeight - cHeade";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="SVF.Height = Height - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="SV2.Height = Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=14614541;
 //BA.debugLineNum = 14614541;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=14614543;
 //BA.debugLineNum = 14614543;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=14614544;
 //BA.debugLineNum = 14614544;BA.debugLine="End Sub";
return "";
}
public String  _setleft(b4a.example.ef.table __ref,int _left) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setleft", false))
	 {return ((String) Debug.delegate(ba, "setleft", new Object[] {_left}));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub setLeft(Left As Int)";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="pnlTable.Left = Left";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_left);
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(b4a.example.ef.table __ref,int _linewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setlinewidth", false))
	 {return ((String) Debug.delegate(ba, "setlinewidth", new Object[] {_linewidth}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="cLineWidth = LineWidth";
__ref._clinewidth /*int*/  = _linewidth;
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="End Sub";
return "";
}
public String  _setmulticolumnsort(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmulticolumnsort", false))
	 {return ((String) Debug.delegate(ba, "setmulticolumnsort", new Object[] {_bdo}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub setMultiColumnSort(bDo As Boolean)";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="mMultiColumnSort = bDo";
__ref._mmulticolumnsort /*boolean*/  = _bdo;
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="End Sub";
return "";
}
public String  _setmultiselect(b4a.example.ef.table __ref,boolean _multiselect) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmultiselect", false))
	 {return ((String) Debug.delegate(ba, "setmultiselect", new Object[] {_multiselect}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Public Sub setMultiSelect(MultiSelect As Boolean)";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="mMultiSelect = MultiSelect";
__ref._mmultiselect /*boolean*/  = _multiselect;
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="End Sub";
return "";
}
public String  _setnumberofcolumns(b4a.example.ef.table __ref,int _numberofcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setnumberofcolumns", false))
	 {return ((String) Debug.delegate(ba, "setnumberofcolumns", new Object[] {_numberofcolumns}));}
int _col = 0;
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub setNumberOfColumns (NumberOfColumns As";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=20447244;
 //BA.debugLineNum = 20447244;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }
};
RDebugUtils.currentLine=20447246;
 //BA.debugLineNum = 20447246;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor1(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor1", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor1", new Object[] {_color}));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub setRowColor1(Color As Int)";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="cRowColor1 = Color";
__ref._crowcolor1 /*int*/  = _color;
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor2(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor2", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor2", new Object[] {_color}));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Public Sub setRowColor2(Color As Int)";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="cRowColor2 = Color";
__ref._crowcolor2 /*int*/  = _color;
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Public Sub SetRowColorN(Row As Int, Color As Int)";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Private New = False As Boolean";
_new = __c.False;
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="If lstRowColors.IndexOf(Color) >= 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))>=0) { 
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.IndexOf";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))+2));
 }else {
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="lstRowColors.Add(Color)";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_color));
RDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.Size +";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()+1));
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="New = True";
_new = __c.True;
 };
RDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="Private cdi(mNumberOfColumns) As Object";
_cdi = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cdi.length;
for (int i0 = 0;i0 < d0;i0++) {
_cdi[i0] = new Object();
}
}
;
RDebugUtils.currentLine=16580621;
 //BA.debugLineNum = 16580621;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=16580622;
 //BA.debugLineNum = 16580622;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=16580623;
 //BA.debugLineNum = 16580623;BA.debugLine="cdw.Initialize(Color, 0)";
_cdw.Initialize(_color,(int) (0));
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="cdi(col) = cdw";
_cdi[_col] = (Object)(_cdw.getObject());
 }
};
RDebugUtils.currentLine=16580626;
 //BA.debugLineNum = 16580626;BA.debugLine="If New = False Then";
if (_new==__c.False) { 
RDebugUtils.currentLine=16580627;
 //BA.debugLineNum = 16580627;BA.debugLine="lstRowDrawables.Set(lstRowColors.IndexOf(Color)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Set(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color)),(Object)(_cdi));
 }else {
RDebugUtils.currentLine=16580629;
 //BA.debugLineNum = 16580629;BA.debugLine="lstRowDrawables.Add(cdi)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cdi));
 };
RDebugUtils.currentLine=16580634;
 //BA.debugLineNum = 16580634;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=16580636;
 //BA.debugLineNum = 16580636;BA.debugLine="End Sub";
return "";
}
public String  _setrowheight(b4a.example.ef.table __ref,int _rowheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowheight", false))
	 {return ((String) Debug.delegate(ba, "setrowheight", new Object[] {_rowheight}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
RDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="If cRowHeight = cHeaderHeight Then";
if (__ref._crowheight /*int*/ ==__ref._cheaderheight /*int*/ ) { 
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="setHeaderHeight(RowHeight)";
__ref._setheaderheight /*String*/ (null,_rowheight);
 };
RDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="cRowHeight = RowHeight";
__ref._crowheight /*int*/  = _rowheight;
RDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcellcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcellcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcellcolor", new Object[] {_color}));}
RDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="cSelectedCellColor = Color";
__ref._cselectedcellcolor /*int*/  = _color;
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcelltextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcelltextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcelltextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Public Sub setSelectedCellTextColor(TextColor As I";
RDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="cSelectedCellTextColor = TextColor";
__ref._cselectedcelltextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowcolor", new Object[] {_color}));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="cSelectedRowColor = Color";
__ref._cselectedrowcolor /*int*/  = _color;
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowtextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowtextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowtextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Public Sub setSelectedRowTextColor(TextColor As In";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="cSelectedRowTextColor = TextColor";
__ref._cselectedrowtextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Private row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="cSingleLine = SingleLine";
__ref._csingleline /*boolean*/  = _singleline;
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="For row = 0 To LabelsCache.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit4 ;_row = _row + step4 ) {
RDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="Private lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="lbls = LabelsCache.Get(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="jo = lbls(col)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbls[_col].getObject()));
RDebugUtils.currentLine=19529740;
 //BA.debugLineNum = 19529740;BA.debugLine="jo.RunMethod(\"setSingleLine\", Array(cSingleLin";
_jo.RunMethod("setSingleLine",new Object[]{(Object)(__ref._csingleline /*boolean*/ )});
 }
};
 }
};
 };
RDebugUtils.currentLine=19529745;
 //BA.debugLineNum = 19529745;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapcolor", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapcolor", new Object[] {_color}));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub setSortBitmapColor(Color As Int)";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="cSortBitmapColor = Color";
__ref._csortbitmapcolor /*int*/  = _color;
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapwidth", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapwidth", new Object[] {_width}));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub setSortBitmapWidth(Width As Int)";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="cSortBitmapWidth = Width";
__ref._csortbitmapwidth /*int*/  = _width;
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="End Sub";
return "";
}
public String  _setsortcaseinsensitive(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcaseinsensitive", false))
	 {return ((String) Debug.delegate(ba, "setsortcaseinsensitive", new Object[] {_bdo}));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Public Sub setSortCaseInsensitive(bDo As Boolean)";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="mSortCaseInsensitive = bDo";
__ref._msortcaseinsensitive /*boolean*/  = _bdo;
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="End Sub";
return "";
}
public String  _setsortcolumn(b4a.example.ef.table __ref,boolean _sortcolumn) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcolumn", false))
	 {return ((String) Debug.delegate(ba, "setsortcolumn", new Object[] {_sortcolumn}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="cSortColumn = SortColumn";
__ref._csortcolumn /*boolean*/  = _sortcolumn;
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="End Sub";
return "";
}
public String  _setsortingbitmaps(b4a.example.ef.table __ref,String _bitmapascfilename,String _bitmapdesfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortingbitmaps", false))
	 {return ((String) Debug.delegate(ba, "setsortingbitmaps", new Object[] {_bitmapascfilename,_bitmapdesfilename}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub SetSortingBitmaps(BitmapAscFilename As";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="bmpAsc.Initialize(File.DirAssets, BitmapAscFilena";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapascfilename);
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="bmpDes.Initialize(File.DirAssets, BitmapDesFilena";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapdesfilename);
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="mCustomSortingBitmaps = True";
__ref._mcustomsortingbitmaps /*boolean*/  = __c.True;
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="End Sub";
return "";
}
public String  _setsortremoveaccents(b4a.example.ef.table __ref,boolean _sortremoveaccents) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortremoveaccents", false))
	 {return ((String) Debug.delegate(ba, "setsortremoveaccents", new Object[] {_sortremoveaccents}));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub setSortRemoveAccents(SortRemoveAccents";
RDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="cSortRemoveAccents = SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = _sortremoveaccents;
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="End Sub";
return "";
}
public String  _setstatuslineheight(b4a.example.ef.table __ref,int _statuslineheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatuslineheight", false))
	 {return ((String) Debug.delegate(ba, "setstatuslineheight", new Object[] {_statuslineheight}));}
RDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Public Sub setStatusLineHeight(StatusLineHeight As";
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="cStatusLineHeight = StatusLineHeight";
__ref._cstatuslineheight /*int*/  = _statuslineheight;
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return "";
}
public String  _settablecolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settablecolor", false))
	 {return ((String) Debug.delegate(ba, "settablecolor", new Object[] {_color}));}
RDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Public Sub setTableColor(Color As Int)";
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="cTableColor = Color";
__ref._ctablecolor /*int*/  = _color;
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
 };
 };
RDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="End Sub";
return "";
}
public String  _settag(b4a.example.ef.table __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settag", false))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_tag}));}
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Public Sub setTag(Tag As Object)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="pnlTable.Tag = Tag";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(_tag);
RDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_color}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub setTextColor(Color As Int)";
RDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="cTextColor = Color";
__ref._ctextcolor /*int*/  = _color;
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=17432580;
 //BA.debugLineNum = 17432580;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=17432581;
 //BA.debugLineNum = 17432581;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=17432582;
 //BA.debugLineNum = 17432582;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17432583;
 //BA.debugLineNum = 17432583;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=17432584;
 //BA.debugLineNum = 17432584;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=17432588;
 //BA.debugLineNum = 17432588;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=17432589;
 //BA.debugLineNum = 17432589;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=17432590;
 //BA.debugLineNum = 17432590;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=17432591;
 //BA.debugLineNum = 17432591;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17432592;
 //BA.debugLineNum = 17432592;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=17432593;
 //BA.debugLineNum = 17432593;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=17432595;
 //BA.debugLineNum = 17432595;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=17432596;
 //BA.debugLineNum = 17432596;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=17432597;
 //BA.debugLineNum = 17432597;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17432598;
 //BA.debugLineNum = 17432598;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=17432599;
 //BA.debugLineNum = 17432599;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=17432603;
 //BA.debugLineNum = 17432603;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="cTextColors = TextColors";
__ref._ctextcolors /*int[]*/  = _textcolors;
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="If cTextColors.Length = 1 Then";
if (__ref._ctextcolors /*int[]*/ .length==1) { 
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="MultiTextColors = False";
__ref._multitextcolors /*boolean*/  = __c.False;
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="setTextColor(cTextColors(0))";
__ref._settextcolor /*String*/ (null,__ref._ctextcolors /*int[]*/ [(int) (0)]);
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=18939911;
 //BA.debugLineNum = 18939911;BA.debugLine="MultiTextColors = True";
__ref._multitextcolors /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=18939914;
 //BA.debugLineNum = 18939914;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=18939915;
 //BA.debugLineNum = 18939915;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=18939917;
 //BA.debugLineNum = 18939917;BA.debugLine="col = i Mod mNumberOfColumns";
_col = (int) (_i%__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18939918;
 //BA.debugLineNum = 18939918;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18939919;
 //BA.debugLineNum = 18939919;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 }else {
RDebugUtils.currentLine=18939924;
 //BA.debugLineNum = 18939924;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=18939925;
 //BA.debugLineNum = 18939925;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=18939926;
 //BA.debugLineNum = 18939926;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=18939927;
 //BA.debugLineNum = 18939927;BA.debugLine="col = i Mod mNumberOfFixedColumns";
_col = (int) (_i%__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=18939928;
 //BA.debugLineNum = 18939928;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18939929;
 //BA.debugLineNum = 18939929;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=18939930;
 //BA.debugLineNum = 18939930;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=18939932;
 //BA.debugLineNum = 18939932;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step28 = 1;
final int limit28 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=18939933;
 //BA.debugLineNum = 18939933;BA.debugLine="col = i Mod (mNumberOfColumns - mNumberOfFixed";
_col = (int) (_i%(__ref._mnumberofcolumns /*int*/ -__ref._mnumberoffixedcolumns /*int*/ )+__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=18939934;
 //BA.debugLineNum = 18939934;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18939935;
 //BA.debugLineNum = 18939935;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=18939936;
 //BA.debugLineNum = 18939936;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=18939940;
 //BA.debugLineNum = 18939940;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.ef.table __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_size}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub setTextSize(Size As Float)";
RDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="cTextSize = Size";
__ref._ctextsize /*float*/  = _size;
RDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=17563653;
 //BA.debugLineNum = 17563653;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=17563663;
 //BA.debugLineNum = 17563663;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563665;
 //BA.debugLineNum = 17563665;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=17563666;
 //BA.debugLineNum = 17563666;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=17563670;
 //BA.debugLineNum = 17563670;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=17563671;
 //BA.debugLineNum = 17563671;BA.debugLine="For i = 0 To HeaderFirst.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=17563672;
 //BA.debugLineNum = 17563672;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563673;
 //BA.debugLineNum = 17563673;BA.debugLine="lbl = HeaderFirst.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=17563674;
 //BA.debugLineNum = 17563674;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=17563676;
 //BA.debugLineNum = 17563676;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=17563677;
 //BA.debugLineNum = 17563677;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563678;
 //BA.debugLineNum = 17563678;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=17563679;
 //BA.debugLineNum = 17563679;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=17563683;
 //BA.debugLineNum = 17563683;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=17563684;
 //BA.debugLineNum = 17563684;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step32 = 1;
final int limit32 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=17563685;
 //BA.debugLineNum = 17563685;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563686;
 //BA.debugLineNum = 17563686;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=17563687;
 //BA.debugLineNum = 17563687;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=17563689;
 //BA.debugLineNum = 17563689;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=17563690;
 //BA.debugLineNum = 17563690;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=17563691;
 //BA.debugLineNum = 17563691;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=17563692;
 //BA.debugLineNum = 17563692;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 };
RDebugUtils.currentLine=17563696;
 //BA.debugLineNum = 17563696;BA.debugLine="End Sub";
return "";
}
public String  _settop(b4a.example.ef.table __ref,int _top) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settop", false))
	 {return ((String) Debug.delegate(ba, "settop", new Object[] {_top}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub setTop(Top As Int)";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="pnlTable.Top = Top";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settypefaces", false))
	 {return ((String) Debug.delegate(ba, "settypefaces", new Object[] {_typefaces}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="If TypeFaces.Length = 1 Then";
if (_typefaces.length==1) { 
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="cTypeFace = TypeFaces(0)";
__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _typefaces[(int) (0)];
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="MultiTypeFace = False";
__ref._multitypeface /*boolean*/  = __c.False;
 }else {
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="If TypeFaces.Length <> mNumberOfColumns Then";
if (_typefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="cTypeFaces0 = TypeFaces";
__ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _typefaces;
RDebugUtils.currentLine=17956875;
 //BA.debugLineNum = 17956875;BA.debugLine="cTypeFaces = cTypeFaces0";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=17956876;
 //BA.debugLineNum = 17956876;BA.debugLine="MultiTypeFace = True";
__ref._multitypeface /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=17956879;
 //BA.debugLineNum = 17956879;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=17956880;
 //BA.debugLineNum = 17956880;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=17956882;
 //BA.debugLineNum = 17956882;BA.debugLine="End Sub";
return "";
}
public String  _setusecolumncolors(b4a.example.ef.table __ref,boolean _usecolumncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setusecolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setusecolumncolors", new Object[] {_usecolumncolors}));}
int _i = 0;
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="cUseColumnColors = UseColumnColors";
__ref._cusecolumncolors /*boolean*/  = _usecolumncolors;
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="If cColumnColors.Length = 0 Then";
if (__ref._ccolumncolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="Dim cColumnColors(mNumberOfColumns) As Int";
_ccolumncolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="Dim cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="cColumnColors(i) = cRowColor1";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor1 /*int*/ ;
 }else {
RDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="cColumnColors(i) = cRowColor2";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor2 /*int*/ ;
 };
RDebugUtils.currentLine=18677772;
 //BA.debugLineNum = 18677772;BA.debugLine="cTextColors(i) = cTextColor";
__ref._ctextcolors /*int[]*/ [_i] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=18677776;
 //BA.debugLineNum = 18677776;BA.debugLine="If cHeaderColors.Length = 0 Then";
if (__ref._cheadercolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=18677777;
 //BA.debugLineNum = 18677777;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=18677778;
 //BA.debugLineNum = 18677778;BA.debugLine="Dim cHeaderColors(mNumberOfColumns) As Int";
_cheadercolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18677779;
 //BA.debugLineNum = 18677779;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=18677780;
 //BA.debugLineNum = 18677780;BA.debugLine="cHeaderColors(i) = cHeaderColor";
__ref._cheadercolors /*int[]*/ [_i] = __ref._cheadercolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=18677784;
 //BA.debugLineNum = 18677784;BA.debugLine="If cHeaderTextColors.Length = 0 Then";
if (__ref._cheadertextcolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=18677785;
 //BA.debugLineNum = 18677785;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=18677786;
 //BA.debugLineNum = 18677786;BA.debugLine="Dim cHeaderTextColors(mNumberOfColumns) As Int";
_cheadertextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18677787;
 //BA.debugLineNum = 18677787;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=18677788;
 //BA.debugLineNum = 18677788;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
__ref._cheadertextcolors /*int[]*/ [_i] = __ref._cheadertextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=18677791;
 //BA.debugLineNum = 18677791;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_col,_row,_value}));}
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.ef.table __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_visible}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="pnlTable.Visible = Visible";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(_visible);
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setwidth", false))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_width}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub setWidth(Width As Int)";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="pnlTable.Width = Width";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_width);
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="SV2.Width = Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(_width);
 }else {
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="SV2.Width = Width - SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (_width-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="End Sub";
return "";
}
public String  _setzeroselection(b4a.example.ef.table __ref,boolean _zeroselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setzeroselection", false))
	 {return ((String) Debug.delegate(ba, "setzeroselection", new Object[] {_zeroselection}));}
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub setZeroSelection(ZeroSelection As Boole";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="mZeroSelection = ZeroSelection";
__ref._mzeroselection /*boolean*/  = _zeroselection;
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _snapshot(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "snapshot", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "snapshot", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpsnapshot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnltable = null;
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub SnapShot As Bitmap";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="Private bmpSnapshot As Bitmap";
_bmpsnapshot = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="Private xpnlTable As B4XView";
_xpnltable = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="xpnlTable = pnlTable";
_xpnltable = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=22544389;
 //BA.debugLineNum = 22544389;BA.debugLine="bmpSnapshot = xpnlTable.Snapshot";
_bmpsnapshot = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_xpnltable.Snapshot().getObject()));
RDebugUtils.currentLine=22544391;
 //BA.debugLineNum = 22544391;BA.debugLine="Return bmpSnapshot";
if (true) return _bmpsnapshot;
RDebugUtils.currentLine=22544392;
 //BA.debugLineNum = 22544392;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Sub SortOMDoubleIDX(arrDouble() As Double, bAscend";
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=23003139;
 //BA.debugLineNum = 23003139;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=23003140;
 //BA.debugLineNum = 23003140;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=23003141;
 //BA.debugLineNum = 23003141;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=23003143;
 //BA.debugLineNum = 23003143;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=23003144;
 //BA.debugLineNum = 23003144;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=23003145;
 //BA.debugLineNum = 23003145;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=23003146;
 //BA.debugLineNum = 23003146;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=23003149;
 //BA.debugLineNum = 23003149;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=23003151;
 //BA.debugLineNum = 23003151;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=23003152;
 //BA.debugLineNum = 23003152;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=23003155;
 //BA.debugLineNum = 23003155;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=23003156;
 //BA.debugLineNum = 23003156;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=23003159;
 //BA.debugLineNum = 23003159;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=23003160;
 //BA.debugLineNum = 23003160;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23003161;
 //BA.debugLineNum = 23003161;BA.debugLine="If B4XOM.ContainsKey(arrDouble(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[(int) (_i)]))) { 
RDebugUtils.currentLine=23003162;
 //BA.debugLineNum = 23003162;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=23003164;
 //BA.debugLineNum = 23003164;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=23003166;
 //BA.debugLineNum = 23003166;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=23003167;
 //BA.debugLineNum = 23003167;BA.debugLine="B4XOM.Put(arrDouble(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=23003170;
 //BA.debugLineNum = 23003170;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=23003172;
 //BA.debugLineNum = 23003172;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=23003174;
 //BA.debugLineNum = 23003174;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=23003175;
 //BA.debugLineNum = 23003175;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=23003176;
 //BA.debugLineNum = 23003176;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=23003177;
 //BA.debugLineNum = 23003177;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=23003178;
 //BA.debugLineNum = 23003178;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=23003182;
 //BA.debugLineNum = 23003182;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=23003184;
 //BA.debugLineNum = 23003184;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Sub SortOMDoubleIDX2(arrDouble() As Double, arrInd";
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=23068685;
 //BA.debugLineNum = 23068685;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=23068687;
 //BA.debugLineNum = 23068687;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=23068688;
 //BA.debugLineNum = 23068688;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=23068691;
 //BA.debugLineNum = 23068691;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=23068692;
 //BA.debugLineNum = 23068692;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=23068695;
 //BA.debugLineNum = 23068695;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=23068696;
 //BA.debugLineNum = 23068696;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23068697;
 //BA.debugLineNum = 23068697;BA.debugLine="If B4XOM.ContainsKey(arrDouble(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=23068698;
 //BA.debugLineNum = 23068698;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=23068700;
 //BA.debugLineNum = 23068700;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=23068702;
 //BA.debugLineNum = 23068702;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=23068703;
 //BA.debugLineNum = 23068703;BA.debugLine="B4XOM.Put(arrDouble(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=23068706;
 //BA.debugLineNum = 23068706;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=23068708;
 //BA.debugLineNum = 23068708;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=23068710;
 //BA.debugLineNum = 23068710;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=23068711;
 //BA.debugLineNum = 23068711;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=23068712;
 //BA.debugLineNum = 23068712;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=23068713;
 //BA.debugLineNum = 23068713;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=23068714;
 //BA.debugLineNum = 23068714;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=23068718;
 //BA.debugLineNum = 23068718;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=23068720;
 //BA.debugLineNum = 23068720;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Sub SortOMLongIDX(arrLong() As Long, bAscending As";
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=22740996;
 //BA.debugLineNum = 22740996;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=22740997;
 //BA.debugLineNum = 22740997;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=22740999;
 //BA.debugLineNum = 22740999;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=22741000;
 //BA.debugLineNum = 22741000;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=22741001;
 //BA.debugLineNum = 22741001;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=22741002;
 //BA.debugLineNum = 22741002;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=22741005;
 //BA.debugLineNum = 22741005;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=22741007;
 //BA.debugLineNum = 22741007;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=22741008;
 //BA.debugLineNum = 22741008;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=22741011;
 //BA.debugLineNum = 22741011;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=22741012;
 //BA.debugLineNum = 22741012;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=22741015;
 //BA.debugLineNum = 22741015;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=22741016;
 //BA.debugLineNum = 22741016;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22741017;
 //BA.debugLineNum = 22741017;BA.debugLine="If B4XOM.ContainsKey(arrLong(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[(int) (_i)]))) { 
RDebugUtils.currentLine=22741018;
 //BA.debugLineNum = 22741018;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=22741020;
 //BA.debugLineNum = 22741020;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=22741022;
 //BA.debugLineNum = 22741022;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=22741023;
 //BA.debugLineNum = 22741023;BA.debugLine="B4XOM.Put(arrLong(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=22741026;
 //BA.debugLineNum = 22741026;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=22741028;
 //BA.debugLineNum = 22741028;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=22741030;
 //BA.debugLineNum = 22741030;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=22741031;
 //BA.debugLineNum = 22741031;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=22741032;
 //BA.debugLineNum = 22741032;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=22741033;
 //BA.debugLineNum = 22741033;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=22741034;
 //BA.debugLineNum = 22741034;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=22741038;
 //BA.debugLineNum = 22741038;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=22741040;
 //BA.debugLineNum = 22741040;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Sub SortOMLongIDX2(arrLong() As Long, arrIndex() A";
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=22872069;
 //BA.debugLineNum = 22872069;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=22872071;
 //BA.debugLineNum = 22872071;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=22872072;
 //BA.debugLineNum = 22872072;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=22872073;
 //BA.debugLineNum = 22872073;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=22872074;
 //BA.debugLineNum = 22872074;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=22872077;
 //BA.debugLineNum = 22872077;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=22872079;
 //BA.debugLineNum = 22872079;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=22872080;
 //BA.debugLineNum = 22872080;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=22872083;
 //BA.debugLineNum = 22872083;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=22872084;
 //BA.debugLineNum = 22872084;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=22872087;
 //BA.debugLineNum = 22872087;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=22872088;
 //BA.debugLineNum = 22872088;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=22872089;
 //BA.debugLineNum = 22872089;BA.debugLine="If B4XOM.ContainsKey(arrLong(arrIndex(i))) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=22872090;
 //BA.debugLineNum = 22872090;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=22872092;
 //BA.debugLineNum = 22872092;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=22872094;
 //BA.debugLineNum = 22872094;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=22872095;
 //BA.debugLineNum = 22872095;BA.debugLine="B4XOM.Put(arrLong(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=22872098;
 //BA.debugLineNum = 22872098;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=22872100;
 //BA.debugLineNum = 22872100;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=22872102;
 //BA.debugLineNum = 22872102;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=22872103;
 //BA.debugLineNum = 22872103;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=22872104;
 //BA.debugLineNum = 22872104;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=22872105;
 //BA.debugLineNum = 22872105;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=22872106;
 //BA.debugLineNum = 22872106;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=22872110;
 //BA.debugLineNum = 22872110;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=22872112;
 //BA.debugLineNum = 22872112;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Sub SortOMStringIDX(arrString() As String, bAscend";
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=23134213;
 //BA.debugLineNum = 23134213;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=23134216;
 //BA.debugLineNum = 23134216;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=23134217;
 //BA.debugLineNum = 23134217;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=23134221;
 //BA.debugLineNum = 23134221;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=23134223;
 //BA.debugLineNum = 23134223;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=23134227;
 //BA.debugLineNum = 23134227;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=23134228;
 //BA.debugLineNum = 23134228;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=23134231;
 //BA.debugLineNum = 23134231;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=23134232;
 //BA.debugLineNum = 23134232;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23134233;
 //BA.debugLineNum = 23134233;BA.debugLine="If B4XOM.ContainsKey(arrString(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[(int) (_i)]))) { 
RDebugUtils.currentLine=23134234;
 //BA.debugLineNum = 23134234;BA.debugLine="lstIndexes = B4XOM.Get(arrString(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=23134236;
 //BA.debugLineNum = 23134236;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=23134238;
 //BA.debugLineNum = 23134238;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=23134239;
 //BA.debugLineNum = 23134239;BA.debugLine="B4XOM.Put(arrString(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=23134242;
 //BA.debugLineNum = 23134242;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=23134243;
 //BA.debugLineNum = 23134243;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=23134245;
 //BA.debugLineNum = 23134245;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=23134248;
 //BA.debugLineNum = 23134248;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=23134250;
 //BA.debugLineNum = 23134250;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=23134251;
 //BA.debugLineNum = 23134251;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=23134252;
 //BA.debugLineNum = 23134252;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=23134253;
 //BA.debugLineNum = 23134253;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=23134254;
 //BA.debugLineNum = 23134254;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=23134258;
 //BA.debugLineNum = 23134258;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=23134260;
 //BA.debugLineNum = 23134260;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Sub SortOMStringIDX2(arrString() As String, arrInd";
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=23265284;
 //BA.debugLineNum = 23265284;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="Dim B4XOM As B4XOrderedMap 'this needs the B4XCol";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=23265288;
 //BA.debugLineNum = 23265288;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=23265293;
 //BA.debugLineNum = 23265293;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=23265295;
 //BA.debugLineNum = 23265295;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=23265296;
 //BA.debugLineNum = 23265296;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=23265299;
 //BA.debugLineNum = 23265299;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=23265300;
 //BA.debugLineNum = 23265300;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=23265303;
 //BA.debugLineNum = 23265303;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=23265304;
 //BA.debugLineNum = 23265304;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23265305;
 //BA.debugLineNum = 23265305;BA.debugLine="If B4XOM.ContainsKey(arrString(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=23265306;
 //BA.debugLineNum = 23265306;BA.debugLine="lstIndexes = B4XOM.Get(arrString(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=23265308;
 //BA.debugLineNum = 23265308;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=23265310;
 //BA.debugLineNum = 23265310;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=23265311;
 //BA.debugLineNum = 23265311;BA.debugLine="B4XOM.Put(arrString(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=23265314;
 //BA.debugLineNum = 23265314;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=23265315;
 //BA.debugLineNum = 23265315;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=23265317;
 //BA.debugLineNum = 23265317;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=23265320;
 //BA.debugLineNum = 23265320;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=23265322;
 //BA.debugLineNum = 23265322;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=23265323;
 //BA.debugLineNum = 23265323;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=23265324;
 //BA.debugLineNum = 23265324;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=23265325;
 //BA.debugLineNum = 23265325;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=23265326;
 //BA.debugLineNum = 23265326;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=23265330;
 //BA.debugLineNum = 23265330;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=23265332;
 //BA.debugLineNum = 23265332;BA.debugLine="End Sub";
return null;
}
public String  _unhidecol(b4a.example.ef.table __ref,int _col,int _newsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unhidecol", false))
	 {return ((String) Debug.delegate(ba, "unhidecol", new Object[] {_col,_newsize}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="For i=0 To SavedWidths.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="tmpWidths(col) = newSize";
_tmpwidths[_col] = _newsize;
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="End Sub";
return "";
}
public String  _unselectrow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unselectrow", false))
	 {return ((String) Debug.delegate(ba, "unselectrow", new Object[] {_row}));}
int _previndex = 0;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub UnselectRow(Row As Int)";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="prevIndex = SelectedRows.indexof(Row)	 ' -1 if se";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="If prevIndex > -1 Then";
if (_previndex>-1) { 
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="SelectedRows.RemoveAt(prevIndex)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=12386315;
 //BA.debugLineNum = 12386315;BA.debugLine="HideRow(Row)";
__ref._hiderow /*String*/ (null,_row);
RDebugUtils.currentLine=12386316;
 //BA.debugLineNum = 12386316;BA.debugLine="ShowRow(Row)";
__ref._showrow /*void*/ (null,_row);
 };
 };
RDebugUtils.currentLine=12386319;
 //BA.debugLineNum = 12386319;BA.debugLine="End Sub";
return "";
}
public boolean  _updatecell(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updatecell", false))
	 {return ((Boolean) Debug.delegate(ba, "updatecell", new Object[] {_col,_row,_value}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub UpdateCell(Col As Int, Row As Int, Valu";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="If (Col < 0 Or Col > mNumberOfColumns - 1 Or Row";
if ((_col<0 || _col>__ref._mnumberofcolumns /*int*/ -1 || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="SetValue(Col, Row, Value)";
__ref._setvalue /*String*/ (null,_col,_row,_value);
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="End Sub";
return false;
}
public boolean  _updaterow(b4a.example.ef.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updaterow", false))
	 {return ((Boolean) Debug.delegate(ba, "updaterow", new Object[] {_row,_values}));}
int _i = 0;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As Stri";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="If (Values.Length <> mNumberOfColumns Or Row <0 O";
if ((_values.length!=__ref._mnumberofcolumns /*int*/  || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="For i=0 To Values.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_values.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="SetValue(i,Row,Values(i))";
__ref._setvalue /*String*/ (null,_i,_row,_values[_i]);
 }
};
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="End Sub";
return false;
}
}