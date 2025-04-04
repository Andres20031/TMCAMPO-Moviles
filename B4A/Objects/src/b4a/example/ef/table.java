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
RDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub AddRow(Values() As String)";
RDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("424379394","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=24379395;
 //BA.debugLineNum = 24379395;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=24379397;
 //BA.debugLineNum = 24379397;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=24379398;
 //BA.debugLineNum = 24379398;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=24379400;
 //BA.debugLineNum = 24379400;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=24379401;
 //BA.debugLineNum = 24379401;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=24379402;
 //BA.debugLineNum = 24379402;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=24379403;
 //BA.debugLineNum = 24379403;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=24379411;
 //BA.debugLineNum = 24379411;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="If visibleRows.ContainsKey(Row) Then Return";
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
RDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24510471;
 //BA.debugLineNum = 24510471;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=24510472;
 //BA.debugLineNum = 24510472;BA.debugLine="lbls = GetLabels(Row)";
_lbls = __ref._getlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null,_row);
RDebugUtils.currentLine=24510473;
 //BA.debugLineNum = 24510473;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=24510474;
 //BA.debugLineNum = 24510474;BA.debugLine="visibleRows.Put(Row, lbls)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_row),(Object)(_lbls));
RDebugUtils.currentLine=24510475;
 //BA.debugLineNum = 24510475;BA.debugLine="Dim rowColor() As Object";
_rowcolor = new Object[(int) (0)];
{
int d0 = _rowcolor.length;
for (int i0 = 0;i0 < d0;i0++) {
_rowcolor[i0] = new Object();
}
}
;
RDebugUtils.currentLine=24510476;
 //BA.debugLineNum = 24510476;BA.debugLine="Private txtColor As Int";
_txtcolor = 0;
RDebugUtils.currentLine=24510477;
 //BA.debugLineNum = 24510477;BA.debugLine="If (SelectedRows.indexof(Row) <> -1 )Then";
if (true) break;

case 7:
//if
this.state = 22;
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row))!=-1)) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=24510480;
 //BA.debugLineNum = 24510480;BA.debugLine="Else If lstRowColorIndexes.Get(Row) > 1 Then";
if ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))>1) { 
this.state = 11;
}else 
{RDebugUtils.currentLine=24510484;
 //BA.debugLineNum = 24510484;BA.debugLine="Else If cUseColumnColors = True Then";
if (__ref._cusecolumncolors /*boolean*/ ==parent.__c.True) { 
this.state = 13;
}else {
this.state = 15;
}}}
if (true) break;

case 9:
//C
this.state = 22;
RDebugUtils.currentLine=24510478;
 //BA.debugLineNum = 24510478;BA.debugLine="rowColor = SelectedDrawable";
_rowcolor = __ref._selecteddrawable /*Object[]*/ ;
RDebugUtils.currentLine=24510479;
 //BA.debugLineNum = 24510479;BA.debugLine="txtColor = cSelectedRowTextColor";
_txtcolor = __ref._cselectedrowtextcolor /*int*/ ;
 if (true) break;

case 11:
//C
this.state = 22;
RDebugUtils.currentLine=24510481;
 //BA.debugLineNum = 24510481;BA.debugLine="rowColor = lstRowDrawables.Get(lstRowColorIndexe";
_rowcolor = (Object[])(__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)));
RDebugUtils.currentLine=24510483;
 //BA.debugLineNum = 24510483;BA.debugLine="txtColor = GetContrastColor(lstRowColors.Get(lst";
_txtcolor = __ref._getcontrastcolor /*int*/ (null,(int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2)))));
 if (true) break;

case 13:
//C
this.state = 22;
RDebugUtils.currentLine=24510485;
 //BA.debugLineNum = 24510485;BA.debugLine="rowColor = ColumnDrawables";
_rowcolor = __ref._columndrawables /*Object[]*/ ;
RDebugUtils.currentLine=24510486;
 //BA.debugLineNum = 24510486;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=24510488;
 //BA.debugLineNum = 24510488;BA.debugLine="If Row Mod 2 = 0 Then";
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
RDebugUtils.currentLine=24510489;
 //BA.debugLineNum = 24510489;BA.debugLine="rowColor = Drawable1";
_rowcolor = __ref._drawable1 /*Object[]*/ ;
RDebugUtils.currentLine=24510490;
 //BA.debugLineNum = 24510490;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=24510492;
 //BA.debugLineNum = 24510492;BA.debugLine="rowColor = Drawable2";
_rowcolor = __ref._drawable2 /*Object[]*/ ;
RDebugUtils.currentLine=24510493;
 //BA.debugLineNum = 24510493;BA.debugLine="txtColor = cTextColor";
_txtcolor = __ref._ctextcolor /*int*/ ;
 if (true) break;

case 21:
//C
this.state = 22;
;
 if (true) break;
;
RDebugUtils.currentLine=24510496;
 //BA.debugLineNum = 24510496;BA.debugLine="If mNumberOfFixedColumns = 0 Then";

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
RDebugUtils.currentLine=24510497;
 //BA.debugLineNum = 24510497;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=24510498;
 //BA.debugLineNum = 24510498;BA.debugLine="If (Header.GetView(I).Width > 1 ) Then";
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
RDebugUtils.currentLine=24510499;
 //BA.debugLineNum = 24510499;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(I).L";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=24510500;
 //BA.debugLineNum = 24510500;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=24510501;
 //BA.debugLineNum = 24510501;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=24510502;
 //BA.debugLineNum = 24510502;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=24510503;
 //BA.debugLineNum = 24510503;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=24510504;
 //BA.debugLineNum = 24510504;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=24510506;
 //BA.debugLineNum = 24510506;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=24510507;
 //BA.debugLineNum = 24510507;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 40:
//C
this.state = 41;
RDebugUtils.currentLine=24510509;
 //BA.debugLineNum = 24510509;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 41:
//C
this.state = 42;
;
RDebugUtils.currentLine=24510511;
 //BA.debugLineNum = 24510511;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=24510513;
 //BA.debugLineNum = 24510513;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=24510514;
 //BA.debugLineNum = 24510514;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 46:
//C
this.state = 47;
RDebugUtils.currentLine=24510516;
 //BA.debugLineNum = 24510516;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=24510521;
 //BA.debugLineNum = 24510521;BA.debugLine="For i = 0 To lbls.Length - 1";
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
RDebugUtils.currentLine=24510522;
 //BA.debugLineNum = 24510522;BA.debugLine="If i < mNumberOfFixedColumns Then";
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
RDebugUtils.currentLine=24510523;
 //BA.debugLineNum = 24510523;BA.debugLine="SVF.Panel.AddView(lbls(i), HeaderFirst.GetView";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=24510524;
 //BA.debugLineNum = 24510524;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=24510525;
 //BA.debugLineNum = 24510525;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=24510526;
 //BA.debugLineNum = 24510526;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(R";
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
RDebugUtils.currentLine=24510527;
 //BA.debugLineNum = 24510527;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=24510528;
 //BA.debugLineNum = 24510528;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 62:
//C
this.state = 63;
RDebugUtils.currentLine=24510530;
 //BA.debugLineNum = 24510530;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=24510531;
 //BA.debugLineNum = 24510531;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=24510533;
 //BA.debugLineNum = 24510533;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 68:
//C
this.state = 69;
;
RDebugUtils.currentLine=24510535;
 //BA.debugLineNum = 24510535;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=24510537;
 //BA.debugLineNum = 24510537;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=24510538;
 //BA.debugLineNum = 24510538;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 73:
//C
this.state = 74;
RDebugUtils.currentLine=24510540;
 //BA.debugLineNum = 24510540;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=24510543;
 //BA.debugLineNum = 24510543;BA.debugLine="Private i_1 As Int";
_i_1 = 0;
RDebugUtils.currentLine=24510544;
 //BA.debugLineNum = 24510544;BA.debugLine="i_1 = i - mNumberOfFixedColumns";
_i_1 = (int) (_i-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=24510545;
 //BA.debugLineNum = 24510545;BA.debugLine="If (Header.GetView(i_1).Width > 1 ) Then";
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
RDebugUtils.currentLine=24510546;
 //BA.debugLineNum = 24510546;BA.debugLine="SV2.Panel.AddView(lbls(i), Header.GetView(i_1";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().AddView((android.view.View)(_lbls[_i].getObject()),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getLeft(),(int) (_row*__ref._crowheight /*int*/ ),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i_1).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=24510547;
 //BA.debugLineNum = 24510547;BA.debugLine="lbls(i).Text = values(i)";
_lbls[_i].setText(BA.ObjectToCharSequence(_values[_i]));
RDebugUtils.currentLine=24510548;
 //BA.debugLineNum = 24510548;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
RDebugUtils.currentLine=24510549;
 //BA.debugLineNum = 24510549;BA.debugLine="If i = SelectedCol And (SelectedRows.indexof(";
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
RDebugUtils.currentLine=24510550;
 //BA.debugLineNum = 24510550;BA.debugLine="lbls(i).TextColor = cSelectedCellTextColor";
_lbls[_i].setTextColor(__ref._cselectedcelltextcolor /*int*/ );
RDebugUtils.currentLine=24510551;
 //BA.debugLineNum = 24510551;BA.debugLine="lbls(i).Background = SelectedCellDrawable";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(__ref._selectedcelldrawable /*Object*/ ));
 if (true) break;

case 84:
//C
this.state = 85;
RDebugUtils.currentLine=24510553;
 //BA.debugLineNum = 24510553;BA.debugLine="If MultiTextColors = False Then";
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
RDebugUtils.currentLine=24510554;
 //BA.debugLineNum = 24510554;BA.debugLine="lbls(i).TextColor = txtColor";
_lbls[_i].setTextColor(_txtcolor);
 if (true) break;

case 89:
//C
this.state = 90;
RDebugUtils.currentLine=24510556;
 //BA.debugLineNum = 24510556;BA.debugLine="lbls(i).TextColor = cTextColors(i)";
_lbls[_i].setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 if (true) break;

case 90:
//C
this.state = 91;
;
RDebugUtils.currentLine=24510558;
 //BA.debugLineNum = 24510558;BA.debugLine="lbls(i).Background = rowColor(i)";
_lbls[_i].setBackground((android.graphics.drawable.Drawable)(_rowcolor[_i]));
 if (true) break;
;
RDebugUtils.currentLine=24510560;
 //BA.debugLineNum = 24510560;BA.debugLine="If MultiAlignments = False Then";

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
RDebugUtils.currentLine=24510561;
 //BA.debugLineNum = 24510561;BA.debugLine="lbls(i).Gravity = cAlignment";
_lbls[_i].setGravity(__ref._calignment /*int*/ );
 if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=24510563;
 //BA.debugLineNum = 24510563;BA.debugLine="lbls(i).Gravity = cAlignments(i)";
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
RDebugUtils.currentLine=24510571;
 //BA.debugLineNum = 24510571;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=24510572;
 //BA.debugLineNum = 24510572;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=24510573;
 //BA.debugLineNum = 24510573;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=24510574;
 //BA.debugLineNum = 24510574;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
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
RDebugUtils.currentLine=24510576;
 //BA.debugLineNum = 24510576;BA.debugLine="If SubExists(cCallBack, cEventName & \"_ShowRow\")";
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
RDebugUtils.currentLine=24510577;
 //BA.debugLineNum = 24510577;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "showrow"),(int) (0));
this.state = 115;
return;
case 115:
//C
this.state = 110;
;
RDebugUtils.currentLine=24510578;
 //BA.debugLineNum = 24510578;BA.debugLine="CallSub3(cCallBack, cEventName & \"_ShowRow\", Row";
parent.__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_ShowRow",(Object)(_row),(Object)(_lbls));
 if (true) break;

case 110:
//C
this.state = -1;
;
RDebugUtils.currentLine=24510580;
 //BA.debugLineNum = 24510580;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Public Sub AddRowAutomaticWidth(Values() As String";
RDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=24444931;
 //BA.debugLineNum = 24444931;BA.debugLine="If Values.Length <> mNumberOfColumns Then";
if (_values.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24444932;
 //BA.debugLineNum = 24444932;BA.debugLine="Log(\"Wrong number of values =\" & Values.Length &";
__c.LogImpl("424444932","Wrong number of values ="+BA.NumberToString(_values.length)+" col="+BA.NumberToString(__ref._mnumberofcolumns /*int*/ ),0);
RDebugUtils.currentLine=24444933;
 //BA.debugLineNum = 24444933;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=24444935;
 //BA.debugLineNum = 24444935;BA.debugLine="Data.Add(Values)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_values));
RDebugUtils.currentLine=24444936;
 //BA.debugLineNum = 24444936;BA.debugLine="lstRowColorIndexes.Add(0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
RDebugUtils.currentLine=24444938;
 //BA.debugLineNum = 24444938;BA.debugLine="Dim lastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=24444939;
 //BA.debugLineNum = 24444939;BA.debugLine="lastRow = Data.Size - 1";
_lastrow = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=24444941;
 //BA.debugLineNum = 24444941;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=24444942;
 //BA.debugLineNum = 24444942;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=24444943;
 //BA.debugLineNum = 24444943;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=24444944;
 //BA.debugLineNum = 24444944;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=24444945;
 //BA.debugLineNum = 24444945;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24444946;
 //BA.debugLineNum = 24444946;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=24444948;
 //BA.debugLineNum = 24444948;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Get";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=24444950;
 //BA.debugLineNum = 24444950;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=24444951;
 //BA.debugLineNum = 24444951;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=24444952;
 //BA.debugLineNum = 24444952;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=24444953;
 //BA.debugLineNum = 24444953;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=24444956;
 //BA.debugLineNum = 24444956;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=24444957;
 //BA.debugLineNum = 24444957;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24444958;
 //BA.debugLineNum = 24444958;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=24444960;
 //BA.debugLineNum = 24444960;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cType";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=24444962;
 //BA.debugLineNum = 24444962;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=24444963;
 //BA.debugLineNum = 24444963;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=24444964;
 //BA.debugLineNum = 24444964;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=24444965;
 //BA.debugLineNum = 24444965;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=24444966;
 //BA.debugLineNum = 24444966;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=24444967;
 //BA.debugLineNum = 24444967;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=24444971;
 //BA.debugLineNum = 24444971;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=24444972;
 //BA.debugLineNum = 24444972;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=24444975;
 //BA.debugLineNum = 24444975;BA.debugLine="If lastRow < (SV2.VerticalScrollPosition + SV2.He";
if (_lastrow<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +1) { 
RDebugUtils.currentLine=24444976;
 //BA.debugLineNum = 24444976;BA.debugLine="ShowRow(lastRow)";
__ref._showrow /*void*/ (null,_lastrow);
 };
RDebugUtils.currentLine=24444983;
 //BA.debugLineNum = 24444983;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub SetColumnsWidths(Widths() As Int)";
RDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=23986180;
 //BA.debugLineNum = 23986180;BA.debugLine="Dim SavedWidths(Widths.Length) As Int";
_savedwidths = new int[_widths.length];
;
RDebugUtils.currentLine=23986181;
 //BA.debugLineNum = 23986181;BA.debugLine="Dim ColumnWidths(Widths.Length) As Int";
_columnwidths = new int[_widths.length];
;
RDebugUtils.currentLine=23986182;
 //BA.debugLineNum = 23986182;BA.debugLine="Dim HeaderWidths(Widths.Length) As Int";
_headerwidths = new int[_widths.length];
;
RDebugUtils.currentLine=23986183;
 //BA.debugLineNum = 23986183;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23986184;
 //BA.debugLineNum = 23986184;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=23986185;
 //BA.debugLineNum = 23986185;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=23986186;
 //BA.debugLineNum = 23986186;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=23986187;
 //BA.debugLineNum = 23986187;BA.debugLine="HeaderWidths(col) = Widths(col)";
__ref._headerwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=23986188;
 //BA.debugLineNum = 23986188;BA.debugLine="DataWidths(col) = Widths(col)";
__ref._datawidths /*int[]*/ [_col] = _widths[_col];
 }
};
 }else {
RDebugUtils.currentLine=23986191;
 //BA.debugLineNum = 23986191;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step13 = 1;
final int limit13 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=23986192;
 //BA.debugLineNum = 23986192;BA.debugLine="SavedWidths(col) = Widths(col)";
__ref._savedwidths /*int[]*/ [_col] = _widths[_col];
RDebugUtils.currentLine=23986193;
 //BA.debugLineNum = 23986193;BA.debugLine="ColumnWidths(col) = Widths(col)";
__ref._columnwidths /*int[]*/ [_col] = _widths[_col];
 }
};
 };
RDebugUtils.currentLine=23986197;
 //BA.debugLineNum = 23986197;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=23986198;
 //BA.debugLineNum = 23986198;BA.debugLine="Private w As Int";
_w = 0;
RDebugUtils.currentLine=23986199;
 //BA.debugLineNum = 23986199;BA.debugLine="Private Left As Int";
_left = 0;
RDebugUtils.currentLine=23986200;
 //BA.debugLineNum = 23986200;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=23986201;
 //BA.debugLineNum = 23986201;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=23986202;
 //BA.debugLineNum = 23986202;BA.debugLine="For col = 0 To Widths.Length - 1";
{
final int step23 = 1;
final int limit23 = (int) (_widths.length-1);
_col = (int) (0) ;
for (;_col <= limit23 ;_col = _col + step23 ) {
RDebugUtils.currentLine=23986203;
 //BA.debugLineNum = 23986203;BA.debugLine="v = Header.GetView(col)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=23986204;
 //BA.debugLineNum = 23986204;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=23986205;
 //BA.debugLineNum = 23986205;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=23986206;
 //BA.debugLineNum = 23986206;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=23986207;
 //BA.debugLineNum = 23986207;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=23986208;
 //BA.debugLineNum = 23986208;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=23986211;
 //BA.debugLineNum = 23986211;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
RDebugUtils.currentLine=23986212;
 //BA.debugLineNum = 23986212;BA.debugLine="HeaderFirst.Width = 0";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=23986213;
 //BA.debugLineNum = 23986213;BA.debugLine="SVF.Width = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (0));
RDebugUtils.currentLine=23986214;
 //BA.debugLineNum = 23986214;BA.debugLine="Header.Width = Header.GetView(Widths.Length - 1)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_widths.length-1)).getLeft()+_widths[(int) (_widths.length-1)]));
RDebugUtils.currentLine=23986215;
 //BA.debugLineNum = 23986215;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=23986216;
 //BA.debugLineNum = 23986216;BA.debugLine="SV2.Left = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=23986217;
 //BA.debugLineNum = 23986217;BA.debugLine="SV2.Width = Min(Header.Width, cWidth)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=23986218;
 //BA.debugLineNum = 23986218;BA.debugLine="Header.Left = 0";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=23986219;
 //BA.debugLineNum = 23986219;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=23986220;
 //BA.debugLineNum = 23986220;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=23986221;
 //BA.debugLineNum = 23986221;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step42 = 1;
final int limit42 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit42 ;_row = _row + step42 ) {
RDebugUtils.currentLine=23986222;
 //BA.debugLineNum = 23986222;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=23986223;
 //BA.debugLineNum = 23986223;BA.debugLine="For col = 0 To lbls.Length - 1";
{
final int step44 = 1;
final int limit44 = (int) (_lbls.length-1);
_col = (int) (0) ;
for (;_col <= limit44 ;_col = _col + step44 ) {
RDebugUtils.currentLine=23986224;
 //BA.debugLineNum = 23986224;BA.debugLine="lbls(col).SetLayout(Header.GetView(col).Left,";
_lbls[_col].SetLayout(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft(),_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
 }
};
 }
};
RDebugUtils.currentLine=23986227;
 //BA.debugLineNum = 23986227;BA.debugLine="pnlTable.Width = Min(Header.Width, cWidth)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=23986228;
 //BA.debugLineNum = 23986228;BA.debugLine="lblStatusLine.Width = Header.Width";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=23986229;
 //BA.debugLineNum = 23986229;BA.debugLine="internalPanel.Width = Header.Width";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 }else {
RDebugUtils.currentLine=23986231;
 //BA.debugLineNum = 23986231;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=23986232;
 //BA.debugLineNum = 23986232;BA.debugLine="Private w, wt As Int";
_w = 0;
_wt = 0;
RDebugUtils.currentLine=23986233;
 //BA.debugLineNum = 23986233;BA.debugLine="Left = cLineWidth";
_left = __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=23986234;
 //BA.debugLineNum = 23986234;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit55 ;_col = _col + step55 ) {
RDebugUtils.currentLine=23986235;
 //BA.debugLineNum = 23986235;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=23986236;
 //BA.debugLineNum = 23986236;BA.debugLine="v = HeaderFirst.GetView(col)";
_v = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=23986238;
 //BA.debugLineNum = 23986238;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)	'???";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=23986239;
 //BA.debugLineNum = 23986239;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=23986240;
 //BA.debugLineNum = 23986240;BA.debugLine="wt = wt + w";
_wt = (int) (_wt+_w);
RDebugUtils.currentLine=23986241;
 //BA.debugLineNum = 23986241;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=23986242;
 //BA.debugLineNum = 23986242;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=23986243;
 //BA.debugLineNum = 23986243;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=23986246;
 //BA.debugLineNum = 23986246;BA.debugLine="mFirstColumnsWidth = Left";
__ref._mfirstcolumnswidth /*int*/  = _left;
RDebugUtils.currentLine=23986247;
 //BA.debugLineNum = 23986247;BA.debugLine="HeaderFirst.Width = Left";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=23986248;
 //BA.debugLineNum = 23986248;BA.debugLine="SVF.Width = HeaderFirst.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=23986249;
 //BA.debugLineNum = 23986249;BA.debugLine="SV2.Left = HeaderFirst.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=23986250;
 //BA.debugLineNum = 23986250;BA.debugLine="Private Left, col_x As Int";
_left = 0;
_col_x = 0;
RDebugUtils.currentLine=23986251;
 //BA.debugLineNum = 23986251;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=23986252;
 //BA.debugLineNum = 23986252;BA.debugLine="For col = mNumberOfFixedColumns To Widths.Length";
{
final int step72 = 1;
final int limit72 = (int) (_widths.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit72 ;_col = _col + step72 ) {
RDebugUtils.currentLine=23986253;
 //BA.debugLineNum = 23986253;BA.debugLine="Private v As View";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=23986254;
 //BA.debugLineNum = 23986254;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=23986255;
 //BA.debugLineNum = 23986255;BA.debugLine="v = Header.GetView(col_x)";
_v = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x);
RDebugUtils.currentLine=23986256;
 //BA.debugLineNum = 23986256;BA.debugLine="w = Max(2dip, Widths(col) - cLineWidth)";
_w = (int) (__c.Max(__c.DipToCurrent((int) (2)),_widths[_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=23986257;
 //BA.debugLineNum = 23986257;BA.debugLine="v.Width = w";
_v.setWidth(_w);
RDebugUtils.currentLine=23986258;
 //BA.debugLineNum = 23986258;BA.debugLine="v.Left = Left";
_v.setLeft(_left);
RDebugUtils.currentLine=23986259;
 //BA.debugLineNum = 23986259;BA.debugLine="If w > 2dip Then";
if (_w>__c.DipToCurrent((int) (2))) { 
RDebugUtils.currentLine=23986260;
 //BA.debugLineNum = 23986260;BA.debugLine="Left = Left + w + cLineWidth";
_left = (int) (_left+_w+__ref._clinewidth /*int*/ );
 };
 }
};
RDebugUtils.currentLine=23986263;
 //BA.debugLineNum = 23986263;BA.debugLine="Header.Width = Left";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_left);
RDebugUtils.currentLine=23986264;
 //BA.debugLineNum = 23986264;BA.debugLine="Header.Left = -SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=23986265;
 //BA.debugLineNum = 23986265;BA.debugLine="SV2.Panel.Width = Header.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
RDebugUtils.currentLine=23986266;
 //BA.debugLineNum = 23986266;BA.debugLine="Header.Left = mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._mfirstcolumnswidth /*int*/ );
RDebugUtils.currentLine=23986267;
 //BA.debugLineNum = 23986267;BA.debugLine="SV2.HorizontalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition((int) (0));
RDebugUtils.currentLine=23986268;
 //BA.debugLineNum = 23986268;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=23986269;
 //BA.debugLineNum = 23986269;BA.debugLine="For row = 0 To visibleRows.Size - 1";
{
final int step89 = 1;
final int limit89 = (int) (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit89 ;_row = _row + step89 ) {
RDebugUtils.currentLine=23986270;
 //BA.debugLineNum = 23986270;BA.debugLine="lbls = visibleRows.GetValueAt(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .GetValueAt(_row));
RDebugUtils.currentLine=23986271;
 //BA.debugLineNum = 23986271;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=23986272;
 //BA.debugLineNum = 23986272;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step92 = 1;
final int limit92 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit92 ;_col = _col + step92 ) {
RDebugUtils.currentLine=23986273;
 //BA.debugLineNum = 23986273;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Width";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),_widths[_col],(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=23986274;
 //BA.debugLineNum = 23986274;BA.debugLine="Left = HeaderFirst.GetView(col).Left + HeaderF";
_left = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getLeft()+__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getWidth()+__ref._clinewidth /*int*/ );
 }
};
RDebugUtils.currentLine=23986276;
 //BA.debugLineNum = 23986276;BA.debugLine="Left = 0";
_left = (int) (0);
RDebugUtils.currentLine=23986277;
 //BA.debugLineNum = 23986277;BA.debugLine="For col = mNumberOfFixedColumns To lbls.Length";
{
final int step97 = 1;
final int limit97 = (int) (_lbls.length-1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit97 ;_col = _col + step97 ) {
RDebugUtils.currentLine=23986278;
 //BA.debugLineNum = 23986278;BA.debugLine="col_x = col - mNumberOfFixedColumns";
_col_x = (int) (_col-__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=23986279;
 //BA.debugLineNum = 23986279;BA.debugLine="lbls(col).SetLayout(Left, lbls(col).Top, Heade";
_lbls[_col].SetLayout(_left,_lbls[_col].getTop(),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth(),(int) (__ref._crowheight /*int*/ -__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=23986280;
 //BA.debugLineNum = 23986280;BA.debugLine="Left = Left + Header.GetView(col_x).Width + cL";
_left = (int) (_left+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col_x).getWidth()+__ref._clinewidth /*int*/ );
 }
};
 }
};
RDebugUtils.currentLine=23986283;
 //BA.debugLineNum = 23986283;BA.debugLine="SV2.Width = Min(Header.Width, cWidth - HeaderFir";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__c.Min(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ -__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth())));
RDebugUtils.currentLine=23986284;
 //BA.debugLineNum = 23986284;BA.debugLine="pnlTable.Width = Min(HeaderFirst.Width + Header.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__c.Min(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._cwidth /*int*/ )));
RDebugUtils.currentLine=23986285;
 //BA.debugLineNum = 23986285;BA.debugLine="lblStatusLine.Width = HeaderFirst.Width + Header";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=23986286;
 //BA.debugLineNum = 23986286;BA.debugLine="internalPanel.Width = HeaderFirst.Width + Header";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth((int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=23986288;
 //BA.debugLineNum = 23986288;BA.debugLine="pnlFastScroll.Left = pnlTable.Width - pnlFastScro";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()-__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=23986289;
 //BA.debugLineNum = 23986289;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=23986290;
 //BA.debugLineNum = 23986290;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=23986293;
 //BA.debugLineNum = 23986293;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=23986294;
 //BA.debugLineNum = 23986294;BA.debugLine="End Sub";
return "";
}
public String  _addtoactivity(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_left,_top,_width,_height}));}
RDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub AddToActivity(Act As Activity, Left As";
RDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="pnlTable.Initialize(\"\")";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23592968;
 //BA.debugLineNum = 23592968;BA.debugLine="Act.AddView(pnlTable, cLeft, cTop , cWidth, cHeig";
_act.AddView((android.view.View)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._cleft /*int*/ ,__ref._ctop /*int*/ ,__ref._cwidth /*int*/ ,__ref._cheight /*int*/ );
RDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=23592971;
 //BA.debugLineNum = 23592971;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Private Sub InitTable";
RDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="lstRowColors.Initialize				'list of the different";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="lstRowColorIndexes.Initialize	'list of the color";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="lstRowDrawables.Initialize		'list of the drawable";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="pnlTable.Tag = \"Table\"";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag((Object)("Table"));
RDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="TableObject = Me";
__ref._tableobject /*b4a.example.ef.table*/  = (b4a.example.ef.table)(this);
RDebugUtils.currentLine=23658507;
 //BA.debugLineNum = 23658507;BA.debugLine="SV2.Initialize(0, 0, \"SV2\")";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .Initialize(ba,(int) (0),(int) (0),"SV2");
RDebugUtils.currentLine=23658508;
 //BA.debugLineNum = 23658508;BA.debugLine="SVF.Initialize2(0, \"SVF\")";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .Initialize2(ba,(int) (0),"SVF");
RDebugUtils.currentLine=23658509;
 //BA.debugLineNum = 23658509;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=23658510;
 //BA.debugLineNum = 23658510;BA.debugLine="jo = SVF";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()));
RDebugUtils.currentLine=23658511;
 //BA.debugLineNum = 23658511;BA.debugLine="jo.RunMethod(\"setVerticalScrollBarEnabled\", Array";
_jo.RunMethod("setVerticalScrollBarEnabled",new Object[]{(Object)(__c.False)});
RDebugUtils.currentLine=23658512;
 //BA.debugLineNum = 23658512;BA.debugLine="internalPanel.Initialize(\"IP\")";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"IP");
RDebugUtils.currentLine=23658513;
 //BA.debugLineNum = 23658513;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=23658515;
 //BA.debugLineNum = 23658515;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=23658516;
 //BA.debugLineNum = 23658516;BA.debugLine="SV2.FadingEdges(False)";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .FadingEdges(__c.False);
RDebugUtils.currentLine=23658517;
 //BA.debugLineNum = 23658517;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=23658518;
 //BA.debugLineNum = 23658518;BA.debugLine="IsVisible = True";
__ref._isvisible /*boolean*/  = __c.True;
RDebugUtils.currentLine=23658519;
 //BA.debugLineNum = 23658519;BA.debugLine="HeaderFirst.Initialize(\"\")";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23658520;
 //BA.debugLineNum = 23658520;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=23658521;
 //BA.debugLineNum = 23658521;BA.debugLine="HeaderBase.Initialize(\"\")";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23658522;
 //BA.debugLineNum = 23658522;BA.debugLine="HeaderBase.Color = Colors.Transparent";
__ref._headerbase /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23658523;
 //BA.debugLineNum = 23658523;BA.debugLine="Header.Initialize(\"\")";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23658524;
 //BA.debugLineNum = 23658524;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=23658526;
 //BA.debugLineNum = 23658526;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=23658527;
 //BA.debugLineNum = 23658527;BA.debugLine="mFirstColumnsWidth = 0";
__ref._mfirstcolumnswidth /*int*/  = (int) (0);
 }else {
RDebugUtils.currentLine=23658529;
 //BA.debugLineNum = 23658529;BA.debugLine="mFirstColumnsWidth = 100dip";
__ref._mfirstcolumnswidth /*int*/  = __c.DipToCurrent((int) (100));
 };
RDebugUtils.currentLine=23658531;
 //BA.debugLineNum = 23658531;BA.debugLine="pnlTable.AddView(Header, mFirstColumnsWidth, 0 ,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,(int) (0),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=23658532;
 //BA.debugLineNum = 23658532;BA.debugLine="pnlTable.AddView(HeaderFirst, 0, 0, mFirstColumns";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mfirstcolumnswidth /*int*/ ,__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=23658535;
 //BA.debugLineNum = 23658535;BA.debugLine="lblStatusLine.Initialize(\"\")";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23658536;
 //BA.debugLineNum = 23658536;BA.debugLine="lblStatusLine.Color = Colors.Transparent ' is it";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23658537;
 //BA.debugLineNum = 23658537;BA.debugLine="internalPanel.Color = Colors.Transparent 'TODO un";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23658538;
 //BA.debugLineNum = 23658538;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=23658539;
 //BA.debugLineNum = 23658539;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=23658540;
 //BA.debugLineNum = 23658540;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=23658541;
 //BA.debugLineNum = 23658541;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),__ref._cwidth /*int*/ ,__ref._cstatuslineheight /*int*/ );
 }else {
RDebugUtils.currentLine=23658543;
 //BA.debugLineNum = 23658543;BA.debugLine="pnlTable.AddView(SV2, mFirstColumnsWidth, Header";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getObject()),__ref._mfirstcolumnswidth /*int*/ ,__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),(int) (__ref._cwidth /*int*/ -__ref._mfirstcolumnswidth /*int*/ ),(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=23658544;
 //BA.debugLineNum = 23658544;BA.debugLine="pnlTable.AddView(SVF, 0, Header.Height, cWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getObject()),(int) (0),__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight(),__ref._cwidth /*int*/ ,(int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=23658545;
 //BA.debugLineNum = 23658545;BA.debugLine="pnlTable.AddView(lblStatusLine,0, SV2.Top + SV2.";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()),(int) (0),(int) (0));
 };
RDebugUtils.currentLine=23658547;
 //BA.debugLineNum = 23658547;BA.debugLine="SetPadding(lblStatusLine, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=23658548;
 //BA.debugLineNum = 23658548;BA.debugLine="pnlTable.AddView(internalPanel, 0, 0, cWidth, 0)";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._cwidth /*int*/ ,(int) (0));
RDebugUtils.currentLine=23658550;
 //BA.debugLineNum = 23658550;BA.debugLine="pnlFastScroll.Initialize(\"pnlFastScroll\")";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"pnlFastScroll");
RDebugUtils.currentLine=23658551;
 //BA.debugLineNum = 23658551;BA.debugLine="pnlFastScroll.Color = FScBackgroundColor";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._fscbackgroundcolor /*int*/ );
RDebugUtils.currentLine=23658552;
 //BA.debugLineNum = 23658552;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=23658553;
 //BA.debugLineNum = 23658553;BA.debugLine="pnlTable.AddView(pnlFastScroll,  cWidth - FScCurs";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop(),__ref._fsccursorwidth /*int*/ ,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=23658554;
 //BA.debugLineNum = 23658554;BA.debugLine="pnlFastScrollCursor.Initialize(\"\")";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23658555;
 //BA.debugLineNum = 23658555;BA.debugLine="pnlFastScrollCursor.Color = Colors.White";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=23658556;
 //BA.debugLineNum = 23658556;BA.debugLine="pnlFastScroll.AddView(pnlFastScrollCursor,  0, 0,";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=23658557;
 //BA.debugLineNum = 23658557;BA.debugLine="lblFastScroll.Initialize(\"\")";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23658558;
 //BA.debugLineNum = 23658558;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=23658559;
 //BA.debugLineNum = 23658559;BA.debugLine="cdw.Initialize2(Colors.White, 3dip, 1dip, Colors.";
_cdw.Initialize2(__c.Colors.White,__c.DipToCurrent((int) (3)),__c.DipToCurrent((int) (1)),__c.Colors.Black);
RDebugUtils.currentLine=23658560;
 //BA.debugLineNum = 23658560;BA.debugLine="lblFastScroll.Background = cdw";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_cdw.getObject()));
RDebugUtils.currentLine=23658561;
 //BA.debugLineNum = 23658561;BA.debugLine="lblFastScroll.TextColor = Colors.Black";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=23658562;
 //BA.debugLineNum = 23658562;BA.debugLine="lblFastScroll.Gravity = Bit.Or(Gravity.LEFT, Grav";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setGravity(__c.Bit.Or(__c.Gravity.LEFT,__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=23658563;
 //BA.debugLineNum = 23658563;BA.debugLine="lblFastScroll.Padding = Array As Int(5dip, 0, 0,";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setPadding(new int[]{__c.DipToCurrent((int) (5)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=23658564;
 //BA.debugLineNum = 23658564;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=23658565;
 //BA.debugLineNum = 23658565;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23658566;
 //BA.debugLineNum = 23658566;BA.debugLine="pnlTable.AddView(lblFastScroll,  cWidth - mFastS";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._fsccursorwidth /*int*/ ),__ref._fsclabeltopdelta /*int*/ ,__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 }else {
RDebugUtils.currentLine=23658568;
 //BA.debugLineNum = 23658568;BA.debugLine="pnlTable.AddView(lblFastScroll,  0, (SV2.Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),(int) (0),(int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._mfastscrolllabelheight /*int*/ )/(double)2),__ref._mfastscrolllabelwidth /*int*/ ,__ref._mfastscrolllabelheight /*int*/ );
 };
RDebugUtils.currentLine=23658570;
 //BA.debugLineNum = 23658570;BA.debugLine="FScTimer.Initialize(\"FastScrollTimer\", 1500)";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .Initialize(ba,"FastScrollTimer",(long) (1500));
RDebugUtils.currentLine=23658572;
 //BA.debugLineNum = 23658572;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=23658574;
 //BA.debugLineNum = 23658574;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=23658576;
 //BA.debugLineNum = 23658576;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23658577;
 //BA.debugLineNum = 23658577;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23658578;
 //BA.debugLineNum = 23658578;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23658579;
 //BA.debugLineNum = 23658579;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23658580;
 //BA.debugLineNum = 23658580;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=23658581;
 //BA.debugLineNum = 23658581;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step74 = 1;
final int limit74 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit74 ;_i = _i + step74 ) {
RDebugUtils.currentLine=23658582;
 //BA.debugLineNum = 23658582;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=23658583;
 //BA.debugLineNum = 23658583;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=23658584;
 //BA.debugLineNum = 23658584;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=23658585;
 //BA.debugLineNum = 23658585;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=23658586;
 //BA.debugLineNum = 23658586;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
 }
};
RDebugUtils.currentLine=23658588;
 //BA.debugLineNum = 23658588;BA.debugLine="SVF.Panel.Width = SVF.Width";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setWidth(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=23658589;
 //BA.debugLineNum = 23658589;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=23658590;
 //BA.debugLineNum = 23658590;BA.debugLine="SV2.Panel.Width = SV2.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setWidth(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth());
RDebugUtils.currentLine=23658591;
 //BA.debugLineNum = 23658591;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=23658593;
 //BA.debugLineNum = 23658593;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=23658595;
 //BA.debugLineNum = 23658595;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=23658597;
 //BA.debugLineNum = 23658597;BA.debugLine="pnlSortingView.Initialize(\"\")";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23658598;
 //BA.debugLineNum = 23658598;BA.debugLine="If mCustomSortingBitmaps = False Then";
if (__ref._mcustomsortingbitmaps /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=23658599;
 //BA.debugLineNum = 23658599;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
 };
RDebugUtils.currentLine=23658603;
 //BA.debugLineNum = 23658603;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=23658604;
 //BA.debugLineNum = 23658604;BA.debugLine="cvs.Initialize2(bmp)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize2((android.graphics.Bitmap)(__ref._bmp /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=23658612;
 //BA.debugLineNum = 23658612;BA.debugLine="End Sub";
return "";
}
public String  _addtoview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _width,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "addtoview", false))
	 {return ((String) Debug.delegate(ba, "addtoview", new Object[] {_v,_left,_top,_width,_height}));}
RDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub AddToView(v As View, Left As Int, Top A";
RDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="AddToActivity(v,Left,Top,Width,Height)";
__ref._addtoactivity /*String*/ (null,(anywheresoftware.b4a.objects.ActivityWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ActivityWrapper(), (anywheresoftware.b4a.BALayout)(_v.getObject())),_left,_top,_width,_height);
RDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Private Sub CalcFastScroll(Pos As Int)";
RDebugUtils.currentLine=28573697;
 //BA.debugLineNum = 28573697;BA.debugLine="Private i, Top As Int";
_i = 0;
_top = 0;
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="Top = Pos * FScScale";
_top = (int) (_pos*__ref._fscscale /*double*/ );
RDebugUtils.currentLine=28573699;
 //BA.debugLineNum = 28573699;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=28573700;
 //BA.debugLineNum = 28573700;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=28573701;
 //BA.debugLineNum = 28573701;BA.debugLine="lblFastScroll.Top = Top + FscLabelTopDelta";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (_top+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=28573703;
 //BA.debugLineNum = 28573703;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=28573704;
 //BA.debugLineNum = 28573704;BA.debugLine="i = (Pos + SV2.Height / 2) / cRowHeight";
_i = (int) ((_pos+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)2)/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=28573705;
 //BA.debugLineNum = 28573705;BA.debugLine="Private str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=28573706;
 //BA.debugLineNum = 28573706;BA.debugLine="str = Data.Get(i)";
_str = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=28573707;
 //BA.debugLineNum = 28573707;BA.debugLine="lblFastScroll.Text = str(mFastScrollColumnIndex)";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_str[__ref._mfastscrollcolumnindex /*int*/ ].substring((int) (0),(int) (__c.Min(_str[__ref._mfastscrollcolumnindex /*int*/ ].length(),__ref._mfastscrolllabelmaxchars /*int*/ )))));
 };
RDebugUtils.currentLine=28573710;
 //BA.debugLineNum = 28573710;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_click", false))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=25034755;
 //BA.debugLineNum = 25034755;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=25034756;
 //BA.debugLineNum = 25034756;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=25034759;
 //BA.debugLineNum = 25034759;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=25034760;
 //BA.debugLineNum = 25034760;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellClick\"";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick")) { 
RDebugUtils.currentLine=25034761;
 //BA.debugLineNum = 25034761;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellClick\", r";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=25034763;
 //BA.debugLineNum = 25034763;BA.debugLine="End Sub";
return "";
}
public String  _selectrow(b4a.example.ef.table __ref,b4a.example.ef.table._rowcol _rc) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "selectrow", false))
	 {return ((String) Debug.delegate(ba, "selectrow", new Object[] {_rc}));}
int _previndex = 0;
int _prev = 0;
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub SelectRow(rc As RowCol)";
RDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="Dim prev As Int ' if we select an alreday selecte";
_prev = 0;
RDebugUtils.currentLine=25231366;
 //BA.debugLineNum = 25231366;BA.debugLine="prevIndex = SelectedRows.indexof(rc.Row)	 ' -1 if";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=25231367;
 //BA.debugLineNum = 25231367;BA.debugLine="If (prevIndex <> -1 And mMultiSelect = False) The";
if ((_previndex!=-1 && __ref._mmultiselect /*boolean*/ ==__c.False)) { 
RDebugUtils.currentLine=25231369;
 //BA.debugLineNum = 25231369;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=25231370;
 //BA.debugLineNum = 25231370;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=25231371;
 //BA.debugLineNum = 25231371;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=25231372;
 //BA.debugLineNum = 25231372;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=25231374;
 //BA.debugLineNum = 25231374;BA.debugLine="If mZeroSelection = False Then";
if (__ref._mzeroselection /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=25231375;
 //BA.debugLineNum = 25231375;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=25231379;
 //BA.debugLineNum = 25231379;BA.debugLine="If (prevIndex = -1) Then";
if ((_previndex==-1)) { 
RDebugUtils.currentLine=25231380;
 //BA.debugLineNum = 25231380;BA.debugLine="If (mMultiSelect) Then";
if ((__ref._mmultiselect /*boolean*/ )) { 
RDebugUtils.currentLine=25231381;
 //BA.debugLineNum = 25231381;BA.debugLine="SelectedRows.Add(rc.Row) 'Select the new row";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
RDebugUtils.currentLine=25231382;
 //BA.debugLineNum = 25231382;BA.debugLine="prev = -1";
_prev = (int) (-1);
 }else {
RDebugUtils.currentLine=25231386;
 //BA.debugLineNum = 25231386;BA.debugLine="If (SelectedRows.Size <> 0) Then";
if ((__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()!=0)) { 
RDebugUtils.currentLine=25231387;
 //BA.debugLineNum = 25231387;BA.debugLine="prev = SelectedRows.Get(0) ' there should be o";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=25231388;
 //BA.debugLineNum = 25231388;BA.debugLine="SelectedRows.set(0, rc.Row) ' change it to the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set((int) (0),(Object)(_rc.Row /*int*/ ));
 }else {
RDebugUtils.currentLine=25231390;
 //BA.debugLineNum = 25231390;BA.debugLine="prev = -1";
_prev = (int) (-1);
RDebugUtils.currentLine=25231391;
 //BA.debugLineNum = 25231391;BA.debugLine="SelectedRows.Add(rc.Row)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rc.Row /*int*/ ));
 };
 };
 }else {
RDebugUtils.currentLine=25231396;
 //BA.debugLineNum = 25231396;BA.debugLine="prev = SelectedRows.Get(prevIndex) ' should be R";
_prev = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_previndex)));
RDebugUtils.currentLine=25231397;
 //BA.debugLineNum = 25231397;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' deselect the";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=25231400;
 //BA.debugLineNum = 25231400;BA.debugLine="If prev > -1 Then";
if (_prev>-1) { 
RDebugUtils.currentLine=25231401;
 //BA.debugLineNum = 25231401;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=25231402;
 //BA.debugLineNum = 25231402;BA.debugLine="HideRow(prev)";
__ref._hiderow /*String*/ (null,_prev);
RDebugUtils.currentLine=25231403;
 //BA.debugLineNum = 25231403;BA.debugLine="ShowRow(prev)";
__ref._showrow /*void*/ (null,_prev);
 };
 };
RDebugUtils.currentLine=25231407;
 //BA.debugLineNum = 25231407;BA.debugLine="SelectedCol = rc.col";
__ref._selectedcol /*int*/  = _rc.Col /*int*/ ;
RDebugUtils.currentLine=25231408;
 //BA.debugLineNum = 25231408;BA.debugLine="If visibleRows.ContainsKey(rc.Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rc.Row /*int*/ ))) { 
RDebugUtils.currentLine=25231409;
 //BA.debugLineNum = 25231409;BA.debugLine="HideRow(rc.Row)";
__ref._hiderow /*String*/ (null,_rc.Row /*int*/ );
RDebugUtils.currentLine=25231410;
 //BA.debugLineNum = 25231410;BA.debugLine="ShowRow(rc.Row)";
__ref._showrow /*void*/ (null,_rc.Row /*int*/ );
 };
RDebugUtils.currentLine=25231412;
 //BA.debugLineNum = 25231412;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "cell_longclick", false))
	 {return ((String) Debug.delegate(ba, "cell_longclick", null));}
b4a.example.ef.table._rowcol _rc = null;
anywheresoftware.b4a.objects.LabelWrapper _l = null;
RDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="rc = L.Tag";
_rc = (b4a.example.ef.table._rowcol)(_l.getTag());
RDebugUtils.currentLine=24903687;
 //BA.debugLineNum = 24903687;BA.debugLine="If SubExists(cCallBack, cEventName & \"_CellLongCl";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick")) { 
RDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="CallSub3(cCallBack, cEventName & \"_CellLongClick";
__c.CallSubNew3(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_CellLongClick",(Object)(_rc.Col /*int*/ ),(Object)(_rc.Row /*int*/ ));
 };
RDebugUtils.currentLine=24903690;
 //BA.debugLineNum = 24903690;BA.debugLine="End Sub";
return "";
}
public boolean  _check1ddoubleallsame(b4a.example.ef.table __ref,double[] _arrdouble,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1ddoubleallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1ddoubleallsame", new Object[] {_arrdouble,_istart,_iend}));}
int _i = 0;
double _dval = 0;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Sub Check1DDoubleAllSame(arrDouble() As Double, iS";
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="Dim dVal As Double";
_dval = 0;
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="If arrDouble.Length = 1 Then";
if (_arrdouble.length==1) { 
RDebugUtils.currentLine=35848198;
 //BA.debugLineNum = 35848198;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=35848201;
 //BA.debugLineNum = 35848201;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=35848202;
 //BA.debugLineNum = 35848202;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=35848205;
 //BA.debugLineNum = 35848205;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=35848206;
 //BA.debugLineNum = 35848206;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=35848209;
 //BA.debugLineNum = 35848209;BA.debugLine="dVal = arrDouble(0)";
_dval = _arrdouble[(int) (0)];
RDebugUtils.currentLine=35848211;
 //BA.debugLineNum = 35848211;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=35848212;
 //BA.debugLineNum = 35848212;BA.debugLine="If arrDouble(i) <> dVal Then";
if (_arrdouble[_i]!=_dval) { 
RDebugUtils.currentLine=35848213;
 //BA.debugLineNum = 35848213;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=35848217;
 //BA.debugLineNum = 35848217;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=35848219;
 //BA.debugLineNum = 35848219;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dlongallsame(b4a.example.ef.table __ref,long[] _arrlong,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dlongallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dlongallsame", new Object[] {_arrlong,_istart,_iend}));}
int _i = 0;
long _lval = 0L;
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Sub Check1DLongAllSame(arrLong() As Long, iStart A";
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="Dim lVal As Long";
_lval = 0L;
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="If arrLong.Length = 1 Then";
if (_arrlong.length==1) { 
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=35717129;
 //BA.debugLineNum = 35717129;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=35717133;
 //BA.debugLineNum = 35717133;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=35717134;
 //BA.debugLineNum = 35717134;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=35717137;
 //BA.debugLineNum = 35717137;BA.debugLine="lVal = arrLong(0)";
_lval = _arrlong[(int) (0)];
RDebugUtils.currentLine=35717139;
 //BA.debugLineNum = 35717139;BA.debugLine="For i = iStart To iEnd";
{
final int step13 = 1;
final int limit13 = _iend;
_i = _istart ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=35717140;
 //BA.debugLineNum = 35717140;BA.debugLine="If arrLong(i) <> lVal Then";
if (_arrlong[_i]!=_lval) { 
RDebugUtils.currentLine=35717141;
 //BA.debugLineNum = 35717141;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
RDebugUtils.currentLine=35717145;
 //BA.debugLineNum = 35717145;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=35717147;
 //BA.debugLineNum = 35717147;BA.debugLine="End Sub";
return false;
}
public boolean  _check1dstringallsame(b4a.example.ef.table __ref,String[] _arrstring,boolean _bcaseinsensitive,int _istart,int _iend) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "check1dstringallsame", false))
	 {return ((Boolean) Debug.delegate(ba, "check1dstringallsame", new Object[] {_arrstring,_bcaseinsensitive,_istart,_iend}));}
int _i = 0;
String _str = "";
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Sub Check1DStringAllSame(arrstring() As String, bC";
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="If arrstring.Length = 1 Then";
if (_arrstring.length==1) { 
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=36110345;
 //BA.debugLineNum = 36110345;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=36110346;
 //BA.debugLineNum = 36110346;BA.debugLine="iStart = 1";
_istart = (int) (1);
 };
RDebugUtils.currentLine=36110349;
 //BA.debugLineNum = 36110349;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=36110350;
 //BA.debugLineNum = 36110350;BA.debugLine="iEnd = arrstring.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=36110353;
 //BA.debugLineNum = 36110353;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=36110354;
 //BA.debugLineNum = 36110354;BA.debugLine="str = arrstring(0).ToLowerCase";
_str = _arrstring[(int) (0)].toLowerCase();
RDebugUtils.currentLine=36110355;
 //BA.debugLineNum = 36110355;BA.debugLine="For i = iStart To iEnd";
{
final int step14 = 1;
final int limit14 = _iend;
_i = _istart ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=36110356;
 //BA.debugLineNum = 36110356;BA.debugLine="If arrstring(i).ToLowerCase.CompareTo(str) <> 0";
if (_arrstring[_i].toLowerCase().compareTo(_str)!=0) { 
RDebugUtils.currentLine=36110357;
 //BA.debugLineNum = 36110357;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 }else {
RDebugUtils.currentLine=36110361;
 //BA.debugLineNum = 36110361;BA.debugLine="str = arrstring(0)";
_str = _arrstring[(int) (0)];
RDebugUtils.currentLine=36110362;
 //BA.debugLineNum = 36110362;BA.debugLine="For i = iStart To iEnd";
{
final int step21 = 1;
final int limit21 = _iend;
_i = _istart ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=36110363;
 //BA.debugLineNum = 36110363;BA.debugLine="If arrstring(i).CompareTo(str) <> 0 Then";
if (_arrstring[_i].compareTo(_str)!=0) { 
RDebugUtils.currentLine=36110364;
 //BA.debugLineNum = 36110364;BA.debugLine="Return False";
if (true) return __c.False;
 };
 }
};
 };
RDebugUtils.currentLine=36110369;
 //BA.debugLineNum = 36110369;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=36110371;
 //BA.debugLineNum = 36110371;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31260672;
 //BA.debugLineNum = 31260672;BA.debugLine="Private Sub CheckColumnDataTypes(MyCurs As Cursor)";
RDebugUtils.currentLine=31260673;
 //BA.debugLineNum = 31260673;BA.debugLine="Private NbCols, NbRows As Int";
_nbcols = 0;
_nbrows = 0;
RDebugUtils.currentLine=31260674;
 //BA.debugLineNum = 31260674;BA.debugLine="NbCols = MyCurs.ColumnCount";
_nbcols = _mycurs.getColumnCount();
RDebugUtils.currentLine=31260675;
 //BA.debugLineNum = 31260675;BA.debugLine="NbRows = MyCurs.RowCount";
_nbrows = _mycurs.getRowCount();
RDebugUtils.currentLine=31260677;
 //BA.debugLineNum = 31260677;BA.debugLine="Private ColumnTypes(NbCols), str As String";
_columntypes = new String[_nbcols];
java.util.Arrays.fill(_columntypes,"");
_str = "";
RDebugUtils.currentLine=31260678;
 //BA.debugLineNum = 31260678;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=31260680;
 //BA.debugLineNum = 31260680;BA.debugLine="For col = 0 To NbCols - 1";
{
final int step6 = 1;
final int limit6 = (int) (_nbcols-1);
_col = (int) (0) ;
for (;_col <= limit6 ;_col = _col + step6 ) {
RDebugUtils.currentLine=31260681;
 //BA.debugLineNum = 31260681;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=31260682;
 //BA.debugLineNum = 31260682;BA.debugLine="For row = 0 To NbRows - 1";
{
final int step8 = 1;
final int limit8 = (int) (_nbrows-1);
_row = (int) (0) ;
for (;_row <= limit8 ;_row = _row + step8 ) {
RDebugUtils.currentLine=31260683;
 //BA.debugLineNum = 31260683;BA.debugLine="MyCurs.Position = row";
_mycurs.setPosition(_row);
RDebugUtils.currentLine=31260684;
 //BA.debugLineNum = 31260684;BA.debugLine="str = MyCurs.GetString2(col)";
_str = _mycurs.GetString2(_col);
RDebugUtils.currentLine=31260685;
 //BA.debugLineNum = 31260685;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=31260686;
 //BA.debugLineNum = 31260686;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=31260688;
 //BA.debugLineNum = 31260688;BA.debugLine="If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=31260689;
 //BA.debugLineNum = 31260689;BA.debugLine="If str.Contains(\".\") Then";
if (_str.contains(".")) { 
RDebugUtils.currentLine=31260690;
 //BA.debugLineNum = 31260690;BA.debugLine="ColumnTypes(col) = \"R\"";
_columntypes[_col] = "R";
 }else {
RDebugUtils.currentLine=31260692;
 //BA.debugLineNum = 31260692;BA.debugLine="ColumnTypes(col) = \"I\"";
_columntypes[_col] = "I";
 };
 }else {
RDebugUtils.currentLine=31260695;
 //BA.debugLineNum = 31260695;BA.debugLine="ColumnTypes(col) = \"T\"";
_columntypes[_col] = "T";
RDebugUtils.currentLine=31260696;
 //BA.debugLineNum = 31260696;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
RDebugUtils.currentLine=31260701;
 //BA.debugLineNum = 31260701;BA.debugLine="Return ColumnTypes";
if (true) return _columntypes;
RDebugUtils.currentLine=31260702;
 //BA.debugLineNum = 31260702;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
RDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Private StringUtils1 As StringUtils";
_stringutils1 = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Private SV2 As ScrollView2D";
_sv2 = new flm.b4a.scrollview2d.ScrollView2DWrapper();
RDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="Private SVF As ScrollView";
_svf = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="Private pnlTable As Panel";
_pnltable = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Private Header, HeaderBase As Panel";
_header = new anywheresoftware.b4a.objects.PanelWrapper();
_headerbase = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="Private HeaderFirst As Panel";
_headerfirst = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="Private lblStatusLine As Label";
_lblstatusline = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="Private pnlFastScroll As Panel";
_pnlfastscroll = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330827;
 //BA.debugLineNum = 23330827;BA.debugLine="Private pnlFastScrollCursor As Panel";
_pnlfastscrollcursor = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="Private FScCursorWidth = 25dip As Int";
_fsccursorwidth = __c.DipToCurrent((int) (25));
RDebugUtils.currentLine=23330829;
 //BA.debugLineNum = 23330829;BA.debugLine="Private FScCursorHeight = 60dip As Int";
_fsccursorheight = __c.DipToCurrent((int) (60));
RDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="Private FscLabelTopDelta As Int";
_fsclabeltopdelta = 0;
RDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="Private FScBackgroundColor = Colors.ARGB(48, 128,";
_fscbackgroundcolor = __c.Colors.ARGB((int) (48),(int) (128),(int) (128),(int) (128));
RDebugUtils.currentLine=23330832;
 //BA.debugLineNum = 23330832;BA.debugLine="Private FScCursorCol1 = Colors.Blue As Int";
_fsccursorcol1 = __c.Colors.Blue;
RDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="Private FScCursorCol2 = Colors.Yellow As Int";
_fsccursorcol2 = __c.Colors.Yellow;
RDebugUtils.currentLine=23330834;
 //BA.debugLineNum = 23330834;BA.debugLine="Private lblFastScroll As Label";
_lblfastscroll = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=23330835;
 //BA.debugLineNum = 23330835;BA.debugLine="Private FSY0, FSdY, FastScrollHeight As Int";
_fsy0 = 0;
_fsdy = 0;
_fastscrollheight = 0;
RDebugUtils.currentLine=23330836;
 //BA.debugLineNum = 23330836;BA.debugLine="Private FScScale As Double";
_fscscale = 0;
RDebugUtils.currentLine=23330837;
 //BA.debugLineNum = 23330837;BA.debugLine="Private FScTimer As Timer";
_fsctimer = new anywheresoftware.b4a.objects.Timer();
RDebugUtils.currentLine=23330838;
 //BA.debugLineNum = 23330838;BA.debugLine="Private mFastScroll = False As Boolean";
_mfastscroll = __c.False;
RDebugUtils.currentLine=23330839;
 //BA.debugLineNum = 23330839;BA.debugLine="Private FastScrollActive As Boolean";
_fastscrollactive = false;
RDebugUtils.currentLine=23330840;
 //BA.debugLineNum = 23330840;BA.debugLine="Private mFastScrollColumnIndex = 0 As Int";
_mfastscrollcolumnindex = (int) (0);
RDebugUtils.currentLine=23330841;
 //BA.debugLineNum = 23330841;BA.debugLine="Private mFastScrollMinItems = 50 As Int";
_mfastscrollminitems = (int) (50);
RDebugUtils.currentLine=23330842;
 //BA.debugLineNum = 23330842;BA.debugLine="Private mFastScrollShowLabel = True As Boolean";
_mfastscrollshowlabel = __c.True;
RDebugUtils.currentLine=23330843;
 //BA.debugLineNum = 23330843;BA.debugLine="Private mFastScrollFixedLabel = False As Boolean";
_mfastscrollfixedlabel = __c.False;
RDebugUtils.currentLine=23330844;
 //BA.debugLineNum = 23330844;BA.debugLine="Private mFastScrollLabelMaxChars = 10 As Int";
_mfastscrolllabelmaxchars = (int) (10);
RDebugUtils.currentLine=23330845;
 //BA.debugLineNum = 23330845;BA.debugLine="Private mFastScrollLabelWidth = 150dip As Int";
_mfastscrolllabelwidth = __c.DipToCurrent((int) (150));
RDebugUtils.currentLine=23330846;
 //BA.debugLineNum = 23330846;BA.debugLine="Private mFastScrollLabelHeight = 30dip As Int";
_mfastscrolllabelheight = __c.DipToCurrent((int) (30));
RDebugUtils.currentLine=23330848;
 //BA.debugLineNum = 23330848;BA.debugLine="Private cCallBack As Object";
_ccallback = new Object();
RDebugUtils.currentLine=23330849;
 //BA.debugLineNum = 23330849;BA.debugLine="Private cEventName As String";
_ceventname = "";
RDebugUtils.currentLine=23330850;
 //BA.debugLineNum = 23330850;BA.debugLine="Private cLeft, cTop , cWidth, cHeight As Int";
_cleft = 0;
_ctop = 0;
_cwidth = 0;
_cheight = 0;
RDebugUtils.currentLine=23330851;
 //BA.debugLineNum = 23330851;BA.debugLine="Public HeaderNames As List";
_headernames = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330852;
 //BA.debugLineNum = 23330852;BA.debugLine="Public SelectedRows As List ' selected rows ' con";
_selectedrows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330853;
 //BA.debugLineNum = 23330853;BA.debugLine="Private SelectedCol As Int";
_selectedcol = 0;
RDebugUtils.currentLine=23330854;
 //BA.debugLineNum = 23330854;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330855;
 //BA.debugLineNum = 23330855;BA.debugLine="Private LabelsCache As List";
_labelscache = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330856;
 //BA.debugLineNum = 23330856;BA.debugLine="Private minVisibleRow, maxVisibleRow As Int";
_minvisiblerow = 0;
_maxvisiblerow = 0;
RDebugUtils.currentLine=23330857;
 //BA.debugLineNum = 23330857;BA.debugLine="Private IsVisible As Boolean";
_isvisible = false;
RDebugUtils.currentLine=23330858;
 //BA.debugLineNum = 23330858;BA.debugLine="Public visibleRows As Map";
_visiblerows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23330859;
 //BA.debugLineNum = 23330859;BA.debugLine="Private mNumberOfColumns, ColumnWidths(), cColumn";
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
RDebugUtils.currentLine=23330860;
 //BA.debugLineNum = 23330860;BA.debugLine="Private cColumnDataType() As String";
_ccolumndatatype = new String[(int) (0)];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=23330861;
 //BA.debugLineNum = 23330861;BA.debugLine="Private cRowHeight, cHeaderColor, cTableColor, cT";
_crowheight = 0;
_cheadercolor = 0;
_ctablecolor = 0;
_ctextcolor = 0;
_cheaderheight = 0;
_cheadertextcolor = 0;
_cstatuslineheight = 0;
RDebugUtils.currentLine=23330862;
 //BA.debugLineNum = 23330862;BA.debugLine="Private cAutomaticWidths = False As Boolean";
_cautomaticwidths = __c.False;
RDebugUtils.currentLine=23330863;
 //BA.debugLineNum = 23330863;BA.debugLine="Private cTextSize As Float";
_ctextsize = 0f;
RDebugUtils.currentLine=23330864;
 //BA.debugLineNum = 23330864;BA.debugLine="Type RowCol (Row As Int, Col As Int)";
;
RDebugUtils.currentLine=23330865;
 //BA.debugLineNum = 23330865;BA.debugLine="Private cAlignment As Int";
_calignment = 0;
RDebugUtils.currentLine=23330866;
 //BA.debugLineNum = 23330866;BA.debugLine="Private cAlignments() As Int";
_calignments = new int[(int) (0)];
;
RDebugUtils.currentLine=23330867;
 //BA.debugLineNum = 23330867;BA.debugLine="Private cAlignments0() As Int";
_calignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=23330868;
 //BA.debugLineNum = 23330868;BA.debugLine="Private MultiAlignments = False As Boolean";
_multialignments = __c.False;
RDebugUtils.currentLine=23330869;
 //BA.debugLineNum = 23330869;BA.debugLine="Private MultiTypeFace = False As Boolean";
_multitypeface = __c.False;
RDebugUtils.currentLine=23330870;
 //BA.debugLineNum = 23330870;BA.debugLine="Private MultiTextColors = False As Boolean";
_multitextcolors = __c.False;
RDebugUtils.currentLine=23330871;
 //BA.debugLineNum = 23330871;BA.debugLine="Private cHeaderAlignment = Gravity.CENTER As Int";
_cheaderalignment = __c.Gravity.CENTER;
RDebugUtils.currentLine=23330872;
 //BA.debugLineNum = 23330872;BA.debugLine="Private cHeaderAlignments() As Int";
_cheaderalignments = new int[(int) (0)];
;
RDebugUtils.currentLine=23330873;
 //BA.debugLineNum = 23330873;BA.debugLine="Private cHeaderAlignments0() As Int";
_cheaderalignments0 = new int[(int) (0)];
;
RDebugUtils.currentLine=23330874;
 //BA.debugLineNum = 23330874;BA.debugLine="Private HeaderMultiAlignments = False As Boolean";
_headermultialignments = __c.False;
RDebugUtils.currentLine=23330875;
 //BA.debugLineNum = 23330875;BA.debugLine="Private cTypeFace = Typeface.DEFAULT As Typeface";
_ctypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_ctypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=23330876;
 //BA.debugLineNum = 23330876;BA.debugLine="Private cTypeFaces() As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=23330877;
 //BA.debugLineNum = 23330877;BA.debugLine="Private cTypeFaces0() As Typeface";
_ctypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _ctypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=23330878;
 //BA.debugLineNum = 23330878;BA.debugLine="Private HeaderMultiTypeFace = False As Boolean";
_headermultitypeface = __c.False;
RDebugUtils.currentLine=23330879;
 //BA.debugLineNum = 23330879;BA.debugLine="Private cHeaderTypeFace = Typeface.DEFAULT As Typ";
_cheadertypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
_cheadertypeface = (anywheresoftware.b4a.keywords.constants.TypefaceWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.constants.TypefaceWrapper(), (android.graphics.Typeface)(__c.Typeface.DEFAULT));
RDebugUtils.currentLine=23330880;
 //BA.debugLineNum = 23330880;BA.debugLine="Private cHeaderTypeFaces() As Typeface";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=23330881;
 //BA.debugLineNum = 23330881;BA.debugLine="Private cHeaderTypeFaces0() As Typeface";
_cheadertypefaces0 = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[(int) (0)];
{
int d0 = _cheadertypefaces0.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces0[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=23330882;
 //BA.debugLineNum = 23330882;BA.debugLine="Private cLineWidth = Max(1, 1dip) As Int";
_clinewidth = (int) (__c.Max(1,__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23330883;
 //BA.debugLineNum = 23330883;BA.debugLine="Private ExtraWidth = 12dip + cLineWidth	As Int";
_extrawidth = (int) (__c.DipToCurrent((int) (12))+__ref._clinewidth /*int*/ );
RDebugUtils.currentLine=23330884;
 //BA.debugLineNum = 23330884;BA.debugLine="Private SelectedDrawable(), Drawable1(), Drawable";
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
RDebugUtils.currentLine=23330885;
 //BA.debugLineNum = 23330885;BA.debugLine="Private SelectedCellDrawable As Object";
_selectedcelldrawable = new Object();
RDebugUtils.currentLine=23330886;
 //BA.debugLineNum = 23330886;BA.debugLine="Private cRowColor1, cRowColor2, cSelectedRowColor";
_crowcolor1 = 0;
_crowcolor2 = 0;
_cselectedrowcolor = 0;
_cselectedcellcolor = 0;
_cselectedrowtextcolor = 0;
_cselectedcelltextcolor = 0;
RDebugUtils.currentLine=23330887;
 //BA.debugLineNum = 23330887;BA.debugLine="Private cSortColumn = True As Boolean";
_csortcolumn = __c.True;
RDebugUtils.currentLine=23330888;
 //BA.debugLineNum = 23330888;BA.debugLine="Private cUseColumnColors = False As Boolean";
_cusecolumncolors = __c.False;
RDebugUtils.currentLine=23330889;
 //BA.debugLineNum = 23330889;BA.debugLine="Private cSortRemoveAccents = False As Boolean";
_csortremoveaccents = __c.False;
RDebugUtils.currentLine=23330890;
 //BA.debugLineNum = 23330890;BA.debugLine="Private mFirstColumnsWidth = 0 As Int";
_mfirstcolumnswidth = (int) (0);
RDebugUtils.currentLine=23330891;
 //BA.debugLineNum = 23330891;BA.debugLine="Private mFirstColumnFixed = False As Boolean";
_mfirstcolumnfixed = __c.False;
RDebugUtils.currentLine=23330892;
 //BA.debugLineNum = 23330892;BA.debugLine="Private mNumberOfFixedColumns As Int";
_mnumberoffixedcolumns = 0;
RDebugUtils.currentLine=23330893;
 //BA.debugLineNum = 23330893;BA.debugLine="Private bmp As Bitmap		' used for the canvas belo";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=23330894;
 //BA.debugLineNum = 23330894;BA.debugLine="Private cvs As Canvas		' used to measure string w";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=23330895;
 //BA.debugLineNum = 23330895;BA.debugLine="Private lstRowColorIndexes As List";
_lstrowcolorindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330896;
 //BA.debugLineNum = 23330896;BA.debugLine="Private lstRowColors As List";
_lstrowcolors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330897;
 //BA.debugLineNum = 23330897;BA.debugLine="Private lstRowDrawables As List";
_lstrowdrawables = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330899;
 //BA.debugLineNum = 23330899;BA.debugLine="cHeaderColor = Colors.Gray";
__ref._cheadercolor /*int*/  = __c.Colors.Gray;
RDebugUtils.currentLine=23330900;
 //BA.debugLineNum = 23330900;BA.debugLine="cTableColor = Colors.LightGray";
__ref._ctablecolor /*int*/  = __c.Colors.LightGray;
RDebugUtils.currentLine=23330901;
 //BA.debugLineNum = 23330901;BA.debugLine="cTextColor = Colors.Black";
__ref._ctextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=23330902;
 //BA.debugLineNum = 23330902;BA.debugLine="cHeaderTextColor = Colors.White";
__ref._cheadertextcolor /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=23330903;
 //BA.debugLineNum = 23330903;BA.debugLine="cTextSize = 14";
__ref._ctextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=23330904;
 //BA.debugLineNum = 23330904;BA.debugLine="cAlignment = Gravity.CENTER 'change to Gravity.LE";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
RDebugUtils.currentLine=23330905;
 //BA.debugLineNum = 23330905;BA.debugLine="cRowColor1 = Colors.White";
__ref._crowcolor1 /*int*/  = __c.Colors.White;
RDebugUtils.currentLine=23330906;
 //BA.debugLineNum = 23330906;BA.debugLine="cRowColor2 = 0xFF98F5FF";
__ref._crowcolor2 /*int*/  = ((int)0xff98f5ff);
RDebugUtils.currentLine=23330907;
 //BA.debugLineNum = 23330907;BA.debugLine="cSelectedRowColor = 0xFF007FFF";
__ref._cselectedrowcolor /*int*/  = ((int)0xff007fff);
RDebugUtils.currentLine=23330908;
 //BA.debugLineNum = 23330908;BA.debugLine="cSelectedRowTextColor = Colors.Black";
__ref._cselectedrowtextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=23330909;
 //BA.debugLineNum = 23330909;BA.debugLine="cSelectedCellColor = 0xFFFC8EAC";
__ref._cselectedcellcolor /*int*/  = ((int)0xfffc8eac);
RDebugUtils.currentLine=23330910;
 //BA.debugLineNum = 23330910;BA.debugLine="cSelectedCellTextColor = Colors.Black";
__ref._cselectedcelltextcolor /*int*/  = __c.Colors.Black;
RDebugUtils.currentLine=23330911;
 //BA.debugLineNum = 23330911;BA.debugLine="cRowHeight = 40dip";
__ref._crowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=23330912;
 //BA.debugLineNum = 23330912;BA.debugLine="cHeaderHeight = cRowHeight";
__ref._cheaderheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=23330913;
 //BA.debugLineNum = 23330913;BA.debugLine="cStatusLineHeight = cRowHeight";
__ref._cstatuslineheight /*int*/  = __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=23330915;
 //BA.debugLineNum = 23330915;BA.debugLine="Private cSingleLine = True As Boolean		' does a l";
_csingleline = __c.True;
RDebugUtils.currentLine=23330917;
 //BA.debugLineNum = 23330917;BA.debugLine="Private mMultiSelect As Boolean = False";
_mmultiselect = __c.False;
RDebugUtils.currentLine=23330918;
 //BA.debugLineNum = 23330918;BA.debugLine="Private cAllowSelection = True As Boolean";
_callowselection = __c.True;
RDebugUtils.currentLine=23330919;
 //BA.debugLineNum = 23330919;BA.debugLine="Private SavedWidths() As Int' to keep the user se";
_savedwidths = new int[(int) (0)];
;
RDebugUtils.currentLine=23330920;
 //BA.debugLineNum = 23330920;BA.debugLine="Private cShowStatusLine As Boolean =True";
_cshowstatusline = __c.True;
RDebugUtils.currentLine=23330922;
 //BA.debugLineNum = 23330922;BA.debugLine="Private internalPanel As Panel";
_internalpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330924;
 //BA.debugLineNum = 23330924;BA.debugLine="Public sortingDir As Int = 0 ' -1,0,1 as acc, uns";
_sortingdir = (int) (0);
RDebugUtils.currentLine=23330925;
 //BA.debugLineNum = 23330925;BA.debugLine="Public sortedCol As Int = -1' hold the sorted col";
_sortedcol = (int) (-1);
RDebugUtils.currentLine=23330926;
 //BA.debugLineNum = 23330926;BA.debugLine="Private pnlSortingView As Panel";
_pnlsortingview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330928;
 //BA.debugLineNum = 23330928;BA.debugLine="Private debug_counter As Long";
_debug_counter = 0L;
RDebugUtils.currentLine=23330929;
 //BA.debugLineNum = 23330929;BA.debugLine="Private enableStatusLineAutoFill As Boolean = Tru";
_enablestatuslineautofill = __c.True;
RDebugUtils.currentLine=23330931;
 //BA.debugLineNum = 23330931;BA.debugLine="Private pnlAsc As Panel										'added in versio";
_pnlasc = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=23330932;
 //BA.debugLineNum = 23330932;BA.debugLine="Private bmpAsc, bmpDes, bmpEqual As Bitmap					'a";
_bmpasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_bmpequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=23330933;
 //BA.debugLineNum = 23330933;BA.debugLine="Private cvsAsc, cvsDes, cvsEqual As Canvas					'a";
_cvsasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=23330934;
 //BA.debugLineNum = 23330934;BA.debugLine="Private cSortBitmapWidth As Int						'added in ve";
_csortbitmapwidth = 0;
RDebugUtils.currentLine=23330935;
 //BA.debugLineNum = 23330935;BA.debugLine="Private cSortBitmapHeight As Int					'added in ve";
_csortbitmapheight = 0;
RDebugUtils.currentLine=23330936;
 //BA.debugLineNum = 23330936;BA.debugLine="Private cSortBitmapColor As Int						'added in ve";
_csortbitmapcolor = 0;
RDebugUtils.currentLine=23330937;
 //BA.debugLineNum = 23330937;BA.debugLine="Private mCustomSortingBitmaps As Boolean	'added i";
_mcustomsortingbitmaps = false;
RDebugUtils.currentLine=23330938;
 //BA.debugLineNum = 23330938;BA.debugLine="Private mZeroSelection = False As Boolean";
_mzeroselection = __c.False;
RDebugUtils.currentLine=23330939;
 //BA.debugLineNum = 23330939;BA.debugLine="Private SV2Scrolls, SVFScrolls As Boolean";
_sv2scrolls = false;
_svfscrolls = false;
RDebugUtils.currentLine=23330940;
 //BA.debugLineNum = 23330940;BA.debugLine="Private SV2PosX As Int";
_sv2posx = 0;
RDebugUtils.currentLine=23330941;
 //BA.debugLineNum = 23330941;BA.debugLine="Public TableObject As Table";
_tableobject = new b4a.example.ef.table();
RDebugUtils.currentLine=23330946;
 //BA.debugLineNum = 23330946;BA.debugLine="Private arrColLong() As Long";
_arrcollong = new long[(int) (0)];
;
RDebugUtils.currentLine=23330947;
 //BA.debugLineNum = 23330947;BA.debugLine="Private arrColDouble() As Double";
_arrcoldouble = new double[(int) (0)];
;
RDebugUtils.currentLine=23330948;
 //BA.debugLineNum = 23330948;BA.debugLine="Private arrColString() As String";
_arrcolstring = new String[(int) (0)];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=23330949;
 //BA.debugLineNum = 23330949;BA.debugLine="Private arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=23330950;
 //BA.debugLineNum = 23330950;BA.debugLine="Private iPreviousSortColumn As Int = -1 'ignore w";
_iprevioussortcolumn = (int) (-1);
RDebugUtils.currentLine=23330951;
 //BA.debugLineNum = 23330951;BA.debugLine="Private bPreviousSortAscending As Boolean 'ignore";
_bprevioussortascending = false;
RDebugUtils.currentLine=23330952;
 //BA.debugLineNum = 23330952;BA.debugLine="Private mapSortingIndexes As Map";
_mapsortingindexes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=23330953;
 //BA.debugLineNum = 23330953;BA.debugLine="Private arrDataSorted() As Boolean 'added";
_arrdatasorted = new boolean[(int) (0)];
;
RDebugUtils.currentLine=23330954;
 //BA.debugLineNum = 23330954;BA.debugLine="Private bDataTempDone As Boolean 'added";
_bdatatempdone = false;
RDebugUtils.currentLine=23330955;
 //BA.debugLineNum = 23330955;BA.debugLine="Private DataTemp As List 'added";
_datatemp = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=23330956;
 //BA.debugLineNum = 23330956;BA.debugLine="Private mMultiColumnSort As Boolean = False";
_mmulticolumnsort = __c.False;
RDebugUtils.currentLine=23330957;
 //BA.debugLineNum = 23330957;BA.debugLine="Private mSortCaseInsensitive As Boolean = False";
_msortcaseinsensitive = __c.False;
RDebugUtils.currentLine=23330959;
 //BA.debugLineNum = 23330959;BA.debugLine="End Sub";
return "";
}
public String  _clearall(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearall", false))
	 {return ((String) Debug.delegate(ba, "clearall", null));}
RDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub ClearAll";
RDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Private Sub innerClearAll(vNumberOfColumns As Int,";
RDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="SV2.Panel.RemoveAllViews";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="SVF.Panel.RemoveAllViews";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().RemoveAllViews();
RDebugUtils.currentLine=24117252;
 //BA.debugLineNum = 24117252;BA.debugLine="mNumberOfColumns = vNumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _vnumberofcolumns;
RDebugUtils.currentLine=24117253;
 //BA.debugLineNum = 24117253;BA.debugLine="Dim Drawable1(mNumberOfColumns) As Object";
_drawable1 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable1.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable1[i0] = new Object();
}
}
;
RDebugUtils.currentLine=24117254;
 //BA.debugLineNum = 24117254;BA.debugLine="Dim Drawable2(mNumberOfColumns) As Object";
_drawable2 = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _drawable2.length;
for (int i0 = 0;i0 < d0;i0++) {
_drawable2[i0] = new Object();
}
}
;
RDebugUtils.currentLine=24117255;
 //BA.debugLineNum = 24117255;BA.debugLine="Dim SelectedDrawable(mNumberOfColumns) As Object";
_selecteddrawable = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _selecteddrawable.length;
for (int i0 = 0;i0 < d0;i0++) {
_selecteddrawable[i0] = new Object();
}
}
;
RDebugUtils.currentLine=24117256;
 //BA.debugLineNum = 24117256;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=24117257;
 //BA.debugLineNum = 24117257;BA.debugLine="Dim cHeaderAlignments(mNumberOfColumns) As Int";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=24117258;
 //BA.debugLineNum = 24117258;BA.debugLine="Dim cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=24117259;
 //BA.debugLineNum = 24117259;BA.debugLine="Dim cHeaderTypeFaces(mNumberOfColumns) As Typefac";
_cheadertypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cheadertypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_cheadertypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=24117261;
 //BA.debugLineNum = 24117261;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24117262;
 //BA.debugLineNum = 24117262;BA.debugLine="If lstRowColors.Size > 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=24117263;
 //BA.debugLineNum = 24117263;BA.debugLine="For i = 0 To lstRowColors.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=24117264;
 //BA.debugLineNum = 24117264;BA.debugLine="Private cds(mNumberOfColumns) As Object";
_cds = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cds.length;
for (int i0 = 0;i0 < d0;i0++) {
_cds[i0] = new Object();
}
}
;
RDebugUtils.currentLine=24117265;
 //BA.debugLineNum = 24117265;BA.debugLine="Private color = lstRowColors.Get(i) As Int";
_color = (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=24117266;
 //BA.debugLineNum = 24117266;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=24117267;
 //BA.debugLineNum = 24117267;BA.debugLine="Private cdi As ColorDrawable";
_cdi = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=24117268;
 //BA.debugLineNum = 24117268;BA.debugLine="cdi.Initialize(color, 0)";
_cdi.Initialize(_color,(int) (0));
RDebugUtils.currentLine=24117269;
 //BA.debugLineNum = 24117269;BA.debugLine="cds(col) = cdi";
_cds[_col] = (Object)(_cdi.getObject());
 }
};
RDebugUtils.currentLine=24117271;
 //BA.debugLineNum = 24117271;BA.debugLine="lstRowDrawables.Add(cds)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cds));
 }
};
 };
RDebugUtils.currentLine=24117274;
 //BA.debugLineNum = 24117274;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=24117275;
 //BA.debugLineNum = 24117275;BA.debugLine="Dim cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=24117276;
 //BA.debugLineNum = 24117276;BA.debugLine="cd1.Initialize(cRowColor1, 0)";
_cd1.Initialize(__ref._crowcolor1 /*int*/ ,(int) (0));
RDebugUtils.currentLine=24117277;
 //BA.debugLineNum = 24117277;BA.debugLine="cd2.Initialize(cRowColor2, 0)";
_cd2.Initialize(__ref._crowcolor2 /*int*/ ,(int) (0));
RDebugUtils.currentLine=24117278;
 //BA.debugLineNum = 24117278;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=24117279;
 //BA.debugLineNum = 24117279;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=24117280;
 //BA.debugLineNum = 24117280;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=24117281;
 //BA.debugLineNum = 24117281;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=24117282;
 //BA.debugLineNum = 24117282;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117283;
 //BA.debugLineNum = 24117283;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=24117285;
 //BA.debugLineNum = 24117285;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=24117287;
 //BA.debugLineNum = 24117287;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117288;
 //BA.debugLineNum = 24117288;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=24117290;
 //BA.debugLineNum = 24117290;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=24117293;
 //BA.debugLineNum = 24117293;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117294;
 //BA.debugLineNum = 24117294;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=24117296;
 //BA.debugLineNum = 24117296;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=24117298;
 //BA.debugLineNum = 24117298;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117299;
 //BA.debugLineNum = 24117299;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=24117301;
 //BA.debugLineNum = 24117301;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 }else {
RDebugUtils.currentLine=24117305;
 //BA.debugLineNum = 24117305;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step55 = 1;
final int limit55 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit55 ;_i = _i + step55 ) {
RDebugUtils.currentLine=24117306;
 //BA.debugLineNum = 24117306;BA.debugLine="Private cd1, cd2, cd3 As ColorDrawable";
_cd1 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd2 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
_cd3 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=24117307;
 //BA.debugLineNum = 24117307;BA.debugLine="cd1.Initialize(cColumnColors(i), 0)";
_cd1.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=24117308;
 //BA.debugLineNum = 24117308;BA.debugLine="cd2.Initialize(cColumnColors(i), 0)";
_cd2.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=24117309;
 //BA.debugLineNum = 24117309;BA.debugLine="cd3.Initialize(cSelectedRowColor, 0)";
_cd3.Initialize(__ref._cselectedrowcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=24117310;
 //BA.debugLineNum = 24117310;BA.debugLine="Drawable1(i) = cd1";
__ref._drawable1 /*Object[]*/ [_i] = (Object)(_cd1.getObject());
RDebugUtils.currentLine=24117311;
 //BA.debugLineNum = 24117311;BA.debugLine="Drawable2(i) = cd2";
__ref._drawable2 /*Object[]*/ [_i] = (Object)(_cd2.getObject());
RDebugUtils.currentLine=24117312;
 //BA.debugLineNum = 24117312;BA.debugLine="SelectedDrawable(i) = cd3";
__ref._selecteddrawable /*Object[]*/ [_i] = (Object)(_cd3.getObject());
RDebugUtils.currentLine=24117313;
 //BA.debugLineNum = 24117313;BA.debugLine="If MultiAlignments = False Or cAlignments0.Leng";
if (__ref._multialignments /*boolean*/ ==__c.False || __ref._calignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117314;
 //BA.debugLineNum = 24117314;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }else {
RDebugUtils.currentLine=24117316;
 //BA.debugLineNum = 24117316;BA.debugLine="cAlignments(i) = cAlignments0(i)";
__ref._calignments /*int[]*/ [_i] = __ref._calignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=24117318;
 //BA.debugLineNum = 24117318;BA.debugLine="If MultiTypeFace = False  Or cTypeFaces0.Length";
if (__ref._multitypeface /*boolean*/ ==__c.False || __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117319;
 //BA.debugLineNum = 24117319;BA.debugLine="cTypeFaces(i) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=24117321;
 //BA.debugLineNum = 24117321;BA.debugLine="cTypeFaces(i) = cTypeFaces0(i)";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
RDebugUtils.currentLine=24117324;
 //BA.debugLineNum = 24117324;BA.debugLine="If HeaderMultiAlignments = False  Or cHeaderAli";
if (__ref._headermultialignments /*boolean*/ ==__c.False || __ref._cheaderalignments0 /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117325;
 //BA.debugLineNum = 24117325;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignment";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }else {
RDebugUtils.currentLine=24117327;
 //BA.debugLineNum = 24117327;BA.debugLine="cHeaderAlignments(i) = cHeaderAlignments0(i)";
__ref._cheaderalignments /*int[]*/ [_i] = __ref._cheaderalignments0 /*int[]*/ [_i];
 };
RDebugUtils.currentLine=24117329;
 //BA.debugLineNum = 24117329;BA.debugLine="If HeaderMultiTypeFace = False  Or cHeaderTypeF";
if (__ref._headermultitypeface /*boolean*/ ==__c.False || __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24117330;
 //BA.debugLineNum = 24117330;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFace";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }else {
RDebugUtils.currentLine=24117332;
 //BA.debugLineNum = 24117332;BA.debugLine="cHeaderTypeFaces(i) = cHeaderTypeFaces0(i)";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i] = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i];
 };
 }
};
 };
RDebugUtils.currentLine=24117337;
 //BA.debugLineNum = 24117337;BA.debugLine="Dim cd4 As ColorDrawable";
_cd4 = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=24117338;
 //BA.debugLineNum = 24117338;BA.debugLine="cd4.Initialize(cSelectedCellColor, 0)";
_cd4.Initialize(__ref._cselectedcellcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=24117339;
 //BA.debugLineNum = 24117339;BA.debugLine="SelectedCellDrawable = cd4";
__ref._selectedcelldrawable /*Object*/  = (Object)(_cd4.getObject());
RDebugUtils.currentLine=24117341;
 //BA.debugLineNum = 24117341;BA.debugLine="SV2.Panel.Height = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=24117342;
 //BA.debugLineNum = 24117342;BA.debugLine="SVF.Panel.Height = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight((int) (0));
RDebugUtils.currentLine=24117345;
 //BA.debugLineNum = 24117345;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=24117346;
 //BA.debugLineNum = 24117346;BA.debugLine="minVisibleRow = -1";
__ref._minvisiblerow /*int*/  = (int) (-1);
RDebugUtils.currentLine=24117347;
 //BA.debugLineNum = 24117347;BA.debugLine="maxVisibleRow = 0";
__ref._maxvisiblerow /*int*/  = (int) (0);
RDebugUtils.currentLine=24117348;
 //BA.debugLineNum = 24117348;BA.debugLine="If ClearData = True Then";
if (_cleardata==__c.True) { 
RDebugUtils.currentLine=24117349;
 //BA.debugLineNum = 24117349;BA.debugLine="Data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 };
RDebugUtils.currentLine=24117351;
 //BA.debugLineNum = 24117351;BA.debugLine="LabelsCache.Initialize";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=24117352;
 //BA.debugLineNum = 24117352;BA.debugLine="visibleRows.Initialize";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=24117353;
 //BA.debugLineNum = 24117353;BA.debugLine="SV2.VerticalScrollPosition = 0";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (0));
RDebugUtils.currentLine=24117354;
 //BA.debugLineNum = 24117354;BA.debugLine="SVF.ScrollPosition = 0";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setScrollPosition((int) (0));
RDebugUtils.currentLine=24117355;
 //BA.debugLineNum = 24117355;BA.debugLine="For i = 1 To 80 'fill the cache to avoid delay on";
{
final int step100 = 1;
final int limit100 = (int) (80);
_i = (int) (1) ;
for (;_i <= limit100 ;_i = _i + step100 ) {
RDebugUtils.currentLine=24117356;
 //BA.debugLineNum = 24117356;BA.debugLine="LabelsCache.Add(CreateNewLabels)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null)));
 }
};
RDebugUtils.currentLine=24117358;
 //BA.debugLineNum = 24117358;BA.debugLine="If IsVisible Then";
if (__ref._isvisible /*boolean*/ ) { 
RDebugUtils.currentLine=24117359;
 //BA.debugLineNum = 24117359;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=24117360;
 //BA.debugLineNum = 24117360;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
 };
RDebugUtils.currentLine=24117362;
 //BA.debugLineNum = 24117362;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=24117364;
 //BA.debugLineNum = 24117364;BA.debugLine="End Sub";
return "";
}
public String  _updateiplocation(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updateiplocation", false))
	 {return ((String) Debug.delegate(ba, "updateiplocation", null));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Private Sub updateIPLocation";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="If (SV2.Height > Data.Size * cRowHeight) Then";
if ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )) { 
RDebugUtils.currentLine=26935299;
 //BA.debugLineNum = 26935299;BA.debugLine="internalPanel.Top = Data.Size * cRowHeight + cHe";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ +__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=26935300;
 //BA.debugLineNum = 26935300;BA.debugLine="internalPanel.Height = SV2.Height - (Data.Size *";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=26935302;
 //BA.debugLineNum = 26935302;BA.debugLine="internalPanel.Height = 0";
__ref._internalpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight((int) (0));
 };
RDebugUtils.currentLine=26935304;
 //BA.debugLineNum = 26935304;BA.debugLine="End Sub";
return "";
}
public String  _clearselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "clearselection", false))
	 {return ((String) Debug.delegate(ba, "clearselection", null));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Public Sub clearSelection";
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=26083331;
 //BA.debugLineNum = 26083331;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="End Sub";
return "";
}
public String  _refreshtable(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "refreshtable", false))
	 {return ((String) Debug.delegate(ba, "refreshtable", null));}
int _i = 0;
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub RefreshTable";
RDebugUtils.currentLine=26148865;
 //BA.debugLineNum = 26148865;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step2 = 1;
final int limit2 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=26148867;
 //BA.debugLineNum = 26148867;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=26148870;
 //BA.debugLineNum = 26148870;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Private Sub CreateNewLabels As Label()";
RDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Dim lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="rc.Col = i";
_rc.Col /*int*/  = _i;
RDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="lbl.Initialize(\"Cell\")";
_lbl.Initialize(ba,"Cell");
RDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="If cUseColumnColors = False Then";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=24772621;
 //BA.debugLineNum = 24772621;BA.debugLine="lbl.TextColor = cTextColors(i)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_i]);
 };
RDebugUtils.currentLine=24772624;
 //BA.debugLineNum = 24772624;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24772625;
 //BA.debugLineNum = 24772625;BA.debugLine="lbl.Typeface = cTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=24772627;
 //BA.debugLineNum = 24772627;BA.debugLine="lbl.Typeface = cTypeFaces(i)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()));
 };
RDebugUtils.currentLine=24772630;
 //BA.debugLineNum = 24772630;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=24772632;
 //BA.debugLineNum = 24772632;BA.debugLine="lbl.SingleLine = cSingleLine";
_lbl.setSingleLine(__ref._csingleline /*boolean*/ );
RDebugUtils.currentLine=24772633;
 //BA.debugLineNum = 24772633;BA.debugLine="lbl.Tag = rc";
_lbl.setTag((Object)(_rc));
RDebugUtils.currentLine=24772634;
 //BA.debugLineNum = 24772634;BA.debugLine="lbls(i) = lbl";
_lbls[_i] = _lbl;
 }
};
RDebugUtils.currentLine=24772636;
 //BA.debugLineNum = 24772636;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=24772637;
 //BA.debugLineNum = 24772637;BA.debugLine="End Sub";
return null;
}
public String  _setpadding(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _left,int _top,int _right,int _bottom) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setpadding", false))
	 {return ((String) Debug.delegate(ba, "setpadding", new Object[] {_v,_left,_top,_right,_bottom}));}
RDebugUtils.currentLine=31391744;
 //BA.debugLineNum = 31391744;BA.debugLine="Private Sub SetPadding(v As View, Left As Int, Top";
RDebugUtils.currentLine=31391745;
 //BA.debugLineNum = 31391745;BA.debugLine="v.Padding = Array As Int (Left, Top, Right, Botto";
_v.setPadding(new int[]{_left,_top,_right,_bottom});
RDebugUtils.currentLine=31391746;
 //BA.debugLineNum = 31391746;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(b4a.example.ef.table __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Public Sub DesignerCreateView (Base As Panel, Lbl";
RDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="pnlTable = Base";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/  = _base;
RDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="cLeft = Base.Left";
__ref._cleft /*int*/  = _base.getLeft();
RDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="cTop = Base.Top";
__ref._ctop /*int*/  = _base.getTop();
RDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="cWidth = Base.Width";
__ref._cwidth /*int*/  = _base.getWidth();
RDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="cHeight = Base.Height";
__ref._cheight /*int*/  = _base.getHeight();
RDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="pnlTable.Color = Colors.Transparent";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="Select Props.Get(\"TextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("TextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="cAlignment = Gravity.CENTER";
__ref._calignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=23461904;
 //BA.debugLineNum = 23461904;BA.debugLine="cAlignment = Bit.Or(Gravity.CENTER_VERTICAL, Gra";
__ref._calignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=23461908;
 //BA.debugLineNum = 23461908;BA.debugLine="Select Props.Get(\"HeaderTextAlignment\")";
switch (BA.switchObjectToInt(_props.Get((Object)("HeaderTextAlignment")),(Object)("LEFT"),(Object)("CENTER"),(Object)("RIGHT"))) {
case 0: {
RDebugUtils.currentLine=23461910;
 //BA.debugLineNum = 23461910;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.LEFT);
 break; }
case 1: {
RDebugUtils.currentLine=23461912;
 //BA.debugLineNum = 23461912;BA.debugLine="cHeaderAlignment = Gravity.CENTER";
__ref._cheaderalignment /*int*/  = __c.Gravity.CENTER;
 break; }
case 2: {
RDebugUtils.currentLine=23461914;
 //BA.debugLineNum = 23461914;BA.debugLine="cHeaderAlignment = Bit.Or(Gravity.CENTER_VERTICA";
__ref._cheaderalignment /*int*/  = __c.Bit.Or(__c.Gravity.CENTER_VERTICAL,__c.Gravity.RIGHT);
 break; }
}
;
RDebugUtils.currentLine=23461917;
 //BA.debugLineNum = 23461917;BA.debugLine="cLineWidth = DipToCurrent(Props.Get(\"LineWidth\"))";
__ref._clinewidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("LineWidth")))));
RDebugUtils.currentLine=23461919;
 //BA.debugLineNum = 23461919;BA.debugLine="mNumberOfColumns = Props.Get(\"NumberOfColumns\")";
__ref._mnumberofcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfColumns"))));
RDebugUtils.currentLine=23461920;
 //BA.debugLineNum = 23461920;BA.debugLine="mNumberOfFixedColumns = Props.Get(\"NumberOfFixedC";
__ref._mnumberoffixedcolumns /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("NumberOfFixedColumns"))));
RDebugUtils.currentLine=23461921;
 //BA.debugLineNum = 23461921;BA.debugLine="mFirstColumnFixed = Props.Get(\"FirstColumnFixed\")";
__ref._mfirstcolumnfixed /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("FirstColumnFixed")));
RDebugUtils.currentLine=23461922;
 //BA.debugLineNum = 23461922;BA.debugLine="If mFirstColumnFixed = True And mNumberOfFixedCol";
if (__ref._mfirstcolumnfixed /*boolean*/ ==__c.True && __ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=23461923;
 //BA.debugLineNum = 23461923;BA.debugLine="mNumberOfFixedColumns = 1";
__ref._mnumberoffixedcolumns /*int*/  = (int) (1);
 };
RDebugUtils.currentLine=23461925;
 //BA.debugLineNum = 23461925;BA.debugLine="mMultiSelect = Props.Get(\"MultiSelect\")";
__ref._mmultiselect /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("MultiSelect")));
RDebugUtils.currentLine=23461926;
 //BA.debugLineNum = 23461926;BA.debugLine="cSingleLine = Props.GetDefault(\"SingleLine\", True";
__ref._csingleline /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SingleLine"),(Object)(__c.True)));
RDebugUtils.currentLine=23461927;
 //BA.debugLineNum = 23461927;BA.debugLine="mZeroSelection = Props.Get(\"ZeroSelection\")";
__ref._mzeroselection /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ZeroSelection")));
RDebugUtils.currentLine=23461928;
 //BA.debugLineNum = 23461928;BA.debugLine="cHeaderColor = Props.Get(\"HeaderColor\")";
__ref._cheadercolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderColor"))));
RDebugUtils.currentLine=23461929;
 //BA.debugLineNum = 23461929;BA.debugLine="cTableColor = Props.Get(\"TableColor\")";
__ref._ctablecolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("TableColor"))));
RDebugUtils.currentLine=23461930;
 //BA.debugLineNum = 23461930;BA.debugLine="cHeaderTextColor = Props.Get(\"HeaderTextColor\")";
__ref._cheadertextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("HeaderTextColor"))));
RDebugUtils.currentLine=23461931;
 //BA.debugLineNum = 23461931;BA.debugLine="cTextColor = Props.Get(\"CellTextColor\")";
__ref._ctextcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("CellTextColor"))));
RDebugUtils.currentLine=23461932;
 //BA.debugLineNum = 23461932;BA.debugLine="cRowColor1 = Props.Get(\"Row1Color\")";
__ref._crowcolor1 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row1Color"))));
RDebugUtils.currentLine=23461933;
 //BA.debugLineNum = 23461933;BA.debugLine="cRowColor2 = Props.Get(\"Row2Color\")";
__ref._crowcolor2 /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("Row2Color"))));
RDebugUtils.currentLine=23461934;
 //BA.debugLineNum = 23461934;BA.debugLine="cSelectedRowColor = Props.Get(\"SelectedRowColor\")";
__ref._cselectedrowcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedRowColor"))));
RDebugUtils.currentLine=23461935;
 //BA.debugLineNum = 23461935;BA.debugLine="cSelectedCellColor = Props.Get(\"SelectedCellColor";
__ref._cselectedcellcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SelectedCellColor"))));
RDebugUtils.currentLine=23461937;
 //BA.debugLineNum = 23461937;BA.debugLine="cTextSize = Props.Get(\"TextSize\")";
__ref._ctextsize /*float*/  = (float)(BA.ObjectToNumber(_props.Get((Object)("TextSize"))));
RDebugUtils.currentLine=23461939;
 //BA.debugLineNum = 23461939;BA.debugLine="cRowHeight = DipToCurrent(Props.Get(\"RowHeight\"))";
__ref._crowheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("RowHeight")))));
RDebugUtils.currentLine=23461940;
 //BA.debugLineNum = 23461940;BA.debugLine="cHeaderHeight = DipToCurrent(Props.Get(\"HeaderHei";
__ref._cheaderheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("HeaderHeight")))));
RDebugUtils.currentLine=23461941;
 //BA.debugLineNum = 23461941;BA.debugLine="cShowStatusLine = Props.Get(\"ShowStatusLine\")";
__ref._cshowstatusline /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("ShowStatusLine")));
RDebugUtils.currentLine=23461942;
 //BA.debugLineNum = 23461942;BA.debugLine="cStatusLineHeight = DipToCurrent(Props.GetDefault";
__ref._cstatuslineheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("HeaderHeight"),(Object)(40)))));
RDebugUtils.currentLine=23461943;
 //BA.debugLineNum = 23461943;BA.debugLine="cSortColumn = Props.Get(\"SortColumn\")";
__ref._csortcolumn /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortColumn")));
RDebugUtils.currentLine=23461944;
 //BA.debugLineNum = 23461944;BA.debugLine="cSortRemoveAccents = Props.Get(\"SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = BA.ObjectToBoolean(_props.Get((Object)("SortRemoveAccents")));
RDebugUtils.currentLine=23461945;
 //BA.debugLineNum = 23461945;BA.debugLine="cSortBitmapWidth = DipToCurrent(Props.Get(\"SortBi";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapWidth")))));
RDebugUtils.currentLine=23461946;
 //BA.debugLineNum = 23461946;BA.debugLine="cSortBitmapColor = Props.Get(\"SortBitmapColor\")";
__ref._csortbitmapcolor /*int*/  = (int)(BA.ObjectToNumber(_props.Get((Object)("SortBitmapColor"))));
RDebugUtils.currentLine=23461948;
 //BA.debugLineNum = 23461948;BA.debugLine="mFastScroll = Props.GetDefault(\"FastScroll\", Fals";
__ref._mfastscroll /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScroll"),(Object)(__c.False)));
RDebugUtils.currentLine=23461949;
 //BA.debugLineNum = 23461949;BA.debugLine="mFastScrollMinItems = Props.GetDefault(\"FastScrol";
__ref._mfastscrollminitems /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollMinItems"),(Object)(50))));
RDebugUtils.currentLine=23461950;
 //BA.debugLineNum = 23461950;BA.debugLine="mFastScrollColumnIndex = Props.GetDefault(\"FastSc";
__ref._mfastscrollcolumnindex /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollColumnIndex"),(Object)(0))));
RDebugUtils.currentLine=23461951;
 //BA.debugLineNum = 23461951;BA.debugLine="mFastScrollShowLabel = Props.GetDefault(\"FastScro";
__ref._mfastscrollshowlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollShowLabel"),(Object)(__c.True)));
RDebugUtils.currentLine=23461952;
 //BA.debugLineNum = 23461952;BA.debugLine="mFastScrollFixedLabel = Props.GetDefault(\"FastScr";
__ref._mfastscrollfixedlabel /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("FastScrollFixedLabel"),(Object)(__c.False)));
RDebugUtils.currentLine=23461953;
 //BA.debugLineNum = 23461953;BA.debugLine="mFastScrollLabelMaxChars = Props.GetDefault(\"Fast";
__ref._mfastscrolllabelmaxchars /*int*/  = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelMaxChars"),(Object)(10))));
RDebugUtils.currentLine=23461954;
 //BA.debugLineNum = 23461954;BA.debugLine="mFastScrollLabelWidth = DipToCurrent(Props.GetDef";
__ref._mfastscrolllabelwidth /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelWidth"),(Object)(__c.DipToCurrent((int) (150)))))));
RDebugUtils.currentLine=23461955;
 //BA.debugLineNum = 23461955;BA.debugLine="mFastScrollLabelHeight = DipToCurrent(Props.GetDe";
__ref._mfastscrolllabelheight /*int*/  = __c.DipToCurrent((int)(BA.ObjectToNumber(_props.GetDefault((Object)("FastScrollLabelHeight"),(Object)(__c.DipToCurrent((int) (30)))))));
RDebugUtils.currentLine=23461956;
 //BA.debugLineNum = 23461956;BA.debugLine="mSortCaseInsensitive = Props.GetDefault(\"SortCase";
__ref._msortcaseinsensitive /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SortCaseInsensitive"),(Object)(__c.False)));
RDebugUtils.currentLine=23461957;
 //BA.debugLineNum = 23461957;BA.debugLine="mMultiColumnSort = Props.GetDefault(\"MultiColumnS";
__ref._mmulticolumnsort /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("MultiColumnSort"),(Object)(__c.False)));
RDebugUtils.currentLine=23461959;
 //BA.debugLineNum = 23461959;BA.debugLine="InitTable";
__ref._inittable /*String*/ (null);
RDebugUtils.currentLine=23461960;
 //BA.debugLineNum = 23461960;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub DrawFastScrollCursor";
RDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="Private pthArrow As Path";
_ptharrow = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="Private cvsFSc As Canvas";
_cvsfsc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Private x1, x2, x3, y1, y2, dd, rr As Int";
_x1 = 0;
_x2 = 0;
_x3 = 0;
_y1 = 0;
_y2 = 0;
_dd = 0;
_rr = 0;
RDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="Private rct As Rect";
_rct = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=23855110;
 //BA.debugLineNum = 23855110;BA.debugLine="rr = 7dip";
_rr = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=23855112;
 //BA.debugLineNum = 23855112;BA.debugLine="cvsFSc.Initialize(pnlFastScrollCursor)";
_cvsfsc.Initialize((android.view.View)(__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=23855113;
 //BA.debugLineNum = 23855113;BA.debugLine="rct.Initialize(0, 0, FScCursorWidth, FScCursorHei";
_rct.Initialize((int) (0),(int) (0),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=23855114;
 //BA.debugLineNum = 23855114;BA.debugLine="cvsFSc.DrawRect(rct, Colors.Transparent, True, 1d";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__c.Colors.Transparent,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855116;
 //BA.debugLineNum = 23855116;BA.debugLine="cvsFSc.DrawCircle(rr, rr, rr, FScCursorCol1, True";
_cvsfsc.DrawCircle((float) (_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855117;
 //BA.debugLineNum = 23855117;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, rr, rr, FS";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855118;
 //BA.debugLineNum = 23855118;BA.debugLine="cvsFSc.DrawCircle(rr, FScCursorHeight - rr, rr, F";
_cvsfsc.DrawCircle((float) (_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855119;
 //BA.debugLineNum = 23855119;BA.debugLine="cvsFSc.DrawCircle(FScCursorWidth - rr, FScCursorH";
_cvsfsc.DrawCircle((float) (__ref._fsccursorwidth /*int*/ -_rr),(float) (__ref._fsccursorheight /*int*/ -_rr),(float) (_rr),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855121;
 //BA.debugLineNum = 23855121;BA.debugLine="rct.Initialize(rr, 0, FScCursorWidth - rr, rr)";
_rct.Initialize(_rr,(int) (0),(int) (__ref._fsccursorwidth /*int*/ -_rr),_rr);
RDebugUtils.currentLine=23855122;
 //BA.debugLineNum = 23855122;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855123;
 //BA.debugLineNum = 23855123;BA.debugLine="rct.Initialize(0, rr, FScCursorWidth, FScCursorHe";
_rct.Initialize((int) (0),_rr,__ref._fsccursorwidth /*int*/ ,(int) (__ref._fsccursorheight /*int*/ -_rr));
RDebugUtils.currentLine=23855124;
 //BA.debugLineNum = 23855124;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855125;
 //BA.debugLineNum = 23855125;BA.debugLine="rct.Initialize(rr, FScCursorHeight - rr, FScCurso";
_rct.Initialize(_rr,(int) (__ref._fsccursorheight /*int*/ -_rr),__ref._fsccursorwidth /*int*/ ,__ref._fsccursorheight /*int*/ );
RDebugUtils.currentLine=23855126;
 //BA.debugLineNum = 23855126;BA.debugLine="cvsFSc.DrawRect(rct, FScCursorCol1, True, 1dip)";
_cvsfsc.DrawRect((android.graphics.Rect)(_rct.getObject()),__ref._fsccursorcol1 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855128;
 //BA.debugLineNum = 23855128;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 - 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2-__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855129;
 //BA.debugLineNum = 23855129;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2, FScCur";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855130;
 //BA.debugLineNum = 23855130;BA.debugLine="cvsFSc.DrawLine(5dip, FScCursorHeight / 2 + 5dip,";
_cvsfsc.DrawLine((float) (__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorwidth /*int*/ -__c.DipToCurrent((int) (5))),(float) (__ref._fsccursorheight /*int*/ /(double)2+__c.DipToCurrent((int) (5))),__ref._fsccursorcol2 /*int*/ ,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855132;
 //BA.debugLineNum = 23855132;BA.debugLine="dd = 7dip";
_dd = __c.DipToCurrent((int) (7));
RDebugUtils.currentLine=23855133;
 //BA.debugLineNum = 23855133;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=23855134;
 //BA.debugLineNum = 23855134;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=23855135;
 //BA.debugLineNum = 23855135;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=23855136;
 //BA.debugLineNum = 23855136;BA.debugLine="y2 = dd";
_y2 = _dd;
RDebugUtils.currentLine=23855137;
 //BA.debugLineNum = 23855137;BA.debugLine="y1 = y2 + dd";
_y1 = (int) (_y2+_dd);
RDebugUtils.currentLine=23855138;
 //BA.debugLineNum = 23855138;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=23855139;
 //BA.debugLineNum = 23855139;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=23855140;
 //BA.debugLineNum = 23855140;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=23855141;
 //BA.debugLineNum = 23855141;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855143;
 //BA.debugLineNum = 23855143;BA.debugLine="x2 = FScCursorWidth / 2";
_x2 = (int) (__ref._fsccursorwidth /*int*/ /(double)2);
RDebugUtils.currentLine=23855144;
 //BA.debugLineNum = 23855144;BA.debugLine="x1 = x2 - dd";
_x1 = (int) (_x2-_dd);
RDebugUtils.currentLine=23855145;
 //BA.debugLineNum = 23855145;BA.debugLine="x3 = x2 + dd";
_x3 = (int) (_x2+_dd);
RDebugUtils.currentLine=23855146;
 //BA.debugLineNum = 23855146;BA.debugLine="y2 = FScCursorHeight - dd";
_y2 = (int) (__ref._fsccursorheight /*int*/ -_dd);
RDebugUtils.currentLine=23855147;
 //BA.debugLineNum = 23855147;BA.debugLine="y1 = y2 - dd";
_y1 = (int) (_y2-_dd);
RDebugUtils.currentLine=23855148;
 //BA.debugLineNum = 23855148;BA.debugLine="pthArrow.Initialize(x1, y1)";
_ptharrow.Initialize((float) (_x1),(float) (_y1));
RDebugUtils.currentLine=23855149;
 //BA.debugLineNum = 23855149;BA.debugLine="pthArrow.LineTo(x3, y1)";
_ptharrow.LineTo((float) (_x3),(float) (_y1));
RDebugUtils.currentLine=23855150;
 //BA.debugLineNum = 23855150;BA.debugLine="pthArrow.LineTo(x2, y2)";
_ptharrow.LineTo((float) (_x2),(float) (_y2));
RDebugUtils.currentLine=23855151;
 //BA.debugLineNum = 23855151;BA.debugLine="cvsFSc.DrawPath(pthArrow, FScCursorCol2, True, 1d";
_cvsfsc.DrawPath((android.graphics.Path)(_ptharrow.getObject()),__ref._fsccursorcol2 /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23855152;
 //BA.debugLineNum = 23855152;BA.debugLine="pnlFastScrollCursor.Invalidate";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=23855153;
 //BA.debugLineNum = 23855153;BA.debugLine="End Sub";
return "";
}
public String  _fastscrolltimer_tick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "fastscrolltimer_tick", false))
	 {return ((String) Debug.delegate(ba, "fastscrolltimer_tick", null));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub FastScrollTimer_Tick";
RDebugUtils.currentLine=28639233;
 //BA.debugLineNum = 28639233;BA.debugLine="FScTimer.Enabled = False";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.False);
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=28639235;
 //BA.debugLineNum = 28639235;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=28639236;
 //BA.debugLineNum = 28639236;BA.debugLine="End Sub";
return "";
}
public boolean  _getallowselection(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getallowselection", false))
	 {return ((Boolean) Debug.delegate(ba, "getallowselection", null));}
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Public Sub getAllowSelection As Boolean";
RDebugUtils.currentLine=26411009;
 //BA.debugLineNum = 26411009;BA.debugLine="Return cAllowSelection";
if (true) return __ref._callowselection /*boolean*/ ;
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="End Sub";
return false;
}
public int  _getcellalignment(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcellalignment", false))
	 {return ((Integer) Debug.delegate(ba, "getcellalignment", null));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Public Sub getCellAlignment As Int";
RDebugUtils.currentLine=28770305;
 //BA.debugLineNum = 28770305;BA.debugLine="Return cAlignment";
if (true) return __ref._calignment /*int*/ ;
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="End Sub";
return 0;
}
public int[]  _getcolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumncolors", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumncolors", null));}
RDebugUtils.currentLine=31784960;
 //BA.debugLineNum = 31784960;BA.debugLine="Public Sub GetColumnColors As Int()";
RDebugUtils.currentLine=31784961;
 //BA.debugLineNum = 31784961;BA.debugLine="Return cColumnColors";
if (true) return __ref._ccolumncolors /*int[]*/ ;
RDebugUtils.currentLine=31784962;
 //BA.debugLineNum = 31784962;BA.debugLine="End Sub";
return null;
}
public String  _getcolumndatatype(b4a.example.ef.table __ref,int _column) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "getcolumndatatype", new Object[] {_column}));}
RDebugUtils.currentLine=33095680;
 //BA.debugLineNum = 33095680;BA.debugLine="Public Sub GetColumnDataType(Column As Int) As Str";
RDebugUtils.currentLine=33095681;
 //BA.debugLineNum = 33095681;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=33095682;
 //BA.debugLineNum = 33095682;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=33095683;
 //BA.debugLineNum = 33095683;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=33095686;
 //BA.debugLineNum = 33095686;BA.debugLine="Return cColumnDataType(Column)";
if (true) return __ref._ccolumndatatype /*String[]*/ [_column];
RDebugUtils.currentLine=33095687;
 //BA.debugLineNum = 33095687;BA.debugLine="End Sub";
return "";
}
public String[]  _getcolumndatatypes(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumndatatypes", false))
	 {return ((String[]) Debug.delegate(ba, "getcolumndatatypes", null));}
RDebugUtils.currentLine=33226752;
 //BA.debugLineNum = 33226752;BA.debugLine="Public Sub GetColumnDataTypes As String()";
RDebugUtils.currentLine=33226753;
 //BA.debugLineNum = 33226753;BA.debugLine="Return cColumnDataType";
if (true) return __ref._ccolumndatatype /*String[]*/ ;
RDebugUtils.currentLine=33226754;
 //BA.debugLineNum = 33226754;BA.debugLine="End Sub";
return null;
}
public int[]  _getcolumnwidths(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getcolumnwidths", false))
	 {return ((int[]) Debug.delegate(ba, "getcolumnwidths", null));}
RDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Public Sub GetColumnWidths As Int()";
RDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Return SavedWidths";
if (true) return __ref._savedwidths /*int[]*/ ;
RDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34340864;
 //BA.debugLineNum = 34340864;BA.debugLine="Private Sub GetContrastColor(Color As Int) As Int";
RDebugUtils.currentLine=34340865;
 //BA.debugLineNum = 34340865;BA.debugLine="Private a, r, g, b, yiq As Int	'ignore";
_a = 0;
_r = 0;
_g = 0;
_b = 0;
_yiq = 0;
RDebugUtils.currentLine=34340867;
 //BA.debugLineNum = 34340867;BA.debugLine="a = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_a = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
RDebugUtils.currentLine=34340868;
 //BA.debugLineNum = 34340868;BA.debugLine="r = Bit.UnsignedShiftRight(Bit.And(Color, 0xff000";
_r = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
RDebugUtils.currentLine=34340869;
 //BA.debugLineNum = 34340869;BA.debugLine="g = Bit.UnsignedShiftRight(Bit.And(Color, 0xff00)";
_g = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
RDebugUtils.currentLine=34340870;
 //BA.debugLineNum = 34340870;BA.debugLine="b = Bit.And(Color, 0xff)";
_b = __c.Bit.And(_color,((int)0xff));
RDebugUtils.currentLine=34340872;
 //BA.debugLineNum = 34340872;BA.debugLine="yiq = r * 0.299 + g * 0.587 + b * 0.114";
_yiq = (int) (_r*0.299+_g*0.587+_b*0.114);
RDebugUtils.currentLine=34340874;
 //BA.debugLineNum = 34340874;BA.debugLine="If yiq > 128 Then";
if (_yiq>128) { 
RDebugUtils.currentLine=34340875;
 //BA.debugLineNum = 34340875;BA.debugLine="Return Colors.Black";
if (true) return __c.Colors.Black;
 }else {
RDebugUtils.currentLine=34340877;
 //BA.debugLineNum = 34340877;BA.debugLine="Return Colors.White";
if (true) return __c.Colors.White;
 };
RDebugUtils.currentLine=34340879;
 //BA.debugLineNum = 34340879;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscroll", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscroll", null));}
RDebugUtils.currentLine=34406400;
 //BA.debugLineNum = 34406400;BA.debugLine="Public Sub getFastScroll As Boolean";
RDebugUtils.currentLine=34406401;
 //BA.debugLineNum = 34406401;BA.debugLine="Return mFastScroll";
if (true) return __ref._mfastscroll /*boolean*/ ;
RDebugUtils.currentLine=34406402;
 //BA.debugLineNum = 34406402;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrollcolumnindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollcolumnindex", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollcolumnindex", null));}
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Public Sub getFastScrollColumnIndex As Int";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="Return mFastScrollColumnIndex";
if (true) return __ref._mfastscrollcolumnindex /*int*/ ;
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollfixedlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollfixedlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollfixedlabel", null));}
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Public Sub getFastScrollFixedLabel As Boolean";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="Return mFastScrollFixedLabel";
if (true) return __ref._mfastscrollfixedlabel /*boolean*/ ;
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="End Sub";
return false;
}
public int  _getfastscrolllabelheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelheight", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelheight", null));}
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Public Sub getFastScrollLabelHeight As Int";
RDebugUtils.currentLine=35323905;
 //BA.debugLineNum = 35323905;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelmaxchars(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelmaxchars", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelmaxchars", null));}
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Public Sub getFastScrollLabelMaxChars As Int";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="Return mFastScrollLabelMaxChars";
if (true) return __ref._mfastscrolllabelmaxchars /*int*/ ;
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrolllabelwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrolllabelwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrolllabelwidth", null));}
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Public Sub getFastScrollLabelWidth As Int";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Return mFastScrollLabelWidth";
if (true) return __ref._mfastscrolllabelwidth /*int*/ ;
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="End Sub";
return 0;
}
public int  _getfastscrollminitems(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollminitems", false))
	 {return ((Integer) Debug.delegate(ba, "getfastscrollminitems", null));}
RDebugUtils.currentLine=34537472;
 //BA.debugLineNum = 34537472;BA.debugLine="Public Sub getFastScrollMinItems As Int";
RDebugUtils.currentLine=34537473;
 //BA.debugLineNum = 34537473;BA.debugLine="Return mFastScrollMinItems";
if (true) return __ref._mfastscrollminitems /*int*/ ;
RDebugUtils.currentLine=34537474;
 //BA.debugLineNum = 34537474;BA.debugLine="End Sub";
return 0;
}
public boolean  _getfastscrollshowlabel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfastscrollshowlabel", false))
	 {return ((Boolean) Debug.delegate(ba, "getfastscrollshowlabel", null));}
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="Public Sub getFastScrollShowLabel As Boolean";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="Return mFastScrollShowLabel";
if (true) return __ref._mfastscrollshowlabel /*boolean*/ ;
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="End Sub";
return false;
}
public boolean  _getfirstcolumnfixed(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getfirstcolumnfixed", false))
	 {return ((Boolean) Debug.delegate(ba, "getfirstcolumnfixed", null));}
RDebugUtils.currentLine=34275328;
 //BA.debugLineNum = 34275328;BA.debugLine="Public Sub getFirstColumnFixed As Boolean";
RDebugUtils.currentLine=34275329;
 //BA.debugLineNum = 34275329;BA.debugLine="Return mFirstColumnFixed";
if (true) return __ref._mfirstcolumnfixed /*boolean*/ ;
RDebugUtils.currentLine=34275330;
 //BA.debugLineNum = 34275330;BA.debugLine="End Sub";
return false;
}
public int  _getheadercolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadercolor", null));}
RDebugUtils.currentLine=29032448;
 //BA.debugLineNum = 29032448;BA.debugLine="Public Sub getHeaderColor As Int";
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="Return cHeaderColor";
if (true) return __ref._cheadercolor /*int*/ ;
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadercolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadercolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadercolors", null));}
RDebugUtils.currentLine=32047104;
 //BA.debugLineNum = 32047104;BA.debugLine="Public Sub GetHeaderColors As Int()";
RDebugUtils.currentLine=32047105;
 //BA.debugLineNum = 32047105;BA.debugLine="Return cHeaderColors";
if (true) return __ref._cheadercolors /*int[]*/ ;
RDebugUtils.currentLine=32047106;
 //BA.debugLineNum = 32047106;BA.debugLine="End Sub";
return null;
}
public int  _getheaderheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheaderheight", null));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Public Sub getHeaderHeight As Int";
RDebugUtils.currentLine=28901377;
 //BA.debugLineNum = 28901377;BA.debugLine="Return cHeaderHeight";
if (true) return __ref._cheaderheight /*int*/ ;
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getheaderpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheaderpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getheaderpanel", null));}
RDebugUtils.currentLine=26542080;
 //BA.debugLineNum = 26542080;BA.debugLine="Public Sub getHeaderPanel As Panel";
RDebugUtils.currentLine=26542081;
 //BA.debugLineNum = 26542081;BA.debugLine="Return Header";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=26542082;
 //BA.debugLineNum = 26542082;BA.debugLine="End Sub";
return null;
}
public int  _getheadertextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getheadertextcolor", null));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Public Sub getHeaderTextColor As Int";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="Return cHeaderTextColor";
if (true) return __ref._cheadertextcolor /*int*/ ;
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="End Sub";
return 0;
}
public int[]  _getheadertextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "getheadertextcolors", null));}
RDebugUtils.currentLine=32374784;
 //BA.debugLineNum = 32374784;BA.debugLine="Public Sub GetHeaderTextColors As Int()";
RDebugUtils.currentLine=32374785;
 //BA.debugLineNum = 32374785;BA.debugLine="Return cHeaderTextColors";
if (true) return __ref._cheadertextcolors /*int[]*/ ;
RDebugUtils.currentLine=32374786;
 //BA.debugLineNum = 32374786;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper  _getheadertypeface(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheadertypeface", false))
	 {return ((anywheresoftware.b4a.keywords.constants.TypefaceWrapper) Debug.delegate(ba, "getheadertypeface", null));}
RDebugUtils.currentLine=32178176;
 //BA.debugLineNum = 32178176;BA.debugLine="Public Sub getHeaderTypeFace As Typeface";
RDebugUtils.currentLine=32178177;
 //BA.debugLineNum = 32178177;BA.debugLine="Return cHeaderTypeFace";
if (true) return __ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
RDebugUtils.currentLine=32178178;
 //BA.debugLineNum = 32178178;BA.debugLine="End Sub";
return null;
}
public int  _getheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getheight", false))
	 {return ((Integer) Debug.delegate(ba, "getheight", null));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Public Sub getHeight As Int";
RDebugUtils.currentLine=27590657;
 //BA.debugLineNum = 27590657;BA.debugLine="Return pnlTable.Height";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight();
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="End Sub";
return 0;
}
public int  _getinnertotalwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getinnertotalwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getinnertotalwidth", null));}
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Public Sub getInnerTotalWidth As Int";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="Return Header.Width";
if (true) return __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
 }else {
RDebugUtils.currentLine=27394052;
 //BA.debugLineNum = 27394052;BA.debugLine="Return HeaderFirst.Width + Header.Width";
if (true) return (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=27394054;
 //BA.debugLineNum = 27394054;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Private Sub GetLabels(Row As Int) As Label()";
RDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=24707076;
 //BA.debugLineNum = 24707076;BA.debugLine="lbls = LabelsCache.Get(LabelsCache.Size - 1)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
RDebugUtils.currentLine=24707077;
 //BA.debugLineNum = 24707077;BA.debugLine="LabelsCache.RemoveAt(LabelsCache.Size - 1)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
RDebugUtils.currentLine=24707079;
 //BA.debugLineNum = 24707079;BA.debugLine="lbls = CreateNewLabels";
_lbls = __ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
 };
RDebugUtils.currentLine=24707081;
 //BA.debugLineNum = 24707081;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=24707082;
 //BA.debugLineNum = 24707082;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=24707083;
 //BA.debugLineNum = 24707083;BA.debugLine="rc = lbls(I).Tag";
_rc = (b4a.example.ef.table._rowcol)(_lbls[_i].getTag());
RDebugUtils.currentLine=24707084;
 //BA.debugLineNum = 24707084;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
 }
};
RDebugUtils.currentLine=24707086;
 //BA.debugLineNum = 24707086;BA.debugLine="Return lbls";
if (true) return _lbls;
RDebugUtils.currentLine=24707087;
 //BA.debugLineNum = 24707087;BA.debugLine="End Sub";
return null;
}
public int  _getleft(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getleft", false))
	 {return ((Integer) Debug.delegate(ba, "getleft", null));}
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Public Sub getLeft As Int";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Return pnlTable.Left";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getLeft();
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="End Sub";
return 0;
}
public int  _getlinewidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getlinewidth", false))
	 {return ((Integer) Debug.delegate(ba, "getlinewidth", null));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Public Sub getLineWidth As Int";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="Return cLineWidth";
if (true) return __ref._clinewidth /*int*/ ;
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="End Sub";
return 0;
}
public boolean  _getmulticolumnsort(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmulticolumnsort", false))
	 {return ((Boolean) Debug.delegate(ba, "getmulticolumnsort", null));}
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Public Sub getMultiColumnSort As Boolean";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Return mMultiColumnSort";
if (true) return __ref._mmulticolumnsort /*boolean*/ ;
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="End Sub";
return false;
}
public boolean  _getmultiselect(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getmultiselect", false))
	 {return ((Boolean) Debug.delegate(ba, "getmultiselect", null));}
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Public Sub getMultiSelect As Boolean";
RDebugUtils.currentLine=26279937;
 //BA.debugLineNum = 26279937;BA.debugLine="Return mMultiSelect";
if (true) return __ref._mmultiselect /*boolean*/ ;
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="End Sub";
return false;
}
public int  _getnumberofcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofcolumns", null));}
RDebugUtils.currentLine=33292288;
 //BA.debugLineNum = 33292288;BA.debugLine="Public Sub getNumberOfColumns As Int";
RDebugUtils.currentLine=33292289;
 //BA.debugLineNum = 33292289;BA.debugLine="Return mNumberOfColumns";
if (true) return __ref._mnumberofcolumns /*int*/ ;
RDebugUtils.currentLine=33292290;
 //BA.debugLineNum = 33292290;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberoffixedcolumns(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberoffixedcolumns", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberoffixedcolumns", null));}
RDebugUtils.currentLine=34144256;
 //BA.debugLineNum = 34144256;BA.debugLine="Public Sub getNumberOfFixedColumns As Int";
RDebugUtils.currentLine=34144257;
 //BA.debugLineNum = 34144257;BA.debugLine="Return mNumberOfFixedColumns";
if (true) return __ref._mnumberoffixedcolumns /*int*/ ;
RDebugUtils.currentLine=34144258;
 //BA.debugLineNum = 34144258;BA.debugLine="End Sub";
return 0;
}
public int  _getnumberofrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getnumberofrows", false))
	 {return ((Integer) Debug.delegate(ba, "getnumberofrows", null));}
RDebugUtils.currentLine=33423360;
 //BA.debugLineNum = 33423360;BA.debugLine="Public Sub getNumberOfRows As Int";
RDebugUtils.currentLine=33423361;
 //BA.debugLineNum = 33423361;BA.debugLine="Return Data.Size";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize();
RDebugUtils.currentLine=33423362;
 //BA.debugLineNum = 33423362;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.PanelWrapper  _getpanel(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getpanel", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "getpanel", null));}
RDebugUtils.currentLine=32768000;
 //BA.debugLineNum = 32768000;BA.debugLine="Public Sub getPanel As Panel";
RDebugUtils.currentLine=32768001;
 //BA.debugLineNum = 32768001;BA.debugLine="Return pnlTable";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
RDebugUtils.currentLine=32768002;
 //BA.debugLineNum = 32768002;BA.debugLine="End Sub";
return null;
}
public int  _getrowcolor1(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor1", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor1", null));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Public Sub getRowColor1 As Int";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="Return cRowColor1";
if (true) return __ref._crowcolor1 /*int*/ ;
RDebugUtils.currentLine=29294594;
 //BA.debugLineNum = 29294594;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolor2(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolor2", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolor2", null));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Public Sub getRowColor2 As Int";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="Return cRowColor2";
if (true) return __ref._crowcolor2 /*int*/ ;
RDebugUtils.currentLine=29425666;
 //BA.debugLineNum = 29425666;BA.debugLine="End Sub";
return 0;
}
public int  _getrowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowcolorn", false))
	 {return ((Integer) Debug.delegate(ba, "getrowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=29556736;
 //BA.debugLineNum = 29556736;BA.debugLine="Public Sub GetRowColorN(Row As Int) As Int";
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Return lstRowColors.Get(lstRowColorIndexes.Get(Ro";
if (true) return (int)(BA.ObjectToNumber(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) ((double)(BA.ObjectToNumber(__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row)))-2))));
RDebugUtils.currentLine=29556738;
 //BA.debugLineNum = 29556738;BA.debugLine="End Sub";
return 0;
}
public int  _getrowheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getrowheight", false))
	 {return ((Integer) Debug.delegate(ba, "getrowheight", null));}
RDebugUtils.currentLine=30670848;
 //BA.debugLineNum = 30670848;BA.debugLine="Public Sub getRowHeight As Int";
RDebugUtils.currentLine=30670849;
 //BA.debugLineNum = 30670849;BA.debugLine="Return cRowHeight";
if (true) return __ref._crowheight /*int*/ ;
RDebugUtils.currentLine=30670850;
 //BA.debugLineNum = 30670850;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcellcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcellcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcellcolor", null));}
RDebugUtils.currentLine=30015488;
 //BA.debugLineNum = 30015488;BA.debugLine="Public Sub getSelectedCellColor As Int";
RDebugUtils.currentLine=30015489;
 //BA.debugLineNum = 30015489;BA.debugLine="Return cSelectedCellColor";
if (true) return __ref._cselectedcellcolor /*int*/ ;
RDebugUtils.currentLine=30015490;
 //BA.debugLineNum = 30015490;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedcelltextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedcelltextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedcelltextcolor", null));}
RDebugUtils.currentLine=30146560;
 //BA.debugLineNum = 30146560;BA.debugLine="Public Sub getSelectedCellTextColor As Int";
RDebugUtils.currentLine=30146561;
 //BA.debugLineNum = 30146561;BA.debugLine="Return cSelectedCellTextColor";
if (true) return __ref._cselectedcelltextcolor /*int*/ ;
RDebugUtils.currentLine=30146562;
 //BA.debugLineNum = 30146562;BA.debugLine="End Sub";
return 0;
}
public int  _getselectedrowcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowcolor", null));}
RDebugUtils.currentLine=29753344;
 //BA.debugLineNum = 29753344;BA.debugLine="Public Sub getSelectedRowColor As Int";
RDebugUtils.currentLine=29753345;
 //BA.debugLineNum = 29753345;BA.debugLine="Return cSelectedRowColor";
if (true) return __ref._cselectedrowcolor /*int*/ ;
RDebugUtils.currentLine=29753346;
 //BA.debugLineNum = 29753346;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _getselectedrows(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrows", false))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getselectedrows", null));}
anywheresoftware.b4a.objects.collections.List _sr = null;
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Public Sub getSelectedRows As List";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Dim sr As List";
_sr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="sr.Initialize";
_sr.Initialize();
RDebugUtils.currentLine=26607619;
 //BA.debugLineNum = 26607619;BA.debugLine="sr.AddAll(SelectedRows)";
_sr.AddAll(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=26607620;
 //BA.debugLineNum = 26607620;BA.debugLine="Return sr";
if (true) return _sr;
RDebugUtils.currentLine=26607621;
 //BA.debugLineNum = 26607621;BA.debugLine="End Sub";
return null;
}
public int  _getselectedrowtextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getselectedrowtextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getselectedrowtextcolor", null));}
RDebugUtils.currentLine=29884416;
 //BA.debugLineNum = 29884416;BA.debugLine="Public Sub getSelectedRowTextColor As Int";
RDebugUtils.currentLine=29884417;
 //BA.debugLineNum = 29884417;BA.debugLine="Return cSelectedRowTextColor";
if (true) return __ref._cselectedrowtextcolor /*int*/ ;
RDebugUtils.currentLine=29884418;
 //BA.debugLineNum = 29884418;BA.debugLine="End Sub";
return 0;
}
public boolean  _getshowstatusline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getshowstatusline", false))
	 {return ((Boolean) Debug.delegate(ba, "getshowstatusline", null));}
RDebugUtils.currentLine=32702464;
 //BA.debugLineNum = 32702464;BA.debugLine="Public Sub getShowStatusLine As Boolean";
RDebugUtils.currentLine=32702465;
 //BA.debugLineNum = 32702465;BA.debugLine="Return cShowStatusLine";
if (true) return __ref._cshowstatusline /*boolean*/ ;
RDebugUtils.currentLine=32702466;
 //BA.debugLineNum = 32702466;BA.debugLine="End Sub";
return false;
}
public boolean  _getsingleline(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsingleline", false))
	 {return ((Boolean) Debug.delegate(ba, "getsingleline", null));}
RDebugUtils.currentLine=32505856;
 //BA.debugLineNum = 32505856;BA.debugLine="Public Sub getSingleLine As Boolean";
RDebugUtils.currentLine=32505857;
 //BA.debugLineNum = 32505857;BA.debugLine="Return cSingleLine";
if (true) return __ref._csingleline /*boolean*/ ;
RDebugUtils.currentLine=32505858;
 //BA.debugLineNum = 32505858;BA.debugLine="End Sub";
return false;
}
public long  _getsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsize", false))
	 {return ((Long) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Public Sub getSize As Long";
RDebugUtils.currentLine=27000833;
 //BA.debugLineNum = 27000833;BA.debugLine="Return Data.Size";
if (true) return (long) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize());
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="End Sub";
return 0L;
}
public int  _getsortbitmapcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapcolor", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapcolor", null));}
RDebugUtils.currentLine=33882112;
 //BA.debugLineNum = 33882112;BA.debugLine="Public Sub getSortBitmapColor As Int";
RDebugUtils.currentLine=33882113;
 //BA.debugLineNum = 33882113;BA.debugLine="Return cSortBitmapColor";
if (true) return __ref._csortbitmapcolor /*int*/ ;
RDebugUtils.currentLine=33882114;
 //BA.debugLineNum = 33882114;BA.debugLine="End Sub";
return 0;
}
public int  _getsortbitmapwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortbitmapwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getsortbitmapwidth", null));}
RDebugUtils.currentLine=33751040;
 //BA.debugLineNum = 33751040;BA.debugLine="Public Sub getSortBitmapWidth As Int";
RDebugUtils.currentLine=33751041;
 //BA.debugLineNum = 33751041;BA.debugLine="Return cSortBitmapWidth";
if (true) return __ref._csortbitmapwidth /*int*/ ;
RDebugUtils.currentLine=33751042;
 //BA.debugLineNum = 33751042;BA.debugLine="End Sub";
return 0;
}
public boolean  _getsortcaseinsensitive(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcaseinsensitive", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcaseinsensitive", null));}
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Public Sub getSortCaseInsensitive As Boolean";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="Return mSortCaseInsensitive";
if (true) return __ref._msortcaseinsensitive /*boolean*/ ;
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortcolumn(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortcolumn", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortcolumn", null));}
RDebugUtils.currentLine=31522816;
 //BA.debugLineNum = 31522816;BA.debugLine="Public Sub getSortColumn As Boolean";
RDebugUtils.currentLine=31522817;
 //BA.debugLineNum = 31522817;BA.debugLine="Return cSortColumn";
if (true) return __ref._csortcolumn /*boolean*/ ;
RDebugUtils.currentLine=31522818;
 //BA.debugLineNum = 31522818;BA.debugLine="End Sub";
return false;
}
public boolean  _getsortremoveaccents(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getsortremoveaccents", false))
	 {return ((Boolean) Debug.delegate(ba, "getsortremoveaccents", null));}
RDebugUtils.currentLine=33488896;
 //BA.debugLineNum = 33488896;BA.debugLine="Public Sub getSortRemoveAccents As Boolean";
RDebugUtils.currentLine=33488897;
 //BA.debugLineNum = 33488897;BA.debugLine="Return cSortRemoveAccents";
if (true) return __ref._csortremoveaccents /*boolean*/ ;
RDebugUtils.currentLine=33488898;
 //BA.debugLineNum = 33488898;BA.debugLine="End Sub";
return false;
}
public int  _getstatuslineheight(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getstatuslineheight", false))
	 {return ((Integer) Debug.delegate(ba, "getstatuslineheight", null));}
RDebugUtils.currentLine=30801920;
 //BA.debugLineNum = 30801920;BA.debugLine="Public Sub getStatusLineHeight As Int";
RDebugUtils.currentLine=30801921;
 //BA.debugLineNum = 30801921;BA.debugLine="Return cStatusLineHeight";
if (true) return __ref._cstatuslineheight /*int*/ ;
RDebugUtils.currentLine=30801922;
 //BA.debugLineNum = 30801922;BA.debugLine="End Sub";
return 0;
}
public int  _gettablecolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettablecolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettablecolor", null));}
RDebugUtils.currentLine=30277632;
 //BA.debugLineNum = 30277632;BA.debugLine="Public Sub getTableColor As Int";
RDebugUtils.currentLine=30277633;
 //BA.debugLineNum = 30277633;BA.debugLine="Return cTableColor";
if (true) return __ref._ctablecolor /*int*/ ;
RDebugUtils.currentLine=30277634;
 //BA.debugLineNum = 30277634;BA.debugLine="End Sub";
return 0;
}
public Object  _gettag(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettag", false))
	 {return ((Object) Debug.delegate(ba, "gettag", null));}
RDebugUtils.currentLine=32964608;
 //BA.debugLineNum = 32964608;BA.debugLine="Public Sub getTag As Object";
RDebugUtils.currentLine=32964609;
 //BA.debugLineNum = 32964609;BA.debugLine="Return pnlTable.Tag";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTag();
RDebugUtils.currentLine=32964610;
 //BA.debugLineNum = 32964610;BA.debugLine="End Sub";
return null;
}
public int  _gettextcolor(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolor", false))
	 {return ((Integer) Debug.delegate(ba, "gettextcolor", null));}
RDebugUtils.currentLine=30408704;
 //BA.debugLineNum = 30408704;BA.debugLine="Public Sub getTextColor As Int";
RDebugUtils.currentLine=30408705;
 //BA.debugLineNum = 30408705;BA.debugLine="Return cTextColor";
if (true) return __ref._ctextcolor /*int*/ ;
RDebugUtils.currentLine=30408706;
 //BA.debugLineNum = 30408706;BA.debugLine="End Sub";
return 0;
}
public int[]  _gettextcolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextcolors", false))
	 {return ((int[]) Debug.delegate(ba, "gettextcolors", null));}
RDebugUtils.currentLine=31916032;
 //BA.debugLineNum = 31916032;BA.debugLine="Public Sub GetTextColors As Int()";
RDebugUtils.currentLine=31916033;
 //BA.debugLineNum = 31916033;BA.debugLine="Return cTextColors";
if (true) return __ref._ctextcolors /*int[]*/ ;
RDebugUtils.currentLine=31916034;
 //BA.debugLineNum = 31916034;BA.debugLine="End Sub";
return null;
}
public float  _gettextsize(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettextsize", false))
	 {return ((Float) Debug.delegate(ba, "gettextsize", null));}
RDebugUtils.currentLine=30539776;
 //BA.debugLineNum = 30539776;BA.debugLine="Public Sub getTextSize As Float";
RDebugUtils.currentLine=30539777;
 //BA.debugLineNum = 30539777;BA.debugLine="Return cTextSize";
if (true) return __ref._ctextsize /*float*/ ;
RDebugUtils.currentLine=30539778;
 //BA.debugLineNum = 30539778;BA.debugLine="End Sub";
return 0f;
}
public int  _gettop(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettop", false))
	 {return ((Integer) Debug.delegate(ba, "gettop", null));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Public Sub getTop As Int";
RDebugUtils.currentLine=27262977;
 //BA.debugLineNum = 27262977;BA.debugLine="Return pnlTable.Top";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="End Sub";
return 0;
}
public int  _gettoprowindex(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "gettoprowindex", false))
	 {return ((Integer) Debug.delegate(ba, "gettoprowindex", null));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Public Sub getTopRowIndex As Int";
RDebugUtils.currentLine=27918337;
 //BA.debugLineNum = 27918337;BA.debugLine="Return SV2.VerticalScrollPosition / cRowHeight";
if (true) return (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ );
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return 0;
}
public boolean  _getusecolumncolors(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getusecolumncolors", false))
	 {return ((Boolean) Debug.delegate(ba, "getusecolumncolors", null));}
RDebugUtils.currentLine=31653888;
 //BA.debugLineNum = 31653888;BA.debugLine="Public Sub getUseColumnColors As Boolean";
RDebugUtils.currentLine=31653889;
 //BA.debugLineNum = 31653889;BA.debugLine="Return cUseColumnColors";
if (true) return __ref._cusecolumncolors /*boolean*/ ;
RDebugUtils.currentLine=31653890;
 //BA.debugLineNum = 31653890;BA.debugLine="End Sub";
return false;
}
public String  _getvalue(b4a.example.ef.table __ref,int _col,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvalue", false))
	 {return ((String) Debug.delegate(ba, "getvalue", new Object[] {_col,_row}));}
String[] _values = null;
RDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Public Sub GetValue(Col As Int, Row As Int) As Str";
RDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="Return values(Col)";
if (true) return _values[_col];
RDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub GetValues(Row As Int ) As String()";
RDebugUtils.currentLine=25821185;
 //BA.debugLineNum = 25821185;BA.debugLine="Dim rowData() As String  = Data.Get(Row) ' will t";
_rowdata = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Dim tmp(mNumberOfColumns) As String";
_tmp = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_tmp,"");
RDebugUtils.currentLine=25821187;
 //BA.debugLineNum = 25821187;BA.debugLine="For i=0 To mNumberOfColumns-1 ' copy the array";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="tmp(i) =  rowData(i)";
_tmp[_i] = _rowdata[_i];
 }
};
RDebugUtils.currentLine=25821190;
 //BA.debugLineNum = 25821190;BA.debugLine="Return tmp";
if (true) return _tmp;
RDebugUtils.currentLine=25821191;
 //BA.debugLineNum = 25821191;BA.debugLine="End Sub";
return null;
}
public boolean  _getvisible(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "getvisible", null));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Public Sub getVisible As Boolean";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="Return pnlTable.Visible";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="End Sub";
return false;
}
public int  _getwidth(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "getwidth", false))
	 {return ((Integer) Debug.delegate(ba, "getwidth", null));}
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Public Sub getWidth As Int";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Return pnlTable.Width";
if (true) return __ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth();
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Private Sub Header_Click";
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=27983880;
 //BA.debugLineNum = 27983880;BA.debugLine="If Data.Size < 2 Then Return";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()<2) { 
if (true) return "";};
RDebugUtils.currentLine=27983882;
 //BA.debugLineNum = 27983882;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=27983883;
 //BA.debugLineNum = 27983883;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=27983887;
 //BA.debugLineNum = 27983887;BA.debugLine="If cSortColumn Then 'this is set in the designer";
if (__ref._csortcolumn /*boolean*/ ) { 
RDebugUtils.currentLine=27983888;
 //BA.debugLineNum = 27983888;BA.debugLine="Dim dir As Int = 0 ' unsorted";
_dir = (int) (0);
RDebugUtils.currentLine=27983889;
 //BA.debugLineNum = 27983889;BA.debugLine="If (sortedCol = col) Then ' we are sorting the s";
if ((__ref._sortedcol /*int*/ ==_col)) { 
RDebugUtils.currentLine=27983890;
 //BA.debugLineNum = 27983890;BA.debugLine="Select sortingDir";
switch (BA.switchObjectToInt(__ref._sortingdir /*int*/ ,(int) (0),(int) (1),(int) (-1))) {
case 0: {
RDebugUtils.currentLine=27983891;
 //BA.debugLineNum = 27983891;BA.debugLine="Case 0: dir = -1 ' going up";
_dir = (int) (-1);
 break; }
case 1: {
RDebugUtils.currentLine=27983892;
 //BA.debugLineNum = 27983892;BA.debugLine="Case 1: dir = -1";
_dir = (int) (-1);
 break; }
case 2: {
RDebugUtils.currentLine=27983893;
 //BA.debugLineNum = 27983893;BA.debugLine="Case -1: dir = 1";
_dir = (int) (1);
 break; }
}
;
 }else {
RDebugUtils.currentLine=27983896;
 //BA.debugLineNum = 27983896;BA.debugLine="dir = -1 ' start with going up";
_dir = (int) (-1);
 };
RDebugUtils.currentLine=27983899;
 //BA.debugLineNum = 27983899;BA.debugLine="bSorted = SortTable2(col, dir <= 0)";
_bsorted = __ref._sorttable2 /*boolean*/ (null,_col,_dir<=0);
RDebugUtils.currentLine=27983901;
 //BA.debugLineNum = 27983901;BA.debugLine="If bSorted Then";
if (_bsorted) { 
RDebugUtils.currentLine=27983902;
 //BA.debugLineNum = 27983902;BA.debugLine="showHeaderSorting(col, dir)";
__ref._showheadersorting /*String*/ (null,_col,_dir);
RDebugUtils.currentLine=27983903;
 //BA.debugLineNum = 27983903;BA.debugLine="sortedCol = col 'only change if a sort actually";
__ref._sortedcol /*int*/  = _col;
RDebugUtils.currentLine=27983904;
 //BA.debugLineNum = 27983904;BA.debugLine="sortingDir = dir 'only change if a sort actuall";
__ref._sortingdir /*int*/  = _dir;
 }else {
RDebugUtils.currentLine=27983906;
 //BA.debugLineNum = 27983906;BA.debugLine="showHeaderSorting(col, 2) 'no sort done so rect";
__ref._showheadersorting /*String*/ (null,_col,(int) (2));
 };
 };
RDebugUtils.currentLine=27983910;
 //BA.debugLineNum = 27983910;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=27983911;
 //BA.debugLineNum = 27983911;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(_col));
 };
RDebugUtils.currentLine=27983914;
 //BA.debugLineNum = 27983914;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Public Sub SortTable2(Col As Int, bAscending As Bo";
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="Dim arrRow() As String";
_arrrow = new String[(int) (0)];
java.util.Arrays.fill(_arrrow,"");
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="Dim bDoMultiColumnSort As Boolean";
_bdomulticolumnsort = false;
RDebugUtils.currentLine=35520518;
 //BA.debugLineNum = 35520518;BA.debugLine="Dim bValidArrSortIndex As Boolean";
_bvalidarrsortindex = false;
RDebugUtils.currentLine=35520519;
 //BA.debugLineNum = 35520519;BA.debugLine="Dim bSorted As Boolean";
_bsorted = false;
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="If Col <> iPreviousSortColumn Then";
if (_col!=__ref._iprevioussortcolumn /*int*/ ) { 
RDebugUtils.currentLine=35520522;
 //BA.debugLineNum = 35520522;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=35520523;
 //BA.debugLineNum = 35520523;BA.debugLine="arrDataSorted(Col) = False";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.False;
 };
RDebugUtils.currentLine=35520526;
 //BA.debugLineNum = 35520526;BA.debugLine="iUB = Data.Size - 1";
_iub = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=35520533;
 //BA.debugLineNum = 35520533;BA.debugLine="If bDataTempDone = False Then";
if (__ref._bdatatempdone /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=35520534;
 //BA.debugLineNum = 35520534;BA.debugLine="DataTemp.Initialize";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=35520535;
 //BA.debugLineNum = 35520535;BA.debugLine="For i = 0 To iUB";
{
final int step14 = 1;
final int limit14 = _iub;
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=35520536;
 //BA.debugLineNum = 35520536;BA.debugLine="DataTemp.Add(Data.Get(i))";
__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Add(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 }
};
RDebugUtils.currentLine=35520538;
 //BA.debugLineNum = 35520538;BA.debugLine="bDataTempDone = True";
__ref._bdatatempdone /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=35520544;
 //BA.debugLineNum = 35520544;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=35520545;
 //BA.debugLineNum = 35520545;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("435520545","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=35520546;
 //BA.debugLineNum = 35520546;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=35520548;
 //BA.debugLineNum = 35520548;BA.debugLine="Dim arrColLong(Data.Size) As Long";
_arrcollong = new long[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=35520549;
 //BA.debugLineNum = 35520549;BA.debugLine="For i = 0 To iUB";
{
final int step24 = 1;
final int limit24 = _iub;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=35520550;
 //BA.debugLineNum = 35520550;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=35520551;
 //BA.debugLineNum = 35520551;BA.debugLine="Try";
try {RDebugUtils.currentLine=35520552;
 //BA.debugLineNum = 35520552;BA.debugLine="arrColLong(i) = arrRow(Col)";
__ref._arrcollong /*long[]*/ [_i] = (long)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e29) {
			ba.setLastException(e29); };
 }
};
 break; }
case 2: {
RDebugUtils.currentLine=35520558;
 //BA.debugLineNum = 35520558;BA.debugLine="Dim arrColDouble(Data.Size) As Double";
_arrcoldouble = new double[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
;
RDebugUtils.currentLine=35520559;
 //BA.debugLineNum = 35520559;BA.debugLine="For i = 0 To iUB";
{
final int step33 = 1;
final int limit33 = _iub;
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
RDebugUtils.currentLine=35520560;
 //BA.debugLineNum = 35520560;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=35520561;
 //BA.debugLineNum = 35520561;BA.debugLine="Try";
try {RDebugUtils.currentLine=35520562;
 //BA.debugLineNum = 35520562;BA.debugLine="arrColDouble(i) = arrRow(Col)";
__ref._arrcoldouble /*double[]*/ [_i] = (double)(Double.parseDouble(_arrrow[_col]));
 } 
       catch (Exception e38) {
			ba.setLastException(e38); };
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=35520568;
 //BA.debugLineNum = 35520568;BA.debugLine="Dim arrColString(Data.size) As String";
_arrcolstring = new String[__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()];
java.util.Arrays.fill(_arrcolstring,"");
RDebugUtils.currentLine=35520569;
 //BA.debugLineNum = 35520569;BA.debugLine="For i = 0 To iUB";
{
final int step42 = 1;
final int limit42 = _iub;
_i = (int) (0) ;
for (;_i <= limit42 ;_i = _i + step42 ) {
RDebugUtils.currentLine=35520570;
 //BA.debugLineNum = 35520570;BA.debugLine="arrRow = DataTemp.Get(i)";
_arrrow = (String[])(__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=35520571;
 //BA.debugLineNum = 35520571;BA.debugLine="Try";
try {RDebugUtils.currentLine=35520572;
 //BA.debugLineNum = 35520572;BA.debugLine="arrColString(i) = arrRow(Col)";
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
RDebugUtils.currentLine=35520584;
 //BA.debugLineNum = 35520584;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=35520585;
 //BA.debugLineNum = 35520585;BA.debugLine="bDoMultiColumnSort = mMultiColumnSort And bValidA";
_bdomulticolumnsort = __ref._mmulticolumnsort /*boolean*/  && _bvalidarrsortindex && __ref._mnumberofcolumns /*int*/ >1;
RDebugUtils.currentLine=35520590;
 //BA.debugLineNum = 35520590;BA.debugLine="If arrDataSorted(Col) = False Then";
if (__ref._arrdatasorted /*boolean[]*/ [_col]==__c.False) { 
RDebugUtils.currentLine=35520591;
 //BA.debugLineNum = 35520591;BA.debugLine="Log(\"SortTable2, cColumnDataType(\" & Col & \"): \"";
__c.LogImpl("435520591","SortTable2, cColumnDataType("+BA.NumberToString(_col)+"): "+__ref._ccolumndatatype /*String[]*/ [_col],0);
RDebugUtils.currentLine=35520592;
 //BA.debugLineNum = 35520592;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T","N","B")) {
case 0: 
case 1: {
RDebugUtils.currentLine=35520595;
 //BA.debugLineNum = 35520595;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=35520596;
 //BA.debugLineNum = 35520596;BA.debugLine="arrSortIndex = SortOMLongIDX2(arrColLong, arr";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx2 /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=35520598;
 //BA.debugLineNum = 35520598;BA.debugLine="arrSortIndex = SortOMLongIDX(arrColLong, True";
__ref._arrsortindex /*int[]*/  = __ref._sortomlongidx /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 2: {
RDebugUtils.currentLine=35520602;
 //BA.debugLineNum = 35520602;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=35520603;
 //BA.debugLineNum = 35520603;BA.debugLine="arrSortIndex = SortOMDoubleIDX2(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx2 /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=35520605;
 //BA.debugLineNum = 35520605;BA.debugLine="arrSortIndex = SortOMDoubleIDX(arrColDouble,";
__ref._arrsortindex /*int[]*/  = __ref._sortomdoubleidx /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__c.True,(int) (-1),(int) (-1));
 };
 break; }
case 3: {
RDebugUtils.currentLine=35520609;
 //BA.debugLineNum = 35520609;BA.debugLine="If bDoMultiColumnSort Then";
if (_bdomulticolumnsort) { 
RDebugUtils.currentLine=35520610;
 //BA.debugLineNum = 35520610;BA.debugLine="arrSortIndex = SortOMStringIDX2(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx2 /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 }else {
RDebugUtils.currentLine=35520612;
 //BA.debugLineNum = 35520612;BA.debugLine="arrSortIndex = SortOMStringIDX(arrColString,";
__ref._arrsortindex /*int[]*/  = __ref._sortomstringidx /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__c.True,__ref._msortcaseinsensitive /*boolean*/ ,(int) (-1),(int) (-1));
 };
 break; }
case 4: 
case 5: {
RDebugUtils.currentLine=35520616;
 //BA.debugLineNum = 35520616;BA.debugLine="Dim arrSortIndex(1) As Int";
_arrsortindex = new int[(int) (1)];
;
RDebugUtils.currentLine=35520617;
 //BA.debugLineNum = 35520617;BA.debugLine="arrSortIndex(0) = -1";
__ref._arrsortindex /*int[]*/ [(int) (0)] = (int) (-1);
 break; }
}
;
RDebugUtils.currentLine=35520620;
 //BA.debugLineNum = 35520620;BA.debugLine="arrDataSorted(Col) = True";
__ref._arrdatasorted /*boolean[]*/ [_col] = __c.True;
RDebugUtils.currentLine=35520621;
 //BA.debugLineNum = 35520621;BA.debugLine="mapSortingIndexes.Put(Col, arrSortIndex)";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_col),(Object)(__ref._arrsortindex /*int[]*/ ));
 }else {
RDebugUtils.currentLine=35520623;
 //BA.debugLineNum = 35520623;BA.debugLine="arrSortIndex = mapSortingIndexes.Get(Col) 'retri";
__ref._arrsortindex /*int[]*/  = (int[])(__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_col)));
 };
RDebugUtils.currentLine=35520626;
 //BA.debugLineNum = 35520626;BA.debugLine="SelectedRows.Clear";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=35520634;
 //BA.debugLineNum = 35520634;BA.debugLine="bValidArrSortIndex = arrSortIndex.Length > 0 And";
_bvalidarrsortindex = __ref._arrsortindex /*int[]*/ .length>0 && __ref._arrsortindex /*int[]*/ [(int) (0)]>-1;
RDebugUtils.currentLine=35520636;
 //BA.debugLineNum = 35520636;BA.debugLine="If bAscending = False And bValidArrSortIndex Then";
if (_bascending==__c.False && _bvalidarrsortindex) { 
RDebugUtils.currentLine=35520637;
 //BA.debugLineNum = 35520637;BA.debugLine="Select Case cColumnDataType(Col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","L","R","T")) {
case 0: 
case 1: {
RDebugUtils.currentLine=35520639;
 //BA.debugLineNum = 35520639;BA.debugLine="arrSortIndex = ReverseIndexLong(arrColLong, ar";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexlong /*int[]*/ (null,__ref._arrcollong /*long[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 2: {
RDebugUtils.currentLine=35520641;
 //BA.debugLineNum = 35520641;BA.debugLine="arrSortIndex = ReverseIndexDouble(arrColDouble";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexdouble /*int[]*/ (null,__ref._arrcoldouble /*double[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
case 3: {
RDebugUtils.currentLine=35520643;
 //BA.debugLineNum = 35520643;BA.debugLine="arrSortIndex = ReverseIndexString(arrColString";
__ref._arrsortindex /*int[]*/  = __ref._reverseindexstring /*int[]*/ (null,__ref._arrcolstring /*String[]*/ ,__ref._arrsortindex /*int[]*/ ,__c.False);
 break; }
}
;
 };
RDebugUtils.currentLine=35520650;
 //BA.debugLineNum = 35520650;BA.debugLine="If arrSortIndex(0) > -1 Then 'so don't move rows";
if (__ref._arrsortindex /*int[]*/ [(int) (0)]>-1) { 
RDebugUtils.currentLine=35520651;
 //BA.debugLineNum = 35520651;BA.debugLine="For i = 0 To iUB";
{
final int step97 = 1;
final int limit97 = _iub;
_i = (int) (0) ;
for (;_i <= limit97 ;_i = _i + step97 ) {
RDebugUtils.currentLine=35520652;
 //BA.debugLineNum = 35520652;BA.debugLine="Data.Set(i, DataTemp.Get(arrSortIndex(i)))";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,__ref._datatemp /*anywheresoftware.b4a.objects.collections.List*/ .Get(__ref._arrsortindex /*int[]*/ [_i]));
 }
};
RDebugUtils.currentLine=35520654;
 //BA.debugLineNum = 35520654;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
RDebugUtils.currentLine=35520655;
 //BA.debugLineNum = 35520655;BA.debugLine="bSorted = True";
_bsorted = __c.True;
 };
RDebugUtils.currentLine=35520658;
 //BA.debugLineNum = 35520658;BA.debugLine="iPreviousSortColumn = Col";
__ref._iprevioussortcolumn /*int*/  = _col;
RDebugUtils.currentLine=35520659;
 //BA.debugLineNum = 35520659;BA.debugLine="bPreviousSortAscending = bAscending 'not used for";
__ref._bprevioussortascending /*boolean*/  = _bascending;
RDebugUtils.currentLine=35520661;
 //BA.debugLineNum = 35520661;BA.debugLine="Return bSorted";
if (true) return _bsorted;
RDebugUtils.currentLine=35520663;
 //BA.debugLineNum = 35520663;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Public Sub showHeaderSorting(col As Int, dir As In";
RDebugUtils.currentLine=28049411;
 //BA.debugLineNum = 28049411;BA.debugLine="Dim L As Int ' calculate left";
_l = 0;
RDebugUtils.currentLine=28049412;
 //BA.debugLineNum = 28049412;BA.debugLine="Dim t As Int ' calculate top";
_t = 0;
RDebugUtils.currentLine=28049413;
 //BA.debugLineNum = 28049413;BA.debugLine="Dim View As View";
_view = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
RDebugUtils.currentLine=28049414;
 //BA.debugLineNum = 28049414;BA.debugLine="Dim ParentView As Panel";
_parentview = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=28049416;
 //BA.debugLineNum = 28049416;BA.debugLine="pnlSortingView.RemoveView";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=28049418;
 //BA.debugLineNum = 28049418;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=28049419;
 //BA.debugLineNum = 28049419;BA.debugLine="If col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=28049420;
 //BA.debugLineNum = 28049420;BA.debugLine="View = HeaderFirst.GetView(col)";
_view = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=28049421;
 //BA.debugLineNum = 28049421;BA.debugLine="ParentView = HeaderFirst";
_parentview = __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 }else {
RDebugUtils.currentLine=28049423;
 //BA.debugLineNum = 28049423;BA.debugLine="View = Header.GetView(col - mNumberOfFixedColum";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ ));
RDebugUtils.currentLine=28049424;
 //BA.debugLineNum = 28049424;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
 }else {
RDebugUtils.currentLine=28049427;
 //BA.debugLineNum = 28049427;BA.debugLine="View = Header.GetView(col)";
_view = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col);
RDebugUtils.currentLine=28049428;
 //BA.debugLineNum = 28049428;BA.debugLine="ParentView = Header";
_parentview = __ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ ;
 };
RDebugUtils.currentLine=28049431;
 //BA.debugLineNum = 28049431;BA.debugLine="L = View.Left + View.Width - cSortBitmapWidth - 2";
_l = (int) (_view.getLeft()+_view.getWidth()-__ref._csortbitmapwidth /*int*/ -__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=28049433;
 //BA.debugLineNum = 28049433;BA.debugLine="If (dir = 0) Then Return ' remove the view only";
if ((_dir==0)) { 
if (true) return "";};
RDebugUtils.currentLine=28049435;
 //BA.debugLineNum = 28049435;BA.debugLine="Select Case dir";
switch (BA.switchObjectToInt(_dir,(int) (-1),(int) (1),(int) (2))) {
case 0: {
RDebugUtils.currentLine=28049437;
 //BA.debugLineNum = 28049437;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpDes)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=28049438;
 //BA.debugLineNum = 28049438;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 1: {
RDebugUtils.currentLine=28049440;
 //BA.debugLineNum = 28049440;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpAsc)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=28049441;
 //BA.debugLineNum = 28049441;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
case 2: {
RDebugUtils.currentLine=28049443;
 //BA.debugLineNum = 28049443;BA.debugLine="pnlSortingView.SetBackgroundImage(bmpEqual)";
__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .SetBackgroundImageNew((android.graphics.Bitmap)(__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
RDebugUtils.currentLine=28049444;
 //BA.debugLineNum = 28049444;BA.debugLine="t = View.Top + View.Height - cSortBitmapHeight";
_t = (int) (_view.getTop()+_view.getHeight()-__ref._csortbitmapheight /*int*/ -__c.DipToCurrent((int) (2)));
 break; }
}
;
RDebugUtils.currentLine=28049447;
 //BA.debugLineNum = 28049447;BA.debugLine="ParentView.AddView(pnlSortingView, L, t, cSortBit";
_parentview.AddView((android.view.View)(__ref._pnlsortingview /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),_l,_t,__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=28049449;
 //BA.debugLineNum = 28049449;BA.debugLine="End Sub";
return "";
}
public String  _header_longclick(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "header_longclick", false))
	 {return ((String) Debug.delegate(ba, "header_longclick", null));}
anywheresoftware.b4a.objects.LabelWrapper _l = null;
int _col = 0;
RDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Private Sub Header_LongClick";
RDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="Dim L As Label";
_l = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=24969220;
 //BA.debugLineNum = 24969220;BA.debugLine="L = Sender";
_l = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="col = L.Tag";
_col = (int)(BA.ObjectToNumber(_l.getTag()));
RDebugUtils.currentLine=24969222;
 //BA.debugLineNum = 24969222;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderLong";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick")) { 
RDebugUtils.currentLine=24969223;
 //BA.debugLineNum = 24969223;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderLongCli";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderLongClick",(Object)(_col));
 };
RDebugUtils.currentLine=24969225;
 //BA.debugLineNum = 24969225;BA.debugLine="End Sub";
return "";
}
public String  _hidecol(b4a.example.ef.table __ref,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hidecol", false))
	 {return ((String) Debug.delegate(ba, "hidecol", new Object[] {_col}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Public Sub hideCol(col As Int)";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="For i = 0 To SavedWidths.Length - 1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=26673155;
 //BA.debugLineNum = 26673155;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=26673158;
 //BA.debugLineNum = 26673158;BA.debugLine="tmpWidths(col) = 0	'???";
_tmpwidths[_col] = (int) (0);
RDebugUtils.currentLine=26673159;
 //BA.debugLineNum = 26673159;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=26673160;
 //BA.debugLineNum = 26673160;BA.debugLine="End Sub";
return "";
}
public String  _hiderow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "hiderow", false))
	 {return ((String) Debug.delegate(ba, "hiderow", new Object[] {_row}));}
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
int _i = 0;
RDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Private Sub HideRow (Row As Int)";
RDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=24641540;
 //BA.debugLineNum = 24641540;BA.debugLine="If lbls = Null Then";
if (_lbls== null) { 
RDebugUtils.currentLine=24641542;
 //BA.debugLineNum = 24641542;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=24641544;
 //BA.debugLineNum = 24641544;BA.debugLine="For I = 0 To lbls.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_lbls.length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=24641545;
 //BA.debugLineNum = 24641545;BA.debugLine="lbls(I).RemoveView";
_lbls[_i].RemoveView();
 }
};
RDebugUtils.currentLine=24641547;
 //BA.debugLineNum = 24641547;BA.debugLine="visibleRows.Remove(Row)";
__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_row));
RDebugUtils.currentLine=24641548;
 //BA.debugLineNum = 24641548;BA.debugLine="LabelsCache.Add(lbls)";
__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lbls));
RDebugUtils.currentLine=24641549;
 //BA.debugLineNum = 24641549;BA.debugLine="End Sub";
return "";
}
public String  _initfastscroll(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initfastscroll", false))
	 {return ((String) Debug.delegate(ba, "initfastscroll", null));}
RDebugUtils.currentLine=28508160;
 //BA.debugLineNum = 28508160;BA.debugLine="Private Sub InitFastScroll";
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="pnlFastScroll.Top = SV2.Top";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop());
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="pnlFastScroll.Height = SV2.Height";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=28508163;
 //BA.debugLineNum = 28508163;BA.debugLine="FastScrollHeight = pnlFastScroll.Height - pnlFast";
__ref._fastscrollheight /*int*/  = (int) (__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="pnlFastScrollCursor.Top = SV2.VerticalScrollPosit";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()*__ref._fscscale /*double*/ ));
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight - m";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=28508167;
 //BA.debugLineNum = 28508167;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="DrawFastScrollCursor";
__ref._drawfastscrollcursor /*String*/ (null);
RDebugUtils.currentLine=28508170;
 //BA.debugLineNum = 28508170;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.table __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub Initialize (CallBack As Object, EventNa";
RDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="cEventName = EventName";
__ref._ceventname /*String*/  = _eventname;
RDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="cCallBack = CallBack";
__ref._ccallback /*Object*/  = _callback;
RDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="cSortBitmapWidth = 10dip";
__ref._csortbitmapwidth /*int*/  = __c.DipToCurrent((int) (10));
RDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="cSortBitmapColor = Colors.Yellow";
__ref._csortbitmapcolor /*int*/  = __c.Colors.Yellow;
RDebugUtils.currentLine=23396358;
 //BA.debugLineNum = 23396358;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub InitializeSortingBitmaps";
RDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="Private pthAsc, pthDes, pthEqual As Path";
_pthasc = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthdes = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
_pthequal = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.PathWrapper();
RDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="cSortBitmapHeight = cSortBitmapWidth / 2";
__ref._csortbitmapheight /*int*/  = (int) (__ref._csortbitmapwidth /*int*/ /(double)2);
RDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="pnlAsc.Initialize(\"\")";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"");
RDebugUtils.currentLine=23789574;
 //BA.debugLineNum = 23789574;BA.debugLine="pnlTable.AddView(pnlAsc, 0, 0, cSortBitmapWidth,";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__ref._csortbitmapwidth /*int*/ ,__ref._csortbitmapheight /*int*/ );
RDebugUtils.currentLine=23789575;
 //BA.debugLineNum = 23789575;BA.debugLine="cvsAsc.Initialize(pnlAsc)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=23789576;
 //BA.debugLineNum = 23789576;BA.debugLine="pthAsc.Initialize(0, 0)";
_pthasc.Initialize((float) (0),(float) (0));
RDebugUtils.currentLine=23789577;
 //BA.debugLineNum = 23789577;BA.debugLine="pthAsc.LineTo(cSortBitmapWidth, 0)";
_pthasc.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (0));
RDebugUtils.currentLine=23789578;
 //BA.debugLineNum = 23789578;BA.debugLine="pthAsc.LineTo(cSortBitmapHeight, cSortBitmapHeigh";
_pthasc.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=23789579;
 //BA.debugLineNum = 23789579;BA.debugLine="cvsAsc.DrawColor(Colors.Transparent)";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23789580;
 //BA.debugLineNum = 23789580;BA.debugLine="cvsAsc.DrawPath(pthAsc, cSortBitmapColor, True, 1";
__ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthasc.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23789581;
 //BA.debugLineNum = 23789581;BA.debugLine="bmpAsc = cvsAsc.Bitmap";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=23789583;
 //BA.debugLineNum = 23789583;BA.debugLine="cvsDes.Initialize(pnlAsc)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=23789584;
 //BA.debugLineNum = 23789584;BA.debugLine="pthDes.Initialize(0, cSortBitmapHeight)";
_pthdes.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=23789585;
 //BA.debugLineNum = 23789585;BA.debugLine="pthDes.LineTo(cSortBitmapHeight, 0)";
_pthdes.LineTo((float) (__ref._csortbitmapheight /*int*/ ),(float) (0));
RDebugUtils.currentLine=23789586;
 //BA.debugLineNum = 23789586;BA.debugLine="pthDes.LineTo(cSortBitmapWidth, cSortBitmapHeight";
_pthdes.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=23789587;
 //BA.debugLineNum = 23789587;BA.debugLine="cvsDes.DrawColor(Colors.Transparent)";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23789588;
 //BA.debugLineNum = 23789588;BA.debugLine="cvsDes.DrawPath(pthDes, cSortBitmapColor, True, 1";
__ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthdes.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23789589;
 //BA.debugLineNum = 23789589;BA.debugLine="bmpDes = cvsDes.Bitmap";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=23789592;
 //BA.debugLineNum = 23789592;BA.debugLine="cvsEqual.Initialize(pnlAsc)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=23789593;
 //BA.debugLineNum = 23789593;BA.debugLine="pthEqual.Initialize(0, cSortBitmapHeight / 2)";
_pthequal.Initialize((float) (0),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=23789594;
 //BA.debugLineNum = 23789594;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, cSortBitmap";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (__ref._csortbitmapheight /*int*/ ));
RDebugUtils.currentLine=23789595;
 //BA.debugLineNum = 23789595;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth, cSortBitmapHeig";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ ),(float) (__ref._csortbitmapheight /*int*/ /(double)2));
RDebugUtils.currentLine=23789596;
 //BA.debugLineNum = 23789596;BA.debugLine="pthEqual.LineTo(cSortBitmapWidth / 2, 0)";
_pthequal.LineTo((float) (__ref._csortbitmapwidth /*int*/ /(double)2),(float) (0));
RDebugUtils.currentLine=23789597;
 //BA.debugLineNum = 23789597;BA.debugLine="cvsEqual.DrawColor(Colors.Transparent)";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=23789598;
 //BA.debugLineNum = 23789598;BA.debugLine="cvsEqual.DrawPath(pthEqual, cSortBitmapColor, Tru";
__ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawPath((android.graphics.Path)(_pthequal.getObject()),__ref._csortbitmapcolor /*int*/ ,__c.True,(float) (__c.DipToCurrent((int) (1))));
RDebugUtils.currentLine=23789599;
 //BA.debugLineNum = 23789599;BA.debugLine="bmpEqual = cvsEqual.Bitmap";
__ref._bmpequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = __ref._cvsequal /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap();
RDebugUtils.currentLine=23789601;
 //BA.debugLineNum = 23789601;BA.debugLine="pnlAsc.RemoveView";
__ref._pnlasc /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=23789602;
 //BA.debugLineNum = 23789602;BA.debugLine="End Sub";
return "";
}
public String  _initializetable(b4a.example.ef.table __ref,int _numberofcolumns,int _cellalignement,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "initializetable", false))
	 {return ((String) Debug.delegate(ba, "initializetable", new Object[] {_numberofcolumns,_cellalignement,_showstatusline}));}
int _i = 0;
RDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Public Sub InitializeTable (NumberOfColumns As Int";
RDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="setShowStatusLine(showStatusLine)";
__ref._setshowstatusline /*String*/ (null,_showstatusline);
RDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="SelectedRows.Initialize";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="cAlignment = cellAlignement";
__ref._calignment /*int*/  = _cellalignement;
RDebugUtils.currentLine=23724039;
 //BA.debugLineNum = 23724039;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=23724040;
 //BA.debugLineNum = 23724040;BA.debugLine="Data.Initialize	'needed";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=23724042;
 //BA.debugLineNum = 23724042;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23724043;
 //BA.debugLineNum = 23724043;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23724044;
 //BA.debugLineNum = 23724044;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23724045;
 //BA.debugLineNum = 23724045;BA.debugLine="Dim SavedWidths(mNumberOfColumns) As Int";
_savedwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=23724046;
 //BA.debugLineNum = 23724046;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=23724047;
 //BA.debugLineNum = 23724047;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=23724048;
 //BA.debugLineNum = 23724048;BA.debugLine="ColumnWidths(i) = cWidth / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._cwidth /*int*/ /(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=23724049;
 //BA.debugLineNum = 23724049;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=23724050;
 //BA.debugLineNum = 23724050;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=23724051;
 //BA.debugLineNum = 23724051;BA.debugLine="SavedWidths(i) = ColumnWidths(i)";
__ref._savedwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=23724054;
 //BA.debugLineNum = 23724054;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=23724055;
 //BA.debugLineNum = 23724055;BA.debugLine="End Sub";
return "";
}
public String  _setshowstatusline(b4a.example.ef.table __ref,boolean _showstatusline) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setshowstatusline", false))
	 {return ((String) Debug.delegate(ba, "setshowstatusline", new Object[] {_showstatusline}));}
RDebugUtils.currentLine=32636928;
 //BA.debugLineNum = 32636928;BA.debugLine="Public Sub setShowStatusLine(ShowStatusLine As Boo";
RDebugUtils.currentLine=32636929;
 //BA.debugLineNum = 32636929;BA.debugLine="cShowStatusLine = ShowStatusLine";
__ref._cshowstatusline /*boolean*/  = _showstatusline;
RDebugUtils.currentLine=32636930;
 //BA.debugLineNum = 32636930;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=32636931;
 //BA.debugLineNum = 32636931;BA.debugLine="SV2.Height = cHeight - Header.Height - cStatusLi";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cstatuslineheight /*int*/ ));
RDebugUtils.currentLine=32636932;
 //BA.debugLineNum = 32636932;BA.debugLine="lblStatusLine.Visible = True";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=32636934;
 //BA.debugLineNum = 32636934;BA.debugLine="SV2.Height = cHeight - Header.Height";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=32636935;
 //BA.debugLineNum = 32636935;BA.debugLine="lblStatusLine.Visible = False";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
RDebugUtils.currentLine=32636937;
 //BA.debugLineNum = 32636937;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=32636938;
 //BA.debugLineNum = 32636938;BA.debugLine="If mFastScrollFixedLabel = True Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=32636939;
 //BA.debugLineNum = 32636939;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=32636941;
 //BA.debugLineNum = 32636941;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=32636942;
 //BA.debugLineNum = 32636942;BA.debugLine="End Sub";
return "";
}
public String  _svf_scrollchanged(b4a.example.ef.table __ref,int _position) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "svf_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "svf_scrollchanged", new Object[] {_position}));}
RDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Private Sub SVF_ScrollChanged(Position As Int)";
RDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="SVFScrolls = True";
__ref._svfscrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="If SV2Scrolls = False Then";
if (__ref._sv2scrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24182787;
 //BA.debugLineNum = 24182787;BA.debugLine="Scroll(SV2PosX, Position)";
__ref._scroll /*String*/ (null,__ref._sv2posx /*int*/ ,_position);
RDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="SV2.VerticalScrollPosition = Position";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_position);
 };
RDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="SVFScrolls = False";
__ref._svfscrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=24182791;
 //BA.debugLineNum = 24182791;BA.debugLine="End Sub";
return "";
}
public String  _sv2_scrollchanged(b4a.example.ef.table __ref,int _posx,int _posy) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "sv2_scrollchanged", false))
	 {return ((String) Debug.delegate(ba, "sv2_scrollchanged", new Object[] {_posx,_posy}));}
RDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Private Sub SV2_ScrollChanged(PosX As Int, PosY As";
RDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="SV2Scrolls = True";
__ref._sv2scrolls /*boolean*/  = __c.True;
RDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="If SVFScrolls = False Then";
if (__ref._svfscrolls /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="SVF.ScrollToNow(PosY)";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .ScrollToNow(_posy);
RDebugUtils.currentLine=24248324;
 //BA.debugLineNum = 24248324;BA.debugLine="Scroll(PosX, PosY)";
__ref._scroll /*String*/ (null,_posx,_posy);
RDebugUtils.currentLine=24248325;
 //BA.debugLineNum = 24248325;BA.debugLine="SV2PosX = PosX";
__ref._sv2posx /*int*/  = _posx;
 };
RDebugUtils.currentLine=24248328;
 //BA.debugLineNum = 24248328;BA.debugLine="SV2Scrolls = False";
__ref._sv2scrolls /*boolean*/  = __c.False;
RDebugUtils.currentLine=24248329;
 //BA.debugLineNum = 24248329;BA.debugLine="If mFastScroll = True And Data.Size >= mFastScrol";
if (__ref._mfastscroll /*boolean*/ ==__c.True && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>=__ref._mfastscrollminitems /*int*/  && __ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ >__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=24248330;
 //BA.debugLineNum = 24248330;BA.debugLine="FScScale = FastScrollHeight / (SV2.Panel.Height";
__ref._fscscale /*double*/  = __ref._fastscrollheight /*int*/ /(double)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight()-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=24248331;
 //BA.debugLineNum = 24248331;BA.debugLine="pnlFastScroll.Visible = True";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=24248332;
 //BA.debugLineNum = 24248332;BA.debugLine="If mFastScrollShowLabel = True Then";
if (__ref._mfastscrollshowlabel /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=24248333;
 //BA.debugLineNum = 24248333;BA.debugLine="lblFastScroll.Visible = True";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=24248335;
 //BA.debugLineNum = 24248335;BA.debugLine="CalcFastScroll(PosY)";
__ref._calcfastscroll /*String*/ (null,_posy);
RDebugUtils.currentLine=24248336;
 //BA.debugLineNum = 24248336;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=24248338;
 //BA.debugLineNum = 24248338;BA.debugLine="End Sub";
return "";
}
public String  _setstatusline(b4a.example.ef.table __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatusline", false))
	 {return ((String) Debug.delegate(ba, "setstatusline", new Object[] {_text}));}
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Public Sub setStatusLine(Text As String)";
RDebugUtils.currentLine=26804225;
 //BA.debugLineNum = 26804225;BA.debugLine="If (lblStatusLine.IsInitialized) Then lblStatusLi";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized())) { 
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_text));};
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub insertRowAt (Row As Int, Values() As St";
RDebugUtils.currentLine=25886721;
 //BA.debugLineNum = 25886721;BA.debugLine="If (Row < 0) Then Row = 0";
if ((_row<0)) { 
_row = (int) (0);};
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="If (Row > Data.Size) Then";
if ((_row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())) { 
RDebugUtils.currentLine=25886723;
 //BA.debugLineNum = 25886723;BA.debugLine="If cAutomaticWidths = False Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="AddRow(Values)";
__ref._addrow /*String*/ (null,_values);
 }else {
RDebugUtils.currentLine=25886726;
 //BA.debugLineNum = 25886726;BA.debugLine="AddRowAutomaticWidth(Values)";
__ref._addrowautomaticwidth /*String*/ (null,_values);
 };
RDebugUtils.currentLine=25886728;
 //BA.debugLineNum = 25886728;BA.debugLine="Return True";
if (true) return __c.True;
 };
RDebugUtils.currentLine=25886730;
 //BA.debugLineNum = 25886730;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=25886732;
 //BA.debugLineNum = 25886732;BA.debugLine="Dim L As List";
_l = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25886733;
 //BA.debugLineNum = 25886733;BA.debugLine="L.Initialize";
_l.Initialize();
RDebugUtils.currentLine=25886734;
 //BA.debugLineNum = 25886734;BA.debugLine="L.Add(Values)";
_l.Add((Object)(_values));
RDebugUtils.currentLine=25886736;
 //BA.debugLineNum = 25886736;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step14 = 1;
final int limit14 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=25886737;
 //BA.debugLineNum = 25886737;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=25886738;
 //BA.debugLineNum = 25886738;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=25886739;
 //BA.debugLineNum = 25886739;BA.debugLine="If (keepSel >= Row) Then";
if ((_keepsel>=_row)) { 
RDebugUtils.currentLine=25886740;
 //BA.debugLineNum = 25886740;BA.debugLine="SelectedRows.set(i,keepSel+1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel+1));
 };
 }
};
RDebugUtils.currentLine=25886744;
 //BA.debugLineNum = 25886744;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step21 = 1;
final int limit21 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=25886745;
 //BA.debugLineNum = 25886745;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=25886747;
 //BA.debugLineNum = 25886747;BA.debugLine="Data.AddAllAt(Row,L) ' now I can add the row";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .AddAllAt(_row,_l);
RDebugUtils.currentLine=25886748;
 //BA.debugLineNum = 25886748;BA.debugLine="lstRowColorIndexes.InsertAt(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .InsertAt(_row,(Object)(0));
RDebugUtils.currentLine=25886750;
 //BA.debugLineNum = 25886750;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=25886752;
 //BA.debugLineNum = 25886752;BA.debugLine="For i = minVisibleRow To maxVisibleRow";
{
final int step27 = 1;
final int limit27 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=25886753;
 //BA.debugLineNum = 25886753;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=25886756;
 //BA.debugLineNum = 25886756;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=25886757;
 //BA.debugLineNum = 25886757;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=25886758;
 //BA.debugLineNum = 25886758;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=25886759;
 //BA.debugLineNum = 25886759;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=25886760;
 //BA.debugLineNum = 25886760;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=25886762;
 //BA.debugLineNum = 25886762;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=25886763;
 //BA.debugLineNum = 25886763;BA.debugLine="Dim changed = False As Boolean";
_changed = __c.False;
RDebugUtils.currentLine=25886764;
 //BA.debugLineNum = 25886764;BA.debugLine="Dim width As Int";
_width = 0;
RDebugUtils.currentLine=25886765;
 //BA.debugLineNum = 25886765;BA.debugLine="If Data.Size = 1 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==1) { 
RDebugUtils.currentLine=25886766;
 //BA.debugLineNum = 25886766;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step39 = 1;
final int limit39 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit39 ;_i = _i + step39 ) {
RDebugUtils.currentLine=25886767;
 //BA.debugLineNum = 25886767;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=25886768;
 //BA.debugLineNum = 25886768;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=25886770;
 //BA.debugLineNum = 25886770;BA.debugLine="width = cvs.MeasureStringWidth(HeaderNames.Ge";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=25886772;
 //BA.debugLineNum = 25886772;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=25886773;
 //BA.debugLineNum = 25886773;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=25886774;
 //BA.debugLineNum = 25886774;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=25886775;
 //BA.debugLineNum = 25886775;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
 }
};
 };
RDebugUtils.currentLine=25886778;
 //BA.debugLineNum = 25886778;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step51 = 1;
final int limit51 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
RDebugUtils.currentLine=25886779;
 //BA.debugLineNum = 25886779;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=25886780;
 //BA.debugLineNum = 25886780;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=25886782;
 //BA.debugLineNum = 25886782;BA.debugLine="width = cvs.MeasureStringWidth(Values(i), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_i],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_i].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=25886784;
 //BA.debugLineNum = 25886784;BA.debugLine="If ColumnWidths(i) < width Then";
if (__ref._columnwidths /*int[]*/ [_i]<_width) { 
RDebugUtils.currentLine=25886785;
 //BA.debugLineNum = 25886785;BA.debugLine="ColumnWidths(i) = width";
__ref._columnwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=25886786;
 //BA.debugLineNum = 25886786;BA.debugLine="SavedWidths(i) = width";
__ref._savedwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=25886787;
 //BA.debugLineNum = 25886787;BA.debugLine="HeaderWidths(i) = width";
__ref._headerwidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=25886788;
 //BA.debugLineNum = 25886788;BA.debugLine="DataWidths(i) = width";
__ref._datawidths /*int[]*/ [_i] = _width;
RDebugUtils.currentLine=25886789;
 //BA.debugLineNum = 25886789;BA.debugLine="changed = True";
_changed = __c.True;
 };
 }
};
RDebugUtils.currentLine=25886793;
 //BA.debugLineNum = 25886793;BA.debugLine="If changed = True Then";
if (_changed==__c.True) { 
RDebugUtils.currentLine=25886794;
 //BA.debugLineNum = 25886794;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
 };
RDebugUtils.currentLine=25886798;
 //BA.debugLineNum = 25886798;BA.debugLine="Return False";
if (true) return __c.False;
RDebugUtils.currentLine=25886799;
 //BA.debugLineNum = 25886799;BA.debugLine="End Sub";
return false;
}
public String  _ip_click(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "ip_click", false))
	 {return ((String) Debug.delegate(ba, "ip_click", null));}
RDebugUtils.currentLine=26869760;
 //BA.debugLineNum = 26869760;BA.debugLine="Private Sub IP_Click";
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="If SubExists(cCallBack, cEventName & \"_HeaderClic";
if (__c.SubExists(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick")) { 
RDebugUtils.currentLine=26869763;
 //BA.debugLineNum = 26869763;BA.debugLine="CallSub2(cCallBack, cEventName & \"_HeaderClick\",";
__c.CallSubNew2(ba,__ref._ccallback /*Object*/ ,__ref._ceventname /*String*/ +"_HeaderClick",(Object)(-1));
 };
RDebugUtils.currentLine=26869765;
 //BA.debugLineNum = 26869765;BA.debugLine="End Sub";
return "";
}
public boolean  _isrowvisible(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "isrowvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isrowvisible", new Object[] {_row}));}
RDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Private Sub IsRowVisible(Row As Int) As Boolean		'";
RDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="Return Row < (SV2.VerticalScrollPosition + SV2.He";
if (true) return _row<(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)(__ref._crowheight /*int*/ +1) && _row>__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition()/(double)__ref._crowheight /*int*/ ;
RDebugUtils.currentLine=24576003;
 //BA.debugLineNum = 24576003;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25362433;
 //BA.debugLineNum = 25362433;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorow"),(int) (0));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=25362435;
 //BA.debugLineNum = 25362435;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25427969;
 //BA.debugLineNum = 25427969;BA.debugLine="Log(\"You may get this warning:\")";
parent.__c.LogImpl("425427969","You may get this warning:",0);
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="Log(\"Unexpected event (missing RaiseSynchronousEv";
parent.__c.LogImpl("425427970","Unexpected event (missing RaiseSynchronousEvents): sv_scrollchanged",0);
RDebugUtils.currentLine=25427971;
 //BA.debugLineNum = 25427971;BA.debugLine="Log(\"Ignore it, it is NOT harmful !\")";
parent.__c.LogImpl("425427971","Ignore it, it is NOT harmful !",0);
RDebugUtils.currentLine=25427972;
 //BA.debugLineNum = 25427972;BA.debugLine="Dim rc As RowCol";
_rc = new b4a.example.ef.table._rowcol();
RDebugUtils.currentLine=25427974;
 //BA.debugLineNum = 25427974;BA.debugLine="rc.Row = Row";
_rc.Row /*int*/  = _row;
RDebugUtils.currentLine=25427975;
 //BA.debugLineNum = 25427975;BA.debugLine="rc.Col = Col";
_rc.Col /*int*/  = _col;
RDebugUtils.currentLine=25427976;
 //BA.debugLineNum = 25427976;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "table", "jumptorowandselect"),(int) (0));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
RDebugUtils.currentLine=25427977;
 //BA.debugLineNum = 25427977;BA.debugLine="SV2.VerticalScrollPosition = Row * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition((int) (_row*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=25427979;
 //BA.debugLineNum = 25427979;BA.debugLine="SelectRow(rc)";
__ref._selectrow /*String*/ (null,_rc);
RDebugUtils.currentLine=25427981;
 //BA.debugLineNum = 25427981;BA.debugLine="Private i, Left As Int";
_i = 0;
_left = 0;
RDebugUtils.currentLine=25427982;
 //BA.debugLineNum = 25427982;BA.debugLine="If Col > 0 Then";
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
RDebugUtils.currentLine=25427983;
 //BA.debugLineNum = 25427983;BA.debugLine="For i = 0 To Col - 1";
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
RDebugUtils.currentLine=25427984;
 //BA.debugLineNum = 25427984;BA.debugLine="Left = Left + ColumnWidths(i)";
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
RDebugUtils.currentLine=25427987;
 //BA.debugLineNum = 25427987;BA.debugLine="Left = Left - SVF.Width";
_left = (int) (_left-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
RDebugUtils.currentLine=25427988;
 //BA.debugLineNum = 25427988;BA.debugLine="SV2.HorizontalScrollPosition = Left";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHorizontalScrollPosition(_left);
RDebugUtils.currentLine=25427989;
 //BA.debugLineNum = 25427989;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30932992;
 //BA.debugLineNum = 30932992;BA.debugLine="Public Sub LoadSQLiteDB(SQLite As SQL, Query As St";
RDebugUtils.currentLine=30932993;
 //BA.debugLineNum = 30932993;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=30932994;
 //BA.debugLineNum = 30932994;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=30932996;
 //BA.debugLineNum = 30932996;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=30932997;
 //BA.debugLineNum = 30932997;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=30932998;
 //BA.debugLineNum = 30932998;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=30933000;
 //BA.debugLineNum = 30933000;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=30933001;
 //BA.debugLineNum = 30933001;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=30933002;
 //BA.debugLineNum = 30933002;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=30933003;
 //BA.debugLineNum = 30933003;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=30933004;
 //BA.debugLineNum = 30933004;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=30933005;
 //BA.debugLineNum = 30933005;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=30933006;
 //BA.debugLineNum = 30933006;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=30933007;
 //BA.debugLineNum = 30933007;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=30933008;
 //BA.debugLineNum = 30933008;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=30933009;
 //BA.debugLineNum = 30933009;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=30933010;
 //BA.debugLineNum = 30933010;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=30933011;
 //BA.debugLineNum = 30933011;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=30933012;
 //BA.debugLineNum = 30933012;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=30933013;
 //BA.debugLineNum = 30933013;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=30933015;
 //BA.debugLineNum = 30933015;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=30933016;
 //BA.debugLineNum = 30933016;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=30933018;
 //BA.debugLineNum = 30933018;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=30933020;
 //BA.debugLineNum = 30933020;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=30933021;
 //BA.debugLineNum = 30933021;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=30933022;
 //BA.debugLineNum = 30933022;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=30933023;
 //BA.debugLineNum = 30933023;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=30933024;
 //BA.debugLineNum = 30933024;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=30933025;
 //BA.debugLineNum = 30933025;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=30933026;
 //BA.debugLineNum = 30933026;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].DEFAULT,__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=30933028;
 //BA.debugLineNum = 30933028;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=30933032;
 //BA.debugLineNum = 30933032;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=30933036;
 //BA.debugLineNum = 30933036;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=30933037;
 //BA.debugLineNum = 30933037;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=30933041;
 //BA.debugLineNum = 30933041;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=30933043;
 //BA.debugLineNum = 30933043;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=30933044;
 //BA.debugLineNum = 30933044;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=30933045;
 //BA.debugLineNum = 30933045;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=30933046;
 //BA.debugLineNum = 30933046;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=30933047;
 //BA.debugLineNum = 30933047;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=30933048;
 //BA.debugLineNum = 30933048;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=30933049;
 //BA.debugLineNum = 30933049;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=30933051;
 //BA.debugLineNum = 30933051;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=30933054;
 //BA.debugLineNum = 30933054;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=30933057;
 //BA.debugLineNum = 30933057;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=30933060;
 //BA.debugLineNum = 30933060;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Public Sub SetHeader(Values() As String)";
RDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=24838148;
 //BA.debugLineNum = 24838148;BA.debugLine="HeaderNames.Initialize2(Values)";
__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Initialize2(anywheresoftware.b4a.keywords.Common.ArrayToList(_values));
RDebugUtils.currentLine=24838150;
 //BA.debugLineNum = 24838150;BA.debugLine="Dim Left = 0 As Int";
_left = (int) (0);
RDebugUtils.currentLine=24838152;
 //BA.debugLineNum = 24838152;BA.debugLine="Dim Change = 0 As Int";
_change = (int) (0);
RDebugUtils.currentLine=24838153;
 //BA.debugLineNum = 24838153;BA.debugLine="Dim w As Int";
_w = 0;
RDebugUtils.currentLine=24838154;
 //BA.debugLineNum = 24838154;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=24838155;
 //BA.debugLineNum = 24838155;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=24838156;
 //BA.debugLineNum = 24838156;BA.debugLine="lbl.Initialize(\"header\")";
_lbl.Initialize(ba,"header");
RDebugUtils.currentLine=24838157;
 //BA.debugLineNum = 24838157;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24838158;
 //BA.debugLineNum = 24838158;BA.debugLine="lbl.Gravity = cHeaderAlignment";
_lbl.setGravity(__ref._cheaderalignment /*int*/ );
 }else {
RDebugUtils.currentLine=24838160;
 //BA.debugLineNum = 24838160;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=24838163;
 //BA.debugLineNum = 24838163;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=24838164;
 //BA.debugLineNum = 24838164;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }else {
RDebugUtils.currentLine=24838166;
 //BA.debugLineNum = 24838166;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 };
RDebugUtils.currentLine=24838169;
 //BA.debugLineNum = 24838169;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=24838170;
 //BA.debugLineNum = 24838170;BA.debugLine="SetPadding(lbl, 4dip, 2dip, 4dip, 2dip)";
__ref._setpadding /*String*/ (null,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_lbl.getObject())),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (4)),__c.DipToCurrent((int) (2)));
RDebugUtils.currentLine=24838172;
 //BA.debugLineNum = 24838172;BA.debugLine="If cUseColumnColors = False Or cHeaderTextColors";
if (__ref._cusecolumncolors /*boolean*/ ==__c.False || __ref._cheadertextcolors /*int[]*/ .length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=24838173;
 //BA.debugLineNum = 24838173;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
RDebugUtils.currentLine=24838174;
 //BA.debugLineNum = 24838174;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }else {
RDebugUtils.currentLine=24838176;
 //BA.debugLineNum = 24838176;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
RDebugUtils.currentLine=24838177;
 //BA.debugLineNum = 24838177;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 };
RDebugUtils.currentLine=24838180;
 //BA.debugLineNum = 24838180;BA.debugLine="lbl.Text = Values(col)";
_lbl.setText(BA.ObjectToCharSequence(_values[_col]));
RDebugUtils.currentLine=24838181;
 //BA.debugLineNum = 24838181;BA.debugLine="lbl.Tag = col";
_lbl.setTag((Object)(_col));
RDebugUtils.currentLine=24838183;
 //BA.debugLineNum = 24838183;BA.debugLine="w = Max(0, ColumnWidths(col) - cLineWidth)		' ne";
_w = (int) (__c.Max(0,__ref._columnwidths /*int[]*/ [_col]-__ref._clinewidth /*int*/ ));
RDebugUtils.currentLine=24838185;
 //BA.debugLineNum = 24838185;BA.debugLine="If mNumberOfFixedColumns > 0 And col < mNumberOf";
if (__ref._mnumberoffixedcolumns /*int*/ >0 && _col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=24838186;
 //BA.debugLineNum = 24838186;BA.debugLine="HeaderFirst.AddView(lbl, Left, 0, w, cHeaderHei";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 }else {
RDebugUtils.currentLine=24838189;
 //BA.debugLineNum = 24838189;BA.debugLine="If col = mNumberOfFixedColumns Then";
if (_col==__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=24838190;
 //BA.debugLineNum = 24838190;BA.debugLine="Left = 0";
_left = (int) (0);
 };
RDebugUtils.currentLine=24838192;
 //BA.debugLineNum = 24838192;BA.debugLine="Header.AddView(lbl, Left, 0, w, cHeaderHeight)";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(_lbl.getObject()),_left,(int) (0),_w,__ref._cheaderheight /*int*/ );
 };
RDebugUtils.currentLine=24838196;
 //BA.debugLineNum = 24838196;BA.debugLine="If cAutomaticWidths = True Then";
if (__ref._cautomaticwidths /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=24838197;
 //BA.debugLineNum = 24838197;BA.debugLine="If Values(col).Contains(CRLF) Then";
if (_values[_col].contains(__c.CRLF)) { 
RDebugUtils.currentLine=24838198;
 //BA.debugLineNum = 24838198;BA.debugLine="Dim str() As String";
_str = new String[(int) (0)];
java.util.Arrays.fill(_str,"");
RDebugUtils.currentLine=24838199;
 //BA.debugLineNum = 24838199;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=24838200;
 //BA.debugLineNum = 24838200;BA.debugLine="str = Regex.Split(CRLF, Values(col))";
_str = __c.Regex.Split(__c.CRLF,_values[_col]);
RDebugUtils.currentLine=24838201;
 //BA.debugLineNum = 24838201;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(str";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[(int) (0)],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
RDebugUtils.currentLine=24838202;
 //BA.debugLineNum = 24838202;BA.debugLine="For j = 1 To str.Length - 1";
{
final int step46 = 1;
final int limit46 = (int) (_str.length-1);
_j = (int) (1) ;
for (;_j <= limit46 ;_j = _j + step46 ) {
RDebugUtils.currentLine=24838203;
 //BA.debugLineNum = 24838203;BA.debugLine="HeaderWidths(col) = Max(HeaderWidths(col),cvs";
__ref._headerwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str[_j],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=24838206;
 //BA.debugLineNum = 24838206;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Val";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_values[_col],_lbl.getTypeface(),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=24838208;
 //BA.debugLineNum = 24838208;BA.debugLine="If HeaderWidths(col) > ColumnWidths(col) Then";
if (__ref._headerwidths /*int[]*/ [_col]>__ref._columnwidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=24838209;
 //BA.debugLineNum = 24838209;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=24838210;
 //BA.debugLineNum = 24838210;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Col";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._columnwidths /*int[]*/ [_col]));
 }else 
{RDebugUtils.currentLine=24838211;
 //BA.debugLineNum = 24838211;BA.debugLine="Else If ColumnWidths(col) > HeaderWidths(col) A";
if (__ref._columnwidths /*int[]*/ [_col]>__ref._headerwidths /*int[]*/ [_col] && __ref._columnwidths /*int[]*/ [_col]>__ref._datawidths /*int[]*/ [_col]) { 
RDebugUtils.currentLine=24838212;
 //BA.debugLineNum = 24838212;BA.debugLine="Change = 1";
_change = (int) (1);
RDebugUtils.currentLine=24838213;
 //BA.debugLineNum = 24838213;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Dat";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }}
;
 };
RDebugUtils.currentLine=24838216;
 //BA.debugLineNum = 24838216;BA.debugLine="Left = Left + ColumnWidths(col)";
_left = (int) (_left+__ref._columnwidths /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=24838219;
 //BA.debugLineNum = 24838219;BA.debugLine="If Change = 1 Then";
if (_change==1) { 
RDebugUtils.currentLine=24838220;
 //BA.debugLineNum = 24838220;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
 };
RDebugUtils.currentLine=24838222;
 //BA.debugLineNum = 24838222;BA.debugLine="Header.Left = - SV2.HorizontalScrollPosition + mF";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition()+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=24838223;
 //BA.debugLineNum = 24838223;BA.debugLine="End Sub";
return "";
}
public String  _setarrcolumnssorted(b4a.example.ef.table __ref,int _icolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setarrcolumnssorted", false))
	 {return ((String) Debug.delegate(ba, "setarrcolumnssorted", new Object[] {_icolumns}));}
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Public Sub SetArrColumnsSorted(iColumns As Int)";
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="sortingDir = 0 ' -1, 0, 1 as asc, unsorted, desc";
__ref._sortingdir /*int*/  = (int) (0);
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="sortedCol = -1";
__ref._sortedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=35586053;
 //BA.debugLineNum = 35586053;BA.debugLine="Dim arrDataSorted(iColumns) As Boolean";
_arrdatasorted = new boolean[_icolumns];
;
RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="bDataTempDone = False";
__ref._bdatatempdone /*boolean*/  = __c.False;
RDebugUtils.currentLine=35586055;
 //BA.debugLineNum = 35586055;BA.debugLine="Dim arrSortIndex() As Int";
_arrsortindex = new int[(int) (0)];
;
RDebugUtils.currentLine=35586056;
 //BA.debugLineNum = 35586056;BA.debugLine="mapSortingIndexes.Initialize";
__ref._mapsortingindexes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=35586058;
 //BA.debugLineNum = 35586058;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=30998528;
 //BA.debugLineNum = 30998528;BA.debugLine="Public Sub LoadSQLiteDB2(SQLite As SQL, Query As S";
RDebugUtils.currentLine=30998529;
 //BA.debugLineNum = 30998529;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=30998530;
 //BA.debugLineNum = 30998530;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=30998532;
 //BA.debugLineNum = 30998532;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=30998533;
 //BA.debugLineNum = 30998533;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=30998534;
 //BA.debugLineNum = 30998534;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=30998536;
 //BA.debugLineNum = 30998536;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=30998537;
 //BA.debugLineNum = 30998537;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=30998538;
 //BA.debugLineNum = 30998538;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=30998539;
 //BA.debugLineNum = 30998539;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=30998540;
 //BA.debugLineNum = 30998540;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=30998541;
 //BA.debugLineNum = 30998541;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=30998542;
 //BA.debugLineNum = 30998542;BA.debugLine="Dim ii As Long";
_ii = 0L;
RDebugUtils.currentLine=30998543;
 //BA.debugLineNum = 30998543;BA.debugLine="Dim dd As Double";
_dd = 0;
RDebugUtils.currentLine=30998544;
 //BA.debugLineNum = 30998544;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=30998545;
 //BA.debugLineNum = 30998545;BA.debugLine="cColumnDataType = ColumnDataTypes";
__ref._ccolumndatatype /*String[]*/  = _columndatatypes;
RDebugUtils.currentLine=30998546;
 //BA.debugLineNum = 30998546;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=30998547;
 //BA.debugLineNum = 30998547;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=30998548;
 //BA.debugLineNum = 30998548;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=30998549;
 //BA.debugLineNum = 30998549;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=30998550;
 //BA.debugLineNum = 30998550;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=30998551;
 //BA.debugLineNum = 30998551;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=30998553;
 //BA.debugLineNum = 30998553;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=30998554;
 //BA.debugLineNum = 30998554;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=30998556;
 //BA.debugLineNum = 30998556;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=30998558;
 //BA.debugLineNum = 30998558;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=30998559;
 //BA.debugLineNum = 30998559;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step29 = 1;
final int limit29 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit29 ;_row = _row + step29 ) {
RDebugUtils.currentLine=30998560;
 //BA.debugLineNum = 30998560;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=30998561;
 //BA.debugLineNum = 30998561;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=30998562;
 //BA.debugLineNum = 30998562;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=30998563;
 //BA.debugLineNum = 30998563;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R")) {
case 0: {
RDebugUtils.currentLine=30998565;
 //BA.debugLineNum = 30998565;BA.debugLine="ii = Curs.GetInt2(col)";
_ii = (long) (_curs.GetInt2(_col));
RDebugUtils.currentLine=30998566;
 //BA.debugLineNum = 30998566;BA.debugLine="str = ii";
_str = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=30998568;
 //BA.debugLineNum = 30998568;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=30998569;
 //BA.debugLineNum = 30998569;BA.debugLine="str = dd";
_str = BA.NumberToString(_dd);
 break; }
}
;
 }else {
RDebugUtils.currentLine=30998572;
 //BA.debugLineNum = 30998572;BA.debugLine="str = \"\"";
_str = "";
 };
RDebugUtils.currentLine=30998574;
 //BA.debugLineNum = 30998574;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=30998575;
 //BA.debugLineNum = 30998575;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=30998577;
 //BA.debugLineNum = 30998577;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=30998580;
 //BA.debugLineNum = 30998580;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=30998584;
 //BA.debugLineNum = 30998584;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=30998585;
 //BA.debugLineNum = 30998585;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=30998589;
 //BA.debugLineNum = 30998589;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=30998591;
 //BA.debugLineNum = 30998591;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step56 = 1;
final int limit56 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit56 ;_row = _row + step56 ) {
RDebugUtils.currentLine=30998592;
 //BA.debugLineNum = 30998592;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=30998593;
 //BA.debugLineNum = 30998593;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=30998594;
 //BA.debugLineNum = 30998594;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=30998595;
 //BA.debugLineNum = 30998595;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=30998596;
 //BA.debugLineNum = 30998596;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=30998597;
 //BA.debugLineNum = 30998597;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 }else {
RDebugUtils.currentLine=30998599;
 //BA.debugLineNum = 30998599;BA.debugLine="Select cColumnDataType(col)";
switch (BA.switchObjectToInt(__ref._ccolumndatatype /*String[]*/ [_col],"I","R","T")) {
case 0: {
RDebugUtils.currentLine=30998601;
 //BA.debugLineNum = 30998601;BA.debugLine="ii = Curs.GetLong2(col)";
_ii = _curs.GetLong2(_col);
RDebugUtils.currentLine=30998602;
 //BA.debugLineNum = 30998602;BA.debugLine="R(col) = ii";
_r[_col] = BA.NumberToString(_ii);
 break; }
case 1: {
RDebugUtils.currentLine=30998604;
 //BA.debugLineNum = 30998604;BA.debugLine="dd = Curs.GetDouble2(col)";
_dd = _curs.GetDouble2(_col);
RDebugUtils.currentLine=30998605;
 //BA.debugLineNum = 30998605;BA.debugLine="R(col) = dd";
_r[_col] = BA.NumberToString(_dd);
 break; }
case 2: {
RDebugUtils.currentLine=30998607;
 //BA.debugLineNum = 30998607;BA.debugLine="R(col) = Curs.GetString2(col)";
_r[_col] = _curs.GetString2(_col);
 break; }
default: {
RDebugUtils.currentLine=30998609;
 //BA.debugLineNum = 30998609;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 break; }
}
;
 };
 }
};
RDebugUtils.currentLine=30998613;
 //BA.debugLineNum = 30998613;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=30998616;
 //BA.debugLineNum = 30998616;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=30998617;
 //BA.debugLineNum = 30998617;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31064064;
 //BA.debugLineNum = 31064064;BA.debugLine="Public Sub LoadSQLiteDB3(SQLite As SQL, Query As S";
RDebugUtils.currentLine=31064065;
 //BA.debugLineNum = 31064065;BA.debugLine="Dim Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=31064066;
 //BA.debugLineNum = 31064066;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=31064068;
 //BA.debugLineNum = 31064068;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=31064069;
 //BA.debugLineNum = 31064069;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=31064070;
 //BA.debugLineNum = 31064070;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=31064072;
 //BA.debugLineNum = 31064072;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=31064073;
 //BA.debugLineNum = 31064073;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31064074;
 //BA.debugLineNum = 31064074;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31064075;
 //BA.debugLineNum = 31064075;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31064076;
 //BA.debugLineNum = 31064076;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=31064077;
 //BA.debugLineNum = 31064077;BA.debugLine="Dim col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=31064078;
 //BA.debugLineNum = 31064078;BA.debugLine="Dim str As String";
_str = "";
RDebugUtils.currentLine=31064079;
 //BA.debugLineNum = 31064079;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step13 = 1;
final int limit13 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit13 ;_col = _col + step13 ) {
RDebugUtils.currentLine=31064080;
 //BA.debugLineNum = 31064080;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=31064081;
 //BA.debugLineNum = 31064081;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=31064082;
 //BA.debugLineNum = 31064082;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=31064083;
 //BA.debugLineNum = 31064083;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31064084;
 //BA.debugLineNum = 31064084;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31064085;
 //BA.debugLineNum = 31064085;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=31064087;
 //BA.debugLineNum = 31064087;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=31064088;
 //BA.debugLineNum = 31064088;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=31064090;
 //BA.debugLineNum = 31064090;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=31064092;
 //BA.debugLineNum = 31064092;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=31064093;
 //BA.debugLineNum = 31064093;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=31064094;
 //BA.debugLineNum = 31064094;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=31064095;
 //BA.debugLineNum = 31064095;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=31064096;
 //BA.debugLineNum = 31064096;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=31064097;
 //BA.debugLineNum = 31064097;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=31064098;
 //BA.debugLineNum = 31064098;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=31064100;
 //BA.debugLineNum = 31064100;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.M";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 };
 }
};
RDebugUtils.currentLine=31064104;
 //BA.debugLineNum = 31064104;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=31064108;
 //BA.debugLineNum = 31064108;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=31064109;
 //BA.debugLineNum = 31064109;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=31064113;
 //BA.debugLineNum = 31064113;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=31064115;
 //BA.debugLineNum = 31064115;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step44 = 1;
final int limit44 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit44 ;_row = _row + step44 ) {
RDebugUtils.currentLine=31064116;
 //BA.debugLineNum = 31064116;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=31064117;
 //BA.debugLineNum = 31064117;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step46 = 1;
final int limit46 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit46 ;_col = _col + step46 ) {
RDebugUtils.currentLine=31064118;
 //BA.debugLineNum = 31064118;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=31064119;
 //BA.debugLineNum = 31064119;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=31064120;
 //BA.debugLineNum = 31064120;BA.debugLine="If str <> Null Then";
if (_str!= null) { 
RDebugUtils.currentLine=31064121;
 //BA.debugLineNum = 31064121;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }else {
RDebugUtils.currentLine=31064123;
 //BA.debugLineNum = 31064123;BA.debugLine="R(col) = \"\"";
_r[_col] = "";
 };
 }
};
RDebugUtils.currentLine=31064126;
 //BA.debugLineNum = 31064126;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=31064129;
 //BA.debugLineNum = 31064129;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=31064130;
 //BA.debugLineNum = 31064130;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31129600;
 //BA.debugLineNum = 31129600;BA.debugLine="Public Sub LoadSQLiteDB4(SQLite As SQL, Query As S";
RDebugUtils.currentLine=31129601;
 //BA.debugLineNum = 31129601;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=31129603;
 //BA.debugLineNum = 31129603;BA.debugLine="Curs = SQLite.ExecQuery(Query)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery(_query)));
RDebugUtils.currentLine=31129605;
 //BA.debugLineNum = 31129605;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=31129606;
 //BA.debugLineNum = 31129606;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=31129607;
 //BA.debugLineNum = 31129607;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=31129609;
 //BA.debugLineNum = 31129609;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=31129610;
 //BA.debugLineNum = 31129610;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31129611;
 //BA.debugLineNum = 31129611;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31129612;
 //BA.debugLineNum = 31129612;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31129613;
 //BA.debugLineNum = 31129613;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=31129614;
 //BA.debugLineNum = 31129614;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=31129615;
 //BA.debugLineNum = 31129615;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=31129617;
 //BA.debugLineNum = 31129617;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=31129619;
 //BA.debugLineNum = 31129619;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=31129620;
 //BA.debugLineNum = 31129620;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=31129621;
 //BA.debugLineNum = 31129621;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=31129622;
 //BA.debugLineNum = 31129622;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31129623;
 //BA.debugLineNum = 31129623;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31129624;
 //BA.debugLineNum = 31129624;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=31129626;
 //BA.debugLineNum = 31129626;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=31129627;
 //BA.debugLineNum = 31129627;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=31129629;
 //BA.debugLineNum = 31129629;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=31129631;
 //BA.debugLineNum = 31129631;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=31129632;
 //BA.debugLineNum = 31129632;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=31129633;
 //BA.debugLineNum = 31129633;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=31129634;
 //BA.debugLineNum = 31129634;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=31129635;
 //BA.debugLineNum = 31129635;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=31129636;
 //BA.debugLineNum = 31129636;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=31129637;
 //BA.debugLineNum = 31129637;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=31129638;
 //BA.debugLineNum = 31129638;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=31129639;
 //BA.debugLineNum = 31129639;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=31129641;
 //BA.debugLineNum = 31129641;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=31129642;
 //BA.debugLineNum = 31129642;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=31129644;
 //BA.debugLineNum = 31129644;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=31129647;
 //BA.debugLineNum = 31129647;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=31129651;
 //BA.debugLineNum = 31129651;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=31129652;
 //BA.debugLineNum = 31129652;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=31129656;
 //BA.debugLineNum = 31129656;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=31129658;
 //BA.debugLineNum = 31129658;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=31129659;
 //BA.debugLineNum = 31129659;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=31129660;
 //BA.debugLineNum = 31129660;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=31129661;
 //BA.debugLineNum = 31129661;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=31129662;
 //BA.debugLineNum = 31129662;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=31129663;
 //BA.debugLineNum = 31129663;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=31129664;
 //BA.debugLineNum = 31129664;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=31129665;
 //BA.debugLineNum = 31129665;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=31129666;
 //BA.debugLineNum = 31129666;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=31129667;
 //BA.debugLineNum = 31129667;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=31129669;
 //BA.debugLineNum = 31129669;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=31129671;
 //BA.debugLineNum = 31129671;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=31129674;
 //BA.debugLineNum = 31129674;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=31129675;
 //BA.debugLineNum = 31129675;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31195136;
 //BA.debugLineNum = 31195136;BA.debugLine="Public Sub LoadSQLiteDB5(SQLite As SQL, Query As S";
RDebugUtils.currentLine=31195137;
 //BA.debugLineNum = 31195137;BA.debugLine="Private Curs As Cursor";
_curs = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=31195139;
 //BA.debugLineNum = 31195139;BA.debugLine="Curs = SQLite.ExecQuery2(Query, Values)";
_curs = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_sqlite.ExecQuery2(_query,_values)));
RDebugUtils.currentLine=31195141;
 //BA.debugLineNum = 31195141;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=31195142;
 //BA.debugLineNum = 31195142;BA.debugLine="mNumberOfColumns = Curs.ColumnCount";
__ref._mnumberofcolumns /*int*/  = _curs.getColumnCount();
RDebugUtils.currentLine=31195143;
 //BA.debugLineNum = 31195143;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=31195145;
 //BA.debugLineNum = 31195145;BA.debugLine="Dim Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=31195146;
 //BA.debugLineNum = 31195146;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31195147;
 //BA.debugLineNum = 31195147;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31195148;
 //BA.debugLineNum = 31195148;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31195149;
 //BA.debugLineNum = 31195149;BA.debugLine="Private col, row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=31195150;
 //BA.debugLineNum = 31195150;BA.debugLine="Private str As String";
_str = "";
RDebugUtils.currentLine=31195151;
 //BA.debugLineNum = 31195151;BA.debugLine="Private dVal As Double";
_dval = 0;
RDebugUtils.currentLine=31195153;
 //BA.debugLineNum = 31195153;BA.debugLine="cColumnDataType = CheckColumnDataTypes(Curs)";
__ref._ccolumndatatype /*String[]*/  = __ref._checkcolumndatatypes /*String[]*/ (null,_curs);
RDebugUtils.currentLine=31195155;
 //BA.debugLineNum = 31195155;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=31195156;
 //BA.debugLineNum = 31195156;BA.debugLine="Headers(col) = Curs.GetColumnName(col)";
_headers[_col] = _curs.GetColumnName(_col);
RDebugUtils.currentLine=31195157;
 //BA.debugLineNum = 31195157;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=31195158;
 //BA.debugLineNum = 31195158;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31195159;
 //BA.debugLineNum = 31195159;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=31195160;
 //BA.debugLineNum = 31195160;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }else {
RDebugUtils.currentLine=31195162;
 //BA.debugLineNum = 31195162;BA.debugLine="If HeaderMultiTypeFace = True Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=31195163;
 //BA.debugLineNum = 31195163;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=31195165;
 //BA.debugLineNum = 31195165;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(Hea";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_headers[_col],(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=31195167;
 //BA.debugLineNum = 31195167;BA.debugLine="DataWidths(col) = 0";
__ref._datawidths /*int[]*/ [_col] = (int) (0);
RDebugUtils.currentLine=31195168;
 //BA.debugLineNum = 31195168;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step27 = 1;
final int limit27 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit27 ;_row = _row + step27 ) {
RDebugUtils.currentLine=31195169;
 //BA.debugLineNum = 31195169;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=31195170;
 //BA.debugLineNum = 31195170;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=31195171;
 //BA.debugLineNum = 31195171;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=31195172;
 //BA.debugLineNum = 31195172;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=31195173;
 //BA.debugLineNum = 31195173;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=31195174;
 //BA.debugLineNum = 31195174;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=31195175;
 //BA.debugLineNum = 31195175;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=31195177;
 //BA.debugLineNum = 31195177;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=31195178;
 //BA.debugLineNum = 31195178;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }else {
RDebugUtils.currentLine=31195180;
 //BA.debugLineNum = 31195180;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_str,(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 };
 }
};
RDebugUtils.currentLine=31195183;
 //BA.debugLineNum = 31195183;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 };
 }
};
RDebugUtils.currentLine=31195187;
 //BA.debugLineNum = 31195187;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=31195188;
 //BA.debugLineNum = 31195188;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=31195192;
 //BA.debugLineNum = 31195192;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=31195194;
 //BA.debugLineNum = 31195194;BA.debugLine="For row = 0 To Curs.RowCount - 1";
{
final int step48 = 1;
final int limit48 = (int) (_curs.getRowCount()-1);
_row = (int) (0) ;
for (;_row <= limit48 ;_row = _row + step48 ) {
RDebugUtils.currentLine=31195195;
 //BA.debugLineNum = 31195195;BA.debugLine="Dim R(mNumberOfColumns), str As String";
_r = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_r,"");
_str = "";
RDebugUtils.currentLine=31195196;
 //BA.debugLineNum = 31195196;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=31195197;
 //BA.debugLineNum = 31195197;BA.debugLine="Curs.Position = row";
_curs.setPosition(_row);
RDebugUtils.currentLine=31195198;
 //BA.debugLineNum = 31195198;BA.debugLine="str = Curs.GetString2(col)";
_str = _curs.GetString2(_col);
RDebugUtils.currentLine=31195199;
 //BA.debugLineNum = 31195199;BA.debugLine="If str = Null Then";
if (_str== null) { 
RDebugUtils.currentLine=31195200;
 //BA.debugLineNum = 31195200;BA.debugLine="str = \"\"";
_str = "";
 }else 
{RDebugUtils.currentLine=31195201;
 //BA.debugLineNum = 31195201;BA.debugLine="Else If IsNumber(str) Then";
if (__c.IsNumber(_str)) { 
RDebugUtils.currentLine=31195202;
 //BA.debugLineNum = 31195202;BA.debugLine="dVal = Curs.GetDouble2(col)";
_dval = _curs.GetDouble2(_col);
RDebugUtils.currentLine=31195203;
 //BA.debugLineNum = 31195203;BA.debugLine="str = dVal";
_str = BA.NumberToString(_dval);
 }}
;
RDebugUtils.currentLine=31195205;
 //BA.debugLineNum = 31195205;BA.debugLine="R(col) = str";
_r[_col] = _str;
 }
};
RDebugUtils.currentLine=31195207;
 //BA.debugLineNum = 31195207;BA.debugLine="AddRow(R)";
__ref._addrow /*String*/ (null,_r);
 }
};
RDebugUtils.currentLine=31195210;
 //BA.debugLineNum = 31195210;BA.debugLine="Curs.Close";
_curs.Close();
RDebugUtils.currentLine=31195211;
 //BA.debugLineNum = 31195211;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Public Sub LoadTableFromCSV(Dir As String, Filenam";
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="Dim h() As String";
_h = new String[(int) (0)];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=25493509;
 //BA.debugLineNum = 25493509;BA.debugLine="cAutomaticWidths = False";
__ref._cautomaticwidths /*boolean*/  = __c.False;
RDebugUtils.currentLine=25493511;
 //BA.debugLineNum = 25493511;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=25493512;
 //BA.debugLineNum = 25493512;BA.debugLine="Dim headers As List";
_headers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25493513;
 //BA.debugLineNum = 25493513;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, \",\"";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(","),_headers);
RDebugUtils.currentLine=25493514;
 //BA.debugLineNum = 25493514;BA.debugLine="Dim h(headers.Size) As String";
_h = new String[_headers.getSize()];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=25493515;
 //BA.debugLineNum = 25493515;BA.debugLine="For i = 0 To headers.Size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_headers.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=25493516;
 //BA.debugLineNum = 25493516;BA.debugLine="h(i) = headers.Get(i)";
_h[_i] = BA.ObjectToString(_headers.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=25493519;
 //BA.debugLineNum = 25493519;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, \",\")";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(","));
RDebugUtils.currentLine=25493520;
 //BA.debugLineNum = 25493520;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=25493521;
 //BA.debugLineNum = 25493521;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=25493522;
 //BA.debugLineNum = 25493522;BA.debugLine="Dim h(firstRow.Length) As String";
_h = new String[_firstrow.length];
java.util.Arrays.fill(_h,"");
RDebugUtils.currentLine=25493523;
 //BA.debugLineNum = 25493523;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step16 = 1;
final int limit16 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=25493524;
 //BA.debugLineNum = 25493524;BA.debugLine="h(i) = \"Col\" & (i + 1)";
_h[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=25493527;
 //BA.debugLineNum = 25493527;BA.debugLine="innerClearAll(h.Length, True)";
__ref._innerclearall /*String*/ (null,_h.length,__c.True);
RDebugUtils.currentLine=25493528;
 //BA.debugLineNum = 25493528;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=25493529;
 //BA.debugLineNum = 25493529;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=25493530;
 //BA.debugLineNum = 25493530;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=25493531;
 //BA.debugLineNum = 25493531;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=25493532;
 //BA.debugLineNum = 25493532;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=25493533;
 //BA.debugLineNum = 25493533;BA.debugLine="cColumnDataType(i) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_i] = "T";
RDebugUtils.currentLine=25493534;
 //BA.debugLineNum = 25493534;BA.debugLine="ColumnWidths(i) = SV2.Width / mNumberOfColumns";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=25493535;
 //BA.debugLineNum = 25493535;BA.debugLine="HeaderWidths(i) = ColumnWidths(i)";
__ref._headerwidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
RDebugUtils.currentLine=25493536;
 //BA.debugLineNum = 25493536;BA.debugLine="DataWidths(i) = ColumnWidths(i)";
__ref._datawidths /*int[]*/ [_i] = __ref._columnwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=25493539;
 //BA.debugLineNum = 25493539;BA.debugLine="SetHeader(h)";
__ref._setheader /*String*/ (null,_h);
RDebugUtils.currentLine=25493540;
 //BA.debugLineNum = 25493540;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=25493544;
 //BA.debugLineNum = 25493544;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=25493546;
 //BA.debugLineNum = 25493546;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step34 = 1;
final int limit34 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=25493547;
 //BA.debugLineNum = 25493547;BA.debugLine="Dim Row() As String";
_row = new String[(int) (0)];
java.util.Arrays.fill(_row,"");
RDebugUtils.currentLine=25493548;
 //BA.debugLineNum = 25493548;BA.debugLine="Row = List1.Get(i)";
_row = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=25493549;
 //BA.debugLineNum = 25493549;BA.debugLine="AddRow(Row)";
__ref._addrow /*String*/ (null,_row);
 }
};
RDebugUtils.currentLine=25493551;
 //BA.debugLineNum = 25493551;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub LoadTableFromCSV2(Dir As String, Filena";
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="Dim List1 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25559044;
 //BA.debugLineNum = 25559044;BA.debugLine="cAutomaticWidths = AutomaticWidths";
__ref._cautomaticwidths /*boolean*/  = _automaticwidths;
RDebugUtils.currentLine=25559046;
 //BA.debugLineNum = 25559046;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=25559047;
 //BA.debugLineNum = 25559047;BA.debugLine="Dim lstHeaders As List";
_lstheaders = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=25559048;
 //BA.debugLineNum = 25559048;BA.debugLine="List1 = StringUtils1.LoadCSV2(Dir, Filename, Sep";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),_lstheaders);
RDebugUtils.currentLine=25559049;
 //BA.debugLineNum = 25559049;BA.debugLine="Dim Headers(lstHeaders.Size) As String";
_headers = new String[_lstheaders.getSize()];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=25559050;
 //BA.debugLineNum = 25559050;BA.debugLine="For i = 0 To lstHeaders.Size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lstheaders.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=25559051;
 //BA.debugLineNum = 25559051;BA.debugLine="Headers(i) = lstHeaders.Get(i)";
_headers[_i] = BA.ObjectToString(_lstheaders.Get(_i));
 }
};
 }else {
RDebugUtils.currentLine=25559054;
 //BA.debugLineNum = 25559054;BA.debugLine="List1 = StringUtils1.LoadCSV(Dir, Filename, Sepa";
_list1 = __ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .LoadCSV(_dir,_filename,BA.ObjectToChar(_separatorchar));
RDebugUtils.currentLine=25559055;
 //BA.debugLineNum = 25559055;BA.debugLine="Dim firstRow() As String";
_firstrow = new String[(int) (0)];
java.util.Arrays.fill(_firstrow,"");
RDebugUtils.currentLine=25559056;
 //BA.debugLineNum = 25559056;BA.debugLine="firstRow = List1.Get(0)";
_firstrow = (String[])(_list1.Get((int) (0)));
RDebugUtils.currentLine=25559057;
 //BA.debugLineNum = 25559057;BA.debugLine="Dim Headers(firstRow.Length) As String";
_headers = new String[_firstrow.length];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=25559058;
 //BA.debugLineNum = 25559058;BA.debugLine="For i = 0 To firstRow.Length - 1";
{
final int step15 = 1;
final int limit15 = (int) (_firstrow.length-1);
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=25559059;
 //BA.debugLineNum = 25559059;BA.debugLine="Headers(i) = \"Col\" & (i + 1)";
_headers[_i] = "Col"+BA.NumberToString((_i+1));
 }
};
 };
RDebugUtils.currentLine=25559062;
 //BA.debugLineNum = 25559062;BA.debugLine="innerClearAll(Headers.Length, True)";
__ref._innerclearall /*String*/ (null,_headers.length,__c.True);
RDebugUtils.currentLine=25559063;
 //BA.debugLineNum = 25559063;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=25559064;
 //BA.debugLineNum = 25559064;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=25559065;
 //BA.debugLineNum = 25559065;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=25559066;
 //BA.debugLineNum = 25559066;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=25559068;
 //BA.debugLineNum = 25559068;BA.debugLine="Dim col, Row As Int";
_col = 0;
_row = 0;
RDebugUtils.currentLine=25559069;
 //BA.debugLineNum = 25559069;BA.debugLine="If AutomaticWidths = False Then";
if (_automaticwidths==__c.False) { 
RDebugUtils.currentLine=25559070;
 //BA.debugLineNum = 25559070;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step26 = 1;
final int limit26 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit26 ;_col = _col + step26 ) {
RDebugUtils.currentLine=25559071;
 //BA.debugLineNum = 25559071;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=25559072;
 //BA.debugLineNum = 25559072;BA.debugLine="ColumnWidths(col) = SV2.Width / mNumberOfColumn";
__ref._columnwidths /*int[]*/ [_col] = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()/(double)__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=25559073;
 //BA.debugLineNum = 25559073;BA.debugLine="HeaderWidths(col) = ColumnWidths(col)";
__ref._headerwidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
RDebugUtils.currentLine=25559074;
 //BA.debugLineNum = 25559074;BA.debugLine="DataWidths(col) = ColumnWidths(col)";
__ref._datawidths /*int[]*/ [_col] = __ref._columnwidths /*int[]*/ [_col];
 }
};
 }else {
RDebugUtils.currentLine=25559077;
 //BA.debugLineNum = 25559077;BA.debugLine="If HeadersExist Then";
if (_headersexist) { 
RDebugUtils.currentLine=25559078;
 //BA.debugLineNum = 25559078;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=25559079;
 //BA.debugLineNum = 25559079;BA.debugLine="strRow = List1.Get(col)";
_strrow = (String[])(_list1.Get(_col));
RDebugUtils.currentLine=25559080;
 //BA.debugLineNum = 25559080;BA.debugLine="If HeaderMultiTypeFace = False Then";
if (__ref._headermultitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=25559081;
 //BA.debugLineNum = 25559081;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit37 ;_col = _col + step37 ) {
RDebugUtils.currentLine=25559082;
 //BA.debugLineNum = 25559082;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=25559085;
 //BA.debugLineNum = 25559085;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=25559086;
 //BA.debugLineNum = 25559086;BA.debugLine="HeaderWidths(col) = cvs.MeasureStringWidth(ls";
__ref._headerwidths /*int[]*/ [_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(_lstheaders.Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=25559090;
 //BA.debugLineNum = 25559090;BA.debugLine="For Row = 0 To List1.Size - 1";
{
final int step46 = 1;
final int limit46 = (int) (_list1.getSize()-1);
_row = (int) (0) ;
for (;_row <= limit46 ;_row = _row + step46 ) {
RDebugUtils.currentLine=25559091;
 //BA.debugLineNum = 25559091;BA.debugLine="Dim strRow(mNumberOfColumns) As String";
_strrow = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=25559092;
 //BA.debugLineNum = 25559092;BA.debugLine="strRow = List1.Get(Row)";
_strrow = (String[])(_list1.Get(_row));
RDebugUtils.currentLine=25559093;
 //BA.debugLineNum = 25559093;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=25559094;
 //BA.debugLineNum = 25559094;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step50 = 1;
final int limit50 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit50 ;_col = _col + step50 ) {
RDebugUtils.currentLine=25559095;
 //BA.debugLineNum = 25559095;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 }else {
RDebugUtils.currentLine=25559098;
 //BA.debugLineNum = 25559098;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step54 = 1;
final int limit54 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit54 ;_col = _col + step54 ) {
RDebugUtils.currentLine=25559099;
 //BA.debugLineNum = 25559099;BA.debugLine="DataWidths(col) = Max(DataWidths(col), cvs.Me";
__ref._datawidths /*int[]*/ [_col] = (int) (__c.Max(__ref._datawidths /*int[]*/ [_col],__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_strrow[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ ));
 }
};
 };
 }
};
RDebugUtils.currentLine=25559103;
 //BA.debugLineNum = 25559103;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step59 = 1;
final int limit59 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit59 ;_col = _col + step59 ) {
RDebugUtils.currentLine=25559104;
 //BA.debugLineNum = 25559104;BA.debugLine="cColumnDataType(col) = \"T\"";
__ref._ccolumndatatype /*String[]*/ [_col] = "T";
RDebugUtils.currentLine=25559105;
 //BA.debugLineNum = 25559105;BA.debugLine="ColumnWidths(col) = Max(HeaderWidths(col), Data";
__ref._columnwidths /*int[]*/ [_col] = (int) (__c.Max(__ref._headerwidths /*int[]*/ [_col],__ref._datawidths /*int[]*/ [_col]));
 }
};
 };
RDebugUtils.currentLine=25559109;
 //BA.debugLineNum = 25559109;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=25559110;
 //BA.debugLineNum = 25559110;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=25559114;
 //BA.debugLineNum = 25559114;BA.debugLine="SetArrColumnsSorted(mNumberOfColumns) 'to keep tr";
__ref._setarrcolumnssorted /*String*/ (null,__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=25559116;
 //BA.debugLineNum = 25559116;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step67 = 1;
final int limit67 = (int) (_list1.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
RDebugUtils.currentLine=25559117;
 //BA.debugLineNum = 25559117;BA.debugLine="Dim strRow() As String";
_strrow = new String[(int) (0)];
java.util.Arrays.fill(_strrow,"");
RDebugUtils.currentLine=25559118;
 //BA.debugLineNum = 25559118;BA.debugLine="strRow = List1.Get(i)";
_strrow = (String[])(_list1.Get(_i));
RDebugUtils.currentLine=25559119;
 //BA.debugLineNum = 25559119;BA.debugLine="AddRow(strRow)";
__ref._addrow /*String*/ (null,_strrow);
 }
};
RDebugUtils.currentLine=25559122;
 //BA.debugLineNum = 25559122;BA.debugLine="End Sub";
return "";
}
public String  _pnlfastscroll_touch(b4a.example.ef.table __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "pnlfastscroll_touch", false))
	 {return ((String) Debug.delegate(ba, "pnlfastscroll_touch", new Object[] {_action,_x,_y}));}
int _top = 0;
int _sv2top = 0;
RDebugUtils.currentLine=28442624;
 //BA.debugLineNum = 28442624;BA.debugLine="Private Sub pnlFastScroll_Touch (Action As Int, X";
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Select Action";
switch (_action) {
case 0: {
RDebugUtils.currentLine=28442627;
 //BA.debugLineNum = 28442627;BA.debugLine="If Y >= pnlFastScrollCursor.Top And Y <= pnlFas";
if (_y>=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop() && _y<=__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=28442628;
 //BA.debugLineNum = 28442628;BA.debugLine="FSY0 = pnlFastScrollCursor.Top";
__ref._fsy0 /*int*/  = __ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop();
RDebugUtils.currentLine=28442629;
 //BA.debugLineNum = 28442629;BA.debugLine="FSdY = Y - FSY0";
__ref._fsdy /*int*/  = (int) (_y-__ref._fsy0 /*int*/ );
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="FastScrollActive = True";
__ref._fastscrollactive /*boolean*/  = __c.True;
 };
 break; }
case 2: {
RDebugUtils.currentLine=28442633;
 //BA.debugLineNum = 28442633;BA.debugLine="If FastScrollActive = True Then";
if (__ref._fastscrollactive /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28442634;
 //BA.debugLineNum = 28442634;BA.debugLine="Private Top, SV2Top As Int";
_top = 0;
_sv2top = 0;
RDebugUtils.currentLine=28442635;
 //BA.debugLineNum = 28442635;BA.debugLine="Top = Max(Y - FSdY, 0)";
_top = (int) (__c.Max(_y-__ref._fsdy /*int*/ ,0));
RDebugUtils.currentLine=28442636;
 //BA.debugLineNum = 28442636;BA.debugLine="Top = Min(Top, pnlFastScroll.Height - pnlFastS";
_top = (int) (__c.Min(_top,__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=28442637;
 //BA.debugLineNum = 28442637;BA.debugLine="pnlFastScrollCursor.Top = Top";
__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=28442638;
 //BA.debugLineNum = 28442638;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=28442639;
 //BA.debugLineNum = 28442639;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top +";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 };
RDebugUtils.currentLine=28442641;
 //BA.debugLineNum = 28442641;BA.debugLine="SV2Top = Top / FScScale";
_sv2top = (int) (_top/(double)__ref._fscscale /*double*/ );
RDebugUtils.currentLine=28442642;
 //BA.debugLineNum = 28442642;BA.debugLine="SV2.VerticalScrollPosition = SV2Top";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setVerticalScrollPosition(_sv2top);
 };
 break; }
case 1: {
RDebugUtils.currentLine=28442645;
 //BA.debugLineNum = 28442645;BA.debugLine="FScTimer.Enabled = True";
__ref._fsctimer /*anywheresoftware.b4a.objects.Timer*/ .setEnabled(__c.True);
 break; }
}
;
RDebugUtils.currentLine=28442647;
 //BA.debugLineNum = 28442647;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Public Sub RefreshLabels";
RDebugUtils.currentLine=26214401;
 //BA.debugLineNum = 26214401;BA.debugLine="Private i, j As Int";
_i = 0;
_j = 0;
RDebugUtils.currentLine=26214403;
 //BA.debugLineNum = 26214403;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step3 = 1;
final int limit3 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=26214405;
 //BA.debugLineNum = 26214405;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=26214408;
 //BA.debugLineNum = 26214408;BA.debugLine="If cTypeFaces.Length < mNumberOfColumns Then";
if (__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=26214409;
 //BA.debugLineNum = 26214409;BA.debugLine="Private cTypeFaces(mNumberOfColumns) As Typeface";
_ctypefaces = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _ctypefaces.length;
for (int i0 = 0;i0 < d0;i0++) {
_ctypefaces[i0] = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
}
}
;
RDebugUtils.currentLine=26214410;
 //BA.debugLineNum = 26214410;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step8 = 1;
final int limit8 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
RDebugUtils.currentLine=26214411;
 //BA.debugLineNum = 26214411;BA.debugLine="cTypeFaces(j) = cTypeFace";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j] = __ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ ;
 }
};
 };
RDebugUtils.currentLine=26214415;
 //BA.debugLineNum = 26214415;BA.debugLine="If cTextColors.Length < mNumberOfColumns Then";
if (__ref._ctextcolors /*int[]*/ .length<__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=26214416;
 //BA.debugLineNum = 26214416;BA.debugLine="Private cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=26214417;
 //BA.debugLineNum = 26214417;BA.debugLine="For j = 0 To mNumberOfColumns - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_j = (int) (0) ;
for (;_j <= limit14 ;_j = _j + step14 ) {
RDebugUtils.currentLine=26214418;
 //BA.debugLineNum = 26214418;BA.debugLine="cTextColors(j) = cTextColor";
__ref._ctextcolors /*int[]*/ [_j] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=26214421;
 //BA.debugLineNum = 26214421;BA.debugLine="For i = 0 To LabelsCache.Size - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=26214422;
 //BA.debugLineNum = 26214422;BA.debugLine="Private lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=26214423;
 //BA.debugLineNum = 26214423;BA.debugLine="lbls = LabelsCache.Get(i)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=26214424;
 //BA.debugLineNum = 26214424;BA.debugLine="For j = 0 To lbls.Length - 1";
{
final int step21 = 1;
final int limit21 = (int) (_lbls.length-1);
_j = (int) (0) ;
for (;_j <= limit21 ;_j = _j + step21 ) {
RDebugUtils.currentLine=26214425;
 //BA.debugLineNum = 26214425;BA.debugLine="If MultiTypeFace = True Then";
if (__ref._multitypeface /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=26214426;
 //BA.debugLineNum = 26214426;BA.debugLine="lbls(j).Typeface = cTypeFaces(j)";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_j].getObject()));
RDebugUtils.currentLine=26214427;
 //BA.debugLineNum = 26214427;BA.debugLine="lbls(j).TextColor = cTextColors(j)";
_lbls[_j].setTextColor(__ref._ctextcolors /*int[]*/ [_j]);
 }else {
RDebugUtils.currentLine=26214429;
 //BA.debugLineNum = 26214429;BA.debugLine="lbls(j).Typeface = cTypeFace";
_lbls[_j].setTypeface((android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
RDebugUtils.currentLine=26214430;
 //BA.debugLineNum = 26214430;BA.debugLine="lbls(j).TextColor = cTextColor";
_lbls[_j].setTextColor(__ref._ctextcolor /*int*/ );
 };
 }
};
 }
};
RDebugUtils.currentLine=26214435;
 //BA.debugLineNum = 26214435;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show all";
{
final int step31 = 1;
final int limit31 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit31 ;_i = _i + step31 ) {
RDebugUtils.currentLine=26214436;
 //BA.debugLineNum = 26214436;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
RDebugUtils.currentLine=26214438;
 //BA.debugLineNum = 26214438;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=33619968;
 //BA.debugLineNum = 33619968;BA.debugLine="Private Sub RemoveAccents(s As String) As String";
RDebugUtils.currentLine=33619969;
 //BA.debugLineNum = 33619969;BA.debugLine="Dim normalizer As JavaObject";
_normalizer = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=33619970;
 //BA.debugLineNum = 33619970;BA.debugLine="normalizer.InitializeStatic(\"java.text.Normalizer";
_normalizer.InitializeStatic("java.text.Normalizer");
RDebugUtils.currentLine=33619971;
 //BA.debugLineNum = 33619971;BA.debugLine="Dim n As String = normalizer.RunMethod(\"normalize";
_n = BA.ObjectToString(_normalizer.RunMethod("normalize",new Object[]{(Object)(_s),(Object)("NFD")}));
RDebugUtils.currentLine=33619972;
 //BA.debugLineNum = 33619972;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=33619973;
 //BA.debugLineNum = 33619973;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=33619974;
 //BA.debugLineNum = 33619974;BA.debugLine="For i = 0 To n.Length - 1";
{
final int step6 = 1;
final int limit6 = (int) (_n.length()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=33619975;
 //BA.debugLineNum = 33619975;BA.debugLine="If Regex.IsMatch(\"\\p{InCombiningDiacriticalMarks";
if (__c.Regex.IsMatch("\\p{InCombiningDiacriticalMarks}",BA.ObjectToString(_n.charAt(_i)))==__c.False) { 
RDebugUtils.currentLine=33619976;
 //BA.debugLineNum = 33619976;BA.debugLine="sb.Append(n.CharAt(i))";
_sb.Append(BA.ObjectToString(_n.charAt(_i)));
 };
 }
};
RDebugUtils.currentLine=33619979;
 //BA.debugLineNum = 33619979;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=33619980;
 //BA.debugLineNum = 33619980;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub RemoveRow(Row As Int)";
RDebugUtils.currentLine=25755649;
 //BA.debugLineNum = 25755649;BA.debugLine="If (Row <0 Or Row > Data.Size-1) Then Return ' ca";
if ((_row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
if (true) return "";};
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,SV";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition());
RDebugUtils.currentLine=25755655;
 //BA.debugLineNum = 25755655;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=25755656;
 //BA.debugLineNum = 25755656;BA.debugLine="prevIndex = SelectedRows.IndexOf(Row) ' if the rm";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=25755658;
 //BA.debugLineNum = 25755658;BA.debugLine="For i=0 To SelectedRows.Size -1 ' updated selecti";
{
final int step5 = 1;
final int limit5 = (int) (__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=25755659;
 //BA.debugLineNum = 25755659;BA.debugLine="Dim keepSel As Int";
_keepsel = 0;
RDebugUtils.currentLine=25755660;
 //BA.debugLineNum = 25755660;BA.debugLine="keepSel = SelectedRows.Get(i)";
_keepsel = (int)(BA.ObjectToNumber(__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=25755661;
 //BA.debugLineNum = 25755661;BA.debugLine="If (keepSel > Row) Then";
if ((_keepsel>_row)) { 
RDebugUtils.currentLine=25755662;
 //BA.debugLineNum = 25755662;BA.debugLine="SelectedRows.set(i,keepSel-1) ' dec row number";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .Set(_i,(Object)(_keepsel-1));
 };
 }
};
RDebugUtils.currentLine=25755667;
 //BA.debugLineNum = 25755667;BA.debugLine="If (prevIndex <> -1) Then";
if ((_previndex!=-1)) { 
RDebugUtils.currentLine=25755669;
 //BA.debugLineNum = 25755669;BA.debugLine="SelectedRows.RemoveAt(prevIndex) ' removed the c";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
 };
RDebugUtils.currentLine=25755672;
 //BA.debugLineNum = 25755672;BA.debugLine="Data.RemoveAt(Row)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=25755673;
 //BA.debugLineNum = 25755673;BA.debugLine="lstRowColorIndexes.RemoveAt(Row)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_row);
RDebugUtils.currentLine=25755674;
 //BA.debugLineNum = 25755674;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' hide all";
{
final int step17 = 1;
final int limit17 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=25755675;
 //BA.debugLineNum = 25755675;BA.debugLine="HideRow(i)";
__ref._hiderow /*String*/ (null,_i);
 }
};
RDebugUtils.currentLine=25755686;
 //BA.debugLineNum = 25755686;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=25755687;
 //BA.debugLineNum = 25755687;BA.debugLine="maxVisibleRow = Min(maxVisibleRow, Data.Size - 1";
__ref._maxvisiblerow /*int*/  = (int) (__c.Min(__ref._maxvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=25755688;
 //BA.debugLineNum = 25755688;BA.debugLine="minVisibleRow = Min(minVisibleRow, Data.Size - 1";
__ref._minvisiblerow /*int*/  = (int) (__c.Min(__ref._minvisiblerow /*int*/ ,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
RDebugUtils.currentLine=25755689;
 //BA.debugLineNum = 25755689;BA.debugLine="For i = minVisibleRow To maxVisibleRow ' show al";
{
final int step23 = 1;
final int limit23 = __ref._maxvisiblerow /*int*/ ;
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=25755691;
 //BA.debugLineNum = 25755691;BA.debugLine="ShowRow(i)";
__ref._showrow /*void*/ (null,_i);
 }
};
 };
RDebugUtils.currentLine=25755695;
 //BA.debugLineNum = 25755695;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=25755696;
 //BA.debugLineNum = 25755696;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=25755697;
 //BA.debugLineNum = 25755697;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=25755699;
 //BA.debugLineNum = 25755699;BA.debugLine="SV2_ScrollChanged(SV2.HorizontalScrollPosition,Mi";
__ref._sv2_scrollchanged /*String*/ (null,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHorizontalScrollPosition(),(int) (__c.Min(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getVerticalScrollPosition(),__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight())));
RDebugUtils.currentLine=25755700;
 //BA.debugLineNum = 25755700;BA.debugLine="If (lblStatusLine.IsInitialized And enableStatusL";
if ((__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .IsInitialized() && __ref._enablestatuslineautofill /*boolean*/ ==__c.True)) { 
__ref._setstatusline /*String*/ (null,BA.NumberToString(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize())+" rows");};
RDebugUtils.currentLine=25755701;
 //BA.debugLineNum = 25755701;BA.debugLine="End Sub";
return "";
}
public String  _removerowcolorn(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removerowcolorn", false))
	 {return ((String) Debug.delegate(ba, "removerowcolorn", new Object[] {_row}));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Public Sub RemoveRowColorN(Row As Int)";
RDebugUtils.currentLine=29622273;
 //BA.debugLineNum = 29622273;BA.debugLine="If Row > -1 And Row <lstRowColorIndexes.Size Then";
if (_row>-1 && _row<__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) { 
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="lstRowColorIndexes.Set(Row, 0)";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(0));
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29622276;
 //BA.debugLineNum = 29622276;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
 };
RDebugUtils.currentLine=29622279;
 //BA.debugLineNum = 29622279;BA.debugLine="End Sub";
return "";
}
public String  _removeview(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "removeview", false))
	 {return ((String) Debug.delegate(ba, "removeview", null));}
RDebugUtils.currentLine=31326208;
 //BA.debugLineNum = 31326208;BA.debugLine="Public Sub RemoveView";
RDebugUtils.currentLine=31326209;
 //BA.debugLineNum = 31326209;BA.debugLine="pnlTable.RemoveView";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveView();
RDebugUtils.currentLine=31326210;
 //BA.debugLineNum = 31326210;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Sub ReverseIndexDouble(arrDouble() As Double, arrI";
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=36306947;
 //BA.debugLineNum = 36306947;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=36306948;
 //BA.debugLineNum = 36306948;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=36306949;
 //BA.debugLineNum = 36306949;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=36306950;
 //BA.debugLineNum = 36306950;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=36306951;
 //BA.debugLineNum = 36306951;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=36306952;
 //BA.debugLineNum = 36306952;BA.debugLine="Dim arrIndex2(arrDouble.Length) As Int";
_arrindex2 = new int[_arrdouble.length];
;
RDebugUtils.currentLine=36306954;
 //BA.debugLineNum = 36306954;BA.debugLine="iUB = arrDouble.Length - 1";
_iub = (int) (_arrdouble.length-1);
RDebugUtils.currentLine=36306956;
 //BA.debugLineNum = 36306956;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=36306958;
 //BA.debugLineNum = 36306958;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=36306959;
 //BA.debugLineNum = 36306959;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=36306961;
 //BA.debugLineNum = 36306961;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=36306963;
 //BA.debugLineNum = 36306963;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=36306964;
 //BA.debugLineNum = 36306964;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=36306965;
 //BA.debugLineNum = 36306965;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=36306967;
 //BA.debugLineNum = 36306967;BA.debugLine="bSame = arrDouble(arrIndex(i)) = arrDouble(arr";
_bsame = _arrdouble[_arrindex[_i]]==_arrdouble[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=36306969;
 //BA.debugLineNum = 36306969;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=36306970;
 //BA.debugLineNum = 36306970;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=36306971;
 //BA.debugLineNum = 36306971;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=36306972;
 //BA.debugLineNum = 36306972;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=36306973;
 //BA.debugLineNum = 36306973;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=36306974;
 //BA.debugLineNum = 36306974;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=36306975;
 //BA.debugLineNum = 36306975;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=36306977;
 //BA.debugLineNum = 36306977;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=36306980;
 //BA.debugLineNum = 36306980;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=36306981;
 //BA.debugLineNum = 36306981;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=36306982;
 //BA.debugLineNum = 36306982;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=36306983;
 //BA.debugLineNum = 36306983;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=36306984;
 //BA.debugLineNum = 36306984;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=36306986;
 //BA.debugLineNum = 36306986;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=36306988;
 //BA.debugLineNum = 36306988;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=36306994;
 //BA.debugLineNum = 36306994;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=36306996;
 //BA.debugLineNum = 36306996;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Sub ReverseIndexLong(arrLong() As Long, arrIndex()";
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=36241413;
 //BA.debugLineNum = 36241413;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=36241414;
 //BA.debugLineNum = 36241414;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=36241415;
 //BA.debugLineNum = 36241415;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=36241416;
 //BA.debugLineNum = 36241416;BA.debugLine="Dim arrIndex2(arrLong.Length) As Int";
_arrindex2 = new int[_arrlong.length];
;
RDebugUtils.currentLine=36241418;
 //BA.debugLineNum = 36241418;BA.debugLine="iUB = arrLong.Length - 1";
_iub = (int) (_arrlong.length-1);
RDebugUtils.currentLine=36241420;
 //BA.debugLineNum = 36241420;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=36241422;
 //BA.debugLineNum = 36241422;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=36241423;
 //BA.debugLineNum = 36241423;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=36241425;
 //BA.debugLineNum = 36241425;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=36241427;
 //BA.debugLineNum = 36241427;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=36241428;
 //BA.debugLineNum = 36241428;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=36241429;
 //BA.debugLineNum = 36241429;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i+1)]];
 }else {
RDebugUtils.currentLine=36241431;
 //BA.debugLineNum = 36241431;BA.debugLine="bSame = arrLong(arrIndex(i)) = arrLong(arrInde";
_bsame = _arrlong[_arrindex[_i]]==_arrlong[_arrindex[(int) (_i-1)]];
 };
RDebugUtils.currentLine=36241433;
 //BA.debugLineNum = 36241433;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=36241434;
 //BA.debugLineNum = 36241434;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=36241435;
 //BA.debugLineNum = 36241435;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=36241436;
 //BA.debugLineNum = 36241436;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=36241437;
 //BA.debugLineNum = 36241437;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=36241438;
 //BA.debugLineNum = 36241438;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=36241439;
 //BA.debugLineNum = 36241439;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=36241441;
 //BA.debugLineNum = 36241441;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=36241444;
 //BA.debugLineNum = 36241444;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=36241445;
 //BA.debugLineNum = 36241445;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=36241446;
 //BA.debugLineNum = 36241446;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=36241447;
 //BA.debugLineNum = 36241447;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=36241448;
 //BA.debugLineNum = 36241448;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=36241450;
 //BA.debugLineNum = 36241450;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=36241452;
 //BA.debugLineNum = 36241452;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=36241458;
 //BA.debugLineNum = 36241458;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=36241460;
 //BA.debugLineNum = 36241460;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Sub ReverseIndexString(arrString() As String, arrI";
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="Dim c As Int";
_c = 0;
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="Dim n As Int";
_n = 0;
RDebugUtils.currentLine=36372485;
 //BA.debugLineNum = 36372485;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=36372486;
 //BA.debugLineNum = 36372486;BA.debugLine="Dim iUB As Int";
_iub = 0;
RDebugUtils.currentLine=36372487;
 //BA.debugLineNum = 36372487;BA.debugLine="Dim bSame As Boolean";
_bsame = false;
RDebugUtils.currentLine=36372488;
 //BA.debugLineNum = 36372488;BA.debugLine="Dim arrIndex2(arrString.Length) As Int";
_arrindex2 = new int[_arrstring.length];
;
RDebugUtils.currentLine=36372490;
 //BA.debugLineNum = 36372490;BA.debugLine="iUB = arrString.Length - 1";
_iub = (int) (_arrstring.length-1);
RDebugUtils.currentLine=36372492;
 //BA.debugLineNum = 36372492;BA.debugLine="If bUnique Then";
if (_bunique) { 
RDebugUtils.currentLine=36372494;
 //BA.debugLineNum = 36372494;BA.debugLine="For i = 0 To iUB";
{
final int step10 = 1;
final int limit10 = _iub;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=36372495;
 //BA.debugLineNum = 36372495;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 }
};
RDebugUtils.currentLine=36372497;
 //BA.debugLineNum = 36372497;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 }else {
RDebugUtils.currentLine=36372499;
 //BA.debugLineNum = 36372499;BA.debugLine="For i = 0 To iUB";
{
final int step15 = 1;
final int limit15 = _iub;
_i = (int) (0) ;
for (;_i <= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=36372500;
 //BA.debugLineNum = 36372500;BA.debugLine="If i < iUB Then";
if (_i<_iub) { 
RDebugUtils.currentLine=36372501;
 //BA.debugLineNum = 36372501;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i+1)]]);
 }else {
RDebugUtils.currentLine=36372503;
 //BA.debugLineNum = 36372503;BA.debugLine="bSame = arrString(arrIndex(i)) = arrString(arr";
_bsame = (_arrstring[_arrindex[_i]]).equals(_arrstring[_arrindex[(int) (_i-1)]]);
 };
RDebugUtils.currentLine=36372505;
 //BA.debugLineNum = 36372505;BA.debugLine="If bSame Then";
if (_bsame) { 
RDebugUtils.currentLine=36372506;
 //BA.debugLineNum = 36372506;BA.debugLine="c = c + 1";
_c = (int) (_c+1);
RDebugUtils.currentLine=36372507;
 //BA.debugLineNum = 36372507;BA.debugLine="If i = iUB Then";
if (_i==_iub) { 
RDebugUtils.currentLine=36372508;
 //BA.debugLineNum = 36372508;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=36372509;
 //BA.debugLineNum = 36372509;BA.debugLine="For n = (i - c) + 1 To i";
{
final int step25 = 1;
final int limit25 = _i;
_n = (int) ((_i-_c)+1) ;
for (;_n <= limit25 ;_n = _n + step25 ) {
RDebugUtils.currentLine=36372510;
 //BA.debugLineNum = 36372510;BA.debugLine="arrIndex2(x) = arrIndex(n)";
_arrindex2[_x] = _arrindex[_n];
RDebugUtils.currentLine=36372511;
 //BA.debugLineNum = 36372511;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=36372513;
 //BA.debugLineNum = 36372513;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
 }else {
RDebugUtils.currentLine=36372516;
 //BA.debugLineNum = 36372516;BA.debugLine="If c > 0 Then";
if (_c>0) { 
RDebugUtils.currentLine=36372517;
 //BA.debugLineNum = 36372517;BA.debugLine="x = 0";
_x = (int) (0);
RDebugUtils.currentLine=36372518;
 //BA.debugLineNum = 36372518;BA.debugLine="For n = i - c To i";
{
final int step34 = 1;
final int limit34 = _i;
_n = (int) (_i-_c) ;
for (;_n <= limit34 ;_n = _n + step34 ) {
RDebugUtils.currentLine=36372519;
 //BA.debugLineNum = 36372519;BA.debugLine="arrIndex2((iUB - i) + x) = arrIndex(n)";
_arrindex2[(int) ((_iub-_i)+_x)] = _arrindex[_n];
RDebugUtils.currentLine=36372520;
 //BA.debugLineNum = 36372520;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 }
};
RDebugUtils.currentLine=36372523;
 //BA.debugLineNum = 36372523;BA.debugLine="c = 0";
_c = (int) (0);
 }else {
RDebugUtils.currentLine=36372525;
 //BA.debugLineNum = 36372525;BA.debugLine="arrIndex2(iUB - i) = arrIndex(i)";
_arrindex2[(int) (_iub-_i)] = _arrindex[_i];
 };
 };
 }
};
 };
RDebugUtils.currentLine=36372531;
 //BA.debugLineNum = 36372531;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=36372533;
 //BA.debugLineNum = 36372533;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub SaveTableToCSV(Dir As String, Filename";
RDebugUtils.currentLine=25624577;
 //BA.debugLineNum = 25624577;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=25624580;
 //BA.debugLineNum = 25624580;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=25624582;
 //BA.debugLineNum = 25624582;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25624583;
 //BA.debugLineNum = 25624583;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=25624584;
 //BA.debugLineNum = 25624584;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=25624587;
 //BA.debugLineNum = 25624587;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=25624588;
 //BA.debugLineNum = 25624588;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25624589;
 //BA.debugLineNum = 25624589;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=25624590;
 //BA.debugLineNum = 25624590;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=25624592;
 //BA.debugLineNum = 25624592;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=25624593;
 //BA.debugLineNum = 25624593;BA.debugLine="Headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=25624597;
 //BA.debugLineNum = 25624597;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, \",\", Data, H";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(","),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=25624598;
 //BA.debugLineNum = 25624598;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub SaveTableToCSV2(Dir As String, Filename";
RDebugUtils.currentLine=25690113;
 //BA.debugLineNum = 25690113;BA.debugLine="Dim headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="Private headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=25690117;
 //BA.debugLineNum = 25690117;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=25690119;
 //BA.debugLineNum = 25690119;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25690120;
 //BA.debugLineNum = 25690120;BA.debugLine="L = Header.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=25690121;
 //BA.debugLineNum = 25690121;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 }
};
 }else {
RDebugUtils.currentLine=25690124;
 //BA.debugLineNum = 25690124;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=25690125;
 //BA.debugLineNum = 25690125;BA.debugLine="Dim L As B4XView";
_l = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=25690126;
 //BA.debugLineNum = 25690126;BA.debugLine="If i < mNumberOfFixedColumns Then";
if (_i<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=25690127;
 //BA.debugLineNum = 25690127;BA.debugLine="L = HeaderFirst.GetView(i)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
 }else {
RDebugUtils.currentLine=25690129;
 //BA.debugLineNum = 25690129;BA.debugLine="L = Header.GetView(i - mNumberOfFixedColumns)";
_l = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_i-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=25690130;
 //BA.debugLineNum = 25690130;BA.debugLine="headers(i) = L.Text";
_headers[_i] = _l.getText();
 };
 }
};
 };
RDebugUtils.currentLine=25690134;
 //BA.debugLineNum = 25690134;BA.debugLine="StringUtils1.SaveCSV2(Dir, Filename, SeparatorCha";
__ref._stringutils1 /*anywheresoftware.b4a.objects.StringUtils*/ .SaveCSV2(_dir,_filename,BA.ObjectToChar(_separatorchar),__ref._data /*anywheresoftware.b4a.objects.collections.List*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(_headers));
RDebugUtils.currentLine=25690135;
 //BA.debugLineNum = 25690135;BA.debugLine="End Sub";
return "";
}
public String  _scaletable(b4a.example.ef.table __ref,double _scalex,double _scaley,boolean _scalealldone) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "scaletable", false))
	 {return ((String) Debug.delegate(ba, "scaletable", new Object[] {_scalex,_scaley,_scalealldone}));}
int _i = 0;
RDebugUtils.currentLine=32833536;
 //BA.debugLineNum = 32833536;BA.debugLine="Public Sub ScaleTable(ScaleX As Double, ScaleY As";
RDebugUtils.currentLine=32833537;
 //BA.debugLineNum = 32833537;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=32833538;
 //BA.debugLineNum = 32833538;BA.debugLine="ToastMessageShow(\"Table.ScaleTable must be calle";
__c.ToastMessageShow(BA.ObjectToCharSequence("Table.ScaleTable must be called before filling the Table"),__c.False);
RDebugUtils.currentLine=32833539;
 //BA.debugLineNum = 32833539;BA.debugLine="Log(\"Table.ScaleTable must be called before fill";
__c.LogImpl("432833539","Table.ScaleTable must be called before filling the Table",0);
RDebugUtils.currentLine=32833540;
 //BA.debugLineNum = 32833540;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=32833543;
 //BA.debugLineNum = 32833543;BA.debugLine="cTextSize = cTextSize * Min(ScaleX, ScaleY)";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *__c.Min(_scalex,_scaley));
RDebugUtils.currentLine=32833544;
 //BA.debugLineNum = 32833544;BA.debugLine="cLineWidth = cLineWidth * ScaleX";
__ref._clinewidth /*int*/  = (int) (__ref._clinewidth /*int*/ *_scalex);
RDebugUtils.currentLine=32833545;
 //BA.debugLineNum = 32833545;BA.debugLine="ExtraWidth = ExtraWidth * ScaleX";
__ref._extrawidth /*int*/  = (int) (__ref._extrawidth /*int*/ *_scalex);
RDebugUtils.currentLine=32833546;
 //BA.debugLineNum = 32833546;BA.debugLine="cRowHeight  = cRowHeight * ScaleY";
__ref._crowheight /*int*/  = (int) (__ref._crowheight /*int*/ *_scaley);
RDebugUtils.currentLine=32833547;
 //BA.debugLineNum = 32833547;BA.debugLine="cHeaderHeight = cHeaderHeight * ScaleY";
__ref._cheaderheight /*int*/  = (int) (__ref._cheaderheight /*int*/ *_scaley);
RDebugUtils.currentLine=32833548;
 //BA.debugLineNum = 32833548;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=32833549;
 //BA.debugLineNum = 32833549;BA.debugLine="ColumnWidths(i) = ColumnWidths(i) * ScaleX";
__ref._columnwidths /*int[]*/ [_i] = (int) (__ref._columnwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=32833550;
 //BA.debugLineNum = 32833550;BA.debugLine="DataWidths(i) = DataWidths(i) * ScaleX";
__ref._datawidths /*int[]*/ [_i] = (int) (__ref._datawidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=32833551;
 //BA.debugLineNum = 32833551;BA.debugLine="HeaderWidths(i) = HeaderWidths(i)	* ScaleX";
__ref._headerwidths /*int[]*/ [_i] = (int) (__ref._headerwidths /*int[]*/ [_i]*_scalex);
RDebugUtils.currentLine=32833552;
 //BA.debugLineNum = 32833552;BA.debugLine="SavedWidths(i) = SavedWidths(i)	* ScaleX";
__ref._savedwidths /*int[]*/ [_i] = (int) (__ref._savedwidths /*int[]*/ [_i]*_scalex);
 }
};
RDebugUtils.currentLine=32833555;
 //BA.debugLineNum = 32833555;BA.debugLine="If ScaleAllDone = False Then";
if (_scalealldone==__c.False) { 
RDebugUtils.currentLine=32833556;
 //BA.debugLineNum = 32833556;BA.debugLine="cLeft = cLeft * ScaleX";
__ref._cleft /*int*/  = (int) (__ref._cleft /*int*/ *_scalex);
RDebugUtils.currentLine=32833557;
 //BA.debugLineNum = 32833557;BA.debugLine="cTop = cTop * ScaleY";
__ref._ctop /*int*/  = (int) (__ref._ctop /*int*/ *_scaley);
RDebugUtils.currentLine=32833558;
 //BA.debugLineNum = 32833558;BA.debugLine="cWidth = cWidth * ScaleX";
__ref._cwidth /*int*/  = (int) (__ref._cwidth /*int*/ *_scalex);
RDebugUtils.currentLine=32833559;
 //BA.debugLineNum = 32833559;BA.debugLine="cHeight = cHeight * ScaleY";
__ref._cheight /*int*/  = (int) (__ref._cheight /*int*/ *_scaley);
RDebugUtils.currentLine=32833561;
 //BA.debugLineNum = 32833561;BA.debugLine="cTextSize = cTextSize * ScaleY";
__ref._ctextsize /*float*/  = (float) (__ref._ctextsize /*float*/ *_scaley);
RDebugUtils.currentLine=32833562;
 //BA.debugLineNum = 32833562;BA.debugLine="pnlTable.Left = cLeft";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(__ref._cleft /*int*/ );
RDebugUtils.currentLine=32833563;
 //BA.debugLineNum = 32833563;BA.debugLine="pnlTable.Top = cTop";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(__ref._ctop /*int*/ );
RDebugUtils.currentLine=32833564;
 //BA.debugLineNum = 32833564;BA.debugLine="pnlTable.Width = cWidth";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(__ref._cwidth /*int*/ );
RDebugUtils.currentLine=32833565;
 //BA.debugLineNum = 32833565;BA.debugLine="pnlTable.Height = cHeight";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheight /*int*/ );
RDebugUtils.currentLine=32833566;
 //BA.debugLineNum = 32833566;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=32833567;
 //BA.debugLineNum = 32833567;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=32833568;
 //BA.debugLineNum = 32833568;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=32833569;
 //BA.debugLineNum = 32833569;BA.debugLine="SV2.Width = cWidth";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(__ref._cwidth /*int*/ );
 }else {
RDebugUtils.currentLine=32833571;
 //BA.debugLineNum = 32833571;BA.debugLine="SVF.Width = SVF.Width * ScaleX";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setWidth((int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=32833572;
 //BA.debugLineNum = 32833572;BA.debugLine="SV2.Width = SV2.Width * ScaleX";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=32833573;
 //BA.debugLineNum = 32833573;BA.debugLine="SV2.Left = SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setLeft(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth());
 };
RDebugUtils.currentLine=32833575;
 //BA.debugLineNum = 32833575;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=32833576;
 //BA.debugLineNum = 32833576;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=32833577;
 //BA.debugLineNum = 32833577;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=32833578;
 //BA.debugLineNum = 32833578;BA.debugLine="SV2.Height = cHeight - cStatusLineHeight - cHea";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=32833579;
 //BA.debugLineNum = 32833579;BA.debugLine="SVF.Height = cHeight - cStatusLineHeight - cHea";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=32833581;
 //BA.debugLineNum = 32833581;BA.debugLine="SV2.Height = cHeight - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=32833582;
 //BA.debugLineNum = 32833582;BA.debugLine="SVF.Height = cHeight - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (__ref._cheight /*int*/ -__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=32833584;
 //BA.debugLineNum = 32833584;BA.debugLine="lblFastScroll.Width = lblFastScroll.Width * Scal";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getWidth()*_scalex));
RDebugUtils.currentLine=32833585;
 //BA.debugLineNum = 32833585;BA.debugLine="lblFastScroll.Height = lblFastScroll.Height * Sc";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight()*_scaley));
RDebugUtils.currentLine=32833587;
 //BA.debugLineNum = 32833587;BA.debugLine="lblFastScroll.TextSize = lblFastScroll.TextSize";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize()*_scaley));
RDebugUtils.currentLine=32833588;
 //BA.debugLineNum = 32833588;BA.debugLine="lblFastScroll.Left = lblFastScroll.Left * ScaleX";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getLeft()*_scalex));
RDebugUtils.currentLine=32833589;
 //BA.debugLineNum = 32833589;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
RDebugUtils.currentLine=32833590;
 //BA.debugLineNum = 32833590;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=32833591;
 //BA.debugLineNum = 32833591;BA.debugLine="lblStatusLine.TextSize = cTextSize";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize(__ref._ctextsize /*float*/ );
RDebugUtils.currentLine=32833592;
 //BA.debugLineNum = 32833592;BA.debugLine="lblStatusLine.Height = cStatusLineHeight";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._cstatuslineheight /*int*/ );
RDebugUtils.currentLine=32833593;
 //BA.debugLineNum = 32833593;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=32833595;
 //BA.debugLineNum = 32833595;BA.debugLine="CreateNewLabels";
__ref._createnewlabels /*anywheresoftware.b4a.objects.LabelWrapper[]*/ (null);
RDebugUtils.currentLine=32833596;
 //BA.debugLineNum = 32833596;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Private Sub Scroll(PosX As Int, PosY As Int)";
RDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Dim currentMin, currentMax As Int";
_currentmin = 0;
_currentmax = 0;
RDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="currentMin = Max(0, PosY / cRowHeight - 30)";
_currentmin = (int) (__c.Max(0,_posy/(double)__ref._crowheight /*int*/ -30));
RDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="currentMax = Min(Data.Size - 1, (PosY + SV2.Heigh";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,(_posy+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight())/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=24313860;
 //BA.debugLineNum = 24313860;BA.debugLine="If minVisibleRow > -1 Then";
if (__ref._minvisiblerow /*int*/ >-1) { 
RDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="If minVisibleRow < currentMin Then";
if (__ref._minvisiblerow /*int*/ <_currentmin) { 
RDebugUtils.currentLine=24313863;
 //BA.debugLineNum = 24313863;BA.debugLine="For I = minVisibleRow To Min(currentMin - 1, ma";
{
final int step6 = 1;
final int limit6 = (int) (__c.Min(_currentmin-1,__ref._maxvisiblerow /*int*/ ));
_i = __ref._minvisiblerow /*int*/  ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=24313864;
 //BA.debugLineNum = 24313864;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=24313866;
 //BA.debugLineNum = 24313866;BA.debugLine="Else If minVisibleRow > currentMin Then";
if (__ref._minvisiblerow /*int*/ >_currentmin) { 
RDebugUtils.currentLine=24313868;
 //BA.debugLineNum = 24313868;BA.debugLine="For I = currentMin To Min(minVisibleRow - 1, cu";
{
final int step10 = 1;
final int limit10 = (int) (__c.Min(__ref._minvisiblerow /*int*/ -1,_currentmax));
_i = _currentmin ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=24313869;
 //BA.debugLineNum = 24313869;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
RDebugUtils.currentLine=24313872;
 //BA.debugLineNum = 24313872;BA.debugLine="If maxVisibleRow > currentMax Then";
if (__ref._maxvisiblerow /*int*/ >_currentmax) { 
RDebugUtils.currentLine=24313874;
 //BA.debugLineNum = 24313874;BA.debugLine="For I = maxVisibleRow To Max(currentMax + 1, mi";
{
final int step15 = -1;
final int limit15 = (int) (__c.Max(_currentmax+1,__ref._minvisiblerow /*int*/ ));
_i = __ref._maxvisiblerow /*int*/  ;
for (;_i >= limit15 ;_i = _i + step15 ) {
RDebugUtils.currentLine=24313875;
 //BA.debugLineNum = 24313875;BA.debugLine="HideRow(I)";
__ref._hiderow /*String*/ (null,_i);
 }
};
 }else 
{RDebugUtils.currentLine=24313877;
 //BA.debugLineNum = 24313877;BA.debugLine="Else If maxVisibleRow < currentMax Then";
if (__ref._maxvisiblerow /*int*/ <_currentmax) { 
RDebugUtils.currentLine=24313879;
 //BA.debugLineNum = 24313879;BA.debugLine="For I = currentMax To Max(maxVisibleRow + 1, cu";
{
final int step19 = -1;
final int limit19 = (int) (__c.Max(__ref._maxvisiblerow /*int*/ +1,_currentmin));
_i = _currentmax ;
for (;_i >= limit19 ;_i = _i + step19 ) {
RDebugUtils.currentLine=24313880;
 //BA.debugLineNum = 24313880;BA.debugLine="ShowRow(I)";
__ref._showrow /*void*/ (null,_i);
 }
};
 }}
;
 };
RDebugUtils.currentLine=24313884;
 //BA.debugLineNum = 24313884;BA.debugLine="minVisibleRow = currentMin";
__ref._minvisiblerow /*int*/  = _currentmin;
RDebugUtils.currentLine=24313885;
 //BA.debugLineNum = 24313885;BA.debugLine="maxVisibleRow = currentMax";
__ref._maxvisiblerow /*int*/  = _currentmax;
RDebugUtils.currentLine=24313886;
 //BA.debugLineNum = 24313886;BA.debugLine="Header.Left = -PosX + mFirstColumnsWidth";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-_posx+__ref._mfirstcolumnswidth /*int*/ ));
RDebugUtils.currentLine=24313887;
 //BA.debugLineNum = 24313887;BA.debugLine="lblStatusLine.Left = - PosX";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (-_posx));
RDebugUtils.currentLine=24313888;
 //BA.debugLineNum = 24313888;BA.debugLine="End Sub";
return "";
}
public String  _setallowselection(b4a.example.ef.table __ref,boolean _allowselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setallowselection", false))
	 {return ((String) Debug.delegate(ba, "setallowselection", new Object[] {_allowselection}));}
RDebugUtils.currentLine=26476544;
 //BA.debugLineNum = 26476544;BA.debugLine="Public Sub setAllowSelection(AllowSelection As Boo";
RDebugUtils.currentLine=26476545;
 //BA.debugLineNum = 26476545;BA.debugLine="cAllowSelection = AllowSelection";
__ref._callowselection /*boolean*/  = _allowselection;
RDebugUtils.currentLine=26476546;
 //BA.debugLineNum = 26476546;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=26476547;
 //BA.debugLineNum = 26476547;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
 };
RDebugUtils.currentLine=26476549;
 //BA.debugLineNum = 26476549;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32571392;
 //BA.debugLineNum = 32571392;BA.debugLine="Public Sub SetAutomaticWidths";
RDebugUtils.currentLine=32571393;
 //BA.debugLineNum = 32571393;BA.debugLine="Dim row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=32571394;
 //BA.debugLineNum = 32571394;BA.debugLine="Dim Vals(mNumberOfColumns) As String";
_vals = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_vals,"");
RDebugUtils.currentLine=32571395;
 //BA.debugLineNum = 32571395;BA.debugLine="Dim Width, Widths(mNumberOfColumns) As Int";
_width = 0;
_widths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=32571397;
 //BA.debugLineNum = 32571397;BA.debugLine="cAutomaticWidths = True";
__ref._cautomaticwidths /*boolean*/  = __c.True;
RDebugUtils.currentLine=32571399;
 //BA.debugLineNum = 32571399;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=32571400;
 //BA.debugLineNum = 32571400;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=32571401;
 //BA.debugLineNum = 32571401;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=32571403;
 //BA.debugLineNum = 32571403;BA.debugLine="Widths(col) = cvs.MeasureStringWidth(HeaderName";
_widths[_col] = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(BA.ObjectToString(__ref._headernames /*anywheresoftware.b4a.objects.collections.List*/ .Get(_col)),(android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=32571406;
 //BA.debugLineNum = 32571406;BA.debugLine="For row = 0 To Data.Size - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit11 ;_row = _row + step11 ) {
RDebugUtils.currentLine=32571407;
 //BA.debugLineNum = 32571407;BA.debugLine="Vals = Data.Get(row)";
_vals = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=32571408;
 //BA.debugLineNum = 32571408;BA.debugLine="If MultiTypeFace = False Then";
if (__ref._multitypeface /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=32571409;
 //BA.debugLineNum = 32571409;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 }else {
RDebugUtils.currentLine=32571411;
 //BA.debugLineNum = 32571411;BA.debugLine="Width = cvs.MeasureStringWidth(Vals(col), cTyp";
_width = (int) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringWidth(_vals[_col],(android.graphics.Typeface)(__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()),__ref._ctextsize /*float*/ )+__ref._extrawidth /*int*/ );
 };
RDebugUtils.currentLine=32571413;
 //BA.debugLineNum = 32571413;BA.debugLine="If Widths(col) < Width Then";
if (_widths[_col]<_width) { 
RDebugUtils.currentLine=32571414;
 //BA.debugLineNum = 32571414;BA.debugLine="Widths(col) = Width";
_widths[_col] = _width;
 };
 }
};
 }
};
RDebugUtils.currentLine=32571418;
 //BA.debugLineNum = 32571418;BA.debugLine="SetColumnsWidths(Widths)";
__ref._setcolumnswidths /*String*/ (null,_widths);
RDebugUtils.currentLine=32571419;
 //BA.debugLineNum = 32571419;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignment", false))
	 {return ((String) Debug.delegate(ba, "setcellalignment", new Object[] {_alignment}));}
int _i = 0;
RDebugUtils.currentLine=28180480;
 //BA.debugLineNum = 28180480;BA.debugLine="Public Sub setCellAlignment(Alignment As Int)";
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=28180483;
 //BA.debugLineNum = 28180483;BA.debugLine="cAlignment = Alignment";
__ref._calignment /*int*/  = _alignment;
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28180485;
 //BA.debugLineNum = 28180485;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=28180486;
 //BA.debugLineNum = 28180486;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
RDebugUtils.currentLine=28180488;
 //BA.debugLineNum = 28180488;BA.debugLine="MultiAlignments = False";
__ref._multialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=28180489;
 //BA.debugLineNum = 28180489;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=28180490;
 //BA.debugLineNum = 28180490;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=28180492;
 //BA.debugLineNum = 28180492;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setcellalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Public Sub SetCellAlignmentColN(Col As Int, Alignm";
RDebugUtils.currentLine=28246017;
 //BA.debugLineNum = 28246017;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=28246019;
 //BA.debugLineNum = 28246019;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=28246020;
 //BA.debugLineNum = 28246020;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=28246021;
 //BA.debugLineNum = 28246021;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=28246022;
 //BA.debugLineNum = 28246022;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=28246025;
 //BA.debugLineNum = 28246025;BA.debugLine="If MultiAlignments = False Then";
if (__ref._multialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=28246026;
 //BA.debugLineNum = 28246026;BA.debugLine="Dim cAlignments(mNumberOfColumns) As Int";
_calignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28246027;
 //BA.debugLineNum = 28246027;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=28246028;
 //BA.debugLineNum = 28246028;BA.debugLine="cAlignments(i) = cAlignment";
__ref._calignments /*int[]*/ [_i] = __ref._calignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=28246031;
 //BA.debugLineNum = 28246031;BA.debugLine="cAlignments(Col) = AlignmentColN";
__ref._calignments /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=28246032;
 //BA.debugLineNum = 28246032;BA.debugLine="cAlignments0 = cAlignments";
__ref._calignments0 /*int[]*/  = __ref._calignments /*int[]*/ ;
RDebugUtils.currentLine=28246034;
 //BA.debugLineNum = 28246034;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=28246035;
 //BA.debugLineNum = 28246035;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=28246036;
 //BA.debugLineNum = 28246036;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=28246038;
 //BA.debugLineNum = 28246038;BA.debugLine="End Sub";
return "";
}
public String  _setcellalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcellalignments", false))
	 {return ((String) Debug.delegate(ba, "setcellalignments", new Object[] {_alignments}));}
RDebugUtils.currentLine=28114944;
 //BA.debugLineNum = 28114944;BA.debugLine="Public Sub SetCellAlignments(Alignments() As Int)";
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=28114947;
 //BA.debugLineNum = 28114947;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=28114950;
 //BA.debugLineNum = 28114950;BA.debugLine="cAlignments0 = Alignments";
__ref._calignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=28114951;
 //BA.debugLineNum = 28114951;BA.debugLine="cAlignments = cAlignments0";
__ref._calignments /*int[]*/  = __ref._calignments0 /*int[]*/ ;
RDebugUtils.currentLine=28114953;
 //BA.debugLineNum = 28114953;BA.debugLine="MultiAlignments = True";
__ref._multialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=28114954;
 //BA.debugLineNum = 28114954;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=28114955;
 //BA.debugLineNum = 28114955;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=28114957;
 //BA.debugLineNum = 28114957;BA.debugLine="End Sub";
return "";
}
public String  _setcolumncolors(b4a.example.ef.table __ref,int[] _columncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setcolumncolors", new Object[] {_columncolors}));}
int _i = 0;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=31719424;
 //BA.debugLineNum = 31719424;BA.debugLine="Public Sub SetColumnColors(ColumnColors() As Int)";
RDebugUtils.currentLine=31719425;
 //BA.debugLineNum = 31719425;BA.debugLine="cColumnColors = ColumnColors";
__ref._ccolumncolors /*int[]*/  = _columncolors;
RDebugUtils.currentLine=31719427;
 //BA.debugLineNum = 31719427;BA.debugLine="Dim ColumnDrawables(cColumnColors.Length) As Obje";
_columndrawables = new Object[__ref._ccolumncolors /*int[]*/ .length];
{
int d0 = _columndrawables.length;
for (int i0 = 0;i0 < d0;i0++) {
_columndrawables[i0] = new Object();
}
}
;
RDebugUtils.currentLine=31719428;
 //BA.debugLineNum = 31719428;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step3 = 1;
final int limit3 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=31719429;
 //BA.debugLineNum = 31719429;BA.debugLine="Private cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=31719430;
 //BA.debugLineNum = 31719430;BA.debugLine="cd.Initialize(cColumnColors(i), 0)";
_cd.Initialize(__ref._ccolumncolors /*int[]*/ [_i],(int) (0));
RDebugUtils.currentLine=31719431;
 //BA.debugLineNum = 31719431;BA.debugLine="ColumnDrawables(i) = cd";
__ref._columndrawables /*Object[]*/ [_i] = (Object)(_cd.getObject());
 }
};
RDebugUtils.currentLine=31719434;
 //BA.debugLineNum = 31719434;BA.debugLine="If ColumnColors.Length > 1 Then";
if (_columncolors.length>1) { 
RDebugUtils.currentLine=31719435;
 //BA.debugLineNum = 31719435;BA.debugLine="cUseColumnColors = True";
__ref._cusecolumncolors /*boolean*/  = __c.True;
 }else {
RDebugUtils.currentLine=31719437;
 //BA.debugLineNum = 31719437;BA.debugLine="cUseColumnColors = False";
__ref._cusecolumncolors /*boolean*/  = __c.False;
 };
RDebugUtils.currentLine=31719439;
 //BA.debugLineNum = 31719439;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=31719440;
 //BA.debugLineNum = 31719440;BA.debugLine="RefreshTable";
__ref._refreshtable /*String*/ (null);
 };
RDebugUtils.currentLine=31719442;
 //BA.debugLineNum = 31719442;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatype(b4a.example.ef.table __ref,int _column,String _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatype", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatype", new Object[] {_column,_datatype}));}
RDebugUtils.currentLine=33030144;
 //BA.debugLineNum = 33030144;BA.debugLine="Public Sub SetColumnDataType(Column As Int, DataTy";
RDebugUtils.currentLine=33030145;
 //BA.debugLineNum = 33030145;BA.debugLine="If Column < 0 Or Column > mNumberOfColumns - 1 Th";
if (_column<0 || _column>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=33030146;
 //BA.debugLineNum = 33030146;BA.debugLine="ToastMessageShow(\"Wrong column index\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong column index"),__c.False);
RDebugUtils.currentLine=33030147;
 //BA.debugLineNum = 33030147;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33030150;
 //BA.debugLineNum = 33030150;BA.debugLine="If DataType <> \"T\" And DataType <> \"R\" And DataTy";
if ((_datatype).equals("T") == false && (_datatype).equals("R") == false && (_datatype).equals("I") == false) { 
RDebugUtils.currentLine=33030151;
 //BA.debugLineNum = 33030151;BA.debugLine="ToastMessageShow(\"Wrong data type only TEXT abd";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only TEXT abd NUMBER are allowed"),__c.False);
 }else {
RDebugUtils.currentLine=33030153;
 //BA.debugLineNum = 33030153;BA.debugLine="cColumnDataType(Column) = DataType";
__ref._ccolumndatatype /*String[]*/ [_column] = _datatype;
 };
RDebugUtils.currentLine=33030155;
 //BA.debugLineNum = 33030155;BA.debugLine="End Sub";
return "";
}
public String  _setcolumndatatypes(b4a.example.ef.table __ref,String[] _datatype) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setcolumndatatypes", false))
	 {return ((String) Debug.delegate(ba, "setcolumndatatypes", new Object[] {_datatype}));}
int _col = 0;
RDebugUtils.currentLine=33161216;
 //BA.debugLineNum = 33161216;BA.debugLine="Public Sub SetColumnDataTypes(DataType() As String";
RDebugUtils.currentLine=33161217;
 //BA.debugLineNum = 33161217;BA.debugLine="If DataType.Length <> mNumberOfColumns Then";
if (_datatype.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=33161218;
 //BA.debugLineNum = 33161218;BA.debugLine="ToastMessageShow(\"Wrong number of columns\", Fals";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong number of columns"),__c.False);
RDebugUtils.currentLine=33161219;
 //BA.debugLineNum = 33161219;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=33161222;
 //BA.debugLineNum = 33161222;BA.debugLine="For Col = 0 To mNumberOfColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=33161223;
 //BA.debugLineNum = 33161223;BA.debugLine="If DataType(Col) <> \"T\" And DataType(Col) <> \"R\"";
if ((_datatype[_col]).equals("T") == false && (_datatype[_col]).equals("R") == false && (_datatype[_col]).equals("I") == false) { 
RDebugUtils.currentLine=33161224;
 //BA.debugLineNum = 33161224;BA.debugLine="ToastMessageShow(\"Wrong data type only T, R and";
__c.ToastMessageShow(BA.ObjectToCharSequence("Wrong data type only T, R and I are allowed"),__c.False);
RDebugUtils.currentLine=33161225;
 //BA.debugLineNum = 33161225;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=33161229;
 //BA.debugLineNum = 33161229;BA.debugLine="cColumnDataType = DataType";
__ref._ccolumndatatype /*String[]*/  = _datatype;
RDebugUtils.currentLine=33161230;
 //BA.debugLineNum = 33161230;BA.debugLine="End Sub";
return "";
}
public String  _setfastscroll(b4a.example.ef.table __ref,boolean _fastscroll) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscroll", false))
	 {return ((String) Debug.delegate(ba, "setfastscroll", new Object[] {_fastscroll}));}
RDebugUtils.currentLine=34471936;
 //BA.debugLineNum = 34471936;BA.debugLine="Public Sub setFastScroll (FastScroll As Boolean)";
RDebugUtils.currentLine=34471937;
 //BA.debugLineNum = 34471937;BA.debugLine="mFastScroll = FastScroll";
__ref._mfastscroll /*boolean*/  = _fastscroll;
RDebugUtils.currentLine=34471938;
 //BA.debugLineNum = 34471938;BA.debugLine="pnlFastScroll.Visible = False";
__ref._pnlfastscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=34471939;
 //BA.debugLineNum = 34471939;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=34471940;
 //BA.debugLineNum = 34471940;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollcolumnindex(b4a.example.ef.table __ref,int _fastscrollcolumnindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollcolumnindex", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollcolumnindex", new Object[] {_fastscrollcolumnindex}));}
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Public Sub setFastScrollColumnIndex (FastScrollCol";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="mFastScrollColumnIndex = Max(0, FastScrollColumnI";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Max(0,_fastscrollcolumnindex));
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="mFastScrollColumnIndex = Min(mFastScrollColumnInd";
__ref._mfastscrollcolumnindex /*int*/  = (int) (__c.Min(__ref._mfastscrollcolumnindex /*int*/ ,__ref._mnumberofcolumns /*int*/ -1));
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollfixedlabel(b4a.example.ef.table __ref,boolean _fastscrollfixedlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollfixedlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollfixedlabel", new Object[] {_fastscrollfixedlabel}));}
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Public Sub setFastScrollFixedLabel (FastScrollFixe";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="mFastScrollFixedLabel = FastScrollFixedLabel";
__ref._mfastscrollfixedlabel /*boolean*/  = _fastscrollfixedlabel;
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=34996230;
 //BA.debugLineNum = 34996230;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=34996233;
 //BA.debugLineNum = 34996233;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=34996234;
 //BA.debugLineNum = 34996234;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelheight", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelheight", new Object[] {_height}));}
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Public Sub setFastScrollLabelHeight(Height As Int)";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="mFastScrollLabelHeight = Height";
__ref._mfastscrolllabelheight /*int*/  = _height;
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="lblFastScroll.Height = mFastScrollLabelHeight";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setHeight(__ref._mfastscrolllabelheight /*int*/ );
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="FscLabelTopDelta = SV2.Top + (FScCursorHeight -";
__ref._fsclabeltopdelta /*int*/  = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+(__ref._fsccursorheight /*int*/ -__ref._mfastscrolllabelheight /*int*/ )/(double)2);
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="lblFastScroll.Top = pnlFastScrollCursor.Top + Fs";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._pnlfastscrollcursor /*anywheresoftware.b4a.objects.PanelWrapper*/ .getTop()+__ref._fsclabeltopdelta /*int*/ ));
 }else {
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="lblFastScroll.Top = (SV2.Height - lblFastScroll.";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) ((__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()-__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .getHeight())/(double)2+__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()));
 };
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelmaxchars(b4a.example.ef.table __ref,int _fastscrolllabelmaxchars) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelmaxchars", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelmaxchars", new Object[] {_fastscrolllabelmaxchars}));}
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Public Sub setFastScrollLabelMaxChars(FastScrollLa";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="mFastScrollLabelMaxChars = FastScrollLabelMaxChar";
__ref._mfastscrolllabelmaxchars /*int*/  = _fastscrolllabelmaxchars;
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrolllabelwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrolllabelwidth", false))
	 {return ((String) Debug.delegate(ba, "setfastscrolllabelwidth", new Object[] {_width}));}
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Public Sub setFastScrollLabelWidth(Width As Int)";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="mFastScrollLabelWidth = Width";
__ref._mfastscrolllabelwidth /*int*/  = _width;
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="lblFastScroll.Width = mFastScrollLabelWidth";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setWidth(__ref._mfastscrolllabelwidth /*int*/ );
RDebugUtils.currentLine=35258371;
 //BA.debugLineNum = 35258371;BA.debugLine="If mFastScrollFixedLabel = False Then";
if (__ref._mfastscrollfixedlabel /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=35258372;
 //BA.debugLineNum = 35258372;BA.debugLine="lblFastScroll.Left = cWidth - mFastScrollLabelWi";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (__ref._cwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ -__ref._mfastscrolllabelwidth /*int*/ ));
 }else {
RDebugUtils.currentLine=35258374;
 //BA.debugLineNum = 35258374;BA.debugLine="lblFastScroll.Left = 0";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setLeft((int) (0));
 };
RDebugUtils.currentLine=35258376;
 //BA.debugLineNum = 35258376;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollminitems(b4a.example.ef.table __ref,int _fastscrollminitems) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollminitems", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollminitems", new Object[] {_fastscrollminitems}));}
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Public Sub setFastScrollMinItems (FastScrollMinIte";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="mFastScrollMinItems = FastScrollMinItems";
__ref._mfastscrollminitems /*int*/  = _fastscrollminitems;
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="End Sub";
return "";
}
public String  _setfastscrollshowlabel(b4a.example.ef.table __ref,boolean _fastscrollshowlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfastscrollshowlabel", false))
	 {return ((String) Debug.delegate(ba, "setfastscrollshowlabel", new Object[] {_fastscrollshowlabel}));}
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Public Sub setFastScrollShowLabel (FastScrollShowL";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="mFastScrollShowLabel = FastScrollShowLabel";
__ref._mfastscrollshowlabel /*boolean*/  = _fastscrollshowlabel;
RDebugUtils.currentLine=34865154;
 //BA.debugLineNum = 34865154;BA.debugLine="lblFastScroll.Visible = False";
__ref._lblfastscroll /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=34865155;
 //BA.debugLineNum = 34865155;BA.debugLine="End Sub";
return "";
}
public String  _setfirstcolumnfixed(b4a.example.ef.table __ref,boolean _firstcolumnfixed) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setfirstcolumnfixed", false))
	 {return ((String) Debug.delegate(ba, "setfirstcolumnfixed", new Object[] {_firstcolumnfixed}));}
RDebugUtils.currentLine=34209792;
 //BA.debugLineNum = 34209792;BA.debugLine="Public Sub setFirstColumnFixed(FirstColumnFixed As";
RDebugUtils.currentLine=34209793;
 //BA.debugLineNum = 34209793;BA.debugLine="If FirstColumnFixed = True Then";
if (_firstcolumnfixed==__c.True) { 
RDebugUtils.currentLine=34209794;
 //BA.debugLineNum = 34209794;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=34209795;
 //BA.debugLineNum = 34209795;BA.debugLine="setNumberOfFixedColumns(1)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (1));
 };
 }else {
RDebugUtils.currentLine=34209798;
 //BA.debugLineNum = 34209798;BA.debugLine="If mNumberOfFixedColumns = 1 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==1) { 
RDebugUtils.currentLine=34209799;
 //BA.debugLineNum = 34209799;BA.debugLine="setNumberOfFixedColumns(0)";
__ref._setnumberoffixedcolumns /*String*/ (null,(int) (0));
 };
 };
RDebugUtils.currentLine=34209802;
 //BA.debugLineNum = 34209802;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=34078720;
 //BA.debugLineNum = 34078720;BA.debugLine="Public Sub setNumberOfFixedColumns(NumberOfFixedCo";
RDebugUtils.currentLine=34078721;
 //BA.debugLineNum = 34078721;BA.debugLine="NumberOfFixedColumns = Max(0, Min(3, NumberOfFixe";
_numberoffixedcolumns = (int) (__c.Max(0,__c.Min(3,_numberoffixedcolumns)));
RDebugUtils.currentLine=34078722;
 //BA.debugLineNum = 34078722;BA.debugLine="If mNumberOfFixedColumns = NumberOfFixedColumns T";
if (__ref._mnumberoffixedcolumns /*int*/ ==_numberoffixedcolumns) { 
RDebugUtils.currentLine=34078723;
 //BA.debugLineNum = 34078723;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=34078726;
 //BA.debugLineNum = 34078726;BA.debugLine="If Header.NumberOfViews = 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=34078727;
 //BA.debugLineNum = 34078727;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns	'Ne";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
 }else {
RDebugUtils.currentLine=34078729;
 //BA.debugLineNum = 34078729;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=34078731;
 //BA.debugLineNum = 34078731;BA.debugLine="Private Headers(mNumberOfColumns) As String";
_headers = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_headers,"");
RDebugUtils.currentLine=34078732;
 //BA.debugLineNum = 34078732;BA.debugLine="If HeaderFirst.NumberOfViews = 0 Then";
if (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()==0) { 
RDebugUtils.currentLine=34078733;
 //BA.debugLineNum = 34078733;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=34078734;
 //BA.debugLineNum = 34078734;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=34078735;
 //BA.debugLineNum = 34078735;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=34078736;
 //BA.debugLineNum = 34078736;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 }else {
RDebugUtils.currentLine=34078739;
 //BA.debugLineNum = 34078739;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step17 = 1;
final int limit17 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit17 ;_col = _col + step17 ) {
RDebugUtils.currentLine=34078740;
 //BA.debugLineNum = 34078740;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=34078741;
 //BA.debugLineNum = 34078741;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=34078742;
 //BA.debugLineNum = 34078742;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
RDebugUtils.currentLine=34078744;
 //BA.debugLineNum = 34078744;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=34078745;
 //BA.debugLineNum = 34078745;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=34078746;
 //BA.debugLineNum = 34078746;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=34078747;
 //BA.debugLineNum = 34078747;BA.debugLine="Headers(col) = lbl.Text";
_headers[_col] = _lbl.getText();
 }
};
 };
RDebugUtils.currentLine=34078751;
 //BA.debugLineNum = 34078751;BA.debugLine="HeaderFirst.RemoveAllViews";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=34078752;
 //BA.debugLineNum = 34078752;BA.debugLine="Header.RemoveAllViews";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .RemoveAllViews();
RDebugUtils.currentLine=34078754;
 //BA.debugLineNum = 34078754;BA.debugLine="mNumberOfFixedColumns = NumberOfFixedColumns";
__ref._mnumberoffixedcolumns /*int*/  = _numberoffixedcolumns;
RDebugUtils.currentLine=34078756;
 //BA.debugLineNum = 34078756;BA.debugLine="innerClearAll(mNumberOfColumns, False)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.False);
RDebugUtils.currentLine=34078757;
 //BA.debugLineNum = 34078757;BA.debugLine="SetHeader(Headers)";
__ref._setheader /*String*/ (null,_headers);
RDebugUtils.currentLine=34078758;
 //BA.debugLineNum = 34078758;BA.debugLine="SetColumnsWidths(ColumnWidths)";
__ref._setcolumnswidths /*String*/ (null,__ref._columnwidths /*int[]*/ );
RDebugUtils.currentLine=34078759;
 //BA.debugLineNum = 34078759;BA.debugLine="SV2.Panel.Height = Data.Size * cRowHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setHeight((int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()*__ref._crowheight /*int*/ ));
RDebugUtils.currentLine=34078760;
 //BA.debugLineNum = 34078760;BA.debugLine="SVF.Panel.Height = SV2.Panel.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getHeight());
RDebugUtils.currentLine=34078763;
 //BA.debugLineNum = 34078763;BA.debugLine="Private currentMax As Int";
_currentmax = 0;
RDebugUtils.currentLine=34078764;
 //BA.debugLineNum = 34078764;BA.debugLine="currentMax = Min(Data.Size - 1, SV2.Height / cRo";
_currentmax = (int) (__c.Min(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1,__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()/(double)__ref._crowheight /*int*/ +30));
RDebugUtils.currentLine=34078766;
 //BA.debugLineNum = 34078766;BA.debugLine="For row = 0 To currentMax";
{
final int step38 = 1;
final int limit38 = _currentmax;
_row = (int) (0) ;
for (;_row <= limit38 ;_row = _row + step38 ) {
RDebugUtils.currentLine=34078767;
 //BA.debugLineNum = 34078767;BA.debugLine="ShowRow(row)";
__ref._showrow /*void*/ (null,_row);
 }
};
 };
RDebugUtils.currentLine=34078771;
 //BA.debugLineNum = 34078771;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignment(b4a.example.ef.table __ref,int _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignment", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignment", new Object[] {_alignment}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Public Sub setHeaderAlignment(Alignment As Int)";
RDebugUtils.currentLine=28704769;
 //BA.debugLineNum = 28704769;BA.debugLine="cHeaderAlignment = Alignment";
__ref._cheaderalignment /*int*/  = _alignment;
RDebugUtils.currentLine=28704771;
 //BA.debugLineNum = 28704771;BA.debugLine="If cHeaderAlignments.Length = 0 Then";
if (__ref._cheaderalignments /*int[]*/ .length==0) { 
RDebugUtils.currentLine=28704772;
 //BA.debugLineNum = 28704772;BA.debugLine="Private cHeaderAlignments(mNumberOfColumns) As I";
_cheaderalignments = new int[__ref._mnumberofcolumns /*int*/ ];
;
 };
RDebugUtils.currentLine=28704775;
 //BA.debugLineNum = 28704775;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=28704776;
 //BA.debugLineNum = 28704776;BA.debugLine="HeaderMultiAlignments = False";
__ref._headermultialignments /*boolean*/  = __c.False;
RDebugUtils.currentLine=28704777;
 //BA.debugLineNum = 28704777;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=28704778;
 //BA.debugLineNum = 28704778;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=28704779;
 //BA.debugLineNum = 28704779;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit9 ;_col = _col + step9 ) {
RDebugUtils.currentLine=28704780;
 //BA.debugLineNum = 28704780;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28704781;
 //BA.debugLineNum = 28704781;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28704782;
 //BA.debugLineNum = 28704782;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=28704784;
 //BA.debugLineNum = 28704784;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step14 = 1;
final int limit14 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit14 ;_col = _col + step14 ) {
RDebugUtils.currentLine=28704785;
 //BA.debugLineNum = 28704785;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28704786;
 //BA.debugLineNum = 28704786;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=28704787;
 //BA.debugLineNum = 28704787;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=28704790;
 //BA.debugLineNum = 28704790;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit20 ;_col = _col + step20 ) {
RDebugUtils.currentLine=28704791;
 //BA.debugLineNum = 28704791;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28704792;
 //BA.debugLineNum = 28704792;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28704793;
 //BA.debugLineNum = 28704793;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=28704797;
 //BA.debugLineNum = 28704797;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignmentcoln(b4a.example.ef.table __ref,int _col,int _alignmentcoln) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignmentcoln", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignmentcoln", new Object[] {_col,_alignmentcoln}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Public Sub SetHeaderAlignmentColN(Col As Int, Alig";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=28377091;
 //BA.debugLineNum = 28377091;BA.debugLine="Col = Max(0, Col)";
_col = (int) (__c.Max(0,_col));
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="If Col > mNumberOfColumns - 1 Then";
if (_col>__ref._mnumberofcolumns /*int*/ -1) { 
RDebugUtils.currentLine=28377093;
 //BA.debugLineNum = 28377093;BA.debugLine="ToastMessageShow(\"The column index is higher tha";
__c.ToastMessageShow(BA.ObjectToCharSequence("The column index is higher than the number of columns."),__c.False);
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="If HeaderMultiAlignments = False Then";
if (__ref._headermultialignments /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=28377098;
 //BA.debugLineNum = 28377098;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28377099;
 //BA.debugLineNum = 28377099;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step9 = 1;
final int limit9 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=28377100;
 //BA.debugLineNum = 28377100;BA.debugLine="cHeaderAlignments0(i) = cHeaderAlignment";
__ref._cheaderalignments0 /*int[]*/ [_i] = __ref._cheaderalignment /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=28377103;
 //BA.debugLineNum = 28377103;BA.debugLine="cHeaderAlignments0(Col) = AlignmentColN";
__ref._cheaderalignments0 /*int[]*/ [_col] = _alignmentcoln;
RDebugUtils.currentLine=28377104;
 //BA.debugLineNum = 28377104;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=28377105;
 //BA.debugLineNum = 28377105;BA.debugLine="If Header.NumberOfViews > 0 Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=28377106;
 //BA.debugLineNum = 28377106;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=28377107;
 //BA.debugLineNum = 28377107;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28377108;
 //BA.debugLineNum = 28377108;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28377109;
 //BA.debugLineNum = 28377109;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=28377111;
 //BA.debugLineNum = 28377111;BA.debugLine="For i = 0 To mNumberOfFixedColumns - 1";
{
final int step21 = 1;
final int limit21 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
RDebugUtils.currentLine=28377112;
 //BA.debugLineNum = 28377112;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28377113;
 //BA.debugLineNum = 28377113;BA.debugLine="If Col < mNumberOfFixedColumns Then";
if (_col<__ref._mnumberoffixedcolumns /*int*/ ) { 
RDebugUtils.currentLine=28377114;
 //BA.debugLineNum = 28377114;BA.debugLine="lbl = HeaderFirst.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28377115;
 //BA.debugLineNum = 28377115;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }else {
RDebugUtils.currentLine=28377117;
 //BA.debugLineNum = 28377117;BA.debugLine="lbl = Header.GetView(Col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28377118;
 //BA.debugLineNum = 28377118;BA.debugLine="lbl.Gravity = cHeaderAlignments(Col + mNumber";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [(int) (_col+__ref._mnumberoffixedcolumns /*int*/ )]);
 };
 }
};
 };
 };
RDebugUtils.currentLine=28377123;
 //BA.debugLineNum = 28377123;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=28377124;
 //BA.debugLineNum = 28377124;BA.debugLine="End Sub";
return "";
}
public String  _setheaderalignments(b4a.example.ef.table __ref,int[] _alignments) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderalignments", false))
	 {return ((String) Debug.delegate(ba, "setheaderalignments", new Object[] {_alignments}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Public Sub SetHeaderAlignments(Alignments() As Int";
RDebugUtils.currentLine=28311553;
 //BA.debugLineNum = 28311553;BA.debugLine="If Alignments.Length <> mNumberOfColumns Then";
if (_alignments.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=28311554;
 //BA.debugLineNum = 28311554;BA.debugLine="ToastMessageShow(\"The number of aligments is not";
__c.ToastMessageShow(BA.ObjectToCharSequence("The number of aligments is not equal to the number of columns."),__c.False);
RDebugUtils.currentLine=28311555;
 //BA.debugLineNum = 28311555;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=28311558;
 //BA.debugLineNum = 28311558;BA.debugLine="Dim col As Int";
_col = 0;
RDebugUtils.currentLine=28311559;
 //BA.debugLineNum = 28311559;BA.debugLine="Dim cHeaderAlignments0(mNumberOfColumns) As Int";
_cheaderalignments0 = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=28311561;
 //BA.debugLineNum = 28311561;BA.debugLine="cHeaderAlignments0 = Alignments";
__ref._cheaderalignments0 /*int[]*/  = _alignments;
RDebugUtils.currentLine=28311562;
 //BA.debugLineNum = 28311562;BA.debugLine="cHeaderAlignments = cHeaderAlignments0";
__ref._cheaderalignments /*int[]*/  = __ref._cheaderalignments0 /*int[]*/ ;
RDebugUtils.currentLine=28311563;
 //BA.debugLineNum = 28311563;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=28311564;
 //BA.debugLineNum = 28311564;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=28311565;
 //BA.debugLineNum = 28311565;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step11 = 1;
final int limit11 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit11 ;_col = _col + step11 ) {
RDebugUtils.currentLine=28311566;
 //BA.debugLineNum = 28311566;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28311567;
 //BA.debugLineNum = 28311567;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28311568;
 //BA.debugLineNum = 28311568;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=28311570;
 //BA.debugLineNum = 28311570;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=28311571;
 //BA.debugLineNum = 28311571;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28311572;
 //BA.debugLineNum = 28311572;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=28311573;
 //BA.debugLineNum = 28311573;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=28311576;
 //BA.debugLineNum = 28311576;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit22 ;_col = _col + step22 ) {
RDebugUtils.currentLine=28311577;
 //BA.debugLineNum = 28311577;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28311578;
 //BA.debugLineNum = 28311578;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28311579;
 //BA.debugLineNum = 28311579;BA.debugLine="lbl.Gravity = cHeaderAlignments(col)";
_lbl.setGravity(__ref._cheaderalignments /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=28311583;
 //BA.debugLineNum = 28311583;BA.debugLine="HeaderMultiAlignments = True";
__ref._headermultialignments /*boolean*/  = __c.True;
RDebugUtils.currentLine=28311584;
 //BA.debugLineNum = 28311584;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolor", false))
	 {return ((String) Debug.delegate(ba, "setheadercolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28966912;
 //BA.debugLineNum = 28966912;BA.debugLine="Public Sub setHeaderColor(Color As Int)";
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="cHeaderColor = Color";
__ref._cheadercolor /*int*/  = _color;
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=28966917;
 //BA.debugLineNum = 28966917;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=28966919;
 //BA.debugLineNum = 28966919;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28966920;
 //BA.debugLineNum = 28966920;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28966921;
 //BA.debugLineNum = 28966921;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
RDebugUtils.currentLine=28966923;
 //BA.debugLineNum = 28966923;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=28966924;
 //BA.debugLineNum = 28966924;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28966925;
 //BA.debugLineNum = 28966925;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=28966926;
 //BA.debugLineNum = 28966926;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=28966929;
 //BA.debugLineNum = 28966929;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=28966930;
 //BA.debugLineNum = 28966930;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28966931;
 //BA.debugLineNum = 28966931;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28966932;
 //BA.debugLineNum = 28966932;BA.debugLine="lbl.Color = cHeaderColor";
_lbl.setColor(__ref._cheadercolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=28966936;
 //BA.debugLineNum = 28966936;BA.debugLine="End Sub";
return "";
}
public String  _setheadercolors(b4a.example.ef.table __ref,int[] _headercolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadercolors", false))
	 {return ((String) Debug.delegate(ba, "setheadercolors", new Object[] {_headercolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=31981568;
 //BA.debugLineNum = 31981568;BA.debugLine="Public Sub SetHeaderColors(HeaderColors() As Int)";
RDebugUtils.currentLine=31981569;
 //BA.debugLineNum = 31981569;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=31981571;
 //BA.debugLineNum = 31981571;BA.debugLine="cHeaderColors = HeaderColors";
__ref._cheadercolors /*int[]*/  = _headercolors;
RDebugUtils.currentLine=31981572;
 //BA.debugLineNum = 31981572;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=31981573;
 //BA.debugLineNum = 31981573;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=31981574;
 //BA.debugLineNum = 31981574;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=31981575;
 //BA.debugLineNum = 31981575;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31981576;
 //BA.debugLineNum = 31981576;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=31981577;
 //BA.debugLineNum = 31981577;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=31981579;
 //BA.debugLineNum = 31981579;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=31981580;
 //BA.debugLineNum = 31981580;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31981581;
 //BA.debugLineNum = 31981581;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=31981582;
 //BA.debugLineNum = 31981582;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=31981585;
 //BA.debugLineNum = 31981585;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=31981586;
 //BA.debugLineNum = 31981586;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31981587;
 //BA.debugLineNum = 31981587;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=31981588;
 //BA.debugLineNum = 31981588;BA.debugLine="lbl.Color = cHeaderColors(col)";
_lbl.setColor(__ref._cheadercolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=31981592;
 //BA.debugLineNum = 31981592;BA.debugLine="End Sub";
return "";
}
public String  _setheaderheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheaderheight", false))
	 {return ((String) Debug.delegate(ba, "setheaderheight", new Object[] {_height}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Public Sub setHeaderHeight(Height As Int)";
RDebugUtils.currentLine=28835841;
 //BA.debugLineNum = 28835841;BA.debugLine="cHeaderHeight = Height";
__ref._cheaderheight /*int*/  = _height;
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=28835843;
 //BA.debugLineNum = 28835843;BA.debugLine="Header.Height = cHeaderHeight";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=28835844;
 //BA.debugLineNum = 28835844;BA.debugLine="HeaderFirst.Height = cHeaderHeight";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=28835845;
 //BA.debugLineNum = 28835845;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=28835846;
 //BA.debugLineNum = 28835846;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=28835847;
 //BA.debugLineNum = 28835847;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=28835848;
 //BA.debugLineNum = 28835848;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28835849;
 //BA.debugLineNum = 28835849;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28835850;
 //BA.debugLineNum = 28835850;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
RDebugUtils.currentLine=28835852;
 //BA.debugLineNum = 28835852;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=28835853;
 //BA.debugLineNum = 28835853;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28835854;
 //BA.debugLineNum = 28835854;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=28835855;
 //BA.debugLineNum = 28835855;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=28835858;
 //BA.debugLineNum = 28835858;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=28835859;
 //BA.debugLineNum = 28835859;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=28835860;
 //BA.debugLineNum = 28835860;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=28835861;
 //BA.debugLineNum = 28835861;BA.debugLine="lbl.Height = cHeaderHeight";
_lbl.setHeight(__ref._cheaderheight /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=28835865;
 //BA.debugLineNum = 28835865;BA.debugLine="SV2.Top = cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=28835866;
 //BA.debugLineNum = 28835866;BA.debugLine="SVF.Top = cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setTop(__ref._cheaderheight /*int*/ );
RDebugUtils.currentLine=28835867;
 //BA.debugLineNum = 28835867;BA.debugLine="If cShowStatusLine = True Then";
if (__ref._cshowstatusline /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=28835868;
 //BA.debugLineNum = 28835868;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight -";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ -__ref._cstatuslineheight /*int*/ ));
 }else {
RDebugUtils.currentLine=28835870;
 //BA.debugLineNum = 28835870;BA.debugLine="SV2.Height = pnlTable.Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight()-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=28835872;
 //BA.debugLineNum = 28835872;BA.debugLine="SVF.Height = SV2.Height";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight());
RDebugUtils.currentLine=28835873;
 //BA.debugLineNum = 28835873;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
 };
RDebugUtils.currentLine=28835875;
 //BA.debugLineNum = 28835875;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolor", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolor", new Object[] {_color}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Public Sub setHeaderTextColor(Color As Int)";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="cHeaderTextColor = Color";
__ref._cheadertextcolor /*int*/  = _color;
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=29097989;
 //BA.debugLineNum = 29097989;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=29097990;
 //BA.debugLineNum = 29097990;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=29097991;
 //BA.debugLineNum = 29097991;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29097992;
 //BA.debugLineNum = 29097992;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29097993;
 //BA.debugLineNum = 29097993;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=29097995;
 //BA.debugLineNum = 29097995;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=29097996;
 //BA.debugLineNum = 29097996;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29097997;
 //BA.debugLineNum = 29097997;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=29097998;
 //BA.debugLineNum = 29097998;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 }else {
RDebugUtils.currentLine=29098001;
 //BA.debugLineNum = 29098001;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=29098002;
 //BA.debugLineNum = 29098002;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=29098003;
 //BA.debugLineNum = 29098003;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=29098004;
 //BA.debugLineNum = 29098004;BA.debugLine="lbl.TextColor = cHeaderTextColor";
_lbl.setTextColor(__ref._cheadertextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=29098008;
 //BA.debugLineNum = 29098008;BA.debugLine="End Sub";
return "";
}
public String  _setheadertextcolors(b4a.example.ef.table __ref,int[] _headertextcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertextcolors", false))
	 {return ((String) Debug.delegate(ba, "setheadertextcolors", new Object[] {_headertextcolors}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=32112640;
 //BA.debugLineNum = 32112640;BA.debugLine="Public Sub SetHeaderTextColors(HeaderTextColors()";
RDebugUtils.currentLine=32112641;
 //BA.debugLineNum = 32112641;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=32112643;
 //BA.debugLineNum = 32112643;BA.debugLine="cHeaderTextColors = HeaderTextColors";
__ref._cheadertextcolors /*int[]*/  = _headertextcolors;
RDebugUtils.currentLine=32112644;
 //BA.debugLineNum = 32112644;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=32112645;
 //BA.debugLineNum = 32112645;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=32112646;
 //BA.debugLineNum = 32112646;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=32112647;
 //BA.debugLineNum = 32112647;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32112648;
 //BA.debugLineNum = 32112648;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32112649;
 //BA.debugLineNum = 32112649;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=32112651;
 //BA.debugLineNum = 32112651;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=32112652;
 //BA.debugLineNum = 32112652;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32112653;
 //BA.debugLineNum = 32112653;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=32112654;
 //BA.debugLineNum = 32112654;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 }else {
RDebugUtils.currentLine=32112657;
 //BA.debugLineNum = 32112657;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=32112658;
 //BA.debugLineNum = 32112658;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32112659;
 //BA.debugLineNum = 32112659;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32112660;
 //BA.debugLineNum = 32112660;BA.debugLine="lbl.TextColor = cHeaderTextColors(col)";
_lbl.setTextColor(__ref._cheadertextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=32112664;
 //BA.debugLineNum = 32112664;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypeface(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _headertypeface) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypeface", false))
	 {return ((String) Debug.delegate(ba, "setheadertypeface", new Object[] {_headertypeface}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=32243712;
 //BA.debugLineNum = 32243712;BA.debugLine="Public Sub setHeaderTypeFace(HeaderTypeFace As Typ";
RDebugUtils.currentLine=32243713;
 //BA.debugLineNum = 32243713;BA.debugLine="cHeaderTypeFace = HeaderTypeFace";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypeface;
RDebugUtils.currentLine=32243714;
 //BA.debugLineNum = 32243714;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=32243715;
 //BA.debugLineNum = 32243715;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Number";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=32243716;
 //BA.debugLineNum = 32243716;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=32243717;
 //BA.debugLineNum = 32243717;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit5 ;_col = _col + step5 ) {
RDebugUtils.currentLine=32243718;
 //BA.debugLineNum = 32243718;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32243719;
 //BA.debugLineNum = 32243719;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32243720;
 //BA.debugLineNum = 32243720;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=32243722;
 //BA.debugLineNum = 32243722;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCol";
{
final int step10 = 1;
final int limit10 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit10 ;_col = _col + step10 ) {
RDebugUtils.currentLine=32243723;
 //BA.debugLineNum = 32243723;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32243724;
 //BA.debugLineNum = 32243724;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColum";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=32243725;
 //BA.debugLineNum = 32243725;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=32243728;
 //BA.debugLineNum = 32243728;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step16 = 1;
final int limit16 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit16 ;_col = _col + step16 ) {
RDebugUtils.currentLine=32243729;
 //BA.debugLineNum = 32243729;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32243730;
 //BA.debugLineNum = 32243730;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32243731;
 //BA.debugLineNum = 32243731;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
RDebugUtils.currentLine=32243735;
 //BA.debugLineNum = 32243735;BA.debugLine="End Sub";
return "";
}
public String  _setheadertypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _headertypefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheadertypefaces", false))
	 {return ((String) Debug.delegate(ba, "setheadertypefaces", new Object[] {_headertypefaces}));}
int _col = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=32309248;
 //BA.debugLineNum = 32309248;BA.debugLine="Public Sub SetHeaderTypeFaces(HeaderTypeFaces() As";
RDebugUtils.currentLine=32309249;
 //BA.debugLineNum = 32309249;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=32309251;
 //BA.debugLineNum = 32309251;BA.debugLine="If HeaderTypeFaces.Length = 1 Then";
if (_headertypefaces.length==1) { 
RDebugUtils.currentLine=32309252;
 //BA.debugLineNum = 32309252;BA.debugLine="cHeaderTypeFace = HeaderTypeFaces(0)";
__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _headertypefaces[(int) (0)];
RDebugUtils.currentLine=32309253;
 //BA.debugLineNum = 32309253;BA.debugLine="HeaderMultiTypeFace = False";
__ref._headermultitypeface /*boolean*/  = __c.False;
RDebugUtils.currentLine=32309254;
 //BA.debugLineNum = 32309254;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numbe";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=32309255;
 //BA.debugLineNum = 32309255;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=32309256;
 //BA.debugLineNum = 32309256;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=32309257;
 //BA.debugLineNum = 32309257;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32309258;
 //BA.debugLineNum = 32309258;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32309259;
 //BA.debugLineNum = 32309259;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
RDebugUtils.currentLine=32309261;
 //BA.debugLineNum = 32309261;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfCo";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=32309262;
 //BA.debugLineNum = 32309262;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32309263;
 //BA.debugLineNum = 32309263;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedColu";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=32309264;
 //BA.debugLineNum = 32309264;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 }else {
RDebugUtils.currentLine=32309267;
 //BA.debugLineNum = 32309267;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit18 ;_col = _col + step18 ) {
RDebugUtils.currentLine=32309268;
 //BA.debugLineNum = 32309268;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32309269;
 //BA.debugLineNum = 32309269;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32309270;
 //BA.debugLineNum = 32309270;BA.debugLine="lbl.Typeface = cHeaderTypeFace";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/ .getObject()));
 }
};
 };
 };
 }else {
RDebugUtils.currentLine=32309275;
 //BA.debugLineNum = 32309275;BA.debugLine="If HeaderTypeFaces.Length <> mNumberOfColumns Th";
if (_headertypefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=32309276;
 //BA.debugLineNum = 32309276;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=32309277;
 //BA.debugLineNum = 32309277;BA.debugLine="Log(\"SetHeaderTypeFaces: Invalid number of colu";
__c.LogImpl("432309277","SetHeaderTypeFaces: Invalid number of columns",0);
RDebugUtils.currentLine=32309278;
 //BA.debugLineNum = 32309278;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=32309280;
 //BA.debugLineNum = 32309280;BA.debugLine="cHeaderTypeFaces0 = HeaderTypeFaces";
__ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _headertypefaces;
RDebugUtils.currentLine=32309281;
 //BA.debugLineNum = 32309281;BA.debugLine="cHeaderTypeFaces = cHeaderTypeFaces0";
__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._cheadertypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=32309282;
 //BA.debugLineNum = 32309282;BA.debugLine="HeaderMultiTypeFace = True";
__ref._headermultitypeface /*boolean*/  = __c.True;
RDebugUtils.currentLine=32309283;
 //BA.debugLineNum = 32309283;BA.debugLine="If Header.NumberOfViews > 0 Or HeaderFirst.Numb";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0 || __ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()>0) { 
RDebugUtils.currentLine=32309284;
 //BA.debugLineNum = 32309284;BA.debugLine="If mNumberOfFixedColumns > 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ >0) { 
RDebugUtils.currentLine=32309285;
 //BA.debugLineNum = 32309285;BA.debugLine="For col = 0 To mNumberOfFixedColumns - 1";
{
final int step36 = 1;
final int limit36 = (int) (__ref._mnumberoffixedcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit36 ;_col = _col + step36 ) {
RDebugUtils.currentLine=32309286;
 //BA.debugLineNum = 32309286;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32309287;
 //BA.debugLineNum = 32309287;BA.debugLine="lbl = HeaderFirst.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32309288;
 //BA.debugLineNum = 32309288;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
RDebugUtils.currentLine=32309290;
 //BA.debugLineNum = 32309290;BA.debugLine="For col = mNumberOfFixedColumns To mNumberOfC";
{
final int step41 = 1;
final int limit41 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = __ref._mnumberoffixedcolumns /*int*/  ;
for (;_col <= limit41 ;_col = _col + step41 ) {
RDebugUtils.currentLine=32309291;
 //BA.debugLineNum = 32309291;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32309292;
 //BA.debugLineNum = 32309292;BA.debugLine="lbl = Header.GetView(col - mNumberOfFixedCol";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView((int) (_col-__ref._mnumberoffixedcolumns /*int*/ )).getObject()));
RDebugUtils.currentLine=32309293;
 //BA.debugLineNum = 32309293;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 }else {
RDebugUtils.currentLine=32309296;
 //BA.debugLineNum = 32309296;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step47 = 1;
final int limit47 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit47 ;_col = _col + step47 ) {
RDebugUtils.currentLine=32309297;
 //BA.debugLineNum = 32309297;BA.debugLine="Private lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=32309298;
 //BA.debugLineNum = 32309298;BA.debugLine="lbl = Header.GetView(col)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_col).getObject()));
RDebugUtils.currentLine=32309299;
 //BA.debugLineNum = 32309299;BA.debugLine="lbl.Typeface = cHeaderTypeFaces(col)";
_lbl.setTypeface((android.graphics.Typeface)(__ref._cheadertypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ [_col].getObject()));
 }
};
 };
 };
 };
 };
RDebugUtils.currentLine=32309305;
 //BA.debugLineNum = 32309305;BA.debugLine="End Sub";
return "";
}
public String  _setheight(b4a.example.ef.table __ref,int _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setheight", false))
	 {return ((String) Debug.delegate(ba, "setheight", new Object[] {_height}));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Public Sub setHeight(Height As Int)";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="cHeight = Height";
__ref._cheight /*int*/  = _height;
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="pnlTable.Height = Height";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setHeight(_height);
RDebugUtils.currentLine=27525123;
 //BA.debugLineNum = 27525123;BA.debugLine="If (cShowStatusLine = True) Then";
if ((__ref._cshowstatusline /*boolean*/ ==__c.True)) { 
RDebugUtils.currentLine=27525124;
 //BA.debugLineNum = 27525124;BA.debugLine="SVF.Height = Height - cStatusLineHeight - cHeade";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=27525125;
 //BA.debugLineNum = 27525125;BA.debugLine="SV2.Height = Height - cStatusLineHeight - cHeade";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cstatuslineheight /*int*/ -__ref._cheaderheight /*int*/ ));
 }else {
RDebugUtils.currentLine=27525127;
 //BA.debugLineNum = 27525127;BA.debugLine="SVF.Height = Height - cHeaderHeight";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
RDebugUtils.currentLine=27525128;
 //BA.debugLineNum = 27525128;BA.debugLine="SV2.Height = Height - cHeaderHeight";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setHeight((int) (_height-__ref._cheaderheight /*int*/ ));
 };
RDebugUtils.currentLine=27525130;
 //BA.debugLineNum = 27525130;BA.debugLine="lblStatusLine.Top = SV2.Top + SV2.Height";
__ref._lblstatusline /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTop((int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getTop()+__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getHeight()));
RDebugUtils.currentLine=27525131;
 //BA.debugLineNum = 27525131;BA.debugLine="SVF_ScrollChanged(0)";
__ref._svf_scrollchanged /*String*/ (null,(int) (0));
RDebugUtils.currentLine=27525132;
 //BA.debugLineNum = 27525132;BA.debugLine="SV2_ScrollChanged(0, 0)";
__ref._sv2_scrollchanged /*String*/ (null,(int) (0),(int) (0));
RDebugUtils.currentLine=27525133;
 //BA.debugLineNum = 27525133;BA.debugLine="InitFastScroll";
__ref._initfastscroll /*String*/ (null);
RDebugUtils.currentLine=27525135;
 //BA.debugLineNum = 27525135;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=27525136;
 //BA.debugLineNum = 27525136;BA.debugLine="End Sub";
return "";
}
public String  _setleft(b4a.example.ef.table __ref,int _left) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setleft", false))
	 {return ((String) Debug.delegate(ba, "setleft", new Object[] {_left}));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Public Sub setLeft(Left As Int)";
RDebugUtils.currentLine=27066369;
 //BA.debugLineNum = 27066369;BA.debugLine="cLeft = Left";
__ref._cleft /*int*/  = _left;
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="pnlTable.Left = Left";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft(_left);
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="End Sub";
return "";
}
public String  _setlinewidth(b4a.example.ef.table __ref,int _linewidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setlinewidth", false))
	 {return ((String) Debug.delegate(ba, "setlinewidth", new Object[] {_linewidth}));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Public Sub setLineWidth(LineWidth As Int)";
RDebugUtils.currentLine=27787265;
 //BA.debugLineNum = 27787265;BA.debugLine="cLineWidth = LineWidth";
__ref._clinewidth /*int*/  = _linewidth;
RDebugUtils.currentLine=27787266;
 //BA.debugLineNum = 27787266;BA.debugLine="End Sub";
return "";
}
public String  _setmulticolumnsort(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmulticolumnsort", false))
	 {return ((String) Debug.delegate(ba, "setmulticolumnsort", new Object[] {_bdo}));}
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Public Sub setMultiColumnSort(bDo As Boolean)";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="mMultiColumnSort = bDo";
__ref._mmulticolumnsort /*boolean*/  = _bdo;
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="End Sub";
return "";
}
public String  _setmultiselect(b4a.example.ef.table __ref,boolean _multiselect) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setmultiselect", false))
	 {return ((String) Debug.delegate(ba, "setmultiselect", new Object[] {_multiselect}));}
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Public Sub setMultiSelect(MultiSelect As Boolean)";
RDebugUtils.currentLine=26345473;
 //BA.debugLineNum = 26345473;BA.debugLine="clearSelection";
__ref._clearselection /*String*/ (null);
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="mMultiSelect = MultiSelect";
__ref._mmultiselect /*boolean*/  = _multiselect;
RDebugUtils.currentLine=26345475;
 //BA.debugLineNum = 26345475;BA.debugLine="End Sub";
return "";
}
public String  _setnumberofcolumns(b4a.example.ef.table __ref,int _numberofcolumns) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setnumberofcolumns", false))
	 {return ((String) Debug.delegate(ba, "setnumberofcolumns", new Object[] {_numberofcolumns}));}
int _col = 0;
RDebugUtils.currentLine=33357824;
 //BA.debugLineNum = 33357824;BA.debugLine="Public Sub setNumberOfColumns (NumberOfColumns As";
RDebugUtils.currentLine=33357825;
 //BA.debugLineNum = 33357825;BA.debugLine="mNumberOfColumns = NumberOfColumns";
__ref._mnumberofcolumns /*int*/  = _numberofcolumns;
RDebugUtils.currentLine=33357826;
 //BA.debugLineNum = 33357826;BA.debugLine="innerClearAll(mNumberOfColumns, True)";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
RDebugUtils.currentLine=33357829;
 //BA.debugLineNum = 33357829;BA.debugLine="Dim ColumnWidths(mNumberOfColumns) As Int";
_columnwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=33357830;
 //BA.debugLineNum = 33357830;BA.debugLine="Dim HeaderWidths(mNumberOfColumns) As Int";
_headerwidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=33357831;
 //BA.debugLineNum = 33357831;BA.debugLine="Dim DataWidths(mNumberOfColumns) As Int";
_datawidths = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=33357832;
 //BA.debugLineNum = 33357832;BA.debugLine="Dim cColumnDataType(mNumberOfColumns) As String";
_ccolumndatatype = new String[__ref._mnumberofcolumns /*int*/ ];
java.util.Arrays.fill(_ccolumndatatype,"");
RDebugUtils.currentLine=33357833;
 //BA.debugLineNum = 33357833;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=33357834;
 //BA.debugLineNum = 33357834;BA.debugLine="ColumnWidths(col) = 130dip";
__ref._columnwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=33357835;
 //BA.debugLineNum = 33357835;BA.debugLine="HeaderWidths(col) = 130dip";
__ref._headerwidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
RDebugUtils.currentLine=33357836;
 //BA.debugLineNum = 33357836;BA.debugLine="DataWidths(col) = 130dip";
__ref._datawidths /*int[]*/ [_col] = __c.DipToCurrent((int) (130));
 }
};
RDebugUtils.currentLine=33357838;
 //BA.debugLineNum = 33357838;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor1(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor1", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor1", new Object[] {_color}));}
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Public Sub setRowColor1(Color As Int)";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="cRowColor1 = Color";
__ref._crowcolor1 /*int*/  = _color;
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="End Sub";
return "";
}
public String  _setrowcolor2(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowcolor2", false))
	 {return ((String) Debug.delegate(ba, "setrowcolor2", new Object[] {_color}));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Public Sub setRowColor2(Color As Int)";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="cRowColor2 = Color";
__ref._crowcolor2 /*int*/  = _color;
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29360131;
 //BA.debugLineNum = 29360131;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=29360133;
 //BA.debugLineNum = 29360133;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Public Sub SetRowColorN(Row As Int, Color As Int)";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="Private col As Int";
_col = 0;
RDebugUtils.currentLine=29491202;
 //BA.debugLineNum = 29491202;BA.debugLine="Private New = False As Boolean";
_new = __c.False;
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="If lstRowColors.IndexOf(Color) >= 0 Then";
if (__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))>=0) { 
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.IndexOf";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color))+2));
 }else {
RDebugUtils.currentLine=29491206;
 //BA.debugLineNum = 29491206;BA.debugLine="lstRowColors.Add(Color)";
__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_color));
RDebugUtils.currentLine=29491207;
 //BA.debugLineNum = 29491207;BA.debugLine="lstRowColorIndexes.Set(Row, lstRowColors.Size +";
__ref._lstrowcolorindexes /*anywheresoftware.b4a.objects.collections.List*/ .Set(_row,(Object)(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()+1));
RDebugUtils.currentLine=29491208;
 //BA.debugLineNum = 29491208;BA.debugLine="New = True";
_new = __c.True;
 };
RDebugUtils.currentLine=29491211;
 //BA.debugLineNum = 29491211;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=29491212;
 //BA.debugLineNum = 29491212;BA.debugLine="Private cdi(mNumberOfColumns) As Object";
_cdi = new Object[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _cdi.length;
for (int i0 = 0;i0 < d0;i0++) {
_cdi[i0] = new Object();
}
}
;
RDebugUtils.currentLine=29491213;
 //BA.debugLineNum = 29491213;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit12 ;_col = _col + step12 ) {
RDebugUtils.currentLine=29491214;
 //BA.debugLineNum = 29491214;BA.debugLine="Private cdw As ColorDrawable";
_cdw = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=29491215;
 //BA.debugLineNum = 29491215;BA.debugLine="cdw.Initialize(Color, 0)";
_cdw.Initialize(_color,(int) (0));
RDebugUtils.currentLine=29491216;
 //BA.debugLineNum = 29491216;BA.debugLine="cdi(col) = cdw";
_cdi[_col] = (Object)(_cdw.getObject());
 }
};
RDebugUtils.currentLine=29491218;
 //BA.debugLineNum = 29491218;BA.debugLine="If New = False Then";
if (_new==__c.False) { 
RDebugUtils.currentLine=29491219;
 //BA.debugLineNum = 29491219;BA.debugLine="lstRowDrawables.Set(lstRowColors.IndexOf(Color)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Set(__ref._lstrowcolors /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_color)),(Object)(_cdi));
 }else {
RDebugUtils.currentLine=29491221;
 //BA.debugLineNum = 29491221;BA.debugLine="lstRowDrawables.Add(cdi)";
__ref._lstrowdrawables /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cdi));
 };
RDebugUtils.currentLine=29491226;
 //BA.debugLineNum = 29491226;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=29491228;
 //BA.debugLineNum = 29491228;BA.debugLine="End Sub";
return "";
}
public String  _setrowheight(b4a.example.ef.table __ref,int _rowheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setrowheight", false))
	 {return ((String) Debug.delegate(ba, "setrowheight", new Object[] {_rowheight}));}
RDebugUtils.currentLine=30605312;
 //BA.debugLineNum = 30605312;BA.debugLine="Public Sub setRowHeight(RowHeight As Int)";
RDebugUtils.currentLine=30605313;
 //BA.debugLineNum = 30605313;BA.debugLine="If cRowHeight = cHeaderHeight Then";
if (__ref._crowheight /*int*/ ==__ref._cheaderheight /*int*/ ) { 
RDebugUtils.currentLine=30605314;
 //BA.debugLineNum = 30605314;BA.debugLine="setHeaderHeight(RowHeight)";
__ref._setheaderheight /*String*/ (null,_rowheight);
 };
RDebugUtils.currentLine=30605316;
 //BA.debugLineNum = 30605316;BA.debugLine="cRowHeight = RowHeight";
__ref._crowheight /*int*/  = _rowheight;
RDebugUtils.currentLine=30605317;
 //BA.debugLineNum = 30605317;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcellcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcellcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcellcolor", new Object[] {_color}));}
RDebugUtils.currentLine=29949952;
 //BA.debugLineNum = 29949952;BA.debugLine="Public Sub setSelectedCellColor(Color As Int)";
RDebugUtils.currentLine=29949953;
 //BA.debugLineNum = 29949953;BA.debugLine="cSelectedCellColor = Color";
__ref._cselectedcellcolor /*int*/  = _color;
RDebugUtils.currentLine=29949954;
 //BA.debugLineNum = 29949954;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29949955;
 //BA.debugLineNum = 29949955;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=29949957;
 //BA.debugLineNum = 29949957;BA.debugLine="End Sub";
return "";
}
public String  _setselectedcelltextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedcelltextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedcelltextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=30081024;
 //BA.debugLineNum = 30081024;BA.debugLine="Public Sub setSelectedCellTextColor(TextColor As I";
RDebugUtils.currentLine=30081025;
 //BA.debugLineNum = 30081025;BA.debugLine="cSelectedCellTextColor = TextColor";
__ref._cselectedcelltextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=30081026;
 //BA.debugLineNum = 30081026;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=30081027;
 //BA.debugLineNum = 30081027;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=30081029;
 //BA.debugLineNum = 30081029;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowcolor", new Object[] {_color}));}
RDebugUtils.currentLine=29687808;
 //BA.debugLineNum = 29687808;BA.debugLine="Public Sub setSelectedRowColor(Color As Int)";
RDebugUtils.currentLine=29687809;
 //BA.debugLineNum = 29687809;BA.debugLine="cSelectedRowColor = Color";
__ref._cselectedrowcolor /*int*/  = _color;
RDebugUtils.currentLine=29687810;
 //BA.debugLineNum = 29687810;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29687811;
 //BA.debugLineNum = 29687811;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=29687813;
 //BA.debugLineNum = 29687813;BA.debugLine="End Sub";
return "";
}
public String  _setselectedrowtextcolor(b4a.example.ef.table __ref,int _textcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setselectedrowtextcolor", false))
	 {return ((String) Debug.delegate(ba, "setselectedrowtextcolor", new Object[] {_textcolor}));}
RDebugUtils.currentLine=29818880;
 //BA.debugLineNum = 29818880;BA.debugLine="Public Sub setSelectedRowTextColor(TextColor As In";
RDebugUtils.currentLine=29818881;
 //BA.debugLineNum = 29818881;BA.debugLine="cSelectedRowTextColor = TextColor";
__ref._cselectedrowtextcolor /*int*/  = _textcolor;
RDebugUtils.currentLine=29818882;
 //BA.debugLineNum = 29818882;BA.debugLine="If pnlTable.IsInitialized Then";
if (__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=29818883;
 //BA.debugLineNum = 29818883;BA.debugLine="innerClearAll(mNumberOfColumns, True)'?";
__ref._innerclearall /*String*/ (null,__ref._mnumberofcolumns /*int*/ ,__c.True);
 };
RDebugUtils.currentLine=29818885;
 //BA.debugLineNum = 29818885;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=32440320;
 //BA.debugLineNum = 32440320;BA.debugLine="Public Sub setSingleLine(SingleLine As Boolean)";
RDebugUtils.currentLine=32440322;
 //BA.debugLineNum = 32440322;BA.debugLine="Private row, col As Int";
_row = 0;
_col = 0;
RDebugUtils.currentLine=32440323;
 //BA.debugLineNum = 32440323;BA.debugLine="cSingleLine = SingleLine";
__ref._csingleline /*boolean*/  = _singleline;
RDebugUtils.currentLine=32440325;
 //BA.debugLineNum = 32440325;BA.debugLine="If LabelsCache.Size > 0 Then";
if (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=32440326;
 //BA.debugLineNum = 32440326;BA.debugLine="For row = 0 To LabelsCache.Size - 1";
{
final int step4 = 1;
final int limit4 = (int) (__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_row = (int) (0) ;
for (;_row <= limit4 ;_row = _row + step4 ) {
RDebugUtils.currentLine=32440327;
 //BA.debugLineNum = 32440327;BA.debugLine="Private lbls(mNumberOfColumns) As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[__ref._mnumberofcolumns /*int*/ ];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=32440328;
 //BA.debugLineNum = 32440328;BA.debugLine="lbls = LabelsCache.Get(row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._labelscache /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=32440329;
 //BA.debugLineNum = 32440329;BA.debugLine="For col = 0 To mNumberOfColumns - 1";
{
final int step7 = 1;
final int limit7 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_col = (int) (0) ;
for (;_col <= limit7 ;_col = _col + step7 ) {
RDebugUtils.currentLine=32440330;
 //BA.debugLineNum = 32440330;BA.debugLine="Private jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=32440331;
 //BA.debugLineNum = 32440331;BA.debugLine="jo = lbls(col)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_lbls[_col].getObject()));
RDebugUtils.currentLine=32440332;
 //BA.debugLineNum = 32440332;BA.debugLine="jo.RunMethod(\"setSingleLine\", Array(cSingleLin";
_jo.RunMethod("setSingleLine",new Object[]{(Object)(__ref._csingleline /*boolean*/ )});
 }
};
 }
};
 };
RDebugUtils.currentLine=32440337;
 //BA.debugLineNum = 32440337;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapcolor", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapcolor", new Object[] {_color}));}
RDebugUtils.currentLine=33816576;
 //BA.debugLineNum = 33816576;BA.debugLine="Public Sub setSortBitmapColor(Color As Int)";
RDebugUtils.currentLine=33816577;
 //BA.debugLineNum = 33816577;BA.debugLine="cSortBitmapColor = Color";
__ref._csortbitmapcolor /*int*/  = _color;
RDebugUtils.currentLine=33816578;
 //BA.debugLineNum = 33816578;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=33816579;
 //BA.debugLineNum = 33816579;BA.debugLine="End Sub";
return "";
}
public String  _setsortbitmapwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortbitmapwidth", false))
	 {return ((String) Debug.delegate(ba, "setsortbitmapwidth", new Object[] {_width}));}
RDebugUtils.currentLine=33685504;
 //BA.debugLineNum = 33685504;BA.debugLine="Public Sub setSortBitmapWidth(Width As Int)";
RDebugUtils.currentLine=33685505;
 //BA.debugLineNum = 33685505;BA.debugLine="cSortBitmapWidth = Width";
__ref._csortbitmapwidth /*int*/  = _width;
RDebugUtils.currentLine=33685506;
 //BA.debugLineNum = 33685506;BA.debugLine="InitializeSortingBitmaps";
__ref._initializesortingbitmaps /*String*/ (null);
RDebugUtils.currentLine=33685507;
 //BA.debugLineNum = 33685507;BA.debugLine="End Sub";
return "";
}
public String  _setsortcaseinsensitive(b4a.example.ef.table __ref,boolean _bdo) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcaseinsensitive", false))
	 {return ((String) Debug.delegate(ba, "setsortcaseinsensitive", new Object[] {_bdo}));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub setSortCaseInsensitive(bDo As Boolean)";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="mSortCaseInsensitive = bDo";
__ref._msortcaseinsensitive /*boolean*/  = _bdo;
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="End Sub";
return "";
}
public String  _setsortcolumn(b4a.example.ef.table __ref,boolean _sortcolumn) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortcolumn", false))
	 {return ((String) Debug.delegate(ba, "setsortcolumn", new Object[] {_sortcolumn}));}
RDebugUtils.currentLine=31457280;
 //BA.debugLineNum = 31457280;BA.debugLine="Public Sub setSortColumn(SortColumn As Boolean)";
RDebugUtils.currentLine=31457281;
 //BA.debugLineNum = 31457281;BA.debugLine="cSortColumn = SortColumn";
__ref._csortcolumn /*boolean*/  = _sortcolumn;
RDebugUtils.currentLine=31457282;
 //BA.debugLineNum = 31457282;BA.debugLine="End Sub";
return "";
}
public String  _setsortingbitmaps(b4a.example.ef.table __ref,String _bitmapascfilename,String _bitmapdesfilename) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortingbitmaps", false))
	 {return ((String) Debug.delegate(ba, "setsortingbitmaps", new Object[] {_bitmapascfilename,_bitmapdesfilename}));}
RDebugUtils.currentLine=33947648;
 //BA.debugLineNum = 33947648;BA.debugLine="Public Sub SetSortingBitmaps(BitmapAscFilename As";
RDebugUtils.currentLine=33947649;
 //BA.debugLineNum = 33947649;BA.debugLine="bmpAsc.Initialize(File.DirAssets, BitmapAscFilena";
__ref._bmpasc /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapascfilename);
RDebugUtils.currentLine=33947650;
 //BA.debugLineNum = 33947650;BA.debugLine="bmpDes.Initialize(File.DirAssets, BitmapDesFilena";
__ref._bmpdes /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .Initialize(__c.File.getDirAssets(),_bitmapdesfilename);
RDebugUtils.currentLine=33947651;
 //BA.debugLineNum = 33947651;BA.debugLine="mCustomSortingBitmaps = True";
__ref._mcustomsortingbitmaps /*boolean*/  = __c.True;
RDebugUtils.currentLine=33947652;
 //BA.debugLineNum = 33947652;BA.debugLine="End Sub";
return "";
}
public String  _setsortremoveaccents(b4a.example.ef.table __ref,boolean _sortremoveaccents) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setsortremoveaccents", false))
	 {return ((String) Debug.delegate(ba, "setsortremoveaccents", new Object[] {_sortremoveaccents}));}
RDebugUtils.currentLine=33554432;
 //BA.debugLineNum = 33554432;BA.debugLine="Public Sub setSortRemoveAccents(SortRemoveAccents";
RDebugUtils.currentLine=33554433;
 //BA.debugLineNum = 33554433;BA.debugLine="cSortRemoveAccents = SortRemoveAccents";
__ref._csortremoveaccents /*boolean*/  = _sortremoveaccents;
RDebugUtils.currentLine=33554434;
 //BA.debugLineNum = 33554434;BA.debugLine="End Sub";
return "";
}
public String  _setstatuslineheight(b4a.example.ef.table __ref,int _statuslineheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setstatuslineheight", false))
	 {return ((String) Debug.delegate(ba, "setstatuslineheight", new Object[] {_statuslineheight}));}
RDebugUtils.currentLine=30736384;
 //BA.debugLineNum = 30736384;BA.debugLine="Public Sub setStatusLineHeight(StatusLineHeight As";
RDebugUtils.currentLine=30736385;
 //BA.debugLineNum = 30736385;BA.debugLine="cStatusLineHeight = StatusLineHeight";
__ref._cstatuslineheight /*int*/  = _statuslineheight;
RDebugUtils.currentLine=30736386;
 //BA.debugLineNum = 30736386;BA.debugLine="End Sub";
return "";
}
public String  _settablecolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settablecolor", false))
	 {return ((String) Debug.delegate(ba, "settablecolor", new Object[] {_color}));}
RDebugUtils.currentLine=30212096;
 //BA.debugLineNum = 30212096;BA.debugLine="Public Sub setTableColor(Color As Int)";
RDebugUtils.currentLine=30212097;
 //BA.debugLineNum = 30212097;BA.debugLine="cTableColor = Color";
__ref._ctablecolor /*int*/  = _color;
RDebugUtils.currentLine=30212098;
 //BA.debugLineNum = 30212098;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=30212099;
 //BA.debugLineNum = 30212099;BA.debugLine="SV2.Panel.Color = cTableColor";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=30212100;
 //BA.debugLineNum = 30212100;BA.debugLine="SVF.Panel.Color = cTableColor";
__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=30212101;
 //BA.debugLineNum = 30212101;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=30212102;
 //BA.debugLineNum = 30212102;BA.debugLine="Header.Color = cTableColor";
__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
RDebugUtils.currentLine=30212103;
 //BA.debugLineNum = 30212103;BA.debugLine="HeaderFirst.Color = cTableColor";
__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__ref._ctablecolor /*int*/ );
 };
 };
RDebugUtils.currentLine=30212106;
 //BA.debugLineNum = 30212106;BA.debugLine="End Sub";
return "";
}
public String  _settag(b4a.example.ef.table __ref,Object _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settag", false))
	 {return ((String) Debug.delegate(ba, "settag", new Object[] {_tag}));}
RDebugUtils.currentLine=32899072;
 //BA.debugLineNum = 32899072;BA.debugLine="Public Sub setTag(Tag As Object)";
RDebugUtils.currentLine=32899073;
 //BA.debugLineNum = 32899073;BA.debugLine="pnlTable.Tag = Tag";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTag(_tag);
RDebugUtils.currentLine=32899074;
 //BA.debugLineNum = 32899074;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(b4a.example.ef.table __ref,int _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextcolor", false))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_color}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=30343168;
 //BA.debugLineNum = 30343168;BA.debugLine="Public Sub setTextColor(Color As Int)";
RDebugUtils.currentLine=30343169;
 //BA.debugLineNum = 30343169;BA.debugLine="cTextColor = Color";
__ref._ctextcolor /*int*/  = _color;
RDebugUtils.currentLine=30343170;
 //BA.debugLineNum = 30343170;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=30343171;
 //BA.debugLineNum = 30343171;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=30343172;
 //BA.debugLineNum = 30343172;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=30343173;
 //BA.debugLineNum = 30343173;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=30343174;
 //BA.debugLineNum = 30343174;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30343175;
 //BA.debugLineNum = 30343175;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=30343176;
 //BA.debugLineNum = 30343176;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=30343180;
 //BA.debugLineNum = 30343180;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=30343181;
 //BA.debugLineNum = 30343181;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=30343182;
 //BA.debugLineNum = 30343182;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step14 = 1;
final int limit14 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=30343183;
 //BA.debugLineNum = 30343183;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30343184;
 //BA.debugLineNum = 30343184;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=30343185;
 //BA.debugLineNum = 30343185;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
RDebugUtils.currentLine=30343187;
 //BA.debugLineNum = 30343187;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=30343188;
 //BA.debugLineNum = 30343188;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=30343189;
 //BA.debugLineNum = 30343189;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30343190;
 //BA.debugLineNum = 30343190;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=30343191;
 //BA.debugLineNum = 30343191;BA.debugLine="lbl.TextColor = cTextColor";
_lbl.setTextColor(__ref._ctextcolor /*int*/ );
 }
};
 };
 };
RDebugUtils.currentLine=30343195;
 //BA.debugLineNum = 30343195;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=31850496;
 //BA.debugLineNum = 31850496;BA.debugLine="Public Sub SetTextColors(TextColors() As Int)";
RDebugUtils.currentLine=31850497;
 //BA.debugLineNum = 31850497;BA.debugLine="cTextColors = TextColors";
__ref._ctextcolors /*int[]*/  = _textcolors;
RDebugUtils.currentLine=31850498;
 //BA.debugLineNum = 31850498;BA.debugLine="If cTextColors.Length = 1 Then";
if (__ref._ctextcolors /*int[]*/ .length==1) { 
RDebugUtils.currentLine=31850499;
 //BA.debugLineNum = 31850499;BA.debugLine="MultiTextColors = False";
__ref._multitextcolors /*boolean*/  = __c.False;
RDebugUtils.currentLine=31850500;
 //BA.debugLineNum = 31850500;BA.debugLine="setTextColor(cTextColors(0))";
__ref._settextcolor /*String*/ (null,__ref._ctextcolors /*int[]*/ [(int) (0)]);
RDebugUtils.currentLine=31850501;
 //BA.debugLineNum = 31850501;BA.debugLine="Return";
if (true) return "";
 }else {
RDebugUtils.currentLine=31850503;
 //BA.debugLineNum = 31850503;BA.debugLine="MultiTextColors = True";
__ref._multitextcolors /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=31850505;
 //BA.debugLineNum = 31850505;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=31850506;
 //BA.debugLineNum = 31850506;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=31850507;
 //BA.debugLineNum = 31850507;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=31850508;
 //BA.debugLineNum = 31850508;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=31850509;
 //BA.debugLineNum = 31850509;BA.debugLine="col = i Mod mNumberOfColumns";
_col = (int) (_i%__ref._mnumberofcolumns /*int*/ );
RDebugUtils.currentLine=31850510;
 //BA.debugLineNum = 31850510;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31850511;
 //BA.debugLineNum = 31850511;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=31850512;
 //BA.debugLineNum = 31850512;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 }else {
RDebugUtils.currentLine=31850516;
 //BA.debugLineNum = 31850516;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=31850517;
 //BA.debugLineNum = 31850517;BA.debugLine="Dim i, col As Int";
_i = 0;
_col = 0;
RDebugUtils.currentLine=31850518;
 //BA.debugLineNum = 31850518;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step22 = 1;
final int limit22 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=31850519;
 //BA.debugLineNum = 31850519;BA.debugLine="col = i Mod mNumberOfFixedColumns";
_col = (int) (_i%__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=31850520;
 //BA.debugLineNum = 31850520;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31850521;
 //BA.debugLineNum = 31850521;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=31850522;
 //BA.debugLineNum = 31850522;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
RDebugUtils.currentLine=31850524;
 //BA.debugLineNum = 31850524;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step28 = 1;
final int limit28 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit28 ;_i = _i + step28 ) {
RDebugUtils.currentLine=31850525;
 //BA.debugLineNum = 31850525;BA.debugLine="col = i Mod (mNumberOfColumns - mNumberOfFixed";
_col = (int) (_i%(__ref._mnumberofcolumns /*int*/ -__ref._mnumberoffixedcolumns /*int*/ )+__ref._mnumberoffixedcolumns /*int*/ );
RDebugUtils.currentLine=31850526;
 //BA.debugLineNum = 31850526;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=31850527;
 //BA.debugLineNum = 31850527;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=31850528;
 //BA.debugLineNum = 31850528;BA.debugLine="lbl.TextColor = cTextColors(col)";
_lbl.setTextColor(__ref._ctextcolors /*int[]*/ [_col]);
 }
};
 };
 };
RDebugUtils.currentLine=31850532;
 //BA.debugLineNum = 31850532;BA.debugLine="End Sub";
return "";
}
public String  _settextsize(b4a.example.ef.table __ref,float _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settextsize", false))
	 {return ((String) Debug.delegate(ba, "settextsize", new Object[] {_size}));}
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
RDebugUtils.currentLine=30474240;
 //BA.debugLineNum = 30474240;BA.debugLine="Public Sub setTextSize(Size As Float)";
RDebugUtils.currentLine=30474241;
 //BA.debugLineNum = 30474241;BA.debugLine="cTextSize = Size";
__ref._ctextsize /*float*/  = _size;
RDebugUtils.currentLine=30474243;
 //BA.debugLineNum = 30474243;BA.debugLine="Private i As Int";
_i = 0;
RDebugUtils.currentLine=30474245;
 //BA.debugLineNum = 30474245;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=30474246;
 //BA.debugLineNum = 30474246;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=30474247;
 //BA.debugLineNum = 30474247;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=30474248;
 //BA.debugLineNum = 30474248;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30474249;
 //BA.debugLineNum = 30474249;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=30474250;
 //BA.debugLineNum = 30474250;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=30474254;
 //BA.debugLineNum = 30474254;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=30474255;
 //BA.debugLineNum = 30474255;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step12 = 1;
final int limit12 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=30474256;
 //BA.debugLineNum = 30474256;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30474257;
 //BA.debugLineNum = 30474257;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=30474258;
 //BA.debugLineNum = 30474258;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 }else {
RDebugUtils.currentLine=30474262;
 //BA.debugLineNum = 30474262;BA.debugLine="If Header.IsInitialized Then";
if (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .IsInitialized()) { 
RDebugUtils.currentLine=30474263;
 //BA.debugLineNum = 30474263;BA.debugLine="For i = 0 To HeaderFirst.NumberOfViews - 1";
{
final int step20 = 1;
final int limit20 = (int) (__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=30474264;
 //BA.debugLineNum = 30474264;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30474265;
 //BA.debugLineNum = 30474265;BA.debugLine="lbl = HeaderFirst.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._headerfirst /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=30474266;
 //BA.debugLineNum = 30474266;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=30474268;
 //BA.debugLineNum = 30474268;BA.debugLine="For i = 0 To Header.NumberOfViews - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=30474269;
 //BA.debugLineNum = 30474269;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30474270;
 //BA.debugLineNum = 30474270;BA.debugLine="lbl = Header.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._header /*anywheresoftware.b4a.objects.PanelWrapper*/ .GetView(_i).getObject()));
RDebugUtils.currentLine=30474271;
 //BA.debugLineNum = 30474271;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
RDebugUtils.currentLine=30474275;
 //BA.debugLineNum = 30474275;BA.debugLine="If SV2.IsInitialized = True Then";
if (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .IsInitialized()==__c.True) { 
RDebugUtils.currentLine=30474276;
 //BA.debugLineNum = 30474276;BA.debugLine="For i = 0 To SVF.Panel.NumberOfViews - 1";
{
final int step32 = 1;
final int limit32 = (int) (__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
RDebugUtils.currentLine=30474277;
 //BA.debugLineNum = 30474277;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30474278;
 //BA.debugLineNum = 30474278;BA.debugLine="lbl = SVF.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=30474279;
 //BA.debugLineNum = 30474279;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
RDebugUtils.currentLine=30474281;
 //BA.debugLineNum = 30474281;BA.debugLine="For i = 0 To SV2.Panel.NumberOfViews - 1";
{
final int step37 = 1;
final int limit37 = (int) (__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit37 ;_i = _i + step37 ) {
RDebugUtils.currentLine=30474282;
 //BA.debugLineNum = 30474282;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=30474283;
 //BA.debugLineNum = 30474283;BA.debugLine="lbl = SV2.Panel.GetView(i)";
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .getPanel().GetView(_i).getObject()));
RDebugUtils.currentLine=30474284;
 //BA.debugLineNum = 30474284;BA.debugLine="lbl.TextSize = cTextSize";
_lbl.setTextSize(__ref._ctextsize /*float*/ );
 }
};
 };
 };
RDebugUtils.currentLine=30474288;
 //BA.debugLineNum = 30474288;BA.debugLine="End Sub";
return "";
}
public String  _settop(b4a.example.ef.table __ref,int _top) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settop", false))
	 {return ((String) Debug.delegate(ba, "settop", new Object[] {_top}));}
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Public Sub setTop(Top As Int)";
RDebugUtils.currentLine=27197441;
 //BA.debugLineNum = 27197441;BA.debugLine="cTop = Top";
__ref._ctop /*int*/  = _top;
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="pnlTable.Top = Top";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setTop(_top);
RDebugUtils.currentLine=27197443;
 //BA.debugLineNum = 27197443;BA.debugLine="End Sub";
return "";
}
public String  _settypefaces(b4a.example.ef.table __ref,anywheresoftware.b4a.keywords.constants.TypefaceWrapper[] _typefaces) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "settypefaces", false))
	 {return ((String) Debug.delegate(ba, "settypefaces", new Object[] {_typefaces}));}
RDebugUtils.currentLine=30867456;
 //BA.debugLineNum = 30867456;BA.debugLine="Public Sub SetTypeFaces(TypeFaces() As Typeface)";
RDebugUtils.currentLine=30867457;
 //BA.debugLineNum = 30867457;BA.debugLine="If TypeFaces.Length = 1 Then";
if (_typefaces.length==1) { 
RDebugUtils.currentLine=30867458;
 //BA.debugLineNum = 30867458;BA.debugLine="cTypeFace = TypeFaces(0)";
__ref._ctypeface /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper*/  = _typefaces[(int) (0)];
RDebugUtils.currentLine=30867459;
 //BA.debugLineNum = 30867459;BA.debugLine="MultiTypeFace = False";
__ref._multitypeface /*boolean*/  = __c.False;
 }else {
RDebugUtils.currentLine=30867461;
 //BA.debugLineNum = 30867461;BA.debugLine="If TypeFaces.Length <> mNumberOfColumns Then";
if (_typefaces.length!=__ref._mnumberofcolumns /*int*/ ) { 
RDebugUtils.currentLine=30867462;
 //BA.debugLineNum = 30867462;BA.debugLine="ToastMessageShow(\"Invalid number of columns\", F";
__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid number of columns"),__c.False);
RDebugUtils.currentLine=30867463;
 //BA.debugLineNum = 30867463;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=30867466;
 //BA.debugLineNum = 30867466;BA.debugLine="cTypeFaces0 = TypeFaces";
__ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = _typefaces;
RDebugUtils.currentLine=30867467;
 //BA.debugLineNum = 30867467;BA.debugLine="cTypeFaces = cTypeFaces0";
__ref._ctypefaces /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/  = __ref._ctypefaces0 /*anywheresoftware.b4a.keywords.constants.TypefaceWrapper[]*/ ;
RDebugUtils.currentLine=30867468;
 //BA.debugLineNum = 30867468;BA.debugLine="MultiTypeFace = True";
__ref._multitypeface /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=30867471;
 //BA.debugLineNum = 30867471;BA.debugLine="If Data.Size > 0 Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=30867472;
 //BA.debugLineNum = 30867472;BA.debugLine="RefreshLabels";
__ref._refreshlabels /*String*/ (null);
 };
RDebugUtils.currentLine=30867474;
 //BA.debugLineNum = 30867474;BA.debugLine="End Sub";
return "";
}
public String  _setusecolumncolors(b4a.example.ef.table __ref,boolean _usecolumncolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setusecolumncolors", false))
	 {return ((String) Debug.delegate(ba, "setusecolumncolors", new Object[] {_usecolumncolors}));}
int _i = 0;
RDebugUtils.currentLine=31588352;
 //BA.debugLineNum = 31588352;BA.debugLine="Public Sub setUseColumnColors(UseColumnColors As B";
RDebugUtils.currentLine=31588353;
 //BA.debugLineNum = 31588353;BA.debugLine="cUseColumnColors = UseColumnColors";
__ref._cusecolumncolors /*boolean*/  = _usecolumncolors;
RDebugUtils.currentLine=31588354;
 //BA.debugLineNum = 31588354;BA.debugLine="If cColumnColors.Length = 0 Then";
if (__ref._ccolumncolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=31588355;
 //BA.debugLineNum = 31588355;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=31588356;
 //BA.debugLineNum = 31588356;BA.debugLine="Dim cColumnColors(mNumberOfColumns) As Int";
_ccolumncolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31588357;
 //BA.debugLineNum = 31588357;BA.debugLine="Dim cTextColors(mNumberOfColumns) As Int";
_ctextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31588358;
 //BA.debugLineNum = 31588358;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step6 = 1;
final int limit6 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=31588359;
 //BA.debugLineNum = 31588359;BA.debugLine="If i Mod 2 = 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=31588360;
 //BA.debugLineNum = 31588360;BA.debugLine="cColumnColors(i) = cRowColor1";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor1 /*int*/ ;
 }else {
RDebugUtils.currentLine=31588362;
 //BA.debugLineNum = 31588362;BA.debugLine="cColumnColors(i) = cRowColor2";
__ref._ccolumncolors /*int[]*/ [_i] = __ref._crowcolor2 /*int*/ ;
 };
RDebugUtils.currentLine=31588364;
 //BA.debugLineNum = 31588364;BA.debugLine="cTextColors(i) = cTextColor";
__ref._ctextcolors /*int[]*/ [_i] = __ref._ctextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=31588368;
 //BA.debugLineNum = 31588368;BA.debugLine="If cHeaderColors.Length = 0 Then";
if (__ref._cheadercolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=31588369;
 //BA.debugLineNum = 31588369;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=31588370;
 //BA.debugLineNum = 31588370;BA.debugLine="Dim cHeaderColors(mNumberOfColumns) As Int";
_cheadercolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31588371;
 //BA.debugLineNum = 31588371;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step18 = 1;
final int limit18 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit18 ;_i = _i + step18 ) {
RDebugUtils.currentLine=31588372;
 //BA.debugLineNum = 31588372;BA.debugLine="cHeaderColors(i) = cHeaderColor";
__ref._cheadercolors /*int[]*/ [_i] = __ref._cheadercolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=31588376;
 //BA.debugLineNum = 31588376;BA.debugLine="If cHeaderTextColors.Length = 0 Then";
if (__ref._cheadertextcolors /*int[]*/ .length==0) { 
RDebugUtils.currentLine=31588377;
 //BA.debugLineNum = 31588377;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=31588378;
 //BA.debugLineNum = 31588378;BA.debugLine="Dim cHeaderTextColors(mNumberOfColumns) As Int";
_cheadertextcolors = new int[__ref._mnumberofcolumns /*int*/ ];
;
RDebugUtils.currentLine=31588379;
 //BA.debugLineNum = 31588379;BA.debugLine="For i = 0 To mNumberOfColumns - 1";
{
final int step25 = 1;
final int limit25 = (int) (__ref._mnumberofcolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=31588380;
 //BA.debugLineNum = 31588380;BA.debugLine="cHeaderTextColors(i) = cHeaderTextColor";
__ref._cheadertextcolors /*int[]*/ [_i] = __ref._cheadertextcolor /*int*/ ;
 }
};
 };
RDebugUtils.currentLine=31588383;
 //BA.debugLineNum = 31588383;BA.debugLine="End Sub";
return "";
}
public String  _setvalue(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvalue", false))
	 {return ((String) Debug.delegate(ba, "setvalue", new Object[] {_col,_row,_value}));}
String[] _values = null;
anywheresoftware.b4a.objects.LabelWrapper[] _lbls = null;
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Public Sub SetValue(Col As Int, Row As Int, Value";
RDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="Dim values() As String";
_values = new String[(int) (0)];
java.util.Arrays.fill(_values,"");
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="values = Data.Get(Row)";
_values = (String[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="values(Col) = Value";
_values[_col] = _value;
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="Dim lbls() As Label";
_lbls = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _lbls.length;
for (int i0 = 0;i0 < d0;i0++) {
_lbls[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="lbls = visibleRows.Get(Row)";
_lbls = (anywheresoftware.b4a.objects.LabelWrapper[])(__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_row)));
RDebugUtils.currentLine=25165831;
 //BA.debugLineNum = 25165831;BA.debugLine="lbls(Col).Text = Value";
_lbls[_col].setText(BA.ObjectToCharSequence(_value));
 };
RDebugUtils.currentLine=25165833;
 //BA.debugLineNum = 25165833;BA.debugLine="End Sub";
return "";
}
public String  _setvisible(b4a.example.ef.table __ref,boolean _visible) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setvisible", false))
	 {return ((String) Debug.delegate(ba, "setvisible", new Object[] {_visible}));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Public Sub setVisible(Visible As Boolean)";
RDebugUtils.currentLine=27656193;
 //BA.debugLineNum = 27656193;BA.debugLine="pnlTable.Visible = Visible";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(_visible);
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="End Sub";
return "";
}
public String  _setwidth(b4a.example.ef.table __ref,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setwidth", false))
	 {return ((String) Debug.delegate(ba, "setwidth", new Object[] {_width}));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Public Sub setWidth(Width As Int)";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="cWidth = Width";
__ref._cwidth /*int*/  = _width;
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="pnlTable.Width = Width";
__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .setWidth(_width);
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="If mNumberOfFixedColumns = 0 Then";
if (__ref._mnumberoffixedcolumns /*int*/ ==0) { 
RDebugUtils.currentLine=27328516;
 //BA.debugLineNum = 27328516;BA.debugLine="SV2.Width = Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth(_width);
 }else {
RDebugUtils.currentLine=27328518;
 //BA.debugLineNum = 27328518;BA.debugLine="SV2.Width = Width - SVF.Width";
__ref._sv2 /*flm.b4a.scrollview2d.ScrollView2DWrapper*/ .setWidth((int) (_width-__ref._svf /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getWidth()));
 };
RDebugUtils.currentLine=27328521;
 //BA.debugLineNum = 27328521;BA.debugLine="updateIPLocation";
__ref._updateiplocation /*String*/ (null);
RDebugUtils.currentLine=27328522;
 //BA.debugLineNum = 27328522;BA.debugLine="End Sub";
return "";
}
public String  _setzeroselection(b4a.example.ef.table __ref,boolean _zeroselection) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "setzeroselection", false))
	 {return ((String) Debug.delegate(ba, "setzeroselection", new Object[] {_zeroselection}));}
RDebugUtils.currentLine=34013184;
 //BA.debugLineNum = 34013184;BA.debugLine="Public Sub setZeroSelection(ZeroSelection As Boole";
RDebugUtils.currentLine=34013185;
 //BA.debugLineNum = 34013185;BA.debugLine="mZeroSelection = ZeroSelection";
__ref._mzeroselection /*boolean*/  = _zeroselection;
RDebugUtils.currentLine=34013186;
 //BA.debugLineNum = 34013186;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper  _snapshot(b4a.example.ef.table __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "snapshot", false))
	 {return ((anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) Debug.delegate(ba, "snapshot", null));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmpsnapshot = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnltable = null;
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Public Sub SnapShot As Bitmap";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Private bmpSnapshot As Bitmap";
_bmpsnapshot = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="Private xpnlTable As B4XView";
_xpnltable = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="xpnlTable = pnlTable";
_xpnltable = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._pnltable /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="bmpSnapshot = xpnlTable.Snapshot";
_bmpsnapshot = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_xpnltable.Snapshot().getObject()));
RDebugUtils.currentLine=35454983;
 //BA.debugLineNum = 35454983;BA.debugLine="Return bmpSnapshot";
if (true) return _bmpsnapshot;
RDebugUtils.currentLine=35454984;
 //BA.debugLineNum = 35454984;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Sub SortOMDoubleIDX(arrDouble() As Double, bAscend";
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=35913735;
 //BA.debugLineNum = 35913735;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=35913736;
 //BA.debugLineNum = 35913736;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=35913737;
 //BA.debugLineNum = 35913737;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=35913738;
 //BA.debugLineNum = 35913738;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=35913741;
 //BA.debugLineNum = 35913741;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=35913743;
 //BA.debugLineNum = 35913743;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=35913744;
 //BA.debugLineNum = 35913744;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=35913747;
 //BA.debugLineNum = 35913747;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=35913748;
 //BA.debugLineNum = 35913748;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=35913751;
 //BA.debugLineNum = 35913751;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=35913752;
 //BA.debugLineNum = 35913752;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35913753;
 //BA.debugLineNum = 35913753;BA.debugLine="If B4XOM.ContainsKey(arrDouble(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[(int) (_i)]))) { 
RDebugUtils.currentLine=35913754;
 //BA.debugLineNum = 35913754;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=35913756;
 //BA.debugLineNum = 35913756;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=35913758;
 //BA.debugLineNum = 35913758;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=35913759;
 //BA.debugLineNum = 35913759;BA.debugLine="B4XOM.Put(arrDouble(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=35913762;
 //BA.debugLineNum = 35913762;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=35913764;
 //BA.debugLineNum = 35913764;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=35913766;
 //BA.debugLineNum = 35913766;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=35913767;
 //BA.debugLineNum = 35913767;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=35913768;
 //BA.debugLineNum = 35913768;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=35913769;
 //BA.debugLineNum = 35913769;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=35913770;
 //BA.debugLineNum = 35913770;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=35913774;
 //BA.debugLineNum = 35913774;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=35913776;
 //BA.debugLineNum = 35913776;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Sub SortOMDoubleIDX2(arrDouble() As Double, arrInd";
RDebugUtils.currentLine=35979266;
 //BA.debugLineNum = 35979266;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=35979271;
 //BA.debugLineNum = 35979271;BA.debugLine="If Check1DDoubleAllSame(arrDouble, iStart, iEnd)";
if (__ref._check1ddoubleallsame /*boolean*/ (null,_arrdouble,_istart,_iend)) { 
RDebugUtils.currentLine=35979272;
 //BA.debugLineNum = 35979272;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=35979273;
 //BA.debugLineNum = 35979273;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=35979274;
 //BA.debugLineNum = 35979274;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=35979277;
 //BA.debugLineNum = 35979277;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=35979279;
 //BA.debugLineNum = 35979279;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=35979280;
 //BA.debugLineNum = 35979280;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=35979283;
 //BA.debugLineNum = 35979283;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=35979284;
 //BA.debugLineNum = 35979284;BA.debugLine="iEnd = arrDouble.Length - 1";
_iend = (int) (_arrdouble.length-1);
 };
RDebugUtils.currentLine=35979287;
 //BA.debugLineNum = 35979287;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=35979288;
 //BA.debugLineNum = 35979288;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35979289;
 //BA.debugLineNum = 35979289;BA.debugLine="If B4XOM.ContainsKey(arrDouble(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=35979290;
 //BA.debugLineNum = 35979290;BA.debugLine="lstIndexes = B4XOM.Get(arrDouble(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=35979292;
 //BA.debugLineNum = 35979292;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=35979294;
 //BA.debugLineNum = 35979294;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=35979295;
 //BA.debugLineNum = 35979295;BA.debugLine="B4XOM.Put(arrDouble(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrdouble[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=35979298;
 //BA.debugLineNum = 35979298;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=35979300;
 //BA.debugLineNum = 35979300;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=35979302;
 //BA.debugLineNum = 35979302;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=35979303;
 //BA.debugLineNum = 35979303;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=35979304;
 //BA.debugLineNum = 35979304;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=35979305;
 //BA.debugLineNum = 35979305;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=35979306;
 //BA.debugLineNum = 35979306;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=35979310;
 //BA.debugLineNum = 35979310;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=35979312;
 //BA.debugLineNum = 35979312;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Sub SortOMLongIDX(arrLong() As Long, bAscending As";
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=35651588;
 //BA.debugLineNum = 35651588;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=35651589;
 //BA.debugLineNum = 35651589;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=35651592;
 //BA.debugLineNum = 35651592;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=35651593;
 //BA.debugLineNum = 35651593;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=35651594;
 //BA.debugLineNum = 35651594;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=35651597;
 //BA.debugLineNum = 35651597;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=35651599;
 //BA.debugLineNum = 35651599;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=35651600;
 //BA.debugLineNum = 35651600;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=35651603;
 //BA.debugLineNum = 35651603;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=35651604;
 //BA.debugLineNum = 35651604;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=35651607;
 //BA.debugLineNum = 35651607;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=35651608;
 //BA.debugLineNum = 35651608;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35651609;
 //BA.debugLineNum = 35651609;BA.debugLine="If B4XOM.ContainsKey(arrLong(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[(int) (_i)]))) { 
RDebugUtils.currentLine=35651610;
 //BA.debugLineNum = 35651610;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=35651612;
 //BA.debugLineNum = 35651612;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=35651614;
 //BA.debugLineNum = 35651614;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=35651615;
 //BA.debugLineNum = 35651615;BA.debugLine="B4XOM.Put(arrLong(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=35651618;
 //BA.debugLineNum = 35651618;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=35651620;
 //BA.debugLineNum = 35651620;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=35651622;
 //BA.debugLineNum = 35651622;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=35651623;
 //BA.debugLineNum = 35651623;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=35651624;
 //BA.debugLineNum = 35651624;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=35651625;
 //BA.debugLineNum = 35651625;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=35651626;
 //BA.debugLineNum = 35651626;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=35651630;
 //BA.debugLineNum = 35651630;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=35651632;
 //BA.debugLineNum = 35651632;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Sub SortOMLongIDX2(arrLong() As Long, arrIndex() A";
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=35782661;
 //BA.debugLineNum = 35782661;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=35782663;
 //BA.debugLineNum = 35782663;BA.debugLine="If Check1DLongAllSame(arrLong, iStart, iEnd) Then";
if (__ref._check1dlongallsame /*boolean*/ (null,_arrlong,_istart,_iend)) { 
RDebugUtils.currentLine=35782664;
 //BA.debugLineNum = 35782664;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=35782665;
 //BA.debugLineNum = 35782665;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=35782666;
 //BA.debugLineNum = 35782666;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=35782669;
 //BA.debugLineNum = 35782669;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=35782671;
 //BA.debugLineNum = 35782671;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=35782672;
 //BA.debugLineNum = 35782672;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=35782675;
 //BA.debugLineNum = 35782675;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=35782676;
 //BA.debugLineNum = 35782676;BA.debugLine="iEnd = arrLong.Length - 1";
_iend = (int) (_arrlong.length-1);
 };
RDebugUtils.currentLine=35782679;
 //BA.debugLineNum = 35782679;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=35782680;
 //BA.debugLineNum = 35782680;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35782681;
 //BA.debugLineNum = 35782681;BA.debugLine="If B4XOM.ContainsKey(arrLong(arrIndex(i))) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=35782682;
 //BA.debugLineNum = 35782682;BA.debugLine="lstIndexes = B4XOM.Get(arrLong(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=35782684;
 //BA.debugLineNum = 35782684;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=35782686;
 //BA.debugLineNum = 35782686;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=35782687;
 //BA.debugLineNum = 35782687;BA.debugLine="B4XOM.Put(arrLong(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrlong[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=35782690;
 //BA.debugLineNum = 35782690;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
RDebugUtils.currentLine=35782692;
 //BA.debugLineNum = 35782692;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=35782694;
 //BA.debugLineNum = 35782694;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group29 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_ovalue = group29.Get(index29);
RDebugUtils.currentLine=35782695;
 //BA.debugLineNum = 35782695;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=35782696;
 //BA.debugLineNum = 35782696;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step31 = 1;
final long limit31 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit31 ;_c = ((long)(0 + _c + step31))  ) {
RDebugUtils.currentLine=35782697;
 //BA.debugLineNum = 35782697;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=35782698;
 //BA.debugLineNum = 35782698;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=35782702;
 //BA.debugLineNum = 35782702;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=35782704;
 //BA.debugLineNum = 35782704;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Sub SortOMStringIDX(arrString() As String, bAscend";
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="Dim B4XOM As B4XOrderedMap";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=36044809;
 //BA.debugLineNum = 36044809;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=36044813;
 //BA.debugLineNum = 36044813;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=36044815;
 //BA.debugLineNum = 36044815;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=36044816;
 //BA.debugLineNum = 36044816;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=36044819;
 //BA.debugLineNum = 36044819;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=36044820;
 //BA.debugLineNum = 36044820;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=36044823;
 //BA.debugLineNum = 36044823;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=36044824;
 //BA.debugLineNum = 36044824;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36044825;
 //BA.debugLineNum = 36044825;BA.debugLine="If B4XOM.ContainsKey(arrString(i)) Then";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[(int) (_i)]))) { 
RDebugUtils.currentLine=36044826;
 //BA.debugLineNum = 36044826;BA.debugLine="lstIndexes = B4XOM.Get(arrString(i))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[(int) (_i)]))));
 }else {
RDebugUtils.currentLine=36044828;
 //BA.debugLineNum = 36044828;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=36044830;
 //BA.debugLineNum = 36044830;BA.debugLine="lstIndexes.Add(i)";
_lstindexes.Add((Object)(_i));
RDebugUtils.currentLine=36044831;
 //BA.debugLineNum = 36044831;BA.debugLine="B4XOM.Put(arrString(i), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[(int) (_i)]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=36044834;
 //BA.debugLineNum = 36044834;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=36044835;
 //BA.debugLineNum = 36044835;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=36044837;
 //BA.debugLineNum = 36044837;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=36044840;
 //BA.debugLineNum = 36044840;BA.debugLine="Dim arrIndex((iEnd - iStart) + 1) As Int";
_arrindex = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=36044842;
 //BA.debugLineNum = 36044842;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=36044843;
 //BA.debugLineNum = 36044843;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=36044844;
 //BA.debugLineNum = 36044844;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=36044845;
 //BA.debugLineNum = 36044845;BA.debugLine="arrIndex(n) = lstIndexes.Get(c)";
_arrindex[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=36044846;
 //BA.debugLineNum = 36044846;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=36044850;
 //BA.debugLineNum = 36044850;BA.debugLine="Return arrIndex";
if (true) return _arrindex;
RDebugUtils.currentLine=36044852;
 //BA.debugLineNum = 36044852;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Sub SortOMStringIDX2(arrString() As String, arrInd";
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="Dim i As Long";
_i = 0L;
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="Dim c As Long";
_c = 0L;
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="Dim n As Long";
_n = 0L;
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="Dim B4XOM As B4XOrderedMap 'this needs the B4XCol";
_b4xom = new b4a.example.ef.b4xorderedmap();
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="If Check1DStringAllSame(arrString, bCaseInsensiti";
if (__ref._check1dstringallsame /*boolean*/ (null,_arrstring,_bcaseinsensitive,_istart,_iend)) { 
RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="Dim arrIndex2(1) As Int";
_arrindex2 = new int[(int) (1)];
;
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="arrIndex2(0) = -1";
_arrindex2[(int) (0)] = (int) (-1);
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
 };
RDebugUtils.currentLine=36175885;
 //BA.debugLineNum = 36175885;BA.debugLine="B4XOM.Initialize";
_b4xom._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=36175887;
 //BA.debugLineNum = 36175887;BA.debugLine="If iStart = -1 Then";
if (_istart==-1) { 
RDebugUtils.currentLine=36175888;
 //BA.debugLineNum = 36175888;BA.debugLine="iStart = 0";
_istart = (int) (0);
 };
RDebugUtils.currentLine=36175891;
 //BA.debugLineNum = 36175891;BA.debugLine="If iEnd = -1 Then";
if (_iend==-1) { 
RDebugUtils.currentLine=36175892;
 //BA.debugLineNum = 36175892;BA.debugLine="iEnd = arrString.Length - 1";
_iend = (int) (_arrstring.length-1);
 };
RDebugUtils.currentLine=36175895;
 //BA.debugLineNum = 36175895;BA.debugLine="For i = iStart To iEnd";
{
final long step17 = 1;
final long limit17 = (long) (_iend);
_i = (long) (_istart) ;
for (;_i <= limit17 ;_i = ((long)(0 + _i + step17))  ) {
RDebugUtils.currentLine=36175896;
 //BA.debugLineNum = 36175896;BA.debugLine="Dim lstIndexes As List";
_lstindexes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36175897;
 //BA.debugLineNum = 36175897;BA.debugLine="If B4XOM.ContainsKey(arrString(arrIndex(i))) The";
if (_b4xom._containskey /*boolean*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))) { 
RDebugUtils.currentLine=36175898;
 //BA.debugLineNum = 36175898;BA.debugLine="lstIndexes = B4XOM.Get(arrString(arrIndex(i)))";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_b4xom._get /*Object*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]))));
 }else {
RDebugUtils.currentLine=36175900;
 //BA.debugLineNum = 36175900;BA.debugLine="lstIndexes.Initialize";
_lstindexes.Initialize();
 };
RDebugUtils.currentLine=36175902;
 //BA.debugLineNum = 36175902;BA.debugLine="lstIndexes.Add(arrIndex(i))";
_lstindexes.Add((Object)(_arrindex[(int) (_i)]));
RDebugUtils.currentLine=36175903;
 //BA.debugLineNum = 36175903;BA.debugLine="B4XOM.Put(arrString(arrIndex(i)), lstIndexes)";
_b4xom._put /*String*/ (null,(Object)(_arrstring[_arrindex[(int) (_i)]]),(Object)(_lstindexes.getObject()));
 }
};
RDebugUtils.currentLine=36175906;
 //BA.debugLineNum = 36175906;BA.debugLine="If bCaseInsensitive Then";
if (_bcaseinsensitive) { 
RDebugUtils.currentLine=36175907;
 //BA.debugLineNum = 36175907;BA.debugLine="B4XOM.Keys.SortCaseInsensitive(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).SortCaseInsensitive(_bascending);
 }else {
RDebugUtils.currentLine=36175909;
 //BA.debugLineNum = 36175909;BA.debugLine="B4XOM.Keys.Sort(bAscending)";
_b4xom._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null).Sort(_bascending);
 };
RDebugUtils.currentLine=36175912;
 //BA.debugLineNum = 36175912;BA.debugLine="Dim arrIndex2((iEnd - iStart) + 1) As Int";
_arrindex2 = new int[(int) ((_iend-_istart)+1)];
;
RDebugUtils.currentLine=36175914;
 //BA.debugLineNum = 36175914;BA.debugLine="For Each oValue As Object In B4XOM.Values";
{
final anywheresoftware.b4a.BA.IterableList group33 = _b4xom._getvalues /*anywheresoftware.b4a.objects.collections.List*/ (null);
final int groupLen33 = group33.getSize()
;int index33 = 0;
;
for (; index33 < groupLen33;index33++){
_ovalue = group33.Get(index33);
RDebugUtils.currentLine=36175915;
 //BA.debugLineNum = 36175915;BA.debugLine="lstIndexes = oValue";
_lstindexes = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_ovalue));
RDebugUtils.currentLine=36175916;
 //BA.debugLineNum = 36175916;BA.debugLine="For c = 0 To lstIndexes.Size - 1";
{
final long step35 = 1;
final long limit35 = (long) (_lstindexes.getSize()-1);
_c = (long) (0) ;
for (;_c <= limit35 ;_c = ((long)(0 + _c + step35))  ) {
RDebugUtils.currentLine=36175917;
 //BA.debugLineNum = 36175917;BA.debugLine="arrIndex2(n) = lstIndexes.Get(c)";
_arrindex2[(int) (_n)] = (int)(BA.ObjectToNumber(_lstindexes.Get((int) (_c))));
RDebugUtils.currentLine=36175918;
 //BA.debugLineNum = 36175918;BA.debugLine="n = n + 1";
_n = (long) (_n+1);
 }
};
 }
};
RDebugUtils.currentLine=36175922;
 //BA.debugLineNum = 36175922;BA.debugLine="Return arrIndex2";
if (true) return _arrindex2;
RDebugUtils.currentLine=36175924;
 //BA.debugLineNum = 36175924;BA.debugLine="End Sub";
return null;
}
public String  _unhidecol(b4a.example.ef.table __ref,int _col,int _newsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unhidecol", false))
	 {return ((String) Debug.delegate(ba, "unhidecol", new Object[] {_col,_newsize}));}
int[] _tmpwidths = null;
int _i = 0;
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub unHideCol(col As Int, newSize As Int)";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="Dim tmpWidths(SavedWidths.Length) As Int";
_tmpwidths = new int[__ref._savedwidths /*int[]*/ .length];
;
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="For i=0 To SavedWidths.Length-1";
{
final int step2 = 1;
final int limit2 = (int) (__ref._savedwidths /*int[]*/ .length-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=26738691;
 //BA.debugLineNum = 26738691;BA.debugLine="tmpWidths(i) = SavedWidths(i)";
_tmpwidths[_i] = __ref._savedwidths /*int[]*/ [_i];
 }
};
RDebugUtils.currentLine=26738693;
 //BA.debugLineNum = 26738693;BA.debugLine="tmpWidths(col) = newSize";
_tmpwidths[_col] = _newsize;
RDebugUtils.currentLine=26738694;
 //BA.debugLineNum = 26738694;BA.debugLine="SetColumnsWidths(tmpWidths)";
__ref._setcolumnswidths /*String*/ (null,_tmpwidths);
RDebugUtils.currentLine=26738695;
 //BA.debugLineNum = 26738695;BA.debugLine="End Sub";
return "";
}
public String  _unselectrow(b4a.example.ef.table __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "unselectrow", false))
	 {return ((String) Debug.delegate(ba, "unselectrow", new Object[] {_row}));}
int _previndex = 0;
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Public Sub UnselectRow(Row As Int)";
RDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="If Not(cAllowSelection) Then Return";
if (__c.Not(__ref._callowselection /*boolean*/ )) { 
if (true) return "";};
RDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="Dim prevIndex As Int";
_previndex = 0;
RDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="prevIndex = SelectedRows.indexof(Row)	 ' -1 if se";
_previndex = __ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_row));
RDebugUtils.currentLine=25296902;
 //BA.debugLineNum = 25296902;BA.debugLine="If prevIndex > -1 Then";
if (_previndex>-1) { 
RDebugUtils.currentLine=25296904;
 //BA.debugLineNum = 25296904;BA.debugLine="SelectedCol = -1";
__ref._selectedcol /*int*/  = (int) (-1);
RDebugUtils.currentLine=25296905;
 //BA.debugLineNum = 25296905;BA.debugLine="SelectedRows.RemoveAt(prevIndex)";
__ref._selectedrows /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_previndex);
RDebugUtils.currentLine=25296906;
 //BA.debugLineNum = 25296906;BA.debugLine="If visibleRows.ContainsKey(Row) Then";
if (__ref._visiblerows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_row))) { 
RDebugUtils.currentLine=25296907;
 //BA.debugLineNum = 25296907;BA.debugLine="HideRow(Row)";
__ref._hiderow /*String*/ (null,_row);
RDebugUtils.currentLine=25296908;
 //BA.debugLineNum = 25296908;BA.debugLine="ShowRow(Row)";
__ref._showrow /*void*/ (null,_row);
 };
 };
RDebugUtils.currentLine=25296911;
 //BA.debugLineNum = 25296911;BA.debugLine="End Sub";
return "";
}
public boolean  _updatecell(b4a.example.ef.table __ref,int _col,int _row,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updatecell", false))
	 {return ((Boolean) Debug.delegate(ba, "updatecell", new Object[] {_col,_row,_value}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Public Sub UpdateCell(Col As Int, Row As Int, Valu";
RDebugUtils.currentLine=26017793;
 //BA.debugLineNum = 26017793;BA.debugLine="If (Col < 0 Or Col > mNumberOfColumns - 1 Or Row";
if ((_col<0 || _col>__ref._mnumberofcolumns /*int*/ -1 || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="SetValue(Col, Row, Value)";
__ref._setvalue /*String*/ (null,_col,_row,_value);
RDebugUtils.currentLine=26017797;
 //BA.debugLineNum = 26017797;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=26017798;
 //BA.debugLineNum = 26017798;BA.debugLine="End Sub";
return false;
}
public boolean  _updaterow(b4a.example.ef.table __ref,int _row,String[] _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="table";
if (Debug.shouldDelegate(ba, "updaterow", false))
	 {return ((Boolean) Debug.delegate(ba, "updaterow", new Object[] {_row,_values}));}
int _i = 0;
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub UpdateRow(Row As Int, Values () As Stri";
RDebugUtils.currentLine=25952257;
 //BA.debugLineNum = 25952257;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="If (Values.Length <> mNumberOfColumns Or Row <0 O";
if ((_values.length!=__ref._mnumberofcolumns /*int*/  || _row<0 || _row>__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)) { 
RDebugUtils.currentLine=25952259;
 //BA.debugLineNum = 25952259;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=25952261;
 //BA.debugLineNum = 25952261;BA.debugLine="For i=0 To Values.Length-1";
{
final int step5 = 1;
final int limit5 = (int) (_values.length-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=25952262;
 //BA.debugLineNum = 25952262;BA.debugLine="SetValue(i,Row,Values(i))";
__ref._setvalue /*String*/ (null,_i,_row,_values[_i]);
 }
};
RDebugUtils.currentLine=25952264;
 //BA.debugLineNum = 25952264;BA.debugLine="Return True";
if (true) return __c.True;
RDebugUtils.currentLine=25952265;
 //BA.debugLineNum = 25952265;BA.debugLine="End Sub";
return false;
}
}