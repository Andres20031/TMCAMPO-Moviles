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
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=9830417;
 //BA.debugLineNum = 9830417;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=9830420;
 //BA.debugLineNum = 9830420;BA.debugLine="Label13Time.Text = formattedDate";
__ref._label13time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=9830423;
 //BA.debugLineNum = 9830423;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9830426;
 //BA.debugLineNum = 9830426;BA.debugLine="fechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=9830429;
 //BA.debugLineNum = 9830429;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
__c.LogImpl("29830429","Fecha inicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=9830431;
 //BA.debugLineNum = 9830431;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formlabores __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
String[] _dateparts = null;
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
RDebugUtils.currentLine=9895953;
 //BA.debugLineNum = 9895953;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
RDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="Label14Time.Text = formattedDate";
__ref._label14time /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=9895959;
 //BA.debugLineNum = 9895959;BA.debugLine="Panel3.Visible = False";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9895962;
 //BA.debugLineNum = 9895962;BA.debugLine="fechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=9895965;
 //BA.debugLineNum = 9895965;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
__c.LogImpl("29895965","Fecha fin: "+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=9895968;
 //BA.debugLineNum = 9895968;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,parent.__c.Colors.White,((int)0xb4008000));
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Root.LoadLayout(\"form\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("form",ba);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextbackgroundcolor = ((int)0xff25253d);
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._defaulttextcolor = parent.__c.Colors.White;
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitem /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form1"));
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9371661;
 //BA.debugLineNum = 9371661;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=9371663;
 //BA.debugLineNum = 9371663;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=9371664;
 //BA.debugLineNum = 9371664;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9371665;
 //BA.debugLineNum = 9371665;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=9371666;
 //BA.debugLineNum = 9371666;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=9371667;
 //BA.debugLineNum = 9371667;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=9371668;
 //BA.debugLineNum = 9371668;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
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
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("29371671","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=9371676;
 //BA.debugLineNum = 9371676;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor_maq",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9371677;
 //BA.debugLineNum = 9371677;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9371678;
 //BA.debugLineNum = 9371678;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=9371679;
 //BA.debugLineNum = 9371679;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (null,_j3,"req_labormaquina");
RDebugUtils.currentLine=9371680;
 //BA.debugLineNum = 9371680;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9371681;
 //BA.debugLineNum = 9371681;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
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
RDebugUtils.currentLine=9371682;
 //BA.debugLineNum = 9371682;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
RDebugUtils.currentLine=9371683;
 //BA.debugLineNum = 9371683;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
RDebugUtils.currentLine=9371684;
 //BA.debugLineNum = 9371684;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
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
RDebugUtils.currentLine=9371687;
 //BA.debugLineNum = 9371687;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("29371687","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=9371689;
 //BA.debugLineNum = 9371689;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=9371693;
 //BA.debugLineNum = 9371693;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
_cmdelementogasto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_elementoGasto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9371694;
 //BA.debugLineNum = 9371694;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdelementogasto,(int) (0),parent.__c.Null)));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9371695;
 //BA.debugLineNum = 9371695;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=9371696;
 //BA.debugLineNum = 9371696;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
_req._handlejobasync /*void*/ (null,_j4,"req_elementoGasto");
RDebugUtils.currentLine=9371697;
 //BA.debugLineNum = 9371697;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
parent.__c.WaitFor("req_elementogasto_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9371698;
 //BA.debugLineNum = 9371698;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
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
RDebugUtils.currentLine=9371699;
 //BA.debugLineNum = 9371699;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
_codigoelementogasto = BA.ObjectToString(_rowelementogasto[(int) (0)]);
RDebugUtils.currentLine=9371700;
 //BA.debugLineNum = 9371700;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto[(int) (1)]);
RDebugUtils.currentLine=9371701;
 //BA.debugLineNum = 9371701;BA.debugLine="SD_xComboBoxElemento.Add(descripcionElementoGas";
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
RDebugUtils.currentLine=9371704;
 //BA.debugLineNum = 9371704;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("29371704","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=9371706;
 //BA.debugLineNum = 9371706;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=9371711;
 //BA.debugLineNum = 9371711;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Insumo\",0)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Insumo",(Object)(0));
RDebugUtils.currentLine=9371712;
 //BA.debugLineNum = 9371712;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Siembra\",1)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Siembra",(Object)(1));
RDebugUtils.currentLine=9371713;
 //BA.debugLineNum = 9371713;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Riego\",2)";
__ref._sd_xcomboboxtypeform /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Riego",(Object)(2));
RDebugUtils.currentLine=9371715;
 //BA.debugLineNum = 9371715;BA.debugLine="data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=9371718;
 //BA.debugLineNum = 9371718;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdLabor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9371719;
 //BA.debugLineNum = 9371719;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9371721;
 //BA.debugLineNum = 9371721;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=9371722;
 //BA.debugLineNum = 9371722;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=9371723;
 //BA.debugLineNum = 9371723;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9371725;
 //BA.debugLineNum = 9371725;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
RDebugUtils.currentLine=9371726;
 //BA.debugLineNum = 9371726;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
_ultimoregistro = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=9371727;
 //BA.debugLineNum = 9371727;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
parent.__c.LogImpl("29371727","Último Registro obtenido: "+BA.NumberToString(_ultimoregistro),0);
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
RDebugUtils.currentLine=9371731;
 //BA.debugLineNum = 9371731;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("29371731","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
RDebugUtils.currentLine=9371734;
 //BA.debugLineNum = 9371734;BA.debugLine="consecutivo = ultimoRegistro + 1";
__ref._consecutivo /*int*/  = (int) (_ultimoregistro+1);
RDebugUtils.currentLine=9371736;
 //BA.debugLineNum = 9371736;BA.debugLine="Log(consecutivo)";
parent.__c.LogImpl("29371736",BA.NumberToString(__ref._consecutivo /*int*/ ),0);
RDebugUtils.currentLine=9371738;
 //BA.debugLineNum = 9371738;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=9371739;
 //BA.debugLineNum = 9371739;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=9371741;
 //BA.debugLineNum = 9371741;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=9371742;
 //BA.debugLineNum = 9371742;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=9371743;
 //BA.debugLineNum = 9371743;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "b4xpage_appear"), (Object)(_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=9371745;
 //BA.debugLineNum = 9371745;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
RDebugUtils.currentLine=9371746;
 //BA.debugLineNum = 9371746;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=9371747;
 //BA.debugLineNum = 9371747;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("29371747","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=9371751;
 //BA.debugLineNum = 9371751;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("29371751","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = -1;
;
RDebugUtils.currentLine=9371754;
 //BA.debugLineNum = 9371754;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=9371756;
 //BA.debugLineNum = 9371756;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("29371756",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=9371757;
 //BA.debugLineNum = 9371757;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Private Sub CreateItem As Panel";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
_panel.LoadLayout("addLaboresUI",ba);
RDebugUtils.currentLine=9437192;
 //BA.debugLineNum = 9437192;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(__ref._panel1geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=9437195;
 //BA.debugLineNum = 9437195;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formlabores __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formlabores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
RDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
__c.LogImpl("211993089","COLUM ID"+_columnid,0);
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Log(\"ROW ID\"&RowId)";
__c.LogImpl("211993090","ROW ID"+BA.NumberToString(_rowid),0);
RDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="PanelTittleInsumo.Visible = True";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
RDebugUtils.currentLine=11993094;
 //BA.debugLineNum = 11993094;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
__ref._labelinsumoselect /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("- "+_nombreinsu+" / "+"Cantidad: "+BA.NumberToString(_cantidadinsu)));
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="PanelInsumoSelect.Visible = True";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="ButtonDeleteInsumo.Visible = True";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=11993100;
 //BA.debugLineNum = 11993100;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
__ref._ideliminartabla /*int*/  = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("#"))));
RDebugUtils.currentLine=11993101;
 //BA.debugLineNum = 11993101;BA.debugLine="Log(idEliminarTabla)";
__c.LogImpl("211993101",BA.NumberToString(__ref._ideliminartabla /*int*/ ),0);
RDebugUtils.currentLine=11993102;
 //BA.debugLineNum = 11993102;BA.debugLine="End Sub";
return "";
}
public String  _buttonaddinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttonaddinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttonaddinsumo_click", null));}
int _numberinsumo = 0;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Private Sub ButtonAddInsumo_Click";
RDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
if ((__ref._nameinsumo /*String*/ ).equals("") && (__ref._idinsumo /*String*/ ).equals("") && (__ref._cantinsumo /*String*/ ).equals("")) { 
RDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo"),BA.ObjectToCharSequence("Error"),ba);
 }else {
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ +1);
RDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
_numberinsumo = __ref._cantidadinsumos /*int*/ ;
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(new Object[]{(Object)(_numberinsumo),(Object)(__ref._idinsumo /*String*/ ),(Object)(__ref._nameinsumo /*String*/ ),(Object)(__ref._cantinsumo /*String*/ )}));
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=11862024;
 //BA.debugLineNum = 11862024;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=11862025;
 //BA.debugLineNum = 11862025;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
