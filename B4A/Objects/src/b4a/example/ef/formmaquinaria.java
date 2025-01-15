package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formmaquinaria extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formmaquinaria");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formmaquinaria.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example.ef.util _utilclass = null;
public b4a.example3.customlistview _customlistview1geral = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1geral = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1back = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2save = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxmaquina = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlabor = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxnit = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxhacienda = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlote = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboximplemento = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboximplemento2 = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxoperario = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxobservaciones = null;
public String _haciendacbx = "";
public String _rdclink = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel2time = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public String _fecha = "";
public String _maquina = "";
public String _labor = "";
public String _nitempresacbx = "";
public String _lote = "";
public String _implemento = "";
public String _implemento2 = "";
public String _operario = "";
public String _observaciones = "";
public String _horafin = "";
public String _horainicio = "";
public String _combustible = "";
public String _area = "";
public String _horaactual = "";
public String _user = "";
public String _devicename = "";
public String _ascdo_maq_mvto_maq = "";
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1horainicio = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2horafim = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2 = null;
public String _fechahoy = "";
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formmaquinaria __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formmaquinaria __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=12976149;
 //BA.debugLineNum = 12976149;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmdmaquina = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _resmaquina = null;
Object[] _rowmaquina = null;
String _codigomaquina = "";
String _descripcionmaquina = "";
b4a.example.ef.main._dbcommand _cmdlabormaquina = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reslabormaquina = null;
Object[] _rowlabormaquina = null;
String _codigolabormaquina = "";
String _descripcionlabormaquina = "";
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _razonsocial = "";
String _nit = "";
b4a.example.ef.main._dbcommand _cmdimple = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _resimple = null;
Object[] _rowimple = null;
String _codigoimple = "";
String _descripcionimple = "";
b4a.example.ef.main._dbcommand _cmdoper = null;
b4a.example.ef.httpjob _j5 = null;
b4a.example.ef.main._dbresult _resoper = null;
Object[] _rowoper = null;
String _codigooper = "";
String _apellido1 = "";
String _apellido2 = "";
String _nombre = "";
b4a.example.ef.main._dbcommand _cmdobser = null;
b4a.example.ef.httpjob _j6 = null;
b4a.example.ef.main._dbresult _resobser = null;
Object[] _rowobser = null;
String _codigoobser = "";
String _desobser = "";
anywheresoftware.b4a.BA.IterableList group14;
int index14;
int groupLen14;
anywheresoftware.b4a.BA.IterableList group28;
int index28;
int groupLen28;
anywheresoftware.b4a.BA.IterableList group42;
int index42;
int groupLen42;
anywheresoftware.b4a.BA.IterableList group55;
int index55;
int groupLen55;
anywheresoftware.b4a.BA.IterableList group70;
int index70;
int groupLen70;
anywheresoftware.b4a.BA.IterableList group86;
int index86;
int groupLen86;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=12648456;
 //BA.debugLineNum = 12648456;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12648457;
 //BA.debugLineNum = 12648457;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12648460;
 //BA.debugLineNum = 12648460;BA.debugLine="Dim cmdMaquina As DBCommand = CreateCommand(\"sele";
_cmdmaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maquina",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12648461;
 //BA.debugLineNum = 12648461;BA.debugLine="Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdmaquina,(int) (0),parent.__c.Null)));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12648462;
 //BA.debugLineNum = 12648462;BA.debugLine="If j2.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j2._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12648463;
 //BA.debugLineNum = 12648463;BA.debugLine="Req.HandleJobAsync(j2, \"req_maquina\")";
_req._handlejobasync /*void*/ (null,_j2,"req_maquina");
RDebugUtils.currentLine=12648464;
 //BA.debugLineNum = 12648464;BA.debugLine="Wait For (Req) req_maquina_Result(resMaquina As";
