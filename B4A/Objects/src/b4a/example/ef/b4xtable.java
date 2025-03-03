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
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Public Sub GetRow(RowId As Long) As Map";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(\"SELECT * F";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2("SELECT * FROM data WHERE rowid = ?",new String[]{BA.NumberToString(_rowid)})));
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="If rs.NextRow Then";
if (_rs.NextRow()) { 
RDebugUtils.currentLine=38862853;
 //BA.debugLineNum = 38862853;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=38862854;
 //BA.debugLineNum = 38862854;BA.debugLine="Select c.ColumnType";
switch (BA.switchObjectToInt(_c.ColumnType /*int*/ ,__ref._column_type_text /*int*/ ,__ref._column_type_numbers /*int*/ ,__ref._column_type_date /*int*/ )) {
case 0: {
RDebugUtils.currentLine=38862856;
 //BA.debugLineNum = 38862856;BA.debugLine="m.Put(c.Id, rs.GetString(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetString(_c.SQLID /*String*/ )));
 break; }
case 1: {
RDebugUtils.currentLine=38862858;
 //BA.debugLineNum = 38862858;BA.debugLine="m.Put(c.Id, rs.GetDouble(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetDouble(_c.SQLID /*String*/ )));
 break; }
case 2: {
RDebugUtils.currentLine=38862860;
 //BA.debugLineNum = 38862860;BA.debugLine="m.Put(c.Id, rs.GetLong(c.SQLID))";
_m.Put((Object)(_c.Id /*String*/ ),(Object)(_rs.GetLong(_c.SQLID /*String*/ )));
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=38862864;
 //BA.debugLineNum = 38862864;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=38862865;
 //BA.debugLineNum = 38862865;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=38862866;
 //BA.debugLineNum = 38862866;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="If sql1.IsInitialized Then sql1.Close";
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
RDebugUtils.currentLine=38010885;
 //BA.debugLineNum = 38010885;BA.debugLine="sql1.Initialize(\"\", \":memory:\", True)";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .Initialize("",":memory:",parent.__c.True);
RDebugUtils.currentLine=38010887;
 //BA.debugLineNum = 38010887;BA.debugLine="CreateTable";
__ref._createtable /*String*/ (null);
RDebugUtils.currentLine=38010888;
 //BA.debugLineNum = 38010888;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=38010889;
 //BA.debugLineNum = 38010889;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=38010890;
 //BA.debugLineNum = 38010890;BA.debugLine="sb.Append(\"INSERT INTO data VALUES (\")";
_sb.Append("INSERT INTO data VALUES (");
RDebugUtils.currentLine=38010891;
 //BA.debugLineNum = 38010891;BA.debugLine="For Each Column As B4XTableColumn In Columns";
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
RDebugUtils.currentLine=38010892;
 //BA.debugLineNum = 38010892;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
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
RDebugUtils.currentLine=38010893;
 //BA.debugLineNum = 38010893;BA.debugLine="sb.Append(\"?,\")";
_sb.Append("?,");
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
RDebugUtils.currentLine=38010895;
 //BA.debugLineNum = 38010895;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=38010896;
 //BA.debugLineNum = 38010896;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=38010897;
 //BA.debugLineNum = 38010897;BA.debugLine="If Data.Size > 0 Then";
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
RDebugUtils.currentLine=38010898;
 //BA.debugLineNum = 38010898;BA.debugLine="If Data.Get(0) Is List Then";
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
RDebugUtils.currentLine=38010899;
 //BA.debugLineNum = 38010899;BA.debugLine="For Each lrow As Object In Data";
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
RDebugUtils.currentLine=38010900;
 //BA.debugLineNum = 38010900;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, lrow)";
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
RDebugUtils.currentLine=38010903;
 //BA.debugLineNum = 38010903;BA.debugLine="For Each row() As Object In Data";
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
RDebugUtils.currentLine=38010904;
 //BA.debugLineNum = 38010904;BA.debugLine="sql1.AddNonQueryToBatch(sb.ToString, row)";
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
RDebugUtils.currentLine=38010909;
 //BA.debugLineNum = 38010909;BA.debugLine="Dim SenderFilter As Object = sql1.ExecNonQueryBat";
_senderfilter = __ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQueryBatch(ba,"SQL1");
RDebugUtils.currentLine=38010911;
 //BA.debugLineNum = 38010911;BA.debugLine="Wait For (SenderFilter) SQL1_NonQueryComplete (Su";
parent.__c.WaitFor("sql1_nonquerycomplete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "setdata"), _senderfilter);
this.state = 41;
return;
case 41:
//C
this.state = -1;
_success = (Boolean) result[1];
;
RDebugUtils.currentLine=38010913;
 //BA.debugLineNum = 38010913;BA.debugLine="CountAll = Data.Size";
__ref._countall /*int*/  = _data.getSize();
RDebugUtils.currentLine=38010914;
 //BA.debugLineNum = 38010914;BA.debugLine="RefreshNow";
__ref._refreshnow /*String*/ (null);
RDebugUtils.currentLine=38010915;
 //BA.debugLineNum = 38010915;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
RDebugUtils.currentLine=38010916;
 //BA.debugLineNum = 38010916;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Public Sub AddColumn (Title As String, ColumnType";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Dim c As B4XTableColumn";
_c = new b4a.example.ef.b4xtable._b4xtablecolumn();
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="c.Initialize";
_c.Initialize();
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="c.Title = Title";
_c.Title /*String*/  = _title;
RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="c.ColumnType = ColumnType";
_c.ColumnType /*int*/  = _columntype;
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="c.Sortable = ColumnType <> COLUMN_TYPE_VOID";
_c.Sortable /*boolean*/  = _columntype!=__ref._column_type_void /*int*/ ;
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="c.Searchable = ColumnType = COLUMN_TYPE_TEXT";
_c.Searchable /*boolean*/  = _columntype==__ref._column_type_text /*int*/ ;
RDebugUtils.currentLine=37814279;
 //BA.debugLineNum = 37814279;BA.debugLine="c.CellsLayouts.Initialize";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=37814280;
 //BA.debugLineNum = 37814280;BA.debugLine="c.Formatter = DefaultDataFormatter";
_c.Formatter /*b4a.example.ef.b4xformatter*/  = __ref._defaultdataformatter /*b4a.example.ef.b4xformatter*/ ;
RDebugUtils.currentLine=37814281;
 //BA.debugLineNum = 37814281;BA.debugLine="c.Panel = xui.CreatePanel(\"ColumnPanel\")";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"ColumnPanel");
RDebugUtils.currentLine=37814282;
 //BA.debugLineNum = 37814282;BA.debugLine="c.Panel.Tag = c";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag((Object)(_c));
RDebugUtils.currentLine=37814283;
 //BA.debugLineNum = 37814283;BA.debugLine="c.Id = Title";
_c.Id /*String*/  = _title;
RDebugUtils.currentLine=37814284;
 //BA.debugLineNum = 37814284;BA.debugLine="Columns.Add(c)";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=37814285;
 //BA.debugLineNum = 37814285;BA.debugLine="VisibleColumns.Add(c)";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_c));
RDebugUtils.currentLine=37814286;
 //BA.debugLineNum = 37814286;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=37814287;
 //BA.debugLineNum = 37814287;BA.debugLine="Dim header As B4XView = GetLabelFromColumn(c, 0)";
_header = new anywheresoftware.b4a.objects.B4XViewWrapper();
_header = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,(int) (0));
RDebugUtils.currentLine=37814288;
 //BA.debugLineNum = 37814288;BA.debugLine="SetTextOrCSBuilderToLabel (header, Title)";
__ref._settextorcsbuildertolabel /*String*/ (null,_header,(Object)(_title));
RDebugUtils.currentLine=37814289;
 //BA.debugLineNum = 37814289;BA.debugLine="If LayoutLoaded Then";
if (__ref._layoutloaded /*boolean*/ ) { 
RDebugUtils.currentLine=37814290;
 //BA.debugLineNum = 37814290;BA.debugLine="AddColumnToCLV(c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
RDebugUtils.currentLine=37814292;
 //BA.debugLineNum = 37814292;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=37814293;
 //BA.debugLineNum = 37814293;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Private Sub CreateColumnLayouts (c As B4XTableColu";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="For i = c.CellsLayouts.Size To Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_size-1);
_i = _c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize() ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="Dim p As B4XView = CreateCellViews";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._createcellviews /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null);
RDebugUtils.currentLine=37945347;
 //BA.debugLineNum = 37945347;BA.debugLine="Dim lbl As B4XView = p.GetView(c.LabelIndex)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=37945348;
 //BA.debugLineNum = 37945348;BA.debugLine="c.CellsLayouts.Add(p)";
_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_p.getObject()));
RDebugUtils.currentLine=37945349;
 //BA.debugLineNum = 37945349;BA.debugLine="Dim clr, tclr As Int";
_clr = 0;
_tclr = 0;
RDebugUtils.currentLine=37945350;
 //BA.debugLineNum = 37945350;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=37945351;
 //BA.debugLineNum = 37945351;BA.debugLine="If i = 0 Then";
if (_i==0) { 
RDebugUtils.currentLine=37945352;
 //BA.debugLineNum = 37945352;BA.debugLine="clr = HeaderColor";
_clr = __ref._headercolor /*int*/ ;
RDebugUtils.currentLine=37945353;
 //BA.debugLineNum = 37945353;BA.debugLine="tclr = HeaderTextColor";
_tclr = __ref._headertextcolor /*int*/ ;
RDebugUtils.currentLine=37945354;
 //BA.debugLineNum = 37945354;BA.debugLine="fnt = HeaderFont";
_fnt = __ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
 }else {
RDebugUtils.currentLine=37945356;
 //BA.debugLineNum = 37945356;BA.debugLine="fnt = LabelsFont";
_fnt = __ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ;
RDebugUtils.currentLine=37945357;
 //BA.debugLineNum = 37945357;BA.debugLine="tclr = TextColor";
_tclr = __ref._textcolor /*int*/ ;
RDebugUtils.currentLine=37945358;
 //BA.debugLineNum = 37945358;BA.debugLine="If i Mod 2 = 1 Then";
if (_i%2==1) { 
RDebugUtils.currentLine=37945359;
 //BA.debugLineNum = 37945359;BA.debugLine="clr = EvenRowColor";
_clr = __ref._evenrowcolor /*int*/ ;
 }else {
RDebugUtils.currentLine=37945361;
 //BA.debugLineNum = 37945361;BA.debugLine="clr = OddRowColor";
_clr = __ref._oddrowcolor /*int*/ ;
 };
 };
RDebugUtils.currentLine=37945364;
 //BA.debugLineNum = 37945364;BA.debugLine="lbl.Font = fnt";
_lbl.setFont(_fnt);
RDebugUtils.currentLine=37945365;
 //BA.debugLineNum = 37945365;BA.debugLine="p.SetColorAndBorder(clr, 1dip, GridColor, 0)";
_p.SetColorAndBorder(_clr,__c.DipToCurrent((int) (1)),__ref._gridcolor /*int*/ ,(int) (0));
RDebugUtils.currentLine=37945366;
 //BA.debugLineNum = 37945366;BA.debugLine="lbl.TextColor = tclr";
_lbl.setTextColor(_tclr);
RDebugUtils.currentLine=37945367;
 //BA.debugLineNum = 37945367;BA.debugLine="lbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_lbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=37945368;
 //BA.debugLineNum = 37945368;BA.debugLine="p.Tag = i";
_p.setTag((Object)(_i));
RDebugUtils.currentLine=37945369;
 //BA.debugLineNum = 37945369;BA.debugLine="c.Panel.AddView(p, 0, 0, 0, 0)";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_p.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }
};
RDebugUtils.currentLine=37945371;
 //BA.debugLineNum = 37945371;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getlabelfromcolumn(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getlabelfromcolumn", true))
	 {return ((anywheresoftware.b4a.objects.B4XViewWrapper) Debug.delegate(ba, "getlabelfromcolumn", new Object[] {_c,_index}));}
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Private Sub GetLabelFromColumn (c As B4XTableColum";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(Index)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index)));
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="Return p.GetView(c.LabelIndex)";
if (true) return _p.GetView(_c.LabelIndex /*int*/ );
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="End Sub";
return null;
}
public String  _settextorcsbuildertolabel(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "settextorcsbuildertolabel", true))
	 {return ((String) Debug.delegate(ba, "settextorcsbuildertolabel", new Object[] {_xlbl,_text}));}
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Private Sub SetTextOrCSBuilderToLabel(xlbl As B4XV";
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="End Sub";
return "";
}
public String  _addcolumntoclv(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "addcolumntoclv", true))
	 {return ((String) Debug.delegate(ba, "addcolumntoclv", new Object[] {_c}));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Private Sub AddColumnToCLV (c As B4XTableColumn)";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="clvData.Add(c.Panel, c)";
__ref._clvdata /*b4a.example3.customlistview*/ ._add(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(b4a.example.ef.b4xtable __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "base_resize", true))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="Refresh2 (False, False)";
__ref._refresh2 /*String*/ (null,__c.False,__c.False);
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Private Sub Refresh2 (RefreshData As Boolean, Dont";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="If LayoutLoaded = False Or VisibleColumns.Size =";
if (__ref._layoutloaded /*boolean*/ ==__c.False || __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="Dim PrevRowsPerPage As Int = mRowsPerPage";
_prevrowsperpage = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="If xui.IsB4A And LastBaseHeight <> mBase.Height T";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A() && __ref._lastbaseheight /*int*/ !=__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight()) { 
RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="clvData.AsView.Height = clvData.AsView.Height -";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().setHeight((int) (__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight()-(__ref._lastbaseheight /*int*/ -__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight())));
RDebugUtils.currentLine=36634629;
 //BA.debugLineNum = 36634629;BA.debugLine="clvData.Base_Resize(clvData.AsView.Width, clvDat";
__ref._clvdata /*b4a.example3.customlistview*/ ._base_resize(__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
 };
RDebugUtils.currentLine=36634632;
 //BA.debugLineNum = 36634632;BA.debugLine="Dim TotalHeight As Int = clvData.AsView.Height -";
_totalheight = (int) (__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight()-__ref._headersheight /*int*/ );
RDebugUtils.currentLine=36634633;
 //BA.debugLineNum = 36634633;BA.debugLine="If xui.IsB4J Then";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4J()) { 
RDebugUtils.currentLine=36634634;
 //BA.debugLineNum = 36634634;BA.debugLine="TotalHeight = TotalHeight - 20";
_totalheight = (int) (_totalheight-20);
 };
RDebugUtils.currentLine=36634636;
 //BA.debugLineNum = 36634636;BA.debugLine="If AllowSmallRowHeightModifications Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ) { 
RDebugUtils.currentLine=36634637;
 //BA.debugLineNum = 36634637;BA.debugLine="mRowsPerPage = Max(0, Round(TotalHeight/ RowHeig";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Round(_totalheight/(double)__ref._rowheight /*int*/ )));
 }else {
RDebugUtils.currentLine=36634639;
 //BA.debugLineNum = 36634639;BA.debugLine="mRowsPerPage = Max(0, Floor(TotalHeight / RowHei";
__ref._mrowsperpage /*int*/  = (int) (__c.Max(0,__c.Floor(_totalheight/(double)__ref._rowheight /*int*/ )));
 };
RDebugUtils.currentLine=36634641;
 //BA.debugLineNum = 36634641;BA.debugLine="If MaximumRowsPerPage > 0 Then";
if (__ref._maximumrowsperpage /*int*/ >0) { 
RDebugUtils.currentLine=36634642;
 //BA.debugLineNum = 36634642;BA.debugLine="mRowsPerPage = Min(MaximumRowsPerPage, mRowsPerP";
__ref._mrowsperpage /*int*/  = (int) (__c.Min(__ref._maximumrowsperpage /*int*/ ,__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=36634643;
 //BA.debugLineNum = 36634643;BA.debugLine="TotalHeight = Min(TotalHeight, MaximumRowsPerPag";
_totalheight = (int) (__c.Min(_totalheight,__ref._maximumrowsperpage /*int*/ *__ref._rowheight /*int*/ ));
 };
RDebugUtils.currentLine=36634645;
 //BA.debugLineNum = 36634645;BA.debugLine="If PrevRowsPerPage <> mRowsPerPage Then RefreshDa";
if (_prevrowsperpage!=__ref._mrowsperpage /*int*/ ) { 
_refreshdata = __c.True;};
RDebugUtils.currentLine=36634646;
 //BA.debugLineNum = 36634646;BA.debugLine="CalculateWidths";
__ref._calculatewidths /*String*/ (null);
RDebugUtils.currentLine=36634647;
 //BA.debugLineNum = 36634647;BA.debugLine="Dim ColumnIndex As Int";
_columnindex = 0;
RDebugUtils.currentLine=36634649;
 //BA.debugLineNum = 36634649;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group24 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen24 = group24.getSize()
;int index24 = 0;
;
for (; index24 < groupLen24;index24++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group24.Get(index24));
RDebugUtils.currentLine=36634650;
 //BA.debugLineNum = 36634650;BA.debugLine="Dim IsFrozen As Boolean = ColumnIndex < NumberOf";
_isfrozen = _columnindex<__ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=36634651;
 //BA.debugLineNum = 36634651;BA.debugLine="If c.Panel.Parent.IsInitialized Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()) { 
RDebugUtils.currentLine=36634652;
 //BA.debugLineNum = 36634652;BA.debugLine="CheckAndRemoveColumnThatWasAddedToIncorrectPare";
__ref._checkandremovecolumnthatwasaddedtoincorrectparent /*String*/ (null,_c,_isfrozen);
 };
RDebugUtils.currentLine=36634654;
 //BA.debugLineNum = 36634654;BA.debugLine="If c.Panel.Parent.IsInitialized = False Then";
if (_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent().IsInitialized()==__c.False) { 
RDebugUtils.currentLine=36634655;
 //BA.debugLineNum = 36634655;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=36634656;
 //BA.debugLineNum = 36634656;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=36634657;
 //BA.debugLineNum = 36634657;BA.debugLine="mBase.AddView(c.Panel, 0, 0, 0, 0)";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 }else {
RDebugUtils.currentLine=36634659;
 //BA.debugLineNum = 36634659;BA.debugLine="AddColumnToCLV (c)";
__ref._addcolumntoclv /*String*/ (null,_c);
 };
 };
RDebugUtils.currentLine=36634663;
 //BA.debugLineNum = 36634663;BA.debugLine="CreateColumnLayouts(c, mRowsPerPage + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (__ref._mrowsperpage /*int*/ +1));
RDebugUtils.currentLine=36634664;
 //BA.debugLineNum = 36634664;BA.debugLine="ResizeColumnImpl(c, TotalHeight)";
__ref._resizecolumnimpl /*String*/ (null,_c,_totalheight);
RDebugUtils.currentLine=36634665;
 //BA.debugLineNum = 36634665;BA.debugLine="ColumnIndex = ColumnIndex + 1";
_columnindex = (int) (_columnindex+1);
 }
};
RDebugUtils.currentLine=36634667;
 //BA.debugLineNum = 36634667;BA.debugLine="If RefreshData Then UpdateData (DontSleep)";