__ref._edittextcantidadinsumo /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="End Sub";
return "";
}
public String  _buttondeleteinsumo_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "buttondeleteinsumo_click", false))
	 {return ((String) Debug.delegate(ba, "buttondeleteinsumo_click", null));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
__ref._removeinsumofromdata /*String*/ (null,__ref._ideliminartabla /*int*/ );
RDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
__ref._cantidadinsumos /*int*/  = (int) (__ref._cantidadinsumos /*int*/ -1);
RDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="PanelTittleInsumo.Visible = False";
__ref._paneltittleinsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11927560;
 //BA.debugLineNum = 11927560;BA.debugLine="PanelInsumoSelect.Visible = False";
__ref._panelinsumoselect /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="ButtonDeleteInsumo.Visible = False";
__ref._buttondeleteinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=11927562;
 //BA.debugLineNum = 11927562;BA.debugLine="End Sub";
return "";
}
public String  _removeinsumofromdata(b4a.example.ef.formlabores __ref,int _insumoid) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeinsumofromdata", false))
	 {return ((String) Debug.delegate(ba, "removeinsumofromdata", new Object[] {_insumoid}));}
int _i = 0;
Object[] _arrayelement = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
_arrayelement = (Object[])(__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="If arrayElement(0) = insumoID Then";
if ((_arrayelement[(int) (0)]).equals((Object)(_insumoid))) { 
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="data.RemoveAt(i)";
__ref._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt(_i);
RDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="B4XTable1.SetData(data)";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,__ref._data /*anywheresoftware.b4a.objects.collections.List*/ );
 };
 }
};
RDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
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
RDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
_rowid = BA.ObjectToLongNumber(__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
RDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rowid);
RDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="Dim ID As String";
_id = "";
RDebugUtils.currentLine=12189709;
 //BA.debugLineNum = 12189709;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
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
RDebugUtils.currentLine=12189710;
 //BA.debugLineNum = 12189710;BA.debugLine="ID = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=12189712;
 //BA.debugLineNum = 12189712;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
_id = "No ID";
 if (true) break;

