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
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Try";
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
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="nitUpdate=\"\"";
__ref._nitupdate /*String*/  = "";
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="haciendaUpdate=\"\"";
__ref._haciendaupdate /*String*/  = "";
RDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB4008";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whi";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "b4xpage_appear"),(int) (20));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="If tipo=\"update\" Then";
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
RDebugUtils.currentLine=6357004;
 //BA.debugLineNum = 6357004;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina where id="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=6357014;
 //BA.debugLineNum = 6357014;BA.debugLine="Label10.text=Cursor.GetString(\"fechaInicio\")";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaInicio")));
RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
RDebugUtils.currentLine=6357016;
 //BA.debugLineNum = 6357016;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="EditText1HoraInicio.text=Cursor.GetString(\"are";
__ref._edittext1horainicio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("arealabor")));
RDebugUtils.currentLine=6357018;
 //BA.debugLineNum = 6357018;BA.debugLine="nitUpdate=Cursor.GetString(\"Nit\")";
__ref._nitupdate /*String*/  = _cursor.GetString("Nit");
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="haciendaUpdate=Cursor.GetString(\"hacienda\")";
__ref._haciendaupdate /*String*/  = _cursor.GetString("hacienda");
RDebugUtils.currentLine=6357021;
 //BA.debugLineNum = 6357021;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("26357021","NIT: "+__ref._nitupdate /*String*/ ,0);
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
RDebugUtils.currentLine=6357024;
 //BA.debugLineNum = 6357024;BA.debugLine="Log(\"NIT: \"&nit)";
