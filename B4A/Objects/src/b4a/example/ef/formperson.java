package b4a.example.ef;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class formperson extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.ef.formperson");
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4a.example.ef.b4xcollections _b4xcollections = null;
public b4a.example.ef.b4xpages _b4xpages = null;
public b4a.example.ef.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.ef.formperson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=26738688;
 //BA.debugLineNum = 26738688;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=26738689;
 //BA.debugLineNum = 26738689;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=26738690;
 //BA.debugLineNum = 26738690;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=27066368;
 //BA.debugLineNum = 27066368;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=27066370;
 //BA.debugLineNum = 27066370;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=27066371;
 //BA.debugLineNum = 27066371;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=27000832;
 //BA.debugLineNum = 27000832;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=27000834;
 //BA.debugLineNum = 27000834;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=27000837;
 //BA.debugLineNum = 27000837;BA.debugLine="Label12Hinicio.Text = formattedDate";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=27000839;
 //BA.debugLineNum = 27000839;BA.debugLine="FechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=27000841;
 //BA.debugLineNum = 27000841;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=27000844;
 //BA.debugLineNum = 27000844;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
__c.LogImpl("327000844","Fecha seleccionada: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=27000845;
 //BA.debugLineNum = 27000845;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=27262976;
 //BA.debugLineNum = 27262976;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=27262978;
 //BA.debugLineNum = 27262978;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=27262979;
 //BA.debugLineNum = 27262979;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=27197440;
 //BA.debugLineNum = 27197440;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=27197442;
 //BA.debugLineNum = 27197442;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=27197445;
 //BA.debugLineNum = 27197445;BA.debugLine="Label13Hfim.Text = formattedDate";
__ref._label13hfim /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=27197447;
 //BA.debugLineNum = 27197447;BA.debugLine="FechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=27197449;
 //BA.debugLineNum = 27197449;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
__c.LogImpl("327197449","Fecha de fin"+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=27197451;
 //BA.debugLineNum = 27197451;BA.debugLine="Panel13.Visible = False";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=27197454;
 //BA.debugLineNum = 27197454;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
__c.LogImpl("327197454","Fecha seleccionada: "+_formatteddate,0);
RDebugUtils.currentLine=27197455;
 //BA.debugLineNum = 27197455;BA.debugLine="End Sub";
return "";
}
public void  _b4xpage_appear(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "b4xpage_appear", false))
	 {Debug.delegate(ba, "b4xpage_appear", null); return;}
