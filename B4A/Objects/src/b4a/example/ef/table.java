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
RDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub AddRow(Values() As String)";
RDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("019529730","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=19529736;
 //BA.debugLineNum = 19529736;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=19529737;
 //BA.debugLineNum = 19529737;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=19529738;
 //BA.debugLineNum = 19529738;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=19529739;
 //BA.debugLineNum = 19529739;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=19529747;
 //BA.debugLineNum = 19529747;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=19660803;
 //BA.debugLineNum = 19660803;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
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
RDebugUtils.currentLine=19660806;
 //BA.debugLineNum = 19660806;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=19660808;
 //BA.debugLineNum = 19660808;BA.debugLine="lbls = GetLabels(Row)";
_lbls = __ref._getlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null,_row);
RDebugUtils.currentLine=19660809;
 //BA.debugLineNum = 19660809;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=19660810;
 //BA.debugLineNum = 19660810;BA.debugLine="visibleRows.Put(Row, lbls)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_row),(Object)(_lbls));
RDebugUtils.currentLine=19660811;
 //BA.debugLineNum = 19660811;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=19660812;
 //BA.debugLineNum = 19660812;BA.debugLine="Private txtColor As Int";
_txtcolor = 0;
RDebugUtils.currentLine=19660813;
 //BA.debugLineNum = 19660813;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
if (true) break;

case 7:
//if
this.state = 22;
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=19660816;
 //BA.debugLineNum = 19660816;BA.debugLine="Else If lstRowColorIndexes.Get(Row) > 1 Then";
if ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))>1) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=19660820;
 //BA.debugLineNum = 19660820;BA.debugLine="Else If cUseColumnColors = True Then";
if (__ref._cusecolumncolors /*boolean*/ ==parent.__c.True) { 
this.state = 13;
}else {
this.state = 15;
}}}
if (true) break;

case 9:
//C
this.state = 22;
RDebugUtils.currentLine=19660814;
 //BA.debugLineNum = 19660814;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = __ref._selecteddrawable /*Object[]*/ ;
RDebugUtils.currentLine=19660815;
 //BA.debugLineNum = 19660815;BA.debugLine="txtColor = cSelectedRowTextColor";
_txtcolor = __ref._cselectedrowtextcolor /*int*/ ;
 if (true) break;

case 11:
//C
this.state = 22;
RDebugUtils.currentLine=19660817;
 //BA.debugLineNum = 19660817;BA.debugLine="rowColor = lstRowDrawables.Get(lstRowColorIndexe";
_rowcolor = (Object[])(__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)));
RDebugUtils.currentLine=19660819;
 //BA.debugLineNum = 19660819;BA.debugLine="txtColor = GetContrastColor(lstRowColors.Get(lst";
_txtcolor = __ref._getcontrastcolor /*int*/ (null,(int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)))));
 if (true) break;

case 13:
//C
this.state = 22;
RDebugUtils.currentLine=19660821;
 //BA.debugLineNum = 19660821;BA.debugLine="rowColor = ColumnDrawables";
_rowcolor = __ref._columndrawables /*Object[]*/ ;
RDebugUtils.currentLine=19660822;
 //BA.debugLineNum = 19660822;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=19660824;
 //BA.debugLineNum = 19660824;BA.debugLine="If Row Mod 2 = 0 Then";
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
RDebugUtils.currentLine=19660825;
 //BA.debugLineNum = 19660825;BA.debugLine="rowColor = Drawable1";
_rowcolor = __ref._drawable1 /*Object[]*/ ;
RDebugUtils.currentLine=19660826;
 //BA.debugLineNum = 19660826;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=19660828;
 //BA.debugLineNum = 19660828;BA.debugLine="rowColor = Drawable2";
_rowcolor = __ref._drawable2 /*Object[]*/ ;
RDebugUtils.currentLine=19660829;
 //BA.debugLineNum = 19660829;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
;
RDebugUtils.currentLine=19660832;
 //BA.debugLineNum = 19660832;BA.debugLine="If mNumberOfFixedColumns = 0 Then";

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
RDebugUtils.currentLine=19660833;
 //BA.debugLineNum = 19660833;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=19660834;
 //BA.debugLineNum = 19660834;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
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
RDebugUtils.currentLine=19660835;
 //BA.debugLineNum = 19660835;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(I).L";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19660836;
 //BA.debugLineNum = 19660836;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=19660837;
 //BA.debugLineNum = 19660837;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=19660838;
 //BA.debugLineNum = 19660838;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=19660839;
 //BA.debugLineNum = 19660839;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=19660840;
 //BA.debugLineNum = 19660840;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=19660842;
 //BA.debugLineNum = 19660842;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=19660843;
 //BA.debugLineNum = 19660843;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=19660845;
 //BA.debugLineNum = 19660845;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=19660847;
 //BA.debugLineNum = 19660847;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=19660849;
 //BA.debugLineNum = 19660849;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=19660850;
 //BA.debugLineNum = 19660850;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=19660852;
 //BA.debugLineNum = 19660852;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=19660857;
 //BA.debugLineNum = 19660857;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=19660858;
 //BA.debugLineNum = 19660858;BA.debugLine="If i < mNumberOfFixedColumns Then";
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
RDebugUtils.currentLine=19660859;
 //BA.debugLineNum = 19660859;BA.debugLine="SVF.Panel.AddView(lbls(i), HeaderFirst.GetView";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19660860;
 //BA.debugLineNum = 19660860;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=19660861;
 //BA.debugLineNum = 19660861;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=19660862;
 //BA.debugLineNum = 19660862;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=19660863;
 //BA.debugLineNum = 19660863;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=19660864;
 //BA.debugLineNum = 19660864;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=19660866;
 //BA.debugLineNum = 19660866;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=19660867;
 //BA.debugLineNum = 19660867;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=19660869;
 //BA.debugLineNum = 19660869;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=19660871;
 //BA.debugLineNum = 19660871;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=19660873;
 //BA.debugLineNum = 19660873;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=19660874;
 //BA.debugLineNum = 19660874;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=19660876;
 //BA.debugLineNum = 19660876;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=19660879;
 //BA.debugLineNum = 19660879;BA.debugLine="Private i_1 As Int";
_i_1 = 0;
RDebugUtils.currentLine=19660880;
 //BA.debugLineNum = 19660880;BA.debugLine="i_1 = i - mNumberOfFixedColumns";
_i_1 = (int) (_i-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=19660881;
 //BA.debugLineNum = 19660881;BA.debugLine="If (Header.GetView(i_1).Width > 1 ) Then";
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
RDebugUtils.currentLine=19660882;
 //BA.debugLineNum = 19660882;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(i_1";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19660883;
 //BA.debugLineNum = 19660883;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=19660884;
 //BA.debugLineNum = 19660884;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=19660885;
 //BA.debugLineNum = 19660885;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(";
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
RDebugUtils.currentLine=19660886;
 //BA.debugLineNum = 19660886;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=19660887;
 //BA.debugLineNum = 19660887;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=19660889;
 //BA.debugLineNum = 19660889;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=19660890;
 //BA.debugLineNum = 19660890;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=19660892;
 //BA.debugLineNum = 19660892;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 90:
//C
this.state = 91;
;
RDebugUtils.currentLine=19660894;
 //BA.debugLineNum = 19660894;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=19660896;
 //BA.debugLineNum = 19660896;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=19660897;
 //BA.debugLineNum = 19660897;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=19660899;
 //BA.debugLineNum = 19660899;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=19660907;
 //BA.debugLineNum = 19660907;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=19660908;
 //BA.debugLineNum = 19660908;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=19660909;
 //BA.debugLineNum = 19660909;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=19660910;
 //BA.debugLineNum = 19660910;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
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
RDebugUtils.currentLine=19660912;
 //BA.debugLineNum = 19660912;BA.debugLine="If SubExists(cCallBack, cEventName & \"_ShowRow\")";
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
RDebugUtils.currentLine=19660913;
 //BA.debugLineNum = 19660913;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "showrow"),(int) (0));
this.state = 115;
return;
case 115:
//C
this.state = 110;
;
RDebugUtils.currentLine=19660914;
 //BA.debugLineNum = 19660914;BA.debugLine="CallSub3(cCallBack, cEventName & \"_ShowRow\", Row";
parent.__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_ShowRow",(Object)(_row),(Object)(_lbls));
 if (true) break;

case 110:
//C
this.state = -1;
;
RDebugUtils.currentLine=19660916;
 //BA.debugLineNum = 19660916;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
RDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("019595268","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=19595271;
 //BA.debugLineNum = 19595271;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=19595272;
 //BA.debugLineNum = 19595272;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=19595274;
 //BA.debugLineNum = 19595274;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=19595275;
 //BA.debugLineNum = 19595275;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=19595277;
 //BA.debugLineNum = 19595277;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=19595278;
 //BA.debugLineNum = 19595278;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=19595279;
 //BA.debugLineNum = 19595279;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=19595280;
 //BA.debugLineNum = 19595280;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=19595281;
 //BA.debugLineNum = 19595281;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19595282;
 //BA.debugLineNum = 19595282;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=19595284;
 //BA.debugLineNum = 19595284;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=19595286;
 //BA.debugLineNum = 19595286;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=19595287;
 //BA.debugLineNum = 19595287;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=19595288;
 //BA.debugLineNum = 19595288;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=19595289;
 //BA.debugLineNum = 19595289;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=19595292;
 //BA.debugLineNum = 19595292;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=19595293;
 //BA.debugLineNum = 19595293;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19595294;
 //BA.debugLineNum = 19595294;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=19595296;
 //BA.debugLineNum = 19595296;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=19595298;
 //BA.debugLineNum = 19595298;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=19595299;
 //BA.debugLineNum = 19595299;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=19595300;
 //BA.debugLineNum = 19595300;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=19595301;
 //BA.debugLineNum = 19595301;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=19595302;
 //BA.debugLineNum = 19595302;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=19595303;
 //BA.debugLineNum = 19595303;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=19595307;
 //BA.debugLineNum = 19595307;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=19595308;
 //BA.debugLineNum = 19595308;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=19595311;
 //BA.debugLineNum = 19595311;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=19595312;
 //BA.debugLineNum = 19595312;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=19595319;
 //BA.debugLineNum = 19595319;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
RDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
_savedwidths = new int[_widths.length];
;
RDebugUtils.currentLine=19136517;
 //BA.debugLineNum = 19136517;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
_columnwidths = new int[_widths.length];
;
RDebugUtils.currentLine=19136518;
 //BA.debugLineNum = 19136518;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
_headerwidths = new int[_widths.length];
;
RDebugUtils.currentLine=19136519;
 //BA.debugLineNum = 19136519;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19136520;
 //BA.debugLineNum = 19136520;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=19136521;
 //BA.debugLineNum = 19136521;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=19136522;
 //BA.debugLineNum = 19136522;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=19136523;
 //BA.debugLineNum = 19136523;BA.debugLine="HeaderWidths(col) = Widths(col)";
__ref._headerwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=19136524;
 //BA.debugLineNum = 19136524;BA.debugLine="DataWidths(col) = Widths(col)";
__ref._datawidths /*int[]*/ [_col] = _widths[_col];
 }
};
 }else {
RDebugUtils.currentLine=19136527;
 //BA.debugLineNum = 19136527;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step13 = 1;
final int limit13 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=19136528;
 //BA.debugLineNum = 19136528;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=19136529;
 //BA.debugLineNum = 19136529;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
 }
};
 };
RDebugUtils.currentLine=19136533;
 //BA.debugLineNum = 19136533;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=19136534;
 //BA.debugLineNum = 19136534;BA.debugLine="Private w As Int";
_w = 0;
RDebugUtils.currentLine=19136535;
 //BA.debugLineNum = 19136535;BA.debugLine="Private Left As Int";
_left = 0;
RDebugUtils.currentLine=19136536;
 //BA.debugLineNum = 19136536;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=19136537;
 //BA.debugLineNum = 19136537;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=19136538;
 //BA.debugLineNum = 19136538;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit23 ;_col = _col + step23 ) {
RDebugUtils.currentLine=19136539;
 //BA.debugLineNum = 19136539;BA.debugLine="v = Header.GetView(col)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=19136540;
 //BA.debugLineNum = 19136540;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19136541;
 //BA.debugLineNum = 19136541;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=19136542;
 //BA.debugLineNum = 19136542;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=19136543;
 //BA.debugLineNum = 19136543;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=19136544;
 //BA.debugLineNum = 19136544;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=19136547;
 //BA.debugLineNum = 19136547;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
RDebugUtils.currentLine=19136548;
 //BA.debugLineNum = 19136548;BA.debugLine="HeaderFirst.Width = 0";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=19136549;
 //BA.debugLineNum = 19136549;BA.debugLine="SVF.Width = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=19136550;
 //BA.debugLineNum = 19136550;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
RDebugUtils.currentLine=19136551;
 //BA.debugLineNum = 19136551;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=19136552;
 //BA.debugLineNum = 19136552;BA.debugLine="SV2.Left = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=19136553;
 //BA.debugLineNum = 19136553;BA.debugLine="SV2.Width = Min(Header.Width, cWidth)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=19136554;
 //BA.debugLineNum = 19136554;BA.debugLine="Header.Left = 0";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=19136555;
 //BA.debugLineNum = 19136555;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=19136556;
 //BA.debugLineNum = 19136556;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19136557;
 //BA.debugLineNum = 19136557;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step42 = 1;
final int limit42 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit42 ;_row = _row + step42 ) {
RDebugUtils.currentLine=19136558;
 //BA.debugLineNum = 19136558;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=19136559;
 //BA.debugLineNum = 19136559;BA.debugLine="For col = 0 To lbls.Length - 1";
{
final int step44 = 1;
final int limit44 = (int) (_lbls.length-1);
_col = (int) (0) ;
for (;_col <= limit44 ;_col = _col + step44 ) {
RDebugUtils.currentLine=19136560;
 //BA.debugLineNum = 19136560;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left,";
_lbls[_col].SetLayout(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft(),_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=19136563;
 //BA.debugLineNum = 19136563;BA.debugLine="pnlTable.Width = Min(Header.Width, cWidth)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=19136564;
 //BA.debugLineNum = 19136564;BA.debugLine="lblStatusLine.Width = Header.Width";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=19136565;
 //BA.debugLineNum = 19136565;BA.debugLine="internalPanel.Width = Header.Width";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=19136567;
 //BA.debugLineNum = 19136567;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=19136568;
 //BA.debugLineNum = 19136568;BA.debugLine="Private w, wt As Int";
_w = 0;
_wt = 0;
RDebugUtils.currentLine=19136569;
 //BA.debugLineNum = 19136569;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=19136570;
 //BA.debugLineNum = 19136570;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit55 ;_col = _col + step55 ) {
RDebugUtils.currentLine=19136571;
 //BA.debugLineNum = 19136571;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=19136572;
 //BA.debugLineNum = 19136572;BA.debugLine="v = HeaderFirst.GetView(col)";
_v = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=19136574;
 //BA.debugLineNum = 19136574;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)	'???";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19136575;
 //BA.debugLineNum = 19136575;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=19136576;
 //BA.debugLineNum = 19136576;BA.debugLine="wt = wt + w";
_wt = (int) (_wt+_w);
RDebugUtils.currentLine=19136577;
 //BA.debugLineNum = 19136577;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=19136578;
 //BA.debugLineNum = 19136578;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=19136579;
 //BA.debugLineNum = 19136579;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=19136582;
 //BA.debugLineNum = 19136582;BA.debugLine="mFirstColumnsWidth = Left";
__ref._mfirstcolumnswidth /*int*/  = _left;
RDebugUtils.currentLine=19136583;
 //BA.debugLineNum = 19136583;BA.debugLine="HeaderFirst.Width = Left";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=19136584;
 //BA.debugLineNum = 19136584;BA.debugLine="SVF.Width = HeaderFirst.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=19136585;
 //BA.debugLineNum = 19136585;BA.debugLine="SV2.Left = HeaderFirst.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=19136586;
 //BA.debugLineNum = 19136586;BA.debugLine="Private Left, col_x As Int";
_left = 0;
_col_x = 0;
RDebugUtils.currentLine=19136587;
 //BA.debugLineNum = 19136587;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=19136588;
 //BA.debugLineNum = 19136588;BA.debugLine="For col = mNumberOfFixedColumns To Widths.Length";
{
final int step72 = 1;
final int limit72 = (int) (_widths.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit72 ;_col = _col + step72 ) {
RDebugUtils.currentLine=19136589;
 //BA.debugLineNum = 19136589;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=19136590;
 //BA.debugLineNum = 19136590;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=19136591;
 //BA.debugLineNum = 19136591;BA.debugLine="v = Header.GetView(col_x)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x);
RDebugUtils.currentLine=19136592;
 //BA.debugLineNum = 19136592;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19136593;
 //BA.debugLineNum = 19136593;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=19136594;
 //BA.debugLineNum = 19136594;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=19136595;
 //BA.debugLineNum = 19136595;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=19136596;
 //BA.debugLineNum = 19136596;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=19136599;
 //BA.debugLineNum = 19136599;BA.debugLine="Header.Width = Left";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=19136600;
 //BA.debugLineNum = 19136600;BA.debugLine="Header.Left = -SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=19136601;
 //BA.debugLineNum = 19136601;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=19136602;
 //BA.debugLineNum = 19136602;BA.debugLine="Header.Left = mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._mfirstcolumnswidth /*int*/ );
RDebugUtils.currentLine=19136603;
 //BA.debugLineNum = 19136603;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=19136604;
 //BA.debugLineNum = 19136604;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19136605;
 //BA.debugLineNum = 19136605;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step89 = 1;
final int limit89 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit89 ;_row = _row + step89 ) {
RDebugUtils.currentLine=19136606;
 //BA.debugLineNum = 19136606;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=19136607;
 //BA.debugLineNum = 19136607;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=19136608;
 //BA.debugLineNum = 19136608;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step92 = 1;
final int limit92 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit92 ;_col = _col + step92 ) {
RDebugUtils.currentLine=19136609;
 //BA.debugLineNum = 19136609;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Width";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),_widths[_col],(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19136610;
 //BA.debugLineNum = 19136610;BA.debugLine="Left = HeaderFirst.GetView(col).Left + HeaderF";
_left = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft()+__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth()+__ref._clinewidth /*int*/ );
 }
};
RDebugUtils.currentLine=19136612;
 //BA.debugLineNum = 19136612;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=19136613;
 //BA.debugLineNum = 19136613;BA.debugLine="For col = mNumberOfFixedColumns To lbls.Length";
{
final int step97 = 1;
final int limit97 = (int) (_lbls.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit97 ;_col = _col + step97 ) {
RDebugUtils.currentLine=19136614;
 //BA.debugLineNum = 19136614;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=19136615;
 //BA.debugLineNum = 19136615;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Heade";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19136616;
 //BA.debugLineNum = 19136616;BA.debugLine="Left = Left + Header.GetView(col_x).Width + cL";
_left = (int) (_left+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth()+__ref._clinewidth /*int*/ );
 }
};
 }
};
RDebugUtils.currentLine=19136619;
 //BA.debugLineNum = 19136619;BA.debugLine="SV2.Width = Min(Header.Width, cWidth - HeaderFir";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ -__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth())));
RDebugUtils.currentLine=19136620;
 //BA.debugLineNum = 19136620;BA.debugLine="pnlTable.Width = Min(HeaderFirst.Width + Header.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=19136621;
 //BA.debugLineNum = 19136621;BA.debugLine="lblStatusLine.Width = HeaderFirst.Width + Header";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=19136622;
 //BA.debugLineNum = 19136622;BA.debugLine="internalPanel.Width = HeaderFirst.Width + Header";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=19136624;
 //BA.debugLineNum = 19136624;BA.debugLine="pnlFastScroll.Left = pnlTable.Width - pnlFastScro";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=19136625;
 //BA.debugLineNum = 19136625;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=19136626;
 //BA.debugLineNum = 19136626;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=19136629;
 //BA.debugLineNum = 19136629;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=19136630;
 //BA.debugLineNum = 19136630;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_left,_top,_width,_height}));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="pnlTable.Initialize(\"\")";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18743304;
 //BA.debugLineNum = 18743304;BA.debugLine="Act.AddView(pnlTable, cLeft, cTop , cWidth, cHeig";
_act.AddView((android.view.View)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._cleft /*int*/ ,__ref._ctop /*int*/ ,__ref._cwidth /*int*/ ,__ref._cheight /*int*/ );
RDebugUtils.currentLine=18743306;
 //BA.debugLineNum = 18743306;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=18743307;
 //BA.debugLineNum = 18743307;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Private Sub InitTable";
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="lstRowColors.Initialize				'list of the different";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="lstRowColorIndexes.Initialize	'list of the color";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="lstRowDrawables.Initialize		'list of the drawable";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="pnlTable.Tag = \"Table\"";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)("Table"));
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="TableObject = Me";
__ref._tableobject /*b4a.example.ef.table*/  = (b4a.example.ef.table)(this);
RDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="SV2.Initialize(0, 0, \"SV2\")";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .Initialize(ba,(int) (0),(int) (0),"SV2");
RDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="SVF.Initialize2(0, \"SVF\")";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .Initialize2(ba,(int) (0),"SVF");
RDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="jo = SVF";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()));
RDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="jo.RunMethod(\"setVerticalScrollBarEnabled\", Array";
_jo.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=18808848;
 //BA.debugLineNum = 18808848;BA.debugLine="internalPanel.Initialize(\"IP\")";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"IP");
RDebugUtils.currentLine=18808849;
 //BA.debugLineNum = 18808849;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=18808851;
 //BA.debugLineNum = 18808851;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=18808852;
 //BA.debugLineNum = 18808852;BA.debugLine="SV2.FadingEdges(False)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .FadingEdges(__c.False);
RDebugUtils.currentLine=18808853;
 //BA.debugLineNum = 18808853;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=18808854;
 //BA.debugLineNum = 18808854;BA.debugLine="IsVisible = True";
__ref._isvisible /*boolean*/  = __c.True;
RDebugUtils.currentLine=18808855;
 //BA.debugLineNum = 18808855;BA.debugLine="HeaderFirst.Initialize(\"\")";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808856;
 //BA.debugLineNum = 18808856;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=18808857;
 //BA.debugLineNum = 18808857;BA.debugLine="HeaderBase.Initialize(\"\")";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808858;
 //BA.debugLineNum = 18808858;BA.debugLine="HeaderBase.Color = Colors.Transparent";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18808859;
 //BA.debugLineNum = 18808859;BA.debugLine="Header.Initialize(\"\")";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808860;
 //BA.debugLineNum = 18808860;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=18808862;
 //BA.debugLineNum = 18808862;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=18808863;
 //BA.debugLineNum = 18808863;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
 }else {
RDebugUtils.currentLine=18808865;
 //BA.debugLineNum = 18808865;BA.debugLine="mFirstColumnsWidth = 100dip";
__ref._mfirstcolumnswidth /*int*/  = __c.DipToCurrent((int) (100));
 };
