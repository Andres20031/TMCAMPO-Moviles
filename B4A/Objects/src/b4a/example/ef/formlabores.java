package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formlabores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formlabores");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formlabores.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.LabelWrapper _label13time = null;
public anywheresoftware.b4a.objects.LabelWrapper _label14time = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public String _rdclink = "";
public String _fechainicio = "";
public String _fechafin = "";
public String _fechafmrto = "";
public String _horasistema = "";
public String _lotecbx = "";
public String _elementolabor = "";
public String _elementogasto = "";
public int _arealabor = 0;
public int _arealote = 0;
public int _consecutivo = 0;
public String _tipolabor = "";
public b4a.example.ef.sd_xcombobox _sd_xcomboboxnit = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxhacienda = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlote = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlabor = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxelemento = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtypeform = null;
public String _haciendacbx = "";
public String _nitempresacbx = "";
public anywheresoftware.b4a.objects.PanelWrapper _panel2geral = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtiporiego = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3geral = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxcodigovariedad = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxtipolabranza = null;
public int _cantidadinsumos = 0;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxinsumo = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittextcantidadinsumo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttonaddinsumo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _buttondeleteinsumo = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel0geral = null;
public String _idinsumo = "";
public String _nameinsumo = "";
public String _cantinsumo = "";
public anywheresoftware.b4a.objects.LabelWrapper _labelcantidadinsumos = null;
public b4a.example.ef.b4xtable _b4xtable1 = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelinsumoselect = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltittleinsumo = null;
public anywheresoftware.b4a.objects.LabelWrapper _labelinsumoselect = null;
public int _ideliminartabla = 0;
public String _tiporiego = "";
public String _procedenciariego = "";
public String _caudalriego = "";
public String _cantidadriego = "";
public String _codigosiembra = "";
public int _distanciasiembra = 0;
public int _bandereosiembra = 0;
public int _toneladasemillasiembra = 0;
public String _procedenciasiembra = "";
public String _tipolabranzasiembra = "";
public int _numeropaquetessiembra = 0;
public int _numeromacollosiembra = 0;
public String _devicename = "";
public String _user = "";
public String _fechaactual = "";
public int _consecutivosiembra = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=7208986;
 //BA.debugLineNum = 7208986;BA.debugLine="fechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=7208989;
 //BA.debugLineNum = 7208989;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
