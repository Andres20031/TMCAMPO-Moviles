package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formmaquinaria extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.formmaquinaria");
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
public b4a.example.ef.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public b4a.example.ef.swiftbutton _swiftbuttonmaquina = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatemaquina = null;
public b4a.example.ef.swiftbutton _swiftbuttonlabor = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatelabor = null;
public b4a.example.ef.swiftbutton _swiftbuttonnit = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatenit = null;
public b4a.example.ef.swiftbutton _swiftbuttonhacienda = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatehacienda = null;
public b4a.example.ef.swiftbutton _swiftbuttonlote = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplatelote = null;
public b4a.example.ef.swiftbutton _swiftbuttonimplemento = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateimplemento = null;
public b4a.example.ef.swiftbutton _swiftbuttonimplemento2 = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateimplemento2 = null;
public b4a.example.ef.swiftbutton _swiftbuttonoperario = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateoperario = null;
public b4a.example.ef.swiftbutton _swiftbuttonobservaciones = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateobservaciones = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 377;BA.debugLine="Private Sub AS_DatePicker1_SelectedDateChanged(Dat";
 //BA.debugLineNum = 379;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 382;BA.debugLine="formattedDate = formattedDate.Replace(\"/\", \"-\")";
_formatteddate = _formatteddate.replace("/","-");
 //BA.debugLineNum = 385;BA.debugLine="formattedDate = formattedDate & \" 00:00:00\"";
_formatteddate = _formatteddate+" 00:00:00";
 //BA.debugLineNum = 388;BA.debugLine="Label13Time.Text = formattedDate";
_label13time.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 391;BA.debugLine="Panel12.Visible = False";
_panel12.setVisible(__c.False);
 //BA.debugLineNum = 394;BA.debugLine="fecha = formattedDate";
_fecha = _formatteddate;
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
b4a.example.ef.dbrequestmanager _req = null;
anywheresoftware.b4a.objects.collections.List _itemsmaquina = null;
b4a.example.ef.main._dbcommand _cmdmaquina = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _resmaquina = null;
Object[] _rowmaquina = null;
String _codigomaquina = "";
String _descripcionmaquina = "";
anywheresoftware.b4a.objects.collections.List _itemslabormaquina = null;
b4a.example.ef.main._dbcommand _cmdlabormaquina = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _reslabormaquina = null;
Object[] _rowlabormaquina = null;
String _codigolabormaquina = "";
String _descripcionlabormaquina = "";
anywheresoftware.b4a.objects.collections.List _itemsnit = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _razonsocial = "";
String _nit = "";
anywheresoftware.b4a.objects.collections.List _itemsimplemento = null;
b4a.example.ef.main._dbcommand _cmdimple = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _resimple = null;
Object[] _rowimple = null;
String _codigoimple = "";
String _descripcionimple = "";
anywheresoftware.b4a.objects.collections.List _itemsoperario = null;
b4a.example.ef.main._dbcommand _cmdoper = null;
b4a.example.ef.httpjob _j5 = null;
b4a.example.ef.main._dbresult _resoper = null;
Object[] _rowoper = null;
String _codigooper = "";
String _apellido1 = "";
String _apellido2 = "";
String _nombre = "";
anywheresoftware.b4a.objects.collections.List _itemsobservaciones = null;
b4a.example.ef.main._dbcommand _cmdobser = null;
b4a.example.ef.httpjob _j6 = null;
b4a.example.ef.main._dbresult _resobser = null;
Object[] _rowobser = null;
String _codigoobser = "";
String _desobser = "";
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;
anywheresoftware.b4a.BA.IterableList group38;
int index38;
int groupLen38;
anywheresoftware.b4a.BA.IterableList group58;
int index58;
int groupLen58;
anywheresoftware.b4a.BA.IterableList group79;
int index79;
int groupLen79;
anywheresoftware.b4a.BA.IterableList group101;
int index101;
int groupLen101;
anywheresoftware.b4a.BA.IterableList group123;
int index123;
int groupLen123;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 109;BA.debugLine="utilClass.Initialize";
parent._utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 110;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,0xB40080";
parent._utilclass._setstatusbarcolor /*String*/ (parent.__c.Colors.White,((int)0xb4008000));
 //BA.debugLineNum = 111;BA.debugLine="Root.LoadLayout(\"form\")";
parent._root.LoadLayout("form",ba);
 //BA.debugLineNum = 112;BA.debugLine="CustomListView1Geral.DefaultTextBackgroundColor=0";
parent._customlistview1geral._defaulttextbackgroundcolor = ((int)0xff25253d);
 //BA.debugLineNum = 113;BA.debugLine="CustomListView1Geral.DefaultTextColor=Colors.Whit";
parent._customlistview1geral._defaulttextcolor = parent.__c.Colors.White;
 //BA.debugLineNum = 114;BA.debugLine="CustomListView1Geral.Add(CreateItem,\"form1\")";
parent._customlistview1geral._add((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(parent._createitem().getObject())),(Object)("form1"));
 //BA.debugLineNum = 116;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 117;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 120;BA.debugLine="SearchTemplateMaquina.Initialize";
parent._searchtemplatemaquina._initialize /*String*/ (ba);
 //BA.debugLineNum = 122;BA.debugLine="Dim itemsMaquina As List";
_itemsmaquina = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 123;BA.debugLine="itemsMaquina.Initialize";
_itemsmaquina.Initialize();
 //BA.debugLineNum = 124;BA.debugLine="itemsMaquina.Add(\"Seleccionar:\")";
_itemsmaquina.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 126;BA.debugLine="Dim cmdMaquina As DBCommand = CreateCommand(\"sele";
_cmdmaquina = parent._createcommand("select_maquina",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 127;BA.debugLine="Wait For (Req.ExecuteQuery(cmdMaquina, 0, Null))";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdmaquina,(int) (0),parent.__c.Null)));
this.state = 61;
return;
case 61:
//C
this.state = 1;
_j2 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 128;BA.debugLine="If j2.Success Then";
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
 //BA.debugLineNum = 129;BA.debugLine="Req.HandleJobAsync(j2, \"req_maquina\")";
_req._handlejobasync /*void*/ (_j2,"req_maquina");
 //BA.debugLineNum = 130;BA.debugLine="Wait For (Req) req_maquina_Result(resMaquina As";
parent.__c.WaitFor("req_maquina_result", ba, this, (Object)(_req));
this.state = 62;
return;
case 62:
//C
this.state = 4;
_resmaquina = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 131;BA.debugLine="For Each rowMaquina() As Object In resMaquina.Ro";
if (true) break;

case 4:
//for
this.state = 7;
group18 = _resmaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 63;
if (true) break;

