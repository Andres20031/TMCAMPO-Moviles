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
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Try";
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
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="nitUpdate=\"\"";
__ref._nitupdate /*String*/  = "";
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="haciendaUpdate=\"\"";
__ref._haciendaupdate /*String*/  = "";
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB4008";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whi";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "b4xpage_appear"),(int) (20));
this.state = 17;
return;
case 17:
//C
this.state = 4;
;
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="If tipo=\"update\" Then";
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
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina where id="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=8716302;
 //BA.debugLineNum = 8716302;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=8716303;
 //BA.debugLineNum = 8716303;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=8716310;
 //BA.debugLineNum = 8716310;BA.debugLine="Label10.text=Cursor.GetString(\"fechaInicio\")";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaInicio")));
RDebugUtils.currentLine=8716311;
 //BA.debugLineNum = 8716311;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
RDebugUtils.currentLine=8716312;
 //BA.debugLineNum = 8716312;BA.debugLine="Label13Time.text=Cursor.GetString(\"fechaFim\")";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("fechaFim")));
RDebugUtils.currentLine=8716313;
 //BA.debugLineNum = 8716313;BA.debugLine="EditText1HoraInicio.text=Cursor.GetString(\"are";
__ref._edittext1horainicio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_cursor.GetString("arealabor")));
RDebugUtils.currentLine=8716314;
 //BA.debugLineNum = 8716314;BA.debugLine="nitUpdate=Cursor.GetString(\"Nit\")";
__ref._nitupdate /*String*/  = _cursor.GetString("Nit");
RDebugUtils.currentLine=8716315;
 //BA.debugLineNum = 8716315;BA.debugLine="haciendaUpdate=Cursor.GetString(\"hacienda\")";
__ref._haciendaupdate /*String*/  = _cursor.GetString("hacienda");
RDebugUtils.currentLine=8716317;
 //BA.debugLineNum = 8716317;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("18716317","NIT: "+__ref._nitupdate /*String*/ ,0);
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
RDebugUtils.currentLine=8716320;
 //BA.debugLineNum = 8716320;BA.debugLine="Log(\"NIT: \"&nit)";