if (_refreshdata) { 
__ref._updatedata /*String*/ (null,_dontsleep);};
RDebugUtils.currentLine=36634668;
 //BA.debugLineNum = 36634668;BA.debugLine="Dim FreezedWidth As Int";
_freezedwidth = 0;
RDebugUtils.currentLine=36634669;
 //BA.debugLineNum = 36634669;BA.debugLine="For i = 0 To NumberOfFrozenColumns - 1";
{
final int step43 = 1;
final int limit43 = (int) (__ref._numberoffrozencolumns /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=36634670;
 //BA.debugLineNum = 36634670;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=36634674;
 //BA.debugLineNum = 36634674;BA.debugLine="Dim offset As Float = 0";
_offset = (float) (0);
RDebugUtils.currentLine=36634676;
 //BA.debugLineNum = 36634676;BA.debugLine="c.Panel.SetLayoutAnimated(0, offset + FreezedWid";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .SetLayoutAnimated((int) (0),(int) (_offset+_freezedwidth),(int) (__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getTop()+_offset),_c.ComputedWidth /*int*/ ,__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight());
RDebugUtils.currentLine=36634678;
 //BA.debugLineNum = 36634678;BA.debugLine="FreezedWidth = FreezedWidth + c.ComputedWidth";
_freezedwidth = (int) (_freezedwidth+_c.ComputedWidth /*int*/ );
 }
};
RDebugUtils.currentLine=36634680;
 //BA.debugLineNum = 36634680;BA.debugLine="clvData.AsView.Left = FreezedWidth";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().setLeft(_freezedwidth);
RDebugUtils.currentLine=36634681;
 //BA.debugLineNum = 36634681;BA.debugLine="If Round(clvData.AsView.Width) <> Round(mBase.Wid";
if (__c.Round(__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getWidth())!=__c.Round(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth)) { 
RDebugUtils.currentLine=36634682;
 //BA.debugLineNum = 36634682;BA.debugLine="clvData.AsView.Width = mBase.Width - FreezedWidt";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().setWidth((int) (__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-_freezedwidth));
RDebugUtils.currentLine=36634683;
 //BA.debugLineNum = 36634683;BA.debugLine="If xui.IsB4A Then clvData.Base_Resize(clvData.As";
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .getIsB4A()) { 
__ref._clvdata /*b4a.example3.customlistview*/ ._base_resize(__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getWidth(),__ref._clvdata /*b4a.example3.customlistview*/ ._asview().getHeight());};
 };
RDebugUtils.currentLine=36634685;
 //BA.debugLineNum = 36634685;BA.debugLine="ResizeAndReorderCLVItems";
__ref._resizeandreorderclvitems /*String*/ (null);
RDebugUtils.currentLine=36634686;
 //BA.debugLineNum = 36634686;BA.debugLine="UpdateSearchFieldVisibility";
__ref._updatesearchfieldvisibility /*String*/ (null);
RDebugUtils.currentLine=36634687;
 //BA.debugLineNum = 36634687;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=36634688;
 //BA.debugLineNum = 36634688;BA.debugLine="End Sub";
return "";
}
public String  _buildlayoutscache(b4a.example.ef.b4xtable __ref,int _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "buildlayoutscache", true))
	 {return ((String) Debug.delegate(ba, "buildlayoutscache", new Object[] {_size}));}
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Public Sub BuildLayoutsCache (Size As Int)";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="CreateColumnLayouts(c, Size + 1)";
__ref._createcolumnlayouts /*String*/ (null,_c,(int) (_size+1));
 }
};
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Public Sub BuildQuery (WithPageLimit As Boolean) A";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="Dim SortColumn As String";
_sortcolumn = "";
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=37093379;
 //BA.debugLineNum = 37093379;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=37093380;
 //BA.debugLineNum = 37093380;BA.debugLine="sb.Append(\"SELECT rowid\")";
_sb.Append("SELECT rowid");
RDebugUtils.currentLine=37093381;
 //BA.debugLineNum = 37093381;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=37093382;
 //BA.debugLineNum = 37093382;BA.debugLine="If c.ColumnType = COLUMN_TYPE_VOID Then Continue";