__c.LogImpl("07208989","Fecha inicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=7208991;
 //BA.debugLineNum = 7208991;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Label14Time.Text = formattedDate";
__ref._label14time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="Panel3.Visible = False";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="fechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=7274525;
 //BA.debugLineNum = 7274525;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
__c.LogImpl("07274525","Fecha fin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=7274528;
 //BA.debugLineNum = 7274528;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _razonsocial = "";
String _nit = "";
b4a.example.ef.main._dbcommand _cmdlabormaquina = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reslabormaquina = null;
Object[] _rowlabormaquina = null;
String _codigolabormaquina = "";
String _descripcionlabormaquina = "";
b4a.example.ef.main._dbcommand _cmdelementogasto = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _reselementogasto = null;
Object[] _rowelementogasto = null;
String _codigoelementogasto = "";
String _descripcionelementogasto = "";
b4a.example.ef.main._dbcommand _cmdultimoregistro = null;
b4a.example.ef.httpjob _j5 = null;
b4a.example.ef.main._dbresult _resultimoregistro = null;
Object[] _rowregistro = null;
int _ultimoregistro = 0;
int _ultimoregistrosiembra = 0;
anywheresoftware.b4a.BA.IterableList group14;
int index14;
int groupLen14;
anywheresoftware.b4a.BA.IterableList group27;
int index27;
int groupLen27;
anywheresoftware.b4a.BA.IterableList group41;
int index41;
int groupLen41;
anywheresoftware.b4a.BA.IterableList group59;
int index59;
int groupLen59;
anywheresoftware.b4a.BA.IterableList group73;
int index73;
int groupLen73;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group14 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index14 = 0;
groupLen14 = group14.getSize();
this.state = 53;
if (true) break;

case 53:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_row = (Object[])(group14.Get(index14));}
if (true) break;

case 54:
//C
this.state = 53;
index14++;
if (true) break;

case 6:
//C
this.state = 54;
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
__ref._sd_xcomboboxnit /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
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
RDebugUtils.currentLine=6750231;
 //BA.debugLineNum = 6750231;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("06750231","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=6750237;
 //BA.debugLineNum = 6750237;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=6750238;
 //BA.debugLineNum = 6750238;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=6750239;
 //BA.debugLineNum = 6750239;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=6750240;
 //BA.debugLineNum = 6750240;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=6750241;
 //BA.debugLineNum = 6750241;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
if (true) break;

case 14:
//for
this.state = 17;
group27 = _reslabormaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index27 = 0;
groupLen27 = group27.getSize();
this.state = 57;
if (true) break;

case 57:
//C
this.state = 17;
if (index27 < groupLen27) {
this.state = 16;
_rowlabormaquina = (Object[])(group27.Get(index27));}
if (true) break;

case 58:
//C
this.state = 57;
index27++;
if (true) break;

case 16:
//C
this.state = 58;
RDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=6750243;
 //BA.debugLineNum = 6750243;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=6750244;
 //BA.debugLineNum = 6750244;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
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
RDebugUtils.currentLine=6750247;
 //BA.debugLineNum = 6750247;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("06750247","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=6750249;
 //BA.debugLineNum = 6750249;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=6750253;
 //BA.debugLineNum = 6750253;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
_cmdelementogasto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elementoGasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=6750254;
 //BA.debugLineNum = 6750254;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdelementogasto,(int) (0),parent.__c.Null)));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=6750255;
 //BA.debugLineNum = 6750255;BA.debugLine="If j4.Success Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_j4._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=6750256;
 //BA.debugLineNum = 6750256;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
_req._handlejobasync /*void*/ (null,_j4,"req_elementoGasto");
RDebugUtils.currentLine=6750257;
 //BA.debugLineNum = 6750257;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
parent.__c.WaitFor("req_elementogasto_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=6750258;
 //BA.debugLineNum = 6750258;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
if (true) break;

case 24:
//for
this.state = 27;
group41 = _reselementogasto.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index41 = 0;
groupLen41 = group41.getSize();
this.state = 61;
if (true) break;

case 61:
//C
this.state = 27;
if (index41 < groupLen41) {
this.state = 26;
_rowelementogasto = (Object[])(group41.Get(index41));}
if (true) break;

case 62:
//C
this.state = 61;
index41++;
if (true) break;

case 26:
//C
this.state = 62;
RDebugUtils.currentLine=6750259;
 //BA.debugLineNum = 6750259;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
_codigoelementogasto = BA.ObjectToString(_rowelementogasto[(int) (0)]);
RDebugUtils.currentLine=6750260;
 //BA.debugLineNum = 6750260;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto[(int) (1)]);
RDebugUtils.currentLine=6750261;
 //BA.debugLineNum = 6750261;BA.debugLine="SD_xComboBoxElemento.Add(descripcionElementoGas";
__ref._sd_xcomboboxelemento /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripcionelementogasto,(Object)(_codigoelementogasto));
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
RDebugUtils.currentLine=6750264;
 //BA.debugLineNum = 6750264;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("06750264","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=6750266;
 //BA.debugLineNum = 6750266;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=6750271;
 //BA.debugLineNum = 6750271;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Insumo\",0)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Insumo",(Object)(0));
RDebugUtils.currentLine=6750272;
 //BA.debugLineNum = 6750272;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Siembra\",1)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Siembra",(Object)(1));
RDebugUtils.currentLine=6750273;
 //BA.debugLineNum = 6750273;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Riego\",2)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Riego",(Object)(2));
RDebugUtils.currentLine=6750275;
 //BA.debugLineNum = 6750275;BA.debugLine="data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=6750278;
 //BA.debugLineNum = 6750278;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdLabor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=6750279;
 //BA.debugLineNum = 6750279;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=6750281;
 //BA.debugLineNum = 6750281;BA.debugLine="If j5.Success Then";
if (true) break;

case 31:
//if
this.state = 40;
if (_j5._success /*boolean*/ ) { 
this.state = 33;
}else {
this.state = 39;
}if (true) break;

case 33:
//C
this.state = 34;
RDebugUtils.currentLine=6750282;
 //BA.debugLineNum = 6750282;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=6750283;
 //BA.debugLineNum = 6750283;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=6750285;
 //BA.debugLineNum = 6750285;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 34:
//for
this.state = 37;
group59 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index59 = 0;
groupLen59 = group59.getSize();
this.state = 65;
if (true) break;

case 65:
//C
this.state = 37;
if (index59 < groupLen59) {
this.state = 36;
_rowregistro = (Object[])(group59.Get(index59));}
if (true) break;

case 66:
//C
this.state = 65;
index59++;
if (true) break;

case 36:
//C
this.state = 66;
RDebugUtils.currentLine=6750286;
 //BA.debugLineNum = 6750286;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
_ultimoregistro = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=6750287;
 //BA.debugLineNum = 6750287;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
parent.__c.LogImpl("06750287","Último Registro obtenido: "+BA.NumberToString(_ultimoregistro),0);
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
RDebugUtils.currentLine=6750291;
 //BA.debugLineNum = 6750291;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("06750291","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=6750294;
 //BA.debugLineNum = 6750294;BA.debugLine="consecutivo = ultimoRegistro + 1";
__ref._consecutivo /*int*/  = (int) (_ultimoregistro+1);
RDebugUtils.currentLine=6750296;
 //BA.debugLineNum = 6750296;BA.debugLine="Log(consecutivo)";
parent.__c.LogImpl("06750296",BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=6750298;
 //BA.debugLineNum = 6750298;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=6750299;
 //BA.debugLineNum = 6750299;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=6750301;
 //BA.debugLineNum = 6750301;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=6750302;
 //BA.debugLineNum = 6750302;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=6750303;
 //BA.debugLineNum = 6750303;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=6750305;
 //BA.debugLineNum = 6750305;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 44:
//for
this.state = 47;
group73 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index73 = 0;
groupLen73 = group73.getSize();
this.state = 69;
if (true) break;

case 69:
//C
this.state = 47;
if (index73 < groupLen73) {
this.state = 46;
_rowregistro = (Object[])(group73.Get(index73));}
if (true) break;

case 70:
//C
this.state = 69;
index73++;
if (true) break;

case 46:
//C
this.state = 70;
RDebugUtils.currentLine=6750306;
 //BA.debugLineNum = 6750306;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=6750307;
 //BA.debugLineNum = 6750307;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("06750307","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=6750311;
 //BA.debugLineNum = 6750311;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("06750311","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = -1;
;
RDebugUtils.currentLine=6750314;
 //BA.debugLineNum = 6750314;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=6750316;
 //BA.debugLineNum = 6750316;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("06750316",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=6750317;
 //BA.debugLineNum = 6750317;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitem", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitem", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
_panel.LoadLayout("addLaboresUI",ba);
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formlabores __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="End Sub";
return "";
}
public String  _b4xtable1_cellclicked(b4a.example.ef.formlabores __ref,String _columnid,long _rowid) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xtable1_cellclicked", false))
	 {return ((String) Debug.delegate(ba, "b4xtable1_cellclicked", new Object[] {_columnid,_rowid}));}
anywheresoftware.b4a.objects.collections.Map _rowdata = null;
String _id = "";
String _nombreinsu = "";
int _cantidadinsu = 0;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
__c.LogImpl("09371649","COLUM ID"+_columnid,0);
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Log(\"ROW ID\"&RowId)";
__c.LogImpl("09371650","ROW ID"+BA.NumberToString(_rowid),0);
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="PanelTittleInsumo.Visible = True";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
__ref._labelinsumoselect /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- "+_nombreinsu+" / "+"Cantidad: "+BA.NumberToString(_cantidadinsu)));
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="PanelInsumoSelect.Visible = True";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="ButtonDeleteInsumo.Visible = True";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
__ref._ideliminartabla /*int*/  = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("#"))));
RDebugUtils.currentLine=9371661;
 //BA.debugLineNum = 9371661;BA.debugLine="Log(idEliminarTabla)";