case 63:
//C
this.state = 7;
if (index18 < groupLen18) {
this.state = 6;
_rowmaquina = (Object[])(group18.Get(index18));}
if (true) break;

case 64:
//C
this.state = 63;
index18++;
if (true) break;

case 6:
//C
this.state = 64;
 //BA.debugLineNum = 132;BA.debugLine="Dim codigoMaquina As String = rowMaquina(0) ' C";
_codigomaquina = BA.ObjectToString(_rowmaquina[(int) (0)]);
 //BA.debugLineNum = 133;BA.debugLine="Dim descripcionMaquina As String = rowMaquina(1";
_descripcionmaquina = BA.ObjectToString(_rowmaquina[(int) (1)]);
 //BA.debugLineNum = 134;BA.debugLine="SD_xComboBoxMaquina.Add(descripcionMaquina, cod";
parent._sd_xcomboboxmaquina._add /*String*/ (_descripcionmaquina,(Object)(_codigomaquina));
 //BA.debugLineNum = 135;BA.debugLine="itemsMaquina.Add(codigoMaquina&\":\"&descripcionM";
_itemsmaquina.Add((Object)(_codigomaquina+":"+_descripcionmaquina));
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
 //BA.debugLineNum = 138;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j2.Err";
parent.__c.LogImpl("259572254","Error en la consulta de Maquina: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 140;BA.debugLine="SearchTemplateMaquina.SetItems(itemsMaquina)";
parent._searchtemplatemaquina._setitems /*Object*/ (_itemsmaquina);
 //BA.debugLineNum = 141;BA.debugLine="j2.Release";
_j2._release /*String*/ ();
 //BA.debugLineNum = 147;BA.debugLine="SearchTemplateLabor.Initialize";
parent._searchtemplatelabor._initialize /*String*/ (ba);
 //BA.debugLineNum = 149;BA.debugLine="Dim itemsLaborMaquina As List";
_itemslabormaquina = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 150;BA.debugLine="itemsLaborMaquina.Initialize";
_itemslabormaquina.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="itemsLaborMaquina.Add(\"Seleccionar:\")";
_itemslabormaquina.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 153;BA.debugLine="Dim cmdLaborMaquina As DBCommand = CreateCommand(";
_cmdlabormaquina = parent._createcommand("select_labor_maq",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 154;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLaborMaquina, 0, Nu";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdlabormaquina,(int) (0),parent.__c.Null)));
this.state = 65;
return;
case 65:
//C
this.state = 11;
_j3 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 155;BA.debugLine="If j3.Success Then";
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
 //BA.debugLineNum = 156;BA.debugLine="Req.HandleJobAsync(j3, \"req_labormaquina\")";
_req._handlejobasync /*void*/ (_j3,"req_labormaquina");
 //BA.debugLineNum = 157;BA.debugLine="Wait For (Req) req_labormaquina_Result(resLaborM";
parent.__c.WaitFor("req_labormaquina_result", ba, this, (Object)(_req));
this.state = 66;
return;
case 66:
//C
this.state = 14;
_reslabormaquina = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 158;BA.debugLine="For Each rowLaborMaquina() As Object In resLabor";
if (true) break;

case 14:
//for
this.state = 17;
group38 = _reslabormaquina.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index38 = 0;
groupLen38 = group38.getSize();
this.state = 67;
if (true) break;

case 67:
//C
this.state = 17;
if (index38 < groupLen38) {
this.state = 16;
_rowlabormaquina = (Object[])(group38.Get(index38));}
if (true) break;

case 68:
//C
this.state = 67;
index38++;
if (true) break;

case 16:
//C
this.state = 68;
 //BA.debugLineNum = 159;BA.debugLine="Dim codigoLaborMaquina As String = rowLaborMaqu";
_codigolabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (0)]);
 //BA.debugLineNum = 160;BA.debugLine="Dim descripcionLaborMaquina As String = rowLabo";
_descripcionlabormaquina = BA.ObjectToString(_rowlabormaquina[(int) (1)]);
 //BA.debugLineNum = 161;BA.debugLine="SD_xComboBoxLabor.Add(descripcionLaborMaquina,";
parent._sd_xcomboboxlabor._add /*String*/ (_descripcionlabormaquina,(Object)(_codigolabormaquina));
 //BA.debugLineNum = 162;BA.debugLine="itemsLaborMaquina.Add(codigoLaborMaquina&\":\"&de";
_itemslabormaquina.Add((Object)(_codigolabormaquina+":"+_descripcionlabormaquina));
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
 //BA.debugLineNum = 165;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j3.Err";
