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
public b4a.example.ef.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public b4a.example.ef.swiftbutton _swiftbuttonnit = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatenit = null;
public b4a.example.ef.swiftbutton _swiftbuttonhacienda = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatehacienda = null;
public b4a.example.ef.swiftbutton _swiftbuttonlote = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatelote = null;
public b4a.example.ef.swiftbutton _swiftbuttonlabor = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatelabor = null;
public b4a.example.ef.swiftbutton _swiftbuttonelemento = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateelemento = null;
public b4a.example.ef.swiftbutton _swiftbuttontypeform = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatetypeform = null;
public b4a.example.ef.swiftbutton _swiftbuttoninsumo = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateinsumo = null;
public b4a.example.ef.swiftbutton _swiftbuttonriego = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateriego = null;
public b4a.example.ef.swiftbutton _swiftbuttontipolabranza = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatetipolabranza = null;
public b4a.example.ef.swiftbutton _swiftbuttonvariedad = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatevariedad = null;
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
 //BA.debugLineNum = 354;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 356;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 357;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 360;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 363;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
 //BA.debugLineNum = 366;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
 //BA.debugLineNum = 368;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
 //BA.debugLineNum = 372;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 375;BA.debugLine="Label13Time.Text = formattedDate";
_label13time.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 378;BA.debugLine="Panel12.Visible = False";
_panel12.setVisible(__c.False);
 //BA.debugLineNum = 381;BA.debugLine="fechaInicio = formattedDate";
_fechainicio = _formatteddate;
 //BA.debugLineNum = 384;BA.debugLine="Log(\"Fecha inicio: \" & fechaInicio)";
__c.LogImpl("761079582","Fecha inicio: "+_fechainicio,0);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
String[] _dateparts = null;
 //BA.debugLineNum = 387;BA.debugLine="Private Sub AS_DatePicker2_SelectedDateChanged(Dat";
 //BA.debugLineNum = 389;BA.debugLine="DateTime.DateFormat = \"dd-MM-yyyy\"";
__c.DateTime.setDateFormat("dd-MM-yyyy");
 //BA.debugLineNum = 390;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 393;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 396;BA.debugLine="Dim dateParts() As String = Regex.Split(\"-\", form";
_dateparts = __c.Regex.Split("-",_formatteddate);
 //BA.debugLineNum = 399;BA.debugLine="If dateParts.Length = 3 Then";
if (_dateparts.length==3) { 
 //BA.debugLineNum = 401;BA.debugLine="formattedDate = dateParts(2) & \"-\" & dateParts(1";
_formatteddate = _dateparts[(int) (2)]+"-"+_dateparts[(int) (1)]+"-"+_dateparts[(int) (0)];
 };
 //BA.debugLineNum = 405;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 408;BA.debugLine="Label14Time.Text = formattedDate";
_label14time.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 411;BA.debugLine="Panel3.Visible = False";
_panel3.setVisible(__c.False);
 //BA.debugLineNum = 414;BA.debugLine="fechaFin = formattedDate";
_fechafin = _formatteddate;
 //BA.debugLineNum = 417;BA.debugLine="Log(\"Fecha fin: \" & fechaFin)";
__c.LogImpl("761145118","Fecha fin: "+_fechafin,0);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.List _itemsnit = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _razonsocial = "";
String _nit = "";
anywheresoftware.b4a.objects.collections.List _itemslabor = null;
b4a.example.ef.main._dbcommand _cmdlabormaquina = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reslabormaquina = null;
Object[] _rowlabormaquina = null;
String _codigolabormaquina = "";
String _descripcionlabormaquina = "";
anywheresoftware.b4a.objects.collections.List _itemselemento = null;
b4a.example.ef.main._dbcommand _cmdelementogasto = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _reselementogasto = null;
Object[] _rowelementogasto = null;
String _codigoelementogasto = "";
String _descripcionelementogasto = "";
anywheresoftware.b4a.objects.collections.List _itemstypeform = null;
b4a.example.ef.main._dbcommand _cmdultimoregistro = null;
b4a.example.ef.httpjob _j5 = null;
b4a.example.ef.main._dbresult _resultimoregistro = null;
Object[] _rowregistro = null;
int _ultimoregistro = 0;
int _ultimoregistrosiembra = 0;
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
anywheresoftware.b4a.BA.IterableList group39;
int index39;
int groupLen39;
anywheresoftware.b4a.BA.IterableList group58;
int index58;
int groupLen58;
anywheresoftware.b4a.BA.IterableList group81;
int index81;
int groupLen81;
anywheresoftware.b4a.BA.IterableList group95;
int index95;
int groupLen95;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 126;BA.debugLine="utilClass.Initialize";
parent._utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 127;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
parent._utilclass._setstatusbarcolor /*String*/ (parent.__c.Colors.White,((int)0xb4008000));
 //BA.debugLineNum = 128;BA.debugLine="Root.LoadLayout(\"form\")";
parent._root.LoadLayout("form",ba);
 //BA.debugLineNum = 129;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
parent._customlistview1geral._defaulttextbackgroundcolor = ((int)0xff25253d);
 //BA.debugLineNum = 130;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
parent._customlistview1geral._defaulttextcolor = parent.__c.Colors.White;
 //BA.debugLineNum = 131;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem().getObject())),(Object)("form1"));
 //BA.debugLineNum = 133;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 134;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 141;BA.debugLine="SearchTemplateNit.Initialize";
parent._searchtemplatenit._initialize /*String*/ (ba);
 //BA.debugLineNum = 143;BA.debugLine="Dim ItemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 144;BA.debugLine="ItemsNit.Initialize";
_itemsnit.Initialize();
 //BA.debugLineNum = 145;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 148;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = parent._createcommand("select_nit",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 149;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 51;
return;
case 51:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 150;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 151;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 152;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 52;
return;
case 52:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 153;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group18 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 53;
if (true) break;

case 53:
//C
this.state = 7;
if (index18 < groupLen18) {
this.state = 6;
_row = (Object[])(group18.Get(index18));}
if (true) break;

case 54:
//C
this.state = 53;
index18++;
if (true) break;

case 6:
//C
this.state = 54;
 //BA.debugLineNum = 154;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 155;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 156;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
_itemsnit.Add((Object)(_nit+":"+_razonsocial));
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
 //BA.debugLineNum = 159;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("760620834","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 161;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
parent._searchtemplatenit._setitems /*Object*/ (_itemsnit);
 //BA.debugLineNum = 162;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 165;BA.debugLine="SearchTemplateHacienda.Initialize";
parent._searchtemplatehacienda._initialize /*String*/ (ba);
 //BA.debugLineNum = 167;BA.debugLine="SearchTemplateLote.Initialize";
parent._searchtemplatelote._initialize /*String*/ (ba);
 //BA.debugLineNum = 172;BA.debugLine="SearchTemplateLabor.Initialize";
parent._searchtemplatelabor._initialize /*String*/ (ba);
 //BA.debugLineNum = 174;BA.debugLine="Dim ItemsLabor As List";
_itemslabor = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 175;BA.debugLine="ItemsLabor.Initialize";
_itemslabor.Initialize();
 //BA.debugLineNum = 176;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
_itemslabor.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 179;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = parent._createcommand("select_labor_maq",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 180;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 55;
return;
case 55:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 181;BA.debugLine="If j3.Success Then";
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
 //BA.debugLineNum = 182;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (_j3,"req_labormaquina");
 //BA.debugLineNum = 183;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, this, (Object)(_req));
this.state = 56;
return;
case 56:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 184;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
if (true) break;

case 14:
//for
this.state = 17;
group39 = _reslabormaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index39 = 0;
groupLen39 = group39.getSize();
this.state = 57;
if (true) break;

case 57:
//C
this.state = 17;
if (index39 < groupLen39) {
this.state = 16;
_rowlabormaquina = (Object[])(group39.Get(index39));}
if (true) break;

case 58:
//C
this.state = 57;
index39++;
if (true) break;

case 16:
//C
this.state = 58;
 //BA.debugLineNum = 185;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
 //BA.debugLineNum = 186;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
 //BA.debugLineNum = 187;BA.debugLine="ItemsLabor.Add(codigoLaborMaquina&\":\"&descripci";
_itemslabor.Add((Object)(_codigolabormaquina+":"+_descripcionlabormaquina));
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
 //BA.debugLineNum = 190;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("760620865","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 192;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
parent._searchtemplatelabor._setitems /*Object*/ (_itemslabor);
 //BA.debugLineNum = 193;BA.debugLine="j3.Release";
_j3._release /*String*/ ();
 //BA.debugLineNum = 197;BA.debugLine="SearchTemplateElemento.Initialize";
parent._searchtemplateelemento._initialize /*String*/ (ba);
 //BA.debugLineNum = 199;BA.debugLine="Dim ItemsElemento As List";
_itemselemento = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 200;BA.debugLine="ItemsElemento.Initialize";
_itemselemento.Initialize();
 //BA.debugLineNum = 201;BA.debugLine="ItemsElemento.Add(\"Seleccionar:\")";
_itemselemento.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 205;BA.debugLine="Dim cmdElementoGasto As DBCommand = CreateCommand";
_cmdelementogasto = parent._createcommand("select_elementoGasto",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 206;BA.debugLine="Wait For (Req.ExecuteQuery(cmdElementoGasto, 0, N";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdelementogasto,(int) (0),parent.__c.Null)));
this.state = 59;
return;
case 59:
//C
this.state = 21;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 207;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 208;BA.debugLine="Req.HandleJobAsync(j4, \"req_elementoGasto\")";
_req._handlejobasync /*void*/ (_j4,"req_elementoGasto");
 //BA.debugLineNum = 209;BA.debugLine="Wait For (Req) req_elementoGasto_Result(resEleme";
parent.__c.WaitFor("req_elementogasto_result", ba, this, (Object)(_req));
this.state = 60;
return;
case 60:
//C
this.state = 24;
_reselementogasto = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 210;BA.debugLine="For Each rowElementoGasto() As Object In resElem";
if (true) break;

case 24:
//for
this.state = 27;
group58 = _reselementogasto.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index58 = 0;
groupLen58 = group58.getSize();
this.state = 61;
if (true) break;

case 61:
//C
this.state = 27;
if (index58 < groupLen58) {
this.state = 26;
_rowelementogasto = (Object[])(group58.Get(index58));}
if (true) break;

case 62:
//C
this.state = 61;
index58++;
if (true) break;

case 26:
//C
this.state = 62;
 //BA.debugLineNum = 211;BA.debugLine="Dim codigoElementoGasto As String = rowElemento";
_codigoelementogasto = BA.ObjectToString(_rowelementogasto[(int) (0)]);
 //BA.debugLineNum = 212;BA.debugLine="Dim descripcionElementoGasto As String = rowEle";
_descripcionelementogasto = BA.ObjectToString(_rowelementogasto[(int) (1)]);
 //BA.debugLineNum = 214;BA.debugLine="ItemsElemento.Add(codigoElementoGasto&\":\"&descr";
_itemselemento.Add((Object)(_codigoelementogasto+":"+_descripcionelementogasto));
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
 //BA.debugLineNum = 217;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("760620892","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 219;BA.debugLine="SearchTemplateElemento.SetItems(ItemsElemento)";
parent._searchtemplateelemento._setitems /*Object*/ (_itemselemento);
 //BA.debugLineNum = 220;BA.debugLine="j4.Release";
_j4._release /*String*/ ();
 //BA.debugLineNum = 226;BA.debugLine="SearchTemplateTypeForm.Initialize";
parent._searchtemplatetypeform._initialize /*String*/ (ba);
 //BA.debugLineNum = 228;BA.debugLine="Dim ItemsTypeForm As List";
_itemstypeform = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 229;BA.debugLine="ItemsTypeForm.Initialize";
_itemstypeform.Initialize();
 //BA.debugLineNum = 230;BA.debugLine="ItemsTypeForm.Add(\"0\"&\":\"&\"Insumo\")";
_itemstypeform.Add((Object)("0"+":"+"Insumo"));
 //BA.debugLineNum = 231;BA.debugLine="ItemsTypeForm.Add(\"1\"&\":\"&\"Siembra\")";
_itemstypeform.Add((Object)("1"+":"+"Siembra"));
 //BA.debugLineNum = 232;BA.debugLine="ItemsTypeForm.Add(\"2\"&\":\"&\"Riego\")";
_itemstypeform.Add((Object)("2"+":"+"Riego"));
 //BA.debugLineNum = 233;BA.debugLine="SearchTemplateTypeForm.SetItems(ItemsTypeForm)";