if (_c.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="sb.Append(\",\").Append(c.SQLID)";
_sb.Append(",").Append(_c.SQLID /*String*/ );
RDebugUtils.currentLine=37093384;
 //BA.debugLineNum = 37093384;BA.debugLine="If c.InternalSortMode <> \"\" Then";
if ((_c.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=37093385;
 //BA.debugLineNum = 37093385;BA.debugLine="SortColumn = \" ORDER BY \" & c.SQLID & \" \" & c.I";
_sortcolumn = " ORDER BY "+_c.SQLID /*String*/ +" "+_c.InternalSortMode /*String*/ ;
 };
 }
};
RDebugUtils.currentLine=37093388;
 //BA.debugLineNum = 37093388;BA.debugLine="sb.Append(\" FROM \").Append(SQLTableName).Append(\"";
_sb.Append(" FROM ").Append(__ref._sqltablename /*String*/ ).Append(" ");
RDebugUtils.currentLine=37093389;
 //BA.debugLineNum = 37093389;BA.debugLine="Dim args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37093390;
 //BA.debugLineNum = 37093390;BA.debugLine="args.Initialize";
_args.Initialize();
RDebugUtils.currentLine=37093391;
 //BA.debugLineNum = 37093391;BA.debugLine="Dim TotalCount As Int";
_totalcount = 0;
RDebugUtils.currentLine=37093392;
 //BA.debugLineNum = 37093392;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=37093393;
 //BA.debugLineNum = 37093393;BA.debugLine="TotalCount = CountAll";
_totalcount = __ref._countall /*int*/ ;
 }else {
RDebugUtils.currentLine=37093395;
 //BA.debugLineNum = 37093395;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group19 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen19 = group19.getSize()
;int index19 = 0;
;
for (; index19 < groupLen19;index19++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group19.Get(index19));
RDebugUtils.currentLine=37093396;
 //BA.debugLineNum = 37093396;BA.debugLine="If c.Searchable Then";
if (_c.Searchable /*boolean*/ ) { 
RDebugUtils.currentLine=37093397;
 //BA.debugLineNum = 37093397;BA.debugLine="If args.Size = 0 Then";
if (_args.getSize()==0) { 
RDebugUtils.currentLine=37093398;
 //BA.debugLineNum = 37093398;BA.debugLine="sb.Append(\" WHERE \")";
_sb.Append(" WHERE ");
 }else {
RDebugUtils.currentLine=37093400;
 //BA.debugLineNum = 37093400;BA.debugLine="sb.Append(\" OR \")";
_sb.Append(" OR ");
 };
RDebugUtils.currentLine=37093402;
 //BA.debugLineNum = 37093402;BA.debugLine="sb.Append(c.SQLID).Append(\" LIKE ? \")";
_sb.Append(_c.SQLID /*String*/ ).Append(" LIKE ? ");
RDebugUtils.currentLine=37093403;
 //BA.debugLineNum = 37093403;BA.debugLine="If PrefixSearch Then";
if (__ref._prefixsearch /*boolean*/ ) { 
RDebugUtils.currentLine=37093404;
 //BA.debugLineNum = 37093404;BA.debugLine="args.Add(FilterText & \"%\")";
_args.Add((Object)(__ref._filtertext /*String*/ +"%"));
 }else {
RDebugUtils.currentLine=37093406;
 //BA.debugLineNum = 37093406;BA.debugLine="args.Add(\"%\" & FilterText & \"%\")";
_args.Add((Object)("%"+__ref._filtertext /*String*/ +"%"));
 };
 };
 }
};
RDebugUtils.currentLine=37093410;
 //BA.debugLineNum = 37093410;BA.debugLine="TotalCount = -1";
_totalcount = (int) (-1);
 };
RDebugUtils.currentLine=37093412;
 //BA.debugLineNum = 37093412;BA.debugLine="If SortColumn <> \"\" Then sb.Append(SortColumn)";
if ((_sortcolumn).equals("") == false) { 
_sb.Append(_sortcolumn);};
RDebugUtils.currentLine=37093413;
 //BA.debugLineNum = 37093413;BA.debugLine="If WithPageLimit Then";
if (_withpagelimit) { 
RDebugUtils.currentLine=37093414;
 //BA.debugLineNum = 37093414;BA.debugLine="Dim limit As Int = mRowsPerPage";
_limit = __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=37093415;
 //BA.debugLineNum = 37093415;BA.debugLine="If TotalCount < 0 Then limit = limit + 1";
if (_totalcount<0) { 
_limit = (int) (_limit+1);};
RDebugUtils.currentLine=37093416;
 //BA.debugLineNum = 37093416;BA.debugLine="sb.Append($\" LIMIT ${mFirstRowIndex}, ${limit}\"$";
_sb.Append((" LIMIT "+__c.SmartStringFormatter("",(Object)(__ref._mfirstrowindex /*int*/ ))+", "+__c.SmartStringFormatter("",(Object)(_limit))+""));
 };
RDebugUtils.currentLine=37093419;
 //BA.debugLineNum = 37093419;BA.debugLine="Dim aargs(args.Size) As String";
_aargs = new String[_args.getSize()];
java.util.Arrays.fill(_aargs,"");
RDebugUtils.currentLine=37093420;
 //BA.debugLineNum = 37093420;BA.debugLine="For i = 0 To args.Size - 1";
{
final int step43 = 1;
final int limit43 = (int) (_args.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit43 ;_i = _i + step43 ) {
RDebugUtils.currentLine=37093421;
 //BA.debugLineNum = 37093421;BA.debugLine="aargs(i) = args.Get(i)";
_aargs[_i] = BA.ObjectToString(_args.Get(_i));
 }
};
RDebugUtils.currentLine=37093426;
 //BA.debugLineNum = 37093426;BA.debugLine="Return Array(sb.ToString, aargs, TotalCount)";
if (true) return new Object[]{(Object)(_sb.ToString()),(Object)(_aargs),(Object)(_totalcount)};
RDebugUtils.currentLine=37093427;
 //BA.debugLineNum = 37093427;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Private Sub CalculateWidths";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="Dim wildcardcount As Int";
_wildcardcount = 0;
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="Dim TotalExplicitWidth As Int";
_totalexplicitwidth = 0;
RDebugUtils.currentLine=37683203;
 //BA.debugLineNum = 37683203;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group3.Get(index3));
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="If c.Width = 0 Then wildcardcount = wildcardcoun";
if (_c.Width /*int*/ ==0) { 
_wildcardcount = (int) (_wildcardcount+1);}
else {
_c.ComputedWidth /*int*/  = _c.Width /*int*/ ;};
RDebugUtils.currentLine=37683205;
 //BA.debugLineNum = 37683205;BA.debugLine="TotalExplicitWidth = TotalExplicitWidth + c.Widt";
_totalexplicitwidth = (int) (_totalexplicitwidth+_c.Width /*int*/ );
 }
};
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="If wildcardcount = 0 Then Return";
if (_wildcardcount==0) { 
if (true) return "";};
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="Dim WildcardWidth As Int = Max(wildcardcount * Mi";
_wildcardwidth = (int) (__c.Max(_wildcardcount*__ref._minimumwidth /*int*/ ,__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__c.DipToCurrent((int) (2))-_totalexplicitwidth));
RDebugUtils.currentLine=37683209;
 //BA.debugLineNum = 37683209;BA.debugLine="Dim Width As Int = WildcardWidth / wildcardcount";
_width = (int) (_wildcardwidth/(double)_wildcardcount);
RDebugUtils.currentLine=37683210;
 //BA.debugLineNum = 37683210;BA.debugLine="Dim Remainder As Int = WildcardWidth Mod wildcard";
_remainder = (int) (_wildcardwidth%_wildcardcount);
RDebugUtils.currentLine=37683211;
 //BA.debugLineNum = 37683211;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group11.Get(index11));
RDebugUtils.currentLine=37683212;
 //BA.debugLineNum = 37683212;BA.debugLine="If c.Width = 0 Then";
if (_c.Width /*int*/ ==0) { 
RDebugUtils.currentLine=37683213;
 //BA.debugLineNum = 37683213;BA.debugLine="c.ComputedWidth = Width";
_c.ComputedWidth /*int*/  = _width;
RDebugUtils.currentLine=37683214;
 //BA.debugLineNum = 37683214;BA.debugLine="If Remainder > 0 Then";
if (_remainder>0) { 
RDebugUtils.currentLine=37683215;
 //BA.debugLineNum = 37683215;BA.debugLine="Remainder = Remainder - 1";
_remainder = (int) (_remainder-1);
RDebugUtils.currentLine=37683216;
 //BA.debugLineNum = 37683216;BA.debugLine="c.ComputedWidth = c.ComputedWidth + 1";
_c.ComputedWidth /*int*/  = (int) (_c.ComputedWidth /*int*/ +1);
 };
 };
 }
};
RDebugUtils.currentLine=37683220;
 //BA.debugLineNum = 37683220;BA.debugLine="End Sub";
return "";
}
public String  _cell_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cell_click", true))
	 {return ((String) Debug.delegate(ba, "cell_click", null));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Private Sub Cell_Click";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="CellClicked(Sender, False)";
__ref._cellclicked /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.False);
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="If DateTime.Now < LastCellClickEvent + 20 Then Re";
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
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="LastCellClickEvent = DateTime.Now";
__ref._lastcellclickevent /*long*/  = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="Dim column As B4XTableColumn = pnl.Parent.Tag";
_column = (b4a.example.ef.b4xtable._b4xtablecolumn)(_pnl.getParent().getTag());
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="Dim Row As Int = pnl.Tag - 1";
_row = (int) ((double)(BA.ObjectToNumber(_pnl.getTag()))-1);
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="Dim e As String";
_e = "";
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="If Row = -1 Then";
if (true) break;

case 7:
//if
this.state = 61;
if (_row==-1) { 
this.state = 9;
}else 
{RDebugUtils.currentLine=38666259;
 //BA.debugLineNum = 38666259;BA.debugLine="Else If VisibleRowIds.Size > 0 Then";
if (__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 20;
}}
if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=38666247;
 //BA.debugLineNum = 38666247;BA.debugLine="If LongClicked Then";
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
RDebugUtils.currentLine=38666248;
 //BA.debugLineNum = 38666248;BA.debugLine="e = \"_headerlongclicked\"";
_e = "_headerlongclicked";
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=38666250;
 //BA.debugLineNum = 38666250;BA.debugLine="e = \"_headerclicked\"";
_e = "_headerclicked";
RDebugUtils.currentLine=38666251;
 //BA.debugLineNum = 38666251;BA.debugLine="HeaderClicked(column)";
__ref._headerclicked /*String*/ (null,_column);
 if (true) break;
;
RDebugUtils.currentLine=38666253;
 //BA.debugLineNum = 38666253;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 1) T";

case 15:
//if
this.state = 18;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (1))) { 
this.state = 17;
}if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=38666257;
 //BA.debugLineNum = 38666257;BA.debugLine="CallSub2(mCallBack, mEventName & e, column.Id)";
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
RDebugUtils.currentLine=38666260;
 //BA.debugLineNum = 38666260;BA.debugLine="Dim RowId As Long = VisibleRowIds.Get(Row)";
_rowid = BA.ObjectToLongNumber(__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
RDebugUtils.currentLine=38666261;
 //BA.debugLineNum = 38666261;BA.debugLine="If RowId > 0 Then";
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
RDebugUtils.currentLine=38666262;
 //BA.debugLineNum = 38666262;BA.debugLine="Dim clr As Int";
_clr = 0;
RDebugUtils.currentLine=38666263;
 //BA.debugLineNum = 38666263;BA.debugLine="If Row Mod 2 = 0 Then clr = EvenRowColor Else c";
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
RDebugUtils.currentLine=38666265;
 //BA.debugLineNum = 38666265;BA.debugLine="If LongClicked Then";
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
RDebugUtils.currentLine=38666266;
 //BA.debugLineNum = 38666266;BA.debugLine="e = \"_CellLongClicked\"";
_e = "_CellLongClicked";
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=38666268;
 //BA.debugLineNum = 38666268;BA.debugLine="e = \"_cellclicked\"";
_e = "_cellclicked";
RDebugUtils.currentLine=38666269;
 //BA.debugLineNum = 38666269;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnimat";
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
RDebugUtils.currentLine=38666272;
 //BA.debugLineNum = 38666272;BA.debugLine="If xui.SubExists(mCallBack, mEventName & e, 2)";

case 43:
//if
this.state = 46;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(int) (2))) { 
this.state = 45;
}if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=38666276;
 //BA.debugLineNum = 38666276;BA.debugLine="CallSub3(mCallBack, mEventName & e, column.Id,";
