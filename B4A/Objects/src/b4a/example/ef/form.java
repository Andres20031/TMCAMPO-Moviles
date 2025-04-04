package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class form extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.form");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.form.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public String _nitupdate = "";
public String _haciendaupdate = "";
public int _idmaquina = 0;
public String _tipo = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public lib.intellvold.datepicker.DatePicker _datepicker = null;
public lib.intellvold.datepicker.clander _mycalendar = null;
public lib.intellvold.datepicker.TimePicker _timepicker = null;
public lib.intellvold.datepicker.DatePicker _datepicker2 = null;
public lib.intellvold.datepicker.clander _mycalendar2 = null;
public b4a.example.ef.util _utilclass = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinnernit = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2area = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1cmb = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2horafim = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1horainicio = null;
public String _nit = "";
public String _hacienda = "";
public String _lote = "";
public String _rdclink = "";
public b4a.example3.customlistview _customlistview1geral = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1geral = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14add = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1addisumo = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1removeinsumo = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1empty = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2insumoname = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2qntinsumo = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1nameinsumo = null;
public int _intcontadorinsumos = 0;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxnit = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxhda = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlote = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlabor = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxelegasto = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.form __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return null;
}
public void  _b4xpage_appear(b4a.example.ef.form __ref) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.form parent,b4a.example.ef.form __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
String _estado = "";
int step14;
int limit14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 16;
this.catchState = 15;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 15;
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="nitUpdate=\"\"";
__ref._nitupdate /*String*/  = "";
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="haciendaUpdate=\"\"";
__ref._haciendaupdate /*String*/  = "";
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB4008";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whi";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "b4xpage_appear"),(int) (20));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="If tipo=\"update\" Then";
if (true) break;

case 4:
//if
this.state = 13;
if ((__ref._tipo /*String*/ ).equals("update")) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina where id="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 7:
//for
this.state = 10;
step14 = 1;
limit14 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if ((step14 > 0 && _i <= limit14) || (step14 < 0 && _i >= limit14)) this.state = 9;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step14)) ;
if (true) break;

case 9:
//C
this.state = 19;
RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=11206678;
 //BA.debugLineNum = 11206678;BA.debugLine="Label10.text=Cursor.GetString(\"fechaInicio\")";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaInicio")));
RDebugUtils.currentLine=11206679;
 //BA.debugLineNum = 11206679;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
RDebugUtils.currentLine=11206680;
 //BA.debugLineNum = 11206680;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
RDebugUtils.currentLine=11206681;
 //BA.debugLineNum = 11206681;BA.debugLine="EditText1HoraInicio.text=Cursor.GetString(\"are";
__ref._edittext1horainicio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("arealabor")));
RDebugUtils.currentLine=11206682;
 //BA.debugLineNum = 11206682;BA.debugLine="nitUpdate=Cursor.GetString(\"Nit\")";
__ref._nitupdate /*String*/  = _cursor.GetString("Nit");
RDebugUtils.currentLine=11206683;
 //BA.debugLineNum = 11206683;BA.debugLine="haciendaUpdate=Cursor.GetString(\"hacienda\")";
__ref._haciendaupdate /*String*/  = _cursor.GetString("hacienda");
RDebugUtils.currentLine=11206685;
 //BA.debugLineNum = 11206685;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("411206685","NIT: "+__ref._nitupdate /*String*/ ,0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 13;
;
 if (true) break;

case 12:
//C
this.state = 13;
RDebugUtils.currentLine=11206688;
 //BA.debugLineNum = 11206688;BA.debugLine="Log(\"NIT: \"&nit)";
parent.__c.LogImpl("411206688","NIT: "+__ref._nit /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 16;
;
RDebugUtils.currentLine=11206691;
 //BA.debugLineNum = 11206691;BA.debugLine="Dim estado As String";
_estado = "";
RDebugUtils.currentLine=11206694;
 //BA.debugLineNum = 11206694;BA.debugLine="estado = \"N\"";
_estado = "N";
RDebugUtils.currentLine=11206695;
 //BA.debugLineNum = 11206695;BA.debugLine="GetRecordNits(Main.pDBName,estado)";
__ref._getrecordnits /*void*/ (null,parent._main._pdbname /*String*/ ,_estado);
RDebugUtils.currentLine=11206696;
 //BA.debugLineNum = 11206696;BA.debugLine="GetRecordHaciendas(Main.pDBName,estado)";
__ref._getrecordhaciendas /*void*/ (null,parent._main._pdbname /*String*/ ,_estado);
RDebugUtils.currentLine=11206697;
 //BA.debugLineNum = 11206697;BA.debugLine="GetRecordLabores(Main.pDBName)";
__ref._getrecordlabores /*void*/ (null,parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=11206698;
 //BA.debugLineNum = 11206698;BA.debugLine="GetRecordElegasto(Main.pDBName)";
__ref._getrecordelegasto /*void*/ (null,parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=11206699;
 //BA.debugLineNum = 11206699;BA.debugLine="intContadorInsumos=0";
__ref._intcontadorinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=11206700;
 //BA.debugLineNum = 11206700;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=11206702;
 //BA.debugLineNum = 11206702;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("411206702",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=11206705;
 //BA.debugLineNum = 11206705;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="panel.LoadLayout(\"scroolUI\")";
_panel.LoadLayout("scroolUI",ba);
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=11534368;
 //BA.debugLineNum = 11534368;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=11534369;
 //BA.debugLineNum = 11534369;BA.debugLine="End Sub";
return null;
}
public void  _getrecordnits(b4a.example.ef.form __ref,String _usedb,String _estado) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "getrecordnits", false))
	 {Debug.delegate(ba, "getrecordnits", new Object[] {_usedb,_estado}); return;}