parent._searchtemplatetypeform._setitems /*Object*/ (_itemstypeform);
 //BA.debugLineNum = 237;BA.debugLine="data.Initialize";
parent._data.Initialize();
 //BA.debugLineNum = 240;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = parent._createcommand("select_maxIdLabor",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 241;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 63;
return;
case 63:
//C
this.state = 31;
_j5 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 243;BA.debugLine="If j5.Success Then";
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
 //BA.debugLineNum = 244;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (_j5,"req_ultimoRegistro");
 //BA.debugLineNum = 245;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, this, (Object)(_req));
this.state = 64;
return;
case 64:
//C
this.state = 34;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 247;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 34:
//for
this.state = 37;
group81 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index81 = 0;
groupLen81 = group81.getSize();
this.state = 65;
if (true) break;

case 65:
//C
this.state = 37;
if (index81 < groupLen81) {
this.state = 36;
_rowregistro = (Object[])(group81.Get(index81));}
if (true) break;

case 66:
//C
this.state = 65;
index81++;
if (true) break;

case 36:
//C
this.state = 66;
 //BA.debugLineNum = 248;BA.debugLine="Dim ultimoRegistro As Int = rowRegistro(0) ' Nu";
_ultimoregistro = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
 //BA.debugLineNum = 249;BA.debugLine="Log(\"Último Registro obtenido: \" & ultimoRegist";
parent.__c.LogImpl("760620924","Último Registro obtenido: "+BA.NumberToString(_ultimoregistro),0);
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
 //BA.debugLineNum = 253;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("760620928","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
 //BA.debugLineNum = 256;BA.debugLine="consecutivo = ultimoRegistro + 1";
parent._consecutivo = (int) (_ultimoregistro+1);
 //BA.debugLineNum = 258;BA.debugLine="Log(consecutivo)";
parent.__c.LogImpl("760620933",BA.NumberToString(parent._consecutivo),0);
 //BA.debugLineNum = 260;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = parent._createcommand("select_maxIdSiembra",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 261;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 67;
return;
case 67:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 263;BA.debugLine="If j5.Success Then";
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
 //BA.debugLineNum = 264;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (_j5,"req_ultimoRegistro");
 //BA.debugLineNum = 265;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, this, (Object)(_req));
this.state = 68;
return;
case 68:
//C
this.state = 44;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 267;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
if (true) break;

case 44:
//for
this.state = 47;
group95 = _resultimoregistro.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index95 = 0;
groupLen95 = group95.getSize();
this.state = 69;
if (true) break;

case 69:
//C
this.state = 47;
if (index95 < groupLen95) {
this.state = 46;
_rowregistro = (Object[])(group95.Get(index95));}
if (true) break;

case 70:
//C
this.state = 69;
index95++;
if (true) break;

case 46:
//C
this.state = 70;
 //BA.debugLineNum = 268;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
 //BA.debugLineNum = 269;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("760620944","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
 //BA.debugLineNum = 273;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("760620948","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = -1;
;
 //BA.debugLineNum = 276;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
parent._consecutivosiembra = (int) (_ultimoregistrosiembra+1);
 //BA.debugLineNum = 278;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("760620953",BA.NumberToString(parent._consecutivosiembra),0);
 //BA.debugLineNum = 280;BA.debugLine="SearchTemplateInsumo.Initialize";
parent._searchtemplateinsumo._initialize /*String*/ (ba);
 //BA.debugLineNum = 282;BA.debugLine="SearchTemplateRiego.Initialize";
parent._searchtemplateriego._initialize /*String*/ (ba);
 //BA.debugLineNum = 284;BA.debugLine="SearchTemplateTipoLabranza.Initialize";
parent._searchtemplatetipolabranza._initialize /*String*/ (ba);
 //BA.debugLineNum = 286;BA.debugLine="SearchTemplateVariedad.Initialize";
parent._searchtemplatevariedad._initialize /*String*/ (ba);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 109;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 110;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 113;BA.debugLine="Base = Root";
_base = _root;
 //BA.debugLineNum = 114;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 115;BA.debugLine="Dialog.Title = \"Buscador\"";
_dialog._title /*Object*/  = (Object)("Buscador");
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _b4xtable1_cellclicked(String _columnid,long _rowid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowdata = null;
String _id = "";
String _nombreinsu = "";
int _cantidadinsu = 0;
 //BA.debugLineNum = 848;BA.debugLine="Private Sub B4XTable1_CellClicked (ColumnId As Str";
 //BA.debugLineNum = 849;BA.debugLine="Log(\"COLUM ID\"&ColumnId)";
__c.LogImpl("763242241","COLUM ID"+_columnid,0);
 //BA.debugLineNum = 850;BA.debugLine="Log(\"ROW ID\"&RowId)";
__c.LogImpl("763242242","ROW ID"+BA.NumberToString(_rowid),0);
 //BA.debugLineNum = 851;BA.debugLine="PanelTittleInsumo.Visible = True";
_paneltittleinsumo.setVisible(__c.True);
 //BA.debugLineNum = 852;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = _b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid);
 //BA.debugLineNum = 853;BA.debugLine="Dim ID As String  = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 //BA.debugLineNum = 854;BA.debugLine="Dim nombreInsu As String = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 //BA.debugLineNum = 855;BA.debugLine="Dim cantidadInsu As Int = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
 //BA.debugLineNum = 856;BA.debugLine="LabelInsumoSelect.Text = \"- \"&nombreInsu&\" / \"&\"C";
_labelinsumoselect.setText(BA.ObjectToCharSequence("- "+_nombreinsu+" / "+"Cantidad: "+BA.NumberToString(_cantidadinsu)));
 //BA.debugLineNum = 857;BA.debugLine="PanelInsumoSelect.Visible = True";
_panelinsumoselect.setVisible(__c.True);
 //BA.debugLineNum = 858;BA.debugLine="ButtonDeleteInsumo.Visible = True";
_buttondeleteinsumo.setVisible(__c.True);
 //BA.debugLineNum = 860;BA.debugLine="idEliminarTabla = rowData.Get(\"#\")";
_ideliminartabla = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("#"))));
 //BA.debugLineNum = 861;BA.debugLine="Log(idEliminarTabla)";
__c.LogImpl("763242253",BA.NumberToString(_ideliminartabla),0);
 //BA.debugLineNum = 862;BA.debugLine="End Sub";
