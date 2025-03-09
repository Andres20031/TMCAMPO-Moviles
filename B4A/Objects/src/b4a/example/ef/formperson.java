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
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="End Sub";
return null;
}
public String  _as_datepicker1_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Sub AS_DatePicker1_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=15925251;
 //BA.debugLineNum = 15925251;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker1_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker1_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker1_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Sub AS_DatePicker1_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="Label12Hinicio.Text = formattedDate";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=15859719;
 //BA.debugLineNum = 15859719;BA.debugLine="FechaInicio = formattedDate";
__ref._fechainicio /*String*/  = _formatteddate;
RDebugUtils.currentLine=15859721;
 //BA.debugLineNum = 15859721;BA.debugLine="Panel12.Visible = False";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=15859724;
 //BA.debugLineNum = 15859724;BA.debugLine="Log(\"Fecha seleccionada: \" & FechaInicio)";
__c.LogImpl("715859724","Fecha seleccionada: "+__ref._fechainicio /*String*/ ,0);
RDebugUtils.currentLine=15859725;
 //BA.debugLineNum = 15859725;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_datechanged(b4a.example.ef.formperson __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_datechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_datechanged", new Object[] {_year,_month,_day}));}
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub AS_DatePicker2_DateChanged(Year As Int, Month";
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Label12Hinicio.Text = Day & \"/\" & Month & \"/\" & Y";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_day)+"/"+BA.NumberToString(_month)+"/"+BA.NumberToString(_year)));
RDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="End Sub";
return "";
}
public String  _as_datepicker2_selecteddatechanged(b4a.example.ef.formperson __ref,long _date) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "as_datepicker2_selecteddatechanged", false))
	 {return ((String) Debug.delegate(ba, "as_datepicker2_selecteddatechanged", new Object[] {_date}));}
String _formatteddate = "";
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Sub AS_DatePicker2_SelectedDateChanged(Date As Lon";
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="Dim formattedDate As String = DateTime.Date(Date)";
_formatteddate = __c.DateTime.Date(_date);
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="Label13Hfim.Text = formattedDate";
__ref._label13hfim /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_formatteddate));
RDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="FechaFin = formattedDate";
__ref._fechafin /*String*/  = _formatteddate;
RDebugUtils.currentLine=16056329;
 //BA.debugLineNum = 16056329;BA.debugLine="Log(\"Fecha de fin\" & FechaFin )";
__c.LogImpl("716056329","Fecha de fin"+__ref._fechafin /*String*/ ,0);
RDebugUtils.currentLine=16056331;
 //BA.debugLineNum = 16056331;BA.debugLine="Panel13.Visible = False";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=16056334;
 //BA.debugLineNum = 16056334;BA.debugLine="Log(\"Fecha seleccionada: \" & formattedDate)";
__c.LogImpl("716056334","Fecha seleccionada: "+_formatteddate,0);
RDebugUtils.currentLine=16056335;
 //BA.debugLineNum = 16056335;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="SearchTemplateNit.Initialize";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="Dim ItemsNit As List";
_itemsnit = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="ItemsNit.Initialize";
_itemsnit.Initialize();
RDebugUtils.currentLine=15728649;
 //BA.debugLineNum = 15728649;BA.debugLine="SearchTemplateHacienda.Initialize";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15728651;
 //BA.debugLineNum = 15728651;BA.debugLine="SearchTemplateLote.Initialize";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15728653;
 //BA.debugLineNum = 15728653;BA.debugLine="SearchTemplateLabor.Initialize";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15728655;
 //BA.debugLineNum = 15728655;BA.debugLine="Dim ItemsLabor As List";
_itemslabor = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728656;
 //BA.debugLineNum = 15728656;BA.debugLine="ItemsLabor.Initialize";
_itemslabor.Initialize();
RDebugUtils.currentLine=15728658;
 //BA.debugLineNum = 15728658;BA.debugLine="SearchTemplateConcepto.Initialize";
__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15728659;
 //BA.debugLineNum = 15728659;BA.debugLine="Dim ItemsConcepto As List";
_itemsconcepto = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728660;
 //BA.debugLineNum = 15728660;BA.debugLine="ItemsConcepto.Initialize";
_itemsconcepto.Initialize();
RDebugUtils.currentLine=15728662;
 //BA.debugLineNum = 15728662;BA.debugLine="SearchTemplateTurno.Initialize";
__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15728663;
 //BA.debugLineNum = 15728663;BA.debugLine="Dim ItemsTurno As List";
_itemsturno = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728664;
 //BA.debugLineNum = 15728664;BA.debugLine="ItemsTurno.Initialize";
_itemsturno.Initialize();
RDebugUtils.currentLine=15728669;
 //BA.debugLineNum = 15728669;BA.debugLine="Label3Name.Text = B4XPages.GetPage(\"DetailsPerson";
__ref._label3name /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ));
RDebugUtils.currentLine=15728672;
 //BA.debugLineNum = 15728672;BA.debugLine="SD_xComboBoxNitPerson.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=15728673;
 //BA.debugLineNum = 15728673;BA.debugLine="ItemsNit.Add(\"Seleccionar:\")";
_itemsnit.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15728675;
 //BA.debugLineNum = 15728675;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=15728676;
 //BA.debugLineNum = 15728676;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=15728677;
 //BA.debugLineNum = 15728677;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_nit\"";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_nit",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15728680;
 //BA.debugLineNum = 15728680;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 41;
return;
case 41:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15728683;
 //BA.debugLineNum = 15728683;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=15728685;
 //BA.debugLineNum = 15728685;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=15728686;
 //BA.debugLineNum = 15728686;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 42;
return;
case 42:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15728689;
 //BA.debugLineNum = 15728689;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=15728690;
 //BA.debugLineNum = 15728690;BA.debugLine="Dim razonSocial As String = row(0)";
_razonsocial = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=15728691;
 //BA.debugLineNum = 15728691;BA.debugLine="Dim nit As String = row(1)";
_nit = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=15728693;
 //BA.debugLineNum = 15728693;BA.debugLine="SD_xComboBoxNitPerson.Add(razonSocial & \" - \" &";
__ref._sd_xcomboboxnitperson /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_razonsocial+" - "+_nit,(Object)(_nit));
RDebugUtils.currentLine=15728694;
 //BA.debugLineNum = 15728694;BA.debugLine="ItemsNit.Add(nit&\":\"&razonSocial )";
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
RDebugUtils.currentLine=15728699;
 //BA.debugLineNum = 15728699;BA.debugLine="Log(\"Error en la consulta de NITs: \" & j.ErrorMe";
parent.__c.LogImpl("715728699","Error en la consulta de NITs: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=15728701;
 //BA.debugLineNum = 15728701;BA.debugLine="SearchTemplateNit.SetItems(ItemsNit)";
__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsnit);
RDebugUtils.currentLine=15728703;
 //BA.debugLineNum = 15728703;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=15728707;
 //BA.debugLineNum = 15728707;BA.debugLine="SD_xComboBoxLabor.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=15728708;
 //BA.debugLineNum = 15728708;BA.debugLine="ItemsLabor.Add(\"Seleccionar:\")";
_itemslabor.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15728709;
 //BA.debugLineNum = 15728709;BA.debugLine="Dim cmdLabor As DBCommand = CreateCommand(\"select";
_cmdlabor = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labor",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15728710;
 //BA.debugLineNum = 15728710;BA.debugLine="Wait For (Req.ExecuteQuery(cmdLabor, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdlabor,(int) (0),parent.__c.Null)));
this.state = 45;
return;
case 45:
//C
this.state = 11;
_j2 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15728711;
 //BA.debugLineNum = 15728711;BA.debugLine="If j2.Success Then";
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
RDebugUtils.currentLine=15728712;
 //BA.debugLineNum = 15728712;BA.debugLine="Req.HandleJobAsync(j2, \"req_labor\")";
_req._handlejobasync /*void*/ (null,_j2,"req_labor");
RDebugUtils.currentLine=15728713;
 //BA.debugLineNum = 15728713;BA.debugLine="Wait For (Req) req_labor_Result(resLabor As DBRe";
parent.__c.WaitFor("req_labor_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 46;
return;
case 46:
//C
this.state = 14;
_reslabor = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15728714;
 //BA.debugLineNum = 15728714;BA.debugLine="For Each rowLabor() As Object In resLabor.Rows";
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
RDebugUtils.currentLine=15728715;
 //BA.debugLineNum = 15728715;BA.debugLine="Dim codigoDestino As String = rowLabor(0) ' Cdg";
_codigodestino = BA.ObjectToString(_rowlabor[(int) (0)]);
RDebugUtils.currentLine=15728716;
 //BA.debugLineNum = 15728716;BA.debugLine="Dim descripcionDestino As String = rowLabor(1)";
_descripciondestino = BA.ObjectToString(_rowlabor[(int) (1)]);
RDebugUtils.currentLine=15728717;
 //BA.debugLineNum = 15728717;BA.debugLine="SD_xComboBoxLabor.Add(descripcionDestino, codig";
__ref._sd_xcomboboxlabor /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_descripciondestino,(Object)(_codigodestino));
RDebugUtils.currentLine=15728718;
 //BA.debugLineNum = 15728718;BA.debugLine="ItemsLabor.Add(codigoDestino&\":\"&descripcionDes";
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
RDebugUtils.currentLine=15728721;
 //BA.debugLineNum = 15728721;BA.debugLine="Log(\"Error en la consulta de destinos: \" & j2.Er";