ResumableSub_GetRecordNits rsub = new ResumableSub_GetRecordNits(this,__ref,_usedb,_estado);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordNits extends BA.ResumableSub {
public ResumableSub_GetRecordNits(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _usedb,String _estado) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._estado = _estado;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _usedb;
String _estado;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _separador = "";
int _longitud = 0;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
int _intregistros = 0;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group13;
int index13;
int groupLen13;
Object[] group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordnits"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12779532;
 //BA.debugLineNum = 12779532;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordnits"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12779535;
 //BA.debugLineNum = 12779535;BA.debugLine="SD_xComboBoxNit.Add(\"----Select----\",\"1\")";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=12779536;
 //BA.debugLineNum = 12779536;BA.debugLine="Dim INTRegistros As Int";
_intregistros = 0;
RDebugUtils.currentLine=12779538;
 //BA.debugLineNum = 12779538;BA.debugLine="INTRegistros=0";
_intregistros = (int) (0);
RDebugUtils.currentLine=12779539;
 //BA.debugLineNum = 12779539;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 17;
group13 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index13 = 0;
groupLen13 = group13.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 17;
if (index13 < groupLen13) {
this.state = 6;
_row = (Object[])(group13.Get(index13));}
if (true) break;

case 24:
//C
this.state = 23;
index13++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=12779540;
 //BA.debugLineNum = 12779540;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=12779541;
 //BA.debugLineNum = 12779541;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=12779542;
 //BA.debugLineNum = 12779542;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group16 = _row;
index16 = 0;
groupLen16 = group16.length;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index16 < groupLen16) {
this.state = 9;
_record = group16[index16];}
if (true) break;

case 26:
//C
this.state = 25;
index16++;
if (true) break;

case 9:
//C
this.state = 26;
RDebugUtils.currentLine=12779544;
 //BA.debugLineNum = 12779544;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=12779546;
 //BA.debugLineNum = 12779546;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=12779547;
 //BA.debugLineNum = 12779547;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=12779548;
 //BA.debugLineNum = 12779548;BA.debugLine="INTRegistros=INTRegistros+1";
_intregistros = (int) (_intregistros+1);
RDebugUtils.currentLine=12779549;
 //BA.debugLineNum = 12779549;BA.debugLine="If nitUpdate=cadena Then";
if (true) break;

case 11:
//if
this.state = 16;
if ((__ref._nitupdate /*String*/ ).equals(_cadena)) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=12779550;
 //BA.debugLineNum = 12779550;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("412779550","NIT: "+__ref._nitupdate /*String*/ ,0);
RDebugUtils.currentLine=12779553;
 //BA.debugLineNum = 12779553;BA.debugLine="SD_xComboBoxNit.Add(nitUpdate,INTRegistros)";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,__ref._nitupdate /*String*/ ,(Object)(_intregistros));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12779555;
 //BA.debugLineNum = 12779555;BA.debugLine="SD_xComboBoxNit.Add(cadena,INTRegistros)";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(_intregistros));
RDebugUtils.currentLine=12779556;
 //BA.debugLineNum = 12779556;BA.debugLine="cadena=\"\"";
_cadena = "";
 if (true) break;

case 16:
//C
this.state = 24;
;
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=12779562;
 //BA.debugLineNum = 12779562;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("412779562","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=12779564;
 //BA.debugLineNum = 12779564;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12779565;
 //BA.debugLineNum = 12779565;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordhaciendas(b4a.example.ef.form __ref,String _usedb,String _estado) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "getrecordhaciendas", false))
	 {Debug.delegate(ba, "getrecordhaciendas", new Object[] {_usedb,_estado}); return;}
ResumableSub_GetRecordHaciendas rsub = new ResumableSub_GetRecordHaciendas(this,__ref,_usedb,_estado);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordHaciendas extends BA.ResumableSub {
public ResumableSub_GetRecordHaciendas(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _usedb,String _estado) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._estado = _estado;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _usedb;
String _estado;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _separador = "";
int _longitud = 0;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group12;
int index12;
int groupLen12;
Object[] group15;
int index15;
int groupLen15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(_estado)});
RDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 20;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 19;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordhaciendas"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12845071;
 //BA.debugLineNum = 12845071;BA.debugLine="SD_xComboBoxHda.Add(\"----Select----\",1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=12845072;
 //BA.debugLineNum = 12845072;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\",1)";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=12845073;
 //BA.debugLineNum = 12845073;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 17;
group12 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index12 = 0;
groupLen12 = group12.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 17;
if (index12 < groupLen12) {
this.state = 6;
_row = (Object[])(group12.Get(index12));}
if (true) break;

case 24:
//C
this.state = 23;
index12++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=12845075;
 //BA.debugLineNum = 12845075;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=12845076;
 //BA.debugLineNum = 12845076;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group15 = _row;
index15 = 0;
groupLen15 = group15.length;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 10;
if (index15 < groupLen15) {
this.state = 9;
_record = group15[index15];}
if (true) break;

case 26:
//C
this.state = 25;
index15++;
if (true) break;

case 9:
//C
this.state = 26;
RDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=12845082;
 //BA.debugLineNum = 12845082;BA.debugLine="Log(\"cadena: \"&cadena)";
parent.__c.LogImpl("412845082","cadena: "+_cadena,0);
RDebugUtils.currentLine=12845083;
 //BA.debugLineNum = 12845083;BA.debugLine="Log(\"hacienda: \"&haciendaUpdate)";
parent.__c.LogImpl("412845083","hacienda: "+__ref._haciendaupdate /*String*/ ,0);
RDebugUtils.currentLine=12845084;
 //BA.debugLineNum = 12845084;BA.debugLine="If cadena.Contains(haciendaUpdate) Then";
if (true) break;

case 11:
//if
this.state = 16;
if (_cadena.contains(__ref._haciendaupdate /*String*/ )) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
RDebugUtils.currentLine=12845085;
 //BA.debugLineNum = 12845085;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=12845086;
 //BA.debugLineNum = 12845086;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=12845087;
 //BA.debugLineNum = 12845087;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=12845089;
 //BA.debugLineNum = 12845089;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=12845090;
 //BA.debugLineNum = 12845090;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=12845091;
 //BA.debugLineNum = 12845091;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
 if (true) break;

