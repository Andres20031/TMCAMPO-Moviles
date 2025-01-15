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
public b4a.example.ef.xuiviewsutils _xuiviewsutils = null;
public Object  _initialize(b4a.example.ef.formperson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="Label12Hinicio.Text = formattedDate";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=14090247;
 //BA.debugLineNum = 14090247;BA.debugLine="FechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=14090249;
 //BA.debugLineNum = 14090249;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=14090252;
 //BA.debugLineNum = 14090252;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
__c.LogImpl("214090252","Fecha seleccionada: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=14090253;
 //BA.debugLineNum = 14090253;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="Label13Hfim.Text = formattedDate";
__ref._label13hfim /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="FechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
__c.LogImpl("214286857","Fecha de fin"+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=14286859;
 //BA.debugLineNum = 14286859;BA.debugLine="Panel13.Visible = False";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=14286862;
 //BA.debugLineNum = 14286862;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
__c.LogImpl("214286862","Fecha seleccionada: "+_formatteddate,0);
RDebugUtils.currentLine=14286863;
 //BA.debugLineNum = 14286863;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
__ref._label3name /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ));
RDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=13959180;
 //BA.debugLineNum = 13959180;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13959183;
 //BA.debugLineNum = 13959183;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=13959185;
 //BA.debugLineNum = 13959185;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=13959186;
 //BA.debugLineNum = 13959186;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=13959189;
 //BA.debugLineNum = 13959189;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=13959190;
 //BA.debugLineNum = 13959190;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=13959191;
 //BA.debugLineNum = 13959191;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=13959193;
 //BA.debugLineNum = 13959193;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
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
RDebugUtils.currentLine=13959198;
 //BA.debugLineNum = 13959198;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("213959198","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=13959205;
 //BA.debugLineNum = 13959205;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=13959208;
 //BA.debugLineNum = 13959208;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=13959210;
 //BA.debugLineNum = 13959210;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=13959211;
 //BA.debugLineNum = 13959211;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13959212;
 //BA.debugLineNum = 13959212;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=13959213;
 //BA.debugLineNum = 13959213;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j2,"req_labor");
RDebugUtils.currentLine=13959214;
 //BA.debugLineNum = 13959214;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=13959215;
 //BA.debugLineNum = 13959215;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
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
RDebugUtils.currentLine=13959216;
 //BA.debugLineNum = 13959216;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
_codigodestino = BA.ObjectToString(_rowlabor[(int) (0)]);
RDebugUtils.currentLine=13959217;
 //BA.debugLineNum = 13959217;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
_descripciondestino = BA.ObjectToString(_rowlabor[(int) (1)]);
RDebugUtils.currentLine=13959218;
 //BA.debugLineNum = 13959218;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino, codig";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripciondestino,(Object)(_codigodestino));
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
RDebugUtils.currentLine=13959221;
 //BA.debugLineNum = 13959221;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
parent.__c.LogImpl("213959221","Error en la consulta de destinos: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=13959223;
 //BA.debugLineNum = 13959223;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=13959228;
 //BA.debugLineNum = 13959228;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=13959231;
 //BA.debugLineNum = 13959231;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_concepto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=13959234;
 //BA.debugLineNum = 13959234;BA.debugLine="ConceptoDataMap.Initialize";
__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=13959236;
 //BA.debugLineNum = 13959236;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13959239;
 //BA.debugLineNum = 13959239;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=13959241;
 //BA.debugLineNum = 13959241;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
_req._handlejobasync /*void*/ (null,_j3,"req_concept");
RDebugUtils.currentLine=13959242;
 //BA.debugLineNum = 13959242;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=13959245;
 //BA.debugLineNum = 13959245;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
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
RDebugUtils.currentLine=13959246;
 //BA.debugLineNum = 13959246;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
_cod_concept = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=13959247;
 //BA.debugLineNum = 13959247;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
_des_concept = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=13959248;
 //BA.debugLineNum = 13959248;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
_dstjo_cncpto = BA.ObjectToString(_rowconcep[(int) (2)]);
RDebugUtils.currentLine=13959251;
 //BA.debugLineNum = 13959251;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept, Cod_Conce";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_des_concept,(Object)(_cod_concept));
RDebugUtils.currentLine=13959254;
 //BA.debugLineNum = 13959254;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
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
RDebugUtils.currentLine=13959258;
 //BA.debugLineNum = 13959258;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
parent.__c.LogImpl("213959258","Error en la consulta de conceptos: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=13959262;
 //BA.debugLineNum = 13959262;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=13959265;
 //BA.debugLineNum = 13959265;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=13959268;
 //BA.debugLineNum = 13959268;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_turnos",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=13959271;
 //BA.debugLineNum = 13959271;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=13959274;
 //BA.debugLineNum = 13959274;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=13959276;
 //BA.debugLineNum = 13959276;BA.debugLine="Req.HandleJobAsync(j4, \"req_concept\")";
_req._handlejobasync /*void*/ (null,_j4,"req_concept");
RDebugUtils.currentLine=13959277;
 //BA.debugLineNum = 13959277;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resconc = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=13959280;
 //BA.debugLineNum = 13959280;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
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
RDebugUtils.currentLine=13959281;
 //BA.debugLineNum = 13959281;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
_turno = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=13959282;
 //BA.debugLineNum = 13959282;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
_des_turno = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=13959284;
 //BA.debugLineNum = 13959284;BA.debugLine="SD_xComboBoxTurno.Add(Turno , Des_Turno)";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_turno,(Object)(_des_turno));
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
RDebugUtils.currentLine=13959288;
 //BA.debugLineNum = 13959288;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
parent.__c.LogImpl("213959288","Error en la consulta de conceptos: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = -1;
;
RDebugUtils.currentLine=13959292;
 //BA.debugLineNum = 13959292;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=13959294;
 //BA.debugLineNum = 13959294;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FomrPerson",ba);
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="ScrollView1.Panel.Height=1100dip";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__c.DipToCurrent((int) (1100)));
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("ScrollUIPerson",ba);
RDebugUtils.currentLine=13893643;
 //BA.debugLineNum = 13893643;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=13893644;
 //BA.debugLineNum = 13893644;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
__ref._edittext1percentage /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
__ref._edittext4obsv /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=13893646;
 //BA.debugLineNum = 13893646;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
__ref._edittext2horas /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group11.Get(index11)));
RDebugUtils.currentLine=13893650;
 //BA.debugLineNum = 13893650;BA.debugLine="If v Is Spinner Then";
if (_v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
RDebugUtils.currentLine=13893651;
 //BA.debugLineNum = 13893651;BA.debugLine="Dim newsp As Spinner=v";
_newsp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_newsp = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
RDebugUtils.currentLine=13893652;
 //BA.debugLineNum = 13893652;BA.debugLine="For i=1 To 16";
{
final int step14 = 1;
final int limit14 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=13893653;
 //BA.debugLineNum = 13893653;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
_newsp.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_v.getTag())+" "+BA.NumberToString(_i)}));
 }
};
 };
 }
};
RDebugUtils.currentLine=13893671;
 //BA.debugLineNum = 13893671;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