parent.__c.LogImpl("18716320","NIT: "+__ref._nit /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 16;
;
RDebugUtils.currentLine=8716323;
 //BA.debugLineNum = 8716323;BA.debugLine="Dim estado As String";
_estado = "";
RDebugUtils.currentLine=8716326;
 //BA.debugLineNum = 8716326;BA.debugLine="estado = \"N\"";
_estado = "N";
RDebugUtils.currentLine=8716327;
 //BA.debugLineNum = 8716327;BA.debugLine="GetRecordNits(Main.pDBName,estado)";
__ref._getrecordnits /*void*/ (null,parent._main._pdbname /*String*/ ,_estado);
RDebugUtils.currentLine=8716328;
 //BA.debugLineNum = 8716328;BA.debugLine="GetRecordHaciendas(Main.pDBName,estado)";
__ref._getrecordhaciendas /*void*/ (null,parent._main._pdbname /*String*/ ,_estado);
RDebugUtils.currentLine=8716329;
 //BA.debugLineNum = 8716329;BA.debugLine="GetRecordLabores(Main.pDBName)";
__ref._getrecordlabores /*void*/ (null,parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8716330;
 //BA.debugLineNum = 8716330;BA.debugLine="GetRecordElegasto(Main.pDBName)";
__ref._getrecordelegasto /*void*/ (null,parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8716331;
 //BA.debugLineNum = 8716331;BA.debugLine="intContadorInsumos=0";
__ref._intcontadorinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=8716332;
 //BA.debugLineNum = 8716332;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
 if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 0;
RDebugUtils.currentLine=8716334;
 //BA.debugLineNum = 8716334;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("18716334",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 16:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=8716337;
 //BA.debugLineNum = 8716337;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="panel.LoadLayout(\"scroolUI\")";
_panel.LoadLayout("scroolUI",ba);
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=9044000;
 //BA.debugLineNum = 9044000;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=9044001;
 //BA.debugLineNum = 9044001;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordnits"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordnits"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="SD_xComboBoxNit.Add(\"----Select----\",\"1\")";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=10289168;
 //BA.debugLineNum = 10289168;BA.debugLine="Dim INTRegistros As Int";
_intregistros = 0;
RDebugUtils.currentLine=10289170;
 //BA.debugLineNum = 10289170;BA.debugLine="INTRegistros=0";
_intregistros = (int) (0);
RDebugUtils.currentLine=10289171;
 //BA.debugLineNum = 10289171;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10289172;
 //BA.debugLineNum = 10289172;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=10289173;
 //BA.debugLineNum = 10289173;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=10289174;
 //BA.debugLineNum = 10289174;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=10289176;
 //BA.debugLineNum = 10289176;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=10289178;
 //BA.debugLineNum = 10289178;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=10289179;
 //BA.debugLineNum = 10289179;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=10289180;
 //BA.debugLineNum = 10289180;BA.debugLine="INTRegistros=INTRegistros+1";
_intregistros = (int) (_intregistros+1);
RDebugUtils.currentLine=10289181;
 //BA.debugLineNum = 10289181;BA.debugLine="If nitUpdate=cadena Then";
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
RDebugUtils.currentLine=10289182;
 //BA.debugLineNum = 10289182;BA.debugLine="Log(\"NIT: \"&nitUpdate)";
parent.__c.LogImpl("110289182","NIT: "+__ref._nitupdate /*String*/ ,0);
RDebugUtils.currentLine=10289185;
 //BA.debugLineNum = 10289185;BA.debugLine="SD_xComboBoxNit.Add(nitUpdate,INTRegistros)";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,__ref._nitupdate /*String*/ ,(Object)(_intregistros));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=10289187;
 //BA.debugLineNum = 10289187;BA.debugLine="SD_xComboBoxNit.Add(cadena,INTRegistros)";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(_intregistros));
RDebugUtils.currentLine=10289188;
 //BA.debugLineNum = 10289188;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=10289194;
 //BA.debugLineNum = 10289194;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("110289194","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=10289196;
 //BA.debugLineNum = 10289196;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10289197;
 //BA.debugLineNum = 10289197;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(_estado)});
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10354697;
 //BA.debugLineNum = 10354697;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordhaciendas"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="SD_xComboBoxHda.Add(\"----Select----\",1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\",1)";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=10354705;
 //BA.debugLineNum = 10354705;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=10354709;
 //BA.debugLineNum = 10354709;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=10354714;
 //BA.debugLineNum = 10354714;BA.debugLine="Log(\"cadena: \"&cadena)";
parent.__c.LogImpl("110354714","cadena: "+_cadena,0);
RDebugUtils.currentLine=10354715;
 //BA.debugLineNum = 10354715;BA.debugLine="Log(\"hacienda: \"&haciendaUpdate)";
parent.__c.LogImpl("110354715","hacienda: "+__ref._haciendaupdate /*String*/ ,0);
RDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="If cadena.Contains(haciendaUpdate) Then";
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
RDebugUtils.currentLine=10354717;
 //BA.debugLineNum = 10354717;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=10354718;
 //BA.debugLineNum = 10354718;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=10354719;
 //BA.debugLineNum = 10354719;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
 if (true) break;

case 15:
//C
this.state = 16;
RDebugUtils.currentLine=10354721;
 //BA.debugLineNum = 10354721;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=10354722;
 //BA.debugLineNum = 10354722;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=10354723;
 //BA.debugLineNum = 10354723;BA.debugLine="SD_xComboBoxHda.Add(cadena,1)";
__ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
 if (true) break;

case 16:
//C
this.state = 24;
;
RDebugUtils.currentLine=10354726;
 //BA.debugLineNum = 10354726;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=10354730;
 //BA.debugLineNum = 10354730;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("110354730","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=10354732;
 //BA.debugLineNum = 10354732;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10354733;
 //BA.debugLineNum = 10354733;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10682382;
 //BA.debugLineNum = 10682382;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\",1)";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=10682384;
 //BA.debugLineNum = 10682384;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10682385;
 //BA.debugLineNum = 10682385;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=10682386;
 //BA.debugLineNum = 10682386;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=10682387;
 //BA.debugLineNum = 10682387;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=10682388;
 //BA.debugLineNum = 10682388;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=10682390;
 //BA.debugLineNum = 10682390;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=10682391;
 //BA.debugLineNum = 10682391;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=10682392;
 //BA.debugLineNum = 10682392;BA.debugLine="SD_xComboBoxLabor.Add(cadena,1)";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
RDebugUtils.currentLine=10682393;
 //BA.debugLineNum = 10682393;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=10682397;
 //BA.debugLineNum = 10682397;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("110682397","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=10682399;
 //BA.debugLineNum = 10682399;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10682400;
 //BA.debugLineNum = 10682400;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_eleg";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elegasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordelegasto"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordelegasto"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="SD_xComboBoxEleGasto.Add(\"----Select----\",1)";
__ref._sd_xcomboboxelegasto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)(1));
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=10747921;
 //BA.debugLineNum = 10747921;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=10747922;
 //BA.debugLineNum = 10747922;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=10747923;
 //BA.debugLineNum = 10747923;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=10747925;
 //BA.debugLineNum = 10747925;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=10747926;
 //BA.debugLineNum = 10747926;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=10747927;
 //BA.debugLineNum = 10747927;BA.debugLine="SD_xComboBoxEleGasto.Add(cadena,1)";
__ref._sd_xcomboboxelegasto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cadena,(Object)(1));
RDebugUtils.currentLine=10747928;
 //BA.debugLineNum = 10747928;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=10747932;
 //BA.debugLineNum = 10747932;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("110747932","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=10747934;
 //BA.debugLineNum = 10747934;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10747935;
 //BA.debugLineNum = 10747935;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub listInsumos";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="removeAllExcelpFist";
