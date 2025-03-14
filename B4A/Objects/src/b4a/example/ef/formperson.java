package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.example.ef.formperson");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.ef.formperson.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public String _rdclink = "";
public lib.intellvold.datepicker.DatePicker _datepicker = null;
public lib.intellvold.datepicker.clander _mycalendar = null;
public b4a.example.ef.util _utilclass = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollview1 = null;
public long _selecteddate = 0L;
public anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog _datedialog = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label10 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner1 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner2 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner3 = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _spinner4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label13hfim = null;
public anywheresoftware.b4a.objects.LabelWrapper _label12hinicio = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1percentage = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2horas = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext3cantidat = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext4obsv = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3name = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxnitperson = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxhacienda = null;
public String _fechainicio = "";
public String _fechafin = "";
public String _nitempresacbx = "";
public String _haciendacbx = "";
public String _lotecbx = "";
public String _laborcbx = "";
public String _conceptocbx = "";
public String _turnocbx = "";
public String _horastext = "";
public String _porcentagetext = "";
public String _cantidadtext = "";
public String _obsvtext = "";
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlote = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxlabor = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxconcepto = null;
public b4a.example.ef.sd_xcombobox _sd_xcomboboxturno = null;
public b4a.example.ef.as_datepicker _as_datepicker1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel12 = null;
public b4a.example.ef.as_datepicker _as_datepicker2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel13 = null;
public String _idperson = "";
public anywheresoftware.b4a.objects.collections.Map _conceptodatamap = null;
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
public b4a.example.ef.swiftbutton _swiftbuttonconcepto = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateconcepto = null;
public b4a.example.ef.swiftbutton _swiftbuttonturno = null;
public b4a.example.ef.b4xsearchtemplate _searchtemplateturno = null;
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public String  _as_datepicker1_datechanged(int _year,int _month,int _day) throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
 //BA.debugLineNum = 324;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
_label12hinicio.setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 307;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
 //BA.debugLineNum = 309;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 312;BA.debugLine="Label12Hinicio.Text = formattedDate";
_label12hinicio.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 314;BA.debugLine="FechaInicio = formattedDate";
_fechainicio = _formatteddate;
 //BA.debugLineNum = 316;BA.debugLine="Panel12.Visible = False";
_panel12.setVisible(__c.False);
 //BA.debugLineNum = 319;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
__c.LogImpl("766584588","Fecha seleccionada: "+_fechainicio,0);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_datechanged(int _year,int _month,int _day) throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
 //BA.debugLineNum = 351;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
_label12hinicio.setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 332;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
 //BA.debugLineNum = 334;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 337;BA.debugLine="Label13Hfim.Text = formattedDate";
_label13hfim.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 339;BA.debugLine="FechaFin = formattedDate";
_fechafin = _formatteddate;
 //BA.debugLineNum = 341;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
__c.LogImpl("766781193","Fecha de fin"+_fechafin,0);
 //BA.debugLineNum = 343;BA.debugLine="Panel13.Visible = False";
_panel13.setVisible(__c.False);
 //BA.debugLineNum = 346;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
