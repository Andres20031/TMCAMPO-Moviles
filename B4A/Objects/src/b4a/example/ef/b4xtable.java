package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xtable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.b4xtable");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public anywheresoftware.b4a.objects.collections.Map  _getrow(b4a.example.ef.b4xtable __ref,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getrow", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getrow", new Object[] {_rowid}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
anywheresoftware.b4a.sql.SQL.ResultSetWrapper _rs = null;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Public Sub GetRow(RowId As Long) As Map";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=58785795;
 //BA.debugLineNum = 58785795;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT * F";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM data WHERE rowid = ?",new String[]{BA.NumberToString(_rowid)})));
RDebugUtils.currentLine=58785796;
 //BA.debugLineNum = 58785796;BA.debugLine="If rs.NextRow Then";
if (_rs.NextRow()) { 
RDebugUtils.currentLine=58785797;
 //BA.debugLineNum = 58785797;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=58785798;
 //BA.debugLineNum = 58785798;BA.debugLine="Select c.ColumnType";
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,__ref._column_type_text /*int*/ ,__ref._column_type_numbers /*int*/ ,__ref._column_type_date /*int*/ )) {
case 0: {
RDebugUtils.currentLine=58785800;
 //BA.debugLineNum = 58785800;BA.debugLine="m.Put(c.Id, rs.GetString(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetString(_c.SQLID /*String*/ )));
 break; }
case 1: {
RDebugUtils.currentLine=58785802;
 //BA.debugLineNum = 58785802;BA.debugLine="m.Put(c.Id, rs.GetDouble(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetDouble(_c.SQLID /*String*/ )));
 break; }
case 2: {
RDebugUtils.currentLine=58785804;
 //BA.debugLineNum = 58785804;BA.debugLine="m.Put(c.Id, rs.GetLong(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetLong(_c.SQLID /*String*/ )));
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=58785808;
 //BA.debugLineNum = 58785808;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=58785809;
 //BA.debugLineNum = 58785809;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=58785810;
 //BA.debugLineNum = 58785810;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _setdata(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setdata", true))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "setdata", new Object[] {_data}));}
ResumableSub_SetData rsub = new ResumableSub_SetData(this,__ref,_data);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_SetData extends BA.ResumableSub {
public ResumableSub_SetData(b4a.example.ef.b4xtable parent,b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.collections.List _data) {
this.parent = parent;
this.__ref = __ref;
this._data = _data;
this.__ref = parent;
}
b4a.example.ef.b4xtable __ref;
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
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized()) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Close();
if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=57933829;
 //BA.debugLineNum = 57933829;BA.debugLine="sql1.Initialize(\"\", \":memory:\", True)";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Initialize("",":memory:",parent.__c.True);
RDebugUtils.currentLine=57933831;
 //BA.debugLineNum = 57933831;BA.debugLine="CreateTable";
__ref._createtable /*String*/ (null);
RDebugUtils.currentLine=57933832;
 //BA.debugLineNum = 57933832;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=57933833;
 //BA.debugLineNum = 57933833;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=57933834;
 //BA.debugLineNum = 57933834;BA.debugLine="sb.Append(\"INSERT INTO data VALUES (\")";
_sb.Append("INSERT INTO data VALUES (");
RDebugUtils.currentLine=57933835;
 //BA.debugLineNum = 57933835;BA.debugLine="For Each Column As B4XTableColumn In Columns";
if (true) break;

case 7:
//for
this.state = 16;
group7 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
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
RDebugUtils.currentLine=57933836;
 //BA.debugLineNum = 57933836;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (true) break;

case 10:
//if
this.state = 15;
if (_column.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
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
RDebugUtils.currentLine=57933837;
 //BA.debugLineNum = 57933837;BA.debugLine="sb.Append(\"?,\")";
_sb.Append("?,");
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=57933839;
 //BA.debugLineNum = 57933839;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=57933840;
 //BA.debugLineNum = 57933840;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=57933841;
 //BA.debugLineNum = 57933841;BA.debugLine="If Data.Size > 0 Then";
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
RDebugUtils.currentLine=57933842;
 //BA.debugLineNum = 57933842;BA.debugLine="If Data.Get(0) Is List Then";
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
RDebugUtils.currentLine=57933843;
 //BA.debugLineNum = 57933843;BA.debugLine="For Each lrow As Object In Data";
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
RDebugUtils.currentLine=57933844;
 //BA.debugLineNum = 57933844;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, lrow)";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .AddNonQueryToBatch(_sb.ToString(),(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_lrow)));
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
RDebugUtils.currentLine=57933847;
 //BA.debugLineNum = 57933847;BA.debugLine="For Each row() As Object In Data";
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
RDebugUtils.currentLine=57933848;
 //BA.debugLineNum = 57933848;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, row)";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .AddNonQueryToBatch(_sb.ToString(),anywheresoftware.b4a.keywords.Common.ArrayToList(_row));
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
RDebugUtils.currentLine=57933853;
 //BA.debugLineNum = 57933853;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
_senderfilter = __ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQueryBatch(ba,"SQL1");
RDebugUtils.currentLine=57933855;
 //BA.debugLineNum = 57933855;BA.debugLine="Wait For (SenderFilter) SQL1_NonQueryComplete (Su";
parent.__c.WaitFor("sql1_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "setdata"), _senderfilter);
this.state = 41;
return;
case 41:
//C
this.state = -1;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=57933857;
 //BA.debugLineNum = 57933857;BA.debugLine="CountAll = Data.Size";
__ref._countall /*int*/  = _data.getSize();
RDebugUtils.currentLine=57933858;
 //BA.debugLineNum = 57933858;BA.debugLine="RefreshNow";
__ref._refreshnow /*String*/ (null);
RDebugUtils.currentLine=57933859;
 //BA.debugLineNum = 57933859;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=57933860;
 //BA.debugLineNum = 57933860;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.b4xtable._b4xtablecolumn  _addcolumn(b4a.example.ef.b4xtable __ref,String _title,int _columntype) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "addcolumn", true))
	 {return ((b4a.example.ef.b4xtable._b4xtablecolumn) Debug.delegate(ba, "addcolumn", new Object[] {_title,_columntype}));}
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.B4XViewWrapper _header = null;
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Public Sub AddColumn (Title As String, ColumnType";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="Dim c As B4XTableColumn";
_c = new b4a.example.ef.b4xtable._b4xtablecolumn();
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="c.Initialize";
_c.Initialize();
RDebugUtils.currentLine=57737219;
 //BA.debugLineNum = 57737219;BA.debugLine="c.Title = Title";
_c.Title /*String*/  = _title;
RDebugUtils.currentLine=57737220;
 //BA.debugLineNum = 57737220;BA.debugLine="c.ColumnType = ColumnType";
_c.ColumnType /*int*/  = _columntype;
RDebugUtils.currentLine=57737221;
 //BA.debugLineNum = 57737221;BA.debugLine="c.Sortable = ColumnType <> COLUMN_TYPE_VOID";
_c.Sortable /*boolean*/  = _columntype!=__ref._column_type_void /*int*/ ;
RDebugUtils.currentLine=57737222;
 //BA.debugLineNum = 57737222;BA.debugLine="c.Searchable = ColumnType = COLUMN_TYPE_TEXT";
_c.Searchable /*boolean*/  = _columntype==__ref._column_type_text /*int*/ ;
RDebugUtils.currentLine=57737223;
 //BA.debugLineNum = 57737223;BA.debugLine="c.CellsLayouts.Initialize";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=57737224;
 //BA.debugLineNum = 57737224;BA.debugLine="c.Formatter = DefaultDataFormatter";
_c.Formatter /*b4a.example.ef.b4xformatter*/  = __ref._defaultdataformatter /*b4a.example.ef.b4xformatter*/ ;
RDebugUtils.currentLine=57737225;
 //BA.debugLineNum = 57737225;BA.debugLine="c.Panel = xui.CreatePanel(\"ColumnPanel\")";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"ColumnPanel");
RDebugUtils.currentLine=57737226;
 //BA.debugLineNum = 57737226;BA.debugLine="c.Panel.Tag = c";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_c));
RDebugUtils.currentLine=57737227;
 //BA.debugLineNum = 57737227;BA.debugLine="c.Id = Title";
_c.Id /*String*/  = _title;
RDebugUtils.currentLine=57737228;
 //BA.debugLineNum = 57737228;BA.debugLine="Columns.Add(c)";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=57737229;
 //BA.debugLineNum = 57737229;BA.debugLine="VisibleColumns.Add(c)";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=57737230;
 //BA.debugLineNum = 57737230;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=57737231;
 //BA.debugLineNum = 57737231;BA.debugLine="Dim header As B4XView = GetLabelFromColumn(c, 0)";
_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_header = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,(int) (0));
RDebugUtils.currentLine=57737232;
 //BA.debugLineNum = 57737232;BA.debugLine="SetTextOrCSBuilderToLabel (header, Title)";
__ref._settextorcsbuildertolabel /*String*/ (null,_header,(Object)(_title));
RDebugUtils.currentLine=57737233;
 //BA.debugLineNum = 57737233;BA.debugLine="If LayoutLoaded Then";
if (__ref._layoutloaded /*boolean*/ ) { 
RDebugUtils.currentLine=57737234;
 //BA.debugLineNum = 57737234;BA.debugLine="AddColumnToCLV(c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
RDebugUtils.currentLine=57737236;
 //BA.debugLineNum = 57737236;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=57737237;
 //BA.debugLineNum = 57737237;BA.debugLine="End Sub";
return null;
}
public String  _createcolumnlayouts(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createcolumnlayouts", true))
	 {return ((String) Debug.delegate(ba, "createcolumnlayouts", new Object[] {_c,_size}));}
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
int _clr = 0;
int _tclr = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
RDebugUtils.currentLine=57868288;
 //BA.debugLineNum = 57868288;BA.debugLine="Private Sub CreateColumnLayouts (c As B4XTableColu";
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="For i = c.CellsLayouts.Size To Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_size-1);
_i = _c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize() ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="Dim p As B4XView = CreateCellViews";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createcellviews /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=57868291;
 //BA.debugLineNum = 57868291;BA.debugLine="Dim lbl As B4XView = p.GetView(c.LabelIndex)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=57868292;
 //BA.debugLineNum = 57868292;BA.debugLine="c.CellsLayouts.Add(p)";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
RDebugUtils.currentLine=57868293;
 //BA.debugLineNum = 57868293;BA.debugLine="Dim clr, tclr As Int";
_clr = 0;
_tclr = 0;
RDebugUtils.currentLine=57868294;
 //BA.debugLineNum = 57868294;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=57868295;
 //BA.debugLineNum = 57868295;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=57868296;
 //BA.debugLineNum = 57868296;BA.debugLine="clr = HeaderColor";
_clr = __ref._headercolor /*int*/ ;
RDebugUtils.currentLine=57868297;
 //BA.debugLineNum = 57868297;BA.debugLine="tclr = HeaderTextColor";
_tclr = __ref._headertextcolor /*int*/ ;
RDebugUtils.currentLine=57868298;
 //BA.debugLineNum = 57868298;BA.debugLine="fnt = HeaderFont";
_fnt = __ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 }else {
RDebugUtils.currentLine=57868300;
 //BA.debugLineNum = 57868300;BA.debugLine="fnt = LabelsFont";
_fnt = __ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=57868301;
 //BA.debugLineNum = 57868301;BA.debugLine="tclr = TextColor";
_tclr = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=57868302;
 //BA.debugLineNum = 57868302;BA.debugLine="If i Mod 2 = 1 Then";
if (_i%2==1) { 
RDebugUtils.currentLine=57868303;
 //BA.debugLineNum = 57868303;BA.debugLine="clr = EvenRowColor";
_clr = __ref._evenrowcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=57868305;
 //BA.debugLineNum = 57868305;BA.debugLine="clr = OddRowColor";
_clr = __ref._oddrowcolor /*int*/ ;
 };
 };
RDebugUtils.currentLine=57868308;
 //BA.debugLineNum = 57868308;BA.debugLine="lbl.Font = fnt";
_lbl.setFont(_fnt);
RDebugUtils.currentLine=57868309;
 //BA.debugLineNum = 57868309;BA.debugLine="p.SetColorAndBorder(clr, 1dip, GridColor, 0)";
_p.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._gridcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=57868310;
 //BA.debugLineNum = 57868310;BA.debugLine="lbl.TextColor = tclr";
_lbl.setTextColor(_tclr);
RDebugUtils.currentLine=57868311;
 //BA.debugLineNum = 57868311;BA.debugLine="lbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_lbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=57868312;
 //BA.debugLineNum = 57868312;BA.debugLine="p.Tag = i";
_p.setTag((Object)(_i));
RDebugUtils.currentLine=57868313;
 //BA.debugLineNum = 57868313;BA.debugLine="c.Panel.AddView(p, 0, 0, 0, 0)";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }
};
RDebugUtils.currentLine=57868315;
 //BA.debugLineNum = 57868315;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabelfromcolumn(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getlabelfromcolumn", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabelfromcolumn", new Object[] {_c,_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=57540608;
 //BA.debugLineNum = 57540608;BA.debugLine="Private Sub GetLabelFromColumn (c As B4XTableColum";
RDebugUtils.currentLine=57540609;
 //BA.debugLineNum = 57540609;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=57540610;
 //BA.debugLineNum = 57540610;BA.debugLine="Return p.GetView(c.LabelIndex)";
if (true) return _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=57540611;
 //BA.debugLineNum = 57540611;BA.debugLine="End Sub";
return null;
}
public String  _settextorcsbuildertolabel(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "settextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Private Sub SetTextOrCSBuilderToLabel(xlbl As B4XV";
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=58523660;
 //BA.debugLineNum = 58523660;BA.debugLine="End Sub";
return "";
}
public String  _addcolumntoclv(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "addcolumntoclv", true))
	 {return ((String) Debug.delegate(ba, "addcolumntoclv", new Object[] {_c}));}
RDebugUtils.currentLine=57671680;
 //BA.debugLineNum = 57671680;BA.debugLine="Private Sub AddColumnToCLV (c As B4XTableColumn)";
RDebugUtils.currentLine=57671681;
 //BA.debugLineNum = 57671681;BA.debugLine="clvData.Add(c.Panel, c)";
__ref._clvdata /*b4a.example3.customlistview*/ ._add(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
RDebugUtils.currentLine=57671682;
 //BA.debugLineNum = 57671682;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.b4xtable __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=56229888;
 //BA.debugLineNum = 56229888;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=56229889;
 //BA.debugLineNum = 56229889;BA.debugLine="Refresh2 (False, False)";
__ref._refresh2 /*String*/ (null,__c.False,__c.False);
RDebugUtils.currentLine=56229890;
 //BA.debugLineNum = 56229890;BA.debugLine="End Sub";
return "";
}
public String  _refresh2(b4a.example.ef.b4xtable __ref,boolean _refreshdata,boolean _dontsleep) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refresh2", true))
	 {return ((String) Debug.delegate(ba, "refresh2", new Object[] {_refreshdata,_dontsleep}));}
int _prevrowsperpage = 0;
int _totalheight = 0;
int _columnindex = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
boolean _isfrozen = false;
int _freezedwidth = 0;
int _i = 0;
float _offset = 0f;
RDebugUtils.currentLine=56557568;
 //BA.debugLineNum = 56557568;BA.debugLine="Private Sub Refresh2 (RefreshData As Boolean, Dont";
RDebugUtils.currentLine=56557569;
 //BA.debugLineNum = 56557569;BA.debugLine="If LayoutLoaded = False Or VisibleColumns.Size =";
if (__ref._layoutloaded /*boolean*/ ==__c.False || __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=56557570;
 //BA.debugLineNum = 56557570;BA.debugLine="Dim PrevRowsPerPage As Int = mRowsPerPage";
_prevrowsperpage = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=56557571;
 //BA.debugLineNum = 56557571;BA.debugLine="If xui.IsB4A And LastBaseHeight <> mBase.Height T";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._lastbaseheight /*int*/ !=__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=56557572;
 //BA.debugLineNum = 56557572;BA.debugLine="clvData.AsView.Height = clvData.AsView.Height -";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().setHeight((int) (__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight()-(__ref._lastbaseheight /*int*/ -__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=56557573;
 //BA.debugLineNum = 56557573;BA.debugLine="clvData.Base_Resize(clvData.AsView.Width, clvDat";
__ref._clvdata /*b4a.example3.customlistview*/ ._base_resize(__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=56557574;
 //BA.debugLineNum = 56557574;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
 };
RDebugUtils.currentLine=56557576;
 //BA.debugLineNum = 56557576;BA.debugLine="Dim TotalHeight As Int = clvData.AsView.Height -";
_totalheight = (int) (__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight()-__ref._headersheight /*int*/ );
RDebugUtils.currentLine=56557577;
 //BA.debugLineNum = 56557577;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=56557578;
 //BA.debugLineNum = 56557578;BA.debugLine="TotalHeight = TotalHeight - 20";
_totalheight = (int) (_totalheight-20);
 };
RDebugUtils.currentLine=56557580;
 //BA.debugLineNum = 56557580;BA.debugLine="If AllowSmallRowHeightModifications Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ) { 
RDebugUtils.currentLine=56557581;
 //BA.debugLineNum = 56557581;BA.debugLine="mRowsPerPage = Max(0, Round(TotalHeight/ RowHeig";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Round(_totalheight/(double)__ref._rowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=56557583;
 //BA.debugLineNum = 56557583;BA.debugLine="mRowsPerPage = Max(0, Floor(TotalHeight / RowHei";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Floor(_totalheight/(double)__ref._rowheight /*int*/ )));
 };
