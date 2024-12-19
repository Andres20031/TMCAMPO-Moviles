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
public Object  _initialize(b4a.example.ef.formmaquinaria __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formmaquinaria __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9764881;
 //BA.debugLineNum = 9764881;BA.debugLine="fecha = formattedDate";
__ref._fecha /*String*/  = _formatteddate;
RDebugUtils.currentLine=9764885;
 //BA.debugLineNum = 9764885;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=9437192;
 //BA.debugLineNum = 9437192;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9437196;
 //BA.debugLineNum = 9437196;BA.debugLine="Dim cmdMaquina As DBCommand = CreateCommand(\"sele";
_cmdmaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maquina",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdmaquina,(int) (0),parent.__c.Null)));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9437198;
 //BA.debugLineNum = 9437198;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=9437199;
 //BA.debugLineNum = 9437199;BA.debugLine="Req.HandleJobAsync(j2, \"req_maquina\")";
_req._handlejobasync /*void*/ (null,_j2,"req_maquina");
RDebugUtils.currentLine=9437200;
 //BA.debugLineNum = 9437200;BA.debugLine="Wait For (Req) req_maquina_Result(resMaquina As";
parent.__c.WaitFor("req_maquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 62;
return;
case 62:
//C
this.state = 4;
_resmaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9437201;
 //BA.debugLineNum = 9437201;BA.debugLine="For Each rowMaquina() As Object In resMaquina.Ro";
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
RDebugUtils.currentLine=9437202;
 //BA.debugLineNum = 9437202;BA.debugLine="Dim codigoMaquina As String = rowMaquina(0) ' C";
_codigomaquina = BA.ObjectToString(_rowmaquina[(int) (0)]);
RDebugUtils.currentLine=9437203;
 //BA.debugLineNum = 9437203;BA.debugLine="Dim descripcionMaquina As String = rowMaquina(1";
_descripcionmaquina = BA.ObjectToString(_rowmaquina[(int) (1)]);
RDebugUtils.currentLine=9437204;
 //BA.debugLineNum = 9437204;BA.debugLine="SD_xComboBoxMaquina.Add(descripcionMaquina & \"";
__ref._sd_xcomboboxmaquina /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionmaquina+" - "+_codigomaquina,(Object)(_codigomaquina));
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
RDebugUtils.currentLine=9437207;
 //BA.debugLineNum = 9437207;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("39437207","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=9437209;
 //BA.debugLineNum = 9437209;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=9437213;
 //BA.debugLineNum = 9437213;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9437214;
 //BA.debugLineNum = 9437214;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 65;
return;
case 65:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9437215;
 //BA.debugLineNum = 9437215;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=9437216;
 //BA.debugLineNum = 9437216;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=9437217;
 //BA.debugLineNum = 9437217;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 66;
return;
case 66:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9437218;
 //BA.debugLineNum = 9437218;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
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
RDebugUtils.currentLine=9437219;
 //BA.debugLineNum = 9437219;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=9437220;
 //BA.debugLineNum = 9437220;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=9437221;
 //BA.debugLineNum = 9437221;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina &";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionlabormaquina+" - "+_codigolabormaquina,(Object)(_codigolabormaquina));
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
RDebugUtils.currentLine=9437224;
 //BA.debugLineNum = 9437224;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("39437224","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=9437226;
 //BA.debugLineNum = 9437226;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=9437230;
 //BA.debugLineNum = 9437230;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9437231;
 //BA.debugLineNum = 9437231;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 69;
return;
case 69:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9437232;
 //BA.debugLineNum = 9437232;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9437233;
 //BA.debugLineNum = 9437233;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=9437234;
 //BA.debugLineNum = 9437234;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 70;
return;
case 70:
//C
this.state = 24;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9437235;
 //BA.debugLineNum = 9437235;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=9437236;
 //BA.debugLineNum = 9437236;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=9437237;
 //BA.debugLineNum = 9437237;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=9437238;
 //BA.debugLineNum = 9437238;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
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
RDebugUtils.currentLine=9437241;
 //BA.debugLineNum = 9437241;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("39437241","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=9437246;
 //BA.debugLineNum = 9437246;BA.debugLine="Dim cmdImple As DBCommand = CreateCommand(\"select";
_cmdimple = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_implemento",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9437247;
 //BA.debugLineNum = 9437247;BA.debugLine="Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdimple,(int) (0),parent.__c.Null)));
this.state = 73;
return;
case 73:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9437248;
 //BA.debugLineNum = 9437248;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=9437249;
 //BA.debugLineNum = 9437249;BA.debugLine="Req.HandleJobAsync(j4, \"req_imple\")";
_req._handlejobasync /*void*/ (null,_j4,"req_imple");
RDebugUtils.currentLine=9437250;
 //BA.debugLineNum = 9437250;BA.debugLine="Wait For (Req) req_imple_Result(resImple As DBRe";
parent.__c.WaitFor("req_imple_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 74;
return;
case 74:
//C
this.state = 34;
_resimple = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9437251;
 //BA.debugLineNum = 9437251;BA.debugLine="For Each rowImple() As Object In resImple.Rows";
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
RDebugUtils.currentLine=9437252;
 //BA.debugLineNum = 9437252;BA.debugLine="Dim codigoImple As String = rowImple(0) ' Cdgo_";
_codigoimple = BA.ObjectToString(_rowimple[(int) (0)]);
RDebugUtils.currentLine=9437253;
 //BA.debugLineNum = 9437253;BA.debugLine="Dim descripcionImple As String = rowImple(1) '";
_descripcionimple = BA.ObjectToString(_rowimple[(int) (1)]);
RDebugUtils.currentLine=9437254;
 //BA.debugLineNum = 9437254;BA.debugLine="SD_xComboBoxImplemento.Add(descripcionImple & \"";
__ref._sd_xcomboboximplemento /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple+" - "+_codigoimple,(Object)(_codigoimple));
RDebugUtils.currentLine=9437255;
 //BA.debugLineNum = 9437255;BA.debugLine="SD_xComboBoxImplemento2.Add(descripcionImple &";
__ref._sd_xcomboboximplemento2 /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionimple+" - "+_codigoimple,(Object)(_codigoimple));
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
RDebugUtils.currentLine=9437258;
 //BA.debugLineNum = 9437258;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("39437258","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=9437260;
 //BA.debugLineNum = 9437260;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=9437264;
 //BA.debugLineNum = 9437264;BA.debugLine="Dim cmdOper As DBCommand = CreateCommand(\"select_";