parent.__c.LogImpl("715728721","Error en la consulta de destinos: "+_j2._errormessage /*String*/ ,0);
 if (true) break;

case 20:
//C
this.state = 21;
;
RDebugUtils.currentLine=15728723;
 //BA.debugLineNum = 15728723;BA.debugLine="SearchTemplateLabor.SetItems(ItemsLabor)";
__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslabor);
RDebugUtils.currentLine=15728724;
 //BA.debugLineNum = 15728724;BA.debugLine="j2.Release";
_j2._release /*String*/ (null);
RDebugUtils.currentLine=15728729;
 //BA.debugLineNum = 15728729;BA.debugLine="SD_xComboBoxConcepto.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=15728730;
 //BA.debugLineNum = 15728730;BA.debugLine="ItemsConcepto.Add(\"Seleccionar:\")";
_itemsconcepto.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15728733;
 //BA.debugLineNum = 15728733;BA.debugLine="Dim cmdConcepto As DBCommand = CreateCommand(\"sel";
_cmdconcepto = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_concepto",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15728736;
 //BA.debugLineNum = 15728736;BA.debugLine="ConceptoDataMap.Initialize";
__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=15728738;
 //BA.debugLineNum = 15728738;BA.debugLine="Wait For (Req.ExecuteQuery(cmdConcepto, 0, Null))";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdconcepto,(int) (0),parent.__c.Null)));
this.state = 49;
return;
case 49:
//C
this.state = 21;
_j3 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15728741;
 //BA.debugLineNum = 15728741;BA.debugLine="If j3.Success Then";
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
RDebugUtils.currentLine=15728743;
 //BA.debugLineNum = 15728743;BA.debugLine="Req.HandleJobAsync(j3, \"req_concept\")";
_req._handlejobasync /*void*/ (null,_j3,"req_concept");
RDebugUtils.currentLine=15728744;
 //BA.debugLineNum = 15728744;BA.debugLine="Wait For (Req) req_concept_Result(resConc As DBR";
parent.__c.WaitFor("req_concept_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 50;
return;
case 50:
//C
this.state = 24;
_resconc = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15728747;
 //BA.debugLineNum = 15728747;BA.debugLine="For Each rowConcep() As Object In resConc.Rows";
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
RDebugUtils.currentLine=15728748;
 //BA.debugLineNum = 15728748;BA.debugLine="Dim Cod_Concept As String = rowConcep(0) ' Códi";
_cod_concept = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=15728749;
 //BA.debugLineNum = 15728749;BA.debugLine="Dim Des_Concept As String = rowConcep(1) ' Desc";
_des_concept = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=15728750;
 //BA.debugLineNum = 15728750;BA.debugLine="Dim dstjo_Cncpto As String = rowConcep(2)";
_dstjo_cncpto = BA.ObjectToString(_rowconcep[(int) (2)]);
RDebugUtils.currentLine=15728753;
 //BA.debugLineNum = 15728753;BA.debugLine="SD_xComboBoxConcepto.Add(Des_Concept, Cod_Conce";
__ref._sd_xcomboboxconcepto /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_des_concept,(Object)(_cod_concept));
RDebugUtils.currentLine=15728754;
 //BA.debugLineNum = 15728754;BA.debugLine="ItemsConcepto.Add(Cod_Concept&\":\"&Des_Concept)";
_itemsconcepto.Add((Object)(_cod_concept+":"+_des_concept));
RDebugUtils.currentLine=15728756;
 //BA.debugLineNum = 15728756;BA.debugLine="ConceptoDataMap.Put(Cod_Concept, dstjo_Cncpto)";
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
RDebugUtils.currentLine=15728760;
 //BA.debugLineNum = 15728760;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j3.E";
parent.__c.LogImpl("715728760","Error en la consulta de conceptos: "+_j3._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = 31;
;
RDebugUtils.currentLine=15728762;
 //BA.debugLineNum = 15728762;BA.debugLine="SearchTemplateConcepto.SetItems(ItemsConcepto)";
__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsconcepto);
RDebugUtils.currentLine=15728765;
 //BA.debugLineNum = 15728765;BA.debugLine="j3.Release";
_j3._release /*String*/ (null);
RDebugUtils.currentLine=15728768;
 //BA.debugLineNum = 15728768;BA.debugLine="SD_xComboBoxTurno.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=15728769;
 //BA.debugLineNum = 15728769;BA.debugLine="ItemsTurno.Add(\"Seleccionar:\")";
_itemsturno.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=15728771;
 //BA.debugLineNum = 15728771;BA.debugLine="Dim cmdTurno As DBCommand = CreateCommand(\"select";
_cmdturno = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_turnos",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=15728774;
 //BA.debugLineNum = 15728774;BA.debugLine="Wait For (Req.ExecuteQuery(cmdTurno, 0, Null)) Jo";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmdturno,(int) (0),parent.__c.Null)));
this.state = 53;
return;
case 53:
//C
this.state = 31;
_j4 = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=15728777;
 //BA.debugLineNum = 15728777;BA.debugLine="If j4.Success Then";
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
RDebugUtils.currentLine=15728779;
 //BA.debugLineNum = 15728779;BA.debugLine="Req.HandleJobAsync(j4, \"req_turno\")";
_req._handlejobasync /*void*/ (null,_j4,"req_turno");
RDebugUtils.currentLine=15728780;
 //BA.debugLineNum = 15728780;BA.debugLine="Wait For (Req) req_turno_Result(resTurno As DBRe";
parent.__c.WaitFor("req_turno_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "b4xpage_appear"), (Object)(_req));
this.state = 54;
return;
case 54:
//C
this.state = 34;
_resturno = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=15728783;
 //BA.debugLineNum = 15728783;BA.debugLine="For Each rowTurno() As Object In resTurno.Rows";
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
RDebugUtils.currentLine=15728784;
 //BA.debugLineNum = 15728784;BA.debugLine="Dim Turno As String = rowConcep(0) ' Código del";
_turno = BA.ObjectToString(_rowconcep[(int) (0)]);
RDebugUtils.currentLine=15728785;
 //BA.debugLineNum = 15728785;BA.debugLine="Dim Des_Turno As String = rowConcep(1) ' Descri";
_des_turno = BA.ObjectToString(_rowconcep[(int) (1)]);
RDebugUtils.currentLine=15728787;
 //BA.debugLineNum = 15728787;BA.debugLine="SD_xComboBoxTurno.Add(Turno , Des_Turno)";
__ref._sd_xcomboboxturno /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_turno,(Object)(_des_turno));
RDebugUtils.currentLine=15728788;
 //BA.debugLineNum = 15728788;BA.debugLine="ItemsTurno.Add(Des_Turno&\":\"&Turno)";
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
RDebugUtils.currentLine=15728792;
 //BA.debugLineNum = 15728792;BA.debugLine="Log(\"Error en la consulta de conceptos: \" & j4.E";
parent.__c.LogImpl("715728792","Error en la consulta de conceptos: "+_j4._errormessage /*String*/ ,0);
 if (true) break;

case 40:
//C
this.state = -1;
;
RDebugUtils.currentLine=15728794;
 //BA.debugLineNum = 15728794;BA.debugLine="SearchTemplateTurno.SetItems(ItemsTurno)";
__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemsturno);
RDebugUtils.currentLine=15728796;
 //BA.debugLineNum = 15728796;BA.debugLine="j4.Release";
_j4._release /*String*/ (null);
RDebugUtils.currentLine=15728798;
 //BA.debugLineNum = 15728798;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Sub CreateCommand(Name As String, Parameters() As";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Dim cmd As DBCommand";
_cmd = new b4a.example.ef.main._dbcommand();
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="cmd.Initialize";
_cmd.Initialize();
RDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="cmd.Name = Name";
_cmd.Name /*String*/  = _name;
RDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="If Parameters <> Null Then cmd.Parameters = Param";
if (_parameters!= null) { 
_cmd.Parameters /*Object[]*/  = _parameters;};
RDebugUtils.currentLine=16908293;
 //BA.debugLineNum = 16908293;BA.debugLine="Return cmd";
if (true) return _cmd;
RDebugUtils.currentLine=16908294;
 //BA.debugLineNum = 16908294;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="utilClass.Initialize";
