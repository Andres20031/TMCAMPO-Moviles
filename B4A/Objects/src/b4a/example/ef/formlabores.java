package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formlabores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.formlabores");
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
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
String[] _dateparts = null;
 //BA.debugLineNum = 279;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 281;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 284;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 287;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
 //BA.debugLineNum = 290;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
 //BA.debugLineNum = 292;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
 //BA.debugLineNum = 296;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 299;BA.debugLine="Label13Time.Text = formattedDate";
_label13time.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 302;BA.debugLine="Panel12.Visible = False";
_panel12.setVisible(__c.False);
 //BA.debugLineNum = 305;BA.debugLine="fechaInicio = formattedDate";
_fechainicio = _formatteddate;
 //BA.debugLineNum = 308;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
__c.LogImpl("712386333","Fecha inicio: "+_fechainicio,0);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
String[] _dateparts = null;
 //BA.debugLineNum = 312;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
 //BA.debugLineNum = 314;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 317;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 320;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
 //BA.debugLineNum = 323;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
 //BA.debugLineNum = 325;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
 //BA.debugLineNum = 329;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 332;BA.debugLine="Label14Time.Text = formattedDate";
_label14time.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 335;BA.debugLine="Panel3.Visible = False";
_panel3.setVisible(__c.False);
 //BA.debugLineNum = 338;BA.debugLine="fechaFin = formattedDate";
_fechafin = _formatteddate;
 //BA.debugLineNum = 341;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
__c.LogImpl("712451869","Fecha fin: "+_fechafin,0);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 104;BA.debugLine="utilClass.Initialize";
parent._utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 105;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
parent._utilclass._setstatusbarcolor /*String*/ (parent.__c.Colors.White,((int)0xb4008000));
 //BA.debugLineNum = 106;BA.debugLine="Root.LoadLayout(\"form\")";
parent._root.LoadLayout("form",ba);
 //BA.debugLineNum = 107;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
parent._customlistview1geral._defaulttextbackgroundcolor = ((int)0xff25253d);
 //BA.debugLineNum = 108;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
parent._customlistview1geral._defaulttextcolor = parent.__c.Colors.White;
 //BA.debugLineNum = 109;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem().getObject())),(Object)("form1"));
 //BA.debugLineNum = 111;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 112;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 115;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = parent._createcommand("select_nit",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 116;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 117;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 118;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 119;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 120;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 121;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 122;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 123;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
parent._sd_xcomboboxnit._add /*String*/ (_razonsocial+" - "+_nit,(Object)(_nit));
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
 //BA.debugLineNum = 126;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("711927575","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 131;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = parent._createcommand("select_labor_maq",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 132;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 133;BA.debugLine="If j3.Success Then";
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
 //BA.debugLineNum = 134;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (_j3,"req_labormaquina");
 //BA.debugLineNum = 135;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, this, (Object)(_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 136;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
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
 //BA.debugLineNum = 137;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
 //BA.debugLineNum = 138;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
 //BA.debugLineNum = 139;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
parent._sd_xcomboboxlabor._add /*String*/ (_descripcionlabormaquina,(Object)(_codigolabormaquina));
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
 //BA.debugLineNum = 142;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("711927591","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 144;BA.debugLine="j3.Release";
_j3._release /*String*/ ();
 //BA.debugLineNum = 148;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
_cmdelementogasto = parent._createcommand("select_elementoGasto",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 149;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdelementogasto,(int) (0),parent.__c.Null)));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 150;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 151;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
_req._handlejobasync /*void*/ (_j4,"req_elementoGasto");
 //BA.debugLineNum = 152;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
