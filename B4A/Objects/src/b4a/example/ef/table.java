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
RDebugUtils.currentLine=70385664;
 //BA.debugLineNum = 70385664;BA.debugLine="Public Sub AddRow(Values() As String)";
RDebugUtils.currentLine=70385665;
 //BA.debugLineNum = 70385665;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70385666;
 //BA.debugLineNum = 70385666;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("570385666","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=70385667;
 //BA.debugLineNum = 70385667;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=70385669;
 //BA.debugLineNum = 70385669;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=70385670;
 //BA.debugLineNum = 70385670;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=70385672;
 //BA.debugLineNum = 70385672;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=70385673;
 //BA.debugLineNum = 70385673;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=70385674;
 //BA.debugLineNum = 70385674;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=70385675;
 //BA.debugLineNum = 70385675;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=70385683;
 //BA.debugLineNum = 70385683;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70516737;
 //BA.debugLineNum = 70516737;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=70516739;
 //BA.debugLineNum = 70516739;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
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
RDebugUtils.currentLine=70516742;
 //BA.debugLineNum = 70516742;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=70516743;
 //BA.debugLineNum = 70516743;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=70516744;
 //BA.debugLineNum = 70516744;BA.debugLine="lbls = GetLabels(Row)";
_lbls = __ref._getlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null,_row);
RDebugUtils.currentLine=70516745;
 //BA.debugLineNum = 70516745;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=70516746;
 //BA.debugLineNum = 70516746;BA.debugLine="visibleRows.Put(Row, lbls)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_row),(Object)(_lbls));
RDebugUtils.currentLine=70516747;
 //BA.debugLineNum = 70516747;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=70516748;
 //BA.debugLineNum = 70516748;BA.debugLine="Private txtColor As Int";
_txtcolor = 0;
RDebugUtils.currentLine=70516749;
 //BA.debugLineNum = 70516749;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
if (true) break;

case 7:
//if
this.state = 22;
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=70516752;
 //BA.debugLineNum = 70516752;BA.debugLine="Else If lstRowColorIndexes.Get(Row) > 1 Then";
if ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))>1) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=70516756;
 //BA.debugLineNum = 70516756;BA.debugLine="Else If cUseColumnColors = True Then";
if (__ref._cusecolumncolors /*boolean*/ ==parent.__c.True) { 
this.state = 13;
}else {
this.state = 15;
}}}
if (true) break;

case 9:
//C
this.state = 22;
RDebugUtils.currentLine=70516750;
 //BA.debugLineNum = 70516750;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = __ref._selecteddrawable /*Object[]*/ ;
RDebugUtils.currentLine=70516751;
 //BA.debugLineNum = 70516751;BA.debugLine="txtColor = cSelectedRowTextColor";
_txtcolor = __ref._cselectedrowtextcolor /*int*/ ;
 if (true) break;

case 11:
//C
this.state = 22;
RDebugUtils.currentLine=70516753;
 //BA.debugLineNum = 70516753;BA.debugLine="rowColor = lstRowDrawables.Get(lstRowColorIndexe";
_rowcolor = (Object[])(__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)));
RDebugUtils.currentLine=70516755;
 //BA.debugLineNum = 70516755;BA.debugLine="txtColor = GetContrastColor(lstRowColors.Get(lst";
_txtcolor = __ref._getcontrastcolor /*int*/ (null,(int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)))));
 if (true) break;

case 13:
//C
this.state = 22;
RDebugUtils.currentLine=70516757;
 //BA.debugLineNum = 70516757;BA.debugLine="rowColor = ColumnDrawables";
_rowcolor = __ref._columndrawables /*Object[]*/ ;
RDebugUtils.currentLine=70516758;
 //BA.debugLineNum = 70516758;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=70516760;
 //BA.debugLineNum = 70516760;BA.debugLine="If Row Mod 2 = 0 Then";
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
RDebugUtils.currentLine=70516761;
 //BA.debugLineNum = 70516761;BA.debugLine="rowColor = Drawable1";
_rowcolor = __ref._drawable1 /*Object[]*/ ;
RDebugUtils.currentLine=70516762;
 //BA.debugLineNum = 70516762;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=70516764;
 //BA.debugLineNum = 70516764;BA.debugLine="rowColor = Drawable2";
_rowcolor = __ref._drawable2 /*Object[]*/ ;
RDebugUtils.currentLine=70516765;
 //BA.debugLineNum = 70516765;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
;
RDebugUtils.currentLine=70516768;
 //BA.debugLineNum = 70516768;BA.debugLine="If mNumberOfFixedColumns = 0 Then";

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
RDebugUtils.currentLine=70516769;
 //BA.debugLineNum = 70516769;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=70516770;
 //BA.debugLineNum = 70516770;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
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
RDebugUtils.currentLine=70516771;
 //BA.debugLineNum = 70516771;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(I).L";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=70516772;
 //BA.debugLineNum = 70516772;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=70516773;
 //BA.debugLineNum = 70516773;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=70516774;
 //BA.debugLineNum = 70516774;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=70516775;
 //BA.debugLineNum = 70516775;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=70516776;
 //BA.debugLineNum = 70516776;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=70516778;
 //BA.debugLineNum = 70516778;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=70516779;
 //BA.debugLineNum = 70516779;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=70516781;
 //BA.debugLineNum = 70516781;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=70516783;
 //BA.debugLineNum = 70516783;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=70516785;
 //BA.debugLineNum = 70516785;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=70516786;
 //BA.debugLineNum = 70516786;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=70516788;
 //BA.debugLineNum = 70516788;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=70516793;
 //BA.debugLineNum = 70516793;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=70516794;
 //BA.debugLineNum = 70516794;BA.debugLine="If i < mNumberOfFixedColumns Then";
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
RDebugUtils.currentLine=70516795;
 //BA.debugLineNum = 70516795;BA.debugLine="SVF.Panel.AddView(lbls(i), HeaderFirst.GetView";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=70516796;
 //BA.debugLineNum = 70516796;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=70516797;
 //BA.debugLineNum = 70516797;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=70516798;
 //BA.debugLineNum = 70516798;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=70516799;
 //BA.debugLineNum = 70516799;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=70516800;
 //BA.debugLineNum = 70516800;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=70516802;
 //BA.debugLineNum = 70516802;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=70516803;
 //BA.debugLineNum = 70516803;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=70516805;
 //BA.debugLineNum = 70516805;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=70516807;
 //BA.debugLineNum = 70516807;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=70516809;
 //BA.debugLineNum = 70516809;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=70516810;
 //BA.debugLineNum = 70516810;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=70516812;
 //BA.debugLineNum = 70516812;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=70516815;
 //BA.debugLineNum = 70516815;BA.debugLine="Private i_1 As Int";
_i_1 = 0;
RDebugUtils.currentLine=70516816;
 //BA.debugLineNum = 70516816;BA.debugLine="i_1 = i - mNumberOfFixedColumns";
_i_1 = (int) (_i-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=70516817;
 //BA.debugLineNum = 70516817;BA.debugLine="If (Header.GetView(i_1).Width > 1 ) Then";
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
RDebugUtils.currentLine=70516818;
 //BA.debugLineNum = 70516818;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(i_1";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=70516819;
 //BA.debugLineNum = 70516819;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=70516820;
 //BA.debugLineNum = 70516820;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=70516821;
 //BA.debugLineNum = 70516821;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(";
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
RDebugUtils.currentLine=70516822;
 //BA.debugLineNum = 70516822;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=70516823;
 //BA.debugLineNum = 70516823;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=70516825;
 //BA.debugLineNum = 70516825;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=70516826;
 //BA.debugLineNum = 70516826;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=70516828;
 //BA.debugLineNum = 70516828;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 90:
//C
this.state = 91;
;
RDebugUtils.currentLine=70516830;
 //BA.debugLineNum = 70516830;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=70516832;
 //BA.debugLineNum = 70516832;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=70516833;
 //BA.debugLineNum = 70516833;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=70516835;
 //BA.debugLineNum = 70516835;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=70516843;
 //BA.debugLineNum = 70516843;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=70516844;
 //BA.debugLineNum = 70516844;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=70516845;
 //BA.debugLineNum = 70516845;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=70516846;
 //BA.debugLineNum = 70516846;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
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
RDebugUtils.currentLine=70516848;
 //BA.debugLineNum = 70516848;BA.debugLine="If SubExists(cCallBack, cEventName & \"_ShowRow\")";
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
RDebugUtils.currentLine=70516849;
 //BA.debugLineNum = 70516849;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "showrow"),(int) (0));
this.state = 115;
return;
case 115:
//C
this.state = 110;
;
RDebugUtils.currentLine=70516850;
 //BA.debugLineNum = 70516850;BA.debugLine="CallSub3(cCallBack, cEventName & \"_ShowRow\", Row";
parent.__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_ShowRow",(Object)(_row),(Object)(_lbls));
 if (true) break;

case 110:
//C
this.state = -1;
;
RDebugUtils.currentLine=70516852;
 //BA.debugLineNum = 70516852;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70451200;
 //BA.debugLineNum = 70451200;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
RDebugUtils.currentLine=70451201;
 //BA.debugLineNum = 70451201;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=70451203;
 //BA.debugLineNum = 70451203;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70451204;
 //BA.debugLineNum = 70451204;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("570451204","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=70451205;
 //BA.debugLineNum = 70451205;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=70451207;
 //BA.debugLineNum = 70451207;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=70451208;
 //BA.debugLineNum = 70451208;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=70451210;
 //BA.debugLineNum = 70451210;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=70451211;
 //BA.debugLineNum = 70451211;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=70451213;
 //BA.debugLineNum = 70451213;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=70451214;
 //BA.debugLineNum = 70451214;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=70451215;
 //BA.debugLineNum = 70451215;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=70451216;
 //BA.debugLineNum = 70451216;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=70451217;
 //BA.debugLineNum = 70451217;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70451218;
 //BA.debugLineNum = 70451218;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=70451220;
 //BA.debugLineNum = 70451220;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=70451222;
 //BA.debugLineNum = 70451222;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=70451223;
 //BA.debugLineNum = 70451223;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=70451224;
 //BA.debugLineNum = 70451224;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=70451225;
 //BA.debugLineNum = 70451225;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=70451228;
 //BA.debugLineNum = 70451228;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=70451229;
 //BA.debugLineNum = 70451229;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70451230;
 //BA.debugLineNum = 70451230;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=70451232;
 //BA.debugLineNum = 70451232;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=70451234;
 //BA.debugLineNum = 70451234;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=70451235;
 //BA.debugLineNum = 70451235;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=70451236;
 //BA.debugLineNum = 70451236;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=70451237;
 //BA.debugLineNum = 70451237;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=70451238;
 //BA.debugLineNum = 70451238;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=70451239;
 //BA.debugLineNum = 70451239;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=70451243;
 //BA.debugLineNum = 70451243;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=70451244;
 //BA.debugLineNum = 70451244;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=70451247;
 //BA.debugLineNum = 70451247;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=70451248;
 //BA.debugLineNum = 70451248;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=70451255;
 //BA.debugLineNum = 70451255;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=69992448;
 //BA.debugLineNum = 69992448;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
RDebugUtils.currentLine=69992450;
 //BA.debugLineNum = 69992450;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=69992452;
 //BA.debugLineNum = 69992452;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
_savedwidths = new int[_widths.length];
;
RDebugUtils.currentLine=69992453;
 //BA.debugLineNum = 69992453;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
_columnwidths = new int[_widths.length];
;
RDebugUtils.currentLine=69992454;
 //BA.debugLineNum = 69992454;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
_headerwidths = new int[_widths.length];
;
RDebugUtils.currentLine=69992455;
 //BA.debugLineNum = 69992455;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=69992456;
 //BA.debugLineNum = 69992456;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=69992457;
 //BA.debugLineNum = 69992457;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=69992458;
 //BA.debugLineNum = 69992458;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=69992459;
 //BA.debugLineNum = 69992459;BA.debugLine="HeaderWidths(col) = Widths(col)";
__ref._headerwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=69992460;
 //BA.debugLineNum = 69992460;BA.debugLine="DataWidths(col) = Widths(col)";
__ref._datawidths /*int[]*/ [_col] = _widths[_col];
 }
};
 }else {
RDebugUtils.currentLine=69992463;
 //BA.debugLineNum = 69992463;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step13 = 1;
final int limit13 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=69992464;
 //BA.debugLineNum = 69992464;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=69992465;
 //BA.debugLineNum = 69992465;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
 }
};
 };
RDebugUtils.currentLine=69992469;
 //BA.debugLineNum = 69992469;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=69992470;
 //BA.debugLineNum = 69992470;BA.debugLine="Private w As Int";
_w = 0;
RDebugUtils.currentLine=69992471;
 //BA.debugLineNum = 69992471;BA.debugLine="Private Left As Int";
_left = 0;
RDebugUtils.currentLine=69992472;
 //BA.debugLineNum = 69992472;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=69992473;
 //BA.debugLineNum = 69992473;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=69992474;
 //BA.debugLineNum = 69992474;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit23 ;_col = _col + step23 ) {
RDebugUtils.currentLine=69992475;
 //BA.debugLineNum = 69992475;BA.debugLine="v = Header.GetView(col)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=69992476;
 //BA.debugLineNum = 69992476;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=69992477;
 //BA.debugLineNum = 69992477;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=69992478;
 //BA.debugLineNum = 69992478;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=69992479;
 //BA.debugLineNum = 69992479;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=69992480;
 //BA.debugLineNum = 69992480;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=69992483;
 //BA.debugLineNum = 69992483;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
RDebugUtils.currentLine=69992484;
 //BA.debugLineNum = 69992484;BA.debugLine="HeaderFirst.Width = 0";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=69992485;
 //BA.debugLineNum = 69992485;BA.debugLine="SVF.Width = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=69992486;
 //BA.debugLineNum = 69992486;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
RDebugUtils.currentLine=69992487;
 //BA.debugLineNum = 69992487;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=69992488;
 //BA.debugLineNum = 69992488;BA.debugLine="SV2.Left = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=69992489;
 //BA.debugLineNum = 69992489;BA.debugLine="SV2.Width = Min(Header.Width, cWidth)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=69992490;
 //BA.debugLineNum = 69992490;BA.debugLine="Header.Left = 0";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=69992491;
 //BA.debugLineNum = 69992491;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=69992492;
 //BA.debugLineNum = 69992492;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=69992493;
 //BA.debugLineNum = 69992493;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step42 = 1;
final int limit42 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit42 ;_row = _row + step42 ) {
RDebugUtils.currentLine=69992494;
 //BA.debugLineNum = 69992494;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=69992495;
 //BA.debugLineNum = 69992495;BA.debugLine="For col = 0 To lbls.Length - 1";
{
final int step44 = 1;
final int limit44 = (int) (_lbls.length-1);
_col = (int) (0) ;
for (;_col <= limit44 ;_col = _col + step44 ) {
RDebugUtils.currentLine=69992496;
 //BA.debugLineNum = 69992496;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left,";
_lbls[_col].SetLayout(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft(),_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=69992499;
 //BA.debugLineNum = 69992499;BA.debugLine="pnlTable.Width = Min(Header.Width, cWidth)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=69992500;
 //BA.debugLineNum = 69992500;BA.debugLine="lblStatusLine.Width = Header.Width";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=69992501;
 //BA.debugLineNum = 69992501;BA.debugLine="internalPanel.Width = Header.Width";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=69992503;
 //BA.debugLineNum = 69992503;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=69992504;
 //BA.debugLineNum = 69992504;BA.debugLine="Private w, wt As Int";
_w = 0;
_wt = 0;
RDebugUtils.currentLine=69992505;
 //BA.debugLineNum = 69992505;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=69992506;
 //BA.debugLineNum = 69992506;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit55 ;_col = _col + step55 ) {
RDebugUtils.currentLine=69992507;
 //BA.debugLineNum = 69992507;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=69992508;
 //BA.debugLineNum = 69992508;BA.debugLine="v = HeaderFirst.GetView(col)";
_v = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=69992510;
 //BA.debugLineNum = 69992510;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)	'???";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=69992511;
 //BA.debugLineNum = 69992511;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=69992512;
 //BA.debugLineNum = 69992512;BA.debugLine="wt = wt + w";
_wt = (int) (_wt+_w);
RDebugUtils.currentLine=69992513;
 //BA.debugLineNum = 69992513;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=69992514;
 //BA.debugLineNum = 69992514;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=69992515;
 //BA.debugLineNum = 69992515;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=69992518;
 //BA.debugLineNum = 69992518;BA.debugLine="mFirstColumnsWidth = Left";
__ref._mfirstcolumnswidth /*int*/  = _left;
RDebugUtils.currentLine=69992519;
 //BA.debugLineNum = 69992519;BA.debugLine="HeaderFirst.Width = Left";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=69992520;
 //BA.debugLineNum = 69992520;BA.debugLine="SVF.Width = HeaderFirst.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=69992521;
 //BA.debugLineNum = 69992521;BA.debugLine="SV2.Left = HeaderFirst.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=69992522;
 //BA.debugLineNum = 69992522;BA.debugLine="Private Left, col_x As Int";
_left = 0;
_col_x = 0;
RDebugUtils.currentLine=69992523;
 //BA.debugLineNum = 69992523;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=69992524;
 //BA.debugLineNum = 69992524;BA.debugLine="For col = mNumberOfFixedColumns To Widths.Length";
{
final int step72 = 1;
final int limit72 = (int) (_widths.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit72 ;_col = _col + step72 ) {
RDebugUtils.currentLine=69992525;
 //BA.debugLineNum = 69992525;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=69992526;
 //BA.debugLineNum = 69992526;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=69992527;
 //BA.debugLineNum = 69992527;BA.debugLine="v = Header.GetView(col_x)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x);
RDebugUtils.currentLine=69992528;
 //BA.debugLineNum = 69992528;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=69992529;
 //BA.debugLineNum = 69992529;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=69992530;
 //BA.debugLineNum = 69992530;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=69992531;
 //BA.debugLineNum = 69992531;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=69992532;
 //BA.debugLineNum = 69992532;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=69992535;
 //BA.debugLineNum = 69992535;BA.debugLine="Header.Width = Left";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=69992536;
 //BA.debugLineNum = 69992536;BA.debugLine="Header.Left = -SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=69992537;
 //BA.debugLineNum = 69992537;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=69992538;
 //BA.debugLineNum = 69992538;BA.debugLine="Header.Left = mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._mfirstcolumnswidth /*int*/ );
RDebugUtils.currentLine=69992539;
 //BA.debugLineNum = 69992539;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=69992540;
 //BA.debugLineNum = 69992540;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=69992541;
 //BA.debugLineNum = 69992541;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step89 = 1;
final int limit89 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit89 ;_row = _row + step89 ) {
RDebugUtils.currentLine=69992542;
 //BA.debugLineNum = 69992542;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=69992543;
 //BA.debugLineNum = 69992543;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=69992544;
 //BA.debugLineNum = 69992544;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step92 = 1;
final int limit92 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit92 ;_col = _col + step92 ) {
RDebugUtils.currentLine=69992545;
 //BA.debugLineNum = 69992545;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Width";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),_widths[_col],(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=69992546;
 //BA.debugLineNum = 69992546;BA.debugLine="Left = HeaderFirst.GetView(col).Left + HeaderF";
_left = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft()+__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth()+__ref._clinewidth /*int*/ );
 }
};
RDebugUtils.currentLine=69992548;
 //BA.debugLineNum = 69992548;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=69992549;
 //BA.debugLineNum = 69992549;BA.debugLine="For col = mNumberOfFixedColumns To lbls.Length";
{
final int step97 = 1;
final int limit97 = (int) (_lbls.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit97 ;_col = _col + step97 ) {
RDebugUtils.currentLine=69992550;
 //BA.debugLineNum = 69992550;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=69992551;
 //BA.debugLineNum = 69992551;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Heade";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=69992552;
 //BA.debugLineNum = 69992552;BA.debugLine="Left = Left + Header.GetView(col_x).Width + cL";
_left = (int) (_left+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth()+__ref._clinewidth /*int*/ );
 }
};
 }
};
RDebugUtils.currentLine=69992555;
 //BA.debugLineNum = 69992555;BA.debugLine="SV2.Width = Min(Header.Width, cWidth - HeaderFir";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ -__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth())));
RDebugUtils.currentLine=69992556;
 //BA.debugLineNum = 69992556;BA.debugLine="pnlTable.Width = Min(HeaderFirst.Width + Header.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=69992557;
 //BA.debugLineNum = 69992557;BA.debugLine="lblStatusLine.Width = HeaderFirst.Width + Header";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=69992558;
 //BA.debugLineNum = 69992558;BA.debugLine="internalPanel.Width = HeaderFirst.Width + Header";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=69992560;
 //BA.debugLineNum = 69992560;BA.debugLine="pnlFastScroll.Left = pnlTable.Width - pnlFastScro";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=69992561;
 //BA.debugLineNum = 69992561;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=69992562;
 //BA.debugLineNum = 69992562;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=69992565;
 //BA.debugLineNum = 69992565;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=69992566;
 //BA.debugLineNum = 69992566;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_left,_top,_width,_height}));}
RDebugUtils.currentLine=69599232;
 //BA.debugLineNum = 69599232;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
RDebugUtils.currentLine=69599233;
 //BA.debugLineNum = 69599233;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=69599234;
 //BA.debugLineNum = 69599234;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=69599235;
 //BA.debugLineNum = 69599235;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=69599236;
 //BA.debugLineNum = 69599236;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=69599238;
 //BA.debugLineNum = 69599238;BA.debugLine="pnlTable.Initialize(\"\")";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69599239;
 //BA.debugLineNum = 69599239;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69599240;
 //BA.debugLineNum = 69599240;BA.debugLine="Act.AddView(pnlTable, cLeft, cTop , cWidth, cHeig";
_act.AddView((android.view.View)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._cleft /*int*/ ,__ref._ctop /*int*/ ,__ref._cwidth /*int*/ ,__ref._cheight /*int*/ );
RDebugUtils.currentLine=69599242;
 //BA.debugLineNum = 69599242;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=69599243;
 //BA.debugLineNum = 69599243;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=69664768;
 //BA.debugLineNum = 69664768;BA.debugLine="Private Sub InitTable";
RDebugUtils.currentLine=69664769;
 //BA.debugLineNum = 69664769;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=69664770;
 //BA.debugLineNum = 69664770;BA.debugLine="lstRowColors.Initialize				'list of the different";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=69664771;
 //BA.debugLineNum = 69664771;BA.debugLine="lstRowColorIndexes.Initialize	'list of the color";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=69664772;
 //BA.debugLineNum = 69664772;BA.debugLine="lstRowDrawables.Initialize		'list of the drawable";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=69664774;
 //BA.debugLineNum = 69664774;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=69664776;
 //BA.debugLineNum = 69664776;BA.debugLine="pnlTable.Tag = \"Table\"";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)("Table"));
RDebugUtils.currentLine=69664777;
 //BA.debugLineNum = 69664777;BA.debugLine="TableObject = Me";
__ref._tableobject /*b4a.example.ef.table*/  = (b4a.example.ef.table)(this);
RDebugUtils.currentLine=69664779;
 //BA.debugLineNum = 69664779;BA.debugLine="SV2.Initialize(0, 0, \"SV2\")";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .Initialize(ba,(int) (0),(int) (0),"SV2");
RDebugUtils.currentLine=69664780;
 //BA.debugLineNum = 69664780;BA.debugLine="SVF.Initialize2(0, \"SVF\")";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .Initialize2(ba,(int) (0),"SVF");
RDebugUtils.currentLine=69664781;
 //BA.debugLineNum = 69664781;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=69664782;
 //BA.debugLineNum = 69664782;BA.debugLine="jo = SVF";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()));
RDebugUtils.currentLine=69664783;
 //BA.debugLineNum = 69664783;BA.debugLine="jo.RunMethod(\"setVerticalScrollBarEnabled\", Array";
_jo.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=69664784;
 //BA.debugLineNum = 69664784;BA.debugLine="internalPanel.Initialize(\"IP\")";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"IP");
RDebugUtils.currentLine=69664785;
 //BA.debugLineNum = 69664785;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=69664787;
 //BA.debugLineNum = 69664787;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=69664788;
 //BA.debugLineNum = 69664788;BA.debugLine="SV2.FadingEdges(False)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .FadingEdges(__c.False);
RDebugUtils.currentLine=69664789;
 //BA.debugLineNum = 69664789;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=69664790;
 //BA.debugLineNum = 69664790;BA.debugLine="IsVisible = True";
__ref._isvisible /*boolean*/  = __c.True;
RDebugUtils.currentLine=69664791;
 //BA.debugLineNum = 69664791;BA.debugLine="HeaderFirst.Initialize(\"\")";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69664792;
 //BA.debugLineNum = 69664792;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=69664793;
 //BA.debugLineNum = 69664793;BA.debugLine="HeaderBase.Initialize(\"\")";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69664794;
 //BA.debugLineNum = 69664794;BA.debugLine="HeaderBase.Color = Colors.Transparent";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69664795;
 //BA.debugLineNum = 69664795;BA.debugLine="Header.Initialize(\"\")";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69664796;
 //BA.debugLineNum = 69664796;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=69664798;
 //BA.debugLineNum = 69664798;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=69664799;
 //BA.debugLineNum = 69664799;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
 }else {
RDebugUtils.currentLine=69664801;
 //BA.debugLineNum = 69664801;BA.debugLine="mFirstColumnsWidth = 100dip";
__ref._mfirstcolumnswidth /*int*/  = __c.DipToCurrent((int) (100));
 };
RDebugUtils.currentLine=69664803;
 //BA.debugLineNum = 69664803;BA.debugLine="pnlTable.AddView(Header, mFirstColumnsWidth, 0 ,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,(int) (0),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=69664804;
 //BA.debugLineNum = 69664804;BA.debugLine="pnlTable.AddView(HeaderFirst, 0, 0, mFirstColumns";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mfirstcolumnswidth /*int*/ ,__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=69664807;
 //BA.debugLineNum = 69664807;BA.debugLine="lblStatusLine.Initialize(\"\")";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69664808;
 //BA.debugLineNum = 69664808;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69664809;
 //BA.debugLineNum = 69664809;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69664810;
 //BA.debugLineNum = 69664810;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=69664811;
 //BA.debugLineNum = 69664811;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=69664812;
 //BA.debugLineNum = 69664812;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=69664813;
 //BA.debugLineNum = 69664813;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),__ref._cwidth /*int*/ ,__ref._cstatuslineheight /*int*/ );
 }else {
RDebugUtils.currentLine=69664815;
 //BA.debugLineNum = 69664815;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=69664816;
 //BA.debugLineNum = 69664816;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=69664817;
 //BA.debugLineNum = 69664817;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=69664819;
 //BA.debugLineNum = 69664819;BA.debugLine="SetPadding(lblStatusLine, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=69664820;
 //BA.debugLineNum = 69664820;BA.debugLine="pnlTable.AddView(internalPanel, 0, 0, cWidth, 0)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._cwidth /*int*/ ,(int) (0));
RDebugUtils.currentLine=69664822;
 //BA.debugLineNum = 69664822;BA.debugLine="pnlFastScroll.Initialize(\"pnlFastScroll\")";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnlFastScroll");
RDebugUtils.currentLine=69664823;
 //BA.debugLineNum = 69664823;BA.debugLine="pnlFastScroll.Color = FScBackgroundColor";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._fscbackgroundcolor /*int*/ );
RDebugUtils.currentLine=69664824;
 //BA.debugLineNum = 69664824;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=69664825;
 //BA.debugLineNum = 69664825;BA.debugLine="pnlTable.AddView(pnlFastScroll,  cWidth - FScCurs";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop(),__ref._fsccursorwidth /*int*/ ,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=69664826;
 //BA.debugLineNum = 69664826;BA.debugLine="pnlFastScrollCursor.Initialize(\"\")";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69664827;
 //BA.debugLineNum = 69664827;BA.debugLine="pnlFastScrollCursor.Color = Colors.White";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=69664828;
 //BA.debugLineNum = 69664828;BA.debugLine="pnlFastScroll.AddView(pnlFastScrollCursor,  0, 0,";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=69664829;
 //BA.debugLineNum = 69664829;BA.debugLine="lblFastScroll.Initialize(\"\")";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69664830;
 //BA.debugLineNum = 69664830;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=69664831;
 //BA.debugLineNum = 69664831;BA.debugLine="cdw.Initialize2(Colors.White, 3dip, 1dip, Colors.";
_cdw.Initialize2(__c.Colors.White,__c.DipToCurrent((int) (3)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
RDebugUtils.currentLine=69664832;
 //BA.debugLineNum = 69664832;BA.debugLine="lblFastScroll.Background = cdw";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
RDebugUtils.currentLine=69664833;
 //BA.debugLineNum = 69664833;BA.debugLine="lblFastScroll.TextColor = Colors.Black";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=69664834;
 //BA.debugLineNum = 69664834;BA.debugLine="lblFastScroll.Gravity = Bit.Or(Gravity.LEFT, Grav";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Bit.Or(__c.Gravity.LEFT,__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=69664835;
 //BA.debugLineNum = 69664835;BA.debugLine="lblFastScroll.Padding = Array As Int(5dip, 0, 0,";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setPadding(new int[]{__c.DipToCurrent((int) (5)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=69664836;
 //BA.debugLineNum = 69664836;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=69664837;
 //BA.debugLineNum = 69664837;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=69664838;
 //BA.debugLineNum = 69664838;BA.debugLine="pnlTable.AddView(lblFastScroll,  cWidth - mFastS";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._fsclabeltopdelta /*int*/ ,__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 }else {
RDebugUtils.currentLine=69664840;
 //BA.debugLineNum = 69664840;BA.debugLine="pnlTable.AddView(lblFastScroll,  0, (SV2.Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._mfastscrolllabelheight /*int*/ )/(double)2),__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 };
RDebugUtils.currentLine=69664842;
 //BA.debugLineNum = 69664842;BA.debugLine="FScTimer.Initialize(\"FastScrollTimer\", 1500)";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FastScrollTimer",(long) (1500));
RDebugUtils.currentLine=69664844;
 //BA.debugLineNum = 69664844;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=69664846;
 //BA.debugLineNum = 69664846;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=69664848;
 //BA.debugLineNum = 69664848;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69664849;
 //BA.debugLineNum = 69664849;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69664850;
 //BA.debugLineNum = 69664850;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69664851;
 //BA.debugLineNum = 69664851;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69664852;
 //BA.debugLineNum = 69664852;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=69664853;
 //BA.debugLineNum = 69664853;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step74 = 1;
final int limit74 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
RDebugUtils.currentLine=69664854;
 //BA.debugLineNum = 69664854;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=69664855;
 //BA.debugLineNum = 69664855;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=69664856;
 //BA.debugLineNum = 69664856;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=69664857;
 //BA.debugLineNum = 69664857;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=69664858;
 //BA.debugLineNum = 69664858;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
 }
};
RDebugUtils.currentLine=69664860;
 //BA.debugLineNum = 69664860;BA.debugLine="SVF.Panel.Width = SVF.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setWidth(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=69664861;
 //BA.debugLineNum = 69664861;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=69664862;
 //BA.debugLineNum = 69664862;BA.debugLine="SV2.Panel.Width = SV2.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth());
RDebugUtils.currentLine=69664863;
 //BA.debugLineNum = 69664863;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=69664865;
 //BA.debugLineNum = 69664865;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=69664867;
 //BA.debugLineNum = 69664867;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=69664869;
 //BA.debugLineNum = 69664869;BA.debugLine="pnlSortingView.Initialize(\"\")";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69664870;
 //BA.debugLineNum = 69664870;BA.debugLine="If mCustomSortingBitmaps = False Then";
if (__ref._mcustomsortingbitmaps /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=69664871;
 //BA.debugLineNum = 69664871;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
 };
RDebugUtils.currentLine=69664875;
 //BA.debugLineNum = 69664875;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=69664876;
 //BA.debugLineNum = 69664876;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize2((android.graphics.Bitmap)(__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=69664884;
 //BA.debugLineNum = 69664884;BA.debugLine="End Sub";
return "";
}
public String  _addtoview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoview", false))
	 {return ((String) Debug.delegate(ba, "addtoview", new Object[] {_v,_left,_top,_width,_height}));}
RDebugUtils.currentLine=69533696;
 //BA.debugLineNum = 69533696;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
RDebugUtils.currentLine=69533697;
 //BA.debugLineNum = 69533697;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
__ref._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
RDebugUtils.currentLine=69533698;
 //BA.debugLineNum = 69533698;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=74579968;
 //BA.debugLineNum = 74579968;BA.debugLine="Private Sub CalcFastScroll(Pos As Int)";
RDebugUtils.currentLine=74579969;
 //BA.debugLineNum = 74579969;BA.debugLine="Private i, Top As Int";
_i = 0;
_top = 0;
RDebugUtils.currentLine=74579970;
 //BA.debugLineNum = 74579970;BA.debugLine="Top = Pos * FScScale";
_top = (int) (_pos*__ref._fscscale /*double*/ );
RDebugUtils.currentLine=74579971;
 //BA.debugLineNum = 74579971;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=74579972;
 //BA.debugLineNum = 74579972;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=74579973;
 //BA.debugLineNum = 74579973;BA.debugLine="lblFastScroll.Top = Top + FscLabelTopDelta";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (_top+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=74579975;
 //BA.debugLineNum = 74579975;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=74579976;
 //BA.debugLineNum = 74579976;BA.debugLine="i = (Pos + SV2.Height / 2) / cRowHeight";
_i = (int) ((_pos+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)2)/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=74579977;
 //BA.debugLineNum = 74579977;BA.debugLine="Private str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=74579978;
 //BA.debugLineNum = 74579978;BA.debugLine="str = Data.Get(i)";
_str = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=74579979;
 //BA.debugLineNum = 74579979;BA.debugLine="lblFastScroll.Text = str(mFastScrollColumnIndex)";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_str[__ref._mfastscrollcolumnindex /*int*/ ].substring((int) (0),(int) (__c.Min(_str[__ref._mfastscrollcolumnindex /*int*/ ].length(),__ref._mfastscrolllabelmaxchars /*int*/ )))));
 };
RDebugUtils.currentLine=74579982;
 //BA.debugLineNum = 74579982;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_click", false))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=71041024;
 //BA.debugLineNum = 71041024;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=71041025;
 //BA.debugLineNum = 71041025;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=71041026;
 //BA.debugLineNum = 71041026;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=71041027;
 //BA.debugLineNum = 71041027;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=71041028;
 //BA.debugLineNum = 71041028;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=71041031;
 //BA.debugLineNum = 71041031;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=71041032;
 //BA.debugLineNum = 71041032;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellClick\"";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick")) { 
RDebugUtils.currentLine=71041033;
 //BA.debugLineNum = 71041033;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellClick\", r";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=71041035;
 //BA.debugLineNum = 71041035;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(b4a.example.ef.table __ref,b4a.example.ef.table._rowcol _rc) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "selectrow", false))
	 {return ((String) Debug.delegate(ba, "selectrow", new Object[] {_rc}));}
int _previndex = 0;
int _prev = 0;
RDebugUtils.currentLine=71237632;
 //BA.debugLineNum = 71237632;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
RDebugUtils.currentLine=71237633;
 //BA.debugLineNum = 71237633;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=71237635;
 //BA.debugLineNum = 71237635;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=71237636;
 //BA.debugLineNum = 71237636;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
_prev = 0;
RDebugUtils.currentLine=71237638;
 //BA.debugLineNum = 71237638;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=71237639;
 //BA.debugLineNum = 71237639;BA.debugLine="If (prevIndex <> -1 And mMultiSelect = False) The";
if ((_previndex!=-1 && __ref._mmultiselect /*boolean*/ ==__c.False)) { 
RDebugUtils.currentLine=71237641;
 //BA.debugLineNum = 71237641;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=71237642;
 //BA.debugLineNum = 71237642;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=71237643;
 //BA.debugLineNum = 71237643;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=71237644;
 //BA.debugLineNum = 71237644;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=71237646;
 //BA.debugLineNum = 71237646;BA.debugLine="If mZeroSelection = False Then";
if (__ref._mzeroselection /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=71237647;
 //BA.debugLineNum = 71237647;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=71237651;
 //BA.debugLineNum = 71237651;BA.debugLine="If (prevIndex = -1) Then";
if ((_previndex==-1)) { 
RDebugUtils.currentLine=71237652;
 //BA.debugLineNum = 71237652;BA.debugLine="If (mMultiSelect) Then";
if ((__ref._mmultiselect /*boolean*/ )) { 
RDebugUtils.currentLine=71237653;
 //BA.debugLineNum = 71237653;BA.debugLine="SelectedRows.Add(rc.Row) 'Select the new row";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=71237654;
 //BA.debugLineNum = 71237654;BA.debugLine="prev = -1";
_prev = (int) (-1);
 }else {
RDebugUtils.currentLine=71237658;
 //BA.debugLineNum = 71237658;BA.debugLine="If (SelectedRows.Size <> 0) Then";
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()!=0)) { 
RDebugUtils.currentLine=71237659;
 //BA.debugLineNum = 71237659;BA.debugLine="prev = SelectedRows.Get(0) ' there should be o";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=71237660;
 //BA.debugLineNum = 71237660;BA.debugLine="SelectedRows.set(0, rc.Row) ' change it to the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (0),(Object)(_rc.Row /*int*/ ));
 }else {
RDebugUtils.currentLine=71237662;
 //BA.debugLineNum = 71237662;BA.debugLine="prev = -1";
_prev = (int) (-1);
RDebugUtils.currentLine=71237663;
 //BA.debugLineNum = 71237663;BA.debugLine="SelectedRows.Add(rc.Row)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
 };
 };
 }else {
RDebugUtils.currentLine=71237668;
 //BA.debugLineNum = 71237668;BA.debugLine="prev = SelectedRows.Get(prevIndex) ' should be R";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_previndex)));
RDebugUtils.currentLine=71237669;
 //BA.debugLineNum = 71237669;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=71237672;
 //BA.debugLineNum = 71237672;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
RDebugUtils.currentLine=71237673;
 //BA.debugLineNum = 71237673;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=71237674;
 //BA.debugLineNum = 71237674;BA.debugLine="HideRow(prev)";
__ref._hiderow /*String*/ (null,_prev);
RDebugUtils.currentLine=71237675;
 //BA.debugLineNum = 71237675;BA.debugLine="ShowRow(prev)";
__ref._showrow /*void*/ (null,_prev);
 };
 };
RDebugUtils.currentLine=71237679;
 //BA.debugLineNum = 71237679;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=71237680;
 //BA.debugLineNum = 71237680;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=71237681;
 //BA.debugLineNum = 71237681;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=71237682;
 //BA.debugLineNum = 71237682;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=71237684;
 //BA.debugLineNum = 71237684;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_longclick", false))
	 {return ((String) Debug.delegate(ba, "cell_longclick", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=70909952;
 //BA.debugLineNum = 70909952;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=70909954;
 //BA.debugLineNum = 70909954;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=70909955;
 //BA.debugLineNum = 70909955;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=70909956;
 //BA.debugLineNum = 70909956;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=70909957;
 //BA.debugLineNum = 70909957;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=70909959;
 //BA.debugLineNum = 70909959;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellLongCl";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick")) { 
RDebugUtils.currentLine=70909960;
 //BA.debugLineNum = 70909960;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellLongClick";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=70909962;
 //BA.debugLineNum = 70909962;BA.debugLine="End Sub";
return "";
}
public boolean  _check1ddoubleallsame(b4a.example.ef.table __ref,double[] _arrdouble,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1ddoubleallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1ddoubleallsame", new Object[] {_arrdouble,_istart,_iend}));}
int _i = 0;
double _dval = 0;
RDebugUtils.currentLine=81854464;
 //BA.debugLineNum = 81854464;BA.debugLine="Sub Check1DDoubleAllSame(arrDouble() As Double, iS";
RDebugUtils.currentLine=81854466;
 //BA.debugLineNum = 81854466;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=81854467;
 //BA.debugLineNum = 81854467;BA.debugLine="Dim dVal As Double";
_dval = 0;
RDebugUtils.currentLine=81854469;
 //BA.debugLineNum = 81854469;BA.debugLine="If arrDouble.Length = 1 Then";
if (_arrdouble.length==1) { 
RDebugUtils.currentLine=81854470;
 //BA.debugLineNum = 81854470;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=81854473;
 //BA.debugLineNum = 81854473;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=81854474;
 //BA.debugLineNum = 81854474;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=81854477;
 //BA.debugLineNum = 81854477;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=81854478;
 //BA.debugLineNum = 81854478;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=81854481;
 //BA.debugLineNum = 81854481;BA.debugLine="dVal = arrDouble(0)";
_dval = _arrdouble[(int) (0)];
RDebugUtils.currentLine=81854483;
 //BA.debugLineNum = 81854483;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=81854484;
 //BA.debugLineNum = 81854484;BA.debugLine="If arrDouble(i) <> dVal Then";
if (_arrdouble[_i]!=_dval) { 
RDebugUtils.currentLine=81854485;
 //BA.debugLineNum = 81854485;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=81854489;
 //BA.debugLineNum = 81854489;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=81854491;
 //BA.debugLineNum = 81854491;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dlongallsame(b4a.example.ef.table __ref,long[] _arrlong,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dlongallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dlongallsame", new Object[] {_arrlong,_istart,_iend}));}
int _i = 0;
long _lval = 0L;
RDebugUtils.currentLine=81723392;
 //BA.debugLineNum = 81723392;BA.debugLine="Sub Check1DLongAllSame(arrLong() As Long, iStart A";
RDebugUtils.currentLine=81723394;
 //BA.debugLineNum = 81723394;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=81723395;
 //BA.debugLineNum = 81723395;BA.debugLine="Dim lVal As Long";
_lval = 0L;
RDebugUtils.currentLine=81723397;
 //BA.debugLineNum = 81723397;BA.debugLine="If arrLong.Length = 1 Then";
if (_arrlong.length==1) { 
RDebugUtils.currentLine=81723398;
 //BA.debugLineNum = 81723398;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=81723401;
 //BA.debugLineNum = 81723401;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=81723402;
 //BA.debugLineNum = 81723402;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=81723405;
 //BA.debugLineNum = 81723405;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=81723406;
 //BA.debugLineNum = 81723406;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=81723409;
 //BA.debugLineNum = 81723409;BA.debugLine="lVal = arrLong(0)";
_lval = _arrlong[(int) (0)];
RDebugUtils.currentLine=81723411;
 //BA.debugLineNum = 81723411;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=81723412;
 //BA.debugLineNum = 81723412;BA.debugLine="If arrLong(i) <> lVal Then";
if (_arrlong[_i]!=_lval) { 
RDebugUtils.currentLine=81723413;
 //BA.debugLineNum = 81723413;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=81723417;
 //BA.debugLineNum = 81723417;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=81723419;
 //BA.debugLineNum = 81723419;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dstringallsame(b4a.example.ef.table __ref,String[] _arrstring,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dstringallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dstringallsame", new Object[] {_arrstring,_bcaseinsensitive,_istart,_iend}));}
int _i = 0;
String _str = "";
RDebugUtils.currentLine=82116608;
 //BA.debugLineNum = 82116608;BA.debugLine="Sub Check1DStringAllSame(arrstring() As String, bC";
RDebugUtils.currentLine=82116610;
 //BA.debugLineNum = 82116610;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=82116611;
 //BA.debugLineNum = 82116611;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=82116613;
 //BA.debugLineNum = 82116613;BA.debugLine="If arrstring.Length = 1 Then";
if (_arrstring.length==1) { 
RDebugUtils.currentLine=82116614;
 //BA.debugLineNum = 82116614;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=82116617;
 //BA.debugLineNum = 82116617;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=82116618;
 //BA.debugLineNum = 82116618;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=82116621;
 //BA.debugLineNum = 82116621;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=82116622;
 //BA.debugLineNum = 82116622;BA.debugLine="iEnd = arrstring.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=82116625;
 //BA.debugLineNum = 82116625;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=82116626;
 //BA.debugLineNum = 82116626;BA.debugLine="str = arrstring(0).ToLowerCase";
_str = _arrstring[(int) (0)].toLowerCase();
RDebugUtils.currentLine=82116627;
 //BA.debugLineNum = 82116627;BA.debugLine="For i = iStart To iEnd";
{
final int step14 = 1;
final int limit14 = _iend;
_i = _istart ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=82116628;
 //BA.debugLineNum = 82116628;BA.debugLine="If arrstring(i).ToLowerCase.CompareTo(str) <> 0";
if (_arrstring[_i].toLowerCase().compareTo(_str)!=0) { 
RDebugUtils.currentLine=82116629;
 //BA.debugLineNum = 82116629;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 }else {
RDebugUtils.currentLine=82116633;
 //BA.debugLineNum = 82116633;BA.debugLine="str = arrstring(0)";
_str = _arrstring[(int) (0)];
RDebugUtils.currentLine=82116634;
 //BA.debugLineNum = 82116634;BA.debugLine="For i = iStart To iEnd";
{
final int step21 = 1;
final int limit21 = _iend;
_i = _istart ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=82116635;
 //BA.debugLineNum = 82116635;BA.debugLine="If arrstring(i).CompareTo(str) <> 0 Then";
if (_arrstring[_i].compareTo(_str)!=0) { 
RDebugUtils.currentLine=82116636;
 //BA.debugLineNum = 82116636;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 };
RDebugUtils.currentLine=82116641;
 //BA.debugLineNum = 82116641;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=82116643;
 //BA.debugLineNum = 82116643;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=77266944;
 //BA.debugLineNum = 77266944;BA.debugLine="Private Sub CheckColumnDataTypes(MyCurs As Cursor)";
RDebugUtils.currentLine=77266945;
 //BA.debugLineNum = 77266945;BA.debugLine="Private NbCols, NbRows As Int";
_nbcols = 0;
_nbrows = 0;
RDebugUtils.currentLine=77266946;
 //BA.debugLineNum = 77266946;BA.debugLine="NbCols = MyCurs.ColumnCount";
_nbcols = _mycurs.getColumnCount();
RDebugUtils.currentLine=77266947;
 //BA.debugLineNum = 77266947;BA.debugLine="NbRows = MyCurs.RowCount";
_nbrows = _mycurs.getRowCount();
RDebugUtils.currentLine=77266949;
 //BA.debugLineNum = 77266949;BA.debugLine="Private ColumnTypes(NbCols), str As String";
_columntypes = new String[_nbcols];
java.util.Arrays.fill(_columntypes,"");
_str = "";
RDebugUtils.currentLine=77266950;
 //BA.debugLineNum = 77266950;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=77266952;
 //BA.debugLineNum = 77266952;BA.debugLine="For col = 0 To NbCols - 1";
{
final int step6 = 1;
final int limit6 = (int) (_nbcols-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=77266953;
 //BA.debugLineNum = 77266953;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=77266954;
 //BA.debugLineNum = 77266954;BA.debugLine="For row = 0 To NbRows - 1";
{
final int step8 = 1;
final int limit8 = (int) (_nbrows-1);
_row = (int) (0) ;
for (;_row <= limit8 ;_row = _row + step8 ) {
RDebugUtils.currentLine=77266955;
 //BA.debugLineNum = 77266955;BA.debugLine="MyCurs.Position = row";
_mycurs.setPosition(_row);
RDebugUtils.currentLine=77266956;
 //BA.debugLineNum = 77266956;BA.debugLine="str = MyCurs.GetString2(col)";
_str = _mycurs.GetString2(_col);
RDebugUtils.currentLine=77266957;
 //BA.debugLineNum = 77266957;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=77266958;
 //BA.debugLineNum = 77266958;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=77266960;
 //BA.debugLineNum = 77266960;BA.debugLine="If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=77266961;
 //BA.debugLineNum = 77266961;BA.debugLine="If str.Contains(\".\") Then";
if (_str.contains(".")) { 
RDebugUtils.currentLine=77266962;
 //BA.debugLineNum = 77266962;BA.debugLine="ColumnTypes(col) = \"R\"";
_columntypes[_col] = "R";
 }else {
RDebugUtils.currentLine=77266964;
 //BA.debugLineNum = 77266964;BA.debugLine="ColumnTypes(col) = \"I\"";
_columntypes[_col] = "I";
 };
 }else {
RDebugUtils.currentLine=77266967;
 //BA.debugLineNum = 77266967;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=77266968;
 //BA.debugLineNum = 77266968;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=77266973;
 //BA.debugLineNum = 77266973;BA.debugLine="Return ColumnTypes";
if (true) return _columntypes;
RDebugUtils.currentLine=77266974;
 //BA.debugLineNum = 77266974;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=69337088;
 //BA.debugLineNum = 69337088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=69337090;
 //BA.debugLineNum = 69337090;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=69337091;
 //BA.debugLineNum = 69337091;BA.debugLine="Private SV2 As ScrollView2D";
_sv2 = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=69337092;
 //BA.debugLineNum = 69337092;BA.debugLine="Private SVF As ScrollView";
_svf = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=69337093;
 //BA.debugLineNum = 69337093;BA.debugLine="Private pnlTable As Panel";
_pnltable = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337094;
 //BA.debugLineNum = 69337094;BA.debugLine="Private Header, HeaderBase As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
_headerbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337095;
 //BA.debugLineNum = 69337095;BA.debugLine="Private HeaderFirst As Panel";
_headerfirst = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337096;
 //BA.debugLineNum = 69337096;BA.debugLine="Private lblStatusLine As Label";
_lblstatusline = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=69337098;
 //BA.debugLineNum = 69337098;BA.debugLine="Private pnlFastScroll As Panel";
_pnlfastscroll = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337099;
 //BA.debugLineNum = 69337099;BA.debugLine="Private pnlFastScrollCursor As Panel";
_pnlfastscrollcursor = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337100;
 //BA.debugLineNum = 69337100;BA.debugLine="Private FScCursorWidth = 25dip As Int";
_fsccursorwidth = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=69337101;
 //BA.debugLineNum = 69337101;BA.debugLine="Private FScCursorHeight = 60dip As Int";
_fsccursorheight = __c.DipToCurrent((int) (60));
RDebugUtils.currentLine=69337102;
 //BA.debugLineNum = 69337102;BA.debugLine="Private FscLabelTopDelta As Int";
_fsclabeltopdelta = 0;
RDebugUtils.currentLine=69337103;
 //BA.debugLineNum = 69337103;BA.debugLine="Private FScBackgroundColor = Colors.ARGB(48, 128,";
_fscbackgroundcolor = __c.Colors.ARGB((int) (48),(int) (128),(int) (128),(int) (128));
RDebugUtils.currentLine=69337104;
 //BA.debugLineNum = 69337104;BA.debugLine="Private FScCursorCol1 = Colors.Blue As Int";
_fsccursorcol1 = __c.Colors.Blue;
RDebugUtils.currentLine=69337105;
 //BA.debugLineNum = 69337105;BA.debugLine="Private FScCursorCol2 = Colors.Yellow As Int";
_fsccursorcol2 = __c.Colors.Yellow;
RDebugUtils.currentLine=69337106;
 //BA.debugLineNum = 69337106;BA.debugLine="Private lblFastScroll As Label";
_lblfastscroll = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=69337107;
 //BA.debugLineNum = 69337107;BA.debugLine="Private FSY0, FSdY, FastScrollHeight As Int";
_fsy0 = 0;
_fsdy = 0;
_fastscrollheight = 0;
RDebugUtils.currentLine=69337108;
 //BA.debugLineNum = 69337108;BA.debugLine="Private FScScale As Double";
_fscscale = 0;
RDebugUtils.currentLine=69337109;
 //BA.debugLineNum = 69337109;BA.debugLine="Private FScTimer As Timer";
_fsctimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=69337110;
 //BA.debugLineNum = 69337110;BA.debugLine="Private mFastScroll = False As Boolean";
_mfastscroll = __c.False;
RDebugUtils.currentLine=69337111;
 //BA.debugLineNum = 69337111;BA.debugLine="Private FastScrollActive As Boolean";
_fastscrollactive = false;
RDebugUtils.currentLine=69337112;
 //BA.debugLineNum = 69337112;BA.debugLine="Private mFastScrollColumnIndex = 0 As Int";
_mfastscrollcolumnindex = (int) (0);
RDebugUtils.currentLine=69337113;
 //BA.debugLineNum = 69337113;BA.debugLine="Private mFastScrollMinItems = 50 As Int";
_mfastscrollminitems = (int) (50);
RDebugUtils.currentLine=69337114;
 //BA.debugLineNum = 69337114;BA.debugLine="Private mFastScrollShowLabel = True As Boolean";
_mfastscrollshowlabel = __c.True;
RDebugUtils.currentLine=69337115;
 //BA.debugLineNum = 69337115;BA.debugLine="Private mFastScrollFixedLabel = False As Boolean";
_mfastscrollfixedlabel = __c.False;
RDebugUtils.currentLine=69337116;
 //BA.debugLineNum = 69337116;BA.debugLine="Private mFastScrollLabelMaxChars = 10 As Int";
_mfastscrolllabelmaxchars = (int) (10);
RDebugUtils.currentLine=69337117;
 //BA.debugLineNum = 69337117;BA.debugLine="Private mFastScrollLabelWidth = 150dip As Int";
_mfastscrolllabelwidth = __c.DipToCurrent((int) (150));
RDebugUtils.currentLine=69337118;
 //BA.debugLineNum = 69337118;BA.debugLine="Private mFastScrollLabelHeight = 30dip As Int";
_mfastscrolllabelheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=69337120;
 //BA.debugLineNum = 69337120;BA.debugLine="Private cCallBack As Object";
_ccallback = new Object();
RDebugUtils.currentLine=69337121;
 //BA.debugLineNum = 69337121;BA.debugLine="Private cEventName As String";
_ceventname = "";
RDebugUtils.currentLine=69337122;
 //BA.debugLineNum = 69337122;BA.debugLine="Private cLeft, cTop , cWidth, cHeight As Int";
_cleft = 0;
_ctop = 0;
_cwidth = 0;
_cheight = 0;
RDebugUtils.currentLine=69337123;
 //BA.debugLineNum = 69337123;BA.debugLine="Public HeaderNames As List";
_headernames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337124;
 //BA.debugLineNum = 69337124;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
_selectedrows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337125;
 //BA.debugLineNum = 69337125;BA.debugLine="Private SelectedCol As Int";
_selectedcol = 0;
RDebugUtils.currentLine=69337126;
 //BA.debugLineNum = 69337126;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337127;
 //BA.debugLineNum = 69337127;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337128;
 //BA.debugLineNum = 69337128;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
RDebugUtils.currentLine=69337129;
 //BA.debugLineNum = 69337129;BA.debugLine="Private IsVisible As Boolean";
_isvisible = false;
RDebugUtils.currentLine=69337130;
 //BA.debugLineNum = 69337130;BA.debugLine="Public visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69337131;
 //BA.debugLineNum = 69337131;BA.debugLine="Private mNumberOfColumns, ColumnWidths(), cColumn";
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
RDebugUtils.currentLine=69337132;
 //BA.debugLineNum = 69337132;BA.debugLine="Private cColumnDataType() As String";
_ccolumndatatype = new String[(int) (0)];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=69337133;
 //BA.debugLineNum = 69337133;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
_crowheight = 0;
_cheadercolor = 0;
_ctablecolor = 0;
_ctextcolor = 0;
_cheaderheight = 0;
_cheadertextcolor = 0;
_cstatuslineheight = 0;
RDebugUtils.currentLine=69337134;
 //BA.debugLineNum = 69337134;BA.debugLine="Private cAutomaticWidths = False As Boolean";
_cautomaticwidths = __c.False;
RDebugUtils.currentLine=69337135;
 //BA.debugLineNum = 69337135;BA.debugLine="Private cTextSize As Float";
_ctextsize = 0f;
RDebugUtils.currentLine=69337136;
 //BA.debugLineNum = 69337136;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
RDebugUtils.currentLine=69337137;
 //BA.debugLineNum = 69337137;BA.debugLine="Private cAlignment As Int";
_calignment = 0;
RDebugUtils.currentLine=69337138;
 //BA.debugLineNum = 69337138;BA.debugLine="Private cAlignments() As Int";
_calignments = new int[(int) (0)];
;
RDebugUtils.currentLine=69337139;
 //BA.debugLineNum = 69337139;BA.debugLine="Private cAlignments0() As Int";
_calignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=69337140;
 //BA.debugLineNum = 69337140;BA.debugLine="Private MultiAlignments = False As Boolean";
_multialignments = __c.False;
RDebugUtils.currentLine=69337141;
 //BA.debugLineNum = 69337141;BA.debugLine="Private MultiTypeFace = False As Boolean";
_multitypeface = __c.False;
RDebugUtils.currentLine=69337142;
 //BA.debugLineNum = 69337142;BA.debugLine="Private MultiTextColors = False As Boolean";
_multitextcolors = __c.False;
RDebugUtils.currentLine=69337143;
 //BA.debugLineNum = 69337143;BA.debugLine="Private cHeaderAlignment = Gravity.CENTER As Int";
_cheaderalignment = __c.Gravity.CENTER;
RDebugUtils.currentLine=69337144;
 //BA.debugLineNum = 69337144;BA.debugLine="Private cHeaderAlignments() As Int";
_cheaderalignments = new int[(int) (0)];
;
RDebugUtils.currentLine=69337145;
 //BA.debugLineNum = 69337145;BA.debugLine="Private cHeaderAlignments0() As Int";
_cheaderalignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=69337146;
 //BA.debugLineNum = 69337146;BA.debugLine="Private HeaderMultiAlignments = False As Boolean";
_headermultialignments = __c.False;
RDebugUtils.currentLine=69337147;
 //BA.debugLineNum = 69337147;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
_ctypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_ctypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=69337148;
 //BA.debugLineNum = 69337148;BA.debugLine="Private cTypeFaces() As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=69337149;
 //BA.debugLineNum = 69337149;BA.debugLine="Private cTypeFaces0() As Typeface";
_ctypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=69337150;
 //BA.debugLineNum = 69337150;BA.debugLine="Private HeaderMultiTypeFace = False As Boolean";
_headermultitypeface = __c.False;
RDebugUtils.currentLine=69337151;
 //BA.debugLineNum = 69337151;BA.debugLine="Private cHeaderTypeFace = Typeface.DEFAULT As Typ";
_cheadertypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_cheadertypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=69337152;
 //BA.debugLineNum = 69337152;BA.debugLine="Private cHeaderTypeFaces() As Typeface";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=69337153;
 //BA.debugLineNum = 69337153;BA.debugLine="Private cHeaderTypeFaces0() As Typeface";
_cheadertypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=69337154;
 //BA.debugLineNum = 69337154;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
_clinewidth = (int) (__c.Max(1,__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69337155;
 //BA.debugLineNum = 69337155;BA.debugLine="Private ExtraWidth = 12dip + cLineWidth	As Int";
_extrawidth = (int) (__c.DipToCurrent((int) (12))+__ref._clinewidth /*int*/ );
RDebugUtils.currentLine=69337156;
 //BA.debugLineNum = 69337156;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
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
RDebugUtils.currentLine=69337157;
 //BA.debugLineNum = 69337157;BA.debugLine="Private SelectedCellDrawable As Object";
_selectedcelldrawable = new Object();
RDebugUtils.currentLine=69337158;
 //BA.debugLineNum = 69337158;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
_crowcolor1 = 0;
_crowcolor2 = 0;
_cselectedrowcolor = 0;
_cselectedcellcolor = 0;
_cselectedrowtextcolor = 0;
_cselectedcelltextcolor = 0;
RDebugUtils.currentLine=69337159;
 //BA.debugLineNum = 69337159;BA.debugLine="Private cSortColumn = True As Boolean";
_csortcolumn = __c.True;
RDebugUtils.currentLine=69337160;
 //BA.debugLineNum = 69337160;BA.debugLine="Private cUseColumnColors = False As Boolean";
_cusecolumncolors = __c.False;
RDebugUtils.currentLine=69337161;
 //BA.debugLineNum = 69337161;BA.debugLine="Private cSortRemoveAccents = False As Boolean";
_csortremoveaccents = __c.False;
RDebugUtils.currentLine=69337162;
 //BA.debugLineNum = 69337162;BA.debugLine="Private mFirstColumnsWidth = 0 As Int";
_mfirstcolumnswidth = (int) (0);
RDebugUtils.currentLine=69337163;
 //BA.debugLineNum = 69337163;BA.debugLine="Private mFirstColumnFixed = False As Boolean";
_mfirstcolumnfixed = __c.False;
RDebugUtils.currentLine=69337164;
 //BA.debugLineNum = 69337164;BA.debugLine="Private mNumberOfFixedColumns As Int";
_mnumberoffixedcolumns = 0;
RDebugUtils.currentLine=69337165;
 //BA.debugLineNum = 69337165;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=69337166;
 //BA.debugLineNum = 69337166;BA.debugLine="Private cvs As Canvas		' used to measure string w";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=69337167;
 //BA.debugLineNum = 69337167;BA.debugLine="Private lstRowColorIndexes As List";
_lstrowcolorindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337168;
 //BA.debugLineNum = 69337168;BA.debugLine="Private lstRowColors As List";
_lstrowcolors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337169;
 //BA.debugLineNum = 69337169;BA.debugLine="Private lstRowDrawables As List";
_lstrowdrawables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337171;
 //BA.debugLineNum = 69337171;BA.debugLine="cHeaderColor = Colors.Gray";
__ref._cheadercolor /*int*/  = __c.Colors.Gray;
RDebugUtils.currentLine=69337172;
 //BA.debugLineNum = 69337172;BA.debugLine="cTableColor = Colors.LightGray";
__ref._ctablecolor /*int*/  = __c.Colors.LightGray;
RDebugUtils.currentLine=69337173;
 //BA.debugLineNum = 69337173;BA.debugLine="cTextColor = Colors.Black";
__ref._ctextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=69337174;
 //BA.debugLineNum = 69337174;BA.debugLine="cHeaderTextColor = Colors.White";
__ref._cheadertextcolor /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=69337175;
 //BA.debugLineNum = 69337175;BA.debugLine="cTextSize = 14";
__ref._ctextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=69337176;
 //BA.debugLineNum = 69337176;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
RDebugUtils.currentLine=69337177;
 //BA.debugLineNum = 69337177;BA.debugLine="cRowColor1 = Colors.White";
__ref._crowcolor1 /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=69337178;
 //BA.debugLineNum = 69337178;BA.debugLine="cRowColor2 = 0xFF98F5FF";
__ref._crowcolor2 /*int*/  = ((int)0xff98f5ff);
RDebugUtils.currentLine=69337179;
 //BA.debugLineNum = 69337179;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
__ref._cselectedrowcolor /*int*/  = ((int)0xff007fff);
RDebugUtils.currentLine=69337180;
 //BA.debugLineNum = 69337180;BA.debugLine="cSelectedRowTextColor = Colors.Black";
__ref._cselectedrowtextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=69337181;
 //BA.debugLineNum = 69337181;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
__ref._cselectedcellcolor /*int*/  = ((int)0xfffc8eac);
RDebugUtils.currentLine=69337182;
 //BA.debugLineNum = 69337182;BA.debugLine="cSelectedCellTextColor = Colors.Black";
__ref._cselectedcelltextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=69337183;
 //BA.debugLineNum = 69337183;BA.debugLine="cRowHeight = 40dip";
__ref._crowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=69337184;
 //BA.debugLineNum = 69337184;BA.debugLine="cHeaderHeight = cRowHeight";
__ref._cheaderheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=69337185;
 //BA.debugLineNum = 69337185;BA.debugLine="cStatusLineHeight = cRowHeight";
__ref._cstatuslineheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=69337187;
 //BA.debugLineNum = 69337187;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
_csingleline = __c.True;
RDebugUtils.currentLine=69337189;
 //BA.debugLineNum = 69337189;BA.debugLine="Private mMultiSelect As Boolean = False";
_mmultiselect = __c.False;
RDebugUtils.currentLine=69337190;
 //BA.debugLineNum = 69337190;BA.debugLine="Private cAllowSelection = True As Boolean";
_callowselection = __c.True;
RDebugUtils.currentLine=69337191;
 //BA.debugLineNum = 69337191;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
_savedwidths = new int[(int) (0)];
;
RDebugUtils.currentLine=69337192;
 //BA.debugLineNum = 69337192;BA.debugLine="Private cShowStatusLine As Boolean =True";
_cshowstatusline = __c.True;
RDebugUtils.currentLine=69337194;
 //BA.debugLineNum = 69337194;BA.debugLine="Private internalPanel As Panel";
_internalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337196;
 //BA.debugLineNum = 69337196;BA.debugLine="Public sortingDir As Int = 0 ' -1,0,1 as acc, uns";
_sortingdir = (int) (0);
RDebugUtils.currentLine=69337197;
 //BA.debugLineNum = 69337197;BA.debugLine="Public sortedCol As Int = -1' hold the sorted col";
_sortedcol = (int) (-1);
RDebugUtils.currentLine=69337198;
 //BA.debugLineNum = 69337198;BA.debugLine="Private pnlSortingView As Panel";
_pnlsortingview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337200;
 //BA.debugLineNum = 69337200;BA.debugLine="Private debug_counter As Long";
_debug_counter = 0L;
RDebugUtils.currentLine=69337201;
 //BA.debugLineNum = 69337201;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
_enablestatuslineautofill = __c.True;
RDebugUtils.currentLine=69337203;
 //BA.debugLineNum = 69337203;BA.debugLine="Private pnlAsc As Panel										'added in versio";
_pnlasc = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=69337204;
 //BA.debugLineNum = 69337204;BA.debugLine="Private bmpAsc, bmpDes, bmpEqual As Bitmap					'a";
_bmpasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=69337205;
 //BA.debugLineNum = 69337205;BA.debugLine="Private cvsAsc, cvsDes, cvsEqual As Canvas					'a";
_cvsasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=69337206;
 //BA.debugLineNum = 69337206;BA.debugLine="Private cSortBitmapWidth As Int						'added in ve";
_csortbitmapwidth = 0;
RDebugUtils.currentLine=69337207;
 //BA.debugLineNum = 69337207;BA.debugLine="Private cSortBitmapHeight As Int					'added in ve";
_csortbitmapheight = 0;
RDebugUtils.currentLine=69337208;
 //BA.debugLineNum = 69337208;BA.debugLine="Private cSortBitmapColor As Int						'added in ve";
_csortbitmapcolor = 0;
RDebugUtils.currentLine=69337209;
 //BA.debugLineNum = 69337209;BA.debugLine="Private mCustomSortingBitmaps As Boolean	'added i";
_mcustomsortingbitmaps = false;
RDebugUtils.currentLine=69337210;
 //BA.debugLineNum = 69337210;BA.debugLine="Private mZeroSelection = False As Boolean";
_mzeroselection = __c.False;
RDebugUtils.currentLine=69337211;
 //BA.debugLineNum = 69337211;BA.debugLine="Private SV2Scrolls, SVFScrolls As Boolean";
_sv2scrolls = false;
_svfscrolls = false;
RDebugUtils.currentLine=69337212;
 //BA.debugLineNum = 69337212;BA.debugLine="Private SV2PosX As Int";
_sv2posx = 0;
RDebugUtils.currentLine=69337213;
 //BA.debugLineNum = 69337213;BA.debugLine="Public TableObject As Table";
_tableobject = new b4a.example.ef.table();
RDebugUtils.currentLine=69337218;
 //BA.debugLineNum = 69337218;BA.debugLine="Private arrColLong() As Long";
_arrcollong = new long[(int) (0)];
;
RDebugUtils.currentLine=69337219;
 //BA.debugLineNum = 69337219;BA.debugLine="Private arrColDouble() As Double";
_arrcoldouble = new double[(int) (0)];
;
RDebugUtils.currentLine=69337220;
 //BA.debugLineNum = 69337220;BA.debugLine="Private arrColString() As String";
_arrcolstring = new String[(int) (0)];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=69337221;
 //BA.debugLineNum = 69337221;BA.debugLine="Private arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=69337222;
 //BA.debugLineNum = 69337222;BA.debugLine="Private iPreviousSortColumn As Int = -1 'ignore w";
_iprevioussortcolumn = (int) (-1);
RDebugUtils.currentLine=69337223;
 //BA.debugLineNum = 69337223;BA.debugLine="Private bPreviousSortAscending As Boolean 'ignore";
_bprevioussortascending = false;
RDebugUtils.currentLine=69337224;
 //BA.debugLineNum = 69337224;BA.debugLine="Private mapSortingIndexes As Map";
_mapsortingindexes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=69337225;
 //BA.debugLineNum = 69337225;BA.debugLine="Private arrDataSorted() As Boolean 'added";
_arrdatasorted = new boolean[(int) (0)];
;
RDebugUtils.currentLine=69337226;
 //BA.debugLineNum = 69337226;BA.debugLine="Private bDataTempDone As Boolean 'added";
_bdatatempdone = false;
RDebugUtils.currentLine=69337227;
 //BA.debugLineNum = 69337227;BA.debugLine="Private DataTemp As List 'added";
_datatemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=69337228;
 //BA.debugLineNum = 69337228;BA.debugLine="Private mMultiColumnSort As Boolean = False";
_mmulticolumnsort = __c.False;
RDebugUtils.currentLine=69337229;
 //BA.debugLineNum = 69337229;BA.debugLine="Private mSortCaseInsensitive As Boolean = False";
_msortcaseinsensitive = __c.False;
RDebugUtils.currentLine=69337231;
 //BA.debugLineNum = 69337231;BA.debugLine="End Sub";
return "";
}
public String  _clearall(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearall", false))
	 {return ((String) Debug.delegate(ba, "clearall", null));}
RDebugUtils.currentLine=69926912;
 //BA.debugLineNum = 69926912;BA.debugLine="Public Sub ClearAll";
RDebugUtils.currentLine=69926913;
 //BA.debugLineNum = 69926913;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=69926914;
 //BA.debugLineNum = 69926914;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=69926915;
 //BA.debugLineNum = 69926915;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70123520;
 //BA.debugLineNum = 70123520;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int,";
RDebugUtils.currentLine=70123521;
 //BA.debugLineNum = 70123521;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=70123522;
 //BA.debugLineNum = 70123522;BA.debugLine="SV2.Panel.RemoveAllViews";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=70123523;
 //BA.debugLineNum = 70123523;BA.debugLine="SVF.Panel.RemoveAllViews";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=70123524;
 //BA.debugLineNum = 70123524;BA.debugLine="mNumberOfColumns = vNumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _vnumberofcolumns;
RDebugUtils.currentLine=70123525;
 //BA.debugLineNum = 70123525;BA.debugLine="Dim Drawable1(mNumberOfColumns) As Object";
_drawable1 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
RDebugUtils.currentLine=70123526;
 //BA.debugLineNum = 70123526;BA.debugLine="Dim Drawable2(mNumberOfColumns) As Object";
_drawable2 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=70123527;
 //BA.debugLineNum = 70123527;BA.debugLine="Dim SelectedDrawable(mNumberOfColumns) As Object";
_selecteddrawable = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
RDebugUtils.currentLine=70123528;
 //BA.debugLineNum = 70123528;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=70123529;
 //BA.debugLineNum = 70123529;BA.debugLine="Dim cHeaderAlignments(mNumberOfColumns) As Int";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=70123530;
 //BA.debugLineNum = 70123530;BA.debugLine="Dim cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=70123531;
 //BA.debugLineNum = 70123531;BA.debugLine="Dim cHeaderTypeFaces(mNumberOfColumns) As Typefac";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=70123533;
 //BA.debugLineNum = 70123533;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70123534;
 //BA.debugLineNum = 70123534;BA.debugLine="If lstRowColors.Size > 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=70123535;
 //BA.debugLineNum = 70123535;BA.debugLine="For i = 0 To lstRowColors.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=70123536;
 //BA.debugLineNum = 70123536;BA.debugLine="Private cds(mNumberOfColumns) As Object";
_cds = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cds.length;
for (int i0 = 0;i0 < d0;i0++) {
_cds[i0] = new Object();
}
}
;
RDebugUtils.currentLine=70123537;
 //BA.debugLineNum = 70123537;BA.debugLine="Private color = lstRowColors.Get(i) As Int";
_color = (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=70123538;
 //BA.debugLineNum = 70123538;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=70123539;
 //BA.debugLineNum = 70123539;BA.debugLine="Private cdi As ColorDrawable";
_cdi = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=70123540;
 //BA.debugLineNum = 70123540;BA.debugLine="cdi.Initialize(color, 0)";
_cdi.Initialize(_color,(int) (0));
RDebugUtils.currentLine=70123541;
 //BA.debugLineNum = 70123541;BA.debugLine="cds(col) = cdi";
_cds[_col] = (Object)(_cdi.getObject());
 }
};
RDebugUtils.currentLine=70123543;
 //BA.debugLineNum = 70123543;BA.debugLine="lstRowDrawables.Add(cds)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cds));
 }
};
 };
RDebugUtils.currentLine=70123546;
 //BA.debugLineNum = 70123546;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=70123547;
 //BA.debugLineNum = 70123547;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=70123548;
 //BA.debugLineNum = 70123548;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
_cd1.Initialize(__ref._crowcolor1 /*int*/ ,(int) (0));
RDebugUtils.currentLine=70123549;
 //BA.debugLineNum = 70123549;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
_cd2.Initialize(__ref._crowcolor2 /*int*/ ,(int) (0));
RDebugUtils.currentLine=70123550;
 //BA.debugLineNum = 70123550;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=70123551;
 //BA.debugLineNum = 70123551;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=70123552;
 //BA.debugLineNum = 70123552;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=70123553;
 //BA.debugLineNum = 70123553;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=70123554;
 //BA.debugLineNum = 70123554;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123555;
 //BA.debugLineNum = 70123555;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=70123557;
 //BA.debugLineNum = 70123557;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=70123559;
 //BA.debugLineNum = 70123559;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123560;
 //BA.debugLineNum = 70123560;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=70123562;
 //BA.debugLineNum = 70123562;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=70123565;
 //BA.debugLineNum = 70123565;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123566;
 //BA.debugLineNum = 70123566;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=70123568;
 //BA.debugLineNum = 70123568;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=70123570;
 //BA.debugLineNum = 70123570;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123571;
 //BA.debugLineNum = 70123571;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=70123573;
 //BA.debugLineNum = 70123573;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 }else {
RDebugUtils.currentLine=70123577;
 //BA.debugLineNum = 70123577;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
RDebugUtils.currentLine=70123578;
 //BA.debugLineNum = 70123578;BA.debugLine="Private cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=70123579;
 //BA.debugLineNum = 70123579;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
_cd1.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=70123580;
 //BA.debugLineNum = 70123580;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
_cd2.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=70123581;
 //BA.debugLineNum = 70123581;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=70123582;
 //BA.debugLineNum = 70123582;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=70123583;
 //BA.debugLineNum = 70123583;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=70123584;
 //BA.debugLineNum = 70123584;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=70123585;
 //BA.debugLineNum = 70123585;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123586;
 //BA.debugLineNum = 70123586;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=70123588;
 //BA.debugLineNum = 70123588;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=70123590;
 //BA.debugLineNum = 70123590;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123591;
 //BA.debugLineNum = 70123591;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=70123593;
 //BA.debugLineNum = 70123593;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=70123596;
 //BA.debugLineNum = 70123596;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123597;
 //BA.debugLineNum = 70123597;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=70123599;
 //BA.debugLineNum = 70123599;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=70123601;
 //BA.debugLineNum = 70123601;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70123602;
 //BA.debugLineNum = 70123602;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=70123604;
 //BA.debugLineNum = 70123604;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 };
RDebugUtils.currentLine=70123609;
 //BA.debugLineNum = 70123609;BA.debugLine="Dim cd4 As ColorDrawable";
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=70123610;
 //BA.debugLineNum = 70123610;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
_cd4.Initialize(__ref._cselectedcellcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=70123611;
 //BA.debugLineNum = 70123611;BA.debugLine="SelectedCellDrawable = cd4";
__ref._selectedcelldrawable /*Object*/  = (Object)(_cd4.getObject());
RDebugUtils.currentLine=70123613;
 //BA.debugLineNum = 70123613;BA.debugLine="SV2.Panel.Height = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=70123614;
 //BA.debugLineNum = 70123614;BA.debugLine="SVF.Panel.Height = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=70123617;
 //BA.debugLineNum = 70123617;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=70123618;
 //BA.debugLineNum = 70123618;BA.debugLine="minVisibleRow = -1";
__ref._minvisiblerow /*int*/  = (int) (-1);
RDebugUtils.currentLine=70123619;
 //BA.debugLineNum = 70123619;BA.debugLine="maxVisibleRow = 0";
__ref._maxvisiblerow /*int*/  = (int) (0);
RDebugUtils.currentLine=70123620;
 //BA.debugLineNum = 70123620;BA.debugLine="If ClearData = True Then";
if (_cleardata==__c.True) { 
RDebugUtils.currentLine=70123621;
 //BA.debugLineNum = 70123621;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=70123623;
 //BA.debugLineNum = 70123623;BA.debugLine="LabelsCache.Initialize";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=70123624;
 //BA.debugLineNum = 70123624;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=70123625;
 //BA.debugLineNum = 70123625;BA.debugLine="SV2.VerticalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=70123626;
 //BA.debugLineNum = 70123626;BA.debugLine="SVF.ScrollPosition = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setScrollPosition((int) (0));
RDebugUtils.currentLine=70123627;
 //BA.debugLineNum = 70123627;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step100 = 1;
final int limit100 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit100 ;_i = _i + step100 ) {
RDebugUtils.currentLine=70123628;
 //BA.debugLineNum = 70123628;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null)));
 }
};
RDebugUtils.currentLine=70123630;
 //BA.debugLineNum = 70123630;BA.debugLine="If IsVisible Then";
if (__ref._isvisible /*boolean*/ ) { 
RDebugUtils.currentLine=70123631;
 //BA.debugLineNum = 70123631;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=70123632;
 //BA.debugLineNum = 70123632;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=70123634;
 //BA.debugLineNum = 70123634;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=70123636;
 //BA.debugLineNum = 70123636;BA.debugLine="End Sub";
return "";
}
public String  _updateiplocation(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updateiplocation", false))
	 {return ((String) Debug.delegate(ba, "updateiplocation", null));}
RDebugUtils.currentLine=72941568;
 //BA.debugLineNum = 72941568;BA.debugLine="Private Sub updateIPLocation";
RDebugUtils.currentLine=72941569;
 //BA.debugLineNum = 72941569;BA.debugLine="If (SV2.Height > Data.Size * cRowHeight) Then";
if ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )) { 
RDebugUtils.currentLine=72941571;
 //BA.debugLineNum = 72941571;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cHe";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ +__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=72941572;
 //BA.debugLineNum = 72941572;BA.debugLine="internalPanel.Height = SV2.Height - (Data.Size *";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=72941574;
 //BA.debugLineNum = 72941574;BA.debugLine="internalPanel.Height = 0";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (0));
 };
RDebugUtils.currentLine=72941576;
 //BA.debugLineNum = 72941576;BA.debugLine="End Sub";
return "";
}
public String  _clearselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearselection", false))
	 {return ((String) Debug.delegate(ba, "clearselection", null));}
RDebugUtils.currentLine=72089600;
 //BA.debugLineNum = 72089600;BA.debugLine="Public Sub clearSelection";
RDebugUtils.currentLine=72089602;
 //BA.debugLineNum = 72089602;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=72089603;
 //BA.debugLineNum = 72089603;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=72089604;
 //BA.debugLineNum = 72089604;BA.debugLine="End Sub";
return "";
}
public String  _refreshtable(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "refreshtable", false))
	 {return ((String) Debug.delegate(ba, "refreshtable", null));}
int _i = 0;
RDebugUtils.currentLine=72155136;
 //BA.debugLineNum = 72155136;BA.debugLine="Public Sub RefreshTable";
RDebugUtils.currentLine=72155137;
 //BA.debugLineNum = 72155137;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=72155138;
 //BA.debugLineNum = 72155138;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step2 = 1;
final int limit2 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=72155139;
 //BA.debugLineNum = 72155139;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
RDebugUtils.currentLine=72155140;
 //BA.debugLineNum = 72155140;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=72155142;
 //BA.debugLineNum = 72155142;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70778880;
 //BA.debugLineNum = 70778880;BA.debugLine="Private Sub CreateNewLabels As Label()";
RDebugUtils.currentLine=70778881;
 //BA.debugLineNum = 70778881;BA.debugLine="Dim lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=70778882;
 //BA.debugLineNum = 70778882;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=70778883;
 //BA.debugLineNum = 70778883;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=70778884;
 //BA.debugLineNum = 70778884;BA.debugLine="rc.Col = i";
_rc.Col /*int*/  = _i;
RDebugUtils.currentLine=70778885;
 //BA.debugLineNum = 70778885;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=70778886;
 //BA.debugLineNum = 70778886;BA.debugLine="lbl.Initialize(\"Cell\")";
_lbl.Initialize(ba,"Cell");
RDebugUtils.currentLine=70778888;
 //BA.debugLineNum = 70778888;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=70778890;
 //BA.debugLineNum = 70778890;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70778891;
 //BA.debugLineNum = 70778891;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=70778893;
 //BA.debugLineNum = 70778893;BA.debugLine="lbl.TextColor = cTextColors(i)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 };
RDebugUtils.currentLine=70778896;
 //BA.debugLineNum = 70778896;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70778897;
 //BA.debugLineNum = 70778897;BA.debugLine="lbl.Typeface = cTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=70778899;
 //BA.debugLineNum = 70778899;BA.debugLine="lbl.Typeface = cTypeFaces(i)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()));
 };
RDebugUtils.currentLine=70778902;
 //BA.debugLineNum = 70778902;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=70778904;
 //BA.debugLineNum = 70778904;BA.debugLine="lbl.SingleLine = cSingleLine";
_lbl.setSingleLine(__ref._csingleline /*boolean*/ );
RDebugUtils.currentLine=70778905;
 //BA.debugLineNum = 70778905;BA.debugLine="lbl.Tag = rc";
_lbl.setTag((Object)(_rc));
RDebugUtils.currentLine=70778906;
 //BA.debugLineNum = 70778906;BA.debugLine="lbls(i) = lbl";
_lbls[_i] = _lbl;
 }
};
RDebugUtils.currentLine=70778908;
 //BA.debugLineNum = 70778908;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=70778909;
 //BA.debugLineNum = 70778909;BA.debugLine="End Sub";
return null;
}
public String  _setpadding(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setpadding", false))
	 {return ((String) Debug.delegate(ba, "setpadding", new Object[] {_v,_left,_top,_right,_bottom}));}
RDebugUtils.currentLine=77398016;
 //BA.debugLineNum = 77398016;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
RDebugUtils.currentLine=77398017;
 //BA.debugLineNum = 77398017;BA.debugLine="v.Padding = Array As Int (Left, Top, Right, Botto";
_v.setPadding(new int[]{_left,_top,_right,_bottom});
RDebugUtils.currentLine=77398018;
 //BA.debugLineNum = 77398018;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=69468160;
 //BA.debugLineNum = 69468160;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=69468161;
 //BA.debugLineNum = 69468161;BA.debugLine="pnlTable = Base";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=69468163;
 //BA.debugLineNum = 69468163;BA.debugLine="cLeft = Base.Left";
__ref._cleft /*int*/  = _base.getLeft();
RDebugUtils.currentLine=69468164;
 //BA.debugLineNum = 69468164;BA.debugLine="cTop = Base.Top";
__ref._ctop /*int*/  = _base.getTop();
RDebugUtils.currentLine=69468165;
 //BA.debugLineNum = 69468165;BA.debugLine="cWidth = Base.Width";
__ref._cwidth /*int*/  = _base.getWidth();
RDebugUtils.currentLine=69468166;
 //BA.debugLineNum = 69468166;BA.debugLine="cHeight = Base.Height";
__ref._cheight /*int*/  = _base.getHeight();
RDebugUtils.currentLine=69468167;
 //BA.debugLineNum = 69468167;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69468170;
 //BA.debugLineNum = 69468170;BA.debugLine="Select Props.Get(\"TextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("TextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=69468172;
 //BA.debugLineNum = 69468172;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=69468174;
 //BA.debugLineNum = 69468174;BA.debugLine="cAlignment = Gravity.CENTER";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=69468176;
 //BA.debugLineNum = 69468176;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=69468180;
 //BA.debugLineNum = 69468180;BA.debugLine="Select Props.Get(\"HeaderTextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("HeaderTextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=69468182;
 //BA.debugLineNum = 69468182;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=69468184;
 //BA.debugLineNum = 69468184;BA.debugLine="cHeaderAlignment = Gravity.CENTER";
__ref._cheaderalignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=69468186;
 //BA.debugLineNum = 69468186;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=69468189;
 //BA.debugLineNum = 69468189;BA.debugLine="cLineWidth = DipToCurrent(Props.Get(\"LineWidth\"))";
__ref._clinewidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("LineWidth")))));
RDebugUtils.currentLine=69468191;
 //BA.debugLineNum = 69468191;BA.debugLine="mNumberOfColumns = Props.Get(\"NumberOfColumns\")";
__ref._mnumberofcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfColumns"))));
RDebugUtils.currentLine=69468192;
 //BA.debugLineNum = 69468192;BA.debugLine="mNumberOfFixedColumns = Props.Get(\"NumberOfFixedC";
__ref._mnumberoffixedcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfFixedColumns"))));
RDebugUtils.currentLine=69468193;
 //BA.debugLineNum = 69468193;BA.debugLine="mFirstColumnFixed = Props.Get(\"FirstColumnFixed\")";
__ref._mfirstcolumnfixed /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("FirstColumnFixed")));
RDebugUtils.currentLine=69468194;
 //BA.debugLineNum = 69468194;BA.debugLine="If mFirstColumnFixed = True And mNumberOfFixedCol";
if (__ref._mfirstcolumnfixed /*boolean*/ ==__c.True && __ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=69468195;
 //BA.debugLineNum = 69468195;BA.debugLine="mNumberOfFixedColumns = 1";
__ref._mnumberoffixedcolumns /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=69468197;
 //BA.debugLineNum = 69468197;BA.debugLine="mMultiSelect = Props.Get(\"MultiSelect\")";
__ref._mmultiselect /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("MultiSelect")));
RDebugUtils.currentLine=69468198;
 //BA.debugLineNum = 69468198;BA.debugLine="cSingleLine = Props.GetDefault(\"SingleLine\", True";
__ref._csingleline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SingleLine"),(Object)(__c.True)));
RDebugUtils.currentLine=69468199;
 //BA.debugLineNum = 69468199;BA.debugLine="mZeroSelection = Props.Get(\"ZeroSelection\")";
__ref._mzeroselection /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZeroSelection")));
RDebugUtils.currentLine=69468200;
 //BA.debugLineNum = 69468200;BA.debugLine="cHeaderColor = Props.Get(\"HeaderColor\")";
__ref._cheadercolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderColor"))));
RDebugUtils.currentLine=69468201;
 //BA.debugLineNum = 69468201;BA.debugLine="cTableColor = Props.Get(\"TableColor\")";
__ref._ctablecolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("TableColor"))));
RDebugUtils.currentLine=69468202;
 //BA.debugLineNum = 69468202;BA.debugLine="cHeaderTextColor = Props.Get(\"HeaderTextColor\")";
__ref._cheadertextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderTextColor"))));
RDebugUtils.currentLine=69468203;
 //BA.debugLineNum = 69468203;BA.debugLine="cTextColor = Props.Get(\"CellTextColor\")";
__ref._ctextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("CellTextColor"))));
RDebugUtils.currentLine=69468204;
 //BA.debugLineNum = 69468204;BA.debugLine="cRowColor1 = Props.Get(\"Row1Color\")";
__ref._crowcolor1 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row1Color"))));
RDebugUtils.currentLine=69468205;
 //BA.debugLineNum = 69468205;BA.debugLine="cRowColor2 = Props.Get(\"Row2Color\")";
__ref._crowcolor2 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row2Color"))));
RDebugUtils.currentLine=69468206;
 //BA.debugLineNum = 69468206;BA.debugLine="cSelectedRowColor = Props.Get(\"SelectedRowColor\")";
__ref._cselectedrowcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedRowColor"))));
RDebugUtils.currentLine=69468207;
 //BA.debugLineNum = 69468207;BA.debugLine="cSelectedCellColor = Props.Get(\"SelectedCellColor";
__ref._cselectedcellcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedCellColor"))));
RDebugUtils.currentLine=69468209;
 //BA.debugLineNum = 69468209;BA.debugLine="cTextSize = Props.Get(\"TextSize\")";
__ref._ctextsize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));
RDebugUtils.currentLine=69468211;
 //BA.debugLineNum = 69468211;BA.debugLine="cRowHeight = DipToCurrent(Props.Get(\"RowHeight\"))";
__ref._crowheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("RowHeight")))));
RDebugUtils.currentLine=69468212;
 //BA.debugLineNum = 69468212;BA.debugLine="cHeaderHeight = DipToCurrent(Props.Get(\"HeaderHei";
__ref._cheaderheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("HeaderHeight")))));
RDebugUtils.currentLine=69468213;
 //BA.debugLineNum = 69468213;BA.debugLine="cShowStatusLine = Props.Get(\"ShowStatusLine\")";
__ref._cshowstatusline /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowStatusLine")));
RDebugUtils.currentLine=69468214;
 //BA.debugLineNum = 69468214;BA.debugLine="cStatusLineHeight = DipToCurrent(Props.GetDefault";
__ref._cstatuslineheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("HeaderHeight"),(Object)(40)))));
RDebugUtils.currentLine=69468215;
 //BA.debugLineNum = 69468215;BA.debugLine="cSortColumn = Props.Get(\"SortColumn\")";
__ref._csortcolumn /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortColumn")));
RDebugUtils.currentLine=69468216;
 //BA.debugLineNum = 69468216;BA.debugLine="cSortRemoveAccents = Props.Get(\"SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortRemoveAccents")));
RDebugUtils.currentLine=69468217;
 //BA.debugLineNum = 69468217;BA.debugLine="cSortBitmapWidth = DipToCurrent(Props.Get(\"SortBi";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapWidth")))));
RDebugUtils.currentLine=69468218;
 //BA.debugLineNum = 69468218;BA.debugLine="cSortBitmapColor = Props.Get(\"SortBitmapColor\")";
__ref._csortbitmapcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapColor"))));
RDebugUtils.currentLine=69468220;
 //BA.debugLineNum = 69468220;BA.debugLine="mFastScroll = Props.GetDefault(\"FastScroll\", Fals";
__ref._mfastscroll /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScroll"),(Object)(__c.False)));
RDebugUtils.currentLine=69468221;
 //BA.debugLineNum = 69468221;BA.debugLine="mFastScrollMinItems = Props.GetDefault(\"FastScrol";
__ref._mfastscrollminitems /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollMinItems"),(Object)(50))));
RDebugUtils.currentLine=69468222;
 //BA.debugLineNum = 69468222;BA.debugLine="mFastScrollColumnIndex = Props.GetDefault(\"FastSc";
__ref._mfastscrollcolumnindex /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollColumnIndex"),(Object)(0))));
RDebugUtils.currentLine=69468223;
 //BA.debugLineNum = 69468223;BA.debugLine="mFastScrollShowLabel = Props.GetDefault(\"FastScro";
__ref._mfastscrollshowlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollShowLabel"),(Object)(__c.True)));
RDebugUtils.currentLine=69468224;
 //BA.debugLineNum = 69468224;BA.debugLine="mFastScrollFixedLabel = Props.GetDefault(\"FastScr";
__ref._mfastscrollfixedlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollFixedLabel"),(Object)(__c.False)));
RDebugUtils.currentLine=69468225;
 //BA.debugLineNum = 69468225;BA.debugLine="mFastScrollLabelMaxChars = Props.GetDefault(\"Fast";
__ref._mfastscrolllabelmaxchars /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelMaxChars"),(Object)(10))));
RDebugUtils.currentLine=69468226;
 //BA.debugLineNum = 69468226;BA.debugLine="mFastScrollLabelWidth = DipToCurrent(Props.GetDef";
__ref._mfastscrolllabelwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelWidth"),(Object)(__c.DipToCurrent((int) (150)))))));
RDebugUtils.currentLine=69468227;
 //BA.debugLineNum = 69468227;BA.debugLine="mFastScrollLabelHeight = DipToCurrent(Props.GetDe";
__ref._mfastscrolllabelheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelHeight"),(Object)(__c.DipToCurrent((int) (30)))))));
RDebugUtils.currentLine=69468228;
 //BA.debugLineNum = 69468228;BA.debugLine="mSortCaseInsensitive = Props.GetDefault(\"SortCase";
__ref._msortcaseinsensitive /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SortCaseInsensitive"),(Object)(__c.False)));
RDebugUtils.currentLine=69468229;
 //BA.debugLineNum = 69468229;BA.debugLine="mMultiColumnSort = Props.GetDefault(\"MultiColumnS";
__ref._mmulticolumnsort /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MultiColumnSort"),(Object)(__c.False)));
RDebugUtils.currentLine=69468231;
 //BA.debugLineNum = 69468231;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=69468232;
 //BA.debugLineNum = 69468232;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=69861376;
 //BA.debugLineNum = 69861376;BA.debugLine="Private Sub DrawFastScrollCursor";
RDebugUtils.currentLine=69861377;
 //BA.debugLineNum = 69861377;BA.debugLine="Private pthArrow As Path";
_ptharrow = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=69861378;
 //BA.debugLineNum = 69861378;BA.debugLine="Private cvsFSc As Canvas";
_cvsfsc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=69861379;
 //BA.debugLineNum = 69861379;BA.debugLine="Private x1, x2, x3, y1, y2, dd, rr As Int";
_x1 = 0;
_x2 = 0;
_x3 = 0;
_y1 = 0;
_y2 = 0;
_dd = 0;
_rr = 0;
RDebugUtils.currentLine=69861380;
 //BA.debugLineNum = 69861380;BA.debugLine="Private rct As Rect";
_rct = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=69861382;
 //BA.debugLineNum = 69861382;BA.debugLine="rr = 7dip";
_rr = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=69861384;
 //BA.debugLineNum = 69861384;BA.debugLine="cvsFSc.Initialize(pnlFastScrollCursor)";
_cvsfsc.Initialize((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=69861385;
 //BA.debugLineNum = 69861385;BA.debugLine="rct.Initialize(0, 0, FScCursorWidth, FScCursorHei";
_rct.Initialize((int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=69861386;
 //BA.debugLineNum = 69861386;BA.debugLine="cvsFSc.DrawRect(rct, Colors.Transparent, True, 1d";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__c.Colors.Transparent,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861388;
 //BA.debugLineNum = 69861388;BA.debugLine="cvsFSc.DrawCircle(rr, rr, rr, FScCursorCol1, True";
_cvsfsc.DrawCircle((float) (_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861389;
 //BA.debugLineNum = 69861389;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, rr, rr, FS";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861390;
 //BA.debugLineNum = 69861390;BA.debugLine="cvsFSc.DrawCircle(rr, FScCursorHeight - rr, rr, F";
_cvsfsc.DrawCircle((float) (_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861391;
 //BA.debugLineNum = 69861391;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, FScCursorH";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861393;
 //BA.debugLineNum = 69861393;BA.debugLine="rct.Initialize(rr, 0, FScCursorWidth - rr, rr)";
_rct.Initialize(_rr,(int) (0),(int) (__ref._fsccursorwidth /*int*/ -_rr),_rr);
RDebugUtils.currentLine=69861394;
 //BA.debugLineNum = 69861394;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861395;
 //BA.debugLineNum = 69861395;BA.debugLine="rct.Initialize(0, rr, FScCursorWidth, FScCursorHe";
_rct.Initialize((int) (0),_rr,__ref._fsccursorwidth /*int*/ ,(int) (__ref._fsccursorheight /*int*/ -_rr));
RDebugUtils.currentLine=69861396;
 //BA.debugLineNum = 69861396;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861397;
 //BA.debugLineNum = 69861397;BA.debugLine="rct.Initialize(rr, FScCursorHeight - rr, FScCurso";
_rct.Initialize(_rr,(int) (__ref._fsccursorheight /*int*/ -_rr),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=69861398;
 //BA.debugLineNum = 69861398;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861400;
 //BA.debugLineNum = 69861400;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 - 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861401;
 //BA.debugLineNum = 69861401;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2, FScCur";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861402;
 //BA.debugLineNum = 69861402;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 + 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861404;
 //BA.debugLineNum = 69861404;BA.debugLine="dd = 7dip";
_dd = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=69861405;
 //BA.debugLineNum = 69861405;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=69861406;
 //BA.debugLineNum = 69861406;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=69861407;
 //BA.debugLineNum = 69861407;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=69861408;
 //BA.debugLineNum = 69861408;BA.debugLine="y2 = dd";
_y2 = _dd;
RDebugUtils.currentLine=69861409;
 //BA.debugLineNum = 69861409;BA.debugLine="y1 = y2 + dd";
_y1 = (int) (_y2+_dd);
RDebugUtils.currentLine=69861410;
 //BA.debugLineNum = 69861410;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=69861411;
 //BA.debugLineNum = 69861411;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=69861412;
 //BA.debugLineNum = 69861412;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=69861413;
 //BA.debugLineNum = 69861413;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861415;
 //BA.debugLineNum = 69861415;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=69861416;
 //BA.debugLineNum = 69861416;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=69861417;
 //BA.debugLineNum = 69861417;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=69861418;
 //BA.debugLineNum = 69861418;BA.debugLine="y2 = FScCursorHeight - dd";
_y2 = (int) (__ref._fsccursorheight /*int*/ -_dd);
RDebugUtils.currentLine=69861419;
 //BA.debugLineNum = 69861419;BA.debugLine="y1 = y2 - dd";
_y1 = (int) (_y2-_dd);
RDebugUtils.currentLine=69861420;
 //BA.debugLineNum = 69861420;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=69861421;
 //BA.debugLineNum = 69861421;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=69861422;
 //BA.debugLineNum = 69861422;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=69861423;
 //BA.debugLineNum = 69861423;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69861424;
 //BA.debugLineNum = 69861424;BA.debugLine="pnlFastScrollCursor.Invalidate";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=69861425;
 //BA.debugLineNum = 69861425;BA.debugLine="End Sub";
return "";
}
public String  _fastscrolltimer_tick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "fastscrolltimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fastscrolltimer_tick", null));}
RDebugUtils.currentLine=74645504;
 //BA.debugLineNum = 74645504;BA.debugLine="Private Sub FastScrollTimer_Tick";
RDebugUtils.currentLine=74645505;
 //BA.debugLineNum = 74645505;BA.debugLine="FScTimer.Enabled = False";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=74645506;
 //BA.debugLineNum = 74645506;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=74645507;
 //BA.debugLineNum = 74645507;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=74645508;
 //BA.debugLineNum = 74645508;BA.debugLine="End Sub";
return "";
}
public boolean  _getallowselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getallowselection", false))
	 {return ((Boolean) Debug.delegate(ba, "getallowselection", null));}
RDebugUtils.currentLine=72417280;
 //BA.debugLineNum = 72417280;BA.debugLine="Public Sub getAllowSelection As Boolean";
RDebugUtils.currentLine=72417281;
 //BA.debugLineNum = 72417281;BA.debugLine="Return cAllowSelection";
if (true) return __ref._callowselection /*boolean*/ ;
RDebugUtils.currentLine=72417282;
 //BA.debugLineNum = 72417282;BA.debugLine="End Sub";
return false;
}
public int  _getcellalignment(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcellalignment", false))
	 {return ((Integer) Debug.delegate(ba, "getcellalignment", null));}
RDebugUtils.currentLine=74776576;
 //BA.debugLineNum = 74776576;BA.debugLine="Public Sub getCellAlignment As Int";
RDebugUtils.currentLine=74776577;
 //BA.debugLineNum = 74776577;BA.debugLine="Return cAlignment";
if (true) return __ref._calignment /*int*/ ;
RDebugUtils.currentLine=74776578;
 //BA.debugLineNum = 74776578;BA.debugLine="End Sub";
return 0;
}
public int[]  _getcolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumncolors", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumncolors", null));}
RDebugUtils.currentLine=77791232;
 //BA.debugLineNum = 77791232;BA.debugLine="Public Sub GetColumnColors As Int()";
RDebugUtils.currentLine=77791233;
 //BA.debugLineNum = 77791233;BA.debugLine="Return cColumnColors";
if (true) return __ref._ccolumncolors /*int[]*/ ;
RDebugUtils.currentLine=77791234;
 //BA.debugLineNum = 77791234;BA.debugLine="End Sub";
return null;
}
public String  _getcolumndatatype(b4a.example.ef.table __ref,int _column) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "getcolumndatatype", new Object[] {_column}));}
RDebugUtils.currentLine=79101952;
 //BA.debugLineNum = 79101952;BA.debugLine="Public Sub GetColumnDataType(Column As Int) As Str";
RDebugUtils.currentLine=79101953;
 //BA.debugLineNum = 79101953;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=79101954;
 //BA.debugLineNum = 79101954;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=79101955;
 //BA.debugLineNum = 79101955;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=79101958;
 //BA.debugLineNum = 79101958;BA.debugLine="Return cColumnDataType(Column)";
if (true) return __ref._ccolumndatatype /*String[]*/ [_column];
RDebugUtils.currentLine=79101959;
 //BA.debugLineNum = 79101959;BA.debugLine="End Sub";
return "";
}
public String[]  _getcolumndatatypes(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatypes", false))
	 {return ((String[]) Debug.delegate(ba, "getcolumndatatypes", null));}
RDebugUtils.currentLine=79233024;
 //BA.debugLineNum = 79233024;BA.debugLine="Public Sub GetColumnDataTypes As String()";
RDebugUtils.currentLine=79233025;
 //BA.debugLineNum = 79233025;BA.debugLine="Return cColumnDataType";
if (true) return __ref._ccolumndatatype /*String[]*/ ;
RDebugUtils.currentLine=79233026;
 //BA.debugLineNum = 79233026;BA.debugLine="End Sub";
return null;
}
public int[]  _getcolumnwidths(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumnwidths", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumnwidths", null));}
RDebugUtils.currentLine=70057984;
 //BA.debugLineNum = 70057984;BA.debugLine="Public Sub GetColumnWidths As Int()";
RDebugUtils.currentLine=70057985;
 //BA.debugLineNum = 70057985;BA.debugLine="Return SavedWidths";
if (true) return __ref._savedwidths /*int[]*/ ;
RDebugUtils.currentLine=70057986;
 //BA.debugLineNum = 70057986;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=80347136;
 //BA.debugLineNum = 80347136;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
RDebugUtils.currentLine=80347137;
 //BA.debugLineNum = 80347137;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
RDebugUtils.currentLine=80347139;
 //BA.debugLineNum = 80347139;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=80347140;
 //BA.debugLineNum = 80347140;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=80347141;
 //BA.debugLineNum = 80347141;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=80347142;
 //BA.debugLineNum = 80347142;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=80347144;
 //BA.debugLineNum = 80347144;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
RDebugUtils.currentLine=80347146;
 //BA.debugLineNum = 80347146;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
RDebugUtils.currentLine=80347147;
 //BA.debugLineNum = 80347147;BA.debugLine="Return Colors.Black";
if (true) return __c.Colors.Black;
 }else {
RDebugUtils.currentLine=80347149;
 //BA.debugLineNum = 80347149;BA.debugLine="Return Colors.White";
if (true) return __c.Colors.White;
 };
RDebugUtils.currentLine=80347151;
 //BA.debugLineNum = 80347151;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscroll", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscroll", null));}
RDebugUtils.currentLine=80412672;
 //BA.debugLineNum = 80412672;BA.debugLine="Public Sub getFastScroll As Boolean";
RDebugUtils.currentLine=80412673;
 //BA.debugLineNum = 80412673;BA.debugLine="Return mFastScroll";
if (true) return __ref._mfastscroll /*boolean*/ ;
RDebugUtils.currentLine=80412674;
 //BA.debugLineNum = 80412674;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrollcolumnindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollcolumnindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollcolumnindex", null));}
RDebugUtils.currentLine=80674816;
 //BA.debugLineNum = 80674816;BA.debugLine="Public Sub getFastScrollColumnIndex As Int";
RDebugUtils.currentLine=80674817;
 //BA.debugLineNum = 80674817;BA.debugLine="Return mFastScrollColumnIndex";
if (true) return __ref._mfastscrollcolumnindex /*int*/ ;
RDebugUtils.currentLine=80674818;
 //BA.debugLineNum = 80674818;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollfixedlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollfixedlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollfixedlabel", null));}
RDebugUtils.currentLine=80936960;
 //BA.debugLineNum = 80936960;BA.debugLine="Public Sub getFastScrollFixedLabel As Boolean";
RDebugUtils.currentLine=80936961;
 //BA.debugLineNum = 80936961;BA.debugLine="Return mFastScrollFixedLabel";
if (true) return __ref._mfastscrollfixedlabel /*boolean*/ ;
RDebugUtils.currentLine=80936962;
 //BA.debugLineNum = 80936962;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrolllabelheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelheight", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelheight", null));}
RDebugUtils.currentLine=81330176;
 //BA.debugLineNum = 81330176;BA.debugLine="Public Sub getFastScrollLabelHeight As Int";
RDebugUtils.currentLine=81330177;
 //BA.debugLineNum = 81330177;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=81330178;
 //BA.debugLineNum = 81330178;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelmaxchars(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelmaxchars", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelmaxchars", null));}
RDebugUtils.currentLine=81068032;
 //BA.debugLineNum = 81068032;BA.debugLine="Public Sub getFastScrollLabelMaxChars As Int";
RDebugUtils.currentLine=81068033;
 //BA.debugLineNum = 81068033;BA.debugLine="Return mFastScrollLabelMaxChars";
if (true) return __ref._mfastscrolllabelmaxchars /*int*/ ;
RDebugUtils.currentLine=81068034;
 //BA.debugLineNum = 81068034;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelwidth", null));}
RDebugUtils.currentLine=81199104;
 //BA.debugLineNum = 81199104;BA.debugLine="Public Sub getFastScrollLabelWidth As Int";
RDebugUtils.currentLine=81199105;
 //BA.debugLineNum = 81199105;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=81199106;
 //BA.debugLineNum = 81199106;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrollminitems(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollminitems", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollminitems", null));}
RDebugUtils.currentLine=80543744;
 //BA.debugLineNum = 80543744;BA.debugLine="Public Sub getFastScrollMinItems As Int";
RDebugUtils.currentLine=80543745;
 //BA.debugLineNum = 80543745;BA.debugLine="Return mFastScrollMinItems";
if (true) return __ref._mfastscrollminitems /*int*/ ;
RDebugUtils.currentLine=80543746;
 //BA.debugLineNum = 80543746;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollshowlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollshowlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollshowlabel", null));}
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Public Sub getFastScrollShowLabel As Boolean";
RDebugUtils.currentLine=80805889;
 //BA.debugLineNum = 80805889;BA.debugLine="Return mFastScrollShowLabel";
if (true) return __ref._mfastscrollshowlabel /*boolean*/ ;
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="End Sub";
return false;
}
public boolean  _getfirstcolumnfixed(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfirstcolumnfixed", false))
	 {return ((Boolean) Debug.delegate(ba, "getfirstcolumnfixed", null));}
RDebugUtils.currentLine=80281600;
 //BA.debugLineNum = 80281600;BA.debugLine="Public Sub getFirstColumnFixed As Boolean";
RDebugUtils.currentLine=80281601;
 //BA.debugLineNum = 80281601;BA.debugLine="Return mFirstColumnFixed";
if (true) return __ref._mfirstcolumnfixed /*boolean*/ ;
RDebugUtils.currentLine=80281602;
 //BA.debugLineNum = 80281602;BA.debugLine="End Sub";
return false;
}
public int  _getheadercolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=75038720;
 //BA.debugLineNum = 75038720;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=75038721;
 //BA.debugLineNum = 75038721;BA.debugLine="Return cHeaderColor";
if (true) return __ref._cheadercolor /*int*/ ;
RDebugUtils.currentLine=75038722;
 //BA.debugLineNum = 75038722;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadercolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadercolors", null));}
RDebugUtils.currentLine=78053376;
 //BA.debugLineNum = 78053376;BA.debugLine="Public Sub GetHeaderColors As Int()";
RDebugUtils.currentLine=78053377;
 //BA.debugLineNum = 78053377;BA.debugLine="Return cHeaderColors";
if (true) return __ref._cheadercolors /*int[]*/ ;
RDebugUtils.currentLine=78053378;
 //BA.debugLineNum = 78053378;BA.debugLine="End Sub";
return null;
}
public int  _getheaderheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheaderheight", null));}
RDebugUtils.currentLine=74907648;
 //BA.debugLineNum = 74907648;BA.debugLine="Public Sub getHeaderHeight As Int";
RDebugUtils.currentLine=74907649;
 //BA.debugLineNum = 74907649;BA.debugLine="Return cHeaderHeight";
if (true) return __ref._cheaderheight /*int*/ ;
RDebugUtils.currentLine=74907650;
 //BA.debugLineNum = 74907650;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=72548352;
 //BA.debugLineNum = 72548352;BA.debugLine="Public Sub getHeaderPanel As Panel";
RDebugUtils.currentLine=72548353;
 //BA.debugLineNum = 72548353;BA.debugLine="Return Header";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=72548354;
 //BA.debugLineNum = 72548354;BA.debugLine="End Sub";
return null;
}
public int  _getheadertextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadertextcolor", null));}
RDebugUtils.currentLine=75169792;
 //BA.debugLineNum = 75169792;BA.debugLine="Public Sub getHeaderTextColor As Int";
RDebugUtils.currentLine=75169793;
 //BA.debugLineNum = 75169793;BA.debugLine="Return cHeaderTextColor";
if (true) return __ref._cheadertextcolor /*int*/ ;
RDebugUtils.currentLine=75169794;
 //BA.debugLineNum = 75169794;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadertextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadertextcolors", null));}
RDebugUtils.currentLine=78381056;
 //BA.debugLineNum = 78381056;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
RDebugUtils.currentLine=78381057;
 //BA.debugLineNum = 78381057;BA.debugLine="Return cHeaderTextColors";
if (true) return __ref._cheadertextcolors /*int[]*/ ;
RDebugUtils.currentLine=78381058;
 //BA.debugLineNum = 78381058;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _getheadertypeface(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertypeface", false))
	 {return ((anywheresoftware.b4a.keywords.constants.TypefaceWrapper) Debug.delegate(ba, "getheadertypeface", null));}
RDebugUtils.currentLine=78184448;
 //BA.debugLineNum = 78184448;BA.debugLine="Public Sub getHeaderTypeFace As Typeface";
RDebugUtils.currentLine=78184449;
 //BA.debugLineNum = 78184449;BA.debugLine="Return cHeaderTypeFace";
if (true) return __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
RDebugUtils.currentLine=78184450;
 //BA.debugLineNum = 78184450;BA.debugLine="End Sub";
return null;
}
public int  _getheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=73596928;
 //BA.debugLineNum = 73596928;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=73596929;
 //BA.debugLineNum = 73596929;BA.debugLine="Return pnlTable.Height";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=73596930;
 //BA.debugLineNum = 73596930;BA.debugLine="End Sub";
return 0;
}
public int  _getinnertotalwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getinnertotalwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getinnertotalwidth", null));}
RDebugUtils.currentLine=73400320;
 //BA.debugLineNum = 73400320;BA.debugLine="Public Sub getInnerTotalWidth As Int";
RDebugUtils.currentLine=73400321;
 //BA.debugLineNum = 73400321;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=73400322;
 //BA.debugLineNum = 73400322;BA.debugLine="Return Header.Width";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
 }else {
RDebugUtils.currentLine=73400324;
 //BA.debugLineNum = 73400324;BA.debugLine="Return HeaderFirst.Width + Header.Width";
if (true) return (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=73400326;
 //BA.debugLineNum = 73400326;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70713344;
 //BA.debugLineNum = 70713344;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
RDebugUtils.currentLine=70713345;
 //BA.debugLineNum = 70713345;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=70713346;
 //BA.debugLineNum = 70713346;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=70713348;
 //BA.debugLineNum = 70713348;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=70713349;
 //BA.debugLineNum = 70713349;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=70713351;
 //BA.debugLineNum = 70713351;BA.debugLine="lbls = CreateNewLabels";
_lbls = __ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
 };
RDebugUtils.currentLine=70713353;
 //BA.debugLineNum = 70713353;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=70713354;
 //BA.debugLineNum = 70713354;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=70713355;
 //BA.debugLineNum = 70713355;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.example.ef.table._rowcol)(_lbls[_i].getTag());
RDebugUtils.currentLine=70713356;
 //BA.debugLineNum = 70713356;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
RDebugUtils.currentLine=70713358;
 //BA.debugLineNum = 70713358;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=70713359;
 //BA.debugLineNum = 70713359;BA.debugLine="End Sub";
return null;
}
public int  _getleft(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=73138176;
 //BA.debugLineNum = 73138176;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=73138177;
 //BA.debugLineNum = 73138177;BA.debugLine="Return pnlTable.Left";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=73138178;
 //BA.debugLineNum = 73138178;BA.debugLine="End Sub";
return 0;
}
public int  _getlinewidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getlinewidth", false))
	 {return ((Integer) Debug.delegate(ba, "getlinewidth", null));}
RDebugUtils.currentLine=73859072;
 //BA.debugLineNum = 73859072;BA.debugLine="Public Sub getLineWidth As Int";
RDebugUtils.currentLine=73859073;
 //BA.debugLineNum = 73859073;BA.debugLine="Return cLineWidth";
if (true) return __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=73859074;
 //BA.debugLineNum = 73859074;BA.debugLine="End Sub";
return 0;
}
public boolean  _getmulticolumnsort(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmulticolumnsort", false))
	 {return ((Boolean) Debug.delegate(ba, "getmulticolumnsort", null));}
RDebugUtils.currentLine=82509824;
 //BA.debugLineNum = 82509824;BA.debugLine="Public Sub getMultiColumnSort As Boolean";
RDebugUtils.currentLine=82509825;
 //BA.debugLineNum = 82509825;BA.debugLine="Return mMultiColumnSort";
if (true) return __ref._mmulticolumnsort /*boolean*/ ;
RDebugUtils.currentLine=82509826;
 //BA.debugLineNum = 82509826;BA.debugLine="End Sub";
return false;
}
public boolean  _getmultiselect(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmultiselect", false))
	 {return ((Boolean) Debug.delegate(ba, "getmultiselect", null));}
RDebugUtils.currentLine=72286208;
 //BA.debugLineNum = 72286208;BA.debugLine="Public Sub getMultiSelect As Boolean";
RDebugUtils.currentLine=72286209;
 //BA.debugLineNum = 72286209;BA.debugLine="Return mMultiSelect";
if (true) return __ref._mmultiselect /*boolean*/ ;
RDebugUtils.currentLine=72286210;
 //BA.debugLineNum = 72286210;BA.debugLine="End Sub";
return false;
}
public int  _getnumberofcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofcolumns", null));}
RDebugUtils.currentLine=79298560;
 //BA.debugLineNum = 79298560;BA.debugLine="Public Sub getNumberOfColumns As Int";
RDebugUtils.currentLine=79298561;
 //BA.debugLineNum = 79298561;BA.debugLine="Return mNumberOfColumns";
if (true) return __ref._mnumberofcolumns /*int*/ ;
RDebugUtils.currentLine=79298562;
 //BA.debugLineNum = 79298562;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberoffixedcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberoffixedcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberoffixedcolumns", null));}
RDebugUtils.currentLine=80150528;
 //BA.debugLineNum = 80150528;BA.debugLine="Public Sub getNumberOfFixedColumns As Int";
RDebugUtils.currentLine=80150529;
 //BA.debugLineNum = 80150529;BA.debugLine="Return mNumberOfFixedColumns";
if (true) return __ref._mnumberoffixedcolumns /*int*/ ;
RDebugUtils.currentLine=80150530;
 //BA.debugLineNum = 80150530;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberofrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofrows", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofrows", null));}
RDebugUtils.currentLine=79429632;
 //BA.debugLineNum = 79429632;BA.debugLine="Public Sub getNumberOfRows As Int";
RDebugUtils.currentLine=79429633;
 //BA.debugLineNum = 79429633;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=79429634;
 //BA.debugLineNum = 79429634;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=78774272;
 //BA.debugLineNum = 78774272;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=78774273;
 //BA.debugLineNum = 78774273;BA.debugLine="Return pnlTable";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=78774274;
 //BA.debugLineNum = 78774274;BA.debugLine="End Sub";
return null;
}
public int  _getrowcolor1(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor1", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor1", null));}
RDebugUtils.currentLine=75300864;
 //BA.debugLineNum = 75300864;BA.debugLine="Public Sub getRowColor1 As Int";
RDebugUtils.currentLine=75300865;
 //BA.debugLineNum = 75300865;BA.debugLine="Return cRowColor1";
if (true) return __ref._crowcolor1 /*int*/ ;
RDebugUtils.currentLine=75300866;
 //BA.debugLineNum = 75300866;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolor2(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor2", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor2", null));}
RDebugUtils.currentLine=75431936;
 //BA.debugLineNum = 75431936;BA.debugLine="Public Sub getRowColor2 As Int";
RDebugUtils.currentLine=75431937;
 //BA.debugLineNum = 75431937;BA.debugLine="Return cRowColor2";
if (true) return __ref._crowcolor2 /*int*/ ;
RDebugUtils.currentLine=75431938;
 //BA.debugLineNum = 75431938;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolorn", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=75563008;
 //BA.debugLineNum = 75563008;BA.debugLine="Public Sub GetRowColorN(Row As Int) As Int";
RDebugUtils.currentLine=75563009;
 //BA.debugLineNum = 75563009;BA.debugLine="Return lstRowColors.Get(lstRowColorIndexes.Get(Ro";
if (true) return (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2))));
RDebugUtils.currentLine=75563010;
 //BA.debugLineNum = 75563010;BA.debugLine="End Sub";
return 0;
}
public int  _getrowheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowheight", false))
	 {return ((Integer) Debug.delegate(ba, "getrowheight", null));}
RDebugUtils.currentLine=76677120;
 //BA.debugLineNum = 76677120;BA.debugLine="Public Sub getRowHeight As Int";
RDebugUtils.currentLine=76677121;
 //BA.debugLineNum = 76677121;BA.debugLine="Return cRowHeight";
if (true) return __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=76677122;
 //BA.debugLineNum = 76677122;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcellcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcellcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcellcolor", null));}
RDebugUtils.currentLine=76021760;
 //BA.debugLineNum = 76021760;BA.debugLine="Public Sub getSelectedCellColor As Int";
RDebugUtils.currentLine=76021761;
 //BA.debugLineNum = 76021761;BA.debugLine="Return cSelectedCellColor";
if (true) return __ref._cselectedcellcolor /*int*/ ;
RDebugUtils.currentLine=76021762;
 //BA.debugLineNum = 76021762;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcelltextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcelltextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcelltextcolor", null));}
RDebugUtils.currentLine=76152832;
 //BA.debugLineNum = 76152832;BA.debugLine="Public Sub getSelectedCellTextColor As Int";
RDebugUtils.currentLine=76152833;
 //BA.debugLineNum = 76152833;BA.debugLine="Return cSelectedCellTextColor";
if (true) return __ref._cselectedcelltextcolor /*int*/ ;
RDebugUtils.currentLine=76152834;
 //BA.debugLineNum = 76152834;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedrowcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowcolor", null));}
RDebugUtils.currentLine=75759616;
 //BA.debugLineNum = 75759616;BA.debugLine="Public Sub getSelectedRowColor As Int";
RDebugUtils.currentLine=75759617;
 //BA.debugLineNum = 75759617;BA.debugLine="Return cSelectedRowColor";
if (true) return __ref._cselectedrowcolor /*int*/ ;
RDebugUtils.currentLine=75759618;
 //BA.debugLineNum = 75759618;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrows", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getselectedrows", null));}
anywheresoftware.b4a.objects.collections.List _sr = null;
RDebugUtils.currentLine=72613888;
 //BA.debugLineNum = 72613888;BA.debugLine="Public Sub getSelectedRows As List";
RDebugUtils.currentLine=72613889;
 //BA.debugLineNum = 72613889;BA.debugLine="Dim sr As List";
_sr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=72613890;
 //BA.debugLineNum = 72613890;BA.debugLine="sr.Initialize";
_sr.Initialize();
RDebugUtils.currentLine=72613891;
 //BA.debugLineNum = 72613891;BA.debugLine="sr.AddAll(SelectedRows)";
_sr.AddAll(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=72613892;
 //BA.debugLineNum = 72613892;BA.debugLine="Return sr";
if (true) return _sr;
RDebugUtils.currentLine=72613893;
 //BA.debugLineNum = 72613893;BA.debugLine="End Sub";
return null;
}
public int  _getselectedrowtextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowtextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowtextcolor", null));}
RDebugUtils.currentLine=75890688;
 //BA.debugLineNum = 75890688;BA.debugLine="Public Sub getSelectedRowTextColor As Int";
RDebugUtils.currentLine=75890689;
 //BA.debugLineNum = 75890689;BA.debugLine="Return cSelectedRowTextColor";
if (true) return __ref._cselectedrowtextcolor /*int*/ ;
RDebugUtils.currentLine=75890690;
 //BA.debugLineNum = 75890690;BA.debugLine="End Sub";
return 0;
}
public boolean  _getshowstatusline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getshowstatusline", false))
	 {return ((Boolean) Debug.delegate(ba, "getshowstatusline", null));}
RDebugUtils.currentLine=78708736;
 //BA.debugLineNum = 78708736;BA.debugLine="Public Sub getShowStatusLine As Boolean";
RDebugUtils.currentLine=78708737;
 //BA.debugLineNum = 78708737;BA.debugLine="Return cShowStatusLine";
if (true) return __ref._cshowstatusline /*boolean*/ ;
RDebugUtils.currentLine=78708738;
 //BA.debugLineNum = 78708738;BA.debugLine="End Sub";
return false;
}
public boolean  _getsingleline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsingleline", false))
	 {return ((Boolean) Debug.delegate(ba, "getsingleline", null));}
RDebugUtils.currentLine=78512128;
 //BA.debugLineNum = 78512128;BA.debugLine="Public Sub getSingleLine As Boolean";
RDebugUtils.currentLine=78512129;
 //BA.debugLineNum = 78512129;BA.debugLine="Return cSingleLine";
if (true) return __ref._csingleline /*boolean*/ ;
RDebugUtils.currentLine=78512130;
 //BA.debugLineNum = 78512130;BA.debugLine="End Sub";
return false;
}
public long  _getsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Long) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=73007104;
 //BA.debugLineNum = 73007104;BA.debugLine="Public Sub getSize As Long";
RDebugUtils.currentLine=73007105;
 //BA.debugLineNum = 73007105;BA.debugLine="Return Data.Size";
if (true) return (long) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=73007106;
 //BA.debugLineNum = 73007106;BA.debugLine="End Sub";
return 0L;
}
public int  _getsortbitmapcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapcolor", null));}
RDebugUtils.currentLine=79888384;
 //BA.debugLineNum = 79888384;BA.debugLine="Public Sub getSortBitmapColor As Int";
RDebugUtils.currentLine=79888385;
 //BA.debugLineNum = 79888385;BA.debugLine="Return cSortBitmapColor";
if (true) return __ref._csortbitmapcolor /*int*/ ;
RDebugUtils.currentLine=79888386;
 //BA.debugLineNum = 79888386;BA.debugLine="End Sub";
return 0;
}
public int  _getsortbitmapwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapwidth", null));}
RDebugUtils.currentLine=79757312;
 //BA.debugLineNum = 79757312;BA.debugLine="Public Sub getSortBitmapWidth As Int";
RDebugUtils.currentLine=79757313;
 //BA.debugLineNum = 79757313;BA.debugLine="Return cSortBitmapWidth";
if (true) return __ref._csortbitmapwidth /*int*/ ;
RDebugUtils.currentLine=79757314;
 //BA.debugLineNum = 79757314;BA.debugLine="End Sub";
return 0;
}
public boolean  _getsortcaseinsensitive(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcaseinsensitive", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcaseinsensitive", null));}
RDebugUtils.currentLine=82640896;
 //BA.debugLineNum = 82640896;BA.debugLine="Public Sub getSortCaseInsensitive As Boolean";
RDebugUtils.currentLine=82640897;
 //BA.debugLineNum = 82640897;BA.debugLine="Return mSortCaseInsensitive";
if (true) return __ref._msortcaseinsensitive /*boolean*/ ;
RDebugUtils.currentLine=82640898;
 //BA.debugLineNum = 82640898;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortcolumn(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcolumn", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcolumn", null));}
RDebugUtils.currentLine=77529088;
 //BA.debugLineNum = 77529088;BA.debugLine="Public Sub getSortColumn As Boolean";
RDebugUtils.currentLine=77529089;
 //BA.debugLineNum = 77529089;BA.debugLine="Return cSortColumn";
if (true) return __ref._csortcolumn /*boolean*/ ;
RDebugUtils.currentLine=77529090;
 //BA.debugLineNum = 77529090;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortremoveaccents(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortremoveaccents", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortremoveaccents", null));}
RDebugUtils.currentLine=79495168;
 //BA.debugLineNum = 79495168;BA.debugLine="Public Sub getSortRemoveAccents As Boolean";
RDebugUtils.currentLine=79495169;
 //BA.debugLineNum = 79495169;BA.debugLine="Return cSortRemoveAccents";
if (true) return __ref._csortremoveaccents /*boolean*/ ;
RDebugUtils.currentLine=79495170;
 //BA.debugLineNum = 79495170;BA.debugLine="End Sub";
return false;
}
public int  _getstatuslineheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getstatuslineheight", false))
	 {return ((Integer) Debug.delegate(ba, "getstatuslineheight", null));}
RDebugUtils.currentLine=76808192;
 //BA.debugLineNum = 76808192;BA.debugLine="Public Sub getStatusLineHeight As Int";
RDebugUtils.currentLine=76808193;
 //BA.debugLineNum = 76808193;BA.debugLine="Return cStatusLineHeight";
if (true) return __ref._cstatuslineheight /*int*/ ;
RDebugUtils.currentLine=76808194;
 //BA.debugLineNum = 76808194;BA.debugLine="End Sub";
return 0;
}
public int  _gettablecolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettablecolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettablecolor", null));}
RDebugUtils.currentLine=76283904;
 //BA.debugLineNum = 76283904;BA.debugLine="Public Sub getTableColor As Int";
RDebugUtils.currentLine=76283905;
 //BA.debugLineNum = 76283905;BA.debugLine="Return cTableColor";
if (true) return __ref._ctablecolor /*int*/ ;
RDebugUtils.currentLine=76283906;
 //BA.debugLineNum = 76283906;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettag", false))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=78970880;
 //BA.debugLineNum = 78970880;BA.debugLine="Public Sub getTag As Object";
RDebugUtils.currentLine=78970881;
 //BA.debugLineNum = 78970881;BA.debugLine="Return pnlTable.Tag";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=78970882;
 //BA.debugLineNum = 78970882;BA.debugLine="End Sub";
return null;
}
public int  _gettextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=76414976;
 //BA.debugLineNum = 76414976;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=76414977;
 //BA.debugLineNum = 76414977;BA.debugLine="Return cTextColor";
if (true) return __ref._ctextcolor /*int*/ ;
RDebugUtils.currentLine=76414978;
 //BA.debugLineNum = 76414978;BA.debugLine="End Sub";
return 0;
}
public int[]  _gettextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "gettextcolors", null));}
RDebugUtils.currentLine=77922304;
 //BA.debugLineNum = 77922304;BA.debugLine="Public Sub GetTextColors As Int()";
RDebugUtils.currentLine=77922305;
 //BA.debugLineNum = 77922305;BA.debugLine="Return cTextColors";
if (true) return __ref._ctextcolors /*int[]*/ ;
RDebugUtils.currentLine=77922306;
 //BA.debugLineNum = 77922306;BA.debugLine="End Sub";
return null;
}
public float  _gettextsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextsize", false))
	 {return ((Float) Debug.delegate(ba, "gettextsize", null));}
RDebugUtils.currentLine=76546048;
 //BA.debugLineNum = 76546048;BA.debugLine="Public Sub getTextSize As Float";
RDebugUtils.currentLine=76546049;
 //BA.debugLineNum = 76546049;BA.debugLine="Return cTextSize";
if (true) return __ref._ctextsize /*float*/ ;
RDebugUtils.currentLine=76546050;
 //BA.debugLineNum = 76546050;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=73269248;
 //BA.debugLineNum = 73269248;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=73269249;
 //BA.debugLineNum = 73269249;BA.debugLine="Return pnlTable.Top";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=73269250;
 //BA.debugLineNum = 73269250;BA.debugLine="End Sub";
return 0;
}
public int  _gettoprowindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettoprowindex", false))
	 {return ((Integer) Debug.delegate(ba, "gettoprowindex", null));}
RDebugUtils.currentLine=73924608;
 //BA.debugLineNum = 73924608;BA.debugLine="Public Sub getTopRowIndex As Int";
RDebugUtils.currentLine=73924609;
 //BA.debugLineNum = 73924609;BA.debugLine="Return SV2.VerticalScrollPosition / cRowHeight";
if (true) return (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=73924610;
 //BA.debugLineNum = 73924610;BA.debugLine="End Sub";
return 0;
}
public boolean  _getusecolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getusecolumncolors", false))
	 {return ((Boolean) Debug.delegate(ba, "getusecolumncolors", null));}
RDebugUtils.currentLine=77660160;
 //BA.debugLineNum = 77660160;BA.debugLine="Public Sub getUseColumnColors As Boolean";
RDebugUtils.currentLine=77660161;
 //BA.debugLineNum = 77660161;BA.debugLine="Return cUseColumnColors";
if (true) return __ref._cusecolumncolors /*boolean*/ ;
RDebugUtils.currentLine=77660162;
 //BA.debugLineNum = 77660162;BA.debugLine="End Sub";
return false;
}
public String  _getvalue(b4a.example.ef.table __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((String) Debug.delegate(ba, "getvalue", new Object[] {_col,_row}));}
String[] _values = null;
RDebugUtils.currentLine=71106560;
 //BA.debugLineNum = 71106560;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As Str";
RDebugUtils.currentLine=71106561;
 //BA.debugLineNum = 71106561;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=71106562;
 //BA.debugLineNum = 71106562;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=71106563;
 //BA.debugLineNum = 71106563;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
RDebugUtils.currentLine=71106564;
 //BA.debugLineNum = 71106564;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71827456;
 //BA.debugLineNum = 71827456;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
RDebugUtils.currentLine=71827457;
 //BA.debugLineNum = 71827457;BA.debugLine="Dim rowData() As String  = Data.Get(Row) ' will t";
_rowdata = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=71827458;
 //BA.debugLineNum = 71827458;BA.debugLine="Dim tmp(mNumberOfColumns) As String";
_tmp = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_tmp,"");
RDebugUtils.currentLine=71827459;
 //BA.debugLineNum = 71827459;BA.debugLine="For i=0 To mNumberOfColumns-1 ' copy the array";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=71827460;
 //BA.debugLineNum = 71827460;BA.debugLine="tmp(i) =  rowData(i)";
_tmp[_i] = _rowdata[_i];
 }
};
RDebugUtils.currentLine=71827462;
 //BA.debugLineNum = 71827462;BA.debugLine="Return tmp";
if (true) return _tmp;
RDebugUtils.currentLine=71827463;
 //BA.debugLineNum = 71827463;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=73728000;
 //BA.debugLineNum = 73728000;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=73728001;
 //BA.debugLineNum = 73728001;BA.debugLine="Return pnlTable.Visible";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=73728002;
 //BA.debugLineNum = 73728002;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=73465856;
 //BA.debugLineNum = 73465856;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=73465857;
 //BA.debugLineNum = 73465857;BA.debugLine="Return pnlTable.Width";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=73465858;
 //BA.debugLineNum = 73465858;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=73990144;
 //BA.debugLineNum = 73990144;BA.debugLine="Private Sub Header_Click";
RDebugUtils.currentLine=73990146;
 //BA.debugLineNum = 73990146;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=73990147;
 //BA.debugLineNum = 73990147;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=73990148;
 //BA.debugLineNum = 73990148;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=73990152;
 //BA.debugLineNum = 73990152;BA.debugLine="If Data.Size < 2 Then Return";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=73990154;
 //BA.debugLineNum = 73990154;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=73990155;
 //BA.debugLineNum = 73990155;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=73990159;
 //BA.debugLineNum = 73990159;BA.debugLine="If cSortColumn Then 'this is set in the designer";
if (__ref._csortcolumn /*boolean*/ ) { 
RDebugUtils.currentLine=73990160;
 //BA.debugLineNum = 73990160;BA.debugLine="Dim dir As Int = 0 ' unsorted";
_dir = (int) (0);
RDebugUtils.currentLine=73990161;
 //BA.debugLineNum = 73990161;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
if ((__ref._sortedcol /*int*/ ==_col)) { 
RDebugUtils.currentLine=73990162;
 //BA.debugLineNum = 73990162;BA.debugLine="Select sortingDir";
switch (BA.switchObjectToInt(__ref._sortingdir /*int*/ ,(int) (0),(int) (1),(int) (-1))) {
case 0: {
RDebugUtils.currentLine=73990163;
 //BA.debugLineNum = 73990163;BA.debugLine="Case 0: dir = -1 ' going up";
_dir = (int) (-1);
 break; }
case 1: {
RDebugUtils.currentLine=73990164;
 //BA.debugLineNum = 73990164;BA.debugLine="Case 1: dir = -1";
_dir = (int) (-1);
 break; }
case 2: {
RDebugUtils.currentLine=73990165;
 //BA.debugLineNum = 73990165;BA.debugLine="Case -1: dir = 1";
_dir = (int) (1);
 break; }
}
;
 }else {
RDebugUtils.currentLine=73990168;
 //BA.debugLineNum = 73990168;BA.debugLine="dir = -1 ' start with going up";
_dir = (int) (-1);
 };
RDebugUtils.currentLine=73990171;
 //BA.debugLineNum = 73990171;BA.debugLine="bSorted = SortTable2(col, dir <= 0)";
_bsorted = __ref._sorttable2 /*boolean*/ (null,_col,_dir<=0);
RDebugUtils.currentLine=73990173;
 //BA.debugLineNum = 73990173;BA.debugLine="If bSorted Then";
if (_bsorted) { 
RDebugUtils.currentLine=73990174;
 //BA.debugLineNum = 73990174;BA.debugLine="showHeaderSorting(col, dir)";
__ref._showheadersorting /*String*/ (null,_col,_dir);
RDebugUtils.currentLine=73990175;
 //BA.debugLineNum = 73990175;BA.debugLine="sortedCol = col 'only change if a sort actually";
__ref._sortedcol /*int*/  = _col;
RDebugUtils.currentLine=73990176;
 //BA.debugLineNum = 73990176;BA.debugLine="sortingDir = dir 'only change if a sort actuall";
__ref._sortingdir /*int*/  = _dir;
 }else {
RDebugUtils.currentLine=73990178;
 //BA.debugLineNum = 73990178;BA.debugLine="showHeaderSorting(col, 2) 'no sort done so rect";
__ref._showheadersorting /*String*/ (null,_col,(int) (2));
 };
 };
RDebugUtils.currentLine=73990182;
 //BA.debugLineNum = 73990182;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=73990183;
 //BA.debugLineNum = 73990183;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(_col));
 };
RDebugUtils.currentLine=73990186;
 //BA.debugLineNum = 73990186;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=81526784;
 //BA.debugLineNum = 81526784;BA.debugLine="Public Sub SortTable2(Col As Int, bAscending As Bo";
RDebugUtils.currentLine=81526786;
 //BA.debugLineNum = 81526786;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=81526787;
 //BA.debugLineNum = 81526787;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=81526788;
 //BA.debugLineNum = 81526788;BA.debugLine="Dim arrRow() As String";
_arrrow = new String[(int) (0)];
java.util.Arrays.fill(_arrrow,"");
RDebugUtils.currentLine=81526789;
 //BA.debugLineNum = 81526789;BA.debugLine="Dim bDoMultiColumnSort As Boolean";
_bdomulticolumnsort = false;
RDebugUtils.currentLine=81526790;
 //BA.debugLineNum = 81526790;BA.debugLine="Dim bValidArrSortIndex As Boolean";
_bvalidarrsortindex = false;
RDebugUtils.currentLine=81526791;
 //BA.debugLineNum = 81526791;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=81526793;
 //BA.debugLineNum = 81526793;BA.debugLine="If Col <> iPreviousSortColumn Then";
if (_col!=__ref._iprevioussortcolumn /*int*/ ) { 
RDebugUtils.currentLine=81526794;
 //BA.debugLineNum = 81526794;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=81526795;
 //BA.debugLineNum = 81526795;BA.debugLine="arrDataSorted(Col) = False";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.False;
 };
RDebugUtils.currentLine=81526798;
 //BA.debugLineNum = 81526798;BA.debugLine="iUB = Data.Size - 1";
_iub = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=81526805;
 //BA.debugLineNum = 81526805;BA.debugLine="If bDataTempDone = False Then";
if (__ref._bdatatempdone /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=81526806;
 //BA.debugLineNum = 81526806;BA.debugLine="DataTemp.Initialize";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=81526807;
 //BA.debugLineNum = 81526807;BA.debugLine="For i = 0 To iUB";
{
final int step14 = 1;
final int limit14 = _iub;
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=81526808;
 //BA.debugLineNum = 81526808;BA.debugLine="DataTemp.Add(Data.Get(i))";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Add(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=81526810;
 //BA.debugLineNum = 81526810;BA.debugLine="bDataTempDone = True";
__ref._bdatatempdone /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=81526816;
 //BA.debugLineNum = 81526816;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=81526817;
 //BA.debugLineNum = 81526817;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("581526817","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=81526818;
 //BA.debugLineNum = 81526818;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=81526820;
 //BA.debugLineNum = 81526820;BA.debugLine="Dim arrColLong(Data.Size) As Long";
_arrcollong = new long[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=81526821;
 //BA.debugLineNum = 81526821;BA.debugLine="For i = 0 To iUB";
{
final int step24 = 1;
final int limit24 = _iub;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=81526822;
 //BA.debugLineNum = 81526822;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=81526823;
 //BA.debugLineNum = 81526823;BA.debugLine="Try";
try {RDebugUtils.currentLine=81526824;
 //BA.debugLineNum = 81526824;BA.debugLine="arrColLong(i) = arrRow(Col)";
__ref._arrcollong /*long[]*/ [_i] = (long)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e29) {
			ba.setLastException(e29); };
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=81526830;
 //BA.debugLineNum = 81526830;BA.debugLine="Dim arrColDouble(Data.Size) As Double";
_arrcoldouble = new double[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=81526831;
 //BA.debugLineNum = 81526831;BA.debugLine="For i = 0 To iUB";
{
final int step33 = 1;
final int limit33 = _iub;
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=81526832;
 //BA.debugLineNum = 81526832;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=81526833;
 //BA.debugLineNum = 81526833;BA.debugLine="Try";
try {RDebugUtils.currentLine=81526834;
 //BA.debugLineNum = 81526834;BA.debugLine="arrColDouble(i) = arrRow(Col)";
__ref._arrcoldouble /*double[]*/ [_i] = (double)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e38) {
			ba.setLastException(e38); };
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=81526840;
 //BA.debugLineNum = 81526840;BA.debugLine="Dim arrColString(Data.size) As String";
_arrcolstring = new String[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=81526841;
 //BA.debugLineNum = 81526841;BA.debugLine="For i = 0 To iUB";
{
final int step42 = 1;
final int limit42 = _iub;
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=81526842;
 //BA.debugLineNum = 81526842;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=81526843;
 //BA.debugLineNum = 81526843;BA.debugLine="Try";
try {RDebugUtils.currentLine=81526844;
 //BA.debugLineNum = 81526844;BA.debugLine="arrColString(i) = arrRow(Col)";
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
RDebugUtils.currentLine=81526856;
 //BA.debugLineNum = 81526856;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=81526857;
 //BA.debugLineNum = 81526857;BA.debugLine="bDoMultiColumnSort = mMultiColumnSort And bValidA";
_bdomulticolumnsort = __ref._mmulticolumnsort /*boolean*/  && _bvalidarrsortindex && __ref._mnumberofcolumns /*int*/ >1;
RDebugUtils.currentLine=81526862;
 //BA.debugLineNum = 81526862;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=81526863;
 //BA.debugLineNum = 81526863;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("581526863","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=81526864;
 //BA.debugLineNum = 81526864;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=81526867;
 //BA.debugLineNum = 81526867;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=81526868;
 //BA.debugLineNum = 81526868;BA.debugLine="arrSortIndex = SortOMLongIDX2(arrColLong, arr";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx2 /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=81526870;
 //BA.debugLineNum = 81526870;BA.debugLine="arrSortIndex = SortOMLongIDX(arrColLong, True";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 2: {
RDebugUtils.currentLine=81526874;
 //BA.debugLineNum = 81526874;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=81526875;
 //BA.debugLineNum = 81526875;BA.debugLine="arrSortIndex = SortOMDoubleIDX2(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx2 /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=81526877;
 //BA.debugLineNum = 81526877;BA.debugLine="arrSortIndex = SortOMDoubleIDX(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 3: {
RDebugUtils.currentLine=81526881;
 //BA.debugLineNum = 81526881;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=81526882;
 //BA.debugLineNum = 81526882;BA.debugLine="arrSortIndex = SortOMStringIDX2(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx2 /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=81526884;
 //BA.debugLineNum = 81526884;BA.debugLine="arrSortIndex = SortOMStringIDX(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 };
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=81526888;
 //BA.debugLineNum = 81526888;BA.debugLine="Dim arrSortIndex(1) As Int";
_arrsortindex = new int[(int) (1)];
;
RDebugUtils.currentLine=81526889;
 //BA.debugLineNum = 81526889;BA.debugLine="arrSortIndex(0) = -1";
__ref._arrsortindex /*int[]*/ [(int) (0)] = (int) (-1);
 break; }
}
;
RDebugUtils.currentLine=81526892;
 //BA.debugLineNum = 81526892;BA.debugLine="arrDataSorted(Col) = True";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.True;
RDebugUtils.currentLine=81526893;
 //BA.debugLineNum = 81526893;BA.debugLine="mapSortingIndexes.Put(Col, arrSortIndex)";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_col),(Object)(__ref._arrsortindex /*int[]*/ ));
 }else {
RDebugUtils.currentLine=81526895;
 //BA.debugLineNum = 81526895;BA.debugLine="arrSortIndex = mapSortingIndexes.Get(Col) 'retri";
__ref._arrsortindex /*int[]*/  = (int[])(__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_col)));
 };
RDebugUtils.currentLine=81526898;
 //BA.debugLineNum = 81526898;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=81526906;
 //BA.debugLineNum = 81526906;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=81526908;
 //BA.debugLineNum = 81526908;BA.debugLine="If bAscending = False And bValidArrSortIndex Then";
if (_bascending==__c.False && _bvalidarrsortindex) { 
RDebugUtils.currentLine=81526909;
 //BA.debugLineNum = 81526909;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T")) {
case 0: 
case 1: {
RDebugUtils.currentLine=81526911;
 //BA.debugLineNum = 81526911;BA.debugLine="arrSortIndex = ReverseIndexLong(arrColLong, ar";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexlong /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 2: {
RDebugUtils.currentLine=81526913;
 //BA.debugLineNum = 81526913;BA.debugLine="arrSortIndex = ReverseIndexDouble(arrColDouble";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexdouble /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=81526915;
 //BA.debugLineNum = 81526915;BA.debugLine="arrSortIndex = ReverseIndexString(arrColString";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexstring /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
}
;
 };
RDebugUtils.currentLine=81526922;
 //BA.debugLineNum = 81526922;BA.debugLine="If arrSortIndex(0) > -1 Then 'so don't move rows";
if (__ref._arrsortindex /*int[]*/ [(int) (0)]>-1) { 
RDebugUtils.currentLine=81526923;
 //BA.debugLineNum = 81526923;BA.debugLine="For i = 0 To iUB";
{
final int step97 = 1;
final int limit97 = _iub;
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
RDebugUtils.currentLine=81526924;
 //BA.debugLineNum = 81526924;BA.debugLine="Data.Set(i, DataTemp.Get(arrSortIndex(i)))";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._arrsortindex /*int[]*/ [_i]));
 }
};
RDebugUtils.currentLine=81526926;
 //BA.debugLineNum = 81526926;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=81526927;
 //BA.debugLineNum = 81526927;BA.debugLine="bSorted = True";
_bsorted = __c.True;
 };
RDebugUtils.currentLine=81526930;
 //BA.debugLineNum = 81526930;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=81526931;
 //BA.debugLineNum = 81526931;BA.debugLine="bPreviousSortAscending = bAscending 'not used for";
__ref._bprevioussortascending /*boolean*/  = _bascending;
RDebugUtils.currentLine=81526933;
 //BA.debugLineNum = 81526933;BA.debugLine="Return bSorted";
if (true) return _bsorted;
RDebugUtils.currentLine=81526935;
 //BA.debugLineNum = 81526935;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=74055680;
 //BA.debugLineNum = 74055680;BA.debugLine="Public Sub showHeaderSorting(col As Int, dir As In";
RDebugUtils.currentLine=74055683;
 //BA.debugLineNum = 74055683;BA.debugLine="Dim L As Int ' calculate left";
_l = 0;
RDebugUtils.currentLine=74055684;
 //BA.debugLineNum = 74055684;BA.debugLine="Dim t As Int ' calculate top";
_t = 0;
RDebugUtils.currentLine=74055685;
 //BA.debugLineNum = 74055685;BA.debugLine="Dim View As View";
_view = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=74055686;
 //BA.debugLineNum = 74055686;BA.debugLine="Dim ParentView As Panel";
_parentview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=74055688;
 //BA.debugLineNum = 74055688;BA.debugLine="pnlSortingView.RemoveView";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=74055690;
 //BA.debugLineNum = 74055690;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=74055691;
 //BA.debugLineNum = 74055691;BA.debugLine="If col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=74055692;
 //BA.debugLineNum = 74055692;BA.debugLine="View = HeaderFirst.GetView(col)";
_view = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=74055693;
 //BA.debugLineNum = 74055693;BA.debugLine="ParentView = HeaderFirst";
_parentview = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 }else {
RDebugUtils.currentLine=74055695;
 //BA.debugLineNum = 74055695;BA.debugLine="View = Header.GetView(col - mNumberOfFixedColum";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ ));
RDebugUtils.currentLine=74055696;
 //BA.debugLineNum = 74055696;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
 }else {
RDebugUtils.currentLine=74055699;
 //BA.debugLineNum = 74055699;BA.debugLine="View = Header.GetView(col)";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=74055700;
 //BA.debugLineNum = 74055700;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
RDebugUtils.currentLine=74055703;
 //BA.debugLineNum = 74055703;BA.debugLine="L = View.Left + View.Width - cSortBitmapWidth - 2";
_l = (int) (_view.getLeft()+_view.getWidth()-__ref._csortbitmapwidth /*int*/ -__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=74055705;
 //BA.debugLineNum = 74055705;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
if ((_dir==0)) { 
if (true) return "";};
RDebugUtils.currentLine=74055707;
 //BA.debugLineNum = 74055707;BA.debugLine="Select Case dir";
switch (BA.switchObjectToInt(_dir,(int) (-1),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=74055709;
 //BA.debugLineNum = 74055709;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpDes)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=74055710;
 //BA.debugLineNum = 74055710;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 1: {
RDebugUtils.currentLine=74055712;
 //BA.debugLineNum = 74055712;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpAsc)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=74055713;
 //BA.debugLineNum = 74055713;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 2: {
RDebugUtils.currentLine=74055715;
 //BA.debugLineNum = 74055715;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpEqual)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=74055716;
 //BA.debugLineNum = 74055716;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
}
;
RDebugUtils.currentLine=74055719;
 //BA.debugLineNum = 74055719;BA.debugLine="ParentView.AddView(pnlSortingView, L, t, cSortBit";
_parentview.AddView((android.view.View)(__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_l,_t,__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=74055721;
 //BA.debugLineNum = 74055721;BA.debugLine="End Sub";
return "";
}
public String  _header_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "header_longclick", false))
	 {return ((String) Debug.delegate(ba, "header_longclick", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
RDebugUtils.currentLine=70975488;
 //BA.debugLineNum = 70975488;BA.debugLine="Private Sub Header_LongClick";
RDebugUtils.currentLine=70975490;
 //BA.debugLineNum = 70975490;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=70975491;
 //BA.debugLineNum = 70975491;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=70975492;
 //BA.debugLineNum = 70975492;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=70975493;
 //BA.debugLineNum = 70975493;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=70975494;
 //BA.debugLineNum = 70975494;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderLong";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick")) { 
RDebugUtils.currentLine=70975495;
 //BA.debugLineNum = 70975495;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderLongCli";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick",(Object)(_col));
 };
RDebugUtils.currentLine=70975497;
 //BA.debugLineNum = 70975497;BA.debugLine="End Sub";
return "";
}
public String  _hidecol(b4a.example.ef.table __ref,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hidecol", false))
	 {return ((String) Debug.delegate(ba, "hidecol", new Object[] {_col}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=72679424;
 //BA.debugLineNum = 72679424;BA.debugLine="Public Sub hideCol(col As Int)";
RDebugUtils.currentLine=72679425;
 //BA.debugLineNum = 72679425;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=72679426;
 //BA.debugLineNum = 72679426;BA.debugLine="For i = 0 To SavedWidths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=72679427;
 //BA.debugLineNum = 72679427;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=72679430;
 //BA.debugLineNum = 72679430;BA.debugLine="tmpWidths(col) = 0	'???";
_tmpwidths[_col] = (int) (0);
RDebugUtils.currentLine=72679431;
 //BA.debugLineNum = 72679431;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=72679432;
 //BA.debugLineNum = 72679432;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hiderow", false))
	 {return ((String) Debug.delegate(ba, "hiderow", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
RDebugUtils.currentLine=70647808;
 //BA.debugLineNum = 70647808;BA.debugLine="Private Sub HideRow (Row As Int)";
RDebugUtils.currentLine=70647810;
 //BA.debugLineNum = 70647810;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=70647811;
 //BA.debugLineNum = 70647811;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=70647812;
 //BA.debugLineNum = 70647812;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
RDebugUtils.currentLine=70647814;
 //BA.debugLineNum = 70647814;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=70647816;
 //BA.debugLineNum = 70647816;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=70647817;
 //BA.debugLineNum = 70647817;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
RDebugUtils.currentLine=70647819;
 //BA.debugLineNum = 70647819;BA.debugLine="visibleRows.Remove(Row)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_row));
RDebugUtils.currentLine=70647820;
 //BA.debugLineNum = 70647820;BA.debugLine="LabelsCache.Add(lbls)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lbls));
RDebugUtils.currentLine=70647821;
 //BA.debugLineNum = 70647821;BA.debugLine="End Sub";
return "";
}
public String  _initfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initfastscroll", false))
	 {return ((String) Debug.delegate(ba, "initfastscroll", null));}
RDebugUtils.currentLine=74514432;
 //BA.debugLineNum = 74514432;BA.debugLine="Private Sub InitFastScroll";
RDebugUtils.currentLine=74514433;
 //BA.debugLineNum = 74514433;BA.debugLine="pnlFastScroll.Top = SV2.Top";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop());
RDebugUtils.currentLine=74514434;
 //BA.debugLineNum = 74514434;BA.debugLine="pnlFastScroll.Height = SV2.Height";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=74514435;
 //BA.debugLineNum = 74514435;BA.debugLine="FastScrollHeight = pnlFastScroll.Height - pnlFast";
__ref._fastscrollheight /*int*/  = (int) (__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=74514436;
 //BA.debugLineNum = 74514436;BA.debugLine="pnlFastScrollCursor.Top = SV2.VerticalScrollPosit";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()*__ref._fscscale /*double*/ ));
RDebugUtils.currentLine=74514437;
 //BA.debugLineNum = 74514437;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight - m";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=74514438;
 //BA.debugLineNum = 74514438;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=74514439;
 //BA.debugLineNum = 74514439;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=74514441;
 //BA.debugLineNum = 74514441;BA.debugLine="DrawFastScrollCursor";
__ref._drawfastscrollcursor /*String*/ (null);
RDebugUtils.currentLine=74514442;
 //BA.debugLineNum = 74514442;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.table __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=69402624;
 //BA.debugLineNum = 69402624;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
RDebugUtils.currentLine=69402625;
 //BA.debugLineNum = 69402625;BA.debugLine="cEventName = EventName";
__ref._ceventname /*String*/  = _eventname;
RDebugUtils.currentLine=69402626;
 //BA.debugLineNum = 69402626;BA.debugLine="cCallBack = CallBack";
__ref._ccallback /*Object*/  = _callback;
RDebugUtils.currentLine=69402628;
 //BA.debugLineNum = 69402628;BA.debugLine="cSortBitmapWidth = 10dip";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=69402629;
 //BA.debugLineNum = 69402629;BA.debugLine="cSortBitmapColor = Colors.Yellow";
__ref._csortbitmapcolor /*int*/  = __c.Colors.Yellow;
RDebugUtils.currentLine=69402630;
 //BA.debugLineNum = 69402630;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=69795840;
 //BA.debugLineNum = 69795840;BA.debugLine="Private Sub InitializeSortingBitmaps";
RDebugUtils.currentLine=69795841;
 //BA.debugLineNum = 69795841;BA.debugLine="Private pthAsc, pthDes, pthEqual As Path";
_pthasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=69795843;
 //BA.debugLineNum = 69795843;BA.debugLine="cSortBitmapHeight = cSortBitmapWidth / 2";
__ref._csortbitmapheight /*int*/  = (int) (__ref._csortbitmapwidth /*int*/ /(double)2);
RDebugUtils.currentLine=69795845;
 //BA.debugLineNum = 69795845;BA.debugLine="pnlAsc.Initialize(\"\")";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=69795846;
 //BA.debugLineNum = 69795846;BA.debugLine="pnlTable.AddView(pnlAsc, 0, 0, cSortBitmapWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=69795847;
 //BA.debugLineNum = 69795847;BA.debugLine="cvsAsc.Initialize(pnlAsc)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=69795848;
 //BA.debugLineNum = 69795848;BA.debugLine="pthAsc.Initialize(0, 0)";
_pthasc.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=69795849;
 //BA.debugLineNum = 69795849;BA.debugLine="pthAsc.LineTo(cSortBitmapWidth, 0)";
_pthasc.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (0));
RDebugUtils.currentLine=69795850;
 //BA.debugLineNum = 69795850;BA.debugLine="pthAsc.LineTo(cSortBitmapHeight, cSortBitmapHeigh";
_pthasc.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=69795851;
 //BA.debugLineNum = 69795851;BA.debugLine="cvsAsc.DrawColor(Colors.Transparent)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69795852;
 //BA.debugLineNum = 69795852;BA.debugLine="cvsAsc.DrawPath(pthAsc, cSortBitmapColor, True, 1";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthasc.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69795853;
 //BA.debugLineNum = 69795853;BA.debugLine="bmpAsc = cvsAsc.Bitmap";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=69795855;
 //BA.debugLineNum = 69795855;BA.debugLine="cvsDes.Initialize(pnlAsc)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=69795856;
 //BA.debugLineNum = 69795856;BA.debugLine="pthDes.Initialize(0, cSortBitmapHeight)";
_pthdes.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=69795857;
 //BA.debugLineNum = 69795857;BA.debugLine="pthDes.LineTo(cSortBitmapHeight, 0)";
_pthdes.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (0));
RDebugUtils.currentLine=69795858;
 //BA.debugLineNum = 69795858;BA.debugLine="pthDes.LineTo(cSortBitmapWidth, cSortBitmapHeight";
_pthdes.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=69795859;
 //BA.debugLineNum = 69795859;BA.debugLine="cvsDes.DrawColor(Colors.Transparent)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69795860;
 //BA.debugLineNum = 69795860;BA.debugLine="cvsDes.DrawPath(pthDes, cSortBitmapColor, True, 1";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthdes.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69795861;
 //BA.debugLineNum = 69795861;BA.debugLine="bmpDes = cvsDes.Bitmap";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=69795864;
 //BA.debugLineNum = 69795864;BA.debugLine="cvsEqual.Initialize(pnlAsc)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=69795865;
 //BA.debugLineNum = 69795865;BA.debugLine="pthEqual.Initialize(0, cSortBitmapHeight / 2)";
_pthequal.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=69795866;
 //BA.debugLineNum = 69795866;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, cSortBitmap";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=69795867;
 //BA.debugLineNum = 69795867;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth, cSortBitmapHeig";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=69795868;
 //BA.debugLineNum = 69795868;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, 0)";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (0));
RDebugUtils.currentLine=69795869;
 //BA.debugLineNum = 69795869;BA.debugLine="cvsEqual.DrawColor(Colors.Transparent)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=69795870;
 //BA.debugLineNum = 69795870;BA.debugLine="cvsEqual.DrawPath(pthEqual, cSortBitmapColor, Tru";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthequal.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=69795871;
 //BA.debugLineNum = 69795871;BA.debugLine="bmpEqual = cvsEqual.Bitmap";
__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=69795873;
 //BA.debugLineNum = 69795873;BA.debugLine="pnlAsc.RemoveView";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=69795874;
 //BA.debugLineNum = 69795874;BA.debugLine="End Sub";
return "";
}
public String  _initializetable(b4a.example.ef.table __ref,int _numberofcolumns,int _cellalignement,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initializetable", false))
	 {return ((String) Debug.delegate(ba, "initializetable", new Object[] {_numberofcolumns,_cellalignement,_showstatusline}));}
int _i = 0;
RDebugUtils.currentLine=69730304;
 //BA.debugLineNum = 69730304;BA.debugLine="Public Sub InitializeTable (NumberOfColumns As Int";
RDebugUtils.currentLine=69730306;
 //BA.debugLineNum = 69730306;BA.debugLine="setShowStatusLine(showStatusLine)";
__ref._setshowstatusline /*String*/ (null,_showstatusline);
RDebugUtils.currentLine=69730308;
 //BA.debugLineNum = 69730308;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=69730309;
 //BA.debugLineNum = 69730309;BA.debugLine="cAlignment = cellAlignement";
__ref._calignment /*int*/  = _cellalignement;
RDebugUtils.currentLine=69730311;
 //BA.debugLineNum = 69730311;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=69730312;
 //BA.debugLineNum = 69730312;BA.debugLine="Data.Initialize	'needed";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=69730314;
 //BA.debugLineNum = 69730314;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69730315;
 //BA.debugLineNum = 69730315;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69730316;
 //BA.debugLineNum = 69730316;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69730317;
 //BA.debugLineNum = 69730317;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=69730318;
 //BA.debugLineNum = 69730318;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=69730319;
 //BA.debugLineNum = 69730319;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=69730320;
 //BA.debugLineNum = 69730320;BA.debugLine="ColumnWidths(i) = cWidth / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._cwidth /*int*/ /(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=69730321;
 //BA.debugLineNum = 69730321;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=69730322;
 //BA.debugLineNum = 69730322;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=69730323;
 //BA.debugLineNum = 69730323;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=69730326;
 //BA.debugLineNum = 69730326;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=69730327;
 //BA.debugLineNum = 69730327;BA.debugLine="End Sub";
return "";
}
public String  _setshowstatusline(b4a.example.ef.table __ref,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setshowstatusline", false))
	 {return ((String) Debug.delegate(ba, "setshowstatusline", new Object[] {_showstatusline}));}
RDebugUtils.currentLine=78643200;
 //BA.debugLineNum = 78643200;BA.debugLine="Public Sub setShowStatusLine(ShowStatusLine As Boo";
RDebugUtils.currentLine=78643201;
 //BA.debugLineNum = 78643201;BA.debugLine="cShowStatusLine = ShowStatusLine";
__ref._cshowstatusline /*boolean*/  = _showstatusline;
RDebugUtils.currentLine=78643202;
 //BA.debugLineNum = 78643202;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=78643203;
 //BA.debugLineNum = 78643203;BA.debugLine="SV2.Height = cHeight - Header.Height - cStatusLi";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=78643204;
 //BA.debugLineNum = 78643204;BA.debugLine="lblStatusLine.Visible = True";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=78643206;
 //BA.debugLineNum = 78643206;BA.debugLine="SV2.Height = cHeight - Header.Height";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=78643207;
 //BA.debugLineNum = 78643207;BA.debugLine="lblStatusLine.Visible = False";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=78643209;
 //BA.debugLineNum = 78643209;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=78643210;
 //BA.debugLineNum = 78643210;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=78643211;
 //BA.debugLineNum = 78643211;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=78643213;
 //BA.debugLineNum = 78643213;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=78643214;
 //BA.debugLineNum = 78643214;BA.debugLine="End Sub";
return "";
}
public String  _svf_scrollchanged(b4a.example.ef.table __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "svf_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "svf_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=70189056;
 //BA.debugLineNum = 70189056;BA.debugLine="Private Sub SVF_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=70189057;
 //BA.debugLineNum = 70189057;BA.debugLine="SVFScrolls = True";
__ref._svfscrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=70189058;
 //BA.debugLineNum = 70189058;BA.debugLine="If SV2Scrolls = False Then";
if (__ref._sv2scrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70189059;
 //BA.debugLineNum = 70189059;BA.debugLine="Scroll(SV2PosX, Position)";
__ref._scroll /*String*/ (null,__ref._sv2posx /*int*/ ,_position);
RDebugUtils.currentLine=70189060;
 //BA.debugLineNum = 70189060;BA.debugLine="SV2.VerticalScrollPosition = Position";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_position);
 };
RDebugUtils.currentLine=70189062;
 //BA.debugLineNum = 70189062;BA.debugLine="SVFScrolls = False";
__ref._svfscrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=70189063;
 //BA.debugLineNum = 70189063;BA.debugLine="End Sub";
return "";
}
public String  _sv2_scrollchanged(b4a.example.ef.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sv2_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv2_scrollchanged", new Object[] {_posx,_posy}));}
RDebugUtils.currentLine=70254592;
 //BA.debugLineNum = 70254592;BA.debugLine="Private Sub SV2_ScrollChanged(PosX As Int, PosY As";
RDebugUtils.currentLine=70254593;
 //BA.debugLineNum = 70254593;BA.debugLine="SV2Scrolls = True";
__ref._sv2scrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=70254594;
 //BA.debugLineNum = 70254594;BA.debugLine="If SVFScrolls = False Then";
if (__ref._svfscrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70254595;
 //BA.debugLineNum = 70254595;BA.debugLine="SVF.ScrollToNow(PosY)";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .ScrollToNow(_posy);
RDebugUtils.currentLine=70254596;
 //BA.debugLineNum = 70254596;BA.debugLine="Scroll(PosX, PosY)";
__ref._scroll /*String*/ (null,_posx,_posy);
RDebugUtils.currentLine=70254597;
 //BA.debugLineNum = 70254597;BA.debugLine="SV2PosX = PosX";
__ref._sv2posx /*int*/  = _posx;
 };
RDebugUtils.currentLine=70254600;
 //BA.debugLineNum = 70254600;BA.debugLine="SV2Scrolls = False";
__ref._sv2scrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=70254601;
 //BA.debugLineNum = 70254601;BA.debugLine="If mFastScroll = True And Data.Size >= mFastScrol";
if (__ref._mfastscroll /*boolean*/ ==__c.True && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._mfastscrollminitems /*int*/  && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ >__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=70254602;
 //BA.debugLineNum = 70254602;BA.debugLine="FScScale = FastScrollHeight / (SV2.Panel.Height";
__ref._fscscale /*double*/  = __ref._fastscrollheight /*int*/ /(double)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight()-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=70254603;
 //BA.debugLineNum = 70254603;BA.debugLine="pnlFastScroll.Visible = True";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=70254604;
 //BA.debugLineNum = 70254604;BA.debugLine="If mFastScrollShowLabel = True Then";
if (__ref._mfastscrollshowlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=70254605;
 //BA.debugLineNum = 70254605;BA.debugLine="lblFastScroll.Visible = True";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=70254607;
 //BA.debugLineNum = 70254607;BA.debugLine="CalcFastScroll(PosY)";
__ref._calcfastscroll /*String*/ (null,_posy);
RDebugUtils.currentLine=70254608;
 //BA.debugLineNum = 70254608;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=70254610;
 //BA.debugLineNum = 70254610;BA.debugLine="End Sub";
return "";
}
public String  _setstatusline(b4a.example.ef.table __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatusline", false))
	 {return ((String) Debug.delegate(ba, "setstatusline", new Object[] {_text}));}
RDebugUtils.currentLine=72810496;
 //BA.debugLineNum = 72810496;BA.debugLine="Public Sub setStatusLine(Text As String)";
RDebugUtils.currentLine=72810497;
 //BA.debugLineNum = 72810497;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized())) { 
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_text));};
RDebugUtils.currentLine=72810498;
 //BA.debugLineNum = 72810498;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71892992;
 //BA.debugLineNum = 71892992;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As St";
RDebugUtils.currentLine=71892993;
 //BA.debugLineNum = 71892993;BA.debugLine="If (Row < 0) Then Row = 0";
if ((_row<0)) { 
_row = (int) (0);};
RDebugUtils.currentLine=71892994;
 //BA.debugLineNum = 71892994;BA.debugLine="If (Row > Data.Size) Then";
if ((_row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())) { 
RDebugUtils.currentLine=71892995;
 //BA.debugLineNum = 71892995;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=71892996;
 //BA.debugLineNum = 71892996;BA.debugLine="AddRow(Values)";
__ref._addrow /*String*/ (null,_values);
 }else {
RDebugUtils.currentLine=71892998;
 //BA.debugLineNum = 71892998;BA.debugLine="AddRowAutomaticWidth(Values)";
__ref._addrowautomaticwidth /*String*/ (null,_values);
 };
RDebugUtils.currentLine=71893000;
 //BA.debugLineNum = 71893000;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=71893002;
 //BA.debugLineNum = 71893002;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=71893004;
 //BA.debugLineNum = 71893004;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71893005;
 //BA.debugLineNum = 71893005;BA.debugLine="L.Initialize";
_l.Initialize();
RDebugUtils.currentLine=71893006;
 //BA.debugLineNum = 71893006;BA.debugLine="L.Add(Values)";
_l.Add((Object)(_values));
RDebugUtils.currentLine=71893008;
 //BA.debugLineNum = 71893008;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step14 = 1;
final int limit14 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=71893009;
 //BA.debugLineNum = 71893009;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=71893010;
 //BA.debugLineNum = 71893010;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=71893011;
 //BA.debugLineNum = 71893011;BA.debugLine="If (keepSel >= Row) Then";
if ((_keepsel>=_row)) { 
RDebugUtils.currentLine=71893012;
 //BA.debugLineNum = 71893012;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel+1));
 };
 }
};
RDebugUtils.currentLine=71893016;
 //BA.debugLineNum = 71893016;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step21 = 1;
final int limit21 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=71893017;
 //BA.debugLineNum = 71893017;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=71893019;
 //BA.debugLineNum = 71893019;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_row,_l);
RDebugUtils.currentLine=71893020;
 //BA.debugLineNum = 71893020;BA.debugLine="lstRowColorIndexes.InsertAt(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_row,(Object)(0));
RDebugUtils.currentLine=71893022;
 //BA.debugLineNum = 71893022;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=71893024;
 //BA.debugLineNum = 71893024;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step27 = 1;
final int limit27 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=71893025;
 //BA.debugLineNum = 71893025;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=71893028;
 //BA.debugLineNum = 71893028;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=71893029;
 //BA.debugLineNum = 71893029;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=71893030;
 //BA.debugLineNum = 71893030;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=71893031;
 //BA.debugLineNum = 71893031;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=71893032;
 //BA.debugLineNum = 71893032;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=71893034;
 //BA.debugLineNum = 71893034;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=71893035;
 //BA.debugLineNum = 71893035;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=71893036;
 //BA.debugLineNum = 71893036;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=71893037;
 //BA.debugLineNum = 71893037;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=71893038;
 //BA.debugLineNum = 71893038;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=71893039;
 //BA.debugLineNum = 71893039;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=71893040;
 //BA.debugLineNum = 71893040;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=71893042;
 //BA.debugLineNum = 71893042;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=71893044;
 //BA.debugLineNum = 71893044;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=71893045;
 //BA.debugLineNum = 71893045;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=71893046;
 //BA.debugLineNum = 71893046;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=71893047;
 //BA.debugLineNum = 71893047;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=71893050;
 //BA.debugLineNum = 71893050;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step51 = 1;
final int limit51 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
RDebugUtils.currentLine=71893051;
 //BA.debugLineNum = 71893051;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=71893052;
 //BA.debugLineNum = 71893052;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=71893054;
 //BA.debugLineNum = 71893054;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=71893056;
 //BA.debugLineNum = 71893056;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=71893057;
 //BA.debugLineNum = 71893057;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=71893058;
 //BA.debugLineNum = 71893058;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=71893059;
 //BA.debugLineNum = 71893059;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=71893060;
 //BA.debugLineNum = 71893060;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=71893061;
 //BA.debugLineNum = 71893061;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=71893065;
 //BA.debugLineNum = 71893065;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=71893066;
 //BA.debugLineNum = 71893066;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
 };
RDebugUtils.currentLine=71893070;
 //BA.debugLineNum = 71893070;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=71893071;
 //BA.debugLineNum = 71893071;BA.debugLine="End Sub";
return false;
}
public String  _ip_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "ip_click", false))
	 {return ((String) Debug.delegate(ba, "ip_click", null));}
RDebugUtils.currentLine=72876032;
 //BA.debugLineNum = 72876032;BA.debugLine="Private Sub IP_Click";
RDebugUtils.currentLine=72876034;
 //BA.debugLineNum = 72876034;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=72876035;
 //BA.debugLineNum = 72876035;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(-1));
 };
RDebugUtils.currentLine=72876037;
 //BA.debugLineNum = 72876037;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "isrowvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isrowvisible", new Object[] {_row}));}
RDebugUtils.currentLine=70582272;
 //BA.debugLineNum = 70582272;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean		'";
RDebugUtils.currentLine=70582273;
 //BA.debugLineNum = 70582273;BA.debugLine="Return Row < (SV2.VerticalScrollPosition + SV2.He";
if (true) return _row<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)(__ref._crowheight /*int*/ +1) && _row>__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ ;
RDebugUtils.currentLine=70582275;
 //BA.debugLineNum = 70582275;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71368705;
 //BA.debugLineNum = 71368705;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorow"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=71368706;
 //BA.debugLineNum = 71368706;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=71368707;
 //BA.debugLineNum = 71368707;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71434241;
 //BA.debugLineNum = 71434241;BA.debugLine="Log(\"You may get this warning:\")";
parent.__c.LogImpl("571434241","You may get this warning:",0);
RDebugUtils.currentLine=71434242;
 //BA.debugLineNum = 71434242;BA.debugLine="Log(\"Unexpected event (missing RaiseSynchronousEv";
parent.__c.LogImpl("571434242","Unexpected event (missing RaiseSynchronousEvents): sv_scrollchanged",0);
RDebugUtils.currentLine=71434243;
 //BA.debugLineNum = 71434243;BA.debugLine="Log(\"Ignore it, it is NOT harmful !\")";
parent.__c.LogImpl("571434243","Ignore it, it is NOT harmful !",0);
RDebugUtils.currentLine=71434244;
 //BA.debugLineNum = 71434244;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=71434246;
 //BA.debugLineNum = 71434246;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
RDebugUtils.currentLine=71434247;
 //BA.debugLineNum = 71434247;BA.debugLine="rc.Col = Col";
_rc.Col /*int*/  = _col;
RDebugUtils.currentLine=71434248;
 //BA.debugLineNum = 71434248;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorowandselect"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=71434249;
 //BA.debugLineNum = 71434249;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=71434251;
 //BA.debugLineNum = 71434251;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=71434253;
 //BA.debugLineNum = 71434253;BA.debugLine="Private i, Left As Int";
_i = 0;
_left = 0;
RDebugUtils.currentLine=71434254;
 //BA.debugLineNum = 71434254;BA.debugLine="If Col > 0 Then";
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
RDebugUtils.currentLine=71434255;
 //BA.debugLineNum = 71434255;BA.debugLine="For i = 0 To Col - 1";
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
RDebugUtils.currentLine=71434256;
 //BA.debugLineNum = 71434256;BA.debugLine="Left = Left + ColumnWidths(i)";
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
RDebugUtils.currentLine=71434259;
 //BA.debugLineNum = 71434259;BA.debugLine="Left = Left - SVF.Width";
_left = (int) (_left-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=71434260;
 //BA.debugLineNum = 71434260;BA.debugLine="SV2.HorizontalScrollPosition = Left";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition(_left);
RDebugUtils.currentLine=71434261;
 //BA.debugLineNum = 71434261;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=76939264;
 //BA.debugLineNum = 76939264;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
RDebugUtils.currentLine=76939265;
 //BA.debugLineNum = 76939265;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=76939266;
 //BA.debugLineNum = 76939266;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=76939268;
 //BA.debugLineNum = 76939268;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=76939269;
 //BA.debugLineNum = 76939269;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=76939270;
 //BA.debugLineNum = 76939270;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=76939272;
 //BA.debugLineNum = 76939272;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=76939273;
 //BA.debugLineNum = 76939273;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=76939274;
 //BA.debugLineNum = 76939274;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=76939275;
 //BA.debugLineNum = 76939275;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=76939276;
 //BA.debugLineNum = 76939276;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=76939277;
 //BA.debugLineNum = 76939277;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=76939278;
 //BA.debugLineNum = 76939278;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=76939279;
 //BA.debugLineNum = 76939279;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=76939280;
 //BA.debugLineNum = 76939280;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=76939281;
 //BA.debugLineNum = 76939281;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=76939282;
 //BA.debugLineNum = 76939282;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=76939283;
 //BA.debugLineNum = 76939283;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=76939284;
 //BA.debugLineNum = 76939284;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=76939285;
 //BA.debugLineNum = 76939285;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=76939287;
 //BA.debugLineNum = 76939287;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=76939288;
 //BA.debugLineNum = 76939288;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=76939290;
 //BA.debugLineNum = 76939290;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=76939292;
 //BA.debugLineNum = 76939292;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=76939293;
 //BA.debugLineNum = 76939293;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=76939294;
 //BA.debugLineNum = 76939294;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=76939295;
 //BA.debugLineNum = 76939295;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=76939296;
 //BA.debugLineNum = 76939296;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=76939297;
 //BA.debugLineNum = 76939297;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=76939298;
 //BA.debugLineNum = 76939298;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].DEFAULT,__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=76939300;
 //BA.debugLineNum = 76939300;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=76939304;
 //BA.debugLineNum = 76939304;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=76939308;
 //BA.debugLineNum = 76939308;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=76939309;
 //BA.debugLineNum = 76939309;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=76939313;
 //BA.debugLineNum = 76939313;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=76939315;
 //BA.debugLineNum = 76939315;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=76939316;
 //BA.debugLineNum = 76939316;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=76939317;
 //BA.debugLineNum = 76939317;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=76939318;
 //BA.debugLineNum = 76939318;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=76939319;
 //BA.debugLineNum = 76939319;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=76939320;
 //BA.debugLineNum = 76939320;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=76939321;
 //BA.debugLineNum = 76939321;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=76939323;
 //BA.debugLineNum = 76939323;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=76939326;
 //BA.debugLineNum = 76939326;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=76939329;
 //BA.debugLineNum = 76939329;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=76939332;
 //BA.debugLineNum = 76939332;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70844416;
 //BA.debugLineNum = 70844416;BA.debugLine="Public Sub SetHeader(Values() As String)";
RDebugUtils.currentLine=70844417;
 //BA.debugLineNum = 70844417;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=70844419;
 //BA.debugLineNum = 70844419;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=70844420;
 //BA.debugLineNum = 70844420;BA.debugLine="HeaderNames.Initialize2(Values)";
__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
RDebugUtils.currentLine=70844422;
 //BA.debugLineNum = 70844422;BA.debugLine="Dim Left = 0 As Int";
_left = (int) (0);
RDebugUtils.currentLine=70844424;
 //BA.debugLineNum = 70844424;BA.debugLine="Dim Change = 0 As Int";
_change = (int) (0);
RDebugUtils.currentLine=70844425;
 //BA.debugLineNum = 70844425;BA.debugLine="Dim w As Int";
_w = 0;
RDebugUtils.currentLine=70844426;
 //BA.debugLineNum = 70844426;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=70844427;
 //BA.debugLineNum = 70844427;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=70844428;
 //BA.debugLineNum = 70844428;BA.debugLine="lbl.Initialize(\"header\")";
_lbl.Initialize(ba,"header");
RDebugUtils.currentLine=70844429;
 //BA.debugLineNum = 70844429;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70844430;
 //BA.debugLineNum = 70844430;BA.debugLine="lbl.Gravity = cHeaderAlignment";
_lbl.setGravity(__ref._cheaderalignment /*int*/ );
 }else {
RDebugUtils.currentLine=70844432;
 //BA.debugLineNum = 70844432;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=70844435;
 //BA.debugLineNum = 70844435;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=70844436;
 //BA.debugLineNum = 70844436;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=70844438;
 //BA.debugLineNum = 70844438;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 };
RDebugUtils.currentLine=70844441;
 //BA.debugLineNum = 70844441;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=70844442;
 //BA.debugLineNum = 70844442;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=70844444;
 //BA.debugLineNum = 70844444;BA.debugLine="If cUseColumnColors = False Or cHeaderTextColors";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False || __ref._cheadertextcolors /*int[]*/ .length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=70844445;
 //BA.debugLineNum = 70844445;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
RDebugUtils.currentLine=70844446;
 //BA.debugLineNum = 70844446;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=70844448;
 //BA.debugLineNum = 70844448;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
RDebugUtils.currentLine=70844449;
 //BA.debugLineNum = 70844449;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=70844452;
 //BA.debugLineNum = 70844452;BA.debugLine="lbl.Text = Values(col)";
_lbl.setText(BA.ObjectToCharSequence(_values[_col]));
RDebugUtils.currentLine=70844453;
 //BA.debugLineNum = 70844453;BA.debugLine="lbl.Tag = col";
_lbl.setTag((Object)(_col));
RDebugUtils.currentLine=70844455;
 //BA.debugLineNum = 70844455;BA.debugLine="w = Max(0, ColumnWidths(col) - cLineWidth)		' ne";
_w = (int) (__c.Max(0,__ref._columnwidths /*int[]*/ [_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=70844457;
 //BA.debugLineNum = 70844457;BA.debugLine="If mNumberOfFixedColumns > 0 And col < mNumberOf";
if (__ref._mnumberoffixedcolumns /*int*/ >0 && _col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=70844458;
 //BA.debugLineNum = 70844458;BA.debugLine="HeaderFirst.AddView(lbl, Left, 0, w, cHeaderHei";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 }else {
RDebugUtils.currentLine=70844461;
 //BA.debugLineNum = 70844461;BA.debugLine="If col = mNumberOfFixedColumns Then";
if (_col==__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=70844462;
 //BA.debugLineNum = 70844462;BA.debugLine="Left = 0";
_left = (int) (0);
 };
RDebugUtils.currentLine=70844464;
 //BA.debugLineNum = 70844464;BA.debugLine="Header.AddView(lbl, Left, 0, w, cHeaderHeight)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 };
RDebugUtils.currentLine=70844468;
 //BA.debugLineNum = 70844468;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=70844469;
 //BA.debugLineNum = 70844469;BA.debugLine="If Values(col).Contains(CRLF) Then";
if (_values[_col].contains(__c.CRLF)) { 
RDebugUtils.currentLine=70844470;
 //BA.debugLineNum = 70844470;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=70844471;
 //BA.debugLineNum = 70844471;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=70844472;
 //BA.debugLineNum = 70844472;BA.debugLine="str = Regex.Split(CRLF, Values(col))";
_str = __c.Regex.Split(__c.CRLF,_values[_col]);
RDebugUtils.currentLine=70844473;
 //BA.debugLineNum = 70844473;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(str";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[(int) (0)],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
RDebugUtils.currentLine=70844474;
 //BA.debugLineNum = 70844474;BA.debugLine="For j = 1 To str.Length - 1";
{
final int step46 = 1;
final int limit46 = (int) (_str.length-1);
_j = (int) (1) ;
for (;_j <= limit46 ;_j = _j + step46 ) {
RDebugUtils.currentLine=70844475;
 //BA.debugLineNum = 70844475;BA.debugLine="HeaderWidths(col) = Max(HeaderWidths(col),cvs";
__ref._headerwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[_j],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=70844478;
 //BA.debugLineNum = 70844478;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Val";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_col],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=70844480;
 //BA.debugLineNum = 70844480;BA.debugLine="If HeaderWidths(col) > ColumnWidths(col) Then";
if (__ref._headerwidths /*int[]*/ [_col]>__ref._columnwidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=70844481;
 //BA.debugLineNum = 70844481;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=70844482;
 //BA.debugLineNum = 70844482;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Col";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._columnwidths /*int[]*/ [_col]));
 }else 
{RDebugUtils.currentLine=70844483;
 //BA.debugLineNum = 70844483;BA.debugLine="Else If ColumnWidths(col) > HeaderWidths(col) A";
if (__ref._columnwidths /*int[]*/ [_col]>__ref._headerwidths /*int[]*/ [_col] && __ref._columnwidths /*int[]*/ [_col]>__ref._datawidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=70844484;
 //BA.debugLineNum = 70844484;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=70844485;
 //BA.debugLineNum = 70844485;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Dat";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }}
;
 };
RDebugUtils.currentLine=70844488;
 //BA.debugLineNum = 70844488;BA.debugLine="Left = Left + ColumnWidths(col)";
_left = (int) (_left+__ref._columnwidths /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=70844491;
 //BA.debugLineNum = 70844491;BA.debugLine="If Change = 1 Then";
if (_change==1) { 
RDebugUtils.currentLine=70844492;
 //BA.debugLineNum = 70844492;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=70844494;
 //BA.debugLineNum = 70844494;BA.debugLine="Header.Left = - SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=70844495;
 //BA.debugLineNum = 70844495;BA.debugLine="End Sub";
return "";
}
public String  _setarrcolumnssorted(b4a.example.ef.table __ref,int _icolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setarrcolumnssorted", false))
	 {return ((String) Debug.delegate(ba, "setarrcolumnssorted", new Object[] {_icolumns}));}
RDebugUtils.currentLine=81592320;
 //BA.debugLineNum = 81592320;BA.debugLine="Public Sub SetArrColumnsSorted(iColumns As Int)";
RDebugUtils.currentLine=81592322;
 //BA.debugLineNum = 81592322;BA.debugLine="sortingDir = 0 ' -1, 0, 1 as asc, unsorted, desc";
__ref._sortingdir /*int*/  = (int) (0);
RDebugUtils.currentLine=81592323;
 //BA.debugLineNum = 81592323;BA.debugLine="sortedCol = -1";
__ref._sortedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=81592325;
 //BA.debugLineNum = 81592325;BA.debugLine="Dim arrDataSorted(iColumns) As Boolean";
_arrdatasorted = new boolean[_icolumns];
;
RDebugUtils.currentLine=81592326;
 //BA.debugLineNum = 81592326;BA.debugLine="bDataTempDone = False";
__ref._bdatatempdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=81592327;
 //BA.debugLineNum = 81592327;BA.debugLine="Dim arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=81592328;
 //BA.debugLineNum = 81592328;BA.debugLine="mapSortingIndexes.Initialize";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=81592330;
 //BA.debugLineNum = 81592330;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=77004800;
 //BA.debugLineNum = 77004800;BA.debugLine="Public Sub LoadSQLiteDB2(SQLite As SQL, Query As S";
RDebugUtils.currentLine=77004801;
 //BA.debugLineNum = 77004801;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=77004802;
 //BA.debugLineNum = 77004802;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=77004804;
 //BA.debugLineNum = 77004804;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=77004805;
 //BA.debugLineNum = 77004805;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=77004806;
 //BA.debugLineNum = 77004806;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=77004808;
 //BA.debugLineNum = 77004808;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=77004809;
 //BA.debugLineNum = 77004809;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77004810;
 //BA.debugLineNum = 77004810;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77004811;
 //BA.debugLineNum = 77004811;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77004812;
 //BA.debugLineNum = 77004812;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=77004813;
 //BA.debugLineNum = 77004813;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=77004814;
 //BA.debugLineNum = 77004814;BA.debugLine="Dim ii As Long";
_ii = 0L;
RDebugUtils.currentLine=77004815;
 //BA.debugLineNum = 77004815;BA.debugLine="Dim dd As Double";
_dd = 0;
RDebugUtils.currentLine=77004816;
 //BA.debugLineNum = 77004816;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=77004817;
 //BA.debugLineNum = 77004817;BA.debugLine="cColumnDataType = ColumnDataTypes";
__ref._ccolumndatatype /*String[]*/  = _columndatatypes;
RDebugUtils.currentLine=77004818;
 //BA.debugLineNum = 77004818;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=77004819;
 //BA.debugLineNum = 77004819;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=77004820;
 //BA.debugLineNum = 77004820;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=77004821;
 //BA.debugLineNum = 77004821;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77004822;
 //BA.debugLineNum = 77004822;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77004823;
 //BA.debugLineNum = 77004823;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=77004825;
 //BA.debugLineNum = 77004825;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77004826;
 //BA.debugLineNum = 77004826;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=77004828;
 //BA.debugLineNum = 77004828;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=77004830;
 //BA.debugLineNum = 77004830;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=77004831;
 //BA.debugLineNum = 77004831;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step29 = 1;
final int limit29 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit29 ;_row = _row + step29 ) {
RDebugUtils.currentLine=77004832;
 //BA.debugLineNum = 77004832;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77004833;
 //BA.debugLineNum = 77004833;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77004834;
 //BA.debugLineNum = 77004834;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=77004835;
 //BA.debugLineNum = 77004835;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R")) {
case 0: {
RDebugUtils.currentLine=77004837;
 //BA.debugLineNum = 77004837;BA.debugLine="ii = Curs.GetInt2(col)";
_ii = (long) (_curs.GetInt2(_col));
RDebugUtils.currentLine=77004838;
 //BA.debugLineNum = 77004838;BA.debugLine="str = ii";
_str = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=77004840;
 //BA.debugLineNum = 77004840;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=77004841;
 //BA.debugLineNum = 77004841;BA.debugLine="str = dd";
_str = BA.NumberToString(_dd);
 break; }
}
;
 }else {
RDebugUtils.currentLine=77004844;
 //BA.debugLineNum = 77004844;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=77004846;
 //BA.debugLineNum = 77004846;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77004847;
 //BA.debugLineNum = 77004847;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=77004849;
 //BA.debugLineNum = 77004849;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=77004852;
 //BA.debugLineNum = 77004852;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=77004856;
 //BA.debugLineNum = 77004856;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=77004857;
 //BA.debugLineNum = 77004857;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=77004861;
 //BA.debugLineNum = 77004861;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=77004863;
 //BA.debugLineNum = 77004863;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step56 = 1;
final int limit56 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit56 ;_row = _row + step56 ) {
RDebugUtils.currentLine=77004864;
 //BA.debugLineNum = 77004864;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77004865;
 //BA.debugLineNum = 77004865;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=77004866;
 //BA.debugLineNum = 77004866;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=77004867;
 //BA.debugLineNum = 77004867;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77004868;
 //BA.debugLineNum = 77004868;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=77004869;
 //BA.debugLineNum = 77004869;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 }else {
RDebugUtils.currentLine=77004871;
 //BA.debugLineNum = 77004871;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R","T")) {
case 0: {
RDebugUtils.currentLine=77004873;
 //BA.debugLineNum = 77004873;BA.debugLine="ii = Curs.GetLong2(col)";
_ii = _curs.GetLong2(_col);
RDebugUtils.currentLine=77004874;
 //BA.debugLineNum = 77004874;BA.debugLine="R(col) = ii";
_r[_col] = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=77004876;
 //BA.debugLineNum = 77004876;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=77004877;
 //BA.debugLineNum = 77004877;BA.debugLine="R(col) = dd";
_r[_col] = BA.NumberToString(_dd);
 break; }
case 2: {
RDebugUtils.currentLine=77004879;
 //BA.debugLineNum = 77004879;BA.debugLine="R(col) = Curs.GetString2(col)";
_r[_col] = _curs.GetString2(_col);
 break; }
default: {
RDebugUtils.currentLine=77004881;
 //BA.debugLineNum = 77004881;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 break; }
}
;
 };
 }
};
RDebugUtils.currentLine=77004885;
 //BA.debugLineNum = 77004885;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=77004888;
 //BA.debugLineNum = 77004888;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=77004889;
 //BA.debugLineNum = 77004889;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=77070336;
 //BA.debugLineNum = 77070336;BA.debugLine="Public Sub LoadSQLiteDB3(SQLite As SQL, Query As S";
RDebugUtils.currentLine=77070337;
 //BA.debugLineNum = 77070337;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=77070338;
 //BA.debugLineNum = 77070338;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=77070340;
 //BA.debugLineNum = 77070340;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=77070341;
 //BA.debugLineNum = 77070341;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=77070342;
 //BA.debugLineNum = 77070342;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=77070344;
 //BA.debugLineNum = 77070344;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=77070345;
 //BA.debugLineNum = 77070345;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77070346;
 //BA.debugLineNum = 77070346;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77070347;
 //BA.debugLineNum = 77070347;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77070348;
 //BA.debugLineNum = 77070348;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=77070349;
 //BA.debugLineNum = 77070349;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=77070350;
 //BA.debugLineNum = 77070350;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=77070351;
 //BA.debugLineNum = 77070351;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=77070352;
 //BA.debugLineNum = 77070352;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=77070353;
 //BA.debugLineNum = 77070353;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=77070354;
 //BA.debugLineNum = 77070354;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=77070355;
 //BA.debugLineNum = 77070355;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77070356;
 //BA.debugLineNum = 77070356;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77070357;
 //BA.debugLineNum = 77070357;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=77070359;
 //BA.debugLineNum = 77070359;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77070360;
 //BA.debugLineNum = 77070360;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=77070362;
 //BA.debugLineNum = 77070362;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=77070364;
 //BA.debugLineNum = 77070364;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=77070365;
 //BA.debugLineNum = 77070365;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=77070366;
 //BA.debugLineNum = 77070366;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77070367;
 //BA.debugLineNum = 77070367;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77070368;
 //BA.debugLineNum = 77070368;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=77070369;
 //BA.debugLineNum = 77070369;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77070370;
 //BA.debugLineNum = 77070370;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=77070372;
 //BA.debugLineNum = 77070372;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=77070376;
 //BA.debugLineNum = 77070376;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=77070380;
 //BA.debugLineNum = 77070380;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=77070381;
 //BA.debugLineNum = 77070381;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=77070385;
 //BA.debugLineNum = 77070385;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=77070387;
 //BA.debugLineNum = 77070387;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=77070388;
 //BA.debugLineNum = 77070388;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=77070389;
 //BA.debugLineNum = 77070389;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=77070390;
 //BA.debugLineNum = 77070390;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77070391;
 //BA.debugLineNum = 77070391;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77070392;
 //BA.debugLineNum = 77070392;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=77070393;
 //BA.debugLineNum = 77070393;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=77070395;
 //BA.debugLineNum = 77070395;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=77070398;
 //BA.debugLineNum = 77070398;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=77070401;
 //BA.debugLineNum = 77070401;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=77070402;
 //BA.debugLineNum = 77070402;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=77135872;
 //BA.debugLineNum = 77135872;BA.debugLine="Public Sub LoadSQLiteDB4(SQLite As SQL, Query As S";
RDebugUtils.currentLine=77135873;
 //BA.debugLineNum = 77135873;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=77135875;
 //BA.debugLineNum = 77135875;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=77135877;
 //BA.debugLineNum = 77135877;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=77135878;
 //BA.debugLineNum = 77135878;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=77135879;
 //BA.debugLineNum = 77135879;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=77135881;
 //BA.debugLineNum = 77135881;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=77135882;
 //BA.debugLineNum = 77135882;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77135883;
 //BA.debugLineNum = 77135883;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77135884;
 //BA.debugLineNum = 77135884;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77135885;
 //BA.debugLineNum = 77135885;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=77135886;
 //BA.debugLineNum = 77135886;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=77135887;
 //BA.debugLineNum = 77135887;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=77135889;
 //BA.debugLineNum = 77135889;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=77135891;
 //BA.debugLineNum = 77135891;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=77135892;
 //BA.debugLineNum = 77135892;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=77135893;
 //BA.debugLineNum = 77135893;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=77135894;
 //BA.debugLineNum = 77135894;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77135895;
 //BA.debugLineNum = 77135895;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77135896;
 //BA.debugLineNum = 77135896;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=77135898;
 //BA.debugLineNum = 77135898;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77135899;
 //BA.debugLineNum = 77135899;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=77135901;
 //BA.debugLineNum = 77135901;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=77135903;
 //BA.debugLineNum = 77135903;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=77135904;
 //BA.debugLineNum = 77135904;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=77135905;
 //BA.debugLineNum = 77135905;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77135906;
 //BA.debugLineNum = 77135906;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77135907;
 //BA.debugLineNum = 77135907;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=77135908;
 //BA.debugLineNum = 77135908;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=77135909;
 //BA.debugLineNum = 77135909;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=77135910;
 //BA.debugLineNum = 77135910;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=77135911;
 //BA.debugLineNum = 77135911;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=77135913;
 //BA.debugLineNum = 77135913;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77135914;
 //BA.debugLineNum = 77135914;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=77135916;
 //BA.debugLineNum = 77135916;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=77135919;
 //BA.debugLineNum = 77135919;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=77135923;
 //BA.debugLineNum = 77135923;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=77135924;
 //BA.debugLineNum = 77135924;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=77135928;
 //BA.debugLineNum = 77135928;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=77135930;
 //BA.debugLineNum = 77135930;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=77135931;
 //BA.debugLineNum = 77135931;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=77135932;
 //BA.debugLineNum = 77135932;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=77135933;
 //BA.debugLineNum = 77135933;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77135934;
 //BA.debugLineNum = 77135934;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77135935;
 //BA.debugLineNum = 77135935;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=77135936;
 //BA.debugLineNum = 77135936;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=77135937;
 //BA.debugLineNum = 77135937;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=77135938;
 //BA.debugLineNum = 77135938;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=77135939;
 //BA.debugLineNum = 77135939;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=77135941;
 //BA.debugLineNum = 77135941;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=77135943;
 //BA.debugLineNum = 77135943;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=77135946;
 //BA.debugLineNum = 77135946;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=77135947;
 //BA.debugLineNum = 77135947;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=77201408;
 //BA.debugLineNum = 77201408;BA.debugLine="Public Sub LoadSQLiteDB5(SQLite As SQL, Query As S";
RDebugUtils.currentLine=77201409;
 //BA.debugLineNum = 77201409;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=77201411;
 //BA.debugLineNum = 77201411;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=77201413;
 //BA.debugLineNum = 77201413;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=77201414;
 //BA.debugLineNum = 77201414;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=77201415;
 //BA.debugLineNum = 77201415;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=77201417;
 //BA.debugLineNum = 77201417;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=77201418;
 //BA.debugLineNum = 77201418;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77201419;
 //BA.debugLineNum = 77201419;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77201420;
 //BA.debugLineNum = 77201420;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77201421;
 //BA.debugLineNum = 77201421;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=77201422;
 //BA.debugLineNum = 77201422;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=77201423;
 //BA.debugLineNum = 77201423;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=77201425;
 //BA.debugLineNum = 77201425;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=77201427;
 //BA.debugLineNum = 77201427;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=77201428;
 //BA.debugLineNum = 77201428;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=77201429;
 //BA.debugLineNum = 77201429;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=77201430;
 //BA.debugLineNum = 77201430;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77201431;
 //BA.debugLineNum = 77201431;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=77201432;
 //BA.debugLineNum = 77201432;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=77201434;
 //BA.debugLineNum = 77201434;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77201435;
 //BA.debugLineNum = 77201435;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=77201437;
 //BA.debugLineNum = 77201437;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=77201439;
 //BA.debugLineNum = 77201439;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=77201440;
 //BA.debugLineNum = 77201440;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=77201441;
 //BA.debugLineNum = 77201441;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77201442;
 //BA.debugLineNum = 77201442;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77201443;
 //BA.debugLineNum = 77201443;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=77201444;
 //BA.debugLineNum = 77201444;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=77201445;
 //BA.debugLineNum = 77201445;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=77201446;
 //BA.debugLineNum = 77201446;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=77201447;
 //BA.debugLineNum = 77201447;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=77201449;
 //BA.debugLineNum = 77201449;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=77201450;
 //BA.debugLineNum = 77201450;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=77201452;
 //BA.debugLineNum = 77201452;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=77201455;
 //BA.debugLineNum = 77201455;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=77201459;
 //BA.debugLineNum = 77201459;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=77201460;
 //BA.debugLineNum = 77201460;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=77201464;
 //BA.debugLineNum = 77201464;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=77201466;
 //BA.debugLineNum = 77201466;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=77201467;
 //BA.debugLineNum = 77201467;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=77201468;
 //BA.debugLineNum = 77201468;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=77201469;
 //BA.debugLineNum = 77201469;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=77201470;
 //BA.debugLineNum = 77201470;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=77201471;
 //BA.debugLineNum = 77201471;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=77201472;
 //BA.debugLineNum = 77201472;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=77201473;
 //BA.debugLineNum = 77201473;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=77201474;
 //BA.debugLineNum = 77201474;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=77201475;
 //BA.debugLineNum = 77201475;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=77201477;
 //BA.debugLineNum = 77201477;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=77201479;
 //BA.debugLineNum = 77201479;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=77201482;
 //BA.debugLineNum = 77201482;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=77201483;
 //BA.debugLineNum = 77201483;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71499776;
 //BA.debugLineNum = 71499776;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
RDebugUtils.currentLine=71499778;
 //BA.debugLineNum = 71499778;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71499779;
 //BA.debugLineNum = 71499779;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=71499781;
 //BA.debugLineNum = 71499781;BA.debugLine="cAutomaticWidths = False";
__ref._cautomaticwidths /*boolean*/  = __c.False;
RDebugUtils.currentLine=71499783;
 //BA.debugLineNum = 71499783;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=71499784;
 //BA.debugLineNum = 71499784;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71499785;
 //BA.debugLineNum = 71499785;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
RDebugUtils.currentLine=71499786;
 //BA.debugLineNum = 71499786;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=71499787;
 //BA.debugLineNum = 71499787;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_headers.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=71499788;
 //BA.debugLineNum = 71499788;BA.debugLine="h(i) = headers.Get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=71499791;
 //BA.debugLineNum = 71499791;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(","));
RDebugUtils.currentLine=71499792;
 //BA.debugLineNum = 71499792;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=71499793;
 //BA.debugLineNum = 71499793;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=71499794;
 //BA.debugLineNum = 71499794;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=71499795;
 //BA.debugLineNum = 71499795;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=71499796;
 //BA.debugLineNum = 71499796;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=71499799;
 //BA.debugLineNum = 71499799;BA.debugLine="innerClearAll(h.Length, True)";
__ref._innerclearall /*String*/ (null,_h.length,__c.True);
RDebugUtils.currentLine=71499800;
 //BA.debugLineNum = 71499800;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=71499801;
 //BA.debugLineNum = 71499801;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=71499802;
 //BA.debugLineNum = 71499802;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=71499803;
 //BA.debugLineNum = 71499803;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=71499804;
 //BA.debugLineNum = 71499804;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=71499805;
 //BA.debugLineNum = 71499805;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
RDebugUtils.currentLine=71499806;
 //BA.debugLineNum = 71499806;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=71499807;
 //BA.debugLineNum = 71499807;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=71499808;
 //BA.debugLineNum = 71499808;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=71499811;
 //BA.debugLineNum = 71499811;BA.debugLine="SetHeader(h)";
__ref._setheader /*String*/ (null,_h);
RDebugUtils.currentLine=71499812;
 //BA.debugLineNum = 71499812;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=71499816;
 //BA.debugLineNum = 71499816;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=71499818;
 //BA.debugLineNum = 71499818;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=71499819;
 //BA.debugLineNum = 71499819;BA.debugLine="Dim Row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
RDebugUtils.currentLine=71499820;
 //BA.debugLineNum = 71499820;BA.debugLine="Row = List1.Get(i)";
_row = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=71499821;
 //BA.debugLineNum = 71499821;BA.debugLine="AddRow(Row)";
__ref._addrow /*String*/ (null,_row);
 }
};
RDebugUtils.currentLine=71499823;
 //BA.debugLineNum = 71499823;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71565312;
 //BA.debugLineNum = 71565312;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
RDebugUtils.currentLine=71565314;
 //BA.debugLineNum = 71565314;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71565316;
 //BA.debugLineNum = 71565316;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=71565318;
 //BA.debugLineNum = 71565318;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=71565319;
 //BA.debugLineNum = 71565319;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=71565320;
 //BA.debugLineNum = 71565320;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_lstheaders);
RDebugUtils.currentLine=71565321;
 //BA.debugLineNum = 71565321;BA.debugLine="Dim Headers(lstHeaders.Size) As String";
_headers = new String[_lstheaders.getSize()];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=71565322;
 //BA.debugLineNum = 71565322;BA.debugLine="For i = 0 To lstHeaders.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lstheaders.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=71565323;
 //BA.debugLineNum = 71565323;BA.debugLine="Headers(i) = lstHeaders.Get(i)";
_headers[_i] = BA.ObjectToString(_lstheaders.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=71565326;
 //BA.debugLineNum = 71565326;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));
RDebugUtils.currentLine=71565327;
 //BA.debugLineNum = 71565327;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=71565328;
 //BA.debugLineNum = 71565328;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=71565329;
 //BA.debugLineNum = 71565329;BA.debugLine="Dim Headers(firstRow.Length) As String";
_headers = new String[_firstrow.length];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=71565330;
 //BA.debugLineNum = 71565330;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=71565331;
 //BA.debugLineNum = 71565331;BA.debugLine="Headers(i) = \"Col\" & (i + 1)";
_headers[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=71565334;
 //BA.debugLineNum = 71565334;BA.debugLine="innerClearAll(Headers.Length, True)";
__ref._innerclearall /*String*/ (null,_headers.length,__c.True);
RDebugUtils.currentLine=71565335;
 //BA.debugLineNum = 71565335;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=71565336;
 //BA.debugLineNum = 71565336;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=71565337;
 //BA.debugLineNum = 71565337;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=71565338;
 //BA.debugLineNum = 71565338;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=71565340;
 //BA.debugLineNum = 71565340;BA.debugLine="Dim col, Row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=71565341;
 //BA.debugLineNum = 71565341;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=71565342;
 //BA.debugLineNum = 71565342;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step26 = 1;
final int limit26 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit26 ;_col = _col + step26 ) {
RDebugUtils.currentLine=71565343;
 //BA.debugLineNum = 71565343;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=71565344;
 //BA.debugLineNum = 71565344;BA.debugLine="ColumnWidths(col) = SV2.Width / mNumberOfColumn";
__ref._columnwidths /*int[]*/ [_col] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=71565345;
 //BA.debugLineNum = 71565345;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
__ref._headerwidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
RDebugUtils.currentLine=71565346;
 //BA.debugLineNum = 71565346;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
__ref._datawidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
 }
};
 }else {
RDebugUtils.currentLine=71565349;
 //BA.debugLineNum = 71565349;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=71565350;
 //BA.debugLineNum = 71565350;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=71565351;
 //BA.debugLineNum = 71565351;BA.debugLine="strRow = List1.Get(col)";
_strrow = (String[])(_list1.Get(_col));
RDebugUtils.currentLine=71565352;
 //BA.debugLineNum = 71565352;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=71565353;
 //BA.debugLineNum = 71565353;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit37 ;_col = _col + step37 ) {
RDebugUtils.currentLine=71565354;
 //BA.debugLineNum = 71565354;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=71565357;
 //BA.debugLineNum = 71565357;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=71565358;
 //BA.debugLineNum = 71565358;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=71565362;
 //BA.debugLineNum = 71565362;BA.debugLine="For Row = 0 To List1.Size - 1";
{
final int step46 = 1;
final int limit46 = (int) (_list1.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit46 ;_row = _row + step46 ) {
RDebugUtils.currentLine=71565363;
 //BA.debugLineNum = 71565363;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=71565364;
 //BA.debugLineNum = 71565364;BA.debugLine="strRow = List1.Get(Row)";
_strrow = (String[])(_list1.Get(_row));
RDebugUtils.currentLine=71565365;
 //BA.debugLineNum = 71565365;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=71565366;
 //BA.debugLineNum = 71565366;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=71565367;
 //BA.debugLineNum = 71565367;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=71565370;
 //BA.debugLineNum = 71565370;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step54 = 1;
final int limit54 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit54 ;_col = _col + step54 ) {
RDebugUtils.currentLine=71565371;
 //BA.debugLineNum = 71565371;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 };
 }
};
RDebugUtils.currentLine=71565375;
 //BA.debugLineNum = 71565375;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=71565376;
 //BA.debugLineNum = 71565376;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=71565377;
 //BA.debugLineNum = 71565377;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }
};
 };
RDebugUtils.currentLine=71565381;
 //BA.debugLineNum = 71565381;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=71565382;
 //BA.debugLineNum = 71565382;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=71565386;
 //BA.debugLineNum = 71565386;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=71565388;
 //BA.debugLineNum = 71565388;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step67 = 1;
final int limit67 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=71565389;
 //BA.debugLineNum = 71565389;BA.debugLine="Dim strRow() As String";
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=71565390;
 //BA.debugLineNum = 71565390;BA.debugLine="strRow = List1.Get(i)";
_strrow = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=71565391;
 //BA.debugLineNum = 71565391;BA.debugLine="AddRow(strRow)";
__ref._addrow /*String*/ (null,_strrow);
 }
};
RDebugUtils.currentLine=71565394;
 //BA.debugLineNum = 71565394;BA.debugLine="End Sub";
return "";
}
public String  _pnlfastscroll_touch(b4a.example.ef.table __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "pnlfastscroll_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlfastscroll_touch", new Object[] {_action,_x,_y}));}
int _top = 0;
int _sv2top = 0;
RDebugUtils.currentLine=74448896;
 //BA.debugLineNum = 74448896;BA.debugLine="Private Sub pnlFastScroll_Touch (Action As Int, X";
RDebugUtils.currentLine=74448897;
 //BA.debugLineNum = 74448897;BA.debugLine="Select Action";
switch (_action) {
case 0: {
RDebugUtils.currentLine=74448899;
 //BA.debugLineNum = 74448899;BA.debugLine="If Y >= pnlFastScrollCursor.Top And Y <= pnlFas";
if (_y>=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop() && _y<=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=74448900;
 //BA.debugLineNum = 74448900;BA.debugLine="FSY0 = pnlFastScrollCursor.Top";
__ref._fsy0 /*int*/  = __ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=74448901;
 //BA.debugLineNum = 74448901;BA.debugLine="FSdY = Y - FSY0";
__ref._fsdy /*int*/  = (int) (_y-__ref._fsy0 /*int*/ );
RDebugUtils.currentLine=74448902;
 //BA.debugLineNum = 74448902;BA.debugLine="FastScrollActive = True";
__ref._fastscrollactive /*boolean*/  = __c.True;
 };
 break; }
case 2: {
RDebugUtils.currentLine=74448905;
 //BA.debugLineNum = 74448905;BA.debugLine="If FastScrollActive = True Then";
if (__ref._fastscrollactive /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=74448906;
 //BA.debugLineNum = 74448906;BA.debugLine="Private Top, SV2Top As Int";
_top = 0;
_sv2top = 0;
RDebugUtils.currentLine=74448907;
 //BA.debugLineNum = 74448907;BA.debugLine="Top = Max(Y - FSdY, 0)";
_top = (int) (__c.Max(_y-__ref._fsdy /*int*/ ,0));
RDebugUtils.currentLine=74448908;
 //BA.debugLineNum = 74448908;BA.debugLine="Top = Min(Top, pnlFastScroll.Height - pnlFastS";
_top = (int) (__c.Min(_top,__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=74448909;
 //BA.debugLineNum = 74448909;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=74448910;
 //BA.debugLineNum = 74448910;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=74448911;
 //BA.debugLineNum = 74448911;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top +";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=74448913;
 //BA.debugLineNum = 74448913;BA.debugLine="SV2Top = Top / FScScale";
_sv2top = (int) (_top/(double)__ref._fscscale /*double*/ );
RDebugUtils.currentLine=74448914;
 //BA.debugLineNum = 74448914;BA.debugLine="SV2.VerticalScrollPosition = SV2Top";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_sv2top);
 };
 break; }
case 1: {
RDebugUtils.currentLine=74448917;
 //BA.debugLineNum = 74448917;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=74448919;
 //BA.debugLineNum = 74448919;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=72220672;
 //BA.debugLineNum = 72220672;BA.debugLine="Public Sub RefreshLabels";
RDebugUtils.currentLine=72220673;
 //BA.debugLineNum = 72220673;BA.debugLine="Private i, j As Int";
_i = 0;
_j = 0;
RDebugUtils.currentLine=72220675;
 //BA.debugLineNum = 72220675;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=72220676;
 //BA.debugLineNum = 72220676;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step3 = 1;
final int limit3 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=72220677;
 //BA.debugLineNum = 72220677;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=72220680;
 //BA.debugLineNum = 72220680;BA.debugLine="If cTypeFaces.Length < mNumberOfColumns Then";
if (__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=72220681;
 //BA.debugLineNum = 72220681;BA.debugLine="Private cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=72220682;
 //BA.debugLineNum = 72220682;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
RDebugUtils.currentLine=72220683;
 //BA.debugLineNum = 72220683;BA.debugLine="cTypeFaces(j) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }
};
 };
RDebugUtils.currentLine=72220687;
 //BA.debugLineNum = 72220687;BA.debugLine="If cTextColors.Length < mNumberOfColumns Then";
if (__ref._ctextcolors /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=72220688;
 //BA.debugLineNum = 72220688;BA.debugLine="Private cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=72220689;
 //BA.debugLineNum = 72220689;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit14 ;_j = _j + step14 ) {
RDebugUtils.currentLine=72220690;
 //BA.debugLineNum = 72220690;BA.debugLine="cTextColors(j) = cTextColor";
__ref._ctextcolors /*int[]*/ [_j] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=72220693;
 //BA.debugLineNum = 72220693;BA.debugLine="For i = 0 To LabelsCache.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=72220694;
 //BA.debugLineNum = 72220694;BA.debugLine="Private lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=72220695;
 //BA.debugLineNum = 72220695;BA.debugLine="lbls = LabelsCache.Get(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=72220696;
 //BA.debugLineNum = 72220696;BA.debugLine="For j = 0 To lbls.Length - 1";
{
final int step21 = 1;
final int limit21 = (int) (_lbls.length-1);
_j = (int) (0) ;
for (;_j <= limit21 ;_j = _j + step21 ) {
RDebugUtils.currentLine=72220697;
 //BA.debugLineNum = 72220697;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=72220698;
 //BA.debugLineNum = 72220698;BA.debugLine="lbls(j).Typeface = cTypeFaces(j)";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j].getObject()));
RDebugUtils.currentLine=72220699;
 //BA.debugLineNum = 72220699;BA.debugLine="lbls(j).TextColor = cTextColors(j)";
_lbls[_j].setTextColor(__ref._ctextcolors /*int[]*/ [_j]);
 }else {
RDebugUtils.currentLine=72220701;
 //BA.debugLineNum = 72220701;BA.debugLine="lbls(j).Typeface = cTypeFace";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=72220702;
 //BA.debugLineNum = 72220702;BA.debugLine="lbls(j).TextColor = cTextColor";
_lbls[_j].setTextColor(__ref._ctextcolor /*int*/ );
 };
 }
};
 }
};
RDebugUtils.currentLine=72220707;
 //BA.debugLineNum = 72220707;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all";
{
final int step31 = 1;
final int limit31 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=72220708;
 //BA.debugLineNum = 72220708;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=72220710;
 //BA.debugLineNum = 72220710;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=79626240;
 //BA.debugLineNum = 79626240;BA.debugLine="Private Sub RemoveAccents(s As String) As String";
RDebugUtils.currentLine=79626241;
 //BA.debugLineNum = 79626241;BA.debugLine="Dim normalizer As JavaObject";
_normalizer = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=79626242;
 //BA.debugLineNum = 79626242;BA.debugLine="normalizer.InitializeStatic(\"java.text.Normalizer";
_normalizer.InitializeStatic("java.text.Normalizer");
RDebugUtils.currentLine=79626243;
 //BA.debugLineNum = 79626243;BA.debugLine="Dim n As String = normalizer.RunMethod(\"normalize";
_n = BA.ObjectToString(_normalizer.RunMethod("normalize",new Object[]{(Object)(_s),(Object)("NFD")}));
RDebugUtils.currentLine=79626244;
 //BA.debugLineNum = 79626244;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=79626245;
 //BA.debugLineNum = 79626245;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=79626246;
 //BA.debugLineNum = 79626246;BA.debugLine="For i = 0 To n.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_n.length()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=79626247;
 //BA.debugLineNum = 79626247;BA.debugLine="If Regex.IsMatch(\"\\p{InCombiningDiacriticalMarks";
if (__c.Regex.IsMatch("\\p{InCombiningDiacriticalMarks}",BA.ObjectToString(_n.charAt(_i)))==__c.False) { 
RDebugUtils.currentLine=79626248;
 //BA.debugLineNum = 79626248;BA.debugLine="sb.Append(n.CharAt(i))";
_sb.Append(BA.ObjectToString(_n.charAt(_i)));
 };
 }
};
RDebugUtils.currentLine=79626251;
 //BA.debugLineNum = 79626251;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=79626252;
 //BA.debugLineNum = 79626252;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71761920;
 //BA.debugLineNum = 71761920;BA.debugLine="Public Sub RemoveRow(Row As Int)";
RDebugUtils.currentLine=71761921;
 //BA.debugLineNum = 71761921;BA.debugLine="If (Row <0 Or Row > Data.Size-1) Then Return ' ca";
if ((_row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
if (true) return "";};
RDebugUtils.currentLine=71761923;
 //BA.debugLineNum = 71761923;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=71761927;
 //BA.debugLineNum = 71761927;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=71761928;
 //BA.debugLineNum = 71761928;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rm";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=71761930;
 //BA.debugLineNum = 71761930;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step5 = 1;
final int limit5 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=71761931;
 //BA.debugLineNum = 71761931;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=71761932;
 //BA.debugLineNum = 71761932;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=71761933;
 //BA.debugLineNum = 71761933;BA.debugLine="If (keepSel > Row) Then";
if ((_keepsel>_row)) { 
RDebugUtils.currentLine=71761934;
 //BA.debugLineNum = 71761934;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel-1));
 };
 }
};
RDebugUtils.currentLine=71761939;
 //BA.debugLineNum = 71761939;BA.debugLine="If (prevIndex <> -1) Then";
if ((_previndex!=-1)) { 
RDebugUtils.currentLine=71761941;
 //BA.debugLineNum = 71761941;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=71761944;
 //BA.debugLineNum = 71761944;BA.debugLine="Data.RemoveAt(Row)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=71761945;
 //BA.debugLineNum = 71761945;BA.debugLine="lstRowColorIndexes.RemoveAt(Row)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=71761946;
 //BA.debugLineNum = 71761946;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step17 = 1;
final int limit17 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=71761947;
 //BA.debugLineNum = 71761947;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=71761958;
 //BA.debugLineNum = 71761958;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=71761959;
 //BA.debugLineNum = 71761959;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
__ref._maxvisiblerow /*int*/  = (int) (__c.Min(__ref._maxvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=71761960;
 //BA.debugLineNum = 71761960;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
__ref._minvisiblerow /*int*/  = (int) (__c.Min(__ref._minvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=71761961;
 //BA.debugLineNum = 71761961;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
{
final int step23 = 1;
final int limit23 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=71761963;
 //BA.debugLineNum = 71761963;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
 };
RDebugUtils.currentLine=71761967;
 //BA.debugLineNum = 71761967;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=71761968;
 //BA.debugLineNum = 71761968;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=71761969;
 //BA.debugLineNum = 71761969;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=71761971;
 //BA.debugLineNum = 71761971;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=71761972;
 //BA.debugLineNum = 71761972;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=71761973;
 //BA.debugLineNum = 71761973;BA.debugLine="End Sub";
return "";
}
public String  _removerowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removerowcolorn", false))
	 {return ((String) Debug.delegate(ba, "removerowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=75628544;
 //BA.debugLineNum = 75628544;BA.debugLine="Public Sub RemoveRowColorN(Row As Int)";
RDebugUtils.currentLine=75628545;
 //BA.debugLineNum = 75628545;BA.debugLine="If Row > -1 And Row <lstRowColorIndexes.Size Then";
if (_row>-1 && _row<__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=75628546;
 //BA.debugLineNum = 75628546;BA.debugLine="lstRowColorIndexes.Set(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(0));
RDebugUtils.currentLine=75628547;
 //BA.debugLineNum = 75628547;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=75628548;
 //BA.debugLineNum = 75628548;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
 };
RDebugUtils.currentLine=75628551;
 //BA.debugLineNum = 75628551;BA.debugLine="End Sub";
return "";
}
public String  _removeview(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removeview", false))
	 {return ((String) Debug.delegate(ba, "removeview", null));}
RDebugUtils.currentLine=77332480;
 //BA.debugLineNum = 77332480;BA.debugLine="Public Sub RemoveView";
RDebugUtils.currentLine=77332481;
 //BA.debugLineNum = 77332481;BA.debugLine="pnlTable.RemoveView";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=77332482;
 //BA.debugLineNum = 77332482;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=82313216;
 //BA.debugLineNum = 82313216;BA.debugLine="Sub ReverseIndexDouble(arrDouble() As Double, arrI";
RDebugUtils.currentLine=82313218;
 //BA.debugLineNum = 82313218;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=82313219;
 //BA.debugLineNum = 82313219;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=82313220;
 //BA.debugLineNum = 82313220;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=82313221;
 //BA.debugLineNum = 82313221;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=82313222;
 //BA.debugLineNum = 82313222;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=82313223;
 //BA.debugLineNum = 82313223;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=82313224;
 //BA.debugLineNum = 82313224;BA.debugLine="Dim arrIndex2(arrDouble.Length) As Int";
_arrindex2 = new int[_arrdouble.length];
;
RDebugUtils.currentLine=82313226;
 //BA.debugLineNum = 82313226;BA.debugLine="iUB = arrDouble.Length - 1";
_iub = (int) (_arrdouble.length-1);
RDebugUtils.currentLine=82313228;
 //BA.debugLineNum = 82313228;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=82313230;
 //BA.debugLineNum = 82313230;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=82313231;
 //BA.debugLineNum = 82313231;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=82313233;
 //BA.debugLineNum = 82313233;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=82313235;
 //BA.debugLineNum = 82313235;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=82313236;
 //BA.debugLineNum = 82313236;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=82313237;
 //BA.debugLineNum = 82313237;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=82313239;
 //BA.debugLineNum = 82313239;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=82313241;
 //BA.debugLineNum = 82313241;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=82313242;
 //BA.debugLineNum = 82313242;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=82313243;
 //BA.debugLineNum = 82313243;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=82313244;
 //BA.debugLineNum = 82313244;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=82313245;
 //BA.debugLineNum = 82313245;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=82313246;
 //BA.debugLineNum = 82313246;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=82313247;
 //BA.debugLineNum = 82313247;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=82313249;
 //BA.debugLineNum = 82313249;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=82313252;
 //BA.debugLineNum = 82313252;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=82313253;
 //BA.debugLineNum = 82313253;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=82313254;
 //BA.debugLineNum = 82313254;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=82313255;
 //BA.debugLineNum = 82313255;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=82313256;
 //BA.debugLineNum = 82313256;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=82313258;
 //BA.debugLineNum = 82313258;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=82313260;
 //BA.debugLineNum = 82313260;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=82313266;
 //BA.debugLineNum = 82313266;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=82313268;
 //BA.debugLineNum = 82313268;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=82247680;
 //BA.debugLineNum = 82247680;BA.debugLine="Sub ReverseIndexLong(arrLong() As Long, arrIndex()";
RDebugUtils.currentLine=82247682;
 //BA.debugLineNum = 82247682;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=82247683;
 //BA.debugLineNum = 82247683;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=82247684;
 //BA.debugLineNum = 82247684;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=82247685;
 //BA.debugLineNum = 82247685;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=82247686;
 //BA.debugLineNum = 82247686;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=82247687;
 //BA.debugLineNum = 82247687;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=82247688;
 //BA.debugLineNum = 82247688;BA.debugLine="Dim arrIndex2(arrLong.Length) As Int";
_arrindex2 = new int[_arrlong.length];
;
RDebugUtils.currentLine=82247690;
 //BA.debugLineNum = 82247690;BA.debugLine="iUB = arrLong.Length - 1";
_iub = (int) (_arrlong.length-1);
RDebugUtils.currentLine=82247692;
 //BA.debugLineNum = 82247692;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=82247694;
 //BA.debugLineNum = 82247694;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=82247695;
 //BA.debugLineNum = 82247695;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=82247697;
 //BA.debugLineNum = 82247697;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=82247699;
 //BA.debugLineNum = 82247699;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=82247700;
 //BA.debugLineNum = 82247700;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=82247701;
 //BA.debugLineNum = 82247701;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=82247703;
 //BA.debugLineNum = 82247703;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=82247705;
 //BA.debugLineNum = 82247705;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=82247706;
 //BA.debugLineNum = 82247706;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=82247707;
 //BA.debugLineNum = 82247707;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=82247708;
 //BA.debugLineNum = 82247708;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=82247709;
 //BA.debugLineNum = 82247709;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=82247710;
 //BA.debugLineNum = 82247710;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=82247711;
 //BA.debugLineNum = 82247711;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=82247713;
 //BA.debugLineNum = 82247713;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=82247716;
 //BA.debugLineNum = 82247716;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=82247717;
 //BA.debugLineNum = 82247717;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=82247718;
 //BA.debugLineNum = 82247718;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=82247719;
 //BA.debugLineNum = 82247719;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=82247720;
 //BA.debugLineNum = 82247720;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=82247722;
 //BA.debugLineNum = 82247722;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=82247724;
 //BA.debugLineNum = 82247724;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=82247730;
 //BA.debugLineNum = 82247730;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=82247732;
 //BA.debugLineNum = 82247732;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=82378752;
 //BA.debugLineNum = 82378752;BA.debugLine="Sub ReverseIndexString(arrString() As String, arrI";
RDebugUtils.currentLine=82378754;
 //BA.debugLineNum = 82378754;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=82378755;
 //BA.debugLineNum = 82378755;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=82378756;
 //BA.debugLineNum = 82378756;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=82378757;
 //BA.debugLineNum = 82378757;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=82378758;
 //BA.debugLineNum = 82378758;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=82378759;
 //BA.debugLineNum = 82378759;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=82378760;
 //BA.debugLineNum = 82378760;BA.debugLine="Dim arrIndex2(arrString.Length) As Int";
_arrindex2 = new int[_arrstring.length];
;
RDebugUtils.currentLine=82378762;
 //BA.debugLineNum = 82378762;BA.debugLine="iUB = arrString.Length - 1";
_iub = (int) (_arrstring.length-1);
RDebugUtils.currentLine=82378764;
 //BA.debugLineNum = 82378764;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=82378766;
 //BA.debugLineNum = 82378766;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=82378767;
 //BA.debugLineNum = 82378767;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=82378769;
 //BA.debugLineNum = 82378769;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=82378771;
 //BA.debugLineNum = 82378771;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=82378772;
 //BA.debugLineNum = 82378772;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=82378773;
 //BA.debugLineNum = 82378773;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i+1)]]);
 }else {
RDebugUtils.currentLine=82378775;
 //BA.debugLineNum = 82378775;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i-1)]]);
 };
RDebugUtils.currentLine=82378777;
 //BA.debugLineNum = 82378777;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=82378778;
 //BA.debugLineNum = 82378778;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=82378779;
 //BA.debugLineNum = 82378779;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=82378780;
 //BA.debugLineNum = 82378780;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=82378781;
 //BA.debugLineNum = 82378781;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=82378782;
 //BA.debugLineNum = 82378782;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=82378783;
 //BA.debugLineNum = 82378783;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=82378785;
 //BA.debugLineNum = 82378785;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=82378788;
 //BA.debugLineNum = 82378788;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=82378789;
 //BA.debugLineNum = 82378789;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=82378790;
 //BA.debugLineNum = 82378790;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=82378791;
 //BA.debugLineNum = 82378791;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=82378792;
 //BA.debugLineNum = 82378792;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=82378795;
 //BA.debugLineNum = 82378795;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=82378797;
 //BA.debugLineNum = 82378797;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=82378803;
 //BA.debugLineNum = 82378803;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=82378805;
 //BA.debugLineNum = 82378805;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71630848;
 //BA.debugLineNum = 71630848;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
RDebugUtils.currentLine=71630849;
 //BA.debugLineNum = 71630849;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=71630850;
 //BA.debugLineNum = 71630850;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=71630852;
 //BA.debugLineNum = 71630852;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=71630853;
 //BA.debugLineNum = 71630853;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=71630854;
 //BA.debugLineNum = 71630854;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=71630855;
 //BA.debugLineNum = 71630855;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=71630856;
 //BA.debugLineNum = 71630856;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=71630859;
 //BA.debugLineNum = 71630859;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=71630860;
 //BA.debugLineNum = 71630860;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=71630861;
 //BA.debugLineNum = 71630861;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=71630862;
 //BA.debugLineNum = 71630862;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=71630864;
 //BA.debugLineNum = 71630864;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=71630865;
 //BA.debugLineNum = 71630865;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=71630869;
 //BA.debugLineNum = 71630869;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, H";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(","),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=71630870;
 //BA.debugLineNum = 71630870;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=71696384;
 //BA.debugLineNum = 71696384;BA.debugLine="Public Sub SaveTableToCSV2(Dir As String, Filename";
RDebugUtils.currentLine=71696385;
 //BA.debugLineNum = 71696385;BA.debugLine="Dim headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=71696386;
 //BA.debugLineNum = 71696386;BA.debugLine="Private headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=71696387;
 //BA.debugLineNum = 71696387;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=71696389;
 //BA.debugLineNum = 71696389;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=71696390;
 //BA.debugLineNum = 71696390;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=71696391;
 //BA.debugLineNum = 71696391;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=71696392;
 //BA.debugLineNum = 71696392;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=71696393;
 //BA.debugLineNum = 71696393;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=71696396;
 //BA.debugLineNum = 71696396;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=71696397;
 //BA.debugLineNum = 71696397;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=71696398;
 //BA.debugLineNum = 71696398;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=71696399;
 //BA.debugLineNum = 71696399;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=71696401;
 //BA.debugLineNum = 71696401;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=71696402;
 //BA.debugLineNum = 71696402;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=71696406;
 //BA.debugLineNum = 71696406;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, SeparatorCha";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=71696407;
 //BA.debugLineNum = 71696407;BA.debugLine="End Sub";
return "";
}
public String  _scaletable(b4a.example.ef.table __ref,double _scalex,double _scaley,boolean _scalealldone) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "scaletable", false))
	 {return ((String) Debug.delegate(ba, "scaletable", new Object[] {_scalex,_scaley,_scalealldone}));}
int _i = 0;
RDebugUtils.currentLine=78839808;
 //BA.debugLineNum = 78839808;BA.debugLine="Public Sub ScaleTable(ScaleX As Double, ScaleY As";
RDebugUtils.currentLine=78839809;
 //BA.debugLineNum = 78839809;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=78839810;
 //BA.debugLineNum = 78839810;BA.debugLine="ToastMessageShow(\"Table.ScaleTable must be calle";
__c.ToastMessageShow(BA.ObjectToCharSequence("Table.ScaleTable must be called before filling the Table"),__c.False);
RDebugUtils.currentLine=78839811;
 //BA.debugLineNum = 78839811;BA.debugLine="Log(\"Table.ScaleTable must be called before fill";
__c.LogImpl("578839811","Table.ScaleTable must be called before filling the Table",0);
RDebugUtils.currentLine=78839812;
 //BA.debugLineNum = 78839812;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=78839815;
 //BA.debugLineNum = 78839815;BA.debugLine="cTextSize = cTextSize * Min(ScaleX, ScaleY)";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *__c.Min(_scalex,_scaley));
RDebugUtils.currentLine=78839816;
 //BA.debugLineNum = 78839816;BA.debugLine="cLineWidth = cLineWidth * ScaleX";
__ref._clinewidth /*int*/  = (int) (__ref._clinewidth /*int*/ *_scalex);
RDebugUtils.currentLine=78839817;
 //BA.debugLineNum = 78839817;BA.debugLine="ExtraWidth = ExtraWidth * ScaleX";
__ref._extrawidth /*int*/  = (int) (__ref._extrawidth /*int*/ *_scalex);
RDebugUtils.currentLine=78839818;
 //BA.debugLineNum = 78839818;BA.debugLine="cRowHeight  = cRowHeight * ScaleY";
__ref._crowheight /*int*/  = (int) (__ref._crowheight /*int*/ *_scaley);
RDebugUtils.currentLine=78839819;
 //BA.debugLineNum = 78839819;BA.debugLine="cHeaderHeight = cHeaderHeight * ScaleY";
__ref._cheaderheight /*int*/  = (int) (__ref._cheaderheight /*int*/ *_scaley);
RDebugUtils.currentLine=78839820;
 //BA.debugLineNum = 78839820;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=78839821;
 //BA.debugLineNum = 78839821;BA.debugLine="ColumnWidths(i) = ColumnWidths(i) * ScaleX";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._columnwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=78839822;
 //BA.debugLineNum = 78839822;BA.debugLine="DataWidths(i) = DataWidths(i) * ScaleX";
__ref._datawidths /*int[]*/ [_i] = (int) (__ref._datawidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=78839823;
 //BA.debugLineNum = 78839823;BA.debugLine="HeaderWidths(i) = HeaderWidths(i)	* ScaleX";
__ref._headerwidths /*int[]*/ [_i] = (int) (__ref._headerwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=78839824;
 //BA.debugLineNum = 78839824;BA.debugLine="SavedWidths(i) = SavedWidths(i)	* ScaleX";
__ref._savedwidths /*int[]*/ [_i] = (int) (__ref._savedwidths /*int[]*/ [_i]*_scalex);
 }
};
RDebugUtils.currentLine=78839827;
 //BA.debugLineNum = 78839827;BA.debugLine="If ScaleAllDone = False Then";
if (_scalealldone==__c.False) { 
RDebugUtils.currentLine=78839828;
 //BA.debugLineNum = 78839828;BA.debugLine="cLeft = cLeft * ScaleX";
__ref._cleft /*int*/  = (int) (__ref._cleft /*int*/ *_scalex);
RDebugUtils.currentLine=78839829;
 //BA.debugLineNum = 78839829;BA.debugLine="cTop = cTop * ScaleY";
__ref._ctop /*int*/  = (int) (__ref._ctop /*int*/ *_scaley);
RDebugUtils.currentLine=78839830;
 //BA.debugLineNum = 78839830;BA.debugLine="cWidth = cWidth * ScaleX";
__ref._cwidth /*int*/  = (int) (__ref._cwidth /*int*/ *_scalex);
RDebugUtils.currentLine=78839831;
 //BA.debugLineNum = 78839831;BA.debugLine="cHeight = cHeight * ScaleY";
__ref._cheight /*int*/  = (int) (__ref._cheight /*int*/ *_scaley);
RDebugUtils.currentLine=78839833;
 //BA.debugLineNum = 78839833;BA.debugLine="cTextSize = cTextSize * ScaleY";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *_scaley);
RDebugUtils.currentLine=78839834;
 //BA.debugLineNum = 78839834;BA.debugLine="pnlTable.Left = cLeft";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._cleft /*int*/ );
RDebugUtils.currentLine=78839835;
 //BA.debugLineNum = 78839835;BA.debugLine="pnlTable.Top = cTop";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._ctop /*int*/ );
RDebugUtils.currentLine=78839836;
 //BA.debugLineNum = 78839836;BA.debugLine="pnlTable.Width = cWidth";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._cwidth /*int*/ );
RDebugUtils.currentLine=78839837;
 //BA.debugLineNum = 78839837;BA.debugLine="pnlTable.Height = cHeight";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheight /*int*/ );
RDebugUtils.currentLine=78839838;
 //BA.debugLineNum = 78839838;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=78839839;
 //BA.debugLineNum = 78839839;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=78839840;
 //BA.debugLineNum = 78839840;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=78839841;
 //BA.debugLineNum = 78839841;BA.debugLine="SV2.Width = cWidth";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(__ref._cwidth /*int*/ );
 }else {
RDebugUtils.currentLine=78839843;
 //BA.debugLineNum = 78839843;BA.debugLine="SVF.Width = SVF.Width * ScaleX";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=78839844;
 //BA.debugLineNum = 78839844;BA.debugLine="SV2.Width = SV2.Width * ScaleX";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=78839845;
 //BA.debugLineNum = 78839845;BA.debugLine="SV2.Left = SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=78839847;
 //BA.debugLineNum = 78839847;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=78839848;
 //BA.debugLineNum = 78839848;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=78839849;
 //BA.debugLineNum = 78839849;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=78839850;
 //BA.debugLineNum = 78839850;BA.debugLine="SV2.Height = cHeight - cStatusLineHeight - cHea";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=78839851;
 //BA.debugLineNum = 78839851;BA.debugLine="SVF.Height = cHeight - cStatusLineHeight - cHea";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=78839853;
 //BA.debugLineNum = 78839853;BA.debugLine="SV2.Height = cHeight - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=78839854;
 //BA.debugLineNum = 78839854;BA.debugLine="SVF.Height = cHeight - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=78839856;
 //BA.debugLineNum = 78839856;BA.debugLine="lblFastScroll.Width = lblFastScroll.Width * Scal";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=78839857;
 //BA.debugLineNum = 78839857;BA.debugLine="lblFastScroll.Height = lblFastScroll.Height * Sc";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()*_scaley));
RDebugUtils.currentLine=78839859;
 //BA.debugLineNum = 78839859;BA.debugLine="lblFastScroll.TextSize = lblFastScroll.TextSize";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize()*_scaley));
RDebugUtils.currentLine=78839860;
 //BA.debugLineNum = 78839860;BA.debugLine="lblFastScroll.Left = lblFastScroll.Left * ScaleX";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getLeft()*_scalex));
RDebugUtils.currentLine=78839861;
 //BA.debugLineNum = 78839861;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=78839862;
 //BA.debugLineNum = 78839862;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=78839863;
 //BA.debugLineNum = 78839863;BA.debugLine="lblStatusLine.TextSize = cTextSize";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=78839864;
 //BA.debugLineNum = 78839864;BA.debugLine="lblStatusLine.Height = cStatusLineHeight";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._cstatuslineheight /*int*/ );
RDebugUtils.currentLine=78839865;
 //BA.debugLineNum = 78839865;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=78839867;
 //BA.debugLineNum = 78839867;BA.debugLine="CreateNewLabels";
__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
RDebugUtils.currentLine=78839868;
 //BA.debugLineNum = 78839868;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=70320128;
 //BA.debugLineNum = 70320128;BA.debugLine="Private Sub Scroll(PosX As Int, PosY As Int)";
RDebugUtils.currentLine=70320129;
 //BA.debugLineNum = 70320129;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
RDebugUtils.currentLine=70320130;
 //BA.debugLineNum = 70320130;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)__ref._crowheight /*int*/ -30));
RDebugUtils.currentLine=70320131;
 //BA.debugLineNum = 70320131;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV2.Heigh";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,(_posy+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=70320132;
 //BA.debugLineNum = 70320132;BA.debugLine="If minVisibleRow > -1 Then";
if (__ref._minvisiblerow /*int*/ >-1) { 
RDebugUtils.currentLine=70320133;
 //BA.debugLineNum = 70320133;BA.debugLine="If minVisibleRow < currentMin Then";
if (__ref._minvisiblerow /*int*/ <_currentmin) { 
RDebugUtils.currentLine=70320135;
 //BA.debugLineNum = 70320135;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,__ref._maxvisiblerow /*int*/ ));
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=70320136;
 //BA.debugLineNum = 70320136;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=70320138;
 //BA.debugLineNum = 70320138;BA.debugLine="Else If minVisibleRow > currentMin Then";
if (__ref._minvisiblerow /*int*/ >_currentmin) { 
RDebugUtils.currentLine=70320140;
 //BA.debugLineNum = 70320140;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(__ref._minvisiblerow /*int*/ -1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=70320141;
 //BA.debugLineNum = 70320141;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
RDebugUtils.currentLine=70320144;
 //BA.debugLineNum = 70320144;BA.debugLine="If maxVisibleRow > currentMax Then";
if (__ref._maxvisiblerow /*int*/ >_currentmax) { 
RDebugUtils.currentLine=70320146;
 //BA.debugLineNum = 70320146;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,__ref._minvisiblerow /*int*/ ));
_i = __ref._maxvisiblerow /*int*/  ;
for (;_i >= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=70320147;
 //BA.debugLineNum = 70320147;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=70320149;
 //BA.debugLineNum = 70320149;BA.debugLine="Else If maxVisibleRow < currentMax Then";
if (__ref._maxvisiblerow /*int*/ <_currentmax) { 
RDebugUtils.currentLine=70320151;
 //BA.debugLineNum = 70320151;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(__ref._maxvisiblerow /*int*/ +1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=70320152;
 //BA.debugLineNum = 70320152;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
 };
RDebugUtils.currentLine=70320156;
 //BA.debugLineNum = 70320156;BA.debugLine="minVisibleRow = currentMin";
__ref._minvisiblerow /*int*/  = _currentmin;
RDebugUtils.currentLine=70320157;
 //BA.debugLineNum = 70320157;BA.debugLine="maxVisibleRow = currentMax";
__ref._maxvisiblerow /*int*/  = _currentmax;
RDebugUtils.currentLine=70320158;
 //BA.debugLineNum = 70320158;BA.debugLine="Header.Left = -PosX + mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-_posx+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=70320159;
 //BA.debugLineNum = 70320159;BA.debugLine="lblStatusLine.Left = - PosX";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (-_posx));
RDebugUtils.currentLine=70320160;
 //BA.debugLineNum = 70320160;BA.debugLine="End Sub";
return "";
}
public String  _setallowselection(b4a.example.ef.table __ref,boolean _allowselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setallowselection", false))
	 {return ((String) Debug.delegate(ba, "setallowselection", new Object[] {_allowselection}));}
RDebugUtils.currentLine=72482816;
 //BA.debugLineNum = 72482816;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
RDebugUtils.currentLine=72482817;
 //BA.debugLineNum = 72482817;BA.debugLine="cAllowSelection = AllowSelection";
__ref._callowselection /*boolean*/  = _allowselection;
RDebugUtils.currentLine=72482818;
 //BA.debugLineNum = 72482818;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=72482819;
 //BA.debugLineNum = 72482819;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
 };
RDebugUtils.currentLine=72482821;
 //BA.debugLineNum = 72482821;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=78577664;
 //BA.debugLineNum = 78577664;BA.debugLine="Public Sub SetAutomaticWidths";
RDebugUtils.currentLine=78577665;
 //BA.debugLineNum = 78577665;BA.debugLine="Dim row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=78577666;
 //BA.debugLineNum = 78577666;BA.debugLine="Dim Vals(mNumberOfColumns) As String";
_vals = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_vals,"");
RDebugUtils.currentLine=78577667;
 //BA.debugLineNum = 78577667;BA.debugLine="Dim Width, Widths(mNumberOfColumns) As Int";
_width = 0;
_widths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=78577669;
 //BA.debugLineNum = 78577669;BA.debugLine="cAutomaticWidths = True";
__ref._cautomaticwidths /*boolean*/  = __c.True;
RDebugUtils.currentLine=78577671;
 //BA.debugLineNum = 78577671;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=78577672;
 //BA.debugLineNum = 78577672;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=78577673;
 //BA.debugLineNum = 78577673;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=78577675;
 //BA.debugLineNum = 78577675;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=78577678;
 //BA.debugLineNum = 78577678;BA.debugLine="For row = 0 To Data.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=78577679;
 //BA.debugLineNum = 78577679;BA.debugLine="Vals = Data.Get(row)";
_vals = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=78577680;
 //BA.debugLineNum = 78577680;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=78577681;
 //BA.debugLineNum = 78577681;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=78577683;
 //BA.debugLineNum = 78577683;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=78577685;
 //BA.debugLineNum = 78577685;BA.debugLine="If Widths(col) < Width Then";
if (_widths[_col]<_width) { 
RDebugUtils.currentLine=78577686;
 //BA.debugLineNum = 78577686;BA.debugLine="Widths(col) = Width";
_widths[_col] = _width;
 };
 }
};
 }
};
RDebugUtils.currentLine=78577690;
 //BA.debugLineNum = 78577690;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=78577691;
 //BA.debugLineNum = 78577691;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignment", false))
	 {return ((String) Debug.delegate(ba, "setcellalignment", new Object[] {_alignment}));}
int _i = 0;
RDebugUtils.currentLine=74186752;
 //BA.debugLineNum = 74186752;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
RDebugUtils.currentLine=74186753;
 //BA.debugLineNum = 74186753;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=74186755;
 //BA.debugLineNum = 74186755;BA.debugLine="cAlignment = Alignment";
__ref._calignment /*int*/  = _alignment;
RDebugUtils.currentLine=74186756;
 //BA.debugLineNum = 74186756;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=74186757;
 //BA.debugLineNum = 74186757;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=74186758;
 //BA.debugLineNum = 74186758;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
RDebugUtils.currentLine=74186760;
 //BA.debugLineNum = 74186760;BA.debugLine="MultiAlignments = False";
__ref._multialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=74186761;
 //BA.debugLineNum = 74186761;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=74186762;
 //BA.debugLineNum = 74186762;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=74186764;
 //BA.debugLineNum = 74186764;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setcellalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
RDebugUtils.currentLine=74252288;
 //BA.debugLineNum = 74252288;BA.debugLine="Public Sub SetCellAlignmentColN(Col As Int, Alignm";
RDebugUtils.currentLine=74252289;
 //BA.debugLineNum = 74252289;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=74252291;
 //BA.debugLineNum = 74252291;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=74252292;
 //BA.debugLineNum = 74252292;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=74252293;
 //BA.debugLineNum = 74252293;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=74252294;
 //BA.debugLineNum = 74252294;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=74252297;
 //BA.debugLineNum = 74252297;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=74252298;
 //BA.debugLineNum = 74252298;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=74252299;
 //BA.debugLineNum = 74252299;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=74252300;
 //BA.debugLineNum = 74252300;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=74252303;
 //BA.debugLineNum = 74252303;BA.debugLine="cAlignments(Col) = AlignmentColN";
__ref._calignments /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=74252304;
 //BA.debugLineNum = 74252304;BA.debugLine="cAlignments0 = cAlignments";
__ref._calignments0 /*int[]*/  = __ref._calignments /*int[]*/ ;
RDebugUtils.currentLine=74252306;
 //BA.debugLineNum = 74252306;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=74252307;
 //BA.debugLineNum = 74252307;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=74252308;
 //BA.debugLineNum = 74252308;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=74252310;
 //BA.debugLineNum = 74252310;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignments", false))
	 {return ((String) Debug.delegate(ba, "setcellalignments", new Object[] {_alignments}));}
RDebugUtils.currentLine=74121216;
 //BA.debugLineNum = 74121216;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
RDebugUtils.currentLine=74121217;
 //BA.debugLineNum = 74121217;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=74121218;
 //BA.debugLineNum = 74121218;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=74121219;
 //BA.debugLineNum = 74121219;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=74121222;
 //BA.debugLineNum = 74121222;BA.debugLine="cAlignments0 = Alignments";
__ref._calignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=74121223;
 //BA.debugLineNum = 74121223;BA.debugLine="cAlignments = cAlignments0";
__ref._calignments /*int[]*/  = __ref._calignments0 /*int[]*/ ;
RDebugUtils.currentLine=74121225;
 //BA.debugLineNum = 74121225;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=74121226;
 //BA.debugLineNum = 74121226;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=74121227;
 //BA.debugLineNum = 74121227;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=74121229;
 //BA.debugLineNum = 74121229;BA.debugLine="End Sub";
return "";
}
public String  _setcolumncolors(b4a.example.ef.table __ref,int[] _columncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setcolumncolors", new Object[] {_columncolors}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=77725696;
 //BA.debugLineNum = 77725696;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
RDebugUtils.currentLine=77725697;
 //BA.debugLineNum = 77725697;BA.debugLine="cColumnColors = ColumnColors";
__ref._ccolumncolors /*int[]*/  = _columncolors;
RDebugUtils.currentLine=77725699;
 //BA.debugLineNum = 77725699;BA.debugLine="Dim ColumnDrawables(cColumnColors.Length) As Obje";
_columndrawables = new Object[__ref._ccolumncolors /*int[]*/ .length];
{
int d0 = _columndrawables.length;
for (int i0 = 0;i0 < d0;i0++) {
_columndrawables[i0] = new Object();
}
}
;
RDebugUtils.currentLine=77725700;
 //BA.debugLineNum = 77725700;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=77725701;
 //BA.debugLineNum = 77725701;BA.debugLine="Private cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=77725702;
 //BA.debugLineNum = 77725702;BA.debugLine="cd.Initialize(cColumnColors(i), 0)";
_cd.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=77725703;
 //BA.debugLineNum = 77725703;BA.debugLine="ColumnDrawables(i) = cd";
__ref._columndrawables /*Object[]*/ [_i] = (Object)(_cd.getObject());
 }
};
RDebugUtils.currentLine=77725706;
 //BA.debugLineNum = 77725706;BA.debugLine="If ColumnColors.Length > 1 Then";
if (_columncolors.length>1) { 
RDebugUtils.currentLine=77725707;
 //BA.debugLineNum = 77725707;BA.debugLine="cUseColumnColors = True";
__ref._cusecolumncolors /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=77725709;
 //BA.debugLineNum = 77725709;BA.debugLine="cUseColumnColors = False";
__ref._cusecolumncolors /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=77725711;
 //BA.debugLineNum = 77725711;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=77725712;
 //BA.debugLineNum = 77725712;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=77725714;
 //BA.debugLineNum = 77725714;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatype(b4a.example.ef.table __ref,int _column,String _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatype", new Object[] {_column,_datatype}));}
RDebugUtils.currentLine=79036416;
 //BA.debugLineNum = 79036416;BA.debugLine="Public Sub SetColumnDataType(Column As Int, DataTy";
RDebugUtils.currentLine=79036417;
 //BA.debugLineNum = 79036417;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=79036418;
 //BA.debugLineNum = 79036418;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=79036419;
 //BA.debugLineNum = 79036419;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=79036422;
 //BA.debugLineNum = 79036422;BA.debugLine="If DataType <> \"T\" And DataType <> \"R\" And DataTy";
if ((_datatype).equals("T") == false && (_datatype).equals("R") == false && (_datatype).equals("I") == false) { 
RDebugUtils.currentLine=79036423;
 //BA.debugLineNum = 79036423;BA.debugLine="ToastMessageShow(\"Wrong data type only TEXT abd";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only TEXT abd NUMBER are allowed"),__c.False);
 }else {
RDebugUtils.currentLine=79036425;
 //BA.debugLineNum = 79036425;BA.debugLine="cColumnDataType(Column) = DataType";
__ref._ccolumndatatype /*String[]*/ [_column] = _datatype;
 };
RDebugUtils.currentLine=79036427;
 //BA.debugLineNum = 79036427;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatypes(b4a.example.ef.table __ref,String[] _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatypes", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatypes", new Object[] {_datatype}));}
int _col = 0;
RDebugUtils.currentLine=79167488;
 //BA.debugLineNum = 79167488;BA.debugLine="Public Sub SetColumnDataTypes(DataType() As String";
RDebugUtils.currentLine=79167489;
 //BA.debugLineNum = 79167489;BA.debugLine="If DataType.Length <> mNumberOfColumns Then";
if (_datatype.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=79167490;
 //BA.debugLineNum = 79167490;BA.debugLine="ToastMessageShow(\"Wrong number of columns\", Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong number of columns"),__c.False);
RDebugUtils.currentLine=79167491;
 //BA.debugLineNum = 79167491;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=79167494;
 //BA.debugLineNum = 79167494;BA.debugLine="For Col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=79167495;
 //BA.debugLineNum = 79167495;BA.debugLine="If DataType(Col) <> \"T\" And DataType(Col) <> \"R\"";
if ((_datatype[_col]).equals("T") == false && (_datatype[_col]).equals("R") == false && (_datatype[_col]).equals("I") == false) { 
RDebugUtils.currentLine=79167496;
 //BA.debugLineNum = 79167496;BA.debugLine="ToastMessageShow(\"Wrong data type only T, R and";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only T, R and I are allowed"),__c.False);
RDebugUtils.currentLine=79167497;
 //BA.debugLineNum = 79167497;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=79167501;
 //BA.debugLineNum = 79167501;BA.debugLine="cColumnDataType = DataType";
__ref._ccolumndatatype /*String[]*/  = _datatype;
RDebugUtils.currentLine=79167502;
 //BA.debugLineNum = 79167502;BA.debugLine="End Sub";
return "";
}
public String  _setfastscroll(b4a.example.ef.table __ref,boolean _fastscroll) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscroll", false))
	 {return ((String) Debug.delegate(ba, "setfastscroll", new Object[] {_fastscroll}));}
RDebugUtils.currentLine=80478208;
 //BA.debugLineNum = 80478208;BA.debugLine="Public Sub setFastScroll (FastScroll As Boolean)";
RDebugUtils.currentLine=80478209;
 //BA.debugLineNum = 80478209;BA.debugLine="mFastScroll = FastScroll";
__ref._mfastscroll /*boolean*/  = _fastscroll;
RDebugUtils.currentLine=80478210;
 //BA.debugLineNum = 80478210;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=80478211;
 //BA.debugLineNum = 80478211;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=80478212;
 //BA.debugLineNum = 80478212;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollcolumnindex(b4a.example.ef.table __ref,int _fastscrollcolumnindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollcolumnindex", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollcolumnindex", new Object[] {_fastscrollcolumnindex}));}
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Public Sub setFastScrollColumnIndex (FastScrollCol";
RDebugUtils.currentLine=80740353;
 //BA.debugLineNum = 80740353;BA.debugLine="mFastScrollColumnIndex = Max(0, FastScrollColumnI";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Max(0,_fastscrollcolumnindex));
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="mFastScrollColumnIndex = Min(mFastScrollColumnInd";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Min(__ref._mfastscrollcolumnindex /*int*/ ,__ref._mnumberofcolumns /*int*/ -1));
RDebugUtils.currentLine=80740355;
 //BA.debugLineNum = 80740355;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollfixedlabel(b4a.example.ef.table __ref,boolean _fastscrollfixedlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollfixedlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollfixedlabel", new Object[] {_fastscrollfixedlabel}));}
RDebugUtils.currentLine=81002496;
 //BA.debugLineNum = 81002496;BA.debugLine="Public Sub setFastScrollFixedLabel (FastScrollFixe";
RDebugUtils.currentLine=81002497;
 //BA.debugLineNum = 81002497;BA.debugLine="mFastScrollFixedLabel = FastScrollFixedLabel";
__ref._mfastscrollfixedlabel /*boolean*/  = _fastscrollfixedlabel;
RDebugUtils.currentLine=81002498;
 //BA.debugLineNum = 81002498;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=81002499;
 //BA.debugLineNum = 81002499;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
RDebugUtils.currentLine=81002500;
 //BA.debugLineNum = 81002500;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=81002502;
 //BA.debugLineNum = 81002502;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=81002503;
 //BA.debugLineNum = 81002503;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=81002505;
 //BA.debugLineNum = 81002505;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=81002506;
 //BA.debugLineNum = 81002506;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelheight", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelheight", new Object[] {_height}));}
RDebugUtils.currentLine=81395712;
 //BA.debugLineNum = 81395712;BA.debugLine="Public Sub setFastScrollLabelHeight(Height As Int)";
RDebugUtils.currentLine=81395713;
 //BA.debugLineNum = 81395713;BA.debugLine="mFastScrollLabelHeight = Height";
__ref._mfastscrolllabelheight /*int*/  = _height;
RDebugUtils.currentLine=81395714;
 //BA.debugLineNum = 81395714;BA.debugLine="lblFastScroll.Height = mFastScrollLabelHeight";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._mfastscrolllabelheight /*int*/ );
RDebugUtils.currentLine=81395715;
 //BA.debugLineNum = 81395715;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=81395716;
 //BA.debugLineNum = 81395716;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight -";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=81395717;
 //BA.debugLineNum = 81395717;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=81395719;
 //BA.debugLineNum = 81395719;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=81395721;
 //BA.debugLineNum = 81395721;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelmaxchars(b4a.example.ef.table __ref,int _fastscrolllabelmaxchars) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelmaxchars", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelmaxchars", new Object[] {_fastscrolllabelmaxchars}));}
RDebugUtils.currentLine=81133568;
 //BA.debugLineNum = 81133568;BA.debugLine="Public Sub setFastScrollLabelMaxChars(FastScrollLa";
RDebugUtils.currentLine=81133569;
 //BA.debugLineNum = 81133569;BA.debugLine="mFastScrollLabelMaxChars = FastScrollLabelMaxChar";
__ref._mfastscrolllabelmaxchars /*int*/  = _fastscrolllabelmaxchars;
RDebugUtils.currentLine=81133570;
 //BA.debugLineNum = 81133570;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelwidth", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelwidth", new Object[] {_width}));}
RDebugUtils.currentLine=81264640;
 //BA.debugLineNum = 81264640;BA.debugLine="Public Sub setFastScrollLabelWidth(Width As Int)";
RDebugUtils.currentLine=81264641;
 //BA.debugLineNum = 81264641;BA.debugLine="mFastScrollLabelWidth = Width";
__ref._mfastscrolllabelwidth /*int*/  = _width;
RDebugUtils.currentLine=81264642;
 //BA.debugLineNum = 81264642;BA.debugLine="lblFastScroll.Width = mFastScrollLabelWidth";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._mfastscrolllabelwidth /*int*/ );
RDebugUtils.currentLine=81264643;
 //BA.debugLineNum = 81264643;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=81264644;
 //BA.debugLineNum = 81264644;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
 }else {
RDebugUtils.currentLine=81264646;
 //BA.debugLineNum = 81264646;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
 };
RDebugUtils.currentLine=81264648;
 //BA.debugLineNum = 81264648;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollminitems(b4a.example.ef.table __ref,int _fastscrollminitems) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollminitems", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollminitems", new Object[] {_fastscrollminitems}));}
RDebugUtils.currentLine=80609280;
 //BA.debugLineNum = 80609280;BA.debugLine="Public Sub setFastScrollMinItems (FastScrollMinIte";
RDebugUtils.currentLine=80609281;
 //BA.debugLineNum = 80609281;BA.debugLine="mFastScrollMinItems = FastScrollMinItems";
__ref._mfastscrollminitems /*int*/  = _fastscrollminitems;
RDebugUtils.currentLine=80609282;
 //BA.debugLineNum = 80609282;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollshowlabel(b4a.example.ef.table __ref,boolean _fastscrollshowlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollshowlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollshowlabel", new Object[] {_fastscrollshowlabel}));}
RDebugUtils.currentLine=80871424;
 //BA.debugLineNum = 80871424;BA.debugLine="Public Sub setFastScrollShowLabel (FastScrollShowL";
RDebugUtils.currentLine=80871425;
 //BA.debugLineNum = 80871425;BA.debugLine="mFastScrollShowLabel = FastScrollShowLabel";
__ref._mfastscrollshowlabel /*boolean*/  = _fastscrollshowlabel;
RDebugUtils.currentLine=80871426;
 //BA.debugLineNum = 80871426;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=80871427;
 //BA.debugLineNum = 80871427;BA.debugLine="End Sub";
return "";
}
public String  _setfirstcolumnfixed(b4a.example.ef.table __ref,boolean _firstcolumnfixed) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfirstcolumnfixed", false))
	 {return ((String) Debug.delegate(ba, "setfirstcolumnfixed", new Object[] {_firstcolumnfixed}));}
RDebugUtils.currentLine=80216064;
 //BA.debugLineNum = 80216064;BA.debugLine="Public Sub setFirstColumnFixed(FirstColumnFixed As";
RDebugUtils.currentLine=80216065;
 //BA.debugLineNum = 80216065;BA.debugLine="If FirstColumnFixed = True Then";
if (_firstcolumnfixed==__c.True) { 
RDebugUtils.currentLine=80216066;
 //BA.debugLineNum = 80216066;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=80216067;
 //BA.debugLineNum = 80216067;BA.debugLine="setNumberOfFixedColumns(1)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (1));
 };
 }else {
RDebugUtils.currentLine=80216070;
 //BA.debugLineNum = 80216070;BA.debugLine="If mNumberOfFixedColumns = 1 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==1) { 
RDebugUtils.currentLine=80216071;
 //BA.debugLineNum = 80216071;BA.debugLine="setNumberOfFixedColumns(0)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (0));
 };
 };
RDebugUtils.currentLine=80216074;
 //BA.debugLineNum = 80216074;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=80084992;
 //BA.debugLineNum = 80084992;BA.debugLine="Public Sub setNumberOfFixedColumns(NumberOfFixedCo";
RDebugUtils.currentLine=80084993;
 //BA.debugLineNum = 80084993;BA.debugLine="NumberOfFixedColumns = Max(0, Min(3, NumberOfFixe";
_numberoffixedcolumns = (int) (__c.Max(0,__c.Min(3,_numberoffixedcolumns)));
RDebugUtils.currentLine=80084994;
 //BA.debugLineNum = 80084994;BA.debugLine="If mNumberOfFixedColumns = NumberOfFixedColumns T";
if (__ref._mnumberoffixedcolumns /*int*/ ==_numberoffixedcolumns) { 
RDebugUtils.currentLine=80084995;
 //BA.debugLineNum = 80084995;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=80084998;
 //BA.debugLineNum = 80084998;BA.debugLine="If Header.NumberOfViews = 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=80084999;
 //BA.debugLineNum = 80084999;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns	'Ne";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
 }else {
RDebugUtils.currentLine=80085001;
 //BA.debugLineNum = 80085001;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=80085003;
 //BA.debugLineNum = 80085003;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=80085004;
 //BA.debugLineNum = 80085004;BA.debugLine="If HeaderFirst.NumberOfViews = 0 Then";
if (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=80085005;
 //BA.debugLineNum = 80085005;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=80085006;
 //BA.debugLineNum = 80085006;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=80085007;
 //BA.debugLineNum = 80085007;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=80085008;
 //BA.debugLineNum = 80085008;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 }else {
RDebugUtils.currentLine=80085011;
 //BA.debugLineNum = 80085011;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=80085012;
 //BA.debugLineNum = 80085012;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=80085013;
 //BA.debugLineNum = 80085013;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=80085014;
 //BA.debugLineNum = 80085014;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
RDebugUtils.currentLine=80085016;
 //BA.debugLineNum = 80085016;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=80085017;
 //BA.debugLineNum = 80085017;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=80085018;
 //BA.debugLineNum = 80085018;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=80085019;
 //BA.debugLineNum = 80085019;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 };
RDebugUtils.currentLine=80085023;
 //BA.debugLineNum = 80085023;BA.debugLine="HeaderFirst.RemoveAllViews";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=80085024;
 //BA.debugLineNum = 80085024;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=80085026;
 //BA.debugLineNum = 80085026;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
RDebugUtils.currentLine=80085028;
 //BA.debugLineNum = 80085028;BA.debugLine="innerClearAll(mNumberOfColumns, False)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.False);
RDebugUtils.currentLine=80085029;
 //BA.debugLineNum = 80085029;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=80085030;
 //BA.debugLineNum = 80085030;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=80085031;
 //BA.debugLineNum = 80085031;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=80085032;
 //BA.debugLineNum = 80085032;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=80085035;
 //BA.debugLineNum = 80085035;BA.debugLine="Private currentMax As Int";
_currentmax = 0;
RDebugUtils.currentLine=80085036;
 //BA.debugLineNum = 80085036;BA.debugLine="currentMax = Min(Data.Size - 1, SV2.Height / cRo";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=80085038;
 //BA.debugLineNum = 80085038;BA.debugLine="For row = 0 To currentMax";
{
final int step38 = 1;
final int limit38 = _currentmax;
_row = (int) (0) ;
for (;_row <= limit38 ;_row = _row + step38 ) {
RDebugUtils.currentLine=80085039;
 //BA.debugLineNum = 80085039;BA.debugLine="ShowRow(row)";
__ref._showrow /*void*/ (null,_row);
 }
};
 };
RDebugUtils.currentLine=80085043;
 //BA.debugLineNum = 80085043;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignment", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignment", new Object[] {_alignment}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=74711040;
 //BA.debugLineNum = 74711040;BA.debugLine="Public Sub setHeaderAlignment(Alignment As Int)";
RDebugUtils.currentLine=74711041;
 //BA.debugLineNum = 74711041;BA.debugLine="cHeaderAlignment = Alignment";
__ref._cheaderalignment /*int*/  = _alignment;
RDebugUtils.currentLine=74711043;
 //BA.debugLineNum = 74711043;BA.debugLine="If cHeaderAlignments.Length = 0 Then";
if (__ref._cheaderalignments /*int[]*/ .length==0) { 
RDebugUtils.currentLine=74711044;
 //BA.debugLineNum = 74711044;BA.debugLine="Private cHeaderAlignments(mNumberOfColumns) As I";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
 };
RDebugUtils.currentLine=74711047;
 //BA.debugLineNum = 74711047;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=74711048;
 //BA.debugLineNum = 74711048;BA.debugLine="HeaderMultiAlignments = False";
__ref._headermultialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=74711049;
 //BA.debugLineNum = 74711049;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=74711050;
 //BA.debugLineNum = 74711050;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=74711051;
 //BA.debugLineNum = 74711051;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit9 ;_col = _col + step9 ) {
RDebugUtils.currentLine=74711052;
 //BA.debugLineNum = 74711052;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74711053;
 //BA.debugLineNum = 74711053;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74711054;
 //BA.debugLineNum = 74711054;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=74711056;
 //BA.debugLineNum = 74711056;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=74711057;
 //BA.debugLineNum = 74711057;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74711058;
 //BA.debugLineNum = 74711058;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=74711059;
 //BA.debugLineNum = 74711059;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=74711062;
 //BA.debugLineNum = 74711062;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit20 ;_col = _col + step20 ) {
RDebugUtils.currentLine=74711063;
 //BA.debugLineNum = 74711063;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74711064;
 //BA.debugLineNum = 74711064;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74711065;
 //BA.debugLineNum = 74711065;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=74711069;
 //BA.debugLineNum = 74711069;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=74383360;
 //BA.debugLineNum = 74383360;BA.debugLine="Public Sub SetHeaderAlignmentColN(Col As Int, Alig";
RDebugUtils.currentLine=74383361;
 //BA.debugLineNum = 74383361;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=74383363;
 //BA.debugLineNum = 74383363;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=74383364;
 //BA.debugLineNum = 74383364;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=74383365;
 //BA.debugLineNum = 74383365;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=74383366;
 //BA.debugLineNum = 74383366;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=74383369;
 //BA.debugLineNum = 74383369;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=74383370;
 //BA.debugLineNum = 74383370;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=74383371;
 //BA.debugLineNum = 74383371;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=74383372;
 //BA.debugLineNum = 74383372;BA.debugLine="cHeaderAlignments0(i) = cHeaderAlignment";
__ref._cheaderalignments0 /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=74383375;
 //BA.debugLineNum = 74383375;BA.debugLine="cHeaderAlignments0(Col) = AlignmentColN";
__ref._cheaderalignments0 /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=74383376;
 //BA.debugLineNum = 74383376;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=74383377;
 //BA.debugLineNum = 74383377;BA.debugLine="If Header.NumberOfViews > 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=74383378;
 //BA.debugLineNum = 74383378;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=74383379;
 //BA.debugLineNum = 74383379;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74383380;
 //BA.debugLineNum = 74383380;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74383381;
 //BA.debugLineNum = 74383381;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=74383383;
 //BA.debugLineNum = 74383383;BA.debugLine="For i = 0 To mNumberOfFixedColumns - 1";
{
final int step21 = 1;
final int limit21 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=74383384;
 //BA.debugLineNum = 74383384;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74383385;
 //BA.debugLineNum = 74383385;BA.debugLine="If Col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=74383386;
 //BA.debugLineNum = 74383386;BA.debugLine="lbl = HeaderFirst.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74383387;
 //BA.debugLineNum = 74383387;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=74383389;
 //BA.debugLineNum = 74383389;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74383390;
 //BA.debugLineNum = 74383390;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col + mNumber";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [(int) (_col+__ref._mnumberoffixedcolumns /*int*/ )]);
 };
 }
};
 };
 };
RDebugUtils.currentLine=74383395;
 //BA.debugLineNum = 74383395;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=74383396;
 //BA.debugLineNum = 74383396;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignments", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignments", new Object[] {_alignments}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=74317824;
 //BA.debugLineNum = 74317824;BA.debugLine="Public Sub SetHeaderAlignments(Alignments() As Int";
RDebugUtils.currentLine=74317825;
 //BA.debugLineNum = 74317825;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=74317826;
 //BA.debugLineNum = 74317826;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=74317827;
 //BA.debugLineNum = 74317827;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=74317830;
 //BA.debugLineNum = 74317830;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=74317831;
 //BA.debugLineNum = 74317831;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=74317833;
 //BA.debugLineNum = 74317833;BA.debugLine="cHeaderAlignments0 = Alignments";
__ref._cheaderalignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=74317834;
 //BA.debugLineNum = 74317834;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=74317835;
 //BA.debugLineNum = 74317835;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=74317836;
 //BA.debugLineNum = 74317836;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=74317837;
 //BA.debugLineNum = 74317837;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=74317838;
 //BA.debugLineNum = 74317838;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74317839;
 //BA.debugLineNum = 74317839;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74317840;
 //BA.debugLineNum = 74317840;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=74317842;
 //BA.debugLineNum = 74317842;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=74317843;
 //BA.debugLineNum = 74317843;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74317844;
 //BA.debugLineNum = 74317844;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=74317845;
 //BA.debugLineNum = 74317845;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=74317848;
 //BA.debugLineNum = 74317848;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=74317849;
 //BA.debugLineNum = 74317849;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74317850;
 //BA.debugLineNum = 74317850;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74317851;
 //BA.debugLineNum = 74317851;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=74317855;
 //BA.debugLineNum = 74317855;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=74317856;
 //BA.debugLineNum = 74317856;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolor", false))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=74973184;
 //BA.debugLineNum = 74973184;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=74973185;
 //BA.debugLineNum = 74973185;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=74973187;
 //BA.debugLineNum = 74973187;BA.debugLine="cHeaderColor = Color";
__ref._cheadercolor /*int*/  = _color;
RDebugUtils.currentLine=74973188;
 //BA.debugLineNum = 74973188;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=74973189;
 //BA.debugLineNum = 74973189;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=74973190;
 //BA.debugLineNum = 74973190;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=74973191;
 //BA.debugLineNum = 74973191;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74973192;
 //BA.debugLineNum = 74973192;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74973193;
 //BA.debugLineNum = 74973193;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
RDebugUtils.currentLine=74973195;
 //BA.debugLineNum = 74973195;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=74973196;
 //BA.debugLineNum = 74973196;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74973197;
 //BA.debugLineNum = 74973197;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=74973198;
 //BA.debugLineNum = 74973198;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=74973201;
 //BA.debugLineNum = 74973201;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=74973202;
 //BA.debugLineNum = 74973202;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74973203;
 //BA.debugLineNum = 74973203;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74973204;
 //BA.debugLineNum = 74973204;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=74973208;
 //BA.debugLineNum = 74973208;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolors(b4a.example.ef.table __ref,int[] _headercolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolors", false))
	 {return ((String) Debug.delegate(ba, "setheadercolors", new Object[] {_headercolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=77987840;
 //BA.debugLineNum = 77987840;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
RDebugUtils.currentLine=77987841;
 //BA.debugLineNum = 77987841;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=77987843;
 //BA.debugLineNum = 77987843;BA.debugLine="cHeaderColors = HeaderColors";
__ref._cheadercolors /*int[]*/  = _headercolors;
RDebugUtils.currentLine=77987844;
 //BA.debugLineNum = 77987844;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=77987845;
 //BA.debugLineNum = 77987845;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=77987846;
 //BA.debugLineNum = 77987846;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=77987847;
 //BA.debugLineNum = 77987847;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=77987848;
 //BA.debugLineNum = 77987848;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=77987849;
 //BA.debugLineNum = 77987849;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=77987851;
 //BA.debugLineNum = 77987851;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=77987852;
 //BA.debugLineNum = 77987852;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=77987853;
 //BA.debugLineNum = 77987853;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=77987854;
 //BA.debugLineNum = 77987854;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=77987857;
 //BA.debugLineNum = 77987857;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=77987858;
 //BA.debugLineNum = 77987858;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=77987859;
 //BA.debugLineNum = 77987859;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=77987860;
 //BA.debugLineNum = 77987860;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=77987864;
 //BA.debugLineNum = 77987864;BA.debugLine="End Sub";
return "";
}
public String  _setheaderheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderheight", false))
	 {return ((String) Debug.delegate(ba, "setheaderheight", new Object[] {_height}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=74842112;
 //BA.debugLineNum = 74842112;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
RDebugUtils.currentLine=74842113;
 //BA.debugLineNum = 74842113;BA.debugLine="cHeaderHeight = Height";
__ref._cheaderheight /*int*/  = _height;
RDebugUtils.currentLine=74842114;
 //BA.debugLineNum = 74842114;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=74842115;
 //BA.debugLineNum = 74842115;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=74842116;
 //BA.debugLineNum = 74842116;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=74842117;
 //BA.debugLineNum = 74842117;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=74842118;
 //BA.debugLineNum = 74842118;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=74842119;
 //BA.debugLineNum = 74842119;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=74842120;
 //BA.debugLineNum = 74842120;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74842121;
 //BA.debugLineNum = 74842121;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74842122;
 //BA.debugLineNum = 74842122;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
RDebugUtils.currentLine=74842124;
 //BA.debugLineNum = 74842124;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=74842125;
 //BA.debugLineNum = 74842125;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74842126;
 //BA.debugLineNum = 74842126;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=74842127;
 //BA.debugLineNum = 74842127;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=74842130;
 //BA.debugLineNum = 74842130;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=74842131;
 //BA.debugLineNum = 74842131;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=74842132;
 //BA.debugLineNum = 74842132;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=74842133;
 //BA.debugLineNum = 74842133;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=74842137;
 //BA.debugLineNum = 74842137;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=74842138;
 //BA.debugLineNum = 74842138;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=74842139;
 //BA.debugLineNum = 74842139;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=74842140;
 //BA.debugLineNum = 74842140;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight -";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ -__ref._cstatuslineheight /*int*/ ));
 }else {
RDebugUtils.currentLine=74842142;
 //BA.debugLineNum = 74842142;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=74842144;
 //BA.debugLineNum = 74842144;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=74842145;
 //BA.debugLineNum = 74842145;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
 };
RDebugUtils.currentLine=74842147;
 //BA.debugLineNum = 74842147;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolor", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=75104256;
 //BA.debugLineNum = 75104256;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
RDebugUtils.currentLine=75104257;
 //BA.debugLineNum = 75104257;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=75104259;
 //BA.debugLineNum = 75104259;BA.debugLine="cHeaderTextColor = Color";
__ref._cheadertextcolor /*int*/  = _color;
RDebugUtils.currentLine=75104260;
 //BA.debugLineNum = 75104260;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=75104261;
 //BA.debugLineNum = 75104261;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=75104262;
 //BA.debugLineNum = 75104262;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=75104263;
 //BA.debugLineNum = 75104263;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=75104264;
 //BA.debugLineNum = 75104264;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=75104265;
 //BA.debugLineNum = 75104265;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=75104267;
 //BA.debugLineNum = 75104267;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=75104268;
 //BA.debugLineNum = 75104268;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=75104269;
 //BA.debugLineNum = 75104269;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=75104270;
 //BA.debugLineNum = 75104270;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=75104273;
 //BA.debugLineNum = 75104273;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=75104274;
 //BA.debugLineNum = 75104274;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=75104275;
 //BA.debugLineNum = 75104275;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=75104276;
 //BA.debugLineNum = 75104276;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=75104280;
 //BA.debugLineNum = 75104280;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolors(b4a.example.ef.table __ref,int[] _headertextcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolors", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolors", new Object[] {_headertextcolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=78118912;
 //BA.debugLineNum = 78118912;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
RDebugUtils.currentLine=78118913;
 //BA.debugLineNum = 78118913;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=78118915;
 //BA.debugLineNum = 78118915;BA.debugLine="cHeaderTextColors = HeaderTextColors";
__ref._cheadertextcolors /*int[]*/  = _headertextcolors;
RDebugUtils.currentLine=78118916;
 //BA.debugLineNum = 78118916;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=78118917;
 //BA.debugLineNum = 78118917;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=78118918;
 //BA.debugLineNum = 78118918;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=78118919;
 //BA.debugLineNum = 78118919;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78118920;
 //BA.debugLineNum = 78118920;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78118921;
 //BA.debugLineNum = 78118921;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=78118923;
 //BA.debugLineNum = 78118923;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=78118924;
 //BA.debugLineNum = 78118924;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78118925;
 //BA.debugLineNum = 78118925;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=78118926;
 //BA.debugLineNum = 78118926;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=78118929;
 //BA.debugLineNum = 78118929;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=78118930;
 //BA.debugLineNum = 78118930;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78118931;
 //BA.debugLineNum = 78118931;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78118932;
 //BA.debugLineNum = 78118932;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=78118936;
 //BA.debugLineNum = 78118936;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypeface(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _headertypeface) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypeface", false))
	 {return ((String) Debug.delegate(ba, "setheadertypeface", new Object[] {_headertypeface}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=78249984;
 //BA.debugLineNum = 78249984;BA.debugLine="Public Sub setHeaderTypeFace(HeaderTypeFace As Typ";
RDebugUtils.currentLine=78249985;
 //BA.debugLineNum = 78249985;BA.debugLine="cHeaderTypeFace = HeaderTypeFace";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypeface;
RDebugUtils.currentLine=78249986;
 //BA.debugLineNum = 78249986;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=78249987;
 //BA.debugLineNum = 78249987;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=78249988;
 //BA.debugLineNum = 78249988;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=78249989;
 //BA.debugLineNum = 78249989;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=78249990;
 //BA.debugLineNum = 78249990;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78249991;
 //BA.debugLineNum = 78249991;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78249992;
 //BA.debugLineNum = 78249992;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=78249994;
 //BA.debugLineNum = 78249994;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=78249995;
 //BA.debugLineNum = 78249995;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78249996;
 //BA.debugLineNum = 78249996;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=78249997;
 //BA.debugLineNum = 78249997;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=78250000;
 //BA.debugLineNum = 78250000;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=78250001;
 //BA.debugLineNum = 78250001;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78250002;
 //BA.debugLineNum = 78250002;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78250003;
 //BA.debugLineNum = 78250003;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
RDebugUtils.currentLine=78250007;
 //BA.debugLineNum = 78250007;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _headertypefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypefaces", false))
	 {return ((String) Debug.delegate(ba, "setheadertypefaces", new Object[] {_headertypefaces}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=78315520;
 //BA.debugLineNum = 78315520;BA.debugLine="Public Sub SetHeaderTypeFaces(HeaderTypeFaces() As";
RDebugUtils.currentLine=78315521;
 //BA.debugLineNum = 78315521;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=78315523;
 //BA.debugLineNum = 78315523;BA.debugLine="If HeaderTypeFaces.Length = 1 Then";
if (_headertypefaces.length==1) { 
RDebugUtils.currentLine=78315524;
 //BA.debugLineNum = 78315524;BA.debugLine="cHeaderTypeFace = HeaderTypeFaces(0)";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypefaces[(int) (0)];
RDebugUtils.currentLine=78315525;
 //BA.debugLineNum = 78315525;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=78315526;
 //BA.debugLineNum = 78315526;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=78315527;
 //BA.debugLineNum = 78315527;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=78315528;
 //BA.debugLineNum = 78315528;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=78315529;
 //BA.debugLineNum = 78315529;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78315530;
 //BA.debugLineNum = 78315530;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78315531;
 //BA.debugLineNum = 78315531;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=78315533;
 //BA.debugLineNum = 78315533;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=78315534;
 //BA.debugLineNum = 78315534;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78315535;
 //BA.debugLineNum = 78315535;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=78315536;
 //BA.debugLineNum = 78315536;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=78315539;
 //BA.debugLineNum = 78315539;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=78315540;
 //BA.debugLineNum = 78315540;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78315541;
 //BA.debugLineNum = 78315541;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78315542;
 //BA.debugLineNum = 78315542;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
 }else {
RDebugUtils.currentLine=78315547;
 //BA.debugLineNum = 78315547;BA.debugLine="If HeaderTypeFaces.Length <> mNumberOfColumns Th";
if (_headertypefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=78315548;
 //BA.debugLineNum = 78315548;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=78315549;
 //BA.debugLineNum = 78315549;BA.debugLine="Log(\"SetHeaderTypeFaces: Invalid number of colu";
__c.LogImpl("578315549","SetHeaderTypeFaces: Invalid number of columns",0);
RDebugUtils.currentLine=78315550;
 //BA.debugLineNum = 78315550;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=78315552;
 //BA.debugLineNum = 78315552;BA.debugLine="cHeaderTypeFaces0 = HeaderTypeFaces";
__ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _headertypefaces;
RDebugUtils.currentLine=78315553;
 //BA.debugLineNum = 78315553;BA.debugLine="cHeaderTypeFaces = cHeaderTypeFaces0";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=78315554;
 //BA.debugLineNum = 78315554;BA.debugLine="HeaderMultiTypeFace = True";
__ref._headermultitypeface /*boolean*/  = __c.True;
RDebugUtils.currentLine=78315555;
 //BA.debugLineNum = 78315555;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numb";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=78315556;
 //BA.debugLineNum = 78315556;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=78315557;
 //BA.debugLineNum = 78315557;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step36 = 1;
final int limit36 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit36 ;_col = _col + step36 ) {
RDebugUtils.currentLine=78315558;
 //BA.debugLineNum = 78315558;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78315559;
 //BA.debugLineNum = 78315559;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78315560;
 //BA.debugLineNum = 78315560;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
RDebugUtils.currentLine=78315562;
 //BA.debugLineNum = 78315562;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfC";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=78315563;
 //BA.debugLineNum = 78315563;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78315564;
 //BA.debugLineNum = 78315564;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedCol";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=78315565;
 //BA.debugLineNum = 78315565;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 }else {
RDebugUtils.currentLine=78315568;
 //BA.debugLineNum = 78315568;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step47 = 1;
final int limit47 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit47 ;_col = _col + step47 ) {
RDebugUtils.currentLine=78315569;
 //BA.debugLineNum = 78315569;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=78315570;
 //BA.debugLineNum = 78315570;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=78315571;
 //BA.debugLineNum = 78315571;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 };
 };
 };
 };
RDebugUtils.currentLine=78315577;
 //BA.debugLineNum = 78315577;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheight", false))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_height}));}
RDebugUtils.currentLine=73531392;
 //BA.debugLineNum = 73531392;BA.debugLine="Public Sub setHeight(Height As Int)";
RDebugUtils.currentLine=73531393;
 //BA.debugLineNum = 73531393;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=73531394;
 //BA.debugLineNum = 73531394;BA.debugLine="pnlTable.Height = Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(_height);
RDebugUtils.currentLine=73531395;
 //BA.debugLineNum = 73531395;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=73531396;
 //BA.debugLineNum = 73531396;BA.debugLine="SVF.Height = Height - cStatusLineHeight - cHeade";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=73531397;
 //BA.debugLineNum = 73531397;BA.debugLine="SV2.Height = Height - cStatusLineHeight - cHeade";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=73531399;
 //BA.debugLineNum = 73531399;BA.debugLine="SVF.Height = Height - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=73531400;
 //BA.debugLineNum = 73531400;BA.debugLine="SV2.Height = Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=73531402;
 //BA.debugLineNum = 73531402;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
RDebugUtils.currentLine=73531403;
 //BA.debugLineNum = 73531403;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=73531404;
 //BA.debugLineNum = 73531404;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=73531405;
 //BA.debugLineNum = 73531405;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=73531407;
 //BA.debugLineNum = 73531407;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=73531408;
 //BA.debugLineNum = 73531408;BA.debugLine="End Sub";
return "";
}
public String  _setleft(b4a.example.ef.table __ref,int _left) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setleft", false))
	 {return ((String) Debug.delegate(ba, "setleft", new Object[] {_left}));}
RDebugUtils.currentLine=73072640;
 //BA.debugLineNum = 73072640;BA.debugLine="Public Sub setLeft(Left As Int)";
RDebugUtils.currentLine=73072641;
 //BA.debugLineNum = 73072641;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=73072642;
 //BA.debugLineNum = 73072642;BA.debugLine="pnlTable.Left = Left";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_left);
RDebugUtils.currentLine=73072643;
 //BA.debugLineNum = 73072643;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(b4a.example.ef.table __ref,int _linewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setlinewidth", false))
	 {return ((String) Debug.delegate(ba, "setlinewidth", new Object[] {_linewidth}));}
RDebugUtils.currentLine=73793536;
 //BA.debugLineNum = 73793536;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
RDebugUtils.currentLine=73793537;
 //BA.debugLineNum = 73793537;BA.debugLine="cLineWidth = LineWidth";
__ref._clinewidth /*int*/  = _linewidth;
RDebugUtils.currentLine=73793538;
 //BA.debugLineNum = 73793538;BA.debugLine="End Sub";
return "";
}
public String  _setmulticolumnsort(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmulticolumnsort", false))
	 {return ((String) Debug.delegate(ba, "setmulticolumnsort", new Object[] {_bdo}));}
RDebugUtils.currentLine=82444288;
 //BA.debugLineNum = 82444288;BA.debugLine="Public Sub setMultiColumnSort(bDo As Boolean)";
RDebugUtils.currentLine=82444289;
 //BA.debugLineNum = 82444289;BA.debugLine="mMultiColumnSort = bDo";
__ref._mmulticolumnsort /*boolean*/  = _bdo;
RDebugUtils.currentLine=82444290;
 //BA.debugLineNum = 82444290;BA.debugLine="End Sub";
return "";
}
public String  _setmultiselect(b4a.example.ef.table __ref,boolean _multiselect) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmultiselect", false))
	 {return ((String) Debug.delegate(ba, "setmultiselect", new Object[] {_multiselect}));}
RDebugUtils.currentLine=72351744;
 //BA.debugLineNum = 72351744;BA.debugLine="Public Sub setMultiSelect(MultiSelect As Boolean)";
RDebugUtils.currentLine=72351745;
 //BA.debugLineNum = 72351745;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
RDebugUtils.currentLine=72351746;
 //BA.debugLineNum = 72351746;BA.debugLine="mMultiSelect = MultiSelect";
__ref._mmultiselect /*boolean*/  = _multiselect;
RDebugUtils.currentLine=72351747;
 //BA.debugLineNum = 72351747;BA.debugLine="End Sub";
return "";
}
public String  _setnumberofcolumns(b4a.example.ef.table __ref,int _numberofcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setnumberofcolumns", false))
	 {return ((String) Debug.delegate(ba, "setnumberofcolumns", new Object[] {_numberofcolumns}));}
int _col = 0;
RDebugUtils.currentLine=79364096;
 //BA.debugLineNum = 79364096;BA.debugLine="Public Sub setNumberOfColumns (NumberOfColumns As";
RDebugUtils.currentLine=79364097;
 //BA.debugLineNum = 79364097;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=79364098;
 //BA.debugLineNum = 79364098;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=79364101;
 //BA.debugLineNum = 79364101;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=79364102;
 //BA.debugLineNum = 79364102;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=79364103;
 //BA.debugLineNum = 79364103;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=79364104;
 //BA.debugLineNum = 79364104;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=79364105;
 //BA.debugLineNum = 79364105;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=79364106;
 //BA.debugLineNum = 79364106;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=79364107;
 //BA.debugLineNum = 79364107;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=79364108;
 //BA.debugLineNum = 79364108;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }
};
RDebugUtils.currentLine=79364110;
 //BA.debugLineNum = 79364110;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor1(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor1", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor1", new Object[] {_color}));}
RDebugUtils.currentLine=75235328;
 //BA.debugLineNum = 75235328;BA.debugLine="Public Sub setRowColor1(Color As Int)";
RDebugUtils.currentLine=75235329;
 //BA.debugLineNum = 75235329;BA.debugLine="cRowColor1 = Color";
__ref._crowcolor1 /*int*/  = _color;
RDebugUtils.currentLine=75235330;
 //BA.debugLineNum = 75235330;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=75235331;
 //BA.debugLineNum = 75235331;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=75235333;
 //BA.debugLineNum = 75235333;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor2(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor2", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor2", new Object[] {_color}));}
RDebugUtils.currentLine=75366400;
 //BA.debugLineNum = 75366400;BA.debugLine="Public Sub setRowColor2(Color As Int)";
RDebugUtils.currentLine=75366401;
 //BA.debugLineNum = 75366401;BA.debugLine="cRowColor2 = Color";
__ref._crowcolor2 /*int*/  = _color;
RDebugUtils.currentLine=75366402;
 //BA.debugLineNum = 75366402;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=75366403;
 //BA.debugLineNum = 75366403;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=75366405;
 //BA.debugLineNum = 75366405;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=75497472;
 //BA.debugLineNum = 75497472;BA.debugLine="Public Sub SetRowColorN(Row As Int, Color As Int)";
RDebugUtils.currentLine=75497473;
 //BA.debugLineNum = 75497473;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=75497474;
 //BA.debugLineNum = 75497474;BA.debugLine="Private New = False As Boolean";
_new = __c.False;
RDebugUtils.currentLine=75497475;
 //BA.debugLineNum = 75497475;BA.debugLine="If lstRowColors.IndexOf(Color) >= 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))>=0) { 
RDebugUtils.currentLine=75497476;
 //BA.debugLineNum = 75497476;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.IndexOf";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))+2));
 }else {
RDebugUtils.currentLine=75497478;
 //BA.debugLineNum = 75497478;BA.debugLine="lstRowColors.Add(Color)";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_color));
RDebugUtils.currentLine=75497479;
 //BA.debugLineNum = 75497479;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.Size +";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()+1));
RDebugUtils.currentLine=75497480;
 //BA.debugLineNum = 75497480;BA.debugLine="New = True";
_new = __c.True;
 };
RDebugUtils.currentLine=75497483;
 //BA.debugLineNum = 75497483;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=75497484;
 //BA.debugLineNum = 75497484;BA.debugLine="Private cdi(mNumberOfColumns) As Object";
_cdi = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cdi.length;
for (int i0 = 0;i0 < d0;i0++) {
_cdi[i0] = new Object();
}
}
;
RDebugUtils.currentLine=75497485;
 //BA.debugLineNum = 75497485;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=75497486;
 //BA.debugLineNum = 75497486;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=75497487;
 //BA.debugLineNum = 75497487;BA.debugLine="cdw.Initialize(Color, 0)";
_cdw.Initialize(_color,(int) (0));
RDebugUtils.currentLine=75497488;
 //BA.debugLineNum = 75497488;BA.debugLine="cdi(col) = cdw";
_cdi[_col] = (Object)(_cdw.getObject());
 }
};
RDebugUtils.currentLine=75497490;
 //BA.debugLineNum = 75497490;BA.debugLine="If New = False Then";
if (_new==__c.False) { 
RDebugUtils.currentLine=75497491;
 //BA.debugLineNum = 75497491;BA.debugLine="lstRowDrawables.Set(lstRowColors.IndexOf(Color)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Set(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color)),(Object)(_cdi));
 }else {
RDebugUtils.currentLine=75497493;
 //BA.debugLineNum = 75497493;BA.debugLine="lstRowDrawables.Add(cdi)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cdi));
 };
RDebugUtils.currentLine=75497498;
 //BA.debugLineNum = 75497498;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=75497500;
 //BA.debugLineNum = 75497500;BA.debugLine="End Sub";
return "";
}
public String  _setrowheight(b4a.example.ef.table __ref,int _rowheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowheight", false))
	 {return ((String) Debug.delegate(ba, "setrowheight", new Object[] {_rowheight}));}
RDebugUtils.currentLine=76611584;
 //BA.debugLineNum = 76611584;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
RDebugUtils.currentLine=76611585;
 //BA.debugLineNum = 76611585;BA.debugLine="If cRowHeight = cHeaderHeight Then";
if (__ref._crowheight /*int*/ ==__ref._cheaderheight /*int*/ ) { 
RDebugUtils.currentLine=76611586;
 //BA.debugLineNum = 76611586;BA.debugLine="setHeaderHeight(RowHeight)";
__ref._setheaderheight /*String*/ (null,_rowheight);
 };
RDebugUtils.currentLine=76611588;
 //BA.debugLineNum = 76611588;BA.debugLine="cRowHeight = RowHeight";
__ref._crowheight /*int*/  = _rowheight;
RDebugUtils.currentLine=76611589;
 //BA.debugLineNum = 76611589;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcellcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcellcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcellcolor", new Object[] {_color}));}
RDebugUtils.currentLine=75956224;
 //BA.debugLineNum = 75956224;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
RDebugUtils.currentLine=75956225;
 //BA.debugLineNum = 75956225;BA.debugLine="cSelectedCellColor = Color";
__ref._cselectedcellcolor /*int*/  = _color;
RDebugUtils.currentLine=75956226;
 //BA.debugLineNum = 75956226;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=75956227;
 //BA.debugLineNum = 75956227;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=75956229;
 //BA.debugLineNum = 75956229;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcelltextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcelltextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcelltextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=76087296;
 //BA.debugLineNum = 76087296;BA.debugLine="Public Sub setSelectedCellTextColor(TextColor As I";
RDebugUtils.currentLine=76087297;
 //BA.debugLineNum = 76087297;BA.debugLine="cSelectedCellTextColor = TextColor";
__ref._cselectedcelltextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=76087298;
 //BA.debugLineNum = 76087298;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=76087299;
 //BA.debugLineNum = 76087299;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=76087301;
 //BA.debugLineNum = 76087301;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowcolor", new Object[] {_color}));}
RDebugUtils.currentLine=75694080;
 //BA.debugLineNum = 75694080;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
RDebugUtils.currentLine=75694081;
 //BA.debugLineNum = 75694081;BA.debugLine="cSelectedRowColor = Color";
__ref._cselectedrowcolor /*int*/  = _color;
RDebugUtils.currentLine=75694082;
 //BA.debugLineNum = 75694082;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=75694083;
 //BA.debugLineNum = 75694083;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=75694085;
 //BA.debugLineNum = 75694085;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowtextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowtextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowtextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=75825152;
 //BA.debugLineNum = 75825152;BA.debugLine="Public Sub setSelectedRowTextColor(TextColor As In";
RDebugUtils.currentLine=75825153;
 //BA.debugLineNum = 75825153;BA.debugLine="cSelectedRowTextColor = TextColor";
__ref._cselectedrowtextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=75825154;
 //BA.debugLineNum = 75825154;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=75825155;
 //BA.debugLineNum = 75825155;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=75825157;
 //BA.debugLineNum = 75825157;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=78446592;
 //BA.debugLineNum = 78446592;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
RDebugUtils.currentLine=78446594;
 //BA.debugLineNum = 78446594;BA.debugLine="Private row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=78446595;
 //BA.debugLineNum = 78446595;BA.debugLine="cSingleLine = SingleLine";
__ref._csingleline /*boolean*/  = _singleline;
RDebugUtils.currentLine=78446597;
 //BA.debugLineNum = 78446597;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=78446598;
 //BA.debugLineNum = 78446598;BA.debugLine="For row = 0 To LabelsCache.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit4 ;_row = _row + step4 ) {
RDebugUtils.currentLine=78446599;
 //BA.debugLineNum = 78446599;BA.debugLine="Private lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=78446600;
 //BA.debugLineNum = 78446600;BA.debugLine="lbls = LabelsCache.Get(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=78446601;
 //BA.debugLineNum = 78446601;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=78446602;
 //BA.debugLineNum = 78446602;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=78446603;
 //BA.debugLineNum = 78446603;BA.debugLine="jo = lbls(col)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbls[_col].getObject()));
RDebugUtils.currentLine=78446604;
 //BA.debugLineNum = 78446604;BA.debugLine="jo.RunMethod(\"setSingleLine\", Array(cSingleLin";
_jo.RunMethod("setSingleLine",new Object[]{(Object)(__ref._csingleline /*boolean*/ )});
 }
};
 }
};
 };
RDebugUtils.currentLine=78446609;
 //BA.debugLineNum = 78446609;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapcolor", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapcolor", new Object[] {_color}));}
RDebugUtils.currentLine=79822848;
 //BA.debugLineNum = 79822848;BA.debugLine="Public Sub setSortBitmapColor(Color As Int)";
RDebugUtils.currentLine=79822849;
 //BA.debugLineNum = 79822849;BA.debugLine="cSortBitmapColor = Color";
__ref._csortbitmapcolor /*int*/  = _color;
RDebugUtils.currentLine=79822850;
 //BA.debugLineNum = 79822850;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=79822851;
 //BA.debugLineNum = 79822851;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapwidth", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapwidth", new Object[] {_width}));}
RDebugUtils.currentLine=79691776;
 //BA.debugLineNum = 79691776;BA.debugLine="Public Sub setSortBitmapWidth(Width As Int)";
RDebugUtils.currentLine=79691777;
 //BA.debugLineNum = 79691777;BA.debugLine="cSortBitmapWidth = Width";
__ref._csortbitmapwidth /*int*/  = _width;
RDebugUtils.currentLine=79691778;
 //BA.debugLineNum = 79691778;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=79691779;
 //BA.debugLineNum = 79691779;BA.debugLine="End Sub";
return "";
}
public String  _setsortcaseinsensitive(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcaseinsensitive", false))
	 {return ((String) Debug.delegate(ba, "setsortcaseinsensitive", new Object[] {_bdo}));}
RDebugUtils.currentLine=82575360;
 //BA.debugLineNum = 82575360;BA.debugLine="Public Sub setSortCaseInsensitive(bDo As Boolean)";
RDebugUtils.currentLine=82575361;
 //BA.debugLineNum = 82575361;BA.debugLine="mSortCaseInsensitive = bDo";
__ref._msortcaseinsensitive /*boolean*/  = _bdo;
RDebugUtils.currentLine=82575362;
 //BA.debugLineNum = 82575362;BA.debugLine="End Sub";
return "";
}
public String  _setsortcolumn(b4a.example.ef.table __ref,boolean _sortcolumn) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcolumn", false))
	 {return ((String) Debug.delegate(ba, "setsortcolumn", new Object[] {_sortcolumn}));}
RDebugUtils.currentLine=77463552;
 //BA.debugLineNum = 77463552;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
RDebugUtils.currentLine=77463553;
 //BA.debugLineNum = 77463553;BA.debugLine="cSortColumn = SortColumn";
__ref._csortcolumn /*boolean*/  = _sortcolumn;
RDebugUtils.currentLine=77463554;
 //BA.debugLineNum = 77463554;BA.debugLine="End Sub";
return "";
}
public String  _setsortingbitmaps(b4a.example.ef.table __ref,String _bitmapascfilename,String _bitmapdesfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortingbitmaps", false))
	 {return ((String) Debug.delegate(ba, "setsortingbitmaps", new Object[] {_bitmapascfilename,_bitmapdesfilename}));}
RDebugUtils.currentLine=79953920;
 //BA.debugLineNum = 79953920;BA.debugLine="Public Sub SetSortingBitmaps(BitmapAscFilename As";
RDebugUtils.currentLine=79953921;
 //BA.debugLineNum = 79953921;BA.debugLine="bmpAsc.Initialize(File.DirAssets, BitmapAscFilena";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapascfilename);
RDebugUtils.currentLine=79953922;
 //BA.debugLineNum = 79953922;BA.debugLine="bmpDes.Initialize(File.DirAssets, BitmapDesFilena";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapdesfilename);
RDebugUtils.currentLine=79953923;
 //BA.debugLineNum = 79953923;BA.debugLine="mCustomSortingBitmaps = True";
__ref._mcustomsortingbitmaps /*boolean*/  = __c.True;
RDebugUtils.currentLine=79953924;
 //BA.debugLineNum = 79953924;BA.debugLine="End Sub";
return "";
}
public String  _setsortremoveaccents(b4a.example.ef.table __ref,boolean _sortremoveaccents) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortremoveaccents", false))
	 {return ((String) Debug.delegate(ba, "setsortremoveaccents", new Object[] {_sortremoveaccents}));}
RDebugUtils.currentLine=79560704;
 //BA.debugLineNum = 79560704;BA.debugLine="Public Sub setSortRemoveAccents(SortRemoveAccents";
RDebugUtils.currentLine=79560705;
 //BA.debugLineNum = 79560705;BA.debugLine="cSortRemoveAccents = SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = _sortremoveaccents;
RDebugUtils.currentLine=79560706;
 //BA.debugLineNum = 79560706;BA.debugLine="End Sub";
return "";
}
public String  _setstatuslineheight(b4a.example.ef.table __ref,int _statuslineheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatuslineheight", false))
	 {return ((String) Debug.delegate(ba, "setstatuslineheight", new Object[] {_statuslineheight}));}
RDebugUtils.currentLine=76742656;
 //BA.debugLineNum = 76742656;BA.debugLine="Public Sub setStatusLineHeight(StatusLineHeight As";
RDebugUtils.currentLine=76742657;
 //BA.debugLineNum = 76742657;BA.debugLine="cStatusLineHeight = StatusLineHeight";
__ref._cstatuslineheight /*int*/  = _statuslineheight;
RDebugUtils.currentLine=76742658;
 //BA.debugLineNum = 76742658;BA.debugLine="End Sub";
return "";
}
public String  _settablecolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settablecolor", false))
	 {return ((String) Debug.delegate(ba, "settablecolor", new Object[] {_color}));}
RDebugUtils.currentLine=76218368;
 //BA.debugLineNum = 76218368;BA.debugLine="Public Sub setTableColor(Color As Int)";
RDebugUtils.currentLine=76218369;
 //BA.debugLineNum = 76218369;BA.debugLine="cTableColor = Color";
__ref._ctablecolor /*int*/  = _color;
RDebugUtils.currentLine=76218370;
 //BA.debugLineNum = 76218370;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=76218371;
 //BA.debugLineNum = 76218371;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=76218372;
 //BA.debugLineNum = 76218372;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=76218373;
 //BA.debugLineNum = 76218373;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=76218374;
 //BA.debugLineNum = 76218374;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=76218375;
 //BA.debugLineNum = 76218375;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
 };
 };
RDebugUtils.currentLine=76218378;
 //BA.debugLineNum = 76218378;BA.debugLine="End Sub";
return "";
}
public String  _settag(b4a.example.ef.table __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settag", false))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_tag}));}
RDebugUtils.currentLine=78905344;
 //BA.debugLineNum = 78905344;BA.debugLine="Public Sub setTag(Tag As Object)";
RDebugUtils.currentLine=78905345;
 //BA.debugLineNum = 78905345;BA.debugLine="pnlTable.Tag = Tag";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(_tag);
RDebugUtils.currentLine=78905346;
 //BA.debugLineNum = 78905346;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_color}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=76349440;
 //BA.debugLineNum = 76349440;BA.debugLine="Public Sub setTextColor(Color As Int)";
RDebugUtils.currentLine=76349441;
 //BA.debugLineNum = 76349441;BA.debugLine="cTextColor = Color";
__ref._ctextcolor /*int*/  = _color;
RDebugUtils.currentLine=76349442;
 //BA.debugLineNum = 76349442;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=76349443;
 //BA.debugLineNum = 76349443;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=76349444;
 //BA.debugLineNum = 76349444;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=76349445;
 //BA.debugLineNum = 76349445;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=76349446;
 //BA.debugLineNum = 76349446;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76349447;
 //BA.debugLineNum = 76349447;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=76349448;
 //BA.debugLineNum = 76349448;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=76349452;
 //BA.debugLineNum = 76349452;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=76349453;
 //BA.debugLineNum = 76349453;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=76349454;
 //BA.debugLineNum = 76349454;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=76349455;
 //BA.debugLineNum = 76349455;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76349456;
 //BA.debugLineNum = 76349456;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=76349457;
 //BA.debugLineNum = 76349457;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=76349459;
 //BA.debugLineNum = 76349459;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=76349460;
 //BA.debugLineNum = 76349460;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=76349461;
 //BA.debugLineNum = 76349461;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76349462;
 //BA.debugLineNum = 76349462;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=76349463;
 //BA.debugLineNum = 76349463;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=76349467;
 //BA.debugLineNum = 76349467;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=77856768;
 //BA.debugLineNum = 77856768;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
RDebugUtils.currentLine=77856769;
 //BA.debugLineNum = 77856769;BA.debugLine="cTextColors = TextColors";
__ref._ctextcolors /*int[]*/  = _textcolors;
RDebugUtils.currentLine=77856770;
 //BA.debugLineNum = 77856770;BA.debugLine="If cTextColors.Length = 1 Then";
if (__ref._ctextcolors /*int[]*/ .length==1) { 
RDebugUtils.currentLine=77856771;
 //BA.debugLineNum = 77856771;BA.debugLine="MultiTextColors = False";
__ref._multitextcolors /*boolean*/  = __c.False;
RDebugUtils.currentLine=77856772;
 //BA.debugLineNum = 77856772;BA.debugLine="setTextColor(cTextColors(0))";
__ref._settextcolor /*String*/ (null,__ref._ctextcolors /*int[]*/ [(int) (0)]);
RDebugUtils.currentLine=77856773;
 //BA.debugLineNum = 77856773;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=77856775;
 //BA.debugLineNum = 77856775;BA.debugLine="MultiTextColors = True";
__ref._multitextcolors /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=77856777;
 //BA.debugLineNum = 77856777;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=77856778;
 //BA.debugLineNum = 77856778;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=77856779;
 //BA.debugLineNum = 77856779;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=77856780;
 //BA.debugLineNum = 77856780;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=77856781;
 //BA.debugLineNum = 77856781;BA.debugLine="col = i Mod mNumberOfColumns";
_col = (int) (_i%__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=77856782;
 //BA.debugLineNum = 77856782;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=77856783;
 //BA.debugLineNum = 77856783;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=77856784;
 //BA.debugLineNum = 77856784;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 }else {
RDebugUtils.currentLine=77856788;
 //BA.debugLineNum = 77856788;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=77856789;
 //BA.debugLineNum = 77856789;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=77856790;
 //BA.debugLineNum = 77856790;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=77856791;
 //BA.debugLineNum = 77856791;BA.debugLine="col = i Mod mNumberOfFixedColumns";
_col = (int) (_i%__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=77856792;
 //BA.debugLineNum = 77856792;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=77856793;
 //BA.debugLineNum = 77856793;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=77856794;
 //BA.debugLineNum = 77856794;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=77856796;
 //BA.debugLineNum = 77856796;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step28 = 1;
final int limit28 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=77856797;
 //BA.debugLineNum = 77856797;BA.debugLine="col = i Mod (mNumberOfColumns - mNumberOfFixed";
_col = (int) (_i%(__ref._mnumberofcolumns /*int*/ -__ref._mnumberoffixedcolumns /*int*/ )+__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=77856798;
 //BA.debugLineNum = 77856798;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=77856799;
 //BA.debugLineNum = 77856799;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=77856800;
 //BA.debugLineNum = 77856800;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=77856804;
 //BA.debugLineNum = 77856804;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.ef.table __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_size}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=76480512;
 //BA.debugLineNum = 76480512;BA.debugLine="Public Sub setTextSize(Size As Float)";
RDebugUtils.currentLine=76480513;
 //BA.debugLineNum = 76480513;BA.debugLine="cTextSize = Size";
__ref._ctextsize /*float*/  = _size;
RDebugUtils.currentLine=76480515;
 //BA.debugLineNum = 76480515;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=76480517;
 //BA.debugLineNum = 76480517;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=76480518;
 //BA.debugLineNum = 76480518;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=76480519;
 //BA.debugLineNum = 76480519;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=76480520;
 //BA.debugLineNum = 76480520;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76480521;
 //BA.debugLineNum = 76480521;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=76480522;
 //BA.debugLineNum = 76480522;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=76480526;
 //BA.debugLineNum = 76480526;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=76480527;
 //BA.debugLineNum = 76480527;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=76480528;
 //BA.debugLineNum = 76480528;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76480529;
 //BA.debugLineNum = 76480529;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=76480530;
 //BA.debugLineNum = 76480530;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=76480534;
 //BA.debugLineNum = 76480534;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=76480535;
 //BA.debugLineNum = 76480535;BA.debugLine="For i = 0 To HeaderFirst.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=76480536;
 //BA.debugLineNum = 76480536;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76480537;
 //BA.debugLineNum = 76480537;BA.debugLine="lbl = HeaderFirst.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=76480538;
 //BA.debugLineNum = 76480538;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=76480540;
 //BA.debugLineNum = 76480540;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=76480541;
 //BA.debugLineNum = 76480541;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76480542;
 //BA.debugLineNum = 76480542;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=76480543;
 //BA.debugLineNum = 76480543;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=76480547;
 //BA.debugLineNum = 76480547;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=76480548;
 //BA.debugLineNum = 76480548;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step32 = 1;
final int limit32 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=76480549;
 //BA.debugLineNum = 76480549;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76480550;
 //BA.debugLineNum = 76480550;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=76480551;
 //BA.debugLineNum = 76480551;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=76480553;
 //BA.debugLineNum = 76480553;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=76480554;
 //BA.debugLineNum = 76480554;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=76480555;
 //BA.debugLineNum = 76480555;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=76480556;
 //BA.debugLineNum = 76480556;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 };
RDebugUtils.currentLine=76480560;
 //BA.debugLineNum = 76480560;BA.debugLine="End Sub";
return "";
}
public String  _settop(b4a.example.ef.table __ref,int _top) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settop", false))
	 {return ((String) Debug.delegate(ba, "settop", new Object[] {_top}));}
RDebugUtils.currentLine=73203712;
 //BA.debugLineNum = 73203712;BA.debugLine="Public Sub setTop(Top As Int)";
RDebugUtils.currentLine=73203713;
 //BA.debugLineNum = 73203713;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=73203714;
 //BA.debugLineNum = 73203714;BA.debugLine="pnlTable.Top = Top";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=73203715;
 //BA.debugLineNum = 73203715;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settypefaces", false))
	 {return ((String) Debug.delegate(ba, "settypefaces", new Object[] {_typefaces}));}
RDebugUtils.currentLine=76873728;
 //BA.debugLineNum = 76873728;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
RDebugUtils.currentLine=76873729;
 //BA.debugLineNum = 76873729;BA.debugLine="If TypeFaces.Length = 1 Then";
if (_typefaces.length==1) { 
RDebugUtils.currentLine=76873730;
 //BA.debugLineNum = 76873730;BA.debugLine="cTypeFace = TypeFaces(0)";
__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _typefaces[(int) (0)];
RDebugUtils.currentLine=76873731;
 //BA.debugLineNum = 76873731;BA.debugLine="MultiTypeFace = False";
__ref._multitypeface /*boolean*/  = __c.False;
 }else {
RDebugUtils.currentLine=76873733;
 //BA.debugLineNum = 76873733;BA.debugLine="If TypeFaces.Length <> mNumberOfColumns Then";
if (_typefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=76873734;
 //BA.debugLineNum = 76873734;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=76873735;
 //BA.debugLineNum = 76873735;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=76873738;
 //BA.debugLineNum = 76873738;BA.debugLine="cTypeFaces0 = TypeFaces";
__ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _typefaces;
RDebugUtils.currentLine=76873739;
 //BA.debugLineNum = 76873739;BA.debugLine="cTypeFaces = cTypeFaces0";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=76873740;
 //BA.debugLineNum = 76873740;BA.debugLine="MultiTypeFace = True";
__ref._multitypeface /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=76873743;
 //BA.debugLineNum = 76873743;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=76873744;
 //BA.debugLineNum = 76873744;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=76873746;
 //BA.debugLineNum = 76873746;BA.debugLine="End Sub";
return "";
}
public String  _setusecolumncolors(b4a.example.ef.table __ref,boolean _usecolumncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setusecolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setusecolumncolors", new Object[] {_usecolumncolors}));}
int _i = 0;
RDebugUtils.currentLine=77594624;
 //BA.debugLineNum = 77594624;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
RDebugUtils.currentLine=77594625;
 //BA.debugLineNum = 77594625;BA.debugLine="cUseColumnColors = UseColumnColors";
__ref._cusecolumncolors /*boolean*/  = _usecolumncolors;
RDebugUtils.currentLine=77594626;
 //BA.debugLineNum = 77594626;BA.debugLine="If cColumnColors.Length = 0 Then";
if (__ref._ccolumncolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=77594627;
 //BA.debugLineNum = 77594627;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=77594628;
 //BA.debugLineNum = 77594628;BA.debugLine="Dim cColumnColors(mNumberOfColumns) As Int";
_ccolumncolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77594629;
 //BA.debugLineNum = 77594629;BA.debugLine="Dim cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77594630;
 //BA.debugLineNum = 77594630;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=77594631;
 //BA.debugLineNum = 77594631;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=77594632;
 //BA.debugLineNum = 77594632;BA.debugLine="cColumnColors(i) = cRowColor1";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor1 /*int*/ ;
 }else {
RDebugUtils.currentLine=77594634;
 //BA.debugLineNum = 77594634;BA.debugLine="cColumnColors(i) = cRowColor2";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor2 /*int*/ ;
 };
RDebugUtils.currentLine=77594636;
 //BA.debugLineNum = 77594636;BA.debugLine="cTextColors(i) = cTextColor";
__ref._ctextcolors /*int[]*/ [_i] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=77594640;
 //BA.debugLineNum = 77594640;BA.debugLine="If cHeaderColors.Length = 0 Then";
if (__ref._cheadercolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=77594641;
 //BA.debugLineNum = 77594641;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=77594642;
 //BA.debugLineNum = 77594642;BA.debugLine="Dim cHeaderColors(mNumberOfColumns) As Int";
_cheadercolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77594643;
 //BA.debugLineNum = 77594643;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=77594644;
 //BA.debugLineNum = 77594644;BA.debugLine="cHeaderColors(i) = cHeaderColor";
__ref._cheadercolors /*int[]*/ [_i] = __ref._cheadercolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=77594648;
 //BA.debugLineNum = 77594648;BA.debugLine="If cHeaderTextColors.Length = 0 Then";
if (__ref._cheadertextcolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=77594649;
 //BA.debugLineNum = 77594649;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=77594650;
 //BA.debugLineNum = 77594650;BA.debugLine="Dim cHeaderTextColors(mNumberOfColumns) As Int";
_cheadertextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=77594651;
 //BA.debugLineNum = 77594651;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=77594652;
 //BA.debugLineNum = 77594652;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
__ref._cheadertextcolors /*int[]*/ [_i] = __ref._cheadertextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=77594655;
 //BA.debugLineNum = 77594655;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_col,_row,_value}));}
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=71172096;
 //BA.debugLineNum = 71172096;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
RDebugUtils.currentLine=71172097;
 //BA.debugLineNum = 71172097;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=71172098;
 //BA.debugLineNum = 71172098;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=71172099;
 //BA.debugLineNum = 71172099;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
RDebugUtils.currentLine=71172100;
 //BA.debugLineNum = 71172100;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=71172101;
 //BA.debugLineNum = 71172101;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=71172102;
 //BA.debugLineNum = 71172102;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=71172103;
 //BA.debugLineNum = 71172103;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
RDebugUtils.currentLine=71172105;
 //BA.debugLineNum = 71172105;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.ef.table __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_visible}));}
RDebugUtils.currentLine=73662464;
 //BA.debugLineNum = 73662464;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
RDebugUtils.currentLine=73662465;
 //BA.debugLineNum = 73662465;BA.debugLine="pnlTable.Visible = Visible";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(_visible);
RDebugUtils.currentLine=73662466;
 //BA.debugLineNum = 73662466;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setwidth", false))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_width}));}
RDebugUtils.currentLine=73334784;
 //BA.debugLineNum = 73334784;BA.debugLine="Public Sub setWidth(Width As Int)";
RDebugUtils.currentLine=73334785;
 //BA.debugLineNum = 73334785;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=73334786;
 //BA.debugLineNum = 73334786;BA.debugLine="pnlTable.Width = Width";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_width);
RDebugUtils.currentLine=73334787;
 //BA.debugLineNum = 73334787;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=73334788;
 //BA.debugLineNum = 73334788;BA.debugLine="SV2.Width = Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(_width);
 }else {
RDebugUtils.currentLine=73334790;
 //BA.debugLineNum = 73334790;BA.debugLine="SV2.Width = Width - SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (_width-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=73334793;
 //BA.debugLineNum = 73334793;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=73334794;
 //BA.debugLineNum = 73334794;BA.debugLine="End Sub";
return "";
}
public String  _setzeroselection(b4a.example.ef.table __ref,boolean _zeroselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setzeroselection", false))
	 {return ((String) Debug.delegate(ba, "setzeroselection", new Object[] {_zeroselection}));}
RDebugUtils.currentLine=80019456;
 //BA.debugLineNum = 80019456;BA.debugLine="Public Sub setZeroSelection(ZeroSelection As Boole";
RDebugUtils.currentLine=80019457;
 //BA.debugLineNum = 80019457;BA.debugLine="mZeroSelection = ZeroSelection";
__ref._mzeroselection /*boolean*/  = _zeroselection;
RDebugUtils.currentLine=80019458;
 //BA.debugLineNum = 80019458;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _snapshot(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "snapshot", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "snapshot", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpsnapshot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnltable = null;
RDebugUtils.currentLine=81461248;
 //BA.debugLineNum = 81461248;BA.debugLine="Public Sub SnapShot As Bitmap";
RDebugUtils.currentLine=81461249;
 //BA.debugLineNum = 81461249;BA.debugLine="Private bmpSnapshot As Bitmap";
_bmpsnapshot = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=81461250;
 //BA.debugLineNum = 81461250;BA.debugLine="Private xpnlTable As B4XView";
_xpnltable = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=81461252;
 //BA.debugLineNum = 81461252;BA.debugLine="xpnlTable = pnlTable";
_xpnltable = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=81461253;
 //BA.debugLineNum = 81461253;BA.debugLine="bmpSnapshot = xpnlTable.Snapshot";
_bmpsnapshot = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_xpnltable.Snapshot().getObject()));
RDebugUtils.currentLine=81461255;
 //BA.debugLineNum = 81461255;BA.debugLine="Return bmpSnapshot";
if (true) return _bmpsnapshot;
RDebugUtils.currentLine=81461256;
 //BA.debugLineNum = 81461256;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=81920000;
 //BA.debugLineNum = 81920000;BA.debugLine="Sub SortOMDoubleIDX(arrDouble() As Double, bAscend";
RDebugUtils.currentLine=81920002;
 //BA.debugLineNum = 81920002;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=81920003;
 //BA.debugLineNum = 81920003;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=81920004;
 //BA.debugLineNum = 81920004;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=81920005;
 //BA.debugLineNum = 81920005;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=81920007;
 //BA.debugLineNum = 81920007;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=81920008;
 //BA.debugLineNum = 81920008;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=81920009;
 //BA.debugLineNum = 81920009;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=81920010;
 //BA.debugLineNum = 81920010;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=81920013;
 //BA.debugLineNum = 81920013;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=81920015;
 //BA.debugLineNum = 81920015;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=81920016;
 //BA.debugLineNum = 81920016;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=81920019;
 //BA.debugLineNum = 81920019;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=81920020;
 //BA.debugLineNum = 81920020;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=81920023;
 //BA.debugLineNum = 81920023;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=81920024;
 //BA.debugLineNum = 81920024;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=81920025;
 //BA.debugLineNum = 81920025;BA.debugLine="If B4XOM.ContainsKey(arrDouble(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[(int) (_i)]))) { 
RDebugUtils.currentLine=81920026;
 //BA.debugLineNum = 81920026;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=81920028;
 //BA.debugLineNum = 81920028;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=81920030;
 //BA.debugLineNum = 81920030;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=81920031;
 //BA.debugLineNum = 81920031;BA.debugLine="B4XOM.Put(arrDouble(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=81920034;
 //BA.debugLineNum = 81920034;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=81920036;
 //BA.debugLineNum = 81920036;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=81920038;
 //BA.debugLineNum = 81920038;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=81920039;
 //BA.debugLineNum = 81920039;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=81920040;
 //BA.debugLineNum = 81920040;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=81920041;
 //BA.debugLineNum = 81920041;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=81920042;
 //BA.debugLineNum = 81920042;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=81920046;
 //BA.debugLineNum = 81920046;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=81920048;
 //BA.debugLineNum = 81920048;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=81985536;
 //BA.debugLineNum = 81985536;BA.debugLine="Sub SortOMDoubleIDX2(arrDouble() As Double, arrInd";
RDebugUtils.currentLine=81985538;
 //BA.debugLineNum = 81985538;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=81985539;
 //BA.debugLineNum = 81985539;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=81985540;
 //BA.debugLineNum = 81985540;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=81985541;
 //BA.debugLineNum = 81985541;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=81985543;
 //BA.debugLineNum = 81985543;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=81985544;
 //BA.debugLineNum = 81985544;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=81985545;
 //BA.debugLineNum = 81985545;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=81985546;
 //BA.debugLineNum = 81985546;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=81985549;
 //BA.debugLineNum = 81985549;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=81985551;
 //BA.debugLineNum = 81985551;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=81985552;
 //BA.debugLineNum = 81985552;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=81985555;
 //BA.debugLineNum = 81985555;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=81985556;
 //BA.debugLineNum = 81985556;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=81985559;
 //BA.debugLineNum = 81985559;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=81985560;
 //BA.debugLineNum = 81985560;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=81985561;
 //BA.debugLineNum = 81985561;BA.debugLine="If B4XOM.ContainsKey(arrDouble(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=81985562;
 //BA.debugLineNum = 81985562;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=81985564;
 //BA.debugLineNum = 81985564;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=81985566;
 //BA.debugLineNum = 81985566;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=81985567;
 //BA.debugLineNum = 81985567;BA.debugLine="B4XOM.Put(arrDouble(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=81985570;
 //BA.debugLineNum = 81985570;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=81985572;
 //BA.debugLineNum = 81985572;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=81985574;
 //BA.debugLineNum = 81985574;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=81985575;
 //BA.debugLineNum = 81985575;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=81985576;
 //BA.debugLineNum = 81985576;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=81985577;
 //BA.debugLineNum = 81985577;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=81985578;
 //BA.debugLineNum = 81985578;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=81985582;
 //BA.debugLineNum = 81985582;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=81985584;
 //BA.debugLineNum = 81985584;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=81657856;
 //BA.debugLineNum = 81657856;BA.debugLine="Sub SortOMLongIDX(arrLong() As Long, bAscending As";
RDebugUtils.currentLine=81657858;
 //BA.debugLineNum = 81657858;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=81657859;
 //BA.debugLineNum = 81657859;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=81657860;
 //BA.debugLineNum = 81657860;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=81657861;
 //BA.debugLineNum = 81657861;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=81657863;
 //BA.debugLineNum = 81657863;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=81657864;
 //BA.debugLineNum = 81657864;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=81657865;
 //BA.debugLineNum = 81657865;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=81657866;
 //BA.debugLineNum = 81657866;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=81657869;
 //BA.debugLineNum = 81657869;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=81657871;
 //BA.debugLineNum = 81657871;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=81657872;
 //BA.debugLineNum = 81657872;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=81657875;
 //BA.debugLineNum = 81657875;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=81657876;
 //BA.debugLineNum = 81657876;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=81657879;
 //BA.debugLineNum = 81657879;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=81657880;
 //BA.debugLineNum = 81657880;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=81657881;
 //BA.debugLineNum = 81657881;BA.debugLine="If B4XOM.ContainsKey(arrLong(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[(int) (_i)]))) { 
RDebugUtils.currentLine=81657882;
 //BA.debugLineNum = 81657882;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=81657884;
 //BA.debugLineNum = 81657884;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=81657886;
 //BA.debugLineNum = 81657886;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=81657887;
 //BA.debugLineNum = 81657887;BA.debugLine="B4XOM.Put(arrLong(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=81657890;
 //BA.debugLineNum = 81657890;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=81657892;
 //BA.debugLineNum = 81657892;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=81657894;
 //BA.debugLineNum = 81657894;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=81657895;
 //BA.debugLineNum = 81657895;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=81657896;
 //BA.debugLineNum = 81657896;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=81657897;
 //BA.debugLineNum = 81657897;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=81657898;
 //BA.debugLineNum = 81657898;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=81657902;
 //BA.debugLineNum = 81657902;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=81657904;
 //BA.debugLineNum = 81657904;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=81788928;
 //BA.debugLineNum = 81788928;BA.debugLine="Sub SortOMLongIDX2(arrLong() As Long, arrIndex() A";
RDebugUtils.currentLine=81788930;
 //BA.debugLineNum = 81788930;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=81788931;
 //BA.debugLineNum = 81788931;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=81788932;
 //BA.debugLineNum = 81788932;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=81788933;
 //BA.debugLineNum = 81788933;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=81788935;
 //BA.debugLineNum = 81788935;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=81788936;
 //BA.debugLineNum = 81788936;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=81788937;
 //BA.debugLineNum = 81788937;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=81788938;
 //BA.debugLineNum = 81788938;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=81788941;
 //BA.debugLineNum = 81788941;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=81788943;
 //BA.debugLineNum = 81788943;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=81788944;
 //BA.debugLineNum = 81788944;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=81788947;
 //BA.debugLineNum = 81788947;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=81788948;
 //BA.debugLineNum = 81788948;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=81788951;
 //BA.debugLineNum = 81788951;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=81788952;
 //BA.debugLineNum = 81788952;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=81788953;
 //BA.debugLineNum = 81788953;BA.debugLine="If B4XOM.ContainsKey(arrLong(arrIndex(i))) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=81788954;
 //BA.debugLineNum = 81788954;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=81788956;
 //BA.debugLineNum = 81788956;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=81788958;
 //BA.debugLineNum = 81788958;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=81788959;
 //BA.debugLineNum = 81788959;BA.debugLine="B4XOM.Put(arrLong(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=81788962;
 //BA.debugLineNum = 81788962;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=81788964;
 //BA.debugLineNum = 81788964;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=81788966;
 //BA.debugLineNum = 81788966;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=81788967;
 //BA.debugLineNum = 81788967;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=81788968;
 //BA.debugLineNum = 81788968;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=81788969;
 //BA.debugLineNum = 81788969;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=81788970;
 //BA.debugLineNum = 81788970;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=81788974;
 //BA.debugLineNum = 81788974;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=81788976;
 //BA.debugLineNum = 81788976;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=82051072;
 //BA.debugLineNum = 82051072;BA.debugLine="Sub SortOMStringIDX(arrString() As String, bAscend";
RDebugUtils.currentLine=82051074;
 //BA.debugLineNum = 82051074;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=82051075;
 //BA.debugLineNum = 82051075;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=82051076;
 //BA.debugLineNum = 82051076;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=82051077;
 //BA.debugLineNum = 82051077;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=82051079;
 //BA.debugLineNum = 82051079;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=82051080;
 //BA.debugLineNum = 82051080;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=82051081;
 //BA.debugLineNum = 82051081;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=82051082;
 //BA.debugLineNum = 82051082;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=82051085;
 //BA.debugLineNum = 82051085;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=82051087;
 //BA.debugLineNum = 82051087;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=82051088;
 //BA.debugLineNum = 82051088;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=82051091;
 //BA.debugLineNum = 82051091;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=82051092;
 //BA.debugLineNum = 82051092;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=82051095;
 //BA.debugLineNum = 82051095;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=82051096;
 //BA.debugLineNum = 82051096;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=82051097;
 //BA.debugLineNum = 82051097;BA.debugLine="If B4XOM.ContainsKey(arrString(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[(int) (_i)]))) { 
RDebugUtils.currentLine=82051098;
 //BA.debugLineNum = 82051098;BA.debugLine="lstIndexes = B4XOM.Get(arrString(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=82051100;
 //BA.debugLineNum = 82051100;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=82051102;
 //BA.debugLineNum = 82051102;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=82051103;
 //BA.debugLineNum = 82051103;BA.debugLine="B4XOM.Put(arrString(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=82051106;
 //BA.debugLineNum = 82051106;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=82051107;
 //BA.debugLineNum = 82051107;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=82051109;
 //BA.debugLineNum = 82051109;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=82051112;
 //BA.debugLineNum = 82051112;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=82051114;
 //BA.debugLineNum = 82051114;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=82051115;
 //BA.debugLineNum = 82051115;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=82051116;
 //BA.debugLineNum = 82051116;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=82051117;
 //BA.debugLineNum = 82051117;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=82051118;
 //BA.debugLineNum = 82051118;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=82051122;
 //BA.debugLineNum = 82051122;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=82051124;
 //BA.debugLineNum = 82051124;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=82182144;
 //BA.debugLineNum = 82182144;BA.debugLine="Sub SortOMStringIDX2(arrString() As String, arrInd";
RDebugUtils.currentLine=82182146;
 //BA.debugLineNum = 82182146;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=82182147;
 //BA.debugLineNum = 82182147;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=82182148;
 //BA.debugLineNum = 82182148;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=82182149;
 //BA.debugLineNum = 82182149;BA.debugLine="Dim B4XOM As B4XOrderedMap 'this needs the B4XCol";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=82182151;
 //BA.debugLineNum = 82182151;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=82182152;
 //BA.debugLineNum = 82182152;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=82182153;
 //BA.debugLineNum = 82182153;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=82182154;
 //BA.debugLineNum = 82182154;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=82182157;
 //BA.debugLineNum = 82182157;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=82182159;
 //BA.debugLineNum = 82182159;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=82182160;
 //BA.debugLineNum = 82182160;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=82182163;
 //BA.debugLineNum = 82182163;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=82182164;
 //BA.debugLineNum = 82182164;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=82182167;
 //BA.debugLineNum = 82182167;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=82182168;
 //BA.debugLineNum = 82182168;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=82182169;
 //BA.debugLineNum = 82182169;BA.debugLine="If B4XOM.ContainsKey(arrString(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=82182170;
 //BA.debugLineNum = 82182170;BA.debugLine="lstIndexes = B4XOM.Get(arrString(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=82182172;
 //BA.debugLineNum = 82182172;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=82182174;
 //BA.debugLineNum = 82182174;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=82182175;
 //BA.debugLineNum = 82182175;BA.debugLine="B4XOM.Put(arrString(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=82182178;
 //BA.debugLineNum = 82182178;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=82182179;
 //BA.debugLineNum = 82182179;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=82182181;
 //BA.debugLineNum = 82182181;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=82182184;
 //BA.debugLineNum = 82182184;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=82182186;
 //BA.debugLineNum = 82182186;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=82182187;
 //BA.debugLineNum = 82182187;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=82182188;
 //BA.debugLineNum = 82182188;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=82182189;
 //BA.debugLineNum = 82182189;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=82182190;
 //BA.debugLineNum = 82182190;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=82182194;
 //BA.debugLineNum = 82182194;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=82182196;
 //BA.debugLineNum = 82182196;BA.debugLine="End Sub";
return null;
}
public String  _unhidecol(b4a.example.ef.table __ref,int _col,int _newsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unhidecol", false))
	 {return ((String) Debug.delegate(ba, "unhidecol", new Object[] {_col,_newsize}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=72744960;
 //BA.debugLineNum = 72744960;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
RDebugUtils.currentLine=72744961;
 //BA.debugLineNum = 72744961;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=72744962;
 //BA.debugLineNum = 72744962;BA.debugLine="For i=0 To SavedWidths.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=72744963;
 //BA.debugLineNum = 72744963;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=72744965;
 //BA.debugLineNum = 72744965;BA.debugLine="tmpWidths(col) = newSize";
_tmpwidths[_col] = _newsize;
RDebugUtils.currentLine=72744966;
 //BA.debugLineNum = 72744966;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=72744967;
 //BA.debugLineNum = 72744967;BA.debugLine="End Sub";
return "";
}
public String  _unselectrow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unselectrow", false))
	 {return ((String) Debug.delegate(ba, "unselectrow", new Object[] {_row}));}
int _previndex = 0;
RDebugUtils.currentLine=71303168;
 //BA.debugLineNum = 71303168;BA.debugLine="Public Sub UnselectRow(Row As Int)";
RDebugUtils.currentLine=71303169;
 //BA.debugLineNum = 71303169;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=71303171;
 //BA.debugLineNum = 71303171;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=71303173;
 //BA.debugLineNum = 71303173;BA.debugLine="prevIndex = SelectedRows.indexof(Row)	 ' -1 if se";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=71303174;
 //BA.debugLineNum = 71303174;BA.debugLine="If prevIndex > -1 Then";
if (_previndex>-1) { 
RDebugUtils.currentLine=71303176;
 //BA.debugLineNum = 71303176;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=71303177;
 //BA.debugLineNum = 71303177;BA.debugLine="SelectedRows.RemoveAt(prevIndex)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
RDebugUtils.currentLine=71303178;
 //BA.debugLineNum = 71303178;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=71303179;
 //BA.debugLineNum = 71303179;BA.debugLine="HideRow(Row)";
__ref._hiderow /*String*/ (null,_row);
RDebugUtils.currentLine=71303180;
 //BA.debugLineNum = 71303180;BA.debugLine="ShowRow(Row)";
__ref._showrow /*void*/ (null,_row);
 };
 };
RDebugUtils.currentLine=71303183;
 //BA.debugLineNum = 71303183;BA.debugLine="End Sub";
return "";
}
public boolean  _updatecell(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updatecell", false))
	 {return ((Boolean) Debug.delegate(ba, "updatecell", new Object[] {_col,_row,_value}));}
RDebugUtils.currentLine=72024064;
 //BA.debugLineNum = 72024064;BA.debugLine="Public Sub UpdateCell(Col As Int, Row As Int, Valu";
RDebugUtils.currentLine=72024065;
 //BA.debugLineNum = 72024065;BA.debugLine="If (Col < 0 Or Col > mNumberOfColumns - 1 Or Row";
if ((_col<0 || _col>__ref._mnumberofcolumns /*int*/ -1 || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=72024066;
 //BA.debugLineNum = 72024066;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=72024068;
 //BA.debugLineNum = 72024068;BA.debugLine="SetValue(Col, Row, Value)";
__ref._setvalue /*String*/ (null,_col,_row,_value);
RDebugUtils.currentLine=72024069;
 //BA.debugLineNum = 72024069;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=72024070;
 //BA.debugLineNum = 72024070;BA.debugLine="End Sub";
return false;
}
public boolean  _updaterow(b4a.example.ef.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updaterow", false))
	 {return ((Boolean) Debug.delegate(ba, "updaterow", new Object[] {_row,_values}));}
int _i = 0;
RDebugUtils.currentLine=71958528;
 //BA.debugLineNum = 71958528;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As Stri";
RDebugUtils.currentLine=71958529;
 //BA.debugLineNum = 71958529;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=71958530;
 //BA.debugLineNum = 71958530;BA.debugLine="If (Values.Length <> mNumberOfColumns Or Row <0 O";
if ((_values.length!=__ref._mnumberofcolumns /*int*/  || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=71958531;
 //BA.debugLineNum = 71958531;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=71958533;
 //BA.debugLineNum = 71958533;BA.debugLine="For i=0 To Values.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_values.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=71958534;
 //BA.debugLineNum = 71958534;BA.debugLine="SetValue(i,Row,Values(i))";
__ref._setvalue /*String*/ (null,_i,_row,_values[_i]);
 }
};
RDebugUtils.currentLine=71958536;
 //BA.debugLineNum = 71958536;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=71958537;
 //BA.debugLineNum = 71958537;BA.debugLine="End Sub";
return false;
}
}