_id = ((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ;
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = parent.__c.Regex.Matcher("\\#(.+)",_id);
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="If matcher.Find() Then";
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
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
_id = _matcher.Group((int) (1));
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
parent.__c.LogImpl("216646155","ID: "+_id,0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
parent.__c.LogImpl("216646157","No se encontró el carácter # en la cadena.",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=16646161;
 //BA.debugLineNum = 16646161;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_searchPerson",new Object[]{(Object)(_id)});
RDebugUtils.currentLine=16646165;
 //BA.debugLineNum = 16646165;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16646166;
 //BA.debugLineNum = 16646166;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16646169;
 //BA.debugLineNum = 16646169;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16646171;
 //BA.debugLineNum = 16646171;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16646174;
 //BA.debugLineNum = 16646174;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=16646175;
 //BA.debugLineNum = 16646175;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16646177;
 //BA.debugLineNum = 16646177;BA.debugLine="If res.Rows.Size > 0 Then";
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
RDebugUtils.currentLine=16646179;
 //BA.debugLineNum = 16646179;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16646180;
 //BA.debugLineNum = 16646180;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16646181;
 //BA.debugLineNum = 16646181;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Propios",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=16646182;
 //BA.debugLineNum = 16646182;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=16646183;
 //BA.debugLineNum = 16646183;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16646185;
 //BA.debugLineNum = 16646185;BA.debugLine="Try";
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
RDebugUtils.currentLine=16646186;
 //BA.debugLineNum = 16646186;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=16646187;
 //BA.debugLineNum = 16646187;BA.debugLine="Log(\"Se han recuperado datos: propios \" & res.";
parent.__c.LogImpl("216646187","Se han recuperado datos: propios "+BA.NumberToString(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=16646190;
 //BA.debugLineNum = 16646190;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("216646190","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=16646194;
 //BA.debugLineNum = 16646194;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16646195;
 //BA.debugLineNum = 16646195;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16646196;
 //BA.debugLineNum = 16646196;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Tmprles",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=16646197;
 //BA.debugLineNum = 16646197;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=16646198;
 //BA.debugLineNum = 16646198;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16646200;
 //BA.debugLineNum = 16646200;BA.debugLine="Try";
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
RDebugUtils.currentLine=16646201;
 //BA.debugLineNum = 16646201;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=16646202;
 //BA.debugLineNum = 16646202;BA.debugLine="Log(\"No se encontraron datos para el ID: \" & i";
parent.__c.LogImpl("216646202","No se encontraron datos para el ID: "+_id,0);
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
RDebugUtils.currentLine=16646205;
 //BA.debugLineNum = 16646205;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("216646205","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=16646210;
 //BA.debugLineNum = 16646210;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
parent.__c.LogImpl("216646210","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=16646212;
 //BA.debugLineNum = 16646212;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="Private DateDialog As DateDialog";
_datedialog = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13697042;
 //BA.debugLineNum = 13697042;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13697043;
 //BA.debugLineNum = 13697043;BA.debugLine="Private Spinner1 As Spinner";
_spinner1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=13697044;
 //BA.debugLineNum = 13697044;BA.debugLine="Private Spinner2 As Spinner";
_spinner2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=13697045;
 //BA.debugLineNum = 13697045;BA.debugLine="Private Spinner3 As Spinner";
_spinner3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=13697046;
 //BA.debugLineNum = 13697046;BA.debugLine="Private Spinner4 As Spinner";
_spinner4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=13697052;
 //BA.debugLineNum = 13697052;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13697053;
 //BA.debugLineNum = 13697053;BA.debugLine="Private Label13Hfim As Label";
_label13hfim = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13697054;
 //BA.debugLineNum = 13697054;BA.debugLine="Private Label12Hinicio As Label";
_label12hinicio = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13697055;
 //BA.debugLineNum = 13697055;BA.debugLine="Private EditText1percentage As EditText";
_edittext1percentage = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13697056;
 //BA.debugLineNum = 13697056;BA.debugLine="Private EditText2horas As EditText";
_edittext2horas = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13697057;
 //BA.debugLineNum = 13697057;BA.debugLine="Private EditText3cantidat As EditText";
_edittext3cantidat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13697058;
 //BA.debugLineNum = 13697058;BA.debugLine="Private EditText4obsv As EditText";
_edittext4obsv = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=13697059;
 //BA.debugLineNum = 13697059;BA.debugLine="Private Label3Name As Label";
_label3name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13697061;
 //BA.debugLineNum = 13697061;BA.debugLine="Private SD_xComboBoxNitPerson As SD_xComboBox";
_sd_xcomboboxnitperson = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13697062;
 //BA.debugLineNum = 13697062;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13697064;
 //BA.debugLineNum = 13697064;BA.debugLine="Dim FechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=13697065;
 //BA.debugLineNum = 13697065;BA.debugLine="Dim FechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=13697066;
 //BA.debugLineNum = 13697066;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=13697067;
 //BA.debugLineNum = 13697067;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=13697068;
 //BA.debugLineNum = 13697068;BA.debugLine="Dim LoteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=13697069;
 //BA.debugLineNum = 13697069;BA.debugLine="Dim LaborCBX As String";
_laborcbx = "";
RDebugUtils.currentLine=13697070;
 //BA.debugLineNum = 13697070;BA.debugLine="Dim ConceptoCBX As String";
_conceptocbx = "";
RDebugUtils.currentLine=13697071;
 //BA.debugLineNum = 13697071;BA.debugLine="Dim TurnoCBX As String";
_turnocbx = "";
RDebugUtils.currentLine=13697072;
 //BA.debugLineNum = 13697072;BA.debugLine="Dim HorasText As String";
_horastext = "";
RDebugUtils.currentLine=13697073;
 //BA.debugLineNum = 13697073;BA.debugLine="Dim PorcentageText As String";
_porcentagetext = "";
RDebugUtils.currentLine=13697074;
 //BA.debugLineNum = 13697074;BA.debugLine="Dim CantidadText As String";
_cantidadtext = "";
RDebugUtils.currentLine=13697075;
 //BA.debugLineNum = 13697075;BA.debugLine="Dim ObsvText As String";
_obsvtext = "";
RDebugUtils.currentLine=13697076;
 //BA.debugLineNum = 13697076;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13697077;
 //BA.debugLineNum = 13697077;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13697078;
 //BA.debugLineNum = 13697078;BA.debugLine="Private SD_xComboBoxConcepto As SD_xComboBox";
_sd_xcomboboxconcepto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13697079;
 //BA.debugLineNum = 13697079;BA.debugLine="Private SD_xComboBoxTurno As SD_xComboBox";
_sd_xcomboboxturno = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=13697080;
 //BA.debugLineNum = 13697080;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=13697081;
 //BA.debugLineNum = 13697081;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13697082;
 //BA.debugLineNum = 13697082;BA.debugLine="Private AS_DatePicker2 As AS_DatePicker";
_as_datepicker2 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=13697083;
 //BA.debugLineNum = 13697083;BA.debugLine="Private Panel13 As Panel";
_panel13 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13697084;
 //BA.debugLineNum = 13697084;BA.debugLine="Public idPerson As String";
_idperson = "";
RDebugUtils.currentLine=13697085;
 //BA.debugLineNum = 13697085;BA.debugLine="Dim ConceptoDataMap As Map";
_conceptodatamap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13697086;
 //BA.debugLineNum = 13697086;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.formperson __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_db);
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.formperson __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="End Sub";
return "";
}
public String  _edittext1percentage_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext1percentage_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1percentage_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Log(PorcentageText)";
__c.LogImpl("216449537",__ref._porcentagetext /*String*/ ,0);
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="End Sub";
return "";
}
public String  _edittext2horas_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext2horas_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2horas_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="HorasText = New";
__ref._horastext /*String*/  = _new;
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Log(HorasText)";
__c.LogImpl("216384004",__ref._horastext /*String*/ ,0);
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="End Sub";
return "";
}
public String  _edittext3cantidat_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext3cantidat_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3cantidat_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="CantidadText = New";
__ref._cantidadtext /*String*/  = _new;
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Log(CantidadText)";
__c.LogImpl("216515075",__ref._cantidadtext /*String*/ ,0);
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="End Sub";
return "";
}
public String  _edittext4obsv_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext4obsv_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext4obsv_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="ObsvText =New";
__ref._obsvtext /*String*/  = _new;
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Log(ObsvText)";
__c.LogImpl("216580611",__ref._obsvtext /*String*/ ,0);
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_clientes",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="req.PrintTable(res)";
_req._printtable /*String*/ (null,_res);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("215269898","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15269901;
 //BA.debugLineNum = 15269901;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=15204374;
 //BA.debugLineNum = 15204374;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=15204375;
 //BA.debugLineNum = 15204375;BA.debugLine="Spinner2.Add(cadena)";
__ref._spinner2 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=15204380;
 //BA.debugLineNum = 15204380;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("215204380","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=15204382;
 //BA.debugLineNum = 15204382;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15204383;
 //BA.debugLineNum = 15204383;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15597579;
 //BA.debugLineNum = 15597579;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15597583;
 //BA.debugLineNum = 15597583;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=15597584;
 //BA.debugLineNum = 15597584;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=15597585;
 //BA.debugLineNum = 15597585;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=15597586;
 //BA.debugLineNum = 15597586;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=15597587;
 //BA.debugLineNum = 15597587;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=15597589;
 //BA.debugLineNum = 15597589;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=15597590;
 //BA.debugLineNum = 15597590;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=15597591;
 //BA.debugLineNum = 15597591;BA.debugLine="Spinner4.Add(cadena)";
__ref._spinner4 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=15597592;
 //BA.debugLineNum = 15597592;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=15597596;
 //BA.debugLineNum = 15597596;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("215597596","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=15597598;
 //BA.debugLineNum = 15597598;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15597599;
 //BA.debugLineNum = 15597599;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nit),(Object)(_hda)});
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15532045;
 //BA.debugLineNum = 15532045;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=15532046;
 //BA.debugLineNum = 15532046;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=15532047;
 //BA.debugLineNum = 15532047;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=15532048;
 //BA.debugLineNum = 15532048;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=15532049;
 //BA.debugLineNum = 15532049;BA.debugLine="Spinner3.Add(cadena)";
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
RDebugUtils.currentLine=15532056;
 //BA.debugLineNum = 15532056;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("215532056","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=15532058;
 //BA.debugLineNum = 15532058;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15532059;
 //BA.debugLineNum = 15532059;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub Globals";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
_panel10horainicio = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
_labelfecha = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="End Sub";
return "";
}
public String  _hinicio_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "hinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "hinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="End Sub";
return "";
}
public String  _insertrecord(b4a.example.ef.formperson __ref,String _nombre,int _salario) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "insertrecord", false))
	 {return ((String) Debug.delegate(ba, "insertrecord", new Object[] {_nombre,_salario}));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
RDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="End Sub";
return "";
}
public String  _label10_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label10_click", false))
	 {return ((String) Debug.delegate(ba, "label10_click", null));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=14549005;
 //BA.debugLineNum = 14549005;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="End Sub";
return "";
}
public String  _label12hinicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label12hinicio_click", false))
	 {return ((String) Debug.delegate(ba, "label12hinicio_click", null));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub Label12Hinicio_Click";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Panel12.Visible= True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="End Sub";
return "";
}
public String  _label13hfim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label13hfim_click", false))
	 {return ((String) Debug.delegate(ba, "label13hfim_click", null));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Private Sub Label13Hfim_Click";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Panel13.Visible= True";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Saved."),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxconcepto_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxconcepto_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxconcepto_itemclick", new Object[] {_position,_value}));}