RDebugUtils.currentLine=56557585;
 //BA.debugLineNum = 56557585;BA.debugLine="If MaximumRowsPerPage > 0 Then";
if (__ref._maximumrowsperpage /*int*/ >0) { 
RDebugUtils.currentLine=56557586;
 //BA.debugLineNum = 56557586;BA.debugLine="mRowsPerPage = Min(MaximumRowsPerPage, mRowsPerP";
__ref._mrowsperpage /*int*/  = (int) (__c.Min(__ref._maximumrowsperpage /*int*/ ,__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=56557587;
 //BA.debugLineNum = 56557587;BA.debugLine="TotalHeight = Min(TotalHeight, MaximumRowsPerPag";
_totalheight = (int) (__c.Min(_totalheight,__ref._maximumrowsperpage /*int*/ *__ref._rowheight /*int*/ ));
 };
RDebugUtils.currentLine=56557589;
 //BA.debugLineNum = 56557589;BA.debugLine="If PrevRowsPerPage <> mRowsPerPage Then RefreshDa";
if (_prevrowsperpage!=__ref._mrowsperpage /*int*/ ) { 
_refreshdata = __c.True;};
RDebugUtils.currentLine=56557590;
 //BA.debugLineNum = 56557590;BA.debugLine="CalculateWidths";
__ref._calculatewidths /*String*/ (null);
RDebugUtils.currentLine=56557591;
 //BA.debugLineNum = 56557591;BA.debugLine="Dim ColumnIndex As Int";
_columnindex = 0;
RDebugUtils.currentLine=56557593;
 //BA.debugLineNum = 56557593;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group24 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group24.Get(index24));
RDebugUtils.currentLine=56557594;
 //BA.debugLineNum = 56557594;BA.debugLine="Dim IsFrozen As Boolean = ColumnIndex < NumberOf";
_isfrozen = _columnindex<__ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=56557595;
 //BA.debugLineNum = 56557595;BA.debugLine="If c.Panel.Parent.IsInitialized Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=56557596;
 //BA.debugLineNum = 56557596;BA.debugLine="CheckAndRemoveColumnThatWasAddedToIncorrectPare";
__ref._checkandremovecolumnthatwasaddedtoincorrectparent /*String*/ (null,_c,_isfrozen);
 };
RDebugUtils.currentLine=56557598;
 //BA.debugLineNum = 56557598;BA.debugLine="If c.Panel.Parent.IsInitialized = False Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()==__c.False) { 
RDebugUtils.currentLine=56557599;
 //BA.debugLineNum = 56557599;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=56557600;
 //BA.debugLineNum = 56557600;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=56557601;
 //BA.debugLineNum = 56557601;BA.debugLine="mBase.AddView(c.Panel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }else {
RDebugUtils.currentLine=56557603;
 //BA.debugLineNum = 56557603;BA.debugLine="AddColumnToCLV (c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
 };
RDebugUtils.currentLine=56557607;
 //BA.debugLineNum = 56557607;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=56557608;
 //BA.debugLineNum = 56557608;BA.debugLine="ResizeColumnImpl(c, TotalHeight)";
__ref._resizecolumnimpl /*String*/ (null,_c,_totalheight);
RDebugUtils.currentLine=56557609;
 //BA.debugLineNum = 56557609;BA.debugLine="ColumnIndex = ColumnIndex + 1";
_columnindex = (int) (_columnindex+1);
 }
};
RDebugUtils.currentLine=56557611;
 //BA.debugLineNum = 56557611;BA.debugLine="If RefreshData Then UpdateData (DontSleep)";
if (_refreshdata) { 
__ref._updatedata /*String*/ (null,_dontsleep);};
RDebugUtils.currentLine=56557612;
 //BA.debugLineNum = 56557612;BA.debugLine="Dim FreezedWidth As Int";
_freezedwidth = 0;
RDebugUtils.currentLine=56557613;
 //BA.debugLineNum = 56557613;BA.debugLine="For i = 0 To NumberOfFrozenColumns - 1";
{
final int step43 = 1;
final int limit43 = (int) (__ref._numberoffrozencolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=56557614;
 //BA.debugLineNum = 56557614;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=56557618;
 //BA.debugLineNum = 56557618;BA.debugLine="Dim offset As Float = 0";
_offset = (float) (0);
RDebugUtils.currentLine=56557620;
 //BA.debugLineNum = 56557620;BA.debugLine="c.Panel.SetLayoutAnimated(0, offset + FreezedWid";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_offset+_freezedwidth),(int) (__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getTop()+_offset),_c.ComputedWidth /*int*/ ,__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=56557622;
 //BA.debugLineNum = 56557622;BA.debugLine="FreezedWidth = FreezedWidth + c.ComputedWidth";
_freezedwidth = (int) (_freezedwidth+_c.ComputedWidth /*int*/ );
 }
};
RDebugUtils.currentLine=56557624;
 //BA.debugLineNum = 56557624;BA.debugLine="clvData.AsView.Left = FreezedWidth";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().setLeft(_freezedwidth);
RDebugUtils.currentLine=56557625;
 //BA.debugLineNum = 56557625;BA.debugLine="If Round(clvData.AsView.Width) <> Round(mBase.Wid";
if (__c.Round(__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getWidth())!=__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth)) { 
RDebugUtils.currentLine=56557626;
 //BA.debugLineNum = 56557626;BA.debugLine="clvData.AsView.Width = mBase.Width - FreezedWidt";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().setWidth((int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth));
RDebugUtils.currentLine=56557627;
 //BA.debugLineNum = 56557627;BA.debugLine="If xui.IsB4A Then clvData.Base_Resize(clvData.As";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._clvdata /*b4a.example3.customlistview*/ ._base_resize(__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight());};
 };
RDebugUtils.currentLine=56557629;
 //BA.debugLineNum = 56557629;BA.debugLine="ResizeAndReorderCLVItems";
__ref._resizeandreorderclvitems /*String*/ (null);
RDebugUtils.currentLine=56557630;
 //BA.debugLineNum = 56557630;BA.debugLine="UpdateSearchFieldVisibility";
__ref._updatesearchfieldvisibility /*String*/ (null);
RDebugUtils.currentLine=56557631;
 //BA.debugLineNum = 56557631;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=56557632;
 //BA.debugLineNum = 56557632;BA.debugLine="End Sub";
return "";
}
public String  _buildlayoutscache(b4a.example.ef.b4xtable __ref,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "buildlayoutscache", true))
	 {return ((String) Debug.delegate(ba, "buildlayoutscache", new Object[] {_size}));}
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Public Sub BuildLayoutsCache (Size As Int)";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="CreateColumnLayouts(c, Size + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (_size+1));
 }
};
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="End Sub";
return "";
}
public Object[]  _buildquery(b4a.example.ef.b4xtable __ref,boolean _withpagelimit) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "buildquery", true))
	 {return ((Object[]) Debug.delegate(ba, "buildquery", new Object[] {_withpagelimit}));}
String _sortcolumn = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.objects.collections.List _args = null;
int _totalcount = 0;
int _limit = 0;
String[] _aargs = null;
int _i = 0;
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Public Sub BuildQuery (WithPageLimit As Boolean) A";
RDebugUtils.currentLine=57016321;
 //BA.debugLineNum = 57016321;BA.debugLine="Dim SortColumn As String";
_sortcolumn = "";
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=57016323;
 //BA.debugLineNum = 57016323;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=57016324;
 //BA.debugLineNum = 57016324;BA.debugLine="sb.Append(\"SELECT rowid\")";
_sb.Append("SELECT rowid");
RDebugUtils.currentLine=57016325;
 //BA.debugLineNum = 57016325;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=57016326;
 //BA.debugLineNum = 57016326;BA.debugLine="If c.ColumnType = COLUMN_TYPE_VOID Then Continue";
if (_c.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=57016327;
 //BA.debugLineNum = 57016327;BA.debugLine="sb.Append(\",\").Append(c.SQLID)";
_sb.Append(",").Append(_c.SQLID /*String*/ );
RDebugUtils.currentLine=57016328;
 //BA.debugLineNum = 57016328;BA.debugLine="If c.InternalSortMode <> \"\" Then";
if ((_c.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=57016329;
 //BA.debugLineNum = 57016329;BA.debugLine="SortColumn = \" ORDER BY \" & c.SQLID & \" \" & c.I";
_sortcolumn = " ORDER BY "+_c.SQLID /*String*/ +" "+_c.InternalSortMode /*String*/ ;
 };
 }
};
RDebugUtils.currentLine=57016332;
 //BA.debugLineNum = 57016332;BA.debugLine="sb.Append(\" FROM \").Append(SQLTableName).Append(\"";