__ref._utilclass /*b4a.example.ef.util*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="utilClass.SetStatusBarColor(Colors.White,Colors.W";
__ref._utilclass /*b4a.example.ef.util*/ ._setstatusbarcolor /*String*/ (null,__c.Colors.White,__c.Colors.White);
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="Root.LoadLayout(\"FomrPerson\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("FomrPerson",ba);
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="ScrollView1.Panel.Height=1100dip";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().setHeight(__c.DipToCurrent((int) (1100)));
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="ScrollView1.Panel.LoadLayout(\"ScrollUIPerson\")";
__ref._scrollview1 /*anywheresoftware.b4a.objects.ScrollViewWrapper*/ .getPanel().LoadLayout("ScrollUIPerson",ba);
RDebugUtils.currentLine=15663115;
 //BA.debugLineNum = 15663115;BA.debugLine="EditText3cantidat.Color=Colors.Transparent'.";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=15663116;
 //BA.debugLineNum = 15663116;BA.debugLine="EditText1percentage.Color=Colors.Transparent'.";
__ref._edittext1percentage /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=15663117;
 //BA.debugLineNum = 15663117;BA.debugLine="EditText4obsv.Color=Colors.Transparent'.";
__ref._edittext4obsv /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=15663118;
 //BA.debugLineNum = 15663118;BA.debugLine="EditText2horas.Color=Colors.Transparent'.";
__ref._edittext2horas /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=15663121;
 //BA.debugLineNum = 15663121;BA.debugLine="For Each v As View In Root.GetAllViewsRecursive";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group11 = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .GetAllViewsRecursive();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_v = (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(group11.Get(index11)));
RDebugUtils.currentLine=15663122;
 //BA.debugLineNum = 15663122;BA.debugLine="If v Is Spinner Then";
if (_v.getObjectOrNull() instanceof anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner) { 
RDebugUtils.currentLine=15663123;
 //BA.debugLineNum = 15663123;BA.debugLine="Dim newsp As Spinner=v";
_newsp = new anywheresoftware.b4a.objects.SpinnerWrapper();
_newsp = (anywheresoftware.b4a.objects.SpinnerWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.SpinnerWrapper(), (anywheresoftware.b4a.objects.SpinnerWrapper.B4ASpinner)(_v.getObject()));
RDebugUtils.currentLine=15663124;
 //BA.debugLineNum = 15663124;BA.debugLine="For i=1 To 16";
{
final int step14 = 1;
final int limit14 = (int) (16);
_i = (int) (1) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
RDebugUtils.currentLine=15663125;
 //BA.debugLineNum = 15663125;BA.debugLine="newsp.AddAll(Array As String(v.Tag&\" \"&i))";
_newsp.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_v.getTag())+" "+BA.NumberToString(_i)}));
 }
};
 };
 }
};
RDebugUtils.currentLine=15663143;
 //BA.debugLineNum = 15663143;BA.debugLine="Base = Root";
__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = __ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
RDebugUtils.currentLine=15663144;
 //BA.debugLineNum = 15663144;BA.debugLine="Dialog.Initialize (Base)";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._initialize /*String*/ (null,ba,__ref._base /*anywheresoftware.b4a.objects.B4XViewWrapper*/ );
RDebugUtils.currentLine=15663145;
 //BA.debugLineNum = 15663145;BA.debugLine="Dialog.Title = \"Buscador\"";
__ref._dialog /*b4a.example.ef.b4xdialog*/ ._title /*Object*/  = (Object)("Buscador");
RDebugUtils.currentLine=15663146;
 //BA.debugLineNum = 15663146;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="Dim id As String";
_id = "";
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="id = B4XPages.GetPage(\"DetailsPerson\").As(Details";
_id = ((b4a.example.ef.detailsperson)(parent._b4xpages._getpage /*Object*/ (ba,"DetailsPerson")))._nameperson /*String*/ ;
RDebugUtils.currentLine=18415623;
 //BA.debugLineNum = 18415623;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"\\#(.+)\",";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = parent.__c.Regex.Matcher("\\#(.+)",_id);
RDebugUtils.currentLine=18415625;
 //BA.debugLineNum = 18415625;BA.debugLine="If matcher.Find() Then";
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
RDebugUtils.currentLine=18415626;
 //BA.debugLineNum = 18415626;BA.debugLine="id = matcher.Group(1) ' Obtiene la parte después";
_id = _matcher.Group((int) (1));
RDebugUtils.currentLine=18415627;
 //BA.debugLineNum = 18415627;BA.debugLine="Log(\"ID: \" & id) ' Aquí puedes usar id según tus";
parent.__c.LogImpl("718415627","ID: "+_id,0);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=18415629;
 //BA.debugLineNum = 18415629;BA.debugLine="Log(\"No se encontró el carácter # en la cadena.\"";
parent.__c.LogImpl("718415629","No se encontró el carácter # en la cadena.",0);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=18415633;
 //BA.debugLineNum = 18415633;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_sear";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_searchPerson",new Object[]{(Object)(_id)});
RDebugUtils.currentLine=18415637;
 //BA.debugLineNum = 18415637;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18415638;
 //BA.debugLineNum = 18415638;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18415641;
 //BA.debugLineNum = 18415641;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 31;
return;
case 31:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18415643;
 //BA.debugLineNum = 18415643;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=18415646;
 //BA.debugLineNum = 18415646;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=18415647;
 //BA.debugLineNum = 18415647;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_req));
this.state = 32;
return;
case 32:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18415649;
 //BA.debugLineNum = 18415649;BA.debugLine="If res.Rows.Size > 0 Then";
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
RDebugUtils.currentLine=18415651;
 //BA.debugLineNum = 18415651;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18415652;
 //BA.debugLineNum = 18415652;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18415653;
 //BA.debugLineNum = 18415653;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Propios",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=18415654;
 //BA.debugLineNum = 18415654;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=18415655;
 //BA.debugLineNum = 18415655;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 13;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18415657;
 //BA.debugLineNum = 18415657;BA.debugLine="Try";
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
RDebugUtils.currentLine=18415658;
 //BA.debugLineNum = 18415658;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=18415659;
 //BA.debugLineNum = 18415659;BA.debugLine="Log(\"Se han recuperado datos: propios \" & res.";
parent.__c.LogImpl("718415659","Se han recuperado datos: propios "+BA.NumberToString(_res.Rows /*anywheresoftware.b4a.objects.collections.List*/ .getSize()),0);
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
RDebugUtils.currentLine=18415662;
 //BA.debugLineNum = 18415662;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("718415662","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=18415666;
 //BA.debugLineNum = 18415666;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18415667;
 //BA.debugLineNum = 18415667;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18415668;
 //BA.debugLineNum = 18415668;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"insert_Mv";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"insert_Mvto_Trab_Tmprles",new Object[]{(Object)(_id),(Object)(__ref._fechainicio /*String*/ ),(Object)(__ref._laborcbx /*String*/ ),(Object)(0),(Object)(__ref._conceptocbx /*String*/ ),(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ ),(Object)(__ref._lotecbx /*String*/ ),(Object)(__ref._horastext /*String*/ ),(Object)(__ref._cantidadtext /*String*/ ),(Object)(__ref._obsvtext /*String*/ ),(Object)(__ref._turnocbx /*String*/ ),(Object)(__ref._porcentagetext /*String*/ )});
RDebugUtils.currentLine=18415669;
 //BA.debugLineNum = 18415669;BA.debugLine="Dim j As HttpJob = Req.ExecuteCommand(cmd, Null";
_j = _req._executecommand /*b4a.example.ef.httpjob*/ (null,_cmd,parent.__c.Null);
RDebugUtils.currentLine=18415670;
 //BA.debugLineNum = 18415670;BA.debugLine="Wait For(j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "button1_click"), (Object)(_j));
this.state = 34;
return;
case 34:
//C
this.state = 21;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18415672;
 //BA.debugLineNum = 18415672;BA.debugLine="Try";
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
RDebugUtils.currentLine=18415673;
 //BA.debugLineNum = 18415673;BA.debugLine="MsgboxAsync(\"Se ha insertado correctamente.\",";
parent.__c.MsgboxAsync(BA.ObjectToCharSequence("Se ha insertado correctamente."),BA.ObjectToCharSequence("Éxito"),ba);
RDebugUtils.currentLine=18415674;
 //BA.debugLineNum = 18415674;BA.debugLine="Log(\"No se encontraron datos para el ID: \" & i";
parent.__c.LogImpl("718415674","No se encontraron datos para el ID: "+_id,0);
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 0;
RDebugUtils.currentLine=18415677;
 //BA.debugLineNum = 18415677;BA.debugLine="Log(\"Error al agregar datos: \" & LastException";