parent.__c.LogImpl("259572281","Error en la consulta de Maquina: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 167;BA.debugLine="SearchTemplateLabor.SetItems(itemsLaborMaquina)";
parent._searchtemplatelabor._setitems /*Object*/ (_itemslabormaquina);
 //BA.debugLineNum = 168;BA.debugLine="j3.Release";
_j3._release /*String*/ ();
 //BA.debugLineNum = 172;BA.debugLine="SearchTemplateNit.Initialize";
parent._searchtemplatenit._initialize /*String*/ (ba);
 //BA.debugLineNum = 174;BA.debugLine="Dim itemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 175;BA.debugLine="itemsNit.Initialize";
_itemsnit.Initialize();
 //BA.debugLineNum = 176;BA.debugLine="itemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 178;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = parent._createcommand("select_nit",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 179;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 69;
return;
case 69:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 180;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 181;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 182;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 70;
return;
case 70:
//C
this.state = 24;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 183;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 24:
//for
this.state = 27;
group58 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index58 = 0;
groupLen58 = group58.getSize();
this.state = 71;
if (true) break;

case 71:
//C
this.state = 27;
if (index58 < groupLen58) {
this.state = 26;
_row = (Object[])(group58.Get(index58));}
if (true) break;

case 72:
//C
this.state = 71;
index58++;
if (true) break;

case 26:
//C
this.state = 72;
 //BA.debugLineNum = 184;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 185;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 186;BA.debugLine="SD_xComboBoxNit.Add(razonSocial & \" - \" & nit,";
parent._sd_xcomboboxnit._add /*String*/ (_razonsocial+" - "+_nit,(Object)(_nit));
 //BA.debugLineNum = 187;BA.debugLine="itemsNit.Add(nit&\":\"&razonSocial)";
_itemsnit.Add((Object)(_nit+":"+_razonsocial));
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
 //BA.debugLineNum = 190;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("259572306","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 192;BA.debugLine="SearchTemplateNit.SetItems(itemsNit)";
parent._searchtemplatenit._setitems /*Object*/ (_itemsnit);
 //BA.debugLineNum = 193;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 197;BA.debugLine="SearchTemplateImplemento.Initialize";
parent._searchtemplateimplemento._initialize /*String*/ (ba);
 //BA.debugLineNum = 198;BA.debugLine="SearchTemplateImplemento2.Initialize";
parent._searchtemplateimplemento2._initialize /*String*/ (ba);
 //BA.debugLineNum = 200;BA.debugLine="Dim itemsImplemento As List";
_itemsimplemento = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 201;BA.debugLine="itemsImplemento.Initialize";
_itemsimplemento.Initialize();
 //BA.debugLineNum = 202;BA.debugLine="itemsImplemento.Add(\"Seleccionar:\")";
_itemsimplemento.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 204;BA.debugLine="Dim cmdImple As DBCommand = CreateCommand(\"select";
_cmdimple = parent._createcommand("select_implemento",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 205;BA.debugLine="Wait For (Req.ExecuteQuery(cmdImple, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdimple,(int) (0),parent.__c.Null)));
this.state = 73;
return;
case 73:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 206;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 207;BA.debugLine="Req.HandleJobAsync(j4, \"req_imple\")";
_req._handlejobasync /*void*/ (_j4,"req_imple");
 //BA.debugLineNum = 208;BA.debugLine="Wait For (Req) req_imple_Result(resImple As DBRe";
parent.__c.WaitFor("req_imple_result", ba, this, (Object)(_req));
this.state = 74;
return;
case 74:
//C
this.state = 34;
_resimple = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 209;BA.debugLine="For Each rowImple() As Object In resImple.Rows";
if (true) break;

case 34:
//for
this.state = 37;
group79 = _resimple.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index79 = 0;
groupLen79 = group79.getSize();
this.state = 75;
if (true) break;

case 75:
//C
this.state = 37;
if (index79 < groupLen79) {
this.state = 36;
_rowimple = (Object[])(group79.Get(index79));}
if (true) break;

case 76:
//C
this.state = 75;
index79++;
if (true) break;

case 36:
//C
this.state = 76;
 //BA.debugLineNum = 210;BA.debugLine="Dim codigoImple As String = rowImple(0) ' Cdgo_";
_codigoimple = BA.ObjectToString(_rowimple[(int) (0)]);
 //BA.debugLineNum = 211;BA.debugLine="Dim descripcionImple As String = rowImple(1) '";
_descripcionimple = BA.ObjectToString(_rowimple[(int) (1)]);
 //BA.debugLineNum = 212;BA.debugLine="SD_xComboBoxImplemento.Add(descripcionImple, co";
parent._sd_xcomboboximplemento._add /*String*/ (_descripcionimple,(Object)(_codigoimple));
 //BA.debugLineNum = 213;BA.debugLine="SD_xComboBoxImplemento2.Add(descripcionImple, c";
parent._sd_xcomboboximplemento2._add /*String*/ (_descripcionimple,(Object)(_codigoimple));
 //BA.debugLineNum = 214;BA.debugLine="itemsImplemento.Add(codigoImple&\":\"&descripcion";
_itemsimplemento.Add((Object)(_codigoimple+":"+_descripcionimple));
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
 //BA.debugLineNum = 217;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j4.Err";
parent.__c.LogImpl("259572333","Error en la consulta de Maquina: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = 41;
;
 //BA.debugLineNum = 219;BA.debugLine="SearchTemplateImplemento.SetItems(itemsImplemento";
parent._searchtemplateimplemento._setitems /*Object*/ (_itemsimplemento);
 //BA.debugLineNum = 220;BA.debugLine="SearchTemplateImplemento2.SetItems(itemsImplement";
parent._searchtemplateimplemento2._setitems /*Object*/ (_itemsimplemento);
 //BA.debugLineNum = 221;BA.debugLine="j4.Release";
_j4._release /*String*/ ();
 //BA.debugLineNum = 225;BA.debugLine="SearchTemplateOperario.Initialize";
parent._searchtemplateoperario._initialize /*String*/ (ba);
 //BA.debugLineNum = 227;BA.debugLine="Dim itemsOperario As List";
_itemsoperario = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 228;BA.debugLine="itemsOperario.Initialize";
_itemsoperario.Initialize();
 //BA.debugLineNum = 229;BA.debugLine="itemsOperario.Add(\"Seleccionar:\")";
_itemsoperario.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 231;BA.debugLine="Dim cmdOper As DBCommand = CreateCommand(\"select_";
_cmdoper = parent._createcommand("select_operario",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 232;BA.debugLine="Wait For (Req.ExecuteQuery(cmdOper, 0, Null)) Job";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdoper,(int) (0),parent.__c.Null)));
this.state = 77;
return;
case 77:
//C
this.state = 41;
_j5 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 233;BA.debugLine="If j5.Success Then";
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
 //BA.debugLineNum = 234;BA.debugLine="Req.HandleJobAsync(j5, \"req_oper\")";
_req._handlejobasync /*void*/ (_j5,"req_oper");
 //BA.debugLineNum = 235;BA.debugLine="Wait For (Req) req_oper_Result(resOper As DBResu";
parent.__c.WaitFor("req_oper_result", ba, this, (Object)(_req));
this.state = 78;
return;
case 78:
//C
this.state = 44;
_resoper = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 236;BA.debugLine="For Each rowOper() As Object In resOper.Rows";
if (true) break;

case 44:
//for
this.state = 47;
group101 = _resoper.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index101 = 0;
groupLen101 = group101.getSize();
this.state = 79;
if (true) break;

case 79:
//C
this.state = 47;
if (index101 < groupLen101) {
this.state = 46;
_rowoper = (Object[])(group101.Get(index101));}
if (true) break;

case 80:
//C
this.state = 79;
index101++;
if (true) break;

case 46:
//C
this.state = 80;
 //BA.debugLineNum = 237;BA.debugLine="Dim codigoOper As String = rowOper(0)";
_codigooper = BA.ObjectToString(_rowoper[(int) (0)]);
 //BA.debugLineNum = 238;BA.debugLine="Dim apellido1 As String = rowOper(1)";
_apellido1 = BA.ObjectToString(_rowoper[(int) (1)]);
 //BA.debugLineNum = 239;BA.debugLine="Dim apellido2 As String = rowOper(2)";
_apellido2 = BA.ObjectToString(_rowoper[(int) (2)]);
 //BA.debugLineNum = 240;BA.debugLine="Dim nombre As String = rowOper(3)";
_nombre = BA.ObjectToString(_rowoper[(int) (3)]);
 //BA.debugLineNum = 241;BA.debugLine="SD_xComboBoxOperario.Add(apellido1&\" \"&apellido";
parent._sd_xcomboboxoperario._add /*String*/ (_apellido1+" "+_apellido2+" "+_nombre,(Object)(_codigooper));
 //BA.debugLineNum = 242;BA.debugLine="itemsOperario.Add(codigoOper&\":\"&apellido1&\" \"&";
_itemsoperario.Add((Object)(_codigooper+":"+_apellido1+" "+_apellido2+" "+_nombre));
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
 //BA.debugLineNum = 245;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j5.Err";
parent.__c.LogImpl("259572361","Error en la consulta de Maquina: "+_j5._errormessage /*String*/ ,0);
 if (true) break;

case 50:
//C
this.state = 51;
;
 //BA.debugLineNum = 247;BA.debugLine="SearchTemplateOperario.SetItems(itemsOperario)";
parent._searchtemplateoperario._setitems /*Object*/ (_itemsoperario);
 //BA.debugLineNum = 248;BA.debugLine="j5.Release";
_j5._release /*String*/ ();
 //BA.debugLineNum = 252;BA.debugLine="SearchTemplateObservaciones.Initialize";
parent._searchtemplateobservaciones._initialize /*String*/ (ba);
 //BA.debugLineNum = 254;BA.debugLine="Dim itemsObservaciones As List";
_itemsobservaciones = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 255;BA.debugLine="itemsObservaciones.Initialize";
_itemsobservaciones.Initialize();
 //BA.debugLineNum = 256;BA.debugLine="itemsObservaciones.Add(\"Seleccionar:\")";
_itemsobservaciones.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 257;BA.debugLine="Dim cmdObser As DBCommand = CreateCommand(\"select";
_cmdobser = parent._createcommand("select_observaciones",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 258;BA.debugLine="Wait For (Req.ExecuteQuery(cmdObser, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdobser,(int) (0),parent.__c.Null)));
this.state = 81;
return;
case 81:
//C
this.state = 51;
_j6 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 259;BA.debugLine="If j6.Success Then";
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
 //BA.debugLineNum = 260;BA.debugLine="Req.HandleJobAsync(j6, \"req_obser\")";
_req._handlejobasync /*void*/ (_j6,"req_obser");
 //BA.debugLineNum = 261;BA.debugLine="Wait For (Req) req_obser_Result(resObser As DBRe";
parent.__c.WaitFor("req_obser_result", ba, this, (Object)(_req));
this.state = 82;
return;
case 82:
//C
this.state = 54;
_resobser = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 262;BA.debugLine="For Each rowObser() As Object In resObser.Rows";
if (true) break;

case 54:
//for
this.state = 57;
group123 = _resobser.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index123 = 0;
groupLen123 = group123.getSize();
this.state = 83;
if (true) break;

case 83:
//C
this.state = 57;
if (index123 < groupLen123) {
this.state = 56;
_rowobser = (Object[])(group123.Get(index123));}
if (true) break;

case 84:
//C
this.state = 83;
index123++;
if (true) break;

case 56:
//C
this.state = 84;
 //BA.debugLineNum = 263;BA.debugLine="Dim codigoObser As String = rowObser(0)";
_codigoobser = BA.ObjectToString(_rowobser[(int) (0)]);
 //BA.debugLineNum = 264;BA.debugLine="Dim desObser As String = rowObser(1)";
_desobser = BA.ObjectToString(_rowobser[(int) (1)]);
 //BA.debugLineNum = 265;BA.debugLine="SD_xComboBoxObservaciones.Add(desObser ,codigoO";
parent._sd_xcomboboxobservaciones._add /*String*/ (_desobser,(Object)(_codigoobser));
 //BA.debugLineNum = 266;BA.debugLine="itemsObservaciones.Add(codigoObser&\":\"&desObser";
_itemsobservaciones.Add((Object)(_codigoobser+":"+_desobser));
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
 //BA.debugLineNum = 269;BA.debugLine="Log(\"Error en la consulta de Maquina: \" & j6.Err";
parent.__c.LogImpl("259572385","Error en la consulta de Maquina: "+_j6._errormessage /*String*/ ,0);
 if (true) break;

case 60:
//C
this.state = -1;
;
 //BA.debugLineNum = 271;BA.debugLine="SearchTemplateObservaciones.SetItems(itemsObserva";
parent._searchtemplateobservaciones._setitems /*Object*/ (_itemsobservaciones);
 //BA.debugLineNum = 272;BA.debugLine="j6.Release";
_j6._release /*String*/ ();
 //BA.debugLineNum = 275;BA.debugLine="SearchTemplateHacienda.Initialize";
parent._searchtemplatehacienda._initialize /*String*/ (ba);
 //BA.debugLineNum = 277;BA.debugLine="SearchTemplateLote.Initialize";
parent._searchtemplatelote._initialize /*String*/ (ba);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.ef.httpjob _j2) throws Exception{
}
public void  _req_maquina_result(b4a.example.ef.main._dbresult _resmaquina) throws Exception{
}
public void  _req_labormaquina_result(b4a.example.ef.main._dbresult _reslabormaquina) throws Exception{
}
public void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public void  _req_imple_result(b4a.example.ef.main._dbresult _resimple) throws Exception{
}
public void  _req_oper_result(b4a.example.ef.main._dbresult _resoper) throws Exception{
}
public void  _req_obser_result(b4a.example.ef.main._dbresult _resobser) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 94;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 96;BA.debugLine="Base = Root";
_base = _root;
 //BA.debugLineNum = 97;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 98;BA.debugLine="Dialog.Title = \"Buscador\"";
_dialog._title /*Object*/  = (Object)("Buscador");
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return "";
}
public void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;

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
 //BA.debugLineNum = 451;BA.debugLine="Ascdo_Maq_Mvto_Maq = \"CP\"";