return "";
}
public String  _buttonaddinsumo_click() throws Exception{
int _numberinsumo = 0;
 //BA.debugLineNum = 821;BA.debugLine="Private Sub ButtonAddInsumo_Click";
 //BA.debugLineNum = 822;BA.debugLine="If NAMEINSUMO == \"\" And IDINSUMO == \"\" And CANTIN";
if ((_nameinsumo).equals("") && (_idinsumo).equals("") && (_cantinsumo).equals("")) { 
 //BA.debugLineNum = 823;BA.debugLine="MsgboxAsync(\"Selecciona un Insumo y la cantidad";
__c.MsgboxAsync(BA.ObjectToCharSequence("Selecciona un Insumo y la cantidad antes de agregarlo"),BA.ObjectToCharSequence("Error"),ba);
 }else {
 //BA.debugLineNum = 825;BA.debugLine="cantidadInsumos = cantidadInsumos + 1";
_cantidadinsumos = (int) (_cantidadinsumos+1);
 //BA.debugLineNum = 826;BA.debugLine="Dim numberInsumo As Int = cantidadInsumos";
_numberinsumo = _cantidadinsumos;
 //BA.debugLineNum = 827;BA.debugLine="data.Add(Array As Object(numberInsumo,IDINSUMO,N";
_data.Add((Object)(new Object[]{(Object)(_numberinsumo),(Object)(_idinsumo),(Object)(_nameinsumo),(Object)(_cantinsumo)}));
 //BA.debugLineNum = 828;BA.debugLine="B4XTable1.SetData(data)";
_b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_data);
 //BA.debugLineNum = 829;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
_labelcantidadinsumos.setText(BA.ObjectToCharSequence(_cantidadinsumos));
 //BA.debugLineNum = 830;BA.debugLine="EditTextCantidadInsumo.Text = \"\"";
_edittextcantidadinsumo.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return "";
}
public String  _buttondeleteinsumo_click() throws Exception{
 //BA.debugLineNum = 835;BA.debugLine="Private Sub ButtonDeleteInsumo_Click";
 //BA.debugLineNum = 837;BA.debugLine="RemoveInsumoFromData(idEliminarTabla)";
_removeinsumofromdata(_ideliminartabla);
 //BA.debugLineNum = 839;BA.debugLine="ButtonDeleteInsumo.Visible = False";
_buttondeleteinsumo.setVisible(__c.False);
 //BA.debugLineNum = 840;BA.debugLine="cantidadInsumos = cantidadInsumos - 1";
_cantidadinsumos = (int) (_cantidadinsumos-1);
 //BA.debugLineNum = 841;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
_labelcantidadinsumos.setText(BA.ObjectToCharSequence(_cantidadinsumos));
 //BA.debugLineNum = 842;BA.debugLine="PanelTittleInsumo.Visible = False";
_paneltittleinsumo.setVisible(__c.False);
 //BA.debugLineNum = 843;BA.debugLine="PanelInsumoSelect.Visible = False";
_panelinsumoselect.setVisible(__c.False);
 //BA.debugLineNum = 844;BA.debugLine="ButtonDeleteInsumo.Visible = False";
_buttondeleteinsumo.setVisible(__c.False);
 //BA.debugLineNum = 845;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 890;BA.debugLine="For i = 0 To B4XTable1.VisibleRowIds.Size - 1";
if (true) break;

case 1:
//for
this.state = 34;
step1 = 1;
limit1 = (int) (parent._b4xtable1._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
this.state = 47;
if (true) break;

case 47:
//C
this.state = 34;
if ((step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1)) this.state = 3;
if (true) break;

case 48:
//C
this.state = 47;
_i = ((int)(0 + _i + step1)) ;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 892;BA.debugLine="Dim RowId As Long = B4XTable1.VisibleRowIds.Get(";
_rowid = BA.ObjectToLongNumber(parent._b4xtable1._visiblerowids /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 895;BA.debugLine="Dim rowData As Map = B4XTable1.GetRow(RowId)";
_rowdata = new anywheresoftware.b4a.objects.collections.Map();
_rowdata = parent._b4xtable1._getrow /*anywheresoftware.b4a.objects.collections.Map*/ (_rowid);
 //BA.debugLineNum = 898;BA.debugLine="Dim ID As String";
_id = "";
 //BA.debugLineNum = 899;BA.debugLine="If rowData.ContainsKey(\"ID\") And rowData.Get(\"ID";
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
 //BA.debugLineNum = 900;BA.debugLine="ID = rowData.Get(\"ID\")";
_id = BA.ObjectToString(_rowdata.Get((Object)("ID")));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 902;BA.debugLine="ID = \"No ID\" ' Valor predeterminado si no se en";
_id = "No ID";
 if (true) break;

case 9:
//C
this.state = 10;
;
 //BA.debugLineNum = 906;BA.debugLine="Dim nombreInsu As String";
_nombreinsu = "";
 //BA.debugLineNum = 907;BA.debugLine="If rowData.ContainsKey(\"NOMBRE\") And rowData.Get";
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
 //BA.debugLineNum = 908;BA.debugLine="nombreInsu = rowData.Get(\"NOMBRE\")";
_nombreinsu = BA.ObjectToString(_rowdata.Get((Object)("NOMBRE")));
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 910;BA.debugLine="nombreInsu = \"Desconocido\"";
_nombreinsu = "Desconocido";
 if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 914;BA.debugLine="Dim cantidadInsu As Int";
_cantidadinsu = 0;
 //BA.debugLineNum = 915;BA.debugLine="If rowData.ContainsKey(\"CANTIDAD\") And rowData.G";
if (true) break;

case 16:
//if
this.state = 33;
if (_rowdata.ContainsKey((Object)("CANTIDAD")) && _rowdata.Get((Object)("CANTIDAD"))!= null) { 
this.state = 18;
}else {
this.state = 32;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 916;BA.debugLine="Try";
if (true) break;

case 19:
//try
this.state = 30;
this.catchState = 29;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 22;
this.catchState = 29;
 //BA.debugLineNum = 917;BA.debugLine="cantidadInsu = rowData.Get(\"CANTIDAD\")";
_cantidadinsu = (int)(BA.ObjectToNumber(_rowdata.Get((Object)("CANTIDAD"))));
 //BA.debugLineNum = 919;BA.debugLine="Log(\"Fila \" & (i + 1) & \":\")";
parent.__c.LogImpl("763438881","Fila "+BA.NumberToString((_i+1))+":",0);
 //BA.debugLineNum = 920;BA.debugLine="Log(\" - ID: \" & ID)";
parent.__c.LogImpl("763438882"," - ID: "+_id,0);
 //BA.debugLineNum = 921;BA.debugLine="Log(\" - NOMBRE: \" & nombreInsu)";
parent.__c.LogImpl("763438883"," - NOMBRE: "+_nombreinsu,0);
 //BA.debugLineNum = 922;BA.debugLine="Log(\" - CANTIDAD: \" & cantidadInsu)";
parent.__c.LogImpl("763438884"," - CANTIDAD: "+BA.NumberToString(_cantidadinsu),0);
 //BA.debugLineNum = 925;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 926;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 929;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_l";
_cmd = parent._createcommand("insert_laborInsumo",new Object[]{(Object)(parent._consecutivo),(Object)(_id),(Object)(_cantidadinsu)});
 //BA.debugLineNum = 931;BA.debugLine="Log(\"Comando SQL: insert_laborInsumo\")";
parent.__c.LogImpl("763438893","Comando SQL: insert_laborInsumo",0);
 //BA.debugLineNum = 932;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutiv";
parent.__c.LogImpl("763438894","Parámetro 1 - consecutivo: "+BA.NumberToString(parent._consecutivo),0);
 //BA.debugLineNum = 933;BA.debugLine="Log(\"Parámetro 2 - ID: \" & ID)";
parent.__c.LogImpl("763438895","Parámetro 2 - ID: "+_id,0);
 //BA.debugLineNum = 934;BA.debugLine="Log(\"Parámetro 3 - cantidadInsu: \" & cantidadI";
parent.__c.LogImpl("763438896","Parámetro 3 - cantidadInsu: "+BA.NumberToString(_cantidadinsu),0);
 //BA.debugLineNum = 936;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Nul";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 937;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 49;
return;
case 49:
//C
this.state = 22;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 940;BA.debugLine="If j.Success Then";
if (true) break;

case 22:
//if
this.state = 27;
if (_j._success /*boolean*/ ) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 27;
 //BA.debugLineNum = 942;BA.debugLine="Log(\"Inserción insumo exitosa para ID: \" & ID";
parent.__c.LogImpl("763438904","Inserción insumo exitosa para ID: "+_id,0);
 //BA.debugLineNum = 943;BA.debugLine="ToastMessageShow(\"Inserción exitosa para Insu";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Inserción exitosa para Insumo : "+_id),parent.__c.True);
 if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 946;BA.debugLine="Log(\"Error en la inserción insumo para ID: \"";
parent.__c.LogImpl("763438908","Error en la inserción insumo para ID: "+_id+". Error: "+_j._errormessage /*String*/ ,0);
 //BA.debugLineNum = 947;BA.debugLine="ToastMessageShow(\"Error en la inserción para";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error en la inserción para ID: "+_id),parent.__c.False);
 if (true) break;

case 27:
//C
this.state = 30;
;
 //BA.debugLineNum = 951;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 954;BA.debugLine="consecutivo = consecutivo + 1";
parent._consecutivo = (int) (parent._consecutivo+1);
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 //BA.debugLineNum = 957;BA.debugLine="cantidadInsu = 0 ' Valor predeterminado si no";
_cantidadinsu = (int) (0);
 //BA.debugLineNum = 958;BA.debugLine="Log(\"Error al procesar insumo la cantidad para";
parent.__c.LogImpl("763438920","Error al procesar insumo la cantidad para ID: "+_id,0);
 //BA.debugLineNum = 959;BA.debugLine="ToastMessageShow(\"Error al procesar la cantida";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error al procesar la cantidad para ID: "+_id),parent.__c.False);
 if (true) break;
if (true) break;

case 30:
//C
this.state = 33;
this.catchState = 0;
;
 if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 962;BA.debugLine="cantidadInsu = 0";
_cantidadinsu = (int) (0);
 if (true) break;

case 33:
//C
this.state = 48;
;
 if (true) break;
if (true) break;

case 34:
//C
this.state = 35;
;
 //BA.debugLineNum = 966;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 967;BA.debugLine="user = Main.pUser";
parent._user = parent._main._puser /*String*/ ;
 //BA.debugLineNum = 968;BA.debugLine="DeviceName = GetDeviceName";
parent._devicename = parent._getdevicename();
 //BA.debugLineNum = 969;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 970;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 971;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
parent._fechaactual = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 973;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
parent._fechafmrto = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 975;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 976;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 979;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_labor",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)("0000-"),(Object)("CA"),(Object)(parent._tipolabor),(Object)(parent._fechainicio),(Object)(parent._fechafin),(Object)(parent._elementogasto),(Object)(parent._arealabor),(Object)(parent._consecutivo),parent.__c.Null,(Object)(parent._arealote),parent.__c.Null,(Object)(parent._fechaactual),(Object)(parent._horasistema),(Object)(parent._user),(Object)(parent._devicename)});
 //BA.debugLineNum = 983;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("763438945","nitEmpresaCBX: "+parent._nitempresacbx,0);
 //BA.debugLineNum = 984;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("763438946","haciendaCBX: "+parent._haciendacbx,0);
 //BA.debugLineNum = 985;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("763438947","loteCBX: "+parent._lotecbx,0);
 //BA.debugLineNum = 986;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("763438948","fechafmrto: "+parent._fechafmrto,0);
 //BA.debugLineNum = 987;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("763438949","tipoLabor: "+parent._tipolabor,0);
 //BA.debugLineNum = 988;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("763438950","fechaInicio: "+parent._fechainicio,0);
 //BA.debugLineNum = 989;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("763438951","fechaFin: "+parent._fechafin,0);
 //BA.debugLineNum = 990;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("763438952","elementoGasto: "+parent._elementogasto,0);
 //BA.debugLineNum = 991;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("763438953","areaLabor: "+BA.NumberToString(parent._arealabor),0);
 //BA.debugLineNum = 992;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("763438954","consecutivo: "+BA.NumberToString(parent._consecutivo),0);
 //BA.debugLineNum = 993;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("763438955","areaLote: "+BA.NumberToString(parent._arealote),0);
 //BA.debugLineNum = 994;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("763438956","fechaActual: "+parent._fechaactual,0);
 //BA.debugLineNum = 995;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("763438957","horaSistema: "+parent._horasistema,0);
 //BA.debugLineNum = 996;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("763438958","user: "+parent._user,0);
 //BA.debugLineNum = 997;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("763438959","DeviceName: "+parent._devicename,0);
 //BA.debugLineNum = 999;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 1000;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 50;
return;
case 50:
//C
this.state = 35;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1003;BA.debugLine="Try";
if (true) break;

case 35:
//try
this.state = 46;
this.catchState = 45;
this.state = 37;
if (true) break;

case 37:
//C
this.state = 38;
this.catchState = 45;
 //BA.debugLineNum = 1004;BA.debugLine="If j.Success Then";
if (true) break;

case 38:
//if
this.state = 43;
if (_j._success /*boolean*/ ) { 
this.state = 40;
}else {
this.state = 42;
}if (true) break;

case 40:
//C
this.state = 43;
 //BA.debugLineNum = 1006;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 42:
//C
this.state = 43;
 //BA.debugLineNum = 1009;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("763438971","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 43:
//C
this.state = 46;
;
 if (true) break;

case 45:
//C
this.state = 46;
this.catchState = 0;
 //BA.debugLineNum = 1013;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("763438975","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 46:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 1018;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1023;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 1024;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 1027;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_laborRiego",new Object[]{(Object)(parent._consecutivo),(Object)(parent._tiporiego),(Object)(parent._procedenciariego),(Object)(parent._caudalriego),(Object)(parent._cantidadriego)});
 //BA.debugLineNum = 1030;BA.debugLine="Log(\"Comando SQL: insert_laborRiego\")";
parent.__c.LogImpl("763504393","Comando SQL: insert_laborRiego",0);
 //BA.debugLineNum = 1031;BA.debugLine="Log(\"Parámetro 1 - consecutivo: \" & consecutivo)";
parent.__c.LogImpl("763504394","Parámetro 1 - consecutivo: "+BA.NumberToString(parent._consecutivo),0);
 //BA.debugLineNum = 1032;BA.debugLine="Log(\"Parámetro 2 - tipoRiego: \" & tipoRiego)";
parent.__c.LogImpl("763504395","Parámetro 2 - tipoRiego: "+parent._tiporiego,0);
 //BA.debugLineNum = 1033;BA.debugLine="Log(\"Parámetro 3 - procedenciaRiego: \" & proceden";
parent.__c.LogImpl("763504396","Parámetro 3 - procedenciaRiego: "+parent._procedenciariego,0);
 //BA.debugLineNum = 1034;BA.debugLine="Log(\"Parámetro 4 - caudalRiego: \" & caudalRiego)";
parent.__c.LogImpl("763504397","Parámetro 4 - caudalRiego: "+parent._caudalriego,0);
 //BA.debugLineNum = 1035;BA.debugLine="Log(\"Parámetro 5 - cantidadRiego: \" & cantidadRie";
parent.__c.LogImpl("763504398","Parámetro 5 - cantidadRiego: "+parent._cantidadriego,0);
 //BA.debugLineNum = 1037;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 1038;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 25;
return;
case 25:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1041;BA.debugLine="Try";
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
 //BA.debugLineNum = 1042;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 1043;BA.debugLine="ToastMessageShow(\"Se ha insertado correctamente";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Se ha insertado correctamente Insumo"),parent.__c.False);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 1045;BA.debugLine="ToastMessageShow(\"Error al insertar Insumo\", Tr";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error al insertar Insumo"),parent.__c.True);
 //BA.debugLineNum = 1046;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("763504409","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 1049;BA.debugLine="ToastMessageShow(\"Error inesperado al insertar I";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error inesperado al insertar Insumo"),parent.__c.True);
 //BA.debugLineNum = 1050;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("763504413","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = 13;
this.catchState = 0;
;
 //BA.debugLineNum = 1053;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 1054;BA.debugLine="user = Main.pUser";
parent._user = parent._main._puser /*String*/ ;
 //BA.debugLineNum = 1055;BA.debugLine="DeviceName = GetDeviceName";
parent._devicename = parent._getdevicename();
 //BA.debugLineNum = 1056;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 1057;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 1058;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
parent._fechaactual = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 1060;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
parent._fechafmrto = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 1062;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 1063;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 1066;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_labor",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)("0000-"),(Object)("CA"),(Object)(parent._tipolabor),(Object)(parent._fechainicio),(Object)(parent._fechafin),(Object)(parent._elementogasto),(Object)(parent._arealabor),(Object)(parent._consecutivo),parent.__c.Null,(Object)(parent._arealote),parent.__c.Null,(Object)(parent._fechaactual),(Object)(parent._horasistema),(Object)(parent._user),(Object)(parent._devicename)});
 //BA.debugLineNum = 1070;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("763504433","nitEmpresaCBX: "+parent._nitempresacbx,0);
 //BA.debugLineNum = 1071;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("763504434","haciendaCBX: "+parent._haciendacbx,0);
 //BA.debugLineNum = 1072;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("763504435","loteCBX: "+parent._lotecbx,0);
 //BA.debugLineNum = 1073;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("763504436","fechafmrto: "+parent._fechafmrto,0);
 //BA.debugLineNum = 1074;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("763504437","tipoLabor: "+parent._tipolabor,0);
 //BA.debugLineNum = 1075;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("763504438","fechaInicio: "+parent._fechainicio,0);
 //BA.debugLineNum = 1076;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("763504439","fechaFin: "+parent._fechafin,0);
 //BA.debugLineNum = 1077;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("763504440","elementoGasto: "+parent._elementogasto,0);
 //BA.debugLineNum = 1078;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("763504441","areaLabor: "+BA.NumberToString(parent._arealabor),0);
 //BA.debugLineNum = 1079;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("763504442","consecutivo: "+BA.NumberToString(parent._consecutivo),0);
 //BA.debugLineNum = 1080;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("763504443","areaLote: "+BA.NumberToString(parent._arealote),0);
 //BA.debugLineNum = 1081;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("763504444","fechaActual: "+parent._fechaactual,0);
 //BA.debugLineNum = 1082;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("763504445","horaSistema: "+parent._horasistema,0);
 //BA.debugLineNum = 1083;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("763504446","user: "+parent._user,0);
 //BA.debugLineNum = 1084;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("763504447","DeviceName: "+parent._devicename,0);
 //BA.debugLineNum = 1086;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 1087;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 26;
return;
case 26:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1090;BA.debugLine="Try";
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
 //BA.debugLineNum = 1091;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 1093;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 1096;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("763504459","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 1100;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("763504463","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 1103;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 1107;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 1108;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 1110;BA.debugLine="Dim cmdUltimoRegistro As DBCommand = CreateComman";
_cmdultimoregistro = parent._createcommand("select_maxIdSiembra",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 1111;BA.debugLine="Wait For (Req.ExecuteQuery(cmdUltimoRegistro, 0,";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdultimoregistro,(int) (0),parent.__c.Null)));
this.state = 35;
return;
case 35:
//C
this.state = 1;
_j5 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1113;BA.debugLine="If j5.Success Then";
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
 //BA.debugLineNum = 1114;BA.debugLine="Req.HandleJobAsync(j5, \"req_ultimoRegistro\")";
_req._handlejobasync /*void*/ (_j5,"req_ultimoRegistro");
 //BA.debugLineNum = 1115;BA.debugLine="Wait For (Req) req_ultimoRegistro_Result(resUlti";
parent.__c.WaitFor("req_ultimoregistro_result", ba, this, (Object)(_req));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_resultimoregistro = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 1117;BA.debugLine="For Each rowRegistro() As Object In resUltimoReg";
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
 //BA.debugLineNum = 1118;BA.debugLine="Dim ultimoRegistroSiembra As Int = rowRegistro(";
_ultimoregistrosiembra = (int)(BA.ObjectToNumber(_rowregistro[(int) (0)]));
 //BA.debugLineNum = 1119;BA.debugLine="Log(\"Último Registro Siembra  obtenido: \" & ult";
parent.__c.LogImpl("763569934","Último Registro Siembra  obtenido: "+BA.NumberToString(_ultimoregistrosiembra),0);
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
 //BA.debugLineNum = 1123;BA.debugLine="Log(\"Error en la consulta select_maxIdLabor: \" &";
parent.__c.LogImpl("763569938","Error en la consulta select_maxIdLabor: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 1126;BA.debugLine="consecutivoSiembra = ultimoRegistroSiembra + 1";
parent._consecutivosiembra = (int) (_ultimoregistrosiembra+1);
 //BA.debugLineNum = 1128;BA.debugLine="Log(consecutivoSiembra)";
parent.__c.LogImpl("763569943",BA.NumberToString(parent._consecutivosiembra),0);
 //BA.debugLineNum = 1131;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_laborSiembra",new Object[]{(Object)(parent._consecutivosiembra),(Object)(parent._codigosiembra),(Object)(parent._distanciasiembra),(Object)(parent._toneladasemillasiembra),(Object)(parent._numeropaquetessiembra),(Object)(parent._procedenciasiembra),(Object)(parent._tipolabranzasiembra),(Object)(parent._bandereosiembra),(Object)(parent._numeromacollosiembra)});
 //BA.debugLineNum = 1134;BA.debugLine="Log(\"Comando SQL: insert_laborSiembra\")";
parent.__c.LogImpl("763569949","Comando SQL: insert_laborSiembra",0);
 //BA.debugLineNum = 1135;BA.debugLine="Log(\"Parámetro 1 - consecutivoSiembra: \" & consec";
parent.__c.LogImpl("763569950","Parámetro 1 - consecutivoSiembra: "+BA.NumberToString(parent._consecutivosiembra),0);
 //BA.debugLineNum = 1136;BA.debugLine="Log(\"Parámetro 2 - codigoSiembra: \" & codigoSiemb";
parent.__c.LogImpl("763569951","Parámetro 2 - codigoSiembra: "+parent._codigosiembra,0);
 //BA.debugLineNum = 1137;BA.debugLine="Log(\"Parámetro 3 - distanciaSiembra: \" & distanci";
parent.__c.LogImpl("763569952","Parámetro 3 - distanciaSiembra: "+BA.NumberToString(parent._distanciasiembra),0);
 //BA.debugLineNum = 1138;BA.debugLine="Log(\"Parámetro 4 - toneladaSemillaSiembra: \" & to";
parent.__c.LogImpl("763569953","Parámetro 4 - toneladaSemillaSiembra: "+BA.NumberToString(parent._toneladasemillasiembra),0);
 //BA.debugLineNum = 1139;BA.debugLine="Log(\"Parámetro 5 - numeroPaquetesSiembra: \" & num";
parent.__c.LogImpl("763569954","Parámetro 5 - numeroPaquetesSiembra: "+BA.NumberToString(parent._numeropaquetessiembra),0);
 //BA.debugLineNum = 1140;BA.debugLine="Log(\"Parámetro 6 - procedenciaSiembra: \" & proced";
parent.__c.LogImpl("763569955","Parámetro 6 - procedenciaSiembra: "+parent._procedenciasiembra,0);
 //BA.debugLineNum = 1141;BA.debugLine="Log(\"Parámetro 7 - tipoLabranzaSiembra: \" & tipoL";
parent.__c.LogImpl("763569956","Parámetro 7 - tipoLabranzaSiembra: "+parent._tipolabranzasiembra,0);
 //BA.debugLineNum = 1142;BA.debugLine="Log(\"Parámetro 8 - bandereoSiembra: \" & bandereoS";
parent.__c.LogImpl("763569957","Parámetro 8 - bandereoSiembra: "+BA.NumberToString(parent._bandereosiembra),0);
 //BA.debugLineNum = 1143;BA.debugLine="Log(\"Parámetro 9 - numeroMacolloSiembra: \" & nume";
parent.__c.LogImpl("763569958","Parámetro 9 - numeroMacolloSiembra: "+BA.NumberToString(parent._numeromacollosiembra),0);
 //BA.debugLineNum = 1146;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 1147;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 39;
return;
case 39:
//C
this.state = 11;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1150;BA.debugLine="Try";
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
 //BA.debugLineNum = 1151;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 1152;BA.debugLine="Log(\"Datos insertados correctamente en insert_l";
parent.__c.LogImpl("763569967","Datos insertados correctamente en insert_laborInsumo",0);
 //BA.debugLineNum = 1153;BA.debugLine="ToastMessageShow(\"Datos de Insumo guardados con";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Datos de Insumo guardados con éxito"),parent.__c.False);
 if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1155;BA.debugLine="ToastMessageShow(\"Error al guardar los datos de";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Error al guardar los datos de Insumo"),parent.__c.True);
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
 //BA.debugLineNum = 1158;BA.debugLine="Log(\"Excepción capturada en insert_laborInsumo";
parent.__c.LogImpl("763569973","Excepción capturada en insert_laborInsumo: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 1159;BA.debugLine="ToastMessageShow(\"Se produjo un error inesperado";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Se produjo un error inesperado"),parent.__c.True);
 if (true) break;
if (true) break;

case 22:
//C
this.state = 23;
this.catchState = 0;
;
 //BA.debugLineNum = 1163;BA.debugLine="Dim horaSistema As String = DateTime.Time(DateTim";
parent._horasistema = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 1164;BA.debugLine="user = Main.pUser";
parent._user = parent._main._puser /*String*/ ;
 //BA.debugLineNum = 1165;BA.debugLine="DeviceName = GetDeviceName";
parent._devicename = parent._getdevicename();
 //BA.debugLineNum = 1166;BA.debugLine="Dim fecha As Long = DateTime.Now ' Obtiene el tie";
_fecha = parent.__c.DateTime.getNow();
 //BA.debugLineNum = 1167;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm:ss\" ' Con";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm:ss");
 //BA.debugLineNum = 1168;BA.debugLine="fechaActual = DateTime.Date(fecha) ' Almacena la";
parent._fechaactual = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 1170;BA.debugLine="fechafmrto = DateTime.Date(fecha)";
parent._fechafmrto = parent.__c.DateTime.Date(_fecha);
 //BA.debugLineNum = 1172;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 1173;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 1176;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_labo";
_cmd = parent._createcommand("insert_labor",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)("0000-"),(Object)("CA"),(Object)(parent._tipolabor),(Object)(parent._fechainicio),(Object)(parent._fechafin),(Object)(parent._elementogasto),(Object)(parent._arealabor),(Object)(parent._consecutivo),parent.__c.Null,(Object)(parent._arealote),parent.__c.Null,(Object)(parent._fechaactual),(Object)(parent._horasistema),(Object)(parent._user),(Object)(parent._devicename)});
 //BA.debugLineNum = 1180;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("763569995","nitEmpresaCBX: "+parent._nitempresacbx,0);
 //BA.debugLineNum = 1181;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("763569996","haciendaCBX: "+parent._haciendacbx,0);
 //BA.debugLineNum = 1182;BA.debugLine="Log(\"loteCBX: \" & loteCBX)";
parent.__c.LogImpl("763569997","loteCBX: "+parent._lotecbx,0);
 //BA.debugLineNum = 1183;BA.debugLine="Log(\"fechafmrto: \" & fechafmrto)";
parent.__c.LogImpl("763569998","fechafmrto: "+parent._fechafmrto,0);
 //BA.debugLineNum = 1184;BA.debugLine="Log(\"tipoLabor: \" & tipoLabor)";
parent.__c.LogImpl("763569999","tipoLabor: "+parent._tipolabor,0);
 //BA.debugLineNum = 1185;BA.debugLine="Log(\"fechaInicio: \" & fechaInicio)";
parent.__c.LogImpl("763570000","fechaInicio: "+parent._fechainicio,0);
 //BA.debugLineNum = 1186;BA.debugLine="Log(\"fechaFin: \" & fechaFin)";
parent.__c.LogImpl("763570001","fechaFin: "+parent._fechafin,0);
 //BA.debugLineNum = 1187;BA.debugLine="Log(\"elementoGasto: \" & elementoGasto)";
parent.__c.LogImpl("763570002","elementoGasto: "+parent._elementogasto,0);
 //BA.debugLineNum = 1188;BA.debugLine="Log(\"areaLabor: \" & areaLabor)";
parent.__c.LogImpl("763570003","areaLabor: "+BA.NumberToString(parent._arealabor),0);
 //BA.debugLineNum = 1189;BA.debugLine="Log(\"consecutivo: \" & consecutivo)";
parent.__c.LogImpl("763570004","consecutivo: "+BA.NumberToString(parent._consecutivo),0);
 //BA.debugLineNum = 1190;BA.debugLine="Log(\"areaLote: \" & areaLote)";
parent.__c.LogImpl("763570005","areaLote: "+BA.NumberToString(parent._arealote),0);
 //BA.debugLineNum = 1191;BA.debugLine="Log(\"fechaActual: \" & fechaActual)";
parent.__c.LogImpl("763570006","fechaActual: "+parent._fechaactual,0);
 //BA.debugLineNum = 1192;BA.debugLine="Log(\"horaSistema: \" & horaSistema)";
parent.__c.LogImpl("763570007","horaSistema: "+parent._horasistema,0);
 //BA.debugLineNum = 1193;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("763570008","user: "+parent._user,0);
 //BA.debugLineNum = 1194;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("763570009","DeviceName: "+parent._devicename,0);
 //BA.debugLineNum = 1196;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 1197;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 40;
return;
case 40:
//C
this.state = 23;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1200;BA.debugLine="Try";
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
 //BA.debugLineNum = 1201;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 1203;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente la l";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente la labor."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 1206;BA.debugLine="Log(\"Error al ejecutar la consulta labor: \" & j";
parent.__c.LogImpl("763570021","Error al ejecutar la consulta labor: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 1210;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("763570025","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 34:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 1213;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 25;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
 //BA.debugLineNum = 26;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
 //BA.debugLineNum = 28;BA.debugLine="Private Panel2geral As Panel";
_panel2geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 29;BA.debugLine="Private SD_xComboBoxTipoRiego As SD_xComboBox";
_sd_xcomboboxtiporiego = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 31;BA.debugLine="Private Panel3geral As Panel";
_panel3geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private SD_xComboBoxCodigoVariedad As SD_xComboBo";
_sd_xcomboboxcodigovariedad = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 33;BA.debugLine="Private SD_xComboBoxTipoLabranza As SD_xComboBox";
_sd_xcomboboxtipolabranza = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 35;BA.debugLine="Private cantidadInsumos As Int";
_cantidadinsumos = 0;
 //BA.debugLineNum = 37;BA.debugLine="Private SD_xComboBoxInsumo As SD_xComboBox";
_sd_xcomboboxinsumo = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 38;BA.debugLine="Private EditTextCantidadInsumo As EditText";
_edittextcantidadinsumo = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private ButtonAddInsumo As Button";
_buttonaddinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private ButtonDeleteInsumo As Button";
_buttondeleteinsumo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private Panel0geral As Panel";
_panel0geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private IDINSUMO As String";
_idinsumo = "";
 //BA.debugLineNum = 44;BA.debugLine="Private NAMEINSUMO As String";
_nameinsumo = "";
 //BA.debugLineNum = 45;BA.debugLine="Private CANTINSUMO As String";
_cantinsumo = "";
 //BA.debugLineNum = 47;BA.debugLine="Private LabelCantidadInsumos As Label";
_labelcantidadinsumos = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private B4XTable1 As B4XTable";
_b4xtable1 = new b4a.example.ef.b4xtable();
 //BA.debugLineNum = 49;BA.debugLine="Private data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 51;BA.debugLine="Private PanelInsumoSelect As Panel";
_panelinsumoselect = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private PanelTittleInsumo As Panel";
_paneltittleinsumo = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private LabelInsumoSelect As Label";
_labelinsumoselect = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Dim idEliminarTabla As Int";
_ideliminartabla = 0;
 //BA.debugLineNum = 57;BA.debugLine="Dim tipoRiego As String";
_tiporiego = "";
 //BA.debugLineNum = 58;BA.debugLine="Dim procedenciaRiego As String";
_procedenciariego = "";
 //BA.debugLineNum = 59;BA.debugLine="Dim caudalRiego As String";
_caudalriego = "";
 //BA.debugLineNum = 60;BA.debugLine="Dim cantidadRiego As String";
_cantidadriego = "";
 //BA.debugLineNum = 62;BA.debugLine="Dim codigoSiembra As String";
_codigosiembra = "";
 //BA.debugLineNum = 63;BA.debugLine="Dim distanciaSiembra As Int";
_distanciasiembra = 0;
 //BA.debugLineNum = 64;BA.debugLine="Dim bandereoSiembra As Int";
_bandereosiembra = 0;
 //BA.debugLineNum = 65;BA.debugLine="Dim toneladaSemillaSiembra As Int";
_toneladasemillasiembra = 0;
 //BA.debugLineNum = 66;BA.debugLine="Dim procedenciaSiembra As String";
_procedenciasiembra = "";
 //BA.debugLineNum = 67;BA.debugLine="Dim tipoLabranzaSiembra As String";
_tipolabranzasiembra = "";
 //BA.debugLineNum = 68;BA.debugLine="Dim numeroPaquetesSiembra As Int";
_numeropaquetessiembra = 0;
 //BA.debugLineNum = 69;BA.debugLine="Dim numeroMacolloSiembra As Int";
_numeromacollosiembra = 0;
 //BA.debugLineNum = 71;BA.debugLine="Dim DeviceName As String";
_devicename = "";
 //BA.debugLineNum = 72;BA.debugLine="Dim user As String";
_user = "";
 //BA.debugLineNum = 74;BA.debugLine="Dim fechaActual As String";
_fechaactual = "";
 //BA.debugLineNum = 75;BA.debugLine="Dim consecutivoSiembra As Int";
_consecutivosiembra = 0;
 //BA.debugLineNum = 78;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
 //BA.debugLineNum = 79;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 80;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 81;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 82;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 83;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 84;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 85;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 86;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 87;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 88;BA.debugLine="Private SwiftButtonElemento As SwiftButton";
_swiftbuttonelemento = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 89;BA.debugLine="Private SearchTemplateElemento As B4XSearchTempla";
_searchtemplateelemento = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 90;BA.debugLine="Private SwiftButtonTypeForm As SwiftButton";
_swiftbuttontypeform = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 91;BA.debugLine="Private SearchTemplateTypeForm As B4XSearchTempla";
_searchtemplatetypeform = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 92;BA.debugLine="Private SwiftButtonInsumo As SwiftButton";
_swiftbuttoninsumo = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 93;BA.debugLine="Private SearchTemplateInsumo As B4XSearchTemplate";
_searchtemplateinsumo = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 94;BA.debugLine="Private SwiftButtonRiego As SwiftButton";
_swiftbuttonriego = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 95;BA.debugLine="Private SearchTemplateRiego As B4XSearchTemplate";
_searchtemplateriego = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 96;BA.debugLine="Private SwiftButtonTipoLabranza As SwiftButton";
_swiftbuttontipolabranza = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 97;BA.debugLine="Private SearchTemplateTipoLabranza As B4XSearchTe";
_searchtemplatetipolabranza = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 98;BA.debugLine="Private SwiftButtonVariedad As SwiftButton";
_swiftbuttonvariedad = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 99;BA.debugLine="Private SearchTemplateVariedad As B4XSearchTempla";
_searchtemplatevariedad = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 421;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 422;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 423;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 424;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 425;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 426;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 291;BA.debugLine="Private Sub CreateItem As Panel";
 //BA.debugLineNum = 293;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 294;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 297;BA.debugLine="panel.LoadLayout(\"addLaboresUI\")";
_panel.LoadLayout("addLaboresUI",ba);
 //BA.debugLineNum = 299;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(_panel1geral.getHeight());
 //BA.debugLineNum = 301;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createiteminsumo() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 331;BA.debugLine="Private Sub CreateItemInsumo As Panel";
 //BA.debugLineNum = 333;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 334;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 337;BA.debugLine="panel.LoadLayout(\"FormInsumo\")";
_panel.LoadLayout("FormInsumo",ba);
 //BA.debugLineNum = 339;BA.debugLine="panel.Height=Panel0geral.Height";
_panel.setHeight(_panel0geral.getHeight());
 //BA.debugLineNum = 341;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemriego() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 305;BA.debugLine="Private Sub CreateItemRiego As Panel";
 //BA.debugLineNum = 307;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 308;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 311;BA.debugLine="panel.LoadLayout(\"FormRiego\")";
_panel.LoadLayout("FormRiego",ba);
 //BA.debugLineNum = 313;BA.debugLine="panel.Height=Panel2geral.Height";
_panel.setHeight(_panel2geral.getHeight());
 //BA.debugLineNum = 315;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitemsiembra() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 318;BA.debugLine="Private Sub CreateItemSiembra As Panel";
 //BA.debugLineNum = 320;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 321;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 324;BA.debugLine="panel.LoadLayout(\"FormSiembra\")";
_panel.LoadLayout("FormSiembra",ba);
 //BA.debugLineNum = 326;BA.debugLine="panel.Height=Panel3geral.Height";
_panel.setHeight(_panel3geral.getHeight());
 //BA.debugLineNum = 328;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return null;
}
public String  _edittextarealabor_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 533;BA.debugLine="Private Sub EditTextAreaLabor_TextChanged (Old As";
 //BA.debugLineNum = 535;BA.debugLine="areaLabor = New";
_arealabor = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 537;BA.debugLine="Log(\"Area Labor \" & areaLabor)";
__c.LogImpl("761603844","Area Labor "+BA.NumberToString(_arealabor),0);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return "";
}
public String  _edittextarealote_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Private Sub EditTextAreaLote_TextChanged (Old As S";
 //BA.debugLineNum = 543;BA.debugLine="areaLote = New";
_arealote = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 545;BA.debugLine="Log(\"Area lote \" & areaLote )";
__c.LogImpl("761669380","Area lote "+BA.NumberToString(_arealote),0);
 //BA.debugLineNum = 546;BA.debugLine="End Sub";
return "";
}
public String  _edittextbandereo_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 661;BA.debugLine="Private Sub EditTextBandereo_TextChanged (Old As S";
 //BA.debugLineNum = 663;BA.debugLine="bandereoSiembra = New";
_bandereosiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 665;BA.debugLine="Log(\"bandereo \" & bandereoSiembra)";
__c.LogImpl("762390276","bandereo "+BA.NumberToString(_bandereosiembra),0);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadagua_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 602;BA.debugLine="Private Sub EditTextCantidadAgua_TextChanged (Old";
 //BA.debugLineNum = 603;BA.debugLine="cantidadRiego = New";
_cantidadriego = _new;
 //BA.debugLineNum = 605;BA.debugLine="Log(\"cantidad\" & cantidadRiego)";
__c.LogImpl("761931523","cantidad"+_cantidadriego,0);
 //BA.debugLineNum = 607;BA.debugLine="End Sub";
return "";
}
public String  _edittextcantidadinsumo_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 816;BA.debugLine="Private Sub EditTextCantidadInsumo_TextChanged (Ol";
 //BA.debugLineNum = 817;BA.debugLine="ButtonAddInsumo.Enabled = True";
_buttonaddinsumo.setEnabled(__c.True);
 //BA.debugLineNum = 818;BA.debugLine="CANTINSUMO = New";
_cantinsumo = _new;
 //BA.debugLineNum = 819;BA.debugLine="End Sub";
return "";
}
public String  _edittextcaudalaplicado_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 596;BA.debugLine="Private Sub EditTextCaudalAplicado_TextChanged (Ol";
 //BA.debugLineNum = 597;BA.debugLine="caudalRiego = New";