parent.__c.WaitFor("req_maquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 62;
return;
case 62:
//C
this.state = 4;
_resmaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12648465;
 //BA.debugLineNum = 12648465;BA.debugLine="For Each rowMaquina() As Object In resMaquina.Ro";
if (true) break;

case 4:
//for
this.state = 7;
group14 = _resmaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index14 = 0;
groupLen14 = group14.getSize();
this.state = 63;
if (true) break;

case 63:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_rowmaquina = (Object[])(group14.Get(index14));}
if (true) break;

case 64:
//C
this.state = 63;
index14++;
if (true) break;

case 6:
//C
this.state = 64;
RDebugUtils.currentLine=12648466;
 //BA.debugLineNum = 12648466;BA.debugLine="Dim codigoMaquina As String = rowMaquina(0) ' C";
_codigomaquina = BA.ObjectToString(_rowmaquina[(int) (0)]);
RDebugUtils.currentLine=12648467;
 //BA.debugLineNum = 12648467;BA.debugLine="Dim descripcionMaquina As String = rowMaquina(1";
_descripcionmaquina = BA.ObjectToString(_rowmaquina[(int) (1)]);
RDebugUtils.currentLine=12648468;
 //BA.debugLineNum = 12648468;BA.debugLine="SD_xComboBoxMaquina.Add(descripcionMaquina, cod";
__ref._sd_xcomboboxmaquina /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionmaquina,(Object)(_codigomaquina));
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
RDebugUtils.currentLine=12648471;
 //BA.debugLineNum = 12648471;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("212648471","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=12648473;
 //BA.debugLineNum = 12648473;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=12648477;
 //BA.debugLineNum = 12648477;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12648478;
 //BA.debugLineNum = 12648478;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 65;
return;
case 65:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12648479;
 //BA.debugLineNum = 12648479;BA.debugLine="If j3.Success Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_j3._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=12648480;
 //BA.debugLineNum = 12648480;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=12648481;
 //BA.debugLineNum = 12648481;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 66;
return;
case 66:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12648482;
 //BA.debugLineNum = 12648482;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
if (true) break;

case 14:
//for
this.state = 17;
group28 = _reslabormaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index28 = 0;
groupLen28 = group28.getSize();
this.state = 67;
if (true) break;

case 67:
//C
this.state = 17;
if (index28 < groupLen28) {
this.state = 16;
_rowlabormaquina = (Object[])(group28.Get(index28));}
if (true) break;

case 68:
//C
this.state = 67;
index28++;
if (true) break;

case 16:
//C
this.state = 68;
RDebugUtils.currentLine=12648483;
 //BA.debugLineNum = 12648483;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=12648484;
 //BA.debugLineNum = 12648484;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=12648485;
 //BA.debugLineNum = 12648485;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionlabormaquina,(Object)(_codigolabormaquina));
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
RDebugUtils.currentLine=12648488;
 //BA.debugLineNum = 12648488;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("212648488","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=12648490;
 //BA.debugLineNum = 12648490;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=12648494;
 //BA.debugLineNum = 12648494;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12648495;
 //BA.debugLineNum = 12648495;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 69;
return;
case 69:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12648496;
 //BA.debugLineNum = 12648496;BA.debugLine="If j.Success Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_j._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=12648497;
 //BA.debugLineNum = 12648497;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12648498;
 //BA.debugLineNum = 12648498;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 70;
return;
case 70:
//C
this.state = 24;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12648499;
 //BA.debugLineNum = 12648499;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 24:
//for
this.state = 27;
group42 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index42 = 0;
groupLen42 = group42.getSize();
this.state = 71;
if (true) break;

case 71:
//C
this.state = 27;
if (index42 < groupLen42) {
this.state = 26;
_row = (Object[])(group42.Get(index42));}
if (true) break;

case 72:
//C
this.state = 71;
index42++;
if (true) break;

case 26:
//C
this.state = 72;
RDebugUtils.currentLine=12648500;
 //BA.debugLineNum = 12648500;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12648501;
 //BA.debugLineNum = 12648501;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=12648502;
 //BA.debugLineNum = 12648502;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
 if (true) break;