parent.__c.LogImpl("718415677","Error al agregar datos: "+BA.ObjectToString(parent.__c.LastException(ba)),0);
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
RDebugUtils.currentLine=18415682;
 //BA.debugLineNum = 18415682;BA.debugLine="Log(\"Error al ejecutar la consulta: \" & j.ErrorM";
parent.__c.LogImpl("718415682","Error al ejecutar la consulta: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=18415684;
 //BA.debugLineNum = 18415684;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Sub can_OnCancelDate ()";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="ToastMessageShow(\"cancel\" ,False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("cancel"),__c.False);
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="Private const rdcLink As String = \"http://84.46.2";
_rdclink = "http://84.46.255.129:17178/rdc";
RDebugUtils.currentLine=15466504;
 //BA.debugLineNum = 15466504;BA.debugLine="Dim Datepicker As Intellvold_DatePicker";
_datepicker = new lib.intellvold.datepicker.DatePicker();
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="Dim Mycalendar As Intellvold_Calendar";
_mycalendar = new lib.intellvold.datepicker.clander();
RDebugUtils.currentLine=15466506;
 //BA.debugLineNum = 15466506;BA.debugLine="Private utilClass As util";
_utilclass = new b4a.example.ef.util();
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="Private ScrollView1 As ScrollView";
_scrollview1 = new anywheresoftware.b4a.objects.ScrollViewWrapper();
RDebugUtils.currentLine=15466508;
 //BA.debugLineNum = 15466508;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15466509;
 //BA.debugLineNum = 15466509;BA.debugLine="Private SelectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=15466510;
 //BA.debugLineNum = 15466510;BA.debugLine="Private DateDialog As DateDialog";
_datedialog = new anywheresoftware.b4a.agraham.dialogs2.InputDialog.DateDialog();
RDebugUtils.currentLine=15466511;
 //BA.debugLineNum = 15466511;BA.debugLine="Private Panel3 As Panel";
_panel3 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15466512;
 //BA.debugLineNum = 15466512;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=15466513;
 //BA.debugLineNum = 15466513;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15466514;
 //BA.debugLineNum = 15466514;BA.debugLine="Private Label10 As Label";
_label10 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15466515;
 //BA.debugLineNum = 15466515;BA.debugLine="Private Spinner1 As Spinner";
_spinner1 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=15466516;
 //BA.debugLineNum = 15466516;BA.debugLine="Private Spinner2 As Spinner";
_spinner2 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=15466517;
 //BA.debugLineNum = 15466517;BA.debugLine="Private Spinner3 As Spinner";
_spinner3 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=15466518;
 //BA.debugLineNum = 15466518;BA.debugLine="Private Spinner4 As Spinner";
_spinner4 = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=15466524;
 //BA.debugLineNum = 15466524;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15466525;
 //BA.debugLineNum = 15466525;BA.debugLine="Private Label13Hfim As Label";
_label13hfim = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15466526;
 //BA.debugLineNum = 15466526;BA.debugLine="Private Label12Hinicio As Label";
_label12hinicio = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15466527;
 //BA.debugLineNum = 15466527;BA.debugLine="Private EditText1percentage As EditText";
_edittext1percentage = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15466528;
 //BA.debugLineNum = 15466528;BA.debugLine="Private EditText2horas As EditText";
_edittext2horas = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15466529;
 //BA.debugLineNum = 15466529;BA.debugLine="Private EditText3cantidat As EditText";
_edittext3cantidat = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15466530;
 //BA.debugLineNum = 15466530;BA.debugLine="Private EditText4obsv As EditText";
_edittext4obsv = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=15466531;
 //BA.debugLineNum = 15466531;BA.debugLine="Private Label3Name As Label";
_label3name = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15466533;
 //BA.debugLineNum = 15466533;BA.debugLine="Private SD_xComboBoxNitPerson As SD_xComboBox";
_sd_xcomboboxnitperson = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=15466534;
 //BA.debugLineNum = 15466534;BA.debugLine="Private SD_xComboBoxHacienda As SD_xComboBox";
_sd_xcomboboxhacienda = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=15466536;
 //BA.debugLineNum = 15466536;BA.debugLine="Dim FechaInicio As String";
_fechainicio = "";
RDebugUtils.currentLine=15466537;
 //BA.debugLineNum = 15466537;BA.debugLine="Dim FechaFin As String";
_fechafin = "";
RDebugUtils.currentLine=15466538;
 //BA.debugLineNum = 15466538;BA.debugLine="Dim nitEmpresaCBX As String";
_nitempresacbx = "";
RDebugUtils.currentLine=15466539;
 //BA.debugLineNum = 15466539;BA.debugLine="Dim haciendaCBX As String";
_haciendacbx = "";
RDebugUtils.currentLine=15466540;
 //BA.debugLineNum = 15466540;BA.debugLine="Dim LoteCBX As String";
_lotecbx = "";
RDebugUtils.currentLine=15466541;
 //BA.debugLineNum = 15466541;BA.debugLine="Dim LaborCBX As String";
_laborcbx = "";
RDebugUtils.currentLine=15466542;
 //BA.debugLineNum = 15466542;BA.debugLine="Dim ConceptoCBX As String";
_conceptocbx = "";
RDebugUtils.currentLine=15466543;
 //BA.debugLineNum = 15466543;BA.debugLine="Dim TurnoCBX As String";
_turnocbx = "";
RDebugUtils.currentLine=15466544;
 //BA.debugLineNum = 15466544;BA.debugLine="Dim HorasText As String";
_horastext = "";
RDebugUtils.currentLine=15466545;
 //BA.debugLineNum = 15466545;BA.debugLine="Dim PorcentageText As String";
_porcentagetext = "";
RDebugUtils.currentLine=15466546;
 //BA.debugLineNum = 15466546;BA.debugLine="Dim CantidadText As String";
_cantidadtext = "";
RDebugUtils.currentLine=15466547;
 //BA.debugLineNum = 15466547;BA.debugLine="Dim ObsvText As String";
_obsvtext = "";
RDebugUtils.currentLine=15466548;
 //BA.debugLineNum = 15466548;BA.debugLine="Private SD_xComboBoxLote As SD_xComboBox";
_sd_xcomboboxlote = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=15466549;
 //BA.debugLineNum = 15466549;BA.debugLine="Private SD_xComboBoxLabor As SD_xComboBox";
_sd_xcomboboxlabor = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=15466550;
 //BA.debugLineNum = 15466550;BA.debugLine="Private SD_xComboBoxConcepto As SD_xComboBox";
_sd_xcomboboxconcepto = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=15466551;
 //BA.debugLineNum = 15466551;BA.debugLine="Private SD_xComboBoxTurno As SD_xComboBox";
_sd_xcomboboxturno = new b4a.example.ef.sd_xcombobox();
RDebugUtils.currentLine=15466552;
 //BA.debugLineNum = 15466552;BA.debugLine="Private AS_DatePicker1 As AS_DatePicker";
_as_datepicker1 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=15466553;
 //BA.debugLineNum = 15466553;BA.debugLine="Private Panel12 As Panel";
_panel12 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15466554;
 //BA.debugLineNum = 15466554;BA.debugLine="Private AS_DatePicker2 As AS_DatePicker";
_as_datepicker2 = new b4a.example.ef.as_datepicker();
RDebugUtils.currentLine=15466555;
 //BA.debugLineNum = 15466555;BA.debugLine="Private Panel13 As Panel";
_panel13 = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15466556;
 //BA.debugLineNum = 15466556;BA.debugLine="Public idPerson As String";
_idperson = "";
RDebugUtils.currentLine=15466557;
 //BA.debugLineNum = 15466557;BA.debugLine="Dim ConceptoDataMap As Map";
_conceptodatamap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15466560;
 //BA.debugLineNum = 15466560;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.example.ef.b4xdialog();
RDebugUtils.currentLine=15466561;
 //BA.debugLineNum = 15466561;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=15466562;
 //BA.debugLineNum = 15466562;BA.debugLine="Private SwiftButtonNit As SwiftButton";
_swiftbuttonnit = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=15466563;
 //BA.debugLineNum = 15466563;BA.debugLine="Private SearchTemplateNit As B4XSearchTemplate";
_searchtemplatenit = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=15466564;
 //BA.debugLineNum = 15466564;BA.debugLine="Private SwiftButtonHacienda As SwiftButton";
_swiftbuttonhacienda = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=15466565;
 //BA.debugLineNum = 15466565;BA.debugLine="Private SearchTemplateHacienda As B4XSearchTempla";
_searchtemplatehacienda = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=15466566;
 //BA.debugLineNum = 15466566;BA.debugLine="Private SwiftButtonLote As SwiftButton";
_swiftbuttonlote = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=15466567;
 //BA.debugLineNum = 15466567;BA.debugLine="Private SearchTemplateLote As B4XSearchTemplate";
_searchtemplatelote = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=15466568;
 //BA.debugLineNum = 15466568;BA.debugLine="Private SwiftButtonLabor As SwiftButton";
_swiftbuttonlabor = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=15466569;
 //BA.debugLineNum = 15466569;BA.debugLine="Private SearchTemplateLabor As B4XSearchTemplate";
_searchtemplatelabor = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=15466570;
 //BA.debugLineNum = 15466570;BA.debugLine="Private SwiftButtonConcepto As SwiftButton";
_swiftbuttonconcepto = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=15466571;
 //BA.debugLineNum = 15466571;BA.debugLine="Private SearchTemplateConcepto As B4XSearchTempla";
_searchtemplateconcepto = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=15466572;
 //BA.debugLineNum = 15466572;BA.debugLine="Private SwiftButtonTurno As SwiftButton";
_swiftbuttonturno = new b4a.example.ef.swiftbutton();
RDebugUtils.currentLine=15466573;
 //BA.debugLineNum = 15466573;BA.debugLine="Private SearchTemplateTurno As B4XSearchTemplate";
_searchtemplateturno = new b4a.example.ef.b4xsearchtemplate();
RDebugUtils.currentLine=15466577;
 //BA.debugLineNum = 15466577;BA.debugLine="End Sub";
return "";
}
public b4a.example.ef.dbrequestmanager  _createrequest(b4a.example.ef.formperson __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "createrequest", false))
	 {return ((b4a.example.ef.dbrequestmanager) Debug.delegate(ba, "createrequest", new Object[] {_db}));}