_caudalriego = _new;
 //BA.debugLineNum = 599;BA.debugLine="Log(\"caudal\" & caudalRiego)";
__c.LogImpl("761865987","caudal"+_caudalriego,0);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return "";
}
public String  _edittextdistanciasiembra_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 655;BA.debugLine="Private Sub EditTextDistanciaSiembra_TextChanged (";
 //BA.debugLineNum = 656;BA.debugLine="distanciaSiembra = New";
_distanciasiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 658;BA.debugLine="Log(\"Distancia de siembra \" & distanciaSiembra)";
__c.LogImpl("762324739","Distancia de siembra "+BA.NumberToString(_distanciasiembra),0);
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeromacollos_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 695;BA.debugLine="Private Sub EditTextNumeroMacollos_TextChanged (Ol";
 //BA.debugLineNum = 696;BA.debugLine="numeroMacolloSiembra = New";
_numeromacollosiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 698;BA.debugLine="Log(\"numero de macollos \" & numeroMacolloSiembra";
__c.LogImpl("762717955","numero de macollos "+BA.NumberToString(_numeromacollosiembra),0);
 //BA.debugLineNum = 699;BA.debugLine="End Sub";
return "";
}
public String  _edittextnumeropaquetes_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 688;BA.debugLine="Private Sub EditTextNumeroPaquetes_TextChanged (Ol";
 //BA.debugLineNum = 690;BA.debugLine="numeroPaquetesSiembra = New";
_numeropaquetessiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 692;BA.debugLine="Log(\"numero de paquetes \" & numeroPaquetesSiembra";
__c.LogImpl("762652420","numero de paquetes "+BA.NumberToString(_numeropaquetessiembra),0);
 //BA.debugLineNum = 693;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedencia_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 589;BA.debugLine="Private Sub EditTextProcedencia_TextChanged (Old A";
 //BA.debugLineNum = 591;BA.debugLine="procedenciaRiego = New";
_procedenciariego = _new;
 //BA.debugLineNum = 593;BA.debugLine="Log(\"procedencia\" & procedenciaRiego)";
__c.LogImpl("761800452","procedencia"+_procedenciariego,0);
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return "";
}
public String  _edittextprocedenciadestino_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 675;BA.debugLine="Private Sub EditTextProcedenciaDestino_TextChanged";
 //BA.debugLineNum = 676;BA.debugLine="procedenciaSiembra = New";
_procedenciasiembra = _new;
 //BA.debugLineNum = 678;BA.debugLine="Log(\"procedencia \"& procedenciaSiembra)";
__c.LogImpl("762521347","procedencia "+_procedenciasiembra,0);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return "";
}
public String  _edittexttoneladasemilla_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 668;BA.debugLine="Private Sub EditTextToneladaSemilla_TextChanged (O";
 //BA.debugLineNum = 670;BA.debugLine="toneladaSemillaSiembra = New";
_toneladasemillasiembra = (int)(Double.parseDouble(_new));
 //BA.debugLineNum = 672;BA.debugLine="Log(\"tonelada Semilla \"& toneladaSemillaSiembra)";
__c.LogImpl("762455812","tonelada Semilla "+BA.NumberToString(_toneladasemillasiembra),0);
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return "";
}
public String  _getdevicename() throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
String _manufacturer = "";
String _model = "";
 //BA.debugLineNum = 118;BA.debugLine="Sub GetDeviceName As String";
 //BA.debugLineNum = 119;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 120;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
 //BA.debugLineNum = 121;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
 //BA.debugLineNum = 122;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 103;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public String  _label13time_click() throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Private Sub Label13Time_Click";
 //BA.debugLineNum = 347;BA.debugLine="Panel12.Visible = True";