if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=12648505;
 //BA.debugLineNum = 12648505;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("212648505","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=12648510;
 //BA.debugLineNum = 12648510;BA.debugLine="Dim cmdImple As DBCommand = CreateCommand(\"select";
_cmdimple = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_implemento",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12648511;
 //BA.debugLineNum = 12648511;BA.debugLine="Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdimple,(int) (0),parent.__c.Null)));
this.state = 73;
return;
case 73:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12648512;
 //BA.debugLineNum = 12648512;BA.debugLine="If j4.Success Then";
if (true) break;

case 31:
//if
this.state = 40;
if (_j4._success /*boolean*/ ) { 
this.state = 33;
}else {
this.state = 39;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=12648513;
 //BA.debugLineNum = 12648513;BA.debugLine="Req.HandleJobAsync(j4, \"req_imple\")";
_req._handlejobasync /*void*/ (null,_j4,"req_imple");
RDebugUtils.currentLine=12648514;
 //BA.debugLineNum = 12648514;BA.debugLine="Wait For (Req) req_imple_Result(resImple As DBRe";
parent.__c.WaitFor("req_imple_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 74;
return;
case 74:
//C
this.state = 34;
_resimple = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12648515;
 //BA.debugLineNum = 12648515;BA.debugLine="For Each rowImple() As Object In resImple.Rows";
if (true) break;

case 34:
//for
this.state = 37;
group55 = _resimple.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index55 = 0;
groupLen55 = group55.getSize();
this.state = 75;
if (true) break;

case 75:
//C
this.state = 37;
if (index55 < groupLen55) {
this.state = 36;
_rowimple = (Object[])(group55.Get(index55));}
if (true) break;

case 76:
//C
this.state = 75;
index55++;
if (true) break;

case 36:
//C
this.state = 76;
RDebugUtils.currentLine=12648516;
 //BA.debugLineNum = 12648516;BA.debugLine="Dim codigoImple As String = rowImple(0) ' Cdgo_";
_codigoimple = BA.ObjectToString(_rowimple[(int) (0)]);
RDebugUtils.currentLine=12648517;
 //BA.debugLineNum = 12648517;BA.debugLine="Dim descripcionImple As String = rowImple(1) '";
_descripcionimple = BA.ObjectToString(_rowimple[(int) (1)]);
RDebugUtils.currentLine=12648518;
 //BA.debugLineNum = 12648518;BA.debugLine="SD_xComboBoxImplemento.Add(descripcionImple, co";
__ref._sd_xcomboboximplemento /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple,(Object)(_codigoimple));
RDebugUtils.currentLine=12648519;
 //BA.debugLineNum = 12648519;BA.debugLine="SD_xComboBoxImplemento2.Add(descripcionImple, c";
__ref._sd_xcomboboximplemento2 /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple,(Object)(_codigoimple));
 if (true) break;
if (true) break;

case 37:
//C
this.state = 40;
;
 if (true) break;

case 39:
//C
this.state = 40;
RDebugUtils.currentLine=12648522;
 //BA.debugLineNum = 12648522;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("212648522","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=12648524;
 //BA.debugLineNum = 12648524;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=12648528;
 //BA.debugLineNum = 12648528;BA.debugLine="Dim cmdOper As DBCommand = CreateCommand(\"select_";
_cmdoper = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_operario",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12648529;
 //BA.debugLineNum = 12648529;BA.debugLine="Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) Job";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdoper,(int) (0),parent.__c.Null)));
this.state = 77;
return;
case 77:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12648530;
 //BA.debugLineNum = 12648530;BA.debugLine="If j5.Success Then";
if (true) break;

case 41:
//if
this.state = 50;
if (_j5._success /*boolean*/ ) { 
this.state = 43;
}else {
this.state = 49;
}if (true) break;

case 43:
//C
this.state = 44;
RDebugUtils.currentLine=12648531;
 //BA.debugLineNum = 12648531;BA.debugLine="Req.HandleJobAsync(j5, \"req_oper\")";