_sb.Append(" FROM ").Append(__ref._sqltablename /*String*/ ).Append(" ");
RDebugUtils.currentLine=57016333;
 //BA.debugLineNum = 57016333;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57016334;
 //BA.debugLineNum = 57016334;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=57016335;
 //BA.debugLineNum = 57016335;BA.debugLine="Dim TotalCount As Int";
_totalcount = 0;
RDebugUtils.currentLine=57016336;
 //BA.debugLineNum = 57016336;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=57016337;
 //BA.debugLineNum = 57016337;BA.debugLine="TotalCount = CountAll";
_totalcount = __ref._countall /*int*/ ;
 }else {
RDebugUtils.currentLine=57016339;
 //BA.debugLineNum = 57016339;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group19 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group19.Get(index19));
RDebugUtils.currentLine=57016340;
 //BA.debugLineNum = 57016340;BA.debugLine="If c.Searchable Then";
if (_c.Searchable /*boolean*/ ) { 
RDebugUtils.currentLine=57016341;
 //BA.debugLineNum = 57016341;BA.debugLine="If args.Size = 0 Then";
if (_args.getSize()==0) { 
RDebugUtils.currentLine=57016342;
 //BA.debugLineNum = 57016342;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
 }else {
RDebugUtils.currentLine=57016344;
 //BA.debugLineNum = 57016344;BA.debugLine="sb.Append(\" OR \")";
_sb.Append(" OR ");
 };
RDebugUtils.currentLine=57016346;
 //BA.debugLineNum = 57016346;BA.debugLine="sb.Append(c.SQLID).Append(\" LIKE ? \")";
_sb.Append(_c.SQLID /*String*/ ).Append(" LIKE ? ");
RDebugUtils.currentLine=57016347;
 //BA.debugLineNum = 57016347;BA.debugLine="If PrefixSearch Then";
if (__ref._prefixsearch /*boolean*/ ) { 
RDebugUtils.currentLine=57016348;
 //BA.debugLineNum = 57016348;BA.debugLine="args.Add(FilterText & \"%\")";
_args.Add((Object)(__ref._filtertext /*String*/ +"%"));
 }else {
RDebugUtils.currentLine=57016350;
 //BA.debugLineNum = 57016350;BA.debugLine="args.Add(\"%\" & FilterText & \"%\")";
_args.Add((Object)("%"+__ref._filtertext /*String*/ +"%"));
 };
 };
 }
};
RDebugUtils.currentLine=57016354;
 //BA.debugLineNum = 57016354;BA.debugLine="TotalCount = -1";
_totalcount = (int) (-1);
 };
RDebugUtils.currentLine=57016356;
 //BA.debugLineNum = 57016356;BA.debugLine="If SortColumn <> \"\" Then sb.Append(SortColumn)";
if ((_sortcolumn).equals("") == false) { 
_sb.Append(_sortcolumn);};
RDebugUtils.currentLine=57016357;
 //BA.debugLineNum = 57016357;BA.debugLine="If WithPageLimit Then";
if (_withpagelimit) { 
RDebugUtils.currentLine=57016358;
 //BA.debugLineNum = 57016358;BA.debugLine="Dim limit As Int = mRowsPerPage";
_limit = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=57016359;
 //BA.debugLineNum = 57016359;BA.debugLine="If TotalCount < 0 Then limit = limit + 1";
if (_totalcount<0) { 
_limit = (int) (_limit+1);};
RDebugUtils.currentLine=57016360;
 //BA.debugLineNum = 57016360;BA.debugLine="sb.Append($\" LIMIT ${mFirstRowIndex}, ${limit}\"$";
_sb.Append((" LIMIT "+__c.SmartStringFormatter("",(Object)(__ref._mfirstrowindex /*int*/ ))+", "+__c.SmartStringFormatter("",(Object)(_limit))+""));
 };
RDebugUtils.currentLine=57016363;
 //BA.debugLineNum = 57016363;BA.debugLine="Dim aargs(args.Size) As String";
_aargs = new String[_args.getSize()];
java.util.Arrays.fill(_aargs,"");
RDebugUtils.currentLine=57016364;
 //BA.debugLineNum = 57016364;BA.debugLine="For i = 0 To args.Size - 1";
{
final int step43 = 1;
final int limit43 = (int) (_args.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=57016365;
 //BA.debugLineNum = 57016365;BA.debugLine="aargs(i) = args.Get(i)";
_aargs[_i] = BA.ObjectToString(_args.Get(_i));
 }
};
RDebugUtils.currentLine=57016370;
 //BA.debugLineNum = 57016370;BA.debugLine="Return Array(sb.ToString, aargs, TotalCount)";
if (true) return new Object[]{(Object)(_sb.ToString()),(Object)(_aargs),(Object)(_totalcount)};
RDebugUtils.currentLine=57016371;
 //BA.debugLineNum = 57016371;BA.debugLine="End Sub";
return null;
}
public String  _calculatewidths(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "calculatewidths", true))
	 {return ((String) Debug.delegate(ba, "calculatewidths", null));}
int _wildcardcount = 0;
int _totalexplicitwidth = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
int _wildcardwidth = 0;
int _width = 0;
int _remainder = 0;
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Private Sub CalculateWidths";
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="Dim wildcardcount As Int";
_wildcardcount = 0;
RDebugUtils.currentLine=57606146;
 //BA.debugLineNum = 57606146;BA.debugLine="Dim TotalExplicitWidth As Int";
_totalexplicitwidth = 0;
RDebugUtils.currentLine=57606147;
 //BA.debugLineNum = 57606147;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group3.Get(index3));
RDebugUtils.currentLine=57606148;
 //BA.debugLineNum = 57606148;BA.debugLine="If c.Width = 0 Then wildcardcount = wildcardcoun";
if (_c.Width /*int*/ ==0) { 
_wildcardcount = (int) (_wildcardcount+1);}
else {
_c.ComputedWidth /*int*/  = _c.Width /*int*/ ;};
RDebugUtils.currentLine=57606149;
 //BA.debugLineNum = 57606149;BA.debugLine="TotalExplicitWidth = TotalExplicitWidth + c.Widt";
_totalexplicitwidth = (int) (_totalexplicitwidth+_c.Width /*int*/ );
 }
};
RDebugUtils.currentLine=57606151;
 //BA.debugLineNum = 57606151;BA.debugLine="If wildcardcount = 0 Then Return";
if (_wildcardcount==0) { 
if (true) return "";};
RDebugUtils.currentLine=57606152;
 //BA.debugLineNum = 57606152;BA.debugLine="Dim WildcardWidth As Int = Max(wildcardcount * Mi";
_wildcardwidth = (int) (__c.Max(_wildcardcount*__ref._minimumwidth /*int*/ ,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))-_totalexplicitwidth));
RDebugUtils.currentLine=57606153;
 //BA.debugLineNum = 57606153;BA.debugLine="Dim Width As Int = WildcardWidth / wildcardcount";
_width = (int) (_wildcardwidth/(double)_wildcardcount);
RDebugUtils.currentLine=57606154;
 //BA.debugLineNum = 57606154;BA.debugLine="Dim Remainder As Int = WildcardWidth Mod wildcard";
_remainder = (int) (_wildcardwidth%_wildcardcount);
RDebugUtils.currentLine=57606155;
 //BA.debugLineNum = 57606155;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group11.Get(index11));
RDebugUtils.currentLine=57606156;
 //BA.debugLineNum = 57606156;BA.debugLine="If c.Width = 0 Then";
if (_c.Width /*int*/ ==0) { 
RDebugUtils.currentLine=57606157;
 //BA.debugLineNum = 57606157;BA.debugLine="c.ComputedWidth = Width";
_c.ComputedWidth /*int*/  = _width;
RDebugUtils.currentLine=57606158;
 //BA.debugLineNum = 57606158;BA.debugLine="If Remainder > 0 Then";
if (_remainder>0) { 
RDebugUtils.currentLine=57606159;
 //BA.debugLineNum = 57606159;BA.debugLine="Remainder = Remainder - 1";
_remainder = (int) (_remainder-1);
RDebugUtils.currentLine=57606160;
 //BA.debugLineNum = 57606160;BA.debugLine="c.ComputedWidth = c.ComputedWidth + 1";
_c.ComputedWidth /*int*/  = (int) (_c.ComputedWidth /*int*/ +1);
 };
 };
 }
};
RDebugUtils.currentLine=57606164;
 //BA.debugLineNum = 57606164;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cell_click", true))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="CellClicked(Sender, False)";
__ref._cellclicked /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.False);
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="End Sub";
return "";
}
public void  _cellclicked(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cellclicked", true))
	 {Debug.delegate(ba, "cellclicked", new Object[] {_pnl,_longclicked}); return;}
ResumableSub_CellClicked rsub = new ResumableSub_CellClicked(this,__ref,_pnl,_longclicked);
rsub.resume(ba, null);
}
public static class ResumableSub_CellClicked extends BA.ResumableSub {
public ResumableSub_CellClicked(b4a.example.ef.b4xtable parent,b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _pnl,boolean _longclicked) {
this.parent = parent;
this.__ref = __ref;
this._pnl = _pnl;
this._longclicked = _longclicked;
this.__ref = parent;
}
b4a.example.ef.b4xtable __ref;
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
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="If DateTime.Now < LastCellClickEvent + 20 Then Re";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.DateTime.getNow()<__ref._lastcellclickevent /*long*/ +20) { 
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
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="LastCellClickEvent = DateTime.Now";
__ref._lastcellclickevent /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="Dim column As B4XTableColumn = pnl.Parent.Tag";
_column = (b4a.example.ef.b4xtable._b4xtablecolumn)(_pnl.getParent().getTag());
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="Dim Row As Int = pnl.Tag - 1";
_row = (int) ((double)(BA.ObjectToNumber(_pnl.getTag()))-1);
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="Dim e As String";
_e = "";
RDebugUtils.currentLine=58589190;
 //BA.debugLineNum = 58589190;BA.debugLine="If Row = -1 Then";
if (true) break;

case 7:
//if
this.state = 61;
if (_row==-1) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=58589203;
 //BA.debugLineNum = 58589203;BA.debugLine="Else If VisibleRowIds.Size > 0 Then";
if (__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 20;
}}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=58589191;
 //BA.debugLineNum = 58589191;BA.debugLine="If LongClicked Then";
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
RDebugUtils.currentLine=58589192;
 //BA.debugLineNum = 58589192;BA.debugLine="e = \"_headerlongclicked\"";
_e = "_headerlongclicked";
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=58589194;
 //BA.debugLineNum = 58589194;BA.debugLine="e = \"_headerclicked\"";
_e = "_headerclicked";
RDebugUtils.currentLine=58589195;
 //BA.debugLineNum = 58589195;BA.debugLine="HeaderClicked(column)";
__ref._headerclicked /*String*/ (null,_column);
 if (true) break;
;
RDebugUtils.currentLine=58589197;
 //BA.debugLineNum = 58589197;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 1) T";

case 15:
//if
this.state = 18;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (1))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=58589201;
 //BA.debugLineNum = 58589201;BA.debugLine="CallSub2(mCallBack, mEventName & e, column.Id)";
parent.__c.CallSubNew2(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(Object)(_column.Id /*String*/ ));
 if (true) break;

case 18:
//C
this.state = 61;
;
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=58589204;
 //BA.debugLineNum = 58589204;BA.debugLine="Dim RowId As Long = VisibleRowIds.Get(Row)";
_rowid = BA.ObjectToLongNumber(__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=58589205;
 //BA.debugLineNum = 58589205;BA.debugLine="If RowId > 0 Then";
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
RDebugUtils.currentLine=58589206;
 //BA.debugLineNum = 58589206;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=58589207;
 //BA.debugLineNum = 58589207;BA.debugLine="If Row Mod 2 = 0 Then clr = EvenRowColor Else c";
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
_clr = __ref._evenrowcolor /*int*/ ;
if (true) break;

case 28:
//C
this.state = 31;
_clr = __ref._oddrowcolor /*int*/ ;
if (true) break;

case 31:
//C
this.state = 32;
;
RDebugUtils.currentLine=58589209;
 //BA.debugLineNum = 58589209;BA.debugLine="If LongClicked Then";
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
RDebugUtils.currentLine=58589210;
 //BA.debugLineNum = 58589210;BA.debugLine="e = \"_CellLongClicked\"";
_e = "_CellLongClicked";
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=58589212;
 //BA.debugLineNum = 58589212;BA.debugLine="e = \"_cellclicked\"";
_e = "_cellclicked";
RDebugUtils.currentLine=58589213;
 //BA.debugLineNum = 58589213;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnimat";
if (true) break;

case 37:
//if
this.state = 42;
if (__ref._selectioncolor /*int*/ !=0) { 
this.state = 39;
;}if (true) break;

case 39:
//C
this.state = 42;
_pnl.SetColorAnimated((int) (50),_clr,__ref._selectioncolor /*int*/ );
if (true) break;

case 42:
//C
this.state = 43;
;
 if (true) break;
;
RDebugUtils.currentLine=58589216;
 //BA.debugLineNum = 58589216;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 2)";

case 43:
//if
this.state = 46;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (2))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=58589220;
 //BA.debugLineNum = 58589220;BA.debugLine="CallSub3(mCallBack, mEventName & e, column.Id,";