_panel12.setVisible(__c.True);
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public String  _label14time_click() throws Exception{
 //BA.debugLineNum = 350;BA.debugLine="Private Sub Label14Time_Click";
 //BA.debugLineNum = 351;BA.debugLine="Panel3.Visible = True";
_panel3.setVisible(__c.True);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 881;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 882;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 883;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.List _itemsinsumo = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_producto = "";
String _dscrpcion_producto = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 784;BA.debugLine="Dim ItemsInsumo As List";
_itemsinsumo = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 785;BA.debugLine="ItemsInsumo.Initialize";
_itemsinsumo.Initialize();
 //BA.debugLineNum = 786;BA.debugLine="ItemsInsumo.Add(\"Seleccionar:\")";
_itemsinsumo.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 788;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 789;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 791;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_insu";
_cmd = parent._createcommand("select_insumosSort",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 792;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 793;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 794;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 795;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 796;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
if (true) break;

case 6:
//C
this.state = 14;
 //BA.debugLineNum = 797;BA.debugLine="Dim Cdgo_Producto As String = row(0)";
_cdgo_producto = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 798;BA.debugLine="Dim Dscrpcion_Producto As String = row(1)";
_dscrpcion_producto = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 799;BA.debugLine="SD_xComboBoxInsumo.Add(Dscrpcion_Producto, Dscr";
parent._sd_xcomboboxinsumo._add /*String*/ (_dscrpcion_producto,(Object)(_dscrpcion_producto+" - "+_cdgo_producto));
 //BA.debugLineNum = 800;BA.debugLine="ItemsInsumo.Add(Cdgo_Producto&\":\"&Dscrpcion_Pro";
_itemsinsumo.Add((Object)(_cdgo_producto+":"+_dscrpcion_producto));
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
 //BA.debugLineNum = 803;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("762914581","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 805;BA.debugLine="SearchTemplateInsumo.SetItems(ItemsInsumo)";
parent._searchtemplateinsumo._setitems /*Object*/ (_itemsinsumo);
 //BA.debugLineNum = 806;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 808;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.List _itemsriego = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _cdgo_tipo_riego = "";
String _dscrpcion_tipo_riego = "";
anywheresoftware.b4a.BA.IterableList group11;
int index11;
int groupLen11;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 705;BA.debugLine="Dim ItemsRiego As List";
_itemsriego = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 706;BA.debugLine="ItemsRiego.Initialize";
_itemsriego.Initialize();
 //BA.debugLineNum = 707;BA.debugLine="ItemsRiego.Add(\"Seleccionar:\")";
_itemsriego.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 709;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 710;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 712;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_tipo";
_cmd = parent._createcommand("select_tipoRiego",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 713;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 714;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 715;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 716;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 717;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group11 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index11 = 0;
groupLen11 = group11.getSize();
this.state = 13;
if (true) break;

case 13:
//C
this.state = 7;
if (index11 < groupLen11) {
this.state = 6;
_row = (Object[])(group11.Get(index11));}
if (true) break;

case 14:
//C
this.state = 13;
index11++;
if (true) break;

case 6:
//C
this.state = 14;
 //BA.debugLineNum = 718;BA.debugLine="Dim Cdgo_Tipo_Riego As String = row(0)";
_cdgo_tipo_riego = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 719;BA.debugLine="Dim Dscrpcion_Tipo_Riego As String = row(1)";
_dscrpcion_tipo_riego = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 720;BA.debugLine="SD_xComboBoxTipoRiego.Add(Dscrpcion_Tipo_Riego,";
parent._sd_xcomboboxtiporiego._add /*String*/ (_dscrpcion_tipo_riego,(Object)(_cdgo_tipo_riego));
 //BA.debugLineNum = 721;BA.debugLine="ItemsRiego.Add(Cdgo_Tipo_Riego&\":\"&Dscrpcion_Ti";
_itemsriego.Add((Object)(_cdgo_tipo_riego+":"+_dscrpcion_tipo_riego));
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
 //BA.debugLineNum = 724;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("762783509","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 726;BA.debugLine="SearchTemplateRiego.SetItems(ItemsRiego)";
parent._searchtemplateriego._setitems /*Object*/ (_itemsriego);
 //BA.debugLineNum = 727;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 729;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.collections.List _itemslabranza = null;
anywheresoftware.b4a.objects.collections.List _itemsvariedad = null;
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
anywheresoftware.b4a.BA.IterableList group14;
int index14;
int groupLen14;
anywheresoftware.b4a.BA.IterableList group29;
int index29;
int groupLen29;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 733;BA.debugLine="Dim ItemsLabranza As List";
_itemslabranza = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 734;BA.debugLine="ItemsLabranza.Initialize";
_itemslabranza.Initialize();
 //BA.debugLineNum = 735;BA.debugLine="ItemsLabranza.Add(\"Seleccionar:\")";
_itemslabranza.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 737;BA.debugLine="Dim ItemsVariedad As List";
_itemsvariedad = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 738;BA.debugLine="ItemsVariedad.Initialize";
_itemsvariedad.Initialize();
 //BA.debugLineNum = 739;BA.debugLine="ItemsVariedad.Add(\"Seleccionar:\")";
_itemsvariedad.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 741;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 742;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 745;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_codV";
_cmd = parent._createcommand("select_codVariedad",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 746;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 21;
return;
case 21:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 747;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 748;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 749;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 22;
return;
case 22:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 750;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group14 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index14 = 0;
groupLen14 = group14.getSize();
this.state = 23;
if (true) break;

case 23:
//C
this.state = 7;
if (index14 < groupLen14) {
this.state = 6;
_row = (Object[])(group14.Get(index14));}
if (true) break;

case 24:
//C
this.state = 23;
index14++;
if (true) break;

case 6:
//C
this.state = 24;
 //BA.debugLineNum = 751;BA.debugLine="Dim Cdgo_Variedad As String = row(0)";
_cdgo_variedad = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 752;BA.debugLine="SD_xComboBoxCodigoVariedad.Add(Cdgo_Variedad, C";
parent._sd_xcomboboxcodigovariedad._add /*String*/ (_cdgo_variedad,(Object)(_cdgo_variedad));
 //BA.debugLineNum = 753;BA.debugLine="ItemsVariedad.Add(Cdgo_Variedad)";
_itemsvariedad.Add((Object)(_cdgo_variedad));
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
 //BA.debugLineNum = 756;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("762849049","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 758;BA.debugLine="SearchTemplateVariedad.SetItems(ItemsVariedad)";
parent._searchtemplatevariedad._setitems /*Object*/ (_itemsvariedad);
 //BA.debugLineNum = 759;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 763;BA.debugLine="Dim cmdTipoLabranza As DBCommand = CreateCommand(";
_cmdtipolabranza = parent._createcommand("select_tipoLabranza",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 764;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTipoLabranza, 0, Nu";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdtipolabranza,(int) (0),parent.__c.Null)));
this.state = 25;
return;
case 25:
//C
this.state = 11;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 765;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 766;BA.debugLine="Req.HandleJobAsync(j4, \"req_TipoLabranza\")";
_req._handlejobasync /*void*/ (_j4,"req_TipoLabranza");
 //BA.debugLineNum = 767;BA.debugLine="Wait For (Req) req_TipoLabranza_Result(resTipoLa";
parent.__c.WaitFor("req_tipolabranza_result", ba, this, (Object)(_req));
this.state = 26;
return;
case 26:
//C
this.state = 14;
_restipolabranza = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 768;BA.debugLine="For Each rowTipoLabranza() As Object In resTipoL";
if (true) break;

case 14:
//for
this.state = 17;
group29 = _restipolabranza.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index29 = 0;
groupLen29 = group29.getSize();
this.state = 27;
if (true) break;

case 27:
//C
this.state = 17;
if (index29 < groupLen29) {
this.state = 16;
_rowtipolabranza = (Object[])(group29.Get(index29));}
if (true) break;

case 28:
//C
this.state = 27;
index29++;
if (true) break;

case 16:
//C
this.state = 28;
 //BA.debugLineNum = 769;BA.debugLine="Dim Cdgo_Tipo_Labranza As String = rowTipoLabra";
_cdgo_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (0)]);
 //BA.debugLineNum = 770;BA.debugLine="Dim Dscrpcion_Tipo_Labranza As String = rowTipo";
_dscrpcion_tipo_labranza = BA.ObjectToString(_rowtipolabranza[(int) (1)]);
 //BA.debugLineNum = 771;BA.debugLine="SD_xComboBoxTipoLabranza.Add(Dscrpcion_Tipo_Lab";
parent._sd_xcomboboxtipolabranza._add /*String*/ (_dscrpcion_tipo_labranza,(Object)(_cdgo_tipo_labranza));
 //BA.debugLineNum = 772;BA.debugLine="ItemsLabranza.Add(Cdgo_Variedad&\":\"&Dscrpcion_T";
_itemslabranza.Add((Object)(_cdgo_variedad+":"+_dscrpcion_tipo_labranza));
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
 //BA.debugLineNum = 775;BA.debugLine="Log(\"Error en la consulta de Tipo_Labranza: \" &";
parent.__c.LogImpl("762849068","Error en la consulta de Tipo_Labranza: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 777;BA.debugLine="SearchTemplateTipoLabranza.SetItems(ItemsLabranza";
parent._searchtemplatetipolabranza._setitems /*Object*/ (_itemslabranza);
 //BA.debugLineNum = 778;BA.debugLine="j4.Release";
_j4._release /*String*/ ();
 //BA.debugLineNum = 780;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _req_tipolabranza_result(b4a.example.ef.main._dbresult _restipolabranza) throws Exception{
}
public String  _removeform0ifexists() throws Exception{
int _i = 0;
 //BA.debugLineNum = 617;BA.debugLine="Private Sub RemoveForm0IfExists";
 //BA.debugLineNum = 619;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_customlistview1geral._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 620;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form0\" Th";
if ((_customlistview1geral._getvalue(_i)).equals((Object)("form0"))) { 
 //BA.debugLineNum = 621;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
_customlistview1geral._removeat(_i);
 //BA.debugLineNum = 622;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
return "";
}
public String  _removeform2ifexists() throws Exception{
int _i = 0;
 //BA.debugLineNum = 628;BA.debugLine="Private Sub RemoveForm2IfExists";
 //BA.debugLineNum = 630;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_customlistview1geral._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 631;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form2\" Th";
if ((_customlistview1geral._getvalue(_i)).equals((Object)("form2"))) { 
 //BA.debugLineNum = 632;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
_customlistview1geral._removeat(_i);
 //BA.debugLineNum = 633;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return "";
}
public String  _removeform3ifexists() throws Exception{
int _i = 0;
 //BA.debugLineNum = 638;BA.debugLine="Private Sub RemoveForm3IfExists";
 //BA.debugLineNum = 640;BA.debugLine="For i = 0 To CustomListView1Geral.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_customlistview1geral._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 641;BA.debugLine="If CustomListView1Geral.GetValue(i) = \"form3\" Th";
if ((_customlistview1geral._getvalue(_i)).equals((Object)("form3"))) { 
 //BA.debugLineNum = 642;BA.debugLine="CustomListView1Geral.RemoveAt(i)";
_customlistview1geral._removeat(_i);
 //BA.debugLineNum = 643;BA.debugLine="Exit ' Salir después de eliminar el elemento";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 646;BA.debugLine="End Sub";
return "";
}
public String  _removeinsumofromdata(int _insumoid) throws Exception{
int _i = 0;
Object[] _arrayelement = null;
 //BA.debugLineNum = 865;BA.debugLine="Sub RemoveInsumoFromData(insumoID As Int)";
 //BA.debugLineNum = 867;BA.debugLine="For i = data.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_data.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 869;BA.debugLine="Dim arrayElement() As Object = data.Get(i)";
_arrayelement = (Object[])(_data.Get(_i));
 //BA.debugLineNum = 872;BA.debugLine="If arrayElement(0) = insumoID Then";
if ((_arrayelement[(int) (0)]).equals((Object)(_insumoid))) { 
 //BA.debugLineNum = 874;BA.debugLine="data.RemoveAt(i)";
_data.RemoveAt(_i);
 //BA.debugLineNum = 875;BA.debugLine="B4XTable1.SetData(data)";
_b4xtable1._setdata /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_data);
 };
 }
};
 //BA.debugLineNum = 879;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxcodigovariedad_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 649;BA.debugLine="Private Sub SD_xComboBoxCodigoVariedad_ItemClick (";
 //BA.debugLineNum = 650;BA.debugLine="codigoSiembra = Value";
_codigosiembra = BA.ObjectToString(_value);
 //BA.debugLineNum = 652;BA.debugLine="Log(\"codigo \" & codigoSiembra)";
__c.LogImpl("762259203","codigo "+_codigosiembra,0);
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxelemento_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 516;BA.debugLine="Private Sub SD_xComboBoxElemento_ItemClick (Positi";
 //BA.debugLineNum = 519;BA.debugLine="elementoGasto = Value";
_elementogasto = BA.ObjectToString(_value);
 //BA.debugLineNum = 522;BA.debugLine="If elementoGasto.Length > 0 Then";
if (_elementogasto.length()>0) { 
 //BA.debugLineNum = 523;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, Min(";
_elementogasto = _elementogasto.substring((int) (0),(int) (__c.Min(2,_elementogasto.length())));
 }else {
 //BA.debugLineNum = 525;BA.debugLine="elementoGasto = \"\" ' Si está vacío, asignar cade";
_elementogasto = "";
 };
 //BA.debugLineNum = 529;BA.debugLine="Log(\"Las dos primeras letras (o menos si no hay s";
__c.LogImpl("761538317","Las dos primeras letras (o menos si no hay suficientes): "+_elementogasto,0);
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
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
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 467;BA.debugLine="haciendaCBX=Value";
parent._haciendacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 469;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 470;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 471;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 474;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 477;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 479;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 480;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 484;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 485;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
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
 //BA.debugLineNum = 493;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("761341723","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 497;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 500;BA.debugLine="Log(\"Hacienda\" & haciendaCBX)";
parent.__c.LogImpl("761341730","Hacienda"+parent._haciendacbx,0);
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxinsumo_itemclick(int _position,Object _value) throws Exception{
String[] _partes = null;
 //BA.debugLineNum = 810;BA.debugLine="Private Sub SD_xComboBoxInsumo_ItemClick (Position";
 //BA.debugLineNum = 811;BA.debugLine="Dim partes() As String = Regex.Split(\" - \", Value";
_partes = __c.Regex.Split(" - ",BA.ObjectToString(_value));
 //BA.debugLineNum = 812;BA.debugLine="NAMEINSUMO = partes(0)";
_nameinsumo = _partes[(int) (0)];
 //BA.debugLineNum = 813;BA.debugLine="IDINSUMO = partes(1)";
_idinsumo = _partes[(int) (1)];
 //BA.debugLineNum = 814;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 509;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
 //BA.debugLineNum = 511;BA.debugLine="elementoLabor = Value";
_elementolabor = BA.ObjectToString(_value);
 //BA.debugLineNum = 513;BA.debugLine="Log(\"Elemento labor\" & elementoLabor)";
__c.LogImpl("761472772","Elemento labor"+_elementolabor,0);
 //BA.debugLineNum = 514;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 503;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
 //BA.debugLineNum = 505;BA.debugLine="loteCBX = Value";
_lotecbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 506;BA.debugLine="Log(\"Lotecbx\" & loteCBX)";
__c.LogImpl("761407235","Lotecbx"+_lotecbx,0);
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
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
anywheresoftware.b4a.BA.IterableList group9;
int index9;
int groupLen9;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 430;BA.debugLine="nitEmpresaCBX=Value";
parent._nitempresacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 432;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 433;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 434;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",new Object[]{_value});
 //BA.debugLineNum = 437;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 440;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 442;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 443;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 447;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 448;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 449;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
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
 //BA.debugLineNum = 457;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("761276188","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 460;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 463;BA.debugLine="Log(\"Nit seleccionado\" &  nitEmpresaCBX)";
parent.__c.LogImpl("761276194","Nit seleccionado"+parent._nitempresacbx,0);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxtipolabranza_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 681;BA.debugLine="Private Sub SD_xComboBoxTipoLabranza_ItemClick (Po";
 //BA.debugLineNum = 683;BA.debugLine="tipoLabranzaSiembra = Value";
_tipolabranzasiembra = BA.ObjectToString(_value);
 //BA.debugLineNum = 685;BA.debugLine="Log(\"tipo labranza \"&tipoLabranzaSiembra)";
__c.LogImpl("762586884","tipo labranza "+_tipolabranzasiembra,0);
 //BA.debugLineNum = 686;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtiporiego_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 609;BA.debugLine="Private Sub SD_xComboBoxTipoRiego_ItemClick (Posit";
 //BA.debugLineNum = 610;BA.debugLine="tipoRiego = Value";
_tiporiego = BA.ObjectToString(_value);
 //BA.debugLineNum = 612;BA.debugLine="Log(\"tipo riego\" & tipoRiego)";
__c.LogImpl("761997059","tipo riego"+_tiporiego,0);
 //BA.debugLineNum = 614;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxtypeform_itemclick(int _position,Object _value) throws Exception{
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;
 //BA.debugLineNum = 548;BA.debugLine="Private Sub SD_xComboBoxTypeForm_ItemClick (Positi";
 //BA.debugLineNum = 550;BA.debugLine="tipoLabor = Value";
_tipolabor = BA.ObjectToString(_value);
 //BA.debugLineNum = 552;BA.debugLine="If IsNumber(Value) Then";
if (__c.IsNumber(BA.ObjectToString(_value))) { 
 //BA.debugLineNum = 553;BA.debugLine="Select Case Value";
switch (BA.switchObjectToInt(_value,(Object)(0),(Object)(1),(Object)(2))) {
case 0: {
 //BA.debugLineNum = 555;BA.debugLine="RemoveForm2IfExists";
_removeform2ifexists();
 //BA.debugLineNum = 556;BA.debugLine="RemoveForm3IfExists";
_removeform3ifexists();
 //BA.debugLineNum = 557;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"for";
_customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createiteminsumo().getObject())),(Object)("form0"));
 //BA.debugLineNum = 558;BA.debugLine="LlenarComboBoxInsumo";
_llenarcomboboxinsumo();
 //BA.debugLineNum = 559;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.";
_insumocolum = _b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("#",_b4xtable1._column_type_numbers /*int*/ );
 //BA.debugLineNum = 560;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = __c.DipToCurrent((int) (50));
 //BA.debugLineNum = 561;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYP";
_b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("ID",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 562;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN";
_b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("NOMBRE",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 563;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLU";
_b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("CANTIDAD",_b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 565;BA.debugLine="cantidadInsumos = 0";
_cantidadinsumos = (int) (0);
 //BA.debugLineNum = 566;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
_labelcantidadinsumos.setText(BA.ObjectToCharSequence(_cantidadinsumos));
 //BA.debugLineNum = 567;BA.debugLine="CANTINSUMO = \"\"";
_cantinsumo = "";
 break; }
case 1: {
 //BA.debugLineNum = 569;BA.debugLine="RemoveForm0IfExists";
_removeform0ifexists();
 //BA.debugLineNum = 570;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exis";
_removeform2ifexists();
 //BA.debugLineNum = 571;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"fo";
_customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitemsiembra().getObject())),(Object)("form3"));
 //BA.debugLineNum = 572;BA.debugLine="LlenarComboBoxSiembra";
_llenarcomboboxsiembra();
 break; }
case 2: {
 //BA.debugLineNum = 574;BA.debugLine="RemoveForm0IfExists";
_removeform0ifexists();
 //BA.debugLineNum = 575;BA.debugLine="RemoveForm3IfExists";
_removeform3ifexists();
 //BA.debugLineNum = 576;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"for";
_customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_createitemriego().getObject())),(Object)("form2"));
 //BA.debugLineNum = 577;BA.debugLine="LlenarComboBoxRiego";
_llenarcomboboxriego();
 break; }
default: {
 //BA.debugLineNum = 580;BA.debugLine="Log(\"Valor no reconocido: \" & Value)";
__c.LogImpl("761734944","Valor no reconocido: "+BA.ObjectToString(_value),0);
 break; }
}
;
 }else {
 //BA.debugLineNum = 583;BA.debugLine="Log(\"Error: Value no es un número válido.\")";
__c.LogImpl("761734947","Error: Value no es un número válido.",0);
 };
 //BA.debugLineNum = 586;BA.debugLine="Log(\"Tipo labor \" & tipoLabor)";