RDebugUtils.currentLine=18808867;
 //BA.debugLineNum = 18808867;BA.debugLine="pnlTable.AddView(Header, mFirstColumnsWidth, 0 ,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,(int) (0),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=18808868;
 //BA.debugLineNum = 18808868;BA.debugLine="pnlTable.AddView(HeaderFirst, 0, 0, mFirstColumns";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mfirstcolumnswidth /*int*/ ,__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=18808871;
 //BA.debugLineNum = 18808871;BA.debugLine="lblStatusLine.Initialize(\"\")";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808872;
 //BA.debugLineNum = 18808872;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18808873;
 //BA.debugLineNum = 18808873;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18808874;
 //BA.debugLineNum = 18808874;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=18808875;
 //BA.debugLineNum = 18808875;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=18808876;
 //BA.debugLineNum = 18808876;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=18808877;
 //BA.debugLineNum = 18808877;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),__ref._cwidth /*int*/ ,__ref._cstatuslineheight /*int*/ );
 }else {
RDebugUtils.currentLine=18808879;
 //BA.debugLineNum = 18808879;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=18808880;
 //BA.debugLineNum = 18808880;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=18808881;
 //BA.debugLineNum = 18808881;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=18808883;
 //BA.debugLineNum = 18808883;BA.debugLine="SetPadding(lblStatusLine, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=18808884;
 //BA.debugLineNum = 18808884;BA.debugLine="pnlTable.AddView(internalPanel, 0, 0, cWidth, 0)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._cwidth /*int*/ ,(int) (0));
RDebugUtils.currentLine=18808886;
 //BA.debugLineNum = 18808886;BA.debugLine="pnlFastScroll.Initialize(\"pnlFastScroll\")";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnlFastScroll");
RDebugUtils.currentLine=18808887;
 //BA.debugLineNum = 18808887;BA.debugLine="pnlFastScroll.Color = FScBackgroundColor";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._fscbackgroundcolor /*int*/ );
RDebugUtils.currentLine=18808888;
 //BA.debugLineNum = 18808888;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=18808889;
 //BA.debugLineNum = 18808889;BA.debugLine="pnlTable.AddView(pnlFastScroll,  cWidth - FScCurs";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop(),__ref._fsccursorwidth /*int*/ ,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=18808890;
 //BA.debugLineNum = 18808890;BA.debugLine="pnlFastScrollCursor.Initialize(\"\")";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808891;
 //BA.debugLineNum = 18808891;BA.debugLine="pnlFastScrollCursor.Color = Colors.White";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=18808892;
 //BA.debugLineNum = 18808892;BA.debugLine="pnlFastScroll.AddView(pnlFastScrollCursor,  0, 0,";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=18808893;
 //BA.debugLineNum = 18808893;BA.debugLine="lblFastScroll.Initialize(\"\")";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808894;
 //BA.debugLineNum = 18808894;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=18808895;
 //BA.debugLineNum = 18808895;BA.debugLine="cdw.Initialize2(Colors.White, 3dip, 1dip, Colors.";
_cdw.Initialize2(__c.Colors.White,__c.DipToCurrent((int) (3)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
RDebugUtils.currentLine=18808896;
 //BA.debugLineNum = 18808896;BA.debugLine="lblFastScroll.Background = cdw";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
RDebugUtils.currentLine=18808897;
 //BA.debugLineNum = 18808897;BA.debugLine="lblFastScroll.TextColor = Colors.Black";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=18808898;
 //BA.debugLineNum = 18808898;BA.debugLine="lblFastScroll.Gravity = Bit.Or(Gravity.LEFT, Grav";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Bit.Or(__c.Gravity.LEFT,__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=18808899;
 //BA.debugLineNum = 18808899;BA.debugLine="lblFastScroll.Padding = Array As Int(5dip, 0, 0,";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setPadding(new int[]{__c.DipToCurrent((int) (5)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=18808900;
 //BA.debugLineNum = 18808900;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=18808901;
 //BA.debugLineNum = 18808901;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=18808902;
 //BA.debugLineNum = 18808902;BA.debugLine="pnlTable.AddView(lblFastScroll,  cWidth - mFastS";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._fsclabeltopdelta /*int*/ ,__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 }else {
RDebugUtils.currentLine=18808904;
 //BA.debugLineNum = 18808904;BA.debugLine="pnlTable.AddView(lblFastScroll,  0, (SV2.Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._mfastscrolllabelheight /*int*/ )/(double)2),__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 };
RDebugUtils.currentLine=18808906;
 //BA.debugLineNum = 18808906;BA.debugLine="FScTimer.Initialize(\"FastScrollTimer\", 1500)";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FastScrollTimer",(long) (1500));
RDebugUtils.currentLine=18808908;
 //BA.debugLineNum = 18808908;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=18808910;
 //BA.debugLineNum = 18808910;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=18808912;
 //BA.debugLineNum = 18808912;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18808913;
 //BA.debugLineNum = 18808913;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18808914;
 //BA.debugLineNum = 18808914;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18808915;
 //BA.debugLineNum = 18808915;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18808916;
 //BA.debugLineNum = 18808916;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=18808917;
 //BA.debugLineNum = 18808917;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step74 = 1;
final int limit74 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
RDebugUtils.currentLine=18808918;
 //BA.debugLineNum = 18808918;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18808919;
 //BA.debugLineNum = 18808919;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=18808920;
 //BA.debugLineNum = 18808920;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=18808921;
 //BA.debugLineNum = 18808921;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=18808922;
 //BA.debugLineNum = 18808922;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
 }
};
RDebugUtils.currentLine=18808924;
 //BA.debugLineNum = 18808924;BA.debugLine="SVF.Panel.Width = SVF.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setWidth(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=18808925;
 //BA.debugLineNum = 18808925;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=18808926;
 //BA.debugLineNum = 18808926;BA.debugLine="SV2.Panel.Width = SV2.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth());
RDebugUtils.currentLine=18808927;
 //BA.debugLineNum = 18808927;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=18808929;
 //BA.debugLineNum = 18808929;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=18808931;
 //BA.debugLineNum = 18808931;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=18808933;
 //BA.debugLineNum = 18808933;BA.debugLine="pnlSortingView.Initialize(\"\")";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18808934;
 //BA.debugLineNum = 18808934;BA.debugLine="If mCustomSortingBitmaps = False Then";
if (__ref._mcustomsortingbitmaps /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=18808935;
 //BA.debugLineNum = 18808935;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
 };
RDebugUtils.currentLine=18808939;
 //BA.debugLineNum = 18808939;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=18808940;
 //BA.debugLineNum = 18808940;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize2((android.graphics.Bitmap)(__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=18808948;
 //BA.debugLineNum = 18808948;BA.debugLine="End Sub";
return "";
}
public String  _addtoview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoview", false))
	 {return ((String) Debug.delegate(ba, "addtoview", new Object[] {_v,_left,_top,_width,_height}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
__ref._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Private Sub CalcFastScroll(Pos As Int)";
RDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="Private i, Top As Int";
_i = 0;
_top = 0;
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="Top = Pos * FScScale";
_top = (int) (_pos*__ref._fscscale /*double*/ );
RDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="lblFastScroll.Top = Top + FscLabelTopDelta";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (_top+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=23724039;
 //BA.debugLineNum = 23724039;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=23724040;
 //BA.debugLineNum = 23724040;BA.debugLine="i = (Pos + SV2.Height / 2) / cRowHeight";
_i = (int) ((_pos+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)2)/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=23724041;
 //BA.debugLineNum = 23724041;BA.debugLine="Private str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=23724042;
 //BA.debugLineNum = 23724042;BA.debugLine="str = Data.Get(i)";
_str = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=23724043;
 //BA.debugLineNum = 23724043;BA.debugLine="lblFastScroll.Text = str(mFastScrollColumnIndex)";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_str[__ref._mfastscrollcolumnindex /*int*/ ].substring((int) (0),(int) (__c.Min(_str[__ref._mfastscrollcolumnindex /*int*/ ].length(),__ref._mfastscrolllabelmaxchars /*int*/ )))));
 };
RDebugUtils.currentLine=23724046;
 //BA.debugLineNum = 23724046;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_click", false))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=20185096;
 //BA.debugLineNum = 20185096;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellClick\"";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick")) { 
RDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellClick\", r";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=20185099;
 //BA.debugLineNum = 20185099;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(b4a.example.ef.table __ref,b4a.example.ef.table._rowcol _rc) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "selectrow", false))
	 {return ((String) Debug.delegate(ba, "selectrow", new Object[] {_rc}));}
int _previndex = 0;
int _prev = 0;
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
RDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
_prev = 0;
RDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="If (prevIndex <> -1 And mMultiSelect = False) The";
if ((_previndex!=-1 && __ref._mmultiselect /*boolean*/ ==__c.False)) { 
RDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=20381706;
 //BA.debugLineNum = 20381706;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=20381707;
 //BA.debugLineNum = 20381707;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=20381710;
 //BA.debugLineNum = 20381710;BA.debugLine="If mZeroSelection = False Then";
if (__ref._mzeroselection /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=20381715;
 //BA.debugLineNum = 20381715;BA.debugLine="If (prevIndex = -1) Then";
if ((_previndex==-1)) { 
RDebugUtils.currentLine=20381716;
 //BA.debugLineNum = 20381716;BA.debugLine="If (mMultiSelect) Then";
if ((__ref._mmultiselect /*boolean*/ )) { 
RDebugUtils.currentLine=20381717;
 //BA.debugLineNum = 20381717;BA.debugLine="SelectedRows.Add(rc.Row) 'Select the new row";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=20381718;
 //BA.debugLineNum = 20381718;BA.debugLine="prev = -1";
_prev = (int) (-1);
 }else {
RDebugUtils.currentLine=20381722;
 //BA.debugLineNum = 20381722;BA.debugLine="If (SelectedRows.Size <> 0) Then";
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()!=0)) { 
RDebugUtils.currentLine=20381723;
 //BA.debugLineNum = 20381723;BA.debugLine="prev = SelectedRows.Get(0) ' there should be o";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=20381724;
 //BA.debugLineNum = 20381724;BA.debugLine="SelectedRows.set(0, rc.Row) ' change it to the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (0),(Object)(_rc.Row /*int*/ ));
 }else {
RDebugUtils.currentLine=20381726;
 //BA.debugLineNum = 20381726;BA.debugLine="prev = -1";
_prev = (int) (-1);
RDebugUtils.currentLine=20381727;
 //BA.debugLineNum = 20381727;BA.debugLine="SelectedRows.Add(rc.Row)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
 };
 };
 }else {
RDebugUtils.currentLine=20381732;
 //BA.debugLineNum = 20381732;BA.debugLine="prev = SelectedRows.Get(prevIndex) ' should be R";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_previndex)));
RDebugUtils.currentLine=20381733;
 //BA.debugLineNum = 20381733;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=20381736;
 //BA.debugLineNum = 20381736;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
RDebugUtils.currentLine=20381737;
 //BA.debugLineNum = 20381737;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=20381738;
 //BA.debugLineNum = 20381738;BA.debugLine="HideRow(prev)";
__ref._hiderow /*String*/ (null,_prev);
RDebugUtils.currentLine=20381739;
 //BA.debugLineNum = 20381739;BA.debugLine="ShowRow(prev)";
__ref._showrow /*void*/ (null,_prev);
 };
 };
RDebugUtils.currentLine=20381743;
 //BA.debugLineNum = 20381743;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=20381744;
 //BA.debugLineNum = 20381744;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=20381745;
 //BA.debugLineNum = 20381745;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=20381746;
 //BA.debugLineNum = 20381746;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=20381748;
 //BA.debugLineNum = 20381748;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_longclick", false))
	 {return ((String) Debug.delegate(ba, "cell_longclick", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellLongCl";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick")) { 
RDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellLongClick";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=20054026;
 //BA.debugLineNum = 20054026;BA.debugLine="End Sub";
return "";
}
public boolean  _check1ddoubleallsame(b4a.example.ef.table __ref,double[] _arrdouble,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1ddoubleallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1ddoubleallsame", new Object[] {_arrdouble,_istart,_iend}));}
int _i = 0;
double _dval = 0;
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Sub Check1DDoubleAllSame(arrDouble() As Double, iS";
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=30998531;
 //BA.debugLineNum = 30998531;BA.debugLine="Dim dVal As Double";
_dval = 0;
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="If arrDouble.Length = 1 Then";
if (_arrdouble.length==1) { 
RDebugUtils.currentLine=30998534;
 //BA.debugLineNum = 30998534;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=30998537;
 //BA.debugLineNum = 30998537;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=30998538;
 //BA.debugLineNum = 30998538;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=30998541;
 //BA.debugLineNum = 30998541;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=30998542;
 //BA.debugLineNum = 30998542;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=30998545;
 //BA.debugLineNum = 30998545;BA.debugLine="dVal = arrDouble(0)";
_dval = _arrdouble[(int) (0)];
RDebugUtils.currentLine=30998547;
 //BA.debugLineNum = 30998547;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=30998548;
 //BA.debugLineNum = 30998548;BA.debugLine="If arrDouble(i) <> dVal Then";
if (_arrdouble[_i]!=_dval) { 
RDebugUtils.currentLine=30998549;
 //BA.debugLineNum = 30998549;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=30998553;
 //BA.debugLineNum = 30998553;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=30998555;
 //BA.debugLineNum = 30998555;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dlongallsame(b4a.example.ef.table __ref,long[] _arrlong,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dlongallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dlongallsame", new Object[] {_arrlong,_istart,_iend}));}
int _i = 0;
long _lval = 0L;
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Sub Check1DLongAllSame(arrLong() As Long, iStart A";
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="Dim lVal As Long";
_lval = 0L;
RDebugUtils.currentLine=30867461;
 //BA.debugLineNum = 30867461;BA.debugLine="If arrLong.Length = 1 Then";
if (_arrlong.length==1) { 
RDebugUtils.currentLine=30867462;
 //BA.debugLineNum = 30867462;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=30867465;
 //BA.debugLineNum = 30867465;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=30867466;
 //BA.debugLineNum = 30867466;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=30867469;
 //BA.debugLineNum = 30867469;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=30867470;
 //BA.debugLineNum = 30867470;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=30867473;
 //BA.debugLineNum = 30867473;BA.debugLine="lVal = arrLong(0)";
_lval = _arrlong[(int) (0)];
RDebugUtils.currentLine=30867475;
 //BA.debugLineNum = 30867475;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=30867476;
 //BA.debugLineNum = 30867476;BA.debugLine="If arrLong(i) <> lVal Then";
if (_arrlong[_i]!=_lval) { 
RDebugUtils.currentLine=30867477;
 //BA.debugLineNum = 30867477;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=30867481;
 //BA.debugLineNum = 30867481;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=30867483;
 //BA.debugLineNum = 30867483;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dstringallsame(b4a.example.ef.table __ref,String[] _arrstring,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dstringallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dstringallsame", new Object[] {_arrstring,_bcaseinsensitive,_istart,_iend}));}
int _i = 0;
String _str = "";
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Sub Check1DStringAllSame(arrstring() As String, bC";
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=31260677;
 //BA.debugLineNum = 31260677;BA.debugLine="If arrstring.Length = 1 Then";
if (_arrstring.length==1) { 
RDebugUtils.currentLine=31260678;
 //BA.debugLineNum = 31260678;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=31260681;
 //BA.debugLineNum = 31260681;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=31260682;
 //BA.debugLineNum = 31260682;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=31260685;
 //BA.debugLineNum = 31260685;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=31260686;
 //BA.debugLineNum = 31260686;BA.debugLine="iEnd = arrstring.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=31260689;
 //BA.debugLineNum = 31260689;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=31260690;
 //BA.debugLineNum = 31260690;BA.debugLine="str = arrstring(0).ToLowerCase";
_str = _arrstring[(int) (0)].toLowerCase();
RDebugUtils.currentLine=31260691;
 //BA.debugLineNum = 31260691;BA.debugLine="For i = iStart To iEnd";
{
final int step14 = 1;
final int limit14 = _iend;
_i = _istart ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=31260692;
 //BA.debugLineNum = 31260692;BA.debugLine="If arrstring(i).ToLowerCase.CompareTo(str) <> 0";
if (_arrstring[_i].toLowerCase().compareTo(_str)!=0) { 
RDebugUtils.currentLine=31260693;
 //BA.debugLineNum = 31260693;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 }else {
RDebugUtils.currentLine=31260697;
 //BA.debugLineNum = 31260697;BA.debugLine="str = arrstring(0)";
_str = _arrstring[(int) (0)];
RDebugUtils.currentLine=31260698;
 //BA.debugLineNum = 31260698;BA.debugLine="For i = iStart To iEnd";
{
final int step21 = 1;
final int limit21 = _iend;
_i = _istart ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=31260699;
 //BA.debugLineNum = 31260699;BA.debugLine="If arrstring(i).CompareTo(str) <> 0 Then";
if (_arrstring[_i].compareTo(_str)!=0) { 
RDebugUtils.currentLine=31260700;
 //BA.debugLineNum = 31260700;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 };
RDebugUtils.currentLine=31260705;
 //BA.debugLineNum = 31260705;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=31260707;
 //BA.debugLineNum = 31260707;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Private Sub CheckColumnDataTypes(MyCurs As Cursor)";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="Private NbCols, NbRows As Int";
_nbcols = 0;
_nbrows = 0;
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="NbCols = MyCurs.ColumnCount";
_nbcols = _mycurs.getColumnCount();
RDebugUtils.currentLine=26411011;
 //BA.debugLineNum = 26411011;BA.debugLine="NbRows = MyCurs.RowCount";
_nbrows = _mycurs.getRowCount();
RDebugUtils.currentLine=26411013;
 //BA.debugLineNum = 26411013;BA.debugLine="Private ColumnTypes(NbCols), str As String";
_columntypes = new String[_nbcols];
java.util.Arrays.fill(_columntypes,"");
_str = "";
RDebugUtils.currentLine=26411014;
 //BA.debugLineNum = 26411014;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=26411016;
 //BA.debugLineNum = 26411016;BA.debugLine="For col = 0 To NbCols - 1";
{
final int step6 = 1;
final int limit6 = (int) (_nbcols-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=26411017;
 //BA.debugLineNum = 26411017;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=26411018;
 //BA.debugLineNum = 26411018;BA.debugLine="For row = 0 To NbRows - 1";
{
final int step8 = 1;
final int limit8 = (int) (_nbrows-1);
_row = (int) (0) ;
for (;_row <= limit8 ;_row = _row + step8 ) {
RDebugUtils.currentLine=26411019;
 //BA.debugLineNum = 26411019;BA.debugLine="MyCurs.Position = row";
_mycurs.setPosition(_row);
RDebugUtils.currentLine=26411020;
 //BA.debugLineNum = 26411020;BA.debugLine="str = MyCurs.GetString2(col)";
_str = _mycurs.GetString2(_col);
RDebugUtils.currentLine=26411021;
 //BA.debugLineNum = 26411021;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=26411022;
 //BA.debugLineNum = 26411022;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=26411024;
 //BA.debugLineNum = 26411024;BA.debugLine="If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=26411025;
 //BA.debugLineNum = 26411025;BA.debugLine="If str.Contains(\".\") Then";
if (_str.contains(".")) { 
RDebugUtils.currentLine=26411026;
 //BA.debugLineNum = 26411026;BA.debugLine="ColumnTypes(col) = \"R\"";
_columntypes[_col] = "R";
 }else {
RDebugUtils.currentLine=26411028;
 //BA.debugLineNum = 26411028;BA.debugLine="ColumnTypes(col) = \"I\"";
_columntypes[_col] = "I";
 };
 }else {
RDebugUtils.currentLine=26411031;
 //BA.debugLineNum = 26411031;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=26411032;
 //BA.debugLineNum = 26411032;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=26411037;
 //BA.debugLineNum = 26411037;BA.debugLine="Return ColumnTypes";
if (true) return _columntypes;
RDebugUtils.currentLine=26411038;
 //BA.debugLineNum = 26411038;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="Private SV2 As ScrollView2D";
_sv2 = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="Private SVF As ScrollView";
_svf = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="Private pnlTable As Panel";
_pnltable = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481158;
 //BA.debugLineNum = 18481158;BA.debugLine="Private Header, HeaderBase As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
_headerbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="Private HeaderFirst As Panel";
_headerfirst = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481160;
 //BA.debugLineNum = 18481160;BA.debugLine="Private lblStatusLine As Label";
_lblstatusline = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18481162;
 //BA.debugLineNum = 18481162;BA.debugLine="Private pnlFastScroll As Panel";
_pnlfastscroll = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481163;
 //BA.debugLineNum = 18481163;BA.debugLine="Private pnlFastScrollCursor As Panel";
_pnlfastscrollcursor = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481164;
 //BA.debugLineNum = 18481164;BA.debugLine="Private FScCursorWidth = 25dip As Int";
_fsccursorwidth = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=18481165;
 //BA.debugLineNum = 18481165;BA.debugLine="Private FScCursorHeight = 60dip As Int";
_fsccursorheight = __c.DipToCurrent((int) (60));
RDebugUtils.currentLine=18481166;
 //BA.debugLineNum = 18481166;BA.debugLine="Private FscLabelTopDelta As Int";
_fsclabeltopdelta = 0;
RDebugUtils.currentLine=18481167;
 //BA.debugLineNum = 18481167;BA.debugLine="Private FScBackgroundColor = Colors.ARGB(48, 128,";
_fscbackgroundcolor = __c.Colors.ARGB((int) (48),(int) (128),(int) (128),(int) (128));
RDebugUtils.currentLine=18481168;
 //BA.debugLineNum = 18481168;BA.debugLine="Private FScCursorCol1 = Colors.Blue As Int";
_fsccursorcol1 = __c.Colors.Blue;
RDebugUtils.currentLine=18481169;
 //BA.debugLineNum = 18481169;BA.debugLine="Private FScCursorCol2 = Colors.Yellow As Int";
_fsccursorcol2 = __c.Colors.Yellow;
RDebugUtils.currentLine=18481170;
 //BA.debugLineNum = 18481170;BA.debugLine="Private lblFastScroll As Label";
_lblfastscroll = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=18481171;
 //BA.debugLineNum = 18481171;BA.debugLine="Private FSY0, FSdY, FastScrollHeight As Int";
_fsy0 = 0;
_fsdy = 0;
_fastscrollheight = 0;
RDebugUtils.currentLine=18481172;
 //BA.debugLineNum = 18481172;BA.debugLine="Private FScScale As Double";
_fscscale = 0;
RDebugUtils.currentLine=18481173;
 //BA.debugLineNum = 18481173;BA.debugLine="Private FScTimer As Timer";
_fsctimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=18481174;
 //BA.debugLineNum = 18481174;BA.debugLine="Private mFastScroll = False As Boolean";
_mfastscroll = __c.False;
RDebugUtils.currentLine=18481175;
 //BA.debugLineNum = 18481175;BA.debugLine="Private FastScrollActive As Boolean";
_fastscrollactive = false;
RDebugUtils.currentLine=18481176;
 //BA.debugLineNum = 18481176;BA.debugLine="Private mFastScrollColumnIndex = 0 As Int";
_mfastscrollcolumnindex = (int) (0);
RDebugUtils.currentLine=18481177;
 //BA.debugLineNum = 18481177;BA.debugLine="Private mFastScrollMinItems = 50 As Int";
_mfastscrollminitems = (int) (50);
RDebugUtils.currentLine=18481178;
 //BA.debugLineNum = 18481178;BA.debugLine="Private mFastScrollShowLabel = True As Boolean";
_mfastscrollshowlabel = __c.True;
RDebugUtils.currentLine=18481179;
 //BA.debugLineNum = 18481179;BA.debugLine="Private mFastScrollFixedLabel = False As Boolean";
_mfastscrollfixedlabel = __c.False;
RDebugUtils.currentLine=18481180;
 //BA.debugLineNum = 18481180;BA.debugLine="Private mFastScrollLabelMaxChars = 10 As Int";
_mfastscrolllabelmaxchars = (int) (10);
RDebugUtils.currentLine=18481181;
 //BA.debugLineNum = 18481181;BA.debugLine="Private mFastScrollLabelWidth = 150dip As Int";
_mfastscrolllabelwidth = __c.DipToCurrent((int) (150));
RDebugUtils.currentLine=18481182;
 //BA.debugLineNum = 18481182;BA.debugLine="Private mFastScrollLabelHeight = 30dip As Int";
_mfastscrolllabelheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=18481184;
 //BA.debugLineNum = 18481184;BA.debugLine="Private cCallBack As Object";
_ccallback = new Object();
RDebugUtils.currentLine=18481185;
 //BA.debugLineNum = 18481185;BA.debugLine="Private cEventName As String";
_ceventname = "";
RDebugUtils.currentLine=18481186;
 //BA.debugLineNum = 18481186;BA.debugLine="Private cLeft, cTop , cWidth, cHeight As Int";
_cleft = 0;
_ctop = 0;
_cwidth = 0;
_cheight = 0;
RDebugUtils.currentLine=18481187;
 //BA.debugLineNum = 18481187;BA.debugLine="Public HeaderNames As List";
_headernames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481188;
 //BA.debugLineNum = 18481188;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
_selectedrows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481189;
 //BA.debugLineNum = 18481189;BA.debugLine="Private SelectedCol As Int";
_selectedcol = 0;
RDebugUtils.currentLine=18481190;
 //BA.debugLineNum = 18481190;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481191;
 //BA.debugLineNum = 18481191;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481192;
 //BA.debugLineNum = 18481192;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
RDebugUtils.currentLine=18481193;
 //BA.debugLineNum = 18481193;BA.debugLine="Private IsVisible As Boolean";
_isvisible = false;
RDebugUtils.currentLine=18481194;
 //BA.debugLineNum = 18481194;BA.debugLine="Public visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18481195;
 //BA.debugLineNum = 18481195;BA.debugLine="Private mNumberOfColumns, ColumnWidths(), cColumn";
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
RDebugUtils.currentLine=18481196;
 //BA.debugLineNum = 18481196;BA.debugLine="Private cColumnDataType() As String";
_ccolumndatatype = new String[(int) (0)];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=18481197;
 //BA.debugLineNum = 18481197;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
_crowheight = 0;
_cheadercolor = 0;
_ctablecolor = 0;
_ctextcolor = 0;
_cheaderheight = 0;
_cheadertextcolor = 0;
_cstatuslineheight = 0;
RDebugUtils.currentLine=18481198;
 //BA.debugLineNum = 18481198;BA.debugLine="Private cAutomaticWidths = False As Boolean";
_cautomaticwidths = __c.False;
RDebugUtils.currentLine=18481199;
 //BA.debugLineNum = 18481199;BA.debugLine="Private cTextSize As Float";
_ctextsize = 0f;
RDebugUtils.currentLine=18481200;
 //BA.debugLineNum = 18481200;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
RDebugUtils.currentLine=18481201;
 //BA.debugLineNum = 18481201;BA.debugLine="Private cAlignment As Int";
_calignment = 0;
RDebugUtils.currentLine=18481202;
 //BA.debugLineNum = 18481202;BA.debugLine="Private cAlignments() As Int";
_calignments = new int[(int) (0)];
;
RDebugUtils.currentLine=18481203;
 //BA.debugLineNum = 18481203;BA.debugLine="Private cAlignments0() As Int";
_calignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=18481204;
 //BA.debugLineNum = 18481204;BA.debugLine="Private MultiAlignments = False As Boolean";
_multialignments = __c.False;
RDebugUtils.currentLine=18481205;
 //BA.debugLineNum = 18481205;BA.debugLine="Private MultiTypeFace = False As Boolean";
_multitypeface = __c.False;
RDebugUtils.currentLine=18481206;
 //BA.debugLineNum = 18481206;BA.debugLine="Private MultiTextColors = False As Boolean";
_multitextcolors = __c.False;
RDebugUtils.currentLine=18481207;
 //BA.debugLineNum = 18481207;BA.debugLine="Private cHeaderAlignment = Gravity.CENTER As Int";
_cheaderalignment = __c.Gravity.CENTER;
RDebugUtils.currentLine=18481208;
 //BA.debugLineNum = 18481208;BA.debugLine="Private cHeaderAlignments() As Int";
_cheaderalignments = new int[(int) (0)];
;
RDebugUtils.currentLine=18481209;
 //BA.debugLineNum = 18481209;BA.debugLine="Private cHeaderAlignments0() As Int";
_cheaderalignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=18481210;
 //BA.debugLineNum = 18481210;BA.debugLine="Private HeaderMultiAlignments = False As Boolean";
_headermultialignments = __c.False;
RDebugUtils.currentLine=18481211;
 //BA.debugLineNum = 18481211;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
_ctypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_ctypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=18481212;
 //BA.debugLineNum = 18481212;BA.debugLine="Private cTypeFaces() As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=18481213;
 //BA.debugLineNum = 18481213;BA.debugLine="Private cTypeFaces0() As Typeface";
_ctypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=18481214;
 //BA.debugLineNum = 18481214;BA.debugLine="Private HeaderMultiTypeFace = False As Boolean";
_headermultitypeface = __c.False;
RDebugUtils.currentLine=18481215;
 //BA.debugLineNum = 18481215;BA.debugLine="Private cHeaderTypeFace = Typeface.DEFAULT As Typ";
_cheadertypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_cheadertypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=18481216;
 //BA.debugLineNum = 18481216;BA.debugLine="Private cHeaderTypeFaces() As Typeface";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=18481217;
 //BA.debugLineNum = 18481217;BA.debugLine="Private cHeaderTypeFaces0() As Typeface";
_cheadertypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=18481218;
 //BA.debugLineNum = 18481218;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
_clinewidth = (int) (__c.Max(1,__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=18481219;
 //BA.debugLineNum = 18481219;BA.debugLine="Private ExtraWidth = 12dip + cLineWidth	As Int";
_extrawidth = (int) (__c.DipToCurrent((int) (12))+__ref._clinewidth /*int*/ );
RDebugUtils.currentLine=18481220;
 //BA.debugLineNum = 18481220;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
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
RDebugUtils.currentLine=18481221;
 //BA.debugLineNum = 18481221;BA.debugLine="Private SelectedCellDrawable As Object";
_selectedcelldrawable = new Object();
RDebugUtils.currentLine=18481222;
 //BA.debugLineNum = 18481222;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
_crowcolor1 = 0;
_crowcolor2 = 0;
_cselectedrowcolor = 0;
_cselectedcellcolor = 0;
_cselectedrowtextcolor = 0;
_cselectedcelltextcolor = 0;
RDebugUtils.currentLine=18481223;
 //BA.debugLineNum = 18481223;BA.debugLine="Private cSortColumn = True As Boolean";
_csortcolumn = __c.True;
RDebugUtils.currentLine=18481224;
 //BA.debugLineNum = 18481224;BA.debugLine="Private cUseColumnColors = False As Boolean";
_cusecolumncolors = __c.False;
RDebugUtils.currentLine=18481225;
 //BA.debugLineNum = 18481225;BA.debugLine="Private cSortRemoveAccents = False As Boolean";
_csortremoveaccents = __c.False;
RDebugUtils.currentLine=18481226;
 //BA.debugLineNum = 18481226;BA.debugLine="Private mFirstColumnsWidth = 0 As Int";
_mfirstcolumnswidth = (int) (0);
RDebugUtils.currentLine=18481227;
 //BA.debugLineNum = 18481227;BA.debugLine="Private mFirstColumnFixed = False As Boolean";
_mfirstcolumnfixed = __c.False;
RDebugUtils.currentLine=18481228;
 //BA.debugLineNum = 18481228;BA.debugLine="Private mNumberOfFixedColumns As Int";
_mnumberoffixedcolumns = 0;
RDebugUtils.currentLine=18481229;
 //BA.debugLineNum = 18481229;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=18481230;
 //BA.debugLineNum = 18481230;BA.debugLine="Private cvs As Canvas		' used to measure string w";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=18481231;
 //BA.debugLineNum = 18481231;BA.debugLine="Private lstRowColorIndexes As List";
_lstrowcolorindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481232;
 //BA.debugLineNum = 18481232;BA.debugLine="Private lstRowColors As List";
_lstrowcolors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481233;
 //BA.debugLineNum = 18481233;BA.debugLine="Private lstRowDrawables As List";
_lstrowdrawables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481235;
 //BA.debugLineNum = 18481235;BA.debugLine="cHeaderColor = Colors.Gray";
__ref._cheadercolor /*int*/  = __c.Colors.Gray;
RDebugUtils.currentLine=18481236;
 //BA.debugLineNum = 18481236;BA.debugLine="cTableColor = Colors.LightGray";
__ref._ctablecolor /*int*/  = __c.Colors.LightGray;
RDebugUtils.currentLine=18481237;
 //BA.debugLineNum = 18481237;BA.debugLine="cTextColor = Colors.Black";
__ref._ctextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=18481238;
 //BA.debugLineNum = 18481238;BA.debugLine="cHeaderTextColor = Colors.White";
__ref._cheadertextcolor /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=18481239;
 //BA.debugLineNum = 18481239;BA.debugLine="cTextSize = 14";
__ref._ctextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=18481240;
 //BA.debugLineNum = 18481240;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
RDebugUtils.currentLine=18481241;
 //BA.debugLineNum = 18481241;BA.debugLine="cRowColor1 = Colors.White";
__ref._crowcolor1 /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=18481242;
 //BA.debugLineNum = 18481242;BA.debugLine="cRowColor2 = 0xFF98F5FF";
__ref._crowcolor2 /*int*/  = ((int)0xff98f5ff);
RDebugUtils.currentLine=18481243;
 //BA.debugLineNum = 18481243;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
__ref._cselectedrowcolor /*int*/  = ((int)0xff007fff);
RDebugUtils.currentLine=18481244;
 //BA.debugLineNum = 18481244;BA.debugLine="cSelectedRowTextColor = Colors.Black";
__ref._cselectedrowtextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=18481245;
 //BA.debugLineNum = 18481245;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
__ref._cselectedcellcolor /*int*/  = ((int)0xfffc8eac);
RDebugUtils.currentLine=18481246;
 //BA.debugLineNum = 18481246;BA.debugLine="cSelectedCellTextColor = Colors.Black";
__ref._cselectedcelltextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=18481247;
 //BA.debugLineNum = 18481247;BA.debugLine="cRowHeight = 40dip";
__ref._crowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=18481248;
 //BA.debugLineNum = 18481248;BA.debugLine="cHeaderHeight = cRowHeight";
__ref._cheaderheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=18481249;
 //BA.debugLineNum = 18481249;BA.debugLine="cStatusLineHeight = cRowHeight";
__ref._cstatuslineheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=18481251;
 //BA.debugLineNum = 18481251;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
_csingleline = __c.True;
RDebugUtils.currentLine=18481253;
 //BA.debugLineNum = 18481253;BA.debugLine="Private mMultiSelect As Boolean = False";
_mmultiselect = __c.False;
RDebugUtils.currentLine=18481254;
 //BA.debugLineNum = 18481254;BA.debugLine="Private cAllowSelection = True As Boolean";
_callowselection = __c.True;
RDebugUtils.currentLine=18481255;
 //BA.debugLineNum = 18481255;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
_savedwidths = new int[(int) (0)];
;
RDebugUtils.currentLine=18481256;
 //BA.debugLineNum = 18481256;BA.debugLine="Private cShowStatusLine As Boolean =True";
_cshowstatusline = __c.True;
RDebugUtils.currentLine=18481258;
 //BA.debugLineNum = 18481258;BA.debugLine="Private internalPanel As Panel";
_internalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481260;
 //BA.debugLineNum = 18481260;BA.debugLine="Public sortingDir As Int = 0 ' -1,0,1 as acc, uns";
_sortingdir = (int) (0);
RDebugUtils.currentLine=18481261;
 //BA.debugLineNum = 18481261;BA.debugLine="Public sortedCol As Int = -1' hold the sorted col";
_sortedcol = (int) (-1);
RDebugUtils.currentLine=18481262;
 //BA.debugLineNum = 18481262;BA.debugLine="Private pnlSortingView As Panel";
_pnlsortingview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481264;
 //BA.debugLineNum = 18481264;BA.debugLine="Private debug_counter As Long";
_debug_counter = 0L;
RDebugUtils.currentLine=18481265;
 //BA.debugLineNum = 18481265;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
_enablestatuslineautofill = __c.True;
RDebugUtils.currentLine=18481267;
 //BA.debugLineNum = 18481267;BA.debugLine="Private pnlAsc As Panel										'added in versio";
_pnlasc = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=18481268;
 //BA.debugLineNum = 18481268;BA.debugLine="Private bmpAsc, bmpDes, bmpEqual As Bitmap					'a";
_bmpasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=18481269;
 //BA.debugLineNum = 18481269;BA.debugLine="Private cvsAsc, cvsDes, cvsEqual As Canvas					'a";
_cvsasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=18481270;
 //BA.debugLineNum = 18481270;BA.debugLine="Private cSortBitmapWidth As Int						'added in ve";
_csortbitmapwidth = 0;
RDebugUtils.currentLine=18481271;
 //BA.debugLineNum = 18481271;BA.debugLine="Private cSortBitmapHeight As Int					'added in ve";
_csortbitmapheight = 0;
RDebugUtils.currentLine=18481272;
 //BA.debugLineNum = 18481272;BA.debugLine="Private cSortBitmapColor As Int						'added in ve";
_csortbitmapcolor = 0;
RDebugUtils.currentLine=18481273;
 //BA.debugLineNum = 18481273;BA.debugLine="Private mCustomSortingBitmaps As Boolean	'added i";
_mcustomsortingbitmaps = false;
RDebugUtils.currentLine=18481274;
 //BA.debugLineNum = 18481274;BA.debugLine="Private mZeroSelection = False As Boolean";
_mzeroselection = __c.False;
RDebugUtils.currentLine=18481275;
 //BA.debugLineNum = 18481275;BA.debugLine="Private SV2Scrolls, SVFScrolls As Boolean";
_sv2scrolls = false;
_svfscrolls = false;
RDebugUtils.currentLine=18481276;
 //BA.debugLineNum = 18481276;BA.debugLine="Private SV2PosX As Int";
_sv2posx = 0;
RDebugUtils.currentLine=18481277;
 //BA.debugLineNum = 18481277;BA.debugLine="Public TableObject As Table";
_tableobject = new b4a.example.ef.table();
RDebugUtils.currentLine=18481282;
 //BA.debugLineNum = 18481282;BA.debugLine="Private arrColLong() As Long";
_arrcollong = new long[(int) (0)];
;
RDebugUtils.currentLine=18481283;
 //BA.debugLineNum = 18481283;BA.debugLine="Private arrColDouble() As Double";
_arrcoldouble = new double[(int) (0)];
;
RDebugUtils.currentLine=18481284;
 //BA.debugLineNum = 18481284;BA.debugLine="Private arrColString() As String";
_arrcolstring = new String[(int) (0)];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=18481285;
 //BA.debugLineNum = 18481285;BA.debugLine="Private arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=18481286;
 //BA.debugLineNum = 18481286;BA.debugLine="Private iPreviousSortColumn As Int = -1 'ignore w";
_iprevioussortcolumn = (int) (-1);
RDebugUtils.currentLine=18481287;
 //BA.debugLineNum = 18481287;BA.debugLine="Private bPreviousSortAscending As Boolean 'ignore";
_bprevioussortascending = false;
RDebugUtils.currentLine=18481288;
 //BA.debugLineNum = 18481288;BA.debugLine="Private mapSortingIndexes As Map";
_mapsortingindexes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=18481289;
 //BA.debugLineNum = 18481289;BA.debugLine="Private arrDataSorted() As Boolean 'added";
_arrdatasorted = new boolean[(int) (0)];
;
RDebugUtils.currentLine=18481290;
 //BA.debugLineNum = 18481290;BA.debugLine="Private bDataTempDone As Boolean 'added";
_bdatatempdone = false;
RDebugUtils.currentLine=18481291;
 //BA.debugLineNum = 18481291;BA.debugLine="Private DataTemp As List 'added";
_datatemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18481292;
 //BA.debugLineNum = 18481292;BA.debugLine="Private mMultiColumnSort As Boolean = False";
_mmulticolumnsort = __c.False;
RDebugUtils.currentLine=18481293;
 //BA.debugLineNum = 18481293;BA.debugLine="Private mSortCaseInsensitive As Boolean = False";
_msortcaseinsensitive = __c.False;
RDebugUtils.currentLine=18481295;
 //BA.debugLineNum = 18481295;BA.debugLine="End Sub";
return "";
}
public String  _clearall(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearall", false))
	 {return ((String) Debug.delegate(ba, "clearall", null));}
RDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Public Sub ClearAll";
RDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int,";
RDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="SV2.Panel.RemoveAllViews";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="SVF.Panel.RemoveAllViews";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="mNumberOfColumns = vNumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _vnumberofcolumns;
RDebugUtils.currentLine=19267589;
 //BA.debugLineNum = 19267589;BA.debugLine="Dim Drawable1(mNumberOfColumns) As Object";
_drawable1 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
RDebugUtils.currentLine=19267590;
 //BA.debugLineNum = 19267590;BA.debugLine="Dim Drawable2(mNumberOfColumns) As Object";
_drawable2 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=19267591;
 //BA.debugLineNum = 19267591;BA.debugLine="Dim SelectedDrawable(mNumberOfColumns) As Object";
_selecteddrawable = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
RDebugUtils.currentLine=19267592;
 //BA.debugLineNum = 19267592;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=19267593;
 //BA.debugLineNum = 19267593;BA.debugLine="Dim cHeaderAlignments(mNumberOfColumns) As Int";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=19267594;
 //BA.debugLineNum = 19267594;BA.debugLine="Dim cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=19267595;
 //BA.debugLineNum = 19267595;BA.debugLine="Dim cHeaderTypeFaces(mNumberOfColumns) As Typefac";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=19267597;
 //BA.debugLineNum = 19267597;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19267598;
 //BA.debugLineNum = 19267598;BA.debugLine="If lstRowColors.Size > 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=19267599;
 //BA.debugLineNum = 19267599;BA.debugLine="For i = 0 To lstRowColors.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=19267600;
 //BA.debugLineNum = 19267600;BA.debugLine="Private cds(mNumberOfColumns) As Object";
_cds = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cds.length;
for (int i0 = 0;i0 < d0;i0++) {
_cds[i0] = new Object();
}
}
;
RDebugUtils.currentLine=19267601;
 //BA.debugLineNum = 19267601;BA.debugLine="Private color = lstRowColors.Get(i) As Int";
_color = (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=19267602;
 //BA.debugLineNum = 19267602;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=19267603;
 //BA.debugLineNum = 19267603;BA.debugLine="Private cdi As ColorDrawable";
_cdi = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=19267604;
 //BA.debugLineNum = 19267604;BA.debugLine="cdi.Initialize(color, 0)";
_cdi.Initialize(_color,(int) (0));
RDebugUtils.currentLine=19267605;
 //BA.debugLineNum = 19267605;BA.debugLine="cds(col) = cdi";
_cds[_col] = (Object)(_cdi.getObject());
 }
};
RDebugUtils.currentLine=19267607;
 //BA.debugLineNum = 19267607;BA.debugLine="lstRowDrawables.Add(cds)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cds));
 }
};
 };
RDebugUtils.currentLine=19267610;
 //BA.debugLineNum = 19267610;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=19267611;
 //BA.debugLineNum = 19267611;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=19267612;
 //BA.debugLineNum = 19267612;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
_cd1.Initialize(__ref._crowcolor1 /*int*/ ,(int) (0));
RDebugUtils.currentLine=19267613;
 //BA.debugLineNum = 19267613;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
_cd2.Initialize(__ref._crowcolor2 /*int*/ ,(int) (0));
RDebugUtils.currentLine=19267614;
 //BA.debugLineNum = 19267614;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=19267615;
 //BA.debugLineNum = 19267615;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=19267616;
 //BA.debugLineNum = 19267616;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=19267617;
 //BA.debugLineNum = 19267617;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=19267618;
 //BA.debugLineNum = 19267618;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267619;
 //BA.debugLineNum = 19267619;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=19267621;
 //BA.debugLineNum = 19267621;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=19267623;
 //BA.debugLineNum = 19267623;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267624;
 //BA.debugLineNum = 19267624;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=19267626;
 //BA.debugLineNum = 19267626;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=19267629;
 //BA.debugLineNum = 19267629;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267630;
 //BA.debugLineNum = 19267630;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=19267632;
 //BA.debugLineNum = 19267632;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=19267634;
 //BA.debugLineNum = 19267634;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267635;
 //BA.debugLineNum = 19267635;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=19267637;
 //BA.debugLineNum = 19267637;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 }else {
RDebugUtils.currentLine=19267641;
 //BA.debugLineNum = 19267641;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
RDebugUtils.currentLine=19267642;
 //BA.debugLineNum = 19267642;BA.debugLine="Private cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=19267643;
 //BA.debugLineNum = 19267643;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
_cd1.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=19267644;
 //BA.debugLineNum = 19267644;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
_cd2.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=19267645;
 //BA.debugLineNum = 19267645;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=19267646;
 //BA.debugLineNum = 19267646;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=19267647;
 //BA.debugLineNum = 19267647;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=19267648;
 //BA.debugLineNum = 19267648;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=19267649;
 //BA.debugLineNum = 19267649;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267650;
 //BA.debugLineNum = 19267650;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=19267652;
 //BA.debugLineNum = 19267652;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=19267654;
 //BA.debugLineNum = 19267654;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267655;
 //BA.debugLineNum = 19267655;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=19267657;
 //BA.debugLineNum = 19267657;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=19267660;
 //BA.debugLineNum = 19267660;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267661;
 //BA.debugLineNum = 19267661;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=19267663;
 //BA.debugLineNum = 19267663;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=19267665;
 //BA.debugLineNum = 19267665;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19267666;
 //BA.debugLineNum = 19267666;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=19267668;
 //BA.debugLineNum = 19267668;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 };
RDebugUtils.currentLine=19267673;
 //BA.debugLineNum = 19267673;BA.debugLine="Dim cd4 As ColorDrawable";
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=19267674;
 //BA.debugLineNum = 19267674;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
_cd4.Initialize(__ref._cselectedcellcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=19267675;
 //BA.debugLineNum = 19267675;BA.debugLine="SelectedCellDrawable = cd4";
__ref._selectedcelldrawable /*Object*/  = (Object)(_cd4.getObject());
RDebugUtils.currentLine=19267677;
 //BA.debugLineNum = 19267677;BA.debugLine="SV2.Panel.Height = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=19267678;
 //BA.debugLineNum = 19267678;BA.debugLine="SVF.Panel.Height = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=19267681;
 //BA.debugLineNum = 19267681;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=19267682;
 //BA.debugLineNum = 19267682;BA.debugLine="minVisibleRow = -1";
__ref._minvisiblerow /*int*/  = (int) (-1);
RDebugUtils.currentLine=19267683;
 //BA.debugLineNum = 19267683;BA.debugLine="maxVisibleRow = 0";
__ref._maxvisiblerow /*int*/  = (int) (0);
RDebugUtils.currentLine=19267684;
 //BA.debugLineNum = 19267684;BA.debugLine="If ClearData = True Then";
if (_cleardata==__c.True) { 
RDebugUtils.currentLine=19267685;
 //BA.debugLineNum = 19267685;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=19267687;
 //BA.debugLineNum = 19267687;BA.debugLine="LabelsCache.Initialize";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=19267688;
 //BA.debugLineNum = 19267688;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=19267689;
 //BA.debugLineNum = 19267689;BA.debugLine="SV2.VerticalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=19267690;
 //BA.debugLineNum = 19267690;BA.debugLine="SVF.ScrollPosition = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setScrollPosition((int) (0));
RDebugUtils.currentLine=19267691;
 //BA.debugLineNum = 19267691;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step100 = 1;
final int limit100 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit100 ;_i = _i + step100 ) {
RDebugUtils.currentLine=19267692;
 //BA.debugLineNum = 19267692;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null)));
 }
};
RDebugUtils.currentLine=19267694;
 //BA.debugLineNum = 19267694;BA.debugLine="If IsVisible Then";
if (__ref._isvisible /*boolean*/ ) { 
RDebugUtils.currentLine=19267695;
 //BA.debugLineNum = 19267695;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=19267696;
 //BA.debugLineNum = 19267696;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=19267698;
 //BA.debugLineNum = 19267698;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=19267700;
 //BA.debugLineNum = 19267700;BA.debugLine="End Sub";
return "";
}
public String  _updateiplocation(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updateiplocation", false))
	 {return ((String) Debug.delegate(ba, "updateiplocation", null));}
RDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Private Sub updateIPLocation";
RDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="If (SV2.Height > Data.Size * cRowHeight) Then";
if ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )) { 
RDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cHe";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ +__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=22085636;
 //BA.debugLineNum = 22085636;BA.debugLine="internalPanel.Height = SV2.Height - (Data.Size *";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=22085638;
 //BA.debugLineNum = 22085638;BA.debugLine="internalPanel.Height = 0";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (0));
 };
RDebugUtils.currentLine=22085640;
 //BA.debugLineNum = 22085640;BA.debugLine="End Sub";
return "";
}
public String  _clearselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearselection", false))
	 {return ((String) Debug.delegate(ba, "clearselection", null));}
RDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Public Sub clearSelection";
RDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="End Sub";
return "";
}
public String  _refreshtable(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "refreshtable", false))
	 {return ((String) Debug.delegate(ba, "refreshtable", null));}
int _i = 0;
RDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub RefreshTable";
RDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step2 = 1;
final int limit2 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
RDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=21299206;
 //BA.debugLineNum = 21299206;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Private Sub CreateNewLabels As Label()";
RDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="Dim lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=19922948;
 //BA.debugLineNum = 19922948;BA.debugLine="rc.Col = i";
_rc.Col /*int*/  = _i;
RDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="lbl.Initialize(\"Cell\")";
_lbl.Initialize(ba,"Cell");
RDebugUtils.currentLine=19922952;
 //BA.debugLineNum = 19922952;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19922955;
 //BA.debugLineNum = 19922955;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=19922957;
 //BA.debugLineNum = 19922957;BA.debugLine="lbl.TextColor = cTextColors(i)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 };
RDebugUtils.currentLine=19922960;
 //BA.debugLineNum = 19922960;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19922961;
 //BA.debugLineNum = 19922961;BA.debugLine="lbl.Typeface = cTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=19922963;
 //BA.debugLineNum = 19922963;BA.debugLine="lbl.Typeface = cTypeFaces(i)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()));
 };
RDebugUtils.currentLine=19922966;
 //BA.debugLineNum = 19922966;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=19922968;
 //BA.debugLineNum = 19922968;BA.debugLine="lbl.SingleLine = cSingleLine";
_lbl.setSingleLine(__ref._csingleline /*boolean*/ );
RDebugUtils.currentLine=19922969;
 //BA.debugLineNum = 19922969;BA.debugLine="lbl.Tag = rc";
_lbl.setTag((Object)(_rc));
RDebugUtils.currentLine=19922970;
 //BA.debugLineNum = 19922970;BA.debugLine="lbls(i) = lbl";
_lbls[_i] = _lbl;
 }
};
RDebugUtils.currentLine=19922972;
 //BA.debugLineNum = 19922972;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=19922973;
 //BA.debugLineNum = 19922973;BA.debugLine="End Sub";
return null;
}
public String  _setpadding(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setpadding", false))
	 {return ((String) Debug.delegate(ba, "setpadding", new Object[] {_v,_left,_top,_right,_bottom}));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="v.Padding = Array As Int (Left, Top, Right, Botto";
_v.setPadding(new int[]{_left,_top,_right,_bottom});
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="pnlTable = Base";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="cLeft = Base.Left";
__ref._cleft /*int*/  = _base.getLeft();
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="cTop = Base.Top";
__ref._ctop /*int*/  = _base.getTop();
RDebugUtils.currentLine=18612229;
 //BA.debugLineNum = 18612229;BA.debugLine="cWidth = Base.Width";
__ref._cwidth /*int*/  = _base.getWidth();
RDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="cHeight = Base.Height";
__ref._cheight /*int*/  = _base.getHeight();
RDebugUtils.currentLine=18612231;
 //BA.debugLineNum = 18612231;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18612234;
 //BA.debugLineNum = 18612234;BA.debugLine="Select Props.Get(\"TextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("TextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=18612236;
 //BA.debugLineNum = 18612236;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=18612238;
 //BA.debugLineNum = 18612238;BA.debugLine="cAlignment = Gravity.CENTER";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=18612240;
 //BA.debugLineNum = 18612240;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=18612244;
 //BA.debugLineNum = 18612244;BA.debugLine="Select Props.Get(\"HeaderTextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("HeaderTextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=18612246;
 //BA.debugLineNum = 18612246;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=18612248;
 //BA.debugLineNum = 18612248;BA.debugLine="cHeaderAlignment = Gravity.CENTER";
__ref._cheaderalignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=18612250;
 //BA.debugLineNum = 18612250;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=18612253;
 //BA.debugLineNum = 18612253;BA.debugLine="cLineWidth = DipToCurrent(Props.Get(\"LineWidth\"))";
__ref._clinewidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("LineWidth")))));
RDebugUtils.currentLine=18612255;
 //BA.debugLineNum = 18612255;BA.debugLine="mNumberOfColumns = Props.Get(\"NumberOfColumns\")";
__ref._mnumberofcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfColumns"))));
RDebugUtils.currentLine=18612256;
 //BA.debugLineNum = 18612256;BA.debugLine="mNumberOfFixedColumns = Props.Get(\"NumberOfFixedC";
__ref._mnumberoffixedcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfFixedColumns"))));
RDebugUtils.currentLine=18612257;
 //BA.debugLineNum = 18612257;BA.debugLine="mFirstColumnFixed = Props.Get(\"FirstColumnFixed\")";
__ref._mfirstcolumnfixed /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("FirstColumnFixed")));
RDebugUtils.currentLine=18612258;
 //BA.debugLineNum = 18612258;BA.debugLine="If mFirstColumnFixed = True And mNumberOfFixedCol";
if (__ref._mfirstcolumnfixed /*boolean*/ ==__c.True && __ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=18612259;
 //BA.debugLineNum = 18612259;BA.debugLine="mNumberOfFixedColumns = 1";
__ref._mnumberoffixedcolumns /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=18612261;
 //BA.debugLineNum = 18612261;BA.debugLine="mMultiSelect = Props.Get(\"MultiSelect\")";
__ref._mmultiselect /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("MultiSelect")));
RDebugUtils.currentLine=18612262;
 //BA.debugLineNum = 18612262;BA.debugLine="cSingleLine = Props.GetDefault(\"SingleLine\", True";
__ref._csingleline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SingleLine"),(Object)(__c.True)));
RDebugUtils.currentLine=18612263;
 //BA.debugLineNum = 18612263;BA.debugLine="mZeroSelection = Props.Get(\"ZeroSelection\")";
__ref._mzeroselection /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZeroSelection")));
RDebugUtils.currentLine=18612264;
 //BA.debugLineNum = 18612264;BA.debugLine="cHeaderColor = Props.Get(\"HeaderColor\")";
__ref._cheadercolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderColor"))));
RDebugUtils.currentLine=18612265;
 //BA.debugLineNum = 18612265;BA.debugLine="cTableColor = Props.Get(\"TableColor\")";
__ref._ctablecolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("TableColor"))));
RDebugUtils.currentLine=18612266;
 //BA.debugLineNum = 18612266;BA.debugLine="cHeaderTextColor = Props.Get(\"HeaderTextColor\")";
__ref._cheadertextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderTextColor"))));
RDebugUtils.currentLine=18612267;
 //BA.debugLineNum = 18612267;BA.debugLine="cTextColor = Props.Get(\"CellTextColor\")";
__ref._ctextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("CellTextColor"))));
RDebugUtils.currentLine=18612268;
 //BA.debugLineNum = 18612268;BA.debugLine="cRowColor1 = Props.Get(\"Row1Color\")";