parent._ascdo_maq_mvto_maq = "CP";
 //BA.debugLineNum = 453;BA.debugLine="horainicio = EditText1HoraInicio.Text";
parent._horainicio = parent._edittext1horainicio.getText();
 //BA.debugLineNum = 454;BA.debugLine="horafin = EditText2HoraFim.Text";
parent._horafin = parent._edittext2horafim.getText();
 //BA.debugLineNum = 455;BA.debugLine="combustible = EditText1.Text";
parent._combustible = parent._edittext1.getText();
 //BA.debugLineNum = 456;BA.debugLine="area = EditText2.Text";
parent._area = parent._edittext2.getText();
 //BA.debugLineNum = 457;BA.debugLine="user = Main.pUser";
parent._user = parent._main._puser /*String*/ ;
 //BA.debugLineNum = 459;BA.debugLine="fechaHoy = DateTime.Date(DateTime.Now) ' Esto te";
parent._fechahoy = parent.__c.DateTime.Date(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 460;BA.debugLine="fechaHoy = fechaHoy.Replace(\"/\", \"-\") ' Reemplaza";
parent._fechahoy = parent._fechahoy.replace("/","-");
 //BA.debugLineNum = 461;BA.debugLine="fechaHoy = fechaHoy & \" 00:00:00\" ' Agregar la";
parent._fechahoy = parent._fechahoy+" 00:00:00";
 //BA.debugLineNum = 463;BA.debugLine="horaActual = DateTime.Time(DateTime.Now)";
parent._horaactual = parent.__c.DateTime.Time(parent.__c.DateTime.getNow());
 //BA.debugLineNum = 464;BA.debugLine="DeviceName = GetDeviceName";
parent._devicename = parent._getdevicename();
 //BA.debugLineNum = 466;BA.debugLine="Log(\"Ascdo_Maq_Mvto_Maq: \" & Ascdo_Maq_Mvto_Maq)";
parent.__c.LogImpl("260489745","Ascdo_Maq_Mvto_Maq: "+parent._ascdo_maq_mvto_maq,0);
 //BA.debugLineNum = 467;BA.debugLine="Log(\"maquina: \" & maquina)";
parent.__c.LogImpl("260489746","maquina: "+parent._maquina,0);
 //BA.debugLineNum = 468;BA.debugLine="Log(\"fecha: \" & fecha)";
parent.__c.LogImpl("260489747","fecha: "+parent._fecha,0);
 //BA.debugLineNum = 469;BA.debugLine="Log(\"labor: \" & labor)";
parent.__c.LogImpl("260489748","labor: "+parent._labor,0);
 //BA.debugLineNum = 470;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("260489749","nitEmpresaCBX: "+parent._nitempresacbx,0);
 //BA.debugLineNum = 471;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("260489750","haciendaCBX: "+parent._haciendacbx,0);
 //BA.debugLineNum = 472;BA.debugLine="Log(\"Lote: \" & Lote)";
parent.__c.LogImpl("260489751","Lote: "+parent._lote,0);
 //BA.debugLineNum = 473;BA.debugLine="Log(\"implemento: \" & implemento)";
parent.__c.LogImpl("260489752","implemento: "+parent._implemento,0);
 //BA.debugLineNum = 474;BA.debugLine="Log(\"horainicio: \" & horainicio)";
parent.__c.LogImpl("260489753","horainicio: "+parent._horainicio,0);
 //BA.debugLineNum = 475;BA.debugLine="Log(\"horafin: \" & horafin)";
parent.__c.LogImpl("260489754","horafin: "+parent._horafin,0);
 //BA.debugLineNum = 476;BA.debugLine="Log(\"combustible: \" & combustible)";
parent.__c.LogImpl("260489755","combustible: "+parent._combustible,0);
 //BA.debugLineNum = 477;BA.debugLine="Log(\"observaciones: \" & observaciones)";
parent.__c.LogImpl("260489756","observaciones: "+parent._observaciones,0);
 //BA.debugLineNum = 478;BA.debugLine="Log(\"operario: \" & operario)";
parent.__c.LogImpl("260489757","operario: "+parent._operario,0);
 //BA.debugLineNum = 479;BA.debugLine="Log(\"implemento2: \" & implemento2)";
parent.__c.LogImpl("260489758","implemento2: "+parent._implemento2,0);
 //BA.debugLineNum = 480;BA.debugLine="Log(\"area: \" & area)";
parent.__c.LogImpl("260489759","area: "+parent._area,0);
 //BA.debugLineNum = 481;BA.debugLine="Log(\"fechaHoy: \" & fechaHoy)";
parent.__c.LogImpl("260489760","fechaHoy: "+parent._fechahoy,0);
 //BA.debugLineNum = 482;BA.debugLine="Log(\"horaActual: \" & horaActual)";
parent.__c.LogImpl("260489761","horaActual: "+parent._horaactual,0);
 //BA.debugLineNum = 483;BA.debugLine="Log(\"user: \" & user)";
parent.__c.LogImpl("260489762","user: "+parent._user,0);
 //BA.debugLineNum = 484;BA.debugLine="Log(\"DeviceName: \" & DeviceName)";
parent.__c.LogImpl("260489763","DeviceName: "+parent._devicename,0);
 //BA.debugLineNum = 487;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 488;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 491;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mvto";
_cmd = parent._createcommand("insert_Mvto_Maq",new Object[]{(Object)(parent._ascdo_maq_mvto_maq),(Object)(parent._maquina),(Object)(parent._fecha),(Object)(parent._labor),(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lote),(Object)(parent._implemento),(Object)(parent._horainicio),(Object)(parent._horafin),(Object)(parent._combustible),(Object)(parent._observaciones),(Object)(parent._operario),(Object)(parent._implemento2),(Object)(parent._area),(Object)(parent._fechahoy),(Object)(parent._horaactual),(Object)(parent._user),(Object)(parent._devicename)});
 //BA.debugLineNum = 494;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null)";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 495;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 498;BA.debugLine="Try";
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
 //BA.debugLineNum = 499;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 500;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\", \"";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 502;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.Error";
parent.__c.LogImpl("260489781","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
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
 //BA.debugLineNum = 505;BA.debugLine="Log(\"Error al agregar datos: \" & LastException.M";
parent.__c.LogImpl("260489784","Error al agregar datos: "+parent.__c.LastException(ba).getMessage(),0);
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 507;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 6;BA.debugLine="Private CustomListView1Geral As CustomListView";
_customlistview1geral = new b4a.example3.customlistview();
 //BA.debugLineNum = 7;BA.debugLine="Private Panel1geral As Panel";
_panel1geral = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Label1Back As Label";
_label1back = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private Label2Save As Label";
_label2save = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private SD_xComboBoxMaquina As SD_xComboBox";
_sd_xcomboboxmaquina = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 12;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 13;BA.debugLine="Private SD_xComboBoxNit As SD_xComboBox";
_sd_xcomboboxnit = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 14;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 15;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 16;BA.debugLine="Private SD_xComboBoxImplemento As SD_xComboBox";
_sd_xcomboboximplemento = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 17;BA.debugLine="Private SD_xComboBoxImplemento2 As SD_xComboBox";
_sd_xcomboboximplemento2 = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 18;BA.debugLine="Private SD_xComboBoxOperario As SD_xComboBox";
_sd_xcomboboxoperario = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 19;BA.debugLine="Private SD_xComboBoxObservaciones As SD_xComboBox";
_sd_xcomboboxobservaciones = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 22;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
 //BA.debugLineNum = 24;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 27;BA.debugLine="Private Panel2Time As Panel";
_panel2time = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 28;BA.debugLine="Private Label13Time As Label";
_label13time = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Dim fecha As String";
_fecha = "";
 //BA.debugLineNum = 34;BA.debugLine="Dim maquina As String";
_maquina = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim labor As String";
_labor = "";
 //BA.debugLineNum = 36;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
 //BA.debugLineNum = 37;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
 //BA.debugLineNum = 38;BA.debugLine="Dim Lote As String";
_lote = "";
 //BA.debugLineNum = 39;BA.debugLine="Dim implemento As String";
_implemento = "";
 //BA.debugLineNum = 40;BA.debugLine="Dim implemento2 As String";
_implemento2 = "";
 //BA.debugLineNum = 41;BA.debugLine="Dim operario As String";
_operario = "";
 //BA.debugLineNum = 42;BA.debugLine="Dim observaciones As String";
_observaciones = "";
 //BA.debugLineNum = 43;BA.debugLine="Dim horafin As String";
_horafin = "";
 //BA.debugLineNum = 44;BA.debugLine="Dim horainicio As String";
_horainicio = "";
 //BA.debugLineNum = 45;BA.debugLine="Dim combustible As String";
_combustible = "";
 //BA.debugLineNum = 46;BA.debugLine="Dim area As String";
_area = "";
 //BA.debugLineNum = 47;BA.debugLine="Dim horaActual As String";
_horaactual = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim user As String";
_user = "";
 //BA.debugLineNum = 49;BA.debugLine="Dim DeviceName As String";
_devicename = "";
 //BA.debugLineNum = 50;BA.debugLine="Dim Ascdo_Maq_Mvto_Maq As String";
_ascdo_maq_mvto_maq = "";
 //BA.debugLineNum = 51;BA.debugLine="Private EditText1HoraInicio As EditText";
_edittext1horainicio = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 52;BA.debugLine="Private EditText2HoraFim As EditText";
_edittext2horafim = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 53;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Private EditText2 As EditText";
_edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 55;BA.debugLine="Dim fechaHoy As String";
_fechahoy = "";
 //BA.debugLineNum = 57;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
 //BA.debugLineNum = 58;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private SwiftButtonMaquina As SwiftButton";
_swiftbuttonmaquina = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 60;BA.debugLine="Private SearchTemplateMaquina As B4XSearchTemplat";
_searchtemplatemaquina = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 62;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 63;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 65;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 66;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 68;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 69;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 71;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 72;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 74;BA.debugLine="Private SwiftButtonImplemento As SwiftButton";
_swiftbuttonimplemento = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 75;BA.debugLine="Private SearchTemplateImplemento As B4XSearchTemp";
_searchtemplateimplemento = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 77;BA.debugLine="Private SwiftButtonImplemento2 As SwiftButton";
_swiftbuttonimplemento2 = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 78;BA.debugLine="Private SearchTemplateImplemento2 As B4XSearchTem";
_searchtemplateimplemento2 = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 80;BA.debugLine="Private SwiftButtonOperario As SwiftButton";
_swiftbuttonoperario = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 81;BA.debugLine="Private SearchTemplateOperario As B4XSearchTempla";
_searchtemplateoperario = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 83;BA.debugLine="Private SwiftButtonObservaciones As SwiftButton";
_swiftbuttonobservaciones = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 84;BA.debugLine="Private SearchTemplateObservaciones As B4XSearchT";
_searchtemplateobservaciones = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 403;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 404;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 405;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 406;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 407;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 408;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.PanelWrapper  _createitem() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _panel = null;
 //BA.debugLineNum = 353;BA.debugLine="Private Sub CreateItem As Panel";
 //BA.debugLineNum = 355;BA.debugLine="Dim panel As B4XView = xui.CreatePanel(\"\")";
_panel = new anywheresoftware.b4a.objects.B4XViewWrapper();
_panel = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 356;BA.debugLine="panel.SetLayoutAnimated(1, 0, 0, 100%X, 500dip)";
_panel.SetLayoutAnimated((int) (1),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.DipToCurrent((int) (500)));
 //BA.debugLineNum = 359;BA.debugLine="panel.LoadLayout(\"addMaquinariaUI\")";
_panel.LoadLayout("addMaquinariaUI",ba);
 //BA.debugLineNum = 361;BA.debugLine="panel.Height=Panel1geral.Height";
_panel.setHeight(_panel1geral.getHeight());
 //BA.debugLineNum = 363;BA.debugLine="Return panel";
if (true) return (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_panel.getObject()));
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return null;
}
public String  _getdevicename() throws Exception{
anywheresoftware.b4a.phone.Phone _p = null;
String _manufacturer = "";
String _model = "";
 //BA.debugLineNum = 101;BA.debugLine="Sub GetDeviceName As String";
 //BA.debugLineNum = 102;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 103;BA.debugLine="Dim Manufacturer As String = p.Manufacturer";
_manufacturer = _p.getManufacturer();
 //BA.debugLineNum = 104;BA.debugLine="Dim Model As String = p.Model";
_model = _p.getModel();
 //BA.debugLineNum = 105;BA.debugLine="Return Manufacturer & \" \" & Model";
if (true) return _manufacturer+" "+_model;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 88;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public String  _label13time_click() throws Exception{
 //BA.debugLineNum = 371;BA.debugLine="Private Sub Label13Time_Click";
 //BA.debugLineNum = 372;BA.debugLine="Panel12.Visible = True";
_panel12.setVisible(__c.True);
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 509;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 510;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 511;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(int _position,Object _value) throws Exception{
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formmaquinaria parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 318;BA.debugLine="haciendaCBX=Value";
parent._haciendacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 320;BA.debugLine="SD_xComboBoxLote.Clear";
parent._sd_xcomboboxlote._clear /*String*/ ();
 //BA.debugLineNum = 321;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 322;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 323;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 326;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 329;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 331;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 332;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 336;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 337;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 340;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
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
 //BA.debugLineNum = 345;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("259703324","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 349;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboximplemento_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 427;BA.debugLine="Private Sub SD_xComboBoxImplemento_ItemClick (Posi";
 //BA.debugLineNum = 428;BA.debugLine="implemento = Value";
_implemento = BA.ObjectToString(_value);
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboximplemento2_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Private Sub SD_xComboBoxImplemento2_ItemClick (Pos";
 //BA.debugLineNum = 434;BA.debugLine="implemento2 = Value";
_implemento2 = BA.ObjectToString(_value);
 //BA.debugLineNum = 436;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlabor_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
 //BA.debugLineNum = 419;BA.debugLine="labor = Value";
_labor = BA.ObjectToString(_value);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
 //BA.debugLineNum = 423;BA.debugLine="Lote = Value";
_lote = BA.ObjectToString(_value);
 //BA.debugLineNum = 424;BA.debugLine="Log(Lote)";
__c.LogImpl("260162050",_lote,0);
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxmaquina_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Private Sub SD_xComboBoxMaquina_ItemClick (Positio";
 //BA.debugLineNum = 413;BA.debugLine="maquina =Value";
_maquina = BA.ObjectToString(_value);
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnit_itemclick(int _position,Object _value) throws Exception{
ResumableSub_SD_xComboBoxNit_ItemClick rsub = new ResumableSub_SD_xComboBoxNit_ItemClick(this,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNit_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNit_ItemClick(b4a.example.ef.formmaquinaria parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 283;BA.debugLine="nitEmpresaCBX=Value";
parent._nitempresacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 284;BA.debugLine="SD_xComboBoxHacienda.Clear";
parent._sd_xcomboboxhacienda._clear /*String*/ ();
 //BA.debugLineNum = 285;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 286;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 287;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",new Object[]{_value});
 //BA.debugLineNum = 290;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 293;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 295;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 296;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 12;
return;
case 12:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 300;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 301;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 302;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 305;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
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
 //BA.debugLineNum = 310;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("259637788","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 313;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxobservaciones_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 443;BA.debugLine="Private Sub SD_xComboBoxObservaciones_ItemClick (P";
 //BA.debugLineNum = 444;BA.debugLine="observaciones = Value";
_observaciones = BA.ObjectToString(_value);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxoperario_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 438;BA.debugLine="Private Sub SD_xComboBoxOperario_ItemClick (Positi";
 //BA.debugLineNum = 439;BA.debugLine="operario =Value";
_operario = BA.ObjectToString(_value);
 //BA.debugLineNum = 441;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonhacienda_click() throws Exception{
ResumableSub_SwiftButtonHacienda_Click rsub = new ResumableSub_SwiftButtonHacienda_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonHacienda_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 607;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 608;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
 //BA.debugLineNum = 610;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatehacienda),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 611;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 612;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
parent._swiftbuttonhacienda._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatehacienda._selecteditem /*String*/ ));
 //BA.debugLineNum = 613;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = parent._searchtemplatehacienda._selecteditem /*String*/ ;
 //BA.debugLineNum = 614;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
 //BA.debugLineNum = 615;BA.debugLine="haciendaCBX = Partes(0)";
parent._haciendacbx = _partes[(int) (0)];
 //BA.debugLineNum = 616;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
 //BA.debugLineNum = 617;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 618;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
parent._swiftbuttonlote._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 620;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 621;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 622;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 625;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 628;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 630;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 631;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 635;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 636;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 640;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
 //BA.debugLineNum = 645;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("260817447","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 647;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
parent._searchtemplatelote._setitems /*Object*/ (_itemslote);
 //BA.debugLineNum = 648;BA.debugLine="SwiftButtonLote.Enabled = True";
parent._swiftbuttonlote._setenabled /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 650;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("260817452",parent._haciendacbx,0);
 //BA.debugLineNum = 651;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 654;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public void  _swiftbuttonimplemento_click() throws Exception{
ResumableSub_SwiftButtonImplemento_Click rsub = new ResumableSub_SwiftButtonImplemento_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonImplemento_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonImplemento_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 670;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateimplemento),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 672;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 673;BA.debugLine="SwiftButtonImplemento.xLBL.Text = SearchTemplate";
parent._swiftbuttonimplemento._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateimplemento._selecteditem /*String*/ ));
 //BA.debugLineNum = 676;BA.debugLine="If SearchTemplateImplemento.SelectedItem.Contain";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._searchtemplateimplemento._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 677;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",parent._searchtemplateimplemento._selecteditem /*String*/ );
 //BA.debugLineNum = 678;BA.debugLine="implemento = Partes(0) ' Asignar solo la primer";
parent._implemento = _partes[(int) (0)];
 //BA.debugLineNum = 681;BA.debugLine="Log(\"Implemento seleccionado: \" & implemento)";
parent.__c.LogImpl("260948492","Implemento seleccionado: "+parent._implemento,0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 683;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("260948494","El texto no contiene ':' por lo que no se pudo dividir.",0);
 //BA.debugLineNum = 684;BA.debugLine="implemento = SearchTemplateImplemento.SelectedI";
parent._implemento = parent._searchtemplateimplemento._selecteditem /*String*/ ;
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
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonimplemento2_click() throws Exception{
ResumableSub_SwiftButtonImplemento2_Click rsub = new ResumableSub_SwiftButtonImplemento2_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonImplemento2_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonImplemento2_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 691;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateImple";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateimplemento2),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 693;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 694;BA.debugLine="SwiftButtonImplemento2.xLBL.Text = SearchTemplat";
parent._swiftbuttonimplemento2._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateimplemento2._selecteditem /*String*/ ));
 //BA.debugLineNum = 697;BA.debugLine="If SearchTemplateImplemento2.SelectedItem.Contai";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._searchtemplateimplemento2._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 698;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",parent._searchtemplateimplemento2._selecteditem /*String*/ );
 //BA.debugLineNum = 699;BA.debugLine="implemento2 = Partes(0) ' Asignar solo la prime";
parent._implemento2 = _partes[(int) (0)];
 //BA.debugLineNum = 701;BA.debugLine="Log(\"Implemento2 seleccionado: \" & implemento2)";
parent.__c.LogImpl("261014027","Implemento2 seleccionado: "+parent._implemento2,0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 703;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("261014029","El texto no contiene ':' por lo que no se pudo dividir.",0);
 //BA.debugLineNum = 704;BA.debugLine="implemento2 = SearchTemplateImplemento2.Selecte";
parent._implemento2 = parent._searchtemplateimplemento2._selecteditem /*String*/ ;
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
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
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
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 534;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatelabor),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 536;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 537;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
parent._swiftbuttonlabor._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatelabor._selecteditem /*String*/ ));
 //BA.debugLineNum = 540;BA.debugLine="If SearchTemplateLabor.SelectedItem.Contains(\":\"";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._searchtemplatelabor._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 541;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatelabor._selecteditem /*String*/ );
 //BA.debugLineNum = 542;BA.debugLine="labor = Partes(0) ' Asignar solo la primera par";
parent._labor = _partes[(int) (0)];
 //BA.debugLineNum = 545;BA.debugLine="Log(\"Texto completo: \" & SearchTemplateLabor.Se";
parent.__c.LogImpl("260686348","Texto completo: "+parent._searchtemplatelabor._selecteditem /*String*/ ,0);
 //BA.debugLineNum = 546;BA.debugLine="Log(\"Labor seleccionada: \" & labor)";
parent.__c.LogImpl("260686349","Labor seleccionada: "+parent._labor,0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 548;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("260686351","El texto no contiene ':' por lo que no se pudo dividir.",0);
 //BA.debugLineNum = 549;BA.debugLine="labor = SearchTemplateLabor.SelectedItem ' Asig";
parent._labor = parent._searchtemplatelabor._selecteditem /*String*/ ;
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
 //BA.debugLineNum = 552;BA.debugLine="Log(labor)";
parent.__c.LogImpl("260686355",parent._labor,0);
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
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
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 657;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatelote),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 659;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 660;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
parent._swiftbuttonlote._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatelote._selecteditem /*String*/ ));
 //BA.debugLineNum = 662;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatelote._selecteditem /*String*/ );
 //BA.debugLineNum = 663;BA.debugLine="Lote= Partes(0) ' Asignar solo la primera parte";