__ref._removeallexcelpfist /*String*/ (null);
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Dim NumberOfMatches As Int";
_numberofmatches = 0;
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="NumberOfMatches = Starter.SQL1.ExecQuerySingleRes";
_numberofmatches = (int)(Double.parseDouble(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuerySingleResult("SELECT count(*) FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="CustomListView1Geral.DesignerLabel.Height=8dip";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._designerlabel.setHeight(__c.DipToCurrent((int) (8)));
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="CustomListView1Geral.AddTextItem(\"Insumos(\"&Numbe";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._addtextitem((Object)("Insumos("+BA.NumberToString(_numberofmatches)+")"),(Object)("title"));
RDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=8781833;
 //BA.debugLineNum = 8781833;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
{
final int step8 = 1;
final int limit8 = (int) (_cursor.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="Dim	id As Int=Cursor.GetString(\"id\")";
_id = (int)(Double.parseDouble(_cursor.GetString("id")));
RDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="Log(Cursor.GetString(\"id\"))";
__c.LogImpl("18781837",_cursor.GetString("id"),0);
RDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="Log(Cursor.GetString(\"name\"))";
__c.LogImpl("18781838",_cursor.GetString("name"),0);
RDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="Log(Cursor.GetString(\"qnt\"))";
__c.LogImpl("18781839",_cursor.GetString("qnt"),0);
RDebugUtils.currentLine=8781840;
 //BA.debugLineNum = 8781840;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumos(i+1,i";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumos /*anywheresoftware.b4a.objects.PanelWrapper*/ (null,(int) (_i+1),_id,_cursor.GetString("name"),_cursor.GetString("qnt")).getObject())),(Object)("insumo"));
 }
};
RDebugUtils.currentLine=8781844;
 //BA.debugLineNum = 8781844;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=8781845;
 //BA.debugLineNum = 8781845;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=8781847;
 //BA.debugLineNum = 8781847;BA.debugLine="panel.LoadLayout(\"emptyInsumos\")";
_panel.LoadLayout("emptyInsumos",ba);
RDebugUtils.currentLine=8781848;
 //BA.debugLineNum = 8781848;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=8781849;
 //BA.debugLineNum = 8781849;BA.debugLine="If i=0 Then";
if (_i==0) { 
RDebugUtils.currentLine=8781850;
 //BA.debugLineNum = 8781850;BA.debugLine="Label1Empty.Visible=True";
__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=8781852;
 //BA.debugLineNum = 8781852;BA.debugLine="Label1Empty.Visible=False";
__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=8781853;
 //BA.debugLineNum = 8781853;BA.debugLine="Button1AddIsumo.Top=Label1Empty.top";
__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setTop(__ref._label1empty /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTop());
RDebugUtils.currentLine=8781854;
 //BA.debugLineNum = 8781854;BA.debugLine="panel.Height=Button1AddIsumo.Height";
_panel.setHeight(__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .getHeight());
 };
RDebugUtils.currentLine=8781859;
 //BA.debugLineNum = 8781859;BA.debugLine="CustomListView1Geral.Add(panel,0)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add(_panel,(Object)(0));
RDebugUtils.currentLine=8781860;
 //BA.debugLineNum = 8781860;BA.debugLine="CustomListView1Geral.ScrollToItem(CustomListView1";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._scrolltoitem((int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1));
RDebugUtils.currentLine=8781864;
 //BA.debugLineNum = 8781864;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(b4a.example.ef.form __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=8650768;
 //BA.debugLineNum = 8650768;BA.debugLine="End Sub";
return "";
}
public String  _button1addisumo_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "button1addisumo_click", false))
	 {return ((String) Debug.delegate(ba, "button1addisumo_click", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub Button1AddIsumo_Click";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Try";
try {RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="Button1AddIsumo=Sender";
__ref._button1addisumo /*anywheresoftware.b4a.objects.ButtonWrapper*/  = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"INSERT INTO insumo V";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("INSERT INTO insumo VALUES (?, ?, ?,?)",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{__c.Null,(Object)("NO NAME"),(Object)("0"),(Object)(__ref._idmaquina /*int*/ )}));
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="intContadorInsumos=	intContadorInsumos + 1";
__ref._intcontadorinsumos /*int*/  = (int) (__ref._intcontadorinsumos /*int*/ +1);
RDebugUtils.currentLine=11141126;
 //BA.debugLineNum = 11141126;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=11141128;
 //BA.debugLineNum = 11141128;BA.debugLine="Log(LastException)";
__c.LogImpl("111141128",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11141131;
 //BA.debugLineNum = 11141131;BA.debugLine="End Sub";
return "";
}
public String  _can_oncanceldate(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "can_oncanceldate", false))
	 {return ((String) Debug.delegate(ba, "can_oncanceldate", null));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Dim nitUpdate As String=\"\"";
_nitupdate = "";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Dim haciendaUpdate As String";
_haciendaupdate = "";
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Dim idMaquina As Int";
_idmaquina = 0;
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Dim tipo As String=\"\"";
_tipo = "";
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="Dim Timepicker As Intellvold_TimePicker";
_timepicker = new lib.intellvold.datepicker.TimePicker();
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="Dim Datepicker2 As Intellvold_DatePicker";
_datepicker2 = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="Dim Mycalendar2 As Intellvold_Calendar";
_mycalendar2 = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=8519696;
 //BA.debugLineNum = 8519696;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=8519698;
 //BA.debugLineNum = 8519698;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8519699;
 //BA.debugLineNum = 8519699;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8519703;
 //BA.debugLineNum = 8519703;BA.debugLine="Private SpinnerNit As Spinner";
_spinnernit = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="Private EditText2area As EditText";
_edittext2area = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8519705;
 //BA.debugLineNum = 8519705;BA.debugLine="Private EditText1cmb As EditText";
_edittext1cmb = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8519706;
 //BA.debugLineNum = 8519706;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8519708;
 //BA.debugLineNum = 8519708;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8519710;
 //BA.debugLineNum = 8519710;BA.debugLine="Private nit As String";
_nit = "";
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="Private hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=8519712;
 //BA.debugLineNum = 8519712;BA.debugLine="Private lote As String";
_lote = "";
RDebugUtils.currentLine=8519720;
 //BA.debugLineNum = 8519720;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=8519722;
 //BA.debugLineNum = 8519722;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=8519723;
 //BA.debugLineNum = 8519723;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8519724;
 //BA.debugLineNum = 8519724;BA.debugLine="Private Label14Add As Label";
_label14add = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8519725;
 //BA.debugLineNum = 8519725;BA.debugLine="Private Button1AddIsumo As Button";
_button1addisumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=8519726;
 //BA.debugLineNum = 8519726;BA.debugLine="Private Label1RemoveInsumo As Label";
_label1removeinsumo = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8519727;
 //BA.debugLineNum = 8519727;BA.debugLine="Private Label1Empty As Label";
_label1empty = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8519728;
 //BA.debugLineNum = 8519728;BA.debugLine="Private Label2InsumoName As Label";
_label2insumoname = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8519730;
 //BA.debugLineNum = 8519730;BA.debugLine="Private EditText2QntInsumo As EditText";
_edittext2qntinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8519731;
 //BA.debugLineNum = 8519731;BA.debugLine="Private Spinner1NameInsumo As Spinner";
_spinner1nameinsumo = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=8519733;
 //BA.debugLineNum = 8519733;BA.debugLine="Private intContadorInsumos As Int";
_intcontadorinsumos = 0;
RDebugUtils.currentLine=8519735;
 //BA.debugLineNum = 8519735;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=8519736;
 //BA.debugLineNum = 8519736;BA.debugLine="Private SD_xComboBoxHda As SD_xComboBox";
_sd_xcomboboxhda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=8519737;
 //BA.debugLineNum = 8519737;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=8519738;
 //BA.debugLineNum = 8519738;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=8519739;
 //BA.debugLineNum = 8519739;BA.debugLine="Private SD_xComboBoxEleGasto As SD_xComboBox";
_sd_xcomboboxelegasto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=8519741;
 //BA.debugLineNum = 8519741;BA.debugLine="End Sub";
return "";
}
public String  _configtime(b4a.example.ef.form __ref,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "configtime", false))
	 {return ((String) Debug.delegate(ba, "configtime", new Object[] {_tag}));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub configTime(tag As String)";
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="Datepicker.Initialize(tag,2022 ,DateTime.GetMonth";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,_tag,(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=9502735;
 //BA.debugLineNum = 9502735;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=9502736;
 //BA.debugLineNum = 9502736;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=9502737;
 //BA.debugLineNum = 9502737;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=9502738;
 //BA.debugLineNum = 9502738;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=9502740;
 //BA.debugLineNum = 9502740;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=9502741;
 //BA.debugLineNum = 9502741;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=9502742;
 //BA.debugLineNum = 9502742;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=9502743;
 //BA.debugLineNum = 9502743;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=9502745;
 //BA.debugLineNum = 9502745;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.form __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumos(b4a.example.ef.form __ref,int _i,int _id,String _name,String _qnt) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "createiteminsumos", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumos", new Object[] {_i,_id,_name,_qnt}));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Private Sub CreateItemInsumos(i As Int,id As Int,";
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 450dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (450)));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="panel.LoadLayout(\"Cardisumo\")";
_panel.LoadLayout("Cardisumo",ba);
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="EditText2QntInsumo.Color=Colors.Transparent";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Label2InsumoName.Text=\"Insumo #\"&i";
__ref._label2insumoname /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Insumo #"+BA.NumberToString(_i)));
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Label1RemoveInsumo.Tag=id";
__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="Spinner1NameInsumo.Tag=id";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="EditText2QntInsumo.Tag=id";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setTag((Object)(_id));
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="EditText2QntInsumo.text=qnt";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_qnt));
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="Spinner1NameInsumo.Prompt=name";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setPrompt(BA.ObjectToCharSequence(_name));
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="FillSpinner(name)";
__ref._fillspinner /*void*/ (null,_name);
RDebugUtils.currentLine=8912928;
 //BA.debugLineNum = 8912928;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=8912929;
 //BA.debugLineNum = 8912929;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Try";
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
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Spinner1NameInsumo.Clear";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo where name='"+_name+"'")));
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="Log(Cursor.GetString(\"name\"))";
parent.__c.LogImpl("18978442",_cursor.GetString("name"),0);
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cursor.GetString("name"));
 if (true) break;