__ref._crowcolor1 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row1Color"))));
RDebugUtils.currentLine=18612269;
 //BA.debugLineNum = 18612269;BA.debugLine="cRowColor2 = Props.Get(\"Row2Color\")";
__ref._crowcolor2 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row2Color"))));
RDebugUtils.currentLine=18612270;
 //BA.debugLineNum = 18612270;BA.debugLine="cSelectedRowColor = Props.Get(\"SelectedRowColor\")";
__ref._cselectedrowcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedRowColor"))));
RDebugUtils.currentLine=18612271;
 //BA.debugLineNum = 18612271;BA.debugLine="cSelectedCellColor = Props.Get(\"SelectedCellColor";
__ref._cselectedcellcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedCellColor"))));
RDebugUtils.currentLine=18612273;
 //BA.debugLineNum = 18612273;BA.debugLine="cTextSize = Props.Get(\"TextSize\")";
__ref._ctextsize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));
RDebugUtils.currentLine=18612275;
 //BA.debugLineNum = 18612275;BA.debugLine="cRowHeight = DipToCurrent(Props.Get(\"RowHeight\"))";
__ref._crowheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("RowHeight")))));
RDebugUtils.currentLine=18612276;
 //BA.debugLineNum = 18612276;BA.debugLine="cHeaderHeight = DipToCurrent(Props.Get(\"HeaderHei";
__ref._cheaderheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("HeaderHeight")))));
RDebugUtils.currentLine=18612277;
 //BA.debugLineNum = 18612277;BA.debugLine="cShowStatusLine = Props.Get(\"ShowStatusLine\")";
__ref._cshowstatusline /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowStatusLine")));
RDebugUtils.currentLine=18612278;
 //BA.debugLineNum = 18612278;BA.debugLine="cStatusLineHeight = DipToCurrent(Props.GetDefault";
__ref._cstatuslineheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("HeaderHeight"),(Object)(40)))));
RDebugUtils.currentLine=18612279;
 //BA.debugLineNum = 18612279;BA.debugLine="cSortColumn = Props.Get(\"SortColumn\")";
__ref._csortcolumn /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortColumn")));
RDebugUtils.currentLine=18612280;
 //BA.debugLineNum = 18612280;BA.debugLine="cSortRemoveAccents = Props.Get(\"SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortRemoveAccents")));
RDebugUtils.currentLine=18612281;
 //BA.debugLineNum = 18612281;BA.debugLine="cSortBitmapWidth = DipToCurrent(Props.Get(\"SortBi";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapWidth")))));
RDebugUtils.currentLine=18612282;
 //BA.debugLineNum = 18612282;BA.debugLine="cSortBitmapColor = Props.Get(\"SortBitmapColor\")";
__ref._csortbitmapcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapColor"))));
RDebugUtils.currentLine=18612284;
 //BA.debugLineNum = 18612284;BA.debugLine="mFastScroll = Props.GetDefault(\"FastScroll\", Fals";
__ref._mfastscroll /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScroll"),(Object)(__c.False)));
RDebugUtils.currentLine=18612285;
 //BA.debugLineNum = 18612285;BA.debugLine="mFastScrollMinItems = Props.GetDefault(\"FastScrol";
__ref._mfastscrollminitems /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollMinItems"),(Object)(50))));
RDebugUtils.currentLine=18612286;
 //BA.debugLineNum = 18612286;BA.debugLine="mFastScrollColumnIndex = Props.GetDefault(\"FastSc";
__ref._mfastscrollcolumnindex /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollColumnIndex"),(Object)(0))));
RDebugUtils.currentLine=18612287;
 //BA.debugLineNum = 18612287;BA.debugLine="mFastScrollShowLabel = Props.GetDefault(\"FastScro";
__ref._mfastscrollshowlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollShowLabel"),(Object)(__c.True)));
RDebugUtils.currentLine=18612288;
 //BA.debugLineNum = 18612288;BA.debugLine="mFastScrollFixedLabel = Props.GetDefault(\"FastScr";
__ref._mfastscrollfixedlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollFixedLabel"),(Object)(__c.False)));
RDebugUtils.currentLine=18612289;
 //BA.debugLineNum = 18612289;BA.debugLine="mFastScrollLabelMaxChars = Props.GetDefault(\"Fast";
__ref._mfastscrolllabelmaxchars /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelMaxChars"),(Object)(10))));
RDebugUtils.currentLine=18612290;
 //BA.debugLineNum = 18612290;BA.debugLine="mFastScrollLabelWidth = DipToCurrent(Props.GetDef";
__ref._mfastscrolllabelwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelWidth"),(Object)(__c.DipToCurrent((int) (150)))))));
RDebugUtils.currentLine=18612291;
 //BA.debugLineNum = 18612291;BA.debugLine="mFastScrollLabelHeight = DipToCurrent(Props.GetDe";
__ref._mfastscrolllabelheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelHeight"),(Object)(__c.DipToCurrent((int) (30)))))));
RDebugUtils.currentLine=18612292;
 //BA.debugLineNum = 18612292;BA.debugLine="mSortCaseInsensitive = Props.GetDefault(\"SortCase";
__ref._msortcaseinsensitive /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SortCaseInsensitive"),(Object)(__c.False)));
RDebugUtils.currentLine=18612293;
 //BA.debugLineNum = 18612293;BA.debugLine="mMultiColumnSort = Props.GetDefault(\"MultiColumnS";
__ref._mmulticolumnsort /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MultiColumnSort"),(Object)(__c.False)));
RDebugUtils.currentLine=18612295;
 //BA.debugLineNum = 18612295;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=18612296;
 //BA.debugLineNum = 18612296;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub DrawFastScrollCursor";
RDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Private pthArrow As Path";
_ptharrow = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Private cvsFSc As Canvas";
_cvsfsc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="Private x1, x2, x3, y1, y2, dd, rr As Int";
_x1 = 0;
_x2 = 0;
_x3 = 0;
_y1 = 0;
_y2 = 0;
_dd = 0;
_rr = 0;
RDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="Private rct As Rect";
_rct = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="rr = 7dip";
_rr = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=19005448;
 //BA.debugLineNum = 19005448;BA.debugLine="cvsFSc.Initialize(pnlFastScrollCursor)";
_cvsfsc.Initialize((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=19005449;
 //BA.debugLineNum = 19005449;BA.debugLine="rct.Initialize(0, 0, FScCursorWidth, FScCursorHei";
_rct.Initialize((int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=19005450;
 //BA.debugLineNum = 19005450;BA.debugLine="cvsFSc.DrawRect(rct, Colors.Transparent, True, 1d";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__c.Colors.Transparent,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005452;
 //BA.debugLineNum = 19005452;BA.debugLine="cvsFSc.DrawCircle(rr, rr, rr, FScCursorCol1, True";
_cvsfsc.DrawCircle((float) (_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005453;
 //BA.debugLineNum = 19005453;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, rr, rr, FS";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005454;
 //BA.debugLineNum = 19005454;BA.debugLine="cvsFSc.DrawCircle(rr, FScCursorHeight - rr, rr, F";
_cvsfsc.DrawCircle((float) (_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005455;
 //BA.debugLineNum = 19005455;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, FScCursorH";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005457;
 //BA.debugLineNum = 19005457;BA.debugLine="rct.Initialize(rr, 0, FScCursorWidth - rr, rr)";
_rct.Initialize(_rr,(int) (0),(int) (__ref._fsccursorwidth /*int*/ -_rr),_rr);
RDebugUtils.currentLine=19005458;
 //BA.debugLineNum = 19005458;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005459;
 //BA.debugLineNum = 19005459;BA.debugLine="rct.Initialize(0, rr, FScCursorWidth, FScCursorHe";
_rct.Initialize((int) (0),_rr,__ref._fsccursorwidth /*int*/ ,(int) (__ref._fsccursorheight /*int*/ -_rr));
RDebugUtils.currentLine=19005460;
 //BA.debugLineNum = 19005460;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005461;
 //BA.debugLineNum = 19005461;BA.debugLine="rct.Initialize(rr, FScCursorHeight - rr, FScCurso";
_rct.Initialize(_rr,(int) (__ref._fsccursorheight /*int*/ -_rr),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=19005462;
 //BA.debugLineNum = 19005462;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005464;
 //BA.debugLineNum = 19005464;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 - 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005465;
 //BA.debugLineNum = 19005465;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2, FScCur";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005466;
 //BA.debugLineNum = 19005466;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 + 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005468;
 //BA.debugLineNum = 19005468;BA.debugLine="dd = 7dip";
_dd = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=19005469;
 //BA.debugLineNum = 19005469;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=19005470;
 //BA.debugLineNum = 19005470;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=19005471;
 //BA.debugLineNum = 19005471;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=19005472;
 //BA.debugLineNum = 19005472;BA.debugLine="y2 = dd";
_y2 = _dd;
RDebugUtils.currentLine=19005473;
 //BA.debugLineNum = 19005473;BA.debugLine="y1 = y2 + dd";
_y1 = (int) (_y2+_dd);
RDebugUtils.currentLine=19005474;
 //BA.debugLineNum = 19005474;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=19005475;
 //BA.debugLineNum = 19005475;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=19005476;
 //BA.debugLineNum = 19005476;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=19005477;
 //BA.debugLineNum = 19005477;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005479;
 //BA.debugLineNum = 19005479;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=19005480;
 //BA.debugLineNum = 19005480;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=19005481;
 //BA.debugLineNum = 19005481;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=19005482;
 //BA.debugLineNum = 19005482;BA.debugLine="y2 = FScCursorHeight - dd";
_y2 = (int) (__ref._fsccursorheight /*int*/ -_dd);
RDebugUtils.currentLine=19005483;
 //BA.debugLineNum = 19005483;BA.debugLine="y1 = y2 - dd";
_y1 = (int) (_y2-_dd);
RDebugUtils.currentLine=19005484;
 //BA.debugLineNum = 19005484;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=19005485;
 //BA.debugLineNum = 19005485;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=19005486;
 //BA.debugLineNum = 19005486;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=19005487;
 //BA.debugLineNum = 19005487;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=19005488;
 //BA.debugLineNum = 19005488;BA.debugLine="pnlFastScrollCursor.Invalidate";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=19005489;
 //BA.debugLineNum = 19005489;BA.debugLine="End Sub";
return "";
}
public String  _fastscrolltimer_tick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "fastscrolltimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fastscrolltimer_tick", null));}
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub FastScrollTimer_Tick";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="FScTimer.Enabled = False";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="End Sub";
return "";
}
public boolean  _getallowselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getallowselection", false))
	 {return ((Boolean) Debug.delegate(ba, "getallowselection", null));}
RDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Public Sub getAllowSelection As Boolean";
RDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Return cAllowSelection";
if (true) return __ref._callowselection /*boolean*/ ;
RDebugUtils.currentLine=21561346;
 //BA.debugLineNum = 21561346;BA.debugLine="End Sub";
return false;
}
public int  _getcellalignment(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcellalignment", false))
	 {return ((Integer) Debug.delegate(ba, "getcellalignment", null));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub getCellAlignment As Int";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="Return cAlignment";
if (true) return __ref._calignment /*int*/ ;
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="End Sub";
return 0;
}
public int[]  _getcolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumncolors", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumncolors", null));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Public Sub GetColumnColors As Int()";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="Return cColumnColors";
if (true) return __ref._ccolumncolors /*int[]*/ ;
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="End Sub";
return null;
}
public String  _getcolumndatatype(b4a.example.ef.table __ref,int _column) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "getcolumndatatype", new Object[] {_column}));}
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Public Sub GetColumnDataType(Column As Int) As Str";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=28246018;
 //BA.debugLineNum = 28246018;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="Return cColumnDataType(Column)";
if (true) return __ref._ccolumndatatype /*String[]*/ [_column];
RDebugUtils.currentLine=28246023;
 //BA.debugLineNum = 28246023;BA.debugLine="End Sub";
return "";
}
public String[]  _getcolumndatatypes(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatypes", false))
	 {return ((String[]) Debug.delegate(ba, "getcolumndatatypes", null));}
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub GetColumnDataTypes As String()";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Return cColumnDataType";
if (true) return __ref._ccolumndatatype /*String[]*/ ;
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="End Sub";
return null;
}
public int[]  _getcolumnwidths(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumnwidths", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumnwidths", null));}
RDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Public Sub GetColumnWidths As Int()";
RDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Return SavedWidths";
if (true) return __ref._savedwidths /*int[]*/ ;
RDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=29491205;
 //BA.debugLineNum = 29491205;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=29491206;
 //BA.debugLineNum = 29491206;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=29491208;
 //BA.debugLineNum = 29491208;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
RDebugUtils.currentLine=29491210;
 //BA.debugLineNum = 29491210;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
RDebugUtils.currentLine=29491211;
 //BA.debugLineNum = 29491211;BA.debugLine="Return Colors.Black";
if (true) return __c.Colors.Black;
 }else {
RDebugUtils.currentLine=29491213;
 //BA.debugLineNum = 29491213;BA.debugLine="Return Colors.White";
if (true) return __c.Colors.White;
 };
RDebugUtils.currentLine=29491215;
 //BA.debugLineNum = 29491215;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscroll", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscroll", null));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub getFastScroll As Boolean";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Return mFastScroll";
if (true) return __ref._mfastscroll /*boolean*/ ;
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrollcolumnindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollcolumnindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollcolumnindex", null));}
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub getFastScrollColumnIndex As Int";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="Return mFastScrollColumnIndex";
if (true) return __ref._mfastscrollcolumnindex /*int*/ ;
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollfixedlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollfixedlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollfixedlabel", null));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Public Sub getFastScrollFixedLabel As Boolean";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="Return mFastScrollFixedLabel";
if (true) return __ref._mfastscrollfixedlabel /*boolean*/ ;
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrolllabelheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelheight", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelheight", null));}
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Public Sub getFastScrollLabelHeight As Int";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=30474242;
 //BA.debugLineNum = 30474242;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelmaxchars(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelmaxchars", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelmaxchars", null));}
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Public Sub getFastScrollLabelMaxChars As Int";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="Return mFastScrollLabelMaxChars";
if (true) return __ref._mfastscrolllabelmaxchars /*int*/ ;
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelwidth", null));}
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Public Sub getFastScrollLabelWidth As Int";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrollminitems(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollminitems", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollminitems", null));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Public Sub getFastScrollMinItems As Int";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="Return mFastScrollMinItems";
if (true) return __ref._mfastscrollminitems /*int*/ ;
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollshowlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollshowlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollshowlabel", null));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Public Sub getFastScrollShowLabel As Boolean";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="Return mFastScrollShowLabel";
if (true) return __ref._mfastscrollshowlabel /*boolean*/ ;
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="End Sub";
return false;
}
public boolean  _getfirstcolumnfixed(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfirstcolumnfixed", false))
	 {return ((Boolean) Debug.delegate(ba, "getfirstcolumnfixed", null));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Public Sub getFirstColumnFixed As Boolean";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Return mFirstColumnFixed";
if (true) return __ref._mfirstcolumnfixed /*boolean*/ ;
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="End Sub";
return false;
}
public int  _getheadercolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="Return cHeaderColor";
if (true) return __ref._cheadercolor /*int*/ ;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadercolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadercolors", null));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Public Sub GetHeaderColors As Int()";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="Return cHeaderColors";
if (true) return __ref._cheadercolors /*int[]*/ ;
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="End Sub";
return null;
}
public int  _getheaderheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheaderheight", null));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Public Sub getHeaderHeight As Int";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Return cHeaderHeight";
if (true) return __ref._cheaderheight /*int*/ ;
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Public Sub getHeaderPanel As Panel";
RDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="Return Header";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="End Sub";
return null;
}
public int  _getheadertextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadertextcolor", null));}
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Public Sub getHeaderTextColor As Int";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Return cHeaderTextColor";
if (true) return __ref._cheadertextcolor /*int*/ ;
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadertextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadertextcolors", null));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Return cHeaderTextColors";
if (true) return __ref._cheadertextcolors /*int[]*/ ;
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _getheadertypeface(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertypeface", false))
	 {return ((anywheresoftware.b4a.keywords.constants.TypefaceWrapper) Debug.delegate(ba, "getheadertypeface", null));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Public Sub getHeaderTypeFace As Typeface";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="Return cHeaderTypeFace";
if (true) return __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="End Sub";
return null;
}
public int  _getheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="Return pnlTable.Height";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="End Sub";
return 0;
}
public int  _getinnertotalwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getinnertotalwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getinnertotalwidth", null));}
RDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub getInnerTotalWidth As Int";
RDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="Return Header.Width";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
 }else {
RDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="Return HeaderFirst.Width + Header.Width";
if (true) return (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=22544390;
 //BA.debugLineNum = 22544390;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
RDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=19857415;
 //BA.debugLineNum = 19857415;BA.debugLine="lbls = CreateNewLabels";
_lbls = __ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
 };
RDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=19857419;
 //BA.debugLineNum = 19857419;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.example.ef.table._rowcol)(_lbls[_i].getTag());
RDebugUtils.currentLine=19857420;
 //BA.debugLineNum = 19857420;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
RDebugUtils.currentLine=19857422;
 //BA.debugLineNum = 19857422;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=19857423;
 //BA.debugLineNum = 19857423;BA.debugLine="End Sub";
return null;
}
public int  _getleft(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Return pnlTable.Left";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="End Sub";
return 0;
}
public int  _getlinewidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getlinewidth", false))
	 {return ((Integer) Debug.delegate(ba, "getlinewidth", null));}
RDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Public Sub getLineWidth As Int";
RDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Return cLineWidth";
if (true) return __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="End Sub";
return 0;
}
public boolean  _getmulticolumnsort(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmulticolumnsort", false))
	 {return ((Boolean) Debug.delegate(ba, "getmulticolumnsort", null));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub getMultiColumnSort As Boolean";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="Return mMultiColumnSort";
if (true) return __ref._mmulticolumnsort /*boolean*/ ;
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="End Sub";
return false;
}
public boolean  _getmultiselect(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmultiselect", false))
	 {return ((Boolean) Debug.delegate(ba, "getmultiselect", null));}
RDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Public Sub getMultiSelect As Boolean";
RDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Return mMultiSelect";
if (true) return __ref._mmultiselect /*boolean*/ ;
RDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="End Sub";
return false;
}
public int  _getnumberofcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofcolumns", null));}
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Public Sub getNumberOfColumns As Int";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Return mNumberOfColumns";
if (true) return __ref._mnumberofcolumns /*int*/ ;
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberoffixedcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberoffixedcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberoffixedcolumns", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Public Sub getNumberOfFixedColumns As Int";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="Return mNumberOfFixedColumns";
if (true) return __ref._mnumberoffixedcolumns /*int*/ ;
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberofrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofrows", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofrows", null));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Public Sub getNumberOfRows As Int";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="Return pnlTable";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return null;
}
public int  _getrowcolor1(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor1", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor1", null));}
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub getRowColor1 As Int";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Return cRowColor1";
if (true) return __ref._crowcolor1 /*int*/ ;
RDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolor2(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor2", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor2", null));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Public Sub getRowColor2 As Int";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="Return cRowColor2";
if (true) return __ref._crowcolor2 /*int*/ ;
RDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolorn", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Public Sub GetRowColorN(Row As Int) As Int";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Return lstRowColors.Get(lstRowColorIndexes.Get(Ro";
if (true) return (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2))));
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="End Sub";
return 0;
}
public int  _getrowheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowheight", false))
	 {return ((Integer) Debug.delegate(ba, "getrowheight", null));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub getRowHeight As Int";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="Return cRowHeight";
if (true) return __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcellcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcellcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcellcolor", null));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Public Sub getSelectedCellColor As Int";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="Return cSelectedCellColor";
if (true) return __ref._cselectedcellcolor /*int*/ ;
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcelltextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcelltextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcelltextcolor", null));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Public Sub getSelectedCellTextColor As Int";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="Return cSelectedCellTextColor";
if (true) return __ref._cselectedcelltextcolor /*int*/ ;
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedrowcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowcolor", null));}
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Public Sub getSelectedRowColor As Int";
RDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="Return cSelectedRowColor";
if (true) return __ref._cselectedrowcolor /*int*/ ;
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrows", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getselectedrows", null));}
anywheresoftware.b4a.objects.collections.List _sr = null;
RDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Public Sub getSelectedRows As List";
RDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Dim sr As List";
_sr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="sr.Initialize";
_sr.Initialize();
RDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="sr.AddAll(SelectedRows)";
_sr.AddAll(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Return sr";
if (true) return _sr;
RDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="End Sub";
return null;
}
public int  _getselectedrowtextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowtextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowtextcolor", null));}
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Public Sub getSelectedRowTextColor As Int";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Return cSelectedRowTextColor";
if (true) return __ref._cselectedrowtextcolor /*int*/ ;
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="End Sub";
return 0;
}
public boolean  _getshowstatusline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getshowstatusline", false))
	 {return ((Boolean) Debug.delegate(ba, "getshowstatusline", null));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Public Sub getShowStatusLine As Boolean";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Return cShowStatusLine";
if (true) return __ref._cshowstatusline /*boolean*/ ;
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="End Sub";
return false;
}
public boolean  _getsingleline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsingleline", false))
	 {return ((Boolean) Debug.delegate(ba, "getsingleline", null));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub getSingleLine As Boolean";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="Return cSingleLine";
if (true) return __ref._csingleline /*boolean*/ ;
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="End Sub";
return false;
}
public long  _getsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Long) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub getSize As Long";
RDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Return Data.Size";
if (true) return (long) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
return 0L;
}
public int  _getsortbitmapcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapcolor", null));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Public Sub getSortBitmapColor As Int";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Return cSortBitmapColor";
if (true) return __ref._csortbitmapcolor /*int*/ ;
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="End Sub";
return 0;
}
public int  _getsortbitmapwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapwidth", null));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Public Sub getSortBitmapWidth As Int";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Return cSortBitmapWidth";
if (true) return __ref._csortbitmapwidth /*int*/ ;
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="End Sub";
return 0;
}
public boolean  _getsortcaseinsensitive(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcaseinsensitive", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcaseinsensitive", null));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub getSortCaseInsensitive As Boolean";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Return mSortCaseInsensitive";
if (true) return __ref._msortcaseinsensitive /*boolean*/ ;
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortcolumn(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcolumn", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcolumn", null));}
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub getSortColumn As Boolean";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Return cSortColumn";
if (true) return __ref._csortcolumn /*boolean*/ ;
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortremoveaccents(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortremoveaccents", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortremoveaccents", null));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Public Sub getSortRemoveAccents As Boolean";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="Return cSortRemoveAccents";
if (true) return __ref._csortremoveaccents /*boolean*/ ;
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="End Sub";
return false;
}
public int  _getstatuslineheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getstatuslineheight", false))
	 {return ((Integer) Debug.delegate(ba, "getstatuslineheight", null));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub getStatusLineHeight As Int";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="Return cStatusLineHeight";
if (true) return __ref._cstatuslineheight /*int*/ ;
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="End Sub";
return 0;
}
public int  _gettablecolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettablecolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettablecolor", null));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Public Sub getTableColor As Int";
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="Return cTableColor";
if (true) return __ref._ctablecolor /*int*/ ;
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettag", false))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Public Sub getTag As Object";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="Return pnlTable.Tag";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="End Sub";
return null;
}
public int  _gettextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=25559041;
 //BA.debugLineNum = 25559041;BA.debugLine="Return cTextColor";