case 16:
//C
this.state = 24;
;
RDebugUtils.currentLine=12845094;
 //BA.debugLineNum = 12845094;BA.debugLine="cadena=\"\"";
_cadena = "";
 if (true) break;
if (true) break;

case 17:
//C
this.state = 20;
;
 if (true) break;

case 19:
//C
this.state = 20;
RDebugUtils.currentLine=12845098;
 //BA.debugLineNum = 12845098;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("412845098","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=12845100;
 //BA.debugLineNum = 12845100;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12845101;
 //BA.debugLineNum = 12845101;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlabores(b4a.example.ef.form __ref,String _usedb) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "getrecordlabores", false))
	 {Debug.delegate(ba, "getrecordlabores", new Object[] {_usedb}); return;}
ResumableSub_GetRecordLabores rsub = new ResumableSub_GetRecordLabores(this,__ref,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLabores extends BA.ResumableSub {
public ResumableSub_GetRecordLabores(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _usedb;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _separador = "";
int _longitud = 0;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;
Object[] group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=13172741;
 //BA.debugLineNum = 13172741;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=13172742;
 //BA.debugLineNum = 13172742;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=13172744;
 //BA.debugLineNum = 13172744;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13172745;
 //BA.debugLineNum = 13172745;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13172746;
 //BA.debugLineNum = 13172746;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=13172747;
 //BA.debugLineNum = 13172747;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=13172750;
 //BA.debugLineNum = 13172750;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\",1)";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=13172752;
 //BA.debugLineNum = 13172752;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13172753;
 //BA.debugLineNum = 13172753;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=13172754;
 //BA.debugLineNum = 13172754;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=13172755;
 //BA.debugLineNum = 13172755;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group14 = _row;
index14 = 0;
groupLen14 = group14.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index14 < groupLen14) {
this.state = 9;
_record = group14[index14];}
if (true) break;

case 20:
//C
this.state = 19;
index14++;
if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=13172756;
 //BA.debugLineNum = 13172756;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=13172758;
 //BA.debugLineNum = 13172758;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=13172759;
 //BA.debugLineNum = 13172759;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=13172760;
 //BA.debugLineNum = 13172760;BA.debugLine="SD_xComboBoxLabor.Add(cadena,1)";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
RDebugUtils.currentLine=13172761;
 //BA.debugLineNum = 13172761;BA.debugLine="cadena=\"\"";
_cadena = "";
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=13172765;
 //BA.debugLineNum = 13172765;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("413172765","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=13172767;
 //BA.debugLineNum = 13172767;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=13172768;
 //BA.debugLineNum = 13172768;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordelegasto(b4a.example.ef.form __ref,String _usedb) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "getrecordelegasto", false))
	 {Debug.delegate(ba, "getrecordelegasto", new Object[] {_usedb}); return;}
ResumableSub_GetRecordElegasto rsub = new ResumableSub_GetRecordElegasto(this,__ref,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordElegasto extends BA.ResumableSub {
public ResumableSub_GetRecordElegasto(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _usedb;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _separador = "";
int _longitud = 0;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;
Object[] group14;
int index14;
int groupLen14;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_eleg";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elegasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=13238277;
 //BA.debugLineNum = 13238277;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=13238278;
 //BA.debugLineNum = 13238278;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=13238280;
 //BA.debugLineNum = 13238280;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordelegasto"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13238281;
 //BA.debugLineNum = 13238281;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13238282;
 //BA.debugLineNum = 13238282;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=13238283;
 //BA.debugLineNum = 13238283;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordelegasto"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=13238286;
 //BA.debugLineNum = 13238286;BA.debugLine="SD_xComboBoxEleGasto.Add(\"----Select----\",1)";
__ref._sd_xcomboboxelegasto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=13238287;
 //BA.debugLineNum = 13238287;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 18:
//C
this.state = 17;
index11++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13238288;
 //BA.debugLineNum = 13238288;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=13238289;
 //BA.debugLineNum = 13238289;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=13238290;
 //BA.debugLineNum = 13238290;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group14 = _row;
index14 = 0;
groupLen14 = group14.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index14 < groupLen14) {
this.state = 9;
_record = group14[index14];}
if (true) break;

case 20:
//C
this.state = 19;
index14++;
if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=13238291;
 //BA.debugLineNum = 13238291;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=13238293;
 //BA.debugLineNum = 13238293;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=13238294;
 //BA.debugLineNum = 13238294;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=13238295;
 //BA.debugLineNum = 13238295;BA.debugLine="SD_xComboBoxEleGasto.Add(cadena,1)";
__ref._sd_xcomboboxelegasto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
RDebugUtils.currentLine=13238296;
 //BA.debugLineNum = 13238296;BA.debugLine="cadena=\"\"";
_cadena = "";
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=13238300;
 //BA.debugLineNum = 13238300;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("413238300","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=13238302;
 //BA.debugLineNum = 13238302;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=13238303;
 //BA.debugLineNum = 13238303;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _listinsumos(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "listinsumos", false))
	 {return ((String) Debug.delegate(ba, "listinsumos", null));}
int _numberofmatches = 0;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int _id = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub listInsumos";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="removeAllExcelpFist";
__ref._removeallexcelpfist /*String*/ (null);
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="Dim NumberOfMatches As Int";
_numberofmatches = 0;
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="NumberOfMatches = Starter.SQL1.ExecQuerySingleRes";
_numberofmatches = (int)(Double.parseDouble(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="CustomListView1Geral.DesignerLabel.Height=8dip";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._designerlabel.setHeight(__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="CustomListView1Geral.AddTextItem(\"Insumos(\"&Numbe";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._addtextitem((Object)("Insumos("+BA.NumberToString(_numberofmatches)+")"),(Object)("title"));
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="Dim	id As Int=Cursor.GetString(\"id\")";
_id = (int)(Double.parseDouble(_cursor.GetString("id")));
RDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("411272205",_cursor.GetString("id"),0);
RDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="Log(Cursor.GetString(\"name\"))";
__c.LogImpl("411272206",_cursor.GetString("name"),0);
RDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="Log(Cursor.GetString(\"qnt\"))";
__c.LogImpl("411272207",_cursor.GetString("qnt"),0);
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumos(i+1,i";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumos /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,(int) (_i+1),_id,_cursor.GetString("name"),_cursor.GetString("qnt")).getObject())),(Object)("insumo"));
 }
};
RDebugUtils.currentLine=11272212;
 //BA.debugLineNum = 11272212;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=11272215;
 //BA.debugLineNum = 11272215;BA.debugLine="panel.LoadLayout(\"emptyInsumos\")";
_panel.LoadLayout("emptyInsumos",ba);
RDebugUtils.currentLine=11272216;
 //BA.debugLineNum = 11272216;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=11272217;
 //BA.debugLineNum = 11272217;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=11272218;
 //BA.debugLineNum = 11272218;BA.debugLine="Label1Empty.Visible=True";
__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=11272220;
 //BA.debugLineNum = 11272220;BA.debugLine="Label1Empty.Visible=False";
__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11272221;
 //BA.debugLineNum = 11272221;BA.debugLine="Button1AddIsumo.Top=Label1Empty.top";
__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTop(__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop());
RDebugUtils.currentLine=11272222;
 //BA.debugLineNum = 11272222;BA.debugLine="panel.Height=Button1AddIsumo.Height";
_panel.setHeight(__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=11272227;
 //BA.debugLineNum = 11272227;BA.debugLine="CustomListView1Geral.Add(panel,0)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add(_panel,(Object)(0));
RDebugUtils.currentLine=11272228;
 //BA.debugLineNum = 11272228;BA.debugLine="CustomListView1Geral.ScrollToItem(CustomListView1";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=11272232;
 //BA.debugLineNum = 11272232;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.form __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=11141136;
 //BA.debugLineNum = 11141136;BA.debugLine="End Sub";
return "";
}
public String  _button1addisumo_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "button1addisumo_click", false))
	 {return ((String) Debug.delegate(ba, "button1addisumo_click", null));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub Button1AddIsumo_Click";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Try";
try {RDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="Button1AddIsumo=Sender";
__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"INSERT INTO insumo V";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO insumo VALUES (?, ?, ?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,(Object)("NO NAME"),(Object)("0"),(Object)(__ref._idmaquina /*int*/ )}));
RDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="intContadorInsumos=	intContadorInsumos + 1";
__ref._intcontadorinsumos /*int*/  = (int) (__ref._intcontadorinsumos /*int*/ +1);
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="Log(LastException)";
__c.LogImpl("413631496",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="End Sub";
return "";
}
public String  _can_oncanceldate(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "can_oncanceldate", false))
	 {return ((String) Debug.delegate(ba, "can_oncanceldate", null));}
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim nitUpdate As String=\"\"";
_nitupdate = "";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Dim haciendaUpdate As String";
_haciendaupdate = "";
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Dim idMaquina As Int";
_idmaquina = 0;
RDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="Dim tipo As String=\"\"";
_tipo = "";
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=11010058;
 //BA.debugLineNum = 11010058;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Dim Timepicker As Intellvold_TimePicker";
_timepicker = new lib.intellvold.datepicker.TimePicker();
RDebugUtils.currentLine=11010061;
 //BA.debugLineNum = 11010061;BA.debugLine="Dim Datepicker2 As Intellvold_DatePicker";
_datepicker2 = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="Dim Mycalendar2 As Intellvold_Calendar";
_mycalendar2 = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=11010064;
 //BA.debugLineNum = 11010064;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=11010065;
 //BA.debugLineNum = 11010065;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=11010066;
 //BA.debugLineNum = 11010066;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11010067;
 //BA.debugLineNum = 11010067;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11010068;
 //BA.debugLineNum = 11010068;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=11010069;
 //BA.debugLineNum = 11010069;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11010070;
 //BA.debugLineNum = 11010070;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11010071;
 //BA.debugLineNum = 11010071;BA.debugLine="Private SpinnerNit As Spinner";
_spinnernit = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=11010072;
 //BA.debugLineNum = 11010072;BA.debugLine="Private EditText2area As EditText";
_edittext2area = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=11010073;
 //BA.debugLineNum = 11010073;BA.debugLine="Private EditText1cmb As EditText";
_edittext1cmb = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=11010074;
 //BA.debugLineNum = 11010074;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11010075;
 //BA.debugLineNum = 11010075;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=11010076;
 //BA.debugLineNum = 11010076;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=11010078;
 //BA.debugLineNum = 11010078;BA.debugLine="Private nit As String";
_nit = "";
RDebugUtils.currentLine=11010079;
 //BA.debugLineNum = 11010079;BA.debugLine="Private hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=11010080;
 //BA.debugLineNum = 11010080;BA.debugLine="Private lote As String";
_lote = "";
RDebugUtils.currentLine=11010088;
 //BA.debugLineNum = 11010088;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=11010090;
 //BA.debugLineNum = 11010090;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=11010091;
 //BA.debugLineNum = 11010091;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=11010092;
 //BA.debugLineNum = 11010092;BA.debugLine="Private Label14Add As Label";
_label14add = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11010093;
 //BA.debugLineNum = 11010093;BA.debugLine="Private Button1AddIsumo As Button";
_button1addisumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=11010094;
 //BA.debugLineNum = 11010094;BA.debugLine="Private Label1RemoveInsumo As Label";
_label1removeinsumo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11010095;
 //BA.debugLineNum = 11010095;BA.debugLine="Private Label1Empty As Label";
_label1empty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11010096;
 //BA.debugLineNum = 11010096;BA.debugLine="Private Label2InsumoName As Label";
_label2insumoname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=11010098;
 //BA.debugLineNum = 11010098;BA.debugLine="Private EditText2QntInsumo As EditText";
_edittext2qntinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=11010099;
 //BA.debugLineNum = 11010099;BA.debugLine="Private Spinner1NameInsumo As Spinner";
_spinner1nameinsumo = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=11010101;
 //BA.debugLineNum = 11010101;BA.debugLine="Private intContadorInsumos As Int";
_intcontadorinsumos = 0;
RDebugUtils.currentLine=11010103;
 //BA.debugLineNum = 11010103;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=11010104;
 //BA.debugLineNum = 11010104;BA.debugLine="Private SD_xComboBoxHda As SD_xComboBox";
_sd_xcomboboxhda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=11010105;
 //BA.debugLineNum = 11010105;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=11010106;
 //BA.debugLineNum = 11010106;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=11010107;
 //BA.debugLineNum = 11010107;BA.debugLine="Private SD_xComboBoxEleGasto As SD_xComboBox";
_sd_xcomboboxelegasto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=11010109;
 //BA.debugLineNum = 11010109;BA.debugLine="End Sub";
return "";
}
public String  _configtime(b4a.example.ef.form __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "configtime", false))
	 {return ((String) Debug.delegate(ba, "configtime", new Object[] {_tag}));}
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub configTime(tag As String)";
RDebugUtils.currentLine=11993099;
 //BA.debugLineNum = 11993099;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=11993100;
 //BA.debugLineNum = 11993100;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=11993101;
 //BA.debugLineNum = 11993101;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=11993102;
 //BA.debugLineNum = 11993102;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=11993103;
 //BA.debugLineNum = 11993103;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=11993104;
 //BA.debugLineNum = 11993104;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=11993105;
 //BA.debugLineNum = 11993105;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=11993106;
 //BA.debugLineNum = 11993106;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=11993107;
 //BA.debugLineNum = 11993107;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=11993108;
 //BA.debugLineNum = 11993108;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=11993109;
 //BA.debugLineNum = 11993109;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=11993110;
 //BA.debugLineNum = 11993110;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=11993111;
 //BA.debugLineNum = 11993111;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=11993113;
 //BA.debugLineNum = 11993113;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.form __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumos(b4a.example.ef.form __ref,int _i,int _id,String _name,String _qnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createiteminsumos", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumos", new Object[] {_i,_id,_name,_qnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub CreateItemInsumos(i As Int,id As Int,";
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 450dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="panel.LoadLayout(\"Cardisumo\")";
_panel.LoadLayout("Cardisumo",ba);
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="EditText2QntInsumo.Color=Colors.Transparent";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="Label2InsumoName.Text=\"Insumo #\"&i";
__ref._label2insumoname /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Insumo #"+BA.NumberToString(_i)));
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="Label1RemoveInsumo.Tag=id";
__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=11403275;
 //BA.debugLineNum = 11403275;BA.debugLine="Spinner1NameInsumo.Tag=id";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="EditText2QntInsumo.Tag=id";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="EditText2QntInsumo.text=qnt";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_qnt));
RDebugUtils.currentLine=11403278;
 //BA.debugLineNum = 11403278;BA.debugLine="Spinner1NameInsumo.Prompt=name";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setPrompt(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=11403279;
 //BA.debugLineNum = 11403279;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=11403281;
 //BA.debugLineNum = 11403281;BA.debugLine="FillSpinner(name)";
__ref._fillspinner /*void*/ (null,_name);
RDebugUtils.currentLine=11403296;
 //BA.debugLineNum = 11403296;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=11403297;
 //BA.debugLineNum = 11403297;BA.debugLine="End Sub";
return null;
}
public void  _fillspinner(b4a.example.ef.form __ref,String _name) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "fillspinner", false))
	 {Debug.delegate(ba, "fillspinner", new Object[] {_name}); return;}