_req._handlejobasync /*void*/ (null,_j5,"req_oper");
RDebugUtils.currentLine=12648532;
 //BA.debugLineNum = 12648532;BA.debugLine="Wait For (Req) req_oper_Result(resOper As DBResu";
parent.__c.WaitFor("req_oper_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 78;
return;
case 78:
//C
this.state = 44;
_resoper = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12648533;
 //BA.debugLineNum = 12648533;BA.debugLine="For Each rowOper() As Object In resOper.Rows";
if (true) break;

case 44:
//for
this.state = 47;
group70 = _resoper.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index70 = 0;
groupLen70 = group70.getSize();
this.state = 79;
if (true) break;

case 79:
//C
this.state = 47;
if (index70 < groupLen70) {
this.state = 46;
_rowoper = (Object[])(group70.Get(index70));}
if (true) break;

case 80:
//C
this.state = 79;
index70++;
if (true) break;

case 46:
//C
this.state = 80;
RDebugUtils.currentLine=12648534;
 //BA.debugLineNum = 12648534;BA.debugLine="Dim codigoOper As String = rowOper(0)";
_codigooper = BA.ObjectToString(_rowoper[(int) (0)]);
RDebugUtils.currentLine=12648535;
 //BA.debugLineNum = 12648535;BA.debugLine="Dim apellido1 As String = rowOper(1)";
_apellido1 = BA.ObjectToString(_rowoper[(int) (1)]);
RDebugUtils.currentLine=12648536;
 //BA.debugLineNum = 12648536;BA.debugLine="Dim apellido2 As String = rowOper(2)";
_apellido2 = BA.ObjectToString(_rowoper[(int) (2)]);
RDebugUtils.currentLine=12648537;
 //BA.debugLineNum = 12648537;BA.debugLine="Dim nombre As String = rowOper(3)";
_nombre = BA.ObjectToString(_rowoper[(int) (3)]);
RDebugUtils.currentLine=12648538;
 //BA.debugLineNum = 12648538;BA.debugLine="SD_xComboBoxOperario.Add(apellido1&\" \"&apellido";
__ref._sd_xcomboboxoperario /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_apellido1+" "+_apellido2+" "+_nombre,(Object)(_codigooper));
 if (true) break;
if (true) break;

case 47:
//C
this.state = 50;
;
 if (true) break;

case 49:
//C
this.state = 50;
RDebugUtils.currentLine=12648541;
 //BA.debugLineNum = 12648541;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j5.Err";