parent.__c.WaitFor("req_elementogasto_result", ba, this, (Object)(_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 153;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
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
 //BA.debugLineNum = 154;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
_codigoelementogasto = BA.ObjectToString(_rowelementogasto[(int) (0)]);
 //BA.debugLineNum = 155;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto[(int) (1)]);
 //BA.debugLineNum = 156;BA.debugLine="SD_xComboBoxElemento.Add(descripcionElementoGas";
parent._sd_xcomboboxelemento._add /*String*/ (_descripcionelementogasto,(Object)(_codigoelementogasto));
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
 //BA.debugLineNum = 159;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("711927608","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 161;BA.debugLine="j4.Release";
_j4._release /*String*/ ();
 //BA.debugLineNum = 166;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Insumo\",0)";
parent._sd_xcomboboxtypeform._add /*String*/ ("Insumo",(Object)(0));
 //BA.debugLineNum = 167;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Siembra\",1)";
parent._sd_xcomboboxtypeform._add /*String*/ ("Siembra",(Object)(1));
 //BA.debugLineNum = 168;BA.debugLine="SD_xComboBoxTypeForm.Add(\"Riego\",2)";
parent._sd_xcomboboxtypeform._add /*String*/ ("Riego",(Object)(2));
 //BA.debugLineNum = 170;BA.debugLine="data.Initialize";
parent._data.Initialize();
 //BA.debugLineNum = 173;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = parent._createcommand("select_maxIdLabor",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 174;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 176;BA.debugLine="If j5.Success Then";
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
 //BA.debugLineNum = 177;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (_j5,"req_ultimoRegistro");
 //BA.debugLineNum = 178;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, this, (Object)(_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 180;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
 //BA.debugLineNum = 181;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
_ultimoregistro = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
 //BA.debugLineNum = 182;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
parent.__c.LogImpl("711927631","Último Registro obtenido: "+BA.NumberToString(_ultimoregistro),0);
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
 //BA.debugLineNum = 186;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("711927635","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
 //BA.debugLineNum = 189;BA.debugLine="consecutivo = ultimoRegistro + 1";
parent._consecutivo = (int) (_ultimoregistro+1);
 //BA.debugLineNum = 191;BA.debugLine="Log(consecutivo)";
parent.__c.LogImpl("711927640",BA.NumberToString(parent._consecutivo),0);
 //BA.debugLineNum = 193;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = parent._createcommand("select_maxIdSiembra",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 194;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 196;BA.debugLine="If j5.Success Then";
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
 //BA.debugLineNum = 197;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (_j5,"req_ultimoRegistro");
 //BA.debugLineNum = 198;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, this, (Object)(_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 200;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
 //BA.debugLineNum = 201;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
 //BA.debugLineNum = 202;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("711927651","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
 //BA.debugLineNum = 206;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("711927655","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = -1;
;
 //BA.debugLineNum = 209;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
parent._consecutivosiembra = (int) (_ultimoregistrosiembra+1);
 //BA.debugLineNum = 211;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("711927660",BA.NumberToString(parent._consecutivosiembra),0);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public void  _req_labormaquina_result(b4a.example.ef.main._dbresult _reslabormaquina) throws Exception{
}
public void  _req_elementogasto_result(b4a.example.ef.main._dbresult _reselementogasto) throws Exception{
}
public void  _req_ultimoregistro_result(b4a.example.ef.main._dbresult _resultimoregistro) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 91;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _b4xtable1_cellclicked(String _columnid,long _rowid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowdata = null;
String _id = "";
String _nombreinsu = "";
int _cantidadinsu = 0;
 //BA.debugLineNum = 743;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
 //BA.debugLineNum = 744;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
__c.LogImpl("714548993","COLUM ID"+_columnid,0);
 //BA.debugLineNum = 745;BA.debugLine="Log(\"ROW ID\"&RowId)";
__c.LogImpl("714548994","ROW ID"+BA.NumberToString(_rowid),0);
 //BA.debugLineNum = 746;BA.debugLine="PanelTittleInsumo.Visible = True";
_paneltittleinsumo.setVisible(__c.True);
 //BA.debugLineNum = 747;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = _b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid);
 //BA.debugLineNum = 748;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 //BA.debugLineNum = 749;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 //BA.debugLineNum = 750;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
 //BA.debugLineNum = 751;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
_labelinsumoselect.setText(BA.ObjectToCharSequence("- "+_nombreinsu+" / "+"Cantidad: "+BA.NumberToString(_cantidadinsu)));
 //BA.debugLineNum = 752;BA.debugLine="PanelInsumoSelect.Visible = True";
_panelinsumoselect.setVisible(__c.True);
 //BA.debugLineNum = 753;BA.debugLine="ButtonDeleteInsumo.Visible = True";
_buttondeleteinsumo.setVisible(__c.True);
 //BA.debugLineNum = 755;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
_ideliminartabla = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("#"))));
 //BA.debugLineNum = 756;BA.debugLine="Log(idEliminarTabla)";
__c.LogImpl("714549005",BA.NumberToString(_ideliminartabla),0);
 //BA.debugLineNum = 757;BA.debugLine="End Sub";