ResumableSub_FillSpinner rsub = new ResumableSub_FillSpinner(this,__ref,_name);
rsub.resume(ba, null);
}
public static class ResumableSub_FillSpinner extends BA.ResumableSub {
public ResumableSub_FillSpinner(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _name) {
this.parent = parent;
this.__ref = __ref;
this._name = _name;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _name;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int step5;
int limit5;
int step15;
int limit15;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 17;
this.catchState = 16;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 16;
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="Spinner1NameInsumo.Clear";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo where name='"+_name+"'")));
RDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 7;
step5 = 1;
limit5 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 7;
if ((step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5)) this.state = 6;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step5)) ;
if (true) break;

case 6:
//C
this.state = 19;
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="Log(Cursor.GetString(\"name\"))";
parent.__c.LogImpl("411468810",_cursor.GetString("name"),0);
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cursor.GetString("name"));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=11468814;
 //BA.debugLineNum = 11468814;BA.debugLine="If name=\"NO NAME\" Then";

case 7:
//if
this.state = 10;
if ((_name).equals("NO NAME")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="Spinner1NameInsumo.Add(\"\")";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("");
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=11468817;
 //BA.debugLineNum = 11468817;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=11468820;
 //BA.debugLineNum = 11468820;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo")));
RDebugUtils.currentLine=11468821;
 //BA.debugLineNum = 11468821;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 11:
//for
this.state = 14;
step15 = 1;
limit15 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if ((step15 > 0 && _i <= limit15) || (step15 < 0 && _i >= limit15)) this.state = 13;
if (true) break;

case 21:
//C
this.state = 20;
_i = ((int)(0 + _i + step15)) ;
if (true) break;

case 13:
//C
this.state = 21;
RDebugUtils.currentLine=11468822;
 //BA.debugLineNum = 11468822;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=11468824;
 //BA.debugLineNum = 11468824;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cursor.GetString("name"));
 if (true) break;
if (true) break;

case 14:
//C
this.state = 17;
;
 if (true) break;

case 16:
//C
this.state = 17;
this.catchState = 0;
RDebugUtils.currentLine=11468827;
 //BA.debugLineNum = 11468827;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("411468827",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 17:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=11468829;
 //BA.debugLineNum = 11468829;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "fillspinner"),(int) (20));
this.state = 22;
return;
case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=11468830;
 //BA.debugLineNum = 11468830;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.form __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_main._pdbname /*String*/ );
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.form __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.form __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="End Sub";
return "";
}
public String  _edittext2qntinsumo_textchanged(b4a.example.ef.form __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "edittext2qntinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2qntinsumo_textchanged", new Object[] {_old,_new}));}
int _id = 0;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Private Sub EditText2QntInsumo_TextChanged (Old As";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Try";
try {RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="EditText2QntInsumo=Sender";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/  = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)));
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="Dim id As Int=EditText2QntInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTag()));
RDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="Starter.updateInsumo(\"\",EditText2QntInsumo.text,";
_starter._updateinsumo /*String*/ ("",__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_id,BA.NumberToString(__ref._idmaquina /*int*/ ));
RDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="selectSQl(id)";
__ref._selectsql /*void*/ (null,_id);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="Log(LastException)";
__c.LogImpl("413762569",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="End Sub";
return "";
}
public void  _selectsql(b4a.example.ef.form __ref,int _id) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "selectsql", false))
	 {Debug.delegate(ba, "selectsql", new Object[] {_id}); return;}