String _dstjo_cncpto = "";
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="ConceptoCBX = Null";
__ref._conceptocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
_dstjo_cncpto = BA.ObjectToString(__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_value));
RDebugUtils.currentLine=16318475;
 //BA.debugLineNum = 16318475;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
__c.LogImpl("216318475","Valor seleccionado: "+__ref._conceptocbx /*String*/ ,0);
RDebugUtils.currentLine=16318476;
 //BA.debugLineNum = 16318476;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
__c.LogImpl("216318476","Dato dstjo_Cncpto: "+_dstjo_cncpto,0);
RDebugUtils.currentLine=16318479;
 //BA.debugLineNum = 16318479;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
if ((_dstjo_cncpto).equals("N")) { 
RDebugUtils.currentLine=16318481;
 //BA.debugLineNum = 16318481;BA.debugLine="EditText3cantidat.Enabled = False";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=16318484;
 //BA.debugLineNum = 16318484;BA.debugLine="EditText3cantidat.Enabled = True";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=16318486;
 //BA.debugLineNum = 16318486;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="haciendaCBX = Null";
__ref._haciendacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="haciendaCBX = Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("216121862",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=16121866;
 //BA.debugLineNum = 16121866;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16121867;
 //BA.debugLineNum = 16121867;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16121868;
 //BA.debugLineNum = 16121868;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=16121871;
 //BA.debugLineNum = 16121871;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16121874;
 //BA.debugLineNum = 16121874;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16121876;
 //BA.debugLineNum = 16121876;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=16121877;
 //BA.debugLineNum = 16121877;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16121881;
 //BA.debugLineNum = 16121881;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=16121882;
 //BA.debugLineNum = 16121882;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=16121885;
 //BA.debugLineNum = 16121885;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_codg_hacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=16121890;
 //BA.debugLineNum = 16121890;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("216121890","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=16121894;
 //BA.debugLineNum = 16121894;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=16121896;
 //BA.debugLineNum = 16121896;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=16252931;
 //BA.debugLineNum = 16252931;BA.debugLine="LaborCBX = Null";
__ref._laborcbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=16252933;
 //BA.debugLineNum = 16252933;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=16252936;
 //BA.debugLineNum = 16252936;BA.debugLine="Log(LaborCBX)";
__c.LogImpl("216252936",__ref._laborcbx /*String*/ ,0);
RDebugUtils.currentLine=16252937;
 //BA.debugLineNum = 16252937;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="LoteCBX = Null";
__ref._lotecbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="Log(LoteCBX)";
__c.LogImpl("216187401",__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=16187402;
 //BA.debugLineNum = 16187402;BA.debugLine="End Sub";
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
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;

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
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="nitEmpresaCBX = Null";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=16056326;
 //BA.debugLineNum = 16056326;BA.debugLine="nitEmpresaCBX = Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=16056330;
 //BA.debugLineNum = 16056330;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
parent.__c.LogImpl("216056330","Valor seleccionado: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=16056332;
 //BA.debugLineNum = 16056332;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
parent.__c.LogImpl("216056332","Posicion: "+BA.NumberToString(_position)+" VALUE: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=16056333;
 //BA.debugLineNum = 16056333;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=16056335;
 //BA.debugLineNum = 16056335;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16056336;
 //BA.debugLineNum = 16056336;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=16056337;
 //BA.debugLineNum = 16056337;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=16056340;
 //BA.debugLineNum = 16056340;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16056343;
 //BA.debugLineNum = 16056343;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16056345;
 //BA.debugLineNum = 16056345;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=16056346;
 //BA.debugLineNum = 16056346;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16056350;
 //BA.debugLineNum = 16056350;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=16056351;
 //BA.debugLineNum = 16056351;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=16056352;
 //BA.debugLineNum = 16056352;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=16056355;
 //BA.debugLineNum = 16056355;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda,(Object)(_codg_hacienda));
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
RDebugUtils.currentLine=16056360;
 //BA.debugLineNum = 16056360;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("216056360","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=16056363;
 //BA.debugLineNum = 16056363;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("216056363",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=16056365;
 //BA.debugLineNum = 16056365;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=16056367;
 //BA.debugLineNum = 16056367;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="If Value = Null Or Value = \"\" Then";
if (_value== null || (_value).equals((Object)(""))) { 
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
__ref._turnocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
__ref._turnocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="End Sub";
return "";
}
public String  _spinner1_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return "";
}
public String  _spinner10_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner10_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner10_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="End Sub";
return "";
}
public String  _spinner2_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner2_itemclick", new Object[] {_position,_value}));}
String _nit = "";
String _hacienda = "";
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Dim nit As String";
_nit = "";
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Dim hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=15466500;
 //BA.debugLineNum = 15466500;BA.debugLine="Spinner3.Clear";
__ref._spinner3 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("215466502",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=15466503;
 //BA.debugLineNum = 15466503;BA.debugLine="nit= \"890307964\"";
_nit = "890307964";
RDebugUtils.currentLine=15466504;
 //BA.debugLineNum = 15466504;BA.debugLine="hacienda = Value";
_hacienda = BA.ObjectToString(_value);
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
__ref._getrecordlotes /*void*/ (null,"BDPichucho",_nit,_hacienda);
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="End Sub";
return "";
}
public String  _spinner3_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner3_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner3_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="End Sub";
return "";
}
public String  _spinner4_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner4_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner4_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="End Sub";
return "";
}
}