if (true) return __ref._ctextcolor /*int*/ ;
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="End Sub";
return 0;
}
public int[]  _gettextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "gettextcolors", null));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Public Sub GetTextColors As Int()";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="Return cTextColors";
if (true) return __ref._ctextcolors /*int[]*/ ;
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="End Sub";
return null;
}
public float  _gettextsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextsize", false))
	 {return ((Float) Debug.delegate(ba, "gettextsize", null));}
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub getTextSize As Float";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Return cTextSize";
if (true) return __ref._ctextsize /*float*/ ;
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=22413313;
 //BA.debugLineNum = 22413313;BA.debugLine="Return pnlTable.Top";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="End Sub";
return 0;
}
public int  _gettoprowindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettoprowindex", false))
	 {return ((Integer) Debug.delegate(ba, "gettoprowindex", null));}
RDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Public Sub getTopRowIndex As Int";
RDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Return SV2.VerticalScrollPosition / cRowHeight";
if (true) return (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="End Sub";
return 0;
}
public boolean  _getusecolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getusecolumncolors", false))
	 {return ((Boolean) Debug.delegate(ba, "getusecolumncolors", null));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub getUseColumnColors As Boolean";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="Return cUseColumnColors";
if (true) return __ref._cusecolumncolors /*boolean*/ ;
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
return false;
}
public String  _getvalue(b4a.example.ef.table __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((String) Debug.delegate(ba, "getvalue", new Object[] {_col,_row}));}
String[] _values = null;
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As Str";
RDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
RDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="Dim rowData() As String  = Data.Get(Row) ' will t";
_rowdata = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="Dim tmp(mNumberOfColumns) As String";
_tmp = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_tmp,"");
RDebugUtils.currentLine=20971523;
 //BA.debugLineNum = 20971523;BA.debugLine="For i=0 To mNumberOfColumns-1 ' copy the array";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="tmp(i) =  rowData(i)";
_tmp[_i] = _rowdata[_i];
 }
};
RDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="Return tmp";
if (true) return _tmp;
RDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="Return pnlTable.Visible";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="Return pnlTable.Width";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Private Sub Header_Click";
RDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=23134216;
 //BA.debugLineNum = 23134216;BA.debugLine="If Data.Size < 2 Then Return";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=23134219;
 //BA.debugLineNum = 23134219;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=23134223;
 //BA.debugLineNum = 23134223;BA.debugLine="If cSortColumn Then 'this is set in the designer";
if (__ref._csortcolumn /*boolean*/ ) { 
RDebugUtils.currentLine=23134224;
 //BA.debugLineNum = 23134224;BA.debugLine="Dim dir As Int = 0 ' unsorted";
_dir = (int) (0);
RDebugUtils.currentLine=23134225;
 //BA.debugLineNum = 23134225;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
if ((__ref._sortedcol /*int*/ ==_col)) { 
RDebugUtils.currentLine=23134226;
 //BA.debugLineNum = 23134226;BA.debugLine="Select sortingDir";
switch (BA.switchObjectToInt(__ref._sortingdir /*int*/ ,(int) (0),(int) (1),(int) (-1))) {
case 0: {
RDebugUtils.currentLine=23134227;
 //BA.debugLineNum = 23134227;BA.debugLine="Case 0: dir = -1 ' going up";
_dir = (int) (-1);
 break; }
case 1: {
RDebugUtils.currentLine=23134228;
 //BA.debugLineNum = 23134228;BA.debugLine="Case 1: dir = -1";
_dir = (int) (-1);
 break; }
case 2: {
RDebugUtils.currentLine=23134229;
 //BA.debugLineNum = 23134229;BA.debugLine="Case -1: dir = 1";
_dir = (int) (1);
 break; }
}
;
 }else {
RDebugUtils.currentLine=23134232;
 //BA.debugLineNum = 23134232;BA.debugLine="dir = -1 ' start with going up";
_dir = (int) (-1);
 };
RDebugUtils.currentLine=23134235;
 //BA.debugLineNum = 23134235;BA.debugLine="bSorted = SortTable2(col, dir <= 0)";
_bsorted = __ref._sorttable2 /*boolean*/ (null,_col,_dir<=0);
RDebugUtils.currentLine=23134237;
 //BA.debugLineNum = 23134237;BA.debugLine="If bSorted Then";
if (_bsorted) { 
RDebugUtils.currentLine=23134238;
 //BA.debugLineNum = 23134238;BA.debugLine="showHeaderSorting(col, dir)";
__ref._showheadersorting /*String*/ (null,_col,_dir);
RDebugUtils.currentLine=23134239;
 //BA.debugLineNum = 23134239;BA.debugLine="sortedCol = col 'only change if a sort actually";
__ref._sortedcol /*int*/  = _col;
RDebugUtils.currentLine=23134240;
 //BA.debugLineNum = 23134240;BA.debugLine="sortingDir = dir 'only change if a sort actuall";
__ref._sortingdir /*int*/  = _dir;
 }else {
RDebugUtils.currentLine=23134242;
 //BA.debugLineNum = 23134242;BA.debugLine="showHeaderSorting(col, 2) 'no sort done so rect";
__ref._showheadersorting /*String*/ (null,_col,(int) (2));
 };
 };
RDebugUtils.currentLine=23134246;
 //BA.debugLineNum = 23134246;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=23134247;
 //BA.debugLineNum = 23134247;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(_col));
 };
RDebugUtils.currentLine=23134250;
 //BA.debugLineNum = 23134250;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Public Sub SortTable2(Col As Int, bAscending As Bo";
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=30670851;
 //BA.debugLineNum = 30670851;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=30670852;
 //BA.debugLineNum = 30670852;BA.debugLine="Dim arrRow() As String";
_arrrow = new String[(int) (0)];
java.util.Arrays.fill(_arrrow,"");
RDebugUtils.currentLine=30670853;
 //BA.debugLineNum = 30670853;BA.debugLine="Dim bDoMultiColumnSort As Boolean";
_bdomulticolumnsort = false;
RDebugUtils.currentLine=30670854;
 //BA.debugLineNum = 30670854;BA.debugLine="Dim bValidArrSortIndex As Boolean";
_bvalidarrsortindex = false;
RDebugUtils.currentLine=30670855;
 //BA.debugLineNum = 30670855;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=30670857;
 //BA.debugLineNum = 30670857;BA.debugLine="If Col <> iPreviousSortColumn Then";
if (_col!=__ref._iprevioussortcolumn /*int*/ ) { 
RDebugUtils.currentLine=30670858;
 //BA.debugLineNum = 30670858;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=30670859;
 //BA.debugLineNum = 30670859;BA.debugLine="arrDataSorted(Col) = False";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.False;
 };
RDebugUtils.currentLine=30670862;
 //BA.debugLineNum = 30670862;BA.debugLine="iUB = Data.Size - 1";
_iub = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=30670869;
 //BA.debugLineNum = 30670869;BA.debugLine="If bDataTempDone = False Then";