b4a.example.ef.dbrequestmanager _req = null;
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub CreateRequest (Db As String) As DBRequestManag";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Db)";
_req._initialize /*String*/ (null,ba,this,__ref._rdclink /*String*/ +"?DBName="+_db);
RDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="Return Req";
if (true) return _req;
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="End Sub";
return null;
}
public String  _date_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "date_ondateset", false))
	 {return ((String) Debug.delegate(ba, "date_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Sub Date_OnDateSet (year As Int ,monthOfYear As In";
RDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="Label10.Text=year&\"/\"&(NumberFormat(monthOfYear,2";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Label10.TextColor=Colors.Black";
__ref._label10 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="End Sub";
return "";
}
public String  _deleterecord(b4a.example.ef.formperson __ref,String _nombre) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "deleterecord", false))
	 {return ((String) Debug.delegate(ba, "deleterecord", new Object[] {_nombre}));}
RDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub DeleteRecord (Nombre As String)";
RDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="End Sub";
return "";
}
public String  _edittext1percentage_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext1percentage_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext1percentage_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Private Sub EditText1percentage_TextChanged (Old A";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Log(PorcentageText)";
__c.LogImpl("718219009",__ref._porcentagetext /*String*/ ,0);
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return "";
}
public String  _edittext2horas_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext2horas_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext2horas_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub EditText2horas_TextChanged (Old As Str";
RDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="HorasText = New";
__ref._horastext /*String*/  = _new;
RDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="Log(HorasText)";
__c.LogImpl("718153476",__ref._horastext /*String*/ ,0);
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="End Sub";
return "";
}
public String  _edittext3cantidat_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext3cantidat_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext3cantidat_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Private Sub EditText3cantidat_TextChanged (Old As";
RDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="CantidadText = New";
__ref._cantidadtext /*String*/  = _new;
RDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="Log(CantidadText)";
__c.LogImpl("718284547",__ref._cantidadtext /*String*/ ,0);
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="End Sub";
return "";
}
public String  _edittext4obsv_textchanged(b4a.example.ef.formperson __ref,String _old,String _new) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "edittext4obsv_textchanged", false))
	 {return ((String) Debug.delegate(ba, "edittext4obsv_textchanged", new Object[] {_old,_new}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub EditText4obsv_TextChanged (Old As Stri";
RDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="ObsvText =New";
__ref._obsvtext /*String*/  = _new;
RDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="Log(ObsvText)";
__c.LogImpl("718350083",__ref._obsvtext /*String*/ ,0);
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_clie";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_clientes",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17039364;
 //BA.debugLineNum = 17039364;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17039365;
 //BA.debugLineNum = 17039365;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=17039366;
 //BA.debugLineNum = 17039366;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordclientes"), (Object)(_req));
this.state = 8;
return;
case 8:
//C
this.state = 6;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17039368;
 //BA.debugLineNum = 17039368;BA.debugLine="req.PrintTable(res)";
_req._printtable /*String*/ (null,_res);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17039370;
 //BA.debugLineNum = 17039370;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("717039370","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=17039372;
 //BA.debugLineNum = 17039372;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=17039373;
 //BA.debugLineNum = 17039373;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=16973829;
 //BA.debugLineNum = 16973829;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=16973830;
 //BA.debugLineNum = 16973830;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=16973834;
 //BA.debugLineNum = 16973834;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=16973835;
 //BA.debugLineNum = 16973835;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordhaciendas"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=16973839;
 //BA.debugLineNum = 16973839;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=16973840;
 //BA.debugLineNum = 16973840;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=16973841;
 //BA.debugLineNum = 16973841;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=16973842;
 //BA.debugLineNum = 16973842;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=16973843;
 //BA.debugLineNum = 16973843;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=16973845;
 //BA.debugLineNum = 16973845;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=16973846;
 //BA.debugLineNum = 16973846;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="Spinner2.Add(cadena)";
__ref._spinner2 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=16973852;
 //BA.debugLineNum = 16973852;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("716973852","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=16973854;
 //BA.debugLineNum = 16973854;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=16973855;
 //BA.debugLineNum = 16973855;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_labo";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_labores",(Object[])(parent.__c.Null));
RDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="Dim separador As String";
_separador = "";
RDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="Dim longitud As Int";
_longitud = 0;
RDebugUtils.currentLine=17367048;
 //BA.debugLineNum = 17367048;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17367049;
 //BA.debugLineNum = 17367049;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17367050;
 //BA.debugLineNum = 17367050;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=17367051;
 //BA.debugLineNum = 17367051;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlabores"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17367055;
 //BA.debugLineNum = 17367055;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=17367056;
 //BA.debugLineNum = 17367056;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=17367057;
 //BA.debugLineNum = 17367057;BA.debugLine="separador=\" - \"";
_separador = " - ";
RDebugUtils.currentLine=17367058;
 //BA.debugLineNum = 17367058;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=17367059;
 //BA.debugLineNum = 17367059;BA.debugLine="cadena=cadena & record & separador";
_cadena = _cadena+BA.ObjectToString(_record)+_separador;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 18;
;
RDebugUtils.currentLine=17367061;
 //BA.debugLineNum = 17367061;BA.debugLine="longitud = cadena.Length";
_longitud = _cadena.length();
RDebugUtils.currentLine=17367062;
 //BA.debugLineNum = 17367062;BA.debugLine="cadena=cadena.SubString2(0, longitud - 3)";
_cadena = _cadena.substring((int) (0),(int) (_longitud-3));
RDebugUtils.currentLine=17367063;
 //BA.debugLineNum = 17367063;BA.debugLine="Spinner4.Add(cadena)";
__ref._spinner4 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_cadena);
RDebugUtils.currentLine=17367064;
 //BA.debugLineNum = 17367064;BA.debugLine="cadena=\"\"";
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
RDebugUtils.currentLine=17367068;
 //BA.debugLineNum = 17367068;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("717367068","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=17367070;
 //BA.debugLineNum = 17367070;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=17367071;
 //BA.debugLineNum = 17367071;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Dim req As DBRequestManager = CreateRequest(UseDb";
_req = __ref._createrequest /*b4a.example.ef.dbrequestmanager*/ (null,_usedb);
RDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(_nit),(Object)(_hda)});
RDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Dim cadena As String";
_cadena = "";
RDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="Wait For (req.ExecuteQuery(cmd, 0, id)) JobDone(j";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),(Object)(_id))));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="Wait For (req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "getrecordlotes"), (Object)(_req));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=17301518;
 //BA.debugLineNum = 17301518;BA.debugLine="cadena = \"\"";
_cadena = "";
RDebugUtils.currentLine=17301519;
 //BA.debugLineNum = 17301519;BA.debugLine="For Each record As Object In row";
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
RDebugUtils.currentLine=17301520;
 //BA.debugLineNum = 17301520;BA.debugLine="cadena=record";
_cadena = BA.ObjectToString(_record);
RDebugUtils.currentLine=17301521;
 //BA.debugLineNum = 17301521;BA.debugLine="Spinner3.Add(cadena)";
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
RDebugUtils.currentLine=17301528;
 //BA.debugLineNum = 17301528;BA.debugLine="Log(\"ERROR: \" & j.ErrorMessage)";
