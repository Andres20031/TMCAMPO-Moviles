package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xtable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.b4xtable");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.b4xtable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public anywheresoftware.b4a.sql.SQL _sql1 = null;
public int _column_type_text = 0;
public int _column_type_numbers = 0;
public int _column_type_date = 0;
public int _column_type_void = 0;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public anywheresoftware.b4a.objects.collections.List _visiblecolumns = null;
public int _mfirstrowindex = 0;
public int _mlastrowindex = 0;
public b4a.example.ef.b4xformatter _defaultformatter = null;
public b4a.example.ef.b4xformatter _defaultdataformatter = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnlheader = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _pnltitles = null;
public b4a.example3.customlistview _clvdata = null;
public int _rowheight = 0;
public int _headersheight = 0;
public boolean _allowsmallrowheightmodifications = false;
public int _mrowsperpage = 0;
public boolean _layoutloaded = false;
public int _minimumwidth = 0;
public int _sqlindex = 0;
public int _evenrowcolor = 0;
public int _oddrowcolor = 0;
public int _headertextcolor = 0;
public int _textcolor = 0;
public int _highlighttextcolor = 0;
public int _headercolor = 0;
public int _gridcolor = 0;
public boolean _highlightsearchresults = false;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _headerfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _labelsfont = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfirst = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnumber = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblnext = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lbllast = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblfromto = null;
public int _countall = 0;
public int _mcurrentpage = 0;
public int _mcurrentcount = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _lblsort = null;
public b4a.example.ef.b4xfloattextfield _searchfield = null;
public String _filtertext = "";
public int _sleepbeforesearch = 0;
public int _searchindex = 0;
public int _arrowsenabledcolor = 0;
public int _arrowsdisabledcolor = 0;
public anywheresoftware.b4a.objects.collections.List _visiblerowids = null;
public int _selectioncolor = 0;
public String _sqltablename = "";
public String _stringmoreavailable = "";
public String _stringnomatches = "";
public String _stringoutof = "";
public String _stringto = "";
public int _maximumrowsperpage = 0;
public boolean _prefixsearch = false;
public int _lastbaseheight = 0;
public int _numberoffrozencolumns = 0;
public long _lastcellclickevent = 0L;
public boolean _searchvisible = false;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public static class _b4xtablecolumn{
public boolean IsInitialized;
public String Title;
public String Id;
public int ColumnType;
public boolean Sortable;
public boolean Searchable;
public b4a.example.ef.b4xformatter Formatter;
public String SQLID;
public int Width;
public int ComputedWidth;
public anywheresoftware.b4a.objects.collections.List CellsLayouts;
public anywheresoftware.b4a.objects.B4XViewWrapper Panel;
public int LabelIndex;
public boolean DisableAutoResizeLayout;
public String InternalSortMode;
public void Initialize() {
IsInitialized = true;
Title = "";
Id = "";
ColumnType = 0;
Sortable = false;
Searchable = false;
Formatter = new b4a.example.ef.b4xformatter();
SQLID = "";
Width = 0;
ComputedWidth = 0;
CellsLayouts = new anywheresoftware.b4a.objects.collections.List();
Panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
LabelIndex = 0;
DisableAutoResizeLayout = false;
InternalSortMode = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4a.example.ef.b4xtable._b4xtablecolumn  _addcolumn(String _title,int _columntype) throws Exception{
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _header = null;
 //BA.debugLineNum = 595;BA.debugLine="Public Sub AddColumn (Title As String, ColumnType";
 //BA.debugLineNum = 596;BA.debugLine="Dim c As B4XTableColumn";
_c = new b4a.example.ef.b4xtable._b4xtablecolumn();
 //BA.debugLineNum = 597;BA.debugLine="c.Initialize";
_c.Initialize();
 //BA.debugLineNum = 598;BA.debugLine="c.Title = Title";
_c.Title /*String*/  = _title;
 //BA.debugLineNum = 599;BA.debugLine="c.ColumnType = ColumnType";
_c.ColumnType /*int*/  = _columntype;
 //BA.debugLineNum = 600;BA.debugLine="c.Sortable = ColumnType <> COLUMN_TYPE_VOID";
_c.Sortable /*boolean*/  = _columntype!=_column_type_void;
 //BA.debugLineNum = 601;BA.debugLine="c.Searchable = ColumnType = COLUMN_TYPE_TEXT";
_c.Searchable /*boolean*/  = _columntype==_column_type_text;
 //BA.debugLineNum = 602;BA.debugLine="c.CellsLayouts.Initialize";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 603;BA.debugLine="c.Formatter = DefaultDataFormatter";
_c.Formatter /*b4a.example.ef.b4xformatter*/  = _defaultdataformatter;
 //BA.debugLineNum = 604;BA.debugLine="c.Panel = xui.CreatePanel(\"ColumnPanel\")";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xui.CreatePanel(ba,"ColumnPanel");
 //BA.debugLineNum = 605;BA.debugLine="c.Panel.Tag = c";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_c));
 //BA.debugLineNum = 606;BA.debugLine="c.Id = Title";
_c.Id /*String*/  = _title;
 //BA.debugLineNum = 607;BA.debugLine="Columns.Add(c)";
_columns.Add((Object)(_c));
 //BA.debugLineNum = 608;BA.debugLine="VisibleColumns.Add(c)";
_visiblecolumns.Add((Object)(_c));
 //BA.debugLineNum = 609;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
_createcolumnlayouts(_c,(int) (_mrowsperpage+1));
 //BA.debugLineNum = 610;BA.debugLine="Dim header As B4XView = GetLabelFromColumn(c, 0)";
_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_header = _getlabelfromcolumn(_c,(int) (0));
 //BA.debugLineNum = 611;BA.debugLine="SetTextOrCSBuilderToLabel (header, Title)";
_settextorcsbuildertolabel(_header,(Object)(_title));
 //BA.debugLineNum = 612;BA.debugLine="If LayoutLoaded Then";
if (_layoutloaded) { 
 //BA.debugLineNum = 613;BA.debugLine="AddColumnToCLV(c)";
_addcolumntoclv(_c);
 };
 //BA.debugLineNum = 615;BA.debugLine="Return c";
if (true) return _c;
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return null;
}
public String  _addcolumntoclv(b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Private Sub AddColumnToCLV (c As B4XTableColumn)";
 //BA.debugLineNum = 588;BA.debugLine="clvData.Add(c.Panel, c)";
_clvdata._add(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 141;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 142;BA.debugLine="Refresh2 (False, False)";
_refresh2(__c.False,__c.False);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _buildlayoutscache(int _size) throws Exception{
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
 //BA.debugLineNum = 619;BA.debugLine="Public Sub BuildLayoutsCache (Size As Int)";
 //BA.debugLineNum = 620;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columns;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
 //BA.debugLineNum = 621;BA.debugLine="CreateColumnLayouts(c, Size + 1)";
_createcolumnlayouts(_c,(int) (_size+1));
 }
};
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return "";
}
public Object[]  _buildquery(boolean _withpagelimit) throws Exception{
String _sortcolumn = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _totalcount = 0;
int _limit = 0;
String[] _aargs = null;
int _i = 0;
 //BA.debugLineNum = 337;BA.debugLine="Public Sub BuildQuery (WithPageLimit As Boolean) A";
 //BA.debugLineNum = 338;BA.debugLine="Dim SortColumn As String";
_sortcolumn = "";
 //BA.debugLineNum = 339;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 340;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 341;BA.debugLine="sb.Append(\"SELECT rowid\")";
_sb.Append("SELECT rowid");
 //BA.debugLineNum = 342;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group5 = _visiblecolumns;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
 //BA.debugLineNum = 343;BA.debugLine="If c.ColumnType = COLUMN_TYPE_VOID Then Continue";
if (_c.ColumnType /*int*/ ==_column_type_void) { 
if (true) continue;};
 //BA.debugLineNum = 344;BA.debugLine="sb.Append(\",\").Append(c.SQLID)";
_sb.Append(",").Append(_c.SQLID /*String*/ );
 //BA.debugLineNum = 345;BA.debugLine="If c.InternalSortMode <> \"\" Then";
if ((_c.InternalSortMode /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 346;BA.debugLine="SortColumn = \" ORDER BY \" & c.SQLID & \" \" & c.I";
_sortcolumn = " ORDER BY "+_c.SQLID /*String*/ +" "+_c.InternalSortMode /*String*/ ;
 };
 }
};
 //BA.debugLineNum = 349;BA.debugLine="sb.Append(\" FROM \").Append(SQLTableName).Append(\"";
_sb.Append(" FROM ").Append(_sqltablename).Append(" ");
 //BA.debugLineNum = 350;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 351;BA.debugLine="args.Initialize";
_args.Initialize();
 //BA.debugLineNum = 352;BA.debugLine="Dim TotalCount As Int";
_totalcount = 0;
 //BA.debugLineNum = 353;BA.debugLine="If FilterText = \"\" Then";
if ((_filtertext).equals("")) { 
 //BA.debugLineNum = 354;BA.debugLine="TotalCount = CountAll";
_totalcount = _countall;
 }else {
 //BA.debugLineNum = 356;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group19 = _visiblecolumns;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group19.Get(index19));
 //BA.debugLineNum = 357;BA.debugLine="If c.Searchable Then";
if (_c.Searchable /*boolean*/ ) { 
 //BA.debugLineNum = 358;BA.debugLine="If args.Size = 0 Then";
if (_args.getSize()==0) { 
 //BA.debugLineNum = 359;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
 }else {
 //BA.debugLineNum = 361;BA.debugLine="sb.Append(\" OR \")";
_sb.Append(" OR ");
 };
 //BA.debugLineNum = 363;BA.debugLine="sb.Append(c.SQLID).Append(\" LIKE ? \")";
_sb.Append(_c.SQLID /*String*/ ).Append(" LIKE ? ");
 //BA.debugLineNum = 364;BA.debugLine="If PrefixSearch Then";
if (_prefixsearch) { 
 //BA.debugLineNum = 365;BA.debugLine="args.Add(FilterText & \"%\")";
_args.Add((Object)(_filtertext+"%"));
 }else {
 //BA.debugLineNum = 367;BA.debugLine="args.Add(\"%\" & FilterText & \"%\")";
_args.Add((Object)("%"+_filtertext+"%"));
 };
 };
 }
};
 //BA.debugLineNum = 371;BA.debugLine="TotalCount = -1";
_totalcount = (int) (-1);
 };
 //BA.debugLineNum = 373;BA.debugLine="If SortColumn <> \"\" Then sb.Append(SortColumn)";
if ((_sortcolumn).equals("") == false) { 
_sb.Append(_sortcolumn);};
 //BA.debugLineNum = 374;BA.debugLine="If WithPageLimit Then";
if (_withpagelimit) { 
 //BA.debugLineNum = 375;BA.debugLine="Dim limit As Int = mRowsPerPage";
_limit = _mrowsperpage;
 //BA.debugLineNum = 376;BA.debugLine="If TotalCount < 0 Then limit = limit + 1";
if (_totalcount<0) { 
_limit = (int) (_limit+1);};
 //BA.debugLineNum = 377;BA.debugLine="sb.Append($\" LIMIT ${mFirstRowIndex}, ${limit}\"$";
_sb.Append((" LIMIT "+__c.SmartStringFormatter("",(Object)(_mfirstrowindex))+", "+__c.SmartStringFormatter("",(Object)(_limit))+""));
 };
 //BA.debugLineNum = 380;BA.debugLine="Dim aargs(args.Size) As String";