parent.__c.CallSubNew3(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +_e,(Object)(_column.Id /*String*/ ),__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_row));
 if (true) break;
;
RDebugUtils.currentLine=38666278;
 //BA.debugLineNum = 38666278;BA.debugLine="If LongClicked = False Then";

case 46:
//if
this.state = 59;
if (_longclicked==parent.__c.False) { 
this.state = 48;
}if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=38666279;
 //BA.debugLineNum = 38666279;BA.debugLine="Sleep(200)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "cellclicked"),(int) (200));
this.state = 62;
return;
case 62:
//C
this.state = 49;
;
RDebugUtils.currentLine=38666280;
 //BA.debugLineNum = 38666280;BA.debugLine="If pnl.IsInitialized Then";
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
RDebugUtils.currentLine=38666281;
 //BA.debugLineNum = 38666281;BA.debugLine="If SelectionColor <> 0 Then pnl.SetColorAnima";
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
RDebugUtils.currentLine=38666286;
 //BA.debugLineNum = 38666286;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Private Sub Cell_LongClick";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="CellClicked(Sender, True)";
__ref._cellclicked /*void*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba))),__c.True);
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="End Sub";
return "";
}
public String  _headerclicked(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "headerclicked", true))
	 {return ((String) Debug.delegate(ba, "headerclicked", new Object[] {_col}));}
b4a.example.ef.b4xtable._b4xtablecolumn _c = null;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub HeaderClicked (col As B4XTableColumn)";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="If col.Sortable Then";
if (_col.Sortable /*boolean*/ ) { 
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group2.Get(index2));
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="If c = col Then";
if ((_c).equals(_col)) { 
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="If c.InternalSortMode = \"ASC\" Then c.InternalS";
if ((_c.InternalSortMode /*String*/ ).equals("ASC")) { 
_c.InternalSortMode /*String*/  = "DESC";}
else {
_c.InternalSortMode /*String*/  = "ASC";};
 }else {
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="c.InternalSortMode = \"\"";
_c.InternalSortMode /*String*/  = "";
 };
 }
};
RDebugUtils.currentLine=38731785;
 //BA.debugLineNum = 38731785;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=38731786;
 //BA.debugLineNum = 38731786;BA.debugLine="UpdateSortIcon";
__ref._updatesorticon /*String*/ (null);
RDebugUtils.currentLine=38731787;
 //BA.debugLineNum = 38731787;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
 };
RDebugUtils.currentLine=38731789;
 //BA.debugLineNum = 38731789;BA.debugLine="End Sub";
return "";
}
public String  _checkandremovecolumnthatwasaddedtoincorrectparent(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c,boolean _isfrozen) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", true))
	 {return ((String) Debug.delegate(ba, "checkandremovecolumnthatwasaddedtoincorrectparent", new Object[] {_c,_isfrozen}));}
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Private Sub CheckAndRemoveColumnThatWasAddedToInco";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="If (c.Panel.Parent = mBase) <> IsFrozen Then";
if (((_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ))!=_isfrozen) { 
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="If IsFrozen Then";
if (_isfrozen) { 
RDebugUtils.currentLine=36831235;
 //BA.debugLineNum = 36831235;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
 }else {
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
 };
 };
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="End Sub";
return "";
}
public String  _removecolumnfromclv(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "removecolumnfromclv", true))
	 {return ((String) Debug.delegate(ba, "removecolumnfromclv", new Object[] {_c}));}
int _i = 0;
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Private Sub RemoveColumnFromCLV (c As B4XTableColu";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="For i = 0 To clvData.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._clvdata /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="If clvData.GetValue(i) = c Then";
if ((__ref._clvdata /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)(_c))) { 
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="clvData.RemoveAt(i)";
__ref._clvdata /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=36896775;
 //BA.debugLineNum = 36896775;BA.debugLine="c.Panel.RemoveViewFromParent";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=36896776;
 //BA.debugLineNum = 36896776;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="Public mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="Public Tag As Object";
_tag = new Object();
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="Public sql1 As SQL";
_sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=36110343;
 //BA.debugLineNum = 36110343;BA.debugLine="Type B4XTableColumn (Title As String, Id As Strin";
;
RDebugUtils.currentLine=36110346;
 //BA.debugLineNum = 36110346;BA.debugLine="Public COLUMN_TYPE_TEXT = 1, COLUMN_TYPE_NUMBERS";
_column_type_text = (int) (1);
_column_type_numbers = (int) (2);
_column_type_date = (int) (3);
_column_type_void = (int) (4);
RDebugUtils.currentLine=36110347;
 //BA.debugLineNum = 36110347;BA.debugLine="Public Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36110348;
 //BA.debugLineNum = 36110348;BA.debugLine="Public VisibleColumns As List";
_visiblecolumns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36110349;
 //BA.debugLineNum = 36110349;BA.debugLine="Private mFirstRowIndex, mLastRowIndex As Int";
_mfirstrowindex = 0;
_mlastrowindex = 0;
RDebugUtils.currentLine=36110350;
 //BA.debugLineNum = 36110350;BA.debugLine="Public DefaultFormatter, DefaultDataFormatter As";
_defaultformatter = new b4a.example.ef.b4xformatter();
_defaultdataformatter = new b4a.example.ef.b4xformatter();
RDebugUtils.currentLine=36110351;
 //BA.debugLineNum = 36110351;BA.debugLine="Public pnlHeader As B4XView";
_pnlheader = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110352;
 //BA.debugLineNum = 36110352;BA.debugLine="Public pnlTitles As B4XView";
_pnltitles = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110353;
 //BA.debugLineNum = 36110353;BA.debugLine="Public clvData As CustomListView";
_clvdata = new b4a.example3.customlistview();
RDebugUtils.currentLine=36110354;
 //BA.debugLineNum = 36110354;BA.debugLine="Public RowHeight, HeadersHeight As Int";
_rowheight = 0;
_headersheight = 0;
RDebugUtils.currentLine=36110355;
 //BA.debugLineNum = 36110355;BA.debugLine="Public AllowSmallRowHeightModifications As Boolea";
_allowsmallrowheightmodifications = __c.True;
RDebugUtils.currentLine=36110356;
 //BA.debugLineNum = 36110356;BA.debugLine="Private mRowsPerPage As Int = 0";
_mrowsperpage = (int) (0);
RDebugUtils.currentLine=36110357;
 //BA.debugLineNum = 36110357;BA.debugLine="Private LayoutLoaded As Boolean";
_layoutloaded = false;
RDebugUtils.currentLine=36110358;
 //BA.debugLineNum = 36110358;BA.debugLine="Public MinimumWidth As Int";
_minimumwidth = 0;
RDebugUtils.currentLine=36110359;
 //BA.debugLineNum = 36110359;BA.debugLine="Private SQLIndex As Int";
_sqlindex = 0;
RDebugUtils.currentLine=36110360;
 //BA.debugLineNum = 36110360;BA.debugLine="Public EvenRowColor, OddRowColor, HeaderTextColor";
_evenrowcolor = 0;
_oddrowcolor = 0;
_headertextcolor = 0;
_textcolor = 0;
_highlighttextcolor = 0;
_headercolor = 0;
_gridcolor = 0;
RDebugUtils.currentLine=36110361;
 //BA.debugLineNum = 36110361;BA.debugLine="Public HighlightSearchResults As Boolean = True";
_highlightsearchresults = __c.True;
RDebugUtils.currentLine=36110362;
 //BA.debugLineNum = 36110362;BA.debugLine="Public HeaderFont, LabelsFont As B4XFont";
_headerfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
_labelsfont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
RDebugUtils.currentLine=36110363;
 //BA.debugLineNum = 36110363;BA.debugLine="Public lblFirst As B4XView";
_lblfirst = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110364;
 //BA.debugLineNum = 36110364;BA.debugLine="Public lblBack As B4XView";
_lblback = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110365;
 //BA.debugLineNum = 36110365;BA.debugLine="Public lblNumber As B4XView";
_lblnumber = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110366;
 //BA.debugLineNum = 36110366;BA.debugLine="Public lblNext As B4XView";
_lblnext = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110367;
 //BA.debugLineNum = 36110367;BA.debugLine="Public lblLast As B4XView";
_lbllast = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110368;
 //BA.debugLineNum = 36110368;BA.debugLine="Public lblFromTo As B4XView";
_lblfromto = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110369;
 //BA.debugLineNum = 36110369;BA.debugLine="Private CountAll As Int";
_countall = 0;
RDebugUtils.currentLine=36110370;
 //BA.debugLineNum = 36110370;BA.debugLine="Private mCurrentPage As Int";
_mcurrentpage = 0;
RDebugUtils.currentLine=36110371;
 //BA.debugLineNum = 36110371;BA.debugLine="Public mCurrentCount As Int";
_mcurrentcount = 0;
RDebugUtils.currentLine=36110372;
 //BA.debugLineNum = 36110372;BA.debugLine="Public lblSort As B4XView";
_lblsort = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36110373;
 //BA.debugLineNum = 36110373;BA.debugLine="Public SearchField As B4XFloatTextField";
_searchfield = new b4a.example.ef.b4xfloattextfield();
RDebugUtils.currentLine=36110374;
 //BA.debugLineNum = 36110374;BA.debugLine="Private FilterText As String";
_filtertext = "";
RDebugUtils.currentLine=36110375;
 //BA.debugLineNum = 36110375;BA.debugLine="Public SleepBeforeSearch As Int = 300";
_sleepbeforesearch = (int) (300);
RDebugUtils.currentLine=36110376;
 //BA.debugLineNum = 36110376;BA.debugLine="Private SearchIndex As Int";
_searchindex = 0;
RDebugUtils.currentLine=36110377;
 //BA.debugLineNum = 36110377;BA.debugLine="Public ArrowsEnabledColor, ArrowsDisabledColor As";
_arrowsenabledcolor = 0;
_arrowsdisabledcolor = 0;
RDebugUtils.currentLine=36110378;
 //BA.debugLineNum = 36110378;BA.debugLine="Public VisibleRowIds As List";
_visiblerowids = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36110379;
 //BA.debugLineNum = 36110379;BA.debugLine="Public SelectionColor As Int";
_selectioncolor = 0;
RDebugUtils.currentLine=36110380;
 //BA.debugLineNum = 36110380;BA.debugLine="Private SQLTableName As String = \"data\"";
_sqltablename = "data";
RDebugUtils.currentLine=36110381;
 //BA.debugLineNum = 36110381;BA.debugLine="Public StringMoreAvailable As String = \"(more ava";
_stringmoreavailable = "(more available)";
RDebugUtils.currentLine=36110382;
 //BA.debugLineNum = 36110382;BA.debugLine="Public StringNoMatches As String = \"No matches\"";
_stringnomatches = "No matches";
RDebugUtils.currentLine=36110383;
 //BA.debugLineNum = 36110383;BA.debugLine="Public StringOutOf As String = \"out of\"";
_stringoutof = "out of";
RDebugUtils.currentLine=36110384;
 //BA.debugLineNum = 36110384;BA.debugLine="Public StringTo As String = \"to\"";
_stringto = "to";
RDebugUtils.currentLine=36110385;
 //BA.debugLineNum = 36110385;BA.debugLine="Public MaximumRowsPerPage As Int";
_maximumrowsperpage = 0;
RDebugUtils.currentLine=36110386;
 //BA.debugLineNum = 36110386;BA.debugLine="Public PrefixSearch As Boolean";
_prefixsearch = false;
RDebugUtils.currentLine=36110391;
 //BA.debugLineNum = 36110391;BA.debugLine="Private LastBaseHeight As Int";
_lastbaseheight = 0;
RDebugUtils.currentLine=36110392;
 //BA.debugLineNum = 36110392;BA.debugLine="Public NumberOfFrozenColumns As Int";
_numberoffrozencolumns = 0;
RDebugUtils.currentLine=36110393;
 //BA.debugLineNum = 36110393;BA.debugLine="Private LastCellClickEvent As Long";
_lastcellclickevent = 0L;
RDebugUtils.currentLine=36110397;
 //BA.debugLineNum = 36110397;BA.debugLine="Public SearchVisible As Boolean";
_searchvisible = false;
RDebugUtils.currentLine=36110399;
 //BA.debugLineNum = 36110399;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="Dim OldSQL As SQL = sql1";
_oldsql = __ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ ;
RDebugUtils.currentLine=36372483;
 //BA.debugLineNum = 36372483;BA.debugLine="Dim sql1 As SQL";
parent._sql1 = new anywheresoftware.b4a.sql.SQL();
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="For Each c As B4XTableColumn In Columns";
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
RDebugUtils.currentLine=36372485;
 //BA.debugLineNum = 36372485;BA.debugLine="If c.Panel.IsInitialized And c.Panel.Parent.IsIn";
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
RDebugUtils.currentLine=36372486;
 //BA.debugLineNum = 36372486;BA.debugLine="c.Panel.RemoveViewFromParent";
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
RDebugUtils.currentLine=36372489;
 //BA.debugLineNum = 36372489;BA.debugLine="VisibleColumns.Clear";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=36372490;
 //BA.debugLineNum = 36372490;BA.debugLine="Columns.Clear";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=36372491;
 //BA.debugLineNum = 36372491;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=36372492;
 //BA.debugLineNum = 36372492;BA.debugLine="If clvData.IsInitialized Then";
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
RDebugUtils.currentLine=36372493;
 //BA.debugLineNum = 36372493;BA.debugLine="clvData.Clear";
__ref._clvdata /*b4a.example3.customlistview*/ ._clear();
 if (true) break;

case 12:
//C
this.state = 13;
;
RDebugUtils.currentLine=36372495;
 //BA.debugLineNum = 36372495;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=36372496;
 //BA.debugLineNum = 36372496;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=36372497;
 //BA.debugLineNum = 36372497;BA.debugLine="If OldSQL.IsInitialized Then";
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
RDebugUtils.currentLine=36372498;
 //BA.debugLineNum = 36372498;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "clear"),(int) (1000));
this.state = 23;
return;
case 23:
//C
this.state = 16;
;
RDebugUtils.currentLine=36372499;
 //BA.debugLineNum = 36372499;BA.debugLine="If OldSQL.IsInitialized Then";
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
RDebugUtils.currentLine=36372500;
 //BA.debugLineNum = 36372500;BA.debugLine="OldSQL.Close";
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
RDebugUtils.currentLine=36372503;
 //BA.debugLineNum = 36372503;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Private Sub ClearNavigationState";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="If lblNext.IsInitialized = False Then Return";
if (__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="SetPageLabelState(lblNext, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="SetPageLabelState(lblBack, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="SetPageLabelState(lblFirst, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__c.False);
RDebugUtils.currentLine=36438022;
 //BA.debugLineNum = 36438022;BA.debugLine="lblFromTo.Text = \"\"";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="lblNumber.Text = \"\"";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="End Sub";
return "";
}
public String  _cleardataview(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "cleardataview", true))
	 {return ((String) Debug.delegate(ba, "cleardataview", null));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Public Sub ClearDataView";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="SQLTableName = \"data\"";
__ref._sqltablename /*String*/  = "data";
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=37224453;
 //BA.debugLineNum = 37224453;BA.debugLine="End Sub";
return "";
}
public String  _updatedata(b4a.example.ef.b4xtable __ref,boolean _dontsleep) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatedata", true))
	 {return ((String) Debug.delegate(ba, "updatedata", new Object[] {_dontsleep}));}
Object[] _o = null;
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub UpdateData (DontSleep As Boolean)";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="If sql1.IsInitialized = False Then Return";
if (__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .IsInitialized()==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="Dim o() As Object = BuildQuery(True)";
_o = __ref._buildquery /*Object[]*/ (null,__c.True);
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="ImplUpdateDataFromQuery (o(0), o(1), o(2), DontSl";
__ref._implupdatedatafromquery /*void*/ (null,BA.ObjectToString(_o[(int) (0)]),_o[(int) (1)],(int)(BA.ObjectToNumber(_o[(int) (2)])),_dontsleep);
RDebugUtils.currentLine=37027845;
 //BA.debugLineNum = 37027845;BA.debugLine="End Sub";
return "";
}
public String  _setpagelabelstate(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl,boolean _enabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setpagelabelstate", true))
	 {return ((String) Debug.delegate(ba, "setpagelabelstate", new Object[] {_lbl,_enabled}));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub SetPageLabelState (lbl As B4XView, ena";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="If lbl.Tag = enabled Then Return";
if ((_lbl.getTag()).equals((Object)(_enabled))) { 
if (true) return "";};
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="lbl.Tag = enabled";
_lbl.setTag((Object)(_enabled));
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="If enabled Then";
if (_enabled) { 
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="lbl.TextColor = ArrowsEnabledColor";
_lbl.setTextColor(__ref._arrowsenabledcolor /*int*/ );
 }else {
RDebugUtils.currentLine=37552134;
 //BA.debugLineNum = 37552134;BA.debugLine="lbl.TextColor = ArrowsDisabledColor";
_lbl.setTextColor(__ref._arrowsdisabledcolor /*int*/ );
 };
RDebugUtils.currentLine=37552136;
 //BA.debugLineNum = 37552136;BA.debugLine="End Sub";
return "";
}
public String  _columntosqltype(b4a.example.ef.b4xtable __ref,b4a.example.ef.b4xtable._b4xtablecolumn _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "columntosqltype", true))
	 {return ((String) Debug.delegate(ba, "columntosqltype", new Object[] {_c}));}
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Private Sub ColumnToSQLType (c As B4XTableColumn)";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="If c.ColumnType = COLUMN_TYPE_TEXT Then Return \"T";
if (_c.ColumnType /*int*/ ==__ref._column_type_text /*int*/ ) { 
if (true) return "TEXT";}
else {
if (true) return "INTEGER";};
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Private Sub CreateCellViews As B4XView";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"cell\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"cell");
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="lbl.Initialize(\"lbl\")";
_lbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="SetMouseTransparent(lbl)";
__ref._setmousetransparent /*String*/ (null,(anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject())));
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
RDebugUtils.currentLine=38207494;
 //BA.debugLineNum = 38207494;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