ResumableSub_selectSQl rsub = new ResumableSub_selectSQl(this,__ref,_id);
rsub.resume(ba, null);
}
public static class ResumableSub_selectSQl extends BA.ResumableSub {
public ResumableSub_selectSQl(b4a.example.ef.form parent,b4a.example.ef.form __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
int _id;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int step4;
int limit4;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where id="+BA.NumberToString(_id))));
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 7;
step4 = 1;
limit4 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 11;
if (true) break;

case 11:
//C
this.state = 7;
if ((step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4)) this.state = 6;
if (true) break;

case 12:
//C
this.state = 11;
_i = ((int)(0 + _i + step4)) ;
if (true) break;

case 6:
//C
this.state = 12;
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
RDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("413828109",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "selectsql"),(int) (20));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=13828113;
 //BA.debugLineNum = 13828113;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _getrecordlotes(b4a.example.ef.form __ref,String _usedb,String _nitlote,String _hda) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "getrecordlotes", false))
	 {Debug.delegate(ba, "getrecordlotes", new Object[] {_usedb,_nitlote,_hda}); return;}
ResumableSub_GetRecordLotes rsub = new ResumableSub_GetRecordLotes(this,__ref,_usedb,_nitlote,_hda);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLotes extends BA.ResumableSub {
public ResumableSub_GetRecordLotes(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _usedb,String _nitlote,String _hda) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nitlote = _nitlote;
this._hda = _hda;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _usedb;
String _nitlote;
String _hda;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;
Object[] group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nitlote),(Object)(_hda)});
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12976140;
 //BA.debugLineNum = 12976140;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 18:
//C
this.state = 17;
index8++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group10 = _row;
index10 = 0;
groupLen10 = group10.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_record = group10[index10];}
if (true) break;

case 20:
//C
this.state = 19;
index10++;
if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="SD_xComboBoxLote.Add(cadena,1)";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=12976151;
 //BA.debugLineNum = 12976151;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("412976151","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlotesarea(b4a.example.ef.form __ref,String _usedb,String _nitlote,String _hda,String _lotearea) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "getrecordlotesarea", false))
	 {Debug.delegate(ba, "getrecordlotesarea", new Object[] {_usedb,_nitlote,_hda,_lotearea}); return;}
ResumableSub_GetRecordLotesArea rsub = new ResumableSub_GetRecordLotesArea(this,__ref,_usedb,_nitlote,_hda,_lotearea);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLotesArea extends BA.ResumableSub {
public ResumableSub_GetRecordLotesArea(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _usedb,String _nitlote,String _hda,String _lotearea) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nitlote = _nitlote;
this._hda = _hda;
this._lotearea = _lotearea;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _usedb;
String _nitlote;
String _hda;
String _lotearea;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _cadena = "";
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
Object _record = null;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;
Object[] group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_Area";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_AreaSuertes",new Object[]{(Object)(_nitlote),(Object)(_hda),(Object)(_lotearea)});
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotesarea"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 13;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=13107208;
 //BA.debugLineNum = 13107208;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotesarea"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=13107213;
 //BA.debugLineNum = 13107213;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 18:
//C
this.state = 17;
index8++;
if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=13107214;
 //BA.debugLineNum = 13107214;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=13107215;
 //BA.debugLineNum = 13107215;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group10 = _row;
index10 = 0;
groupLen10 = group10.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index10 < groupLen10) {
this.state = 9;
_record = group10[index10];}
if (true) break;

case 20:
//C
this.state = 19;
index10++;
if (true) break;

case 9:
//C
this.state = 20;
RDebugUtils.currentLine=13107216;
 //BA.debugLineNum = 13107216;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=13107218;
 //BA.debugLineNum = 13107218;BA.debugLine="EditText2HoraFim.Text=cadena";
__ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_cadena));
RDebugUtils.currentLine=13107219;
 //BA.debugLineNum = 13107219;BA.debugLine="EditText2HoraFim.Enabled =False";
__ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(parent.__c.False);
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=13107227;
 //BA.debugLineNum = 13107227;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("413107227","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=13107229;
 //BA.debugLineNum = 13107229;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=13107230;
 //BA.debugLineNum = 13107230;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getvaluesintheedittexts(b4a.example.ef.form __ref) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "getvaluesintheedittexts", false))
	 {Debug.delegate(ba, "getvaluesintheedittexts", null); return;}