_aargs = new String[_args.getSize()];
java.util.Arrays.fill(_aargs,"");
 //BA.debugLineNum = 381;BA.debugLine="For i = 0 To args.Size - 1";
{
final int step43 = 1;
final int limit43 = (int) (_args.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
 //BA.debugLineNum = 382;BA.debugLine="aargs(i) = args.Get(i)";
_aargs[_i] = BA.ObjectToString(_args.Get(_i));
 }
};
 //BA.debugLineNum = 387;BA.debugLine="Return Array(sb.ToString, aargs, TotalCount)";
if (true) return new Object[]{(Object)(_sb.ToString()),(Object)(_aargs),(Object)(_totalcount)};
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return null;
}
public String  _calculatewidths() throws Exception{
int _wildcardcount = 0;
int _totalexplicitwidth = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
int _wildcardwidth = 0;
int _width = 0;
int _remainder = 0;
 //BA.debugLineNum = 565;BA.debugLine="Private Sub CalculateWidths";
 //BA.debugLineNum = 566;BA.debugLine="Dim wildcardcount As Int";
_wildcardcount = 0;
 //BA.debugLineNum = 567;BA.debugLine="Dim TotalExplicitWidth As Int";
_totalexplicitwidth = 0;
 //BA.debugLineNum = 568;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group3 = _visiblecolumns;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group3.Get(index3));
 //BA.debugLineNum = 569;BA.debugLine="If c.Width = 0 Then wildcardcount = wildcardcoun";
if (_c.Width /*int*/ ==0) { 
_wildcardcount = (int) (_wildcardcount+1);}
else {
_c.ComputedWidth /*int*/  = _c.Width /*int*/ ;};
 //BA.debugLineNum = 570;BA.debugLine="TotalExplicitWidth = TotalExplicitWidth + c.Widt";
_totalexplicitwidth = (int) (_totalexplicitwidth+_c.Width /*int*/ );
 }
};
 //BA.debugLineNum = 572;BA.debugLine="If wildcardcount = 0 Then Return";
if (_wildcardcount==0) { 
if (true) return "";};
 //BA.debugLineNum = 573;BA.debugLine="Dim WildcardWidth As Int = Max(wildcardcount * Mi";
_wildcardwidth = (int) (__c.Max(_wildcardcount*_minimumwidth,_mbase.getWidth()-__c.DipToCurrent((int) (2))-_totalexplicitwidth));
 //BA.debugLineNum = 574;BA.debugLine="Dim Width As Int = WildcardWidth / wildcardcount";
_width = (int) (_wildcardwidth/(double)_wildcardcount);
 //BA.debugLineNum = 575;BA.debugLine="Dim Remainder As Int = WildcardWidth Mod wildcard";
_remainder = (int) (_wildcardwidth%_wildcardcount);
 //BA.debugLineNum = 576;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group11 = _visiblecolumns;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group11.Get(index11));
 //BA.debugLineNum = 577;BA.debugLine="If c.Width = 0 Then";