_cmdoper = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_operario",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9437265;
 //BA.debugLineNum = 9437265;BA.debugLine="Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) Job";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdoper,(int) (0),parent.__c.Null)));
this.state = 77;
return;
case 77:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9437266;
 //BA.debugLineNum = 9437266;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=9437267;
 //BA.debugLineNum = 9437267;BA.debugLine="Req.HandleJobAsync(j5, \"req_oper\")";
_req._handlejobasync /*void*/ (null,_j5,"req_oper");
RDebugUtils.currentLine=9437268;
 //BA.debugLineNum = 9437268;BA.debugLine="Wait For (Req) req_oper_Result(resOper As DBResu";
parent.__c.WaitFor("req_oper_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 78;
return;
case 78:
//C
this.state = 44;
_resoper = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9437269;
 //BA.debugLineNum = 9437269;BA.debugLine="For Each rowOper() As Object In resOper.Rows";
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
RDebugUtils.currentLine=9437270;
 //BA.debugLineNum = 9437270;BA.debugLine="Dim codigoOper As String = rowOper(0)";
_codigooper = BA.ObjectToString(_rowoper[(int) (0)]);
RDebugUtils.currentLine=9437271;
 //BA.debugLineNum = 9437271;BA.debugLine="Dim apellido1 As String = rowOper(1)";
_apellido1 = BA.ObjectToString(_rowoper[(int) (1)]);
RDebugUtils.currentLine=9437272;
 //BA.debugLineNum = 9437272;BA.debugLine="Dim apellido2 As String = rowOper(2)";
_apellido2 = BA.ObjectToString(_rowoper[(int) (2)]);
RDebugUtils.currentLine=9437273;
 //BA.debugLineNum = 9437273;BA.debugLine="Dim nombre As String = rowOper(3)";
_nombre = BA.ObjectToString(_rowoper[(int) (3)]);
RDebugUtils.currentLine=9437274;
 //BA.debugLineNum = 9437274;BA.debugLine="SD_xComboBoxOperario.Add(apellido1&\" \"&apellido";
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
RDebugUtils.currentLine=9437277;
 //BA.debugLineNum = 9437277;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j5.Err";
parent.__c.LogImpl("39437277","Error en la consulta de Maquina: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = 51;
;
RDebugUtils.currentLine=9437279;
 //BA.debugLineNum = 9437279;BA.debugLine="j5.Release";
_j5._release /*String*/ (null);
RDebugUtils.currentLine=9437283;
 //BA.debugLineNum = 9437283;BA.debugLine="Dim cmdObser As DBCommand = CreateCommand(\"select";
_cmdobser = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_observaciones",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9437284;
 //BA.debugLineNum = 9437284;BA.debugLine="Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdobser,(int) (0),parent.__c.Null)));
this.state = 81;
return;
case 81:
//C
this.state = 51;
_j6 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9437285;
 //BA.debugLineNum = 9437285;BA.debugLine="If j6.Success Then";
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
RDebugUtils.currentLine=9437286;
 //BA.debugLineNum = 9437286;BA.debugLine="Req.HandleJobAsync(j6, \"req_obser\")";
_req._handlejobasync /*void*/ (null,_j6,"req_obser");
RDebugUtils.currentLine=9437287;
 //BA.debugLineNum = 9437287;BA.debugLine="Wait For (Req) req_obser_Result(resObser As DBRe";
parent.__c.WaitFor("req_obser_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "b4xpage_appear"), (Object)(_req));
this.state = 82;
return;
case 82:
//C
this.state = 54;
_resobser = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9437288;
 //BA.debugLineNum = 9437288;BA.debugLine="For Each rowObser() As Object In resObser.Rows";
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
RDebugUtils.currentLine=9437289;
 //BA.debugLineNum = 9437289;BA.debugLine="Dim codigoObser As String = rowObser(0)";
_codigoobser = BA.ObjectToString(_rowobser[(int) (0)]);
RDebugUtils.currentLine=9437290;
 //BA.debugLineNum = 9437290;BA.debugLine="Dim desObser As String = rowObser(1)";
_desobser = BA.ObjectToString(_rowobser[(int) (1)]);
RDebugUtils.currentLine=9437291;
 //BA.debugLineNum = 9437291;BA.debugLine="SD_xComboBoxObservaciones.Add(desObser&\"-\"&codi";
__ref._sd_xcomboboxobservaciones /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_desobser+"-"+_codigoobser,(Object)(_codigoobser));
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
RDebugUtils.currentLine=9437294;
 //BA.debugLineNum = 9437294;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j6.Err";
parent.__c.LogImpl("39437294","Error en la consulta de Maquina: "+_j6._errormessage /*String*/ ,0);
 if (true) break;

case 60:
//C
this.state = -1;
;
RDebugUtils.currentLine=9437296;
 //BA.debugLineNum = 9437296;BA.debugLine="j6.Release";
_j6._release /*String*/ (null);
RDebugUtils.currentLine=9437302;
 //BA.debugLineNum = 9437302;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="panel.LoadLayout(\"addMaquinariaUI\")";
_panel.LoadLayout("addMaquinariaUI",ba);
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formmaquinaria __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formmaquinaria __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Ascdo_Maq_Mvto_Maq = \"CP\"";
__ref._ascdo_maq_mvto_maq /*String*/  = "CP";
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="horainicio = EditText1HoraInicio.Text";
__ref._horainicio /*String*/  = __ref._edittext1horainicio /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="horafin = EditText2HoraFim.Text";
__ref._horafin /*String*/  = __ref._edittext2horafim /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="combustible = EditText1.Text";
__ref._combustible /*String*/  = __ref._edittext1 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="area = EditText2.Text";
__ref._area /*String*/  = __ref._edittext2 /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText();
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="fechaHoy = DateTime.Date(DateTime.Now) ' Esto te";
__ref._fechahoy /*String*/  = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="fechaHoy = fechaHoy.Replace(\"/\", \"-\") ' Reemplaza";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ .replace("/","-");
RDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="fechaHoy = fechaHoy & \" 00:00:00\" ' Agregar la";
__ref._fechahoy /*String*/  = __ref._fechahoy /*String*/ +" 00:00:00";
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
__ref._horaactual /*String*/  = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=10354705;
 //BA.debugLineNum = 10354705;BA.debugLine="Log(\"Ascdo_Maq_Mvto_Maq: \" & Ascdo_Maq_Mvto_Maq)";
parent.__c.LogImpl("310354705","Ascdo_Maq_Mvto_Maq: "+__ref._ascdo_maq_mvto_maq /*String*/ ,0);
RDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="Log(\"maquina: \" & maquina)";
parent.__c.LogImpl("310354706","maquina: "+__ref._maquina /*String*/ ,0);
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="Log(\"fecha: \" & fecha)";
parent.__c.LogImpl("310354707","fecha: "+__ref._fecha /*String*/ ,0);
RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="Log(\"labor: \" & labor)";
parent.__c.LogImpl("310354708","labor: "+__ref._labor /*String*/ ,0);
RDebugUtils.currentLine=10354709;
 //BA.debugLineNum = 10354709;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("310354709","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=10354710;
 //BA.debugLineNum = 10354710;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("310354710","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=10354711;
 //BA.debugLineNum = 10354711;BA.debugLine="Log(\"Lote: \" & Lote)";
parent.__c.LogImpl("310354711","Lote: "+__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=10354712;
 //BA.debugLineNum = 10354712;BA.debugLine="Log(\"implemento: \" & implemento)";
parent.__c.LogImpl("310354712","implemento: "+__ref._implemento /*String*/ ,0);
RDebugUtils.currentLine=10354713;
 //BA.debugLineNum = 10354713;BA.debugLine="Log(\"horainicio: \" & horainicio)";
parent.__c.LogImpl("310354713","horainicio: "+__ref._horainicio /*String*/ ,0);
RDebugUtils.currentLine=10354714;
 //BA.debugLineNum = 10354714;BA.debugLine="Log(\"horafin: \" & horafin)";
parent.__c.LogImpl("310354714","horafin: "+__ref._horafin /*String*/ ,0);
RDebugUtils.currentLine=10354715;
 //BA.debugLineNum = 10354715;BA.debugLine="Log(\"combustible: \" & combustible)";
parent.__c.LogImpl("310354715","combustible: "+__ref._combustible /*String*/ ,0);
RDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="Log(\"observaciones: \" & observaciones)";
parent.__c.LogImpl("310354716","observaciones: "+__ref._observaciones /*String*/ ,0);
RDebugUtils.currentLine=10354717;
 //BA.debugLineNum = 10354717;BA.debugLine="Log(\"operario: \" & operario)";
parent.__c.LogImpl("310354717","operario: "+__ref._operario /*String*/ ,0);
RDebugUtils.currentLine=10354718;
 //BA.debugLineNum = 10354718;BA.debugLine="Log(\"implemento2: \" & implemento2)";
parent.__c.LogImpl("310354718","implemento2: "+__ref._implemento2 /*String*/ ,0);
RDebugUtils.currentLine=10354719;
 //BA.debugLineNum = 10354719;BA.debugLine="Log(\"area: \" & area)";
parent.__c.LogImpl("310354719","area: "+__ref._area /*String*/ ,0);
RDebugUtils.currentLine=10354720;
 //BA.debugLineNum = 10354720;BA.debugLine="Log(\"fechaHoy: \" & fechaHoy)";
parent.__c.LogImpl("310354720","fechaHoy: "+__ref._fechahoy /*String*/ ,0);
RDebugUtils.currentLine=10354721;
 //BA.debugLineNum = 10354721;BA.debugLine="Log(\"horaActual: \" & horaActual)";
parent.__c.LogImpl("310354721","horaActual: "+__ref._horaactual /*String*/ ,0);
RDebugUtils.currentLine=10354722;
 //BA.debugLineNum = 10354722;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("310354722","user: "+__ref._user /*String*/ ,0);
RDebugUtils.currentLine=10354723;
 //BA.debugLineNum = 10354723;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("310354723","DeviceName: "+__ref._devicename /*String*/ ,0);
RDebugUtils.currentLine=10354726;
 //BA.debugLineNum = 10354726;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=10354727;
 //BA.debugLineNum = 10354727;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=10354730;
 //BA.debugLineNum = 10354730;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mvto";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Maq",new Object[]{(Object)(__ref._ascdo_maq_mvto_maq /*String*/ ),(Object)(__ref._maquina /*String*/ ),(Object)(__ref._fecha /*String*/ ),(Object)(__ref._labor /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lote /*String*/ ),(Object)(__ref._implemento /*String*/ ),(Object)(__ref._horainicio /*String*/ ),(Object)(__ref._horafin /*String*/ ),(Object)(__ref._combustible /*String*/ ),(Object)(__ref._observaciones /*String*/ ),(Object)(__ref._operario /*String*/ ),(Object)(__ref._implemento2 /*String*/ ),(Object)(__ref._area /*String*/ ),(Object)(__ref._fechahoy /*String*/ ),(Object)(__ref._horaactual /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=10354733;
 //BA.debugLineNum = 10354733;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=10354734;
 //BA.debugLineNum = 10354734;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "button1_click"), (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10354737;
 //BA.debugLineNum = 10354737;BA.debugLine="Try";
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
RDebugUtils.currentLine=10354738;
 //BA.debugLineNum = 10354738;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10354739;
 //BA.debugLineNum = 10354739;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=10354741;
 //BA.debugLineNum = 10354741;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("310354741","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=10354744;
 //BA.debugLineNum = 10354744;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("310354744","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=10354746;
 //BA.debugLineNum = 10354746;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="Private Label1Back As Label";
_label1back = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="Private Label2Save As Label";
_label2save = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="Private SD_xComboBoxMaquina As SD_xComboBox";
_sd_xcomboboxmaquina = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175054;
 //BA.debugLineNum = 9175054;BA.debugLine="Private SD_xComboBoxImplemento As SD_xComboBox";
_sd_xcomboboximplemento = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="Private SD_xComboBoxImplemento2 As SD_xComboBox";
_sd_xcomboboximplemento2 = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175056;
 //BA.debugLineNum = 9175056;BA.debugLine="Private SD_xComboBoxOperario As SD_xComboBox";
_sd_xcomboboxoperario = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="Private SD_xComboBoxObservaciones As SD_xComboBox";
_sd_xcomboboxobservaciones = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=9175062;
 //BA.debugLineNum = 9175062;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=9175065;
 //BA.debugLineNum = 9175065;BA.debugLine="Private Panel2Time As Panel";
_panel2time = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9175066;
 //BA.debugLineNum = 9175066;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9175068;
 //BA.debugLineNum = 9175068;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9175071;
 //BA.debugLineNum = 9175071;BA.debugLine="Dim fecha As String";
_fecha = "";
RDebugUtils.currentLine=9175072;
 //BA.debugLineNum = 9175072;BA.debugLine="Dim maquina As String";
_maquina = "";
RDebugUtils.currentLine=9175073;
 //BA.debugLineNum = 9175073;BA.debugLine="Dim labor As String";
_labor = "";
RDebugUtils.currentLine=9175074;
 //BA.debugLineNum = 9175074;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=9175075;
 //BA.debugLineNum = 9175075;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=9175076;
 //BA.debugLineNum = 9175076;BA.debugLine="Dim Lote As String";
_lote = "";
RDebugUtils.currentLine=9175077;
 //BA.debugLineNum = 9175077;BA.debugLine="Dim implemento As String";
_implemento = "";
RDebugUtils.currentLine=9175078;
 //BA.debugLineNum = 9175078;BA.debugLine="Dim implemento2 As String";
_implemento2 = "";
RDebugUtils.currentLine=9175079;
 //BA.debugLineNum = 9175079;BA.debugLine="Dim operario As String";
_operario = "";
RDebugUtils.currentLine=9175080;
 //BA.debugLineNum = 9175080;BA.debugLine="Dim observaciones As String";
_observaciones = "";
RDebugUtils.currentLine=9175081;
 //BA.debugLineNum = 9175081;BA.debugLine="Dim horafin As String";
_horafin = "";
RDebugUtils.currentLine=9175082;
 //BA.debugLineNum = 9175082;BA.debugLine="Dim horainicio As String";
_horainicio = "";
RDebugUtils.currentLine=9175083;
 //BA.debugLineNum = 9175083;BA.debugLine="Dim combustible As String";
_combustible = "";
RDebugUtils.currentLine=9175084;
 //BA.debugLineNum = 9175084;BA.debugLine="Dim area As String";
_area = "";
RDebugUtils.currentLine=9175085;
 //BA.debugLineNum = 9175085;BA.debugLine="Dim horaActual As String";
_horaactual = "";
RDebugUtils.currentLine=9175086;
 //BA.debugLineNum = 9175086;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=9175087;
 //BA.debugLineNum = 9175087;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=9175088;
 //BA.debugLineNum = 9175088;BA.debugLine="Dim Ascdo_Maq_Mvto_Maq As String";
_ascdo_maq_mvto_maq = "";
RDebugUtils.currentLine=9175089;
 //BA.debugLineNum = 9175089;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=9175090;
 //BA.debugLineNum = 9175090;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=9175091;
 //BA.debugLineNum = 9175091;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=9175092;
 //BA.debugLineNum = 9175092;BA.debugLine="Private EditText2 As EditText";
_edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=9175093;
 //BA.debugLineNum = 9175093;BA.debugLine="Dim fechaHoy As String";
_fechahoy = "";
RDebugUtils.currentLine=9175094;
 //BA.debugLineNum = 9175094;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formmaquinaria __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9568268;
 //BA.debugLineNum = 9568268;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9568270;
 //BA.debugLineNum = 9568270;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=9568271;
 //BA.debugLineNum = 9568271;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9568275;
 //BA.debugLineNum = 9568275;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=9568276;
 //BA.debugLineNum = 9568276;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=9568279;
 //BA.debugLineNum = 9568279;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Codigo: "+_codg_hacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=9568284;
 //BA.debugLineNum = 9568284;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("39568284","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9568288;
 //BA.debugLineNum = 9568288;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=9568290;
 //BA.debugLineNum = 9568290;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Private Sub SD_xComboBoxImplemento_ItemClick (Posi";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="implemento = Value";
__ref._implemento /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboximplemento2_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboximplemento2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboximplemento2_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub SD_xComboBoxImplemento2_ItemClick (Pos";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="implemento2 = Value";
__ref._implemento2 /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="labor = Value";
__ref._labor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Lote = Value";
__ref._lote /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="Log(Lote)";
__c.LogImpl("310027010",__ref._lote /*String*/ ,0);
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxmaquina_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxmaquina_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxmaquina_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub SD_xComboBoxMaquina_ItemClick (Positio";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="maquina =Value";
__ref._maquina /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="End Sub";
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
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

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
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)("N")});
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=9502734;
 //BA.debugLineNum = 9502734;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formmaquinaria", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9502738;
 //BA.debugLineNum = 9502738;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group9 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index9 = 0;
groupLen9 = group9.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index9 < groupLen9) {
this.state = 6;
_row = (Object[])(group9.Get(index9));}
if (true) break;

case 14:
//C
this.state = 13;
index9++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=9502740;
 //BA.debugLineNum = 9502740;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=9502743;
 //BA.debugLineNum = 9502743;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda+" - "+_codg_hacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=9502748;
 //BA.debugLineNum = 9502748;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("39502748","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9502751;
 //BA.debugLineNum = 9502751;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=9502753;
 //BA.debugLineNum = 9502753;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub SD_xComboBoxObservaciones_ItemClick (P";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="observaciones = Value";
__ref._observaciones /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxoperario_itemclick(b4a.example.ef.formmaquinaria __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formmaquinaria";
if (Debug.shouldDelegate(ba, "sd_xcomboboxoperario_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxoperario_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub SD_xComboBoxOperario_ItemClick (Positi";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="operario =Value";
__ref._operario /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="End Sub";
return "";
}
}