parent.__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(Object)(_column.Id /*String*/ ),__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
 if (true) break;
;
RDebugUtils.currentLine=58589222;
 //BA.debugLineNum = 58589222;BA.debugLine="If LongClicked = False Then";

case 46:
//if
this.state = 59;
if (_longclicked==parent.__c.False) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=58589223;
 //BA.debugLineNum = 58589223;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "cellclicked"),(int) (200));
this.state = 62;
return;
case 62:
//C
this.state = 49;
;
RDebugUtils.currentLine=58589224;
 //BA.debugLineNum = 58589224;BA.debugLine="If pnl.IsInitialized Then";
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
RDebugUtils.currentLine=58589225;
 //BA.debugLineNum = 58589225;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnima";
if (true) break;

case 52:
//if
this.state = 57;
if (__ref._selectioncolor /*int*/ !=0) { 
this.state = 54;
;}if (true) break;

case 54:
//C
this.state = 57;
_pnl.SetColorAnimated((int) (200),__ref._selectioncolor /*int*/ ,_clr);
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
RDebugUtils.currentLine=58589230;
 //BA.debugLineNum = 58589230;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _cell_longclick(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cell_longclick", true))
	 {return ((String) Debug.delegate(ba, "cell_longclick", null));}
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="CellClicked(Sender, True)";
__ref._cellclicked /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="End Sub";
return "";
}
public String  _headerclicked(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "headerclicked", true))
	 {return ((String) Debug.delegate(ba, "headerclicked", new Object[] {_col}));}
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Private Sub HeaderClicked (col As B4XTableColumn)";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="If col.Sortable Then";
if (_col.Sortable /*boolean*/ ) { 
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group2.Get(index2));
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="If c = col Then";
if ((_c).equals(_col)) { 
RDebugUtils.currentLine=58654724;
 //BA.debugLineNum = 58654724;BA.debugLine="If c.InternalSortMode = \"ASC\" Then c.InternalS";
if ((_c.InternalSortMode /*String*/ ).equals("ASC")) { 
_c.InternalSortMode /*String*/  = "DESC";}
else {
_c.InternalSortMode /*String*/  = "ASC";};
 }else {
RDebugUtils.currentLine=58654726;
 //BA.debugLineNum = 58654726;BA.debugLine="c.InternalSortMode = \"\"";
_c.InternalSortMode /*String*/  = "";
 };
 }
};
RDebugUtils.currentLine=58654729;
 //BA.debugLineNum = 58654729;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=58654730;
 //BA.debugLineNum = 58654730;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=58654731;
 //BA.debugLineNum = 58654731;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=58654733;
 //BA.debugLineNum = 58654733;BA.debugLine="End Sub";
return "";
}
public String  _checkandremovecolumnthatwasaddedtoincorrectparent(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c,boolean _isfrozen) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", true))
	 {return ((String) Debug.delegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", new Object[] {_c,_isfrozen}));}
RDebugUtils.currentLine=56754176;
 //BA.debugLineNum = 56754176;BA.debugLine="Private Sub CheckAndRemoveColumnThatWasAddedToInco";
RDebugUtils.currentLine=56754177;
 //BA.debugLineNum = 56754177;BA.debugLine="If (c.Panel.Parent = mBase) <> IsFrozen Then";
if (((_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ))!=_isfrozen) { 
RDebugUtils.currentLine=56754178;
 //BA.debugLineNum = 56754178;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=56754179;
 //BA.debugLineNum = 56754179;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
 }else {
RDebugUtils.currentLine=56754181;
 //BA.debugLineNum = 56754181;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
 };
RDebugUtils.currentLine=56754184;
 //BA.debugLineNum = 56754184;BA.debugLine="End Sub";
return "";
}
public String  _removecolumnfromclv(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "removecolumnfromclv", true))
	 {return ((String) Debug.delegate(ba, "removecolumnfromclv", new Object[] {_c}));}
int _i = 0;
RDebugUtils.currentLine=56819712;
 //BA.debugLineNum = 56819712;BA.debugLine="Private Sub RemoveColumnFromCLV (c As B4XTableColu";
RDebugUtils.currentLine=56819713;
 //BA.debugLineNum = 56819713;BA.debugLine="For i = 0 To clvData.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._clvdata /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=56819714;
 //BA.debugLineNum = 56819714;BA.debugLine="If clvData.GetValue(i) = c Then";
if ((__ref._clvdata /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)(_c))) { 
RDebugUtils.currentLine=56819715;
 //BA.debugLineNum = 56819715;BA.debugLine="clvData.RemoveAt(i)";
__ref._clvdata /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=56819716;
 //BA.debugLineNum = 56819716;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=56819719;
 //BA.debugLineNum = 56819719;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=56819720;
 //BA.debugLineNum = 56819720;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
RDebugUtils.currentLine=56033280;
 //BA.debugLineNum = 56033280;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=56033281;
 //BA.debugLineNum = 56033281;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=56033282;
 //BA.debugLineNum = 56033282;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=56033283;
 //BA.debugLineNum = 56033283;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033284;
 //BA.debugLineNum = 56033284;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=56033285;
 //BA.debugLineNum = 56033285;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=56033286;
 //BA.debugLineNum = 56033286;BA.debugLine="Public sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=56033287;
 //BA.debugLineNum = 56033287;BA.debugLine="Type B4XTableColumn (Title As String, Id As Strin";
;
RDebugUtils.currentLine=56033290;
 //BA.debugLineNum = 56033290;BA.debugLine="Public COLUMN_TYPE_TEXT = 1, COLUMN_TYPE_NUMBERS";
_column_type_text = (int) (1);
_column_type_numbers = (int) (2);
_column_type_date = (int) (3);
_column_type_void = (int) (4);
RDebugUtils.currentLine=56033291;
 //BA.debugLineNum = 56033291;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56033292;
 //BA.debugLineNum = 56033292;BA.debugLine="Public VisibleColumns As List";
_visiblecolumns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56033293;
 //BA.debugLineNum = 56033293;BA.debugLine="Private mFirstRowIndex, mLastRowIndex As Int";
_mfirstrowindex = 0;
_mlastrowindex = 0;
RDebugUtils.currentLine=56033294;
 //BA.debugLineNum = 56033294;BA.debugLine="Public DefaultFormatter, DefaultDataFormatter As";
_defaultformatter = new b4a.example.ef.b4xformatter();
_defaultdataformatter = new b4a.example.ef.b4xformatter();
RDebugUtils.currentLine=56033295;
 //BA.debugLineNum = 56033295;BA.debugLine="Public pnlHeader As B4XView";
_pnlheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033296;
 //BA.debugLineNum = 56033296;BA.debugLine="Public pnlTitles As B4XView";
_pnltitles = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033297;
 //BA.debugLineNum = 56033297;BA.debugLine="Public clvData As CustomListView";
_clvdata = new b4a.example3.customlistview();
RDebugUtils.currentLine=56033298;
 //BA.debugLineNum = 56033298;BA.debugLine="Public RowHeight, HeadersHeight As Int";
_rowheight = 0;
_headersheight = 0;
RDebugUtils.currentLine=56033299;
 //BA.debugLineNum = 56033299;BA.debugLine="Public AllowSmallRowHeightModifications As Boolea";
_allowsmallrowheightmodifications = __c.True;
RDebugUtils.currentLine=56033300;
 //BA.debugLineNum = 56033300;BA.debugLine="Private mRowsPerPage As Int = 0";
_mrowsperpage = (int) (0);
RDebugUtils.currentLine=56033301;
 //BA.debugLineNum = 56033301;BA.debugLine="Private LayoutLoaded As Boolean";
_layoutloaded = false;
RDebugUtils.currentLine=56033302;
 //BA.debugLineNum = 56033302;BA.debugLine="Public MinimumWidth As Int";
_minimumwidth = 0;
RDebugUtils.currentLine=56033303;
 //BA.debugLineNum = 56033303;BA.debugLine="Private SQLIndex As Int";
_sqlindex = 0;
RDebugUtils.currentLine=56033304;
 //BA.debugLineNum = 56033304;BA.debugLine="Public EvenRowColor, OddRowColor, HeaderTextColor";
_evenrowcolor = 0;
_oddrowcolor = 0;
_headertextcolor = 0;
_textcolor = 0;
_highlighttextcolor = 0;
_headercolor = 0;
_gridcolor = 0;
RDebugUtils.currentLine=56033305;
 //BA.debugLineNum = 56033305;BA.debugLine="Public HighlightSearchResults As Boolean = True";
_highlightsearchresults = __c.True;
RDebugUtils.currentLine=56033306;
 //BA.debugLineNum = 56033306;BA.debugLine="Public HeaderFont, LabelsFont As B4XFont";
_headerfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_labelsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=56033307;
 //BA.debugLineNum = 56033307;BA.debugLine="Public lblFirst As B4XView";
_lblfirst = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033308;
 //BA.debugLineNum = 56033308;BA.debugLine="Public lblBack As B4XView";
_lblback = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033309;
 //BA.debugLineNum = 56033309;BA.debugLine="Public lblNumber As B4XView";
_lblnumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033310;
 //BA.debugLineNum = 56033310;BA.debugLine="Public lblNext As B4XView";
_lblnext = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033311;
 //BA.debugLineNum = 56033311;BA.debugLine="Public lblLast As B4XView";
_lbllast = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033312;
 //BA.debugLineNum = 56033312;BA.debugLine="Public lblFromTo As B4XView";
_lblfromto = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033313;
 //BA.debugLineNum = 56033313;BA.debugLine="Private CountAll As Int";
_countall = 0;
RDebugUtils.currentLine=56033314;
 //BA.debugLineNum = 56033314;BA.debugLine="Private mCurrentPage As Int";
_mcurrentpage = 0;
RDebugUtils.currentLine=56033315;
 //BA.debugLineNum = 56033315;BA.debugLine="Public mCurrentCount As Int";
_mcurrentcount = 0;
RDebugUtils.currentLine=56033316;
 //BA.debugLineNum = 56033316;BA.debugLine="Public lblSort As B4XView";
_lblsort = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=56033317;
 //BA.debugLineNum = 56033317;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4a.example.ef.b4xfloattextfield();
RDebugUtils.currentLine=56033318;
 //BA.debugLineNum = 56033318;BA.debugLine="Private FilterText As String";
_filtertext = "";
RDebugUtils.currentLine=56033319;
 //BA.debugLineNum = 56033319;BA.debugLine="Public SleepBeforeSearch As Int = 300";
_sleepbeforesearch = (int) (300);
RDebugUtils.currentLine=56033320;
 //BA.debugLineNum = 56033320;BA.debugLine="Private SearchIndex As Int";
_searchindex = 0;
RDebugUtils.currentLine=56033321;
 //BA.debugLineNum = 56033321;BA.debugLine="Public ArrowsEnabledColor, ArrowsDisabledColor As";
_arrowsenabledcolor = 0;
_arrowsdisabledcolor = 0;
RDebugUtils.currentLine=56033322;
 //BA.debugLineNum = 56033322;BA.debugLine="Public VisibleRowIds As List";
_visiblerowids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56033323;
 //BA.debugLineNum = 56033323;BA.debugLine="Public SelectionColor As Int";
_selectioncolor = 0;
RDebugUtils.currentLine=56033324;
 //BA.debugLineNum = 56033324;BA.debugLine="Private SQLTableName As String = \"data\"";
_sqltablename = "data";
RDebugUtils.currentLine=56033325;
 //BA.debugLineNum = 56033325;BA.debugLine="Public StringMoreAvailable As String = \"(more ava";
_stringmoreavailable = "(more available)";
RDebugUtils.currentLine=56033326;
 //BA.debugLineNum = 56033326;BA.debugLine="Public StringNoMatches As String = \"No matches\"";
_stringnomatches = "No matches";
RDebugUtils.currentLine=56033327;
 //BA.debugLineNum = 56033327;BA.debugLine="Public StringOutOf As String = \"out of\"";
_stringoutof = "out of";
RDebugUtils.currentLine=56033328;
 //BA.debugLineNum = 56033328;BA.debugLine="Public StringTo As String = \"to\"";
_stringto = "to";
RDebugUtils.currentLine=56033329;
 //BA.debugLineNum = 56033329;BA.debugLine="Public MaximumRowsPerPage As Int";
_maximumrowsperpage = 0;
RDebugUtils.currentLine=56033330;
 //BA.debugLineNum = 56033330;BA.debugLine="Public PrefixSearch As Boolean";
_prefixsearch = false;
RDebugUtils.currentLine=56033335;
 //BA.debugLineNum = 56033335;BA.debugLine="Private LastBaseHeight As Int";
_lastbaseheight = 0;
RDebugUtils.currentLine=56033336;
 //BA.debugLineNum = 56033336;BA.debugLine="Public NumberOfFrozenColumns As Int";
_numberoffrozencolumns = 0;
RDebugUtils.currentLine=56033337;
 //BA.debugLineNum = 56033337;BA.debugLine="Private LastCellClickEvent As Long";
_lastcellclickevent = 0L;
RDebugUtils.currentLine=56033341;
 //BA.debugLineNum = 56033341;BA.debugLine="Public SearchVisible As Boolean";
_searchvisible = false;
RDebugUtils.currentLine=56033343;
 //BA.debugLineNum = 56033343;BA.debugLine="End Sub";
return "";
}
public void  _clear(b4a.example.ef.b4xtable __ref) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "clear", true))
	 {Debug.delegate(ba, "clear", null); return;}