_xlbl.SetTextAlignment("CENTER","CENTER");
RDebugUtils.currentLine=38207495;
 //BA.debugLineNum = 38207495;BA.debugLine="p.AddView(xlbl, 0, 0, 0, 0)";
_p.AddView((android.view.View)(_xlbl.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=38207496;
 //BA.debugLineNum = 38207496;BA.debugLine="Return p";
if (true) return _p;
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="End Sub";
return null;
}
public String  _setmousetransparent(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.objects.B4XViewWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setmousetransparent", true))
	 {return ((String) Debug.delegate(ba, "setmousetransparent", new Object[] {_lbl}));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Private Sub SetMouseTransparent (lbl As B4XView) '";
RDebugUtils.currentLine=38535173;
 //BA.debugLineNum = 38535173;BA.debugLine="End Sub";
return "";
}
public String  _createdataview(b4a.example.ef.b4xtable __ref,String _whereclause) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "createdataview", true))
	 {return ((String) Debug.delegate(ba, "createdataview", new Object[] {_whereclause}));}
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Public Sub CreateDataView (WhereClause As String)";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="sql1.ExecNonQuery(\"DROP VIEW IF EXISTS TempView\")";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("DROP VIEW IF EXISTS TempView");
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="sql1.ExecNonQuery(\"CREATE VIEW TempView AS SELECT";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery("CREATE VIEW TempView AS SELECT *, rowid FROM data WHERE "+_whereclause);
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM TempView")));
RDebugUtils.currentLine=37158916;
 //BA.debugLineNum = 37158916;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=37158917;
 //BA.debugLineNum = 37158917;BA.debugLine="SQLTableName = \"TempView\"";
__ref._sqltablename /*String*/  = "TempView";
RDebugUtils.currentLine=37158918;
 //BA.debugLineNum = 37158918;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=37158919;
 //BA.debugLineNum = 37158919;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Private Sub CreateTable";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="sb.Append(\"CREATE TABLE data (\")";
_sb.Append("CREATE TABLE data (");
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=38076421;
 //BA.debugLineNum = 38076421;BA.debugLine="For Each Column As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group5 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_column = (b4a.example.ef.b4xtable._b4xtablecolumn)(group5.Get(index5));
RDebugUtils.currentLine=38076422;
 //BA.debugLineNum = 38076422;BA.debugLine="If Column.ColumnType = COLUMN_TYPE_VOID Then Con";
if (_column.ColumnType /*int*/ ==__ref._column_type_void /*int*/ ) { 
if (true) continue;};
RDebugUtils.currentLine=38076423;
 //BA.debugLineNum = 38076423;BA.debugLine="Column.SQLID = \"c\" & i";
_column.SQLID /*String*/  = "c"+BA.NumberToString(_i);
RDebugUtils.currentLine=38076424;
 //BA.debugLineNum = 38076424;BA.debugLine="sb.Append(Column.SQLID & \" \" & ColumnToSQLType(C";
_sb.Append(_column.SQLID /*String*/ +" "+__ref._columntosqltype /*String*/ (null,_column)+",");
RDebugUtils.currentLine=38076425;
 //BA.debugLineNum = 38076425;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=38076427;
 //BA.debugLineNum = 38076427;BA.debugLine="sb.Remove(sb.Length - 1, sb.Length)";
_sb.Remove((int) (_sb.getLength()-1),_sb.getLength());
RDebugUtils.currentLine=38076428;
 //BA.debugLineNum = 38076428;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=38076429;
 //BA.debugLineNum = 38076429;BA.debugLine="sql1.ExecNonQuery(sb.ToString)";
__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery(_sb.ToString());
RDebugUtils.currentLine=38076430;
 //BA.debugLineNum = 38076430;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="mBase = Base";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="LastBaseHeight = mBase.Height";
__ref._lastbaseheight /*int*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getHeight();
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._tag /*Object*/  = __ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag();
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTag(parent);
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="LayoutLoaded = False";
__ref._layoutloaded /*boolean*/  = parent.__c.False;
RDebugUtils.currentLine=36241413;
 //BA.debugLineNum = 36241413;BA.debugLine="EvenRowColor = xui.PaintOrColorToColor(Props.Get(";
__ref._evenrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("EvenRowColor")));
RDebugUtils.currentLine=36241414;
 //BA.debugLineNum = 36241414;BA.debugLine="OddRowColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._oddrowcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("OddRowColor")));
RDebugUtils.currentLine=36241415;
 //BA.debugLineNum = 36241415;BA.debugLine="HeaderTextColor = xui.PaintOrColorToColor(Props.G";
__ref._headertextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderTextColor")));
RDebugUtils.currentLine=36241416;
 //BA.debugLineNum = 36241416;BA.debugLine="TextColor = xui.PaintOrColorToColor(Props.Get(\"Te";
__ref._textcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("TextColor")));
RDebugUtils.currentLine=36241417;
 //BA.debugLineNum = 36241417;BA.debugLine="HeaderColor = xui.PaintOrColorToColor(Props.Get(\"";