if (_c.Width /*int*/ ==0) { 
 //BA.debugLineNum = 578;BA.debugLine="c.ComputedWidth = Width";
_c.ComputedWidth /*int*/  = _width;
 //BA.debugLineNum = 579;BA.debugLine="If Remainder > 0 Then";
if (_remainder>0) { 
 //BA.debugLineNum = 580;BA.debugLine="Remainder = Remainder - 1";
_remainder = (int) (_remainder-1);
 //BA.debugLineNum = 581;BA.debugLine="c.ComputedWidth = c.ComputedWidth + 1";
_c.ComputedWidth /*int*/  = (int) (_c.ComputedWidth /*int*/ +1);
 };
 };
 }
};
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _cell_click() throws Exception{
 //BA.debugLineNum = 738;BA.debugLine="Private Sub Cell_Click";
 //BA.debugLineNum = 739;BA.debugLine="CellClicked(Sender, False)";
_cellclicked((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.False);
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return "";
}
public String  _cell_longclick() throws Exception{
 //BA.debugLineNum = 742;BA.debugLine="Private Sub Cell_LongClick";
 //BA.debugLineNum = 743;BA.debugLine="CellClicked(Sender, True)";
_cellclicked((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
 //BA.debugLineNum = 744;BA.debugLine="End Sub";
return "";
}
public void  _cellclicked(anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) throws Exception{
ResumableSub_CellClicked rsub = new ResumableSub_CellClicked(this,_pnl,_longclicked);
rsub.resume(ba, null);
}
public static class ResumableSub_CellClicked extends BA.ResumableSub {
public ResumableSub_CellClicked(b4a.example.ef.b4xtable parent,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) {
this.parent = parent;
this._pnl = _pnl;
this._longclicked = _longclicked;
}
b4a.example.ef.b4xtable parent;
anywheresoftware.b4a.objects.B4XViewWrapper _pnl;
boolean _longclicked;
b4a.example.ef.b4xtable._b4xtablecolumn _column = null;
int _row = 0;
String _e = "";
long _rowid = 0L;
int _clr = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 777;BA.debugLine="If DateTime.Now < LastCellClickEvent + 20 Then Re";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.DateTime.getNow()<parent._lastcellclickevent+20) { 
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
 //BA.debugLineNum = 778;BA.debugLine="LastCellClickEvent = DateTime.Now";
parent._lastcellclickevent = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 779;BA.debugLine="Dim column As B4XTableColumn = pnl.Parent.Tag";
_column = (b4a.example.ef.b4xtable._b4xtablecolumn)(_pnl.getParent().getTag());
 //BA.debugLineNum = 780;BA.debugLine="Dim Row As Int = pnl.Tag - 1";
_row = (int) ((double)(BA.ObjectToNumber(_pnl.getTag()))-1);
 //BA.debugLineNum = 781;BA.debugLine="Dim e As String";
_e = "";
 //BA.debugLineNum = 782;BA.debugLine="If Row = -1 Then";
if (true) break;

case 7:
//if
this.state = 61;
if (_row==-1) { 
this.state = 9;
}else if(parent._visiblerowids.getSize()>0) { 
this.state = 20;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 783;BA.debugLine="If LongClicked Then";
if (true) break;

case 10:
//if
this.state = 15;
if (_longclicked) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 784;BA.debugLine="e = \"_headerlongclicked\"";
_e = "_headerlongclicked";
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 786;BA.debugLine="e = \"_headerclicked\"";
_e = "_headerclicked";
 //BA.debugLineNum = 787;BA.debugLine="HeaderClicked(column)";
parent._headerclicked(_column);
 if (true) break;
;
 //BA.debugLineNum = 789;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 1) T";

case 15:
//if
this.state = 18;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+_e,(int) (1))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
 //BA.debugLineNum = 793;BA.debugLine="CallSub2(mCallBack, mEventName & e, column.Id)";
parent.__c.CallSubNew2(ba,parent._mcallback,parent._meventname+_e,(Object)(_column.Id /*String*/ ));
 if (true) break;

case 18:
//C
this.state = 61;
;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 796;BA.debugLine="Dim RowId As Long = VisibleRowIds.Get(Row)";
_rowid = BA.ObjectToLongNumber(parent._visiblerowids.Get(_row));
 //BA.debugLineNum = 797;BA.debugLine="If RowId > 0 Then";
if (true) break;

case 21:
//if
this.state = 60;
if (_rowid>0) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 798;BA.debugLine="Dim clr As Int";
_clr = 0;
 //BA.debugLineNum = 799;BA.debugLine="If Row Mod 2 = 0 Then clr = EvenRowColor Else c";
if (true) break;

case 24:
//if
this.state = 31;
if (_row%2==0) { 
this.state = 26;
;}
else {
this.state = 28;
;}if (true) break;

case 26:
//C
this.state = 31;
_clr = parent._evenrowcolor;
if (true) break;

case 28:
//C
this.state = 31;
_clr = parent._oddrowcolor;
if (true) break;

case 31:
//C
this.state = 32;
;
 //BA.debugLineNum = 801;BA.debugLine="If LongClicked Then";
if (true) break;

case 32:
//if
this.state = 43;
if (_longclicked) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 43;
 //BA.debugLineNum = 802;BA.debugLine="e = \"_CellLongClicked\"";
_e = "_CellLongClicked";
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 804;BA.debugLine="e = \"_cellclicked\"";
_e = "_cellclicked";
 //BA.debugLineNum = 805;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnimat";
if (true) break;

case 37:
//if
this.state = 42;
if (parent._selectioncolor!=0) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_pnl.SetColorAnimated((int) (50),_clr,parent._selectioncolor);
if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
 //BA.debugLineNum = 808;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 2)";

case 43:
//if
this.state = 46;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+_e,(int) (2))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
 //BA.debugLineNum = 812;BA.debugLine="CallSub3(mCallBack, mEventName & e, column.Id,";
parent.__c.CallSubNew3(ba,parent._mcallback,parent._meventname+_e,(Object)(_column.Id /*String*/ ),parent._visiblerowids.Get(_row));
 if (true) break;
;
 //BA.debugLineNum = 814;BA.debugLine="If LongClicked = False Then";

case 46:
//if
this.state = 59;
if (_longclicked==parent.__c.False) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
 //BA.debugLineNum = 815;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,this,(int) (200));
this.state = 62;
return;
case 62:
//C
this.state = 49;
;
 //BA.debugLineNum = 816;BA.debugLine="If pnl.IsInitialized Then";
if (true) break;

case 49:
//if
this.state = 58;
if (_pnl.IsInitialized()) { 
this.state = 51;
}if (true) break;

case 51:
//C
this.state = 52;
 //BA.debugLineNum = 817;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnima";
if (true) break;

case 52:
//if
this.state = 57;
if (parent._selectioncolor!=0) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_pnl.SetColorAnimated((int) (200),parent._selectioncolor,_clr);
if (true) break;

case 57:
//C
this.state = 58;
;
 if (true) break;

case 58:
//C
this.state = 59;
;
 if (true) break;

case 59:
//C
this.state = 60;
;
 if (true) break;

case 60:
//C
this.state = 61;
;
 if (true) break;

case 61:
//C
this.state = -1;
;
 //BA.debugLineNum = 822;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _checkandremovecolumnthatwasaddedtoincorrectparent(b4a.example.ef.b4xtable._b4xtablecolumn _c,boolean _isfrozen) throws Exception{
 //BA.debugLineNum = 279;BA.debugLine="Private Sub CheckAndRemoveColumnThatWasAddedToInco";
 //BA.debugLineNum = 280;BA.debugLine="If (c.Panel.Parent = mBase) <> IsFrozen Then";
if (((_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(_mbase))!=_isfrozen) { 
 //BA.debugLineNum = 281;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
 //BA.debugLineNum = 282;BA.debugLine="RemoveColumnFromCLV(c)";
_removecolumnfromclv(_c);
 }else {
 //BA.debugLineNum = 284;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
 };
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 16;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 18;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 19;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 21;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 22;BA.debugLine="Public sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 23;BA.debugLine="Type B4XTableColumn (Title As String, Id As Strin";
;
 //BA.debugLineNum = 26;BA.debugLine="Public COLUMN_TYPE_TEXT = 1, COLUMN_TYPE_NUMBERS";
_column_type_text = (int) (1);
_column_type_numbers = (int) (2);
_column_type_date = (int) (3);
_column_type_void = (int) (4);
 //BA.debugLineNum = 27;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="Public VisibleColumns As List";
_visiblecolumns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 29;BA.debugLine="Private mFirstRowIndex, mLastRowIndex As Int";
_mfirstrowindex = 0;
_mlastrowindex = 0;
 //BA.debugLineNum = 30;BA.debugLine="Public DefaultFormatter, DefaultDataFormatter As";
_defaultformatter = new b4a.example.ef.b4xformatter();
_defaultdataformatter = new b4a.example.ef.b4xformatter();
 //BA.debugLineNum = 31;BA.debugLine="Public pnlHeader As B4XView";
_pnlheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Public pnlTitles As B4XView";
_pnltitles = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Public clvData As CustomListView";
_clvdata = new b4a.example3.customlistview();
 //BA.debugLineNum = 34;BA.debugLine="Public RowHeight, HeadersHeight As Int";
_rowheight = 0;
_headersheight = 0;
 //BA.debugLineNum = 35;BA.debugLine="Public AllowSmallRowHeightModifications As Boolea";
_allowsmallrowheightmodifications = __c.True;
 //BA.debugLineNum = 36;BA.debugLine="Private mRowsPerPage As Int = 0";
_mrowsperpage = (int) (0);
 //BA.debugLineNum = 37;BA.debugLine="Private LayoutLoaded As Boolean";
_layoutloaded = false;
 //BA.debugLineNum = 38;BA.debugLine="Public MinimumWidth As Int";
_minimumwidth = 0;
 //BA.debugLineNum = 39;BA.debugLine="Private SQLIndex As Int";
_sqlindex = 0;
 //BA.debugLineNum = 40;BA.debugLine="Public EvenRowColor, OddRowColor, HeaderTextColor";
_evenrowcolor = 0;
_oddrowcolor = 0;
_headertextcolor = 0;
_textcolor = 0;
_highlighttextcolor = 0;
_headercolor = 0;
_gridcolor = 0;
 //BA.debugLineNum = 41;BA.debugLine="Public HighlightSearchResults As Boolean = True";
_highlightsearchresults = __c.True;
 //BA.debugLineNum = 42;BA.debugLine="Public HeaderFont, LabelsFont As B4XFont";
_headerfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_labelsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 43;BA.debugLine="Public lblFirst As B4XView";
_lblfirst = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Public lblBack As B4XView";
_lblback = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Public lblNumber As B4XView";
_lblnumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Public lblNext As B4XView";
_lblnext = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Public lblLast As B4XView";
_lbllast = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Public lblFromTo As B4XView";
_lblfromto = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private CountAll As Int";
_countall = 0;
 //BA.debugLineNum = 50;BA.debugLine="Private mCurrentPage As Int";
_mcurrentpage = 0;
 //BA.debugLineNum = 51;BA.debugLine="Public mCurrentCount As Int";
_mcurrentcount = 0;
 //BA.debugLineNum = 52;BA.debugLine="Public lblSort As B4XView";
_lblsort = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4a.example.ef.b4xfloattextfield();
 //BA.debugLineNum = 54;BA.debugLine="Private FilterText As String";
_filtertext = "";
 //BA.debugLineNum = 55;BA.debugLine="Public SleepBeforeSearch As Int = 300";
_sleepbeforesearch = (int) (300);
 //BA.debugLineNum = 56;BA.debugLine="Private SearchIndex As Int";
_searchindex = 0;
 //BA.debugLineNum = 57;BA.debugLine="Public ArrowsEnabledColor, ArrowsDisabledColor As";
_arrowsenabledcolor = 0;
_arrowsdisabledcolor = 0;
 //BA.debugLineNum = 58;BA.debugLine="Public VisibleRowIds As List";
_visiblerowids = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 59;BA.debugLine="Public SelectionColor As Int";
_selectioncolor = 0;
 //BA.debugLineNum = 60;BA.debugLine="Private SQLTableName As String = \"data\"";
_sqltablename = "data";
 //BA.debugLineNum = 61;BA.debugLine="Public StringMoreAvailable As String = \"(more ava";
_stringmoreavailable = "(more available)";
 //BA.debugLineNum = 62;BA.debugLine="Public StringNoMatches As String = \"No matches\"";
_stringnomatches = "No matches";
 //BA.debugLineNum = 63;BA.debugLine="Public StringOutOf As String = \"out of\"";
_stringoutof = "out of";
 //BA.debugLineNum = 64;BA.debugLine="Public StringTo As String = \"to\"";
_stringto = "to";
 //BA.debugLineNum = 65;BA.debugLine="Public MaximumRowsPerPage As Int";
_maximumrowsperpage = 0;
 //BA.debugLineNum = 66;BA.debugLine="Public PrefixSearch As Boolean";
_prefixsearch = false;
 //BA.debugLineNum = 71;BA.debugLine="Private LastBaseHeight As Int";
_lastbaseheight = 0;
 //BA.debugLineNum = 72;BA.debugLine="Public NumberOfFrozenColumns As Int";
_numberoffrozencolumns = 0;
 //BA.debugLineNum = 73;BA.debugLine="Private LastCellClickEvent As Long";
_lastcellclickevent = 0L;
 //BA.debugLineNum = 77;BA.debugLine="Public SearchVisible As Boolean";
_searchvisible = false;
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public void  _clear() throws Exception{
ResumableSub_Clear rsub = new ResumableSub_Clear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Clear extends BA.ResumableSub {
public ResumableSub_Clear(b4a.example.ef.b4xtable parent) {
this.parent = parent;
}
b4a.example.ef.b4xtable parent;
anywheresoftware.b4a.sql.SQL _oldsql = null;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 147;BA.debugLine="SQLIndex = SQLIndex + 1";
parent._sqlindex = (int) (parent._sqlindex+1);
 //BA.debugLineNum = 148;BA.debugLine="Dim OldSQL As SQL = sql1";
_oldsql = parent._sql1;
 //BA.debugLineNum = 149;BA.debugLine="Dim sql1 As SQL";
parent._sql1 = new anywheresoftware.b4a.sql.SQL();
 //BA.debugLineNum = 150;BA.debugLine="For Each c As B4XTableColumn In Columns";
if (true) break;

case 1:
//for
this.state = 8;
group4 = parent._columns;
index4 = 0;
groupLen4 = group4.getSize();
this.state = 21;
if (true) break;

case 21:
//C
this.state = 8;
if (index4 < groupLen4) {
this.state = 3;
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group4.Get(index4));}
if (true) break;

case 22:
//C
this.state = 21;
index4++;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 151;BA.debugLine="If c.Panel.IsInitialized And c.Panel.Parent.IsIn";
if (true) break;

case 4:
//if
this.state = 7;
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized() && _c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 152;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 if (true) break;

case 7:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 155;BA.debugLine="VisibleColumns.Clear";
parent._visiblecolumns.Clear();
 //BA.debugLineNum = 156;BA.debugLine="Columns.Clear";
parent._columns.Clear();
 //BA.debugLineNum = 157;BA.debugLine="SQLTableName = \"data\"";
parent._sqltablename = "data";
 //BA.debugLineNum = 158;BA.debugLine="If clvData.IsInitialized Then";
if (true) break;

case 9:
//if
this.state = 12;
if (parent._clvdata.IsInitialized()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 159;BA.debugLine="clvData.Clear";
parent._clvdata._clear();
 if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 161;BA.debugLine="mFirstRowIndex = 0";
parent._mfirstrowindex = (int) (0);
 //BA.debugLineNum = 162;BA.debugLine="ClearNavigationState";
parent._clearnavigationstate();
 //BA.debugLineNum = 163;BA.debugLine="If OldSQL.IsInitialized Then";
if (true) break;

case 13:
//if
this.state = 20;
if (_oldsql.IsInitialized()) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 164;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
 //BA.debugLineNum = 165;BA.debugLine="If OldSQL.IsInitialized Then";
if (true) break;

case 16:
//if
this.state = 19;
if (_oldsql.IsInitialized()) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 166;BA.debugLine="OldSQL.Close";
_oldsql.Close();
 if (true) break;

case 19:
//C
this.state = 20;
;
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cleardataview() throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Public Sub ClearDataView";
 //BA.debugLineNum = 401;BA.debugLine="SQLTableName = \"data\"";
_sqltablename = "data";
 //BA.debugLineNum = 402;BA.debugLine="mFirstRowIndex = 0";
_mfirstrowindex = (int) (0);
 //BA.debugLineNum = 403;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
_countall = (int)(Double.parseDouble(_sql1.ExecQuerySingleResult("SELECT count(*) FROM data")));
 //BA.debugLineNum = 404;BA.debugLine="UpdateData (True)";
_updatedata(__c.True);
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return "";
}
public String  _clearnavigationstate() throws Exception{
 //BA.debugLineNum = 171;BA.debugLine="Private Sub ClearNavigationState";
 //BA.debugLineNum = 172;BA.debugLine="If lblNext.IsInitialized = False Then Return";
if (_lblnext.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 173;BA.debugLine="SetPageLabelState(lblNext, False)";
_setpagelabelstate(_lblnext,__c.False);
 //BA.debugLineNum = 174;BA.debugLine="SetPageLabelState(lblLast, False)";
_setpagelabelstate(_lbllast,__c.False);
 //BA.debugLineNum = 175;BA.debugLine="SetPageLabelState(lblBack, False)";
_setpagelabelstate(_lblback,__c.False);
 //BA.debugLineNum = 176;BA.debugLine="SetPageLabelState(lblFirst, False)";
_setpagelabelstate(_lblfirst,__c.False);
 //BA.debugLineNum = 177;BA.debugLine="lblFromTo.Text = \"\"";
_lblfromto.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 178;BA.debugLine="lblNumber.Text = \"\"";
_lblnumber.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _columntosqltype(b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
 //BA.debugLineNum = 711;BA.debugLine="Private Sub ColumnToSQLType (c As B4XTableColumn)";
 //BA.debugLineNum = 712;BA.debugLine="If c.ColumnType = COLUMN_TYPE_TEXT Then Return \"T";
if (_c.ColumnType /*int*/ ==_column_type_text) { 
if (true) return "TEXT";}
else {
if (true) return "INTEGER";};
 //BA.debugLineNum = 713;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createcellviews() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
 //BA.debugLineNum = 716;BA.debugLine="Private Sub CreateCellViews As B4XView";
 //BA.debugLineNum = 717;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"cell\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"cell");
 //BA.debugLineNum = 718;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 719;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
 //BA.debugLineNum = 720;BA.debugLine="SetMouseTransparent(lbl)";
_setmousetransparent((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
 //BA.debugLineNum = 721;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 722;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 723;BA.debugLine="p.AddView(xlbl, 0, 0, 0, 0)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 724;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return null;
}
public String  _createcolumnlayouts(b4a.example.ef.b4xtable._b4xtablecolumn _c,int _size) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _clr = 0;
int _tclr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
 //BA.debugLineNum = 625;BA.debugLine="Private Sub CreateColumnLayouts (c As B4XTableColu";
 //BA.debugLineNum = 626;BA.debugLine="For i = c.CellsLayouts.Size To Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_size-1);
_i = _c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize() ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 627;BA.debugLine="Dim p As B4XView = CreateCellViews";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _createcellviews();
 //BA.debugLineNum = 628;BA.debugLine="Dim lbl As B4XView = p.GetView(c.LabelIndex)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView(_c.LabelIndex /*int*/ );
 //BA.debugLineNum = 629;BA.debugLine="c.CellsLayouts.Add(p)";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
 //BA.debugLineNum = 630;BA.debugLine="Dim clr, tclr As Int";
_clr = 0;
_tclr = 0;
 //BA.debugLineNum = 631;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 632;BA.debugLine="If i = 0 Then";
if (_i==0) { 
 //BA.debugLineNum = 633;BA.debugLine="clr = HeaderColor";
_clr = _headercolor;
 //BA.debugLineNum = 634;BA.debugLine="tclr = HeaderTextColor";
_tclr = _headertextcolor;
 //BA.debugLineNum = 635;BA.debugLine="fnt = HeaderFont";
_fnt = _headerfont;
 }else {
 //BA.debugLineNum = 637;BA.debugLine="fnt = LabelsFont";
_fnt = _labelsfont;
 //BA.debugLineNum = 638;BA.debugLine="tclr = TextColor";
_tclr = _textcolor;
 //BA.debugLineNum = 639;BA.debugLine="If i Mod 2 = 1 Then";
if (_i%2==1) { 
 //BA.debugLineNum = 640;BA.debugLine="clr = EvenRowColor";
_clr = _evenrowcolor;
 }else {
 //BA.debugLineNum = 642;BA.debugLine="clr = OddRowColor";
_clr = _oddrowcolor;
 };
 };
 //BA.debugLineNum = 645;BA.debugLine="lbl.Font = fnt";
_lbl.setFont(_fnt);
 //BA.debugLineNum = 646;BA.debugLine="p.SetColorAndBorder(clr, 1dip, GridColor, 0)";
_p.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),_gridcolor,(int) (0));
 //BA.debugLineNum = 647;BA.debugLine="lbl.TextColor = tclr";
_lbl.setTextColor(_tclr);
 //BA.debugLineNum = 648;BA.debugLine="lbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_lbl.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 649;BA.debugLine="p.Tag = i";
_p.setTag((Object)(_i));
 //BA.debugLineNum = 650;BA.debugLine="c.Panel.AddView(p, 0, 0, 0, 0)";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }
};
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return "";
}
public String  _createdataview(String _whereclause) throws Exception{
 //BA.debugLineNum = 391;BA.debugLine="Public Sub CreateDataView (WhereClause As String)";
 //BA.debugLineNum = 392;BA.debugLine="sql1.ExecNonQuery(\"DROP VIEW IF EXISTS TempView\")";
_sql1.ExecNonQuery("DROP VIEW IF EXISTS TempView");
 //BA.debugLineNum = 393;BA.debugLine="sql1.ExecNonQuery(\"CREATE VIEW TempView AS SELECT";
_sql1.ExecNonQuery("CREATE VIEW TempView AS SELECT *, rowid FROM data WHERE "+_whereclause);
 //BA.debugLineNum = 394;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
_countall = (int)(Double.parseDouble(_sql1.ExecQuerySingleResult("SELECT count(*) FROM TempView")));
 //BA.debugLineNum = 395;BA.debugLine="mFirstRowIndex = 0";
_mfirstrowindex = (int) (0);
 //BA.debugLineNum = 396;BA.debugLine="SQLTableName = \"TempView\"";
_sqltablename = "TempView";
 //BA.debugLineNum = 397;BA.debugLine="UpdateData (False)";
_updatedata(__c.False);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public String  _createtable() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _column = null;
 //BA.debugLineNum = 695;BA.debugLine="Private Sub CreateTable";
 //BA.debugLineNum = 696;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 697;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 698;BA.debugLine="sb.Append(\"CREATE TABLE data (\")";
_sb.Append("CREATE TABLE data (");
 //BA.debugLineNum = 699;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 700;BA.debugLine="For Each Column As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = _columns;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_column = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
 //BA.debugLineNum = 701;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (_column.ColumnType /*int*/ ==_column_type_void) { 
if (true) continue;};
 //BA.debugLineNum = 702;BA.debugLine="Column.SQLID = \"c\" & i";
_column.SQLID /*String*/  = "c"+BA.NumberToString(_i);
 //BA.debugLineNum = 703;BA.debugLine="sb.Append(Column.SQLID & \" \" & ColumnToSQLType(C";
_sb.Append(_column.SQLID /*String*/ +" "+_columntosqltype(_column)+",");
 //BA.debugLineNum = 704;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
 //BA.debugLineNum = 706;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
 //BA.debugLineNum = 707;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 708;BA.debugLine="sql1.ExecNonQuery(sb.ToString)";
_sql1.ExecNonQuery(_sb.ToString());
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return "";
}
public void  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4a.example.ef.b4xtable parent,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
}
b4a.example.ef.b4xtable parent;
Object _base;
anywheresoftware.b4a.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 105;BA.debugLine="mBase = Base";
parent._mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 106;BA.debugLine="LastBaseHeight = mBase.Height";
parent._lastbaseheight = parent._mbase.getHeight();
 //BA.debugLineNum = 107;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
parent._tag = parent._mbase.getTag();
 //BA.debugLineNum = 107;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
parent._mbase.setTag(parent);
 //BA.debugLineNum = 108;BA.debugLine="LayoutLoaded = False";
parent._layoutloaded = parent.__c.False;
 //BA.debugLineNum = 109;BA.debugLine="EvenRowColor = xui.PaintOrColorToColor(Props.Get(";
parent._evenrowcolor = parent._xui.PaintOrColorToColor(_props.Get((Object)("EvenRowColor")));
 //BA.debugLineNum = 110;BA.debugLine="OddRowColor = xui.PaintOrColorToColor(Props.Get(\"";
parent._oddrowcolor = parent._xui.PaintOrColorToColor(_props.Get((Object)("OddRowColor")));
 //BA.debugLineNum = 111;BA.debugLine="HeaderTextColor = xui.PaintOrColorToColor(Props.G";
parent._headertextcolor = parent._xui.PaintOrColorToColor(_props.Get((Object)("HeaderTextColor")));
 //BA.debugLineNum = 112;BA.debugLine="TextColor = xui.PaintOrColorToColor(Props.Get(\"Te";
parent._textcolor = parent._xui.PaintOrColorToColor(_props.Get((Object)("TextColor")));
 //BA.debugLineNum = 113;BA.debugLine="HeaderColor = xui.PaintOrColorToColor(Props.Get(\"";
parent._headercolor = parent._xui.PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
 //BA.debugLineNum = 114;BA.debugLine="GridColor = xui.PaintOrColorToColor(Props.Get(\"Gr";
parent._gridcolor = parent._xui.PaintOrColorToColor(_props.Get((Object)("GridColor")));
 //BA.debugLineNum = 115;BA.debugLine="SelectionColor = xui.PaintOrColorToColor(Props.Ge";
parent._selectioncolor = parent._xui.PaintOrColorToColor(_props.Get((Object)("SelectionColor")));
 //BA.debugLineNum = 116;BA.debugLine="HighlightTextColor = xui.PaintOrColorToColor(Prop";
parent._highlighttextcolor = parent._xui.PaintOrColorToColor(_props.GetDefault((Object)("HighlightTextColor"),(Object)(((int)0xffff0000))));
 //BA.debugLineNum = 117;BA.debugLine="SearchVisible = Props.GetDefault(\"SearchVisible\",";
parent._searchvisible = BA.ObjectToBoolean(_props.GetDefault((Object)("SearchVisible"),(Object)(parent.__c.True)));
 //BA.debugLineNum = 118;BA.debugLine="If Bit.And(SelectionColor, 0xff000000) = 0 Then S";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Bit.And(parent._selectioncolor,((int)0xff000000))==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._selectioncolor = (int) (0);
if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 119;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
 //BA.debugLineNum = 120;BA.debugLine="mBase.LoadLayout(\"B4XTable\")";
parent._mbase.LoadLayout("B4XTable",ba);
 //BA.debugLineNum = 121;BA.debugLine="SearchField.mBase.Visible = False";
parent._searchfield._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
 //BA.debugLineNum = 122;BA.debugLine="SearchField.LargeLabelTextSize = 14";
parent._searchfield._largelabeltextsize /*float*/  = (float) (14);
 //BA.debugLineNum = 123;BA.debugLine="SearchField.SmallLabelTextSize = 8";
parent._searchfield._smalllabeltextsize /*float*/  = (float) (8);
 //BA.debugLineNum = 124;BA.debugLine="SearchField.Update";
parent._searchfield._update /*String*/ ();
 //BA.debugLineNum = 126;BA.debugLine="Dim jo As JavaObject = SearchField.TextField";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(parent._searchfield._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getObject()));
 //BA.debugLineNum = 127;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(6, 0x1";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(parent.__c.Bit.Or((int) (6),((int)0x10000000)))});
 //BA.debugLineNum = 132;BA.debugLine="SetMouseTransparent(lblSort)";
parent._setmousetransparent(parent._lblsort);
 //BA.debugLineNum = 133;BA.debugLine="clvData.AsView.SetColorAndBorder(0, 0, 0, 0)";
parent._clvdata._asview().SetColorAndBorder((int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 134;BA.debugLine="clvData.sv.SetColorAndBorder(0, 0, 0, 0)";
parent._clvdata._sv.SetColorAndBorder((int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 135;BA.debugLine="lblNumber.TextColor = ArrowsEnabledColor";
parent._lblnumber.setTextColor(parent._arrowsenabledcolor);
 //BA.debugLineNum = 136;BA.debugLine="LayoutLoaded = True";
parent._layoutloaded = parent.__c.True;
 //BA.debugLineNum = 137;BA.debugLine="ClearNavigationState";
parent._clearnavigationstate();
 //BA.debugLineNum = 138;BA.debugLine="Refresh2 (True, False)";
parent._refresh2(parent.__c.True,parent.__c.False);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.b4xtable._b4xtablecolumn  _getcolumn(String _columnid) throws Exception{
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
 //BA.debugLineNum = 543;BA.debugLine="Public Sub GetColumn (ColumnId As String) As B4XTa";
 //BA.debugLineNum = 544;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columns;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
 //BA.debugLineNum = 545;BA.debugLine="If c.Id = ColumnId Then Return c";
if ((_c.Id /*String*/ ).equals(_columnid)) { 
if (true) return _c;};
 }
};
 //BA.debugLineNum = 547;BA.debugLine="Return c";
if (true) return _c;
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentpage() throws Exception{
 //BA.debugLineNum = 895;BA.debugLine="Public Sub getCurrentPage As Int";
 //BA.debugLineNum = 896;BA.debugLine="Return mCurrentPage";
if (true) return _mcurrentpage;
 //BA.debugLineNum = 897;BA.debugLine="End Sub";
return 0;
}
public int  _getfirstrowindex() throws Exception{
 //BA.debugLineNum = 885;BA.debugLine="Public Sub getFirstRowIndex As Int";
 //BA.debugLineNum = 886;BA.debugLine="Return mFirstRowIndex";
if (true) return _mfirstrowindex;
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabelfromcolumn(b4a.example.ef.b4xtable._b4xtablecolumn _c,int _index) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 560;BA.debugLine="Private Sub GetLabelFromColumn (c As B4XTableColum";
 //BA.debugLineNum = 561;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
 //BA.debugLineNum = 562;BA.debugLine="Return p.GetView(c.LabelIndex)";
if (true) return _p.GetView(_c.LabelIndex /*int*/ );
 //BA.debugLineNum = 563;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getrow(long _rowid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
 //BA.debugLineNum = 858;BA.debugLine="Public Sub GetRow(RowId As Long) As Map";
 //BA.debugLineNum = 859;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 860;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 861;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT * F";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(_sql1.ExecQuery2("SELECT * FROM data WHERE rowid = ?",new String[]{BA.NumberToString(_rowid)})));
 //BA.debugLineNum = 862;BA.debugLine="If rs.NextRow Then";
if (_rs.NextRow()) { 
 //BA.debugLineNum = 863;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = _columns;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
 //BA.debugLineNum = 864;BA.debugLine="Select c.ColumnType";
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,_column_type_text,_column_type_numbers,_column_type_date)) {
case 0: {
 //BA.debugLineNum = 866;BA.debugLine="m.Put(c.Id, rs.GetString(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetString(_c.SQLID /*String*/ )));
 break; }
case 1: {
 //BA.debugLineNum = 868;BA.debugLine="m.Put(c.Id, rs.GetDouble(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetDouble(_c.SQLID /*String*/ )));
 break; }
case 2: {
 //BA.debugLineNum = 870;BA.debugLine="m.Put(c.Id, rs.GetLong(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetLong(_c.SQLID /*String*/ )));
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 874;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 875;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return null;
}
public int  _getrowsperpage() throws Exception{
 //BA.debugLineNum = 890;BA.debugLine="Public Sub getRowsPerPage As Int";
 //BA.debugLineNum = 891;BA.debugLine="Return mRowsPerPage";
if (true) return _mrowsperpage;
 //BA.debugLineNum = 892;BA.debugLine="End Sub";
return 0;
}
public int  _getsize() throws Exception{
 //BA.debugLineNum = 958;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 959;BA.debugLine="Return CountAll";
if (true) return _countall;
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return 0;
}
public String  _headerclicked(b4a.example.ef.b4xtable._b4xtablecolumn _col) throws Exception{
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
 //BA.debugLineNum = 824;BA.debugLine="Private Sub HeaderClicked (col As B4XTableColumn)";
 //BA.debugLineNum = 825;BA.debugLine="If col.Sortable Then";
if (_col.Sortable /*boolean*/ ) { 
 //BA.debugLineNum = 826;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group2 = _columns;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group2.Get(index2));
 //BA.debugLineNum = 827;BA.debugLine="If c = col Then";
if ((_c).equals(_col)) { 
 //BA.debugLineNum = 828;BA.debugLine="If c.InternalSortMode = \"ASC\" Then c.InternalS";
if ((_c.InternalSortMode /*String*/ ).equals("ASC")) { 
_c.InternalSortMode /*String*/  = "DESC";}
else {
_c.InternalSortMode /*String*/  = "ASC";};
 }else {
 //BA.debugLineNum = 830;BA.debugLine="c.InternalSortMode = \"\"";
_c.InternalSortMode /*String*/  = "";
 };
 }
};
 //BA.debugLineNum = 833;BA.debugLine="mFirstRowIndex = 0";
_mfirstrowindex = (int) (0);
 //BA.debugLineNum = 834;BA.debugLine="UpdateSortIcon";
_updatesorticon();
 //BA.debugLineNum = 835;BA.debugLine="UpdateData (False)";
_updatedata(__c.False);
 };
 //BA.debugLineNum = 837;BA.debugLine="End Sub";
return "";
}
public void  _implupdatedatafromquery(String _query,Object _args,int _totalcount,boolean _dontsleep) throws Exception{
ResumableSub_ImplUpdateDataFromQuery rsub = new ResumableSub_ImplUpdateDataFromQuery(this,_query,_args,_totalcount,_dontsleep);
rsub.resume(ba, null);
}
public static class ResumableSub_ImplUpdateDataFromQuery extends BA.ResumableSub {
public ResumableSub_ImplUpdateDataFromQuery(b4a.example.ef.b4xtable parent,String _query,Object _args,int _totalcount,boolean _dontsleep) {
this.parent = parent;
this._query = _query;
this._args = _args;
this._totalcount = _totalcount;
this._dontsleep = _dontsleep;
}
b4a.example.ef.b4xtable parent;
String _query;
Object _args;
int _totalcount;
boolean _dontsleep;
int _myindex = 0;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
boolean _success = false;
int _rownumber = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
boolean _aretheremoreresults = false;
int _i = 0;
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;
int step32;
int limit32;
anywheresoftware.b4a.BA.IterableList group33;
int index33;
int groupLen33;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 414;BA.debugLine="SQLIndex = SQLIndex + 1";
parent._sqlindex = (int) (parent._sqlindex+1);
 //BA.debugLineNum = 415;BA.debugLine="If mRowsPerPage = 0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._mrowsperpage==0) { 
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
 //BA.debugLineNum = 417;BA.debugLine="Dim MyIndex As Int = SQLIndex";
_myindex = parent._sqlindex;
 //BA.debugLineNum = 418;BA.debugLine="If DontSleep = False Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_dontsleep==parent.__c.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 419;BA.debugLine="Sleep(40)";
parent.__c.Sleep(ba,this,(int) (40));
this.state = 71;
return;
case 71:
//C
this.state = 10;
;
 if (true) break;
;
 //BA.debugLineNum = 421;BA.debugLine="If MyIndex <> SQLIndex Then";

case 10:
//if
this.state = 13;
if (_myindex!=parent._sqlindex) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 422;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 424;BA.debugLine="VisibleRowIds.Clear";
parent._visiblerowids.Clear();
 //BA.debugLineNum = 426;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(Query, Args";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(parent._sql1.ExecQuery2(_query,(String[])(_args))));
 //BA.debugLineNum = 427;BA.debugLine="Dim success As Boolean = True";
_success = parent.__c.True;
 //BA.debugLineNum = 431;BA.debugLine="If success Then";
if (true) break;

case 14:
//if
this.state = 67;
if (_success) { 
this.state = 16;
}else {
this.state = 66;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 432;BA.debugLine="Dim RowNumber As Int = 1";
_rownumber = (int) (1);
 //BA.debugLineNum = 433;BA.debugLine="Do While RowNumber <= mRowsPerPage And rs.NextRo";
if (true) break;

case 17:
//do while
this.state = 32;
while (_rownumber<=parent._mrowsperpage && _rs.NextRow()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 434;BA.debugLine="VisibleRowIds.Add(rs.GetLong(\"rowid\"))";
parent._visiblerowids.Add((Object)(_rs.GetLong("rowid")));
 //BA.debugLineNum = 435;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 20:
//for
this.state = 31;
group17 = parent._visiblecolumns;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 72;
if (true) break;

case 72:
//C
this.state = 31;
if (index17 < groupLen17) {
this.state = 22;
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group17.Get(index17));}
if (true) break;

case 73:
//C
this.state = 72;
index17++;
if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 436;BA.debugLine="Dim lbl As B4XView = GetLabelFromColumn(c, Row";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = parent._getlabelfromcolumn(_c,_rownumber);
 //BA.debugLineNum = 437;BA.debugLine="Select c.ColumnType";
if (true) break;

case 23:
//select
this.state = 30;
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,parent._column_type_text,parent._column_type_numbers,parent._column_type_date)) {
case 0: {
this.state = 25;
if (true) break;
}
case 1: {
this.state = 27;
if (true) break;
}
case 2: {
this.state = 29;
if (true) break;
}
}
if (true) break;

case 25:
//C
this.state = 30;
 //BA.debugLineNum = 439;BA.debugLine="SetTextToCell(rs.GetString(c.SQLID), lbl, c.";
parent._settexttocell(_rs.GetString(_c.SQLID /*String*/ ),_lbl,_c.Searchable /*boolean*/ );
 if (true) break;

case 27:
//C
this.state = 30;
 //BA.debugLineNum = 441;BA.debugLine="c.Formatter.FormatLabel(rs.GetDouble(c.SQLID";
_c.Formatter /*b4a.example.ef.b4xformatter*/ ._formatlabel /*String*/ (_rs.GetDouble(_c.SQLID /*String*/ ),_lbl);
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 443;BA.debugLine="lbl.Text = DateTime.Date(rs.GetLong(c.SQLID)";
_lbl.setText(BA.ObjectToCharSequence(parent.__c.DateTime.Date(_rs.GetLong(_c.SQLID /*String*/ ))));
 if (true) break;

case 30:
//C
this.state = 73;
;
 if (true) break;
if (true) break;

case 31:
//C
this.state = 17;
;
 //BA.debugLineNum = 446;BA.debugLine="RowNumber = RowNumber + 1";
_rownumber = (int) (_rownumber+1);
 if (true) break;

case 32:
//C
this.state = 33;
;
 //BA.debugLineNum = 448;BA.debugLine="Dim AreThereMoreResults As Boolean = RowNumber =";
_aretheremoreresults = _rownumber==parent._mrowsperpage+1 && _rs.NextRow();
 //BA.debugLineNum = 449;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 450;BA.debugLine="For i = RowNumber To mRowsPerPage";
if (true) break;

case 33:
//for
this.state = 40;
step32 = 1;
limit32 = parent._mrowsperpage;
_i = _rownumber ;
this.state = 74;
if (true) break;

case 74:
//C
this.state = 40;
if ((step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32)) this.state = 35;
if (true) break;

case 75:
//C
this.state = 74;
_i = ((int)(0 + _i + step32)) ;
if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 451;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 36:
//for
this.state = 39;
group33 = parent._visiblecolumns;
index33 = 0;
groupLen33 = group33.getSize();
this.state = 76;
if (true) break;

case 76:
//C
this.state = 39;
if (index33 < groupLen33) {
this.state = 38;
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group33.Get(index33));}
if (true) break;

case 77:
//C
this.state = 76;
index33++;
if (true) break;

case 38:
//C
this.state = 77;
 //BA.debugLineNum = 455;BA.debugLine="GetLabelFromColumn(c, i).Text = \"\"";
parent._getlabelfromcolumn(_c,_i).setText(BA.ObjectToCharSequence(""));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 75;
;
 //BA.debugLineNum = 458;BA.debugLine="VisibleRowIds.Add(0)";
parent._visiblerowids.Add((Object)(0));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
;
 //BA.debugLineNum = 460;BA.debugLine="mLastRowIndex = mFirstRowIndex - 2 + RowNumber";
parent._mlastrowindex = (int) (parent._mfirstrowindex-2+_rownumber);
 //BA.debugLineNum = 461;BA.debugLine="SetPageLabelState(lblLast, TotalCount >= 0)";
parent._setpagelabelstate(parent._lbllast,_totalcount>=0);
 //BA.debugLineNum = 462;BA.debugLine="If TotalCount >= 0 Then";
if (true) break;

case 41:
//if
this.state = 64;
if (_totalcount>=0) { 
this.state = 43;
}else {
this.state = 51;
}if (true) break;

case 43:
//C
this.state = 44;
 //BA.debugLineNum = 463;BA.debugLine="If TotalCount = 0 Then";
if (true) break;

case 44:
//if
this.state = 49;
if (_totalcount==0) { 
this.state = 46;
}else {
this.state = 48;
}if (true) break;

case 46:
//C
this.state = 49;
 //BA.debugLineNum = 464;BA.debugLine="lblFromTo.Text = \"\"";
parent._lblfromto.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 48:
//C
this.state = 49;
 //BA.debugLineNum = 466;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
parent._lblfromto.setText(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(parent._defaultformatter._format /*String*/ (parent._mfirstrowindex+1)))+" "+parent.__c.SmartStringFormatter("",(Object)(parent._stringto))+" "+parent.__c.SmartStringFormatter("",(Object)(parent._defaultformatter._format /*String*/ (parent._mlastrowindex+1)))+" "+parent.__c.SmartStringFormatter("",(Object)(parent._stringoutof))+" "+parent.__c.SmartStringFormatter("",(Object)(parent._defaultformatter._format /*String*/ (_totalcount)))+"")));
 if (true) break;

case 49:
//C
this.state = 64;
;
 //BA.debugLineNum = 468;BA.debugLine="SetPageLabelState(lblNext, mLastRowIndex < Tota";
parent._setpagelabelstate(parent._lblnext,parent._mlastrowindex<_totalcount-1);
 //BA.debugLineNum = 469;BA.debugLine="SetPageLabelState(lblLast, lblNext.Tag)";
parent._setpagelabelstate(parent._lbllast,BA.ObjectToBoolean(parent._lblnext.getTag()));
 if (true) break;

case 51:
//C
this.state = 52;
 //BA.debugLineNum = 471;BA.debugLine="If mLastRowIndex = -1 Then";
if (true) break;

case 52:
//if
this.state = 63;
if (parent._mlastrowindex==-1) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 63;
 //BA.debugLineNum = 472;BA.debugLine="lblFromTo.Text = StringNoMatches";
parent._lblfromto.setText(BA.ObjectToCharSequence(parent._stringnomatches));
 if (true) break;

case 56:
//C
this.state = 57;
 //BA.debugLineNum = 474;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
parent._lblfromto.setText(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(parent._defaultformatter._format /*String*/ (parent._mfirstrowindex+1)))+" "+parent.__c.SmartStringFormatter("",(Object)(parent._stringto))+" "+parent.__c.SmartStringFormatter("",(Object)(parent._defaultformatter._format /*String*/ (parent._mlastrowindex+1)))+"")));
 //BA.debugLineNum = 475;BA.debugLine="If AreThereMoreResults Then lblFromTo.Text = l";