ResumableSub_Clear rsub = new ResumableSub_Clear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Clear extends BA.ResumableSub {
public ResumableSub_Clear(b4a.example.ef.b4xtable parent,b4a.example.ef.b4xtable __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.b4xtable __ref;
b4a.example.ef.b4xtable parent;
anywheresoftware.b4a.sql.SQL _oldsql = null;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
anywheresoftware.b4a.BA.IterableList group4;
int index4;
int groupLen4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56295425;
 //BA.debugLineNum = 56295425;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=56295426;
 //BA.debugLineNum = 56295426;BA.debugLine="Dim OldSQL As SQL = sql1";
_oldsql = __ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=56295427;
 //BA.debugLineNum = 56295427;BA.debugLine="Dim sql1 As SQL";
parent._sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=56295428;
 //BA.debugLineNum = 56295428;BA.debugLine="For Each c As B4XTableColumn In Columns";
if (true) break;

case 1:
//for
this.state = 8;
group4 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
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
RDebugUtils.currentLine=56295429;
 //BA.debugLineNum = 56295429;BA.debugLine="If c.Panel.IsInitialized And c.Panel.Parent.IsIn";
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
RDebugUtils.currentLine=56295430;
 //BA.debugLineNum = 56295430;BA.debugLine="c.Panel.RemoveViewFromParent";
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
RDebugUtils.currentLine=56295433;
 //BA.debugLineNum = 56295433;BA.debugLine="VisibleColumns.Clear";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=56295434;
 //BA.debugLineNum = 56295434;BA.debugLine="Columns.Clear";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=56295435;
 //BA.debugLineNum = 56295435;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=56295436;
 //BA.debugLineNum = 56295436;BA.debugLine="If clvData.IsInitialized Then";
if (true) break;

case 9:
//if
this.state = 12;
if (__ref._clvdata /*b4a.example3.customlistview*/ .IsInitialized()) { 
this.state = 11;
}if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=56295437;
 //BA.debugLineNum = 56295437;BA.debugLine="clvData.Clear";
__ref._clvdata /*b4a.example3.customlistview*/ ._clear();
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=56295439;
 //BA.debugLineNum = 56295439;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=56295440;
 //BA.debugLineNum = 56295440;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=56295441;
 //BA.debugLineNum = 56295441;BA.debugLine="If OldSQL.IsInitialized Then";
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
RDebugUtils.currentLine=56295442;
 //BA.debugLineNum = 56295442;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "clear"),(int) (1000));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=56295443;
 //BA.debugLineNum = 56295443;BA.debugLine="If OldSQL.IsInitialized Then";
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
RDebugUtils.currentLine=56295444;
 //BA.debugLineNum = 56295444;BA.debugLine="OldSQL.Close";
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
RDebugUtils.currentLine=56295447;
 //BA.debugLineNum = 56295447;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _clearnavigationstate(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "clearnavigationstate", true))
	 {return ((String) Debug.delegate(ba, "clearnavigationstate", null));}
RDebugUtils.currentLine=56360960;
 //BA.debugLineNum = 56360960;BA.debugLine="Private Sub ClearNavigationState";
RDebugUtils.currentLine=56360961;
 //BA.debugLineNum = 56360961;BA.debugLine="If lblNext.IsInitialized = False Then Return";
if (__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=56360962;
 //BA.debugLineNum = 56360962;BA.debugLine="SetPageLabelState(lblNext, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=56360963;
 //BA.debugLineNum = 56360963;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=56360964;
 //BA.debugLineNum = 56360964;BA.debugLine="SetPageLabelState(lblBack, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=56360965;
 //BA.debugLineNum = 56360965;BA.debugLine="SetPageLabelState(lblFirst, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=56360966;
 //BA.debugLineNum = 56360966;BA.debugLine="lblFromTo.Text = \"\"";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=56360967;
 //BA.debugLineNum = 56360967;BA.debugLine="lblNumber.Text = \"\"";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=56360968;
 //BA.debugLineNum = 56360968;BA.debugLine="End Sub";
return "";
}
public String  _cleardataview(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cleardataview", true))
	 {return ((String) Debug.delegate(ba, "cleardataview", null));}
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Public Sub ClearDataView";
RDebugUtils.currentLine=57147393;
 //BA.debugLineNum = 57147393;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=57147395;
 //BA.debugLineNum = 57147395;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=57147396;
 //BA.debugLineNum = 57147396;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=57147397;
 //BA.debugLineNum = 57147397;BA.debugLine="End Sub";
return "";
}
public String  _updatedata(b4a.example.ef.b4xtable __ref,boolean _dontsleep) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatedata", true))
	 {return ((String) Debug.delegate(ba, "updatedata", new Object[] {_dontsleep}));}
Object[] _o = null;
RDebugUtils.currentLine=56950784;
 //BA.debugLineNum = 56950784;BA.debugLine="Private Sub UpdateData (DontSleep As Boolean)";
RDebugUtils.currentLine=56950785;
 //BA.debugLineNum = 56950785;BA.debugLine="If sql1.IsInitialized = False Then Return";
if (__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=56950786;
 //BA.debugLineNum = 56950786;BA.debugLine="Dim o() As Object = BuildQuery(True)";
_o = __ref._buildquery /*Object[]*/ (null,__c.True);
RDebugUtils.currentLine=56950788;
 //BA.debugLineNum = 56950788;BA.debugLine="ImplUpdateDataFromQuery (o(0), o(1), o(2), DontSl";
__ref._implupdatedatafromquery /*void*/ (null,BA.ObjectToString(_o[(int) (0)]),_o[(int) (1)],(int)(BA.ObjectToNumber(_o[(int) (2)])),_dontsleep);
RDebugUtils.currentLine=56950789;
 //BA.debugLineNum = 56950789;BA.debugLine="End Sub";
return "";
}
public String  _setpagelabelstate(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setpagelabelstate", true))
	 {return ((String) Debug.delegate(ba, "setpagelabelstate", new Object[] {_lbl,_enabled}));}
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Private Sub SetPageLabelState (lbl As B4XView, ena";
RDebugUtils.currentLine=57475073;
 //BA.debugLineNum = 57475073;BA.debugLine="If lbl.Tag = enabled Then Return";
if ((_lbl.getTag()).equals((Object)(_enabled))) { 
if (true) return "";};
RDebugUtils.currentLine=57475074;
 //BA.debugLineNum = 57475074;BA.debugLine="lbl.Tag = enabled";
_lbl.setTag((Object)(_enabled));
RDebugUtils.currentLine=57475075;
 //BA.debugLineNum = 57475075;BA.debugLine="If enabled Then";
if (_enabled) { 
RDebugUtils.currentLine=57475076;
 //BA.debugLineNum = 57475076;BA.debugLine="lbl.TextColor = ArrowsEnabledColor";
_lbl.setTextColor(__ref._arrowsenabledcolor /*int*/ );
 }else {
RDebugUtils.currentLine=57475078;
 //BA.debugLineNum = 57475078;BA.debugLine="lbl.TextColor = ArrowsDisabledColor";
_lbl.setTextColor(__ref._arrowsdisabledcolor /*int*/ );
 };
RDebugUtils.currentLine=57475080;
 //BA.debugLineNum = 57475080;BA.debugLine="End Sub";
return "";
}
public String  _columntosqltype(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "columntosqltype", true))
	 {return ((String) Debug.delegate(ba, "columntosqltype", new Object[] {_c}));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Private Sub ColumnToSQLType (c As B4XTableColumn)";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="If c.ColumnType = COLUMN_TYPE_TEXT Then Return \"T";
if (_c.ColumnType /*int*/ ==__ref._column_type_text /*int*/ ) { 
if (true) return "TEXT";}
else {
if (true) return "INTEGER";};
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createcellviews(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createcellviews", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "createcellviews", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl = null;
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Private Sub CreateCellViews As B4XView";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"cell\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"cell");
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=58130435;
 //BA.debugLineNum = 58130435;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=58130436;
 //BA.debugLineNum = 58130436;BA.debugLine="SetMouseTransparent(lbl)";
__ref._setmousetransparent /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
RDebugUtils.currentLine=58130437;
 //BA.debugLineNum = 58130437;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=58130438;
 //BA.debugLineNum = 58130438;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=58130439;
 //BA.debugLineNum = 58130439;BA.debugLine="p.AddView(xlbl, 0, 0, 0, 0)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=58130440;
 //BA.debugLineNum = 58130440;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=58130441;
 //BA.debugLineNum = 58130441;BA.debugLine="End Sub";
return null;
}
public String  _setmousetransparent(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setmousetransparent", true))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_lbl}));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Private Sub SetMouseTransparent (lbl As B4XView) '";
RDebugUtils.currentLine=58458117;
 //BA.debugLineNum = 58458117;BA.debugLine="End Sub";
return "";
}
public String  _createdataview(b4a.example.ef.b4xtable __ref,String _whereclause) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createdataview", true))
	 {return ((String) Debug.delegate(ba, "createdataview", new Object[] {_whereclause}));}
RDebugUtils.currentLine=57081856;
 //BA.debugLineNum = 57081856;BA.debugLine="Public Sub CreateDataView (WhereClause As String)";
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="sql1.ExecNonQuery(\"DROP VIEW IF EXISTS TempView\")";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP VIEW IF EXISTS TempView");
RDebugUtils.currentLine=57081858;
 //BA.debugLineNum = 57081858;BA.debugLine="sql1.ExecNonQuery(\"CREATE VIEW TempView AS SELECT";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE VIEW TempView AS SELECT *, rowid FROM data WHERE "+_whereclause);
RDebugUtils.currentLine=57081859;
 //BA.debugLineNum = 57081859;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM TempView")));
RDebugUtils.currentLine=57081860;
 //BA.debugLineNum = 57081860;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=57081861;
 //BA.debugLineNum = 57081861;BA.debugLine="SQLTableName = \"TempView\"";
__ref._sqltablename /*String*/  = "TempView";
RDebugUtils.currentLine=57081862;
 //BA.debugLineNum = 57081862;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=57081863;
 //BA.debugLineNum = 57081863;BA.debugLine="End Sub";
return "";
}
public String  _createtable(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((String) Debug.delegate(ba, "createtable", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _column = null;
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Private Sub CreateTable";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="sb.Append(\"CREATE TABLE data (\")";
_sb.Append("CREATE TABLE data (");
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=57999365;
 //BA.debugLineNum = 57999365;BA.debugLine="For Each Column As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_column = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=57999366;
 //BA.debugLineNum = 57999366;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (_column.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=57999367;
 //BA.debugLineNum = 57999367;BA.debugLine="Column.SQLID = \"c\" & i";
_column.SQLID /*String*/  = "c"+BA.NumberToString(_i);
RDebugUtils.currentLine=57999368;
 //BA.debugLineNum = 57999368;BA.debugLine="sb.Append(Column.SQLID & \" \" & ColumnToSQLType(C";
_sb.Append(_column.SQLID /*String*/ +" "+__ref._columntosqltype /*String*/ (null,_column)+",");
RDebugUtils.currentLine=57999369;
 //BA.debugLineNum = 57999369;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=57999371;
 //BA.debugLineNum = 57999371;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=57999372;
 //BA.debugLineNum = 57999372;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=57999373;
 //BA.debugLineNum = 57999373;BA.debugLine="sql1.ExecNonQuery(sb.ToString)";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=57999374;
 //BA.debugLineNum = 57999374;BA.debugLine="End Sub";
return "";
}
public void  _designercreateview(b4a.example.ef.b4xtable __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "designercreateview", true))
	 {Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}); return;}
ResumableSub_DesignerCreateView rsub = new ResumableSub_DesignerCreateView(this,__ref,_base,_lbl,_props);
rsub.resume(ba, null);
}
public static class ResumableSub_DesignerCreateView extends BA.ResumableSub {
public ResumableSub_DesignerCreateView(b4a.example.ef.b4xtable parent,b4a.example.ef.b4xtable __ref,Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) {
this.parent = parent;
this.__ref = __ref;
this._base = _base;
this._lbl = _lbl;
this._props = _props;
this.__ref = parent;
}
b4a.example.ef.b4xtable __ref;
b4a.example.ef.b4xtable parent;
Object _base;
anywheresoftware.b4a.objects.LabelWrapper _lbl;
anywheresoftware.b4a.objects.collections.Map _props;
anywheresoftware.b4j.object.JavaObject _jo = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=56164353;
 //BA.debugLineNum = 56164353;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=56164354;
 //BA.debugLineNum = 56164354;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=56164355;
 //BA.debugLineNum = 56164355;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=56164355;
 //BA.debugLineNum = 56164355;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent);
RDebugUtils.currentLine=56164356;
 //BA.debugLineNum = 56164356;BA.debugLine="LayoutLoaded = False";
__ref._layoutloaded /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=56164357;
 //BA.debugLineNum = 56164357;BA.debugLine="EvenRowColor = xui.PaintOrColorToColor(Props.Get(";
__ref._evenrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("EvenRowColor")));
RDebugUtils.currentLine=56164358;
 //BA.debugLineNum = 56164358;BA.debugLine="OddRowColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._oddrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OddRowColor")));