__ref._headercolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("HeaderColor")));
RDebugUtils.currentLine=36241418;
 //BA.debugLineNum = 36241418;BA.debugLine="GridColor = xui.PaintOrColorToColor(Props.Get(\"Gr";
__ref._gridcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("GridColor")));
RDebugUtils.currentLine=36241419;
 //BA.debugLineNum = 36241419;BA.debugLine="SelectionColor = xui.PaintOrColorToColor(Props.Ge";
__ref._selectioncolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.Get((Object)("SelectionColor")));
RDebugUtils.currentLine=36241420;
 //BA.debugLineNum = 36241420;BA.debugLine="HighlightTextColor = xui.PaintOrColorToColor(Prop";
__ref._highlighttextcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .PaintOrColorToColor(_props.GetDefault((Object)("HighlightTextColor"),(Object)(((int)0xffff0000))));
RDebugUtils.currentLine=36241421;
 //BA.debugLineNum = 36241421;BA.debugLine="SearchVisible = Props.GetDefault(\"SearchVisible\",";
__ref._searchvisible /*boolean*/  = BA.ObjectToBoolean(_props.GetDefault((Object)("SearchVisible"),(Object)(parent.__c.True)));
RDebugUtils.currentLine=36241422;
 //BA.debugLineNum = 36241422;BA.debugLine="If Bit.And(SelectionColor, 0xff000000) = 0 Then S";
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
RDebugUtils.currentLine=36241423;
 //BA.debugLineNum = 36241423;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "designercreateview"),(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = -1;
;
RDebugUtils.currentLine=36241424;
 //BA.debugLineNum = 36241424;BA.debugLine="mBase.LoadLayout(\"B4XTable\")";
__ref._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("B4XTable",ba);
RDebugUtils.currentLine=36241425;
 //BA.debugLineNum = 36241425;BA.debugLine="SearchField.mBase.Visible = False";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(parent.__c.False);
RDebugUtils.currentLine=36241426;
 //BA.debugLineNum = 36241426;BA.debugLine="SearchField.LargeLabelTextSize = 14";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._largelabeltextsize /*float*/  = (float) (14);
RDebugUtils.currentLine=36241427;
 //BA.debugLineNum = 36241427;BA.debugLine="SearchField.SmallLabelTextSize = 8";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._smalllabeltextsize /*float*/  = (float) (8);
RDebugUtils.currentLine=36241428;
 //BA.debugLineNum = 36241428;BA.debugLine="SearchField.Update";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._update /*String*/ (null);
RDebugUtils.currentLine=36241430;
 //BA.debugLineNum = 36241430;BA.debugLine="Dim jo As JavaObject = SearchField.TextField";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._gettextfield /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null).getObject()));
RDebugUtils.currentLine=36241431;
 //BA.debugLineNum = 36241431;BA.debugLine="jo.RunMethod(\"setImeOptions\", Array(Bit.Or(6, 0x1";
_jo.RunMethod("setImeOptions",new Object[]{(Object)(parent.__c.Bit.Or((int) (6),((int)0x10000000)))});
RDebugUtils.currentLine=36241436;
 //BA.debugLineNum = 36241436;BA.debugLine="SetMouseTransparent(lblSort)";
__ref._setmousetransparent /*String*/ (null,__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=36241437;
 //BA.debugLineNum = 36241437;BA.debugLine="clvData.AsView.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4a.example3.customlistview*/ ._asview().SetColorAndBorder((int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=36241438;
 //BA.debugLineNum = 36241438;BA.debugLine="clvData.sv.SetColorAndBorder(0, 0, 0, 0)";
__ref._clvdata /*b4a.example3.customlistview*/ ._sv.SetColorAndBorder((int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=36241439;
 //BA.debugLineNum = 36241439;BA.debugLine="lblNumber.TextColor = ArrowsEnabledColor";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(__ref._arrowsenabledcolor /*int*/ );
RDebugUtils.currentLine=36241440;
 //BA.debugLineNum = 36241440;BA.debugLine="LayoutLoaded = True";
__ref._layoutloaded /*boolean*/  = parent.__c.True;
RDebugUtils.currentLine=36241441;
 //BA.debugLineNum = 36241441;BA.debugLine="ClearNavigationState";
__ref._clearnavigationstate /*String*/ (null);
RDebugUtils.currentLine=36241442;
 //BA.debugLineNum = 36241442;BA.debugLine="Refresh2 (True, False)";
__ref._refresh2 /*String*/ (null,parent.__c.True,parent.__c.False);
RDebugUtils.currentLine=36241443;
 //BA.debugLineNum = 36241443;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Public Sub GetColumn (ColumnId As String) As B4XTa";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="For Each c As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="If c.Id = ColumnId Then Return c";
if ((_c.Id /*String*/ ).equals(_columnid)) { 
if (true) return _c;};
 }
};
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="Return c";
if (true) return _c;
RDebugUtils.currentLine=37486597;
 //BA.debugLineNum = 37486597;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentpage(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getcurrentpage", true))
	 {return ((Integer) Debug.delegate(ba, "getcurrentpage", null));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub getCurrentPage As Int";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Return mCurrentPage";
if (true) return __ref._mcurrentpage /*int*/ ;
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="End Sub";
return 0;
}
public int  _getfirstrowindex(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getfirstrowindex", true))
	 {return ((Integer) Debug.delegate(ba, "getfirstrowindex", null));}
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub getFirstRowIndex As Int";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Return mFirstRowIndex";
if (true) return __ref._mfirstrowindex /*int*/ ;
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="End Sub";
return 0;
}
public int  _getrowsperpage(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getrowsperpage", true))
	 {return ((Integer) Debug.delegate(ba, "getrowsperpage", null));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Public Sub getRowsPerPage As Int";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Return mRowsPerPage";
if (true) return __ref._mrowsperpage /*int*/ ;
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="End Sub";
return 0;
}
public int  _getsize(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="Return CountAll";
if (true) return __ref._countall /*int*/ ;
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="End Sub";
return 0;
}
public String  _updatesorticon(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesorticon", true))
	 {return ((String) Debug.delegate(ba, "updatesorticon", null));}
b4a.example.ef.b4xtable._b4xtablecolumn _col = null;
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Private Sub UpdateSortIcon";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="For Each col As B4XTableColumn In Columns";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._columns /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = (b4a.example.ef.b4xtable._b4xtablecolumn)(group1.Get(index1));
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="If col.InternalSortMode <> \"\" Then";
if ((_col.InternalSortMode /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="If lblSort.Parent <> col.Panel Then";
if ((__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getParent()).equals(_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ) == false) { 
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="lblSort.RemoveViewFromParent";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .RemoveViewFromParent();
RDebugUtils.currentLine=38797317;
 //BA.debugLineNum = 38797317;BA.debugLine="col.Panel.AddView(lblSort, 0, 0, lblSort.Width";
_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .AddView((android.view.View)(__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth(),(int) (0));
 };
RDebugUtils.currentLine=38797319;
 //BA.debugLineNum = 38797319;BA.debugLine="lblSort.Top = 0";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTop((int) (0));
RDebugUtils.currentLine=38797320;
 //BA.debugLineNum = 38797320;BA.debugLine="lblSort.Height = HeadersHeight";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setHeight(__ref._headersheight /*int*/ );
RDebugUtils.currentLine=38797321;
 //BA.debugLineNum = 38797321;BA.debugLine="lblSort.Left = col.Panel.Width - lblSort.Width";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setLeft((int) (_col.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()-__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getWidth()));
RDebugUtils.currentLine=38797322;
 //BA.debugLineNum = 38797322;BA.debugLine="lblSort.Visible = True";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=38797323;
 //BA.debugLineNum = 38797323;BA.debugLine="If col.InternalSortMode = \"ASC\" Then lblSort.Te";
if ((_col.InternalSortMode /*String*/ ).equals("ASC")) { 
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf0de))));}
else {
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__c.Chr(((int)0xf0dd))));};
RDebugUtils.currentLine=38797324;
 //BA.debugLineNum = 38797324;BA.debugLine="Return";
if (true) return "";
 };
 }
};
RDebugUtils.currentLine=38797327;
 //BA.debugLineNum = 38797327;BA.debugLine="lblSort.Visible = False";
__ref._lblsort /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=38797328;
 //BA.debugLineNum = 38797328;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="SQLIndex = SQLIndex + 1";
__ref._sqlindex /*int*/  = (int) (__ref._sqlindex /*int*/ +1);
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="If mRowsPerPage = 0 Then Return";
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
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="Dim MyIndex As Int = SQLIndex";
_myindex = __ref._sqlindex /*int*/ ;
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="If DontSleep = False Then";
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
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="Sleep(40)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "implupdatedatafromquery"),(int) (40));
this.state = 71;
return;
case 71:
//C
this.state = 10;
;
 if (true) break;
;
RDebugUtils.currentLine=37355528;
 //BA.debugLineNum = 37355528;BA.debugLine="If MyIndex <> SQLIndex Then";

case 10:
//if
this.state = 13;
if (_myindex!=__ref._sqlindex /*int*/ ) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=37355531;
 //BA.debugLineNum = 37355531;BA.debugLine="VisibleRowIds.Clear";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
RDebugUtils.currentLine=37355533;
 //BA.debugLineNum = 37355533;BA.debugLine="Dim rs As ResultSet = sql1.ExecQuery2(Query, Args";
_rs = new anywheresoftware.b4a.sql.SQL.ResultSetWrapper();
_rs = (anywheresoftware.b4a.sql.SQL.ResultSetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.ResultSetWrapper(), (android.database.Cursor)(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery2(_query,(String[])(_args))));
RDebugUtils.currentLine=37355534;
 //BA.debugLineNum = 37355534;BA.debugLine="Dim success As Boolean = True";
_success = parent.__c.True;
RDebugUtils.currentLine=37355538;
 //BA.debugLineNum = 37355538;BA.debugLine="If success Then";
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
RDebugUtils.currentLine=37355539;
 //BA.debugLineNum = 37355539;BA.debugLine="Dim RowNumber As Int = 1";
_rownumber = (int) (1);
RDebugUtils.currentLine=37355540;
 //BA.debugLineNum = 37355540;BA.debugLine="Do While RowNumber <= mRowsPerPage And rs.NextRo";
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
RDebugUtils.currentLine=37355541;
 //BA.debugLineNum = 37355541;BA.debugLine="VisibleRowIds.Add(rs.GetLong(\"rowid\"))";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rs.GetLong("rowid")));
RDebugUtils.currentLine=37355542;
 //BA.debugLineNum = 37355542;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
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
RDebugUtils.currentLine=37355543;
 //BA.debugLineNum = 37355543;BA.debugLine="Dim lbl As B4XView = GetLabelFromColumn(c, Row";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = __ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_rownumber);
RDebugUtils.currentLine=37355544;
 //BA.debugLineNum = 37355544;BA.debugLine="Select c.ColumnType";
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
RDebugUtils.currentLine=37355546;
 //BA.debugLineNum = 37355546;BA.debugLine="SetTextToCell(rs.GetString(c.SQLID), lbl, c.";
__ref._settexttocell /*String*/ (null,_rs.GetString(_c.SQLID /*String*/ ),_lbl,_c.Searchable /*boolean*/ );
 if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=37355548;
 //BA.debugLineNum = 37355548;BA.debugLine="c.Formatter.FormatLabel(rs.GetDouble(c.SQLID";
_c.Formatter /*b4a.example.ef.b4xformatter*/ ._formatlabel /*String*/ (null,_rs.GetDouble(_c.SQLID /*String*/ ),_lbl);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=37355550;
 //BA.debugLineNum = 37355550;BA.debugLine="lbl.Text = DateTime.Date(rs.GetLong(c.SQLID)";
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
RDebugUtils.currentLine=37355553;
 //BA.debugLineNum = 37355553;BA.debugLine="RowNumber = RowNumber + 1";
