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
public Object  _initialize(b4a.example.ef.formperson __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Label12Hinicio.Text = formattedDate";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="FechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
__c.LogImpl("45636111","Fecha seleccionada: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=5636112;
 //BA.debugLineNum = 5636112;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Label13Hfim.Text = formattedDate";
__ref._label13hfim /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="FechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
__c.LogImpl("45832713","Fecha de fin"+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="Panel13.Visible = False";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5832718;
 //BA.debugLineNum = 5832718;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
__c.LogImpl("45832718","Fecha seleccionada: "+_formatteddate,0);
RDebugUtils.currentLine=5832719;
 //BA.debugLineNum = 5832719;BA.debugLine="End Sub";
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="SearchTemplateNit.Initialize";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Dim ItemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="ItemsNit.Initialize";
_itemsnit.Initialize();
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="SearchTemplateHacienda.Initialize";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="SearchTemplateLote.Initialize";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="SearchTemplateLabor.Initialize";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="Dim ItemsLabor As List";
_itemslabor = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="ItemsLabor.Initialize";
_itemslabor.Initialize();
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="SearchTemplateConcepto.Initialize";
__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="Dim ItemsConcepto As List";
_itemsconcepto = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="ItemsConcepto.Initialize";
_itemsconcepto.Initialize();
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="SearchTemplateTurno.Initialize";
__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="Dim ItemsTurno As List";
_itemsturno = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="ItemsTurno.Initialize";
_itemsturno.Initialize();
RDebugUtils.currentLine=5505053;
 //BA.debugLineNum = 5505053;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
__ref._label3name /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ));
RDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=5505057;
 //BA.debugLineNum = 5505057;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=5505059;
 //BA.debugLineNum = 5505059;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=5505060;
 //BA.debugLineNum = 5505060;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=5505061;
 //BA.debugLineNum = 5505061;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=5505064;
 //BA.debugLineNum = 5505064;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5505067;
 //BA.debugLineNum = 5505067;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=5505069;
 //BA.debugLineNum = 5505069;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=5505070;
 //BA.debugLineNum = 5505070;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=5505073;
 //BA.debugLineNum = 5505073;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=5505074;
 //BA.debugLineNum = 5505074;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=5505075;
 //BA.debugLineNum = 5505075;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=5505077;
 //BA.debugLineNum = 5505077;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
RDebugUtils.currentLine=5505078;
 //BA.debugLineNum = 5505078;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
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
RDebugUtils.currentLine=5505083;
 //BA.debugLineNum = 5505083;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("45505083","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=5505085;
 //BA.debugLineNum = 5505085;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsnit);
RDebugUtils.currentLine=5505087;
 //BA.debugLineNum = 5505087;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=5505091;
 //BA.debugLineNum = 5505091;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=5505092;
 //BA.debugLineNum = 5505092;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
_itemslabor.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=5505093;
 //BA.debugLineNum = 5505093;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=5505094;
 //BA.debugLineNum = 5505094;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5505095;
 //BA.debugLineNum = 5505095;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=5505096;
 //BA.debugLineNum = 5505096;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j2,"req_labor");
RDebugUtils.currentLine=5505097;
 //BA.debugLineNum = 5505097;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=5505098;
 //BA.debugLineNum = 5505098;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
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
RDebugUtils.currentLine=5505099;
 //BA.debugLineNum = 5505099;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
_codigodestino = BA.ObjectToString(_rowlabor[(int) (0)]);
RDebugUtils.currentLine=5505100;
 //BA.debugLineNum = 5505100;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
_descripciondestino = BA.ObjectToString(_rowlabor[(int) (1)]);
RDebugUtils.currentLine=5505101;
 //BA.debugLineNum = 5505101;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino, codig";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripciondestino,(Object)(_codigodestino));
RDebugUtils.currentLine=5505102;
 //BA.debugLineNum = 5505102;BA.debugLine="ItemsLabor.Add(codigoDestino&\":\"&descripcionDes";
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
RDebugUtils.currentLine=5505105;
 //BA.debugLineNum = 5505105;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
parent.__c.LogImpl("45505105","Error en la consulta de destinos: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=5505107;
 //BA.debugLineNum = 5505107;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabor);
RDebugUtils.currentLine=5505108;
 //BA.debugLineNum = 5505108;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=5505113;
 //BA.debugLineNum = 5505113;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=5505114;
 //BA.debugLineNum = 5505114;BA.debugLine="ItemsConcepto.Add(\"Seleccionar:\")";
_itemsconcepto.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=5505117;
 //BA.debugLineNum = 5505117;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_concepto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=5505120;
 //BA.debugLineNum = 5505120;BA.debugLine="ConceptoDataMap.Initialize";
__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5505122;
 //BA.debugLineNum = 5505122;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5505125;
 //BA.debugLineNum = 5505125;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=5505127;
 //BA.debugLineNum = 5505127;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
_req._handlejobasync /*void*/ (null,_j3,"req_concept");
RDebugUtils.currentLine=5505128;
 //BA.debugLineNum = 5505128;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=5505131;
 //BA.debugLineNum = 5505131;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
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
RDebugUtils.currentLine=5505132;
 //BA.debugLineNum = 5505132;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
_cod_concept = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=5505133;
 //BA.debugLineNum = 5505133;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
_des_concept = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=5505134;
 //BA.debugLineNum = 5505134;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
_dstjo_cncpto = BA.ObjectToString(_rowconcep[(int) (2)]);
RDebugUtils.currentLine=5505137;
 //BA.debugLineNum = 5505137;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept, Cod_Conce";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_des_concept,(Object)(_cod_concept));
RDebugUtils.currentLine=5505138;
 //BA.debugLineNum = 5505138;BA.debugLine="ItemsConcepto.Add(Cod_Concept&\":\"&Des_Concept)";
_itemsconcepto.Add((Object)(_cod_concept+":"+_des_concept));
RDebugUtils.currentLine=5505140;
 //BA.debugLineNum = 5505140;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
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
RDebugUtils.currentLine=5505144;
 //BA.debugLineNum = 5505144;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
parent.__c.LogImpl("45505144","Error en la consulta de conceptos: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=5505146;
 //BA.debugLineNum = 5505146;BA.debugLine="SearchTemplateConcepto.SetItems(ItemsConcepto)";
__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsconcepto);
RDebugUtils.currentLine=5505149;
 //BA.debugLineNum = 5505149;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=5505152;
 //BA.debugLineNum = 5505152;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=5505153;
 //BA.debugLineNum = 5505153;BA.debugLine="ItemsTurno.Add(\"Seleccionar:\")";
_itemsturno.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=5505155;
 //BA.debugLineNum = 5505155;BA.debugLine="Dim cmdTurno As DBCommand = CreateCommand(\"select";
_cmdturno = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_turnos",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=5505158;
 //BA.debugLineNum = 5505158;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTurno, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdturno,(int) (0),parent.__c.Null)));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=5505161;
 //BA.debugLineNum = 5505161;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=5505163;
 //BA.debugLineNum = 5505163;BA.debugLine="Req.HandleJobAsync(j4, \"req_turno\")";
_req._handlejobasync /*void*/ (null,_j4,"req_turno");
RDebugUtils.currentLine=5505164;
 //BA.debugLineNum = 5505164;BA.debugLine="Wait For (Req) req_turno_Result(resTurno As DBRe";
parent.__c.WaitFor("req_turno_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resturno = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=5505167;
 //BA.debugLineNum = 5505167;BA.debugLine="For Each rowTurno() As Object In resTurno.Rows";
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
RDebugUtils.currentLine=5505168;
 //BA.debugLineNum = 5505168;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
_turno = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=5505169;
 //BA.debugLineNum = 5505169;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
_des_turno = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=5505171;
 //BA.debugLineNum = 5505171;BA.debugLine="SD_xComboBoxTurno.Add(Turno , Des_Turno)";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_turno,(Object)(_des_turno));
RDebugUtils.currentLine=5505172;
 //BA.debugLineNum = 5505172;BA.debugLine="ItemsTurno.Add(Des_Turno&\":\"&Turno)";
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
RDebugUtils.currentLine=5505176;
 //BA.debugLineNum = 5505176;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
parent.__c.LogImpl("45505176","Error en la consulta de conceptos: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = -1;
;
RDebugUtils.currentLine=5505178;
 //BA.debugLineNum = 5505178;BA.debugLine="SearchTemplateTurno.SetItems(ItemsTurno)";
__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsturno);
RDebugUtils.currentLine=5505180;
 //BA.debugLineNum = 5505180;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=5505182;
 //BA.debugLineNum = 5505182;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FomrPerson",ba);
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="ScrollView1.Panel.Height=1100dip";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__c.DipToCurrent((int) (1100)));
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("ScrollUIPerson",ba);
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
__ref._edittext1percentage /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
__ref._edittext4obsv /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
__ref._edittext2horas /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group11.Get(index11)));
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="If v Is Spinner Then";
if (_v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="Dim newsp As Spinner=v";
_newsp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_newsp = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
RDebugUtils.currentLine=5439508;
 //BA.debugLineNum = 5439508;BA.debugLine="For i=1 To 16";
{
final int step14 = 1;
final int limit14 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=5439509;
 //BA.debugLineNum = 5439509;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
_newsp.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_v.getTag())+" "+BA.NumberToString(_i)}));
 }
};
 };
 }
};
RDebugUtils.currentLine=5439527;
 //BA.debugLineNum = 5439527;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=5439528;
 //BA.debugLineNum = 5439528;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=5439529;
 //BA.debugLineNum = 5439529;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=5439530;
 //BA.debugLineNum = 5439530;BA.debugLine="End Sub";
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
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
_id = ((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ;
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = parent.__c.Regex.Matcher("\\#(.+)",_id);
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="If matcher.Find() Then";
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
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
_id = _matcher.Group((int) (1));
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
parent.__c.LogImpl("48192012","ID: "+_id,0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
parent.__c.LogImpl("48192014","No se encontró el carácter # en la cadena.",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=8192018;
 //BA.debugLineNum = 8192018;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_searchPerson",new Object[]{(Object)(_id)});
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=8192023;
 //BA.debugLineNum = 8192023;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8192026;
 //BA.debugLineNum = 8192026;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8192028;
 //BA.debugLineNum = 8192028;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8192031;
 //BA.debugLineNum = 8192031;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8192032;
 //BA.debugLineNum = 8192032;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8192034;
 //BA.debugLineNum = 8192034;BA.debugLine="If res.Rows.Size > 0 Then";
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
RDebugUtils.currentLine=8192036;
 //BA.debugLineNum = 8192036;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=8192037;
 //BA.debugLineNum = 8192037;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8192038;
 //BA.debugLineNum = 8192038;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Propios",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),parent.__c.Null,(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=8192039;
 //BA.debugLineNum = 8192039;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=8192040;
 //BA.debugLineNum = 8192040;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8192042;
 //BA.debugLineNum = 8192042;BA.debugLine="If j.Success Then";
if (true) break;

case 13:
//if
this.state = 18;
if (_j._success /*boolean*/ ) { 
this.state = 15;
}else {
this.state = 17;
}if (true) break;

case 15:
//C
this.state = 18;
RDebugUtils.currentLine=8192043;
 //BA.debugLineNum = 8192043;BA.debugLine="MsgboxAsync(\"Inserción exitosa\", \"Éxito\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Inserción exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=8192045;
 //BA.debugLineNum = 8192045;BA.debugLine="Log(\"ID: \" & id)";
parent.__c.LogImpl("48192045","ID: "+_id,0);
RDebugUtils.currentLine=8192046;
 //BA.debugLineNum = 8192046;BA.debugLine="Log(\"FechaInicio: \" & FechaInicio)";
parent.__c.LogImpl("48192046","FechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=8192047;
 //BA.debugLineNum = 8192047;BA.debugLine="Log(\"LaborCBX: \" & LaborCBX)";
parent.__c.LogImpl("48192047","LaborCBX: "+__ref._laborcbx /*String*/ ,0);
RDebugUtils.currentLine=8192048;
 //BA.debugLineNum = 8192048;BA.debugLine="Log(\"Valor fijo: 0\")";
parent.__c.LogImpl("48192048","Valor fijo: 0",0);
RDebugUtils.currentLine=8192049;
 //BA.debugLineNum = 8192049;BA.debugLine="Log(\"ConceptoCBX: \" & ConceptoCBX)";
parent.__c.LogImpl("48192049","ConceptoCBX: "+__ref._conceptocbx /*String*/ ,0);
RDebugUtils.currentLine=8192050;
 //BA.debugLineNum = 8192050;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("48192050","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=8192051;
 //BA.debugLineNum = 8192051;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("48192051","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=8192052;
 //BA.debugLineNum = 8192052;BA.debugLine="Log(\"LoteCBX: \" & LoteCBX)";
parent.__c.LogImpl("48192052","LoteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=8192053;
 //BA.debugLineNum = 8192053;BA.debugLine="Log(\"HorasText: \" & HorasText)";
parent.__c.LogImpl("48192053","HorasText: "+__ref._horastext /*String*/ ,0);
RDebugUtils.currentLine=8192054;
 //BA.debugLineNum = 8192054;BA.debugLine="Log(\"CantidadText: \" & CantidadText)";
parent.__c.LogImpl("48192054","CantidadText: "+__ref._cantidadtext /*String*/ ,0);
RDebugUtils.currentLine=8192055;
 //BA.debugLineNum = 8192055;BA.debugLine="Log(\"ObsvText: \" & ObsvText)";
parent.__c.LogImpl("48192055","ObsvText: "+__ref._obsvtext /*String*/ ,0);
RDebugUtils.currentLine=8192056;
 //BA.debugLineNum = 8192056;BA.debugLine="Log(\"TurnoCBX: \" & TurnoCBX)";
parent.__c.LogImpl("48192056","TurnoCBX: "+__ref._turnocbx /*String*/ ,0);
RDebugUtils.currentLine=8192057;
 //BA.debugLineNum = 8192057;BA.debugLine="Log(\"PorcentageText: \" & PorcentageText)";
parent.__c.LogImpl("48192057","PorcentageText: "+__ref._porcentagetext /*String*/ ,0);
RDebugUtils.currentLine=8192058;
 //BA.debugLineNum = 8192058;BA.debugLine="Log(\"Error en el job: \" & j.ErrorMessage)";
parent.__c.LogImpl("48192058","Error en el job: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=8192059;
 //BA.debugLineNum = 8192059;BA.debugLine="MsgboxAsync(\"Error al insertar: \" & j.ErrorMes";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Error al insertar: "+_j._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 18:
//C
this.state = 27;
;
RDebugUtils.currentLine=8192061;
 //BA.debugLineNum = 8192061;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=8192064;
 //BA.debugLineNum = 8192064;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=8192065;
 //BA.debugLineNum = 8192065;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8192066;
 //BA.debugLineNum = 8192066;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Tmprles",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),parent.__c.Null,(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=8192067;
 //BA.debugLineNum = 8192067;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=8192068;
 //BA.debugLineNum = 8192068;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8192070;
 //BA.debugLineNum = 8192070;BA.debugLine="If j.Success Then";
if (true) break;

case 21:
//if
this.state = 26;
if (_j._success /*boolean*/ ) { 
this.state = 23;
}else {
this.state = 25;
}if (true) break;

case 23:
//C
this.state = 26;
RDebugUtils.currentLine=8192071;
 //BA.debugLineNum = 8192071;BA.debugLine="MsgboxAsync(\"Inserción exitosa\", \"Éxito\")";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Inserción exitosa"),BA.ObjectToCharSequence("Éxito"),ba);
 if (true) break;

case 25:
//C
this.state = 26;
RDebugUtils.currentLine=8192073;
 //BA.debugLineNum = 8192073;BA.debugLine="Log(\"ID: \" & id)";
parent.__c.LogImpl("48192073","ID: "+_id,0);
RDebugUtils.currentLine=8192074;
 //BA.debugLineNum = 8192074;BA.debugLine="Log(\"FechaInicio: \" & FechaInicio)";
parent.__c.LogImpl("48192074","FechaInicio: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=8192075;
 //BA.debugLineNum = 8192075;BA.debugLine="Log(\"LaborCBX: \" & LaborCBX)";
parent.__c.LogImpl("48192075","LaborCBX: "+__ref._laborcbx /*String*/ ,0);
RDebugUtils.currentLine=8192076;
 //BA.debugLineNum = 8192076;BA.debugLine="Log(\"Valor fijo: 0\")";
parent.__c.LogImpl("48192076","Valor fijo: 0",0);
RDebugUtils.currentLine=8192077;
 //BA.debugLineNum = 8192077;BA.debugLine="Log(\"ConceptoCBX: \" & ConceptoCBX)";
parent.__c.LogImpl("48192077","ConceptoCBX: "+__ref._conceptocbx /*String*/ ,0);
RDebugUtils.currentLine=8192078;
 //BA.debugLineNum = 8192078;BA.debugLine="Log(\"nitEmpresaCBX: \" & nitEmpresaCBX)";
parent.__c.LogImpl("48192078","nitEmpresaCBX: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=8192079;
 //BA.debugLineNum = 8192079;BA.debugLine="Log(\"haciendaCBX: \" & haciendaCBX)";
parent.__c.LogImpl("48192079","haciendaCBX: "+__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=8192080;
 //BA.debugLineNum = 8192080;BA.debugLine="Log(\"LoteCBX: \" & LoteCBX)";
parent.__c.LogImpl("48192080","LoteCBX: "+__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=8192081;
 //BA.debugLineNum = 8192081;BA.debugLine="Log(\"HorasText: \" & HorasText)";
parent.__c.LogImpl("48192081","HorasText: "+__ref._horastext /*String*/ ,0);
RDebugUtils.currentLine=8192082;
 //BA.debugLineNum = 8192082;BA.debugLine="Log(\"CantidadText: \" & CantidadText)";
parent.__c.LogImpl("48192082","CantidadText: "+__ref._cantidadtext /*String*/ ,0);
RDebugUtils.currentLine=8192083;
 //BA.debugLineNum = 8192083;BA.debugLine="Log(\"ObsvText: \" & ObsvText)";
parent.__c.LogImpl("48192083","ObsvText: "+__ref._obsvtext /*String*/ ,0);
RDebugUtils.currentLine=8192084;
 //BA.debugLineNum = 8192084;BA.debugLine="Log(\"TurnoCBX: \" & TurnoCBX)";
parent.__c.LogImpl("48192084","TurnoCBX: "+__ref._turnocbx /*String*/ ,0);
RDebugUtils.currentLine=8192085;
 //BA.debugLineNum = 8192085;BA.debugLine="Log(\"PorcentageText: \" & PorcentageText)";
parent.__c.LogImpl("48192085","PorcentageText: "+__ref._porcentagetext /*String*/ ,0);
RDebugUtils.currentLine=8192086;
 //BA.debugLineNum = 8192086;BA.debugLine="Log(\"Error en el job: \" & j.ErrorMessage)";
parent.__c.LogImpl("48192086","Error en el job: "+_j._errormessage /*String*/ ,0);
RDebugUtils.currentLine=8192087;
 //BA.debugLineNum = 8192087;BA.debugLine="MsgboxAsync(\"Error al insertar: \" & j.ErrorMes";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Error al insertar: "+_j._errormessage /*String*/ ),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 26:
//C
this.state = 27;
;
RDebugUtils.currentLine=8192089;
 //BA.debugLineNum = 8192089;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 27:
//C
this.state = 30;
;
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=8192093;
 //BA.debugLineNum = 8192093;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
parent.__c.LogImpl("48192093","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=8192095;
 //BA.debugLineNum = 8192095;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _can_oncanceldate(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "can_oncanceldate", false))
	 {return ((String) Debug.delegate(ba, "can_oncanceldate", null));}
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=5242888;
 //BA.debugLineNum = 5242888;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=5242892;
 //BA.debugLineNum = 5242892;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5242893;
 //BA.debugLineNum = 5242893;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="Private DateDialog As DateDialog";
_datedialog = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242896;
 //BA.debugLineNum = 5242896;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242898;
 //BA.debugLineNum = 5242898;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="Private Spinner1 As Spinner";
_spinner1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="Private Spinner2 As Spinner";
_spinner2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=5242901;
 //BA.debugLineNum = 5242901;BA.debugLine="Private Spinner3 As Spinner";
_spinner3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=5242902;
 //BA.debugLineNum = 5242902;BA.debugLine="Private Spinner4 As Spinner";
_spinner4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=5242908;
 //BA.debugLineNum = 5242908;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5242909;
 //BA.debugLineNum = 5242909;BA.debugLine="Private Label13Hfim As Label";
_label13hfim = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5242910;
 //BA.debugLineNum = 5242910;BA.debugLine="Private Label12Hinicio As Label";
_label12hinicio = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5242911;
 //BA.debugLineNum = 5242911;BA.debugLine="Private EditText1percentage As EditText";
_edittext1percentage = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=5242912;
 //BA.debugLineNum = 5242912;BA.debugLine="Private EditText2horas As EditText";
_edittext2horas = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=5242913;
 //BA.debugLineNum = 5242913;BA.debugLine="Private EditText3cantidat As EditText";
_edittext3cantidat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=5242914;
 //BA.debugLineNum = 5242914;BA.debugLine="Private EditText4obsv As EditText";
_edittext4obsv = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=5242915;
 //BA.debugLineNum = 5242915;BA.debugLine="Private Label3Name As Label";
_label3name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5242917;
 //BA.debugLineNum = 5242917;BA.debugLine="Private SD_xComboBoxNitPerson As SD_xComboBox";
_sd_xcomboboxnitperson = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=5242918;
 //BA.debugLineNum = 5242918;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=5242920;
 //BA.debugLineNum = 5242920;BA.debugLine="Dim FechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=5242921;
 //BA.debugLineNum = 5242921;BA.debugLine="Dim FechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=5242922;
 //BA.debugLineNum = 5242922;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=5242923;
 //BA.debugLineNum = 5242923;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=5242924;
 //BA.debugLineNum = 5242924;BA.debugLine="Dim LoteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=5242925;
 //BA.debugLineNum = 5242925;BA.debugLine="Dim LaborCBX As String";
_laborcbx = "";
RDebugUtils.currentLine=5242926;
 //BA.debugLineNum = 5242926;BA.debugLine="Dim ConceptoCBX As String";
_conceptocbx = "";
RDebugUtils.currentLine=5242927;
 //BA.debugLineNum = 5242927;BA.debugLine="Dim TurnoCBX As String";
_turnocbx = "";
RDebugUtils.currentLine=5242928;
 //BA.debugLineNum = 5242928;BA.debugLine="Dim HorasText As String";
_horastext = "";
RDebugUtils.currentLine=5242929;
 //BA.debugLineNum = 5242929;BA.debugLine="Dim PorcentageText As String";
_porcentagetext = "";
RDebugUtils.currentLine=5242930;
 //BA.debugLineNum = 5242930;BA.debugLine="Dim CantidadText As String";
_cantidadtext = "";
RDebugUtils.currentLine=5242931;
 //BA.debugLineNum = 5242931;BA.debugLine="Dim ObsvText As String";
_obsvtext = "";
RDebugUtils.currentLine=5242932;
 //BA.debugLineNum = 5242932;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=5242933;
 //BA.debugLineNum = 5242933;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=5242934;
 //BA.debugLineNum = 5242934;BA.debugLine="Private SD_xComboBoxConcepto As SD_xComboBox";
_sd_xcomboboxconcepto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=5242935;
 //BA.debugLineNum = 5242935;BA.debugLine="Private SD_xComboBoxTurno As SD_xComboBox";
_sd_xcomboboxturno = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=5242936;
 //BA.debugLineNum = 5242936;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=5242937;
 //BA.debugLineNum = 5242937;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242938;
 //BA.debugLineNum = 5242938;BA.debugLine="Private AS_DatePicker2 As AS_DatePicker";
_as_datepicker2 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=5242939;
 //BA.debugLineNum = 5242939;BA.debugLine="Private Panel13 As Panel";
_panel13 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5242940;
 //BA.debugLineNum = 5242940;BA.debugLine="Public idPerson As String";
_idperson = "";
RDebugUtils.currentLine=5242941;
 //BA.debugLineNum = 5242941;BA.debugLine="Dim ConceptoDataMap As Map";
_conceptodatamap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5242944;
 //BA.debugLineNum = 5242944;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=5242945;
 //BA.debugLineNum = 5242945;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=5242946;
 //BA.debugLineNum = 5242946;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=5242947;
 //BA.debugLineNum = 5242947;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=5242948;
 //BA.debugLineNum = 5242948;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=5242949;
 //BA.debugLineNum = 5242949;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=5242950;
 //BA.debugLineNum = 5242950;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=5242951;
 //BA.debugLineNum = 5242951;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=5242952;
 //BA.debugLineNum = 5242952;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=5242953;
 //BA.debugLineNum = 5242953;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=5242954;
 //BA.debugLineNum = 5242954;BA.debugLine="Private SwiftButtonConcepto As SwiftButton";
_swiftbuttonconcepto = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=5242955;
 //BA.debugLineNum = 5242955;BA.debugLine="Private SearchTemplateConcepto As B4XSearchTempla";
_searchtemplateconcepto = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=5242956;
 //BA.debugLineNum = 5242956;BA.debugLine="Private SwiftButtonTurno As SwiftButton";
_swiftbuttonturno = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=5242957;
 //BA.debugLineNum = 5242957;BA.debugLine="Private SearchTemplateTurno As B4XSearchTemplate";
_searchtemplateturno = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=5242961;
 //BA.debugLineNum = 5242961;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.formperson __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_db);
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.formperson __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="End Sub";
return "";
}
public String  _edittext1percentage_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext1percentage_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1percentage_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="PorcentageText= New";
__ref._porcentagetext /*String*/  = _new;
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Log(PorcentageText)";
__c.LogImpl("47995394",__ref._porcentagetext /*String*/ ,0);
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return "";
}
public String  _edittext2horas_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext2horas_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2horas_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="HorasText = New";
__ref._horastext /*String*/  = _new;
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Log(HorasText)";
__c.LogImpl("47929860",__ref._horastext /*String*/ ,0);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="End Sub";
return "";
}
public String  _edittext3cantidat_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext3cantidat_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3cantidat_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="CantidadText = New";
__ref._cantidadtext /*String*/  = _new;
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Log(CantidadText)";
__c.LogImpl("48060931",__ref._cantidadtext /*String*/ ,0);
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="End Sub";
return "";
}
public String  _edittext4obsv_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext4obsv_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext4obsv_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="ObsvText =New";
__ref._obsvtext /*String*/  = _new;
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="Log(ObsvText)";
__c.LogImpl("48126467",__ref._obsvtext /*String*/ ,0);
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_clientes",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="req.PrintTable(res)";
_req._printtable /*String*/ (null,_res);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("46815754","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=6750229;
 //BA.debugLineNum = 6750229;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=6750231;
 //BA.debugLineNum = 6750231;BA.debugLine="Spinner2.Add(cadena)";
__ref._spinner2 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=6750232;
 //BA.debugLineNum = 6750232;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("46750236","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=6750238;
 //BA.debugLineNum = 6750238;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=6750239;
 //BA.debugLineNum = 6750239;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7143440;
 //BA.debugLineNum = 7143440;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=7143441;
 //BA.debugLineNum = 7143441;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=7143443;
 //BA.debugLineNum = 7143443;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=7143446;
 //BA.debugLineNum = 7143446;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=7143447;
 //BA.debugLineNum = 7143447;BA.debugLine="Spinner4.Add(cadena)";
__ref._spinner4 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=7143448;
 //BA.debugLineNum = 7143448;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=7143452;
 //BA.debugLineNum = 7143452;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("47143452","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=7143454;
 //BA.debugLineNum = 7143454;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7143455;
 //BA.debugLineNum = 7143455;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nit),(Object)(_hda)});
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=7077903;
 //BA.debugLineNum = 7077903;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=7077904;
 //BA.debugLineNum = 7077904;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="Spinner3.Add(cadena)";
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
RDebugUtils.currentLine=7077912;
 //BA.debugLineNum = 7077912;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("47077912","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=7077914;
 //BA.debugLineNum = 7077914;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7077915;
 //BA.debugLineNum = 7077915;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub Globals";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
_panel10horainicio = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
_labelfecha = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="End Sub";
return "";
}
public String  _hinicio_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "hinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "hinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="End Sub";
return "";
}
public String  _insertrecord(b4a.example.ef.formperson __ref,String _nombre,int _salario) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "insertrecord", false))
	 {return ((String) Debug.delegate(ba, "insertrecord", new Object[] {_nombre,_salario}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
RDebugUtils.currentLine=6881288;
 //BA.debugLineNum = 6881288;BA.debugLine="End Sub";
return "";
}
public String  _label10_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label10_click", false))
	 {return ((String) Debug.delegate(ba, "label10_click", null));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="End Sub";
return "";
}
public String  _label12hinicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label12hinicio_click", false))
	 {return ((String) Debug.delegate(ba, "label12hinicio_click", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Private Sub Label12Hinicio_Click";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Panel12.Visible= True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public String  _label13hfim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label13hfim_click", false))
	 {return ((String) Debug.delegate(ba, "label13hfim_click", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Private Sub Label13Hfim_Click";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Panel13.Visible= True";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Saved."),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxconcepto_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxconcepto_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxconcepto_itemclick", new Object[] {_position,_value}));}
String _dstjo_cncpto = "";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="ConceptoCBX = Null";
__ref._conceptocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
_dstjo_cncpto = BA.ObjectToString(__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_value));
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
__c.LogImpl("47864331","Valor seleccionado: "+__ref._conceptocbx /*String*/ ,0);
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
__c.LogImpl("47864332","Dato dstjo_Cncpto: "+_dstjo_cncpto,0);
RDebugUtils.currentLine=7864335;
 //BA.debugLineNum = 7864335;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
if ((_dstjo_cncpto).equals("N")) { 
RDebugUtils.currentLine=7864337;
 //BA.debugLineNum = 7864337;BA.debugLine="EditText3cantidat.Enabled = False";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="EditText3cantidat.Enabled = True";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=7864342;
 //BA.debugLineNum = 7864342;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="haciendaCBX = Null";
__ref._haciendacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="haciendaCBX = Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("47667718",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7667732;
 //BA.debugLineNum = 7667732;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7667733;
 //BA.debugLineNum = 7667733;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7667737;
 //BA.debugLineNum = 7667737;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7667738;
 //BA.debugLineNum = 7667738;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=7667741;
 //BA.debugLineNum = 7667741;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
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
RDebugUtils.currentLine=7667746;
 //BA.debugLineNum = 7667746;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("47667746","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=7667750;
 //BA.debugLineNum = 7667750;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7667752;
 //BA.debugLineNum = 7667752;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="LaborCBX = Null";
__ref._laborcbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="Log(LaborCBX)";
__c.LogImpl("47798792",__ref._laborcbx /*String*/ ,0);
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="LoteCBX = Null";
__ref._lotecbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="Log(LoteCBX)";
__c.LogImpl("47733257",__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="nitEmpresaCBX = Null";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="nitEmpresaCBX = Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
parent.__c.LogImpl("47602186","Valor seleccionado: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
parent.__c.LogImpl("47602188","Posicion: "+BA.NumberToString(_position)+" VALUE: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=7602199;
 //BA.debugLineNum = 7602199;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=7602201;
 //BA.debugLineNum = 7602201;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=7602202;
 //BA.debugLineNum = 7602202;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=7602206;
 //BA.debugLineNum = 7602206;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=7602207;
 //BA.debugLineNum = 7602207;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=7602208;
 //BA.debugLineNum = 7602208;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=7602211;
 //BA.debugLineNum = 7602211;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
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
RDebugUtils.currentLine=7602216;
 //BA.debugLineNum = 7602216;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("47602216","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=7602219;
 //BA.debugLineNum = 7602219;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("47602219",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=7602221;
 //BA.debugLineNum = 7602221;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=7602223;
 //BA.debugLineNum = 7602223;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="If Value = Null Or Value = \"\" Then";
if (_value== null || (_value).equals((Object)(""))) { 
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
__ref._turnocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
__ref._turnocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="End Sub";
return "";
}
public String  _spinner1_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public String  _spinner10_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner10_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner10_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="End Sub";
return "";
}
public String  _spinner2_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner2_itemclick", new Object[] {_position,_value}));}
String _nit = "";
String _hacienda = "";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim nit As String";
_nit = "";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Dim hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Spinner3.Clear";
__ref._spinner3 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=7012358;
 //BA.debugLineNum = 7012358;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("47012358",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="nit= \"890307964\"";
_nit = "890307964";
RDebugUtils.currentLine=7012360;
 //BA.debugLineNum = 7012360;BA.debugLine="hacienda = Value";
_hacienda = BA.ObjectToString(_value);
RDebugUtils.currentLine=7012361;
 //BA.debugLineNum = 7012361;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
RDebugUtils.currentLine=7012363;
 //BA.debugLineNum = 7012363;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
__ref._getrecordlotes /*void*/ (null,"BDPichucho",_nit,_hacienda);
RDebugUtils.currentLine=7012364;
 //BA.debugLineNum = 7012364;BA.debugLine="End Sub";
return "";
}
public String  _spinner3_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner3_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner3_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public String  _spinner4_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner4_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner4_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return "";
}
public String  _swiftbutton1prueba_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbutton1prueba_click", false))
	 {return ((String) Debug.delegate(ba, "swiftbutton1prueba_click", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Private Sub SwiftButton1Prueba_Click";
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="End Sub";
return "";
}
public void  _swiftbuttonconcepto_click(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbuttonconcepto_click", false))
	 {Debug.delegate(ba, "swiftbuttonconcepto_click", null); return;}
ResumableSub_SwiftButtonConcepto_Click rsub = new ResumableSub_SwiftButtonConcepto_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonConcepto_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonConcepto_Click(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
b4a.example.ef.formperson parent;
int _result = 0;
String _conceptocompleto = "";
String[] _partes = null;

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
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateConce";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonconcepto_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="SwiftButtonConcepto.xLBL.Text = SearchTemplateCo";
__ref._swiftbuttonconcepto /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="Dim CONCEPTOCOMPLETO As String = SearchTemplateC";
_conceptocompleto = __ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", CONCEP";
_partes = parent.__c.Regex.Split(":",_conceptocompleto);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="ConceptoCBX = Partes(0)";
__ref._conceptocbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonhacienda_click(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbuttonhacienda_click", false))
	 {Debug.delegate(ba, "swiftbuttonhacienda_click", null); return;}
ResumableSub_SwiftButtonHacienda_Click rsub = new ResumableSub_SwiftButtonHacienda_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonHacienda_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonHacienda_Click(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = __ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="haciendaCBX = Partes(0)";
__ref._haciendacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
RDebugUtils.currentLine=8454156;
 //BA.debugLineNum = 8454156;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8454159;
 //BA.debugLineNum = 8454159;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8454161;
 //BA.debugLineNum = 8454161;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=8454164;
 //BA.debugLineNum = 8454164;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8454167;
 //BA.debugLineNum = 8454167;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8454169;
 //BA.debugLineNum = 8454169;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8454170;
 //BA.debugLineNum = 8454170;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8454174;
 //BA.debugLineNum = 8454174;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=8454175;
 //BA.debugLineNum = 8454175;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=8454178;
 //BA.debugLineNum = 8454178;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacie";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_codg_hacienda,(Object)(_codg_hacienda));
RDebugUtils.currentLine=8454179;
 //BA.debugLineNum = 8454179;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
RDebugUtils.currentLine=8454184;
 //BA.debugLineNum = 8454184;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("48454184","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=8454186;
 //BA.debugLineNum = 8454186;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslote);
RDebugUtils.currentLine=8454187;
 //BA.debugLineNum = 8454187;BA.debugLine="SwiftButtonLote.Enabled = True";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=8454189;
 //BA.debugLineNum = 8454189;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=8454192;
 //BA.debugLineNum = 8454192;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlabor_click(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbuttonlabor_click", false))
	 {Debug.delegate(ba, "swiftbuttonlabor_click", null); return;}
ResumableSub_SwiftButtonLabor_Click rsub = new ResumableSub_SwiftButtonLabor_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLabor_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLabor_Click(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
b4a.example.ef.formperson parent;
int _result = 0;
String _laborcompleto = "";
String[] _partes = null;

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
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonlabor_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
__ref._swiftbuttonlabor /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="Dim LABORCOMPLETO As String = SearchTemplateLabo";
_laborcompleto = __ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", LABORC";
_partes = parent.__c.Regex.Split(":",_laborcompleto);
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="LaborCBX = Partes(0)";
__ref._laborcbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonlote_click(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbuttonlote_click", false))
	 {Debug.delegate(ba, "swiftbuttonlote_click", null); return;}
ResumableSub_SwiftButtonLote_Click rsub = new ResumableSub_SwiftButtonLote_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonLote_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonLote_Click(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
b4a.example.ef.formperson parent;
int _result = 0;
String _lotecompleto = "";
String[] _partes = null;

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
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonlote_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.S";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Dim LOTECOMPLETO As String = SearchTemplateLote.";
_lotecompleto = __ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", LOTECO";
_partes = parent.__c.Regex.Split(":",_lotecompleto);
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="LoteCBX = Partes(0) ' Obtiene el valor antes del";
__ref._lotecbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonnit_click(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbuttonnit_click", false))
	 {Debug.delegate(ba, "swiftbuttonnit_click", null); return;}
ResumableSub_SwiftButtonNit_Click rsub = new ResumableSub_SwiftButtonNit_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonNit_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonNit_Click(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
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
RDebugUtils.currentModule="formperson";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 14;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
__ref._swiftbuttonnit /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
RDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="nitEmpresaCBX = Partes(0)";
__ref._nitempresacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=8388620;
 //BA.debugLineNum = 8388620;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
RDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=8388622;
 //BA.debugLineNum = 8388622;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=8388626;
 //BA.debugLineNum = 8388626;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=8388627;
 //BA.debugLineNum = 8388627;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(__ref._nitempresacbx /*String*/ )});
RDebugUtils.currentLine=8388630;
 //BA.debugLineNum = 8388630;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=8388633;
 //BA.debugLineNum = 8388633;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=8388635;
 //BA.debugLineNum = 8388635;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=8388636;
 //BA.debugLineNum = 8388636;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=8388640;
 //BA.debugLineNum = 8388640;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=8388641;
 //BA.debugLineNum = 8388641;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=8388642;
 //BA.debugLineNum = 8388642;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=8388645;
 //BA.debugLineNum = 8388645;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda,(Object)(_codg_hacienda));
RDebugUtils.currentLine=8388647;
 //BA.debugLineNum = 8388647;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
RDebugUtils.currentLine=8388652;
 //BA.debugLineNum = 8388652;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("48388652","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=8388654;
 //BA.debugLineNum = 8388654;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemshacienda);
RDebugUtils.currentLine=8388655;
 //BA.debugLineNum = 8388655;BA.debugLine="SwiftButtonHacienda.Enabled = True";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=8388656;
 //BA.debugLineNum = 8388656;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("48388656",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=8388658;
 //BA.debugLineNum = 8388658;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=8388664;
 //BA.debugLineNum = 8388664;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _swiftbuttonturno_click(b4a.example.ef.formperson __ref) throws Exception{
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbuttonturno_click", false))
	 {Debug.delegate(ba, "swiftbuttonturno_click", null); return;}
ResumableSub_SwiftButtonTurno_Click rsub = new ResumableSub_SwiftButtonTurno_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_SwiftButtonTurno_Click extends BA.ResumableSub {
public ResumableSub_SwiftButtonTurno_Click(b4a.example.ef.formperson parent,b4a.example.ef.formperson __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.ef.formperson __ref;
b4a.example.ef.formperson parent;
int _result = 0;

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
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTurno";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonturno_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="SwiftButtonTurno.xLBL.Text = SearchTemplateTurno";
__ref._swiftbuttonturno /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}