if (true) break;

case 57:
//if
this.state = 62;
if (_aretheremoreresults) { 
this.state = 59;
;}if (true) break;

case 59:
//C
this.state = 62;
parent._lblfromto.setText(BA.ObjectToCharSequence(parent._lblfromto.getText()+" "+parent._stringmoreavailable));
if (true) break;

case 62:
//C
this.state = 63;
;
 if (true) break;

case 63:
//C
this.state = 64;
;
 //BA.debugLineNum = 477;BA.debugLine="SetPageLabelState(lblNext, AreThereMoreResults)";
parent._setpagelabelstate(parent._lblnext,_aretheremoreresults);
 //BA.debugLineNum = 478;BA.debugLine="SetPageLabelState(lblLast, False)";
parent._setpagelabelstate(parent._lbllast,parent.__c.False);
 if (true) break;

case 64:
//C
this.state = 67;
;
 //BA.debugLineNum = 480;BA.debugLine="SetPageLabelState(lblBack, mFirstRowIndex > 0)";
parent._setpagelabelstate(parent._lblback,parent._mfirstrowindex>0);
 //BA.debugLineNum = 481;BA.debugLine="SetPageLabelState(lblFirst, lblBack.Tag)";
parent._setpagelabelstate(parent._lblfirst,BA.ObjectToBoolean(parent._lblback.getTag()));
 //BA.debugLineNum = 482;BA.debugLine="mCurrentPage = Ceil(mFirstRowIndex / mRowsPerPag";