parent._lote = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 665;BA.debugLine="Log(Lote)";
parent.__c.LogImpl("260882953",parent._lote,0);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonmaquina_click() throws Exception{
ResumableSub_SwiftButtonMaquina_Click rsub = new ResumableSub_SwiftButtonMaquina_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonMaquina_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonMaquina_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 514;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateMaqui";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatemaquina),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 516;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 517;BA.debugLine="SwiftButtonMaquina.xLBL.Text = SearchTemplateMaq";
parent._swiftbuttonmaquina._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatemaquina._selecteditem /*String*/ ));
 //BA.debugLineNum = 520;BA.debugLine="If SearchTemplateMaquina.SelectedItem.Contains(\"";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._searchtemplatemaquina._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 521;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",parent._searchtemplatemaquina._selecteditem /*String*/ );
 //BA.debugLineNum = 522;BA.debugLine="maquina = Partes(0) ' Asignar solo la primera p";
parent._maquina = _partes[(int) (0)];
 //BA.debugLineNum = 524;BA.debugLine="Log(\"Máquina seleccionada: \" & maquina)";
parent.__c.LogImpl("260620811","Máquina seleccionada: "+parent._maquina,0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 526;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("260620813","El texto no contiene ':' por lo que no se pudo dividir.",0);
 //BA.debugLineNum = 527;BA.debugLine="maquina = SearchTemplateMaquina.SelectedItem '";
parent._maquina = parent._searchtemplatemaquina._selecteditem /*String*/ ;
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
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
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
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 556;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 557;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
 //BA.debugLineNum = 558;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatenit),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 559;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 560;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
parent._swiftbuttonnit._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatenit._selecteditem /*String*/ ));
 //BA.debugLineNum = 561;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = parent._searchtemplatenit._selecteditem /*String*/ ;
 //BA.debugLineNum = 562;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
 //BA.debugLineNum = 563;BA.debugLine="nitEmpresaCBX = Partes(0)";