if (__ref._bdatatempdone /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=30670870;
 //BA.debugLineNum = 30670870;BA.debugLine="DataTemp.Initialize";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=30670871;
 //BA.debugLineNum = 30670871;BA.debugLine="For i = 0 To iUB";
{
final int step14 = 1;
final int limit14 = _iub;
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=30670872;
 //BA.debugLineNum = 30670872;BA.debugLine="DataTemp.Add(Data.Get(i))";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Add(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=30670874;
 //BA.debugLineNum = 30670874;BA.debugLine="bDataTempDone = True";
__ref._bdatatempdone /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=30670880;
 //BA.debugLineNum = 30670880;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=30670881;
 //BA.debugLineNum = 30670881;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("030670881","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=30670882;
 //BA.debugLineNum = 30670882;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=30670884;
 //BA.debugLineNum = 30670884;BA.debugLine="Dim arrColLong(Data.Size) As Long";
_arrcollong = new long[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=30670885;
 //BA.debugLineNum = 30670885;BA.debugLine="For i = 0 To iUB";
{
final int step24 = 1;
final int limit24 = _iub;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=30670886;
 //BA.debugLineNum = 30670886;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=30670887;
 //BA.debugLineNum = 30670887;BA.debugLine="Try";
try {RDebugUtils.currentLine=30670888;
 //BA.debugLineNum = 30670888;BA.debugLine="arrColLong(i) = arrRow(Col)";
__ref._arrcollong /*long[]*/ [_i] = (long)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e29) {
			ba.setLastException(e29); };
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=30670894;
 //BA.debugLineNum = 30670894;BA.debugLine="Dim arrColDouble(Data.Size) As Double";
_arrcoldouble = new double[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=30670895;
 //BA.debugLineNum = 30670895;BA.debugLine="For i = 0 To iUB";
{
final int step33 = 1;
final int limit33 = _iub;
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=30670896;
 //BA.debugLineNum = 30670896;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=30670897;
 //BA.debugLineNum = 30670897;BA.debugLine="Try";
try {RDebugUtils.currentLine=30670898;
 //BA.debugLineNum = 30670898;BA.debugLine="arrColDouble(i) = arrRow(Col)";
__ref._arrcoldouble /*double[]*/ [_i] = (double)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e38) {
			ba.setLastException(e38); };
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=30670904;
 //BA.debugLineNum = 30670904;BA.debugLine="Dim arrColString(Data.size) As String";
_arrcolstring = new String[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=30670905;
 //BA.debugLineNum = 30670905;BA.debugLine="For i = 0 To iUB";
{
final int step42 = 1;
final int limit42 = _iub;
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=30670906;
 //BA.debugLineNum = 30670906;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=30670907;
 //BA.debugLineNum = 30670907;BA.debugLine="Try";
try {RDebugUtils.currentLine=30670908;
 //BA.debugLineNum = 30670908;BA.debugLine="arrColString(i) = arrRow(Col)";
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
RDebugUtils.currentLine=30670920;
 //BA.debugLineNum = 30670920;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=30670921;
 //BA.debugLineNum = 30670921;BA.debugLine="bDoMultiColumnSort = mMultiColumnSort And bValidA";
_bdomulticolumnsort = __ref._mmulticolumnsort /*boolean*/  && _bvalidarrsortindex && __ref._mnumberofcolumns /*int*/ >1;
RDebugUtils.currentLine=30670926;
 //BA.debugLineNum = 30670926;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=30670927;
 //BA.debugLineNum = 30670927;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("030670927","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=30670928;
 //BA.debugLineNum = 30670928;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=30670931;
 //BA.debugLineNum = 30670931;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=30670932;
 //BA.debugLineNum = 30670932;BA.debugLine="arrSortIndex = SortOMLongIDX2(arrColLong, arr";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx2 /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=30670934;
 //BA.debugLineNum = 30670934;BA.debugLine="arrSortIndex = SortOMLongIDX(arrColLong, True";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 2: {
RDebugUtils.currentLine=30670938;
 //BA.debugLineNum = 30670938;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=30670939;
 //BA.debugLineNum = 30670939;BA.debugLine="arrSortIndex = SortOMDoubleIDX2(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx2 /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=30670941;
 //BA.debugLineNum = 30670941;BA.debugLine="arrSortIndex = SortOMDoubleIDX(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 3: {
RDebugUtils.currentLine=30670945;
 //BA.debugLineNum = 30670945;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=30670946;
 //BA.debugLineNum = 30670946;BA.debugLine="arrSortIndex = SortOMStringIDX2(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx2 /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=30670948;
 //BA.debugLineNum = 30670948;BA.debugLine="arrSortIndex = SortOMStringIDX(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 };
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=30670952;
 //BA.debugLineNum = 30670952;BA.debugLine="Dim arrSortIndex(1) As Int";
_arrsortindex = new int[(int) (1)];
;
RDebugUtils.currentLine=30670953;
 //BA.debugLineNum = 30670953;BA.debugLine="arrSortIndex(0) = -1";
__ref._arrsortindex /*int[]*/ [(int) (0)] = (int) (-1);
 break; }
}
;
RDebugUtils.currentLine=30670956;
 //BA.debugLineNum = 30670956;BA.debugLine="arrDataSorted(Col) = True";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.True;
RDebugUtils.currentLine=30670957;
 //BA.debugLineNum = 30670957;BA.debugLine="mapSortingIndexes.Put(Col, arrSortIndex)";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_col),(Object)(__ref._arrsortindex /*int[]*/ ));
 }else {
RDebugUtils.currentLine=30670959;
 //BA.debugLineNum = 30670959;BA.debugLine="arrSortIndex = mapSortingIndexes.Get(Col) 'retri";
__ref._arrsortindex /*int[]*/  = (int[])(__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_col)));
 };
RDebugUtils.currentLine=30670962;
 //BA.debugLineNum = 30670962;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=30670970;
 //BA.debugLineNum = 30670970;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=30670972;
 //BA.debugLineNum = 30670972;BA.debugLine="If bAscending = False And bValidArrSortIndex Then";
if (_bascending==__c.False && _bvalidarrsortindex) { 
RDebugUtils.currentLine=30670973;
 //BA.debugLineNum = 30670973;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T")) {
case 0: 
case 1: {
RDebugUtils.currentLine=30670975;
 //BA.debugLineNum = 30670975;BA.debugLine="arrSortIndex = ReverseIndexLong(arrColLong, ar";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexlong /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 2: {
RDebugUtils.currentLine=30670977;
 //BA.debugLineNum = 30670977;BA.debugLine="arrSortIndex = ReverseIndexDouble(arrColDouble";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexdouble /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=30670979;
 //BA.debugLineNum = 30670979;BA.debugLine="arrSortIndex = ReverseIndexString(arrColString";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexstring /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
}
;
 };
RDebugUtils.currentLine=30670986;
 //BA.debugLineNum = 30670986;BA.debugLine="If arrSortIndex(0) > -1 Then 'so don't move rows";
if (__ref._arrsortindex /*int[]*/ [(int) (0)]>-1) { 
RDebugUtils.currentLine=30670987;
 //BA.debugLineNum = 30670987;BA.debugLine="For i = 0 To iUB";
{
final int step97 = 1;
final int limit97 = _iub;
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
RDebugUtils.currentLine=30670988;
 //BA.debugLineNum = 30670988;BA.debugLine="Data.Set(i, DataTemp.Get(arrSortIndex(i)))";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._arrsortindex /*int[]*/ [_i]));
 }
};
RDebugUtils.currentLine=30670990;
 //BA.debugLineNum = 30670990;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=30670991;
 //BA.debugLineNum = 30670991;BA.debugLine="bSorted = True";
_bsorted = __c.True;
 };
RDebugUtils.currentLine=30670994;
 //BA.debugLineNum = 30670994;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=30670995;
 //BA.debugLineNum = 30670995;BA.debugLine="bPreviousSortAscending = bAscending 'not used for";
__ref._bprevioussortascending /*boolean*/  = _bascending;
RDebugUtils.currentLine=30670997;
 //BA.debugLineNum = 30670997;BA.debugLine="Return bSorted";
if (true) return _bsorted;
RDebugUtils.currentLine=30670999;
 //BA.debugLineNum = 30670999;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub showHeaderSorting(col As Int, dir As In";
RDebugUtils.currentLine=23199747;
 //BA.debugLineNum = 23199747;BA.debugLine="Dim L As Int ' calculate left";
_l = 0;
RDebugUtils.currentLine=23199748;
 //BA.debugLineNum = 23199748;BA.debugLine="Dim t As Int ' calculate top";
_t = 0;
RDebugUtils.currentLine=23199749;
 //BA.debugLineNum = 23199749;BA.debugLine="Dim View As View";
_view = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=23199750;
 //BA.debugLineNum = 23199750;BA.debugLine="Dim ParentView As Panel";
_parentview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23199752;
 //BA.debugLineNum = 23199752;BA.debugLine="pnlSortingView.RemoveView";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=23199754;
 //BA.debugLineNum = 23199754;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=23199755;
 //BA.debugLineNum = 23199755;BA.debugLine="If col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=23199756;
 //BA.debugLineNum = 23199756;BA.debugLine="View = HeaderFirst.GetView(col)";
_view = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=23199757;
 //BA.debugLineNum = 23199757;BA.debugLine="ParentView = HeaderFirst";
_parentview = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 }else {
RDebugUtils.currentLine=23199759;
 //BA.debugLineNum = 23199759;BA.debugLine="View = Header.GetView(col - mNumberOfFixedColum";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ ));
RDebugUtils.currentLine=23199760;
 //BA.debugLineNum = 23199760;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
 }else {
RDebugUtils.currentLine=23199763;
 //BA.debugLineNum = 23199763;BA.debugLine="View = Header.GetView(col)";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=23199764;
 //BA.debugLineNum = 23199764;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
RDebugUtils.currentLine=23199767;
 //BA.debugLineNum = 23199767;BA.debugLine="L = View.Left + View.Width - cSortBitmapWidth - 2";
_l = (int) (_view.getLeft()+_view.getWidth()-__ref._csortbitmapwidth /*int*/ -__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=23199769;
 //BA.debugLineNum = 23199769;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
if ((_dir==0)) { 
if (true) return "";};
RDebugUtils.currentLine=23199771;
 //BA.debugLineNum = 23199771;BA.debugLine="Select Case dir";
switch (BA.switchObjectToInt(_dir,(int) (-1),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=23199773;
 //BA.debugLineNum = 23199773;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpDes)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=23199774;
 //BA.debugLineNum = 23199774;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 1: {
RDebugUtils.currentLine=23199776;
 //BA.debugLineNum = 23199776;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpAsc)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=23199777;
 //BA.debugLineNum = 23199777;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 2: {
RDebugUtils.currentLine=23199779;
 //BA.debugLineNum = 23199779;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpEqual)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=23199780;
 //BA.debugLineNum = 23199780;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
}
;
RDebugUtils.currentLine=23199783;
 //BA.debugLineNum = 23199783;BA.debugLine="ParentView.AddView(pnlSortingView, L, t, cSortBit";
_parentview.AddView((android.view.View)(__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_l,_t,__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=23199785;
 //BA.debugLineNum = 23199785;BA.debugLine="End Sub";
return "";
}
public String  _header_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "header_longclick", false))
	 {return ((String) Debug.delegate(ba, "header_longclick", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub Header_LongClick";
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=20119557;
 //BA.debugLineNum = 20119557;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=20119558;
 //BA.debugLineNum = 20119558;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderLong";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick")) { 
RDebugUtils.currentLine=20119559;
 //BA.debugLineNum = 20119559;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderLongCli";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick",(Object)(_col));
 };
RDebugUtils.currentLine=20119561;
 //BA.debugLineNum = 20119561;BA.debugLine="End Sub";
return "";
}
public String  _hidecol(b4a.example.ef.table __ref,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hidecol", false))
	 {return ((String) Debug.delegate(ba, "hidecol", new Object[] {_col}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub hideCol(col As Int)";
RDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="For i = 0 To SavedWidths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=21823494;
 //BA.debugLineNum = 21823494;BA.debugLine="tmpWidths(col) = 0	'???";
_tmpwidths[_col] = (int) (0);
RDebugUtils.currentLine=21823495;
 //BA.debugLineNum = 21823495;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=21823496;
 //BA.debugLineNum = 21823496;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hiderow", false))
	 {return ((String) Debug.delegate(ba, "hiderow", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
RDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub HideRow (Row As Int)";
RDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
RDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=19791881;
 //BA.debugLineNum = 19791881;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
RDebugUtils.currentLine=19791883;
 //BA.debugLineNum = 19791883;BA.debugLine="visibleRows.Remove(Row)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_row));
RDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="LabelsCache.Add(lbls)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lbls));
RDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="End Sub";
return "";
}
public String  _initfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initfastscroll", false))
	 {return ((String) Debug.delegate(ba, "initfastscroll", null));}
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Private Sub InitFastScroll";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="pnlFastScroll.Top = SV2.Top";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop());
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="pnlFastScroll.Height = SV2.Height";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="FastScrollHeight = pnlFastScroll.Height - pnlFast";
__ref._fastscrollheight /*int*/  = (int) (__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="pnlFastScrollCursor.Top = SV2.VerticalScrollPosit";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()*__ref._fscscale /*double*/ ));
RDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight - m";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23658503;
 //BA.debugLineNum = 23658503;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="DrawFastScrollCursor";
__ref._drawfastscrollcursor /*String*/ (null);
RDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.table __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
RDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="cEventName = EventName";
__ref._ceventname /*String*/  = _eventname;
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="cCallBack = CallBack";
__ref._ccallback /*Object*/  = _callback;
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="cSortBitmapWidth = 10dip";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="cSortBitmapColor = Colors.Yellow";
__ref._csortbitmapcolor /*int*/  = __c.Colors.Yellow;
RDebugUtils.currentLine=18546694;
 //BA.debugLineNum = 18546694;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub InitializeSortingBitmaps";
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Private pthAsc, pthDes, pthEqual As Path";
_pthasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="cSortBitmapHeight = cSortBitmapWidth / 2";
__ref._csortbitmapheight /*int*/  = (int) (__ref._csortbitmapwidth /*int*/ /(double)2);
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="pnlAsc.Initialize(\"\")";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=18939910;
 //BA.debugLineNum = 18939910;BA.debugLine="pnlTable.AddView(pnlAsc, 0, 0, cSortBitmapWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=18939911;
 //BA.debugLineNum = 18939911;BA.debugLine="cvsAsc.Initialize(pnlAsc)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=18939912;
 //BA.debugLineNum = 18939912;BA.debugLine="pthAsc.Initialize(0, 0)";
_pthasc.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=18939913;
 //BA.debugLineNum = 18939913;BA.debugLine="pthAsc.LineTo(cSortBitmapWidth, 0)";
_pthasc.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (0));
RDebugUtils.currentLine=18939914;
 //BA.debugLineNum = 18939914;BA.debugLine="pthAsc.LineTo(cSortBitmapHeight, cSortBitmapHeigh";
_pthasc.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=18939915;
 //BA.debugLineNum = 18939915;BA.debugLine="cvsAsc.DrawColor(Colors.Transparent)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18939916;
 //BA.debugLineNum = 18939916;BA.debugLine="cvsAsc.DrawPath(pthAsc, cSortBitmapColor, True, 1";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthasc.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=18939917;
 //BA.debugLineNum = 18939917;BA.debugLine="bmpAsc = cvsAsc.Bitmap";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=18939919;
 //BA.debugLineNum = 18939919;BA.debugLine="cvsDes.Initialize(pnlAsc)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=18939920;
 //BA.debugLineNum = 18939920;BA.debugLine="pthDes.Initialize(0, cSortBitmapHeight)";
_pthdes.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=18939921;
 //BA.debugLineNum = 18939921;BA.debugLine="pthDes.LineTo(cSortBitmapHeight, 0)";
_pthdes.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (0));
RDebugUtils.currentLine=18939922;
 //BA.debugLineNum = 18939922;BA.debugLine="pthDes.LineTo(cSortBitmapWidth, cSortBitmapHeight";
_pthdes.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=18939923;
 //BA.debugLineNum = 18939923;BA.debugLine="cvsDes.DrawColor(Colors.Transparent)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18939924;
 //BA.debugLineNum = 18939924;BA.debugLine="cvsDes.DrawPath(pthDes, cSortBitmapColor, True, 1";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthdes.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=18939925;
 //BA.debugLineNum = 18939925;BA.debugLine="bmpDes = cvsDes.Bitmap";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=18939928;
 //BA.debugLineNum = 18939928;BA.debugLine="cvsEqual.Initialize(pnlAsc)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=18939929;
 //BA.debugLineNum = 18939929;BA.debugLine="pthEqual.Initialize(0, cSortBitmapHeight / 2)";
_pthequal.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=18939930;
 //BA.debugLineNum = 18939930;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, cSortBitmap";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=18939931;
 //BA.debugLineNum = 18939931;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth, cSortBitmapHeig";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=18939932;
 //BA.debugLineNum = 18939932;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, 0)";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (0));
RDebugUtils.currentLine=18939933;
 //BA.debugLineNum = 18939933;BA.debugLine="cvsEqual.DrawColor(Colors.Transparent)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=18939934;
 //BA.debugLineNum = 18939934;BA.debugLine="cvsEqual.DrawPath(pthEqual, cSortBitmapColor, Tru";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthequal.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=18939935;
 //BA.debugLineNum = 18939935;BA.debugLine="bmpEqual = cvsEqual.Bitmap";
__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=18939937;
 //BA.debugLineNum = 18939937;BA.debugLine="pnlAsc.RemoveView";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=18939938;
 //BA.debugLineNum = 18939938;BA.debugLine="End Sub";
return "";
}
public String  _initializetable(b4a.example.ef.table __ref,int _numberofcolumns,int _cellalignement,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initializetable", false))
	 {return ((String) Debug.delegate(ba, "initializetable", new Object[] {_numberofcolumns,_cellalignement,_showstatusline}));}
int _i = 0;
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub InitializeTable (NumberOfColumns As Int";
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="setShowStatusLine(showStatusLine)";
__ref._setshowstatusline /*String*/ (null,_showstatusline);
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="cAlignment = cellAlignement";
__ref._calignment /*int*/  = _cellalignement;
RDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="Data.Initialize	'needed";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18874380;
 //BA.debugLineNum = 18874380;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=18874382;
 //BA.debugLineNum = 18874382;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=18874383;
 //BA.debugLineNum = 18874383;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=18874384;
 //BA.debugLineNum = 18874384;BA.debugLine="ColumnWidths(i) = cWidth / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._cwidth /*int*/ /(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=18874385;
 //BA.debugLineNum = 18874385;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=18874386;
 //BA.debugLineNum = 18874386;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=18874387;
 //BA.debugLineNum = 18874387;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=18874390;
 //BA.debugLineNum = 18874390;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=18874391;
 //BA.debugLineNum = 18874391;BA.debugLine="End Sub";
return "";
}
public String  _setshowstatusline(b4a.example.ef.table __ref,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setshowstatusline", false))
	 {return ((String) Debug.delegate(ba, "setshowstatusline", new Object[] {_showstatusline}));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Public Sub setShowStatusLine(ShowStatusLine As Boo";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="cShowStatusLine = ShowStatusLine";
__ref._cshowstatusline /*boolean*/  = _showstatusline;
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=27787267;
 //BA.debugLineNum = 27787267;BA.debugLine="SV2.Height = cHeight - Header.Height - cStatusLi";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=27787268;
 //BA.debugLineNum = 27787268;BA.debugLine="lblStatusLine.Visible = True";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=27787270;
 //BA.debugLineNum = 27787270;BA.debugLine="SV2.Height = cHeight - Header.Height";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=27787271;
 //BA.debugLineNum = 27787271;BA.debugLine="lblStatusLine.Visible = False";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=27787273;
 //BA.debugLineNum = 27787273;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=27787274;
 //BA.debugLineNum = 27787274;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=27787275;
 //BA.debugLineNum = 27787275;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=27787277;
 //BA.debugLineNum = 27787277;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=27787278;
 //BA.debugLineNum = 27787278;BA.debugLine="End Sub";
return "";
}
public String  _svf_scrollchanged(b4a.example.ef.table __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "svf_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "svf_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Private Sub SVF_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="SVFScrolls = True";
__ref._svfscrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="If SV2Scrolls = False Then";
if (__ref._sv2scrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="Scroll(SV2PosX, Position)";
__ref._scroll /*String*/ (null,__ref._sv2posx /*int*/ ,_position);
RDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="SV2.VerticalScrollPosition = Position";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_position);
 };
RDebugUtils.currentLine=19333126;
 //BA.debugLineNum = 19333126;BA.debugLine="SVFScrolls = False";
__ref._svfscrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="End Sub";
return "";
}
public String  _sv2_scrollchanged(b4a.example.ef.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sv2_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv2_scrollchanged", new Object[] {_posx,_posy}));}
RDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Private Sub SV2_ScrollChanged(PosX As Int, PosY As";
RDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="SV2Scrolls = True";
__ref._sv2scrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="If SVFScrolls = False Then";
if (__ref._svfscrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="SVF.ScrollToNow(PosY)";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .ScrollToNow(_posy);
RDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="Scroll(PosX, PosY)";
__ref._scroll /*String*/ (null,_posx,_posy);
RDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="SV2PosX = PosX";
__ref._sv2posx /*int*/  = _posx;
 };
RDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="SV2Scrolls = False";
__ref._sv2scrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=19398665;
 //BA.debugLineNum = 19398665;BA.debugLine="If mFastScroll = True And Data.Size >= mFastScrol";
if (__ref._mfastscroll /*boolean*/ ==__c.True && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._mfastscrollminitems /*int*/  && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ >__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="FScScale = FastScrollHeight / (SV2.Panel.Height";
__ref._fscscale /*double*/  = __ref._fastscrollheight /*int*/ /(double)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight()-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="pnlFastScroll.Visible = True";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=19398668;
 //BA.debugLineNum = 19398668;BA.debugLine="If mFastScrollShowLabel = True Then";
if (__ref._mfastscrollshowlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=19398669;
 //BA.debugLineNum = 19398669;BA.debugLine="lblFastScroll.Visible = True";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="CalcFastScroll(PosY)";
__ref._calcfastscroll /*String*/ (null,_posy);
RDebugUtils.currentLine=19398672;
 //BA.debugLineNum = 19398672;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=19398674;
 //BA.debugLineNum = 19398674;BA.debugLine="End Sub";
return "";
}
public String  _setstatusline(b4a.example.ef.table __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatusline", false))
	 {return ((String) Debug.delegate(ba, "setstatusline", new Object[] {_text}));}
RDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Public Sub setStatusLine(Text As String)";
RDebugUtils.currentLine=21954561;
 //BA.debugLineNum = 21954561;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized())) { 
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_text));};
RDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As St";
RDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="If (Row < 0) Then Row = 0";
if ((_row<0)) { 
_row = (int) (0);};
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="If (Row > Data.Size) Then";
if ((_row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())) { 
RDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="AddRow(Values)";
__ref._addrow /*String*/ (null,_values);
 }else {
RDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="AddRowAutomaticWidth(Values)";
__ref._addrowautomaticwidth /*String*/ (null,_values);
 };
RDebugUtils.currentLine=21037064;
 //BA.debugLineNum = 21037064;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=21037066;
 //BA.debugLineNum = 21037066;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=21037068;
 //BA.debugLineNum = 21037068;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=21037069;
 //BA.debugLineNum = 21037069;BA.debugLine="L.Initialize";
_l.Initialize();
RDebugUtils.currentLine=21037070;
 //BA.debugLineNum = 21037070;BA.debugLine="L.Add(Values)";
_l.Add((Object)(_values));
RDebugUtils.currentLine=21037072;
 //BA.debugLineNum = 21037072;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step14 = 1;
final int limit14 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=21037073;
 //BA.debugLineNum = 21037073;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=21037074;
 //BA.debugLineNum = 21037074;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=21037075;
 //BA.debugLineNum = 21037075;BA.debugLine="If (keepSel >= Row) Then";
if ((_keepsel>=_row)) { 
RDebugUtils.currentLine=21037076;
 //BA.debugLineNum = 21037076;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel+1));
 };
 }
};
RDebugUtils.currentLine=21037080;
 //BA.debugLineNum = 21037080;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step21 = 1;
final int limit21 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=21037081;
 //BA.debugLineNum = 21037081;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=21037083;
 //BA.debugLineNum = 21037083;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_row,_l);
RDebugUtils.currentLine=21037084;
 //BA.debugLineNum = 21037084;BA.debugLine="lstRowColorIndexes.InsertAt(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_row,(Object)(0));
RDebugUtils.currentLine=21037086;
 //BA.debugLineNum = 21037086;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=21037088;
 //BA.debugLineNum = 21037088;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step27 = 1;
final int limit27 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=21037089;
 //BA.debugLineNum = 21037089;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=21037092;
 //BA.debugLineNum = 21037092;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=21037093;
 //BA.debugLineNum = 21037093;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=21037094;
 //BA.debugLineNum = 21037094;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=21037095;
 //BA.debugLineNum = 21037095;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=21037096;
 //BA.debugLineNum = 21037096;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=21037098;
 //BA.debugLineNum = 21037098;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=21037099;
 //BA.debugLineNum = 21037099;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=21037100;
 //BA.debugLineNum = 21037100;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=21037101;
 //BA.debugLineNum = 21037101;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=21037102;
 //BA.debugLineNum = 21037102;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=21037103;
 //BA.debugLineNum = 21037103;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21037104;
 //BA.debugLineNum = 21037104;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=21037106;
 //BA.debugLineNum = 21037106;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=21037108;
 //BA.debugLineNum = 21037108;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=21037109;
 //BA.debugLineNum = 21037109;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=21037110;
 //BA.debugLineNum = 21037110;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=21037111;
 //BA.debugLineNum = 21037111;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=21037114;
 //BA.debugLineNum = 21037114;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step51 = 1;
final int limit51 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
RDebugUtils.currentLine=21037115;
 //BA.debugLineNum = 21037115;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=21037116;
 //BA.debugLineNum = 21037116;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=21037118;
 //BA.debugLineNum = 21037118;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=21037120;
 //BA.debugLineNum = 21037120;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=21037121;
 //BA.debugLineNum = 21037121;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=21037122;
 //BA.debugLineNum = 21037122;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=21037123;
 //BA.debugLineNum = 21037123;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=21037124;
 //BA.debugLineNum = 21037124;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=21037125;
 //BA.debugLineNum = 21037125;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=21037129;
 //BA.debugLineNum = 21037129;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=21037130;
 //BA.debugLineNum = 21037130;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
 };
RDebugUtils.currentLine=21037134;
 //BA.debugLineNum = 21037134;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=21037135;
 //BA.debugLineNum = 21037135;BA.debugLine="End Sub";
return false;
}
public String  _ip_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "ip_click", false))
	 {return ((String) Debug.delegate(ba, "ip_click", null));}
RDebugUtils.currentLine=22020096;
 //BA.debugLineNum = 22020096;BA.debugLine="Private Sub IP_Click";
RDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(-1));
 };
RDebugUtils.currentLine=22020101;
 //BA.debugLineNum = 22020101;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "isrowvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isrowvisible", new Object[] {_row}));}
RDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean		'";
RDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="Return Row < (SV2.VerticalScrollPosition + SV2.He";
if (true) return _row<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)(__ref._crowheight /*int*/ +1) && _row>__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ ;
RDebugUtils.currentLine=19726339;
 //BA.debugLineNum = 19726339;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorow"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Log(\"You may get this warning:\")";
parent.__c.LogImpl("020578305","You may get this warning:",0);
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="Log(\"Unexpected event (missing RaiseSynchronousEv";
parent.__c.LogImpl("020578306","Unexpected event (missing RaiseSynchronousEvents): sv_scrollchanged",0);
RDebugUtils.currentLine=20578307;
 //BA.debugLineNum = 20578307;BA.debugLine="Log(\"Ignore it, it is NOT harmful !\")";
parent.__c.LogImpl("020578307","Ignore it, it is NOT harmful !",0);
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=20578310;
 //BA.debugLineNum = 20578310;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
RDebugUtils.currentLine=20578311;
 //BA.debugLineNum = 20578311;BA.debugLine="rc.Col = Col";
_rc.Col /*int*/  = _col;
RDebugUtils.currentLine=20578312;
 //BA.debugLineNum = 20578312;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorowandselect"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=20578313;
 //BA.debugLineNum = 20578313;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=20578315;
 //BA.debugLineNum = 20578315;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=20578317;
 //BA.debugLineNum = 20578317;BA.debugLine="Private i, Left As Int";
_i = 0;
_left = 0;
RDebugUtils.currentLine=20578318;
 //BA.debugLineNum = 20578318;BA.debugLine="If Col > 0 Then";
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
RDebugUtils.currentLine=20578319;
 //BA.debugLineNum = 20578319;BA.debugLine="For i = 0 To Col - 1";
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
RDebugUtils.currentLine=20578320;
 //BA.debugLineNum = 20578320;BA.debugLine="Left = Left + ColumnWidths(i)";
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
RDebugUtils.currentLine=20578323;
 //BA.debugLineNum = 20578323;BA.debugLine="Left = Left - SVF.Width";
_left = (int) (_left-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=20578324;
 //BA.debugLineNum = 20578324;BA.debugLine="SV2.HorizontalScrollPosition = Left";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition(_left);
RDebugUtils.currentLine=20578325;
 //BA.debugLineNum = 20578325;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
RDebugUtils.currentLine=26083329;
 //BA.debugLineNum = 26083329;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=26083333;
 //BA.debugLineNum = 26083333;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=26083334;
 //BA.debugLineNum = 26083334;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=26083336;
 //BA.debugLineNum = 26083336;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=26083337;
 //BA.debugLineNum = 26083337;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26083338;
 //BA.debugLineNum = 26083338;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26083339;
 //BA.debugLineNum = 26083339;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26083340;
 //BA.debugLineNum = 26083340;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=26083341;
 //BA.debugLineNum = 26083341;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=26083342;
 //BA.debugLineNum = 26083342;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=26083343;
 //BA.debugLineNum = 26083343;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=26083344;
 //BA.debugLineNum = 26083344;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=26083345;
 //BA.debugLineNum = 26083345;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=26083346;
 //BA.debugLineNum = 26083346;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=26083347;
 //BA.debugLineNum = 26083347;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26083348;
 //BA.debugLineNum = 26083348;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26083349;
 //BA.debugLineNum = 26083349;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=26083351;
 //BA.debugLineNum = 26083351;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26083352;
 //BA.debugLineNum = 26083352;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=26083354;
 //BA.debugLineNum = 26083354;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=26083356;
 //BA.debugLineNum = 26083356;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=26083357;
 //BA.debugLineNum = 26083357;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=26083358;
 //BA.debugLineNum = 26083358;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26083359;
 //BA.debugLineNum = 26083359;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26083360;
 //BA.debugLineNum = 26083360;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=26083361;
 //BA.debugLineNum = 26083361;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26083362;
 //BA.debugLineNum = 26083362;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].DEFAULT,__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=26083364;
 //BA.debugLineNum = 26083364;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=26083368;
 //BA.debugLineNum = 26083368;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=26083372;
 //BA.debugLineNum = 26083372;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=26083373;
 //BA.debugLineNum = 26083373;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=26083377;
 //BA.debugLineNum = 26083377;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=26083379;
 //BA.debugLineNum = 26083379;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=26083380;
 //BA.debugLineNum = 26083380;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=26083381;
 //BA.debugLineNum = 26083381;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=26083382;
 //BA.debugLineNum = 26083382;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26083383;
 //BA.debugLineNum = 26083383;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26083384;
 //BA.debugLineNum = 26083384;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=26083385;
 //BA.debugLineNum = 26083385;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=26083387;
 //BA.debugLineNum = 26083387;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=26083390;
 //BA.debugLineNum = 26083390;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=26083393;
 //BA.debugLineNum = 26083393;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=26083396;
 //BA.debugLineNum = 26083396;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Public Sub SetHeader(Values() As String)";
RDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=19988483;
 //BA.debugLineNum = 19988483;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=19988484;
 //BA.debugLineNum = 19988484;BA.debugLine="HeaderNames.Initialize2(Values)";
__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
RDebugUtils.currentLine=19988486;
 //BA.debugLineNum = 19988486;BA.debugLine="Dim Left = 0 As Int";
_left = (int) (0);
RDebugUtils.currentLine=19988488;
 //BA.debugLineNum = 19988488;BA.debugLine="Dim Change = 0 As Int";
_change = (int) (0);
RDebugUtils.currentLine=19988489;
 //BA.debugLineNum = 19988489;BA.debugLine="Dim w As Int";
_w = 0;
RDebugUtils.currentLine=19988490;
 //BA.debugLineNum = 19988490;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=19988491;
 //BA.debugLineNum = 19988491;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=19988492;
 //BA.debugLineNum = 19988492;BA.debugLine="lbl.Initialize(\"header\")";
_lbl.Initialize(ba,"header");
RDebugUtils.currentLine=19988493;
 //BA.debugLineNum = 19988493;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19988494;
 //BA.debugLineNum = 19988494;BA.debugLine="lbl.Gravity = cHeaderAlignment";
_lbl.setGravity(__ref._cheaderalignment /*int*/ );
 }else {
RDebugUtils.currentLine=19988496;
 //BA.debugLineNum = 19988496;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=19988499;
 //BA.debugLineNum = 19988499;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=19988500;
 //BA.debugLineNum = 19988500;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=19988502;
 //BA.debugLineNum = 19988502;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 };
RDebugUtils.currentLine=19988505;
 //BA.debugLineNum = 19988505;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=19988506;
 //BA.debugLineNum = 19988506;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=19988508;
 //BA.debugLineNum = 19988508;BA.debugLine="If cUseColumnColors = False Or cHeaderTextColors";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False || __ref._cheadertextcolors /*int[]*/ .length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=19988509;
 //BA.debugLineNum = 19988509;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
RDebugUtils.currentLine=19988510;
 //BA.debugLineNum = 19988510;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=19988512;
 //BA.debugLineNum = 19988512;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
RDebugUtils.currentLine=19988513;
 //BA.debugLineNum = 19988513;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=19988516;
 //BA.debugLineNum = 19988516;BA.debugLine="lbl.Text = Values(col)";
_lbl.setText(BA.ObjectToCharSequence(_values[_col]));
RDebugUtils.currentLine=19988517;
 //BA.debugLineNum = 19988517;BA.debugLine="lbl.Tag = col";
_lbl.setTag((Object)(_col));
RDebugUtils.currentLine=19988519;
 //BA.debugLineNum = 19988519;BA.debugLine="w = Max(0, ColumnWidths(col) - cLineWidth)		' ne";
_w = (int) (__c.Max(0,__ref._columnwidths /*int[]*/ [_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=19988521;
 //BA.debugLineNum = 19988521;BA.debugLine="If mNumberOfFixedColumns > 0 And col < mNumberOf";
if (__ref._mnumberoffixedcolumns /*int*/ >0 && _col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=19988522;
 //BA.debugLineNum = 19988522;BA.debugLine="HeaderFirst.AddView(lbl, Left, 0, w, cHeaderHei";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 }else {
RDebugUtils.currentLine=19988525;
 //BA.debugLineNum = 19988525;BA.debugLine="If col = mNumberOfFixedColumns Then";
if (_col==__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=19988526;
 //BA.debugLineNum = 19988526;BA.debugLine="Left = 0";
_left = (int) (0);
 };
RDebugUtils.currentLine=19988528;
 //BA.debugLineNum = 19988528;BA.debugLine="Header.AddView(lbl, Left, 0, w, cHeaderHeight)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 };
RDebugUtils.currentLine=19988532;
 //BA.debugLineNum = 19988532;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=19988533;
 //BA.debugLineNum = 19988533;BA.debugLine="If Values(col).Contains(CRLF) Then";
if (_values[_col].contains(__c.CRLF)) { 
RDebugUtils.currentLine=19988534;
 //BA.debugLineNum = 19988534;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=19988535;
 //BA.debugLineNum = 19988535;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=19988536;
 //BA.debugLineNum = 19988536;BA.debugLine="str = Regex.Split(CRLF, Values(col))";
_str = __c.Regex.Split(__c.CRLF,_values[_col]);
RDebugUtils.currentLine=19988537;
 //BA.debugLineNum = 19988537;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(str";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[(int) (0)],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
RDebugUtils.currentLine=19988538;
 //BA.debugLineNum = 19988538;BA.debugLine="For j = 1 To str.Length - 1";
{
final int step46 = 1;
final int limit46 = (int) (_str.length-1);
_j = (int) (1) ;
for (;_j <= limit46 ;_j = _j + step46 ) {
RDebugUtils.currentLine=19988539;
 //BA.debugLineNum = 19988539;BA.debugLine="HeaderWidths(col) = Max(HeaderWidths(col),cvs";
__ref._headerwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[_j],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=19988542;
 //BA.debugLineNum = 19988542;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Val";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_col],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=19988544;
 //BA.debugLineNum = 19988544;BA.debugLine="If HeaderWidths(col) > ColumnWidths(col) Then";
if (__ref._headerwidths /*int[]*/ [_col]>__ref._columnwidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=19988545;
 //BA.debugLineNum = 19988545;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=19988546;
 //BA.debugLineNum = 19988546;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Col";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._columnwidths /*int[]*/ [_col]));
 }else 
{RDebugUtils.currentLine=19988547;
 //BA.debugLineNum = 19988547;BA.debugLine="Else If ColumnWidths(col) > HeaderWidths(col) A";
if (__ref._columnwidths /*int[]*/ [_col]>__ref._headerwidths /*int[]*/ [_col] && __ref._columnwidths /*int[]*/ [_col]>__ref._datawidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=19988548;
 //BA.debugLineNum = 19988548;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=19988549;
 //BA.debugLineNum = 19988549;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Dat";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }}
;
 };
RDebugUtils.currentLine=19988552;
 //BA.debugLineNum = 19988552;BA.debugLine="Left = Left + ColumnWidths(col)";
_left = (int) (_left+__ref._columnwidths /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=19988555;
 //BA.debugLineNum = 19988555;BA.debugLine="If Change = 1 Then";
if (_change==1) { 
RDebugUtils.currentLine=19988556;
 //BA.debugLineNum = 19988556;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=19988558;
 //BA.debugLineNum = 19988558;BA.debugLine="Header.Left = - SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=19988559;
 //BA.debugLineNum = 19988559;BA.debugLine="End Sub";
return "";
}
public String  _setarrcolumnssorted(b4a.example.ef.table __ref,int _icolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setarrcolumnssorted", false))
	 {return ((String) Debug.delegate(ba, "setarrcolumnssorted", new Object[] {_icolumns}));}
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Public Sub SetArrColumnsSorted(iColumns As Int)";
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="sortingDir = 0 ' -1, 0, 1 as asc, unsorted, desc";
__ref._sortingdir /*int*/  = (int) (0);
RDebugUtils.currentLine=30736387;
 //BA.debugLineNum = 30736387;BA.debugLine="sortedCol = -1";
__ref._sortedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=30736389;
 //BA.debugLineNum = 30736389;BA.debugLine="Dim arrDataSorted(iColumns) As Boolean";
_arrdatasorted = new boolean[_icolumns];
;
RDebugUtils.currentLine=30736390;
 //BA.debugLineNum = 30736390;BA.debugLine="bDataTempDone = False";
__ref._bdatatempdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=30736391;
 //BA.debugLineNum = 30736391;BA.debugLine="Dim arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=30736392;
 //BA.debugLineNum = 30736392;BA.debugLine="mapSortingIndexes.Initialize";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=30736394;
 //BA.debugLineNum = 30736394;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub LoadSQLiteDB2(SQLite As SQL, Query As S";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=26148869;
 //BA.debugLineNum = 26148869;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=26148870;
 //BA.debugLineNum = 26148870;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=26148872;
 //BA.debugLineNum = 26148872;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=26148873;
 //BA.debugLineNum = 26148873;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26148874;
 //BA.debugLineNum = 26148874;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26148875;
 //BA.debugLineNum = 26148875;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26148876;
 //BA.debugLineNum = 26148876;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=26148877;
 //BA.debugLineNum = 26148877;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=26148878;
 //BA.debugLineNum = 26148878;BA.debugLine="Dim ii As Long";
_ii = 0L;
RDebugUtils.currentLine=26148879;
 //BA.debugLineNum = 26148879;BA.debugLine="Dim dd As Double";
_dd = 0;
RDebugUtils.currentLine=26148880;
 //BA.debugLineNum = 26148880;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=26148881;
 //BA.debugLineNum = 26148881;BA.debugLine="cColumnDataType = ColumnDataTypes";
__ref._ccolumndatatype /*String[]*/  = _columndatatypes;
RDebugUtils.currentLine=26148882;
 //BA.debugLineNum = 26148882;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=26148883;
 //BA.debugLineNum = 26148883;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=26148884;
 //BA.debugLineNum = 26148884;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=26148885;
 //BA.debugLineNum = 26148885;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26148886;
 //BA.debugLineNum = 26148886;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26148887;
 //BA.debugLineNum = 26148887;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=26148889;
 //BA.debugLineNum = 26148889;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26148890;
 //BA.debugLineNum = 26148890;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=26148892;
 //BA.debugLineNum = 26148892;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=26148894;
 //BA.debugLineNum = 26148894;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=26148895;
 //BA.debugLineNum = 26148895;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step29 = 1;
final int limit29 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit29 ;_row = _row + step29 ) {
RDebugUtils.currentLine=26148896;
 //BA.debugLineNum = 26148896;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26148897;
 //BA.debugLineNum = 26148897;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26148898;
 //BA.debugLineNum = 26148898;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=26148899;
 //BA.debugLineNum = 26148899;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R")) {
case 0: {
RDebugUtils.currentLine=26148901;
 //BA.debugLineNum = 26148901;BA.debugLine="ii = Curs.GetInt2(col)";
_ii = (long) (_curs.GetInt2(_col));
RDebugUtils.currentLine=26148902;
 //BA.debugLineNum = 26148902;BA.debugLine="str = ii";
_str = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=26148904;
 //BA.debugLineNum = 26148904;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=26148905;
 //BA.debugLineNum = 26148905;BA.debugLine="str = dd";
_str = BA.NumberToString(_dd);
 break; }
}
;
 }else {
RDebugUtils.currentLine=26148908;
 //BA.debugLineNum = 26148908;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=26148910;
 //BA.debugLineNum = 26148910;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26148911;
 //BA.debugLineNum = 26148911;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=26148913;
 //BA.debugLineNum = 26148913;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=26148916;
 //BA.debugLineNum = 26148916;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=26148920;
 //BA.debugLineNum = 26148920;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=26148921;
 //BA.debugLineNum = 26148921;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=26148925;
 //BA.debugLineNum = 26148925;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=26148927;
 //BA.debugLineNum = 26148927;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step56 = 1;
final int limit56 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit56 ;_row = _row + step56 ) {
RDebugUtils.currentLine=26148928;
 //BA.debugLineNum = 26148928;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26148929;
 //BA.debugLineNum = 26148929;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=26148930;
 //BA.debugLineNum = 26148930;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=26148931;
 //BA.debugLineNum = 26148931;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26148932;
 //BA.debugLineNum = 26148932;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=26148933;
 //BA.debugLineNum = 26148933;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 }else {
RDebugUtils.currentLine=26148935;
 //BA.debugLineNum = 26148935;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R","T")) {
case 0: {
RDebugUtils.currentLine=26148937;
 //BA.debugLineNum = 26148937;BA.debugLine="ii = Curs.GetLong2(col)";
_ii = _curs.GetLong2(_col);
RDebugUtils.currentLine=26148938;
 //BA.debugLineNum = 26148938;BA.debugLine="R(col) = ii";
_r[_col] = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=26148940;
 //BA.debugLineNum = 26148940;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=26148941;
 //BA.debugLineNum = 26148941;BA.debugLine="R(col) = dd";
_r[_col] = BA.NumberToString(_dd);
 break; }
case 2: {
RDebugUtils.currentLine=26148943;
 //BA.debugLineNum = 26148943;BA.debugLine="R(col) = Curs.GetString2(col)";
_r[_col] = _curs.GetString2(_col);
 break; }
default: {
RDebugUtils.currentLine=26148945;
 //BA.debugLineNum = 26148945;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 break; }
}
;
 };
 }
};
RDebugUtils.currentLine=26148949;
 //BA.debugLineNum = 26148949;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=26148952;
 //BA.debugLineNum = 26148952;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=26148953;
 //BA.debugLineNum = 26148953;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Public Sub LoadSQLiteDB3(SQLite As SQL, Query As S";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=26214406;
 //BA.debugLineNum = 26214406;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=26214408;
 //BA.debugLineNum = 26214408;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=26214409;
 //BA.debugLineNum = 26214409;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26214410;
 //BA.debugLineNum = 26214410;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26214411;
 //BA.debugLineNum = 26214411;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26214412;
 //BA.debugLineNum = 26214412;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=26214413;
 //BA.debugLineNum = 26214413;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=26214414;
 //BA.debugLineNum = 26214414;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=26214415;
 //BA.debugLineNum = 26214415;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=26214416;
 //BA.debugLineNum = 26214416;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=26214417;
 //BA.debugLineNum = 26214417;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=26214418;
 //BA.debugLineNum = 26214418;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=26214419;
 //BA.debugLineNum = 26214419;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26214420;
 //BA.debugLineNum = 26214420;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26214421;
 //BA.debugLineNum = 26214421;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=26214423;
 //BA.debugLineNum = 26214423;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26214424;
 //BA.debugLineNum = 26214424;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=26214426;
 //BA.debugLineNum = 26214426;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=26214428;
 //BA.debugLineNum = 26214428;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=26214429;
 //BA.debugLineNum = 26214429;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=26214430;
 //BA.debugLineNum = 26214430;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26214431;
 //BA.debugLineNum = 26214431;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26214432;
 //BA.debugLineNum = 26214432;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=26214433;
 //BA.debugLineNum = 26214433;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26214434;
 //BA.debugLineNum = 26214434;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=26214436;
 //BA.debugLineNum = 26214436;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=26214440;
 //BA.debugLineNum = 26214440;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=26214444;
 //BA.debugLineNum = 26214444;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=26214445;
 //BA.debugLineNum = 26214445;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=26214449;
 //BA.debugLineNum = 26214449;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=26214451;
 //BA.debugLineNum = 26214451;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=26214452;
 //BA.debugLineNum = 26214452;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=26214453;
 //BA.debugLineNum = 26214453;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=26214454;
 //BA.debugLineNum = 26214454;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26214455;
 //BA.debugLineNum = 26214455;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26214456;
 //BA.debugLineNum = 26214456;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=26214457;
 //BA.debugLineNum = 26214457;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=26214459;
 //BA.debugLineNum = 26214459;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=26214462;
 //BA.debugLineNum = 26214462;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=26214465;
 //BA.debugLineNum = 26214465;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=26214466;
 //BA.debugLineNum = 26214466;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Public Sub LoadSQLiteDB4(SQLite As SQL, Query As S";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=26279941;
 //BA.debugLineNum = 26279941;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=26279943;
 //BA.debugLineNum = 26279943;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=26279945;
 //BA.debugLineNum = 26279945;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=26279946;
 //BA.debugLineNum = 26279946;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26279947;
 //BA.debugLineNum = 26279947;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26279948;
 //BA.debugLineNum = 26279948;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26279949;
 //BA.debugLineNum = 26279949;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=26279950;
 //BA.debugLineNum = 26279950;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=26279951;
 //BA.debugLineNum = 26279951;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=26279953;
 //BA.debugLineNum = 26279953;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=26279955;
 //BA.debugLineNum = 26279955;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=26279956;
 //BA.debugLineNum = 26279956;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=26279957;
 //BA.debugLineNum = 26279957;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=26279958;
 //BA.debugLineNum = 26279958;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26279959;
 //BA.debugLineNum = 26279959;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26279960;
 //BA.debugLineNum = 26279960;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=26279962;
 //BA.debugLineNum = 26279962;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26279963;
 //BA.debugLineNum = 26279963;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=26279965;
 //BA.debugLineNum = 26279965;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=26279967;
 //BA.debugLineNum = 26279967;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=26279968;
 //BA.debugLineNum = 26279968;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=26279969;
 //BA.debugLineNum = 26279969;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26279970;
 //BA.debugLineNum = 26279970;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26279971;
 //BA.debugLineNum = 26279971;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=26279972;
 //BA.debugLineNum = 26279972;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=26279973;
 //BA.debugLineNum = 26279973;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=26279974;
 //BA.debugLineNum = 26279974;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=26279975;
 //BA.debugLineNum = 26279975;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=26279977;
 //BA.debugLineNum = 26279977;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26279978;
 //BA.debugLineNum = 26279978;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=26279980;
 //BA.debugLineNum = 26279980;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=26279983;
 //BA.debugLineNum = 26279983;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=26279987;
 //BA.debugLineNum = 26279987;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=26279988;
 //BA.debugLineNum = 26279988;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=26279992;
 //BA.debugLineNum = 26279992;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=26279994;
 //BA.debugLineNum = 26279994;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=26279995;
 //BA.debugLineNum = 26279995;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=26279996;
 //BA.debugLineNum = 26279996;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=26279997;
 //BA.debugLineNum = 26279997;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26279998;
 //BA.debugLineNum = 26279998;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26279999;
 //BA.debugLineNum = 26279999;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=26280000;
 //BA.debugLineNum = 26280000;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=26280001;
 //BA.debugLineNum = 26280001;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=26280002;
 //BA.debugLineNum = 26280002;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=26280003;
 //BA.debugLineNum = 26280003;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=26280005;
 //BA.debugLineNum = 26280005;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=26280007;
 //BA.debugLineNum = 26280007;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=26280010;
 //BA.debugLineNum = 26280010;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=26280011;
 //BA.debugLineNum = 26280011;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Public Sub LoadSQLiteDB5(SQLite As SQL, Query As S";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=26345477;
 //BA.debugLineNum = 26345477;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=26345478;
 //BA.debugLineNum = 26345478;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=26345479;
 //BA.debugLineNum = 26345479;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=26345481;
 //BA.debugLineNum = 26345481;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=26345482;
 //BA.debugLineNum = 26345482;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26345483;
 //BA.debugLineNum = 26345483;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26345484;
 //BA.debugLineNum = 26345484;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26345485;
 //BA.debugLineNum = 26345485;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=26345486;
 //BA.debugLineNum = 26345486;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=26345487;
 //BA.debugLineNum = 26345487;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=26345489;
 //BA.debugLineNum = 26345489;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=26345491;
 //BA.debugLineNum = 26345491;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=26345492;
 //BA.debugLineNum = 26345492;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=26345493;
 //BA.debugLineNum = 26345493;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=26345494;
 //BA.debugLineNum = 26345494;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26345495;
 //BA.debugLineNum = 26345495;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=26345496;
 //BA.debugLineNum = 26345496;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=26345498;
 //BA.debugLineNum = 26345498;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26345499;
 //BA.debugLineNum = 26345499;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=26345501;
 //BA.debugLineNum = 26345501;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=26345503;
 //BA.debugLineNum = 26345503;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=26345504;
 //BA.debugLineNum = 26345504;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=26345505;
 //BA.debugLineNum = 26345505;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26345506;
 //BA.debugLineNum = 26345506;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26345507;
 //BA.debugLineNum = 26345507;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=26345508;
 //BA.debugLineNum = 26345508;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=26345509;
 //BA.debugLineNum = 26345509;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=26345510;
 //BA.debugLineNum = 26345510;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=26345511;
 //BA.debugLineNum = 26345511;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=26345513;
 //BA.debugLineNum = 26345513;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26345514;
 //BA.debugLineNum = 26345514;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=26345516;
 //BA.debugLineNum = 26345516;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=26345519;
 //BA.debugLineNum = 26345519;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=26345523;
 //BA.debugLineNum = 26345523;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=26345524;
 //BA.debugLineNum = 26345524;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=26345528;
 //BA.debugLineNum = 26345528;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=26345530;
 //BA.debugLineNum = 26345530;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=26345531;
 //BA.debugLineNum = 26345531;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=26345532;
 //BA.debugLineNum = 26345532;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=26345533;
 //BA.debugLineNum = 26345533;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=26345534;
 //BA.debugLineNum = 26345534;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=26345535;
 //BA.debugLineNum = 26345535;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=26345536;
 //BA.debugLineNum = 26345536;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=26345537;
 //BA.debugLineNum = 26345537;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=26345538;
 //BA.debugLineNum = 26345538;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=26345539;
 //BA.debugLineNum = 26345539;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=26345541;
 //BA.debugLineNum = 26345541;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=26345543;
 //BA.debugLineNum = 26345543;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=26345546;
 //BA.debugLineNum = 26345546;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=26345547;
 //BA.debugLineNum = 26345547;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="cAutomaticWidths = False";
__ref._cautomaticwidths /*boolean*/  = __c.False;
RDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=20643848;
 //BA.debugLineNum = 20643848;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20643849;
 //BA.debugLineNum = 20643849;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
RDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=20643851;
 //BA.debugLineNum = 20643851;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_headers.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=20643852;
 //BA.debugLineNum = 20643852;BA.debugLine="h(i) = headers.Get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=20643855;
 //BA.debugLineNum = 20643855;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(","));
RDebugUtils.currentLine=20643856;
 //BA.debugLineNum = 20643856;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=20643857;
 //BA.debugLineNum = 20643857;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=20643858;
 //BA.debugLineNum = 20643858;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=20643859;
 //BA.debugLineNum = 20643859;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=20643860;
 //BA.debugLineNum = 20643860;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=20643863;
 //BA.debugLineNum = 20643863;BA.debugLine="innerClearAll(h.Length, True)";
__ref._innerclearall /*String*/ (null,_h.length,__c.True);
RDebugUtils.currentLine=20643864;
 //BA.debugLineNum = 20643864;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20643865;
 //BA.debugLineNum = 20643865;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20643866;
 //BA.debugLineNum = 20643866;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20643867;
 //BA.debugLineNum = 20643867;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=20643868;
 //BA.debugLineNum = 20643868;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=20643869;
 //BA.debugLineNum = 20643869;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
RDebugUtils.currentLine=20643870;
 //BA.debugLineNum = 20643870;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=20643871;
 //BA.debugLineNum = 20643871;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=20643872;
 //BA.debugLineNum = 20643872;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=20643875;
 //BA.debugLineNum = 20643875;BA.debugLine="SetHeader(h)";
__ref._setheader /*String*/ (null,_h);
RDebugUtils.currentLine=20643876;
 //BA.debugLineNum = 20643876;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=20643880;
 //BA.debugLineNum = 20643880;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=20643882;
 //BA.debugLineNum = 20643882;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=20643883;
 //BA.debugLineNum = 20643883;BA.debugLine="Dim Row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
RDebugUtils.currentLine=20643884;
 //BA.debugLineNum = 20643884;BA.debugLine="Row = List1.Get(i)";
_row = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=20643885;
 //BA.debugLineNum = 20643885;BA.debugLine="AddRow(Row)";
__ref._addrow /*String*/ (null,_row);
 }
};
RDebugUtils.currentLine=20643887;
 //BA.debugLineNum = 20643887;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=20709382;
 //BA.debugLineNum = 20709382;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=20709383;
 //BA.debugLineNum = 20709383;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=20709384;
 //BA.debugLineNum = 20709384;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_lstheaders);
RDebugUtils.currentLine=20709385;
 //BA.debugLineNum = 20709385;BA.debugLine="Dim Headers(lstHeaders.Size) As String";
_headers = new String[_lstheaders.getSize()];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=20709386;
 //BA.debugLineNum = 20709386;BA.debugLine="For i = 0 To lstHeaders.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lstheaders.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=20709387;
 //BA.debugLineNum = 20709387;BA.debugLine="Headers(i) = lstHeaders.Get(i)";
_headers[_i] = BA.ObjectToString(_lstheaders.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=20709390;
 //BA.debugLineNum = 20709390;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));
RDebugUtils.currentLine=20709391;
 //BA.debugLineNum = 20709391;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=20709392;
 //BA.debugLineNum = 20709392;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=20709393;
 //BA.debugLineNum = 20709393;BA.debugLine="Dim Headers(firstRow.Length) As String";
_headers = new String[_firstrow.length];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=20709394;
 //BA.debugLineNum = 20709394;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=20709395;
 //BA.debugLineNum = 20709395;BA.debugLine="Headers(i) = \"Col\" & (i + 1)";
_headers[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=20709398;
 //BA.debugLineNum = 20709398;BA.debugLine="innerClearAll(Headers.Length, True)";
__ref._innerclearall /*String*/ (null,_headers.length,__c.True);
RDebugUtils.currentLine=20709399;
 //BA.debugLineNum = 20709399;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20709400;
 //BA.debugLineNum = 20709400;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20709401;
 //BA.debugLineNum = 20709401;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=20709402;
 //BA.debugLineNum = 20709402;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=20709404;
 //BA.debugLineNum = 20709404;BA.debugLine="Dim col, Row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=20709405;
 //BA.debugLineNum = 20709405;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=20709406;
 //BA.debugLineNum = 20709406;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step26 = 1;
final int limit26 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit26 ;_col = _col + step26 ) {
RDebugUtils.currentLine=20709407;
 //BA.debugLineNum = 20709407;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=20709408;
 //BA.debugLineNum = 20709408;BA.debugLine="ColumnWidths(col) = SV2.Width / mNumberOfColumn";
__ref._columnwidths /*int[]*/ [_col] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=20709409;
 //BA.debugLineNum = 20709409;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
__ref._headerwidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
RDebugUtils.currentLine=20709410;
 //BA.debugLineNum = 20709410;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
__ref._datawidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
 }
};
 }else {
RDebugUtils.currentLine=20709413;
 //BA.debugLineNum = 20709413;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=20709414;
 //BA.debugLineNum = 20709414;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=20709415;
 //BA.debugLineNum = 20709415;BA.debugLine="strRow = List1.Get(col)";
_strrow = (String[])(_list1.Get(_col));
RDebugUtils.currentLine=20709416;
 //BA.debugLineNum = 20709416;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=20709417;
 //BA.debugLineNum = 20709417;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit37 ;_col = _col + step37 ) {
RDebugUtils.currentLine=20709418;
 //BA.debugLineNum = 20709418;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=20709421;
 //BA.debugLineNum = 20709421;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=20709422;
 //BA.debugLineNum = 20709422;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=20709426;
 //BA.debugLineNum = 20709426;BA.debugLine="For Row = 0 To List1.Size - 1";
{
final int step46 = 1;
final int limit46 = (int) (_list1.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit46 ;_row = _row + step46 ) {
RDebugUtils.currentLine=20709427;
 //BA.debugLineNum = 20709427;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=20709428;
 //BA.debugLineNum = 20709428;BA.debugLine="strRow = List1.Get(Row)";
_strrow = (String[])(_list1.Get(_row));
RDebugUtils.currentLine=20709429;
 //BA.debugLineNum = 20709429;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=20709430;
 //BA.debugLineNum = 20709430;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=20709431;
 //BA.debugLineNum = 20709431;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=20709434;
 //BA.debugLineNum = 20709434;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step54 = 1;
final int limit54 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit54 ;_col = _col + step54 ) {
RDebugUtils.currentLine=20709435;
 //BA.debugLineNum = 20709435;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 };
 }
};
RDebugUtils.currentLine=20709439;
 //BA.debugLineNum = 20709439;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=20709440;
 //BA.debugLineNum = 20709440;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=20709441;
 //BA.debugLineNum = 20709441;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }
};
 };
RDebugUtils.currentLine=20709445;
 //BA.debugLineNum = 20709445;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=20709446;
 //BA.debugLineNum = 20709446;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=20709450;
 //BA.debugLineNum = 20709450;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=20709452;
 //BA.debugLineNum = 20709452;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step67 = 1;
final int limit67 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=20709453;
 //BA.debugLineNum = 20709453;BA.debugLine="Dim strRow() As String";
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=20709454;
 //BA.debugLineNum = 20709454;BA.debugLine="strRow = List1.Get(i)";
_strrow = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=20709455;
 //BA.debugLineNum = 20709455;BA.debugLine="AddRow(strRow)";
__ref._addrow /*String*/ (null,_strrow);
 }
};
RDebugUtils.currentLine=20709458;
 //BA.debugLineNum = 20709458;BA.debugLine="End Sub";
return "";
}
public String  _pnlfastscroll_touch(b4a.example.ef.table __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "pnlfastscroll_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlfastscroll_touch", new Object[] {_action,_x,_y}));}
int _top = 0;
int _sv2top = 0;
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Private Sub pnlFastScroll_Touch (Action As Int, X";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="Select Action";
switch (_action) {
case 0: {
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="If Y >= pnlFastScrollCursor.Top And Y <= pnlFas";
if (_y>=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop() && _y<=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="FSY0 = pnlFastScrollCursor.Top";
__ref._fsy0 /*int*/  = __ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="FSdY = Y - FSY0";
__ref._fsdy /*int*/  = (int) (_y-__ref._fsy0 /*int*/ );
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="FastScrollActive = True";
__ref._fastscrollactive /*boolean*/  = __c.True;
 };
 break; }
case 2: {
RDebugUtils.currentLine=23592969;
 //BA.debugLineNum = 23592969;BA.debugLine="If FastScrollActive = True Then";
if (__ref._fastscrollactive /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="Private Top, SV2Top As Int";
_top = 0;
_sv2top = 0;
RDebugUtils.currentLine=23592971;
 //BA.debugLineNum = 23592971;BA.debugLine="Top = Max(Y - FSdY, 0)";
_top = (int) (__c.Max(_y-__ref._fsdy /*int*/ ,0));
RDebugUtils.currentLine=23592972;
 //BA.debugLineNum = 23592972;BA.debugLine="Top = Min(Top, pnlFastScroll.Height - pnlFastS";
_top = (int) (__c.Min(_top,__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=23592973;
 //BA.debugLineNum = 23592973;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=23592974;
 //BA.debugLineNum = 23592974;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23592975;
 //BA.debugLineNum = 23592975;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top +";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=23592977;
 //BA.debugLineNum = 23592977;BA.debugLine="SV2Top = Top / FScScale";
_sv2top = (int) (_top/(double)__ref._fscscale /*double*/ );
RDebugUtils.currentLine=23592978;
 //BA.debugLineNum = 23592978;BA.debugLine="SV2.VerticalScrollPosition = SV2Top";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_sv2top);
 };
 break; }
case 1: {
RDebugUtils.currentLine=23592981;
 //BA.debugLineNum = 23592981;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=23592983;
 //BA.debugLineNum = 23592983;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub RefreshLabels";
RDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="Private i, j As Int";
_i = 0;
_j = 0;
RDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=21364740;
 //BA.debugLineNum = 21364740;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step3 = 1;
final int limit3 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=21364741;
 //BA.debugLineNum = 21364741;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=21364744;
 //BA.debugLineNum = 21364744;BA.debugLine="If cTypeFaces.Length < mNumberOfColumns Then";
if (__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21364745;
 //BA.debugLineNum = 21364745;BA.debugLine="Private cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=21364746;
 //BA.debugLineNum = 21364746;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
RDebugUtils.currentLine=21364747;
 //BA.debugLineNum = 21364747;BA.debugLine="cTypeFaces(j) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }
};
 };
RDebugUtils.currentLine=21364751;
 //BA.debugLineNum = 21364751;BA.debugLine="If cTextColors.Length < mNumberOfColumns Then";
if (__ref._ctextcolors /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=21364752;
 //BA.debugLineNum = 21364752;BA.debugLine="Private cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=21364753;
 //BA.debugLineNum = 21364753;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit14 ;_j = _j + step14 ) {
RDebugUtils.currentLine=21364754;
 //BA.debugLineNum = 21364754;BA.debugLine="cTextColors(j) = cTextColor";
__ref._ctextcolors /*int[]*/ [_j] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=21364757;
 //BA.debugLineNum = 21364757;BA.debugLine="For i = 0 To LabelsCache.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=21364758;
 //BA.debugLineNum = 21364758;BA.debugLine="Private lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=21364759;
 //BA.debugLineNum = 21364759;BA.debugLine="lbls = LabelsCache.Get(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=21364760;
 //BA.debugLineNum = 21364760;BA.debugLine="For j = 0 To lbls.Length - 1";
{
final int step21 = 1;
final int limit21 = (int) (_lbls.length-1);
_j = (int) (0) ;
for (;_j <= limit21 ;_j = _j + step21 ) {
RDebugUtils.currentLine=21364761;
 //BA.debugLineNum = 21364761;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=21364762;
 //BA.debugLineNum = 21364762;BA.debugLine="lbls(j).Typeface = cTypeFaces(j)";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j].getObject()));
RDebugUtils.currentLine=21364763;
 //BA.debugLineNum = 21364763;BA.debugLine="lbls(j).TextColor = cTextColors(j)";
_lbls[_j].setTextColor(__ref._ctextcolors /*int[]*/ [_j]);
 }else {
RDebugUtils.currentLine=21364765;
 //BA.debugLineNum = 21364765;BA.debugLine="lbls(j).Typeface = cTypeFace";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=21364766;
 //BA.debugLineNum = 21364766;BA.debugLine="lbls(j).TextColor = cTextColor";
_lbls[_j].setTextColor(__ref._ctextcolor /*int*/ );
 };
 }
};
 }
};
RDebugUtils.currentLine=21364771;
 //BA.debugLineNum = 21364771;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all";
{
final int step31 = 1;
final int limit31 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=21364772;
 //BA.debugLineNum = 21364772;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=21364774;
 //BA.debugLineNum = 21364774;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub RemoveAccents(s As String) As String";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Dim normalizer As JavaObject";
_normalizer = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="normalizer.InitializeStatic(\"java.text.Normalizer";
_normalizer.InitializeStatic("java.text.Normalizer");
RDebugUtils.currentLine=28770307;
 //BA.debugLineNum = 28770307;BA.debugLine="Dim n As String = normalizer.RunMethod(\"normalize";
_n = BA.ObjectToString(_normalizer.RunMethod("normalize",new Object[]{(Object)(_s),(Object)("NFD")}));
RDebugUtils.currentLine=28770308;
 //BA.debugLineNum = 28770308;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=28770309;
 //BA.debugLineNum = 28770309;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=28770310;
 //BA.debugLineNum = 28770310;BA.debugLine="For i = 0 To n.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_n.length()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=28770311;
 //BA.debugLineNum = 28770311;BA.debugLine="If Regex.IsMatch(\"\\p{InCombiningDiacriticalMarks";
if (__c.Regex.IsMatch("\\p{InCombiningDiacriticalMarks}",BA.ObjectToString(_n.charAt(_i)))==__c.False) { 
RDebugUtils.currentLine=28770312;
 //BA.debugLineNum = 28770312;BA.debugLine="sb.Append(n.CharAt(i))";
_sb.Append(BA.ObjectToString(_n.charAt(_i)));
 };
 }
};
RDebugUtils.currentLine=28770315;
 //BA.debugLineNum = 28770315;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=28770316;
 //BA.debugLineNum = 28770316;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Public Sub RemoveRow(Row As Int)";
RDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="If (Row <0 Or Row > Data.Size-1) Then Return ' ca";
if ((_row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
if (true) return "";};
RDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=20905991;
 //BA.debugLineNum = 20905991;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=20905992;
 //BA.debugLineNum = 20905992;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rm";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=20905994;
 //BA.debugLineNum = 20905994;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step5 = 1;
final int limit5 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=20905995;
 //BA.debugLineNum = 20905995;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=20905996;
 //BA.debugLineNum = 20905996;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=20905997;
 //BA.debugLineNum = 20905997;BA.debugLine="If (keepSel > Row) Then";
if ((_keepsel>_row)) { 
RDebugUtils.currentLine=20905998;
 //BA.debugLineNum = 20905998;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel-1));
 };
 }
};
RDebugUtils.currentLine=20906003;
 //BA.debugLineNum = 20906003;BA.debugLine="If (prevIndex <> -1) Then";
