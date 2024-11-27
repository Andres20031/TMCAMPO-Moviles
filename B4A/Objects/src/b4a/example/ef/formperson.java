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
public b4a.example.dateutils _dateutils = null;
public b4a.example.ef.main _main = null;
public b4a.example.ef.starter _starter = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public String  _as_datepicker1_datechanged(int _year,int _month,int _day) throws Exception{
 //BA.debugLineNum = 268;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
 //BA.debugLineNum = 270;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
_label12hinicio.setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
 //BA.debugLineNum = 271;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 253;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
 //BA.debugLineNum = 255;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 258;BA.debugLine="Label12Hinicio.Text = formattedDate";
_label12hinicio.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 260;BA.debugLine="FechaInicio = formattedDate";
_fechainicio = _formatteddate;
 //BA.debugLineNum = 262;BA.debugLine="Panel12.Visible = False";
_panel12.setVisible(__c.False);
 //BA.debugLineNum = 265;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
__c.LogImpl("236831244","Fecha seleccionada: "+_fechainicio,0);
 //BA.debugLineNum = 266;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_datechanged(int _year,int _month,int _day) throws Exception{
 //BA.debugLineNum = 295;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
 //BA.debugLineNum = 297;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
_label12hinicio.setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(long _date) throws Exception{
String _formatteddate = "";
 //BA.debugLineNum = 278;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
 //BA.debugLineNum = 280;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
 //BA.debugLineNum = 283;BA.debugLine="Label13Hfim.Text = formattedDate";
_label13hfim.setText(BA.ObjectToCharSequence(_formatteddate));
 //BA.debugLineNum = 285;BA.debugLine="FechaFin = formattedDate";
_fechafin = _formatteddate;
 //BA.debugLineNum = 287;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
__c.LogImpl("237027849","Fecha de fin"+_fechafin,0);
 //BA.debugLineNum = 289;BA.debugLine="Panel13.Visible = False";
_panel13.setVisible(__c.False);
 //BA.debugLineNum = 292;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
__c.LogImpl("237027854","Fecha seleccionada: "+_formatteddate,0);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
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
b4a.example.ef.httpjob _j4 = null;
String _turno = "";
String _des_turno = "";
anywheresoftware.b4a.BA.IterableList group10;
int index10;
int groupLen10;
anywheresoftware.b4a.BA.IterableList group25;
int index25;
int groupLen25;
anywheresoftware.b4a.BA.IterableList group41;
int index41;
int groupLen41;
anywheresoftware.b4a.BA.IterableList group58;
int index58;
int groupLen58;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 122;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
parent._label3name.setText(BA.ObjectToCharSequence(((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ));
 //BA.debugLineNum = 125;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxnitperson._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 127;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 128;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 129;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = parent._createcommand("select_nit",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 132;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 135;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 137;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 138;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 141;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 4:
//for
this.state = 7;
group10 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index10 = 0;
groupLen10 = group10.getSize();
this.state = 43;
if (true) break;

case 43:
//C
this.state = 7;
if (index10 < groupLen10) {
this.state = 6;
_row = (Object[])(group10.Get(index10));}
if (true) break;

case 44:
//C
this.state = 43;
index10++;
if (true) break;

case 6:
//C
this.state = 44;
 //BA.debugLineNum = 142;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 143;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 145;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
parent._sd_xcomboboxnitperson._add /*String*/ (_razonsocial+" - "+_nit,(Object)(_nit));
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
 //BA.debugLineNum = 150;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("236700190","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 157;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 160;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxlabor._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 162;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
_cmdlabor = parent._createcommand("select_labor",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 163;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 164;BA.debugLine="If j2.Success Then";
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
 //BA.debugLineNum = 165;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
_req._handlejobasync /*void*/ (_j2,"req_labor");
 //BA.debugLineNum = 166;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
parent.__c.WaitFor("req_labor_result", ba, this, (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 167;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
if (true) break;

case 14:
//for
this.state = 17;
group25 = _reslabor.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index25 = 0;
groupLen25 = group25.getSize();
this.state = 47;
if (true) break;

case 47:
//C
this.state = 17;
if (index25 < groupLen25) {
this.state = 16;
_rowlabor = (Object[])(group25.Get(index25));}
if (true) break;

case 48:
//C
this.state = 47;
index25++;
if (true) break;

case 16:
//C
this.state = 48;
 //BA.debugLineNum = 168;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
_codigodestino = BA.ObjectToString(_rowlabor[(int) (0)]);
 //BA.debugLineNum = 169;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
_descripciondestino = BA.ObjectToString(_rowlabor[(int) (1)]);
 //BA.debugLineNum = 170;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino & \" -";
parent._sd_xcomboboxlabor._add /*String*/ (_descripciondestino+" - "+_codigodestino,(Object)(_codigodestino));
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
 //BA.debugLineNum = 173;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
parent.__c.LogImpl("236700213","Error en la consulta de destinos: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 175;BA.debugLine="j2.Release";
_j2._release /*String*/ ();
 //BA.debugLineNum = 180;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxconcepto._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 183;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = parent._createcommand("select_concepto",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 186;BA.debugLine="ConceptoDataMap.Initialize";
parent._conceptodatamap.Initialize();
 //BA.debugLineNum = 188;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 191;BA.debugLine="If j3.Success Then";
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
 //BA.debugLineNum = 193;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
_req._handlejobasync /*void*/ (_j3,"req_concept");
 //BA.debugLineNum = 194;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, this, (Object)(_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 197;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
if (true) break;

case 24:
//for
this.state = 27;
group41 = _resconc.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index41 = 0;
groupLen41 = group41.getSize();
this.state = 51;
if (true) break;

case 51:
//C
this.state = 27;
if (index41 < groupLen41) {
this.state = 26;
_rowconcep = (Object[])(group41.Get(index41));}
if (true) break;

case 52:
//C
this.state = 51;
index41++;
if (true) break;

case 26:
//C
this.state = 52;
 //BA.debugLineNum = 198;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
_cod_concept = BA.ObjectToString(_rowconcep[(int) (0)]);
 //BA.debugLineNum = 199;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
_des_concept = BA.ObjectToString(_rowconcep[(int) (1)]);
 //BA.debugLineNum = 200;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
_dstjo_cncpto = BA.ObjectToString(_rowconcep[(int) (2)]);
 //BA.debugLineNum = 203;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept & \" - \" &";
parent._sd_xcomboboxconcepto._add /*String*/ (_des_concept+" - "+_cod_concept,(Object)(_cod_concept));
 //BA.debugLineNum = 206;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
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
 //BA.debugLineNum = 210;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
parent.__c.LogImpl("236700250","Error en la consulta de conceptos: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
 //BA.debugLineNum = 214;BA.debugLine="j3.Release";
_j3._release /*String*/ ();
 //BA.debugLineNum = 217;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxturno._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 220;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = parent._createcommand("select_turnos",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 223;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 226;BA.debugLine="If j4.Success Then";
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
 //BA.debugLineNum = 228;BA.debugLine="Req.HandleJobAsync(j4, \"req_concept\")";
_req._handlejobasync /*void*/ (_j4,"req_concept");
 //BA.debugLineNum = 229;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, this, (Object)(_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resconc = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 232;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
if (true) break;

case 34:
//for
this.state = 37;
group58 = _resconc.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index58 = 0;
groupLen58 = group58.getSize();
this.state = 55;
if (true) break;

case 55:
//C
this.state = 37;
if (index58 < groupLen58) {
this.state = 36;
_rowconcep = (Object[])(group58.Get(index58));}
if (true) break;

case 56:
//C
this.state = 55;
index58++;
if (true) break;

case 36:
//C
this.state = 56;
 //BA.debugLineNum = 233;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
_turno = BA.ObjectToString(_rowconcep[(int) (0)]);
 //BA.debugLineNum = 234;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
_des_turno = BA.ObjectToString(_rowconcep[(int) (1)]);
 //BA.debugLineNum = 236;BA.debugLine="SD_xComboBoxTurno.Add(Turno & \" - \" , Des_Turno";
parent._sd_xcomboboxturno._add /*String*/ (_turno+" - ",(Object)(_des_turno));
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
 //BA.debugLineNum = 240;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
parent.__c.LogImpl("236700280","Error en la consulta de conceptos: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = -1;
;
 //BA.debugLineNum = 244;BA.debugLine="j4.Release";
_j4._release /*String*/ ();
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
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
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.SpinnerWrapper _newsp = null;
int _i = 0;
 //BA.debugLineNum = 79;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 81;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 83;BA.debugLine="utilClass.Initialize";
_utilclass._initialize /*String*/ (ba);
 //BA.debugLineNum = 85;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
_utilclass._setstatusbarcolor /*String*/ (__c.Colors.White,__c.Colors.White);
 //BA.debugLineNum = 86;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
_root.LoadLayout("FomrPerson",ba);
 //BA.debugLineNum = 87;BA.debugLine="ScrollView1.Panel.Height=1100dip";
_scrollview1.getPanel().setHeight(__c.DipToCurrent((int) (1100)));
 //BA.debugLineNum = 88;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
_scrollview1.getPanel().LoadLayout("ScrollUIPerson",ba);
 //BA.debugLineNum = 90;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
_edittext3cantidat.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 91;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
_edittext1percentage.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 92;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
_edittext4obsv.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 93;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
_edittext2horas.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 96;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group11 = _root.GetAllViewsRecursive();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group11.Get(index11)));
 //BA.debugLineNum = 97;BA.debugLine="If v Is Spinner Then";
if (_v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
 //BA.debugLineNum = 98;BA.debugLine="Dim newsp As Spinner=v";
_newsp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_newsp = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
 //BA.debugLineNum = 99;BA.debugLine="For i=1 To 16";
{
final int step14 = 1;
final int limit14 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 100;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
_newsp.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_v.getTag())+" "+BA.NumberToString(_i)}));
 }
};
 };
 }
};
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 740;BA.debugLine="Dim id As String";
_id = "";
 //BA.debugLineNum = 743;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
_id = ((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ;
 //BA.debugLineNum = 746;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = parent.__c.Regex.Matcher("\\#(.+)",_id);
 //BA.debugLineNum = 748;BA.debugLine="If matcher.Find() Then";
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
 //BA.debugLineNum = 749;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
_id = _matcher.Group((int) (1));
 //BA.debugLineNum = 750;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
parent.__c.LogImpl("239387147","ID: "+_id,0);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 752;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
parent.__c.LogImpl("239387149","No se encontró el carácter # en la cadena.",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 756;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
_cmd = parent._createcommand("select_searchPerson",new Object[]{(Object)(_id)});
 //BA.debugLineNum = 760;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 761;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 764;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 766;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 769;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 770;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 772;BA.debugLine="If res.Rows.Size > 0 Then";
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
 //BA.debugLineNum = 774;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 775;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 776;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = parent._createcommand("insert_Mvto_Trab_Propios",new Object[]{(Object)(_id),(Object)(parent._fechainicio),(Object)(parent._laborcbx),(Object)(0),(Object)(parent._conceptocbx),(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)(parent._horastext),(Object)(parent._cantidadtext),(Object)(parent._obsvtext),(Object)(parent._turnocbx),(Object)(parent._porcentagetext)});
 //BA.debugLineNum = 777;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 778;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 780;BA.debugLine="Try";
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
 //BA.debugLineNum = 781;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 //BA.debugLineNum = 782;BA.debugLine="Log(\"Se han recuperado datos: propios \" & res.";
parent.__c.LogImpl("239387179","Se han recuperado datos: propios "+BA.NumberToString(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 //BA.debugLineNum = 785;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("239387182","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
 //BA.debugLineNum = 789;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 790;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 791;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = parent._createcommand("insert_Mvto_Trab_Tmprles",new Object[]{(Object)(_id),(Object)(parent._fechainicio),(Object)(parent._laborcbx),(Object)(0),(Object)(parent._conceptocbx),(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx),(Object)(parent._lotecbx),(Object)(parent._horastext),(Object)(parent._cantidadtext),(Object)(parent._obsvtext),(Object)(parent._turnocbx),(Object)(parent._porcentagetext)});
 //BA.debugLineNum = 792;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (_cmd,parent.__c.Null);
 //BA.debugLineNum = 793;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 795;BA.debugLine="Try";
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
 //BA.debugLineNum = 796;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
 //BA.debugLineNum = 797;BA.debugLine="Log(\"No se encontraron datos para el ID: \" & i";
parent.__c.LogImpl("239387194","No se encontraron datos para el ID: "+_id,0);
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
 //BA.debugLineNum = 800;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("239387197","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
 //BA.debugLineNum = 805;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
parent.__c.LogImpl("239387202","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
 //BA.debugLineNum = 807;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 308;BA.debugLine="Sub can_OnCancelDate ()";
 //BA.debugLineNum = 309;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.main._dbcommand  _createcommand(String _name,Object[] _parameters) throws Exception{
b4a.example.ef.main._dbcommand _cmd = null;
 //BA.debugLineNum = 373;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
 //BA.debugLineNum = 374;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
 //BA.debugLineNum = 375;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
 //BA.debugLineNum = 376;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
 //BA.debugLineNum = 377;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
 //BA.debugLineNum = 378;BA.debugLine="Return cmd";
if (true) return _cmd;
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public b4a.example.ef.dbrequestmanager  _createrequest(String _db) throws Exception{
b4a.example.ef.dbrequestmanager _req = null;
 //BA.debugLineNum = 367;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
 //BA.debugLineNum = 368;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 369;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (ba,this,_rdclink+"?DBName="+_db);
 //BA.debugLineNum = 370;BA.debugLine="Return Req";
if (true) return _req;
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 303;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
 //BA.debugLineNum = 304;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
_label10.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 305;BA.debugLine="Label10.TextColor=Colors.Black";
_label10.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(String _nombre) throws Exception{
 //BA.debugLineNum = 442;BA.debugLine="Sub DeleteRecord (Nombre As String)";
 //BA.debugLineNum = 450;BA.debugLine="End Sub";
return "";
}
public String  _edittext1percentage_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 723;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
 //BA.debugLineNum = 724;BA.debugLine="Log(PorcentageText)";
__c.LogImpl("239190529",_porcentagetext,0);
 //BA.debugLineNum = 725;BA.debugLine="End Sub";
return "";
}
public String  _edittext2horas_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 716;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
 //BA.debugLineNum = 717;BA.debugLine="HorasText = New";
_horastext = _new;
 //BA.debugLineNum = 720;BA.debugLine="Log(HorasText)";
__c.LogImpl("239124996",_horastext,0);
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return "";
}
public String  _edittext3cantidat_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 727;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
 //BA.debugLineNum = 728;BA.debugLine="CantidadText = New";
_cantidadtext = _new;
 //BA.debugLineNum = 730;BA.debugLine="Log(CantidadText)";
__c.LogImpl("239256067",_cantidadtext,0);
 //BA.debugLineNum = 731;BA.debugLine="End Sub";
return "";
}
public String  _edittext4obsv_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 733;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
 //BA.debugLineNum = 734;BA.debugLine="ObsvText =New";
_obsvtext = _new;
 //BA.debugLineNum = 736;BA.debugLine="Log(ObsvText)";
__c.LogImpl("239321603",_obsvtext,0);
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 417;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 418;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
_cmd = parent._createcommand("select_clientes",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 419;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 420;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 421;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 422;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 424;BA.debugLine="req.PrintTable(res)";
_req._printtable /*String*/ (_res);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 426;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("238010890","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 428;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 429;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 383;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 384;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 386;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 387;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 388;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 390;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 391;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 392;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 393;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 397;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 398;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 399;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 400;BA.debugLine="For Each record As Object In row";
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
 //BA.debugLineNum = 401;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 //BA.debugLineNum = 403;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 404;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 405;BA.debugLine="Spinner2.Add(cadena)";
parent._spinner2.Add(_cadena);
 //BA.debugLineNum = 406;BA.debugLine="cadena=\"\"";
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
 //BA.debugLineNum = 410;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("237945372","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 412;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 496;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 497;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = parent._createcommand("select_labores",(Object[])(parent.__c.Null));
 //BA.debugLineNum = 499;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 500;BA.debugLine="Dim separador As String";
_separador = "";
 //BA.debugLineNum = 501;BA.debugLine="Dim longitud As Int";
_longitud = 0;
 //BA.debugLineNum = 503;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 504;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 505;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 506;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 510;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 511;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 512;BA.debugLine="separador=\" - \"";
_separador = " - ";
 //BA.debugLineNum = 513;BA.debugLine="For Each record As Object In row";
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
 //BA.debugLineNum = 514;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
 //BA.debugLineNum = 516;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
 //BA.debugLineNum = 517;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
 //BA.debugLineNum = 518;BA.debugLine="Spinner4.Add(cadena)";
parent._spinner4.Add(_cadena);
 //BA.debugLineNum = 519;BA.debugLine="cadena=\"\"";
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
 //BA.debugLineNum = 523;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("238338588","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 525;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 467;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = parent._createrequest(_usedb);
 //BA.debugLineNum = 468;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(_nit),(Object)(_hda)});
 //BA.debugLineNum = 470;BA.debugLine="Dim cadena As String";
_cadena = "";
 //BA.debugLineNum = 472;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 473;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 474;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 475;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 479;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 480;BA.debugLine="cadena = \"\"";
_cadena = "";
 //BA.debugLineNum = 481;BA.debugLine="For Each record As Object In row";
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
 //BA.debugLineNum = 482;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
 //BA.debugLineNum = 483;BA.debugLine="Spinner3.Add(cadena)";
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
 //BA.debugLineNum = 490;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("238273048","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 492;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _globals() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _panel10horainicio = null;
anywheresoftware.b4a.objects.LabelWrapper _labelfecha = null;
 //BA.debugLineNum = 67;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 68;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
_panel10horainicio = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 69;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
_labelfecha = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _hinicio_ondateset(int _year,int _monthofyear,int _dayofmonth) throws Exception{
 //BA.debugLineNum = 341;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
 //BA.debugLineNum = 342;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
_label12hinicio.setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
 //BA.debugLineNum = 343;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
_label12hinicio.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 74;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public String  _insertrecord(String _nombre,int _salario) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
 //BA.debugLineNum = 440;BA.debugLine="End Sub";
return "";
}
public String  _label10_click() throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Private Sub Label10_Click";
 //BA.debugLineNum = 329;BA.debugLine="Panel9_Click";
_panel9_click();
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return "";
}
public String  _label12hinicio_click() throws Exception{
 //BA.debugLineNum = 249;BA.debugLine="Private Sub Label12Hinicio_Click";
 //BA.debugLineNum = 250;BA.debugLine="Panel12.Visible= True";
_panel12.setVisible(__c.True);
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return "";
}
public String  _label13hfim_click() throws Exception{
 //BA.debugLineNum = 274;BA.debugLine="Private Sub Label13Hfim_Click";
 //BA.debugLineNum = 275;BA.debugLine="Panel13.Visible= True";
_panel13.setVisible(__c.True);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click() throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Private Sub Label1Back_Click";
 //BA.debugLineNum = 351;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click() throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Private Sub Label2Save_Click";
 //BA.debugLineNum = 355;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Saved."),BA.ObjectToCharSequence(""),ba);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click() throws Exception{
 //BA.debugLineNum = 336;BA.debugLine="Private Sub Panel10Horainicio_Click";
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click() throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Private Sub Panel11horaFim_Click";
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click() throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Private Sub Panel2Time_Click";
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click() throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Private Sub Panel9_Click";
 //BA.debugLineNum = 313;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
_datepicker.Initialize(ba,"Date",(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
 //BA.debugLineNum = 314;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.1990");
 //BA.debugLineNum = 315;BA.debugLine="Datepicker.SetThemeDark";
_datepicker.SetThemeDark();
 //BA.debugLineNum = 316;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
_datepicker.SetMinDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 317;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
_mycalendar.Initialize(ba,"dd.mm.yyyy",_mycalendar.PRC,"2.02.2030");
 //BA.debugLineNum = 318;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
_datepicker.SetMaxDate((java.util.Calendar)(_mycalendar.getObject()));
 //BA.debugLineNum = 319;BA.debugLine="Datepicker.CancelColor = Colors.White";
_datepicker.setCancelColor(__c.Colors.White);
 //BA.debugLineNum = 320;BA.debugLine="Datepicker.OkColor = Colors.White";
_datepicker.setOkColor(__c.Colors.White);
 //BA.debugLineNum = 321;BA.debugLine="Datepicker.Title = \"Selecione\"";
_datepicker.setTitle("Selecione");
 //BA.debugLineNum = 322;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
_datepicker.setCancelText("Cancelar");
 //BA.debugLineNum = 323;BA.debugLine="Datepicker.OkText = \"Ok\"";
_datepicker.setOkText("Ok");
 //BA.debugLineNum = 324;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
_datepicker.SetOnCancel("Cancel");
 //BA.debugLineNum = 325;BA.debugLine="Datepicker.show2(\"iki\")";
_datepicker.show2("iki");
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxconcepto_itemclick(int _position,Object _value) throws Exception{
String _dstjo_cncpto = "";
 //BA.debugLineNum = 692;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
 //BA.debugLineNum = 693;BA.debugLine="ConceptoCBX = Value";
_conceptocbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 694;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
 //BA.debugLineNum = 695;BA.debugLine="ConceptoCBX = Null";
_conceptocbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 697;BA.debugLine="ConceptoCBX = Value";
_conceptocbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 700;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
_dstjo_cncpto = BA.ObjectToString(_conceptodatamap.Get(_value));
 //BA.debugLineNum = 703;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
__c.LogImpl("239059467","Valor seleccionado: "+_conceptocbx,0);
 //BA.debugLineNum = 704;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
__c.LogImpl("239059468","Dato dstjo_Cncpto: "+_dstjo_cncpto,0);
 //BA.debugLineNum = 707;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
if ((_dstjo_cncpto).equals("N")) { 
 //BA.debugLineNum = 709;BA.debugLine="EditText3cantidat.Enabled = False";
_edittext3cantidat.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 712;BA.debugLine="EditText3cantidat.Enabled = True";
_edittext3cantidat.setEnabled(__c.True);
 };
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 628;BA.debugLine="If Value = \"\" Then";
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
 //BA.debugLineNum = 629;BA.debugLine="haciendaCBX = Null";
parent._haciendacbx = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 631;BA.debugLine="haciendaCBX = Value";
parent._haciendacbx = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 633;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("238862854",parent._haciendacbx,0);
 //BA.debugLineNum = 634;BA.debugLine="SD_xComboBoxLote.Clear";
parent._sd_xcomboboxlote._clear /*String*/ ();
 //BA.debugLineNum = 635;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxlote._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 637;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 638;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 639;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = parent._createcommand("select_lotes",new Object[]{(Object)(parent._nitempresacbx),(Object)(parent._haciendacbx)});
 //BA.debugLineNum = 642;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 645;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 647;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 648;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 652;BA.debugLine="For Each row() As Object In res.Rows";
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
 //BA.debugLineNum = 653;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 656;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
parent._sd_xcomboboxlote._add /*String*/ ("Codigo: "+_codg_hacienda,(Object)(_codg_hacienda));
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
 //BA.debugLineNum = 661;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("238862882","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 665;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 667;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxlabor_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 681;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
 //BA.debugLineNum = 682;BA.debugLine="LaborCBX = Value";
_laborcbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 683;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
 //BA.debugLineNum = 684;BA.debugLine="LaborCBX = Null";
_laborcbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 686;BA.debugLine="LaborCBX = Value";
_laborcbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 689;BA.debugLine="Log(LaborCBX)";
__c.LogImpl("238993928",_laborcbx,0);
 //BA.debugLineNum = 690;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 669;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
 //BA.debugLineNum = 670;BA.debugLine="LoteCBX = Value";
_lotecbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 672;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
 //BA.debugLineNum = 673;BA.debugLine="LoteCBX = Null";
_lotecbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 675;BA.debugLine="LoteCBX = Value";
_lotecbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 678;BA.debugLine="Log(LoteCBX)";
__c.LogImpl("238928393",_lotecbx,0);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
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
anywheresoftware.b4a.BA.IterableList group17;
int index17;
int groupLen17;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 579;BA.debugLine="nitEmpresaCBX=Value";
parent._nitempresacbx = BA.ObjectToString(_value);
 //BA.debugLineNum = 581;BA.debugLine="If Value = \"\" Then";
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
 //BA.debugLineNum = 582;BA.debugLine="nitEmpresaCBX = Null";
parent._nitempresacbx = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 584;BA.debugLine="nitEmpresaCBX = Value";
parent._nitempresacbx = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 588;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
parent.__c.LogImpl("238797322","Valor seleccionado: "+parent._nitempresacbx,0);
 //BA.debugLineNum = 590;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
parent.__c.LogImpl("238797324","Posicion: "+BA.NumberToString(_position)+" VALUE: "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 591;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
parent._sd_xcomboboxhacienda._add /*String*/ ("----Select----",(Object)("1"));
 //BA.debugLineNum = 593;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
 //BA.debugLineNum = 594;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (ba,parent,parent._rdclink+"?DBName="+parent._main._pdbname /*String*/ );
 //BA.debugLineNum = 595;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = parent._createcommand("select_haciendas",new Object[]{(Object)("N")});
 //BA.debugLineNum = 598;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[0];
;
 //BA.debugLineNum = 601;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 603;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (_j,"req");
 //BA.debugLineNum = 604;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, this, (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[0];
;
 //BA.debugLineNum = 608;BA.debugLine="For Each row() As Object In res.Rows";
if (true) break;

case 10:
//for
this.state = 13;
group17 = _res.Rows /*anywheresoftware.b4a.objects.collections.List*/ ;
index17 = 0;
groupLen17 = group17.getSize();
this.state = 19;
if (true) break;

case 19:
//C
this.state = 13;
if (index17 < groupLen17) {
this.state = 12;
_row = (Object[])(group17.Get(index17));}
if (true) break;

case 20:
//C
this.state = 19;
index17++;
if (true) break;

case 12:
//C
this.state = 20;
 //BA.debugLineNum = 609;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
 //BA.debugLineNum = 610;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
 //BA.debugLineNum = 613;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
parent._sd_xcomboboxhacienda._add /*String*/ (_nombrehacienda+" - "+_codg_hacienda,(Object)(_codg_hacienda));
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
 //BA.debugLineNum = 618;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("238797352","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 621;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("238797355",parent._nitempresacbx,0);
 //BA.debugLineNum = 623;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 625;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxturno_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 810;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
 //BA.debugLineNum = 812;BA.debugLine="If Value = Null Or Value = \"\" Then";
if (_value== null || (_value).equals((Object)(""))) { 
 //BA.debugLineNum = 813;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
_turnocbx = BA.ObjectToString(__c.Null);
 }else {
 //BA.debugLineNum = 815;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
_turnocbx = BA.ObjectToString(_value);
 };
 //BA.debugLineNum = 817;BA.debugLine="End Sub";
return "";
}
public String  _spinner1_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 529;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
 //BA.debugLineNum = 531;BA.debugLine="End Sub";
return "";
}
public String  _spinner10_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return "";
}
public String  _spinner2_itemclick(int _position,Object _value) throws Exception{
String _nit = "";
String _hacienda = "";
 //BA.debugLineNum = 452;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
 //BA.debugLineNum = 453;BA.debugLine="Dim nit As String";
_nit = "";
 //BA.debugLineNum = 454;BA.debugLine="Dim hacienda As String";
_hacienda = "";
 //BA.debugLineNum = 456;BA.debugLine="Spinner3.Clear";
_spinner3.Clear();
 //BA.debugLineNum = 458;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("238207494",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
 //BA.debugLineNum = 459;BA.debugLine="nit= \"890307964\"";
_nit = "890307964";
 //BA.debugLineNum = 460;BA.debugLine="hacienda = Value";
_hacienda = BA.ObjectToString(_value);
 //BA.debugLineNum = 461;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
 //BA.debugLineNum = 463;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
_getrecordlotes("BDPichucho",_nit,_hacienda);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return "";
}
public String  _spinner3_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 533;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
 //BA.debugLineNum = 535;BA.debugLine="End Sub";
return "";
}
public String  _spinner4_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 537;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
 //BA.debugLineNum = 539;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 541;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
 //BA.debugLineNum = 543;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(int _position,Object _value) throws Exception{
 //BA.debugLineNum = 545;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
 //BA.debugLineNum = 547;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