parent._nitempresacbx = _partes[(int) (0)];
 //BA.debugLineNum = 564;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
 //BA.debugLineNum = 565;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 566;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
parent._swiftbuttonhacienda._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 568;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 569;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 570;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = parent._createcommand("select_haciendas",new Object[]{(Object)(parent._nitempresacbx)});
 //BA.debugLineNum = 573;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 576;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 578;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 579;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 583;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 584;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 585;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 590;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
 //BA.debugLineNum = 595;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("260751912","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 597;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
parent._searchtemplatehacienda._setitems /*Object*/ (_itemshacienda);
 //BA.debugLineNum = 598;BA.debugLine="SwiftButtonHacienda.Enabled = True";
parent._swiftbuttonhacienda._setenabled /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 599;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("260751916",parent._nitempresacbx,0);
 //BA.debugLineNum = 601;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 604;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonobservaciones_click() throws Exception{
ResumableSub_SwiftButtonObservaciones_Click rsub = new ResumableSub_SwiftButtonObservaciones_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonObservaciones_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonObservaciones_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 732;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateObser";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateobservaciones),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 734;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 735;BA.debugLine="SwiftButtonObservaciones.xLBL.Text = SearchTempl";
parent._swiftbuttonobservaciones._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateobservaciones._selecteditem /*String*/ ));
 //BA.debugLineNum = 738;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Search";