parent.__c.LogImpl("717301528","ERROR: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=17301530;
 //BA.debugLineNum = 17301530;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=17301531;
 //BA.debugLineNum = 17301531;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Sub Globals";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Private Panel10Horainicio As Panel ' Tu input o p";
_panel10horainicio = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Private LabelFecha As Label ' Un label para mostr";
_labelfecha = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="End Sub";
return "";
}
public String  _hinicio_ondateset(b4a.example.ef.formperson __ref,int _year,int _monthofyear,int _dayofmonth) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "hinicio_ondateset", false))
	 {return ((String) Debug.delegate(ba, "hinicio_ondateset", new Object[] {_year,_monthofyear,_dayofmonth}));}
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub Hinicio_OnDateSet(year As Int ,monthOfYear As";
RDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Label12Hinicio.Text=year&\"/\"&(NumberFormat(monthO";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(BA.NumberToString(_year)+"/"+(__c.NumberFormat(_monthofyear,(int) (2),(int) (0)))+"/"+__c.NumberFormat(_dayofmonth,(int) (2),(int) (0))));
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Label12Hinicio.TextColor=Colors.Black";
__ref._label12hinicio /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.Black);
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="End Sub";
return "";
}
public String  _insertrecord(b4a.example.ef.formperson __ref,String _nombre,int _salario) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "insertrecord", false))
	 {return ((String) Debug.delegate(ba, "insertrecord", new Object[] {_nombre,_salario}));}
RDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Sub InsertRecord (Nombre As String, Salario As Int";
RDebugUtils.currentLine=17104904;
 //BA.debugLineNum = 17104904;BA.debugLine="End Sub";
return "";
}
public String  _label10_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label10_click", false))
	 {return ((String) Debug.delegate(ba, "label10_click", null));}
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub Label10_Click";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Panel9_Click";
__ref._panel9_click /*String*/ (null);
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="End Sub";
return "";
}
public String  _panel9_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel9_click", false))
	 {return ((String) Debug.delegate(ba, "panel9_click", null));}
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Private Sub Panel9_Click";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Datepicker.Initialize(\"Date\",2022 ,DateTime.GetMo";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .Initialize(ba,"Date",(int) (2022),__c.DateTime.GetMonth(__c.DateTime.getNow()),__c.DateTime.GetDayOfMonth(__c.DateTime.getNow()));
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.1990");
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="Datepicker.SetThemeDark";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetThemeDark();
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="Datepicker.SetMinDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMinDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="Mycalendar.Initialize(\"dd.mm.yyyy\",Mycalendar.PRC";
__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .Initialize(ba,"dd.mm.yyyy",__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .PRC,"2.02.2030");
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="Datepicker.SetMaxDate(Mycalendar)";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetMaxDate((java.util.Calendar)(__ref._mycalendar /*lib.intellvold.datepicker.clander*/ .getObject()));
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="Datepicker.CancelColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelColor(__c.Colors.White);
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="Datepicker.OkColor = Colors.White";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkColor(__c.Colors.White);
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="Datepicker.Title = \"Selecione\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setTitle("Selecione");
RDebugUtils.currentLine=16318474;
 //BA.debugLineNum = 16318474;BA.debugLine="Datepicker.CancelText = \"Cancelar\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setCancelText("Cancelar");
RDebugUtils.currentLine=16318475;
 //BA.debugLineNum = 16318475;BA.debugLine="Datepicker.OkText = \"Ok\"";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .setOkText("Ok");
RDebugUtils.currentLine=16318476;
 //BA.debugLineNum = 16318476;BA.debugLine="Datepicker.SetOnCancel(\"Cancel\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .SetOnCancel("Cancel");
RDebugUtils.currentLine=16318477;
 //BA.debugLineNum = 16318477;BA.debugLine="Datepicker.show2(\"iki\")";
__ref._datepicker /*lib.intellvold.datepicker.DatePicker*/ .show2("iki");
RDebugUtils.currentLine=16318478;
 //BA.debugLineNum = 16318478;BA.debugLine="End Sub";
return "";
}
public String  _label12hinicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label12hinicio_click", false))
	 {return ((String) Debug.delegate(ba, "label12hinicio_click", null));}
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub Label12Hinicio_Click";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Panel12.Visible= True";
__ref._panel12 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="End Sub";
return "";
}
public String  _label13hfim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label13hfim_click", false))
	 {return ((String) Debug.delegate(ba, "label13hfim_click", null));}
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub Label13Hfim_Click";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="Panel13.Visible= True";
__ref._panel13 /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="End Sub";
return "";
}
public String  _label1back_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label1back_click", false))
	 {return ((String) Debug.delegate(ba, "label1back_click", null));}
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub Label1Back_Click";
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="End Sub";
return "";
}
public String  _label2save_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "label2save_click", false))
	 {return ((String) Debug.delegate(ba, "label2save_click", null));}
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Private Sub Label2Save_Click";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="MsgboxAsync(\"Saved.\", \"\")";
__c.MsgboxAsync(BA.ObjectToCharSequence("Saved."),BA.ObjectToCharSequence(""),ba);
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="End Sub";
return "";
}
public String  _panel10horainicio_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel10horainicio_click", false))
	 {return ((String) Debug.delegate(ba, "panel10horainicio_click", null));}
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub Panel10Horainicio_Click";
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="End Sub";
return "";
}
public String  _panel11horafim_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel11horafim_click", false))
	 {return ((String) Debug.delegate(ba, "panel11horafim_click", null));}
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub Panel11horaFim_Click";
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="End Sub";
return "";
}
public String  _panel2time_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "panel2time_click", false))
	 {return ((String) Debug.delegate(ba, "panel2time_click", null));}
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub Panel2Time_Click";
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxconcepto_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxconcepto_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxconcepto_itemclick", new Object[] {_position,_value}));}
String _dstjo_cncpto = "";
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Private Sub SD_xComboBoxConcepto_ItemClick (Positi";
RDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="ConceptoCBX = Null";
__ref._conceptocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="ConceptoCBX = Value";
__ref._conceptocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=18087944;
 //BA.debugLineNum = 18087944;BA.debugLine="Dim dstjo_Cncpto As String = ConceptoDataMap.Get(";
_dstjo_cncpto = BA.ObjectToString(__ref._conceptodatamap /*anywheresoftware.b4a.objects.collections.Map*/ .Get(_value));
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="Log(\"Valor seleccionado: \" & ConceptoCBX)";
__c.LogImpl("718087947","Valor seleccionado: "+__ref._conceptocbx /*String*/ ,0);
RDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="Log(\"Dato dstjo_Cncpto: \" & dstjo_Cncpto)";
__c.LogImpl("718087948","Dato dstjo_Cncpto: "+_dstjo_cncpto,0);
RDebugUtils.currentLine=18087951;
 //BA.debugLineNum = 18087951;BA.debugLine="If dstjo_Cncpto = \"N\" Then ' Ajusta la condición";
if ((_dstjo_cncpto).equals("N")) { 
RDebugUtils.currentLine=18087953;
 //BA.debugLineNum = 18087953;BA.debugLine="EditText3cantidat.Enabled = False";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.False);
 }else {
RDebugUtils.currentLine=18087956;
 //BA.debugLineNum = 18087956;BA.debugLine="EditText3cantidat.Enabled = True";
__ref._edittext3cantidat /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setEnabled(__c.True);
 };
RDebugUtils.currentLine=18087958;
 //BA.debugLineNum = 18087958;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="haciendaCBX = Null";
__ref._haciendacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="haciendaCBX = Value";
__ref._haciendacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="Log(haciendaCBX)";
parent.__c.LogImpl("717891334",__ref._haciendacbx /*String*/ ,0);
RDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="SD_xComboBoxLote.Clear";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=17891336;
 //BA.debugLineNum = 17891336;BA.debugLine="SD_xComboBoxLote.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=17891338;
 //BA.debugLineNum = 17891338;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17891339;
 //BA.debugLineNum = 17891339;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17891340;
 //BA.debugLineNum = 17891340;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lote";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=17891343;
 //BA.debugLineNum = 17891343;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17891346;
 //BA.debugLineNum = 17891346;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17891348;
 //BA.debugLineNum = 17891348;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=17891349;
 //BA.debugLineNum = 17891349;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxhacienda_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17891353;
 //BA.debugLineNum = 17891353;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=17891354;
 //BA.debugLineNum = 17891354;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=17891357;
 //BA.debugLineNum = 17891357;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacien";
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
RDebugUtils.currentLine=17891362;
 //BA.debugLineNum = 17891362;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("717891362","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=17891366;
 //BA.debugLineNum = 17891366;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=17891368;
 //BA.debugLineNum = 17891368;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub SD_xComboBoxLabor_ItemClick (Position";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="LaborCBX = Null";
__ref._laborcbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=18022405;
 //BA.debugLineNum = 18022405;BA.debugLine="LaborCBX = Value";
__ref._laborcbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="Log(LaborCBX)";
__c.LogImpl("718022408",__ref._laborcbx /*String*/ ,0);
RDebugUtils.currentLine=18022409;
 //BA.debugLineNum = 18022409;BA.debugLine="End Sub";
return "";
}
public String  _sd_xcomboboxlote_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "sd_xcomboboxlote_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sd_xcomboboxlote_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Private Sub SD_xComboBoxLote_ItemClick (Position A";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="If Value = \"\" Then";
if ((_value).equals((Object)(""))) { 
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="LoteCBX = Null";
__ref._lotecbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="LoteCBX = Value";
__ref._lotecbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="Log(LoteCBX)";
__c.LogImpl("717956873",__ref._lotecbx /*String*/ ,0);
RDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="nitEmpresaCBX=Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
RDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="SD_xComboBoxHacienda.Clear";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="If Value = \"\" Then";
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
RDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="nitEmpresaCBX = Null";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(parent.__c.Null);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="nitEmpresaCBX = Value";
__ref._nitempresacbx /*String*/  = BA.ObjectToString(_value);
 if (true) break;

case 6:
//C
this.state = 7;
;
RDebugUtils.currentLine=17825802;
 //BA.debugLineNum = 17825802;BA.debugLine="Log(\"Valor seleccionado: \" & nitEmpresaCBX)";
parent.__c.LogImpl("717825802","Valor seleccionado: "+__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=17825804;
 //BA.debugLineNum = 17825804;BA.debugLine="Log(\"Posicion: \"&Position&\" VALUE: \"&Value)";
parent.__c.LogImpl("717825804","Posicion: "+BA.NumberToString(_position)+" VALUE: "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=17825805;
 //BA.debugLineNum = 17825805;BA.debugLine="SD_xComboBoxHacienda.Add(\"----Select----\", \"1\")";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,"----Select----",(Object)("1"));
RDebugUtils.currentLine=17825807;
 //BA.debugLineNum = 17825807;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=17825808;
 //BA.debugLineNum = 17825808;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.pD";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=17825809;
 //BA.debugLineNum = 17825809;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_haci";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{_value});
RDebugUtils.currentLine=17825812;
 //BA.debugLineNum = 17825812;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDone";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=17825815;
 //BA.debugLineNum = 17825815;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=17825817;
 //BA.debugLineNum = 17825817;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=17825818;
 //BA.debugLineNum = 17825818;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "sd_xcomboboxnitperson_itemclick"), (Object)(_req));
this.state = 18;
return;
case 18:
//C
this.state = 10;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=17825822;
 //BA.debugLineNum = 17825822;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=17825823;
 //BA.debugLineNum = 17825823;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=17825824;
 //BA.debugLineNum = 17825824;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=17825827;
 //BA.debugLineNum = 17825827;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_H";
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
RDebugUtils.currentLine=17825832;
 //BA.debugLineNum = 17825832;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("717825832","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 16:
//C
this.state = -1;
;
RDebugUtils.currentLine=17825835;
 //BA.debugLineNum = 17825835;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("717825835",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=17825837;
 //BA.debugLineNum = 17825837;BA.debugLine="j.Release";
_j._release /*String*/ (null);
RDebugUtils.currentLine=17825839;
 //BA.debugLineNum = 17825839;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Private Sub SD_xComboBoxTurno_ItemClick (Position";
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="If Value = Null Or Value = \"\" Then";
if (_value== null || (_value).equals((Object)(""))) { 
RDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="TurnoCBX = Null ' Si el valor está vacío, asigna";
__ref._turnocbx /*String*/  = BA.ObjectToString(__c.Null);
 }else {
RDebugUtils.currentLine=18481157;
 //BA.debugLineNum = 18481157;BA.debugLine="TurnoCBX = Value ' Si no está vacío, asignar el";
__ref._turnocbx /*String*/  = BA.ObjectToString(_value);
 };
RDebugUtils.currentLine=18481159;
 //BA.debugLineNum = 18481159;BA.debugLine="End Sub";
return "";
}
public String  _spinner1_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner1_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner1_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Private Sub Spinner1_ItemClick (Position As Int, V";
RDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="End Sub";
return "";
}
public String  _spinner10_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner10_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner10_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub Spinner10_ItemClick (Position As Int,";
RDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return "";
}
public String  _spinner2_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner2_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner2_itemclick", new Object[] {_position,_value}));}
String _nit = "";
String _hacienda = "";
RDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Sub Spinner2_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="Dim nit As String";
_nit = "";
RDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="Dim hacienda As String";
_hacienda = "";
RDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="Spinner3.Clear";
__ref._spinner3 /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Clear();
RDebugUtils.currentLine=17235974;
 //BA.debugLineNum = 17235974;BA.debugLine="Log(Position & \" - \" & Value)";
__c.LogImpl("717235974",BA.NumberToString(_position)+" - "+BA.ObjectToString(_value),0);
RDebugUtils.currentLine=17235975;
 //BA.debugLineNum = 17235975;BA.debugLine="nit= \"890307964\"";
_nit = "890307964";
RDebugUtils.currentLine=17235976;
 //BA.debugLineNum = 17235976;BA.debugLine="hacienda = Value";
_hacienda = BA.ObjectToString(_value);
RDebugUtils.currentLine=17235977;
 //BA.debugLineNum = 17235977;BA.debugLine="hacienda = hacienda.SubString2(0, 3)";
_hacienda = _hacienda.substring((int) (0),(int) (3));
RDebugUtils.currentLine=17235979;
 //BA.debugLineNum = 17235979;BA.debugLine="GetRecordLotes (\"BDPichucho\",nit, hacienda)";
__ref._getrecordlotes /*void*/ (null,"BDPichucho",_nit,_hacienda);
RDebugUtils.currentLine=17235980;
 //BA.debugLineNum = 17235980;BA.debugLine="End Sub";
return "";
}
public String  _spinner3_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner3_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner3_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Private Sub Spinner3_ItemClick (Position As Int, V";
RDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return "";
}
public String  _spinner4_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner4_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner4_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Private Sub Spinner4_ItemClick (Position As Int, V";
RDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="End Sub";
return "";
}
public String  _spinner7_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner7_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner7_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub Spinner7_ItemClick (Position As Int, V";
RDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="End Sub";
return "";
}
public String  _spinner8_itemclick(b4a.example.ef.formperson __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "spinner8_itemclick", false))
	 {return ((String) Debug.delegate(ba, "spinner8_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub Spinner8_ItemClick (Position As Int, V";
RDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="End Sub";
return "";
}
public String  _swiftbutton1prueba_click(b4a.example.ef.formperson __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="formperson";
if (Debug.shouldDelegate(ba, "swiftbutton1prueba_click", false))
	 {return ((String) Debug.delegate(ba, "swiftbutton1prueba_click", null));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Private Sub SwiftButton1Prueba_Click";
RDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateConce";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonconcepto_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="SwiftButtonConcepto.xLBL.Text = SearchTemplateCo";
__ref._swiftbuttonconcepto /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="Dim CONCEPTOCOMPLETO As String = SearchTemplateC";
_conceptocompleto = __ref._searchtemplateconcepto /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", CONCEP";
_partes = parent.__c.Regex.Split(":",_conceptocompleto);
RDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="ConceptoCBX = Partes(0)";
__ref._conceptocbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Dim ItemsLote As List";
_itemslote = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="ItemsLote.Initialize";
_itemslote.Initialize();
RDebugUtils.currentLine=18677765;
 //BA.debugLineNum = 18677765;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateHacie";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="SwiftButtonHacienda.xLBL.Text = SearchTemplateHa";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="Dim HACIENDACOMPLETO As String = SearchTemplateH";
_haciendacompleto = __ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=18677769;
 //BA.debugLineNum = 18677769;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", HACIEN";
_partes = parent.__c.Regex.Split(":",_haciendacompleto);
RDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="haciendaCBX = Partes(0)";
__ref._haciendacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=18677771;
 //BA.debugLineNum = 18677771;BA.debugLine="ItemsLote.Clear";
_itemslote.Clear();
RDebugUtils.currentLine=18677772;
 //BA.debugLineNum = 18677772;BA.debugLine="ItemsLote.Add(\"Seleccionar:\")";
_itemslote.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18677773;
 //BA.debugLineNum = 18677773;BA.debugLine="SwiftButtonLote.xLBL.Text = \"\"";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18677775;
 //BA.debugLineNum = 18677775;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18677776;
 //BA.debugLineNum = 18677776;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18677777;
 //BA.debugLineNum = 18677777;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_lot";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_lotes",new Object[]{(Object)(__ref._nitempresacbx /*String*/ ),(Object)(__ref._haciendacbx /*String*/ )});
RDebugUtils.currentLine=18677780;
 //BA.debugLineNum = 18677780;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18677783;
 //BA.debugLineNum = 18677783;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=18677785;
 //BA.debugLineNum = 18677785;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=18677786;
 //BA.debugLineNum = 18677786;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonhacienda_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18677790;
 //BA.debugLineNum = 18677790;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=18677791;
 //BA.debugLineNum = 18677791;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=18677794;
 //BA.debugLineNum = 18677794;BA.debugLine="SD_xComboBoxLote.Add(Codg_Hacienda, Codg_Hacie";
__ref._sd_xcomboboxlote /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_codg_hacienda,(Object)(_codg_hacienda));
RDebugUtils.currentLine=18677795;
 //BA.debugLineNum = 18677795;BA.debugLine="ItemsLote.Add(Codg_Hacienda)";
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
RDebugUtils.currentLine=18677800;
 //BA.debugLineNum = 18677800;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("718677800","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=18677802;
 //BA.debugLineNum = 18677802;BA.debugLine="SearchTemplateLote.SetItems(ItemsLote)";
__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemslote);
RDebugUtils.currentLine=18677803;
 //BA.debugLineNum = 18677803;BA.debugLine="SwiftButtonLote.Enabled = True";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=18677805;
 //BA.debugLineNum = 18677805;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=18677808;
 //BA.debugLineNum = 18677808;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLabor";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonlabor_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="SwiftButtonLabor.xLBL.Text = SearchTemplateLabor";
__ref._swiftbuttonlabor /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Dim LABORCOMPLETO As String = SearchTemplateLabo";
_laborcompleto = __ref._searchtemplatelabor /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", LABORC";
_partes = parent.__c.Regex.Split(":",_laborcompleto);
RDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="LaborCBX = Partes(0)";
__ref._laborcbx /*String*/  = _partes[(int) (0)];
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateLote,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonlote_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="SwiftButtonLote.xLBL.Text = SearchTemplateLote.Se";
__ref._swiftbuttonlote /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatelote /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="LoteCBX = SearchTemplateNit.SelectedItem";
__ref._lotecbx /*String*/  = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Dim ItemsHacienda As List";
_itemshacienda = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="ItemsHacienda.Initialize";
_itemshacienda.Initialize();
RDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateNit,";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 15;
return;
case 15:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=18612231;
 //BA.debugLineNum = 18612231;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="SwiftButtonNit.xLBL.Text = SearchTemplateNit.Sel";
__ref._swiftbuttonnit /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
RDebugUtils.currentLine=18612233;
 //BA.debugLineNum = 18612233;BA.debugLine="Dim NITCOMPLETO As String = SearchTemplateNit.Se";
_nitcompleto = __ref._searchtemplatenit /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ;
RDebugUtils.currentLine=18612234;
 //BA.debugLineNum = 18612234;BA.debugLine="Dim Partes() As String = Regex.Split(\":\", NITCOM";
_partes = parent.__c.Regex.Split(":",_nitcompleto);
RDebugUtils.currentLine=18612235;
 //BA.debugLineNum = 18612235;BA.debugLine="nitEmpresaCBX = Partes(0)";
__ref._nitempresacbx /*String*/  = _partes[(int) (0)];
RDebugUtils.currentLine=18612236;
 //BA.debugLineNum = 18612236;BA.debugLine="ItemsHacienda.Clear";
_itemshacienda.Clear();
RDebugUtils.currentLine=18612237;
 //BA.debugLineNum = 18612237;BA.debugLine="ItemsHacienda.Add(\"Seleccionar:\")";
_itemshacienda.Add((Object)("Seleccionar:"));
RDebugUtils.currentLine=18612238;
 //BA.debugLineNum = 18612238;BA.debugLine="SwiftButtonHacienda.xLBL.Text = \"\"";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=18612241;
 //BA.debugLineNum = 18612241;BA.debugLine="Dim Req As DBRequestManager";
_req = new b4a.example.ef.dbrequestmanager();
RDebugUtils.currentLine=18612242;
 //BA.debugLineNum = 18612242;BA.debugLine="Req.Initialize(Me, rdcLink & \"?DBName=\" & Main.p";
_req._initialize /*String*/ (null,ba,parent,__ref._rdclink /*String*/ +"?DBName="+parent._main._pdbname /*String*/ );
RDebugUtils.currentLine=18612243;
 //BA.debugLineNum = 18612243;BA.debugLine="Dim cmd As DBCommand = CreateCommand(\"select_hac";
_cmd = __ref._createcommand /*b4a.example.ef.main._dbcommand*/ (null,"select_haciendas",new Object[]{(Object)(__ref._nitempresacbx /*String*/ )});
RDebugUtils.currentLine=18612246;
 //BA.debugLineNum = 18612246;BA.debugLine="Wait For (Req.ExecuteQuery(cmd, 0, Null)) JobDon";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), (Object)(_req._executequery /*b4a.example.ef.httpjob*/ (null,_cmd,(int) (0),parent.__c.Null)));
this.state = 16;
return;
case 16:
//C
this.state = 4;
_j = (b4a.example.ef.httpjob) result[1];
;
RDebugUtils.currentLine=18612249;
 //BA.debugLineNum = 18612249;BA.debugLine="If j.Success Then";
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
RDebugUtils.currentLine=18612251;
 //BA.debugLineNum = 18612251;BA.debugLine="Req.HandleJobAsync(j, \"req\")";
_req._handlejobasync /*void*/ (null,_j,"req");
RDebugUtils.currentLine=18612252;
 //BA.debugLineNum = 18612252;BA.debugLine="Wait For (Req) req_Result(res As DBResult)";
parent.__c.WaitFor("req_result", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonnit_click"), (Object)(_req));
this.state = 17;
return;
case 17:
//C
this.state = 7;
_res = (b4a.example.ef.main._dbresult) result[1];
;
RDebugUtils.currentLine=18612256;
 //BA.debugLineNum = 18612256;BA.debugLine="For Each row() As Object In res.Rows";
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
RDebugUtils.currentLine=18612257;
 //BA.debugLineNum = 18612257;BA.debugLine="Dim Codg_Hacienda As String = row(0)";
_codg_hacienda = BA.ObjectToString(_row[(int) (0)]);
RDebugUtils.currentLine=18612258;
 //BA.debugLineNum = 18612258;BA.debugLine="Dim NombreHacienda As String = row(1)";
_nombrehacienda = BA.ObjectToString(_row[(int) (1)]);
RDebugUtils.currentLine=18612261;
 //BA.debugLineNum = 18612261;BA.debugLine="SD_xComboBoxHacienda.Add(NombreHacienda, Codg_";
__ref._sd_xcomboboxhacienda /*b4a.example.ef.sd_xcombobox*/ ._add /*String*/ (null,_nombrehacienda,(Object)(_codg_hacienda));
RDebugUtils.currentLine=18612263;
 //BA.debugLineNum = 18612263;BA.debugLine="ItemsHacienda.Add(Codg_Hacienda&\":\"&NombreHaci";
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
RDebugUtils.currentLine=18612268;
 //BA.debugLineNum = 18612268;BA.debugLine="Log(\"Error: \" & j.ErrorMessage)";
parent.__c.LogImpl("718612268","Error: "+_j._errormessage /*String*/ ,0);
 if (true) break;

case 13:
//C
this.state = 14;
;
RDebugUtils.currentLine=18612270;
 //BA.debugLineNum = 18612270;BA.debugLine="SearchTemplateHacienda.SetItems(ItemsHacienda)";
__ref._searchtemplatehacienda /*b4a.example.ef.b4xsearchtemplate*/ ._setitems /*Object*/ (null,_itemshacienda);
RDebugUtils.currentLine=18612271;
 //BA.debugLineNum = 18612271;BA.debugLine="SwiftButtonHacienda.Enabled = True";
__ref._swiftbuttonhacienda /*b4a.example.ef.swiftbutton*/ ._setenabled /*boolean*/ (null,parent.__c.True);
RDebugUtils.currentLine=18612272;
 //BA.debugLineNum = 18612272;BA.debugLine="Log(nitEmpresaCBX)";
parent.__c.LogImpl("718612272",__ref._nitempresacbx /*String*/ ,0);
RDebugUtils.currentLine=18612274;
 //BA.debugLineNum = 18612274;BA.debugLine="j.Release";
_j._release /*String*/ (null);
 if (true) break;

case 14:
//C
this.state = -1;
;
RDebugUtils.currentLine=18612280;
 //BA.debugLineNum = 18612280;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="Wait For (Dialog.ShowTemplate(SearchTemplateTurno";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "formperson", "swiftbuttonturno_click"), __ref._dialog /*b4a.example.ef.b4xdialog*/ ._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(Object)(__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[1];
;
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
RDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="SwiftButtonTurno.xLBL.Text = SearchTemplateTurno";
__ref._swiftbuttonturno /*b4a.example.ef.swiftbutton*/ ._xlbl /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence(__ref._searchtemplateturno /*b4a.example.ef.b4xsearchtemplate*/ ._selecteditem /*String*/ ));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=18939909;
 //BA.debugLineNum = 18939909;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}