ResumableSub_getValuesINTheEdittexts rsub = new ResumableSub_getValuesINTheEdittexts(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_getValuesINTheEdittexts extends BA.ResumableSub {
public ResumableSub_getValuesINTheEdittexts(b4a.example.ef.form parent,b4a.example.ef.form __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _cursor = null;
int _i = 0;
int step6;
int limit6;
int step16;
int limit16;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM i";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 4:
//for
this.state = 7;
step6 = 1;
limit6 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 7;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 6;
if (true) break;

case 16:
//C
this.state = 15;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 6:
//C
this.state = 16;
RDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="Log(\"=====ITEM #\"&i&\"=====\")";
parent.__c.LogImpl("412124168","=====ITEM #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=12124169;
 //BA.debugLineNum = 12124169;BA.debugLine="Log(Cursor.GetString(\"idmaquina\"))";
parent.__c.LogImpl("412124169",_cursor.GetString("idmaquina"),0);
RDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="Log(Cursor.GetString(\"name\")&\"--\"&Cursor.GetStri";
parent.__c.LogImpl("412124170",_cursor.GetString("name")+"--"+_cursor.GetString("qnt"),0);
RDebugUtils.currentLine=12124171;
 //BA.debugLineNum = 12124171;BA.debugLine="sb.Append(Cursor.GetString(\"name\")&\"--\"&Cursor.G";
_sb.Append(_cursor.GetString("name")+"--"+_cursor.GetString("qnt")).Append(parent.__c.CRLF);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=12124174;
 //BA.debugLineNum = 12124174;BA.debugLine="Log(sb.ToString)";
parent.__c.LogImpl("412124174",_sb.ToString(),0);
RDebugUtils.currentLine=12124176;
 //BA.debugLineNum = 12124176;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=12124177;
 //BA.debugLineNum = 12124177;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM m";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
RDebugUtils.currentLine=12124178;
 //BA.debugLineNum = 12124178;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
if (true) break;

case 8:
//for
this.state = 11;
step16 = 1;
limit16 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if ((step16 > 0 && _i <= limit16) || (step16 < 0 && _i >= limit16)) this.state = 10;
if (true) break;

case 18:
//C
this.state = 17;
_i = ((int)(0 + _i + step16)) ;
if (true) break;

case 10:
//C
this.state = 18;
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=12124180;
 //BA.debugLineNum = 12124180;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
parent.__c.LogImpl("412124180","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=12124181;
 //BA.debugLineNum = 12124181;BA.debugLine="Log(Cursor.GetString(\"id\"))'&\"--\"&Cursor.GetStr";
parent.__c.LogImpl("412124181",_cursor.GetString("id"),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=12124184;
 //BA.debugLineNum = 12124184;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"ListDad";
parent._b4xpages._showpageandremovepreviouspages /*String*/ (ba,"ListDados");
RDebugUtils.currentLine=12124185;
 //BA.debugLineNum = 12124185;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
RDebugUtils.currentLine=12124186;
 //BA.debugLineNum = 12124186;BA.debugLine="B4XPage_Created(Root)";
__ref._b4xpage_created /*String*/ (null,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=12124188;
 //BA.debugLineNum = 12124188;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("412124188",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12124190;
 //BA.debugLineNum = 12124190;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getvaluesintheedittexts"),(int) (20));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=12124191;
 //BA.debugLineNum = 12124191;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _insertrecord(b4a.example.ef.form __ref,String _usedb,String _nombre,int _salario) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "insertrecord", false))
	 {Debug.delegate(ba, "insertrecord", new Object[] {_usedb,_nombre,_salario}); return;}
ResumableSub_InsertRecord rsub = new ResumableSub_InsertRecord(this,__ref,_usedb,_nombre,_salario);
rsub.resume(ba, null);
}
public static class ResumableSub_InsertRecord extends BA.ResumableSub {
public ResumableSub_InsertRecord(b4a.example.ef.form parent,b4a.example.ef.form __ref,String _usedb,String _nombre,int _salario) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nombre = _nombre;
this._salario = _salario;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
String _usedb;
String _nombre;
int _salario;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Dim req As DBRequestManager = CreateRequest(Us";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_tipoReparacion",new Object[]{(Object)(_nombre),(Object)(_salario)});
RDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="Dim j As HttpJob = req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "insertrecord"), (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="Log(\"Inserted successfully!\")";
parent.__c.LogImpl("412320775","Inserted successfully!",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _label10_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label10_click", false))
	 {return ((String) Debug.delegate(ba, "label10_click", null));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Datepicker.Initialize(\"Date\",2023 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2023),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2023");
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.12.2025");
RDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=11730953;
 //BA.debugLineNum = 11730953;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=11730954;
 //BA.debugLineNum = 11730954;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="configTime(\"Label13Time\")";
__ref._configtime /*String*/ (null,"Label13Time");
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="End Sub";
return "";
}
public String  _label13time_ondateset(b4a.example.ef.form __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label13time_ondateset", false))
	 {return ((String) Debug.delegate(ba, "label13time_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub Label13Time_OnDateSet(year As Int ,monthOfYear";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Label13Time.Text=year&\"/\"&(NumberFormat(monthOfYe";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Label13Time.TextColor=Colors.Black";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="End Sub";
return "";
}
public String  _label1removeinsumo_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label1removeinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "label1removeinsumo_click", null));}
int _id = 0;
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Private Sub Label1RemoveInsumo_Click";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Label1RemoveInsumo=Sender";
__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/  = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Log(Label1RemoveInsumo.Tag)";
__c.LogImpl("413697026",BA.ObjectToString(__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTag()),0);
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Dim id As Int=Label1RemoveInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTag()));
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from insumo wh";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from insumo where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
String _salario = "";
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Try";
try {RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Dim salario As String";
_salario = "";
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="salario=\"10\"";
_salario = "10";
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="InsertRecord(Main.pDBName ,\"99\",salario)";
__ref._insertrecord /*void*/ (null,_main._pdbname /*String*/ ,"99",(int)(Double.parseDouble(_salario)));
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="Log(Label10.text&\"----\"&Label13Time.text)";
__c.LogImpl("412255240",__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+"----"+__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="Log(\"HACIENDA: \"&haciendaUpdate)";
__c.LogImpl("412255241","HACIENDA: "+__ref._haciendaupdate /*String*/ ,0);
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="If tipo=\"new\" Then";
if ((__ref._tipo /*String*/ ).equals("new")) { 
 }else {
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="Log(\"update\")";
__c.LogImpl("412255249","update",0);
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=12255253;
 //BA.debugLineNum = 12255253;BA.debugLine="Log(LastException)";
__c.LogImpl("412255253",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=12255256;
 //BA.debugLineNum = 12255256;BA.debugLine="End Sub";
return "";
}
public String  _removeallexcelpfist(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "removeallexcelpfist", false))
	 {return ((String) Debug.delegate(ba, "removeallexcelpfist", null));}
int _iw = 0;
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub removeAllExcelpFist";
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="For iw= CustomListView1Geral.Size-1 To  1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_iw = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1) ;
for (;_iw >= limit1 ;_iw = _iw + step1 ) {
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="If CustomListView1Geral.GetValue(iw)<>\"form1\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_iw)).equals((Object)("form1")) == false) { 
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Try";
try {RDebugUtils.currentLine=11337734;
 //BA.debugLineNum = 11337734;BA.debugLine="LogColor(\"REMOVE: \"&iw,Colors.Red)";
__c.LogImpl("411337734","REMOVE: "+BA.NumberToString(_iw),__c.Colors.Red);
RDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="CustomListView1Geral.RemoveAt(iw)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_iw);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="Log(LastException)";
__c.LogImpl("411337738",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 }
};
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="configTime(\"TimeInicio\")";
__ref._configtime /*String*/ (null,"TimeInicio");
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="configTime(\"TimeFim\")";
__ref._configtime /*String*/ (null,"TimeFim");
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="configTime(\"Label13Time\")";
__ref._configtime /*String*/ (null,"Label13Time");
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxhda_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhda_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxhda_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub SD_xComboBoxHda_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Log(Value)";
__c.LogImpl("412910595",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="nit = \"800246222\"";
__ref._nit /*String*/  = "800246222";
RDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="haciendaUpdate = Value";
__ref._haciendaupdate /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=12910602;
 //BA.debugLineNum = 12910602;BA.debugLine="hacienda = SD_xComboBoxHda.GetItem(Position)";
__ref._hacienda /*String*/  = __ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._getitem /*String*/ (null,_position);
RDebugUtils.currentLine=12910603;
 //BA.debugLineNum = 12910603;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
__ref._hacienda /*String*/  = __ref._hacienda /*String*/ .substring((int) (0),(int) (3));
RDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="Log(hacienda)";
__c.LogImpl("412910604",__ref._hacienda /*String*/ ,0);
RDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="GetRecordLotes (Main.pDBName,Main.pNit, hacienda)";
__ref._getrecordlotes /*void*/ (null,_main._pdbname /*String*/ ,_main._pnit /*String*/ ,__ref._hacienda /*String*/ );
RDebugUtils.currentLine=12910606;
 //BA.debugLineNum = 12910606;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub SD_xComboBoxLote_ItemClick (Position As Int, V";
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("413041670",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="lote = Value";
__ref._lote /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="Log(hacienda)";
__c.LogImpl("413041674",__ref._hacienda /*String*/ ,0);
RDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="GetRecordLotesArea (Main.pDBName,nit, hacienda,lo";
__ref._getrecordlotesarea /*void*/ (null,_main._pdbname /*String*/ ,__ref._nit /*String*/ ,__ref._hacienda /*String*/ ,__ref._lote /*String*/ );
RDebugUtils.currentLine=13041676;
 //BA.debugLineNum = 13041676;BA.debugLine="End Sub";
return "";
}
public String  _spinner1nameinsumo_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner1nameinsumo_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1nameinsumo_itemclick", new Object[] {_position,_value}));}
int _id = 0;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Private Sub Spinner1NameInsumo_ItemClick (Position";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Spinner1NameInsumo=Sender";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/  = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(__c.Sender(ba)));
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Log(Spinner1NameInsumo.Tag)";
__c.LogImpl("413893634",BA.ObjectToString(__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getTag()),0);
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Log(Spinner1NameInsumo.SelectedItem)";
__c.LogImpl("413893635",__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem(),0);
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Dim id As Int=Spinner1NameInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getTag()));
RDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="Starter.updateInsumo(Spinner1NameInsumo.SelectedI";
_starter._updateinsumo /*String*/ (__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem(),"",_id,BA.NumberToString(__ref._idmaquina /*int*/ ));
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="selectSQl(id)";
__ref._selectsql /*void*/ (null,_id);
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinnernit_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinnernit_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub SpinnerNit_ItemClick (Position As Int,";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Log(Value)";
__c.LogImpl("413303809",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit0_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinnernit0_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinnernit0_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Private Sub SpinnerNit0_ItemClick (Position As Int";
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return "";
}
public void  _validation(b4a.example.ef.form __ref,anywheresoftware.b4a.objects.EditTextWrapper _edt) throws Exception{
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "validation", false))
	 {Debug.delegate(ba, "validation", new Object[] {_edt}); return;}
ResumableSub_validation rsub = new ResumableSub_validation(this,__ref,_edt);
rsub.resume(ba, null);
}
public static class ResumableSub_validation extends BA.ResumableSub {
public ResumableSub_validation(b4a.example.ef.form parent,b4a.example.ef.form __ref,anywheresoftware.b4a.objects.EditTextWrapper _edt) {
this.parent = parent;
this.__ref = __ref;
this._edt = _edt;
this.__ref = parent;
}
b4a.example.ef.form __ref;
b4a.example.ef.form parent;
anywheresoftware.b4a.objects.EditTextWrapper _edt;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="form";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="If edt.Text=\"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_edt.getText()).equals("")) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="edt.HintColor=Colors.Red";
_edt.setHintColor(parent.__c.Colors.Red);
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Sleep(350)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "validation"),(int) (350));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="edt.HintColor=Colors.Gray'.";
_edt.setHintColor(parent.__c.Colors.Gray);
 if (true) break;

case 5:
//C
this.state = 6;
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}