if ((_previndex!=-1)) { 
RDebugUtils.currentLine=20906005;
 //BA.debugLineNum = 20906005;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=20906008;
 //BA.debugLineNum = 20906008;BA.debugLine="Data.RemoveAt(Row)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=20906009;
 //BA.debugLineNum = 20906009;BA.debugLine="lstRowColorIndexes.RemoveAt(Row)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=20906010;
 //BA.debugLineNum = 20906010;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step17 = 1;
final int limit17 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=20906011;
 //BA.debugLineNum = 20906011;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=20906022;
 //BA.debugLineNum = 20906022;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=20906023;
 //BA.debugLineNum = 20906023;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
__ref._maxvisiblerow /*int*/  = (int) (__c.Min(__ref._maxvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=20906024;
 //BA.debugLineNum = 20906024;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
__ref._minvisiblerow /*int*/  = (int) (__c.Min(__ref._minvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=20906025;
 //BA.debugLineNum = 20906025;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
{
final int step23 = 1;
final int limit23 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=20906027;
 //BA.debugLineNum = 20906027;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
 };
RDebugUtils.currentLine=20906031;
 //BA.debugLineNum = 20906031;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=20906032;
 //BA.debugLineNum = 20906032;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=20906033;
 //BA.debugLineNum = 20906033;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=20906035;
 //BA.debugLineNum = 20906035;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=20906036;
 //BA.debugLineNum = 20906036;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=20906037;
 //BA.debugLineNum = 20906037;BA.debugLine="End Sub";
return "";
}
public String  _removerowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removerowcolorn", false))
	 {return ((String) Debug.delegate(ba, "removerowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Public Sub RemoveRowColorN(Row As Int)";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="If Row > -1 And Row <lstRowColorIndexes.Size Then";
if (_row>-1 && _row<__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="lstRowColorIndexes.Set(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(0));
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
 };
RDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="End Sub";
return "";
}
public String  _removeview(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removeview", false))
	 {return ((String) Debug.delegate(ba, "removeview", null));}
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Public Sub RemoveView";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="pnlTable.RemoveView";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Sub ReverseIndexDouble(arrDouble() As Double, arrI";
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=31457283;
 //BA.debugLineNum = 31457283;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=31457284;
 //BA.debugLineNum = 31457284;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=31457285;
 //BA.debugLineNum = 31457285;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=31457286;
 //BA.debugLineNum = 31457286;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=31457287;
 //BA.debugLineNum = 31457287;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=31457288;
 //BA.debugLineNum = 31457288;BA.debugLine="Dim arrIndex2(arrDouble.Length) As Int";
_arrindex2 = new int[_arrdouble.length];
;
RDebugUtils.currentLine=31457290;
 //BA.debugLineNum = 31457290;BA.debugLine="iUB = arrDouble.Length - 1";
_iub = (int) (_arrdouble.length-1);
RDebugUtils.currentLine=31457292;
 //BA.debugLineNum = 31457292;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=31457294;
 //BA.debugLineNum = 31457294;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=31457295;
 //BA.debugLineNum = 31457295;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=31457297;
 //BA.debugLineNum = 31457297;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=31457299;
 //BA.debugLineNum = 31457299;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=31457300;
 //BA.debugLineNum = 31457300;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=31457301;
 //BA.debugLineNum = 31457301;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=31457303;
 //BA.debugLineNum = 31457303;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=31457305;
 //BA.debugLineNum = 31457305;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=31457306;
 //BA.debugLineNum = 31457306;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=31457307;
 //BA.debugLineNum = 31457307;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=31457308;
 //BA.debugLineNum = 31457308;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=31457309;
 //BA.debugLineNum = 31457309;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=31457310;
 //BA.debugLineNum = 31457310;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=31457311;
 //BA.debugLineNum = 31457311;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=31457313;
 //BA.debugLineNum = 31457313;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=31457316;
 //BA.debugLineNum = 31457316;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=31457317;
 //BA.debugLineNum = 31457317;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=31457318;
 //BA.debugLineNum = 31457318;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=31457319;
 //BA.debugLineNum = 31457319;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=31457320;
 //BA.debugLineNum = 31457320;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=31457322;
 //BA.debugLineNum = 31457322;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=31457324;
 //BA.debugLineNum = 31457324;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=31457330;
 //BA.debugLineNum = 31457330;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=31457332;
 //BA.debugLineNum = 31457332;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Sub ReverseIndexLong(arrLong() As Long, arrIndex()";
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=31391747;
 //BA.debugLineNum = 31391747;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=31391748;
 //BA.debugLineNum = 31391748;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=31391749;
 //BA.debugLineNum = 31391749;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=31391750;
 //BA.debugLineNum = 31391750;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=31391751;
 //BA.debugLineNum = 31391751;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=31391752;
 //BA.debugLineNum = 31391752;BA.debugLine="Dim arrIndex2(arrLong.Length) As Int";
_arrindex2 = new int[_arrlong.length];
;
RDebugUtils.currentLine=31391754;
 //BA.debugLineNum = 31391754;BA.debugLine="iUB = arrLong.Length - 1";
_iub = (int) (_arrlong.length-1);
RDebugUtils.currentLine=31391756;
 //BA.debugLineNum = 31391756;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=31391758;
 //BA.debugLineNum = 31391758;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=31391759;
 //BA.debugLineNum = 31391759;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=31391761;
 //BA.debugLineNum = 31391761;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=31391763;
 //BA.debugLineNum = 31391763;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=31391764;
 //BA.debugLineNum = 31391764;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=31391765;
 //BA.debugLineNum = 31391765;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=31391767;
 //BA.debugLineNum = 31391767;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=31391769;
 //BA.debugLineNum = 31391769;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=31391770;
 //BA.debugLineNum = 31391770;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=31391771;
 //BA.debugLineNum = 31391771;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=31391772;
 //BA.debugLineNum = 31391772;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=31391773;
 //BA.debugLineNum = 31391773;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=31391774;
 //BA.debugLineNum = 31391774;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=31391775;
 //BA.debugLineNum = 31391775;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=31391777;
 //BA.debugLineNum = 31391777;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=31391780;
 //BA.debugLineNum = 31391780;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=31391781;
 //BA.debugLineNum = 31391781;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=31391782;
 //BA.debugLineNum = 31391782;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=31391783;
 //BA.debugLineNum = 31391783;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=31391784;
 //BA.debugLineNum = 31391784;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=31391786;
 //BA.debugLineNum = 31391786;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=31391788;
 //BA.debugLineNum = 31391788;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=31391794;
 //BA.debugLineNum = 31391794;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=31391796;
 //BA.debugLineNum = 31391796;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Sub ReverseIndexString(arrString() As String, arrI";
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=31522819;
 //BA.debugLineNum = 31522819;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=31522820;
 //BA.debugLineNum = 31522820;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=31522821;
 //BA.debugLineNum = 31522821;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=31522822;
 //BA.debugLineNum = 31522822;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=31522823;
 //BA.debugLineNum = 31522823;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=31522824;
 //BA.debugLineNum = 31522824;BA.debugLine="Dim arrIndex2(arrString.Length) As Int";
_arrindex2 = new int[_arrstring.length];
;
RDebugUtils.currentLine=31522826;
 //BA.debugLineNum = 31522826;BA.debugLine="iUB = arrString.Length - 1";
_iub = (int) (_arrstring.length-1);
RDebugUtils.currentLine=31522828;
 //BA.debugLineNum = 31522828;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=31522830;
 //BA.debugLineNum = 31522830;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=31522831;
 //BA.debugLineNum = 31522831;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=31522833;
 //BA.debugLineNum = 31522833;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=31522835;
 //BA.debugLineNum = 31522835;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=31522836;
 //BA.debugLineNum = 31522836;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=31522837;
 //BA.debugLineNum = 31522837;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i+1)]]);
 }else {
RDebugUtils.currentLine=31522839;
 //BA.debugLineNum = 31522839;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i-1)]]);
 };
RDebugUtils.currentLine=31522841;
 //BA.debugLineNum = 31522841;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=31522842;
 //BA.debugLineNum = 31522842;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=31522843;
 //BA.debugLineNum = 31522843;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=31522844;
 //BA.debugLineNum = 31522844;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=31522845;
 //BA.debugLineNum = 31522845;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=31522846;
 //BA.debugLineNum = 31522846;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=31522847;
 //BA.debugLineNum = 31522847;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=31522849;
 //BA.debugLineNum = 31522849;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=31522852;
 //BA.debugLineNum = 31522852;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=31522853;
 //BA.debugLineNum = 31522853;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=31522854;
 //BA.debugLineNum = 31522854;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=31522855;
 //BA.debugLineNum = 31522855;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=31522856;
 //BA.debugLineNum = 31522856;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=31522859;
 //BA.debugLineNum = 31522859;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=31522861;
 //BA.debugLineNum = 31522861;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=31522867;
 //BA.debugLineNum = 31522867;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=31522869;
 //BA.debugLineNum = 31522869;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
RDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=20774920;
 //BA.debugLineNum = 20774920;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=20774923;
 //BA.debugLineNum = 20774923;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=20774924;
 //BA.debugLineNum = 20774924;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20774925;
 //BA.debugLineNum = 20774925;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=20774926;
 //BA.debugLineNum = 20774926;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=20774928;
 //BA.debugLineNum = 20774928;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=20774929;
 //BA.debugLineNum = 20774929;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=20774933;
 //BA.debugLineNum = 20774933;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, H";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(","),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=20774934;
 //BA.debugLineNum = 20774934;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub SaveTableToCSV2(Dir As String, Filename";
RDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="Dim headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Private headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=20840451;
 //BA.debugLineNum = 20840451;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=20840453;
 //BA.debugLineNum = 20840453;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=20840454;
 //BA.debugLineNum = 20840454;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=20840455;
 //BA.debugLineNum = 20840455;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20840456;
 //BA.debugLineNum = 20840456;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=20840457;
 //BA.debugLineNum = 20840457;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=20840460;
 //BA.debugLineNum = 20840460;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=20840461;
 //BA.debugLineNum = 20840461;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=20840462;
 //BA.debugLineNum = 20840462;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=20840463;
 //BA.debugLineNum = 20840463;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=20840465;
 //BA.debugLineNum = 20840465;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=20840466;
 //BA.debugLineNum = 20840466;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=20840470;
 //BA.debugLineNum = 20840470;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, SeparatorCha";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=20840471;
 //BA.debugLineNum = 20840471;BA.debugLine="End Sub";
return "";
}
public String  _scaletable(b4a.example.ef.table __ref,double _scalex,double _scaley,boolean _scalealldone) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "scaletable", false))
	 {return ((String) Debug.delegate(ba, "scaletable", new Object[] {_scalex,_scaley,_scalealldone}));}
int _i = 0;
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Public Sub ScaleTable(ScaleX As Double, ScaleY As";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="ToastMessageShow(\"Table.ScaleTable must be calle";
__c.ToastMessageShow(BA.ObjectToCharSequence("Table.ScaleTable must be called before filling the Table"),__c.False);
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="Log(\"Table.ScaleTable must be called before fill";
__c.LogImpl("027983875","Table.ScaleTable must be called before filling the Table",0);
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=27983879;
 //BA.debugLineNum = 27983879;BA.debugLine="cTextSize = cTextSize * Min(ScaleX, ScaleY)";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *__c.Min(_scalex,_scaley));
RDebugUtils.currentLine=27983880;
 //BA.debugLineNum = 27983880;BA.debugLine="cLineWidth = cLineWidth * ScaleX";
__ref._clinewidth /*int*/  = (int) (__ref._clinewidth /*int*/ *_scalex);
RDebugUtils.currentLine=27983881;
 //BA.debugLineNum = 27983881;BA.debugLine="ExtraWidth = ExtraWidth * ScaleX";
__ref._extrawidth /*int*/  = (int) (__ref._extrawidth /*int*/ *_scalex);
RDebugUtils.currentLine=27983882;
 //BA.debugLineNum = 27983882;BA.debugLine="cRowHeight  = cRowHeight * ScaleY";
__ref._crowheight /*int*/  = (int) (__ref._crowheight /*int*/ *_scaley);
RDebugUtils.currentLine=27983883;
 //BA.debugLineNum = 27983883;BA.debugLine="cHeaderHeight = cHeaderHeight * ScaleY";
__ref._cheaderheight /*int*/  = (int) (__ref._cheaderheight /*int*/ *_scaley);
RDebugUtils.currentLine=27983884;
 //BA.debugLineNum = 27983884;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=27983885;
 //BA.debugLineNum = 27983885;BA.debugLine="ColumnWidths(i) = ColumnWidths(i) * ScaleX";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._columnwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=27983886;
 //BA.debugLineNum = 27983886;BA.debugLine="DataWidths(i) = DataWidths(i) * ScaleX";
__ref._datawidths /*int[]*/ [_i] = (int) (__ref._datawidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=27983887;
 //BA.debugLineNum = 27983887;BA.debugLine="HeaderWidths(i) = HeaderWidths(i)	* ScaleX";
__ref._headerwidths /*int[]*/ [_i] = (int) (__ref._headerwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=27983888;
 //BA.debugLineNum = 27983888;BA.debugLine="SavedWidths(i) = SavedWidths(i)	* ScaleX";
__ref._savedwidths /*int[]*/ [_i] = (int) (__ref._savedwidths /*int[]*/ [_i]*_scalex);
 }
};
RDebugUtils.currentLine=27983891;
 //BA.debugLineNum = 27983891;BA.debugLine="If ScaleAllDone = False Then";
if (_scalealldone==__c.False) { 
RDebugUtils.currentLine=27983892;
 //BA.debugLineNum = 27983892;BA.debugLine="cLeft = cLeft * ScaleX";
__ref._cleft /*int*/  = (int) (__ref._cleft /*int*/ *_scalex);
RDebugUtils.currentLine=27983893;
 //BA.debugLineNum = 27983893;BA.debugLine="cTop = cTop * ScaleY";
__ref._ctop /*int*/  = (int) (__ref._ctop /*int*/ *_scaley);
RDebugUtils.currentLine=27983894;
 //BA.debugLineNum = 27983894;BA.debugLine="cWidth = cWidth * ScaleX";
__ref._cwidth /*int*/  = (int) (__ref._cwidth /*int*/ *_scalex);
RDebugUtils.currentLine=27983895;
 //BA.debugLineNum = 27983895;BA.debugLine="cHeight = cHeight * ScaleY";
__ref._cheight /*int*/  = (int) (__ref._cheight /*int*/ *_scaley);
RDebugUtils.currentLine=27983897;
 //BA.debugLineNum = 27983897;BA.debugLine="cTextSize = cTextSize * ScaleY";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *_scaley);
RDebugUtils.currentLine=27983898;
 //BA.debugLineNum = 27983898;BA.debugLine="pnlTable.Left = cLeft";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._cleft /*int*/ );
RDebugUtils.currentLine=27983899;
 //BA.debugLineNum = 27983899;BA.debugLine="pnlTable.Top = cTop";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._ctop /*int*/ );
RDebugUtils.currentLine=27983900;
 //BA.debugLineNum = 27983900;BA.debugLine="pnlTable.Width = cWidth";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._cwidth /*int*/ );
RDebugUtils.currentLine=27983901;
 //BA.debugLineNum = 27983901;BA.debugLine="pnlTable.Height = cHeight";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheight /*int*/ );
RDebugUtils.currentLine=27983902;
 //BA.debugLineNum = 27983902;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=27983903;
 //BA.debugLineNum = 27983903;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=27983904;
 //BA.debugLineNum = 27983904;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=27983905;
 //BA.debugLineNum = 27983905;BA.debugLine="SV2.Width = cWidth";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(__ref._cwidth /*int*/ );
 }else {
RDebugUtils.currentLine=27983907;
 //BA.debugLineNum = 27983907;BA.debugLine="SVF.Width = SVF.Width * ScaleX";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=27983908;
 //BA.debugLineNum = 27983908;BA.debugLine="SV2.Width = SV2.Width * ScaleX";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=27983909;
 //BA.debugLineNum = 27983909;BA.debugLine="SV2.Left = SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=27983911;
 //BA.debugLineNum = 27983911;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=27983912;
 //BA.debugLineNum = 27983912;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=27983913;
 //BA.debugLineNum = 27983913;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=27983914;
 //BA.debugLineNum = 27983914;BA.debugLine="SV2.Height = cHeight - cStatusLineHeight - cHea";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=27983915;
 //BA.debugLineNum = 27983915;BA.debugLine="SVF.Height = cHeight - cStatusLineHeight - cHea";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=27983917;
 //BA.debugLineNum = 27983917;BA.debugLine="SV2.Height = cHeight - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=27983918;
 //BA.debugLineNum = 27983918;BA.debugLine="SVF.Height = cHeight - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=27983920;
 //BA.debugLineNum = 27983920;BA.debugLine="lblFastScroll.Width = lblFastScroll.Width * Scal";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=27983921;
 //BA.debugLineNum = 27983921;BA.debugLine="lblFastScroll.Height = lblFastScroll.Height * Sc";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()*_scaley));
RDebugUtils.currentLine=27983923;
 //BA.debugLineNum = 27983923;BA.debugLine="lblFastScroll.TextSize = lblFastScroll.TextSize";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize()*_scaley));
RDebugUtils.currentLine=27983924;
 //BA.debugLineNum = 27983924;BA.debugLine="lblFastScroll.Left = lblFastScroll.Left * ScaleX";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getLeft()*_scalex));
RDebugUtils.currentLine=27983925;
 //BA.debugLineNum = 27983925;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=27983926;
 //BA.debugLineNum = 27983926;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=27983927;
 //BA.debugLineNum = 27983927;BA.debugLine="lblStatusLine.TextSize = cTextSize";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=27983928;
 //BA.debugLineNum = 27983928;BA.debugLine="lblStatusLine.Height = cStatusLineHeight";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._cstatuslineheight /*int*/ );
RDebugUtils.currentLine=27983929;
 //BA.debugLineNum = 27983929;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=27983931;
 //BA.debugLineNum = 27983931;BA.debugLine="CreateNewLabels";
__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
RDebugUtils.currentLine=27983932;
 //BA.debugLineNum = 27983932;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Private Sub Scroll(PosX As Int, PosY As Int)";
RDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
RDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)__ref._crowheight /*int*/ -30));
RDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV2.Heigh";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,(_posy+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="If minVisibleRow > -1 Then";
if (__ref._minvisiblerow /*int*/ >-1) { 
RDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="If minVisibleRow < currentMin Then";
if (__ref._minvisiblerow /*int*/ <_currentmin) { 
RDebugUtils.currentLine=19464199;
 //BA.debugLineNum = 19464199;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,__ref._maxvisiblerow /*int*/ ));
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=19464200;
 //BA.debugLineNum = 19464200;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=19464202;
 //BA.debugLineNum = 19464202;BA.debugLine="Else If minVisibleRow > currentMin Then";
if (__ref._minvisiblerow /*int*/ >_currentmin) { 
RDebugUtils.currentLine=19464204;
 //BA.debugLineNum = 19464204;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(__ref._minvisiblerow /*int*/ -1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=19464205;
 //BA.debugLineNum = 19464205;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
RDebugUtils.currentLine=19464208;
 //BA.debugLineNum = 19464208;BA.debugLine="If maxVisibleRow > currentMax Then";
if (__ref._maxvisiblerow /*int*/ >_currentmax) { 
RDebugUtils.currentLine=19464210;
 //BA.debugLineNum = 19464210;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,__ref._minvisiblerow /*int*/ ));
_i = __ref._maxvisiblerow /*int*/  ;
for (;_i >= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=19464211;
 //BA.debugLineNum = 19464211;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=19464213;
 //BA.debugLineNum = 19464213;BA.debugLine="Else If maxVisibleRow < currentMax Then";
if (__ref._maxvisiblerow /*int*/ <_currentmax) { 
RDebugUtils.currentLine=19464215;
 //BA.debugLineNum = 19464215;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(__ref._maxvisiblerow /*int*/ +1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=19464216;
 //BA.debugLineNum = 19464216;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
 };
RDebugUtils.currentLine=19464220;
 //BA.debugLineNum = 19464220;BA.debugLine="minVisibleRow = currentMin";
__ref._minvisiblerow /*int*/  = _currentmin;
RDebugUtils.currentLine=19464221;
 //BA.debugLineNum = 19464221;BA.debugLine="maxVisibleRow = currentMax";
__ref._maxvisiblerow /*int*/  = _currentmax;
RDebugUtils.currentLine=19464222;
 //BA.debugLineNum = 19464222;BA.debugLine="Header.Left = -PosX + mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-_posx+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=19464223;
 //BA.debugLineNum = 19464223;BA.debugLine="lblStatusLine.Left = - PosX";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (-_posx));
RDebugUtils.currentLine=19464224;
 //BA.debugLineNum = 19464224;BA.debugLine="End Sub";
return "";
}
public String  _setallowselection(b4a.example.ef.table __ref,boolean _allowselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setallowselection", false))
	 {return ((String) Debug.delegate(ba, "setallowselection", new Object[] {_allowselection}));}
RDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
RDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="cAllowSelection = AllowSelection";
__ref._callowselection /*boolean*/  = _allowselection;
RDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=21626883;
 //BA.debugLineNum = 21626883;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
 };
RDebugUtils.currentLine=21626885;
 //BA.debugLineNum = 21626885;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Public Sub SetAutomaticWidths";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="Dim row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="Dim Vals(mNumberOfColumns) As String";
_vals = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_vals,"");
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="Dim Width, Widths(mNumberOfColumns) As Int";
_width = 0;
_widths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=27721733;
 //BA.debugLineNum = 27721733;BA.debugLine="cAutomaticWidths = True";
__ref._cautomaticwidths /*boolean*/  = __c.True;
RDebugUtils.currentLine=27721735;
 //BA.debugLineNum = 27721735;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=27721736;
 //BA.debugLineNum = 27721736;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=27721737;
 //BA.debugLineNum = 27721737;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=27721739;
 //BA.debugLineNum = 27721739;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=27721742;
 //BA.debugLineNum = 27721742;BA.debugLine="For row = 0 To Data.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=27721743;
 //BA.debugLineNum = 27721743;BA.debugLine="Vals = Data.Get(row)";
_vals = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=27721744;
 //BA.debugLineNum = 27721744;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=27721745;
 //BA.debugLineNum = 27721745;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=27721747;
 //BA.debugLineNum = 27721747;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=27721749;
 //BA.debugLineNum = 27721749;BA.debugLine="If Widths(col) < Width Then";
if (_widths[_col]<_width) { 
RDebugUtils.currentLine=27721750;
 //BA.debugLineNum = 27721750;BA.debugLine="Widths(col) = Width";
_widths[_col] = _width;
 };
 }
};
 }
};
RDebugUtils.currentLine=27721754;
 //BA.debugLineNum = 27721754;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=27721755;
 //BA.debugLineNum = 27721755;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignment", false))
	 {return ((String) Debug.delegate(ba, "setcellalignment", new Object[] {_alignment}));}
int _i = 0;
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
RDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="cAlignment = Alignment";
__ref._calignment /*int*/  = _alignment;
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="MultiAlignments = False";
__ref._multialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=23330825;
 //BA.debugLineNum = 23330825;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setcellalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub SetCellAlignmentColN(Col As Int, Alignm";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23396361;
 //BA.debugLineNum = 23396361;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23396362;
 //BA.debugLineNum = 23396362;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23396363;
 //BA.debugLineNum = 23396363;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=23396364;
 //BA.debugLineNum = 23396364;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=23396367;
 //BA.debugLineNum = 23396367;BA.debugLine="cAlignments(Col) = AlignmentColN";
__ref._calignments /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=23396368;
 //BA.debugLineNum = 23396368;BA.debugLine="cAlignments0 = cAlignments";
__ref._calignments0 /*int[]*/  = __ref._calignments /*int[]*/ ;
RDebugUtils.currentLine=23396370;
 //BA.debugLineNum = 23396370;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=23396371;
 //BA.debugLineNum = 23396371;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=23396372;
 //BA.debugLineNum = 23396372;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=23396374;
 //BA.debugLineNum = 23396374;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignments", false))
	 {return ((String) Debug.delegate(ba, "setcellalignments", new Object[] {_alignments}));}
RDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
RDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="cAlignments0 = Alignments";
__ref._calignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=23265287;
 //BA.debugLineNum = 23265287;BA.debugLine="cAlignments = cAlignments0";
__ref._calignments /*int[]*/  = __ref._calignments0 /*int[]*/ ;
RDebugUtils.currentLine=23265289;
 //BA.debugLineNum = 23265289;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=23265290;
 //BA.debugLineNum = 23265290;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=23265291;
 //BA.debugLineNum = 23265291;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=23265293;
 //BA.debugLineNum = 23265293;BA.debugLine="End Sub";
return "";
}
public String  _setcolumncolors(b4a.example.ef.table __ref,int[] _columncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setcolumncolors", new Object[] {_columncolors}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
RDebugUtils.currentLine=26869761;
 //BA.debugLineNum = 26869761;BA.debugLine="cColumnColors = ColumnColors";
__ref._ccolumncolors /*int[]*/  = _columncolors;
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="Dim ColumnDrawables(cColumnColors.Length) As Obje";
_columndrawables = new Object[__ref._ccolumncolors /*int[]*/ .length];
{
int d0 = _columndrawables.length;
for (int i0 = 0;i0 < d0;i0++) {
_columndrawables[i0] = new Object();
}
}
;
RDebugUtils.currentLine=26869764;
 //BA.debugLineNum = 26869764;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=26869765;
 //BA.debugLineNum = 26869765;BA.debugLine="Private cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=26869766;
 //BA.debugLineNum = 26869766;BA.debugLine="cd.Initialize(cColumnColors(i), 0)";
_cd.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=26869767;
 //BA.debugLineNum = 26869767;BA.debugLine="ColumnDrawables(i) = cd";
__ref._columndrawables /*Object[]*/ [_i] = (Object)(_cd.getObject());
 }
};
RDebugUtils.currentLine=26869770;
 //BA.debugLineNum = 26869770;BA.debugLine="If ColumnColors.Length > 1 Then";