return "";
}
public String  _buttonaddinsumo_click() throws Exception{
int _numberinsumo = 0;
 //BA.debugLineNum = 716;BA.debugLine="Private Sub ButtonAddInsumo_Click";
 //BA.debugLineNum = 717;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
if ((_nameinsumo).equals("") && (_idinsumo).equals("") && (_cantinsumo).equals("")) { 
 //BA.debugLineNum = 718;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo"),BA.ObjectToCharSequence("Error"),ba);
 }else {
 //BA.debugLineNum = 720;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
_cantidadinsumos = (int) (_cantidadinsumos+1);
 //BA.debugLineNum = 721;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
_numberinsumo = _cantidadinsumos;
 //BA.debugLineNum = 722;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
_data.Add((Object)(new Object[]{(Object)(_numberinsumo),(Object)(_idinsumo),(Object)(_nameinsumo),(Object)(_cantinsumo)}));
 //BA.debugLineNum = 723;BA.debugLine="B4XTable1.SetData(data)";
_b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_data);
 //BA.debugLineNum = 724;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
_labelcantidadinsumos.setText(BA.ObjectToCharSequence(_cantidadinsumos));
 //BA.debugLineNum = 725;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
_edittextcantidadinsumo.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return "";
}
public String  _buttondeleteinsumo_click() throws Exception{
 //BA.debugLineNum = 730;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
 //BA.debugLineNum = 732;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
_removeinsumofromdata(_ideliminartabla);
 //BA.debugLineNum = 734;BA.debugLine="ButtonDeleteInsumo.Visible = False";
_buttondeleteinsumo.setVisible(__c.False);
 //BA.debugLineNum = 735;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
_cantidadinsumos = (int) (_cantidadinsumos-1);
 //BA.debugLineNum = 736;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
_labelcantidadinsumos.setText(BA.ObjectToCharSequence(_cantidadinsumos));
 //BA.debugLineNum = 737;BA.debugLine="PanelTittleInsumo.Visible = False";
_paneltittleinsumo.setVisible(__c.False);
 //BA.debugLineNum = 738;BA.debugLine="PanelInsumoSelect.Visible = False";
_panelinsumoselect.setVisible(__c.False);
 //BA.debugLineNum = 739;BA.debugLine="ButtonDeleteInsumo.Visible = False";
_buttondeleteinsumo.setVisible(__c.False);
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return "";
}
public void  _buttoninsumo_click() throws Exception{
ResumableSub_ButtonInsumo_Click rsub = new ResumableSub_ButtonInsumo_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonInsumo_Click extends BA.ResumableSub {
public ResumableSub_ButtonInsumo_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 785;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
if (true) break;

case 1:
//for
this.state = 28;
step1 = 1;
limit1 = (int) (parent._b4xtable1._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
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
 //BA.debugLineNum = 787;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
_rowid = BA.ObjectToLongNumber(parent._b4xtable1._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 790;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid);
 //BA.debugLineNum = 793;BA.debugLine="Dim ID As String";
_id = "";
 //BA.debugLineNum = 794;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
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
 //BA.debugLineNum = 795;BA.debugLine="ID = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 797;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
_id = "No ID";
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 801;BA.debugLine="Dim nombreInsu As String";
_nombreinsu = "";
 //BA.debugLineNum = 802;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
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
 //BA.debugLineNum = 803;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 805;BA.debugLine="nombreInsu = \"Desconocido\"";
_nombreinsu = "Desconocido";
 if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 809;BA.debugLine="Dim cantidadInsu As Int";
_cantidadinsu = 0;
 //BA.debugLineNum = 810;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
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
 //BA.debugLineNum = 811;BA.debugLine="Try";
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
 //BA.debugLineNum = 812;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
 //BA.debugLineNum = 814;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
parent.__c.LogImpl("714745633","Fila "+BA.NumberToString((_i+1))+":",0);
 //BA.debugLineNum = 815;BA.debugLine="Log(\" - ID: \" & ID)";
parent.__c.LogImpl("714745634"," - ID: "+_id,0);
 //BA.debugLineNum = 816;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
parent.__c.LogImpl("714745635"," - NOMBRE: "+_nombreinsu,0);
 //BA.debugLineNum = 817;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
parent.__c.LogImpl("714745636"," - CANTIDAD: "+BA.NumberToString(_cantidadinsu),0);
 //BA.debugLineNum = 820;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 821;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 824;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
_cmd = parent._createcommand("insert_laborInsumo",new Object[]{(Object)(parent._consecutivo),(Object)(_id),(Object)(_cantidadinsu)});
 //BA.debugLineNum = 827;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 828;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 43;
return;
case 43:
//C
this.state = 24;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 830;BA.debugLine="consecutivo  = consecutivo + 1";
parent._consecutivo = (int) (parent._consecutivo+1);
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 0;
 //BA.debugLineNum = 833;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
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
 //BA.debugLineNum = 836;BA.debugLine="cantidadInsu = 0";
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
 //BA.debugLineNum = 841;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 842;BA.debugLine="user = Main.pUser";
parent._user = parent._main._puser /*String*/ ;
 //BA.debugLineNum = 843;BA.debugLine="DeviceName = GetDeviceName";
parent._devicename = parent._getdevicename();
 //BA.debugLineNum = 844;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 845;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 846;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
parent._fechaactual = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 848;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
parent._fechafmrto = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 850;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 851;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 854;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_labor",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)(parent._fechafmrto),(Object)("CA"),(Object)(parent._tipolabor),(Object)(parent._fechainicio),(Object)(parent._fechafin),(Object)(parent._elementogasto),(Object)(parent._arealabor),(Object)(parent._consecutivo),parent.__c.Null,(Object)(parent._arealote),parent.__c.Null,(Object)(parent._fechaactual),(Object)(parent._horasistema),(Object)(parent._user),(Object)(parent._devicename)});
 //BA.debugLineNum = 857;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 858;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 44;
return;
case 44:
//C
this.state = 29;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 861;BA.debugLine="Try";
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
 //BA.debugLineNum = 862;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 864;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 867;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("714745686","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 871;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("714745690","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 40:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
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
public void  _buttonriego_click() throws Exception{
ResumableSub_ButtonRiego_Click rsub = new ResumableSub_ButtonRiego_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonRiego_Click extends BA.ResumableSub {
public ResumableSub_ButtonRiego_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
long _fecha = 0L;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 884;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 885;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 888;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_laborRiego",new Object[]{(Object)(parent._consecutivo),(Object)(parent._tiporiego),(Object)(parent._procedenciariego),(Object)(parent._caudalriego),(Object)(parent._cantidadriego)});
 //BA.debugLineNum = 891;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 892;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 895;BA.debugLine="Try";
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
 //BA.debugLineNum = 896;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 897;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 899;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("714811155","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 902;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("714811158","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 //BA.debugLineNum = 906;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 907;BA.debugLine="user = Main.pUser";
parent._user = parent._main._puser /*String*/ ;
 //BA.debugLineNum = 908;BA.debugLine="DeviceName = GetDeviceName";
parent._devicename = parent._getdevicename();
 //BA.debugLineNum = 909;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 910;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 911;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
parent._fechaactual = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 913;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
parent._fechafmrto = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 915;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 916;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 919;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_labor",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)(parent._fechafmrto),(Object)("CA"),(Object)(parent._tipolabor),(Object)(parent._fechainicio),(Object)(parent._fechafin),(Object)(parent._elementogasto),(Object)(parent._arealabor),(Object)(parent._consecutivo),parent.__c.Null,(Object)(parent._arealote),parent.__c.Null,(Object)(parent._fechaactual),(Object)(parent._horasistema),(Object)(parent._user),(Object)(parent._devicename)});
 //BA.debugLineNum = 922;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 923;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 926;BA.debugLine="Try";
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
 //BA.debugLineNum = 927;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 929;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 932;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("714811188","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 936;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("714811192","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 939;BA.debugLine="End Sub";
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
public void  _buttonsimbra_click() throws Exception{
ResumableSub_ButtonSimbra_Click rsub = new ResumableSub_ButtonSimbra_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_ButtonSimbra_Click extends BA.ResumableSub {
public ResumableSub_ButtonSimbra_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
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

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 943;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 944;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 946;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = parent._createcommand("select_maxIdSiembra",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 947;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 949;BA.debugLine="If j5.Success Then";
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
 //BA.debugLineNum = 950;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (_j5,"req_ultimoRegistro");
 //BA.debugLineNum = 951;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, this, (Object)(_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 953;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
 //BA.debugLineNum = 954;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
 //BA.debugLineNum = 955;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("714876686","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
 //BA.debugLineNum = 959;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("714876690","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 962;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
parent._consecutivosiembra = (int) (_ultimoregistrosiembra+1);
 //BA.debugLineNum = 964;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("714876695",BA.NumberToString(parent._consecutivosiembra),0);
 //BA.debugLineNum = 969;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_laborSiembra",new Object[]{(Object)(parent._consecutivosiembra),(Object)(parent._codigosiembra),(Object)(parent._distanciasiembra),(Object)(parent._toneladasemillasiembra),(Object)(parent._numeropaquetessiembra),(Object)(parent._procedenciasiembra),(Object)(parent._tipolabranzasiembra),(Object)(parent._bandereosiembra),(Object)(parent._numeromacollosiembra)});
 //BA.debugLineNum = 972;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 973;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 976;BA.debugLine="Try";
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
 //BA.debugLineNum = 977;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 981;BA.debugLine="Log(\"Error al agregar datos: \" & LastException)";
parent.__c.LogImpl("714876712","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 982;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("714876713","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 //BA.debugLineNum = 983;BA.debugLine="Log(\"Valores enviados: consecutivo=\" & consecut";
parent.__c.LogImpl("714876714","Valores enviados: consecutivo="+BA.NumberToString(parent._consecutivo)+", codigoSiembra="+parent._codigosiembra+", distanciaSiembra="+BA.NumberToString(parent._distanciasiembra)+", toneladaSemillaSiembra="+BA.NumberToString(parent._toneladasemillasiembra)+", numeroPaquetesSiembra="+BA.NumberToString(parent._numeropaquetessiembra)+", procedenciaSiembra="+parent._procedenciasiembra+", tipoLabranzaSiembra="+parent._tipolabranzasiembra+", bandereoSiembra="+BA.NumberToString(parent._bandereosiembra)+", numeroMacolloSiembra="+BA.NumberToString(parent._numeromacollosiembra),0);
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
 //BA.debugLineNum = 991;BA.debugLine="Log(\"Excepción capturada: \" & LastException)";
parent.__c.LogImpl("714876722","Excepción capturada: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
 //BA.debugLineNum = 996;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 997;BA.debugLine="user = Main.pUser";
parent._user = parent._main._puser /*String*/ ;
 //BA.debugLineNum = 998;BA.debugLine="DeviceName = GetDeviceName";
parent._devicename = parent._getdevicename();
 //BA.debugLineNum = 999;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 1000;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 1001;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
parent._fechaactual = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 1003;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
parent._fechafmrto = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 1005;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 1006;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 1009;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_labor",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)(parent._fechafmrto),(Object)("CA"),(Object)(parent._tipolabor),(Object)(parent._fechainicio),(Object)(parent._fechafin),(Object)(parent._elementogasto),(Object)(parent._arealabor),(Object)(parent._consecutivo),parent.__c.Null,(Object)(parent._arealote),parent.__c.Null,(Object)(parent._fechaactual),(Object)(parent._horasistema),(Object)(parent._user),(Object)(parent._devicename)});
 //BA.debugLineNum = 1012;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 1013;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1016;BA.debugLine="Try";
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
 //BA.debugLineNum = 1017;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 1019;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 1022;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("714876753","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 1026;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("714876757","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 1030;BA.debugLine="End Sub";
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
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 5;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
 //BA.debugLineNum = 6;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Label14Time As Label";
_label14time = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 12;BA.debugLine="Dim fechaInicio As String";
_fechainicio = "";
 //BA.debugLineNum = 13;BA.debugLine="Dim fechaFin As String";
_fechafin = "";
 //BA.debugLineNum = 14;BA.debugLine="Dim fechafmrto As String";
_fechafmrto = "";
 //BA.debugLineNum = 15;BA.debugLine="Dim horaSistema As String";
_horasistema = "";
 //BA.debugLineNum = 17;BA.debugLine="Private loteCBX As String";
_lotecbx = "";
 //BA.debugLineNum = 18;BA.debugLine="Private elementoLabor As String";
_elementolabor = "";
 //BA.debugLineNum = 19;BA.debugLine="Private elementoGasto As String";
_elementogasto = "";
 //BA.debugLineNum = 20;BA.debugLine="Private areaLabor As Int";
_arealabor = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private areaLote As Int";
_arealote = 0;
 //BA.debugLineNum = 22;BA.debugLine="Dim consecutivo As Int";
_consecutivo = 0;
 //BA.debugLineNum = 23;BA.debugLine="Private tipoLabor As String";
_tipolabor = "";
 //BA.debugLineNum = 24;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 25;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 26;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 27;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 28;BA.debugLine="Private SD_xComboBoxElemento As SD_xComboBox";
_sd_xcomboboxelemento = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 29;BA.debugLine="Private SD_xComboBoxTypeForm As SD_xComboBox";
_sd_xcomboboxtypeform = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 30;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
 //BA.debugLineNum = 31;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
 //BA.debugLineNum = 33;BA.debugLine="Private Panel2geral As Panel";
_panel2geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
_sd_xcomboboxtiporiego = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 36;BA.debugLine="Private Panel3geral As Panel";
_panel3geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
_sd_xcomboboxcodigovariedad = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 38;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
_sd_xcomboboxtipolabranza = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 40;BA.debugLine="Private cantidadInsumos As Int";
_cantidadinsumos = 0;
 //BA.debugLineNum = 42;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
_sd_xcomboboxinsumo = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 43;BA.debugLine="Private EditTextCantidadInsumo As EditText";
_edittextcantidadinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private ButtonAddInsumo As Button";
_buttonaddinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private ButtonDeleteInsumo As Button";
_buttondeleteinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private Panel0geral As Panel";
_panel0geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private IDINSUMO As String";
_idinsumo = "";
 //BA.debugLineNum = 49;BA.debugLine="Private NAMEINSUMO As String";
_nameinsumo = "";
 //BA.debugLineNum = 50;BA.debugLine="Private CANTINSUMO As String";
_cantinsumo = "";
 //BA.debugLineNum = 52;BA.debugLine="Private LabelCantidadInsumos As Label";
_labelcantidadinsumos = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4a.example.ef.b4xtable();
 //BA.debugLineNum = 54;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 56;BA.debugLine="Private PanelInsumoSelect As Panel";
_panelinsumoselect = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private PanelTittleInsumo As Panel";
_paneltittleinsumo = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private LabelInsumoSelect As Label";
_labelinsumoselect = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Dim idEliminarTabla As Int";
_ideliminartabla = 0;
 //BA.debugLineNum = 62;BA.debugLine="Dim tipoRiego As String";
_tiporiego = "";
 //BA.debugLineNum = 63;BA.debugLine="Dim procedenciaRiego As String";
_procedenciariego = "";
 //BA.debugLineNum = 64;BA.debugLine="Dim caudalRiego As String";
_caudalriego = "";
 //BA.debugLineNum = 65;BA.debugLine="Dim cantidadRiego As String";
_cantidadriego = "";
 //BA.debugLineNum = 67;BA.debugLine="Dim codigoSiembra As String";
_codigosiembra = "";
 //BA.debugLineNum = 68;BA.debugLine="Dim distanciaSiembra As Int";
_distanciasiembra = 0;
 //BA.debugLineNum = 69;BA.debugLine="Dim bandereoSiembra As Int";
_bandereosiembra = 0;
 //BA.debugLineNum = 70;BA.debugLine="Dim toneladaSemillaSiembra As Int";
_toneladasemillasiembra = 0;
 //BA.debugLineNum = 71;BA.debugLine="Dim procedenciaSiembra As String";
_procedenciasiembra = "";
 //BA.debugLineNum = 72;BA.debugLine="Dim tipoLabranzaSiembra As String";
_tipolabranzasiembra = "";
 //BA.debugLineNum = 73;BA.debugLine="Dim numeroPaquetesSiembra As Int";
_numeropaquetessiembra = 0;
 //BA.debugLineNum = 74;BA.debugLine="Dim numeroMacolloSiembra As Int";
_numeromacollosiembra = 0;
 //BA.debugLineNum = 76;BA.debugLine="Dim DeviceName As String";
_devicename = "";
 //BA.debugLineNum = 77;BA.debugLine="Dim user As String";
_user = "";
 //BA.debugLineNum = 79;BA.debugLine="Dim fechaActual As String";
_fechaactual = "";
 //BA.debugLineNum = 80;BA.debugLine="Dim consecutivoSiembra As Int";
_consecutivosiembra = 0;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 346;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 347;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 348;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 349;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 350;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 351;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 216;BA.debugLine="Private Sub CreateItem As Panel";
 //BA.debugLineNum = 218;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 219;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 222;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
_panel.LoadLayout("addLaboresUI",ba);
 //BA.debugLineNum = 224;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(_panel1geral.getHeight());
 //BA.debugLineNum = 226;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumo() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 256;BA.debugLine="Private Sub CreateItemInsumo As Panel";
 //BA.debugLineNum = 258;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 259;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 262;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
_panel.LoadLayout("FormInsumo",ba);
 //BA.debugLineNum = 264;BA.debugLine="panel.Height=Panel0geral.Height";
_panel.setHeight(_panel0geral.getHeight());
 //BA.debugLineNum = 266;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemriego() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 230;BA.debugLine="Private Sub CreateItemRiego As Panel";
 //BA.debugLineNum = 232;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 233;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 236;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
_panel.LoadLayout("FormRiego",ba);
 //BA.debugLineNum = 238;BA.debugLine="panel.Height=Panel2geral.Height";
_panel.setHeight(_panel2geral.getHeight());
 //BA.debugLineNum = 240;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemsiembra() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 243;BA.debugLine="Private Sub CreateItemSiembra As Panel";
 //BA.debugLineNum = 245;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 246;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 249;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
_panel.LoadLayout("FormSiembra",ba);
 //BA.debugLineNum = 251;BA.debugLine="panel.Height=Panel3geral.Height";
_panel.setHeight(_panel3geral.getHeight());
 //BA.debugLineNum = 253;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public String  _edittextarealabor_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
 //BA.debugLineNum = 461;BA.debugLine="areaLabor = New";
_arealabor = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 463;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
__c.LogImpl("712910596","Area Labor "+BA.NumberToString(_arealabor),0);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return "";
}
public String  _edittextarealote_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 467;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
 //BA.debugLineNum = 469;BA.debugLine="areaLote = New";
_arealote = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 471;BA.debugLine="Log(\"Area lote \" & areaLote )";
__c.LogImpl("712976132","Area lote "+BA.NumberToString(_arealote),0);
 //BA.debugLineNum = 472;BA.debugLine="End Sub";
return "";
}
public String  _edittextbandereo_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
 //BA.debugLineNum = 589;BA.debugLine="bandereoSiembra = New";
_bandereosiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 591;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
__c.LogImpl("713697028","bandereo "+BA.NumberToString(_bandereosiembra),0);
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadagua_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
 //BA.debugLineNum = 529;BA.debugLine="cantidadRiego = New";
_cantidadriego = _new;
 //BA.debugLineNum = 531;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
__c.LogImpl("713238275","cantidad"+_cantidadriego,0);
 //BA.debugLineNum = 533;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadinsumo_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 711;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
 //BA.debugLineNum = 712;BA.debugLine="ButtonAddInsumo.Enabled = True";
_buttonaddinsumo.setEnabled(__c.True);
 //BA.debugLineNum = 713;BA.debugLine="CANTINSUMO = New";
_cantinsumo = _new;
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return "";
}
public String  _edittextcaudalaplicado_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 522;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
 //BA.debugLineNum = 523;BA.debugLine="caudalRiego = New";
_caudalriego = _new;
 //BA.debugLineNum = 525;BA.debugLine="Log(\"caudal\" & caudalRiego)";
__c.LogImpl("713172739","caudal"+_caudalriego,0);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return "";
}
public String  _edittextdistanciasiembra_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 581;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
 //BA.debugLineNum = 582;BA.debugLine="distanciaSiembra = New";
_distanciasiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 584;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
__c.LogImpl("713631491","Distancia de siembra "+BA.NumberToString(_distanciasiembra),0);
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeromacollos_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 621;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
 //BA.debugLineNum = 622;BA.debugLine="numeroMacolloSiembra = New";
_numeromacollosiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 624;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
__c.LogImpl("714024707","numero de macollos "+BA.NumberToString(_numeromacollosiembra),0);
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeropaquetes_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 614;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
 //BA.debugLineNum = 616;BA.debugLine="numeroPaquetesSiembra = New";
_numeropaquetessiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 618;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
__c.LogImpl("713959172","numero de paquetes "+BA.NumberToString(_numeropaquetessiembra),0);
 //BA.debugLineNum = 619;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedencia_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 515;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
 //BA.debugLineNum = 517;BA.debugLine="procedenciaRiego = New";
_procedenciariego = _new;
 //BA.debugLineNum = 519;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
__c.LogImpl("713107204","procedencia"+_procedenciariego,0);
 //BA.debugLineNum = 520;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedenciadestino_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 601;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
 //BA.debugLineNum = 602;BA.debugLine="procedenciaSiembra = New";
_procedenciasiembra = _new;
 //BA.debugLineNum = 604;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
__c.LogImpl("713828099","procedencia "+_procedenciasiembra,0);
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return "";
}
public String  _edittexttoneladasemilla_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 594;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
 //BA.debugLineNum = 596;BA.debugLine="toneladaSemillaSiembra = New";
_toneladasemillasiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 598;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
__c.LogImpl("713762564","tonelada Semilla "+BA.NumberToString(_toneladasemillasiembra),0);
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return "";
}
public String  _getdevicename() throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
String _manufacturer = "";
String _model = "";
 //BA.debugLineNum = 96;BA.debugLine="Sub GetDeviceName As String";
 //BA.debugLineNum = 97;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 98;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
 //BA.debugLineNum = 99;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
 //BA.debugLineNum = 100;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 84;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _label13time_click() throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Private Sub Label13Time_Click";
 //BA.debugLineNum = 272;BA.debugLine="Panel12.Visible = True";
_panel12.setVisible(__c.True);
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _label14time_click() throws Exception{
 //BA.debugLineNum = 275;BA.debugLine="Private Sub Label14Time_Click";
 //BA.debugLineNum = 276;BA.debugLine="Panel3.Visible = True";
_panel3.setVisible(__c.True);
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 776;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 777;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 778;BA.debugLine="End Sub";
return "";
}
public void  _llenarcomboboxinsumo() throws Exception{
ResumableSub_LlenarComboBoxInsumo rsub = new ResumableSub_LlenarComboBoxInsumo(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxInsumo extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxInsumo(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 686;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 687;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 689;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
_cmd = parent._createcommand("select_insumosSort",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 690;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 691;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 692;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 693;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 694;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 695;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
_cdgo_producto = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 696;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
_dscrpcion_producto = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 697;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
parent._sd_xcomboboxinsumo._add /*String*/ (_dscrpcion_producto,(Object)(_dscrpcion_producto+" - "+_cdgo_producto));
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
 //BA.debugLineNum = 700;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("714221327","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 703;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxriego() throws Exception{
ResumableSub_LlenarComboBoxRiego rsub = new ResumableSub_LlenarComboBoxRiego(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxRiego extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxRiego(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 628;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 629;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 631;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
_cmd = parent._createcommand("select_tipoRiego",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 632;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 633;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 634;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 635;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 636;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 637;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
_cdgo_tipo_riego = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 638;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
_dscrpcion_tipo_riego = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 639;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
parent._sd_xcomboboxtiporiego._add /*String*/ (_dscrpcion_tipo_riego,(Object)(_cdgo_tipo_riego));
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
 //BA.debugLineNum = 642;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("714090255","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _llenarcomboboxsiembra() throws Exception{
ResumableSub_LlenarComboBoxSiembra rsub = new ResumableSub_LlenarComboBoxSiembra(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LlenarComboBoxSiembra extends BA.ResumableSub {
public ResumableSub_LlenarComboBoxSiembra(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 648;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 649;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 652;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
_cmd = parent._createcommand("select_codVariedad",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 653;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 654;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 655;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 656;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 657;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 658;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
_cdgo_variedad = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 659;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
parent._sd_xcomboboxcodigovariedad._add /*String*/ (_cdgo_variedad,(Object)(_cdgo_variedad));
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
 //BA.debugLineNum = 662;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("714155791","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 664;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 668;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
_cmdtipolabranza = parent._createcommand("select_tipoLabranza",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 669;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdtipolabranza,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 670;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 671;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
_req._handlejobasync /*void*/ (_j4,"req_TipoLabranza");
 //BA.debugLineNum = 672;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
parent.__c.WaitFor("req_tipolabranza_result", ba, this, (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 673;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
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
 //BA.debugLineNum = 674;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (0)]);
 //BA.debugLineNum = 675;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (1)]);
 //BA.debugLineNum = 676;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
parent._sd_xcomboboxtipolabranza._add /*String*/ (_dscrpcion_tipo_labranza,(Object)(_cdgo_tipo_labranza));
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
 //BA.debugLineNum = 679;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
parent.__c.LogImpl("714155808","Error en la consulta de Tipo_Labranza: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 681;BA.debugLine="j4.Release";
_j4._release /*String*/ ();
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _req_tipolabranza_result(b4a.example.ef.main._dbresult _restipolabranza) throws Exception{
}
public String  _removeform0ifexists() throws Exception{
int _i = 0;
 //BA.debugLineNum = 543;BA.debugLine="Private Sub RemoveForm0IfExists";
 //BA.debugLineNum = 545;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_customlistview1geral._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 546;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
if ((_customlistview1geral._getvalue(_i)).equals((Object)("form0"))) { 
 //BA.debugLineNum = 547;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
_customlistview1geral._removeat(_i);
 //BA.debugLineNum = 548;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return "";
}
public String  _removeform2ifexists() throws Exception{
int _i = 0;
 //BA.debugLineNum = 554;BA.debugLine="Private Sub RemoveForm2IfExists";
 //BA.debugLineNum = 556;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_customlistview1geral._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 557;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
if ((_customlistview1geral._getvalue(_i)).equals((Object)("form2"))) { 
 //BA.debugLineNum = 558;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
_customlistview1geral._removeat(_i);
 //BA.debugLineNum = 559;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public String  _removeform3ifexists() throws Exception{
int _i = 0;
 //BA.debugLineNum = 564;BA.debugLine="Private Sub RemoveForm3IfExists";
 //BA.debugLineNum = 566;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_customlistview1geral._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 567;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
if ((_customlistview1geral._getvalue(_i)).equals((Object)("form3"))) { 
 //BA.debugLineNum = 568;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
_customlistview1geral._removeat(_i);
 //BA.debugLineNum = 569;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return "";
}
public String  _removeinsumofromdata(int _insumoid) throws Exception{
int _i = 0;
Object[] _arrayelement = null;
 //BA.debugLineNum = 760;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
 //BA.debugLineNum = 762;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_data.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 764;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
_arrayelement = (Object[])(_data.Get(_i));
 //BA.debugLineNum = 767;BA.debugLine="If arrayElement(0) = insumoID Then";
if ((_arrayelement[(int) (0)]).equals((Object)(_insumoid))) { 
 //BA.debugLineNum = 769;BA.debugLine="data.RemoveAt(i)";
_data.RemoveAt(_i);
 //BA.debugLineNum = 770;BA.debugLine="B4XTable1.SetData(data)";
_b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_data);
 };
 }
};
 //BA.debugLineNum = 774;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxcodigovariedad_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 575;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
 //BA.debugLineNum = 576;BA.debugLine="codigoSiembra = Value";
_codigosiembra = BA.ObjectToString(_value);
 //BA.debugLineNum = 578;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
__c.LogImpl("713565955","codigo "+_codigosiembra,0);
 //BA.debugLineNum = 579;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxelemento_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
 //BA.debugLineNum = 445;BA.debugLine="elementoGasto = Value";
_elementogasto = BA.ObjectToString(_value);
 //BA.debugLineNum = 448;BA.debugLine="If elementoGasto.Length > 0 Then";
if (_elementogasto.length()>0) { 
 //BA.debugLineNum = 449;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, Min(";
_elementogasto = _elementogasto.substring((int) (0),(int) (__c.Min(2,_elementogasto.length())));
 }else {
 //BA.debugLineNum = 451;BA.debugLine="elementoGasto = \"\" ' Si está vacío, asignar cade";
_elementogasto = "";
 };
 //BA.debugLineNum = 455;BA.debugLine="Log(\"Las dos primeras letras (o menos si no hay s";
__c.LogImpl("712845069","Las dos primeras letras (o menos si no hay suficientes): "+_elementogasto,0);
 //BA.debugLineNum = 457;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(int _position,Object _value) throws Exception{
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formlabores parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 392;BA.debugLine="haciendaCBX=Value";
parent._haciendacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 394;BA.debugLine="SD_xComboBoxLote.Clear";
parent._sd_xcomboboxlote._clear /*String*/ ();
 //BA.debugLineNum = 395;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 396;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 397;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 400;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 403;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 405;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 406;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 410;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 411;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 414;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
parent._sd_xcomboboxlote._add /*String*/ (_codg_hacienda,(Object)(_codg_hacienda));
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
 //BA.debugLineNum = 419;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("712648476","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 423;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 426;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
parent.__c.LogImpl("712648483","Hacienda"+parent._haciendacbx,0);
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxinsumo_itemclick(int _position,Object _value) throws Exception{
String[] _partes = null;
 //BA.debugLineNum = 705;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
 //BA.debugLineNum = 706;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
_partes = __c.Regex.Split(" - ",BA.ObjectToString(_value));
 //BA.debugLineNum = 707;BA.debugLine="NAMEINSUMO = partes(0)";
_nameinsumo = _partes[(int) (0)];
 //BA.debugLineNum = 708;BA.debugLine="IDINSUMO = partes(1)";
_idinsumo = _partes[(int) (1)];
 //BA.debugLineNum = 709;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
 //BA.debugLineNum = 437;BA.debugLine="elementoLabor = Value";
_elementolabor = BA.ObjectToString(_value);
 //BA.debugLineNum = 439;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
__c.LogImpl("712779524","Elemento labor"+_elementolabor,0);
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
 //BA.debugLineNum = 431;BA.debugLine="loteCBX = Value";
_lotecbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 432;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
__c.LogImpl("712713987","Lotecbx"+_lotecbx,0);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnit_itemclick(int _position,Object _value) throws Exception{
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(this,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formlabores parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 355;BA.debugLine="nitEmpresaCBX=Value";
parent._nitempresacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 356;BA.debugLine="SD_xComboBoxHacienda.Clear";
parent._sd_xcomboboxhacienda._clear /*String*/ ();
 //BA.debugLineNum = 357;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 358;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 359;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",new Object[]{_value});
 //BA.debugLineNum = 362;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 365;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 367;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 368;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 372;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 373;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 374;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 377;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
parent._sd_xcomboboxhacienda._add /*String*/ (_nombrehacienda,(Object)(_codg_hacienda));
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
 //BA.debugLineNum = 382;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("712582940","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 385;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 388;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
parent.__c.LogImpl("712582946","Nit seleccionado"+parent._nitempresacbx,0);
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxtipolabranza_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 607;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
 //BA.debugLineNum = 609;BA.debugLine="tipoLabranzaSiembra = Value";
_tipolabranzasiembra = BA.ObjectToString(_value);
 //BA.debugLineNum = 611;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
__c.LogImpl("713893636","tipo labranza "+_tipolabranzasiembra,0);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtiporiego_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 535;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
 //BA.debugLineNum = 536;BA.debugLine="tipoRiego = Value";
_tiporiego = BA.ObjectToString(_value);
 //BA.debugLineNum = 538;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
__c.LogImpl("713303811","tipo riego"+_tiporiego,0);
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtypeform_itemclick(int _position,Object _value) throws Exception{
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;
 //BA.debugLineNum = 474;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
 //BA.debugLineNum = 476;BA.debugLine="tipoLabor = Value";
_tipolabor = BA.ObjectToString(_value);
 //BA.debugLineNum = 478;BA.debugLine="If IsNumber(Value) Then";
if (__c.IsNumber(BA.ObjectToString(_value))) { 
 //BA.debugLineNum = 479;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)(0),(Object)(1),(Object)(2))) {
case 0: {
 //BA.debugLineNum = 481;BA.debugLine="RemoveForm2IfExists";
_removeform2ifexists();
 //BA.debugLineNum = 482;BA.debugLine="RemoveForm3IfExists";
_removeform3ifexists();
 //BA.debugLineNum = 483;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
_customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createiteminsumo().getObject())),(Object)("form0"));
 //BA.debugLineNum = 484;BA.debugLine="LlenarComboBoxInsumo";
_llenarcomboboxinsumo();
 //BA.debugLineNum = 485;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
_insumocolum = _b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("#",_b4xtable1._column_type_numbers /*int*/ );
 //BA.debugLineNum = 486;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 487;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
_b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("ID",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 488;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
_b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("NOMBRE",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 489;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
_b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("CANTIDAD",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 491;BA.debugLine="cantidadInsumos = 0";
_cantidadinsumos = (int) (0);
 //BA.debugLineNum = 492;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
_labelcantidadinsumos.setText(BA.ObjectToCharSequence(_cantidadinsumos));
 //BA.debugLineNum = 493;BA.debugLine="CANTINSUMO = \"\"";
_cantinsumo = "";
 break; }
case 1: {
 //BA.debugLineNum = 495;BA.debugLine="RemoveForm0IfExists";
_removeform0ifexists();
 //BA.debugLineNum = 496;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
_removeform2ifexists();
 //BA.debugLineNum = 497;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
_customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitemsiembra().getObject())),(Object)("form3"));
 //BA.debugLineNum = 498;BA.debugLine="LlenarComboBoxSiembra";
_llenarcomboboxsiembra();
 break; }
case 2: {
 //BA.debugLineNum = 500;BA.debugLine="RemoveForm0IfExists";
_removeform0ifexists();
 //BA.debugLineNum = 501;BA.debugLine="RemoveForm3IfExists";
_removeform3ifexists();
 //BA.debugLineNum = 502;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
_customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitemriego().getObject())),(Object)("form2"));
 //BA.debugLineNum = 503;BA.debugLine="LlenarComboBoxRiego";
_llenarcomboboxriego();
 break; }
default: {
 //BA.debugLineNum = 506;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
__c.LogImpl("713041696","Valor no reconocido: "+BA.ObjectToString(_value),0);
 break; }
}
;
 }else {
 //BA.debugLineNum = 509;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
__c.LogImpl("713041699","Error: Value no es un número válido.",0);
 };
 //BA.debugLineNum = 512;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
__c.LogImpl("713041702","Tipo labor "+_tipolabor,0);
 //BA.debugLineNum = 513;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