parent._mcurrentpage = (int) (parent.__c.Ceil(parent._mfirstrowindex/(double)parent._mrowsperpage)+1);
 //BA.debugLineNum = 483;BA.debugLine="lblNumber.Text = NumberFormat(mCurrentPage, 0, 0";
parent._lblnumber.setText(BA.ObjectToCharSequence(parent.__c.NumberFormat(parent._mcurrentpage,(int) (0),(int) (0))));
 //BA.debugLineNum = 484;BA.debugLine="rs.Close";
_rs.Close();
 //BA.debugLineNum = 485;BA.debugLine="mCurrentCount = TotalCount";
parent._mcurrentcount = _totalcount;
 if (true) break;

case 66:
//C
this.state = 67;
 //BA.debugLineNum = 487;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("925886794",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
;
 //BA.debugLineNum = 489;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DataUp";

case 67:
//if
this.state = 70;
if (parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_DataUpdated",(int) (0))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
 //BA.debugLineNum = 490;BA.debugLine="CallSub(mCallBack, mEventName & \"_DataUpdated\")";
parent.__c.CallSubNew(ba,parent._mcallback,parent._meventname+"_DataUpdated");
 if (true) break;

case 70:
//C
this.state = -1;
;
 //BA.debugLineNum = 492;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 81;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 82;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 83;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 84;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="DefaultFormatter.Initialize";
_defaultformatter._initialize /*String*/ (ba);
 //BA.debugLineNum = 86;BA.debugLine="DefaultDataFormatter.Initialize";
_defaultdataformatter._initialize /*String*/ (ba);
 //BA.debugLineNum = 87;BA.debugLine="VisibleColumns.Initialize";
_visiblecolumns.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="HeaderFont = xui.CreateDefaultBoldFont(15)";
_headerfont = _xui.CreateDefaultBoldFont((float) (15));
 //BA.debugLineNum = 89;BA.debugLine="LabelsFont = xui.CreateDefaultFont(15)";
_labelsfont = _xui.CreateDefaultFont((float) (15));
 //BA.debugLineNum = 90;BA.debugLine="ArrowsDisabledColor = 0xFFBBBBBB";
_arrowsdisabledcolor = ((int)0xffbbbbbb);
 //BA.debugLineNum = 91;BA.debugLine="ArrowsEnabledColor = xui.Color_Black";
_arrowsenabledcolor = _xui.Color_Black;
 //BA.debugLineNum = 92;BA.debugLine="VisibleRowIds.Initialize";
_visiblerowids.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="MinimumWidth = 140dip";
_minimumwidth = __c.DipToCurrent((int) (140));
 //BA.debugLineNum = 94;BA.debugLine="RowHeight = 40dip";
_rowheight = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 95;BA.debugLine="HeadersHeight = 40dip";
_headersheight = __c.DipToCurrent((int) (40));
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _lbl_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
 //BA.debugLineNum = 728;BA.debugLine="Private Sub lbl_Click";
 //BA.debugLineNum = 729;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 730;BA.debugLine="CellClicked(lbl.Parent, False)";
_cellclicked(_lbl.getParent(),__c.False);
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return "";
}
public String  _lbl_longclick() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
 //BA.debugLineNum = 733;BA.debugLine="Private Sub lbl_LongClick";
 //BA.debugLineNum = 734;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 735;BA.debugLine="CellClicked(lbl.Parent, True)";