ResumableSub_B4XPage_Appear rsub = new ResumableSub_B4XPage_Appear(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_B4XPage_Appear extends BA.ResumableSub {
public ResumableSub_B4XPage_Appear(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=26869762;
 //BA.debugLineNum = 26869762;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
__ref._label3name /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ));
RDebugUtils.currentLine=26869765;
 //BA.debugLineNum = 26869765;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=26869767;
 //BA.debugLineNum = 26869767;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=26869768;
 //BA.debugLineNum = 26869768;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=26869769;
 //BA.debugLineNum = 26869769;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=26869772;
 //BA.debugLineNum = 26869772;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=26869775;
 //BA.debugLineNum = 26869775;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=26869777;
 //BA.debugLineNum = 26869777;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=26869778;
 //BA.debugLineNum = 26869778;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=26869781;
 //BA.debugLineNum = 26869781;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=26869782;
 //BA.debugLineNum = 26869782;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=26869783;
 //BA.debugLineNum = 26869783;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=26869785;
 //BA.debugLineNum = 26869785;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
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
RDebugUtils.currentLine=26869790;
 //BA.debugLineNum = 26869790;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("326869790","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=26869797;
 //BA.debugLineNum = 26869797;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=26869800;
 //BA.debugLineNum = 26869800;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=26869802;
 //BA.debugLineNum = 26869802;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=26869803;
 //BA.debugLineNum = 26869803;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=26869804;
 //BA.debugLineNum = 26869804;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=26869805;
 //BA.debugLineNum = 26869805;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j2,"req_labor");
RDebugUtils.currentLine=26869806;
 //BA.debugLineNum = 26869806;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=26869807;
 //BA.debugLineNum = 26869807;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
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
RDebugUtils.currentLine=26869808;
 //BA.debugLineNum = 26869808;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
_codigodestino = BA.ObjectToString(_rowlabor[(int) (0)]);
RDebugUtils.currentLine=26869809;
 //BA.debugLineNum = 26869809;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
_descripciondestino = BA.ObjectToString(_rowlabor[(int) (1)]);
RDebugUtils.currentLine=26869810;
 //BA.debugLineNum = 26869810;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino & \" -";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripciondestino+" - "+_codigodestino,(Object)(_codigodestino));
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
RDebugUtils.currentLine=26869813;
 //BA.debugLineNum = 26869813;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
parent.__c.LogImpl("326869813","Error en la consulta de destinos: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=26869815;
 //BA.debugLineNum = 26869815;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=26869820;
 //BA.debugLineNum = 26869820;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=26869823;
 //BA.debugLineNum = 26869823;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_concepto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=26869826;
 //BA.debugLineNum = 26869826;BA.debugLine="ConceptoDataMap.Initialize";
__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=26869828;
 //BA.debugLineNum = 26869828;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=26869831;
 //BA.debugLineNum = 26869831;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=26869833;
 //BA.debugLineNum = 26869833;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
_req._handlejobasync /*void*/ (null,_j3,"req_concept");
RDebugUtils.currentLine=26869834;
 //BA.debugLineNum = 26869834;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=26869837;
 //BA.debugLineNum = 26869837;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
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
RDebugUtils.currentLine=26869838;
 //BA.debugLineNum = 26869838;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
_cod_concept = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=26869839;
 //BA.debugLineNum = 26869839;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
_des_concept = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=26869840;
 //BA.debugLineNum = 26869840;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
_dstjo_cncpto = BA.ObjectToString(_rowconcep[(int) (2)]);
RDebugUtils.currentLine=26869843;
 //BA.debugLineNum = 26869843;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept & \" - \" &";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_des_concept+" - "+_cod_concept,(Object)(_cod_concept));
RDebugUtils.currentLine=26869846;
 //BA.debugLineNum = 26869846;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_cod_concept),(Object)(_dstjo_cncpto));
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
RDebugUtils.currentLine=26869850;
 //BA.debugLineNum = 26869850;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
parent.__c.LogImpl("326869850","Error en la consulta de conceptos: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=26869854;
 //BA.debugLineNum = 26869854;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=26869857;
 //BA.debugLineNum = 26869857;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=26869860;
 //BA.debugLineNum = 26869860;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_turnos",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=26869863;
 //BA.debugLineNum = 26869863;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=26869866;
 //BA.debugLineNum = 26869866;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=26869868;
 //BA.debugLineNum = 26869868;BA.debugLine="Req.HandleJobAsync(j4, \"req_concept\")";
_req._handlejobasync /*void*/ (null,_j4,"req_concept");
RDebugUtils.currentLine=26869869;
 //BA.debugLineNum = 26869869;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resconc = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=26869872;
 //BA.debugLineNum = 26869872;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
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
RDebugUtils.currentLine=26869873;
 //BA.debugLineNum = 26869873;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
_turno = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=26869874;
 //BA.debugLineNum = 26869874;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
_des_turno = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=26869876;
 //BA.debugLineNum = 26869876;BA.debugLine="SD_xComboBoxTurno.Add(Turno & \" - \" , Des_Turno";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_turno+" - ",(Object)(_des_turno));
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
RDebugUtils.currentLine=26869880;
 //BA.debugLineNum = 26869880;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
parent.__c.LogImpl("326869880","Error en la consulta de conceptos: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = -1;
;
RDebugUtils.currentLine=26869884;
 //BA.debugLineNum = 26869884;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=26869886;
 //BA.debugLineNum = 26869886;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public b4a.example.ef.main._dbcommand  _createcommand(b4a.example.ef.formperson __ref,String _name,Object[] _parameters) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "createcommand", false))
	 {return ((b4a.example.ef.main._dbcommand) Debug.delegate(ba, "createcommand", new Object[] {_name,_parameters}));}
b4a.example.ef.main._dbcommand _cmd = null;
RDebugUtils.currentLine=28049408;
 //BA.debugLineNum = 28049408;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=28049409;
 //BA.debugLineNum = 28049409;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=28049410;
 //BA.debugLineNum = 28049410;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=28049411;
 //BA.debugLineNum = 28049411;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=28049412;
 //BA.debugLineNum = 28049412;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=28049413;
 //BA.debugLineNum = 28049413;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=28049414;
 //BA.debugLineNum = 28049414;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.ef.formperson __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.SpinnerWrapper _newsp = null;
int _i = 0;
RDebugUtils.currentLine=26804224;
 //BA.debugLineNum = 26804224;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=26804226;
 //BA.debugLineNum = 26804226;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=26804228;
 //BA.debugLineNum = 26804228;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=26804230;
 //BA.debugLineNum = 26804230;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=26804231;
 //BA.debugLineNum = 26804231;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FomrPerson",ba);
RDebugUtils.currentLine=26804232;
 //BA.debugLineNum = 26804232;BA.debugLine="ScrollView1.Panel.Height=1100dip";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__c.DipToCurrent((int) (1100)));
RDebugUtils.currentLine=26804233;
 //BA.debugLineNum = 26804233;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("ScrollUIPerson",ba);
RDebugUtils.currentLine=26804235;
 //BA.debugLineNum = 26804235;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=26804236;
 //BA.debugLineNum = 26804236;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
__ref._edittext1percentage /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=26804237;
 //BA.debugLineNum = 26804237;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
__ref._edittext4obsv /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=26804238;
 //BA.debugLineNum = 26804238;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
__ref._edittext2horas /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=26804241;
 //BA.debugLineNum = 26804241;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group11.Get(index11)));
RDebugUtils.currentLine=26804242;
 //BA.debugLineNum = 26804242;BA.debugLine="If v Is Spinner Then";
if (_v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
RDebugUtils.currentLine=26804243;
 //BA.debugLineNum = 26804243;BA.debugLine="Dim newsp As Spinner=v";
_newsp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_newsp = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
RDebugUtils.currentLine=26804244;
 //BA.debugLineNum = 26804244;BA.debugLine="For i=1 To 16";
{
final int step14 = 1;
final int limit14 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=26804245;
 //BA.debugLineNum = 26804245;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
_newsp.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_v.getTag())+" "+BA.NumberToString(_i)}));
 }
};
 };
 }
};
RDebugUtils.currentLine=26804263;
 //BA.debugLineNum = 26804263;BA.debugLine="End Sub";
return "";
}
public void  _button1_click(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "button1_click", false))
	 {Debug.delegate(ba, "button1_click", null); return;}