if (_columncolors.length>1) { 
RDebugUtils.currentLine=26869771;
 //BA.debugLineNum = 26869771;BA.debugLine="cUseColumnColors = True";
__ref._cusecolumncolors /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=26869773;
 //BA.debugLineNum = 26869773;BA.debugLine="cUseColumnColors = False";
__ref._cusecolumncolors /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=26869775;
 //BA.debugLineNum = 26869775;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=26869776;
 //BA.debugLineNum = 26869776;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=26869778;
 //BA.debugLineNum = 26869778;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatype(b4a.example.ef.table __ref,int _column,String _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatype", new Object[] {_column,_datatype}));}
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub SetColumnDataType(Column As Int, DataTy";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=28180483;
 //BA.debugLineNum = 28180483;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=28180486;
 //BA.debugLineNum = 28180486;BA.debugLine="If DataType <> \"T\" And DataType <> \"R\" And DataTy";
if ((_datatype).equals("T") == false && (_datatype).equals("R") == false && (_datatype).equals("I") == false) { 
RDebugUtils.currentLine=28180487;
 //BA.debugLineNum = 28180487;BA.debugLine="ToastMessageShow(\"Wrong data type only TEXT abd";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only TEXT abd NUMBER are allowed"),__c.False);
 }else {
RDebugUtils.currentLine=28180489;
 //BA.debugLineNum = 28180489;BA.debugLine="cColumnDataType(Column) = DataType";
__ref._ccolumndatatype /*String[]*/ [_column] = _datatype;
 };
RDebugUtils.currentLine=28180491;
 //BA.debugLineNum = 28180491;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatypes(b4a.example.ef.table __ref,String[] _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatypes", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatypes", new Object[] {_datatype}));}
int _col = 0;
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Public Sub SetColumnDataTypes(DataType() As String";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="If DataType.Length <> mNumberOfColumns Then";
if (_datatype.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="ToastMessageShow(\"Wrong number of columns\", Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong number of columns"),__c.False);
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="For Col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=28311559;
 //BA.debugLineNum = 28311559;BA.debugLine="If DataType(Col) <> \"T\" And DataType(Col) <> \"R\"";
if ((_datatype[_col]).equals("T") == false && (_datatype[_col]).equals("R") == false && (_datatype[_col]).equals("I") == false) { 
RDebugUtils.currentLine=28311560;
 //BA.debugLineNum = 28311560;BA.debugLine="ToastMessageShow(\"Wrong data type only T, R and";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only T, R and I are allowed"),__c.False);
RDebugUtils.currentLine=28311561;
 //BA.debugLineNum = 28311561;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=28311565;
 //BA.debugLineNum = 28311565;BA.debugLine="cColumnDataType = DataType";
__ref._ccolumndatatype /*String[]*/  = _datatype;
RDebugUtils.currentLine=28311566;
 //BA.debugLineNum = 28311566;BA.debugLine="End Sub";
return "";
}
public String  _setfastscroll(b4a.example.ef.table __ref,boolean _fastscroll) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscroll", false))
	 {return ((String) Debug.delegate(ba, "setfastscroll", new Object[] {_fastscroll}));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub setFastScroll (FastScroll As Boolean)";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="mFastScroll = FastScroll";
__ref._mfastscroll /*boolean*/  = _fastscroll;
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollcolumnindex(b4a.example.ef.table __ref,int _fastscrollcolumnindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollcolumnindex", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollcolumnindex", new Object[] {_fastscrollcolumnindex}));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Public Sub setFastScrollColumnIndex (FastScrollCol";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="mFastScrollColumnIndex = Max(0, FastScrollColumnI";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Max(0,_fastscrollcolumnindex));
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="mFastScrollColumnIndex = Min(mFastScrollColumnInd";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Min(__ref._mfastscrollcolumnindex /*int*/ ,__ref._mnumberofcolumns /*int*/ -1));
RDebugUtils.currentLine=29884419;
 //BA.debugLineNum = 29884419;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollfixedlabel(b4a.example.ef.table __ref,boolean _fastscrollfixedlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollfixedlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollfixedlabel", new Object[] {_fastscrollfixedlabel}));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Public Sub setFastScrollFixedLabel (FastScrollFixe";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="mFastScrollFixedLabel = FastScrollFixedLabel";
__ref._mfastscrollfixedlabel /*boolean*/  = _fastscrollfixedlabel;
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=30146563;
 //BA.debugLineNum = 30146563;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
RDebugUtils.currentLine=30146564;
 //BA.debugLineNum = 30146564;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=30146566;
 //BA.debugLineNum = 30146566;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=30146567;
 //BA.debugLineNum = 30146567;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=30146569;
 //BA.debugLineNum = 30146569;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=30146570;
 //BA.debugLineNum = 30146570;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelheight", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelheight", new Object[] {_height}));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Public Sub setFastScrollLabelHeight(Height As Int)";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="mFastScrollLabelHeight = Height";
__ref._mfastscrolllabelheight /*int*/  = _height;
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="lblFastScroll.Height = mFastScrollLabelHeight";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._mfastscrolllabelheight /*int*/ );
RDebugUtils.currentLine=30539779;
 //BA.debugLineNum = 30539779;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=30539780;
 //BA.debugLineNum = 30539780;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight -";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=30539781;
 //BA.debugLineNum = 30539781;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=30539783;
 //BA.debugLineNum = 30539783;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=30539785;
 //BA.debugLineNum = 30539785;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelmaxchars(b4a.example.ef.table __ref,int _fastscrolllabelmaxchars) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelmaxchars", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelmaxchars", new Object[] {_fastscrolllabelmaxchars}));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Public Sub setFastScrollLabelMaxChars(FastScrollLa";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="mFastScrollLabelMaxChars = FastScrollLabelMaxChar";
__ref._mfastscrolllabelmaxchars /*int*/  = _fastscrolllabelmaxchars;
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelwidth", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelwidth", new Object[] {_width}));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Public Sub setFastScrollLabelWidth(Width As Int)";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="mFastScrollLabelWidth = Width";
__ref._mfastscrolllabelwidth /*int*/  = _width;
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="lblFastScroll.Width = mFastScrollLabelWidth";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._mfastscrolllabelwidth /*int*/ );
RDebugUtils.currentLine=30408707;
 //BA.debugLineNum = 30408707;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=30408708;
 //BA.debugLineNum = 30408708;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
 }else {
RDebugUtils.currentLine=30408710;
 //BA.debugLineNum = 30408710;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
 };
RDebugUtils.currentLine=30408712;
 //BA.debugLineNum = 30408712;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollminitems(b4a.example.ef.table __ref,int _fastscrollminitems) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollminitems", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollminitems", new Object[] {_fastscrollminitems}));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Public Sub setFastScrollMinItems (FastScrollMinIte";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="mFastScrollMinItems = FastScrollMinItems";
__ref._mfastscrollminitems /*int*/  = _fastscrollminitems;
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollshowlabel(b4a.example.ef.table __ref,boolean _fastscrollshowlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollshowlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollshowlabel", new Object[] {_fastscrollshowlabel}));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Public Sub setFastScrollShowLabel (FastScrollShowL";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="mFastScrollShowLabel = FastScrollShowLabel";
__ref._mfastscrollshowlabel /*boolean*/  = _fastscrollshowlabel;
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=30015491;
 //BA.debugLineNum = 30015491;BA.debugLine="End Sub";
return "";
}
public String  _setfirstcolumnfixed(b4a.example.ef.table __ref,boolean _firstcolumnfixed) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfirstcolumnfixed", false))
	 {return ((String) Debug.delegate(ba, "setfirstcolumnfixed", new Object[] {_firstcolumnfixed}));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Public Sub setFirstColumnFixed(FirstColumnFixed As";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="If FirstColumnFixed = True Then";
if (_firstcolumnfixed==__c.True) { 
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="setNumberOfFixedColumns(1)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (1));
 };
 }else {
RDebugUtils.currentLine=29360134;
 //BA.debugLineNum = 29360134;BA.debugLine="If mNumberOfFixedColumns = 1 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==1) { 
RDebugUtils.currentLine=29360135;
 //BA.debugLineNum = 29360135;BA.debugLine="setNumberOfFixedColumns(0)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (0));
 };
 };
RDebugUtils.currentLine=29360138;
 //BA.debugLineNum = 29360138;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Public Sub setNumberOfFixedColumns(NumberOfFixedCo";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="NumberOfFixedColumns = Max(0, Min(3, NumberOfFixe";
_numberoffixedcolumns = (int) (__c.Max(0,__c.Min(3,_numberoffixedcolumns)));
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="If mNumberOfFixedColumns = NumberOfFixedColumns T";
if (__ref._mnumberoffixedcolumns /*int*/ ==_numberoffixedcolumns) { 
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=29229062;
 //BA.debugLineNum = 29229062;BA.debugLine="If Header.NumberOfViews = 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=29229063;
 //BA.debugLineNum = 29229063;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns	'Ne";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
 }else {
RDebugUtils.currentLine=29229065;
 //BA.debugLineNum = 29229065;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=29229067;
 //BA.debugLineNum = 29229067;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=29229068;
 //BA.debugLineNum = 29229068;BA.debugLine="If HeaderFirst.NumberOfViews = 0 Then";
if (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=29229069;
 //BA.debugLineNum = 29229069;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=29229070;
 //BA.debugLineNum = 29229070;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29229071;
 //BA.debugLineNum = 29229071;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29229072;
 //BA.debugLineNum = 29229072;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 }else {
RDebugUtils.currentLine=29229075;
 //BA.debugLineNum = 29229075;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=29229076;
 //BA.debugLineNum = 29229076;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29229077;
 //BA.debugLineNum = 29229077;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29229078;
 //BA.debugLineNum = 29229078;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
RDebugUtils.currentLine=29229080;
 //BA.debugLineNum = 29229080;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=29229081;
 //BA.debugLineNum = 29229081;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29229082;
 //BA.debugLineNum = 29229082;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=29229083;
 //BA.debugLineNum = 29229083;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 };
RDebugUtils.currentLine=29229087;
 //BA.debugLineNum = 29229087;BA.debugLine="HeaderFirst.RemoveAllViews";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=29229088;
 //BA.debugLineNum = 29229088;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=29229090;
 //BA.debugLineNum = 29229090;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
RDebugUtils.currentLine=29229092;
 //BA.debugLineNum = 29229092;BA.debugLine="innerClearAll(mNumberOfColumns, False)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.False);
RDebugUtils.currentLine=29229093;
 //BA.debugLineNum = 29229093;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=29229094;
 //BA.debugLineNum = 29229094;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=29229095;
 //BA.debugLineNum = 29229095;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=29229096;
 //BA.debugLineNum = 29229096;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=29229099;
 //BA.debugLineNum = 29229099;BA.debugLine="Private currentMax As Int";
_currentmax = 0;
RDebugUtils.currentLine=29229100;
 //BA.debugLineNum = 29229100;BA.debugLine="currentMax = Min(Data.Size - 1, SV2.Height / cRo";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=29229102;
 //BA.debugLineNum = 29229102;BA.debugLine="For row = 0 To currentMax";
{
final int step38 = 1;
final int limit38 = _currentmax;
_row = (int) (0) ;
for (;_row <= limit38 ;_row = _row + step38 ) {
RDebugUtils.currentLine=29229103;
 //BA.debugLineNum = 29229103;BA.debugLine="ShowRow(row)";
__ref._showrow /*void*/ (null,_row);
 }
};
 };
RDebugUtils.currentLine=29229107;
 //BA.debugLineNum = 29229107;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignment", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignment", new Object[] {_alignment}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Public Sub setHeaderAlignment(Alignment As Int)";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="cHeaderAlignment = Alignment";
__ref._cheaderalignment /*int*/  = _alignment;
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="If cHeaderAlignments.Length = 0 Then";
if (__ref._cheaderalignments /*int[]*/ .length==0) { 
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="Private cHeaderAlignments(mNumberOfColumns) As I";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
 };
RDebugUtils.currentLine=23855111;
 //BA.debugLineNum = 23855111;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=23855112;
 //BA.debugLineNum = 23855112;BA.debugLine="HeaderMultiAlignments = False";
__ref._headermultialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=23855113;
 //BA.debugLineNum = 23855113;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=23855114;
 //BA.debugLineNum = 23855114;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=23855115;
 //BA.debugLineNum = 23855115;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit9 ;_col = _col + step9 ) {
RDebugUtils.currentLine=23855116;
 //BA.debugLineNum = 23855116;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23855117;
 //BA.debugLineNum = 23855117;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23855118;
 //BA.debugLineNum = 23855118;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=23855120;
 //BA.debugLineNum = 23855120;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=23855121;
 //BA.debugLineNum = 23855121;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23855122;
 //BA.debugLineNum = 23855122;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=23855123;
 //BA.debugLineNum = 23855123;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=23855126;
 //BA.debugLineNum = 23855126;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit20 ;_col = _col + step20 ) {
RDebugUtils.currentLine=23855127;
 //BA.debugLineNum = 23855127;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23855128;
 //BA.debugLineNum = 23855128;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23855129;
 //BA.debugLineNum = 23855129;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=23855133;
 //BA.debugLineNum = 23855133;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub SetHeaderAlignmentColN(Col As Int, Alig";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=23527428;
 //BA.debugLineNum = 23527428;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=23527429;
 //BA.debugLineNum = 23527429;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=23527430;
 //BA.debugLineNum = 23527430;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23527433;
 //BA.debugLineNum = 23527433;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23527434;
 //BA.debugLineNum = 23527434;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23527435;
 //BA.debugLineNum = 23527435;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=23527436;
 //BA.debugLineNum = 23527436;BA.debugLine="cHeaderAlignments0(i) = cHeaderAlignment";
__ref._cheaderalignments0 /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=23527439;
 //BA.debugLineNum = 23527439;BA.debugLine="cHeaderAlignments0(Col) = AlignmentColN";
__ref._cheaderalignments0 /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=23527440;
 //BA.debugLineNum = 23527440;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=23527441;
 //BA.debugLineNum = 23527441;BA.debugLine="If Header.NumberOfViews > 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=23527442;
 //BA.debugLineNum = 23527442;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=23527443;
 //BA.debugLineNum = 23527443;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23527444;
 //BA.debugLineNum = 23527444;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23527445;
 //BA.debugLineNum = 23527445;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=23527447;
 //BA.debugLineNum = 23527447;BA.debugLine="For i = 0 To mNumberOfFixedColumns - 1";
{
final int step21 = 1;
final int limit21 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=23527448;
 //BA.debugLineNum = 23527448;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23527449;
 //BA.debugLineNum = 23527449;BA.debugLine="If Col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=23527450;
 //BA.debugLineNum = 23527450;BA.debugLine="lbl = HeaderFirst.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23527451;
 //BA.debugLineNum = 23527451;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=23527453;
 //BA.debugLineNum = 23527453;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23527454;
 //BA.debugLineNum = 23527454;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col + mNumber";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [(int) (_col+__ref._mnumberoffixedcolumns /*int*/ )]);
 };
 }
};
 };
 };
RDebugUtils.currentLine=23527459;
 //BA.debugLineNum = 23527459;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=23527460;
 //BA.debugLineNum = 23527460;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignments", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignments", new Object[] {_alignments}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub SetHeaderAlignments(Alignments() As Int";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23461897;
 //BA.debugLineNum = 23461897;BA.debugLine="cHeaderAlignments0 = Alignments";
__ref._cheaderalignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=23461899;
 //BA.debugLineNum = 23461899;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=23461901;
 //BA.debugLineNum = 23461901;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23461903;
 //BA.debugLineNum = 23461903;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23461904;
 //BA.debugLineNum = 23461904;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=23461906;
 //BA.debugLineNum = 23461906;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=23461907;
 //BA.debugLineNum = 23461907;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23461908;
 //BA.debugLineNum = 23461908;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=23461909;
 //BA.debugLineNum = 23461909;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=23461912;
 //BA.debugLineNum = 23461912;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=23461913;
 //BA.debugLineNum = 23461913;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23461914;
 //BA.debugLineNum = 23461914;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23461915;
 //BA.debugLineNum = 23461915;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=23461919;
 //BA.debugLineNum = 23461919;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=23461920;
 //BA.debugLineNum = 23461920;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolor", false))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="cHeaderColor = Color";
__ref._cheadercolor /*int*/  = _color;
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=24117255;
 //BA.debugLineNum = 24117255;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24117256;
 //BA.debugLineNum = 24117256;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=24117257;
 //BA.debugLineNum = 24117257;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
RDebugUtils.currentLine=24117259;
 //BA.debugLineNum = 24117259;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=24117260;
 //BA.debugLineNum = 24117260;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=24117262;
 //BA.debugLineNum = 24117262;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=24117265;
 //BA.debugLineNum = 24117265;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=24117266;
 //BA.debugLineNum = 24117266;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24117267;
 //BA.debugLineNum = 24117267;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=24117268;
 //BA.debugLineNum = 24117268;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=24117272;
 //BA.debugLineNum = 24117272;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolors(b4a.example.ef.table __ref,int[] _headercolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolors", false))
	 {return ((String) Debug.delegate(ba, "setheadercolors", new Object[] {_headercolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=27131907;
 //BA.debugLineNum = 27131907;BA.debugLine="cHeaderColors = HeaderColors";
__ref._cheadercolors /*int[]*/  = _headercolors;
RDebugUtils.currentLine=27131908;
 //BA.debugLineNum = 27131908;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=27131909;
 //BA.debugLineNum = 27131909;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=27131910;
 //BA.debugLineNum = 27131910;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=27131911;
 //BA.debugLineNum = 27131911;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27131912;
 //BA.debugLineNum = 27131912;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27131913;
 //BA.debugLineNum = 27131913;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=27131915;
 //BA.debugLineNum = 27131915;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=27131916;
 //BA.debugLineNum = 27131916;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27131917;
 //BA.debugLineNum = 27131917;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=27131918;
 //BA.debugLineNum = 27131918;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=27131921;
 //BA.debugLineNum = 27131921;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=27131922;
 //BA.debugLineNum = 27131922;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27131923;
 //BA.debugLineNum = 27131923;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27131924;
 //BA.debugLineNum = 27131924;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=27131928;
 //BA.debugLineNum = 27131928;BA.debugLine="End Sub";
return "";
}
public String  _setheaderheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderheight", false))
	 {return ((String) Debug.delegate(ba, "setheaderheight", new Object[] {_height}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
RDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="cHeaderHeight = Height";
__ref._cheaderheight /*int*/  = _height;
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=23986179;
 //BA.debugLineNum = 23986179;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
RDebugUtils.currentLine=23986188;
 //BA.debugLineNum = 23986188;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=23986189;
 //BA.debugLineNum = 23986189;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23986190;
 //BA.debugLineNum = 23986190;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=23986191;
 //BA.debugLineNum = 23986191;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=23986194;
 //BA.debugLineNum = 23986194;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=23986195;
 //BA.debugLineNum = 23986195;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23986196;
 //BA.debugLineNum = 23986196;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=23986197;
 //BA.debugLineNum = 23986197;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=23986201;
 //BA.debugLineNum = 23986201;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=23986202;
 //BA.debugLineNum = 23986202;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=23986203;
 //BA.debugLineNum = 23986203;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=23986204;
 //BA.debugLineNum = 23986204;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight -";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ -__ref._cstatuslineheight /*int*/ ));
 }else {
RDebugUtils.currentLine=23986206;
 //BA.debugLineNum = 23986206;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=23986208;
 //BA.debugLineNum = 23986208;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=23986209;
 //BA.debugLineNum = 23986209;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
 };
RDebugUtils.currentLine=23986211;
 //BA.debugLineNum = 23986211;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolor", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="cHeaderTextColor = Color";
__ref._cheadertextcolor /*int*/  = _color;
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=24248326;
 //BA.debugLineNum = 24248326;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=24248327;
 //BA.debugLineNum = 24248327;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24248328;
 //BA.debugLineNum = 24248328;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=24248329;
 //BA.debugLineNum = 24248329;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=24248331;
 //BA.debugLineNum = 24248331;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=24248332;
 //BA.debugLineNum = 24248332;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24248333;
 //BA.debugLineNum = 24248333;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=24248334;
 //BA.debugLineNum = 24248334;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=24248337;
 //BA.debugLineNum = 24248337;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=24248338;
 //BA.debugLineNum = 24248338;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24248339;
 //BA.debugLineNum = 24248339;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=24248340;
 //BA.debugLineNum = 24248340;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=24248344;
 //BA.debugLineNum = 24248344;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolors(b4a.example.ef.table __ref,int[] _headertextcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolors", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolors", new Object[] {_headertextcolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=27262979;
 //BA.debugLineNum = 27262979;BA.debugLine="cHeaderTextColors = HeaderTextColors";
__ref._cheadertextcolors /*int[]*/  = _headertextcolors;
RDebugUtils.currentLine=27262980;
 //BA.debugLineNum = 27262980;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=27262981;
 //BA.debugLineNum = 27262981;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=27262982;
 //BA.debugLineNum = 27262982;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=27262983;
 //BA.debugLineNum = 27262983;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27262984;
 //BA.debugLineNum = 27262984;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27262985;
 //BA.debugLineNum = 27262985;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=27262987;
 //BA.debugLineNum = 27262987;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=27262988;
 //BA.debugLineNum = 27262988;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27262989;
 //BA.debugLineNum = 27262989;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=27262990;
 //BA.debugLineNum = 27262990;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=27262993;
 //BA.debugLineNum = 27262993;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=27262994;
 //BA.debugLineNum = 27262994;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27262995;
 //BA.debugLineNum = 27262995;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27262996;
 //BA.debugLineNum = 27262996;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=27263000;
 //BA.debugLineNum = 27263000;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypeface(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _headertypeface) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypeface", false))
	 {return ((String) Debug.delegate(ba, "setheadertypeface", new Object[] {_headertypeface}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Public Sub setHeaderTypeFace(HeaderTypeFace As Typ";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="cHeaderTypeFace = HeaderTypeFace";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypeface;
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=27394051;
 //BA.debugLineNum = 27394051;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=27394053;
 //BA.debugLineNum = 27394053;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=27394054;
 //BA.debugLineNum = 27394054;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27394055;
 //BA.debugLineNum = 27394055;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27394056;
 //BA.debugLineNum = 27394056;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=27394058;
 //BA.debugLineNum = 27394058;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=27394059;
 //BA.debugLineNum = 27394059;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27394060;
 //BA.debugLineNum = 27394060;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=27394061;
 //BA.debugLineNum = 27394061;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=27394064;
 //BA.debugLineNum = 27394064;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=27394065;
 //BA.debugLineNum = 27394065;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27394066;
 //BA.debugLineNum = 27394066;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27394067;
 //BA.debugLineNum = 27394067;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
RDebugUtils.currentLine=27394071;
 //BA.debugLineNum = 27394071;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _headertypefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypefaces", false))
	 {return ((String) Debug.delegate(ba, "setheadertypefaces", new Object[] {_headertypefaces}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Public Sub SetHeaderTypeFaces(HeaderTypeFaces() As";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="If HeaderTypeFaces.Length = 1 Then";
if (_headertypefaces.length==1) { 
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="cHeaderTypeFace = HeaderTypeFaces(0)";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypefaces[(int) (0)];
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=27459592;
 //BA.debugLineNum = 27459592;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=27459593;
 //BA.debugLineNum = 27459593;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27459594;
 //BA.debugLineNum = 27459594;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27459595;
 //BA.debugLineNum = 27459595;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=27459597;
 //BA.debugLineNum = 27459597;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=27459598;
 //BA.debugLineNum = 27459598;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27459599;
 //BA.debugLineNum = 27459599;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=27459600;
 //BA.debugLineNum = 27459600;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=27459603;
 //BA.debugLineNum = 27459603;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=27459604;
 //BA.debugLineNum = 27459604;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27459605;
 //BA.debugLineNum = 27459605;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27459606;
 //BA.debugLineNum = 27459606;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
 }else {
RDebugUtils.currentLine=27459611;
 //BA.debugLineNum = 27459611;BA.debugLine="If HeaderTypeFaces.Length <> mNumberOfColumns Th";
if (_headertypefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=27459612;
 //BA.debugLineNum = 27459612;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=27459613;
 //BA.debugLineNum = 27459613;BA.debugLine="Log(\"SetHeaderTypeFaces: Invalid number of colu";
__c.LogImpl("027459613","SetHeaderTypeFaces: Invalid number of columns",0);
RDebugUtils.currentLine=27459614;
 //BA.debugLineNum = 27459614;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=27459616;
 //BA.debugLineNum = 27459616;BA.debugLine="cHeaderTypeFaces0 = HeaderTypeFaces";
__ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _headertypefaces;
RDebugUtils.currentLine=27459617;
 //BA.debugLineNum = 27459617;BA.debugLine="cHeaderTypeFaces = cHeaderTypeFaces0";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=27459618;
 //BA.debugLineNum = 27459618;BA.debugLine="HeaderMultiTypeFace = True";
__ref._headermultitypeface /*boolean*/  = __c.True;
RDebugUtils.currentLine=27459619;
 //BA.debugLineNum = 27459619;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numb";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=27459620;
 //BA.debugLineNum = 27459620;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=27459621;
 //BA.debugLineNum = 27459621;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step36 = 1;
final int limit36 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit36 ;_col = _col + step36 ) {
RDebugUtils.currentLine=27459622;
 //BA.debugLineNum = 27459622;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27459623;
 //BA.debugLineNum = 27459623;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27459624;
 //BA.debugLineNum = 27459624;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
RDebugUtils.currentLine=27459626;
 //BA.debugLineNum = 27459626;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfC";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=27459627;
 //BA.debugLineNum = 27459627;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27459628;
 //BA.debugLineNum = 27459628;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedCol";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=27459629;
 //BA.debugLineNum = 27459629;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 }else {
RDebugUtils.currentLine=27459632;
 //BA.debugLineNum = 27459632;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step47 = 1;
final int limit47 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit47 ;_col = _col + step47 ) {
RDebugUtils.currentLine=27459633;
 //BA.debugLineNum = 27459633;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27459634;
 //BA.debugLineNum = 27459634;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=27459635;
 //BA.debugLineNum = 27459635;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 };
 };
 };
 };
RDebugUtils.currentLine=27459641;
 //BA.debugLineNum = 27459641;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheight", false))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_height}));}
RDebugUtils.currentLine=22675456;
 //BA.debugLineNum = 22675456;BA.debugLine="Public Sub setHeight(Height As Int)";
RDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="pnlTable.Height = Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(_height);
RDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="SVF.Height = Height - cStatusLineHeight - cHeade";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="SV2.Height = Height - cStatusLineHeight - cHeade";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="SVF.Height = Height - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=22675464;
 //BA.debugLineNum = 22675464;BA.debugLine="SV2.Height = Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=22675466;
 //BA.debugLineNum = 22675466;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
RDebugUtils.currentLine=22675467;
 //BA.debugLineNum = 22675467;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=22675468;
 //BA.debugLineNum = 22675468;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=22675469;
 //BA.debugLineNum = 22675469;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=22675471;
 //BA.debugLineNum = 22675471;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=22675472;
 //BA.debugLineNum = 22675472;BA.debugLine="End Sub";
return "";
}
public String  _setleft(b4a.example.ef.table __ref,int _left) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setleft", false))
	 {return ((String) Debug.delegate(ba, "setleft", new Object[] {_left}));}
RDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub setLeft(Left As Int)";
RDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="pnlTable.Left = Left";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_left);
RDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(b4a.example.ef.table __ref,int _linewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setlinewidth", false))
	 {return ((String) Debug.delegate(ba, "setlinewidth", new Object[] {_linewidth}));}
RDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
RDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="cLineWidth = LineWidth";
__ref._clinewidth /*int*/  = _linewidth;
RDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="End Sub";
return "";
}
public String  _setmulticolumnsort(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmulticolumnsort", false))
	 {return ((String) Debug.delegate(ba, "setmulticolumnsort", new Object[] {_bdo}));}
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Public Sub setMultiColumnSort(bDo As Boolean)";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="mMultiColumnSort = bDo";
__ref._mmulticolumnsort /*boolean*/  = _bdo;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="End Sub";
return "";
}
public String  _setmultiselect(b4a.example.ef.table __ref,boolean _multiselect) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmultiselect", false))
	 {return ((String) Debug.delegate(ba, "setmultiselect", new Object[] {_multiselect}));}
RDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Public Sub setMultiSelect(MultiSelect As Boolean)";
RDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
RDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="mMultiSelect = MultiSelect";
__ref._mmultiselect /*boolean*/  = _multiselect;
RDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="End Sub";
return "";
}
public String  _setnumberofcolumns(b4a.example.ef.table __ref,int _numberofcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setnumberofcolumns", false))
	 {return ((String) Debug.delegate(ba, "setnumberofcolumns", new Object[] {_numberofcolumns}));}
int _col = 0;
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Public Sub setNumberOfColumns (NumberOfColumns As";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28508167;
 //BA.debugLineNum = 28508167;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28508168;
 //BA.debugLineNum = 28508168;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=28508170;
 //BA.debugLineNum = 28508170;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28508171;
 //BA.debugLineNum = 28508171;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=28508172;
 //BA.debugLineNum = 28508172;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }
};
RDebugUtils.currentLine=28508174;
 //BA.debugLineNum = 28508174;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor1(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor1", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor1", new Object[] {_color}));}
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub setRowColor1(Color As Int)";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="cRowColor1 = Color";
__ref._crowcolor1 /*int*/  = _color;
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor2(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor2", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor2", new Object[] {_color}));}
RDebugUtils.currentLine=24510464;
 //BA.debugLineNum = 24510464;BA.debugLine="Public Sub setRowColor2(Color As Int)";
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="cRowColor2 = Color";
__ref._crowcolor2 /*int*/  = _color;
RDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Public Sub SetRowColorN(Row As Int, Color As Int)";
RDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="Private New = False As Boolean";
_new = __c.False;
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="If lstRowColors.IndexOf(Color) >= 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))>=0) { 
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.IndexOf";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))+2));
 }else {
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="lstRowColors.Add(Color)";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_color));
RDebugUtils.currentLine=24641543;
 //BA.debugLineNum = 24641543;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.Size +";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()+1));
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="New = True";
_new = __c.True;
 };
RDebugUtils.currentLine=24641547;
 //BA.debugLineNum = 24641547;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=24641548;
 //BA.debugLineNum = 24641548;BA.debugLine="Private cdi(mNumberOfColumns) As Object";
_cdi = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cdi.length;
for (int i0 = 0;i0 < d0;i0++) {
_cdi[i0] = new Object();
}
}
;
RDebugUtils.currentLine=24641549;
 //BA.debugLineNum = 24641549;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=24641550;
 //BA.debugLineNum = 24641550;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=24641551;
 //BA.debugLineNum = 24641551;BA.debugLine="cdw.Initialize(Color, 0)";
_cdw.Initialize(_color,(int) (0));
RDebugUtils.currentLine=24641552;
 //BA.debugLineNum = 24641552;BA.debugLine="cdi(col) = cdw";
_cdi[_col] = (Object)(_cdw.getObject());
 }
};
RDebugUtils.currentLine=24641554;
 //BA.debugLineNum = 24641554;BA.debugLine="If New = False Then";
if (_new==__c.False) { 
RDebugUtils.currentLine=24641555;
 //BA.debugLineNum = 24641555;BA.debugLine="lstRowDrawables.Set(lstRowColors.IndexOf(Color)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Set(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color)),(Object)(_cdi));
 }else {
RDebugUtils.currentLine=24641557;
 //BA.debugLineNum = 24641557;BA.debugLine="lstRowDrawables.Add(cdi)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cdi));
 };
RDebugUtils.currentLine=24641562;
 //BA.debugLineNum = 24641562;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=24641564;
 //BA.debugLineNum = 24641564;BA.debugLine="End Sub";
return "";
}
public String  _setrowheight(b4a.example.ef.table __ref,int _rowheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowheight", false))
	 {return ((String) Debug.delegate(ba, "setrowheight", new Object[] {_rowheight}));}
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="If cRowHeight = cHeaderHeight Then";
if (__ref._crowheight /*int*/ ==__ref._cheaderheight /*int*/ ) { 
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="setHeaderHeight(RowHeight)";
__ref._setheaderheight /*String*/ (null,_rowheight);
 };
RDebugUtils.currentLine=25755652;
 //BA.debugLineNum = 25755652;BA.debugLine="cRowHeight = RowHeight";
__ref._crowheight /*int*/  = _rowheight;
RDebugUtils.currentLine=25755653;
 //BA.debugLineNum = 25755653;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcellcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcellcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcellcolor", new Object[] {_color}));}
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="cSelectedCellColor = Color";
__ref._cselectedcellcolor /*int*/  = _color;
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=25100293;
 //BA.debugLineNum = 25100293;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcelltextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcelltextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcelltextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub setSelectedCellTextColor(TextColor As I";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="cSelectedCellTextColor = TextColor";
__ref._cselectedcelltextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=25231365;
 //BA.debugLineNum = 25231365;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowcolor", new Object[] {_color}));}
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="cSelectedRowColor = Color";
__ref._cselectedrowcolor /*int*/  = _color;
RDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=24838149;
 //BA.debugLineNum = 24838149;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowtextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowtextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowtextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Public Sub setSelectedRowTextColor(TextColor As In";
RDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="cSelectedRowTextColor = TextColor";
__ref._cselectedrowtextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="Private row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=27590659;
 //BA.debugLineNum = 27590659;BA.debugLine="cSingleLine = SingleLine";
__ref._csingleline /*boolean*/  = _singleline;
RDebugUtils.currentLine=27590661;
 //BA.debugLineNum = 27590661;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=27590662;
 //BA.debugLineNum = 27590662;BA.debugLine="For row = 0 To LabelsCache.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit4 ;_row = _row + step4 ) {
RDebugUtils.currentLine=27590663;
 //BA.debugLineNum = 27590663;BA.debugLine="Private lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=27590664;
 //BA.debugLineNum = 27590664;BA.debugLine="lbls = LabelsCache.Get(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=27590665;
 //BA.debugLineNum = 27590665;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=27590666;
 //BA.debugLineNum = 27590666;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=27590667;
 //BA.debugLineNum = 27590667;BA.debugLine="jo = lbls(col)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbls[_col].getObject()));
RDebugUtils.currentLine=27590668;
 //BA.debugLineNum = 27590668;BA.debugLine="jo.RunMethod(\"setSingleLine\", Array(cSingleLin";
_jo.RunMethod("setSingleLine",new Object[]{(Object)(__ref._csingleline /*boolean*/ )});
 }
};
 }
};
 };