parent.__c.LogImpl("26357024","NIT: "+__ref._nit /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 16;
;
RDebugUtils.currentLine=6357027;
 //BA.debugLineNum = 6357027;BA.debugLine="Dim estado As String";
_estado = "";
RDebugUtils.currentLine=6357030;
 //BA.debugLineNum = 6357030;BA.debugLine="estado = \"N\"";
_estado = "N";
RDebugUtils.currentLine=6357031;
 //BA.debugLineNum = 6357031;BA.debugLine="GetRecordNits(Main.pDBName,estado)";
__ref._getrecordnits /*void*/ (null,parent._main._pdbname /*String*/ ,_estado);
RDebugUtils.currentLine=6357032;
 //BA.debugLineNum = 6357032;BA.debugLine="GetRecordHaciendas(Main.pDBName,estado)";
__ref._getrecordhaciendas /*void*/ (null,parent._main._pdbname /*String*/ ,_estado);
RDebugUtils.currentLine=6357033;
 //BA.debugLineNum = 6357033;BA.debugLine="GetRecordLabores(Main.pDBName)";
__ref._getrecordlabores /*void*/ (null,parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=6357034;
 //BA.debugLineNum = 6357034;BA.debugLine="GetRecordElegasto(Main.pDBName)";
__ref._getrecordelegasto /*void*/ (null,parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=6357035;
 //BA.debugLineNum = 6357035;BA.debugLine="intContadorInsumos=0";
__ref._intcontadorinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=6357036;
 //BA.debugLineNum = 6357036;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=6357038;
 //BA.debugLineNum = 6357038;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("26357038",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=6357041;
 //BA.debugLineNum = 6357041;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="panel.LoadLayout(\"scroolUI\")";
_panel.LoadLayout("scroolUI",ba);
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6684704;
 //BA.debugLineNum = 6684704;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=6684705;
 //BA.debugLineNum = 6684705;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=7929862;
 //BA.debugLineNum = 7929862;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=7929864;
 //BA.debugLineNum = 7929864;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordnits"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7929865;
 //BA.debugLineNum = 7929865;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7929868;
 //BA.debugLineNum = 7929868;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordnits"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7929871;
 //BA.debugLineNum = 7929871;BA.debugLine="SD_xComboBoxNit.Add(\"----Select----\",\"1\")";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=7929872;
 //BA.debugLineNum = 7929872;BA.debugLine="Dim INTRegistros As Int";
_intregistros = 0;
RDebugUtils.currentLine=7929874;
 //BA.debugLineNum = 7929874;BA.debugLine="INTRegistros=0";
_intregistros = (int) (0);
RDebugUtils.currentLine=7929875;
 //BA.debugLineNum = 7929875;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7929876;
 //BA.debugLineNum = 7929876;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=7929877;
 //BA.debugLineNum = 7929877;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=7929878;
 //BA.debugLineNum = 7929878;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=7929880;
 //BA.debugLineNum = 7929880;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=7929882;
 //BA.debugLineNum = 7929882;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=7929883;
 //BA.debugLineNum = 7929883;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=7929884;
 //BA.debugLineNum = 7929884;BA.debugLine="INTRegistros=INTRegistros+1";
_intregistros = (int) (_intregistros+1);
RDebugUtils.currentLine=7929885;
 //BA.debugLineNum = 7929885;BA.debugLine="If nitUpdate=cadena Then";
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
RDebugUtils.currentLine=7929886;
 //BA.debugLineNum = 7929886;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("27929886","NIT: "+__ref._nitupdate /*String*/ ,0);
RDebugUtils.currentLine=7929889;
 //BA.debugLineNum = 7929889;BA.debugLine="SD_xComboBoxNit.Add(nitUpdate,INTRegistros)";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,__ref._nitupdate /*String*/ ,(Object)(_intregistros));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=7929891;
 //BA.debugLineNum = 7929891;BA.debugLine="SD_xComboBoxNit.Add(cadena,INTRegistros)";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(_intregistros));
RDebugUtils.currentLine=7929892;
 //BA.debugLineNum = 7929892;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=7929898;
 //BA.debugLineNum = 7929898;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("27929898","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=7929900;
 //BA.debugLineNum = 7929900;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7929901;
 //BA.debugLineNum = 7929901;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(_estado)});
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordhaciendas"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="SD_xComboBoxHda.Add(\"----Select----\",1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=7995408;
 //BA.debugLineNum = 7995408;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\",1)";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7995410;
 //BA.debugLineNum = 7995410;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=7995418;
 //BA.debugLineNum = 7995418;BA.debugLine="Log(\"cadena: \"&cadena)";
parent.__c.LogImpl("27995418","cadena: "+_cadena,0);
RDebugUtils.currentLine=7995419;
 //BA.debugLineNum = 7995419;BA.debugLine="Log(\"hacienda: \"&haciendaUpdate)";
parent.__c.LogImpl("27995419","hacienda: "+__ref._haciendaupdate /*String*/ ,0);
RDebugUtils.currentLine=7995420;
 //BA.debugLineNum = 7995420;BA.debugLine="If cadena.Contains(haciendaUpdate) Then";
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
RDebugUtils.currentLine=7995421;
 //BA.debugLineNum = 7995421;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=7995422;
 //BA.debugLineNum = 7995422;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=7995423;
 //BA.debugLineNum = 7995423;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=7995425;
 //BA.debugLineNum = 7995425;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=7995426;
 //BA.debugLineNum = 7995426;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=7995427;
 //BA.debugLineNum = 7995427;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
 if (true) break;

case 16:
//C
this.state = 24;
;
RDebugUtils.currentLine=7995430;
 //BA.debugLineNum = 7995430;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=7995434;
 //BA.debugLineNum = 7995434;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("27995434","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=7995436;
 //BA.debugLineNum = 7995436;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7995437;
 //BA.debugLineNum = 7995437;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\",1)";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=8323092;
 //BA.debugLineNum = 8323092;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=8323096;
 //BA.debugLineNum = 8323096;BA.debugLine="SD_xComboBoxLabor.Add(cadena,1)";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
RDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=8323101;
 //BA.debugLineNum = 8323101;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("28323101","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=8323103;
 //BA.debugLineNum = 8323103;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=8323104;
 //BA.debugLineNum = 8323104;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_eleg";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elegasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordelegasto"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordelegasto"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="SD_xComboBoxEleGasto.Add(\"----Select----\",1)";
__ref._sd_xcomboboxelegasto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=8388623;
 //BA.debugLineNum = 8388623;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=8388624;
 //BA.debugLineNum = 8388624;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=8388626;
 //BA.debugLineNum = 8388626;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=8388627;
 //BA.debugLineNum = 8388627;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=8388629;
 //BA.debugLineNum = 8388629;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=8388630;
 //BA.debugLineNum = 8388630;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=8388631;
 //BA.debugLineNum = 8388631;BA.debugLine="SD_xComboBoxEleGasto.Add(cadena,1)";
__ref._sd_xcomboboxelegasto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
RDebugUtils.currentLine=8388632;
 //BA.debugLineNum = 8388632;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=8388636;
 //BA.debugLineNum = 8388636;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("28388636","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=8388638;
 //BA.debugLineNum = 8388638;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=8388639;
 //BA.debugLineNum = 8388639;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub listInsumos";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="removeAllExcelpFist";
__ref._removeallexcelpfist /*String*/ (null);
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="Dim NumberOfMatches As Int";
_numberofmatches = 0;
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="NumberOfMatches = Starter.SQL1.ExecQuerySingleRes";
_numberofmatches = (int)(Double.parseDouble(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="CustomListView1Geral.DesignerLabel.Height=8dip";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._designerlabel.setHeight(__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="CustomListView1Geral.AddTextItem(\"Insumos(\"&Numbe";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._addtextitem((Object)("Insumos("+BA.NumberToString(_numberofmatches)+")"),(Object)("title"));
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="Dim	id As Int=Cursor.GetString(\"id\")";
_id = (int)(Double.parseDouble(_cursor.GetString("id")));
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("26422541",_cursor.GetString("id"),0);
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="Log(Cursor.GetString(\"name\"))";
__c.LogImpl("26422542",_cursor.GetString("name"),0);
RDebugUtils.currentLine=6422543;
 //BA.debugLineNum = 6422543;BA.debugLine="Log(Cursor.GetString(\"qnt\"))";
__c.LogImpl("26422543",_cursor.GetString("qnt"),0);
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumos(i+1,i";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumos /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,(int) (_i+1),_id,_cursor.GetString("name"),_cursor.GetString("qnt")).getObject())),(Object)("insumo"));
 }
};
RDebugUtils.currentLine=6422548;
 //BA.debugLineNum = 6422548;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6422549;
 //BA.debugLineNum = 6422549;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=6422551;
 //BA.debugLineNum = 6422551;BA.debugLine="panel.LoadLayout(\"emptyInsumos\")";
_panel.LoadLayout("emptyInsumos",ba);
RDebugUtils.currentLine=6422552;
 //BA.debugLineNum = 6422552;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6422553;
 //BA.debugLineNum = 6422553;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=6422554;
 //BA.debugLineNum = 6422554;BA.debugLine="Label1Empty.Visible=True";
__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=6422556;
 //BA.debugLineNum = 6422556;BA.debugLine="Label1Empty.Visible=False";
__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6422557;
 //BA.debugLineNum = 6422557;BA.debugLine="Button1AddIsumo.Top=Label1Empty.top";
__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTop(__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop());
RDebugUtils.currentLine=6422558;
 //BA.debugLineNum = 6422558;BA.debugLine="panel.Height=Button1AddIsumo.Height";
_panel.setHeight(__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=6422563;
 //BA.debugLineNum = 6422563;BA.debugLine="CustomListView1Geral.Add(panel,0)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add(_panel,(Object)(0));
RDebugUtils.currentLine=6422564;
 //BA.debugLineNum = 6422564;BA.debugLine="CustomListView1Geral.ScrollToItem(CustomListView1";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=6422568;
 //BA.debugLineNum = 6422568;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.form __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=6291472;
 //BA.debugLineNum = 6291472;BA.debugLine="End Sub";
return "";
}
public String  _button1addisumo_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "button1addisumo_click", false))
	 {return ((String) Debug.delegate(ba, "button1addisumo_click", null));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub Button1AddIsumo_Click";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Try";
try {RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Button1AddIsumo=Sender";
__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"INSERT INTO insumo V";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO insumo VALUES (?, ?, ?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,(Object)("NO NAME"),(Object)("0"),(Object)(__ref._idmaquina /*int*/ )}));
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="intContadorInsumos=	intContadorInsumos + 1";
__ref._intcontadorinsumos /*int*/  = (int) (__ref._intcontadorinsumos /*int*/ +1);
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Log(LastException)";
__c.LogImpl("28781832",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="End Sub";
return "";
}
public String  _can_oncanceldate(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "can_oncanceldate", false))
	 {return ((String) Debug.delegate(ba, "can_oncanceldate", null));}
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Dim nitUpdate As String=\"\"";
_nitupdate = "";
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Dim haciendaUpdate As String";
_haciendaupdate = "";
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Dim idMaquina As Int";
_idmaquina = 0;
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="Dim tipo As String=\"\"";
_tipo = "";
RDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="Dim Timepicker As Intellvold_TimePicker";
_timepicker = new lib.intellvold.datepicker.TimePicker();
RDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="Dim Datepicker2 As Intellvold_DatePicker";
_datepicker2 = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="Dim Mycalendar2 As Intellvold_Calendar";
_mycalendar2 = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=6160401;
 //BA.debugLineNum = 6160401;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=6160402;
 //BA.debugLineNum = 6160402;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6160403;
 //BA.debugLineNum = 6160403;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6160404;
 //BA.debugLineNum = 6160404;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6160405;
 //BA.debugLineNum = 6160405;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6160406;
 //BA.debugLineNum = 6160406;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160407;
 //BA.debugLineNum = 6160407;BA.debugLine="Private SpinnerNit As Spinner";
_spinnernit = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=6160408;
 //BA.debugLineNum = 6160408;BA.debugLine="Private EditText2area As EditText";
_edittext2area = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=6160409;
 //BA.debugLineNum = 6160409;BA.debugLine="Private EditText1cmb As EditText";
_edittext1cmb = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=6160410;
 //BA.debugLineNum = 6160410;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160411;
 //BA.debugLineNum = 6160411;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=6160412;
 //BA.debugLineNum = 6160412;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=6160414;
 //BA.debugLineNum = 6160414;BA.debugLine="Private nit As String";
_nit = "";
RDebugUtils.currentLine=6160415;
 //BA.debugLineNum = 6160415;BA.debugLine="Private hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=6160416;
 //BA.debugLineNum = 6160416;BA.debugLine="Private lote As String";
_lote = "";
RDebugUtils.currentLine=6160424;
 //BA.debugLineNum = 6160424;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=6160426;
 //BA.debugLineNum = 6160426;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=6160427;
 //BA.debugLineNum = 6160427;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6160428;
 //BA.debugLineNum = 6160428;BA.debugLine="Private Label14Add As Label";
_label14add = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160429;
 //BA.debugLineNum = 6160429;BA.debugLine="Private Button1AddIsumo As Button";
_button1addisumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6160430;
 //BA.debugLineNum = 6160430;BA.debugLine="Private Label1RemoveInsumo As Label";
_label1removeinsumo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160431;
 //BA.debugLineNum = 6160431;BA.debugLine="Private Label1Empty As Label";
_label1empty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160432;
 //BA.debugLineNum = 6160432;BA.debugLine="Private Label2InsumoName As Label";
_label2insumoname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6160434;
 //BA.debugLineNum = 6160434;BA.debugLine="Private EditText2QntInsumo As EditText";
_edittext2qntinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=6160435;
 //BA.debugLineNum = 6160435;BA.debugLine="Private Spinner1NameInsumo As Spinner";
_spinner1nameinsumo = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=6160437;
 //BA.debugLineNum = 6160437;BA.debugLine="Private intContadorInsumos As Int";
_intcontadorinsumos = 0;
RDebugUtils.currentLine=6160439;
 //BA.debugLineNum = 6160439;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6160440;
 //BA.debugLineNum = 6160440;BA.debugLine="Private SD_xComboBoxHda As SD_xComboBox";
_sd_xcomboboxhda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6160441;
 //BA.debugLineNum = 6160441;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6160442;
 //BA.debugLineNum = 6160442;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6160443;
 //BA.debugLineNum = 6160443;BA.debugLine="Private SD_xComboBoxEleGasto As SD_xComboBox";
_sd_xcomboboxelegasto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6160445;
 //BA.debugLineNum = 6160445;BA.debugLine="End Sub";
return "";
}
public String  _configtime(b4a.example.ef.form __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "configtime", false))
	 {return ((String) Debug.delegate(ba, "configtime", new Object[] {_tag}));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub configTime(tag As String)";
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=7143444;
 //BA.debugLineNum = 7143444;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=7143449;
 //BA.debugLineNum = 7143449;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.form __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=7864326;
 //BA.debugLineNum = 7864326;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumos(b4a.example.ef.form __ref,int _i,int _id,String _name,String _qnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createiteminsumos", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumos", new Object[] {_i,_id,_name,_qnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub CreateItemInsumos(i As Int,id As Int,";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 450dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="panel.LoadLayout(\"Cardisumo\")";
_panel.LoadLayout("Cardisumo",ba);
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="EditText2QntInsumo.Color=Colors.Transparent";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="Label2InsumoName.Text=\"Insumo #\"&i";
__ref._label2insumoname /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Insumo #"+BA.NumberToString(_i)));
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Label1RemoveInsumo.Tag=id";
__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="Spinner1NameInsumo.Tag=id";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="EditText2QntInsumo.Tag=id";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=6553613;
 //BA.debugLineNum = 6553613;BA.debugLine="EditText2QntInsumo.text=qnt";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_qnt));
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="Spinner1NameInsumo.Prompt=name";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setPrompt(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6553617;
 //BA.debugLineNum = 6553617;BA.debugLine="FillSpinner(name)";
__ref._fillspinner /*void*/ (null,_name);
RDebugUtils.currentLine=6553632;
 //BA.debugLineNum = 6553632;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=6553633;
 //BA.debugLineNum = 6553633;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Try";
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
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Spinner1NameInsumo.Clear";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo where name='"+_name+"'")));
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="Log(Cursor.GetString(\"name\"))";
parent.__c.LogImpl("26619146",_cursor.GetString("name"),0);
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cursor.GetString("name"));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="If name=\"NO NAME\" Then";