case 9:
//C
this.state = 10;
;
RDebugUtils.currentLine=12189716;
 //BA.debugLineNum = 12189716;BA.debugLine="Dim nombreInsu As String";
_nombreinsu = "";
RDebugUtils.currentLine=12189717;
 //BA.debugLineNum = 12189717;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
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
RDebugUtils.currentLine=12189718;
 //BA.debugLineNum = 12189718;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 if (true) break;

case 14:
//C
this.state = 15;
RDebugUtils.currentLine=12189720;
 //BA.debugLineNum = 12189720;BA.debugLine="nombreInsu = \"Desconocido\"";
_nombreinsu = "Desconocido";
 if (true) break;

case 15:
//C
this.state = 16;
;
RDebugUtils.currentLine=12189724;
 //BA.debugLineNum = 12189724;BA.debugLine="Dim cantidadInsu As Int";
_cantidadinsu = 0;
RDebugUtils.currentLine=12189725;
 //BA.debugLineNum = 12189725;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
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
RDebugUtils.currentLine=12189726;
 //BA.debugLineNum = 12189726;BA.debugLine="Try";
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
RDebugUtils.currentLine=12189727;
 //BA.debugLineNum = 12189727;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
RDebugUtils.currentLine=12189729;
 //BA.debugLineNum = 12189729;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
parent.__c.LogImpl("212189729","Fila "+BA.NumberToString((_i+1))+":",0);
RDebugUtils.currentLine=12189730;
 //BA.debugLineNum = 12189730;BA.debugLine="Log(\" - ID: \" & ID)";
parent.__c.LogImpl("212189730"," - ID: "+_id,0);
RDebugUtils.currentLine=12189731;
 //BA.debugLineNum = 12189731;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
parent.__c.LogImpl("212189731"," - NOMBRE: "+_nombreinsu,0);
RDebugUtils.currentLine=12189732;
 //BA.debugLineNum = 12189732;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
parent.__c.LogImpl("212189732"," - CANTIDAD: "+BA.NumberToString(_cantidadinsu),0);
RDebugUtils.currentLine=12189735;
 //BA.debugLineNum = 12189735;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12189736;
 //BA.debugLineNum = 12189736;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12189739;
 //BA.debugLineNum = 12189739;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborInsumo",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(_id),(Object)(_cantidadinsu)});
RDebugUtils.currentLine=12189742;
 //BA.debugLineNum = 12189742;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12189743;
 //BA.debugLineNum = 12189743;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 43;
return;
case 43:
//C
this.state = 24;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12189745;
 //BA.debugLineNum = 12189745;BA.debugLine="consecutivo  = consecutivo + 1";
__ref._consecutivo /*int*/  = (int) (__ref._consecutivo /*int*/ +1);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
RDebugUtils.currentLine=12189748;
 //BA.debugLineNum = 12189748;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
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
RDebugUtils.currentLine=12189751;
 //BA.debugLineNum = 12189751;BA.debugLine="cantidadInsu = 0";
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
RDebugUtils.currentLine=12189756;
 //BA.debugLineNum = 12189756;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=12189757;
 //BA.debugLineNum = 12189757;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=12189758;
 //BA.debugLineNum = 12189758;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=12189759;
 //BA.debugLineNum = 12189759;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=12189760;
 //BA.debugLineNum = 12189760;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=12189761;
 //BA.debugLineNum = 12189761;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12189763;
 //BA.debugLineNum = 12189763;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12189765;
 //BA.debugLineNum = 12189765;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12189766;
 //BA.debugLineNum = 12189766;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12189769;
 //BA.debugLineNum = 12189769;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._fechafmrto /*String*/ ),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=12189772;
 //BA.debugLineNum = 12189772;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12189773;
 //BA.debugLineNum = 12189773;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttoninsumo_click"), (Object)(_j));
this.state = 44;
return;
case 44:
//C
this.state = 29;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12189776;
 //BA.debugLineNum = 12189776;BA.debugLine="Try";
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
RDebugUtils.currentLine=12189777;
 //BA.debugLineNum = 12189777;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12189779;
 //BA.debugLineNum = 12189779;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 36:
//C
this.state = 37;
RDebugUtils.currentLine=12189782;
 //BA.debugLineNum = 12189782;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("212189782","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12189786;
 //BA.debugLineNum = 12189786;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("212189786","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12189791;
 //BA.debugLineNum = 12189791;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub GetDeviceName As String";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
RDebugUtils.currentLine=9306117;
 //BA.debugLineNum = 9306117;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborRiego",new Object[]{(Object)(__ref._consecutivo /*int*/ ),(Object)(__ref._tiporiego /*String*/ ),(Object)(__ref._procedenciariego /*String*/ ),(Object)(__ref._caudalriego /*String*/ ),(Object)(__ref._cantidadriego /*String*/ )});
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12255244;
 //BA.debugLineNum = 12255244;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12255247;
 //BA.debugLineNum = 12255247;BA.debugLine="Try";
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
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=12255251;
 //BA.debugLineNum = 12255251;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("212255251","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12255254;
 //BA.debugLineNum = 12255254;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("212255254","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