RDebugUtils.currentLine=27590673;
 //BA.debugLineNum = 27590673;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapcolor", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapcolor", new Object[] {_color}));}
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Public Sub setSortBitmapColor(Color As Int)";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="cSortBitmapColor = Color";
__ref._csortbitmapcolor /*int*/  = _color;
RDebugUtils.currentLine=28966914;
 //BA.debugLineNum = 28966914;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapwidth", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapwidth", new Object[] {_width}));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Public Sub setSortBitmapWidth(Width As Int)";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="cSortBitmapWidth = Width";
__ref._csortbitmapwidth /*int*/  = _width;
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="End Sub";
return "";
}
public String  _setsortcaseinsensitive(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcaseinsensitive", false))
	 {return ((String) Debug.delegate(ba, "setsortcaseinsensitive", new Object[] {_bdo}));}
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub setSortCaseInsensitive(bDo As Boolean)";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="mSortCaseInsensitive = bDo";
__ref._msortcaseinsensitive /*boolean*/  = _bdo;
RDebugUtils.currentLine=31719426;
 //BA.debugLineNum = 31719426;BA.debugLine="End Sub";
return "";
}
public String  _setsortcolumn(b4a.example.ef.table __ref,boolean _sortcolumn) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcolumn", false))
	 {return ((String) Debug.delegate(ba, "setsortcolumn", new Object[] {_sortcolumn}));}
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="cSortColumn = SortColumn";
__ref._csortcolumn /*boolean*/  = _sortcolumn;
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="End Sub";
return "";
}
public String  _setsortingbitmaps(b4a.example.ef.table __ref,String _bitmapascfilename,String _bitmapdesfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortingbitmaps", false))
	 {return ((String) Debug.delegate(ba, "setsortingbitmaps", new Object[] {_bitmapascfilename,_bitmapdesfilename}));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Public Sub SetSortingBitmaps(BitmapAscFilename As";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="bmpAsc.Initialize(File.DirAssets, BitmapAscFilena";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapascfilename);
RDebugUtils.currentLine=29097986;
 //BA.debugLineNum = 29097986;BA.debugLine="bmpDes.Initialize(File.DirAssets, BitmapDesFilena";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapdesfilename);
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="mCustomSortingBitmaps = True";
__ref._mcustomsortingbitmaps /*boolean*/  = __c.True;
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="End Sub";
return "";
}
public String  _setsortremoveaccents(b4a.example.ef.table __ref,boolean _sortremoveaccents) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortremoveaccents", false))
	 {return ((String) Debug.delegate(ba, "setsortremoveaccents", new Object[] {_sortremoveaccents}));}
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Public Sub setSortRemoveAccents(SortRemoveAccents";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="cSortRemoveAccents = SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = _sortremoveaccents;
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="End Sub";
return "";
}
public String  _setstatuslineheight(b4a.example.ef.table __ref,int _statuslineheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatuslineheight", false))
	 {return ((String) Debug.delegate(ba, "setstatuslineheight", new Object[] {_statuslineheight}));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub setStatusLineHeight(StatusLineHeight As";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="cStatusLineHeight = StatusLineHeight";
__ref._cstatuslineheight /*int*/  = _statuslineheight;
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="End Sub";
return "";
}
public String  _settablecolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settablecolor", false))
	 {return ((String) Debug.delegate(ba, "settablecolor", new Object[] {_color}));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub setTableColor(Color As Int)";
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="cTableColor = Color";
__ref._ctablecolor /*int*/  = _color;
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=25362436;
 //BA.debugLineNum = 25362436;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=25362437;
 //BA.debugLineNum = 25362437;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=25362438;
 //BA.debugLineNum = 25362438;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=25362439;
 //BA.debugLineNum = 25362439;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
 };
 };
RDebugUtils.currentLine=25362442;
 //BA.debugLineNum = 25362442;BA.debugLine="End Sub";
return "";
}
public String  _settag(b4a.example.ef.table __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settag", false))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_tag}));}
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Public Sub setTag(Tag As Object)";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="pnlTable.Tag = Tag";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(_tag);
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_color}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Public Sub setTextColor(Color As Int)";
RDebugUtils.currentLine=25493505;
 //BA.debugLineNum = 25493505;BA.debugLine="cTextColor = Color";
__ref._ctextcolor /*int*/  = _color;
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=25493508;
 //BA.debugLineNum = 25493508;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=25493509;
 //BA.debugLineNum = 25493509;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=25493510;
 //BA.debugLineNum = 25493510;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25493511;
 //BA.debugLineNum = 25493511;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=25493512;
 //BA.debugLineNum = 25493512;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=25493516;
 //BA.debugLineNum = 25493516;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=25493517;
 //BA.debugLineNum = 25493517;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=25493518;
 //BA.debugLineNum = 25493518;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=25493519;
 //BA.debugLineNum = 25493519;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25493520;
 //BA.debugLineNum = 25493520;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=25493521;
 //BA.debugLineNum = 25493521;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=25493523;
 //BA.debugLineNum = 25493523;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=25493524;
 //BA.debugLineNum = 25493524;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=25493525;
 //BA.debugLineNum = 25493525;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25493526;
 //BA.debugLineNum = 25493526;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=25493527;
 //BA.debugLineNum = 25493527;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=25493531;
 //BA.debugLineNum = 25493531;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="cTextColors = TextColors";
__ref._ctextcolors /*int[]*/  = _textcolors;
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="If cTextColors.Length = 1 Then";
if (__ref._ctextcolors /*int[]*/ .length==1) { 
RDebugUtils.currentLine=27000835;
 //BA.debugLineNum = 27000835;BA.debugLine="MultiTextColors = False";
__ref._multitextcolors /*boolean*/  = __c.False;
RDebugUtils.currentLine=27000836;
 //BA.debugLineNum = 27000836;BA.debugLine="setTextColor(cTextColors(0))";
__ref._settextcolor /*String*/ (null,__ref._ctextcolors /*int[]*/ [(int) (0)]);
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="MultiTextColors = True";
__ref._multitextcolors /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=27000841;
 //BA.debugLineNum = 27000841;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=27000842;
 //BA.debugLineNum = 27000842;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=27000843;
 //BA.debugLineNum = 27000843;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=27000844;
 //BA.debugLineNum = 27000844;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=27000845;
 //BA.debugLineNum = 27000845;BA.debugLine="col = i Mod mNumberOfColumns";
_col = (int) (_i%__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=27000846;
 //BA.debugLineNum = 27000846;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27000847;
 //BA.debugLineNum = 27000847;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=27000848;
 //BA.debugLineNum = 27000848;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 }else {
RDebugUtils.currentLine=27000852;
 //BA.debugLineNum = 27000852;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=27000853;
 //BA.debugLineNum = 27000853;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=27000854;
 //BA.debugLineNum = 27000854;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=27000855;
 //BA.debugLineNum = 27000855;BA.debugLine="col = i Mod mNumberOfFixedColumns";
_col = (int) (_i%__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=27000856;
 //BA.debugLineNum = 27000856;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27000857;
 //BA.debugLineNum = 27000857;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=27000858;
 //BA.debugLineNum = 27000858;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=27000860;
 //BA.debugLineNum = 27000860;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step28 = 1;
final int limit28 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=27000861;
 //BA.debugLineNum = 27000861;BA.debugLine="col = i Mod (mNumberOfColumns - mNumberOfFixed";
_col = (int) (_i%(__ref._mnumberofcolumns /*int*/ -__ref._mnumberoffixedcolumns /*int*/ )+__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=27000862;
 //BA.debugLineNum = 27000862;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27000863;
 //BA.debugLineNum = 27000863;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=27000864;
 //BA.debugLineNum = 27000864;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=27000868;
 //BA.debugLineNum = 27000868;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.ef.table __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_size}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub setTextSize(Size As Float)";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="cTextSize = Size";
__ref._ctextsize /*float*/  = _size;
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=25624582;
 //BA.debugLineNum = 25624582;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=25624583;
 //BA.debugLineNum = 25624583;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=25624584;
 //BA.debugLineNum = 25624584;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624585;
 //BA.debugLineNum = 25624585;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=25624586;
 //BA.debugLineNum = 25624586;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=25624590;
 //BA.debugLineNum = 25624590;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=25624591;
 //BA.debugLineNum = 25624591;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=25624592;
 //BA.debugLineNum = 25624592;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624593;
 //BA.debugLineNum = 25624593;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=25624594;
 //BA.debugLineNum = 25624594;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=25624598;
 //BA.debugLineNum = 25624598;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=25624599;
 //BA.debugLineNum = 25624599;BA.debugLine="For i = 0 To HeaderFirst.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=25624600;
 //BA.debugLineNum = 25624600;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624601;
 //BA.debugLineNum = 25624601;BA.debugLine="lbl = HeaderFirst.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=25624602;
 //BA.debugLineNum = 25624602;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=25624604;
 //BA.debugLineNum = 25624604;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=25624605;
 //BA.debugLineNum = 25624605;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624606;
 //BA.debugLineNum = 25624606;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=25624607;
 //BA.debugLineNum = 25624607;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=25624611;
 //BA.debugLineNum = 25624611;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=25624612;
 //BA.debugLineNum = 25624612;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step32 = 1;
final int limit32 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=25624613;
 //BA.debugLineNum = 25624613;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624614;
 //BA.debugLineNum = 25624614;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=25624615;
 //BA.debugLineNum = 25624615;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=25624617;
 //BA.debugLineNum = 25624617;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=25624618;
 //BA.debugLineNum = 25624618;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25624619;
 //BA.debugLineNum = 25624619;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=25624620;
 //BA.debugLineNum = 25624620;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 };
RDebugUtils.currentLine=25624624;
 //BA.debugLineNum = 25624624;BA.debugLine="End Sub";
return "";
}
public String  _settop(b4a.example.ef.table __ref,int _top) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settop", false))
	 {return ((String) Debug.delegate(ba, "settop", new Object[] {_top}));}
RDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Public Sub setTop(Top As Int)";
RDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="pnlTable.Top = Top";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settypefaces", false))
	 {return ((String) Debug.delegate(ba, "settypefaces", new Object[] {_typefaces}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="If TypeFaces.Length = 1 Then";
if (_typefaces.length==1) { 
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="cTypeFace = TypeFaces(0)";
__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _typefaces[(int) (0)];
RDebugUtils.currentLine=26017795;
 //BA.debugLineNum = 26017795;BA.debugLine="MultiTypeFace = False";
__ref._multitypeface /*boolean*/  = __c.False;
 }else {
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="If TypeFaces.Length <> mNumberOfColumns Then";
if (_typefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=26017799;
 //BA.debugLineNum = 26017799;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=26017802;
 //BA.debugLineNum = 26017802;BA.debugLine="cTypeFaces0 = TypeFaces";
__ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _typefaces;
RDebugUtils.currentLine=26017803;
 //BA.debugLineNum = 26017803;BA.debugLine="cTypeFaces = cTypeFaces0";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=26017804;
 //BA.debugLineNum = 26017804;BA.debugLine="MultiTypeFace = True";
__ref._multitypeface /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=26017807;
 //BA.debugLineNum = 26017807;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=26017808;
 //BA.debugLineNum = 26017808;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=26017810;
 //BA.debugLineNum = 26017810;BA.debugLine="End Sub";
return "";
}
public String  _setusecolumncolors(b4a.example.ef.table __ref,boolean _usecolumncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setusecolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setusecolumncolors", new Object[] {_usecolumncolors}));}
int _i = 0;
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="cUseColumnColors = UseColumnColors";
__ref._cusecolumncolors /*boolean*/  = _usecolumncolors;
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="If cColumnColors.Length = 0 Then";
if (__ref._ccolumncolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=26738692;
 //BA.debugLineNum = 26738692;BA.debugLine="Dim cColumnColors(mNumberOfColumns) As Int";
_ccolumncolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26738693;
 //BA.debugLineNum = 26738693;BA.debugLine="Dim cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26738694;
 //BA.debugLineNum = 26738694;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=26738695;
 //BA.debugLineNum = 26738695;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=26738696;
 //BA.debugLineNum = 26738696;BA.debugLine="cColumnColors(i) = cRowColor1";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor1 /*int*/ ;
 }else {
RDebugUtils.currentLine=26738698;
 //BA.debugLineNum = 26738698;BA.debugLine="cColumnColors(i) = cRowColor2";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor2 /*int*/ ;
 };
RDebugUtils.currentLine=26738700;
 //BA.debugLineNum = 26738700;BA.debugLine="cTextColors(i) = cTextColor";
__ref._ctextcolors /*int[]*/ [_i] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=26738704;
 //BA.debugLineNum = 26738704;BA.debugLine="If cHeaderColors.Length = 0 Then";
if (__ref._cheadercolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=26738705;
 //BA.debugLineNum = 26738705;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=26738706;
 //BA.debugLineNum = 26738706;BA.debugLine="Dim cHeaderColors(mNumberOfColumns) As Int";
_cheadercolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26738707;
 //BA.debugLineNum = 26738707;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=26738708;
 //BA.debugLineNum = 26738708;BA.debugLine="cHeaderColors(i) = cHeaderColor";
__ref._cheadercolors /*int[]*/ [_i] = __ref._cheadercolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=26738712;
 //BA.debugLineNum = 26738712;BA.debugLine="If cHeaderTextColors.Length = 0 Then";
if (__ref._cheadertextcolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=26738713;
 //BA.debugLineNum = 26738713;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=26738714;
 //BA.debugLineNum = 26738714;BA.debugLine="Dim cHeaderTextColors(mNumberOfColumns) As Int";
_cheadertextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26738715;
 //BA.debugLineNum = 26738715;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=26738716;
 //BA.debugLineNum = 26738716;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
__ref._cheadertextcolors /*int[]*/ [_i] = __ref._cheadertextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=26738719;
 //BA.debugLineNum = 26738719;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_col,_row,_value}));}
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=20316163;
 //BA.debugLineNum = 20316163;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
RDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=20316167;
 //BA.debugLineNum = 20316167;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
RDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.ef.table __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_visible}));}
RDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
RDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="pnlTable.Visible = Visible";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(_visible);
RDebugUtils.currentLine=22806530;
 //BA.debugLineNum = 22806530;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setwidth", false))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_width}));}
RDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Public Sub setWidth(Width As Int)";
RDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="pnlTable.Width = Width";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_width);
RDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="SV2.Width = Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(_width);
 }else {
RDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="SV2.Width = Width - SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (_width-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=22478857;
 //BA.debugLineNum = 22478857;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=22478858;
 //BA.debugLineNum = 22478858;BA.debugLine="End Sub";
return "";
}
public String  _setzeroselection(b4a.example.ef.table __ref,boolean _zeroselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setzeroselection", false))
	 {return ((String) Debug.delegate(ba, "setzeroselection", new Object[] {_zeroselection}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Public Sub setZeroSelection(ZeroSelection As Boole";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="mZeroSelection = ZeroSelection";
__ref._mzeroselection /*boolean*/  = _zeroselection;
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _snapshot(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "snapshot", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "snapshot", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpsnapshot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnltable = null;
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Public Sub SnapShot As Bitmap";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="Private bmpSnapshot As Bitmap";
_bmpsnapshot = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="Private xpnlTable As B4XView";
_xpnltable = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="xpnlTable = pnlTable";
_xpnltable = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="bmpSnapshot = xpnlTable.Snapshot";
_bmpsnapshot = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_xpnltable.Snapshot().getObject()));
RDebugUtils.currentLine=30605319;
 //BA.debugLineNum = 30605319;BA.debugLine="Return bmpSnapshot";
if (true) return _bmpsnapshot;
RDebugUtils.currentLine=30605320;
 //BA.debugLineNum = 30605320;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Sub SortOMDoubleIDX(arrDouble() As Double, bAscend";
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=31064067;
 //BA.debugLineNum = 31064067;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=31064068;
 //BA.debugLineNum = 31064068;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=31064069;
 //BA.debugLineNum = 31064069;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=31064071;
 //BA.debugLineNum = 31064071;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=31064072;
 //BA.debugLineNum = 31064072;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=31064073;
 //BA.debugLineNum = 31064073;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=31064074;
 //BA.debugLineNum = 31064074;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=31064077;
 //BA.debugLineNum = 31064077;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31064079;
 //BA.debugLineNum = 31064079;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=31064080;
 //BA.debugLineNum = 31064080;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=31064083;
 //BA.debugLineNum = 31064083;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=31064084;
 //BA.debugLineNum = 31064084;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=31064087;
 //BA.debugLineNum = 31064087;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=31064088;
 //BA.debugLineNum = 31064088;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31064089;
 //BA.debugLineNum = 31064089;BA.debugLine="If B4XOM.ContainsKey(arrDouble(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[(int) (_i)]))) { 
RDebugUtils.currentLine=31064090;
 //BA.debugLineNum = 31064090;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=31064092;
 //BA.debugLineNum = 31064092;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=31064094;
 //BA.debugLineNum = 31064094;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=31064095;
 //BA.debugLineNum = 31064095;BA.debugLine="B4XOM.Put(arrDouble(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=31064098;
 //BA.debugLineNum = 31064098;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=31064100;
 //BA.debugLineNum = 31064100;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=31064102;
 //BA.debugLineNum = 31064102;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=31064103;
 //BA.debugLineNum = 31064103;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=31064104;
 //BA.debugLineNum = 31064104;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=31064105;
 //BA.debugLineNum = 31064105;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=31064106;
 //BA.debugLineNum = 31064106;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=31064110;
 //BA.debugLineNum = 31064110;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=31064112;
 //BA.debugLineNum = 31064112;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Sub SortOMDoubleIDX2(arrDouble() As Double, arrInd";
RDebugUtils.currentLine=31129602;
 //BA.debugLineNum = 31129602;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=31129604;
 //BA.debugLineNum = 31129604;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=31129607;
 //BA.debugLineNum = 31129607;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=31129608;
 //BA.debugLineNum = 31129608;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=31129610;
 //BA.debugLineNum = 31129610;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=31129613;
 //BA.debugLineNum = 31129613;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31129615;
 //BA.debugLineNum = 31129615;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=31129616;
 //BA.debugLineNum = 31129616;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=31129619;
 //BA.debugLineNum = 31129619;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=31129620;
 //BA.debugLineNum = 31129620;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=31129623;
 //BA.debugLineNum = 31129623;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=31129624;
 //BA.debugLineNum = 31129624;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31129625;
 //BA.debugLineNum = 31129625;BA.debugLine="If B4XOM.ContainsKey(arrDouble(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=31129626;
 //BA.debugLineNum = 31129626;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=31129628;
 //BA.debugLineNum = 31129628;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=31129630;
 //BA.debugLineNum = 31129630;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=31129631;
 //BA.debugLineNum = 31129631;BA.debugLine="B4XOM.Put(arrDouble(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=31129634;
 //BA.debugLineNum = 31129634;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=31129636;
 //BA.debugLineNum = 31129636;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=31129638;
 //BA.debugLineNum = 31129638;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=31129639;
 //BA.debugLineNum = 31129639;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=31129640;
 //BA.debugLineNum = 31129640;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=31129641;
 //BA.debugLineNum = 31129641;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=31129642;
 //BA.debugLineNum = 31129642;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=31129646;
 //BA.debugLineNum = 31129646;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=31129648;
 //BA.debugLineNum = 31129648;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Sub SortOMLongIDX(arrLong() As Long, bAscending As";
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=30801923;
 //BA.debugLineNum = 30801923;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=30801924;
 //BA.debugLineNum = 30801924;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=30801925;
 //BA.debugLineNum = 30801925;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=30801927;
 //BA.debugLineNum = 30801927;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=30801928;
 //BA.debugLineNum = 30801928;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=30801929;
 //BA.debugLineNum = 30801929;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=30801930;
 //BA.debugLineNum = 30801930;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=30801933;
 //BA.debugLineNum = 30801933;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=30801935;
 //BA.debugLineNum = 30801935;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=30801936;
 //BA.debugLineNum = 30801936;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=30801939;
 //BA.debugLineNum = 30801939;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=30801940;
 //BA.debugLineNum = 30801940;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=30801943;
 //BA.debugLineNum = 30801943;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=30801944;
 //BA.debugLineNum = 30801944;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30801945;
 //BA.debugLineNum = 30801945;BA.debugLine="If B4XOM.ContainsKey(arrLong(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[(int) (_i)]))) { 
RDebugUtils.currentLine=30801946;
 //BA.debugLineNum = 30801946;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=30801948;
 //BA.debugLineNum = 30801948;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=30801950;
 //BA.debugLineNum = 30801950;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=30801951;
 //BA.debugLineNum = 30801951;BA.debugLine="B4XOM.Put(arrLong(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=30801954;
 //BA.debugLineNum = 30801954;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=30801956;
 //BA.debugLineNum = 30801956;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=30801958;
 //BA.debugLineNum = 30801958;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=30801959;
 //BA.debugLineNum = 30801959;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=30801960;
 //BA.debugLineNum = 30801960;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=30801961;
 //BA.debugLineNum = 30801961;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=30801962;
 //BA.debugLineNum = 30801962;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=30801966;
 //BA.debugLineNum = 30801966;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=30801968;
 //BA.debugLineNum = 30801968;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Sub SortOMLongIDX2(arrLong() As Long, arrIndex() A";
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=30932995;
 //BA.debugLineNum = 30932995;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=30932997;
 //BA.debugLineNum = 30932997;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=30932999;
 //BA.debugLineNum = 30932999;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=30933000;
 //BA.debugLineNum = 30933000;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=30933001;
 //BA.debugLineNum = 30933001;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=30933002;
 //BA.debugLineNum = 30933002;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=30933005;
 //BA.debugLineNum = 30933005;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=30933007;
 //BA.debugLineNum = 30933007;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=30933008;
 //BA.debugLineNum = 30933008;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=30933011;
 //BA.debugLineNum = 30933011;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=30933012;
 //BA.debugLineNum = 30933012;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=30933015;
 //BA.debugLineNum = 30933015;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=30933016;
 //BA.debugLineNum = 30933016;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=30933017;
 //BA.debugLineNum = 30933017;BA.debugLine="If B4XOM.ContainsKey(arrLong(arrIndex(i))) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=30933018;
 //BA.debugLineNum = 30933018;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=30933020;
 //BA.debugLineNum = 30933020;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=30933022;
 //BA.debugLineNum = 30933022;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=30933023;
 //BA.debugLineNum = 30933023;BA.debugLine="B4XOM.Put(arrLong(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=30933026;
 //BA.debugLineNum = 30933026;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=30933028;
 //BA.debugLineNum = 30933028;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=30933030;
 //BA.debugLineNum = 30933030;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=30933031;
 //BA.debugLineNum = 30933031;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=30933032;
 //BA.debugLineNum = 30933032;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=30933033;
 //BA.debugLineNum = 30933033;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=30933034;
 //BA.debugLineNum = 30933034;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=30933038;
 //BA.debugLineNum = 30933038;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=30933040;
 //BA.debugLineNum = 30933040;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Sub SortOMStringIDX(arrString() As String, bAscend";
RDebugUtils.currentLine=31195138;
 //BA.debugLineNum = 31195138;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=31195140;
 //BA.debugLineNum = 31195140;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=31195141;
 //BA.debugLineNum = 31195141;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=31195143;
 //BA.debugLineNum = 31195143;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=31195144;
 //BA.debugLineNum = 31195144;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=31195145;
 //BA.debugLineNum = 31195145;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=31195146;
 //BA.debugLineNum = 31195146;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=31195149;
 //BA.debugLineNum = 31195149;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31195151;
 //BA.debugLineNum = 31195151;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=31195152;
 //BA.debugLineNum = 31195152;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=31195155;
 //BA.debugLineNum = 31195155;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=31195156;
 //BA.debugLineNum = 31195156;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=31195159;
 //BA.debugLineNum = 31195159;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=31195160;
 //BA.debugLineNum = 31195160;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31195161;
 //BA.debugLineNum = 31195161;BA.debugLine="If B4XOM.ContainsKey(arrString(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[(int) (_i)]))) { 
RDebugUtils.currentLine=31195162;
 //BA.debugLineNum = 31195162;BA.debugLine="lstIndexes = B4XOM.Get(arrString(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=31195164;
 //BA.debugLineNum = 31195164;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=31195166;
 //BA.debugLineNum = 31195166;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=31195167;
 //BA.debugLineNum = 31195167;BA.debugLine="B4XOM.Put(arrString(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=31195170;
 //BA.debugLineNum = 31195170;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=31195171;
 //BA.debugLineNum = 31195171;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=31195173;
 //BA.debugLineNum = 31195173;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=31195176;
 //BA.debugLineNum = 31195176;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=31195178;
 //BA.debugLineNum = 31195178;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=31195179;
 //BA.debugLineNum = 31195179;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=31195180;
 //BA.debugLineNum = 31195180;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=31195181;
 //BA.debugLineNum = 31195181;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=31195182;
 //BA.debugLineNum = 31195182;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=31195186;
 //BA.debugLineNum = 31195186;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=31195188;
 //BA.debugLineNum = 31195188;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Sub SortOMStringIDX2(arrString() As String, arrInd";
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=31326211;
 //BA.debugLineNum = 31326211;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=31326212;
 //BA.debugLineNum = 31326212;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=31326213;
 //BA.debugLineNum = 31326213;BA.debugLine="Dim B4XOM As B4XOrderedMap 'this needs the B4XCol";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=31326215;
 //BA.debugLineNum = 31326215;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=31326216;
 //BA.debugLineNum = 31326216;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=31326217;
 //BA.debugLineNum = 31326217;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=31326218;
 //BA.debugLineNum = 31326218;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=31326221;
 //BA.debugLineNum = 31326221;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=31326223;
 //BA.debugLineNum = 31326223;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=31326224;
 //BA.debugLineNum = 31326224;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=31326227;
 //BA.debugLineNum = 31326227;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=31326228;
 //BA.debugLineNum = 31326228;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=31326231;
 //BA.debugLineNum = 31326231;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=31326232;
 //BA.debugLineNum = 31326232;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=31326233;
 //BA.debugLineNum = 31326233;BA.debugLine="If B4XOM.ContainsKey(arrString(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=31326234;
 //BA.debugLineNum = 31326234;BA.debugLine="lstIndexes = B4XOM.Get(arrString(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=31326236;
 //BA.debugLineNum = 31326236;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=31326238;
 //BA.debugLineNum = 31326238;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=31326239;
 //BA.debugLineNum = 31326239;BA.debugLine="B4XOM.Put(arrString(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=31326242;
 //BA.debugLineNum = 31326242;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=31326243;
 //BA.debugLineNum = 31326243;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=31326245;
 //BA.debugLineNum = 31326245;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=31326248;
 //BA.debugLineNum = 31326248;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=31326250;
 //BA.debugLineNum = 31326250;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=31326251;
 //BA.debugLineNum = 31326251;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=31326252;
 //BA.debugLineNum = 31326252;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=31326253;
 //BA.debugLineNum = 31326253;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=31326254;
 //BA.debugLineNum = 31326254;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=31326258;
 //BA.debugLineNum = 31326258;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=31326260;
 //BA.debugLineNum = 31326260;BA.debugLine="End Sub";
return null;
}
public String  _unhidecol(b4a.example.ef.table __ref,int _col,int _newsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unhidecol", false))
	 {return ((String) Debug.delegate(ba, "unhidecol", new Object[] {_col,_newsize}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
RDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="For i=0 To SavedWidths.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="tmpWidths(col) = newSize";
_tmpwidths[_col] = _newsize;
RDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="End Sub";
return "";
}
public String  _unselectrow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unselectrow", false))
	 {return ((String) Debug.delegate(ba, "unselectrow", new Object[] {_row}));}
int _previndex = 0;
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub UnselectRow(Row As Int)";
RDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="prevIndex = SelectedRows.indexof(Row)	 ' -1 if se";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="If prevIndex > -1 Then";
if (_previndex>-1) { 
RDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="SelectedRows.RemoveAt(prevIndex)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
RDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=20447243;
 //BA.debugLineNum = 20447243;BA.debugLine="HideRow(Row)";
__ref._hiderow /*String*/ (null,_row);
RDebugUtils.currentLine=20447244;
 //BA.debugLineNum = 20447244;BA.debugLine="ShowRow(Row)";
__ref._showrow /*void*/ (null,_row);
 };
 };
RDebugUtils.currentLine=20447247;
 //BA.debugLineNum = 20447247;BA.debugLine="End Sub";
return "";
}
public boolean  _updatecell(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updatecell", false))
	 {return ((Boolean) Debug.delegate(ba, "updatecell", new Object[] {_col,_row,_value}));}
RDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Public Sub UpdateCell(Col As Int, Row As Int, Valu";
RDebugUtils.currentLine=21168129;
 //BA.debugLineNum = 21168129;BA.debugLine="If (Col < 0 Or Col > mNumberOfColumns - 1 Or Row";
if ((_col<0 || _col>__ref._mnumberofcolumns /*int*/ -1 || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=21168132;
 //BA.debugLineNum = 21168132;BA.debugLine="SetValue(Col, Row, Value)";
__ref._setvalue /*String*/ (null,_col,_row,_value);
RDebugUtils.currentLine=21168133;
 //BA.debugLineNum = 21168133;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=21168134;
 //BA.debugLineNum = 21168134;BA.debugLine="End Sub";
return false;
}
public boolean  _updaterow(b4a.example.ef.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updaterow", false))
	 {return ((Boolean) Debug.delegate(ba, "updaterow", new Object[] {_row,_values}));}
int _i = 0;
RDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As Stri";
RDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="If (Values.Length <> mNumberOfColumns Or Row <0 O";
if ((_values.length!=__ref._mnumberofcolumns /*int*/  || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="For i=0 To Values.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_values.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="SetValue(i,Row,Values(i))";
__ref._setvalue /*String*/ (null,_i,_row,_values[_i]);
 }
};
RDebugUtils.currentLine=21102600;
 //BA.debugLineNum = 21102600;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=21102601;
 //BA.debugLineNum = 21102601;BA.debugLine="End Sub";
return false;
}
}