_rownumber = (int) (_rownumber+1);
 if (true) break;

case 32:
//C
this.state = 33;
;
RDebugUtils.currentLine=37355555;
 //BA.debugLineNum = 37355555;BA.debugLine="Dim AreThereMoreResults As Boolean = RowNumber =";
_aretheremoreresults = _rownumber==__ref._mrowsperpage /*int*/ +1 && _rs.NextRow();
RDebugUtils.currentLine=37355556;
 //BA.debugLineNum = 37355556;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=37355557;
 //BA.debugLineNum = 37355557;BA.debugLine="For i = RowNumber To mRowsPerPage";
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
RDebugUtils.currentLine=37355558;
 //BA.debugLineNum = 37355558;BA.debugLine="For Each c As B4XTableColumn In VisibleColumns";
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
RDebugUtils.currentLine=37355562;
 //BA.debugLineNum = 37355562;BA.debugLine="GetLabelFromColumn(c, i).Text = \"\"";
__ref._getlabelfromcolumn /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (null,_c,_i).setText(BA.ObjectToCharSequence(""));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 75;
;
RDebugUtils.currentLine=37355565;
 //BA.debugLineNum = 37355565;BA.debugLine="VisibleRowIds.Add(0)";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(0));
 if (true) break;
if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=37355567;
 //BA.debugLineNum = 37355567;BA.debugLine="mLastRowIndex = mFirstRowIndex - 2 + RowNumber";
__ref._mlastrowindex /*int*/  = (int) (__ref._mfirstrowindex /*int*/ -2+_rownumber);
RDebugUtils.currentLine=37355568;
 //BA.debugLineNum = 37355568;BA.debugLine="SetPageLabelState(lblLast, TotalCount >= 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_totalcount>=0);
RDebugUtils.currentLine=37355569;
 //BA.debugLineNum = 37355569;BA.debugLine="If TotalCount >= 0 Then";
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
RDebugUtils.currentLine=37355570;
 //BA.debugLineNum = 37355570;BA.debugLine="If TotalCount = 0 Then";
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
RDebugUtils.currentLine=37355571;
 //BA.debugLineNum = 37355571;BA.debugLine="lblFromTo.Text = \"\"";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 48:
//C
this.state = 49;
RDebugUtils.currentLine=37355573;
 //BA.debugLineNum = 37355573;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringoutof /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,_totalcount)))+"")));
 if (true) break;

case 49:
//C
this.state = 64;
;
RDebugUtils.currentLine=37355575;
 //BA.debugLineNum = 37355575;BA.debugLine="SetPageLabelState(lblNext, mLastRowIndex < Tota";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mlastrowindex /*int*/ <_totalcount-1);
RDebugUtils.currentLine=37355576;
 //BA.debugLineNum = 37355576;BA.debugLine="SetPageLabelState(lblLast, lblNext.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
 if (true) break;

case 51:
//C
this.state = 52;
RDebugUtils.currentLine=37355578;
 //BA.debugLineNum = 37355578;BA.debugLine="If mLastRowIndex = -1 Then";
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
RDebugUtils.currentLine=37355579;
 //BA.debugLineNum = 37355579;BA.debugLine="lblFromTo.Text = StringNoMatches";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._stringnomatches /*String*/ ));
 if (true) break;

case 56:
//C
this.state = 57;
RDebugUtils.currentLine=37355581;
 //BA.debugLineNum = 37355581;BA.debugLine="lblFromTo.Text = $\"${DefaultFormatter.Format(m";
__ref._lblfromto /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence((""+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mfirstrowindex /*int*/ +1)))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._stringto /*String*/ ))+" "+parent.__c.SmartStringFormatter("",(Object)(__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._format /*String*/ (null,__ref._mlastrowindex /*int*/ +1)))+"")));
RDebugUtils.currentLine=37355582;
 //BA.debugLineNum = 37355582;BA.debugLine="If AreThereMoreResults Then lblFromTo.Text = l";
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
RDebugUtils.currentLine=37355584;
 //BA.debugLineNum = 37355584;BA.debugLine="SetPageLabelState(lblNext, AreThereMoreResults)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,_aretheremoreresults);
RDebugUtils.currentLine=37355585;
 //BA.debugLineNum = 37355585;BA.debugLine="SetPageLabelState(lblLast, False)";
__ref._setpagelabelstate /*String*/ (null,__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,parent.__c.False);
 if (true) break;

case 64:
//C
this.state = 67;
;
RDebugUtils.currentLine=37355587;
 //BA.debugLineNum = 37355587;BA.debugLine="SetPageLabelState(lblBack, mFirstRowIndex > 0)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,__ref._mfirstrowindex /*int*/ >0);
RDebugUtils.currentLine=37355588;
 //BA.debugLineNum = 37355588;BA.debugLine="SetPageLabelState(lblFirst, lblBack.Tag)";
__ref._setpagelabelstate /*String*/ (null,__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,BA.ObjectToBoolean(__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()));
RDebugUtils.currentLine=37355589;
 //BA.debugLineNum = 37355589;BA.debugLine="mCurrentPage = Ceil(mFirstRowIndex / mRowsPerPag";
__ref._mcurrentpage /*int*/  = (int) (parent.__c.Ceil(__ref._mfirstrowindex /*int*/ /(double)__ref._mrowsperpage /*int*/ )+1);
RDebugUtils.currentLine=37355590;
 //BA.debugLineNum = 37355590;BA.debugLine="lblNumber.Text = NumberFormat(mCurrentPage, 0, 0";
__ref._lblnumber /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent.__c.NumberFormat(__ref._mcurrentpage /*int*/ ,(int) (0),(int) (0))));
RDebugUtils.currentLine=37355591;
 //BA.debugLineNum = 37355591;BA.debugLine="rs.Close";
_rs.Close();
RDebugUtils.currentLine=37355592;
 //BA.debugLineNum = 37355592;BA.debugLine="mCurrentCount = TotalCount";
__ref._mcurrentcount /*int*/  = _totalcount;
 if (true) break;

case 66:
//C
this.state = 67;
RDebugUtils.currentLine=37355594;
 //BA.debugLineNum = 37355594;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("937355594",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
;
RDebugUtils.currentLine=37355596;
 //BA.debugLineNum = 37355596;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_DataUp";