parent.__c.LogImpl("212648541","Error en la consulta de Maquina: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=12648543;
 //BA.debugLineNum = 12648543;BA.debugLine="j5.Release";
_j5._release /*String*/ (null);
RDebugUtils.currentLine=12648547;
 //BA.debugLineNum = 12648547;BA.debugLine="Dim cmdObser As DBCommand = CreateCommand(\"select";
_cmdobser = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_observaciones",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12648548;
 //BA.debugLineNum = 12648548;BA.debugLine="Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdobser,(int) (0),parent.__c.Null)));
this.state = 81;
return;
case 81:
//C
this.state = 51;
_j6 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12648549;
 //BA.debugLineNum = 12648549;BA.debugLine="If j6.Success Then";
if (true) break;

case 51:
//if
this.state = 60;
if (_j6._success /*boolean*/ ) { 
this.state = 53;
}else {
this.state = 59;
}if (true) break;

case 53:
//C
this.state = 54;
RDebugUtils.currentLine=12648550;
 //BA.debugLineNum = 12648550;BA.debugLine="Req.HandleJobAsync(j6, \"req_obser\")";
_req._handlejobasync /*void*/ (null,_j6,"req_obser");
RDebugUtils.currentLine=12648551;
 //BA.debugLineNum = 12648551;BA.debugLine="Wait For (Req) req_obser_Result(resObser As DBRe";
parent.__c.WaitFor("req_obser_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 82;
return;
case 82:
//C
this.state = 54;
_resobser = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12648552;
 //BA.debugLineNum = 12648552;BA.debugLine="For Each rowObser() As Object In resObser.Rows";
if (true) break;

case 54:
//for
this.state = 57;
group86 = _resobser.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index86 = 0;
groupLen86 = group86.getSize();
this.state = 83;
if (true) break;

case 83:
//C
this.state = 57;
if (index86 < groupLen86) {
this.state = 56;
_rowobser = (Object[])(group86.Get(index86));}
if (true) break;

case 84:
//C
this.state = 83;
index86++;
if (true) break;

case 56:
//C
this.state = 84;
RDebugUtils.currentLine=12648553;
 //BA.debugLineNum = 12648553;BA.debugLine="Dim codigoObser As String = rowObser(0)";
_codigoobser = BA.ObjectToString(_rowobser[(int) (0)]);
RDebugUtils.currentLine=12648554;
 //BA.debugLineNum = 12648554;BA.debugLine="Dim desObser As String = rowObser(1)";
_desobser = BA.ObjectToString(_rowobser[(int) (1)]);
RDebugUtils.currentLine=12648555;
 //BA.debugLineNum = 12648555;BA.debugLine="SD_xComboBoxObservaciones.Add(desObser ,codigoO";
__ref._sd_xcomboboxobservaciones /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_desobser,(Object)(_codigoobser));
 if (true) break;
if (true) break;

case 57:
//C
this.state = 60;
;
 if (true) break;

case 59:
//C
this.state = 60;
RDebugUtils.currentLine=12648558;
 //BA.debugLineNum = 12648558;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j6.Err";
parent.__c.LogImpl("212648558","Error en la consulta de Maquina: "+_j6._errormessage /*String*/ ,0);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=12648560;
 //BA.debugLineNum = 12648560;BA.debugLine="j6.Release";
_j6._release /*String*/ (null);
RDebugUtils.currentLine=12648566;
 //BA.debugLineNum = 12648566;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="panel.LoadLayout(\"addMaquinariaUI\")";
_panel.LoadLayout("addMaquinariaUI",ba);
RDebugUtils.currentLine=12845064;
 //BA.debugLineNum = 12845064;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=12845066;
 //BA.debugLineNum = 12845066;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formmaquinaria __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formmaquinaria __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="Ascdo_Maq_Mvto_Maq = \"CP\"";
__ref._ascdo_maq_mvto_maq /*String*/  = "CP";
RDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="horainicio = EditText1HoraInicio.Text";
__ref._horainicio /*String*/  = __ref._edittext1horainicio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="horafin = EditText2HoraFim.Text";
__ref._horafin /*String*/  = __ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="combustible = EditText1.Text";
__ref._combustible /*String*/  = __ref._edittext1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="area = EditText2.Text";
__ref._area /*String*/  = __ref._edittext2 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=13565960;
 //BA.debugLineNum = 13565960;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="fechaHoy = DateTime.Date(DateTime.Now) ' Esto te";
__ref._fechahoy /*String*/  = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=13565963;
 //BA.debugLineNum = 13565963;BA.debugLine="fechaHoy = fechaHoy.Replace(\"/\", \"-\") ' Reemplaza";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ .replace("/","-");
RDebugUtils.currentLine=13565964;
 //BA.debugLineNum = 13565964;BA.debugLine="fechaHoy = fechaHoy & \" 00:00:00\" ' Agregar la";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ +" 00:00:00";
RDebugUtils.currentLine=13565966;
 //BA.debugLineNum = 13565966;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
__ref._horaactual /*String*/  = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=13565967;
 //BA.debugLineNum = 13565967;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=13565969;
 //BA.debugLineNum = 13565969;BA.debugLine="Log(\"Ascdo_Maq_Mvto_Maq: \" & Ascdo_Maq_Mvto_Maq)";
parent.__c.LogImpl("213565969","Ascdo_Maq_Mvto_Maq: "+__ref._ascdo_maq_mvto_maq /*String*/ ,0);
RDebugUtils.currentLine=13565970;
 //BA.debugLineNum = 13565970;BA.debugLine="Log(\"maquina: \" & maquina)";
parent.__c.LogImpl("213565970","maquina: "+__ref._maquina /*String*/ ,0);
RDebugUtils.currentLine=13565971;
 //BA.debugLineNum = 13565971;BA.debugLine="Log(\"fecha: \" & fecha)";
parent.__c.LogImpl("213565971","fecha: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=13565972;
 //BA.debugLineNum = 13565972;BA.debugLine="Log(\"labor: \" & labor)";
parent.__c.LogImpl("213565972","labor: "+__ref._labor /*String*/ ,0);
RDebugUtils.currentLine=13565973;
 //BA.debugLineNum = 13565973;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("213565973","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=13565974;
 //BA.debugLineNum = 13565974;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("213565974","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=13565975;
 //BA.debugLineNum = 13565975;BA.debugLine="Log(\"Lote: \" & Lote)";
parent.__c.LogImpl("213565975","Lote: "+__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=13565976;
 //BA.debugLineNum = 13565976;BA.debugLine="Log(\"implemento: \" & implemento)";
parent.__c.LogImpl("213565976","implemento: "+__ref._implemento /*String*/ ,0);
RDebugUtils.currentLine=13565977;
 //BA.debugLineNum = 13565977;BA.debugLine="Log(\"horainicio: \" & horainicio)";
parent.__c.LogImpl("213565977","horainicio: "+__ref._horainicio /*String*/ ,0);
RDebugUtils.currentLine=13565978;
 //BA.debugLineNum = 13565978;BA.debugLine="Log(\"horafin: \" & horafin)";
parent.__c.LogImpl("213565978","horafin: "+__ref._horafin /*String*/ ,0);
RDebugUtils.currentLine=13565979;
 //BA.debugLineNum = 13565979;BA.debugLine="Log(\"combustible: \" & combustible)";
parent.__c.LogImpl("213565979","combustible: "+__ref._combustible /*String*/ ,0);
RDebugUtils.currentLine=13565980;
 //BA.debugLineNum = 13565980;BA.debugLine="Log(\"observaciones: \" & observaciones)";
parent.__c.LogImpl("213565980","observaciones: "+__ref._observaciones /*String*/ ,0);
RDebugUtils.currentLine=13565981;
 //BA.debugLineNum = 13565981;BA.debugLine="Log(\"operario: \" & operario)";
parent.__c.LogImpl("213565981","operario: "+__ref._operario /*String*/ ,0);
RDebugUtils.currentLine=13565982;
 //BA.debugLineNum = 13565982;BA.debugLine="Log(\"implemento2: \" & implemento2)";
parent.__c.LogImpl("213565982","implemento2: "+__ref._implemento2 /*String*/ ,0);
RDebugUtils.currentLine=13565983;
 //BA.debugLineNum = 13565983;BA.debugLine="Log(\"area: \" & area)";
parent.__c.LogImpl("213565983","area: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=13565984;
 //BA.debugLineNum = 13565984;BA.debugLine="Log(\"fechaHoy: \" & fechaHoy)";
parent.__c.LogImpl("213565984","fechaHoy: "+__ref._fechahoy /*String*/ ,0);
RDebugUtils.currentLine=13565985;
 //BA.debugLineNum = 13565985;BA.debugLine="Log(\"horaActual: \" & horaActual)";
parent.__c.LogImpl("213565985","horaActual: "+__ref._horaactual /*String*/ ,0);
RDebugUtils.currentLine=13565986;
 //BA.debugLineNum = 13565986;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("213565986","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=13565987;
 //BA.debugLineNum = 13565987;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("213565987","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=13565990;
 //BA.debugLineNum = 13565990;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=13565991;
 //BA.debugLineNum = 13565991;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=13565994;
 //BA.debugLineNum = 13565994;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mvto";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Maq",new Object[]{(Object)(__ref._ascdo_maq_mvto_maq /*String*/ ),(Object)(__ref._maquina /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._labor /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lote /*String*/ ),(Object)(__ref._implemento /*String*/ ),(Object)(__ref._horainicio /*String*/ ),(Object)(__ref._horafin /*String*/ ),(Object)(__ref._combustible /*String*/ ),(Object)(__ref._observaciones /*String*/ ),(Object)(__ref._operario /*String*/ ),(Object)(__ref._implemento2 /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._fechahoy /*String*/ ),(Object)(__ref._horaactual /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=13565997;
 //BA.debugLineNum = 13565997;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=13565998;
 //BA.debugLineNum = 13565998;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "button1_click"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13566001;
 //BA.debugLineNum = 13566001;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
RDebugUtils.currentLine=13566002;
 //BA.debugLineNum = 13566002;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=13566003;
 //BA.debugLineNum = 13566003;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=13566005;
 //BA.debugLineNum = 13566005;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("213566005","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 9:
//C
this.state = 12;
;
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
RDebugUtils.currentLine=13566008;
 //BA.debugLineNum = 13566008;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("213566008","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=13566010;
 //BA.debugLineNum = 13566010;BA.debugLine="End Sub";
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
public String  _getdevicename(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "getdevicename", false))
	 {return ((String) Debug.delegate(ba, "getdevicename", null));}
anywheresoftware.b4a.phone.Phone _p = null;
String _manufacturer = "";
String _model = "";
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="Private Label1Back As Label";
_label1back = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Private Label2Save As Label";
_label2save = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="Private SD_xComboBoxMaquina As SD_xComboBox";
_sd_xcomboboxmaquina = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386315;
 //BA.debugLineNum = 12386315;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386316;
 //BA.debugLineNum = 12386316;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386317;
 //BA.debugLineNum = 12386317;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386318;
 //BA.debugLineNum = 12386318;BA.debugLine="Private SD_xComboBoxImplemento As SD_xComboBox";
_sd_xcomboboximplemento = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386319;
 //BA.debugLineNum = 12386319;BA.debugLine="Private SD_xComboBoxImplemento2 As SD_xComboBox";
_sd_xcomboboximplemento2 = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386320;
 //BA.debugLineNum = 12386320;BA.debugLine="Private SD_xComboBoxOperario As SD_xComboBox";
_sd_xcomboboxoperario = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386321;
 //BA.debugLineNum = 12386321;BA.debugLine="Private SD_xComboBoxObservaciones As SD_xComboBox";
_sd_xcomboboxobservaciones = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=12386324;
 //BA.debugLineNum = 12386324;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=12386326;
 //BA.debugLineNum = 12386326;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=12386329;
 //BA.debugLineNum = 12386329;BA.debugLine="Private Panel2Time As Panel";
_panel2time = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12386330;
 //BA.debugLineNum = 12386330;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12386332;
 //BA.debugLineNum = 12386332;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12386335;
 //BA.debugLineNum = 12386335;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=12386336;
 //BA.debugLineNum = 12386336;BA.debugLine="Dim maquina As String";
_maquina = "";
RDebugUtils.currentLine=12386337;
 //BA.debugLineNum = 12386337;BA.debugLine="Dim labor As String";
_labor = "";
RDebugUtils.currentLine=12386338;
 //BA.debugLineNum = 12386338;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=12386339;
 //BA.debugLineNum = 12386339;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=12386340;
 //BA.debugLineNum = 12386340;BA.debugLine="Dim Lote As String";
_lote = "";
RDebugUtils.currentLine=12386341;
 //BA.debugLineNum = 12386341;BA.debugLine="Dim implemento As String";
_implemento = "";
RDebugUtils.currentLine=12386342;
 //BA.debugLineNum = 12386342;BA.debugLine="Dim implemento2 As String";
_implemento2 = "";
RDebugUtils.currentLine=12386343;
 //BA.debugLineNum = 12386343;BA.debugLine="Dim operario As String";
_operario = "";
RDebugUtils.currentLine=12386344;
 //BA.debugLineNum = 12386344;BA.debugLine="Dim observaciones As String";
_observaciones = "";
RDebugUtils.currentLine=12386345;
 //BA.debugLineNum = 12386345;BA.debugLine="Dim horafin As String";
_horafin = "";
RDebugUtils.currentLine=12386346;
 //BA.debugLineNum = 12386346;BA.debugLine="Dim horainicio As String";
_horainicio = "";
RDebugUtils.currentLine=12386347;
 //BA.debugLineNum = 12386347;BA.debugLine="Dim combustible As String";
_combustible = "";
RDebugUtils.currentLine=12386348;
 //BA.debugLineNum = 12386348;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=12386349;
 //BA.debugLineNum = 12386349;BA.debugLine="Dim horaActual As String";
_horaactual = "";
RDebugUtils.currentLine=12386350;
 //BA.debugLineNum = 12386350;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=12386351;
 //BA.debugLineNum = 12386351;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=12386352;
 //BA.debugLineNum = 12386352;BA.debugLine="Dim Ascdo_Maq_Mvto_Maq As String";
_ascdo_maq_mvto_maq = "";
RDebugUtils.currentLine=12386353;
 //BA.debugLineNum = 12386353;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=12386354;
 //BA.debugLineNum = 12386354;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=12386355;
 //BA.debugLineNum = 12386355;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=12386356;
 //BA.debugLineNum = 12386356;BA.debugLine="Private EditText2 As EditText";
_edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=12386357;
 //BA.debugLineNum = 12386357;BA.debugLine="Dim fechaHoy As String";
_fechahoy = "";
RDebugUtils.currentLine=12386358;
 //BA.debugLineNum = 12386358;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhacienda_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxhacienda_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12779532;
 //BA.debugLineNum = 12779532;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12779534;
 //BA.debugLineNum = 12779534;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12779535;
 //BA.debugLineNum = 12779535;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12779539;
 //BA.debugLineNum = 12779539;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=12779540;
 //BA.debugLineNum = 12779540;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12779543;
 //BA.debugLineNum = 12779543;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_codg_hacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=12779548;
 //BA.debugLineNum = 12779548;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("212779548","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12779552;
 //BA.debugLineNum = 12779552;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12779554;
 //BA.debugLineNum = 12779554;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboximplemento_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboximplemento_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboximplemento_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub SD_xComboBoxImplemento_ItemClick (Posi";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="implemento = Value";
__ref._implemento /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboximplemento2_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboximplemento2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboximplemento2_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub SD_xComboBoxImplemento2_ItemClick (Pos";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="implemento2 = Value";
__ref._implemento2 /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13369347;
 //BA.debugLineNum = 13369347;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="labor = Value";
__ref._labor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Lote = Value";
__ref._lote /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="Log(Lote)";
__c.LogImpl("213238274",__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxmaquina_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxmaquina_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxmaquina_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub SD_xComboBoxMaquina_ItemClick (Positio";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="maquina =Value";
__ref._maquina /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnit_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxnit_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxnit_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formmaquinaria parent,b4a.example.ef.formmaquinaria __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formmaquinaria __ref;
b4a.example.ef.formmaquinaria parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
String _nombrehacienda = "";
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formmaquinaria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12713995;
 //BA.debugLineNum = 12713995;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=12713998;
 //BA.debugLineNum = 12713998;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12714002;
 //BA.debugLineNum = 12714002;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 14:
//C
this.state = 13;
index10++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=12714003;
 //BA.debugLineNum = 12714003;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=12714004;
 //BA.debugLineNum = 12714004;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=12714007;
 //BA.debugLineNum = 12714007;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=12714012;
 //BA.debugLineNum = 12714012;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("212714012","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=12714015;
 //BA.debugLineNum = 12714015;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=12714017;
 //BA.debugLineNum = 12714017;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxobservaciones_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxobservaciones_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxobservaciones_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Private Sub SD_xComboBoxObservaciones_ItemClick (P";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="observaciones = Value";
__ref._observaciones /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13500420;
 //BA.debugLineNum = 13500420;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxoperario_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxoperario_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxoperario_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub SD_xComboBoxOperario_ItemClick (Positi";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="operario =Value";
__ref._operario /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="End Sub";
return "";
}
}