RDebugUtils.currentLine=56164359;
 //BA.debugLineNum = 56164359;BA.debugLine="HeaderTextColor = xui.PaintOrColorToColor(Props.G";
__ref._headertextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderTextColor")));
RDebugUtils.currentLine=56164360;
 //BA.debugLineNum = 56164360;BA.debugLine="TextColor = xui.PaintOrColorToColor(Props.Get(\"Te";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=56164361;
 //BA.debugLineNum = 56164361;BA.debugLine="HeaderColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=56164362;
 //BA.debugLineNum = 56164362;BA.debugLine="GridColor = xui.PaintOrColorToColor(Props.Get(\"Gr";
__ref._gridcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("GridColor")));
RDebugUtils.currentLine=56164363;
 //BA.debugLineNum = 56164363;BA.debugLine="SelectionColor = xui.PaintOrColorToColor(Props.Ge";
__ref._selectioncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectionColor")));
RDebugUtils.currentLine=56164364;
 //BA.debugLineNum = 56164364;BA.debugLine="HighlightTextColor = xui.PaintOrColorToColor(Prop";
__ref._highlighttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("HighlightTextColor"),(Object)(((int)0xffff0000))));
RDebugUtils.currentLine=56164365;
 //BA.debugLineNum = 56164365;BA.debugLine="SearchVisible = Props.GetDefault(\"SearchVisible\",";
__ref._searchvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SearchVisible"),(Object)(parent.__c.True)));
RDebugUtils.currentLine=56164366;
 //BA.debugLineNum = 56164366;BA.debugLine="If Bit.And(SelectionColor, 0xff000000) = 0 Then S";
if (true) break;

case 1:
//if
this.state = 6;
if (parent.__c.Bit.And(__ref._selectioncolor /*int*/ ,((int)0xff000000))==0) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
__ref._selectioncolor /*int*/  = (int) (0);
if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=56164367;
 //BA.debugLineNum = 56164367;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "designercreateview"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=56164368;
 //BA.debugLineNum = 56164368;BA.debugLine="mBase.LoadLayout(\"B4XTable\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XTable",ba);
RDebugUtils.currentLine=56164369;
 //BA.debugLineNum = 56164369;BA.debugLine="SearchField.mBase.Visible = False";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=56164370;
 //BA.debugLineNum = 56164370;BA.debugLine="SearchField.LargeLabelTextSize = 14";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._largelabeltextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=56164371;
 //BA.debugLineNum = 56164371;BA.debugLine="SearchField.SmallLabelTextSize = 8";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._smalllabeltextsize /*float*/  = (float) (8);
RDebugUtils.currentLine=56164372;
 //BA.debugLineNum = 56164372;BA.debugLine="SearchField.Update";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=56164374;
 //BA.debugLineNum = 56164374;BA.debugLine="Dim jo As JavaObject = SearchField.TextField";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=56164375;
 //BA.debugLineNum = 56164375;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(6, 0x1";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(parent.__c.Bit.Or((int) (6),((int)0x10000000)))});
RDebugUtils.currentLine=56164380;
 //BA.debugLineNum = 56164380;BA.debugLine="SetMouseTransparent(lblSort)";
__ref._setmousetransparent /*String*/ (null,__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=56164381;
 //BA.debugLineNum = 56164381;BA.debugLine="clvData.AsView.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().SetColorAndBorder((int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=56164382;
 //BA.debugLineNum = 56164382;BA.debugLine="clvData.sv.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder((int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=56164383;
 //BA.debugLineNum = 56164383;BA.debugLine="lblNumber.TextColor = ArrowsEnabledColor";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._arrowsenabledcolor /*int*/ );
RDebugUtils.currentLine=56164384;
 //BA.debugLineNum = 56164384;BA.debugLine="LayoutLoaded = True";
__ref._layoutloaded /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=56164385;
 //BA.debugLineNum = 56164385;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=56164386;
 //BA.debugLineNum = 56164386;BA.debugLine="Refresh2 (True, False)";
__ref._refresh2 /*String*/ (null,parent.__c.True,parent.__c.False);
RDebugUtils.currentLine=56164387;
 //BA.debugLineNum = 56164387;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.b4xtable._b4xtablecolumn  _getcolumn(b4a.example.ef.b4xtable __ref,String _columnid) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getcolumn", true))
	 {return ((b4a.example.ef.b4xtable._b4xtablecolumn) Debug.delegate(ba, "getcolumn", new Object[] {_columnid}));}
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Public Sub GetColumn (ColumnId As String) As B4XTa";
RDebugUtils.currentLine=57409537;
 //BA.debugLineNum = 57409537;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="If c.Id = ColumnId Then Return c";
if ((_c.Id /*String*/ ).equals(_columnid)) { 
if (true) return _c;};
 }
};
RDebugUtils.currentLine=57409540;
 //BA.debugLineNum = 57409540;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=57409541;
 //BA.debugLineNum = 57409541;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentpage(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getcurrentpage", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentpage", null));}
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Public Sub getCurrentPage As Int";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="Return mCurrentPage";
if (true) return __ref._mcurrentpage /*int*/ ;
RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="End Sub";
return 0;
}
public int  _getfirstrowindex(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getfirstrowindex", true))
	 {return ((Integer) Debug.delegate(ba, "getfirstrowindex", null));}
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Public Sub getFirstRowIndex As Int";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="Return mFirstRowIndex";
if (true) return __ref._mfirstrowindex /*int*/ ;
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="End Sub";
return 0;
}
public int  _getrowsperpage(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getrowsperpage", true))
	 {return ((Integer) Debug.delegate(ba, "getrowsperpage", null));}
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Public Sub getRowsPerPage As Int";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="Return mRowsPerPage";
if (true) return __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="End Sub";
return 0;
}
public int  _getsize(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="Return CountAll";
if (true) return __ref._countall /*int*/ ;
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="End Sub";
return 0;
}
public String  _updatesorticon(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesorticon", true))
	 {return ((String) Debug.delegate(ba, "updatesorticon", null));}
b4a.example.ef.b4xtable._b4xtablecolumn _col = null;
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Private Sub UpdateSortIcon";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="For Each col As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="If col.InternalSortMode <> \"\" Then";
if ((_col.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=58720259;
 //BA.debugLineNum = 58720259;BA.debugLine="If lblSort.Parent <> col.Panel Then";
if ((__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false) { 
RDebugUtils.currentLine=58720260;
 //BA.debugLineNum = 58720260;BA.debugLine="lblSort.RemoveViewFromParent";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=58720261;
 //BA.debugLineNum = 58720261;BA.debugLine="col.Panel.AddView(lblSort, 0, 0, lblSort.Width";
_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (0));
 };
RDebugUtils.currentLine=58720263;
 //BA.debugLineNum = 58720263;BA.debugLine="lblSort.Top = 0";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=58720264;
 //BA.debugLineNum = 58720264;BA.debugLine="lblSort.Height = HeadersHeight";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._headersheight /*int*/ );
RDebugUtils.currentLine=58720265;
 //BA.debugLineNum = 58720265;BA.debugLine="lblSort.Left = col.Panel.Width - lblSort.Width";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=58720266;
 //BA.debugLineNum = 58720266;BA.debugLine="lblSort.Visible = True";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=58720267;
 //BA.debugLineNum = 58720267;BA.debugLine="If col.InternalSortMode = \"ASC\" Then lblSort.Te";
if ((_col.InternalSortMode /*String*/ ).equals("ASC")) { 
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf0de))));}
else {
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf0dd))));};
RDebugUtils.currentLine=58720268;
 //BA.debugLineNum = 58720268;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=58720271;
 //BA.debugLineNum = 58720271;BA.debugLine="lblSort.Visible = False";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=58720272;
 //BA.debugLineNum = 58720272;BA.debugLine="End Sub";
return "";
}
public void  _implupdatedatafromquery(b4a.example.ef.b4xtable __ref,String _query,Object _args,int _totalcount,boolean _dontsleep) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "implupdatedatafromquery", true))
	 {Debug.delegate(ba, "implupdatedatafromquery", new Object[] {_query,_args,_totalcount,_dontsleep}); return;}
ResumableSub_ImplUpdateDataFromQuery rsub = new ResumableSub_ImplUpdateDataFromQuery(this,__ref,_query,_args,_totalcount,_dontsleep);
rsub.resume(ba, null);
}
public static class ResumableSub_ImplUpdateDataFromQuery extends BA.ResumableSub {
public ResumableSub_ImplUpdateDataFromQuery(b4a.example.ef.b4xtable parent,b4a.example.ef.b4xtable __ref,String _query,Object _args,int _totalcount,boolean _dontsleep) {
this.parent = parent;
this.__ref = __ref;
this._query = _query;
this._args = _args;
this._totalcount = _totalcount;
this._dontsleep = _dontsleep;
this.__ref = parent;
}
b4a.example.ef.b4xtable __ref;
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
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=57278465;
 //BA.debugLineNum = 57278465;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=57278466;
 //BA.debugLineNum = 57278466;BA.debugLine="If mRowsPerPage = 0 Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (__ref._mrowsperpage /*int*/ ==0) { 
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
RDebugUtils.currentLine=57278468;
 //BA.debugLineNum = 57278468;BA.debugLine="Dim MyIndex As Int = SQLIndex";
_myindex = __ref._sqlindex /*int*/ ;
RDebugUtils.currentLine=57278469;
 //BA.debugLineNum = 57278469;BA.debugLine="If DontSleep = False Then";
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
RDebugUtils.currentLine=57278470;
 //BA.debugLineNum = 57278470;BA.debugLine="Sleep(40)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "implupdatedatafromquery"),(int) (40));
this.state = 71;
return;
case 71:
//C
this.state = 10;
;
 if (true) break;
;
RDebugUtils.currentLine=57278472;
 //BA.debugLineNum = 57278472;BA.debugLine="If MyIndex <> SQLIndex Then";

case 10:
//if
this.state = 13;
if (_myindex!=__ref._sqlindex /*int*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=57278473;
 //BA.debugLineNum = 57278473;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=57278475;
 //BA.debugLineNum = 57278475;BA.debugLine="VisibleRowIds.Clear";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=57278477;
 //BA.debugLineNum = 57278477;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(Query, Args";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2(_query,(String[])(_args))));
RDebugUtils.currentLine=57278478;
 //BA.debugLineNum = 57278478;BA.debugLine="Dim success As Boolean = True";
_success = parent.__c.True;
RDebugUtils.currentLine=57278482;
 //BA.debugLineNum = 57278482;BA.debugLine="If success Then";
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
RDebugUtils.currentLine=57278483;
 //BA.debugLineNum = 57278483;BA.debugLine="Dim RowNumber As Int = 1";
_rownumber = (int) (1);
RDebugUtils.currentLine=57278484;
 //BA.debugLineNum = 57278484;BA.debugLine="Do While RowNumber <= mRowsPerPage And rs.NextRo";
if (true) break;

case 17:
//do while
this.state = 32;
while (_rownumber<=__ref._mrowsperpage /*int*/  && _rs.NextRow()) {
this.state = 19;
if (true) break;
}
if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=57278485;
 //BA.debugLineNum = 57278485;BA.debugLine="VisibleRowIds.Add(rs.GetLong(\"rowid\"))";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetLong("rowid")));
RDebugUtils.currentLine=57278486;
 //BA.debugLineNum = 57278486;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 20:
//for
this.state = 31;
group17 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
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
RDebugUtils.currentLine=57278487;
 //BA.debugLineNum = 57278487;BA.debugLine="Dim lbl As B4XView = GetLabelFromColumn(c, Row";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_rownumber);
RDebugUtils.currentLine=57278488;
 //BA.debugLineNum = 57278488;BA.debugLine="Select c.ColumnType";
if (true) break;

case 23:
//select
this.state = 30;
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,__ref._column_type_text /*int*/ ,__ref._column_type_numbers /*int*/ ,__ref._column_type_date /*int*/ )) {
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
RDebugUtils.currentLine=57278490;
 //BA.debugLineNum = 57278490;BA.debugLine="SetTextToCell(rs.GetString(c.SQLID), lbl, c.";
__ref._settexttocell /*String*/ (null,_rs.GetString(_c.SQLID /*String*/ ),_lbl,_c.Searchable /*boolean*/ );
 if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=57278492;
 //BA.debugLineNum = 57278492;BA.debugLine="c.Formatter.FormatLabel(rs.GetDouble(c.SQLID";
_c.Formatter /*b4a.example.ef.b4xformatter*/ ._formatlabel /*String*/ (null,_rs.GetDouble(_c.SQLID /*String*/ ),_lbl);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=57278494;
 //BA.debugLineNum = 57278494;BA.debugLine="lbl.Text = DateTime.Date(rs.GetLong(c.SQLID)";
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
RDebugUtils.currentLine=57278497;
 //BA.debugLineNum = 57278497;BA.debugLine="RowNumber = RowNumber + 1";
_rownumber = (int) (_rownumber+1);
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=57278499;
 //BA.debugLineNum = 57278499;BA.debugLine="Dim AreThereMoreResults As Boolean = RowNumber =";
_aretheremoreresults = _rownumber==__ref._mrowsperpage /*int*/ +1 && _rs.NextRow();
RDebugUtils.currentLine=57278500;
 //BA.debugLineNum = 57278500;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=57278501;
 //BA.debugLineNum = 57278501;BA.debugLine="For i = RowNumber To mRowsPerPage";
if (true) break;

case 33:
//for
this.state = 40;
step32 = 1;
limit32 = __ref._mrowsperpage /*int*/ ;
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
RDebugUtils.currentLine=57278502;
 //BA.debugLineNum = 57278502;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
if (true) break;

case 36:
//for
this.state = 39;
group33 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
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
RDebugUtils.currentLine=57278506;
 //BA.debugLineNum = 57278506;BA.debugLine="GetLabelFromColumn(c, i).Text = \"\"";
__ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_i).setText(BA.ObjectToCharSequence(""));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 75;
;
RDebugUtils.currentLine=57278509;
 //BA.debugLineNum = 57278509;BA.debugLine="VisibleRowIds.Add(0)";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=57278511;
 //BA.debugLineNum = 57278511;BA.debugLine="mLastRowIndex = mFirstRowIndex - 2 + RowNumber";