RDebugUtils.currentLine=12255258;
 //BA.debugLineNum = 12255258;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=12255259;
 //BA.debugLineNum = 12255259;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=12255260;
 //BA.debugLineNum = 12255260;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=12255261;
 //BA.debugLineNum = 12255261;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=12255262;
 //BA.debugLineNum = 12255262;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=12255263;
 //BA.debugLineNum = 12255263;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12255265;
 //BA.debugLineNum = 12255265;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12255267;
 //BA.debugLineNum = 12255267;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12255268;
 //BA.debugLineNum = 12255268;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12255271;
 //BA.debugLineNum = 12255271;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._fechafmrto /*String*/ ),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=12255274;
 //BA.debugLineNum = 12255274;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12255275;
 //BA.debugLineNum = 12255275;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonriego_click"), (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12255278;
 //BA.debugLineNum = 12255278;BA.debugLine="Try";
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
RDebugUtils.currentLine=12255279;
 //BA.debugLineNum = 12255279;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12255281;
 //BA.debugLineNum = 12255281;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=12255284;
 //BA.debugLineNum = 12255284;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("212255284","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12255288;
 //BA.debugLineNum = 12255288;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("212255288","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12255291;
 //BA.debugLineNum = 12255291;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_maxIdSiembra",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="If j5.Success Then";
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
RDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (null,_j5,"req_ultimoRegistro");
RDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
RDebugUtils.currentLine=12320781;
 //BA.debugLineNum = 12320781;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
RDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("212320782","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
RDebugUtils.currentLine=12320786;
 //BA.debugLineNum = 12320786;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("212320786","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=12320789;
 //BA.debugLineNum = 12320789;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
__ref._consecutivosiembra /*int*/  = (int) (_ultimoregistrosiembra+1);
RDebugUtils.currentLine=12320791;
 //BA.debugLineNum = 12320791;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("212320791",BA.NumberToString(__ref._consecutivosiembra /*int*/ ),0);
RDebugUtils.currentLine=12320796;
 //BA.debugLineNum = 12320796;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_laborSiembra",new Object[]{(Object)(__ref._consecutivosiembra /*int*/ ),(Object)(__ref._codigosiembra /*String*/ ),(Object)(__ref._distanciasiembra /*int*/ ),(Object)(__ref._toneladasemillasiembra /*int*/ ),(Object)(__ref._numeropaquetessiembra /*int*/ ),(Object)(__ref._procedenciasiembra /*String*/ ),(Object)(__ref._tipolabranzasiembra /*String*/ ),(Object)(__ref._bandereosiembra /*int*/ ),(Object)(__ref._numeromacollosiembra /*int*/ )});
RDebugUtils.currentLine=12320799;
 //BA.debugLineNum = 12320799;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12320800;
 //BA.debugLineNum = 12320800;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12320803;
 //BA.debugLineNum = 12320803;BA.debugLine="Try";
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
RDebugUtils.currentLine=12320804;
 //BA.debugLineNum = 12320804;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12320808;
 //BA.debugLineNum = 12320808;BA.debugLine="Log(\"Error al agregar datos: \" & LastException)";
parent.__c.LogImpl("212320808","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
RDebugUtils.currentLine=12320809;
 //BA.debugLineNum = 12320809;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("212320809","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=12320810;
 //BA.debugLineNum = 12320810;BA.debugLine="Log(\"Valores enviados: consecutivo=\" & consecut";
parent.__c.LogImpl("212320810","Valores enviados: consecutivo="+BA.NumberToString(__ref._consecutivo /*int*/ )+", codigoSiembra="+__ref._codigosiembra /*String*/ +", distanciaSiembra="+BA.NumberToString(__ref._distanciasiembra /*int*/ )+", toneladaSemillaSiembra="+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ )+", numeroPaquetesSiembra="+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ )+", procedenciaSiembra="+__ref._procedenciasiembra /*String*/ +", tipoLabranzaSiembra="+__ref._tipolabranzasiembra /*String*/ +", bandereoSiembra="+BA.NumberToString(__ref._bandereosiembra /*int*/ )+", numeroMacolloSiembra="+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
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
RDebugUtils.currentLine=12320818;
 //BA.debugLineNum = 12320818;BA.debugLine="Log(\"Excepción capturada: \" & LastException)";
parent.__c.LogImpl("212320818","Excepción capturada: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
RDebugUtils.currentLine=12320823;
 //BA.debugLineNum = 12320823;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
RDebugUtils.currentLine=12320824;
 //BA.debugLineNum = 12320824;BA.debugLine="user = Main.pUser";
__ref._user /*String*/  = parent._main._puser /*String*/ ;
RDebugUtils.currentLine=12320825;
 //BA.debugLineNum = 12320825;BA.debugLine="DeviceName = GetDeviceName";
__ref._devicename /*String*/  = __ref._getdevicename /*String*/ (null);
RDebugUtils.currentLine=12320826;
 //BA.debugLineNum = 12320826;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
RDebugUtils.currentLine=12320827;
 //BA.debugLineNum = 12320827;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
RDebugUtils.currentLine=12320828;
 //BA.debugLineNum = 12320828;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
__ref._fechaactual /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12320830;
 //BA.debugLineNum = 12320830;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
__ref._fechafmrto /*String*/  = parent.__c.DateTime.Date(_fecha);
RDebugUtils.currentLine=12320832;
 //BA.debugLineNum = 12320832;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=12320833;
 //BA.debugLineNum = 12320833;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=12320836;
 //BA.debugLineNum = 12320836;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_labor",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._fechafmrto /*String*/ ),(Object)("CA"),(Object)(__ref._tipolabor /*String*/ ),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._fechafin /*String*/ ),(Object)(__ref._elementogasto /*String*/ ),(Object)(__ref._arealabor /*int*/ ),(Object)(__ref._consecutivo /*int*/ ),parent.__c.Null,(Object)(__ref._arealote /*int*/ ),parent.__c.Null,(Object)(__ref._fechaactual /*String*/ ),(Object)(__ref._horasistema /*String*/ ),(Object)(__ref._user /*String*/ ),(Object)(__ref._devicename /*String*/ )});
RDebugUtils.currentLine=12320839;
 //BA.debugLineNum = 12320839;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=12320840;
 //BA.debugLineNum = 12320840;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "buttonsimbra_click"), (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=12320843;
 //BA.debugLineNum = 12320843;BA.debugLine="Try";
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
RDebugUtils.currentLine=12320844;
 //BA.debugLineNum = 12320844;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=12320846;
 //BA.debugLineNum = 12320846;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 30:
//C
this.state = 31;
RDebugUtils.currentLine=12320849;
 //BA.debugLineNum = 12320849;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("212320849","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
RDebugUtils.currentLine=12320853;
 //BA.debugLineNum = 12320853;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("212320853","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
RDebugUtils.currentLine=12320857;
 //BA.debugLineNum = 12320857;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="Private Label14Time As Label";
_label14time = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="Dim fechafmrto As String";
_fechafmrto = "";
RDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="Dim horaSistema As String";
_horasistema = "";
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="Private loteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="Private elementoLabor As String";
_elementolabor = "";
RDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="Private elementoGasto As String";
_elementogasto = "";
RDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="Private areaLabor As Int";
_arealabor = 0;
RDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="Private areaLote As Int";
_arealote = 0;
RDebugUtils.currentLine=9109525;
 //BA.debugLineNum = 9109525;BA.debugLine="Dim consecutivo As Int";
_consecutivo = 0;
RDebugUtils.currentLine=9109526;
 //BA.debugLineNum = 9109526;BA.debugLine="Private tipoLabor As String";
_tipolabor = "";
RDebugUtils.currentLine=9109527;
 //BA.debugLineNum = 9109527;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109528;
 //BA.debugLineNum = 9109528;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109529;
 //BA.debugLineNum = 9109529;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109530;
 //BA.debugLineNum = 9109530;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109531;
 //BA.debugLineNum = 9109531;BA.debugLine="Private SD_xComboBoxElemento As SD_xComboBox";
_sd_xcomboboxelemento = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109532;
 //BA.debugLineNum = 9109532;BA.debugLine="Private SD_xComboBoxTypeForm As SD_xComboBox";
_sd_xcomboboxtypeform = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109533;
 //BA.debugLineNum = 9109533;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=9109534;
 //BA.debugLineNum = 9109534;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=9109536;
 //BA.debugLineNum = 9109536;BA.debugLine="Private Panel2geral As Panel";
_panel2geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109537;
 //BA.debugLineNum = 9109537;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
_sd_xcomboboxtiporiego = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109539;
 //BA.debugLineNum = 9109539;BA.debugLine="Private Panel3geral As Panel";
_panel3geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109540;
 //BA.debugLineNum = 9109540;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
_sd_xcomboboxcodigovariedad = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109541;
 //BA.debugLineNum = 9109541;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
_sd_xcomboboxtipolabranza = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109543;
 //BA.debugLineNum = 9109543;BA.debugLine="Private cantidadInsumos As Int";
_cantidadinsumos = 0;
RDebugUtils.currentLine=9109545;
 //BA.debugLineNum = 9109545;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
_sd_xcomboboxinsumo = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=9109546;
 //BA.debugLineNum = 9109546;BA.debugLine="Private EditTextCantidadInsumo As EditText";
_edittextcantidadinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=9109547;
 //BA.debugLineNum = 9109547;BA.debugLine="Private ButtonAddInsumo As Button";
_buttonaddinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=9109548;
 //BA.debugLineNum = 9109548;BA.debugLine="Private ButtonDeleteInsumo As Button";
_buttondeleteinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=9109549;
 //BA.debugLineNum = 9109549;BA.debugLine="Private Panel0geral As Panel";
_panel0geral = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109551;
 //BA.debugLineNum = 9109551;BA.debugLine="Private IDINSUMO As String";
_idinsumo = "";
RDebugUtils.currentLine=9109552;
 //BA.debugLineNum = 9109552;BA.debugLine="Private NAMEINSUMO As String";
_nameinsumo = "";
RDebugUtils.currentLine=9109553;
 //BA.debugLineNum = 9109553;BA.debugLine="Private CANTINSUMO As String";
_cantinsumo = "";
RDebugUtils.currentLine=9109555;
 //BA.debugLineNum = 9109555;BA.debugLine="Private LabelCantidadInsumos As Label";
_labelcantidadinsumos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9109556;
 //BA.debugLineNum = 9109556;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4a.example.ef.b4xtable();
RDebugUtils.currentLine=9109557;
 //BA.debugLineNum = 9109557;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9109559;
 //BA.debugLineNum = 9109559;BA.debugLine="Private PanelInsumoSelect As Panel";
_panelinsumoselect = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109560;
 //BA.debugLineNum = 9109560;BA.debugLine="Private PanelTittleInsumo As Panel";
_paneltittleinsumo = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=9109561;
 //BA.debugLineNum = 9109561;BA.debugLine="Private LabelInsumoSelect As Label";
_labelinsumoselect = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=9109563;
 //BA.debugLineNum = 9109563;BA.debugLine="Dim idEliminarTabla As Int";
_ideliminartabla = 0;
RDebugUtils.currentLine=9109565;
 //BA.debugLineNum = 9109565;BA.debugLine="Dim tipoRiego As String";
_tiporiego = "";
RDebugUtils.currentLine=9109566;
 //BA.debugLineNum = 9109566;BA.debugLine="Dim procedenciaRiego As String";
_procedenciariego = "";
RDebugUtils.currentLine=9109567;
 //BA.debugLineNum = 9109567;BA.debugLine="Dim caudalRiego As String";
_caudalriego = "";
RDebugUtils.currentLine=9109568;
 //BA.debugLineNum = 9109568;BA.debugLine="Dim cantidadRiego As String";
_cantidadriego = "";
RDebugUtils.currentLine=9109570;
 //BA.debugLineNum = 9109570;BA.debugLine="Dim codigoSiembra As String";
_codigosiembra = "";
RDebugUtils.currentLine=9109571;
 //BA.debugLineNum = 9109571;BA.debugLine="Dim distanciaSiembra As Int";
_distanciasiembra = 0;
RDebugUtils.currentLine=9109572;
 //BA.debugLineNum = 9109572;BA.debugLine="Dim bandereoSiembra As Int";
_bandereosiembra = 0;
RDebugUtils.currentLine=9109573;
 //BA.debugLineNum = 9109573;BA.debugLine="Dim toneladaSemillaSiembra As Int";
_toneladasemillasiembra = 0;
RDebugUtils.currentLine=9109574;
 //BA.debugLineNum = 9109574;BA.debugLine="Dim procedenciaSiembra As String";
_procedenciasiembra = "";
RDebugUtils.currentLine=9109575;
 //BA.debugLineNum = 9109575;BA.debugLine="Dim tipoLabranzaSiembra As String";
_tipolabranzasiembra = "";
RDebugUtils.currentLine=9109576;
 //BA.debugLineNum = 9109576;BA.debugLine="Dim numeroPaquetesSiembra As Int";
_numeropaquetessiembra = 0;
RDebugUtils.currentLine=9109577;
 //BA.debugLineNum = 9109577;BA.debugLine="Dim numeroMacolloSiembra As Int";
_numeromacollosiembra = 0;
RDebugUtils.currentLine=9109579;
 //BA.debugLineNum = 9109579;BA.debugLine="Dim DeviceName As String";
_devicename = "";
RDebugUtils.currentLine=9109580;
 //BA.debugLineNum = 9109580;BA.debugLine="Dim user As String";
_user = "";
RDebugUtils.currentLine=9109582;
 //BA.debugLineNum = 9109582;BA.debugLine="Dim fechaActual As String";
_fechaactual = "";
RDebugUtils.currentLine=9109583;
 //BA.debugLineNum = 9109583;BA.debugLine="Dim consecutivoSiembra As Int";
_consecutivosiembra = 0;
RDebugUtils.currentLine=9109584;
 //BA.debugLineNum = 9109584;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumo(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createiteminsumo", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createiteminsumo", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub CreateItemInsumo As Panel";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
_panel.LoadLayout("FormInsumo",ba);
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="panel.Height=Panel0geral.Height";
_panel.setHeight(__ref._panel0geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemriego(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemriego", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemriego", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub CreateItemRiego As Panel";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
_panel.LoadLayout("FormRiego",ba);
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="panel.Height=Panel2geral.Height";
_panel.setHeight(__ref._panel2geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=9502730;
 //BA.debugLineNum = 9502730;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemsiembra(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "createitemsiembra", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(ba, "createitemsiembra", null));}
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Private Sub CreateItemSiembra As Panel";
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = __ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreatePanel(ba,"");
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
_panel.LoadLayout("FormSiembra",ba);
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="panel.Height=Panel3geral.Height";
_panel.setHeight(__ref._panel3geral /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
RDebugUtils.currentLine=9568267;
 //BA.debugLineNum = 9568267;BA.debugLine="End Sub";
return null;
}
public String  _edittextarealabor_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealabor_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealabor_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="areaLabor = New";
__ref._arealabor /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
__c.LogImpl("210354692","Area Labor "+BA.NumberToString(__ref._arealabor /*int*/ ),0);
RDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="End Sub";
return "";
}
public String  _edittextarealote_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextarealote_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextarealote_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="areaLote = New";
__ref._arealote /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Log(\"Area lote \" & areaLote )";
__c.LogImpl("210420228","Area lote "+BA.NumberToString(__ref._arealote /*int*/ ),0);
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="End Sub";
return "";
}
public String  _edittextbandereo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextbandereo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextbandereo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="bandereoSiembra = New";
__ref._bandereosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
__c.LogImpl("211141124","bandereo "+BA.NumberToString(__ref._bandereosiembra /*int*/ ),0);
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadagua_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadagua_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadagua_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="cantidadRiego = New";
__ref._cantidadriego /*String*/  = _new;
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
__c.LogImpl("210682371","cantidad"+__ref._cantidadriego /*String*/ ,0);
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadinsumo_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcantidadinsumo_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcantidadinsumo_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
RDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="ButtonAddInsumo.Enabled = True";
__ref._buttonaddinsumo /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setEnabled(__c.True);
RDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="CANTINSUMO = New";
__ref._cantinsumo /*String*/  = _new;
RDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="End Sub";
return "";
}
public String  _edittextcaudalaplicado_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextcaudalaplicado_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextcaudalaplicado_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="caudalRiego = New";
__ref._caudalriego /*String*/  = _new;
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Log(\"caudal\" & caudalRiego)";
__c.LogImpl("210616835","caudal"+__ref._caudalriego /*String*/ ,0);
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="End Sub";
return "";
}
public String  _edittextdistanciasiembra_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextdistanciasiembra_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextdistanciasiembra_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="distanciaSiembra = New";
__ref._distanciasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
__c.LogImpl("211075587","Distancia de siembra "+BA.NumberToString(__ref._distanciasiembra /*int*/ ),0);
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeromacollos_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeromacollos_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeromacollos_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
RDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="numeroMacolloSiembra = New";
__ref._numeromacollosiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
__c.LogImpl("211468803","numero de macollos "+BA.NumberToString(__ref._numeromacollosiembra /*int*/ ),0);
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeropaquetes_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextnumeropaquetes_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextnumeropaquetes_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
RDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="numeroPaquetesSiembra = New";
__ref._numeropaquetessiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
__c.LogImpl("211403268","numero de paquetes "+BA.NumberToString(__ref._numeropaquetessiembra /*int*/ ),0);
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedencia_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedencia_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedencia_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="procedenciaRiego = New";
__ref._procedenciariego /*String*/  = _new;
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
__c.LogImpl("210551300","procedencia"+__ref._procedenciariego /*String*/ ,0);
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedenciadestino_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittextprocedenciadestino_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittextprocedenciadestino_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="procedenciaSiembra = New";
__ref._procedenciasiembra /*String*/  = _new;
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
__c.LogImpl("211272195","procedencia "+__ref._procedenciasiembra /*String*/ ,0);
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="End Sub";
return "";
}
public String  _edittexttoneladasemilla_textchanged(b4a.example.ef.formlabores __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "edittexttoneladasemilla_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittexttoneladasemilla_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="toneladaSemillaSiembra = New";
__ref._toneladasemillasiembra /*int*/  = (int)(Double.parseDouble(_new));
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
__c.LogImpl("211206660","tonelada Semilla "+BA.NumberToString(__ref._toneladasemillasiembra /*int*/ ),0);
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="End Sub";
return "";
}
public String  _label13time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
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
public String  _label14time_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label14time_click", false))
	 {return ((String) Debug.delegate(ba, "label14time_click", null));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub Label14Time_Click";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Panel3.Visible = True";
__ref._panel3 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=12124161;
 //BA.debugLineNum = 12124161;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_insumosSort",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxinsumo"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
_cdgo_producto = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
_dscrpcion_producto = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=11665420;
 //BA.debugLineNum = 11665420;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
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
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("211665423","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoRiego",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=11534342;
 //BA.debugLineNum = 11534342;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=11534343;
 //BA.debugLineNum = 11534343;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxriego"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
_cdgo_tipo_riego = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
_dscrpcion_tipo_riego = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=11534348;
 //BA.debugLineNum = 11534348;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
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
RDebugUtils.currentLine=11534351;
 //BA.debugLineNum = 11534351;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("211534351","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=11534354;
 //BA.debugLineNum = 11534354;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=11599877;
 //BA.debugLineNum = 11599877;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_codVariedad",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=11599878;
 //BA.debugLineNum = 11599878;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=11599881;
 //BA.debugLineNum = 11599881;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=11599882;
 //BA.debugLineNum = 11599882;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
_cdgo_variedad = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
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
RDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("211599887","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
_cmdtipolabranza = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_tipoLabranza",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=11599894;
 //BA.debugLineNum = 11599894;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdtipolabranza,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=11599896;
 //BA.debugLineNum = 11599896;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
_req._handlejobasync /*void*/ (null,_j4,"req_TipoLabranza");
RDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
parent.__c.WaitFor("req_tipolabranza_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "llenarcomboboxsiembra"), (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=11599898;
 //BA.debugLineNum = 11599898;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
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
RDebugUtils.currentLine=11599899;
 //BA.debugLineNum = 11599899;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (0)]);
RDebugUtils.currentLine=11599900;
 //BA.debugLineNum = 11599900;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (1)]);
RDebugUtils.currentLine=11599901;
 //BA.debugLineNum = 11599901;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
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
RDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
parent.__c.LogImpl("211599904","Error en la consulta de Tipo_Labranza: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
RDebugUtils.currentLine=11599906;
 //BA.debugLineNum = 11599906;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=11599908;
 //BA.debugLineNum = 11599908;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub RemoveForm0IfExists";
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form0"))) { 
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="End Sub";
return "";
}
public String  _removeform2ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform2ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform2ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub RemoveForm2IfExists";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form2"))) { 
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=10878984;
 //BA.debugLineNum = 10878984;BA.debugLine="End Sub";
return "";
}
public String  _removeform3ifexists(b4a.example.ef.formlabores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "removeform3ifexists", false))
	 {return ((String) Debug.delegate(ba, "removeform3ifexists", null));}
int _i = 0;
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub RemoveForm3IfExists";
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
if ((__ref._customlistview1geral /*b4a.example3.customlistview*/ ._getvalue(_i)).equals((Object)("form3"))) { 
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._removeat(_i);
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxcodigovariedad_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxcodigovariedad_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxcodigovariedad_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="codigoSiembra = Value";
__ref._codigosiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
__c.LogImpl("211010051","codigo "+__ref._codigosiembra /*String*/ ,0);
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxelemento_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxelemento_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxelemento_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="elementoGasto = Value";
__ref._elementogasto /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, 3)";
__ref._elementogasto /*String*/  = __ref._elementogasto /*String*/ .substring((int) (0),(int) (3));
RDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="Log(\"Las dos primeras letras del Elemento Gasto s";
__c.LogImpl("210289161","Las dos primeras letras del Elemento Gasto son: "+__ref._elementogasto /*String*/ ,0);
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="haciendaCBX=Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10092556;
 //BA.debugLineNum = 10092556;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10092558;
 //BA.debugLineNum = 10092558;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10092559;
 //BA.debugLineNum = 10092559;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10092563;
 //BA.debugLineNum = 10092563;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10092564;
 //BA.debugLineNum = 10092564;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=10092567;
 //BA.debugLineNum = 10092567;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
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
RDebugUtils.currentLine=10092572;
 //BA.debugLineNum = 10092572;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("210092572","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=10092576;
 //BA.debugLineNum = 10092576;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10092579;
 //BA.debugLineNum = 10092579;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
parent.__c.LogImpl("210092579","Hacienda"+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=10092580;
 //BA.debugLineNum = 10092580;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
RDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
_partes = __c.Regex.Split(" - ",BA.ObjectToString(_value));
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="NAMEINSUMO = partes(0)";
__ref._nameinsumo /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="IDINSUMO = partes(1)";
__ref._idinsumo /*String*/  = _partes[(int) (1)];
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="elementoLabor = Value";
__ref._elementolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
__c.LogImpl("210223620","Elemento labor"+__ref._elementolabor /*String*/ ,0);
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="loteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
__c.LogImpl("210158083","Lotecbx"+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=10027019;
 //BA.debugLineNum = 10027019;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formlabores", "sd_xcomboboxnit_itemclick"), (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=10027026;
 //BA.debugLineNum = 10027026;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=10027027;
 //BA.debugLineNum = 10027027;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=10027028;
 //BA.debugLineNum = 10027028;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=10027031;
 //BA.debugLineNum = 10027031;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
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
RDebugUtils.currentLine=10027036;
 //BA.debugLineNum = 10027036;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("210027036","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
RDebugUtils.currentLine=10027039;
 //BA.debugLineNum = 10027039;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=10027042;
 //BA.debugLineNum = 10027042;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
parent.__c.LogImpl("210027042","Nit seleccionado"+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=10027043;
 //BA.debugLineNum = 10027043;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
RDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="tipoLabranzaSiembra = Value";
__ref._tipolabranzasiembra /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
__c.LogImpl("211337732","tipo labranza "+__ref._tipolabranzasiembra /*String*/ ,0);
RDebugUtils.currentLine=11337733;
 //BA.debugLineNum = 11337733;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtiporiego_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtiporiego_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtiporiego_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="tipoRiego = Value";
__ref._tiporiego /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
__c.LogImpl("210747907","tipo riego"+__ref._tiporiego /*String*/ ,0);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtypeform_itemclick(b4a.example.ef.formlabores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formlabores";
if (Debug.shouldDelegate(ba, "sd_xcomboboxtypeform_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxtypeform_itemclick", new Object[] {_position,_value}));}
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="tipoLabor = Value";
__ref._tipolabor /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="If IsNumber(Value) Then";
if (__c.IsNumber(BA.ObjectToString(_value))) { 
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)(0),(Object)(1),(Object)(2))) {
case 0: {
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="RemoveForm2IfExists";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createiteminsumo /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form0"));
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="LlenarComboBoxInsumo";
__ref._llenarcomboboxinsumo /*void*/ (null);
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
_insumocolum = __ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"#",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_numbers /*int*/ );
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = __c.DipToCurrent((int) (50));
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"ID",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=10485774;
 //BA.debugLineNum = 10485774;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"NOMBRE",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ (null,"CANTIDAD",__ref._b4xtable1 /*b4a.example.ef.b4xtable*/ ._column_type_text /*int*/ );
RDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="cantidadInsumos = 0";
__ref._cantidadinsumos /*int*/  = (int) (0);
RDebugUtils.currentLine=10485778;
 //BA.debugLineNum = 10485778;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
__ref._labelcantidadinsumos /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__ref._cantidadinsumos /*int*/ ));
RDebugUtils.currentLine=10485779;
 //BA.debugLineNum = 10485779;BA.debugLine="CANTINSUMO = \"\"";
__ref._cantinsumo /*String*/  = "";
 break; }
case 1: {
RDebugUtils.currentLine=10485781;
 //BA.debugLineNum = 10485781;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=10485782;
 //BA.debugLineNum = 10485782;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
__ref._removeform2ifexists /*String*/ (null);
RDebugUtils.currentLine=10485783;
 //BA.debugLineNum = 10485783;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemsiembra /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form3"));
RDebugUtils.currentLine=10485784;
 //BA.debugLineNum = 10485784;BA.debugLine="LlenarComboBoxSiembra";
__ref._llenarcomboboxsiembra /*void*/ (null);
 break; }
case 2: {
RDebugUtils.currentLine=10485786;
 //BA.debugLineNum = 10485786;BA.debugLine="RemoveForm0IfExists";
__ref._removeform0ifexists /*String*/ (null);
RDebugUtils.currentLine=10485787;
 //BA.debugLineNum = 10485787;BA.debugLine="RemoveForm3IfExists";
__ref._removeform3ifexists /*String*/ (null);
RDebugUtils.currentLine=10485788;
 //BA.debugLineNum = 10485788;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
__ref._customlistview1geral /*b4a.example3.customlistview*/ ._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__ref._createitemriego /*anywheresoftware.b4a.objects.PanelWrapper*/ (null).getObject())),(Object)("form2"));
RDebugUtils.currentLine=10485789;
 //BA.debugLineNum = 10485789;BA.debugLine="LlenarComboBoxRiego";
__ref._llenarcomboboxriego /*void*/ (null);
 break; }
default: {
RDebugUtils.currentLine=10485792;
 //BA.debugLineNum = 10485792;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
__c.LogImpl("210485792","Valor no reconocido: "+BA.ObjectToString(_value),0);
 break; }
}
;
 }else {
RDebugUtils.currentLine=10485795;
 //BA.debugLineNum = 10485795;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
__c.LogImpl("210485795","Error: Value no es un número válido.",0);
 };
RDebugUtils.currentLine=10485798;
 //BA.debugLineNum = 10485798;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
__c.LogImpl("210485798","Tipo labor "+__ref._tipolabor /*String*/ ,0);
RDebugUtils.currentLine=10485799;
 //BA.debugLineNum = 10485799;BA.debugLine="End Sub";
return "";
}
}