__c.LogImpl("761734950","Tipo labor "+_tipolabor,0);
 //BA.debugLineNum = 587;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonelemento_click() throws Exception{
ResumableSub_SwiftButtonElemento_Click rsub = new ResumableSub_SwiftButtonElemento_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonElemento_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonElemento_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1343;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateEleme";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateelemento),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1345;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 10;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1346;BA.debugLine="SwiftButtonElemento.xLBL.Text = SearchTemplateEl";
parent._swiftbuttonelemento._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateelemento._selecteditem /*String*/ ));
 //BA.debugLineNum = 1347;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplateelemento._selecteditem /*String*/ );
 //BA.debugLineNum = 1348;BA.debugLine="elementoGasto = Partes(0) ' Asignar solo la prim";
parent._elementogasto = _partes[(int) (0)];
 //BA.debugLineNum = 1351;BA.debugLine="If elementoGasto.Length >= 2 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._elementogasto.length()>=2) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 1352;BA.debugLine="elementoGasto = elementoGasto.SubString2(0, 2)";
parent._elementogasto = parent._elementogasto.substring((int) (0),(int) (2));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 1355;BA.debugLine="elementoGasto = elementoGasto";
parent._elementogasto = parent._elementogasto;
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 1358;BA.debugLine="Log(elementoGasto)";
parent.__c.LogImpl("763897616",parent._elementogasto,0);
 //BA.debugLineNum = 1359;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public void  _swiftbuttonhacienda_click() throws Exception{
ResumableSub_SwiftButtonHacienda_Click rsub = new ResumableSub_SwiftButtonHacienda_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonHacienda_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
anywheresoftware.b4a.objects.collections.List _itemslote = null;
int _result = 0;
String _haciendacompleto = "";
String[] _partes = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1269;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1270;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
 //BA.debugLineNum = 1272;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatehacienda),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1273;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1274;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
parent._swiftbuttonhacienda._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatehacienda._selecteditem /*String*/ ));
 //BA.debugLineNum = 1275;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = parent._searchtemplatehacienda._selecteditem /*String*/ ;
 //BA.debugLineNum = 1276;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
 //BA.debugLineNum = 1277;BA.debugLine="haciendaCBX = Partes(0)";
parent._haciendacbx = _partes[(int) (0)];
 //BA.debugLineNum = 1278;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
 //BA.debugLineNum = 1279;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 1280;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
parent._swiftbuttonlote._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1282;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 1283;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 1284;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 1287;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1290;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1292;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 1293;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 1297;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 10;
group19 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_row = (Object[])(group19.Get(index19));}
if (true) break;

case 19:
//C
this.state = 18;
index19++;
if (true) break;

case 9:
//C
this.state = 19;
 //BA.debugLineNum = 1298;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 1302;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
_itemslote.Add((Object)(_codg_hacienda));
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
 //BA.debugLineNum = 1307;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("763701031","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 1309;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
parent._searchtemplatelote._setitems /*Object*/ (_itemslote);
 //BA.debugLineNum = 1310;BA.debugLine="SwiftButtonLote.Enabled = True";
parent._swiftbuttonlote._setenabled /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 1311;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("763701035",parent._haciendacbx,0);
 //BA.debugLineNum = 1313;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 1316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttoninsumo_click() throws Exception{
ResumableSub_SwiftButtonInsumo_Click rsub = new ResumableSub_SwiftButtonInsumo_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonInsumo_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonInsumo_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String _insumocompleto = "";
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1406;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateInsum";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateinsumo),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1407;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1408;BA.debugLine="SwiftButtonInsumo.xLBL.Text = SearchTemplateInsu";
parent._swiftbuttoninsumo._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateinsumo._selecteditem /*String*/ ));
 //BA.debugLineNum = 1409;BA.debugLine="Dim INSUMOCOMPLETO As String = SearchTemplateIns";
_insumocompleto = parent._searchtemplateinsumo._selecteditem /*String*/ ;
 //BA.debugLineNum = 1410;BA.debugLine="Dim partes() As String = Regex.Split(\":\", INSUMO";
_partes = parent.__c.Regex.Split(":",_insumocompleto);
 //BA.debugLineNum = 1411;BA.debugLine="NAMEINSUMO = partes(1)";
parent._nameinsumo = _partes[(int) (1)];
 //BA.debugLineNum = 1412;BA.debugLine="IDINSUMO = partes(0)";