_partes = parent.__c.Regex.Split(":",parent._searchtemplateobservaciones._selecteditem /*String*/ );
 //BA.debugLineNum = 739;BA.debugLine="Dim observaciones As String = Partes(0) ' Guarda";
parent._observaciones = _partes[(int) (0)];
 //BA.debugLineNum = 743;BA.debugLine="Log(\"Primera parte (observacionCBX): \" & observa";
parent.__c.LogImpl("261145100","Primera parte (observacionCBX): "+parent._observaciones,0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 745;BA.debugLine="Log(\"Operación cancelada por el usuario.\")";
parent.__c.LogImpl("261145102","Operación cancelada por el usuario.",0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonoperario_click() throws Exception{
ResumableSub_SwiftButtonOperario_Click rsub = new ResumableSub_SwiftButtonOperario_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonOperario_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonOperario_Click(b4a.example.ef.formmaquinaria parent) {
this.parent = parent;
}
b4a.example.ef.formmaquinaria parent;
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
 //BA.debugLineNum = 711;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateOpera";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateoperario),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 713;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 714;BA.debugLine="SwiftButtonOperario.xLBL.Text = SearchTemplateOp";
parent._swiftbuttonoperario._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateoperario._selecteditem /*String*/ ));
 //BA.debugLineNum = 717;BA.debugLine="If SearchTemplateOperario.SelectedItem.Contains(";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._searchtemplateoperario._selecteditem /*String*/ .contains(":")) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 718;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", Searc";
_partes = parent.__c.Regex.Split(":",parent._searchtemplateoperario._selecteditem /*String*/ );
 //BA.debugLineNum = 719;BA.debugLine="operario = Partes(0) ' Asignar solo la primera";
parent._operario = _partes[(int) (0)];
 //BA.debugLineNum = 722;BA.debugLine="Log(\"Operario seleccionado: \" & operario)";
parent.__c.LogImpl("261079564","Operario seleccionado: "+parent._operario,0);
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 724;BA.debugLine="Log(\"El texto no contiene ':' por lo que no se";
parent.__c.LogImpl("261079566","El texto no contiene ':' por lo que no se pudo dividir.",0);
 //BA.debugLineNum = 725;BA.debugLine="operario = SearchTemplateOperario.SelectedItem";
parent._operario = parent._searchtemplateoperario._selecteditem /*String*/ ;
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
 //BA.debugLineNum = 728;BA.debugLine="End Sub";
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