__ref._mlastrowindex /*int*/  = (int) (__ref._mfirstrowindex /*int*/ -2+_rownumber);
RDebugUtils.currentLine=57278512;
 //BA.debugLineNum = 57278512;BA.debugLine="SetPageLabelState(lblLast, TotalCount >= 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_totalcount>=0);
RDebugUtils.currentLine=57278513;
 //BA.debugLineNum = 57278513;BA.debugLine="If TotalCount >= 0 Then";
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
RDebugUtils.currentLine=57278514;
 //BA.debugLineNum = 57278514;BA.debugLine="If TotalCount = 0 Then";
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
RDebugUtils.currentLine=57278515;
 //BA.debugLineNum = 57278515;BA.debugLine="lblFromTo.Text = \"\"";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=57278517;
 //BA.debugLineNum = 57278517;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringoutof /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,_totalcount)))+"")));
 if (true) break;

case 49:
//C
this.state = 64;
;
RDebugUtils.currentLine=57278519;
 //BA.debugLineNum = 57278519;BA.debugLine="SetPageLabelState(lblNext, mLastRowIndex < Tota";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mlastrowindex /*int*/ <_totalcount-1);
RDebugUtils.currentLine=57278520;
 //BA.debugLineNum = 57278520;BA.debugLine="SetPageLabelState(lblLast, lblNext.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=57278522;
 //BA.debugLineNum = 57278522;BA.debugLine="If mLastRowIndex = -1 Then";
if (true) break;

case 52:
//if
this.state = 63;
if (__ref._mlastrowindex /*int*/ ==-1) { 
this.state = 54;
}else {
this.state = 56;
}if (true) break;

case 54:
//C
this.state = 63;
RDebugUtils.currentLine=57278523;
 //BA.debugLineNum = 57278523;BA.debugLine="lblFromTo.Text = StringNoMatches";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._stringnomatches /*String*/ ));
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=57278525;
 //BA.debugLineNum = 57278525;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+"")));
RDebugUtils.currentLine=57278526;
 //BA.debugLineNum = 57278526;BA.debugLine="If AreThereMoreResults Then lblFromTo.Text = l";
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
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getText()+" "+__ref._stringmoreavailable /*String*/ ));
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
RDebugUtils.currentLine=57278528;
 //BA.debugLineNum = 57278528;BA.debugLine="SetPageLabelState(lblNext, AreThereMoreResults)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_aretheremoreresults);
RDebugUtils.currentLine=57278529;
 //BA.debugLineNum = 57278529;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,parent.__c.False);
 if (true) break;

case 64:
//C
this.state = 67;
;
RDebugUtils.currentLine=57278531;
 //BA.debugLineNum = 57278531;BA.debugLine="SetPageLabelState(lblBack, mFirstRowIndex > 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mfirstrowindex /*int*/ >0);
RDebugUtils.currentLine=57278532;
 //BA.debugLineNum = 57278532;BA.debugLine="SetPageLabelState(lblFirst, lblBack.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
RDebugUtils.currentLine=57278533;
 //BA.debugLineNum = 57278533;BA.debugLine="mCurrentPage = Ceil(mFirstRowIndex / mRowsPerPag";
__ref._mcurrentpage /*int*/  = (int) (parent.__c.Ceil(__ref._mfirstrowindex /*int*/ /(double)__ref._mrowsperpage /*int*/ )+1);
RDebugUtils.currentLine=57278534;
 //BA.debugLineNum = 57278534;BA.debugLine="lblNumber.Text = NumberFormat(mCurrentPage, 0, 0";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.NumberFormat(__ref._mcurrentpage /*int*/ ,(int) (0),(int) (0))));
RDebugUtils.currentLine=57278535;
 //BA.debugLineNum = 57278535;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=57278536;
 //BA.debugLineNum = 57278536;BA.debugLine="mCurrentCount = TotalCount";
__ref._mcurrentcount /*int*/  = _totalcount;
 if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=57278538;
 //BA.debugLineNum = 57278538;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("957278538",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
;
RDebugUtils.currentLine=57278540;
 //BA.debugLineNum = 57278540;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DataUp";

case 67:
//if
this.state = 70;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated",(int) (0))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=57278541;
 //BA.debugLineNum = 57278541;BA.debugLine="CallSub(mCallBack, mEventName & \"_DataUpdated\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated");
 if (true) break;

case 70:
//C
this.state = -1;
;
RDebugUtils.currentLine=57278543;
 //BA.debugLineNum = 57278543;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _settexttocell(b4a.example.ef.b4xtable __ref,String _text,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _searchable) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "settexttocell", true))
	 {return ((String) Debug.delegate(ba, "settexttocell", new Object[] {_text,_lbl,_searchable}));}
int _x = 0;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
RDebugUtils.currentLine=57344000;
 //BA.debugLineNum = 57344000;BA.debugLine="Private Sub SetTextToCell (Text As String, lbl As";
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="If Searchable = False Or HighlightSearchResults =";
if (_searchable==__c.False || __ref._highlightsearchresults /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 }else {
RDebugUtils.currentLine=57344010;
 //BA.debugLineNum = 57344010;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=57344011;
 //BA.debugLineNum = 57344011;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 }else {
RDebugUtils.currentLine=57344013;
 //BA.debugLineNum = 57344013;BA.debugLine="Dim x As Int = Text.ToLowerCase.IndexOf(FilterT";
_x = _text.toLowerCase().indexOf(__ref._filtertext /*String*/ );
RDebugUtils.currentLine=57344014;
 //BA.debugLineNum = 57344014;BA.debugLine="If x = -1 Or (PrefixSearch And x > 0) Then";
if (_x==-1 || (__ref._prefixsearch /*boolean*/  && _x>0)) { 
RDebugUtils.currentLine=57344015;
 //BA.debugLineNum = 57344015;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=57344016;
 //BA.debugLineNum = 57344016;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=57344020;
 //BA.debugLineNum = 57344020;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=57344021;
 //BA.debugLineNum = 57344021;BA.debugLine="cs.Initialize.Append(Text.SubString2(0, x)).Col";
_cs.Initialize().Append(BA.ObjectToCharSequence(_text.substring((int) (0),_x))).Color(__ref._highlighttextcolor /*int*/ ).Append(BA.ObjectToCharSequence(_text.substring(_x,(int) (_x+__ref._filtertext /*String*/ .length())))).Pop();
RDebugUtils.currentLine=57344022;
 //BA.debugLineNum = 57344022;BA.debugLine="cs.Append(Text.SubString(x + FilterText.Length)";
_cs.Append(BA.ObjectToCharSequence(_text.substring((int) (_x+__ref._filtertext /*String*/ .length()))));
RDebugUtils.currentLine=57344024;
 //BA.debugLineNum = 57344024;BA.debugLine="lbl.Text = cs";
_lbl.setText(BA.ObjectToCharSequence(_cs.getObject()));
 };
 };
RDebugUtils.currentLine=57344046;
 //BA.debugLineNum = 57344046;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=56098816;
 //BA.debugLineNum = 56098816;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=56098817;
 //BA.debugLineNum = 56098817;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=56098818;
 //BA.debugLineNum = 56098818;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=56098819;
 //BA.debugLineNum = 56098819;BA.debugLine="Columns.Initialize";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=56098820;
 //BA.debugLineNum = 56098820;BA.debugLine="DefaultFormatter.Initialize";
__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=56098821;
 //BA.debugLineNum = 56098821;BA.debugLine="DefaultDataFormatter.Initialize";
__ref._defaultdataformatter /*b4a.example.ef.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=56098822;
 //BA.debugLineNum = 56098822;BA.debugLine="VisibleColumns.Initialize";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=56098823;
 //BA.debugLineNum = 56098823;BA.debugLine="HeaderFont = xui.CreateDefaultBoldFont(15)";
__ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (15));
RDebugUtils.currentLine=56098824;
 //BA.debugLineNum = 56098824;BA.debugLine="LabelsFont = xui.CreateDefaultFont(15)";
__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15));
RDebugUtils.currentLine=56098825;
 //BA.debugLineNum = 56098825;BA.debugLine="ArrowsDisabledColor = 0xFFBBBBBB";
__ref._arrowsdisabledcolor /*int*/  = ((int)0xffbbbbbb);
RDebugUtils.currentLine=56098826;
 //BA.debugLineNum = 56098826;BA.debugLine="ArrowsEnabledColor = xui.Color_Black";
__ref._arrowsenabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=56098827;
 //BA.debugLineNum = 56098827;BA.debugLine="VisibleRowIds.Initialize";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=56098828;
 //BA.debugLineNum = 56098828;BA.debugLine="MinimumWidth = 140dip";
__ref._minimumwidth /*int*/  = __c.DipToCurrent((int) (140));
RDebugUtils.currentLine=56098829;
 //BA.debugLineNum = 56098829;BA.debugLine="RowHeight = 40dip";
__ref._rowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=56098830;
 //BA.debugLineNum = 56098830;BA.debugLine="HeadersHeight = 40dip";
__ref._headersheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=56098836;
 //BA.debugLineNum = 56098836;BA.debugLine="End Sub";