_cellclicked(_lbl.getParent(),__c.True);
 //BA.debugLineNum = 736;BA.debugLine="End Sub";
return "";
}
public String  _lblback_click() throws Exception{
 //BA.debugLineNum = 908;BA.debugLine="Private Sub lblBack_Click";
 //BA.debugLineNum = 909;BA.debugLine="If lblBack.Tag = False Then Return";
if ((_lblback.getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 910;BA.debugLine="setFirstRowIndex (mFirstRowIndex - mRowsPerPage)";
_setfirstrowindex((int) (_mfirstrowindex-_mrowsperpage));
 //BA.debugLineNum = 911;BA.debugLine="End Sub";
return "";
}
public String  _lblfirst_click() throws Exception{
 //BA.debugLineNum = 903;BA.debugLine="Private Sub lblFirst_Click";
 //BA.debugLineNum = 904;BA.debugLine="If lblFirst.Tag = False Then Return";
if ((_lblfirst.getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 905;BA.debugLine="setFirstRowIndex (0)";
_setfirstrowindex((int) (0));
 //BA.debugLineNum = 906;BA.debugLine="End Sub";
return "";
}
public String  _lbllast_click() throws Exception{
int _numberofpages = 0;
 //BA.debugLineNum = 913;BA.debugLine="Private Sub lblLast_Click";
 //BA.debugLineNum = 914;BA.debugLine="If lblLast.Tag = False Then Return";
if ((_lbllast.getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 915;BA.debugLine="Dim NumberOfPages As Int = Ceil(mCurrentCount / m";
_numberofpages = (int) (__c.Ceil(_mcurrentcount/(double)_mrowsperpage));
 //BA.debugLineNum = 916;BA.debugLine="setFirstRowIndex ((NumberOfPages - 1) * mRowsPerP";
_setfirstrowindex((int) ((_numberofpages-1)*_mrowsperpage));
 //BA.debugLineNum = 917;BA.debugLine="End Sub";
return "";
}
public String  _lblnext_click() throws Exception{
 //BA.debugLineNum = 919;BA.debugLine="Private Sub lblNext_Click";
 //BA.debugLineNum = 920;BA.debugLine="If lblNext.Tag = False Then Return";
if ((_lblnext.getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
 //BA.debugLineNum = 921;BA.debugLine="setFirstRowIndex (mFirstRowIndex + mRowsPerPage)";
_setfirstrowindex((int) (_mfirstrowindex+_mrowsperpage));
 //BA.debugLineNum = 922;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub Refresh";
 //BA.debugLineNum = 183;BA.debugLine="Refresh2(True, False)";
_refresh2(__c.True,__c.False);
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _refresh2(boolean _refreshdata,boolean _dontsleep) throws Exception{
int _prevrowsperpage = 0;
int _totalheight = 0;
int _columnindex = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
boolean _isfrozen = false;
int _freezedwidth = 0;
int _i = 0;
float _offset = 0f;
 //BA.debugLineNum = 191;BA.debugLine="Private Sub Refresh2 (RefreshData As Boolean, Dont";
 //BA.debugLineNum = 192;BA.debugLine="If LayoutLoaded = False Or VisibleColumns.Size =";
if (_layoutloaded==__c.False || _visiblecolumns.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 193;BA.debugLine="Dim PrevRowsPerPage As Int = mRowsPerPage";
_prevrowsperpage = _mrowsperpage;
 //BA.debugLineNum = 194;BA.debugLine="If xui.IsB4A And LastBaseHeight <> mBase.Height T";
if (_xui.getIsB4A() && _lastbaseheight!=_mbase.getHeight()) { 
 //BA.debugLineNum = 195;BA.debugLine="clvData.AsView.Height = clvData.AsView.Height -";
_clvdata._asview().setHeight((int) (_clvdata._asview().getHeight()-(_lastbaseheight-_mbase.getHeight())));
 //BA.debugLineNum = 196;BA.debugLine="clvData.Base_Resize(clvData.AsView.Width, clvDat";
_clvdata._base_resize(_clvdata._asview().getWidth(),_clvdata._asview().getHeight());
 //BA.debugLineNum = 197;BA.debugLine="LastBaseHeight = mBase.Height";
_lastbaseheight = _mbase.getHeight();
 };
 //BA.debugLineNum = 199;BA.debugLine="Dim TotalHeight As Int = clvData.AsView.Height -";
_totalheight = (int) (_clvdata._asview().getHeight()-_headersheight);
 //BA.debugLineNum = 200;BA.debugLine="If xui.IsB4J Then";
if (_xui.getIsB4J()) { 
 //BA.debugLineNum = 201;BA.debugLine="TotalHeight = TotalHeight - 20";
_totalheight = (int) (_totalheight-20);
 };
 //BA.debugLineNum = 203;BA.debugLine="If AllowSmallRowHeightModifications Then";
if (_allowsmallrowheightmodifications) { 
 //BA.debugLineNum = 204;BA.debugLine="mRowsPerPage = Max(0, Round(TotalHeight/ RowHeig";
_mrowsperpage = (int) (__c.Max(0,__c.Round(_totalheight/(double)_rowheight)));
 }else {
 //BA.debugLineNum = 206;BA.debugLine="mRowsPerPage = Max(0, Floor(TotalHeight / RowHei";
_mrowsperpage = (int) (__c.Max(0,__c.Floor(_totalheight/(double)_rowheight)));
 };
 //BA.debugLineNum = 208;BA.debugLine="If MaximumRowsPerPage > 0 Then";
if (_maximumrowsperpage>0) { 
 //BA.debugLineNum = 209;BA.debugLine="mRowsPerPage = Min(MaximumRowsPerPage, mRowsPerP";
_mrowsperpage = (int) (__c.Min(_maximumrowsperpage,_mrowsperpage));
 //BA.debugLineNum = 210;BA.debugLine="TotalHeight = Min(TotalHeight, MaximumRowsPerPag";
_totalheight = (int) (__c.Min(_totalheight,_maximumrowsperpage*_rowheight));
 };
 //BA.debugLineNum = 212;BA.debugLine="If PrevRowsPerPage <> mRowsPerPage Then RefreshDa";
if (_prevrowsperpage!=_mrowsperpage) { 
_refreshdata = __c.True;};
 //BA.debugLineNum = 213;BA.debugLine="CalculateWidths";
_calculatewidths();
 //BA.debugLineNum = 214;BA.debugLine="Dim ColumnIndex As Int";
_columnindex = 0;
 //BA.debugLineNum = 216;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group24 = _visiblecolumns;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group24.Get(index24));
 //BA.debugLineNum = 217;BA.debugLine="Dim IsFrozen As Boolean = ColumnIndex < NumberOf";
_isfrozen = _columnindex<_numberoffrozencolumns;
 //BA.debugLineNum = 218;BA.debugLine="If c.Panel.Parent.IsInitialized Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
 //BA.debugLineNum = 219;BA.debugLine="CheckAndRemoveColumnThatWasAddedToIncorrectPare";
_checkandremovecolumnthatwasaddedtoincorrectparent(_c,_isfrozen);
 };
 //BA.debugLineNum = 221;BA.debugLine="If c.Panel.Parent.IsInitialized = False Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()==__c.False) { 
 //BA.debugLineNum = 222;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
 //BA.debugLineNum = 223;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
 //BA.debugLineNum = 224;BA.debugLine="mBase.AddView(c.Panel, 0, 0, 0, 0)";
_mbase.AddView((android.view.View)(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }else {
 //BA.debugLineNum = 226;BA.debugLine="AddColumnToCLV (c)";
_addcolumntoclv(_c);
 };
 };
 //BA.debugLineNum = 230;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
_createcolumnlayouts(_c,(int) (_mrowsperpage+1));
 //BA.debugLineNum = 231;BA.debugLine="ResizeColumnImpl(c, TotalHeight)";
_resizecolumnimpl(_c,_totalheight);
 //BA.debugLineNum = 232;BA.debugLine="ColumnIndex = ColumnIndex + 1";
_columnindex = (int) (_columnindex+1);
 }
};
 //BA.debugLineNum = 234;BA.debugLine="If RefreshData Then UpdateData (DontSleep)";
if (_refreshdata) { 
_updatedata(_dontsleep);};
 //BA.debugLineNum = 235;BA.debugLine="Dim FreezedWidth As Int";
_freezedwidth = 0;
 //BA.debugLineNum = 236;BA.debugLine="For i = 0 To NumberOfFrozenColumns - 1";
{
final int step43 = 1;
final int limit43 = (int) (_numberoffrozencolumns-1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
 //BA.debugLineNum = 237;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(_visiblecolumns.Get(_i));
 //BA.debugLineNum = 241;BA.debugLine="Dim offset As Float = 0";
_offset = (float) (0);
 //BA.debugLineNum = 243;BA.debugLine="c.Panel.SetLayoutAnimated(0, offset + FreezedWid";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_offset+_freezedwidth),(int) (_clvdata._asview().getTop()+_offset),_c.ComputedWidth /*int*/ ,_clvdata._asview().getHeight());
 //BA.debugLineNum = 245;BA.debugLine="FreezedWidth = FreezedWidth + c.ComputedWidth";
_freezedwidth = (int) (_freezedwidth+_c.ComputedWidth /*int*/ );
 }
};
 //BA.debugLineNum = 247;BA.debugLine="clvData.AsView.Left = FreezedWidth";
_clvdata._asview().setLeft(_freezedwidth);
 //BA.debugLineNum = 248;BA.debugLine="If Round(clvData.AsView.Width) <> Round(mBase.Wid";
if (__c.Round(_clvdata._asview().getWidth())!=__c.Round(_mbase.getWidth()-_freezedwidth)) { 
 //BA.debugLineNum = 249;BA.debugLine="clvData.AsView.Width = mBase.Width - FreezedWidt";
_clvdata._asview().setWidth((int) (_mbase.getWidth()-_freezedwidth));
 //BA.debugLineNum = 250;BA.debugLine="If xui.IsB4A Then clvData.Base_Resize(clvData.As";
if (_xui.getIsB4A()) { 
_clvdata._base_resize(_clvdata._asview().getWidth(),_clvdata._asview().getHeight());};
 };
 //BA.debugLineNum = 252;BA.debugLine="ResizeAndReorderCLVItems";
_resizeandreorderclvitems();
 //BA.debugLineNum = 253;BA.debugLine="UpdateSearchFieldVisibility";
_updatesearchfieldvisibility();
 //BA.debugLineNum = 254;BA.debugLine="UpdateSortIcon";
_updatesorticon();
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _refreshnow() throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Public Sub RefreshNow";
 //BA.debugLineNum = 188;BA.debugLine="Refresh2(True, True)";
_refresh2(__c.True,__c.True);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public String  _removecolumnfromclv(b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
int _i = 0;
 //BA.debugLineNum = 289;BA.debugLine="Private Sub RemoveColumnFromCLV (c As B4XTableColu";
 //BA.debugLineNum = 290;BA.debugLine="For i = 0 To clvData.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_clvdata._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 291;BA.debugLine="If clvData.GetValue(i) = c Then";
if ((_clvdata._getvalue(_i)).equals((Object)(_c))) { 
 //BA.debugLineNum = 292;BA.debugLine="clvData.RemoveAt(i)";
_clvdata._removeat(_i);
 //BA.debugLineNum = 293;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 296;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return "";
}
public String  _resizeandreorderclvitems() throws Exception{
int _i = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
int _clvindex = 0;
 //BA.debugLineNum = 257;BA.debugLine="Private Sub ResizeAndReorderCLVItems";
 //BA.debugLineNum = 258;BA.debugLine="Dim i As Int = NumberOfFrozenColumns";
_i = _numberoffrozencolumns;
 //BA.debugLineNum = 259;BA.debugLine="Do While i < VisibleColumns.Size";
while (_i<_visiblecolumns.getSize()) {
 //BA.debugLineNum = 260;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(_visiblecolumns.Get(_i));
 //BA.debugLineNum = 261;BA.debugLine="Dim CLVIndex As Int = i - NumberOfFrozenColumns";
_clvindex = (int) (_i-_numberoffrozencolumns);
 //BA.debugLineNum = 262;BA.debugLine="If c <> clvData.GetValue(CLVIndex) Then";
if ((_c).equals((b4a.example.ef.b4xtable._b4xtablecolumn)(_clvdata._getvalue(_clvindex))) == false) { 
 //BA.debugLineNum = 263;BA.debugLine="RemoveColumnFromCLV(c)";
_removecolumnfromclv(_c);
 //BA.debugLineNum = 264;BA.debugLine="clvData.InsertAt(CLVIndex, c.Panel, c)";
_clvdata._insertat(_clvindex,_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
 }else {
 //BA.debugLineNum = 266;BA.debugLine="clvData.ResizeItem(CLVIndex, c.ComputedWidth)";
_clvdata._resizeitem(_clvindex,_c.ComputedWidth /*int*/ );
 };
 //BA.debugLineNum = 268;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return "";
}
public String  _resizecolumnimpl(b4a.example.ef.b4xtable._b4xtablecolumn _c,int _totalheight) throws Exception{
float _height = 0f;
int _topint = 0;
int _heightint = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
 //BA.debugLineNum = 299;BA.debugLine="Private Sub ResizeColumnImpl (c As B4XTableColumn,";
 //BA.debugLineNum = 300;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
 //BA.debugLineNum = 302;BA.debugLine="Dim Height As Float = TotalHeight / mRowsPerPage";
_height = (float) (_totalheight/(double)_mrowsperpage);
 //BA.debugLineNum = 303;BA.debugLine="If AllowSmallRowHeightModifications = False Then";
if (_allowsmallrowheightmodifications==__c.False) { 
_height = (float) (_rowheight);};
 //BA.debugLineNum = 304;BA.debugLine="Dim TopInt, HeightInt As Int";
_topint = 0;
_heightint = 0;
 //BA.debugLineNum = 305;BA.debugLine="For i = 0 To c.CellsLayouts.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 306;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
 //BA.debugLineNum = 307;BA.debugLine="If i < mRowsPerPage + 1 Then";
if (_i<_mrowsperpage+1) { 
 //BA.debugLineNum = 308;BA.debugLine="Dim HeightInt As Int = Round(Height * i + Heade";
_heightint = (int) (__c.Round(_height*_i+_headersheight-_topint));
 //BA.debugLineNum = 309;BA.debugLine="If i = 0 Then HeightInt = HeadersHeight";
if (_i==0) { 
_heightint = _headersheight;};
 //BA.debugLineNum = 310;BA.debugLine="p.SetLayoutAnimated(0, 0, TopInt, c.ComputedWid";
_p.SetLayoutAnimated((int) (0),(int) (0),_topint,_c.ComputedWidth /*int*/ ,_heightint);
 //BA.debugLineNum = 311;BA.debugLine="p.Visible = True";
_p.setVisible(__c.True);
 //BA.debugLineNum = 312;BA.debugLine="If c.DisableAutoResizeLayout = False Then";
if (_c.DisableAutoResizeLayout /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 313;BA.debugLine="Dim lbl As B4XView = p.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView((int) (0));
 //BA.debugLineNum = 314;BA.debugLine="lbl.SetLayoutAnimated(0, 0, 0, p.Width, p.Heig";
_lbl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
 };
 //BA.debugLineNum = 321;BA.debugLine="TopInt = TopInt + HeightInt";
_topint = (int) (_topint+_heightint);
 }else {
 //BA.debugLineNum = 323;BA.debugLine="p.Visible = False";
_p.setVisible(__c.False);
 };
 }
};
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public void  _searchfield_textchanged(String _old,String _new) throws Exception{
ResumableSub_SearchField_TextChanged rsub = new ResumableSub_SearchField_TextChanged(this,_old,_new);
rsub.resume(ba, null);
}
public static class ResumableSub_SearchField_TextChanged extends BA.ResumableSub {
public ResumableSub_SearchField_TextChanged(b4a.example.ef.b4xtable parent,String _old,String _new) {
this.parent = parent;
this._old = _old;
this._new = _new;
}
b4a.example.ef.b4xtable parent;
String _old;
String _new;
int _myindex = 0;
String _term = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 944;BA.debugLine="SearchIndex = SearchIndex + 1";
parent._searchindex = (int) (parent._searchindex+1);
 //BA.debugLineNum = 945;BA.debugLine="Dim MyIndex As Int = SearchIndex";
_myindex = parent._searchindex;
 //BA.debugLineNum = 946;BA.debugLine="Sleep(SleepBeforeSearch)";
parent.__c.Sleep(ba,this,parent._sleepbeforesearch);
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
 //BA.debugLineNum = 947;BA.debugLine="If MyIndex <> SearchIndex Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_myindex!=parent._searchindex) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 948;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 950;BA.debugLine="Dim term As String = New.ToLowerCase";
_term = _new.toLowerCase();
 //BA.debugLineNum = 951;BA.debugLine="If term = FilterText Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if ((_term).equals(parent._filtertext)) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) return ;
if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 952;BA.debugLine="FilterText = term";
parent._filtertext = _term;
 //BA.debugLineNum = 953;BA.debugLine="mFirstRowIndex = 0";
parent._mfirstrowindex = (int) (0);
 //BA.debugLineNum = 954;BA.debugLine="UpdateData (False)";
parent._updatedata(parent.__c.False);
 //BA.debugLineNum = 955;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setcurrentpage(int _p) throws Exception{
 //BA.debugLineNum = 899;BA.debugLine="Public Sub setCurrentPage(p As Int)";
 //BA.debugLineNum = 900;BA.debugLine="setFirstRowIndex((p - 1) * mRowsPerPage)";
_setfirstrowindex((int) ((_p-1)*_mrowsperpage));
 //BA.debugLineNum = 901;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setdata(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
ResumableSub_SetData rsub = new ResumableSub_SetData(this,_data);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetData extends BA.ResumableSub {
public ResumableSub_SetData(b4a.example.ef.b4xtable parent,anywheresoftware.b4a.objects.collections.List _data) {
this.parent = parent;
this._data = _data;
}
b4a.example.ef.b4xtable parent;
anywheresoftware.b4a.objects.collections.List _data;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4a.example.ef.b4xtable._b4xtablecolumn _column = null;
Object _lrow = null;
Object[] _row = null;
Object _senderfilter = null;
boolean _success = false;
anywheresoftware.b4a.BA.IterableList group7;
int index7;
int groupLen7;
anywheresoftware.b4a.BA.IterableList group15;
int index15;
int groupLen15;
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 658;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._sql1.IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._sql1.Close();
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 662;BA.debugLine="sql1.Initialize(\"\", \":memory:\", True)";
parent._sql1.Initialize("",":memory:",parent.__c.True);
 //BA.debugLineNum = 664;BA.debugLine="CreateTable";
parent._createtable();
 //BA.debugLineNum = 665;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 666;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 667;BA.debugLine="sb.Append(\"INSERT INTO data VALUES (\")";
_sb.Append("INSERT INTO data VALUES (");
 //BA.debugLineNum = 668;BA.debugLine="For Each Column As B4XTableColumn In Columns";
if (true) break;

case 7:
//for
this.state = 16;
group7 = parent._columns;
index7 = 0;
groupLen7 = group7.getSize();
this.state = 35;
if (true) break;

case 35:
//C
this.state = 16;
if (index7 < groupLen7) {
this.state = 9;
_column = (b4a.example.ef.b4xtable._b4xtablecolumn)(group7.Get(index7));}
if (true) break;

case 36:
//C
this.state = 35;
index7++;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 669;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (true) break;

case 10:
//if
this.state = 15;
if (_column.ColumnType /*int*/ ==parent._column_type_void) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
this.state = 36;
if (true) break;;
if (true) break;

case 15:
//C
this.state = 36;
;
 //BA.debugLineNum = 670;BA.debugLine="sb.Append(\"?,\")";
_sb.Append("?,");
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 672;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
 //BA.debugLineNum = 673;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 674;BA.debugLine="If Data.Size > 0 Then";
if (true) break;

case 17:
//if
this.state = 34;
if (_data.getSize()>0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 675;BA.debugLine="If Data.Get(0) Is List Then";
if (true) break;

case 20:
//if
this.state = 33;
if (_data.Get((int) (0)) instanceof java.util.List) { 
this.state = 22;
}else {
this.state = 28;
}if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 676;BA.debugLine="For Each lrow As Object In Data";
if (true) break;

case 23:
//for
this.state = 26;
group15 = _data;
index15 = 0;
groupLen15 = group15.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 26;
if (index15 < groupLen15) {
this.state = 25;
_lrow = group15.Get(index15);}
if (true) break;

case 38:
//C
this.state = 37;
index15++;
if (true) break;

case 25:
//C
this.state = 38;
 //BA.debugLineNum = 677;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, lrow)";
parent._sql1.AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_lrow)));
 if (true) break;
if (true) break;

case 26:
//C
this.state = 33;
;
 if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 680;BA.debugLine="For Each row() As Object In Data";
if (true) break;

case 29:
//for
this.state = 32;
group19 = _data;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 39;
if (true) break;

case 39:
//C
this.state = 32;
if (index19 < groupLen19) {
this.state = 31;
_row = (Object[])(group19.Get(index19));}
if (true) break;

case 40:
//C
this.state = 39;
index19++;
if (true) break;

case 31:
//C
this.state = 40;
 //BA.debugLineNum = 681;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, row)";
parent._sql1.AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(_row));
 if (true) break;
if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
 //BA.debugLineNum = 686;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
_senderfilter = parent._sql1.ExecNonQueryBatch(ba,"SQL1");
 //BA.debugLineNum = 688;BA.debugLine="Wait For (SenderFilter) SQL1_NonQueryComplete (Su";
parent.__c.WaitFor("sql1_nonquerycomplete", ba, this, _senderfilter);
this.state = 41;
return;
case 41:
//C
this.state = -1;
_success = (Boolean) result[0];
;
 //BA.debugLineNum = 690;BA.debugLine="CountAll = Data.Size";
parent._countall = _data.getSize();
 //BA.debugLineNum = 691;BA.debugLine="RefreshNow";
parent._refreshnow();
 //BA.debugLineNum = 692;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _sql1_nonquerycomplete(boolean _success) throws Exception{
}
public String  _setfirstrowindex(int _row) throws Exception{
 //BA.debugLineNum = 879;BA.debugLine="Public Sub setFirstRowIndex (row As Int)";
 //BA.debugLineNum = 880;BA.debugLine="row = Max(0, Min(CountAll - 1, row))";
_row = (int) (__c.Max(0,__c.Min(_countall-1,_row)));
 //BA.debugLineNum = 881;BA.debugLine="mFirstRowIndex = row";
_mfirstrowindex = _row;
 //BA.debugLineNum = 882;BA.debugLine="UpdateData (False)";
_updatedata(__c.False);
 //BA.debugLineNum = 883;BA.debugLine="End Sub";
return "";
}
public String  _setmousetransparent(anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
 //BA.debugLineNum = 753;BA.debugLine="Private Sub SetMouseTransparent (lbl As B4XView) '";
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return "";
}
public String  _setpagelabelstate(anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _enabled) throws Exception{
 //BA.debugLineNum = 550;BA.debugLine="Private Sub SetPageLabelState (lbl As B4XView, ena";
 //BA.debugLineNum = 551;BA.debugLine="If lbl.Tag = enabled Then Return";
if ((_lbl.getTag()).equals((Object)(_enabled))) { 
if (true) return "";};
 //BA.debugLineNum = 552;BA.debugLine="lbl.Tag = enabled";
_lbl.setTag((Object)(_enabled));
 //BA.debugLineNum = 553;BA.debugLine="If enabled Then";
if (_enabled) { 
 //BA.debugLineNum = 554;BA.debugLine="lbl.TextColor = ArrowsEnabledColor";
_lbl.setTextColor(_arrowsenabledcolor);
 }else {
 //BA.debugLineNum = 556;BA.debugLine="lbl.TextColor = ArrowsDisabledColor";
_lbl.setTextColor(_arrowsdisabledcolor);
 };
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return "";
}
public String  _settextorcsbuildertolabel(anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
 //BA.debugLineNum = 760;BA.debugLine="Private Sub SetTextOrCSBuilderToLabel(xlbl As B4XV";
 //BA.debugLineNum = 762;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 772;BA.debugLine="End Sub";
return "";
}
public String  _settexttocell(String _text,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _searchable) throws Exception{
int _x = 0;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
 //BA.debugLineNum = 494;BA.debugLine="Private Sub SetTextToCell (Text As String, lbl As";
 //BA.debugLineNum = 495;BA.debugLine="If Searchable = False Or HighlightSearchResults =";
if (_searchable==__c.False || _highlightsearchresults==__c.False) { 
 //BA.debugLineNum = 496;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 }else {
 //BA.debugLineNum = 504;BA.debugLine="If FilterText = \"\" Then";
if ((_filtertext).equals("")) { 
 //BA.debugLineNum = 505;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 }else {
 //BA.debugLineNum = 507;BA.debugLine="Dim x As Int = Text.ToLowerCase.IndexOf(FilterT";
_x = _text.toLowerCase().indexOf(_filtertext);
 //BA.debugLineNum = 508;BA.debugLine="If x = -1 Or (PrefixSearch And x > 0) Then";
if (_x==-1 || (_prefixsearch && _x>0)) { 
 //BA.debugLineNum = 509;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 510;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 514;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 515;BA.debugLine="cs.Initialize.Append(Text.SubString2(0, x)).Col";
_cs.Initialize().Append(BA.ObjectToCharSequence(_text.substring((int) (0),_x))).Color(_highlighttextcolor).Append(BA.ObjectToCharSequence(_text.substring(_x,(int) (_x+_filtertext.length())))).Pop();
 //BA.debugLineNum = 516;BA.debugLine="cs.Append(Text.SubString(x + FilterText.Length)";
_cs.Append(BA.ObjectToCharSequence(_text.substring((int) (_x+_filtertext.length()))));
 //BA.debugLineNum = 518;BA.debugLine="lbl.Text = cs";
_lbl.setText(BA.ObjectToCharSequence(_cs.getObject()));
 };
 };
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return "";
}
public String  _updatedata(boolean _dontsleep) throws Exception{
Object[] _o = null;
 //BA.debugLineNum = 328;BA.debugLine="Private Sub UpdateData (DontSleep As Boolean)";
 //BA.debugLineNum = 329;BA.debugLine="If sql1.IsInitialized = False Then Return";
if (_sql1.IsInitialized()==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 330;BA.debugLine="Dim o() As Object = BuildQuery(True)";
_o = _buildquery(__c.True);
 //BA.debugLineNum = 332;BA.debugLine="ImplUpdateDataFromQuery (o(0), o(1), o(2), DontSl";
_implupdatedatafromquery(BA.ObjectToString(_o[(int) (0)]),_o[(int) (1)],(int)(BA.ObjectToNumber(_o[(int) (2)])),_dontsleep);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _updatesearchfieldvisibility() throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Private Sub UpdateSearchFieldVisibility";
 //BA.debugLineNum = 276;BA.debugLine="SearchField.mBase.Visible = SearchVisible And Cou";
_searchfield._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(_searchvisible && _countall>0);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public String  _updatesorticon() throws Exception{
b4a.example.ef.b4xtable._b4xtablecolumn _col = null;
 //BA.debugLineNum = 839;BA.debugLine="Private Sub UpdateSortIcon";
 //BA.debugLineNum = 840;BA.debugLine="For Each col As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = _columns;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
 //BA.debugLineNum = 841;BA.debugLine="If col.InternalSortMode <> \"\" Then";
if ((_col.InternalSortMode /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 842;BA.debugLine="If lblSort.Parent <> col.Panel Then";
if ((_lblsort.getParent()).equals(_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false) { 
 //BA.debugLineNum = 843;BA.debugLine="lblSort.RemoveViewFromParent";
_lblsort.RemoveViewFromParent();
 //BA.debugLineNum = 844;BA.debugLine="col.Panel.AddView(lblSort, 0, 0, lblSort.Width";
_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_lblsort.getObject()),(int) (0),(int) (0),_lblsort.getWidth(),(int) (0));
 };
 //BA.debugLineNum = 846;BA.debugLine="lblSort.Top = 0";
_lblsort.setTop((int) (0));
 //BA.debugLineNum = 847;BA.debugLine="lblSort.Height = HeadersHeight";
_lblsort.setHeight(_headersheight);
 //BA.debugLineNum = 848;BA.debugLine="lblSort.Left = col.Panel.Width - lblSort.Width";
_lblsort.setLeft((int) (_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_lblsort.getWidth()));
 //BA.debugLineNum = 849;BA.debugLine="lblSort.Visible = True";
_lblsort.setVisible(__c.True);
 //BA.debugLineNum = 850;BA.debugLine="If col.InternalSortMode = \"ASC\" Then lblSort.Te";
if ((_col.InternalSortMode /*String*/ ).equals("ASC")) { 
_lblsort.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf0de))));}
else {
_lblsort.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf0dd))));};
 //BA.debugLineNum = 851;BA.debugLine="Return";
if (true) return "";
 };
 }
};
 //BA.debugLineNum = 854;BA.debugLine="lblSort.Visible = False";
_lblsort.setVisible(__c.False);
 //BA.debugLineNum = 855;BA.debugLine="End Sub";
return "";
}
public String  _updatetablecounters() throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Public Sub UpdateTableCounters";
 //BA.debugLineNum = 409;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
_countall = (int)(Double.parseDouble(_sql1.ExecQuerySingleResult("SELECT count(*) FROM data")));
 //BA.debugLineNum = 410;BA.debugLine="UpdateData (True)";
_updatedata(__c.True);
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