parent._idinsumo = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1414;BA.debugLine="Log(IDINSUMO)";
parent.__c.LogImpl("764028681",parent._idinsumo,0);
 //BA.debugLineNum = 1415;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlabor_click() throws Exception{
ResumableSub_SwiftButtonLabor_Click rsub = new ResumableSub_SwiftButtonLabor_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLabor_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1331;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatelabor),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1333;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1334;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
parent._swiftbuttonlabor._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatelabor._selecteditem /*String*/ ));
 //BA.debugLineNum = 1335;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatelabor._selecteditem /*String*/ );
 //BA.debugLineNum = 1336;BA.debugLine="elementoLabor = Partes(0) ' Asignar solo la prim";
parent._elementolabor = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1338;BA.debugLine="Log(elementoLabor)";
parent.__c.LogImpl("763832072",parent._elementolabor,0);
 //BA.debugLineNum = 1339;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlote_click() throws Exception{
ResumableSub_SwiftButtonLote_Click rsub = new ResumableSub_SwiftButtonLote_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLote_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1319;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatelote),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1321;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1322;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
parent._swiftbuttonlote._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatelote._selecteditem /*String*/ ));
 //BA.debugLineNum = 1323;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatelote._selecteditem /*String*/ );
 //BA.debugLineNum = 1324;BA.debugLine="loteCBX = Partes(0) ' Asignar solo la primera pa";
parent._lotecbx = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1327;BA.debugLine="Log(loteCBX)";
parent.__c.LogImpl("763766537",parent._lotecbx,0);
 //BA.debugLineNum = 1328;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonnit_click() throws Exception{
ResumableSub_SwiftButtonNit_Click rsub = new ResumableSub_SwiftButtonNit_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonNit_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
anywheresoftware.b4a.objects.collections.List _itemshacienda = null;
int _result = 0;
String _nitcompleto = "";
String[] _partes = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
String _nombrehacienda = "";
anywheresoftware.b4a.BA.IterableList group19;
int index19;
int groupLen19;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1218;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1219;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
 //BA.debugLineNum = 1220;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatenit),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1221;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1222;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
parent._swiftbuttonnit._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatenit._selecteditem /*String*/ ));
 //BA.debugLineNum = 1223;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = parent._searchtemplatenit._selecteditem /*String*/ ;
 //BA.debugLineNum = 1224;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
 //BA.debugLineNum = 1225;BA.debugLine="nitEmpresaCBX = Partes(0)";
parent._nitempresacbx = _partes[(int) (0)];
 //BA.debugLineNum = 1226;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
 //BA.debugLineNum = 1227;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 1228;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
parent._swiftbuttonhacienda._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 1230;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 1231;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 1232;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = parent._createcommand("select_haciendas",new Object[]{(Object)(parent._nitempresacbx)});
 //BA.debugLineNum = 1235;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 1238;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 13;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 12;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1240;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 1241;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 1245;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 7:
//for
this.state = 10;
group19 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index19 = 0;
groupLen19 = group19.getSize();
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if (index19 < groupLen19) {
this.state = 9;
_row = (Object[])(group19.Get(index19));}
if (true) break;

case 19:
//C
this.state = 18;
index19++;
if (true) break;

case 9:
//C
this.state = 19;
 //BA.debugLineNum = 1246;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 1247;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 1252;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
_itemshacienda.Add((Object)(_codg_hacienda+":"+_nombrehacienda));
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
 //BA.debugLineNum = 1257;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("763635496","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 1259;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
parent._searchtemplatehacienda._setitems /*Object*/ (_itemshacienda);
 //BA.debugLineNum = 1260;BA.debugLine="SwiftButtonHacienda.Enabled = True";
parent._swiftbuttonhacienda._setenabled /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 1261;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("763635500",parent._nitempresacbx,0);
 //BA.debugLineNum = 1263;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 1266;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonriego_click() throws Exception{
ResumableSub_SwiftButtonRiego_Click rsub = new ResumableSub_SwiftButtonRiego_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonRiego_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonRiego_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1418;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateRiego";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateriego),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1420;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1421;BA.debugLine="SwiftButtonRiego.xLBL.Text = SearchTemplateRiego";
parent._swiftbuttonriego._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateriego._selecteditem /*String*/ ));
 //BA.debugLineNum = 1422;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplateriego._selecteditem /*String*/ );
 //BA.debugLineNum = 1423;BA.debugLine="tipoRiego = Partes(0) ' Asignar solo la primera";
parent._tiporiego = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1425;BA.debugLine="Log(tipoRiego)";
parent.__c.LogImpl("764094216",parent._tiporiego,0);
 //BA.debugLineNum = 1426;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttontipolabranza_click() throws Exception{
ResumableSub_SwiftButtonTipoLabranza_Click rsub = new ResumableSub_SwiftButtonTipoLabranza_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonTipoLabranza_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTipoLabranza_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1430;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTipoL";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatetipolabranza),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1432;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1433;BA.debugLine="SwiftButtonTipoLabranza.xLBL.Text = SearchTempla";
parent._swiftbuttontipolabranza._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatetipolabranza._selecteditem /*String*/ ));
 //BA.debugLineNum = 1434;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatetipolabranza._selecteditem /*String*/ );
 //BA.debugLineNum = 1437;BA.debugLine="tipoLabranzaSiembra = Partes(0)";
parent._tipolabranzasiembra = _partes[(int) (0)];
 //BA.debugLineNum = 1438;BA.debugLine="If tipoLabranzaSiembra.Length >= 2 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._tipolabranzasiembra.length()>=2) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 1439;BA.debugLine="tipoLabranzaSiembra = tipoLabranzaSiembra.SubSt";
parent._tipolabranzasiembra = parent._tipolabranzasiembra.substring((int) (parent._tipolabranzasiembra.length()-2));
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 1443;BA.debugLine="Log(tipoLabranzaSiembra)";
parent.__c.LogImpl("764159758",parent._tipolabranzasiembra,0);
 //BA.debugLineNum = 1444;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttontypeform_click() throws Exception{
ResumableSub_SwiftButtonTypeForm_Click rsub = new ResumableSub_SwiftButtonTypeForm_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonTypeForm_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTypeForm_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String _typeformcompleto = "";
String[] _partes = null;
String _tipoform = "";
b4a.example.ef.b4xtable._b4xtablecolumn _insumocolum = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1363;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTypeF";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatetypeform),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1364;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1365;BA.debugLine="SwiftButtonTypeForm.xLBL.Text = SearchTemplateTy";
parent._swiftbuttontypeform._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatetypeform._selecteditem /*String*/ ));
 //BA.debugLineNum = 1366;BA.debugLine="Dim TYPEFORMCOMPLETO As String = SearchTemplateT";
_typeformcompleto = parent._searchtemplatetypeform._selecteditem /*String*/ ;
 //BA.debugLineNum = 1367;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", TYPEFO";
_partes = parent.__c.Regex.Split(":",_typeformcompleto);
 //BA.debugLineNum = 1368;BA.debugLine="tipoLabor = Partes(0)";
parent._tipolabor = _partes[(int) (0)];
 //BA.debugLineNum = 1369;BA.debugLine="Log(tipoLabor)";
parent.__c.LogImpl("763963143",parent._tipolabor,0);
 //BA.debugLineNum = 1370;BA.debugLine="Dim tipoForm As String = Partes(0)";
_tipoform = _partes[(int) (0)];
 //BA.debugLineNum = 1372;BA.debugLine="Select Case tipoForm";
if (true) break;

case 4:
//select
this.state = 13;
switch (BA.switchObjectToInt(_tipoform,"0","1","2")) {
case 0: {
this.state = 6;
if (true) break;
}
case 1: {
this.state = 8;
if (true) break;
}
case 2: {
this.state = 10;
if (true) break;
}
default: {
this.state = 12;
if (true) break;
}
}
if (true) break;

case 6:
//C
this.state = 13;
 //BA.debugLineNum = 1374;BA.debugLine="RemoveForm2IfExists";
parent._removeform2ifexists();
 //BA.debugLineNum = 1375;BA.debugLine="RemoveForm3IfExists";
parent._removeform3ifexists();
 //BA.debugLineNum = 1376;BA.debugLine="CustomListView1Geral.Add(CreateItemInsumo,\"form";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createiteminsumo().getObject())),(Object)("form0"));
 //BA.debugLineNum = 1377;BA.debugLine="LlenarComboBoxInsumo";
parent._llenarcomboboxinsumo();
 //BA.debugLineNum = 1378;BA.debugLine="Dim INSUMOCOLUM As B4XTableColumn = B4XTable1.A";
_insumocolum = parent._b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("#",parent._b4xtable1._column_type_numbers /*int*/ );
 //BA.debugLineNum = 1379;BA.debugLine="INSUMOCOLUM.Width = 50dip";
_insumocolum.Width /*int*/  = parent.__c.DipToCurrent((int) (50));
 //BA.debugLineNum = 1380;BA.debugLine="B4XTable1.AddColumn(\"ID\", B4XTable1.COLUMN_TYPE";
parent._b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("ID",parent._b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 1381;BA.debugLine="B4XTable1.AddColumn(\"NOMBRE\", B4XTable1.COLUMN_";
parent._b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("NOMBRE",parent._b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 1382;BA.debugLine="B4XTable1.AddColumn(\"CANTIDAD\", B4XTable1.COLUM";
parent._b4xtable1._addcolumn /*b4a.example.ef.b4xtable._b4xtablecolumn*/ ("CANTIDAD",parent._b4xtable1._column_type_text /*int*/ );
 //BA.debugLineNum = 1384;BA.debugLine="cantidadInsumos = 0";
parent._cantidadinsumos = (int) (0);
 //BA.debugLineNum = 1385;BA.debugLine="LabelCantidadInsumos.Text = cantidadInsumos";
parent._labelcantidadinsumos.setText(BA.ObjectToCharSequence(parent._cantidadinsumos));
 //BA.debugLineNum = 1386;BA.debugLine="CANTINSUMO = \"\"";
parent._cantinsumo = "";
 if (true) break;

case 8:
//C
this.state = 13;
 //BA.debugLineNum = 1388;BA.debugLine="RemoveForm0IfExists";
parent._removeform0ifexists();
 //BA.debugLineNum = 1389;BA.debugLine="RemoveForm2IfExists ' Eliminar \"form2\" si exist";
parent._removeform2ifexists();
 //BA.debugLineNum = 1390;BA.debugLine="CustomListView1Geral.Add(CreateItemSiembra,\"for";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitemsiembra().getObject())),(Object)("form3"));
 //BA.debugLineNum = 1391;BA.debugLine="LlenarComboBoxSiembra";
parent._llenarcomboboxsiembra();
 if (true) break;

case 10:
//C
this.state = 13;
 //BA.debugLineNum = 1393;BA.debugLine="RemoveForm0IfExists";
parent._removeform0ifexists();
 //BA.debugLineNum = 1394;BA.debugLine="RemoveForm3IfExists";
parent._removeform3ifexists();
 //BA.debugLineNum = 1395;BA.debugLine="CustomListView1Geral.Add(CreateItemRiego, \"form";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitemriego().getObject())),(Object)("form2"));
 //BA.debugLineNum = 1396;BA.debugLine="LlenarComboBoxRiego";
parent._llenarcomboboxriego();
 if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 1399;BA.debugLine="Log(\"Valor no reconocido: \" & tipoForm)";
parent.__c.LogImpl("763963173","Valor no reconocido: "+_tipoform,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 1403;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonvariedad_click() throws Exception{
ResumableSub_SwiftButtonVariedad_Click rsub = new ResumableSub_SwiftButtonVariedad_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonVariedad_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonVariedad_Click(b4a.example.ef.formlabores parent) {
this.parent = parent;
}
b4a.example.ef.formlabores parent;
int _result = 0;
String[] _partes = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1448;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateVarie";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatevariedad),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1450;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 1451;BA.debugLine="SwiftButtonVariedad.xLBL.Text = SearchTemplateVa";
parent._swiftbuttonvariedad._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatevariedad._selecteditem /*String*/ ));
 //BA.debugLineNum = 1452;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatevariedad._selecteditem /*String*/ );
 //BA.debugLineNum = 1453;BA.debugLine="codigoSiembra = Partes(0)";
parent._codigosiembra = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1455;BA.debugLine="Log(codigoSiembra)";
parent.__c.LogImpl("764225288",parent._codigosiembra,0);
 //BA.debugLineNum = 1456;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