return "";
}
public String  _lbl_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbl_click", true))
	 {return ((String) Debug.delegate(ba, "lbl_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Private Sub lbl_Click";
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="CellClicked(lbl.Parent, False)";
__ref._cellclicked /*void*/ (null,_lbl.getParent(),__c.False);
RDebugUtils.currentLine=58195971;
 //BA.debugLineNum = 58195971;BA.debugLine="End Sub";
return "";
}
public String  _lbl_longclick(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbl_longclick", true))
	 {return ((String) Debug.delegate(ba, "lbl_longclick", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Private Sub lbl_LongClick";
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="CellClicked(lbl.Parent, True)";
__ref._cellclicked /*void*/ (null,_lbl.getParent(),__c.True);
RDebugUtils.currentLine=58261507;
 //BA.debugLineNum = 58261507;BA.debugLine="End Sub";
return "";
}
public String  _lblback_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblback_click", true))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Private Sub lblBack_Click";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="If lblBack.Tag = False Then Return";
if ((__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="setFirstRowIndex (mFirstRowIndex - mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ -__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=59244547;
 //BA.debugLineNum = 59244547;BA.debugLine="End Sub";
return "";
}
public String  _setfirstrowindex(b4a.example.ef.b4xtable __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setfirstrowindex", true))
	 {return ((String) Debug.delegate(ba, "setfirstrowindex", new Object[] {_row}));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Public Sub setFirstRowIndex (row As Int)";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="row = Max(0, Min(CountAll - 1, row))";
_row = (int) (__c.Max(0,__c.Min(__ref._countall /*int*/ -1,_row)));
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="mFirstRowIndex = row";
__ref._mfirstrowindex /*int*/  = _row;
RDebugUtils.currentLine=58851331;
 //BA.debugLineNum = 58851331;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=58851332;
 //BA.debugLineNum = 58851332;BA.debugLine="End Sub";
return "";
}
public String  _lblfirst_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblfirst_click", true))
	 {return ((String) Debug.delegate(ba, "lblfirst_click", null));}
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Private Sub lblFirst_Click";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="If lblFirst.Tag = False Then Return";
if ((__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="setFirstRowIndex (0)";
__ref._setfirstrowindex /*String*/ (null,(int) (0));
RDebugUtils.currentLine=59179011;
 //BA.debugLineNum = 59179011;BA.debugLine="End Sub";
return "";
}
public String  _lbllast_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbllast_click", true))
	 {return ((String) Debug.delegate(ba, "lbllast_click", null));}
int _numberofpages = 0;
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Private Sub lblLast_Click";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="If lblLast.Tag = False Then Return";
if ((__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="Dim NumberOfPages As Int = Ceil(mCurrentCount / m";
_numberofpages = (int) (__c.Ceil(__ref._mcurrentcount /*int*/ /(double)__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=59310083;
 //BA.debugLineNum = 59310083;BA.debugLine="setFirstRowIndex ((NumberOfPages - 1) * mRowsPerP";
__ref._setfirstrowindex /*String*/ (null,(int) ((_numberofpages-1)*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=59310084;
 //BA.debugLineNum = 59310084;BA.debugLine="End Sub";
return "";
}
public String  _lblnext_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblnext_click", true))
	 {return ((String) Debug.delegate(ba, "lblnext_click", null));}
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Private Sub lblNext_Click";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="If lblNext.Tag = False Then Return";
if ((__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="setFirstRowIndex (mFirstRowIndex + mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ +__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=59375619;
 //BA.debugLineNum = 59375619;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=56426496;
 //BA.debugLineNum = 56426496;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=56426497;
 //BA.debugLineNum = 56426497;BA.debugLine="Refresh2(True, False)";
__ref._refresh2 /*String*/ (null,__c.True,__c.False);
RDebugUtils.currentLine=56426498;
 //BA.debugLineNum = 56426498;BA.debugLine="End Sub";
return "";
}
public String  _resizecolumnimpl(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c,int _totalheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "resizecolumnimpl", true))
	 {return ((String) Debug.delegate(ba, "resizecolumnimpl", new Object[] {_c,_totalheight}));}
float _height = 0f;
int _topint = 0;
int _heightint = 0;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=56885248;
 //BA.debugLineNum = 56885248;BA.debugLine="Private Sub ResizeColumnImpl (c As B4XTableColumn,";
RDebugUtils.currentLine=56885249;
 //BA.debugLineNum = 56885249;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=56885251;
 //BA.debugLineNum = 56885251;BA.debugLine="Dim Height As Float = TotalHeight / mRowsPerPage";
_height = (float) (_totalheight/(double)__ref._mrowsperpage /*int*/ );
RDebugUtils.currentLine=56885252;
 //BA.debugLineNum = 56885252;BA.debugLine="If AllowSmallRowHeightModifications = False Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ==__c.False) { 
_height = (float) (__ref._rowheight /*int*/ );};
RDebugUtils.currentLine=56885253;
 //BA.debugLineNum = 56885253;BA.debugLine="Dim TopInt, HeightInt As Int";
_topint = 0;
_heightint = 0;
RDebugUtils.currentLine=56885254;
 //BA.debugLineNum = 56885254;BA.debugLine="For i = 0 To c.CellsLayouts.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=56885255;
 //BA.debugLineNum = 56885255;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=56885256;
 //BA.debugLineNum = 56885256;BA.debugLine="If i < mRowsPerPage + 1 Then";
if (_i<__ref._mrowsperpage /*int*/ +1) { 
RDebugUtils.currentLine=56885257;
 //BA.debugLineNum = 56885257;BA.debugLine="Dim HeightInt As Int = Round(Height * i + Heade";
_heightint = (int) (__c.Round(_height*_i+__ref._headersheight /*int*/ -_topint));
RDebugUtils.currentLine=56885258;
 //BA.debugLineNum = 56885258;BA.debugLine="If i = 0 Then HeightInt = HeadersHeight";
if (_i==0) { 
_heightint = __ref._headersheight /*int*/ ;};
RDebugUtils.currentLine=56885259;
 //BA.debugLineNum = 56885259;BA.debugLine="p.SetLayoutAnimated(0, 0, TopInt, c.ComputedWid";
_p.SetLayoutAnimated((int) (0),(int) (0),_topint,_c.ComputedWidth /*int*/ ,_heightint);
RDebugUtils.currentLine=56885260;
 //BA.debugLineNum = 56885260;BA.debugLine="p.Visible = True";
_p.setVisible(__c.True);
RDebugUtils.currentLine=56885261;
 //BA.debugLineNum = 56885261;BA.debugLine="If c.DisableAutoResizeLayout = False Then";
if (_c.DisableAutoResizeLayout /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=56885262;
 //BA.debugLineNum = 56885262;BA.debugLine="Dim lbl As B4XView = p.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView((int) (0));
RDebugUtils.currentLine=56885263;
 //BA.debugLineNum = 56885263;BA.debugLine="lbl.SetLayoutAnimated(0, 0, 0, p.Width, p.Heig";
_lbl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
 };
RDebugUtils.currentLine=56885270;
 //BA.debugLineNum = 56885270;BA.debugLine="TopInt = TopInt + HeightInt";
_topint = (int) (_topint+_heightint);
 }else {
RDebugUtils.currentLine=56885272;
 //BA.debugLineNum = 56885272;BA.debugLine="p.Visible = False";
_p.setVisible(__c.False);
 };
 }
};
RDebugUtils.currentLine=56885275;
 //BA.debugLineNum = 56885275;BA.debugLine="End Sub";
return "";
}
public String  _resizeandreorderclvitems(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "resizeandreorderclvitems", true))
	 {return ((String) Debug.delegate(ba, "resizeandreorderclvitems", null));}
int _i = 0;
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
int _clvindex = 0;
RDebugUtils.currentLine=56623104;
 //BA.debugLineNum = 56623104;BA.debugLine="Private Sub ResizeAndReorderCLVItems";
RDebugUtils.currentLine=56623105;
 //BA.debugLineNum = 56623105;BA.debugLine="Dim i As Int = NumberOfFrozenColumns";
_i = __ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=56623106;
 //BA.debugLineNum = 56623106;BA.debugLine="Do While i < VisibleColumns.Size";
while (_i<__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) {
RDebugUtils.currentLine=56623107;
 //BA.debugLineNum = 56623107;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=56623108;
 //BA.debugLineNum = 56623108;BA.debugLine="Dim CLVIndex As Int = i - NumberOfFrozenColumns";
_clvindex = (int) (_i-__ref._numberoffrozencolumns /*int*/ );
RDebugUtils.currentLine=56623109;
 //BA.debugLineNum = 56623109;BA.debugLine="If c <> clvData.GetValue(CLVIndex) Then";
if ((_c).equals((b4a.example.ef.b4xtable._b4xtablecolumn)(__ref._clvdata /*b4a.example3.customlistview*/ ._getvalue(_clvindex))) == false) { 
RDebugUtils.currentLine=56623110;
 //BA.debugLineNum = 56623110;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
RDebugUtils.currentLine=56623111;
 //BA.debugLineNum = 56623111;BA.debugLine="clvData.InsertAt(CLVIndex, c.Panel, c)";
__ref._clvdata /*b4a.example3.customlistview*/ ._insertat(_clvindex,_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
 }else {
RDebugUtils.currentLine=56623113;
 //BA.debugLineNum = 56623113;BA.debugLine="clvData.ResizeItem(CLVIndex, c.ComputedWidth)";
__ref._clvdata /*b4a.example3.customlistview*/ ._resizeitem(_clvindex,_c.ComputedWidth /*int*/ );
 };
RDebugUtils.currentLine=56623115;
 //BA.debugLineNum = 56623115;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=56623117;
 //BA.debugLineNum = 56623117;BA.debugLine="End Sub";
return "";
}
public String  _updatesearchfieldvisibility(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesearchfieldvisibility", true))
	 {return ((String) Debug.delegate(ba, "updatesearchfieldvisibility", null));}
RDebugUtils.currentLine=56688640;
 //BA.debugLineNum = 56688640;BA.debugLine="Private Sub UpdateSearchFieldVisibility";
RDebugUtils.currentLine=56688644;
 //BA.debugLineNum = 56688644;BA.debugLine="SearchField.mBase.Visible = SearchVisible And Cou";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._searchvisible /*boolean*/  && __ref._countall /*int*/ >0);
RDebugUtils.currentLine=56688645;
 //BA.debugLineNum = 56688645;BA.debugLine="End Sub";
return "";
}
public String  _refreshnow(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refreshnow", true))
	 {return ((String) Debug.delegate(ba, "refreshnow", null));}
RDebugUtils.currentLine=56492032;
 //BA.debugLineNum = 56492032;BA.debugLine="Public Sub RefreshNow";
RDebugUtils.currentLine=56492033;
 //BA.debugLineNum = 56492033;BA.debugLine="Refresh2(True, True)";
__ref._refresh2 /*String*/ (null,__c.True,__c.True);
RDebugUtils.currentLine=56492034;
 //BA.debugLineNum = 56492034;BA.debugLine="End Sub";
return "";
}
public void  _searchfield_textchanged(b4a.example.ef.b4xtable __ref,String _old,String _new) throws Exception{
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "searchfield_textchanged", true))
	 {Debug.delegate(ba, "searchfield_textchanged", new Object[] {_old,_new}); return;}
ResumableSub_SearchField_TextChanged rsub = new ResumableSub_SearchField_TextChanged(this,__ref,_old,_new);
rsub.resume(ba, null);
}
public static class ResumableSub_SearchField_TextChanged extends BA.ResumableSub {
public ResumableSub_SearchField_TextChanged(b4a.example.ef.b4xtable parent,b4a.example.ef.b4xtable __ref,String _old,String _new) {
this.parent = parent;
this.__ref = __ref;
this._old = _old;
this._new = _new;
this.__ref = parent;
}
b4a.example.ef.b4xtable __ref;
b4a.example.ef.b4xtable parent;
String _old;
String _new;
int _myindex = 0;
String _term = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="b4xtable";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="SearchIndex = SearchIndex + 1";
__ref._searchindex /*int*/  = (int) (__ref._searchindex /*int*/ +1);
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="Dim MyIndex As Int = SearchIndex";
_myindex = __ref._searchindex /*int*/ ;
RDebugUtils.currentLine=59441155;
 //BA.debugLineNum = 59441155;BA.debugLine="Sleep(SleepBeforeSearch)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "searchfield_textchanged"),__ref._sleepbeforesearch /*int*/ );
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=59441156;
 //BA.debugLineNum = 59441156;BA.debugLine="If MyIndex <> SearchIndex Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_myindex!=__ref._searchindex /*int*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=59441157;
 //BA.debugLineNum = 59441157;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=59441159;
 //BA.debugLineNum = 59441159;BA.debugLine="Dim term As String = New.ToLowerCase";
_term = _new.toLowerCase();
RDebugUtils.currentLine=59441160;
 //BA.debugLineNum = 59441160;BA.debugLine="If term = FilterText Then Return";
if (true) break;

case 5:
//if
this.state = 10;
if ((_term).equals(__ref._filtertext /*String*/ )) { 
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
RDebugUtils.currentLine=59441161;
 //BA.debugLineNum = 59441161;BA.debugLine="FilterText = term";
__ref._filtertext /*String*/  = _term;
RDebugUtils.currentLine=59441162;
 //BA.debugLineNum = 59441162;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=59441163;
 //BA.debugLineNum = 59441163;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=59441164;
 //BA.debugLineNum = 59441164;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _setcurrentpage(b4a.example.ef.b4xtable __ref,int _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setcurrentpage", true))
	 {return ((String) Debug.delegate(ba, "setcurrentpage", new Object[] {_p}));}
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Public Sub setCurrentPage(p As Int)";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="setFirstRowIndex((p - 1) * mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) ((_p-1)*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="End Sub";
return "";
}
public String  _updatetablecounters(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatetablecounters", true))
	 {return ((String) Debug.delegate(ba, "updatetablecounters", null));}
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Public Sub UpdateTableCounters";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=57212931;
 //BA.debugLineNum = 57212931;BA.debugLine="End Sub";
return "";
}
}