case 7:
//if
this.state = 10;
if ((_name).equals("NO NAME")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="Spinner1NameInsumo.Add(\"\")";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("");
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=6619156;
 //BA.debugLineNum = 6619156;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo")));
RDebugUtils.currentLine=6619157;
 //BA.debugLineNum = 6619157;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=6619158;
 //BA.debugLineNum = 6619158;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=6619160;
 //BA.debugLineNum = 6619160;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
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
RDebugUtils.currentLine=6619163;
 //BA.debugLineNum = 6619163;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("26619163",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 17:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=6619165;
 //BA.debugLineNum = 6619165;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "fillspinner"),(int) (20));
this.state = 22;
return;
case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=6619166;
 //BA.debugLineNum = 6619166;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_main._pdbname /*String*/ );
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.form __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.form __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="End Sub";
return "";
}
public String  _edittext2qntinsumo_textchanged(b4a.example.ef.form __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "edittext2qntinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2qntinsumo_textchanged", new Object[] {_old,_new}));}
int _id = 0;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub EditText2QntInsumo_TextChanged (Old As";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Try";
try {RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="EditText2QntInsumo=Sender";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/  = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)));
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="Dim id As Int=EditText2QntInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTag()));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Starter.updateInsumo(\"\",EditText2QntInsumo.text,";
_starter._updateinsumo /*String*/ ("",__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_id,BA.NumberToString(__ref._idmaquina /*int*/ ));
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="selectSQl(id)";
__ref._selectsql /*void*/ (null,_id);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Log(LastException)";
__c.LogImpl("28912905",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Try";
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
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where id="+BA.NumberToString(_id))));
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Cursor.Position = i";
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
RDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("28978445",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "selectsql"),(int) (20));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nitlote),(Object)(_hda)});
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=8126477;
 //BA.debugLineNum = 8126477;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=8126479;
 //BA.debugLineNum = 8126479;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=8126480;
 //BA.debugLineNum = 8126480;BA.debugLine="SD_xComboBoxLote.Add(cadena,1)";
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
RDebugUtils.currentLine=8126487;
 //BA.debugLineNum = 8126487;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("28126487","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=8126489;
 //BA.debugLineNum = 8126489;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=8126490;
 //BA.debugLineNum = 8126490;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_Area";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_AreaSuertes",new Object[]{(Object)(_nitlote),(Object)(_hda),(Object)(_lotearea)});
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotesarea"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotesarea"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=8257550;
 //BA.debugLineNum = 8257550;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=8257551;
 //BA.debugLineNum = 8257551;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=8257554;
 //BA.debugLineNum = 8257554;BA.debugLine="EditText2HoraFim.Text=cadena";
__ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_cadena));
RDebugUtils.currentLine=8257555;
 //BA.debugLineNum = 8257555;BA.debugLine="EditText2HoraFim.Enabled =False";
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
RDebugUtils.currentLine=8257563;
 //BA.debugLineNum = 8257563;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("28257563","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=8257565;
 //BA.debugLineNum = 8257565;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=8257566;
 //BA.debugLineNum = 8257566;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Try";
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
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM i";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Log(\"=====ITEM #\"&i&\"=====\")";
parent.__c.LogImpl("27274504","=====ITEM #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="Log(Cursor.GetString(\"idmaquina\"))";
parent.__c.LogImpl("27274505",_cursor.GetString("idmaquina"),0);
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="Log(Cursor.GetString(\"name\")&\"--\"&Cursor.GetStri";
parent.__c.LogImpl("27274506",_cursor.GetString("name")+"--"+_cursor.GetString("qnt"),0);
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="sb.Append(Cursor.GetString(\"name\")&\"--\"&Cursor.G";
_sb.Append(_cursor.GetString("name")+"--"+_cursor.GetString("qnt")).Append(parent.__c.CRLF);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="Log(sb.ToString)";
parent.__c.LogImpl("27274510",_sb.ToString(),0);
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM m";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
RDebugUtils.currentLine=7274514;
 //BA.debugLineNum = 7274514;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
parent.__c.LogImpl("27274516","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="Log(Cursor.GetString(\"id\"))'&\"--\"&Cursor.GetStr";
parent.__c.LogImpl("27274517",_cursor.GetString("id"),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=7274520;
 //BA.debugLineNum = 7274520;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"ListDad";
parent._b4xpages._showpageandremovepreviouspages /*String*/ (ba,"ListDados");
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="B4XPage_Created(Root)";
__ref._b4xpage_created /*String*/ (null,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=7274524;
 //BA.debugLineNum = 7274524;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("27274524",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=7274526;
 //BA.debugLineNum = 7274526;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getvaluesintheedittexts"),(int) (20));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=7274527;
 //BA.debugLineNum = 7274527;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Dim req As DBRequestManager = CreateRequest(Us";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_tipoReparacion",new Object[]{(Object)(_nombre),(Object)(_salario)});
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Dim j As HttpJob = req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "insertrecord"), (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Log(\"Inserted successfully!\")";
parent.__c.LogImpl("27471111","Inserted successfully!",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Datepicker.Initialize(\"Date\",2023 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2023),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2023");
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.12.2025");
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=6881292;
 //BA.debugLineNum = 6881292;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=6881293;
 //BA.debugLineNum = 6881293;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="configTime(\"Label13Time\")";
__ref._configtime /*String*/ (null,"Label13Time");
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public String  _label13time_ondateset(b4a.example.ef.form __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label13time_ondateset", false))
	 {return ((String) Debug.delegate(ba, "label13time_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub Label13Time_OnDateSet(year As Int ,monthOfYear";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Label13Time.Text=year&\"/\"&(NumberFormat(monthOfYe";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Label13Time.TextColor=Colors.Black";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public String  _label1removeinsumo_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label1removeinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "label1removeinsumo_click", null));}
int _id = 0;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub Label1RemoveInsumo_Click";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Label1RemoveInsumo=Sender";
__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/  = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Log(Label1RemoveInsumo.Tag)";
__c.LogImpl("28847362",BA.ObjectToString(__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTag()),0);
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Dim id As Int=Label1RemoveInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTag()));
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from insumo wh";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from insumo where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
String _salario = "";
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Try";
try {RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim salario As String";
_salario = "";
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="salario=\"10\"";
_salario = "10";
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="InsertRecord(Main.pDBName ,\"99\",salario)";
__ref._insertrecord /*void*/ (null,_main._pdbname /*String*/ ,"99",(int)(Double.parseDouble(_salario)));
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="Log(Label10.text&\"----\"&Label13Time.text)";
__c.LogImpl("27405576",__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+"----"+__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="Log(\"HACIENDA: \"&haciendaUpdate)";
__c.LogImpl("27405577","HACIENDA: "+__ref._haciendaupdate /*String*/ ,0);
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="If tipo=\"new\" Then";
if ((__ref._tipo /*String*/ ).equals("new")) { 
 }else {
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="Log(\"update\")";
__c.LogImpl("27405585","update",0);
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=7405589;
 //BA.debugLineNum = 7405589;BA.debugLine="Log(LastException)";
__c.LogImpl("27405589",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=7405592;
 //BA.debugLineNum = 7405592;BA.debugLine="End Sub";
return "";
}
public String  _removeallexcelpfist(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "removeallexcelpfist", false))
	 {return ((String) Debug.delegate(ba, "removeallexcelpfist", null));}
int _iw = 0;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub removeAllExcelpFist";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="For iw= CustomListView1Geral.Size-1 To  1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_iw = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1) ;
for (;_iw >= limit1 ;_iw = _iw + step1 ) {
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="If CustomListView1Geral.GetValue(iw)<>\"form1\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_iw)).equals((Object)("form1")) == false) { 
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Try";
try {RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="LogColor(\"REMOVE: \"&iw,Colors.Red)";
__c.LogImpl("26488070","REMOVE: "+BA.NumberToString(_iw),__c.Colors.Red);
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="CustomListView1Geral.RemoveAt(iw)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_iw);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="Log(LastException)";
__c.LogImpl("26488074",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 }
};
RDebugUtils.currentLine=6488079;
 //BA.debugLineNum = 6488079;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="configTime(\"TimeInicio\")";
__ref._configtime /*String*/ (null,"TimeInicio");
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="configTime(\"TimeFim\")";
__ref._configtime /*String*/ (null,"TimeFim");
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="configTime(\"Label13Time\")";
__ref._configtime /*String*/ (null,"Label13Time");
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxhda_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhda_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxhda_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub SD_xComboBoxHda_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Log(Value)";
__c.LogImpl("28060931",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="nit = \"800246222\"";
__ref._nit /*String*/  = "800246222";
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="haciendaUpdate = Value";
__ref._haciendaupdate /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=8060938;
 //BA.debugLineNum = 8060938;BA.debugLine="hacienda = SD_xComboBoxHda.GetItem(Position)";
__ref._hacienda /*String*/  = __ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._getitem /*String*/ (null,_position);
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
__ref._hacienda /*String*/  = __ref._hacienda /*String*/ .substring((int) (0),(int) (3));
RDebugUtils.currentLine=8060940;
 //BA.debugLineNum = 8060940;BA.debugLine="Log(hacienda)";
__c.LogImpl("28060940",__ref._hacienda /*String*/ ,0);
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="GetRecordLotes (Main.pDBName,Main.pNit, hacienda)";
__ref._getrecordlotes /*void*/ (null,_main._pdbname /*String*/ ,_main._pnit /*String*/ ,__ref._hacienda /*String*/ );
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub SD_xComboBoxLote_ItemClick (Position As Int, V";
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("28192006",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="lote = Value";
__ref._lote /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="Log(hacienda)";
__c.LogImpl("28192010",__ref._hacienda /*String*/ ,0);
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="GetRecordLotesArea (Main.pDBName,nit, hacienda,lo";
__ref._getrecordlotesarea /*void*/ (null,_main._pdbname /*String*/ ,__ref._nit /*String*/ ,__ref._hacienda /*String*/ ,__ref._lote /*String*/ );
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="End Sub";
return "";
}
public String  _spinner1nameinsumo_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner1nameinsumo_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1nameinsumo_itemclick", new Object[] {_position,_value}));}
int _id = 0;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub Spinner1NameInsumo_ItemClick (Position";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Spinner1NameInsumo=Sender";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/  = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(__c.Sender(ba)));
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Log(Spinner1NameInsumo.Tag)";
__c.LogImpl("29043970",BA.ObjectToString(__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getTag()),0);
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Log(Spinner1NameInsumo.SelectedItem)";
__c.LogImpl("29043971",__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem(),0);
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Dim id As Int=Spinner1NameInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getTag()));
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Starter.updateInsumo(Spinner1NameInsumo.SelectedI";
_starter._updateinsumo /*String*/ (__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem(),"",_id,BA.NumberToString(__ref._idmaquina /*int*/ ));
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="selectSQl(id)";
__ref._selectsql /*void*/ (null,_id);
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinnernit_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinnernit_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub SpinnerNit_ItemClick (Position As Int,";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Log(Value)";
__c.LogImpl("28454145",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit0_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinnernit0_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinnernit0_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub SpinnerNit0_ItemClick (Position As Int";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="If edt.Text=\"\" Then";
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
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="edt.HintColor=Colors.Red";
_edt.setHintColor(parent.__c.Colors.Red);
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="Sleep(350)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "validation"),(int) (350));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="edt.HintColor=Colors.Gray'.";
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
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}