if (true) break;
;
RDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="If name=\"NO NAME\" Then";

case 7:
//if
this.state = 10;
if ((_name).equals("NO NAME")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="Spinner1NameInsumo.Add(\"\")";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add("");
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=8978452;
 //BA.debugLineNum = 8978452;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM n";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM namesinsumo")));
RDebugUtils.currentLine=8978453;
 //BA.debugLineNum = 8978453;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=8978454;
 //BA.debugLineNum = 8978454;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=8978456;
 //BA.debugLineNum = 8978456;BA.debugLine="Spinner1NameInsumo.Add(Cursor.GetString(\"name\")";
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
RDebugUtils.currentLine=8978459;
 //BA.debugLineNum = 8978459;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("18978459",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 17:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=8978461;
 //BA.debugLineNum = 8978461;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "fillspinner"),(int) (20));
this.state = 22;
return;
case 22:
//C
this.state = -1;
;
RDebugUtils.currentLine=8978462;
 //BA.debugLineNum = 8978462;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" &  Main.p";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_main._pdbname /*String*/ );
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.form __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.form __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="End Sub";
return "";
}
public String  _edittext2qntinsumo_textchanged(b4a.example.ef.form __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "edittext2qntinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2qntinsumo_textchanged", new Object[] {_old,_new}));}
int _id = 0;
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub EditText2QntInsumo_TextChanged (Old As";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Try";
try {RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="EditText2QntInsumo=Sender";
__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/  = (anywheresoftware.b4a.objects.EditTextWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.EditTextWrapper(), (android.widget.EditText)(__c.Sender(ba)));
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="Dim id As Int=EditText2QntInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getTag()));
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Starter.updateInsumo(\"\",EditText2QntInsumo.text,";
_starter._updateinsumo /*String*/ ("",__ref._edittext2qntinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),_id,BA.NumberToString(__ref._idmaquina /*int*/ ));
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="selectSQl(id)";
__ref._selectsql /*void*/ (null,_id);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="Log(LastException)";
__c.LogImpl("111272201",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Try";
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
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=11337731;
 //BA.debugLineNum = 11337731;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM in";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where id="+BA.NumberToString(_id))));
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="Cursor.Position = i";
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
RDebugUtils.currentLine=11337741;
 //BA.debugLineNum = 11337741;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("111337741",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=11337743;
 //BA.debugLineNum = 11337743;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "selectsql"),(int) (20));
this.state = 13;
return;
case 13:
//C
this.state = -1;
;
RDebugUtils.currentLine=11337745;
 //BA.debugLineNum = 11337745;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nitlote),(Object)(_hda)});
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="SD_xComboBoxLote.Add(cadena,1)";
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
RDebugUtils.currentLine=10485783;
 //BA.debugLineNum = 10485783;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("110485783","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=10485785;
 //BA.debugLineNum = 10485785;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10485786;
 //BA.debugLineNum = 10485786;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_Area";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_AreaSuertes",new Object[]{(Object)(_nitlote),(Object)(_hda),(Object)(_lotearea)});
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotesarea"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getrecordlotesarea"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=10616848;
 //BA.debugLineNum = 10616848;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="EditText2HoraFim.Text=cadena";
__ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_cadena));
RDebugUtils.currentLine=10616851;
 //BA.debugLineNum = 10616851;BA.debugLine="EditText2HoraFim.Enabled =False";
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
RDebugUtils.currentLine=10616859;
 //BA.debugLineNum = 10616859;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("110616859","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=10616861;
 //BA.debugLineNum = 10616861;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10616862;
 //BA.debugLineNum = 10616862;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Try";
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
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM i";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM insumo where idmaquina ="+BA.NumberToString(__ref._idmaquina /*int*/ ))));
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Log(\"=====ITEM #\"&i&\"=====\")";
parent.__c.LogImpl("19633800","=====ITEM #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=9633801;
 //BA.debugLineNum = 9633801;BA.debugLine="Log(Cursor.GetString(\"idmaquina\"))";
parent.__c.LogImpl("19633801",_cursor.GetString("idmaquina"),0);
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Log(Cursor.GetString(\"name\")&\"--\"&Cursor.GetStri";
parent.__c.LogImpl("19633802",_cursor.GetString("name")+"--"+_cursor.GetString("qnt"),0);
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="sb.Append(Cursor.GetString(\"name\")&\"--\"&Cursor.G";
_sb.Append(_cursor.GetString("name")+"--"+_cursor.GetString("qnt")).Append(parent.__c.CRLF);
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
RDebugUtils.currentLine=9633806;
 //BA.debugLineNum = 9633806;BA.debugLine="Log(sb.ToString)";
parent.__c.LogImpl("19633806",_sb.ToString(),0);
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="Dim Cursor As Cursor";
_cursor = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="Cursor = Starter.SQL1.ExecQuery(\"SELECT * FROM m";
_cursor = (anywheresoftware.b4a.sql.SQL.CursorWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.sql.SQL.CursorWrapper(), (android.database.Cursor)(parent._starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecQuery("SELECT * FROM maquina")));
RDebugUtils.currentLine=9633810;
 //BA.debugLineNum = 9633810;BA.debugLine="For i = 0 To Cursor.RowCount - 1";
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
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="Cursor.Position = i";
_cursor.setPosition(_i);
RDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="Log(\"=====Maquinas #\"&i&\"=====\")";
parent.__c.LogImpl("19633812","=====Maquinas #"+BA.NumberToString(_i)+"=====",0);
RDebugUtils.currentLine=9633813;
 //BA.debugLineNum = 9633813;BA.debugLine="Log(Cursor.GetString(\"id\"))'&\"--\"&Cursor.GetStr";
parent.__c.LogImpl("19633813",_cursor.GetString("id"),0);
 if (true) break;
if (true) break;

case 11:
//C
this.state = 14;
;
RDebugUtils.currentLine=9633816;
 //BA.debugLineNum = 9633816;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"ListDad";
parent._b4xpages._showpageandremovepreviouspages /*String*/ (ba,"ListDados");
RDebugUtils.currentLine=9633817;
 //BA.debugLineNum = 9633817;BA.debugLine="B4XPages.ClosePage(Me)";
parent._b4xpages._closepage /*String*/ (ba,parent);
RDebugUtils.currentLine=9633818;
 //BA.debugLineNum = 9633818;BA.debugLine="B4XPage_Created(Root)";
__ref._b4xpage_created /*String*/ (null,__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
RDebugUtils.currentLine=9633820;
 //BA.debugLineNum = 9633820;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("19633820",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=9633822;
 //BA.debugLineNum = 9633822;BA.debugLine="Sleep(20)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "getvaluesintheedittexts"),(int) (20));
this.state = 19;
return;
case 19:
//C
this.state = -1;
;
RDebugUtils.currentLine=9633823;
 //BA.debugLineNum = 9633823;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim req As DBRequestManager = CreateRequest(Us";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_tipoReparacion",new Object[]{(Object)(_nombre),(Object)(_salario)});
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Dim j As HttpJob = req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "insertrecord"), (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Log(\"Inserted successfully!\")";
parent.__c.LogImpl("19830407","Inserted successfully!",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Datepicker.Initialize(\"Date\",2023 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2023),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2023");
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.12.2025");
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=9240588;
 //BA.debugLineNum = 9240588;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=9240589;
 //BA.debugLineNum = 9240589;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=9240590;
 //BA.debugLineNum = 9240590;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="configTime(\"Label13Time\")";
__ref._configtime /*String*/ (null,"Label13Time");
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="End Sub";
return "";
}
public String  _label13time_ondateset(b4a.example.ef.form __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label13time_ondateset", false))
	 {return ((String) Debug.delegate(ba, "label13time_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub Label13Time_OnDateSet(year As Int ,monthOfYear";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Label13Time.Text=year&\"/\"&(NumberFormat(monthOfYe";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Label13Time.TextColor=Colors.Black";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="End Sub";
return "";
}
public String  _label1removeinsumo_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label1removeinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "label1removeinsumo_click", null));}
int _id = 0;
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub Label1RemoveInsumo_Click";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="Label1RemoveInsumo=Sender";
__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/  = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(__c.Sender(ba)));
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Log(Label1RemoveInsumo.Tag)";
__c.LogImpl("111206658",BA.ObjectToString(__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTag()),0);
RDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Dim id As Int=Label1RemoveInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._label1removeinsumo /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTag()));
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="Starter.SQL1.ExecNonQuery2(\"DELETE from insumo wh";
_starter._sql1 /*anywheresoftware.b4a.sql.SQL*/ .ExecNonQuery2("DELETE from insumo where id=?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_id)}));
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="listInsumos";
__ref._listinsumos /*String*/ (null);
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
String _salario = "";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Try";
try {RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Dim salario As String";
_salario = "";
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="salario=\"10\"";
_salario = "10";
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="InsertRecord(Main.pDBName ,\"99\",salario)";
__ref._insertrecord /*void*/ (null,_main._pdbname /*String*/ ,"99",(int)(Double.parseDouble(_salario)));
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Log(Label10.text&\"----\"&Label13Time.text)";
__c.LogImpl("19764872",__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText()+"----"+__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .getText(),0);
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Log(\"HACIENDA: \"&haciendaUpdate)";
__c.LogImpl("19764873","HACIENDA: "+__ref._haciendaupdate /*String*/ ,0);
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="If tipo=\"new\" Then";
if ((__ref._tipo /*String*/ ).equals("new")) { 
 }else {
RDebugUtils.currentLine=9764881;
 //BA.debugLineNum = 9764881;BA.debugLine="Log(\"update\")";
__c.LogImpl("19764881","update",0);
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=9764885;
 //BA.debugLineNum = 9764885;BA.debugLine="Log(LastException)";
__c.LogImpl("19764885",BA.ObjectToString(__c.LastException(ba)),0);
 };
RDebugUtils.currentLine=9764888;
 //BA.debugLineNum = 9764888;BA.debugLine="End Sub";
return "";
}
public String  _removeallexcelpfist(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "removeallexcelpfist", false))
	 {return ((String) Debug.delegate(ba, "removeallexcelpfist", null));}
int _iw = 0;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub removeAllExcelpFist";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="For iw= CustomListView1Geral.Size-1 To  1 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (1);
_iw = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1) ;
for (;_iw >= limit1 ;_iw = _iw + step1 ) {
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="If CustomListView1Geral.GetValue(iw)<>\"form1\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_iw)).equals((Object)("form1")) == false) { 
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Try";
try {RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="LogColor(\"REMOVE: \"&iw,Colors.Red)";
__c.LogImpl("18847366","REMOVE: "+BA.NumberToString(_iw),__c.Colors.Red);
RDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="CustomListView1Geral.RemoveAt(iw)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_iw);
 } 
       catch (Exception e7) {
			ba.setLastException(e7);RDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="Log(LastException)";
__c.LogImpl("18847370",BA.ObjectToString(__c.LastException(ba)),0);
 };
 };
 }
};
RDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="configTime(\"TimeInicio\")";
__ref._configtime /*String*/ (null,"TimeInicio");
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="configTime(\"TimeFim\")";
__ref._configtime /*String*/ (null,"TimeFim");
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.form __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="configTime(\"Label13Time\")";
__ref._configtime /*String*/ (null,"Label13Time");
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxhda_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhda_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxhda_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub SD_xComboBoxHda_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="Log(Value)";
__c.LogImpl("110420227",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="nit = \"800246222\"";
__ref._nit /*String*/  = "800246222";
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="haciendaUpdate = Value";
__ref._haciendaupdate /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="hacienda = SD_xComboBoxHda.GetItem(Position)";
__ref._hacienda /*String*/  = __ref._sd_xcomboboxhda /*b4a.example.ef.sd_xcombobox*/ ._getitem /*String*/ (null,_position);
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
__ref._hacienda /*String*/  = __ref._hacienda /*String*/ .substring((int) (0),(int) (3));
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="Log(hacienda)";
__c.LogImpl("110420236",__ref._hacienda /*String*/ ,0);
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="GetRecordLotes (Main.pDBName,Main.pNit, hacienda)";
__ref._getrecordlotes /*void*/ (null,_main._pdbname /*String*/ ,_main._pnit /*String*/ ,__ref._hacienda /*String*/ );
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub SD_xComboBoxLote_ItemClick (Position As Int, V";
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("110551302",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="lote = Value";
__ref._lote /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Log(hacienda)";
__c.LogImpl("110551306",__ref._hacienda /*String*/ ,0);
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="GetRecordLotesArea (Main.pDBName,nit, hacienda,lo";
__ref._getrecordlotesarea /*void*/ (null,_main._pdbname /*String*/ ,__ref._nit /*String*/ ,__ref._hacienda /*String*/ ,__ref._lote /*String*/ );
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="End Sub";
return "";
}
public String  _spinner1nameinsumo_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner1nameinsumo_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1nameinsumo_itemclick", new Object[] {_position,_value}));}
int _id = 0;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub Spinner1NameInsumo_ItemClick (Position";
RDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="Spinner1NameInsumo=Sender";
__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/  = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(__c.Sender(ba)));
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="Log(Spinner1NameInsumo.Tag)";
__c.LogImpl("111403266",BA.ObjectToString(__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getTag()),0);
RDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Log(Spinner1NameInsumo.SelectedItem)";
__c.LogImpl("111403267",__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem(),0);
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="Dim id As Int=Spinner1NameInsumo.Tag";
_id = (int)(BA.ObjectToNumber(__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getTag()));
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Starter.updateInsumo(Spinner1NameInsumo.SelectedI";
_starter._updateinsumo /*String*/ (__ref._spinner1nameinsumo /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedItem(),"",_id,BA.NumberToString(__ref._idmaquina /*int*/ ));
RDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="selectSQl(id)";
__ref._selectsql /*void*/ (null,_id);
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinnernit_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinnernit_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub SpinnerNit_ItemClick (Position As Int,";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="Log(Value)";
__c.LogImpl("110813441",BA.ObjectToString(_value),0);
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="End Sub";
return "";
}
public String  _spinnernit0_itemclick(b4a.example.ef.form __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="form";
if (Debug.shouldDelegate(ba, "spinnernit0_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinnernit0_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub SpinnerNit0_ItemClick (Position As Int";
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="If edt.Text=\"\" Then";
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
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="edt.HintColor=Colors.Red";
_edt.setHintColor(parent.__c.Colors.Red);
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="Sleep(350)";
parent.__c.Sleep(ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "form", "validation"),(int) (350));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="edt.HintColor=Colors.Gray'.";
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
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}