ResumableSub_Button1_Click rsub = new ResumableSub_Button1_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_Button1_Click extends BA.ResumableSub {
public ResumableSub_Button1_Click(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
b4a.example.ef.formperson parent;
String _id = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
b4a.example.ef.main._dbcommand _cmd = null;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formperson";

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29556737;
 //BA.debugLineNum = 29556737;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=29556740;
 //BA.debugLineNum = 29556740;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
_id = ((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ;
RDebugUtils.currentLine=29556743;
 //BA.debugLineNum = 29556743;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = parent.__c.Regex.Matcher("\\#(.+)",_id);
RDebugUtils.currentLine=29556745;
 //BA.debugLineNum = 29556745;BA.debugLine="If matcher.Find() Then";
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
RDebugUtils.currentLine=29556746;
 //BA.debugLineNum = 29556746;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
_id = _matcher.Group((int) (1));
RDebugUtils.currentLine=29556747;
 //BA.debugLineNum = 29556747;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
parent.__c.LogImpl("329556747","ID: "+_id,0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=29556749;
 //BA.debugLineNum = 29556749;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
parent.__c.LogImpl("329556749","No se encontró el carácter # en la cadena.",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=29556753;
 //BA.debugLineNum = 29556753;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_searchPerson",new Object[]{(Object)(_id)});
RDebugUtils.currentLine=29556757;
 //BA.debugLineNum = 29556757;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=29556758;
 //BA.debugLineNum = 29556758;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=29556761;
 //BA.debugLineNum = 29556761;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=29556763;
 //BA.debugLineNum = 29556763;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=29556766;
 //BA.debugLineNum = 29556766;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=29556767;
 //BA.debugLineNum = 29556767;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=29556769;
 //BA.debugLineNum = 29556769;BA.debugLine="If res.Rows.Size > 0 Then";
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
RDebugUtils.currentLine=29556771;
 //BA.debugLineNum = 29556771;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=29556772;
 //BA.debugLineNum = 29556772;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=29556773;
 //BA.debugLineNum = 29556773;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Propios",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=29556774;
 //BA.debugLineNum = 29556774;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=29556775;
 //BA.debugLineNum = 29556775;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=29556777;
 //BA.debugLineNum = 29556777;BA.debugLine="Try";
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
RDebugUtils.currentLine=29556778;
 //BA.debugLineNum = 29556778;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=29556779;
 //BA.debugLineNum = 29556779;BA.debugLine="Log(\"Se han recuperado datos: propios \" & res.";
parent.__c.LogImpl("329556779","Se han recuperado datos: propios "+BA.NumberToString(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=29556782;
 //BA.debugLineNum = 29556782;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("329556782","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=29556786;
 //BA.debugLineNum = 29556786;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=29556787;
 //BA.debugLineNum = 29556787;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=29556788;
 //BA.debugLineNum = 29556788;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Tmprles",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=29556789;
 //BA.debugLineNum = 29556789;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=29556790;
 //BA.debugLineNum = 29556790;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=29556792;
 //BA.debugLineNum = 29556792;BA.debugLine="Try";
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
RDebugUtils.currentLine=29556793;
 //BA.debugLineNum = 29556793;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=29556794;
 //BA.debugLineNum = 29556794;BA.debugLine="Log(\"No se encontraron datos para el ID: \" & i";
parent.__c.LogImpl("329556794","No se encontraron datos para el ID: "+_id,0);
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
RDebugUtils.currentLine=29556797;
 //BA.debugLineNum = 29556797;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("329556797","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=29556802;
 //BA.debugLineNum = 29556802;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
parent.__c.LogImpl("329556802","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=29556804;
 //BA.debugLineNum = 29556804;BA.debugLine="End Sub";
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
public String  _can_oncanceldate(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "can_oncanceldate", false))
	 {return ((String) Debug.delegate(ba, "can_oncanceldate", null));}
RDebugUtils.currentLine=27394048;
 //BA.debugLineNum = 27394048;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=27394049;
 //BA.debugLineNum = 27394049;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=27394050;
 //BA.debugLineNum = 27394050;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
RDebugUtils.currentLine=26607616;
 //BA.debugLineNum = 26607616;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=26607617;
 //BA.debugLineNum = 26607617;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=26607618;
 //BA.debugLineNum = 26607618;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=26607622;
 //BA.debugLineNum = 26607622;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=26607624;
 //BA.debugLineNum = 26607624;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=26607625;
 //BA.debugLineNum = 26607625;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=26607626;
 //BA.debugLineNum = 26607626;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=26607627;
 //BA.debugLineNum = 26607627;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=26607628;
 //BA.debugLineNum = 26607628;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=26607629;
 //BA.debugLineNum = 26607629;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=26607630;
 //BA.debugLineNum = 26607630;BA.debugLine="Private DateDialog As DateDialog";
_datedialog = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
RDebugUtils.currentLine=26607631;
 //BA.debugLineNum = 26607631;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=26607632;
 //BA.debugLineNum = 26607632;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=26607633;
 //BA.debugLineNum = 26607633;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=26607634;
 //BA.debugLineNum = 26607634;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607635;
 //BA.debugLineNum = 26607635;BA.debugLine="Private Spinner1 As Spinner";
_spinner1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=26607636;
 //BA.debugLineNum = 26607636;BA.debugLine="Private Spinner2 As Spinner";
_spinner2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=26607637;
 //BA.debugLineNum = 26607637;BA.debugLine="Private Spinner3 As Spinner";
_spinner3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=26607638;
 //BA.debugLineNum = 26607638;BA.debugLine="Private Spinner4 As Spinner";
_spinner4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=26607644;
 //BA.debugLineNum = 26607644;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607645;
 //BA.debugLineNum = 26607645;BA.debugLine="Private Label13Hfim As Label";
_label13hfim = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607646;
 //BA.debugLineNum = 26607646;BA.debugLine="Private Label12Hinicio As Label";
_label12hinicio = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607647;
 //BA.debugLineNum = 26607647;BA.debugLine="Private EditText1percentage As EditText";
_edittext1percentage = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=26607648;
 //BA.debugLineNum = 26607648;BA.debugLine="Private EditText2horas As EditText";
_edittext2horas = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=26607649;
 //BA.debugLineNum = 26607649;BA.debugLine="Private EditText3cantidat As EditText";
_edittext3cantidat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=26607650;
 //BA.debugLineNum = 26607650;BA.debugLine="Private EditText4obsv As EditText";
_edittext4obsv = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=26607651;
 //BA.debugLineNum = 26607651;BA.debugLine="Private Label3Name As Label";
_label3name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26607653;
 //BA.debugLineNum = 26607653;BA.debugLine="Private SD_xComboBoxNitPerson As SD_xComboBox";
_sd_xcomboboxnitperson = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=26607654;
 //BA.debugLineNum = 26607654;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=26607656;
 //BA.debugLineNum = 26607656;BA.debugLine="Dim FechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=26607657;
 //BA.debugLineNum = 26607657;BA.debugLine="Dim FechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=26607658;
 //BA.debugLineNum = 26607658;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=26607659;
 //BA.debugLineNum = 26607659;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=26607660;
 //BA.debugLineNum = 26607660;BA.debugLine="Dim LoteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=26607661;
 //BA.debugLineNum = 26607661;BA.debugLine="Dim LaborCBX As String";
_laborcbx = "";
RDebugUtils.currentLine=26607662;
 //BA.debugLineNum = 26607662;BA.debugLine="Dim ConceptoCBX As String";
_conceptocbx = "";
RDebugUtils.currentLine=26607663;
 //BA.debugLineNum = 26607663;BA.debugLine="Dim TurnoCBX As String";
_turnocbx = "";
RDebugUtils.currentLine=26607664;
 //BA.debugLineNum = 26607664;BA.debugLine="Dim HorasText As String";
_horastext = "";
RDebugUtils.currentLine=26607665;
 //BA.debugLineNum = 26607665;BA.debugLine="Dim PorcentageText As String";
_porcentagetext = "";
RDebugUtils.currentLine=26607666;
 //BA.debugLineNum = 26607666;BA.debugLine="Dim CantidadText As String";
_cantidadtext = "";
RDebugUtils.currentLine=26607667;
 //BA.debugLineNum = 26607667;BA.debugLine="Dim ObsvText As String";
_obsvtext = "";
RDebugUtils.currentLine=26607668;
 //BA.debugLineNum = 26607668;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=26607669;
 //BA.debugLineNum = 26607669;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=26607670;
 //BA.debugLineNum = 26607670;BA.debugLine="Private SD_xComboBoxConcepto As SD_xComboBox";
_sd_xcomboboxconcepto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=26607671;
 //BA.debugLineNum = 26607671;BA.debugLine="Private SD_xComboBoxTurno As SD_xComboBox";
_sd_xcomboboxturno = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=26607672;
 //BA.debugLineNum = 26607672;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=26607673;
 //BA.debugLineNum = 26607673;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=26607674;
 //BA.debugLineNum = 26607674;BA.debugLine="Private AS_DatePicker2 As AS_DatePicker";
_as_datepicker2 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=26607675;
 //BA.debugLineNum = 26607675;BA.debugLine="Private Panel13 As Panel";
_panel13 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=26607676;
 //BA.debugLineNum = 26607676;BA.debugLine="Public idPerson As String";
_idperson = "";
RDebugUtils.currentLine=26607677;
 //BA.debugLineNum = 26607677;BA.debugLine="Dim ConceptoDataMap As Map";
_conceptodatamap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=26607678;
 //BA.debugLineNum = 26607678;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.formperson __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=27983872;
 //BA.debugLineNum = 27983872;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=27983873;
 //BA.debugLineNum = 27983873;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=27983874;
 //BA.debugLineNum = 27983874;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_db);
RDebugUtils.currentLine=27983875;
 //BA.debugLineNum = 27983875;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=27983876;
 //BA.debugLineNum = 27983876;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=27328512;
 //BA.debugLineNum = 27328512;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=27328513;
 //BA.debugLineNum = 27328513;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=27328514;
 //BA.debugLineNum = 27328514;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=27328515;
 //BA.debugLineNum = 27328515;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.formperson __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=28311552;
 //BA.debugLineNum = 28311552;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=28311560;
 //BA.debugLineNum = 28311560;BA.debugLine="End Sub";
return "";
}
public String  _edittext1percentage_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext1percentage_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1percentage_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=29360128;
 //BA.debugLineNum = 29360128;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
RDebugUtils.currentLine=29360129;
 //BA.debugLineNum = 29360129;BA.debugLine="Log(PorcentageText)";
__c.LogImpl("329360129",__ref._porcentagetext /*String*/ ,0);
RDebugUtils.currentLine=29360130;
 //BA.debugLineNum = 29360130;BA.debugLine="End Sub";
return "";
}
public String  _edittext2horas_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext2horas_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2horas_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=29294592;
 //BA.debugLineNum = 29294592;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
RDebugUtils.currentLine=29294593;
 //BA.debugLineNum = 29294593;BA.debugLine="HorasText = New";
__ref._horastext /*String*/  = _new;
RDebugUtils.currentLine=29294596;
 //BA.debugLineNum = 29294596;BA.debugLine="Log(HorasText)";
__c.LogImpl("329294596",__ref._horastext /*String*/ ,0);
RDebugUtils.currentLine=29294597;
 //BA.debugLineNum = 29294597;BA.debugLine="End Sub";
return "";
}
public String  _edittext3cantidat_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext3cantidat_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3cantidat_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=29425664;
 //BA.debugLineNum = 29425664;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
RDebugUtils.currentLine=29425665;
 //BA.debugLineNum = 29425665;BA.debugLine="CantidadText = New";
__ref._cantidadtext /*String*/  = _new;
RDebugUtils.currentLine=29425667;
 //BA.debugLineNum = 29425667;BA.debugLine="Log(CantidadText)";
__c.LogImpl("329425667",__ref._cantidadtext /*String*/ ,0);
RDebugUtils.currentLine=29425668;
 //BA.debugLineNum = 29425668;BA.debugLine="End Sub";
return "";
}
public String  _edittext4obsv_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext4obsv_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext4obsv_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=29491200;
 //BA.debugLineNum = 29491200;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
RDebugUtils.currentLine=29491201;
 //BA.debugLineNum = 29491201;BA.debugLine="ObsvText =New";
__ref._obsvtext /*String*/  = _new;
RDebugUtils.currentLine=29491203;
 //BA.debugLineNum = 29491203;BA.debugLine="Log(ObsvText)";
__c.LogImpl("329491203",__ref._obsvtext /*String*/ ,0);
RDebugUtils.currentLine=29491204;
 //BA.debugLineNum = 29491204;BA.debugLine="End Sub";
return "";
}
public void  _getrecordclientes(b4a.example.ef.formperson __ref,String _usedb) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "getrecordclientes", false))
	 {Debug.delegate(ba, "getrecordclientes", new Object[] {_usedb}); return;}
ResumableSub_GetRecordClientes rsub = new ResumableSub_GetRecordClientes(this,__ref,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordClientes extends BA.ResumableSub {
public ResumableSub_GetRecordClientes(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref,String _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
b4a.example.ef.formperson parent;
String _usedb;
b4a.example.ef.dbrequestmanager _req = null;
b4a.example.ef.main._dbcommand _cmd = null;
String _id = "";
b4a.example.ef.httpjob _j = null;
b4a.example.ef.main._dbresult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28180481;
 //BA.debugLineNum = 28180481;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=28180482;
 //BA.debugLineNum = 28180482;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_clientes",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=28180483;
 //BA.debugLineNum = 28180483;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=28180484;
 //BA.debugLineNum = 28180484;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=28180485;
 //BA.debugLineNum = 28180485;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=28180486;
 //BA.debugLineNum = 28180486;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=28180488;
 //BA.debugLineNum = 28180488;BA.debugLine="req.PrintTable(res)";
_req._printtable /*String*/ (null,_res);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=28180490;
 //BA.debugLineNum = 28180490;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("328180490","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=28180492;
 //BA.debugLineNum = 28180492;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=28180493;
 //BA.debugLineNum = 28180493;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordhaciendas(b4a.example.ef.formperson __ref,String _usedb) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "getrecordhaciendas", false))
	 {Debug.delegate(ba, "getrecordhaciendas", new Object[] {_usedb}); return;}
ResumableSub_GetRecordHaciendas rsub = new ResumableSub_GetRecordHaciendas(this,__ref,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordHaciendas extends BA.ResumableSub {
public ResumableSub_GetRecordHaciendas(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref,String _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28114945;
 //BA.debugLineNum = 28114945;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=28114946;
 //BA.debugLineNum = 28114946;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=28114948;
 //BA.debugLineNum = 28114948;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=28114949;
 //BA.debugLineNum = 28114949;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=28114950;
 //BA.debugLineNum = 28114950;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=28114952;
 //BA.debugLineNum = 28114952;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=28114953;
 //BA.debugLineNum = 28114953;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=28114954;
 //BA.debugLineNum = 28114954;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=28114955;
 //BA.debugLineNum = 28114955;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=28114959;
 //BA.debugLineNum = 28114959;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=28114960;
 //BA.debugLineNum = 28114960;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=28114961;
 //BA.debugLineNum = 28114961;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=28114962;
 //BA.debugLineNum = 28114962;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=28114963;
 //BA.debugLineNum = 28114963;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=28114965;
 //BA.debugLineNum = 28114965;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=28114966;
 //BA.debugLineNum = 28114966;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=28114967;
 //BA.debugLineNum = 28114967;BA.debugLine="Spinner2.Add(cadena)";
__ref._spinner2 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=28114968;
 //BA.debugLineNum = 28114968;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=28114972;
 //BA.debugLineNum = 28114972;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("328114972","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=28114974;
 //BA.debugLineNum = 28114974;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=28114975;
 //BA.debugLineNum = 28114975;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlabores(b4a.example.ef.formperson __ref,String _usedb) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "getrecordlabores", false))
	 {Debug.delegate(ba, "getrecordlabores", new Object[] {_usedb}); return;}
ResumableSub_GetRecordLabores rsub = new ResumableSub_GetRecordLabores(this,__ref,_usedb);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLabores extends BA.ResumableSub {
public ResumableSub_GetRecordLabores(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref,String _usedb) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28508161;
 //BA.debugLineNum = 28508161;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=28508162;
 //BA.debugLineNum = 28508162;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=28508164;
 //BA.debugLineNum = 28508164;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=28508165;
 //BA.debugLineNum = 28508165;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=28508166;
 //BA.debugLineNum = 28508166;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=28508168;
 //BA.debugLineNum = 28508168;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=28508169;
 //BA.debugLineNum = 28508169;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=28508170;
 //BA.debugLineNum = 28508170;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=28508171;
 //BA.debugLineNum = 28508171;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=28508175;
 //BA.debugLineNum = 28508175;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=28508176;
 //BA.debugLineNum = 28508176;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=28508177;
 //BA.debugLineNum = 28508177;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=28508178;
 //BA.debugLineNum = 28508178;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=28508179;
 //BA.debugLineNum = 28508179;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=28508181;
 //BA.debugLineNum = 28508181;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=28508182;
 //BA.debugLineNum = 28508182;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=28508183;
 //BA.debugLineNum = 28508183;BA.debugLine="Spinner4.Add(cadena)";
__ref._spinner4 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=28508184;
 //BA.debugLineNum = 28508184;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=28508188;
 //BA.debugLineNum = 28508188;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("328508188","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=28508190;
 //BA.debugLineNum = 28508190;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=28508191;
 //BA.debugLineNum = 28508191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _getrecordlotes(b4a.example.ef.formperson __ref,String _usedb,String _nit,String _hda) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "getrecordlotes", false))
	 {Debug.delegate(ba, "getrecordlotes", new Object[] {_usedb,_nit,_hda}); return;}
ResumableSub_GetRecordLotes rsub = new ResumableSub_GetRecordLotes(this,__ref,_usedb,_nit,_hda);
rsub.resume(ba, null);
}
public static class ResumableSub_GetRecordLotes extends BA.ResumableSub {
public ResumableSub_GetRecordLotes(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref,String _usedb,String _nit,String _hda) {
this.parent = parent;
this.__ref = __ref;
this._usedb = _usedb;
this._nit = _nit;
this._hda = _hda;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28442625;
 //BA.debugLineNum = 28442625;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=28442626;
 //BA.debugLineNum = 28442626;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nit),(Object)(_hda)});
RDebugUtils.currentLine=28442628;
 //BA.debugLineNum = 28442628;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=28442630;
 //BA.debugLineNum = 28442630;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=28442631;
 //BA.debugLineNum = 28442631;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=28442632;
 //BA.debugLineNum = 28442632;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=28442633;
 //BA.debugLineNum = 28442633;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=28442637;
 //BA.debugLineNum = 28442637;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=28442638;
 //BA.debugLineNum = 28442638;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=28442639;
 //BA.debugLineNum = 28442639;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=28442640;
 //BA.debugLineNum = 28442640;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=28442641;
 //BA.debugLineNum = 28442641;BA.debugLine="Spinner3.Add(cadena)";
__ref._spinner3 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
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
RDebugUtils.currentLine=28442648;
 //BA.debugLineNum = 28442648;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("328442648","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=28442650;
 //BA.debugLineNum = 28442650;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=28442651;
 //BA.debugLineNum = 28442651;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _globals(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "globals", false))
	 {return ((String) Debug.delegate(ba, "globals", null));}
anywheresoftware.b4a.objects.PanelWrapper _panel10horainicio = null;
anywheresoftware.b4a.objects.LabelWrapper _labelfecha = null;
RDebugUtils.currentLine=26673152;
 //BA.debugLineNum = 26673152;BA.debugLine="Sub Globals";
RDebugUtils.currentLine=26673153;
 //BA.debugLineNum = 26673153;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
_panel10horainicio = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=26673154;
 //BA.debugLineNum = 26673154;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
_labelfecha = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=26673156;
 //BA.debugLineNum = 26673156;BA.debugLine="End Sub";
return "";
}
public String  _hinicio_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "hinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "hinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=27721728;
 //BA.debugLineNum = 27721728;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=27721729;
 //BA.debugLineNum = 27721729;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=27721730;
 //BA.debugLineNum = 27721730;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=27721731;
 //BA.debugLineNum = 27721731;BA.debugLine="End Sub";
return "";
}
public String  _insertrecord(b4a.example.ef.formperson __ref,String _nombre,int _salario) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "insertrecord", false))
	 {return ((String) Debug.delegate(ba, "insertrecord", new Object[] {_nombre,_salario}));}
RDebugUtils.currentLine=28246016;
 //BA.debugLineNum = 28246016;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
RDebugUtils.currentLine=28246024;
 //BA.debugLineNum = 28246024;BA.debugLine="End Sub";
return "";
}
public String  _label10_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label10_click", false))
	 {return ((String) Debug.delegate(ba, "label10_click", null));}
RDebugUtils.currentLine=27525120;
 //BA.debugLineNum = 27525120;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=27525121;
 //BA.debugLineNum = 27525121;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=27525122;
 //BA.debugLineNum = 27525122;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=27459584;
 //BA.debugLineNum = 27459584;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=27459585;
 //BA.debugLineNum = 27459585;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=27459586;
 //BA.debugLineNum = 27459586;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=27459587;
 //BA.debugLineNum = 27459587;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=27459588;
 //BA.debugLineNum = 27459588;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=27459589;
 //BA.debugLineNum = 27459589;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=27459590;
 //BA.debugLineNum = 27459590;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=27459591;
 //BA.debugLineNum = 27459591;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=27459592;
 //BA.debugLineNum = 27459592;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=27459593;
 //BA.debugLineNum = 27459593;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=27459594;
 //BA.debugLineNum = 27459594;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=27459595;
 //BA.debugLineNum = 27459595;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=27459596;
 //BA.debugLineNum = 27459596;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=27459597;
 //BA.debugLineNum = 27459597;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=27459598;
 //BA.debugLineNum = 27459598;BA.debugLine="End Sub";
return "";
}
public String  _label12hinicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label12hinicio_click", false))
	 {return ((String) Debug.delegate(ba, "label12hinicio_click", null));}
RDebugUtils.currentLine=26935296;
 //BA.debugLineNum = 26935296;BA.debugLine="Private Sub Label12Hinicio_Click";
RDebugUtils.currentLine=26935297;
 //BA.debugLineNum = 26935297;BA.debugLine="Panel12.Visible= True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=26935298;
 //BA.debugLineNum = 26935298;BA.debugLine="End Sub";
return "";
}
public String  _label13hfim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label13hfim_click", false))
	 {return ((String) Debug.delegate(ba, "label13hfim_click", null));}
RDebugUtils.currentLine=27131904;
 //BA.debugLineNum = 27131904;BA.debugLine="Private Sub Label13Hfim_Click";
RDebugUtils.currentLine=27131905;
 //BA.debugLineNum = 27131905;BA.debugLine="Panel13.Visible= True";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=27131906;
 //BA.debugLineNum = 27131906;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=27787264;
 //BA.debugLineNum = 27787264;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=27787267;
 //BA.debugLineNum = 27787267;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=27787268;
 //BA.debugLineNum = 27787268;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
RDebugUtils.currentLine=27852800;
 //BA.debugLineNum = 27852800;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=27852801;
 //BA.debugLineNum = 27852801;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Saved."),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=27852802;
 //BA.debugLineNum = 27852802;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=27656192;
 //BA.debugLineNum = 27656192;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=27656194;
 //BA.debugLineNum = 27656194;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=27590656;
 //BA.debugLineNum = 27590656;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=27590658;
 //BA.debugLineNum = 27590658;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=27918336;
 //BA.debugLineNum = 27918336;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=27918338;
 //BA.debugLineNum = 27918338;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxconcepto_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxconcepto_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxconcepto_itemclick", new Object[] {_position,_value}));}
String _dstjo_cncpto = "";
RDebugUtils.currentLine=29229056;
 //BA.debugLineNum = 29229056;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
RDebugUtils.currentLine=29229057;
 //BA.debugLineNum = 29229057;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=29229058;
 //BA.debugLineNum = 29229058;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=29229059;
 //BA.debugLineNum = 29229059;BA.debugLine="ConceptoCBX = Null";
__ref._conceptocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=29229061;
 //BA.debugLineNum = 29229061;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=29229064;
 //BA.debugLineNum = 29229064;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
_dstjo_cncpto = BA.ObjectToString(__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_value));
RDebugUtils.currentLine=29229067;
 //BA.debugLineNum = 29229067;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
__c.LogImpl("329229067","Valor seleccionado: "+__ref._conceptocbx /*String*/ ,0);
RDebugUtils.currentLine=29229068;
 //BA.debugLineNum = 29229068;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
__c.LogImpl("329229068","Dato dstjo_Cncpto: "+_dstjo_cncpto,0);
RDebugUtils.currentLine=29229071;
 //BA.debugLineNum = 29229071;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
if ((_dstjo_cncpto).equals("N")) { 
RDebugUtils.currentLine=29229073;
 //BA.debugLineNum = 29229073;BA.debugLine="EditText3cantidat.Enabled = False";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=29229076;
 //BA.debugLineNum = 29229076;BA.debugLine="EditText3cantidat.Enabled = True";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=29229078;
 //BA.debugLineNum = 29229078;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxhacienda_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxhacienda_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxhacienda_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxHacienda_ItemClick rsub = new ResumableSub_SD_xComboBoxHacienda_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxHacienda_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxHacienda_ItemClick(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=29032449;
 //BA.debugLineNum = 29032449;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=29032450;
 //BA.debugLineNum = 29032450;BA.debugLine="haciendaCBX = Null";
__ref._haciendacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=29032452;
 //BA.debugLineNum = 29032452;BA.debugLine="haciendaCBX = Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=29032454;
 //BA.debugLineNum = 29032454;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("329032454",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=29032455;
 //BA.debugLineNum = 29032455;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=29032456;
 //BA.debugLineNum = 29032456;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=29032458;
 //BA.debugLineNum = 29032458;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=29032459;
 //BA.debugLineNum = 29032459;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=29032460;
 //BA.debugLineNum = 29032460;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=29032463;
 //BA.debugLineNum = 29032463;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=29032466;
 //BA.debugLineNum = 29032466;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=29032468;
 //BA.debugLineNum = 29032468;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=29032469;
 //BA.debugLineNum = 29032469;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=29032473;
 //BA.debugLineNum = 29032473;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=29032474;
 //BA.debugLineNum = 29032474;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=29032477;
 //BA.debugLineNum = 29032477;BA.debugLine="SD_xComboBoxLote.Add(\"Codigo: \"&Codg_Hacienda,";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"Codigo: "+_codg_hacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=29032482;
 //BA.debugLineNum = 29032482;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("329032482","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=29032486;
 //BA.debugLineNum = 29032486;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=29032488;
 //BA.debugLineNum = 29032488;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxlabor_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlabor_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlabor_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=29163520;
 //BA.debugLineNum = 29163520;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=29163521;
 //BA.debugLineNum = 29163521;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=29163522;
 //BA.debugLineNum = 29163522;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=29163523;
 //BA.debugLineNum = 29163523;BA.debugLine="LaborCBX = Null";
__ref._laborcbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=29163525;
 //BA.debugLineNum = 29163525;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=29163528;
 //BA.debugLineNum = 29163528;BA.debugLine="Log(LaborCBX)";
__c.LogImpl("329163528",__ref._laborcbx /*String*/ ,0);
RDebugUtils.currentLine=29163529;
 //BA.debugLineNum = 29163529;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=29097984;
 //BA.debugLineNum = 29097984;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=29097985;
 //BA.debugLineNum = 29097985;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=29097987;
 //BA.debugLineNum = 29097987;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=29097988;
 //BA.debugLineNum = 29097988;BA.debugLine="LoteCBX = Null";
__ref._lotecbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=29097990;
 //BA.debugLineNum = 29097990;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=29097993;
 //BA.debugLineNum = 29097993;BA.debugLine="Log(LoteCBX)";
__c.LogImpl("329097993",__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=29097994;
 //BA.debugLineNum = 29097994;BA.debugLine="End Sub";
return "";
}
public void  _sd_xcomboboxnitperson_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxnitperson_itemclick", false))
	 {Debug.delegate(ba, "sd_xcomboboxnitperson_itemclick", new Object[] {_position,_value}); return;}
ResumableSub_SD_xComboBoxNitPerson_ItemClick rsub = new ResumableSub_SD_xComboBoxNitPerson_ItemClick(this,__ref,_position,_value);
rsub.resume(ba, null);
}
public static class ResumableSub_SD_xComboBoxNitPerson_ItemClick extends BA.ResumableSub {
public ResumableSub_SD_xComboBoxNitPerson_ItemClick(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref,int _position,Object _value) {
this.parent = parent;
this.__ref = __ref;
this._position = _position;
this._value = _value;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=28966913;
 //BA.debugLineNum = 28966913;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=28966915;
 //BA.debugLineNum = 28966915;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=28966916;
 //BA.debugLineNum = 28966916;BA.debugLine="nitEmpresaCBX = Null";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=28966918;
 //BA.debugLineNum = 28966918;BA.debugLine="nitEmpresaCBX = Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=28966922;
 //BA.debugLineNum = 28966922;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
parent.__c.LogImpl("328966922","Valor seleccionado: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=28966924;
 //BA.debugLineNum = 28966924;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
parent.__c.LogImpl("328966924","Posicion: "+BA.NumberToString(_position)+" VALUE: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=28966925;
 //BA.debugLineNum = 28966925;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=28966927;
 //BA.debugLineNum = 28966927;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=28966928;
 //BA.debugLineNum = 28966928;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=28966929;
 //BA.debugLineNum = 28966929;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)("N")});
RDebugUtils.currentLine=28966932;
 //BA.debugLineNum = 28966932;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=28966935;
 //BA.debugLineNum = 28966935;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=28966937;
 //BA.debugLineNum = 28966937;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=28966938;
 //BA.debugLineNum = 28966938;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=28966942;
 //BA.debugLineNum = 28966942;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=28966943;
 //BA.debugLineNum = 28966943;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=28966944;
 //BA.debugLineNum = 28966944;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=28966947;
 //BA.debugLineNum = 28966947;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda & \" - \"";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda+" - "+_codg_hacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=28966952;
 //BA.debugLineNum = 28966952;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("328966952","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=28966955;
 //BA.debugLineNum = 28966955;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("328966955",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=28966957;
 //BA.debugLineNum = 28966957;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=28966959;
 //BA.debugLineNum = 28966959;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _sd_xcomboboxturno_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxturno_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxturno_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=29622272;
 //BA.debugLineNum = 29622272;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
RDebugUtils.currentLine=29622274;
 //BA.debugLineNum = 29622274;BA.debugLine="If Value = Null Or Value = \"\" Then";
if (_value== null || (_value).equals((Object)(""))) { 
RDebugUtils.currentLine=29622275;
 //BA.debugLineNum = 29622275;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
__ref._turnocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=29622277;
 //BA.debugLineNum = 29622277;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
__ref._turnocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=29622279;
 //BA.debugLineNum = 29622279;BA.debugLine="End Sub";
return "";
}
public String  _spinner1_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=28573696;
 //BA.debugLineNum = 28573696;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
RDebugUtils.currentLine=28573698;
 //BA.debugLineNum = 28573698;BA.debugLine="End Sub";
return "";
}
public String  _spinner10_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner10_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner10_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=28901376;
 //BA.debugLineNum = 28901376;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
RDebugUtils.currentLine=28901378;
 //BA.debugLineNum = 28901378;BA.debugLine="End Sub";
return "";
}
public String  _spinner2_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner2_itemclick", new Object[] {_position,_value}));}
String _nit = "";
String _hacienda = "";
RDebugUtils.currentLine=28377088;
 //BA.debugLineNum = 28377088;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=28377089;
 //BA.debugLineNum = 28377089;BA.debugLine="Dim nit As String";
_nit = "";
RDebugUtils.currentLine=28377090;
 //BA.debugLineNum = 28377090;BA.debugLine="Dim hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=28377092;
 //BA.debugLineNum = 28377092;BA.debugLine="Spinner3.Clear";
__ref._spinner3 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=28377094;
 //BA.debugLineNum = 28377094;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("328377094",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=28377095;
 //BA.debugLineNum = 28377095;BA.debugLine="nit= \"890307964\"";
_nit = "890307964";
RDebugUtils.currentLine=28377096;
 //BA.debugLineNum = 28377096;BA.debugLine="hacienda = Value";
_hacienda = BA.ObjectToString(_value);
RDebugUtils.currentLine=28377097;
 //BA.debugLineNum = 28377097;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
RDebugUtils.currentLine=28377099;
 //BA.debugLineNum = 28377099;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
__ref._getrecordlotes /*void*/ (null,"BDPichucho",_nit,_hacienda);
RDebugUtils.currentLine=28377100;
 //BA.debugLineNum = 28377100;BA.debugLine="End Sub";
return "";
}
public String  _spinner3_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner3_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner3_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=28639232;
 //BA.debugLineNum = 28639232;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
RDebugUtils.currentLine=28639234;
 //BA.debugLineNum = 28639234;BA.debugLine="End Sub";
return "";
}
public String  _spinner4_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner4_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner4_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=28704768;
 //BA.debugLineNum = 28704768;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
RDebugUtils.currentLine=28704770;
 //BA.debugLineNum = 28704770;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=28770304;
 //BA.debugLineNum = 28770304;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=28770306;
 //BA.debugLineNum = 28770306;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=28835840;
 //BA.debugLineNum = 28835840;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=28835842;
 //BA.debugLineNum = 28835842;BA.debugLine="End Sub";
return "";
}
}