__c.LogImpl("09371661",BA.NumberToString(__ref._ideliminartabla /*int*/ ),0);
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="End Sub";
return "";
}
public String  _buttonaddinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonaddinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttonaddinsumo_click", null));}
int _numberinsumo = 0;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub ButtonAddInsumo_Click";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
if ((__ref._nameinsumo /*String*/ ).equals("") && (__ref._idinsumo /*String*/ ).equals("") && (__ref._cantinsumo /*String*/ ).equals("")) { 
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo"),BA.ObjectToCharSequence("Error"),ba);
 }else {
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ +1);
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
_numberinsumo = __ref._cantidadinsumos /*int*/ ;
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new Object[]{(Object)(_numberinsumo),(Object)(__ref._idinsumo /*String*/ ),(Object)(__ref._nameinsumo /*String*/ ),(Object)(__ref._cantinsumo /*String*/ )}));
RDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
__ref._edittextcantidadinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="End Sub";
return "";
}
public String  _buttondeleteinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttondeleteinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttondeleteinsumo_click", null));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
__ref._removeinsumofromdata /*String*/ (null,__ref._ideliminartabla /*int*/ );
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ -1);
RDebugUtils.currentLine=9306118;
 //BA.debugLineNum = 9306118;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=9306119;
 //BA.debugLineNum = 9306119;BA.debugLine="PanelTittleInsumo.Visible = False";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9306120;
 //BA.debugLineNum = 9306120;BA.debugLine="PanelInsumoSelect.Visible = False";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9306121;
 //BA.debugLineNum = 9306121;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9306122;
 //BA.debugLineNum = 9306122;BA.debugLine="End Sub";
return "";
}
public String  _removeinsumofromdata(b4a.example.ef.formlabores __ref,int _insumoid) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeinsumofromdata", false))
	 {return ((String) Debug.delegate(ba, "removeinsumofromdata", new Object[] {_insumoid}));}
int _i = 0;
Object[] _arrayelement = null;
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
_arrayelement = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="If arrayElement(0) = insumoID Then";
if ((_arrayelement[(int) (0)]).equals((Object)(_insumoid))) { 
RDebugUtils.currentLine=9437193;
 //BA.debugLineNum = 9437193;BA.debugLine="data.RemoveAt(i)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
 };
 }
};
RDebugUtils.currentLine=9437198;
 //BA.debugLineNum = 9437198;BA.debugLine="End Sub";
return "";
}
public void  _buttoninsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttoninsumo_click", false))
	 {Debug.delegate(ba, "buttoninsumo_click", null); return;}