case 67:
//if
this.state = 70;
if (__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .SubExists(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated",(int) (0))) { 
this.state = 69;
}if (true) break;

case 69:
//C
this.state = 70;
RDebugUtils.currentLine=37355597;
 //BA.debugLineNum = 37355597;BA.debugLine="CallSub(mCallBack, mEventName & \"_DataUpdated\")";
parent.__c.CallSubNew(ba,__ref._mcallback /*Object*/ ,__ref._meventname /*String*/ +"_DataUpdated");
 if (true) break;

case 70:
//C
this.state = -1;
;
RDebugUtils.currentLine=37355599;
 //BA.debugLineNum = 37355599;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Private Sub SetTextToCell (Text As String, lbl As";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="If Searchable = False Or HighlightSearchResults =";
if (_searchable==__c.False || __ref._highlightsearchresults /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 }else {
RDebugUtils.currentLine=37421066;
 //BA.debugLineNum = 37421066;BA.debugLine="If FilterText = \"\" Then";
if ((__ref._filtertext /*String*/ ).equals("")) { 
RDebugUtils.currentLine=37421067;
 //BA.debugLineNum = 37421067;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
 }else {
RDebugUtils.currentLine=37421069;
 //BA.debugLineNum = 37421069;BA.debugLine="Dim x As Int = Text.ToLowerCase.IndexOf(FilterT";
_x = _text.toLowerCase().indexOf(__ref._filtertext /*String*/ );
RDebugUtils.currentLine=37421070;
 //BA.debugLineNum = 37421070;BA.debugLine="If x = -1 Or (PrefixSearch And x > 0) Then";
if (_x==-1 || (__ref._prefixsearch /*boolean*/  && _x>0)) { 
RDebugUtils.currentLine=37421071;
 //BA.debugLineNum = 37421071;BA.debugLine="lbl.Text = Text";
_lbl.setText(BA.ObjectToCharSequence(_text));
RDebugUtils.currentLine=37421072;
 //BA.debugLineNum = 37421072;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=37421076;
 //BA.debugLineNum = 37421076;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
RDebugUtils.currentLine=37421077;
 //BA.debugLineNum = 37421077;BA.debugLine="cs.Initialize.Append(Text.SubString2(0, x)).Col";
_cs.Initialize().Append(BA.ObjectToCharSequence(_text.substring((int) (0),_x))).Color(__ref._highlighttextcolor /*int*/ ).Append(BA.ObjectToCharSequence(_text.substring(_x,(int) (_x+__ref._filtertext /*String*/ .length())))).Pop();
RDebugUtils.currentLine=37421078;
 //BA.debugLineNum = 37421078;BA.debugLine="cs.Append(Text.SubString(x + FilterText.Length)";
_cs.Append(BA.ObjectToCharSequence(_text.substring((int) (_x+__ref._filtertext /*String*/ .length()))));
RDebugUtils.currentLine=37421080;
 //BA.debugLineNum = 37421080;BA.debugLine="lbl.Text = cs";
_lbl.setText(BA.ObjectToCharSequence(_cs.getObject()));
 };
 };
RDebugUtils.currentLine=37421102;
 //BA.debugLineNum = 37421102;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.ef.b4xtable __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="mCallBack = Callback";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="Columns.Initialize";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="DefaultFormatter.Initialize";
__ref._defaultformatter /*b4a.example.ef.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="DefaultDataFormatter.Initialize";
__ref._defaultdataformatter /*b4a.example.ef.b4xformatter*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="VisibleColumns.Initialize";
__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="HeaderFont = xui.CreateDefaultBoldFont(15)";
__ref._headerfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultBoldFont((float) (15));
RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="LabelsFont = xui.CreateDefaultFont(15)";
__ref._labelsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (15));
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="ArrowsDisabledColor = 0xFFBBBBBB";
__ref._arrowsdisabledcolor /*int*/  = ((int)0xffbbbbbb);
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="ArrowsEnabledColor = xui.Color_Black";
__ref._arrowsenabledcolor /*int*/  = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_Black;
RDebugUtils.currentLine=36175883;
 //BA.debugLineNum = 36175883;BA.debugLine="VisibleRowIds.Initialize";
__ref._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=36175884;
 //BA.debugLineNum = 36175884;BA.debugLine="MinimumWidth = 140dip";
__ref._minimumwidth /*int*/  = __c.DipToCurrent((int) (140));
RDebugUtils.currentLine=36175885;
 //BA.debugLineNum = 36175885;BA.debugLine="RowHeight = 40dip";
__ref._rowheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=36175886;
 //BA.debugLineNum = 36175886;BA.debugLine="HeadersHeight = 40dip";
__ref._headersheight /*int*/  = __c.DipToCurrent((int) (40));
RDebugUtils.currentLine=36175892;
 //BA.debugLineNum = 36175892;BA.debugLine="End Sub";
return "";
}
public String  _lbl_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbl_click", true))
	 {return ((String) Debug.delegate(ba, "lbl_click", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub lbl_Click";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="CellClicked(lbl.Parent, False)";
__ref._cellclicked /*void*/ (null,_lbl.getParent(),__c.False);
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="End Sub";
return "";
}
public String  _lbl_longclick(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbl_longclick", true))
	 {return ((String) Debug.delegate(ba, "lbl_longclick", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _lbl = null;
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub lbl_LongClick";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Dim lbl As B4XView = Sender";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="CellClicked(lbl.Parent, True)";
__ref._cellclicked /*void*/ (null,_lbl.getParent(),__c.True);
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="End Sub";
return "";
}
public String  _lblback_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblback_click", true))
	 {return ((String) Debug.delegate(ba, "lblback_click", null));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Private Sub lblBack_Click";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="If lblBack.Tag = False Then Return";
if ((__ref._lblback /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="setFirstRowIndex (mFirstRowIndex - mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ -__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="End Sub";
return "";
}
public String  _setfirstrowindex(b4a.example.ef.b4xtable __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "setfirstrowindex", true))
	 {return ((String) Debug.delegate(ba, "setfirstrowindex", new Object[] {_row}));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Public Sub setFirstRowIndex (row As Int)";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="row = Max(0, Min(CountAll - 1, row))";
_row = (int) (__c.Max(0,__c.Min(__ref._countall /*int*/ -1,_row)));
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="mFirstRowIndex = row";
__ref._mfirstrowindex /*int*/  = _row;
RDebugUtils.currentLine=38928387;
 //BA.debugLineNum = 38928387;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,__c.False);
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="End Sub";
return "";
}
public String  _lblfirst_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblfirst_click", true))
	 {return ((String) Debug.delegate(ba, "lblfirst_click", null));}
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Private Sub lblFirst_Click";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="If lblFirst.Tag = False Then Return";
if ((__ref._lblfirst /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="setFirstRowIndex (0)";
__ref._setfirstrowindex /*String*/ (null,(int) (0));
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="End Sub";
return "";
}
public String  _lbllast_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lbllast_click", true))
	 {return ((String) Debug.delegate(ba, "lbllast_click", null));}
int _numberofpages = 0;
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub lblLast_Click";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="If lblLast.Tag = False Then Return";
if ((__ref._lbllast /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="Dim NumberOfPages As Int = Ceil(mCurrentCount / m";
_numberofpages = (int) (__c.Ceil(__ref._mcurrentcount /*int*/ /(double)__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="setFirstRowIndex ((NumberOfPages - 1) * mRowsPerP";
__ref._setfirstrowindex /*String*/ (null,(int) ((_numberofpages-1)*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=39387140;
 //BA.debugLineNum = 39387140;BA.debugLine="End Sub";
return "";
}
public String  _lblnext_click(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "lblnext_click", true))
	 {return ((String) Debug.delegate(ba, "lblnext_click", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Private Sub lblNext_Click";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="If lblNext.Tag = False Then Return";
if ((__ref._lblnext /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTag()).equals((Object)(__c.False))) { 
if (true) return "";};
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="setFirstRowIndex (mFirstRowIndex + mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) (__ref._mfirstrowindex /*int*/ +__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=39452675;
 //BA.debugLineNum = 39452675;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Public Sub Refresh";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Refresh2(True, False)";
__ref._refresh2 /*String*/ (null,__c.True,__c.False);
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Private Sub ResizeColumnImpl (c As B4XTableColumn,";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="c.Panel.Width = c.ComputedWidth";
_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setWidth(_c.ComputedWidth /*int*/ );
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="Dim Height As Float = TotalHeight / mRowsPerPage";
_height = (float) (_totalheight/(double)__ref._mrowsperpage /*int*/ );
RDebugUtils.currentLine=36962308;
 //BA.debugLineNum = 36962308;BA.debugLine="If AllowSmallRowHeightModifications = False Then";
if (__ref._allowsmallrowheightmodifications /*boolean*/ ==__c.False) { 
_height = (float) (__ref._rowheight /*int*/ );};
RDebugUtils.currentLine=36962309;
 //BA.debugLineNum = 36962309;BA.debugLine="Dim TopInt, HeightInt As Int";
_topint = 0;
_heightint = 0;
RDebugUtils.currentLine=36962310;
 //BA.debugLineNum = 36962310;BA.debugLine="For i = 0 To c.CellsLayouts.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=36962311;
 //BA.debugLineNum = 36962311;BA.debugLine="Dim p As B4XView = c.CellsLayouts.Get(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_c.CellsLayouts /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=36962312;
 //BA.debugLineNum = 36962312;BA.debugLine="If i < mRowsPerPage + 1 Then";
if (_i<__ref._mrowsperpage /*int*/ +1) { 
RDebugUtils.currentLine=36962313;
 //BA.debugLineNum = 36962313;BA.debugLine="Dim HeightInt As Int = Round(Height * i + Heade";
_heightint = (int) (__c.Round(_height*_i+__ref._headersheight /*int*/ -_topint));
RDebugUtils.currentLine=36962314;
 //BA.debugLineNum = 36962314;BA.debugLine="If i = 0 Then HeightInt = HeadersHeight";
if (_i==0) { 
_heightint = __ref._headersheight /*int*/ ;};
RDebugUtils.currentLine=36962315;
 //BA.debugLineNum = 36962315;BA.debugLine="p.SetLayoutAnimated(0, 0, TopInt, c.ComputedWid";
_p.SetLayoutAnimated((int) (0),(int) (0),_topint,_c.ComputedWidth /*int*/ ,_heightint);
RDebugUtils.currentLine=36962316;
 //BA.debugLineNum = 36962316;BA.debugLine="p.Visible = True";
_p.setVisible(__c.True);
RDebugUtils.currentLine=36962317;
 //BA.debugLineNum = 36962317;BA.debugLine="If c.DisableAutoResizeLayout = False Then";
if (_c.DisableAutoResizeLayout /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=36962318;
 //BA.debugLineNum = 36962318;BA.debugLine="Dim lbl As B4XView = p.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_lbl = _p.GetView((int) (0));
RDebugUtils.currentLine=36962319;
 //BA.debugLineNum = 36962319;BA.debugLine="lbl.SetLayoutAnimated(0, 0, 0, p.Width, p.Heig";
_lbl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_p.getWidth(),_p.getHeight());
 };
RDebugUtils.currentLine=36962326;
 //BA.debugLineNum = 36962326;BA.debugLine="TopInt = TopInt + HeightInt";
_topint = (int) (_topint+_heightint);
 }else {
RDebugUtils.currentLine=36962328;
 //BA.debugLineNum = 36962328;BA.debugLine="p.Visible = False";
_p.setVisible(__c.False);
 };
 }
};
RDebugUtils.currentLine=36962331;
 //BA.debugLineNum = 36962331;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Private Sub ResizeAndReorderCLVItems";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="Dim i As Int = NumberOfFrozenColumns";
_i = __ref._numberoffrozencolumns /*int*/ ;
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="Do While i < VisibleColumns.Size";
while (_i<__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()) {
RDebugUtils.currentLine=36700163;
 //BA.debugLineNum = 36700163;BA.debugLine="Dim c As B4XTableColumn = VisibleColumns.Get(i)";
_c = (b4a.example.ef.b4xtable._b4xtablecolumn)(__ref._visiblecolumns /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=36700164;
 //BA.debugLineNum = 36700164;BA.debugLine="Dim CLVIndex As Int = i - NumberOfFrozenColumns";
_clvindex = (int) (_i-__ref._numberoffrozencolumns /*int*/ );
RDebugUtils.currentLine=36700165;
 //BA.debugLineNum = 36700165;BA.debugLine="If c <> clvData.GetValue(CLVIndex) Then";
if ((_c).equals((b4a.example.ef.b4xtable._b4xtablecolumn)(__ref._clvdata /*b4a.example3.customlistview*/ ._getvalue(_clvindex))) == false) { 
RDebugUtils.currentLine=36700166;
 //BA.debugLineNum = 36700166;BA.debugLine="RemoveColumnFromCLV(c)";
__ref._removecolumnfromclv /*String*/ (null,_c);
RDebugUtils.currentLine=36700167;
 //BA.debugLineNum = 36700167;BA.debugLine="clvData.InsertAt(CLVIndex, c.Panel, c)";
__ref._clvdata /*b4a.example3.customlistview*/ ._insertat(_clvindex,_c.Panel /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ,(Object)(_c));
 }else {
RDebugUtils.currentLine=36700169;
 //BA.debugLineNum = 36700169;BA.debugLine="clvData.ResizeItem(CLVIndex, c.ComputedWidth)";
__ref._clvdata /*b4a.example3.customlistview*/ ._resizeitem(_clvindex,_c.ComputedWidth /*int*/ );
 };
RDebugUtils.currentLine=36700171;
 //BA.debugLineNum = 36700171;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
RDebugUtils.currentLine=36700173;
 //BA.debugLineNum = 36700173;BA.debugLine="End Sub";
return "";
}
public String  _updatesearchfieldvisibility(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatesearchfieldvisibility", true))
	 {return ((String) Debug.delegate(ba, "updatesearchfieldvisibility", null));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Private Sub UpdateSearchFieldVisibility";
RDebugUtils.currentLine=36765700;
 //BA.debugLineNum = 36765700;BA.debugLine="SearchField.mBase.Visible = SearchVisible And Cou";
__ref._searchfield /*b4a.example.ef.b4xfloattextfield*/ ._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setVisible(__ref._searchvisible /*boolean*/  && __ref._countall /*int*/ >0);
RDebugUtils.currentLine=36765701;
 //BA.debugLineNum = 36765701;BA.debugLine="End Sub";
return "";
}
public String  _refreshnow(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "refreshnow", true))
	 {return ((String) Debug.delegate(ba, "refreshnow", null));}
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub RefreshNow";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="Refresh2(True, True)";
__ref._refresh2 /*String*/ (null,__c.True,__c.True);
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="SearchIndex = SearchIndex + 1";
__ref._searchindex /*int*/  = (int) (__ref._searchindex /*int*/ +1);
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="Dim MyIndex As Int = SearchIndex";
_myindex = __ref._searchindex /*int*/ ;
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="Sleep(SleepBeforeSearch)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "b4xtable", "searchfield_textchanged"),__ref._sleepbeforesearch /*int*/ );
this.state = 11;
return;
case 11:
//C
this.state = 1;
;
RDebugUtils.currentLine=39518212;
 //BA.debugLineNum = 39518212;BA.debugLine="If MyIndex <> SearchIndex Then";
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
RDebugUtils.currentLine=39518213;
 //BA.debugLineNum = 39518213;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
RDebugUtils.currentLine=39518215;
 //BA.debugLineNum = 39518215;BA.debugLine="Dim term As String = New.ToLowerCase";
_term = _new.toLowerCase();
RDebugUtils.currentLine=39518216;
 //BA.debugLineNum = 39518216;BA.debugLine="If term = FilterText Then Return";
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
RDebugUtils.currentLine=39518217;
 //BA.debugLineNum = 39518217;BA.debugLine="FilterText = term";
__ref._filtertext /*String*/  = _term;
RDebugUtils.currentLine=39518218;
 //BA.debugLineNum = 39518218;BA.debugLine="mFirstRowIndex = 0";
__ref._mfirstrowindex /*int*/  = (int) (0);
RDebugUtils.currentLine=39518219;
 //BA.debugLineNum = 39518219;BA.debugLine="UpdateData (False)";
__ref._updatedata /*String*/ (null,parent.__c.False);
RDebugUtils.currentLine=39518220;
 //BA.debugLineNum = 39518220;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Public Sub setCurrentPage(p As Int)";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="setFirstRowIndex((p - 1) * mRowsPerPage)";
__ref._setfirstrowindex /*String*/ (null,(int) ((_p-1)*__ref._mrowsperpage /*int*/ ));
RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="End Sub";
return "";
}
public String  _updatetablecounters(b4a.example.ef.b4xtable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xtable";
if (Debug.shouldDelegate(ba, "updatetablecounters", true))
	 {return ((String) Debug.delegate(ba, "updatetablecounters", null));}
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Public Sub UpdateTableCounters";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="CountAll = sql1.ExecQuerySingleResult(\"SELECT cou";
__ref._countall /*int*/  = (int)(Double.parseDouble(__ref._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM data")));
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="UpdateData (True)";
__ref._updatedata /*String*/ (null,__c.True);
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="End Sub";
return "";
}
}