__c.LogImpl("766781198","Fecha seleccionada: "+_formatteddate,0);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear() throws Exception{
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
anywheresoftware.b4a.objects.collections.List _itemsnit = null;
anywheresoftware.b4a.objects.collections.List _itemslabor = null;
anywheresoftware.b4a.objects.collections.List _itemsconcepto = null;
anywheresoftware.b4a.objects.collections.List _itemsturno = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _razonsocial = "";
String _nit = "";
b4a.example.ef.main._dbcommand _cmdlabor = null;
b4a.example.ef.httpjob _j2 = null;
b4a.example.ef.main._dbresult _reslabor = null;
Object[] _rowlabor = null;
String _codigodestino = "";
String _descripciondestino = "";
b4a.example.ef.main._dbcommand _cmdconcepto = null;
b4a.example.ef.httpjob _j3 = null;
b4a.example.ef.main._dbresult _resconc = null;
Object[] _rowconcep = null;
String _cod_concept = "";
String _des_concept = "";
String _dstjo_cncpto = "";
b4a.example.ef.main._dbcommand _cmdturno = null;
b4a.example.ef.httpjob _j4 = null;
b4a.example.ef.main._dbresult _resturno = null;
Object[] _rowturno = null;
String _turno = "";
String _des_turno = "";
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;
anywheresoftware.b4a.BA.IterableList group43;
int index43;
int groupLen43;
anywheresoftware.b4a.BA.IterableList group62;
int index62;
int groupLen62;
anywheresoftware.b4a.BA.IterableList group82;
int index82;
int groupLen82;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 145;BA.debugLine="SearchTemplateNit.Initialize";
parent._searchtemplatenit._initialize /*String*/ (ba);
 //BA.debugLineNum = 147;BA.debugLine="Dim ItemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 148;BA.debugLine="ItemsNit.Initialize";
_itemsnit.Initialize();
 //BA.debugLineNum = 151;BA.debugLine="SearchTemplateHacienda.Initialize";
parent._searchtemplatehacienda._initialize /*String*/ (ba);
 //BA.debugLineNum = 153;BA.debugLine="SearchTemplateLote.Initialize";
parent._searchtemplatelote._initialize /*String*/ (ba);
 //BA.debugLineNum = 155;BA.debugLine="SearchTemplateLabor.Initialize";
parent._searchtemplatelabor._initialize /*String*/ (ba);
 //BA.debugLineNum = 157;BA.debugLine="Dim ItemsLabor As List";
_itemslabor = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 158;BA.debugLine="ItemsLabor.Initialize";
_itemslabor.Initialize();
 //BA.debugLineNum = 160;BA.debugLine="SearchTemplateConcepto.Initialize";
parent._searchtemplateconcepto._initialize /*String*/ (ba);
 //BA.debugLineNum = 161;BA.debugLine="Dim ItemsConcepto As List";
_itemsconcepto = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 162;BA.debugLine="ItemsConcepto.Initialize";
_itemsconcepto.Initialize();
 //BA.debugLineNum = 164;BA.debugLine="SearchTemplateTurno.Initialize";
parent._searchtemplateturno._initialize /*String*/ (ba);
 //BA.debugLineNum = 165;BA.debugLine="Dim ItemsTurno As List";
_itemsturno = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 166;BA.debugLine="ItemsTurno.Initialize";
_itemsturno.Initialize();
 //BA.debugLineNum = 171;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
parent._label3name.setText(BA.ObjectToCharSequence(((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ));
 //BA.debugLineNum = 174;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxnitperson._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 175;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 177;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 178;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 179;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = parent._createcommand("select_nit",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 182;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 185;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 187;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 188;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 191;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group25 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index25 = 0;
groupLen25 = group25.getSize();
this.state = 43;
if (true) break;

case 43:
//C
this.state = 7;
if (index25 < groupLen25) {
this.state = 6;
_row = (Object[])(group25.Get(index25));}
if (true) break;

case 44:
//C
this.state = 43;
index25++;
if (true) break;

case 6:
//C
this.state = 44;
 //BA.debugLineNum = 192;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 193;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 195;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
parent._sd_xcomboboxnitperson._add /*String*/ (_razonsocial+" - "+_nit,(Object)(_nit));
 //BA.debugLineNum = 196;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
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
 //BA.debugLineNum = 201;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("766453563","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 203;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
parent._searchtemplatenit._setitems /*Object*/ (_itemsnit);
 //BA.debugLineNum = 205;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 209;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxlabor._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 210;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
_itemslabor.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 211;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
_cmdlabor = parent._createcommand("select_labor",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 212;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 213;BA.debugLine="If j2.Success Then";
if (true) break;

case 11:
//if
this.state = 20;
if (_j2._success /*boolean*/ ) { 
this.state = 13;
}else {
this.state = 19;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 214;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
_req._handlejobasync /*void*/ (_j2,"req_labor");
 //BA.debugLineNum = 215;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
parent.__c.WaitFor("req_labor_result", ba, this, (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 216;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
if (true) break;

case 14:
//for
this.state = 17;
group43 = _reslabor.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index43 = 0;
groupLen43 = group43.getSize();
this.state = 47;
if (true) break;

case 47:
//C
this.state = 17;
if (index43 < groupLen43) {
this.state = 16;
_rowlabor = (Object[])(group43.Get(index43));}
if (true) break;

case 48:
//C
this.state = 47;
index43++;
if (true) break;

case 16:
//C
this.state = 48;
 //BA.debugLineNum = 217;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
_codigodestino = BA.ObjectToString(_rowlabor[(int) (0)]);
 //BA.debugLineNum = 218;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
_descripciondestino = BA.ObjectToString(_rowlabor[(int) (1)]);
 //BA.debugLineNum = 219;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino, codig";
parent._sd_xcomboboxlabor._add /*String*/ (_descripciondestino,(Object)(_codigodestino));
 //BA.debugLineNum = 220;BA.debugLine="ItemsLabor.Add(codigoDestino&\":\"&descripcionDes";
_itemslabor.Add((Object)(_codigodestino+":"+_descripciondestino));
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
 //BA.debugLineNum = 223;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
parent.__c.LogImpl("766453585","Error en la consulta de destinos: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 225;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
parent._searchtemplatelabor._setitems /*Object*/ (_itemslabor);
 //BA.debugLineNum = 226;BA.debugLine="j2.Release";
_j2._release /*String*/ ();
 //BA.debugLineNum = 231;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxconcepto._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 232;BA.debugLine="ItemsConcepto.Add(\"Seleccionar:\")";
_itemsconcepto.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 235;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = parent._createcommand("select_concepto",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 238;BA.debugLine="ConceptoDataMap.Initialize";
parent._conceptodatamap.Initialize();
 //BA.debugLineNum = 240;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 243;BA.debugLine="If j3.Success Then";
if (true) break;

case 21:
//if
this.state = 30;
if (_j3._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 29;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 245;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
_req._handlejobasync /*void*/ (_j3,"req_concept");
 //BA.debugLineNum = 246;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, this, (Object)(_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 249;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
if (true) break;

case 24:
//for
this.state = 27;
group62 = _resconc.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index62 = 0;
groupLen62 = group62.getSize();
this.state = 51;
if (true) break;

case 51:
//C
this.state = 27;
if (index62 < groupLen62) {
this.state = 26;
_rowconcep = (Object[])(group62.Get(index62));}
if (true) break;

case 52:
//C
this.state = 51;
index62++;
if (true) break;

case 26:
//C
this.state = 52;
 //BA.debugLineNum = 250;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
_cod_concept = BA.ObjectToString(_rowconcep[(int) (0)]);
 //BA.debugLineNum = 251;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
_des_concept = BA.ObjectToString(_rowconcep[(int) (1)]);
 //BA.debugLineNum = 252;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
_dstjo_cncpto = BA.ObjectToString(_rowconcep[(int) (2)]);
 //BA.debugLineNum = 255;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept, Cod_Conce";
parent._sd_xcomboboxconcepto._add /*String*/ (_des_concept,(Object)(_cod_concept));
 //BA.debugLineNum = 256;BA.debugLine="ItemsConcepto.Add(Cod_Concept&\":\"&Des_Concept)";
_itemsconcepto.Add((Object)(_cod_concept+":"+_des_concept));
 //BA.debugLineNum = 258;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
parent._conceptodatamap.Put((Object)(_cod_concept),(Object)(_dstjo_cncpto));
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
 //BA.debugLineNum = 262;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
parent.__c.LogImpl("766453624","Error en la consulta de conceptos: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 264;BA.debugLine="SearchTemplateConcepto.SetItems(ItemsConcepto)";
parent._searchtemplateconcepto._setitems /*Object*/ (_itemsconcepto);
 //BA.debugLineNum = 267;BA.debugLine="j3.Release";
_j3._release /*String*/ ();
 //BA.debugLineNum = 270;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxturno._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 271;BA.debugLine="ItemsTurno.Add(\"Seleccionar:\")";
_itemsturno.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 273;BA.debugLine="Dim cmdTurno As DBCommand = CreateCommand(\"select";
_cmdturno = parent._createcommand("select_turnos",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 276;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTurno, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdturno,(int) (0),parent.__c.Null)));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 279;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 281;BA.debugLine="Req.HandleJobAsync(j4, \"req_turno\")";
_req._handlejobasync /*void*/ (_j4,"req_turno");
 //BA.debugLineNum = 282;BA.debugLine="Wait For (Req) req_turno_Result(resTurno As DBRe";
parent.__c.WaitFor("req_turno_result", ba, this, (Object)(_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resturno = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 285;BA.debugLine="For Each rowTurno() As Object In resTurno.Rows";
if (true) break;

case 34:
//for
this.state = 37;
group82 = _resturno.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index82 = 0;
groupLen82 = group82.getSize();
this.state = 55;
if (true) break;

case 55:
//C
this.state = 37;
if (index82 < groupLen82) {
this.state = 36;
_rowturno = (Object[])(group82.Get(index82));}
if (true) break;

case 56:
//C
this.state = 55;
index82++;
if (true) break;

case 36:
//C
this.state = 56;
 //BA.debugLineNum = 286;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
_turno = BA.ObjectToString(_rowconcep[(int) (0)]);
 //BA.debugLineNum = 287;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
_des_turno = BA.ObjectToString(_rowconcep[(int) (1)]);
 //BA.debugLineNum = 289;BA.debugLine="SD_xComboBoxTurno.Add(Turno , Des_Turno)";
parent._sd_xcomboboxturno._add /*String*/ (_turno,(Object)(_des_turno));
 //BA.debugLineNum = 290;BA.debugLine="ItemsTurno.Add(Des_Turno&\":\"&Turno)";
_itemsturno.Add((Object)(_des_turno+":"+_turno));
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
 //BA.debugLineNum = 294;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
parent.__c.LogImpl("766453656","Error en la consulta de conceptos: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = -1;
;
 //BA.debugLineNum = 296;BA.debugLine="SearchTemplateTurno.SetItems(ItemsTurno)";
parent._searchtemplateturno._setitems /*Object*/ (_itemsturno);
 //BA.debugLineNum = 298;BA.debugLine="j4.Release";
_j4._release /*String*/ ();
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _jobdone(b4a.example.ef.httpjob _j) throws Exception{
}
public void  _req_result(b4a.example.ef.main._dbresult _res) throws Exception{
}
public void  _req_labor_result(b4a.example.ef.main._dbresult _reslabor) throws Exception{
}
public void  _req_concept_result(b4a.example.ef.main._dbresult _resconc) throws Exception{
}
public void  _req_turno_result(b4a.example.ef.main._dbresult _resturno) throws Exception{
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.SpinnerWrapper _newsp = null;
int _i = 0;
 //BA.debugLineNum = 98;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 100;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 102;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 104;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
_utilclass._setstatusbarcolor /*String*/ (__c.Colors.White,__c.Colors.White);
 //BA.debugLineNum = 105;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
_root.LoadLayout("FomrPerson",ba);
 //BA.debugLineNum = 106;BA.debugLine="ScrollView1.Panel.Height=1100dip";
_scrollview1.getPanel().setHeight(__c.DipToCurrent((int) (1100)));
 //BA.debugLineNum = 107;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
_scrollview1.getPanel().LoadLayout("ScrollUIPerson",ba);
 //BA.debugLineNum = 109;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
_edittext3cantidat.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 110;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
_edittext1percentage.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 111;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
_edittext4obsv.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 112;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
_edittext2horas.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 115;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group11 = _root.GetAllViewsRecursive();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group11.Get(index11)));
 //BA.debugLineNum = 116;BA.debugLine="If v Is Spinner Then";
if (_v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
 //BA.debugLineNum = 117;BA.debugLine="Dim newsp As Spinner=v";
_newsp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_newsp = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
 //BA.debugLineNum = 118;BA.debugLine="For i=1 To 16";
{
final int step14 = 1;
final int limit14 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 119;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
_newsp.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_v.getTag())+" "+BA.NumberToString(_i)}));
 }
};
 };
 }
};
 //BA.debugLineNum = 137;BA.debugLine="Base = Root";
_base = _root;
 //BA.debugLineNum = 138;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 139;BA.debugLine="Dialog.Title = \"Buscador\"";
_dialog._title /*Object*/  = (Object)("Buscador");
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public void  _button1_click() throws Exception{
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
String _id = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;

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
 //BA.debugLineNum = 794;BA.debugLine="Dim id As String";
_id = "";
 //BA.debugLineNum = 797;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
_id = ((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ;
 //BA.debugLineNum = 800;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = parent.__c.Regex.Matcher("\\#(.+)",_id);
 //BA.debugLineNum = 802;BA.debugLine="If matcher.Find() Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_matcher.Find()) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 803;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
_id = _matcher.Group((int) (1));
 //BA.debugLineNum = 804;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
parent.__c.LogImpl("769140491","ID: "+_id,0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 806;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
parent.__c.LogImpl("769140493","No se encontró el carácter # en la cadena.",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 810;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
_cmd = parent._createcommand("select_searchPerson",new Object[]{(Object)(_id)});
 //BA.debugLineNum = 814;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 815;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 818;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 820;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 30;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 29;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 823;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 824;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 826;BA.debugLine="If res.Rows.Size > 0 Then";
if (true) break;

case 10:
//if
this.state = 27;
if (_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
this.state = 12;
}else {
this.state = 20;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 828;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 829;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 830;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = parent._createcommand("insert_Mvto_Trab_Propios",new Object[]{(Object)(_id),(Object)(parent._fechainicio),(Object)(parent._laborcbx),(Object)(0),(Object)(parent._conceptocbx),(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)(parent._horastext),(Object)(parent._cantidadtext),(Object)(parent._obsvtext),(Object)(parent._turnocbx),(Object)(parent._porcentagetext)});
 //BA.debugLineNum = 831;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 832;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 834;BA.debugLine="Try";
if (true) break;

case 13:
//try
this.state = 18;
this.catchState = 17;
this.state = 15;
if (true) break;

case 15:
//C
this.state = 18;
this.catchState = 17;
 //BA.debugLineNum = 835;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 //BA.debugLineNum = 836;BA.debugLine="Log(\"Se han recuperado datos: propios \" & res.";
parent.__c.LogImpl("769140523","Se han recuperado datos: propios "+BA.NumberToString(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 //BA.debugLineNum = 839;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("769140526","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 843;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 844;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 845;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = parent._createcommand("insert_Mvto_Trab_Tmprles",new Object[]{(Object)(_id),(Object)(parent._fechainicio),(Object)(parent._laborcbx),(Object)(0),(Object)(parent._conceptocbx),(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)(parent._horastext),(Object)(parent._cantidadtext),(Object)(parent._obsvtext),(Object)(parent._turnocbx),(Object)(parent._porcentagetext)});
 //BA.debugLineNum = 846;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 847;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 849;BA.debugLine="Try";
if (true) break;

case 21:
//try
this.state = 26;
this.catchState = 25;
this.state = 23;
if (true) break;

case 23:
//C
this.state = 26;
this.catchState = 25;
 //BA.debugLineNum = 850;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 //BA.debugLineNum = 851;BA.debugLine="Log(\"No se encontraron datos para el ID: \" & i";
parent.__c.LogImpl("769140538","No se encontraron datos para el ID: "+_id,0);
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
 //BA.debugLineNum = 854;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("769140541","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 0;
;
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 859;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
parent.__c.LogImpl("769140546","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
 //BA.debugLineNum = 861;BA.debugLine="End Sub";
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
public String  _can_oncanceldate() throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub can_OnCancelDate ()";
 //BA.debugLineNum = 363;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 4;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 8;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
 //BA.debugLineNum = 10;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
 //BA.debugLineNum = 11;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
 //BA.debugLineNum = 12;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
 //BA.debugLineNum = 13;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 15;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
 //BA.debugLineNum = 16;BA.debugLine="Private DateDialog As DateDialog";
_datedialog = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
 //BA.debugLineNum = 17;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 19;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private Spinner1 As Spinner";
_spinner1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private Spinner2 As Spinner";
_spinner2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private Spinner3 As Spinner";
_spinner3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private Spinner4 As Spinner";
_spinner4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private Label13Hfim As Label";
_label13hfim = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private Label12Hinicio As Label";
_label12hinicio = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 33;BA.debugLine="Private EditText1percentage As EditText";
_edittext1percentage = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Private EditText2horas As EditText";
_edittext2horas = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Private EditText3cantidat As EditText";
_edittext3cantidat = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private EditText4obsv As EditText";
_edittext4obsv = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private Label3Name As Label";
_label3name = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private SD_xComboBoxNitPerson As SD_xComboBox";
_sd_xcomboboxnitperson = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 40;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 42;BA.debugLine="Dim FechaInicio As String";
_fechainicio = "";
 //BA.debugLineNum = 43;BA.debugLine="Dim FechaFin As String";
_fechafin = "";
 //BA.debugLineNum = 44;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
 //BA.debugLineNum = 45;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
 //BA.debugLineNum = 46;BA.debugLine="Dim LoteCBX As String";
_lotecbx = "";
 //BA.debugLineNum = 47;BA.debugLine="Dim LaborCBX As String";
_laborcbx = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim ConceptoCBX As String";
_conceptocbx = "";
 //BA.debugLineNum = 49;BA.debugLine="Dim TurnoCBX As String";
_turnocbx = "";
 //BA.debugLineNum = 50;BA.debugLine="Dim HorasText As String";
_horastext = "";
 //BA.debugLineNum = 51;BA.debugLine="Dim PorcentageText As String";
_porcentagetext = "";
 //BA.debugLineNum = 52;BA.debugLine="Dim CantidadText As String";
_cantidadtext = "";
 //BA.debugLineNum = 53;BA.debugLine="Dim ObsvText As String";
_obsvtext = "";
 //BA.debugLineNum = 54;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 55;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 56;BA.debugLine="Private SD_xComboBoxConcepto As SD_xComboBox";
_sd_xcomboboxconcepto = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 57;BA.debugLine="Private SD_xComboBoxTurno As SD_xComboBox";
_sd_xcomboboxturno = new b4a.example.ef.sd_xcombobox();
 //BA.debugLineNum = 58;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
 //BA.debugLineNum = 59;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private AS_DatePicker2 As AS_DatePicker";
_as_datepicker2 = new b4a.example.ef.as_datepicker();
 //BA.debugLineNum = 61;BA.debugLine="Private Panel13 As Panel";
_panel13 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Public idPerson As String";
_idperson = "";
 //BA.debugLineNum = 63;BA.debugLine="Dim ConceptoDataMap As Map";
_conceptodatamap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 66;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
 //BA.debugLineNum = 67;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 68;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 69;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 70;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 71;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 72;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 73;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 74;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 75;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 76;BA.debugLine="Private SwiftButtonConcepto As SwiftButton";
_swiftbuttonconcepto = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 77;BA.debugLine="Private SearchTemplateConcepto As B4XSearchTempla";
_searchtemplateconcepto = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 78;BA.debugLine="Private SwiftButtonTurno As SwiftButton";
_swiftbuttonturno = new b4a.example.ef.swiftbutton();
 //BA.debugLineNum = 79;BA.debugLine="Private SearchTemplateTurno As B4XSearchTemplate";
_searchtemplateturno = new b4a.example.ef.b4xsearchtemplate();
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 427;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 428;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 429;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 430;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 431;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 432;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.dbrequestmanager  _createrequest(String _db) throws Exception{
b4a.example.ef.dbrequestmanager _req = null;
 //BA.debugLineNum = 421;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
 //BA.debugLineNum = 422;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 423;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (ba,this,_rdclink+"?DBName="+_db);
 //BA.debugLineNum = 424;BA.debugLine="Return Req";
if (true) return _req;
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
 //BA.debugLineNum = 358;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
_label10.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 359;BA.debugLine="Label10.TextColor=Colors.Black";
_label10.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(String _nombre) throws Exception{
 //BA.debugLineNum = 496;BA.debugLine="Sub DeleteRecord (Nombre As String)";
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return "";
}
public String  _edittext1percentage_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 777;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
 //BA.debugLineNum = 778;BA.debugLine="Log(PorcentageText)";
__c.LogImpl("768943873",_porcentagetext,0);
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return "";
}
public String  _edittext2horas_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 770;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
 //BA.debugLineNum = 771;BA.debugLine="HorasText = New";
_horastext = _new;
 //BA.debugLineNum = 774;BA.debugLine="Log(HorasText)";
__c.LogImpl("768878340",_horastext,0);
 //BA.debugLineNum = 775;BA.debugLine="End Sub";
return "";
}
public String  _edittext3cantidat_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 781;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
 //BA.debugLineNum = 782;BA.debugLine="CantidadText = New";
_cantidadtext = _new;
 //BA.debugLineNum = 784;BA.debugLine="Log(CantidadText)";
__c.LogImpl("769009411",_cantidadtext,0);
 //BA.debugLineNum = 785;BA.debugLine="End Sub";
return "";
}
public String  _edittext4obsv_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 787;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
 //BA.debugLineNum = 788;BA.debugLine="ObsvText =New";
_obsvtext = _new;
 //BA.debugLineNum = 790;BA.debugLine="Log(ObsvText)";
__c.LogImpl("769074947",_obsvtext,0);
 //BA.debugLineNum = 791;BA.debugLine="End Sub";
return "";
}
public void  _getrecordclientes(String _usedb) throws Exception{
ResumableSub_GetRecordClientes rsub = new ResumableSub_GetRecordClientes(this,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordClientes extends BA.ResumableSub {
public ResumableSub_GetRecordClientes(b4a.example.ef.formperson parent,String _usedb) {
this.parent = parent;
this._usedb = _usedb;
}
b4a.example.ef.formperson parent;
String _usedb;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 471;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 472;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
_cmd = parent._createcommand("select_clientes",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 473;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 474;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 475;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 476;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 478;BA.debugLine="req.PrintTable(res)";
_req._printtable /*String*/ (_res);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 480;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("767764234","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 482;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordhaciendas(String _usedb) throws Exception{
ResumableSub_GetRecordHaciendas rsub = new ResumableSub_GetRecordHaciendas(this,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordHaciendas extends BA.ResumableSub {
public ResumableSub_GetRecordHaciendas(b4a.example.ef.formperson parent,String _usedb) {
this.parent = parent;
this._usedb = _usedb;
}
b4a.example.ef.formperson parent;
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
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;
Object[] group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 437;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 438;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 440;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 441;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 442;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 444;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 445;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 446;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 447;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 451;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group10 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index10 < groupLen10) {
this.state = 6;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 18:
//C
this.state = 17;
index10++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 452;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 453;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 454;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group13 = _row;
index13 = 0;
groupLen13 = group13.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index13 < groupLen13) {
this.state = 9;
_record = group13[index13];}
if (true) break;

case 20:
//C
this.state = 19;
index13++;
if (true) break;

case 9:
//C
this.state = 20;
 //BA.debugLineNum = 455;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 //BA.debugLineNum = 457;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 458;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 459;BA.debugLine="Spinner2.Add(cadena)";
parent._spinner2.Add(_cadena);
 //BA.debugLineNum = 460;BA.debugLine="cadena=\"\"";
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
 //BA.debugLineNum = 464;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("767698716","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 466;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlabores(String _usedb) throws Exception{
ResumableSub_GetRecordLabores rsub = new ResumableSub_GetRecordLabores(this,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLabores extends BA.ResumableSub {
public ResumableSub_GetRecordLabores(b4a.example.ef.formperson parent,String _usedb) {
this.parent = parent;
this._usedb = _usedb;
}
b4a.example.ef.formperson parent;
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
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;
Object[] group13;
int index13;
int groupLen13;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 550;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 551;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = parent._createcommand("select_labores",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 553;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 554;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 555;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 557;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 558;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 559;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 560;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 564;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 11;
group10 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 17;
if (true) break;

case 17:
//C
this.state = 11;
if (index10 < groupLen10) {
this.state = 6;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 18:
//C
this.state = 17;
index10++;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 565;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 566;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 567;BA.debugLine="For Each record As Object In row";
if (true) break;

case 7:
//for
this.state = 10;
group13 = _row;
index13 = 0;
groupLen13 = group13.length;
this.state = 19;
if (true) break;

case 19:
//C
this.state = 10;
if (index13 < groupLen13) {
this.state = 9;
_record = group13[index13];}
if (true) break;

case 20:
//C
this.state = 19;
index13++;
if (true) break;

case 9:
//C
this.state = 20;
 //BA.debugLineNum = 568;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 //BA.debugLineNum = 570;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 571;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 572;BA.debugLine="Spinner4.Add(cadena)";
parent._spinner4.Add(_cadena);
 //BA.debugLineNum = 573;BA.debugLine="cadena=\"\"";
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
 //BA.debugLineNum = 577;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("768091932","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 579;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlotes(String _usedb,String _nit,String _hda) throws Exception{
ResumableSub_GetRecordLotes rsub = new ResumableSub_GetRecordLotes(this,_usedb,_nit,_hda);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLotes extends BA.ResumableSub {
public ResumableSub_GetRecordLotes(b4a.example.ef.formperson parent,String _usedb,String _nit,String _hda) {
this.parent = parent;
this._usedb = _usedb;
this._nit = _nit;
this._hda = _hda;
}
b4a.example.ef.formperson parent;
String _usedb;
String _nit;
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

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 521;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 522;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(_nit),(Object)(_hda)});
 //BA.debugLineNum = 524;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 526;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 527;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 528;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 529;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 533;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 534;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 535;BA.debugLine="For Each record As Object In row";
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
 //BA.debugLineNum = 536;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
 //BA.debugLineNum = 537;BA.debugLine="Spinner3.Add(cadena)";
parent._spinner3.Add(_cadena);
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
 //BA.debugLineNum = 544;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("768026392","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 546;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _globals() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _panel10horainicio = null;
anywheresoftware.b4a.objects.LabelWrapper _labelfecha = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 87;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
_panel10horainicio = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 88;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
_labelfecha = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _hinicio_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 395;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
 //BA.debugLineNum = 396;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
_label12hinicio.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 397;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
_label12hinicio.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 93;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public String  _insertrecord(String _nombre,int _salario) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return "";
}
public String  _label10_click() throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Private Sub Label10_Click";
 //BA.debugLineNum = 383;BA.debugLine="Panel9_Click";
_panel9_click();
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return "";
}
public String  _label12hinicio_click() throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Private Sub Label12Hinicio_Click";
 //BA.debugLineNum = 304;BA.debugLine="Panel12.Visible= True";
_panel12.setVisible(__c.True);
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return "";
}
public String  _label13hfim_click() throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Private Sub Label13Hfim_Click";
 //BA.debugLineNum = 329;BA.debugLine="Panel13.Visible= True";
_panel13.setVisible(__c.True);
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 402;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 405;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click() throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Private Sub Label2Save_Click";
 //BA.debugLineNum = 409;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Saved."),BA.ObjectToCharSequence(""),ba);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click() throws Exception{
 //BA.debugLineNum = 390;BA.debugLine="Private Sub Panel10Horainicio_Click";
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click() throws Exception{
 //BA.debugLineNum = 386;BA.debugLine="Private Sub Panel11horaFim_Click";
 //BA.debugLineNum = 388;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click() throws Exception{
 //BA.debugLineNum = 412;BA.debugLine="Private Sub Panel2Time_Click";
 //BA.debugLineNum = 414;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click() throws Exception{
 //BA.debugLineNum = 366;BA.debugLine="Private Sub Panel9_Click";
 //BA.debugLineNum = 367;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
_datepicker.Initialize(ba,"Date",(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 368;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.1990");
 //BA.debugLineNum = 369;BA.debugLine="Datepicker.SetThemeDark";
_datepicker.SetThemeDark();
 //BA.debugLineNum = 370;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
_datepicker.SetMinDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 371;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.2030");
 //BA.debugLineNum = 372;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
_datepicker.SetMaxDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 373;BA.debugLine="Datepicker.CancelColor = Colors.White";
_datepicker.setCancelColor(__c.Colors.White);
 //BA.debugLineNum = 374;BA.debugLine="Datepicker.OkColor = Colors.White";
_datepicker.setOkColor(__c.Colors.White);
 //BA.debugLineNum = 375;BA.debugLine="Datepicker.Title = \"Selecione\"";
_datepicker.setTitle("Selecione");
 //BA.debugLineNum = 376;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
_datepicker.setCancelText("Cancelar");
 //BA.debugLineNum = 377;BA.debugLine="Datepicker.OkText = \"Ok\"";
_datepicker.setOkText("Ok");
 //BA.debugLineNum = 378;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
_datepicker.SetOnCancel("Cancel");
 //BA.debugLineNum = 379;BA.debugLine="Datepicker.show2(\"iki\")";
_datepicker.show2("iki");
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxconcepto_itemclick(int _position,Object _value) throws Exception{
String _dstjo_cncpto = "";
 //BA.debugLineNum = 746;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
 //BA.debugLineNum = 747;BA.debugLine="ConceptoCBX = Value";
_conceptocbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 748;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
 //BA.debugLineNum = 749;BA.debugLine="ConceptoCBX = Null";
_conceptocbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 751;BA.debugLine="ConceptoCBX = Value";
_conceptocbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 754;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
_dstjo_cncpto = BA.ObjectToString(_conceptodatamap.Get(_value));
 //BA.debugLineNum = 757;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
__c.LogImpl("768812811","Valor seleccionado: "+_conceptocbx,0);
 //BA.debugLineNum = 758;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
__c.LogImpl("768812812","Dato dstjo_Cncpto: "+_dstjo_cncpto,0);
 //BA.debugLineNum = 761;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
if ((_dstjo_cncpto).equals("N")) { 
 //BA.debugLineNum = 763;BA.debugLine="EditText3cantidat.Enabled = False";
_edittext3cantidat.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 766;BA.debugLine="EditText3cantidat.Enabled = True";
_edittext3cantidat.setEnabled(__c.True);
 };
 //BA.debugLineNum = 768;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(int _position,Object _value) throws Exception{
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formperson parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
b4a.example.ef.formperson parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 682;BA.debugLine="If Value = \"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_value).equals((Object)(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 683;BA.debugLine="haciendaCBX = Null";
parent._haciendacbx = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 685;BA.debugLine="haciendaCBX = Value";
parent._haciendacbx = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 687;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("768616198",parent._haciendacbx,0);
 //BA.debugLineNum = 688;BA.debugLine="SD_xComboBoxLote.Clear";
parent._sd_xcomboboxlote._clear /*String*/ ();
 //BA.debugLineNum = 689;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxlote._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 691;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 692;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 693;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 696;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 699;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 701;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 702;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 706;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 10:
//for
this.state = 13;
group16 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index16 < groupLen16) {
this.state = 12;
_row = (Object[])(group16.Get(index16));}
if (true) break;

case 20:
//C
this.state = 19;
index16++;
if (true) break;

case 12:
//C
this.state = 20;
 //BA.debugLineNum = 707;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 710;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
parent._sd_xcomboboxlote._add /*String*/ (_codg_hacienda,(Object)(_codg_hacienda));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 715;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("768616226","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 719;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxlabor_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 735;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
 //BA.debugLineNum = 736;BA.debugLine="LaborCBX = Value";
_laborcbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 737;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
 //BA.debugLineNum = 738;BA.debugLine="LaborCBX = Null";
_laborcbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 740;BA.debugLine="LaborCBX = Value";
_laborcbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 743;BA.debugLine="Log(LaborCBX)";
__c.LogImpl("768747272",_laborcbx,0);
 //BA.debugLineNum = 744;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
 //BA.debugLineNum = 724;BA.debugLine="LoteCBX = Value";
_lotecbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 726;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
 //BA.debugLineNum = 727;BA.debugLine="LoteCBX = Null";
_lotecbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 729;BA.debugLine="LoteCBX = Value";
_lotecbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 732;BA.debugLine="Log(LoteCBX)";
__c.LogImpl("768681737",_lotecbx,0);
 //BA.debugLineNum = 733;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnitperson_itemclick(int _position,Object _value) throws Exception{
ResumableSub_SD_xComboBoxNitPerson_ItemClick rsub = new ResumableSub_SD_xComboBoxNitPerson_ItemClick(this,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNitPerson_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNitPerson_ItemClick(b4a.example.ef.formperson parent,int _position,Object _value) {
this.parent = parent;
this._position = _position;
this._value = _value;
}
b4a.example.ef.formperson parent;
int _position;
Object _value;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;
Object[] _row = null;
String _codg_hacienda = "";
String _nombrehacienda = "";
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 633;BA.debugLine="nitEmpresaCBX=Value";
parent._nitempresacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 634;BA.debugLine="SD_xComboBoxHacienda.Clear";
parent._sd_xcomboboxhacienda._clear /*String*/ ();
 //BA.debugLineNum = 635;BA.debugLine="If Value = \"\" Then";
if (true) break;

case 1:
//if
this.state = 6;
if ((_value).equals((Object)(""))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 636;BA.debugLine="nitEmpresaCBX = Null";
parent._nitempresacbx = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 638;BA.debugLine="nitEmpresaCBX = Value";
parent._nitempresacbx = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 642;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
parent.__c.LogImpl("768550666","Valor seleccionado: "+parent._nitempresacbx,0);
 //BA.debugLineNum = 644;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
parent.__c.LogImpl("768550668","Posicion: "+BA.NumberToString(_position)+" VALUE: "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 645;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxhacienda._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 647;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 648;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 649;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",new Object[]{_value});
 //BA.debugLineNum = 652;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 655;BA.debugLine="If j.Success Then";
if (true) break;

case 7:
//if
this.state = 16;
if (_j._success /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 15;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 657;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 658;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 662;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 10:
//for
this.state = 13;
group18 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index18 < groupLen18) {
this.state = 12;
_row = (Object[])(group18.Get(index18));}
if (true) break;

case 20:
//C
this.state = 19;
index18++;
if (true) break;

case 12:
//C
this.state = 20;
 //BA.debugLineNum = 663;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 664;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 667;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
parent._sd_xcomboboxhacienda._add /*String*/ (_nombrehacienda,(Object)(_codg_hacienda));
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 672;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("768550696","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 675;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("768550699",parent._nitempresacbx,0);
 //BA.debugLineNum = 677;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxturno_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 864;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
 //BA.debugLineNum = 866;BA.debugLine="If Value = Null Or Value = \"\" Then";
if (_value== null || (_value).equals((Object)(""))) { 
 //BA.debugLineNum = 867;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
_turnocbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 869;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
_turnocbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
return "";
}
public String  _spinner1_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _spinner10_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 603;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return "";
}
public String  _spinner2_itemclick(int _position,Object _value) throws Exception{
String _nit = "";
String _hacienda = "";
 //BA.debugLineNum = 506;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
 //BA.debugLineNum = 507;BA.debugLine="Dim nit As String";
_nit = "";
 //BA.debugLineNum = 508;BA.debugLine="Dim hacienda As String";
_hacienda = "";
 //BA.debugLineNum = 510;BA.debugLine="Spinner3.Clear";
_spinner3.Clear();
 //BA.debugLineNum = 512;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("767960838",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 513;BA.debugLine="nit= \"890307964\"";
_nit = "890307964";
 //BA.debugLineNum = 514;BA.debugLine="hacienda = Value";
_hacienda = BA.ObjectToString(_value);
 //BA.debugLineNum = 515;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
 //BA.debugLineNum = 517;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
_getrecordlotes("BDPichucho",_nit,_hacienda);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return "";
}
public String  _spinner3_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 587;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return "";
}
public String  _spinner4_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 591;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
 //BA.debugLineNum = 593;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 595;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
 //BA.debugLineNum = 597;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 599;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return "";
}
public String  _swiftbutton1prueba_click() throws Exception{
 //BA.debugLineNum = 874;BA.debugLine="Private Sub SwiftButton1Prueba_Click";
 //BA.debugLineNum = 877;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonconcepto_click() throws Exception{
ResumableSub_SwiftButtonConcepto_Click rsub = new ResumableSub_SwiftButtonConcepto_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonConcepto_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonConcepto_Click(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
int _result = 0;
String _conceptocompleto = "";
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
 //BA.debugLineNum = 1007;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateConce";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateconcepto),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1008;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1009;BA.debugLine="SwiftButtonConcepto.xLBL.Text = SearchTemplateCo";
parent._swiftbuttonconcepto._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateconcepto._selecteditem /*String*/ ));
 //BA.debugLineNum = 1010;BA.debugLine="Dim CONCEPTOCOMPLETO As String = SearchTemplateC";
_conceptocompleto = parent._searchtemplateconcepto._selecteditem /*String*/ ;
 //BA.debugLineNum = 1011;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", CONCEP";
_partes = parent.__c.Regex.Split(":",_conceptocompleto);
 //BA.debugLineNum = 1012;BA.debugLine="ConceptoCBX = Partes(0)";
parent._conceptocbx = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1014;BA.debugLine="End Sub";
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
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
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
 //BA.debugLineNum = 938;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 939;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
 //BA.debugLineNum = 942;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatehacienda),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 943;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 944;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
parent._swiftbuttonhacienda._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatehacienda._selecteditem /*String*/ ));
 //BA.debugLineNum = 945;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = parent._searchtemplatehacienda._selecteditem /*String*/ ;
 //BA.debugLineNum = 946;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
 //BA.debugLineNum = 947;BA.debugLine="haciendaCBX = Partes(0)";
parent._haciendacbx = _partes[(int) (0)];
 //BA.debugLineNum = 948;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
 //BA.debugLineNum = 949;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 950;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
parent._swiftbuttonlote._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 952;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 953;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 954;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 957;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 960;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 962;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 963;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 967;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 968;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 971;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacie";
parent._sd_xcomboboxlote._add /*String*/ (_codg_hacienda,(Object)(_codg_hacienda));
 //BA.debugLineNum = 972;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
 //BA.debugLineNum = 977;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("769402664","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 979;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
parent._searchtemplatelote._setitems /*Object*/ (_itemslote);
 //BA.debugLineNum = 980;BA.debugLine="SwiftButtonLote.Enabled = True";
parent._swiftbuttonlote._setenabled /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 982;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 985;BA.debugLine="End Sub";
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
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
int _result = 0;
String _laborcompleto = "";
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
 //BA.debugLineNum = 996;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatelabor),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 997;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 998;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
parent._swiftbuttonlabor._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatelabor._selecteditem /*String*/ ));
 //BA.debugLineNum = 999;BA.debugLine="Dim LABORCOMPLETO As String = SearchTemplateLabo";
_laborcompleto = parent._searchtemplatelabor._selecteditem /*String*/ ;
 //BA.debugLineNum = 1000;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", LABORC";
_partes = parent.__c.Regex.Split(":",_laborcompleto);
 //BA.debugLineNum = 1001;BA.debugLine="LaborCBX = Partes(0)";
parent._laborcbx = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
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
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 988;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatelote),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 989;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 990;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.Se";
parent._swiftbuttonlote._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatelote._selecteditem /*String*/ ));
 //BA.debugLineNum = 991;BA.debugLine="LoteCBX = SearchTemplateNit.SelectedItem";
parent._lotecbx = parent._searchtemplatenit._selecteditem /*String*/ ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 993;BA.debugLine="End Sub";
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
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
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
 //BA.debugLineNum = 881;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 882;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
 //BA.debugLineNum = 885;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplatenit),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 886;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 887;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
parent._swiftbuttonnit._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplatenit._selecteditem /*String*/ ));
 //BA.debugLineNum = 888;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = parent._searchtemplatenit._selecteditem /*String*/ ;
 //BA.debugLineNum = 889;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
 //BA.debugLineNum = 890;BA.debugLine="nitEmpresaCBX = Partes(0)";
parent._nitempresacbx = _partes[(int) (0)];
 //BA.debugLineNum = 891;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
 //BA.debugLineNum = 892;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
 //BA.debugLineNum = 893;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
parent._swiftbuttonhacienda._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 896;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 897;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 898;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = parent._createcommand("select_haciendas",new Object[]{(Object)(parent._nitempresacbx)});
 //BA.debugLineNum = 901;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 904;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 906;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 907;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 911;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 912;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 913;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 916;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_";
parent._sd_xcomboboxhacienda._add /*String*/ (_nombrehacienda,(Object)(_codg_hacienda));
 //BA.debugLineNum = 918;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
 //BA.debugLineNum = 923;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("769337132","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
 //BA.debugLineNum = 925;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
parent._searchtemplatehacienda._setitems /*Object*/ (_itemshacienda);
 //BA.debugLineNum = 926;BA.debugLine="SwiftButtonHacienda.Enabled = True";
parent._swiftbuttonhacienda._setenabled /*boolean*/ (parent.__c.True);
 //BA.debugLineNum = 927;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("769337136",parent._nitempresacbx,0);
 //BA.debugLineNum = 929;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 935;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonturno_click() throws Exception{
ResumableSub_SwiftButtonTurno_Click rsub = new ResumableSub_SwiftButtonTurno_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonTurno_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTurno_Click(b4a.example.ef.formperson parent) {
this.parent = parent;
}
b4a.example.ef.formperson parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1017;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTurno";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._searchtemplateturno),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 1018;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 1019;BA.debugLine="SwiftButtonTurno.xLBL.Text = SearchTemplateTurno";
parent._swiftbuttonturno._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(parent._searchtemplateturno._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 1021;BA.debugLine="End Sub";
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