ResumableSub_ButtonInsumo_Click rsub = new ResumableSub_ButtonInsumo_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonInsumo_Click extends BA.ResumableSub {
public ResumableSub_ButtonInsumo_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
int _i = 0;
long _rowid = 0L;
anywheresoftware.b4a.objects.collections.Map _rowdata = null;
String _id = "";
String _nombreinsu = "";
int _cantidadinsu = 0;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
long _fecha = 0L;
int step1;
int limit1;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
if (true) break;

case 1:
//for
this.state = 28;
step1 = 1;
limit1 = (int) (__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 41;
if (true) break;

case 41:
//C
this.state = 28;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 42:
//C
this.state = 41;
_i = ((int)(0 + _i + step1)) ;
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
_rowid = BA.ObjectToLongNumber(__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=9568268;
 //BA.debugLineNum = 9568268;BA.debugLine="Dim ID As String";
_id = "";
RDebugUtils.currentLine=9568269;
 //BA.debugLineNum = 9568269;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
if (true) break;

case 4:
//if
this.state = 9;
if (_rowdata.ContainsKey((Object)("ID")) && _rowdata.Get((Object)("ID"))!= null) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=9568270;
 //BA.debugLineNum = 9568270;BA.debugLine="ID = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=9568272;
 //BA.debugLineNum = 9568272;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
_id = "No ID";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=9568276;
 //BA.debugLineNum = 9568276;BA.debugLine="Dim nombreInsu As String";
_nombreinsu = "";
RDebugUtils.currentLine=9568277;
 //BA.debugLineNum = 9568277;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
if (true) break;

case 10:
//if
this.state = 15;
if (_rowdata.ContainsKey((Object)("NOMBRE")) && _rowdata.Get((Object)("NOMBRE"))!= null) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
RDebugUtils.currentLine=9568278;
 //BA.debugLineNum = 9568278;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=9568280;
 //BA.debugLineNum = 9568280;BA.debugLine="nombreInsu = \"Desconocido\"";
_nombreinsu = "Desconocido";
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=9568284;
 //BA.debugLineNum = 9568284;BA.debugLine="Dim cantidadInsu As Int";
_cantidadinsu = 0;
RDebugUtils.currentLine=9568285;
 //BA.debugLineNum = 9568285;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
if (true) break;

case 16:
//if
this.state = 27;
if (_rowdata.ContainsKey((Object)("CANTIDAD")) && _rowdata.Get((Object)("CANTIDAD"))!= null) { 
this.state = 18;
}else {
this.state = 26;
}if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=9568286;
 //BA.debugLineNum = 9568286;BA.debugLine="Try";
if (true) break;

case 19:
//try
this.state = 24;
this.catchState = 23;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 24;
this.catchState = 23;
RDebugUtils.currentLine=9568287;
 //BA.debugLineNum = 9568287;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=9568289;
 //BA.debugLineNum = 9568289;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
parent.__c.LogImpl("09568289","Fila "+BA.NumberToString((_i+1))+":",0);
RDebugUtils.currentLine=9568290;
 //BA.debugLineNum = 9568290;BA.debugLine="Log(\" - ID: \" & ID)";
parent.__c.LogImpl("09568290"," - ID: "+_id,0);
RDebugUtils.currentLine=9568291;
 //BA.debugLineNum = 9568291;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
parent.__c.LogImpl("09568291"," - NOMBRE: "+_nombreinsu,0);
RDebugUtils.currentLine=9568292;
 //BA.debugLineNum = 9568292;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
parent.__c.LogImpl("09568292"," - CANTIDAD: "+BA.NumberToString(_cantidadinsu),0);
RDebugUtils.currentLine=9568295;
 //BA.debugLineNum = 9568295;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9568296;
 //BA.debugLineNum = 9568296;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9568299;
 //BA.debugLineNum = 9568299;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborInsumo",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(_id),(Object)(_cantidadinsu)});
RDebugUtils.currentLine=9568302;
 //BA.debugLineNum = 9568302;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=9568303;
 //BA.debugLineNum = 9568303;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 43;
return;
case 43:
//C
this.state = 24;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9568305;
 //BA.debugLineNum = 9568305;BA.debugLine="consecutivo  = consecutivo + 1";
__ref._consecutivo /*int*/  = (int) (__ref._consecutivo /*int*/ +1);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=9568308;
 //BA.debugLineNum = 9568308;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
_cantidadinsu = (int) (0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=9568311;
 //BA.debugLineNum = 9568311;BA.debugLine="cantidadInsu = 0";
_cantidadinsu = (int) (0);
 if (true) break;

case 27:
//C
this.state = 42;
;
 if (true) break;
if (true) break;

case 28:
//C
this.state = 29;
;
RDebugUtils.currentLine=9568316;
 //BA.debugLineNum = 9568316;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=9568317;
 //BA.debugLineNum = 9568317;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=9568318;
 //BA.debugLineNum = 9568318;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=9568319;
 //BA.debugLineNum = 9568319;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=9568320;
 //BA.debugLineNum = 9568320;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=9568321;
 //BA.debugLineNum = 9568321;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=9568323;
 //BA.debugLineNum = 9568323;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=9568325;
 //BA.debugLineNum = 9568325;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9568326;
 //BA.debugLineNum = 9568326;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9568329;
 //BA.debugLineNum = 9568329;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._fechafmrto /*String*/ ),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=9568332;
 //BA.debugLineNum = 9568332;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=9568333;
 //BA.debugLineNum = 9568333;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 44;
return;
case 44:
//C
this.state = 29;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9568336;
 //BA.debugLineNum = 9568336;BA.debugLine="Try";
if (true) break;

case 29:
//try
this.state = 40;
this.catchState = 39;
this.state = 31;
if (true) break;

case 31:
//C
this.state = 32;
this.catchState = 39;
RDebugUtils.currentLine=9568337;
 //BA.debugLineNum = 9568337;BA.debugLine="If j.Success Then";
if (true) break;

case 32:
//if
this.state = 37;
if (_j._success /*boolean*/ ) { 
this.state = 34;
}else {
this.state = 36;
}if (true) break;

case 34:
//C
this.state = 37;
RDebugUtils.currentLine=9568339;
 //BA.debugLineNum = 9568339;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=9568342;
 //BA.debugLineNum = 9568342;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("09568342","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 37:
//C
this.state = 40;
;
 if (true) break;

case 39:
//C
this.state = 40;
this.catchState = 0;
RDebugUtils.currentLine=9568346;
 //BA.debugLineNum = 9568346;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("09568346","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=9568351;
 //BA.debugLineNum = 9568351;BA.debugLine="End Sub";
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
public String  _getdevicename(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "getdevicename", false))
	 {return ((String) Debug.delegate(ba, "getdevicename", null));}
anywheresoftware.b4a.phone.Phone _p = null;
String _manufacturer = "";
String _model = "";
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="End Sub";
return "";
}
public void  _buttonriego_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonriego_click", false))
	 {Debug.delegate(ba, "buttonriego_click", null); return;}
ResumableSub_ButtonRiego_Click rsub = new ResumableSub_ButtonRiego_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonRiego_Click extends BA.ResumableSub {
public ResumableSub_ButtonRiego_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
long _fecha = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborRiego",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(__ref._tiporiego /*String*/ ),(Object)(__ref._procedenciariego /*String*/ ),(Object)(__ref._caudalriego /*String*/ ),(Object)(__ref._cantidadriego /*String*/ )});
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=9633804;
 //BA.debugLineNum = 9633804;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9633807;
 //BA.debugLineNum = 9633807;BA.debugLine="Try";
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
RDebugUtils.currentLine=9633808;
 //BA.debugLineNum = 9633808;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9633809;
 //BA.debugLineNum = 9633809;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("09633811","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=9633814;
 //BA.debugLineNum = 9633814;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("09633814","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=9633818;
 //BA.debugLineNum = 9633818;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=9633819;
 //BA.debugLineNum = 9633819;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=9633820;
 //BA.debugLineNum = 9633820;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=9633821;
 //BA.debugLineNum = 9633821;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=9633822;
 //BA.debugLineNum = 9633822;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=9633823;
 //BA.debugLineNum = 9633823;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=9633825;
 //BA.debugLineNum = 9633825;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=9633827;
 //BA.debugLineNum = 9633827;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9633828;
 //BA.debugLineNum = 9633828;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9633831;
 //BA.debugLineNum = 9633831;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._fechafmrto /*String*/ ),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=9633834;
 //BA.debugLineNum = 9633834;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=9633835;
 //BA.debugLineNum = 9633835;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9633838;
 //BA.debugLineNum = 9633838;BA.debugLine="Try";
if (true) break;

case 13:
//try
this.state = 24;
this.catchState = 23;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 16;
this.catchState = 23;
RDebugUtils.currentLine=9633839;
 //BA.debugLineNum = 9633839;BA.debugLine="If j.Success Then";
if (true) break;

case 16:
//if
this.state = 21;
if (_j._success /*boolean*/ ) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 18:
//C
this.state = 21;
RDebugUtils.currentLine=9633841;
 //BA.debugLineNum = 9633841;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=9633844;
 //BA.debugLineNum = 9633844;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("09633844","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 21:
//C
this.state = 24;
;
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=9633848;
 //BA.debugLineNum = 9633848;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("09633848","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=9633851;
 //BA.debugLineNum = 9633851;BA.debugLine="End Sub";
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
public void  _buttonsimbra_click(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonsimbra_click", false))
	 {Debug.delegate(ba, "buttonsimbra_click", null); return;}
ResumableSub_ButtonSimbra_Click rsub = new ResumableSub_ButtonSimbra_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonSimbra_Click extends BA.ResumableSub {
public ResumableSub_ButtonSimbra_Click(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmdultimoregistro = null;
b4a.example.ef.httpjob _j5 = null;
b4a.example.ef.main._dbresult _resultimoregistro = null;
Object[] _rowregistro = null;
int _ultimoregistrosiembra = 0;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
long _fecha = 0L;
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="If j5.Success Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_j5._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 9;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9699340;
 //BA.debugLineNum = 9699340;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_rowregistro = (Object[])(group8.Get(index8));}
if (true) break;

case 38:
//C
this.state = 37;
index8++;
if (true) break;

case 6:
//C
this.state = 38;
RDebugUtils.currentLine=9699341;
 //BA.debugLineNum = 9699341;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("09699342","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=9699346;
 //BA.debugLineNum = 9699346;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("09699346","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=9699349;
 //BA.debugLineNum = 9699349;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=9699351;
 //BA.debugLineNum = 9699351;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("09699351",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=9699356;
 //BA.debugLineNum = 9699356;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborSiembra",new Object[]{(Object)(__ref._consecutivosiembra /*int*/ ),(Object)(__ref._codigosiembra /*String*/ ),(Object)(__ref._distanciasiembra /*int*/ ),(Object)(__ref._toneladasemillasiembra /*int*/ ),(Object)(__ref._numeropaquetessiembra /*int*/ ),(Object)(__ref._procedenciasiembra /*String*/ ),(Object)(__ref._tipolabranzasiembra /*String*/ ),(Object)(__ref._bandereosiembra /*int*/ ),(Object)(__ref._numeromacollosiembra /*int*/ )});
RDebugUtils.currentLine=9699359;
 //BA.debugLineNum = 9699359;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=9699360;
 //BA.debugLineNum = 9699360;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9699363;
 //BA.debugLineNum = 9699363;BA.debugLine="Try";
if (true) break;

case 11:
//try
this.state = 22;
this.catchState = 21;
this.state = 13;
if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 21;
RDebugUtils.currentLine=9699364;
 //BA.debugLineNum = 9699364;BA.debugLine="If j.Success Then";
if (true) break;

case 14:
//if
this.state = 19;
if (_j._success /*boolean*/ ) { 
this.state = 16;
}else {
this.state = 18;
}if (true) break;

case 16:
//C
this.state = 19;
 if (true) break;

case 18:
//C
this.state = 19;
RDebugUtils.currentLine=9699368;
 //BA.debugLineNum = 9699368;BA.debugLine="Log(\"Error al agregar datos: \" & LastException)";
parent.__c.LogImpl("09699368","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=9699369;
 //BA.debugLineNum = 9699369;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("09699369","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=9699370;
 //BA.debugLineNum = 9699370;BA.debugLine="Log(\"Valores enviados: consecutivo=\" & consecut";
parent.__c.LogImpl("09699370","Valores enviados: consecutivo="+BA.NumberToString(__ref._consecutivo /*int*/ )+", codigoSiembra="+__ref._codigosiembra /*String*/ +", distanciaSiembra="+BA.NumberToString(__ref._distanciasiembra /*int*/ )+", toneladaSemillaSiembra="+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ )+", numeroPaquetesSiembra="+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ )+", procedenciaSiembra="+__ref._procedenciasiembra /*String*/ +", tipoLabranzaSiembra="+__ref._tipolabranzasiembra /*String*/ +", bandereoSiembra="+BA.NumberToString(__ref._bandereosiembra /*int*/ )+", numeroMacolloSiembra="+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
 if (true) break;

case 19:
//C
this.state = 22;
;
 if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 0;
RDebugUtils.currentLine=9699378;
 //BA.debugLineNum = 9699378;BA.debugLine="Log(\"Excepción capturada: \" & LastException)";
parent.__c.LogImpl("09699378","Excepción capturada: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
RDebugUtils.currentLine=9699383;
 //BA.debugLineNum = 9699383;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=9699384;
 //BA.debugLineNum = 9699384;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=9699385;
 //BA.debugLineNum = 9699385;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=9699386;
 //BA.debugLineNum = 9699386;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=9699387;
 //BA.debugLineNum = 9699387;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=9699388;
 //BA.debugLineNum = 9699388;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=9699390;
 //BA.debugLineNum = 9699390;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=9699392;
 //BA.debugLineNum = 9699392;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9699393;
 //BA.debugLineNum = 9699393;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9699396;
 //BA.debugLineNum = 9699396;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._fechafmrto /*String*/ ),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=9699399;
 //BA.debugLineNum = 9699399;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=9699400;
 //BA.debugLineNum = 9699400;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9699403;
 //BA.debugLineNum = 9699403;BA.debugLine="Try";
if (true) break;

case 23:
//try
this.state = 34;
this.catchState = 33;
this.state = 25;
if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 33;
RDebugUtils.currentLine=9699404;
 //BA.debugLineNum = 9699404;BA.debugLine="If j.Success Then";
if (true) break;

case 26:
//if
this.state = 31;
if (_j._success /*boolean*/ ) { 
this.state = 28;
}else {
this.state = 30;
}if (true) break;

case 28:
//C
this.state = 31;
RDebugUtils.currentLine=9699406;
 //BA.debugLineNum = 9699406;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=9699409;
 //BA.debugLineNum = 9699409;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("09699409","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 31:
//C
this.state = 34;
;
 if (true) break;

case 33:
//C
this.state = 34;
this.catchState = 0;
RDebugUtils.currentLine=9699413;
 //BA.debugLineNum = 9699413;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("09699413","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=9699417;
 //BA.debugLineNum = 9699417;BA.debugLine="End Sub";
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
public String  _class_globals(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Private Label14Time As Label";
_label14time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="Dim fechafmrto As String";
_fechafmrto = "";
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="Dim horaSistema As String";
_horasistema = "";
RDebugUtils.currentLine=6488080;
 //BA.debugLineNum = 6488080;BA.debugLine="Private loteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=6488081;
 //BA.debugLineNum = 6488081;BA.debugLine="Private elementoLabor As String";
_elementolabor = "";
RDebugUtils.currentLine=6488082;
 //BA.debugLineNum = 6488082;BA.debugLine="Private elementoGasto As String";
_elementogasto = "";
RDebugUtils.currentLine=6488083;
 //BA.debugLineNum = 6488083;BA.debugLine="Private areaLabor As Int";
_arealabor = 0;
RDebugUtils.currentLine=6488084;
 //BA.debugLineNum = 6488084;BA.debugLine="Private areaLote As Int";
_arealote = 0;
RDebugUtils.currentLine=6488085;
 //BA.debugLineNum = 6488085;BA.debugLine="Dim consecutivo As Int";
_consecutivo = 0;
RDebugUtils.currentLine=6488086;
 //BA.debugLineNum = 6488086;BA.debugLine="Private tipoLabor As String";
_tipolabor = "";
RDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488088;
 //BA.debugLineNum = 6488088;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488089;
 //BA.debugLineNum = 6488089;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488090;
 //BA.debugLineNum = 6488090;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="Private SD_xComboBoxElemento As SD_xComboBox";
_sd_xcomboboxelemento = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488092;
 //BA.debugLineNum = 6488092;BA.debugLine="Private SD_xComboBoxTypeForm As SD_xComboBox";
_sd_xcomboboxtypeform = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488093;
 //BA.debugLineNum = 6488093;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=6488094;
 //BA.debugLineNum = 6488094;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=6488096;
 //BA.debugLineNum = 6488096;BA.debugLine="Private Panel2geral As Panel";
_panel2geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488097;
 //BA.debugLineNum = 6488097;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
_sd_xcomboboxtiporiego = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488099;
 //BA.debugLineNum = 6488099;BA.debugLine="Private Panel3geral As Panel";
_panel3geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488100;
 //BA.debugLineNum = 6488100;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
_sd_xcomboboxcodigovariedad = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488101;
 //BA.debugLineNum = 6488101;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
_sd_xcomboboxtipolabranza = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488103;
 //BA.debugLineNum = 6488103;BA.debugLine="Private cantidadInsumos As Int";
_cantidadinsumos = 0;
RDebugUtils.currentLine=6488105;
 //BA.debugLineNum = 6488105;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
_sd_xcomboboxinsumo = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=6488106;
 //BA.debugLineNum = 6488106;BA.debugLine="Private EditTextCantidadInsumo As EditText";
_edittextcantidadinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=6488107;
 //BA.debugLineNum = 6488107;BA.debugLine="Private ButtonAddInsumo As Button";
_buttonaddinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6488108;
 //BA.debugLineNum = 6488108;BA.debugLine="Private ButtonDeleteInsumo As Button";
_buttondeleteinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6488109;
 //BA.debugLineNum = 6488109;BA.debugLine="Private Panel0geral As Panel";
_panel0geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488111;
 //BA.debugLineNum = 6488111;BA.debugLine="Private IDINSUMO As String";
_idinsumo = "";
RDebugUtils.currentLine=6488112;
 //BA.debugLineNum = 6488112;BA.debugLine="Private NAMEINSUMO As String";
_nameinsumo = "";
RDebugUtils.currentLine=6488113;
 //BA.debugLineNum = 6488113;BA.debugLine="Private CANTINSUMO As String";
_cantinsumo = "";
RDebugUtils.currentLine=6488115;
 //BA.debugLineNum = 6488115;BA.debugLine="Private LabelCantidadInsumos As Label";
_labelcantidadinsumos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6488116;
 //BA.debugLineNum = 6488116;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4a.example.ef.b4xtable();
RDebugUtils.currentLine=6488117;
 //BA.debugLineNum = 6488117;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6488119;
 //BA.debugLineNum = 6488119;BA.debugLine="Private PanelInsumoSelect As Panel";
_panelinsumoselect = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488120;
 //BA.debugLineNum = 6488120;BA.debugLine="Private PanelTittleInsumo As Panel";
_paneltittleinsumo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488121;
 //BA.debugLineNum = 6488121;BA.debugLine="Private LabelInsumoSelect As Label";
_labelinsumoselect = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6488123;
 //BA.debugLineNum = 6488123;BA.debugLine="Dim idEliminarTabla As Int";
_ideliminartabla = 0;
RDebugUtils.currentLine=6488125;
 //BA.debugLineNum = 6488125;BA.debugLine="Dim tipoRiego As String";
_tiporiego = "";
RDebugUtils.currentLine=6488126;
 //BA.debugLineNum = 6488126;BA.debugLine="Dim procedenciaRiego As String";
_procedenciariego = "";
RDebugUtils.currentLine=6488127;
 //BA.debugLineNum = 6488127;BA.debugLine="Dim caudalRiego As String";
_caudalriego = "";
RDebugUtils.currentLine=6488128;
 //BA.debugLineNum = 6488128;BA.debugLine="Dim cantidadRiego As String";
_cantidadriego = "";
RDebugUtils.currentLine=6488130;
 //BA.debugLineNum = 6488130;BA.debugLine="Dim codigoSiembra As String";
_codigosiembra = "";
RDebugUtils.currentLine=6488131;
 //BA.debugLineNum = 6488131;BA.debugLine="Dim distanciaSiembra As Int";
_distanciasiembra = 0;
RDebugUtils.currentLine=6488132;
 //BA.debugLineNum = 6488132;BA.debugLine="Dim bandereoSiembra As Int";
_bandereosiembra = 0;
RDebugUtils.currentLine=6488133;
 //BA.debugLineNum = 6488133;BA.debugLine="Dim toneladaSemillaSiembra As Int";
_toneladasemillasiembra = 0;
RDebugUtils.currentLine=6488134;
 //BA.debugLineNum = 6488134;BA.debugLine="Dim procedenciaSiembra As String";
_procedenciasiembra = "";
RDebugUtils.currentLine=6488135;
 //BA.debugLineNum = 6488135;BA.debugLine="Dim tipoLabranzaSiembra As String";
_tipolabranzasiembra = "";
RDebugUtils.currentLine=6488136;
 //BA.debugLineNum = 6488136;BA.debugLine="Dim numeroPaquetesSiembra As Int";
_numeropaquetessiembra = 0;
RDebugUtils.currentLine=6488137;
 //BA.debugLineNum = 6488137;BA.debugLine="Dim numeroMacolloSiembra As Int";
_numeromacollosiembra = 0;
RDebugUtils.currentLine=6488139;
 //BA.debugLineNum = 6488139;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=6488140;
 //BA.debugLineNum = 6488140;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=6488142;
 //BA.debugLineNum = 6488142;BA.debugLine="Dim fechaActual As String";
_fechaactual = "";
RDebugUtils.currentLine=6488143;
 //BA.debugLineNum = 6488143;BA.debugLine="Dim consecutivoSiembra As Int";
_consecutivosiembra = 0;
RDebugUtils.currentLine=6488144;
 //BA.debugLineNum = 6488144;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumo(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createiteminsumo", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumo", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Private Sub CreateItemInsumo As Panel";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
_panel.LoadLayout("FormInsumo",ba);
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="panel.Height=Panel0geral.Height";
_panel.setHeight(__ref._panel0geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=7012362;
 //BA.debugLineNum = 7012362;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemriego(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemriego", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemriego", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Private Sub CreateItemRiego As Panel";
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
_panel.LoadLayout("FormRiego",ba);
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="panel.Height=Panel2geral.Height";
_panel.setHeight(__ref._panel2geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6881290;
 //BA.debugLineNum = 6881290;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=6881291;
 //BA.debugLineNum = 6881291;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemsiembra(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemsiembra", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemsiembra", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Private Sub CreateItemSiembra As Panel";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
_panel.LoadLayout("FormSiembra",ba);
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="panel.Height=Panel3geral.Height";
_panel.setHeight(__ref._panel3geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="End Sub";
return null;
}
public String  _edittextarealabor_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealabor_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealabor_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="areaLabor = New";
__ref._arealabor /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
__c.LogImpl("07733252","Area Labor "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="End Sub";
return "";
}
public String  _edittextarealote_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealote_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealote_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="areaLote = New";
__ref._arealote /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="Log(\"Area lote \" & areaLote )";
__c.LogImpl("07798788","Area lote "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="End Sub";
return "";
}
public String  _edittextbandereo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextbandereo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextbandereo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="bandereoSiembra = New";
__ref._bandereosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
__c.LogImpl("08519684","bandereo "+BA.NumberToString(__ref._bandereosiembra /*int*/ ),0);
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadagua_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadagua_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadagua_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="cantidadRiego = New";
__ref._cantidadriego /*String*/  = _new;
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
__c.LogImpl("08060931","cantidad"+__ref._cantidadriego /*String*/ ,0);
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadinsumo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadinsumo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="ButtonAddInsumo.Enabled = True";
__ref._buttonaddinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="CANTINSUMO = New";
__ref._cantinsumo /*String*/  = _new;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="End Sub";
return "";
}
public String  _edittextcaudalaplicado_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcaudalaplicado_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcaudalaplicado_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="caudalRiego = New";
__ref._caudalriego /*String*/  = _new;
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="Log(\"caudal\" & caudalRiego)";
__c.LogImpl("07995395","caudal"+__ref._caudalriego /*String*/ ,0);
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="End Sub";
return "";
}
public String  _edittextdistanciasiembra_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextdistanciasiembra_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextdistanciasiembra_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="distanciaSiembra = New";
__ref._distanciasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
__c.LogImpl("08454147","Distancia de siembra "+BA.NumberToString(__ref._distanciasiembra /*int*/ ),0);
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeromacollos_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeromacollos_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeromacollos_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="numeroMacolloSiembra = New";
__ref._numeromacollosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
__c.LogImpl("08847363","numero de macollos "+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeropaquetes_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeropaquetes_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeropaquetes_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="numeroPaquetesSiembra = New";
__ref._numeropaquetessiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
__c.LogImpl("08781828","numero de paquetes "+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ ),0);
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedencia_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedencia_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedencia_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="procedenciaRiego = New";
__ref._procedenciariego /*String*/  = _new;
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
__c.LogImpl("07929860","procedencia"+__ref._procedenciariego /*String*/ ,0);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedenciadestino_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedenciadestino_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedenciadestino_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="procedenciaSiembra = New";
__ref._procedenciasiembra /*String*/  = _new;
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
__c.LogImpl("08650755","procedencia "+__ref._procedenciasiembra /*String*/ ,0);
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="End Sub";
return "";
}
public String  _edittexttoneladasemilla_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittexttoneladasemilla_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittexttoneladasemilla_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="toneladaSemillaSiembra = New";
__ref._toneladasemillasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
__c.LogImpl("08585220","tonelada Semilla "+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ ),0);
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label13time_click", false))
	 {return ((String) Debug.delegate(ba, "label13time_click", null));}
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Private Sub Label13Time_Click";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Panel12.Visible = True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="End Sub";
return "";
}
public String  _label14time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label14time_click", false))
	 {return ((String) Debug.delegate(ba, "label14time_click", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub Label14Time_Click";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Panel3.Visible = True";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="End Sub";
return "";
}
public void  _llenarcomboboxinsumo(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxinsumo", false))
	 {Debug.delegate(ba, "llenarcomboboxinsumo", null); return;}
ResumableSub_LlenarComboBoxInsumo rsub = new ResumableSub_LlenarComboBoxInsumo(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxInsumo extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxInsumo(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_producto = "";
String _dscrpcion_producto = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_insumosSort",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9043975;
 //BA.debugLineNum = 9043975;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9043977;
 //BA.debugLineNum = 9043977;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
_cdgo_producto = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
_dscrpcion_producto = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
__ref._sd_xcomboboxinsumo /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_producto,(Object)(_dscrpcion_producto+" - "+_cdgo_producto));
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
RDebugUtils.currentLine=9043983;
 //BA.debugLineNum = 9043983;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("09043983","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=9043986;
 //BA.debugLineNum = 9043986;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxriego(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxriego", false))
	 {Debug.delegate(ba, "llenarcomboboxriego", null); return;}
ResumableSub_LlenarComboBoxRiego rsub = new ResumableSub_LlenarComboBoxRiego(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxRiego extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxRiego(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_tipo_riego = "";
String _dscrpcion_tipo_riego = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoRiego",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 14:
//C
this.state = 13;
index8++;
if (true) break;

case 6:
//C
this.state = 14;
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
_cdgo_tipo_riego = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
_dscrpcion_tipo_riego = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
__ref._sd_xcomboboxtiporiego /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_riego,(Object)(_cdgo_tipo_riego));
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
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("08912911","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=8912914;
 //BA.debugLineNum = 8912914;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxsiembra(b4a.example.ef.formlabores __ref) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "llenarcomboboxsiembra", false))
	 {Debug.delegate(ba, "llenarcomboboxsiembra", null); return;}
ResumableSub_LlenarComboBoxSiembra rsub = new ResumableSub_LlenarComboBoxSiembra(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxSiembra extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxSiembra(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_variedad = "";
b4a.example.ef.main._dbcommand _cmdtipolabranza = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _restipolabranza = null;
Object[] _rowtipolabranza = null;
String _cdgo_tipo_labranza = "";
String _dscrpcion_tipo_labranza = "";
anywheresoftware.b4a.BA.IterableList group8;
int index8;
int groupLen8;
anywheresoftware.b4a.BA.IterableList group21;
int index21;
int groupLen21;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_codVariedad",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group8 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index8 = 0;
groupLen8 = group8.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if (index8 < groupLen8) {
this.state = 6;
_row = (Object[])(group8.Get(index8));}
if (true) break;

case 24:
//C
this.state = 23;
index8++;
if (true) break;

case 6:
//C
this.state = 24;
RDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
_cdgo_variedad = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
__ref._sd_xcomboboxcodigovariedad /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_cdgo_variedad,(Object)(_cdgo_variedad));
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
RDebugUtils.currentLine=8978447;
 //BA.debugLineNum = 8978447;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("08978447","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=8978453;
 //BA.debugLineNum = 8978453;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
_cmdtipolabranza = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoLabranza",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=8978454;
 //BA.debugLineNum = 8978454;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdtipolabranza,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8978455;
 //BA.debugLineNum = 8978455;BA.debugLine="If j4.Success Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_j4._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=8978456;
 //BA.debugLineNum = 8978456;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
_req._handlejobasync /*void*/ (null,_j4,"req_TipoLabranza");
RDebugUtils.currentLine=8978457;
 //BA.debugLineNum = 8978457;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
parent.__c.WaitFor("req_tipolabranza_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8978458;
 //BA.debugLineNum = 8978458;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
if (true) break;

case 14:
//for
this.state = 17;
group21 = _restipolabranza.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index21 = 0;
groupLen21 = group21.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 17;
if (index21 < groupLen21) {
this.state = 16;
_rowtipolabranza = (Object[])(group21.Get(index21));}
if (true) break;

case 28:
//C
this.state = 27;
index21++;
if (true) break;

case 16:
//C
this.state = 28;
RDebugUtils.currentLine=8978459;
 //BA.debugLineNum = 8978459;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (0)]);
RDebugUtils.currentLine=8978460;
 //BA.debugLineNum = 8978460;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (1)]);
RDebugUtils.currentLine=8978461;
 //BA.debugLineNum = 8978461;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
__ref._sd_xcomboboxtipolabranza /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_dscrpcion_tipo_labranza,(Object)(_cdgo_tipo_labranza));
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
RDebugUtils.currentLine=8978464;
 //BA.debugLineNum = 8978464;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
parent.__c.LogImpl("08978464","Error en la consulta de Tipo_Labranza: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=8978466;
 //BA.debugLineNum = 8978466;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=8978468;
 //BA.debugLineNum = 8978468;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _removeform0ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform0ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform0ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Private Sub RemoveForm0IfExists";
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form0"))) { 
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="End Sub";
return "";
}
public String  _removeform2ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform2ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform2ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub RemoveForm2IfExists";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form2"))) { 
RDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="End Sub";
return "";
}
public String  _removeform3ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform3ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform3ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub RemoveForm3IfExists";
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form3"))) { 
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxcodigovariedad_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxcodigovariedad_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxcodigovariedad_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="codigoSiembra = Value";
__ref._codigosiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
__c.LogImpl("08388611","codigo "+__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxelemento_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxelemento_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxelemento_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="elementoGasto = Value";
__ref._elementogasto /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="If elementoGasto.Length > 0 Then";
if (__ref._elementogasto /*String*/ .length()>0) { 
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, Min(";
__ref._elementogasto /*String*/  = __ref._elementogasto /*String*/ .substring((int) (0),(int) (__c.Min(2,__ref._elementogasto /*String*/ .length())));
 }else {
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="elementoGasto = \"\" ' Si está vacío, asignar cade";
__ref._elementogasto /*String*/  = "";
 };
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="Log(\"Las dos primeras letras (o menos si no hay s";
__c.LogImpl("07667725","Las dos primeras letras (o menos si no hay suficientes): "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhacienda_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxhacienda_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
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
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=7471127;
 //BA.debugLineNum = 7471127;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
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
RDebugUtils.currentLine=7471132;
 //BA.debugLineNum = 7471132;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("07471132","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=7471136;
 //BA.debugLineNum = 7471136;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7471139;
 //BA.debugLineNum = 7471139;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
parent.__c.LogImpl("07471139","Hacienda"+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=7471140;
 //BA.debugLineNum = 7471140;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxinsumo_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxinsumo_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxinsumo_itemclick", new Object[] {_position,_value}));}
String[] _partes = null;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
_partes = __c.Regex.Split(" - ",BA.ObjectToString(_value));
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="NAMEINSUMO = partes(0)";
__ref._nameinsumo /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="IDINSUMO = partes(1)";
__ref._idinsumo /*String*/  = _partes[(int) (1)];
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="elementoLabor = Value";
__ref._elementolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
__c.LogImpl("07602180","Elemento labor"+__ref._elementolabor /*String*/ ,0);
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="loteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
__c.LogImpl("07536643","Lotecbx"+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnit_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxnit_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxnit_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formlabores parent,b4a.example.ef.formlabores __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formlabores __ref;
b4a.example.ef.formlabores parent;
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
RDebugUtils.currentModule="formlabores";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7405587;
 //BA.debugLineNum = 7405587;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=7405591;
 //BA.debugLineNum = 7405591;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
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
RDebugUtils.currentLine=7405596;
 //BA.debugLineNum = 7405596;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("07405596","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=7405599;
 //BA.debugLineNum = 7405599;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7405602;
 //BA.debugLineNum = 7405602;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
parent.__c.LogImpl("07405602","Nit seleccionado"+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=7405603;
 //BA.debugLineNum = 7405603;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxtipolabranza_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtipolabranza_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtipolabranza_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="tipoLabranzaSiembra = Value";
__ref._tipolabranzasiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
__c.LogImpl("08716292","tipo labranza "+__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtiporiego_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtiporiego_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtiporiego_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="tipoRiego = Value";
__ref._tiporiego /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
__c.LogImpl("08126467","tipo riego"+__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtypeform_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtypeform_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtypeform_itemclick", new Object[] {_position,_value}));}
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="tipoLabor = Value";
__ref._tipolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="If IsNumber(Value) Then";
if (__c.IsNumber(BA.ObjectToString(_value))) { 
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)(0),(Object)(1),(Object)(2))) {
case 0: {
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="RemoveForm2IfExists";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form0"));
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="LlenarComboBoxInsumo";
__ref._llenarcomboboxinsumo /*void*/ (null);
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
_insumocolum = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"#",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_numbers /*int*/ );
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"ID",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"NOMBRE",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"CANTIDAD",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="cantidadInsumos = 0";
__ref._cantidadinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=7864338;
 //BA.debugLineNum = 7864338;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=7864339;
 //BA.debugLineNum = 7864339;BA.debugLine="CANTINSUMO = \"\"";
__ref._cantinsumo /*String*/  = "";
 break; }
case 1: {
RDebugUtils.currentLine=7864341;
 //BA.debugLineNum = 7864341;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=7864343;
 //BA.debugLineNum = 7864343;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemsiembra /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form3"));
RDebugUtils.currentLine=7864344;
 //BA.debugLineNum = 7864344;BA.debugLine="LlenarComboBoxSiembra";
__ref._llenarcomboboxsiembra /*void*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=7864346;
 //BA.debugLineNum = 7864346;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=7864347;
 //BA.debugLineNum = 7864347;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=7864348;
 //BA.debugLineNum = 7864348;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemriego /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form2"));
RDebugUtils.currentLine=7864349;
 //BA.debugLineNum = 7864349;BA.debugLine="LlenarComboBoxRiego";
__ref._llenarcomboboxriego /*void*/ (null);
 break; }
default: {
RDebugUtils.currentLine=7864352;
 //BA.debugLineNum = 7864352;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
__c.LogImpl("07864352","Valor no reconocido: "+BA.ObjectToString(_value),0);
 break; }
}
;
 }else {
RDebugUtils.currentLine=7864355;
 //BA.debugLineNum = 7864355;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
__c.LogImpl("07864355","Error: Value no es un número válido.",0);
 };
RDebugUtils.currentLine=7864358;
 //BA.debugLineNum = 7864358;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
__c.LogImpl("07864358","Tipo labor "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=7864359;
 //BA.debugLineNum = 7864359;BA.debugLine="End Sub";
return "";
}
}